package o1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a \u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a@\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001c\u0010\u001c\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0015\u0010 \u001a\u00020\u000e*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0015\u0010$\u001a\u00020!*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"", "left", "top", "right", "bottom", "radiusX", "radiusY", "Lo1/k;", "a", "(FFFFFF)Lo1/k;", "Lo1/a;", "cornerRadius", "e", "(FFFFJ)Lo1/k;", "Lo1/i;", "rect", "b", "(Lo1/i;FF)Lo1/k;", "f", "(Lo1/i;J)Lo1/k;", "topLeft", "topRight", "bottomRight", "bottomLeft", "c", "(Lo1/i;JJJJ)Lo1/k;", "Lo1/g;", "offset", "i", "(Lo1/k;J)Lo1/k;", "g", "(Lo1/k;)Lo1/i;", "boundingRect", "", "h", "(Lo1/k;)Z", "isSimple", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: o1.l  reason: case insensitive filesystem */
public final class C5672l {
    public static final C5671k a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long a10 = C5662b.a(f14, f15);
        return new C5671k(f10, f11, f12, f13, a10, a10, a10, a10, (DefaultConstructorMarker) null);
    }

    public static final C5671k b(C5669i iVar, float f10, float f11) {
        return a(iVar.o(), iVar.r(), iVar.p(), iVar.j(), f10, f11);
    }

    public static final C5671k c(C5669i iVar, long j10, long j11, long j12, long j13) {
        return new C5671k(iVar.o(), iVar.r(), iVar.p(), iVar.j(), j10, j11, j12, j13, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C5671k d(C5669i iVar, long j10, long j11, long j12, long j13, int i10, Object obj) {
        return c(iVar, (i10 & 2) != 0 ? C5661a.f26695a.a() : j10, (i10 & 4) != 0 ? C5661a.f26695a.a() : j11, (i10 & 8) != 0 ? C5661a.f26695a.a() : j12, (i10 & 16) != 0 ? C5661a.f26695a.a() : j13);
    }

    public static final C5671k e(float f10, float f11, float f12, float f13, long j10) {
        return a(f10, f11, f12, f13, C5661a.d(j10), C5661a.e(j10));
    }

    public static final C5671k f(C5669i iVar, long j10) {
        return b(iVar, C5661a.d(j10), C5661a.e(j10));
    }

    public static final C5669i g(C5671k kVar) {
        return new C5669i(kVar.e(), kVar.g(), kVar.f(), kVar.a());
    }

    public static final boolean h(C5671k kVar) {
        return C5661a.d(kVar.h()) == C5661a.e(kVar.h()) && C5661a.d(kVar.h()) == C5661a.d(kVar.i()) && C5661a.d(kVar.h()) == C5661a.e(kVar.i()) && C5661a.d(kVar.h()) == C5661a.d(kVar.c()) && C5661a.d(kVar.h()) == C5661a.e(kVar.c()) && C5661a.d(kVar.h()) == C5661a.d(kVar.b()) && C5661a.d(kVar.h()) == C5661a.e(kVar.b());
    }

    public static final C5671k i(C5671k kVar, long j10) {
        return new C5671k(C5667g.m(j10) + kVar.e(), C5667g.n(j10) + kVar.g(), C5667g.m(j10) + kVar.f(), C5667g.n(j10) + kVar.a(), kVar.h(), kVar.i(), kVar.c(), kVar.b(), (DefaultConstructorMarker) null);
    }
}
