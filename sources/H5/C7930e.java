package h5;

import H2.a;
import XH.C16807N;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import f5.k;
import g5.C7872a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lh5/e;", "Lg5/a;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;)V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "executor", "LH2/a;", "Lf5/k;", "callback", "LXH/N;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;LH2/a;)V", "a", "(LH2/a;)V", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "", "Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "c", "Ljava/util/Map;", "contextToListeners", "d", "listenerToContext", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: h5.e  reason: case insensitive filesystem */
public final class C7930e implements C7872a {

    /* renamed from: a  reason: collision with root package name */
    private final WindowLayoutComponent f51645a;

    /* renamed from: b  reason: collision with root package name */
    private final ReentrantLock f51646b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Context, MulticastConsumer> f51647c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<a<k>, Context> f51648d = new LinkedHashMap();

    public C7930e(WindowLayoutComponent windowLayoutComponent) {
        C17542s.j(windowLayoutComponent, "component");
        this.f51645a = windowLayoutComponent;
    }

    public void a(a<k> aVar) {
        C17542s.j(aVar, "callback");
        ReentrantLock reentrantLock = this.f51646b;
        reentrantLock.lock();
        try {
            Context context = this.f51648d.get(aVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = this.f51647c.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            multicastConsumer.c(aVar);
            this.f51648d.remove(aVar);
            if (multicastConsumer.b()) {
                this.f51647c.remove(context);
                this.f51645a.removeWindowLayoutInfoListener(multicastConsumer);
            }
            C16807N n10 = C16807N.f139792a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void b(Context context, Executor executor, a<k> aVar) {
        C16807N n10;
        C17542s.j(context, "context");
        C17542s.j(executor, "executor");
        C17542s.j(aVar, "callback");
        ReentrantLock reentrantLock = this.f51646b;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.f51647c.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(aVar);
                this.f51648d.put(aVar, context);
                n10 = C16807N.f139792a;
            } else {
                n10 = null;
            }
            if (n10 == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.f51647c.put(context, multicastConsumer2);
                this.f51648d.put(aVar, context);
                multicastConsumer2.a(aVar);
                this.f51645a.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
            C16807N n11 = C16807N.f139792a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
