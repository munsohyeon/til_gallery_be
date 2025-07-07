package kr.co.wikibook.gallery.account;

import kr.co.wikibook.gallery.item.ItemMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j //log
@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountMapper accountMapper;
}
