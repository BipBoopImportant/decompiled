package U0;

import QJ.C16297b0;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.Q;
import U0.C4879h0;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005H@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LU0/Z0;", "LU0/h0;", "<init>", "()V", "R", "Lkotlin/Function1;", "", "onFrame", "i0", "(LnI/l;LdI/e;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Z0 implements C4879h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Z0 f13897a = new Z0();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"R", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {52}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super R>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f13898c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Long, R> f13899d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super Long, ? extends R> lVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f13899d = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f13899d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super R> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f13898c;
            if (i10 == 0) {
                y.b(obj);
                this.f13898c = 1;
                if (C16297b0.b(16, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f13899d.invoke(b.f(System.nanoTime()));
        }
    }

    private Z0() {
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return C4879h0.a.a(this, r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return C4879h0.a.b(this, cVar);
    }

    public <R> Object i0(C17642l<? super Long, ? extends R> lVar, C17164e<? super R> eVar) {
        return C16310i.g(C16311i0.c(), new a(lVar, (C17164e<? super a>) null), eVar);
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return C4879h0.a.c(this, cVar);
    }

    public C17168i plus(C17168i iVar) {
        return C4879h0.a.d(this, iVar);
    }
}
