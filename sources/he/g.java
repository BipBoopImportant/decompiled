package He;

import android.view.MotionEvent;
import android.view.View;
import com.ingka.ikea.app.addresspicker.addresslookup.AddressLookupPickerDialog;

public final /* synthetic */ class g implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AddressLookupPickerDialog f60822a;

    public /* synthetic */ g(AddressLookupPickerDialog addressLookupPickerDialog) {
        this.f60822a = addressLookupPickerDialog;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return AddressLookupPickerDialog.e1(this.f60822a, view, motionEvent);
    }
}
