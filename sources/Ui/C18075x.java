package uI;

import GJ.C15765h;
import GJ.C15768k;
import HJ.C15854t;
import XH.t;
import YH.C16877v;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;
import nI.C17642l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\t8BX\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LuI/q;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "(LuI/q;Z)Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "jClass", "", "LuI/s;", "arguments", "e", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Type;", "type", "", "h", "(Ljava/lang/reflect/Type;)Ljava/lang/String;", "f", "(LuI/q;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(LuI/q;)V", "javaType", "g", "(LuI/s;)Ljava/lang/reflect/Type;", "(LuI/s;)V", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: uI.x  reason: case insensitive filesystem */
public final class C18075x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uI.x$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f147791a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                uI.t[] r0 = uI.C18071t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                uI.t r1 = uI.C18071t.IN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                uI.t r1 = uI.C18071t.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                uI.t r1 = uI.C18071t.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f147791a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uI.C18075x.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uI.x$b */
    /* synthetic */ class b extends C17540p implements C17642l<Class<?>, Class<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f147792a = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        /* renamed from: t */
        public final Class<?> invoke(Class<?> cls) {
            C17542s.j(cls, "p0");
            return cls.getComponentType();
        }
    }

    /* access modifiers changed from: private */
    public static final Type c(C18068q qVar, boolean z10) {
        C18057f e10 = qVar.e();
        if (e10 instanceof C18069r) {
            return new C18074w((C18069r) e10);
        }
        if (e10 instanceof C18055d) {
            C18055d dVar = (C18055d) e10;
            Class c10 = z10 ? C17603a.c(dVar) : C17603a.b(dVar);
            List<C18070s> i10 = qVar.i();
            if (i10.isEmpty()) {
                return c10;
            }
            if (!c10.isArray()) {
                return e(c10, i10);
            }
            if (c10.getComponentType().isPrimitive()) {
                return c10;
            }
            C18070s sVar = (C18070s) C16877v.d1(i10);
            if (sVar != null) {
                C18071t a10 = sVar.a();
                C18068q b10 = sVar.b();
                int i11 = a10 == null ? -1 : a.f147791a[a10.ordinal()];
                if (i11 == -1 || i11 == 1) {
                    return c10;
                }
                if (i11 == 2 || i11 == 3) {
                    C17542s.g(b10);
                    Type d10 = d(b10, false, 1, (Object) null);
                    return d10 instanceof Class ? c10 : new C18052a(d10);
                }
                throw new t();
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + qVar);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + qVar);
    }

    static /* synthetic */ Type d(C18068q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(qVar, z10);
    }

    private static final Type e(Class<?> cls, List<C18070s> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            Iterable<C18070s> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (C18070s g10 : iterable) {
                arrayList.add(g(g10));
            }
            return new C18073v(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            Iterable<C18070s> iterable2 = list;
            ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
            for (C18070s g11 : iterable2) {
                arrayList2.add(g(g11));
            }
            return new C18073v(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e10 = e(declaringClass, list.subList(length, list.size()));
            Iterable<C18070s> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(C16877v.y(subList, 10));
            for (C18070s g12 : subList) {
                arrayList3.add(g(g12));
            }
            return new C18073v(cls, e10, arrayList3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = ((kotlin.jvm.internal.C17543t) r3).q();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.reflect.Type f(uI.C18068q r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            boolean r0 = r3 instanceof kotlin.jvm.internal.C17543t
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.jvm.internal.t r0 = (kotlin.jvm.internal.C17543t) r0
            java.lang.reflect.Type r0 = r0.q()
            if (r0 == 0) goto L_0x0013
            return r0
        L_0x0013:
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.reflect.Type r3 = d(r3, r2, r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: uI.C18075x.f(uI.q):java.lang.reflect.Type");
    }

    private static final Type g(C18070s sVar) {
        C18071t d10 = sVar.d();
        if (d10 == null) {
            return C18076y.f147793c.a();
        }
        C18068q c10 = sVar.c();
        C17542s.g(c10);
        int i10 = a.f147791a[d10.ordinal()];
        if (i10 == 1) {
            return new C18076y((Type) null, c(c10, true));
        }
        if (i10 == 2) {
            return c(c10, true);
        }
        if (i10 == 3) {
            return new C18076y(c(c10, true), (Type) null);
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public static final String h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            C15765h q10 = C15768k.q(type, b.f147792a);
            return ((Class) C15768k.R(q10)).getName() + C15854t.M("[]", C15768k.C(q10));
        }
        String name = cls.getName();
        C17542s.i(name, "getName(...)");
        return name;
    }
}
