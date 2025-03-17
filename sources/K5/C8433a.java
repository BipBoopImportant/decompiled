package k5;

import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;
import nI.C17631a;
import uI.C18055d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00072\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u0007*\u00020\u000f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u0007*\u00020\u000f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u00020\u0007*\u00020\u000f8@X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lk5/a;", "", "<init>", "()V", "", "errorMessage", "Lkotlin/Function0;", "", "block", "e", "(Ljava/lang/String;LnI/a;)Z", "Ljava/lang/Class;", "classLoader", "a", "(LnI/a;)Z", "Ljava/lang/reflect/Method;", "LuI/d;", "clazz", "c", "(Ljava/lang/reflect/Method;LuI/d;)Z", "b", "(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z", "d", "(Ljava/lang/reflect/Method;)Z", "isPublic", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: k5.a  reason: case insensitive filesystem */
public final class C8433a {

    /* renamed from: a  reason: collision with root package name */
    public static final C8433a f54146a = new C8433a();

    private C8433a() {
    }

    public static final boolean e(String str, C17631a<Boolean> aVar) {
        C17542s.j(aVar, "block");
        try {
            boolean booleanValue = aVar.invoke().booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ClassNotFound: ");
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            Log.e("ReflectionGuard", sb2.toString());
            return false;
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("NoSuchMethod: ");
            if (str == null) {
                str = "";
            }
            sb3.append(str);
            Log.e("ReflectionGuard", sb3.toString());
            return false;
        }
    }

    public final boolean a(C17631a<? extends Class<?>> aVar) {
        C17542s.j(aVar, "classLoader");
        try {
            aVar.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean b(Method method, Class<?> cls) {
        C17542s.j(method, "<this>");
        C17542s.j(cls, "clazz");
        return method.getReturnType().equals(cls);
    }

    public final boolean c(Method method, C18055d<?> dVar) {
        C17542s.j(method, "<this>");
        C17542s.j(dVar, "clazz");
        return b(method, C17603a.b(dVar));
    }

    public final boolean d(Method method) {
        C17542s.j(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }
}
