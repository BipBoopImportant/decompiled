package di;

import IC.C13023e;
import SC.L2;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b\u0017\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Ldi/i;", "", "", "leadingIcon", "LIC/e;", "title", "", "showHeaderTrailingIcon", "LSC/L2;", "statusVariant", "statusText", "availabilityDescription", "supportExpanded", "<init>", "(ILIC/e;ZLSC/L2;LIC/e;LIC/e;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "LIC/e;", "g", "()LIC/e;", "c", "Z", "()Z", "d", "LSC/L2;", "e", "()LSC/L2;", "f", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: h  reason: collision with root package name */
    public static final int f72486h = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final int f72487a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f72488b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f72489c;

    /* renamed from: d  reason: collision with root package name */
    private final L2 f72490d;

    /* renamed from: e  reason: collision with root package name */
    private final C13023e f72491e;

    /* renamed from: f  reason: collision with root package name */
    private final C13023e f72492f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f72493g;

    public i(int i10, C13023e eVar, boolean z10, L2 l22, C13023e eVar2, C13023e eVar3, boolean z11) {
        C17542s.j(eVar, "title");
        C17542s.j(eVar2, "statusText");
        this.f72487a = i10;
        this.f72488b = eVar;
        this.f72489c = z10;
        this.f72490d = l22;
        this.f72491e = eVar2;
        this.f72492f = eVar3;
        this.f72493g = z11;
    }

    public final C13023e a() {
        return this.f72492f;
    }

    public final int b() {
        return this.f72487a;
    }

    public final boolean c() {
        return this.f72489c;
    }

    public final C13023e d() {
        return this.f72491e;
    }

    public final L2 e() {
        return this.f72490d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f72487a == iVar.f72487a && C17542s.e(this.f72488b, iVar.f72488b) && this.f72489c == iVar.f72489c && this.f72490d == iVar.f72490d && C17542s.e(this.f72491e, iVar.f72491e) && C17542s.e(this.f72492f, iVar.f72492f) && this.f72493g == iVar.f72493g;
    }

    public final boolean f() {
        return this.f72493g;
    }

    public final C13023e g() {
        return this.f72488b;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f72487a) * 31) + this.f72488b.hashCode()) * 31) + Boolean.hashCode(this.f72489c)) * 31;
        L2 l22 = this.f72490d;
        int i10 = 0;
        int hashCode2 = (((hashCode + (l22 == null ? 0 : l22.hashCode())) * 31) + this.f72491e.hashCode()) * 31;
        C13023e eVar = this.f72492f;
        if (eVar != null) {
            i10 = eVar.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f72493g);
    }

    public String toString() {
        int i10 = this.f72487a;
        C13023e eVar = this.f72488b;
        boolean z10 = this.f72489c;
        L2 l22 = this.f72490d;
        C13023e eVar2 = this.f72491e;
        C13023e eVar3 = this.f72492f;
        boolean z11 = this.f72493g;
        return "AvailabilityState(leadingIcon=" + i10 + ", title=" + eVar + ", showHeaderTrailingIcon=" + z10 + ", statusVariant=" + l22 + ", statusText=" + eVar2 + ", availabilityDescription=" + eVar3 + ", supportExpanded=" + z11 + ")";
    }
}
