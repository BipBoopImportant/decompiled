package qa;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new t();

    /* renamed from: a  reason: collision with root package name */
    public final LatLng f55672a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55673b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55674c;

    public j(LatLng latLng, String str, String str2) {
        this.f55672a = latLng;
        this.f55673b = str;
        this.f55674c = str2;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f55672a;
        int a10 = c.a(parcel);
        c.t(parcel, 2, latLng, i10, false);
        c.u(parcel, 3, this.f55673b, false);
        c.u(parcel, 4, this.f55674c, false);
        c.b(parcel, a10);
    }
}
