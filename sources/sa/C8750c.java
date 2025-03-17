package sa;

import L9.a;
import L9.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sa.c  reason: case insensitive filesystem */
public final class C8750c extends a {
    public static final Parcelable.Creator<C8750c> CREATOR = new C8749b();

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f56108a;

    public C8750c(Bundle bundle) {
        this.f56108a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.e(parcel, 1, this.f56108a, false);
        c.b(parcel, a10);
    }
}
