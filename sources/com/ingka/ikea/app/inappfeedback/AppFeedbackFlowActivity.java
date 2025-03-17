package com.ingka.ikea.app.inappfeedback;

import TJ.C16534i;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.j;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import com.ingka.ikea.app.inappfeedback.t;
import dI.C17164e;
import eI.C17187b;
import eb.C9631b;
import fI.C17221b;
import h.C5403a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.p;
import xa.C8971l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/AppFeedbackFlowActivity;", "Lcom/ingka/ikea/core/android/activities/BaseLocaleActivity;", "<init>", "()V", "LXH/N;", "K0", "Leb/b;", "reviewInfo", "I0", "(Leb/b;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Leb/c;", "H", "Leb/c;", "H0", "()Leb/c;", "setReviewManager$inappfeedback_release", "(Leb/c;)V", "reviewManager", "Lcom/ingka/ikea/app/inappfeedback/l;", "I", "LXH/o;", "G0", "()Lcom/ingka/ikea/app/inappfeedback/l;", "feedbackViewModel", "Lcom/ingka/ikea/app/inappfeedback/AppFeedbackFlowActivity$b;", "J", "F0", "()Lcom/ingka/ikea/app/inappfeedback/AppFeedbackFlowActivity$b;", "feedbackUseCase", "K", "b", "a", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppFeedbackFlowActivity extends Hilt_AppFeedbackFlowActivity {

    /* renamed from: K  reason: collision with root package name */
    public static final a f71895K = new a((DefaultConstructorMarker) null);

    /* renamed from: L  reason: collision with root package name */
    public static final int f71896L = 8;

    /* renamed from: H  reason: collision with root package name */
    public eb.c f71897H;

    /* renamed from: I  reason: collision with root package name */
    private final C16824o f71898I = new h0(P.b(l.class), new f(this), new e(this), new g((C17631a) null, this));

    /* renamed from: J  reason: collision with root package name */
    private final C16824o f71899J = C16825p.b(new a(this));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/AppFeedbackFlowActivity$a;", "", "<init>", "()V", "", "KEY_FEEDBACK_USE_CASE", "Ljava/lang/String;", "a", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/AppFeedbackFlowActivity$a$a;", "Lh/a;", "Lcom/ingka/ikea/app/inappfeedback/AppFeedbackFlowActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/ingka/ikea/app/inappfeedback/AppFeedbackFlowActivity$b;)Landroid/content/Intent;", "", "resultCode", "intent", "b", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity$a$a  reason: collision with other inner class name */
        public static final class C1233a extends C5403a<b, Boolean> {
            /* renamed from: a */
            public Intent createIntent(Context context, b bVar) {
                C17542s.j(context, "context");
                C17542s.j(bVar, "input");
                Intent intent = new Intent(context, AppFeedbackFlowActivity.class);
                intent.putExtra("feedbackUseCase", bVar);
                return intent;
            }

            /* renamed from: b */
            public Boolean parseResult(int i10, Intent intent) {
                return Boolean.valueOf(i10 == -1);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/AppFeedbackFlowActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "AUTOMATIC", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        AUTOMATIC;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f71900a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f71900a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/t;", "reviewState", "LXH/N;", "<anonymous>", "(Lcom/ingka/ikea/app/inappfeedback/t;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity$openInAppReview$1", f = "AppFeedbackFlowActivity.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<t, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71901c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f71902d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AppFeedbackFlowActivity f71903e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AppFeedbackFlowActivity appFeedbackFlowActivity, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f71903e = appFeedbackFlowActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f71903e, eVar);
            dVar.f71902d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(t tVar, C17164e<? super C16807N> eVar) {
            return ((d) create(tVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f71901c == 0) {
                y.b(obj);
                t tVar = (t) this.f71902d;
                if (tVar instanceof t.a) {
                    this.f71903e.I0(((t.a) tVar).a());
                } else if (tVar instanceof t.b) {
                    this.f71903e.finish();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f71904c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(j jVar) {
            super(0);
            this.f71904c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f71904c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f71905c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(j jVar) {
            super(0);
            this.f71905c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f71905c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f71906c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f71907d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, j jVar) {
            super(0);
            this.f71906c = aVar;
            this.f71907d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f71906c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f71907d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity.g.invoke():l3.a");
        }
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.io.Serializable] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity.b E0(com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity r2) {
        /*
            android.content.Intent r2 = r2.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = "feedbackUseCase"
            java.lang.Object r2 = r2.get(r1)
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            boolean r1 = r2 instanceof java.io.Serializable
            if (r1 != 0) goto L_0x0018
            r2 = r0
        L_0x0018:
            java.io.Serializable r2 = (java.io.Serializable) r2
            boolean r1 = r2 instanceof com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity.b
            if (r1 == 0) goto L_0x0021
            r0 = r2
            com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity$b r0 = (com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity.b) r0
        L_0x0021:
            if (r0 != 0) goto L_0x0025
            com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity$b r0 = com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity.b.AUTOMATIC
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity.E0(com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity):com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity$b");
    }

    private final b F0() {
        return (b) this.f71899J.getValue();
    }

    private final l G0() {
        return (l) this.f71898I.getValue();
    }

    /* access modifiers changed from: private */
    public final void I0(C9631b bVar) {
        C8971l<Void> b10 = H0().b(this, bVar);
        C17542s.i(b10, "launchReviewFlow(...)");
        b10.c(new b(this));
    }

    /* access modifiers changed from: private */
    public static final void J0(AppFeedbackFlowActivity appFeedbackFlowActivity, C8971l lVar) {
        C17542s.j(lVar, "<unused var>");
        appFeedbackFlowActivity.G0().F();
        appFeedbackFlowActivity.finish();
    }

    private final void K0() {
        G0().D();
        C16534i.M(C16534i.R(C5208k.a(G0().C(), getLifecycle(), r.b.STARTED), new d(this, (C17164e<? super d>) null)), C5222z.a(this));
    }

    public final eb.c H0() {
        eb.c cVar = this.f71897H;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("reviewManager");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        setContentView(r.f71978a);
        if (c.f71900a[F0().ordinal()] == 1) {
            K0();
            return;
        }
        throw new XH.t();
    }
}
