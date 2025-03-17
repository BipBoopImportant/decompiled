package ea;

import H9.C6536j;
import android.os.RemoteException;
import xa.C8968i;
import xa.C8972m;

final /* synthetic */ class M implements C8968i {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ I f50922a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C6536j.a f50923b;

    /* synthetic */ M(I i10, C6536j.a aVar) {
        this.f50922a = i10;
        this.f50923b = aVar;
    }

    public final /* synthetic */ void onCanceled() {
        try {
            this.f50922a.q0(this.f50923b, true, new C8972m());
        } catch (RemoteException unused) {
        }
    }
}
