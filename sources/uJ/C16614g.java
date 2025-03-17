package UJ;

import QJ.C16293K;
import SJ.C16428d;
import SJ.C16449y;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17165f;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0018\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH@¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LUJ/g;", "S", "T", "LUJ/e;", "LTJ/g;", "flow", "LdI/i;", "context", "", "capacity", "LSJ/d;", "onBufferOverflow", "<init>", "(LTJ/g;LdI/i;ILSJ/d;)V", "LTJ/h;", "collector", "newContext", "LXH/N;", "q", "(LTJ/h;LdI/i;LdI/e;)Ljava/lang/Object;", "r", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "LSJ/y;", "scope", "i", "(LSJ/y;LdI/e;)Ljava/lang/Object;", "collect", "", "toString", "()Ljava/lang/String;", "d", "LTJ/g;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.g  reason: case insensitive filesystem */
public abstract class C16614g<S, T> extends C16612e<T> {

    /* renamed from: d  reason: collision with root package name */
    protected final C16532g<S> f139106d;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LTJ/h;", "it", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
    /* renamed from: UJ.g$a */
    static final class a extends l implements p<C16533h<? super T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f139107c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f139108d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16614g<S, T> f139109e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16614g<S, T> gVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f139109e = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f139109e, eVar);
            aVar.f139108d = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
            return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f139107c;
            if (i10 == 0) {
                y.b(obj);
                C16614g<S, T> gVar = this.f139109e;
                this.f139107c = 1;
                if (gVar.r((C16533h) this.f139108d, this) == f10) {
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

    public C16614g(C16532g<? extends S> gVar, C17168i iVar, int i10, C16428d dVar) {
        super(iVar, i10, dVar);
        this.f139106d = gVar;
    }

    static /* synthetic */ <S, T> Object o(C16614g<S, T> gVar, C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
        if (gVar.f139097b == -3) {
            C17168i context = eVar.getContext();
            C17168i k10 = C16293K.k(context, gVar.f139096a);
            if (C17542s.e(k10, context)) {
                Object r10 = gVar.r(hVar, eVar);
                return r10 == C17187b.f() ? r10 : C16807N.f139792a;
            }
            C17165f.b bVar = C17165f.f142966s0;
            if (C17542s.e(k10.get(bVar), context.get(bVar))) {
                Object q10 = gVar.q(hVar, k10, eVar);
                return q10 == C17187b.f() ? q10 : C16807N.f139792a;
            }
        }
        Object collect = super.collect(hVar, eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }

    static /* synthetic */ <S, T> Object p(C16614g<S, T> gVar, C16449y<? super T> yVar, C17164e<? super C16807N> eVar) {
        Object r10 = gVar.r(new C16633z(yVar), eVar);
        return r10 == C17187b.f() ? r10 : C16807N.f139792a;
    }

    private final Object q(C16533h<? super T> hVar, C17168i iVar, C17164e<? super C16807N> eVar) {
        return C16613f.d(iVar, C16613f.e(hVar, eVar.getContext()), (Object) null, new a(this, (C17164e<? super a>) null), eVar, 4, (Object) null);
    }

    public Object collect(C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
        return o(this, hVar, eVar);
    }

    /* access modifiers changed from: protected */
    public Object i(C16449y<? super T> yVar, C17164e<? super C16807N> eVar) {
        return p(this, yVar, eVar);
    }

    /* access modifiers changed from: protected */
    public abstract Object r(C16533h<? super T> hVar, C17164e<? super C16807N> eVar);

    public String toString() {
        return this.f139106d + " -> " + super.toString();
    }
}
