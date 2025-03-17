package uk;

import De.a;
import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Luk/A1;", "", "", "listId", "LKJ/c;", "itemNos", "LDe/a;", "component", "<init>", "(Ljava/lang/String;LKJ/c;LDe/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LKJ/c;", "()LKJ/c;", "LDe/a;", "()LDe/a;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class A1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f103429a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<String> f103430b;

    /* renamed from: c  reason: collision with root package name */
    private final a f103431c;

    public A1(String str, C15987c<String> cVar, a aVar) {
        C17542s.j(str, "listId");
        C17542s.j(cVar, "itemNos");
        C17542s.j(aVar, "component");
        this.f103429a = str;
        this.f103430b = cVar;
        this.f103431c = aVar;
    }

    public final a a() {
        return this.f103431c;
    }

    public final C15987c<String> b() {
        return this.f103430b;
    }

    public final String c() {
        return this.f103429a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A1)) {
            return false;
        }
        A1 a12 = (A1) obj;
        return C17542s.e(this.f103429a, a12.f103429a) && C17542s.e(this.f103430b, a12.f103430b) && C17542s.e(this.f103431c, a12.f103431c);
    }

    public int hashCode() {
        return (((this.f103429a.hashCode() * 31) + this.f103430b.hashCode()) * 31) + this.f103431c.hashCode();
    }

    public String toString() {
        String str = this.f103429a;
        C15987c<String> cVar = this.f103430b;
        a aVar = this.f103431c;
        return "CarouselAnalyticsData(listId=" + str + ", itemNos=" + cVar + ", component=" + aVar + ")";
    }
}
