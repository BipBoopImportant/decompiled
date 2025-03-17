package E1;

import E1.a0;
import G1.P;
import c2.t;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8TX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8TX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LE1/E;", "LE1/a0$a;", "LG1/P;", "within", "<init>", "(LG1/P;)V", "b", "LG1/P;", "", "f", "()I", "parentWidth", "Lc2/t;", "e", "()Lc2/t;", "parentLayoutDirection", "LE1/v;", "d", "()LE1/v;", "coordinates", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class E extends a0.a {

    /* renamed from: b  reason: collision with root package name */
    private final P f5840b;

    public E(P p10) {
        this.f5840b = p10;
    }

    public C4488v d() {
        C4488v o12 = this.f5840b.R1() ? null : this.f5840b.o1();
        if (o12 == null) {
            this.f5840b.P1().X().S();
        }
        return o12;
    }

    /* access modifiers changed from: protected */
    public t e() {
        return this.f5840b.getLayoutDirection();
    }

    /* access modifiers changed from: protected */
    public int f() {
        return this.f5840b.C0();
    }
}
