package xp;

import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.b1;
import R2.h;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import W2.c;
import W2.f;
import W2.i;
import XH.C16807N;
import XH.y;
import android.content.Context;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import up.C12071a;
import up.C12072b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0013H@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007H@¢\u0006\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lxp/c;", "Lxp/a;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "LXH/N;", "c", "(LdI/e;)Ljava/lang/Object;", "", "b", "()Z", "Lup/a;", "consentKey", "LTJ/g;", "Lup/b;", "d", "(Lup/a;)LTJ/g;", "", "consents", "e", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "a", "LR2/h;", "dataconsent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xp.c  reason: case insensitive filesystem */
public final class C12330c implements C12328a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f106177b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h<W2.f> f106178a;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lxp/c$a;", "", "<init>", "()V", "", "fileName", "Landroid/content/Context;", "applicationContext", "LQJ/M;", "dispatcher", "LR2/h;", "LW2/f;", "c", "(Ljava/lang/String;Landroid/content/Context;LQJ/M;)LR2/h;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "DATA_STORE_FILE_NAME", "Ljava/lang/String;", "CONSENT_SUBMITTED", "dataconsent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xp.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final h<W2.f> c(String str, Context context, M m10) {
            return W2.e.c(W2.e.f14655a, (S2.b) null, (List) null, S.a(m10.plus(b1.b((F0) null, 1, (Object) null))), new C12329b(context, str), 3, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final File d(Context context, String str) {
            return V2.b.a(context, str);
        }

        public final h<W2.f> b(Context context, M m10) {
            C17542s.j(context, "applicationContext");
            C17542s.j(m10, "dispatcher");
            return c("user_consent", context, m10);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "it", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.dataconsent.impl.repository.datasource.UserConsentLocalDataSourceImpl$clear$2", f = "UserConsentLocalDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: xp.c$b */
    static final class b extends l implements p<c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106179c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f106180d;

        b(C17164e<? super b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f106180d = obj;
            return bVar;
        }

        public final Object invoke(c cVar, C17164e<? super C16807N> eVar) {
            return ((b) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f106179c == 0) {
                y.b(obj);
                ((c) this.f106180d).f();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xp.c$c  reason: collision with other inner class name */
    public static final class C2525c implements C16532g<C12072b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f106181a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C12071a f106182b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f.a f106183c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xp.c$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f106184a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C12071a f106185b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ f.a f106186c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.dataconsent.impl.repository.datasource.UserConsentLocalDataSourceImpl$getConsent$$inlined$map$1$2", f = "UserConsentLocalDataSource.kt", l = {50}, m = "emit")
            /* renamed from: xp.c$c$a$a  reason: collision with other inner class name */
            public static final class C2526a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f106187c;

                /* renamed from: d  reason: collision with root package name */
                int f106188d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f106189e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2526a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f106189e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f106187c = obj;
                    this.f106188d |= Integer.MIN_VALUE;
                    return this.f106189e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C12071a aVar, f.a aVar2) {
                this.f106184a = hVar;
                this.f106185b = aVar;
                this.f106186c = aVar2;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof xp.C12330c.C2525c.a.C2526a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    xp.c$c$a$a r0 = (xp.C12330c.C2525c.a.C2526a) r0
                    int r1 = r0.f106188d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f106188d = r1
                    goto L_0x0018
                L_0x0013:
                    xp.c$c$a$a r0 = new xp.c$c$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f106187c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f106188d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x005d
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f106184a
                    W2.f r7 = (W2.f) r7
                    up.b r2 = new up.b
                    up.a r4 = r6.f106185b
                    W2.f$a r5 = r6.f106186c
                    java.lang.Object r7 = r7.b(r5)
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    if (r7 == 0) goto L_0x004b
                    boolean r7 = r7.booleanValue()
                    goto L_0x0051
                L_0x004b:
                    up.a r7 = r6.f106185b
                    boolean r7 = r7.a()
                L_0x0051:
                    r2.<init>(r4, r7)
                    r0.f106188d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: xp.C12330c.C2525c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2525c(C16532g gVar, C12071a aVar, f.a aVar2) {
            this.f106181a = gVar;
            this.f106182b = aVar;
            this.f106183c = aVar2;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f106181a.collect(new a(hVar, this.f106182b, this.f106183c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.dataconsent.impl.repository.datasource.UserConsentLocalDataSourceImpl$isConsentSubmitted$1", f = "UserConsentLocalDataSource.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: xp.c$d */
    static final class d extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f106190c;

        /* renamed from: d  reason: collision with root package name */
        Object f106191d;

        /* renamed from: e  reason: collision with root package name */
        Object f106192e;

        /* renamed from: f  reason: collision with root package name */
        int f106193f;

        /* renamed from: g  reason: collision with root package name */
        int f106194g;

        /* renamed from: h  reason: collision with root package name */
        int f106195h;

        /* renamed from: i  reason: collision with root package name */
        int f106196i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C12330c f106197j;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xp.c$d$a */
        public static final class a implements C16532g<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f106198a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f.a f106199b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: xp.c$d$a$a  reason: collision with other inner class name */
            public static final class C2527a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f106200a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ f.a f106201b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.dataconsent.impl.repository.datasource.UserConsentLocalDataSourceImpl$isConsentSubmitted$1$invokeSuspend$$inlined$map$1$2", f = "UserConsentLocalDataSource.kt", l = {50}, m = "emit")
                /* renamed from: xp.c$d$a$a$a  reason: collision with other inner class name */
                public static final class C2528a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f106202c;

                    /* renamed from: d  reason: collision with root package name */
                    int f106203d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C2527a f106204e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C2528a(C2527a aVar, C17164e eVar) {
                        super(eVar);
                        this.f106204e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f106202c = obj;
                        this.f106203d |= Integer.MIN_VALUE;
                        return this.f106204e.emit((Object) null, this);
                    }
                }

                public C2527a(C16533h hVar, f.a aVar) {
                    this.f106200a = hVar;
                    this.f106201b = aVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof xp.C12330c.d.a.C2527a.C2528a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        xp.c$d$a$a$a r0 = (xp.C12330c.d.a.C2527a.C2528a) r0
                        int r1 = r0.f106203d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f106203d = r1
                        goto L_0x0018
                    L_0x0013:
                        xp.c$d$a$a$a r0 = new xp.c$d$a$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f106202c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f106203d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r6)
                        goto L_0x0047
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        XH.y.b(r6)
                        TJ.h r6 = r4.f106200a
                        W2.f r5 = (W2.f) r5
                        W2.f$a r2 = r4.f106201b
                        java.lang.Object r5 = r5.b(r2)
                        r0.f106203d = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x0047
                        return r1
                    L_0x0047:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: xp.C12330c.d.a.C2527a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public a(C16532g gVar, f.a aVar) {
                this.f106198a = gVar;
                this.f106199b = aVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f106198a.collect(new C2527a(hVar, this.f106199b), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xp.c$d$b */
        public static final class b implements C16532g<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f106205a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: xp.c$d$b$a */
            public static final class a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f106206a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.dataconsent.impl.repository.datasource.UserConsentLocalDataSourceImpl$isConsentSubmitted$1$invokeSuspend$$inlined$map$2$2", f = "UserConsentLocalDataSource.kt", l = {50}, m = "emit")
                /* renamed from: xp.c$d$b$a$a  reason: collision with other inner class name */
                public static final class C2529a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f106207c;

                    /* renamed from: d  reason: collision with root package name */
                    int f106208d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ a f106209e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C2529a(a aVar, C17164e eVar) {
                        super(eVar);
                        this.f106209e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f106207c = obj;
                        this.f106208d |= Integer.MIN_VALUE;
                        return this.f106209e.emit((Object) null, this);
                    }
                }

                public a(C16533h hVar) {
                    this.f106206a = hVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof xp.C12330c.d.b.a.C2529a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        xp.c$d$b$a$a r0 = (xp.C12330c.d.b.a.C2529a) r0
                        int r1 = r0.f106208d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f106208d = r1
                        goto L_0x0018
                    L_0x0013:
                        xp.c$d$b$a$a r0 = new xp.c$d$b$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f106207c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f106208d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r6)
                        goto L_0x004a
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        XH.y.b(r6)
                        TJ.h r6 = r4.f106206a
                        java.lang.Boolean r5 = (java.lang.Boolean) r5
                        if (r5 == 0) goto L_0x003c
                        r5 = r3
                        goto L_0x003d
                    L_0x003c:
                        r5 = 0
                    L_0x003d:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.f106208d = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x004a
                        return r1
                    L_0x004a:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: xp.C12330c.d.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public b(C16532g gVar) {
                this.f106205a = gVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f106205a.collect(new a(hVar), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C12330c cVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f106197j = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f106197j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f106196i;
            if (i10 == 0) {
                y.b(obj);
                f.a<Boolean> a10 = W2.h.a("consent_submitted_v1");
                a aVar = new a(this.f106197j.f106178a.getData(), a10);
                b bVar = new b(aVar);
                this.f106190c = a10;
                this.f106191d = aVar;
                this.f106192e = aVar;
                this.f106193f = 0;
                this.f106194g = 0;
                this.f106195h = 0;
                this.f106196i = 1;
                obj = C16534i.B(bVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16532g gVar = (C16532g) this.f106192e;
                C16532g gVar2 = (C16532g) this.f106191d;
                f.a aVar2 = (f.a) this.f106190c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.dataconsent.impl.repository.datasource.UserConsentLocalDataSourceImpl$setConsent$5", f = "UserConsentLocalDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: xp.c$e */
    static final class e extends l implements p<c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106210c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f106211d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map<C12071a, Boolean> f106212e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Map<C12071a, Boolean> map, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f106212e = map;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f106212e, eVar);
            eVar2.f106211d = obj;
            return eVar2;
        }

        public final Object invoke(c cVar, C17164e<? super C16807N> eVar) {
            return ((e) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f106210c == 0) {
                y.b(obj);
                c cVar = (c) this.f106211d;
                for (Map.Entry next : this.f106212e.entrySet()) {
                    C12071a aVar = (C12071a) next.getKey();
                    boolean booleanValue = ((Boolean) next.getValue()).booleanValue();
                    if (aVar.c()) {
                        cVar.j(W2.h.a(aVar.b()), kotlin.coroutines.jvm.internal.b.a(booleanValue));
                    } else {
                        throw new IllegalStateException("Tried to modify immutable key");
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.dataconsent.impl.repository.datasource.UserConsentLocalDataSourceImpl$setConsentSubmitted$2", f = "UserConsentLocalDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: xp.c$f */
    static final class f extends l implements p<c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106213c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f106214d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f.a<Boolean> f106215e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(f.a<Boolean> aVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f106215e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f106215e, eVar);
            fVar.f106214d = obj;
            return fVar;
        }

        public final Object invoke(c cVar, C17164e<? super C16807N> eVar) {
            return ((f) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f106213c == 0) {
                y.b(obj);
                ((c) this.f106214d).j(this.f106215e, kotlin.coroutines.jvm.internal.b.a(true));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C12330c(h<W2.f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f106178a = hVar;
    }

    public Object a(C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f106178a, new b((C17164e<? super b>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public boolean b() {
        return ((Boolean) C16312j.b((C17168i) null, new d(this, (C17164e<? super d>) null), 1, (Object) null)).booleanValue();
    }

    public Object c(C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f106178a, new f(W2.h.a("consent_submitted_v1"), (C17164e<? super f>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public C16532g<C12072b> d(C12071a aVar) {
        C17542s.j(aVar, "consentKey");
        return new C2525c(this.f106178a.getData(), aVar, W2.h.a(aVar.b()));
    }

    public Object e(Map<C12071a, Boolean> map, C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f106178a, new e(map, (C17164e<? super e>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
