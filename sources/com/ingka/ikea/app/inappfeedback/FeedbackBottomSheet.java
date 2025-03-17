package com.ingka.ikea.app.inappfeedback;

import E1.I;
import Eg.b;
import G1.C4504g;
import HJ.C15854t;
import QJ.C16297b0;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.y;
import YH.C16877v;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.m;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.inappfeedback.e;
import com.ingka.ikea.app.inappfeedback.i;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import ip.j;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import s0.C5862h;
import xg.n;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001b\u0010&\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/FeedbackBottomSheet;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "LXH/N;", "Q0", "LEg/b;", "L0", "()LEg/b;", "M0", "Lcom/ingka/ikea/app/inappfeedback/i;", "result", "T0", "(Lcom/ingka/ikea/app/inappfeedback/i;)V", "u0", "(LU0/m;I)V", "B0", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "", "U", "Z", "hasSetResultValue", "Lcom/ingka/ikea/app/inappfeedback/e;", "X", "LXH/o;", "O0", "()Lcom/ingka/ikea/app/inappfeedback/e;", "feedbackArguments", "", "Y", "getRequestKey", "()Ljava/lang/String;", "requestKey", "LEg/c;", "P0", "()LEg/c;", "surveyViewModel", "y0", "b", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FeedbackBottomSheet extends Hilt_FeedbackBottomSheet {

    /* renamed from: y0  reason: collision with root package name */
    public static final b f71908y0 = new b((DefaultConstructorMarker) null);

    /* renamed from: z0  reason: collision with root package name */
    public static final int f71909z0 = 8;

    /* renamed from: U  reason: collision with root package name */
    private boolean f71910U;

    /* renamed from: X  reason: collision with root package name */
    private final C16824o f71911X = C16825p.b(new g(this));

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f71912Y = C16825p.b(new h(this));

    /* renamed from: Z  reason: collision with root package name */
    private final C16824o f71913Z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.inappfeedback.FeedbackBottomSheet$BottomSheetContent$2$1", f = "FeedbackBottomSheet.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71914c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FeedbackBottomSheet f71915d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FeedbackBottomSheet feedbackBottomSheet, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f71915d = feedbackBottomSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f71915d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f71914c == 0) {
                y.b(obj);
                this.f71915d.x0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/FeedbackBottomSheet$b;", "", "<init>", "()V", "", "requestKey", "Lcom/ingka/ikea/app/inappfeedback/e;", "feedbackArguments", "Lcom/ingka/ikea/app/inappfeedback/FeedbackBottomSheet;", "a", "(Ljava/lang/String;Lcom/ingka/ikea/app/inappfeedback/e;)Lcom/ingka/ikea/app/inappfeedback/FeedbackBottomSheet;", "TAG", "Ljava/lang/String;", "FEEDBACK_ARGUMENTS", "FEEDBACK_REQUEST_KEY", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FeedbackBottomSheet a(String str, e eVar) {
            C17542s.j(str, "requestKey");
            C17542s.j(eVar, "feedbackArguments");
            FeedbackBottomSheet feedbackBottomSheet = new FeedbackBottomSheet();
            feedbackBottomSheet.setArguments(D2.d.b(C16796C.a("feedback_arguments", eVar), C16796C.a("feedback_request_key", str)));
            return feedbackBottomSheet;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/app/inappfeedback/FeedbackBottomSheet$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedbackBottomSheet f71916a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, FeedbackBottomSheet feedbackBottomSheet) {
            super(aVar);
            this.f71916a = feedbackBottomSheet;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            FeedbackBottomSheet feedbackBottomSheet = this.f71916a;
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = feedbackBottomSheet.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.inappfeedback.FeedbackBottomSheet$delayedDismiss$2", f = "FeedbackBottomSheet.kt", l = {117}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71917c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FeedbackBottomSheet f71918d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FeedbackBottomSheet feedbackBottomSheet, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f71918d = feedbackBottomSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f71918d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f71917c;
            if (i10 == 0) {
                y.b(obj);
                long millis = TimeUnit.SECONDS.toMillis(2);
                this.f71917c = 1;
                if (C16297b0.b(millis, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f71918d.dismiss();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f71919c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar) {
            super(0);
            this.f71919c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f71919c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f71920c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar) {
            super(0);
            this.f71920c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f71920c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f71921c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C16824o oVar) {
            super(0);
            this.f71921c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f71921c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f71922c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f71923d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C17631a aVar, C16824o oVar) {
            super(0);
            this.f71922c = aVar;
            this.f71923d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f71922c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f71923d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f71924c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f71925d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f71924c = oVar;
            this.f71925d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f71925d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f71924c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public FeedbackBottomSheet() {
        C16824o a10 = C16825p.a(s.NONE, new f(new e(this)));
        this.f71913Z = W.b(this, P.b(Eg.c.class), new g(a10), new h((C17631a) null, a10), new i(this, a10));
    }

    private final Eg.b L0() {
        e O02 = O0();
        Iterable<e.b> b10 = O02.b();
        ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
        for (e.b bVar : b10) {
            arrayList.add(new b.a(bVar.a(), bVar.d(), bVar.c(), bVar.b()));
        }
        return new Eg.b(O02.d(), O02.c(), O02.e(), O02.a(), arrayList, Interaction$Component.CHECKOUT_SURVEY, 0, 64, (DefaultConstructorMarker) null);
    }

    private final void M0() {
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner), new c(N.f137593c0, this), (T) null, new d(this, (C17164e<? super d>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final e N0(FeedbackBottomSheet feedbackBottomSheet) {
        Parcelable parcelable = feedbackBottomSheet.requireArguments().getParcelable("feedback_arguments");
        if (parcelable != null) {
            return (e) parcelable;
        }
        throw new IllegalArgumentException("Feedback arguments are required for this dialog");
    }

    private final e O0() {
        return (e) this.f71911X.getValue();
    }

    private final Eg.c P0() {
        return (Eg.c) this.f71913Z.getValue();
    }

    private final void Q0() {
        j.a(P0().E(), this, new f(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N R0(FeedbackBottomSheet feedbackBottomSheet, Cg.a aVar) {
        C17542s.j(aVar, "it");
        feedbackBottomSheet.T0(new i.b(aVar));
        feedbackBottomSheet.M0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String S0(FeedbackBottomSheet feedbackBottomSheet) {
        String string = feedbackBottomSheet.requireArguments().getString("feedback_request_key");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Feedback arguments are required for this dialog");
    }

    private final void T0(i iVar) {
        if (!this.f71910U) {
            C5197z.c(this, getRequestKey(), D2.d.b(C16796C.a("FeedbackBottomSheetBundleKey", iVar)));
            this.f71910U = true;
        }
    }

    private final String getRequestKey() {
        return (String) this.f71912Y.getValue();
    }

    /* access modifiers changed from: protected */
    public void B0() {
        P0().K(L0());
        Q0();
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        T0(i.a.f71959a);
        return null;
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(1331146750);
        if (C4895p.J()) {
            C4895p.S(1331146750, i10, -1, "com.ingka.ikea.app.inappfeedback.FeedbackBottomSheet.BottomSheetContent (FeedbackBottomSheet.kt:59)");
        }
        androidx.compose.ui.d f10 = m.f(androidx.compose.ui.d.f18749a, m.c(0, mVar, 0, 1), false, (p0.s) null, false, 14, (Object) null);
        I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar, 0);
        int a11 = C4883j.a(mVar, 0);
        C4912y s10 = mVar.s();
        androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, f10);
        C4504g.a aVar = C4504g.f6515W;
        C17631a<C4504g> a12 = aVar.a();
        if (mVar.m() == null) {
            C4883j.c();
        }
        mVar.I();
        if (mVar.i()) {
            mVar.p(a12);
        } else {
            mVar.t();
        }
        C4889m a13 = F1.a(mVar);
        F1.c(a13, a10, aVar.c());
        F1.c(a13, s10, aVar.e());
        p<C4504g, Integer, C16807N> b10 = aVar.b();
        if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.w(Integer.valueOf(a11), b10);
        }
        F1.c(a13, e10, aVar.d());
        C5862h hVar = C5862h.f28810a;
        n.y(P0(), O0().e(), O0().a(), mVar, 0);
        mVar.x();
        C16807N n10 = C16807N.f139792a;
        mVar.W(1245104950);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this, (C17164e<? super a>) null);
            mVar.u(D10);
        }
        mVar.P();
        U0.P.g(n10, (p) D10, mVar, 6);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
