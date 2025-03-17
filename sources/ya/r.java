package Ya;

import Za.t;
import android.os.RemoteException;
import xa.C8972m;

final class r extends t {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C8972m f64874b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f64875c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ v f64876d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r(v vVar, C8972m mVar, C8972m mVar2, String str) {
        super(mVar);
        this.f64876d = vVar;
        this.f64874b = mVar2;
        this.f64875c = str;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface, Za.l] */
    /* access modifiers changed from: protected */
    public final void a() {
        try {
            this.f64876d.f64884a.e().y0(this.f64876d.f64885b, v.i(), new t(this.f64876d, this.f64874b));
        } catch (RemoteException e10) {
            v.f64882e.c(e10, "completeUpdate(%s)", this.f64875c);
            this.f64874b.d(new RuntimeException(e10));
        }
    }
}
