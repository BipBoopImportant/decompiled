package com.oppwa.mobile.connect.utils;

import java.util.Optional;

enum a {
    CARD_IO("CardIO", "io.card.payment.CardIOActivity", new x()),
    GOOGLE_PLAY_SERVICES_BASE("Google Play Services", "com.google.android.gms.security.ProviderInstaller"),
    GOOGLE_PLAY_SERVICES_WALLET("Google Play Wallet", "com.google.android.gms.wallet.PaymentsClient"),
    IOVATION("FraudForce", "com.iovation.mobile.android.FraudForceManager"),
    KLARNA("Klarna", "com.klarna.mobile.sdk.api.payments.KlarnaPaymentView"),
    THREEDS_IPWORKS("ThreeDS2 IPWorks", "com.nsoftware.ipworks3ds.sdk.ThreeDS2Service"),
    f122186j("Samsung Pay", "com.samsung.android.sdk.samsungpay.v2.SamsungPay", new y()),
    f122187k("Afterpay Pacific", "com.afterpay.android.Afterpay"),
    f122188l("CashAppPay", "app.cash.paykit.core.CashAppPay"),
    f122189m("Affirm", "com.affirm.android.Affirm");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f122191a;

    /* renamed from: b  reason: collision with root package name */
    private String f122192b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f122193c;

    private a(String str, String str2) {
        this(r7, r8, str, str2, (b) null);
    }

    public String a() {
        return this.f122191a;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f122192b;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f122193c;
    }

    private a(String str, String str2, b bVar) {
        this.f122191a = str;
        boolean a10 = a(str2);
        this.f122193c = a10;
        if (a10) {
            try {
                this.f122192b = (String) Optional.ofNullable(bVar).map(new z()).orElse((Object) null);
            } catch (Error | Exception e10) {
                Logger.error(e10);
            }
        }
    }

    private boolean a(String str) {
        Class<?> cls;
        try {
            cls = Class.forName(str, false, a.class.getClassLoader());
        } catch (Exception unused) {
            cls = null;
        }
        return cls != null;
    }
}
