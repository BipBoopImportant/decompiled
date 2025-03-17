package dc;

import K9.C6607e;
import K9.C6610h;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.d;
import dc.h;
import dc.i;

public class e extends C6610h<i> {
    public e(Context context, Looper looper, C6607e eVar, g.a aVar, g.b bVar) {
        super(context, looper, 131, eVar, aVar, bVar);
    }

    /* access modifiers changed from: protected */
    public String E() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    /* access modifiers changed from: protected */
    public String F() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    public boolean S() {
        return true;
    }

    public int m() {
        return d.f48050a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public i s(IBinder iBinder) {
        return i.a.I3(iBinder);
    }

    /* access modifiers changed from: package-private */
    public void n0(h.a aVar, String str) {
        try {
            ((i) D()).k3(aVar, str);
        } catch (RemoteException unused) {
        }
    }
}
