package com.ingka.ikea.instore.impl.ui;

import At.a;
import HJ.C15854t;
import It.D;
import It.I;
import It.q;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import TJ.C16532g;
import TJ.C16534i;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import XH.y;
import ZC.C13892o;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import com.ingka.ikea.core.android.fragments.j;
import com.ingka.ikea.instore.impl.navigation.InstoreRoutes$StorePage;
import com.sugarcube.core.logger.DslKt;
import dH.C17158b;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.J0;
import p1.O;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import uI.C18055d;
import ug.k;
import vm.C12190a;
import wt.C12302a;
import x3.r;
import x4.C8948l;
import x4.C8951o;
import x4.v;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 i2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001jB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH@¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010$\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010\u0005\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00060/8\u0016X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010*R\"\u0010>\u001a\u0002078\u0006@\u0006X.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010O\u001a\u00020G8\u0006@\u0006X.¢\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bN\u0010\u0005\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020P8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0016\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010]\u001a\u00020W8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010`\u001a\u00020\u00138\u0014XD¢\u0006\f\n\u0004\b^\u0010*\u001a\u0004\b_\u0010\u0015R\u001a\u0010c\u001a\u00020\u00138\u0014XD¢\u0006\f\n\u0004\ba\u0010*\u001a\u0004\bb\u0010\u0015R\u001a\u0010f\u001a\u00020\u00138\u0014XD¢\u0006\f\n\u0004\bd\u0010*\u001a\u0004\be\u0010\u0015R\u0016\u0010h\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010*¨\u0006k"}, d2 = {"Lcom/ingka/ikea/instore/impl/ui/InstoreFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "Lcom/ingka/ikea/core/android/fragments/j;", "<init>", "()V", "LXH/N;", "X0", "W0", "", "number", "Lp1/J0;", "P0", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LuI/d;", "Lcom/ingka/ikea/instore/impl/navigation/InstoreRoutes$StorePage;", "T0", "()LuI/d;", "l0", "", "Y", "()Z", "D0", "(LU0/m;I)V", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "Landroidx/lifecycle/i0$c;", "X", "Landroidx/lifecycle/i0$c;", "U0", "()Landroidx/lifecycle/i0$c;", "setViewModelFactory", "(Landroidx/lifecycle/i0$c;)V", "getViewModelFactory$annotations", "viewModelFactory", "LIt/D;", "LXH/o;", "Q0", "()LIt/D;", "instoreViewModel", "Z", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "y0", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "z0", "navControllerRequiredTaskRemaining", "LHt/c;", "A0", "LHt/c;", "R0", "()LHt/c;", "setNavigationContract", "(LHt/c;)V", "navigationContract", "Lvm/a;", "B0", "Lvm/a;", "N0", "()Lvm/a;", "setBarcode", "(Lvm/a;)V", "barcode", "LQJ/M;", "C0", "LQJ/M;", "O0", "()LQJ/M;", "setDispatcher", "(LQJ/M;)V", "getDispatcher$annotations", "dispatcher", "Lug/k;", "Lug/k;", "getLabsFeatures", "()Lug/k;", "setLabsFeatures", "(Lug/k;)V", "labsFeatures", "Lx3/r;", "Lx3/r;", "S0", "()Lx3/r;", "setSimpleCache", "(Lx3/r;)V", "simpleCache", "F0", "v0", "drawUnderStatusBar", "G0", "u0", "drawUnderNavigationBar", "H0", "t0", "drawUnderDisplayCutout", "I0", "isScrolledToTop", "J0", "a", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InstoreFragment extends a implements j {

    /* renamed from: J0  reason: collision with root package name */
    public static final a f96318J0 = new a((DefaultConstructorMarker) null);

    /* renamed from: K0  reason: collision with root package name */
    public static final int f96319K0 = 8;

    /* renamed from: A0  reason: collision with root package name */
    public Ht.c f96320A0;

    /* renamed from: B0  reason: collision with root package name */
    public C12190a f96321B0;

    /* renamed from: C0  reason: collision with root package name */
    public M f96322C0;

    /* renamed from: D0  reason: collision with root package name */
    public k f96323D0;

    /* renamed from: E0  reason: collision with root package name */
    public r f96324E0;

    /* renamed from: F0  reason: collision with root package name */
    private final boolean f96325F0 = true;

    /* renamed from: G0  reason: collision with root package name */
    private final boolean f96326G0;

    /* renamed from: H0  reason: collision with root package name */
    private final boolean f96327H0;
    /* access modifiers changed from: private */

    /* renamed from: I0  reason: collision with root package name */
    public boolean f96328I0 = true;

    /* renamed from: X  reason: collision with root package name */
    public i0.c f96329X;

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f96330Y = C16825p.b(new mu.b(this));

    /* renamed from: Z  reason: collision with root package name */
    private final String f96331Z = "";

    /* renamed from: y0  reason: collision with root package name */
    private final C17631a<C16807N> f96332y0 = new mu.c(this);

    /* renamed from: z0  reason: collision with root package name */
    private boolean f96333z0 = true;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/instore/impl/ui/InstoreFragment$a;", "", "<init>", "()V", "", "BARCODE_SIZE", "I", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InstoreFragment f96334a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C12302a f96335b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ InstoreFragment f96336a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C12302a f96337b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.instore.impl.ui.InstoreFragment$b$a$a  reason: collision with other inner class name */
            /* synthetic */ class C2137a extends C17540p implements p<String, C17164e<? super J0>, Object> {
                C2137a(Object obj) {
                    super(2, obj, InstoreFragment.class, "getFamilyQrCode", "getFamilyQrCode(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                }

                /* renamed from: t */
                public final Object invoke(String str, C17164e<? super J0> eVar) {
                    return ((InstoreFragment) this.receiver).P0(str, eVar);
                }
            }

            a(InstoreFragment instoreFragment, C12302a aVar) {
                this.f96336a = instoreFragment;
                this.f96337b = aVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(InstoreFragment instoreFragment, boolean z10) {
                instoreFragment.f96328I0 = z10;
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: nI.l} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(U0.C4889m r8, int r9) {
                /*
                    r7 = this;
                    r0 = r9 & 3
                    r1 = 2
                    if (r0 != r1) goto L_0x0011
                    boolean r0 = r8.l()
                    if (r0 != 0) goto L_0x000c
                    goto L_0x0011
                L_0x000c:
                    r8.L()
                    goto L_0x0094
                L_0x0011:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x0020
                    r0 = -1
                    java.lang.String r1 = "com.ingka.ikea.instore.impl.ui.InstoreFragment.FragmentContent.<anonymous>.<anonymous> (InstoreFragment.kt:108)"
                    r2 = -1800352046(0xffffffff94b0ced2, float:-1.7853035E-26)
                    U0.C4895p.S(r2, r9, r0, r1)
                L_0x0020:
                    com.ingka.ikea.instore.impl.ui.InstoreFragment r9 = r7.f96336a
                    It.D r0 = r9.Q0()
                    com.ingka.ikea.instore.impl.ui.InstoreFragment r9 = r7.f96336a
                    x4.o r1 = androidx.navigation.fragment.a.a(r9)
                    wt.a r9 = r7.f96337b
                    Ht.c r4 = r9.L1()
                    com.ingka.ikea.instore.impl.ui.InstoreFragment r9 = r7.f96336a
                    r2 = -1824478197(0xffffffff9340ac0b, float:-2.431863E-27)
                    r8.W(r2)
                    boolean r2 = r8.F(r9)
                    java.lang.Object r3 = r8.D()
                    if (r2 != 0) goto L_0x004c
                    U0.m$a r2 = U0.C4889m.f14007a
                    java.lang.Object r2 = r2.a()
                    if (r3 != r2) goto L_0x0054
                L_0x004c:
                    com.ingka.ikea.instore.impl.ui.InstoreFragment$b$a$a r3 = new com.ingka.ikea.instore.impl.ui.InstoreFragment$b$a$a
                    r3.<init>(r9)
                    r8.u(r3)
                L_0x0054:
                    uI.h r3 = (uI.C18059h) r3
                    r8.P()
                    r2 = r3
                    nI.p r2 = (nI.p) r2
                    r9 = -1824476302(0xffffffff9340b372, float:-2.432228E-27)
                    r8.W(r9)
                    com.ingka.ikea.instore.impl.ui.InstoreFragment r9 = r7.f96336a
                    boolean r9 = r8.F(r9)
                    com.ingka.ikea.instore.impl.ui.InstoreFragment r3 = r7.f96336a
                    java.lang.Object r5 = r8.D()
                    if (r9 != 0) goto L_0x0078
                    U0.m$a r9 = U0.C4889m.f14007a
                    java.lang.Object r9 = r9.a()
                    if (r5 != r9) goto L_0x0080
                L_0x0078:
                    com.ingka.ikea.instore.impl.ui.b r5 = new com.ingka.ikea.instore.impl.ui.b
                    r5.<init>(r3)
                    r8.u(r5)
                L_0x0080:
                    r3 = r5
                    nI.l r3 = (nI.C17642l) r3
                    r8.P()
                    r6 = 0
                    r5 = r8
                    ut.P.d(r0, r1, r2, r3, r4, r5, r6)
                    boolean r8 = U0.C4895p.J()
                    if (r8 == 0) goto L_0x0094
                    U0.C4895p.R()
                L_0x0094:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.impl.ui.InstoreFragment.b.a.b(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        b(InstoreFragment instoreFragment, C12302a aVar) {
            this.f96334a = instoreFragment;
            this.f96335b = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2024000402, i10, -1, "com.ingka.ikea.instore.impl.ui.InstoreFragment.FragmentContent.<anonymous> (InstoreFragment.kt:107)");
                }
                C4910x.a(C13892o.H().d(this.f96334a.S0()), c1.c.e(-1800352046, true, new a(this.f96334a, this.f96335b), mVar, 54), mVar, U0.J0.f13770i | 48);
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
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f96338a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                At.a$a[] r0 = At.a.C1465a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                At.a$a r1 = At.a.C1465a.ChangeStore     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                At.a$a r1 = At.a.C1465a.OrderDone     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f96338a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.impl.ui.InstoreFragment.c.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lp1/J0;", "<anonymous>", "(LQJ/Q;)Lp1/J0;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.ui.InstoreFragment$getFamilyQrCode$2", f = "InstoreFragment.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super J0>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f96339c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f96340d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ InstoreFragment f96341e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, InstoreFragment instoreFragment, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f96340d = str;
            this.f96341e = instoreFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f96340d, this.f96341e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super J0> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Bitmap a10;
            C17187b.f();
            if (this.f96339c == 0) {
                y.b(obj);
                if (this.f96340d == null || (a10 = this.f96341e.N0().a(this.f96340d, C12190a.C2496a.QR_CODE, 96, 96, true, 0, false)) == null) {
                    return null;
                }
                return O.c(a10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.ui.InstoreFragment$observeFoodMobileResult$$inlined$consumeResult$1", f = "InstoreFragment.kt", l = {}, m = "invokeSuspend")
    public static final class e extends l implements p<a.C1465a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f96342c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f96343d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f96344e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f96345f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ InstoreFragment f96346g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C8948l lVar, String str, C17164e eVar, InstoreFragment instoreFragment) {
            super(2, eVar);
            this.f96344e = lVar;
            this.f96345f = str;
            this.f96346g = instoreFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f96344e, this.f96345f, eVar, this.f96346g);
            eVar2.f96343d = obj;
            return eVar2;
        }

        /* renamed from: i */
        public final Object invoke(a.C1465a aVar, C17164e<? super C16807N> eVar) {
            return ((e) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f96342c == 0) {
                y.b(obj);
                Object obj2 = this.f96343d;
                if (obj2 != null) {
                    a.C1465a aVar = (a.C1465a) obj2;
                    InstoreFragment instoreFragment = this.f96346g;
                    qv.e eVar = qv.e.DEBUG;
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
                            String a10 = C11818a.a("Food Mobile Fragment result received: " + aVar, (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = instoreFragment.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar.a(eVar, str4, false, (Throwable) null, str3);
                        str = str3;
                        str2 = str4;
                    }
                    int i10 = c.f96338a[aVar.ordinal()];
                    if (i10 == 1) {
                        this.f96346g.X0();
                    } else if (i10 != 2) {
                        throw new t();
                    }
                    this.f96344e.h().m(this.f96345f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N M0(InstoreFragment instoreFragment) {
        if (instoreFragment.f96333z0) {
            instoreFragment.f96333z0 = false;
            instoreFragment.W0();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final Object P0(String str, C17164e<? super J0> eVar) {
        return C16310i.g(O0(), new d(str, this, (C17164e<? super d>) null), eVar);
    }

    /* access modifiers changed from: private */
    public final D Q0() {
        return (D) this.f96330Y.getValue();
    }

    /* access modifiers changed from: private */
    public static final D V0(InstoreFragment instoreFragment) {
        return instoreFragment.f96329X != null ? (D) new i0((k0) instoreFragment, instoreFragment.U0()).a(D.class) : (D) new i0((k0) instoreFragment).a(I.class);
    }

    private final void W0() {
        Object obj;
        if (rw.a.b(this)) {
            C8951o a10 = androidx.navigation.fragment.a.a(this);
            int g10 = C4.j.g(InstoreRoutes$StorePage.Companion.serializer());
            Class<InstoreRoutes$StorePage> cls = InstoreRoutes$StorePage.class;
            if (C8951o.A(a10, a10.L(), g10, true, (v) null, 4, (Object) null) != null) {
                List value = a10.G().getValue();
                ListIterator listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (((C8948l) obj).e().x() == g10) {
                        break;
                    }
                }
                C8948l lVar = (C8948l) obj;
                if (lVar != null) {
                    C16532g R10 = C16534i.R(C5208k.a(lVar.h().i(a.C1465a.REQUEST_KEY, null), lVar.getLifecycle(), r.b.RESUMED), new e(lVar, a.C1465a.REQUEST_KEY, (C17164e) null, this));
                    C5221y viewLifecycleOwner = getViewLifecycleOwner();
                    C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C16534i.M(R10, C5222z.a(viewLifecycleOwner));
                    return;
                }
                throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
            }
            throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
        }
    }

    /* access modifiers changed from: private */
    public final void X0() {
        C8951o f10 = rw.f.f(this, T0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            R0().p(f10);
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(1488985784);
        if (C4895p.J()) {
            C4895p.S(1488985784, i10, -1, "com.ingka.ikea.instore.impl.ui.InstoreFragment.FragmentContent (InstoreFragment.kt:104)");
        }
        TC.e.e(false, c1.c.e(2024000402, true, new b(this, (C12302a) C17158b.c(this, C12302a.class)), mVar, 54), mVar, 48, 1);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        if (rw.a.b(this) && this.f96333z0) {
            this.f96333z0 = false;
            W0();
        }
    }

    public final C12190a N0() {
        C12190a aVar = this.f96321B0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("barcode");
        return null;
    }

    public final M O0() {
        M m10 = this.f96322C0;
        if (m10 != null) {
            return m10;
        }
        C17542s.z("dispatcher");
        return null;
    }

    public final Ht.c R0() {
        Ht.c cVar = this.f96320A0;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("navigationContract");
        return null;
    }

    public final x3.r S0() {
        x3.r rVar = this.f96324E0;
        if (rVar != null) {
            return rVar;
        }
        C17542s.z("simpleCache");
        return null;
    }

    public C18055d<InstoreRoutes$StorePage> T0() {
        return P.b(InstoreRoutes$StorePage.class);
    }

    public final i0.c U0() {
        i0.c cVar = this.f96329X;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("viewModelFactory");
        return null;
    }

    public boolean Y() {
        return this.f96328I0;
    }

    public void d0() {
        j.a.a(this);
    }

    public void l0() {
        Q0().b(q.w.f82407a);
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f96327H0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f96326G0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f96325F0;
    }
}
