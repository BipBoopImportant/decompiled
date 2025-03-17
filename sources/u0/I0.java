package U0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H ¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\rJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LU0/I0;", "T", "LU0/v;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(LnI/a;)V", "LU0/J0;", "value", "LU0/G1;", "f", "(LU0/J0;)LU0/G1;", "c", "(Ljava/lang/Object;)LU0/J0;", "d", "e", "previous", "b", "(LU0/J0;LU0/G1;)LU0/G1;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class I0<T> extends C4906v<T> {
    public I0(C17631a<? extends T> aVar) {
        super(aVar, (DefaultConstructorMarker) null);
    }

    private final G1<T> f(J0<T> j02) {
        if (!j02.i()) {
            return j02.c() != null ? new E(j02.c()) : j02.f() != null ? new O(j02.f()) : new C1(j02.d());
        }
        C4899r0<T> f10 = j02.f();
        if (f10 == null) {
            T g10 = j02.g();
            o1<T> e10 = j02.e();
            if (e10 == null) {
                e10 = p1.s();
            }
            f10 = p1.i(g10, e10);
        }
        return new O(f10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: U0.E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: U0.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: U0.C1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: U0.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: U0.O} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r0 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r0 == r2) goto L_0x0034;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public U0.G1<T> b(U0.J0<T> r4, U0.G1<T> r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof U0.O
            r1 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x0047
            r1 = r5
            U0.O r1 = (U0.O) r1
            U0.r0 r5 = r1.b()
            java.lang.Object r0 = r4.d()
            r5.setValue(r0)
            goto L_0x0047
        L_0x001a:
            boolean r0 = r5 instanceof U0.C1
            if (r0 == 0) goto L_0x0036
            boolean r0 = r4.j()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r4.d()
            U0.C1 r5 = (U0.C1) r5
            java.lang.Object r2 = r5.b()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r2)
            if (r0 == 0) goto L_0x0047
        L_0x0034:
            r1 = r5
            goto L_0x0047
        L_0x0036:
            boolean r0 = r5 instanceof U0.E
            if (r0 == 0) goto L_0x0047
            nI.l r0 = r4.c()
            U0.E r5 = (U0.E) r5
            nI.l r2 = r5.b()
            if (r0 != r2) goto L_0x0047
            goto L_0x0034
        L_0x0047:
            if (r1 != 0) goto L_0x004d
            U0.G1 r1 = r3.f(r4)
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.I0.b(U0.J0, U0.G1):U0.G1");
    }

    public abstract J0<T> c(T t10);

    public final J0<T> d(T t10) {
        return c(t10);
    }

    public final J0<T> e(T t10) {
        return c(t10).h();
    }
}
