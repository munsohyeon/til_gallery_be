package kr.co.wikibook.gallery.account.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

@Getter
public class AccountLoginRes {
    private int id;
    @JsonIgnore // json으로 만들어질 때 알아서 빠진다
    private String loginPw;
}
