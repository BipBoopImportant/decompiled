package YJ;

import WJ.C16736E;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n*\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00038\u0000X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\b8\u0000X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00128\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00128\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0018\u001a\u00020\b8\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010\"\u0016\u0010\u001c\u001a\u00020\u00198\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b*\f\b\u0000\u0010\u001d\"\u00020\u00002\u00020\u0000¨\u0006\u001e"}, d2 = {"", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "", "c", "(Z)Ljava/lang/String;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "submissionTime", "LYJ/h;", "b", "(Ljava/lang/Runnable;JZ)LYJ/h;", "a", "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "I", "CORE_POOL_SIZE", "d", "MAX_POOL_SIZE", "e", "IDLE_WORKER_KEEP_ALIVE_NS", "LYJ/g;", "f", "LYJ/g;", "schedulerTimeSource", "TaskContext", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final String f140522a = C16736E.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b  reason: collision with root package name */
    public static final long f140523b = C16738G.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f140524c = C16738G.e("kotlinx.coroutines.scheduler.core.pool.size", C17978n.e(C16736E.a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f140525d = C16738G.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    public static final long f140526e = TimeUnit.SECONDS.toNanos(C16738G.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: f  reason: collision with root package name */
    public static C16891g f140527f = C16889e.f140513a;

    public static final C16892h b(Runnable runnable, long j10, boolean z10) {
        return new i(runnable, j10, z10);
    }

    /* access modifiers changed from: private */
    public static final String c(boolean z10) {
        return z10 ? "Blocking" : "Non-blocking";
    }
}
