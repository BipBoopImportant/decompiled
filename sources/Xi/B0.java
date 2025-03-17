package xI;

import DI.a0;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18065n;
import xI.K0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0011R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"LxI/B0;", "V", "LuI/n;", "LxI/K0;", "LxI/d0;", "container", "LDI/a0;", "descriptor", "<init>", "(LxI/d0;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(LxI/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "get", "()Ljava/lang/Object;", "invoke", "LXH/o;", "LxI/B0$a;", "o", "LXH/o;", "_getter", "p", "delegateValue", "x0", "()LxI/B0$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class B0<V> extends K0<V> implements C18065n<V> {

    /* renamed from: o  reason: collision with root package name */
    private final C16824o<a<V>> f152277o;

    /* renamed from: p  reason: collision with root package name */
    private final C16824o<Object> f152278p;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LxI/B0$a;", "R", "LxI/K0$c;", "LuI/n$a;", "LxI/B0;", "property", "<init>", "(LxI/B0;)V", "invoke", "()Ljava/lang/Object;", "j", "LxI/B0;", "p0", "()LxI/B0;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<R> extends K0.c<R> implements C18065n.a<R> {

        /* renamed from: j  reason: collision with root package name */
        private final B0<R> f152279j;

        public a(B0<? extends R> b02) {
            C17542s.j(b02, "property");
            this.f152279j = b02;
        }

        public R invoke() {
            return t().get();
        }

        /* renamed from: p0 */
        public B0<R> t() {
            return this.f152279j;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0(C18629d0 d0Var, a0 a0Var) {
        super(d0Var, a0Var);
        C17542s.j(d0Var, "container");
        C17542s.j(a0Var, "descriptor");
        s sVar = s.PUBLICATION;
        this.f152277o = C16825p.a(sVar, new C18673z0(this));
        this.f152278p = C16825p.a(sVar, new A0(this));
    }

    /* access modifiers changed from: private */
    public static final a t0(B0 b02) {
        return new a(b02);
    }

    /* access modifiers changed from: private */
    public static final Object w0(B0 b02) {
        return b02.o0(b02.m0(), (Object) null, (Object) null);
    }

    public V get() {
        return q0().call(new Object[0]);
    }

    public V invoke() {
        return get();
    }

    /* renamed from: x0 */
    public a<V> q0() {
        return this.f152277o.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0(C18629d0 d0Var, String str, String str2, Object obj) {
        super(d0Var, str, str2, obj);
        C17542s.j(d0Var, "container");
        C17542s.j(str, "name");
        C17542s.j(str2, "signature");
        s sVar = s.PUBLICATION;
        this.f152277o = C16825p.a(sVar, new C18673z0(this));
        this.f152278p = C16825p.a(sVar, new A0(this));
    }
}
