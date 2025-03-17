package GD;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"LGD/c;", "", "LIC/e;", "label", "", "code", "codeFormatted", "", "copyable", "<init>", "(LIC/e;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "d", "()LIC/e;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GD.c  reason: case insensitive filesystem */
public final class C12930c {

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f110336a;

    /* renamed from: b  reason: collision with root package name */
    private final String f110337b;

    /* renamed from: c  reason: collision with root package name */
    private final String f110338c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f110339d;

    public C12930c(C13023e eVar, String str, String str2, boolean z10) {
        C17542s.j(eVar, "label");
        C17542s.j(str, "code");
        C17542s.j(str2, "codeFormatted");
        this.f110336a = eVar;
        this.f110337b = str;
        this.f110338c = str2;
        this.f110339d = z10;
    }

    public final String a() {
        return this.f110337b;
    }

    public final String b() {
        return this.f110338c;
    }

    public final boolean c() {
        return this.f110339d;
    }

    public final C13023e d() {
        return this.f110336a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12930c)) {
            return false;
        }
        C12930c cVar = (C12930c) obj;
        return C17542s.e(this.f110336a, cVar.f110336a) && C17542s.e(this.f110337b, cVar.f110337b) && C17542s.e(this.f110338c, cVar.f110338c) && this.f110339d == cVar.f110339d;
    }

    public int hashCode() {
        return (((((this.f110336a.hashCode() * 31) + this.f110337b.hashCode()) * 31) + this.f110338c.hashCode()) * 31) + Boolean.hashCode(this.f110339d);
    }

    public String toString() {
        C13023e eVar = this.f110336a;
        String str = this.f110337b;
        String str2 = this.f110338c;
        boolean z10 = this.f110339d;
        return "CardInfoItem(label=" + eVar + ", code=" + str + ", codeFormatted=" + str2 + ", copyable=" + z10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12930c(C13023e eVar, String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, str, (i10 & 4) != 0 ? str : str2, (i10 & 8) != 0 ? false : z10);
    }
}
