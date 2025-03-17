package ea;

import android.location.Location;
import com.google.android.gms.common.api.a;
import java.util.Objects;
import xa.C8962c;
import xa.C8971l;
import xa.C8972m;

/* renamed from: ea.k  reason: case insensitive filesystem */
final /* synthetic */ class C7827k implements C8962c {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C8972m f50963a;

    /* synthetic */ C7827k(C8972m mVar) {
        this.f50963a = mVar;
    }

    public final /* synthetic */ Object then(C8971l lVar) {
        a aVar = C7825i.f50959l;
        C8972m mVar = this.f50963a;
        if (lVar.q()) {
            mVar.e((Location) lVar.m());
            return null;
        }
        Exception l10 = lVar.l();
        Objects.requireNonNull(l10);
        mVar.d(l10);
        return null;
    }
}
