package androidx.media3.ui;

import android.graphics.Color;
import t3.N;

/* renamed from: androidx.media3.ui.a  reason: case insensitive filesystem */
final class C6992a {
    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(int i10) {
        return N.G("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d));
    }
}
