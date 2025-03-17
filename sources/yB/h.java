package Yb;

import Nb.g;
import Qb.E;
import org.json.JSONObject;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final E f64924a;

    h(E e10) {
        this.f64924a = e10;
    }

    private static i a(int i10) {
        if (i10 == 3) {
            return new m();
        }
        g f10 = g.f();
        f10.d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f64924a, jSONObject);
    }
}
