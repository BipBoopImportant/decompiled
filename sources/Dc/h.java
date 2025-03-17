package dc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

public interface h extends IInterface {

    public static abstract class a extends Binder implements h {
        public a() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            }
            if (i10 != 1598968902) {
                if (i10 == 1) {
                    l3((Status) b.b(parcel, Status.CREATOR), (C9615a) b.b(parcel, C9615a.CREATOR));
                } else if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    f3((Status) b.b(parcel, Status.CREATOR), (j) b.b(parcel, j.CREATOR));
                }
                return true;
            }
            parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            return true;
        }
    }

    public static class b {
        /* access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void f3(Status status, j jVar);

    void l3(Status status, C9615a aVar);
}
