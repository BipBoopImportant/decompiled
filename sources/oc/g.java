package Oc;

import QJ.Q;
import TJ.C16532g;
import TJ.C16534i;
import W2.f;
import W2.h;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 12\u00020\u0001:\u0001.B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0019H@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0019H@ø\u0001\u0000¢\u0006\u0004\b&\u0010$J\u001d\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010'H@ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020-8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b.\u0010/\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"LOc/g;", "", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "preferences", "LXH/N;", "l", "(LW2/f;)V", "T", "LW2/f$a;", "key", "value", "h", "(LW2/f$a;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "", "d", "()Z", "g", "()Ljava/lang/Boolean;", "", "f", "()Ljava/lang/Double;", "", "e", "()Ljava/lang/Integer;", "enabled", "n", "(Ljava/lang/Boolean;LdI/e;)Ljava/lang/Object;", "rate", "i", "(Ljava/lang/Double;LdI/e;)Ljava/lang/Object;", "timeoutInSeconds", "m", "(Ljava/lang/Integer;LdI/e;)Ljava/lang/Object;", "cacheDurationInSeconds", "j", "", "cacheUpdatedTime", "k", "(Ljava/lang/Long;LdI/e;)Ljava/lang/Object;", "a", "LR2/h;", "LOc/e;", "b", "LOc/e;", "sessionConfigs", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: c  reason: collision with root package name */
    private static final b f62104c = new b((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final f.a<Boolean> f62105d = h.a("firebase_sessions_enabled");

    /* renamed from: e  reason: collision with root package name */
    private static final f.a<Double> f62106e = h.c("firebase_sessions_sampling_rate");

    /* renamed from: f  reason: collision with root package name */
    private static final f.a<Integer> f62107f = h.e("firebase_sessions_restart_timeout");

    /* renamed from: g  reason: collision with root package name */
    private static final f.a<Integer> f62108g = h.e("firebase_sessions_cache_duration");

    /* renamed from: h  reason: collision with root package name */
    private static final f.a<Long> f62109h = h.f("firebase_sessions_cache_updated_time");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final R2.h<f> f62110a;

    /* renamed from: b  reason: collision with root package name */
    private e f62111b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {46}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f62112c;

        /* renamed from: d  reason: collision with root package name */
        int f62113d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f62114e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f62114e = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f62114e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            g gVar;
            Object f10 = C17187b.f();
            int i10 = this.f62113d;
            if (i10 == 0) {
                y.b(obj);
                g gVar2 = this.f62114e;
                C16532g data = gVar2.f62110a.getData();
                this.f62112c = gVar2;
                this.f62113d = 1;
                Object B10 = C16534i.B(data, this);
                if (B10 == f10) {
                    return f10;
                }
                gVar = gVar2;
                obj = B10;
            } else if (i10 == 1) {
                gVar = (g) this.f62112c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar.l(((f) obj).d());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LOc/g$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {119}, m = "updateConfigValue")
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f62115c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f62116d;

        /* renamed from: e  reason: collision with root package name */
        int f62117e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f62116d = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f62115c = obj;
            this.f62117e |= Integer.MIN_VALUE;
            return this.f62116d.h((f.a) null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f62118c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f62119d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ T f62120e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f.a<T> f62121f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f62122g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(T t10, f.a<T> aVar, g gVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f62120e = t10;
            this.f62121f = aVar;
            this.f62122g = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f62120e, this.f62121f, this.f62122g, eVar);
            dVar.f62119d = obj;
            return dVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((d) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f62118c == 0) {
                y.b(obj);
                W2.c cVar = (W2.c) this.f62119d;
                T t10 = this.f62120e;
                if (t10 != null) {
                    cVar.j(this.f62121f, t10);
                } else {
                    cVar.i(this.f62121f);
                }
                this.f62122g.l(cVar);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public g(R2.h<f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f62110a = hVar;
        Object unused = C16312j.b((C17168i) null, new a(this, (C17164e<? super a>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object h(W2.f.a<T> r6, T r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof Oc.g.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Oc.g$c r0 = (Oc.g.c) r0
            int r1 = r0.f62117e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f62117e = r1
            goto L_0x0018
        L_0x0013:
            Oc.g$c r0 = new Oc.g$c
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f62115c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f62117e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            XH.y.b(r8)     // Catch:{ IOException -> 0x0029 }
            goto L_0x005d
        L_0x0029:
            r6 = move-exception
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            XH.y.b(r8)
            R2.h<W2.f> r8 = r5.f62110a     // Catch:{ IOException -> 0x0029 }
            Oc.g$d r2 = new Oc.g$d     // Catch:{ IOException -> 0x0029 }
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch:{ IOException -> 0x0029 }
            r0.f62117e = r3     // Catch:{ IOException -> 0x0029 }
            java.lang.Object r6 = W2.i.a(r8, r2, r0)     // Catch:{ IOException -> 0x0029 }
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x0047:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L_0x005d:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Oc.g.h(W2.f$a, java.lang.Object, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void l(f fVar) {
        this.f62111b = new e((Boolean) fVar.b(f62105d), (Double) fVar.b(f62106e), (Integer) fVar.b(f62107f), (Integer) fVar.b(f62108g), (Long) fVar.b(f62109h));
    }

    public final boolean d() {
        e eVar = this.f62111b;
        e eVar2 = null;
        if (eVar == null) {
            C17542s.z("sessionConfigs");
            eVar = null;
        }
        Long b10 = eVar.b();
        e eVar3 = this.f62111b;
        if (eVar3 == null) {
            C17542s.z("sessionConfigs");
        } else {
            eVar2 = eVar3;
        }
        Integer a10 = eVar2.a();
        return b10 == null || a10 == null || (System.currentTimeMillis() - b10.longValue()) / ((long) 1000) >= ((long) a10.intValue());
    }

    public final Integer e() {
        e eVar = this.f62111b;
        if (eVar == null) {
            C17542s.z("sessionConfigs");
            eVar = null;
        }
        return eVar.d();
    }

    public final Double f() {
        e eVar = this.f62111b;
        if (eVar == null) {
            C17542s.z("sessionConfigs");
            eVar = null;
        }
        return eVar.e();
    }

    public final Boolean g() {
        e eVar = this.f62111b;
        if (eVar == null) {
            C17542s.z("sessionConfigs");
            eVar = null;
        }
        return eVar.c();
    }

    public final Object i(Double d10, C17164e<? super C16807N> eVar) {
        Object h10 = h(f62106e, d10, eVar);
        return h10 == C17187b.f() ? h10 : C16807N.f139792a;
    }

    public final Object j(Integer num, C17164e<? super C16807N> eVar) {
        Object h10 = h(f62108g, num, eVar);
        return h10 == C17187b.f() ? h10 : C16807N.f139792a;
    }

    public final Object k(Long l10, C17164e<? super C16807N> eVar) {
        Object h10 = h(f62109h, l10, eVar);
        return h10 == C17187b.f() ? h10 : C16807N.f139792a;
    }

    public final Object m(Integer num, C17164e<? super C16807N> eVar) {
        Object h10 = h(f62107f, num, eVar);
        return h10 == C17187b.f() ? h10 : C16807N.f139792a;
    }

    public final Object n(Boolean bool, C17164e<? super C16807N> eVar) {
        Object h10 = h(f62105d, bool, eVar);
        return h10 == C17187b.f() ? h10 : C16807N.f139792a;
    }
}
