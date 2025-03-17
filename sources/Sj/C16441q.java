package SJ;

import QJ.Q;
import SJ.C16438n;
import XH.C16807N;
import XH.x;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"E", "LSJ/B;", "element", "LSJ/n;", "LXH/N;", "a", "(LSJ/B;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* renamed from: SJ.q  reason: case insensitive filesystem */
final /* synthetic */ class C16441q {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "LSJ/n;", "LXH/N;", "<anonymous>", "(LQJ/Q;)LSJ/n;"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
    /* renamed from: SJ.q$a */
    static final class a extends l implements p<Q, C17164e<? super C16438n<? extends C16807N>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f138336c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f138337d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16423B<E> f138338e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ E f138339f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16423B<? super E> b10, E e10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f138338e = b10;
            this.f138339f = e10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f138338e, this.f138339f, eVar);
            aVar.f138337d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16438n<C16807N>> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f138336c;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f138337d;
                C16423B<E> b10 = this.f138338e;
                E e10 = this.f138339f;
                x.a aVar = x.f139812b;
                this.f138336c = 1;
                if (b10.y(e10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    x.a aVar2 = x.f139812b;
                    obj2 = x.b(y.a(th2));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = x.b(C16807N.f139792a);
            return C16438n.b(x.h(obj2) ? C16438n.f138330b.c(C16807N.f139792a) : C16438n.f138330b.a(x.e(obj2)));
        }
    }

    public static final <E> Object a(C16423B<? super E> b10, E e10) {
        Object k10 = b10.k(e10);
        if (k10 instanceof C16438n.c) {
            return ((C16438n) C16312j.b((C17168i) null, new a(b10, e10, (C17164e<? super a>) null), 1, (Object) null)).l();
        }
        C16807N n10 = (C16807N) k10;
        return C16438n.f138330b.c(C16807N.f139792a);
    }
}
