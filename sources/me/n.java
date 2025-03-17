package mE;

import android.view.MotionEvent;
import android.view.View;
import com.ingka.ikea.zipselector.impl.ui.ManualPostalCodeBottomSheet;

public final /* synthetic */ class n implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ManualPostalCodeBottomSheet f129376a;

    public /* synthetic */ n(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet) {
        this.f129376a = manualPostalCodeBottomSheet;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return ManualPostalCodeBottomSheet.C1(this.f129376a, view, motionEvent);
    }
}
