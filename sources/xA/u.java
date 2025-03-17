package xa;

import java.util.concurrent.ExecutionException;

final class u<T> implements t<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f57784a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final int f57785b;

    /* renamed from: c  reason: collision with root package name */
    private final P f57786c;

    /* renamed from: d  reason: collision with root package name */
    private int f57787d;

    /* renamed from: e  reason: collision with root package name */
    private int f57788e;

    /* renamed from: f  reason: collision with root package name */
    private int f57789f;

    /* renamed from: g  reason: collision with root package name */
    private Exception f57790g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f57791h;

    public u(int i10, P p10) {
        this.f57785b = i10;
        this.f57786c = p10;
    }

    private final void b() {
        if (this.f57787d + this.f57788e + this.f57789f != this.f57785b) {
            return;
        }
        if (this.f57790g != null) {
            P p10 = this.f57786c;
            int i10 = this.f57788e;
            int i11 = this.f57785b;
            p10.t(new ExecutionException(i10 + " out of " + i11 + " underlying tasks failed", this.f57790g));
        } else if (this.f57791h) {
            this.f57786c.v();
        } else {
            this.f57786c.u((Object) null);
        }
    }

    public final void a(T t10) {
        synchronized (this.f57784a) {
            this.f57787d++;
            b();
        }
    }

    public final void c(Exception exc) {
        synchronized (this.f57784a) {
            this.f57788e++;
            this.f57790g = exc;
            b();
        }
    }

    public final void onCanceled() {
        synchronized (this.f57784a) {
            this.f57789f++;
            this.f57791h = true;
            b();
        }
    }
}
