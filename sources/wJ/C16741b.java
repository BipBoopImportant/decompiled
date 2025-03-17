package WJ;

import WJ.C16741b;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00018\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00028\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0019\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0013\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00028\u0002X\u0004R\u0013\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00028\u0002X\u0004¨\u0006!"}, d2 = {"LWJ/b;", "N", "", "prev", "<init>", "(LWJ/b;)V", "value", "", "o", "(LWJ/b;)Z", "LXH/N;", "c", "()V", "m", "()Z", "n", "g", "()Ljava/lang/Object;", "nextOrClosed", "d", "()LWJ/b;", "aliveSegmentLeft", "e", "aliveSegmentRight", "f", "next", "l", "isTail", "h", "k", "isRemoved", "_next", "_prev", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WJ.b  reason: case insensitive filesystem */
public abstract class C16741b<N extends C16741b<N>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f139545a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f139546b;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Class<C16741b> cls = C16741b.class;
        Class<Object> cls2 = Object.class;
        f139545a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        f139546b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
    }

    public C16741b(N n10) {
        this._prev$volatile = n10;
    }

    private final N d() {
        N h10 = h();
        while (h10 != null && h10.k()) {
            h10 = (C16741b) f139546b.get(h10);
        }
        return h10;
    }

    private final N e() {
        N f10;
        N f11 = f();
        C17542s.g(f11);
        while (f11.k() && (f10 = f11.f()) != null) {
            f11 = f10;
        }
        return f11;
    }

    /* access modifiers changed from: private */
    public final Object g() {
        return f139545a.get(this);
    }

    public final void c() {
        f139546b.set(this, (Object) null);
    }

    public final N f() {
        N a10 = g();
        if (a10 == C16740a.f139544a) {
            return null;
        }
        return (C16741b) a10;
    }

    public final N h() {
        return (C16741b) f139546b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return b.a(f139545a, this, (Object) null, C16740a.f139544a);
    }

    public final void n() {
        Object obj;
        if (!l()) {
            while (true) {
                C16741b d10 = d();
                C16741b e10 = e();
                AtomicReferenceFieldUpdater j10 = f139546b;
                do {
                    obj = j10.get(e10);
                } while (!b.a(j10, e10, obj, ((C16741b) obj) == null ? null : d10));
                if (d10 != null) {
                    f139545a.set(d10, e10);
                }
                if ((!e10.k() || e10.l()) && (d10 == null || !d10.k())) {
                    return;
                }
            }
        }
    }

    public final boolean o(N n10) {
        return b.a(f139545a, this, (Object) null, n10);
    }
}
