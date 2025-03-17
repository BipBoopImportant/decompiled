package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oppwa.mobile.connect.R;

public final class OppwaNfcBottomSheetDialogBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121653a;
    public final AppCompatImageView bottomSheetHandler;
    public final AppCompatTextView cardExpiryDate;
    public final AppCompatImageView cardImage;
    public final AppCompatTextView cardNumber;
    public final AppCompatButton enableNfcButton;
    public final AppCompatImageView helperImage;
    public final AppCompatTextView infoText;
    public final AppCompatImageView progressImage;
    public final ConstraintLayout resultLayout;

    private OppwaNfcBottomSheetDialogBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView4, ConstraintLayout constraintLayout2) {
        this.f121653a = constraintLayout;
        this.bottomSheetHandler = appCompatImageView;
        this.cardExpiryDate = appCompatTextView;
        this.cardImage = appCompatImageView2;
        this.cardNumber = appCompatTextView2;
        this.enableNfcButton = appCompatButton;
        this.helperImage = appCompatImageView3;
        this.infoText = appCompatTextView3;
        this.progressImage = appCompatImageView4;
        this.resultLayout = constraintLayout2;
    }

    public static OppwaNfcBottomSheetDialogBinding bind(View view) {
        int i10 = R.id.bottom_sheet_handler;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.a(view, i10);
        if (appCompatImageView != null) {
            i10 = R.id.card_expiry_date;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.a(view, i10);
            if (appCompatTextView != null) {
                i10 = R.id.card_image;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) b.a(view, i10);
                if (appCompatImageView2 != null) {
                    i10 = R.id.card_number;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.a(view, i10);
                    if (appCompatTextView2 != null) {
                        i10 = R.id.enable_nfc_button;
                        AppCompatButton appCompatButton = (AppCompatButton) b.a(view, i10);
                        if (appCompatButton != null) {
                            i10 = R.id.helper_image;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) b.a(view, i10);
                            if (appCompatImageView3 != null) {
                                i10 = R.id.info_text;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) b.a(view, i10);
                                if (appCompatTextView3 != null) {
                                    i10 = R.id.progress_image;
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) b.a(view, i10);
                                    if (appCompatImageView4 != null) {
                                        i10 = R.id.result_layout;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) b.a(view, i10);
                                        if (constraintLayout != null) {
                                            return new OppwaNfcBottomSheetDialogBinding((ConstraintLayout) view, appCompatImageView, appCompatTextView, appCompatImageView2, appCompatTextView2, appCompatButton, appCompatImageView3, appCompatTextView3, appCompatImageView4, constraintLayout);
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

    public static OppwaNfcBottomSheetDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppwaNfcBottomSheetDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.oppwa_nfc_bottom_sheet_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121653a;
    }
}
