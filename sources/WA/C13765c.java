package WA;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LWA/c;", "", "LWA/b;", "item", "LWA/a;", "details", "<init>", "(LWA/b;LWA/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWA/b;", "b", "()LWA/b;", "LWA/a;", "()LWA/a;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WA.c  reason: case insensitive filesystem */
public final class C13765c {

    /* renamed from: a  reason: collision with root package name */
    private final C13764b f117461a;

    /* renamed from: b  reason: collision with root package name */
    private final C13763a f117462b;

    public C13765c(C13764b bVar, C13763a aVar) {
        C17542s.j(bVar, "item");
        C17542s.j(aVar, "details");
        this.f117461a = bVar;
        this.f117462b = aVar;
    }

    public final C13763a a() {
        return this.f117462b;
    }

    public final C13764b b() {
        return this.f117461a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13765c)) {
            return false;
        }
        C13765c cVar = (C13765c) obj;
        return C17542s.e(this.f117461a, cVar.f117461a) && C17542s.e(this.f117462b, cVar.f117462b);
    }

    public int hashCode() {
        return (this.f117461a.hashCode() * 31) + this.f117462b.hashCode();
    }

    public String toString() {
        C13764b bVar = this.f117461a;
        C13763a aVar = this.f117462b;
        return "ArticleWithDetailsHolder(item=" + bVar + ", details=" + aVar + ")";
    }
}
