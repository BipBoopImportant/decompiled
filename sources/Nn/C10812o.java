package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u00040\u000f\f$B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0001\u000234¨\u00065"}, d2 = {"LNn/o;", "Landroid/os/Parcelable;", "<init>", "()V", "LNn/p;", "i", "()LNn/p;", "deliveryServiceType", "", "h", "()Ljava/lang/String;", "deliveryServiceId", "c", "deliveryDate", "", "d", "()Ljava/lang/Long;", "deliveryDateTimestamp", "e", "deliveryDescription", "f", "deliveryDescriptionExpanded", "LNn/u;", "k", "()LNn/u;", "fulfillmentServiceType", "LNn/n;", "g", "()LNn/n;", "deliveryPrice", "", "j", "()Ljava/lang/Double;", "distance", "", "LNn/o$b;", "b", "()Ljava/util/List;", "deliveries", "", "m", "()Z", "supportsWheelChairCapability", "LNn/o$c;", "l", "()LNn/o$c;", "pricing", "", "a", "()Ljava/lang/Integer;", "collapsedRating", "LNn/o$a;", "LNn/o$d;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.o  reason: case insensitive filesystem */
public abstract class C10812o implements Parcelable {

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b$\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b&\u0010#J\u001a\u0010)\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b2\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b6\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b7\u0010%R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b1\u0010<\u001a\u0004\b8\u0010=R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010>\u001a\u0004\b?\u0010@R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0004¢\u0006\f\n\u0004\b?\u0010A\u001a\u0004\b/\u0010BR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b:\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0004¢\u0006\f\n\u0004\bD\u0010I\u001a\u0004\b+\u0010J¨\u0006K"}, d2 = {"LNn/o$a;", "LNn/o;", "LNn/p;", "deliveryServiceType", "", "deliveryServiceId", "deliveryDate", "", "deliveryDateTimestamp", "deliveryDescription", "deliveryDescriptionExpanded", "LNn/u;", "fulfillmentServiceType", "LNn/n;", "deliveryPrice", "", "distance", "", "LNn/o$b;", "deliveries", "", "supportsWheelChairCapability", "LNn/o$c;", "pricing", "", "collapsedRating", "<init>", "(LNn/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;LNn/u;LNn/n;Ljava/lang/Double;Ljava/util/List;ZLNn/o$c;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/p;", "i", "()LNn/p;", "b", "Ljava/lang/String;", "h", "c", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "e", "f", "g", "LNn/u;", "k", "()LNn/u;", "LNn/n;", "()LNn/n;", "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", "Ljava/util/List;", "()Ljava/util/List;", "Z", "m", "()Z", "l", "LNn/o$c;", "()LNn/o$c;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.o$a */
    public static final class a extends C10812o {
        public static final Parcelable.Creator<a> CREATOR = new C1704a();

        /* renamed from: a  reason: collision with root package name */
        private final C10813p f84106a;

        /* renamed from: b  reason: collision with root package name */
        private final String f84107b;

        /* renamed from: c  reason: collision with root package name */
        private final String f84108c;

        /* renamed from: d  reason: collision with root package name */
        private final Long f84109d;

        /* renamed from: e  reason: collision with root package name */
        private final String f84110e;

        /* renamed from: f  reason: collision with root package name */
        private final String f84111f;

        /* renamed from: g  reason: collision with root package name */
        private final u f84112g;

        /* renamed from: h  reason: collision with root package name */
        private final C10811n f84113h;

        /* renamed from: i  reason: collision with root package name */
        private final Double f84114i;

        /* renamed from: j  reason: collision with root package name */
        private final List<b> f84115j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f84116k;

        /* renamed from: l  reason: collision with root package name */
        private final c f84117l;

        /* renamed from: m  reason: collision with root package name */
        private final Integer f84118m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.o$a$a  reason: collision with other inner class name */
        public static final class C1704a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                C17542s.j(parcel2, "parcel");
                C10813p valueOf = C10813p.valueOf(parcel.readString());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                u valueOf3 = u.valueOf(parcel.readString());
                C10811n createFromParcel = C10811n.CREATOR.createFromParcel(parcel2);
                Double valueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                boolean z10 = false;
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(b.CREATOR.createFromParcel(parcel2));
                }
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                return new a(valueOf, readString, readString2, valueOf2, readString3, readString4, valueOf3, createFromParcel, valueOf4, arrayList, z10, c.CREATOR.createFromParcel(parcel2), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C10813p pVar, String str, String str2, Long l10, String str3, String str4, u uVar, C10811n nVar, Double d10, List<b> list, boolean z10, c cVar, Integer num) {
            super((DefaultConstructorMarker) null);
            C17542s.j(pVar, "deliveryServiceType");
            C17542s.j(str, "deliveryServiceId");
            C17542s.j(uVar, "fulfillmentServiceType");
            C17542s.j(nVar, "deliveryPrice");
            C17542s.j(list, "deliveries");
            C17542s.j(cVar, "pricing");
            this.f84106a = pVar;
            this.f84107b = str;
            this.f84108c = str2;
            this.f84109d = l10;
            this.f84110e = str3;
            this.f84111f = str4;
            this.f84112g = uVar;
            this.f84113h = nVar;
            this.f84114i = d10;
            this.f84115j = list;
            this.f84116k = z10;
            this.f84117l = cVar;
            this.f84118m = num;
        }

        public Integer a() {
            return this.f84118m;
        }

        public List<b> b() {
            return this.f84115j;
        }

        public String c() {
            return this.f84108c;
        }

        public Long d() {
            return this.f84109d;
        }

        public final int describeContents() {
            return 0;
        }

        public String e() {
            return this.f84110e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f84106a == aVar.f84106a && C17542s.e(this.f84107b, aVar.f84107b) && C17542s.e(this.f84108c, aVar.f84108c) && C17542s.e(this.f84109d, aVar.f84109d) && C17542s.e(this.f84110e, aVar.f84110e) && C17542s.e(this.f84111f, aVar.f84111f) && this.f84112g == aVar.f84112g && C17542s.e(this.f84113h, aVar.f84113h) && C17542s.e(this.f84114i, aVar.f84114i) && C17542s.e(this.f84115j, aVar.f84115j) && this.f84116k == aVar.f84116k && C17542s.e(this.f84117l, aVar.f84117l) && C17542s.e(this.f84118m, aVar.f84118m);
        }

        public String f() {
            return this.f84111f;
        }

        public C10811n g() {
            return this.f84113h;
        }

        public String h() {
            return this.f84107b;
        }

        public int hashCode() {
            int hashCode = ((this.f84106a.hashCode() * 31) + this.f84107b.hashCode()) * 31;
            String str = this.f84108c;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l10 = this.f84109d;
            int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str2 = this.f84110e;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f84111f;
            int hashCode5 = (((((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f84112g.hashCode()) * 31) + this.f84113h.hashCode()) * 31;
            Double d10 = this.f84114i;
            int hashCode6 = (((((((hashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31) + this.f84115j.hashCode()) * 31) + Boolean.hashCode(this.f84116k)) * 31) + this.f84117l.hashCode()) * 31;
            Integer num = this.f84118m;
            if (num != null) {
                i10 = num.hashCode();
            }
            return hashCode6 + i10;
        }

        public C10813p i() {
            return this.f84106a;
        }

        public Double j() {
            return this.f84114i;
        }

        public u k() {
            return this.f84112g;
        }

        public c l() {
            return this.f84117l;
        }

        public boolean m() {
            return this.f84116k;
        }

        public String toString() {
            C10813p pVar = this.f84106a;
            String str = this.f84107b;
            String str2 = this.f84108c;
            Long l10 = this.f84109d;
            String str3 = this.f84110e;
            String str4 = this.f84111f;
            u uVar = this.f84112g;
            C10811n nVar = this.f84113h;
            Double d10 = this.f84114i;
            List<b> list = this.f84115j;
            boolean z10 = this.f84116k;
            c cVar = this.f84117l;
            Integer num = this.f84118m;
            return "AvailableDeliveryService(deliveryServiceType=" + pVar + ", deliveryServiceId=" + str + ", deliveryDate=" + str2 + ", deliveryDateTimestamp=" + l10 + ", deliveryDescription=" + str3 + ", deliveryDescriptionExpanded=" + str4 + ", fulfillmentServiceType=" + uVar + ", deliveryPrice=" + nVar + ", distance=" + d10 + ", deliveries=" + list + ", supportsWheelChairCapability=" + z10 + ", pricing=" + cVar + ", collapsedRating=" + num + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f84106a.name());
            parcel.writeString(this.f84107b);
            parcel.writeString(this.f84108c);
            Long l10 = this.f84109d;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            parcel.writeString(this.f84110e);
            parcel.writeString(this.f84111f);
            parcel.writeString(this.f84112g.name());
            this.f84113h.writeToParcel(parcel, i10);
            Double d10 = this.f84114i;
            if (d10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d10.doubleValue());
            }
            List<b> list = this.f84115j;
            parcel.writeInt(list.size());
            for (b writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i10);
            }
            parcel.writeInt(this.f84116k ? 1 : 0);
            this.f84117l.writeToParcel(parcel, i10);
            Integer num = this.f84118m;
            if (num == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b!\u0010&R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b\u001e\u0010(¨\u0006)"}, d2 = {"LNn/o$b;", "Landroid/os/Parcelable;", "", "id", "LNn/P;", "transportMethod", "LNn/M;", "earliestTimeWindow", "", "LNn/G;", "availablePickUpPoints", "<init>", "(Ljava/lang/String;LNn/P;LNn/M;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LNn/P;", "d", "()LNn/P;", "LNn/M;", "()LNn/M;", "Ljava/util/List;", "()Ljava/util/List;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.o$b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f84119a;

        /* renamed from: b  reason: collision with root package name */
        private final P f84120b;

        /* renamed from: c  reason: collision with root package name */
        private final M f84121c;

        /* renamed from: d  reason: collision with root package name */
        private final List<G> f84122d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.o$b$a */
        public static final class a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                String readString = parcel.readString();
                P valueOf = P.valueOf(parcel.readString());
                ArrayList arrayList = null;
                M createFromParcel = parcel.readInt() == 0 ? null : M.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i10 = 0; i10 != readInt; i10++) {
                        arrayList2.add(G.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new b(readString, valueOf, createFromParcel, arrayList);
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(String str, P p10, M m10, List<G> list) {
            C17542s.j(str, "id");
            C17542s.j(p10, "transportMethod");
            this.f84119a = str;
            this.f84120b = p10;
            this.f84121c = m10;
            this.f84122d = list;
        }

        public final List<G> a() {
            return this.f84122d;
        }

        public final M b() {
            return this.f84121c;
        }

        public final String c() {
            return this.f84119a;
        }

        public final P d() {
            return this.f84120b;
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
            return C17542s.e(this.f84119a, bVar.f84119a) && this.f84120b == bVar.f84120b && C17542s.e(this.f84121c, bVar.f84121c) && C17542s.e(this.f84122d, bVar.f84122d);
        }

        public int hashCode() {
            int hashCode = ((this.f84119a.hashCode() * 31) + this.f84120b.hashCode()) * 31;
            M m10 = this.f84121c;
            int i10 = 0;
            int hashCode2 = (hashCode + (m10 == null ? 0 : m10.hashCode())) * 31;
            List<G> list = this.f84122d;
            if (list != null) {
                i10 = list.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f84119a;
            P p10 = this.f84120b;
            M m10 = this.f84121c;
            List<G> list = this.f84122d;
            return "Delivery(id=" + str + ", transportMethod=" + p10 + ", earliestTimeWindow=" + m10 + ", availablePickUpPoints=" + list + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f84119a);
            parcel.writeString(this.f84120b.name());
            M m10 = this.f84121c;
            if (m10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                m10.writeToParcel(parcel, i10);
            }
            List<G> list = this.f84122d;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (G writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i10);
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, d2 = {"LNn/o$c;", "Landroid/os/Parcelable;", "", "slotBasedPricingEnabled", "", "minSolutionPrice", "maxSolutionPrice", "<init>", "(ZLjava/lang/Double;Ljava/lang/Double;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.o$c */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final boolean f84123a;

        /* renamed from: b  reason: collision with root package name */
        private final Double f84124b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f84125c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.o$c$a */
        public static final class a implements Parcelable.Creator<c> {
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                boolean z10 = parcel.readInt() != 0;
                Double d10 = null;
                Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                if (parcel.readInt() != 0) {
                    d10 = Double.valueOf(parcel.readDouble());
                }
                return new c(z10, valueOf, d10);
            }

            /* renamed from: b */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(boolean z10, Double d10, Double d11) {
            this.f84123a = z10;
            this.f84124b = d10;
            this.f84125c = d11;
        }

        public final Double a() {
            return this.f84125c;
        }

        public final Double b() {
            return this.f84124b;
        }

        public final boolean c() {
            return this.f84123a;
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
            return this.f84123a == cVar.f84123a && C17542s.e(this.f84124b, cVar.f84124b) && C17542s.e(this.f84125c, cVar.f84125c);
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.f84123a) * 31;
            Double d10 = this.f84124b;
            int i10 = 0;
            int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
            Double d11 = this.f84125c;
            if (d11 != null) {
                i10 = d11.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            boolean z10 = this.f84123a;
            Double d10 = this.f84124b;
            Double d11 = this.f84125c;
            return "Pricing(slotBasedPricingEnabled=" + z10 + ", minSolutionPrice=" + d10 + ", maxSolutionPrice=" + d11 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(this.f84123a ? 1 : 0);
            Double d10 = this.f84124b;
            if (d10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d10.doubleValue());
            }
            Double d11 = this.f84125c;
            if (d11 == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeDouble(d11.doubleValue());
        }
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b%\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0018¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b(\u0010%J\u001a\u0010+\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b4\u0010'R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b8\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b9\u0010'R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0004¢\u0006\f\n\u0004\b3\u0010>\u001a\u0004\b:\u0010?R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b/\u0010@\u001a\u0004\bA\u0010BR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0004¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\b1\u0010DR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b<\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bH\u0010JR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0004¢\u0006\f\n\u0004\bF\u0010K\u001a\u0004\b-\u0010LR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00118\u0006¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bM\u0010D¨\u0006N"}, d2 = {"LNn/o$d;", "LNn/o;", "LNn/p;", "deliveryServiceType", "", "deliveryServiceId", "deliveryDate", "", "deliveryDateTimestamp", "deliveryDescription", "deliveryDescriptionExpanded", "LNn/u;", "fulfillmentServiceType", "LNn/n;", "deliveryPrice", "", "distance", "", "LNn/o$b;", "deliveries", "", "supportsWheelChairCapability", "LNn/o$c;", "pricing", "", "collapsedRating", "LNn/Q;", "unavailableItems", "<init>", "(LNn/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;LNn/u;LNn/n;Ljava/lang/Double;Ljava/util/List;ZLNn/o$c;Ljava/lang/Integer;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/p;", "i", "()LNn/p;", "b", "Ljava/lang/String;", "h", "c", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "e", "f", "g", "LNn/u;", "k", "()LNn/u;", "LNn/n;", "()LNn/n;", "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", "Ljava/util/List;", "()Ljava/util/List;", "Z", "m", "()Z", "l", "LNn/o$c;", "()LNn/o$c;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "n", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.o$d */
    public static final class d extends C10812o {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final C10813p f84126a;

        /* renamed from: b  reason: collision with root package name */
        private final String f84127b;

        /* renamed from: c  reason: collision with root package name */
        private final String f84128c;

        /* renamed from: d  reason: collision with root package name */
        private final Long f84129d;

        /* renamed from: e  reason: collision with root package name */
        private final String f84130e;

        /* renamed from: f  reason: collision with root package name */
        private final String f84131f;

        /* renamed from: g  reason: collision with root package name */
        private final u f84132g;

        /* renamed from: h  reason: collision with root package name */
        private final C10811n f84133h;

        /* renamed from: i  reason: collision with root package name */
        private final Double f84134i;

        /* renamed from: j  reason: collision with root package name */
        private final List<b> f84135j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f84136k;

        /* renamed from: l  reason: collision with root package name */
        private final c f84137l;

        /* renamed from: m  reason: collision with root package name */
        private final Integer f84138m;

        /* renamed from: n  reason: collision with root package name */
        private final List<Q> f84139n;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.o$d$a */
        public static final class a implements Parcelable.Creator<d> {
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                C17542s.j(parcel2, "parcel");
                C10813p valueOf = C10813p.valueOf(parcel.readString());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Integer num = null;
                Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                u valueOf3 = u.valueOf(parcel.readString());
                C10811n createFromParcel = parcel.readInt() == 0 ? null : C10811n.CREATOR.createFromParcel(parcel2);
                Double valueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i10 = 0;
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(b.CREATOR.createFromParcel(parcel2));
                }
                boolean z10 = parcel.readInt() != 0;
                c createFromParcel2 = c.CREATOR.createFromParcel(parcel2);
                if (parcel.readInt() != 0) {
                    num = Integer.valueOf(parcel.readInt());
                }
                Integer num2 = num;
                int readInt2 = parcel.readInt();
                Integer num3 = num2;
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i10 != readInt2) {
                    arrayList2.add(Q.CREATOR.createFromParcel(parcel2));
                    i10++;
                    readInt2 = readInt2;
                }
                return new d(valueOf, readString, readString2, valueOf2, readString3, readString4, valueOf3, createFromParcel, valueOf4, arrayList, z10, createFromParcel2, num3, arrayList2);
            }

            /* renamed from: b */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ d(Nn.C10813p r19, java.lang.String r20, java.lang.String r21, java.lang.Long r22, java.lang.String r23, java.lang.String r24, Nn.u r25, Nn.C10811n r26, java.lang.Double r27, java.util.List r28, boolean r29, Nn.C10812o.c r30, java.lang.Integer r31, java.util.List r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
            /*
                r18 = this;
                r0 = r33
                r1 = r0 & 256(0x100, float:3.59E-43)
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r12 = r2
                goto L_0x000b
            L_0x0009:
                r12 = r27
            L_0x000b:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L_0x0012
                r16 = r2
                goto L_0x0014
            L_0x0012:
                r16 = r31
            L_0x0014:
                r3 = r18
                r4 = r19
                r5 = r20
                r6 = r21
                r7 = r22
                r8 = r23
                r9 = r24
                r10 = r25
                r11 = r26
                r13 = r28
                r14 = r29
                r15 = r30
                r17 = r32
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Nn.C10812o.d.<init>(Nn.p, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, Nn.u, Nn.n, java.lang.Double, java.util.List, boolean, Nn.o$c, java.lang.Integer, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public Integer a() {
            return this.f84138m;
        }

        public List<b> b() {
            return this.f84135j;
        }

        public String c() {
            return this.f84128c;
        }

        public Long d() {
            return this.f84129d;
        }

        public final int describeContents() {
            return 0;
        }

        public String e() {
            return this.f84130e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f84126a == dVar.f84126a && C17542s.e(this.f84127b, dVar.f84127b) && C17542s.e(this.f84128c, dVar.f84128c) && C17542s.e(this.f84129d, dVar.f84129d) && C17542s.e(this.f84130e, dVar.f84130e) && C17542s.e(this.f84131f, dVar.f84131f) && this.f84132g == dVar.f84132g && C17542s.e(this.f84133h, dVar.f84133h) && C17542s.e(this.f84134i, dVar.f84134i) && C17542s.e(this.f84135j, dVar.f84135j) && this.f84136k == dVar.f84136k && C17542s.e(this.f84137l, dVar.f84137l) && C17542s.e(this.f84138m, dVar.f84138m) && C17542s.e(this.f84139n, dVar.f84139n);
        }

        public String f() {
            return this.f84131f;
        }

        public C10811n g() {
            return this.f84133h;
        }

        public String h() {
            return this.f84127b;
        }

        public int hashCode() {
            int hashCode = ((this.f84126a.hashCode() * 31) + this.f84127b.hashCode()) * 31;
            String str = this.f84128c;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l10 = this.f84129d;
            int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str2 = this.f84130e;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f84131f;
            int hashCode5 = (((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f84132g.hashCode()) * 31;
            C10811n nVar = this.f84133h;
            int hashCode6 = (hashCode5 + (nVar == null ? 0 : nVar.hashCode())) * 31;
            Double d10 = this.f84134i;
            int hashCode7 = (((((((hashCode6 + (d10 == null ? 0 : d10.hashCode())) * 31) + this.f84135j.hashCode()) * 31) + Boolean.hashCode(this.f84136k)) * 31) + this.f84137l.hashCode()) * 31;
            Integer num = this.f84138m;
            if (num != null) {
                i10 = num.hashCode();
            }
            return ((hashCode7 + i10) * 31) + this.f84139n.hashCode();
        }

        public C10813p i() {
            return this.f84126a;
        }

        public Double j() {
            return this.f84134i;
        }

        public u k() {
            return this.f84132g;
        }

        public c l() {
            return this.f84137l;
        }

        public boolean m() {
            return this.f84136k;
        }

        public final List<Q> n() {
            return this.f84139n;
        }

        public String toString() {
            C10813p pVar = this.f84126a;
            String str = this.f84127b;
            String str2 = this.f84128c;
            Long l10 = this.f84129d;
            String str3 = this.f84130e;
            String str4 = this.f84131f;
            u uVar = this.f84132g;
            C10811n nVar = this.f84133h;
            Double d10 = this.f84134i;
            List<b> list = this.f84135j;
            boolean z10 = this.f84136k;
            c cVar = this.f84137l;
            Integer num = this.f84138m;
            List<Q> list2 = this.f84139n;
            return "UnavailableDeliveryService(deliveryServiceType=" + pVar + ", deliveryServiceId=" + str + ", deliveryDate=" + str2 + ", deliveryDateTimestamp=" + l10 + ", deliveryDescription=" + str3 + ", deliveryDescriptionExpanded=" + str4 + ", fulfillmentServiceType=" + uVar + ", deliveryPrice=" + nVar + ", distance=" + d10 + ", deliveries=" + list + ", supportsWheelChairCapability=" + z10 + ", pricing=" + cVar + ", collapsedRating=" + num + ", unavailableItems=" + list2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f84126a.name());
            parcel.writeString(this.f84127b);
            parcel.writeString(this.f84128c);
            Long l10 = this.f84129d;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            parcel.writeString(this.f84130e);
            parcel.writeString(this.f84131f);
            parcel.writeString(this.f84132g.name());
            C10811n nVar = this.f84133h;
            if (nVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                nVar.writeToParcel(parcel, i10);
            }
            Double d10 = this.f84134i;
            if (d10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d10.doubleValue());
            }
            List<b> list = this.f84135j;
            parcel.writeInt(list.size());
            for (b writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i10);
            }
            parcel.writeInt(this.f84136k ? 1 : 0);
            this.f84137l.writeToParcel(parcel, i10);
            Integer num = this.f84138m;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            List<Q> list2 = this.f84139n;
            parcel.writeInt(list2.size());
            for (Q writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, i10);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C10813p pVar, String str, String str2, Long l10, String str3, String str4, u uVar, C10811n nVar, Double d10, List<b> list, boolean z10, c cVar, Integer num, List<Q> list2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(pVar, "deliveryServiceType");
            C17542s.j(str, "deliveryServiceId");
            C17542s.j(uVar, "fulfillmentServiceType");
            C17542s.j(list, "deliveries");
            C17542s.j(cVar, "pricing");
            C17542s.j(list2, "unavailableItems");
            this.f84126a = pVar;
            this.f84127b = str;
            this.f84128c = str2;
            this.f84129d = l10;
            this.f84130e = str3;
            this.f84131f = str4;
            this.f84132g = uVar;
            this.f84133h = nVar;
            this.f84134i = d10;
            this.f84135j = list;
            this.f84136k = z10;
            this.f84137l = cVar;
            this.f84138m = num;
            this.f84139n = list2;
        }
    }

    public /* synthetic */ C10812o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Integer a();

    public abstract List<b> b();

    public abstract String c();

    public abstract Long d();

    public abstract String e();

    public abstract String f();

    public abstract C10811n g();

    public abstract String h();

    public abstract C10813p i();

    public abstract Double j();

    public abstract u k();

    public abstract c l();

    public abstract boolean m();

    private C10812o() {
    }
}
