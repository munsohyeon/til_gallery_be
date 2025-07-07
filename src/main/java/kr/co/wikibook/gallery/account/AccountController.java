package kr.co.wikibook.gallery.account;

import kr.co.wikibook.gallery.account.model.AccountLoginReq;
import kr.co.wikibook.gallery.account.model.AccountLoginRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // log
@RestController// 서비스와 연동
@RequestMapping("/api/v1/member")
@RequiredArgsConstructor // final @nonnull 붙은 필드에 생성자 생성해 주는 역할
public class AccountController {
    private final AccountService accountService;

    @GetMapping
    public AccountLoginRes findByLoginId(AccountLoginReq req) {
        log.info("req={}", req);
        return 0;
    }
}
