package JI;

import TI.C16494B;
import TI.k;
import YH.C16870n;
import YH.C16877v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;

public final class t extends y implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Constructor<?> f135801a;

    public t(Constructor<?> constructor) {
        C17542s.j(constructor, "member");
        this.f135801a = constructor;
    }

    /* renamed from: U */
    public Constructor<?> S() {
        return this.f135801a;
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
        C17542s.g(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return C16877v.n();
        }
        Class<?> declaringClass = S().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C16870n.u(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = S().getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                C17542s.g(parameterAnnotations);
                parameterAnnotations = (Annotation[][]) C16870n.u(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            C17542s.g(genericParameterTypes);
            C17542s.g(parameterAnnotations);
            return T(genericParameterTypes, parameterAnnotations, S().isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + S());
    }
}
