package com.contentsquare.android.sdk;

import HJ.C15854t;
import a9.C6800c2;
import a9.T1;
import a9.W2;
import com.contentsquare.android.sdk.B0;
import kotlin.jvm.internal.C17542s;
import org.json.JSONObject;

public final class G0 extends B0 {

    public static final class a {
        public static G0 a(JSONObject jSONObject, W2 w22) {
            W2 t12;
            C17542s.j(jSONObject, "gestureObject");
            C17542s.j(w22, "defaultPathDescriptor");
            G0 g02 = new G0();
            g02.f46905b = jSONObject.optInt("type", -1);
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("path", "");
                C17542s.i(optString, "tvp");
                String a10 = w22.a();
                C17542s.j(a10, "path");
                if (!C15854t.d0(a10, ">FlutterView", false, 2, (Object) null) || C15854t.d0(a10, ">PlatformViewWrapper", false, 2, (Object) null)) {
                    if (B0.a.a(a10)) {
                        t12 = new T1(w22, optString);
                    }
                    g02.f46906c = w22;
                    g02.f46908e = optJSONObject.optDouble("distance", 0.0d);
                    g02.f46909f = optJSONObject.optDouble("velocity", 0.0d);
                    g02.f46907d = optJSONObject.optInt("direction", 0);
                } else {
                    t12 = new C6800c2(w22, optString);
                }
                w22 = t12;
                g02.f46906c = w22;
                g02.f46908e = optJSONObject.optDouble("distance", 0.0d);
                g02.f46909f = optJSONObject.optDouble("velocity", 0.0d);
                g02.f46907d = optJSONObject.optInt("direction", 0);
            }
            return g02;
        }
    }
}
