package It;

import Gt.d;
import Gt.f;
import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"LIt/p;", "", "LGt/f;", "storeDetails", "LGt/d;", "popularTimesLiveData", "LKJ/c;", "LIt/C;", "shortcuts", "<init>", "(LGt/f;LGt/d;LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGt/f;", "c", "()LGt/f;", "b", "LGt/d;", "()LGt/d;", "LKJ/c;", "()LKJ/c;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final f f82365a;

    /* renamed from: b  reason: collision with root package name */
    private final d f82366b;

    /* renamed from: c  reason: collision with root package name */
    private final C15987c<C> f82367c;

    public p(f fVar, d dVar, C15987c<? extends C> cVar) {
        C17542s.j(fVar, "storeDetails");
        C17542s.j(cVar, "shortcuts");
        this.f82365a = fVar;
        this.f82366b = dVar;
        this.f82367c = cVar;
    }

    public final d a() {
        return this.f82366b;
    }

    public final C15987c<C> b() {
        return this.f82367c;
    }

    public final f c() {
        return this.f82365a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return C17542s.e(this.f82365a, pVar.f82365a) && C17542s.e(this.f82366b, pVar.f82366b) && C17542s.e(this.f82367c, pVar.f82367c);
    }

    public int hashCode() {
        int hashCode = this.f82365a.hashCode() * 31;
        d dVar = this.f82366b;
        return ((hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f82367c.hashCode();
    }

    public String toString() {
        f fVar = this.f82365a;
        d dVar = this.f82366b;
        C15987c<C> cVar = this.f82367c;
        return "HeaderContent(storeDetails=" + fVar + ", popularTimesLiveData=" + dVar + ", shortcuts=" + cVar + ")";
    }
}
