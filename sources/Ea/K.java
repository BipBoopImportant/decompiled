package ea;

import java.util.Objects;
import xa.C8965f;
import xa.C8971l;
import xa.C8972m;

final /* synthetic */ class K implements C8965f {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C8972m f50920a;

    /* synthetic */ K(C8972m mVar) {
        this.f50920a = mVar;
    }

    public final /* synthetic */ void onComplete(C8971l lVar) {
        int i10 = I.f50908M;
        if (!lVar.q()) {
            C8972m mVar = this.f50920a;
            Exception l10 = lVar.l();
            Objects.requireNonNull(l10);
            mVar.d(l10);
        }
    }
}
