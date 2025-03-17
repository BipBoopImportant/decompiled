package S7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f39923a;

    public d(Context context) {
        this.f39923a = context;
    }

    private ApplicationInfo a() {
        return this.f39923a.getPackageManager().getApplicationInfo(this.f39923a.getPackageName(), 128);
    }

    private static b c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (InstantiationException e10) {
                d(cls, e10);
            } catch (IllegalAccessException e11) {
                d(cls, e11);
            } catch (NoSuchMethodException e12) {
                d(cls, e12);
            } catch (InvocationTargetException e13) {
                d(cls, e13);
            }
            if (obj instanceof b) {
                return (b) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    private static void d(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List<b> b() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo a10 = a();
            if (a10 != null) {
                if (a10.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + a10.metaData);
                    }
                    for (String next : a10.metaData.keySet()) {
                        if ("GlideModule".equals(a10.metaData.get(next))) {
                            arrayList.add(c(next));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + next);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                    return arrayList;
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e10) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e10);
            }
        }
    }
}
