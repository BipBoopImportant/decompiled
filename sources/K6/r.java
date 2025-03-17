package K6;

import K6.E;
import K6.v;
import android.app.Application;
import android.net.Uri;
import java.net.URL;
import org.json.JSONObject;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final r f37705a = new r();

    public interface a {
        void a();

        void a(JSONObject jSONObject);
    }

    public static r a() {
        return f37705a;
    }

    public static void b(Application application, String str, int i10, a aVar) {
        String str2;
        E e10;
        try {
            v vVar = new v(application, (v.a) null);
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendPath("_bm");
            buildUpon.appendPath("get_params");
            StringBuilder sb2 = new StringBuilder("type=");
            if (i10 != 0) {
                if (i10 == 1) {
                    str2 = "sdk-cca";
                } else if (i10 == 2) {
                    str2 = "sdk-dci";
                } else if (i10 == 3) {
                    str2 = "sdk-pow,sdk-dci";
                } else if (i10 == 4) {
                    str2 = "sdk-cca,sdk-dci";
                }
                sb2.append(str2);
                buildUpon.encodedQuery(sb2.toString());
                buildUpon.appendQueryParameter("starttime", vVar.startTime());
                buildUpon.appendQueryParameter("systemVersion", vVar.systemVersion());
                buildUpon.appendQueryParameter("model", vVar.model());
                buildUpon.appendQueryParameter("deviceHardwareType", vVar.hardWareType());
                buildUpon.appendQueryParameter("appIdentifier", vVar.appIdentifier());
                buildUpon.appendQueryParameter("deviceId", vVar.androidId());
                String builder = buildUpon.toString();
                e10 = new E(aVar);
                e10.f37570b.execute(new E.a(new URL(builder)));
            }
            str2 = "sdk-pow";
            sb2.append(str2);
            buildUpon.encodedQuery(sb2.toString());
            buildUpon.appendQueryParameter("starttime", vVar.startTime());
            buildUpon.appendQueryParameter("systemVersion", vVar.systemVersion());
            buildUpon.appendQueryParameter("model", vVar.model());
            buildUpon.appendQueryParameter("deviceHardwareType", vVar.hardWareType());
            buildUpon.appendQueryParameter("appIdentifier", vVar.appIdentifier());
            buildUpon.appendQueryParameter("deviceId", vVar.androidId());
            String builder2 = buildUpon.toString();
            e10 = new E(aVar);
            try {
                e10.f37570b.execute(new E.a(new URL(builder2)));
            } catch (Exception e11) {
                C6595p.e("CYFNetworkServiceTask", "Exception:".concat(String.valueOf(e11)), new Throwable[0]);
                e10.a((JSONObject) null);
            }
        } catch (Exception unused) {
            aVar.a();
        }
    }
}
