package fa;

import T9.b;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;

public final class m extends a implements o {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    public final b W(Bitmap bitmap) {
        Parcel J32 = J3();
        l.c(J32, bitmap);
        Parcel I32 = I3(6, J32);
        b J33 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J33;
    }
}
