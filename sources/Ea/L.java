package ea;

import K9.C6614l;
import android.os.RemoteException;
import xa.C8968i;

final /* synthetic */ class L implements C8968i {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C6614l f50921a;

    /* synthetic */ L(C6614l lVar) {
        this.f50921a = lVar;
    }

    public final /* synthetic */ void onCanceled() {
        int i10 = I.f50908M;
        try {
            this.f50921a.cancel();
        } catch (RemoteException unused) {
        }
    }
}
