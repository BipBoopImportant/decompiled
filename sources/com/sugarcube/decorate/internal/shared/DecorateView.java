package com.sugarcube.decorate.internal.shared;

import RF.C13551d;
import XH.v;
import YE.C13868b;
import YE.e;
import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import com.sugarcube.common.R;
import com.sugarcube.decorate_engine.DecorateEngine;
import com.sugarcube.decorate_engine.DecorateEngineManifest;
import com.sugarcube.decorate_engine.DecorateEngineSetupInfo;
import com.sugarcube.decorate_engine.Metric;
import com.sugarcube.decorate_engine.SceneLayout;
import com.sugarcube.decorate_engine.WindowFitMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u00024\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJk\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&RD\u00100\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+ -*\u0016\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0018\u00010)j\u0004\u0018\u0001`,0)j\u0002`,0(8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R'\u00103\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)j\u0002`,018F¢\u0006\u0006\u001a\u0004\b.\u00102¨\u00065"}, d2 = {"Lcom/sugarcube/decorate/internal/shared/DecorateView;", "", "Landroid/content/Context;", "context", "Landroid/view/SurfaceView;", "surfaceView", "Lcom/sugarcube/decorate/internal/shared/DecorateView$EngineErrorListener;", "errorListener", "<init>", "(Landroid/content/Context;Landroid/view/SurfaceView;Lcom/sugarcube/decorate/internal/shared/DecorateView$EngineErrorListener;)V", "", "backgroundColor", "", "glbPath", "Lcom/sugarcube/decorate_engine/DecorateEngineManifest;", "manifest", "Lcom/sugarcube/decorate_engine/SceneLayout;", "sceneLayout", "", "isDynamicQualityEnabled", "isNewModelLoaderEnabled", "isNewSceneLoaderEnabled", "isNewCompositionLoaderEnabled", "isNewMultiViewTonemapEnabled", "isNewSingleViewTonemapEnabled", "initialView", "e", "(ILjava/lang/String;Lcom/sugarcube/decorate_engine/DecorateEngineManifest;Lcom/sugarcube/decorate_engine/SceneLayout;ZZZZZZI)Z", "LXH/N;", "f", "()V", "a", "Landroid/content/Context;", "b", "Lcom/sugarcube/decorate/internal/shared/DecorateView$EngineErrorListener;", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "c", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "()Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "engine", "Landroidx/lifecycle/K;", "LXH/v;", "Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;", "Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;", "Lcom/sugarcube/decorate/internal/shared/DecorateEngineState;", "kotlin.jvm.PlatformType", "d", "Landroidx/lifecycle/K;", "mutableEngineState", "Landroidx/lifecycle/F;", "()Landroidx/lifecycle/F;", "engineState", "EngineErrorListener", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DecorateView {

    /* renamed from: a  reason: collision with root package name */
    private final Context f126144a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final EngineErrorListener f126145b;

    /* renamed from: c  reason: collision with root package name */
    private final IDecorateEngine f126146c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final K<v<DecorateEngine.RunState, DecorateEngine.DrawState>> f126147d = new K<>(new v(DecorateEngine.RunState.New, DecorateEngine.DrawState.NoWindow));

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/decorate/internal/shared/DecorateView$EngineErrorListener;", "", "Lcom/sugarcube/decorate/internal/shared/DecorateView$a;", "engineError", "LXH/N;", "onError", "(Lcom/sugarcube/decorate/internal/shared/DecorateView$a;)V", "Lcom/sugarcube/decorate_engine/Metric;", "metric", "onMetric", "(Lcom/sugarcube/decorate_engine/Metric;)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface EngineErrorListener {
        void onError(a aVar);

        void onMetric(Metric metric);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/decorate/internal/shared/DecorateView$a;", "", "", "errorMessage", "", "isFatal", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f126148a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f126149b;

        public a() {
            this((String) null, false, 3, (DefaultConstructorMarker) null);
        }

        public final String a() {
            return this.f126148a;
        }

        public final boolean b() {
            return this.f126149b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f126148a, aVar.f126148a) && this.f126149b == aVar.f126149b;
        }

        public int hashCode() {
            String str = this.f126148a;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f126149b);
        }

        public String toString() {
            String str = this.f126148a;
            boolean z10 = this.f126149b;
            return "EngineError(errorMessage=" + str + ", isFatal=" + z10 + ")";
        }

        public a(String str, boolean z10) {
            this.f126148a = str;
            this.f126149b = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/sugarcube/decorate/internal/shared/DecorateView$b", "Lcom/sugarcube/decorate_engine/DecorateEngine$Logger;", "", "msg", "LXH/N;", "log", "(Ljava/lang/String;)V", "", "isFatal", "onError", "(Ljava/lang/String;Z)V", "Lcom/sugarcube/decorate_engine/Metric;", "metric", "onMetric", "(Lcom/sugarcube/decorate_engine/Metric;)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements DecorateEngine.Logger {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DecorateView f126150a;

        b(DecorateView decorateView) {
            this.f126150a = decorateView;
        }

        public void log(String str) {
            C17542s.j(str, "msg");
            C13868b.f118106a.b(str, e.DecorationEngine);
        }

        public void onError(String str, boolean z10) {
            C17542s.j(str, "msg");
            this.f126150a.f126145b.onError(new a(str, z10));
        }

        public void onMetric(Metric metric) {
            C17542s.j(metric, "metric");
            this.f126150a.f126145b.onMetric(metric);
            C13868b bVar = C13868b.f118106a;
            String name = metric.getName();
            double value = metric.getValue();
            String context = metric.getContext();
            bVar.b("metric: " + name + " value: " + value + " context: " + context, e.DecorationEngine);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/sugarcube/decorate/internal/shared/DecorateView$c", "Lcom/sugarcube/decorate_engine/DecorateEngine$StateListener;", "Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;", "runState", "Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;", "drawState", "LXH/N;", "onChange", "(Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements DecorateEngine.StateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DecorateView f126151a;

        c(DecorateView decorateView) {
            this.f126151a = decorateView;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.sugarcube.decorate_engine.DecorateEngine$DrawState} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChange(com.sugarcube.decorate_engine.DecorateEngine.RunState r3, com.sugarcube.decorate_engine.DecorateEngine.DrawState r4) {
            /*
                r2 = this;
                java.lang.String r0 = "runState"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                java.lang.String r0 = "drawState"
                kotlin.jvm.internal.C17542s.j(r4, r0)
                com.sugarcube.decorate.internal.shared.DecorateView r0 = r2.f126151a
                androidx.lifecycle.K r0 = r0.f126147d
                java.lang.Object r0 = r0.getValue()
                XH.v r0 = (XH.v) r0
                r1 = 0
                if (r0 == 0) goto L_0x0020
                java.lang.Object r0 = r0.c()
                com.sugarcube.decorate_engine.DecorateEngine$RunState r0 = (com.sugarcube.decorate_engine.DecorateEngine.RunState) r0
                goto L_0x0021
            L_0x0020:
                r0 = r1
            L_0x0021:
                if (r3 != r0) goto L_0x003a
                com.sugarcube.decorate.internal.shared.DecorateView r0 = r2.f126151a
                androidx.lifecycle.K r0 = r0.f126147d
                java.lang.Object r0 = r0.getValue()
                XH.v r0 = (XH.v) r0
                if (r0 == 0) goto L_0x0038
                java.lang.Object r0 = r0.d()
                r1 = r0
                com.sugarcube.decorate_engine.DecorateEngine$DrawState r1 = (com.sugarcube.decorate_engine.DecorateEngine.DrawState) r1
            L_0x0038:
                if (r4 == r1) goto L_0x0048
            L_0x003a:
                com.sugarcube.decorate.internal.shared.DecorateView r0 = r2.f126151a
                androidx.lifecycle.K r0 = r0.f126147d
                XH.v r1 = new XH.v
                r1.<init>(r3, r4)
                r0.postValue(r1)
            L_0x0048:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.internal.shared.DecorateView.c.onChange(com.sugarcube.decorate_engine.DecorateEngine$RunState, com.sugarcube.decorate_engine.DecorateEngine$DrawState):void");
        }
    }

    public DecorateView(Context context, SurfaceView surfaceView, EngineErrorListener engineErrorListener) {
        C17542s.j(context, "context");
        C17542s.j(surfaceView, "surfaceView");
        C17542s.j(engineErrorListener, "errorListener");
        this.f126144a = context;
        this.f126145b = engineErrorListener;
        C13551d dVar = new C13551d(new c(this), new b(this));
        this.f126146c = dVar;
        surfaceView.getHolder().addCallback(dVar.getSurfaceHolderCallback());
    }

    public final IDecorateEngine c() {
        return this.f126146c;
    }

    public final F<v<DecorateEngine.RunState, DecorateEngine.DrawState>> d() {
        return this.f126147d;
    }

    public final boolean e(int i10, String str, DecorateEngineManifest decorateEngineManifest, SceneLayout sceneLayout, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11) {
        Context context = this.f126144a;
        DecorateEngineSetupInfo decorateEngineSetupInfo = r1;
        DecorateEngineSetupInfo decorateEngineSetupInfo2 = new DecorateEngineSetupInfo(context, decorateEngineManifest, sceneLayout, i10, context.getColor(R.color.loading_placeholder), this.f126144a.getColor(R.color.selection_outline_color), this.f126144a.getColor(R.color.eraser_erasable_outline_color), this.f126144a.getColor(R.color.eraser_erased_outline_color), this.f126144a.getColor(R.color.stacking_surface_active), this.f126144a.getColor(R.color.stacking_surface_available), false, z10, z11, z12, z13, false, false, z14, z15, i11, i11 > 0, false, str, (Float) null, (Float) null, 0.0f, (String) null, true, WindowFitMode.LetterBox, 0.0f, 0.0f, false, false, false, 0, 0, -442400768, 15, (DefaultConstructorMarker) null);
        return this.f126146c.setupAndRun(decorateEngineSetupInfo);
    }

    public void f() {
        this.f126146c.teardown();
    }
}
