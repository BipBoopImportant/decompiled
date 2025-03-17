package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001:\u0001!BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b*\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001f\u0010/¨\u00060"}, d2 = {"LNn/g;", "Landroid/os/Parcelable;", "", "itemNo", "", "quantity", "", "totalPriceExclTax", "totalPriceInclTax", "type", "requestedQuantity", "LNn/g$b;", "details", "<init>", "(Ljava/lang/String;IDLjava/lang/Double;Ljava/lang/String;ILNn/g$b;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "D", "d", "()D", "Ljava/lang/Double;", "e", "()Ljava/lang/Double;", "getType", "f", "getRequestedQuantity", "g", "LNn/g$b;", "()LNn/g$b;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.g  reason: case insensitive filesystem */
public final class C10804g implements Parcelable {
    public static final Parcelable.Creator<C10804g> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f84057a;

    /* renamed from: b  reason: collision with root package name */
    private final int f84058b;

    /* renamed from: c  reason: collision with root package name */
    private final double f84059c;

    /* renamed from: d  reason: collision with root package name */
    private final Double f84060d;

    /* renamed from: e  reason: collision with root package name */
    private final String f84061e;

    /* renamed from: f  reason: collision with root package name */
    private final int f84062f;

    /* renamed from: g  reason: collision with root package name */
    private final b f84063g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.g$a */
    public static final class a implements Parcelable.Creator<C10804g> {
        /* renamed from: a */
        public final C10804g createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            double readDouble = parcel.readDouble();
            b bVar = null;
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                bVar = b.CREATOR.createFromParcel(parcel);
            }
            return new C10804g(readString, readInt, readDouble, valueOf, readString2, readInt2, bVar);
        }

        /* renamed from: b */
        public final C10804g[] newArray(int i10) {
            return new C10804g[i10];
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"LNn/g$b;", "Landroid/os/Parcelable;", "", "productName", "productDescription", "measurement", "imageUrl", "unitOfMeasure", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "e", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.g$b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f84064a;

        /* renamed from: b  reason: collision with root package name */
        private final String f84065b;

        /* renamed from: c  reason: collision with root package name */
        private final String f84066c;

        /* renamed from: d  reason: collision with root package name */
        private final String f84067d;

        /* renamed from: e  reason: collision with root package name */
        private final String f84068e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.g$b$a */
        public static final class a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(String str, String str2, String str3, String str4, String str5) {
            C17542s.j(str2, "productDescription");
            C17542s.j(str5, "unitOfMeasure");
            this.f84064a = str;
            this.f84065b = str2;
            this.f84066c = str3;
            this.f84067d = str4;
            this.f84068e = str5;
        }

        public final String a() {
            return this.f84067d;
        }

        public final String b() {
            return this.f84066c;
        }

        public final String c() {
            return this.f84065b;
        }

        public final String d() {
            return this.f84064a;
        }

        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f84068e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f84064a, bVar.f84064a) && C17542s.e(this.f84065b, bVar.f84065b) && C17542s.e(this.f84066c, bVar.f84066c) && C17542s.e(this.f84067d, bVar.f84067d) && C17542s.e(this.f84068e, bVar.f84068e);
        }

        public int hashCode() {
            String str = this.f84064a;
            int i10 = 0;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f84065b.hashCode()) * 31;
            String str2 = this.f84066c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f84067d;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return ((hashCode2 + i10) * 31) + this.f84068e.hashCode();
        }

        public String toString() {
            String str = this.f84064a;
            String str2 = this.f84065b;
            String str3 = this.f84066c;
            String str4 = this.f84067d;
            String str5 = this.f84068e;
            return "ItemDetails(productName=" + str + ", productDescription=" + str2 + ", measurement=" + str3 + ", imageUrl=" + str4 + ", unitOfMeasure=" + str5 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f84064a);
            parcel.writeString(this.f84065b);
            parcel.writeString(this.f84066c);
            parcel.writeString(this.f84067d);
            parcel.writeString(this.f84068e);
        }
    }

    public C10804g(String str, int i10, double d10, Double d11, String str2, int i11, b bVar) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "type");
        this.f84057a = str;
        this.f84058b = i10;
        this.f84059c = d10;
        this.f84060d = d11;
        this.f84061e = str2;
        this.f84062f = i11;
        this.f84063g = bVar;
    }

    public final b a() {
        return this.f84063g;
    }

    public final String b() {
        return this.f84057a;
    }

    public final int c() {
        return this.f84058b;
    }

    public final double d() {
        return this.f84059c;
    }

    public final int describeContents() {
        return 0;
    }

    public final Double e() {
        return this.f84060d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10804g)) {
            return false;
        }
        C10804g gVar = (C10804g) obj;
        return C17542s.e(this.f84057a, gVar.f84057a) && this.f84058b == gVar.f84058b && Double.compare(this.f84059c, gVar.f84059c) == 0 && C17542s.e(this.f84060d, gVar.f84060d) && C17542s.e(this.f84061e, gVar.f84061e) && this.f84062f == gVar.f84062f && C17542s.e(this.f84063g, gVar.f84063g);
    }

    public final String getType() {
        return this.f84061e;
    }

    public int hashCode() {
        int hashCode = ((((this.f84057a.hashCode() * 31) + Integer.hashCode(this.f84058b)) * 31) + Double.hashCode(this.f84059c)) * 31;
        Double d10 = this.f84060d;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + this.f84061e.hashCode()) * 31) + Integer.hashCode(this.f84062f)) * 31;
        b bVar = this.f84063g;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f84057a;
        int i10 = this.f84058b;
        double d10 = this.f84059c;
        Double d11 = this.f84060d;
        String str2 = this.f84061e;
        int i11 = this.f84062f;
        b bVar = this.f84063g;
        return "CheckoutItem(itemNo=" + str + ", quantity=" + i10 + ", totalPriceExclTax=" + d10 + ", totalPriceInclTax=" + d11 + ", type=" + str2 + ", requestedQuantity=" + i11 + ", details=" + bVar + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f84057a);
        parcel.writeInt(this.f84058b);
        parcel.writeDouble(this.f84059c);
        Double d10 = this.f84060d;
        if (d10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d10.doubleValue());
        }
        parcel.writeString(this.f84061e);
        parcel.writeInt(this.f84062f);
        b bVar = this.f84063g;
        if (bVar == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        bVar.writeToParcel(parcel, i10);
    }
}
