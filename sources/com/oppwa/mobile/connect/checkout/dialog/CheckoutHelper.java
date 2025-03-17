package com.oppwa.mobile.connect.checkout.dialog;

import Ba.C6385i;
import G9.C6522c;
import G9.d;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.google.android.gms.security.ProviderInstaller;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.meta.PaymentDetails;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.BillingAddress;
import com.oppwa.mobile.connect.payment.Customer;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentData;
import com.oppwa.mobile.connect.payment.token.Card;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.OppwaInitProvider;
import com.oppwa.mobile.connect.utils.LibraryHelper;
import com.oppwa.mobile.connect.utils.Logger;
import com.samsung.android.sdk.samsungpay.v2.payment.CustomSheetPaymentInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import qE.C14953m;

public class CheckoutHelper {
    private CheckoutHelper() {
    }

    static Token a(String str, Token[] tokenArr) {
        if (tokenArr == null) {
            return null;
        }
        for (Token token : tokenArr) {
            if (token.getPaymentBrand().equals(str) && !a(token)) {
                return token;
            }
            if (str.equalsIgnoreCase("CARD") && !a(token) && token.getCard() != null) {
                return token;
            }
        }
        return null;
    }

    static void b(String str) {
        if (str == null || str.isEmpty()) {
            throw new PaymentException(PaymentError.getPaymentProviderInternalError("Redirect URL is null or empty."));
        }
    }

    public static String getCashAppPayShopperResultUrl() {
        Context requireAppContext = OppwaInitProvider.requireAppContext();
        return requireAppContext.getString(R.string.oppwa_scheme) + "://" + requireAppContext.getPackageName() + "." + requireAppContext.getString(R.string.cash_app) + "." + requireAppContext.getString(R.string.oppwa_host);
    }

    public static String getShopperResultUrl() {
        Context requireAppContext = OppwaInitProvider.requireAppContext();
        return requireAppContext.getString(R.string.oppwa_scheme) + "://" + requireAppContext.getPackageName() + "." + requireAppContext.getString(R.string.oppwa_host);
    }

    public static String getSystemLocale(Context context) {
        return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
    }

    public static void setLocale(Context context, String str) {
        Configuration configuration = context.getResources().getConfiguration();
        String[] split = str.split("_");
        if (split.length == 2) {
            Locale locale = new Locale(split[0], split[1]);
            Locale.setDefault(locale);
            Configuration configuration2 = new Configuration(configuration);
            configuration2.locale = locale;
            context.getResources().updateConfiguration(configuration2, context.getResources().getDisplayMetrics());
        }
    }

    private static String c(GooglePayPaymentData googlePayPaymentData) {
        return (String) Optional.ofNullable(googlePayPaymentData.getPaymentMethodData()).map(new C14103r1()).map(new C14106s1()).orElse((Object) null);
    }

    protected static Customer b(GooglePayPaymentData googlePayPaymentData) {
        String str;
        String str2 = null;
        GooglePayPaymentData.Address address = (GooglePayPaymentData.Address) Optional.ofNullable(googlePayPaymentData.getPaymentMethodData()).map(new S()).map(new C14109t1()).orElse((Object) null);
        GooglePayPaymentData.Address shippingAddress = googlePayPaymentData.getShippingAddress();
        if (address == null && shippingAddress == null && TextUtils.isEmpty(googlePayPaymentData.getEmail())) {
            return null;
        }
        String[] strArr = (String[]) Optional.ofNullable(a(address, shippingAddress, (Function<GooglePayPaymentData.Address, String>) new C14112u1())).map(new C14115v1()).orElse((Object) null);
        if (strArr != null) {
            String str3 = strArr[0];
            if (strArr.length == 2) {
                str2 = strArr[1];
            }
            str = str2;
            str2 = str3;
        } else {
            str = null;
        }
        return new Customer.Builder().setGivenName(str2).setSurname(str).setPhone(a(address, shippingAddress, (Function<GooglePayPaymentData.Address, String>) new C14118w1())).setEmail(googlePayPaymentData.getEmail()).build();
    }

    static void a(Context context, String str, Connect.ProviderMode providerMode) {
        if (LibraryHelper.isPlayServicesBaseAvailable) {
            try {
                ProviderInstaller.a(context);
            } catch (C6522c | d e10) {
                Logger.error(e10);
            }
        }
    }

    static Intent a(Activity activity, ComponentName componentName, PaymentParams paymentParams, C6385i iVar, CustomSheetPaymentInfo customSheetPaymentInfo, List<C14953m> list) {
        Intent intent = new Intent(CheckoutActivity.ACTION_ON_BEFORE_SUBMIT);
        intent.setComponent(componentName);
        intent.setPackage(componentName.getPackageName());
        if (paymentParams.getPaymentBrand() != null) {
            intent.putExtra(CheckoutActivity.EXTRA_PAYMENT_BRAND, paymentParams.getPaymentBrand());
        }
        intent.putExtra(CheckoutActivity.EXTRA_CHECKOUT_ID, paymentParams.getCheckoutId());
        if (iVar != null) {
            intent.putExtra(CheckoutActivity.EXTRA_GOOGLE_PAY_PAYMENT_DATA, iVar);
        }
        if (customSheetPaymentInfo != null) {
            intent.putExtra(CheckoutActivity.EXTRA_SAMSUNG_PAY_PAYMENT_DATA, customSheetPaymentInfo);
        }
        if (list != null && !list.isEmpty()) {
            intent.putParcelableArrayListExtra(CheckoutActivity.EXTRA_THREEDS_WARNINGS, new ArrayList(list));
        }
        intent.putExtra(CheckoutActivity.EXTRA_SENDER_COMPONENT_NAME, new ComponentName(activity.getPackageName(), activity.getClass().getName()));
        return intent;
    }

    static PaymentDetails a(String str, String str2, C6385i iVar, CustomSheetPaymentInfo customSheetPaymentInfo, List<C14953m> list) {
        PaymentDetails paymentDetails = new PaymentDetails(str, str2);
        if (iVar != null) {
            paymentDetails.setGooglePayData(iVar);
        }
        if (customSheetPaymentInfo != null) {
            paymentDetails.setSamsungPayData(customSheetPaymentInfo);
        }
        if (list != null && !list.isEmpty()) {
            paymentDetails.setThreeDS2Warnings(list);
        }
        return paymentDetails;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.oppwa.mobile.connect.payment.BillingAddress} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.oppwa.mobile.connect.payment.Customer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.oppwa.mobile.connect.payment.Customer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.oppwa.mobile.connect.payment.Customer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.oppwa.mobile.connect.payment.BillingAddress} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: com.oppwa.mobile.connect.payment.BillingAddress} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.oppwa.mobile.connect.payment.PaymentParams a(java.lang.String r7, Ba.C6385i r8, java.lang.String r9, java.util.EnumSet<com.oppwa.mobile.connect.checkout.meta.GooglePaySubmitType> r10, boolean r11) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x008e
            java.lang.String r1 = r8.U()
            if (r1 != 0) goto L_0x001c
            Ba.k r10 = r8.F()
            if (r10 == 0) goto L_0x008e
            Ba.k r8 = r8.F()
            java.lang.String r8 = r8.x()
            r2 = r8
            r4 = r0
        L_0x0019:
            r5 = r4
            goto L_0x0091
        L_0x001c:
            com.google.gson.Gson r8 = new com.google.gson.Gson     // Catch:{ p -> 0x004d }
            r8.<init>()     // Catch:{ p -> 0x004d }
            java.lang.Class<com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentData> r2 = com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentData.class
            java.lang.Object r8 = r8.n(r1, r2)     // Catch:{ p -> 0x004d }
            com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentData r8 = (com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentData) r8     // Catch:{ p -> 0x004d }
            if (r8 == 0) goto L_0x008e
            java.lang.String r1 = c((com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentData) r8)     // Catch:{ p -> 0x004d }
            java.util.Optional r1 = java.util.Optional.ofNullable(r1)     // Catch:{ p -> 0x004d }
            com.oppwa.mobile.connect.checkout.dialog.q1 r2 = new com.oppwa.mobile.connect.checkout.dialog.q1     // Catch:{ p -> 0x004d }
            r2.<init>()     // Catch:{ p -> 0x004d }
            java.lang.Object r1 = r1.orElseThrow(r2)     // Catch:{ p -> 0x004d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ p -> 0x004d }
            if (r10 == 0) goto L_0x0060
            com.oppwa.mobile.connect.checkout.meta.GooglePaySubmitType r2 = com.oppwa.mobile.connect.checkout.meta.GooglePaySubmitType.BILLING     // Catch:{ p -> 0x004d }
            boolean r2 = r10.contains(r2)     // Catch:{ p -> 0x004d }
            if (r2 == 0) goto L_0x004f
            com.oppwa.mobile.connect.payment.BillingAddress r2 = a((com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentData) r8)     // Catch:{ p -> 0x004d }
            goto L_0x0050
        L_0x004d:
            r7 = move-exception
            goto L_0x0063
        L_0x004f:
            r2 = r0
        L_0x0050:
            com.oppwa.mobile.connect.checkout.meta.GooglePaySubmitType r3 = com.oppwa.mobile.connect.checkout.meta.GooglePaySubmitType.CUSTOMER     // Catch:{ p -> 0x004d }
            boolean r10 = r10.contains(r3)     // Catch:{ p -> 0x004d }
            if (r10 == 0) goto L_0x005c
            com.oppwa.mobile.connect.payment.Customer r0 = b((com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentData) r8)     // Catch:{ p -> 0x004d }
        L_0x005c:
            r5 = r0
            r4 = r2
        L_0x005e:
            r2 = r1
            goto L_0x0091
        L_0x0060:
            r4 = r0
            r5 = r4
            goto L_0x005e
        L_0x0063:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Failed to parse Google Pay response json."
            r8.append(r9)
            java.lang.String r9 = r7.getMessage()
            if (r9 == 0) goto L_0x0078
            java.lang.String r7 = r7.getMessage()
            goto L_0x007a
        L_0x0078:
            java.lang.String r7 = ""
        L_0x007a:
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.oppwa.mobile.connect.exception.PaymentException r8 = new com.oppwa.mobile.connect.exception.PaymentException
            com.oppwa.mobile.connect.exception.PaymentError r9 = new com.oppwa.mobile.connect.exception.PaymentError
            com.oppwa.mobile.connect.exception.ErrorCode r10 = com.oppwa.mobile.connect.exception.ErrorCode.ERROR_CODE_GOOGLEPAY
            r9.<init>((com.oppwa.mobile.connect.exception.ErrorCode) r10, (java.lang.String) r7)
            r8.<init>(r9)
            throw r8
        L_0x008e:
            r2 = r0
            r4 = r2
            goto L_0x0019
        L_0x0091:
            if (r11 == 0) goto L_0x009e
            com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentParams r8 = new com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentParams
            java.lang.String r6 = "GOOGLEPAYTKN"
            r0 = r8
            r1 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        L_0x009e:
            com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentParams r8 = new com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentParams
            r0 = r8
            r1 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.checkout.dialog.CheckoutHelper.a(java.lang.String, Ba.i, java.lang.String, java.util.EnumSet, boolean):com.oppwa.mobile.connect.payment.PaymentParams");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException a() {
        return new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_GOOGLEPAY, "Google Pay payment token is null in json response."));
    }

    static String a(GooglePayPaymentData.Address address, GooglePayPaymentData.Address address2, Function<GooglePayPaymentData.Address, String> function) {
        String str = (String) Optional.ofNullable(address).map(function).orElse((Object) null);
        return TextUtils.isEmpty(str) ? (String) Optional.ofNullable(address2).map(function).orElse((Object) null) : str;
    }

    private static BillingAddress a(GooglePayPaymentData googlePayPaymentData) {
        return (BillingAddress) Optional.ofNullable(googlePayPaymentData.getPaymentMethodData()).map(new S()).map(new C14109t1()).map(new C14121x1()).orElse((Object) null);
    }

    private static String a(GooglePayPaymentData.Address address) {
        if (TextUtils.isEmpty(address.getAddress2())) {
            return null;
        }
        String address2 = address.getAddress2();
        if (TextUtils.isEmpty(address.getAddress3())) {
            return address2;
        }
        return address2 + ", " + address.getAddress3();
    }

    private static boolean a(Token token) {
        if (token == null || token.getCard() == null) {
            return false;
        }
        Card card = token.getCard();
        return CardPaymentParams.isCardExpired(card.getExpiryMonth(), card.getExpiryYear());
    }
}
