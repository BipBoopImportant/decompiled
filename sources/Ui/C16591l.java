package UI;

import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: UI.l  reason: case insensitive filesystem */
public final class C16591l {

    /* renamed from: a  reason: collision with root package name */
    private final C16590k f139047a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f139048b;

    public C16591l(C16590k kVar, boolean z10) {
        C17542s.j(kVar, "qualifier");
        this.f139047a = kVar;
        this.f139048b = z10;
    }

    public static /* synthetic */ C16591l b(C16591l lVar, C16590k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = lVar.f139047a;
        }
        if ((i10 & 2) != 0) {
            z10 = lVar.f139048b;
        }
        return lVar.a(kVar, z10);
    }

    public final C16591l a(C16590k kVar, boolean z10) {
        C17542s.j(kVar, "qualifier");
        return new C16591l(kVar, z10);
    }

    public final C16590k c() {
        return this.f139047a;
    }

    public final boolean d() {
        return this.f139048b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16591l)) {
            return false;
        }
        C16591l lVar = (C16591l) obj;
        return this.f139047a == lVar.f139047a && this.f139048b == lVar.f139048b;
    }

    public int hashCode() {
        return (this.f139047a.hashCode() * 31) + Boolean.hashCode(this.f139048b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f139047a + ", isForWarningOnly=" + this.f139048b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16591l(C16590k kVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i10 & 2) != 0 ? false : z10);
    }
}
