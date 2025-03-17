package I2;

import I2.O;
import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class W implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f8609a;

    public /* synthetic */ W(AtomicBoolean atomicBoolean) {
        this.f8609a = atomicBoolean;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i10) {
        O.b.f(this.f8609a, windowInsetsController, i10);
    }
}
