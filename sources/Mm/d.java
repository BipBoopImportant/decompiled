package Mm;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"LMm/d;", "", "", "LMm/a;", "carousel", "all", "featured", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "id", "b", "(Ljava/lang/String;)LMm/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "benefits_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f83488a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f83489b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a> f83490c;

    public d(List<a> list, List<a> list2, List<a> list3) {
        C17542s.j(list, "carousel");
        C17542s.j(list2, "all");
        C17542s.j(list3, "featured");
        this.f83488a = list;
        this.f83489b = list2;
        this.f83490c = list3;
    }

    public final List<a> a() {
        return this.f83489b;
    }

    public final a b(String str) {
        Object obj;
        C17542s.j(str, "id");
        Iterator it = this.f83489b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((a) obj).d(), str)) {
                break;
            }
        }
        return (a) obj;
    }

    public final List<a> c() {
        return this.f83488a;
    }

    public final List<a> d() {
        return this.f83490c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return C17542s.e(this.f83488a, dVar.f83488a) && C17542s.e(this.f83489b, dVar.f83489b) && C17542s.e(this.f83490c, dVar.f83490c);
    }

    public int hashCode() {
        return (((this.f83488a.hashCode() * 31) + this.f83489b.hashCode()) * 31) + this.f83490c.hashCode();
    }

    public String toString() {
        List<a> list = this.f83488a;
        List<a> list2 = this.f83489b;
        List<a> list3 = this.f83490c;
        return "FamilyBenefits(carousel=" + list + ", all=" + list2 + ", featured=" + list3 + ")";
    }
}
