package Kb;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mc.C10036b;

/* renamed from: Kb.f  reason: case insensitive filesystem */
public final class C9131f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f61439a;

    /* renamed from: b  reason: collision with root package name */
    private final c<T> f61440b;

    /* renamed from: Kb.f$b */
    private static class b implements c<Context> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<? extends Service> f61441a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f61441a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f61441a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List<String> a(Context context) {
            Bundle b10 = b(context);
            if (b10 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String next : b10.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b10.get(next)) && next.startsWith("com.google.firebase.components:")) {
                    arrayList.add(next.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.f61441a = cls;
        }
    }

    /* renamed from: Kb.f$c */
    interface c<T> {
        List<String> a(T t10);
    }

    C9131f(T t10, c<T> cVar) {
        this.f61439a = t10;
        this.f61440b = cVar;
    }

    public static C9131f<Context> c(Context context, Class<? extends Service> cls) {
        return new C9131f<>(context, new b(cls));
    }

    /* access modifiers changed from: private */
    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            }
            throw new v(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e10) {
            throw new v(String.format("Could not instantiate %s.", new Object[]{str}), e10);
        } catch (InstantiationException e11) {
            throw new v(String.format("Could not instantiate %s.", new Object[]{str}), e11);
        } catch (NoSuchMethodException e12) {
            throw new v(String.format("Could not instantiate %s", new Object[]{str}), e12);
        } catch (InvocationTargetException e13) {
            throw new v(String.format("Could not instantiate %s", new Object[]{str}), e13);
        }
    }

    public List<C10036b<ComponentRegistrar>> b() {
        ArrayList arrayList = new ArrayList();
        for (String eVar : this.f61440b.a(this.f61439a)) {
            arrayList.add(new C9130e(eVar));
        }
        return arrayList;
    }
}
