package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.os.Bundle;
import com.samsung.android.sdk.samsungpay.v2.PartnerInfo;
import com.samsung.android.sdk.samsungpay.v2.SamsungPay;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import com.samsung.android.sdk.samsungpay.v2.payment.PaymentManager;

public class SamsungPayHelper {
    private static PartnerInfo a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("PartnerServiceType", SpaySdk.ServiceType.INAPP_PAYMENT.toString());
        return new PartnerInfo(str, bundle);
    }

    public static PaymentManager getPaymentManager(Context context, String str) {
        return new PaymentManager(context, a(str));
    }

    public static SamsungPay getSamsungPay(Context context, String str) {
        return new SamsungPay(context, a(str));
    }
}
