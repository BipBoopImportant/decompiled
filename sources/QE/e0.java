package QE;

import OE.C13317i;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class e0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114558a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114559b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114560c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114561d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f114562e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f114563f;

    private e0(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, EditText editText) {
        this.f114558a = constraintLayout;
        this.f114559b = textView;
        this.f114560c = textView2;
        this.f114561d = imageView;
        this.f114562e = textView3;
        this.f114563f = editText;
    }

    public static e0 a(View view) {
        int i10 = C13317i.f112887B1;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f112891C1;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                i10 = C13317i.f112895D1;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = C13317i.f112899E1;
                    TextView textView3 = (TextView) b.a(view, i10);
                    if (textView3 != null) {
                        i10 = C13317i.f112903F1;
                        EditText editText = (EditText) b.a(view, i10);
                        if (editText != null) {
                            return new e0((ConstraintLayout) view, textView, textView2, imageView, textView3, editText);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114558a;
    }
}
