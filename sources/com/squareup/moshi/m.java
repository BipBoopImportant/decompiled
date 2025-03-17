package com.squareup.moshi;

import WK.C16770e;
import WK.C16772g;
import WK.C16773h;
import com.squareup.moshi.k;
import java.io.EOFException;
import java.math.BigDecimal;

final class m extends k {

    /* renamed from: m  reason: collision with root package name */
    private static final C16773h f122365m = C16773h.n("'\\");

    /* renamed from: n  reason: collision with root package name */
    private static final C16773h f122366n = C16773h.n("\"\\");

    /* renamed from: o  reason: collision with root package name */
    private static final C16773h f122367o = C16773h.n("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: p  reason: collision with root package name */
    private static final C16773h f122368p = C16773h.n("\n\r");

    /* renamed from: q  reason: collision with root package name */
    private static final C16773h f122369q = C16773h.n("*/");

    /* renamed from: g  reason: collision with root package name */
    private final C16772g f122370g;

    /* renamed from: h  reason: collision with root package name */
    private final C16770e f122371h;

    /* renamed from: i  reason: collision with root package name */
    private int f122372i = 0;

    /* renamed from: j  reason: collision with root package name */
    private long f122373j;

    /* renamed from: k  reason: collision with root package name */
    private int f122374k;

    /* renamed from: l  reason: collision with root package name */
    private String f122375l;

    m(C16772g gVar) {
        if (gVar != null) {
            this.f122370g = gVar;
            this.f122371h = gVar.p();
            q(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    private void A0() {
        long b32 = this.f122370g.b3(f122367o);
        C16770e eVar = this.f122371h;
        if (b32 == -1) {
            b32 = eVar.size();
        }
        eVar.M(b32);
    }

    private void B() {
        if (!this.f122361e) {
            throw x("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int F() {
        int[] iArr = this.f122358b;
        int i10 = this.f122357a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int e02 = e0(true);
            this.f122371h.readByte();
            if (e02 != 44) {
                if (e02 == 59) {
                    B();
                } else if (e02 == 93) {
                    this.f122372i = 4;
                    return 4;
                } else {
                    throw x("Unterminated array");
                }
            }
        } else if (i11 == 3 || i11 == 5) {
            iArr[i10 - 1] = 4;
            if (i11 == 5) {
                int e03 = e0(true);
                this.f122371h.readByte();
                if (e03 != 44) {
                    if (e03 == 59) {
                        B();
                    } else if (e03 == 125) {
                        this.f122372i = 2;
                        return 2;
                    } else {
                        throw x("Unterminated object");
                    }
                }
            }
            int e04 = e0(true);
            if (e04 == 34) {
                this.f122371h.readByte();
                this.f122372i = 13;
                return 13;
            } else if (e04 == 39) {
                this.f122371h.readByte();
                B();
                this.f122372i = 12;
                return 12;
            } else if (e04 != 125) {
                B();
                if (U((char) e04)) {
                    this.f122372i = 14;
                    return 14;
                }
                throw x("Expected name");
            } else if (i11 != 5) {
                this.f122371h.readByte();
                this.f122372i = 2;
                return 2;
            } else {
                throw x("Expected name");
            }
        } else if (i11 == 4) {
            iArr[i10 - 1] = 5;
            int e05 = e0(true);
            this.f122371h.readByte();
            if (e05 != 58) {
                if (e05 == 61) {
                    B();
                    if (this.f122370g.V0(1) && this.f122371h.u(0) == 62) {
                        this.f122371h.readByte();
                    }
                } else {
                    throw x("Expected ':'");
                }
            }
        } else if (i11 == 6) {
            iArr[i10 - 1] = 7;
        } else if (i11 == 7) {
            if (e0(false) == -1) {
                this.f122372i = 18;
                return 18;
            }
            B();
        } else if (i11 == 9) {
            throw null;
        } else if (i11 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int e06 = e0(true);
        if (e06 == 34) {
            this.f122371h.readByte();
            this.f122372i = 9;
            return 9;
        } else if (e06 != 39) {
            if (!(e06 == 44 || e06 == 59)) {
                if (e06 == 91) {
                    this.f122371h.readByte();
                    this.f122372i = 3;
                    return 3;
                } else if (e06 != 93) {
                    if (e06 != 123) {
                        int i02 = i0();
                        if (i02 != 0) {
                            return i02;
                        }
                        int j02 = j0();
                        if (j02 != 0) {
                            return j02;
                        }
                        if (U(this.f122371h.u(0))) {
                            B();
                            this.f122372i = 10;
                            return 10;
                        }
                        throw x("Expected value");
                    }
                    this.f122371h.readByte();
                    this.f122372i = 1;
                    return 1;
                } else if (i11 == 1) {
                    this.f122371h.readByte();
                    this.f122372i = 4;
                    return 4;
                }
            }
            if (i11 == 1 || i11 == 2) {
                B();
                this.f122372i = 7;
                return 7;
            }
            throw x("Unexpected value");
        } else {
            B();
            this.f122371h.readByte();
            this.f122372i = 8;
            return 8;
        }
    }

    private int J(String str, k.a aVar) {
        int length = aVar.f122363a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f122363a[i10])) {
                this.f122372i = 0;
                this.f122359c[this.f122357a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private int N(String str, k.a aVar) {
        int length = aVar.f122363a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f122363a[i10])) {
                this.f122372i = 0;
                int[] iArr = this.f122360d;
                int i11 = this.f122357a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    private boolean U(int i10) {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (!(i10 == 47 || i10 == 61)) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        B();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f122371h.M((long) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r2 != 47) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r6.f122370g.V0(2) != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        B();
        r3 = r6.f122371h.u(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r3 == 42) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r3 == 47) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        r6.f122371h.readByte();
        r6.f122371h.readByte();
        t0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r6.f122371h.readByte();
        r6.f122371h.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (p0() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        throw x("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        if (r2 != 35) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        B();
        t0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int e0(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            WK.g r2 = r6.f122370g
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.V0(r4)
            if (r2 == 0) goto L_0x0080
            WK.e r2 = r6.f122371h
            long r4 = (long) r1
            byte r2 = r2.u(r4)
            r4 = 10
            if (r2 == r4) goto L_0x007e
            r4 = 32
            if (r2 == r4) goto L_0x007e
            r4 = 13
            if (r2 == r4) goto L_0x007e
            r4 = 9
            if (r2 != r4) goto L_0x0025
            goto L_0x007e
        L_0x0025:
            WK.e r3 = r6.f122371h
            long r4 = (long) r1
            r3.M(r4)
            r1 = 47
            if (r2 != r1) goto L_0x0072
            WK.g r3 = r6.f122370g
            r4 = 2
            boolean r3 = r3.V0(r4)
            if (r3 != 0) goto L_0x003a
            return r2
        L_0x003a:
            r6.B()
            WK.e r3 = r6.f122371h
            r4 = 1
            byte r3 = r3.u(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005a
            if (r3 == r1) goto L_0x004c
            return r2
        L_0x004c:
            WK.e r1 = r6.f122371h
            r1.readByte()
            WK.e r1 = r6.f122371h
            r1.readByte()
            r6.t0()
            goto L_0x0001
        L_0x005a:
            WK.e r1 = r6.f122371h
            r1.readByte()
            WK.e r1 = r6.f122371h
            r1.readByte()
            boolean r1 = r6.p0()
            if (r1 == 0) goto L_0x006b
            goto L_0x0001
        L_0x006b:
            java.lang.String r7 = "Unterminated comment"
            com.squareup.moshi.i r7 = r6.x(r7)
            throw r7
        L_0x0072:
            r1 = 35
            if (r2 != r1) goto L_0x007d
            r6.B()
            r6.t0()
            goto L_0x0001
        L_0x007d:
            return r2
        L_0x007e:
            r1 = r3
            goto L_0x0002
        L_0x0080:
            if (r7 != 0) goto L_0x0084
            r7 = -1
            return r7
        L_0x0084:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.m.e0(boolean):int");
    }

    private String f0(C16773h hVar) {
        StringBuilder sb2 = null;
        while (true) {
            long b32 = this.f122370g.b3(hVar);
            if (b32 == -1) {
                throw x("Unterminated string");
            } else if (this.f122371h.u(b32) == 92) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f122371h.B1(b32));
                this.f122371h.readByte();
                sb2.append(l0());
            } else if (sb2 == null) {
                String B12 = this.f122371h.B1(b32);
                this.f122371h.readByte();
                return B12;
            } else {
                sb2.append(this.f122371h.B1(b32));
                this.f122371h.readByte();
                return sb2.toString();
            }
        }
    }

    private String h0() {
        long b32 = this.f122370g.b3(f122367o);
        return b32 != -1 ? this.f122371h.B1(b32) : this.f122371h.l0();
    }

    private int i0() {
        int i10;
        String str;
        String str2;
        byte u10 = this.f122371h.u(0);
        if (u10 == 116 || u10 == 84) {
            str2 = "true";
            str = "TRUE";
            i10 = 5;
        } else if (u10 == 102 || u10 == 70) {
            str2 = "false";
            str = "FALSE";
            i10 = 6;
        } else if (u10 != 110 && u10 != 78) {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i10 = 7;
        }
        int length = str2.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f122370g.V0((long) i12)) {
                return 0;
            }
            byte u11 = this.f122371h.u((long) i11);
            if (u11 != str2.charAt(i11) && u11 != str.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f122370g.V0((long) (length + 1)) && U(this.f122371h.u((long) length))) {
            return 0;
        }
        this.f122371h.M((long) length);
        this.f122372i = i10;
        return i10;
    }

    private int j0() {
        byte u10;
        char c10;
        boolean z10 = true;
        long j10 = 0;
        int i10 = 0;
        char c11 = 0;
        boolean z11 = false;
        boolean z12 = true;
        while (true) {
            int i11 = i10 + 1;
            if (!this.f122370g.V0((long) i11)) {
                break;
            }
            u10 = this.f122371h.u((long) i10);
            if (u10 == 43) {
                c10 = 6;
                if (c11 != 5) {
                    return 0;
                }
            } else if (u10 != 69 && u10 != 101) {
                if (u10 == 45) {
                    c10 = 6;
                    if (c11 == 0) {
                        c11 = 1;
                        z11 = true;
                    } else if (c11 != 5) {
                        return 0;
                    }
                } else if (u10 != 46) {
                    if (u10 >= 48 && u10 <= 57) {
                        if (c11 == z10 || c11 == 0) {
                            j10 = (long) (-(u10 - 48));
                            c11 = 2;
                        } else if (c11 == 2) {
                            if (j10 == 0) {
                                return 0;
                            }
                            long j11 = (10 * j10) - ((long) (u10 - 48));
                            int i12 = (j10 > -922337203685477580L ? 1 : (j10 == -922337203685477580L ? 0 : -1));
                            z12 &= i12 > 0 || (i12 == 0 && j11 < j10);
                            j10 = j11;
                        } else if (c11 == 3) {
                            c11 = 4;
                        } else if (c11 == 5 || c11 == 6) {
                            c11 = 7;
                        }
                    }
                } else if (c11 != 2) {
                    return 0;
                } else {
                    c11 = 3;
                }
                i10 = i11;
                z10 = true;
            } else if (c11 != 2 && c11 != 4) {
                return 0;
            } else {
                c11 = 5;
                i10 = i11;
                z10 = true;
            }
            c11 = c10;
            i10 = i11;
            z10 = true;
        }
        if (U(u10)) {
            return 0;
        }
        if (c11 == 2 && z12 && ((j10 != Long.MIN_VALUE || z11) && (j10 != 0 || !z11))) {
            if (!z11) {
                j10 = -j10;
            }
            this.f122373j = j10;
            this.f122371h.M((long) i10);
            this.f122372i = 16;
            return 16;
        } else if (c11 != 2 && c11 != 4 && c11 != 7) {
            return 0;
        } else {
            this.f122374k = i10;
            this.f122372i = 17;
            return 17;
        }
    }

    private char l0() {
        int i10;
        if (this.f122370g.V0(1)) {
            byte readByte = this.f122371h.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f122361e) {
                    return (char) readByte;
                }
                throw x("Invalid escape sequence: \\" + ((char) readByte));
            } else if (this.f122370g.V0(4)) {
                char c10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    byte u10 = this.f122371h.u((long) i11);
                    char c11 = (char) (c10 << 4);
                    if (u10 >= 48 && u10 <= 57) {
                        i10 = u10 - 48;
                    } else if (u10 >= 97 && u10 <= 102) {
                        i10 = u10 - 87;
                    } else if (u10 < 65 || u10 > 70) {
                        throw x("\\u" + this.f122371h.B1(4));
                    } else {
                        i10 = u10 - 55;
                    }
                    c10 = (char) (c11 + i10);
                }
                this.f122371h.M(4);
                return c10;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + m());
            }
        } else {
            throw x("Unterminated escape sequence");
        }
    }

    private void o0(C16773h hVar) {
        while (true) {
            long b32 = this.f122370g.b3(hVar);
            if (b32 == -1) {
                throw x("Unterminated string");
            } else if (this.f122371h.u(b32) == 92) {
                this.f122371h.M(b32 + 1);
                l0();
            } else {
                this.f122371h.M(b32 + 1);
                return;
            }
        }
    }

    private boolean p0() {
        C16772g gVar = this.f122370g;
        C16773h hVar = f122369q;
        long S12 = gVar.S1(hVar);
        boolean z10 = S12 != -1;
        C16770e eVar = this.f122371h;
        eVar.M(z10 ? S12 + ((long) hVar.W()) : eVar.size());
        return z10;
    }

    private void t0() {
        long b32 = this.f122370g.b3(f122368p);
        C16770e eVar = this.f122371h;
        eVar.M(b32 != -1 ? b32 + 1 : eVar.size());
    }

    public String B0() {
        String str;
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        if (i10 == 14) {
            str = h0();
        } else if (i10 == 13) {
            str = f0(f122366n);
        } else if (i10 == 12) {
            str = f0(f122365m);
        } else if (i10 == 15) {
            str = this.f122375l;
            this.f122375l = null;
        } else {
            throw new h("Expected a name but was " + n() + " at path " + m());
        }
        this.f122372i = 0;
        this.f122359c[this.f122357a - 1] = str;
        return str;
    }

    public String C1() {
        String str;
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        if (i10 == 10) {
            str = h0();
        } else if (i10 == 9) {
            str = f0(f122366n);
        } else if (i10 == 8) {
            str = f0(f122365m);
        } else if (i10 == 11) {
            str = this.f122375l;
            this.f122375l = null;
        } else if (i10 == 16) {
            str = Long.toString(this.f122373j);
        } else if (i10 == 17) {
            str = this.f122371h.B1((long) this.f122374k);
        } else {
            throw new h("Expected a string but was " + n() + " at path " + m());
        }
        this.f122372i = 0;
        int[] iArr = this.f122360d;
        int i11 = this.f122357a - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public int G0() {
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        if (i10 == 16) {
            long j10 = this.f122373j;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.f122372i = 0;
                int[] iArr = this.f122360d;
                int i12 = this.f122357a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new h("Expected an int but was " + this.f122373j + " at path " + m());
        }
        if (i10 == 17) {
            this.f122375l = this.f122371h.B1((long) this.f122374k);
        } else if (i10 == 9 || i10 == 8) {
            String f02 = i10 == 9 ? f0(f122366n) : f0(f122365m);
            this.f122375l = f02;
            try {
                int parseInt = Integer.parseInt(f02);
                this.f122372i = 0;
                int[] iArr2 = this.f122360d;
                int i13 = this.f122357a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            throw new h("Expected an int but was " + n() + " at path " + m());
        }
        this.f122372i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f122375l);
            int i14 = (int) parseDouble;
            if (((double) i14) == parseDouble) {
                this.f122375l = null;
                this.f122372i = 0;
                int[] iArr3 = this.f122360d;
                int i15 = this.f122357a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new h("Expected an int but was " + this.f122375l + " at path " + m());
        } catch (NumberFormatException unused2) {
            throw new h("Expected an int but was " + this.f122375l + " at path " + m());
        }
    }

    public long U2() {
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        if (i10 == 16) {
            this.f122372i = 0;
            int[] iArr = this.f122360d;
            int i11 = this.f122357a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f122373j;
        }
        if (i10 == 17) {
            this.f122375l = this.f122371h.B1((long) this.f122374k);
        } else if (i10 == 9 || i10 == 8) {
            String f02 = i10 == 9 ? f0(f122366n) : f0(f122365m);
            this.f122375l = f02;
            try {
                long parseLong = Long.parseLong(f02);
                this.f122372i = 0;
                int[] iArr2 = this.f122360d;
                int i12 = this.f122357a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            throw new h("Expected a long but was " + n() + " at path " + m());
        }
        this.f122372i = 11;
        try {
            long longValueExact = new BigDecimal(this.f122375l).longValueExact();
            this.f122375l = null;
            this.f122372i = 0;
            int[] iArr3 = this.f122360d;
            int i13 = this.f122357a - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new h("Expected a long but was " + this.f122375l + " at path " + m());
        }
    }

    public void a0() {
        if (!this.f122362f) {
            int i10 = 0;
            do {
                int i11 = this.f122372i;
                if (i11 == 0) {
                    i11 = F();
                }
                if (i11 == 3) {
                    q(1);
                } else if (i11 == 1) {
                    q(3);
                } else {
                    if (i11 == 4) {
                        i10--;
                        if (i10 >= 0) {
                            this.f122357a--;
                        } else {
                            throw new h("Expected a value but was " + n() + " at path " + m());
                        }
                    } else if (i11 == 2) {
                        i10--;
                        if (i10 >= 0) {
                            this.f122357a--;
                        } else {
                            throw new h("Expected a value but was " + n() + " at path " + m());
                        }
                    } else if (i11 == 14 || i11 == 10) {
                        A0();
                    } else if (i11 == 9 || i11 == 13) {
                        o0(f122366n);
                    } else if (i11 == 8 || i11 == 12) {
                        o0(f122365m);
                    } else if (i11 == 17) {
                        this.f122371h.M((long) this.f122374k);
                    } else if (i11 == 18) {
                        throw new h("Expected a value but was " + n() + " at path " + m());
                    }
                    this.f122372i = 0;
                }
                i10++;
                this.f122372i = 0;
            } while (i10 != 0);
            int[] iArr = this.f122360d;
            int i12 = this.f122357a;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f122359c[i12 - 1] = "null";
            return;
        }
        throw new h("Cannot skip unexpected " + n() + " at " + m());
    }

    public void c() {
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        if (i10 == 3) {
            q(1);
            this.f122360d[this.f122357a - 1] = 0;
            this.f122372i = 0;
            return;
        }
        throw new h("Expected BEGIN_ARRAY but was " + n() + " at path " + m());
    }

    public void close() {
        this.f122372i = 0;
        this.f122358b[0] = 8;
        this.f122357a = 1;
        this.f122371h.c();
        this.f122370g.close();
    }

    public void d() {
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        if (i10 == 1) {
            q(3);
            this.f122372i = 0;
            return;
        }
        throw new h("Expected BEGIN_OBJECT but was " + n() + " at path " + m());
    }

    public double d2() {
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        if (i10 == 16) {
            this.f122372i = 0;
            int[] iArr = this.f122360d;
            int i11 = this.f122357a - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f122373j;
        }
        if (i10 == 17) {
            this.f122375l = this.f122371h.B1((long) this.f122374k);
        } else if (i10 == 9) {
            this.f122375l = f0(f122366n);
        } else if (i10 == 8) {
            this.f122375l = f0(f122365m);
        } else if (i10 == 10) {
            this.f122375l = h0();
        } else if (i10 != 11) {
            throw new h("Expected a double but was " + n() + " at path " + m());
        }
        this.f122372i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f122375l);
            if (this.f122361e || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f122375l = null;
                this.f122372i = 0;
                int[] iArr2 = this.f122360d;
                int i12 = this.f122357a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseDouble;
            }
            throw new i("JSON forbids NaN and infinities: " + parseDouble + " at path " + m());
        } catch (NumberFormatException unused) {
            throw new h("Expected a double but was " + this.f122375l + " at path " + m());
        }
    }

    public void e() {
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        if (i10 == 4) {
            int i11 = this.f122357a;
            this.f122357a = i11 - 1;
            int[] iArr = this.f122360d;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f122372i = 0;
            return;
        }
        throw new h("Expected END_ARRAY but was " + n() + " at path " + m());
    }

    public void f() {
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        if (i10 == 2) {
            int i11 = this.f122357a;
            int i12 = i11 - 1;
            this.f122357a = i12;
            this.f122359c[i12] = null;
            int[] iArr = this.f122360d;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.f122372i = 0;
            return;
        }
        throw new h("Expected END_OBJECT but was " + n() + " at path " + m());
    }

    public boolean hasNext() {
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    public <T> T i() {
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        if (i10 == 7) {
            this.f122372i = 0;
            int[] iArr = this.f122360d;
            int i11 = this.f122357a - 1;
            iArr[i11] = iArr[i11] + 1;
            return null;
        }
        throw new h("Expected null but was " + n() + " at path " + m());
    }

    public k.b n() {
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        switch (i10) {
            case 1:
                return k.b.BEGIN_OBJECT;
            case 2:
                return k.b.END_OBJECT;
            case 3:
                return k.b.BEGIN_ARRAY;
            case 4:
                return k.b.END_ARRAY;
            case 5:
            case 6:
                return k.b.BOOLEAN;
            case 7:
                return k.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return k.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return k.b.NAME;
            case 16:
            case 17:
                return k.b.NUMBER;
            case 18:
                return k.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void o() {
        if (hasNext()) {
            this.f122375l = B0();
            this.f122372i = 11;
        }
    }

    public int s(k.a aVar) {
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return J(this.f122375l, aVar);
        }
        int z12 = this.f122370g.z1(aVar.f122364b);
        if (z12 != -1) {
            this.f122372i = 0;
            this.f122359c[this.f122357a - 1] = aVar.f122363a[z12];
            return z12;
        }
        String str = this.f122359c[this.f122357a - 1];
        String B02 = B0();
        int J10 = J(B02, aVar);
        if (J10 == -1) {
            this.f122372i = 15;
            this.f122375l = B02;
            this.f122359c[this.f122357a - 1] = str;
        }
        return J10;
    }

    public int t(k.a aVar) {
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        if (i10 < 8 || i10 > 11) {
            return -1;
        }
        if (i10 == 11) {
            return N(this.f122375l, aVar);
        }
        int z12 = this.f122370g.z1(aVar.f122364b);
        if (z12 != -1) {
            this.f122372i = 0;
            int[] iArr = this.f122360d;
            int i11 = this.f122357a - 1;
            iArr[i11] = iArr[i11] + 1;
            return z12;
        }
        String C12 = C1();
        int N10 = N(C12, aVar);
        if (N10 == -1) {
            this.f122372i = 11;
            this.f122375l = C12;
            int[] iArr2 = this.f122360d;
            int i12 = this.f122357a - 1;
            iArr2[i12] = iArr2[i12] - 1;
        }
        return N10;
    }

    public String toString() {
        return "JsonReader(" + this.f122370g + ")";
    }

    public void w() {
        if (!this.f122362f) {
            int i10 = this.f122372i;
            if (i10 == 0) {
                i10 = F();
            }
            if (i10 == 14) {
                A0();
            } else if (i10 == 13) {
                o0(f122366n);
            } else if (i10 == 12) {
                o0(f122365m);
            } else if (i10 != 15) {
                throw new h("Expected a name but was " + n() + " at path " + m());
            }
            this.f122372i = 0;
            this.f122359c[this.f122357a - 1] = "null";
            return;
        }
        k.b n10 = n();
        B0();
        throw new h("Cannot skip unexpected " + n10 + " at " + m());
    }

    public boolean w1() {
        int i10 = this.f122372i;
        if (i10 == 0) {
            i10 = F();
        }
        if (i10 == 5) {
            this.f122372i = 0;
            int[] iArr = this.f122360d;
            int i11 = this.f122357a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f122372i = 0;
            int[] iArr2 = this.f122360d;
            int i12 = this.f122357a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new h("Expected a boolean but was " + n() + " at path " + m());
        }
    }
}
