package lo;

import Nn.C10799b;
import Nn.G;
import Nn.z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0015\b\b\u0018\u0000 .2\u00020\u0001:\u0001\u0018B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017JR\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b%\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b\u000b\u0010-R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b.\u0010-R\u001d\u00101\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b'\u0010!\u0012\u0004\b/\u00100\u001a\u0004\b)\u0010\u001b¨\u00062"}, d2 = {"Llo/s;", "Landroid/os/Parcelable;", "", "id", "name", "", "LNn/z;", "openingHours", "LNn/b;", "address", "", "isSelected", "isSelectable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LNn/b;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LNn/b;ZZ)Llo/s;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "f", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "d", "LNn/b;", "()LNn/b;", "Z", "()Z", "h", "getAddressString$annotations", "()V", "addressString", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new b();

    /* renamed from: h  reason: collision with root package name */
    public static final a f99429h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f99430i = 8;

    /* renamed from: a  reason: collision with root package name */
    private final String f99431a;

    /* renamed from: b  reason: collision with root package name */
    private final String f99432b;

    /* renamed from: c  reason: collision with root package name */
    private final List<z> f99433c;

    /* renamed from: d  reason: collision with root package name */
    private final C10799b f99434d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f99435e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f99436f;

    /* renamed from: g  reason: collision with root package name */
    private final String f99437g;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Llo/s$a;", "", "<init>", "()V", "LNn/G;", "pickUpPointHolder", "Llo/s;", "a", "(LNn/G;)Llo/s;", "", "ADDRESS_FORMAT", "Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a(G g10) {
            C17542s.j(g10, "pickUpPointHolder");
            return new s(g10.g(), g10.e(), g10.f(), g10.a(), false, g10.i() != G.b.NO);
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<s> {
        /* renamed from: a */
        public final s createFromParcel(Parcel parcel) {
            Class<s> cls;
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (true) {
                cls = s.class;
                if (i10 == readInt) {
                    break;
                }
                arrayList.add(parcel.readParcelable(cls.getClassLoader()));
                i10++;
            }
            return new s(readString, readString2, arrayList, (C10799b) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final s[] newArray(int i10) {
            return new s[i10];
        }
    }

    public s(String str, String str2, List<z> list, C10799b bVar, boolean z10, boolean z11) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        C17542s.j(list, "openingHours");
        C17542s.j(bVar, PlaceTypes.ADDRESS);
        this.f99431a = str;
        this.f99432b = str2;
        this.f99433c = list;
        this.f99434d = bVar;
        this.f99435e = z10;
        this.f99436f = z11;
        String format = String.format("%s %s %s", Arrays.copyOf(new Object[]{bVar.c(), bVar.f(), bVar.d()}, 3));
        C17542s.i(format, "format(...)");
        this.f99437g = format;
    }

    public static /* synthetic */ s b(s sVar, String str, String str2, List<z> list, C10799b bVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sVar.f99431a;
        }
        if ((i10 & 2) != 0) {
            str2 = sVar.f99432b;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            list = sVar.f99433c;
        }
        List<z> list2 = list;
        if ((i10 & 8) != 0) {
            bVar = sVar.f99434d;
        }
        C10799b bVar2 = bVar;
        if ((i10 & 16) != 0) {
            z10 = sVar.f99435e;
        }
        boolean z12 = z10;
        if ((i10 & 32) != 0) {
            z11 = sVar.f99436f;
        }
        return sVar.a(str, str3, list2, bVar2, z12, z11);
    }

    public final s a(String str, String str2, List<z> list, C10799b bVar, boolean z10, boolean z11) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        C17542s.j(list, "openingHours");
        C17542s.j(bVar, PlaceTypes.ADDRESS);
        return new s(str, str2, list, bVar, z10, z11);
    }

    public final C10799b c() {
        return this.f99434d;
    }

    public final String d() {
        return this.f99437g;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f99431a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return C17542s.e(this.f99431a, sVar.f99431a) && C17542s.e(this.f99432b, sVar.f99432b) && C17542s.e(this.f99433c, sVar.f99433c) && C17542s.e(this.f99434d, sVar.f99434d) && this.f99435e == sVar.f99435e && this.f99436f == sVar.f99436f;
    }

    public final String f() {
        return this.f99432b;
    }

    public final List<z> g() {
        return this.f99433c;
    }

    public final boolean h() {
        return this.f99436f;
    }

    public int hashCode() {
        return (((((((((this.f99431a.hashCode() * 31) + this.f99432b.hashCode()) * 31) + this.f99433c.hashCode()) * 31) + this.f99434d.hashCode()) * 31) + Boolean.hashCode(this.f99435e)) * 31) + Boolean.hashCode(this.f99436f);
    }

    public String toString() {
        String str = this.f99431a;
        String str2 = this.f99432b;
        List<z> list = this.f99433c;
        C10799b bVar = this.f99434d;
        boolean z10 = this.f99435e;
        boolean z11 = this.f99436f;
        return "PickUpPointAddress(id=" + str + ", name=" + str2 + ", openingHours=" + list + ", address=" + bVar + ", isSelected=" + z10 + ", isSelectable=" + z11 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f99431a);
        parcel.writeString(this.f99432b);
        List<z> list = this.f99433c;
        parcel.writeInt(list.size());
        for (z writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i10);
        }
        parcel.writeParcelable(this.f99434d, i10);
        parcel.writeInt(this.f99435e ? 1 : 0);
        parcel.writeInt(this.f99436f ? 1 : 0);
    }
}
