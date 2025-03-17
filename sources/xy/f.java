package xy;

import KJ.C15987c;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.B;
import U0.C4889m;
import U0.C4895p;
import U0.P;
import XH.C16807N;
import XH.y;
import android.content.Context;
import com.ingka.ikea.core.model.Link;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import nI.q;
import sy.C15053a;
import uy.c;
import uy.d;
import wy.l;
import x4.C8951o;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH@¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lxy/f;", "", "Lsy/a;", "Luy/c;", "roomExternalNavigationContract", "<init>", "(Luy/c;)V", "Luy/d;", "roomInternalNavigation", "Lcom/ingka/ikea/core/model/Link;", "link", "LXH/N;", "d", "(Luy/d;Lcom/ingka/ikea/core/model/Link;LdI/e;)Ljava/lang/Object;", "slotModel", "Lwy/l;", "c", "(Lsy/a;Luy/d;)Lwy/l;", "a", "Luy/c;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final c f132120a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C15053a, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f132121a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f132122b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.room.impl.presentation.composables.assistancecards.AssistanceCardsSlotFactory$create$1$1$1$1", f = "AssistanceCardsSlotFactory.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: xy.f$a$a  reason: collision with other inner class name */
        static final class C3266a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f132123c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f f132124d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ d f132125e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Link f132126f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3266a(f fVar, d dVar, Link link, C17164e<? super C3266a> eVar) {
                super(2, eVar);
                this.f132124d = fVar;
                this.f132125e = dVar;
                this.f132126f = link;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3266a(this.f132124d, this.f132125e, this.f132126f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3266a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f132123c;
                if (i10 == 0) {
                    y.b(obj);
                    f fVar = this.f132124d;
                    d dVar = this.f132125e;
                    Link link = this.f132126f;
                    this.f132123c = 1;
                    if (fVar.d(dVar, link, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        a(f fVar, d dVar) {
            this.f132121a = fVar;
            this.f132122b = dVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(Q q10, f fVar, d dVar, Link link) {
            C17542s.j(link, "link");
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new C3266a(fVar, dVar, link, (C17164e<? super C3266a>) null), 3, (Object) null);
            return C16807N.f139792a;
        }

        public final void b(C15053a aVar, C4889m mVar, int i10) {
            C17542s.j(aVar, "assistanceCardsSlotModel");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(aVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1580801581, i10, -1, "com.ingka.ikea.room.impl.presentation.composables.assistancecards.AssistanceCardsSlotFactory.create.<anonymous> (AssistanceCardsSlotFactory.kt:27)");
                }
                Object D10 = mVar.D();
                C4889m.a aVar2 = C4889m.f14007a;
                if (D10 == aVar2.a()) {
                    B b10 = new B(P.k(C17169j.f142968a, mVar));
                    mVar.u(b10);
                    D10 = b10;
                }
                Q a10 = ((B) D10).a();
                String b11 = aVar.b();
                C15987c<C15053a.C3241a> a11 = aVar.a();
                mVar.W(895405);
                boolean F10 = mVar.F(a10) | mVar.F(this.f132121a) | mVar.F(this.f132122b);
                f fVar = this.f132121a;
                d dVar = this.f132122b;
                Object D11 = mVar.D();
                if (F10 || D11 == aVar2.a()) {
                    D11 = new e(a10, fVar, dVar);
                    mVar.u(D11);
                }
                mVar.P();
                C15273c.b(b11, a11, (C17642l) D11, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C15053a) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public f(c cVar) {
        C17542s.j(cVar, "roomExternalNavigationContract");
        this.f132120a = cVar;
    }

    /* access modifiers changed from: private */
    public final Object d(d dVar, Link link, C17164e<? super C16807N> eVar) {
        Object a10 = dVar.a(new d.a.c(new C15274d(this, link)), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(f fVar, Link link, Context context, C8951o oVar) {
        C17542s.j(context, "context");
        C17542s.j(oVar, "navController");
        fVar.f132120a.b(context, oVar, link);
        return C16807N.f139792a;
    }

    public wy.l c(C15053a aVar, d dVar) {
        C17542s.j(aVar, "slotModel");
        C17542s.j(dVar, "roomInternalNavigation");
        return new wy.l(new l.b(aVar, c1.c.c(1580801581, true, new a(this, dVar))));
    }
}
