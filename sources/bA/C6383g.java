package Ba;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* renamed from: Ba.g  reason: case insensitive filesystem */
public final class C6383g extends a {
    public static final Parcelable.Creator<C6383g> CREATOR = new S();

    /* renamed from: a  reason: collision with root package name */
    private final int f33333a;

    /* renamed from: b  reason: collision with root package name */
    String f33334b;

    /* renamed from: c  reason: collision with root package name */
    String f33335c;

    /* renamed from: d  reason: collision with root package name */
    CommonWalletObject f33336d;

    C6383g() {
        this.f33333a = 3;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, x());
        c.u(parcel, 2, this.f33334b, false);
        c.u(parcel, 3, this.f33335c, false);
        c.t(parcel, 4, this.f33336d, i10, false);
        c.b(parcel, a10);
    }

    public int x() {
        return this.f33333a;
    }

    C6383g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f33333a = i10;
        this.f33335c = str2;
        if (i10 < 3) {
            com.google.android.gms.wallet.wobs.a x10 = CommonWalletObject.x();
            x10.a(str);
            this.f33336d = x10.b();
            return;
        }
        this.f33336d = commonWalletObject;
    }
}
