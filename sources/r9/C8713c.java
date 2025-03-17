package r9;

import j9.k;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import l9.i;
import l9.p;
import l9.u;
import m9.C8568e;
import m9.m;
import s9.x;
import t9.C8856d;
import u9.C8888b;

/* renamed from: r9.c  reason: case insensitive filesystem */
public class C8713c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f55787f = Logger.getLogger(u.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final x f55788a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f55789b;

    /* renamed from: c  reason: collision with root package name */
    private final C8568e f55790c;

    /* renamed from: d  reason: collision with root package name */
    private final C8856d f55791d;

    /* renamed from: e  reason: collision with root package name */
    private final C8888b f55792e;

    public C8713c(Executor executor, C8568e eVar, x xVar, C8856d dVar, C8888b bVar) {
        this.f55789b = executor;
        this.f55790c = eVar;
        this.f55788a = xVar;
        this.f55791d = dVar;
        this.f55792e = bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d(p pVar, i iVar) {
        this.f55791d.g1(pVar, iVar);
        this.f55788a.a(pVar, 1);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(p pVar, k kVar, i iVar) {
        try {
            m mVar = this.f55790c.get(pVar.b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{pVar.b()});
                f55787f.warning(format);
                kVar.a(new IllegalArgumentException(format));
                return;
            }
            this.f55792e.d(new C8712b(this, pVar, mVar.a(iVar)));
            kVar.a((Exception) null);
        } catch (Exception e10) {
            Logger logger = f55787f;
            logger.warning("Error scheduling event " + e10.getMessage());
            kVar.a(e10);
        }
    }

    public void a(p pVar, i iVar, k kVar) {
        this.f55789b.execute(new C8711a(this, pVar, kVar, iVar));
    }
}
