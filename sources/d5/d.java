package d5;

import XH.C16807N;
import android.annotation.SuppressLint;
import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import uI.C18055d;
import uI.C18056e;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0002\u000f\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u000f\u001a\u00020\u0001\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\bJ[\u0010\u0019\u001a\u00020\u0018\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001c"}, d2 = {"Ld5/d;", "", "Ljava/lang/ClassLoader;", "loader", "<init>", "(Ljava/lang/ClassLoader;)V", "Ljava/lang/Class;", "d", "()Ljava/lang/Class;", "T", "LuI/d;", "clazz", "Lkotlin/Function1;", "LXH/N;", "consumer", "a", "(LuI/d;LnI/l;)Ljava/lang/Object;", "b", "obj", "", "addMethodName", "removeMethodName", "Landroid/app/Activity;", "activity", "Ld5/d$b;", "c", "(Ljava/lang/Object;LuI/d;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;LnI/l;)Ld5/d$b;", "Ljava/lang/ClassLoader;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanUncheckedReflection"})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final ClassLoader f50730a;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u000e*\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0012\u001a\u00020\u000e*\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J%\u0010\u0013\u001a\u00020\u000e*\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J2\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u000b2\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001d¨\u0006\u001e"}, d2 = {"Ld5/d$a;", "", "T", "Ljava/lang/reflect/InvocationHandler;", "LuI/d;", "clazz", "Lkotlin/Function1;", "LXH/N;", "consumer", "<init>", "(LuI/d;LnI/l;)V", "Ljava/lang/reflect/Method;", "", "args", "", "c", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z", "d", "b", "e", "obj", "method", "parameters", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "parameter", "a", "(Ljava/lang/Object;)V", "LuI/d;", "LnI/l;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<T> implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final C18055d<T> f50731a;

        /* renamed from: b  reason: collision with root package name */
        private final C17642l<T, C16807N> f50732b;

        public a(C18055d<T> dVar, C17642l<? super T, C16807N> lVar) {
            C17542s.j(dVar, "clazz");
            C17542s.j(lVar, "consumer");
            this.f50731a = dVar;
            this.f50732b = lVar;
        }

        private final boolean b(Method method, Object[] objArr) {
            return C17542s.e(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        private final boolean c(Method method, Object[] objArr) {
            return C17542s.e(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        private final boolean d(Method method, Object[] objArr) {
            return C17542s.e(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        private final boolean e(Method method, Object[] objArr) {
            return C17542s.e(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        public final void a(T t10) {
            C17542s.j(t10, "parameter");
            this.f50732b.invoke(t10);
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C17542s.j(obj, "obj");
            C17542s.j(method, "method");
            Object obj2 = null;
            boolean z10 = false;
            if (b(method, objArr)) {
                C18055d<T> dVar = this.f50731a;
                if (objArr != null) {
                    obj2 = objArr[0];
                }
                a(C18056e.a(dVar, obj2));
                return C16807N.f139792a;
            } else if (c(method, objArr)) {
                if (objArr != null) {
                    obj2 = objArr[0];
                }
                if (obj == obj2) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            } else if (d(method, objArr)) {
                return Integer.valueOf(this.f50732b.hashCode());
            } else {
                if (e(method, objArr)) {
                    return this.f50732b.toString();
                }
                throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Ld5/d$b;", "", "LXH/N;", "b", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        void b();
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"d5/d$c", "Ld5/d$b;", "LXH/N;", "b", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f50733a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f50734b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f50735c;

        c(Method method, Object obj, Object obj2) {
            this.f50733a = method;
            this.f50734b = obj;
            this.f50735c = obj2;
        }

        public void b() {
            this.f50733a.invoke(this.f50734b, new Object[]{this.f50735c});
        }
    }

    public d(ClassLoader classLoader) {
        C17542s.j(classLoader, "loader");
        this.f50730a = classLoader;
    }

    private final <T> Object a(C18055d<T> dVar, C17642l<? super T, C16807N> lVar) {
        Object newProxyInstance = Proxy.newProxyInstance(this.f50730a, new Class[]{d()}, new a(dVar, lVar));
        C17542s.i(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return newProxyInstance;
    }

    private final Class<?> d() {
        Class<?> loadClass = this.f50730a.loadClass("java.util.function.Consumer");
        C17542s.i(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }

    public final Class<?> b() {
        try {
            return d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final <T> b c(Object obj, C18055d<T> dVar, String str, String str2, Activity activity, C17642l<? super T, C16807N> lVar) {
        C17542s.j(obj, "obj");
        C17542s.j(dVar, "clazz");
        C17542s.j(str, "addMethodName");
        C17542s.j(str2, "removeMethodName");
        C17542s.j(activity, "activity");
        C17542s.j(lVar, "consumer");
        Object a10 = a(dVar, lVar);
        obj.getClass().getMethod(str, new Class[]{Activity.class, d()}).invoke(obj, new Object[]{activity, a10});
        return new c(obj.getClass().getMethod(str2, new Class[]{d()}), obj, a10);
    }
}
