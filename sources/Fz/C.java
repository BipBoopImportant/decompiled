package Fz;

import Ez.c;
import Ez.d;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class C implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110060a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f110061b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatCheckBox f110062c;

    /* renamed from: d  reason: collision with root package name */
    public final Button f110063d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f110064e;

    private C(ConstraintLayout constraintLayout, TextView textView, AppCompatCheckBox appCompatCheckBox, Button button, TextView textView2) {
        this.f110060a = constraintLayout;
        this.f110061b = textView;
        this.f110062c = appCompatCheckBox;
        this.f110063d = button;
        this.f110064e = textView2;
    }

    public static C a(View view) {
        int i10 = c.f109507D;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = c.f109539T;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) b.a(view, i10);
            if (appCompatCheckBox != null) {
                i10 = c.f109557b0;
                Button button = (Button) b.a(view, i10);
                if (button != null) {
                    i10 = c.f109603q1;
                    TextView textView2 = (TextView) b.a(view, i10);
                    if (textView2 != null) {
                        return new C((ConstraintLayout) view, textView, appCompatCheckBox, button, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109632D, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110060a;
    }
}
