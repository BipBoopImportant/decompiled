package U0;

import XH.C16807N;
import dI.C17168i;
import h1.C5410a;
import kotlin.Metadata;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 m2\u00020\u0001:\u0001mJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H'¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H'¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0004H'¢\u0006\u0004\b\u001c\u0010\bJ#\u0010\u001f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH'¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H'¢\u0006\u0004\b!\u0010\bJ\u000f\u0010\"\u001a\u00020\u0004H'¢\u0006\u0004\b\"\u0010\bJ!\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b#\u0010\rJ\u000f\u0010$\u001a\u00020\u0004H'¢\u0006\u0004\b$\u0010\bJ\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0002H'¢\u0006\u0004\b&\u0010\u0006J=\u0010+\u001a\u00020\u0004\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u000e2\u0006\u0010(\u001a\u00028\u00002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040)H'¢\u0006\u0004\b+\u0010,J\u0011\u0010-\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b/\u00100J\u0019\u0010'\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b'\u00101J\u0017\u00102\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0017H\u0017¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0002H\u0017¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00172\u0006\u0010(\u001a\u000206H\u0017¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00172\u0006\u0010(\u001a\u000209H\u0017¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00172\u0006\u0010(\u001a\u00020<H\u0017¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\b?\u00101J\u0017\u0010B\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@H'¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH'¢\u0006\u0004\bE\u0010 J#\u0010G\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000FH'¢\u0006\u0004\bG\u0010HJ#\u0010L\u001a\u00020\u00042\u0012\u0010K\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030J0IH'¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0004H'¢\u0006\u0004\bN\u0010\bJ\u001b\u0010O\u001a\u00020\u00042\n\u0010(\u001a\u0006\u0012\u0002\b\u00030JH'¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0004H'¢\u0006\u0004\bQ\u0010\bJ\u000f\u0010R\u001a\u00020\u0004H&¢\u0006\u0004\bR\u0010\bJ\u000f\u0010T\u001a\u00020SH'¢\u0006\u0004\bT\u0010UR\u001e\u0010Z\u001a\u0006\u0012\u0002\b\u00030V8&X§\u0004¢\u0006\f\u0012\u0004\bY\u0010\b\u001a\u0004\bW\u0010XR\u001a\u0010^\u001a\u00020\u00178&X§\u0004¢\u0006\f\u0012\u0004\b]\u0010\b\u001a\u0004\b[\u0010\\R\u001a\u0010a\u001a\u00020\u00178&X§\u0004¢\u0006\f\u0012\u0004\b`\u0010\b\u001a\u0004\b_\u0010\\R\u001a\u0010d\u001a\u00020\u00178&X§\u0004¢\u0006\f\u0012\u0004\bc\u0010\b\u001a\u0004\bb\u0010\\R\u001c\u0010h\u001a\u0004\u0018\u00010@8&X§\u0004¢\u0006\f\u0012\u0004\bg\u0010\b\u001a\u0004\be\u0010fR\u001a\u0010l\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\bk\u0010\b\u001a\u0004\bi\u0010jR\u001a\u0010o\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\bn\u0010\b\u001a\u0004\bm\u0010jR\u0014\u0010s\u001a\u00020p8&X¦\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u001a\u0010|\u001a\u00020x8gX§\u0004¢\u0006\f\u0012\u0004\b{\u0010\b\u001a\u0004\by\u0010z\u0001\u0001}ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006~À\u0006\u0001"}, d2 = {"LU0/m;", "", "", "key", "LXH/N;", "C", "(I)V", "U", "()V", "W", "P", "dataKey", "H", "(ILjava/lang/Object;)V", "T", "G", "y", "k", "(I)LU0/m;", "LU0/Y0;", "n", "()LU0/Y0;", "L", "", "changed", "j", "(Z)V", "o", "I", "Lkotlin/Function0;", "factory", "p", "(LnI/a;)V", "t", "x", "J", "B", "marker", "q", "V", "value", "Lkotlin/Function2;", "block", "w", "(Ljava/lang/Object;LnI/p;)V", "D", "()Ljava/lang/Object;", "u", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;)Z", "b", "(Z)Z", "d", "(I)Z", "", "c", "(F)Z", "", "e", "(J)Z", "", "h", "(D)Z", "F", "LU0/K0;", "scope", "M", "(LU0/K0;)V", "effect", "f", "LU0/v;", "Q", "(LU0/v;)Ljava/lang/Object;", "", "LU0/J0;", "values", "K", "([LU0/J0;)V", "N", "g", "(LU0/J0;)V", "v", "z", "LU0/r;", "S", "()LU0/r;", "LU0/f;", "m", "()LU0/f;", "getApplier$annotations", "applier", "i", "()Z", "getInserting$annotations", "inserting", "l", "getSkipping$annotations", "skipping", "O", "getDefaultsInvalid$annotations", "defaultsInvalid", "A", "()LU0/K0;", "getRecomposeScope$annotations", "recomposeScope", "R", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "a", "getCurrentMarker$annotations", "currentMarker", "LU0/y;", "s", "()LU0/y;", "currentCompositionLocalMap", "Lh1/a;", "E", "()Lh1/a;", "compositionData", "LdI/i;", "r", "()LdI/i;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "LU0/n;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.m  reason: case insensitive filesystem */
public interface C4889m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14007a = a.f14008a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"LU0/m$a;", "", "<init>", "()V", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "Empty", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U0.m$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f14008a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Object f14009b = new C0203a();

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"U0/m$a$a", "", "", "toString", "()Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: U0.m$a$a  reason: collision with other inner class name */
        public static final class C0203a {
            C0203a() {
            }

            public String toString() {
                return "Empty";
            }
        }

        private a() {
        }

        public final Object a() {
            return f14009b;
        }
    }

    K0 A();

    void B();

    void C(int i10);

    Object D();

    C5410a E();

    boolean F(Object obj) {
        return V(obj);
    }

    void G();

    void H(int i10, Object obj);

    void I();

    void J(int i10, Object obj);

    void K(J0<?>[] j0Arr);

    void L();

    void M(K0 k02);

    void N();

    boolean O();

    void P();

    <T> T Q(C4906v<T> vVar);

    int R();

    r S();

    void T();

    void U();

    boolean V(Object obj);

    void W(int i10);

    int a();

    boolean b(boolean z10) {
        return b(z10);
    }

    boolean c(float f10) {
        return c(f10);
    }

    boolean d(int i10) {
        return d(i10);
    }

    boolean e(long j10) {
        return e(j10);
    }

    void f(C17631a<C16807N> aVar);

    void g(J0<?> j02);

    boolean h(double d10) {
        return h(d10);
    }

    boolean i();

    void j(boolean z10);

    C4889m k(int i10);

    boolean l();

    C4872f<?> m();

    Y0 n();

    void o();

    <T> void p(C17631a<? extends T> aVar);

    void q(int i10);

    C17168i r();

    C4912y s();

    void t();

    void u(Object obj);

    void v();

    <V, T> void w(V v10, p<? super T, ? super V, C16807N> pVar);

    void x();

    void y();

    void z();
}
