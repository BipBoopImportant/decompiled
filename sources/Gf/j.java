package Gf;

import Es.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qe.C10189b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LGf/j;", "", "Lqe/b;", "alertMessageState", "LEs/a;", "inboxState", "<init>", "(Lqe/b;LEs/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqe/b;", "()Lqe/b;", "b", "LEs/a;", "()LEs/a;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final C10189b f60724a;

    /* renamed from: b  reason: collision with root package name */
    private final a f60725b;

    public j() {
        this((C10189b) null, (a) null, 3, (DefaultConstructorMarker) null);
    }

    public final C10189b a() {
        return this.f60724a;
    }

    public final a b() {
        return this.f60725b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return C17542s.e(this.f60724a, jVar.f60724a) && C17542s.e(this.f60725b, jVar.f60725b);
    }

    public int hashCode() {
        return (this.f60724a.hashCode() * 31) + this.f60725b.hashCode();
    }

    public String toString() {
        C10189b bVar = this.f60724a;
        a aVar = this.f60725b;
        return "TopAppBarUiState(alertMessageState=" + bVar + ", inboxState=" + aVar + ")";
    }

    public j(C10189b bVar, a aVar) {
        C17542s.j(bVar, "alertMessageState");
        C17542s.j(aVar, "inboxState");
        this.f60724a = bVar;
        this.f60725b = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(C10189b bVar, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C10189b.c.f76050a : bVar, (i10 & 2) != 0 ? a.b.f80780a : aVar);
    }
}
