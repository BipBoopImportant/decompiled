package I2;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final /* synthetic */ class N implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f8604a;

    public /* synthetic */ N(View view) {
        this.f8604a = view;
    }

    public final void run() {
        ((InputMethodManager) this.f8604a.getContext().getSystemService("input_method")).showSoftInput(this.f8604a, 0);
    }
}
