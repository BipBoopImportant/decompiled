package n6;

import WK.C16772g;
import WK.C16773h;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LWK/g;", "LWK/h;", "bytes", "", "fromIndex", "toIndex", "a", "(LWK/g;LWK/h;JJ)J", "coil-svg_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: n6.e  reason: case insensitive filesystem */
public final class C8585e {
    public static final long a(C16772g gVar, C16773h hVar, long j10, long j11) {
        if (hVar.W() > 0) {
            byte B10 = hVar.B(0);
            long W10 = j11 - ((long) hVar.W());
            long j12 = j10;
            while (j12 < W10) {
                long m02 = gVar.m0(B10, j12, W10);
                if (m02 == -1 || gVar.h3(m02, hVar)) {
                    return m02;
                }
                j12 = m02 + 1;
            }
            return -1;
        }
        throw new IllegalArgumentException("bytes is empty");
    }
}
