package H9;

import aa.C6989b;
import aa.C6990c;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: H9.f  reason: case insensitive filesystem */
public interface C6532f extends IInterface {

    /* renamed from: H9.f$a */
    public static abstract class a extends C6989b implements C6532f {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        /* access modifiers changed from: protected */
        public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            C6990c.b(parcel);
            g2((Status) C6990c.a(parcel, Status.CREATOR));
            return true;
        }
    }

    void g2(Status status);
}
