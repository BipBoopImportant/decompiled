package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.C5187o;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.provider.Transaction;

public class BaseFragment extends C5187o {
    public static final String PAYMENT_ERROR_RESULT_KEY = "PAYMENT_ERROR_RESULT_KEY";
    public static final String TRANSACTION_RESULT_KEY = "TRANSACTION_RESULT_KEY";

    /* renamed from: a  reason: collision with root package name */
    protected TextView f120828a;

    /* renamed from: b  reason: collision with root package name */
    protected ImageButton f120829b;

    /* renamed from: c  reason: collision with root package name */
    protected ImageButton f120830c;

    public BaseFragment() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onStart() {
        super.onStart();
        TextView textView = this.f120828a;
        if (textView != null) {
            textView.announceForAccessibility(textView.getText());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f120828a = (TextView) view.findViewById(R.id.title);
        this.f120829b = (ImageButton) view.findViewById(R.id.back_button);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.close_button);
        this.f120830c = imageButton;
        imageButton.setOnClickListener(new C14097p0(this));
    }

    public BaseFragment(int i10) {
        super(i10);
    }

    /* access modifiers changed from: protected */
    public void a(int i10) {
        this.f120828a.setText(i10);
    }

    /* access modifiers changed from: protected */
    public void a(Transaction transaction) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(TRANSACTION_RESULT_KEY, transaction);
        a(bundle);
    }

    /* access modifiers changed from: protected */
    public void a(Transaction transaction, PaymentError paymentError) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(TRANSACTION_RESULT_KEY, transaction);
        bundle.putParcelable(PAYMENT_ERROR_RESULT_KEY, paymentError);
        a(bundle);
    }

    /* access modifiers changed from: protected */
    public void a() {
        a(new Bundle());
    }

    private void a(Bundle bundle) {
        getParentFragmentManager().Q1(BaseFragment.class.getName(), bundle);
    }
}
