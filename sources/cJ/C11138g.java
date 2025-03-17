package cj;

import D2.d;
import XH.C16796C;
import XH.C16807N;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5221y;
import com.ingka.ikea.app.scanandgoonlineredesign.checkout.confirmationdialog.CloseOrderConfirmationDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcj/g;", "Lcj/e;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "hasOrder", "LXH/N;", "b", "(Landroidx/fragment/app/FragmentManager;Z)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function0;", "action", "a", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/y;LnI/a;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cj.g  reason: case insensitive filesystem */
public final class C11138g implements C11136e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f90759a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcj/g$a;", "", "<init>", "()V", "", "HAS_ORDER_KEY", "Ljava/lang/String;", "FRAGMENT_REQUEST_KEY_CONFIRMED", "BUNDLE_KEY_CONFIRMATION_RESULT", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cj.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final void d(C17631a aVar, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        if (bundle.getBoolean("fr_bundle_key_conf_result", false)) {
            aVar.invoke();
        }
    }

    public void a(FragmentManager fragmentManager, C5221y yVar, C17631a<C16807N> aVar) {
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(aVar, "action");
        fragmentManager.R1("fr_req_key_confirmed", yVar, new C11137f(aVar));
    }

    public void b(FragmentManager fragmentManager, boolean z10) {
        C17542s.j(fragmentManager, "fragmentManager");
        CloseOrderConfirmationDialog closeOrderConfirmationDialog = new CloseOrderConfirmationDialog();
        closeOrderConfirmationDialog.setArguments(d.b(C16796C.a("hasOrder", Boolean.valueOf(z10))));
        closeOrderConfirmationDialog.show(fragmentManager, "CloseOrderConfirmationDialog");
    }
}
