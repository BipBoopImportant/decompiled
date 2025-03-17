package qa;

import K9.C6620s;
import android.os.RemoteException;
import fa.r;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final r f55648a;

    public d(r rVar) {
        this.f55648a = (r) C6620s.l(rVar);
    }

    public void a() {
        try {
            this.f55648a.m();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        try {
            return this.f55648a.i0(((d) obj).f55648a);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public final int hashCode() {
        try {
            return this.f55648a.b();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }
}
