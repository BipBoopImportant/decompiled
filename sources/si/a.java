package si;

import Ln.c;
import Ln.d;
import Ln.e;
import Ln.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u0018\u0010#¨\u0006$"}, d2 = {"Lsi/a;", "LLn/g;", "LLn/a;", "cartContext", "", "LLn/d;", "items", "LLn/e;", "priceHolder", "LLn/c;", "discountCode", "<init>", "(LLn/a;Ljava/util/List;LLn/e;LLn/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LLn/a;", "b", "()LLn/a;", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "LLn/e;", "()LLn/e;", "LLn/c;", "()LLn/c;", "cart-data-layer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Ln.a f76558a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f76559b;

    /* renamed from: c  reason: collision with root package name */
    private final e f76560c;

    /* renamed from: d  reason: collision with root package name */
    private final c f76561d;

    public a(Ln.a aVar, List<d> list, e eVar, c cVar) {
        C17542s.j(aVar, "cartContext");
        C17542s.j(list, "items");
        this.f76558a = aVar;
        this.f76559b = list;
        this.f76560c = eVar;
        this.f76561d = cVar;
    }

    public c a() {
        return this.f76561d;
    }

    public Ln.a b() {
        return this.f76558a;
    }

    public e c() {
        return this.f76560c;
    }

    public List<d> d() {
        return this.f76559b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f76558a, aVar.f76558a) && C17542s.e(this.f76559b, aVar.f76559b) && C17542s.e(this.f76560c, aVar.f76560c) && C17542s.e(this.f76561d, aVar.f76561d);
    }

    public int hashCode() {
        int hashCode = ((this.f76558a.hashCode() * 31) + this.f76559b.hashCode()) * 31;
        e eVar = this.f76560c;
        int i10 = 0;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        c cVar = this.f76561d;
        if (cVar != null) {
            i10 = cVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        Ln.a aVar = this.f76558a;
        List<d> list = this.f76559b;
        e eVar = this.f76560c;
        c cVar = this.f76561d;
        return "CartHolderV2(cartContext=" + aVar + ", items=" + list + ", priceHolder=" + eVar + ", discountCode=" + cVar + ")";
    }
}
