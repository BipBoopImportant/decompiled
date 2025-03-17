package LG;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ6\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LLG/j;", "", "", "titleRes", "", "LLG/c;", "items", "selectedITem", "<init>", "(ILjava/util/List;LLG/c;)V", "a", "(ILjava/util/List;LLG/c;)LLG/j;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "e", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "LLG/c;", "d", "()LLG/c;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final int f136072a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C16006c> f136073b;

    /* renamed from: c  reason: collision with root package name */
    private final C16006c f136074c;

    public j(int i10, List<C16006c> list, C16006c cVar) {
        C17542s.j(list, "items");
        this.f136072a = i10;
        this.f136073b = list;
        this.f136074c = cVar;
    }

    public static /* synthetic */ j b(j jVar, int i10, List<C16006c> list, C16006c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = jVar.f136072a;
        }
        if ((i11 & 2) != 0) {
            list = jVar.f136073b;
        }
        if ((i11 & 4) != 0) {
            cVar = jVar.f136074c;
        }
        return jVar.a(i10, list, cVar);
    }

    public final j a(int i10, List<C16006c> list, C16006c cVar) {
        C17542s.j(list, "items");
        return new j(i10, list, cVar);
    }

    public final List<C16006c> c() {
        return this.f136073b;
    }

    public final C16006c d() {
        return this.f136074c;
    }

    public final int e() {
        return this.f136072a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f136072a == jVar.f136072a && C17542s.e(this.f136073b, jVar.f136073b) && C17542s.e(this.f136074c, jVar.f136074c);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f136072a) * 31) + this.f136073b.hashCode()) * 31;
        C16006c cVar = this.f136074c;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        int i10 = this.f136072a;
        List<C16006c> list = this.f136073b;
        C16006c cVar = this.f136074c;
        return "SmileRatingBarUIState(titleRes=" + i10 + ", items=" + list + ", selectedITem=" + cVar + ")";
    }
}
