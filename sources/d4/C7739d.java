package d4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t3.B;
import t3.H;

/* renamed from: d4.d  reason: case insensitive filesystem */
public final class C7739d extends C7737b {
    public static final Parcelable.Creator<C7739d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f50691a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f50692b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f50693c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f50694d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f50695e;

    /* renamed from: f  reason: collision with root package name */
    public final long f50696f;

    /* renamed from: g  reason: collision with root package name */
    public final long f50697g;

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f50698h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f50699i;

    /* renamed from: j  reason: collision with root package name */
    public final long f50700j;

    /* renamed from: k  reason: collision with root package name */
    public final int f50701k;

    /* renamed from: l  reason: collision with root package name */
    public final int f50702l;

    /* renamed from: m  reason: collision with root package name */
    public final int f50703m;

    /* renamed from: d4.d$a */
    class a implements Parcelable.Creator<C7739d> {
        a() {
        }

        /* renamed from: a */
        public C7739d createFromParcel(Parcel parcel) {
            return new C7739d(parcel, (a) null);
        }

        /* renamed from: b */
        public C7739d[] newArray(int i10) {
            return new C7739d[i10];
        }
    }

    /* renamed from: d4.d$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f50704a;

        /* renamed from: b  reason: collision with root package name */
        public final long f50705b;

        /* renamed from: c  reason: collision with root package name */
        public final long f50706c;

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f50704a);
            parcel.writeLong(this.f50705b);
            parcel.writeLong(this.f50706c);
        }

        private b(int i10, long j10, long j11) {
            this.f50704a = i10;
            this.f50705b = j10;
            this.f50706c = j11;
        }
    }

    /* synthetic */ C7739d(Parcel parcel, a aVar) {
        this(parcel);
    }

    static C7739d a(B b10, long j10, H h10) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        long j11;
        boolean z11;
        List list;
        long j12;
        boolean z12;
        boolean z13;
        long j13;
        boolean z14;
        H h11 = h10;
        long J10 = b10.J();
        boolean z15 = (b10.H() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z15) {
            int H10 = b10.H();
            boolean z16 = (H10 & 128) != 0;
            boolean z17 = (H10 & 64) != 0;
            boolean z18 = (H10 & 32) != 0;
            boolean z19 = (H10 & 16) != 0;
            long b11 = (!z17 || z19) ? -9223372036854775807L : C7742g.b(b10, j10);
            if (!z17) {
                int H11 = b10.H();
                ArrayList arrayList = new ArrayList(H11);
                for (int i13 = 0; i13 < H11; i13++) {
                    int H12 = b10.H();
                    long b12 = !z19 ? C7742g.b(b10, j10) : -9223372036854775807L;
                    arrayList.add(new b(H12, b12, h11.b(b12), (a) null));
                }
                emptyList = arrayList;
            }
            if (z18) {
                long H13 = (long) b10.H();
                boolean z20 = (128 & H13) != 0;
                j13 = ((((H13 & 1) << 32) | b10.J()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                j13 = -9223372036854775807L;
            }
            i12 = b10.P();
            z10 = z17;
            i11 = b10.H();
            i10 = b10.H();
            list = emptyList;
            long j14 = b11;
            z11 = z14;
            j11 = j13;
            z12 = z19;
            z13 = z16;
            j12 = j14;
        } else {
            list = emptyList;
            z13 = false;
            z12 = false;
            j12 = -9223372036854775807L;
            z11 = false;
            j11 = -9223372036854775807L;
            i12 = 0;
            i11 = 0;
            i10 = 0;
            z10 = false;
        }
        return new C7739d(J10, z15, z13, z10, z12, j12, h11.b(j12), list, z11, j11, i12, i11, i10);
    }

    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f50696f + ", programSplicePlaybackPositionUs= " + this.f50697g + " }";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f50691a);
        parcel.writeByte(this.f50692b ? (byte) 1 : 0);
        parcel.writeByte(this.f50693c ? (byte) 1 : 0);
        parcel.writeByte(this.f50694d ? (byte) 1 : 0);
        parcel.writeByte(this.f50695e ? (byte) 1 : 0);
        parcel.writeLong(this.f50696f);
        parcel.writeLong(this.f50697g);
        int size = this.f50698h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f50698h.get(i11).b(parcel);
        }
        parcel.writeByte(this.f50699i ? (byte) 1 : 0);
        parcel.writeLong(this.f50700j);
        parcel.writeInt(this.f50701k);
        parcel.writeInt(this.f50702l);
        parcel.writeInt(this.f50703m);
    }

    private C7739d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f50691a = j10;
        this.f50692b = z10;
        this.f50693c = z11;
        this.f50694d = z12;
        this.f50695e = z13;
        this.f50696f = j11;
        this.f50697g = j12;
        this.f50698h = Collections.unmodifiableList(list);
        this.f50699i = z14;
        this.f50700j = j13;
        this.f50701k = i10;
        this.f50702l = i11;
        this.f50703m = i12;
    }

    private C7739d(Parcel parcel) {
        this.f50691a = parcel.readLong();
        boolean z10 = false;
        this.f50692b = parcel.readByte() == 1;
        this.f50693c = parcel.readByte() == 1;
        this.f50694d = parcel.readByte() == 1;
        this.f50695e = parcel.readByte() == 1;
        this.f50696f = parcel.readLong();
        this.f50697g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f50698h = Collections.unmodifiableList(arrayList);
        this.f50699i = parcel.readByte() == 1 ? true : z10;
        this.f50700j = parcel.readLong();
        this.f50701k = parcel.readInt();
        this.f50702l = parcel.readInt();
        this.f50703m = parcel.readInt();
    }
}
