package Mn;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0018\b\b\u0018\u00002\u00020\u0001:\u0003\u001c'/BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJn\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u001a\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b1\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b+\u00103R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b/\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b-\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"LMn/c;", "Landroid/os/Parcelable;", "", "checkoutId", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "", "LMn/c$b;", "items", "couponId", "familyCardNumber", "LMn/c$a;", "analytics", "", "applyEmployeeDiscount", "LMn/c$d;", "preferredDelivery", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LMn/c$a;ZLMn/c$d;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LMn/c$a;ZLMn/c$d;)LMn/c;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "i", "()Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "c", "Ljava/util/List;", "h", "()Ljava/util/List;", "d", "f", "g", "LMn/c$a;", "()LMn/c$a;", "Z", "()Z", "LMn/c$d;", "j", "()LMn/c$d;", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new C1674c();

    /* renamed from: a  reason: collision with root package name */
    private final String f83499a;

    /* renamed from: b  reason: collision with root package name */
    private final UserPostalCodeAddress f83500b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f83501c;

    /* renamed from: d  reason: collision with root package name */
    private final String f83502d;

    /* renamed from: e  reason: collision with root package name */
    private final String f83503e;

    /* renamed from: f  reason: collision with root package name */
    private final a f83504f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f83505g;

    /* renamed from: h  reason: collision with root package name */
    private final d f83506h;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001c\u0010$¨\u0006%"}, d2 = {"LMn/c$a;", "Landroid/os/Parcelable;", "", "currencyCode", "", "totalValue", "", "LMn/a;", "items", "<init>", "(Ljava/lang/String;DLjava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCurrencyCode", "b", "D", "()D", "c", "Ljava/util/List;", "()Ljava/util/List;", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C1673a();

        /* renamed from: a  reason: collision with root package name */
        private final String f83507a;

        /* renamed from: b  reason: collision with root package name */
        private final double f83508b;

        /* renamed from: c  reason: collision with root package name */
        private final List<a> f83509c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Mn.c$a$a  reason: collision with other inner class name */
        public static final class C1673a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                String readString = parcel.readString();
                double readDouble = parcel.readDouble();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(a.CREATOR.createFromParcel(parcel));
                }
                return new a(readString, readDouble, arrayList);
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(String str, double d10, List<a> list) {
            C17542s.j(str, "currencyCode");
            C17542s.j(list, "items");
            this.f83507a = str;
            this.f83508b = d10;
            this.f83509c = list;
        }

        public final List<a> a() {
            return this.f83509c;
        }

        public final double b() {
            return this.f83508b;
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
            return C17542s.e(this.f83507a, aVar.f83507a) && Double.compare(this.f83508b, aVar.f83508b) == 0 && C17542s.e(this.f83509c, aVar.f83509c);
        }

        public int hashCode() {
            return (((this.f83507a.hashCode() * 31) + Double.hashCode(this.f83508b)) * 31) + this.f83509c.hashCode();
        }

        public String toString() {
            String str = this.f83507a;
            double d10 = this.f83508b;
            List<a> list = this.f83509c;
            return "Analytics(currencyCode=" + str + ", totalValue=" + d10 + ", items=" + list + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f83507a);
            parcel.writeDouble(this.f83508b);
            List<a> list = this.f83509c;
            parcel.writeInt(list.size());
            for (a writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i10);
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\\\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b$\u0010\u0018¨\u0006)"}, d2 = {"LMn/c$b;", "Landroid/os/Parcelable;", "", "productNumber", "", "quantity", "productName", "productDescription", "unitOfMeasure", "measurement", "imageUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LMn/c$b;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", "I", "h", "c", "f", "d", "e", "i", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f83510a;

        /* renamed from: b  reason: collision with root package name */
        private final int f83511b;

        /* renamed from: c  reason: collision with root package name */
        private final String f83512c;

        /* renamed from: d  reason: collision with root package name */
        private final String f83513d;

        /* renamed from: e  reason: collision with root package name */
        private final String f83514e;

        /* renamed from: f  reason: collision with root package name */
        private final String f83515f;

        /* renamed from: g  reason: collision with root package name */
        private final String f83516g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new b(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(String str, int i10, String str2, String str3, String str4, String str5, String str6) {
            C17542s.j(str, "productNumber");
            C17542s.j(str3, "productDescription");
            C17542s.j(str4, "unitOfMeasure");
            this.f83510a = str;
            this.f83511b = i10;
            this.f83512c = str2;
            this.f83513d = str3;
            this.f83514e = str4;
            this.f83515f = str5;
            this.f83516g = str6;
        }

        public static /* synthetic */ b b(b bVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f83510a;
            }
            if ((i11 & 2) != 0) {
                i10 = bVar.f83511b;
            }
            int i12 = i10;
            if ((i11 & 4) != 0) {
                str2 = bVar.f83512c;
            }
            String str7 = str2;
            if ((i11 & 8) != 0) {
                str3 = bVar.f83513d;
            }
            String str8 = str3;
            if ((i11 & 16) != 0) {
                str4 = bVar.f83514e;
            }
            String str9 = str4;
            if ((i11 & 32) != 0) {
                str5 = bVar.f83515f;
            }
            String str10 = str5;
            if ((i11 & 64) != 0) {
                str6 = bVar.f83516g;
            }
            return bVar.a(str, i12, str7, str8, str9, str10, str6);
        }

        public final b a(String str, int i10, String str2, String str3, String str4, String str5, String str6) {
            C17542s.j(str, "productNumber");
            C17542s.j(str3, "productDescription");
            C17542s.j(str4, "unitOfMeasure");
            return new b(str, i10, str2, str3, str4, str5, str6);
        }

        public final String c() {
            return this.f83516g;
        }

        public final String d() {
            return this.f83515f;
        }

        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f83513d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f83510a, bVar.f83510a) && this.f83511b == bVar.f83511b && C17542s.e(this.f83512c, bVar.f83512c) && C17542s.e(this.f83513d, bVar.f83513d) && C17542s.e(this.f83514e, bVar.f83514e) && C17542s.e(this.f83515f, bVar.f83515f) && C17542s.e(this.f83516g, bVar.f83516g);
        }

        public final String f() {
            return this.f83512c;
        }

        public final String g() {
            return this.f83510a;
        }

        public final int h() {
            return this.f83511b;
        }

        public int hashCode() {
            int hashCode = ((this.f83510a.hashCode() * 31) + Integer.hashCode(this.f83511b)) * 31;
            String str = this.f83512c;
            int i10 = 0;
            int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f83513d.hashCode()) * 31) + this.f83514e.hashCode()) * 31;
            String str2 = this.f83515f;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f83516g;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return hashCode3 + i10;
        }

        public final String i() {
            return this.f83514e;
        }

        public String toString() {
            String str = this.f83510a;
            int i10 = this.f83511b;
            String str2 = this.f83512c;
            String str3 = this.f83513d;
            String str4 = this.f83514e;
            String str5 = this.f83515f;
            String str6 = this.f83516g;
            return "CheckoutDataItem(productNumber=" + str + ", quantity=" + i10 + ", productName=" + str2 + ", productDescription=" + str3 + ", unitOfMeasure=" + str4 + ", measurement=" + str5 + ", imageUrl=" + str6 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f83510a);
            parcel.writeInt(this.f83511b);
            parcel.writeString(this.f83512c);
            parcel.writeString(this.f83513d);
            parcel.writeString(this.f83514e);
            parcel.writeString(this.f83515f);
            parcel.writeString(this.f83516g);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Mn.c$c  reason: collision with other inner class name */
    public static final class C1674c implements Parcelable.Creator<c> {
        /* renamed from: a */
        public final c createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            Class<c> cls = c.class;
            UserPostalCodeAddress userPostalCodeAddress = (UserPostalCodeAddress) parcel.readParcelable(cls.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(b.CREATOR.createFromParcel(parcel));
            }
            return new c(readString, userPostalCodeAddress, arrayList, parcel.readString(), parcel.readString(), a.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (d) parcel.readParcelable(cls.getClassLoader()));
        }

        /* renamed from: b */
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"LMn/c$d;", "Landroid/os/Parcelable;", "<init>", "()V", "", "a", "()Z", "isFullyAvailable", "b", "LMn/c$d$a;", "LMn/c$d$b;", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d implements Parcelable {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001d"}, d2 = {"LMn/c$d$a;", "LMn/c$d;", "", "isFullyAvailable", "", "storeId", "<init>", "(ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends d {
            public static final Parcelable.Creator<a> CREATOR = new C1675a();

            /* renamed from: a  reason: collision with root package name */
            private final boolean f83517a;

            /* renamed from: b  reason: collision with root package name */
            private final String f83518b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Mn.c$d$a$a  reason: collision with other inner class name */
            public static final class C1675a implements Parcelable.Creator<a> {
                /* renamed from: a */
                public final a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new a(parcel.readInt() != 0, parcel.readString());
                }

                /* renamed from: b */
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a(boolean z10, String str) {
                super((DefaultConstructorMarker) null);
                this.f83517a = z10;
                this.f83518b = str;
            }

            public boolean a() {
                return this.f83517a;
            }

            public final String b() {
                return this.f83518b;
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
                return this.f83517a == aVar.f83517a && C17542s.e(this.f83518b, aVar.f83518b);
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.f83517a) * 31;
                String str = this.f83518b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                boolean z10 = this.f83517a;
                String str = this.f83518b;
                return "Collect(isFullyAvailable=" + z10 + ", storeId=" + str + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(this.f83517a ? 1 : 0);
                parcel.writeString(this.f83518b);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LMn/c$d$b;", "LMn/c$d;", "", "isFullyAvailable", "<init>", "(Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends d {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            private final boolean f83519a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<b> {
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new b(parcel.readInt() != 0);
                }

                /* renamed from: b */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            public b(boolean z10) {
                super((DefaultConstructorMarker) null);
                this.f83519a = z10;
            }

            public boolean a() {
                return this.f83519a;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f83519a == ((b) obj).f83519a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f83519a);
            }

            public String toString() {
                boolean z10 = this.f83519a;
                return "Home(isFullyAvailable=" + z10 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(this.f83519a ? 1 : 0);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract boolean a();

        private d() {
        }
    }

    public c(String str, UserPostalCodeAddress userPostalCodeAddress, List<b> list, String str2, String str3, a aVar, boolean z10, d dVar) {
        C17542s.j(userPostalCodeAddress, "postalCodeAddress");
        C17542s.j(list, "items");
        C17542s.j(aVar, "analytics");
        this.f83499a = str;
        this.f83500b = userPostalCodeAddress;
        this.f83501c = list;
        this.f83502d = str2;
        this.f83503e = str3;
        this.f83504f = aVar;
        this.f83505g = z10;
        this.f83506h = dVar;
    }

    public static /* synthetic */ c b(c cVar, String str, UserPostalCodeAddress userPostalCodeAddress, List list, String str2, String str3, a aVar, boolean z10, d dVar, int i10, Object obj) {
        c cVar2 = cVar;
        int i11 = i10;
        return cVar.a((i11 & 1) != 0 ? cVar2.f83499a : str, (i11 & 2) != 0 ? cVar2.f83500b : userPostalCodeAddress, (i11 & 4) != 0 ? cVar2.f83501c : list, (i11 & 8) != 0 ? cVar2.f83502d : str2, (i11 & 16) != 0 ? cVar2.f83503e : str3, (i11 & 32) != 0 ? cVar2.f83504f : aVar, (i11 & 64) != 0 ? cVar2.f83505g : z10, (i11 & 128) != 0 ? cVar2.f83506h : dVar);
    }

    public final c a(String str, UserPostalCodeAddress userPostalCodeAddress, List<b> list, String str2, String str3, a aVar, boolean z10, d dVar) {
        C17542s.j(userPostalCodeAddress, "postalCodeAddress");
        C17542s.j(list, "items");
        a aVar2 = aVar;
        C17542s.j(aVar2, "analytics");
        return new c(str, userPostalCodeAddress, list, str2, str3, aVar2, z10, dVar);
    }

    public final a c() {
        return this.f83504f;
    }

    public final boolean d() {
        return this.f83505g;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f83499a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f83499a, cVar.f83499a) && C17542s.e(this.f83500b, cVar.f83500b) && C17542s.e(this.f83501c, cVar.f83501c) && C17542s.e(this.f83502d, cVar.f83502d) && C17542s.e(this.f83503e, cVar.f83503e) && C17542s.e(this.f83504f, cVar.f83504f) && this.f83505g == cVar.f83505g && C17542s.e(this.f83506h, cVar.f83506h);
    }

    public final String f() {
        return this.f83502d;
    }

    public final String g() {
        return this.f83503e;
    }

    public final List<b> h() {
        return this.f83501c;
    }

    public int hashCode() {
        String str = this.f83499a;
        int i10 = 0;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.f83500b.hashCode()) * 31) + this.f83501c.hashCode()) * 31;
        String str2 = this.f83502d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f83503e;
        int hashCode3 = (((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f83504f.hashCode()) * 31) + Boolean.hashCode(this.f83505g)) * 31;
        d dVar = this.f83506h;
        if (dVar != null) {
            i10 = dVar.hashCode();
        }
        return hashCode3 + i10;
    }

    public final UserPostalCodeAddress i() {
        return this.f83500b;
    }

    public final d j() {
        return this.f83506h;
    }

    public String toString() {
        String str = this.f83499a;
        UserPostalCodeAddress userPostalCodeAddress = this.f83500b;
        List<b> list = this.f83501c;
        String str2 = this.f83502d;
        String str3 = this.f83503e;
        a aVar = this.f83504f;
        boolean z10 = this.f83505g;
        d dVar = this.f83506h;
        return "CheckoutData(checkoutId=" + str + ", postalCodeAddress=" + userPostalCodeAddress + ", items=" + list + ", couponId=" + str2 + ", familyCardNumber=" + str3 + ", analytics=" + aVar + ", applyEmployeeDiscount=" + z10 + ", preferredDelivery=" + dVar + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f83499a);
        parcel.writeParcelable(this.f83500b, i10);
        List<b> list = this.f83501c;
        parcel.writeInt(list.size());
        for (b writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f83502d);
        parcel.writeString(this.f83503e);
        this.f83504f.writeToParcel(parcel, i10);
        parcel.writeInt(this.f83505g ? 1 : 0);
        parcel.writeParcelable(this.f83506h, i10);
    }
}
