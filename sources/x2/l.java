package x2;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class l extends k {
    /* access modifiers changed from: protected */
    public Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f31853g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f31859m.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* access modifiers changed from: protected */
    public Method t(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
