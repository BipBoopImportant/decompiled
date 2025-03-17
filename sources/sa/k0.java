package sa;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class k0 extends a {
    public static final Parcelable.Creator<k0> CREATOR = new j0();

    /* renamed from: a  reason: collision with root package name */
    public final List<Integer> f56129a;

    k0(List<Integer> list) {
        this.f56129a = list;
    }

    public static k0 x(X... xArr) {
        ArrayList arrayList = new ArrayList(xArr.length);
        for (X zza : xArr) {
            arrayList.add(Integer.valueOf(zza.zza()));
        }
        return new k0(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, this.f56129a, false);
        c.b(parcel, a10);
    }
}
