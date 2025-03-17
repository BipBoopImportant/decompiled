package E1;

import kotlin.Metadata;
import o1.C5667g;
import o1.C5669i;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005J\"\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000fH&¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u001e8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010)\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(ø\u0001\u0002\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006*À\u0006\u0003"}, d2 = {"LE1/v;", "", "Lo1/g;", "relativeToScreen", "u", "(J)J", "relativeToWindow", "K", "relativeToLocal", "Y", "p0", "sourceCoordinates", "relativeToSource", "E", "(LE1/v;J)J", "", "includeMotionFrameOfReference", "e0", "(LE1/v;JZ)J", "clipBounds", "Lo1/i;", "m0", "(LE1/v;Z)Lo1/i;", "Lp1/O0;", "matrix", "LXH/N;", "r0", "(LE1/v;[F)V", "c0", "([F)V", "Lc2/r;", "a", "()J", "size", "k0", "()LE1/v;", "parentLayoutCoordinates", "I", "parentCoordinates", "c", "()Z", "isAttached", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: E1.v  reason: case insensitive filesystem */
public interface C4488v {
    static /* synthetic */ C5669i T(C4488v vVar, C4488v vVar2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return vVar.m0(vVar2, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
    }

    long E(C4488v vVar, long j10);

    C4488v I();

    long K(long j10);

    long Y(long j10);

    long a();

    boolean c();

    void c0(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    long e0(C4488v vVar, long j10, boolean z10) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    C4488v k0();

    C5669i m0(C4488v vVar, boolean z10);

    long p0(long j10);

    void r0(C4488v vVar, float[] fArr) {
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    long u(long j10) {
        return C5667g.f26701b.b();
    }
}
