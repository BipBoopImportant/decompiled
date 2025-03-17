package oK;

import c2.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import t1.C5942c;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LoK/t;", "", "LoK/u;", "tile", "Lt1/c;", "painter", "<init>", "(LoK/u;Lt1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LoK/u;", "b", "Lt1/c;", "()Lt1/c;", "Lc2/p;", "()Lc2/p;", "bounds", "c", "()Z", "isBase", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final u f145428a;

    /* renamed from: b  reason: collision with root package name */
    private final C5942c f145429b;

    public t(u uVar, C5942c cVar) {
        C17542s.j(uVar, "tile");
        this.f145428a = uVar;
        this.f145429b = cVar;
    }

    public final p a() {
        return this.f145428a.a();
    }

    public final C5942c b() {
        return this.f145429b;
    }

    public final boolean c() {
        return this.f145428a.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return C17542s.e(this.f145428a, tVar.f145428a) && C17542s.e(this.f145429b, tVar.f145429b);
    }

    public int hashCode() {
        int hashCode = this.f145428a.hashCode() * 31;
        C5942c cVar = this.f145429b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        u uVar = this.f145428a;
        C5942c cVar = this.f145429b;
        return "ViewportImageTile(tile=" + uVar + ", painter=" + cVar + ")";
    }
}
