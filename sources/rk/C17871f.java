package rK;

import E1.h0;
import E1.i0;
import androidx.compose.ui.graphics.f;
import c2.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import me.saket.telephoto.zoomable.a;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import o1.C5670j;
import o1.C5673m;
import p1.p1;
import pI.C17752b;
import pK.C17762g;
import tI.C17978n;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u0005*\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0016\u0010\b\u001a\u00020\u0007*\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0016\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a\u0013\u0010\r\u001a\u00020\u0007*\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0012\u001a\u00020\n*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001f\u0010\u0015\u001a\u00020\n*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\n*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001f\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001f\u0010\u001b\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010!\u001a\u00020\u0019*\u00020\u00192\u0006\u0010 \u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001c\u001a\u001f\u0010\"\u001a\u00020\u0019*\u00020\u00192\u0006\u0010 \u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001c\u001a&\u0010%\u001a\u00020\u0019*\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a:\u0010*\u001a\u00020\n*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\n2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0(H\u0000ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a2\u0010,\u001a\u00020\n*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0(H\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u001e\u00100\u001a\u00020.*\u00020.2\u0006\u0010/\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a2\u00104\u001a\u00020.*\u00020.2\u0006\u00103\u001a\u0002022\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0(H\u0000ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a&\u00107\u001a\u00020.*\u00020.2\u0006\u0010/\u001a\u00020\u00052\u0006\u00106\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b7\u00108\"\u0018\u0010:\u001a\u00020\u0007*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\t\"\u0018\u0010=\u001a\u00020\f*\u00020\u00058@X\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\"\u0018\u0010?\u001a\u00020\f*\u00020\u00058@X\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<\"\u0018\u0010C\u001a\u00020\u0005*\u00020@8@X\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B\"\u0018\u0010C\u001a\u000202*\u00020D8@X\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Lo1/m;", "Lc2/r;", "o", "(J)J", "b", "LE1/h0;", "w", "", "k", "(J)Z", "Lo1/g;", "l", "", "j", "(F)Z", "factor", "v", "(JJ)J", "e", "Lme/saket/telephoto/zoomable/a;", "zoom", "c", "(JLme/saket/telephoto/zoomable/a;)J", "q", "t", "LpK/g;", "operand", "s", "(FF)F", "LpK/a;", "u", "(JF)J", "other", "n", "d", "minimumValue", "maximumValue", "a", "(FFF)F", "translate", "Lkotlin/Function1;", "action", "z", "(JJJLnI/l;)J", "y", "(JJLnI/l;)J", "Lo1/i;", "scale", "r", "(Lo1/i;J)Lo1/i;", "Landroidx/compose/ui/graphics/f;", "origin", "x", "(Lo1/i;JLnI/l;)Lo1/i;", "offset", "p", "(Lo1/i;JJ)Lo1/i;", "m", "isSpecifiedAndNonEmpty", "f", "(J)F", "maxScale", "g", "minScale", "LE1/h0$a;", "h", "(LE1/h0$a;)J", "Zero", "Landroidx/compose/ui/graphics/f$a;", "i", "(Landroidx/compose/ui/graphics/f$a;)J", "zoomable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: rK.f  reason: case insensitive filesystem */
public final class C17871f {
    public static final float a(float f10, float f11, float f12) {
        return C17762g.a(C17978n.l(f10, f11, f12));
    }

    public static final long b(long j10) {
        return s.a((int) C5673m.l(j10), (int) C5673m.i(j10));
    }

    public static final long c(long j10, a aVar) {
        C17542s.j(aVar, "zoom");
        return e(j10, aVar.f());
    }

    public static final float d(float f10, float f11) {
        return C17762g.a(f10 / f11);
    }

    public static final long e(long j10, long j11) {
        return C5668h.a(C5667g.m(j10) / h0.c(j11), C5667g.n(j10) / h0.d(j11));
    }

    public static final float f(long j10) {
        return Math.max(h0.c(j10), h0.d(j10));
    }

    public static final float g(long j10) {
        return Math.min(h0.c(j10), h0.d(j10));
    }

    public static final long h(h0.a aVar) {
        C17542s.j(aVar, "<this>");
        return i0.a(0.0f, 0.0f);
    }

    public static final long i(f.a aVar) {
        C17542s.j(aVar, "<this>");
        return p1.a(0.0f, 0.0f);
    }

    public static final boolean j(float f10) {
        return !Float.isInfinite(f10) && !Float.isNaN(f10) && f10 >= 0.0f;
    }

    public static final boolean k(long j10) {
        return j(h0.c(j10)) && j(h0.d(j10));
    }

    public static final boolean l(long j10) {
        return C5668h.c(j10) && C5668h.b(j10);
    }

    public static final boolean m(long j10) {
        return j10 != C5673m.f26722b.a() && !C5673m.n(j10);
    }

    public static final float n(float f10, float f11) {
        return C17762g.a(f10 - f11);
    }

    public static final long o(long j10) {
        return s.a(C17752b.e(C5673m.l(j10)), C17752b.e(C5673m.i(j10)));
    }

    public static final C5669i p(C5669i iVar, long j10, long j11) {
        C17542s.j(iVar, "$this$scaledAndOffsetBy");
        return new C5669i((iVar.o() * h0.c(j10)) + C5667g.m(j11), (iVar.r() * h0.d(j10)) + C5667g.n(j11), (iVar.p() * h0.c(j10)) + C5667g.m(j11), (iVar.j() * h0.d(j10)) + C5667g.n(j11));
    }

    public static final long q(long j10, a aVar) {
        C17542s.j(aVar, "zoom");
        return v(j10, aVar.f());
    }

    public static final C5669i r(C5669i iVar, long j10) {
        C17542s.j(iVar, "$this$times");
        return C5670j.c(v(iVar.s(), j10), i0.d(iVar.q(), j10));
    }

    public static final float s(float f10, float f11) {
        return C17762g.a(f10 * f11);
    }

    public static final long t(long j10, a aVar) {
        C17542s.j(aVar, "zoom");
        return i0.d(j10, aVar.f());
    }

    public static final long u(long j10, float f10) {
        return h0.f(j10, f10);
    }

    public static final long v(long j10, long j11) {
        return C5668h.a(C5667g.m(j10) * h0.c(j11), C5667g.n(j10) * h0.d(j11));
    }

    public static final long w(long j10) {
        return h0.f(j10, -1.0f);
    }

    public static final C5669i x(C5669i iVar, long j10, C17642l<? super C5669i, C5669i> lVar) {
        C17542s.j(iVar, "$this$withOrigin");
        C17542s.j(lVar, "action");
        long a10 = C5668h.a(C5673m.l(iVar.q()) * f.f(j10), C5673m.i(iVar.q()) * f.g(j10));
        return lVar.invoke(iVar.A(C5667g.u(a10))).A(a10);
    }

    public static final long y(long j10, long j11, C17642l<? super C5667g, C5667g> lVar) {
        C17542s.j(lVar, "action");
        return z(j10, j11, C5667g.f26701b.c(), lVar);
    }

    public static final long z(long j10, long j11, long j12, C17642l<? super C5667g, C5667g> lVar) {
        C17542s.j(lVar, "action");
        return e(C5667g.q(lVar.invoke(C5667g.d(C5667g.r(v(j10, j11), j12))).v(), j12), j11);
    }
}
