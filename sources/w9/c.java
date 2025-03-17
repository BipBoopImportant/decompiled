package W9;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class c implements Callable<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f40544a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f40545b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Boolean f40546c;

    c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f40544a = sharedPreferences;
        this.f40545b = str;
        this.f40546c = bool;
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.f40544a.getBoolean(this.f40545b, this.f40546c.booleanValue()));
    }
}
