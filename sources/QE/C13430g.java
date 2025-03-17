package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* renamed from: QE.g  reason: case insensitive filesystem */
public final class C13430g implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114572a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114573b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialButton f114574c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f114575d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f114576e;

    private C13430g(ConstraintLayout constraintLayout, TextView textView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView2) {
        this.f114572a = constraintLayout;
        this.f114573b = textView;
        this.f114574c = materialButton;
        this.f114575d = materialButton2;
        this.f114576e = textView2;
    }

    public static C13430g a(View view) {
        int i10 = C13317i.f112969W;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f112973X;
            MaterialButton materialButton = (MaterialButton) b.a(view, i10);
            if (materialButton != null) {
                i10 = C13317i.f112977Y;
                MaterialButton materialButton2 = (MaterialButton) b.a(view, i10);
                if (materialButton2 != null) {
                    i10 = C13317i.f112981Z;
                    TextView textView2 = (TextView) b.a(view, i10);
                    if (textView2 != null) {
                        return new C13430g((ConstraintLayout) view, textView, materialButton, materialButton2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13430g c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static C13430g d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113140g, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114572a;
    }
}
