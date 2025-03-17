package l9;

import android.content.Context;
import j9.c;
import j9.j;
import j9.k;
import java.util.Collections;
import java.util.Set;
import l9.i;
import r9.e;
import s9.r;
import s9.v;
import v9.C8903a;

public class u implements t {

    /* renamed from: e  reason: collision with root package name */
    private static volatile v f54905e;

    /* renamed from: a  reason: collision with root package name */
    private final C8903a f54906a;

    /* renamed from: b  reason: collision with root package name */
    private final C8903a f54907b;

    /* renamed from: c  reason: collision with root package name */
    private final e f54908c;

    /* renamed from: d  reason: collision with root package name */
    private final r f54909d;

    u(C8903a aVar, C8903a aVar2, e eVar, r rVar, v vVar) {
        this.f54906a = aVar;
        this.f54907b = aVar2;
        this.f54908c = eVar;
        this.f54909d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        i.a g10 = i.a().i(this.f54906a.a()).o(this.f54907b.a()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        if (!(oVar.c().e() == null || oVar.c().e().a() == null)) {
            g10.l(oVar.c().e().a());
        }
        oVar.c().b();
        return g10.d();
    }

    public static u c() {
        v vVar = f54905e;
        if (vVar != null) {
            return vVar.d();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<c> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(c.b("proto"));
    }

    public static void f(Context context) {
        if (f54905e == null) {
            synchronized (u.class) {
                try {
                    if (f54905e == null) {
                        f54905e = C8547e.a().a(context).g();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void a(o oVar, k kVar) {
        this.f54908c.a(oVar.f().f(oVar.c().d()), b(oVar), kVar);
    }

    public r e() {
        return this.f54909d;
    }

    @Deprecated
    public j g(String str) {
        return new q(d((f) null), p.a().b(str).a(), this);
    }

    public j h(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
