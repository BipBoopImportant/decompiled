package ei;

import KJ.C15987c;
import Op.C10828d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u0018\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001b\u0010'¨\u0006("}, d2 = {"Lei/j0;", "", "", "itemNo", "itemType", "LOp/d$h;", "info", "LKJ/c;", "LOp/d$g;", "productDisclaimers", "Lkp/d;", "currencyConfig", "", "familyAndRegularPriceSameSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;LOp/d$h;LKJ/c;Lkp/d;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "getItemType", "c", "LOp/d$h;", "()LOp/d$h;", "LKJ/c;", "e", "()LKJ/c;", "Lkp/d;", "()Lkp/d;", "f", "Z", "()Z", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f72870a;

    /* renamed from: b  reason: collision with root package name */
    private final String f72871b;

    /* renamed from: c  reason: collision with root package name */
    private final C10828d.h f72872c;

    /* renamed from: d  reason: collision with root package name */
    private final C15987c<C10828d.g> f72873d;

    /* renamed from: e  reason: collision with root package name */
    private final C11522d f72874e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f72875f;

    public j0(String str, String str2, C10828d.h hVar, C15987c<C10828d.g> cVar, C11522d dVar, boolean z10) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "itemType");
        C17542s.j(hVar, "info");
        C17542s.j(cVar, "productDisclaimers");
        C17542s.j(dVar, "currencyConfig");
        this.f72870a = str;
        this.f72871b = str2;
        this.f72872c = hVar;
        this.f72873d = cVar;
        this.f72874e = dVar;
        this.f72875f = z10;
    }

    public final C11522d a() {
        return this.f72874e;
    }

    public final boolean b() {
        return this.f72875f;
    }

    public final C10828d.h c() {
        return this.f72872c;
    }

    public final String d() {
        return this.f72870a;
    }

    public final C15987c<C10828d.g> e() {
        return this.f72873d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return C17542s.e(this.f72870a, j0Var.f72870a) && C17542s.e(this.f72871b, j0Var.f72871b) && C17542s.e(this.f72872c, j0Var.f72872c) && C17542s.e(this.f72873d, j0Var.f72873d) && C17542s.e(this.f72874e, j0Var.f72874e) && this.f72875f == j0Var.f72875f;
    }

    public int hashCode() {
        return (((((((((this.f72870a.hashCode() * 31) + this.f72871b.hashCode()) * 31) + this.f72872c.hashCode()) * 31) + this.f72873d.hashCode()) * 31) + this.f72874e.hashCode()) * 31) + Boolean.hashCode(this.f72875f);
    }

    public String toString() {
        String str = this.f72870a;
        String str2 = this.f72871b;
        C10828d.h hVar = this.f72872c;
        C15987c<C10828d.g> cVar = this.f72873d;
        C11522d dVar = this.f72874e;
        boolean z10 = this.f72875f;
        return "SkapaPricePackageDelegateModel(itemNo=" + str + ", itemType=" + str2 + ", info=" + hVar + ", productDisclaimers=" + cVar + ", currencyConfig=" + dVar + ", familyAndRegularPriceSameSize=" + z10 + ")";
    }
}
