package Tf;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"LTf/t;", "", "LIC/e;", "title", "description", "", "showFamilyRequiredWarning", "enabled", "<init>", "(LIC/e;LIC/e;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "d", "()LIC/e;", "b", "c", "Z", "()Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t {

    /* renamed from: e  reason: collision with root package name */
    public static final int f63933e = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f63934a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f63935b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f63936c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f63937d;

    public t(C13023e eVar, C13023e eVar2, boolean z10, boolean z11) {
        C17542s.j(eVar, "title");
        this.f63934a = eVar;
        this.f63935b = eVar2;
        this.f63936c = z10;
        this.f63937d = z11;
    }

    public final C13023e a() {
        return this.f63935b;
    }

    public final boolean b() {
        return this.f63937d;
    }

    public final boolean c() {
        return this.f63936c;
    }

    public final C13023e d() {
        return this.f63934a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return C17542s.e(this.f63934a, tVar.f63934a) && C17542s.e(this.f63935b, tVar.f63935b) && this.f63936c == tVar.f63936c && this.f63937d == tVar.f63937d;
    }

    public int hashCode() {
        int hashCode = this.f63934a.hashCode() * 31;
        C13023e eVar = this.f63935b;
        return ((((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + Boolean.hashCode(this.f63936c)) * 31) + Boolean.hashCode(this.f63937d);
    }

    public String toString() {
        C13023e eVar = this.f63934a;
        C13023e eVar2 = this.f63935b;
        boolean z10 = this.f63936c;
        boolean z11 = this.f63937d;
        return "DiscountEntryUiState(title=" + eVar + ", description=" + eVar2 + ", showFamilyRequiredWarning=" + z10 + ", enabled=" + z11 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(C13023e eVar, C13023e eVar2, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, eVar2, z10, (i10 & 8) != 0 ? true : z11);
    }
}
