package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oppwa.mobile.connect.R;

public final class OppwaNfcCardReaderActivityBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121654a;

    private OppwaNfcCardReaderActivityBinding(ConstraintLayout constraintLayout) {
        this.f121654a = constraintLayout;
    }

    public static OppwaNfcCardReaderActivityBinding bind(View view) {
        if (view != null) {
            return new OppwaNfcCardReaderActivityBinding((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static OppwaNfcCardReaderActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppwaNfcCardReaderActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.oppwa_nfc_card_reader_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121654a;
    }
}
