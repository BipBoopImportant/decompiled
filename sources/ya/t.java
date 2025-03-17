package Ya;

import Za.s;
import ab.C9403a;
import android.os.Bundle;
import xa.C8972m;

final class t extends s {
    t(v vVar, C8972m mVar) {
        super(vVar, new s("OnCompleteUpdateCallback"), mVar);
    }

    public final void v(Bundle bundle) {
        super.v(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f64878b.d(new C9403a(bundle.getInt("error.code", -2)));
        } else {
            this.f64878b.e(null);
        }
    }
}
