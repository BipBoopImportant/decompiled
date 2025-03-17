package com.ingka.ikea.app.inspire;

import HJ.C15854t;
import Jg.o;
import PA.C13331a;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.inspire.b;
import com.ingka.ikea.core.model.Media;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import on.C11687b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rq.C11841a;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u00105\u001a\u0002008\u0016XD¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010:\u001a\u0002068\u0014XD¢\u0006\f\n\u0004\b7\u0010\u0019\u001a\u0004\b8\u00109R\u001a\u0010=\u001a\u0002068\u0014XD¢\u0006\f\n\u0004\b;\u0010\u0019\u001a\u0004\b<\u00109R\u001a\u0010?\u001a\u0002068\u0014XD¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b>\u00109R\u001b\u0010E\u001a\u00020@8BX\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00050F8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/ingka/ikea/app/inspire/InspirationFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LXH/N;", "D0", "(LU0/m;I)V", "LUs/a;", "X", "LUs/a;", "getInspireNavigation", "()LUs/a;", "setInspireNavigation", "(LUs/a;)V", "inspireNavigation", "LIo/a;", "Y", "LIo/a;", "H0", "()LIo/a;", "setCommercialContentNavigation", "(LIo/a;)V", "commercialContentNavigation", "LPA/a;", "Z", "LPA/a;", "L0", "()LPA/a;", "setShoppableImageNavigation", "(LPA/a;)V", "shoppableImageNavigation", "Lrq/a;", "y0", "Lrq/a;", "I0", "()Lrq/a;", "setEnlargeImagesNavigation", "(Lrq/a;)V", "enlargeImagesNavigation", "Lon/b;", "z0", "Lon/b;", "K0", "()Lon/b;", "setPlpNavigation", "(Lon/b;)V", "plpNavigation", "", "A0", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "", "B0", "v0", "()Z", "drawUnderStatusBar", "C0", "u0", "drawUnderNavigationBar", "t0", "drawUnderDisplayCutout", "LKg/b;", "E0", "LXH/o;", "J0", "()LKg/b;", "inspireViewModel", "Lkotlin/Function1;", "Lcom/ingka/ikea/app/inspire/b;", "F0", "LnI/l;", "handleScreenUiEvents", "inspire-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InspirationFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    private final String f71987A0 = "inspire/feed?&filter={filter}&inspirationId={inspirationId}";

    /* renamed from: B0  reason: collision with root package name */
    private final boolean f71988B0;

    /* renamed from: C0  reason: collision with root package name */
    private final boolean f71989C0;

    /* renamed from: D0  reason: collision with root package name */
    private final boolean f71990D0;

    /* renamed from: E0  reason: collision with root package name */
    private final C16824o f71991E0;

    /* renamed from: F0  reason: collision with root package name */
    private final C17642l<b, C16807N> f71992F0;

    /* renamed from: X  reason: collision with root package name */
    public Us.a f71993X;

    /* renamed from: Y  reason: collision with root package name */
    public Io.a f71994Y;

    /* renamed from: Z  reason: collision with root package name */
    public C13331a f71995Z;

    /* renamed from: y0  reason: collision with root package name */
    public C11841a f71996y0;

    /* renamed from: z0  reason: collision with root package name */
    public C11687b f71997z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f71998a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                kp.i$a[] r0 = kp.i.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kp.i$a r1 = kp.i.a.SHOPPABLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kp.i$a r1 = kp.i.a.USER_CONTENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kp.i$a r1 = kp.i.a.REGULAR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                kp.i$a r1 = kp.i.a.VIDEO     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f71998a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.inspire.InspirationFragment.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f71999c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f71999c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f71999c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f72000c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f72000c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f72000c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f72001c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f72001c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f72001c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f72002c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f72003d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f72002c = aVar;
            this.f72003d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f72002c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f72003d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f72004c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f72005d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f72004c = oVar;
            this.f72005d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f72005d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f72004c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public InspirationFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f71991E0 = W.b(this, P.b(Kg.b.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
        this.f71992F0 = new Fg.a(this);
    }

    private final Kg.b J0() {
        return (Kg.b) this.f71991E0.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N M0(InspirationFragment inspirationFragment, b bVar) {
        C17542s.j(bVar, "event");
        if (C17542s.e(bVar, b.a.f72009a)) {
            androidx.navigation.fragment.a.a(inspirationFragment).k0();
        } else if (bVar instanceof b.C1235b) {
            inspirationFragment.L0().j(androidx.navigation.fragment.a.a(inspirationFragment), ((b.C1235b) bVar).a(), C13331a.b.INSPIRATION);
        } else if (bVar instanceof b.e) {
            b.e eVar = (b.e) bVar;
            C11687b.C2346b.b(inspirationFragment.K0(), eVar.a(), eVar.b(), C11687b.e.CATEGORY, Interaction$Component.ACTION_HEADER, androidx.navigation.fragment.a.a(inspirationFragment), (List) null, (List) null, (String) null, 224, (Object) null);
        } else if (bVar instanceof b.d) {
            inspirationFragment.H0().d(androidx.navigation.fragment.a.a(inspirationFragment), ((b.d) bVar).a());
        } else if (bVar instanceof b.c) {
            b.c cVar = (b.c) bVar;
            int i10 = a.f71998a[cVar.a().d().ordinal()];
            if (i10 == 1 || i10 == 2) {
                inspirationFragment.L0().j(androidx.navigation.fragment.a.a(inspirationFragment), cVar.a().b(), C13331a.b.SHOPPABLE);
            } else if (i10 == 3) {
                inspirationFragment.I0().e(androidx.navigation.fragment.a.a(inspirationFragment), new Media[]{new Media.Image(cVar.a().e(), cVar.a().a())}, 0);
            } else if (i10 == 4) {
                IllegalStateException illegalStateException = new IllegalStateException("Video should not be clickable.");
                qv.e eVar2 = qv.e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar2, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = inspirationFragment.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar2.a(eVar2, str4, false, illegalStateException, str3);
                    str = str3;
                    str2 = str4;
                }
            } else {
                throw new t();
            }
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-1214683495);
        if (C4895p.J()) {
            C4895p.S(-1214683495, i10, -1, "com.ingka.ikea.app.inspire.InspirationFragment.FragmentContent (InspirationFragment.kt:58)");
        }
        o.v(J0(), this.f71992F0, mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final Io.a H0() {
        Io.a aVar = this.f71994Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("commercialContentNavigation");
        return null;
    }

    public final C11841a I0() {
        C11841a aVar = this.f71996y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("enlargeImagesNavigation");
        return null;
    }

    public final C11687b K0() {
        C11687b bVar = this.f71997z0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("plpNavigation");
        return null;
    }

    public final C13331a L0() {
        C13331a aVar = this.f71995Z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("shoppableImageNavigation");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f71990D0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f71989C0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f71988B0;
    }
}
