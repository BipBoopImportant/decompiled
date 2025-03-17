package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0005\u0010\u000b\b\u0015\u000e\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0001\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"LNn/F;", "Landroid/os/Parcelable;", "<init>", "()V", "", "b", "()Ljava/lang/String;", "brand", "d", "label", "", "g", "()Z", "isSuccessful", "e", "status", "f", "timestamp", "c", "declineReason", "", "a", "()D", "amount", "LNn/F$a;", "LNn/F$b;", "LNn/F$c;", "LNn/F$d;", "LNn/F$e;", "LNn/F$f;", "LNn/F$g;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class F implements Parcelable {

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b%\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b*\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b&\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b\"\u0010-R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b.\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b/\u00102¨\u00063"}, d2 = {"LNn/F$a;", "LNn/F;", "", "brand", "label", "", "isSuccessful", "status", "timestamp", "declineReason", "", "amount", "entityId", "paymentReference", "Ljava/time/LocalDateTime;", "expiryDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Z", "g", "()Z", "e", "f", "D", "()D", "h", "i", "j", "Ljava/time/LocalDateTime;", "()Ljava/time/LocalDateTime;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends F {
        public static final Parcelable.Creator<a> CREATOR = new C1693a();

        /* renamed from: a  reason: collision with root package name */
        private final String f83894a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83895b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f83896c;

        /* renamed from: d  reason: collision with root package name */
        private final String f83897d;

        /* renamed from: e  reason: collision with root package name */
        private final String f83898e;

        /* renamed from: f  reason: collision with root package name */
        private final String f83899f;

        /* renamed from: g  reason: collision with root package name */
        private final double f83900g;

        /* renamed from: h  reason: collision with root package name */
        private final String f83901h;

        /* renamed from: i  reason: collision with root package name */
        private final String f83902i;

        /* renamed from: j  reason: collision with root package name */
        private final LocalDateTime f83903j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.F$a$a  reason: collision with other inner class name */
        public static final class C1693a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), (LocalDateTime) parcel.readSerializable());
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, String str2, boolean z10, String str3, String str4, String str5, double d10, String str6, String str7, LocalDateTime localDateTime, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z10, str3, str4, (i10 & 32) != 0 ? null : str5, d10, str6, str7, localDateTime);
        }

        public double a() {
            return this.f83900g;
        }

        public String b() {
            return this.f83894a;
        }

        public String c() {
            return this.f83899f;
        }

        public String d() {
            return this.f83895b;
        }

        public final int describeContents() {
            return 0;
        }

        public String e() {
            return this.f83897d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f83894a, aVar.f83894a) && C17542s.e(this.f83895b, aVar.f83895b) && this.f83896c == aVar.f83896c && C17542s.e(this.f83897d, aVar.f83897d) && C17542s.e(this.f83898e, aVar.f83898e) && C17542s.e(this.f83899f, aVar.f83899f) && Double.compare(this.f83900g, aVar.f83900g) == 0 && C17542s.e(this.f83901h, aVar.f83901h) && C17542s.e(this.f83902i, aVar.f83902i) && C17542s.e(this.f83903j, aVar.f83903j);
        }

        public String f() {
            return this.f83898e;
        }

        public boolean g() {
            return this.f83896c;
        }

        public final String h() {
            return this.f83901h;
        }

        public int hashCode() {
            String str = this.f83894a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f83895b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f83896c)) * 31;
            String str3 = this.f83897d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f83898e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f83899f;
            int hashCode5 = (((((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Double.hashCode(this.f83900g)) * 31) + this.f83901h.hashCode()) * 31) + this.f83902i.hashCode()) * 31;
            LocalDateTime localDateTime = this.f83903j;
            if (localDateTime != null) {
                i10 = localDateTime.hashCode();
            }
            return hashCode5 + i10;
        }

        public final LocalDateTime i() {
            return this.f83903j;
        }

        public final String j() {
            return this.f83902i;
        }

        public String toString() {
            String str = this.f83894a;
            String str2 = this.f83895b;
            boolean z10 = this.f83896c;
            String str3 = this.f83897d;
            String str4 = this.f83898e;
            String str5 = this.f83899f;
            double d10 = this.f83900g;
            String str6 = this.f83901h;
            String str7 = this.f83902i;
            LocalDateTime localDateTime = this.f83903j;
            return "AccountVoucherTransaction(brand=" + str + ", label=" + str2 + ", isSuccessful=" + z10 + ", status=" + str3 + ", timestamp=" + str4 + ", declineReason=" + str5 + ", amount=" + d10 + ", entityId=" + str6 + ", paymentReference=" + str7 + ", expiryDate=" + localDateTime + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f83894a);
            parcel.writeString(this.f83895b);
            parcel.writeInt(this.f83896c ? 1 : 0);
            parcel.writeString(this.f83897d);
            parcel.writeString(this.f83898e);
            parcel.writeString(this.f83899f);
            parcel.writeDouble(this.f83900g);
            parcel.writeString(this.f83901h);
            parcel.writeString(this.f83902i);
            parcel.writeSerializable(this.f83903j);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, boolean z10, String str3, String str4, String str5, double d10, String str6, String str7, LocalDateTime localDateTime) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str6, "entityId");
            C17542s.j(str7, "paymentReference");
            this.f83894a = str;
            this.f83895b = str2;
            this.f83896c = z10;
            this.f83897d = str3;
            this.f83898e = str4;
            this.f83899f = str5;
            this.f83900g = d10;
            this.f83901h = str6;
            this.f83902i = str7;
            this.f83903j = localDateTime;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b'\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b#\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b\u001f\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b+\u0010\u0019¨\u0006,"}, d2 = {"LNn/F$b;", "LNn/F;", "", "brand", "label", "", "isSuccessful", "status", "timestamp", "declineReason", "", "amount", "authorisationCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Z", "g", "()Z", "e", "f", "D", "()D", "h", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends F {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f83904a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83905b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f83906c;

        /* renamed from: d  reason: collision with root package name */
        private final String f83907d;

        /* renamed from: e  reason: collision with root package name */
        private final String f83908e;

        /* renamed from: f  reason: collision with root package name */
        private final String f83909f;

        /* renamed from: g  reason: collision with root package name */
        private final double f83910g;

        /* renamed from: h  reason: collision with root package name */
        private final String f83911h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString());
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(String str, String str2, boolean z10, String str3, String str4, String str5, double d10, String str6) {
            super((DefaultConstructorMarker) null);
            this.f83904a = str;
            this.f83905b = str2;
            this.f83906c = z10;
            this.f83907d = str3;
            this.f83908e = str4;
            this.f83909f = str5;
            this.f83910g = d10;
            this.f83911h = str6;
        }

        public double a() {
            return this.f83910g;
        }

        public String b() {
            return this.f83904a;
        }

        public String c() {
            return this.f83909f;
        }

        public String d() {
            return this.f83905b;
        }

        public final int describeContents() {
            return 0;
        }

        public String e() {
            return this.f83907d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f83904a, bVar.f83904a) && C17542s.e(this.f83905b, bVar.f83905b) && this.f83906c == bVar.f83906c && C17542s.e(this.f83907d, bVar.f83907d) && C17542s.e(this.f83908e, bVar.f83908e) && C17542s.e(this.f83909f, bVar.f83909f) && Double.compare(this.f83910g, bVar.f83910g) == 0 && C17542s.e(this.f83911h, bVar.f83911h);
        }

        public String f() {
            return this.f83908e;
        }

        public boolean g() {
            return this.f83906c;
        }

        public final String h() {
            return this.f83911h;
        }

        public int hashCode() {
            String str = this.f83904a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f83905b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f83906c)) * 31;
            String str3 = this.f83907d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f83908e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f83909f;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Double.hashCode(this.f83910g)) * 31;
            String str6 = this.f83911h;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            return hashCode5 + i10;
        }

        public String toString() {
            String str = this.f83904a;
            String str2 = this.f83905b;
            boolean z10 = this.f83906c;
            String str3 = this.f83907d;
            String str4 = this.f83908e;
            String str5 = this.f83909f;
            double d10 = this.f83910g;
            String str6 = this.f83911h;
            return "CreditCardTransaction(brand=" + str + ", label=" + str2 + ", isSuccessful=" + z10 + ", status=" + str3 + ", timestamp=" + str4 + ", declineReason=" + str5 + ", amount=" + d10 + ", authorisationCode=" + str6 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f83904a);
            parcel.writeString(this.f83905b);
            parcel.writeInt(this.f83906c ? 1 : 0);
            parcel.writeString(this.f83907d);
            parcel.writeString(this.f83908e);
            parcel.writeString(this.f83909f);
            parcel.writeDouble(this.f83910g);
            parcel.writeString(this.f83911h);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b&\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b\u001e\u0010)¨\u0006*"}, d2 = {"LNn/F$c;", "LNn/F;", "", "brand", "label", "", "isSuccessful", "status", "timestamp", "declineReason", "", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Z", "g", "()Z", "e", "f", "D", "()D", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends F {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f83912a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83913b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f83914c;

        /* renamed from: d  reason: collision with root package name */
        private final String f83915d;

        /* renamed from: e  reason: collision with root package name */
        private final String f83916e;

        /* renamed from: f  reason: collision with root package name */
        private final String f83917f;

        /* renamed from: g  reason: collision with root package name */
        private final double f83918g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble());
            }

            /* renamed from: b */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(String str, String str2, boolean z10, String str3, String str4, String str5, double d10) {
            super((DefaultConstructorMarker) null);
            this.f83912a = str;
            this.f83913b = str2;
            this.f83914c = z10;
            this.f83915d = str3;
            this.f83916e = str4;
            this.f83917f = str5;
            this.f83918g = d10;
        }

        public double a() {
            return this.f83918g;
        }

        public String b() {
            return this.f83912a;
        }

        public String c() {
            return this.f83917f;
        }

        public String d() {
            return this.f83913b;
        }

        public final int describeContents() {
            return 0;
        }

        public String e() {
            return this.f83915d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f83912a, cVar.f83912a) && C17542s.e(this.f83913b, cVar.f83913b) && this.f83914c == cVar.f83914c && C17542s.e(this.f83915d, cVar.f83915d) && C17542s.e(this.f83916e, cVar.f83916e) && C17542s.e(this.f83917f, cVar.f83917f) && Double.compare(this.f83918g, cVar.f83918g) == 0;
        }

        public String f() {
            return this.f83916e;
        }

        public boolean g() {
            return this.f83914c;
        }

        public int hashCode() {
            String str = this.f83912a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f83913b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f83914c)) * 31;
            String str3 = this.f83915d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f83916e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f83917f;
            if (str5 != null) {
                i10 = str5.hashCode();
            }
            return ((hashCode4 + i10) * 31) + Double.hashCode(this.f83918g);
        }

        public String toString() {
            String str = this.f83912a;
            String str2 = this.f83913b;
            boolean z10 = this.f83914c;
            String str3 = this.f83915d;
            String str4 = this.f83916e;
            String str5 = this.f83917f;
            double d10 = this.f83918g;
            return "OnlineTransferTransaction(brand=" + str + ", label=" + str2 + ", isSuccessful=" + z10 + ", status=" + str3 + ", timestamp=" + str4 + ", declineReason=" + str5 + ", amount=" + d10 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f83912a);
            parcel.writeString(this.f83913b);
            parcel.writeInt(this.f83914c ? 1 : 0);
            parcel.writeString(this.f83915d);
            parcel.writeString(this.f83916e);
            parcel.writeString(this.f83917f);
            parcel.writeDouble(this.f83918g);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b&\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b\u001e\u0010)¨\u0006*"}, d2 = {"LNn/F$d;", "LNn/F;", "", "brand", "label", "", "isSuccessful", "status", "timestamp", "declineReason", "", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Z", "g", "()Z", "e", "f", "D", "()D", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends F {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f83919a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83920b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f83921c;

        /* renamed from: d  reason: collision with root package name */
        private final String f83922d;

        /* renamed from: e  reason: collision with root package name */
        private final String f83923e;

        /* renamed from: f  reason: collision with root package name */
        private final String f83924f;

        /* renamed from: g  reason: collision with root package name */
        private final double f83925g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble());
            }

            /* renamed from: b */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(String str, String str2, boolean z10, String str3, String str4, String str5, double d10) {
            super((DefaultConstructorMarker) null);
            this.f83919a = str;
            this.f83920b = str2;
            this.f83921c = z10;
            this.f83922d = str3;
            this.f83923e = str4;
            this.f83924f = str5;
            this.f83925g = d10;
        }

        public double a() {
            return this.f83925g;
        }

        public String b() {
            return this.f83919a;
        }

        public String c() {
            return this.f83924f;
        }

        public String d() {
            return this.f83920b;
        }

        public final int describeContents() {
            return 0;
        }

        public String e() {
            return this.f83922d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f83919a, dVar.f83919a) && C17542s.e(this.f83920b, dVar.f83920b) && this.f83921c == dVar.f83921c && C17542s.e(this.f83922d, dVar.f83922d) && C17542s.e(this.f83923e, dVar.f83923e) && C17542s.e(this.f83924f, dVar.f83924f) && Double.compare(this.f83925g, dVar.f83925g) == 0;
        }

        public String f() {
            return this.f83923e;
        }

        public boolean g() {
            return this.f83921c;
        }

        public int hashCode() {
            String str = this.f83919a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f83920b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f83921c)) * 31;
            String str3 = this.f83922d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f83923e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f83924f;
            if (str5 != null) {
                i10 = str5.hashCode();
            }
            return ((hashCode4 + i10) * 31) + Double.hashCode(this.f83925g);
        }

        public String toString() {
            String str = this.f83919a;
            String str2 = this.f83920b;
            boolean z10 = this.f83921c;
            String str3 = this.f83922d;
            String str4 = this.f83923e;
            String str5 = this.f83924f;
            double d10 = this.f83925g;
            return "OpenInvoiceTransaction(brand=" + str + ", label=" + str2 + ", isSuccessful=" + z10 + ", status=" + str3 + ", timestamp=" + str4 + ", declineReason=" + str5 + ", amount=" + d10 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f83919a);
            parcel.writeString(this.f83920b);
            parcel.writeInt(this.f83921c ? 1 : 0);
            parcel.writeString(this.f83922d);
            parcel.writeString(this.f83923e);
            parcel.writeString(this.f83924f);
            parcel.writeDouble(this.f83925g);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b&\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b\u001e\u0010)¨\u0006*"}, d2 = {"LNn/F$e;", "LNn/F;", "", "brand", "label", "", "isSuccessful", "status", "timestamp", "declineReason", "", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Z", "g", "()Z", "e", "f", "D", "()D", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends F {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f83926a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83927b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f83928c;

        /* renamed from: d  reason: collision with root package name */
        private final String f83929d;

        /* renamed from: e  reason: collision with root package name */
        private final String f83930e;

        /* renamed from: f  reason: collision with root package name */
        private final String f83931f;

        /* renamed from: g  reason: collision with root package name */
        private final double f83932g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<e> {
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new e(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble());
            }

            /* renamed from: b */
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(String str, String str2, boolean z10, String str3, String str4, String str5, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z10, str3, str4, (i10 & 32) != 0 ? null : str5, d10);
        }

        public double a() {
            return this.f83932g;
        }

        public String b() {
            return this.f83926a;
        }

        public String c() {
            return this.f83931f;
        }

        public String d() {
            return this.f83927b;
        }

        public final int describeContents() {
            return 0;
        }

        public String e() {
            return this.f83929d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f83926a, eVar.f83926a) && C17542s.e(this.f83927b, eVar.f83927b) && this.f83928c == eVar.f83928c && C17542s.e(this.f83929d, eVar.f83929d) && C17542s.e(this.f83930e, eVar.f83930e) && C17542s.e(this.f83931f, eVar.f83931f) && Double.compare(this.f83932g, eVar.f83932g) == 0;
        }

        public String f() {
            return this.f83930e;
        }

        public boolean g() {
            return this.f83928c;
        }

        public int hashCode() {
            String str = this.f83926a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f83927b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f83928c)) * 31;
            String str3 = this.f83929d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f83930e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f83931f;
            if (str5 != null) {
                i10 = str5.hashCode();
            }
            return ((hashCode4 + i10) * 31) + Double.hashCode(this.f83932g);
        }

        public String toString() {
            String str = this.f83926a;
            String str2 = this.f83927b;
            boolean z10 = this.f83928c;
            String str3 = this.f83929d;
            String str4 = this.f83930e;
            String str5 = this.f83931f;
            double d10 = this.f83932g;
            return "PayOnDeliveryTransaction(brand=" + str + ", label=" + str2 + ", isSuccessful=" + z10 + ", status=" + str3 + ", timestamp=" + str4 + ", declineReason=" + str5 + ", amount=" + d10 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f83926a);
            parcel.writeString(this.f83927b);
            parcel.writeInt(this.f83928c ? 1 : 0);
            parcel.writeString(this.f83929d);
            parcel.writeString(this.f83930e);
            parcel.writeString(this.f83931f);
            parcel.writeDouble(this.f83932g);
        }

        public e(String str, String str2, boolean z10, String str3, String str4, String str5, double d10) {
            super((DefaultConstructorMarker) null);
            this.f83926a = str;
            this.f83927b = str2;
            this.f83928c = z10;
            this.f83929d = str3;
            this.f83930e = str4;
            this.f83931f = str5;
            this.f83932g = d10;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b)\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b%\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b!\u0010,R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b-\u00100R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b1\u0010\u001b¨\u00062"}, d2 = {"LNn/F$f;", "LNn/F;", "", "brand", "label", "", "isSuccessful", "status", "timestamp", "declineReason", "", "amount", "iopgId", "balanceAmount", "last4Digits", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Z", "g", "()Z", "e", "f", "D", "()D", "h", "i", "Ljava/lang/Double;", "()Ljava/lang/Double;", "j", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends F {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f83933a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83934b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f83935c;

        /* renamed from: d  reason: collision with root package name */
        private final String f83936d;

        /* renamed from: e  reason: collision with root package name */
        private final String f83937e;

        /* renamed from: f  reason: collision with root package name */
        private final String f83938f;

        /* renamed from: g  reason: collision with root package name */
        private final double f83939g;

        /* renamed from: h  reason: collision with root package name */
        private final String f83940h;

        /* renamed from: i  reason: collision with root package name */
        private final Double f83941i;

        /* renamed from: j  reason: collision with root package name */
        private final String f83942j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            /* renamed from: a */
            public final f createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new f(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
            }

            /* renamed from: b */
            public final f[] newArray(int i10) {
                return new f[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, boolean z10, String str3, String str4, String str5, double d10, String str6, Double d11, String str7) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str6, "iopgId");
            C17542s.j(str7, "last4Digits");
            this.f83933a = str;
            this.f83934b = str2;
            this.f83935c = z10;
            this.f83936d = str3;
            this.f83937e = str4;
            this.f83938f = str5;
            this.f83939g = d10;
            this.f83940h = str6;
            this.f83941i = d11;
            this.f83942j = str7;
        }

        public double a() {
            return this.f83939g;
        }

        public String b() {
            return this.f83933a;
        }

        public String c() {
            return this.f83938f;
        }

        public String d() {
            return this.f83934b;
        }

        public final int describeContents() {
            return 0;
        }

        public String e() {
            return this.f83936d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return C17542s.e(this.f83933a, fVar.f83933a) && C17542s.e(this.f83934b, fVar.f83934b) && this.f83935c == fVar.f83935c && C17542s.e(this.f83936d, fVar.f83936d) && C17542s.e(this.f83937e, fVar.f83937e) && C17542s.e(this.f83938f, fVar.f83938f) && Double.compare(this.f83939g, fVar.f83939g) == 0 && C17542s.e(this.f83940h, fVar.f83940h) && C17542s.e(this.f83941i, fVar.f83941i) && C17542s.e(this.f83942j, fVar.f83942j);
        }

        public String f() {
            return this.f83937e;
        }

        public boolean g() {
            return this.f83935c;
        }

        public final Double h() {
            return this.f83941i;
        }

        public int hashCode() {
            String str = this.f83933a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f83934b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f83935c)) * 31;
            String str3 = this.f83936d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f83937e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f83938f;
            int hashCode5 = (((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Double.hashCode(this.f83939g)) * 31) + this.f83940h.hashCode()) * 31;
            Double d10 = this.f83941i;
            if (d10 != null) {
                i10 = d10.hashCode();
            }
            return ((hashCode5 + i10) * 31) + this.f83942j.hashCode();
        }

        public final String i() {
            return this.f83940h;
        }

        public final String j() {
            return this.f83942j;
        }

        public String toString() {
            String str = this.f83933a;
            String str2 = this.f83934b;
            boolean z10 = this.f83935c;
            String str3 = this.f83936d;
            String str4 = this.f83937e;
            String str5 = this.f83938f;
            double d10 = this.f83939g;
            String str6 = this.f83940h;
            Double d11 = this.f83941i;
            String str7 = this.f83942j;
            return "PrepaidCardTransaction(brand=" + str + ", label=" + str2 + ", isSuccessful=" + z10 + ", status=" + str3 + ", timestamp=" + str4 + ", declineReason=" + str5 + ", amount=" + d10 + ", iopgId=" + str6 + ", balanceAmount=" + d11 + ", last4Digits=" + str7 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f83933a);
            parcel.writeString(this.f83934b);
            parcel.writeInt(this.f83935c ? 1 : 0);
            parcel.writeString(this.f83936d);
            parcel.writeString(this.f83937e);
            parcel.writeString(this.f83938f);
            parcel.writeDouble(this.f83939g);
            parcel.writeString(this.f83940h);
            Double d10 = this.f83941i;
            if (d10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d10.doubleValue());
            }
            parcel.writeString(this.f83942j);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b&\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b\u001e\u0010)¨\u0006*"}, d2 = {"LNn/F$g;", "LNn/F;", "", "brand", "label", "", "isSuccessful", "status", "timestamp", "declineReason", "", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Z", "g", "()Z", "e", "f", "D", "()D", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends F {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f83943a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83944b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f83945c;

        /* renamed from: d  reason: collision with root package name */
        private final String f83946d;

        /* renamed from: e  reason: collision with root package name */
        private final String f83947e;

        /* renamed from: f  reason: collision with root package name */
        private final String f83948f;

        /* renamed from: g  reason: collision with root package name */
        private final double f83949g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<g> {
            /* renamed from: a */
            public final g createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new g(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble());
            }

            /* renamed from: b */
            public final g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(String str, String str2, boolean z10, String str3, String str4, String str5, double d10) {
            super((DefaultConstructorMarker) null);
            this.f83943a = str;
            this.f83944b = str2;
            this.f83945c = z10;
            this.f83946d = str3;
            this.f83947e = str4;
            this.f83948f = str5;
            this.f83949g = d10;
        }

        public double a() {
            return this.f83949g;
        }

        public String b() {
            return this.f83943a;
        }

        public String c() {
            return this.f83948f;
        }

        public String d() {
            return this.f83944b;
        }

        public final int describeContents() {
            return 0;
        }

        public String e() {
            return this.f83946d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return C17542s.e(this.f83943a, gVar.f83943a) && C17542s.e(this.f83944b, gVar.f83944b) && this.f83945c == gVar.f83945c && C17542s.e(this.f83946d, gVar.f83946d) && C17542s.e(this.f83947e, gVar.f83947e) && C17542s.e(this.f83948f, gVar.f83948f) && Double.compare(this.f83949g, gVar.f83949g) == 0;
        }

        public String f() {
            return this.f83947e;
        }

        public boolean g() {
            return this.f83945c;
        }

        public int hashCode() {
            String str = this.f83943a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f83944b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f83945c)) * 31;
            String str3 = this.f83946d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f83947e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f83948f;
            if (str5 != null) {
                i10 = str5.hashCode();
            }
            return ((hashCode4 + i10) * 31) + Double.hashCode(this.f83949g);
        }

        public String toString() {
            String str = this.f83943a;
            String str2 = this.f83944b;
            boolean z10 = this.f83945c;
            String str3 = this.f83946d;
            String str4 = this.f83947e;
            String str5 = this.f83948f;
            double d10 = this.f83949g;
            return "WalletTransaction(brand=" + str + ", label=" + str2 + ", isSuccessful=" + z10 + ", status=" + str3 + ", timestamp=" + str4 + ", declineReason=" + str5 + ", amount=" + d10 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f83943a);
            parcel.writeString(this.f83944b);
            parcel.writeInt(this.f83945c ? 1 : 0);
            parcel.writeString(this.f83946d);
            parcel.writeString(this.f83947e);
            parcel.writeString(this.f83948f);
            parcel.writeDouble(this.f83949g);
        }
    }

    public /* synthetic */ F(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract double a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract boolean g();

    private F() {
    }
}
