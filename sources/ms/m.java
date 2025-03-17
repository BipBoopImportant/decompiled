package Ms;

import Ps.f;
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
import XH.t;
import XH.y;
import YH.C16877v;
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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\nB\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00138BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00138BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00138BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00130\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"LMs/m;", "LMs/h;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "LTJ/g;", "", "LPs/f;", "a", "()LTJ/g;", "settingToUpdate", "", "newValue", "LXH/N;", "b", "(LPs/f;ZLdI/e;)Ljava/lang/Object;", "LR2/h;", "LW2/f$a;", "LXH/o;", "k", "()LW2/f$a;", "familyOffers", "c", "m", "newArrivals", "d", "l", "information", "e", "Ljava/util/List;", "preferenceKeys", "f", "inboxrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f83720f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h<f> f83721a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f83722b = C16825p.b(new i());

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f83723c = C16825p.b(new j());

    /* renamed from: d  reason: collision with root package name */
    private final C16824o f83724d = C16825p.b(new k());
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final List<f.a<Boolean>> f83725e = C16877v.q(k(), m(), l());

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LMs/m$a;", "", "<init>", "()V", "", "fileName", "Landroid/content/Context;", "applicationContext", "LQJ/M;", "ioDispatcher", "LR2/h;", "LW2/f;", "c", "(Ljava/lang/String;Landroid/content/Context;LQJ/M;)LR2/h;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "DATA_STORE_FILE_NAME", "Ljava/lang/String;", "inboxrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final h<f> c(String str, Context context, M m10) {
            return e.c(e.f14655a, (S2.b) null, (List) null, S.a(m10.plus(b1.b((F0) null, 1, (Object) null))), new l(context, str), 3, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final File d(Context context, String str) {
            return V2.b.a(context, str);
        }

        public final h<f> b(Context context, M m10) {
            C17542s.j(context, "applicationContext");
            C17542s.j(m10, "ioDispatcher");
            return c("notification_settings", context, m10);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<List<? extends Ps.f>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f83726a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f83727b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f83728a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ m f83729b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inboxrepository.impl.source.NotificationSettingsLocalSourceImpl$getNotificationSettings$$inlined$map$1$2", f = "NotificationSettingsLocalSource.kt", l = {50}, m = "emit")
            /* renamed from: Ms.m$b$a$a  reason: collision with other inner class name */
            public static final class C1682a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f83730c;

                /* renamed from: d  reason: collision with root package name */
                int f83731d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f83732e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1682a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f83732e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f83730c = obj;
                    this.f83731d |= Integer.MIN_VALUE;
                    return this.f83732e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, m mVar) {
                this.f83728a = hVar;
                this.f83729b = mVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r9, dI.C17164e r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof Ms.m.b.a.C1682a
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    Ms.m$b$a$a r0 = (Ms.m.b.a.C1682a) r0
                    int r1 = r0.f83731d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f83731d = r1
                    goto L_0x0018
                L_0x0013:
                    Ms.m$b$a$a r0 = new Ms.m$b$a$a
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.f83730c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f83731d
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    XH.y.b(r10)
                    goto L_0x00b4
                L_0x002a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x0032:
                    XH.y.b(r10)
                    TJ.h r10 = r8.f83728a
                    W2.f r9 = (W2.f) r9
                    Ms.m r2 = r8.f83729b
                    java.util.List r2 = r2.f83725e
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r5 = 10
                    int r5 = YH.C16877v.y(r2, r5)
                    r4.<init>(r5)
                    java.util.Iterator r2 = r2.iterator()
                L_0x0050:
                    boolean r5 = r2.hasNext()
                    if (r5 == 0) goto L_0x00ab
                    java.lang.Object r5 = r2.next()
                    W2.f$a r5 = (W2.f.a) r5
                    java.lang.Object r6 = r9.b(r5)
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    if (r6 == 0) goto L_0x0069
                    boolean r6 = r6.booleanValue()
                    goto L_0x006a
                L_0x0069:
                    r6 = r3
                L_0x006a:
                    Ms.m r7 = r8.f83729b
                    W2.f$a r7 = r7.k()
                    boolean r7 = kotlin.jvm.internal.C17542s.e(r5, r7)
                    if (r7 == 0) goto L_0x007c
                    Ps.f$b r5 = new Ps.f$b
                    r5.<init>(r6)
                    goto L_0x009f
                L_0x007c:
                    Ms.m r7 = r8.f83729b
                    W2.f$a r7 = r7.m()
                    boolean r7 = kotlin.jvm.internal.C17542s.e(r5, r7)
                    if (r7 == 0) goto L_0x008e
                    Ps.f$a r5 = new Ps.f$a
                    r5.<init>(r6)
                    goto L_0x009f
                L_0x008e:
                    Ms.m r7 = r8.f83729b
                    W2.f$a r7 = r7.l()
                    boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
                    if (r5 == 0) goto L_0x00a3
                    Ps.f$c r5 = new Ps.f$c
                    r5.<init>(r6)
                L_0x009f:
                    r4.add(r5)
                    goto L_0x0050
                L_0x00a3:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "Key not supported."
                    r9.<init>(r10)
                    throw r9
                L_0x00ab:
                    r0.f83731d = r3
                    java.lang.Object r9 = r10.emit(r4, r0)
                    if (r9 != r1) goto L_0x00b4
                    return r1
                L_0x00b4:
                    XH.N r9 = XH.C16807N.f139792a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: Ms.m.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, m mVar) {
            this.f83726a = gVar;
            this.f83727b = mVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f83726a.collect(new a(hVar, this.f83727b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inboxrepository.impl.source.NotificationSettingsLocalSourceImpl$updateNotificationSetting$2", f = "NotificationSettingsLocalSource.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f83733c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f83734d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f.a<Boolean> f83735e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f83736f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f.a<Boolean> aVar, boolean z10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f83735e = aVar;
            this.f83736f = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f83735e, this.f83736f, eVar);
            cVar.f83734d = obj;
            return cVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f83733c == 0) {
                y.b(obj);
                ((W2.c) this.f83734d).j(this.f83735e, kotlin.coroutines.jvm.internal.b.a(this.f83736f));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public m(h<f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f83721a = hVar;
    }

    /* access modifiers changed from: private */
    public static final f.a j() {
        return W2.h.a(Ps.e.OFFERS.b());
    }

    /* access modifiers changed from: private */
    public final f.a<Boolean> k() {
        return (f.a) this.f83722b.getValue();
    }

    /* access modifiers changed from: private */
    public final f.a<Boolean> l() {
        return (f.a) this.f83724d.getValue();
    }

    /* access modifiers changed from: private */
    public final f.a<Boolean> m() {
        return (f.a) this.f83723c.getValue();
    }

    /* access modifiers changed from: private */
    public static final f.a n() {
        return W2.h.a(Ps.e.INFORMATION.b());
    }

    /* access modifiers changed from: private */
    public static final f.a o() {
        return W2.h.a(Ps.e.COLLECTIONS.b());
    }

    public C16532g<List<Ps.f>> a() {
        return new b(this.f83721a.getData(), this);
    }

    public Object b(Ps.f fVar, boolean z10, C17164e<? super C16807N> eVar) {
        f.a<Boolean> aVar;
        if (fVar instanceof f.b) {
            aVar = k();
        } else if (fVar instanceof f.a) {
            aVar = m();
        } else if (fVar instanceof f.c) {
            aVar = l();
        } else {
            throw new t();
        }
        Object a10 = i.a(this.f83721a, new c(aVar, z10, (C17164e<? super c>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
