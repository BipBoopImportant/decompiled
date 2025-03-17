package wh;

import M6.y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lwh/j;", "", "Lwh/k;", "type", "LM6/y;", "", "id", "<init>", "(Lwh/k;LM6/y;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwh/k;", "b", "()Lwh/k;", "LM6/y;", "()LM6/y;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final k f77668a;

    /* renamed from: b  reason: collision with root package name */
    private final y<String> f77669b;

    public j(k kVar, y<String> yVar) {
        C17542s.j(kVar, "type");
        C17542s.j(yVar, "id");
        this.f77668a = kVar;
        this.f77669b = yVar;
    }

    public final y<String> a() {
        return this.f77669b;
    }

    public final k b() {
        return this.f77668a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f77668a == jVar.f77668a && C17542s.e(this.f77669b, jVar.f77669b);
    }

    public int hashCode() {
        return (this.f77668a.hashCode() * 31) + this.f77669b.hashCode();
    }

    public String toString() {
        k kVar = this.f77668a;
        y<String> yVar = this.f77669b;
        return "PreferredDeliveryService(type=" + kVar + ", id=" + yVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, y yVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i10 & 2) != 0 ? y.a.f38616b : yVar);
    }
}
