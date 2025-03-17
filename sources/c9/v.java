package C9;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.auth.api.signin.b;
import com.google.android.gms.common.util.q;

public final class v extends q {

    /* renamed from: a  reason: collision with root package name */
    private final Context f33795a;

    public v(Context context) {
        this.f33795a = context;
    }

    private final void J3() {
        if (!q.a(this.f33795a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            throw new SecurityException("Calling UID " + callingUid + " is not Google Play services.");
        }
    }

    public final void A() {
        J3();
        p.a(this.f33795a).b();
    }

    public final void U() {
        J3();
        c b10 = c.b(this.f33795a);
        GoogleSignInAccount c10 = b10.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f47921l;
        if (c10 != null) {
            googleSignInOptions = b10.d();
        }
        b a10 = a.a(this.f33795a, googleSignInOptions);
        if (c10 != null) {
            a10.D();
        } else {
            a10.E();
        }
    }
}
