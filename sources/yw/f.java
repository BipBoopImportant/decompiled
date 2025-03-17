package Yw;

import HJ.C15854t;
import QJ.C16320n;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.x;
import XH.y;
import Yw.e;
import android.content.Intent;
import android.content.IntentSender;
import com.google.android.gms.common.api.l;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g.C5312a;
import g.C5313b;
import g.C5314c;
import g.C5316e;
import g.C5318g;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import nI.C17642l;
import nI.p;
import na.k;
import na.m;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0015B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHB¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LYw/f;", "LYw/e;", "Lna/m;", "settingsClient", "Lg/e;", "activityResultRegistry", "LYw/f$a;", "activityResultWrapper", "LQJ/M;", "mainDispatcher", "<init>", "(Lna/m;Lg/e;LYw/f$a;LQJ/M;)V", "Lg/g;", "intentSenderRequest", "LXH/x;", "LYw/e$a;", "e", "(Lg/g;LdI/e;)Ljava/lang/Object;", "invoke-IoAF18A", "(LdI/e;)Ljava/lang/Object;", "invoke", "a", "Lna/m;", "b", "Lg/e;", "c", "LYw/f$a;", "d", "LQJ/M;", "LQJ/Q;", "f", "()LQJ/Q;", "coroutineScope", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final m f118126a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C5316e f118127b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final a f118128c;

    /* renamed from: d  reason: collision with root package name */
    private final M f118129d;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LYw/f$a;", "", "<init>", "()V", "Lcom/google/android/gms/common/api/l;", "resolvableApiException", "Lg/g;", "a", "(Lcom/google/android/gms/common/api/l;)Lg/g;", "Lg/a;", "activityResult", "Lna/k;", "b", "(Lg/a;)Lna/k;", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public final C5318g a(l lVar) {
            C17542s.j(lVar, "resolvableApiException");
            IntentSender intentSender = lVar.c().getIntentSender();
            C17542s.i(intentSender, "getIntentSender(...)");
            return new C5318g.a(intentSender).a();
        }

        public final k b(C5312a aVar) {
            C17542s.j(aVar, "activityResult");
            Intent a10 = aVar.a();
            if (a10 != null) {
                return k.x(a10);
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.permissions.location.PromptUserToEnableLocationUseCaseImpl", f = "PromptUserToEnableLocationUseCase.kt", l = {191}, m = "awaitLocationSettingsStatesCallback-gIAlu-s")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118130c;

        /* renamed from: d  reason: collision with root package name */
        Object f118131d;

        /* renamed from: e  reason: collision with root package name */
        Object f118132e;

        /* renamed from: f  reason: collision with root package name */
        int f118133f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f118134g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f118135h;

        /* renamed from: i  reason: collision with root package name */
        int f118136i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f118135h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118134g = obj;
            this.f118136i |= Integer.MIN_VALUE;
            Object a10 = this.f118135h.e((C5318g) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements C17642l<Throwable, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f118137a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ O<C5314c<C5318g>> f118138b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.permissions.location.PromptUserToEnableLocationUseCaseImpl$awaitLocationSettingsStatesCallback$2$1$2", f = "PromptUserToEnableLocationUseCase.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f118139c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ O<C5314c<C5318g>> f118140d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(O<C5314c<C5318g>> o10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f118140d = o10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f118140d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C5314c cVar;
                C17187b.f();
                if (this.f118139c == 0) {
                    y.b(obj);
                    T t10 = this.f118140d.f144348a;
                    if (t10 == null) {
                        C17542s.z("launcher");
                        cVar = null;
                    } else {
                        cVar = (C5314c) t10;
                    }
                    cVar.c();
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        c(f fVar, O<C5314c<C5318g>> o10) {
            this.f118137a = fVar;
            this.f118138b = o10;
        }

        public final void a(Throwable th2) {
            f fVar = this.f118137a;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("invokeOnCancellation, doing unregister", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            F0 unused = C16314k.d(this.f118137a.f(), (C17168i) null, (T) null, new a(this.f118138b, (C17164e<? super a>) null), 3, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d<O> implements C5313b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f118141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16320n<x<? extends e.a>> f118142b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O<C5314c<C5318g>> f118143c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.permissions.location.PromptUserToEnableLocationUseCaseImpl$awaitLocationSettingsStatesCallback$2$callback$1$resumeWithResult$1", f = "PromptUserToEnableLocationUseCase.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f118144c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ O<C5314c<C5318g>> f118145d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(O<C5314c<C5318g>> o10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f118145d = o10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f118145d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C5314c cVar;
                C17187b.f();
                if (this.f118144c == 0) {
                    y.b(obj);
                    T t10 = this.f118145d.f144348a;
                    if (t10 == null) {
                        C17542s.z("launcher");
                        cVar = null;
                    } else {
                        cVar = (C5314c) t10;
                    }
                    cVar.c();
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        d(f fVar, C16320n<? super x<? extends e.a>> nVar, O<C5314c<C5318g>> o10) {
            this.f118141a = fVar;
            this.f118142b = nVar;
            this.f118143c = o10;
        }

        private static final void c(f fVar, C16320n<? super x<? extends e.a>> nVar, O<C5314c<C5318g>> o10, e.a aVar) {
            F0 unused = C16314k.d(fVar.f(), (C17168i) null, (T) null, new a(o10, (C17164e<? super a>) null), 3, (Object) null);
            ip.e.a(nVar, x.a(x.b(aVar)));
        }

        /* renamed from: b */
        public final void a(C5312a aVar) {
            C17542s.j(aVar, "result");
            int b10 = aVar.b();
            if (b10 != -1) {
                if (b10 != 0) {
                    f fVar = this.f118141a;
                    qv.e eVar = qv.e.WARN;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a("Got unexpected result code: " + aVar.b(), (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = fVar.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar.a(eVar, str4, false, (Throwable) null, str3);
                        str = str3;
                        str2 = str4;
                    }
                    c(this.f118141a, this.f118142b, this.f118143c, new e.a.C2930a("Unknown resultCode: " + aVar.b()));
                    return;
                }
                c(this.f118141a, this.f118142b, this.f118143c, new e.a.C2930a("User cancelled request"));
            } else if (this.f118141a.f118128c.b(aVar) != null) {
                c(this.f118141a, this.f118142b, this.f118143c, e.a.b.f118125a);
            } else {
                c(this.f118141a, this.f118142b, this.f118143c, new e.a.C2930a("Could not get states from intent"));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.permissions.location.PromptUserToEnableLocationUseCaseImpl", f = "PromptUserToEnableLocationUseCase.kt", l = {75, 88}, m = "invoke-IoAF18A")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118146c;

        /* renamed from: d  reason: collision with root package name */
        Object f118147d;

        /* renamed from: e  reason: collision with root package name */
        Object f118148e;

        /* renamed from: f  reason: collision with root package name */
        Object f118149f;

        /* renamed from: g  reason: collision with root package name */
        Object f118150g;

        /* renamed from: h  reason: collision with root package name */
        Object f118151h;

        /* renamed from: i  reason: collision with root package name */
        Object f118152i;

        /* renamed from: j  reason: collision with root package name */
        Object f118153j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f118154k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ f f118155l;

        /* renamed from: m  reason: collision with root package name */
        int f118156m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f118155l = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118154k = obj;
            this.f118156m |= Integer.MIN_VALUE;
            Object r22 = this.f118155l.m21invokeIoAF18A(this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public f(m mVar, C5316e eVar, a aVar, M m10) {
        C17542s.j(mVar, "settingsClient");
        C17542s.j(eVar, "activityResultRegistry");
        C17542s.j(aVar, "activityResultWrapper");
        C17542s.j(m10, "mainDispatcher");
        this.f118126a = mVar;
        this.f118127b = eVar;
        this.f118128c = aVar;
        this.f118129d = m10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(g.C5318g r8, dI.C17164e<? super XH.x<? extends Yw.e.a>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Yw.f.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            Yw.f$b r0 = (Yw.f.b) r0
            int r1 = r0.f118136i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118136i = r1
            goto L_0x0018
        L_0x0013:
            Yw.f$b r0 = new Yw.f$b
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f118134g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118136i
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r8 = r0.f118132e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f118131d
            g.g r8 = (g.C5318g) r8
            java.lang.Object r8 = r0.f118130c
            Yw.f r8 = (Yw.f) r8
            XH.y.b(r1)
            goto L_0x009a
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003d:
            XH.y.b(r1)
            r0.f118130c = r7
            r0.f118131d = r8
            r0.f118132e = r9
            r9 = 0
            r0.f118133f = r9
            r0.f118136i = r4
            QJ.p r9 = new QJ.p
            dI.e r1 = eI.C17187b.c(r0)
            r9.<init>(r1, r4)
            r9.C()
            kotlin.jvm.internal.O r1 = new kotlin.jvm.internal.O
            r1.<init>()
            Yw.f$d r3 = new Yw.f$d
            r3.<init>(r7, r9, r1)
            g.e r4 = r7.f118127b
            h.e r5 = new h.e
            r5.<init>()
            java.lang.String r6 = "PromptUserToEnableLocationRegistryKey"
            g.c r3 = r4.m(r6, r5, r3)
            r1.f144348a = r3
            Yw.f$c r3 = new Yw.f$c
            r3.<init>(r7, r1)
            r9.K(r3)
            T r1 = r1.f144348a
            if (r1 != 0) goto L_0x0085
            java.lang.String r1 = "launcher"
            kotlin.jvm.internal.C17542s.z(r1)
            r1 = 0
            goto L_0x0087
        L_0x0085:
            g.c r1 = (g.C5314c) r1
        L_0x0087:
            r1.a(r8)
            java.lang.Object r1 = r9.w()
            java.lang.Object r8 = eI.C17187b.f()
            if (r1 != r8) goto L_0x0097
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0097:
            if (r1 != r2) goto L_0x009a
            return r2
        L_0x009a:
            XH.x r1 = (XH.x) r1
            java.lang.Object r8 = r1.j()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Yw.f.e(g.g, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Q f() {
        return S.a(this.f118129d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: xa.l<na.i>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: xa.l<na.i>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: na.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: xa.l<na.i>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: xa.l<na.i>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: xa.l<na.i>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3 A[Catch:{ Exception -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d7 A[Catch:{ Exception -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m21invokeIoAF18A(dI.C17164e<? super XH.x<? extends Yw.e.a>> r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            boolean r0 = r2 instanceof Yw.f.e
            if (r0 == 0) goto L_0x0018
            r0 = r2
            Yw.f$e r0 = (Yw.f.e) r0
            int r3 = r0.f118156m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r0.f118156m = r3
        L_0x0016:
            r3 = r0
            goto L_0x001e
        L_0x0018:
            Yw.f$e r0 = new Yw.f$e
            r0.<init>(r1, r2)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r3.f118154k
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r3.f118156m
            r6 = 1
            r7 = 2
            if (r5 == 0) goto L_0x0083
            if (r5 == r6) goto L_0x005d
            if (r5 != r7) goto L_0x0055
            java.lang.Object r2 = r3.f118153j
            g.g r2 = (g.C5318g) r2
            java.lang.Object r2 = r3.f118152i
            java.lang.Exception r2 = (java.lang.Exception) r2
            java.lang.Object r2 = r3.f118151h
            java.lang.Exception r2 = (java.lang.Exception) r2
            java.lang.Object r2 = r3.f118149f
            QJ.Y r2 = (QJ.Y) r2
            java.lang.Object r2 = r3.f118148e
            na.h$a r2 = (na.h.a) r2
            java.lang.Object r2 = r3.f118147d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r3.f118146c
            Yw.f r2 = (Yw.f) r2
            XH.y.b(r0)
            XH.x r0 = (XH.x) r0
            java.lang.Object r0 = r0.j()
            goto L_0x01bf
        L_0x0055:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x005d:
            java.lang.Object r2 = r3.f118150g
            xa.l r2 = (xa.C8971l) r2
            java.lang.Object r5 = r3.f118149f
            QJ.Y r5 = (QJ.Y) r5
            java.lang.Object r8 = r3.f118148e
            na.h$a r8 = (na.h.a) r8
            java.lang.Object r9 = r3.f118147d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r10 = r3.f118146c
            Yw.f r10 = (Yw.f) r10
            XH.y.b(r0)     // Catch:{ Exception -> 0x007b }
            r17 = r5
            r5 = r2
            r2 = r9
            r9 = r17
            goto L_0x00c6
        L_0x007b:
            r0 = move-exception
            r17 = r5
            r5 = r2
            r2 = r9
            r9 = r17
            goto L_0x00e8
        L_0x0083:
            XH.y.b(r0)
            na.h$a r0 = new na.h$a
            r0.<init>()
            com.google.android.gms.location.LocationRequest$a r5 = new com.google.android.gms.location.LocationRequest$a
            r8 = 100
            r5.<init>((long) r8)
            com.google.android.gms.location.LocationRequest r5 = r5.a()
            na.h$a r8 = r0.a(r5)
            java.lang.String r0 = "addLocationRequest(...)"
            kotlin.jvm.internal.C17542s.i(r8, r0)
            na.m r0 = r1.f118126a
            na.h r5 = r8.b()
            xa.l r5 = r0.d(r5)
            java.lang.String r0 = "checkLocationSettings(...)"
            kotlin.jvm.internal.C17542s.i(r5, r0)
            QJ.Y r9 = cK.C17078d.c(r5)
            r3.f118146c = r1     // Catch:{ Exception -> 0x00e6 }
            r3.f118147d = r2     // Catch:{ Exception -> 0x00e6 }
            r3.f118148e = r8     // Catch:{ Exception -> 0x00e6 }
            r3.f118149f = r9     // Catch:{ Exception -> 0x00e6 }
            r3.f118150g = r5     // Catch:{ Exception -> 0x00e6 }
            r3.f118156m = r6     // Catch:{ Exception -> 0x00e6 }
            java.lang.Object r0 = r9.f(r3)     // Catch:{ Exception -> 0x00e6 }
            if (r0 != r4) goto L_0x00c5
            return r4
        L_0x00c5:
            r10 = r1
        L_0x00c6:
            r11 = r0
            na.i r11 = (na.i) r11     // Catch:{ Exception -> 0x00e4 }
            na.k r0 = r11.b()     // Catch:{ Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x00d7
            Yw.e$a$b r0 = Yw.e.a.b.f118125a     // Catch:{ Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x00d7
            goto L_0x00de
        L_0x00d4:
            r0 = move-exception
            r5 = r11
            goto L_0x00e8
        L_0x00d7:
            Yw.e$a$a r0 = new Yw.e$a$a     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r5 = "Could not get LocationSettingsStates from task"
            r0.<init>(r5)     // Catch:{ Exception -> 0x00d4 }
        L_0x00de:
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ Exception -> 0x00d4 }
            goto L_0x01bf
        L_0x00e4:
            r0 = move-exception
            goto L_0x00e8
        L_0x00e6:
            r0 = move-exception
            r10 = r1
        L_0x00e8:
            boolean r11 = r0 instanceof com.google.android.gms.common.api.l
            if (r11 == 0) goto L_0x010e
            Yw.f$a r6 = r10.f118128c
            r11 = r0
            com.google.android.gms.common.api.l r11 = (com.google.android.gms.common.api.l) r11
            g.g r6 = r6.a(r11)
            r3.f118146c = r10
            r3.f118147d = r2
            r3.f118148e = r8
            r3.f118149f = r9
            r3.f118150g = r5
            r3.f118151h = r0
            r3.f118152i = r0
            r3.f118153j = r6
            r3.f118156m = r7
            java.lang.Object r0 = r10.e(r6, r3)
            if (r0 != r4) goto L_0x01bf
            return r4
        L_0x010e:
            qv.e r2 = qv.e.WARN
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0121:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0139
            java.lang.Object r5 = r3.next()
            r8 = r5
            qv.b r8 = (qv.C11819b) r8
            r9 = 0
            boolean r8 = r8.b(r2, r9)
            if (r8 == 0) goto L_0x0121
            r4.add(r5)
            goto L_0x0121
        L_0x0139:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r5 = r4
            r8 = r5
        L_0x0140:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x01b5
            java.lang.Object r9 = r3.next()
            r11 = r9
            qv.b r11 = (qv.C11819b) r11
            if (r5 != 0) goto L_0x015c
            java.lang.String r5 = "Getting location setting gave unresolvable exception"
            java.lang.String r5 = qv.C11818a.a(r5, r0)
            if (r5 != 0) goto L_0x0158
            goto L_0x01b5
        L_0x0158:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x015c:
            if (r8 != 0) goto L_0x01ab
            java.lang.Class r8 = r10.getClass()
            java.lang.String r8 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r9 = 36
            java.lang.String r9 = HJ.C15854t.s1(r8, r9, r4, r7, r4)
            r12 = 46
            java.lang.String r9 = HJ.C15854t.o1(r9, r12, r4, r7, r4)
            int r12 = r9.length()
            if (r12 != 0) goto L_0x017c
            goto L_0x0182
        L_0x017c:
            java.lang.String r8 = "Kt"
            java.lang.String r8 = HJ.C15854t.P0(r9, r8)
        L_0x0182:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            java.lang.String r12 = "main"
            boolean r9 = HJ.C15854t.b0(r9, r12, r6)
            if (r9 == 0) goto L_0x0195
            java.lang.String r9 = "m"
            goto L_0x0197
        L_0x0195:
            java.lang.String r9 = "b"
        L_0x0197:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            java.lang.String r9 = "|"
            r12.append(r9)
            r12.append(r8)
            java.lang.String r8 = r12.toString()
        L_0x01ab:
            r14 = 0
            r12 = r2
            r13 = r8
            r15 = r0
            r16 = r5
            r11.a(r12, r13, r14, r15, r16)
            goto L_0x0140
        L_0x01b5:
            XH.x$a r2 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x01bf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Yw.f.m21invokeIoAF18A(dI.e):java.lang.Object");
    }
}
