package xI;

import DI.a0;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18062k;
import xI.K0;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"LxI/m0;", "T", "V", "LxI/E0;", "LuI/k;", "LxI/d0;", "container", "LDI/a0;", "descriptor", "<init>", "(LxI/d0;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(LxI/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "value", "LXH/N;", "r", "(Ljava/lang/Object;Ljava/lang/Object;)V", "LXH/o;", "LxI/m0$a;", "q", "LXH/o;", "_setter", "A0", "()LxI/m0$a;", "setter", "a", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xI.m0  reason: case insensitive filesystem */
public final class C18647m0<T, V> extends E0<T, V> implements C18062k<T, V> {

    /* renamed from: q  reason: collision with root package name */
    private final C16824o<a<T, V>> f152439q = C16825p.a(s.PUBLICATION, new C18645l0(this));

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010\n\u001a\u00028\u0003H\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LxI/m0$a;", "T", "V", "LxI/K0$d;", "LuI/k$a;", "LxI/m0;", "property", "<init>", "(LxI/m0;)V", "receiver", "value", "LXH/N;", "q0", "(Ljava/lang/Object;Ljava/lang/Object;)V", "j", "LxI/m0;", "p0", "()LxI/m0;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.m0$a */
    public static final class a<T, V> extends K0.d<V> implements C18062k.a<T, V> {

        /* renamed from: j  reason: collision with root package name */
        private final C18647m0<T, V> f152440j;

        public a(C18647m0<T, V> m0Var) {
            C17542s.j(m0Var, "property");
            this.f152440j = m0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            q0(obj, obj2);
            return C16807N.f139792a;
        }

        /* renamed from: p0 */
        public C18647m0<T, V> t() {
            return this.f152440j;
        }

        public void q0(T t10, V v10) {
            t().r(t10, v10);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18647m0(C18629d0 d0Var, String str, String str2, Object obj) {
        super(d0Var, str, str2, obj);
        C17542s.j(d0Var, "container");
        C17542s.j(str, "name");
        C17542s.j(str2, "signature");
    }

    /* access modifiers changed from: private */
    public static final a y0(C18647m0 m0Var) {
        return new a(m0Var);
    }

    /* renamed from: A0 */
    public a<T, V> g() {
        return this.f152439q.getValue();
    }

    public void r(T t10, V v10) {
        g().call(t10, v10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18647m0(C18629d0 d0Var, a0 a0Var) {
        super(d0Var, a0Var);
        C17542s.j(d0Var, "container");
        C17542s.j(a0Var, "descriptor");
    }
}
