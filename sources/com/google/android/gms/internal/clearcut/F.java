package com.google.android.gms.internal.clearcut;

final class F {

    /* renamed from: a  reason: collision with root package name */
    private final M f48191a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f48192b;

    private F(int i10) {
        byte[] bArr = new byte[i10];
        this.f48192b = bArr;
        this.f48191a = M.S(bArr);
    }

    public final A a() {
        if (this.f48191a.u() == 0) {
            return new H(this.f48192b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final M b() {
        return this.f48191a;
    }

    /* synthetic */ F(int i10, B b10) {
        this(i10);
    }
}
