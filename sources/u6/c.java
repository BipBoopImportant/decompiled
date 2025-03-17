package U6;

import QJ.C16336v0;
import QJ.C16340x0;
import QJ.M;
import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LU6/c;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "LXH/N;", "close", "", "a", "Z", "closed", "LQJ/v0;", "b", "LQJ/v0;", "_dispatcher", "LQJ/M;", "c", "()LQJ/M;", "coroutineDispatcher", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private boolean f40260a;

    /* renamed from: b  reason: collision with root package name */
    private final C16336v0 f40261b;

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C17542s.i(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f40261b = C16340x0.c(newSingleThreadExecutor);
    }

    public final M c() {
        return this.f40261b;
    }

    public void close() {
        if (!this.f40260a) {
            this.f40261b.close();
            this.f40260a = true;
        }
    }
}
