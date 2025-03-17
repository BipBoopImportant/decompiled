package rl;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import ol.s;
import ol.t;

/* renamed from: rl.a  reason: case insensitive filesystem */
public final class C11831a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f102030a;

    /* renamed from: b  reason: collision with root package name */
    public final NumberPicker f102031b;

    private C11831a(LinearLayout linearLayout, NumberPicker numberPicker) {
        this.f102030a = linearLayout;
        this.f102031b = numberPicker;
    }

    public static C11831a a(View view) {
        int i10 = s.f100586a;
        NumberPicker numberPicker = (NumberPicker) b.a(view, i10);
        if (numberPicker != null) {
            return new C11831a((LinearLayout) view, numberPicker);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C11831a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(t.f100587a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f102030a;
    }
}
