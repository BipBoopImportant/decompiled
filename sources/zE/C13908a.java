package ZE;

import IJ.C15906b;
import KF.C13164r;
import OE.C13309a;
import OE.n;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import UE.C13733a;
import XE.C13805a;
import XH.C16807N;
import XH.y;
import android.content.res.Resources;
import android.util.Log;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.source.CompositionRepository;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.membership.GetMembershipActionListUseCase;
import com.sugarcube.app.base.ui.gallery.h;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.LoggedInUser;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import nI.p;
import uK.C18146a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001e0\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010,¨\u0006-"}, d2 = {"LZE/a;", "Lcom/sugarcube/app/base/external/membership/GetMembershipActionListUseCase;", "LOE/a;", "appEnvironment", "Landroid/content/res/Resources;", "resources", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "compositionRepository", "LKF/r;", "uploadVersion", "LUE/a;", "deeplinks", "<init>", "(LOE/a;Landroid/content/res/Resources;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/data/SceneRepository;Lcom/sugarcube/app/base/data/source/CompositionRepository;LKF/r;LUE/a;)V", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "Lcom/sugarcube/core/network/models/Composition;", "composition", "LXE/a;", "previousAction", "f", "(Lcom/sugarcube/app/base/data/database/Scene;Lcom/sugarcube/core/network/models/Composition;LXE/a;)LXE/a;", "LQJ/Q;", "g", "()LQJ/Q;", "LTJ/g;", "", "execute", "()LTJ/g;", "a", "LOE/a;", "b", "Landroid/content/res/Resources;", "c", "Lcom/sugarcube/app/base/data/user/UserRepo;", "d", "Lcom/sugarcube/app/base/data/SceneRepository;", "e", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "LKF/r;", "LUE/a;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZE.a  reason: case insensitive filesystem */
public final class C13908a implements GetMembershipActionListUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final C13309a f118396a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f118397b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final UserRepo f118398c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final SceneRepository f118399d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final CompositionRepository f118400e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C13164r f118401f;

    /* renamed from: g  reason: collision with root package name */
    private final C13733a f118402g;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.membership.GetMembershipActionListUseCaseImpl$execute$$inlined$transform$1", f = "GetMembershipActionListUseCaseImpl.kt", l = {36}, m = "invokeSuspend")
    /* renamed from: ZE.a$a  reason: collision with other inner class name */
    public static final class C2944a extends l implements p<C16533h<? super List<? extends C13805a>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118403c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f118404d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16532g f118405e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ O f118406f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13908a f118407g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ O f118408h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ O f118409i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ZE.a$a$a  reason: collision with other inner class name */
        public static final class C2945a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h<List<? extends C13805a>> f118410a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ O f118411b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C13908a f118412c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ O f118413d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ O f118414e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.sugarcube.app.base.membership.GetMembershipActionListUseCaseImpl$execute$$inlined$transform$1$1", f = "GetMembershipActionListUseCaseImpl.kt", l = {57}, m = "emit")
            /* renamed from: ZE.a$a$a$a  reason: collision with other inner class name */
            public static final class C2946a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118415c;

                /* renamed from: d  reason: collision with root package name */
                int f118416d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2945a f118417e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2946a(C2945a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118417e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118415c = obj;
                    this.f118416d |= Integer.MIN_VALUE;
                    return this.f118417e.emit(null, this);
                }
            }

            public C2945a(C16533h hVar, O o10, C13908a aVar, O o11, O o12) {
                this.f118411b = o10;
                this.f118412c = aVar;
                this.f118413d = o11;
                this.f118414e = o12;
                this.f118410a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r10, dI.C17164e<? super XH.C16807N> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof ZE.C13908a.C2944a.C2945a.C2946a
                    if (r0 == 0) goto L_0x0013
                    r0 = r11
                    ZE.a$a$a$a r0 = (ZE.C13908a.C2944a.C2945a.C2946a) r0
                    int r1 = r0.f118416d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118416d = r1
                    goto L_0x0018
                L_0x0013:
                    ZE.a$a$a$a r0 = new ZE.a$a$a$a
                    r0.<init>(r9, r11)
                L_0x0018:
                    java.lang.Object r11 = r0.f118415c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118416d
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    XH.y.b(r11)
                    goto L_0x00bd
                L_0x002a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L_0x0032:
                    XH.y.b(r11)
                    TJ.h<java.util.List<? extends XE.a>> r11 = r9.f118410a
                    java.util.List r10 = (java.util.List) r10
                    int r2 = r10.size()
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r5 = "    design.size="
                    r4.append(r5)
                    r4.append(r2)
                    java.lang.String r2 = r4.toString()
                    java.lang.String r4 = "Sugarcube"
                    android.util.Log.d(r4, r2)
                    kotlin.jvm.internal.O r2 = r9.f118411b
                    java.lang.Iterable r10 = (java.lang.Iterable) r10
                    java.util.Iterator r10 = r10.iterator()
                    boolean r4 = r10.hasNext()
                    if (r4 != 0) goto L_0x0063
                    r10 = 0
                    goto L_0x0090
                L_0x0063:
                    java.lang.Object r4 = r10.next()
                    boolean r5 = r10.hasNext()
                    if (r5 != 0) goto L_0x006f
                L_0x006d:
                    r10 = r4
                    goto L_0x0090
                L_0x006f:
                    r5 = r4
                    com.sugarcube.core.network.models.Composition r5 = (com.sugarcube.core.network.models.Composition) r5
                    java.time.Instant r5 = r5.getLastModifiedTs()
                L_0x0076:
                    java.lang.Object r6 = r10.next()
                    r7 = r6
                    com.sugarcube.core.network.models.Composition r7 = (com.sugarcube.core.network.models.Composition) r7
                    java.time.Instant r7 = r7.getLastModifiedTs()
                    int r8 = r5.compareTo(r7)
                    if (r8 >= 0) goto L_0x0089
                    r4 = r6
                    r5 = r7
                L_0x0089:
                    boolean r6 = r10.hasNext()
                    if (r6 != 0) goto L_0x0076
                    goto L_0x006d
                L_0x0090:
                    r2.f144348a = r10
                    ZE.a r10 = r9.f118412c
                    kotlin.jvm.internal.O r2 = r9.f118413d
                    T r2 = r2.f144348a
                    com.sugarcube.app.base.data.database.Scene r2 = (com.sugarcube.app.base.data.database.Scene) r2
                    kotlin.jvm.internal.O r4 = r9.f118411b
                    T r4 = r4.f144348a
                    com.sugarcube.core.network.models.Composition r4 = (com.sugarcube.core.network.models.Composition) r4
                    kotlin.jvm.internal.O r5 = r9.f118414e
                    T r5 = r5.f144348a
                    XE.a r5 = (XE.C13805a) r5
                    XE.a r10 = r10.f(r2, r4, r5)
                    if (r10 == 0) goto L_0x00bd
                    kotlin.jvm.internal.O r2 = r9.f118414e
                    r2.f144348a = r10
                    java.util.List r10 = YH.C16877v.e(r10)
                    r0.f118416d = r3
                    java.lang.Object r10 = r11.emit(r10, r0)
                    if (r10 != r1) goto L_0x00bd
                    return r1
                L_0x00bd:
                    XH.N r10 = XH.C16807N.f139792a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: ZE.C13908a.C2944a.C2945a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2944a(C16532g gVar, C17164e eVar, O o10, C13908a aVar, O o11, O o12) {
            super(2, eVar);
            this.f118405e = gVar;
            this.f118406f = o10;
            this.f118407g = aVar;
            this.f118408h = o11;
            this.f118409i = o12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2944a aVar = new C2944a(this.f118405e, eVar, this.f118406f, this.f118407g, this.f118408h, this.f118409i);
            aVar.f118404d = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super List<? extends C13805a>> hVar, C17164e<? super C16807N> eVar) {
            return ((C2944a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118403c;
            if (i10 == 0) {
                y.b(obj);
                C16532g gVar = this.f118405e;
                C2945a aVar = new C2945a((C16533h) this.f118404d, this.f118406f, this.f118407g, this.f118408h, this.f118409i);
                this.f118403c = 1;
                if (gVar.collect(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.membership.GetMembershipActionListUseCaseImpl$execute$$inlined$transform$2", f = "GetMembershipActionListUseCaseImpl.kt", l = {36}, m = "invokeSuspend")
    /* renamed from: ZE.a$b */
    public static final class b extends l implements p<C16533h<? super List<? extends C13805a>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118418c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f118419d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16532g f118420e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ O f118421f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13908a f118422g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ O f118423h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ O f118424i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ZE.a$b$a  reason: collision with other inner class name */
        public static final class C2947a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h<List<? extends C13805a>> f118425a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ O f118426b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C13908a f118427c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ O f118428d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ O f118429e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.sugarcube.app.base.membership.GetMembershipActionListUseCaseImpl$execute$$inlined$transform$2$1", f = "GetMembershipActionListUseCaseImpl.kt", l = {62}, m = "emit")
            /* renamed from: ZE.a$b$a$a  reason: collision with other inner class name */
            public static final class C2948a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118430c;

                /* renamed from: d  reason: collision with root package name */
                int f118431d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2947a f118432e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2948a(C2947a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118432e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118430c = obj;
                    this.f118431d |= Integer.MIN_VALUE;
                    return this.f118432e.emit(null, this);
                }
            }

            public C2947a(C16533h hVar, O o10, C13908a aVar, O o11, O o12) {
                this.f118426b = o10;
                this.f118427c = aVar;
                this.f118428d = o11;
                this.f118429e = o12;
                this.f118425a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r10, dI.C17164e<? super XH.C16807N> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof ZE.C13908a.b.C2947a.C2948a
                    if (r0 == 0) goto L_0x0013
                    r0 = r11
                    ZE.a$b$a$a r0 = (ZE.C13908a.b.C2947a.C2948a) r0
                    int r1 = r0.f118431d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118431d = r1
                    goto L_0x0018
                L_0x0013:
                    ZE.a$b$a$a r0 = new ZE.a$b$a$a
                    r0.<init>(r9, r11)
                L_0x0018:
                    java.lang.Object r11 = r0.f118430c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118431d
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    XH.y.b(r11)
                    goto L_0x00dd
                L_0x002a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L_0x0032:
                    XH.y.b(r11)
                    TJ.h<java.util.List<? extends XE.a>> r11 = r9.f118425a
                    java.util.List r10 = (java.util.List) r10
                    int r2 = r10.size()
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r5 = "    scene.size="
                    r4.append(r5)
                    r4.append(r2)
                    java.lang.String r2 = r4.toString()
                    java.lang.String r4 = "Sugarcube"
                    android.util.Log.d(r4, r2)
                    kotlin.jvm.internal.O r2 = r9.f118426b
                    java.lang.Iterable r10 = (java.lang.Iterable) r10
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>()
                    java.util.Iterator r10 = r10.iterator()
                L_0x0060:
                    boolean r5 = r10.hasNext()
                    if (r5 == 0) goto L_0x0077
                    java.lang.Object r5 = r10.next()
                    r6 = r5
                    com.sugarcube.app.base.data.database.Scene r6 = (com.sugarcube.app.base.data.database.Scene) r6
                    boolean r6 = r6.isSuccessful()
                    if (r6 == 0) goto L_0x0060
                    r4.add(r5)
                    goto L_0x0060
                L_0x0077:
                    java.util.Iterator r10 = r4.iterator()
                    boolean r4 = r10.hasNext()
                    if (r4 != 0) goto L_0x0083
                    r10 = 0
                    goto L_0x00b0
                L_0x0083:
                    java.lang.Object r4 = r10.next()
                    boolean r5 = r10.hasNext()
                    if (r5 != 0) goto L_0x008f
                L_0x008d:
                    r10 = r4
                    goto L_0x00b0
                L_0x008f:
                    r5 = r4
                    com.sugarcube.app.base.data.database.Scene r5 = (com.sugarcube.app.base.data.database.Scene) r5
                    java.time.Instant r5 = r5.getCreatedTs()
                L_0x0096:
                    java.lang.Object r6 = r10.next()
                    r7 = r6
                    com.sugarcube.app.base.data.database.Scene r7 = (com.sugarcube.app.base.data.database.Scene) r7
                    java.time.Instant r7 = r7.getCreatedTs()
                    int r8 = r5.compareTo(r7)
                    if (r8 >= 0) goto L_0x00a9
                    r4 = r6
                    r5 = r7
                L_0x00a9:
                    boolean r6 = r10.hasNext()
                    if (r6 != 0) goto L_0x0096
                    goto L_0x008d
                L_0x00b0:
                    r2.f144348a = r10
                    ZE.a r10 = r9.f118427c
                    kotlin.jvm.internal.O r2 = r9.f118426b
                    T r2 = r2.f144348a
                    com.sugarcube.app.base.data.database.Scene r2 = (com.sugarcube.app.base.data.database.Scene) r2
                    kotlin.jvm.internal.O r4 = r9.f118428d
                    T r4 = r4.f144348a
                    com.sugarcube.core.network.models.Composition r4 = (com.sugarcube.core.network.models.Composition) r4
                    kotlin.jvm.internal.O r5 = r9.f118429e
                    T r5 = r5.f144348a
                    XE.a r5 = (XE.C13805a) r5
                    XE.a r10 = r10.f(r2, r4, r5)
                    if (r10 == 0) goto L_0x00dd
                    kotlin.jvm.internal.O r2 = r9.f118429e
                    r2.f144348a = r10
                    java.util.List r10 = YH.C16877v.e(r10)
                    r0.f118431d = r3
                    java.lang.Object r10 = r11.emit(r10, r0)
                    if (r10 != r1) goto L_0x00dd
                    return r1
                L_0x00dd:
                    XH.N r10 = XH.C16807N.f139792a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: ZE.C13908a.b.C2947a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C16532g gVar, C17164e eVar, O o10, C13908a aVar, O o11, O o12) {
            super(2, eVar);
            this.f118420e = gVar;
            this.f118421f = o10;
            this.f118422g = aVar;
            this.f118423h = o11;
            this.f118424i = o12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f118420e, eVar, this.f118421f, this.f118422g, this.f118423h, this.f118424i);
            bVar.f118419d = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super List<? extends C13805a>> hVar, C17164e<? super C16807N> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118418c;
            if (i10 == 0) {
                y.b(obj);
                C16532g gVar = this.f118420e;
                C2947a aVar = new C2947a((C16533h) this.f118419d, this.f118421f, this.f118422g, this.f118423h, this.f118424i);
                this.f118418c = 1;
                if (gVar.collect(aVar, this) == f10) {
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
    @f(c = "com.sugarcube.app.base.membership.GetMembershipActionListUseCaseImpl$startSync$1$1", f = "GetMembershipActionListUseCaseImpl.kt", l = {142}, m = "invokeSuspend")
    /* renamed from: ZE.a$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118433c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f118434d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13908a f118435e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.membership.GetMembershipActionListUseCaseImpl$startSync$1$1$1", f = "GetMembershipActionListUseCaseImpl.kt", l = {145}, m = "invokeSuspend")
        /* renamed from: ZE.a$c$a  reason: collision with other inner class name */
        static final class C2949a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f118436c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C13908a f118437d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2949a(C13908a aVar, C17164e<? super C2949a> eVar) {
                super(2, eVar);
                this.f118437d = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2949a(this.f118437d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C2949a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f118436c;
                if (i10 == 0) {
                    y.b(obj);
                    Boolean value = this.f118437d.f118398c.isLoggedIn().getValue();
                    Log.d(AnyKt.SUGARCUBE_TAG, "sync scenes " + value);
                    SceneRepository c10 = this.f118437d.f118399d;
                    C13164r d10 = this.f118437d.f118401f;
                    this.f118436c = 1;
                    if (SceneRepository.m25startRefreshhhJSO8g$default(c10, true, (C15906b) null, d10, this, 2, (Object) null) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Log.d(AnyKt.SUGARCUBE_TAG, "sync scenes done");
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.membership.GetMembershipActionListUseCaseImpl$startSync$1$1$2", f = "GetMembershipActionListUseCaseImpl.kt", l = {150}, m = "invokeSuspend")
        /* renamed from: ZE.a$c$b */
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f118438c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C13908a f118439d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C13908a aVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f118439d = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f118439d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f118438c;
                if (i10 == 0) {
                    y.b(obj);
                    Boolean value = this.f118439d.f118398c.isLoggedIn().getValue();
                    Log.d(AnyKt.SUGARCUBE_TAG, "sync compositions " + value);
                    CompositionRepository a10 = this.f118439d.f118400e;
                    this.f118438c = 1;
                    if (a10.refreshCache(this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Log.d(AnyKt.SUGARCUBE_TAG, "sync compositions done");
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C13908a aVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f118435e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f118435e, eVar);
            cVar.f118434d = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f118433c;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f118434d;
                C16519P<LoggedInUser> user = this.f118435e.f118398c.getUser();
                this.f118434d = q10;
                this.f118433c = 1;
                if (C16534i.i(user, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                q10 = (Q) this.f118434d;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q q11 = q10;
            F0 unused = C16314k.d(q11, C16311i0.a(), (T) null, new C2949a(this.f118435e, (C17164e<? super C2949a>) null), 2, (Object) null);
            F0 unused2 = C16314k.d(q11, C16311i0.a(), (T) null, new b(this.f118435e, (C17164e<? super b>) null), 2, (Object) null);
            return C16807N.f139792a;
        }
    }

    public C13908a(C13309a aVar, Resources resources, UserRepo userRepo, SceneRepository sceneRepository, CompositionRepository compositionRepository, C13164r rVar, C13733a aVar2) {
        C17542s.j(aVar, "appEnvironment");
        C17542s.j(resources, "resources");
        C17542s.j(userRepo, "userRepo");
        C17542s.j(sceneRepository, "sceneRepository");
        C17542s.j(compositionRepository, "compositionRepository");
        C17542s.j(rVar, "uploadVersion");
        C17542s.j(aVar2, "deeplinks");
        this.f118396a = aVar;
        this.f118397b = resources;
        this.f118398c = userRepo;
        this.f118399d = sceneRepository;
        this.f118400e = compositionRepository;
        this.f118401f = rVar;
        this.f118402g = aVar2;
    }

    /* access modifiers changed from: private */
    public final C13805a f(Scene scene, Composition composition, C13805a aVar) {
        C13805a aVar2;
        String str;
        String str2;
        String str3 = null;
        if (composition == null || (scene != null && scene.getCreatedTs().compareTo(composition.getLastModifiedTs()) >= 0)) {
            aVar2 = scene != null ? new C13805a(scene.getName(), this.f118397b.getString(n.f113392j5), Integer.valueOf(C18146a.f148640sa), this.f118402g.f(scene.getSceneUuid(), OpeningSource.MembersOverview.INSTANCE)) : new C13805a((String) null, this.f118397b.getString(n.f113413m5), Integer.valueOf(C18146a.f148052G2), C13733a.c(this.f118402g, OpeningSource.MembersOverview.INSTANCE, (h) null, 2, (Object) null));
        } else {
            String name = composition.getName();
            if (name == null) {
                name = this.f118397b.getString(n.f113453s3);
                C17542s.i(name, "getString(...)");
            }
            aVar2 = new C13805a(name, this.f118397b.getString(n.f113406l5), Integer.valueOf(C18146a.f148640sa), C13733a.e(this.f118402g, composition.getSceneUuid(), composition.getCompositionUuid(), OpeningSource.MembersOverview.INSTANCE, (List) null, 8, (Object) null));
        }
        if (aVar != null && C17542s.e(aVar.b(), aVar2.b()) && C17542s.e(aVar.c(), aVar2.c())) {
            aVar2 = null;
        }
        String a10 = aVar != null ? aVar.a() : null;
        if (scene != null) {
            str = scene.getCreatedTs() + "," + scene.getSceneId() + "," + scene.getName() + "," + scene.getSceneUuid();
        } else {
            str = null;
        }
        if (composition != null) {
            str3 = composition.getLastModifiedTs() + "," + composition.getSceneId() + "," + composition.getCompositionId() + "," + composition.getName() + "," + composition.getSceneUuid() + "," + composition.getCompositionUuid();
        }
        if (aVar2 == null || (str2 = aVar2.a()) == null) {
            str2 = "";
        }
        Log.d(AnyKt.SUGARCUBE_TAG, "\n    action " + a10 + "\n    scene  " + str + "\n    design " + str3 + "\n    emit   " + str2 + "\n            ");
        return aVar2;
    }

    private final Q g() {
        Q b10 = this.f118396a.b();
        Boolean value = this.f118398c.isLoggedIn().getValue();
        Log.d(AnyKt.SUGARCUBE_TAG, "sync start " + value);
        F0 unused = C16314k.d(b10, C16311i0.a(), (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
        Log.d(AnyKt.SUGARCUBE_TAG, "sync end");
        return b10;
    }

    public C16532g<List<C13805a>> execute() {
        O o10 = new O();
        O o11 = new O();
        O o12 = new O();
        C16532g<List<C13805a>> P10 = C16534i.P(C16534i.H(new C2944a(this.f118400e.getAllCompositionsFlow(), (C17164e) null, o11, this, o10, o12)), C16534i.H(new b(this.f118399d.getScenesFlow(), (C17164e) null, o10, this, o11, o12)));
        g();
        return P10;
    }
}
