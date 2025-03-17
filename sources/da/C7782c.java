package da;

import android.os.Parcel;

/* renamed from: da.c  reason: case insensitive filesystem */
public class C7782c {

    /* renamed from: a  reason: collision with root package name */
    private static final ClassLoader f50833a = C7782c.class.getClassLoader();

    private C7782c() {
    }

    public static void a(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
