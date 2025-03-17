package rz;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"Lrz/a0;", "", "", "Lrz/b0;", "pickingList", "skippedItems", "salesOrder", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<b0> f130801a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b0> f130802b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b0> f130803c;

    public a0(List<b0> list, List<b0> list2, List<b0> list3) {
        C17542s.j(list, "pickingList");
        C17542s.j(list2, "skippedItems");
        C17542s.j(list3, "salesOrder");
        this.f130801a = list;
        this.f130802b = list2;
        this.f130803c = list3;
    }

    public final List<b0> a() {
        return this.f130801a;
    }

    public final List<b0> b() {
        return this.f130803c;
    }

    public final List<b0> c() {
        return this.f130802b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return C17542s.e(this.f130801a, a0Var.f130801a) && C17542s.e(this.f130802b, a0Var.f130802b) && C17542s.e(this.f130803c, a0Var.f130803c);
    }

    public int hashCode() {
        return (((this.f130801a.hashCode() * 31) + this.f130802b.hashCode()) * 31) + this.f130803c.hashCode();
    }

    public String toString() {
        List<b0> list = this.f130801a;
        List<b0> list2 = this.f130802b;
        List<b0> list3 = this.f130803c;
        return "UpptackaListProducts(pickingList=" + list + ", skippedItems=" + list2 + ", salesOrder=" + list3 + ")";
    }
}
