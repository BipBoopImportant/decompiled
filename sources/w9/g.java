package W9;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class g implements Callable<Long> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f40550a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f40551b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Long f40552c;

    g(SharedPreferences sharedPreferences, String str, Long l10) {
        this.f40550a = sharedPreferences;
        this.f40551b = str;
        this.f40552c = l10;
    }

    public final /* synthetic */ Object call() {
        return Long.valueOf(this.f40550a.getLong(this.f40551b, this.f40552c.longValue()));
    }
}
