package pK;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"LpK/h;", "", "", "minZoomAsRatioOfBaseZoom", "maxZoomAsRatioOfSize", "<init>", "(FF)V", "LpK/a;", "baseZoom", "b", "(J)F", "a", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pK.h  reason: case insensitive filesystem */
public final class C17763h {

    /* renamed from: a  reason: collision with root package name */
    private final float f146377a;

    /* renamed from: b  reason: collision with root package name */
    private final float f146378b;

    public C17763h(float f10, float f11) {
        this.f146377a = f10;
        this.f146378b = f11;
    }

    public final float a(long j10) {
        return Math.max(this.f146378b, b(j10));
    }

    public final float b(long j10) {
        return this.f146377a * C17756a.c(j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17763h)) {
            return false;
        }
        C17763h hVar = (C17763h) obj;
        return Float.compare(this.f146377a, hVar.f146377a) == 0 && Float.compare(this.f146378b, hVar.f146378b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f146377a) * 31) + Float.hashCode(this.f146378b);
    }

    public String toString() {
        float f10 = this.f146377a;
        float f11 = this.f146378b;
        return "ZoomRange(minZoomAsRatioOfBaseZoom=" + f10 + ", maxZoomAsRatioOfSize=" + f11 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17763h(float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, f11);
    }
}
