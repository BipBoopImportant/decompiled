package Ya;

import Za.s;
import ab.C9403a;
import android.os.Bundle;
import xa.C8972m;

final class u extends s {

    /* renamed from: j  reason: collision with root package name */
    private final String f64880j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ v f64881k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u(v vVar, C8972m mVar, String str) {
        super(vVar, new s("OnRequestInstallCallback"), mVar);
        this.f64881k = vVar;
        this.f64880j = str;
    }

    public final void G2(Bundle bundle) {
        super.G2(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f64878b.d(new C9403a(bundle.getInt("error.code", -2)));
        } else {
            this.f64878b.e(v.f(this.f64881k, bundle, this.f64880j));
        }
    }
}
