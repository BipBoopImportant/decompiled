package o5;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lo5/d;", "", "", "isConnected", "isValidated", "isMetered", "isNotRoaming", "<init>", "(ZZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "d", "c", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o5.d  reason: case insensitive filesystem */
public final class C8603d {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f55230a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f55231b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f55232c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f55233d;

    public C8603d(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f55230a = z10;
        this.f55231b = z11;
        this.f55232c = z12;
        this.f55233d = z13;
    }

    public final boolean a() {
        return this.f55230a;
    }

    public final boolean b() {
        return this.f55232c;
    }

    public final boolean c() {
        return this.f55233d;
    }

    public final boolean d() {
        return this.f55231b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8603d)) {
            return false;
        }
        C8603d dVar = (C8603d) obj;
        return this.f55230a == dVar.f55230a && this.f55231b == dVar.f55231b && this.f55232c == dVar.f55232c && this.f55233d == dVar.f55233d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f55230a) * 31) + Boolean.hashCode(this.f55231b)) * 31) + Boolean.hashCode(this.f55232c)) * 31) + Boolean.hashCode(this.f55233d);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f55230a + ", isValidated=" + this.f55231b + ", isMetered=" + this.f55232c + ", isNotRoaming=" + this.f55233d + ')';
    }
}
