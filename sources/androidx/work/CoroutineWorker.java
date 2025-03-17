package androidx.work;

import QJ.C16311i0;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16814e;
import XH.y;
import android.content.Context;
import androidx.concurrent.futures.e;
import androidx.work.C7054x;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import ob.C10101e;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u000f\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH@¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010\u001d\u001a\u00020\u001c8\u0016X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/x;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lob/e;", "Landroidx/work/x$a;", "startWork", "()Lob/e;", "doWork", "(LdI/e;)Ljava/lang/Object;", "Landroidx/work/l;", "getForegroundInfo", "Landroidx/work/f;", "data", "LXH/N;", "setProgress", "(Landroidx/work/f;LdI/e;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Landroidx/work/l;LdI/e;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Landroidx/work/WorkerParameters;", "LQJ/M;", "coroutineContext", "LQJ/M;", "getCoroutineContext", "()LQJ/M;", "getCoroutineContext$annotations", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CoroutineWorker extends C7054x {
    private final M coroutineContext = a.f45059b;
    private final WorkerParameters params;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/work/CoroutineWorker$a;", "LQJ/M;", "<init>", "()V", "LdI/i;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LXH/N;", "E0", "(LdI/i;Ljava/lang/Runnable;)V", "", "I0", "(LdI/i;)Z", "c", "LQJ/M;", "getDispatcher", "()LQJ/M;", "dispatcher", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends M {

        /* renamed from: b  reason: collision with root package name */
        public static final a f45059b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final M f45060c = C16311i0.a();

        private a() {
        }

        public void E0(C17168i iVar, Runnable runnable) {
            C17542s.j(iVar, "context");
            C17542s.j(runnable, "block");
            f45060c.E0(iVar, runnable);
        }

        public boolean I0(C17168i iVar) {
            C17542s.j(iVar, "context");
            return f45060c.I0(iVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Landroidx/work/l;", "<anonymous>", "(LQJ/Q;)Landroidx/work/l;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {121}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C7043l>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f45061c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f45062d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CoroutineWorker coroutineWorker, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f45062d = coroutineWorker;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f45062d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C7043l> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f45061c;
            if (i10 == 0) {
                y.b(obj);
                CoroutineWorker coroutineWorker = this.f45062d;
                this.f45061c = 1;
                obj = coroutineWorker.getForegroundInfo(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Landroidx/work/x$a;", "<anonymous>", "(LQJ/Q;)Landroidx/work/x$a;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {67}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C7054x.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f45063c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f45064d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CoroutineWorker coroutineWorker, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f45064d = coroutineWorker;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f45064d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C7054x.a> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f45063c;
            if (i10 == 0) {
                y.b(obj);
                CoroutineWorker coroutineWorker = this.f45064d;
                this.f45063c = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C17542s.j(context, "appContext");
        C17542s.j(workerParameters, "params");
        this.params = workerParameters;
    }

    @C16814e
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, C17164e<? super C7043l> eVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(C17164e<? super C7054x.a> eVar);

    public M getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(C17164e<? super C7043l> eVar) {
        return getForegroundInfo$suspendImpl(this, eVar);
    }

    public final C10101e<C7043l> getForegroundInfoAsync() {
        return C7052v.k(getCoroutineContext().plus(J0.b((F0) null, 1, (Object) null)), (T) null, new b(this, (C17164e<? super b>) null), 2, (Object) null);
    }

    public final void onStopped() {
        super.onStopped();
    }

    public final Object setForeground(C7043l lVar, C17164e<? super C16807N> eVar) {
        C10101e<Void> foregroundAsync = setForegroundAsync(lVar);
        C17542s.i(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        Object b10 = e.b(foregroundAsync, eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }

    public final Object setProgress(C7037f fVar, C17164e<? super C16807N> eVar) {
        C10101e<Void> progressAsync = setProgressAsync(fVar);
        C17542s.i(progressAsync, "setProgressAsync(data)");
        Object b10 = e.b(progressAsync, eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }

    public final C10101e<C7054x.a> startWork() {
        C17168i coroutineContext2 = !C17542s.e(getCoroutineContext(), a.f45059b) ? getCoroutineContext() : this.params.l();
        C17542s.i(coroutineContext2, "if (coroutineContext != …rkerContext\n            }");
        return C7052v.k(coroutineContext2.plus(J0.b((F0) null, 1, (Object) null)), (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
    }
}
