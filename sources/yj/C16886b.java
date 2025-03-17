package YJ;

import QJ.C16336v0;
import QJ.M;
import WJ.C16736E;
import dI.C17168i;
import dI.C17169j;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LYJ/b;", "LQJ/v0;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "LXH/N;", "execute", "(Ljava/lang/Runnable;)V", "", "parallelism", "", "name", "LQJ/M;", "N0", "(ILjava/lang/String;)LQJ/M;", "LdI/i;", "context", "Lkotlinx/coroutines/Runnable;", "block", "E0", "(LdI/i;Ljava/lang/Runnable;)V", "F0", "close", "toString", "()Ljava/lang/String;", "d", "LQJ/M;", "default", "P0", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YJ.b  reason: case insensitive filesystem */
public final class C16886b extends C16336v0 implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static final C16886b f140510c = new C16886b();

    /* renamed from: d  reason: collision with root package name */
    private static final M f140511d = M.O0(k.f140528b, C16738G.e("kotlinx.coroutines.io.parallelism", C17978n.e(64, C16736E.a()), 0, 0, 12, (Object) null), (String) null, 2, (Object) null);

    private C16886b() {
    }

    public void E0(C17168i iVar, Runnable runnable) {
        f140511d.E0(iVar, runnable);
    }

    public void F0(C17168i iVar, Runnable runnable) {
        f140511d.F0(iVar, runnable);
    }

    public M N0(int i10, String str) {
        return k.f140528b.N0(i10, str);
    }

    public Executor P0() {
        return this;
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    public void execute(Runnable runnable) {
        E0(C17169j.f142968a, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
