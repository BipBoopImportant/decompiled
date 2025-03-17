package P9;

import H9.C6537k;
import H9.C6546u;
import O9.a;
import O9.g;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;
import xa.C8972m;

final class t extends b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f39463a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C8972m f39464b;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ a f39465i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ v f39466j;

    t(v vVar, AtomicReference atomicReference, C8972m mVar, a aVar) {
        this.f39466j = vVar;
        this.f39463a = atomicReference;
        this.f39464b = mVar;
        this.f39465i = aVar;
    }

    public final void N2(Status status, g gVar) {
        if (gVar != null) {
            this.f39463a.set(gVar);
        }
        C6546u.c(status, null, this.f39464b);
        if (!status.E0() || (gVar != null && gVar.B())) {
            this.f39466j.p(C6537k.c(this.f39465i, a.class.getSimpleName()), 27306);
        }
    }
}
