package androidx.window.layout.adapter.sidecar;

import XH.C16807N;
import YH.C16877v;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d5.j;
import f5.k;
import i5.C8209a;
import i5.C8210b;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u2.C6014c;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u00020\u0001:\u0004\u0013\u0018\u001d0B\u001b\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u001d\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R&\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat;", "Landroidx/window/layout/adapter/sidecar/a;", "Landroidx/window/sidecar/SidecarInterface;", "sidecar", "Li5/a;", "sidecarAdapter", "<init>", "(Landroidx/window/sidecar/SidecarInterface;Li5/a;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "LXH/N;", "k", "(Landroid/app/Activity;)V", "m", "Landroidx/window/layout/adapter/sidecar/a$a;", "extensionCallback", "a", "(Landroidx/window/layout/adapter/sidecar/a$a;)V", "Lf5/k;", "i", "(Landroid/app/Activity;)Lf5/k;", "b", "Landroid/os/IBinder;", "windowToken", "j", "(Landroid/os/IBinder;Landroid/app/Activity;)V", "c", "", "n", "()Z", "Landroidx/window/sidecar/SidecarInterface;", "h", "()Landroidx/window/sidecar/SidecarInterface;", "Li5/a;", "", "Ljava/util/Map;", "windowListenerRegisteredContexts", "LH2/a;", "Landroid/content/res/Configuration;", "d", "componentCallbackMap", "Landroidx/window/layout/adapter/sidecar/SidecarCompat$b;", "e", "Landroidx/window/layout/adapter/sidecar/SidecarCompat$b;", "f", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SidecarCompat implements a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f45032f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final SidecarInterface f45033a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C8209a f45034b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Map<IBinder, Activity> f45035c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Activity, H2.a<Configuration>> f45036d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public b f45037e;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "<init>", "(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)V", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "LXH/N;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface h10;
            C17542s.j(sidecarDeviceState, "newDeviceState");
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : SidecarCompat.this.f45035c.values()) {
                IBinder a10 = SidecarCompat.f45032f.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (!(a10 == null || (h10 = sidecarCompat.h()) == null)) {
                    sidecarWindowLayoutInfo = h10.getWindowLayoutInfo(a10);
                }
                b e10 = sidecarCompat.f45037e;
                if (e10 != null) {
                    e10.a(activity, sidecarCompat.f45034b.e(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            C17542s.j(iBinder, "windowToken");
            C17542s.j(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.f45035c.get(iBinder);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            C8209a f10 = SidecarCompat.this.f45034b;
            SidecarInterface h10 = SidecarCompat.this.h();
            if (h10 == null || (sidecarDeviceState = h10.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            k e10 = f10.e(sidecarWindowLayoutInfo, sidecarDeviceState);
            b e11 = SidecarCompat.this.f45037e;
            if (e11 != null) {
                e11.a(activity, e10);
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/sidecar/SidecarInterface;", "b", "(Landroid/content/Context;)Landroidx/window/sidecar/SidecarInterface;", "Landroid/app/Activity;", "activity", "Landroid/os/IBinder;", "a", "(Landroid/app/Activity;)Landroid/os/IBinder;", "Ld5/k;", "c", "()Ld5/k;", "sidecarVersion", "", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            C17542s.j(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final d5.k c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (!TextUtils.isEmpty(apiVersion)) {
                    return d5.k.f50750f.b(apiVersion);
                }
                return null;
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$b;", "Landroidx/window/layout/adapter/sidecar/a$a;", "callbackInterface", "<init>", "(Landroidx/window/layout/adapter/sidecar/a$a;)V", "Landroid/app/Activity;", "activity", "Lf5/k;", "newLayout", "LXH/N;", "a", "(Landroid/app/Activity;Lf5/k;)V", "b", "(Landroid/app/Activity;)V", "Landroidx/window/layout/adapter/sidecar/a$a;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/WeakHashMap;", "c", "Ljava/util/WeakHashMap;", "activityWindowLayoutInfo", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements a.C0774a {

        /* renamed from: a  reason: collision with root package name */
        private final a.C0774a f45039a;

        /* renamed from: b  reason: collision with root package name */
        private final ReentrantLock f45040b = new ReentrantLock();

        /* renamed from: c  reason: collision with root package name */
        private final WeakHashMap<Activity, k> f45041c = new WeakHashMap<>();

        public b(a.C0774a aVar) {
            C17542s.j(aVar, "callbackInterface");
            this.f45039a = aVar;
        }

        public void a(Activity activity, k kVar) {
            C17542s.j(activity, "activity");
            C17542s.j(kVar, "newLayout");
            ReentrantLock reentrantLock = this.f45040b;
            reentrantLock.lock();
            try {
                if (!C17542s.e(kVar, this.f45041c.get(activity))) {
                    k put = this.f45041c.put(activity, kVar);
                    reentrantLock.unlock();
                    this.f45039a.a(activity, kVar);
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(Activity activity) {
            C17542s.j(activity, "activity");
            ReentrantLock reentrantLock = this.f45040b;
            reentrantLock.lock();
            try {
                this.f45041c.put(activity, (Object) null);
                C16807N n10 = C16807N.f139792a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00040\u00040\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$c;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/window/layout/adapter/sidecar/SidecarCompat;", "sidecarCompat", "Landroid/app/Activity;", "activity", "<init>", "(Landroidx/window/layout/adapter/sidecar/SidecarCompat;Landroid/app/Activity;)V", "Landroid/view/View;", "view", "LXH/N;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "a", "Landroidx/window/layout/adapter/sidecar/SidecarCompat;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "b", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final SidecarCompat f45042a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<Activity> f45043b;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            C17542s.j(sidecarCompat, "sidecarCompat");
            C17542s.j(activity, "activity");
            this.f45042a = sidecarCompat;
            this.f45043b = new WeakReference<>(activity);
        }

        public void onViewAttachedToWindow(View view) {
            C17542s.j(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f45043b.get();
            IBinder a10 = SidecarCompat.f45032f.a(activity);
            if (activity != null && a10 != null) {
                this.f45042a.j(a10, activity);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            C17542s.j(view, "view");
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, C8209a aVar) {
        C17542s.j(aVar, "sidecarAdapter");
        this.f45033a = sidecarInterface;
        this.f45034b = aVar;
        this.f45035c = new LinkedHashMap();
        this.f45036d = new LinkedHashMap();
    }

    private final void k(Activity activity) {
        if (this.f45036d.get(activity) == null && (activity instanceof C6014c)) {
            C8210b bVar = new C8210b(this, activity);
            this.f45036d.put(activity, bVar);
            ((C6014c) activity).addOnConfigurationChangedListener(bVar);
        }
    }

    /* access modifiers changed from: private */
    public static final void l(SidecarCompat sidecarCompat, Activity activity, Configuration configuration) {
        C17542s.j(sidecarCompat, "this$0");
        C17542s.j(activity, "$activity");
        b bVar = sidecarCompat.f45037e;
        if (bVar != null) {
            bVar.a(activity, sidecarCompat.i(activity));
        }
    }

    private final void m(Activity activity) {
        H2.a aVar = this.f45036d.get(activity);
        if (aVar != null) {
            if (activity instanceof C6014c) {
                ((C6014c) activity).removeOnConfigurationChangedListener(aVar);
            }
            this.f45036d.remove(activity);
        }
    }

    public void a(a.C0774a aVar) {
        C17542s.j(aVar, "extensionCallback");
        this.f45037e = new b(aVar);
        SidecarInterface sidecarInterface = this.f45033a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f45034b, new TranslatingCallback()));
        }
    }

    public void b(Activity activity) {
        C17542s.j(activity, "activity");
        IBinder a10 = f45032f.a(activity);
        if (a10 != null) {
            j(a10, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
    }

    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        C17542s.j(activity, "activity");
        IBinder a10 = f45032f.a(activity);
        if (a10 != null) {
            SidecarInterface sidecarInterface2 = this.f45033a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(a10);
            }
            m(activity);
            b bVar = this.f45037e;
            if (bVar != null) {
                bVar.b(activity);
            }
            boolean z10 = this.f45035c.size() == 1;
            this.f45035c.remove(a10);
            if (z10 && (sidecarInterface = this.f45033a) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    public final SidecarInterface h() {
        return this.f45033a;
    }

    public final k i(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        C17542s.j(activity, "activity");
        IBinder a10 = f45032f.a(activity);
        if (a10 == null) {
            return new k(C16877v.n());
        }
        SidecarInterface sidecarInterface = this.f45033a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a10) : null;
        C8209a aVar = this.f45034b;
        SidecarInterface sidecarInterface2 = this.f45033a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return aVar.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void j(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        C17542s.j(iBinder, "windowToken");
        C17542s.j(activity, "activity");
        this.f45035c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f45033a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f45035c.size() == 1 && (sidecarInterface = this.f45033a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f45037e;
        if (bVar != null) {
            bVar.a(activity, i(activity));
        }
        k(activity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r0 = r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return true;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0103 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052 A[Catch:{ NoSuchFieldError -> 0x00b1, all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0057 A[Catch:{ NoSuchFieldError -> 0x00b1, all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0060 A[Catch:{ NoSuchFieldError -> 0x00b1, all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0139 A[Catch:{ NoSuchFieldError -> 0x00b1, all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013a A[Catch:{ NoSuchFieldError -> 0x00b1, all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0178 A[Catch:{ NoSuchFieldError -> 0x00b1, all -> 0x01a6 }] */
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean n() {
        /*
            r7 = this;
            androidx.window.sidecar.SidecarInterface r0 = r7.f45033a     // Catch:{ all -> 0x01a6 }
            r1 = 0
            if (r0 == 0) goto L_0x0018
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0018
            java.lang.String r2 = "setSidecarCallback"
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r3 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch:{ all -> 0x01a6 }
            java.lang.reflect.Method r0 = r0.getMethod(r2, r3)     // Catch:{ all -> 0x01a6 }
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            if (r0 == 0) goto L_0x0020
            java.lang.Class r0 = r0.getReturnType()     // Catch:{ all -> 0x01a6 }
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.lang.Class r2 = java.lang.Void.TYPE     // Catch:{ all -> 0x01a6 }
            boolean r3 = kotlin.jvm.internal.C17542s.e(r0, r2)     // Catch:{ all -> 0x01a6 }
            if (r3 == 0) goto L_0x018f
            androidx.window.sidecar.SidecarInterface r0 = r7.f45033a     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0030
            r0.getDeviceState()     // Catch:{ all -> 0x01a6 }
        L_0x0030:
            androidx.window.sidecar.SidecarInterface r0 = r7.f45033a     // Catch:{ all -> 0x01a6 }
            r3 = 1
            if (r0 == 0) goto L_0x0038
            r0.onDeviceStateListenersChanged(r3)     // Catch:{ all -> 0x01a6 }
        L_0x0038:
            androidx.window.sidecar.SidecarInterface r0 = r7.f45033a     // Catch:{ all -> 0x01a6 }
            java.lang.Class<android.os.IBinder> r4 = android.os.IBinder.class
            if (r0 == 0) goto L_0x004f
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r5 = "getWindowLayoutInfo"
            java.lang.Class[] r6 = new java.lang.Class[]{r4}     // Catch:{ all -> 0x01a6 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ all -> 0x01a6 }
            goto L_0x0050
        L_0x004f:
            r0 = r1
        L_0x0050:
            if (r0 == 0) goto L_0x0057
            java.lang.Class r0 = r0.getReturnType()     // Catch:{ all -> 0x01a6 }
            goto L_0x0058
        L_0x0057:
            r0 = r1
        L_0x0058:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r5 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r5 = kotlin.jvm.internal.C17542s.e(r0, r5)     // Catch:{ all -> 0x01a6 }
            if (r5 == 0) goto L_0x0178
            androidx.window.sidecar.SidecarInterface r0 = r7.f45033a     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0075
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0075
            java.lang.String r5 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r6 = new java.lang.Class[]{r4}     // Catch:{ all -> 0x01a6 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ all -> 0x01a6 }
            goto L_0x0076
        L_0x0075:
            r0 = r1
        L_0x0076:
            if (r0 == 0) goto L_0x007d
            java.lang.Class r0 = r0.getReturnType()     // Catch:{ all -> 0x01a6 }
            goto L_0x007e
        L_0x007d:
            r0 = r1
        L_0x007e:
            boolean r5 = kotlin.jvm.internal.C17542s.e(r0, r2)     // Catch:{ all -> 0x01a6 }
            if (r5 == 0) goto L_0x0161
            androidx.window.sidecar.SidecarInterface r0 = r7.f45033a     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0099
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0099
            java.lang.String r5 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch:{ all -> 0x01a6 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r4)     // Catch:{ all -> 0x01a6 }
            goto L_0x009a
        L_0x0099:
            r0 = r1
        L_0x009a:
            if (r0 == 0) goto L_0x00a1
            java.lang.Class r0 = r0.getReturnType()     // Catch:{ all -> 0x01a6 }
            goto L_0x00a2
        L_0x00a1:
            r0 = r1
        L_0x00a2:
            boolean r2 = kotlin.jvm.internal.C17542s.e(r0, r2)     // Catch:{ all -> 0x01a6 }
            if (r2 == 0) goto L_0x014a
            androidx.window.sidecar.SidecarDeviceState r0 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x01a6 }
            r0.<init>()     // Catch:{ all -> 0x01a6 }
            r2 = 3
            r0.posture = r2     // Catch:{ NoSuchFieldError -> 0x00b1 }
            goto L_0x00e3
        L_0x00b1:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "setPosture"
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01a6 }
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch:{ all -> 0x01a6 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x01a6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01a6 }
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch:{ all -> 0x01a6 }
            r4.invoke(r0, r5)     // Catch:{ all -> 0x01a6 }
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "getPosture"
            java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r0 = r4.invoke(r0, r1)     // Catch:{ all -> 0x01a6 }
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.C17542s.h(r0, r4)     // Catch:{ all -> 0x01a6 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01a6 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01a6 }
            if (r0 != r2) goto L_0x0142
        L_0x00e3:
            androidx.window.sidecar.SidecarDisplayFeature r0 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x01a6 }
            r0.<init>()     // Catch:{ all -> 0x01a6 }
            android.graphics.Rect r2 = r0.getRect()     // Catch:{ all -> 0x01a6 }
            java.lang.String r4 = "displayFeature.rect"
            kotlin.jvm.internal.C17542s.i(r2, r4)     // Catch:{ all -> 0x01a6 }
            r0.setRect(r2)     // Catch:{ all -> 0x01a6 }
            r0.getType()     // Catch:{ all -> 0x01a6 }
            r0.setType(r3)     // Catch:{ all -> 0x01a6 }
            androidx.window.sidecar.SidecarWindowLayoutInfo r2 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x01a6 }
            r2.<init>()     // Catch:{ all -> 0x01a6 }
            java.util.List r0 = r2.displayFeatures     // Catch:{ NoSuchFieldError -> 0x0103 }
            goto L_0x01a7
        L_0x0103:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x01a6 }
            r4.<init>()     // Catch:{ all -> 0x01a6 }
            r4.add(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "setDisplayFeatures"
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch:{ all -> 0x01a6 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ all -> 0x01a6 }
            java.lang.Object[] r5 = new java.lang.Object[]{r4}     // Catch:{ all -> 0x01a6 }
            r0.invoke(r2, r5)     // Catch:{ all -> 0x01a6 }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "getDisplayFeatures"
            java.lang.reflect.Method r0 = r0.getMethod(r5, r1)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"
            kotlin.jvm.internal.C17542s.h(r0, r1)     // Catch:{ all -> 0x01a6 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x01a6 }
            boolean r0 = kotlin.jvm.internal.C17542s.e(r4, r0)     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x013a
            goto L_0x01a7
        L_0x013a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = "Invalid display feature getter/setter"
            r0.<init>(r1)     // Catch:{ all -> 0x01a6 }
            throw r0     // Catch:{ all -> 0x01a6 }
        L_0x0142:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = "Invalid device posture getter/setter"
            r0.<init>(r1)     // Catch:{ all -> 0x01a6 }
            throw r0     // Catch:{ all -> 0x01a6 }
        L_0x014a:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r2.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            r2.append(r3)     // Catch:{ all -> 0x01a6 }
            r2.append(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a6 }
            throw r1     // Catch:{ all -> 0x01a6 }
        L_0x0161:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r2.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            r2.append(r3)     // Catch:{ all -> 0x01a6 }
            r2.append(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a6 }
            throw r1     // Catch:{ all -> 0x01a6 }
        L_0x0178:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r2.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = "Illegal return type for 'getWindowLayoutInfo': "
            r2.append(r3)     // Catch:{ all -> 0x01a6 }
            r2.append(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a6 }
            throw r1     // Catch:{ all -> 0x01a6 }
        L_0x018f:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r2.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = "Illegal return type for 'setSidecarCallback': "
            r2.append(r3)     // Catch:{ all -> 0x01a6 }
            r2.append(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a6 }
            throw r1     // Catch:{ all -> 0x01a6 }
        L_0x01a6:
            r3 = 0
        L_0x01a7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.SidecarCompat.n():boolean");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f45032f.b(context), new C8209a((j) null, 1, (DefaultConstructorMarker) null));
        C17542s.j(context, "context");
    }
}
