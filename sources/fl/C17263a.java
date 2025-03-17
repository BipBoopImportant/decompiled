package fL;

import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.I0;
import U0.J0;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import gL.C17295a;
import gL.C17296b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;
import sL.C17952a;
import vL.C18207b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0017"}, d2 = {"LgL/a;", "e", "()LgL/a;", "LsL/a;", "d", "(LU0/m;I)LsL/a;", "LXH/N;", "f", "(LgL/a;)V", "LgL/b;", "context", "Lkotlin/Function0;", "content", "a", "(LgL/b;LnI/p;LU0/m;I)V", "LU0/I0;", "LU0/I0;", "getLocalKoinApplication", "()LU0/I0;", "LocalKoinApplication", "b", "getLocalKoinScope", "LocalKoinScope", "koin-compose"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: fL.a  reason: case insensitive filesystem */
public final class C17263a {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<C17295a> f143282a = C4910x.d((o1) null, c.f143288c, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private static final I0<C17952a> f143283b = C4910x.d((o1) null, d.f143289c, 1, (Object) null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fL.a$a  reason: collision with other inner class name */
    static final class C3494a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f143284c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3494a(p<? super C4889m, ? super Integer, C16807N> pVar) {
            super(2);
            this.f143284c = pVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 11) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2089047606, i10, -1, "org.koin.compose.KoinIsolatedContext.<anonymous> (KoinApplication.kt:172)");
                }
                this.f143284c.invoke(mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fL.a$b */
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17296b f143285c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f143286d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f143287e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17296b bVar, p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f143285c = bVar;
            this.f143286d = pVar;
            this.f143287e = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C17263a.a(this.f143285c, this.f143286d, mVar, M0.a(this.f143287e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LgL/a;", "b", "()LgL/a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fL.a$c */
    static final class c extends C17544u implements C17631a<C17295a> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f143288c = new c();

        c() {
            super(0);
        }

        /* renamed from: b */
        public final C17295a invoke() {
            C17295a b10 = C17263a.e();
            C17263a.f(b10);
            return b10;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LsL/a;", "b", "()LsL/a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fL.a$d */
    static final class d extends C17544u implements C17631a<C17952a> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f143289c = new d();

        d() {
            super(0);
        }

        /* renamed from: b */
        public final C17952a invoke() {
            C17295a b10 = C17263a.e();
            C17263a.f(b10);
            return b10.d().b();
        }
    }

    public static final void a(C17296b bVar, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        C17542s.j(bVar, "context");
        C17542s.j(pVar, "content");
        C4889m k10 = mVar.k(-1842654858);
        if (C4895p.J()) {
            C4895p.S(-1842654858, i10, -1, "org.koin.compose.KoinIsolatedContext (KoinApplication.kt:167)");
        }
        C4910x.b(new J0[]{f143282a.d(bVar.b()), f143283b.d(bVar.b().d().b())}, c1.c.b(k10, 2089047606, true, new C3494a(pVar)), k10, 56);
        if (C4895p.J()) {
            C4895p.R();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new b(bVar, pVar, i10));
        }
    }

    public static final C17952a d(C4889m mVar, int i10) {
        mVar.C(1668867238);
        if (C4895p.J()) {
            C4895p.S(1668867238, i10, -1, "org.koin.compose.currentKoinScope (KoinApplication.kt:74)");
        }
        C17952a aVar = (C17952a) mVar.Q(f143283b);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return aVar;
    }

    /* access modifiers changed from: private */
    public static final C17295a e() {
        return C18207b.f149085a.a().get();
    }

    /* access modifiers changed from: private */
    public static final void f(C17295a aVar) {
        aVar.c().d("[Warning] - No Koin context defined in Compose, fallback to default Koin context.\nUse KoinContext(), KoinAndroidContext() or KoinApplication() to setup or create Koin context with Compose and avoid such message.");
    }
}
