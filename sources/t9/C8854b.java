package t9;

import l9.i;
import l9.p;

/* renamed from: t9.b  reason: case insensitive filesystem */
final class C8854b extends C8863k {

    /* renamed from: a  reason: collision with root package name */
    private final long f56718a;

    /* renamed from: b  reason: collision with root package name */
    private final p f56719b;

    /* renamed from: c  reason: collision with root package name */
    private final i f56720c;

    C8854b(long j10, p pVar, i iVar) {
        this.f56718a = j10;
        if (pVar != null) {
            this.f56719b = pVar;
            if (iVar != null) {
                this.f56720c = iVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public i b() {
        return this.f56720c;
    }

    public long c() {
        return this.f56718a;
    }

    public p d() {
        return this.f56719b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8863k)) {
            return false;
        }
        C8863k kVar = (C8863k) obj;
        return this.f56718a == kVar.c() && this.f56719b.equals(kVar.d()) && this.f56720c.equals(kVar.b());
    }

    public int hashCode() {
        long j10 = this.f56718a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f56719b.hashCode()) * 1000003) ^ this.f56720c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f56718a + ", transportContext=" + this.f56719b + ", event=" + this.f56720c + "}";
    }
}
