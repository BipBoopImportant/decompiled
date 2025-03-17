package Mc;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LMc/u;", "", "", "processName", "", "pid", "importance", "", "isDefaultProcess", "<init>", "(Ljava/lang/String;IIZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "d", "Z", "()Z", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final String f61828a;

    /* renamed from: b  reason: collision with root package name */
    private final int f61829b;

    /* renamed from: c  reason: collision with root package name */
    private final int f61830c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f61831d;

    public u(String str, int i10, int i11, boolean z10) {
        C17542s.j(str, "processName");
        this.f61828a = str;
        this.f61829b = i10;
        this.f61830c = i11;
        this.f61831d = z10;
    }

    public final int a() {
        return this.f61830c;
    }

    public final int b() {
        return this.f61829b;
    }

    public final String c() {
        return this.f61828a;
    }

    public final boolean d() {
        return this.f61831d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return C17542s.e(this.f61828a, uVar.f61828a) && this.f61829b == uVar.f61829b && this.f61830c == uVar.f61830c && this.f61831d == uVar.f61831d;
    }

    public int hashCode() {
        int hashCode = ((((this.f61828a.hashCode() * 31) + Integer.hashCode(this.f61829b)) * 31) + Integer.hashCode(this.f61830c)) * 31;
        boolean z10 = this.f61831d;
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f61828a + ", pid=" + this.f61829b + ", importance=" + this.f61830c + ", isDefaultProcess=" + this.f61831d + ')';
    }
}
