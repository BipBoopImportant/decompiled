package MI;

import UI.C16590k;
import UI.C16591l;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final C16591l f136394a;

    /* renamed from: b  reason: collision with root package name */
    private final Collection<C16059c> f136395b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f136396c;

    public w(C16591l lVar, Collection<? extends C16059c> collection, boolean z10) {
        C17542s.j(lVar, "nullabilityQualifier");
        C17542s.j(collection, "qualifierApplicabilityTypes");
        this.f136394a = lVar;
        this.f136395b = collection;
        this.f136396c = z10;
    }

    public static /* synthetic */ w b(w wVar, C16591l lVar, Collection<C16059c> collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = wVar.f136394a;
        }
        if ((i10 & 2) != 0) {
            collection = wVar.f136395b;
        }
        if ((i10 & 4) != 0) {
            z10 = wVar.f136396c;
        }
        return wVar.a(lVar, collection, z10);
    }

    public final w a(C16591l lVar, Collection<? extends C16059c> collection, boolean z10) {
        C17542s.j(lVar, "nullabilityQualifier");
        C17542s.j(collection, "qualifierApplicabilityTypes");
        return new w(lVar, collection, z10);
    }

    public final boolean c() {
        return this.f136396c;
    }

    public final C16591l d() {
        return this.f136394a;
    }

    public final Collection<C16059c> e() {
        return this.f136395b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return C17542s.e(this.f136394a, wVar.f136394a) && C17542s.e(this.f136395b, wVar.f136395b) && this.f136396c == wVar.f136396c;
    }

    public int hashCode() {
        return (((this.f136394a.hashCode() * 31) + this.f136395b.hashCode()) * 31) + Boolean.hashCode(this.f136396c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f136394a + ", qualifierApplicabilityTypes=" + this.f136395b + ", definitelyNotNull=" + this.f136396c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(C16591l lVar, Collection collection, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, collection, (i10 & 4) != 0 ? lVar.c() == C16590k.NOT_NULL : z10);
    }
}
