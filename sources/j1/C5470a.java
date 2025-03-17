package j1;

import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lj1/a;", "Lj1/d;", "Landroid/view/View;", "view", "Lj1/i;", "autofillTree", "<init>", "(Landroid/view/View;Lj1/i;)V", "a", "Landroid/view/View;", "c", "()Landroid/view/View;", "b", "Lj1/i;", "()Lj1/i;", "Landroid/view/autofill/AutofillManager;", "Landroid/view/autofill/AutofillManager;", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j1.a  reason: case insensitive filesystem */
public final class C5470a implements C5473d {

    /* renamed from: a  reason: collision with root package name */
    private final View f24668a;

    /* renamed from: b  reason: collision with root package name */
    private final C5478i f24669b;

    /* renamed from: c  reason: collision with root package name */
    private final AutofillManager f24670c;

    public C5470a(View view, C5478i iVar) {
        this.f24668a = view;
        this.f24669b = iVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f24670c = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }

    public final AutofillManager a() {
        return this.f24670c;
    }

    public final C5478i b() {
        return this.f24669b;
    }

    public final View c() {
        return this.f24668a;
    }
}
