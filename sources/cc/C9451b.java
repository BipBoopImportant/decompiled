package cc;

import android.net.Uri;
import com.google.android.gms.common.util.h;
import dc.C9615a;
import dc.C9617c;

@Deprecated
/* renamed from: cc.b  reason: case insensitive filesystem */
public class C9451b {

    /* renamed from: a  reason: collision with root package name */
    private final C9617c f65680a;

    /* renamed from: b  reason: collision with root package name */
    private final C9615a f65681b;

    public C9451b(C9615a aVar) {
        if (aVar == null) {
            this.f65681b = null;
            this.f65680a = null;
            return;
        }
        if (aVar.x() == 0) {
            aVar.E0(h.d().a());
        }
        this.f65681b = aVar;
        this.f65680a = new C9617c(aVar);
    }

    @Deprecated
    public Uri a() {
        String B10;
        C9615a aVar = this.f65681b;
        if (aVar == null || (B10 = aVar.B()) == null) {
            return null;
        }
        return Uri.parse(B10);
    }

    @Deprecated
    public int b() {
        C9615a aVar = this.f65681b;
        if (aVar == null) {
            return 0;
        }
        return aVar.U();
    }
}
