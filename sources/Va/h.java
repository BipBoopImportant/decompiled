package va;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;
import java.util.List;

public final class h extends a implements n {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    private final List f56972a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56973b;

    public h(List list, String str) {
        this.f56972a = list;
        this.f56973b = str;
    }

    public final Status i() {
        return this.f56973b != null ? Status.f47983f : Status.f47987j;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f56972a;
        int a10 = c.a(parcel);
        c.w(parcel, 1, list, false);
        c.u(parcel, 2, this.f56973b, false);
        c.b(parcel, a10);
    }
}
