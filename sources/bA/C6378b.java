package Ba;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: Ba.b  reason: case insensitive filesystem */
public final class C6378b extends a {
    public static final Parcelable.Creator<C6378b> CREATOR = new K();

    /* renamed from: a  reason: collision with root package name */
    String f33292a;

    /* renamed from: b  reason: collision with root package name */
    String f33293b;

    /* renamed from: c  reason: collision with root package name */
    String f33294c;

    /* renamed from: d  reason: collision with root package name */
    int f33295d;

    /* renamed from: e  reason: collision with root package name */
    UserAddress f33296e;

    private C6378b() {
    }

    public String B() {
        return this.f33293b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f33292a, false);
        c.u(parcel, 2, this.f33293b, false);
        c.u(parcel, 3, this.f33294c, false);
        c.n(parcel, 4, this.f33295d);
        c.t(parcel, 5, this.f33296e, i10, false);
        c.b(parcel, a10);
    }

    public String x() {
        return this.f33292a;
    }

    C6378b(String str, String str2, String str3, int i10, UserAddress userAddress) {
        this.f33292a = str;
        this.f33293b = str2;
        this.f33294c = str3;
        this.f33295d = i10;
        this.f33296e = userAddress;
    }
}
