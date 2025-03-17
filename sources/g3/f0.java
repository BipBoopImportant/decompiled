package G3;

import G3.C6479C;
import J3.C6569b;
import J3.i;
import J3.j;
import android.net.Uri;
import jb.h;
import kb.C9967v;
import q3.C5807s;
import q3.J;
import q3.w;
import t3.C5950a;
import w3.C;
import w3.g;
import w3.k;

@Deprecated
public final class f0 extends C6481a {

    /* renamed from: h  reason: collision with root package name */
    private final k f35898h;

    /* renamed from: i  reason: collision with root package name */
    private final g.a f35899i;

    /* renamed from: j  reason: collision with root package name */
    private final C5807s f35900j;

    /* renamed from: k  reason: collision with root package name */
    private final long f35901k;

    /* renamed from: l  reason: collision with root package name */
    private final j f35902l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f35903m;

    /* renamed from: n  reason: collision with root package name */
    private final J f35904n;

    /* renamed from: o  reason: collision with root package name */
    private final w f35905o;

    /* renamed from: p  reason: collision with root package name */
    private C f35906p;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final g.a f35907a;

        /* renamed from: b  reason: collision with root package name */
        private j f35908b = new i();

        /* renamed from: c  reason: collision with root package name */
        private boolean f35909c = true;

        /* renamed from: d  reason: collision with root package name */
        private Object f35910d;

        /* renamed from: e  reason: collision with root package name */
        private String f35911e;

        public b(g.a aVar) {
            this.f35907a = (g.a) C5950a.e(aVar);
        }

        public f0 a(w.k kVar, long j10) {
            return new f0(this.f35911e, kVar, this.f35907a, j10, this.f35908b, this.f35909c, this.f35910d);
        }

        public b b(j jVar) {
            if (jVar == null) {
                jVar = new i();
            }
            this.f35908b = jVar;
            return this;
        }
    }

    /* access modifiers changed from: protected */
    public void A() {
    }

    public C6478B a(C6479C.b bVar, C6569b bVar2, long j10) {
        return new e0(this.f35898h, this.f35899i, this.f35906p, this.f35900j, this.f35901k, this.f35902l, t(bVar), this.f35903m);
    }

    public w e() {
        return this.f35905o;
    }

    public void j() {
    }

    public void o(C6478B b10) {
        ((e0) b10).t();
    }

    /* access modifiers changed from: protected */
    public void y(C c10) {
        this.f35906p = c10;
        z(this.f35904n);
    }

    private f0(String str, w.k kVar, g.a aVar, long j10, j jVar, boolean z10, Object obj) {
        w.k kVar2 = kVar;
        this.f35899i = aVar;
        this.f35901k = j10;
        this.f35902l = jVar;
        this.f35903m = z10;
        w a10 = new w.c().f(Uri.EMPTY).c(kVar2.f28437a.toString()).d(C9967v.F(kVar)).e(obj).a();
        this.f35905o = a10;
        C5807s.b g02 = new C5807s.b().s0((String) h.a(kVar2.f28438b, "text/x-unknown")).i0(kVar2.f28439c).u0(kVar2.f28440d).q0(kVar2.f28441e).g0(kVar2.f28442f);
        String str2 = kVar2.f28443g;
        this.f35900j = g02.e0(str2 == null ? str : str2).M();
        this.f35898h = new k.b().i(kVar2.f28437a).b(1).a();
        this.f35904n = new d0(j10, true, false, false, (Object) null, a10);
    }
}
