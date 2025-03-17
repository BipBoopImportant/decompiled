package na;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;

public final class j extends a implements n {
    public static final Parcelable.Creator<j> CREATOR = new p();

    /* renamed from: a  reason: collision with root package name */
    private final Status f55144a;

    /* renamed from: b  reason: collision with root package name */
    private final k f55145b;

    public j(Status status, k kVar) {
        this.f55144a = status;
        this.f55145b = kVar;
    }

    public Status i() {
        return this.f55144a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, i(), i10, false);
        c.t(parcel, 2, x(), i10, false);
        c.b(parcel, a10);
    }

    public k x() {
        return this.f55145b;
    }
}
