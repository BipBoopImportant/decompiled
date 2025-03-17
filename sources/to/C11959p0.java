package to;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0019"}, d2 = {"Lto/p0;", "", "", "label", "inputText", "", "showInputError", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "d", "()Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: to.p0  reason: case insensitive filesystem */
public final class C11959p0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f103204a;

    /* renamed from: b  reason: collision with root package name */
    private final String f103205b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f103206c;

    /* renamed from: d  reason: collision with root package name */
    private final String f103207d;

    public C11959p0(String str, String str2, boolean z10, String str3) {
        C17542s.j(str, "label");
        C17542s.j(str3, "errorMessage");
        this.f103204a = str;
        this.f103205b = str2;
        this.f103206c = z10;
        this.f103207d = str3;
    }

    public final String a() {
        return this.f103207d;
    }

    public final String b() {
        return this.f103205b;
    }

    public final String c() {
        return this.f103204a;
    }

    public final boolean d() {
        return this.f103206c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11959p0)) {
            return false;
        }
        C11959p0 p0Var = (C11959p0) obj;
        return C17542s.e(this.f103204a, p0Var.f103204a) && C17542s.e(this.f103205b, p0Var.f103205b) && this.f103206c == p0Var.f103206c && C17542s.e(this.f103207d, p0Var.f103207d);
    }

    public int hashCode() {
        int hashCode = this.f103204a.hashCode() * 31;
        String str = this.f103205b;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f103206c)) * 31) + this.f103207d.hashCode();
    }

    public String toString() {
        String str = this.f103204a;
        String str2 = this.f103205b;
        boolean z10 = this.f103206c;
        String str3 = this.f103207d;
        return "FiscalCodeData(label=" + str + ", inputText=" + str2 + ", showInputError=" + z10 + ", errorMessage=" + str3 + ")";
    }
}
