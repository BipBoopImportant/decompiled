package hb;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import s.C5823b;
import s.C5826e;

public class f implements C5826e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f73524a;

    public f(Context context) {
        this.f73524a = context.getApplicationContext();
    }

    public void a(C5823b bVar) {
        SharedPreferences a10 = e.a(this.f73524a);
        if (bVar == null) {
            a10.edit().remove("SharedPreferencesTokenStore.TOKEN").apply();
            return;
        }
        a10.edit().putString("SharedPreferencesTokenStore.TOKEN", Base64.encodeToString(bVar.b(), 3)).apply();
    }
}
