package gF;

import OE.q;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import W2.f;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.X;
import android.app.Activity;
import android.net.Uri;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.app.base.data.asset.VideoAssetRepository;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.data.preferences.PreferenceImpl;
import com.sugarcube.app.base.data.preferences.PreferenceStorage;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep;
import com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum;
import com.sugarcube.app.base.ui.ultrawide.UltrawideActivity;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kF.C14681B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.p;
import pF.C14926f;
import x4.O;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0015¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015¢\u0006\u0004\b)\u0010\u0017J\u0015\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020>0B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020,0K8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006O"}, d2 = {"LgF/a;", "Landroidx/lifecycle/f0;", "LOE/q;", "sugarcube", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "videoAssetRepository", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "prefStorage", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "Landroidx/lifecycle/U;", "stateHandle", "<init>", "(LOE/q;Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;Lcom/sugarcube/app/base/data/SceneRepository;Landroidx/lifecycle/U;)V", "Lcom/sugarcube/app/base/navigation/Kreativ$Capture$TutorialStep;", "stepEnum", "LXH/N;", "P", "(Lcom/sugarcube/app/base/navigation/Kreativ$Capture$TutorialStep;)V", "Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;", "O", "(Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;)V", "G", "LW2/f$a;", "", "J", "(Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;)LW2/f$a;", "Lcom/sugarcube/app/base/data/asset/VideoAsset;", "videoAsset", "Landroid/net/Uri;", "L", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;)Landroid/net/Uri;", "", "H", "(Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;)Ljava/lang/Object;", "LkF/B;", "playbackState", "M", "(LkF/B;)V", "Q", "Landroid/app/Activity;", "activity", "", "N", "(Landroid/app/Activity;)Z", "m", "LOE/q;", "K", "()LOE/q;", "n", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "o", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "p", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "q", "Lcom/sugarcube/app/base/data/SceneRepository;", "r", "Landroidx/lifecycle/U;", "Landroidx/lifecycle/K;", "LpF/f;", "s", "Landroidx/lifecycle/K;", "_pageUIState", "Landroidx/lifecycle/F;", "t", "Landroidx/lifecycle/F;", "I", "()Landroidx/lifecycle/F;", "pageUIState", "u", "Z", "isSkipTutorialEnabled", "LTJ/B;", "v", "LTJ/B;", "canSkip", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gF.a  reason: case insensitive filesystem */
public final class C14517a extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final q f127309m;

    /* renamed from: n  reason: collision with root package name */
    private final VideoAssetRepository f127310n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final ConfigRepository f127311o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final PreferenceStorage f127312p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final SceneRepository f127313q;

    /* renamed from: r  reason: collision with root package name */
    private final U f127314r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public K<C14926f> f127315s;

    /* renamed from: t  reason: collision with root package name */
    private final F<C14926f> f127316t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f127317u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public C16505B<Boolean> f127318v = C16521S.a(Boolean.FALSE);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capture.tutorial.viewmodel.TutorialPageViewModel$1", f = "TutorialPageViewModel.kt", l = {78, 80, 82}, m = "invokeSuspend")
    /* renamed from: gF.a$a  reason: collision with other inner class name */
    static final class C3122a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f127319c;

        /* renamed from: d  reason: collision with root package name */
        Object f127320d;

        /* renamed from: e  reason: collision with root package name */
        Object f127321e;

        /* renamed from: f  reason: collision with root package name */
        Object f127322f;

        /* renamed from: g  reason: collision with root package name */
        int f127323g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C14517a f127324h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gF.a$a$a  reason: collision with other inner class name */
        static final class C3123a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C14517a f127325a;

            C3123a(C14517a aVar) {
                this.f127325a = aVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                K D10 = this.f127325a.f127315s;
                C14926f fVar = (C14926f) this.f127325a.f127315s.getValue();
                C14926f fVar2 = null;
                if (fVar != null) {
                    fVar2 = C14926f.b(fVar, (TutorialStep) null, z10, 1, (Object) null);
                }
                D10.setValue(fVar2);
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3122a(C14517a aVar, C17164e<? super C3122a> eVar) {
            super(2, eVar);
            this.f127324h = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3122a(this.f127324h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3122a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x00d2 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f127323g
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0046
                if (r1 == r5) goto L_0x0038
                if (r1 == r3) goto L_0x0027
                if (r1 == r2) goto L_0x001a
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001a:
                java.lang.Object r0 = r10.f127321e
                gF.a r0 = (gF.C14517a) r0
                java.lang.Object r0 = r10.f127320d
                java.util.List r0 = (java.util.List) r0
                XH.y.b(r11)
                goto L_0x00d3
            L_0x0027:
                int r1 = r10.f127319c
                java.lang.Object r3 = r10.f127322f
                java.lang.Object r4 = r10.f127321e
                gF.a r4 = (gF.C14517a) r4
                java.lang.Object r5 = r10.f127320d
                java.util.List r5 = (java.util.List) r5
                XH.y.b(r11)
                goto L_0x00b5
            L_0x0038:
                int r1 = r10.f127319c
                java.lang.Object r6 = r10.f127321e
                gF.a r6 = (gF.C14517a) r6
                java.lang.Object r7 = r10.f127320d
                java.util.List r7 = (java.util.List) r7
                XH.y.b(r11)
                goto L_0x0082
            L_0x0046:
                XH.y.b(r11)
                gF.a r11 = r10.f127324h
                com.sugarcube.app.base.data.SceneRepository r11 = r11.f127313q
                androidx.lifecycle.F r11 = r11.getScenes()
                java.lang.Object r11 = r11.getValue()
                java.util.List r11 = (java.util.List) r11
                if (r11 == 0) goto L_0x0067
                r1 = r11
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                r1 = r1 ^ r5
                if (r1 != r5) goto L_0x0067
                r1 = r5
                goto L_0x0068
            L_0x0067:
                r1 = r4
            L_0x0068:
                gF.a r6 = r10.f127324h
                com.sugarcube.app.base.data.feature.ConfigRepository r7 = r6.f127311o
                com.sugarcube.app.base.data.feature.FeatureFlags$SkipTutorial r8 = com.sugarcube.app.base.data.feature.FeatureFlags.SkipTutorial.INSTANCE
                r10.f127320d = r11
                r10.f127321e = r6
                r10.f127319c = r1
                r10.f127323g = r5
                java.lang.Object r7 = r7.isEnabled(r8, r10)
                if (r7 != r0) goto L_0x007f
                return r0
            L_0x007f:
                r9 = r7
                r7 = r11
                r11 = r9
            L_0x0082:
                r8 = r11
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x008d
                if (r1 == 0) goto L_0x008e
            L_0x008d:
                r4 = r5
            L_0x008e:
                r6.f127317u = r4
                gF.a r4 = r10.f127324h
                TJ.B r4 = r4.f127318v
                gF.a r5 = r10.f127324h
                boolean r5 = r5.f127317u
                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                r10.f127320d = r7
                r10.f127321e = r6
                r10.f127322f = r11
                r10.f127319c = r1
                r10.f127323g = r3
                java.lang.Object r3 = r4.emit(r5, r10)
                if (r3 != r0) goto L_0x00b2
                return r0
            L_0x00b2:
                r3 = r11
                r4 = r6
                r5 = r7
            L_0x00b5:
                gF.a r11 = r10.f127324h
                TJ.B r11 = r11.f127318v
                gF.a$a$a r6 = new gF.a$a$a
                gF.a r7 = r10.f127324h
                r6.<init>(r7)
                r10.f127320d = r5
                r10.f127321e = r4
                r10.f127322f = r3
                r10.f127319c = r1
                r10.f127323g = r2
                java.lang.Object r11 = r11.collect(r6, r10)
                if (r11 != r0) goto L_0x00d3
                return r0
            L_0x00d3:
                XH.k r11 = new XH.k
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: gF.C14517a.C3122a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gF.a$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f127326a;

        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|39) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum[] r0 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_GET_READY_1     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_GET_READY_2     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_SCAN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_SCAN_AGAIN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_GET_READY_1     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_GET_READY_2     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_SCAN     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_SCAN_AGAIN     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_AR_GET_READY     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_AR_INIT     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_AR_PANO     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_AR_SCAN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_AR_SCAN_AGAIN     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_AR_GET_READY_1     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_AR_GET_READY_2     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_AR_INIT     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_AR_SCAN     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_AR_SCAN_AGAIN     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                f127326a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gF.C14517a.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capture.tutorial.viewmodel.TutorialPageViewModel$checkIfTutorialStepIsComplete$1", f = "TutorialPageViewModel.kt", l = {210}, m = "invokeSuspend")
    /* renamed from: gF.a$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f127327c;

        /* renamed from: d  reason: collision with root package name */
        Object f127328d;

        /* renamed from: e  reason: collision with root package name */
        Object f127329e;

        /* renamed from: f  reason: collision with root package name */
        Object f127330f;

        /* renamed from: g  reason: collision with root package name */
        Object f127331g;

        /* renamed from: h  reason: collision with root package name */
        int f127332h;

        /* renamed from: i  reason: collision with root package name */
        int f127333i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f127334j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C14517a f127335k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ TutorialStepEnum f127336l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gF.a$c$a  reason: collision with other inner class name */
        static final class C3124a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Q f127337a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C14517a f127338b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ TutorialStepEnum f127339c;

            C3124a(Q q10, C14517a aVar, TutorialStepEnum tutorialStepEnum) {
                this.f127337a = q10;
                this.f127338b = aVar;
                this.f127339c = tutorialStepEnum;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
                if (r0 == null) goto L_0x0037;
             */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.String r5, dI.C17164e<? super XH.C16807N> r6) {
                /*
                    r4 = this;
                    int r6 = r5.length()
                    r0 = 0
                    if (r6 <= 0) goto L_0x0008
                    goto L_0x0009
                L_0x0008:
                    r5 = r0
                L_0x0009:
                    r6 = 0
                    if (r5 == 0) goto L_0x0037
                    gF.a r1 = r4.f127338b
                    com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r2 = r4.f127339c
                    com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum$Companion r3 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.Companion
                    com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r5 = r3.getStep(r5)
                    if (r5 == 0) goto L_0x0035
                    TJ.B r0 = r1.f127318v
                    boolean r1 = r1.f127317u
                    if (r1 != 0) goto L_0x002b
                    boolean r5 = r2.isFurtherThan(r5)
                    if (r5 != 0) goto L_0x0029
                    goto L_0x002b
                L_0x0029:
                    r5 = r6
                    goto L_0x002c
                L_0x002b:
                    r5 = 1
                L_0x002c:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.setValue(r5)
                    XH.N r0 = XH.C16807N.f139792a
                L_0x0035:
                    if (r0 != 0) goto L_0x0044
                L_0x0037:
                    gF.a r5 = r4.f127338b
                    TJ.B r5 = r5.f127318v
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
                    r5.setValue(r6)
                L_0x0044:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: gF.C14517a.c.C3124a.emit(java.lang.String, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14517a aVar, TutorialStepEnum tutorialStepEnum, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f127335k = aVar;
            this.f127336l = tutorialStepEnum;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f127335k, this.f127336l, eVar);
            cVar.f127334j = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f127333i;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f127334j;
                f.a j10 = this.f127335k.J(this.f127336l);
                if (j10 != null) {
                    C14517a aVar = this.f127335k;
                    TutorialStepEnum tutorialStepEnum = this.f127336l;
                    C16532g preference = aVar.f127312p.getPreference(j10, "");
                    C3124a aVar2 = new C3124a(q10, aVar, tutorialStepEnum);
                    this.f127334j = q10;
                    this.f127327c = j10;
                    this.f127328d = j10;
                    this.f127329e = aVar;
                    this.f127330f = tutorialStepEnum;
                    this.f127331g = j10;
                    this.f127332h = 0;
                    this.f127333i = 1;
                    if (preference.collect(aVar2, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                f.a aVar3 = (f.a) this.f127331g;
                TutorialStepEnum tutorialStepEnum2 = (TutorialStepEnum) this.f127330f;
                C14517a aVar4 = (C14517a) this.f127329e;
                f.a aVar5 = (f.a) this.f127328d;
                f.a aVar6 = (f.a) this.f127327c;
                Q q11 = (Q) this.f127334j;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capture.tutorial.viewmodel.TutorialPageViewModel$saveTutorialStepProgress$1", f = "TutorialPageViewModel.kt", l = {192}, m = "invokeSuspend")
    /* renamed from: gF.a$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f127340c;

        /* renamed from: d  reason: collision with root package name */
        Object f127341d;

        /* renamed from: e  reason: collision with root package name */
        Object f127342e;

        /* renamed from: f  reason: collision with root package name */
        Object f127343f;

        /* renamed from: g  reason: collision with root package name */
        Object f127344g;

        /* renamed from: h  reason: collision with root package name */
        int f127345h;

        /* renamed from: i  reason: collision with root package name */
        int f127346i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f127347j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C14517a f127348k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ TutorialStepEnum f127349l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gF.a$d$a  reason: collision with other inner class name */
        static final class C3125a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Q f127350a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ TutorialStepEnum f127351b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C14517a f127352c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a<String> f127353d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capture.tutorial.viewmodel.TutorialPageViewModel$saveTutorialStepProgress$1$1$1", f = "TutorialPageViewModel.kt", l = {196, 200}, m = "emit")
            /* renamed from: gF.a$d$a$a  reason: collision with other inner class name */
            static final class C3126a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                Object f127354c;

                /* renamed from: d  reason: collision with root package name */
                Object f127355d;

                /* renamed from: e  reason: collision with root package name */
                Object f127356e;

                /* renamed from: f  reason: collision with root package name */
                Object f127357f;

                /* renamed from: g  reason: collision with root package name */
                Object f127358g;

                /* renamed from: h  reason: collision with root package name */
                Object f127359h;

                /* renamed from: i  reason: collision with root package name */
                Object f127360i;

                /* renamed from: j  reason: collision with root package name */
                Object f127361j;

                /* renamed from: k  reason: collision with root package name */
                Object f127362k;

                /* renamed from: l  reason: collision with root package name */
                Object f127363l;

                /* renamed from: m  reason: collision with root package name */
                Object f127364m;

                /* renamed from: n  reason: collision with root package name */
                Object f127365n;

                /* renamed from: o  reason: collision with root package name */
                Object f127366o;

                /* renamed from: p  reason: collision with root package name */
                int f127367p;

                /* renamed from: q  reason: collision with root package name */
                int f127368q;

                /* renamed from: r  reason: collision with root package name */
                /* synthetic */ Object f127369r;

                /* renamed from: s  reason: collision with root package name */
                final /* synthetic */ C3125a<T> f127370s;

                /* renamed from: t  reason: collision with root package name */
                int f127371t;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C3126a(C3125a<? super T> aVar, C17164e<? super C3126a> eVar) {
                    super(eVar);
                    this.f127370s = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f127369r = obj;
                    this.f127371t |= Integer.MIN_VALUE;
                    return this.f127370s.emit((String) null, this);
                }
            }

            C3125a(Q q10, TutorialStepEnum tutorialStepEnum, C14517a aVar, f.a<String> aVar2) {
                this.f127350a = q10;
                this.f127351b = tutorialStepEnum;
                this.f127352c = aVar;
                this.f127353d = aVar2;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f1, code lost:
                if (r6 == null) goto L_0x00f6;
             */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x009a  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.String r17, dI.C17164e<? super XH.C16807N> r18) {
                /*
                    r16 = this;
                    r0 = r16
                    r1 = r17
                    r2 = r18
                    boolean r3 = r2 instanceof gF.C14517a.d.C3125a.C3126a
                    if (r3 == 0) goto L_0x0019
                    r3 = r2
                    gF.a$d$a$a r3 = (gF.C14517a.d.C3125a.C3126a) r3
                    int r4 = r3.f127371t
                    r5 = -2147483648(0xffffffff80000000, float:-0.0)
                    r6 = r4 & r5
                    if (r6 == 0) goto L_0x0019
                    int r4 = r4 - r5
                    r3.f127371t = r4
                    goto L_0x001e
                L_0x0019:
                    gF.a$d$a$a r3 = new gF.a$d$a$a
                    r3.<init>(r0, r2)
                L_0x001e:
                    java.lang.Object r4 = r3.f127369r
                    java.lang.Object r5 = eI.C17187b.f()
                    int r6 = r3.f127371t
                    r7 = 2
                    r8 = 1
                    r9 = 0
                    if (r6 == 0) goto L_0x009a
                    if (r6 == r8) goto L_0x0060
                    if (r6 != r7) goto L_0x0058
                    java.lang.Object r1 = r3.f127363l
                    QJ.Q r1 = (QJ.Q) r1
                    java.lang.Object r1 = r3.f127362k
                    com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = (com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum) r1
                    java.lang.Object r1 = r3.f127361j
                    W2.f$a r1 = (W2.f.a) r1
                    java.lang.Object r1 = r3.f127360i
                    gF.a r1 = (gF.C14517a) r1
                    java.lang.Object r1 = r3.f127359h
                    QJ.Q r1 = (QJ.Q) r1
                    java.lang.Object r1 = r3.f127357f
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r1 = r3.f127356e
                    dI.e r1 = (dI.C17164e) r1
                    java.lang.Object r1 = r3.f127355d
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r1 = r3.f127354c
                    gF.a$d$a r1 = (gF.C14517a.d.C3125a) r1
                    XH.y.b(r4)
                    goto L_0x0125
                L_0x0058:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0060:
                    java.lang.Object r1 = r3.f127366o
                    com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = (com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum) r1
                    java.lang.Object r1 = r3.f127365n
                    com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = (com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum) r1
                    java.lang.Object r1 = r3.f127364m
                    com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = (com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum) r1
                    java.lang.Object r1 = r3.f127363l
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r1 = r3.f127362k
                    W2.f$a r1 = (W2.f.a) r1
                    java.lang.Object r1 = r3.f127361j
                    gF.a r1 = (gF.C14517a) r1
                    java.lang.Object r1 = r3.f127360i
                    com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = (com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum) r1
                    java.lang.Object r1 = r3.f127359h
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r1 = r3.f127358g
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r1 = r3.f127357f
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r2 = r3.f127356e
                    dI.e r2 = (dI.C17164e) r2
                    java.lang.Object r6 = r3.f127355d
                    java.lang.String r6 = (java.lang.String) r6
                    java.lang.Object r8 = r3.f127354c
                    gF.a$d$a r8 = (gF.C14517a.d.C3125a) r8
                    XH.y.b(r4)
                    r4 = r1
                    r1 = r6
                    goto L_0x00ed
                L_0x009a:
                    XH.y.b(r4)
                    int r4 = r17.length()
                    r6 = 0
                    if (r4 <= 0) goto L_0x00a6
                    r4 = r1
                    goto L_0x00a7
                L_0x00a6:
                    r4 = r6
                L_0x00a7:
                    if (r4 == 0) goto L_0x00f4
                    com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r10 = r0.f127351b
                    gF.a r11 = r0.f127352c
                    W2.f$a<java.lang.String> r12 = r0.f127353d
                    com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum$Companion r13 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.Companion
                    com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r13 = r13.getStep(r4)
                    if (r13 == 0) goto L_0x00f0
                    boolean r6 = r10.isFurtherThan(r13)
                    if (r6 == 0) goto L_0x00ec
                    com.sugarcube.app.base.data.preferences.PreferenceStorage r6 = r11.f127312p
                    java.lang.String r14 = r10.name()
                    r3.f127354c = r0
                    r3.f127355d = r1
                    r3.f127356e = r2
                    r3.f127357f = r4
                    r3.f127358g = r1
                    r3.f127359h = r4
                    r3.f127360i = r10
                    r3.f127361j = r11
                    r3.f127362k = r12
                    r3.f127363l = r4
                    r3.f127364m = r13
                    r3.f127365n = r13
                    r3.f127366o = r13
                    r3.f127367p = r9
                    r3.f127368q = r9
                    r3.f127371t = r8
                    java.lang.Object r6 = r6.setPreference(r12, r14, r3)
                    if (r6 != r5) goto L_0x00ec
                    return r5
                L_0x00ec:
                    r8 = r0
                L_0x00ed:
                    XH.N r6 = XH.C16807N.f139792a
                    goto L_0x00f1
                L_0x00f0:
                    r8 = r0
                L_0x00f1:
                    if (r6 != 0) goto L_0x0125
                    goto L_0x00f6
                L_0x00f4:
                    r8 = r0
                    r6 = r1
                L_0x00f6:
                    QJ.Q r10 = r8.f127350a
                    gF.a r11 = r8.f127352c
                    W2.f$a<java.lang.String> r12 = r8.f127353d
                    com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r13 = r8.f127351b
                    com.sugarcube.app.base.data.preferences.PreferenceStorage r14 = r11.f127312p
                    java.lang.String r15 = r13.name()
                    r3.f127354c = r8
                    r3.f127355d = r1
                    r3.f127356e = r2
                    r3.f127357f = r4
                    r3.f127358g = r6
                    r3.f127359h = r10
                    r3.f127360i = r11
                    r3.f127361j = r12
                    r3.f127362k = r13
                    r3.f127363l = r10
                    r3.f127367p = r9
                    r3.f127371t = r7
                    java.lang.Object r1 = r14.setPreference(r12, r15, r3)
                    if (r1 != r5) goto L_0x0125
                    return r5
                L_0x0125:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: gF.C14517a.d.C3125a.emit(java.lang.String, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C14517a aVar, TutorialStepEnum tutorialStepEnum, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f127348k = aVar;
            this.f127349l = tutorialStepEnum;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f127348k, this.f127349l, eVar);
            dVar.f127347j = obj;
            return dVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f127346i;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f127347j;
                f.a j10 = this.f127348k.J(this.f127349l);
                if (j10 != null) {
                    C14517a aVar = this.f127348k;
                    TutorialStepEnum tutorialStepEnum = this.f127349l;
                    C16532g preference = aVar.f127312p.getPreference(j10, "");
                    C3125a aVar2 = new C3125a(q10, tutorialStepEnum, aVar, j10);
                    this.f127347j = q10;
                    this.f127340c = j10;
                    this.f127341d = j10;
                    this.f127342e = aVar;
                    this.f127343f = tutorialStepEnum;
                    this.f127344g = j10;
                    this.f127345h = 0;
                    this.f127346i = 1;
                    if (preference.collect(aVar2, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                f.a aVar3 = (f.a) this.f127344g;
                TutorialStepEnum tutorialStepEnum2 = (TutorialStepEnum) this.f127343f;
                C14517a aVar4 = (C14517a) this.f127342e;
                f.a aVar5 = (f.a) this.f127341d;
                f.a aVar6 = (f.a) this.f127340c;
                Q q11 = (Q) this.f127347j;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public C14517a(q qVar, VideoAssetRepository videoAssetRepository, ConfigRepository configRepository, PreferenceStorage preferenceStorage, SceneRepository sceneRepository, U u10) {
        C17542s.j(qVar, "sugarcube");
        C17542s.j(videoAssetRepository, "videoAssetRepository");
        C17542s.j(configRepository, "configRepository");
        C17542s.j(preferenceStorage, "prefStorage");
        C17542s.j(sceneRepository, "sceneRepository");
        C17542s.j(u10, "stateHandle");
        this.f127309m = qVar;
        this.f127310n = videoAssetRepository;
        this.f127311o = configRepository;
        this.f127312p = preferenceStorage;
        this.f127313q = sceneRepository;
        this.f127314r = u10;
        K<C14926f> k10 = new K<>();
        this.f127315s = k10;
        this.f127316t = k10;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C3122a(this, (C17164e<? super C3122a>) null), 3, (Object) null);
        P((Kreativ.Capture.TutorialStep) O.a(u10, P.b(Kreativ.Capture.TutorialStep.class), X.j()));
    }

    private final void G(TutorialStepEnum tutorialStepEnum) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new c(this, tutorialStepEnum, (C17164e<? super c>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final f.a<String> J(TutorialStepEnum tutorialStepEnum) {
        if (tutorialStepEnum.isHybrid()) {
            return PreferenceImpl.PreferencesKeys.getTUTORIAL_HYBRID_CHECKPOINT_KEY();
        }
        if (tutorialStepEnum.isUltrawide()) {
            return PreferenceImpl.PreferencesKeys.getTUTORIAL_ULTRAWIDE_CHECKPOINT_KEY();
        }
        if (tutorialStepEnum.isHybridAR()) {
            return PreferenceImpl.PreferencesKeys.getTUTORIAL_HYBRID_AR_CHECKPOINT_KEY();
        }
        if (tutorialStepEnum.isUltrawideAR()) {
            return PreferenceImpl.PreferencesKeys.getTUTORIAL_ULTRAWIDE_AR_CHECKPOINT_KEY();
        }
        return null;
    }

    private final void O(TutorialStepEnum tutorialStepEnum) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new d(this, tutorialStepEnum, (C17164e<? super d>) null), 3, (Object) null);
    }

    private final void P(Kreativ.Capture.TutorialStep tutorialStep) {
        TutorialStep step = tutorialStep.b().getStep();
        if (step != null) {
            G(tutorialStep.b());
            this.f127309m.b().captureTutorialVideoStart(step.getStepEnum().getStepNum());
            this.f127315s.setValue(new C14926f(step, this.f127318v.getValue().booleanValue() || this.f127317u));
        }
    }

    public final Object H(TutorialStepEnum tutorialStepEnum) {
        C17542s.j(tutorialStepEnum, "stepEnum");
        switch (b.f127326a[tutorialStepEnum.ordinal()]) {
            case 1:
                return new Kreativ.Capture.TutorialStep(TutorialStepEnum.HY_GET_READY_2);
            case 2:
                return Kreativ.Capture.Hybrid.h.INSTANCE;
            case 3:
                return Kreativ.Capture.Hybrid.a.INSTANCE;
            case 4:
                return Kreativ.Capture.Hybrid.j.INSTANCE;
            case 5:
                return new Kreativ.Capture.TutorialStep(TutorialStepEnum.UW_GET_READY_2);
            case 6:
                return Kreativ.Capture.d.C3033d.INSTANCE;
            case 7:
                return Kreativ.Capture.d.a.INSTANCE;
            case 8:
                return Kreativ.Capture.d.j.INSTANCE;
            case 9:
                return new Kreativ.Capture.TutorialStep(TutorialStepEnum.HY_AR_INIT);
            case 10:
                return Kreativ.Capture.Hybrid.b.INSTANCE;
            case 11:
                return Kreativ.Capture.Hybrid.h.INSTANCE;
            case 12:
                return Kreativ.Capture.Hybrid.a.INSTANCE;
            case 13:
                return Kreativ.Capture.Hybrid.j.INSTANCE;
            case 14:
                return new Kreativ.Capture.TutorialStep(TutorialStepEnum.UW_AR_GET_READY_2);
            case 15:
                return Kreativ.Capture.d.C3033d.INSTANCE;
            case 16:
                return Kreativ.Capture.d.b.INSTANCE;
            case 17:
                return Kreativ.Capture.d.a.INSTANCE;
            case 18:
                return Kreativ.Capture.d.j.INSTANCE;
            default:
                throw new t();
        }
    }

    public final F<C14926f> I() {
        return this.f127316t;
    }

    public final q K() {
        return this.f127309m;
    }

    public final Uri L(VideoAsset videoAsset) {
        C17542s.j(videoAsset, "videoAsset");
        return this.f127310n.get(videoAsset);
    }

    public final void M(C14681B b10) {
        C17542s.j(b10, "playbackState");
        if (C17542s.e(b10, C14681B.d.f128661a)) {
            this.f127309m.b().captureTutorialVideoVideoStart();
        } else if (C17542s.e(b10, C14681B.b.f128659a)) {
            this.f127309m.b().captureTutorialVideoVideoPause();
        } else if (C17542s.e(b10, C14681B.a.f128658a)) {
            this.f127309m.b().captureTutorialVideoVideoFinish();
            this.f127318v.setValue(Boolean.TRUE);
        }
    }

    public final boolean N(Activity activity) {
        C17542s.j(activity, "activity");
        return ((Boolean) this.f127311o.getBlocking(FeatureFlags.UltrawideEnabled.INSTANCE)).booleanValue() && UltrawideActivity.f125419I.a(activity);
    }

    public final void Q(TutorialStepEnum tutorialStepEnum) {
        C17542s.j(tutorialStepEnum, "stepEnum");
        this.f127309m.b().captureTutorialVideoEnd(tutorialStepEnum.getStepNum());
        O(tutorialStepEnum);
    }
}
