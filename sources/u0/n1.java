package U0;

import XH.C16807N;
import g1.C5327H;
import g1.C5328I;
import g1.C5342k;
import g1.C5347p;
import g1.C5352u;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001)B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR*\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00008V@VX\u000e¢\u0006\u0012\u0012\u0004\b$\u0010%\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"LU0/n1;", "T", "Lg1/H;", "Lg1/u;", "value", "LU0/o1;", "policy", "<init>", "(Ljava/lang/Object;LU0/o1;)V", "Lg1/I;", "LXH/N;", "p", "(Lg1/I;)V", "previous", "current", "applied", "i", "(Lg1/I;Lg1/I;Lg1/I;)Lg1/I;", "", "toString", "()Ljava/lang/String;", "q", "()Ljava/lang/Object;", "Lkotlin/Function1;", "l", "()LnI/l;", "b", "LU0/o1;", "c", "()LU0/o1;", "LU0/n1$a;", "LU0/n1$a;", "next", "getValue", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "m", "()Lg1/I;", "firstStateRecord", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class n1<T> extends C5327H implements C5352u<T> {

    /* renamed from: b  reason: collision with root package name */
    private final o1<T> f14082b;

    /* renamed from: c  reason: collision with root package name */
    private a<T> f14083c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\u00028\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"LU0/n1$a;", "T", "Lg1/I;", "myValue", "<init>", "(Ljava/lang/Object;)V", "value", "LXH/N;", "c", "(Lg1/I;)V", "d", "()Lg1/I;", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "j", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<T> extends C5328I {

        /* renamed from: c  reason: collision with root package name */
        private T f14084c;

        public a(T t10) {
            this.f14084c = t10;
        }

        public void c(C5328I i10) {
            C17542s.h(i10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f14084c = ((a) i10).f14084c;
        }

        public C5328I d() {
            return new a(this.f14084c);
        }

        public final T i() {
            return this.f14084c;
        }

        public final void j(T t10) {
            this.f14084c = t10;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<T, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n1<T> f14085c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n1<T> n1Var) {
            super(1);
            this.f14085c = n1Var;
        }

        public final void a(T t10) {
            this.f14085c.setValue(t10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    public n1(T t10, o1<T> o1Var) {
        this.f14082b = o1Var;
        a<T> aVar = new a<>(t10);
        if (C5342k.f23395e.e()) {
            a aVar2 = new a(t10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f14083c = aVar;
    }

    public o1<T> c() {
        return this.f14082b;
    }

    public T getValue() {
        return ((a) C5347p.X(this.f14083c, this)).i();
    }

    public C5328I i(C5328I i10, C5328I i11, C5328I i12) {
        C17542s.h(i10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) i10;
        C17542s.h(i11, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) i11;
        C17542s.h(i12, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) i12;
        if (c().b(aVar2.i(), aVar3.i())) {
            return i11;
        }
        Object a10 = c().a(aVar.i(), aVar2.i(), aVar3.i());
        if (a10 == null) {
            return null;
        }
        C5328I d10 = aVar3.d();
        C17542s.h(d10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$4>");
        ((a) d10).j(a10);
        return d10;
    }

    public C17642l<T, C16807N> l() {
        return new b(this);
    }

    public C5328I m() {
        return this.f14083c;
    }

    public void p(C5328I i10) {
        C17542s.h(i10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f14083c = (a) i10;
    }

    public T q() {
        return getValue();
    }

    public void setValue(T t10) {
        C5342k c10;
        a aVar = (a) C5347p.F(this.f14083c);
        if (!c().b(aVar.i(), t10)) {
            a<T> aVar2 = this.f14083c;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                ((a) C5347p.S(aVar2, this, c10, aVar)).j(t10);
                C16807N n10 = C16807N.f139792a;
            }
            C5347p.Q(c10, this);
        }
    }

    public String toString() {
        return "MutableState(value=" + ((a) C5347p.F(this.f14083c)).i() + ")@" + hashCode();
    }
}
