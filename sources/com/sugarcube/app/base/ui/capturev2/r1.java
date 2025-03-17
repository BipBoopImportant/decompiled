package com.sugarcube.app.base.ui.capturev2;

import OE.q;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.app.base.data.asset.VideoAssetRepository;
import com.sugarcube.app.base.data.feature.ConfigItems;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep;
import com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import kF.C14681B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import pF.C14926f;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020&0*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010\u001aR\u001c\u0010:\u001a\b\u0012\u0004\u0012\u000200078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/r1;", "Landroidx/lifecycle/f0;", "LOE/q;", "sugarcube", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "videoAssetRepository", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "<init>", "(LOE/q;Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/app/base/data/SceneRepository;)V", "Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;", "stepEnum", "LXH/N;", "J", "(Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;)V", "Lcom/sugarcube/app/base/data/asset/VideoAsset;", "videoAsset", "Landroid/net/Uri;", "G", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;)Landroid/net/Uri;", "LkF/B;", "playbackState", "H", "(LkF/B;)V", "I", "m", "LOE/q;", "getSugarcube", "()LOE/q;", "n", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "o", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "p", "Lcom/sugarcube/app/base/data/SceneRepository;", "Landroidx/lifecycle/K;", "LpF/f;", "q", "Landroidx/lifecycle/K;", "_pageUIState", "Landroidx/lifecycle/F;", "r", "Landroidx/lifecycle/F;", "F", "()Landroidx/lifecycle/F;", "pageUIState", "", "s", "Z", "isSkipTutorialEnabled", "", "t", "tutorialProgressNum", "LTJ/B;", "u", "LTJ/B;", "canSkip", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r1 extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final q f124031m;

    /* renamed from: n  reason: collision with root package name */
    private final VideoAssetRepository f124032n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final ConfigRepository f124033o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final SceneRepository f124034p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public K<C14926f> f124035q;

    /* renamed from: r  reason: collision with root package name */
    private final F<C14926f> f124036r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f124037s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public int f124038t;

    /* renamed from: u  reason: collision with root package name */
    private C16505B<Boolean> f124039u = C16521S.a(Boolean.FALSE);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capturev2.TutorialViewModel$1", f = "TutorialViewModel.kt", l = {45}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124040c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r1 f124041d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.capturev2.r1$a$a  reason: collision with other inner class name */
        static final class C3041a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r1 f124042a;

            C3041a(r1 r1Var) {
                this.f124042a = r1Var;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                List value;
                r1 r1Var = this.f124042a;
                boolean z11 = true;
                if (!z10 && ((value = r1Var.f124034p.getScenes().getValue()) == null || !(!value.isEmpty()))) {
                    z11 = false;
                }
                r1Var.f124037s = z11;
                boolean C10 = this.f124042a.f124037s;
                Log.d(AnyKt.SUGARCUBE_TAG, "isSkipTutorialEnabled = " + C10);
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r1 r1Var, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f124041d = r1Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f124041d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124040c;
            if (i10 == 0) {
                y.b(obj);
                C16532g observe = this.f124041d.f124033o.observe(FeatureFlags.SkipTutorial.INSTANCE);
                C3041a aVar = new C3041a(this.f124041d);
                this.f124040c = 1;
                if (observe.collect(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capturev2.TutorialViewModel$2", f = "TutorialViewModel.kt", l = {51}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124043c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r1 f124044d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r1 f124045a;

            a(r1 r1Var) {
                this.f124045a = r1Var;
            }

            /* renamed from: c */
            public final Object emit(Integer num, C17164e<? super C16807N> eVar) {
                this.f124045a.f124038t = num.intValue();
                int j10 = this.f124045a.f124038t;
                Log.d(AnyKt.SUGARCUBE_TAG, "tutorialProgressNum = " + j10);
                C14926f fVar = (C14926f) this.f124045a.f124035q.getValue();
                if (fVar != null) {
                    r1 r1Var = this.f124045a;
                    r1Var.f124035q.setValue(C14926f.b(fVar, (TutorialStep) null, r1Var.f124038t >= fVar.c().getStepEnum().getStepNum() || r1Var.f124037s, 1, (Object) null));
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r1 r1Var, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f124044d = r1Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f124044d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124043c;
            if (i10 == 0) {
                y.b(obj);
                C16532g observe = this.f124044d.f124033o.observe(ConfigItems.CaptureTutorialProgress.INSTANCE);
                a aVar = new a(this.f124044d);
                this.f124043c = 1;
                if (observe.collect(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capturev2.TutorialViewModel$saveTutorialStepProgress$1", f = "TutorialViewModel.kt", l = {103}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124046c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TutorialStepEnum f124047d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r1 f124048e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TutorialStepEnum tutorialStepEnum, r1 r1Var, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f124047d = tutorialStepEnum;
            this.f124048e = r1Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f124047d, this.f124048e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124046c;
            if (i10 == 0) {
                y.b(obj);
                int stepNum = this.f124047d.getStepNum();
                int j10 = this.f124048e.f124038t;
                Log.d(AnyKt.SUGARCUBE_TAG, "step progress stepNum=" + stepNum + " progressNum=" + j10);
                if (this.f124047d.getStepNum() > this.f124048e.f124038t) {
                    ConfigRepository h10 = this.f124048e.f124033o;
                    ConfigItems.CaptureTutorialProgress captureTutorialProgress = ConfigItems.CaptureTutorialProgress.INSTANCE;
                    Integer e10 = kotlin.coroutines.jvm.internal.b.e(this.f124047d.getStepNum());
                    this.f124046c = 1;
                    if (h10.override(captureTutorialProgress, e10, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public r1(q qVar, VideoAssetRepository videoAssetRepository, ConfigRepository configRepository, SceneRepository sceneRepository) {
        VideoAssetRepository videoAssetRepository2 = videoAssetRepository;
        ConfigRepository configRepository2 = configRepository;
        SceneRepository sceneRepository2 = sceneRepository;
        C17542s.j(qVar, "sugarcube");
        C17542s.j(videoAssetRepository2, "videoAssetRepository");
        C17542s.j(configRepository2, "configRepository");
        C17542s.j(sceneRepository2, "sceneRepository");
        this.f124031m = qVar;
        this.f124032n = videoAssetRepository2;
        this.f124033o = configRepository2;
        this.f124034p = sceneRepository2;
        K<C14926f> k10 = new K<>();
        this.f124035q = k10;
        this.f124036r = k10;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
        F0 unused2 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    public final F<C14926f> F() {
        return this.f124036r;
    }

    public final Uri G(VideoAsset videoAsset) {
        C17542s.j(videoAsset, "videoAsset");
        return this.f124032n.get(videoAsset);
    }

    public final void H(C14681B b10) {
        C17542s.j(b10, "playbackState");
        if (C17542s.e(b10, C14681B.d.f128661a)) {
            this.f124031m.b().captureTutorialVideoVideoStart();
        } else if (C17542s.e(b10, C14681B.b.f128659a)) {
            this.f124031m.b().captureTutorialVideoVideoPause();
        } else if (C17542s.e(b10, C14681B.a.f128658a)) {
            this.f124031m.b().captureTutorialVideoVideoFinish();
            C14926f value = this.f124035q.getValue();
            if (value != null) {
                this.f124035q.setValue(C14926f.b(value, (TutorialStep) null, true, 1, (Object) null));
            }
        }
    }

    public final void I(TutorialStepEnum tutorialStepEnum) {
        C17542s.j(tutorialStepEnum, "stepEnum");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new c(tutorialStepEnum, this, (C17164e<? super c>) null), 3, (Object) null);
    }

    public final void J(TutorialStepEnum tutorialStepEnum) {
        C17542s.j(tutorialStepEnum, "stepEnum");
        TutorialStep step = tutorialStepEnum.getStep();
        if (step != null) {
            boolean z10 = this.f124038t >= tutorialStepEnum.getStepNum() || this.f124037s;
            int i10 = this.f124038t;
            int stepNum = tutorialStepEnum.getStepNum();
            boolean z11 = this.f124037s;
            Log.d(AnyKt.SUGARCUBE_TAG, "startTutorial progressNum=" + i10 + " stepNum=" + stepNum + " skipEnabled=" + z11 + " canSkip=" + z10);
            this.f124035q.setValue(new C14926f(step, z10));
        }
    }
}
