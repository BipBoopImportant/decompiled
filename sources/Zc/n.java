package Zc;

import Kb.C9128c;
import Kb.q;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

public class n {

    /* renamed from: b  reason: collision with root package name */
    public static final C9128c<?> f65126b = C9128c.e(n.class).b(q.l(C9400i.class)).b(q.l(Context.class)).f(F.f65079a).d();

    /* renamed from: a  reason: collision with root package name */
    protected final Context f65127a;

    public n(Context context) {
        this.f65127a = context;
    }

    public synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", (String) null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences b() {
        return this.f65127a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
