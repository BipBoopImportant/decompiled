package com.oppwa.mobile.connect.checkout.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.meta.CheckoutValidationResult;

public class InputLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextInputLayout f120981a;

    /* renamed from: b  reason: collision with root package name */
    private EditText f120982b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f120983c;

    /* renamed from: d  reason: collision with root package name */
    private c f120984d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f120985e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f120986f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public d f120987g;

    /* renamed from: h  reason: collision with root package name */
    IPaymentFormListener f120988h;

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            if (InputLayout.this.f120987g != null) {
                InputLayout.this.f120987g.a(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f120990a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.oppwa.mobile.connect.checkout.meta.CheckoutValidationResult[] r0 = com.oppwa.mobile.connect.checkout.meta.CheckoutValidationResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f120990a = r0
                com.oppwa.mobile.connect.checkout.meta.CheckoutValidationResult r1 = com.oppwa.mobile.connect.checkout.meta.CheckoutValidationResult.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f120990a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.oppwa.mobile.connect.checkout.meta.CheckoutValidationResult r1 = com.oppwa.mobile.connect.checkout.meta.CheckoutValidationResult.NOT_VALID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.checkout.dialog.InputLayout.b.<clinit>():void");
        }
    }

    interface c {
        int a();

        int a(CharSequence charSequence);

        CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener);
    }

    interface d {
        void a(Editable editable);

        void a(boolean z10);
    }

    private static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f120991a;

        class a implements Parcelable.Creator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, (a) null);
            }

            /* renamed from: a */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        /* synthetic */ e(Parcel parcel, a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f120991a);
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        private e(Parcel parcel) {
            super(parcel);
            this.f120991a = parcel.readInt();
        }
    }

    public InputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void b() {
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.text_input_layout);
        this.f120981a = textInputLayout;
        textInputLayout.setErrorEnabled(true);
        EditText editText = (EditText) findViewById(R.id.edit_text);
        this.f120982b = editText;
        editText.setOnFocusChangeListener(new S1(this));
        this.f120982b.addTextChangedListener(new a());
        TextView textView = (TextView) findViewById(R.id.helper_text_view);
        this.f120983c = textView;
        textView.setVisibility(4);
    }

    private void c() {
        if (this.f120983c.getVisibility() == 4) {
            this.f120983c.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.opp_helper_in));
            this.f120983c.setVisibility(0);
        }
    }

    public void clear() {
        clearError();
        a();
    }

    public void clearError() {
        this.f120981a.setError((CharSequence) null);
        this.f120983c.setText("");
        this.f120985e = false;
    }

    public EditText getEditText() {
        return this.f120982b;
    }

    public String getErrorText() {
        return this.f120983c.getText().toString();
    }

    public String getHelperText() {
        return this.f120983c.getHint() != null ? this.f120983c.getHint().toString() : "";
    }

    /* access modifiers changed from: package-private */
    public TextView getHelperTextView() {
        return this.f120983c;
    }

    public String getHint() {
        if (this.f120981a.getHint() != null) {
            return this.f120981a.getHint().toString();
        }
        return null;
    }

    public int getPaddingStart() {
        return this.f120982b.getPaddingStart();
    }

    public String getText() {
        return this.f120982b.getText().toString();
    }

    public boolean hasError() {
        return this.f120985e;
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(this.f120982b.getText());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f120982b.getId() == R.id.edit_text) {
            this.f120982b.setId(View.generateViewId());
        }
        if (!this.f120982b.getText().toString().isEmpty()) {
            validate();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f120982b.setId(eVar.f120991a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f120991a = this.f120982b.getId();
        return eVar;
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravityForRTLLanguages() {
        this.f120982b.setTextDirection(3);
        this.f120982b.setEllipsize(TextUtils.TruncateAt.END);
        this.f120982b.setGravity(21);
    }

    public void setHelperText(String str) {
        this.f120983c.setHint(str);
    }

    public void setHint(String str) {
        this.f120981a.setHint((CharSequence) str);
    }

    public void setInputValidator(c cVar) {
        this.f120984d = cVar;
    }

    public void setListener(d dVar) {
        this.f120987g = dVar;
    }

    public void setNotEditableText(String str) {
        this.f120982b.setText(str);
        this.f120982b.setFocusable(false);
        this.f120982b.setBackgroundResource(0);
        a();
    }

    public void setOptional(boolean z10) {
        this.f120986f = z10;
    }

    public void setPaddingEnd(int i10) {
        EditText editText = this.f120982b;
        editText.setPaddingRelative(editText.getPaddingStart(), this.f120982b.getPaddingTop(), i10, this.f120982b.getPaddingBottom());
    }

    public void setPaddingStart(int i10) {
        EditText editText = this.f120982b;
        editText.setPaddingRelative(i10, editText.getPaddingTop(), this.f120982b.getPaddingEnd(), this.f120982b.getPaddingBottom());
    }

    public void setPaymentFormListener(IPaymentFormListener iPaymentFormListener) {
        this.f120988h = iPaymentFormListener;
    }

    public void setSelectionAtTheEnd() {
        EditText editText = this.f120982b;
        editText.setSelection(editText.getText().length());
    }

    public void setText(String str) {
        this.f120982b.setText(str);
    }

    public void showError(String str) {
        this.f120981a.setError(" ");
        c();
        this.f120983c.setText(str);
        this.f120985e = true;
    }

    public boolean validate() {
        if (!this.f120982b.isFocusable()) {
            return true;
        }
        if (this.f120984d == null) {
            a();
            return false;
        }
        int a10 = a((CharSequence) this.f120982b.getText());
        if (a10 == -1) {
            clearError();
            a();
        } else {
            showError(getContext().getString(a10));
        }
        return a10 == -1;
    }

    public InputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f120985e = false;
        this.f120986f = false;
        setSaveEnabled(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            layoutInflater.inflate(R.layout.opp_layout_input, this, true);
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, boolean z10) {
        if (!z10) {
            validate();
        } else {
            clearError();
            c();
        }
        d dVar = this.f120987g;
        if (dVar != null) {
            dVar.a(z10);
        }
    }

    private int a(CharSequence charSequence) {
        int i10 = b.f120990a[this.f120984d.a(charSequence.toString(), this.f120988h).ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return -1;
            }
            return this.f120984d.a();
        } else if (!TextUtils.isEmpty(charSequence) || !this.f120986f) {
            return this.f120984d.a(charSequence);
        } else {
            return -1;
        }
    }

    public InputLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet);
    }

    public InputLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet);
    }

    private void a() {
        this.f120983c.setVisibility(4);
    }
}
