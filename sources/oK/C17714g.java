package oK;

import WK.C16772g;
import WK.C16773h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a+\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r\"\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"LWK/g;", "source", "", "c", "(LWK/g;)Z", "b", "LWK/h;", "bytes", "", "fromIndex", "toIndex", "a", "(LWK/g;LWK/h;JJ)J", "LWK/h;", "SVG_TAG", "LEFT_ANGLE_BRACKET", "GIF_HEADER_87A", "d", "GIF_HEADER_89A", "sub-sampling-image_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: oK.g  reason: case insensitive filesystem */
public final class C17714g {

    /* renamed from: a  reason: collision with root package name */
    private static final C16773h f145372a;

    /* renamed from: b  reason: collision with root package name */
    private static final C16773h f145373b;

    /* renamed from: c  reason: collision with root package name */
    private static final C16773h f145374c;

    /* renamed from: d  reason: collision with root package name */
    private static final C16773h f145375d;

    static {
        C16773h.a aVar = C16773h.f139664d;
        f145372a = aVar.d("<svg");
        f145373b = aVar.d("<");
        f145374c = aVar.d("GIF87a");
        f145375d = aVar.d("GIF89a");
    }

    public static final long a(C16772g gVar, C16773h hVar, long j10, long j11) {
        C17542s.j(gVar, "<this>");
        C17542s.j(hVar, "bytes");
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

    public static final boolean b(C16772g gVar) {
        C17542s.j(gVar, "source");
        return gVar.h3(0, f145375d) || gVar.h3(0, f145374c);
    }

    public static final boolean c(C16772g gVar) {
        C17542s.j(gVar, "source");
        if (gVar.h3(0, f145373b)) {
            if (a(gVar, f145372a, 0, 1024) != -1) {
                return true;
            }
        }
        return false;
    }
}
