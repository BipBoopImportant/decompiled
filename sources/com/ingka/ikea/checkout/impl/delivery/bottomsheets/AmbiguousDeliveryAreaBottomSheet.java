package com.ingka.ikea.checkout.impl.delivery.bottomsheets;

import Ae.e;
import D2.d;
import HJ.C15854t;
import KJ.C15985a;
import KJ.C15987c;
import Nn.C10802e;
import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import U0.P;
import XH.C16796C;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.fragment.app.C5197z;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import fo.C11278a;
import go.C11317a;
import go.C11322f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002XD¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/AmbiguousDeliveryAreaBottomSheet;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "LXH/N;", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "onResume", "LAe/e;", "U", "LAe/e;", "K0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "", "X", "Ljava/lang/String;", "viewName", "", "Y", "Z", "hasSetResultValue", "b", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AmbiguousDeliveryAreaBottomSheet extends a {

    /* renamed from: Z  reason: collision with root package name */
    public static final b f94463Z = new b((DefaultConstructorMarker) null);

    /* renamed from: y0  reason: collision with root package name */
    public static final int f94464y0 = 8;

    /* renamed from: U  reason: collision with root package name */
    public e f94465U;

    /* renamed from: X  reason: collision with root package name */
    private final String f94466X = "AmbiguousStateBottomSheet";

    /* renamed from: Y  reason: collision with root package name */
    private boolean f94467Y;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.checkout.impl.delivery.bottomsheets.AmbiguousDeliveryAreaBottomSheet$BottomSheetContent$3$1", f = "AmbiguousDeliveryAreaBottomSheet.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f94468c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AmbiguousDeliveryAreaBottomSheet f94469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AmbiguousDeliveryAreaBottomSheet ambiguousDeliveryAreaBottomSheet, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f94469d = ambiguousDeliveryAreaBottomSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f94469d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f94468c == 0) {
                y.b(obj);
                this.f94469d.x0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/AmbiguousDeliveryAreaBottomSheet$b;", "", "<init>", "()V", "LNn/e$a;", "ambiguousDeliveryAreaError", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/AmbiguousDeliveryAreaBottomSheet;", "a", "(LNn/e$a;)Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/AmbiguousDeliveryAreaBottomSheet;", "", "TAG", "Ljava/lang/String;", "AMBIGUOUS_DELIVERY_AREA_ERROR_KEY", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AmbiguousDeliveryAreaBottomSheet a(C10802e.a aVar) {
            C17542s.j(aVar, "ambiguousDeliveryAreaError");
            AmbiguousDeliveryAreaBottomSheet ambiguousDeliveryAreaBottomSheet = new AmbiguousDeliveryAreaBottomSheet();
            ambiguousDeliveryAreaBottomSheet.setArguments(d.b(C16796C.a("ambiguous_delivery_area_error_key", aVar)));
            return ambiguousDeliveryAreaBottomSheet;
        }

        private b() {
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N I0(AmbiguousDeliveryAreaBottomSheet ambiguousDeliveryAreaBottomSheet, String str) {
        C17542s.j(str, "area");
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("Area selected: " + str, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = ambiguousDeliveryAreaBottomSheet.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        C5197z.c(ambiguousDeliveryAreaBottomSheet, "AmbiguousDeliveryAreaBottomSheetRequestKey", d.b(C16796C.a("AmbiguousDeliveryAreaBottomSheetBundleKey", new fo.b(str))));
        ambiguousDeliveryAreaBottomSheet.f94467Y = true;
        ambiguousDeliveryAreaBottomSheet.dismiss();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        if (!this.f94467Y) {
            return new BottomSheetComposeDialogFragment.a("AmbiguousDeliveryAreaBottomSheetRequestKey", d.b(C16796C.a("AmbiguousDeliveryAreaBottomSheetBundleKey", new fo.b((String) null))));
        }
        return null;
    }

    public final e K0() {
        e eVar = this.f94465U;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public void onResume() {
        super.onResume();
        K0().e(getActivity(), this.f94466X);
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(1701686827);
        if (C4895p.J()) {
            C4895p.S(1701686827, i10, -1, "com.ingka.ikea.checkout.impl.delivery.bottomsheets.AmbiguousDeliveryAreaBottomSheet.BottomSheetContent (AmbiguousDeliveryAreaBottomSheet.kt:38)");
        }
        C10802e.a aVar = (C10802e.a) requireArguments().getParcelable("ambiguous_delivery_area_error_key");
        if (aVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("No valid arguments when starting the fragment");
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
                    String name = AmbiguousDeliveryAreaBottomSheet.class.getName();
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
            dismiss();
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return;
        }
        String b10 = aVar.b();
        Iterable<C10802e.a.C1699a> a11 = aVar.a();
        ArrayList arrayList2 = new ArrayList(C16877v.y(a11, 10));
        for (C10802e.a.C1699a aVar2 : a11) {
            arrayList2.add(new C11317a(aVar2.b(), aVar2.a()));
        }
        C15987c h10 = C15985a.h(arrayList2);
        mVar.W(111397366);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new C11278a(this);
            mVar.u(D10);
        }
        mVar.P();
        C11322f.e(b10, h10, (C17642l) D10, mVar, 0);
        C16807N n10 = C16807N.f139792a;
        mVar.W(111414191);
        boolean F11 = mVar.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new a(this, (C17164e<? super a>) null);
            mVar.u(D11);
        }
        mVar.P();
        P.g(n10, (p) D11, mVar, 6);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
