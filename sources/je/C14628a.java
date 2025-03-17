package jE;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton;
import hE.C14536b;
import hE.C14537c;

/* renamed from: jE.a  reason: case insensitive filesystem */
public final class C14628a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final NestedScrollView f127896a;

    /* renamed from: b  reason: collision with root package name */
    public final RadioGroup f127897b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f127898c;

    /* renamed from: d  reason: collision with root package name */
    public final NestedScrollView f127899d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f127900e;

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f127901f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputEditText f127902g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f127903h;

    /* renamed from: i  reason: collision with root package name */
    public final TextInputLayout f127904i;

    /* renamed from: j  reason: collision with root package name */
    public final LoadingMaterialButton f127905j;

    private C14628a(NestedScrollView nestedScrollView, RadioGroup radioGroup, ImageView imageView, NestedScrollView nestedScrollView2, LinearLayout linearLayout, RecyclerView recyclerView, TextInputEditText textInputEditText, TextView textView, TextInputLayout textInputLayout, LoadingMaterialButton loadingMaterialButton) {
        this.f127896a = nestedScrollView;
        this.f127897b = radioGroup;
        this.f127898c = imageView;
        this.f127899d = nestedScrollView2;
        this.f127900e = linearLayout;
        this.f127901f = recyclerView;
        this.f127902g = textInputEditText;
        this.f127903h = textView;
        this.f127904i = textInputLayout;
        this.f127905j = loadingMaterialButton;
    }

    public static C14628a a(View view) {
        int i10 = C14536b.f127485a;
        RadioGroup radioGroup = (RadioGroup) b.a(view, i10);
        if (radioGroup != null) {
            i10 = C14536b.f127486b;
            ImageView imageView = (ImageView) b.a(view, i10);
            if (imageView != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i10 = C14536b.f127487c;
                LinearLayout linearLayout = (LinearLayout) b.a(view, i10);
                if (linearLayout != null) {
                    i10 = C14536b.f127488d;
                    RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
                    if (recyclerView != null) {
                        i10 = C14536b.f127489e;
                        TextInputEditText textInputEditText = (TextInputEditText) b.a(view, i10);
                        if (textInputEditText != null) {
                            i10 = C14536b.f127490f;
                            TextView textView = (TextView) b.a(view, i10);
                            if (textView != null) {
                                i10 = C14536b.f127491g;
                                TextInputLayout textInputLayout = (TextInputLayout) b.a(view, i10);
                                if (textInputLayout != null) {
                                    i10 = C14536b.f127492h;
                                    LoadingMaterialButton loadingMaterialButton = (LoadingMaterialButton) b.a(view, i10);
                                    if (loadingMaterialButton != null) {
                                        return new C14628a(nestedScrollView, radioGroup, imageView, nestedScrollView, linearLayout, recyclerView, textInputEditText, textView, textInputLayout, loadingMaterialButton);
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

    public static C14628a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C14537c.f127493a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public NestedScrollView getRoot() {
        return this.f127896a;
    }
}
