package Za;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Za.i  reason: case insensitive filesystem */
public final class C9384i {

    /* renamed from: a  reason: collision with root package name */
    private static final ClassLoader f65038a = C9384i.class.getClassLoader();

    private C9384i() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
        }
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
