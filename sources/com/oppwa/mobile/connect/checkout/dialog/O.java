package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.checkout.meta.SamsungPayConfig;
import com.samsung.android.sdk.samsungpay.v2.payment.CardInfo;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.CustomSheet;
import java.util.function.Consumer;

public final /* synthetic */ class O implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardInfo f121033a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CustomSheet f121034b;

    public /* synthetic */ O(CardInfo cardInfo, CustomSheet customSheet) {
        this.f121033a = cardInfo;
        this.f121034b = customSheet;
    }

    public final void accept(Object obj) {
        ((SamsungPayConfig.CardInfoUpdateListener) obj).onCardInfoUpdated(this.f121033a, this.f121034b);
    }
}
