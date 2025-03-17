package com.ingka.ikea.app.scanandgoonlineredesign.dialog;

import Fz.g;
import Lg.d;
import Vi.C10979t;
import Vi.C10980u;
import Vi.C10981v;
import Vi.C10982w;
import XH.C16796C;
import YH.C16877v;
import aA.C13909a;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5197z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.f;
import lj.C11539f;
import lj.C11540g;
import nI.C17642l;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 C2\u00020\u0001:\u0001DB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\"\u0010)\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010=\u001a\u00020\n8\u0014XD¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\bR\u0014\u0010B\u001a\u0002058BX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/ConfirmCollectQuantityDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "LXH/N;", "E0", "LFz/g;", "A0", "()LFz/g;", "D0", "", "overrideCartQuantity", "z0", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "y0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "LaA/a;", "P", "LaA/a;", "getSessionManager", "()LaA/a;", "setSessionManager", "(LaA/a;)V", "sessionManager", "LSy/a;", "Q", "LSy/a;", "getAnalytics$scanandgo_implementation_release", "()LSy/a;", "setAnalytics$scanandgo_implementation_release", "(LSy/a;)V", "analytics", "R", "LFz/g;", "_binding", "LLg/d;", "S", "LLg/d;", "_delegatingAdapter", "T", "Z", "t0", "()Z", "drawUnderStatusBar", "w0", "binding", "x0", "()LLg/d;", "delegatingAdapter", "U", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfirmCollectQuantityDialog extends a {

    /* renamed from: U  reason: collision with root package name */
    public static final a f91316U = new a((DefaultConstructorMarker) null);

    /* renamed from: X  reason: collision with root package name */
    public static final int f91317X = 8;

    /* renamed from: P  reason: collision with root package name */
    public C13909a f91318P;

    /* renamed from: Q  reason: collision with root package name */
    public Sy.a f91319Q;

    /* renamed from: R  reason: collision with root package name */
    private g f91320R;

    /* renamed from: S  reason: collision with root package name */
    private d f91321S;

    /* renamed from: T  reason: collision with root package name */
    private final boolean f91322T = true;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/ConfirmCollectQuantityDialog$a;", "", "<init>", "()V", "", "title", "description", "imageUrl", "", "quantity", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/ConfirmCollectQuantityDialog;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/ConfirmCollectQuantityDialog;", "Landroid/os/Bundle;", "bundle", "", "b", "(Landroid/os/Bundle;)Z", "REQUEST_CODE", "Ljava/lang/String;", "RESULT_OVERRIDE_QUANTITY", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConfirmCollectQuantityDialog a(String str, String str2, String str3, int i10) {
            C17542s.j(str, "title");
            C17542s.j(str2, "description");
            C17542s.j(str3, "imageUrl");
            ConfirmCollectQuantityDialog confirmCollectQuantityDialog = new ConfirmCollectQuantityDialog();
            confirmCollectQuantityDialog.setArguments(D2.d.b(C16796C.a("ARG_TITLE", str), C16796C.a("ARG_DESCRIPTION", str2), C16796C.a("ARG_IMAGE_URL", str3), C16796C.a("ARG_QUANTITY", Integer.valueOf(i10))));
            return confirmCollectQuantityDialog;
        }

        public final boolean b(Bundle bundle) {
            C17542s.j(bundle, "bundle");
            return bundle.getBoolean("CCQD_OVERRIDE_QUANTITY");
        }

        private a() {
        }
    }

    private final g A0() {
        g w02 = w0();
        w02.f110122b.setOnClickListener(new C11539f(this));
        w02.f110123c.setOnClickListener(new C11540g(this));
        return w02;
    }

    /* access modifiers changed from: private */
    public static final void B0(ConfirmCollectQuantityDialog confirmCollectQuantityDialog, View view) {
        confirmCollectQuantityDialog.z0(false);
        confirmCollectQuantityDialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void C0(ConfirmCollectQuantityDialog confirmCollectQuantityDialog, View view) {
        confirmCollectQuantityDialog.z0(true);
        confirmCollectQuantityDialog.dismiss();
    }

    private final void D0() {
        Bundle requireArguments = requireArguments();
        C17542s.i(requireArguments, "requireArguments(...)");
        String string = requireArguments.getString("ARG_TITLE", "");
        String string2 = requireArguments.getString("ARG_DESCRIPTION", "");
        String string3 = requireArguments.getString("ARG_IMAGE_URL", "");
        int i10 = requireArguments.getInt("ARG_QUANTITY");
        List c10 = C16877v.c();
        c10.add(C10980u.f88638a);
        C17542s.g(string);
        C17542s.g(string2);
        C17542s.g(string3);
        c10.add(new C10982w(string, string2, string3, i10));
        d.q(x0(), C16877v.a(c10), false, (C17642l) null, 6, (Object) null);
    }

    private final void E0() {
        this.f91321S = new d((Lg.a<?>[]) new Lg.a[]{new C10979t(), new C10981v()});
        RecyclerView recyclerView = w0().f110124d;
        recyclerView.setAdapter(x0());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    private final g w0() {
        g gVar = this.f91320R;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final d x0() {
        d dVar = this.f91321S;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void z0(boolean z10) {
        C5197z.c(this, "CCQD_REQUEST_CODE", D2.d.b(C16796C.a("CCQD_OVERRIDE_QUANTITY", Boolean.valueOf(z10))));
    }

    public void onCancel(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        z0(false);
        super.onCancel(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, f.f75301m);
    }

    public void onDestroyView() {
        this.f91321S = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        E0();
        A0();
        D0();
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f91322T;
    }

    /* renamed from: y0 */
    public ConstraintLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        g c10 = g.c(layoutInflater, viewGroup, false);
        this.f91320R = c10;
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }
}
