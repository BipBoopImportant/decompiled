package x9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i9.C8219a;
import i9.b;
import i9.c;

/* renamed from: x9.a  reason: case insensitive filesystem */
public interface C8959a extends IInterface {

    /* renamed from: x9.a$a  reason: collision with other inner class name */
    public static abstract class C0931a extends b implements C8959a {

        /* renamed from: x9.a$a$a  reason: collision with other inner class name */
        public static class C0932a extends C8219a implements C8959a {
            C0932a(IBinder iBinder) {
                super(iBinder);
            }

            public final Bundle c(Bundle bundle) {
                Parcel I32 = I3();
                c.b(I32, bundle);
                Parcel J32 = J3(I32);
                Bundle bundle2 = (Bundle) c.a(J32, Bundle.CREATOR);
                J32.recycle();
                return bundle2;
            }
        }

        public static C8959a I3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return queryLocalInterface instanceof C8959a ? (C8959a) queryLocalInterface : new C0932a(iBinder);
        }
    }

    Bundle c(Bundle bundle);
}
