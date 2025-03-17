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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001'B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010 \"\u0004\b!\u0010\u0007R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040#8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"LU0/m1;", "Lg1/H;", "LU0/p0;", "Lg1/u;", "", "value", "<init>", "(J)V", "t", "()Ljava/lang/Long;", "Lkotlin/Function1;", "LXH/N;", "l", "()LnI/l;", "Lg1/I;", "p", "(Lg1/I;)V", "previous", "current", "applied", "i", "(Lg1/I;Lg1/I;Lg1/I;)Lg1/I;", "", "toString", "()Ljava/lang/String;", "LU0/m1$a;", "b", "LU0/m1$a;", "next", "m", "()Lg1/I;", "firstStateRecord", "()J", "o", "longValue", "LU0/o1;", "c", "()LU0/o1;", "policy", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class m1 extends C5327H implements C4896p0, C5352u<Long> {

    /* renamed from: b  reason: collision with root package name */
    private a f14017b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, d2 = {"LU0/m1$a;", "Lg1/I;", "", "value", "<init>", "(J)V", "LXH/N;", "c", "(Lg1/I;)V", "d", "()Lg1/I;", "J", "i", "()J", "j", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends C5328I {

        /* renamed from: c  reason: collision with root package name */
        private long f14018c;

        public a(long j10) {
            this.f14018c = j10;
        }

        public void c(C5328I i10) {
            C17542s.h(i10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f14018c = ((a) i10).f14018c;
        }

        public C5328I d() {
            return new a(this.f14018c);
        }

        public final long i() {
            return this.f14018c;
        }

        public final void j(long j10) {
            this.f14018c = j10;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Long, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m1 f14019c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m1 m1Var) {
            super(1);
            this.f14019c = m1Var;
        }

        public final void a(long j10) {
            this.f14019c.o(j10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C16807N.f139792a;
        }
    }

    public m1(long j10) {
        a aVar = new a(j10);
        if (C5342k.f23395e.e()) {
            a aVar2 = new a(j10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f14017b = aVar;
    }

    public long b() {
        return ((a) C5347p.X(this.f14017b, this)).i();
    }

    public o1<Long> c() {
        return p1.s();
    }

    public C5328I i(C5328I i10, C5328I i11, C5328I i12) {
        C17542s.h(i11, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        C17542s.h(i12, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((a) i11).i() == ((a) i12).i()) {
            return i11;
        }
        return null;
    }

    public C17642l<Long, C16807N> l() {
        return new b(this);
    }

    public C5328I m() {
        return this.f14017b;
    }

    public void o(long j10) {
        C5342k c10;
        a aVar = (a) C5347p.F(this.f14017b);
        if (aVar.i() != j10) {
            a aVar2 = this.f14017b;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                ((a) C5347p.S(aVar2, this, c10, aVar)).j(j10);
                C16807N n10 = C16807N.f139792a;
            }
            C5347p.Q(c10, this);
        }
    }

    public void p(C5328I i10) {
        C17542s.h(i10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f14017b = (a) i10;
    }

    /* renamed from: t */
    public Long q() {
        return Long.valueOf(b());
    }

    public String toString() {
        return "MutableLongState(value=" + ((a) C5347p.F(this.f14017b)).i() + ")@" + hashCode();
    }
}
