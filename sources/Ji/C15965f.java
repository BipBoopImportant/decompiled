package JI;

import GJ.C15765h;
import GJ.C15768k;
import HJ.C15854t;
import XH.C16796C;
import XH.C16818i;
import YH.C16870n;
import YH.C16877v;
import YH.X;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import com.adjust.sdk.Constants;
import com.optimizely.ab.config.FeatureVariable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import mI.C17603a;
import nI.C17631a;
import nI.C17632b;
import nI.C17633c;
import nI.C17634d;
import nI.C17635e;
import nI.C17636f;
import nI.C17637g;
import nI.C17638h;
import nI.C17639i;
import nI.C17640j;
import nI.C17641k;
import nI.C17642l;
import nI.C17643m;
import nI.C17644n;
import nI.C17645o;
import nI.p;
import nI.q;
import nI.r;
import nI.s;
import nI.t;
import nI.u;
import nI.v;
import nI.w;
import uI.C18055d;

/* renamed from: JI.f  reason: case insensitive filesystem */
public final class C15965f {

    /* renamed from: a  reason: collision with root package name */
    private static final List<C18055d<? extends Object>> f135776a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f135777b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f135778c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Class<? extends C16818i<?>>, Integer> f135779d;

    static {
        int i10 = 0;
        List<C18055d<? extends Object>> q10 = C16877v.q(P.b(Boolean.TYPE), P.b(Byte.TYPE), P.b(Character.TYPE), P.b(Double.TYPE), P.b(Float.TYPE), P.b(Integer.TYPE), P.b(Long.TYPE), P.b(Short.TYPE));
        f135776a = q10;
        Iterable<C18055d> iterable = q10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C18055d dVar : iterable) {
            arrayList.add(C16796C.a(C17603a.c(dVar), C17603a.d(dVar)));
        }
        f135777b = X.v(arrayList);
        Iterable<C18055d> iterable2 = f135776a;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
        for (C18055d dVar2 : iterable2) {
            arrayList2.add(C16796C.a(C17603a.d(dVar2), C17603a.c(dVar2)));
        }
        f135778c = X.v(arrayList2);
        Iterable q11 = C16877v.q(C17631a.class, C17642l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, C17632b.class, C17633c.class, C17634d.class, C17635e.class, C17636f.class, C17637g.class, C17638h.class, C17639i.class, C17640j.class, C17641k.class, C17643m.class, C17644n.class, C17645o.class);
        ArrayList arrayList3 = new ArrayList(C16877v.y(q11, 10));
        for (Object next : q11) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            arrayList3.add(C16796C.a((Class) next, Integer.valueOf(i10)));
            i10 = i11;
        }
        f135779d = X.v(arrayList3);
    }

    /* access modifiers changed from: private */
    public static final ParameterizedType a(ParameterizedType parameterizedType) {
        C17542s.j(parameterizedType, "it");
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final C15765h b(ParameterizedType parameterizedType) {
        C17542s.j(parameterizedType, "it");
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C17542s.i(actualTypeArguments, "getActualTypeArguments(...)");
        return C16870n.U(actualTypeArguments);
    }

    public static final C17065b e(Class<?> cls) {
        C17065b e10;
        C17542s.j(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                C17542s.i(simpleName, "getSimpleName(...)");
                if (simpleName.length() != 0) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    if (!(declaringClass == null || (e10 = e(declaringClass)) == null)) {
                        C17069f v10 = C17069f.v(cls.getSimpleName());
                        C17542s.i(v10, "identifier(...)");
                        C17065b d10 = e10.d(v10);
                        if (d10 != null) {
                            return d10;
                        }
                    }
                    C17065b.a aVar = C17065b.f141241d;
                    String name = cls.getName();
                    C17542s.i(name, "getName(...)");
                    return aVar.c(new C17066c(name));
                }
            }
            String name2 = cls.getName();
            C17542s.i(name2, "getName(...)");
            C17066c cVar = new C17066c(name2);
            return new C17065b(cVar.d(), C17066c.f141245c.a(cVar.f()), true);
        } else {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
    }

    public static final String f(Class<?> cls) {
        C17542s.j(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals(FeatureVariable.DOUBLE_TYPE)) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name.equals(Constants.LONG)) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name.equals(FeatureVariable.BOOLEAN_TYPE)) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return "S";
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported primitive type: " + cls);
        } else if (cls.isArray()) {
            String name2 = cls.getName();
            C17542s.i(name2, "getName(...)");
            return C15854t.P(name2, '.', '/', false, 4, (Object) null);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name3 = cls.getName();
            C17542s.i(name3, "getName(...)");
            sb2.append(C15854t.P(name3, '.', '/', false, 4, (Object) null));
            sb2.append(';');
            return sb2.toString();
        }
    }

    public static final Integer g(Class<?> cls) {
        C17542s.j(cls, "<this>");
        return f135779d.get(cls);
    }

    public static final List<Type> h(Type type) {
        C17542s.j(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C16877v.n();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return C15768k.a0(C15768k.M(C15768k.q(type, C15963d.f135774a), C15964e.f135775a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C17542s.i(actualTypeArguments, "getActualTypeArguments(...)");
        return C16870n.c1(actualTypeArguments);
    }

    public static final Class<?> i(Class<?> cls) {
        C17542s.j(cls, "<this>");
        return f135777b.get(cls);
    }

    public static final ClassLoader j(Class<?> cls) {
        C17542s.j(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C17542s.i(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class<?> k(Class<?> cls) {
        C17542s.j(cls, "<this>");
        return f135778c.get(cls);
    }

    public static final boolean l(Class<?> cls) {
        C17542s.j(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
