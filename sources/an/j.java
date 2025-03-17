package An;

import KJ.C15987c;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import vn.C12197b;
import vn.c;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LAn/j;", "LAn/o;", "LKJ/c;", "Lvn/b;", "filters", "Lvn/c;", "sortOptions", "", "totalNumberOfProducts", "<init>", "(LKJ/c;LKJ/c;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "g", "()LKJ/c;", "b", "h", "c", "I", "i", "", "d", "J", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends o {

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<C12197b> f79007a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<c> f79008b;

    /* renamed from: c  reason: collision with root package name */
    private final int f79009c;

    /* renamed from: d  reason: collision with root package name */
    private final long f79010d = ((long) Objects.hash(new Object[]{P.b(j.class)}));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(C15987c<C12197b> cVar, C15987c<c> cVar2, int i10) {
        super((DefaultConstructorMarker) null);
        C17542s.j(cVar, "filters");
        C17542s.j(cVar2, "sortOptions");
        this.f79007a = cVar;
        this.f79008b = cVar2;
        this.f79009c = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return C17542s.e(this.f79007a, jVar.f79007a) && C17542s.e(this.f79008b, jVar.f79008b) && this.f79009c == jVar.f79009c;
    }

    public long f() {
        return this.f79010d;
    }

    public final C15987c<C12197b> g() {
        return this.f79007a;
    }

    public final C15987c<c> h() {
        return this.f79008b;
    }

    public int hashCode() {
        return (((this.f79007a.hashCode() * 31) + this.f79008b.hashCode()) * 31) + Integer.hashCode(this.f79009c);
    }

    public final int i() {
        return this.f79009c;
    }

    public String toString() {
        C15987c<C12197b> cVar = this.f79007a;
        C15987c<c> cVar2 = this.f79008b;
        int i10 = this.f79009c;
        return "FiltersUiModel(filters=" + cVar + ", sortOptions=" + cVar2 + ", totalNumberOfProducts=" + i10 + ")";
    }
}
