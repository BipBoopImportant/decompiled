package a4;

import android.os.Parcel;
import android.os.Parcelable;
import q3.y;
import q3.z;
import t3.C5950a;
import t3.N;

/* renamed from: a4.b  reason: case insensitive filesystem */
public final class C6741b implements z.b {
    public static final Parcelable.Creator<C6741b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f41430a;

    /* renamed from: b  reason: collision with root package name */
    public final String f41431b;

    /* renamed from: c  reason: collision with root package name */
    public final String f41432c;

    /* renamed from: d  reason: collision with root package name */
    public final String f41433d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f41434e;

    /* renamed from: f  reason: collision with root package name */
    public final int f41435f;

    /* renamed from: a4.b$a */
    class a implements Parcelable.Creator<C6741b> {
        a() {
        }

        /* renamed from: a */
        public C6741b createFromParcel(Parcel parcel) {
            return new C6741b(parcel);
        }

        /* renamed from: b */
        public C6741b[] newArray(int i10) {
            return new C6741b[i10];
        }
    }

    public C6741b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        C5950a.a(i11 == -1 || i11 > 0);
        this.f41430a = i10;
        this.f41431b = str;
        this.f41432c = str2;
        this.f41433d = str3;
        this.f41434e = z10;
        this.f41435f = i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a4.C6741b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = 1
            r4 = 0
            r5 = -1
            if (r1 == 0) goto L_0x0050
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0039 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0021
            r1 = r3
            goto L_0x0037
        L_0x0021:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x003a }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r8 = "Invalid bitrate: "
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x003a }
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r7 = r7.toString()     // Catch:{ NumberFormatException -> 0x003a }
            t3.q.h(r2, r7)     // Catch:{ NumberFormatException -> 0x003a }
            r1 = r4
            r6 = r5
        L_0x0037:
            r7 = r6
            goto L_0x0052
        L_0x0039:
            r6 = r5
        L_0x003a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid bitrate header: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            t3.q.h(r2, r1)
            r1 = r4
            goto L_0x0037
        L_0x0050:
            r1 = r4
            r7 = r5
        L_0x0052:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L_0x0066
            java.lang.Object r1 = r6.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = r3
            goto L_0x0067
        L_0x0066:
            r9 = r8
        L_0x0067:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x007a
            java.lang.Object r1 = r6.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r3
            goto L_0x007b
        L_0x007a:
            r10 = r8
        L_0x007b:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x008e
            java.lang.Object r1 = r6.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r3
            goto L_0x008f
        L_0x008e:
            r11 = r8
        L_0x008f:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00a8
            java.lang.Object r1 = r6.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = r3
            goto L_0x00a9
        L_0x00a8:
            r12 = r4
        L_0x00a9:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x00e9
            java.lang.Object r13 = r13.get(r4)
            java.lang.String r13 = (java.lang.String) r13
            int r4 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00d7 }
            if (r4 <= 0) goto L_0x00c1
            r5 = r4
            goto L_0x00d4
        L_0x00c1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00d6 }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x00d6 }
            r3.append(r0)     // Catch:{ NumberFormatException -> 0x00d6 }
            r3.append(r13)     // Catch:{ NumberFormatException -> 0x00d6 }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x00d6 }
            t3.q.h(r2, r3)     // Catch:{ NumberFormatException -> 0x00d6 }
            r3 = r1
        L_0x00d4:
            r1 = r3
            goto L_0x00e9
        L_0x00d6:
            r5 = r4
        L_0x00d7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            t3.q.h(r2, r13)
        L_0x00e9:
            if (r1 == 0) goto L_0x00f7
            a4.b r13 = new a4.b
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8 = r13
        L_0x00f7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C6741b.a(java.util.Map):a4.b");
    }

    public void c3(y.b bVar) {
        String str = this.f41432c;
        if (str != null) {
            bVar.m0(str);
        }
        String str2 = this.f41431b;
        if (str2 != null) {
            bVar.c0(str2);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6741b.class != obj.getClass()) {
            return false;
        }
        C6741b bVar = (C6741b) obj;
        return this.f41430a == bVar.f41430a && N.d(this.f41431b, bVar.f41431b) && N.d(this.f41432c, bVar.f41432c) && N.d(this.f41433d, bVar.f41433d) && this.f41434e == bVar.f41434e && this.f41435f == bVar.f41435f;
    }

    public int hashCode() {
        int i10 = (527 + this.f41430a) * 31;
        String str = this.f41431b;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f41432c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f41433d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return ((((hashCode2 + i11) * 31) + (this.f41434e ? 1 : 0)) * 31) + this.f41435f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f41432c + "\", genre=\"" + this.f41431b + "\", bitrate=" + this.f41430a + ", metadataInterval=" + this.f41435f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f41430a);
        parcel.writeString(this.f41431b);
        parcel.writeString(this.f41432c);
        parcel.writeString(this.f41433d);
        N.r1(parcel, this.f41434e);
        parcel.writeInt(this.f41435f);
    }

    C6741b(Parcel parcel) {
        this.f41430a = parcel.readInt();
        this.f41431b = parcel.readString();
        this.f41432c = parcel.readString();
        this.f41433d = parcel.readString();
        this.f41434e = N.X0(parcel);
        this.f41435f = parcel.readInt();
    }
}
