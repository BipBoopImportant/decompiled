package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001:\u0001\u001cB1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u001c\u0010$¨\u0006%"}, d2 = {"LNn/d;", "Landroid/os/Parcelable;", "", "LNn/d$a;", "items", "", "couponId", "familyCardNumber", "", "applyEmployeeDiscount", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.d  reason: case insensitive filesystem */
public final class C10801d implements Parcelable {
    public static final Parcelable.Creator<C10801d> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f84025a;

    /* renamed from: b  reason: collision with root package name */
    private final String f84026b;

    /* renamed from: c  reason: collision with root package name */
    private final String f84027c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f84028d;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006#"}, d2 = {"LNn/d$a;", "Landroid/os/Parcelable;", "", "itemNo", "", "itemQuantity", "unitOfMeasure", "LNn/d$a$b;", "itemDetails", "<init>", "(Ljava/lang/String;ILjava/lang/String;LNn/d$a$b;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "d", "LNn/d$a$b;", "()LNn/d$a$b;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.d$a */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C1697a();

        /* renamed from: a  reason: collision with root package name */
        private final String f84029a;

        /* renamed from: b  reason: collision with root package name */
        private final int f84030b;

        /* renamed from: c  reason: collision with root package name */
        private final String f84031c;

        /* renamed from: d  reason: collision with root package name */
        private final b f84032d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.d$a$a  reason: collision with other inner class name */
        public static final class C1697a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new a(parcel.readString(), parcel.readInt(), parcel.readString(), b.CREATOR.createFromParcel(parcel));
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001f"}, d2 = {"LNn/d$a$b;", "Landroid/os/Parcelable;", "", "productName", "productDescription", "measurement", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.d$a$b */
        public static final class b implements Parcelable {
            public static final Parcelable.Creator<b> CREATOR = new C1698a();

            /* renamed from: a  reason: collision with root package name */
            private final String f84033a;

            /* renamed from: b  reason: collision with root package name */
            private final String f84034b;

            /* renamed from: c  reason: collision with root package name */
            private final String f84035c;

            /* renamed from: d  reason: collision with root package name */
            private final String f84036d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Nn.d$a$b$a  reason: collision with other inner class name */
            public static final class C1698a implements Parcelable.Creator<b> {
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* renamed from: b */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            public b(String str, String str2, String str3, String str4) {
                C17542s.j(str, "productName");
                C17542s.j(str2, "productDescription");
                this.f84033a = str;
                this.f84034b = str2;
                this.f84035c = str3;
                this.f84036d = str4;
            }

            public final String a() {
                return this.f84036d;
            }

            public final String b() {
                return this.f84035c;
            }

            public final String c() {
                return this.f84034b;
            }

            public final String d() {
                return this.f84033a;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f84033a, bVar.f84033a) && C17542s.e(this.f84034b, bVar.f84034b) && C17542s.e(this.f84035c, bVar.f84035c) && C17542s.e(this.f84036d, bVar.f84036d);
            }

            public int hashCode() {
                int hashCode = ((this.f84033a.hashCode() * 31) + this.f84034b.hashCode()) * 31;
                String str = this.f84035c;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f84036d;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                String str = this.f84033a;
                String str2 = this.f84034b;
                String str3 = this.f84035c;
                String str4 = this.f84036d;
                return "ItemDetails(productName=" + str + ", productDescription=" + str2 + ", measurement=" + str3 + ", imageUrl=" + str4 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f84033a);
                parcel.writeString(this.f84034b);
                parcel.writeString(this.f84035c);
                parcel.writeString(this.f84036d);
            }
        }

        public a(String str, int i10, String str2, b bVar) {
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "unitOfMeasure");
            C17542s.j(bVar, "itemDetails");
            this.f84029a = str;
            this.f84030b = i10;
            this.f84031c = str2;
            this.f84032d = bVar;
        }

        public final b a() {
            return this.f84032d;
        }

        public final String b() {
            return this.f84029a;
        }

        public final int c() {
            return this.f84030b;
        }

        public final String d() {
            return this.f84031c;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f84029a, aVar.f84029a) && this.f84030b == aVar.f84030b && C17542s.e(this.f84031c, aVar.f84031c) && C17542s.e(this.f84032d, aVar.f84032d);
        }

        public int hashCode() {
            return (((((this.f84029a.hashCode() * 31) + Integer.hashCode(this.f84030b)) * 31) + this.f84031c.hashCode()) * 31) + this.f84032d.hashCode();
        }

        public String toString() {
            String str = this.f84029a;
            int i10 = this.f84030b;
            String str2 = this.f84031c;
            b bVar = this.f84032d;
            return "CheckoutCartItem(itemNo=" + str + ", itemQuantity=" + i10 + ", unitOfMeasure=" + str2 + ", itemDetails=" + bVar + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f84029a);
            parcel.writeInt(this.f84030b);
            parcel.writeString(this.f84031c);
            this.f84032d.writeToParcel(parcel, i10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.d$b */
    public static final class b implements Parcelable.Creator<C10801d> {
        /* renamed from: a */
        public final C10801d createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            boolean z10 = false;
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(a.CREATOR.createFromParcel(parcel));
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z10 = true;
            }
            return new C10801d(arrayList, readString, readString2, z10);
        }

        /* renamed from: b */
        public final C10801d[] newArray(int i10) {
            return new C10801d[i10];
        }
    }

    public C10801d(List<a> list, String str, String str2, boolean z10) {
        C17542s.j(list, "items");
        this.f84025a = list;
        this.f84026b = str;
        this.f84027c = str2;
        this.f84028d = z10;
    }

    public final boolean a() {
        return this.f84028d;
    }

    public final String b() {
        return this.f84026b;
    }

    public final String c() {
        return this.f84027c;
    }

    public final List<a> d() {
        return this.f84025a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10801d)) {
            return false;
        }
        C10801d dVar = (C10801d) obj;
        return C17542s.e(this.f84025a, dVar.f84025a) && C17542s.e(this.f84026b, dVar.f84026b) && C17542s.e(this.f84027c, dVar.f84027c) && this.f84028d == dVar.f84028d;
    }

    public int hashCode() {
        int hashCode = this.f84025a.hashCode() * 31;
        String str = this.f84026b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f84027c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f84028d);
    }

    public String toString() {
        List<a> list = this.f84025a;
        String str = this.f84026b;
        String str2 = this.f84027c;
        boolean z10 = this.f84028d;
        return "CheckoutCartData(items=" + list + ", couponId=" + str + ", familyCardNumber=" + str2 + ", applyEmployeeDiscount=" + z10 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        List<a> list = this.f84025a;
        parcel.writeInt(list.size());
        for (a writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f84026b);
        parcel.writeString(this.f84027c);
        parcel.writeInt(this.f84028d ? 1 : 0);
    }
}
