package com.oppwa.mobile.connect.checkout.dialog;

public class CheckoutConstants {
    public static final String DEFAULT_ACI_INSTANT_PAY_COUNTRY = "US";
    public static final String ENDPOINT_OMNITOKEN = "/omnitoken";
    public static final String ENDPOINT_PAYMENT = "/payment";
    public static final String ENDPOINT_REGISTRATION = "/registration";

    public static class PaymentBrands {
        public static final String ACI_INSTANTPAY = "ACI_INSTANTPAY";
        public static final String AFFIRM = "AFFIRM";
        public static final String AFTERPAY_PACIFIC = "AFTERPAY_PACIFIC";
        public static final String AMAZONPAY = "AMAZONPAY";
        public static final String AMEX = "AMEX";
        public static final String APPLEPAY = "APPLEPAY";
        public static final String BANCONTACT_LINK = "BANCONTACT_LINK";
        public static final String BLIK = "BLIK";
        public static final String CARD = "CARD";
        public static final String CASH_APP_PAY = "CASH_APP_PAY";
        public static final String CHINAUNIONPAY = "CHINAUNIONPAY";
        public static final String CLEARPAY = "CLEARPAY";
        public static final String DANKORT = "DANKORT";
        public static final String DIRECTDEBIT_SEPA = "DIRECTDEBIT_SEPA";
        public static final String GIROPAY = "GIROPAY";
        public static final String GOOGLEPAY = "GOOGLEPAY";
        public static final String GOOGLEPAYTKN = "GOOGLEPAYTKN";
        public static final String IDEAL = "IDEAL";
        public static final String IKANOOI_FI = "IKANOOI_FI";
        public static final String IKANOOI_NO = "IKANOOI_NO";
        public static final String IKANOOI_SE = "IKANOOI_SE";
        public static final String IKANO_PRIVATE_LABEL_VA = "IK_PRIVATE_LABEL_VA";
        public static final String INICIS = "INICIS";
        public static final String KLARNA_INSTALLMENTS = "KLARNA_INSTALLMENTS";
        public static final String KLARNA_INVOICE = "KLARNA_INVOICE";
        public static final String KLARNA_PAYMENTS_ONE = "KLARNA_PAYMENTS_ONE";
        public static final String KLARNA_PAYMENTS_PAYLATER = "KLARNA_PAYMENTS_PAYLATER";
        public static final String KLARNA_PAYMENTS_PAYNOW = "KLARNA_PAYMENTS_PAYNOW";
        public static final String KLARNA_PAYMENTS_SLICEIT = "KLARNA_PAYMENTS_SLICEIT";
        public static final String MBWAY = "MBWAY";
        public static final String ONEY = "ONEY";
        public static final String PAYPAL = "PAYPAL";
        public static final String PAYTRAIL = "PAYTRAIL";
        public static final String RATEPAY_INVOICE = "RATEPAY_INVOICE";
        public static final String SAMSUNGPAY = "SAMSUNGPAY";
        public static final String SOFORTUEBERWEISUNG = "SOFORTUEBERWEISUNG";
        public static final String STC_PAY = "STC_PAY";

        static boolean a(String str) {
            return str != null && (str.equals(AFTERPAY_PACIFIC) || str.equals(CLEARPAY));
        }

        static boolean b(String str) {
            return str != null && (str.equals(KLARNA_PAYMENTS_PAYLATER) || str.equals(KLARNA_PAYMENTS_PAYNOW) || str.equals(KLARNA_PAYMENTS_SLICEIT) || str.equals(KLARNA_PAYMENTS_ONE));
        }
    }
}
