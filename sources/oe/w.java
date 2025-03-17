package OE;

import HJ.C15854t;
import KF.C13164r;
import QJ.C16310i;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.C16820k;
import XH.t;
import XH.y;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.F;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.source.CompositionRepository;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.MembershipUiRepo;
import com.sugarcube.app.base.upload.e;
import com.sugarcube.core.logger.Priority;
import com.sugarcube.core.network.models.LoggedInUser;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Bc\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020;0A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"LOE/w;", "", "LOE/q;", "sugarcube", "Lcom/sugarcube/app/base/external/config/a;", "appConfig", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "compositionRepository", "Landroid/content/Context;", "context", "LOE/a;", "appEnvironment", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/DeviceCompatibility;", "deviceCompatibility", "LKF/r;", "uploadVersion", "Lcom/sugarcube/app/base/upload/e;", "uploadScheduler", "Lcom/sugarcube/app/base/external/MembershipUiRepo;", "membershipRepo", "<init>", "(LOE/q;Lcom/sugarcube/app/base/external/config/a;Lcom/sugarcube/app/base/data/SceneRepository;Lcom/sugarcube/app/base/data/source/CompositionRepository;Landroid/content/Context;LOE/a;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/DeviceCompatibility;LKF/r;Lcom/sugarcube/app/base/upload/e;Lcom/sugarcube/app/base/external/MembershipUiRepo;)V", "LXH/N;", "g", "()V", "a", "LOE/q;", "b", "Lcom/sugarcube/app/base/external/config/a;", "c", "Lcom/sugarcube/app/base/data/SceneRepository;", "d", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "e", "Landroid/content/Context;", "f", "LOE/a;", "Lcom/sugarcube/app/base/data/user/UserRepo;", "h", "Lcom/sugarcube/app/base/DeviceCompatibility;", "i", "LKF/r;", "j", "Lcom/sugarcube/app/base/upload/e;", "k", "Lcom/sugarcube/app/base/external/MembershipUiRepo;", "LQJ/F0;", "l", "LQJ/F0;", "getUserCollectionJob", "()LQJ/F0;", "setUserCollectionJob", "(LQJ/F0;)V", "userCollectionJob", "LTJ/g;", "", "m", "LTJ/g;", "getRoomsReadyCountFlow", "()LTJ/g;", "roomsReadyCountFlow", "Landroidx/lifecycle/F;", "n", "Landroidx/lifecycle/F;", "getRoomsReadyCount", "()Landroidx/lifecycle/F;", "roomsReadyCount", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final q f113533a;

    /* renamed from: b  reason: collision with root package name */
    private final com.sugarcube.app.base.external.config.a f113534b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final SceneRepository f113535c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final CompositionRepository f113536d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f113537e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C13309a f113538f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final UserRepo f113539g;

    /* renamed from: h  reason: collision with root package name */
    private final DeviceCompatibility f113540h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C13164r f113541i;

    /* renamed from: j  reason: collision with root package name */
    private final e f113542j;

    /* renamed from: k  reason: collision with root package name */
    private final MembershipUiRepo f113543k;

    /* renamed from: l  reason: collision with root package name */
    private F0 f113544l;

    /* renamed from: m  reason: collision with root package name */
    private final C16532g<Integer> f113545m;

    /* renamed from: n  reason: collision with root package name */
    private final F<Integer> f113546n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.SugarcubeService$startWorkers$2", f = "SugarcubeService.kt", l = {68}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f113547c;

        /* renamed from: d  reason: collision with root package name */
        Object f113548d;

        /* renamed from: e  reason: collision with root package name */
        Object f113549e;

        /* renamed from: f  reason: collision with root package name */
        Object f113550f;

        /* renamed from: g  reason: collision with root package name */
        Object f113551g;

        /* renamed from: h  reason: collision with root package name */
        int f113552h;

        /* renamed from: i  reason: collision with root package name */
        int f113553i;

        /* renamed from: j  reason: collision with root package name */
        int f113554j;

        /* renamed from: k  reason: collision with root package name */
        int f113555k;

        /* renamed from: l  reason: collision with root package name */
        int f113556l;

        /* renamed from: m  reason: collision with root package name */
        int f113557m;

        /* renamed from: n  reason: collision with root package name */
        private /* synthetic */ Object f113558n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ w f113559o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.SugarcubeService$startWorkers$2$2", f = "SugarcubeService.kt", l = {70}, m = "invokeSuspend")
        /* renamed from: OE.w$a$a  reason: collision with other inner class name */
        static final class C2784a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f113560c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f113561d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ w f113562e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: OE.w$a$a$a  reason: collision with other inner class name */
            static final class C2785a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Q f113563a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ w f113564b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @f(c = "com.sugarcube.app.base.SugarcubeService$startWorkers$2$2$1", f = "SugarcubeService.kt", l = {73, 74, 77, 78}, m = "emit")
                /* renamed from: OE.w$a$a$a$a  reason: collision with other inner class name */
                static final class C2786a extends d {

                    /* renamed from: c  reason: collision with root package name */
                    Object f113565c;

                    /* renamed from: d  reason: collision with root package name */
                    Object f113566d;

                    /* renamed from: e  reason: collision with root package name */
                    Object f113567e;

                    /* renamed from: f  reason: collision with root package name */
                    Object f113568f;

                    /* renamed from: g  reason: collision with root package name */
                    Object f113569g;

                    /* renamed from: h  reason: collision with root package name */
                    Object f113570h;

                    /* renamed from: i  reason: collision with root package name */
                    Object f113571i;

                    /* renamed from: j  reason: collision with root package name */
                    Object f113572j;

                    /* renamed from: k  reason: collision with root package name */
                    int f113573k;

                    /* renamed from: l  reason: collision with root package name */
                    int f113574l;

                    /* renamed from: m  reason: collision with root package name */
                    int f113575m;

                    /* renamed from: n  reason: collision with root package name */
                    int f113576n;

                    /* renamed from: o  reason: collision with root package name */
                    int f113577o;

                    /* renamed from: p  reason: collision with root package name */
                    /* synthetic */ Object f113578p;

                    /* renamed from: q  reason: collision with root package name */
                    final /* synthetic */ C2785a<T> f113579q;

                    /* renamed from: r  reason: collision with root package name */
                    int f113580r;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C2786a(C2785a<? super T> aVar, C17164e<? super C2786a> eVar) {
                        super(eVar);
                        this.f113579q = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f113578p = obj;
                        this.f113580r |= Integer.MIN_VALUE;
                        return this.f113579q.emit((LoggedInUser) null, this);
                    }
                }

                C2785a(Q q10, w wVar) {
                    this.f113563a = q10;
                    this.f113564b = wVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:103:0x0479 A[RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:18:0x00fa  */
                /* JADX WARNING: Removed duplicated region for block: B:60:0x02c6 A[RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
                /* renamed from: c */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(com.sugarcube.core.network.models.LoggedInUser r20, dI.C17164e<? super XH.C16807N> r21) {
                    /*
                        r19 = this;
                        r0 = r19
                        r1 = r20
                        r2 = r21
                        boolean r3 = r2 instanceof OE.w.a.C2784a.C2785a.C2786a
                        if (r3 == 0) goto L_0x0019
                        r3 = r2
                        OE.w$a$a$a$a r3 = (OE.w.a.C2784a.C2785a.C2786a) r3
                        int r4 = r3.f113580r
                        r5 = -2147483648(0xffffffff80000000, float:-0.0)
                        r6 = r4 & r5
                        if (r6 == 0) goto L_0x0019
                        int r4 = r4 - r5
                        r3.f113580r = r4
                        goto L_0x001e
                    L_0x0019:
                        OE.w$a$a$a$a r3 = new OE.w$a$a$a$a
                        r3.<init>(r0, r2)
                    L_0x001e:
                        java.lang.Object r4 = r3.f113578p
                        java.lang.Object r11 = eI.C17187b.f()
                        int r5 = r3.f113580r
                        r6 = 4
                        r7 = 3
                        r8 = 1
                        r12 = 2
                        if (r5 == 0) goto L_0x00fa
                        if (r5 == r8) goto L_0x00bd
                        if (r5 == r12) goto L_0x0098
                        if (r5 == r7) goto L_0x0061
                        if (r5 != r6) goto L_0x0059
                        java.lang.Object r1 = r3.f113572j
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.Object r1 = r3.f113571i
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.Object r1 = r3.f113570h
                        com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                        java.lang.Object r1 = r3.f113569g
                        QJ.Q r1 = (QJ.Q) r1
                        java.lang.Object r1 = r3.f113568f
                        QJ.Q r1 = (QJ.Q) r1
                        java.lang.Object r1 = r3.f113567e
                        dI.e r1 = (dI.C17164e) r1
                        java.lang.Object r1 = r3.f113566d
                        com.sugarcube.core.network.models.LoggedInUser r1 = (com.sugarcube.core.network.models.LoggedInUser) r1
                        java.lang.Object r1 = r3.f113565c
                        OE.w$a$a$a r1 = (OE.w.a.C2784a.C2785a) r1
                        XH.y.b(r4)
                        goto L_0x047a
                    L_0x0059:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L_0x0061:
                        int r1 = r3.f113577o
                        int r2 = r3.f113576n
                        int r5 = r3.f113575m
                        int r7 = r3.f113574l
                        int r8 = r3.f113573k
                        java.lang.Object r9 = r3.f113572j
                        java.lang.String r9 = (java.lang.String) r9
                        java.lang.Object r10 = r3.f113571i
                        java.lang.String r10 = (java.lang.String) r10
                        java.lang.Object r12 = r3.f113570h
                        com.sugarcube.core.logger.Priority r12 = (com.sugarcube.core.logger.Priority) r12
                        java.lang.Object r13 = r3.f113569g
                        QJ.Q r13 = (QJ.Q) r13
                        java.lang.Object r14 = r3.f113568f
                        QJ.Q r14 = (QJ.Q) r14
                        java.lang.Object r15 = r3.f113567e
                        dI.e r15 = (dI.C17164e) r15
                        java.lang.Object r6 = r3.f113566d
                        com.sugarcube.core.network.models.LoggedInUser r6 = (com.sugarcube.core.network.models.LoggedInUser) r6
                        r20 = r1
                        java.lang.Object r1 = r3.f113565c
                        OE.w$a$a$a r1 = (OE.w.a.C2784a.C2785a) r1
                        XH.y.b(r4)
                        r4 = r2
                        r2 = r1
                        r1 = r6
                        r6 = r5
                        r5 = r20
                        goto L_0x0450
                    L_0x0098:
                        java.lang.Object r1 = r3.f113572j
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.Object r1 = r3.f113571i
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.Object r1 = r3.f113570h
                        com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                        java.lang.Object r1 = r3.f113569g
                        QJ.Q r1 = (QJ.Q) r1
                        java.lang.Object r1 = r3.f113568f
                        QJ.Q r1 = (QJ.Q) r1
                        java.lang.Object r1 = r3.f113567e
                        dI.e r1 = (dI.C17164e) r1
                        java.lang.Object r1 = r3.f113566d
                        com.sugarcube.core.network.models.LoggedInUser r1 = (com.sugarcube.core.network.models.LoggedInUser) r1
                        java.lang.Object r1 = r3.f113565c
                        OE.w$a$a$a r1 = (OE.w.a.C2784a.C2785a) r1
                        XH.y.b(r4)
                        goto L_0x02c7
                    L_0x00bd:
                        int r1 = r3.f113577o
                        int r2 = r3.f113576n
                        int r5 = r3.f113575m
                        int r6 = r3.f113574l
                        int r7 = r3.f113573k
                        java.lang.Object r8 = r3.f113572j
                        java.lang.String r8 = (java.lang.String) r8
                        java.lang.Object r9 = r3.f113571i
                        java.lang.String r9 = (java.lang.String) r9
                        java.lang.Object r10 = r3.f113570h
                        com.sugarcube.core.logger.Priority r10 = (com.sugarcube.core.logger.Priority) r10
                        java.lang.Object r13 = r3.f113569g
                        QJ.Q r13 = (QJ.Q) r13
                        java.lang.Object r14 = r3.f113568f
                        QJ.Q r14 = (QJ.Q) r14
                        java.lang.Object r15 = r3.f113567e
                        dI.e r15 = (dI.C17164e) r15
                        java.lang.Object r12 = r3.f113566d
                        com.sugarcube.core.network.models.LoggedInUser r12 = (com.sugarcube.core.network.models.LoggedInUser) r12
                        r16 = r1
                        java.lang.Object r1 = r3.f113565c
                        OE.w$a$a$a r1 = (OE.w.a.C2784a.C2785a) r1
                        XH.y.b(r4)
                        r4 = r16
                        r18 = r2
                        r2 = r1
                        r1 = r12
                        r12 = r8
                        r8 = r7
                        r7 = r6
                        r6 = r5
                        r5 = r18
                        goto L_0x029d
                    L_0x00fa:
                        XH.y.b(r4)
                        r4 = 5
                        java.lang.String r12 = ""
                        java.lang.String r5 = " "
                        java.lang.String r6 = "Kt"
                        r14 = 0
                        if (r1 == 0) goto L_0x02ca
                        QJ.Q r15 = r0.f113563a
                        com.sugarcube.core.logger.Priority r13 = com.sugarcube.core.logger.Priority.DEBUG
                        java.lang.StringBuilder r9 = new java.lang.StringBuilder
                        r9.<init>()
                        java.lang.String r10 = "userState: logged in, userState = "
                        r9.append(r10)
                        r9.append(r1)
                        java.lang.String r9 = r9.toString()
                        if (r9 != 0) goto L_0x0120
                        r10 = r12
                        goto L_0x0121
                    L_0x0120:
                        r10 = r9
                    L_0x0121:
                        int[] r9 = OE.u.f113531a
                        int r17 = r13.ordinal()
                        r9 = r9[r17]
                        if (r9 == r8) goto L_0x0220
                        r8 = 2
                        if (r9 == r8) goto L_0x01e7
                        if (r9 == r7) goto L_0x01ae
                        r7 = 4
                        if (r9 == r7) goto L_0x0174
                        if (r9 != r4) goto L_0x016e
                        java.lang.Class r4 = r15.getClass()
                        java.lang.String r4 = r4.getName()
                        kotlin.jvm.internal.C17542s.g(r4)
                        r7 = 36
                        java.lang.String r7 = HJ.C15854t.s1(r4, r7, r14, r8, r14)
                        r9 = 46
                        java.lang.String r7 = HJ.C15854t.o1(r7, r9, r14, r8, r14)
                        int r8 = r7.length()
                        if (r8 != 0) goto L_0x0153
                        goto L_0x0157
                    L_0x0153:
                        java.lang.String r4 = HJ.C15854t.P0(r7, r6)
                    L_0x0157:
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        r6.append(r10)
                        r6.append(r5)
                        r6.append(r12)
                        java.lang.String r5 = r6.toString()
                        android.util.Log.e(r4, r5)
                        goto L_0x0258
                    L_0x016e:
                        XH.t r1 = new XH.t
                        r1.<init>()
                        throw r1
                    L_0x0174:
                        java.lang.Class r4 = r15.getClass()
                        java.lang.String r4 = r4.getName()
                        kotlin.jvm.internal.C17542s.g(r4)
                        r7 = 2
                        r8 = 36
                        java.lang.String r8 = HJ.C15854t.s1(r4, r8, r14, r7, r14)
                        r9 = 46
                        java.lang.String r8 = HJ.C15854t.o1(r8, r9, r14, r7, r14)
                        int r7 = r8.length()
                        if (r7 != 0) goto L_0x0193
                        goto L_0x0197
                    L_0x0193:
                        java.lang.String r4 = HJ.C15854t.P0(r8, r6)
                    L_0x0197:
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        r6.append(r10)
                        r6.append(r5)
                        r6.append(r12)
                        java.lang.String r5 = r6.toString()
                        android.util.Log.w(r4, r5)
                        goto L_0x0258
                    L_0x01ae:
                        java.lang.Class r4 = r15.getClass()
                        java.lang.String r4 = r4.getName()
                        kotlin.jvm.internal.C17542s.g(r4)
                        r7 = 2
                        r8 = 36
                        java.lang.String r8 = HJ.C15854t.s1(r4, r8, r14, r7, r14)
                        r9 = 46
                        java.lang.String r8 = HJ.C15854t.o1(r8, r9, r14, r7, r14)
                        int r7 = r8.length()
                        if (r7 != 0) goto L_0x01cd
                        goto L_0x01d1
                    L_0x01cd:
                        java.lang.String r4 = HJ.C15854t.P0(r8, r6)
                    L_0x01d1:
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        r6.append(r10)
                        r6.append(r5)
                        r6.append(r12)
                        java.lang.String r5 = r6.toString()
                        android.util.Log.i(r4, r5)
                        goto L_0x0258
                    L_0x01e7:
                        java.lang.Class r4 = r15.getClass()
                        java.lang.String r4 = r4.getName()
                        kotlin.jvm.internal.C17542s.g(r4)
                        r7 = 2
                        r8 = 36
                        java.lang.String r8 = HJ.C15854t.s1(r4, r8, r14, r7, r14)
                        r9 = 46
                        java.lang.String r8 = HJ.C15854t.o1(r8, r9, r14, r7, r14)
                        int r7 = r8.length()
                        if (r7 != 0) goto L_0x0206
                        goto L_0x020a
                    L_0x0206:
                        java.lang.String r4 = HJ.C15854t.P0(r8, r6)
                    L_0x020a:
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        r6.append(r10)
                        r6.append(r5)
                        r6.append(r12)
                        java.lang.String r5 = r6.toString()
                        android.util.Log.d(r4, r5)
                        goto L_0x0258
                    L_0x0220:
                        java.lang.Class r4 = r15.getClass()
                        java.lang.String r4 = r4.getName()
                        kotlin.jvm.internal.C17542s.g(r4)
                        r7 = 2
                        r8 = 36
                        java.lang.String r8 = HJ.C15854t.s1(r4, r8, r14, r7, r14)
                        r9 = 46
                        java.lang.String r8 = HJ.C15854t.o1(r8, r9, r14, r7, r14)
                        int r7 = r8.length()
                        if (r7 != 0) goto L_0x023f
                        goto L_0x0243
                    L_0x023f:
                        java.lang.String r4 = HJ.C15854t.P0(r8, r6)
                    L_0x0243:
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        r6.append(r10)
                        r6.append(r5)
                        r6.append(r12)
                        java.lang.String r5 = r6.toString()
                        android.util.Log.v(r4, r5)
                    L_0x0258:
                        OE.w r4 = r0.f113564b
                        com.sugarcube.app.base.data.SceneRepository r4 = r4.f113535c
                        OE.w r5 = r0.f113564b
                        KF.r r7 = r5.f113541i
                        r3.f113565c = r0
                        r3.f113566d = r1
                        r3.f113567e = r2
                        r3.f113568f = r15
                        r3.f113569g = r15
                        r3.f113570h = r13
                        r3.f113571i = r10
                        r3.f113572j = r12
                        r5 = 0
                        r3.f113573k = r5
                        r3.f113574l = r5
                        r3.f113575m = r5
                        r3.f113576n = r5
                        r3.f113577o = r5
                        r5 = 1
                        r3.f113580r = r5
                        r5 = 1
                        r6 = 0
                        r9 = 2
                        r14 = 0
                        r8 = r3
                        r16 = r10
                        r10 = r14
                        java.lang.Object r4 = com.sugarcube.app.base.data.SceneRepository.m25startRefreshhhJSO8g$default(r4, r5, r6, r7, r8, r9, r10)
                        if (r4 != r11) goto L_0x0291
                        return r11
                    L_0x0291:
                        r10 = r13
                        r13 = r15
                        r14 = r13
                        r9 = r16
                        r4 = 0
                        r5 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r15 = r2
                        r2 = r0
                    L_0x029d:
                        OE.w r0 = r2.f113564b
                        com.sugarcube.app.base.data.source.CompositionRepository r0 = r0.f113536d
                        r3.f113565c = r2
                        r3.f113566d = r1
                        r3.f113567e = r15
                        r3.f113568f = r14
                        r3.f113569g = r13
                        r3.f113570h = r10
                        r3.f113571i = r9
                        r3.f113572j = r12
                        r3.f113573k = r8
                        r3.f113574l = r7
                        r3.f113575m = r6
                        r3.f113576n = r5
                        r3.f113577o = r4
                        r1 = 2
                        r3.f113580r = r1
                        java.lang.Object r0 = r0.refreshCache(r3)
                        if (r0 != r11) goto L_0x02c7
                        return r11
                    L_0x02c7:
                        XH.N r0 = XH.C16807N.f139792a
                        return r0
                    L_0x02ca:
                        QJ.Q r13 = r0.f113563a
                        com.sugarcube.core.logger.Priority r8 = com.sugarcube.core.logger.Priority.DEBUG
                        java.lang.StringBuilder r9 = new java.lang.StringBuilder
                        r9.<init>()
                        java.lang.String r10 = "userState: logged out, userState = "
                        r9.append(r10)
                        r9.append(r1)
                        java.lang.String r9 = r9.toString()
                        if (r9 != 0) goto L_0x02e3
                        r10 = r12
                        goto L_0x02e4
                    L_0x02e3:
                        r10 = r9
                    L_0x02e4:
                        int[] r9 = OE.v.f113532a
                        int r15 = r8.ordinal()
                        r9 = r9[r15]
                        r15 = 1
                        if (r9 == r15) goto L_0x03e4
                        r15 = 2
                        if (r9 == r15) goto L_0x03ab
                        if (r9 == r7) goto L_0x0372
                        r7 = 4
                        if (r9 == r7) goto L_0x0338
                        if (r9 != r4) goto L_0x0332
                        java.lang.Class r4 = r13.getClass()
                        java.lang.String r4 = r4.getName()
                        kotlin.jvm.internal.C17542s.g(r4)
                        r7 = 36
                        java.lang.String r7 = HJ.C15854t.s1(r4, r7, r14, r15, r14)
                        r9 = 46
                        java.lang.String r7 = HJ.C15854t.o1(r7, r9, r14, r15, r14)
                        int r9 = r7.length()
                        if (r9 != 0) goto L_0x0317
                        goto L_0x031b
                    L_0x0317:
                        java.lang.String r4 = HJ.C15854t.P0(r7, r6)
                    L_0x031b:
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        r6.append(r10)
                        r6.append(r5)
                        r6.append(r12)
                        java.lang.String r5 = r6.toString()
                        android.util.Log.e(r4, r5)
                        goto L_0x041c
                    L_0x0332:
                        XH.t r1 = new XH.t
                        r1.<init>()
                        throw r1
                    L_0x0338:
                        java.lang.Class r4 = r13.getClass()
                        java.lang.String r4 = r4.getName()
                        kotlin.jvm.internal.C17542s.g(r4)
                        r7 = 2
                        r9 = 36
                        java.lang.String r9 = HJ.C15854t.s1(r4, r9, r14, r7, r14)
                        r15 = 46
                        java.lang.String r7 = HJ.C15854t.o1(r9, r15, r14, r7, r14)
                        int r9 = r7.length()
                        if (r9 != 0) goto L_0x0357
                        goto L_0x035b
                    L_0x0357:
                        java.lang.String r4 = HJ.C15854t.P0(r7, r6)
                    L_0x035b:
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        r6.append(r10)
                        r6.append(r5)
                        r6.append(r12)
                        java.lang.String r5 = r6.toString()
                        android.util.Log.w(r4, r5)
                        goto L_0x041c
                    L_0x0372:
                        java.lang.Class r4 = r13.getClass()
                        java.lang.String r4 = r4.getName()
                        kotlin.jvm.internal.C17542s.g(r4)
                        r7 = 2
                        r9 = 36
                        java.lang.String r9 = HJ.C15854t.s1(r4, r9, r14, r7, r14)
                        r15 = 46
                        java.lang.String r7 = HJ.C15854t.o1(r9, r15, r14, r7, r14)
                        int r9 = r7.length()
                        if (r9 != 0) goto L_0x0391
                        goto L_0x0395
                    L_0x0391:
                        java.lang.String r4 = HJ.C15854t.P0(r7, r6)
                    L_0x0395:
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        r6.append(r10)
                        r6.append(r5)
                        r6.append(r12)
                        java.lang.String r5 = r6.toString()
                        android.util.Log.i(r4, r5)
                        goto L_0x041c
                    L_0x03ab:
                        java.lang.Class r4 = r13.getClass()
                        java.lang.String r4 = r4.getName()
                        kotlin.jvm.internal.C17542s.g(r4)
                        r7 = 2
                        r9 = 36
                        java.lang.String r9 = HJ.C15854t.s1(r4, r9, r14, r7, r14)
                        r15 = 46
                        java.lang.String r7 = HJ.C15854t.o1(r9, r15, r14, r7, r14)
                        int r9 = r7.length()
                        if (r9 != 0) goto L_0x03ca
                        goto L_0x03ce
                    L_0x03ca:
                        java.lang.String r4 = HJ.C15854t.P0(r7, r6)
                    L_0x03ce:
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        r6.append(r10)
                        r6.append(r5)
                        r6.append(r12)
                        java.lang.String r5 = r6.toString()
                        android.util.Log.d(r4, r5)
                        goto L_0x041c
                    L_0x03e4:
                        java.lang.Class r4 = r13.getClass()
                        java.lang.String r4 = r4.getName()
                        kotlin.jvm.internal.C17542s.g(r4)
                        r7 = 2
                        r9 = 36
                        java.lang.String r9 = HJ.C15854t.s1(r4, r9, r14, r7, r14)
                        r15 = 46
                        java.lang.String r7 = HJ.C15854t.o1(r9, r15, r14, r7, r14)
                        int r9 = r7.length()
                        if (r9 != 0) goto L_0x0403
                        goto L_0x0407
                    L_0x0403:
                        java.lang.String r4 = HJ.C15854t.P0(r7, r6)
                    L_0x0407:
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        r6.append(r10)
                        r6.append(r5)
                        r6.append(r12)
                        java.lang.String r5 = r6.toString()
                        android.util.Log.v(r4, r5)
                    L_0x041c:
                        OE.w r4 = r0.f113564b
                        com.sugarcube.app.base.data.SceneRepository r4 = r4.f113535c
                        r3.f113565c = r0
                        r3.f113566d = r1
                        r3.f113567e = r2
                        r3.f113568f = r13
                        r3.f113569g = r13
                        r3.f113570h = r8
                        r3.f113571i = r10
                        r3.f113572j = r12
                        r5 = 0
                        r3.f113573k = r5
                        r3.f113574l = r5
                        r3.f113575m = r5
                        r3.f113576n = r5
                        r3.f113577o = r5
                        r6 = 3
                        r3.f113580r = r6
                        java.lang.Object r4 = r4.clearCache(r3)
                        if (r4 != r11) goto L_0x0447
                        return r11
                    L_0x0447:
                        r15 = r2
                        r4 = r5
                        r6 = r4
                        r7 = r6
                        r9 = r12
                        r14 = r13
                        r2 = r0
                        r12 = r8
                        r8 = r7
                    L_0x0450:
                        OE.w r0 = r2.f113564b
                        com.sugarcube.app.base.data.source.CompositionRepository r0 = r0.f113536d
                        r3.f113565c = r2
                        r3.f113566d = r1
                        r3.f113567e = r15
                        r3.f113568f = r14
                        r3.f113569g = r13
                        r3.f113570h = r12
                        r3.f113571i = r10
                        r3.f113572j = r9
                        r3.f113573k = r8
                        r3.f113574l = r7
                        r3.f113575m = r6
                        r3.f113576n = r4
                        r3.f113577o = r5
                        r1 = 4
                        r3.f113580r = r1
                        java.lang.Object r0 = r0.clearCache(r3)
                        if (r0 != r11) goto L_0x047a
                        return r11
                    L_0x047a:
                        XH.N r0 = XH.C16807N.f139792a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: OE.w.a.C2784a.C2785a.emit(com.sugarcube.core.network.models.LoggedInUser, dI.e):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2784a(w wVar, C17164e<? super C2784a> eVar) {
                super(2, eVar);
                this.f113562e = wVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C2784a aVar = new C2784a(this.f113562e, eVar);
                aVar.f113561d = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C2784a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f113560c;
                if (i10 == 0) {
                    y.b(obj);
                    Q q10 = (Q) this.f113561d;
                    C16519P<LoggedInUser> user = this.f113562e.f113539g.getUser();
                    C2785a aVar = new C2785a(q10, this.f113562e);
                    this.f113561d = q10;
                    this.f113560c = 1;
                    if (user.collect(aVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Q q11 = (Q) this.f113561d;
                    y.b(obj);
                }
                throw new C16820k();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(w wVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f113559o = wVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f113559o, eVar);
            aVar.f113558n = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f113557m;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f113558n;
                Priority priority = Priority.DEBUG;
                int i11 = x.f113581a[priority.ordinal()];
                if (i11 == 1) {
                    String name = q10.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    Log.v(name, "Initializing Sugarcube Library" + " " + "");
                } else if (i11 == 2) {
                    String name2 = q10.getClass().getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    Log.d(name2, "Initializing Sugarcube Library" + " " + "");
                } else if (i11 == 3) {
                    String name3 = q10.getClass().getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    Log.i(name3, "Initializing Sugarcube Library" + " " + "");
                } else if (i11 == 4) {
                    String name4 = q10.getClass().getName();
                    C17542s.g(name4);
                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o15.length() != 0) {
                        name4 = C15854t.P0(o15, "Kt");
                    }
                    Log.w(name4, "Initializing Sugarcube Library" + " " + "");
                } else if (i11 == 5) {
                    String name5 = q10.getClass().getName();
                    C17542s.g(name5);
                    String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o16.length() != 0) {
                        name5 = C15854t.P0(o16, "Kt");
                    }
                    Log.e(name5, "Initializing Sugarcube Library" + " " + "");
                } else {
                    throw new t();
                }
                this.f113559o.f113533a.d();
                M e10 = this.f113559o.f113538f.e();
                C2784a aVar = new C2784a(this.f113559o, (C17164e<? super C2784a>) null);
                this.f113558n = q10;
                this.f113547c = q10;
                this.f113548d = q10;
                this.f113549e = priority;
                this.f113550f = "Initializing Sugarcube Library";
                this.f113551g = "";
                this.f113552h = 0;
                this.f113553i = 0;
                this.f113554j = 0;
                this.f113555k = 0;
                this.f113556l = 0;
                this.f113557m = 1;
                if (C16310i.g(e10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                String str = (String) this.f113551g;
                String str2 = (String) this.f113550f;
                Priority priority2 = (Priority) this.f113549e;
                Q q11 = (Q) this.f113548d;
                Q q12 = (Q) this.f113547c;
                Q q13 = (Q) this.f113558n;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public w(q qVar, com.sugarcube.app.base.external.config.a aVar, SceneRepository sceneRepository, CompositionRepository compositionRepository, Context context, C13309a aVar2, UserRepo userRepo, DeviceCompatibility deviceCompatibility, C13164r rVar, e eVar, MembershipUiRepo membershipUiRepo) {
        C17542s.j(qVar, "sugarcube");
        C17542s.j(aVar, "appConfig");
        C17542s.j(sceneRepository, "sceneRepository");
        C17542s.j(compositionRepository, "compositionRepository");
        C17542s.j(context, "context");
        C17542s.j(aVar2, "appEnvironment");
        C17542s.j(userRepo, "userRepo");
        C17542s.j(deviceCompatibility, "deviceCompatibility");
        C17542s.j(rVar, "uploadVersion");
        C17542s.j(eVar, "uploadScheduler");
        C17542s.j(membershipUiRepo, "membershipRepo");
        this.f113533a = qVar;
        this.f113534b = aVar;
        this.f113535c = sceneRepository;
        this.f113536d = compositionRepository;
        this.f113537e = context;
        this.f113538f = aVar2;
        this.f113539g = userRepo;
        this.f113540h = deviceCompatibility;
        this.f113541i = rVar;
        this.f113542j = eVar;
        this.f113543k = membershipUiRepo;
        this.f113545m = sceneRepository.getRoomsReadyCount();
        this.f113546n = C5210m.c(sceneRepository.getRoomsReadyCount(), (C17168i) null, 0, 3, (Object) null);
    }

    public final void g() {
        F0 f02 = this.f113544l;
        if (f02 == null || !f02.c()) {
            this.f113544l = C16314k.d(this.f113538f.b(), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
            return;
        }
        int i10 = t.f113530a[Priority.WARN.ordinal()];
        Class<w> cls = w.class;
        if (i10 == 1) {
            String name = cls.getName();
            C17542s.g(name);
            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o12.length() != 0) {
                name = C15854t.P0(o12, "Kt");
            }
            Log.v(name, "Already started sugarcube service." + " " + "");
        } else if (i10 == 2) {
            String name2 = cls.getName();
            C17542s.g(name2);
            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o13.length() != 0) {
                name2 = C15854t.P0(o13, "Kt");
            }
            Log.d(name2, "Already started sugarcube service." + " " + "");
        } else if (i10 == 3) {
            String name3 = cls.getName();
            C17542s.g(name3);
            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o14.length() != 0) {
                name3 = C15854t.P0(o14, "Kt");
            }
            Log.i(name3, "Already started sugarcube service." + " " + "");
        } else if (i10 == 4) {
            String name4 = cls.getName();
            C17542s.g(name4);
            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o15.length() != 0) {
                name4 = C15854t.P0(o15, "Kt");
            }
            Log.w(name4, "Already started sugarcube service." + " " + "");
        } else if (i10 == 5) {
            String name5 = cls.getName();
            C17542s.g(name5);
            String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o16.length() != 0) {
                name5 = C15854t.P0(o16, "Kt");
            }
            Log.e(name5, "Already started sugarcube service." + " " + "");
        } else {
            throw new t();
        }
    }
}
