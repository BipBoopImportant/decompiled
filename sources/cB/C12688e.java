package CB;

import CB.C12686c;
import android.content.SharedPreferences;
import nI.C17631a;

/* renamed from: CB.e  reason: case insensitive filesystem */
public final /* synthetic */ class C12688e implements C17631a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f108341a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener f108342b;

    public /* synthetic */ C12688e(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f108341a = sharedPreferences;
        this.f108342b = onSharedPreferenceChangeListener;
    }

    public final Object invoke() {
        return C12686c.b.n(this.f108341a, this.f108342b);
    }
}
