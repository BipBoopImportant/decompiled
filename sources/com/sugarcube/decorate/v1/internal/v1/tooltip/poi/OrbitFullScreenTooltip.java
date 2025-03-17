package com.sugarcube.decorate.v1.internal.v1.tooltip.poi;

import EK.C15673a;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import c1.c;
import com.sugarcube.common.R;
import dG.C17156c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5607m;
import nI.C17631a;
import nI.p;
import tK.Z;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/tooltip/poi/OrbitFullScreenTooltip;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrbitFullScreenTooltip extends DialogFragment {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OrbitFullScreenTooltip f142283a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v1.internal.v1.tooltip.poi.OrbitFullScreenTooltip$a$a  reason: collision with other inner class name */
        static final class C3471a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ OrbitFullScreenTooltip f142284a;

            C3471a(OrbitFullScreenTooltip orbitFullScreenTooltip) {
                this.f142284a = orbitFullScreenTooltip;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(OrbitFullScreenTooltip orbitFullScreenTooltip) {
                orbitFullScreenTooltip.dismiss();
                return C16807N.f139792a;
            }

            public final void b(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1520769793, i10, -1, "com.sugarcube.decorate.v1.internal.v1.tooltip.poi.OrbitFullScreenTooltip.onCreateView.<anonymous>.<anonymous>.<anonymous> (OrbitFullScreenTooltip.kt:34)");
                    }
                    mVar.W(-1995744437);
                    boolean V10 = mVar.V(this.f142284a);
                    OrbitFullScreenTooltip orbitFullScreenTooltip = this.f142284a;
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new a(orbitFullScreenTooltip);
                        mVar.u(D10);
                    }
                    mVar.P();
                    C17156c.c((C17631a) D10, mVar, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        a(OrbitFullScreenTooltip orbitFullScreenTooltip) {
            this.f142283a = orbitFullScreenTooltip;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(977138813, i10, -1, "com.sugarcube.decorate.v1.internal.v1.tooltip.poi.OrbitFullScreenTooltip.onCreateView.<anonymous>.<anonymous> (OrbitFullScreenTooltip.kt:33)");
                }
                Z.g(C5607m.a(mVar, 0), C15673a.a(), c.e(-1520769793, true, new C3471a(this.f142283a), mVar, 54), mVar, 384, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        setStyle(2, R.style.FullscreenDialog);
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C17542s.i(onCreateDialog, "onCreateDialog(...)");
        return onCreateDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(c.c(977138813, true, new a(this)));
        return composeView;
    }
}
