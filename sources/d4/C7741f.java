package d4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t3.B;

/* renamed from: d4.f  reason: case insensitive filesystem */
public final class C7741f extends C7737b {
    public static final Parcelable.Creator<C7741f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f50707a;

    /* renamed from: d4.f$a */
    class a implements Parcelable.Creator<C7741f> {
        a() {
        }

        /* renamed from: a */
        public C7741f createFromParcel(Parcel parcel) {
            return new C7741f(parcel, (a) null);
        }

        /* renamed from: b */
        public C7741f[] newArray(int i10) {
            return new C7741f[i10];
        }
    }

    /* renamed from: d4.f$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f50708a;

        /* renamed from: b  reason: collision with root package name */
        public final long f50709b;

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f50708a);
            parcel.writeLong(this.f50709b);
        }

        private b(int i10, long j10) {
            this.f50708a = i10;
            this.f50709b = j10;
        }
    }

    /* synthetic */ C7741f(Parcel parcel, a aVar) {
        this(parcel);
    }

    static C7741f a(B b10) {
        int H10 = b10.H();
        ArrayList arrayList = new ArrayList(H10);
        for (int i10 = 0; i10 < H10; i10++) {
            arrayList.add(c.e(b10));
        }
        return new C7741f((List<c>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f50707a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f50707a.get(i11).f(parcel);
        }
    }

    private C7741f(List<c> list) {
        this.f50707a = Collections.unmodifiableList(list);
    }

    private C7741f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.d(parcel));
        }
        this.f50707a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: d4.f$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f50710a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f50711b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f50712c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f50713d;

        /* renamed from: e  reason: collision with root package name */
        public final long f50714e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b> f50715f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f50716g;

        /* renamed from: h  reason: collision with root package name */
        public final long f50717h;

        /* renamed from: i  reason: collision with root package name */
        public final int f50718i;

        /* renamed from: j  reason: collision with root package name */
        public final int f50719j;

        /* renamed from: k  reason: collision with root package name */
        public final int f50720k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f50710a = j10;
            this.f50711b = z10;
            this.f50712c = z11;
            this.f50713d = z12;
            this.f50715f = Collections.unmodifiableList(list);
            this.f50714e = j11;
            this.f50716g = z13;
            this.f50717h = j12;
            this.f50718i = i10;
            this.f50719j = i11;
            this.f50720k = i12;
        }

        /* access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* access modifiers changed from: private */
        public static c e(B b10) {
            boolean z10;
            int i10;
            int i11;
            int i12;
            long j10;
            boolean z11;
            long j11;
            ArrayList arrayList;
            boolean z12;
            long j12;
            boolean z13;
            long J10 = b10.J();
            boolean z14 = (b10.H() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z14) {
                int H10 = b10.H();
                boolean z15 = (H10 & 128) != 0;
                boolean z16 = (H10 & 64) != 0;
                boolean z17 = (H10 & 32) != 0;
                long J11 = z16 ? b10.J() : -9223372036854775807L;
                if (!z16) {
                    int H11 = b10.H();
                    ArrayList arrayList3 = new ArrayList(H11);
                    for (int i13 = 0; i13 < H11; i13++) {
                        arrayList3.add(new b(b10.H(), b10.J(), (a) null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long H12 = (long) b10.H();
                    boolean z18 = (128 & H12) != 0;
                    j12 = ((((H12 & 1) << 32) | b10.J()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j12 = -9223372036854775807L;
                }
                int P10 = b10.P();
                int H13 = b10.H();
                z10 = z16;
                i10 = b10.H();
                j10 = j12;
                arrayList = arrayList2;
                long j13 = J11;
                i12 = P10;
                i11 = H13;
                j11 = j13;
                boolean z19 = z15;
                z11 = z13;
                z12 = z19;
            } else {
                arrayList = arrayList2;
                z12 = false;
                j11 = -9223372036854775807L;
                z11 = false;
                j10 = -9223372036854775807L;
                i12 = 0;
                i11 = 0;
                i10 = 0;
                z10 = false;
            }
            return new c(J10, z14, z12, z10, arrayList, j11, z11, j10, i12, i11, i10);
        }

        /* access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f50710a);
            parcel.writeByte(this.f50711b ? (byte) 1 : 0);
            parcel.writeByte(this.f50712c ? (byte) 1 : 0);
            parcel.writeByte(this.f50713d ? (byte) 1 : 0);
            int size = this.f50715f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f50715f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f50714e);
            parcel.writeByte(this.f50716g ? (byte) 1 : 0);
            parcel.writeLong(this.f50717h);
            parcel.writeInt(this.f50718i);
            parcel.writeInt(this.f50719j);
            parcel.writeInt(this.f50720k);
        }

        private c(Parcel parcel) {
            this.f50710a = parcel.readLong();
            boolean z10 = false;
            this.f50711b = parcel.readByte() == 1;
            this.f50712c = parcel.readByte() == 1;
            this.f50713d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.c(parcel));
            }
            this.f50715f = Collections.unmodifiableList(arrayList);
            this.f50714e = parcel.readLong();
            this.f50716g = parcel.readByte() == 1 ? true : z10;
            this.f50717h = parcel.readLong();
            this.f50718i = parcel.readInt();
            this.f50719j = parcel.readInt();
            this.f50720k = parcel.readInt();
        }
    }
}
