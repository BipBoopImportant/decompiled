package Da;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new l();
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    String f34619a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    String f34620b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList f34621c;

    b(String str, String str2, ArrayList arrayList) {
        this.f34619a = str;
        this.f34620b = str2;
        this.f34621c = arrayList;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f34619a, false);
        c.u(parcel, 3, this.f34620b, false);
        c.y(parcel, 4, this.f34621c, false);
        c.b(parcel, a10);
    }
}
