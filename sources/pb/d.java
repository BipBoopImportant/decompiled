package PB;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LPB/d;", "", "", "showBouncingBall", "LPB/g;", "selectedStore", "<init>", "(ZLPB/g;)V", "a", "(ZLPB/g;)LPB/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "LPB/g;", "c", "()LPB/g;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final int f113845c = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f113846a;

    /* renamed from: b  reason: collision with root package name */
    private final g f113847b;

    public d(boolean z10, g gVar) {
        C17542s.j(gVar, "selectedStore");
        this.f113846a = z10;
        this.f113847b = gVar;
    }

    public static /* synthetic */ d b(d dVar, boolean z10, g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = dVar.f113846a;
        }
        if ((i10 & 2) != 0) {
            gVar = dVar.f113847b;
        }
        return dVar.a(z10, gVar);
    }

    public final d a(boolean z10, g gVar) {
        C17542s.j(gVar, "selectedStore");
        return new d(z10, gVar);
    }

    public final g c() {
        return this.f113847b;
    }

    public final boolean d() {
        return this.f113846a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f113846a == dVar.f113846a && C17542s.e(this.f113847b, dVar.f113847b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f113846a) * 31) + this.f113847b.hashCode();
    }

    public String toString() {
        boolean z10 = this.f113846a;
        g gVar = this.f113847b;
        return "FabData(showBouncingBall=" + z10 + ", selectedStore=" + gVar + ")";
    }
}
