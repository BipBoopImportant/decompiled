package com.squareup.moshi;

import WK.C16771f;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;

public abstract class q implements Closeable, Flushable {

    /* renamed from: a  reason: collision with root package name */
    int f122387a = 0;

    /* renamed from: b  reason: collision with root package name */
    int[] f122388b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    String[] f122389c = new String[32];

    /* renamed from: d  reason: collision with root package name */
    int[] f122390d = new int[32];

    /* renamed from: e  reason: collision with root package name */
    String f122391e;

    /* renamed from: f  reason: collision with root package name */
    boolean f122392f;

    /* renamed from: g  reason: collision with root package name */
    boolean f122393g;

    /* renamed from: h  reason: collision with root package name */
    boolean f122394h;

    /* renamed from: i  reason: collision with root package name */
    int f122395i = -1;

    q() {
    }

    public static q q(C16771f fVar) {
        return new n(fVar);
    }

    public abstract q B(double d10);

    public abstract q F(long j10);

    public abstract q J(Number number);

    public abstract q N(String str);

    public abstract q U(boolean z10);

    public abstract q c();

    public abstract q d();

    /* access modifiers changed from: package-private */
    public final boolean e() {
        int i10 = this.f122387a;
        int[] iArr = this.f122388b;
        if (i10 != iArr.length) {
            return false;
        }
        if (i10 != 256) {
            this.f122388b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f122389c;
            this.f122389c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f122390d;
            this.f122390d = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (!(this instanceof p)) {
                return true;
            }
            p pVar = (p) this;
            Object[] objArr = pVar.f122385j;
            pVar.f122385j = Arrays.copyOf(objArr, objArr.length * 2);
            return true;
        }
        throw new h("Nesting too deep at " + m() + ": circular reference?");
    }

    public abstract q f();

    public abstract q g();

    public final String h() {
        String str = this.f122391e;
        return str != null ? str : "";
    }

    public final boolean i() {
        return this.f122393g;
    }

    public final boolean l() {
        return this.f122392f;
    }

    public final String m() {
        return l.a(this.f122387a, this.f122388b, this.f122389c, this.f122390d);
    }

    public abstract q n(String str);

    public abstract q o();

    /* access modifiers changed from: package-private */
    public final int s() {
        int i10 = this.f122387a;
        if (i10 != 0) {
            return this.f122388b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void t() {
        int s10 = s();
        if (s10 == 5 || s10 == 3) {
            this.f122394h = true;
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* access modifiers changed from: package-private */
    public final void u(int i10) {
        int[] iArr = this.f122388b;
        int i11 = this.f122387a;
        this.f122387a = i11 + 1;
        iArr[i11] = i10;
    }

    /* access modifiers changed from: package-private */
    public final void v(int i10) {
        this.f122388b[this.f122387a - 1] = i10;
    }

    public void w(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f122391e = str;
    }

    public final void x(boolean z10) {
        this.f122392f = z10;
    }

    public final void z(boolean z10) {
        this.f122393g = z10;
    }
}
