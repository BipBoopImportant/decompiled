package Ca;

import T9.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.wallet.button.ButtonOptions;
import ma.a;

public final class d extends a implements IInterface {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.button.IPayButtonCreator");
    }

    public final b L3(b bVar, ButtonOptions buttonOptions) {
        Parcel I32 = I3();
        ma.d.d(I32, bVar);
        ma.d.c(I32, buttonOptions);
        Parcel J32 = J3(1, I32);
        b J33 = b.a.J3(J32.readStrongBinder());
        J32.recycle();
        return J33;
    }
}
