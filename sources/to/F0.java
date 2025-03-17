package to;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import to.C0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lto/F0;", "", "", "fiscalCodeValue", "Lto/C0$c;", "idMethod", "idValue", "Lto/C0$a;", "country", "", "isValid", "<init>", "(Ljava/lang/String;Lto/C0$c;Ljava/lang/String;Lto/C0$a;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lto/C0$c;", "c", "()Lto/C0$c;", "d", "Lto/C0$a;", "()Lto/C0$a;", "e", "Z", "()Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class F0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f103019a;

    /* renamed from: b  reason: collision with root package name */
    private final C0.c f103020b;

    /* renamed from: c  reason: collision with root package name */
    private final String f103021c;

    /* renamed from: d  reason: collision with root package name */
    private final C0.a f103022d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f103023e;

    public F0(String str, C0.c cVar, String str2, C0.a aVar, boolean z10) {
        C17542s.j(str, "fiscalCodeValue");
        C17542s.j(str2, "idValue");
        this.f103019a = str;
        this.f103020b = cVar;
        this.f103021c = str2;
        this.f103022d = aVar;
        this.f103023e = z10;
    }

    public final C0.a a() {
        return this.f103022d;
    }

    public final String b() {
        return this.f103019a;
    }

    public final C0.c c() {
        return this.f103020b;
    }

    public final String d() {
        return this.f103021c;
    }

    public final boolean e() {
        return this.f103023e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return C17542s.e(this.f103019a, f02.f103019a) && C17542s.e(this.f103020b, f02.f103020b) && C17542s.e(this.f103021c, f02.f103021c) && C17542s.e(this.f103022d, f02.f103022d) && this.f103023e == f02.f103023e;
    }

    public int hashCode() {
        int hashCode = this.f103019a.hashCode() * 31;
        C0.c cVar = this.f103020b;
        int i10 = 0;
        int hashCode2 = (((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f103021c.hashCode()) * 31;
        C0.a aVar = this.f103022d;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f103023e);
    }

    public String toString() {
        String str = this.f103019a;
        C0.c cVar = this.f103020b;
        String str2 = this.f103021c;
        C0.a aVar = this.f103022d;
        boolean z10 = this.f103023e;
        return "TaxIdSelection(fiscalCodeValue=" + str + ", idMethod=" + cVar + ", idValue=" + str2 + ", country=" + aVar + ", isValid=" + z10 + ")";
    }
}
