package com.google.android.gms.internal.measurement;

final class I5 implements C7391q5 {

    /* renamed from: a  reason: collision with root package name */
    private final C7406s5 f48683a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48684b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f48685c;

    /* renamed from: d  reason: collision with root package name */
    private final int f48686d;

    I5(C7406s5 s5Var, String str, Object[] objArr) {
        this.f48683a = s5Var;
        this.f48684b = str;
        this.f48685c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f48686d = charAt;
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
                this.f48686d = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return this.f48684b;
    }

    /* access modifiers changed from: package-private */
    public final Object[] b() {
        return this.f48685c;
    }

    public final C7406s5 zza() {
        return this.f48683a;
    }

    public final H5 zzb() {
        int i10 = this.f48686d;
        return (i10 & 1) != 0 ? H5.PROTO2 : (i10 & 4) == 4 ? H5.EDITIONS : H5.PROTO3;
    }

    public final boolean zzc() {
        return (this.f48686d & 2) == 2;
    }
}
