package Ge;

import android.view.KeyEvent;
import android.widget.TextView;
import com.ingka.ikea.app.addresspicker.AddressPickerFragment;
import com.ingka.ikea.app.uicomponents.view.ClearableEditText;

public final /* synthetic */ class e implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AddressPickerFragment f60611a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ClearableEditText f60612b;

    public /* synthetic */ e(AddressPickerFragment addressPickerFragment, ClearableEditText clearableEditText) {
        this.f60611a = addressPickerFragment;
        this.f60612b = clearableEditText;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return AddressPickerFragment.V0(this.f60611a, this.f60612b, textView, i10, keyEvent);
    }
}
