package eb;

import android.app.PendingIntent;
import android.os.Bundle;
import fb.C9693i;
import xa.C8972m;

final class l extends k {
    l(m mVar, C8972m mVar2, String str) {
        super(mVar, new C9693i("OnRequestInstallCallback"), mVar2);
    }

    public final void v(Bundle bundle) {
        super.v(bundle);
        this.f72578b.e(new e((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
