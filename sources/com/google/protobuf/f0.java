package com.google.protobuf;

final class f0 implements P {

    /* renamed from: a  reason: collision with root package name */
    private final S f69282a;

    /* renamed from: b  reason: collision with root package name */
    private final String f69283b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f69284c;

    /* renamed from: d  reason: collision with root package name */
    private final int f69285d;

    f0(S s10, String str, Object[] objArr) {
        this.f69282a = s10;
        this.f69283b = str;
        this.f69284c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f69285d = charAt;
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
                this.f69285d = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public boolean a() {
        return (this.f69285d & 2) == 2;
    }

    public S b() {
        return this.f69282a;
    }

    public c0 c() {
        int i10 = this.f69285d;
        return (i10 & 1) != 0 ? c0.PROTO2 : (i10 & 4) == 4 ? c0.EDITIONS : c0.PROTO3;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f69284c;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f69283b;
    }
}
