package Of;

import KJ.C15987c;
import Ln.c;
import Of.I1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001a\u0010!R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006#"}, d2 = {"LOf/y;", "", "LKJ/c;", "LOf/I1$a;", "rewards", "LLn/c;", "discountCode", "", "cartUpdatingRewardWithCode", "", "familyRewardIsAppliedInCart", "showError", "<init>", "(LKJ/c;LLn/c;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "c", "()LKJ/c;", "b", "LLn/c;", "getDiscountCode", "()LLn/c;", "Ljava/lang/String;", "d", "Z", "()Z", "e", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Of.y  reason: case insensitive filesystem */
public final class C9227y {

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<I1.a> f62675a;

    /* renamed from: b  reason: collision with root package name */
    private final c f62676b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62677c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f62678d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f62679e;

    public C9227y(C15987c<I1.a> cVar, c cVar2, String str, boolean z10, boolean z11) {
        C17542s.j(cVar, "rewards");
        this.f62675a = cVar;
        this.f62676b = cVar2;
        this.f62677c = str;
        this.f62678d = z10;
        this.f62679e = z11;
    }

    public final String a() {
        return this.f62677c;
    }

    public final boolean b() {
        return this.f62678d;
    }

    public final C15987c<I1.a> c() {
        return this.f62675a;
    }

    public final boolean d() {
        return this.f62679e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9227y)) {
            return false;
        }
        C9227y yVar = (C9227y) obj;
        return C17542s.e(this.f62675a, yVar.f62675a) && C17542s.e(this.f62676b, yVar.f62676b) && C17542s.e(this.f62677c, yVar.f62677c) && this.f62678d == yVar.f62678d && this.f62679e == yVar.f62679e;
    }

    public int hashCode() {
        int hashCode = this.f62675a.hashCode() * 31;
        c cVar = this.f62676b;
        int i10 = 0;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.f62677c;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((hashCode2 + i10) * 31) + Boolean.hashCode(this.f62678d)) * 31) + Boolean.hashCode(this.f62679e);
    }

    public String toString() {
        C15987c<I1.a> cVar = this.f62675a;
        c cVar2 = this.f62676b;
        String str = this.f62677c;
        boolean z10 = this.f62678d;
        boolean z11 = this.f62679e;
        return "CartFamilyRewardsUiState(rewards=" + cVar + ", discountCode=" + cVar2 + ", cartUpdatingRewardWithCode=" + str + ", familyRewardIsAppliedInCart=" + z10 + ", showError=" + z11 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9227y(C15987c cVar, c cVar2, String str, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, (i10 & 4) != 0 ? null : str, z10, (i10 & 16) != 0 ? false : z11);
    }
}
