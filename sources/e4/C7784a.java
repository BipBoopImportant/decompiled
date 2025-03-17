package e4;

import Z3.C6739b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e4.a  reason: case insensitive filesystem */
public final class C7784a extends C6739b {
    public static final Parcelable.Creator<C7784a> CREATOR = new C0832a();

    /* renamed from: e4.a$a  reason: collision with other inner class name */
    class C0832a implements Parcelable.Creator<C7784a> {
        C0832a() {
        }

        /* renamed from: a */
        public C7784a createFromParcel(Parcel parcel) {
            return new C7784a(parcel);
        }

        /* renamed from: b */
        public C7784a[] newArray(int i10) {
            return new C7784a[i10];
        }
    }

    public C7784a(String str, String str2) {
        super(str, str2);
    }

    C7784a(Parcel parcel) {
        super(parcel);
    }
}
