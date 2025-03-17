package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u000e\u0011\u0018\u0019\u0005\b\u000b\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0001\u0006\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"LNn/D;", "Landroid/os/Parcelable;", "<init>", "()V", "", "c", "()Ljava/lang/String;", "pspBrandName", "b", "label", "", "e", "()Z", "skipCvv", "f", "warningLabel", "LNn/a;", "a", "()LNn/a;", "additionalInformation", "", "d", "()I", "rating", "g", "h", "LNn/D$b;", "LNn/D$c;", "LNn/D$d;", "LNn/D$e;", "LNn/D$g;", "LNn/D$h;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class D implements Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LNn/D$a;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "LNn/D$a$a;", "LNn/D$a$b;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a implements Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u001b\u0010\u0014¨\u0006\""}, d2 = {"LNn/D$a$a;", "LNn/D$a;", "", "minimumAmount", "maximumAmount", "", "locale", "consumerLocale", "<init>", "(DDLjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "d", "()D", "b", "c", "Ljava/lang/String;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.D$a$a  reason: collision with other inner class name */
        public static final class C1690a extends a {
            public static final Parcelable.Creator<C1690a> CREATOR = new C1691a();

            /* renamed from: a  reason: collision with root package name */
            private final double f83841a;

            /* renamed from: b  reason: collision with root package name */
            private final double f83842b;

            /* renamed from: c  reason: collision with root package name */
            private final String f83843c;

            /* renamed from: d  reason: collision with root package name */
            private final String f83844d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Nn.D$a$a$a  reason: collision with other inner class name */
            public static final class C1691a implements Parcelable.Creator<C1690a> {
                /* renamed from: a */
                public final C1690a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new C1690a(parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString());
                }

                /* renamed from: b */
                public final C1690a[] newArray(int i10) {
                    return new C1690a[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1690a(double d10, double d11, String str, String str2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "locale");
                C17542s.j(str2, "consumerLocale");
                this.f83841a = d10;
                this.f83842b = d11;
                this.f83843c = str;
                this.f83844d = str2;
            }

            public final String a() {
                return this.f83844d;
            }

            public final String b() {
                return this.f83843c;
            }

            public final double c() {
                return this.f83842b;
            }

            public final double d() {
                return this.f83841a;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1690a)) {
                    return false;
                }
                C1690a aVar = (C1690a) obj;
                return Double.compare(this.f83841a, aVar.f83841a) == 0 && Double.compare(this.f83842b, aVar.f83842b) == 0 && C17542s.e(this.f83843c, aVar.f83843c) && C17542s.e(this.f83844d, aVar.f83844d);
            }

            public int hashCode() {
                return (((((Double.hashCode(this.f83841a) * 31) + Double.hashCode(this.f83842b)) * 31) + this.f83843c.hashCode()) * 31) + this.f83844d.hashCode();
            }

            public String toString() {
                double d10 = this.f83841a;
                double d11 = this.f83842b;
                String str = this.f83843c;
                String str2 = this.f83844d;
                return "AfterPay(minimumAmount=" + d10 + ", maximumAmount=" + d11 + ", locale=" + str + ", consumerLocale=" + str2 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeDouble(this.f83841a);
                parcel.writeDouble(this.f83842b);
                parcel.writeString(this.f83843c);
                parcel.writeString(this.f83844d);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"LNn/D$a$b;", "LNn/D$a;", "", "country", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {
            public static final Parcelable.Creator<b> CREATOR = new C1692a();

            /* renamed from: a  reason: collision with root package name */
            private final String f83845a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Nn.D$a$b$a  reason: collision with other inner class name */
            public static final class C1692a implements Parcelable.Creator<b> {
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new b(parcel.readString());
                }

                /* renamed from: b */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, PlaceTypes.COUNTRY);
                this.f83845a = str;
            }

            public final String a() {
                return this.f83845a;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f83845a, ((b) obj).f83845a);
            }

            public int hashCode() {
                return this.f83845a.hashCode();
            }

            public String toString() {
                String str = this.f83845a;
                return "Ideal(country=" + str + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f83845a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b#\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b)\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b \u0010+R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.¨\u0006/"}, d2 = {"LNn/D$b;", "LNn/D;", "Landroid/os/Parcelable;", "", "rating", "", "pspBrandName", "label", "", "skipCvv", "warningLabel", "LNn/a;", "additionalInformation", "", "iconUrls", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;LNn/a;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "c", "Z", "e", "()Z", "f", "LNn/a;", "()LNn/a;", "g", "Ljava/util/List;", "()Ljava/util/List;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends D implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final int f83846a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83847b;

        /* renamed from: c  reason: collision with root package name */
        private final String f83848c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f83849d;

        /* renamed from: e  reason: collision with root package name */
        private final String f83850e;

        /* renamed from: f  reason: collision with root package name */
        private final C10798a f83851f;

        /* renamed from: g  reason: collision with root package name */
        private final List<String> f83852g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new b(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : C10798a.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i10, String str, String str2, boolean z10, String str3, C10798a aVar, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, str, str2, (i11 & 8) != 0 ? false : z10, str3, aVar, list);
        }

        public C10798a a() {
            return this.f83851f;
        }

        public String b() {
            return this.f83848c;
        }

        public String c() {
            return this.f83847b;
        }

        public int d() {
            return this.f83846a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean e() {
            return this.f83849d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f83846a == bVar.f83846a && C17542s.e(this.f83847b, bVar.f83847b) && C17542s.e(this.f83848c, bVar.f83848c) && this.f83849d == bVar.f83849d && C17542s.e(this.f83850e, bVar.f83850e) && C17542s.e(this.f83851f, bVar.f83851f) && C17542s.e(this.f83852g, bVar.f83852g);
        }

        public String f() {
            return this.f83850e;
        }

        public final List<String> g() {
            return this.f83852g;
        }

        public int hashCode() {
            int hashCode = ((((((Integer.hashCode(this.f83846a) * 31) + this.f83847b.hashCode()) * 31) + this.f83848c.hashCode()) * 31) + Boolean.hashCode(this.f83849d)) * 31;
            String str = this.f83850e;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C10798a aVar = this.f83851f;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return ((hashCode2 + i10) * 31) + this.f83852g.hashCode();
        }

        public String toString() {
            int i10 = this.f83846a;
            String str = this.f83847b;
            String str2 = this.f83848c;
            boolean z10 = this.f83849d;
            String str3 = this.f83850e;
            C10798a aVar = this.f83851f;
            List<String> list = this.f83852g;
            return "GiftCardPaymentOption(rating=" + i10 + ", pspBrandName=" + str + ", label=" + str2 + ", skipCvv=" + z10 + ", warningLabel=" + str3 + ", additionalInformation=" + aVar + ", iconUrls=" + list + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(this.f83846a);
            parcel.writeString(this.f83847b);
            parcel.writeString(this.f83848c);
            parcel.writeInt(this.f83849d ? 1 : 0);
            parcel.writeString(this.f83850e);
            C10798a aVar = this.f83851f;
            if (aVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                aVar.writeToParcel(parcel, i10);
            }
            parcel.writeStringList(this.f83852g);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(int i10, String str, String str2, boolean z10, String str3, C10798a aVar, List<String> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "pspBrandName");
            C17542s.j(str2, "label");
            C17542s.j(list, "iconUrls");
            this.f83846a = i10;
            this.f83847b = str;
            this.f83848c = str2;
            this.f83849d = z10;
            this.f83850e = str3;
            this.f83851f = aVar;
            this.f83852g = list;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b#\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b)\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b \u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.¨\u0006/"}, d2 = {"LNn/D$c;", "LNn/D;", "Landroid/os/Parcelable;", "", "rating", "", "pspBrandName", "label", "", "skipCvv", "warningLabel", "LNn/a;", "additionalInformation", "LNn/v;", "googlePayInfoHolder", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;LNn/a;LNn/v;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "c", "Z", "e", "()Z", "f", "LNn/a;", "()LNn/a;", "g", "LNn/v;", "()LNn/v;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends D implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final int f83853a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83854b;

        /* renamed from: c  reason: collision with root package name */
        private final String f83855c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f83856d;

        /* renamed from: e  reason: collision with root package name */
        private final String f83857e;

        /* renamed from: f  reason: collision with root package name */
        private final C10798a f83858f;

        /* renamed from: g  reason: collision with root package name */
        private final v f83859g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new c(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : C10798a.CREATOR.createFromParcel(parcel), v.CREATOR.createFromParcel(parcel));
            }

            /* renamed from: b */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i10, String str, String str2, boolean z10, String str3, C10798a aVar, v vVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "pspBrandName");
            C17542s.j(str2, "label");
            C17542s.j(vVar, "googlePayInfoHolder");
            this.f83853a = i10;
            this.f83854b = str;
            this.f83855c = str2;
            this.f83856d = z10;
            this.f83857e = str3;
            this.f83858f = aVar;
            this.f83859g = vVar;
        }

        public C10798a a() {
            return this.f83858f;
        }

        public String b() {
            return this.f83855c;
        }

        public String c() {
            return this.f83854b;
        }

        public int d() {
            return this.f83853a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean e() {
            return this.f83856d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f83853a == cVar.f83853a && C17542s.e(this.f83854b, cVar.f83854b) && C17542s.e(this.f83855c, cVar.f83855c) && this.f83856d == cVar.f83856d && C17542s.e(this.f83857e, cVar.f83857e) && C17542s.e(this.f83858f, cVar.f83858f) && C17542s.e(this.f83859g, cVar.f83859g);
        }

        public String f() {
            return this.f83857e;
        }

        public final v g() {
            return this.f83859g;
        }

        public int hashCode() {
            int hashCode = ((((((Integer.hashCode(this.f83853a) * 31) + this.f83854b.hashCode()) * 31) + this.f83855c.hashCode()) * 31) + Boolean.hashCode(this.f83856d)) * 31;
            String str = this.f83857e;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C10798a aVar = this.f83858f;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return ((hashCode2 + i10) * 31) + this.f83859g.hashCode();
        }

        public String toString() {
            int i10 = this.f83853a;
            String str = this.f83854b;
            String str2 = this.f83855c;
            boolean z10 = this.f83856d;
            String str3 = this.f83857e;
            C10798a aVar = this.f83858f;
            v vVar = this.f83859g;
            return "GooglePayOptionHolder(rating=" + i10 + ", pspBrandName=" + str + ", label=" + str2 + ", skipCvv=" + z10 + ", warningLabel=" + str3 + ", additionalInformation=" + aVar + ", googlePayInfoHolder=" + vVar + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(this.f83853a);
            parcel.writeString(this.f83854b);
            parcel.writeString(this.f83855c);
            parcel.writeInt(this.f83856d ? 1 : 0);
            parcel.writeString(this.f83857e);
            C10798a aVar = this.f83858f;
            if (aVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                aVar.writeToParcel(parcel, i10);
            }
            this.f83859g.writeToParcel(parcel, i10);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b\"\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b%\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001f\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010,¨\u0006."}, d2 = {"LNn/D$d;", "LNn/D;", "Landroid/os/Parcelable;", "", "rating", "", "pspBrandName", "label", "warningLabel", "LNn/a;", "additionalInformation", "", "iconUrls", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LNn/a;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "c", "f", "e", "LNn/a;", "()LNn/a;", "Ljava/util/List;", "g", "()Ljava/util/List;", "()Z", "skipCvv", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends D implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final int f83860a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83861b;

        /* renamed from: c  reason: collision with root package name */
        private final String f83862c;

        /* renamed from: d  reason: collision with root package name */
        private final String f83863d;

        /* renamed from: e  reason: collision with root package name */
        private final C10798a f83864e;

        /* renamed from: f  reason: collision with root package name */
        private final List<String> f83865f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new d(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C10798a.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
            }

            /* renamed from: b */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(int i10, String str, String str2, String str3, C10798a aVar, List<String> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "pspBrandName");
            C17542s.j(str2, "label");
            C17542s.j(list, "iconUrls");
            this.f83860a = i10;
            this.f83861b = str;
            this.f83862c = str2;
            this.f83863d = str3;
            this.f83864e = aVar;
            this.f83865f = list;
        }

        public C10798a a() {
            return this.f83864e;
        }

        public String b() {
            return this.f83862c;
        }

        public String c() {
            return this.f83861b;
        }

        public int d() {
            return this.f83860a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean e() {
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f83860a == dVar.f83860a && C17542s.e(this.f83861b, dVar.f83861b) && C17542s.e(this.f83862c, dVar.f83862c) && C17542s.e(this.f83863d, dVar.f83863d) && C17542s.e(this.f83864e, dVar.f83864e) && C17542s.e(this.f83865f, dVar.f83865f);
        }

        public String f() {
            return this.f83863d;
        }

        public final List<String> g() {
            return this.f83865f;
        }

        public int hashCode() {
            int hashCode = ((((Integer.hashCode(this.f83860a) * 31) + this.f83861b.hashCode()) * 31) + this.f83862c.hashCode()) * 31;
            String str = this.f83863d;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C10798a aVar = this.f83864e;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return ((hashCode2 + i10) * 31) + this.f83865f.hashCode();
        }

        public String toString() {
            int i10 = this.f83860a;
            String str = this.f83861b;
            String str2 = this.f83862c;
            String str3 = this.f83863d;
            C10798a aVar = this.f83864e;
            List<String> list = this.f83865f;
            return "OnlineTransferPaymentOption(rating=" + i10 + ", pspBrandName=" + str + ", label=" + str2 + ", warningLabel=" + str3 + ", additionalInformation=" + aVar + ", iconUrls=" + list + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(this.f83860a);
            parcel.writeString(this.f83861b);
            parcel.writeString(this.f83862c);
            parcel.writeString(this.f83863d);
            C10798a aVar = this.f83864e;
            if (aVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                aVar.writeToParcel(parcel, i10);
            }
            parcel.writeStringList(this.f83865f);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b!\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b'\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001e\u0010)¨\u0006*"}, d2 = {"LNn/D$e;", "LNn/D;", "Landroid/os/Parcelable;", "", "rating", "", "pspBrandName", "label", "", "skipCvv", "warningLabel", "LNn/a;", "additionalInformation", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;LNn/a;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "c", "Z", "e", "()Z", "f", "LNn/a;", "()LNn/a;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends D implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final int f83866a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83867b;

        /* renamed from: c  reason: collision with root package name */
        private final String f83868c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f83869d;

        /* renamed from: e  reason: collision with root package name */
        private final String f83870e;

        /* renamed from: f  reason: collision with root package name */
        private final C10798a f83871f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<e> {
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new e(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : C10798a.CREATOR.createFromParcel(parcel));
            }

            /* renamed from: b */
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(int i10, String str, String str2, boolean z10, String str3, C10798a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, str, str2, (i11 & 8) != 0 ? false : z10, str3, aVar);
        }

        public C10798a a() {
            return this.f83871f;
        }

        public String b() {
            return this.f83868c;
        }

        public String c() {
            return this.f83867b;
        }

        public int d() {
            return this.f83866a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean e() {
            return this.f83869d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f83866a == eVar.f83866a && C17542s.e(this.f83867b, eVar.f83867b) && C17542s.e(this.f83868c, eVar.f83868c) && this.f83869d == eVar.f83869d && C17542s.e(this.f83870e, eVar.f83870e) && C17542s.e(this.f83871f, eVar.f83871f);
        }

        public String f() {
            return this.f83870e;
        }

        public int hashCode() {
            int hashCode = ((((((Integer.hashCode(this.f83866a) * 31) + this.f83867b.hashCode()) * 31) + this.f83868c.hashCode()) * 31) + Boolean.hashCode(this.f83869d)) * 31;
            String str = this.f83870e;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C10798a aVar = this.f83871f;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            int i10 = this.f83866a;
            String str = this.f83867b;
            String str2 = this.f83868c;
            boolean z10 = this.f83869d;
            String str3 = this.f83870e;
            C10798a aVar = this.f83871f;
            return "PayOnDeliveryPaymentOption(rating=" + i10 + ", pspBrandName=" + str + ", label=" + str2 + ", skipCvv=" + z10 + ", warningLabel=" + str3 + ", additionalInformation=" + aVar + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(this.f83866a);
            parcel.writeString(this.f83867b);
            parcel.writeString(this.f83868c);
            parcel.writeInt(this.f83869d ? 1 : 0);
            parcel.writeString(this.f83870e);
            C10798a aVar = this.f83871f;
            if (aVar == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i10);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(int i10, String str, String str2, boolean z10, String str3, C10798a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "pspBrandName");
            C17542s.j(str2, "label");
            this.f83866a = i10;
            this.f83867b = str;
            this.f83868c = str2;
            this.f83869d = z10;
            this.f83870e = str3;
            this.f83871f = aVar;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001c"}, d2 = {"LNn/D$f;", "Landroid/os/Parcelable;", "", "key", "", "label", "<init>", "(ILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final int f83872a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83873b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            /* renamed from: a */
            public final f createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new f(parcel.readInt(), parcel.readString());
            }

            /* renamed from: b */
            public final f[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(int i10, String str) {
            C17542s.j(str, "label");
            this.f83872a = i10;
            this.f83873b = str;
        }

        public final int a() {
            return this.f83872a;
        }

        public final String b() {
            return this.f83873b;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f83872a == fVar.f83872a && C17542s.e(this.f83873b, fVar.f83873b);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f83872a) * 31) + this.f83873b.hashCode();
        }

        public String toString() {
            int i10 = this.f83872a;
            String str = this.f83873b;
            return "PaymentGroup(key=" + i10 + ", label=" + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(this.f83872a);
            parcel.writeString(this.f83873b);
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001d\b\b\u0018\u00002\u00020\u00012\u00020\u0002Bs\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b+\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b1\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b(\u00103R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b6\u00105\u001a\u0004\b8\u00107R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b:\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b=\u0010?\u001a\u0004\b4\u0010@¨\u0006A"}, d2 = {"LNn/D$g;", "LNn/D;", "Landroid/os/Parcelable;", "", "rating", "", "pspBrandName", "label", "", "skipCvv", "warningLabel", "LNn/a;", "additionalInformation", "", "iconUrls", "LNn/A;", "participatingBanks", "LNn/B;", "paymentBinDetection", "LNn/D$f;", "paymentGroup", "LNn/D$a;", "configuration", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;LNn/a;Ljava/util/List;Ljava/util/List;LNn/B;LNn/D$f;LNn/D$a;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "c", "Z", "e", "()Z", "f", "LNn/a;", "()LNn/a;", "g", "Ljava/util/List;", "h", "()Ljava/util/List;", "i", "LNn/B;", "j", "()LNn/B;", "LNn/D$f;", "k", "()LNn/D$f;", "LNn/D$a;", "()LNn/D$a;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends D implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final int f83874a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83875b;

        /* renamed from: c  reason: collision with root package name */
        private final String f83876c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f83877d;

        /* renamed from: e  reason: collision with root package name */
        private final String f83878e;

        /* renamed from: f  reason: collision with root package name */
        private final C10798a f83879f;

        /* renamed from: g  reason: collision with root package name */
        private final List<String> f83880g;

        /* renamed from: h  reason: collision with root package name */
        private final List<A> f83881h;

        /* renamed from: i  reason: collision with root package name */
        private final B f83882i;

        /* renamed from: j  reason: collision with root package name */
        private final f f83883j;

        /* renamed from: k  reason: collision with root package name */
        private final a f83884k;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<g> {
            /* renamed from: a */
            public final g createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z10 = parcel.readInt() != 0;
                String readString3 = parcel.readString();
                f fVar = null;
                C10798a createFromParcel = parcel.readInt() == 0 ? null : C10798a.CREATOR.createFromParcel(parcel);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i10 = 0; i10 != readInt2; i10++) {
                    arrayList.add(A.CREATOR.createFromParcel(parcel));
                }
                B valueOf = B.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    fVar = f.CREATOR.createFromParcel(parcel);
                }
                return new g(readInt, readString, readString2, z10, readString3, createFromParcel, createStringArrayList, arrayList, valueOf, fVar, (a) parcel.readParcelable(g.class.getClassLoader()));
            }

            /* renamed from: b */
            public final g[] newArray(int i10) {
                return new g[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(int i10, String str, String str2, boolean z10, String str3, C10798a aVar, List<String> list, List<A> list2, B b10, f fVar, a aVar2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "pspBrandName");
            C17542s.j(str2, "label");
            C17542s.j(list, "iconUrls");
            C17542s.j(list2, "participatingBanks");
            C17542s.j(b10, "paymentBinDetection");
            this.f83874a = i10;
            this.f83875b = str;
            this.f83876c = str2;
            this.f83877d = z10;
            this.f83878e = str3;
            this.f83879f = aVar;
            this.f83880g = list;
            this.f83881h = list2;
            this.f83882i = b10;
            this.f83883j = fVar;
            this.f83884k = aVar2;
        }

        public C10798a a() {
            return this.f83879f;
        }

        public String b() {
            return this.f83876c;
        }

        public String c() {
            return this.f83875b;
        }

        public int d() {
            return this.f83874a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean e() {
            return this.f83877d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f83874a == gVar.f83874a && C17542s.e(this.f83875b, gVar.f83875b) && C17542s.e(this.f83876c, gVar.f83876c) && this.f83877d == gVar.f83877d && C17542s.e(this.f83878e, gVar.f83878e) && C17542s.e(this.f83879f, gVar.f83879f) && C17542s.e(this.f83880g, gVar.f83880g) && C17542s.e(this.f83881h, gVar.f83881h) && this.f83882i == gVar.f83882i && C17542s.e(this.f83883j, gVar.f83883j) && C17542s.e(this.f83884k, gVar.f83884k);
        }

        public String f() {
            return this.f83878e;
        }

        public final a g() {
            return this.f83884k;
        }

        public final List<String> h() {
            return this.f83880g;
        }

        public int hashCode() {
            int hashCode = ((((((Integer.hashCode(this.f83874a) * 31) + this.f83875b.hashCode()) * 31) + this.f83876c.hashCode()) * 31) + Boolean.hashCode(this.f83877d)) * 31;
            String str = this.f83878e;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C10798a aVar = this.f83879f;
            int hashCode3 = (((((((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f83880g.hashCode()) * 31) + this.f83881h.hashCode()) * 31) + this.f83882i.hashCode()) * 31;
            f fVar = this.f83883j;
            int hashCode4 = (hashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            a aVar2 = this.f83884k;
            if (aVar2 != null) {
                i10 = aVar2.hashCode();
            }
            return hashCode4 + i10;
        }

        public final List<A> i() {
            return this.f83881h;
        }

        public final B j() {
            return this.f83882i;
        }

        public final f k() {
            return this.f83883j;
        }

        public String toString() {
            int i10 = this.f83874a;
            String str = this.f83875b;
            String str2 = this.f83876c;
            boolean z10 = this.f83877d;
            String str3 = this.f83878e;
            C10798a aVar = this.f83879f;
            List<String> list = this.f83880g;
            List<A> list2 = this.f83881h;
            B b10 = this.f83882i;
            f fVar = this.f83883j;
            a aVar2 = this.f83884k;
            return "PaymentOption(rating=" + i10 + ", pspBrandName=" + str + ", label=" + str2 + ", skipCvv=" + z10 + ", warningLabel=" + str3 + ", additionalInformation=" + aVar + ", iconUrls=" + list + ", participatingBanks=" + list2 + ", paymentBinDetection=" + b10 + ", paymentGroup=" + fVar + ", configuration=" + aVar2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(this.f83874a);
            parcel.writeString(this.f83875b);
            parcel.writeString(this.f83876c);
            parcel.writeInt(this.f83877d ? 1 : 0);
            parcel.writeString(this.f83878e);
            C10798a aVar = this.f83879f;
            if (aVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                aVar.writeToParcel(parcel, i10);
            }
            parcel.writeStringList(this.f83880g);
            List<A> list = this.f83881h;
            parcel.writeInt(list.size());
            for (A writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i10);
            }
            parcel.writeString(this.f83882i.name());
            f fVar = this.f83883j;
            if (fVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fVar.writeToParcel(parcel, i10);
            }
            parcel.writeParcelable(this.f83884k, i10);
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b'\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b-\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b$\u0010/R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b0\u00108¨\u00069"}, d2 = {"LNn/D$h;", "LNn/D;", "Landroid/os/Parcelable;", "", "rating", "", "pspBrandName", "label", "", "skipCvv", "warningLabel", "LNn/a;", "additionalInformation", "", "iconUrls", "LNn/B;", "paymentBinDetection", "LNn/D$a;", "configuration", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;LNn/a;Ljava/util/List;LNn/B;LNn/D$a;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "c", "Z", "e", "()Z", "f", "LNn/a;", "()LNn/a;", "g", "Ljava/util/List;", "h", "()Ljava/util/List;", "LNn/B;", "i", "()LNn/B;", "LNn/D$a;", "()LNn/D$a;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h extends D implements Parcelable {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final int f83885a;

        /* renamed from: b  reason: collision with root package name */
        private final String f83886b;

        /* renamed from: c  reason: collision with root package name */
        private final String f83887c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f83888d;

        /* renamed from: e  reason: collision with root package name */
        private final String f83889e;

        /* renamed from: f  reason: collision with root package name */
        private final C10798a f83890f;

        /* renamed from: g  reason: collision with root package name */
        private final List<String> f83891g;

        /* renamed from: h  reason: collision with root package name */
        private final B f83892h;

        /* renamed from: i  reason: collision with root package name */
        private final a f83893i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<h> {
            /* renamed from: a */
            public final h createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new h(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : C10798a.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), B.valueOf(parcel.readString()), (a) parcel.readParcelable(h.class.getClassLoader()));
            }

            /* renamed from: b */
            public final h[] newArray(int i10) {
                return new h[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(int i10, String str, String str2, boolean z10, String str3, C10798a aVar, List<String> list, B b10, a aVar2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "pspBrandName");
            C17542s.j(str2, "label");
            C17542s.j(list, "iconUrls");
            C17542s.j(b10, "paymentBinDetection");
            this.f83885a = i10;
            this.f83886b = str;
            this.f83887c = str2;
            this.f83888d = z10;
            this.f83889e = str3;
            this.f83890f = aVar;
            this.f83891g = list;
            this.f83892h = b10;
            this.f83893i = aVar2;
        }

        public C10798a a() {
            return this.f83890f;
        }

        public String b() {
            return this.f83887c;
        }

        public String c() {
            return this.f83886b;
        }

        public int d() {
            return this.f83885a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean e() {
            return this.f83888d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f83885a == hVar.f83885a && C17542s.e(this.f83886b, hVar.f83886b) && C17542s.e(this.f83887c, hVar.f83887c) && this.f83888d == hVar.f83888d && C17542s.e(this.f83889e, hVar.f83889e) && C17542s.e(this.f83890f, hVar.f83890f) && C17542s.e(this.f83891g, hVar.f83891g) && this.f83892h == hVar.f83892h && C17542s.e(this.f83893i, hVar.f83893i);
        }

        public String f() {
            return this.f83889e;
        }

        public final a g() {
            return this.f83893i;
        }

        public final List<String> h() {
            return this.f83891g;
        }

        public int hashCode() {
            int hashCode = ((((((Integer.hashCode(this.f83885a) * 31) + this.f83886b.hashCode()) * 31) + this.f83887c.hashCode()) * 31) + Boolean.hashCode(this.f83888d)) * 31;
            String str = this.f83889e;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C10798a aVar = this.f83890f;
            int hashCode3 = (((((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f83891g.hashCode()) * 31) + this.f83892h.hashCode()) * 31;
            a aVar2 = this.f83893i;
            if (aVar2 != null) {
                i10 = aVar2.hashCode();
            }
            return hashCode3 + i10;
        }

        public final B i() {
            return this.f83892h;
        }

        public String toString() {
            int i10 = this.f83885a;
            String str = this.f83886b;
            String str2 = this.f83887c;
            boolean z10 = this.f83888d;
            String str3 = this.f83889e;
            C10798a aVar = this.f83890f;
            List<String> list = this.f83891g;
            B b10 = this.f83892h;
            a aVar2 = this.f83893i;
            return "WalletPaymentOption(rating=" + i10 + ", pspBrandName=" + str + ", label=" + str2 + ", skipCvv=" + z10 + ", warningLabel=" + str3 + ", additionalInformation=" + aVar + ", iconUrls=" + list + ", paymentBinDetection=" + b10 + ", configuration=" + aVar2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(this.f83885a);
            parcel.writeString(this.f83886b);
            parcel.writeString(this.f83887c);
            parcel.writeInt(this.f83888d ? 1 : 0);
            parcel.writeString(this.f83889e);
            C10798a aVar = this.f83890f;
            if (aVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                aVar.writeToParcel(parcel, i10);
            }
            parcel.writeStringList(this.f83891g);
            parcel.writeString(this.f83892h.name());
            parcel.writeParcelable(this.f83893i, i10);
        }
    }

    public /* synthetic */ D(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C10798a a();

    public abstract String b();

    public abstract String c();

    public abstract int d();

    public abstract boolean e();

    public abstract String f();

    private D() {
    }
}
