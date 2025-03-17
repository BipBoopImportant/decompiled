package ux;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;
import com.ingka.ikea.core.android.view.IkeaToolBar;
import sx.C15051b;
import sx.C15052c;

/* renamed from: ux.a  reason: case insensitive filesystem */
public final class C15120a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f131379a;

    /* renamed from: b  reason: collision with root package name */
    public final LoadingMaterialButton f131380b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f131381c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f131382d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f131383e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f131384f;

    /* renamed from: g  reason: collision with root package name */
    public final HorizontalProgressView f131385g;

    /* renamed from: h  reason: collision with root package name */
    public final RecyclerView f131386h;

    /* renamed from: i  reason: collision with root package name */
    public final CoordinatorLayout f131387i;

    /* renamed from: j  reason: collision with root package name */
    public final IkeaToolBar f131388j;

    private C15120a(ConstraintLayout constraintLayout, LoadingMaterialButton loadingMaterialButton, TextView textView, MaterialButton materialButton, RecyclerView recyclerView, ImageView imageView, HorizontalProgressView horizontalProgressView, RecyclerView recyclerView2, CoordinatorLayout coordinatorLayout, IkeaToolBar ikeaToolBar) {
        this.f131379a = constraintLayout;
        this.f131380b = loadingMaterialButton;
        this.f131381c = textView;
        this.f131382d = materialButton;
        this.f131383e = recyclerView;
        this.f131384f = imageView;
        this.f131385g = horizontalProgressView;
        this.f131386h = recyclerView2;
        this.f131387i = coordinatorLayout;
        this.f131388j = ikeaToolBar;
    }

    public static C15120a a(View view) {
        int i10 = C15051b.f131003a;
        LoadingMaterialButton loadingMaterialButton = (LoadingMaterialButton) b.a(view, i10);
        if (loadingMaterialButton != null) {
            i10 = C15051b.f131005c;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C15051b.f131006d;
                MaterialButton materialButton = (MaterialButton) b.a(view, i10);
                if (materialButton != null) {
                    i10 = C15051b.f131008f;
                    RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
                    if (recyclerView != null) {
                        i10 = C15051b.f131009g;
                        ImageView imageView = (ImageView) b.a(view, i10);
                        if (imageView != null) {
                            i10 = C15051b.f131010h;
                            HorizontalProgressView horizontalProgressView = (HorizontalProgressView) b.a(view, i10);
                            if (horizontalProgressView != null) {
                                i10 = C15051b.f131011i;
                                RecyclerView recyclerView2 = (RecyclerView) b.a(view, i10);
                                if (recyclerView2 != null) {
                                    i10 = C15051b.f131012j;
                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) b.a(view, i10);
                                    if (coordinatorLayout != null) {
                                        i10 = C15051b.f131013k;
                                        IkeaToolBar ikeaToolBar = (IkeaToolBar) b.a(view, i10);
                                        if (ikeaToolBar != null) {
                                            return new C15120a((ConstraintLayout) view, loadingMaterialButton, textView, materialButton, recyclerView, imageView, horizontalProgressView, recyclerView2, coordinatorLayout, ikeaToolBar);
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

    public static C15120a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static C15120a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C15052c.f131015b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f131379a;
    }
}
