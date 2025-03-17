package rK;

import E1.h0;
import E1.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17536l;
import o1.C5667g;
import o1.C5668h;
import o1.C5673m;
import o1.C5674n;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0013\u0010\b\u001a\u00020\u0000*\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\u0003\u001a\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\u0003\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u0003\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Lo1/g;", "", "h", "(J)J", "Lo1/m;", "i", "LE1/h0;", "g", "j", "l", "k", "zoomable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class w {
    /* access modifiers changed from: private */
    public static final long g(long j10) {
        float c10 = h0.c(j10);
        return (((long) Float.floatToRawIntBits(h0.d(j10))) & 4294967295L) | (((long) Float.floatToRawIntBits(c10)) << 32);
    }

    /* access modifiers changed from: private */
    public static final long h(long j10) {
        float m10 = C5667g.m(j10);
        return (((long) Float.floatToRawIntBits(C5667g.n(j10))) & 4294967295L) | (((long) Float.floatToRawIntBits(m10)) << 32);
    }

    /* access modifiers changed from: private */
    public static final long i(long j10) {
        float l10 = C5673m.l(j10);
        return (((long) Float.floatToRawIntBits(C5673m.i(j10))) & 4294967295L) | (((long) Float.floatToRawIntBits(l10)) << 32);
    }

    /* access modifiers changed from: private */
    public static final long j(long j10) {
        C17536l lVar = C17536l.f144385a;
        return C5668h.a(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* access modifiers changed from: private */
    public static final long k(long j10) {
        C17536l lVar = C17536l.f144385a;
        return i0.a(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* access modifiers changed from: private */
    public static final long l(long j10) {
        C17536l lVar = C17536l.f144385a;
        return C5674n.a(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }
}
