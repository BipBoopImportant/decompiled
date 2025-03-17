package a3;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.f;

final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    private final KeyListener f15166a;

    /* renamed from: b  reason: collision with root package name */
    private final a f15167b;

    public static class a {
        public boolean a(Editable editable, int i10, KeyEvent keyEvent) {
            return f.i(editable, i10, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    public void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f15166a.clearMetaKeyState(view, editable, i10);
    }

    public int getInputType() {
        return this.f15166a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f15167b.a(editable, i10, keyEvent) || this.f15166a.onKeyDown(view, editable, i10, keyEvent);
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f15166a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f15166a.onKeyUp(view, editable, i10, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f15166a = keyListener;
        this.f15167b = aVar;
    }
}
