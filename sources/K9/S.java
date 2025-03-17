package K9;

import L9.a;
import L9.c;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class S extends a {
    public static final Parcelable.Creator<S> CREATOR = new T();

    /* renamed from: a  reason: collision with root package name */
    final int f37775a;

    /* renamed from: b  reason: collision with root package name */
    private final Account f37776b;

    /* renamed from: c  reason: collision with root package name */
    private final int f37777c;

    /* renamed from: d  reason: collision with root package name */
    private final GoogleSignInAccount f37778d;

    S(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f37775a = i10;
        this.f37776b = account;
        this.f37777c = i11;
        this.f37778d = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f37775a;
        int a10 = c.a(parcel);
        c.n(parcel, 1, i11);
        c.t(parcel, 2, this.f37776b, i10, false);
        c.n(parcel, 3, this.f37777c);
        c.t(parcel, 4, this.f37778d, i10, false);
        c.b(parcel, a10);
    }

    public S(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
