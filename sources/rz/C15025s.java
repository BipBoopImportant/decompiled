package rz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lrz/s;", "", "Lrz/e;", "availabilityNotice", "Lrz/f;", "availabilityWarning", "Lrz/d;", "availabilityCard", "<init>", "(Lrz/e;Lrz/f;Lrz/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrz/e;", "b", "()Lrz/e;", "Lrz/f;", "c", "()Lrz/f;", "Lrz/d;", "()Lrz/d;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.s  reason: case insensitive filesystem */
public final class C15025s {

    /* renamed from: a  reason: collision with root package name */
    private final C15012e f130887a;

    /* renamed from: b  reason: collision with root package name */
    private final C15013f f130888b;

    /* renamed from: c  reason: collision with root package name */
    private final C15011d f130889c;

    public C15025s(C15012e eVar, C15013f fVar, C15011d dVar) {
        C17542s.j(eVar, "availabilityNotice");
        C17542s.j(fVar, "availabilityWarning");
        C17542s.j(dVar, "availabilityCard");
        this.f130887a = eVar;
        this.f130888b = fVar;
        this.f130889c = dVar;
    }

    public final C15011d a() {
        return this.f130889c;
    }

    public final C15012e b() {
        return this.f130887a;
    }

    public final C15013f c() {
        return this.f130888b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15025s)) {
            return false;
        }
        C15025s sVar = (C15025s) obj;
        return C17542s.e(this.f130887a, sVar.f130887a) && C17542s.e(this.f130888b, sVar.f130888b) && C17542s.e(this.f130889c, sVar.f130889c);
    }

    public int hashCode() {
        return (((this.f130887a.hashCode() * 31) + this.f130888b.hashCode()) * 31) + this.f130889c.hashCode();
    }

    public String toString() {
        C15012e eVar = this.f130887a;
        C15013f fVar = this.f130888b;
        C15011d dVar = this.f130889c;
        return "ItemAvailability(availabilityNotice=" + eVar + ", availabilityWarning=" + fVar + ", availabilityCard=" + dVar + ")";
    }
}
