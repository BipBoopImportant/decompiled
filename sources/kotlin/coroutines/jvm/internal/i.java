package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/jvm/internal/i;", "", "<init>", "()V", "Lkotlin/coroutines/jvm/internal/a;", "continuation", "Lkotlin/coroutines/jvm/internal/i$a;", "a", "(Lkotlin/coroutines/jvm/internal/a;)Lkotlin/coroutines/jvm/internal/i$a;", "", "b", "(Lkotlin/coroutines/jvm/internal/a;)Ljava/lang/String;", "Lkotlin/coroutines/jvm/internal/i$a;", "notOnJava9", "c", "cache", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f144334a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final a f144335b = new a((Method) null, (Method) null, (Method) null);

    /* renamed from: c  reason: collision with root package name */
    private static a f144336c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lkotlin/coroutines/jvm/internal/i$a;", "", "Ljava/lang/reflect/Method;", "getModuleMethod", "getDescriptorMethod", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "a", "Ljava/lang/reflect/Method;", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f144337a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f144338b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f144339c;

        public a(Method method, Method method2, Method method3) {
            this.f144337a = method;
            this.f144338b = method2;
            this.f144339c = method3;
        }
    }

    private i() {
    }

    private final a a(a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", (Class[]) null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class[]) null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class[]) null));
            f144336c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f144335b;
            f144336c = aVar3;
            return aVar3;
        }
    }

    public final String b(a aVar) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        C17542s.j(aVar, "continuation");
        a aVar2 = f144336c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f144335b || (method = aVar2.f144337a) == null || (invoke = method.invoke(aVar.getClass(), (Object[]) null)) == null || (method2 = aVar2.f144338b) == null || (invoke2 = method2.invoke(invoke, (Object[]) null)) == null) {
            return null;
        }
        Method method3 = aVar2.f144339c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, (Object[]) null) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
