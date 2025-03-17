package a3;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f15173a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15174b;

    /* renamed from: c  reason: collision with root package name */
    private f.C0335f f15175c;

    /* renamed from: d  reason: collision with root package name */
    private int f15176d = Integer.MAX_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f15177e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15178f;

    private static class a extends f.C0335f {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<EditText> f15179a;

        a(EditText editText) {
            this.f15179a = new WeakReference(editText);
        }

        public void b() {
            super.b();
            g.c(this.f15179a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f15173a = editText;
        this.f15174b = z10;
        this.f15178f = true;
    }

    private f.C0335f a() {
        if (this.f15175c == null) {
            this.f15175c = new a(this.f15173a);
        }
        return this.f15175c;
    }

    static void c(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            f.c().r(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean e() {
        return !this.f15178f || (!this.f15174b && !f.k());
    }

    public void afterTextChanged(Editable editable) {
    }

    public boolean b() {
        return this.f15178f;
    }

    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void d(boolean z10) {
        if (this.f15178f != z10) {
            if (this.f15175c != null) {
                f.c().w(this.f15175c);
            }
            this.f15178f = z10;
            if (z10) {
                c(this.f15173a, f.c().g());
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.f15173a.isInEditMode() && !e() && i11 <= i12 && (charSequence instanceof Spannable)) {
            int g10 = f.c().g();
            if (g10 != 0) {
                if (g10 == 1) {
                    f.c().u((Spannable) charSequence, i10, i10 + i12, this.f15176d, this.f15177e);
                    return;
                } else if (g10 != 3) {
                    return;
                }
            }
            f.c().v(a());
        }
    }
}
