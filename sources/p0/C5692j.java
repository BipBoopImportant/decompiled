package p0;

import QJ.Q;
import QJ.S;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n0.C5589L;
import n0.C5591N;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH@¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lp0/j;", "Lp0/r;", "Lkotlin/Function1;", "", "LXH/N;", "onDelta", "<init>", "(LnI/l;)V", "Ln0/L;", "dragPriority", "Lkotlin/Function2;", "Lp0/n;", "LdI/e;", "", "block", "b", "(Ln0/L;LnI/p;LdI/e;)Ljava/lang/Object;", "a", "LnI/l;", "e", "()LnI/l;", "Lp0/n;", "dragScope", "Ln0/N;", "c", "Ln0/N;", "scrollMutex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p0.j  reason: case insensitive filesystem */
final class C5692j implements r {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<Float, C16807N> f27041a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final n f27042b = new b(this);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C5591N f27043c = new C5591N();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {626}, m = "invokeSuspend")
    /* renamed from: p0.j$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f27044c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5692j f27045d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5589L f27046e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<n, C17164e<? super C16807N>, Object> f27047f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5692j jVar, C5589L l10, p<? super n, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f27045d = jVar;
            this.f27046e = l10;
            this.f27047f = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f27045d, this.f27046e, this.f27047f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f27044c;
            if (i10 == 0) {
                y.b(obj);
                C5591N d10 = this.f27045d.f27043c;
                n c10 = this.f27045d.f27042b;
                C5589L l10 = this.f27046e;
                p<n, C17164e<? super C16807N>, Object> pVar = this.f27047f;
                this.f27044c = 1;
                if (d10.f(c10, l10, pVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"p0/j$b", "Lp0/n;", "", "pixels", "LXH/N;", "a", "(F)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p0.j$b */
    public static final class b implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5692j f27048a;

        b(C5692j jVar) {
            this.f27048a = jVar;
        }

        public void a(float f10) {
            this.f27048a.e().invoke(Float.valueOf(f10));
        }
    }

    public C5692j(C17642l<? super Float, C16807N> lVar) {
        this.f27041a = lVar;
    }

    public Object b(C5589L l10, p<? super n, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        Object f10 = S.f(new a(this, l10, pVar, (C17164e<? super a>) null), eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    public final C17642l<Float, C16807N> e() {
        return this.f27041a;
    }
}
