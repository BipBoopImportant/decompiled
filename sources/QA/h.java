package qa;

import K9.C6620s;
import T9.b;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import fa.d;

public class h {

    /* renamed from: a  reason: collision with root package name */
    protected final d f55652a;

    public h(d dVar) {
        this.f55652a = (d) C6620s.l(dVar);
    }

    public LatLng a() {
        try {
            return this.f55652a.f();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public boolean b() {
        try {
            return this.f55652a.j1();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public boolean c() {
        try {
            return this.f55652a.o1();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public void d() {
        try {
            this.f55652a.n();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public void e(float f10) {
        try {
            this.f55652a.o3(f10);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        try {
            return this.f55652a.x1(((h) obj).f55652a);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public void f(float f10, float f11) {
        try {
            this.f55652a.I2(f10, f11);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public void g(boolean z10) {
        try {
            this.f55652a.U2(z10);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public void h(boolean z10) {
        try {
            this.f55652a.l0(z10);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f55652a.e();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public void i(b bVar) {
        if (bVar == null) {
            try {
                this.f55652a.Y0((b) null);
            } catch (RemoteException e10) {
                throw new m(e10);
            }
        } else {
            this.f55652a.Y0(bVar.a());
        }
    }

    public void j(float f10, float f11) {
        try {
            this.f55652a.z(f10, f11);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public void k(LatLng latLng) {
        if (latLng != null) {
            try {
                this.f55652a.S(latLng);
            } catch (RemoteException e10) {
                throw new m(e10);
            }
        } else {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
    }

    public void l(float f10) {
        try {
            this.f55652a.i1(f10);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public void m(String str) {
        try {
            this.f55652a.R2(str);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public void n(Object obj) {
        try {
            this.f55652a.w0(T9.d.L3(obj));
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public void o(String str) {
        try {
            this.f55652a.E1(str);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public void p(boolean z10) {
        try {
            this.f55652a.D(z10);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public void q(float f10) {
        try {
            this.f55652a.F(f10);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public void r() {
        try {
            this.f55652a.zzD();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }
}
