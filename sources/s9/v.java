package s9;

import java.util.concurrent.Executor;
import l9.p;
import t9.C8856d;
import u9.C8888b;

public class v {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f56061a;

    /* renamed from: b  reason: collision with root package name */
    private final C8856d f56062b;

    /* renamed from: c  reason: collision with root package name */
    private final x f56063c;

    /* renamed from: d  reason: collision with root package name */
    private final C8888b f56064d;

    v(Executor executor, C8856d dVar, x xVar, C8888b bVar) {
        this.f56061a = executor;
        this.f56062b = dVar;
        this.f56063c = xVar;
        this.f56064d = bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d() {
        for (p a10 : this.f56062b.k0()) {
            this.f56063c.a(a10, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f56064d.d(new u(this));
    }

    public void c() {
        this.f56061a.execute(new t(this));
    }
}
