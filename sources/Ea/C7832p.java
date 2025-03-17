package ea;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ea.p  reason: case insensitive filesystem */
public final class C7832p {

    /* renamed from: a  reason: collision with root package name */
    private static final ClassLoader f50971a = C7832p.class.getClassLoader();

    private C7832p() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }

    public static void d(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(dataAvail).length() + 45);
            sb2.append("Parcel data not fully consumed, unread size: ");
            sb2.append(dataAvail);
            throw new BadParcelableException(sb2.toString());
        }
    }
}
