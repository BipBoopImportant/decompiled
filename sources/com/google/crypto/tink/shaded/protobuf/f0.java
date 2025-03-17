package com.google.crypto.tink.shaded.protobuf;

final class f0 implements P {

    /* renamed from: a  reason: collision with root package name */
    private final S f67983a;

    /* renamed from: b  reason: collision with root package name */
    private final String f67984b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f67985c;

    /* renamed from: d  reason: collision with root package name */
    private final int f67986d;

    f0(S s10, String str, Object[] objArr) {
        this.f67983a = s10;
        this.f67984b = str;
        this.f67985c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f67986d = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.f67986d = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public boolean a() {
        return (this.f67986d & 2) == 2;
    }

    public S b() {
        return this.f67983a;
    }

    public c0 c() {
        return (this.f67986d & 1) == 1 ? c0.PROTO2 : c0.PROTO3;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f67985c;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f67984b;
    }
}
