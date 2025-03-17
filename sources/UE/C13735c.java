package UE;

import OE.C13320l;
import OE.n;
import OE.q;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.y;
import YH.C16877v;
import YH.X;
import android.content.res.Resources;
import android.net.Uri;
import androidx.lifecycle.C5210m;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.app.base.data.asset.VideoAssetRepository;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.source.CompositionRepository;
import com.sugarcube.app.base.external.MembershipUiRepo;
import com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase;
import com.sugarcube.core.network.models.Composition;
import dI.C17164e;
import eI.C17187b;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import nI.p;
import tI.C17978n;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002%#B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001eH\u0016¢\u0006\u0004\b\"\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010/¨\u00061"}, d2 = {"LUE/c;", "Lcom/sugarcube/app/base/external/MembershipUiRepo;", "LOE/q;", "sugarcube", "Landroid/content/res/Resources;", "resources", "Lcom/sugarcube/app/base/DeviceCompatibility;", "deviceCompatibility", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "compositionRepository", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "videoAssetRepository", "<init>", "(LOE/q;Landroid/content/res/Resources;Lcom/sugarcube/app/base/DeviceCompatibility;Lcom/sugarcube/app/base/data/SceneRepository;Lcom/sugarcube/app/base/data/source/CompositionRepository;Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;)V", "LUE/e;", "userScenes", "LUE/c$b;", "f", "(LUE/e;)LUE/c$b;", "", "minutes", "", "i", "(I)Ljava/lang/String;", "Ljava/time/Instant;", "lastModified", "g", "(Ljava/time/Instant;)Ljava/lang/String;", "LTJ/g;", "h", "()LTJ/g;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;", "getMembershipListsCardInformation", "a", "LOE/q;", "b", "Landroid/content/res/Resources;", "c", "Lcom/sugarcube/app/base/DeviceCompatibility;", "d", "Lcom/sugarcube/app/base/data/SceneRepository;", "e", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "", "LTJ/g;", "enabledFlow", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UE.c  reason: case insensitive filesystem */
public final class C13735c implements MembershipUiRepo {

    /* renamed from: h  reason: collision with root package name */
    public static final a f117090h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f117091i = 8;

    /* renamed from: a  reason: collision with root package name */
    private final q f117092a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Resources f117093b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final DeviceCompatibility f117094c;

    /* renamed from: d  reason: collision with root package name */
    private final SceneRepository f117095d;

    /* renamed from: e  reason: collision with root package name */
    private final CompositionRepository f117096e;

    /* renamed from: f  reason: collision with root package name */
    private final VideoAssetRepository f117097f;

    /* renamed from: g  reason: collision with root package name */
    private final C16532g<Boolean> f117098g = C16534i.H(new C2882c(this, (C17164e<? super C2882c>) null));

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LUE/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "TIMEOUT_MS", "J", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UE.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"LUE/c$b;", "", "<init>", "()V", "Lcom/sugarcube/app/base/data/database/Scene;", "a", "()Lcom/sugarcube/app/base/data/database/Scene;", "scene", "b", "LUE/c$b$a;", "LUE/c$b$b;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UE.c$b */
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LUE/c$b$a;", "LUE/c$b;", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "<init>", "(Lcom/sugarcube/app/base/data/database/Scene;)V", "a", "Lcom/sugarcube/app/base/data/database/Scene;", "()Lcom/sugarcube/app/base/data/database/Scene;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: UE.c$b$a */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Scene f117099a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Scene scene) {
                super((DefaultConstructorMarker) null);
                C17542s.j(scene, "scene");
                this.f117099a = scene;
            }

            public Scene a() {
                return this.f117099a;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"LUE/c$b$b;", "LUE/c$b;", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "Lcom/sugarcube/core/network/models/Composition;", "composition", "<init>", "(Lcom/sugarcube/app/base/data/database/Scene;Lcom/sugarcube/core/network/models/Composition;)V", "a", "Lcom/sugarcube/app/base/data/database/Scene;", "()Lcom/sugarcube/app/base/data/database/Scene;", "b", "Lcom/sugarcube/core/network/models/Composition;", "()Lcom/sugarcube/core/network/models/Composition;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: UE.c$b$b  reason: collision with other inner class name */
        public static final class C2881b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Scene f117100a;

            /* renamed from: b  reason: collision with root package name */
            private final Composition f117101b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2881b(Scene scene, Composition composition) {
                super((DefaultConstructorMarker) null);
                C17542s.j(scene, "scene");
                C17542s.j(composition, "composition");
                this.f117100a = scene;
                this.f117101b = composition;
            }

            public Scene a() {
                return this.f117100a;
            }

            public final Composition b() {
                return this.f117101b;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Scene a();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.external.MembershipUiRepoImpl$enabledFlow$1", f = "MembershipUiRepo.kt", l = {131, 131}, m = "invokeSuspend")
    /* renamed from: UE.c$c  reason: collision with other inner class name */
    static final class C2882c extends l implements p<C16533h<? super Boolean>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f117102c;

        /* renamed from: d  reason: collision with root package name */
        Object f117103d;

        /* renamed from: e  reason: collision with root package name */
        int f117104e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f117105f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13735c f117106g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2882c(C13735c cVar, C17164e<? super C2882c> eVar) {
            super(2, eVar);
            this.f117106g = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2882c cVar = new C2882c(this.f117106g, eVar);
            cVar.f117105f = obj;
            return cVar;
        }

        public final Object invoke(C16533h<? super Boolean> hVar, C17164e<? super C16807N> eVar) {
            return ((C2882c) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r4.f117104e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002e
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                java.lang.Object r0 = r4.f117102c
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r4.f117105f
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r5)
                goto L_0x0059
            L_0x001a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x0022:
                java.lang.Object r1 = r4.f117102c
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r3 = r4.f117105f
                TJ.h r3 = (TJ.C16533h) r3
                XH.y.b(r5)
                goto L_0x004a
            L_0x002e:
                XH.y.b(r5)
                java.lang.Object r5 = r4.f117105f
                r1 = r5
                TJ.h r1 = (TJ.C16533h) r1
                UE.c r5 = r4.f117106g
                com.sugarcube.app.base.DeviceCompatibility r5 = r5.f117094c
                r4.f117105f = r1
                r4.f117102c = r1
                r4.f117104e = r3
                java.lang.Object r5 = r5.isKreativEnabled(r4)
                if (r5 != r0) goto L_0x0049
                return r0
            L_0x0049:
                r3 = r1
            L_0x004a:
                r4.f117105f = r3
                r4.f117102c = r1
                r4.f117103d = r5
                r4.f117104e = r2
                java.lang.Object r5 = r1.emit(r5, r4)
                if (r5 != r0) goto L_0x0059
                return r0
            L_0x0059:
                XH.N r5 = XH.C16807N.f139792a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: UE.C13735c.C2882c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.external.MembershipUiRepoImpl$getLatestDesign$$inlined$flatMapLatest$1", f = "MembershipUiRepo.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: UE.c$d */
    public static final class d extends l implements nI.q<C16533h<? super b>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117107c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f117108d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f117109e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16532g f117110f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C16532g f117111g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17164e eVar, C16532g gVar, C16532g gVar2) {
            super(3, eVar);
            this.f117110f = gVar;
            this.f117111g = gVar2;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super b> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            d dVar = new d(eVar, this.f117110f, this.f117111g);
            dVar.f117108d = hVar;
            dVar.f117109e = bool;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16532g gVar;
            Object f10 = C17187b.f();
            int i10 = this.f117107c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f117108d;
                if (((Boolean) this.f117109e).booleanValue()) {
                    gVar = C16534i.P(this.f117110f, this.f117111g);
                } else {
                    gVar = C16534i.J(null);
                }
                this.f117107c = 1;
                if (C16534i.x(hVar, gVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UE.c$e */
    public static final class e implements C16532g<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f117112a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ K f117113b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C13735c f117114c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: UE.c$e$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f117115a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f117116b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C13735c f117117c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.external.MembershipUiRepoImpl$getLatestDesign$$inlined$map$1$2", f = "MembershipUiRepo.kt", l = {50}, m = "emit")
            /* renamed from: UE.c$e$a$a  reason: collision with other inner class name */
            public static final class C2883a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f117118c;

                /* renamed from: d  reason: collision with root package name */
                int f117119d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f117120e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2883a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f117120e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f117118c = obj;
                    this.f117119d |= Integer.MIN_VALUE;
                    return this.f117120e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, K k10, C13735c cVar) {
                this.f117115a = hVar;
                this.f117116b = k10;
                this.f117117c = cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof UE.C13735c.e.a.C2883a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    UE.c$e$a$a r0 = (UE.C13735c.e.a.C2883a) r0
                    int r1 = r0.f117119d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f117119d = r1
                    goto L_0x0018
                L_0x0013:
                    UE.c$e$a$a r0 = new UE.c$e$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f117118c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f117119d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f117115a
                    UE.e r5 = (UE.e) r5
                    kotlin.jvm.internal.K r2 = r4.f117116b
                    r2.f144344a = r3
                    UE.c r2 = r4.f117117c
                    UE.c$b r5 = r2.f(r5)
                    r0.f117119d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: UE.C13735c.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar, K k10, C13735c cVar) {
            this.f117112a = gVar;
            this.f117113b = k10;
            this.f117114c = cVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f117112a.collect(new a(hVar, this.f117113b, this.f117114c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/sugarcube/core/network/models/Composition;", "comps", "", "Lcom/sugarcube/app/base/data/database/Scene;", "scenes", "LUE/e;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;)LUE/e;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.external.MembershipUiRepoImpl$getLatestDesign$mainFlow$1", f = "MembershipUiRepo.kt", l = {}, m = "invokeSuspend")
    /* renamed from: UE.c$f */
    static final class f extends l implements nI.q<List<Composition>, List<? extends Scene>, C17164e<? super e>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117121c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f117122d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f117123e;

        f(C17164e<? super f> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(List<Composition> list, List<Scene> list2, C17164e<? super e> eVar) {
            f fVar = new f(eVar);
            fVar.f117122d = list;
            fVar.f117123e = list2;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f117121c == 0) {
                y.b(obj);
                List list = (List) this.f117122d;
                List list2 = (List) this.f117123e;
                Iterable<Scene> iterable = list2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
                for (Scene scene : iterable) {
                    ArrayList arrayList = new ArrayList();
                    for (Object next : list) {
                        if (C17542s.e(((Composition) next).getSceneUuid(), scene.getSceneUuid())) {
                            arrayList.add(next);
                        }
                    }
                    v a10 = C16796C.a(scene.getUuid(), arrayList);
                    linkedHashMap.put(a10.c(), a10.d());
                }
                return new e(true, list2, list, linkedHashMap);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LUE/c$b;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.external.MembershipUiRepoImpl$getLatestDesign$timeoutFlow$1", f = "MembershipUiRepo.kt", l = {196, 198}, m = "invokeSuspend")
    /* renamed from: UE.c$g */
    static final class g extends l implements p<C16533h<? super b>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117124c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f117125d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f117126e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(K k10, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f117126e = k10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f117126e, eVar);
            gVar.f117125d = obj;
            return gVar;
        }

        public final Object invoke(C16533h<? super b> hVar, C17164e<? super C16807N> eVar) {
            return ((g) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f117124c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0026
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r0 = r5.f117125d
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r6)
                goto L_0x004d
            L_0x0016:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001e:
                java.lang.Object r1 = r5.f117125d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r6)
                goto L_0x003b
            L_0x0026:
                XH.y.b(r6)
                java.lang.Object r6 = r5.f117125d
                r1 = r6
                TJ.h r1 = (TJ.C16533h) r1
                r5.f117125d = r1
                r5.f117124c = r3
                r3 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r6 = QJ.C16297b0.b(r3, r5)
                if (r6 != r0) goto L_0x003b
                return r0
            L_0x003b:
                kotlin.jvm.internal.K r6 = r5.f117126e
                boolean r6 = r6.f144344a
                if (r6 != 0) goto L_0x004d
                r5.f117125d = r1
                r5.f117124c = r2
                r6 = 0
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L_0x004d
                return r0
            L_0x004d:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: UE.C13735c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LUE/c$b;", "design", "Landroid/net/Uri;", "uri", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;", "<anonymous>", "(LUE/c$b;Landroid/net/Uri;)Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.external.MembershipUiRepoImpl$getMembershipListsCardInformation$1", f = "MembershipUiRepo.kt", l = {}, m = "invokeSuspend")
    /* renamed from: UE.c$h */
    static final class h extends l implements nI.q<b, Uri, C17164e<? super GetMembershipListsCardUseCase.Model>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117127c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f117128d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f117129e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13735c f117130f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C13735c cVar, C17164e<? super h> eVar) {
            super(3, eVar);
            this.f117130f = cVar;
        }

        /* renamed from: i */
        public final Object invoke(b bVar, Uri uri, C17164e<? super GetMembershipListsCardUseCase.Model> eVar) {
            h hVar = new h(this.f117130f, eVar);
            hVar.f117128d = bVar;
            hVar.f117129e = uri;
            return hVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x0215  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0268  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                r24 = this;
                r0 = r24
                eI.C17187b.f()
                int r1 = r0.f117127c
                if (r1 != 0) goto L_0x02c2
                XH.y.b(r25)
                java.lang.Object r1 = r0.f117128d
                UE.c$b r1 = (UE.C13735c.b) r1
                java.lang.Object r2 = r0.f117129e
                r7 = r2
                android.net.Uri r7 = (android.net.Uri) r7
                UE.c r2 = r0.f117130f
                com.sugarcube.core.logger.Priority r3 = com.sugarcube.core.logger.Priority.DEBUG
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "VideoDownload: getting new uri: "
                r4.append(r5)
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = ""
                if (r4 != 0) goto L_0x002f
                r4 = r5
            L_0x002f:
                int[] r6 = UE.d.f117131a
                int r3 = r3.ordinal()
                r3 = r6[r3]
                r6 = 1
                java.lang.String r8 = " "
                java.lang.String r9 = "Kt"
                r10 = 46
                r11 = 36
                r12 = 2
                r13 = 0
                if (r3 == r6) goto L_0x0127
                if (r3 == r12) goto L_0x00f3
                r14 = 3
                if (r3 == r14) goto L_0x00bf
                r14 = 4
                if (r3 == r14) goto L_0x008a
                r14 = 5
                if (r3 != r14) goto L_0x0084
                java.lang.Class r2 = r2.getClass()
                java.lang.String r2 = r2.getName()
                kotlin.jvm.internal.C17542s.g(r2)
                java.lang.String r3 = HJ.C15854t.s1(r2, r11, r13, r12, r13)
                java.lang.String r3 = HJ.C15854t.o1(r3, r10, r13, r12, r13)
                int r10 = r3.length()
                if (r10 != 0) goto L_0x0069
                goto L_0x006d
            L_0x0069:
                java.lang.String r2 = HJ.C15854t.P0(r3, r9)
            L_0x006d:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                r3.append(r8)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                android.util.Log.e(r2, r3)
                goto L_0x015a
            L_0x0084:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x008a:
                java.lang.Class r2 = r2.getClass()
                java.lang.String r2 = r2.getName()
                kotlin.jvm.internal.C17542s.g(r2)
                java.lang.String r3 = HJ.C15854t.s1(r2, r11, r13, r12, r13)
                java.lang.String r3 = HJ.C15854t.o1(r3, r10, r13, r12, r13)
                int r10 = r3.length()
                if (r10 != 0) goto L_0x00a4
                goto L_0x00a8
            L_0x00a4:
                java.lang.String r2 = HJ.C15854t.P0(r3, r9)
            L_0x00a8:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                r3.append(r8)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                android.util.Log.w(r2, r3)
                goto L_0x015a
            L_0x00bf:
                java.lang.Class r2 = r2.getClass()
                java.lang.String r2 = r2.getName()
                kotlin.jvm.internal.C17542s.g(r2)
                java.lang.String r3 = HJ.C15854t.s1(r2, r11, r13, r12, r13)
                java.lang.String r3 = HJ.C15854t.o1(r3, r10, r13, r12, r13)
                int r10 = r3.length()
                if (r10 != 0) goto L_0x00d9
                goto L_0x00dd
            L_0x00d9:
                java.lang.String r2 = HJ.C15854t.P0(r3, r9)
            L_0x00dd:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                r3.append(r8)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                android.util.Log.i(r2, r3)
                goto L_0x015a
            L_0x00f3:
                java.lang.Class r2 = r2.getClass()
                java.lang.String r2 = r2.getName()
                kotlin.jvm.internal.C17542s.g(r2)
                java.lang.String r3 = HJ.C15854t.s1(r2, r11, r13, r12, r13)
                java.lang.String r3 = HJ.C15854t.o1(r3, r10, r13, r12, r13)
                int r10 = r3.length()
                if (r10 != 0) goto L_0x010d
                goto L_0x0111
            L_0x010d:
                java.lang.String r2 = HJ.C15854t.P0(r3, r9)
            L_0x0111:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                r3.append(r8)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                android.util.Log.d(r2, r3)
                goto L_0x015a
            L_0x0127:
                java.lang.Class r2 = r2.getClass()
                java.lang.String r2 = r2.getName()
                kotlin.jvm.internal.C17542s.g(r2)
                java.lang.String r3 = HJ.C15854t.s1(r2, r11, r13, r12, r13)
                java.lang.String r3 = HJ.C15854t.o1(r3, r10, r13, r12, r13)
                int r10 = r3.length()
                if (r10 != 0) goto L_0x0141
                goto L_0x0145
            L_0x0141:
                java.lang.String r2 = HJ.C15854t.P0(r3, r9)
            L_0x0145:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                r3.append(r8)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                android.util.Log.v(r2, r3)
            L_0x015a:
                if (r1 == 0) goto L_0x02ab
                UE.c r2 = r0.f117130f
                com.sugarcube.app.base.data.database.SceneState$Companion r3 = com.sugarcube.app.base.data.database.SceneState.Companion
                java.util.Set r4 = r3.getProcessingStates()
                com.sugarcube.app.base.data.database.Scene r5 = r1.a()
                com.sugarcube.app.base.data.database.SceneState r5 = r5.getState()
                boolean r18 = r4.contains(r5)
                boolean r4 = r1 instanceof UE.C13735c.b.C2881b
                r5 = 0
                if (r4 == 0) goto L_0x018a
                r3 = r1
                UE.c$b$b r3 = (UE.C13735c.b.C2881b) r3
                com.sugarcube.core.network.models.Composition r3 = r3.b()
                java.time.Instant r3 = r3.getLastModifiedTs()
                java.lang.String r3 = r2.g(r3)
            L_0x0184:
                r16 = r3
                r19 = r6
                goto L_0x0211
            L_0x018a:
                java.util.Set r7 = r3.getReadyStates()
                com.sugarcube.app.base.data.database.Scene r8 = r1.a()
                com.sugarcube.app.base.data.database.SceneState r8 = r8.getState()
                boolean r7 = r7.contains(r8)
                if (r7 == 0) goto L_0x01a7
                android.content.res.Resources r3 = r2.f117093b
                int r7 = OE.n.f113385i5
                java.lang.String r3 = r3.getString(r7)
                goto L_0x0184
            L_0x01a7:
                java.util.Set r7 = r3.getInProgressStates()
                com.sugarcube.app.base.data.database.Scene r8 = r1.a()
                com.sugarcube.app.base.data.database.SceneState r8 = r8.getState()
                boolean r7 = r7.contains(r8)
                if (r7 == 0) goto L_0x01ca
                com.sugarcube.app.base.data.database.Scene r3 = r1.a()
                int r3 = r3.getRemainingProcessingTime()
                java.lang.String r3 = r2.i(r3)
            L_0x01c5:
                r16 = r3
                r19 = r5
                goto L_0x0211
            L_0x01ca:
                java.util.Set r7 = r3.getProcessingStates()
                com.sugarcube.app.base.data.database.Scene r8 = r1.a()
                com.sugarcube.app.base.data.database.SceneState r8 = r8.getState()
                boolean r7 = r7.contains(r8)
                if (r7 == 0) goto L_0x01e9
                com.sugarcube.app.base.data.database.Scene r3 = r1.a()
                int r3 = r3.getRemainingProcessingTime()
                java.lang.String r3 = r2.i(r3)
                goto L_0x01c5
            L_0x01e9:
                java.util.Set r3 = r3.getFailureStates()
                com.sugarcube.app.base.data.database.Scene r7 = r1.a()
                com.sugarcube.app.base.data.database.SceneState r7 = r7.getState()
                boolean r3 = r3.contains(r7)
                if (r3 == 0) goto L_0x0206
                android.content.res.Resources r3 = r2.f117093b
                int r7 = OE.n.f113378h5
                java.lang.String r3 = r3.getString(r7)
                goto L_0x01c5
            L_0x0206:
                android.content.res.Resources r3 = r2.f117093b
                int r7 = OE.n.f113378h5
                java.lang.String r3 = r3.getString(r7)
                goto L_0x01c5
            L_0x0211:
                java.lang.String r3 = "toString(...)"
                if (r4 == 0) goto L_0x0268
                com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase$Model$b r4 = new com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase$Model$b
                UE.c$b$b r1 = (UE.C13735c.b.C2881b) r1
                com.sugarcube.core.network.models.Composition r5 = r1.b()
                java.lang.String r5 = r5.getName()
                if (r5 != 0) goto L_0x0234
                android.content.res.Resources r2 = r2.f117093b
                int r5 = OE.n.f113453s3
                java.lang.String r2 = r2.getString(r5)
                java.lang.String r5 = "getString(...)"
                kotlin.jvm.internal.C17542s.i(r2, r5)
                r15 = r2
                goto L_0x0235
            L_0x0234:
                r15 = r5
            L_0x0235:
                com.sugarcube.core.network.models.Composition r2 = r1.b()
                android.net.Uri r2 = r2.getThumbnailUrl()
                if (r2 != 0) goto L_0x0241
                android.net.Uri r2 = android.net.Uri.EMPTY
            L_0x0241:
                r17 = r2
                kotlin.jvm.internal.C17542s.g(r17)
                com.sugarcube.app.base.data.database.Scene r2 = r1.a()
                java.util.UUID r2 = r2.getSceneUuid()
                java.lang.String r2 = r2.toString()
                kotlin.jvm.internal.C17542s.i(r2, r3)
                com.sugarcube.core.network.models.Composition r1 = r1.b()
                java.util.UUID r1 = r1.getCompositionUuid()
                java.lang.String r21 = r1.toString()
                r14 = r4
                r20 = r2
                r14.<init>(r15, r16, r17, r18, r19, r20, r21)
                goto L_0x02c1
            L_0x0268:
                boolean r2 = r1 instanceof UE.C13735c.b.a
                if (r2 == 0) goto L_0x02a5
                com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase$Model$b r4 = new com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase$Model$b
                UE.c$b$a r1 = (UE.C13735c.b.a) r1
                com.sugarcube.app.base.data.database.Scene r2 = r1.a()
                java.lang.String r15 = r2.getName()
                com.sugarcube.app.base.data.database.Scene r2 = r1.a()
                android.net.Uri r2 = com.sugarcube.app.base.data.database.Scene.getImage$default(r2, r5, r6, r13)
                if (r2 != 0) goto L_0x0284
                android.net.Uri r2 = android.net.Uri.EMPTY
            L_0x0284:
                r17 = r2
                kotlin.jvm.internal.C17542s.g(r17)
                com.sugarcube.app.base.data.database.Scene r1 = r1.a()
                java.util.UUID r1 = r1.getSceneUuid()
                java.lang.String r1 = r1.toString()
                kotlin.jvm.internal.C17542s.i(r1, r3)
                r22 = 64
                r23 = 0
                r21 = 0
                r14 = r4
                r20 = r1
                r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
                goto L_0x02c1
            L_0x02a5:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x02ab:
                com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase$Model$a r1 = new com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase$Model$a
                int r4 = OE.n.f113434p5
                int r5 = OE.n.f113420n5
                int r6 = OE.C13316h.f112823E
                int r8 = OE.n.f113324a0
                int r2 = OE.n.f113352e0
                java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.e(r2)
                r10 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r4 = r1
            L_0x02c1:
                return r4
            L_0x02c2:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: UE.C13735c.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C13735c(q qVar, Resources resources, DeviceCompatibility deviceCompatibility, SceneRepository sceneRepository, CompositionRepository compositionRepository, VideoAssetRepository videoAssetRepository) {
        C17542s.j(qVar, "sugarcube");
        C17542s.j(resources, "resources");
        C17542s.j(deviceCompatibility, "deviceCompatibility");
        C17542s.j(sceneRepository, "sceneRepository");
        C17542s.j(compositionRepository, "compositionRepository");
        C17542s.j(videoAssetRepository, "videoAssetRepository");
        this.f117092a = qVar;
        this.f117093b = resources;
        this.f117094c = deviceCompatibility;
        this.f117095d = sceneRepository;
        this.f117096e = compositionRepository;
        this.f117097f = videoAssetRepository;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.sugarcube.core.network.models.Composition} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final UE.C13735c.b f(UE.e r9) {
        /*
            r8 = this;
            java.util.List r0 = r9.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 != 0) goto L_0x0013
            r1 = r2
            goto L_0x003e
        L_0x0013:
            java.lang.Object r1 = r0.next()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L_0x001e
            goto L_0x003e
        L_0x001e:
            r3 = r1
            com.sugarcube.core.network.models.Composition r3 = (com.sugarcube.core.network.models.Composition) r3
            java.time.Instant r3 = r3.getLastModifiedTs()
        L_0x0025:
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.sugarcube.core.network.models.Composition r5 = (com.sugarcube.core.network.models.Composition) r5
            java.time.Instant r5 = r5.getLastModifiedTs()
            int r6 = r3.compareTo(r5)
            if (r6 >= 0) goto L_0x0038
            r1 = r4
            r3 = r5
        L_0x0038:
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L_0x0025
        L_0x003e:
            r4 = r1
            com.sugarcube.core.network.models.Composition r4 = (com.sugarcube.core.network.models.Composition) r4
            java.util.List r0 = r9.b()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r5 = r0.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x0053
            r0 = r2
            goto L_0x007e
        L_0x0053:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L_0x005e
            goto L_0x007e
        L_0x005e:
            r1 = r0
            com.sugarcube.app.base.data.database.Scene r1 = (com.sugarcube.app.base.data.database.Scene) r1
            java.time.Instant r1 = r1.getLastModifiedTs()
        L_0x0065:
            java.lang.Object r3 = r5.next()
            r6 = r3
            com.sugarcube.app.base.data.database.Scene r6 = (com.sugarcube.app.base.data.database.Scene) r6
            java.time.Instant r6 = r6.getLastModifiedTs()
            int r7 = r1.compareTo(r6)
            if (r7 >= 0) goto L_0x0078
            r0 = r3
            r1 = r6
        L_0x0078:
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L_0x0065
        L_0x007e:
            com.sugarcube.app.base.data.database.Scene r0 = (com.sugarcube.app.base.data.database.Scene) r0
            if (r0 != 0) goto L_0x0083
            goto L_0x00dc
        L_0x0083:
            if (r4 != 0) goto L_0x008b
            UE.c$b$a r2 = new UE.c$b$a
            r2.<init>(r0)
            goto L_0x00dc
        L_0x008b:
            java.time.Instant r1 = r4.getLastModifiedTs()
            java.time.Instant r3 = r0.getLastModifiedTs()
            int r1 = r1.compareTo(r3)
            if (r1 < 0) goto L_0x00d7
            java.util.List r9 = r9.b()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x00a3:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00bf
            java.lang.Object r1 = r9.next()
            r3 = r1
            com.sugarcube.app.base.data.database.Scene r3 = (com.sugarcube.app.base.data.database.Scene) r3
            java.util.UUID r3 = r3.getUuid()
            java.util.UUID r5 = r4.getSceneUuid()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r3 == 0) goto L_0x00a3
            r2 = r1
        L_0x00bf:
            com.sugarcube.app.base.data.database.Scene r2 = (com.sugarcube.app.base.data.database.Scene) r2
            if (r2 != 0) goto L_0x00d0
            java.lang.String r9 = "MembershipUiRepo"
            java.lang.String r1 = "missing scene for latest composition"
            android.util.Log.e(r9, r1)
            UE.c$b$a r2 = new UE.c$b$a
            r2.<init>(r0)
            goto L_0x00dc
        L_0x00d0:
            UE.c$b$b r9 = new UE.c$b$b
            r9.<init>(r2, r4)
            r2 = r9
            goto L_0x00dc
        L_0x00d7:
            UE.c$b$a r2 = new UE.c$b$a
            r2.<init>(r0)
        L_0x00dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: UE.C13735c.f(UE.e):UE.c$b");
    }

    /* access modifiers changed from: private */
    public final String g(Instant instant) {
        String string = this.f117093b.getString(n.f113399k5, new Object[]{new NL.e(this.f117092a.getLocale()).g(instant)});
        C17542s.i(string, "getString(...)");
        return string;
    }

    private final C16532g<b> h() {
        K k10 = new K();
        return C16534i.g0(this.f117098g, new d((C17164e) null, new e(C16534i.n(C5210m.a(this.f117096e.getAllCompositions()), this.f117095d.getScenesFlow(), new f((C17164e<? super f>) null)), k10, this), C16534i.H(new g(k10, (C17164e<? super g>) null))));
    }

    /* access modifiers changed from: private */
    public final String i(int i10) {
        String quantityString = this.f117093b.getQuantityString(C13320l.f113164d, i10, new Object[]{Integer.valueOf(i10)});
        C17542s.i(quantityString, "getQuantityString(...)");
        String string = this.f117093b.getString(n.f113441q5, new Object[]{quantityString});
        C17542s.i(string, "getString(...)");
        return string;
    }

    public C16532g<GetMembershipListsCardUseCase.Model> getMembershipListsCardInformation() {
        return C16534i.n(h(), this.f117097f.getFlow(VideoAsset.MEMBERSHIP_ENTRY_POINT), new h(this, (C17164e<? super h>) null));
    }
}
