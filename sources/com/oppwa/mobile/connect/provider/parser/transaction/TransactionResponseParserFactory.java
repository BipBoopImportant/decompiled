package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.utils.LibraryHelper;
import java.util.HashMap;
import java.util.Map;

public class TransactionResponseParserFactory {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Class<? extends TransactionResponseParser>> f122082a;

    static {
        HashMap hashMap = new HashMap();
        f122082a = hashMap;
        Class<C14180b> cls = C14180b.class;
        hashMap.put(CheckoutConstants.PaymentBrands.AFTERPAY_PACIFIC, cls);
        hashMap.put(CheckoutConstants.PaymentBrands.BANCONTACT_LINK, C14182d.class);
        Class<h> cls2 = h.class;
        hashMap.put("BOLETO", cls2);
        hashMap.put(CheckoutConstants.PaymentBrands.CLEARPAY, cls);
        Class<g> cls3 = g.class;
        hashMap.put(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_PAYLATER, cls3);
        hashMap.put(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_PAYNOW, cls3);
        hashMap.put(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_SLICEIT, cls3);
        hashMap.put(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_ONE, cls3);
        hashMap.put("MASTERPASS", cls2);
        hashMap.put("VIPPS", cls2);
        hashMap.put(CheckoutConstants.PaymentBrands.CASH_APP_PAY, C14183e.class);
        hashMap.put(CheckoutConstants.PaymentBrands.AMAZONPAY, C14181c.class);
        hashMap.put("MOBILEPAY", cls2);
    }

    private static boolean a(Class<? extends TransactionResponseParser> cls) {
        return cls == g.class && !LibraryHelper.isKlarnaAvailable;
    }

    public static TransactionResponseParser createParser(String str) {
        Class cls = f122082a.get(str);
        if (cls == null) {
            return new f();
        }
        if (a(cls)) {
            return new f();
        }
        try {
            return (TransactionResponseParser) cls.newInstance();
        } catch (Exception e10) {
            throw new IllegalStateException("Fail to instantiate parser", e10);
        }
    }
}
