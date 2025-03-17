package W9;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class e implements Callable<Integer> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f40547a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f40548b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Integer f40549c;

    e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f40547a = sharedPreferences;
        this.f40548b = str;
        this.f40549c = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.f40547a.getInt(this.f40548b, this.f40549c.intValue()));
    }
}
