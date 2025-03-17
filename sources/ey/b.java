package Ey;

import By.C12672k;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f109484a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialButton f109485b;

    private b(MaterialButton materialButton, MaterialButton materialButton2) {
        this.f109484a = materialButton;
        this.f109485b = materialButton2;
    }

    public static b a(View view) {
        if (view != null) {
            MaterialButton materialButton = (MaterialButton) view;
            return new b(materialButton, materialButton);
        }
        throw new NullPointerException("rootView");
    }

    public static b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C12672k.f108238b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public MaterialButton getRoot() {
        return this.f109484a;
    }
}
