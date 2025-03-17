package fb;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: fb.e  reason: case insensitive filesystem */
public abstract class C9689e extends C9686b implements C9690f {
    public static C9690f J3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof C9690f ? (C9690f) queryLocalInterface : new C9688d(iBinder);
    }
}
