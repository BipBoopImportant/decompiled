package g2;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l2.f;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lg2/C;", "Lg2/w;", "Lkotlin/Function1;", "Lg2/t;", "LXH/N;", "description", "Lg2/q;", "extendFrom", "<init>", "(LnI/l;Lg2/q;)V", "Lg2/X;", "state", "m", "(Lg2/X;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LnI/l;", "getDescription", "()LnI/l;", "b", "Lg2/t;", "getScope$constraintlayout_compose_release", "()Lg2/t;", "scope", "c", "Lg2/q;", "e", "()Lg2/q;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.C  reason: case insensitive filesystem */
public final class C5360C implements C5399w {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<C5396t, C16807N> f23488a;

    /* renamed from: b  reason: collision with root package name */
    private final C5396t f23489b;

    /* renamed from: c  reason: collision with root package name */
    private final C5393q f23490c;

    public C5360C(C17642l<? super C5396t, C16807N> lVar, C5393q qVar) {
        C5396t tVar;
        this.f23488a = lVar;
        f fVar = null;
        C5360C c10 = qVar instanceof C5360C ? (C5360C) qVar : null;
        if (!(c10 == null || (tVar = c10.f23489b) == null)) {
            fVar = tVar.d();
        }
        C5396t tVar2 = new C5396t(fVar);
        lVar.invoke(tVar2);
        this.f23489b = tVar2;
    }

    public C5393q e() {
        return this.f23490c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5360C) {
            return C17542s.e(this.f23489b, ((C5360C) obj).f23489b);
        }
        return false;
    }

    public int hashCode() {
        return this.f23489b.hashCode();
    }

    public void m(X x10) {
        this.f23489b.a(x10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5360C(C17642l lVar, C5393q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, (i10 & 2) != 0 ? null : qVar);
    }
}
