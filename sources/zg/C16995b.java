package ZG;

import JF.C13091M;
import OE.n;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.source.CompositionRepository;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.decorate.v2.internal.usecase.ShareDesignUseCase;
import dI.C17164e;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0011H@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LZG/b;", "Lcom/sugarcube/decorate/v2/internal/usecase/ShareDesignUseCase;", "Landroid/content/Context;", "context", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "compositionRepository", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "Lcom/sugarcube/app/base/external/config/a;", "config", "<init>", "(Landroid/content/Context;Lcom/sugarcube/app/base/data/source/CompositionRepository;Lcom/sugarcube/app/base/data/SceneRepository;Lcom/sugarcube/app/base/external/config/a;)V", "Lcom/sugarcube/core/network/models/Composition;", "composition", "Landroid/content/Intent;", "a", "(Lcom/sugarcube/core/network/models/Composition;)Landroid/content/Intent;", "Ljava/util/UUID;", "uuid", "Lcom/sugarcube/app/base/data/analytics/RoomSource;", "b", "(Ljava/util/UUID;)Lcom/sugarcube/app/base/data/analytics/RoomSource;", "compositionUuid", "invoke", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "c", "Lcom/sugarcube/app/base/data/SceneRepository;", "d", "Lcom/sugarcube/app/base/external/config/a;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZG.b  reason: case insensitive filesystem */
public final class C16995b implements ShareDesignUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final Context f140733a;

    /* renamed from: b  reason: collision with root package name */
    private final CompositionRepository f140734b;

    /* renamed from: c  reason: collision with root package name */
    private final SceneRepository f140735c;

    /* renamed from: d  reason: collision with root package name */
    private final com.sugarcube.app.base.external.config.a f140736d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.usecase.ShareDesignUseCaseImpl", f = "ShareDesignUseCase.kt", l = {40}, m = "invoke")
    /* renamed from: ZG.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f140737c;

        /* renamed from: d  reason: collision with root package name */
        Object f140738d;

        /* renamed from: e  reason: collision with root package name */
        Object f140739e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f140740f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C16995b f140741g;

        /* renamed from: h  reason: collision with root package name */
        int f140742h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16995b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f140741g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f140740f = obj;
            this.f140742h |= Integer.MIN_VALUE;
            return this.f140741g.invoke((UUID) null, this);
        }
    }

    public C16995b(Context context, CompositionRepository compositionRepository, SceneRepository sceneRepository, com.sugarcube.app.base.external.config.a aVar) {
        C17542s.j(context, "context");
        C17542s.j(compositionRepository, "compositionRepository");
        C17542s.j(sceneRepository, "sceneRepository");
        C17542s.j(aVar, "config");
        this.f140733a = context;
        this.f140734b = compositionRepository;
        this.f140735c = sceneRepository;
        this.f140736d = aVar;
    }

    private final Intent a(Composition composition) {
        Intent intent = new Intent();
        String displayName = composition.getDisplayName();
        if (displayName == null) {
            displayName = this.f140733a.getString(n.f113453s3);
            C17542s.i(displayName, "getString(...)");
        }
        intent.putExtra("SHARE_DESIGN_NAME", displayName);
        intent.putExtra("SHARE_DESIGN_ID", composition.getCompositionId());
        intent.putExtra("SHARE_DESIGN_UUID", composition.getCompositionUuid().toString());
        intent.putExtra("SHARE_ROOM_ID", composition.getSceneId());
        intent.putExtra("SHARE_ROOM_UUID", composition.getSceneUuid().toString());
        intent.putExtra("SHARE_ROOM_NAME", composition.getName());
        intent.putExtra("SHARE_ROOM_SOURCE", b(composition.getSceneUuid()));
        intent.putExtra("SHARE_REGION", this.f140736d.getRegion());
        intent.putExtra("SHARE_SOURCE", C13091M.DECORATE);
        PendingIntent broadcast = Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(this.f140733a, 0, intent, 201326592) : PendingIntent.getBroadcast(this.f140733a, 0, intent, 134217728);
        Intent intent2 = new Intent();
        intent2.setAction("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.TITLE", this.f140733a.getString(n.f113226J4));
        intent2.putExtra("android.intent.extra.SUBJECT", this.f140733a.getString(n.f113232K4));
        intent2.putExtra("android.intent.extra.TEXT", String.valueOf(composition.getShareUrl()));
        Intent createChooser = Intent.createChooser(intent2, (CharSequence) null, broadcast.getIntentSender());
        C17542s.i(createChooser, "createChooser(...)");
        return createChooser;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.lifecycle.F, androidx.lifecycle.K] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.sugarcube.app.base.data.analytics.RoomSource b(java.util.UUID r6) {
        /*
            r5 = this;
            com.sugarcube.app.base.data.SceneRepository r0 = r5.f140735c
            androidx.lifecycle.K r1 = r0.getShowrooms()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            if (r1 == 0) goto L_0x0035
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.sugarcube.core.network.models.Showroom r4 = (com.sugarcube.core.network.models.Showroom) r4
            java.util.UUID r4 = r4.getSceneUuid()
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
            if (r4 == 0) goto L_0x0015
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            com.sugarcube.core.network.models.Showroom r3 = (com.sugarcube.core.network.models.Showroom) r3
            if (r3 == 0) goto L_0x0035
            com.sugarcube.app.base.data.analytics.RoomSource r6 = com.sugarcube.app.base.data.analytics.RoomSource.Showroom
            return r6
        L_0x0035:
            androidx.lifecycle.F r0 = r0.getScenes()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x006c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0047:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.sugarcube.app.base.data.database.Scene r3 = (com.sugarcube.app.base.data.database.Scene) r3
            java.util.UUID r3 = r3.getSceneUuid()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
            if (r3 == 0) goto L_0x0047
            r2 = r1
        L_0x005f:
            com.sugarcube.app.base.data.database.Scene r2 = (com.sugarcube.app.base.data.database.Scene) r2
            if (r2 == 0) goto L_0x006c
            boolean r6 = r2.isStock()
            if (r6 == 0) goto L_0x006c
            com.sugarcube.app.base.data.analytics.RoomSource r6 = com.sugarcube.app.base.data.analytics.RoomSource.Stock
            return r6
        L_0x006c:
            com.sugarcube.app.base.data.analytics.RoomSource r6 = com.sugarcube.app.base.data.analytics.RoomSource.UserCaptured
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ZG.C16995b.b(java.util.UUID):com.sugarcube.app.base.data.analytics.RoomSource");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.util.UUID r9, dI.C17164e<? super android.content.Intent> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ZG.C16995b.a
            if (r0 == 0) goto L_0x0014
            r0 = r10
            ZG.b$a r0 = (ZG.C16995b.a) r0
            int r1 = r0.f140742h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f140742h = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            ZG.b$a r0 = new ZG.b$a
            r0.<init>(r8, r10)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r4.f140740f
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r4.f140742h
            r2 = 1
            if (r1 == 0) goto L_0x003f
            if (r1 != r2) goto L_0x0037
            java.lang.Object r9 = r4.f140739e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r4.f140738d
            java.util.UUID r9 = (java.util.UUID) r9
            java.lang.Object r9 = r4.f140737c
            ZG.b r9 = (ZG.C16995b) r9
            XH.y.b(r0)
            goto L_0x0058
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            XH.y.b(r0)
            com.sugarcube.app.base.data.source.CompositionRepository r1 = r8.f140734b
            r4.f140737c = r8
            r4.f140738d = r9
            r4.f140739e = r10
            r4.f140742h = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r9
            java.lang.Object r0 = com.sugarcube.app.base.data.source.CompositionRepositorySource.shareComposition$default(r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L_0x0057
            return r7
        L_0x0057:
            r9 = r8
        L_0x0058:
            com.sugarcube.app.base.data.Result r0 = (com.sugarcube.app.base.data.Result) r0
            boolean r10 = r0 instanceof com.sugarcube.app.base.data.Result.Success
            if (r10 == 0) goto L_0x006b
            com.sugarcube.app.base.data.Result$Success r0 = (com.sugarcube.app.base.data.Result.Success) r0
            java.lang.Object r10 = r0.getData()
            com.sugarcube.core.network.models.Composition r10 = (com.sugarcube.core.network.models.Composition) r10
            android.content.Intent r9 = r9.a(r10)
            return r9
        L_0x006b:
            boolean r9 = r0 instanceof com.sugarcube.app.base.data.Result.Error
            if (r9 == 0) goto L_0x0076
            com.sugarcube.app.base.data.Result$Error r0 = (com.sugarcube.app.base.data.Result.Error) r0
            java.lang.Throwable r9 = r0.getException()
            throw r9
        L_0x0076:
            XH.t r9 = new XH.t
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ZG.C16995b.invoke(java.util.UUID, dI.e):java.lang.Object");
    }
}
