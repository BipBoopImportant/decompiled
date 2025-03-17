package G8;

import D8.c;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u000bB\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0019\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"LG8/u;", "", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "workQueue", "<init>", "(Ljava/util/concurrent/BlockingQueue;)V", "T", "Ljava/util/concurrent/Callable;", "task", "Ljava/util/concurrent/Future;", "a", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "Ljava/util/concurrent/BlockingQueue;", "getWorkQueue", "()Ljava/util/concurrent/BlockingQueue;", "Ljava/util/concurrent/ThreadPoolExecutor;", "b", "Ljava/util/concurrent/ThreadPoolExecutor;", "getExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "setExecutor", "(Ljava/util/concurrent/ThreadPoolExecutor;)V", "getExecutor$annotations", "()V", "executor", "c", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u {

    /* renamed from: c  reason: collision with root package name */
    public static final a f36289c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final int f36290d = Runtime.getRuntime().availableProcessors();

    /* renamed from: e  reason: collision with root package name */
    private static final TimeUnit f36291e = TimeUnit.SECONDS;

    /* renamed from: f  reason: collision with root package name */
    private static final c f36292f = new c("ThreadExecutor");

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f36293a;

    /* renamed from: b  reason: collision with root package name */
    private ThreadPoolExecutor f36294b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LG8/u$a;", "", "<init>", "()V", "", "AVAILABLE_PROCESSORS", "I", "BLOCKING_QUEUE_SIZE", "CORE_POOL_SIZE", "", "KEEP_ALIVE", "J", "LD8/c;", "LOGGER", "LD8/c;", "Ljava/util/concurrent/TimeUnit;", "TIME_UNIT", "Ljava/util/concurrent/TimeUnit;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public u() {
        this((BlockingQueue) null, 1, (DefaultConstructorMarker) null);
    }

    public final <T> Future<T> a(Callable<T> callable) {
        C17542s.j(callable, "task");
        Future<T> submit = this.f36294b.submit(callable);
        C17542s.i(submit, "executor.submit(task)");
        return submit;
    }

    public u(BlockingQueue<Runnable> blockingQueue) {
        C17542s.j(blockingQueue, "workQueue");
        this.f36293a = blockingQueue;
        c cVar = f36292f;
        StringBuilder sb2 = new StringBuilder("Building a ThreadPoolExecutor maxSize ");
        int i10 = f36290d;
        sb2.append(i10);
        cVar.f(sb2.toString());
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, i10, 30, f36291e, blockingQueue);
        this.f36294b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(BlockingQueue blockingQueue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayBlockingQueue(10) : blockingQueue);
    }
}
