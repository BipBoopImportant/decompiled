package E;

import C.U;
import C.V;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.W;
import androidx.camera.core.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import ob.C10101e;

class P {

    /* renamed from: a  reason: collision with root package name */
    private final int f5552a;

    /* renamed from: b  reason: collision with root package name */
    private final U.g f5553b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f5554c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5555d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5556e;

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f5557f;

    /* renamed from: g  reason: collision with root package name */
    private final V f5558g;

    /* renamed from: h  reason: collision with root package name */
    private final String f5559h;

    /* renamed from: i  reason: collision with root package name */
    private final List<Integer> f5560i;

    /* renamed from: j  reason: collision with root package name */
    final C10101e<Void> f5561j;

    /* renamed from: k  reason: collision with root package name */
    private int f5562k = -1;

    P(androidx.camera.core.impl.U u10, U.g gVar, Rect rect, int i10, int i11, Matrix matrix, V v10, C10101e<Void> eVar, int i12) {
        this.f5552a = i12;
        this.f5553b = gVar;
        this.f5556e = i11;
        this.f5555d = i10;
        this.f5554c = rect;
        this.f5557f = matrix;
        this.f5558g = v10;
        this.f5559h = String.valueOf(u10.hashCode());
        this.f5560i = new ArrayList();
        List<W> a10 = u10.a();
        Objects.requireNonNull(a10);
        for (W id2 : a10) {
            this.f5560i.add(Integer.valueOf(id2.getId()));
        }
        this.f5561j = eVar;
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> a() {
        return this.f5561j;
    }

    /* access modifiers changed from: package-private */
    public Rect b() {
        return this.f5554c;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f5556e;
    }

    /* access modifiers changed from: package-private */
    public U.g d() {
        return this.f5553b;
    }

    public int e() {
        return this.f5552a;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f5555d;
    }

    /* access modifiers changed from: package-private */
    public Matrix g() {
        return this.f5557f;
    }

    /* access modifiers changed from: package-private */
    public List<Integer> h() {
        return this.f5560i;
    }

    /* access modifiers changed from: package-private */
    public String i() {
        return this.f5559h;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.f5558g.e();
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return d() == null;
    }

    /* access modifiers changed from: package-private */
    public void l(V v10) {
        this.f5558g.h(v10);
    }

    /* access modifiers changed from: package-private */
    public void m(int i10) {
        if (this.f5562k != i10) {
            this.f5562k = i10;
            this.f5558g.a(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.f5558g.c();
    }

    /* access modifiers changed from: package-private */
    public void o(U.h hVar) {
        this.f5558g.i(hVar);
    }

    /* access modifiers changed from: package-private */
    public void p(n nVar) {
        this.f5558g.d(nVar);
    }

    /* access modifiers changed from: package-private */
    public void q() {
        if (this.f5562k != -1) {
            m(100);
        }
        this.f5558g.g();
    }

    /* access modifiers changed from: package-private */
    public void r(Bitmap bitmap) {
        this.f5558g.b(bitmap);
    }

    /* access modifiers changed from: package-private */
    public void s(V v10) {
        this.f5558g.f(v10);
    }
}
