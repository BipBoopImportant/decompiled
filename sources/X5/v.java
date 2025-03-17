package X5;

import WK.C16762E;
import WK.C16772g;
import WK.C16777l;
import WK.y;
import X5.s;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import r6.E;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u00060\u001bj\u0002`\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"LX5/v;", "LX5/s;", "LWK/g;", "source", "LWK/l;", "fileSystem", "LX5/s$a;", "metadata", "<init>", "(LWK/g;LWK/l;LX5/s$a;)V", "LXH/N;", "c", "()V", "k3", "()LWK/g;", "LWK/E;", "S2", "()LWK/E;", "close", "a", "LWK/l;", "r", "()LWK/l;", "b", "LX5/s$a;", "j", "()LX5/s$a;", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "Ljava/lang/Object;", "lock", "", "d", "Z", "isClosed", "e", "LWK/g;", "f", "LWK/E;", "file", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements s {

    /* renamed from: a  reason: collision with root package name */
    private final C16777l f40699a;

    /* renamed from: b  reason: collision with root package name */
    private final s.a f40700b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f40701c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f40702d;

    /* renamed from: e  reason: collision with root package name */
    private C16772g f40703e;

    /* renamed from: f  reason: collision with root package name */
    private C16762E f40704f;

    public v(C16772g gVar, C16777l lVar, s.a aVar) {
        this.f40699a = lVar;
        this.f40700b = aVar;
        this.f40703e = gVar;
    }

    private final void c() {
        if (this.f40702d) {
            throw new IllegalStateException("closed");
        }
    }

    public C16762E S2() {
        C16762E e10;
        synchronized (this.f40701c) {
            c();
            e10 = this.f40704f;
        }
        return e10;
    }

    public void close() {
        synchronized (this.f40701c) {
            try {
                this.f40702d = true;
                C16772g gVar = this.f40703e;
                if (gVar != null) {
                    E.h(gVar);
                }
                C16762E e10 = this.f40704f;
                if (e10 != null) {
                    r().l(e10);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public s.a j() {
        return this.f40700b;
    }

    public C16772g k3() {
        synchronized (this.f40701c) {
            c();
            C16772g gVar = this.f40703e;
            if (gVar != null) {
                return gVar;
            }
            C16777l r10 = r();
            C16762E e10 = this.f40704f;
            C17542s.g(e10);
            C16772g d10 = y.d(r10.B(e10));
            this.f40703e = d10;
            return d10;
        }
    }

    public C16777l r() {
        return this.f40699a;
    }
}
