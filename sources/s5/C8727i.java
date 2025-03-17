package s5;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Ls5/i;", "", "", "workSpecId", "", "generation", "systemId", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s5.i  reason: case insensitive filesystem */
public final class C8727i {

    /* renamed from: a  reason: collision with root package name */
    public final String f55881a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55882b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55883c;

    public C8727i(String str, int i10, int i11) {
        C17542s.j(str, "workSpecId");
        this.f55881a = str;
        this.f55882b = i10;
        this.f55883c = i11;
    }

    public final int a() {
        return this.f55882b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8727i)) {
            return false;
        }
        C8727i iVar = (C8727i) obj;
        return C17542s.e(this.f55881a, iVar.f55881a) && this.f55882b == iVar.f55882b && this.f55883c == iVar.f55883c;
    }

    public int hashCode() {
        return (((this.f55881a.hashCode() * 31) + Integer.hashCode(this.f55882b)) * 31) + Integer.hashCode(this.f55883c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f55881a + ", generation=" + this.f55882b + ", systemId=" + this.f55883c + ')';
    }
}
