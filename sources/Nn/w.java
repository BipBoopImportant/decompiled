package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LNn/w;", "Landroid/os/Parcelable;", "<init>", "()V", "b", "a", "LNn/w$a;", "LNn/w$b;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class w implements Parcelable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001d"}, d2 = {"LNn/w$a;", "LNn/w;", "", "fiscalCode", "recipientCodeType", "recipientCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w {
        public static final Parcelable.Creator<a> CREATOR = new C1705a();

        /* renamed from: a  reason: collision with root package name */
        private final String f84158a;

        /* renamed from: b  reason: collision with root package name */
        private final String f84159b;

        /* renamed from: c  reason: collision with root package name */
        private final String f84160c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.w$a$a  reason: collision with other inner class name */
        public static final class C1705a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "fiscalCode");
            C17542s.j(str2, "recipientCodeType");
            C17542s.j(str3, "recipientCode");
            this.f84158a = str;
            this.f84159b = str2;
            this.f84160c = str3;
        }

        public final String a() {
            return this.f84158a;
        }

        public final String b() {
            return this.f84160c;
        }

        public final String c() {
            return this.f84159b;
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
            return C17542s.e(this.f84158a, aVar.f84158a) && C17542s.e(this.f84159b, aVar.f84159b) && C17542s.e(this.f84160c, aVar.f84160c);
        }

        public int hashCode() {
            return (((this.f84158a.hashCode() * 31) + this.f84159b.hashCode()) * 31) + this.f84160c.hashCode();
        }

        public String toString() {
            String str = this.f84158a;
            String str2 = this.f84159b;
            String str3 = this.f84160c;
            return "FiscalCodeInfo(fiscalCode=" + str + ", recipientCodeType=" + str2 + ", recipientCode=" + str3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f84158a);
            parcel.writeString(this.f84159b);
            parcel.writeString(this.f84160c);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001d"}, d2 = {"LNn/w$b;", "LNn/w;", "", "taxCodeType", "taxCode", "countryOfOrigin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends w {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f84161a;

        /* renamed from: b  reason: collision with root package name */
        private final String f84162b;

        /* renamed from: c  reason: collision with root package name */
        private final String f84163c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "taxCodeType");
            C17542s.j(str2, "taxCode");
            this.f84161a = str;
            this.f84162b = str2;
            this.f84163c = str3;
        }

        public final String a() {
            return this.f84163c;
        }

        public final String b() {
            return this.f84162b;
        }

        public final String c() {
            return this.f84161a;
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
            return C17542s.e(this.f84161a, bVar.f84161a) && C17542s.e(this.f84162b, bVar.f84162b) && C17542s.e(this.f84163c, bVar.f84163c);
        }

        public int hashCode() {
            int hashCode = ((this.f84161a.hashCode() * 31) + this.f84162b.hashCode()) * 31;
            String str = this.f84163c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f84161a;
            String str2 = this.f84162b;
            String str3 = this.f84163c;
            return "TaxIdInfo(taxCodeType=" + str + ", taxCode=" + str2 + ", countryOfOrigin=" + str3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f84161a);
            parcel.writeString(this.f84162b);
            parcel.writeString(this.f84163c);
        }
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w() {
    }
}
