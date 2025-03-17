package ZK;

import YK.C16893a;
import ZK.C17020b;

/* renamed from: ZK.a  reason: case insensitive filesystem */
public class C17019a extends C17020b {

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f140885o = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: p  reason: collision with root package name */
    private static final byte[] f140886p = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: q  reason: collision with root package name */
    private static final byte[] f140887q = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f140888j;

    /* renamed from: k  reason: collision with root package name */
    private final byte[] f140889k;

    /* renamed from: l  reason: collision with root package name */
    private final byte[] f140890l;

    /* renamed from: m  reason: collision with root package name */
    private final int f140891m;

    /* renamed from: n  reason: collision with root package name */
    private final int f140892n;

    public C17019a() {
        this(0);
    }

    public static byte[] q(byte[] bArr) {
        return new C17019a().f(bArr);
    }

    public static byte[] r(byte[] bArr) {
        return s(bArr, false);
    }

    public static byte[] s(byte[] bArr, boolean z10) {
        return t(bArr, z10, false);
    }

    public static byte[] t(byte[] bArr, boolean z10, boolean z11) {
        return u(bArr, z10, z11, Integer.MAX_VALUE);
    }

    public static byte[] u(byte[] bArr, boolean z10, boolean z11, int i10) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C17019a aVar = z10 ? new C17019a(z11) : new C17019a(0, C17020b.f140894i, z11);
        long l10 = aVar.l(bArr);
        if (l10 <= ((long) i10)) {
            return aVar.h(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + l10 + ") than the specified maximum size of " + i10);
    }

    private void v(int i10, C17020b.a aVar) {
        if (n() && (i10 & aVar.f140902a) != 0) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
    }

    private void w() {
        if (n()) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.");
        }
    }

    /* access modifiers changed from: package-private */
    public void e(byte[] bArr, int i10, int i11, C17020b.a aVar) {
        byte b10;
        if (!aVar.f140907f) {
            if (i11 < 0) {
                aVar.f140907f = true;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                byte[] j10 = j(this.f140891m, aVar);
                int i13 = i10 + 1;
                byte b11 = bArr[i10];
                if (b11 == this.f140896b) {
                    aVar.f140907f = true;
                    break;
                }
                if (b11 >= 0) {
                    byte[] bArr2 = f140887q;
                    if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                        int i14 = (aVar.f140909h + 1) % 4;
                        aVar.f140909h = i14;
                        int i15 = (aVar.f140902a << 6) + b10;
                        aVar.f140902a = i15;
                        if (i14 == 0) {
                            int i16 = aVar.f140905d;
                            int i17 = i16 + 1;
                            aVar.f140905d = i17;
                            j10[i16] = (byte) ((i15 >> 16) & 255);
                            int i18 = i16 + 2;
                            aVar.f140905d = i18;
                            j10[i17] = (byte) ((i15 >> 8) & 255);
                            aVar.f140905d = i16 + 3;
                            j10[i18] = (byte) (i15 & 255);
                        }
                    }
                }
                i12++;
                i10 = i13;
            }
            if (aVar.f140907f && aVar.f140909h != 0) {
                byte[] j11 = j(this.f140891m, aVar);
                int i19 = aVar.f140909h;
                if (i19 == 1) {
                    w();
                } else if (i19 == 2) {
                    v(15, aVar);
                    int i20 = aVar.f140902a >> 4;
                    aVar.f140902a = i20;
                    int i21 = aVar.f140905d;
                    aVar.f140905d = i21 + 1;
                    j11[i21] = (byte) (i20 & 255);
                } else if (i19 == 3) {
                    v(3, aVar);
                    int i22 = aVar.f140902a;
                    int i23 = i22 >> 2;
                    aVar.f140902a = i23;
                    int i24 = aVar.f140905d;
                    int i25 = i24 + 1;
                    aVar.f140905d = i25;
                    j11[i24] = (byte) ((i22 >> 10) & 255);
                    aVar.f140905d = i24 + 2;
                    j11[i25] = (byte) (i23 & 255);
                } else {
                    throw new IllegalStateException("Impossible modulus " + aVar.f140909h);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(byte[] r11, int r12, int r13, ZK.C17020b.a r14) {
        /*
            r10 = this;
            boolean r0 = r14.f140907f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r13 >= 0) goto L_0x00c0
            r14.f140907f = r1
            int r11 = r14.f140909h
            if (r11 != 0) goto L_0x0014
            int r11 = r10.f140899e
            if (r11 != 0) goto L_0x0014
            return
        L_0x0014:
            int r11 = r10.f140892n
            byte[] r11 = r10.j(r11, r14)
            int r12 = r14.f140905d
            int r13 = r14.f140909h
            if (r13 == 0) goto L_0x00a1
            if (r13 == r1) goto L_0x0073
            r1 = 2
            if (r13 != r1) goto L_0x005a
            int r13 = r12 + 1
            r14.f140905d = r13
            byte[] r2 = r10.f140888j
            int r3 = r14.f140902a
            int r4 = r3 >> 10
            r4 = r4 & 63
            byte r4 = r2[r4]
            r11[r12] = r4
            int r4 = r12 + 2
            r14.f140905d = r4
            int r5 = r3 >> 4
            r5 = r5 & 63
            byte r5 = r2[r5]
            r11[r13] = r5
            int r13 = r12 + 3
            r14.f140905d = r13
            int r1 = r3 << 2
            r1 = r1 & 63
            byte r1 = r2[r1]
            r11[r4] = r1
            byte[] r1 = f140885o
            if (r2 != r1) goto L_0x00a1
            int r1 = r12 + 4
            r14.f140905d = r1
            byte r1 = r10.f140896b
            r11[r13] = r1
            goto L_0x00a1
        L_0x005a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Impossible modulus "
            r12.append(r13)
            int r13 = r14.f140909h
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0073:
            int r13 = r12 + 1
            r14.f140905d = r13
            byte[] r1 = r10.f140888j
            int r2 = r14.f140902a
            int r3 = r2 >> 2
            r3 = r3 & 63
            byte r3 = r1[r3]
            r11[r12] = r3
            int r3 = r12 + 2
            r14.f140905d = r3
            int r2 = r2 << 4
            r2 = r2 & 63
            byte r2 = r1[r2]
            r11[r13] = r2
            byte[] r13 = f140885o
            if (r1 != r13) goto L_0x00a1
            int r13 = r12 + 3
            r14.f140905d = r13
            byte r1 = r10.f140896b
            r11[r3] = r1
            int r2 = r12 + 4
            r14.f140905d = r2
            r11[r13] = r1
        L_0x00a1:
            int r13 = r14.f140908g
            int r1 = r14.f140905d
            int r12 = r1 - r12
            int r13 = r13 + r12
            r14.f140908g = r13
            int r12 = r10.f140899e
            if (r12 <= 0) goto L_0x0133
            if (r13 <= 0) goto L_0x0133
            byte[] r12 = r10.f140890l
            int r13 = r12.length
            java.lang.System.arraycopy(r12, r0, r11, r1, r13)
            int r11 = r14.f140905d
            byte[] r12 = r10.f140890l
            int r12 = r12.length
            int r11 = r11 + r12
            r14.f140905d = r11
            goto L_0x0133
        L_0x00c0:
            r2 = r0
        L_0x00c1:
            if (r2 >= r13) goto L_0x0133
            int r3 = r10.f140892n
            byte[] r3 = r10.j(r3, r14)
            int r4 = r14.f140909h
            int r4 = r4 + r1
            int r4 = r4 % 3
            r14.f140909h = r4
            int r5 = r12 + 1
            byte r12 = r11[r12]
            if (r12 >= 0) goto L_0x00d8
            int r12 = r12 + 256
        L_0x00d8:
            int r6 = r14.f140902a
            int r6 = r6 << 8
            int r6 = r6 + r12
            r14.f140902a = r6
            if (r4 != 0) goto L_0x012f
            int r12 = r14.f140905d
            int r4 = r12 + 1
            r14.f140905d = r4
            byte[] r7 = r10.f140888j
            int r8 = r6 >> 18
            r8 = r8 & 63
            byte r8 = r7[r8]
            r3[r12] = r8
            int r8 = r12 + 2
            r14.f140905d = r8
            int r9 = r6 >> 12
            r9 = r9 & 63
            byte r9 = r7[r9]
            r3[r4] = r9
            int r4 = r12 + 3
            r14.f140905d = r4
            int r9 = r6 >> 6
            r9 = r9 & 63
            byte r9 = r7[r9]
            r3[r8] = r9
            int r12 = r12 + 4
            r14.f140905d = r12
            r6 = r6 & 63
            byte r6 = r7[r6]
            r3[r4] = r6
            int r4 = r14.f140908g
            int r4 = r4 + 4
            r14.f140908g = r4
            int r6 = r10.f140899e
            if (r6 <= 0) goto L_0x012f
            if (r6 > r4) goto L_0x012f
            byte[] r4 = r10.f140890l
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r0, r3, r12, r6)
            int r12 = r14.f140905d
            byte[] r3 = r10.f140890l
            int r3 = r3.length
            int r12 = r12 + r3
            r14.f140905d = r12
            r14.f140908g = r0
        L_0x012f:
            int r2 = r2 + 1
            r12 = r5
            goto L_0x00c1
        L_0x0133:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ZK.C17019a.g(byte[], int, int, ZK.b$a):void");
    }

    /* access modifiers changed from: protected */
    public boolean m(byte b10) {
        if (b10 >= 0) {
            byte[] bArr = this.f140889k;
            return b10 < bArr.length && bArr[b10] != -1;
        }
    }

    public C17019a(boolean z10) {
        this(76, C17020b.f140894i, z10);
    }

    public C17019a(int i10) {
        this(i10, C17020b.f140894i);
    }

    public C17019a(int i10, byte[] bArr) {
        this(i10, bArr, false);
    }

    public C17019a(int i10, byte[] bArr, boolean z10) {
        this(i10, bArr, z10, C17020b.f140893h);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17019a(int i10, byte[] bArr, boolean z10, C16893a aVar) {
        super(3, 4, i10, bArr == null ? 0 : bArr.length, (byte) 61, aVar);
        this.f140889k = f140887q;
        if (bArr == null) {
            this.f140892n = 4;
            this.f140890l = null;
        } else if (c(bArr)) {
            String b10 = C17021c.b(bArr);
            throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + b10 + "]");
        } else if (i10 > 0) {
            this.f140892n = bArr.length + 4;
            byte[] bArr2 = new byte[bArr.length];
            this.f140890l = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        } else {
            this.f140892n = 4;
            this.f140890l = null;
        }
        this.f140891m = this.f140892n - 1;
        this.f140888j = z10 ? f140886p : f140885o;
    }
}
