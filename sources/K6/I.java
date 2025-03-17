package K6;

import android.os.SystemClock;

final class I {
    static String a() {
        int i10;
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i11 = 1;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i11 >= 1000000) {
                    break;
                }
                if (((4508713 % i11) * 11) % i11 == 0) {
                    i12++;
                }
                if (i11 % 100 == 0) {
                    if (SystemClock.uptimeMillis() - uptimeMillis > 2) {
                        break;
                    }
                }
                i13++;
                i11++;
            }
            int i14 = i13 / 100;
            long uptimeMillis2 = SystemClock.uptimeMillis();
            float f10 = 33.34f;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 1; i17 < 1000000; i17++) {
                f10 += (float) i17;
                if ((19.239f * f10) / 3.56f < 10000.0f) {
                    i15++;
                }
                if (i17 % 100 == 0 && SystemClock.uptimeMillis() - uptimeMillis2 > 2) {
                    break;
                }
                i16++;
            }
            int i18 = i16 / 100;
            long uptimeMillis3 = SystemClock.uptimeMillis();
            int i19 = 0;
            int i20 = 0;
            for (double d10 = 1.0d; d10 < 1000000.0d; d10 += 1.0d) {
                if (Math.sqrt(d10) > 30.0d) {
                    i19++;
                }
                if (((int) d10) % 100 == 0) {
                    if (SystemClock.uptimeMillis() - uptimeMillis3 > 2) {
                        break;
                    }
                }
                i20++;
            }
            int i21 = i19;
            int i22 = i20 / 100;
            long uptimeMillis4 = SystemClock.uptimeMillis();
            int i23 = 1;
            int i24 = 0;
            int i25 = 0;
            for (i10 = 1000000; i23 < i10; i10 = 1000000) {
                if (Math.acos((double) (i23 / i10)) + Math.asin((double) (i23 / i10)) + Math.atan((double) (i23 / 1000000)) > 1.5d) {
                    i24++;
                }
                if (i23 % 100 == 0 && SystemClock.uptimeMillis() - uptimeMillis4 > 2) {
                    break;
                }
                i25++;
                i23++;
            }
            int i26 = i25 / 100;
            long uptimeMillis5 = SystemClock.uptimeMillis();
            int i27 = 0;
            for (int i28 = 1; i28 < 1000000 && SystemClock.uptimeMillis() - uptimeMillis5 <= 2; i28++) {
                i27++;
            }
            return i12 + "," + i14 + "," + i15 + "," + i18 + "," + i21 + "," + i22 + "," + i24 + "," + i26 + "," + i27;
        } catch (Exception e10) {
            y.a(e10);
            return "-1,-1,-1,-1,-1,-1,-1,-1,-1";
        }
    }
}
