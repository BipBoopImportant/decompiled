package qa;

import K9.C6620s;
import android.os.RemoteException;
import fa.u;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final u f55649a;

    public e(u uVar) {
        this.f55649a = (u) C6620s.l(uVar);
    }

    public void a() {
        try {
            this.f55649a.m();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        try {
            return this.f55649a.F3(((e) obj).f55649a);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f55649a.b();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }
}
