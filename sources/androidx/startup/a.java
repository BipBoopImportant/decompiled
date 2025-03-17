package androidx.startup;

import T4.b;
import T4.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f44475d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f44476e = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Map<Class<?>, Object> f44477a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Set<Class<? extends T4.a<?>>> f44478b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    final Context f44479c;

    a(Context context) {
        this.f44479c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends T4.a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (V4.a.h()) {
            try {
                V4.a.c(cls.getSimpleName());
            } catch (Throwable th2) {
                V4.a.f();
                throw th2;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f44477a.containsKey(cls)) {
                set.add(cls);
                T4.a aVar = (T4.a) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class<? extends T4.a<?>>> a10 = aVar.a();
                if (!a10.isEmpty()) {
                    for (Class next : a10) {
                        if (!this.f44477a.containsKey(next)) {
                            d(next, set);
                        }
                    }
                }
                t10 = aVar.b(this.f44479c);
                set.remove(cls);
                this.f44477a.put(cls, t10);
            } else {
                t10 = this.f44477a.get(cls);
            }
            V4.a.f();
            return t10;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    public static a e(Context context) {
        if (f44475d == null) {
            synchronized (f44476e) {
                try {
                    if (f44475d == null) {
                        f44475d = new a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f44475d;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        try {
            V4.a.c("Startup");
            b(this.f44479c.getPackageManager().getProviderInfo(new ComponentName(this.f44479c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            V4.a.f();
        } catch (PackageManager.NameNotFoundException e10) {
            throw new c((Throwable) e10);
        } catch (Throwable th2) {
            V4.a.f();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Bundle bundle) {
        String string = this.f44479c.getString(b.f40010a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (T4.a.class.isAssignableFrom(cls)) {
                            this.f44478b.add(cls);
                        }
                    }
                }
                for (Class<? extends T4.a<?>> d10 : this.f44478b) {
                    d(d10, hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c((Throwable) e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public <T> T c(Class<? extends T4.a<?>> cls) {
        T t10;
        synchronized (f44476e) {
            try {
                t10 = this.f44477a.get(cls);
                if (t10 == null) {
                    t10 = d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public <T> T f(Class<? extends T4.a<T>> cls) {
        return c(cls);
    }

    public boolean g(Class<? extends T4.a<?>> cls) {
        return this.f44478b.contains(cls);
    }
}
