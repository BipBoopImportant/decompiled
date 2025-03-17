package androidx.fragment.app;

import androidx.fragment.app.C5187o;
import j0.b0;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.fragment.app.x  reason: case insensitive filesystem */
public class C5195x {
    private static final b0<ClassLoader, b0<String, Class<?>>> sClassCacheMap = new b0<>();

    static boolean isFragmentClass(ClassLoader classLoader, String str) {
        try {
            return C5187o.class.isAssignableFrom(loadClass(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> loadClass(ClassLoader classLoader, String str) {
        b0<ClassLoader, b0<String, Class<?>>> b0Var = sClassCacheMap;
        b0 b0Var2 = b0Var.get(classLoader);
        if (b0Var2 == null) {
            b0Var2 = new b0();
            b0Var.put(classLoader, b0Var2);
        }
        Class<?> cls = (Class) b0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        b0Var2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends C5187o> loadFragmentClass(ClassLoader classLoader, String str) {
        try {
            return loadClass(classLoader, str);
        } catch (ClassNotFoundException e10) {
            throw new C5187o.l("Unable to instantiate fragment " + str + ": make sure class name exists", e10);
        } catch (ClassCastException e11) {
            throw new C5187o.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e11);
        }
    }

    public C5187o instantiate(ClassLoader classLoader, String str) {
        try {
            return (C5187o) loadFragmentClass(classLoader, str).getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (InstantiationException e10) {
            throw new C5187o.l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (IllegalAccessException e11) {
            throw new C5187o.l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new C5187o.l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new C5187o.l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }
}
