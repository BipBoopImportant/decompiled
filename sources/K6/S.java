package K6;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;

final class S {

    /* renamed from: a  reason: collision with root package name */
    private final String f37607a = "CYFSystemInfoManager";

    /* renamed from: b  reason: collision with root package name */
    Q f37608b = new Q();

    /* renamed from: c  reason: collision with root package name */
    String f37609c = "-1";

    /* renamed from: d  reason: collision with root package name */
    String f37610d = "-1";

    /* renamed from: e  reason: collision with root package name */
    String f37611e = "-1";

    /* renamed from: f  reason: collision with root package name */
    String f37612f = "-1";

    /* renamed from: g  reason: collision with root package name */
    String f37613g = "-1";

    S() {
    }

    public static String a() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("-2,3,-50,-301", Q.f()));
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                sb2.append(pair.first);
                sb2.append(",");
                sb2.append(pair.second);
            }
            return sb2.toString();
        } catch (Exception e10) {
            C6595p.e("CYFSystemInfoManager", "Exception in getNewDeviceInfo", e10);
            y.a(e10);
            return "default-info";
        }
    }
}
