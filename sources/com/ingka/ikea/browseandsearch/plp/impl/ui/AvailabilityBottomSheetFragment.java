package com.ingka.ikea.browseandsearch.plp.impl.ui;

import Cn.C10655a;
import Cn.C10656b;
import MB.C13194a;
import QJ.Q;
import TJ.C16532g;
import TJ.C16534i;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.L;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import com.ingka.ikea.browseandsearch.plp.impl.ui.a;
import com.ingka.ikea.store.datalayer.StorageType;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import dI.C17164e;
import eI.C17187b;
import gE.C14515b;
import gE.C14516c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import x4.C;
import x4.C8948l;
import x4.C8951o;
import yn.C12472s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010,\u001a\u00020'8\u0016XD¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/impl/ui/AvailabilityBottomSheetFragment;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "", "<init>", "()V", "LXH/N;", "S0", "T0", "U0", "W0", "X0", "u0", "(LU0/m;I)V", "B0", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "LgE/c;", "U", "LgE/c;", "R0", "()LgE/c;", "setZipSelectorNavigation", "(LgE/c;)V", "zipSelectorNavigation", "LMB/a;", "X", "LMB/a;", "P0", "()LMB/a;", "setStorePickerNavigation", "(LMB/a;)V", "storePickerNavigation", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/a;", "Y", "LXH/o;", "Q0", "()Lcom/ingka/ikea/browseandsearch/plp/impl/ui/a;", "viewModel", "", "Z", "Ljava/lang/String;", "O0", "()Ljava/lang/String;", "destId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AvailabilityBottomSheetFragment extends b {

    /* renamed from: U  reason: collision with root package name */
    public C14516c f93474U;

    /* renamed from: X  reason: collision with root package name */
    public C13194a f93475X;

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f93476Y;

    /* renamed from: Z  reason: collision with root package name */
    private final String f93477Z = "browseAndSearch/availability";

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.AvailabilityBottomSheetFragment$BottomSheetContent$3$1", f = "AvailabilityBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93478c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AvailabilityBottomSheetFragment f93479d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AvailabilityBottomSheetFragment availabilityBottomSheetFragment, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f93479d = availabilityBottomSheetFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f93479d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f93478c == 0) {
                y.b(obj);
                this.f93479d.x0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f93480a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.ingka.ikea.browseandsearch.plp.impl.ui.a$c[] r0 = com.ingka.ikea.browseandsearch.plp.impl.ui.a.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.browseandsearch.plp.impl.ui.a$c r1 = com.ingka.ikea.browseandsearch.plp.impl.ui.a.c.OPEN_ZIP_SELECTOR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.browseandsearch.plp.impl.ui.a$c r1 = com.ingka.ikea.browseandsearch.plp.impl.ui.a.c.OPEN_STORE_PICKER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f93480a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.plp.impl.ui.AvailabilityBottomSheetFragment.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.AvailabilityBottomSheetFragment$observeNavigationResult$$inlined$consumeResult$1", f = "AvailabilityBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends l implements p<C14515b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93481c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f93482d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f93483e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f93484f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ AvailabilityBottomSheetFragment f93485g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C8948l lVar, String str, C17164e eVar, AvailabilityBottomSheetFragment availabilityBottomSheetFragment) {
            super(2, eVar);
            this.f93483e = lVar;
            this.f93484f = str;
            this.f93485g = availabilityBottomSheetFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f93483e, this.f93484f, eVar, this.f93485g);
            cVar.f93482d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C14515b bVar, C17164e<? super C16807N> eVar) {
            return ((c) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f93481c == 0) {
                y.b(obj);
                Object obj2 = this.f93482d;
                if (obj2 != null) {
                    C14515b bVar = (C14515b) obj2;
                    if (!C17542s.e(bVar, C14515b.a.f127306a)) {
                        if (bVar instanceof C14515b.C3121b) {
                            this.f93485g.Q0().E(((C14515b.C3121b) bVar).b());
                        } else {
                            throw new t();
                        }
                    }
                    this.f93483e.h().m(this.f93484f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.AvailabilityBottomSheetFragment$observeStorePickerResult$$inlined$consumeResult$1", f = "AvailabilityBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
    public static final class d extends l implements p<C13194a.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93486c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f93487d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f93488e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f93489f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ AvailabilityBottomSheetFragment f93490g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C8948l lVar, String str, C17164e eVar, AvailabilityBottomSheetFragment availabilityBottomSheetFragment) {
            super(2, eVar);
            this.f93488e = lVar;
            this.f93489f = str;
            this.f93490g = availabilityBottomSheetFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f93488e, this.f93489f, eVar, this.f93490g);
            dVar.f93487d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(C13194a.b bVar, C17164e<? super C16807N> eVar) {
            return ((d) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f93486c == 0) {
                y.b(obj);
                Object obj2 = this.f93487d;
                if (obj2 != null) {
                    C13194a.b bVar = (C13194a.b) obj2;
                    this.f93490g.Q0().F();
                    this.f93488e.h().m(this.f93489f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f93491a;

        e(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f93491a = lVar;
        }

        public final C16818i<?> c() {
            return this.f93491a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f93491a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93492c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar) {
            super(0);
            this.f93492c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f93492c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93493c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar) {
            super(0);
            this.f93493c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f93493c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f93494c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C16824o oVar) {
            super(0);
            this.f93494c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f93494c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93495c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93496d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C17631a aVar, C16824o oVar) {
            super(0);
            this.f93495c = aVar;
            this.f93496d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f93495c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f93496d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93497c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93498d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f93497c = oVar;
            this.f93498d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f93498d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f93497c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public AvailabilityBottomSheetFragment() {
        C16824o a10 = C16825p.a(s.NONE, new g(new f(this)));
        this.f93476Y = W.b(this, P.b(a.class), new h(a10), new i((C17631a) null, a10), new j(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N K0(AvailabilityBottomSheetFragment availabilityBottomSheetFragment) {
        availabilityBottomSheetFragment.X0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(AvailabilityBottomSheetFragment availabilityBottomSheetFragment) {
        availabilityBottomSheetFragment.W0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final a Q0() {
        return (a) this.f93476Y.getValue();
    }

    private final void S0() {
        if (rw.a.b(this)) {
            C8948l E10 = androidx.navigation.fragment.a.a(this).E(O0());
            C16532g R10 = C16534i.R(C5208k.a(E10.h().i("ManualPostalCodeBottomSheetRequestKey", null), E10.getLifecycle(), r.b.RESUMED), new c(E10, "ManualPostalCodeBottomSheetRequestKey", (C17164e) null, this));
            C5221y viewLifecycleOwner = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C16534i.M(R10, C5222z.a(viewLifecycleOwner));
        }
    }

    private final void T0() {
        C8948l E10 = androidx.navigation.fragment.a.a(this).E(O0());
        C16532g R10 = C16534i.R(C5208k.a(E10.h().i("StorePickerFragment.Result.Key", null), E10.getLifecycle(), r.b.RESUMED), new d(E10, "StorePickerFragment.Result.Key", (C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    private final void U0() {
        Q0().D().observe(getViewLifecycleOwner(), new e(new C10655a(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N V0(AvailabilityBottomSheetFragment availabilityBottomSheetFragment, a.c cVar) {
        C17542s.j(cVar, "event");
        int i10 = b.f93480a[cVar.ordinal()];
        if (i10 == 1) {
            availabilityBottomSheetFragment.X0();
        } else if (i10 == 2) {
            availabilityBottomSheetFragment.W0();
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    private final void W0() {
        C8951o f10 = rw.f.f(this, O0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C13194a.C2742a.a(P0(), f10, StorageType.LOCAL, (String) null, false, (String) null, (C) null, 60, (Object) null);
        }
    }

    private final void X0() {
        C8951o f10 = rw.f.f(this, O0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            R0().a(f10, false, "");
        }
    }

    /* access modifiers changed from: protected */
    public void B0() {
        super.B0();
        T0();
        U0();
        S0();
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        return null;
    }

    public String O0() {
        return this.f93477Z;
    }

    public final C13194a P0() {
        C13194a aVar = this.f93475X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("storePickerNavigation");
        return null;
    }

    public final C14516c R0() {
        C14516c cVar = this.f93474U;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("zipSelectorNavigation");
        return null;
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(55505701);
        if (C4895p.J()) {
            C4895p.S(55505701, i10, -1, "com.ingka.ikea.browseandsearch.plp.impl.ui.AvailabilityBottomSheetFragment.BottomSheetContent (AvailabilityBottomSheetFragment.kt:40)");
        }
        a Q02 = Q0();
        mVar.W(-1300533881);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new C10656b(this);
            mVar.u(D10);
        }
        C17631a aVar = (C17631a) D10;
        mVar.P();
        mVar.W(-1300531033);
        boolean F11 = mVar.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new Cn.c(this);
            mVar.u(D11);
        }
        mVar.P();
        C12472s.p(Q02, aVar, (C17631a) D11, mVar, 0);
        C16807N n10 = C16807N.f139792a;
        mVar.W(-1300528127);
        boolean F12 = mVar.F(this);
        Object D12 = mVar.D();
        if (F12 || D12 == C4889m.f14007a.a()) {
            D12 = new a(this, (C17164e<? super a>) null);
            mVar.u(D12);
        }
        mVar.P();
        U0.P.g(n10, (p) D12, mVar, 6);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
