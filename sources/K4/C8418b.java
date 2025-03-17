package k4;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import t3.C5950a;
import t3.C5952c;

/* renamed from: k4.b  reason: case insensitive filesystem */
public final class C8418b {
    public C8421e a(long j10, byte[] bArr, int i10, int i11) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, i10, i11);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return new C8421e(C5952c.a(new C8417a(), (ArrayList) C5950a.e(readBundle.getParcelableArrayList("c"))), j10, readBundle.getLong("d"));
    }
}
