package oK;

import E1.h0;
import c2.o;
import c2.p;
import c2.r;
import c2.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o1.C5667g;
import o1.C5669i;
import o1.C5673m;
import tI.C17978n;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a&\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0016\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0016\u0010\u000b\u001a\u00020\u0000*\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0016\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\f\u001a \u0010\u0012\u001a\u00020\u0007*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a&\u0010\u001b\u001a\u00020\u001a*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\u0010*\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001e\u0010 \u001a\u00020\u0007*\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\"\u0018\u0010$\u001a\u00020\u0015*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0018\u0010'\u001a\u00020\u0014*\u00020\u00188@X\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Lc2/r;", "min", "max", "b", "(JJJ)J", "a", "(JJ)J", "", "i", "(J)Z", "Lo1/m;", "e", "(J)J", "Lo1/g;", "Lc2/n;", "d", "Lc2/p;", "offset", "c", "(Lc2/p;Lo1/g;)Z", "", "", "l", "(F)I", "LE1/h0;", "scale", "Lo1/i;", "k", "(Lc2/p;JJ)Lo1/i;", "f", "(Lo1/i;)Lc2/p;", "other", "j", "(Lo1/i;J)Z", "h", "(J)I", "minDimension", "g", "(J)F", "maxScale", "sub-sampling-image_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: oK.b  reason: case insensitive filesystem */
public final class C17709b {
    public static final long a(long j10, long j11) {
        return s.a(C17978n.e(r.h(j10), r.h(j11)), C17978n.e(r.g(j10), r.g(j11)));
    }

    public static final long b(long j10, long j11, long j12) {
        return s.a(C17978n.m(r.h(j10), r.h(j11), r.h(j12)), C17978n.m(r.g(j10), r.g(j11), r.g(j12)));
    }

    public static final boolean c(p pVar, C5667g gVar) {
        C17542s.j(pVar, "$this$contains");
        if (gVar == null) {
            return false;
        }
        return pVar.b(d(gVar.v()));
    }

    public static final long d(long j10) {
        return o.a((int) C5667g.m(j10), (int) C5667g.n(j10));
    }

    public static final long e(long j10) {
        return s.a((int) C5673m.l(j10), (int) C5673m.i(j10));
    }

    public static final p f(C5669i iVar) {
        C17542s.j(iVar, "<this>");
        return new p((int) iVar.o(), (int) iVar.r(), (int) iVar.p(), (int) iVar.j());
    }

    public static final float g(long j10) {
        return Math.max(h0.c(j10), h0.d(j10));
    }

    public static final int h(long j10) {
        return Math.min(Math.abs(r.h(j10)), Math.abs(r.g(j10)));
    }

    public static final boolean i(long j10) {
        return r.h(j10) > 0 && r.g(j10) > 0;
    }

    public static final boolean j(C5669i iVar, long j10) {
        C17542s.j(iVar, "$this$overlaps");
        return iVar.p() > 0.0f && ((float) r.h(j10)) > iVar.o() && iVar.j() > 0.0f && ((float) r.g(j10)) > iVar.r();
    }

    public static final C5669i k(p pVar, long j10, long j11) {
        C17542s.j(pVar, "$this$scaledAndOffsetBy");
        return new C5669i((((float) pVar.j()) * h0.c(j10)) + C5667g.m(j11), (((float) pVar.m()) * h0.d(j10)) + C5667g.n(j11), (((float) pVar.k()) * h0.c(j10)) + C5667g.m(j11), (((float) pVar.e()) * h0.d(j10)) + C5667g.n(j11));
    }

    public static final int l(float f10) {
        return (int) ((float) Math.ceil((double) f10));
    }
}
