package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: TF.j  reason: case insensitive filesystem */
public final class C16467j implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138422a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatAutoCompleteTextView f138423b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f138424c;

    /* renamed from: d  reason: collision with root package name */
    public final HorizontalScrollView f138425d;

    /* renamed from: e  reason: collision with root package name */
    public final ChipGroup f138426e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f138427f;

    /* renamed from: g  reason: collision with root package name */
    public final HorizontalScrollView f138428g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f138429h;

    /* renamed from: i  reason: collision with root package name */
    public final ChipGroup f138430i;

    /* renamed from: j  reason: collision with root package name */
    public final ConstraintLayout f138431j;

    /* renamed from: k  reason: collision with root package name */
    public final ImageButton f138432k;

    /* renamed from: l  reason: collision with root package name */
    public final TextInputLayout f138433l;

    private C16467j(ConstraintLayout constraintLayout, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, ConstraintLayout constraintLayout2, HorizontalScrollView horizontalScrollView, ChipGroup chipGroup, TextView textView, HorizontalScrollView horizontalScrollView2, TextView textView2, ChipGroup chipGroup2, ConstraintLayout constraintLayout3, ImageButton imageButton, TextInputLayout textInputLayout) {
        this.f138422a = constraintLayout;
        this.f138423b = appCompatAutoCompleteTextView;
        this.f138424c = constraintLayout2;
        this.f138425d = horizontalScrollView;
        this.f138426e = chipGroup;
        this.f138427f = textView;
        this.f138428g = horizontalScrollView2;
        this.f138429h = textView2;
        this.f138430i = chipGroup2;
        this.f138431j = constraintLayout3;
        this.f138432k = imageButton;
        this.f138433l = textInputLayout;
    }

    public static C16467j a(View view) {
        int i10 = C16401b.f138180w;
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) b.a(view, i10);
        if (appCompatAutoCompleteTextView != null) {
            i10 = C16401b.f138145k0;
            ConstraintLayout constraintLayout = (ConstraintLayout) b.a(view, i10);
            if (constraintLayout != null) {
                i10 = C16401b.f138148l0;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) b.a(view, i10);
                if (horizontalScrollView != null) {
                    i10 = C16401b.f138151m0;
                    ChipGroup chipGroup = (ChipGroup) b.a(view, i10);
                    if (chipGroup != null) {
                        i10 = C16401b.f138154n0;
                        TextView textView = (TextView) b.a(view, i10);
                        if (textView != null) {
                            i10 = C16401b.f138157o0;
                            HorizontalScrollView horizontalScrollView2 = (HorizontalScrollView) b.a(view, i10);
                            if (horizontalScrollView2 != null) {
                                i10 = C16401b.f138160p0;
                                TextView textView2 = (TextView) b.a(view, i10);
                                if (textView2 != null) {
                                    i10 = C16401b.f138113Z0;
                                    ChipGroup chipGroup2 = (ChipGroup) b.a(view, i10);
                                    if (chipGroup2 != null) {
                                        i10 = C16401b.f138116a1;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) b.a(view, i10);
                                        if (constraintLayout2 != null) {
                                            i10 = C16401b.f138140i1;
                                            ImageButton imageButton = (ImageButton) b.a(view, i10);
                                            if (imageButton != null) {
                                                i10 = C16401b.f138143j1;
                                                TextInputLayout textInputLayout = (TextInputLayout) b.a(view, i10);
                                                if (textInputLayout != null) {
                                                    return new C16467j((ConstraintLayout) view, appCompatAutoCompleteTextView, constraintLayout, horizontalScrollView, chipGroup, textView, horizontalScrollView2, textView2, chipGroup2, constraintLayout2, imageButton, textInputLayout);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138422a;
    }
}
