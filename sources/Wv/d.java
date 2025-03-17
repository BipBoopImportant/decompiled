package Wv;

import IC.C13019a;
import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import KJ.C15985a;
import Pv.r;
import TJ.C16532g;
import TJ.C16534i;
import Wv.c;
import XH.C16807N;
import XH.y;
import Yv.g;
import Yv.m;
import aA.C13910b;
import dI.C17164e;
import eI.C17187b;
import is.C11414a;
import java.util.List;
import kD.j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lD.C14761c;
import nI.s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0010B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LWv/d;", "LWv/c;", "Lis/a;", "inboxIntegration", "LYv/m;", "getGreetingFlowUseCase", "LlD/c;", "getProfileFlowUseCase", "LYv/g;", "getContextualCardsUseCase", "<init>", "(Lis/a;LYv/m;LlD/c;LYv/g;)V", "LaA/b;", "userState", "LTJ/g;", "LWv/c$a;", "a", "(LaA/b;)LTJ/g;", "Lis/a;", "b", "LYv/m;", "c", "LlD/c;", "d", "LYv/g;", "e", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f40595e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f40596f = 8;

    /* renamed from: g  reason: collision with root package name */
    private static final long f40597g = C15908d.s(1, C15909e.MINUTES);

    /* renamed from: a  reason: collision with root package name */
    private final C11414a f40598a;

    /* renamed from: b  reason: collision with root package name */
    private final m f40599b;

    /* renamed from: c  reason: collision with root package name */
    private final C14761c f40600c;

    /* renamed from: d  reason: collision with root package name */
    private final g f40601d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LWv/d$a;", "", "<init>", "()V", "LIJ/b;", "REFRESH_GREETING_INTERVAL", "J", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LEs/a;", "inboxState", "LIC/a;", "greeting", "LkD/j;", "profileResult", "", "LPv/r;", "contextualCards", "LWv/c$a;", "<anonymous>", "(LEs/a;LIC/a;LkD/j;Ljava/util/List;)LWv/c$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.orchestrator.ScaffoldOrchestratorImpl$asFlow$1", f = "ScaffoldOrchestrator.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements s<Es.a, C13019a, j, List<? extends r>, C17164e<? super c.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40602c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f40603d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f40604e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f40605f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f40606g;

        b(C17164e<? super b> eVar) {
            super(5, eVar);
        }

        /* renamed from: i */
        public final Object z(Es.a aVar, C13019a aVar2, j jVar, List<r> list, C17164e<? super c.a> eVar) {
            b bVar = new b(eVar);
            bVar.f40603d = aVar;
            bVar.f40604e = aVar2;
            bVar.f40605f = jVar;
            bVar.f40606g = list;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f40602c == 0) {
                y.b(obj);
                return new c.a((C13019a) this.f40604e, (Es.a) this.f40603d, C15985a.l((List) this.f40606g), e.a(), (j) this.f40605f);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        C15906b.a aVar = C15906b.f135496b;
    }

    public d(C11414a aVar, m mVar, C14761c cVar, g gVar) {
        C17542s.j(aVar, "inboxIntegration");
        C17542s.j(mVar, "getGreetingFlowUseCase");
        C17542s.j(cVar, "getProfileFlowUseCase");
        C17542s.j(gVar, "getContextualCardsUseCase");
        this.f40598a = aVar;
        this.f40599b = mVar;
        this.f40600c = cVar;
        this.f40601d = gVar;
    }

    public C16532g<c.a> a(C13910b bVar) {
        C17542s.j(bVar, "userState");
        return C16534i.l(this.f40598a.getState(), this.f40599b.a(f40597g), this.f40600c.invoke(), this.f40601d.a(bVar), new b((C17164e<? super b>) null));
    }
}
