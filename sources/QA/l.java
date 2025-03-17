package qa;

import K9.C6620s;
import android.os.RemoteException;
import fa.j;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final j f55676a;

    public l(j jVar) {
        this.f55676a = (j) C6620s.l(jVar);
    }

    public void a() {
        try {
            this.f55676a.j();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        try {
            return this.f55676a.j3(((l) obj).f55676a);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f55676a.zzh();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }
}
