package Q0;

import U0.C4899r0;
import U0.o1;
import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C5848T;
import s0.C5850V;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\rR+\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00018F@FX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"LQ0/p;", "Ls0/T;", "initialInsets", "<init>", "(Ls0/T;)V", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "", "c", "(Lc2/d;Lc2/t;)I", "a", "(Lc2/d;)I", "d", "b", "<set-?>", "LU0/r0;", "e", "()Ls0/T;", "f", "insets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p implements C5848T {

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0 f12039b;

    public p() {
        this((C5848T) null, 1, (DefaultConstructorMarker) null);
    }

    public int a(d dVar) {
        return e().a(dVar);
    }

    public int b(d dVar) {
        return e().b(dVar);
    }

    public int c(d dVar, t tVar) {
        return e().c(dVar, tVar);
    }

    public int d(d dVar, t tVar) {
        return e().d(dVar, tVar);
    }

    public final C5848T e() {
        return (C5848T) this.f12039b.getValue();
    }

    public final void f(C5848T t10) {
        this.f12039b.setValue(t10);
    }

    public p(C5848T t10) {
        this.f12039b = u1.e(t10, (o1) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(C5848T t10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C5850V.a(0, 0, 0, 0) : t10);
    }
}
