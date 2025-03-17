package androidx.lifecycle;

import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import androidx.lifecycle.r;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/t;", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/r;", "lifecycle", "LdI/i;", "coroutineContext", "<init>", "(Landroidx/lifecycle/r;LdI/i;)V", "LXH/N;", "b", "()V", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "a", "Landroidx/lifecycle/r;", "()Landroidx/lifecycle/r;", "LdI/i;", "getCoroutineContext", "()LdI/i;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.t  reason: case insensitive filesystem */
public final class C5216t extends C5215s implements C5218v {

    /* renamed from: a  reason: collision with root package name */
    private final r f22341a;

    /* renamed from: b  reason: collision with root package name */
    private final C17168i f22342b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.t$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f22343c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f22344d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5216t f22345e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5216t tVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f22345e = tVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f22345e, eVar);
            aVar.f22344d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f22343c == 0) {
                y.b(obj);
                Q q10 = (Q) this.f22344d;
                if (this.f22345e.a().d().compareTo(r.b.INITIALIZED) >= 0) {
                    this.f22345e.a().c(this.f22345e);
                } else {
                    J0.f(q10.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C5216t(r rVar, C17168i iVar) {
        C17542s.j(rVar, "lifecycle");
        C17542s.j(iVar, "coroutineContext");
        this.f22341a = rVar;
        this.f22342b = iVar;
        if (a().d() == r.b.DESTROYED) {
            J0.f(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    public r a() {
        return this.f22341a;
    }

    public final void b() {
        F0 unused = C16314k.d(this, C16311i0.c().P0(), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
    }

    public void e(C5221y yVar, r.a aVar) {
        C17542s.j(yVar, "source");
        C17542s.j(aVar, "event");
        if (a().d().compareTo(r.b.DESTROYED) <= 0) {
            a().g(this);
            J0.f(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    public C17168i getCoroutineContext() {
        return this.f22342b;
    }
}
