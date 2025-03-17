package ip;

import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"T", "M", "LTJ/P;", "LQJ/Q;", "coroutineScope", "Lkotlin/Function1;", "mapper", "a", "(LTJ/P;LQJ/Q;LnI/l;)LTJ/P;", "Lkotlin/Function0;", "getValue", "LTJ/g;", "flow", "b", "(LnI/a;LTJ/g;)LTJ/P;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.core.extensions.common.StateFlowExtensionsKt$mapStateFlow$1", f = "StateFlowExtensions.kt", l = {31}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98545c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16519P<T> f98546d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16505B<M> f98547e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<T, M> f98548f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ip.n$a$a  reason: collision with other inner class name */
        static final class C2224a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16505B<M> f98549a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<T, M> f98550b;

            C2224a(C16505B<M> b10, C17642l<? super T, ? extends M> lVar) {
                this.f98549a = b10;
                this.f98550b = lVar;
            }

            public final Object emit(T t10, C17164e<? super C16807N> eVar) {
                Object emit = this.f98549a.emit(this.f98550b.invoke(t10), eVar);
                return emit == C17187b.f() ? emit : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16519P<? extends T> p10, C16505B<M> b10, C17642l<? super T, ? extends M> lVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f98546d = p10;
            this.f98547e = b10;
            this.f98548f = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f98546d, this.f98547e, this.f98548f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f98545c;
            if (i10 == 0) {
                y.b(obj);
                C16519P<T> p10 = this.f98546d;
                C2224a aVar = new C2224a(this.f98547e, this.f98548f);
                this.f98545c = 1;
                if (p10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    public static final <T, M> C16519P<M> a(C16519P<? extends T> p10, Q q10, C17642l<? super T, ? extends M> lVar) {
        C17542s.j(p10, "<this>");
        C17542s.j(q10, "coroutineScope");
        C17542s.j(lVar, "mapper");
        C16505B a10 = C16521S.a(lVar.invoke(p10.getValue()));
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(p10, a10, lVar, (C17164e<? super a>) null), 3, (Object) null);
        return a10;
    }

    public static final <T> C16519P<T> b(C17631a<? extends T> aVar, C16532g<? extends T> gVar) {
        C17542s.j(aVar, "getValue");
        C17542s.j(gVar, "flow");
        return new p(aVar, gVar);
    }
}
