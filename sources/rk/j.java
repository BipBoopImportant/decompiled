package RK;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\nB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0013"}, d2 = {"LRK/j;", "", "Ljava/lang/reflect/Method;", "getMethod", "openMethod", "warnIfOpenMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "", "closer", "a", "(Ljava/lang/String;)Ljava/lang/Object;", "closeGuardInstance", "", "b", "(Ljava/lang/Object;)Z", "Ljava/lang/reflect/Method;", "c", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f138045d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Method f138046a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f138047b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f138048c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LRK/j$a;", "", "<init>", "()V", "LRK/j;", "a", "()LRK/j;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", (Class[]) null);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", (Class[]) null);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new j(method3, method, method2);
        }

        private a() {
        }
    }

    public j(Method method, Method method2, Method method3) {
        this.f138046a = method;
        this.f138047b = method2;
        this.f138048c = method3;
    }

    public final Object a(String str) {
        C17542s.j(str, "closer");
        Method method = this.f138046a;
        if (method != null) {
            try {
                Object invoke = method.invoke((Object) null, (Object[]) null);
                Method method2 = this.f138047b;
                C17542s.g(method2);
                method2.invoke(invoke, new Object[]{str});
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj != null) {
            try {
                Method method = this.f138048c;
                C17542s.g(method);
                method.invoke(obj, (Object[]) null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
