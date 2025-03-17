package androidx.lifecycle;

import QJ.C16297b0;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B]\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R6\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010!¨\u0006$"}, d2 = {"Landroidx/lifecycle/c;", "T", "", "Landroidx/lifecycle/f;", "liveData", "Lkotlin/Function2;", "Landroidx/lifecycle/G;", "LdI/e;", "LXH/N;", "block", "", "timeoutInMs", "LQJ/Q;", "scope", "Lkotlin/Function0;", "onDone", "<init>", "(Landroidx/lifecycle/f;LnI/p;JLQJ/Q;LnI/a;)V", "h", "()V", "g", "a", "Landroidx/lifecycle/f;", "b", "LnI/p;", "c", "J", "d", "LQJ/Q;", "e", "LnI/a;", "LQJ/F0;", "f", "LQJ/F0;", "runningJob", "cancellationJob", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.c  reason: case insensitive filesystem */
public final class C5200c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C5203f<T> f22240a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final p<G<T>, C17164e<? super C16807N>, Object> f22241b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final long f22242c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f22243d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C17631a<C16807N> f22244e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public F0 f22245f;

    /* renamed from: g  reason: collision with root package name */
    private F0 f22246g;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {188}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.c$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f22247c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5200c<T> f22248d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5200c<T> cVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f22248d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f22248d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f22247c;
            if (i10 == 0) {
                y.b(obj);
                long e10 = this.f22248d.f22242c;
                this.f22247c = 1;
                if (C16297b0.b(e10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!this.f22248d.f22240a.hasActiveObservers()) {
                F0 d10 = this.f22248d.f22245f;
                if (d10 != null) {
                    F0.a.a(d10, (CancellationException) null, 1, (Object) null);
                }
                this.f22248d.f22245f = null;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {177}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.c$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f22249c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f22250d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5200c<T> f22251e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5200c<T> cVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f22251e = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f22251e, eVar);
            bVar.f22250d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f22249c;
            if (i10 == 0) {
                y.b(obj);
                H h10 = new H(this.f22251e.f22240a, ((Q) this.f22250d).getCoroutineContext());
                p a10 = this.f22251e.f22241b;
                this.f22249c = 1;
                if (a10.invoke(h10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f22251e.f22244e.invoke();
            return C16807N.f139792a;
        }
    }

    public C5200c(C5203f<T> fVar, p<? super G<T>, ? super C17164e<? super C16807N>, ? extends Object> pVar, long j10, Q q10, C17631a<C16807N> aVar) {
        C17542s.j(fVar, "liveData");
        C17542s.j(pVar, "block");
        C17542s.j(q10, "scope");
        C17542s.j(aVar, "onDone");
        this.f22240a = fVar;
        this.f22241b = pVar;
        this.f22242c = j10;
        this.f22243d = q10;
        this.f22244e = aVar;
    }

    public final void g() {
        if (this.f22246g == null) {
            this.f22246g = C16314k.d(this.f22243d, C16311i0.c().P0(), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
    }

    public final void h() {
        F0 f02 = this.f22246g;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f22246g = null;
        if (this.f22245f == null) {
            this.f22245f = C16314k.d(this.f22243d, (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
        }
    }
}
