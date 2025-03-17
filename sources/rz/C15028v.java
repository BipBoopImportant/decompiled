package rz;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lrz/v;", "", "", "packageCount", "", "Lrz/u;", "mustHaves", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/util/List;", "()Ljava/util/List;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.v  reason: case insensitive filesystem */
public final class C15028v {

    /* renamed from: a  reason: collision with root package name */
    private final int f130898a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C15027u> f130899b;

    public C15028v(int i10, List<C15027u> list) {
        C17542s.j(list, "mustHaves");
        this.f130898a = i10;
        this.f130899b = list;
    }

    public final List<C15027u> a() {
        return this.f130899b;
    }

    public final int b() {
        return this.f130898a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15028v)) {
            return false;
        }
        C15028v vVar = (C15028v) obj;
        return this.f130898a == vVar.f130898a && C17542s.e(this.f130899b, vVar.f130899b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f130898a) * 31) + this.f130899b.hashCode();
    }

    public String toString() {
        int i10 = this.f130898a;
        List<C15027u> list = this.f130899b;
        return "ProductExtras(packageCount=" + i10 + ", mustHaves=" + list + ")";
    }
}
