package mi;

import KJ.C15985a;
import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mi.b;
import mi.i;
import oi.a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b\u0019\u0010(¨\u0006)"}, d2 = {"Lmi/l;", "", "", "isLoading", "hasError", "Lmi/i;", "shareButtonUiState", "Loi/a;", "messageState", "LKJ/c;", "Lmi/k;", "uiData", "Lmi/b;", "addToCartButtonState", "<init>", "(ZZLmi/i;Loi/a;LKJ/c;Lmi/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "f", "()Z", "b", "c", "Lmi/i;", "d", "()Lmi/i;", "Loi/a;", "()Loi/a;", "e", "LKJ/c;", "()LKJ/c;", "Lmi/b;", "()Lmi/b;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f75504a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f75505b;

    /* renamed from: c  reason: collision with root package name */
    private final i f75506c;

    /* renamed from: d  reason: collision with root package name */
    private final a f75507d;

    /* renamed from: e  reason: collision with root package name */
    private final C15987c<k> f75508e;

    /* renamed from: f  reason: collision with root package name */
    private final b f75509f;

    public l(boolean z10, boolean z11, i iVar, a aVar, C15987c<? extends k> cVar, b bVar) {
        C17542s.j(iVar, "shareButtonUiState");
        C17542s.j(cVar, "uiData");
        C17542s.j(bVar, "addToCartButtonState");
        this.f75504a = z10;
        this.f75505b = z11;
        this.f75506c = iVar;
        this.f75507d = aVar;
        this.f75508e = cVar;
        this.f75509f = bVar;
    }

    public final b a() {
        return this.f75509f;
    }

    public final boolean b() {
        return this.f75505b;
    }

    public final a c() {
        return this.f75507d;
    }

    public final i d() {
        return this.f75506c;
    }

    public final C15987c<k> e() {
        return this.f75508e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f75504a == lVar.f75504a && this.f75505b == lVar.f75505b && C17542s.e(this.f75506c, lVar.f75506c) && C17542s.e(this.f75507d, lVar.f75507d) && C17542s.e(this.f75508e, lVar.f75508e) && C17542s.e(this.f75509f, lVar.f75509f);
    }

    public final boolean f() {
        return this.f75504a;
    }

    public int hashCode() {
        int hashCode = ((((Boolean.hashCode(this.f75504a) * 31) + Boolean.hashCode(this.f75505b)) * 31) + this.f75506c.hashCode()) * 31;
        a aVar = this.f75507d;
        return ((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f75508e.hashCode()) * 31) + this.f75509f.hashCode();
    }

    public String toString() {
        boolean z10 = this.f75504a;
        boolean z11 = this.f75505b;
        i iVar = this.f75506c;
        a aVar = this.f75507d;
        C15987c<k> cVar = this.f75508e;
        b bVar = this.f75509f;
        return "UiState(isLoading=" + z10 + ", hasError=" + z11 + ", shareButtonUiState=" + iVar + ", messageState=" + aVar + ", uiData=" + cVar + ", addToCartButtonState=" + bVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(boolean z10, boolean z11, i iVar, a aVar, C15987c cVar, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? i.a.f75477a : iVar, (i10 & 8) != 0 ? null : aVar, (i10 & 16) != 0 ? C15985a.a() : cVar, (i10 & 32) != 0 ? b.a.f75459a : bVar);
    }
}
