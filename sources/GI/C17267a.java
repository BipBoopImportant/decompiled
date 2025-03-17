package gI;

import YH.C16870n;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rI.C17852b;
import rI.C17853c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LgI/a;", "", "<init>", "()V", "", "cause", "exception", "LXH/N;", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "LrI/c;", "b", "()LrI/c;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gI.a  reason: case insensitive filesystem */
public class C17267a {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"LgI/a$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "addSuppressed", "c", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gI.a$a  reason: collision with other inner class name */
    private static final class C3495a {

        /* renamed from: a  reason: collision with root package name */
        public static final C3495a f143292a = new C3495a();

        /* renamed from: b  reason: collision with root package name */
        public static final Method f143293b;

        /* renamed from: c  reason: collision with root package name */
        public static final Method f143294c;

        static {
            Method method;
            Method method2;
            Class<Throwable> cls = Throwable.class;
            Method[] methods = cls.getMethods();
            C17542s.g(methods);
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (C17542s.e(method2.getName(), "addSuppressed")) {
                    Class[] parameterTypes = method2.getParameterTypes();
                    C17542s.i(parameterTypes, "getParameterTypes(...)");
                    if (C17542s.e(C16870n.O0(parameterTypes), cls)) {
                        break;
                    }
                }
                i11++;
            }
            f143293b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (C17542s.e(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f143294c = method;
        }

        private C3495a() {
        }
    }

    public void a(Throwable th2, Throwable th3) {
        C17542s.j(th2, "cause");
        C17542s.j(th3, "exception");
        Method method = C3495a.f143293b;
        if (method != null) {
            method.invoke(th2, new Object[]{th3});
        }
    }

    public C17853c b() {
        return new C17852b();
    }
}
