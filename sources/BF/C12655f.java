package BF;

import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import KF.C13164r;
import QJ.C16304f;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YH.X;
import android.net.Uri;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import cF.C14041c;
import cF.C14046h;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.ShowroomRepository;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.analytics.Destination;
import com.sugarcube.app.base.data.analytics.EntryType;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.data.source.CompositionRepository;
import com.sugarcube.app.base.external.entrypoint.TrackEntryPointUseCase;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.core.network.models.Showroom;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.p;
import x4.O;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0018H@¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\"\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010'J'\u0010+\u001a\u00020\u00182\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020!H@¢\u0006\u0004\b-\u0010\u001cJ\u0010\u0010.\u001a\u00020!H@¢\u0006\u0004\b.\u0010\u001cJ\u0017\u0010/\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b/\u0010%J\u000f\u00100\u001a\u00020\u0018H\u0000¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001b\u0010 \u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\"\u0010L\u001a\u0010\u0012\f\u0012\n I*\u0004\u0018\u00010!0!0H8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020!0M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR \u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0H8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010KR&\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0M8\u0000X\u0004¢\u0006\f\n\u0004\bU\u0010O\u001a\u0004\bV\u0010Q¨\u0006X"}, d2 = {"LBF/f;", "Landroidx/lifecycle/f0;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "Lcom/sugarcube/app/base/data/ShowroomRepository;", "showroomRepository", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "compositionRepository", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "analytics", "LKF/r;", "uploadVersion", "Lcom/sugarcube/app/base/DeviceCompatibility;", "deviceCompatibility", "Landroidx/lifecycle/U;", "savedStateHandle", "Lcom/sugarcube/app/base/external/entrypoint/TrackEntryPointUseCase;", "trackEntryPointUseCase", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/app/base/data/SceneRepository;Lcom/sugarcube/app/base/data/ShowroomRepository;Lcom/sugarcube/app/base/data/source/CompositionRepository;Lcom/sugarcube/app/base/data/analytics/Analytics;LKF/r;Lcom/sugarcube/app/base/DeviceCompatibility;Landroidx/lifecycle/U;Lcom/sugarcube/app/base/external/entrypoint/TrackEntryPointUseCase;)V", "Lcom/sugarcube/app/base/data/analytics/Destination;", "destination", "LXH/N;", "b0", "(Lcom/sugarcube/app/base/data/analytics/Destination;)V", "Q", "(LdI/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "Lcom/sugarcube/app/base/navigation/Kreativ$Entry;", "args", "", "Y", "(Landroid/net/Uri;Lcom/sugarcube/app/base/navigation/Kreativ$Entry;)Z", "Z", "(Lcom/sugarcube/app/base/navigation/Kreativ$Entry;)Z", "a0", "()Z", "", "", "routes", "W", "(Ljava/util/List;Lcom/sugarcube/app/base/data/analytics/Destination;)V", "U", "c0", "X", "V", "()V", "m", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "n", "Lcom/sugarcube/app/base/data/SceneRepository;", "o", "Lcom/sugarcube/app/base/data/ShowroomRepository;", "p", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "q", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "r", "LKF/r;", "s", "Lcom/sugarcube/app/base/DeviceCompatibility;", "t", "Landroidx/lifecycle/U;", "u", "Lcom/sugarcube/app/base/external/entrypoint/TrackEntryPointUseCase;", "v", "LXH/o;", "R", "()Lcom/sugarcube/app/base/navigation/Kreativ$Entry;", "Landroidx/lifecycle/K;", "kotlin.jvm.PlatformType", "w", "Landroidx/lifecycle/K;", "_showLoading", "Landroidx/lifecycle/F;", "x", "Landroidx/lifecycle/F;", "T", "()Landroidx/lifecycle/F;", "showLoading", "y", "_navigateTo", "z", "S", "navigateTo", "sugarcube_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: BF.f  reason: case insensitive filesystem */
public final class C12655f extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final ConfigRepository f108057m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final SceneRepository f108058n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final ShowroomRepository f108059o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final CompositionRepository f108060p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Analytics f108061q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C13164r f108062r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final DeviceCompatibility f108063s;

    /* renamed from: t  reason: collision with root package name */
    private final U f108064t;

    /* renamed from: u  reason: collision with root package name */
    private final TrackEntryPointUseCase f108065u;

    /* renamed from: v  reason: collision with root package name */
    private final C16824o f108066v = C16825p.b(new C12654e(this));
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final K<Boolean> f108067w;

    /* renamed from: x  reason: collision with root package name */
    private final F<Boolean> f108068x;

    /* renamed from: y  reason: collision with root package name */
    private final K<List<Object>> f108069y;

    /* renamed from: z  reason: collision with root package name */
    private final F<List<Object>> f108070z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.entry.KreativEntryViewModel$1", f = "KreativEntryFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: BF.f$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108071c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12655f f108072d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C12655f fVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f108072d = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f108072d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f108071c == 0) {
                y.b(obj);
                this.f108072d.f108067w.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.app.base.ui.gallery.entry.KreativEntryViewModel", f = "KreativEntryFragment.kt", l = {308}, m = "fetchData")
    /* renamed from: BF.f$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f108073c;

        /* renamed from: d  reason: collision with root package name */
        Object f108074d;

        /* renamed from: e  reason: collision with root package name */
        Object f108075e;

        /* renamed from: f  reason: collision with root package name */
        int f108076f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f108077g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C12655f f108078h;

        /* renamed from: i  reason: collision with root package name */
        int f108079i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12655f fVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f108078h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f108077g = obj;
            this.f108079i |= Integer.MIN_VALUE;
            return this.f108078h.Q(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.entry.KreativEntryViewModel$fetchData$2", f = "KreativEntryFragment.kt", l = {321}, m = "invokeSuspend")
    /* renamed from: BF.f$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f108080c;

        /* renamed from: d  reason: collision with root package name */
        int f108081d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f108082e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12655f f108083f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.gallery.entry.KreativEntryViewModel$fetchData$2$1", f = "KreativEntryFragment.kt", l = {310}, m = "invokeSuspend")
        /* renamed from: BF.f$c$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f108084c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C12655f f108085d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C12655f fVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f108085d = fVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f108085d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f108084c;
                if (i10 == 0) {
                    y.b(obj);
                    CompositionRepository C10 = this.f108085d.f108060p;
                    this.f108084c = 1;
                    if (C10.refreshCache(this) == f10) {
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
        @f(c = "com.sugarcube.app.base.ui.gallery.entry.KreativEntryViewModel$fetchData$2$2", f = "KreativEntryFragment.kt", l = {311}, m = "invokeSuspend")
        /* renamed from: BF.f$c$b */
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f108086c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C12655f f108087d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C12655f fVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f108087d = fVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f108087d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f108086c;
                if (i10 == 0) {
                    y.b(obj);
                    C16532g<List<Showroom>> showrooms = this.f108087d.f108059o.getShowrooms();
                    this.f108086c = 1;
                    if (C16534i.i(showrooms, this) == f10) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/sugarcube/app/base/DeviceCompatibility$a;", "<anonymous>", "(LQJ/Q;)Lcom/sugarcube/app/base/DeviceCompatibility$a;"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.gallery.entry.KreativEntryViewModel$fetchData$2$3", f = "KreativEntryFragment.kt", l = {312}, m = "invokeSuspend")
        /* renamed from: BF.f$c$c  reason: collision with other inner class name */
        static final class C2579c extends l implements p<Q, C17164e<? super DeviceCompatibility.a>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f108088c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C12655f f108089d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2579c(C12655f fVar, C17164e<? super C2579c> eVar) {
                super(2, eVar);
                this.f108089d = fVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2579c(this.f108089d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super DeviceCompatibility.a> eVar) {
                return ((C2579c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f108088c;
                if (i10 == 0) {
                    y.b(obj);
                    DeviceCompatibility D10 = this.f108089d.f108063s;
                    this.f108088c = 1;
                    obj = D10.updateCompatibility(this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.gallery.entry.KreativEntryViewModel$fetchData$2$4", f = "KreativEntryFragment.kt", l = {315}, m = "invokeSuspend")
        /* renamed from: BF.f$c$d */
        static final class d extends l implements p<Q, C17164e<? super Boolean>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f108090c;

            /* renamed from: d  reason: collision with root package name */
            int f108091d;

            /* renamed from: e  reason: collision with root package name */
            int f108092e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C12655f f108093f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(C12655f fVar, C17164e<? super d> eVar) {
                super(2, eVar);
                this.f108093f = fVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new d(this.f108093f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
                return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f108092e;
                if (i10 == 0) {
                    y.b(obj);
                    SceneRepository E10 = this.f108093f.f108058n;
                    C15906b.a aVar = C15906b.f135496b;
                    C15906b v10 = C15906b.v(C15908d.s(5, C15909e.MINUTES));
                    C13164r G10 = this.f108093f.f108062r;
                    this.f108090c = aVar;
                    this.f108091d = 5;
                    this.f108092e = 1;
                    obj = SceneRepository.m25startRefreshhhJSO8g$default(E10, false, v10, G10, this, 1, (Object) null);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    C15906b.a aVar2 = (C15906b.a) this.f108090c;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return kotlin.coroutines.jvm.internal.b.a(((SceneRepository.SceneRepoStatus) obj).getHasScenes());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C12655f fVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f108083f = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f108083f, eVar);
            cVar.f108082e = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108081d;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f108082e;
                ArrayList arrayList = new ArrayList();
                arrayList.add(C16314k.b(q10, (C17168i) null, (T) null, new a(this.f108083f, (C17164e<? super a>) null), 3, (Object) null));
                arrayList.add(C16314k.b(q10, (C17168i) null, (T) null, new b(this.f108083f, (C17164e<? super b>) null), 3, (Object) null));
                arrayList.add(C16314k.b(q10, (C17168i) null, (T) null, new C2579c(this.f108083f, (C17164e<? super C2579c>) null), 3, (Object) null));
                arrayList.add(C16314k.b(q10, (C17168i) null, (T) null, new d(this.f108083f, (C17164e<? super d>) null), 3, (Object) null));
                this.f108082e = q10;
                this.f108080c = arrayList;
                this.f108081d = 1;
                if (C16304f.c(arrayList, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                List list = (List) this.f108080c;
                Q q11 = (Q) this.f108082e;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.entry.KreativEntryViewModel$launch$1", f = "KreativEntryFragment.kt", l = {190, 195}, m = "invokeSuspend")
    /* renamed from: BF.f$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f108094c;

        /* renamed from: d  reason: collision with root package name */
        int f108095d;

        /* renamed from: e  reason: collision with root package name */
        int f108096e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f108097f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12655f f108098g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Uri f108099h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.gallery.entry.KreativEntryViewModel$launch$1$1", f = "KreativEntryFragment.kt", l = {197, 293}, m = "invokeSuspend")
        /* renamed from: BF.f$d$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f108100c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C12655f f108101d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Uri f108102e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C12655f fVar, Uri uri, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f108101d = fVar;
                this.f108102e = uri;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f108101d, this.f108102e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: type inference failed for: r1v11, types: [androidx.lifecycle.F, androidx.lifecycle.K] */
            /* JADX WARNING: type inference failed for: r1v19, types: [androidx.lifecycle.F, androidx.lifecycle.K] */
            /* JADX WARNING: Removed duplicated region for block: B:69:0x01ad  */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x01ef  */
            /* JADX WARNING: Removed duplicated region for block: B:81:0x0296  */
            /* JADX WARNING: Removed duplicated region for block: B:82:0x02a7  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r13.f108100c
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L_0x0020
                    if (r1 == r3) goto L_0x001c
                    if (r1 != r2) goto L_0x0014
                    XH.y.b(r14)
                    goto L_0x028e
                L_0x0014:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L_0x001c:
                    XH.y.b(r14)
                    goto L_0x002e
                L_0x0020:
                    XH.y.b(r14)
                    BF.f r14 = r13.f108101d
                    r13.f108100c = r3
                    java.lang.Object r14 = r14.U(r13)
                    if (r14 != r0) goto L_0x002e
                    return r0
                L_0x002e:
                    java.lang.Boolean r14 = (java.lang.Boolean) r14
                    boolean r14 = r14.booleanValue()
                    if (r14 == 0) goto L_0x0043
                    BF.f r14 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$e r0 = com.sugarcube.app.base.navigation.Kreativ.e.INSTANCE
                    java.util.List r0 = YH.C16877v.e(r0)
                    r14.W(r0, r4)
                    goto L_0x02b4
                L_0x0043:
                    BF.f r14 = r13.f108101d
                    android.net.Uri r1 = r13.f108102e
                    com.sugarcube.app.base.navigation.Kreativ$Entry r5 = r14.R()
                    boolean r14 = r14.Y(r1, r5)
                    if (r14 == 0) goto L_0x0090
                    com.sugarcube.app.base.ui.gallery.h$c r14 = com.sugarcube.app.base.ui.gallery.h.c.f124419e
                    com.sugarcube.app.base.ui.gallery.a.b(r14)
                    BF.f r0 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Gallery$Home r1 = new com.sugarcube.app.base.navigation.Kreativ$Gallery$Home
                    java.lang.String r14 = r14.b()
                    r1.<init>(r14)
                    java.lang.Object[] r14 = new java.lang.Object[]{r1}
                    java.util.List r14 = YH.C16877v.t(r14)
                    BF.f r1 = r13.f108101d
                    com.sugarcube.app.base.DeviceCompatibility r1 = r1.f108063s
                    boolean r1 = r1.isCaptureEnabled()
                    if (r1 == 0) goto L_0x007a
                    com.sugarcube.app.base.navigation.Kreativ$Capture r1 = com.sugarcube.app.base.navigation.Kreativ.Capture.INSTANCE
                    r14.add(r1)
                L_0x007a:
                    BF.f r1 = r13.f108101d
                    com.sugarcube.app.base.DeviceCompatibility r1 = r1.f108063s
                    boolean r1 = r1.isCaptureEnabled()
                    if (r1 == 0) goto L_0x0089
                    com.sugarcube.app.base.data.analytics.Destination$Capture r1 = com.sugarcube.app.base.data.analytics.Destination.Capture.INSTANCE
                    goto L_0x008b
                L_0x0089:
                    com.sugarcube.app.base.data.analytics.Destination$MyScans r1 = com.sugarcube.app.base.data.analytics.Destination.MyScans.INSTANCE
                L_0x008b:
                    r0.W(r14, r1)
                    goto L_0x02b4
                L_0x0090:
                    BF.f r14 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Entry r1 = r14.R()
                    boolean r14 = r14.Z(r1)
                    if (r14 == 0) goto L_0x00db
                    com.sugarcube.app.base.ui.gallery.h$b r14 = com.sugarcube.app.base.ui.gallery.h.b.f124418e
                    com.sugarcube.app.base.ui.gallery.a.b(r14)
                    com.sugarcube.app.base.navigation.Kreativ$Gallery$Home r0 = new com.sugarcube.app.base.navigation.Kreativ$Gallery$Home
                    java.lang.String r14 = r14.b()
                    r0.<init>(r14)
                    com.sugarcube.app.base.navigation.Kreativ$Gallery$OverflowSheet r14 = new com.sugarcube.app.base.navigation.Kreativ$Gallery$OverflowSheet
                    BF.f r1 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Entry r1 = r1.R()
                    java.lang.String r1 = r1.f()
                    r14.<init>(r1, r3)
                    java.lang.Object[] r14 = new java.lang.Object[]{r0, r14}
                    java.util.List r14 = YH.C16877v.t(r14)
                    BF.f r0 = r13.f108101d
                    com.sugarcube.app.base.data.analytics.Destination$SharedDesign r1 = new com.sugarcube.app.base.data.analytics.Destination$SharedDesign
                    BF.f r2 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Entry r2 = r2.R()
                    java.lang.String r2 = r2.f()
                    if (r2 != 0) goto L_0x00d3
                    java.lang.String r2 = ""
                L_0x00d3:
                    r1.<init>(r2)
                    r0.W(r14, r1)
                    goto L_0x02b4
                L_0x00db:
                    BF.f r14 = r13.f108101d
                    boolean r14 = r14.a0()
                    if (r14 == 0) goto L_0x00f0
                    BF.f r14 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$a r0 = com.sugarcube.app.base.navigation.Kreativ.a.INSTANCE
                    java.util.List r0 = YH.C16877v.e(r0)
                    r14.W(r0, r4)
                    goto L_0x02b4
                L_0x00f0:
                    BF.f r14 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Entry r1 = r14.R()
                    boolean r14 = r14.X(r1)
                    if (r14 == 0) goto L_0x0283
                    BF.f r14 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Entry r14 = r14.R()
                    java.lang.String r14 = r14.a()
                    java.util.UUID r14 = cF.C14046h.e(r14)
                    BF.f r0 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Entry r0 = r0.R()
                    java.lang.String r0 = r0.e()
                    java.util.UUID r0 = cF.C14046h.e(r0)
                    BF.f r1 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Entry r1 = r1.R()
                    java.lang.String r1 = r1.c()
                    if (r1 == 0) goto L_0x012c
                    int r1 = r1.length()
                    if (r1 != 0) goto L_0x012b
                    goto L_0x012c
                L_0x012b:
                    r3 = 0
                L_0x012c:
                    BF.f r1 = r13.f108101d
                    com.sugarcube.app.base.data.SceneRepository r1 = r1.f108058n
                    androidx.lifecycle.K r1 = r1.getShowrooms()
                    java.lang.Object r1 = r1.getValue()
                    java.util.List r1 = (java.util.List) r1
                    if (r1 == 0) goto L_0x0165
                    r2 = r1
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.Iterator r2 = r2.iterator()
                L_0x0145:
                    boolean r5 = r2.hasNext()
                    if (r5 == 0) goto L_0x015d
                    java.lang.Object r5 = r2.next()
                    r6 = r5
                    com.sugarcube.core.network.models.Showroom r6 = (com.sugarcube.core.network.models.Showroom) r6
                    java.util.UUID r6 = r6.getSceneUuid()
                    boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r0)
                    if (r6 == 0) goto L_0x0145
                    goto L_0x015e
                L_0x015d:
                    r5 = r4
                L_0x015e:
                    com.sugarcube.core.network.models.Showroom r5 = (com.sugarcube.core.network.models.Showroom) r5
                    if (r5 != 0) goto L_0x0163
                    goto L_0x0165
                L_0x0163:
                    r4 = r5
                    goto L_0x01ab
                L_0x0165:
                    if (r1 == 0) goto L_0x0189
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.Iterator r1 = r1.iterator()
                L_0x016d:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0185
                    java.lang.Object r2 = r1.next()
                    r5 = r2
                    com.sugarcube.core.network.models.Showroom r5 = (com.sugarcube.core.network.models.Showroom) r5
                    java.util.UUID r5 = r5.getCompositionUuid()
                    boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r14)
                    if (r5 == 0) goto L_0x016d
                    goto L_0x0186
                L_0x0185:
                    r2 = r4
                L_0x0186:
                    com.sugarcube.core.network.models.Showroom r2 = (com.sugarcube.core.network.models.Showroom) r2
                    goto L_0x018a
                L_0x0189:
                    r2 = r4
                L_0x018a:
                    if (r2 != 0) goto L_0x01aa
                    BF.f r1 = r13.f108101d
                    com.sugarcube.app.base.data.SceneRepository r1 = r1.f108058n
                    androidx.lifecycle.K r1 = r1.getShowrooms()
                    java.lang.Object r1 = r1.getValue()
                    java.util.List r1 = (java.util.List) r1
                    if (r1 == 0) goto L_0x01a5
                    java.lang.Object r1 = YH.C16877v.y0(r1)
                    com.sugarcube.core.network.models.Showroom r1 = (com.sugarcube.core.network.models.Showroom) r1
                    goto L_0x01a6
                L_0x01a5:
                    r1 = r4
                L_0x01a6:
                    if (r3 != 0) goto L_0x01ab
                    r4 = r1
                    goto L_0x01ab
                L_0x01aa:
                    r4 = r2
                L_0x01ab:
                    if (r4 == 0) goto L_0x01ef
                    com.sugarcube.app.base.ui.gallery.h$d r14 = com.sugarcube.app.base.ui.gallery.h.d.f124420e
                    com.sugarcube.app.base.ui.gallery.a.b(r14)
                    BF.f r0 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Gallery$Home r1 = new com.sugarcube.app.base.navigation.Kreativ$Gallery$Home
                    java.lang.String r14 = r14.b()
                    r1.<init>(r14)
                    com.sugarcube.app.base.navigation.Kreativ$Decorate r14 = new com.sugarcube.app.base.navigation.Kreativ$Decorate
                    java.lang.String r6 = r4.getScene()
                    java.lang.String r7 = r4.getComposition()
                    BF.f r2 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Entry r2 = r2.R()
                    java.lang.String r10 = r2.c()
                    r11 = 4
                    r12 = 0
                    r8 = 0
                    r9 = 1
                    r5 = r14
                    r5.<init>((java.lang.String) r6, (java.lang.String) r7, (int) r8, (boolean) r9, (java.lang.String) r10, (int) r11, (kotlin.jvm.internal.DefaultConstructorMarker) r12)
                    java.lang.Object[] r14 = new java.lang.Object[]{r1, r14}
                    java.util.List r14 = YH.C16877v.q(r14)
                    com.sugarcube.app.base.data.analytics.Destination$DesignComposition r1 = new com.sugarcube.app.base.data.analytics.Destination$DesignComposition
                    java.lang.String r2 = r4.getComposition()
                    r1.<init>(r2)
                    r0.W(r14, r1)
                    goto L_0x02b4
                L_0x01ef:
                    java.lang.String r1 = "toString(...)"
                    if (r0 == 0) goto L_0x023d
                    if (r14 == 0) goto L_0x023d
                    com.sugarcube.app.base.ui.gallery.h$b r2 = com.sugarcube.app.base.ui.gallery.h.b.f124418e
                    com.sugarcube.app.base.ui.gallery.a.b(r2)
                    BF.f r3 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Gallery$Home r4 = new com.sugarcube.app.base.navigation.Kreativ$Gallery$Home
                    java.lang.String r2 = r2.b()
                    r4.<init>(r2)
                    com.sugarcube.app.base.navigation.Kreativ$Decorate r2 = new com.sugarcube.app.base.navigation.Kreativ$Decorate
                    java.lang.String r6 = r0.toString()
                    kotlin.jvm.internal.C17542s.i(r6, r1)
                    java.lang.String r7 = r14.toString()
                    BF.f r0 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Entry r0 = r0.R()
                    java.lang.String r10 = r0.c()
                    r11 = 4
                    r12 = 0
                    r8 = 0
                    r9 = 0
                    r5 = r2
                    r5.<init>((java.lang.String) r6, (java.lang.String) r7, (int) r8, (boolean) r9, (java.lang.String) r10, (int) r11, (kotlin.jvm.internal.DefaultConstructorMarker) r12)
                    java.lang.Object[] r0 = new java.lang.Object[]{r4, r2}
                    java.util.List r0 = YH.C16877v.q(r0)
                    com.sugarcube.app.base.data.analytics.Destination$DesignComposition r2 = new com.sugarcube.app.base.data.analytics.Destination$DesignComposition
                    java.lang.String r14 = r14.toString()
                    kotlin.jvm.internal.C17542s.i(r14, r1)
                    r2.<init>(r14)
                    r3.W(r0, r2)
                    goto L_0x02b4
                L_0x023d:
                    if (r0 == 0) goto L_0x02b4
                    com.sugarcube.app.base.ui.gallery.h$b r14 = com.sugarcube.app.base.ui.gallery.h.b.f124418e
                    com.sugarcube.app.base.ui.gallery.a.b(r14)
                    BF.f r2 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Gallery$Home r3 = new com.sugarcube.app.base.navigation.Kreativ$Gallery$Home
                    java.lang.String r14 = r14.b()
                    r3.<init>(r14)
                    com.sugarcube.app.base.navigation.Kreativ$Decorate r14 = new com.sugarcube.app.base.navigation.Kreativ$Decorate
                    java.lang.String r5 = r0.toString()
                    kotlin.jvm.internal.C17542s.i(r5, r1)
                    BF.f r4 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Entry r4 = r4.R()
                    java.lang.String r9 = r4.c()
                    r10 = 4
                    r11 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r4 = r14
                    r4.<init>((java.lang.String) r5, (java.lang.String) r6, (int) r7, (boolean) r8, (java.lang.String) r9, (int) r10, (kotlin.jvm.internal.DefaultConstructorMarker) r11)
                    java.lang.Object[] r14 = new java.lang.Object[]{r3, r14}
                    java.util.List r14 = YH.C16877v.q(r14)
                    com.sugarcube.app.base.data.analytics.Destination$DesignScene r3 = new com.sugarcube.app.base.data.analytics.Destination$DesignScene
                    java.lang.String r0 = r0.toString()
                    kotlin.jvm.internal.C17542s.i(r0, r1)
                    r3.<init>(r0)
                    r2.W(r14, r3)
                    goto L_0x02b4
                L_0x0283:
                    BF.f r14 = r13.f108101d
                    r13.f108100c = r2
                    java.lang.Object r14 = r14.c0(r13)
                    if (r14 != r0) goto L_0x028e
                    return r0
                L_0x028e:
                    java.lang.Boolean r14 = (java.lang.Boolean) r14
                    boolean r14 = r14.booleanValue()
                    if (r14 == 0) goto L_0x02a7
                    BF.f r14 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$Gallery$Home r0 = new com.sugarcube.app.base.navigation.Kreativ$Gallery$Home
                    r0.<init>((java.lang.String) r4, (int) r3, (kotlin.jvm.internal.DefaultConstructorMarker) r4)
                    java.util.List r0 = YH.C16877v.e(r0)
                    com.sugarcube.app.base.data.analytics.Destination$KreativHome r1 = com.sugarcube.app.base.data.analytics.Destination.KreativHome.INSTANCE
                    r14.W(r0, r1)
                    goto L_0x02b4
                L_0x02a7:
                    BF.f r14 = r13.f108101d
                    com.sugarcube.app.base.navigation.Kreativ$c r0 = com.sugarcube.app.base.navigation.Kreativ.c.INSTANCE
                    java.util.List r0 = YH.C16877v.e(r0)
                    com.sugarcube.app.base.data.analytics.Destination$KreativHome r1 = com.sugarcube.app.base.data.analytics.Destination.KreativHome.INSTANCE
                    r14.W(r0, r1)
                L_0x02b4:
                    XH.N r14 = XH.C16807N.f139792a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: BF.C12655f.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C12655f fVar, Uri uri, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f108098g = fVar;
            this.f108099h = uri;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f108098g, this.f108099h, eVar);
            dVar.f108097f = obj;
            return dVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
            if (BF.C12655f.K(r13, BF.C12655f.k(r13)) != false) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f108096e
                r2 = 5
                java.lang.String r3 = ""
                r4 = 1
                r5 = 2
                r6 = 0
                if (r1 == 0) goto L_0x0036
                if (r1 == r4) goto L_0x002a
                if (r1 != r5) goto L_0x0022
                java.lang.Object r0 = r12.f108094c
                IJ.b$a r0 = (IJ.C15906b.a) r0
                java.lang.Object r0 = r12.f108097f
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r13)     // Catch:{ k1 -> 0x001f }
                goto L_0x01e4
            L_0x001f:
                r13 = move-exception
                goto L_0x009b
            L_0x0022:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x002a:
                java.lang.Object r1 = r12.f108094c
                android.net.Uri r1 = (android.net.Uri) r1
                java.lang.Object r1 = r12.f108097f
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r13)
                goto L_0x0079
            L_0x0036:
                XH.y.b(r13)
                java.lang.Object r13 = r12.f108097f
                r1 = r13
                QJ.Q r1 = (QJ.Q) r1
                BF.f r13 = r12.f108098g
                com.sugarcube.app.base.data.analytics.Analytics r13 = r13.f108061q
                android.net.Uri r7 = r12.f108099h
                if (r7 == 0) goto L_0x004e
                java.lang.String r8 = r7.toString()
                if (r8 != 0) goto L_0x004f
            L_0x004e:
                r8 = r3
            L_0x004f:
                r13.galleryDeeplink(r8)
                BF.f r13 = r12.f108098g
                com.sugarcube.app.base.navigation.Kreativ$Entry r8 = r13.R()
                boolean r13 = r13.Z(r8)
                if (r13 != 0) goto L_0x006a
                BF.f r13 = r12.f108098g
                com.sugarcube.app.base.navigation.Kreativ$Entry r8 = r13.R()
                boolean r13 = r13.X(r8)
                if (r13 == 0) goto L_0x0079
            L_0x006a:
                BF.f r13 = r12.f108098g
                r12.f108097f = r1
                r12.f108094c = r7
                r12.f108096e = r4
                java.lang.Object r13 = r13.Q(r12)
                if (r13 != r0) goto L_0x0079
                return r0
            L_0x0079:
                IJ.b$a r13 = IJ.C15906b.f135496b     // Catch:{ k1 -> 0x0099 }
                IJ.e r7 = IJ.C15909e.SECONDS     // Catch:{ k1 -> 0x0099 }
                long r7 = IJ.C15908d.s(r2, r7)     // Catch:{ k1 -> 0x0099 }
                BF.f$d$a r9 = new BF.f$d$a     // Catch:{ k1 -> 0x0099 }
                BF.f r10 = r12.f108098g     // Catch:{ k1 -> 0x0099 }
                android.net.Uri r11 = r12.f108099h     // Catch:{ k1 -> 0x0099 }
                r9.<init>(r10, r11, r6)     // Catch:{ k1 -> 0x0099 }
                r12.f108097f = r1     // Catch:{ k1 -> 0x0099 }
                r12.f108094c = r13     // Catch:{ k1 -> 0x0099 }
                r12.f108095d = r2     // Catch:{ k1 -> 0x0099 }
                r12.f108096e = r5     // Catch:{ k1 -> 0x0099 }
                java.lang.Object r13 = QJ.m1.d(r7, r9, r12)     // Catch:{ k1 -> 0x0099 }
                if (r13 != r0) goto L_0x01e4
                return r0
            L_0x0099:
                r13 = move-exception
                r0 = r1
            L_0x009b:
                com.sugarcube.core.logger.Priority r1 = com.sugarcube.core.logger.Priority.WARN
                java.lang.String r13 = XH.C16816g.b(r13)
                if (r13 != 0) goto L_0x00a4
                goto L_0x00a5
            L_0x00a4:
                r3 = r13
            L_0x00a5:
                int[] r13 = BF.C12657h.f108111a
                int r1 = r1.ordinal()
                r13 = r13[r1]
                java.lang.String r1 = " "
                java.lang.String r7 = "Kt"
                r8 = 46
                r9 = 36
                java.lang.String r10 = "Timeout - navigating to landing"
                if (r13 == r4) goto L_0x019b
                if (r13 == r5) goto L_0x0167
                r4 = 3
                if (r13 == r4) goto L_0x0133
                r4 = 4
                if (r13 == r4) goto L_0x00fe
                if (r13 != r2) goto L_0x00f8
                java.lang.Class r13 = r0.getClass()
                java.lang.String r13 = r13.getName()
                kotlin.jvm.internal.C17542s.g(r13)
                java.lang.String r0 = HJ.C15854t.s1(r13, r9, r6, r5, r6)
                java.lang.String r0 = HJ.C15854t.o1(r0, r8, r6, r5, r6)
                int r2 = r0.length()
                if (r2 != 0) goto L_0x00dd
                goto L_0x00e1
            L_0x00dd:
                java.lang.String r13 = HJ.C15854t.P0(r0, r7)
            L_0x00e1:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r10)
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                android.util.Log.e(r13, r0)
                goto L_0x01ce
            L_0x00f8:
                XH.t r13 = new XH.t
                r13.<init>()
                throw r13
            L_0x00fe:
                java.lang.Class r13 = r0.getClass()
                java.lang.String r13 = r13.getName()
                kotlin.jvm.internal.C17542s.g(r13)
                java.lang.String r0 = HJ.C15854t.s1(r13, r9, r6, r5, r6)
                java.lang.String r0 = HJ.C15854t.o1(r0, r8, r6, r5, r6)
                int r2 = r0.length()
                if (r2 != 0) goto L_0x0118
                goto L_0x011c
            L_0x0118:
                java.lang.String r13 = HJ.C15854t.P0(r0, r7)
            L_0x011c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r10)
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                android.util.Log.w(r13, r0)
                goto L_0x01ce
            L_0x0133:
                java.lang.Class r13 = r0.getClass()
                java.lang.String r13 = r13.getName()
                kotlin.jvm.internal.C17542s.g(r13)
                java.lang.String r0 = HJ.C15854t.s1(r13, r9, r6, r5, r6)
                java.lang.String r0 = HJ.C15854t.o1(r0, r8, r6, r5, r6)
                int r2 = r0.length()
                if (r2 != 0) goto L_0x014d
                goto L_0x0151
            L_0x014d:
                java.lang.String r13 = HJ.C15854t.P0(r0, r7)
            L_0x0151:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r10)
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                android.util.Log.i(r13, r0)
                goto L_0x01ce
            L_0x0167:
                java.lang.Class r13 = r0.getClass()
                java.lang.String r13 = r13.getName()
                kotlin.jvm.internal.C17542s.g(r13)
                java.lang.String r0 = HJ.C15854t.s1(r13, r9, r6, r5, r6)
                java.lang.String r0 = HJ.C15854t.o1(r0, r8, r6, r5, r6)
                int r2 = r0.length()
                if (r2 != 0) goto L_0x0181
                goto L_0x0185
            L_0x0181:
                java.lang.String r13 = HJ.C15854t.P0(r0, r7)
            L_0x0185:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r10)
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r13, r0)
                goto L_0x01ce
            L_0x019b:
                java.lang.Class r13 = r0.getClass()
                java.lang.String r13 = r13.getName()
                kotlin.jvm.internal.C17542s.g(r13)
                java.lang.String r0 = HJ.C15854t.s1(r13, r9, r6, r5, r6)
                java.lang.String r0 = HJ.C15854t.o1(r0, r8, r6, r5, r6)
                int r2 = r0.length()
                if (r2 != 0) goto L_0x01b5
                goto L_0x01b9
            L_0x01b5:
                java.lang.String r13 = HJ.C15854t.P0(r0, r7)
            L_0x01b9:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r10)
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                android.util.Log.v(r13, r0)
            L_0x01ce:
                BF.f r13 = r12.f108098g
                com.sugarcube.app.base.data.analytics.Analytics r13 = r13.f108061q
                r13.galleryEntryTimeout()
                BF.f r13 = r12.f108098g
                com.sugarcube.app.base.navigation.Kreativ$c r0 = com.sugarcube.app.base.navigation.Kreativ.c.INSTANCE
                java.util.List r0 = YH.C16877v.e(r0)
                com.sugarcube.app.base.data.analytics.Destination$KreativHome r1 = com.sugarcube.app.base.data.analytics.Destination.KreativHome.INSTANCE
                r13.W(r0, r1)
            L_0x01e4:
                XH.N r13 = XH.C16807N.f139792a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: BF.C12655f.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.app.base.ui.gallery.entry.KreativEntryViewModel", f = "KreativEntryFragment.kt", l = {347, 348, 349}, m = "userHasHistory")
    /* renamed from: BF.f$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f108103c;

        /* renamed from: d  reason: collision with root package name */
        Object f108104d;

        /* renamed from: e  reason: collision with root package name */
        Object f108105e;

        /* renamed from: f  reason: collision with root package name */
        int f108106f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f108107g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C12655f f108108h;

        /* renamed from: i  reason: collision with root package name */
        int f108109i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C12655f fVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f108108h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f108107g = obj;
            this.f108109i |= Integer.MIN_VALUE;
            return this.f108108h.c0(this);
        }
    }

    public C12655f(ConfigRepository configRepository, SceneRepository sceneRepository, ShowroomRepository showroomRepository, CompositionRepository compositionRepository, Analytics analytics, C13164r rVar, DeviceCompatibility deviceCompatibility, U u10, TrackEntryPointUseCase trackEntryPointUseCase) {
        C17542s.j(configRepository, "configRepository");
        C17542s.j(sceneRepository, "sceneRepository");
        C17542s.j(showroomRepository, "showroomRepository");
        C17542s.j(compositionRepository, "compositionRepository");
        C17542s.j(analytics, "analytics");
        C17542s.j(rVar, "uploadVersion");
        C17542s.j(deviceCompatibility, "deviceCompatibility");
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(trackEntryPointUseCase, "trackEntryPointUseCase");
        this.f108057m = configRepository;
        this.f108058n = sceneRepository;
        this.f108059o = showroomRepository;
        this.f108060p = compositionRepository;
        this.f108061q = analytics;
        this.f108062r = rVar;
        this.f108063s = deviceCompatibility;
        this.f108064t = u10;
        this.f108065u = trackEntryPointUseCase;
        K<Boolean> k10 = new K<>(Boolean.FALSE);
        this.f108067w = k10;
        this.f108068x = k10;
        K<List<Object>> k11 = new K<>();
        this.f108069y = k11;
        this.f108070z = k11;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final Kreativ.Entry P(C12655f fVar) {
        return (Kreativ.Entry) O.a(fVar.f108064t, P.b(Kreativ.Entry.class), X.j());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Q(dI.C17164e<? super XH.C16807N> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof BF.C12655f.b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            BF.f$b r0 = (BF.C12655f.b) r0
            int r1 = r0.f108079i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f108079i = r1
            goto L_0x0018
        L_0x0013:
            BF.f$b r0 = new BF.f$b
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r1 = r0.f108077g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f108079i
            r4 = 5
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0042
            if (r3 != r5) goto L_0x003a
            java.lang.Object r12 = r0.f108075e
            IJ.b$a r12 = (IJ.C15906b.a) r12
            java.lang.Object r12 = r0.f108074d
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f108073c
            BF.f r12 = (BF.C12655f) r12
            XH.y.b(r1)     // Catch:{ k1 -> 0x0038 }
            goto L_0x0199
        L_0x0038:
            r0 = move-exception
            goto L_0x0065
        L_0x003a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0042:
            XH.y.b(r1)
            IJ.b$a r1 = IJ.C15906b.f135496b     // Catch:{ k1 -> 0x0063 }
            IJ.e r3 = IJ.C15909e.SECONDS     // Catch:{ k1 -> 0x0063 }
            long r7 = IJ.C15908d.s(r4, r3)     // Catch:{ k1 -> 0x0063 }
            BF.f$c r3 = new BF.f$c     // Catch:{ k1 -> 0x0063 }
            r3.<init>(r11, r6)     // Catch:{ k1 -> 0x0063 }
            r0.f108073c = r11     // Catch:{ k1 -> 0x0063 }
            r0.f108074d = r12     // Catch:{ k1 -> 0x0063 }
            r0.f108075e = r1     // Catch:{ k1 -> 0x0063 }
            r0.f108076f = r4     // Catch:{ k1 -> 0x0063 }
            r0.f108079i = r5     // Catch:{ k1 -> 0x0063 }
            java.lang.Object r12 = QJ.m1.d(r7, r3, r0)     // Catch:{ k1 -> 0x0063 }
            if (r12 != r2) goto L_0x0199
            return r2
        L_0x0063:
            r0 = move-exception
            r12 = r11
        L_0x0065:
            com.sugarcube.core.logger.Priority r1 = com.sugarcube.core.logger.Priority.WARN
            java.lang.String r0 = XH.C16816g.b(r0)
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = ""
        L_0x006f:
            int[] r2 = BF.C12656g.f108110a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            java.lang.String r2 = " "
            java.lang.String r3 = "Kt"
            r7 = 46
            r8 = 36
            r9 = 2
            java.lang.String r10 = "Timeout while fetching scenes"
            if (r1 == r5) goto L_0x0166
            if (r1 == r9) goto L_0x0132
            r5 = 3
            if (r1 == r5) goto L_0x00fe
            r5 = 4
            if (r1 == r5) goto L_0x00c9
            if (r1 != r4) goto L_0x00c3
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            java.lang.String r1 = HJ.C15854t.s1(r12, r8, r6, r9, r6)
            java.lang.String r1 = HJ.C15854t.o1(r1, r7, r6, r9, r6)
            int r4 = r1.length()
            if (r4 != 0) goto L_0x00a8
            goto L_0x00ac
        L_0x00a8:
            java.lang.String r12 = HJ.C15854t.P0(r1, r3)
        L_0x00ac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r12, r0)
            goto L_0x0199
        L_0x00c3:
            XH.t r12 = new XH.t
            r12.<init>()
            throw r12
        L_0x00c9:
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            java.lang.String r1 = HJ.C15854t.s1(r12, r8, r6, r9, r6)
            java.lang.String r1 = HJ.C15854t.o1(r1, r7, r6, r9, r6)
            int r4 = r1.length()
            if (r4 != 0) goto L_0x00e3
            goto L_0x00e7
        L_0x00e3:
            java.lang.String r12 = HJ.C15854t.P0(r1, r3)
        L_0x00e7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r12, r0)
            goto L_0x0199
        L_0x00fe:
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            java.lang.String r1 = HJ.C15854t.s1(r12, r8, r6, r9, r6)
            java.lang.String r1 = HJ.C15854t.o1(r1, r7, r6, r9, r6)
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0118
            goto L_0x011c
        L_0x0118:
            java.lang.String r12 = HJ.C15854t.P0(r1, r3)
        L_0x011c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.i(r12, r0)
            goto L_0x0199
        L_0x0132:
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            java.lang.String r1 = HJ.C15854t.s1(r12, r8, r6, r9, r6)
            java.lang.String r1 = HJ.C15854t.o1(r1, r7, r6, r9, r6)
            int r4 = r1.length()
            if (r4 != 0) goto L_0x014c
            goto L_0x0150
        L_0x014c:
            java.lang.String r12 = HJ.C15854t.P0(r1, r3)
        L_0x0150:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r12, r0)
            goto L_0x0199
        L_0x0166:
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            java.lang.String r1 = HJ.C15854t.s1(r12, r8, r6, r9, r6)
            java.lang.String r1 = HJ.C15854t.o1(r1, r7, r6, r9, r6)
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0180
            goto L_0x0184
        L_0x0180:
            java.lang.String r12 = HJ.C15854t.P0(r1, r3)
        L_0x0184:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r12, r0)
        L_0x0199:
            XH.N r12 = XH.C16807N.f139792a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: BF.C12655f.Q(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Kreativ.Entry R() {
        return (Kreativ.Entry) this.f108066v.getValue();
    }

    /* access modifiers changed from: private */
    public final Object U(C17164e<? super Boolean> eVar) {
        return this.f108057m.get(FeatureFlags.UpgradeWall.INSTANCE, eVar);
    }

    /* access modifiers changed from: private */
    public final void W(List<? extends Object> list, Destination destination) {
        b0(destination);
        this.f108069y.setValue(list);
    }

    /* access modifiers changed from: private */
    public final boolean X(Kreativ.Entry entry) {
        String e10 = entry.e();
        boolean z10 = e10 == null || e10.length() == 0;
        String a10 = entry.a();
        boolean z11 = a10 == null || a10.length() == 0;
        String c10 = entry.c();
        return (!z10 || !z11 || !(c10 == null || c10.length() == 0)) && this.f108063s.isDecorateSupported();
    }

    /* access modifiers changed from: private */
    public final boolean Y(Uri uri, Kreativ.Entry entry) {
        return C17542s.e(uri != null ? C14041c.c(uri) : null, C14041c.c(Uri.parse("ikea://design-lab/scan"))) || entry.d();
    }

    /* access modifiers changed from: private */
    public final boolean Z(Kreativ.Entry entry) {
        return C14046h.e(entry.f()) != null;
    }

    /* access modifiers changed from: private */
    public final boolean a0() {
        return !this.f108063s.isDecorateSupported();
    }

    private final void b0(Destination destination) {
        String g10 = R().g();
        if (g10 != null) {
            this.f108065u.execute(OpeningSource.Companion.valueOf(g10), (EntryType) null, destination, C14046h.e(R().e()), C14046h.e(R().a()), R().b());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c0(dI.C17164e<? super java.lang.Boolean> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof BF.C12655f.e
            if (r0 == 0) goto L_0x0014
            r0 = r13
            BF.f$e r0 = (BF.C12655f.e) r0
            int r1 = r0.f108109i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f108109i = r1
        L_0x0012:
            r5 = r0
            goto L_0x001a
        L_0x0014:
            BF.f$e r0 = new BF.f$e
            r0.<init>(r12, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r5.f108107g
            java.lang.Object r8 = eI.C17187b.f()
            int r1 = r5.f108109i
            r2 = 3
            r3 = 2
            r9 = 1
            if (r1 == 0) goto L_0x005e
            if (r1 == r9) goto L_0x0052
            if (r1 == r3) goto L_0x0046
            if (r1 != r2) goto L_0x003e
            java.lang.Object r13 = r5.f108105e
            IJ.b$a r13 = (IJ.C15906b.a) r13
            java.lang.Object r13 = r5.f108104d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r5.f108103c
            BF.f r13 = (BF.C12655f) r13
            XH.y.b(r0)
            goto L_0x00bd
        L_0x003e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0046:
            java.lang.Object r13 = r5.f108104d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r1 = r5.f108103c
            BF.f r1 = (BF.C12655f) r1
            XH.y.b(r0)
            goto L_0x008c
        L_0x0052:
            java.lang.Object r13 = r5.f108104d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r1 = r5.f108103c
            BF.f r1 = (BF.C12655f) r1
            XH.y.b(r0)
            goto L_0x0073
        L_0x005e:
            XH.y.b(r0)
            com.sugarcube.app.base.data.feature.ConfigRepository r0 = r12.f108057m
            com.sugarcube.app.base.data.feature.ConfigItems$UserHasCompletedFirstCapture r1 = com.sugarcube.app.base.data.feature.ConfigItems.UserHasCompletedFirstCapture.INSTANCE
            r5.f108103c = r12
            r5.f108104d = r13
            r5.f108109i = r9
            java.lang.Object r0 = r0.get(r1, r5)
            if (r0 != r8) goto L_0x0072
            return r8
        L_0x0072:
            r1 = r12
        L_0x0073:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00c7
            com.sugarcube.app.base.data.feature.ConfigRepository r0 = r1.f108057m
            com.sugarcube.app.base.data.feature.ConfigItems$UserHasPlacedItem r4 = com.sugarcube.app.base.data.feature.ConfigItems.UserHasPlacedItem.INSTANCE
            r5.f108103c = r1
            r5.f108104d = r13
            r5.f108109i = r3
            java.lang.Object r0 = r0.get(r4, r5)
            if (r0 != r8) goto L_0x008c
            return r8
        L_0x008c:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00c7
            com.sugarcube.app.base.data.SceneRepository r0 = r1.f108058n
            IJ.b$a r3 = IJ.C15906b.f135496b
            IJ.e r4 = IJ.C15909e.MINUTES
            r6 = 5
            long r10 = IJ.C15908d.s(r6, r4)
            IJ.b r4 = IJ.C15906b.v(r10)
            KF.r r7 = r1.f108062r
            r5.f108103c = r1
            r5.f108104d = r13
            r5.f108105e = r3
            r5.f108106f = r6
            r5.f108109i = r2
            r2 = 0
            r6 = 1
            r13 = 0
            r1 = r0
            r3 = r4
            r4 = r7
            r7 = r13
            java.lang.Object r0 = com.sugarcube.app.base.data.SceneRepository.m25startRefreshhhJSO8g$default(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r8) goto L_0x00bd
            return r8
        L_0x00bd:
            com.sugarcube.app.base.data.SceneRepository$SceneRepoStatus r0 = (com.sugarcube.app.base.data.SceneRepository.SceneRepoStatus) r0
            boolean r13 = r0.getHasScenes()
            if (r13 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r9 = 0
        L_0x00c7:
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: BF.C12655f.c0(dI.e):java.lang.Object");
    }

    public final F<List<Object>> S() {
        return this.f108070z;
    }

    public final F<Boolean> T() {
        return this.f108068x;
    }

    public final void V() {
        String b10 = R().b();
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new d(this, b10 != null ? Uri.parse(b10) : null, (C17164e<? super d>) null), 3, (Object) null);
    }
}
