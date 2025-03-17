package com.squareup.moshi;

import WK.C16760C;
import WK.C16770e;
import WK.C16772g;
import WK.C16773h;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

public abstract class k implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    int f122357a;

    /* renamed from: b  reason: collision with root package name */
    int[] f122358b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    String[] f122359c = new String[32];

    /* renamed from: d  reason: collision with root package name */
    int[] f122360d = new int[32];

    /* renamed from: e  reason: collision with root package name */
    boolean f122361e;

    /* renamed from: f  reason: collision with root package name */
    boolean f122362f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final String[] f122363a;

        /* renamed from: b  reason: collision with root package name */
        final C16760C f122364b;

        private a(String[] strArr, C16760C c10) {
            this.f122363a = strArr;
            this.f122364b = c10;
        }

        public static a a(String... strArr) {
            try {
                C16773h[] hVarArr = new C16773h[strArr.length];
                C16770e eVar = new C16770e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    n.l0(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.i0();
                }
                return new a((String[]) strArr.clone(), C16760C.x(hVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    k() {
    }

    public static k l(C16772g gVar) {
        return new m(gVar);
    }

    public abstract String C1();

    public abstract int G0();

    public abstract long U2();

    public abstract void a0();

    public abstract void c();

    public abstract void d();

    public abstract double d2();

    public abstract void e();

    public abstract void f();

    public final boolean g() {
        return this.f122362f;
    }

    public final boolean h() {
        return this.f122361e;
    }

    public abstract boolean hasNext();

    public abstract <T> T i();

    public final String m() {
        return l.a(this.f122357a, this.f122358b, this.f122359c, this.f122360d);
    }

    public abstract b n();

    public abstract void o();

    /* access modifiers changed from: package-private */
    public final void q(int i10) {
        int i11 = this.f122357a;
        int[] iArr = this.f122358b;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f122358b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f122359c;
                this.f122359c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f122360d;
                this.f122360d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new h("Nesting too deep at " + m());
            }
        }
        int[] iArr3 = this.f122358b;
        int i12 = this.f122357a;
        this.f122357a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int s(a aVar);

    public abstract int t(a aVar);

    public final void u(boolean z10) {
        this.f122362f = z10;
    }

    public final void v(boolean z10) {
        this.f122361e = z10;
    }

    public abstract void w();

    public abstract boolean w1();

    /* access modifiers changed from: package-private */
    public final i x(String str) {
        throw new i(str + " at path " + m());
    }

    /* access modifiers changed from: package-private */
    public final h z(Object obj, Object obj2) {
        if (obj == null) {
            return new h("Expected " + obj2 + " but was null at path " + m());
        }
        return new h("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + m());
    }
}
