package Ms;

import QJ.F0;
import QJ.M;
import QJ.S;
import QJ.b1;
import R2.h;
import TJ.C16532g;
import TJ.C16533h;
import W2.e;
import W2.f;
import W2.i;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import android.content.Context;
import dI.C17164e;
import eI.C17187b;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tH@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tH@¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LMs/g;", "LMs/d;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "", "status", "LXH/N;", "h", "(ZLdI/e;)Ljava/lang/Object;", "LTJ/g;", "c", "()LTJ/g;", "a", "(LdI/e;)Ljava/lang/Object;", "b", "LR2/h;", "LW2/f$a;", "LXH/o;", "f", "()LW2/f$a;", "newNotificationsPrefKey", "inboxrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f83704c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h<f> f83705a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f83706b = C16825p.b(new e());

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"LMs/g$a;", "", "<init>", "()V", "", "fileName", "Landroid/content/Context;", "applicationContext", "LQJ/M;", "ioDispatcher", "LR2/h;", "LW2/f;", "c", "(Ljava/lang/String;Landroid/content/Context;LQJ/M;)LR2/h;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "DATA_STORE_FILE_NAME", "Ljava/lang/String;", "NEW_NOTIFICATIONS_KEY", "inboxrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final h<f> c(String str, Context context, M m10) {
            return e.c(e.f14655a, (S2.b) null, (List) null, S.a(m10.plus(b1.b((F0) null, 1, (Object) null))), new f(context, str), 3, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final File d(Context context, String str) {
            return V2.b.a(context, str);
        }

        public final h<f> b(Context context, M m10) {
            C17542s.j(context, "applicationContext");
            C17542s.j(m10, "ioDispatcher");
            return c("inbox", context, m10);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f83707a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f83708b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f83709a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f83710b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inboxrepository.impl.source.NewNotificationsLocalSourceImpl$getNewNotificationStatus$$inlined$map$1$2", f = "NewNotificationsLocalSource.kt", l = {50}, m = "emit")
            /* renamed from: Ms.g$b$a$a  reason: collision with other inner class name */
            public static final class C1681a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f83711c;

                /* renamed from: d  reason: collision with root package name */
                int f83712d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f83713e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1681a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f83713e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f83711c = obj;
                    this.f83712d |= Integer.MIN_VALUE;
                    return this.f83713e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, g gVar) {
                this.f83709a = hVar;
                this.f83710b = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Ms.g.b.a.C1681a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Ms.g$b$a$a r0 = (Ms.g.b.a.C1681a) r0
                    int r1 = r0.f83712d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f83712d = r1
                    goto L_0x0018
                L_0x0013:
                    Ms.g$b$a$a r0 = new Ms.g$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f83711c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f83712d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0059
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f83709a
                    W2.f r5 = (W2.f) r5
                    Ms.g r2 = r4.f83710b
                    W2.f$a r2 = r2.f()
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x004b
                    boolean r5 = r5.booleanValue()
                    goto L_0x004c
                L_0x004b:
                    r5 = 0
                L_0x004c:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f83712d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0059
                    return r1
                L_0x0059:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ms.g.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, g gVar2) {
            this.f83707a = gVar;
            this.f83708b = gVar2;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f83707a.collect(new a(hVar, this.f83708b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inboxrepository.impl.source.NewNotificationsLocalSourceImpl$updateNewNotificationStatus$2", f = "NewNotificationsLocalSource.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f83714c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f83715d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f83716e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f83717f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, boolean z10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f83716e = gVar;
            this.f83717f = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f83716e, this.f83717f, eVar);
            cVar.f83715d = obj;
            return cVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f83714c == 0) {
                y.b(obj);
                ((W2.c) this.f83715d).j(this.f83716e.f(), kotlin.coroutines.jvm.internal.b.a(this.f83717f));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public g(h<f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f83705a = hVar;
    }

    /* access modifiers changed from: private */
    public final f.a<Boolean> f() {
        return (f.a) this.f83706b.getValue();
    }

    /* access modifiers changed from: private */
    public static final f.a g() {
        return W2.h.a("newNotificationsKey");
    }

    private final Object h(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f83705a, new c(this, z10, (C17164e<? super c>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Object a(C17164e<? super C16807N> eVar) {
        Object h10 = h(true, eVar);
        return h10 == C17187b.f() ? h10 : C16807N.f139792a;
    }

    public Object b(C17164e<? super C16807N> eVar) {
        Object h10 = h(false, eVar);
        return h10 == C17187b.f() ? h10 : C16807N.f139792a;
    }

    public C16532g<Boolean> c() {
        return new b(this.f83705a.getData(), this);
    }
}
