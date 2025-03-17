package bo;

import IC.C13023e;
import KJ.C15985a;
import KJ.C15987c;
import Op.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lbo/a;", "", "LKJ/c;", "LOp/a1;", "items", "LIC/e;", "errorMessage", "<init>", "(LKJ/c;LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "b", "()LKJ/c;", "LIC/e;", "()LIC/e;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bo.a  reason: case insensitive filesystem */
public final class C11111a {

    /* renamed from: c  reason: collision with root package name */
    public static final int f90500c = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<a1> f90501a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f90502b;

    public C11111a() {
        this((C15987c) null, (C13023e) null, 3, (DefaultConstructorMarker) null);
    }

    public final C13023e a() {
        return this.f90502b;
    }

    public final C15987c<a1> b() {
        return this.f90501a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11111a)) {
            return false;
        }
        C11111a aVar = (C11111a) obj;
        return C17542s.e(this.f90501a, aVar.f90501a) && C17542s.e(this.f90502b, aVar.f90502b);
    }

    public int hashCode() {
        int hashCode = this.f90501a.hashCode() * 31;
        C13023e eVar = this.f90502b;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        C15987c<a1> cVar = this.f90501a;
        C13023e eVar = this.f90502b;
        return "ConfirmationOrderSummaryUiState(items=" + cVar + ", errorMessage=" + eVar + ")";
    }

    public C11111a(C15987c<a1> cVar, C13023e eVar) {
        C17542s.j(cVar, "items");
        this.f90501a = cVar;
        this.f90502b = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11111a(C15987c cVar, C13023e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C15985a.a() : cVar, (i10 & 2) != 0 ? null : eVar);
    }
}
