package com.ingka.ikea.app.scanandgoonlineredesign.scanner.permission;

import Gj.g;
import HJ.C15854t;
import XH.C16807N;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5221y;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.permission.RationalePermissionPromptNavigation;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/d;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "LXH/N;", "b", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result;", "onResult", "a", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/y;LnI/l;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements RationalePermissionPromptNavigation {
    /* access modifiers changed from: private */
    public static final void d(d dVar, C17642l lVar, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        RationalePermissionPromptNavigation.Result result = (RationalePermissionPromptNavigation.Result) bundle.getParcelable("RationalePermissionPromptNavigation.Bundle.Key");
        if (result != null) {
            lVar.invoke(result);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Bundle was not provided in result");
        e eVar = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 != null) {
                    str2 = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str4 = str2;
            if (str3 == null) {
                String name = dVar.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, illegalStateException, str4);
            str2 = str4;
            str3 = str5;
        }
    }

    public void a(FragmentManager fragmentManager, C5221y yVar, C17642l<? super RationalePermissionPromptNavigation.Result, C16807N> lVar) {
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(lVar, "onResult");
        fragmentManager.R1("RationalePermissionPromptNavigation.RequestKey", yVar, new g(this, lVar));
    }

    public void b(FragmentManager fragmentManager) {
        C17542s.j(fragmentManager, "fragmentManager");
        new RationalePermissionPromptDialogFragment().show(fragmentManager, "RationalePermissionPromptDialogFragment.TAG");
    }
}
