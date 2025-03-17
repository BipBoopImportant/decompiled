package r6;

import T5.v;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import f6.C7853d;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\tR/\u0010\u0004\u001a\u0014\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00030\u00030\u0014j\u0002`\u00168\u0006¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u0012\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001cR(\u0010&\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010 \u0012\u0004\b%\u0010\t\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Lr6/a;", "Lr6/A;", "Landroid/content/ComponentCallbacks2;", "LT5/v;", "imageLoader", "<init>", "(LT5/v;)V", "LXH/N;", "a", "()V", "b", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "level", "onTrimMemory", "(I)V", "onLowMemory", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Lcoil3/util/WeakReference;", "Ljava/lang/ref/WeakReference;", "getImageLoader", "()Ljava/lang/ref/WeakReference;", "getImageLoader$annotations", "Landroid/content/Context;", "Landroid/content/Context;", "application", "", "c", "Z", "getShutdown", "()Z", "setShutdown", "(Z)V", "getShutdown$annotations", "shutdown", "d", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: r6.a  reason: case insensitive filesystem */
public final class C8693a implements C8690A, ComponentCallbacks2 {

    /* renamed from: d  reason: collision with root package name */
    private static final C0898a f55694d = new C0898a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<v> f55695a;

    /* renamed from: b  reason: collision with root package name */
    private Context f55696b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f55697c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr6/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: r6.a$a  reason: collision with other inner class name */
    private static final class C0898a {
        public /* synthetic */ C0898a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0898a() {
        }
    }

    public C8693a(v vVar) {
        this.f55695a = new WeakReference<>(vVar);
    }

    public synchronized void a() {
        try {
            v vVar = this.f55695a.get();
            if (vVar == null) {
                b();
            } else if (this.f55696b == null) {
                Context a10 = vVar.h().a();
                this.f55696b = a10;
                a10.registerComponentCallbacks(this);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void b() {
        try {
            if (!this.f55697c) {
                this.f55697c = true;
                Context context = this.f55696b;
                if (context != null) {
                    context.unregisterComponentCallbacks(this);
                }
                this.f55695a.clear();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void onConfigurationChanged(Configuration configuration) {
        if (this.f55695a.get() == null) {
            b();
        }
    }

    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    public synchronized void onTrimMemory(int i10) {
        C7853d b10;
        try {
            v vVar = this.f55695a.get();
            if (vVar != null) {
                vVar.h().f();
                if (i10 >= 40) {
                    C7853d b11 = vVar.b();
                    if (b11 != null) {
                        b11.clear();
                    }
                } else if (i10 >= 10 && (b10 = vVar.b()) != null) {
                    b10.c(b10.a() / ((long) 2));
                }
            } else {
                b();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
