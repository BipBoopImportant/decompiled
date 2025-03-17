package a9;

/* renamed from: a9.l1  reason: case insensitive filesystem */
public final class C6871l1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f42673a;

    /* renamed from: b  reason: collision with root package name */
    public final long f42674b;

    /* renamed from: c  reason: collision with root package name */
    public final int f42675c;

    public C6871l1(long j10, long j11, int i10) {
        this.f42673a = j10;
        this.f42674b = j11;
        this.f42675c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6871l1)) {
            return false;
        }
        C6871l1 l1Var = (C6871l1) obj;
        return this.f42673a == l1Var.f42673a && this.f42674b == l1Var.f42674b && this.f42675c == l1Var.f42675c;
    }

    public final int hashCode() {
        int hashCode = (Long.hashCode(this.f42674b) + (Long.hashCode(this.f42673a) * 31)) * 31;
        int i10 = this.f42675c;
        return hashCode + (i10 == 0 ? 0 : b7.a(i10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionState(sessionId=");
        sb2.append(this.f42673a);
        sb2.append(", screenNumber=");
        sb2.append(this.f42674b);
        sb2.append(", changeReason=");
        sb2.append(this.f42675c != 1 ? "null" : "SCREEN_NUMBER_CHANGED");
        sb2.append(')');
        return sb2.toString();
    }
}
