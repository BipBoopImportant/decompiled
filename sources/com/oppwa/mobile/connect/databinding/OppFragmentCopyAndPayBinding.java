package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oppwa.mobile.connect.R;

public final class OppFragmentCopyAndPayBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121613a;
    public final OppLayoutActionbarBinding header;
    public final FrameLayout webViewContainer;

    private OppFragmentCopyAndPayBinding(ConstraintLayout constraintLayout, OppLayoutActionbarBinding oppLayoutActionbarBinding, FrameLayout frameLayout) {
        this.f121613a = constraintLayout;
        this.header = oppLayoutActionbarBinding;
        this.webViewContainer = frameLayout;
    }

    public static OppFragmentCopyAndPayBinding bind(View view) {
        int i10 = R.id.header;
        View a10 = b.a(view, i10);
        if (a10 != null) {
            OppLayoutActionbarBinding bind = OppLayoutActionbarBinding.bind(a10);
            int i11 = R.id.web_view_container;
            FrameLayout frameLayout = (FrameLayout) b.a(view, i11);
            if (frameLayout != null) {
                return new OppFragmentCopyAndPayBinding((ConstraintLayout) view, bind, frameLayout);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppFragmentCopyAndPayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentCopyAndPayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_copy_and_pay, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121613a;
    }
}
