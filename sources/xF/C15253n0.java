package xF;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet;

/* renamed from: xF.n0  reason: case insensitive filesystem */
public final /* synthetic */ class C15253n0 implements View.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EditText f132016a;

    public /* synthetic */ C15253n0(EditText editText) {
        this.f132016a = editText;
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        return GalleryOverflowSheet.M1(this.f132016a, view, i10, keyEvent);
    }
}
