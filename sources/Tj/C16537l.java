package TJ;

import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import UJ.C16626s;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aD\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH@¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LTJ/g;", "LXH/N;", "a", "(LTJ/g;LdI/e;)Ljava/lang/Object;", "T", "LQJ/Q;", "scope", "LQJ/F0;", "d", "(LTJ/g;LQJ/Q;)LQJ/F0;", "Lkotlin/Function2;", "LdI/e;", "", "action", "b", "(LTJ/g;LnI/p;LdI/e;)Ljava/lang/Object;", "LTJ/h;", "flow", "c", "(LTJ/h;LTJ/g;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: TJ.l  reason: case insensitive filesystem */
final /* synthetic */ class C16537l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: TJ.l$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f138660c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16532g<T> f138661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16532g<? extends T> gVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f138661d = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f138661d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f138660c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<T> gVar = this.f138661d;
                this.f138660c = 1;
                if (C16534i.i(gVar, this) == f10) {
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

    public static final Object a(C16532g<?> gVar, C17164e<? super C16807N> eVar) {
        Object collect = gVar.collect(C16626s.f139162a, eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }

    public static final <T> Object b(C16532g<? extends T> gVar, p<? super T, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        Object i10 = C16534i.i(C16538m.b(C16534i.N(gVar, pVar), 0, (C16428d) null, 2, (Object) null), eVar);
        return i10 == C17187b.f() ? i10 : C16807N.f139792a;
    }

    public static final <T> Object c(C16533h<? super T> hVar, C16532g<? extends T> gVar, C17164e<? super C16807N> eVar) {
        C16534i.z(hVar);
        Object collect = gVar.collect(hVar, eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }

    public static final <T> F0 d(C16532g<? extends T> gVar, Q q10) {
        return C16314k.d(q10, (C17168i) null, (T) null, new a(gVar, (C17164e<? super a>) null), 3, (Object) null);
    }
}
