package C9;

import K9.C6620s;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f33778c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private static c f33779d;

    /* renamed from: a  reason: collision with root package name */
    private final Lock f33780a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f33781b;

    c(Context context) {
        this.f33781b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        C6620s.l(context);
        Lock lock = f33778c;
        lock.lock();
        try {
            if (f33779d == null) {
                f33779d = new c(context.getApplicationContext());
            }
            c cVar = f33779d;
            lock.unlock();
            return cVar;
        } catch (Throwable th2) {
            f33778c.unlock();
            throw th2;
        }
    }

    private static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f33780a.lock();
        try {
            this.f33781b.edit().clear().apply();
        } finally {
            this.f33780a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g11) || (g10 = g(i("googleSignInAccount", g11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.a1(g10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g11) || (g10 = g(i("googleSignInOptions", g11))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.S0(g10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C6620s.l(googleSignInAccount);
        C6620s.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.o1());
        C6620s.l(googleSignInAccount);
        C6620s.l(googleSignInOptions);
        String o12 = googleSignInAccount.o1();
        h(i("googleSignInAccount", o12), googleSignInAccount.W1());
        h(i("googleSignInOptions", o12), googleSignInOptions.W1());
    }

    /* access modifiers changed from: protected */
    public final String g(String str) {
        this.f33780a.lock();
        try {
            return this.f33781b.getString(str, (String) null);
        } finally {
            this.f33780a.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public final void h(String str, String str2) {
        this.f33780a.lock();
        try {
            this.f33781b.edit().putString(str, str2).apply();
        } finally {
            this.f33780a.unlock();
        }
    }
}
