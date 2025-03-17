package com.sugarcube.decorate.v2.internal;

import RF.C13551d;
import RF.i;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16824o;
import XH.C16825p;
import XH.v;
import YE.C13868b;
import YE.e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.sugarcube.common.R;
import com.sugarcube.core.network.models.Manifest;
import com.sugarcube.decorate.internal.shared.IDecorateEngine;
import com.sugarcube.decorate_engine.DecorateEngine;
import com.sugarcube.decorate_engine.DecorateEngineManifest;
import com.sugarcube.decorate_engine.DecorateEngineSetupInfo;
import com.sugarcube.decorate_engine.Metric;
import com.sugarcube.decorate_engine.SceneLayout;
import com.sugarcube.decorate_engine.WindowFitMode;
import gG.C17264a;
import kG.C17497c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\u0004\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002NR\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002mIB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JU\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0015H\u0016¢\u0006\u0004\b8\u0010\u0017J\u0017\u0010:\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u00105J\u0017\u0010<\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u000bH\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u0019\u0010?\u001a\u00020>2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\b?\u0010CJ\u0019\u0010E\u001a\u00020\u00152\b\u0010D\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020AH\u0016¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001b\u0010\\\u001a\u00020'8BX\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010)R\u0017\u0010`\u001a\u00020]8\u0006¢\u0006\f\n\u0004\b\u001d\u0010^\u001a\u0004\bV\u0010_R*\u0010g\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020d0bj\u0002`e0a8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010fR-\u0010k\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020d0bj\u0002`e0h8\u0006¢\u0006\f\n\u0004\b\u001a\u0010i\u001a\u0004\bY\u0010jR\u0014\u0010D\u001a\u00020>8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010l¨\u0006n"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/view/SurfaceHolder;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "backgroundColor", "LkG/c;", "metadata", "", "isDynamicQualityEnabled", "isNewModelLoaderEnabled", "isNewSceneLoaderEnabled", "isNewCompositionLoaderEnabled", "isNewMultiViewTonemapEnabled", "isNewSingleViewTonemapEnabled", "initialView", "j", "(ILkG/c;ZZZZZZI)Z", "LXH/N;", "k", "()V", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$EngineErrorListener;", "listener", "i", "(Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$EngineErrorListener;)V", "Landroid/graphics/SurfaceTexture;", "g", "()Landroid/graphics/SurfaceTexture;", "surface", "width", "height", "onSurfaceTextureAvailable", "(Landroid/graphics/SurfaceTexture;II)V", "onSurfaceTextureSizeChanged", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "Landroid/view/SurfaceHolder$Callback;", "callback", "addCallback", "(Landroid/view/SurfaceHolder$Callback;)V", "removeCallback", "isCreating", "()Z", "type", "setType", "(I)V", "setFixedSize", "(II)V", "setSizeFromLayout", "format", "setFormat", "screenOn", "setKeepScreenOn", "(Z)V", "Landroid/graphics/Canvas;", "lockCanvas", "()Landroid/graphics/Canvas;", "Landroid/graphics/Rect;", "dirty", "(Landroid/graphics/Rect;)Landroid/graphics/Canvas;", "canvas", "unlockCanvasAndPost", "(Landroid/graphics/Canvas;)V", "getSurfaceFrame", "()Landroid/graphics/Rect;", "a", "Landroid/content/Context;", "b", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$EngineErrorListener;", "errorListener", "com/sugarcube/decorate/v2/internal/DecorateEngineController$c", "c", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$c;", "stateListener", "com/sugarcube/decorate/v2/internal/DecorateEngineController$b", "d", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$b;", "logger", "e", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "f", "LXH/o;", "h", "_surface", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "()Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "engine", "LTJ/B;", "LXH/v;", "Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;", "Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineState;", "LTJ/B;", "_engineState", "LTJ/P;", "LTJ/P;", "()LTJ/P;", "engineState", "Landroid/graphics/Canvas;", "EngineErrorListener", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DecorateEngineController implements TextureView.SurfaceTextureListener, SurfaceHolder {

    /* renamed from: a  reason: collision with root package name */
    private final Context f142286a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public EngineErrorListener f142287b;

    /* renamed from: c  reason: collision with root package name */
    private final c f142288c;

    /* renamed from: d  reason: collision with root package name */
    private final b f142289d;

    /* renamed from: e  reason: collision with root package name */
    private SurfaceTexture f142290e;

    /* renamed from: f  reason: collision with root package name */
    private final C16824o f142291f = C16825p.b(new C17264a(this));

    /* renamed from: g  reason: collision with root package name */
    private final IDecorateEngine f142292g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C16505B<v<DecorateEngine.RunState, DecorateEngine.DrawState>> f142293h;

    /* renamed from: i  reason: collision with root package name */
    private final C16519P<v<DecorateEngine.RunState, DecorateEngine.DrawState>> f142294i;

    /* renamed from: j  reason: collision with root package name */
    private final Canvas f142295j;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$EngineErrorListener;", "", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$a;", "engineError", "LXH/N;", "onError", "(Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$a;)V", "Lcom/sugarcube/decorate_engine/Metric;", "metric", "onMetric", "(Lcom/sugarcube/decorate_engine/Metric;)V", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface EngineErrorListener {
        void onError(a aVar);

        void onMetric(Metric metric);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$a;", "", "", "errorMessage", "", "isFatal", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f142296a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f142297b;

        public a() {
            this((String) null, false, 3, (DefaultConstructorMarker) null);
        }

        public final String a() {
            return this.f142296a;
        }

        public final boolean b() {
            return this.f142297b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f142296a, aVar.f142296a) && this.f142297b == aVar.f142297b;
        }

        public int hashCode() {
            String str = this.f142296a;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f142297b);
        }

        public String toString() {
            String str = this.f142296a;
            boolean z10 = this.f142297b;
            return "EngineError(errorMessage=" + str + ", isFatal=" + z10 + ")";
        }

        public a(String str, boolean z10) {
            this.f142296a = str;
            this.f142297b = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/sugarcube/decorate/v2/internal/DecorateEngineController$b", "Lcom/sugarcube/decorate_engine/DecorateEngine$Logger;", "", "msg", "LXH/N;", "log", "(Ljava/lang/String;)V", "", "isFatal", "onError", "(Ljava/lang/String;Z)V", "Lcom/sugarcube/decorate_engine/Metric;", "metric", "onMetric", "(Lcom/sugarcube/decorate_engine/Metric;)V", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements DecorateEngine.Logger {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DecorateEngineController f142298a;

        b(DecorateEngineController decorateEngineController) {
            this.f142298a = decorateEngineController;
        }

        public void log(String str) {
            C17542s.j(str, "msg");
            C13868b.f118106a.b(str, e.DecorationEngine);
        }

        public void onError(String str, boolean z10) {
            C17542s.j(str, "msg");
            EngineErrorListener c10 = this.f142298a.f142287b;
            if (c10 != null) {
                c10.onError(new a(str, z10));
            }
        }

        public void onMetric(Metric metric) {
            C17542s.j(metric, "metric");
            EngineErrorListener c10 = this.f142298a.f142287b;
            if (c10 != null) {
                c10.onMetric(metric);
            }
            C13868b bVar = C13868b.f118106a;
            String name = metric.getName();
            double value = metric.getValue();
            String context = metric.getContext();
            bVar.b("metric: " + name + " value: " + value + " context: " + context, e.DecorationEngine);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/sugarcube/decorate/v2/internal/DecorateEngineController$c", "Lcom/sugarcube/decorate_engine/DecorateEngine$StateListener;", "Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;", "runState", "Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;", "drawState", "LXH/N;", "onChange", "(Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;)V", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements DecorateEngine.StateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DecorateEngineController f142299a;

        c(DecorateEngineController decorateEngineController) {
            this.f142299a = decorateEngineController;
        }

        public void onChange(DecorateEngine.RunState runState, DecorateEngine.DrawState drawState) {
            C17542s.j(runState, "runState");
            C17542s.j(drawState, "drawState");
            if (runState != ((v) this.f142299a.f142293h.getValue()).c() || drawState != ((v) this.f142299a.f142293h.getValue()).d()) {
                this.f142299a.f142293h.setValue(new v(runState, drawState));
            }
        }
    }

    public DecorateEngineController(Context context) {
        C17542s.j(context, "context");
        this.f142286a = context;
        c cVar = new c(this);
        this.f142288c = cVar;
        b bVar = new b(this);
        this.f142289d = bVar;
        this.f142292g = new C13551d(cVar, bVar);
        C16505B<v<DecorateEngine.RunState, DecorateEngine.DrawState>> a10 = C16521S.a(new v(DecorateEngine.RunState.New, DecorateEngine.DrawState.NoWindow));
        this.f142293h = a10;
        this.f142294i = C16534i.c(a10);
        this.f142295j = new Canvas();
    }

    /* access modifiers changed from: private */
    public static final Surface b(DecorateEngineController decorateEngineController) {
        return new Surface(decorateEngineController.f142290e);
    }

    private final Surface h() {
        return (Surface) this.f142291f.getValue();
    }

    public void addCallback(SurfaceHolder.Callback callback) {
    }

    public final IDecorateEngine e() {
        return this.f142292g;
    }

    public final C16519P<v<DecorateEngine.RunState, DecorateEngine.DrawState>> f() {
        return this.f142294i;
    }

    public final SurfaceTexture g() {
        return this.f142290e;
    }

    public Surface getSurface() {
        return h();
    }

    public Rect getSurfaceFrame() {
        return new Rect();
    }

    public final void i(EngineErrorListener engineErrorListener) {
        C17542s.j(engineErrorListener, "listener");
        this.f142287b = engineErrorListener;
    }

    public boolean isCreating() {
        return false;
    }

    public final boolean j(int i10, C17497c cVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11) {
        C17542s.j(cVar, "metadata");
        Uri e10 = cVar.e();
        DecorateEngineManifest decorateEngineManifest = null;
        String uri = e10 != null ? e10.toString() : null;
        Manifest f10 = cVar.f();
        if (f10 != null) {
            decorateEngineManifest = i.z(f10);
        }
        DecorateEngineManifest decorateEngineManifest2 = decorateEngineManifest;
        SceneLayout h10 = cVar.h();
        Context context = this.f142286a;
        return this.f142292g.setupAndRun(new DecorateEngineSetupInfo(context, decorateEngineManifest2, h10, i10, context.getColor(R.color.loading_placeholder), this.f142286a.getColor(R.color.selection_outline_color), this.f142286a.getColor(R.color.eraser_erasable_outline_color), this.f142286a.getColor(R.color.eraser_erased_outline_color), this.f142286a.getColor(R.color.stacking_surface_active), this.f142286a.getColor(R.color.stacking_surface_available), false, z10, z11, z12, z13, false, false, z14, z15, i11, i11 > 0, false, uri, (Float) null, (Float) null, 0.0f, (String) null, true, WindowFitMode.LetterBox, 0.0f, 0.0f, false, false, false, 0, 0, -442400768, 15, (DefaultConstructorMarker) null));
    }

    public final void k() {
        this.f142292g.teardown();
        SurfaceTexture surfaceTexture = this.f142290e;
        if (surfaceTexture != null) {
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.f142290e = null;
            h().release();
        }
    }

    public Canvas lockCanvas() {
        return this.f142295j;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        C17542s.j(surfaceTexture, "surface");
        if (this.f142290e == null) {
            this.f142290e = surfaceTexture;
            this.f142292g.getSurfaceHolderCallback().surfaceCreated(this);
        }
        this.f142292g.getSurfaceHolderCallback().surfaceChanged(this, 1, i10, i11);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C17542s.j(surfaceTexture, "surface");
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        C17542s.j(surfaceTexture, "surface");
        this.f142292g.getSurfaceHolderCallback().surfaceChanged(this, 1, i10, i11);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C17542s.j(surfaceTexture, "surface");
    }

    public void removeCallback(SurfaceHolder.Callback callback) {
    }

    public void setFixedSize(int i10, int i11) {
    }

    public void setFormat(int i10) {
    }

    public void setKeepScreenOn(boolean z10) {
    }

    public void setSizeFromLayout() {
    }

    public void setType(int i10) {
    }

    public void unlockCanvasAndPost(Canvas canvas) {
    }

    public Canvas lockCanvas(Rect rect) {
        return this.f142295j;
    }
}
