package oa;

import K9.C6620s;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;
import pa.B;
import pa.C8641b;
import pa.C8642c;
import pa.C8647h;
import pa.C8649j;
import pa.C8651l;
import pa.C8653n;
import pa.C8658t;
import pa.C8660v;
import pa.C8664z;
import pa.D;
import pa.G;
import pa.I;
import pa.K;
import pa.M;
import pa.X;
import pa.b0;
import pa.d0;
import pa.f0;
import pa.h0;
import pa.j0;
import pa.l0;

/* renamed from: oa.c  reason: case insensitive filesystem */
public class C8619c {

    /* renamed from: a  reason: collision with root package name */
    private final C8641b f55336a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f55337b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map f55338c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private i f55339d;

    /* renamed from: oa.c$a */
    public interface a {
        void a();

        void onCancel();
    }

    /* renamed from: oa.c$b */
    public interface b {
        View a(qa.h hVar);

        View b(qa.h hVar);
    }

    /* renamed from: oa.c$c  reason: collision with other inner class name */
    public interface C0888c {
        void c();
    }

    /* renamed from: oa.c$d */
    public interface d {
        void b();
    }

    /* renamed from: oa.c$e */
    public interface e {
        void a();
    }

    /* renamed from: oa.c$f */
    public interface f {
        void d(int i10);
    }

    /* renamed from: oa.c$g */
    public interface g {
        void a(qa.d dVar);
    }

    /* renamed from: oa.c$h */
    public interface h {
        void a(qa.e eVar);
    }

    /* renamed from: oa.c$i */
    public interface i {
        void a(qa.f fVar);

        void b();
    }

    /* renamed from: oa.c$j */
    public interface j {
        void a(qa.h hVar);
    }

    /* renamed from: oa.c$k */
    public interface k {
        void a(qa.h hVar);
    }

    /* renamed from: oa.c$l */
    public interface l {
        void a(qa.h hVar);
    }

    /* renamed from: oa.c$m */
    public interface m {
        void a(LatLng latLng);
    }

    /* renamed from: oa.c$n */
    public interface n {
        void a();
    }

    /* renamed from: oa.c$o */
    public interface o {
        void a(LatLng latLng);
    }

    /* renamed from: oa.c$p */
    public interface p {
        boolean a(qa.h hVar);
    }

    /* renamed from: oa.c$q */
    public interface q {
        void a(qa.h hVar);

        void b(qa.h hVar);

        void c(qa.h hVar);
    }

    /* renamed from: oa.c$r */
    public interface r {
        boolean a();
    }

    /* renamed from: oa.c$s */
    public interface s {
        void a(Location location);
    }

    /* renamed from: oa.c$t */
    public interface t {
        void a(qa.j jVar);
    }

    /* renamed from: oa.c$u */
    public interface u {
        void a(qa.k kVar);
    }

    /* renamed from: oa.c$v */
    public interface v {
        void a(qa.l lVar);
    }

    public C8619c(C8641b bVar) {
        this.f55336a = (C8641b) C6620s.l(bVar);
    }

    public final void A(i iVar) {
        if (iVar == null) {
            try {
                this.f55336a.W2((C8647h) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.W2(new u(this, iVar));
        }
    }

    public final void B(j jVar) {
        if (jVar == null) {
            try {
                this.f55336a.p2((C8649j) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.p2(new n(this, jVar));
        }
    }

    public final void C(k kVar) {
        if (kVar == null) {
            try {
                this.f55336a.e2((C8651l) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.e2(new p(this, kVar));
        }
    }

    public final void D(l lVar) {
        if (lVar == null) {
            try {
                this.f55336a.a0((C8653n) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.a0(new o(this, lVar));
        }
    }

    public final void E(m mVar) {
        if (mVar == null) {
            try {
                this.f55336a.Y1((pa.r) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.Y1(new G(this, mVar));
        }
    }

    public void F(n nVar) {
        if (nVar == null) {
            try {
                this.f55336a.Y2((C8658t) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.Y2(new t(this, nVar));
        }
    }

    public final void G(o oVar) {
        if (oVar == null) {
            try {
                this.f55336a.d3((C8660v) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.d3(new k(this, oVar));
        }
    }

    public final void H(p pVar) {
        if (pVar == null) {
            try {
                this.f55336a.u1((C8664z) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.u1(new j(this, pVar));
        }
    }

    public final void I(q qVar) {
        if (qVar == null) {
            try {
                this.f55336a.B1((B) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.B1(new m(this, qVar));
        }
    }

    public final void J(r rVar) {
        if (rVar == null) {
            try {
                this.f55336a.g1((D) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.g1(new r(this, rVar));
        }
    }

    public final void K(s sVar) {
        if (sVar == null) {
            try {
                this.f55336a.C2((G) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.C2(new s(this, sVar));
        }
    }

    public final void L(t tVar) {
        if (tVar == null) {
            try {
                this.f55336a.n1((I) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.n1(new A(this, tVar));
        }
    }

    public final void M(u uVar) {
        if (uVar == null) {
            try {
                this.f55336a.q3((K) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.q3(new y(this, uVar));
        }
    }

    public final void N(v vVar) {
        if (vVar == null) {
            try {
                this.f55336a.k0((M) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.k0(new z(this, vVar));
        }
    }

    public final void O(int i10, int i11, int i12, int i13) {
        try {
            this.f55336a.Z1(i10, i11, i12, i13);
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void P(boolean z10) {
        try {
            this.f55336a.y2(z10);
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void Q() {
        try {
            this.f55336a.e1();
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final qa.h a(qa.i iVar) {
        try {
            C6620s.m(iVar, "MarkerOptions must not be null.");
            fa.d b02 = this.f55336a.b0(iVar);
            if (b02 != null) {
                return iVar.B3() == 1 ? new qa.a(b02) : new qa.h(b02);
            }
            return null;
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void b(C8617a aVar) {
        try {
            C6620s.m(aVar, "CameraUpdate must not be null.");
            this.f55336a.s1(aVar.a());
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void c(C8617a aVar, int i10, a aVar2) {
        try {
            C6620s.m(aVar, "CameraUpdate must not be null.");
            this.f55336a.E(aVar.a(), i10, aVar2 == null ? null : new l(aVar2));
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void d(C8617a aVar, a aVar2) {
        try {
            C6620s.m(aVar, "CameraUpdate must not be null.");
            this.f55336a.s3(aVar.a(), aVar2 == null ? null : new l(aVar2));
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void e() {
        try {
            this.f55336a.clear();
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final CameraPosition f() {
        try {
            return this.f55336a.p();
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final i g() {
        try {
            if (this.f55339d == null) {
                this.f55339d = new i(this.f55336a.T2());
            }
            return this.f55339d;
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void h(C8617a aVar) {
        try {
            C6620s.m(aVar, "CameraUpdate must not be null.");
            this.f55336a.K(aVar.a());
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void i(boolean z10) {
        try {
            this.f55336a.D1(z10);
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void j(String str) {
        try {
            this.f55336a.w1(str);
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final boolean k(boolean z10) {
        try {
            return this.f55336a.K1(z10);
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void l(b bVar) {
        if (bVar == null) {
            try {
                this.f55336a.o0((X) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.o0(new q(this, bVar));
        }
    }

    public void m(LatLngBounds latLngBounds) {
        try {
            this.f55336a.I(latLngBounds);
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void n(C8620d dVar) {
        if (dVar == null) {
            try {
                this.f55336a.F1((C8642c) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.F1(new B(this, dVar));
        }
    }

    public void o(int i10) {
        try {
            this.f55336a.T0(i10);
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public boolean p(qa.g gVar) {
        try {
            return this.f55336a.m0(gVar);
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void q(int i10) {
        try {
            this.f55336a.F0(i10);
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public void r(float f10) {
        try {
            this.f55336a.x0(f10);
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public void s(float f10) {
        try {
            this.f55336a.B2(f10);
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void t(boolean z10) {
        try {
            this.f55336a.m3(z10);
        } catch (RemoteException e10) {
            throw new qa.m(e10);
        }
    }

    public final void u(C0888c cVar) {
        if (cVar == null) {
            try {
                this.f55336a.l2((b0) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.l2(new F(this, cVar));
        }
    }

    public final void v(d dVar) {
        if (dVar == null) {
            try {
                this.f55336a.E0((d0) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.E0(new E(this, dVar));
        }
    }

    public final void w(e eVar) {
        if (eVar == null) {
            try {
                this.f55336a.k1((f0) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.k1(new D(this, eVar));
        }
    }

    public final void x(f fVar) {
        if (fVar == null) {
            try {
                this.f55336a.S1((h0) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.S1(new C(this, fVar));
        }
    }

    public final void y(g gVar) {
        if (gVar == null) {
            try {
                this.f55336a.u0((j0) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.u0(new x(this, gVar));
        }
    }

    public final void z(h hVar) {
        if (hVar == null) {
            try {
                this.f55336a.W1((l0) null);
            } catch (RemoteException e10) {
                throw new qa.m(e10);
            }
        } else {
            this.f55336a.W1(new w(this, hVar));
        }
    }
}
