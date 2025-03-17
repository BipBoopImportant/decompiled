package q3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import t3.C5950a;
import t3.N;

/* renamed from: q3.n  reason: case insensitive filesystem */
public final class C5803n implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<C5803n> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b[] f28169a;

    /* renamed from: b  reason: collision with root package name */
    private int f28170b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28171c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28172d;

    /* renamed from: q3.n$a */
    class a implements Parcelable.Creator<C5803n> {
        a() {
        }

        /* renamed from: a */
        public C5803n createFromParcel(Parcel parcel) {
            return new C5803n(parcel);
        }

        /* renamed from: b */
        public C5803n[] newArray(int i10) {
            return new C5803n[i10];
        }
    }

    /* renamed from: q3.n$b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private int f28173a;

        /* renamed from: b  reason: collision with root package name */
        public final UUID f28174b;

        /* renamed from: c  reason: collision with root package name */
        public final String f28175c;

        /* renamed from: d  reason: collision with root package name */
        public final String f28176d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f28177e;

        /* renamed from: q3.n$b$a */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, (String) null, str, bArr);
        }

        public b a(byte[] bArr) {
            return new b(this.f28174b, this.f28175c, this.f28176d, bArr);
        }

        public boolean b(UUID uuid) {
            return C5797h.f28129a.equals(this.f28174b) || uuid.equals(this.f28174b);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return N.d(this.f28175c, bVar.f28175c) && N.d(this.f28176d, bVar.f28176d) && N.d(this.f28174b, bVar.f28174b) && Arrays.equals(this.f28177e, bVar.f28177e);
        }

        public int hashCode() {
            if (this.f28173a == 0) {
                int hashCode = this.f28174b.hashCode() * 31;
                String str = this.f28175c;
                this.f28173a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f28176d.hashCode()) * 31) + Arrays.hashCode(this.f28177e);
            }
            return this.f28173a;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f28174b.getMostSignificantBits());
            parcel.writeLong(this.f28174b.getLeastSignificantBits());
            parcel.writeString(this.f28175c);
            parcel.writeString(this.f28176d);
            parcel.writeByteArray(this.f28177e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f28174b = (UUID) C5950a.e(uuid);
            this.f28175c = str;
            this.f28176d = A.r((String) C5950a.e(str2));
            this.f28177e = bArr;
        }

        b(Parcel parcel) {
            this.f28174b = new UUID(parcel.readLong(), parcel.readLong());
            this.f28175c = parcel.readString();
            this.f28176d = (String) N.i(parcel.readString());
            this.f28177e = parcel.createByteArray();
        }
    }

    public C5803n(List<b> list) {
        this((String) null, false, (b[]) list.toArray(new b[0]));
    }

    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = C5797h.f28129a;
        return uuid.equals(bVar.f28174b) ? uuid.equals(bVar2.f28174b) ? 0 : 1 : bVar.f28174b.compareTo(bVar2.f28174b);
    }

    public C5803n b(String str) {
        return N.d(this.f28171c, str) ? this : new C5803n(str, false, this.f28169a);
    }

    public b c(int i10) {
        return this.f28169a[i10];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5803n.class != obj.getClass()) {
            return false;
        }
        C5803n nVar = (C5803n) obj;
        return N.d(this.f28171c, nVar.f28171c) && Arrays.equals(this.f28169a, nVar.f28169a);
    }

    public int hashCode() {
        if (this.f28170b == 0) {
            String str = this.f28171c;
            this.f28170b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f28169a);
        }
        return this.f28170b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f28171c);
        parcel.writeTypedArray(this.f28169a, 0);
    }

    public C5803n(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public C5803n(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: q3.n$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C5803n(java.lang.String r1, boolean r2, q3.C5803n.b... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f28171c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            q3.n$b[] r3 = (q3.C5803n.b[]) r3
        L_0x000e:
            r0.f28169a = r3
            int r1 = r3.length
            r0.f28172d = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.C5803n.<init>(java.lang.String, boolean, q3.n$b[]):void");
    }

    C5803n(Parcel parcel) {
        this.f28171c = parcel.readString();
        b[] bVarArr = (b[]) N.i((b[]) parcel.createTypedArray(b.CREATOR));
        this.f28169a = bVarArr;
        this.f28172d = bVarArr.length;
    }
}
