package h8;

import android.widget.CompoundButton;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.components.ContentsquareSwitchPreference;
import nI.C17642l;

/* renamed from: h8.a  reason: case insensitive filesystem */
public final /* synthetic */ class C7939a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C17642l f51663a;

    public /* synthetic */ C7939a(C17642l lVar) {
        this.f51663a = lVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        ContentsquareSwitchPreference.D(this.f51663a, compoundButton, z10);
    }
}
