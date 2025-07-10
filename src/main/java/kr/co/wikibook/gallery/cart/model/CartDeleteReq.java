package kr.co.wikibook.gallery.cart.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.BindParam;

@Getter
@AllArgsConstructor

public class CartDeleteReq {
    private int cartId;
    private int memberId;

    public CartDeleteReq(@BindParam("cart_id") int cartId) {
        this.cartId = cartId;
    }
}
