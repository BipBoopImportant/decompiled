package com.oppwa.mobile.connect.provider;

/* renamed from: com.oppwa.mobile.connect.provider.b  reason: case insensitive filesystem */
class C14152b {

    /* renamed from: b  reason: collision with root package name */
    private static C14152b f122003b;

    /* renamed from: a  reason: collision with root package name */
    private OppPaymentProvider f122004a;

    private C14152b() {
    }

    static C14152b a() {
        if (f122003b == null) {
            f122003b = new C14152b();
        }
        return f122003b;
    }

    /* access modifiers changed from: package-private */
    public OppPaymentProvider b() {
        return this.f122004a;
    }

    /* access modifiers changed from: package-private */
    public void a(OppPaymentProvider oppPaymentProvider) {
        this.f122004a = oppPaymentProvider;
    }
}
