package com.sugarcube.app.base.ui.capturev2;

import JF.C13084F;
import OE.C13313e;
import OE.n;
import OE.q;
import QJ.F0;
import QJ.Q;
import QJ.T;
import VE.C13760b;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.y;
import YE.C13868b;
import YE.e;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0013\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H@¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0019J#\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/e0;", "Landroidx/lifecycle/f0;", "LOE/q;", "sugarcube", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "analytics", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "firebaseInteractions", "LOE/e;", "installationConfig", "<init>", "(LOE/q;Lcom/sugarcube/app/base/data/analytics/Analytics;Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;LOE/e;)V", "Landroidx/fragment/app/t;", "activity", "", "retryCount", "Lkotlin/Function0;", "LXH/N;", "onARCoreSupportedAndUpToDate", "F", "(Landroidx/fragment/app/t;ILnI/a;LdI/e;)Ljava/lang/Object;", "N", "(Landroidx/fragment/app/t;LnI/a;)Landroidx/fragment/app/t;", "K", "Q", "(Landroidx/fragment/app/t;)Landroidx/fragment/app/t;", "S", "", "msg", "", "t", "I", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "H", "()V", "G", "(Landroidx/fragment/app/t;LnI/a;)V", "m", "LOE/q;", "n", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "o", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "p", "LOE/e;", "Landroid/app/Dialog;", "q", "Landroid/app/Dialog;", "dialog", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.capturev2.e0  reason: case insensitive filesystem */
public final class C14205e0 extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final q f123754m;

    /* renamed from: n  reason: collision with root package name */
    private final Analytics f123755n;

    /* renamed from: o  reason: collision with root package name */
    private final FirebaseInteractions f123756o;

    /* renamed from: p  reason: collision with root package name */
    private final C13313e f123757p;

    /* renamed from: q  reason: collision with root package name */
    private Dialog f123758q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.capturev2.e0$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f123759a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.google.ar.core.ArCoreApk$Availability[] r0 = com.google.ar.core.ArCoreApk.Availability.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.SUPPORTED_INSTALLED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.UNKNOWN_ERROR     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.UNKNOWN_CHECKING     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.UNKNOWN_TIMED_OUT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f123759a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.C14205e0.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capturev2.PermissionViewModel$checkARCoreSupportedAndUpToDate$1", f = "PermissionsFragment.kt", l = {173}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.capturev2.e0$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123760c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14205e0 f123761d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5191t f123762e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f123763f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C14205e0 e0Var, C5191t tVar, C17631a<C16807N> aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f123761d = e0Var;
            this.f123762e = tVar;
            this.f123763f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f123761d, this.f123762e, this.f123763f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f123760c;
            if (i10 == 0) {
                y.b(obj);
                C14205e0 e0Var = this.f123761d;
                C5191t tVar = this.f123762e;
                C17631a<C16807N> aVar = this.f123763f;
                this.f123760c = 1;
                if (e0Var.F(tVar, 0, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.app.base.ui.capturev2.PermissionViewModel", f = "PermissionsFragment.kt", l = {211, 212}, m = "checkARCoreSupportedAndUpToDate")
    /* renamed from: com.sugarcube.app.base.ui.capturev2.e0$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f123764c;

        /* renamed from: d  reason: collision with root package name */
        Object f123765d;

        /* renamed from: e  reason: collision with root package name */
        Object f123766e;

        /* renamed from: f  reason: collision with root package name */
        Object f123767f;

        /* renamed from: g  reason: collision with root package name */
        Object f123768g;

        /* renamed from: h  reason: collision with root package name */
        Object f123769h;

        /* renamed from: i  reason: collision with root package name */
        Object f123770i;

        /* renamed from: j  reason: collision with root package name */
        int f123771j;

        /* renamed from: k  reason: collision with root package name */
        int f123772k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f123773l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C14205e0 f123774m;

        /* renamed from: n  reason: collision with root package name */
        int f123775n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14205e0 e0Var, C17164e<? super c> eVar) {
            super(eVar);
            this.f123774m = e0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f123773l = obj;
            this.f123775n |= Integer.MIN_VALUE;
            return this.f123774m.F((C5191t) null, 0, (C17631a<C16807N>) null, this);
        }
    }

    public C14205e0(q qVar, Analytics analytics, FirebaseInteractions firebaseInteractions, C13313e eVar) {
        C17542s.j(qVar, "sugarcube");
        C17542s.j(analytics, "analytics");
        C17542s.j(firebaseInteractions, "firebaseInteractions");
        C17542s.j(eVar, "installationConfig");
        this.f123754m = qVar;
        this.f123755n = analytics;
        this.f123756o = firebaseInteractions;
        this.f123757p = eVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0184, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x015a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F(androidx.fragment.app.C5191t r12, int r13, nI.C17631a<XH.C16807N> r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r11 = this;
            r0 = 1
            boolean r1 = r15 instanceof com.sugarcube.app.base.ui.capturev2.C14205e0.c
            if (r1 == 0) goto L_0x0014
            r1 = r15
            com.sugarcube.app.base.ui.capturev2.e0$c r1 = (com.sugarcube.app.base.ui.capturev2.C14205e0.c) r1
            int r2 = r1.f123775n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0014
            int r2 = r2 - r3
            r1.f123775n = r2
            goto L_0x0019
        L_0x0014:
            com.sugarcube.app.base.ui.capturev2.e0$c r1 = new com.sugarcube.app.base.ui.capturev2.e0$c
            r1.<init>(r11, r15)
        L_0x0019:
            java.lang.Object r2 = r1.f123773l
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r1.f123775n
            r5 = 2
            if (r4 == 0) goto L_0x007d
            if (r4 == r0) goto L_0x0051
            if (r4 != r5) goto L_0x0049
            java.lang.Object r12 = r1.f123770i
            com.google.ar.core.ArCoreApk$Availability r12 = (com.google.ar.core.ArCoreApk.Availability) r12
            java.lang.Object r12 = r1.f123769h
            com.google.ar.core.ArCoreApk$Availability r12 = (com.google.ar.core.ArCoreApk.Availability) r12
            java.lang.Object r12 = r1.f123768g
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r1.f123767f
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r1.f123766e
            nI.a r12 = (nI.C17631a) r12
            java.lang.Object r12 = r1.f123765d
            androidx.fragment.app.t r12 = (androidx.fragment.app.C5191t) r12
            java.lang.Object r12 = r1.f123764c
            com.sugarcube.app.base.ui.capturev2.e0 r12 = (com.sugarcube.app.base.ui.capturev2.C14205e0) r12
            XH.y.b(r2)
            goto L_0x015b
        L_0x0049:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0051:
            int r12 = r1.f123772k
            int r13 = r1.f123771j
            java.lang.Object r14 = r1.f123770i
            com.google.ar.core.ArCoreApk$Availability r14 = (com.google.ar.core.ArCoreApk.Availability) r14
            java.lang.Object r15 = r1.f123769h
            com.google.ar.core.ArCoreApk$Availability r15 = (com.google.ar.core.ArCoreApk.Availability) r15
            java.lang.Object r4 = r1.f123768g
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r1.f123767f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r1.f123766e
            nI.a r7 = (nI.C17631a) r7
            java.lang.Object r8 = r1.f123765d
            androidx.fragment.app.t r8 = (androidx.fragment.app.C5191t) r8
            java.lang.Object r9 = r1.f123764c
            com.sugarcube.app.base.ui.capturev2.e0 r9 = (com.sugarcube.app.base.ui.capturev2.C14205e0) r9
            XH.y.b(r2)
            r2 = r14
            r14 = r7
            r7 = r4
            r4 = r15
            r15 = r6
            r6 = r12
            r12 = r8
            goto L_0x013f
        L_0x007d:
            XH.y.b(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r2 >= r4) goto L_0x008c
            r11.S(r12)
            XH.N r12 = XH.C16807N.f139792a
            return r12
        L_0x008c:
            OE.e r2 = r11.f123757p
            java.lang.String r4 = r2.f()
            com.google.ar.core.ArCoreApk r2 = com.google.ar.core.ArCoreApk.getInstance()
            com.google.ar.core.ArCoreApk$Availability r2 = r2.checkAvailability(r12)
            java.lang.String r6 = "checkAvailability(...)"
            kotlin.jvm.internal.C17542s.i(r2, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "ArCoreApk.checkAvailability = "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = " (retries="
            r6.append(r7)
            r6.append(r13)
            java.lang.String r7 = ")"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r8 = 0
            J(r11, r6, r8, r5, r8)
            com.sugarcube.app.base.data.analytics.Analytics r6 = r11.f123755n
            java.lang.String r9 = r2.name()
            r6.captureArCoreAvailability(r4, r9)
            int[] r6 = com.sugarcube.app.base.ui.capturev2.C14205e0.a.f123759a
            int r9 = r2.ordinal()
            r6 = r6[r9]
            switch(r6) {
                case 1: goto L_0x0162;
                case 2: goto L_0x015e;
                case 3: goto L_0x015e;
                case 4: goto L_0x00f4;
                case 5: goto L_0x00f4;
                case 6: goto L_0x00f4;
                case 7: goto L_0x00db;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            XH.t r12 = new XH.t
            r12.<init>()
            throw r12
        L_0x00db:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "ARCore is not supported on this device, "
            r13.append(r14)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            J(r11, r13, r8, r5, r8)
            r11.Q(r12)
            goto L_0x0182
        L_0x00f4:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "ARCore status not known, "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r10 = "  (retries="
            r9.append(r10)
            r9.append(r13)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            J(r11, r7, r8, r5, r8)
            if (r13 <= 0) goto L_0x0119
            r11.K(r12, r14)
            goto L_0x0182
        L_0x0119:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r8 = 1
            long r7 = r7.toMillis(r8)
            r1.f123764c = r11
            r1.f123765d = r12
            r1.f123766e = r14
            r1.f123767f = r15
            r1.f123768g = r4
            r1.f123769h = r2
            r1.f123770i = r2
            r1.f123771j = r13
            r1.f123772k = r6
            r1.f123775n = r0
            java.lang.Object r7 = QJ.C16297b0.b(r7, r1)
            if (r7 != r3) goto L_0x013c
            return r3
        L_0x013c:
            r9 = r11
            r7 = r4
            r4 = r2
        L_0x013f:
            int r0 = r0 + r13
            r1.f123764c = r9
            r1.f123765d = r12
            r1.f123766e = r14
            r1.f123767f = r15
            r1.f123768g = r7
            r1.f123769h = r4
            r1.f123770i = r2
            r1.f123771j = r13
            r1.f123772k = r6
            r1.f123775n = r5
            java.lang.Object r12 = r9.F(r12, r0, r14, r1)
            if (r12 != r3) goto L_0x015b
            return r3
        L_0x015b:
            XH.N r12 = XH.C16807N.f139792a
            return r12
        L_0x015e:
            r11.N(r12, r14)
            goto L_0x0182
        L_0x0162:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017a }
            r12.<init>()     // Catch:{ Exception -> 0x017a }
            java.lang.String r13 = "ARCore callback version = "
            r12.append(r13)     // Catch:{ Exception -> 0x017a }
            r12.append(r4)     // Catch:{ Exception -> 0x017a }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x017a }
            J(r11, r12, r8, r5, r8)     // Catch:{ Exception -> 0x017a }
            r14.invoke()     // Catch:{ Exception -> 0x017a }
            goto L_0x0180
        L_0x017a:
            r12 = move-exception
            java.lang.String r13 = "ArCoreApk Availability error"
            r11.I(r13, r12)
        L_0x0180:
            XH.N r12 = XH.C16807N.f139792a
        L_0x0182:
            XH.N r12 = XH.C16807N.f139792a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.C14205e0.F(androidx.fragment.app.t, int, nI.a, dI.e):java.lang.Object");
    }

    private final void I(String str, Throwable th2) {
        Log.d(AnyKt.SUGARCUBE_TAG, str, th2);
        C13868b.f118106a.b(str, e.Capture);
        if (th2 != null) {
            this.f123756o.log(str);
            this.f123756o.recordException(th2);
        }
    }

    static /* synthetic */ void J(C14205e0 e0Var, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        e0Var.I(str, th2);
    }

    private final C5191t K(C5191t tVar, C17631a<C16807N> aVar) {
        this.f123755n.captureArCoreRetryWarning();
        synchronized (tVar) {
            H();
            Integer valueOf = Integer.valueOf(n.f113429p0);
            String string = tVar.getString(n.f113436q0);
            C17542s.i(string, "getString(...)");
            CharSequence text = tVar.getText(n.f113359f0);
            C17542s.i(text, "getText(...)");
            v a10 = C16796C.a(text, new Y(this, tVar, aVar));
            CharSequence text2 = tVar.getText(n.f113179C);
            C17542s.i(text2, "getText(...)");
            this.f123758q = C13084F.y(tVar, valueOf, string, a10, 0, C16796C.a(text2, new Z(this, tVar)), false, (DialogInterface.OnDismissListener) null, 104, (Object) null);
            C16807N n10 = C16807N.f139792a;
        }
        return tVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C14205e0 e0Var, C5191t tVar, C17631a aVar) {
        C13868b.f118106a.b("ARCore status is not ready", e.Capture);
        e0Var.f123755n.captureArCoreRetry();
        e0Var.G(tVar, aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C14205e0 e0Var, C5191t tVar) {
        e0Var.f123755n.captureArCoreRetryLeave();
        tVar.finish();
        return C16807N.f139792a;
    }

    private final C5191t N(C5191t tVar, C17631a<C16807N> aVar) {
        this.f123755n.captureArCoreUpdateDialog();
        synchronized (tVar) {
            H();
            Integer valueOf = Integer.valueOf(n.f113408m0);
            String string = tVar.getString(n.f113401l0);
            C17542s.i(string, "getString(...)");
            CharSequence text = tVar.getText(n.f113497z);
            C17542s.i(text, "getText(...)");
            v a10 = C16796C.a(text, new C14199b0(this, tVar, tVar, aVar));
            CharSequence text2 = tVar.getText(n.f113179C);
            C17542s.i(text2, "getText(...)");
            this.f123758q = C13084F.y(tVar, valueOf, string, a10, 0, C16796C.a(text2, new C14201c0(this, tVar)), false, (DialogInterface.OnDismissListener) null, 72, (Object) null);
            C16807N n10 = C16807N.f139792a;
        }
        return tVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C14205e0 e0Var, C5191t tVar, C5191t tVar2, C17631a aVar) {
        J(e0Var, "ARCore installation requested.", (Throwable) null, 2, (Object) null);
        e0Var.f123755n.captureArCoreUpdate();
        try {
            C17542s.g(ArCoreApk.getInstance().requestInstall(tVar, true, ArCoreApk.InstallBehavior.OPTIONAL, ArCoreApk.UserMessageType.USER_ALREADY_INFORMED));
        } catch (FatalException e10) {
            e0Var.I("Exception during ARCore installation", e10);
            e0Var.G(tVar2, aVar);
        } catch (UnavailableDeviceNotCompatibleException unused) {
            e0Var.Q(tVar2);
        } catch (UnavailableUserDeclinedInstallationException unused2) {
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P(C14205e0 e0Var, C5191t tVar) {
        e0Var.f123755n.captureArCoreExit();
        tVar.finish();
        return C16807N.f139792a;
    }

    private final C5191t Q(C5191t tVar) {
        this.f123755n.captureArCoreNotCompatibleWarning();
        synchronized (tVar) {
            H();
            Integer valueOf = Integer.valueOf(n.f113415n0);
            String string = tVar.getString(n.f113422o0);
            C17542s.i(string, "getString(...)");
            CharSequence text = tVar.getText(n.f113344d);
            C17542s.i(text, "getText(...)");
            this.f123758q = C13084F.y(tVar, valueOf, string, C16796C.a(text, new C14203d0(tVar)), 0, (v) null, false, (DialogInterface.OnDismissListener) null, 88, (Object) null);
            C16807N n10 = C16807N.f139792a;
        }
        return tVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N R(C5191t tVar) {
        C13868b.f118106a.b("ARCore is not supported on device", e.Capture);
        tVar.finish();
        return C16807N.f139792a;
    }

    private final C5191t S(C5191t tVar) {
        this.f123755n.captureOSNotCompatibleWarning();
        synchronized (tVar) {
            H();
            Integer valueOf = Integer.valueOf(n.f113437q1);
            String string = tVar.getString(n.f113444r1);
            C17542s.i(string, "getString(...)");
            CharSequence text = tVar.getText(n.f113173B);
            C17542s.i(text, "getText(...)");
            this.f123758q = C13084F.y(tVar, valueOf, string, (v) null, 0, C16796C.a(text, new C14197a0(tVar, this, tVar)), false, (DialogInterface.OnDismissListener) null, 76, (Object) null);
            C16807N n10 = C16807N.f139792a;
        }
        return tVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N T(C5191t tVar, C14205e0 e0Var, C5191t tVar2) {
        C13868b.f118106a.b("OS needs to be API 28 or higher", e.Capture);
        String h10 = C13760b.f117438d.h(e0Var.f123754m.getCountry(), e0Var.f123754m.getLanguage());
        tVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(h10 + "articles/360039289854-Will-the-app-work-on-my-smartphone-")));
        tVar2.finish();
        return C16807N.f139792a;
    }

    public final void G(C5191t tVar, C17631a<C16807N> aVar) {
        C17542s.j(tVar, "activity");
        C17542s.j(aVar, "onARCoreSupportedAndUpToDate");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new b(this, tVar, aVar, (C17164e<? super b>) null), 3, (Object) null);
    }

    public final void H() {
        synchronized (this) {
            Dialog dialog = this.f123758q;
            if (dialog != null) {
                this.f123758q = null;
                dialog.dismiss();
                C16807N n10 = C16807N.f139792a;
            }
        }
    }
}
