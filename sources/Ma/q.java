package ma;

import Ba.C6384h;
import Ba.C6385i;
import Ba.H;
import Ca.b;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

public abstract class q extends c implements r {
    public q() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                d.b(parcel);
                s0(parcel.readInt(), (MaskedWallet) d.a(parcel, MaskedWallet.CREATOR), (Bundle) d.a(parcel, Bundle.CREATOR));
                return true;
            case 2:
                d.b(parcel);
                w3(parcel.readInt(), (FullWallet) d.a(parcel, FullWallet.CREATOR), (Bundle) d.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                d.b(parcel);
                T(parcel.readInt(), d.e(parcel), (Bundle) d.a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                d.b(parcel);
                V0(parcel.readInt(), (Bundle) d.a(parcel, Bundle.CREATOR));
                return true;
            case 6:
                parcel.readInt();
                d.e(parcel);
                Bundle bundle = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                return true;
            case 7:
                Status status = (Status) d.a(parcel, Status.CREATOR);
                f fVar = (f) d.a(parcel, f.CREATOR);
                Bundle bundle2 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                return true;
            case 8:
                Status status2 = (Status) d.a(parcel, Status.CREATOR);
                Bundle bundle3 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                return true;
            case 9:
                d.b(parcel);
                Q1((Status) d.a(parcel, Status.CREATOR), d.e(parcel), (Bundle) d.a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Status status3 = (Status) d.a(parcel, Status.CREATOR);
                h hVar = (h) d.a(parcel, h.CREATOR);
                Bundle bundle4 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                return true;
            case 11:
                Status status4 = (Status) d.a(parcel, Status.CREATOR);
                Bundle bundle5 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                return true;
            case 12:
                Status status5 = (Status) d.a(parcel, Status.CREATOR);
                H h10 = (H) d.a(parcel, H.CREATOR);
                Bundle bundle6 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                return true;
            case 13:
                Status status6 = (Status) d.a(parcel, Status.CREATOR);
                Bundle bundle7 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                return true;
            case 14:
                d.b(parcel);
                A0((Status) d.a(parcel, Status.CREATOR), (C6385i) d.a(parcel, C6385i.CREATOR), (Bundle) d.a(parcel, Bundle.CREATOR));
                return true;
            case 15:
                Status status7 = (Status) d.a(parcel, Status.CREATOR);
                n nVar = (n) d.a(parcel, n.CREATOR);
                Bundle bundle8 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                return true;
            case 16:
                Status status8 = (Status) d.a(parcel, Status.CREATOR);
                j jVar = (j) d.a(parcel, j.CREATOR);
                Bundle bundle9 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                return true;
            case 17:
                Status status9 = (Status) d.a(parcel, Status.CREATOR);
                l lVar = (l) d.a(parcel, l.CREATOR);
                Bundle bundle10 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                return true;
            case 18:
                parcel.readInt();
                Bundle bundle11 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                return true;
            case 19:
                d.b(parcel);
                c2((Status) d.a(parcel, Status.CREATOR), (C6384h) d.a(parcel, C6384h.CREATOR), (Bundle) d.a(parcel, Bundle.CREATOR));
                return true;
            case 20:
                Status status10 = (Status) d.a(parcel, Status.CREATOR);
                b bVar = (b) d.a(parcel, b.CREATOR);
                Bundle bundle12 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                return true;
            default:
                return false;
        }
    }
}
