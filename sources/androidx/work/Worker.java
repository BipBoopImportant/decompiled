package androidx.work;

import android.content.Context;
import androidx.work.C7054x;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import ob.C10101e;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/Worker;", "Landroidx/work/x;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/x$a;", "b", "()Landroidx/work/x$a;", "Lob/e;", "startWork", "()Lob/e;", "Landroidx/work/l;", "getForegroundInfoAsync", "c", "()Landroidx/work/l;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Worker extends C7054x {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/work/l;", "b", "()Landroidx/work/l;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C7043l> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Worker f45109c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Worker worker) {
            super(0);
            this.f45109c = worker;
        }

        /* renamed from: b */
        public final C7043l invoke() {
            return this.f45109c.c();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/work/x$a;", "b", "()Landroidx/work/x$a;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<C7054x.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Worker f45110c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Worker worker) {
            super(0);
            this.f45110c = worker;
        }

        /* renamed from: b */
        public final C7054x.a invoke() {
            return this.f45110c.b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C17542s.j(context, "context");
        C17542s.j(workerParameters, "workerParams");
    }

    public abstract C7054x.a b();

    public C7043l c() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    public C10101e<C7043l> getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        C17542s.i(backgroundExecutor, "backgroundExecutor");
        return a0.e(backgroundExecutor, new a(this));
    }

    public final C10101e<C7054x.a> startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        C17542s.i(backgroundExecutor, "backgroundExecutor");
        return a0.e(backgroundExecutor, new b(this));
    }
}
