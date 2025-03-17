package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001:\u0001&BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b&\u0010.R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b$\u0010/\u001a\u0004\b\"\u00100R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b,\u00100¨\u00061"}, d2 = {"LNn/K;", "Landroid/os/Parcelable;", "LNn/u;", "fulfillmentServiceType", "LNn/p;", "deliveryServiceType", "", "id", "LNn/n;", "deliveryPrice", "", "LNn/K$b;", "deliveries", "LNn/q;", "deliveryTimeWindows", "<init>", "(LNn/u;LNn/p;Ljava/lang/String;LNn/n;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/u;", "e", "()LNn/u;", "b", "LNn/p;", "c", "()LNn/p;", "Ljava/lang/String;", "f", "d", "LNn/n;", "()LNn/n;", "Ljava/util/List;", "()Ljava/util/List;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class K implements Parcelable {
    public static final Parcelable.Creator<K> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final u f83974a;

    /* renamed from: b  reason: collision with root package name */
    private final C10813p f83975b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83976c;

    /* renamed from: d  reason: collision with root package name */
    private final C10811n f83977d;

    /* renamed from: e  reason: collision with root package name */
    private final List<b> f83978e;

    /* renamed from: f  reason: collision with root package name */
    private final List<C10814q> f83979f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<K> {
        /* renamed from: a */
        public final K createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            u valueOf = u.valueOf(parcel.readString());
            C10813p valueOf2 = C10813p.valueOf(parcel.readString());
            String readString = parcel.readString();
            C10811n createFromParcel = C10811n.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(b.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList2.add(C10814q.CREATOR.createFromParcel(parcel));
            }
            return new K(valueOf, valueOf2, readString, createFromParcel, arrayList, arrayList2);
        }

        /* renamed from: b */
        public final K[] newArray(int i10) {
            return new K[i10];
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0018\b\b\u0018\u00002\u00020\u0001:\u0002(%BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\b\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b+\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b(\u00106¨\u00067"}, d2 = {"LNn/K$b;", "Landroid/os/Parcelable;", "", "id", "", "LNn/m;", "items", "", "isRangeOfDays", "LNn/K$b$c;", "selectedTimeWindow", "LNn/P;", "transportMethod", "LNn/G;", "selectedPickupPoint", "LNn/K$b$b;", "presentation", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLNn/K$b$c;LNn/P;LNn/G;LNn/K$b$b;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Z", "()Z", "d", "LNn/K$b$c;", "e", "()LNn/K$b$c;", "LNn/P;", "f", "()LNn/P;", "LNn/G;", "()LNn/G;", "g", "LNn/K$b$b;", "()LNn/K$b$b;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f83980a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C10810m> f83981b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f83982c;

        /* renamed from: d  reason: collision with root package name */
        private final c f83983d;

        /* renamed from: e  reason: collision with root package name */
        private final P f83984e;

        /* renamed from: f  reason: collision with root package name */
        private final G f83985f;

        /* renamed from: g  reason: collision with root package name */
        private final C1695b f83986g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(C10810m.CREATOR.createFromParcel(parcel));
                }
                return new b(readString, arrayList, parcel.readInt() != 0, c.CREATOR.createFromParcel(parcel), P.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : G.CREATOR.createFromParcel(parcel), C1695b.CREATOR.createFromParcel(parcel));
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, d2 = {"LNn/K$b$b;", "Landroid/os/Parcelable;", "", "deliveryDateDetails", "selectTimeWindowDescription", "collapsedDeliveryInformation", "", "allowChangingTimeslot", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Z", "()Z", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.K$b$b  reason: collision with other inner class name */
        public static final class C1695b implements Parcelable {
            public static final Parcelable.Creator<C1695b> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            private final String f83987a;

            /* renamed from: b  reason: collision with root package name */
            private final String f83988b;

            /* renamed from: c  reason: collision with root package name */
            private final String f83989c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f83990d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Nn.K$b$b$a */
            public static final class a implements Parcelable.Creator<C1695b> {
                /* renamed from: a */
                public final C1695b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new C1695b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                /* renamed from: b */
                public final C1695b[] newArray(int i10) {
                    return new C1695b[i10];
                }
            }

            public C1695b(String str, String str2, String str3, boolean z10) {
                this.f83987a = str;
                this.f83988b = str2;
                this.f83989c = str3;
                this.f83990d = z10;
            }

            public final boolean a() {
                return this.f83990d;
            }

            public final String b() {
                return this.f83989c;
            }

            public final String c() {
                return this.f83987a;
            }

            public final String d() {
                return this.f83988b;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1695b)) {
                    return false;
                }
                C1695b bVar = (C1695b) obj;
                return C17542s.e(this.f83987a, bVar.f83987a) && C17542s.e(this.f83988b, bVar.f83988b) && C17542s.e(this.f83989c, bVar.f83989c) && this.f83990d == bVar.f83990d;
            }

            public int hashCode() {
                String str = this.f83987a;
                int i10 = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f83988b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f83989c;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f83990d);
            }

            public String toString() {
                String str = this.f83987a;
                String str2 = this.f83988b;
                String str3 = this.f83989c;
                boolean z10 = this.f83990d;
                return "Presentation(deliveryDateDetails=" + str + ", selectTimeWindowDescription=" + str2 + ", collapsedDeliveryInformation=" + str3 + ", allowChangingTimeslot=" + z10 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f83987a);
                parcel.writeString(this.f83988b);
                parcel.writeString(this.f83989c);
                parcel.writeInt(this.f83990d ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b$\u0010+¨\u0006,"}, d2 = {"LNn/K$b$c;", "Landroid/os/Parcelable;", "Ljava/util/Date;", "fromDateTime", "toDateTime", "", "id", "LNn/n;", "price", "", "LNn/N;", "selectedCapabilities", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;LNn/n;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "()Ljava/util/Date;", "b", "d", "c", "Ljava/lang/String;", "LNn/n;", "getPrice", "()LNn/n;", "e", "Ljava/util/List;", "()Ljava/util/List;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements Parcelable {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            private final Date f83991a;

            /* renamed from: b  reason: collision with root package name */
            private final Date f83992b;

            /* renamed from: c  reason: collision with root package name */
            private final String f83993c;

            /* renamed from: d  reason: collision with root package name */
            private final C10811n f83994d;

            /* renamed from: e  reason: collision with root package name */
            private final List<N> f83995e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<c> {
                /* renamed from: a */
                public final c createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    Date date = (Date) parcel.readSerializable();
                    Date date2 = (Date) parcel.readSerializable();
                    String readString = parcel.readString();
                    ArrayList arrayList = null;
                    C10811n createFromParcel = parcel.readInt() == 0 ? null : C10811n.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        int readInt = parcel.readInt();
                        arrayList = new ArrayList(readInt);
                        for (int i10 = 0; i10 != readInt; i10++) {
                            arrayList.add(N.valueOf(parcel.readString()));
                        }
                    }
                    return new c(date, date2, readString, createFromParcel, arrayList);
                }

                /* renamed from: b */
                public final c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            public c(Date date, Date date2, String str, C10811n nVar, List<? extends N> list) {
                C17542s.j(date, "fromDateTime");
                C17542s.j(date2, "toDateTime");
                C17542s.j(str, "id");
                this.f83991a = date;
                this.f83992b = date2;
                this.f83993c = str;
                this.f83994d = nVar;
                this.f83995e = list;
            }

            public final Date a() {
                return this.f83991a;
            }

            public final String b() {
                return this.f83993c;
            }

            public final List<N> c() {
                return this.f83995e;
            }

            public final Date d() {
                return this.f83992b;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f83991a, cVar.f83991a) && C17542s.e(this.f83992b, cVar.f83992b) && C17542s.e(this.f83993c, cVar.f83993c) && C17542s.e(this.f83994d, cVar.f83994d) && C17542s.e(this.f83995e, cVar.f83995e);
            }

            public int hashCode() {
                int hashCode = ((((this.f83991a.hashCode() * 31) + this.f83992b.hashCode()) * 31) + this.f83993c.hashCode()) * 31;
                C10811n nVar = this.f83994d;
                int i10 = 0;
                int hashCode2 = (hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
                List<N> list = this.f83995e;
                if (list != null) {
                    i10 = list.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                Date date = this.f83991a;
                Date date2 = this.f83992b;
                String str = this.f83993c;
                C10811n nVar = this.f83994d;
                List<N> list = this.f83995e;
                return "SelectedTimeWindow(fromDateTime=" + date + ", toDateTime=" + date2 + ", id=" + str + ", price=" + nVar + ", selectedCapabilities=" + list + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeSerializable(this.f83991a);
                parcel.writeSerializable(this.f83992b);
                parcel.writeString(this.f83993c);
                C10811n nVar = this.f83994d;
                if (nVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    nVar.writeToParcel(parcel, i10);
                }
                List<N> list = this.f83995e;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (N name : list) {
                    parcel.writeString(name.name());
                }
            }
        }

        public b(String str, List<C10810m> list, boolean z10, c cVar, P p10, G g10, C1695b bVar) {
            C17542s.j(str, "id");
            C17542s.j(list, "items");
            C17542s.j(cVar, "selectedTimeWindow");
            C17542s.j(p10, "transportMethod");
            C17542s.j(bVar, "presentation");
            this.f83980a = str;
            this.f83981b = list;
            this.f83982c = z10;
            this.f83983d = cVar;
            this.f83984e = p10;
            this.f83985f = g10;
            this.f83986g = bVar;
        }

        public final String a() {
            return this.f83980a;
        }

        public final List<C10810m> b() {
            return this.f83981b;
        }

        public final C1695b c() {
            return this.f83986g;
        }

        public final G d() {
            return this.f83985f;
        }

        public final int describeContents() {
            return 0;
        }

        public final c e() {
            return this.f83983d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f83980a, bVar.f83980a) && C17542s.e(this.f83981b, bVar.f83981b) && this.f83982c == bVar.f83982c && C17542s.e(this.f83983d, bVar.f83983d) && this.f83984e == bVar.f83984e && C17542s.e(this.f83985f, bVar.f83985f) && C17542s.e(this.f83986g, bVar.f83986g);
        }

        public final P f() {
            return this.f83984e;
        }

        public int hashCode() {
            int hashCode = ((((((((this.f83980a.hashCode() * 31) + this.f83981b.hashCode()) * 31) + Boolean.hashCode(this.f83982c)) * 31) + this.f83983d.hashCode()) * 31) + this.f83984e.hashCode()) * 31;
            G g10 = this.f83985f;
            return ((hashCode + (g10 == null ? 0 : g10.hashCode())) * 31) + this.f83986g.hashCode();
        }

        public String toString() {
            String str = this.f83980a;
            List<C10810m> list = this.f83981b;
            boolean z10 = this.f83982c;
            c cVar = this.f83983d;
            P p10 = this.f83984e;
            G g10 = this.f83985f;
            C1695b bVar = this.f83986g;
            return "SelectedDelivery(id=" + str + ", items=" + list + ", isRangeOfDays=" + z10 + ", selectedTimeWindow=" + cVar + ", transportMethod=" + p10 + ", selectedPickupPoint=" + g10 + ", presentation=" + bVar + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f83980a);
            List<C10810m> list = this.f83981b;
            parcel.writeInt(list.size());
            for (C10810m writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i10);
            }
            parcel.writeInt(this.f83982c ? 1 : 0);
            this.f83983d.writeToParcel(parcel, i10);
            parcel.writeString(this.f83984e.name());
            G g10 = this.f83985f;
            if (g10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                g10.writeToParcel(parcel, i10);
            }
            this.f83986g.writeToParcel(parcel, i10);
        }
    }

    public K(u uVar, C10813p pVar, String str, C10811n nVar, List<b> list, List<C10814q> list2) {
        C17542s.j(uVar, "fulfillmentServiceType");
        C17542s.j(pVar, "deliveryServiceType");
        C17542s.j(str, "id");
        C17542s.j(nVar, "deliveryPrice");
        C17542s.j(list, "deliveries");
        C17542s.j(list2, "deliveryTimeWindows");
        this.f83974a = uVar;
        this.f83975b = pVar;
        this.f83976c = str;
        this.f83977d = nVar;
        this.f83978e = list;
        this.f83979f = list2;
    }

    public final List<b> a() {
        return this.f83978e;
    }

    public final C10811n b() {
        return this.f83977d;
    }

    public final C10813p c() {
        return this.f83975b;
    }

    public final List<C10814q> d() {
        return this.f83979f;
    }

    public final int describeContents() {
        return 0;
    }

    public final u e() {
        return this.f83974a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        return this.f83974a == k10.f83974a && this.f83975b == k10.f83975b && C17542s.e(this.f83976c, k10.f83976c) && C17542s.e(this.f83977d, k10.f83977d) && C17542s.e(this.f83978e, k10.f83978e) && C17542s.e(this.f83979f, k10.f83979f);
    }

    public final String f() {
        return this.f83976c;
    }

    public int hashCode() {
        return (((((((((this.f83974a.hashCode() * 31) + this.f83975b.hashCode()) * 31) + this.f83976c.hashCode()) * 31) + this.f83977d.hashCode()) * 31) + this.f83978e.hashCode()) * 31) + this.f83979f.hashCode();
    }

    public String toString() {
        u uVar = this.f83974a;
        C10813p pVar = this.f83975b;
        String str = this.f83976c;
        C10811n nVar = this.f83977d;
        List<b> list = this.f83978e;
        List<C10814q> list2 = this.f83979f;
        return "SelectedDeliveryServiceHolder(fulfillmentServiceType=" + uVar + ", deliveryServiceType=" + pVar + ", id=" + str + ", deliveryPrice=" + nVar + ", deliveries=" + list + ", deliveryTimeWindows=" + list2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f83974a.name());
        parcel.writeString(this.f83975b.name());
        parcel.writeString(this.f83976c);
        this.f83977d.writeToParcel(parcel, i10);
        List<b> list = this.f83978e;
        parcel.writeInt(list.size());
        for (b writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        List<C10814q> list2 = this.f83979f;
        parcel.writeInt(list2.size());
        for (C10814q writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i10);
        }
    }
}
