package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: QE.f  reason: case insensitive filesystem */
public final class C13429f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f114564a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114565b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f114566c;

    private C13429f(LinearLayout linearLayout, TextView textView, EditText editText) {
        this.f114564a = linearLayout;
        this.f114565b = textView;
        this.f114566c = editText;
    }

    public static C13429f a(View view) {
        int i10 = C13317i.f112957T;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f112961U;
            EditText editText = (EditText) b.a(view, i10);
            if (editText != null) {
                return new C13429f((LinearLayout) view, textView, editText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13429f c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static C13429f d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113139f, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f114564a;
    }
}
