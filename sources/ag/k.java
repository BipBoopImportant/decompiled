package ag;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lag/k;", "", "", "familySavings", "LIC/e;", "promotionMessage", "", "isLoggedIn", "<init>", "(Ljava/lang/String;LIC/e;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LIC/e;", "()LIC/e;", "c", "Z", "()Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final int f65340d = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final String f65341a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f65342b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f65343c;

    public k(String str, C13023e eVar, boolean z10) {
        C17542s.j(eVar, "promotionMessage");
        this.f65341a = str;
        this.f65342b = eVar;
        this.f65343c = z10;
    }

    public final String a() {
        return this.f65341a;
    }

    public final C13023e b() {
        return this.f65342b;
    }

    public final boolean c() {
        return this.f65343c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return C17542s.e(this.f65341a, kVar.f65341a) && C17542s.e(this.f65342b, kVar.f65342b) && this.f65343c == kVar.f65343c;
    }

    public int hashCode() {
        String str = this.f65341a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f65342b.hashCode()) * 31) + Boolean.hashCode(this.f65343c);
    }

    public String toString() {
        String str = this.f65341a;
        C13023e eVar = this.f65342b;
        boolean z10 = this.f65343c;
        return "FamilyPromotionBannerUiState(familySavings=" + str + ", promotionMessage=" + eVar + ", isLoggedIn=" + z10 + ")";
    }
}
