package cj;

import Qy.a;
import XH.C16807N;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5221y;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.CheckoutConfirmationDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcj/i;", "LQy/a;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "LXH/N;", "b", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function1;", "", "onDismiss", "a", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/y;LnI/l;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cj.i  reason: case insensitive filesystem */
public final class C11140i implements a {
    /* access modifiers changed from: private */
    public static final void d(C17642l lVar, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        lVar.invoke(Boolean.valueOf(bundle.getBoolean("fr_bundle_key_result", false)));
    }

    public void a(FragmentManager fragmentManager, C5221y yVar, C17642l<? super Boolean, C16807N> lVar) {
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(lVar, "onDismiss");
        fragmentManager.R1("fr_req_key_acknowledge", yVar, new C11139h(lVar));
    }

    public void b(FragmentManager fragmentManager) {
        C17542s.j(fragmentManager, "fragmentManager");
        new CheckoutConfirmationDialog().show(fragmentManager, "CheckoutConfirmationDialog");
    }
}
