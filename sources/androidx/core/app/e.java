package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

final class e {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f20957a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f20958b = b();

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f20959c = f();

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f20960d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f20961e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f20962f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f20963g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f20964a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f20965b;

        a(d dVar, Object obj) {
            this.f20964a = dVar;
            this.f20965b = obj;
        }

        public void run() {
            this.f20964a.f20970a = this.f20965b;
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f20966a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f20967b;

        b(Application application, d dVar) {
            this.f20966a = application;
            this.f20967b = dVar;
        }

        public void run() {
            this.f20966a.unregisterActivityLifecycleCallbacks(this.f20967b);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f20968a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f20969b;

        c(Object obj, Object obj2) {
            this.f20968a = obj;
            this.f20969b = obj2;
        }

        public void run() {
            try {
                Method method = e.f20960d;
                if (method != null) {
                    method.invoke(this.f20968a, new Object[]{this.f20969b, Boolean.FALSE, "AppCompat recreation"});
                } else {
                    e.f20961e.invoke(this.f20968a, new Object[]{this.f20969b, Boolean.FALSE});
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        Object f20970a;

        /* renamed from: b  reason: collision with root package name */
        private Activity f20971b;

        /* renamed from: c  reason: collision with root package name */
        private final int f20972c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f20973d = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f20974e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f20975f = false;

        d(Activity activity) {
            this.f20971b = activity;
            this.f20972c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f20971b == activity) {
                this.f20971b = null;
                this.f20974e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f20974e && !this.f20975f && !this.f20973d && e.h(this.f20970a, this.f20972c, activity)) {
                this.f20975f = true;
                this.f20970a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f20971b == activity) {
                this.f20973d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f20957a = a10;
        f20960d = d(a10);
        f20961e = c(a10);
        f20962f = e(a10);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            Class<IBinder> cls2 = IBinder.class;
            Class<List> cls3 = List.class;
            Class<List> cls4 = List.class;
            try {
                Class cls5 = Integer.TYPE;
                Class cls6 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{cls2, cls3, cls4, cls5, cls6, Configuration.class, Configuration.class, cls6, cls6});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f20959c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i10) {
                    f20963g.postAtFrontOfQueue(new c(f20958b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        Application application;
        d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f20962f == null) {
            return false;
        } else {
            if (f20961e == null && f20960d == null) {
                return false;
            }
            try {
                Object obj2 = f20959c.get(activity);
                if (obj2 == null || (obj = f20958b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f20963g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f20962f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
