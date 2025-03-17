package Jm;

import Am.a;
import Mm.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LJm/f;", "", "LAm/a$a;", "benefitResult", "LJm/c;", "navigateTo", "<init>", "(LAm/a$a;LJm/c;)V", "a", "(LAm/a$a;LJm/c;)LJm/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LAm/a$a;", "c", "()LAm/a$a;", "b", "LJm/c;", "d", "()LJm/c;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a.C1458a f82625a;

    /* renamed from: b  reason: collision with root package name */
    private final c f82626b;

    public f() {
        this((a.C1458a) null, (c) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ f b(f fVar, a.C1458a aVar, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = fVar.f82625a;
        }
        if ((i10 & 2) != 0) {
            cVar = fVar.f82626b;
        }
        return fVar.a(aVar, cVar);
    }

    public final f a(a.C1458a aVar, c cVar) {
        C17542s.j(aVar, "benefitResult");
        return new f(aVar, cVar);
    }

    public final a.C1458a c() {
        return this.f82625a;
    }

    public final c d() {
        return this.f82626b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C17542s.e(this.f82625a, fVar.f82625a) && C17542s.e(this.f82626b, fVar.f82626b);
    }

    public int hashCode() {
        int hashCode = this.f82625a.hashCode() * 31;
        c cVar = this.f82626b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        a.C1458a aVar = this.f82625a;
        c cVar = this.f82626b;
        return "ViewModelState(benefitResult=" + aVar + ", navigateTo=" + cVar + ")";
    }

    public f(a.C1458a aVar, c cVar) {
        C17542s.j(aVar, "benefitResult");
        this.f82625a = aVar;
        this.f82626b = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(a.C1458a aVar, c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new a.C1458a.b((d) null, 1, (DefaultConstructorMarker) null) : aVar, (i10 & 2) != 0 ? null : cVar);
    }
}
