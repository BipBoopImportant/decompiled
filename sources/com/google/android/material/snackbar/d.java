package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class d {

    /* renamed from: e  reason: collision with root package name */
    private static d f67222e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f67223a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f67224b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private c f67225c;

    /* renamed from: d  reason: collision with root package name */
    private c f67226d;

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            d.this.d((c) message.obj);
            return true;
        }
    }

    interface b {
        void a();

        void b(int i10);
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<b> f67228a;

        /* renamed from: b  reason: collision with root package name */
        int f67229b;

        /* renamed from: c  reason: collision with root package name */
        boolean f67230c;

        c(int i10, b bVar) {
            this.f67228a = new WeakReference<>(bVar);
            this.f67229b = i10;
        }

        /* access modifiers changed from: package-private */
        public boolean a(b bVar) {
            return bVar != null && this.f67228a.get() == bVar;
        }
    }

    private d() {
    }

    private boolean a(c cVar, int i10) {
        b bVar = cVar.f67228a.get();
        if (bVar == null) {
            return false;
        }
        this.f67224b.removeCallbacksAndMessages(cVar);
        bVar.b(i10);
        return true;
    }

    static d c() {
        if (f67222e == null) {
            f67222e = new d();
        }
        return f67222e;
    }

    private boolean f(b bVar) {
        c cVar = this.f67225c;
        return cVar != null && cVar.a(bVar);
    }

    private boolean g(b bVar) {
        c cVar = this.f67226d;
        return cVar != null && cVar.a(bVar);
    }

    private void l(c cVar) {
        int i10 = cVar.f67229b;
        if (i10 != -2) {
            if (i10 <= 0) {
                i10 = i10 == -1 ? 1500 : 2750;
            }
            this.f67224b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f67224b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i10);
        }
    }

    private void n() {
        c cVar = this.f67226d;
        if (cVar != null) {
            this.f67225c = cVar;
            this.f67226d = null;
            b bVar = cVar.f67228a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.f67225c = null;
            }
        }
    }

    public void b(b bVar, int i10) {
        synchronized (this.f67223a) {
            try {
                if (f(bVar)) {
                    a(this.f67225c, i10);
                } else if (g(bVar)) {
                    a(this.f67226d, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(c cVar) {
        synchronized (this.f67223a) {
            try {
                if (this.f67225c != cVar) {
                    if (this.f67226d == cVar) {
                    }
                }
                a(cVar, 2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z10;
        synchronized (this.f67223a) {
            try {
                if (!f(bVar)) {
                    if (!g(bVar)) {
                        z10 = false;
                    }
                }
                z10 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void h(b bVar) {
        synchronized (this.f67223a) {
            try {
                if (f(bVar)) {
                    this.f67225c = null;
                    if (this.f67226d != null) {
                        n();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f67223a) {
            try {
                if (f(bVar)) {
                    l(this.f67225c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f67223a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f67225c;
                    if (!cVar.f67230c) {
                        cVar.f67230c = true;
                        this.f67224b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f67223a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f67225c;
                    if (cVar.f67230c) {
                        cVar.f67230c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(int i10, b bVar) {
        synchronized (this.f67223a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f67225c;
                    cVar.f67229b = i10;
                    this.f67224b.removeCallbacksAndMessages(cVar);
                    l(this.f67225c);
                    return;
                }
                if (g(bVar)) {
                    this.f67226d.f67229b = i10;
                } else {
                    this.f67226d = new c(i10, bVar);
                }
                c cVar2 = this.f67225c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f67225c = null;
                    n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
