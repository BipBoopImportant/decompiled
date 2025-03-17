package rz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b%\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b2\u00101R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b)\u00105¨\u00066"}, d2 = {"Lrz/h;", "Landroid/os/Parcelable;", "", "barcode", "Lrz/w;", "product", "Lrz/Y;", "stockStatus", "formattedItemNumber", "", "quantity", "maxQuantity", "quantityInCart", "disclaimer", "Lrz/t;", "itemLocation", "<init>", "(Ljava/lang/String;Lrz/w;Lrz/Y;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lrz/t;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBarcode", "b", "Lrz/w;", "e", "()Lrz/w;", "c", "Lrz/Y;", "h", "()Lrz/Y;", "d", "I", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "g", "i", "Lrz/t;", "()Lrz/t;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.h  reason: case insensitive filesystem */
public final class C15015h implements Parcelable {
    public static final Parcelable.Creator<C15015h> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f130848a;

    /* renamed from: b  reason: collision with root package name */
    private final C15029w f130849b;

    /* renamed from: c  reason: collision with root package name */
    private final Y f130850c;

    /* renamed from: d  reason: collision with root package name */
    private final String f130851d;

    /* renamed from: e  reason: collision with root package name */
    private final int f130852e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f130853f;

    /* renamed from: g  reason: collision with root package name */
    private final Integer f130854g;

    /* renamed from: h  reason: collision with root package name */
    private final String f130855h;

    /* renamed from: i  reason: collision with root package name */
    private final C15026t f130856i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.h$a */
    public static final class a implements Parcelable.Creator<C15015h> {
        /* renamed from: a */
        public final C15015h createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new C15015h(parcel.readString(), C15029w.CREATOR.createFromParcel(parcel), (Y) parcel.readParcelable(C15015h.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (C15026t) parcel.readSerializable());
        }

        /* renamed from: b */
        public final C15015h[] newArray(int i10) {
            return new C15015h[i10];
        }
    }

    public C15015h(String str, C15029w wVar, Y y10, String str2, int i10, Integer num, Integer num2, String str3, C15026t tVar) {
        C17542s.j(str, "barcode");
        C17542s.j(wVar, "product");
        C17542s.j(y10, "stockStatus");
        C17542s.j(str2, "formattedItemNumber");
        C17542s.j(str3, "disclaimer");
        C17542s.j(tVar, "itemLocation");
        this.f130848a = str;
        this.f130849b = wVar;
        this.f130850c = y10;
        this.f130851d = str2;
        this.f130852e = i10;
        this.f130853f = num;
        this.f130854g = num2;
        this.f130855h = str3;
        this.f130856i = tVar;
    }

    public final String a() {
        return this.f130855h;
    }

    public final String b() {
        return this.f130851d;
    }

    public final C15026t c() {
        return this.f130856i;
    }

    public final Integer d() {
        return this.f130853f;
    }

    public final int describeContents() {
        return 0;
    }

    public final C15029w e() {
        return this.f130849b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15015h)) {
            return false;
        }
        C15015h hVar = (C15015h) obj;
        return C17542s.e(this.f130848a, hVar.f130848a) && C17542s.e(this.f130849b, hVar.f130849b) && C17542s.e(this.f130850c, hVar.f130850c) && C17542s.e(this.f130851d, hVar.f130851d) && this.f130852e == hVar.f130852e && C17542s.e(this.f130853f, hVar.f130853f) && C17542s.e(this.f130854g, hVar.f130854g) && C17542s.e(this.f130855h, hVar.f130855h) && C17542s.e(this.f130856i, hVar.f130856i);
    }

    public final int f() {
        return this.f130852e;
    }

    public final Integer g() {
        return this.f130854g;
    }

    public final Y h() {
        return this.f130850c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f130848a.hashCode() * 31) + this.f130849b.hashCode()) * 31) + this.f130850c.hashCode()) * 31) + this.f130851d.hashCode()) * 31) + Integer.hashCode(this.f130852e)) * 31;
        Integer num = this.f130853f;
        int i10 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f130854g;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        return ((((hashCode2 + i10) * 31) + this.f130855h.hashCode()) * 31) + this.f130856i.hashCode();
    }

    public String toString() {
        String str = this.f130848a;
        C15029w wVar = this.f130849b;
        Y y10 = this.f130850c;
        String str2 = this.f130851d;
        int i10 = this.f130852e;
        Integer num = this.f130853f;
        Integer num2 = this.f130854g;
        String str3 = this.f130855h;
        C15026t tVar = this.f130856i;
        return "ChildItem(barcode=" + str + ", product=" + wVar + ", stockStatus=" + y10 + ", formattedItemNumber=" + str2 + ", quantity=" + i10 + ", maxQuantity=" + num + ", quantityInCart=" + num2 + ", disclaimer=" + str3 + ", itemLocation=" + tVar + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f130848a);
        this.f130849b.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f130850c, i10);
        parcel.writeString(this.f130851d);
        parcel.writeInt(this.f130852e);
        Integer num = this.f130853f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f130854g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.f130855h);
        parcel.writeSerializable(this.f130856i);
    }
}
