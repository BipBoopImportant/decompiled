package d4;

import android.os.Parcel;
import android.os.Parcelable;
import t3.B;
import t3.H;

/* renamed from: d4.g  reason: case insensitive filesystem */
public final class C7742g extends C7737b {
    public static final Parcelable.Creator<C7742g> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f50721a;

    /* renamed from: b  reason: collision with root package name */
    public final long f50722b;

    /* renamed from: d4.g$a */
    class a implements Parcelable.Creator<C7742g> {
        a() {
        }

        /* renamed from: a */
        public C7742g createFromParcel(Parcel parcel) {
            return new C7742g(parcel.readLong(), parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public C7742g[] newArray(int i10) {
            return new C7742g[i10];
        }
    }

    /* synthetic */ C7742g(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    static C7742g a(B b10, long j10, H h10) {
        long b11 = b(b10, j10);
        return new C7742g(b11, h10.b(b11));
    }

    static long b(B b10, long j10) {
        long H10 = (long) b10.H();
        if ((128 & H10) != 0) {
            return 8589934591L & ((((H10 & 1) << 32) | b10.J()) + j10);
        }
        return -9223372036854775807L;
    }

    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f50721a + ", playbackPositionUs= " + this.f50722b + " }";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f50721a);
        parcel.writeLong(this.f50722b);
    }

    private C7742g(long j10, long j11) {
        this.f50721a = j10;
        this.f50722b = j11;
    }
}
