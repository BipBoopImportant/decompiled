package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.ingka.ikea.appconfig.model.LocationLatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b!\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"LNn/b;", "Landroid/os/Parcelable;", "", "address", "zipCode", "city", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "location", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/appconfig/model/LocationLatLng;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/appconfig/model/LocationLatLng;)LNn/b;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "f", "d", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "e", "()Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.b  reason: case insensitive filesystem */
public final class C10799b implements Parcelable {
    public static final Parcelable.Creator<C10799b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f84019a;

    /* renamed from: b  reason: collision with root package name */
    private final String f84020b;

    /* renamed from: c  reason: collision with root package name */
    private final String f84021c;

    /* renamed from: d  reason: collision with root package name */
    private final LocationLatLng f84022d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.b$a */
    public static final class a implements Parcelable.Creator<C10799b> {
        /* renamed from: a */
        public final C10799b createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new C10799b(parcel.readString(), parcel.readString(), parcel.readString(), (LocationLatLng) parcel.readParcelable(C10799b.class.getClassLoader()));
        }

        /* renamed from: b */
        public final C10799b[] newArray(int i10) {
            return new C10799b[i10];
        }
    }

    public C10799b(String str, String str2, String str3, LocationLatLng locationLatLng) {
        C17542s.j(str, PlaceTypes.ADDRESS);
        C17542s.j(str2, "zipCode");
        C17542s.j(str3, "city");
        this.f84019a = str;
        this.f84020b = str2;
        this.f84021c = str3;
        this.f84022d = locationLatLng;
    }

    public static /* synthetic */ C10799b b(C10799b bVar, String str, String str2, String str3, LocationLatLng locationLatLng, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.f84019a;
        }
        if ((i10 & 2) != 0) {
            str2 = bVar.f84020b;
        }
        if ((i10 & 4) != 0) {
            str3 = bVar.f84021c;
        }
        if ((i10 & 8) != 0) {
            locationLatLng = bVar.f84022d;
        }
        return bVar.a(str, str2, str3, locationLatLng);
    }

    public final C10799b a(String str, String str2, String str3, LocationLatLng locationLatLng) {
        C17542s.j(str, PlaceTypes.ADDRESS);
        C17542s.j(str2, "zipCode");
        C17542s.j(str3, "city");
        return new C10799b(str, str2, str3, locationLatLng);
    }

    public final String c() {
        return this.f84019a;
    }

    public final String d() {
        return this.f84021c;
    }

    public final int describeContents() {
        return 0;
    }

    public final LocationLatLng e() {
        return this.f84022d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10799b)) {
            return false;
        }
        C10799b bVar = (C10799b) obj;
        return C17542s.e(this.f84019a, bVar.f84019a) && C17542s.e(this.f84020b, bVar.f84020b) && C17542s.e(this.f84021c, bVar.f84021c) && C17542s.e(this.f84022d, bVar.f84022d);
    }

    public final String f() {
        return this.f84020b;
    }

    public int hashCode() {
        int hashCode = ((((this.f84019a.hashCode() * 31) + this.f84020b.hashCode()) * 31) + this.f84021c.hashCode()) * 31;
        LocationLatLng locationLatLng = this.f84022d;
        return hashCode + (locationLatLng == null ? 0 : locationLatLng.hashCode());
    }

    public String toString() {
        String str = this.f84019a;
        String str2 = this.f84020b;
        String str3 = this.f84021c;
        LocationLatLng locationLatLng = this.f84022d;
        return "AddressHolder(address=" + str + ", zipCode=" + str2 + ", city=" + str3 + ", location=" + locationLatLng + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f84019a);
        parcel.writeString(this.f84020b);
        parcel.writeString(this.f84021c);
        parcel.writeParcelable(this.f84022d, i10);
    }
}
