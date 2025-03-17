package XG;

import KJ.C15985a;
import KJ.C15989e;
import QG.C16219E;
import YH.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LXG/h;", "", "", "enableBuyButton", "LKJ/e;", "LQG/E$e;", "loadingButtonIds", "<init>", "(ZLKJ/e;)V", "a", "(ZLKJ/e;)LXG/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "LKJ/e;", "d", "()LKJ/e;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XG.h  reason: case insensitive filesystem */
public final class C16793h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f139763a;

    /* renamed from: b  reason: collision with root package name */
    private final C15989e<C16219E.e> f139764b;

    public C16793h() {
        this(false, (C15989e) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C16793h b(C16793h hVar, boolean z10, C15989e<C16219E.e> eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = hVar.f139763a;
        }
        if ((i10 & 2) != 0) {
            eVar = hVar.f139764b;
        }
        return hVar.a(z10, eVar);
    }

    public final C16793h a(boolean z10, C15989e<? extends C16219E.e> eVar) {
        C17542s.j(eVar, "loadingButtonIds");
        return new C16793h(z10, eVar);
    }

    public final boolean c() {
        return this.f139763a;
    }

    public final C15989e<C16219E.e> d() {
        return this.f139764b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16793h)) {
            return false;
        }
        C16793h hVar = (C16793h) obj;
        return this.f139763a == hVar.f139763a && C17542s.e(this.f139764b, hVar.f139764b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f139763a) * 31) + this.f139764b.hashCode();
    }

    public String toString() {
        boolean z10 = this.f139763a;
        C15989e<C16219E.e> eVar = this.f139764b;
        return "UniverseToolbarUIState(enableBuyButton=" + z10 + ", loadingButtonIds=" + eVar + ")";
    }

    public C16793h(boolean z10, C15989e<? extends C16219E.e> eVar) {
        C17542s.j(eVar, "loadingButtonIds");
        this.f139763a = z10;
        this.f139764b = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16793h(boolean z10, C15989e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? C15985a.j(g0.d()) : eVar);
    }
}
