package xI;

import DI.a0;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.jvm.internal.C17530f;
import kotlin.jvm.internal.C17542s;
import uI.C18067p;
import xI.K0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001 B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0013R,\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"LxI/H0;", "D", "E", "V", "LuI/p;", "LxI/K0;", "LxI/d0;", "container", "LDI/a0;", "descriptor", "<init>", "(LxI/d0;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(LxI/d0;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "A", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "LXH/o;", "LxI/H0$a;", "o", "LXH/o;", "_getter", "Ljava/lang/reflect/Member;", "p", "delegateSource", "x0", "()LxI/H0$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class H0<D, E, V> extends K0<V> implements C18067p<D, E, V> {

    /* renamed from: o  reason: collision with root package name */
    private final C16824o<a<D, E, V>> f152293o;

    /* renamed from: p  reason: collision with root package name */
    private final C16824o<Member> f152294p;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00028\u00052\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\u0002¢\u0006\u0004\b\f\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LxI/H0$a;", "D", "E", "V", "LxI/K0$c;", "LuI/p$a;", "LxI/H0;", "property", "<init>", "(LxI/H0;)V", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "j", "LxI/H0;", "p0", "()LxI/H0;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<D, E, V> extends K0.c<V> implements C18067p.a<D, E, V> {

        /* renamed from: j  reason: collision with root package name */
        private final H0<D, E, V> f152295j;

        public a(H0<D, E, ? extends V> h02) {
            C17542s.j(h02, "property");
            this.f152295j = h02;
        }

        public V invoke(D d10, E e10) {
            return t().A(d10, e10);
        }

        /* renamed from: p0 */
        public H0<D, E, V> t() {
            return this.f152295j;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H0(C18629d0 d0Var, String str, String str2) {
        super(d0Var, str, str2, C17530f.NO_RECEIVER);
        C17542s.j(d0Var, "container");
        C17542s.j(str, "name");
        C17542s.j(str2, "signature");
        s sVar = s.PUBLICATION;
        this.f152293o = C16825p.a(sVar, new F0(this));
        this.f152294p = C16825p.a(sVar, new G0(this));
    }

    /* access modifiers changed from: private */
    public static final a t0(H0 h02) {
        return new a(h02);
    }

    /* access modifiers changed from: private */
    public static final Member w0(H0 h02) {
        return h02.m0();
    }

    public V A(D d10, E e10) {
        return q0().call(d10, e10);
    }

    public V invoke(D d10, E e10) {
        return A(d10, e10);
    }

    /* renamed from: x0 */
    public a<D, E, V> q0() {
        return this.f152293o.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H0(C18629d0 d0Var, a0 a0Var) {
        super(d0Var, a0Var);
        C17542s.j(d0Var, "container");
        C17542s.j(a0Var, "descriptor");
        s sVar = s.PUBLICATION;
        this.f152293o = C16825p.a(sVar, new F0(this));
        this.f152294p = C16825p.a(sVar, new G0(this));
    }
}
