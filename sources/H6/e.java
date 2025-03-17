package H6;

import H6.c;
import WK.C16770e;
import WK.C16772g;
import WK.C16773h;
import java.io.EOFException;

final class e extends c {

    /* renamed from: n  reason: collision with root package name */
    private static final C16773h f36452n = C16773h.n("'\\");

    /* renamed from: o  reason: collision with root package name */
    private static final C16773h f36453o = C16773h.n("\"\\");

    /* renamed from: p  reason: collision with root package name */
    private static final C16773h f36454p = C16773h.n("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: q  reason: collision with root package name */
    private static final C16773h f36455q = C16773h.n("\n\r");

    /* renamed from: r  reason: collision with root package name */
    private static final C16773h f36456r = C16773h.n("*/");

    /* renamed from: h  reason: collision with root package name */
    private final C16772g f36457h;

    /* renamed from: i  reason: collision with root package name */
    private final C16770e f36458i;

    /* renamed from: j  reason: collision with root package name */
    private int f36459j = 0;

    /* renamed from: k  reason: collision with root package name */
    private long f36460k;

    /* renamed from: l  reason: collision with root package name */
    private int f36461l;

    /* renamed from: m  reason: collision with root package name */
    private String f36462m;

    e(C16772g gVar) {
        if (gVar != null) {
            this.f36457h = gVar;
            this.f36458i = gVar.S();
            l(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    private String B() {
        long b32 = this.f36457h.b3(f36454p);
        return b32 != -1 ? this.f36458i.B1(b32) : this.f36458i.l0();
    }

    private int F() {
        int i10;
        String str;
        String str2;
        byte u10 = this.f36458i.u(0);
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
            if (!this.f36457h.V0((long) i12)) {
                return 0;
            }
            byte u11 = this.f36458i.u((long) i11);
            if (u11 != str2.charAt(i11) && u11 != str.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f36457h.V0((long) (length + 1)) && w(this.f36458i.u((long) length))) {
            return 0;
        }
        this.f36458i.M((long) length);
        this.f36459j = i10;
        return i10;
    }

    private int J() {
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
            if (!this.f36457h.V0((long) i11)) {
                break;
            }
            u10 = this.f36458i.u((long) i10);
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
        if (w(u10)) {
            return 0;
        }
        if (c11 == 2 && z12 && ((j10 != Long.MIN_VALUE || z11) && (j10 != 0 || !z11))) {
            if (!z11) {
                j10 = -j10;
            }
            this.f36460k = j10;
            this.f36458i.M((long) i10);
            this.f36459j = 16;
            return 16;
        } else if (c11 != 2 && c11 != 4 && c11 != 7) {
            return 0;
        } else {
            this.f36461l = i10;
            this.f36459j = 17;
            return 17;
        }
    }

    private char N() {
        int i10;
        if (this.f36457h.V0(1)) {
            byte readByte = this.f36458i.readByte();
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
                if (this.f36448e) {
                    return (char) readByte;
                }
                throw s("Invalid escape sequence: \\" + ((char) readByte));
            } else if (this.f36457h.V0(4)) {
                char c10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    byte u10 = this.f36458i.u((long) i11);
                    char c11 = (char) (c10 << 4);
                    if (u10 >= 48 && u10 <= 57) {
                        i10 = u10 - 48;
                    } else if (u10 >= 97 && u10 <= 102) {
                        i10 = u10 - 87;
                    } else if (u10 < 65 || u10 > 70) {
                        throw s("\\u" + this.f36458i.B1(4));
                    } else {
                        i10 = u10 - 55;
                    }
                    c10 = (char) (c11 + i10);
                }
                this.f36458i.M(4);
                return c10;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + m());
            }
        } else {
            throw s("Unterminated escape sequence");
        }
    }

    private void U(C16773h hVar) {
        while (true) {
            long b32 = this.f36457h.b3(hVar);
            if (b32 == -1) {
                throw s("Unterminated string");
            } else if (this.f36458i.u(b32) == 92) {
                this.f36458i.M(b32 + 1);
                N();
            } else {
                this.f36458i.M(b32 + 1);
                return;
            }
        }
    }

    private boolean e0() {
        C16772g gVar = this.f36457h;
        C16773h hVar = f36456r;
        long S12 = gVar.S1(hVar);
        boolean z10 = S12 != -1;
        C16770e eVar = this.f36458i;
        eVar.M(z10 ? S12 + ((long) hVar.W()) : eVar.size());
        return z10;
    }

    private void f0() {
        long b32 = this.f36457h.b3(f36455q);
        C16770e eVar = this.f36458i;
        eVar.M(b32 != -1 ? b32 + 1 : eVar.size());
    }

    private void h0() {
        long b32 = this.f36457h.b3(f36454p);
        C16770e eVar = this.f36458i;
        if (b32 == -1) {
            b32 = eVar.size();
        }
        eVar.M(b32);
    }

    private void t() {
        if (!this.f36448e) {
            throw s("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int u() {
        int[] iArr = this.f36445b;
        int i10 = this.f36444a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int x10 = x(true);
            this.f36458i.readByte();
            if (x10 != 44) {
                if (x10 == 59) {
                    t();
                } else if (x10 == 93) {
                    this.f36459j = 4;
                    return 4;
                } else {
                    throw s("Unterminated array");
                }
            }
        } else if (i11 == 3 || i11 == 5) {
            iArr[i10 - 1] = 4;
            if (i11 == 5) {
                int x11 = x(true);
                this.f36458i.readByte();
                if (x11 != 44) {
                    if (x11 == 59) {
                        t();
                    } else if (x11 == 125) {
                        this.f36459j = 2;
                        return 2;
                    } else {
                        throw s("Unterminated object");
                    }
                }
            }
            int x12 = x(true);
            if (x12 == 34) {
                this.f36458i.readByte();
                this.f36459j = 13;
                return 13;
            } else if (x12 == 39) {
                this.f36458i.readByte();
                t();
                this.f36459j = 12;
                return 12;
            } else if (x12 != 125) {
                t();
                if (w((char) x12)) {
                    this.f36459j = 14;
                    return 14;
                }
                throw s("Expected name");
            } else if (i11 != 5) {
                this.f36458i.readByte();
                this.f36459j = 2;
                return 2;
            } else {
                throw s("Expected name");
            }
        } else if (i11 == 4) {
            iArr[i10 - 1] = 5;
            int x13 = x(true);
            this.f36458i.readByte();
            if (x13 != 58) {
                if (x13 == 61) {
                    t();
                    if (this.f36457h.V0(1) && this.f36458i.u(0) == 62) {
                        this.f36458i.readByte();
                    }
                } else {
                    throw s("Expected ':'");
                }
            }
        } else if (i11 == 6) {
            iArr[i10 - 1] = 7;
        } else if (i11 == 7) {
            if (x(false) == -1) {
                this.f36459j = 18;
                return 18;
            }
            t();
        } else if (i11 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int x14 = x(true);
        if (x14 == 34) {
            this.f36458i.readByte();
            this.f36459j = 9;
            return 9;
        } else if (x14 != 39) {
            if (!(x14 == 44 || x14 == 59)) {
                if (x14 == 91) {
                    this.f36458i.readByte();
                    this.f36459j = 3;
                    return 3;
                } else if (x14 != 93) {
                    if (x14 != 123) {
                        int F10 = F();
                        if (F10 != 0) {
                            return F10;
                        }
                        int J10 = J();
                        if (J10 != 0) {
                            return J10;
                        }
                        if (w(this.f36458i.u(0))) {
                            t();
                            this.f36459j = 10;
                            return 10;
                        }
                        throw s("Expected value");
                    }
                    this.f36458i.readByte();
                    this.f36459j = 1;
                    return 1;
                } else if (i11 == 1) {
                    this.f36458i.readByte();
                    this.f36459j = 4;
                    return 4;
                }
            }
            if (i11 == 1 || i11 == 2) {
                t();
                this.f36459j = 7;
                return 7;
            }
            throw s("Unexpected value");
        } else {
            t();
            this.f36458i.readByte();
            this.f36459j = 8;
            return 8;
        }
    }

    private int v(String str, c.a aVar) {
        int length = aVar.f36450a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f36450a[i10])) {
                this.f36459j = 0;
                this.f36446c[this.f36444a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private boolean w(int i10) {
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
        t();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f36458i.M((long) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r2 != 47) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r6.f36457h.V0(2) != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        t();
        r3 = r6.f36458i.u(1);
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
        r6.f36458i.readByte();
        r6.f36458i.readByte();
        f0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r6.f36458i.readByte();
        r6.f36458i.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (e0() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        throw s("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        if (r2 != 35) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        t();
        f0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int x(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            WK.g r2 = r6.f36457h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.V0(r4)
            if (r2 == 0) goto L_0x0080
            WK.e r2 = r6.f36458i
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
            WK.e r3 = r6.f36458i
            long r4 = (long) r1
            r3.M(r4)
            r1 = 47
            if (r2 != r1) goto L_0x0072
            WK.g r3 = r6.f36457h
            r4 = 2
            boolean r3 = r3.V0(r4)
            if (r3 != 0) goto L_0x003a
            return r2
        L_0x003a:
            r6.t()
            WK.e r3 = r6.f36458i
            r4 = 1
            byte r3 = r3.u(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005a
            if (r3 == r1) goto L_0x004c
            return r2
        L_0x004c:
            WK.e r1 = r6.f36458i
            r1.readByte()
            WK.e r1 = r6.f36458i
            r1.readByte()
            r6.f0()
            goto L_0x0001
        L_0x005a:
            WK.e r1 = r6.f36458i
            r1.readByte()
            WK.e r1 = r6.f36458i
            r1.readByte()
            boolean r1 = r6.e0()
            if (r1 == 0) goto L_0x006b
            goto L_0x0001
        L_0x006b:
            java.lang.String r7 = "Unterminated comment"
            H6.b r7 = r6.s(r7)
            throw r7
        L_0x0072:
            r1 = 35
            if (r2 != r1) goto L_0x007d
            r6.t()
            r6.f0()
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
        throw new UnsupportedOperationException("Method not decompiled: H6.e.x(boolean):int");
    }

    private String z(C16773h hVar) {
        StringBuilder sb2 = null;
        while (true) {
            long b32 = this.f36457h.b3(hVar);
            if (b32 == -1) {
                throw s("Unterminated string");
            } else if (this.f36458i.u(b32) == 92) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f36458i.B1(b32));
                this.f36458i.readByte();
                sb2.append(N());
            } else if (sb2 == null) {
                String B12 = this.f36458i.B1(b32);
                this.f36458i.readByte();
                return B12;
            } else {
                sb2.append(this.f36458i.B1(b32));
                this.f36458i.readByte();
                return sb2.toString();
            }
        }
    }

    public String B0() {
        String str;
        int i10 = this.f36459j;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 14) {
            str = B();
        } else if (i10 == 13) {
            str = z(f36453o);
        } else if (i10 == 12) {
            str = z(f36452n);
        } else if (i10 == 15) {
            str = this.f36462m;
        } else {
            throw new a("Expected a name but was " + i() + " at path " + m());
        }
        this.f36459j = 0;
        this.f36446c[this.f36444a - 1] = str;
        return str;
    }

    public String C1() {
        String str;
        int i10 = this.f36459j;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 10) {
            str = B();
        } else if (i10 == 9) {
            str = z(f36453o);
        } else if (i10 == 8) {
            str = z(f36452n);
        } else if (i10 == 11) {
            str = this.f36462m;
            this.f36462m = null;
        } else if (i10 == 16) {
            str = Long.toString(this.f36460k);
        } else if (i10 == 17) {
            str = this.f36458i.B1((long) this.f36461l);
        } else {
            throw new a("Expected a string but was " + i() + " at path " + m());
        }
        this.f36459j = 0;
        int[] iArr = this.f36447d;
        int i11 = this.f36444a - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public int G0() {
        int i10 = this.f36459j;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 16) {
            long j10 = this.f36460k;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.f36459j = 0;
                int[] iArr = this.f36447d;
                int i12 = this.f36444a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new a("Expected an int but was " + this.f36460k + " at path " + m());
        }
        if (i10 == 17) {
            this.f36462m = this.f36458i.B1((long) this.f36461l);
        } else if (i10 == 9 || i10 == 8) {
            String z10 = i10 == 9 ? z(f36453o) : z(f36452n);
            this.f36462m = z10;
            try {
                int parseInt = Integer.parseInt(z10);
                this.f36459j = 0;
                int[] iArr2 = this.f36447d;
                int i13 = this.f36444a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            throw new a("Expected an int but was " + i() + " at path " + m());
        }
        this.f36459j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f36462m);
            int i14 = (int) parseDouble;
            if (((double) i14) == parseDouble) {
                this.f36462m = null;
                this.f36459j = 0;
                int[] iArr3 = this.f36447d;
                int i15 = this.f36444a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.f36462m + " at path " + m());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f36462m + " at path " + m());
        }
    }

    public void a0() {
        if (!this.f36449f) {
            int i10 = 0;
            do {
                int i11 = this.f36459j;
                if (i11 == 0) {
                    i11 = u();
                }
                if (i11 == 3) {
                    l(1);
                } else if (i11 == 1) {
                    l(3);
                } else {
                    if (i11 == 4) {
                        i10--;
                        if (i10 >= 0) {
                            this.f36444a--;
                        } else {
                            throw new a("Expected a value but was " + i() + " at path " + m());
                        }
                    } else if (i11 == 2) {
                        i10--;
                        if (i10 >= 0) {
                            this.f36444a--;
                        } else {
                            throw new a("Expected a value but was " + i() + " at path " + m());
                        }
                    } else if (i11 == 14 || i11 == 10) {
                        h0();
                    } else if (i11 == 9 || i11 == 13) {
                        U(f36453o);
                    } else if (i11 == 8 || i11 == 12) {
                        U(f36452n);
                    } else if (i11 == 17) {
                        this.f36458i.M((long) this.f36461l);
                    } else if (i11 == 18) {
                        throw new a("Expected a value but was " + i() + " at path " + m());
                    }
                    this.f36459j = 0;
                }
                i10++;
                this.f36459j = 0;
            } while (i10 != 0);
            int[] iArr = this.f36447d;
            int i12 = this.f36444a;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f36446c[i12 - 1] = "null";
            return;
        }
        throw new a("Cannot skip unexpected " + i() + " at " + m());
    }

    public void close() {
        this.f36459j = 0;
        this.f36445b[0] = 8;
        this.f36444a = 1;
        this.f36458i.c();
        this.f36457h.close();
    }

    public void d() {
        int i10 = this.f36459j;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 3) {
            l(1);
            this.f36447d[this.f36444a - 1] = 0;
            this.f36459j = 0;
            return;
        }
        throw new a("Expected BEGIN_ARRAY but was " + i() + " at path " + m());
    }

    public double d2() {
        int i10 = this.f36459j;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 16) {
            this.f36459j = 0;
            int[] iArr = this.f36447d;
            int i11 = this.f36444a - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f36460k;
        }
        if (i10 == 17) {
            this.f36462m = this.f36458i.B1((long) this.f36461l);
        } else if (i10 == 9) {
            this.f36462m = z(f36453o);
        } else if (i10 == 8) {
            this.f36462m = z(f36452n);
        } else if (i10 == 10) {
            this.f36462m = B();
        } else if (i10 != 11) {
            throw new a("Expected a double but was " + i() + " at path " + m());
        }
        this.f36459j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f36462m);
            if (this.f36448e || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f36462m = null;
                this.f36459j = 0;
                int[] iArr2 = this.f36447d;
                int i12 = this.f36444a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseDouble;
            }
            throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + m());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f36462m + " at path " + m());
        }
    }

    public void e() {
        int i10 = this.f36459j;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 1) {
            l(3);
            this.f36459j = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + i() + " at path " + m());
    }

    public void f() {
        int i10 = this.f36459j;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 4) {
            int i11 = this.f36444a;
            this.f36444a = i11 - 1;
            int[] iArr = this.f36447d;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f36459j = 0;
            return;
        }
        throw new a("Expected END_ARRAY but was " + i() + " at path " + m());
    }

    public void g() {
        int i10 = this.f36459j;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 2) {
            int i11 = this.f36444a;
            int i12 = i11 - 1;
            this.f36444a = i12;
            this.f36446c[i12] = null;
            int[] iArr = this.f36447d;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.f36459j = 0;
            return;
        }
        throw new a("Expected END_OBJECT but was " + i() + " at path " + m());
    }

    public boolean hasNext() {
        int i10 = this.f36459j;
        if (i10 == 0) {
            i10 = u();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    public c.b i() {
        int i10 = this.f36459j;
        if (i10 == 0) {
            i10 = u();
        }
        switch (i10) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public int n(c.a aVar) {
        int i10 = this.f36459j;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return v(this.f36462m, aVar);
        }
        int z12 = this.f36457h.z1(aVar.f36451b);
        if (z12 != -1) {
            this.f36459j = 0;
            this.f36446c[this.f36444a - 1] = aVar.f36450a[z12];
            return z12;
        }
        String str = this.f36446c[this.f36444a - 1];
        String B02 = B0();
        int v10 = v(B02, aVar);
        if (v10 == -1) {
            this.f36459j = 15;
            this.f36462m = B02;
            this.f36446c[this.f36444a - 1] = str;
        }
        return v10;
    }

    public void o() {
        if (!this.f36449f) {
            int i10 = this.f36459j;
            if (i10 == 0) {
                i10 = u();
            }
            if (i10 == 14) {
                h0();
            } else if (i10 == 13) {
                U(f36453o);
            } else if (i10 == 12) {
                U(f36452n);
            } else if (i10 != 15) {
                throw new a("Expected a name but was " + i() + " at path " + m());
            }
            this.f36459j = 0;
            this.f36446c[this.f36444a - 1] = "null";
            return;
        }
        throw new a("Cannot skip unexpected " + i() + " at " + m());
    }

    public String toString() {
        return "JsonReader(" + this.f36457h + ")";
    }

    public boolean w1() {
        int i10 = this.f36459j;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 5) {
            this.f36459j = 0;
            int[] iArr = this.f36447d;
            int i11 = this.f36444a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f36459j = 0;
            int[] iArr2 = this.f36447d;
            int i12 = this.f36444a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new a("Expected a boolean but was " + i() + " at path " + m());
        }
    }
}
