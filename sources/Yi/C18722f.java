package yI;

import XH.C16824o;
import XH.C16825p;
import YH.C16870n;
import YH.C16877v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import mI.C17603a;
import uI.C18055d;
import xI.Y0;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\f\u0010\u0016\u001a\u00020\u00058\nX\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00078\nX\u0002"}, d2 = {"", "Ljava/lang/Class;", "expectedType", "q", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "", "index", "", "name", "expectedJvmType", "", "p", "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Void;", "T", "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "g", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "hashCode", "toString", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yI.f  reason: case insensitive filesystem */
public final class C18722f {
    public static final <T> T g(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        C17542s.j(cls, "annotationClass");
        C17542s.j(map, "values");
        C17542s.j(list, "methods");
        C16824o b10 = C16825p.b(new C18718b(map));
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C18720d(cls, map, C16825p.b(new C18719c(cls, map)), b10, list));
        C17542s.h(newProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return newProxyInstance;
    }

    public static /* synthetic */ Object h(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Iterable<String> keySet = map.keySet();
            ArrayList arrayList = new ArrayList(C16877v.y(keySet, 10));
            for (String declaredMethod : keySet) {
                arrayList.add(cls.getDeclaredMethod(declaredMethod, (Class[]) null));
            }
            list = arrayList;
        }
        return g(cls, map, list);
    }

    private static final <T> boolean i(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) {
        boolean z10;
        boolean z11;
        C18055d a10;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (!C17542s.e((annotation == null || (a10 = C17603a.a(annotation)) == null) ? null : C17603a.b(a10), cls)) {
            return false;
        }
        Iterable iterable = list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Method method = (Method) it.next();
                Object obj2 = map.get(method.getName());
                Object invoke = method.invoke(obj, (Object[]) null);
                if (obj2 instanceof boolean[]) {
                    C17542s.h(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                    z11 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                    continue;
                } else if (obj2 instanceof char[]) {
                    C17542s.h(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                    z11 = Arrays.equals((char[]) obj2, (char[]) invoke);
                    continue;
                } else if (obj2 instanceof byte[]) {
                    C17542s.h(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                    z11 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                    continue;
                } else if (obj2 instanceof short[]) {
                    C17542s.h(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                    z11 = Arrays.equals((short[]) obj2, (short[]) invoke);
                    continue;
                } else if (obj2 instanceof int[]) {
                    C17542s.h(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                    z11 = Arrays.equals((int[]) obj2, (int[]) invoke);
                    continue;
                } else if (obj2 instanceof float[]) {
                    C17542s.h(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                    z11 = Arrays.equals((float[]) obj2, (float[]) invoke);
                    continue;
                } else if (obj2 instanceof long[]) {
                    C17542s.h(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                    z11 = Arrays.equals((long[]) obj2, (long[]) invoke);
                    continue;
                } else if (obj2 instanceof double[]) {
                    C17542s.h(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                    z11 = Arrays.equals((double[]) obj2, (double[]) invoke);
                    continue;
                } else if (obj2 instanceof Object[]) {
                    C17542s.h(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                    z11 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                    continue;
                } else {
                    z11 = C17542s.e(obj2, invoke);
                    continue;
                }
                if (!z11) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        return z10;
    }

    /* access modifiers changed from: private */
    public static final int j(Map map) {
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            i10 += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return i10;
    }

    private static final int k(C16824o<Integer> oVar) {
        return oVar.getValue().intValue();
    }

    /* access modifiers changed from: private */
    public static final String l(Class cls, Map map) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        sb2.append(cls.getCanonicalName());
        C16877v.E0(map.entrySet(), sb2, ", ", "(", ")", 0, (CharSequence) null, C18721e.f152721a, 48, (Object) null);
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    public static final CharSequence m(Map.Entry entry) {
        String str;
        C17542s.j(entry, "entry");
        String str2 = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            str = Arrays.toString((boolean[]) value);
            C17542s.i(str, "toString(...)");
        } else if (value instanceof char[]) {
            str = Arrays.toString((char[]) value);
            C17542s.i(str, "toString(...)");
        } else if (value instanceof byte[]) {
            str = Arrays.toString((byte[]) value);
            C17542s.i(str, "toString(...)");
        } else if (value instanceof short[]) {
            str = Arrays.toString((short[]) value);
            C17542s.i(str, "toString(...)");
        } else if (value instanceof int[]) {
            str = Arrays.toString((int[]) value);
            C17542s.i(str, "toString(...)");
        } else if (value instanceof float[]) {
            str = Arrays.toString((float[]) value);
            C17542s.i(str, "toString(...)");
        } else if (value instanceof long[]) {
            str = Arrays.toString((long[]) value);
            C17542s.i(str, "toString(...)");
        } else if (value instanceof double[]) {
            str = Arrays.toString((double[]) value);
            C17542s.i(str, "toString(...)");
        } else if (value instanceof Object[]) {
            str = Arrays.toString((Object[]) value);
            C17542s.i(str, "toString(...)");
        } else {
            str = value.toString();
        }
        return str2 + '=' + str;
    }

    private static final String n(C16824o<String> oVar) {
        return oVar.getValue();
    }

    /* access modifiers changed from: private */
    public static final Object o(Class cls, Map map, C16824o oVar, C16824o oVar2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(k(oVar2));
                }
            } else if (name.equals("toString")) {
                return n(oVar);
            }
        }
        if (C17542s.e(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(i(cls, list, map, C16870n.N0(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb2.append(C16870n.c1(objArr));
        sb2.append(')');
        throw new Y0(sb2.toString());
    }

    /* access modifiers changed from: private */
    public static final Void p(int i10, String str, Class<?> cls) {
        String str2;
        Class<Class> cls2 = Class.class;
        C18055d<?> b10 = C17542s.e(cls, cls2) ? P.b(C18055d.class) : (!cls.isArray() || !C17542s.e(cls.getComponentType(), cls2)) ? C17603a.e(cls) : P.b(C18055d[].class);
        if (C17542s.e(b10.u(), P.b(Object[].class).u())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b10.u());
            sb2.append('<');
            Class<?> componentType = C17603a.b(b10).getComponentType();
            C17542s.i(componentType, "getComponentType(...)");
            sb2.append(C17603a.e(componentType).u());
            sb2.append('>');
            str2 = sb2.toString();
        } else {
            str2 = b10.u();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + str2);
    }

    /* access modifiers changed from: private */
    public static final Object q(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof C18055d) {
            obj = C17603a.b((C18055d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof C18055d[]) {
                C17542s.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                C18055d[] dVarArr = (C18055d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (C18055d b10 : dVarArr) {
                    arrayList.add(C17603a.b(b10));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
