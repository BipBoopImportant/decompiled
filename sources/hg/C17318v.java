package hG;

import OE.C13309a;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import RF.j;
import XH.C16796C;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import YH.X;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.sugarcube.app.base.data.AnalyticsManager;
import com.sugarcube.app.base.data.analytics.CatalogItemSource;
import com.sugarcube.app.base.data.analytics.ChangeType;
import com.sugarcube.app.base.data.analytics.MethodType;
import com.sugarcube.app.base.data.analytics.SaveType;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.common.UiText;
import com.sugarcube.core.analytics.ActionType;
import com.sugarcube.core.analytics.BaseEventProperty;
import com.sugarcube.core.analytics.Design;
import com.sugarcube.core.analytics.Event;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackableKt;
import com.sugarcube.core.analytics.TrackingKey;
import dI.C17164e;
import eI.C17187b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.p;
import o1.C5667g;
import rG.C17847a;
import uI.C18055d;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u0019J\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010\u0019J\r\u0010 \u001a\u00020\r¢\u0006\u0004\b \u0010\u0019J\u0015\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\r¢\u0006\u0004\b%\u0010\u0019J\r\u0010&\u001a\u00020\r¢\u0006\u0004\b&\u0010\u0019J+\u0010+\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010!2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010(¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\r2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b1\u00100J\u0015\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020!¢\u0006\u0004\b3\u0010$J\u001d\u00107\u001a\u00020\r2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020\r2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204¢\u0006\u0004\b9\u00108J#\u0010>\u001a\u00020\r2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010=\u001a\u000204¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u00020\r2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:¢\u0006\u0004\b@\u0010AJ\u0015\u0010D\u001a\u00020\r2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0015\u0010H\u001a\u00020\r2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJ\u0015\u0010L\u001a\u00020\r2\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\r¢\u0006\u0004\bN\u0010\u0019J\u0015\u0010O\u001a\u00020\r2\u0006\u00102\u001a\u00020!¢\u0006\u0004\bO\u0010$J\r\u0010P\u001a\u00020\r¢\u0006\u0004\bP\u0010\u0019J\u0017\u0010R\u001a\u00020\r2\b\u0010Q\u001a\u0004\u0018\u000104¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010WR(\u0010[\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0014\u0012\u0004\u0012\u00020\t0X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"LhG/v;", "", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "analyticsManager", "LOE/a;", "appEnvironment", "<init>", "(Lcom/sugarcube/app/base/data/AnalyticsManager;LOE/a;)V", "", "Lcom/sugarcube/core/analytics/Trackable;", "m0", "()Ljava/util/List;", "Lkotlin/Function0;", "LXH/N;", "block", "u", "(LnI/a;)V", "trackable", "n0", "(Lcom/sugarcube/core/analytics/Trackable;)V", "LuI/d;", "clazz", "o0", "(LuI/d;Lcom/sugarcube/core/analytics/Trackable;)V", "M", "()V", "LRF/j;", "view", "B", "(LRF/j;)V", "I", "G", "e0", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "Z", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "V", "Q", "oldItem", "Lo1/g;", "originalPosition", "finalPosition", "h0", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lo1/g;Lo1/g;)V", "Lcom/sugarcube/app/base/data/analytics/MethodType;", "methodType", "X", "(Lcom/sugarcube/app/base/data/analytics/MethodType;)V", "O", "catalogItem", "j0", "", "start", "end", "E", "(Ljava/lang/String;Ljava/lang/String;)V", "b0", "", "LrG/a;", "items", "error", "v", "(Ljava/util/List;Ljava/lang/String;)V", "y", "(Ljava/util/List;)V", "Lcom/sugarcube/core/analytics/Design$Menu;", "event", "T", "(Lcom/sugarcube/core/analytics/Design$Menu;)V", "Lcom/sugarcube/common/UiText;", "errorMessage", "K", "(Lcom/sugarcube/common/UiText;)V", "", "new", "d0", "(Z)V", "D", "S", "g0", "colorHex", "l0", "(Ljava/lang/String;)V", "a", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "b", "LOE/a;", "Ljava/util/concurrent/ConcurrentHashMap;", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "map", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hG.v  reason: case insensitive filesystem */
public final class C17318v {

    /* renamed from: a  reason: collision with root package name */
    private final AnalyticsManager f143408a;

    /* renamed from: b  reason: collision with root package name */
    private final C13309a f143409b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<C18055d<? extends Trackable>, Trackable> f143410c = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.manager.DecorateAnalytics$launch$1", f = "DecorateAnalytics.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hG.v$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f143411c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f143412d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17631a<C16807N> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f143412d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f143412d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f143411c == 0) {
                y.b(obj);
                this.f143412d.invoke();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C17318v(AnalyticsManager analyticsManager, C13309a aVar) {
        C17542s.j(analyticsManager, "analyticsManager");
        C17542s.j(aVar, "appEnvironment");
        this.f143408a = analyticsManager;
        this.f143409b = aVar;
    }

    /* access modifiers changed from: private */
    public static final CharSequence A(C17847a aVar) {
        C17542s.j(aVar, "it");
        return String.valueOf(aVar.a().a().getCatalogItem().getLocalItemNumber());
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C17318v vVar, j jVar) {
        AnalyticsManager analyticsManager = vVar.f143408a;
        Design.Views views = Design.Views.ChangeView;
        ActionType actionType = ActionType.Click;
        List<Trackable> m02 = vVar.m0();
        m02.add(new BaseEventProperty(X.l(C16796C.a(TrackingKey.MultiViewIndex, TrackableKt.toTrackableValue(jVar.j())))));
        C16807N n10 = C16807N.f139792a;
        analyticsManager.track((Event) views, actionType, (List<? extends Trackable>) m02);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C17318v vVar, String str, String str2) {
        vVar.f143408a.track((Event) Design.Room.MoveProduct, ActionType.Drag, (List<? extends Trackable>) C16877v.V0(vVar.m0(), C16877v.e(new BaseEventProperty(X.l(C16796C.a(TrackingKey.OriginalPosition, str), C16796C.a(TrackingKey.FinalPosition, str2))))));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(C17318v vVar) {
        vVar.f143408a.track((Event) Design.EraseMenu.EraseAll, ActionType.Click, (List<? extends Trackable>) vVar.m0());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J(C17318v vVar) {
        vVar.f143408a.track((Event) Design.EraseMenu.Done, ActionType.Click, (List<? extends Trackable>) vVar.m0());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C17318v vVar, UiText uiText) {
        vVar.f143408a.track((Event) Design.Decoration.Error, ActionType.Workflow, (List<? extends Trackable>) C16877v.V0(vVar.m0(), C16877v.e(new BaseEventProperty(X.l(C16796C.a(TrackingKey.Message, uiText.asString(vVar.f143409b.a())))))));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C17318v vVar) {
        vVar.f143408a.track((Event) Design.Room.Exit, ActionType.Click, (List<? extends Trackable>) vVar.m0());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P(C17318v vVar, MethodType methodType) {
        vVar.f143408a.track((Event) Design.Room.ExitPOI, ActionType.Click, (Trackable) new BaseEventProperty(X.l(C16796C.a(TrackingKey.Method, methodType.getKey()))));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R(C17318v vVar) {
        vVar.f143408a.track((Event) Design.Room.ChangeProduct, ActionType.Click, (List<? extends Trackable>) C16877v.e(new BaseEventProperty(X.l(C16796C.a(TrackingKey.ChangeType, ChangeType.SNAP_ROTATE_FLIP.getKey())))));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U(C17318v vVar, Design.Menu menu) {
        vVar.f143408a.track((Event) menu, ActionType.Click, (List<? extends Trackable>) vVar.m0());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W(C17318v vVar) {
        AnalyticsManager analyticsManager = vVar.f143408a;
        Design.Room room = Design.Room.ChangeProduct;
        ActionType actionType = ActionType.Click;
        List<Trackable> m02 = vVar.m0();
        m02.add(new BaseEventProperty(X.l(C16796C.a(TrackingKey.ChangeType, ChangeType.MIRROR.getKey()))));
        C16807N n10 = C16807N.f139792a;
        analyticsManager.track((Event) room, actionType, (List<? extends Trackable>) m02);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(C17318v vVar, MethodType methodType) {
        vVar.f143408a.track((Event) Design.Room.EnterPOI, ActionType.Click, (Trackable) new BaseEventProperty(X.l(C16796C.a(TrackingKey.Method, methodType.getKey()))));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a0(C17318v vVar, CachedCatalogItem cachedCatalogItem) {
        vVar.f143408a.track((Event) Design.Room.AddProduct, ActionType.Drop, (List<? extends Trackable>) C16877v.V0(vVar.m0(), C16877v.q(cachedCatalogItem, new BaseEventProperty(X.l(C16796C.a(TrackingKey.AddedFrom, CatalogItemSource.ADD.getDisplayName()), C16796C.a(TrackingKey.FinalPosition, "0.0"))))));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N c0(C17318v vVar, String str, String str2) {
        vVar.f143408a.track((Event) Design.Room.RotateProduct, ActionType.Rotate, (List<? extends Trackable>) C16877v.V0(vVar.m0(), C16877v.e(new BaseEventProperty(X.l(C16796C.a(TrackingKey.OriginalPosition, str), C16796C.a(TrackingKey.FinalPosition, str2))))));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f0(C17318v vVar) {
        vVar.f143408a.track((Event) Design.EraseMenu.ShowAll, ActionType.Click, (List<? extends Trackable>) vVar.m0());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001f, code lost:
        r7 = r13.getCatalogItem();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final XH.C16807N i0(hG.C17318v r12, com.sugarcube.app.base.data.database.CachedCatalogItem r13, o1.C5667g r14, o1.C5667g r15) {
        /*
            com.sugarcube.app.base.data.AnalyticsManager r0 = r12.f143408a
            com.sugarcube.core.analytics.Design$Room r1 = com.sugarcube.core.analytics.Design.Room.SwapProduct
            com.sugarcube.core.analytics.ActionType r2 = com.sugarcube.core.analytics.ActionType.Click
            java.util.List r12 = r12.m0()
            java.util.Collection r12 = (java.util.Collection) r12
            com.sugarcube.core.analytics.BaseEventProperty r3 = new com.sugarcube.core.analytics.BaseEventProperty
            com.sugarcube.core.analytics.TrackingKey r4 = com.sugarcube.core.analytics.TrackingKey.AddedFrom
            com.sugarcube.app.base.data.analytics.CatalogItemSource r5 = com.sugarcube.app.base.data.analytics.CatalogItemSource.SWAP
            java.lang.String r5 = r5.getDisplayName()
            XH.v r6 = XH.C16796C.a(r4, r5)
            com.sugarcube.core.analytics.TrackingKey r4 = com.sugarcube.core.analytics.TrackingKey.OldProductId
            r5 = 0
            if (r13 == 0) goto L_0x002a
            com.sugarcube.core.network.models.CatalogItem r7 = r13.getCatalogItem()
            if (r7 == 0) goto L_0x002a
            java.lang.String r7 = r7.getGlobalProductId()
            goto L_0x002b
        L_0x002a:
            r7 = r5
        L_0x002b:
            java.lang.String r7 = com.sugarcube.core.analytics.TrackableKt.toTrackableValue(r7)
            XH.v r7 = XH.C16796C.a(r4, r7)
            com.sugarcube.core.analytics.TrackingKey r4 = com.sugarcube.core.analytics.TrackingKey.OldProductTitle
            if (r13 == 0) goto L_0x003c
            java.lang.String r8 = r13.getName()
            goto L_0x003d
        L_0x003c:
            r8 = r5
        L_0x003d:
            java.lang.String r8 = com.sugarcube.core.analytics.TrackableKt.toTrackableValue(r8)
            XH.v r8 = XH.C16796C.a(r4, r8)
            com.sugarcube.core.analytics.TrackingKey r4 = com.sugarcube.core.analytics.TrackingKey.OldProductType
            if (r13 == 0) goto L_0x0053
            com.sugarcube.core.network.models.CatalogItem r13 = r13.getCatalogItem()
            if (r13 == 0) goto L_0x0053
            java.lang.String r5 = r13.getGeometryType()
        L_0x0053:
            java.lang.String r13 = com.sugarcube.core.analytics.TrackableKt.toTrackableValue(r5)
            XH.v r9 = XH.C16796C.a(r4, r13)
            com.sugarcube.core.analytics.TrackingKey r13 = com.sugarcube.core.analytics.TrackingKey.OriginalPosition
            java.lang.String r14 = com.sugarcube.core.analytics.TrackableKt.toTrackableValue(r14)
            XH.v r10 = XH.C16796C.a(r13, r14)
            com.sugarcube.core.analytics.TrackingKey r13 = com.sugarcube.core.analytics.TrackingKey.FinalPosition
            java.lang.String r14 = com.sugarcube.core.analytics.TrackableKt.toTrackableValue(r15)
            XH.v r11 = XH.C16796C.a(r13, r14)
            XH.v[] r13 = new XH.v[]{r6, r7, r8, r9, r10, r11}
            java.util.HashMap r13 = YH.X.l(r13)
            r3.<init>(r13)
            java.util.List r13 = YH.C16877v.e(r3)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r12 = YH.C16877v.V0(r12, r13)
            r0.track((com.sugarcube.core.analytics.Event) r1, (com.sugarcube.core.analytics.ActionType) r2, (java.util.List<? extends com.sugarcube.core.analytics.Trackable>) r12)
            XH.N r12 = XH.C16807N.f139792a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: hG.C17318v.i0(hG.v, com.sugarcube.app.base.data.database.CachedCatalogItem, o1.g, o1.g):XH.N");
    }

    /* access modifiers changed from: private */
    public static final C16807N k0(C17318v vVar, CachedCatalogItem cachedCatalogItem) {
        vVar.f143408a.track((Event) Design.Room.Tapped, ActionType.Click, (List<? extends Trackable>) C16877v.V0(vVar.m0(), C16877v.e(cachedCatalogItem)));
        return C16807N.f139792a;
    }

    private final List<Trackable> m0() {
        Collection<Trackable> values = this.f143410c.values();
        C17542s.i(values, "<get-values>(...)");
        return C16877v.w1(values);
    }

    private final void u(C17631a<C16807N> aVar) {
        F0 unused = C16314k.d(this.f143409b.b(), C16311i0.b(), (T) null, new a(aVar, (C17164e<? super a>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N w(List list, String str, C17318v vVar) {
        vVar.f143408a.track((Event) list.size() == 1 ? Design.Room.AddToBag : Design.Room.AddAllToBag, ActionType.Click, (List<? extends Trackable>) C16877v.W0(vVar.m0(), new BaseEventProperty(X.l(C16796C.a(TrackingKey.ProductItems, C16877v.G0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C17308l(), 30, (Object) null)), C16796C.a(TrackingKey.Message, str)))));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final CharSequence x(C17847a aVar) {
        C17542s.j(aVar, "it");
        return String.valueOf(aVar.a().a().getCatalogItem().getLocalItemNumber());
    }

    /* access modifiers changed from: private */
    public static final C16807N z(List list, C17318v vVar) {
        HashMap hashMap;
        String G02 = C16877v.G0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C17307k(), 30, (Object) null);
        if (list.size() == 1) {
            hashMap = X.l(C16796C.a(TrackingKey.ProductId, String.valueOf(((C17847a) C16877v.w0(list)).a().a().getCatalogItem().getId())), C16796C.a(TrackingKey.ProductTitle, String.valueOf(((C17847a) C16877v.w0(list)).a().a().getCatalogItem().getName())), C16796C.a(TrackingKey.LocalItemNumber, String.valueOf(((C17847a) C16877v.w0(list)).a().a().getCatalogItem().getLocalItemNumber())), C16796C.a(TrackingKey.ProductType, ((C17847a) C16877v.w0(list)).a().a().getProductType().getKey()), C16796C.a(TrackingKey.ProductIds, G02));
        } else {
            TrackingKey trackingKey = TrackingKey.ProductCount;
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 += ((C17847a) it.next()).a().b();
            }
            hashMap = X.l(C16796C.a(trackingKey, String.valueOf(i10)), C16796C.a(TrackingKey.ProductIds, G02));
        }
        vVar.f143408a.track((Event) list.size() == 1 ? Design.Room.AddToBag : Design.Room.AddAllToBag, ActionType.Click, (List<? extends Trackable>) C16877v.W0(vVar.m0(), new BaseEventProperty(hashMap)));
        return C16807N.f139792a;
    }

    public final void B(j jVar) {
        C17542s.j(jVar, "view");
        u(new C17310n(this, jVar));
    }

    public final void D() {
        this.f143408a.track((Event) Design.Open.Start, ActionType.Workflow, (List<? extends Trackable>) m0());
    }

    public final void E(String str, String str2) {
        C17542s.j(str, "start");
        C17542s.j(str2, "end");
        u(new C17298b(this, str, str2));
    }

    public final void G() {
        u(new C17313q(this));
    }

    public final void I() {
        u(new C17303g(this));
    }

    public final void K(UiText uiText) {
        C17542s.j(uiText, "errorMessage");
        u(new C17315s(this, uiText));
    }

    public final void M() {
        u(new C17302f(this));
    }

    public final void O(MethodType methodType) {
        C17542s.j(methodType, "methodType");
        u(new C17316t(this, methodType));
    }

    public final void Q() {
        u(new C17304h(this));
    }

    public final void S(CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "catalogItem");
        this.f143408a.track((Event) Design.Menu.ListProductTapped, ActionType.Click, (List<? extends Trackable>) C16877v.V0(m0(), C16877v.e(cachedCatalogItem)));
    }

    public final void T(Design.Menu menu) {
        C17542s.j(menu, "event");
        u(new C17299c(this, menu));
    }

    public final void V() {
        u(new C17301e(this));
    }

    public final void X(MethodType methodType) {
        C17542s.j(methodType, "methodType");
        u(new C17317u(this, methodType));
    }

    public final void Z(CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "item");
        u(new C17300d(this, cachedCatalogItem));
    }

    public final void b0(String str, String str2) {
        C17542s.j(str, "start");
        C17542s.j(str2, "end");
        u(new C17314r(this, str, str2));
    }

    public final void d0(boolean z10) {
        this.f143408a.track((Event) Design.Room.Save, ActionType.Click, (List<? extends Trackable>) C16877v.V0(m0(), C16877v.e(new BaseEventProperty(X.l(C16796C.a(TrackingKey.SaveType, (z10 ? SaveType.New : SaveType.Update).getKey()))))));
    }

    public final void e0() {
        u(new C17309m(this));
    }

    public final void g0() {
        this.f143408a.track((Event) Design.Menu.Style, ActionType.Click, (List<? extends Trackable>) m0());
    }

    public final void h0(CachedCatalogItem cachedCatalogItem, C5667g gVar, C5667g gVar2) {
        u(new C17306j(this, cachedCatalogItem, gVar, gVar2));
    }

    public final void j0(CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "catalogItem");
        u(new C17312p(this, cachedCatalogItem));
    }

    public final void l0(String str) {
        AnalyticsManager analyticsManager = this.f143408a;
        Design.Menu menu = Design.Menu.SelectWallColor;
        ActionType actionType = ActionType.Click;
        Collection m02 = m0();
        TrackingKey trackingKey = TrackingKey.Color;
        if (str == null) {
            str = "No Color";
        }
        analyticsManager.track((Event) menu, actionType, (List<? extends Trackable>) C16877v.V0(m02, C16877v.e(new BaseEventProperty(X.l(C16796C.a(trackingKey, str))))));
    }

    public final void n0(Trackable trackable) {
        C17542s.j(trackable, "trackable");
        this.f143410c.put(P.b(trackable.getClass()), trackable);
    }

    public final void o0(C18055d<? extends Trackable> dVar, Trackable trackable) {
        C17542s.j(dVar, "clazz");
        if (trackable != null) {
            this.f143410c.put(dVar, trackable);
        } else {
            this.f143410c.remove(dVar);
        }
    }

    public final void v(List<C17847a> list, String str) {
        C17542s.j(list, "items");
        C17542s.j(str, UiComponentContainer.RESULT_ERROR);
        u(new C17305i(list, str, this));
    }

    public final void y(List<C17847a> list) {
        C17542s.j(list, "items");
        u(new C17311o(list, this));
    }
}
