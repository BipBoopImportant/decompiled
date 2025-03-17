package zj;

import KJ.C15987c;
import Op.h1;
import il.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000e¨\u0006 "}, d2 = {"Lzj/j;", "", "", "itemNo", "Lzj/g;", "customerBenefit", "LKJ/c;", "LOp/h1;", "sections", "<init>", "(Ljava/lang/String;Lzj/g;LKJ/c;)V", "a", "(Ljava/lang/String;Lzj/g;LKJ/c;)Lzj/j;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "Lzj/g;", "d", "()Lzj/g;", "c", "LKJ/c;", "e", "()LKJ/c;", "articleNumber", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f107399a;

    /* renamed from: b  reason: collision with root package name */
    private final C12526g f107400b;

    /* renamed from: c  reason: collision with root package name */
    private final C15987c<h1> f107401c;

    public j(String str, C12526g gVar, C15987c<? extends h1> cVar) {
        C17542s.j(str, "itemNo");
        C17542s.j(gVar, "customerBenefit");
        C17542s.j(cVar, "sections");
        this.f107399a = str;
        this.f107400b = gVar;
        this.f107401c = cVar;
    }

    public static /* synthetic */ j b(j jVar, String str, C12526g gVar, C15987c<h1> cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jVar.f107399a;
        }
        if ((i10 & 2) != 0) {
            gVar = jVar.f107400b;
        }
        if ((i10 & 4) != 0) {
            cVar = jVar.f107401c;
        }
        return jVar.a(str, gVar, cVar);
    }

    public final j a(String str, C12526g gVar, C15987c<? extends h1> cVar) {
        C17542s.j(str, "itemNo");
        C17542s.j(gVar, "customerBenefit");
        C17542s.j(cVar, "sections");
        return new j(str, gVar, cVar);
    }

    public final String c() {
        return g.f98371a.a(this.f107399a);
    }

    public final C12526g d() {
        return this.f107400b;
    }

    public final C15987c<h1> e() {
        return this.f107401c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return C17542s.e(this.f107399a, jVar.f107399a) && C17542s.e(this.f107400b, jVar.f107400b) && C17542s.e(this.f107401c, jVar.f107401c);
    }

    public int hashCode() {
        return (((this.f107399a.hashCode() * 31) + this.f107400b.hashCode()) * 31) + this.f107401c.hashCode();
    }

    public String toString() {
        String str = this.f107399a;
        C12526g gVar = this.f107400b;
        C15987c<h1> cVar = this.f107401c;
        return "UiData(itemNo=" + str + ", customerBenefit=" + gVar + ", sections=" + cVar + ")";
    }
}
