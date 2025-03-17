package jo;

import RC.n;
import Yn.F;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import lo.j;
import xB.C15201a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001a\u0010,\u001a\u00020(8\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006-"}, d2 = {"Ljo/b;", "LxB/a;", "LRC/n;", "deliveryPriceToShow", "", "Llo/j;", "deliveryArrangements", "", "showConfirmDeliveryButton", "LYn/F;", "allItemsWithProductInfo", "isCollapsed", "<init>", "(LRC/n;Ljava/util/List;ZLjava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LRC/n;", "i", "()LRC/n;", "b", "Ljava/util/List;", "h", "()Ljava/util/List;", "c", "Z", "j", "()Z", "d", "g", "e", "n", "", "f", "J", "()J", "stableId", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jo.b  reason: case insensitive filesystem */
public final class C11436b implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final n f98611a;

    /* renamed from: b  reason: collision with root package name */
    private final List<j> f98612b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f98613c;

    /* renamed from: d  reason: collision with root package name */
    private final List<F> f98614d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f98615e;

    /* renamed from: f  reason: collision with root package name */
    private final long f98616f = ((long) Objects.hash(new Object[]{P.b(C11436b.class)}));

    public C11436b(n nVar, List<j> list, boolean z10, List<F> list2, boolean z11) {
        C17542s.j(list2, "allItemsWithProductInfo");
        this.f98611a = nVar;
        this.f98612b = list;
        this.f98613c = z10;
        this.f98614d = list2;
        this.f98615e = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11436b)) {
            return false;
        }
        C11436b bVar = (C11436b) obj;
        return C17542s.e(this.f98611a, bVar.f98611a) && C17542s.e(this.f98612b, bVar.f98612b) && this.f98613c == bVar.f98613c && C17542s.e(this.f98614d, bVar.f98614d) && this.f98615e == bVar.f98615e;
    }

    public long f() {
        return this.f98616f;
    }

    public final List<F> g() {
        return this.f98614d;
    }

    public final List<j> h() {
        return this.f98612b;
    }

    public int hashCode() {
        n nVar = this.f98611a;
        int i10 = 0;
        int hashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        List<j> list = this.f98612b;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((((((hashCode + i10) * 31) + Boolean.hashCode(this.f98613c)) * 31) + this.f98614d.hashCode()) * 31) + Boolean.hashCode(this.f98615e);
    }

    public final n i() {
        return this.f98611a;
    }

    public final boolean j() {
        return this.f98613c;
    }

    public final boolean n() {
        return this.f98615e;
    }

    public String toString() {
        n nVar = this.f98611a;
        List<j> list = this.f98612b;
        boolean z10 = this.f98613c;
        List<F> list2 = this.f98614d;
        boolean z11 = this.f98615e;
        return "DeliveryDetailsUiState(deliveryPriceToShow=" + nVar + ", deliveryArrangements=" + list + ", showConfirmDeliveryButton=" + z10 + ", allItemsWithProductInfo=" + list2 + ", isCollapsed=" + z11 + ")";
    }
}
