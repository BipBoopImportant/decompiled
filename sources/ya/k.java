package Ya;

import ab.C9404b;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import g.C5314c;
import g.C5318g;
import xa.C8971l;

final class k implements C9365b {

    /* renamed from: a  reason: collision with root package name */
    private final v f64860a;

    /* renamed from: b  reason: collision with root package name */
    private final i f64861b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f64862c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f64863d = new Handler(Looper.getMainLooper());

    k(v vVar, i iVar, Context context) {
        this.f64860a = vVar;
        this.f64861b = iVar;
        this.f64862c = context;
    }

    public final boolean a(C9364a aVar, C5314c<C5318g> cVar, C9367d dVar) {
        if (aVar == null || cVar == null || dVar == null || !aVar.b(dVar) || aVar.g()) {
            return false;
        }
        aVar.f();
        cVar.a(new C5318g.a(aVar.d(dVar).getIntentSender()).a());
        return true;
    }

    public final synchronized void b(C9404b bVar) {
        this.f64861b.c(bVar);
    }

    public final synchronized void c(C9404b bVar) {
        this.f64861b.b(bVar);
    }

    public final C8971l<Void> d() {
        return this.f64860a.d(this.f64862c.getPackageName());
    }

    public final C8971l<C9364a> e() {
        return this.f64860a.e(this.f64862c.getPackageName());
    }
}
