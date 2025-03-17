package nt;

import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.b1;
import TJ.C16532g;
import TJ.C16533h;
import W2.f;
import XH.C16807N;
import XH.y;
import android.content.Context;
import dI.C17164e;
import eI.C17187b;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H@¢\u0006\u0004\b\u000e\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H@¢\u0006\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u001c"}, d2 = {"Lnt/c;", "Lnt/a;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "", "enabled", "LXH/N;", "d", "(ZLdI/e;)Ljava/lang/Object;", "f", "seen", "h", "g", "a", "LR2/h;", "LTJ/g;", "b", "LTJ/g;", "c", "()LTJ/g;", "storeModeEnabledFlow", "hasStoreModeBeenEnabledFlow", "e", "hasUserSeenStoreModeBadgeFlow", "hasNearbyStoreDialogBeenSeenFlow", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements C11674a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f100099f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final f.a<Boolean> f100100g = W2.h.a("has_store_mode_been_enabled");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final f.a<Boolean> f100101h = W2.h.a("store_mode_enabled");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final f.a<Boolean> f100102i = W2.h.a("store_mode_badge_seen");
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final f.a<Boolean> f100103j = W2.h.a("nearby_store_dialog_Seen");

    /* renamed from: a  reason: collision with root package name */
    private final R2.h<W2.f> f100104a;

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<Boolean> f100105b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<Boolean> f100106c;

    /* renamed from: d  reason: collision with root package name */
    private final C16532g<Boolean> f100107d;

    /* renamed from: e  reason: collision with root package name */
    private final C16532g<Boolean> f100108e;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lnt/c$a;", "", "<init>", "()V", "", "fileName", "Landroid/content/Context;", "applicationContext", "LQJ/M;", "ioDispatcher", "LQJ/Q;", "scope", "LR2/h;", "LW2/f;", "c", "(Ljava/lang/String;Landroid/content/Context;LQJ/M;LQJ/Q;)LR2/h;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "FILE_NAME", "Ljava/lang/String;", "LW2/f$a;", "", "HAS_STORE_MODE_BEEN_ENABLED", "LW2/f$a;", "STORE_MODE_ENABLED", "STORE_MODE_BADGE_SEEN", "NEARBY_STORE_DIALOG_SEEN", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final R2.h<W2.f> c(String str, Context context, M m10, Q q10) {
            return W2.e.c(W2.e.f14655a, (S2.b) null, (List) null, q10, new C11675b(context, str), 3, (Object) null);
        }

        static /* synthetic */ R2.h d(a aVar, String str, Context context, M m10, Q q10, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                q10 = S.a(m10.plus(b1.b((F0) null, 1, (Object) null)));
            }
            return aVar.c(str, context, m10, q10);
        }

        /* access modifiers changed from: private */
        public static final File e(Context context, String str) {
            return V2.b.a(context, str);
        }

        public final R2.h<W2.f> b(Context context, M m10) {
            C17542s.j(context, "applicationContext");
            C17542s.j(m10, "ioDispatcher");
            return d(this, "store_mode", context, m10, (Q) null, 8, (Object) null);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.storemode.repository.StoreModeLocalDataSourceImpl$setHasNearbyStoreDialogBeenSeen$2", f = "StoreModeLocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100109c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f100110d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f100111e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f100111e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f100111e, eVar);
            bVar.f100110d = obj;
            return bVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((b) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f100109c == 0) {
                y.b(obj);
                ((W2.c) this.f100110d).j(c.f100103j, kotlin.coroutines.jvm.internal.b.a(this.f100111e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.storemode.repository.StoreModeLocalDataSourceImpl$setHasStoreModeBeenEnabled$2", f = "StoreModeLocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nt.c$c  reason: collision with other inner class name */
    static final class C2317c extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100112c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f100113d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f100114e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2317c(boolean z10, C17164e<? super C2317c> eVar) {
            super(2, eVar);
            this.f100114e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2317c cVar = new C2317c(this.f100114e, eVar);
            cVar.f100113d = obj;
            return cVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((C2317c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f100112c == 0) {
                y.b(obj);
                ((W2.c) this.f100113d).j(c.f100100g, kotlin.coroutines.jvm.internal.b.a(this.f100114e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.storemode.repository.StoreModeLocalDataSourceImpl$setHasUserSeenStoreModeBadge$2", f = "StoreModeLocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100115c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f100116d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f100117e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f100117e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f100117e, eVar);
            dVar.f100116d = obj;
            return dVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((d) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f100115c == 0) {
                y.b(obj);
                ((W2.c) this.f100116d).j(c.f100102i, kotlin.coroutines.jvm.internal.b.a(this.f100117e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.storemode.repository.StoreModeLocalDataSourceImpl", f = "StoreModeLocalDataSourceImpl.kt", l = {30, 32}, m = "setStoreModeEnabled")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f100118c;

        /* renamed from: d  reason: collision with root package name */
        Object f100119d;

        /* renamed from: e  reason: collision with root package name */
        boolean f100120e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f100121f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f100122g;

        /* renamed from: h  reason: collision with root package name */
        int f100123h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f100122g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f100121f = obj;
            this.f100123h |= Integer.MIN_VALUE;
            return this.f100122g.d(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.storemode.repository.StoreModeLocalDataSourceImpl$setStoreModeEnabled$2", f = "StoreModeLocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class f extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100124c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f100125d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f100126e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(boolean z10, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f100126e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f100126e, eVar);
            fVar.f100125d = obj;
            return fVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((f) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f100124c == 0) {
                y.b(obj);
                ((W2.c) this.f100125d).j(c.f100101h, kotlin.coroutines.jvm.internal.b.a(this.f100126e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100127a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100128a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.storemode.repository.StoreModeLocalDataSourceImpl$special$$inlined$map$1$2", f = "StoreModeLocalDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: nt.c$g$a$a  reason: collision with other inner class name */
            public static final class C2318a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100129c;

                /* renamed from: d  reason: collision with root package name */
                int f100130d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f100131e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2318a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100131e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100129c = obj;
                    this.f100130d |= Integer.MIN_VALUE;
                    return this.f100131e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f100128a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof nt.c.g.a.C2318a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    nt.c$g$a$a r0 = (nt.c.g.a.C2318a) r0
                    int r1 = r0.f100130d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100130d = r1
                    goto L_0x0018
                L_0x0013:
                    nt.c$g$a$a r0 = new nt.c$g$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f100129c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100130d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f100128a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = nt.c.f100101h
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = 0
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f100130d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: nt.c.g.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public g(C16532g gVar) {
            this.f100127a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100127a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100132a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100133a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.storemode.repository.StoreModeLocalDataSourceImpl$special$$inlined$map$2$2", f = "StoreModeLocalDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: nt.c$h$a$a  reason: collision with other inner class name */
            public static final class C2319a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100134c;

                /* renamed from: d  reason: collision with root package name */
                int f100135d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f100136e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2319a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100136e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100134c = obj;
                    this.f100135d |= Integer.MIN_VALUE;
                    return this.f100136e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f100133a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof nt.c.h.a.C2319a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    nt.c$h$a$a r0 = (nt.c.h.a.C2319a) r0
                    int r1 = r0.f100135d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100135d = r1
                    goto L_0x0018
                L_0x0013:
                    nt.c$h$a$a r0 = new nt.c$h$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f100134c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100135d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f100133a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = nt.c.f100100g
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = 0
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f100135d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: nt.c.h.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public h(C16532g gVar) {
            this.f100132a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100132a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100137a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100138a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.storemode.repository.StoreModeLocalDataSourceImpl$special$$inlined$map$3$2", f = "StoreModeLocalDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: nt.c$i$a$a  reason: collision with other inner class name */
            public static final class C2320a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100139c;

                /* renamed from: d  reason: collision with root package name */
                int f100140d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f100141e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2320a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100141e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100139c = obj;
                    this.f100140d |= Integer.MIN_VALUE;
                    return this.f100141e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f100138a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof nt.c.i.a.C2320a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    nt.c$i$a$a r0 = (nt.c.i.a.C2320a) r0
                    int r1 = r0.f100140d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100140d = r1
                    goto L_0x0018
                L_0x0013:
                    nt.c$i$a$a r0 = new nt.c$i$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f100139c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100140d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f100138a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = nt.c.f100102i
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = 0
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f100140d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: nt.c.i.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public i(C16532g gVar) {
            this.f100137a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100137a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100142a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100143a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.storemode.repository.StoreModeLocalDataSourceImpl$special$$inlined$map$4$2", f = "StoreModeLocalDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: nt.c$j$a$a  reason: collision with other inner class name */
            public static final class C2321a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100144c;

                /* renamed from: d  reason: collision with root package name */
                int f100145d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f100146e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2321a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100146e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100144c = obj;
                    this.f100145d |= Integer.MIN_VALUE;
                    return this.f100146e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f100143a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof nt.c.j.a.C2321a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    nt.c$j$a$a r0 = (nt.c.j.a.C2321a) r0
                    int r1 = r0.f100145d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100145d = r1
                    goto L_0x0018
                L_0x0013:
                    nt.c$j$a$a r0 = new nt.c$j$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f100144c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100145d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f100143a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = nt.c.f100103j
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = 0
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f100145d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: nt.c.j.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public j(C16532g gVar) {
            this.f100142a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100142a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public c(R2.h<W2.f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f100104a = hVar;
        this.f100105b = new g(hVar.getData());
        this.f100106c = new h(hVar.getData());
        this.f100107d = new i(hVar.getData());
        this.f100108e = new j(hVar.getData());
    }

    public C16532g<Boolean> a() {
        return this.f100108e;
    }

    public C16532g<Boolean> b() {
        return this.f100106c;
    }

    public C16532g<Boolean> c() {
        return this.f100105b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(boolean r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof nt.c.e
            if (r0 == 0) goto L_0x0013
            r0 = r9
            nt.c$e r0 = (nt.c.e) r0
            int r1 = r0.f100123h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f100123h = r1
            goto L_0x0018
        L_0x0013:
            nt.c$e r0 = new nt.c$e
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f100121f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f100123h
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x004a
            if (r3 == r5) goto L_0x003c
            if (r3 != r4) goto L_0x0034
            java.lang.Object r8 = r0.f100119d
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f100118c
            nt.c r8 = (nt.c) r8
            XH.y.b(r1)
            goto L_0x0076
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            boolean r8 = r0.f100120e
            java.lang.Object r9 = r0.f100119d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r3 = r0.f100118c
            nt.c r3 = (nt.c) r3
            XH.y.b(r1)
            goto L_0x005f
        L_0x004a:
            XH.y.b(r1)
            if (r8 == 0) goto L_0x005e
            r0.f100118c = r7
            r0.f100119d = r9
            r0.f100120e = r8
            r0.f100123h = r5
            java.lang.Object r1 = r7.f(r5, r0)
            if (r1 != r2) goto L_0x005e
            return r2
        L_0x005e:
            r3 = r7
        L_0x005f:
            R2.h<W2.f> r1 = r3.f100104a
            nt.c$f r5 = new nt.c$f
            r6 = 0
            r5.<init>(r8, r6)
            r0.f100118c = r3
            r0.f100119d = r9
            r0.f100120e = r8
            r0.f100123h = r4
            java.lang.Object r8 = W2.i.a(r1, r5, r0)
            if (r8 != r2) goto L_0x0076
            return r2
        L_0x0076:
            XH.N r8 = XH.C16807N.f139792a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nt.c.d(boolean, dI.e):java.lang.Object");
    }

    public C16532g<Boolean> e() {
        return this.f100107d;
    }

    public Object f(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f100104a, new C2317c(z10, (C17164e<? super C2317c>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Object g(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f100104a, new b(z10, (C17164e<? super b>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Object h(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f100104a, new d(z10, (C17164e<? super d>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
