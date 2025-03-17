package G8;

import QJ.C16297b0;
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
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\t*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"LG8/f;", "", "", "intervalMilliSec", "LQJ/Q;", "coroutineScope", "<init>", "(JLQJ/Q;)V", "Lkotlin/Function0;", "LXH/N;", "action", "b", "(LQJ/Q;LnI/a;)V", "c", "(LnI/a;)V", "a", "J", "LQJ/Q;", "LQJ/F0;", "LQJ/F0;", "debounceJob", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final long f36265a;

    /* renamed from: b  reason: collision with root package name */
    private final Q f36266b;

    /* renamed from: c  reason: collision with root package name */
    private F0 f36267c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.contentsquare.android.core.utils.Debouncer$debounceRun$1", f = "Debouncer.kt", l = {32}, m = "invokeSuspend")
    public static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f36268c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f36269d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f36270e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, C17631a<C16807N> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f36269d = fVar;
            this.f36270e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f36269d, this.f36270e, eVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f36268c;
            if (i10 == 0) {
                y.b(obj);
                long a10 = this.f36269d.f36265a;
                this.f36268c = 1;
                if (C16297b0.b(a10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f36270e.invoke();
            return C16807N.f139792a;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    public f(long j10, Q q10) {
        C17542s.j(q10, "coroutineScope");
        this.f36265a = j10;
        this.f36266b = q10;
    }

    private final void b(Q q10, C17631a<C16807N> aVar) {
        F0 f02 = this.f36267c;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f36267c = C16314k.d(q10, (C17168i) null, (T) null, new a(this, aVar, (C17164e<? super a>) null), 3, (Object) null);
    }

    public final void c(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "action");
        b(this.f36266b, aVar);
    }
}
