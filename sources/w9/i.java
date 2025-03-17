package W9;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class i implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f40553a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f40554b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f40555c;

    i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f40553a = sharedPreferences;
        this.f40554b = str;
        this.f40555c = str2;
    }

    public final /* synthetic */ Object call() {
        return this.f40553a.getString(this.f40554b, this.f40555c);
    }
}
