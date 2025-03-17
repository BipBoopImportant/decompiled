package eb;

import android.os.Bundle;
import android.os.RemoteException;
import fb.C9690f;
import fb.C9694j;
import java.util.Map;
import xa.C8972m;

final class j extends C9694j {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C8972m f72575b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ m f72576c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(m mVar, C8972m mVar2, C8972m mVar3) {
        super(mVar2);
        this.f72575b = mVar3;
        this.f72576c = mVar;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            C9690f fVar = (C9690f) this.f72576c.f72581a.e();
            String c10 = this.f72576c.f72582b;
            Bundle bundle = new Bundle();
            Map a10 = n.a();
            bundle.putInt("playcore_version_code", ((Integer) a10.get("java")).intValue());
            if (a10.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) a10.get("native")).intValue());
            }
            if (a10.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) a10.get("unity")).intValue());
            }
            m mVar = this.f72576c;
            fVar.f1(c10, bundle, new l(mVar, this.f72575b, mVar.f72582b));
        } catch (RemoteException e10) {
            m.f72580c.b(e10, "error requesting in-app review for %s", this.f72576c.f72582b);
            this.f72575b.d(new RuntimeException(e10));
        }
    }
}
