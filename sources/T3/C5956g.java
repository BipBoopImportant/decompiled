package t3;

/* renamed from: t3.g  reason: case insensitive filesystem */
public class C5956g {

    /* renamed from: a  reason: collision with root package name */
    private final C5953d f29491a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f29492b;

    public C5956g() {
        this(C5953d.f29483a);
    }

    public synchronized void a() {
        while (!this.f29492b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f29492b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f29492b;
        this.f29492b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f29492b;
    }

    public synchronized boolean e() {
        if (this.f29492b) {
            return false;
        }
        this.f29492b = true;
        notifyAll();
        return true;
    }

    public C5956g(C5953d dVar) {
        this.f29491a = dVar;
    }
}
