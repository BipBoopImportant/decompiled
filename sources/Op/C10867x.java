package Op;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, d2 = {"LOp/x;", "", "", "isInFavourites", "showAddToFavourites", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Op.x  reason: case insensitive filesystem */
public final class C10867x {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f85337a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f85338b;

    public C10867x(boolean z10, boolean z11) {
        this.f85337a = z10;
        this.f85338b = z11;
    }

    public final boolean a() {
        return this.f85338b;
    }

    public final boolean b() {
        return this.f85337a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10867x)) {
            return false;
        }
        C10867x xVar = (C10867x) obj;
        return this.f85337a == xVar.f85337a && this.f85338b == xVar.f85338b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f85337a) * 31) + Boolean.hashCode(this.f85338b);
    }

    public String toString() {
        boolean z10 = this.f85337a;
        boolean z11 = this.f85338b;
        return "FavouritesState(isInFavourites=" + z10 + ", showAddToFavourites=" + z11 + ")";
    }
}
