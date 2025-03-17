package com.oppwa.mobile.connect.checkout.meta;

import com.samsung.android.sdk.samsungpay.v2.payment.CardInfo;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public final /* synthetic */ class u implements Function {
    public final Object apply(Object obj) {
        return Integer.valueOf(Objects.hash(new Object[]{((CardInfo) obj).getCardId(), ((CardInfo) obj).getBrand()}) + ((Integer) Optional.ofNullable(((CardInfo) obj).getCardMetaData()).map(new x()).orElse(0)).intValue());
    }
}
