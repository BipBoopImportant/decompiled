package O2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a f11763b = new C0173a();

    /* renamed from: a  reason: collision with root package name */
    private final Parcelable f11764a;

    /* renamed from: O2.a$a  reason: collision with other inner class name */
    class C0173a extends a {
        C0173a() {
            super((C0173a) null);
        }
    }

    class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f11763b;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(C0173a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.f11764a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f11764a, i10);
    }

    private a() {
        this.f11764a = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f11764a = parcelable == f11763b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f11764a = readParcelable == null ? f11763b : readParcelable;
    }
}
