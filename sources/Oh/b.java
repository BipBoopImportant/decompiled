package OH;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;
import uI.C18055d;
import uI.C18068q;
import uI.C18075x;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u001a/\u0010\b\u001a\u00020\u00072\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\r\u001a\u00020\f*\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\r\u0010\u000e\"\u001f\u0010\u0013\u001a\u00060\u0000j\u0002`\u0001*\u00020\u00058F¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010*\n\u0010\u0014\"\u00020\u00002\u00020\u0000¨\u0006\u0015"}, d2 = {"Ljava/lang/reflect/Type;", "Lio/ktor/util/reflect/Type;", "reifiedType", "LuI/d;", "kClass", "LuI/q;", "kType", "LOH/a;", "c", "(Ljava/lang/reflect/Type;LuI/d;LuI/q;)LOH/a;", "", "type", "", "b", "(Ljava/lang/Object;LuI/d;)Z", "a", "(LuI/q;)Ljava/lang/reflect/Type;", "getPlatformType$annotations", "(LuI/q;)V", "platformType", "Type", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final Type a(C18068q qVar) {
        C17542s.j(qVar, "<this>");
        return C18075x.f(qVar);
    }

    public static final boolean b(Object obj, C18055d<?> dVar) {
        C17542s.j(obj, "<this>");
        C17542s.j(dVar, "type");
        return C17603a.b(dVar).isInstance(obj);
    }

    public static final C16158a c(Type type, C18055d<?> dVar, C18068q qVar) {
        C17542s.j(type, "reifiedType");
        C17542s.j(dVar, "kClass");
        return new C16158a(dVar, type, qVar);
    }
}
