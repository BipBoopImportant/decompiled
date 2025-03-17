package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0002\u0010\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/lifecycle/O;", "Landroidx/lifecycle/y;", "<init>", "()V", "LXH/N;", "f", "e", "d", "g", "j", "k", "Landroid/content/Context;", "context", "h", "(Landroid/content/Context;)V", "", "a", "I", "startedCounter", "b", "resumedCounter", "", "c", "Z", "pauseSent", "stopSent", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/A;", "Landroidx/lifecycle/A;", "registry", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/ReportFragment$a;", "Landroidx/lifecycle/ReportFragment$a;", "initializationListener", "Landroidx/lifecycle/r;", "getLifecycle", "()Landroidx/lifecycle/r;", "lifecycle", "i", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class O implements C5221y {

    /* renamed from: i  reason: collision with root package name */
    public static final b f22160i = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final O f22161j = new O();

    /* renamed from: a  reason: collision with root package name */
    private int f22162a;

    /* renamed from: b  reason: collision with root package name */
    private int f22163b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22164c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f22165d = true;

    /* renamed from: e  reason: collision with root package name */
    private Handler f22166e;

    /* renamed from: f  reason: collision with root package name */
    private final A f22167f = new A(this);

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f22168g = new N(this);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final ReportFragment.a f22169h = new d(this);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/O$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "LXH/N;", "a", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f22170a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            C17542s.j(activity, "activity");
            C17542s.j(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/O$b;", "", "<init>", "()V", "Landroidx/lifecycle/y;", "a", "()Landroidx/lifecycle/y;", "Landroid/content/Context;", "context", "LXH/N;", "b", "(Landroid/content/Context;)V", "Landroidx/lifecycle/O;", "newInstance", "Landroidx/lifecycle/O;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5221y a() {
            return O.f22161j;
        }

        public final void b(Context context) {
            C17542s.j(context, "context");
            O.f22161j.h(context);
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"androidx/lifecycle/O$c", "Landroidx/lifecycle/j;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends C5207j {
        final /* synthetic */ O this$0;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/lifecycle/O$c$a", "Landroidx/lifecycle/j;", "Landroid/app/Activity;", "activity", "LXH/N;", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends C5207j {
            final /* synthetic */ O this$0;

            a(O o10) {
                this.this$0 = o10;
            }

            public void onActivityPostResumed(Activity activity) {
                C17542s.j(activity, "activity");
                this.this$0.e();
            }

            public void onActivityPostStarted(Activity activity) {
                C17542s.j(activity, "activity");
                this.this$0.f();
            }
        }

        c(O o10) {
            this.this$0 = o10;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C17542s.j(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                ReportFragment.f22205b.b(activity).e(this.this$0.f22169h);
            }
        }

        public void onActivityPaused(Activity activity) {
            C17542s.j(activity, "activity");
            this.this$0.d();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            C17542s.j(activity, "activity");
            a.a(activity, new a(this.this$0));
        }

        public void onActivityStopped(Activity activity) {
            C17542s.j(activity, "activity");
            this.this$0.g();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"androidx/lifecycle/O$d", "Landroidx/lifecycle/ReportFragment$a;", "LXH/N;", "onCreate", "()V", "k", "onResume", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements ReportFragment.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ O f22171a;

        d(O o10) {
            this.f22171a = o10;
        }

        public void k() {
            this.f22171a.f();
        }

        public void onCreate() {
        }

        public void onResume() {
            this.f22171a.e();
        }
    }

    private O() {
    }

    /* access modifiers changed from: private */
    public static final void i(O o10) {
        C17542s.j(o10, "this$0");
        o10.j();
        o10.k();
    }

    public static final C5221y l() {
        return f22160i.a();
    }

    public final void d() {
        int i10 = this.f22163b - 1;
        this.f22163b = i10;
        if (i10 == 0) {
            Handler handler = this.f22166e;
            C17542s.g(handler);
            handler.postDelayed(this.f22168g, 700);
        }
    }

    public final void e() {
        int i10 = this.f22163b + 1;
        this.f22163b = i10;
        if (i10 != 1) {
            return;
        }
        if (this.f22164c) {
            this.f22167f.l(r.a.ON_RESUME);
            this.f22164c = false;
            return;
        }
        Handler handler = this.f22166e;
        C17542s.g(handler);
        handler.removeCallbacks(this.f22168g);
    }

    public final void f() {
        int i10 = this.f22162a + 1;
        this.f22162a = i10;
        if (i10 == 1 && this.f22165d) {
            this.f22167f.l(r.a.ON_START);
            this.f22165d = false;
        }
    }

    public final void g() {
        this.f22162a--;
        k();
    }

    public r getLifecycle() {
        return this.f22167f;
    }

    public final void h(Context context) {
        C17542s.j(context, "context");
        this.f22166e = new Handler();
        this.f22167f.l(r.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C17542s.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c(this));
    }

    public final void j() {
        if (this.f22163b == 0) {
            this.f22164c = true;
            this.f22167f.l(r.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f22162a == 0 && this.f22164c) {
            this.f22167f.l(r.a.ON_STOP);
            this.f22165d = true;
        }
    }
}
