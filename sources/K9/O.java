package K9;

import K9.r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import java.util.concurrent.TimeUnit;
import xa.C8972m;

final class O implements i.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f37771a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C8972m f37772b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r.a f37773c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Q f37774d;

    O(i iVar, C8972m mVar, r.a aVar, Q q10) {
        this.f37771a = iVar;
        this.f37772b = mVar;
        this.f37773c = aVar;
        this.f37774d = q10;
    }

    public final void a(Status status) {
        if (status.E0()) {
            this.f37772b.c(this.f37773c.a(this.f37771a.b(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f37772b.b(C6602b.a(status));
    }
}
