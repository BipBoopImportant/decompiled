package s3;

import android.os.Bundle;
import t3.C5950a;
import t3.N;

public final class f implements e {

    /* renamed from: c  reason: collision with root package name */
    private static final String f29085c = N.A0(0);

    /* renamed from: d  reason: collision with root package name */
    private static final String f29086d = N.A0(1);

    /* renamed from: a  reason: collision with root package name */
    public final String f29087a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29088b;

    public f(String str, int i10) {
        this.f29087a = str;
        this.f29088b = i10;
    }

    public static f a(Bundle bundle) {
        return new f((String) C5950a.e(bundle.getString(f29085c)), bundle.getInt(f29086d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f29085c, this.f29087a);
        bundle.putInt(f29086d, this.f29088b);
        return bundle;
    }
}
