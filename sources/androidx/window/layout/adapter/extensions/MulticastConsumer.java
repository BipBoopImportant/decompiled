package androidx.window.layout.adapter.extensions;

import H2.a;
import XH.C16807N;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import f5.k;
import h5.C7931f;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00010\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "LH2/a;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "Landroidx/window/extensions/core/util/function/Consumer;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "value", "LXH/N;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "Lf5/k;", "listener", "a", "(LH2/a;)V", "c", "", "b", "()Z", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Lf5/k;", "lastKnownValue", "", "d", "Ljava/util/Set;", "registeredListeners", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MulticastConsumer implements a<WindowLayoutInfo>, Consumer<WindowLayoutInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f45023a;

    /* renamed from: b  reason: collision with root package name */
    private final ReentrantLock f45024b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    private k f45025c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<a<k>> f45026d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        C17542s.j(context, "context");
        this.f45023a = context;
    }

    public final void a(a<k> aVar) {
        C17542s.j(aVar, "listener");
        ReentrantLock reentrantLock = this.f45024b;
        reentrantLock.lock();
        try {
            k kVar = this.f45025c;
            if (kVar != null) {
                aVar.accept(kVar);
            }
            this.f45026d.add(aVar);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean b() {
        return this.f45026d.isEmpty();
    }

    public final void c(a<k> aVar) {
        C17542s.j(aVar, "listener");
        ReentrantLock reentrantLock = this.f45024b;
        reentrantLock.lock();
        try {
            this.f45026d.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void accept(WindowLayoutInfo windowLayoutInfo) {
        C17542s.j(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f45024b;
        reentrantLock.lock();
        try {
            k b10 = C7931f.f51649a.b(this.f45023a, windowLayoutInfo);
            this.f45025c = b10;
            for (a accept : this.f45026d) {
                accept.accept(b10);
            }
            C16807N n10 = C16807N.f139792a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
