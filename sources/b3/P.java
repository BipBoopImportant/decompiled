package B3;

import B3.M;
import android.media.AudioRouting;

public final /* synthetic */ class P implements AudioRouting.OnRoutingChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M.l f32979a;

    public /* synthetic */ P(M.l lVar) {
        this.f32979a = lVar;
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        this.f32979a.b(audioRouting);
    }
}
