package ea;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;

public final class l0 extends a implements n {
    public static final Parcelable.Creator<l0> CREATOR = new m0();

    /* renamed from: b  reason: collision with root package name */
    public static final l0 f50966b = new l0(Status.f47983f);

    /* renamed from: a  reason: collision with root package name */
    private final Status f50967a;

    public l0(Status status) {
        this.f50967a = status;
    }

    public final Status i() {
        return this.f50967a;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f50967a, i10, false);
        c.b(parcel, a10);
    }
}
