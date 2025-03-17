package uk;

import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Luk/D1;", "", "", "plpNavigationId", "title", "LKJ/c;", "includedItemNos", "<init>", "(Ljava/lang/String;Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LKJ/c;", "()LKJ/c;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class D1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f103443a;

    /* renamed from: b  reason: collision with root package name */
    private final String f103444b;

    /* renamed from: c  reason: collision with root package name */
    private final C15987c<String> f103445c;

    public D1(String str, String str2, C15987c<String> cVar) {
        C17542s.j(str, "plpNavigationId");
        C17542s.j(str2, "title");
        C17542s.j(cVar, "includedItemNos");
        this.f103443a = str;
        this.f103444b = str2;
        this.f103445c = cVar;
    }

    public final C15987c<String> a() {
        return this.f103445c;
    }

    public final String b() {
        return this.f103443a;
    }

    public final String c() {
        return this.f103444b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D1)) {
            return false;
        }
        D1 d12 = (D1) obj;
        return C17542s.e(this.f103443a, d12.f103443a) && C17542s.e(this.f103444b, d12.f103444b) && C17542s.e(this.f103445c, d12.f103445c);
    }

    public int hashCode() {
        return (((this.f103443a.hashCode() * 31) + this.f103444b.hashCode()) * 31) + this.f103445c.hashCode();
    }

    public String toString() {
        String str = this.f103443a;
        String str2 = this.f103444b;
        C15987c<String> cVar = this.f103445c;
        return "PlpNavigationData(plpNavigationId=" + str + ", title=" + str2 + ", includedItemNos=" + cVar + ")";
    }
}
