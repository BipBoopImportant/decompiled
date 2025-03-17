package S;

import C.H0;
import G.p;
import S.h;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J;
import java.util.Collection;

class k implements J {

    /* renamed from: a  reason: collision with root package name */
    private final J f12544a;

    /* renamed from: b  reason: collision with root package name */
    private final q f12545b;

    /* renamed from: c  reason: collision with root package name */
    private final r f12546c;

    /* renamed from: d  reason: collision with root package name */
    private final H0.b f12547d;

    k(J j10, H0.b bVar, h.a aVar) {
        this.f12544a = j10;
        this.f12547d = bVar;
        this.f12545b = new q(j10.d(), aVar);
        this.f12546c = new r(j10.j());
    }

    public void c(H0 h02) {
        p.a();
        this.f12547d.c(h02);
    }

    public F d() {
        return this.f12545b;
    }

    public void e(H0 h02) {
        p.a();
        this.f12547d.e(h02);
    }

    public void h(Collection<H0> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    public void i(Collection<H0> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    public I j() {
        return this.f12546c;
    }

    public void k(H0 h02) {
        p.a();
        this.f12547d.k(h02);
    }

    public void l(H0 h02) {
        p.a();
        this.f12547d.l(h02);
    }

    /* access modifiers changed from: package-private */
    public void n(int i10) {
        this.f12546c.r(i10);
    }

    public androidx.camera.core.impl.H0<J.a> p() {
        return this.f12544a.p();
    }

    public boolean q() {
        return false;
    }
}
