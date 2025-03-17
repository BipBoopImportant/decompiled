package f6;

import XH.C16807N;
import f6.C7853d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0018\u0010 \u001a\u00060\u001dj\u0002`\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\u0015\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010!¨\u0006\""}, d2 = {"Lf6/f;", "Lf6/d;", "Lf6/i;", "strongMemoryCache", "Lf6/j;", "weakMemoryCache", "<init>", "(Lf6/i;Lf6/j;)V", "Lf6/d$b;", "key", "Lf6/d$c;", "b", "(Lf6/d$b;)Lf6/d$c;", "value", "LXH/N;", "d", "(Lf6/d$b;Lf6/d$c;)V", "", "e", "(Lf6/d$b;)Z", "", "size", "c", "(J)V", "clear", "()V", "a", "Lf6/i;", "Lf6/j;", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "Ljava/lang/Object;", "lock", "()J", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: f6.f  reason: case insensitive filesystem */
public final class C7855f implements C7853d {

    /* renamed from: a  reason: collision with root package name */
    private final i f51188a;

    /* renamed from: b  reason: collision with root package name */
    private final j f51189b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f51190c = new Object();

    public C7855f(i iVar, j jVar) {
        this.f51188a = iVar;
        this.f51189b = jVar;
    }

    public long a() {
        long a10;
        synchronized (this.f51190c) {
            a10 = this.f51188a.a();
        }
        return a10;
    }

    public C7853d.c b(C7853d.b bVar) {
        C7853d.c b10;
        synchronized (this.f51190c) {
            try {
                b10 = this.f51188a.b(bVar);
                if (b10 == null) {
                    b10 = this.f51189b.b(bVar);
                }
                if (b10 != null && !b10.b().b()) {
                    e(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b10;
    }

    public void c(long j10) {
        synchronized (this.f51190c) {
            this.f51188a.c(j10);
            C16807N n10 = C16807N.f139792a;
        }
    }

    public void clear() {
        synchronized (this.f51190c) {
            this.f51188a.clear();
            this.f51189b.clear();
            C16807N n10 = C16807N.f139792a;
        }
    }

    public void d(C7853d.b bVar, C7853d.c cVar) {
        synchronized (this.f51190c) {
            long a10 = cVar.b().a();
            if (a10 >= 0) {
                this.f51188a.e(bVar, cVar.b(), cVar.a(), a10);
                C16807N n10 = C16807N.f139792a;
            } else {
                throw new IllegalStateException(("Image size must be non-negative: " + a10).toString());
            }
        }
    }

    public boolean e(C7853d.b bVar) {
        boolean z10;
        synchronized (this.f51190c) {
            z10 = this.f51188a.d(bVar) || this.f51189b.d(bVar);
        }
        return z10;
    }
}
