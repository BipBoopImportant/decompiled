package C9;

import Z9.a;
import Z9.e;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;

public final class u extends a implements IInterface {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void K3(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel I32 = I3();
        e.d(I32, tVar);
        e.c(I32, googleSignInOptions);
        J3(103, I32);
    }

    public final void L3(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel I32 = I3();
        e.d(I32, tVar);
        e.c(I32, googleSignInOptions);
        J3(CheckoutActivity.RESULT_ERROR, I32);
    }
}
