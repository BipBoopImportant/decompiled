package com.squareup.moshi;

import WK.C16771f;
import java.io.IOException;

final class n extends q {

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f122376m = new String[128];

    /* renamed from: j  reason: collision with root package name */
    private final C16771f f122377j;

    /* renamed from: k  reason: collision with root package name */
    private String f122378k = ":";

    /* renamed from: l  reason: collision with root package name */
    private String f122379l;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f122376m[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f122376m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    n(C16771f fVar) {
        if (fVar != null) {
            this.f122377j = fVar;
            u(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    private void e0() {
        int s10 = s();
        if (s10 == 5) {
            this.f122377j.Z1(44);
        } else if (s10 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        i0();
        v(4);
    }

    private void f0() {
        int s10 = s();
        int i10 = 2;
        if (s10 != 1) {
            if (s10 != 2) {
                if (s10 == 4) {
                    this.f122377j.D0(this.f122378k);
                    i10 = 5;
                } else if (s10 != 9) {
                    i10 = 7;
                    if (s10 != 6) {
                        if (s10 != 7) {
                            throw new IllegalStateException("Nesting problem.");
                        } else if (!this.f122392f) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    }
                } else {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                v(i10);
            }
            this.f122377j.Z1(44);
        }
        i0();
        v(i10);
    }

    private q h0(int i10, int i11, char c10) {
        int s10 = s();
        if (s10 != i11 && s10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f122379l == null) {
            int i12 = this.f122387a;
            int i13 = this.f122395i;
            if (i12 == (~i13)) {
                this.f122395i = ~i13;
                return this;
            }
            int i14 = i12 - 1;
            this.f122387a = i14;
            this.f122389c[i14] = null;
            int[] iArr = this.f122390d;
            int i15 = i12 - 2;
            iArr[i15] = iArr[i15] + 1;
            if (s10 == i11) {
                i0();
            }
            this.f122377j.Z1(c10);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f122379l);
        }
    }

    private void i0() {
        if (this.f122391e != null) {
            this.f122377j.Z1(10);
            int i10 = this.f122387a;
            for (int i11 = 1; i11 < i10; i11++) {
                this.f122377j.D0(this.f122391e);
            }
        }
    }

    private q j0(int i10, int i11, char c10) {
        int i12 = this.f122387a;
        int i13 = this.f122395i;
        if (i12 == i13) {
            int[] iArr = this.f122388b;
            if (iArr[i12 - 1] == i10 || iArr[i12 - 1] == i11) {
                this.f122395i = ~i13;
                return this;
            }
        }
        f0();
        e();
        u(i10);
        this.f122390d[this.f122387a - 1] = 0;
        this.f122377j.Z1(c10);
        return this;
    }

    static void l0(C16771f fVar, String str) {
        String str2;
        String[] strArr = f122376m;
        fVar.Z1(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i10 < i11) {
                fVar.M0(str, i10, i11);
            }
            fVar.D0(str2);
            i10 = i11 + 1;
        }
        if (i10 < length) {
            fVar.M0(str, i10, length);
        }
        fVar.Z1(34);
    }

    private void o0() {
        if (this.f122379l != null) {
            e0();
            l0(this.f122377j, this.f122379l);
            this.f122379l = null;
        }
    }

    public q B(double d10) {
        if (!this.f122392f && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        } else if (this.f122394h) {
            this.f122394h = false;
            return n(Double.toString(d10));
        } else {
            o0();
            f0();
            this.f122377j.D0(Double.toString(d10));
            int[] iArr = this.f122390d;
            int i10 = this.f122387a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
    }

    public q F(long j10) {
        if (this.f122394h) {
            this.f122394h = false;
            return n(Long.toString(j10));
        }
        o0();
        f0();
        this.f122377j.D0(Long.toString(j10));
        int[] iArr = this.f122390d;
        int i10 = this.f122387a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public q J(Number number) {
        if (number == null) {
            return o();
        }
        String obj = number.toString();
        if (!this.f122392f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f122394h) {
            this.f122394h = false;
            return n(obj);
        } else {
            o0();
            f0();
            this.f122377j.D0(obj);
            int[] iArr = this.f122390d;
            int i10 = this.f122387a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
    }

    public q N(String str) {
        if (str == null) {
            return o();
        }
        if (this.f122394h) {
            this.f122394h = false;
            return n(str);
        }
        o0();
        f0();
        l0(this.f122377j, str);
        int[] iArr = this.f122390d;
        int i10 = this.f122387a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public q U(boolean z10) {
        if (!this.f122394h) {
            o0();
            f0();
            this.f122377j.D0(z10 ? "true" : "false");
            int[] iArr = this.f122390d;
            int i10 = this.f122387a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + m());
    }

    public q c() {
        if (!this.f122394h) {
            o0();
            return j0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m());
    }

    public void close() {
        this.f122377j.close();
        int i10 = this.f122387a;
        if (i10 > 1 || (i10 == 1 && this.f122388b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f122387a = 0;
    }

    public q d() {
        if (!this.f122394h) {
            o0();
            return j0(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m());
    }

    public q f() {
        return h0(1, 2, ']');
    }

    public void flush() {
        if (this.f122387a != 0) {
            this.f122377j.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public q g() {
        this.f122394h = false;
        return h0(3, 5, '}');
    }

    public q n(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f122387a != 0) {
            int s10 = s();
            if ((s10 == 3 || s10 == 5) && this.f122379l == null && !this.f122394h) {
                this.f122379l = str;
                this.f122389c[this.f122387a - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public q o() {
        if (!this.f122394h) {
            if (this.f122379l != null) {
                if (this.f122393g) {
                    o0();
                } else {
                    this.f122379l = null;
                    return this;
                }
            }
            f0();
            this.f122377j.D0("null");
            int[] iArr = this.f122390d;
            int i10 = this.f122387a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + m());
    }

    public void w(String str) {
        super.w(str);
        this.f122378k = !str.isEmpty() ? ": " : ":";
    }
}
