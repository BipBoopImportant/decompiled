package Tc;

import com.google.gson.e;
import com.google.gson.s;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class c implements Closeable, Flushable {

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f63873l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f63874m = new String[128];

    /* renamed from: n  reason: collision with root package name */
    private static final String[] f63875n;

    /* renamed from: a  reason: collision with root package name */
    private final Writer f63876a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f63877b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    private int f63878c = 0;

    /* renamed from: d  reason: collision with root package name */
    private e f63879d;

    /* renamed from: e  reason: collision with root package name */
    private String f63880e;

    /* renamed from: f  reason: collision with root package name */
    private String f63881f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f63882g;

    /* renamed from: h  reason: collision with root package name */
    private s f63883h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f63884i;

    /* renamed from: j  reason: collision with root package name */
    private String f63885j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f63886k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f63874m[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f63874m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f63875n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        z(6);
        this.f63883h = s.LEGACY_STRICT;
        this.f63886k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f63876a = writer;
        F(e.f68909d);
    }

    private void B(int i10) {
        this.f63877b[this.f63878c - 1] = i10;
    }

    private void c() {
        int x10 = x();
        if (x10 == 5) {
            this.f63876a.write(this.f63881f);
        } else if (x10 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        u();
        B(4);
    }

    private void d() {
        int x10 = x();
        if (x10 == 1) {
            B(2);
            u();
        } else if (x10 == 2) {
            this.f63876a.append(this.f63881f);
            u();
        } else if (x10 != 4) {
            if (x10 != 6) {
                if (x10 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (this.f63883h != s.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            B(7);
        } else {
            this.f63876a.append(this.f63880e);
            B(5);
        }
    }

    private void e0(String str) {
        String str2;
        String[] strArr = this.f63884i ? f63875n : f63874m;
        this.f63876a.write(34);
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
                this.f63876a.write(str, i10, i11 - i10);
            }
            this.f63876a.write(str2);
            i10 = i11 + 1;
        }
        if (i10 < length) {
            this.f63876a.write(str, i10, length - i10);
        }
        this.f63876a.write(34);
    }

    private c g(int i10, int i11, char c10) {
        int x10 = x();
        if (x10 != i11 && x10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f63885j == null) {
            this.f63878c--;
            if (x10 == i11) {
                u();
            }
            this.f63876a.write(c10);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f63885j);
        }
    }

    private void p0() {
        if (this.f63885j != null) {
            c();
            e0(this.f63885j);
            this.f63885j = null;
        }
    }

    private static boolean s(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void u() {
        if (!this.f63882g) {
            this.f63876a.write(this.f63879d.b());
            int i10 = this.f63878c;
            for (int i11 = 1; i11 < i10; i11++) {
                this.f63876a.write(this.f63879d.a());
            }
        }
    }

    private c w(int i10, char c10) {
        d();
        z(i10);
        this.f63876a.write(c10);
        return this;
    }

    private int x() {
        int i10 = this.f63878c;
        if (i10 != 0) {
            return this.f63877b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void z(int i10) {
        int i11 = this.f63878c;
        int[] iArr = this.f63877b;
        if (i11 == iArr.length) {
            this.f63877b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f63877b;
        int i12 = this.f63878c;
        this.f63878c = i12 + 1;
        iArr2[i12] = i10;
    }

    public final void F(e eVar) {
        Objects.requireNonNull(eVar);
        this.f63879d = eVar;
        this.f63881f = ",";
        if (eVar.c()) {
            this.f63880e = ": ";
            if (this.f63879d.b().isEmpty()) {
                this.f63881f = ", ";
            }
        } else {
            this.f63880e = ":";
        }
        this.f63882g = this.f63879d.b().isEmpty() && this.f63879d.a().isEmpty();
    }

    public final void J(boolean z10) {
        this.f63884i = z10;
    }

    public final void N(boolean z10) {
        this.f63886k = z10;
    }

    public final void U(s sVar) {
        Objects.requireNonNull(sVar);
        this.f63883h = sVar;
    }

    public void close() {
        this.f63876a.close();
        int i10 = this.f63878c;
        if (i10 > 1 || (i10 == 1 && this.f63877b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f63878c = 0;
    }

    public c e() {
        p0();
        return w(1, '[');
    }

    public c f() {
        p0();
        return w(3, '{');
    }

    public c f0(double d10) {
        p0();
        if (this.f63883h == s.LENIENT || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            d();
            this.f63876a.append(Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public void flush() {
        if (this.f63878c != 0) {
            this.f63876a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c h() {
        return g(1, 2, ']');
    }

    public c h0(long j10) {
        p0();
        d();
        this.f63876a.write(Long.toString(j10));
        return this;
    }

    public c i() {
        return g(3, 5, '}');
    }

    public c i0(Boolean bool) {
        if (bool == null) {
            return v();
        }
        p0();
        d();
        this.f63876a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c j0(Number number) {
        if (number == null) {
            return v();
        }
        p0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!s(cls) && !f63873l.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.f63883h != s.LENIENT) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        d();
        this.f63876a.append(obj);
        return this;
    }

    public final boolean l() {
        return this.f63886k;
    }

    public c l0(String str) {
        if (str == null) {
            return v();
        }
        p0();
        d();
        e0(str);
        return this;
    }

    public final s n() {
        return this.f63883h;
    }

    public final boolean o() {
        return this.f63884i;
    }

    public c o0(boolean z10) {
        p0();
        d();
        this.f63876a.write(z10 ? "true" : "false");
        return this;
    }

    public boolean q() {
        return this.f63883h == s.LENIENT;
    }

    public c t(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f63885j == null) {
            int x10 = x();
            if (x10 == 3 || x10 == 5) {
                this.f63885j = str;
                return this;
            }
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    public c v() {
        if (this.f63885j != null) {
            if (this.f63886k) {
                p0();
            } else {
                this.f63885j = null;
                return this;
            }
        }
        d();
        this.f63876a.write("null");
        return this;
    }
}
