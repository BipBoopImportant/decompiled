package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.checkout.uicomponent.meta.UiComponentType;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.utils.FeatureSwitch;
import java.util.Optional;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.c0  reason: case insensitive filesystem */
class C14057c0 {
    public static UiComponentType a(String str, Token token, boolean z10) {
        if (token != null) {
            if (token.getCard() != null) {
                return UiComponentType.CARD_TOKEN;
            }
            if (token.getBankAccount() != null) {
                return UiComponentType.BANK_ACCOUNT_TOKEN;
            }
        }
        if (z10) {
            return UiComponentType.CARD;
        }
        return UiComponentType.getByName(str);
    }

    public static String a(UiComponentType uiComponentType, CheckoutSettings checkoutSettings) {
        return (String) Optional.ofNullable(checkoutSettings).map(new o2()).map(new p2(uiComponentType)).orElseGet(new q2(uiComponentType));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(UiComponentType uiComponentType) {
        if (FeatureSwitch.isActivated(FeatureSwitch.DEFAULT_UI_COMPONENTS)) {
            return (String) Optional.ofNullable(C14061d0.a(uiComponentType)).map(new n2()).orElse((Object) null);
        }
        return null;
    }
}
