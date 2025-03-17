package DL;

/* renamed from: DL.d  reason: case insensitive filesystem */
public class C15586d {
    public static String a(String str, String str2, int i10, boolean z10) {
        String str3;
        if (!b(str)) {
            return str2;
        }
        if (i10 == 0) {
            str3 = str2 + "?";
        } else {
            str3 = str2 + "&";
        }
        String str4 = str3;
        if (!z10) {
            return str4;
        }
        return str4 + "offline=true";
    }

    private static boolean b(String str) {
        return str.equals("mapbox.com") || str.endsWith(".mapbox.com") || str.equals("mapbox.cn") || str.endsWith(".mapbox.cn");
    }
}
