package xI;

import DI.a0;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18066o;
import xI.K0;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001 B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0013R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"LxI/E0;", "T", "V", "LuI/o;", "LxI/K0;", "LxI/d0;", "container", "LDI/a0;", "descriptor", "<init>", "(LxI/d0;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(LxI/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "LXH/o;", "LxI/E0$a;", "o", "LXH/o;", "_getter", "Ljava/lang/reflect/Member;", "p", "delegateSource", "x0", "()LxI/E0$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class E0<T, V> extends K0<V> implements C18066o<T, V> {

    /* renamed from: o  reason: collision with root package name */
    private final C16824o<a<T, V>> f152285o;

    /* renamed from: p  reason: collision with root package name */
    private final C16824o<Member> f152286p;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LxI/E0$a;", "T", "V", "LxI/K0$c;", "LuI/o$a;", "LxI/E0;", "property", "<init>", "(LxI/E0;)V", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "j", "LxI/E0;", "p0", "()LxI/E0;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T, V> extends K0.c<V> implements C18066o.a<T, V> {

        /* renamed from: j  reason: collision with root package name */
        private final E0<T, V> f152287j;

        public a(E0<T, ? extends V> e02) {
            C17542s.j(e02, "property");
            this.f152287j = e02;
        }

        public V invoke(T t10) {
            return t().get(t10);
        }

        /* renamed from: p0 */
        public E0<T, V> t() {
            return this.f152287j;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E0(C18629d0 d0Var, String str, String str2, Object obj) {
        super(d0Var, str, str2, obj);
        C17542s.j(d0Var, "container");
        C17542s.j(str, "name");
        C17542s.j(str2, "signature");
        s sVar = s.PUBLICATION;
        this.f152285o = C16825p.a(sVar, new C0(this));
        this.f152286p = C16825p.a(sVar, new D0(this));
    }

    /* access modifiers changed from: private */
    public static final a t0(E0 e02) {
        return new a(e02);
    }

    /* access modifiers changed from: private */
    public static final Member w0(E0 e02) {
        return e02.m0();
    }

    public V get(T t10) {
        return q0().call(t10);
    }

    public V invoke(T t10) {
        return get(t10);
    }

    /* renamed from: x0 */
    public a<T, V> q0() {
        return this.f152285o.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E0(C18629d0 d0Var, a0 a0Var) {
        super(d0Var, a0Var);
        C17542s.j(d0Var, "container");
        C17542s.j(a0Var, "descriptor");
        s sVar = s.PUBLICATION;
        this.f152285o = C16825p.a(sVar, new C0(this));
        this.f152286p = C16825p.a(sVar, new D0(this));
    }
}
