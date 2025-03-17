package c8;

import E8.c;
import H2.j;
import YH.g0;
import a9.E4;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.deactivationdialog.DeactivationActivity;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.developer.DeveloperActivationActivity;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.OverlayService;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.SettingsActivity;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.tutorial.ClientModeTutorialActivity;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

/* renamed from: c8.a  reason: case insensitive filesystem */
public final class C7102a implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final E4 f45762a;

    /* renamed from: b  reason: collision with root package name */
    public final D8.c f45763b;

    /* renamed from: c  reason: collision with root package name */
    public final A8.b f45764c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f45765d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f45766e;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lc8/a$a;", "Landroidx/lifecycle/h;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "library_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: c8.a$a  reason: collision with other inner class name */
    public final class C0802a implements C5205h, Application.ActivityLifecycleCallbacks {
        public C0802a() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C17542s.j(activity, "activity");
        }

        public final void onActivityDestroyed(Activity activity) {
            C17542s.j(activity, "activity");
        }

        public final void onActivityPaused(Activity activity) {
            C17542s.j(activity, "activity");
        }

        public final void onActivityResumed(Activity activity) {
            C17542s.j(activity, "activity");
            C7102a.this.a();
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C17542s.j(activity, "activity");
            C17542s.j(bundle, "outState");
        }

        public final void onActivityStarted(Activity activity) {
            C17542s.j(activity, "activity");
        }

        public final void onActivityStopped(Activity activity) {
            C17542s.j(activity, "activity");
        }

        public final void onPause(C5221y yVar) {
            C17542s.j(yVar, "owner");
            C7102a aVar = C7102a.this;
            if (aVar.f45765d) {
                E4 e42 = aVar.f45762a;
                if (e42.f41985f == 1) {
                    e42.f41980a.stopService(new Intent(e42.f41980a, OverlayService.class));
                }
                C7102a.this.f45766e = false;
            }
        }
    }

    /* renamed from: c8.a$b */
    public static final class b implements j<Activity> {

        /* renamed from: a  reason: collision with root package name */
        public static final Set<Class<?>> f45768a = g0.h(ClientModeTutorialActivity.class, SettingsActivity.class, DeactivationActivity.class, DeveloperActivationActivity.class);

        public final boolean test(Object obj) {
            Activity activity = (Activity) obj;
            C17542s.j(activity, "activity");
            return f45768a.contains(activity.getClass());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003f, code lost:
        r0 = r0.l();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7102a(a9.E4 r3, android.app.Application r4, androidx.lifecycle.C5221y r5, a9.C6783a1 r6) {
        /*
            r2 = this;
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "application"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "lifecycleOwner"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "liveActivityProvider"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            r2.<init>()
            r2.f45762a = r3
            D8.c r3 = new D8.c
            java.lang.String r0 = "ClientModeManagerImpl"
            r3.<init>(r0)
            r2.f45763b = r3
            u8.a$a r0 = u8.C8886a.f56874d
            u8.a r1 = r0.b(r4)
            A8.b r1 = r1.c()
            r2.f45764c = r1
            u8.a r0 = r0.b(r4)
            E8.c r0 = r0.f()
            r0.n(r2)
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r0 = r1.b()
            if (r0 == 0) goto L_0x004a
            com.contentsquare.android.core.features.config.model.JsonConfig$InAppConfig r0 = r0.l()
            if (r0 == 0) goto L_0x004a
            boolean r0 = r0.a()
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            r2.f45765d = r0
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "Contentsquare in-app features configuration is enabled"
        L_0x0051:
            r3.j(r0)
            goto L_0x0058
        L_0x0055:
            java.lang.String r0 = "Contentsquare in-app features configuration is disabled"
            goto L_0x0051
        L_0x0058:
            c8.a$a r3 = new c8.a$a
            r3.<init>()
            androidx.lifecycle.r r5 = r5.getLifecycle()
            r5.c(r3)
            r4.registerActivityLifecycleCallbacks(r3)
            java.lang.ref.WeakReference<android.app.Activity> r3 = r6.f42433a
            java.lang.Object r3 = r3.get()
            android.app.Activity r3 = (android.app.Activity) r3
            if (r3 == 0) goto L_0x0079
            java.lang.String r4 = "activity"
            kotlin.jvm.internal.C17542s.j(r3, r4)
            r2.a()
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.C7102a.<init>(a9.E4, android.app.Application, androidx.lifecycle.y, a9.a1):void");
    }

    public final void a() {
        if (this.f45765d && !this.f45766e) {
            this.f45766e = true;
            E4 e42 = this.f45762a;
            int i10 = e42.f41985f;
            if (i10 == 0) {
                e42.f41985f = 2;
                if (!e42.f41982c.b(E8.b.CLIENT_MODE_ACTIVATION_STATE, false)) {
                    return;
                }
                if (e42.f41982c.b(E8.b.CLIENT_MODE_TUTORIAL, true)) {
                    int i11 = ClientModeTutorialActivity.f46673y;
                    Application application = e42.f41980a;
                    C17542s.j(application, "source");
                    Intent intent = new Intent(application, ClientModeTutorialActivity.class);
                    intent.addFlags(268435456);
                    application.startActivity(intent);
                    return;
                }
                e42.a();
            } else if (i10 == 1) {
                e42.a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2 = r2.l();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(E8.b r2) {
        /*
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            E8.b r0 = E8.b.RAW_CONFIGURATION_AS_JSON
            if (r2 != r0) goto L_0x0031
            A8.b r2 = r1.f45764c
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r2 = r2.b()
            if (r2 == 0) goto L_0x001c
            com.contentsquare.android.core.features.config.model.JsonConfig$InAppConfig r2 = r2.l()
            if (r2 == 0) goto L_0x001c
            boolean r2 = r2.a()
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            r1.f45765d = r2
            if (r2 == 0) goto L_0x0029
            D8.c r2 = r1.f45763b
            java.lang.String r0 = "Contentsquare in-app features configuration is enabled"
        L_0x0025:
            r2.j(r0)
            goto L_0x002e
        L_0x0029:
            D8.c r2 = r1.f45763b
            java.lang.String r0 = "Contentsquare in-app features configuration is disabled"
            goto L_0x0025
        L_0x002e:
            r1.a()
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.C7102a.o(E8.b):void");
    }
}
