package androidx.lifecycle;

import HJ.C15854t;
import YH.C16877v;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR2\u0010 \u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u001f0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/lifecycle/E;", "", "<init>", "()V", "object", "Landroidx/lifecycle/v;", "f", "(Ljava/lang/Object;)Landroidx/lifecycle/v;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/n;", "constructor", "a", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/n;", "Ljava/lang/Class;", "klass", "b", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", "d", "(Ljava/lang/Class;)I", "g", "", "e", "(Ljava/lang/Class;)Z", "", "className", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/util/Map;", "callbackCache", "", "classToAdapters", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class E {

    /* renamed from: a  reason: collision with root package name */
    public static final E f22138a = new E();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, Integer> f22139b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<?>, List<Constructor<? extends C5211n>>> f22140c = new HashMap();

    private E() {
    }

    private final C5211n a(Constructor<? extends C5211n> constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            C17542s.i(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (C5211n) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor<? extends C5211n> b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            C17542s.i(name, "fullPackage");
            if (name.length() != 0) {
                C17542s.i(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                C17542s.i(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            C17542s.i(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c10 = c(canonicalName);
            if (name.length() != 0) {
                c10 = name + '.' + c10;
            }
            Class<?> cls2 = Class.forName(c10);
            C17542s.h(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String str) {
        C17542s.j(str, "className");
        return C15854t.Q(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f22139b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        map.put(cls, Integer.valueOf(g10));
        return g10;
    }

    private final boolean e(Class<?> cls) {
        return cls != null && C5220x.class.isAssignableFrom(cls);
    }

    public static final C5218v f(Object obj) {
        C17542s.j(obj, "object");
        boolean z10 = obj instanceof C5218v;
        boolean z11 = obj instanceof C5205h;
        if (z10 && z11) {
            return new C5206i((C5205h) obj, (C5218v) obj);
        }
        if (z11) {
            return new C5206i((C5205h) obj, (C5218v) null);
        }
        if (z10) {
            return (C5218v) obj;
        }
        Class<?> cls = obj.getClass();
        E e10 = f22138a;
        if (e10.d(cls) != 2) {
            return new P(obj);
        }
        List<Constructor<? extends C5211n>> list = f22140c.get(cls);
        C17542s.g(list);
        List list2 = list;
        if (list2.size() == 1) {
            return new d0(e10.a((Constructor) list2.get(0), obj));
        }
        int size = list2.size();
        C5211n[] nVarArr = new C5211n[size];
        for (int i10 = 0; i10 < size; i10++) {
            nVarArr[i10] = f22138a.a((Constructor) list2.get(i10), obj);
        }
        return new C5202e(nVarArr);
    }

    private final int g(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C5211n> b10 = b(cls);
        if (b10 != null) {
            f22140c.put(cls, C16877v.e(b10));
            return 2;
        } else if (C5201d.f22258c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            if (e(superclass)) {
                C17542s.i(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends C5211n>> list = f22140c.get(superclass);
                C17542s.g(list);
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            Class[] interfaces = cls.getInterfaces();
            C17542s.i(interfaces, "klass.interfaces");
            for (Class cls2 : interfaces) {
                if (e(cls2)) {
                    C17542s.i(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends C5211n>> list2 = f22140c.get(cls2);
                    C17542s.g(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f22140c.put(cls, arrayList);
            return 2;
        }
    }
}
