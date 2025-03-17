package com.ingka.ikea.account.impl.modalsettings.editprofile;

import Sd.g;
import Vd.a;
import XH.C16824o;
import XH.C16825p;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ingka.ikea.core.android.fragments.BaseDialogFragment;
import fe.C9709a;
import fe.C9710b;
import jC.C14615b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.f;
import x4.C8951o;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J!\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u001a\u0010\u001a\u001a\u00020\u00158\u0014XD¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001e\u001a\u00020\u00158FX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u001f8BX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/editprofile/DeletedConfirmationFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LXH/N;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "M", "Z", "t0", "()Z", "drawUnderStatusBar", "N", "LXH/o;", "x0", "success", "LVd/a;", "O", "LVd/a;", "_binding", "w0", "()LVd/a;", "binding", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeletedConfirmationFragment extends BaseDialogFragment {

    /* renamed from: M  reason: collision with root package name */
    private final boolean f69754M = true;

    /* renamed from: N  reason: collision with root package name */
    private final C16824o f69755N = C16825p.b(new C9710b(this));

    /* renamed from: O  reason: collision with root package name */
    private a f69756O;

    private final a w0() {
        a aVar = this.f69756O;
        C17542s.g(aVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    public static final void y0(DeletedConfirmationFragment deletedConfirmationFragment, View view) {
        if (deletedConfirmationFragment.x0()) {
            C8951o.o0(androidx.navigation.fragment.a.a(deletedConfirmationFragment), "profile/account/page", true, false, 4, (Object) null);
        } else {
            androidx.navigation.fragment.a.a(deletedConfirmationFragment).k0();
        }
    }

    /* access modifiers changed from: private */
    public static final boolean z0(DeletedConfirmationFragment deletedConfirmationFragment) {
        return deletedConfirmationFragment.requireArguments().getBoolean("success");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, f.f75301m);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        this.f69756O = a.c(layoutInflater, viewGroup, false);
        ConstraintLayout b10 = w0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        this.f69756O = null;
        super.onDestroyView();
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        WindowManager.LayoutParams attributes;
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Z().a().a(x0() ? C14615b.e.f127859b : C14615b.c.f127858b);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null || (attributes = window.getAttributes()) == null)) {
            attributes.windowAnimations = g.f63387a;
        }
        setCancelable(false);
        if (!x0()) {
            w0().f64509b.setText(getString(Sd.f.f63368h));
            w0().f64510c.setText(getString(Sd.f.f63367g));
        }
        w0().f64511d.setOnClickListener(new C9709a(this));
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f69754M;
    }

    public final boolean x0() {
        return ((Boolean) this.f69755N.getValue()).booleanValue();
    }
}
