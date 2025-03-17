package rg;

import android.view.KeyEvent;
import android.widget.TextView;
import com.ingka.ikea.app.dynamicfields.ui.view.TextInputField;

public final /* synthetic */ class e implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextInputField f76465a;

    public /* synthetic */ e(TextInputField textInputField) {
        this.f76465a = textInputField;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return TextInputField.K0(this.f76465a, textView, i10, keyEvent);
    }
}
