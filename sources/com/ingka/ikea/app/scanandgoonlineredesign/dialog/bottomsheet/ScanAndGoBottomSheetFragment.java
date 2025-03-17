package com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet;

import HJ.C15854t;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16877v;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import com.sugarcube.core.logger.DslKt;
import ip.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import l3.a;
import mj.C11574a;
import mj.C11575b;
import mj.C11576c;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nj.C11607A;
import nj.C11615I;
import oj.C11680a;
import oj.C11681b;
import oj.i;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import uI.C18064m;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\bH\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006*²\u0006\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\nX\u0002"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/ScanAndGoBottomSheetFragment;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "Lnj/A;", "N0", "()Lnj/A;", "M0", "LXH/N;", "S0", "Loj/a;", "event", "R0", "(Loj/a;)V", "U0", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;", "actionType", "T0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;)V", "B0", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/b;", "R", "LXH/o;", "P0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/b;", "viewModel", "Loj/i;", "S", "LXo/a;", "O0", "()Loj/i;", "bottomSheetType", "T", "a", "", "Loj/b;", "content", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoBottomSheetFragment extends BottomSheetComposeDialogFragment {

    /* renamed from: T  reason: collision with root package name */
    public static final a f91342T = new a((DefaultConstructorMarker) null);

    /* renamed from: U  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f91343U = {P.h(new G(ScanAndGoBottomSheetFragment.class, "bottomSheetType", "getBottomSheetType()Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/model/ScanAndGoBottomSheetType;", 0))};

    /* renamed from: X  reason: collision with root package name */
    public static final int f91344X = 8;

    /* renamed from: R  reason: collision with root package name */
    private final C16824o f91345R;

    /* renamed from: S  reason: collision with root package name */
    private final Xo.a f91346S = new Xo.a("ScanAndGoBottomSheetFragment.ARG_BOTTOM_SHEET_TYPE");

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0010\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u000e*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001a\u001a\u00020\u000e*\u00020\u00152\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u000e*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u0019J/\u0010\"\u001a\u00020\u000e*\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00162\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00162\b\b\u0003\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u00020\u000e*\u00020\u0015¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00168\u0006XT¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00168\u0002XT¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u00168\u0002XT¢\u0006\u0006\n\u0004\b)\u0010'¨\u0006*"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/ScanAndGoBottomSheetFragment$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;", "b", "(Landroid/os/Bundle;)Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;", "Landroidx/lifecycle/y;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lkotlin/Function2;", "Loj/i;", "LXH/N;", "onDismiss", "d", "(Landroidx/lifecycle/y;Landroidx/fragment/app/FragmentManager;LnI/p;)V", "bottomSheetType", "k", "(Landroidx/fragment/app/FragmentManager;Loj/i;)V", "Landroidx/fragment/app/o;", "", "scannedBarcode", "i", "(Landroidx/fragment/app/o;Ljava/lang/String;)V", "c", "(Landroidx/fragment/app/o;LnI/p;)V", "articleNumber", "h", "text", "title", "", "icon", "f", "(Landroidx/fragment/app/o;Ljava/lang/String;Ljava/lang/String;I)V", "j", "(Landroidx/fragment/app/o;)V", "REQUEST_KEY", "Ljava/lang/String;", "KEY_BOTTOM_SHEET_TYPE", "RESULT_KEY_BOTTOM_SHEET_ACTION", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final a b(Bundle bundle) {
            a aVar = (a) bundle.getParcelable("ScanAndGoBottomSheetFragment.KEY_BOTTOM_SHEET_ACTION");
            if (aVar != null) {
                return aVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("action type was not provided in result");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalStateException, str3);
                str = str3;
                str2 = str4;
            }
            return a.C2000a.f91360a;
        }

        private final void d(C5221y yVar, FragmentManager fragmentManager, p<? super i, ? super a, C16807N> pVar) {
            fragmentManager.R1("ScanAndGoBottomSheetFragment.REQUEST_KEY", yVar, new C11575b(yVar, pVar));
        }

        /* access modifiers changed from: private */
        public static final void e(C5221y yVar, p pVar, String str, Bundle bundle) {
            C17542s.j(str, "<unused var>");
            C17542s.j(bundle, "bundle");
            i iVar = (i) bundle.getParcelable("ScanAndGoBottomSheetFragment.ARG_BOTTOM_SHEET_TYPE");
            if (iVar != null) {
                pVar.invoke(iVar, ScanAndGoBottomSheetFragment.f91342T.b(bundle));
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("type was not provided in result");
            qv.e eVar = qv.e.ERROR;
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
                    String name = yVar.getClass().getName();
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

        public static /* synthetic */ void g(a aVar, C5187o oVar, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            aVar.f(oVar, str, str2, i10);
        }

        private final void k(FragmentManager fragmentManager, i iVar) {
            ScanAndGoBottomSheetFragment scanAndGoBottomSheetFragment = new ScanAndGoBottomSheetFragment();
            scanAndGoBottomSheetFragment.setArguments(D2.d.b(C16796C.a("ScanAndGoBottomSheetFragment.ARG_BOTTOM_SHEET_TYPE", iVar)));
            scanAndGoBottomSheetFragment.show(fragmentManager, (String) null);
        }

        public final void c(C5187o oVar, p<? super i, ? super a, C16807N> pVar) {
            C17542s.j(oVar, "<this>");
            C17542s.j(pVar, "onDismiss");
            FragmentManager parentFragmentManager = oVar.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
            d(oVar, parentFragmentManager, pVar);
        }

        public final void f(C5187o oVar, String str, String str2, int i10) {
            C17542s.j(oVar, "<this>");
            C17542s.j(str, "text");
            FragmentManager parentFragmentManager = oVar.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
            k(parentFragmentManager, new i.b(i10, str, str2));
        }

        public final void h(C5187o oVar, String str) {
            C17542s.j(oVar, "<this>");
            C17542s.j(str, "articleNumber");
            FragmentManager parentFragmentManager = oVar.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
            k(parentFragmentManager, new i.c(str));
        }

        public final void i(C5187o oVar, String str) {
            C17542s.j(oVar, "<this>");
            C17542s.j(str, "scannedBarcode");
            FragmentManager parentFragmentManager = oVar.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
            k(parentFragmentManager, new i.d(str));
        }

        public final void j(C5187o oVar) {
            C17542s.j(oVar, "<this>");
            FragmentManager parentFragmentManager = oVar.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
            k(parentFragmentManager, i.a.f100430a);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0006R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/ScanAndGoBottomSheetFragment$b", "Lnj/A;", "Lkotlin/Function0;", "LXH/N;", "a", "LnI/a;", "()LnI/a;", "onPrimaryButtonClick", "b", "c", "onSecondaryButtonClick", "Lkotlin/Function1;", "Loj/a;", "LnI/l;", "()LnI/l;", "onAnalyticsEvent", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C11607A {

        /* renamed from: a  reason: collision with root package name */
        private final C17631a<C16807N> f91347a;

        /* renamed from: b  reason: collision with root package name */
        private final C17631a<C16807N> f91348b;

        /* renamed from: c  reason: collision with root package name */
        private final C17642l<C11680a, C16807N> f91349c;

        b(ScanAndGoBottomSheetFragment scanAndGoBottomSheetFragment) {
            this.f91347a = new C11576c(scanAndGoBottomSheetFragment);
            this.f91348b = new mj.d(scanAndGoBottomSheetFragment);
            this.f91349c = new mj.e(scanAndGoBottomSheetFragment);
        }

        /* access modifiers changed from: private */
        public static final C16807N g(ScanAndGoBottomSheetFragment scanAndGoBottomSheetFragment, C11680a aVar) {
            C17542s.j(aVar, "it");
            scanAndGoBottomSheetFragment.R0(aVar);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(ScanAndGoBottomSheetFragment scanAndGoBottomSheetFragment) {
            scanAndGoBottomSheetFragment.S0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(ScanAndGoBottomSheetFragment scanAndGoBottomSheetFragment) {
            scanAndGoBottomSheetFragment.T0(a.c.f91364a);
            return C16807N.f139792a;
        }

        public C17631a<C16807N> a() {
            return this.f91347a;
        }

        public C17642l<C11680a, C16807N> b() {
            return this.f91349c;
        }

        public C17631a<C16807N> c() {
            return this.f91348b;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0006R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/ScanAndGoBottomSheetFragment$c", "Lnj/A;", "Lkotlin/Function0;", "LXH/N;", "a", "LnI/a;", "()LnI/a;", "onPrimaryButtonClick", "b", "c", "onSecondaryButtonClick", "Lkotlin/Function1;", "Loj/a;", "LnI/l;", "()LnI/l;", "onAnalyticsEvent", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C11607A {

        /* renamed from: a  reason: collision with root package name */
        private final C17631a<C16807N> f91350a;

        /* renamed from: b  reason: collision with root package name */
        private final C17631a<C16807N> f91351b;

        /* renamed from: c  reason: collision with root package name */
        private final C17642l<C11680a, C16807N> f91352c;

        c(ScanAndGoBottomSheetFragment scanAndGoBottomSheetFragment) {
            this.f91350a = new mj.f(scanAndGoBottomSheetFragment);
            this.f91352c = new mj.g(scanAndGoBottomSheetFragment);
        }

        /* access modifiers changed from: private */
        public static final C16807N f(ScanAndGoBottomSheetFragment scanAndGoBottomSheetFragment, C11680a aVar) {
            C17542s.j(aVar, "it");
            scanAndGoBottomSheetFragment.R0(aVar);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N g(ScanAndGoBottomSheetFragment scanAndGoBottomSheetFragment) {
            scanAndGoBottomSheetFragment.S0();
            return C16807N.f139792a;
        }

        public C17631a<C16807N> a() {
            return this.f91350a;
        }

        public C17642l<C11680a, C16807N> b() {
            return this.f91352c;
        }

        public C17631a<C16807N> c() {
            return this.f91351b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91353c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f91353c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f91353c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91354c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f91354c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f91354c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f91355c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f91355c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f91355c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91356c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91357d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f91356c = aVar;
            this.f91357d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f91356c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f91357d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91358c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91359d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f91358c = oVar;
            this.f91359d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f91359d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f91358c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ScanAndGoBottomSheetFragment() {
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f91345R = W.b(this, P.b(b.class), new f(a10), new g((C17631a) null, a10), new h(this, a10));
    }

    private static final List<C11681b> I0(A1<? extends List<? extends C11681b>> a12) {
        return (List) a12.getValue();
    }

    private final C11607A M0() {
        return new b(this);
    }

    private final C11607A N0() {
        return O0() instanceof i.a ? M0() : new c(this);
    }

    private final i O0() {
        return (i) this.f91346S.a(this, f91343U[0]);
    }

    private final b P0() {
        return (b) this.f91345R.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N Q0(ScanAndGoBottomSheetFragment scanAndGoBottomSheetFragment, List list) {
        C17542s.j(list, "content");
        if (!list.isEmpty()) {
            scanAndGoBottomSheetFragment.x0();
        } else {
            scanAndGoBottomSheetFragment.w0();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void R0(C11680a aVar) {
        P0().F(aVar);
    }

    /* access modifiers changed from: private */
    public final void S0() {
        T0(a.b.f91362a);
    }

    /* access modifiers changed from: private */
    public final void T0(a aVar) {
        P0().H(aVar);
        U0();
    }

    private final void U0() {
        w0();
    }

    /* access modifiers changed from: protected */
    public void B0() {
        P0().E(O0());
        F<List<C11681b>> D10 = P0().D();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        j.a(D10, viewLifecycleOwner, new C11574a(this));
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        return new BottomSheetComposeDialogFragment.a("ScanAndGoBottomSheetFragment.REQUEST_KEY", D2.d.b(C16796C.a("ScanAndGoBottomSheetFragment.ARG_BOTTOM_SHEET_TYPE", O0()), C16796C.a("ScanAndGoBottomSheetFragment.KEY_BOTTOM_SHEET_ACTION", P0().C().getValue())));
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(909106917);
        if (C4895p.J()) {
            C4895p.S(909106917, i10, -1, "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetFragment.BottomSheetContent (ScanAndGoBottomSheetFragment.kt:50)");
        }
        C11615I.o(I0(d1.b.b(P0().D(), C16877v.n(), mVar, 48)), N0(), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
