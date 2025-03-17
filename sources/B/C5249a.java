package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.a  reason: case insensitive filesystem */
public interface C5249a extends IInterface {

    /* renamed from: e  reason: collision with root package name */
    public static final String f22929e = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* renamed from: b.a$a  reason: collision with other inner class name */
    public static abstract class C0353a extends Binder implements C5249a {
        public C0353a() {
            attachInterface(this, C5249a.f22929e);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = C5249a.f22929e;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    Z2(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    P0(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 4:
                    x3((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 5:
                    p3(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 6:
                    A3(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 7:
                    Bundle f02 = f0(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, f02, 1);
                    break;
                case 8:
                    L2(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 9:
                    W0((Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 10:
                    O(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 11:
                    w2((Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 12:
                    E2((Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
            return true;
        }
    }

    /* renamed from: b.a$b */
    public static class b {
        /* access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 != null) {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void A3(int i10, Uri uri, boolean z10, Bundle bundle);

    void E2(Bundle bundle);

    void L2(int i10, int i11, Bundle bundle);

    void O(int i10, int i11, int i12, int i13, int i14, Bundle bundle);

    void P0(String str, Bundle bundle);

    void W0(Bundle bundle);

    void Z2(int i10, Bundle bundle);

    Bundle f0(String str, Bundle bundle);

    void p3(String str, Bundle bundle);

    void w2(Bundle bundle);

    void x3(Bundle bundle);
}
