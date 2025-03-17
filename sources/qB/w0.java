package QB;

import E1.I;
import G1.C4504g;
import IC.C13023e;
import KJ.C15987c;
import O0.H0;
import O0.J0;
import O0.L0;
import O0.N0;
import O0.S;
import O0.U;
import O0.e1;
import O0.g1;
import PB.C13332a;
import PB.C13334c;
import PB.h;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13651w0;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import SC.W1;
import SC.Y2;
import SC.Z1;
import TC.C13679b;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import Ww.r;
import XH.C16807N;
import XH.y;
import Y1.j;
import android.content.Context;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5100f0;
import androidx.compose.ui.platform.C5116k1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import iC.C14551a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import n1.C5626f;
import nI.C17631a;
import nI.C17642l;
import s0.C5834E;
import s0.C5842M;
import s0.C5844O;
import s0.C5848T;
import s0.C5862h;
import t0.C5934A;
import t0.C5938c;
import t0.x;
import uI.C18059h;
import uK.C18148c;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ao\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0003¢\u0006\u0004\b!\u0010\"\u001ai\u0010*\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0003¢\u0006\u0004\b*\u0010+\u001a)\u0010-\u001a\u00020\u0004*\u00020,2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0003¢\u0006\u0004\b-\u0010.\u001a!\u0010/\u001a\u00020\u0004*\u00020,2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0003¢\u0006\u0004\b/\u00100\u001a\u001b\u00102\u001a\u00020\u0004*\u00020,2\u0006\u00101\u001a\u00020\bH\u0003¢\u0006\u0004\b2\u00103\u001a\u0013\u00104\u001a\u00020\u0004*\u00020,H\u0003¢\u0006\u0004\b4\u00105\u001a\u001b\u00106\u001a\u00020\u0004*\u00020,2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b6\u00107\u001a\u0013\u00108\u001a\u00020\u0004*\u00020,H\u0003¢\u0006\u0004\b8\u00105\u001a3\u0010;\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010:\u001a\u0002092\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b;\u0010<\u001a+\u0010?\u001a\u00020\u00042\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0003¢\u0006\u0004\b?\u0010@\u001a;\u0010D\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00122\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0003¢\u0006\u0004\bD\u0010E\u001au\u0010M\u001a\u00020\u0004*\u00020,2\b\u0010F\u001a\u0004\u0018\u00010&2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020&0G2\u0006\u0010I\u001a\u00020\b2\b\u0010J\u001a\u0004\u0018\u00010&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010K\u001a\u00020\b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010L\u001a\u00020\bH\u0003¢\u0006\u0004\bM\u0010N\u001a\u0013\u0010O\u001a\u00020\u0004*\u00020,H\u0002¢\u0006\u0004\bO\u00105\u001a%\u0010Q\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0003¢\u0006\u0004\bQ\u0010R\u001ak\u0010V\u001a\u00020\u0004*\u00020,2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020&0G2\u0006\u0010I\u001a\u00020\b2\b\u0010T\u001a\u0004\u0018\u00010\u00122\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010K\u001a\u00020\b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010U\u001a\u00020\bH\u0002¢\u0006\u0004\bV\u0010W\u001aO\u0010[\u001a\u00020\u0004*\u00020,2\u0006\u0010X\u001a\u00020&2\u0006\u0010Y\u001a\u00020\b2\u0006\u0010U\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0002¢\u0006\u0004\b[\u0010\\\u001a!\u0010_\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010^\u001a\u00020]H\u0003¢\u0006\u0004\b_\u0010`¨\u0006d²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u0002²\u0006\u000e\u0010a\u001a\u00020\b8\n@\nX\u0002²\u0006\f\u0010\u0015\u001a\u00020\b8\nX\u0002²\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00128\n@\nX\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\b8\n@\nX\u0002²\u0006\f\u0010b\u001a\u00020\b8\nX\u0002²\u0006\u000e\u0010c\u001a\u00020\b8\n@\nX\u0002"}, d2 = {"LPB/i;", "viewModel", "Lkotlin/Function1;", "LPB/c;", "LXH/N;", "onNavigateTo", "n0", "(LPB/i;LnI/l;LU0/m;I)V", "", "doLocationRequest", "LPB/a;", "onAction", "Z", "(ZLnI/l;LU0/m;I)V", "LPB/f;", "state", "q0", "(LPB/f;LnI/l;LU0/m;I)V", "", "title", "isLargeTitleVisible", "isInSearchMode", "searchText", "Lkotlin/Function0;", "onBackClicked", "onSearchModeClose", "onSearchModeStart", "onSearchValueChanged", "H0", "(Ljava/lang/String;ZZLjava/lang/String;LnI/a;LnI/a;LnI/a;LnI/l;LU0/m;I)V", "showConfirmFab", "showBouncingBall", "onSelectStoreConfirmed", "X", "(ZZLnI/a;LU0/m;I)V", "Ls0/E;", "contentPadding", "onLargeTitleVisibilityChanged", "LPB/g;", "onStoreSelected", "onDetailsClick", "onFindNearbyStoreClicked", "S", "(Ls0/E;LPB/f;LnI/l;LnI/l;LnI/l;LnI/a;LU0/m;I)V", "Lt0/x;", "w1", "(Lt0/x;LPB/f;LnI/a;)V", "j1", "(Lt0/x;LnI/a;)V", "visible", "u1", "(Lt0/x;Z)V", "l1", "(Lt0/x;)V", "h1", "(Lt0/x;LPB/f;)V", "f1", "LO0/L0;", "snackbarHostState", "e0", "(LPB/f;LO0/L0;LnI/l;LU0/m;I)V", "onGoToSettingsClicked", "onDismiss", "i0", "(LnI/a;LnI/a;LU0/m;I)V", "currentStoreName", "selectedStoreName", "onConfirm", "L", "(Ljava/lang/String;Ljava/lang/String;LnI/a;LnI/a;LU0/m;I)V", "currentStore", "LKJ/c;", "otherStores", "showOtherStoresHeader", "selectedStore", "hideDetailsButton", "isChoicesEnabled", "b1", "(Lt0/x;LPB/g;LKJ/c;ZLPB/g;LnI/l;ZLnI/l;Z)V", "e1", "onRetryClicked", "Q", "(Ls0/E;LnI/a;LU0/m;I)V", "stores", "selectedStoreId", "isEnabled", "q1", "(Lt0/x;LKJ/c;ZLjava/lang/String;LnI/l;ZLnI/l;Z)V", "storeItem", "isSelected", "onChoiceClick", "n1", "(Lt0/x;LPB/g;ZZZLnI/a;LnI/a;)V", "Landroidx/compose/ui/d;", "modifier", "l0", "(Ljava/lang/String;Landroidx/compose/ui/d;LU0/m;II)V", "showScanAndGoWarningDialog", "isTitleVisible", "showLocationPermissionSettingsPrompt", "storepicker-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.ui.StorePickerScreenKt$ContentLoaded$1$1", f = "StorePickerScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f114220c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f114221d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f114222e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super Boolean, C16807N> lVar, A1<Boolean> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f114221d = lVar;
            this.f114222e = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f114221d, this.f114222e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f114220c == 0) {
                y.b(obj);
                this.f114221d.invoke(kotlin.coroutines.jvm.internal.b.a(w0.U(this.f114222e)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements nI.q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5626f f114223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f114224b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f114225c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.ui.StorePickerScreenKt$FloatingActionButton$1$1$1", f = "StorePickerScreen.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f114226c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5626f f114227d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C5626f fVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f114227d = fVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f114227d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f114226c == 0) {
                    y.b(obj);
                    C5626f.q(this.f114227d, false, 1, (Object) null);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        b(C5626f fVar, boolean z10, C17631a<C16807N> aVar) {
            this.f114223a = fVar;
            this.f114224b = z10;
            this.f114225c = aVar;
        }

        public final void a(l0.e eVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            l0.e eVar2 = eVar;
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(-1427999818, i10, -1, "com.ingka.ikea.store.storepicker.impl.ui.FloatingActionButton.<anonymous> (StorePickerScreen.kt:373)");
            }
            C16807N n10 = C16807N.f139792a;
            mVar2.W(588402120);
            boolean F10 = mVar2.F(this.f114223a);
            C5626f fVar = this.f114223a;
            Object D10 = mVar.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new a(fVar, (C17164e<? super a>) null);
                mVar2.u(D10);
            }
            mVar.P();
            P.g(n10, (nI.p) D10, mVar2, 6);
            L.b(J1.j.b(Oo.b.f84329B1, mVar2, 0), C5116k1.a(TC.e.i(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null)), "StorePickerScreenTestTags-FAB"), false, (N) null, (M) null, this.f114224b, (Integer) null, (K0) null, (r0.m) null, this.f114225c, mVar, 0, 476);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.ui.StorePickerScreenKt$HandleLocationPermission$1$1", f = "StorePickerScreen.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f114228c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ww.b f114229d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C13332a, C16807N> f114230e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Ww.b bVar, C17642l<? super C13332a, C16807N> lVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f114229d = bVar;
            this.f114230e = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f114229d, this.f114230e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            C17187b.f();
            if (this.f114228c == 0) {
                y.b(obj);
                r.b c10 = this.f114229d.c();
                if (C17542s.e(c10, r.b.d.f117723a)) {
                    Ww.a a10 = this.f114229d.a();
                    if (a10 == null || (str = a10.a()) == null) {
                        str = "";
                    }
                    this.f114230e.invoke(new C13332a.e.d(str));
                } else if (C17542s.e(c10, r.b.a.f117720a)) {
                    this.f114230e.invoke(C13332a.e.C2798a.f113816a);
                } else if (C17542s.e(c10, r.b.c.f117722a)) {
                    this.f114230e.invoke(C13332a.e.c.f113818a);
                } else if (C17542s.e(c10, r.b.C2906b.f117721a)) {
                    this.f114230e.invoke(C13332a.e.b.f113817a);
                } else if (c10 != null) {
                    throw new XH.t();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.ui.StorePickerScreenKt$HandleLocationPermission$2$1", f = "StorePickerScreen.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f114231c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f114232d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Ww.b f114233e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z10, Ww.b bVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f114232d = z10;
            this.f114233e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f114232d, this.f114233e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f114231c == 0) {
                y.b(obj);
                if (this.f114232d) {
                    this.f114233e.b();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.ui.StorePickerScreenKt$HandleUserMessage$1$1", f = "StorePickerScreen.kt", l = {595}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f114234c;

        /* renamed from: d  reason: collision with root package name */
        Object f114235d;

        /* renamed from: e  reason: collision with root package name */
        Object f114236e;

        /* renamed from: f  reason: collision with root package name */
        int f114237f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PB.f f114238g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ L0 f114239h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Context f114240i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<C13332a, C16807N> f114241j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f114242k;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f114243a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    O0.N0[] r0 = O0.N0.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    O0.N0 r1 = O0.N0.ActionPerformed     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    O0.N0 r1 = O0.N0.Dismissed     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f114243a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: QB.w0.e.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PB.f fVar, L0 l02, Context context, C17642l<? super C13332a, C16807N> lVar, C4899r0<Boolean> r0Var, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f114238g = fVar;
            this.f114239h = l02;
            this.f114240i = context;
            this.f114241j = lVar;
            this.f114242k = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f114238g, this.f114239h, this.f114240i, this.f114241j, this.f114242k, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            PB.h hVar;
            C13023e b10;
            Object f10 = C17187b.f();
            int i10 = this.f114237f;
            if (i10 == 0) {
                y.b(obj);
                PB.h n10 = this.f114238g.n();
                if (n10 instanceof h.b) {
                    h.b bVar = (h.b) n10;
                    J0 j02 = bVar.a() != null ? J0.Indefinite : J0.Short;
                    L0 l02 = this.f114239h;
                    String b11 = bVar.b().b(this.f114240i);
                    h.b.a a10 = bVar.a();
                    String b12 = (a10 == null || (b10 = a10.b()) == null) ? null : b10.b(this.f114240i);
                    this.f114234c = n10;
                    this.f114235d = j02;
                    this.f114236e = a10;
                    this.f114237f = 1;
                    Object f11 = L0.f(l02, b11, b12, false, j02, this, 4, (Object) null);
                    if (f11 == f10) {
                        return f10;
                    }
                    hVar = n10;
                    obj = f11;
                } else {
                    if (C17542s.e(n10, h.a.f113884a)) {
                        w0.g0(this.f114242k, true);
                    } else if (n10 != null) {
                        throw new XH.t();
                    }
                    return C16807N.f139792a;
                }
            } else if (i10 == 1) {
                h.b.a aVar = (h.b.a) this.f114236e;
                J0 j03 = (J0) this.f114235d;
                hVar = (PB.h) this.f114234c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = a.f114243a[((N0) obj).ordinal()];
            if (i11 == 1) {
                h.b.a a11 = ((h.b) hVar).a();
                if (a11 != null) {
                    C17642l<C13332a, C16807N> lVar = this.f114241j;
                    lVar.invoke(a11.a());
                    lVar.invoke(C13332a.o.f113831a);
                }
            } else if (i11 == 2) {
                this.f114241j.invoke(C13332a.o.f113831a);
            } else {
                throw new XH.t();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements nI.q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C13332a, C16807N> f114244a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f114245b;

        f(C17642l<? super C13332a, C16807N> lVar, C4899r0<Boolean> r0Var) {
            this.f114244a = lVar;
            this.f114245b = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar) {
            lVar.invoke(C13332a.c.f113814a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar, C4899r0 r0Var) {
            lVar.invoke(C13332a.o.f113831a);
            w0.g0(r0Var, false);
            return C16807N.f139792a;
        }

        public final void c(l0.e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(-196167018, i10, -1, "com.ingka.ikea.store.storepicker.impl.ui.HandleUserMessage.<anonymous> (StorePickerScreen.kt:622)");
            }
            mVar.W(-2108793706);
            boolean V10 = mVar.V(this.f114244a);
            C17642l<C13332a, C16807N> lVar = this.f114244a;
            Object D10 = mVar.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new x0(lVar);
                mVar.u(D10);
            }
            C17631a aVar = (C17631a) D10;
            mVar.P();
            mVar.W(-2108791504);
            boolean V11 = mVar.V(this.f114244a);
            C17642l<C13332a, C16807N> lVar2 = this.f114244a;
            C4899r0<Boolean> r0Var = this.f114245b;
            Object D11 = mVar.D();
            if (V11 || D11 == C4889m.f14007a.a()) {
                D11 = new y0(lVar2, r0Var);
                mVar.u(D11);
            }
            mVar.P();
            w0.i0(aVar, (C17631a) D11, mVar, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.ui.StorePickerScreenKt$StorePickerScreen$1$1", f = "StorePickerScreen.kt", l = {}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f114246c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1<PB.f> f114247d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C13334c, C16807N> f114248e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PB.i f114249f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(A1<PB.f> a12, C17642l<? super C13334c, C16807N> lVar, PB.i iVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f114247d = a12;
            this.f114248e = lVar;
            this.f114249f = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f114247d, this.f114248e, this.f114249f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f114246c == 0) {
                y.b(obj);
                C13334c h10 = w0.o0(this.f114247d).h();
                if (h10 != null) {
                    C17642l<C13334c, C16807N> lVar = this.f114248e;
                    PB.i iVar = this.f114249f;
                    lVar.invoke(h10);
                    iVar.b(C13332a.f.f113820a);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h extends C17540p implements C17642l<C13332a, C16807N> {
        h(Object obj) {
            super(1, obj, PB.i.class, "onAction", "onAction(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C13332a) obj);
            return C16807N.f139792a;
        }

        public final void t(C13332a aVar) {
            C17542s.j(aVar, "p0");
            ((PB.i) this.receiver).b(aVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class i extends C17540p implements C17642l<C13332a, C16807N> {
        i(Object obj) {
            super(1, obj, PB.i.class, "onAction", "onAction(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C13332a) obj);
            return C16807N.f139792a;
        }

        public final void t(C13332a aVar) {
            C17542s.j(aVar, "p0");
            ((PB.i) this.receiver).b(aVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PB.f f114250a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C13332a, C16807N> f114251b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<String> f114252c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f114253d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f114254e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements C17631a<C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17642l<C13332a, C16807N> f114255a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4899r0<String> f114256b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17642l<? super C13332a, C16807N> lVar, C4899r0<String> r0Var) {
                super(0, C17542s.a.class, "searchModeClose", "StorePickerScreenUi$searchModeClose(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)V", 0);
                this.f114255a = lVar;
                this.f114256b = r0Var;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                t();
                return C16807N.f139792a;
            }

            public final void t() {
                w0.E0(this.f114255a, this.f114256b);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class b extends C17540p implements C17631a<C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17642l<C13332a, C16807N> f114257a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4899r0<String> f114258b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C17642l<? super C13332a, C16807N> lVar, C4899r0<String> r0Var) {
                super(0, C17542s.a.class, "searchModeStart", "StorePickerScreenUi$searchModeStart(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)V", 0);
                this.f114257a = lVar;
                this.f114258b = r0Var;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                t();
                return C16807N.f139792a;
            }

            public final void t() {
                w0.F0(this.f114257a, this.f114258b);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class c extends C17540p implements C17642l<String, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17642l<C13332a, C16807N> f114259a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4899r0<String> f114260b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C17642l<? super C13332a, C16807N> lVar, C4899r0<String> r0Var) {
                super(1, C17542s.a.class, "searchQuery", "StorePickerScreenUi$searchQuery(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V", 0);
                this.f114259a = lVar;
                this.f114260b = r0Var;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((String) obj);
                return C16807N.f139792a;
            }

            public final void t(String str) {
                C17542s.j(str, "p0");
                w0.G0(this.f114259a, this.f114260b, str);
            }
        }

        j(PB.f fVar, C17642l<? super C13332a, C16807N> lVar, C4899r0<String> r0Var, C4899r0<Boolean> r0Var2, A1<Boolean> a12) {
            this.f114250a = fVar;
            this.f114251b = lVar;
            this.f114252c = r0Var;
            this.f114253d = r0Var2;
            this.f114254e = a12;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar) {
            lVar.invoke(C13332a.C2797a.f113812a);
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1963138661, i10, -1, "com.ingka.ikea.store.storepicker.impl.ui.StorePickerScreenUi.<anonymous> (StorePickerScreen.kt:260)");
                }
                String a10 = this.f114250a.m().a(mVar, C13023e.f110931a);
                boolean V02 = w0.B0(this.f114253d);
                boolean T02 = w0.w0(this.f114254e);
                String U02 = w0.y0(this.f114252c);
                mVar.W(312958509);
                boolean V10 = mVar.V(this.f114251b);
                C17642l<C13332a, C16807N> lVar = this.f114251b;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new z0(lVar);
                    mVar.u(D10);
                }
                C17631a aVar = (C17631a) D10;
                mVar.P();
                mVar.W(312961850);
                boolean V11 = mVar.V(this.f114252c) | mVar.V(this.f114251b);
                C17642l<C13332a, C16807N> lVar2 = this.f114251b;
                C4899r0<String> r0Var = this.f114252c;
                Object D11 = mVar.D();
                if (V11 || D11 == C4889m.f14007a.a()) {
                    D11 = new a(lVar2, r0Var);
                    mVar.u(D11);
                }
                mVar.P();
                C17631a aVar2 = (C17631a) ((C18059h) D11);
                mVar.W(312963610);
                boolean V12 = mVar.V(this.f114251b) | mVar.V(this.f114252c);
                C17642l<C13332a, C16807N> lVar3 = this.f114251b;
                C4899r0<String> r0Var2 = this.f114252c;
                Object D12 = mVar.D();
                if (V12 || D12 == C4889m.f14007a.a()) {
                    D12 = new b(lVar3, r0Var2);
                    mVar.u(D12);
                }
                mVar.P();
                C17631a aVar3 = (C17631a) ((C18059h) D12);
                mVar.W(312965462);
                boolean V13 = mVar.V(this.f114252c) | mVar.V(this.f114251b);
                C17642l<C13332a, C16807N> lVar4 = this.f114251b;
                C4899r0<String> r0Var3 = this.f114252c;
                Object D13 = mVar.D();
                if (V13 || D13 == C4889m.f14007a.a()) {
                    D13 = new c(lVar4, r0Var3);
                    mVar.u(D13);
                }
                mVar.P();
                w0.H0(a10, V02, T02, U02, aVar, aVar2, aVar3, (C17642l) ((C18059h) D13), mVar, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f114261a;

        k(L0 l02) {
            this.f114261a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1418266087, i10, -1, "com.ingka.ikea.store.storepicker.impl.ui.StorePickerScreenUi.<anonymous> (StorePickerScreen.kt:258)");
                }
                Y2.c(this.f114261a, (androidx.compose.ui.d) null, (nI.r<? super H0, ? super nI.p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PB.f f114262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C13332a, C16807N> f114263b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f114264c;

        l(PB.f fVar, C17642l<? super C13332a, C16807N> lVar, C4899r0<Boolean> r0Var) {
            this.f114262a = fVar;
            this.f114263b = lVar;
            this.f114264c = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(PB.f fVar, C17642l lVar, C4899r0 r0Var) {
            PB.g c10;
            PB.d f10 = fVar.f();
            if (!(f10 == null || (c10 = f10.c()) == null)) {
                if (fVar.o()) {
                    w0.s0(r0Var, true);
                } else {
                    lVar.invoke(new C13332a.l(c10));
                }
            }
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1145829800, i10, -1, "com.ingka.ikea.store.storepicker.impl.ui.StorePickerScreenUi.<anonymous> (StorePickerScreen.kt:293)");
                }
                boolean z10 = true;
                boolean z11 = this.f114262a.f() != null;
                PB.d f10 = this.f114262a.f();
                if (f10 == null || !f10.d()) {
                    z10 = false;
                }
                mVar.W(313001504);
                boolean F10 = mVar.F(this.f114262a) | mVar.V(this.f114263b);
                PB.f fVar = this.f114262a;
                C17642l<C13332a, C16807N> lVar = this.f114263b;
                C4899r0<Boolean> r0Var = this.f114264c;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new C13354A0(fVar, lVar, r0Var);
                    mVar.u(D10);
                }
                mVar.P();
                w0.X(z11, z10, (C17631a) D10, mVar, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements nI.q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PB.f f114265a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C13332a, C16807N> f114266b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f114267c;

        m(PB.f fVar, C17642l<? super C13332a, C16807N> lVar, C4899r0<Boolean> r0Var) {
            this.f114265a = fVar;
            this.f114266b = lVar;
            this.f114267c = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C17642l lVar) {
            lVar.invoke(C13332a.j.f113824a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(C4899r0 r0Var, boolean z10) {
            w0.C0(r0Var, z10);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(C17642l lVar, PB.g gVar) {
            C17542s.j(gVar, "it");
            lVar.invoke(new C13332a.m(gVar));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(C17642l lVar, String str) {
            C17542s.j(str, "it");
            lVar.invoke(new C13332a.n(str));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N n(C17642l lVar) {
            lVar.invoke(C13332a.b.f113813a);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(s0.C5834E r10, U0.C4889m r11, int r12) {
            /*
                r9 = this;
                java.lang.String r0 = "contentPadding"
                kotlin.jvm.internal.C17542s.j(r10, r0)
                r0 = r12 & 6
                if (r0 != 0) goto L_0x0013
                boolean r0 = r11.V(r10)
                if (r0 == 0) goto L_0x0011
                r0 = 4
                goto L_0x0012
            L_0x0011:
                r0 = 2
            L_0x0012:
                r12 = r12 | r0
            L_0x0013:
                r0 = r12 & 19
                r1 = 18
                if (r0 != r1) goto L_0x0025
                boolean r0 = r11.l()
                if (r0 != 0) goto L_0x0020
                goto L_0x0025
            L_0x0020:
                r11.L()
                goto L_0x012f
            L_0x0025:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0034
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.store.storepicker.impl.ui.StorePickerScreenUi.<anonymous> (StorePickerScreen.kt:274)"
                r2 = -1268716432(0xffffffffb460ec70, float:-2.0947641E-7)
                U0.C4895p.S(r2, r12, r0, r1)
            L_0x0034:
                PB.f r0 = r9.f114265a
                PB.b r0 = r0.c()
                boolean r0 = r0 instanceof PB.C13333b.a
                if (r0 == 0) goto L_0x0077
                r0 = 1112117461(0x424990d5, float:50.391438)
                r11.W(r0)
                r0 = 312973418(0x12a7986a, float:1.0576755E-27)
                r11.W(r0)
                nI.l<PB.a, XH.N> r0 = r9.f114266b
                boolean r0 = r11.V(r0)
                nI.l<PB.a, XH.N> r1 = r9.f114266b
                java.lang.Object r2 = r11.D()
                if (r0 != 0) goto L_0x0060
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r0 = r0.a()
                if (r2 != r0) goto L_0x0068
            L_0x0060:
                QB.B0 r2 = new QB.B0
                r2.<init>(r1)
                r11.u(r2)
            L_0x0068:
                nI.a r2 = (nI.C17631a) r2
                r11.P()
                r12 = r12 & 14
                QB.w0.Q(r10, r2, r11, r12)
                r11.P()
                goto L_0x0126
            L_0x0077:
                r0 = 1112328633(0x424cc9b9, float:51.196995)
                r11.W(r0)
                PB.f r2 = r9.f114265a
                r0 = 312981253(0x12a7b705, float:1.05842995E-27)
                r11.W(r0)
                U0.r0<java.lang.Boolean> r0 = r9.f114267c
                java.lang.Object r1 = r11.D()
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r4 = r3.a()
                if (r1 != r4) goto L_0x009b
                QB.C0 r1 = new QB.C0
                r1.<init>(r0)
                r11.u(r1)
            L_0x009b:
                r0 = r1
                nI.l r0 = (nI.C17642l) r0
                r11.P()
                r1 = 312983489(0x12a7bfc1, float:1.0586453E-27)
                r11.W(r1)
                nI.l<PB.a, XH.N> r1 = r9.f114266b
                boolean r1 = r11.V(r1)
                nI.l<PB.a, XH.N> r4 = r9.f114266b
                java.lang.Object r5 = r11.D()
                if (r1 != 0) goto L_0x00bb
                java.lang.Object r1 = r3.a()
                if (r5 != r1) goto L_0x00c3
            L_0x00bb:
                QB.D0 r5 = new QB.D0
                r5.<init>(r4)
                r11.u(r5)
            L_0x00c3:
                r4 = r5
                nI.l r4 = (nI.C17642l) r4
                r11.P()
                r1 = 312987516(0x12a7cf7c, float:1.0590331E-27)
                r11.W(r1)
                nI.l<PB.a, XH.N> r1 = r9.f114266b
                boolean r1 = r11.V(r1)
                nI.l<PB.a, XH.N> r5 = r9.f114266b
                java.lang.Object r6 = r11.D()
                if (r1 != 0) goto L_0x00e3
                java.lang.Object r1 = r3.a()
                if (r6 != r1) goto L_0x00eb
            L_0x00e3:
                QB.E0 r6 = new QB.E0
                r6.<init>(r5)
                r11.u(r6)
            L_0x00eb:
                r5 = r6
                nI.l r5 = (nI.C17642l) r5
                r11.P()
                r1 = 312990708(0x12a7dbf4, float:1.0593404E-27)
                r11.W(r1)
                nI.l<PB.a, XH.N> r1 = r9.f114266b
                boolean r1 = r11.V(r1)
                nI.l<PB.a, XH.N> r6 = r9.f114266b
                java.lang.Object r7 = r11.D()
                if (r1 != 0) goto L_0x010b
                java.lang.Object r1 = r3.a()
                if (r7 != r1) goto L_0x0113
            L_0x010b:
                QB.F0 r7 = new QB.F0
                r7.<init>(r6)
                r11.u(r7)
            L_0x0113:
                r6 = r7
                nI.a r6 = (nI.C17631a) r6
                r11.P()
                r12 = r12 & 14
                r8 = r12 | 384(0x180, float:5.38E-43)
                r1 = r10
                r3 = r0
                r7 = r11
                QB.w0.S(r1, r2, r3, r4, r5, r6, r7, r8)
                r11.P()
            L_0x0126:
                boolean r10 = U0.C4895p.J()
                if (r10 == 0) goto L_0x012f
                U0.C4895p.R()
            L_0x012f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: QB.w0.m.h(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            h((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements nI.q<Boolean, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f114268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f114269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f114270c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f114271d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f114272e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f114273f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f114274g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements nI.q<C5842M, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f114275a;

            a(C17631a<C16807N> aVar) {
                this.f114275a = aVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(C17631a aVar) {
                aVar.invoke();
                return C16807N.f139792a;
            }

            public final void b(C5842M m10, C4889m mVar, int i10) {
                C17542s.j(m10, "$this$IkeaTopAppBar");
                if ((i10 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1333407794, i10, -1, "com.ingka.ikea.store.storepicker.impl.ui.TopBarAndSearch.<anonymous>.<anonymous> (StorePickerScreen.kt:341)");
                    }
                    androidx.compose.ui.d a10 = C5116k1.a(androidx.compose.ui.d.f18749a, "StorePickerScreenTestTags-search-icon");
                    mVar.W(-1254830459);
                    boolean V10 = mVar.V(this.f114275a);
                    C17631a<C16807N> aVar = this.f114275a;
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new G0(aVar);
                        mVar.u(D10);
                    }
                    mVar.P();
                    U.a((C17631a) D10, a10, false, (S) null, (r0.m) null, C13408r.f114176a.a(), mVar, 196656, 28);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        n(String str, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar, boolean z10, String str2, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3) {
            this.f114268a = str;
            this.f114269b = lVar;
            this.f114270c = aVar;
            this.f114271d = z10;
            this.f114272e = str2;
            this.f114273f = aVar2;
            this.f114274g = aVar3;
        }

        public final void a(boolean z10, C4889m mVar, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= mVar.b(z10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-455464231, i10, -1, "com.ingka.ikea.store.storepicker.impl.ui.TopBarAndSearch.<anonymous> (StorePickerScreen.kt:327)");
                }
                String str = "";
                if (z10) {
                    mVar.W(1025638317);
                    String str2 = this.f114268a;
                    zl.g.f(str2 == null ? str : str2, this.f114269b, this.f114270c, J1.j.b(C14551a.f127536i, mVar, 0), D.m(TC.e.i(androidx.compose.ui.d.f18749a), 0.0f, c2.h.B((float) 16), 0.0f, c2.h.B((float) 32), 5, (Object) null), (C17631a<C16807N>) null, mVar, 0, 32);
                    mVar.P();
                } else {
                    mVar.W(1026035830);
                    if (!this.f114271d) {
                        str = this.f114272e;
                    }
                    ol.p.c(ol.v.CLOSE, this.f114273f, C5116k1.a(androidx.compose.ui.d.f18749a, "StorePickerScreenTestTags-tool-bar-title"), str, (ol.u) null, c1.c.e(-1333407794, true, new a(this.f114274g), mVar, 54), (C5848T) null, (e1) null, (g1) null, mVar, 196998, 464);
                    mVar.P();
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((Boolean) obj).booleanValue(), (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class o implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PB.f f114276a;

        o(PB.f fVar) {
            this.f114276a = fVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11;
            C5938c cVar2 = cVar;
            C4889m mVar2 = mVar;
            C17542s.j(cVar2, "$this$item");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(cVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-42675500, i11, -1, "com.ingka.ikea.store.storepicker.impl.ui.listTitle.<anonymous> (StorePickerScreen.kt:547)");
                }
                C13607l.j(this.f114276a.m().a(mVar2, C13023e.f110931a), C13679b.C2857b.a.f116683a, C5116k1.a(D.k(C5938c.e(cVar, TC.e.i(androidx.compose.ui.d.f18749a), (m0.N) null, (m0.N) null, (m0.N) null, 7, (Object) null), 0.0f, c2.h.B((float) 12), 1, (Object) null), "StorePickerScreenTestTags-title"), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, mVar, 48, 0, 262136);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class p implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f114277a;

        p(C17631a<C16807N> aVar) {
            this.f114277a = aVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11;
            C5938c cVar2 = cVar;
            C4889m mVar2 = mVar;
            C17542s.j(cVar2, "$this$item");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(cVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-181389116, i11, -1, "com.ingka.ikea.store.storepicker.impl.ui.nearByButton.<anonymous> (StorePickerScreen.kt:478)");
                }
                String b10 = J1.j.b(C14551a.f127528a, mVar2, 0);
                String str = b10;
                N n10 = N.Secondary;
                L.b(str, C5116k1.a(D.k(C5938c.e(cVar, TC.e.i(androidx.compose.ui.d.f18749a), (m0.N) null, (m0.N) null, (m0.N) null, 7, (Object) null), 0.0f, c2.h.B((float) 12), 1, (Object) null), "StorePickerScreenTestTags-nearby-button"), false, n10, (M) null, false, Integer.valueOf(C18148c.LocationPin.m()), (K0) null, (r0.m) null, this.f114277a, mVar, 3072, 436);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class q implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PB.g f114278a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f114279b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f114280c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f114281d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f114282e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f114283f;

        q(PB.g gVar, C17631a<C16807N> aVar, boolean z10, boolean z11, boolean z12, C17631a<C16807N> aVar2) {
            this.f114278a = gVar;
            this.f114279b = aVar;
            this.f114280c = z10;
            this.f114281d = z11;
            this.f114282e = z12;
            this.f114283f = aVar2;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11;
            C5938c cVar2 = cVar;
            C4889m mVar2 = mVar;
            C17542s.j(cVar2, "$this$item");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(cVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1184948045, i11, -1, "com.ingka.ikea.store.storepicker.impl.ui.sectionCurrentStore.<anonymous> (StorePickerScreen.kt:841)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d e10 = C5938c.e(cVar, aVar, (m0.N) null, (m0.N) null, (m0.N) null, 7, (Object) null);
                PB.g gVar = this.f114278a;
                C17631a<C16807N> aVar2 = this.f114279b;
                boolean z10 = this.f114280c;
                boolean z11 = this.f114281d;
                boolean z12 = this.f114282e;
                C17631a<C16807N> aVar3 = this.f114283f;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar2, e10);
                C4504g.a aVar4 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar4.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar4.c());
                F1.c(a13, s10, aVar4.e());
                nI.p<C4504g, Integer, C16807N> b10 = aVar4.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e11, aVar4.d());
                C5862h hVar = C5862h.f28810a;
                C13365H.j(gVar.h(), gVar.c(), gVar.f(), aVar2, gVar.g(), gVar.e(), C5116k1.a(aVar, "StorePickerScreenTestTags-current_store"), z10, z11, z12, aVar3, mVar, 1572864 | (C13023e.f110931a << 6), 0, 0);
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class r extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f114284c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f114285d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(C17642l lVar, List list) {
            super(1);
            this.f114284c = lVar;
            this.f114285d = list;
        }

        public final Object a(int i10) {
            return this.f114284c.invoke(this.f114285d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class s extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f114286c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f114287d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(C17642l lVar, List list) {
            super(1);
            this.f114286c = lVar;
            this.f114287d = list;
        }

        public final Object a(int i10) {
            return this.f114286c.invoke(this.f114287d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class t extends C17544u implements nI.r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f114288c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f114289d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l f114290e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f114291f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f114292g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l f114293h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(List list, String str, C17642l lVar, boolean z10, boolean z11, C17642l lVar2) {
            super(4);
            this.f114288c = list;
            this.f114289d = str;
            this.f114290e = lVar;
            this.f114291f = z10;
            this.f114292g = z11;
            this.f114293h = lVar2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r22, int r23, U0.C4889m r24, int r25) {
            /*
                r21 = this;
                r0 = r21
                r1 = r23
                r15 = r24
                r2 = r25 & 6
                if (r2 != 0) goto L_0x0018
                r2 = r22
                boolean r3 = r15.V(r2)
                if (r3 == 0) goto L_0x0014
                r3 = 4
                goto L_0x0015
            L_0x0014:
                r3 = 2
            L_0x0015:
                r3 = r25 | r3
                goto L_0x001c
            L_0x0018:
                r2 = r22
                r3 = r25
            L_0x001c:
                r4 = r25 & 48
                if (r4 != 0) goto L_0x002c
                boolean r4 = r15.d(r1)
                if (r4 == 0) goto L_0x0029
                r4 = 32
                goto L_0x002b
            L_0x0029:
                r4 = 16
            L_0x002b:
                r3 = r3 | r4
            L_0x002c:
                r4 = r3 & 147(0x93, float:2.06E-43)
                r5 = 146(0x92, float:2.05E-43)
                if (r4 != r5) goto L_0x003e
                boolean r4 = r24.l()
                if (r4 != 0) goto L_0x0039
                goto L_0x003e
            L_0x0039:
                r24.L()
                goto L_0x0120
            L_0x003e:
                boolean r4 = U0.C4895p.J()
                if (r4 == 0) goto L_0x004d
                r4 = -1
                java.lang.String r5 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
                r6 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                U0.C4895p.S(r6, r3, r4, r5)
            L_0x004d:
                java.util.List r3 = r0.f114288c
                java.lang.Object r1 = r3.get(r1)
                PB.g r1 = (PB.g) r1
                r3 = 2075529347(0x7bb61083, float:1.8906659E36)
                r15.W(r3)
                java.lang.String r10 = r1.h()
                java.lang.String r11 = r1.c()
                IC.e r12 = r1.f()
                java.lang.String r3 = r1.j()
                java.lang.String r4 = r0.f114289d
                boolean r13 = kotlin.jvm.internal.C17542s.e(r3, r4)
                KJ.c r14 = r1.g()
                KJ.c r16 = r1.e()
                androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
                r8 = 7
                r9 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r22
                androidx.compose.ui.d r2 = t0.C5938c.e(r3, r4, r5, r6, r7, r8, r9)
                QB.H0 r3 = QB.H0.f114100a
                java.lang.String r4 = r1.j()
                java.lang.String r3 = r3.a(r4)
                androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r2, r3)
                r2 = 621152770(0x25060a02, float:1.1626038E-16)
                r15.W(r2)
                nI.l r2 = r0.f114290e
                boolean r2 = r15.V(r2)
                boolean r3 = r15.F(r1)
                r2 = r2 | r3
                java.lang.Object r3 = r24.D()
                if (r2 != 0) goto L_0x00b3
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x00bd
            L_0x00b3:
                QB.w0$u r3 = new QB.w0$u
                nI.l r2 = r0.f114290e
                r3.<init>(r2, r1)
                r15.u(r3)
            L_0x00bd:
                r4 = r3
                nI.a r4 = (nI.C17631a) r4
                r24.P()
                boolean r8 = r0.f114291f
                boolean r9 = r0.f114292g
                r2 = 621150939(0x250602db, float:1.1623615E-16)
                r15.W(r2)
                nI.l r2 = r0.f114293h
                boolean r2 = r15.V(r2)
                boolean r3 = r15.F(r1)
                r2 = r2 | r3
                java.lang.Object r3 = r24.D()
                if (r2 != 0) goto L_0x00e6
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x00f0
            L_0x00e6:
                QB.w0$v r3 = new QB.w0$v
                nI.l r2 = r0.f114293h
                r3.<init>(r2, r1)
                r15.u(r3)
            L_0x00f0:
                r17 = r3
                nI.a r17 = (nI.C17631a) r17
                r24.P()
                int r1 = IC.C13023e.f110931a
                int r18 = r1 << 6
                r19 = 0
                r20 = 0
                r1 = r10
                r2 = r11
                r3 = r12
                r5 = r14
                r6 = r16
                r10 = r9
                r9 = r13
                r11 = r17
                r12 = r24
                r13 = r18
                r14 = r19
                r15 = r20
                QB.C13365H.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                r24.P()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0120
                U0.C4895p.R()
            L_0x0120:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: QB.w0.t.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class u implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f114294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PB.g f114295b;

        u(C17642l<? super String, C16807N> lVar, PB.g gVar) {
            this.f114294a = lVar;
            this.f114295b = gVar;
        }

        public final void a() {
            this.f114294a.invoke(this.f114295b.j());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class v implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<PB.g, C16807N> f114296a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PB.g f114297b;

        v(C17642l<? super PB.g, C16807N> lVar, PB.g gVar) {
            this.f114296a = lVar;
            this.f114297b = gVar;
        }

        public final void a() {
            this.f114296a.invoke(this.f114297b);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class w implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f114298a;

        w(boolean z10) {
            this.f114298a = z10;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(cVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-560415729, i10, -1, "com.ingka.ikea.store.storepicker.impl.ui.stockHeaderDisclaimer.<anonymous> (StorePickerScreen.kt:498)");
                }
                l0.d.g(this.f114298a, C5938c.e(cVar, androidx.compose.ui.d.f18749a, (m0.N) null, (m0.N) null, (m0.N) null, 7, (Object) null), (androidx.compose.animation.i) null, (androidx.compose.animation.k) null, (String) null, C13408r.f114176a.c(), mVar, ImageMetadata.EDGE_MODE, 28);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A0(C17642l lVar, C4899r0 r0Var) {
        E0(lVar, r0Var);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean B0(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void C0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N D0(PB.f fVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        q0(fVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void E0(C17642l<? super C13332a, C16807N> lVar, C4899r0<String> r0Var) {
        z0(r0Var, (String) null);
        lVar.invoke(new C13332a.k((String) null));
    }

    /* access modifiers changed from: private */
    public static final void F0(C17642l<? super C13332a, C16807N> lVar, C4899r0<String> r0Var) {
        lVar.invoke(new C13332a.m((PB.g) null));
        z0(r0Var, (String) null);
        lVar.invoke(new C13332a.k(""));
    }

    /* access modifiers changed from: private */
    public static final void G0(C17642l<? super C13332a, C16807N> lVar, C4899r0<String> r0Var, String str) {
        z0(r0Var, str);
        lVar.invoke(new C13332a.k(str));
    }

    /* access modifiers changed from: private */
    public static final void H0(String str, boolean z10, boolean z11, String str2, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17642l<? super String, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        int i12 = i10;
        C4889m k10 = mVar.k(-1610116070);
        String str3 = str;
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        boolean z12 = z10;
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z12) ? 32 : 16;
        }
        boolean z13 = z11;
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z13) ? 256 : 128;
        }
        String str4 = str2;
        if ((i12 & 3072) == 0) {
            i11 |= k10.V(str4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        C17631a<C16807N> aVar4 = aVar;
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar4) ? 16384 : 8192;
        }
        C17631a<C16807N> aVar5 = aVar2;
        if ((196608 & i12) == 0) {
            i11 |= k10.F(aVar5) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(aVar3) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        } else {
            C17631a<C16807N> aVar6 = aVar3;
        }
        C17642l<? super String, C16807N> lVar2 = lVar;
        if ((12582912 & i12) == 0) {
            i11 |= k10.F(lVar2) ? 8388608 : 4194304;
        }
        if ((4793491 & i11) != 4793490 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1610116070, i11, -1, "com.ingka.ikea.store.storepicker.impl.ui.TopBarAndSearch (StorePickerScreen.kt:322)");
            }
            Boolean valueOf = Boolean.valueOf(z11);
            n nVar = r11;
            n nVar2 = new n(str2, lVar, aVar2, z10, str, aVar, aVar3);
            l0.j.a(valueOf, (androidx.compose.ui.d) null, (m0.N<Float>) null, "Search mode crossfade", c1.c.e(-455464231, true, nVar, k10, 54), k10, ((i11 >> 6) & 14) | 27648, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13374Q(str, z10, z11, str2, aVar, aVar2, aVar3, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N I0(String str, boolean z10, boolean z11, String str2, C17631a aVar, C17631a aVar2, C17631a aVar3, C17642l lVar, int i10, C4889m mVar, int i11) {
        H0(str, z10, z11, str2, aVar, aVar2, aVar3, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void L(java.lang.String r19, java.lang.String r20, nI.C17631a<XH.C16807N> r21, nI.C17631a<XH.C16807N> r22, U0.C4889m r23, int r24) {
        /*
            r3 = r21
            r4 = r22
            r5 = r24
            r0 = 1160753613(0x452fb1cd, float:2811.1125)
            r1 = r23
            U0.m r1 = r1.k(r0)
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0020
            r2 = r19
            boolean r6 = r1.V(r2)
            if (r6 == 0) goto L_0x001d
            r6 = 4
            goto L_0x001e
        L_0x001d:
            r6 = 2
        L_0x001e:
            r6 = r6 | r5
            goto L_0x0023
        L_0x0020:
            r2 = r19
            r6 = r5
        L_0x0023:
            r7 = r5 & 48
            r15 = r20
            if (r7 != 0) goto L_0x0035
            boolean r7 = r1.V(r15)
            if (r7 == 0) goto L_0x0032
            r7 = 32
            goto L_0x0034
        L_0x0032:
            r7 = 16
        L_0x0034:
            r6 = r6 | r7
        L_0x0035:
            r7 = r5 & 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x0046
            boolean r7 = r1.F(r3)
            if (r7 == 0) goto L_0x0043
            r7 = r8
            goto L_0x0045
        L_0x0043:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r6 = r6 | r7
        L_0x0046:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            if (r7 != 0) goto L_0x0057
            boolean r7 = r1.F(r4)
            if (r7 == 0) goto L_0x0054
            r7 = r9
            goto L_0x0056
        L_0x0054:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0056:
            r6 = r6 | r7
        L_0x0057:
            r7 = r6 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r7 != r10) goto L_0x0069
            boolean r7 = r1.l()
            if (r7 != 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            r1.L()
            goto L_0x0143
        L_0x0069:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0075
            r7 = -1
            java.lang.String r10 = "com.ingka.ikea.store.storepicker.impl.ui.ConfirmationPrompt (StorePickerScreen.kt:668)"
            U0.C4895p.S(r0, r6, r7, r10)
        L_0x0075:
            int r0 = iC.C14551a.f127532e
            java.lang.Object[] r7 = new java.lang.Object[]{r19, r20}
            r10 = 0
            java.lang.String r0 = J1.j.c(r0, r7, r1, r10)
            int r7 = iC.C14551a.f127530c
            java.lang.String r7 = J1.j.b(r7, r1, r10)
            r11 = -1830270623(0xffffffff92e84961, float:-1.4659348E-27)
            r1.W(r11)
            r11 = r6 & 896(0x380, float:1.256E-42)
            r12 = 1
            if (r11 != r8) goto L_0x0093
            r8 = r12
            goto L_0x0094
        L_0x0093:
            r8 = r10
        L_0x0094:
            java.lang.Object r11 = r1.D()
            if (r8 != 0) goto L_0x00a2
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r11 != r8) goto L_0x00aa
        L_0x00a2:
            QB.M r11 = new QB.M
            r11.<init>(r3)
            r1.u(r11)
        L_0x00aa:
            nI.a r11 = (nI.C17631a) r11
            r1.P()
            SC.W1 r8 = new SC.W1
            r8.<init>(r7, r11)
            int r7 = iC.C14551a.f127529b
            java.lang.String r7 = J1.j.b(r7, r1, r10)
            r11 = -1830265183(0xffffffff92e85ea1, float:-1.4664586E-27)
            r1.W(r11)
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != r9) goto L_0x00c6
            r11 = r12
            goto L_0x00c7
        L_0x00c6:
            r11 = r10
        L_0x00c7:
            java.lang.Object r13 = r1.D()
            if (r11 != 0) goto L_0x00d5
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r13 != r11) goto L_0x00dd
        L_0x00d5:
            QB.N r13 = new QB.N
            r13.<init>(r4)
            r1.u(r13)
        L_0x00dd:
            nI.a r13 = (nI.C17631a) r13
            r1.P()
            SC.W1 r11 = new SC.W1
            r11.<init>(r7, r13)
            SC.w0 r13 = SC.C13651w0.Stacked
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            java.lang.String r14 = "StorePickerScreenTestTags-prompt"
            androidx.compose.ui.d r14 = androidx.compose.ui.platform.C5116k1.a(r7, r14)
            r7 = -1830263135(0xffffffff92e866a1, float:-1.4666558E-27)
            r1.W(r7)
            if (r6 != r9) goto L_0x00fa
            r10 = r12
        L_0x00fa:
            java.lang.Object r6 = r1.D()
            if (r10 != 0) goto L_0x0108
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r6 != r7) goto L_0x0110
        L_0x0108:
            QB.O r6 = new QB.O
            r6.<init>(r4)
            r1.u(r6)
        L_0x0110:
            r9 = r6
            nI.a r9 = (nI.C17631a) r9
            r1.P()
            QB.r r6 = QB.C13408r.f114176a
            nI.p r16 = r6.g()
            int r6 = SC.W1.f116045c
            int r7 = r6 << 3
            r10 = 12804096(0xc36000, float:1.794236E-38)
            r7 = r7 | r10
            int r6 = r6 << 6
            r17 = r7 | r6
            r18 = 64
            r12 = 0
            r6 = r0
            r7 = r8
            r8 = r11
            r10 = r14
            r11 = r13
            r13 = r16
            r14 = r1
            r15 = r17
            r16 = r18
            SC.Z1.c(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0143
            U0.C4895p.R()
        L_0x0143:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x015c
            QB.P r7 = new QB.P
            r0 = r7
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QB.w0.L(java.lang.String, java.lang.String, nI.a, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P(String str, String str2, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        L(str, str2, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void Q(C5834E e10, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C5834E e11 = e10;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(1744115061);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(e11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1744115061, i11, -1, "com.ingka.ikea.store.storepicker.impl.ui.ContentFailedLoading (StorePickerScreen.kt:740)");
            }
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d a10 = C5116k1.a(TC.e.i(D.m(J.f(aVar3, 0.0f, 1, (Object) null), 0.0f, e10.d(), 0.0f, 0.0f, 13, (Object) null)), "StorePickerScreenTestTags-error_screen");
            I a11 = C5080k.a(C5073d.f18068a.b(), C5437c.f24302a.g(), k10, 54);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, a10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar4.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a13);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, a11, aVar4.c());
            F1.c(a14, s10, aVar4.e());
            nI.p<C4504g, Integer, C16807N> b10 = aVar4.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e12, aVar4.d());
            C5862h hVar = C5862h.f28810a;
            String b11 = J1.j.b(C14551a.f127544q, k10, 0);
            C13679b.C2857b.C2858b bVar = C13679b.C2857b.C2858b.f116684a;
            j.a aVar5 = Y1.j.f14783b;
            C4889m mVar3 = k10;
            C13607l.j(b11, bVar, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, Y1.j.h(aVar5.a()), (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, mVar3, 48, 0, 261116);
            C5844O.a(J.i(aVar3, c2.h.B((float) 16)), k10, 6);
            C13607l.j(J1.j.b(C14551a.f127543p, k10, 0), C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, Y1.j.h(aVar5.a()), (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, mVar3, 48, 0, 261116);
            C5844O.a(J.i(aVar3, c2.h.B((float) 24)), k10, 6);
            mVar2 = k10;
            L.b(J1.j.b(Oo.b.f84498S0, k10, 0), C5116k1.a(aVar3, "StorePickerScreenTestTags-retry_button"), false, N.Secondary, (M) null, false, Integer.valueOf(C18148c.ArrowClockwise.m()), (K0) null, (r0.m) null, aVar, k10, (1879048192 & (i11 << 24)) | 3120, 436);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C13381Y(e11, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N R(C5834E e10, C17631a aVar, int i10, C4889m mVar, int i11) {
        Q(e10, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: nI.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void S(s0.C5834E r27, PB.f r28, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r29, nI.C17642l<? super PB.g, XH.C16807N> r30, nI.C17642l<? super java.lang.String, XH.C16807N> r31, nI.C17631a<XH.C16807N> r32, U0.C4889m r33, int r34) {
        /*
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r34
            r0 = -1825186083(0xffffffff9335dedd, float:-2.2955292E-27)
            r1 = r33
            U0.m r1 = r1.k(r0)
            r8 = r7 & 6
            r15 = r27
            if (r8 != 0) goto L_0x0026
            boolean r8 = r1.V(r15)
            if (r8 == 0) goto L_0x0023
            r8 = 4
            goto L_0x0024
        L_0x0023:
            r8 = 2
        L_0x0024:
            r8 = r8 | r7
            goto L_0x0027
        L_0x0026:
            r8 = r7
        L_0x0027:
            r9 = r7 & 48
            r10 = 32
            if (r9 != 0) goto L_0x0041
            r9 = r7 & 64
            if (r9 != 0) goto L_0x0036
            boolean r9 = r1.V(r2)
            goto L_0x003a
        L_0x0036:
            boolean r9 = r1.F(r2)
        L_0x003a:
            if (r9 == 0) goto L_0x003e
            r9 = r10
            goto L_0x0040
        L_0x003e:
            r9 = 16
        L_0x0040:
            r8 = r8 | r9
        L_0x0041:
            r9 = r7 & 384(0x180, float:5.38E-43)
            r11 = 256(0x100, float:3.59E-43)
            if (r9 != 0) goto L_0x0052
            boolean r9 = r1.F(r3)
            if (r9 == 0) goto L_0x004f
            r9 = r11
            goto L_0x0051
        L_0x004f:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0051:
            r8 = r8 | r9
        L_0x0052:
            r9 = r7 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0062
            boolean r9 = r1.F(r4)
            if (r9 == 0) goto L_0x005f
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0061
        L_0x005f:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0061:
            r8 = r8 | r9
        L_0x0062:
            r9 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0072
            boolean r9 = r1.F(r5)
            if (r9 == 0) goto L_0x006f
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0071
        L_0x006f:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0071:
            r8 = r8 | r9
        L_0x0072:
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r7
            if (r9 != 0) goto L_0x0083
            boolean r9 = r1.F(r6)
            if (r9 == 0) goto L_0x0080
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0082
        L_0x0080:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x0082:
            r8 = r8 | r9
        L_0x0083:
            r9 = 74899(0x12493, float:1.04956E-40)
            r9 = r9 & r8
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r9 != r13) goto L_0x0098
            boolean r9 = r1.l()
            if (r9 != 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            r1.L()
            goto L_0x01a5
        L_0x0098:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00a4
            r9 = -1
            java.lang.String r13 = "com.ingka.ikea.store.storepicker.impl.ui.ContentLoaded (StorePickerScreen.kt:397)"
            U0.C4895p.S(r0, r8, r9, r13)
        L_0x00a4:
            r0 = 3
            r9 = 0
            t0.A r0 = t0.C5935B.c(r9, r9, r1, r9, r0)
            r13 = 27795309(0x1a81f6d, float:6.175855E-38)
            r1.W(r13)
            java.lang.Object r13 = r1.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r12 = r16.a()
            if (r13 != r12) goto L_0x00c8
            QB.U r12 = new QB.U
            r12.<init>(r0)
            U0.A1 r13 = U0.p1.e(r12)
            r1.u(r13)
        L_0x00c8:
            U0.A1 r13 = (U0.A1) r13
            r1.P()
            boolean r12 = U(r13)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r14 = 27799158(0x1a82e76, float:6.178012E-38)
            r1.W(r14)
            r14 = r8 & 896(0x380, float:1.256E-42)
            r19 = 1
            if (r14 != r11) goto L_0x00e4
            r11 = r19
            goto L_0x00e5
        L_0x00e4:
            r11 = r9
        L_0x00e5:
            java.lang.Object r14 = r1.D()
            if (r11 != 0) goto L_0x00f1
            java.lang.Object r11 = r16.a()
            if (r14 != r11) goto L_0x00fa
        L_0x00f1:
            QB.w0$a r14 = new QB.w0$a
            r11 = 0
            r14.<init>(r3, r13, r11)
            r1.u(r14)
        L_0x00fa:
            nI.p r14 = (nI.p) r14
            r1.P()
            U0.P.g(r12, r14, r1, r9)
            androidx.compose.ui.d$a r20 = androidx.compose.ui.d.f18749a
            float r22 = r27.d()
            r25 = 13
            r26 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.D.m(r20, r21, r22, r23, r24, r25, r26)
            androidx.compose.ui.d r11 = z0.C6270a.a(r11)
            java.lang.String r12 = "StorePickerScreenTestTags-list"
            androidx.compose.ui.d r11 = androidx.compose.ui.platform.C5116k1.a(r11, r12)
            androidx.compose.foundation.layout.d r12 = androidx.compose.foundation.layout.C5073d.f18068a
            r13 = 8
            float r13 = (float) r13
            float r13 = c2.h.B(r13)
            androidx.compose.foundation.layout.d$f r12 = r12.n(r13)
            r13 = 27812399(0x1a8622f, float:6.185434E-38)
            r1.W(r13)
            r13 = r8 & 112(0x70, float:1.57E-43)
            if (r13 == r10) goto L_0x0144
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0142
            boolean r10 = r1.F(r2)
            if (r10 == 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            r10 = r9
            goto L_0x0146
        L_0x0144:
            r10 = r19
        L_0x0146:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r8
            r14 = 131072(0x20000, float:1.83671E-40)
            if (r13 != r14) goto L_0x0150
            r13 = r19
            goto L_0x0151
        L_0x0150:
            r13 = r9
        L_0x0151:
            r10 = r10 | r13
            r13 = r8 & 7168(0x1c00, float:1.0045E-41)
            r14 = 2048(0x800, float:2.87E-42)
            if (r13 != r14) goto L_0x015b
            r13 = r19
            goto L_0x015c
        L_0x015b:
            r13 = r9
        L_0x015c:
            r10 = r10 | r13
            r13 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r13
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r8 != r13) goto L_0x0167
            r9 = r19
        L_0x0167:
            r8 = r10 | r9
            java.lang.Object r9 = r1.D()
            if (r8 != 0) goto L_0x0175
            java.lang.Object r8 = r16.a()
            if (r9 != r8) goto L_0x017d
        L_0x0175:
            QB.V r9 = new QB.V
            r9.<init>(r2, r6, r4, r5)
            r1.u(r9)
        L_0x017d:
            r16 = r9
            nI.l r16 = (nI.C17642l) r16
            r1.P()
            r18 = 24576(0x6000, float:3.4438E-41)
            r19 = 236(0xec, float:3.31E-43)
            r10 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r20 = 0
            r8 = r11
            r9 = r0
            r11 = r13
            r13 = r14
            r14 = r17
            r15 = r20
            r17 = r1
            t0.C5937b.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01a5
            U0.C4895p.R()
        L_0x01a5:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x01c2
            QB.X r9 = new QB.X
            r0 = r9
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QB.w0.S(s0.E, PB.f, nI.l, nI.l, nI.l, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean T(C5934A a10) {
        return a10.s() == 0;
    }

    /* access modifiers changed from: private */
    public static final boolean U(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
        r11 = r11.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final XH.C16807N V(PB.f r10, nI.C17631a r11, nI.C17642l r12, nI.C17642l r13, t0.x r14) {
        /*
            java.lang.String r0 = "$this$LazyColumn"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            w1(r14, r10, r11)
            PB.b r11 = r10.c()
            PB.b$b r0 = PB.C13333b.C2799b.f113833a
            boolean r0 = kotlin.jvm.internal.C17542s.e(r11, r0)
            if (r0 == 0) goto L_0x0019
            e1(r14)
            goto L_0x0091
        L_0x0019:
            boolean r0 = r11 instanceof PB.C13333b.c
            if (r0 == 0) goto L_0x0089
            PB.e r11 = r10.i()
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x0034
            PB.e r11 = r10.i()
            KJ.c r11 = r11.b()
            r2 = 0
            XH.v r11 = XH.C16796C.a(r2, r11)
        L_0x0032:
            r4 = r1
            goto L_0x005a
        L_0x0034:
            PB.b r11 = r10.c()
            PB.b$c r11 = (PB.C13333b.c) r11
            PB.g r11 = r11.b()
            if (r11 == 0) goto L_0x0041
            r1 = r0
        L_0x0041:
            PB.b r11 = r10.c()
            PB.b$c r11 = (PB.C13333b.c) r11
            PB.g r11 = r11.b()
            PB.b r2 = r10.c()
            PB.b$c r2 = (PB.C13333b.c) r2
            KJ.c r2 = r2.c()
            XH.v r11 = XH.C16796C.a(r11, r2)
            goto L_0x0032
        L_0x005a:
            java.lang.Object r1 = r11.a()
            r2 = r1
            PB.g r2 = (PB.g) r2
            java.lang.Object r11 = r11.b()
            r3 = r11
            KJ.c r3 = (KJ.C15987c) r3
            PB.d r11 = r10.f()
            if (r11 == 0) goto L_0x0077
            PB.g r11 = r11.c()
            if (r11 != 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r5 = r11
            goto L_0x0078
        L_0x0077:
            r5 = r2
        L_0x0078:
            boolean r11 = r10.d()
            r9 = r11 ^ 1
            boolean r7 = r10.g()
            r1 = r14
            r6 = r12
            r8 = r13
            b1(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0091
        L_0x0089:
            PB.b$a r10 = PB.C13333b.a.f113832a
            boolean r10 = kotlin.jvm.internal.C17542s.e(r11, r10)
            if (r10 == 0) goto L_0x0094
        L_0x0091:
            XH.N r10 = XH.C16807N.f139792a
            return r10
        L_0x0094:
            XH.t r10 = new XH.t
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: QB.w0.V(PB.f, nI.a, nI.l, nI.l, t0.x):XH.N");
    }

    /* access modifiers changed from: private */
    public static final C16807N W(C5834E e10, PB.f fVar, C17642l lVar, C17642l lVar2, C17642l lVar3, C17631a aVar, int i10, C4889m mVar, int i11) {
        S(e10, fVar, lVar, lVar2, lVar3, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void X(boolean z10, boolean z11, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1803966066);
        if ((i10 & 6) == 0) {
            i11 = (k10.b(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.b(z11) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1803966066, i11, -1, "com.ingka.ikea.store.storepicker.impl.ui.FloatingActionButton (StorePickerScreen.kt:366)");
            }
            l0.d.g(z10, (androidx.compose.ui.d) null, androidx.compose.animation.g.o((m0.N) null, 0.0f, 3, (Object) null), androidx.compose.animation.k.f17452a.a(), (String) null, c1.c.e(-1427999818, true, new b((C5626f) k10.Q(C5100f0.f()), z11, aVar), k10, 54), k10, (i11 & 14) | 196992, 18);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13375S(z10, z11, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(boolean z10, boolean z11, C17631a aVar, int i10, C4889m mVar, int i11) {
        X(z10, z11, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void Z(boolean r11, nI.C17642l<? super PB.C13332a, XH.C16807N> r12, U0.C4889m r13, int r14) {
        /*
            r0 = 347606705(0x14b80eb1, float:1.8585047E-26)
            U0.m r13 = r13.k(r0)
            r1 = r14 & 6
            r2 = 4
            if (r1 != 0) goto L_0x0017
            boolean r1 = r13.b(r11)
            if (r1 == 0) goto L_0x0014
            r1 = r2
            goto L_0x0015
        L_0x0014:
            r1 = 2
        L_0x0015:
            r1 = r1 | r14
            goto L_0x0018
        L_0x0017:
            r1 = r14
        L_0x0018:
            r3 = r14 & 48
            r7 = 32
            if (r3 != 0) goto L_0x0029
            boolean r3 = r13.F(r12)
            if (r3 == 0) goto L_0x0026
            r3 = r7
            goto L_0x0028
        L_0x0026:
            r3 = 16
        L_0x0028:
            r1 = r1 | r3
        L_0x0029:
            r3 = r1 & 19
            r4 = 18
            if (r3 != r4) goto L_0x003b
            boolean r3 = r13.l()
            if (r3 != 0) goto L_0x0036
            goto L_0x003b
        L_0x0036:
            r13.L()
            goto L_0x0148
        L_0x003b:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0047
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.store.storepicker.impl.ui.HandleLocationPermission (StorePickerScreen.kt:150)"
            U0.C4895p.S(r0, r1, r3, r4)
        L_0x0047:
            Ww.a$b r0 = Ww.a.b.f117681a
            r3 = 1426648252(0x5508ecbc, float:9.4093967E12)
            r13.W(r3)
            r8 = r1 & 112(0x70, float:1.57E-43)
            r9 = 1
            r10 = 0
            if (r8 != r7) goto L_0x0057
            r3 = r9
            goto L_0x0058
        L_0x0057:
            r3 = r10
        L_0x0058:
            java.lang.Object r4 = r13.D()
            if (r3 != 0) goto L_0x0066
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x006e
        L_0x0066:
            QB.s0 r4 = new QB.s0
            r4.<init>(r12)
            r13.u(r4)
        L_0x006e:
            nI.l r4 = (nI.C17642l) r4
            r13.P()
            int r3 = Ww.a.b.f117684d
            Ww.b r0 = Ww.d.b(r0, r4, r13, r3, r10)
            Ww.r$b r3 = r0.c()
            r4 = 1426659086(0x5509170e, float:9.420757E12)
            r13.W(r4)
            boolean r4 = r13.V(r0)
            if (r8 != r7) goto L_0x008b
            r5 = r9
            goto L_0x008c
        L_0x008b:
            r5 = r10
        L_0x008c:
            r4 = r4 | r5
            java.lang.Object r5 = r13.D()
            r6 = 0
            if (r4 != 0) goto L_0x009c
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x00a4
        L_0x009c:
            QB.w0$c r5 = new QB.w0$c
            r5.<init>(r0, r12, r6)
            r13.u(r5)
        L_0x00a4:
            nI.p r5 = (nI.p) r5
            r13.P()
            U0.P.g(r3, r5, r13, r10)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
            r4 = 1426680225(0x550969a1, float:9.4429229E12)
            r13.W(r4)
            r1 = r1 & 14
            if (r1 != r2) goto L_0x00bc
            r2 = r9
            goto L_0x00bd
        L_0x00bc:
            r2 = r10
        L_0x00bd:
            boolean r4 = r13.V(r0)
            r2 = r2 | r4
            java.lang.Object r4 = r13.D()
            if (r2 != 0) goto L_0x00d0
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x00d8
        L_0x00d0:
            QB.w0$d r4 = new QB.w0$d
            r4.<init>(r11, r0, r6)
            r13.u(r4)
        L_0x00d8:
            nI.p r4 = (nI.p) r4
            r13.P()
            U0.P.g(r3, r4, r13, r1)
            androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_RESUME
            r0 = 1426685466(0x55097e1a, float:9.4484184E12)
            r13.W(r0)
            if (r8 != r7) goto L_0x00ec
            r0 = r9
            goto L_0x00ed
        L_0x00ec:
            r0 = r10
        L_0x00ed:
            java.lang.Object r2 = r13.D()
            if (r0 != 0) goto L_0x00fb
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0103
        L_0x00fb:
            QB.t0 r2 = new QB.t0
            r2.<init>(r12)
            r13.u(r2)
        L_0x0103:
            r3 = r2
            nI.a r3 = (nI.C17631a) r3
            r13.P()
            r5 = 6
            r6 = 2
            r2 = 0
            r4 = r13
            j3.c.a(r1, r2, r3, r4, r5, r6)
            androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_PAUSE
            r0 = 1426688441(0x550989b9, float:9.451538E12)
            r13.W(r0)
            if (r8 != r7) goto L_0x011b
            goto L_0x011c
        L_0x011b:
            r9 = r10
        L_0x011c:
            java.lang.Object r0 = r13.D()
            if (r9 != 0) goto L_0x012a
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x0132
        L_0x012a:
            QB.u0 r0 = new QB.u0
            r0.<init>(r12)
            r13.u(r0)
        L_0x0132:
            r3 = r0
            nI.a r3 = (nI.C17631a) r3
            r13.P()
            r5 = 6
            r6 = 2
            r2 = 0
            r4 = r13
            j3.c.a(r1, r2, r3, r4, r5, r6)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0148
            U0.C4895p.R()
        L_0x0148:
            U0.Y0 r13 = r13.n()
            if (r13 == 0) goto L_0x0156
            QB.v0 r0 = new QB.v0
            r0.<init>(r11, r12, r14)
            r13.a(r0)
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QB.w0.Z(boolean, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N a0(C17642l lVar) {
        lVar.invoke(C13332a.h.f113822a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N b0(C17642l lVar) {
        lVar.invoke(C13332a.g.f113821a);
        return C16807N.f139792a;
    }

    private static final void b1(x xVar, PB.g gVar, C15987c<PB.g> cVar, boolean z10, PB.g gVar2, C17642l<? super PB.g, C16807N> lVar, boolean z11, C17642l<? super String, C16807N> lVar2, boolean z12) {
        PB.g gVar3 = gVar;
        String str = null;
        if (gVar3 != null) {
            n1(xVar, gVar, C17542s.e(gVar.j(), gVar2 != null ? gVar2.j() : null), z12, z11, new C13390d0(lVar, gVar3), new C13392e0(lVar2, gVar3));
        } else {
            C17642l<? super PB.g, C16807N> lVar3 = lVar;
            C17642l<? super String, C16807N> lVar4 = lVar2;
        }
        if (!cVar.isEmpty()) {
            if (gVar2 != null) {
                str = gVar2.j();
            }
            q1(xVar, cVar, z10, str, lVar, z11, lVar2, z12);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c0(boolean z10, C17642l lVar, int i10, C4889m mVar, int i11) {
        Z(z10, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N c1(C17642l lVar, PB.g gVar) {
        lVar.invoke(gVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d0(C17642l lVar, r.a aVar) {
        C17542s.j(aVar, "initialState");
        if (aVar instanceof r.a.C2905a) {
            lVar.invoke(C13332a.d.f113815a);
        } else if (!C17542s.e(aVar, r.a.b.f117719a)) {
            throw new XH.t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d1(C17642l lVar, PB.g gVar) {
        lVar.invoke(gVar.j());
        return C16807N.f139792a;
    }

    private static final void e0(PB.f fVar, L0 l02, C17642l<? super C13332a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        int i12;
        PB.f fVar2 = fVar;
        L0 l03 = l02;
        C17642l<? super C13332a, C16807N> lVar2 = lVar;
        int i13 = i10;
        C4889m k10 = mVar.k(1384606654);
        if ((i13 & 6) == 0) {
            i11 = ((i13 & 8) == 0 ? k10.V(fVar2) : k10.F(fVar2) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.V(l03) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1384606654, i11, -1, "com.ingka.ikea.store.storepicker.impl.ui.HandleUserMessage (StorePickerScreen.kt:583)");
            }
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            k10.W(1017227729);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            PB.h n10 = fVar.n();
            k10.W(1017231217);
            boolean F10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && k10.F(fVar2))) | ((i11 & 112) == 32) | k10.F(context) | ((i11 & 896) == 256);
            Object D11 = k10.D();
            if (F10 || D11 == aVar.a()) {
                i12 = 0;
                e eVar = new e(fVar, l02, context, lVar, r0Var, (C17164e<? super e>) null);
                k10.u(eVar);
                D11 = eVar;
            } else {
                i12 = 0;
            }
            k10.P();
            P.g(n10, (nI.p) D11, k10, i12);
            mVar2 = k10;
            l0.d.g(f0(r0Var), (androidx.compose.ui.d) null, (androidx.compose.animation.i) null, (androidx.compose.animation.k) null, (String) null, c1.c.e(-196167018, true, new f(lVar2, r0Var), k10, 54), mVar2, ImageMetadata.EDGE_MODE, 30);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new C13369L(fVar2, l03, lVar2, i13));
        }
    }

    private static final void e1(x xVar) {
        x.a(xVar, 5, (C17642l) null, (C17642l) null, C13408r.f114176a.h(), 6, (Object) null);
    }

    private static final boolean f0(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void f1(x xVar) {
        xVar.b("emptySearchResult", new C13382Z(), C13408r.f114176a.e());
    }

    /* access modifiers changed from: private */
    public static final void g0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final String g1() {
        return "HeaderScanAndGo";
    }

    /* access modifiers changed from: private */
    public static final C16807N h0(PB.f fVar, L0 l02, C17642l lVar, int i10, C4889m mVar, int i11) {
        e0(fVar, l02, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void h1(x xVar, PB.f fVar) {
        xVar.b("lazyListTitle", new i0(), c1.c.c(-42675500, true, new o(fVar)));
    }

    /* access modifiers changed from: private */
    public static final void i0(C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(2008133936);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2008133936, i11, -1, "com.ingka.ikea.store.storepicker.impl.ui.LocationSettingsPrompt (StorePickerScreen.kt:636)");
            }
            String b10 = J1.j.b(C14551a.f127534g, k10, 0);
            String b11 = J1.j.b(Oo.b.f84478Q0, k10, 0);
            k10.W(2061824564);
            boolean z10 = true;
            boolean z11 = (i11 & 14) == 4;
            if ((i11 & 112) != 32) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new C13384a0(aVar, aVar2);
                k10.u(D10);
            }
            k10.P();
            W1 w12 = new W1(b11, (C17631a) D10);
            W1 w13 = new W1(J1.j.b(Oo.b.f84488R0, k10, 0), aVar2);
            C13651w0 w0Var = C13651w0.Stacked;
            androidx.compose.ui.d a10 = C5116k1.a(androidx.compose.ui.d.f18749a, "StorePickerScreenTestTags-prompt-settings");
            nI.p<C4889m, Integer, C16807N> f10 = C13408r.f114176a.f();
            int i12 = W1.f116045c;
            Z1.c(b10, w12, w13, aVar2, a10, w0Var, (androidx.compose.ui.window.h) null, f10, k10, (i12 << 6) | (i12 << 3) | 12804096 | ((i11 << 6) & 7168), 64);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13386b0(aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final String i1() {
        return "HeaderScanAndGo";
    }

    /* access modifiers changed from: private */
    public static final C16807N j0(C17631a aVar, C17631a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return C16807N.f139792a;
    }

    private static final void j1(x xVar, C17631a<C16807N> aVar) {
        xVar.b("lazyFindNearbyButton", new C13394f0(), c1.c.c(-181389116, true, new p(aVar)));
    }

    /* access modifiers changed from: private */
    public static final C16807N k0(C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        i0(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String k1() {
        return "NearbyButton";
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l0(java.lang.String r28, androidx.compose.ui.d r29, U0.C4889m r30, int r31, int r32) {
        /*
            r0 = r28
            r1 = 2
            r15 = 6
            r2 = 1109565045(0x42229e75, float:40.654743)
            r3 = r30
            U0.m r14 = r3.k(r2)
            r3 = 1
            r4 = r32 & 1
            if (r4 == 0) goto L_0x0015
            r4 = r31 | 6
            goto L_0x0027
        L_0x0015:
            r4 = r31 & 6
            if (r4 != 0) goto L_0x0025
            boolean r4 = r14.V(r0)
            if (r4 == 0) goto L_0x0021
            r4 = 4
            goto L_0x0022
        L_0x0021:
            r4 = r1
        L_0x0022:
            r4 = r31 | r4
            goto L_0x0027
        L_0x0025:
            r4 = r31
        L_0x0027:
            r1 = r32 & 2
            r5 = 16
            if (r1 == 0) goto L_0x0032
            r4 = r4 | 48
        L_0x002f:
            r6 = r29
            goto L_0x0043
        L_0x0032:
            r6 = r31 & 48
            if (r6 != 0) goto L_0x002f
            r6 = r29
            boolean r7 = r14.V(r6)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0042
        L_0x0041:
            r7 = r5
        L_0x0042:
            r4 = r4 | r7
        L_0x0043:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0056
            boolean r7 = r14.l()
            if (r7 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r14.L()
            r1 = r14
            goto L_0x0150
        L_0x0056:
            if (r1 == 0) goto L_0x005d
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r26 = r1
            goto L_0x005f
        L_0x005d:
            r26 = r6
        L_0x005f:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x006b
            r1 = -1
            java.lang.String r6 = "com.ingka.ikea.store.storepicker.impl.ui.SectionTitle (StorePickerScreen.kt:864)"
            U0.C4895p.S(r2, r4, r1, r6)
        L_0x006b:
            androidx.compose.ui.d r1 = TC.e.i(r26)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r2 = r2.g()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$b r6 = r6.k()
            r7 = 0
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r6, r14, r7)
            int r6 = U0.C4883j.a(r14, r7)
            U0.y r7 = r14.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r14, r1)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r14.m()
            if (r10 != 0) goto L_0x009b
            U0.C4883j.c()
        L_0x009b:
            r14.I()
            boolean r10 = r14.i()
            if (r10 == 0) goto L_0x00a8
            r14.p(r9)
            goto L_0x00ab
        L_0x00a8:
            r14.t()
        L_0x00ab:
            U0.m r9 = U0.F1.a(r14)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r2, r10)
            nI.p r2 = r8.e()
            U0.F1.c(r9, r7, r2)
            nI.p r2 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x00d5
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x00e3
        L_0x00d5:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r2)
        L_0x00e3:
            nI.p r2 = r8.d()
            U0.F1.c(r9, r1, r2)
            s0.h r1 = s0.C5862h.f28810a
            TC.b$b$c r1 = TC.C13679b.C2857b.c.f116685a
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            float r2 = (float) r5
            float r2 = c2.h.B(r2)
            r5 = 0
            r6 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r13, r6, r2, r3, r5)
            r3 = r4 & 14
            r3 = r3 | 432(0x1b0, float:6.05E-43)
            r23 = r3
            r24 = 0
            r25 = 262136(0x3fff8, float:3.67331E-40)
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r16 = 0
            r27 = r13
            r13 = r16
            r29 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r0 = r28
            r22 = r29
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = 12
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            r1 = r27
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r1, r0)
            r1 = r29
            r2 = 6
            s0.C5844O.a(r0, r1, r2)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x014e
            U0.C4895p.R()
        L_0x014e:
            r6 = r26
        L_0x0150:
            U0.Y0 r0 = r1.n()
            if (r0 == 0) goto L_0x0164
            QB.T r1 = new QB.T
            r2 = r28
            r3 = r31
            r4 = r32
            r1.<init>(r2, r6, r3, r4)
            r0.a(r1)
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QB.w0.l0(java.lang.String, androidx.compose.ui.d, U0.m, int, int):void");
    }

    private static final void l1(x xVar) {
        xVar.b("showScanAndGoHeader", new C13396g0(), C13408r.f114176a.d());
    }

    /* access modifiers changed from: private */
    public static final C16807N m0(String str, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        l0(str, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String m1() {
        return "HeaderScanAndGo";
    }

    public static final void n0(PB.i iVar, C17642l<? super C13334c, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(iVar, "viewModel");
        C17542s.j(lVar, "onNavigateTo");
        C4889m k10 = mVar.k(1354287527);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(iVar) : k10.F(iVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1354287527, i12, -1, "com.ingka.ikea.store.storepicker.impl.ui.StorePickerScreen (StorePickerScreen.kt:125)");
            }
            A1 c10 = j3.a.c(iVar.getState(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
            C13334c h10 = o0(c10).h();
            k10.W(1629785631);
            boolean z10 = true;
            int i13 = i12 & 14;
            boolean V10 = k10.V(c10) | ((i12 & 112) == 32) | (i13 == 4 || ((i12 & 8) != 0 && k10.F(iVar)));
            Object D10 = k10.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new g(c10, lVar, iVar, (C17164e<? super g>) null);
                k10.u(D10);
            }
            k10.P();
            P.g(h10, (nI.p) D10, k10, 0);
            boolean e10 = o0(c10).e();
            k10.W(1629793545);
            boolean z11 = i13 == 4 || ((i12 & 8) != 0 && k10.F(iVar));
            Object D11 = k10.D();
            if (z11 || D11 == C4889m.f14007a.a()) {
                D11 = new h(iVar);
                k10.u(D11);
            }
            k10.P();
            Z(e10, (C17642l) ((C18059h) D11), k10, 0);
            PB.f o02 = o0(c10);
            k10.W(1629796585);
            if (i13 != 4 && ((i12 & 8) == 0 || !k10.F(iVar))) {
                z10 = false;
            }
            Object D12 = k10.D();
            if (z10 || D12 == C4889m.f14007a.a()) {
                D12 = new i(iVar);
                k10.u(D12);
            }
            k10.P();
            q0(o02, (C17642l) ((C18059h) D12), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new o0(iVar, lVar, i10));
        }
    }

    private static final void n1(x xVar, PB.g gVar, boolean z10, boolean z11, boolean z12, C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
        x xVar2 = xVar;
        xVar.b("header-sectionCurrentStore", new j0(), C13408r.f114176a.b());
        xVar.b(gVar.j(), new k0(), c1.c.c(1184948045, true, new q(gVar, aVar2, z12, z10, z11, aVar)));
    }

    /* access modifiers changed from: private */
    public static final PB.f o0(A1<PB.f> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final String o1() {
        return "SectionHeader";
    }

    /* access modifiers changed from: private */
    public static final C16807N p0(PB.i iVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        n0(iVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String p1() {
        return "StoreItem";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: U0.A1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q0(PB.f r24, nI.C17642l<? super PB.C13332a, XH.C16807N> r25, U0.C4889m r26, int r27) {
        /*
            r6 = r24
            r7 = r25
            r8 = r27
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "onAction"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            r0 = 525525665(0x1f52e2a1, float:4.4656693E-20)
            r1 = r26
            U0.m r5 = r1.k(r0)
            r1 = r8 & 6
            r2 = 4
            r3 = 2
            if (r1 != 0) goto L_0x0033
            r1 = r8 & 8
            if (r1 != 0) goto L_0x0028
            boolean r1 = r5.V(r6)
            goto L_0x002c
        L_0x0028:
            boolean r1 = r5.F(r6)
        L_0x002c:
            if (r1 == 0) goto L_0x0030
            r1 = r2
            goto L_0x0031
        L_0x0030:
            r1 = r3
        L_0x0031:
            r1 = r1 | r8
            goto L_0x0034
        L_0x0033:
            r1 = r8
        L_0x0034:
            r4 = r8 & 48
            r15 = 32
            if (r4 != 0) goto L_0x0045
            boolean r4 = r5.F(r7)
            if (r4 == 0) goto L_0x0042
            r4 = r15
            goto L_0x0044
        L_0x0042:
            r4 = 16
        L_0x0044:
            r1 = r1 | r4
        L_0x0045:
            r4 = r1 & 19
            r9 = 18
            if (r4 != r9) goto L_0x0058
            boolean r4 = r5.l()
            if (r4 != 0) goto L_0x0052
            goto L_0x0058
        L_0x0052:
            r5.L()
            r2 = r5
            goto L_0x0284
        L_0x0058:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0064
            r4 = -1
            java.lang.String r9 = "com.ingka.ikea.store.storepicker.impl.ui.StorePickerScreenUi (StorePickerScreen.kt:205)"
            U0.C4895p.S(r0, r1, r4, r9)
        L_0x0064:
            r0 = -1661096982(0xffffffff9cfdabea, float:-1.6786574E-21)
            r5.W(r0)
            java.lang.Object r0 = r5.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r9 = r4.a()
            if (r0 != r9) goto L_0x007e
            O0.L0 r0 = new O0.L0
            r0.<init>()
            r5.u(r0)
        L_0x007e:
            O0.L0 r0 = (O0.L0) r0
            r5.P()
            r9 = r1 & 14
            r10 = r9 | 48
            int r11 = r1 << 3
            r11 = r11 & 896(0x380, float:1.256E-42)
            r10 = r10 | r11
            e0(r6, r0, r7, r5, r10)
            r10 = -1661090548(0xffffffff9cfdc50c, float:-1.6793071E-21)
            r5.W(r10)
            java.lang.Object r10 = r5.D()
            java.lang.Object r11 = r4.a()
            r14 = 0
            if (r10 != r11) goto L_0x00a9
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            U0.r0 r10 = U0.u1.e(r10, r14, r3, r14)
            r5.u(r10)
        L_0x00a9:
            r13 = r10
            U0.r0 r13 = (U0.C4899r0) r13
            r5.P()
            r10 = -1661088801(0xffffffff9cfdcbdf, float:-1.6794835E-21)
            r5.W(r10)
            boolean r10 = r0(r13)
            r12 = 0
            if (r10 == 0) goto L_0x0153
            PB.b r10 = r24.c()
            boolean r10 = r10 instanceof PB.C13333b.c
            if (r10 == 0) goto L_0x0153
            PB.b r10 = r24.c()
            PB.b$c r10 = (PB.C13333b.c) r10
            PB.g r10 = r10.b()
            java.lang.String r16 = ""
            if (r10 == 0) goto L_0x00d8
            java.lang.String r10 = r10.h()
            if (r10 != 0) goto L_0x00da
        L_0x00d8:
            r10 = r16
        L_0x00da:
            PB.d r17 = r24.f()
            if (r17 == 0) goto L_0x00ef
            PB.g r17 = r17.c()
            if (r17 == 0) goto L_0x00ef
            java.lang.String r17 = r17.h()
            if (r17 != 0) goto L_0x00ed
            goto L_0x00ef
        L_0x00ed:
            r16 = r17
        L_0x00ef:
            r11 = -1661080791(0xffffffff9cfdeb29, float:-1.6802923E-21)
            r5.W(r11)
            if (r9 == r2) goto L_0x0104
            r2 = r1 & 8
            if (r2 == 0) goto L_0x0102
            boolean r2 = r5.F(r6)
            if (r2 == 0) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            r2 = r12
            goto L_0x0105
        L_0x0104:
            r2 = 1
        L_0x0105:
            r9 = r1 & 112(0x70, float:1.57E-43)
            if (r9 != r15) goto L_0x010b
            r9 = 1
            goto L_0x010c
        L_0x010b:
            r9 = r12
        L_0x010c:
            r2 = r2 | r9
            java.lang.Object r9 = r5.D()
            if (r2 != 0) goto L_0x0119
            java.lang.Object r2 = r4.a()
            if (r9 != r2) goto L_0x0121
        L_0x0119:
            QB.K r9 = new QB.K
            r9.<init>(r6, r7)
            r5.u(r9)
        L_0x0121:
            r11 = r9
            nI.a r11 = (nI.C17631a) r11
            r5.P()
            r2 = -1661074992(0xffffffff9cfe01d0, float:-1.6808779E-21)
            r5.W(r2)
            java.lang.Object r2 = r5.D()
            java.lang.Object r9 = r4.a()
            if (r2 != r9) goto L_0x013f
            QB.W r2 = new QB.W
            r2.<init>(r13)
            r5.u(r2)
        L_0x013f:
            nI.a r2 = (nI.C17631a) r2
            r5.P()
            r17 = 3072(0xc00, float:4.305E-42)
            r9 = r10
            r10 = r16
            r3 = r12
            r12 = r2
            r2 = r13
            r13 = r5
            r14 = r17
            L(r9, r10, r11, r12, r13, r14)
            goto L_0x0155
        L_0x0153:
            r3 = r12
            r2 = r13
        L_0x0155:
            r5.P()
            PB.e r9 = r24.i()
            r10 = -1661072284(0xffffffff9cfe0c64, float:-1.6811513E-21)
            r5.W(r10)
            boolean r9 = r5.V(r9)
            java.lang.Object r10 = r5.D()
            if (r9 != 0) goto L_0x0172
            java.lang.Object r9 = r4.a()
            if (r10 != r9) goto L_0x017e
        L_0x0172:
            QB.h0 r9 = new QB.h0
            r9.<init>(r6)
            U0.A1 r10 = U0.p1.e(r9)
            r5.u(r10)
        L_0x017e:
            r16 = r10
            U0.A1 r16 = (U0.A1) r16
            r5.P()
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r10 = -1661067902(0xffffffff9cfe1d82, float:-1.6815938E-21)
            r5.W(r10)
            java.lang.Object r10 = r5.D()
            java.lang.Object r11 = r4.a()
            if (r10 != r11) goto L_0x019f
            QB.p0 r10 = new QB.p0
            r10.<init>()
            r5.u(r10)
        L_0x019f:
            r12 = r10
            nI.a r12 = (nI.C17631a) r12
            r5.P()
            r14 = 3072(0xc00, float:4.305E-42)
            r17 = 6
            r10 = 0
            r11 = 0
            r13 = r5
            r3 = r15
            r15 = r17
            java.lang.Object r9 = f1.C5301c.e(r9, r10, r11, r12, r13, r14, r15)
            U0.r0 r9 = (U0.C4899r0) r9
            boolean r10 = w0(r16)
            r11 = -1661051573(0xffffffff9cfe5d4b, float:-1.6832426E-21)
            r5.W(r11)
            boolean r11 = r5.V(r9)
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r3) goto L_0x01c9
            r12 = 1
            goto L_0x01ca
        L_0x01c9:
            r12 = 0
        L_0x01ca:
            r1 = r11 | r12
            java.lang.Object r3 = r5.D()
            if (r1 != 0) goto L_0x01d8
            java.lang.Object r1 = r4.a()
            if (r3 != r1) goto L_0x01e0
        L_0x01d8:
            QB.q0 r3 = new QB.q0
            r3.<init>(r7, r9)
            r5.u(r3)
        L_0x01e0:
            nI.a r3 = (nI.C17631a) r3
            r5.P()
            r1 = 0
            e.C5281d.a(r10, r3, r5, r1, r1)
            r1 = -1661049461(0xffffffff9cfe658b, float:-1.6834558E-21)
            r5.W(r1)
            java.lang.Object r1 = r5.D()
            java.lang.Object r3 = r4.a()
            if (r1 != r3) goto L_0x0204
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3 = 2
            r4 = 0
            U0.r0 r1 = U0.u1.e(r1, r4, r3, r4)
            r5.u(r1)
        L_0x0204:
            r10 = r1
            U0.r0 r10 = (U0.C4899r0) r10
            r5.P()
            s0.T$a r1 = s0.C5848T.f28733a
            r3 = 6
            s0.T r1 = s0.a0.c(r1, r5, r3)
            s0.Y$a r3 = s0.C5853Y.f28774a
            int r3 = r3.i()
            s0.T r1 = s0.C5850V.i(r1, r3)
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r11 = s0.C5851W.d(r3, r1)
            O0.O$a r1 = O0.O.f9935a
            int r14 = r1.a()
            QB.w0$j r12 = new QB.w0$j
            r13 = r0
            r0 = r12
            r1 = r24
            r15 = r2
            r2 = r25
            r3 = r9
            r4 = r10
            r9 = r5
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1963138661(0x75031e65, float:1.6621274E32)
            r1 = 54
            r2 = 1
            c1.a r0 = c1.c.e(r0, r2, r12, r9, r1)
            QB.w0$k r3 = new QB.w0$k
            r3.<init>(r13)
            r4 = 1418266087(0x548905e7, float:4.7080764E12)
            c1.a r12 = c1.c.e(r4, r2, r3, r9, r1)
            QB.w0$l r3 = new QB.w0$l
            r3.<init>(r6, r7, r15)
            r4 = 1145829800(0x444bf9a8, float:815.9009)
            c1.a r13 = c1.c.e(r4, r2, r3, r9, r1)
            QB.w0$m r3 = new QB.w0$m
            r3.<init>(r6, r7, r10)
            r4 = -1268716432(0xffffffffb460ec70, float:-2.0947641E-7)
            c1.a r20 = c1.c.e(r4, r2, r3, r9, r1)
            r22 = 805334064(0x30006c30, float:4.671987E-10)
            r23 = 452(0x1c4, float:6.33E-43)
            r1 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r2 = r9
            r9 = r11
            r10 = r0
            r11 = r1
            r21 = r2
            O0.C4762x0.a(r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21, r22, r23)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0284
            U0.C4895p.R()
        L_0x0284:
            U0.Y0 r0 = r2.n()
            if (r0 == 0) goto L_0x0292
            QB.r0 r1 = new QB.r0
            r1.<init>(r6, r7, r8)
            r0.a(r1)
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QB.w0.q0(PB.f, nI.l, U0.m, int):void");
    }

    private static final void q1(x xVar, C15987c<PB.g> cVar, boolean z10, String str, C17642l<? super PB.g, C16807N> lVar, boolean z11, C17642l<? super String, C16807N> lVar2, boolean z12) {
        x xVar2 = xVar;
        C15987c<PB.g> cVar2 = cVar;
        if (z10) {
            xVar.b("header-sectionOtherStores", new l0(), C13408r.f114176a.i());
        }
        xVar.e(cVar.size(), new r(new m0(), cVar), new s(new n0(), cVar), c1.c.c(-632812321, true, new t(cVar, str, lVar2, z11, z12, lVar)));
        x.i(xVar, (Object) null, (Object) null, C13408r.f114176a.j(), 3, (Object) null);
    }

    private static final boolean r0(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final String r1() {
        return "SectionHeader";
    }

    /* access modifiers changed from: private */
    public static final void s0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final Object s1(PB.g gVar) {
        C17542s.j(gVar, "it");
        return gVar.j();
    }

    /* access modifiers changed from: private */
    public static final C16807N t0(PB.f fVar, C17642l lVar) {
        PB.g c10;
        PB.d f10 = fVar.f();
        if (!(f10 == null || (c10 = f10.c()) == null)) {
            lVar.invoke(new C13332a.l(c10));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object t1(PB.g gVar) {
        C17542s.j(gVar, "it");
        return "StoreItem";
    }

    /* access modifiers changed from: private */
    public static final C16807N u0(C4899r0 r0Var) {
        s0(r0Var, false);
        return C16807N.f139792a;
    }

    private static final void u1(x xVar, boolean z10) {
        xVar.b("showStockDisclaimerHeader", new C13388c0(), c1.c.c(-560415729, true, new w(z10)));
    }

    /* access modifiers changed from: private */
    public static final boolean v0(PB.f fVar) {
        return fVar.i() != null;
    }

    /* access modifiers changed from: private */
    public static final String v1() {
        return "HeaderStockDisclaimer";
    }

    /* access modifiers changed from: private */
    public static final boolean w0(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final void w1(x xVar, PB.f fVar, C17631a<C16807N> aVar) {
        PB.e i10 = fVar.i();
        if (i10 == null) {
            h1(xVar, fVar);
            if (fVar.j()) {
                j1(xVar, aVar);
            }
            if (fVar.k()) {
                l1(xVar);
            }
            u1(xVar, fVar.l());
        } else if (i10.a()) {
            f1(xVar);
        }
    }

    /* access modifiers changed from: private */
    public static final C4899r0 x0() {
        return u1.e((Object) null, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final String y0(C4899r0<String> r0Var) {
        return r0Var.getValue();
    }

    private static final void z0(C4899r0<String> r0Var, String str) {
        r0Var.setValue(str);
    }
}
