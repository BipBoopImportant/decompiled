package Qe;

import Ge.k;
import Ge.l;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f63078a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputEditText f63079b;

    /* renamed from: c  reason: collision with root package name */
    public final TextInputLayout f63080c;

    /* renamed from: d  reason: collision with root package name */
    public final HorizontalProgressView f63081d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f63082e;

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f63083f;

    private c(ConstraintLayout constraintLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, HorizontalProgressView horizontalProgressView, RecyclerView recyclerView, FrameLayout frameLayout) {
        this.f63078a = constraintLayout;
        this.f63079b = textInputEditText;
        this.f63080c = textInputLayout;
        this.f63081d = horizontalProgressView;
        this.f63082e = recyclerView;
        this.f63083f = frameLayout;
    }

    public static c a(View view) {
        int i10 = k.f60627k;
        TextInputEditText textInputEditText = (TextInputEditText) b.a(view, i10);
        if (textInputEditText != null) {
            i10 = k.f60628l;
            TextInputLayout textInputLayout = (TextInputLayout) b.a(view, i10);
            if (textInputLayout != null) {
                i10 = k.f60629m;
                HorizontalProgressView horizontalProgressView = (HorizontalProgressView) b.a(view, i10);
                if (horizontalProgressView != null) {
                    i10 = k.f60630n;
                    RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
                    if (recyclerView != null) {
                        i10 = k.f60631o;
                        FrameLayout frameLayout = (FrameLayout) b.a(view, i10);
                        if (frameLayout != null) {
                            return new c((ConstraintLayout) view, textInputEditText, textInputLayout, horizontalProgressView, recyclerView, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(l.f60634c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f63078a;
    }
}
