package com.ingka.ikea.app.scanandgoonlineredesign.coupon.navigation;

import D2.d;
import XH.C16796C;
import XH.C16807N;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5221y;
import com.ingka.ikea.app.scanandgoonlineredesign.coupon.navigation.AddCouponBottomSheetNavigation;
import com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.AddCouponBottomSheet;
import gj.C11296g;
import hj.C11365a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lgj/g;", "scannerCouponResult", "LXH/N;", "a", "(Landroidx/fragment/app/FragmentManager;Lgj/g;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult;", "onResult", "b", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/y;LnI/l;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements AddCouponBottomSheetNavigation {
    /* access modifiers changed from: private */
    public static final void d(C17642l lVar, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        Object obj = (AddCouponBottomSheetNavigation.NavigationResult) bundle.getParcelable("AddCouponBottomSheet.ResultKey");
        if (obj == null) {
            obj = AddCouponBottomSheetNavigation.NavigationResult.b.f91272a;
        }
        lVar.invoke(obj);
    }

    public void a(FragmentManager fragmentManager, C11296g gVar) {
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(gVar, "scannerCouponResult");
        AddCouponBottomSheet addCouponBottomSheet = new AddCouponBottomSheet();
        addCouponBottomSheet.setArguments(d.b(C16796C.a("AddCouponBottomSheet.Arg.Key", gVar.a()), C16796C.a("AddCouponBottomSheet.Arg.ScanType", gVar.b().a())));
        addCouponBottomSheet.show(fragmentManager, "AddCouponBottomSheet.TAG");
    }

    public void b(FragmentManager fragmentManager, C5221y yVar, C17642l<? super AddCouponBottomSheetNavigation.NavigationResult, C16807N> lVar) {
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(lVar, "onResult");
        fragmentManager.R1("AddCouponBottomSheet.RequestKey", yVar, new C11365a(lVar));
    }
}
