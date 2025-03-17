package androidx.emoji2.text;

import Z2.a;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

public class p {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<a> f21630d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private final int f21631a;

    /* renamed from: b  reason: collision with root package name */
    private final n f21632b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f21633c = 0;

    p(n nVar, int i10) {
        this.f21632b = nVar;
        this.f21631a = i10;
    }

    private a g() {
        ThreadLocal<a> threadLocal = f21630d;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        this.f21632b.d().j(aVar, this.f21631a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface g10 = this.f21632b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g10);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f21632b.c(), this.f21631a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.f21633c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f21633c & 4) > 0;
    }

    public void l(boolean z10) {
        int d10 = d();
        if (z10) {
            this.f21633c = d10 | 4;
        } else {
            this.f21633c = d10;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void m(boolean z10) {
        int i10 = this.f21633c & 4;
        this.f21633c = z10 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int c10 = c();
        for (int i10 = 0; i10 < c10; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
