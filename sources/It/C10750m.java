package It;

import IC.C13023e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"LIt/m;", "", "LIC/e;", "title", "", "LIt/s;", "items", "<init>", "(LIC/e;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "Ljava/util/List;", "()Ljava/util/List;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: It.m  reason: case insensitive filesystem */
public final class C10750m {

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f82351a;

    /* renamed from: b  reason: collision with root package name */
    private final List<s> f82352b;

    public C10750m(C13023e eVar, List<? extends s> list) {
        C17542s.j(eVar, "title");
        C17542s.j(list, "items");
        this.f82351a = eVar;
        this.f82352b = list;
    }

    public final List<s> a() {
        return this.f82352b;
    }

    public final C13023e b() {
        return this.f82351a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10750m)) {
            return false;
        }
        C10750m mVar = (C10750m) obj;
        return C17542s.e(this.f82351a, mVar.f82351a) && C17542s.e(this.f82352b, mVar.f82352b);
    }

    public int hashCode() {
        return (this.f82351a.hashCode() * 31) + this.f82352b.hashCode();
    }

    public String toString() {
        C13023e eVar = this.f82351a;
        List<s> list = this.f82352b;
        return "AppBar(title=" + eVar + ", items=" + list + ")";
    }
}
