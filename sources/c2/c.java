package c2;

import XH.C16820k;
import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0012\u001a7\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0010\u001a\u001c\u0010\u0016\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0019\u001a\u00020\u0018*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u001e\u0010\u001b\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001e\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001c\u001a\u001e\u0010 \u001a\u00020\u001f*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a*\u0010$\u001a\u00020\u000e*\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010(\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0002¢\u0006\u0004\b(\u0010)\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"", "widthVal", "heightVal", "LXH/N;", "k", "(II)V", "size", "", "l", "(I)Ljava/lang/Void;", "minWidth", "maxWidth", "minHeight", "maxHeight", "Lc2/b;", "j", "(IIII)J", "e", "(I)I", "n", "a", "otherConstraints", "g", "(JJ)J", "Lc2/r;", "f", "width", "i", "(JI)I", "height", "h", "", "m", "(JJ)Z", "horizontal", "vertical", "o", "(JII)J", "max", "value", "d", "(II)I", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {
    public static final long a(int i10, int i11, int i12, int i13) {
        boolean z10 = false;
        if (!(i11 >= i10)) {
            m.a("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')');
        }
        if (!(i13 >= i12)) {
            m.a("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')');
        }
        if (i10 >= 0 && i12 >= 0) {
            z10 = true;
        }
        if (!z10) {
            m.a("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0");
        }
        return j(i10, i11, i12, i13);
    }

    public static /* synthetic */ long b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, i12, i13);
    }

    private static final int d(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : C17978n.e(i10 + i11, 0);
    }

    private static final int e(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < 262143 ? 18 : 255;
    }

    public static final long f(long j10, long j11) {
        return s.a(C17978n.m(r.h(j11), C5267b.n(j10), C5267b.l(j10)), C17978n.m(r.g(j11), C5267b.m(j10), C5267b.k(j10)));
    }

    public static final long g(long j10, long j11) {
        return a(C17978n.m(C5267b.n(j11), C5267b.n(j10), C5267b.l(j10)), C17978n.m(C5267b.l(j11), C5267b.n(j10), C5267b.l(j10)), C17978n.m(C5267b.m(j11), C5267b.m(j10), C5267b.k(j10)), C17978n.m(C5267b.k(j11), C5267b.m(j10), C5267b.k(j10)));
    }

    public static final int h(long j10, int i10) {
        return C17978n.m(i10, C5267b.m(j10), C5267b.k(j10));
    }

    public static final int i(long j10, int i10) {
        return C17978n.m(i10, C5267b.n(j10), C5267b.l(j10));
    }

    public static final long j(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int e10 = e(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int e11 = e(i15);
        if (e10 + e11 > 31) {
            k(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i16 & (~(i16 >> 31));
        int i18 = i13 + 1;
        int i19 = i18 & (~(i18 >> 31));
        int i20 = 0;
        if (e11 != 13) {
            if (e11 == 18) {
                i20 = 3;
            } else if (e11 == 15) {
                i20 = 1;
            } else if (e11 == 16) {
                i20 = 2;
            }
        }
        int i21 = ((i20 & 1) << 1) + (((i20 & 2) >> 1) * 3);
        return C5267b.b((((long) i17) << 33) | ((long) i20) | (((long) i10) << 2) | (((long) i12) << (i21 + 15)) | (((long) i19) << (i21 + 46)));
    }

    private static final void k(int i10, int i11) {
        throw new IllegalArgumentException("Can't represent a width of " + i10 + " and height of " + i11 + " in Constraints");
    }

    private static final Void l(int i10) {
        throw new IllegalArgumentException("Can't represent a size of " + i10 + " in Constraints");
    }

    public static final boolean m(long j10, long j11) {
        int n10 = C5267b.n(j10);
        int l10 = C5267b.l(j10);
        int h10 = r.h(j11);
        if (n10 <= h10 && h10 <= l10) {
            int m10 = C5267b.m(j10);
            int k10 = C5267b.k(j10);
            int g10 = r.g(j11);
            return m10 <= g10 && g10 <= k10;
        }
    }

    /* access modifiers changed from: private */
    public static final int n(int i10) {
        if (i10 < 8191) {
            return 262142;
        }
        if (i10 < 32767) {
            return 65534;
        }
        if (i10 < 65535) {
            return 32766;
        }
        if (i10 < 262143) {
            return 8190;
        }
        l(i10);
        throw new C16820k();
    }

    public static final long o(long j10, int i10, int i11) {
        return a(C17978n.e(C5267b.n(j10) + i10, 0), d(C5267b.l(j10), i10), C17978n.e(C5267b.m(j10) + i11, 0), d(C5267b.k(j10), i11));
    }

    public static /* synthetic */ long p(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return o(j10, i10, i11);
    }
}
