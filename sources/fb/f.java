package Fb;

import D2.q;
import H9.C6529c;
import K9.C6619q;
import K9.C6620s;
import Kb.C9128c;
import Kb.C9131f;
import Kb.n;
import Kb.w;
import Lb.k;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.o;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import d0.i;
import j0.C5445a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jc.C9896c;
import mc.C10036b;
import org.slf4j.Marker;
import sc.C10231a;

public class f {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Object f60402k = new Object();

    /* renamed from: l  reason: collision with root package name */
    static final Map<String, f> f60403l = new C5445a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f60404a;

    /* renamed from: b  reason: collision with root package name */
    private final String f60405b;

    /* renamed from: c  reason: collision with root package name */
    private final n f60406c;

    /* renamed from: d  reason: collision with root package name */
    private final n f60407d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f60408e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f60409f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final w<C10231a> f60410g;

    /* renamed from: h  reason: collision with root package name */
    private final C10036b<kc.f> f60411h;

    /* renamed from: i  reason: collision with root package name */
    private final List<a> f60412i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final List<g> f60413j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    @TargetApi(14)
    private static class b implements C6529c.a {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference<b> f60414a = new AtomicReference<>();

        private b() {
        }

        /* access modifiers changed from: private */
        public static void c(Context context) {
            if (l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f60414a.get() == null) {
                    b bVar = new b();
                    if (i.a(f60414a, (Object) null, bVar)) {
                        C6529c.c(application);
                        C6529c.b().a(bVar);
                    }
                }
            }
        }

        public void a(boolean z10) {
            synchronized (f.f60402k) {
                try {
                    Iterator it = new ArrayList(f.f60403l.values()).iterator();
                    while (it.hasNext()) {
                        f fVar = (f) it.next();
                        if (fVar.f60408e.get()) {
                            fVar.y(z10);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @TargetApi(24)
    private static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<c> f60415b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        private final Context f60416a;

        public c(Context context) {
            this.f60416a = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (f60415b.get() == null) {
                c cVar = new c(context);
                if (i.a(f60415b, (Object) null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f60416a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (f.f60402k) {
                try {
                    for (f d10 : f.f60403l.values()) {
                        d10.p();
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            c();
        }
    }

    protected f(Context context, String str, n nVar) {
        this.f60404a = (Context) C6620s.l(context);
        this.f60405b = C6620s.f(str);
        this.f60406c = (n) C6620s.l(nVar);
        o b10 = FirebaseInitProvider.b();
        Pc.c.b("Firebase");
        Pc.c.b("ComponentDiscovery");
        List<C10036b<ComponentRegistrar>> b11 = C9131f.c(context, ComponentDiscoveryService.class).b();
        Pc.c.a();
        Pc.c.b("Runtime");
        n.b g10 = n.m(k.INSTANCE).d(b11).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C9128c.s(context, Context.class, new Class[0])).b(C9128c.s(this, f.class, new Class[0])).b(C9128c.s(nVar, n.class, new Class[0])).g(new Pc.b());
        if (q.a(context) && FirebaseInitProvider.c()) {
            g10.b(C9128c.s(b10, o.class, new Class[0]));
        }
        n e10 = g10.e();
        this.f60407d = e10;
        Pc.c.a();
        this.f60410g = new w<>(new d(this, context));
        this.f60411h = e10.e(kc.f.class);
        g(new e(this));
        Pc.c.a();
    }

    private void i() {
        C6620s.q(!this.f60409f.get(), "FirebaseApp was deleted");
    }

    public static f l() {
        f fVar;
        synchronized (f60402k) {
            try {
                fVar = f60403l.get("[DEFAULT]");
                if (fVar != null) {
                    fVar.f60411h.get().l();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + o.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    /* access modifiers changed from: private */
    public void p() {
        if (!q.a(this.f60404a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.f60404a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.f60407d.p(u());
        this.f60411h.get().l();
    }

    public static f q(Context context) {
        synchronized (f60402k) {
            try {
                if (f60403l.containsKey("[DEFAULT]")) {
                    f l10 = l();
                    return l10;
                }
                n a10 = n.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                f r10 = r(context, a10);
                return r10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static f r(Context context, n nVar) {
        return s(context, nVar, "[DEFAULT]");
    }

    public static f s(Context context, n nVar, String str) {
        f fVar;
        b.c(context);
        String x10 = x(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f60402k) {
            Map<String, f> map = f60403l;
            C6620s.q(!map.containsKey(x10), "FirebaseApp name " + x10 + " already exists!");
            C6620s.m(context, "Application context cannot be null.");
            fVar = new f(context, x10, nVar);
            map.put(x10, fVar);
        }
        fVar.p();
        return fVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C10231a v(Context context) {
        return new C10231a(context, o(), (C9896c) this.f60407d.a(C9896c.class));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(boolean z10) {
        if (!z10) {
            this.f60411h.get().l();
        }
    }

    private static String x(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    public void y(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (a a10 : this.f60412i) {
            a10.a(z10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f60405b.equals(((f) obj).m());
    }

    public void g(a aVar) {
        i();
        if (this.f60408e.get() && C6529c.b().d()) {
            aVar.a(true);
        }
        this.f60412i.add(aVar);
    }

    public void h(g gVar) {
        i();
        C6620s.l(gVar);
        this.f60413j.add(gVar);
    }

    public int hashCode() {
        return this.f60405b.hashCode();
    }

    public <T> T j(Class<T> cls) {
        i();
        return this.f60407d.a(cls);
    }

    public Context k() {
        i();
        return this.f60404a;
    }

    public String m() {
        i();
        return this.f60405b;
    }

    public n n() {
        i();
        return this.f60406c;
    }

    public String o() {
        return com.google.android.gms.common.util.c.a(m().getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + com.google.android.gms.common.util.c.a(n().c().getBytes(Charset.defaultCharset()));
    }

    public boolean t() {
        i();
        return this.f60410g.get().b();
    }

    public String toString() {
        return C6619q.d(this).a("name", this.f60405b).a("options", this.f60406c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }
}
