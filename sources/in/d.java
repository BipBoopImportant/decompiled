package in;

import QJ.F0;
import QJ.M;
import QJ.S;
import QJ.b1;
import TJ.C16532g;
import TJ.C16533h;
import V2.i;
import W2.f;
import W2.h;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import YH.g0;
import android.content.Context;
import android.content.SharedPreferences;
import dI.C17164e;
import eI.C17187b;
import hn.C11371b;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007H@¢\u0006\u0004\b\u000e\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007H@¢\u0006\u0004\b\u0010\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lin/d;", "Lhn/b;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "", "c", "(LdI/e;)Ljava/lang/Object;", "hasHadBrowseRecommendations", "LXH/N;", "d", "(ZLdI/e;)Ljava/lang/Object;", "b", "hasAppBeenUpdated", "a", "LR2/h;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements C11371b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f98415b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final f.a<Boolean> f98416c = h.a("has_had_browse_recommendations");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final f.a<Boolean> f98417d = h.a("has_app_been_updated_from_in_app_updates");

    /* renamed from: a  reason: collision with root package name */
    private final R2.h<W2.f> f98418a;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lin/d$a;", "", "<init>", "()V", "", "fileName", "Landroid/content/Context;", "applicationContext", "LQJ/M;", "dispatcher", "LR2/h;", "LW2/f;", "d", "(Ljava/lang/String;Landroid/content/Context;LQJ/M;)LR2/h;", "c", "(Landroid/content/Context;LQJ/M;)LR2/h;", "DATA_STORE_FILE_NAME", "Ljava/lang/String;", "HAS_APP_BEEN_UPDATED_FROM_IN_APP_UPDATES", "HAS_HAD_BROWSE_RECOMMENDATIONS", "LW2/f$a;", "", "KEY_HAS_HAD_BROWSE_RECOMMENDATIONS", "LW2/f$a;", "KEY_APP_BEEN_UPDATED_FROM_IN_APP_UPDATES", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final R2.h<W2.f> d(String str, Context context, M m10) {
            return W2.e.c(W2.e.f14655a, (S2.b) null, C16877v.e(i.a(new b(context), g0.h("has_had_browse_recommendations", "has_app_been_updated_from_in_app_updates"))), S.a(m10.plus(b1.b((F0) null, 1, (Object) null))), new c(context, str), 1, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final SharedPreferences e(Context context) {
            SharedPreferences a10 = G4.b.a(context);
            C17542s.i(a10, "getDefaultSharedPreferences(...)");
            return a10;
        }

        /* access modifiers changed from: private */
        public static final File f(Context context, String str) {
            return V2.b.a(context, str);
        }

        public final R2.h<W2.f> c(Context context, M m10) {
            C17542s.j(context, "applicationContext");
            C17542s.j(m10, "dispatcher");
            return d("browse_data_store", context, m10);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f98419a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f98420a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.browse.datalayer.impl.BrowseDataSourceImpl$hasAppBeenUpdatedFromInAppUpdates$$inlined$map$1$2", f = "BrowseDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: in.d$b$a$a  reason: collision with other inner class name */
            public static final class C2221a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f98421c;

                /* renamed from: d  reason: collision with root package name */
                int f98422d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f98423e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2221a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f98423e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f98421c = obj;
                    this.f98422d |= Integer.MIN_VALUE;
                    return this.f98423e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f98420a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof in.d.b.a.C2221a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    in.d$b$a$a r0 = (in.d.b.a.C2221a) r0
                    int r1 = r0.f98422d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f98422d = r1
                    goto L_0x0018
                L_0x0013:
                    in.d$b$a$a r0 = new in.d$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f98421c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f98422d
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
                    TJ.h r6 = r4.f98420a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = in.d.f98417d
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = 0
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f98422d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: in.d.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f98419a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f98419a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.browse.datalayer.impl.BrowseDataSourceImpl", f = "BrowseDataSourceImpl.kt", l = {42}, m = "hasAppBeenUpdatedFromInAppUpdates")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f98424c;

        /* renamed from: d  reason: collision with root package name */
        Object f98425d;

        /* renamed from: e  reason: collision with root package name */
        Object f98426e;

        /* renamed from: f  reason: collision with root package name */
        Object f98427f;

        /* renamed from: g  reason: collision with root package name */
        int f98428g;

        /* renamed from: h  reason: collision with root package name */
        int f98429h;

        /* renamed from: i  reason: collision with root package name */
        int f98430i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f98431j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ d f98432k;

        /* renamed from: l  reason: collision with root package name */
        int f98433l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f98432k = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f98431j = obj;
            this.f98433l |= Integer.MIN_VALUE;
            return this.f98432k.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.d$d  reason: collision with other inner class name */
    public static final class C2222d implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f98434a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: in.d$d$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f98435a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.browse.datalayer.impl.BrowseDataSourceImpl$hasHadBrowseRecommendations$$inlined$map$1$2", f = "BrowseDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: in.d$d$a$a  reason: collision with other inner class name */
            public static final class C2223a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f98436c;

                /* renamed from: d  reason: collision with root package name */
                int f98437d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f98438e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2223a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f98438e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f98436c = obj;
                    this.f98437d |= Integer.MIN_VALUE;
                    return this.f98438e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f98435a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof in.d.C2222d.a.C2223a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    in.d$d$a$a r0 = (in.d.C2222d.a.C2223a) r0
                    int r1 = r0.f98437d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f98437d = r1
                    goto L_0x0018
                L_0x0013:
                    in.d$d$a$a r0 = new in.d$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f98436c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f98437d
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
                    TJ.h r6 = r4.f98435a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = in.d.f98416c
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = 0
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f98437d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: in.d.C2222d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2222d(C16532g gVar) {
            this.f98434a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f98434a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.browse.datalayer.impl.BrowseDataSourceImpl", f = "BrowseDataSourceImpl.kt", l = {32}, m = "hasHadBrowseRecommendations")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f98439c;

        /* renamed from: d  reason: collision with root package name */
        Object f98440d;

        /* renamed from: e  reason: collision with root package name */
        Object f98441e;

        /* renamed from: f  reason: collision with root package name */
        Object f98442f;

        /* renamed from: g  reason: collision with root package name */
        int f98443g;

        /* renamed from: h  reason: collision with root package name */
        int f98444h;

        /* renamed from: i  reason: collision with root package name */
        int f98445i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f98446j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ d f98447k;

        /* renamed from: l  reason: collision with root package name */
        int f98448l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f98447k = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f98446j = obj;
            this.f98448l |= Integer.MIN_VALUE;
            return this.f98447k.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.browse.datalayer.impl.BrowseDataSourceImpl$setHasAppBeenUpdatedFromInAppUpdates$2", f = "BrowseDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class f extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98449c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f98450d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f98451e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(boolean z10, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f98451e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f98451e, eVar);
            fVar.f98450d = obj;
            return fVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((f) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f98449c == 0) {
                y.b(obj);
                ((W2.c) this.f98450d).j(d.f98417d, kotlin.coroutines.jvm.internal.b.a(this.f98451e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.browse.datalayer.impl.BrowseDataSourceImpl$setHasHadBrowseRecommendations$2", f = "BrowseDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class g extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98452c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f98453d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f98454e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(boolean z10, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f98454e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f98454e, eVar);
            gVar.f98453d = obj;
            return gVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((g) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f98452c == 0) {
                y.b(obj);
                ((W2.c) this.f98453d).j(d.f98416c, kotlin.coroutines.jvm.internal.b.a(this.f98454e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public d(R2.h<W2.f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f98418a = hVar;
    }

    public Object a(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f98418a, new f(z10, (C17164e<? super f>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof in.d.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            in.d$c r0 = (in.d.c) r0
            int r1 = r0.f98433l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f98433l = r1
            goto L_0x0018
        L_0x0013:
            in.d$c r0 = new in.d$c
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f98431j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f98433l
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            java.lang.Object r7 = r0.f98427f
            TJ.g r7 = (TJ.C16532g) r7
            java.lang.Object r7 = r0.f98426e
            TJ.g r7 = (TJ.C16532g) r7
            java.lang.Object r7 = r0.f98425d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f98424c
            in.d r7 = (in.d) r7
            XH.y.b(r1)
            goto L_0x0067
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0042:
            XH.y.b(r1)
            R2.h<W2.f> r1 = r6.f98418a
            TJ.g r1 = r1.getData()
            in.d$b r3 = new in.d$b
            r3.<init>(r1)
            r0.f98424c = r6
            r0.f98425d = r7
            r0.f98426e = r1
            r0.f98427f = r1
            r0.f98428g = r5
            r0.f98429h = r5
            r0.f98430i = r5
            r0.f98433l = r4
            java.lang.Object r1 = TJ.C16534i.D(r3, r0)
            if (r1 != r2) goto L_0x0067
            return r2
        L_0x0067:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x006f
            boolean r5 = r1.booleanValue()
        L_0x006f:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: in.d.b(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof in.d.e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            in.d$e r0 = (in.d.e) r0
            int r1 = r0.f98448l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f98448l = r1
            goto L_0x0018
        L_0x0013:
            in.d$e r0 = new in.d$e
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f98446j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f98448l
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            java.lang.Object r7 = r0.f98442f
            TJ.g r7 = (TJ.C16532g) r7
            java.lang.Object r7 = r0.f98441e
            TJ.g r7 = (TJ.C16532g) r7
            java.lang.Object r7 = r0.f98440d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f98439c
            in.d r7 = (in.d) r7
            XH.y.b(r1)
            goto L_0x0067
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0042:
            XH.y.b(r1)
            R2.h<W2.f> r1 = r6.f98418a
            TJ.g r1 = r1.getData()
            in.d$d r3 = new in.d$d
            r3.<init>(r1)
            r0.f98439c = r6
            r0.f98440d = r7
            r0.f98441e = r1
            r0.f98442f = r1
            r0.f98443g = r5
            r0.f98444h = r5
            r0.f98445i = r5
            r0.f98448l = r4
            java.lang.Object r1 = TJ.C16534i.D(r3, r0)
            if (r1 != r2) goto L_0x0067
            return r2
        L_0x0067:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x006f
            boolean r5 = r1.booleanValue()
        L_0x006f:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: in.d.c(dI.e):java.lang.Object");
    }

    public Object d(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f98418a, new g(z10, (C17164e<? super g>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
