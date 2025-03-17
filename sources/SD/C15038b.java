package sD;

import android.content.SharedPreferences;

/* renamed from: sD.b  reason: case insensitive filesystem */
public final /* synthetic */ class C15038b implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C15039c f130937a;

    public /* synthetic */ C15038b(C15039c cVar) {
        this.f130937a = cVar;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C15039c.J(this.f130937a, sharedPreferences, str);
    }
}
