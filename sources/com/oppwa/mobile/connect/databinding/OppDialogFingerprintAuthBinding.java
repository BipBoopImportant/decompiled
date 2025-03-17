package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.oppwa.mobile.connect.R;

public final class OppDialogFingerprintAuthBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f121607a;
    public final Button cancelButton;
    public final Button enterPinButton;
    public final ImageView fingerprintIcon;
    public final TextView fingerprintStatus;
    public final TextView fingerprintTitle;

    private OppDialogFingerprintAuthBinding(LinearLayout linearLayout, Button button, Button button2, ImageView imageView, TextView textView, TextView textView2) {
        this.f121607a = linearLayout;
        this.cancelButton = button;
        this.enterPinButton = button2;
        this.fingerprintIcon = imageView;
        this.fingerprintStatus = textView;
        this.fingerprintTitle = textView2;
    }

    public static OppDialogFingerprintAuthBinding bind(View view) {
        int i10 = R.id.cancel_button;
        Button button = (Button) b.a(view, i10);
        if (button != null) {
            i10 = R.id.enter_pin_button;
            Button button2 = (Button) b.a(view, i10);
            if (button2 != null) {
                i10 = R.id.fingerprint_icon;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = R.id.fingerprint_status;
                    TextView textView = (TextView) b.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.fingerprint_title;
                        TextView textView2 = (TextView) b.a(view, i10);
                        if (textView2 != null) {
                            return new OppDialogFingerprintAuthBinding((LinearLayout) view, button, button2, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppDialogFingerprintAuthBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppDialogFingerprintAuthBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_dialog_fingerprint_auth, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.f121607a;
    }
}
