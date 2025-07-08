package kr.co.wikibook.gallery.account.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 자동 생성자 생성

public class AccountJoinReq {
    private String name;
    private String loginId;
    private String loginPw;
}
