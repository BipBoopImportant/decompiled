package L9;

import K9.C6620s;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class e {
    public static <T extends d> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        C6620s.l(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t10 = (d) creator.createFromParcel(obtain);
        obtain.recycle();
        return t10;
    }

    public static <T extends d> T b(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return a(byteArrayExtra, creator);
    }

    public static <T extends d> byte[] c(T t10) {
        Parcel obtain = Parcel.obtain();
        t10.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static <T extends d> void d(T t10, Intent intent, String str) {
        intent.putExtra(str, c(t10));
    }
}
