package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.C14190a;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class t {

    /* renamed from: o  reason: collision with root package name */
    static final Handler f122595o = new a(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: p  reason: collision with root package name */
    static volatile t f122596p = null;

    /* renamed from: a  reason: collision with root package name */
    private final g f122597a;

    /* renamed from: b  reason: collision with root package name */
    private final c f122598b;

    /* renamed from: c  reason: collision with root package name */
    private final List<y> f122599c;

    /* renamed from: d  reason: collision with root package name */
    final Context f122600d;

    /* renamed from: e  reason: collision with root package name */
    final i f122601e;

    /* renamed from: f  reason: collision with root package name */
    final C14193d f122602f;

    /* renamed from: g  reason: collision with root package name */
    final A f122603g;

    /* renamed from: h  reason: collision with root package name */
    final Map<Object, C14190a> f122604h;

    /* renamed from: i  reason: collision with root package name */
    final Map<ImageView, h> f122605i;

    /* renamed from: j  reason: collision with root package name */
    final ReferenceQueue<Object> f122606j;

    /* renamed from: k  reason: collision with root package name */
    final Bitmap.Config f122607k;

    /* renamed from: l  reason: collision with root package name */
    boolean f122608l;

    /* renamed from: m  reason: collision with root package name */
    volatile boolean f122609m;

    /* renamed from: n  reason: collision with root package name */
    boolean f122610n;

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 3) {
                int i11 = 0;
                if (i10 == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i11 < size) {
                        C14192c cVar = (C14192c) list.get(i11);
                        cVar.f122526b.d(cVar);
                        i11++;
                    }
                } else if (i10 == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i11 < size2) {
                        C14190a aVar = (C14190a) list2.get(i11);
                        aVar.f122504a.p(aVar);
                        i11++;
                    }
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            } else {
                C14190a aVar2 = (C14190a) message.obj;
                if (aVar2.g().f122609m) {
                    F.t("Main", "canceled", aVar2.f122505b.d(), "target got garbage collected");
                }
                aVar2.f122504a.a(aVar2.k());
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f122611a;

        /* renamed from: b  reason: collision with root package name */
        private j f122612b;

        /* renamed from: c  reason: collision with root package name */
        private ExecutorService f122613c;

        /* renamed from: d  reason: collision with root package name */
        private C14193d f122614d;

        /* renamed from: e  reason: collision with root package name */
        private g f122615e;

        /* renamed from: f  reason: collision with root package name */
        private List<y> f122616f;

        /* renamed from: g  reason: collision with root package name */
        private Bitmap.Config f122617g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f122618h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f122619i;

        public b(Context context) {
            if (context != null) {
                this.f122611a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public t a() {
            Context context = this.f122611a;
            if (this.f122612b == null) {
                this.f122612b = new s(context);
            }
            if (this.f122614d == null) {
                this.f122614d = new m(context);
            }
            if (this.f122613c == null) {
                this.f122613c = new v();
            }
            if (this.f122615e == null) {
                this.f122615e = g.f122624a;
            }
            A a10 = new A(this.f122614d);
            Context context2 = context;
            return new t(context2, new i(context2, this.f122613c, t.f122595o, this.f122612b, this.f122614d, a10), this.f122614d, (d) null, this.f122615e, this.f122616f, a10, this.f122617g, this.f122618h, this.f122619i);
        }
    }

    private static class c extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private final ReferenceQueue<Object> f122620a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f122621b;

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Exception f122622a;

            a(Exception exc) {
                this.f122622a = exc;
            }

            public void run() {
                throw new RuntimeException(this.f122622a);
            }
        }

        c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f122620a = referenceQueue;
            this.f122621b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C14190a.C3020a aVar = (C14190a.C3020a) this.f122620a.remove(1000);
                    Message obtainMessage = this.f122621b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f122516a;
                        this.f122621b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    this.f122621b.post(new a(e10));
                    return;
                }
            }
        }
    }

    public interface d {
    }

    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        final int debugColor;

        private e(int i10) {
            this.debugColor = i10;
        }
    }

    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    public interface g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f122624a = new a();

        static class a implements g {
            a() {
            }

            public w a(w wVar) {
                return wVar;
            }
        }

        w a(w wVar);
    }

    t(Context context, i iVar, C14193d dVar, d dVar2, g gVar, List<y> list, A a10, Bitmap.Config config, boolean z10, boolean z11) {
        this.f122600d = context;
        this.f122601e = iVar;
        this.f122602f = dVar;
        this.f122597a = gVar;
        this.f122607k = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C14195f(context));
        arrayList.add(new o(context));
        arrayList.add(new g(context));
        arrayList.add(new C14191b(context));
        arrayList.add(new k(context));
        arrayList.add(new r(iVar.f122558d, a10));
        this.f122599c = Collections.unmodifiableList(arrayList);
        this.f122603g = a10;
        this.f122604h = new WeakHashMap();
        this.f122605i = new WeakHashMap();
        this.f122608l = z10;
        this.f122609m = z11;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f122606j = referenceQueue;
        c cVar = new c(referenceQueue, f122595o);
        this.f122598b = cVar;
        cVar.start();
    }

    private void f(Bitmap bitmap, e eVar, C14190a aVar, Exception exc) {
        if (!aVar.l()) {
            if (!aVar.m()) {
                this.f122604h.remove(aVar.k());
            }
            if (bitmap == null) {
                aVar.c(exc);
                if (this.f122609m) {
                    F.t("Main", "errored", aVar.f122505b.d(), exc.getMessage());
                }
            } else if (eVar != null) {
                aVar.b(bitmap, eVar);
                if (this.f122609m) {
                    String d10 = aVar.f122505b.d();
                    F.t("Main", "completed", d10, "from " + eVar);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    public static t h() {
        if (f122596p == null) {
            synchronized (t.class) {
                try {
                    if (f122596p == null) {
                        Context context = PicassoProvider.f122503a;
                        if (context != null) {
                            f122596p = new b(context).a();
                        } else {
                            throw new IllegalStateException("context == null");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f122596p;
    }

    /* access modifiers changed from: package-private */
    public void a(Object obj) {
        h remove;
        F.c();
        C14190a remove2 = this.f122604h.remove(obj);
        if (remove2 != null) {
            remove2.a();
            this.f122601e.c(remove2);
        }
        if ((obj instanceof ImageView) && (remove = this.f122605i.remove((ImageView) obj)) != null) {
            remove.a();
        }
    }

    public void b(ImageView imageView) {
        if (imageView != null) {
            a(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    public void c(C c10) {
        if (c10 != null) {
            a(c10);
            return;
        }
        throw new IllegalArgumentException("target cannot be null.");
    }

    /* access modifiers changed from: package-private */
    public void d(C14192c cVar) {
        C14190a h10 = cVar.h();
        List<C14190a> i10 = cVar.i();
        boolean z10 = i10 != null && !i10.isEmpty();
        if (h10 != null || z10) {
            Uri uri = cVar.j().f122638d;
            Exception k10 = cVar.k();
            Bitmap s10 = cVar.s();
            e o10 = cVar.o();
            if (h10 != null) {
                f(s10, o10, h10, k10);
            }
            if (z10) {
                int size = i10.size();
                for (int i11 = 0; i11 < size; i11++) {
                    f(s10, o10, i10.get(i11), k10);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(ImageView imageView, h hVar) {
        if (this.f122605i.containsKey(imageView)) {
            a(imageView);
        }
        this.f122605i.put(imageView, hVar);
    }

    /* access modifiers changed from: package-private */
    public void g(C14190a aVar) {
        Object k10 = aVar.k();
        if (!(k10 == null || this.f122604h.get(k10) == aVar)) {
            a(k10);
            this.f122604h.put(k10, aVar);
        }
        q(aVar);
    }

    /* access modifiers changed from: package-private */
    public List<y> i() {
        return this.f122599c;
    }

    public void j(Uri uri) {
        if (uri != null) {
            this.f122602f.c(uri.toString());
        }
    }

    public void k(File file) {
        if (file != null) {
            j(Uri.fromFile(file));
            return;
        }
        throw new IllegalArgumentException("file == null");
    }

    public x l(Uri uri) {
        return new x(this, uri, 0);
    }

    public x m(File file) {
        return file == null ? new x(this, (Uri) null, 0) : l(Uri.fromFile(file));
    }

    public x n(String str) {
        if (str == null) {
            return new x(this, (Uri) null, 0);
        }
        if (str.trim().length() != 0) {
            return l(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* access modifiers changed from: package-private */
    public Bitmap o(String str) {
        Bitmap bitmap = this.f122602f.get(str);
        if (bitmap != null) {
            this.f122603g.d();
        } else {
            this.f122603g.e();
        }
        return bitmap;
    }

    /* access modifiers changed from: package-private */
    public void p(C14190a aVar) {
        Bitmap o10 = p.a(aVar.f122508e) ? o(aVar.d()) : null;
        if (o10 != null) {
            e eVar = e.MEMORY;
            f(o10, eVar, aVar, (Exception) null);
            if (this.f122609m) {
                String d10 = aVar.f122505b.d();
                F.t("Main", "completed", d10, "from " + eVar);
                return;
            }
            return;
        }
        g(aVar);
        if (this.f122609m) {
            F.s("Main", "resumed", aVar.f122505b.d());
        }
    }

    /* access modifiers changed from: package-private */
    public void q(C14190a aVar) {
        this.f122601e.h(aVar);
    }

    /* access modifiers changed from: package-private */
    public w r(w wVar) {
        w a10 = this.f122597a.a(wVar);
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException("Request transformer " + this.f122597a.getClass().getCanonicalName() + " returned null for " + wVar);
    }
}
