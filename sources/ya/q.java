package Ya;

import Za.t;
import android.os.RemoteException;
import xa.C8972m;

final class q extends t {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f64871b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C8972m f64872c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ v f64873d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    q(v vVar, C8972m mVar, String str, C8972m mVar2) {
        super(mVar);
        this.f64873d = vVar;
        this.f64871b = str;
        this.f64872c = mVar2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface, Za.l] */
    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ? e10 = this.f64873d.f64884a.e();
            v vVar = this.f64873d;
            e10.n0(vVar.f64885b, v.b(vVar, this.f64871b), new u(this.f64873d, this.f64872c, this.f64871b));
        } catch (RemoteException e11) {
            v.f64882e.c(e11, "requestUpdateInfo(%s)", this.f64871b);
            this.f64872c.d(new RuntimeException(e11));
        }
    }
}
