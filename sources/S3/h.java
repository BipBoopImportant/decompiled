package s3;

import android.os.Bundle;
import t3.N;

public final class h implements e {

    /* renamed from: d  reason: collision with root package name */
    private static final String f29089d = N.A0(0);

    /* renamed from: e  reason: collision with root package name */
    private static final String f29090e = N.A0(1);

    /* renamed from: f  reason: collision with root package name */
    private static final String f29091f = N.A0(2);

    /* renamed from: a  reason: collision with root package name */
    public int f29092a;

    /* renamed from: b  reason: collision with root package name */
    public int f29093b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29094c;

    public h(int i10, int i11, int i12) {
        this.f29092a = i10;
        this.f29093b = i11;
        this.f29094c = i12;
    }

    public static h a(Bundle bundle) {
        return new h(bundle.getInt(f29089d), bundle.getInt(f29090e), bundle.getInt(f29091f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f29089d, this.f29092a);
        bundle.putInt(f29090e, this.f29093b);
        bundle.putInt(f29091f, this.f29094c);
        return bundle;
    }
}
