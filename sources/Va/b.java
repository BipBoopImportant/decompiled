package va;

import L9.a;
import L9.c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;

public final class b extends a implements n {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    final int f56969a;

    /* renamed from: b  reason: collision with root package name */
    private int f56970b;

    /* renamed from: c  reason: collision with root package name */
    private Intent f56971c;

    public b() {
        this(2, 0, (Intent) null);
    }

    public final Status i() {
        return this.f56970b == 0 ? Status.f47983f : Status.f47987j;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f56969a;
        int a10 = c.a(parcel);
        c.n(parcel, 1, i11);
        c.n(parcel, 2, this.f56970b);
        c.t(parcel, 3, this.f56971c, i10, false);
        c.b(parcel, a10);
    }

    b(int i10, int i11, Intent intent) {
        this.f56969a = i10;
        this.f56970b = i11;
        this.f56971c = intent;
    }
}
