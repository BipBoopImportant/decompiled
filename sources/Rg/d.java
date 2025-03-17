package rg;

import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.ingka.ikea.app.dynamicfields.ui.view.TextInputField;

public final /* synthetic */ class d implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextInputField f76463a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextInputEditText f76464b;

    public /* synthetic */ d(TextInputField textInputField, TextInputEditText textInputEditText) {
        this.f76463a = textInputField;
        this.f76464b = textInputEditText;
    }

    public final void onFocusChange(View view, boolean z10) {
        TextInputField.J0(this.f76463a, this.f76464b, view, z10);
    }
}
