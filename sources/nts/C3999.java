package nts;

/* renamed from: nts.ᦂ  reason: contains not printable characters */
public class C3999 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f2657 = ((int) C3727.m1081());

    /* renamed from: ગ  reason: contains not printable characters */
    public int f2658;

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4000[] f2659 = new C4000[32];

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f2660 = 31;

    /* renamed from: nts.ᦂ$ഇ  reason: contains not printable characters */
    public class C4000 {

        /* renamed from: ગ  reason: contains not printable characters */
        public int f2661;

        /* renamed from: ഇ  reason: contains not printable characters */
        public String f2662;

        /* renamed from: ᐳ  reason: contains not printable characters */
        public C4000 f2663;

        public C4000(C3999 r12, String str, int i10, C4000 r42) {
            this.f2662 = str;
            this.f2661 = i10;
            this.f2663 = r42;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public String m2461(StringBuilder sb2, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        int i13 = this.f2657 + i12;
        int charAt = i13 + (sb2.charAt(i10) ^ (i13 << 7));
        for (int i14 = i10 + 1; i14 < i11; i14++) {
            charAt += sb2.charAt(i14) ^ (charAt << 7);
        }
        int i15 = charAt - (charAt >> 17);
        int i16 = i15 - (i15 >> 11);
        int i17 = i16 - (i16 >> 5);
        C4000 r22 = this.f2659[this.f2660 & i17];
        while (true) {
            int i18 = 0;
            if (r22 != null) {
                if (r22.f2661 == i17) {
                    String str = r22.f2662;
                    if (i12 != str.length()) {
                        continue;
                    } else {
                        while (i18 < i12) {
                            if (str.charAt(i18) == sb2.charAt(i10 + i18)) {
                                i18++;
                            }
                        }
                        return r22.f2662;
                    }
                }
                r22 = r22.f2663;
            } else {
                String substring = sb2.substring(i10, i11);
                int i19 = this.f2660;
                int i20 = i17 & i19;
                C4000[] r23 = this.f2659;
                r23[i20] = new C4000(this, substring, i17, r23[i20]);
                int i21 = this.f2658;
                this.f2658 = i21 + 1;
                if (i21 == i19) {
                    int i22 = i19 << 1;
                    int i23 = i22 + 1;
                    C4000[] r92 = new C4000[(i22 + 2)];
                    while (i18 < r23.length) {
                        C4000 r02 = r23[i18];
                        while (r02 != null) {
                            int i24 = r02.f2661 & i23;
                            C4000 r42 = r02.f2663;
                            r02.f2663 = r92[i24];
                            r92[i24] = r02;
                            r02 = r42;
                        }
                        i18++;
                    }
                    this.f2659 = r92;
                    this.f2660 = i23;
                }
                return substring;
            }
        }
    }
}
