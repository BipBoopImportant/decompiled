package U0;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.C16320n;
import QJ.C16324p;
import QJ.Q;
import U0.C4879h0;
import XH.C16807N;
import XH.x;
import XH.y;
import android.view.Choreographer;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005H@¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LU0/G;", "LU0/h0;", "<init>", "()V", "R", "Lkotlin/Function1;", "", "onFrame", "i0", "(LnI/l;LdI/e;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "b", "Landroid/view/Choreographer;", "choreographer", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class G implements C4879h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final G f13747a = new G();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Choreographer f13748b = ((Choreographer) C16310i.e(C16311i0.c().P0(), new a((C17164e<? super a>) null)));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>", "(LQJ/Q;)Landroid/view/Choreographer;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super Choreographer>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f13749c;

        a(C17164e<? super a> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Choreographer> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f13749c == 0) {
                y.b(obj);
                return Choreographer.getInstance();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f13750c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f13750c = frameCallback;
        }

        public final void a(Throwable th2) {
            G.f13748b.removeFrameCallback(this.f13750c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "frameTimeNanos", "LXH/N;", "doFrame", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<R> f13751a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Long, R> f13752b;

        c(C16320n<? super R> nVar, C17642l<? super Long, ? extends R> lVar) {
            this.f13751a = nVar;
            this.f13752b = lVar;
        }

        public final void doFrame(long j10) {
            Object obj;
            C16320n<R> nVar = this.f13751a;
            G g10 = G.f13747a;
            C17642l<Long, R> lVar = this.f13752b;
            try {
                x.a aVar = x.f139812b;
                obj = x.b(lVar.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                x.a aVar2 = x.f139812b;
                obj = x.b(y.a(th2));
            }
            nVar.resumeWith(obj);
        }
    }

    private G() {
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return C4879h0.a.a(this, r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return C4879h0.a.b(this, cVar);
    }

    public <R> Object i0(C17642l<? super Long, ? extends R> lVar, C17164e<? super R> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        c cVar = new c(pVar, lVar);
        f13748b.postFrameCallback(cVar);
        pVar.K(new b(cVar));
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10;
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return C4879h0.a.c(this, cVar);
    }

    public C17168i plus(C17168i iVar) {
        return C4879h0.a.d(this, iVar);
    }
}
