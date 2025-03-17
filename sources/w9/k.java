package W9;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class k implements Callable<SharedPreferences> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f40557a;

    k(Context context) {
        this.f40557a = context;
    }

    public final /* synthetic */ Object call() {
        return this.f40557a.getSharedPreferences("google_sdk_flags", 0);
    }
}
