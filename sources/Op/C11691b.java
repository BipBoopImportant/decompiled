package op;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.core.model.product.AvailabilityType;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lop/b;", "Landroid/os/Parcelable;", "", "prefix", "Lop/n;", "status", "store", "suffix", "text", "Lcom/ingka/ikea/core/model/product/AvailabilityType;", "type", "<init>", "(Ljava/lang/String;Lop/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/AvailabilityType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPrefix", "b", "Lop/n;", "getStatus", "()Lop/n;", "c", "getStore", "d", "getSuffix", "e", "getText", "f", "Lcom/ingka/ikea/core/model/product/AvailabilityType;", "getType", "()Lcom/ingka/ikea/core/model/product/AvailabilityType;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: op.b  reason: case insensitive filesystem */
public final class C11691b implements Parcelable {
    public static final Parcelable.Creator<C11691b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f100631a;

    /* renamed from: b  reason: collision with root package name */
    private final C11703n f100632b;

    /* renamed from: c  reason: collision with root package name */
    private final String f100633c;

    /* renamed from: d  reason: collision with root package name */
    private final String f100634d;

    /* renamed from: e  reason: collision with root package name */
    private final String f100635e;

    /* renamed from: f  reason: collision with root package name */
    private final AvailabilityType f100636f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: op.b$a */
    public static final class a implements Parcelable.Creator<C11691b> {
        /* renamed from: a */
        public final C11691b createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new C11691b(parcel.readString(), C11703n.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), AvailabilityType.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final C11691b[] newArray(int i10) {
            return new C11691b[i10];
        }
    }

    public C11691b(String str, C11703n nVar, String str2, String str3, String str4, AvailabilityType availabilityType) {
        C17542s.j(nVar, "status");
        C17542s.j(availabilityType, "type");
        this.f100631a = str;
        this.f100632b = nVar;
        this.f100633c = str2;
        this.f100634d = str3;
        this.f100635e = str4;
        this.f100636f = availabilityType;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11691b)) {
            return false;
        }
        C11691b bVar = (C11691b) obj;
        return C17542s.e(this.f100631a, bVar.f100631a) && this.f100632b == bVar.f100632b && C17542s.e(this.f100633c, bVar.f100633c) && C17542s.e(this.f100634d, bVar.f100634d) && C17542s.e(this.f100635e, bVar.f100635e) && this.f100636f == bVar.f100636f;
    }

    public int hashCode() {
        String str = this.f100631a;
        int i10 = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f100632b.hashCode()) * 31;
        String str2 = this.f100633c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f100634d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f100635e;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return ((hashCode3 + i10) * 31) + this.f100636f.hashCode();
    }

    public String toString() {
        String str = this.f100631a;
        C11703n nVar = this.f100632b;
        String str2 = this.f100633c;
        String str3 = this.f100634d;
        String str4 = this.f100635e;
        AvailabilityType availabilityType = this.f100636f;
        return "Availability(prefix=" + str + ", status=" + nVar + ", store=" + str2 + ", suffix=" + str3 + ", text=" + str4 + ", type=" + availabilityType + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f100631a);
        parcel.writeString(this.f100632b.name());
        parcel.writeString(this.f100633c);
        parcel.writeString(this.f100634d);
        parcel.writeString(this.f100635e);
        parcel.writeString(this.f100636f.name());
    }
}
