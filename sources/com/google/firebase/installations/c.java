package com.google.firebase.installations;

import Fb.f;
import K9.C6620s;
import Kb.w;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.firebase.installations.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kc.i;
import mc.C10036b;
import nc.C10080a;
import nc.C10081b;
import nc.e;
import nc.g;
import oc.C10103a;
import pc.C10133b;
import pc.C10134c;
import pc.d;
import qc.C10184c;
import qc.C10185d;
import xa.C8971l;
import xa.C8972m;
import xa.C8974o;

public class c implements e {

    /* renamed from: m  reason: collision with root package name */
    private static final Object f68272m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadFactory f68273n = new a();

    /* renamed from: a  reason: collision with root package name */
    private final f f68274a;

    /* renamed from: b  reason: collision with root package name */
    private final C10184c f68275b;

    /* renamed from: c  reason: collision with root package name */
    private final C10134c f68276c;

    /* renamed from: d  reason: collision with root package name */
    private final i f68277d;

    /* renamed from: e  reason: collision with root package name */
    private final w<C10133b> f68278e;

    /* renamed from: f  reason: collision with root package name */
    private final g f68279f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f68280g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f68281h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f68282i;

    /* renamed from: j  reason: collision with root package name */
    private String f68283j;

    /* renamed from: k  reason: collision with root package name */
    private Set<C10103a> f68284k;

    /* renamed from: l  reason: collision with root package name */
    private final List<h> f68285l;

    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f68286a = new AtomicInteger(1);

        a() {
        }

        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f68286a.getAndIncrement())}));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f68287a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f68288b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                qc.f$b[] r0 = qc.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f68288b = r0
                r1 = 1
                qc.f$b r2 = qc.f.b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f68288b     // Catch:{ NoSuchFieldError -> 0x001d }
                qc.f$b r3 = qc.f.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f68288b     // Catch:{ NoSuchFieldError -> 0x0028 }
                qc.f$b r3 = qc.f.b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                qc.d$b[] r2 = qc.C10185d.b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f68287a = r2
                qc.d$b r3 = qc.C10185d.b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f68287a     // Catch:{ NoSuchFieldError -> 0x0043 }
                qc.d$b r2 = qc.C10185d.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.b.<clinit>():void");
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(f fVar, C10036b<i> bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new C10184c(fVar.k(), bVar), new C10134c(fVar), i.c(), new w(new C10080a(fVar)), new g());
    }

    private String A(d dVar) {
        if ((!this.f68274a.m().equals("CHIME_ANDROID_SDK") && !this.f68274a.u()) || !dVar.m()) {
            return this.f68279f.a();
        }
        String f10 = o().f();
        return TextUtils.isEmpty(f10) ? this.f68279f.a() : f10;
    }

    private d B(d dVar) {
        C10185d d10 = this.f68275b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.f68287a[d10.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(d10.c(), d10.d(), this.f68277d.b(), d10.b().c(), d10.b().d());
        } else if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    private void C(Exception exc) {
        synchronized (this.f68280g) {
            try {
                Iterator<h> it = this.f68285l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(exc)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    private void D(pc.d dVar) {
        synchronized (this.f68280g) {
            try {
                Iterator<h> it = this.f68285l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(dVar)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    private synchronized void E(String str) {
        this.f68283j = str;
    }

    private synchronized void F(pc.d dVar, pc.d dVar2) {
        if (this.f68284k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            for (C10103a a10 : this.f68284k) {
                a10.a(dVar2.d());
            }
        }
    }

    private C8971l<g> f() {
        C8972m mVar = new C8972m();
        h(new e(this.f68277d, mVar));
        return mVar.a();
    }

    private C8971l<String> g() {
        C8972m mVar = new C8972m();
        h(new f(mVar));
        return mVar.a();
    }

    private void h(h hVar) {
        synchronized (this.f68280g) {
            this.f68285l.add(hVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(boolean r3) {
        /*
            r2 = this;
            pc.d r0 = r2.r()
            boolean r1 = r0.i()     // Catch:{ d -> 0x001d }
            if (r1 != 0) goto L_0x0024
            boolean r1 = r0.l()     // Catch:{ d -> 0x001d }
            if (r1 == 0) goto L_0x0011
            goto L_0x0024
        L_0x0011:
            if (r3 != 0) goto L_0x001f
            com.google.firebase.installations.i r3 = r2.f68277d     // Catch:{ d -> 0x001d }
            boolean r3 = r3.f(r0)     // Catch:{ d -> 0x001d }
            if (r3 == 0) goto L_0x001c
            goto L_0x001f
        L_0x001c:
            return
        L_0x001d:
            r3 = move-exception
            goto L_0x0061
        L_0x001f:
            pc.d r3 = r2.k(r0)     // Catch:{ d -> 0x001d }
            goto L_0x0028
        L_0x0024:
            pc.d r3 = r2.B(r0)     // Catch:{ d -> 0x001d }
        L_0x0028:
            r2.u(r3)
            r2.F(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r3.d()
            r2.E(r0)
        L_0x003b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L_0x004c
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.d.a.BAD_CONFIG
            r3.<init>(r0)
            r2.C(r3)
            goto L_0x0060
        L_0x004c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x005d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.C(r3)
            goto L_0x0060
        L_0x005d:
            r2.D(r3)
        L_0x0060:
            return
        L_0x0061:
            r2.C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.v(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void x(boolean z10) {
        pc.d s10 = s();
        if (z10) {
            s10 = s10.p();
        }
        D(s10);
        this.f68282i.execute(new nc.d(this, z10));
    }

    private pc.d k(pc.d dVar) {
        qc.f e10 = this.f68275b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.f68288b[e10.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(e10.c(), e10.d(), this.f68277d.b());
        } else if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            if (i10 == 3) {
                E((String) null);
                return dVar.r();
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    private synchronized String n() {
        return this.f68283j;
    }

    private C10133b o() {
        return this.f68278e.get();
    }

    public static c p() {
        return q(f.l());
    }

    public static c q(f fVar) {
        C6620s.b(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) fVar.j(e.class);
    }

    private pc.d r() {
        b a10;
        pc.d d10;
        synchronized (f68272m) {
            try {
                a10 = b.a(this.f68274a.k(), "generatefid.lock");
                d10 = this.f68276c.d();
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d10;
    }

    private pc.d s() {
        b a10;
        pc.d d10;
        synchronized (f68272m) {
            try {
                a10 = b.a(this.f68274a.k(), "generatefid.lock");
                d10 = this.f68276c.d();
                if (d10.j()) {
                    d10 = this.f68276c.b(d10.t(A(d10)));
                }
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d10;
    }

    private void u(pc.d dVar) {
        b a10;
        synchronized (f68272m) {
            try {
                a10 = b.a(this.f68274a.k(), "generatefid.lock");
                this.f68276c.b(dVar);
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C10133b y(f fVar) {
        return new C10133b(fVar);
    }

    private void z() {
        C6620s.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C6620s.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C6620s.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C6620s.b(i.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C6620s.b(i.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public C8971l<g> a(boolean z10) {
        z();
        C8971l<g> f10 = f();
        this.f68281h.execute(new nc.c(this, z10));
        return f10;
    }

    public C8971l<String> getId() {
        z();
        String n10 = n();
        if (n10 != null) {
            return C8974o.f(n10);
        }
        C8971l<String> g10 = g();
        this.f68281h.execute(new C10081b(this));
        return g10;
    }

    /* access modifiers changed from: package-private */
    public String l() {
        return this.f68274a.n().b();
    }

    /* access modifiers changed from: package-private */
    public String m() {
        return this.f68274a.n().c();
    }

    /* access modifiers changed from: package-private */
    public String t() {
        return this.f68274a.n().e();
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(ExecutorService executorService, Executor executor, f fVar, C10184c cVar, C10134c cVar2, i iVar, w<C10133b> wVar, g gVar) {
        this.f68280g = new Object();
        this.f68284k = new HashSet();
        this.f68285l = new ArrayList();
        this.f68274a = fVar;
        this.f68275b = cVar;
        this.f68276c = cVar2;
        this.f68277d = iVar;
        this.f68278e = wVar;
        this.f68279f = gVar;
        this.f68281h = executorService;
        this.f68282i = executor;
    }
}
