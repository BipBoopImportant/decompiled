package d4;

import android.os.Parcel;
import android.os.Parcelable;
import t3.B;
import t3.N;

/* renamed from: d4.a  reason: case insensitive filesystem */
public final class C7736a extends C7737b {
    public static final Parcelable.Creator<C7736a> CREATOR = new C0827a();

    /* renamed from: a  reason: collision with root package name */
    public final long f50685a;

    /* renamed from: b  reason: collision with root package name */
    public final long f50686b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f50687c;

    /* renamed from: d4.a$a  reason: collision with other inner class name */
    class C0827a implements Parcelable.Creator<C7736a> {
        C0827a() {
        }

        /* renamed from: a */
        public C7736a createFromParcel(Parcel parcel) {
            return new C7736a(parcel, (C0827a) null);
        }

        /* renamed from: b */
        public C7736a[] newArray(int i10) {
            return new C7736a[i10];
        }
    }

    /* synthetic */ C7736a(Parcel parcel, C0827a aVar) {
        this(parcel);
    }

    static C7736a a(B b10, int i10, long j10) {
        long J10 = b10.J();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        b10.l(bArr, 0, i11);
        return new C7736a(J10, bArr, j10);
    }

    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f50685a + ", identifier= " + this.f50686b + " }";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f50685a);
        parcel.writeLong(this.f50686b);
        parcel.writeByteArray(this.f50687c);
    }

    private C7736a(long j10, byte[] bArr, long j11) {
        this.f50685a = j11;
        this.f50686b = j10;
        this.f50687c = bArr;
    }

    private C7736a(Parcel parcel) {
        this.f50685a = parcel.readLong();
        this.f50686b = parcel.readLong();
        this.f50687c = (byte[]) N.i(parcel.createByteArray());
    }
}
