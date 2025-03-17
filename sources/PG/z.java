package pg;

import android.view.KeyEvent;
import android.widget.TextView;
import pg.C;

public final /* synthetic */ class z implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C.a f75952a;

    public /* synthetic */ z(C.a aVar) {
        this.f75952a = aVar;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return C.a.u(this.f75952a, textView, i10, keyEvent);
    }
}
