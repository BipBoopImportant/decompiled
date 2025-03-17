package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.HashMap;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.x  reason: case insensitive filesystem */
class C14119x {

    /* renamed from: a  reason: collision with root package name */
    private static final String f121351a = "com.oppwa.mobile.connect.checkout.dialog.x";

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, Class<?>> f121352b;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.x$a */
    class a extends HashMap<String, Class<?>> {
        a() {
            put(CheckoutConstants.PaymentBrands.DIRECTDEBIT_SEPA, DirectDebitSepaPaymentInfoFragment.class);
            put(CheckoutConstants.PaymentBrands.CHINAUNIONPAY, ChinaUnionPayPaymentInfoFragment.class);
            put(CheckoutConstants.PaymentBrands.SOFORTUEBERWEISUNG, SofortPaymentInfoFragment.class);
            put(CheckoutConstants.PaymentBrands.IDEAL, IdealPaymentInfoFragment.class);
            put(CheckoutConstants.PaymentBrands.GIROPAY, GiropayPaymentInfoFragment.class);
            Class<KlarnaPaymentInfoFragment> cls = KlarnaPaymentInfoFragment.class;
            put(CheckoutConstants.PaymentBrands.KLARNA_INVOICE, cls);
            put(CheckoutConstants.PaymentBrands.KLARNA_INSTALLMENTS, cls);
            Class<KlarnaInlinePaymentInfoFragment> cls2 = KlarnaInlinePaymentInfoFragment.class;
            put(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_PAYLATER, cls2);
            put(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_PAYNOW, cls2);
            put(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_SLICEIT, cls2);
            put(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_ONE, cls2);
            put(CheckoutConstants.PaymentBrands.MBWAY, MBWayPaymentInfoFragment.class);
            Class<IkanoOiPaymentInfoFragment> cls3 = IkanoOiPaymentInfoFragment.class;
            put(CheckoutConstants.PaymentBrands.IKANOOI_FI, cls3);
            put(CheckoutConstants.PaymentBrands.IKANOOI_NO, cls3);
            put(CheckoutConstants.PaymentBrands.IKANOOI_SE, cls3);
            put(CheckoutConstants.PaymentBrands.IKANO_PRIVATE_LABEL_VA, IkanoPrivateLabelVAPaymentInfoFragment.class);
            put(CheckoutConstants.PaymentBrands.STC_PAY, STCPayPaymentInfoFragment.class);
            put(CheckoutConstants.PaymentBrands.RATEPAY_INVOICE, RatePayPaymentInfoFragment.class);
            put(CheckoutConstants.PaymentBrands.ACI_INSTANTPAY, AciInstantPayPaymentInfoFragment.class);
            put(CheckoutConstants.PaymentBrands.BLIK, BlikPaymentInfoFragment.class);
        }
    }

    static PaymentInfoFragment a(String str, boolean z10) {
        if (z10) {
            return new CardPaymentInfoFragment();
        }
        Class cls = a().get(str);
        if (cls == null) {
            return null;
        }
        try {
            return (PaymentInfoFragment) cls.newInstance();
        } catch (Exception e10) {
            String str2 = f121351a;
            Logger.error(str2, "Failed to create fragment instance for " + cls.getName(), e10);
            throw new PaymentException(PaymentError.getUnexpectedExceptionError(e10));
        }
    }

    static boolean a(String str) {
        return a().get(str) != null && !CheckoutConstants.PaymentBrands.b(str);
    }

    private static HashMap<String, Class<?>> a() {
        if (f121352b == null) {
            f121352b = new a();
        }
        return f121352b;
    }
}
