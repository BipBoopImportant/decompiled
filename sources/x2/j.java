package x2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w2.C6211e;

class j extends n {

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f31848b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor<?> f31849c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f31850d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Method f31851e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f31852f = false;

    j() {
    }

    private static boolean h(Object obj, String str, int i10, boolean z10) {
        j();
        try {
            return ((Boolean) f31850d.invoke(obj, new Object[]{str, Integer.valueOf(i10), Boolean.valueOf(z10)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface i(Object obj) {
        j();
        try {
            Object newInstance = Array.newInstance(f31848b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f31851e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void j() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f31852f) {
            f31852f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e10) {
                Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
                method2 = null;
                cls = null;
                method = null;
            }
            f31849c = constructor;
            f31848b = cls;
            f31850d = method;
            f31851e = method2;
        }
    }

    private static Object k() {
        j();
        try {
            return f31849c.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Typeface a(Context context, C6211e.c cVar, Resources resources, int i10) {
        Object k10 = k();
        C6211e.d[] a10 = cVar.a();
        int length = a10.length;
        int i11 = 0;
        while (i11 < length) {
            C6211e.d dVar = a10[i11];
            File d10 = o.d(context);
            if (d10 == null) {
                return null;
            }
            try {
                if (!o.b(d10, resources, dVar.b())) {
                    d10.delete();
                    return null;
                } else if (!h(k10, d10.getPath(), dVar.e(), dVar.f())) {
                    return null;
                } else {
                    d10.delete();
                    i11++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                d10.delete();
            }
        }
        return i(k10);
    }
}
