package Ca;

import T9.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.wallet.button.ButtonOptions;

public final class e {
    public static final View a(Context context, ButtonOptions buttonOptions) {
        d dVar;
        DynamiteModule b10 = b(context);
        try {
            IBinder d10 = b10.d("com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl");
            if (d10 == null) {
                dVar = null;
            } else {
                IInterface queryLocalInterface = d10.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
                dVar = queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(d10);
            }
            if (dVar != null) {
                return (View) d.K3(dVar.L3(d.L3(new Context[]{b10.b(), context}), buttonOptions));
            }
            Log.e("PayButtonProxy", "Failed to get the actual PayButtonCreatorChimeraImpl.");
            return null;
        } catch (RemoteException e10) {
            e = e10;
            Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
            return null;
        } catch (DynamiteModule.a e11) {
            e = e11;
            Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
            return null;
        }
    }

    private static final DynamiteModule b(Context context) {
        try {
            return DynamiteModule.e(context, DynamiteModule.f48093b, "com.google.android.gms.wallet_dynamite");
        } catch (DynamiteModule.a e10) {
            throw new IllegalStateException(e10);
        }
    }
}
