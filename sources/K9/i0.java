package K9;

import android.util.Log;

public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    private Object f37874a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f37875b = false;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C6604c f37876c;

    public i0(C6604c cVar, Object obj) {
        this.f37876c = cVar;
        this.f37874a = obj;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Object obj);

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f37874a;
                if (this.f37875b) {
                    String obj2 = toString();
                    Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f37875b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f37874a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f37876c.f37810r) {
            this.f37876c.f37810r.remove(this);
        }
    }
}
