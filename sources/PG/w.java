package pg;

import android.view.View;
import pg.x;

public final /* synthetic */ class w implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f75942a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f75943b;

    public /* synthetic */ w(x xVar, x.a aVar) {
        this.f75942a = xVar;
        this.f75943b = aVar;
    }

    public final void onFocusChange(View view, boolean z10) {
        x.a.q(this.f75942a, this.f75943b, view, z10);
    }
}
