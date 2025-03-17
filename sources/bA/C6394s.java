package Ba;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Ba.s  reason: case insensitive filesystem */
public final class C6394s extends a {
    public static final Parcelable.Creator<C6394s> CREATOR = new E();

    /* renamed from: a  reason: collision with root package name */
    ArrayList f33377a;

    private C6394s() {
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.w(parcel, 1, this.f33377a, false);
        c.b(parcel, a10);
    }

    C6394s(ArrayList arrayList) {
        this.f33377a = arrayList;
    }
}
