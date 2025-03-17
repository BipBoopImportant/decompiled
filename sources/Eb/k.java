package eb;

import android.os.Bundle;
import fb.C9691g;
import fb.C9693i;
import fb.t;
import xa.C8972m;

class k extends C9691g {

    /* renamed from: a  reason: collision with root package name */
    final C9693i f72577a;

    /* renamed from: b  reason: collision with root package name */
    final C8972m f72578b;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ m f72579i;

    k(m mVar, C9693i iVar, C8972m mVar2) {
        this.f72579i = mVar;
        this.f72577a = iVar;
        this.f72578b = mVar2;
    }

    public void v(Bundle bundle) {
        t tVar = this.f72579i.f72581a;
        if (tVar != null) {
            tVar.u(this.f72578b);
        }
        this.f72577a.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
