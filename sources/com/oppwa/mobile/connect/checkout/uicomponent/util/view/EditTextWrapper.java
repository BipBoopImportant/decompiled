package com.oppwa.mobile.connect.checkout.uicomponent.util.view;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.util.InputFormatter;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;
import java.util.Arrays;

public class EditTextWrapper {

    /* renamed from: g  reason: collision with root package name */
    private static final InputFilter[] f121558g = new InputFilter[0];

    /* renamed from: a  reason: collision with root package name */
    private final EditText f121559a;

    /* renamed from: b  reason: collision with root package name */
    private final TextWatcher f121560b;

    /* renamed from: c  reason: collision with root package name */
    private InputValidator f121561c;

    /* renamed from: d  reason: collision with root package name */
    private InputFormatter f121562d;

    /* renamed from: e  reason: collision with root package name */
    private InputWatcher f121563e;

    /* renamed from: f  reason: collision with root package name */
    private String f121564f = "";

    @FunctionalInterface
    public interface InputWatcher {
        void onInputChange(String str);
    }

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            EditTextWrapper.this.a(editable, this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public EditTextWrapper(EditText editText, int i10) {
        this.f121559a = editText;
        editText.setInputType(i10);
        this.f121560b = a();
    }

    private void b() {
        if (this.f121559a.getText() != null) {
            EditText editText = this.f121559a;
            editText.setSelection(editText.getText().length());
        }
    }

    public void applyChanges() {
        if (this.f121559a.getText() != null) {
            this.f121560b.afterTextChanged(this.f121559a.getText());
        }
    }

    public EditText getEditText() {
        return this.f121559a;
    }

    public String getInput() {
        if (this.f121564f.isEmpty()) {
            return null;
        }
        return this.f121564f;
    }

    public boolean isInputValid() {
        InputValidator inputValidator = this.f121561c;
        return inputValidator == null || inputValidator.getError() == null;
    }

    public EditTextWrapper setInputMask(String str) {
        this.f121562d = new InputFormatter(str);
        return this;
    }

    public EditTextWrapper setInputValidator(InputValidator inputValidator) {
        this.f121561c = inputValidator;
        return this;
    }

    public EditTextWrapper setInputWatcher(InputWatcher inputWatcher) {
        this.f121563e = inputWatcher;
        return this;
    }

    public EditTextWrapper setMaxLength(int i10) {
        a(i10);
        return this;
    }

    public void validateInput() {
        InputValidator inputValidator = this.f121561c;
        if (inputValidator != null) {
            inputValidator.validate(getInput());
        }
    }

    private void a(int i10) {
        InputFilter[] filters = this.f121559a.getFilters();
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(i10);
        for (int i11 = 0; i11 < filters.length; i11++) {
            if (filters[i11] instanceof InputFilter.LengthFilter) {
                filters[i11] = lengthFilter;
                this.f121559a.setFilters(filters);
                return;
            }
        }
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[inputFilterArr.length - 1] = new InputFilter.LengthFilter(i10);
        this.f121559a.setFilters(inputFilterArr);
    }

    private TextWatcher a() {
        a aVar = new a();
        this.f121559a.addTextChangedListener(aVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    public void a(Editable editable, TextWatcher textWatcher) {
        if (editable == null || editable.length() == 0) {
            this.f121564f = "";
            return;
        }
        InputFormatter inputFormatter = this.f121562d;
        if (inputFormatter != null) {
            a(editable, inputFormatter, textWatcher);
            this.f121564f = this.f121562d.getUnmaskedInput();
        } else {
            this.f121564f = editable.toString();
        }
        InputWatcher inputWatcher = this.f121563e;
        if (inputWatcher != null) {
            inputWatcher.onInputChange(this.f121564f);
        }
        validateInput();
    }

    private void a(Editable editable, InputFormatter inputFormatter, TextWatcher textWatcher) {
        this.f121559a.removeTextChangedListener(textWatcher);
        InputFilter[] filters = editable.getFilters();
        editable.setFilters(f121558g);
        inputFormatter.applyMask(editable);
        this.f121559a.setText(editable);
        b();
        editable.setFilters(filters);
        this.f121559a.addTextChangedListener(textWatcher);
    }
}
