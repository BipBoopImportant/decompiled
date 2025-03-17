package He;

import android.view.KeyEvent;
import android.widget.TextView;
import com.ingka.ikea.app.addresspicker.addresslookup.AddressLookupPickerDialog;

public final /* synthetic */ class f implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AddressLookupPickerDialog f60821a;

    public /* synthetic */ f(AddressLookupPickerDialog addressLookupPickerDialog) {
        this.f60821a = addressLookupPickerDialog;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return AddressLookupPickerDialog.d1(this.f60821a, textView, i10, keyEvent);
    }
}
