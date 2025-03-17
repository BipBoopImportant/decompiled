package o1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006\u001a\"\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lo1/g;", "offset", "Lo1/m;", "size", "Lo1/i;", "c", "(JJ)Lo1/i;", "topLeft", "bottomRight", "a", "center", "", "radius", "b", "(JF)Lo1/i;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: o1.j  reason: case insensitive filesystem */
public final class C5670j {
    public static final C5669i a(long j10, long j11) {
        return new C5669i(C5667g.m(j10), C5667g.n(j10), C5667g.m(j11), C5667g.n(j11));
    }

    public static final C5669i b(long j10, float f10) {
        return new C5669i(C5667g.m(j10) - f10, C5667g.n(j10) - f10, C5667g.m(j10) + f10, C5667g.n(j10) + f10);
    }

    public static final C5669i c(long j10, long j11) {
        return new C5669i(C5667g.m(j10), C5667g.n(j10), C5667g.m(j10) + C5673m.l(j11), C5667g.n(j10) + C5673m.i(j11));
    }
}
