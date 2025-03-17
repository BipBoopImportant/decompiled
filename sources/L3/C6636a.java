package L3;

import L3.C6635E;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import q3.C5807s;
import t3.D;

/* renamed from: L3.a  reason: case insensitive filesystem */
final class C6636a implements C6635E {

    /* renamed from: a  reason: collision with root package name */
    private final p f38061a;

    /* renamed from: b  reason: collision with root package name */
    private final s f38062b;

    /* renamed from: c  reason: collision with root package name */
    private C5807s f38063c = new C5807s.b().M();

    public C6636a(p pVar, s sVar) {
        this.f38061a = pVar;
        this.f38062b = sVar;
    }

    public void A(boolean z10) {
        if (z10) {
            this.f38061a.m();
        }
        this.f38062b.b();
    }

    public void B(boolean z10) {
        this.f38061a.e(z10);
    }

    public boolean d() {
        throw new UnsupportedOperationException();
    }

    public void h() {
        this.f38061a.a();
    }

    public Surface i() {
        throw new UnsupportedOperationException();
    }

    public boolean isInitialized() {
        return true;
    }

    public void j(float f10) {
        this.f38061a.r(f10);
    }

    public void k(long j10, long j11) {
        throw new UnsupportedOperationException();
    }

    public boolean l(long j10, boolean z10, long j11, long j12, C6635E.b bVar) {
        throw new UnsupportedOperationException();
    }

    public void m(long j10, long j11, long j12, long j13) {
        throw new UnsupportedOperationException();
    }

    public void n(Surface surface, D d10) {
        this.f38061a.q(surface);
    }

    public void o() {
        this.f38061a.l();
    }

    public void p(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    public void q(o oVar) {
        throw new UnsupportedOperationException();
    }

    public void r(C6635E.a aVar, Executor executor) {
        throw new UnsupportedOperationException();
    }

    public void release() {
    }

    public boolean s(boolean z10) {
        return this.f38061a.d(z10);
    }

    public void t(boolean z10) {
        this.f38061a.h(z10);
    }

    public void u() {
        this.f38061a.k();
    }

    public void v(C5807s sVar) {
    }

    public void w(int i10, C5807s sVar) {
        int i11 = sVar.f28251v;
        C5807s sVar2 = this.f38063c;
        if (!(i11 == sVar2.f28251v && sVar.f28252w == sVar2.f28252w)) {
            this.f38062b.g(i11, sVar.f28252w);
        }
        this.f38063c = sVar;
    }

    public void x() {
        this.f38061a.g();
    }

    public void y(int i10) {
        this.f38061a.n(i10);
    }

    public void z() {
        this.f38061a.q((Surface) null);
    }
}
