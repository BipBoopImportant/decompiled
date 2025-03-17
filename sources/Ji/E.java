package JI;

import TI.x;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class E implements x {

    /* renamed from: a  reason: collision with root package name */
    public static final a f135751a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E a(Type type) {
            C17542s.j(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C15959C(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) ? new m(type) : type instanceof WildcardType ? new H((WildcardType) type) : new s(type);
        }

        private a() {
        }
    }

    /* access modifiers changed from: protected */
    public abstract Type R();

    public boolean equals(Object obj) {
        return (obj instanceof E) && C17542s.e(R(), ((E) obj).R());
    }

    public int hashCode() {
        return R().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + R();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: cJ.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: cJ.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: TI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: cJ.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: cJ.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: cJ.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TI.C16497a v(cJ.C17066c r5) {
        /*
            r4 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.util.Collection r0 = r4.getAnnotations()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000f:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x002e
            java.lang.Object r1 = r0.next()
            r3 = r1
            TI.a r3 = (TI.C16497a) r3
            cJ.b r3 = r3.k()
            if (r3 == 0) goto L_0x0027
            cJ.c r2 = r3.a()
        L_0x0027:
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r5)
            if (r2 == 0) goto L_0x000f
            r2 = r1
        L_0x002e:
            TI.a r2 = (TI.C16497a) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: JI.E.v(cJ.c):TI.a");
    }
}
