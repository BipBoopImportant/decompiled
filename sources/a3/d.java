package a3;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f15162a;

    /* renamed from: b  reason: collision with root package name */
    private f.C0335f f15163b;

    private static class a extends f.C0335f {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<TextView> f15164a;

        /* renamed from: b  reason: collision with root package name */
        private final Reference<d> f15165b;

        a(TextView textView, d dVar) {
            this.f15164a = new WeakReference(textView);
            this.f15165b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        public void b() {
            CharSequence text;
            CharSequence r10;
            super.b();
            TextView textView = this.f15164a.get();
            if (c(textView, this.f15165b.get()) && textView.isAttachedToWindow() && (text = textView.getText()) != (r10 = f.c().r(text))) {
                int selectionStart = Selection.getSelectionStart(r10);
                int selectionEnd = Selection.getSelectionEnd(r10);
                textView.setText(r10);
                if (r10 instanceof Spannable) {
                    d.b((Spannable) r10, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f15162a = textView;
    }

    private f.C0335f a() {
        if (this.f15163b == null) {
            this.f15163b = new a(this.f15162a, this);
        }
        return this.f15163b;
    }

    static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f15162a.isInEditMode()) {
            return charSequence;
        }
        int g10 = f.c().g();
        if (g10 != 0) {
            if (g10 != 1) {
                if (g10 != 3) {
                    return charSequence;
                }
            } else if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f15162a.getText()) || charSequence == null) {
                return charSequence;
            } else {
                if (!(i10 == 0 && i11 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return f.c().s(charSequence, 0, charSequence.length());
            }
        }
        f.c().v(a());
        return charSequence;
    }
}
