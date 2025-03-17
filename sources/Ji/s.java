package JI;

import JI.E;
import TI.C16497a;
import TI.i;
import TI.j;
import TI.x;
import YH.C16877v;
import cJ.C17066c;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;

public final class s extends E implements j {

    /* renamed from: b  reason: collision with root package name */
    private final Type f135799b;

    /* renamed from: c  reason: collision with root package name */
    private final i f135800c;

    public s(Type type) {
        i iVar;
        C17542s.j(type, "reflectType");
        this.f135799b = type;
        Type R10 = R();
        if (R10 instanceof Class) {
            iVar = new q((Class) R10);
        } else if (R10 instanceof TypeVariable) {
            iVar = new F((TypeVariable) R10);
        } else if (R10 instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) R10).getRawType();
            C17542s.h(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            iVar = new q((Class) rawType);
        } else {
            throw new IllegalStateException("Not a classifier type (" + R10.getClass() + "): " + R10);
        }
        this.f135800c = iVar;
    }

    public List<x> A() {
        Iterable<Type> h10 = C15965f.h(R());
        E.a aVar = E.f135751a;
        ArrayList arrayList = new ArrayList(C16877v.y(h10, 10));
        for (Type a10 : h10) {
            arrayList.add(aVar.a(a10));
        }
        return arrayList;
    }

    public boolean E() {
        return false;
    }

    public String F() {
        return R().toString();
    }

    public String I() {
        throw new UnsupportedOperationException("Type not found: " + R());
    }

    public Type R() {
        return this.f135799b;
    }

    public i e() {
        return this.f135800c;
    }

    public Collection<C16497a> getAnnotations() {
        return C16877v.n();
    }

    public boolean t() {
        Type R10 = R();
        if (!(R10 instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) R10).getTypeParameters();
        C17542s.i(typeParameters, "getTypeParameters(...)");
        return !(typeParameters.length == 0);
    }

    public C16497a v(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return null;
    }
}
