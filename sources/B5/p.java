package b5;

import aL.C17032a;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

public class p {

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final t f45486a = new t(p.d().getWebkitToCompatConverter());
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        static final q f45487a = p.a();
    }

    static q a() {
        try {
            return new r((WebViewProviderFactoryBoundaryInterface) C17032a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        } catch (ClassNotFoundException unused) {
            return new C7068j();
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", (Class[]) null).invoke((Object) null, (Object[]) null);
    }

    public static t c() {
        return a.f45486a;
    }

    public static q d() {
        return b.f45487a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? C7065g.a() : f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", (Class[]) null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, (Object[]) null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
