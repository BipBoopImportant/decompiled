package C9;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class p {

    /* renamed from: d  reason: collision with root package name */
    private static p f33791d;

    /* renamed from: a  reason: collision with root package name */
    final c f33792a;

    /* renamed from: b  reason: collision with root package name */
    GoogleSignInAccount f33793b;

    /* renamed from: c  reason: collision with root package name */
    GoogleSignInOptions f33794c;

    private p(Context context) {
        c b10 = c.b(context);
        this.f33792a = b10;
        this.f33793b = b10.c();
        this.f33794c = b10.d();
    }

    public static synchronized p a(Context context) {
        p d10;
        synchronized (p.class) {
            d10 = d(context.getApplicationContext());
        }
        return d10;
    }

    private static synchronized p d(Context context) {
        synchronized (p.class) {
            p pVar = f33791d;
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p(context);
            f33791d = pVar2;
            return pVar2;
        }
    }

    public final synchronized void b() {
        this.f33792a.a();
        this.f33793b = null;
        this.f33794c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f33792a.f(googleSignInAccount, googleSignInOptions);
        this.f33793b = googleSignInAccount;
        this.f33794c = googleSignInOptions;
    }
}
