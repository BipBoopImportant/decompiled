package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f19427a;

    private a(AutofillId autofillId) {
        this.f19427a = autofillId;
    }

    public static a b(AutofillId autofillId) {
        return new a(autofillId);
    }

    public AutofillId a() {
        return (AutofillId) this.f19427a;
    }
}
