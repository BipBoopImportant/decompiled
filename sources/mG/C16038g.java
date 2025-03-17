package MG;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LMG/g;", "", "LMG/b;", "content", "", "shouldShow", "<init>", "(LMG/b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LMG/b;", "()LMG/b;", "b", "Z", "()Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: MG.g  reason: case insensitive filesystem */
public final class C16038g {

    /* renamed from: a  reason: collision with root package name */
    private final C16033b f136256a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f136257b;

    public C16038g() {
        this((C16033b) null, false, 3, (DefaultConstructorMarker) null);
    }

    public final C16033b a() {
        return this.f136256a;
    }

    public final boolean b() {
        return this.f136257b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16038g)) {
            return false;
        }
        C16038g gVar = (C16038g) obj;
        return C17542s.e(this.f136256a, gVar.f136256a) && this.f136257b == gVar.f136257b;
    }

    public int hashCode() {
        C16033b bVar = this.f136256a;
        return ((bVar == null ? 0 : bVar.hashCode()) * 31) + Boolean.hashCode(this.f136257b);
    }

    public String toString() {
        C16033b bVar = this.f136256a;
        boolean z10 = this.f136257b;
        return "StatusDialogUIState(content=" + bVar + ", shouldShow=" + z10 + ")";
    }

    public C16038g(C16033b bVar, boolean z10) {
        this.f136256a = bVar;
        this.f136257b = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16038g(C16033b bVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? false : z10);
    }
}
