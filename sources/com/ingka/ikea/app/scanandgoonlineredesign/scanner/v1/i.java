package com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1;

import Ar.j;
import Hj.G;
import Hj.H;
import Hj.I;
import Hj.J;
import IC.C13023e;
import Iz.C13043i;
import Oo.b;
import Uj.C10959b;
import XH.C16807N;
import XH.t;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C5187o;
import com.google.android.material.snackbar.Snackbar;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import rw.f;
import sj.C11853d;
import x4.C8951o;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/i;", "", "LAr/j;", "feedback", "<init>", "(LAr/j;)V", "Landroidx/fragment/app/o;", "fragment", "Landroid/view/View;", "rootView", "anchorView", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e$c;", "userMessage", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;", "viewModel", "Lcom/google/android/material/snackbar/Snackbar;", "h", "(Landroidx/fragment/app/o;Landroid/view/View;Landroid/view/View;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e$c;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;)Lcom/google/android/material/snackbar/Snackbar;", "", "destId", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e$b;", "LXH/N;", "f", "(Ljava/lang/String;Landroidx/fragment/app/o;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e$b;)V", "LUj/b;", "cartButtonViewModel", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e$a;", "e", "(Landroidx/fragment/app/o;LUj/b;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e$a;)V", "a", "LAr/j;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final j f92226a;

    public i(j jVar) {
        C17542s.j(jVar, "feedback");
        this.f92226a = jVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C5187o oVar, String str) {
        C8951o f10 = f.f(oVar, str, (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C13043i.a(f10);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(f fVar, d dVar) {
        fVar.U(dVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(f fVar, e.c cVar, j.b bVar) {
        C17542s.j(bVar, "it");
        fVar.U(cVar.c());
        return C16807N.f139792a;
    }

    public final void e(C5187o oVar, C10959b bVar, e.a aVar) {
        String str;
        C17542s.j(oVar, "fragment");
        C17542s.j(bVar, "cartButtonViewModel");
        C17542s.j(aVar, "userMessage");
        if (aVar instanceof e.a.b) {
            bVar.D(C10959b.a.PostponeBadgeUpdates);
            ScanAndGoBottomSheetFragment.f91342T.i(oVar, ((e.a.b) aVar).d());
        } else if (aVar instanceof e.a.C2039e) {
            ScanAndGoBottomSheetFragment.f91342T.h(oVar, ((e.a.C2039e) aVar).d());
        } else if (C17542s.e(aVar, e.a.C2038a.f92167a)) {
            ScanAndGoBottomSheetFragment.f91342T.j(oVar);
        } else if (C17542s.e(aVar, e.a.f.f92171a) || C17542s.e(aVar, e.a.g.f92176a) || C17542s.e(aVar, e.a.h.f92179a) || C17542s.e(aVar, e.a.i.f92180a) || C17542s.e(aVar, e.a.d.f92169a)) {
            ScanAndGoBottomSheetFragment.a aVar2 = ScanAndGoBottomSheetFragment.f91342T;
            int icon = aVar.getIcon();
            C13023e title = aVar.getTitle();
            if (title != null) {
                Context requireContext = oVar.requireContext();
                C17542s.i(requireContext, "requireContext(...)");
                str = title.b(requireContext);
            } else {
                str = null;
            }
            C13023e message = aVar.getMessage();
            Context requireContext2 = oVar.requireContext();
            C17542s.i(requireContext2, "requireContext(...)");
            aVar2.f(oVar, message.b(requireContext2), str, icon);
        } else {
            throw new t();
        }
    }

    public final void f(String str, C5187o oVar, e.b bVar) {
        C17542s.j(str, "destId");
        C17542s.j(oVar, "fragment");
        C17542s.j(bVar, "userMessage");
        if (C17542s.e(bVar, e.b.a.f92183a)) {
            j jVar = this.f92226a;
            Context requireContext = oVar.requireContext();
            C17542s.i(requireContext, "requireContext(...)");
            C11853d.j(jVar, requireContext, new G(oVar, str));
            return;
        }
        throw new t();
    }

    public final Snackbar h(C5187o oVar, View view, View view2, e.c cVar, f fVar) {
        e.c cVar2 = cVar;
        f fVar2 = fVar;
        C5187o oVar2 = oVar;
        C17542s.j(oVar, "fragment");
        View view3 = view;
        C17542s.j(view, "rootView");
        C17542s.j(view2, "anchorView");
        C17542s.j(cVar2, "userMessage");
        C17542s.j(fVar2, "viewModel");
        j jVar = this.f92226a;
        C13023e a10 = cVar.a();
        Context requireContext = oVar.requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        String b10 = a10.b(requireContext);
        String string = cVar.b() != null ? oVar.requireContext().getString(b.f84330B2) : null;
        d b11 = cVar.b();
        return j.a.s(jVar, view, b10, string, 0, view2, b11 != null ? new H(fVar2, b11) : new I(), new J(fVar2, cVar2), 8, (Object) null);
    }
}
