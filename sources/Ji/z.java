package JI;

import JI.E;
import TI.C16494B;
import TI.C16498b;
import TI.r;
import cJ.C17069f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;

public final class z extends y implements r {

    /* renamed from: a  reason: collision with root package name */
    private final Method f135805a;

    public z(Method method) {
        C17542s.j(method, "member");
        this.f135805a = method;
    }

    public boolean O() {
        return p() != null;
    }

    /* renamed from: U */
    public Method S() {
        return this.f135805a;
    }

    /* renamed from: V */
    public E getReturnType() {
        E.a aVar = E.f135751a;
        Type genericReturnType = S().getGenericReturnType();
        C17542s.i(genericReturnType, "getGenericReturnType(...)");
        return aVar.a(genericReturnType);
    }

    public List<F> getTypeParameters() {
        TypeVariable[] typeParameters = S().getTypeParameters();
        C17542s.i(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable f10 : typeParameters) {
            arrayList.add(new F(f10));
        }
        return arrayList;
    }

    public List<C16494B> j() {
        Type[] genericParameterTypes = S().getGenericParameterTypes();
        C17542s.i(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = S().getParameterAnnotations();
        C17542s.i(parameterAnnotations, "getParameterAnnotations(...)");
        return T(genericParameterTypes, parameterAnnotations, S().isVarArgs());
    }

    public C16498b p() {
        Object defaultValue = S().getDefaultValue();
        if (defaultValue != null) {
            return C15967h.f135781b.a(defaultValue, (C17069f) null);
        }
        return null;
    }
}
