package cu;

import IC.C13023e;
import jt.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Lcu/i;", "", "", "timeSlotId", "LIC/e;", "dateTimeLabel", "registrationStateLabel", "", "isEnabled", "Ljt/b$f$a;", "state", "<init>", "(Ljava/lang/String;LIC/e;LIC/e;ZLjt/b$f$a;)V", "a", "(Ljava/lang/String;LIC/e;LIC/e;ZLjt/b$f$a;)Lcu/i;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "LIC/e;", "c", "()LIC/e;", "d", "Z", "g", "()Z", "e", "Ljt/b$f$a;", "()Ljt/b$f$a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f96830a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f96831b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f96832c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f96833d;

    /* renamed from: e  reason: collision with root package name */
    private final b.f.a f96834e;

    public i(String str, C13023e eVar, C13023e eVar2, boolean z10, b.f.a aVar) {
        C17542s.j(str, "timeSlotId");
        C17542s.j(eVar, "dateTimeLabel");
        C17542s.j(aVar, "state");
        this.f96830a = str;
        this.f96831b = eVar;
        this.f96832c = eVar2;
        this.f96833d = z10;
        this.f96834e = aVar;
    }

    public static /* synthetic */ i b(i iVar, String str, C13023e eVar, C13023e eVar2, boolean z10, b.f.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = iVar.f96830a;
        }
        if ((i10 & 2) != 0) {
            eVar = iVar.f96831b;
        }
        C13023e eVar3 = eVar;
        if ((i10 & 4) != 0) {
            eVar2 = iVar.f96832c;
        }
        C13023e eVar4 = eVar2;
        if ((i10 & 8) != 0) {
            z10 = iVar.f96833d;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            aVar = iVar.f96834e;
        }
        return iVar.a(str, eVar3, eVar4, z11, aVar);
    }

    public final i a(String str, C13023e eVar, C13023e eVar2, boolean z10, b.f.a aVar) {
        C17542s.j(str, "timeSlotId");
        C17542s.j(eVar, "dateTimeLabel");
        C17542s.j(aVar, "state");
        return new i(str, eVar, eVar2, z10, aVar);
    }

    public final C13023e c() {
        return this.f96831b;
    }

    public final C13023e d() {
        return this.f96832c;
    }

    public final b.f.a e() {
        return this.f96834e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C17542s.e(this.f96830a, iVar.f96830a) && C17542s.e(this.f96831b, iVar.f96831b) && C17542s.e(this.f96832c, iVar.f96832c) && this.f96833d == iVar.f96833d && C17542s.e(this.f96834e, iVar.f96834e);
    }

    public final String f() {
        return this.f96830a;
    }

    public final boolean g() {
        return this.f96833d;
    }

    public int hashCode() {
        int hashCode = ((this.f96830a.hashCode() * 31) + this.f96831b.hashCode()) * 31;
        C13023e eVar = this.f96832c;
        return ((((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + Boolean.hashCode(this.f96833d)) * 31) + this.f96834e.hashCode();
    }

    public String toString() {
        String str = this.f96830a;
        C13023e eVar = this.f96831b;
        C13023e eVar2 = this.f96832c;
        boolean z10 = this.f96833d;
        b.f.a aVar = this.f96834e;
        return "TimeSlotUiModel(timeSlotId=" + str + ", dateTimeLabel=" + eVar + ", registrationStateLabel=" + eVar2 + ", isEnabled=" + z10 + ", state=" + aVar + ")";
    }
}
