package a3;

import H2.i;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f15152a;

    /* renamed from: b  reason: collision with root package name */
    private int f15153b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private int f15154c = 0;

    /* renamed from: a3.a$a  reason: collision with other inner class name */
    private static class C0221a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f15155a;

        /* renamed from: b  reason: collision with root package name */
        private final g f15156b;

        C0221a(EditText editText, boolean z10) {
            this.f15155a = editText;
            g gVar = new g(editText, z10);
            this.f15156b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(b.getInstance());
        }

        /* access modifiers changed from: package-private */
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f15156b.b();
        }

        /* access modifiers changed from: package-private */
        public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f15155a, inputConnection, editorInfo);
        }

        /* access modifiers changed from: package-private */
        public void d(boolean z10) {
            this.f15156b.d(z10);
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public KeyListener a(KeyListener keyListener) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void d(boolean z10) {
            throw null;
        }
    }

    public a(EditText editText, boolean z10) {
        i.h(editText, "editText cannot be null");
        this.f15152a = new C0221a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f15152a.a(keyListener);
    }

    public boolean b() {
        return this.f15152a.b();
    }

    public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f15152a.c(inputConnection, editorInfo);
    }

    public void d(boolean z10) {
        this.f15152a.d(z10);
    }
}
