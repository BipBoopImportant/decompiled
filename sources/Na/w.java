package na;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import ea.J;

public final class w implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C10 = b.C(parcel);
        WorkSource workSource = new WorkSource();
        J j10 = null;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        long j11 = Long.MAX_VALUE;
        long j12 = Long.MAX_VALUE;
        int i12 = 102;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 1:
                    j11 = b.y(parcel2, u10);
                    break;
                case 2:
                    i10 = b.w(parcel2, u10);
                    break;
                case 3:
                    i12 = b.w(parcel2, u10);
                    break;
                case 4:
                    j12 = b.y(parcel2, u10);
                    break;
                case 5:
                    z10 = b.n(parcel2, u10);
                    break;
                case 6:
                    workSource = (WorkSource) b.f(parcel2, u10, WorkSource.CREATOR);
                    break;
                case 7:
                    i11 = b.w(parcel2, u10);
                    break;
                case 9:
                    j10 = (J) b.f(parcel2, u10, J.CREATOR);
                    break;
                default:
                    b.B(parcel2, u10);
                    break;
            }
        }
        b.l(parcel2, C10);
        return new C8592a(j11, i10, i12, j12, z10, i11, workSource, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C8592a[i10];
    }
}
