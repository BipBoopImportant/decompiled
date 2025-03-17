package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/c0;", "", "Landroidx/lifecycle/y;", "provider", "<init>", "(Landroidx/lifecycle/y;)V", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "f", "(Landroidx/lifecycle/r$a;)V", "c", "()V", "b", "e", "d", "Landroidx/lifecycle/A;", "a", "Landroidx/lifecycle/A;", "registry", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/c0$a;", "Landroidx/lifecycle/c0$a;", "lastDispatchRunnable", "Landroidx/lifecycle/r;", "()Landroidx/lifecycle/r;", "lifecycle", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final A f22252a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f22253b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private a f22254c;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/c0$a;", "Ljava/lang/Runnable;", "Landroidx/lifecycle/A;", "registry", "Landroidx/lifecycle/r$a;", "event", "<init>", "(Landroidx/lifecycle/A;Landroidx/lifecycle/r$a;)V", "LXH/N;", "run", "()V", "a", "Landroidx/lifecycle/A;", "b", "Landroidx/lifecycle/r$a;", "getEvent", "()Landroidx/lifecycle/r$a;", "", "c", "Z", "wasExecuted", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final A f22255a;

        /* renamed from: b  reason: collision with root package name */
        private final r.a f22256b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f22257c;

        public a(A a10, r.a aVar) {
            C17542s.j(a10, "registry");
            C17542s.j(aVar, "event");
            this.f22255a = a10;
            this.f22256b = aVar;
        }

        public void run() {
            if (!this.f22257c) {
                this.f22255a.l(this.f22256b);
                this.f22257c = true;
            }
        }
    }

    public c0(C5221y yVar) {
        C17542s.j(yVar, "provider");
        this.f22252a = new A(yVar);
    }

    private final void f(r.a aVar) {
        a aVar2 = this.f22254c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f22252a, aVar);
        this.f22254c = aVar3;
        Handler handler = this.f22253b;
        C17542s.g(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public r a() {
        return this.f22252a;
    }

    public void b() {
        f(r.a.ON_START);
    }

    public void c() {
        f(r.a.ON_CREATE);
    }

    public void d() {
        f(r.a.ON_STOP);
        f(r.a.ON_DESTROY);
    }

    public void e() {
        f(r.a.ON_START);
    }
}
