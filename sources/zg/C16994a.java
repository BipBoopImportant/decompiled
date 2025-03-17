package ZG;

import XH.x;
import com.sugarcube.app.base.data.source.CompositionRepository;
import com.sugarcube.core.network.models.AuthType;
import com.sugarcube.decorate.v2.internal.manager.CompositionUpdater;
import com.sugarcube.decorate.v2.internal.manager.engine.EngineManager;
import com.sugarcube.decorate.v2.internal.usecase.SaveDesignUseCase;
import dI.C17164e;
import eI.C17187b;
import kG.C17497c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\n0\r0\f2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LZG/a;", "Lcom/sugarcube/decorate/v2/internal/usecase/SaveDesignUseCase;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManager;", "engineManager", "Lcom/sugarcube/decorate/v2/internal/manager/CompositionUpdater;", "compositionUpdater", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "compositionRepository", "<init>", "(Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManager;Lcom/sugarcube/decorate/v2/internal/manager/CompositionUpdater;Lcom/sugarcube/app/base/data/source/CompositionRepository;)V", "LkG/c;", "metadata", "LXH/x;", "LXH/v;", "LMG/b$c;", "save-gIAlu-s", "(LkG/c;LdI/e;)Ljava/lang/Object;", "save", "Lcom/sugarcube/core/network/models/AuthType;", "pendingAction", "stashPendingDesign-0E7RQCE", "(LkG/c;Lcom/sugarcube/core/network/models/AuthType;LdI/e;)Ljava/lang/Object;", "stashPendingDesign", "a", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManager;", "b", "Lcom/sugarcube/decorate/v2/internal/manager/CompositionUpdater;", "c", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZG.a  reason: case insensitive filesystem */
public final class C16994a implements SaveDesignUseCase {

    /* renamed from: d  reason: collision with root package name */
    public static final int f140696d = CompositionRepository.$stable;

    /* renamed from: a  reason: collision with root package name */
    private final EngineManager f140697a;

    /* renamed from: b  reason: collision with root package name */
    private final CompositionUpdater f140698b;

    /* renamed from: c  reason: collision with root package name */
    private final CompositionRepository f140699c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.usecase.SaveDesignUseCaseImpl", f = "SaveDesignUseCase.kt", l = {46, 52, 49, 55}, m = "save-gIAlu-s")
    /* renamed from: ZG.a$a  reason: collision with other inner class name */
    static final class C3442a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f140700c;

        /* renamed from: d  reason: collision with root package name */
        Object f140701d;

        /* renamed from: e  reason: collision with root package name */
        Object f140702e;

        /* renamed from: f  reason: collision with root package name */
        Object f140703f;

        /* renamed from: g  reason: collision with root package name */
        Object f140704g;

        /* renamed from: h  reason: collision with root package name */
        Object f140705h;

        /* renamed from: i  reason: collision with root package name */
        Object f140706i;

        /* renamed from: j  reason: collision with root package name */
        Object f140707j;

        /* renamed from: k  reason: collision with root package name */
        Object f140708k;

        /* renamed from: l  reason: collision with root package name */
        Object f140709l;

        /* renamed from: m  reason: collision with root package name */
        Object f140710m;

        /* renamed from: n  reason: collision with root package name */
        Object f140711n;

        /* renamed from: o  reason: collision with root package name */
        int f140712o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f140713p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ C16994a f140714q;

        /* renamed from: r  reason: collision with root package name */
        int f140715r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3442a(C16994a aVar, C17164e<? super C3442a> eVar) {
            super(eVar);
            this.f140714q = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f140713p = obj;
            this.f140715r |= Integer.MIN_VALUE;
            Object r22 = this.f140714q.m46savegIAlus((C17497c) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.usecase.SaveDesignUseCaseImpl", f = "SaveDesignUseCase.kt", l = {72, 76, 73}, m = "stashPendingDesign-0E7RQCE")
    /* renamed from: ZG.a$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f140716c;

        /* renamed from: d  reason: collision with root package name */
        Object f140717d;

        /* renamed from: e  reason: collision with root package name */
        Object f140718e;

        /* renamed from: f  reason: collision with root package name */
        Object f140719f;

        /* renamed from: g  reason: collision with root package name */
        Object f140720g;

        /* renamed from: h  reason: collision with root package name */
        Object f140721h;

        /* renamed from: i  reason: collision with root package name */
        Object f140722i;

        /* renamed from: j  reason: collision with root package name */
        Object f140723j;

        /* renamed from: k  reason: collision with root package name */
        Object f140724k;

        /* renamed from: l  reason: collision with root package name */
        Object f140725l;

        /* renamed from: m  reason: collision with root package name */
        Object f140726m;

        /* renamed from: n  reason: collision with root package name */
        Object f140727n;

        /* renamed from: o  reason: collision with root package name */
        Object f140728o;

        /* renamed from: p  reason: collision with root package name */
        int f140729p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f140730q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ C16994a f140731r;

        /* renamed from: s  reason: collision with root package name */
        int f140732s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C16994a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f140731r = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f140730q = obj;
            this.f140732s |= Integer.MIN_VALUE;
            Object r22 = this.f140731r.m47stashPendingDesign0E7RQCE((C17497c) null, (AuthType) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public C16994a(EngineManager engineManager, CompositionUpdater compositionUpdater, CompositionRepository compositionRepository) {
        C17542s.j(engineManager, "engineManager");
        C17542s.j(compositionUpdater, "compositionUpdater");
        C17542s.j(compositionRepository, "compositionRepository");
        this.f140697a = engineManager;
        this.f140698b = compositionUpdater;
        this.f140699c = compositionRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0185 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: save-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m46savegIAlus(kG.C17497c r24, dI.C17164e<? super XH.x<XH.v<MG.C16033b.c, kG.C17497c>>> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof ZG.C16994a.C3442a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ZG.a$a r2 = (ZG.C16994a.C3442a) r2
            int r3 = r2.f140715r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f140715r = r3
            goto L_0x001c
        L_0x0017:
            ZG.a$a r2 = new ZG.a$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f140713p
            java.lang.Object r9 = eI.C17187b.f()
            int r4 = r2.f140715r
            r11 = 4
            r5 = 3
            r6 = 2
            r12 = 1
            if (r4 == 0) goto L_0x00f4
            if (r4 == r12) goto L_0x00e3
            if (r4 == r6) goto L_0x00a3
            if (r4 == r5) goto L_0x006b
            if (r4 != r11) goto L_0x0063
            java.lang.Object r1 = r2.f140711n
            kG.c r1 = (kG.C17497c) r1
            java.lang.Object r4 = r2.f140709l
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r4 = (com.sugarcube.decorate.v2.internal.manager.CompositionUpdater) r4
            java.lang.Object r4 = r2.f140708k
            kG.c r4 = (kG.C17497c) r4
            java.lang.Object r4 = r2.f140707j
            com.sugarcube.decorate_engine.SceneLayout r4 = (com.sugarcube.decorate_engine.SceneLayout) r4
            java.lang.Object r4 = r2.f140706i
            com.sugarcube.decorate_engine.SceneLayout r4 = (com.sugarcube.decorate_engine.SceneLayout) r4
            java.lang.Object r4 = r2.f140705h
            com.sugarcube.decorate_engine.SceneLayout r4 = (com.sugarcube.decorate_engine.SceneLayout) r4
            java.lang.Object r4 = r2.f140704g
            kotlin.jvm.internal.O r4 = (kotlin.jvm.internal.O) r4
            java.lang.Object r5 = r2.f140703f
            com.sugarcube.decorate_engine.SceneLayout r5 = (com.sugarcube.decorate_engine.SceneLayout) r5
            java.lang.Object r5 = r2.f140702e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r5 = r2.f140701d
            kG.c r5 = (kG.C17497c) r5
            java.lang.Object r2 = r2.f140700c
            ZG.a r2 = (ZG.C16994a) r2
            XH.y.b(r3)
            goto L_0x01d8
        L_0x0063:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x006b:
            int r1 = r2.f140712o
            java.lang.Object r4 = r2.f140710m
            java.lang.Object r5 = r2.f140709l
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r5 = (com.sugarcube.decorate.v2.internal.manager.CompositionUpdater) r5
            java.lang.Object r6 = r2.f140708k
            kG.c r6 = (kG.C17497c) r6
            java.lang.Object r7 = r2.f140707j
            com.sugarcube.decorate_engine.SceneLayout r7 = (com.sugarcube.decorate_engine.SceneLayout) r7
            java.lang.Object r8 = r2.f140706i
            com.sugarcube.decorate_engine.SceneLayout r8 = (com.sugarcube.decorate_engine.SceneLayout) r8
            java.lang.Object r13 = r2.f140705h
            com.sugarcube.decorate_engine.SceneLayout r13 = (com.sugarcube.decorate_engine.SceneLayout) r13
            java.lang.Object r14 = r2.f140704g
            kotlin.jvm.internal.O r14 = (kotlin.jvm.internal.O) r14
            java.lang.Object r15 = r2.f140703f
            com.sugarcube.decorate_engine.SceneLayout r15 = (com.sugarcube.decorate_engine.SceneLayout) r15
            java.lang.Object r11 = r2.f140702e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r10 = r2.f140701d
            kG.c r10 = (kG.C17497c) r10
            java.lang.Object r12 = r2.f140700c
            ZG.a r12 = (ZG.C16994a) r12
            XH.y.b(r3)
            r21 = r11
            r11 = r4
            r4 = r14
            r14 = r13
            r13 = r21
            goto L_0x0195
        L_0x00a3:
            int r1 = r2.f140712o
            java.lang.Object r4 = r2.f140709l
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r4 = (com.sugarcube.decorate.v2.internal.manager.CompositionUpdater) r4
            java.lang.Object r6 = r2.f140708k
            kG.c r6 = (kG.C17497c) r6
            java.lang.Object r7 = r2.f140707j
            com.sugarcube.decorate_engine.SceneLayout r7 = (com.sugarcube.decorate_engine.SceneLayout) r7
            java.lang.Object r8 = r2.f140706i
            com.sugarcube.decorate_engine.SceneLayout r8 = (com.sugarcube.decorate_engine.SceneLayout) r8
            java.lang.Object r10 = r2.f140705h
            com.sugarcube.decorate_engine.SceneLayout r10 = (com.sugarcube.decorate_engine.SceneLayout) r10
            java.lang.Object r11 = r2.f140704g
            kotlin.jvm.internal.O r11 = (kotlin.jvm.internal.O) r11
            java.lang.Object r12 = r2.f140703f
            com.sugarcube.decorate_engine.SceneLayout r12 = (com.sugarcube.decorate_engine.SceneLayout) r12
            java.lang.Object r13 = r2.f140702e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r2.f140701d
            kG.c r14 = (kG.C17497c) r14
            java.lang.Object r15 = r2.f140700c
            ZG.a r15 = (ZG.C16994a) r15
            XH.y.b(r3)
            r21 = r11
            r11 = r3
            r3 = r15
            r15 = r8
            r8 = r14
            r14 = r7
            r7 = r13
            r13 = r6
            r6 = r21
            r22 = r12
            r12 = r4
            r4 = r10
            r10 = r22
            goto L_0x014d
        L_0x00e3:
            java.lang.Object r1 = r2.f140702e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r4 = r2.f140701d
            kG.c r4 = (kG.C17497c) r4
            java.lang.Object r7 = r2.f140700c
            ZG.a r7 = (ZG.C16994a) r7
            XH.y.b(r3)
            r15 = r7
            goto L_0x0111
        L_0x00f4:
            XH.y.b(r3)
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManager r3 = r0.f140697a
            kG.a r4 = r24.i()
            r2.f140700c = r0
            r7 = r24
            r2.f140701d = r7
            r2.f140702e = r1
            r8 = 1
            r2.f140715r = r8
            java.lang.Object r3 = r3.saveSceneLayout(r4, r2)
            if (r3 != r9) goto L_0x010f
            return r9
        L_0x010f:
            r15 = r0
            r4 = r7
        L_0x0111:
            com.sugarcube.decorate_engine.SceneLayout r3 = (com.sugarcube.decorate_engine.SceneLayout) r3
            kotlin.jvm.internal.O r11 = new kotlin.jvm.internal.O
            r11.<init>()
            if (r3 == 0) goto L_0x01e7
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r7 = r15.f140698b
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManager r8 = r15.f140697a
            r2.f140700c = r15
            r2.f140701d = r4
            r2.f140702e = r1
            r2.f140703f = r3
            r2.f140704g = r11
            r2.f140705h = r3
            r2.f140706i = r3
            r2.f140707j = r3
            r2.f140708k = r4
            r2.f140709l = r7
            r10 = 0
            r2.f140712o = r10
            r2.f140715r = r6
            java.lang.Object r6 = r8.getModelMap(r2)
            if (r6 != r9) goto L_0x013e
            return r9
        L_0x013e:
            r14 = r3
            r8 = r4
            r13 = r8
            r12 = r7
            r7 = r1
            r4 = r14
            r1 = r10
            r3 = r15
            r10 = r4
            r15 = r10
            r21 = r11
            r11 = r6
            r6 = r21
        L_0x014d:
            r16 = r11
            java.util.HashMap r16 = (java.util.HashMap) r16
            r2.f140700c = r3
            r2.f140701d = r8
            r2.f140702e = r7
            r2.f140703f = r10
            r2.f140704g = r6
            r2.f140705h = r4
            r2.f140706i = r15
            r2.f140707j = r14
            r2.f140708k = r13
            r2.f140709l = r12
            r2.f140710m = r11
            r2.f140712o = r1
            r2.f140715r = r5
            r17 = 1
            r18 = r3
            r3 = r12
            r19 = r4
            r4 = r13
            r5 = r14
            r20 = r6
            r6 = r16
            r16 = r7
            r7 = r17
            r17 = r8
            r8 = r2
            java.lang.Object r3 = r3.updateDesign(r4, r5, r6, r7, r8)
            if (r3 != r9) goto L_0x0186
            return r9
        L_0x0186:
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r13 = r16
            r12 = r18
            r14 = r19
            r4 = r20
            r15 = r10
            r10 = r17
        L_0x0195:
            kG.c r3 = (kG.C17497c) r3
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManager r0 = r12.f140697a
            com.sugarcube.app.base.data.database.CachedCompiledComposition r16 = r3.c()
            com.sugarcube.core.network.models.Composition r16 = r16.getComposition()
            r17 = r9
            boolean r9 = r16.isLegacy2D()
            r16 = r0
            r0 = 1
            if (r9 == r0) goto L_0x01ad
            goto L_0x01ae
        L_0x01ad:
            r0 = 0
        L_0x01ae:
            r2.f140700c = r12
            r2.f140701d = r10
            r2.f140702e = r13
            r2.f140703f = r15
            r2.f140704g = r4
            r2.f140705h = r14
            r2.f140706i = r8
            r2.f140707j = r7
            r2.f140708k = r6
            r2.f140709l = r5
            r2.f140710m = r11
            r2.f140711n = r3
            r2.f140712o = r1
            r1 = 4
            r2.f140715r = r1
            r1 = r16
            java.lang.Object r0 = r1.saveCleanUp(r0, r2)
            r1 = r17
            if (r0 != r1) goto L_0x01d6
            return r1
        L_0x01d6:
            r1 = r3
            r2 = r12
        L_0x01d8:
            com.sugarcube.app.base.data.source.CompositionRepository r0 = r2.f140699c
            java.util.UUID r2 = r1.d()
            r0.setExplicitlySavedComposition(r2)
            MG.b$c r0 = MG.C16033b.c.f136230c
            r4.f144348a = r0
            r11 = r4
            goto L_0x01e8
        L_0x01e7:
            r1 = 0
        L_0x01e8:
            if (r1 == 0) goto L_0x01f8
            XH.x$a r0 = XH.x.f139812b
            XH.v r0 = new XH.v
            T r2 = r11.f144348a
            r0.<init>(r2, r1)
            java.lang.Object r0 = XH.x.b(r0)
            goto L_0x0209
        L_0x01f8:
            XH.x$a r0 = XH.x.f139812b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Couldn't save design."
            r0.<init>(r1)
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0209:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ZG.C16994a.m46savegIAlus(kG.c, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0168 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* renamed from: stashPendingDesign-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m47stashPendingDesign0E7RQCE(kG.C17497c r19, com.sugarcube.core.network.models.AuthType r20, dI.C17164e<? super XH.x<kG.C17497c>> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            boolean r3 = r2 instanceof ZG.C16994a.b
            if (r3 == 0) goto L_0x001a
            r3 = r2
            ZG.a$b r3 = (ZG.C16994a.b) r3
            int r4 = r3.f140732s
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.f140732s = r4
        L_0x0018:
            r9 = r3
            goto L_0x0020
        L_0x001a:
            ZG.a$b r3 = new ZG.a$b
            r3.<init>(r0, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r3 = r9.f140730q
            java.lang.Object r10 = eI.C17187b.f()
            int r4 = r9.f140732s
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x00d5
            if (r4 == r7) goto L_0x00b7
            if (r4 == r6) goto L_0x0071
            if (r4 != r5) goto L_0x0069
            java.lang.Object r1 = r9.f140727n
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r1 = (com.sugarcube.decorate.v2.internal.manager.CompositionUpdater) r1
            java.lang.Object r1 = r9.f140726m
            kG.c r1 = (kG.C17497c) r1
            java.lang.Object r1 = r9.f140725l
            com.sugarcube.decorate_engine.SceneLayout r1 = (com.sugarcube.decorate_engine.SceneLayout) r1
            java.lang.Object r1 = r9.f140724k
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            java.lang.Object r2 = r9.f140723j
            com.sugarcube.decorate_engine.SceneLayout r2 = (com.sugarcube.decorate_engine.SceneLayout) r2
            java.lang.Object r2 = r9.f140722i
            com.sugarcube.decorate_engine.SceneLayout r2 = (com.sugarcube.decorate_engine.SceneLayout) r2
            java.lang.Object r2 = r9.f140721h
            com.sugarcube.decorate_engine.SceneLayout r2 = (com.sugarcube.decorate_engine.SceneLayout) r2
            java.lang.Object r2 = r9.f140720g
            kotlin.jvm.internal.O r2 = (kotlin.jvm.internal.O) r2
            java.lang.Object r4 = r9.f140719f
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r4 = r9.f140718e
            com.sugarcube.core.network.models.AuthType r4 = (com.sugarcube.core.network.models.AuthType) r4
            java.lang.Object r5 = r9.f140717d
            kG.c r5 = (kG.C17497c) r5
            java.lang.Object r5 = r9.f140716c
            ZG.a r5 = (ZG.C16994a) r5
            XH.y.b(r3)
            r6 = r4
            goto L_0x016b
        L_0x0069:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0071:
            int r1 = r9.f140729p
            java.lang.Object r2 = r9.f140727n
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r2 = (com.sugarcube.decorate.v2.internal.manager.CompositionUpdater) r2
            java.lang.Object r4 = r9.f140726m
            kG.c r4 = (kG.C17497c) r4
            java.lang.Object r6 = r9.f140725l
            com.sugarcube.decorate_engine.SceneLayout r6 = (com.sugarcube.decorate_engine.SceneLayout) r6
            java.lang.Object r7 = r9.f140724k
            kotlin.jvm.internal.O r7 = (kotlin.jvm.internal.O) r7
            java.lang.Object r8 = r9.f140723j
            com.sugarcube.decorate_engine.SceneLayout r8 = (com.sugarcube.decorate_engine.SceneLayout) r8
            java.lang.Object r11 = r9.f140722i
            com.sugarcube.decorate_engine.SceneLayout r11 = (com.sugarcube.decorate_engine.SceneLayout) r11
            java.lang.Object r12 = r9.f140721h
            com.sugarcube.decorate_engine.SceneLayout r12 = (com.sugarcube.decorate_engine.SceneLayout) r12
            java.lang.Object r13 = r9.f140720g
            kotlin.jvm.internal.O r13 = (kotlin.jvm.internal.O) r13
            java.lang.Object r14 = r9.f140719f
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r9.f140718e
            com.sugarcube.core.network.models.AuthType r15 = (com.sugarcube.core.network.models.AuthType) r15
            java.lang.Object r5 = r9.f140717d
            kG.c r5 = (kG.C17497c) r5
            r19 = r1
            java.lang.Object r1 = r9.f140716c
            ZG.a r1 = (ZG.C16994a) r1
            XH.y.b(r3)
            r0 = r14
            r14 = r12
            r12 = r11
            r11 = r1
            r1 = r7
            r7 = r8
            r8 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r13
            r13 = r19
            goto L_0x013a
        L_0x00b7:
            java.lang.Object r1 = r9.f140720g
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            java.lang.Object r2 = r9.f140719f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r4 = r9.f140718e
            com.sugarcube.core.network.models.AuthType r4 = (com.sugarcube.core.network.models.AuthType) r4
            java.lang.Object r5 = r9.f140717d
            kG.c r5 = (kG.C17497c) r5
            java.lang.Object r7 = r9.f140716c
            ZG.a r7 = (ZG.C16994a) r7
            XH.y.b(r3)
            r17 = r3
            r3 = r1
            r1 = r5
            r5 = r17
            goto L_0x00fd
        L_0x00d5:
            XH.y.b(r3)
            kotlin.jvm.internal.O r3 = new kotlin.jvm.internal.O
            r3.<init>()
            r3.f144348a = r1
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManager r4 = r0.f140697a
            kG.a r5 = r19.i()
            r9.f140716c = r0
            r9.f140717d = r1
            r8 = r20
            r9.f140718e = r8
            r9.f140719f = r2
            r9.f140720g = r3
            r9.f140732s = r7
            java.lang.Object r4 = r4.saveSceneLayout(r5, r9)
            if (r4 != r10) goto L_0x00fa
            return r10
        L_0x00fa:
            r7 = r0
            r5 = r4
            r4 = r8
        L_0x00fd:
            r8 = r5
            com.sugarcube.decorate_engine.SceneLayout r8 = (com.sugarcube.decorate_engine.SceneLayout) r8
            if (r8 == 0) goto L_0x0188
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r5 = r7.f140698b
            T r11 = r3.f144348a
            kG.c r11 = (kG.C17497c) r11
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManager r12 = r7.f140697a
            r9.f140716c = r7
            r9.f140717d = r1
            r9.f140718e = r4
            r9.f140719f = r2
            r9.f140720g = r3
            r9.f140721h = r8
            r9.f140722i = r8
            r9.f140723j = r8
            r9.f140724k = r3
            r9.f140725l = r8
            r9.f140726m = r11
            r9.f140727n = r5
            r13 = 0
            r9.f140729p = r13
            r9.f140732s = r6
            java.lang.Object r6 = r12.getModelMap(r9)
            if (r6 != r10) goto L_0x012e
            return r10
        L_0x012e:
            r0 = r2
            r2 = r3
            r15 = r4
            r4 = r5
            r12 = r8
            r14 = r12
            r5 = r11
            r11 = r7
            r7 = r14
            r3 = r6
            r6 = r1
            r1 = r2
        L_0x013a:
            r16 = r3
            java.util.HashMap r16 = (java.util.HashMap) r16
            r9.f140716c = r11
            r9.f140717d = r6
            r9.f140718e = r15
            r9.f140719f = r0
            r9.f140720g = r2
            r9.f140721h = r14
            r9.f140722i = r12
            r9.f140723j = r7
            r9.f140724k = r1
            r9.f140725l = r8
            r9.f140726m = r5
            r9.f140727n = r4
            r9.f140728o = r3
            r9.f140729p = r13
            r0 = 3
            r9.f140732s = r0
            r0 = 0
            r6 = r8
            r7 = r16
            r8 = r0
            java.lang.Object r3 = r4.updateDesign(r5, r6, r7, r8, r9)
            if (r3 != r10) goto L_0x0169
            return r10
        L_0x0169:
            r5 = r11
            r6 = r15
        L_0x016b:
            r1.f144348a = r3
            com.sugarcube.app.base.data.source.CompositionRepository r0 = r5.f140699c
            com.sugarcube.app.base.data.model.PendingComposition r1 = new com.sugarcube.app.base.data.model.PendingComposition
            T r3 = r2.f144348a
            kG.c r3 = (kG.C17497c) r3
            com.sugarcube.app.base.data.database.CachedCompiledComposition r3 = r3.c()
            com.sugarcube.core.network.models.Composition r5 = r3.getComposition()
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            r0.setPendingComposition(r1)
            r3 = r2
        L_0x0188:
            XH.x$a r0 = XH.x.f139812b
            T r0 = r3.f144348a
            java.lang.Object r0 = XH.x.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ZG.C16994a.m47stashPendingDesign0E7RQCE(kG.c, com.sugarcube.core.network.models.AuthType, dI.e):java.lang.Object");
    }
}
