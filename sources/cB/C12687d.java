package CB;

import CB.C12686c;
import SJ.C16449y;
import android.content.SharedPreferences;
import kK.C17514c;

/* renamed from: CB.d  reason: case insensitive filesystem */
public final /* synthetic */ class C12687d implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C16449y f108337a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C12686c f108338b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f108339c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C17514c f108340d;

    public /* synthetic */ C12687d(C16449y yVar, C12686c cVar, SharedPreferences sharedPreferences, C17514c cVar2) {
        this.f108337a = yVar;
        this.f108338b = cVar;
        this.f108339c = sharedPreferences;
        this.f108340d = cVar2;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C12686c.b.m(this.f108337a, this.f108338b, this.f108339c, this.f108340d, sharedPreferences, str);
    }
}
