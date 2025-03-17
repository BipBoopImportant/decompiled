package Ka;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* renamed from: Ka.a  reason: case insensitive filesystem */
public final /* synthetic */ class C9125a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f61404a;

    public /* synthetic */ C9125a(Chip chip) {
        this.f61404a = chip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        this.f61404a.t(compoundButton, z10);
    }
}
