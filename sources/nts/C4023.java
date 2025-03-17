package nts;

/* renamed from: nts.ᮗ  reason: contains not printable characters */
public class C4023 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public static int[] f2745 = new int[32];

    /* renamed from: ગ  reason: contains not printable characters */
    public static int[] f2746 = new int[29];

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int[] f2747 = new int[29];

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static int[] f2748 = new int[32];

    /* renamed from: Е  reason: contains not printable characters */
    public int f2749 = 0;

    /* renamed from: и  reason: contains not printable characters */
    public int f2750;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f2751 = 0;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C4218 f2752;

    /* renamed from: ખ  reason: contains not printable characters */
    public int f2753 = 0;

    /* renamed from: ഗ  reason: contains not printable characters */
    public C4127 f2754;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public C3860 f2755;

    /* renamed from: ᖑ  reason: contains not printable characters */
    public int f2756;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public boolean f2757 = false;

    /* renamed from: ᜇ  reason: contains not printable characters */
    public C3881 f2758;

    /* renamed from: ᢼ  reason: contains not printable characters */
    public C4127 f2759;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public int f2760 = 0;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f2761;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f2762;

    public C4023() {
        m2619();
        this.f2750 = 0;
        this.f2756 = 0;
        this.f2755 = new C3860();
        this.f2752 = new C4218(32768);
        this.f2761 = 0;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public boolean m2613() {
        C3860 r02 = this.f2755;
        return r02.f1669 == r02.f1671;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r3 != -1) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r3 != 256) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        r10.f2761 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r3 = r3 - 257;
        r10.f2753 = f2747[r3];
        r10.f2751 = f2746[r3];
        r10.f2762 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r0 = r10.f2751;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r0 <= 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r0 = r10.f2755.m1853(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r0 >= 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        r10.f2753 += r0;
        r10.f2755.m1857(r10.f2751);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        r10.f2762 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        r0 = r10.f2754.m3313(r10.f2755);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r0 != -1) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r10.f2749 = f2748[r0];
        r10.f2751 = f2745[r0];
        r10.f2762 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        if (r10.f2753 <= r1) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
        r0 = r10.f2751;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        if (r0 <= 0) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        r0 = r10.f2755.m1853(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
        if (r0 >= 0) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        r10.f2749 += r0;
        r10.f2755.m1857(r10.f2751);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        r0 = r10.f2752;
        r2 = r10.f2753;
        r3 = r10.f2749;
        r0.f4143 += r2;
        r4 = r0.f4147;
        r6 = (r4 - r3) & r0.f4144;
        r7 = r0.f4145 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c3, code lost:
        if (r6 > r7) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c5, code lost:
        if (r4 < r7) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
        if (r2 > r3) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ca, code lost:
        r3 = r0.f4146;
        java.lang.System.arraycopy(r3, r6, r3, r4, r2);
        r0.f4147 += r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d5, code lost:
        if (r5 >= r2) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d7, code lost:
        r3 = r0.f4146;
        r4 = r0.f4147;
        r0.f4147 = r4 + 1;
        r3[r4] = r3[r6 + r5];
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e8, code lost:
        if (r5 >= r2) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ea, code lost:
        r3 = r0.f4146;
        r4 = r0.f4147;
        r7 = r4 + 1;
        r0.f4147 = r7;
        r3[r4] = r3[r6];
        r3 = r0.f4144;
        r0.f4147 = r7 & r3;
        r6 = (r6 + 1) & r3;
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0103, code lost:
        r1 = r1 - r10.f2753;
        r10.f2762 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if ((r3 & -256) != 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r6 = r10.f2752;
        r6.f4143++;
        r7 = r6.f4146;
        r8 = r6.f4147;
        r9 = r8 + 1;
        r6.f4147 = r9;
        r7[r8] = (byte) r3;
        r6.f4147 = r6.f4144 & r9;
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        return true;
     */
    /* renamed from: ગ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m2615() {
        /*
            r10 = this;
            nts.ー r0 = r10.f2752
            int r1 = r0.f4145
            int r0 = r0.f4143
            int r1 = r1 - r0
        L_0x0007:
            r0 = 258(0x102, float:3.62E-43)
            r2 = 1
            if (r1 < r0) goto L_0x010c
            int r3 = r10.f2762
            r4 = -1
            r5 = 0
            switch(r3) {
                case 10: goto L_0x0014;
                case 11: goto L_0x0058;
                case 12: goto L_0x0075;
                case 13: goto L_0x0090;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0007
        L_0x0014:
            nts.Ⅼ r3 = r10.f2759
            nts.Ꮤ r6 = r10.f2755
            int r3 = r3.m3313((nts.C3860) r6)
            r6 = r3 & -256(0xffffffffffffff00, float:NaN)
            if (r6 != 0) goto L_0x003c
            nts.ー r6 = r10.f2752
            int r7 = r6.f4143
            int r7 = r7 + r2
            r6.f4143 = r7
            byte[] r7 = r6.f4146
            int r8 = r6.f4147
            int r9 = r8 + 1
            r6.f4147 = r9
            byte r3 = (byte) r3
            r7[r8] = r3
            int r3 = r6.f4144
            r3 = r3 & r9
            r6.f4147 = r3
            int r1 = r1 + -1
            if (r1 >= r0) goto L_0x0014
            return r2
        L_0x003c:
            if (r3 != r4) goto L_0x003f
            return r5
        L_0x003f:
            r0 = 256(0x100, float:3.59E-43)
            if (r3 != r0) goto L_0x0046
            r10.f2761 = r5
            return r2
        L_0x0046:
            int[] r0 = f2747
            int r3 = r3 + -257
            r0 = r0[r3]
            r10.f2753 = r0
            int[] r0 = f2746
            r0 = r0[r3]
            r10.f2751 = r0
            r0 = 11
            r10.f2762 = r0
        L_0x0058:
            int r0 = r10.f2751
            if (r0 <= 0) goto L_0x0071
            nts.Ꮤ r3 = r10.f2755
            int r0 = r3.m1853(r0)
            if (r0 >= 0) goto L_0x0065
            return r5
        L_0x0065:
            int r3 = r10.f2753
            int r3 = r3 + r0
            r10.f2753 = r3
            nts.Ꮤ r0 = r10.f2755
            int r3 = r10.f2751
            r0.m1857(r3)
        L_0x0071:
            r0 = 12
            r10.f2762 = r0
        L_0x0075:
            nts.Ⅼ r0 = r10.f2754
            nts.Ꮤ r3 = r10.f2755
            int r0 = r0.m3313((nts.C3860) r3)
            if (r0 != r4) goto L_0x0080
            return r5
        L_0x0080:
            int[] r3 = f2748
            r3 = r3[r0]
            r10.f2749 = r3
            int[] r3 = f2745
            r0 = r3[r0]
            r10.f2751 = r0
            r0 = 13
            r10.f2762 = r0
        L_0x0090:
            int r0 = r10.f2753
            if (r0 <= r1) goto L_0x0095
            return r2
        L_0x0095:
            int r0 = r10.f2751
            if (r0 <= 0) goto L_0x00ae
            nts.Ꮤ r2 = r10.f2755
            int r0 = r2.m1853(r0)
            if (r0 >= 0) goto L_0x00a2
            return r5
        L_0x00a2:
            int r2 = r10.f2749
            int r2 = r2 + r0
            r10.f2749 = r2
            nts.Ꮤ r0 = r10.f2755
            int r2 = r10.f2751
            r0.m1857(r2)
        L_0x00ae:
            nts.ー r0 = r10.f2752
            int r2 = r10.f2753
            int r3 = r10.f2749
            int r4 = r0.f4143
            int r4 = r4 + r2
            r0.f4143 = r4
            int r4 = r0.f4147
            int r6 = r4 - r3
            int r7 = r0.f4144
            r6 = r6 & r7
            int r7 = r0.f4145
            int r7 = r7 - r2
            if (r6 > r7) goto L_0x00e8
            if (r4 < r7) goto L_0x00c8
            goto L_0x00e8
        L_0x00c8:
            if (r2 > r3) goto L_0x00d5
            byte[] r3 = r0.f4146
            java.lang.System.arraycopy(r3, r6, r3, r4, r2)
            int r3 = r0.f4147
            int r3 = r3 + r2
            r0.f4147 = r3
            goto L_0x0103
        L_0x00d5:
            if (r5 >= r2) goto L_0x0103
            byte[] r3 = r0.f4146
            int r4 = r0.f4147
            int r7 = r4 + 1
            r0.f4147 = r7
            int r7 = r6 + r5
            byte r7 = r3[r7]
            r3[r4] = r7
            int r5 = r5 + 1
            goto L_0x00d5
        L_0x00e8:
            if (r5 >= r2) goto L_0x0103
            byte[] r3 = r0.f4146
            int r4 = r0.f4147
            int r7 = r4 + 1
            r0.f4147 = r7
            int r8 = r6 + 1
            byte r6 = r3[r6]
            r3[r4] = r6
            int r3 = r0.f4144
            r4 = r7 & r3
            r0.f4147 = r4
            r6 = r8 & r3
            int r5 = r5 + 1
            goto L_0x00e8
        L_0x0103:
            int r0 = r10.f2753
            int r1 = r1 - r0
            r0 = 10
            r10.f2762 = r0
            goto L_0x0007
        L_0x010c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C4023.m2615():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093 A[Catch:{ Ԕ -> 0x012b, Ԕ -> 0x00f5, Exception -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096 A[Catch:{ Ԕ -> 0x012b, Ԕ -> 0x00f5, Exception -> 0x0155 }] */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m2617() {
        /*
            r15 = this;
            java.lang.String r0 = "\u001b!'#%<&i$++&)c48.:riKM\bCKCKWJ\u000fUv3{s6tyj;oikelgmp$Sefz`3tt}pxtt|8zijtwgpsdj/hl~j&Sp|4`5y~u{oy=\"\" 1\"a}qct(fl+ec~zD\u0010Uuu~t`rr9kohx}r>dngq%afteq%"
            r1 = 101(0x65, float:1.42E-43)
            r2 = 0
            int r3 = r15.f2761     // Catch:{ Exception -> 0x0155 }
            r4 = 19
            r5 = 10
            r6 = 6
            r7 = -1
            r8 = 3
            r9 = 2
            r10 = 7
            r11 = 8
            r12 = 0
            r13 = 1
            if (r3 == 0) goto L_0x00b0
            r14 = 16
            if (r3 == r13) goto L_0x0062
            if (r3 == r9) goto L_0x006f
            if (r3 == r8) goto L_0x0082
            if (r3 == r6) goto L_0x0038
            if (r3 == r10) goto L_0x0037
            if (r3 != r11) goto L_0x0025
            goto L_0x005d
        L_0x0025:
            nts.Ԕ r3 = new nts.Ԕ     // Catch:{ Exception -> 0x0155 }
            r4 = 30
            r5 = 22
            r6 = 24
            java.lang.String r4 = nts.C3727.m1052((java.lang.String) r0, (int) r4, (int) r5, (int) r6)     // Catch:{ Exception -> 0x0155 }
            r5 = 199(0xc7, float:2.79E-43)
            r3.<init>(r2, r5, r4)     // Catch:{ Exception -> 0x0155 }
            throw r3     // Catch:{ Exception -> 0x0155 }
        L_0x0037:
            return r12
        L_0x0038:
            nts.ᑋ r3 = r15.f2758     // Catch:{ Exception -> 0x0155 }
            nts.Ꮤ r4 = r15.f2755     // Catch:{ Exception -> 0x0155 }
            boolean r3 = r3.m1938(r4)     // Catch:{ Exception -> 0x0155 }
            if (r3 != 0) goto L_0x0043
            return r12
        L_0x0043:
            nts.ᑋ r3 = r15.f2758     // Catch:{ Exception -> 0x0155 }
            nts.Ⅼ r4 = new nts.Ⅼ     // Catch:{ Exception -> 0x0155 }
            byte[] r3 = r3.f1750     // Catch:{ Exception -> 0x0155 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0155 }
            r15.f2759 = r4     // Catch:{ Exception -> 0x0155 }
            nts.ᑋ r3 = r15.f2758     // Catch:{ Exception -> 0x0155 }
            nts.Ⅼ r4 = new nts.Ⅼ     // Catch:{ Exception -> 0x0155 }
            byte[] r3 = r3.f1760     // Catch:{ Exception -> 0x0155 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0155 }
            r15.f2754 = r4     // Catch:{ Exception -> 0x0155 }
            r15.f2761 = r11     // Catch:{ Exception -> 0x0155 }
            r15.f2762 = r5     // Catch:{ Exception -> 0x0155 }
        L_0x005d:
            boolean r0 = r15.m2615()     // Catch:{ Exception -> 0x0155 }
            return r0
        L_0x0062:
            nts.Ꮤ r3 = r15.f2755     // Catch:{ Exception -> 0x0155 }
            int r3 = r3.m1854(r14)     // Catch:{ Exception -> 0x0155 }
            r15.f2760 = r3     // Catch:{ Exception -> 0x0155 }
            if (r3 != r7) goto L_0x006d
            return r12
        L_0x006d:
            r15.f2761 = r9     // Catch:{ Exception -> 0x0155 }
        L_0x006f:
            nts.Ꮤ r3 = r15.f2755     // Catch:{ Exception -> 0x0155 }
            int r3 = r3.m1854(r14)     // Catch:{ Exception -> 0x0155 }
            if (r3 != r7) goto L_0x0078
            return r12
        L_0x0078:
            int r5 = r15.f2760     // Catch:{ Exception -> 0x0155 }
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 ^ r6
            if (r3 != r5) goto L_0x00a2
            r15.f2761 = r8     // Catch:{ Exception -> 0x0155 }
        L_0x0082:
            nts.ー r3 = r15.f2752     // Catch:{ Exception -> 0x0155 }
            nts.Ꮤ r4 = r15.f2755     // Catch:{ Exception -> 0x0155 }
            int r5 = r15.f2760     // Catch:{ Exception -> 0x0155 }
            int r3 = r3.m3814(r4, r5)     // Catch:{ Exception -> 0x0155 }
            int r4 = r15.f2760     // Catch:{ Exception -> 0x0155 }
            int r4 = r4 - r3
            r15.f2760 = r4     // Catch:{ Exception -> 0x0155 }
            if (r4 != 0) goto L_0x0096
            r15.f2761 = r12     // Catch:{ Exception -> 0x0155 }
            return r13
        L_0x0096:
            nts.Ꮤ r3 = r15.f2755     // Catch:{ Exception -> 0x0155 }
            int r4 = r3.f1669     // Catch:{ Exception -> 0x0155 }
            int r0 = r3.f1671     // Catch:{ Exception -> 0x0155 }
            if (r4 != r0) goto L_0x009f
            r12 = r13
        L_0x009f:
            r0 = r12 ^ 1
            return r0
        L_0x00a2:
            nts.Ԕ r3 = new nts.Ԕ     // Catch:{ Exception -> 0x0155 }
            r5 = 11
            r6 = 51
            java.lang.String r4 = nts.C3727.m1052((java.lang.String) r0, (int) r4, (int) r5, (int) r6)     // Catch:{ Exception -> 0x0155 }
            r3.<init>(r2, r1, r4)     // Catch:{ Exception -> 0x0155 }
            throw r3     // Catch:{ Exception -> 0x0155 }
        L_0x00b0:
            boolean r3 = r15.f2757     // Catch:{ Exception -> 0x0155 }
            if (r3 == 0) goto L_0x00b7
            r15.f2761 = r10     // Catch:{ Exception -> 0x0155 }
            return r12
        L_0x00b7:
            nts.Ꮤ r3 = r15.f2755     // Catch:{ Exception -> 0x0155 }
            int r3 = r3.m1854(r8)     // Catch:{ Exception -> 0x0155 }
            if (r3 != r7) goto L_0x00c0
            return r12
        L_0x00c0:
            r7 = r3 & 1
            if (r7 != r13) goto L_0x00c6
            r7 = r13
            goto L_0x00c7
        L_0x00c6:
            r7 = r12
        L_0x00c7:
            r15.f2757 = r7     // Catch:{ Exception -> 0x0155 }
            int r3 = r3 >> r13
            if (r3 == 0) goto L_0x0141
            if (r3 == r13) goto L_0x00e7
            if (r3 != r9) goto L_0x00db
            r15.f2761 = r6     // Catch:{ Exception -> 0x0155 }
            nts.ᑋ r3 = new nts.ᑋ     // Catch:{ Exception -> 0x0155 }
            r3.<init>()     // Catch:{ Exception -> 0x0155 }
            r15.f2758 = r3     // Catch:{ Exception -> 0x0155 }
            goto L_0x0154
        L_0x00db:
            nts.Ԕ r3 = new nts.Ԕ     // Catch:{ Exception -> 0x0155 }
            r5 = 93
            java.lang.String r4 = nts.C3727.m1052((java.lang.String) r0, (int) r12, (int) r4, (int) r5)     // Catch:{ Exception -> 0x0155 }
            r3.<init>(r2, r1, r4)     // Catch:{ Exception -> 0x0155 }
            throw r3     // Catch:{ Exception -> 0x0155 }
        L_0x00e7:
            r3 = 288(0x120, float:4.04E-43)
            byte[] r4 = new byte[r3]     // Catch:{ Ԕ -> 0x00f5 }
            r6 = r12
        L_0x00ec:
            r7 = 144(0x90, float:2.02E-43)
            if (r6 >= r7) goto L_0x00f7
            r4[r6] = r11     // Catch:{ Ԕ -> 0x00f5 }
            int r6 = r6 + 1
            goto L_0x00ec
        L_0x00f5:
            r3 = move-exception
            goto L_0x0118
        L_0x00f7:
            r6 = 256(0x100, float:3.59E-43)
            if (r7 >= r6) goto L_0x0102
            r6 = 9
            r4[r7] = r6     // Catch:{ Ԕ -> 0x00f5 }
            int r7 = r7 + 1
            goto L_0x00f7
        L_0x0102:
            r7 = 280(0x118, float:3.92E-43)
            if (r6 >= r7) goto L_0x010b
            r4[r6] = r10     // Catch:{ Ԕ -> 0x00f5 }
            int r6 = r6 + 1
            goto L_0x0102
        L_0x010b:
            if (r7 >= r3) goto L_0x0112
            r4[r7] = r11     // Catch:{ Ԕ -> 0x00f5 }
            int r7 = r7 + 1
            goto L_0x010b
        L_0x0112:
            nts.Ⅼ r3 = new nts.Ⅼ     // Catch:{ Ԕ -> 0x00f5 }
            r3.<init>(r4)     // Catch:{ Ԕ -> 0x00f5 }
            goto L_0x011d
        L_0x0118:
            int r4 = r3.f605     // Catch:{ Exception -> 0x0155 }
            if (r4 != r1) goto L_0x0140
            r3 = r2
        L_0x011d:
            r15.f2759 = r3     // Catch:{ Exception -> 0x0155 }
            r3 = 32
            byte[] r4 = new byte[r3]     // Catch:{ Ԕ -> 0x012b }
        L_0x0123:
            if (r12 >= r3) goto L_0x012d
            r6 = 5
            r4[r12] = r6     // Catch:{ Ԕ -> 0x012b }
            int r12 = r12 + 1
            goto L_0x0123
        L_0x012b:
            r3 = move-exception
            goto L_0x0133
        L_0x012d:
            nts.Ⅼ r3 = new nts.Ⅼ     // Catch:{ Ԕ -> 0x012b }
            r3.<init>(r4)     // Catch:{ Ԕ -> 0x012b }
            goto L_0x0138
        L_0x0133:
            int r4 = r3.f605     // Catch:{ Exception -> 0x0155 }
            if (r4 != r1) goto L_0x013f
            r3 = r2
        L_0x0138:
            r15.f2754 = r3     // Catch:{ Exception -> 0x0155 }
            r15.f2762 = r5     // Catch:{ Exception -> 0x0155 }
            r15.f2761 = r11     // Catch:{ Exception -> 0x0155 }
            goto L_0x0154
        L_0x013f:
            throw r3     // Catch:{ Exception -> 0x0155 }
        L_0x0140:
            throw r3     // Catch:{ Exception -> 0x0155 }
        L_0x0141:
            nts.Ꮤ r3 = r15.f2755     // Catch:{ Exception -> 0x0155 }
            int r4 = r3.f1668     // Catch:{ Exception -> 0x0155 }
            int r5 = r3.f1672     // Catch:{ Exception -> 0x0155 }
            r6 = r5 & 7
            int r4 = r4 >> r6
            r3.f1668 = r4     // Catch:{ Exception -> 0x0155 }
            r4 = 65528(0xfff8, float:9.1824E-41)
            r4 = r4 & r5
            r3.f1672 = r4     // Catch:{ Exception -> 0x0155 }
            r15.f2761 = r13     // Catch:{ Exception -> 0x0155 }
        L_0x0154:
            return r13
        L_0x0155:
            nts.Ԕ r3 = new nts.Ԕ
            r4 = 31
            r5 = 61
            r6 = 52
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r0, (int) r6, (int) r4, (int) r5)
            r3.<init>(r2, r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C4023.m2617():boolean");
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean m2618() {
        return this.f2761 == 7 && this.f2752.f4143 == 0;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public void m2619() {
        int[] iArr = f2747;
        iArr[0] = 3;
        iArr[1] = 4;
        iArr[2] = 5;
        iArr[3] = 6;
        iArr[4] = 7;
        iArr[5] = 8;
        iArr[6] = 9;
        iArr[7] = 10;
        iArr[8] = 11;
        iArr[9] = 13;
        iArr[10] = 15;
        iArr[11] = 17;
        iArr[12] = 19;
        iArr[13] = 23;
        iArr[14] = 27;
        iArr[15] = 31;
        iArr[16] = 35;
        iArr[17] = 43;
        iArr[18] = 51;
        iArr[19] = 59;
        iArr[20] = 67;
        iArr[21] = 83;
        iArr[22] = 99;
        iArr[23] = 115;
        iArr[24] = 131;
        iArr[25] = 163;
        iArr[26] = 195;
        iArr[27] = 227;
        iArr[28] = 258;
        int[] iArr2 = f2746;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        iArr2[4] = 0;
        iArr2[5] = 0;
        iArr2[6] = 0;
        iArr2[7] = 0;
        iArr2[8] = 1;
        iArr2[9] = 1;
        iArr2[10] = 1;
        iArr2[11] = 1;
        iArr2[12] = 2;
        iArr2[13] = 2;
        iArr2[14] = 2;
        iArr2[15] = 2;
        iArr2[16] = 3;
        iArr2[17] = 3;
        iArr2[18] = 3;
        iArr2[19] = 3;
        iArr2[20] = 4;
        iArr2[21] = 4;
        iArr2[22] = 4;
        iArr2[23] = 4;
        iArr2[24] = 5;
        iArr2[25] = 5;
        iArr2[26] = 5;
        iArr2[27] = 5;
        iArr2[28] = 0;
        int[] iArr3 = f2748;
        iArr3[0] = 1;
        iArr3[1] = 2;
        iArr3[2] = 3;
        iArr3[3] = 4;
        iArr3[4] = 5;
        iArr3[5] = 7;
        iArr3[6] = 9;
        iArr3[7] = 13;
        iArr3[8] = 17;
        iArr3[9] = 25;
        iArr3[10] = 33;
        iArr3[11] = 49;
        iArr3[12] = 65;
        iArr3[13] = 97;
        iArr3[14] = 129;
        iArr3[15] = 193;
        iArr3[16] = 257;
        iArr3[17] = 385;
        iArr3[18] = 513;
        iArr3[19] = 769;
        iArr3[20] = 1025;
        iArr3[21] = 1537;
        iArr3[22] = 2049;
        iArr3[23] = 3073;
        iArr3[24] = 4097;
        iArr3[25] = 6145;
        iArr3[26] = 8193;
        iArr3[27] = 12289;
        iArr3[28] = 16385;
        iArr3[29] = 24577;
        int[] iArr4 = f2745;
        iArr4[0] = 0;
        iArr4[1] = 0;
        iArr4[2] = 0;
        iArr4[3] = 0;
        iArr4[4] = 1;
        iArr4[5] = 1;
        iArr4[6] = 2;
        iArr4[7] = 2;
        iArr4[8] = 3;
        iArr4[9] = 3;
        iArr4[10] = 4;
        iArr4[11] = 4;
        iArr4[12] = 5;
        iArr4[13] = 5;
        iArr4[14] = 6;
        iArr4[15] = 6;
        iArr4[16] = 7;
        iArr4[17] = 7;
        iArr4[18] = 8;
        iArr4[19] = 8;
        iArr4[20] = 9;
        iArr4[21] = 9;
        iArr4[22] = 10;
        iArr4[23] = 10;
        iArr4[24] = 11;
        iArr4[25] = 11;
        iArr4[26] = 12;
        iArr4[27] = 12;
        iArr4[28] = 13;
        iArr4[29] = 13;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m2614(byte[] bArr, int i10, int i11) {
        int i12;
        C3860 r02 = this.f2755;
        int i13 = r02.f1669;
        int i14 = r02.f1671;
        if (i13 < i14) {
            i12 = (i11 + i14) - i13;
            byte[] bArr2 = new byte[i12];
            System.arraycopy(r02.f1670, i13, bArr2, 0, i14 - i13);
            System.arraycopy(bArr, i10, bArr2, r02.f1671 - r02.f1669, i11);
            i10 = 0;
            bArr = bArr2;
        } else {
            i12 = i11;
        }
        int i15 = i10 + i12;
        if (i10 < 0 || i15 > bArr.length || i10 > i15) {
            throw new C3625((Throwable) null, 199, C3727.m1052("r@VEZS[@\u001bULL\u001fQ[\u001cQCOGB", 0, 21, 38));
        }
        if ((i12 & 1) != 0) {
            int i16 = r02.f1668;
            int i17 = r02.f1672;
            r02.f1668 = ((bArr[i10] & 255) << i17) | i16;
            r02.f1672 = i17 + 8;
            i10++;
        }
        r02.f1670 = bArr;
        r02.f1669 = i10;
        r02.f1671 = i15;
        this.f2750 += i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e A[LOOP:1: B:14:0x003e->B:17:0x0048, LOOP_START] */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int m2616(byte[] r11, int r12, int r13) {
        /*
            r10 = this;
            r0 = 199(0xc7, float:2.79E-43)
            r1 = 0
            if (r13 <= 0) goto L_0x0068
            r2 = 0
            r3 = r2
        L_0x0007:
            nts.ー r4 = r10.f2752
            int r5 = r4.f4147
            int r6 = r4.f4143
            if (r13 <= r6) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            int r5 = r5 - r6
            int r5 = r5 + r13
            int r6 = r4.f4144
            r5 = r5 & r6
            r6 = r13
        L_0x0016:
            int r7 = r6 - r5
            if (r7 <= 0) goto L_0x0025
            byte[] r8 = r4.f4146
            int r9 = r4.f4145
            int r9 = r9 - r7
            java.lang.System.arraycopy(r8, r9, r11, r12, r7)
            int r7 = r7 + r12
            r8 = r5
            goto L_0x0027
        L_0x0025:
            r7 = r12
            r8 = r6
        L_0x0027:
            byte[] r9 = r4.f4146
            int r5 = r5 - r8
            java.lang.System.arraycopy(r9, r5, r11, r7, r8)
            int r5 = r4.f4143
            int r5 = r5 - r6
            r4.f4143 = r5
            if (r5 < 0) goto L_0x0058
            int r12 = r12 + r6
            int r3 = r3 + r6
            int r4 = r10.f2756
            int r4 = r4 + r6
            r10.f2756 = r4
            int r13 = r13 - r6
            if (r13 != 0) goto L_0x004b
        L_0x003e:
            nts.ー r11 = r10.f2752
            int r11 = r11.f4143
            if (r11 > 0) goto L_0x004a
            boolean r11 = r10.m2617()
            if (r11 != 0) goto L_0x003e
        L_0x004a:
            return r3
        L_0x004b:
            boolean r4 = r10.m2617()
            if (r4 != 0) goto L_0x0007
            nts.ー r4 = r10.f2752
            int r4 = r4.f4143
            if (r4 > 0) goto L_0x0007
            return r3
        L_0x0058:
            nts.Ԕ r11 = new nts.Ԕ
            r12 = 17
            r13 = 99
            java.lang.String r3 = "\u0005\u001a\u001e\u0015\u0019\u0000T\u001b\u0015\u000fX\u001f\u0017\u0013\u0010\u0018\u0006"
            java.lang.String r12 = nts.C3727.m1052((java.lang.String) r3, (int) r2, (int) r12, (int) r13)
            r11.<init>(r1, r0, r12)
            throw r11
        L_0x0068:
            nts.Ԕ r11 = new nts.Ԕ
            r12 = 97
            java.lang.String r13 = "\u001b!'#%<&i$++&)c48.:riKM\bCKCKWJ\u000fUv3{s6tyj;oikelgmp$Sefz`3tt}pxtt|8zijtwgpsdj/hl~j&Sp|4`5y~u{oy=\"\" 1\"a}qct(fl+ec~zD\u0010Uuu~t`rr9kohx}r>dngq%afteq%"
            r2 = 83
            r3 = 34
            java.lang.String r12 = nts.C3727.m1052((java.lang.String) r13, (int) r2, (int) r3, (int) r12)
            r11.<init>(r1, r0, r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C4023.m2616(byte[], int, int):int");
    }
}
