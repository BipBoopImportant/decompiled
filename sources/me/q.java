package mE;

import android.widget.CompoundButton;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import com.ingka.ikea.zipselector.impl.ui.ManualPostalCodeBottomSheet;

public final /* synthetic */ class q implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ManualPostalCodeBottomSheet f129379a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PostalCodePickerConfig.AmbiguousArea f129380b;

    public /* synthetic */ q(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, PostalCodePickerConfig.AmbiguousArea ambiguousArea) {
        this.f129379a = manualPostalCodeBottomSheet;
        this.f129380b = ambiguousArea;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        ManualPostalCodeBottomSheet.A1(this.f129379a, this.f129380b, compoundButton, z10);
    }
}
