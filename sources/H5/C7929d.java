package h5;

import XH.C16807N;
import YH.C16877v;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import d5.d;
import f5.k;
import g5.C7872a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020!0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001d¨\u0006$"}, d2 = {"Lh5/d;", "Lg5/a;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "Ld5/d;", "consumerAdapter", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;Ld5/d;)V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "executor", "LH2/a;", "Lf5/k;", "callback", "LXH/N;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;LH2/a;)V", "a", "(LH2/a;)V", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "Ld5/d;", "Ljava/util/concurrent/locks/ReentrantLock;", "c", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "", "Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "d", "Ljava/util/Map;", "contextToListeners", "e", "listenerToContext", "Ld5/d$b;", "f", "consumerToToken", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: h5.d  reason: case insensitive filesystem */
public final class C7929d implements C7872a {

    /* renamed from: a  reason: collision with root package name */
    private final WindowLayoutComponent f51639a;

    /* renamed from: b  reason: collision with root package name */
    private final d f51640b;

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantLock f51641c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Context, MulticastConsumer> f51642d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<H2.a<k>, Context> f51643e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map<MulticastConsumer, d.b> f51644f = new LinkedHashMap();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h5.d$a */
    /* synthetic */ class a extends C17540p implements C17642l<WindowLayoutInfo, C16807N> {
        a(Object obj) {
            super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((WindowLayoutInfo) obj);
            return C16807N.f139792a;
        }

        public final void t(WindowLayoutInfo windowLayoutInfo) {
            C17542s.j(windowLayoutInfo, "p0");
            ((MulticastConsumer) this.receiver).accept(windowLayoutInfo);
        }
    }

    public C7929d(WindowLayoutComponent windowLayoutComponent, d dVar) {
        C17542s.j(windowLayoutComponent, "component");
        C17542s.j(dVar, "consumerAdapter");
        this.f51639a = windowLayoutComponent;
        this.f51640b = dVar;
    }

    public void a(H2.a<k> aVar) {
        C17542s.j(aVar, "callback");
        ReentrantLock reentrantLock = this.f51641c;
        reentrantLock.lock();
        try {
            Context context = this.f51643e.get(aVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = this.f51642d.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            multicastConsumer.c(aVar);
            this.f51643e.remove(aVar);
            if (multicastConsumer.b()) {
                this.f51642d.remove(context);
                d.b remove = this.f51644f.remove(multicastConsumer);
                if (remove != null) {
                    remove.b();
                }
            }
            C16807N n10 = C16807N.f139792a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void b(Context context, Executor executor, H2.a<k> aVar) {
        C16807N n10;
        C17542s.j(context, "context");
        C17542s.j(executor, "executor");
        C17542s.j(aVar, "callback");
        ReentrantLock reentrantLock = this.f51641c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.f51642d.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(aVar);
                this.f51643e.put(aVar, context);
                n10 = C16807N.f139792a;
            } else {
                n10 = null;
            }
            if (n10 == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.f51642d.put(context, multicastConsumer2);
                this.f51643e.put(aVar, context);
                multicastConsumer2.a(aVar);
                if (context instanceof Activity) {
                    this.f51644f.put(multicastConsumer2, this.f51640b.c(this.f51639a, P.b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity) context, new a(multicastConsumer2)));
                } else {
                    multicastConsumer2.accept(new WindowLayoutInfo(C16877v.n()));
                    reentrantLock.unlock();
                    return;
                }
            }
            C16807N n11 = C16807N.f139792a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
