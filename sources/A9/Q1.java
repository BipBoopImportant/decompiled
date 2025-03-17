package a9;

import F8.g;
import YH.C16877v;
import com.contentsquare.android.sdk.C7153u;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import org.json.JSONObject;

public final class Q1 {

    /* renamed from: a  reason: collision with root package name */
    public final g f42224a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f42225b = C16877v.q("x", "y", "width", "height");

    public Q1(g gVar) {
        C17542s.j(gVar, "deviceInfo");
        this.f42224a = gVar;
    }

    public final void a(C7153u uVar) {
        JSONObject jSONObject = uVar.f47644f;
        for (String next : this.f42225b) {
            if (jSONObject.has(next)) {
                jSONObject.put(next, this.f42224a.r(jSONObject.getInt(next)));
            }
        }
        List<C7153u> list = uVar.f47641c;
        if (list != null) {
            for (C7153u a10 : list) {
                a(a10);
            }
        }
    }
}
