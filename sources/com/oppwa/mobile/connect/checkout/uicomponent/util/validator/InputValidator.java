package com.oppwa.mobile.connect.checkout.uicomponent.util.validator;

import android.content.Context;

public abstract class InputValidator {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f121554a;

    /* renamed from: b  reason: collision with root package name */
    private final Watcher f121555b;

    /* renamed from: c  reason: collision with root package name */
    private String f121556c;

    public interface Watcher {
        void onValidationResult(String str);
    }

    public InputValidator(Context context, Watcher watcher) {
        this.f121554a = context;
        this.f121555b = watcher;
    }

    /* access modifiers changed from: protected */
    public abstract String checkForValidationError(String str);

    public String getError() {
        return this.f121556c;
    }

    public void validate(String str) {
        String checkForValidationError = checkForValidationError(str);
        this.f121556c = checkForValidationError;
        this.f121555b.onValidationResult(checkForValidationError);
    }
}
