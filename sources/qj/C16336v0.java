package QJ;

import dI.C17161b;
import dI.C17168i;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \r2\u00020\u00012\u00020\u00022\u00060\u0003j\u0002`\u0004:\u0001\u000eB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"LQJ/v0;", "LQJ/M;", "Ljava/io/Closeable;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "LXH/N;", "close", "Ljava/util/concurrent/Executor;", "P0", "()Ljava/util/concurrent/Executor;", "executor", "b", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.v0  reason: case insensitive filesystem */
public abstract class C16336v0 extends M implements Closeable, AutoCloseable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f137685b = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LQJ/v0$a;", "LdI/b;", "LQJ/M;", "LQJ/v0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QJ.v0$a */
    public static final class a extends C17161b<M, C16336v0> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final C16336v0 d(C17168i.b bVar) {
            if (bVar instanceof C16336v0) {
                return (C16336v0) bVar;
            }
            return null;
        }

        private a() {
            super(M.f137585a, new C16334u0());
        }
    }

    public abstract Executor P0();

    public abstract void close();
}
