package S5;

import B5.k;
import M5.e;
import M5.g;
import M5.h;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001\u0017B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R.\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00030\u00030\u00198\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u0012\u0004\b\u001e\u0010\t\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010$R(\u0010+\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\b\u0010&\u0012\u0004\b*\u0010\t\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u0018R\u0016\u0010,\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b \u0010(¨\u0006."}, d2 = {"LS5/t;", "Landroid/content/ComponentCallbacks2;", "LM5/g$a;", "LB5/k;", "imageLoader", "<init>", "(LB5/k;)V", "LXH/N;", "d", "()V", "c", "e", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "level", "onTrimMemory", "(I)V", "onLowMemory", "", "isOnline", "a", "(Z)V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "getImageLoader", "()Ljava/lang/ref/WeakReference;", "getImageLoader$annotations", "Landroid/content/Context;", "b", "Landroid/content/Context;", "application", "LM5/g;", "LM5/g;", "networkObserver", "Z", "getShutdown", "()Z", "setShutdown", "getShutdown$annotations", "shutdown", "_isOnline", "f", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t implements ComponentCallbacks2, g.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f39907f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<k> f39908a;

    /* renamed from: b  reason: collision with root package name */
    private Context f39909b;

    /* renamed from: c  reason: collision with root package name */
    private g f39910c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f39911d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f39912e = true;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LS5/t$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ONLINE", "OFFLINE", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public t(k kVar) {
        this.f39908a = new WeakReference<>(kVar);
    }

    private final synchronized void d() {
        g gVar;
        try {
            k kVar = this.f39908a.get();
            if (kVar == null) {
                e();
            } else if (this.f39910c == null) {
                if (kVar.q().f()) {
                    Context k10 = kVar.k();
                    kVar.o();
                    gVar = h.a(k10, this, (r) null);
                } else {
                    gVar = new e();
                }
                this.f39910c = gVar;
                this.f39912e = gVar.a();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void a(boolean z10) {
        try {
            k kVar = this.f39908a.get();
            if (kVar != null) {
                kVar.o();
                this.f39912e = z10;
            } else {
                e();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized boolean b() {
        d();
        return this.f39912e;
    }

    public final synchronized void c() {
        try {
            k kVar = this.f39908a.get();
            if (kVar == null) {
                e();
            } else if (this.f39909b == null) {
                Context k10 = kVar.k();
                this.f39909b = k10;
                k10.registerComponentCallbacks(this);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized void e() {
        try {
            if (!this.f39911d) {
                this.f39911d = true;
                Context context = this.f39909b;
                if (context != null) {
                    context.unregisterComponentCallbacks(this);
                }
                g gVar = this.f39910c;
                if (gVar != null) {
                    gVar.shutdown();
                }
                this.f39908a.clear();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void onConfigurationChanged(Configuration configuration) {
        if (this.f39908a.get() == null) {
            e();
        }
    }

    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    public synchronized void onTrimMemory(int i10) {
        try {
            k kVar = this.f39908a.get();
            if (kVar != null) {
                kVar.o();
                kVar.u(i10);
            } else {
                e();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
