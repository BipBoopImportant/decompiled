package a9;

import A8.b;
import E8.c;
import c9.C7103a;
import c9.C7105c;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import kotlin.jvm.internal.C17542s;

public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public final c f42405a;

    /* renamed from: b  reason: collision with root package name */
    public final b f42406b;

    /* renamed from: c  reason: collision with root package name */
    public final S0 f42407c;

    public Z(b bVar, c cVar) {
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(bVar, "configuration");
        this.f42405a = cVar;
        this.f42406b = bVar;
        this.f42407c = new S0(cVar);
    }

    public final C7105c a(long j10) {
        C7103a.C0803a aVar = C7103a.f45769b;
        C7105c.a r10 = C7105c.r();
        C17542s.i(r10, "newBuilder()");
        C7103a a10 = aVar.a(r10);
        JsonConfig.ProjectConfiguration b10 = this.f42406b.b();
        a10.c(b10 != null ? b10.g() : 0);
        a10.f(this.f42407c.a());
        a10.e(this.f42405a.d(E8.b.SESSION_ID, 1));
        a10.b(this.f42405a.d(E8.b.SCREEN_NUMBER, 0));
        long j11 = 0;
        long e10 = this.f42405a.e(E8.b.SCREEN_TIMESTAMP, 0);
        if (e10 != 0) {
            j11 = j10 - e10;
        }
        a10.d(j11);
        return a10.a();
    }
}
