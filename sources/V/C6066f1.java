package v;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: v.f1  reason: case insensitive filesystem */
class C6066f1 {

    /* renamed from: a  reason: collision with root package name */
    final Executor f30545a;

    /* renamed from: b  reason: collision with root package name */
    final Object f30546b = new Object();

    /* renamed from: c  reason: collision with root package name */
    final Set<P1> f30547c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    final Set<P1> f30548d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    final Set<P1> f30549e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    private final CameraDevice.StateCallback f30550f = new a();

    /* renamed from: v.f1$a */
    class a extends CameraDevice.StateCallback {
        a() {
        }

        private void c() {
            List<P1> f10;
            synchronized (C6066f1.this.f30546b) {
                f10 = C6066f1.this.f();
                C6066f1.this.f30549e.clear();
                C6066f1.this.f30547c.clear();
                C6066f1.this.f30548d.clear();
            }
            for (P1 d10 : f10) {
                d10.d();
            }
        }

        private void d(int i10) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C6066f1.this.f30546b) {
                linkedHashSet.addAll(C6066f1.this.f30549e);
                linkedHashSet.addAll(C6066f1.this.f30547c);
            }
            C6066f1.this.f30545a.execute(new C6063e1(linkedHashSet, i10));
        }

        private void e() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C6066f1.this.f30546b) {
                linkedHashSet.addAll(C6066f1.this.f30549e);
                linkedHashSet.addAll(C6066f1.this.f30547c);
            }
            C6066f1.this.f30545a.execute(new C6060d1(linkedHashSet));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void f(LinkedHashSet linkedHashSet, int i10) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((P1) it.next()).f(i10);
            }
        }

        public void onClosed(CameraDevice cameraDevice) {
            e();
            c();
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            e();
            c();
        }

        public void onError(CameraDevice cameraDevice, int i10) {
            e();
            d(i10);
            c();
        }

        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    C6066f1(Executor executor) {
        this.f30545a = executor;
    }

    private void a(P1 p12) {
        P1 next;
        Iterator<P1> it = f().iterator();
        while (it.hasNext() && (next = it.next()) != p12) {
            next.d();
        }
    }

    /* access modifiers changed from: package-private */
    public static void b(Set<P1> set) {
        for (P1 next : set) {
            next.c().q(next);
        }
    }

    /* access modifiers changed from: package-private */
    public CameraDevice.StateCallback c() {
        return this.f30550f;
    }

    /* access modifiers changed from: package-private */
    public List<P1> d() {
        ArrayList arrayList;
        synchronized (this.f30546b) {
            arrayList = new ArrayList(this.f30547c);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List<P1> e() {
        ArrayList arrayList;
        synchronized (this.f30546b) {
            arrayList = new ArrayList(this.f30549e);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List<P1> f() {
        ArrayList arrayList;
        synchronized (this.f30546b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(e());
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void g(P1 p12) {
        synchronized (this.f30546b) {
            this.f30547c.remove(p12);
            this.f30548d.remove(p12);
        }
    }

    /* access modifiers changed from: package-private */
    public void h(P1 p12) {
        synchronized (this.f30546b) {
            this.f30548d.add(p12);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(P1 p12) {
        a(p12);
        synchronized (this.f30546b) {
            this.f30549e.remove(p12);
        }
    }

    /* access modifiers changed from: package-private */
    public void j(P1 p12) {
        synchronized (this.f30546b) {
            this.f30547c.add(p12);
            this.f30549e.remove(p12);
        }
        a(p12);
    }

    /* access modifiers changed from: package-private */
    public void k(P1 p12) {
        synchronized (this.f30546b) {
            this.f30549e.add(p12);
        }
    }
}
