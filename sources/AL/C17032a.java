package aL;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* renamed from: aL.a  reason: case insensitive filesystem */
public class C17032a {
    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C17032a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (c()) {
                if (collection.contains(str + ":dev")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private static boolean c() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
