package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class p extends q {

    /* renamed from: j  reason: collision with root package name */
    Object[] f122385j = new Object[32];

    /* renamed from: k  reason: collision with root package name */
    private String f122386k;

    p() {
        u(6);
    }

    private p e0(Object obj) {
        String str;
        Object put;
        int s10 = s();
        int i10 = this.f122387a;
        if (i10 == 1) {
            if (s10 == 6) {
                this.f122388b[i10 - 1] = 7;
                this.f122385j[i10 - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (s10 != 3 || (str = this.f122386k) == null) {
            if (s10 == 1) {
                ((List) this.f122385j[i10 - 1]).add(obj);
            } else if (s10 == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            } else {
                throw new IllegalStateException("Nesting problem.");
            }
        } else if ((obj != null || this.f122393g) && (put = ((Map) this.f122385j[i10 - 1]).put(str, obj)) != null) {
            throw new IllegalArgumentException("Map key '" + this.f122386k + "' has multiple values at path " + m() + ": " + put + " and " + obj);
        } else {
            this.f122386k = null;
        }
        return this;
    }

    public q B(double d10) {
        if (!this.f122392f && (Double.isNaN(d10) || d10 == Double.NEGATIVE_INFINITY || d10 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        } else if (this.f122394h) {
            this.f122394h = false;
            return n(Double.toString(d10));
        } else {
            e0(Double.valueOf(d10));
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
        e0(Long.valueOf(j10));
        int[] iArr = this.f122390d;
        int i10 = this.f122387a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public q J(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return F(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return B(number.doubleValue());
        }
        if (number == null) {
            return o();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f122394h) {
            this.f122394h = false;
            return n(bigDecimal.toString());
        }
        e0(bigDecimal);
        int[] iArr = this.f122390d;
        int i10 = this.f122387a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public q N(String str) {
        if (this.f122394h) {
            this.f122394h = false;
            return n(str);
        }
        e0(str);
        int[] iArr = this.f122390d;
        int i10 = this.f122387a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public q U(boolean z10) {
        if (!this.f122394h) {
            e0(Boolean.valueOf(z10));
            int[] iArr = this.f122390d;
            int i10 = this.f122387a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + m());
    }

    public q c() {
        if (!this.f122394h) {
            int i10 = this.f122387a;
            int i11 = this.f122395i;
            if (i10 == i11 && this.f122388b[i10 - 1] == 1) {
                this.f122395i = ~i11;
                return this;
            }
            e();
            ArrayList arrayList = new ArrayList();
            e0(arrayList);
            Object[] objArr = this.f122385j;
            int i12 = this.f122387a;
            objArr[i12] = arrayList;
            this.f122390d[i12] = 0;
            u(1);
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m());
    }

    public void close() {
        int i10 = this.f122387a;
        if (i10 > 1 || (i10 == 1 && this.f122388b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f122387a = 0;
    }

    public q d() {
        if (!this.f122394h) {
            int i10 = this.f122387a;
            int i11 = this.f122395i;
            if (i10 == i11 && this.f122388b[i10 - 1] == 3) {
                this.f122395i = ~i11;
                return this;
            }
            e();
            r rVar = new r();
            e0(rVar);
            this.f122385j[this.f122387a] = rVar;
            u(3);
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m());
    }

    public q f() {
        if (s() == 1) {
            int i10 = this.f122387a;
            int i11 = this.f122395i;
            if (i10 == (~i11)) {
                this.f122395i = ~i11;
                return this;
            }
            int i12 = i10 - 1;
            this.f122387a = i12;
            this.f122385j[i12] = null;
            int[] iArr = this.f122390d;
            int i13 = i10 - 2;
            iArr[i13] = iArr[i13] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    public Object f0() {
        int i10 = this.f122387a;
        if (i10 <= 1 && (i10 != 1 || this.f122388b[i10 - 1] == 7)) {
            return this.f122385j[0];
        }
        throw new IllegalStateException("Incomplete document");
    }

    public void flush() {
        if (this.f122387a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public q g() {
        if (s() != 3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f122386k == null) {
            int i10 = this.f122387a;
            int i11 = this.f122395i;
            if (i10 == (~i11)) {
                this.f122395i = ~i11;
                return this;
            }
            this.f122394h = false;
            int i12 = i10 - 1;
            this.f122387a = i12;
            this.f122385j[i12] = null;
            this.f122389c[i12] = null;
            int[] iArr = this.f122390d;
            int i13 = i10 - 2;
            iArr[i13] = iArr[i13] + 1;
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f122386k);
        }
    }

    public q n(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f122387a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (s() == 3 && this.f122386k == null && !this.f122394h) {
            this.f122386k = str;
            this.f122389c[this.f122387a - 1] = str;
            return this;
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    public q o() {
        if (!this.f122394h) {
            e0((Object) null);
            int[] iArr = this.f122390d;
            int i10 = this.f122387a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + m());
    }
}
