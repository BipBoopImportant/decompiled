package androidx.work;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/work/U;", "", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "", "throwable", "<init>", "(Ljava/lang/String;Landroidx/work/WorkerParameters;Ljava/lang/Throwable;)V", "a", "Ljava/lang/String;", "getWorkerClassName", "()Ljava/lang/String;", "b", "Landroidx/work/WorkerParameters;", "getWorkerParameters", "()Landroidx/work/WorkerParameters;", "c", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class U {

    /* renamed from: a  reason: collision with root package name */
    private final String f45104a;

    /* renamed from: b  reason: collision with root package name */
    private final WorkerParameters f45105b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f45106c;

    public U(String str, WorkerParameters workerParameters, Throwable th2) {
        C17542s.j(str, "workerClassName");
        C17542s.j(workerParameters, "workerParameters");
        C17542s.j(th2, "throwable");
        this.f45104a = str;
        this.f45105b = workerParameters;
        this.f45106c = th2;
    }
}
