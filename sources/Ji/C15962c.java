package JI;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: JI.c  reason: case insensitive filesystem */
final class C15962c {

    /* renamed from: a  reason: collision with root package name */
    public static final C15962c f135770a = new C15962c();

    /* renamed from: b  reason: collision with root package name */
    private static a f135771b;

    /* renamed from: JI.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Method f135772a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f135773b;

        public a(Method method, Method method2) {
            this.f135772a = method;
            this.f135773b = method2;
        }

        public final Method a() {
            return this.f135773b;
        }

        public final Method b() {
            return this.f135772a;
        }
    }

    private C15962c() {
    }

    public final a a(Member member) {
        C17542s.j(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", (Class[]) null), C15965f.j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", (Class[]) null));
        } catch (NoSuchMethodException unused) {
            return new a((Method) null, (Method) null);
        }
    }

    public final List<String> b(Member member) {
        Method a10;
        C17542s.j(member, "member");
        a aVar = f135771b;
        if (aVar == null) {
            synchronized (this) {
                aVar = f135771b;
                if (aVar == null) {
                    aVar = f135770a.a(member);
                    f135771b = aVar;
                }
            }
        }
        Method b10 = aVar.b();
        if (b10 == null || (a10 = aVar.a()) == null) {
            return null;
        }
        Object invoke = b10.invoke(member, (Object[]) null);
        C17542s.h(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object invoke2 : objArr) {
            Object invoke3 = a10.invoke(invoke2, (Object[]) null);
            C17542s.h(invoke3, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) invoke3);
        }
        return arrayList;
    }
}
