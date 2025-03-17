package qa;

import K9.C6620s;
import android.os.RemoteException;
import fa.x;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final x f55650a;

    public f(x xVar) {
        o oVar = o.f55677a;
        this.f55650a = (x) C6620s.m(xVar, "delegate");
        o oVar2 = (o) C6620s.m(oVar, "shim");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            return this.f55650a.a3(((f) obj).f55650a);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f55650a.i();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }
}
