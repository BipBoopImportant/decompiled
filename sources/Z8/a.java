package Z8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LZ8/a;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroidx/lifecycle/h;", "a", "b", "c", "library_release"}, k = 1, mv = {1, 8, 0})
public final class a implements Application.ActivityLifecycleCallbacks, C5205h {

    /* renamed from: d  reason: collision with root package name */
    public static final D8.c f41416d = new D8.c("ReactNativeProcessLifecycle");

    /* renamed from: a  reason: collision with root package name */
    public final c f41417a;

    /* renamed from: b  reason: collision with root package name */
    public final b f41418b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f41419c = new ArrayList();

    /* renamed from: Z8.a$a  reason: collision with other inner class name */
    public static final class C0729a {

        /* renamed from: a  reason: collision with root package name */
        public final Application f41420a;

        public C0729a(Application application) {
            C17542s.j(application, "application");
            this.f41420a = application;
        }
    }

    public static final class b {
    }

    public interface c {
        void a();
    }

    public a(Application application, C5221y yVar, c cVar, b bVar) {
        C17542s.j(application, "application");
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(cVar, "listener");
        C17542s.j(bVar, "reactNativeActivity");
        this.f41417a = cVar;
        this.f41418b = bVar;
        application.registerActivityLifecycleCallbacks(this);
        yVar.getLifecycle().c(this);
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

    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        C17542s.j(activity, "activity");
    }

    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        C17542s.j(activity, "activity");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResumed(android.app.Activity r7) {
        /*
            r6 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.util.ArrayList r1 = r6.f41419c
            int r1 = r1.size()
            r2 = 2
            if (r1 >= r2) goto L_0x007b
            java.util.ArrayList r1 = r6.f41419c
            Z8.a$b r3 = r6.f41418b
            r3.getClass()
            kotlin.jvm.internal.C17542s.j(r7, r0)
            r0 = 1
            r3 = 0
            java.lang.Class r7 = r7.getClass()     // Catch:{ Exception -> 0x003d }
            java.lang.reflect.Type r7 = r7.getGenericSuperclass()     // Catch:{ Exception -> 0x003d }
            if (r7 == 0) goto L_0x0041
            java.lang.String r4 = "class com.facebook.react.ReactActivity"
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x003d }
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)     // Catch:{ Exception -> 0x003d }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = "class io.flutter.embedding.android.FlutterActivity"
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x003d }
            boolean r7 = kotlin.jvm.internal.C17542s.e(r4, r7)     // Catch:{ Exception -> 0x003d }
            if (r7 == 0) goto L_0x0041
            goto L_0x003f
        L_0x003d:
            r7 = move-exception
            goto L_0x0043
        L_0x003f:
            r7 = r0
            goto L_0x004b
        L_0x0041:
            r7 = r3
            goto L_0x004b
        L_0x0043:
            D8.c r4 = f41416d
            java.lang.String r5 = "Cannot get generic super class"
            a9.H1.a(r4, r5, r7)
            goto L_0x0041
        L_0x004b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r1.add(r7)
            java.util.ArrayList r7 = r6.f41419c
            int r7 = r7.size()
            if (r7 != r2) goto L_0x007b
            java.util.ArrayList r7 = r6.f41419c
            java.lang.Object r7 = r7.get(r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x007b
            java.util.ArrayList r7 = r6.f41419c
            java.lang.Object r7 = r7.get(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x007b
            Z8.a$c r7 = r6.f41417a
            r7.a()
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z8.a.onActivityResumed(android.app.Activity):void");
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
        this.f41419c.clear();
    }

    public final void onResume(C5221y yVar) {
        C17542s.j(yVar, "owner");
        if (this.f41419c.size() < 2) {
            this.f41419c.add(Boolean.TRUE);
            if (this.f41419c.size() == 2 && ((Boolean) this.f41419c.get(0)).booleanValue() && ((Boolean) this.f41419c.get(1)).booleanValue()) {
                this.f41417a.a();
            }
        }
    }
}
