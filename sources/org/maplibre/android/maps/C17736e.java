package org.maplibre.android.maps;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.maps.o;

/* renamed from: org.maplibre.android.maps.e  reason: case insensitive filesystem */
class C17736e implements o.f, o.e, o.d, o.c {

    /* renamed from: a  reason: collision with root package name */
    private final a f145837a = new a(this);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f145838b = true;

    /* renamed from: c  reason: collision with root package name */
    private int f145839c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArrayList<o.f> f145840d = new CopyOnWriteArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final CopyOnWriteArrayList<o.d> f145841e = new CopyOnWriteArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private final CopyOnWriteArrayList<o.e> f145842f = new CopyOnWriteArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final CopyOnWriteArrayList<o.c> f145843g = new CopyOnWriteArrayList<>();

    /* renamed from: org.maplibre.android.maps.e$a */
    private static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<C17736e> f145844a;

        a(C17736e eVar) {
            this.f145844a = new WeakReference<>(eVar);
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            C17736e eVar = this.f145844a.get();
            if (eVar != null) {
                if (i10 == 0) {
                    boolean z10 = !eVar.f145838b && (hasMessages(3) || hasMessages(2));
                    removeMessages(3);
                    removeMessages(2);
                    if (z10) {
                        return;
                    }
                }
                Message message = new Message();
                message.what = i10;
                sendMessage(message);
            }
        }

        public void handleMessage(Message message) {
            C17736e eVar = this.f145844a.get();
            if (eVar != null) {
                int i10 = message.what;
                if (i10 == 0) {
                    eVar.o();
                } else if (i10 == 1) {
                    eVar.m();
                } else if (i10 == 2) {
                    eVar.n();
                } else if (i10 == 3) {
                    eVar.l();
                }
            }
        }
    }

    C17736e() {
    }

    /* access modifiers changed from: private */
    public void l() {
        if (!this.f145838b) {
            this.f145838b = true;
            if (!this.f145843g.isEmpty()) {
                Iterator<o.c> it = this.f145843g.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void m() {
        if (!this.f145842f.isEmpty() && !this.f145838b) {
            Iterator<o.e> it = this.f145842f.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    /* access modifiers changed from: private */
    public void n() {
        if (!this.f145841e.isEmpty() && !this.f145838b) {
            Iterator<o.d> it = this.f145841e.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* access modifiers changed from: private */
    public void o() {
        if (this.f145838b) {
            this.f145838b = false;
            if (!this.f145840d.isEmpty()) {
                Iterator<o.f> it = this.f145840d.iterator();
                while (it.hasNext()) {
                    it.next().d(this.f145839c);
                }
            }
        }
    }

    public void a() {
        this.f145837a.a(1);
    }

    public void b() {
        this.f145837a.a(2);
    }

    public void c() {
        this.f145837a.a(3);
    }

    public void d(int i10) {
        this.f145839c = i10;
        this.f145837a.a(0);
    }

    /* access modifiers changed from: package-private */
    public void j(o.c cVar) {
        this.f145843g.add(cVar);
    }

    /* access modifiers changed from: package-private */
    public void k(o.e eVar) {
        this.f145842f.add(eVar);
    }
}
