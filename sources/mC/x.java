package Mc;

import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import R2.h;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import W2.f;
import W2.i;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.util.Log;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.P;
import nI.C17642l;
import nI.p;
import nI.q;
import qI.C17786c;
import uI.C18064m;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0015\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"LMc/x;", "Lcom/google/firebase/sessions/a;", "Landroid/content/Context;", "context", "LdI/i;", "backgroundDispatcher", "<init>", "(Landroid/content/Context;LdI/i;)V", "LW2/f;", "preferences", "LMc/l;", "i", "(LW2/f;)LMc/l;", "", "sessionId", "LXH/N;", "b", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "Landroid/content/Context;", "c", "LdI/i;", "Ljava/util/concurrent/atomic/AtomicReference;", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "currentSessionFromDatastore", "LTJ/g;", "e", "LTJ/g;", "firebaseSessionDataFlow", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x implements com.google.firebase.sessions.a {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final c f61837f = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C17786c<Context, h<W2.f>> f61838g = V2.a.b(w.f61833a.a(), new S2.b(b.f61846c), (C17642l) null, (Q) null, 12, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Context f61839b;

    /* renamed from: c  reason: collision with root package name */
    private final C17168i f61840c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<l> f61841d = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C16532g<l> f61842e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {82}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61843c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x f61844d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMc/l;", "it", "LXH/N;", "c", "(LMc/l;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: Mc.x$a$a  reason: collision with other inner class name */
        static final class C1032a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x f61845a;

            C1032a(x xVar) {
                this.f61845a = xVar;
            }

            /* renamed from: c */
            public final Object emit(l lVar, C17164e<? super C16807N> eVar) {
                this.f61845a.f61841d.set(lVar);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(x xVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f61844d = xVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f61844d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f61843c;
            if (i10 == 0) {
                y.b(obj);
                C16532g g10 = this.f61844d.f61842e;
                C1032a aVar = new C1032a(this.f61844d);
                this.f61843c = 1;
                if (g10.collect(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR2/c;", "ex", "LW2/f;", "a", "(LR2/c;)LW2/f;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<R2.c, W2.f> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f61846c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final W2.f invoke(R2.c cVar) {
            C17542s.j(cVar, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + v.f61832a.e() + '.', cVar);
            return W2.g.a();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LMc/x$c;", "", "<init>", "()V", "Landroid/content/Context;", "LR2/h;", "LW2/f;", "dataStore$delegate", "LqI/c;", "b", "(Landroid/content/Context;)LR2/h;", "dataStore", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C18064m<Object>[] f61847a = {P.i(new I(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final h<W2.f> b(Context context) {
            return (h) x.f61838g.a(context, f61847a[0]);
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LMc/x$d;", "", "<init>", "()V", "LW2/f$a;", "", "b", "LW2/f$a;", "a", "()LW2/f$a;", "SESSION_ID", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f61848a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final f.a<String> f61849b = W2.h.g("session_id");

        private d() {
        }

        public final f.a<String> a() {
            return f61849b;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "LW2/f;", "", "exception", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {76}, m = "invokeSuspend")
    static final class e extends l implements q<C16533h<? super W2.f>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61850c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f61851d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f61852e;

        e(C17164e<? super e> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super W2.f> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f61851d = hVar;
            eVar2.f61852e = th2;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f61850c;
            if (i10 == 0) {
                y.b(obj);
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f61852e);
                W2.f a10 = W2.g.a();
                this.f61851d = null;
                this.f61850c = 1;
                if (((C16533h) this.f61851d).emit(a10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements C16532g<l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f61853a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x f61854b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f61855a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ x f61856b;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", l = {223}, m = "emit")
            /* renamed from: Mc.x$f$a$a  reason: collision with other inner class name */
            public static final class C1033a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f61857c;

                /* renamed from: d  reason: collision with root package name */
                int f61858d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f61859e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1033a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f61859e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f61857c = obj;
                    this.f61858d |= Integer.MIN_VALUE;
                    return this.f61859e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, x xVar) {
                this.f61855a = hVar;
                this.f61856b = xVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Mc.x.f.a.C1033a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Mc.x$f$a$a r0 = (Mc.x.f.a.C1033a) r0
                    int r1 = r0.f61858d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f61858d = r1
                    goto L_0x0018
                L_0x0013:
                    Mc.x$f$a$a r0 = new Mc.x$f$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f61857c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f61858d
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
                    TJ.h r6 = r4.f61855a
                    W2.f r5 = (W2.f) r5
                    Mc.x r2 = r4.f61856b
                    Mc.l r5 = r2.i(r5)
                    r0.f61858d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Mc.x.f.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public f(C16532g gVar, x xVar) {
            this.f61853a = gVar;
            this.f61854b = xVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f61853a.collect(new a(hVar, this.f61854b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {89}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61860c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x f61861d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f61862e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
        static final class a extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61863c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f61864d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f61865e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f61865e = str;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f61865e, eVar);
                aVar.f61864d = obj;
                return aVar;
            }

            public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
                return ((a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f61863c == 0) {
                    y.b(obj);
                    ((W2.c) this.f61864d).j(d.f61848a.a(), this.f61865e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(x xVar, String str, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f61861d = xVar;
            this.f61862e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f61861d, this.f61862e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f61860c;
            if (i10 == 0) {
                y.b(obj);
                h a10 = x.f61837f.b(this.f61861d.f61839b);
                a aVar = new a(this.f61862e, (C17164e<? super a>) null);
                this.f61860c = 1;
                if (i.a(a10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (IOException e10) {
                    Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e10);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public x(Context context, C17168i iVar) {
        C17542s.j(context, "context");
        C17542s.j(iVar, "backgroundDispatcher");
        this.f61839b = context;
        this.f61840c = iVar;
        this.f61842e = new f(C16534i.g(f61837f.b(context).getData(), new e((C17164e<? super e>) null)), this);
        F0 unused = C16314k.d(S.a(iVar), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final l i(W2.f fVar) {
        return new l((String) fVar.b(d.f61848a.a()));
    }

    public String a() {
        l lVar = this.f61841d.get();
        if (lVar != null) {
            return lVar.a();
        }
        return null;
    }

    public void b(String str) {
        C17542s.j(str, "sessionId");
        F0 unused = C16314k.d(S.a(this.f61840c), (C17168i) null, (T) null, new g(this, str, (C17164e<? super g>) null), 3, (Object) null);
    }
}
