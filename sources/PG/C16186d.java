package PG;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LPG/d;", "", "", "isVisible", "", "zoomValue", "<init>", "(ZF)V", "a", "(ZF)LPG/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "F", "c", "()F", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: PG.d  reason: case insensitive filesystem */
public final class C16186d {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f137145a;

    /* renamed from: b  reason: collision with root package name */
    private final float f137146b;

    public C16186d() {
        this(false, 0.0f, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C16186d b(C16186d dVar, boolean z10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = dVar.f137145a;
        }
        if ((i10 & 2) != 0) {
            f10 = dVar.f137146b;
        }
        return dVar.a(z10, f10);
    }

    public final C16186d a(boolean z10, float f10) {
        return new C16186d(z10, f10);
    }

    public final float c() {
        return this.f137146b;
    }

    public final boolean d() {
        return this.f137145a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16186d)) {
            return false;
        }
        C16186d dVar = (C16186d) obj;
        return this.f137145a == dVar.f137145a && Float.compare(this.f137146b, dVar.f137146b) == 0;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f137145a) * 31) + Float.hashCode(this.f137146b);
    }

    public String toString() {
        boolean z10 = this.f137145a;
        float f10 = this.f137146b;
        return "ZoomIndicatorState(isVisible=" + z10 + ", zoomValue=" + f10 + ")";
    }

    public C16186d(boolean z10, float f10) {
        this.f137145a = z10;
        this.f137146b = f10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16186d(boolean z10, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? 0.0f : f10);
    }
}
