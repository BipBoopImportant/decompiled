package BL;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 !2\u00020\u0001:\u0001\u001eB\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0011R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"LBL/a;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "<init>", "(Landroid/os/Parcel;)V", "", "latitudeSpan", "longitudeSpan", "(DD)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "describeContents", "()I", "out", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "hashCode", "a", "D", "getLatitudeSpan", "()D", "setLatitudeSpan", "(D)V", "b", "getLongitudeSpan", "setLongitudeSpan", "c", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: BL.a  reason: case insensitive filesystem */
public final class C15485a implements Parcelable {
    public static final Parcelable.Creator<C15485a> CREATOR = new C3289a();

    /* renamed from: c  reason: collision with root package name */
    public static final b f133424c = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private double f133425a;

    /* renamed from: b  reason: collision with root package name */
    private double f133426b;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"BL/a$a", "Landroid/os/Parcelable$Creator;", "LBL/a;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)LBL/a;", "", "size", "", "b", "(I)[LBL/a;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: BL.a$a  reason: collision with other inner class name */
    public static final class C3289a implements Parcelable.Creator<C15485a> {
        C3289a() {
        }

        /* renamed from: a */
        public C15485a createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new C15485a(parcel, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public C15485a[] newArray(int i10) {
            return new C15485a[i10];
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LBL/a$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "LBL/a;", "CREATOR", "Landroid/os/Parcelable$Creator;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: BL.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ C15485a(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15485a)) {
            return false;
        }
        C15485a aVar = (C15485a) obj;
        return this.f133426b == aVar.f133426b && this.f133425a == aVar.f133425a;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f133425a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f133426b);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "out");
        parcel.writeDouble(this.f133425a);
        parcel.writeDouble(this.f133426b);
    }

    private C15485a(Parcel parcel) {
        this.f133425a = parcel.readDouble();
        this.f133426b = parcel.readDouble();
    }

    public C15485a(double d10, double d11) {
        this.f133425a = d10;
        this.f133426b = d11;
    }
}
