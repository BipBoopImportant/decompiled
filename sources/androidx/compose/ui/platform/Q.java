package androidx.compose.ui.platform;

import QJ.C16320n;
import QJ.C16324p;
import U0.C4879h0;
import XH.C16807N;
import XH.x;
import XH.y;
import android.view.Choreographer;
import dI.C17164e;
import dI.C17165f;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tH@¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/Q;", "LU0/h0;", "Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/O;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/O;)V", "R", "Lkotlin/Function1;", "", "onFrame", "i0", "(LnI/l;LdI/e;)Ljava/lang/Object;", "a", "Landroid/view/Choreographer;", "()Landroid/view/Choreographer;", "b", "Landroidx/compose/ui/platform/O;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Q implements C4879h0 {

    /* renamed from: a  reason: collision with root package name */
    private final Choreographer f19323a;

    /* renamed from: b  reason: collision with root package name */
    private final O f19324b;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O f19325c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f19326d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(O o10, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f19325c = o10;
            this.f19326d = frameCallback;
        }

        public final void a(Throwable th2) {
            this.f19325c.D1(this.f19326d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f19327c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f19328d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Q q10, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f19327c = q10;
            this.f19328d = frameCallback;
        }

        public final void a(Throwable th2) {
            this.f19327c.a().removeFrameCallback(this.f19328d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "frameTimeNanos", "LXH/N;", "doFrame", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<R> f19329a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q f19330b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Long, R> f19331c;

        c(C16320n<? super R> nVar, Q q10, C17642l<? super Long, ? extends R> lVar) {
            this.f19329a = nVar;
            this.f19330b = q10;
            this.f19331c = lVar;
        }

        public final void doFrame(long j10) {
            Object obj;
            C16320n<R> nVar = this.f19329a;
            C17642l<Long, R> lVar = this.f19331c;
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

    public Q(Choreographer choreographer, O o10) {
        this.f19323a = choreographer;
        this.f19324b = o10;
    }

    public final Choreographer a() {
        return this.f19323a;
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return C4879h0.a.a(this, r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return C4879h0.a.b(this, cVar);
    }

    public <R> Object i0(C17642l<? super Long, ? extends R> lVar, C17164e<? super R> eVar) {
        O o10 = this.f19324b;
        if (o10 == null) {
            C17168i.b bVar = eVar.getContext().get(C17165f.f142966s0);
            o10 = bVar instanceof O ? (O) bVar : null;
        }
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        c cVar = new c(pVar, this, lVar);
        if (o10 == null || !C17542s.e(o10.a1(), a())) {
            a().postFrameCallback(cVar);
            pVar.K(new b(this, cVar));
        } else {
            o10.y1(cVar);
            pVar.K(new a(o10, cVar));
        }
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
