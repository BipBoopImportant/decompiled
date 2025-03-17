package wh;

import M6.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001f"}, d2 = {"Lwh/b;", "", "", "Lwh/c;", "items", "LM6/y;", "", "couponId", "familyCardNumber", "checksum", "", "applyEmployeeDiscount", "<init>", "(Ljava/util/List;LM6/y;LM6/y;LM6/y;LM6/y;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "LM6/y;", "c", "()LM6/y;", "d", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wh.b  reason: case insensitive filesystem */
public final class C10371b {

    /* renamed from: a  reason: collision with root package name */
    private final List<C10372c> f77658a;

    /* renamed from: b  reason: collision with root package name */
    private final y<String> f77659b;

    /* renamed from: c  reason: collision with root package name */
    private final y<String> f77660c;

    /* renamed from: d  reason: collision with root package name */
    private final y<String> f77661d;

    /* renamed from: e  reason: collision with root package name */
    private final y<Boolean> f77662e;

    public C10371b(List<C10372c> list, y<String> yVar, y<String> yVar2, y<String> yVar3, y<Boolean> yVar4) {
        C17542s.j(list, "items");
        C17542s.j(yVar, "couponId");
        C17542s.j(yVar2, "familyCardNumber");
        C17542s.j(yVar3, "checksum");
        C17542s.j(yVar4, "applyEmployeeDiscount");
        this.f77658a = list;
        this.f77659b = yVar;
        this.f77660c = yVar2;
        this.f77661d = yVar3;
        this.f77662e = yVar4;
    }

    public final y<Boolean> a() {
        return this.f77662e;
    }

    public final y<String> b() {
        return this.f77661d;
    }

    public final y<String> c() {
        return this.f77659b;
    }

    public final y<String> d() {
        return this.f77660c;
    }

    public final List<C10372c> e() {
        return this.f77658a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10371b)) {
            return false;
        }
        C10371b bVar = (C10371b) obj;
        return C17542s.e(this.f77658a, bVar.f77658a) && C17542s.e(this.f77659b, bVar.f77659b) && C17542s.e(this.f77660c, bVar.f77660c) && C17542s.e(this.f77661d, bVar.f77661d) && C17542s.e(this.f77662e, bVar.f77662e);
    }

    public int hashCode() {
        return (((((((this.f77658a.hashCode() * 31) + this.f77659b.hashCode()) * 31) + this.f77660c.hashCode()) * 31) + this.f77661d.hashCode()) * 31) + this.f77662e.hashCode();
    }

    public String toString() {
        List<C10372c> list = this.f77658a;
        y<String> yVar = this.f77659b;
        y<String> yVar2 = this.f77660c;
        y<String> yVar3 = this.f77661d;
        y<Boolean> yVar4 = this.f77662e;
        return "CartInput(items=" + list + ", couponId=" + yVar + ", familyCardNumber=" + yVar2 + ", checksum=" + yVar3 + ", applyEmployeeDiscount=" + yVar4 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10371b(List list, y yVar, y yVar2, y yVar3, y yVar4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? y.a.f38616b : yVar, (i10 & 4) != 0 ? y.a.f38616b : yVar2, (i10 & 8) != 0 ? y.a.f38616b : yVar3, (i10 & 16) != 0 ? y.a.f38616b : yVar4);
    }
}
