package iz;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.S;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"Liz/s;", "", "", "Lrz/S;", "barcodeList", "salesOrderList", "pickingList", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.s  reason: case insensitive filesystem */
public final class C14605s {

    /* renamed from: a  reason: collision with root package name */
    private final List<S> f127787a;

    /* renamed from: b  reason: collision with root package name */
    private final List<S> f127788b;

    /* renamed from: c  reason: collision with root package name */
    private final List<S> f127789c;

    public C14605s(List<S> list, List<S> list2, List<S> list3) {
        C17542s.j(list, "barcodeList");
        C17542s.j(list2, "salesOrderList");
        C17542s.j(list3, "pickingList");
        this.f127787a = list;
        this.f127788b = list2;
        this.f127789c = list3;
    }

    public final List<S> a() {
        return this.f127787a;
    }

    public final List<S> b() {
        return this.f127789c;
    }

    public final List<S> c() {
        return this.f127788b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14605s)) {
            return false;
        }
        C14605s sVar = (C14605s) obj;
        return C17542s.e(this.f127787a, sVar.f127787a) && C17542s.e(this.f127788b, sVar.f127788b) && C17542s.e(this.f127789c, sVar.f127789c);
    }

    public int hashCode() {
        return (((this.f127787a.hashCode() * 31) + this.f127788b.hashCode()) * 31) + this.f127789c.hashCode();
    }

    public String toString() {
        List<S> list = this.f127787a;
        List<S> list2 = this.f127788b;
        List<S> list3 = this.f127789c;
        return "SyncCartProducts(barcodeList=" + list + ", salesOrderList=" + list2 + ", pickingList=" + list3 + ")";
    }
}
