package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.c1  reason: case insensitive filesystem */
final class C7175c1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f48349a;

    /* renamed from: b  reason: collision with root package name */
    private int f48350b = 0;

    C7175c1(String str) {
        this.f48349a = str;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.f48350b < this.f48349a.length();
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        String str = this.f48349a;
        int i10 = this.f48350b;
        this.f48350b = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        char c10 = charAt & 8191;
        int i11 = 13;
        while (true) {
            String str2 = this.f48349a;
            int i12 = this.f48350b;
            this.f48350b = i12 + 1;
            char charAt2 = str2.charAt(i12);
            if (charAt2 < 55296) {
                return c10 | (charAt2 << i11);
            }
            c10 |= (charAt2 & 8191) << i11;
            i11 += 13;
        }
    }
}
