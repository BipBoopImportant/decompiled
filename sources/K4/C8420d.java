package k4;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import s3.a;
import t3.C5952c;

/* renamed from: k4.d  reason: case insensitive filesystem */
public final class C8420d {
    public byte[] a(List<a> list, long j10) {
        ArrayList<Bundle> b10 = C5952c.b(list, new C8419c());
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", b10);
        bundle.putLong("d", j10);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
