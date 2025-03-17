package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j4  reason: case insensitive filesystem */
final class C7330j4 {

    /* renamed from: a  reason: collision with root package name */
    private final C7405s4 f48982a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f48983b;

    public final C7276d4 a() {
        this.f48982a.I();
        return new C7348l4(this.f48983b);
    }

    public final C7405s4 b() {
        return this.f48982a;
    }

    private C7330j4(int i10) {
        byte[] bArr = new byte[i10];
        this.f48983b = bArr;
        this.f48982a = C7405s4.H(bArr);
    }
}
