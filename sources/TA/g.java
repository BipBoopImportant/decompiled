package ta;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class g implements Parcelable.Creator<a> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 2:
                    str = b.g(parcel, u10);
                    break;
                case 3:
                    bArr = b.b(parcel, u10);
                    break;
                case 4:
                    bArr2 = b.c(parcel, u10);
                    break;
                case 5:
                    bArr3 = b.c(parcel, u10);
                    break;
                case 6:
                    bArr4 = b.c(parcel, u10);
                    break;
                case 7:
                    bArr5 = b.c(parcel, u10);
                    break;
                case 8:
                    iArr = b.d(parcel, u10);
                    break;
                case 9:
                    bArr6 = b.c(parcel, u10);
                    break;
                default:
                    b.B(parcel, u10);
                    break;
            }
        }
        b.l(parcel, C10);
        return new a(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
