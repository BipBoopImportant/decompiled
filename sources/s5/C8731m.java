package s5;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0014"}, d2 = {"Ls5/m;", "", "", "workSpecId", "", "generation", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s5.m  reason: case insensitive filesystem */
public final class C8731m {

    /* renamed from: a  reason: collision with root package name */
    private final String f55891a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55892b;

    public C8731m(String str, int i10) {
        C17542s.j(str, "workSpecId");
        this.f55891a = str;
        this.f55892b = i10;
    }

    public final int a() {
        return this.f55892b;
    }

    public final String b() {
        return this.f55891a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8731m)) {
            return false;
        }
        C8731m mVar = (C8731m) obj;
        return C17542s.e(this.f55891a, mVar.f55891a) && this.f55892b == mVar.f55892b;
    }

    public int hashCode() {
        return (this.f55891a.hashCode() * 31) + Integer.hashCode(this.f55892b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f55891a + ", generation=" + this.f55892b + ')';
    }
}
