package E3;

import E3.L;
import android.media.MediaCodecInfo;
import com.sugarcube.decorate_engine.SceneLayout;
import java.util.List;
import q3.C5807s;
import t3.N;

final class z {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f34835a;

    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List a10 = videoCapabilities.getSupportedPerformancePoints();
            if (a10 == null || a10.isEmpty()) {
                return 0;
            }
            w.a();
            int c10 = c(a10, v.a(i10, i11, (int) d10));
            if (c10 == 1 && z.f34835a == null) {
                Boolean unused = z.f34835a = Boolean.valueOf(d());
                if (z.f34835a.booleanValue()) {
                    return 0;
                }
            }
            return c10;
        }

        private static int b(boolean z10) {
            List a10;
            try {
                C5807s M10 = new C5807s.b().s0("video/avc").M();
                if (M10.f28244o != null) {
                    List<t> l10 = L.l(D.f34744a, M10, z10, false);
                    int i10 = 0;
                    while (i10 < l10.size()) {
                        if (l10.get(i10).f34826d == null || l10.get(i10).f34826d.getVideoCapabilities() == null || (a10 = l10.get(i10).f34826d.getVideoCapabilities().getSupportedPerformancePoints()) == null || a10.isEmpty()) {
                            i10++;
                        } else {
                            w.a();
                            return c(a10, v.a(SceneLayout.kCurrent3DVersion, 720, 60));
                        }
                    }
                }
            } catch (L.c unused) {
            }
            return 0;
        }

        private static int c(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (x.a(list.get(i10)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean d() {
            if (N.f29462a >= 35) {
                return false;
            }
            int b10 = b(false);
            int b11 = b(true);
            if (b10 == 0) {
                return true;
            }
            return b11 == 0 ? b10 != 2 : (b10 == 2 && b11 == 2) ? false : true;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (N.f29462a < 29) {
            return 0;
        }
        Boolean bool = f34835a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
