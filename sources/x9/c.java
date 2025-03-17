package X9;

import android.os.Parcel;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final ClassLoader f40798a = c.class.getClassLoader();

    private c() {
    }

    public static void a(Parcel parcel, boolean z10) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
