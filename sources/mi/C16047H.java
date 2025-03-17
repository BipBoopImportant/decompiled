package MI;

import CJ.C15519a;
import HJ.C15854t;
import cJ.C17065b;
import cJ.C17066c;
import kotlin.jvm.internal.C17542s;

/* renamed from: MI.H  reason: case insensitive filesystem */
public final class C16047H {

    /* renamed from: a  reason: collision with root package name */
    public static final C16047H f136284a = new C16047H();

    /* renamed from: b  reason: collision with root package name */
    public static final C17066c f136285b;

    /* renamed from: c  reason: collision with root package name */
    public static final C17065b f136286c;

    /* renamed from: d  reason: collision with root package name */
    private static final C17065b f136287d;

    /* renamed from: e  reason: collision with root package name */
    private static final C17065b f136288e;

    static {
        C17066c cVar = new C17066c("kotlin.jvm.JvmField");
        f136285b = cVar;
        C17065b.a aVar = C17065b.f141241d;
        f136286c = aVar.c(cVar);
        f136287d = aVar.c(new C17066c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f136288e = C17065b.a.b(aVar, "kotlin/jvm/internal/RepeatableContainer", false, 2, (Object) null);
    }

    private C16047H() {
    }

    public static final String b(String str) {
        C17542s.j(str, "propertyName");
        if (f(str)) {
            return str;
        }
        return "get" + C15519a.a(str);
    }

    public static final boolean c(String str) {
        C17542s.j(str, "name");
        return C15854t.W(str, "get", false, 2, (Object) null) || C15854t.W(str, "is", false, 2, (Object) null);
    }

    public static final boolean d(String str) {
        C17542s.j(str, "name");
        return C15854t.W(str, "set", false, 2, (Object) null);
    }

    public static final String e(String str) {
        String str2;
        C17542s.j(str, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (f(str)) {
            str2 = str.substring(2);
            C17542s.i(str2, "substring(...)");
        } else {
            str2 = C15519a.a(str);
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public static final boolean f(String str) {
        C17542s.j(str, "name");
        if (!C15854t.W(str, "is", false, 2, (Object) null) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        return C17542s.l(97, charAt) > 0 || C17542s.l(charAt, 122) > 0;
    }

    public final C17065b a() {
        return f136288e;
    }
}
