package sy;

import KJ.C15987c;
import com.ingka.ikea.core.model.KeyBenefit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lsy/e;", "Lsy/d;", "", "id", "LKJ/c;", "Lcom/ingka/ikea/core/model/KeyBenefit;", "uniqueSellingPoints", "<init>", "(Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "LKJ/c;", "()LKJ/c;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f131034a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<KeyBenefit> f131035b;

    public e(String str, C15987c<KeyBenefit> cVar) {
        C17542s.j(str, "id");
        C17542s.j(cVar, "uniqueSellingPoints");
        this.f131034a = str;
        this.f131035b = cVar;
    }

    public final C15987c<KeyBenefit> a() {
        return this.f131035b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f131034a, eVar.f131034a) && C17542s.e(this.f131035b, eVar.f131035b);
    }

    public String getId() {
        return this.f131034a;
    }

    public int hashCode() {
        return (this.f131034a.hashCode() * 31) + this.f131035b.hashCode();
    }

    public String toString() {
        String str = this.f131034a;
        C15987c<KeyBenefit> cVar = this.f131035b;
        return "UniqueSellingPointsSlotModel(id=" + str + ", uniqueSellingPoints=" + cVar + ")";
    }
}
