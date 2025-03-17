package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

class i {

    /* renamed from: a  reason: collision with root package name */
    final b f122555a;

    /* renamed from: b  reason: collision with root package name */
    final Context f122556b;

    /* renamed from: c  reason: collision with root package name */
    final ExecutorService f122557c;

    /* renamed from: d  reason: collision with root package name */
    final j f122558d;

    /* renamed from: e  reason: collision with root package name */
    final Map<String, C14192c> f122559e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    final Map<Object, C14190a> f122560f = new WeakHashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<Object, C14190a> f122561g = new WeakHashMap();

    /* renamed from: h  reason: collision with root package name */
    final Set<Object> f122562h = new LinkedHashSet();

    /* renamed from: i  reason: collision with root package name */
    final Handler f122563i;

    /* renamed from: j  reason: collision with root package name */
    final Handler f122564j;

    /* renamed from: k  reason: collision with root package name */
    final C14193d f122565k;

    /* renamed from: l  reason: collision with root package name */
    final A f122566l;

    /* renamed from: m  reason: collision with root package name */
    final List<C14192c> f122567m;

    /* renamed from: n  reason: collision with root package name */
    final c f122568n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f122569o;

    /* renamed from: p  reason: collision with root package name */
    boolean f122570p;

    private static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final i f122571a;

        /* renamed from: com.squareup.picasso.i$a$a  reason: collision with other inner class name */
        class C3022a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Message f122572a;

            C3022a(Message message) {
                this.f122572a = message;
            }

            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f122572a.what);
            }
        }

        a(Looper looper, i iVar) {
            super(looper);
            this.f122571a = iVar;
        }

        public void handleMessage(Message message) {
            boolean z10 = false;
            switch (message.what) {
                case 1:
                    this.f122571a.v((C14190a) message.obj);
                    return;
                case 2:
                    this.f122571a.o((C14190a) message.obj);
                    return;
                case 4:
                    this.f122571a.p((C14192c) message.obj);
                    return;
                case 5:
                    this.f122571a.u((C14192c) message.obj);
                    return;
                case 6:
                    this.f122571a.q((C14192c) message.obj, false);
                    return;
                case 7:
                    this.f122571a.n();
                    return;
                case 9:
                    this.f122571a.r((NetworkInfo) message.obj);
                    return;
                case 10:
                    i iVar = this.f122571a;
                    if (message.arg1 == 1) {
                        z10 = true;
                    }
                    iVar.m(z10);
                    return;
                case 11:
                    this.f122571a.s(message.obj);
                    return;
                case 12:
                    this.f122571a.t(message.obj);
                    return;
                default:
                    t.f122595o.post(new C3022a(message));
                    return;
            }
        }
    }

    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class c extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private final i f122574a;

        c(i iVar) {
            this.f122574a = iVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f122574a.f122569o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f122574a.f122556b.registerReceiver(this, intentFilter);
        }

        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        this.f122574a.b(intent.getBooleanExtra("state", false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.f122574a.f(((ConnectivityManager) F.n(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    i(Context context, ExecutorService executorService, Handler handler, j jVar, C14193d dVar, A a10) {
        b bVar = new b();
        this.f122555a = bVar;
        bVar.start();
        F.h(bVar.getLooper());
        this.f122556b = context;
        this.f122557c = executorService;
        this.f122563i = new a(bVar.getLooper(), this);
        this.f122558d = jVar;
        this.f122564j = handler;
        this.f122565k = dVar;
        this.f122566l = a10;
        this.f122567m = new ArrayList(4);
        this.f122570p = F.p(context);
        this.f122569o = F.o(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.f122568n = cVar;
        cVar.a();
    }

    private void a(C14192c cVar) {
        if (!cVar.u()) {
            Bitmap bitmap = cVar.f122537m;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f122567m.add(cVar);
            if (!this.f122563i.hasMessages(7)) {
                this.f122563i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    private void i() {
        if (!this.f122560f.isEmpty()) {
            Iterator<C14190a> it = this.f122560f.values().iterator();
            while (it.hasNext()) {
                C14190a next = it.next();
                it.remove();
                if (next.g().f122609m) {
                    F.s("Dispatcher", "replaying", next.i().d());
                }
                w(next, false);
            }
        }
    }

    private void j(List<C14192c> list) {
        if (list != null && !list.isEmpty() && list.get(0).q().f122609m) {
            StringBuilder sb2 = new StringBuilder();
            for (C14192c next : list) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(F.j(next));
            }
            F.s("Dispatcher", "delivered", sb2.toString());
        }
    }

    private void k(C14190a aVar) {
        Object k10 = aVar.k();
        if (k10 != null) {
            aVar.f122514k = true;
            this.f122560f.put(k10, aVar);
        }
    }

    private void l(C14192c cVar) {
        C14190a h10 = cVar.h();
        if (h10 != null) {
            k(h10);
        }
        List<C14190a> i10 = cVar.i();
        if (i10 != null) {
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                k(i10.get(i11));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z10) {
        Handler handler = this.f122563i;
        handler.sendMessage(handler.obtainMessage(10, z10 ? 1 : 0, 0));
    }

    /* access modifiers changed from: package-private */
    public void c(C14190a aVar) {
        Handler handler = this.f122563i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    /* access modifiers changed from: package-private */
    public void d(C14192c cVar) {
        Handler handler = this.f122563i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    /* access modifiers changed from: package-private */
    public void e(C14192c cVar) {
        Handler handler = this.f122563i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    /* access modifiers changed from: package-private */
    public void f(NetworkInfo networkInfo) {
        Handler handler = this.f122563i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* access modifiers changed from: package-private */
    public void g(C14192c cVar) {
        Handler handler = this.f122563i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500);
    }

    /* access modifiers changed from: package-private */
    public void h(C14190a aVar) {
        Handler handler = this.f122563i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z10) {
        this.f122570p = z10;
    }

    /* access modifiers changed from: package-private */
    public void n() {
        ArrayList arrayList = new ArrayList(this.f122567m);
        this.f122567m.clear();
        Handler handler = this.f122564j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    /* access modifiers changed from: package-private */
    public void o(C14190a aVar) {
        String d10 = aVar.d();
        C14192c cVar = this.f122559e.get(d10);
        if (cVar != null) {
            cVar.f(aVar);
            if (cVar.c()) {
                this.f122559e.remove(d10);
                if (aVar.g().f122609m) {
                    F.s("Dispatcher", "canceled", aVar.i().d());
                }
            }
        }
        if (this.f122562h.contains(aVar.j())) {
            this.f122561g.remove(aVar.k());
            if (aVar.g().f122609m) {
                F.t("Dispatcher", "canceled", aVar.i().d(), "because paused request got canceled");
            }
        }
        C14190a remove = this.f122560f.remove(aVar.k());
        if (remove != null && remove.g().f122609m) {
            F.t("Dispatcher", "canceled", remove.i().d(), "from replaying");
        }
    }

    /* access modifiers changed from: package-private */
    public void p(C14192c cVar) {
        if (p.b(cVar.p())) {
            this.f122565k.b(cVar.n(), cVar.s());
        }
        this.f122559e.remove(cVar.n());
        a(cVar);
        if (cVar.q().f122609m) {
            F.t("Dispatcher", "batched", F.j(cVar), "for completion");
        }
    }

    /* access modifiers changed from: package-private */
    public void q(C14192c cVar, boolean z10) {
        if (cVar.q().f122609m) {
            String j10 = F.j(cVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("for error");
            sb2.append(z10 ? " (will replay)" : "");
            F.t("Dispatcher", "batched", j10, sb2.toString());
        }
        this.f122559e.remove(cVar.n());
        a(cVar);
    }

    /* access modifiers changed from: package-private */
    public void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f122557c;
        if (executorService instanceof v) {
            ((v) executorService).a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            i();
        }
    }

    /* access modifiers changed from: package-private */
    public void s(Object obj) {
        if (this.f122562h.add(obj)) {
            Iterator<C14192c> it = this.f122559e.values().iterator();
            while (it.hasNext()) {
                C14192c next = it.next();
                boolean z10 = next.q().f122609m;
                C14190a h10 = next.h();
                List<C14190a> i10 = next.i();
                boolean z11 = i10 != null && !i10.isEmpty();
                if (h10 != null || z11) {
                    if (h10 != null && h10.j().equals(obj)) {
                        next.f(h10);
                        this.f122561g.put(h10.k(), h10);
                        if (z10) {
                            F.t("Dispatcher", "paused", h10.f122505b.d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z11) {
                        for (int size = i10.size() - 1; size >= 0; size--) {
                            C14190a aVar = i10.get(size);
                            if (aVar.j().equals(obj)) {
                                next.f(aVar);
                                this.f122561g.put(aVar.k(), aVar);
                                if (z10) {
                                    F.t("Dispatcher", "paused", aVar.f122505b.d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.c()) {
                        it.remove();
                        if (z10) {
                            F.t("Dispatcher", "canceled", F.j(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(Object obj) {
        if (this.f122562h.remove(obj)) {
            Iterator<C14190a> it = this.f122561g.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                C14190a next = it.next();
                if (next.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f122564j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    public void u(C14192c cVar) {
        if (!cVar.u()) {
            boolean z10 = false;
            if (this.f122557c.isShutdown()) {
                q(cVar, false);
                return;
            }
            if (cVar.w(this.f122570p, this.f122569o ? ((ConnectivityManager) F.n(this.f122556b, "connectivity")).getActiveNetworkInfo() : null)) {
                if (cVar.q().f122609m) {
                    F.s("Dispatcher", "retrying", F.j(cVar));
                }
                if (cVar.k() instanceof r.a) {
                    cVar.f122533i |= q.NO_CACHE.index;
                }
                cVar.f122538n = this.f122557c.submit(cVar);
                return;
            }
            if (this.f122569o && cVar.x()) {
                z10 = true;
            }
            q(cVar, z10);
            if (z10) {
                l(cVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(C14190a aVar) {
        w(aVar, true);
    }

    /* access modifiers changed from: package-private */
    public void w(C14190a aVar, boolean z10) {
        if (this.f122562h.contains(aVar.j())) {
            this.f122561g.put(aVar.k(), aVar);
            if (aVar.g().f122609m) {
                String d10 = aVar.f122505b.d();
                F.t("Dispatcher", "paused", d10, "because tag '" + aVar.j() + "' is paused");
                return;
            }
            return;
        }
        C14192c cVar = this.f122559e.get(aVar.d());
        if (cVar != null) {
            cVar.b(aVar);
        } else if (!this.f122557c.isShutdown()) {
            C14192c g10 = C14192c.g(aVar.g(), this, this.f122565k, this.f122566l, aVar);
            g10.f122538n = this.f122557c.submit(g10);
            this.f122559e.put(aVar.d(), g10);
            if (z10) {
                this.f122560f.remove(aVar.k());
            }
            if (aVar.g().f122609m) {
                F.s("Dispatcher", "enqueued", aVar.f122505b.d());
            }
        } else if (aVar.g().f122609m) {
            F.t("Dispatcher", "ignored", aVar.f122505b.d(), "because shut down");
        }
    }
}
