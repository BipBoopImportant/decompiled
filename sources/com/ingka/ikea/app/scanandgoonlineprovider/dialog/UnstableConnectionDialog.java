package com.ingka.ikea.app.scanandgoonlineprovider.dialog;

import Ae.e;
import Ae.j;
import EB.C12832d;
import FB.C12860a;
import Fz.l;
import XH.C16796C;
import YH.X;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5197z;
import com.ingka.ikea.analytics.Interaction$Component;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020(8BX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineprovider/dialog/UnstableConnectionDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "<init>", "()V", "LXH/N;", "D0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/constraintlayout/widget/ConstraintLayout;", "B0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "onDismiss", "LAe/e;", "O", "LAe/e;", "y0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LFB/a;", "P", "LFB/a;", "A0", "()LFB/a;", "setLocalStoreSelectionRepository", "(LFB/a;)V", "localStoreSelectionRepository", "LFz/l;", "Q", "LFz/l;", "_binding", "z0", "()LFz/l;", "binding", "R", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnstableConnectionDialog extends Hilt_UnstableConnectionDialog {

    /* renamed from: R  reason: collision with root package name */
    public static final a f91165R = new a((DefaultConstructorMarker) null);

    /* renamed from: S  reason: collision with root package name */
    public static final int f91166S = 8;

    /* renamed from: O  reason: collision with root package name */
    public e f91167O;

    /* renamed from: P  reason: collision with root package name */
    public C12860a f91168P;

    /* renamed from: Q  reason: collision with root package name */
    private l f91169Q;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineprovider/dialog/UnstableConnectionDialog$a;", "", "<init>", "()V", "", "FRAGMENT_RESULT_KEY_NO_CONNECTION_DIALOG", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final void C0(UnstableConnectionDialog unstableConnectionDialog, View view) {
        unstableConnectionDialog.dismiss();
    }

    private final void D0() {
        C12832d c10 = A0().c();
        String e10 = c10 != null ? c10.e() : null;
        if (e10 == null) {
            e10 = "";
        }
        e.c.c(y0(), j.SHOP_AND_GO_VIEWED.b(), X.f(C16796C.a("store_id", e10)), Interaction$Component.SHOP_AND_GO_NO_CONNECTION, (e.b) null, 8, (Object) null);
    }

    private final l z0() {
        l lVar = this.f91169Q;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final C12860a A0() {
        C12860a aVar = this.f91168P;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("localStoreSelectionRepository");
        return null;
    }

    /* renamed from: B0 */
    public ConstraintLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        l c10 = l.c(layoutInflater, viewGroup, false);
        this.f91169Q = c10;
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        Bundle bundle = Bundle.EMPTY;
        C17542s.i(bundle, "EMPTY");
        C5197z.c(this, "fr_res_key_no_connection", bundle);
        super.onCancel(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        Bundle bundle = Bundle.EMPTY;
        C17542s.i(bundle, "EMPTY");
        C5197z.c(this, "fr_res_key_no_connection", bundle);
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        D0();
        z0().f110148c.setOnClickListener(new Ti.e(this));
    }

    public final e y0() {
        e eVar = this.f91167O;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }
}
