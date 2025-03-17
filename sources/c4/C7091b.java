package c4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import jb.j;
import q3.z;
import t3.C5950a;
import t3.N;

/* renamed from: c4.b  reason: case insensitive filesystem */
public final class C7091b implements z.b {
    public static final Parcelable.Creator<C7091b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<C0794b> f45654a;

    /* renamed from: c4.b$a */
    class a implements Parcelable.Creator<C7091b> {
        a() {
        }

        /* renamed from: a */
        public C7091b createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C0794b.class.getClassLoader());
            return new C7091b(arrayList);
        }

        /* renamed from: b */
        public C7091b[] newArray(int i10) {
            return new C7091b[i10];
        }
    }

    /* renamed from: c4.b$b  reason: collision with other inner class name */
    public static final class C0794b implements Parcelable {
        public static final Parcelable.Creator<C0794b> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public static final Comparator<C0794b> f45655d = new C7092c();

        /* renamed from: a  reason: collision with root package name */
        public final long f45656a;

        /* renamed from: b  reason: collision with root package name */
        public final long f45657b;

        /* renamed from: c  reason: collision with root package name */
        public final int f45658c;

        /* renamed from: c4.b$b$a */
        class a implements Parcelable.Creator<C0794b> {
            a() {
            }

            /* renamed from: a */
            public C0794b createFromParcel(Parcel parcel) {
                return new C0794b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* renamed from: b */
            public C0794b[] newArray(int i10) {
                return new C0794b[i10];
            }
        }

        public C0794b(long j10, long j11, int i10) {
            C5950a.a(j10 < j11);
            this.f45656a = j10;
            this.f45657b = j11;
            this.f45658c = i10;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0794b.class != obj.getClass()) {
                return false;
            }
            C0794b bVar = (C0794b) obj;
            return this.f45656a == bVar.f45656a && this.f45657b == bVar.f45657b && this.f45658c == bVar.f45658c;
        }

        public int hashCode() {
            return j.b(Long.valueOf(this.f45656a), Long.valueOf(this.f45657b), Integer.valueOf(this.f45658c));
        }

        public String toString() {
            return N.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f45656a), Long.valueOf(this.f45657b), Integer.valueOf(this.f45658c));
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f45656a);
            parcel.writeLong(this.f45657b);
            parcel.writeInt(this.f45658c);
        }
    }

    public C7091b(List<C0794b> list) {
        this.f45654a = list;
        C5950a.a(!a(list));
    }

    private static boolean a(List<C0794b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f45657b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f45656a < j10) {
                return true;
            }
            j10 = list.get(i10).f45657b;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7091b.class != obj.getClass()) {
            return false;
        }
        return this.f45654a.equals(((C7091b) obj).f45654a);
    }

    public int hashCode() {
        return this.f45654a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f45654a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f45654a);
    }
}
