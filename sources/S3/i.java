package s3;

import android.os.Bundle;
import t3.C5950a;
import t3.N;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    private static final String f29095b = N.A0(0);

    /* renamed from: a  reason: collision with root package name */
    public final String f29096a;

    public i(String str) {
        this.f29096a = str;
    }

    public static i a(Bundle bundle) {
        return new i((String) C5950a.e(bundle.getString(f29095b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f29095b, this.f29096a);
        return bundle;
    }
}
