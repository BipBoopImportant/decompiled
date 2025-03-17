package ma;

import H9.C6546u;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import xa.C8972m;

final class u extends t {

    /* renamed from: a  reason: collision with root package name */
    private final C8972m f55064a;

    u(C8972m mVar) {
        this.f55064a = mVar;
    }

    public final void Q1(Status status, boolean z10, Bundle bundle) {
        C6546u.a(status, Boolean.valueOf(z10), this.f55064a);
    }

    public final void T(int i10, boolean z10, Bundle bundle) {
        C6546u.a(new Status(i10), Boolean.valueOf(z10), this.f55064a);
    }
}
