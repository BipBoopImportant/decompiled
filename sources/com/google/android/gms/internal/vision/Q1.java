package com.google.android.gms.internal.vision;

final class Q1 implements C7551y1 {

    /* renamed from: a  reason: collision with root package name */
    private final A1 f49259a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49260b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f49261c;

    /* renamed from: d  reason: collision with root package name */
    private final int f49262d;

    Q1(A1 a12, String str, Object[] objArr) {
        this.f49259a = a12;
        this.f49260b = str;
        this.f49261c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f49262d = charAt;
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
                this.f49262d = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return this.f49260b;
    }

    /* access modifiers changed from: package-private */
    public final Object[] b() {
        return this.f49261c;
    }

    public final int zza() {
        return (this.f49262d & 1) == 1 ? O1.f49236a : O1.f49237b;
    }

    public final boolean zzb() {
        return (this.f49262d & 2) == 2;
    }

    public final A1 zzc() {
        return this.f49259a;
    }
}
