package QJ;

import WJ.C16735D;
import WJ.N;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0011"}, d2 = {"LQJ/e1;", "", "<init>", "()V", "LQJ/o0;", "a", "()LQJ/o0;", "LXH/N;", "c", "eventLoop", "d", "(LQJ/o0;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public static final e1 f137624a = new e1();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<C16323o0> f137625b = N.a(new C16735D("ThreadLocalEventLoop"));

    private e1() {
    }

    public final C16323o0 a() {
        return f137625b.get();
    }

    public final C16323o0 b() {
        ThreadLocal<C16323o0> threadLocal = f137625b;
        C16323o0 o0Var = threadLocal.get();
        if (o0Var != null) {
            return o0Var;
        }
        C16323o0 a10 = C16328r0.a();
        threadLocal.set(a10);
        return a10;
    }

    public final void c() {
        f137625b.set((Object) null);
    }

    public final void d(C16323o0 o0Var) {
        f137625b.set(o0Var);
    }
}
