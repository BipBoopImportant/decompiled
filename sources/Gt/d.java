package Gt;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LGt/d;", "", "LIC/e;", "live", "liveA11y", "<init>", "(LIC/e;LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final int f81216c = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f81217a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f81218b;

    public d(C13023e eVar, C13023e eVar2) {
        C17542s.j(eVar, "live");
        C17542s.j(eVar2, "liveA11y");
        this.f81217a = eVar;
        this.f81218b = eVar2;
    }

    public final C13023e a() {
        return this.f81217a;
    }

    public final C13023e b() {
        return this.f81218b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return C17542s.e(this.f81217a, dVar.f81217a) && C17542s.e(this.f81218b, dVar.f81218b);
    }

    public int hashCode() {
        return (this.f81217a.hashCode() * 31) + this.f81218b.hashCode();
    }

    public String toString() {
        C13023e eVar = this.f81217a;
        C13023e eVar2 = this.f81218b;
        return "PopularTimesLiveUiModel(live=" + eVar + ", liveA11y=" + eVar2 + ")";
    }
}
