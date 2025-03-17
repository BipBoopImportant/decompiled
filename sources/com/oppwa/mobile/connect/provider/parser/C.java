package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CartItem;
import com.oppwa.mobile.connect.provider.model.response.CheckoutDataResponse;
import java.util.function.Function;

public final /* synthetic */ class C implements Function {
    public final Object apply(Object obj) {
        return new CartItem.Builder().setName(((CheckoutDataResponse.CartItem) obj).getName()).setQuantity(((CheckoutDataResponse.CartItem) obj).getQuantity()).setPrice(((CheckoutDataResponse.CartItem) obj).getPrice()).setProductUrl(((CheckoutDataResponse.CartItem) obj).getProductUrl()).setImageUrl(((CheckoutDataResponse.CartItem) obj).getImageUrl()).setSku(((CheckoutDataResponse.CartItem) obj).getSku()).setTotalDiscountAmount(((CheckoutDataResponse.CartItem) obj).getTotalDiscountAmount());
    }
}
