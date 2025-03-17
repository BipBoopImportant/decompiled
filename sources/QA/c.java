package qa;

import K9.C6620s;
import android.graphics.Bitmap;
import android.os.RemoteException;
import fa.o;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static o f55647a;

    public static b a(Bitmap bitmap) {
        C6620s.m(bitmap, "image must not be null");
        try {
            return new b(c().W(bitmap));
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public static void b(o oVar) {
        if (f55647a == null) {
            f55647a = (o) C6620s.m(oVar, "delegate must not be null");
        }
    }

    private static o c() {
        return (o) C6620s.m(f55647a, "IBitmapDescriptorFactory is not initialized");
    }
}
