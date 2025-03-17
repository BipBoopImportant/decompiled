package UJ;

import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import XJ.C16833b;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002$\b\u0001\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H@¢\u0006\u0004\b\u0006\u0010\u0007\u001aM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000020\b\u0001\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"R", "Lkotlin/Function2;", "LQJ/Q;", "LdI/e;", "", "block", "a", "(LnI/p;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function3;", "LTJ/h;", "LXH/N;", "LTJ/g;", "b", "(LnI/q;)LTJ/g;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.o  reason: case insensitive filesystem */
public final class C16622o {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"UJ/o$a", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UJ.o$a */
    public static final class a implements C16532g<R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f139155a;

        public a(q qVar) {
            this.f139155a = qVar;
        }

        public Object collect(C16533h<? super R> hVar, C17164e<? super C16807N> eVar) {
            Object a10 = C16622o.a(new b(this.f139155a, hVar, (C17164e<? super b>) null), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: UJ.o$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f139156c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f139157d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<Q, C16533h<? super R>, C17164e<? super C16807N>, Object> f139158e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16533h<R> f139159f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q<? super Q, ? super C16533h<? super R>, ? super C17164e<? super C16807N>, ? extends Object> qVar, C16533h<? super R> hVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f139158e = qVar;
            this.f139159f = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f139158e, this.f139159f, eVar);
            bVar.f139157d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f139156c;
            if (i10 == 0) {
                y.b(obj);
                q<Q, C16533h<? super R>, C17164e<? super C16807N>, Object> qVar = this.f139158e;
                C16533h<R> hVar = this.f139159f;
                this.f139156c = 1;
                if (qVar.invoke((Q) this.f139157d, hVar, this) == f10) {
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

    public static final <R> Object a(p<? super Q, ? super C17164e<? super R>, ? extends Object> pVar, C17164e<? super R> eVar) {
        C16621n nVar = new C16621n(eVar.getContext(), eVar);
        Object b10 = C16833b.b(nVar, nVar, pVar);
        if (b10 == C17187b.f()) {
            h.c(eVar);
        }
        return b10;
    }

    public static final <R> C16532g<R> b(q<? super Q, ? super C16533h<? super R>, ? super C17164e<? super C16807N>, ? extends Object> qVar) {
        return new a(qVar);
    }
}
