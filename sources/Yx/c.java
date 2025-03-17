package Yx;

import aA.C13909a;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, d2 = {"LYx/c;", "Lgp/b;", "LZx/c;", "pushNotificationRepository", "LaA/a;", "sessionManager", "<init>", "(LZx/c;LaA/a;)V", "LXH/N;", "c", "()V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LZx/c;", "LaA/a;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final Zx.c f118161a;

    /* renamed from: b  reason: collision with root package name */
    private final C13909a f118162b;

    /* renamed from: c  reason: collision with root package name */
    private final C11346e f118163c = C11346e.PUSH_NOTIFICATION_STARTUP_REGISTER;

    public c(Zx.c cVar, C13909a aVar) {
        C17542s.j(cVar, "pushNotificationRepository");
        C17542s.j(aVar, "sessionManager");
        this.f118161a = cVar;
        this.f118162b = aVar;
    }

    private final void c() {
        if (this.f118162b.isLoggedIn() && this.f118161a.g()) {
            this.f118161a.c();
        }
    }

    public C11346e a() {
        return this.f118163c;
    }

    public Object b(Object obj, C17164e<? super Boolean> eVar) {
        c();
        return b.a(true);
    }
}
