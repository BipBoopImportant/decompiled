package sa;

import android.content.SharedPreferences;
import com.google.android.gms.measurement.internal.C7691t3;

public final /* synthetic */ class U implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C7691t3 f56105a;

    public /* synthetic */ U(C7691t3 t3Var) {
        this.f56105a = t3Var;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C7691t3.R(this.f56105a, sharedPreferences, str);
    }
}
