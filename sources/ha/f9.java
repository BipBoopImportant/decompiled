package ha;

import T9.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class f9 extends C7948a implements IInterface {
    f9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final List L3(b bVar, p9 p9Var) {
        Parcel I32 = I3();
        O.b(I32, bVar);
        O.a(I32, p9Var);
        Parcel J32 = J3(3, I32);
        ArrayList<V8> createTypedArrayList = J32.createTypedArrayList(V8.CREATOR);
        J32.recycle();
        return createTypedArrayList;
    }

    public final void h() {
        K3(1, I3());
    }

    public final void i() {
        K3(2, I3());
    }
}
