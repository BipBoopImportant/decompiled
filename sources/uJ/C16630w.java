package UJ;

import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import nI.q;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/Function3;", "LTJ/h;", "", "LdI/e;", "LXH/N;", "a", "LnI/q;", "getEmitFun$annotations", "()V", "emitFun", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.w  reason: case insensitive filesystem */
public final class C16630w {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final q<C16533h<Object>, Object, C17164e<? super C16807N>, Object> f139171a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UJ.w$a */
    /* synthetic */ class a extends C17540p implements q<C16533h<? super Object>, Object, C17164e<? super C16807N>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f139172a = new a();

        a() {
            super(3, C16533h.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: t */
        public final Object invoke(C16533h<Object> hVar, Object obj, C17164e<? super C16807N> eVar) {
            return hVar.emit(obj, eVar);
        }
    }

    static {
        a aVar = a.f139172a;
        C17542s.h(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f139171a = (q) W.g(aVar, 3);
    }
}
