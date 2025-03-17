package yE;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: yE.e  reason: case insensitive filesystem */
public class C15302e {

    /* renamed from: a  reason: collision with root package name */
    private Context f132221a;

    public C15302e(Context context) {
        this.f132221a = context;
    }

    private SharedPreferences b() {
        return this.f132221a.getSharedPreferences("optly", 0);
    }

    private SharedPreferences.Editor c() {
        return this.f132221a.getSharedPreferences("optly", 0).edit();
    }

    public long a(String str, long j10) {
        return b().getLong(str, j10);
    }

    public void d(String str, long j10) {
        c().putLong(str, j10).apply();
    }
}
