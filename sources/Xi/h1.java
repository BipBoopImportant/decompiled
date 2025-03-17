package xI;

import JI.C15965f;
import YH.C16870n;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/lang/reflect/Method;", "", "d", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "signature", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h1 {
    /* access modifiers changed from: private */
    public static final CharSequence a(Class cls) {
        C17542s.g(cls);
        return C15965f.f(cls);
    }

    /* access modifiers changed from: private */
    public static final String d(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        C17542s.i(parameterTypes, "getParameterTypes(...)");
        sb2.append(C16870n.C0(parameterTypes, "", "(", ")", 0, (CharSequence) null, g1.f152411a, 24, (Object) null));
        Class<?> returnType = method.getReturnType();
        C17542s.i(returnType, "getReturnType(...)");
        sb2.append(C15965f.f(returnType));
        return sb2.toString();
    }
}
