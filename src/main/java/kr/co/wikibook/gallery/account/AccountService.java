package kr.co.wikibook.gallery.account;

import kr.co.wikibook.gallery.account.model.AccountJoinReq;
import kr.co.wikibook.gallery.account.model.AccountLoginReq;
import kr.co.wikibook.gallery.account.model.AccountLoginRes;
import kr.co.wikibook.gallery.common.util.HttpUtils;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Slf4j //log
@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountMapper accountMapper;

    public int join(AccountJoinReq req) {
        String hashedPw = BCrypt.hashpw(req.getLoginPw(), BCrypt.gensalt());
        // 암호화가 된 비민번호를 갖는 AccountJoinReq 객체를 만들어주세요.(아이디, 이름 갖고 있고)
            AccountJoinReq changedReq = new AccountJoinReq(
                                        req.getName(), req.getLoginId(), hashedPw
                                        );
            return accountMapper.save(changedReq); // 암호화된
    }

    public AccountLoginRes login(AccountLoginReq req) {
        AccountLoginRes res = accountMapper.findByLoginId(req);
        // 아이디가 없거나 비밀번호가 다르면 비밀번호 체크
        if(res == null || !BCrypt.checkpw(req.getLoginPw(), res.getLoginPw())) {
            return null; // return null; 처리
        }
        return res;
    }

}










