package xb;

import Cb.C;
import Cb.t;
import Db.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
import qb.C10172q;

/* renamed from: xb.d  reason: case insensitive filesystem */
public final class C10382d implements C10172q {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences.Editor f77701a;

    /* renamed from: b  reason: collision with root package name */
    private final String f77702b;

    public C10382d(Context context, String str, String str2) {
        if (str != null) {
            this.f77702b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f77701a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                this.f77701a = applicationContext.getSharedPreferences(str2, 0).edit();
            }
        } else {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    public void a(C c10) {
        if (!this.f77701a.putString(this.f77702b, k.b(c10.a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public void b(t tVar) {
        if (!this.f77701a.putString(this.f77702b, k.b(tVar.a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
