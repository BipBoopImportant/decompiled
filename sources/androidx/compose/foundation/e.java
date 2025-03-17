package androidx.compose.foundation;

import A1.K;
import L1.i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5586I;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import o1.C5667g;
import p0.G;
import p0.w;
import r0.m;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0012\u001a\u00020\r*\u00020\u0011H@¢\u0006\u0004\b\u0012\u0010\u0013JN\u0010\u0014\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/e;", "Landroidx/compose/foundation/a;", "Lr0/m;", "interactionSource", "Ln0/I;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "LL1/i;", "role", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(Lr0/m;Ln0/I;ZLjava/lang/String;LL1/i;LnI/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LA1/K;", "P2", "(LA1/K;LdI/e;)Ljava/lang/Object;", "c3", "(Lr0/m;Ln0/I;ZLjava/lang/String;LL1/i;LnI/a;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class e extends a {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp0/w;", "Lo1/g;", "offset", "LXH/N;", "<anonymous>", "(Lp0/w;Lo1/g;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", f = "Clickable.kt", l = {636}, m = "invokeSuspend")
    static final class a extends l implements q<w, C5667g, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17614c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f17615d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ long f17616e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f17617f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17164e<? super a> eVar2) {
            super(3, eVar2);
            this.f17617f = eVar;
        }

        public final Object i(w wVar, long j10, C17164e<? super C16807N> eVar) {
            a aVar = new a(this.f17617f, eVar);
            aVar.f17615d = wVar;
            aVar.f17616e = j10;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((w) obj, ((C5667g) obj2).v(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17614c;
            if (i10 == 0) {
                y.b(obj);
                w wVar = (w) this.f17615d;
                long j10 = this.f17616e;
                if (this.f17617f.U2()) {
                    e eVar = this.f17617f;
                    this.f17614c = 1;
                    if (eVar.W2(wVar, j10, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C5667g, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f17618c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.f17618c = eVar;
        }

        public final void a(long j10) {
            if (this.f17618c.U2()) {
                this.f17618c.V2().invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C5667g) obj).v());
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ e(m mVar, C5586I i10, boolean z10, String str, i iVar, C17631a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, i10, z10, str, iVar, aVar);
    }

    static /* synthetic */ Object b3(e eVar, K k10, C17164e<? super C16807N> eVar2) {
        Object h10 = G.h(k10, new a(eVar, (C17164e<? super a>) null), new b(eVar), eVar2);
        return h10 == C17187b.f() ? h10 : C16807N.f139792a;
    }

    public Object P2(K k10, C17164e<? super C16807N> eVar) {
        return b3(this, k10, eVar);
    }

    public final void c3(m mVar, C5586I i10, boolean z10, String str, i iVar, C17631a<C16807N> aVar) {
        a3(mVar, i10, z10, str, iVar, aVar);
    }

    private e(m mVar, C5586I i10, boolean z10, String str, i iVar, C17631a<C16807N> aVar) {
        super(mVar, i10, z10, str, iVar, aVar, (DefaultConstructorMarker) null);
    }
}
