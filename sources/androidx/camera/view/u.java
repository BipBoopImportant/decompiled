package androidx.camera.view;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    final Object f17223a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final OrientationEventListener f17224b;

    /* renamed from: c  reason: collision with root package name */
    final Map<b, c> f17225c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    boolean f17226d = false;

    class a extends OrientationEventListener {

        /* renamed from: a  reason: collision with root package name */
        private int f17227a = -1;

        a(Context context) {
            super(context);
        }

        public void onOrientationChanged(int i10) {
            int b10;
            ArrayList<c> arrayList;
            if (i10 != -1 && this.f17227a != (b10 = u.b(i10))) {
                this.f17227a = b10;
                synchronized (u.this.f17223a) {
                    arrayList = new ArrayList<>(u.this.f17225c.values());
                }
                if (!arrayList.isEmpty()) {
                    for (c d10 : arrayList) {
                        d10.d(b10);
                    }
                }
            }
        }
    }

    public interface b {
        void a(int i10);
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private final b f17229a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f17230b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f17231c = new AtomicBoolean(true);

        c(b bVar, Executor executor) {
            this.f17229a = bVar;
            this.f17230b = executor;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(int i10) {
            if (this.f17231c.get()) {
                this.f17229a.a(i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f17231c.set(false);
        }

        /* access modifiers changed from: package-private */
        public void d(int i10) {
            this.f17230b.execute(new v(this, i10));
        }
    }

    public u(Context context) {
        this.f17224b = new a(context);
    }

    static int b(int i10) {
        if (i10 >= 315 || i10 < 45) {
            return 0;
        }
        if (i10 >= 225) {
            return 1;
        }
        return i10 >= 135 ? 2 : 3;
    }

    public boolean a(Executor executor, b bVar) {
        synchronized (this.f17223a) {
            try {
                if (!this.f17224b.canDetectOrientation() && !this.f17226d) {
                    return false;
                }
                this.f17225c.put(bVar, new c(bVar, executor));
                this.f17224b.enable();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.f17223a) {
            try {
                c cVar = this.f17225c.get(bVar);
                if (cVar != null) {
                    cVar.b();
                    this.f17225c.remove(bVar);
                }
                if (this.f17225c.isEmpty()) {
                    this.f17224b.disable();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
