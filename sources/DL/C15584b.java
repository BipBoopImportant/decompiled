package DL;

import org.maplibre.android.log.Logger;

/* renamed from: DL.b  reason: case insensitive filesystem */
public class C15584b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f133887a = false;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f133888b = true;

    public static void a(int i10, String str) {
        if (f133888b) {
            Logger.log(i10, "Mbgl-HttpRequest", str);
        }
    }

    public static void b(int i10, String str, String str2) {
        int i11 = i10 == 1 ? 3 : i10 == 0 ? 4 : 5;
        String str3 = i10 == 1 ? "temporary" : i10 == 0 ? "connection" : "permanent";
        if (!f133887a) {
            str2 = "";
        }
        a(i11, String.format("Request failed due to a %s error: %s %s", new Object[]{str3, str, str2}));
    }
}
