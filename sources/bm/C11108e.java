package bm;

import Ae.e;
import EB.C12832d;
import FB.C12860a;
import HJ.C15854t;
import QJ.Q;
import XH.C16807N;
import XH.y;
import aA.C13909a;
import am.C11070a;
import am.b;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import em.C11249a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import up.C12071a;
import up.C12074d;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u0002008BX\u0004¢\u0006\u0006\u001a\u0004\b(\u00101¨\u00063"}, d2 = {"Lbm/e;", "Lam/b;", "LAe/e;", "analytics", "Lem/a;", "performanceService", "LIl/a;", "appConfigApi", "LOd/a;", "abTesting", "Lam/a;", "appApi", "LaA/a;", "sessionManager", "LGo/a;", "clientIdentityProvider", "Lup/d;", "userConsentRepository", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LAe/e;Lem/a;LIl/a;LOd/a;Lam/a;LaA/a;LGo/a;Lup/d;LFB/a;)V", "", "localStoreId", "LXH/N;", "g", "(LAe/e;Ljava/lang/String;Lem/a;LOd/a;)V", "abTestingTool", "clientId", "f", "(LOd/a;Ljava/lang/String;)V", "b", "()V", "a", "LAe/e;", "Lem/a;", "c", "LIl/a;", "d", "LOd/a;", "e", "Lam/a;", "LaA/a;", "LGo/a;", "h", "Lup/d;", "i", "LFB/a;", "", "()Z", "hasOptedInToAnalytics", "appservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bm.e  reason: case insensitive filesystem */
public final class C11108e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final e f90488a;

    /* renamed from: b  reason: collision with root package name */
    private final C11249a f90489b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Il.a f90490c;

    /* renamed from: d  reason: collision with root package name */
    private final Od.a f90491d;

    /* renamed from: e  reason: collision with root package name */
    private final C11070a f90492e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C13909a f90493f;

    /* renamed from: g  reason: collision with root package name */
    private final Go.a f90494g;

    /* renamed from: h  reason: collision with root package name */
    private final C12074d f90495h;

    /* renamed from: i  reason: collision with root package name */
    private final C12860a f90496i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.appservice.impl.IkeaAppService$startTools$1", f = "IkeaAppService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: bm.e$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90497c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C11108e f90498d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f90499e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11108e eVar, e eVar2, C17164e<? super a> eVar3) {
            super(2, eVar3);
            this.f90498d = eVar;
            this.f90499e = eVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f90498d, this.f90499e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f90497c == 0) {
                y.b(obj);
                this.f90499e.a(this.f90498d.f90490c.p() ? this.f90498d.f90493f.a() : null);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C11108e(e eVar, C11249a aVar, Il.a aVar2, Od.a aVar3, C11070a aVar4, C13909a aVar5, Go.a aVar6, C12074d dVar, C12860a aVar7) {
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar, "performanceService");
        C17542s.j(aVar2, "appConfigApi");
        C17542s.j(aVar3, "abTesting");
        C17542s.j(aVar4, "appApi");
        C17542s.j(aVar5, "sessionManager");
        C17542s.j(aVar6, "clientIdentityProvider");
        C17542s.j(dVar, "userConsentRepository");
        C17542s.j(aVar7, "localStoreSelectionRepository");
        this.f90488a = eVar;
        this.f90489b = aVar;
        this.f90490c = aVar2;
        this.f90491d = aVar3;
        this.f90492e = aVar4;
        this.f90493f = aVar5;
        this.f90494g = aVar6;
        this.f90495h = dVar;
        this.f90496i = aVar7;
        b();
    }

    private final boolean e() {
        return this.f90495h.b(C12071a.b.f103980e);
    }

    private final void f(Od.a aVar, String str) {
        if (aVar.g(this.f90492e.a(), this.f90490c.i(), str, this.f90493f.o().b())) {
            aVar.b();
        }
    }

    private final void g(e eVar, String str, C11249a aVar, Od.a aVar2) {
        e eVar2 = eVar;
        aVar.start();
        if (!this.f90490c.h()) {
            IllegalStateException illegalStateException = new IllegalStateException("MarketConfig is not available");
            qv.e eVar3 = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar3, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = C11108e.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar3, str5, false, illegalStateException, str4);
                str2 = str4;
                str3 = str5;
            }
        }
        Object unused = C16312j.b((C17168i) null, new a(this, eVar2, (C17164e<? super a>) null), 1, (Object) null);
        f(aVar2, this.f90494g.c());
        eVar2.c(eVar.h().j(this.f90490c.i()).h(this.f90490c.a()).i(this.f90493f.o().b()).l(this.f90494g.c()).k(str).g());
    }

    public void a() {
        this.f90489b.stop();
        this.f90488a.a((String) null);
        this.f90491d.stop();
    }

    public void b() {
        if (e()) {
            e eVar = this.f90488a;
            C12832d c10 = this.f90496i.c();
            String e10 = c10 != null ? c10.e() : null;
            if (e10 == null) {
                e10 = "";
            }
            g(eVar, e10, this.f90489b, this.f90491d);
            return;
        }
        a();
    }
}
