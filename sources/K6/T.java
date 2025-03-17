package K6;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import java.util.Observable;

final class T extends Observable implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    private final int f37614a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f37615b;

    /* renamed from: c  reason: collision with root package name */
    private int f37616c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f37617d = false;

    T(int i10, boolean z10) {
        this.f37614a = i10;
        this.f37615b = z10;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (charSequence.length() - this.f37616c > 1) {
            this.f37617d = true;
        } else {
            this.f37617d = false;
        }
        setChanged();
        notifyObservers(new z(SystemClock.uptimeMillis(), "2", this.f37614a, this.f37617d));
        this.f37616c = charSequence.length();
    }
}
