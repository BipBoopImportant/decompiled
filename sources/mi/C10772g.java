package Mi;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u001e\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"LMi/g;", "", "", "avgRating", "", "totalNbrOfRatings", "", "LMi/f;", "detailedRatings", "LMi/d;", "legalInfo", "LMi/o;", "verifiedPurchase", "<init>", "(FILjava/util/List;LMi/d;LMi/o;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "I", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "LMi/d;", "()LMi/d;", "e", "LMi/o;", "()LMi/o;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Mi.g  reason: case insensitive filesystem */
public final class C10772g {

    /* renamed from: a  reason: collision with root package name */
    private final float f83391a;

    /* renamed from: b  reason: collision with root package name */
    private final int f83392b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C10771f> f83393c;

    /* renamed from: d  reason: collision with root package name */
    private final C10769d f83394d;

    /* renamed from: e  reason: collision with root package name */
    private final o f83395e;

    public C10772g(float f10, int i10, List<C10771f> list, C10769d dVar, o oVar) {
        C17542s.j(list, "detailedRatings");
        this.f83391a = f10;
        this.f83392b = i10;
        this.f83393c = list;
        this.f83394d = dVar;
        this.f83395e = oVar;
    }

    public final float a() {
        return this.f83391a;
    }

    public final List<C10771f> b() {
        return this.f83393c;
    }

    public final C10769d c() {
        return this.f83394d;
    }

    public final int d() {
        return this.f83392b;
    }

    public final o e() {
        return this.f83395e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10772g)) {
            return false;
        }
        C10772g gVar = (C10772g) obj;
        return Float.compare(this.f83391a, gVar.f83391a) == 0 && this.f83392b == gVar.f83392b && C17542s.e(this.f83393c, gVar.f83393c) && C17542s.e(this.f83394d, gVar.f83394d) && C17542s.e(this.f83395e, gVar.f83395e);
    }

    public int hashCode() {
        int hashCode = ((((Float.hashCode(this.f83391a) * 31) + Integer.hashCode(this.f83392b)) * 31) + this.f83393c.hashCode()) * 31;
        C10769d dVar = this.f83394d;
        int i10 = 0;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        o oVar = this.f83395e;
        if (oVar != null) {
            i10 = oVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        float f10 = this.f83391a;
        int i10 = this.f83392b;
        List<C10771f> list = this.f83393c;
        C10769d dVar = this.f83394d;
        o oVar = this.f83395e;
        return "ProductDetailsSummary(avgRating=" + f10 + ", totalNbrOfRatings=" + i10 + ", detailedRatings=" + list + ", legalInfo=" + dVar + ", verifiedPurchase=" + oVar + ")";
    }
}
