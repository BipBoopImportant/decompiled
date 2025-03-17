package XF;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import android.content.Context;
import com.squareup.moshi.f;
import com.squareup.moshi.t;
import com.sugarcube.decorate.v1.internal.designpersistence.SceneTempStorage;
import com.sugarcube.decorate.v1.internal.domain.DesignState;
import dI.C17164e;
import eI.C17187b;
import jI.C17423j;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0018B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH@¢\u0006\u0004\b\u0016\u0010\u0010J\"\u0010\u0017\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH@¢\u0006\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002XD¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR8\u0010!\u001a&\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00110\u0011 \u001f*\u0012\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\u001e0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010 ¨\u0006#"}, d2 = {"LXF/a;", "Lcom/sugarcube/decorate/v1/internal/designpersistence/SceneTempStorage;", "Landroid/content/Context;", "context", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Landroid/content/Context;Lcom/squareup/moshi/t;)V", "Ljava/io/File;", "c", "()Ljava/io/File;", "Ljava/util/UUID;", "sceneUuid", "compositionUuid", "", "hasSavedState", "(Ljava/util/UUID;Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/decorate/v1/internal/domain/DesignState;", "obj", "LXH/N;", "saveObject", "(Lcom/sugarcube/decorate/v1/internal/domain/DesignState;LdI/e;)Ljava/lang/Object;", "loadObject", "cleanUp", "a", "Landroid/content/Context;", "", "b", "Ljava/lang/String;", "fileName", "Lcom/squareup/moshi/f;", "kotlin.jvm.PlatformType", "Lcom/squareup/moshi/f;", "adapter", "d", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XF.a  reason: case insensitive filesystem */
public final class C16785a implements SceneTempStorage {

    /* renamed from: d  reason: collision with root package name */
    public static final C3429a f139723d = new C3429a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f139724e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f139725a;

    /* renamed from: b  reason: collision with root package name */
    private final String f139726b = "temp_composition.json";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final f<DesignState> f139727c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LXF/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: XF.a$a  reason: collision with other inner class name */
    public static final class C3429a {
        public /* synthetic */ C3429a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3429a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.designpersistence.SceneTempStorageImpl$cleanUp$2", f = "SceneTempStorage.kt", l = {}, m = "invokeSuspend")
    /* renamed from: XF.a$b */
    static final class b extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f139728c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16785a f139729d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C16785a aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f139729d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f139729d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f139728c == 0) {
                y.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f139729d.c().delete());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.designpersistence.SceneTempStorageImpl", f = "SceneTempStorage.kt", l = {63}, m = "hasSavedState")
    /* renamed from: XF.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f139730c;

        /* renamed from: d  reason: collision with root package name */
        Object f139731d;

        /* renamed from: e  reason: collision with root package name */
        Object f139732e;

        /* renamed from: f  reason: collision with root package name */
        Object f139733f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f139734g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C16785a f139735h;

        /* renamed from: i  reason: collision with root package name */
        int f139736i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C16785a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f139735h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f139734g = obj;
            this.f139736i |= Integer.MIN_VALUE;
            return this.f139735h.hasSavedState((UUID) null, (UUID) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/sugarcube/decorate/v1/internal/domain/DesignState;", "<anonymous>", "(LQJ/Q;)Lcom/sugarcube/decorate/v1/internal/domain/DesignState;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.designpersistence.SceneTempStorageImpl$loadObject$2", f = "SceneTempStorage.kt", l = {}, m = "invokeSuspend")
    /* renamed from: XF.a$d */
    static final class d extends l implements p<Q, C17164e<? super DesignState>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f139737c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16785a f139738d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UUID f139739e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ UUID f139740f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C16785a aVar, UUID uuid, UUID uuid2, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f139738d = aVar;
            this.f139739e = uuid;
            this.f139740f = uuid2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f139738d, this.f139739e, this.f139740f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super DesignState> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            DesignState designState;
            C17187b.f();
            if (this.f139737c == 0) {
                y.b(obj);
                try {
                    File b10 = this.f139738d.c();
                    if (b10.exists() && (designState = (DesignState) this.f139738d.f139727c.fromJson(C17423j.i(b10, (Charset) null, 1, (Object) null))) != null && C17542s.e(designState.d(), this.f139739e) && C17542s.e(designState.a(), this.f139740f)) {
                        return designState;
                    }
                    return null;
                } catch (IOException unused) {
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public C16785a(Context context, t tVar) {
        C17542s.j(context, "context");
        C17542s.j(tVar, "moshi");
        this.f139725a = context;
        this.f139727c = tVar.c(DesignState.class);
    }

    /* access modifiers changed from: private */
    public final File c() {
        return new File(this.f139725a.getFilesDir(), this.f139726b);
    }

    public Object cleanUp(UUID uuid, UUID uuid2, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(C16311i0.b(), new b(this, (C17164e<? super b>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.util.UUID} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object hasSavedState(java.util.UUID r6, java.util.UUID r7, dI.C17164e<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof XF.C16785a.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            XF.a$c r0 = (XF.C16785a.c) r0
            int r1 = r0.f139736i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f139736i = r1
            goto L_0x0018
        L_0x0013:
            XF.a$c r0 = new XF.a$c
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f139734g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f139736i
            r4 = 1
            if (r3 == 0) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            java.lang.Object r6 = r0.f139733f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f139732e
            r7 = r6
            java.util.UUID r7 = (java.util.UUID) r7
            java.lang.Object r6 = r0.f139731d
            java.util.UUID r6 = (java.util.UUID) r6
            java.lang.Object r8 = r0.f139730c
            XF.a r8 = (XF.C16785a) r8
            XH.y.b(r1)
            goto L_0x0056
        L_0x003a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0042:
            XH.y.b(r1)
            r0.f139730c = r5
            r0.f139731d = r6
            r0.f139732e = r7
            r0.f139733f = r8
            r0.f139736i = r4
            java.lang.Object r1 = r5.loadObject(r6, r7, r0)
            if (r1 != r2) goto L_0x0056
            return r2
        L_0x0056:
            com.sugarcube.decorate.v1.internal.domain.DesignState r1 = (com.sugarcube.decorate.v1.internal.domain.DesignState) r1
            r8 = 0
            if (r1 == 0) goto L_0x0060
            java.util.UUID r0 = r1.d()
            goto L_0x0061
        L_0x0060:
            r0 = r8
        L_0x0061:
            if (r1 == 0) goto L_0x0067
            java.util.UUID r8 = r1.a()
        L_0x0067:
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r0)
            if (r6 == 0) goto L_0x0074
            boolean r6 = kotlin.jvm.internal.C17542s.e(r7, r8)
            if (r6 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: XF.C16785a.hasSavedState(java.util.UUID, java.util.UUID, dI.e):java.lang.Object");
    }

    public Object loadObject(UUID uuid, UUID uuid2, C17164e<? super DesignState> eVar) {
        return C16310i.g(C16311i0.b(), new d(this, uuid, uuid2, (C17164e<? super d>) null), eVar);
    }

    public Object saveObject(DesignState designState, C17164e<? super C16807N> eVar) {
        try {
            File c10 = c();
            String json = this.f139727c.toJson(designState);
            C17542s.i(json, "toJson(...)");
            C17423j.l(c10, json, (Charset) null, 2, (Object) null);
        } catch (IOException unused) {
        }
        return C16807N.f139792a;
    }
}
