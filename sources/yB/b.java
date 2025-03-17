package Yb;

import Qb.E;
import Yb.d;
import com.adjust.sdk.Constants;
import org.json.JSONObject;

class b implements i {
    b() {
    }

    static d b(E e10) {
        return new d(e10.a() + ((long) Constants.ONE_HOUR), new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    public d a(E e10, JSONObject jSONObject) {
        return b(e10);
    }
}
