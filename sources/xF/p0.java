package xF;

import QE.C13422C;
import android.view.MotionEvent;
import android.view.View;
import com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet;

public final /* synthetic */ class p0 implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C13422C f132020a;

    public /* synthetic */ p0(C13422C c10) {
        this.f132020a = c10;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return GalleryOverflowSheet.K1(this.f132020a, view, motionEvent);
    }
}
