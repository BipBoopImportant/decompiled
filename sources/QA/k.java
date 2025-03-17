package qa;

import K9.C6620s;
import android.os.RemoteException;
import fa.g;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final g f55675a;

    public k(g gVar) {
        this.f55675a = (g) C6620s.l(gVar);
    }

    public void a() {
        try {
            this.f55675a.n();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        try {
            return this.f55675a.a2(((k) obj).f55675a);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f55675a.b();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }
}
