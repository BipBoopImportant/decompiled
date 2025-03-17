package Tc;

import com.google.gson.internal.e;
import com.google.gson.internal.o;
import com.google.gson.s;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Reader f63858a;

    /* renamed from: b  reason: collision with root package name */
    private s f63859b = s.LEGACY_STRICT;

    /* renamed from: c  reason: collision with root package name */
    private final char[] f63860c = new char[1024];

    /* renamed from: d  reason: collision with root package name */
    private int f63861d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f63862e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f63863f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f63864g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f63865h = 0;

    /* renamed from: i  reason: collision with root package name */
    private long f63866i;

    /* renamed from: j  reason: collision with root package name */
    private int f63867j;

    /* renamed from: k  reason: collision with root package name */
    private String f63868k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f63869l;

    /* renamed from: m  reason: collision with root package name */
    private int f63870m;

    /* renamed from: n  reason: collision with root package name */
    private String[] f63871n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f63872o;

    /* renamed from: Tc.a$a  reason: collision with other inner class name */
    class C1113a extends e {
        C1113a() {
        }

        public void a(a aVar) {
            if (aVar instanceof com.google.gson.internal.bind.a) {
                ((com.google.gson.internal.bind.a) aVar).K0();
                return;
            }
            int i10 = aVar.f63865h;
            if (i10 == 0) {
                i10 = aVar.h();
            }
            if (i10 == 13) {
                aVar.f63865h = 9;
            } else if (i10 == 12) {
                aVar.f63865h = 8;
            } else if (i10 == 14) {
                aVar.f63865h = 10;
            } else {
                throw aVar.p0("a name");
            }
        }
    }

    static {
        e.f69131a = new C1113a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f63869l = iArr;
        this.f63870m = 1;
        iArr[0] = 6;
        this.f63871n = new String[32];
        this.f63872o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f63858a = reader;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String B() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r1
        L_0x0003:
            int r3 = r6.f63861d
            int r4 = r3 + r2
            int r5 = r6.f63862e
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f63860c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.f()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f63860c
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.n(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r1 = r2
            goto L_0x007e
        L_0x005e:
            if (r0 != 0) goto L_0x006b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f63860c
            int r4 = r6.f63861d
            r0.append(r3, r4, r2)
            int r3 = r6.f63861d
            int r3 = r3 + r2
            r6.f63861d = r3
            r2 = 1
            boolean r2 = r6.n(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f63860c
            int r3 = r6.f63861d
            r0.<init>(r2, r3, r1)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f63860c
            int r3 = r6.f63861d
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L_0x0095:
            int r2 = r6.f63861d
            int r2 = r2 + r1
            r6.f63861d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Tc.a.B():java.lang.String");
    }

    private int J() {
        int i10;
        String str;
        String str2;
        char c10 = this.f63860c[this.f63861d];
        if (c10 == 't' || c10 == 'T') {
            str2 = "true";
            str = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str2 = "false";
            str = "FALSE";
            i10 = 6;
        } else if (c10 != 'n' && c10 != 'N') {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i10 = 7;
        }
        boolean z10 = this.f63859b != s.STRICT;
        int length = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f63861d + i11 >= this.f63862e && !n(i11 + 1)) {
                return 0;
            }
            char c11 = this.f63860c[this.f63861d + i11];
            if (c11 != str2.charAt(i11) && (!z10 || c11 != str.charAt(i11))) {
                return 0;
            }
        }
        if ((this.f63861d + length < this.f63862e || n(length + 1)) && u(this.f63860c[this.f63861d + length])) {
            return 0;
        }
        this.f63861d += length;
        this.f63865h = i10;
        return i10;
    }

    private int N() {
        char c10;
        char c11;
        char[] cArr = this.f63860c;
        int i10 = this.f63861d;
        int i11 = this.f63862e;
        int i12 = 0;
        int i13 = 0;
        char c12 = 0;
        boolean z10 = false;
        boolean z11 = true;
        long j10 = 0;
        while (true) {
            if (i10 + i13 == i11) {
                if (i13 == cArr.length) {
                    return i12;
                }
                if (!n(i13 + 1)) {
                    break;
                }
                i10 = this.f63861d;
                i11 = this.f63862e;
            }
            c10 = cArr[i10 + i13];
            if (c10 == '+') {
                c11 = 6;
                i12 = 0;
                if (c12 != 5) {
                    return 0;
                }
            } else if (c10 == 'E' || c10 == 'e') {
                i12 = 0;
                if (c12 != 2 && c12 != 4) {
                    return 0;
                }
                c12 = 5;
                i13++;
            } else if (c10 != '-') {
                c11 = 3;
                if (c10 == '.') {
                    i12 = 0;
                    if (c12 != 2) {
                        return 0;
                    }
                } else if (c10 >= '0' && c10 <= '9') {
                    if (c12 == 1 || c12 == 0) {
                        j10 = (long) (-(c10 - '0'));
                        c12 = 2;
                    } else if (c12 != 2) {
                        if (c12 == 3) {
                            i12 = 0;
                            c12 = 4;
                        } else if (c12 == 5 || c12 == 6) {
                            i12 = 0;
                            c12 = 7;
                        }
                        i13++;
                    } else if (j10 == 0) {
                        return 0;
                    } else {
                        long j11 = (10 * j10) - ((long) (c10 - '0'));
                        int i14 = (j10 > -922337203685477580L ? 1 : (j10 == -922337203685477580L ? 0 : -1));
                        z11 &= i14 > 0 || (i14 == 0 && j11 < j10);
                        j10 = j11;
                    }
                    i12 = 0;
                    i13++;
                }
            } else {
                c11 = 6;
                i12 = 0;
                if (c12 == 0) {
                    c12 = 1;
                    z10 = true;
                    i13++;
                } else if (c12 != 5) {
                    return 0;
                }
            }
            c12 = c11;
            i13++;
        }
        if (u(c10)) {
            return 0;
        }
        if (c12 == 2 && z11 && ((j10 != Long.MIN_VALUE || z10) && (j10 != 0 || !z10))) {
            if (!z10) {
                j10 = -j10;
            }
            this.f63866i = j10;
            this.f63861d += i13;
            this.f63865h = 15;
            return 15;
        } else if (c12 != 2 && c12 != 4 && c12 != 7) {
            return 0;
        } else {
            this.f63867j = i13;
            this.f63865h = 16;
            return 16;
        }
    }

    private void U(int i10) {
        int i11 = this.f63870m;
        int[] iArr = this.f63869l;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f63869l = Arrays.copyOf(iArr, i12);
            this.f63872o = Arrays.copyOf(this.f63872o, i12);
            this.f63871n = (String[]) Arrays.copyOf(this.f63871n, i12);
        }
        int[] iArr2 = this.f63869l;
        int i13 = this.f63870m;
        this.f63870m = i13 + 1;
        iArr2[i13] = i10;
    }

    private char e0() {
        int i10;
        if (this.f63861d != this.f63862e || n(1)) {
            char[] cArr = this.f63860c;
            int i11 = this.f63861d;
            int i12 = i11 + 1;
            this.f63861d = i12;
            char c10 = cArr[i11];
            if (c10 != 10) {
                if (c10 != '\"') {
                    if (c10 != '\'') {
                        if (!(c10 == '/' || c10 == '\\')) {
                            if (c10 == 'b') {
                                return 8;
                            }
                            if (c10 == 'f') {
                                return 12;
                            }
                            if (c10 == 'n') {
                                return 10;
                            }
                            if (c10 == 'r') {
                                return 13;
                            }
                            if (c10 == 't') {
                                return 9;
                            }
                            if (c10 != 'u') {
                                throw o0("Invalid escape sequence");
                            } else if (i11 + 5 <= this.f63862e || n(4)) {
                                int i13 = this.f63861d;
                                int i14 = i13 + 4;
                                int i15 = 0;
                                while (i13 < i14) {
                                    char c11 = this.f63860c[i13];
                                    int i16 = i15 << 4;
                                    if (c11 >= '0' && c11 <= '9') {
                                        i10 = c11 - '0';
                                    } else if (c11 >= 'a' && c11 <= 'f') {
                                        i10 = c11 - 'W';
                                    } else if (c11 < 'A' || c11 > 'F') {
                                        throw o0("Malformed Unicode escape \\u" + new String(this.f63860c, this.f63861d, 4));
                                    } else {
                                        i10 = c11 - '7';
                                    }
                                    i15 = i16 + i10;
                                    i13++;
                                }
                                this.f63861d += 4;
                                return (char) i15;
                            } else {
                                throw o0("Unterminated escape sequence");
                            }
                        }
                    }
                }
                return c10;
            } else if (this.f63859b != s.STRICT) {
                this.f63863f++;
                this.f63864g = i12;
            } else {
                throw o0("Cannot escape a newline character in strict mode");
            }
            if (this.f63859b == s.STRICT) {
                throw o0("Invalid escaped character \"'\" in strict mode");
            }
            return c10;
        }
        throw o0("Unterminated escape sequence");
    }

    private void f() {
        if (this.f63859b != s.LENIENT) {
            throw o0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void g() {
        w(true);
        int i10 = this.f63861d;
        this.f63861d = i10 - 1;
        if (i10 + 4 <= this.f63862e || n(5)) {
            int i11 = this.f63861d;
            char[] cArr = this.f63860c;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == 10) {
                this.f63861d = i11 + 5;
            }
        }
    }

    private void h0(char c10) {
        char[] cArr = this.f63860c;
        do {
            int i10 = this.f63861d;
            int i11 = this.f63862e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f63861d = i12;
                    return;
                } else if (c11 == '\\') {
                    this.f63861d = i12;
                    e0();
                    i10 = this.f63861d;
                    i11 = this.f63862e;
                } else {
                    if (c11 == 10) {
                        this.f63863f++;
                        this.f63864g = i12;
                    }
                    i10 = i12;
                }
            }
            this.f63861d = i10;
        } while (n(1));
        throw o0("Unterminated string");
    }

    private boolean i0(String str) {
        int length = str.length();
        while (true) {
            int i10 = 0;
            if (this.f63861d + length > this.f63862e && !n(length)) {
                return false;
            }
            char[] cArr = this.f63860c;
            int i11 = this.f63861d;
            if (cArr[i11] == 10) {
                this.f63863f++;
                this.f63864g = i11 + 1;
            } else {
                while (i10 < length) {
                    if (this.f63860c[this.f63861d + i10] == str.charAt(i10)) {
                        i10++;
                    }
                }
                return true;
            }
            this.f63861d++;
        }
    }

    private void j0() {
        char c10;
        do {
            if (this.f63861d < this.f63862e || n(1)) {
                char[] cArr = this.f63860c;
                int i10 = this.f63861d;
                int i11 = i10 + 1;
                this.f63861d = i11;
                c10 = cArr[i10];
                if (c10 == 10) {
                    this.f63863f++;
                    this.f63864g = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l0() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f63861d
            int r2 = r1 + r0
            int r3 = r4.f63862e
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f63860c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.f()
        L_0x004b:
            int r1 = r4.f63861d
            int r1 = r1 + r0
            r4.f63861d = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f63861d = r1
            r0 = 1
            boolean r0 = r4.n(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Tc.a.l0():void");
    }

    private boolean n(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f63860c;
        int i13 = this.f63864g;
        int i14 = this.f63861d;
        this.f63864g = i13 - i14;
        int i15 = this.f63862e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f63862e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f63862e = 0;
        }
        this.f63861d = 0;
        do {
            Reader reader = this.f63858a;
            int i17 = this.f63862e;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f63862e + read;
            this.f63862e = i11;
            if (this.f63863f == 0 && (i12 = this.f63864g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f63861d++;
                this.f63864g = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    private String o(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f63870m;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f63869l[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f63872o[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f63871n[i10];
                    if (str == null) {
                        break;
                    } else {
                        sb2.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i12);
            }
            i10++;
        }
    }

    private d o0(String str) {
        throw new d(str + v() + "\nSee " + o.a("malformed-json"));
    }

    /* access modifiers changed from: private */
    public IllegalStateException p0(String str) {
        String str2 = F() == b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        return new IllegalStateException("Expected " + str + " but was " + F() + v() + "\nSee " + o.a(str2));
    }

    private boolean u(char c10) {
        if (c10 == 9 || c10 == 10 || c10 == 12 || c10 == 13 || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (!(c10 == '/' || c10 == '=')) {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        f();
        return false;
    }

    private int w(boolean z10) {
        char[] cArr = this.f63860c;
        int i10 = this.f63861d;
        int i11 = this.f63862e;
        while (true) {
            if (i10 == i11) {
                this.f63861d = i10;
                if (n(1)) {
                    i10 = this.f63861d;
                    i11 = this.f63862e;
                } else if (!z10) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + v());
                }
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == 10) {
                this.f63863f++;
                this.f63864g = i12;
            } else if (!(c10 == ' ' || c10 == 13 || c10 == 9)) {
                if (c10 == '/') {
                    this.f63861d = i12;
                    if (i12 == i11) {
                        this.f63861d = i10;
                        boolean n10 = n(2);
                        this.f63861d++;
                        if (!n10) {
                            return c10;
                        }
                    }
                    f();
                    int i13 = this.f63861d;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f63861d = i13 + 1;
                        if (i0("*/")) {
                            i10 = this.f63861d + 2;
                            i11 = this.f63862e;
                        } else {
                            throw o0("Unterminated comment");
                        }
                    } else if (c11 != '/') {
                        return c10;
                    } else {
                        this.f63861d = i13 + 1;
                        j0();
                        i10 = this.f63861d;
                        i11 = this.f63862e;
                    }
                } else if (c10 == '#') {
                    this.f63861d = i12;
                    f();
                    j0();
                    i10 = this.f63861d;
                    i11 = this.f63862e;
                } else {
                    this.f63861d = i12;
                    return c10;
                }
            }
            i10 = i12;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        if (r1 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        r1.append(r0, r3, r2 - r3);
        r10.f63861d = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String z(char r11) {
        /*
            r10 = this;
            char[] r0 = r10.f63860c
            r1 = 0
        L_0x0003:
            int r2 = r10.f63861d
            int r3 = r10.f63862e
        L_0x0007:
            r4 = r3
            r3 = r2
        L_0x0009:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L_0x006c
            int r7 = r2 + 1
            char r2 = r0[r2]
            com.google.gson.s r8 = r10.f63859b
            com.google.gson.s r9 = com.google.gson.s.STRICT
            if (r8 != r9) goto L_0x0024
            r8 = 32
            if (r2 < r8) goto L_0x001d
            goto L_0x0024
        L_0x001d:
            java.lang.String r11 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            Tc.d r11 = r10.o0(r11)
            throw r11
        L_0x0024:
            if (r2 != r11) goto L_0x003a
            r10.f63861d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0032
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r3, r7)
            return r11
        L_0x0032:
            r1.append(r0, r3, r7)
            java.lang.String r11 = r1.toString()
            return r11
        L_0x003a:
            r8 = 92
            if (r2 != r8) goto L_0x005f
            r10.f63861d = r7
            int r7 = r7 - r3
            int r2 = r7 + -1
            if (r1 != 0) goto L_0x0050
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L_0x0050:
            r1.append(r0, r3, r2)
            char r2 = r10.e0()
            r1.append(r2)
            int r2 = r10.f63861d
            int r3 = r10.f63862e
            goto L_0x0007
        L_0x005f:
            r5 = 10
            if (r2 != r5) goto L_0x006a
            int r2 = r10.f63863f
            int r2 = r2 + r6
            r10.f63863f = r2
            r10.f63864g = r7
        L_0x006a:
            r2 = r7
            goto L_0x0009
        L_0x006c:
            if (r1 != 0) goto L_0x007c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L_0x007c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r10.f63861d = r2
            boolean r2 = r10.n(r6)
            if (r2 == 0) goto L_0x008b
            goto L_0x0003
        L_0x008b:
            java.lang.String r11 = "Unterminated string"
            Tc.d r11 = r10.o0(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Tc.a.z(char):java.lang.String");
    }

    public String B0() {
        String str;
        int i10 = this.f63865h;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 14) {
            str = B();
        } else if (i10 == 12) {
            str = z('\'');
        } else if (i10 == 13) {
            str = z('\"');
        } else {
            throw p0("a name");
        }
        this.f63865h = 0;
        this.f63871n[this.f63870m - 1] = str;
        return str;
    }

    public String C1() {
        String str;
        int i10 = this.f63865h;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 10) {
            str = B();
        } else if (i10 == 8) {
            str = z('\'');
        } else if (i10 == 9) {
            str = z('\"');
        } else if (i10 == 11) {
            str = this.f63868k;
            this.f63868k = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f63866i);
        } else if (i10 == 16) {
            str = new String(this.f63860c, this.f63861d, this.f63867j);
            this.f63861d += this.f63867j;
        } else {
            throw p0("a string");
        }
        this.f63865h = 0;
        int[] iArr = this.f63872o;
        int i11 = this.f63870m - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public b F() {
        int i10 = this.f63865h;
        if (i10 == 0) {
            i10 = h();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public int G0() {
        int i10 = this.f63865h;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 15) {
            long j10 = this.f63866i;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.f63865h = 0;
                int[] iArr = this.f63872o;
                int i12 = this.f63870m - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f63866i + v());
        }
        if (i10 == 16) {
            this.f63868k = new String(this.f63860c, this.f63861d, this.f63867j);
            this.f63861d += this.f63867j;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                this.f63868k = B();
            } else {
                this.f63868k = z(i10 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f63868k);
                this.f63865h = 0;
                int[] iArr2 = this.f63872o;
                int i13 = this.f63870m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw p0("an int");
        }
        this.f63865h = 11;
        double parseDouble = Double.parseDouble(this.f63868k);
        int i14 = (int) parseDouble;
        if (((double) i14) == parseDouble) {
            this.f63868k = null;
            this.f63865h = 0;
            int[] iArr3 = this.f63872o;
            int i15 = this.f63870m - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f63868k + v());
    }

    public long U2() {
        int i10 = this.f63865h;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 15) {
            this.f63865h = 0;
            int[] iArr = this.f63872o;
            int i11 = this.f63870m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f63866i;
        }
        if (i10 == 16) {
            this.f63868k = new String(this.f63860c, this.f63861d, this.f63867j);
            this.f63861d += this.f63867j;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                this.f63868k = B();
            } else {
                this.f63868k = z(i10 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f63868k);
                this.f63865h = 0;
                int[] iArr2 = this.f63872o;
                int i12 = this.f63870m - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw p0("a long");
        }
        this.f63865h = 11;
        double parseDouble = Double.parseDouble(this.f63868k);
        long j10 = (long) parseDouble;
        if (((double) j10) == parseDouble) {
            this.f63868k = null;
            this.f63865h = 0;
            int[] iArr3 = this.f63872o;
            int i13 = this.f63870m - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.f63868k + v());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r7.f63865h = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a0() {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r7.f63865h
            if (r2 != 0) goto L_0x000a
            int r2 = r7.h()
        L_0x000a:
            r3 = 39
            r4 = 34
            java.lang.String r5 = "<skipped>"
            r6 = 1
            switch(r2) {
                case 1: goto L_0x006f;
                case 2: goto L_0x005f;
                case 3: goto L_0x0059;
                case 4: goto L_0x0051;
                case 5: goto L_0x0014;
                case 6: goto L_0x0014;
                case 7: goto L_0x0014;
                case 8: goto L_0x004d;
                case 9: goto L_0x0049;
                case 10: goto L_0x0045;
                case 11: goto L_0x0014;
                case 12: goto L_0x0038;
                case 13: goto L_0x002b;
                case 14: goto L_0x001e;
                case 15: goto L_0x0014;
                case 16: goto L_0x0016;
                case 17: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0074
        L_0x0015:
            return
        L_0x0016:
            int r2 = r7.f63861d
            int r3 = r7.f63867j
            int r2 = r2 + r3
            r7.f63861d = r2
            goto L_0x0074
        L_0x001e:
            r7.l0()
            if (r1 != 0) goto L_0x0074
            java.lang.String[] r2 = r7.f63871n
            int r3 = r7.f63870m
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0074
        L_0x002b:
            r7.h0(r4)
            if (r1 != 0) goto L_0x0074
            java.lang.String[] r2 = r7.f63871n
            int r3 = r7.f63870m
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0074
        L_0x0038:
            r7.h0(r3)
            if (r1 != 0) goto L_0x0074
            java.lang.String[] r2 = r7.f63871n
            int r3 = r7.f63870m
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0074
        L_0x0045:
            r7.l0()
            goto L_0x0074
        L_0x0049:
            r7.h0(r4)
            goto L_0x0074
        L_0x004d:
            r7.h0(r3)
            goto L_0x0074
        L_0x0051:
            int r2 = r7.f63870m
            int r2 = r2 - r6
            r7.f63870m = r2
        L_0x0056:
            int r1 = r1 + -1
            goto L_0x0074
        L_0x0059:
            r7.U(r6)
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x0074
        L_0x005f:
            if (r1 != 0) goto L_0x0069
            java.lang.String[] r2 = r7.f63871n
            int r3 = r7.f63870m
            int r3 = r3 - r6
            r4 = 0
            r2[r3] = r4
        L_0x0069:
            int r2 = r7.f63870m
            int r2 = r2 - r6
            r7.f63870m = r2
            goto L_0x0056
        L_0x006f:
            r2 = 3
            r7.U(r2)
            goto L_0x005c
        L_0x0074:
            r7.f63865h = r0
            if (r1 > 0) goto L_0x0002
            int[] r0 = r7.f63872o
            int r1 = r7.f63870m
            int r1 = r1 - r6
            r2 = r0[r1]
            int r2 = r2 + r6
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Tc.a.a0():void");
    }

    public void close() {
        this.f63865h = 0;
        this.f63869l[0] = 8;
        this.f63870m = 1;
        this.f63858a.close();
    }

    public void d() {
        int i10 = this.f63865h;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 3) {
            U(1);
            this.f63872o[this.f63870m - 1] = 0;
            this.f63865h = 0;
            return;
        }
        throw p0("BEGIN_ARRAY");
    }

    public double d2() {
        int i10 = this.f63865h;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 15) {
            this.f63865h = 0;
            int[] iArr = this.f63872o;
            int i11 = this.f63870m - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f63866i;
        }
        if (i10 == 16) {
            this.f63868k = new String(this.f63860c, this.f63861d, this.f63867j);
            this.f63861d += this.f63867j;
        } else if (i10 == 8 || i10 == 9) {
            this.f63868k = z(i10 == 8 ? '\'' : '\"');
        } else if (i10 == 10) {
            this.f63868k = B();
        } else if (i10 != 11) {
            throw p0("a double");
        }
        this.f63865h = 11;
        double parseDouble = Double.parseDouble(this.f63868k);
        if (this.f63859b == s.LENIENT || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f63868k = null;
            this.f63865h = 0;
            int[] iArr2 = this.f63872o;
            int i12 = this.f63870m - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        }
        throw o0("JSON forbids NaN and infinities: " + parseDouble);
    }

    public void e() {
        int i10 = this.f63865h;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 1) {
            U(3);
            this.f63865h = 0;
            return;
        }
        throw p0("BEGIN_OBJECT");
    }

    public final void f0(s sVar) {
        Objects.requireNonNull(sVar);
        this.f63859b = sVar;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        int w10;
        int[] iArr = this.f63869l;
        int i10 = this.f63870m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int w11 = w(true);
            if (w11 != 44) {
                if (w11 == 59) {
                    f();
                } else if (w11 == 93) {
                    this.f63865h = 4;
                    return 4;
                } else {
                    throw o0("Unterminated array");
                }
            }
        } else if (i11 == 3 || i11 == 5) {
            iArr[i10 - 1] = 4;
            if (i11 == 5 && (w10 = w(true)) != 44) {
                if (w10 == 59) {
                    f();
                } else if (w10 == 125) {
                    this.f63865h = 2;
                    return 2;
                } else {
                    throw o0("Unterminated object");
                }
            }
            int w12 = w(true);
            if (w12 == 34) {
                this.f63865h = 13;
                return 13;
            } else if (w12 == 39) {
                f();
                this.f63865h = 12;
                return 12;
            } else if (w12 != 125) {
                f();
                this.f63861d--;
                if (u((char) w12)) {
                    this.f63865h = 14;
                    return 14;
                }
                throw o0("Expected name");
            } else if (i11 != 5) {
                this.f63865h = 2;
                return 2;
            } else {
                throw o0("Expected name");
            }
        } else if (i11 == 4) {
            iArr[i10 - 1] = 5;
            int w13 = w(true);
            if (w13 != 58) {
                if (w13 == 61) {
                    f();
                    if (this.f63861d < this.f63862e || n(1)) {
                        char[] cArr = this.f63860c;
                        int i12 = this.f63861d;
                        if (cArr[i12] == '>') {
                            this.f63861d = i12 + 1;
                        }
                    }
                } else {
                    throw o0("Expected ':'");
                }
            }
        } else if (i11 == 6) {
            if (this.f63859b == s.LENIENT) {
                g();
            }
            this.f63869l[this.f63870m - 1] = 7;
        } else if (i11 == 7) {
            if (w(false) == -1) {
                this.f63865h = 17;
                return 17;
            }
            f();
            this.f63861d--;
        } else if (i11 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int w14 = w(true);
        if (w14 == 34) {
            this.f63865h = 9;
            return 9;
        } else if (w14 != 39) {
            if (!(w14 == 44 || w14 == 59)) {
                if (w14 == 91) {
                    this.f63865h = 3;
                    return 3;
                } else if (w14 != 93) {
                    if (w14 != 123) {
                        this.f63861d--;
                        int J10 = J();
                        if (J10 != 0) {
                            return J10;
                        }
                        int N10 = N();
                        if (N10 != 0) {
                            return N10;
                        }
                        if (u(this.f63860c[this.f63861d])) {
                            f();
                            this.f63865h = 10;
                            return 10;
                        }
                        throw o0("Expected value");
                    }
                    this.f63865h = 1;
                    return 1;
                } else if (i11 == 1) {
                    this.f63865h = 4;
                    return 4;
                }
            }
            if (i11 == 1 || i11 == 2) {
                f();
                this.f63861d--;
                this.f63865h = 7;
                return 7;
            }
            throw o0("Unexpected value");
        } else {
            f();
            this.f63865h = 8;
            return 8;
        }
    }

    public boolean hasNext() {
        int i10 = this.f63865h;
        if (i10 == 0) {
            i10 = h();
        }
        return (i10 == 2 || i10 == 4 || i10 == 17) ? false : true;
    }

    public void i() {
        int i10 = this.f63865h;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 4) {
            int i11 = this.f63870m;
            this.f63870m = i11 - 1;
            int[] iArr = this.f63872o;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f63865h = 0;
            return;
        }
        throw p0("END_ARRAY");
    }

    public void l() {
        int i10 = this.f63865h;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 2) {
            int i11 = this.f63870m;
            int i12 = i11 - 1;
            this.f63870m = i12;
            this.f63871n[i12] = null;
            int[] iArr = this.f63872o;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.f63865h = 0;
            return;
        }
        throw p0("END_OBJECT");
    }

    public String m() {
        return o(false);
    }

    public String q() {
        return o(true);
    }

    public final s s() {
        return this.f63859b;
    }

    public final boolean t() {
        return this.f63859b == s.LENIENT;
    }

    public String toString() {
        return getClass().getSimpleName() + v();
    }

    /* access modifiers changed from: package-private */
    public String v() {
        return " at line " + (this.f63863f + 1) + " column " + ((this.f63861d - this.f63864g) + 1) + " path " + m();
    }

    public boolean w1() {
        int i10 = this.f63865h;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 5) {
            this.f63865h = 0;
            int[] iArr = this.f63872o;
            int i11 = this.f63870m - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f63865h = 0;
            int[] iArr2 = this.f63872o;
            int i12 = this.f63870m - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw p0("a boolean");
        }
    }

    public void x() {
        int i10 = this.f63865h;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 7) {
            this.f63865h = 0;
            int[] iArr = this.f63872o;
            int i11 = this.f63870m - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw p0("null");
    }
}
