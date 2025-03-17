package Op;

import Op.C10850o;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import xB.C15201a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00102\u001a\u00020.8\u0016X\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101¨\u00063"}, d2 = {"LOp/d1;", "LxB/a;", "LOp/o$a;", "addToCartState", "LOp/x;", "favouritesState", "LOp/d;", "productItem", "Lkp/d;", "currencyConfig", "", "familyAndRegularPriceSameSize", "<init>", "(LOp/o$a;LOp/x;LOp/d;Lkp/d;Z)V", "g", "(LOp/o$a;LOp/x;LOp/d;Lkp/d;Z)LOp/d1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LOp/o$a;", "i", "()LOp/o$a;", "b", "LOp/x;", "o", "()LOp/x;", "c", "LOp/d;", "p", "()LOp/d;", "d", "Lkp/d;", "j", "()Lkp/d;", "e", "Z", "n", "()Z", "", "f", "J", "()J", "stableId", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d1 implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final C10850o.a f85150a;

    /* renamed from: b  reason: collision with root package name */
    private final C10867x f85151b;

    /* renamed from: c  reason: collision with root package name */
    private final C10828d f85152c;

    /* renamed from: d  reason: collision with root package name */
    private final C11522d f85153d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f85154e;

    /* renamed from: f  reason: collision with root package name */
    private final long f85155f;

    public d1(C10850o.a aVar, C10867x xVar, C10828d dVar, C11522d dVar2, boolean z10) {
        C17542s.j(xVar, "favouritesState");
        C17542s.j(dVar, "productItem");
        C17542s.j(dVar2, "currencyConfig");
        this.f85150a = aVar;
        this.f85151b = xVar;
        this.f85152c = dVar;
        this.f85153d = dVar2;
        this.f85154e = z10;
        this.f85155f = Long.parseLong(dVar.f());
    }

    public static /* synthetic */ d1 h(d1 d1Var, C10850o.a aVar, C10867x xVar, C10828d dVar, C11522d dVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = d1Var.f85150a;
        }
        if ((i10 & 2) != 0) {
            xVar = d1Var.f85151b;
        }
        C10867x xVar2 = xVar;
        if ((i10 & 4) != 0) {
            dVar = d1Var.f85152c;
        }
        C10828d dVar3 = dVar;
        if ((i10 & 8) != 0) {
            dVar2 = d1Var.f85153d;
        }
        C11522d dVar4 = dVar2;
        if ((i10 & 16) != 0) {
            z10 = d1Var.f85154e;
        }
        return d1Var.g(aVar, xVar2, dVar3, dVar4, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return C17542s.e(this.f85150a, d1Var.f85150a) && C17542s.e(this.f85151b, d1Var.f85151b) && C17542s.e(this.f85152c, d1Var.f85152c) && C17542s.e(this.f85153d, d1Var.f85153d) && this.f85154e == d1Var.f85154e;
    }

    public long f() {
        return this.f85155f;
    }

    public final d1 g(C10850o.a aVar, C10867x xVar, C10828d dVar, C11522d dVar2, boolean z10) {
        C17542s.j(xVar, "favouritesState");
        C17542s.j(dVar, "productItem");
        C17542s.j(dVar2, "currencyConfig");
        return new d1(aVar, xVar, dVar, dVar2, z10);
    }

    public int hashCode() {
        C10850o.a aVar = this.f85150a;
        return ((((((((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f85151b.hashCode()) * 31) + this.f85152c.hashCode()) * 31) + this.f85153d.hashCode()) * 31) + Boolean.hashCode(this.f85154e);
    }

    public final C10850o.a i() {
        return this.f85150a;
    }

    public final C11522d j() {
        return this.f85153d;
    }

    public final boolean n() {
        return this.f85154e;
    }

    public final C10867x o() {
        return this.f85151b;
    }

    public final C10828d p() {
        return this.f85152c;
    }

    public String toString() {
        C10850o.a aVar = this.f85150a;
        C10867x xVar = this.f85151b;
        C10828d dVar = this.f85152c;
        C11522d dVar2 = this.f85153d;
        boolean z10 = this.f85154e;
        return "ProductItemUiModel(addToCartState=" + aVar + ", favouritesState=" + xVar + ", productItem=" + dVar + ", currencyConfig=" + dVar2 + ", familyAndRegularPriceSameSize=" + z10 + ")";
    }
}
