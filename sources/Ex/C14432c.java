package ex;

import HB.C12961a;
import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import am.h;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import cx.C14323a;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ep.C11256b;
import ex.C14430a;
import ex.C14431b;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import sp.C11880b;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030(8\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lex/c;", "Landroidx/lifecycle/f0;", "Lsp/b;", "Lex/b;", "Landroidx/lifecycle/U;", "savedStateHandle", "LHB/a;", "popularTimesRepository", "Lam/h;", "timeProvider", "Lep/b;", "localizedDateTimeFormatter", "Lcx/a;", "analytics", "<init>", "(Landroidx/lifecycle/U;LHB/a;Lam/h;Lep/b;Lcx/a;)V", "LXH/N;", "D", "()V", "", "E", "()Ljava/lang/String;", "Lex/a;", "action", "F", "(Lex/a;)V", "m", "Landroidx/lifecycle/U;", "n", "LHB/a;", "o", "Lam/h;", "p", "Lep/b;", "q", "Lcx/a;", "LTJ/B;", "r", "LTJ/B;", "_state", "LTJ/P;", "s", "LTJ/P;", "getState", "()LTJ/P;", "state", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ex.c  reason: case insensitive filesystem */
public final class C14432c extends f0 implements C11880b<C14431b> {

    /* renamed from: m  reason: collision with root package name */
    private final U f126781m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C12961a f126782n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final h f126783o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C11256b f126784p;

    /* renamed from: q  reason: collision with root package name */
    private final C14323a f126785q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16505B<C14431b> f126786r;

    /* renamed from: s  reason: collision with root package name */
    private final C16519P<C14431b> f126787s;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ex/c$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ex.c$a */
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14432c f126788a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, C14432c cVar) {
            super(aVar);
            this.f126788a = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            C14432c cVar = this.f126788a;
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cVar.getClass().getName();
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
            C16505B C10 = this.f126788a.f126786r;
            do {
                value = C10.getValue();
                C14431b bVar2 = (C14431b) value;
            } while (!C10.e(value, C14431b.C3102b.f126779a));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.populartimes.impl.presentation.PopularTimesViewModel$getPopularTimesData$3", f = "PopularTimesViewModel.kt", l = {61, 62}, m = "invokeSuspend")
    /* renamed from: ex.c$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f126789c;

        /* renamed from: d  reason: collision with root package name */
        Object f126790d;

        /* renamed from: e  reason: collision with root package name */
        Object f126791e;

        /* renamed from: f  reason: collision with root package name */
        Object f126792f;

        /* renamed from: g  reason: collision with root package name */
        Object f126793g;

        /* renamed from: h  reason: collision with root package name */
        Object f126794h;

        /* renamed from: i  reason: collision with root package name */
        Object f126795i;

        /* renamed from: j  reason: collision with root package name */
        Object f126796j;

        /* renamed from: k  reason: collision with root package name */
        Object f126797k;

        /* renamed from: l  reason: collision with root package name */
        int f126798l;

        /* renamed from: m  reason: collision with root package name */
        int f126799m;

        /* renamed from: n  reason: collision with root package name */
        int f126800n;

        /* renamed from: o  reason: collision with root package name */
        private /* synthetic */ Object f126801o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C14432c f126802p;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "LXH/x;", "LGB/e;", "<anonymous>", "(LQJ/Q;)LXH/x;"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.populartimes.impl.presentation.PopularTimesViewModel$getPopularTimesData$3$liveData$1", f = "PopularTimesViewModel.kt", l = {56}, m = "invokeSuspend")
        /* renamed from: ex.c$b$a */
        static final class a extends l implements p<Q, C17164e<? super x<? extends GB.e>>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f126803c;

            /* renamed from: d  reason: collision with root package name */
            Object f126804d;

            /* renamed from: e  reason: collision with root package name */
            Object f126805e;

            /* renamed from: f  reason: collision with root package name */
            Object f126806f;

            /* renamed from: g  reason: collision with root package name */
            int f126807g;

            /* renamed from: h  reason: collision with root package name */
            int f126808h;

            /* renamed from: i  reason: collision with root package name */
            int f126809i;

            /* renamed from: j  reason: collision with root package name */
            private /* synthetic */ Object f126810j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ C14432c f126811k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ String f126812l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C14432c cVar, String str, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f126811k = cVar;
                this.f126812l = str;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f126811k, this.f126812l, eVar);
                aVar.f126810j = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super x<GB.e>> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object f10 = C17187b.f();
                int i10 = this.f126809i;
                if (i10 == 0) {
                    y.b(obj);
                    Q q10 = (Q) this.f126810j;
                    C14432c cVar = this.f126811k;
                    String str = this.f126812l;
                    x.a aVar = x.f139812b;
                    C12961a i11 = cVar.f126782n;
                    this.f126810j = q10;
                    this.f126803c = q10;
                    this.f126804d = cVar;
                    this.f126805e = str;
                    this.f126806f = q10;
                    this.f126807g = 0;
                    this.f126808h = 0;
                    this.f126809i = 1;
                    obj = i11.b(str, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    Q q11 = (Q) this.f126806f;
                    String str2 = (String) this.f126805e;
                    C14432c cVar2 = (C14432c) this.f126804d;
                    Q q12 = (Q) this.f126803c;
                    Q q13 = (Q) this.f126810j;
                    try {
                        y.b(obj);
                    } catch (CancellationException e10) {
                        throw e10;
                    } catch (Throwable th2) {
                        x.a aVar2 = x.f139812b;
                        obj2 = x.b(y.a(th2));
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = x.b((GB.e) obj);
                return x.a(obj2);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LGB/f;", "<anonymous>", "(LQJ/Q;)LGB/f;"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.populartimes.impl.presentation.PopularTimesViewModel$getPopularTimesData$3$trend$1", f = "PopularTimesViewModel.kt", l = {54}, m = "invokeSuspend")
        /* renamed from: ex.c$b$b  reason: collision with other inner class name */
        static final class C3103b extends l implements p<Q, C17164e<? super GB.f>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f126813c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C14432c f126814d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f126815e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3103b(C14432c cVar, String str, C17164e<? super C3103b> eVar) {
                super(2, eVar);
                this.f126814d = cVar;
                this.f126815e = str;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3103b(this.f126814d, this.f126815e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super GB.f> eVar) {
                return ((C3103b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f126813c;
                if (i10 == 0) {
                    y.b(obj);
                    C12961a i11 = this.f126814d.f126782n;
                    String str = this.f126815e;
                    this.f126813c = 1;
                    obj = i11.a(str, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C14432c cVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f126802p = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f126802p, eVar);
            bVar.f126801o = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x00ef  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x011e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f126800n
                r3 = 0
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x008f
                if (r2 == r5) goto L_0x0055
                if (r2 != r4) goto L_0x004d
                int r2 = r0.f126798l
                java.lang.Object r7 = r0.f126797k
                GB.f r7 = (GB.f) r7
                java.lang.Object r8 = r0.f126796j
                java.time.LocalDateTime r8 = (java.time.LocalDateTime) r8
                java.lang.Object r9 = r0.f126795i
                ex.b r9 = (ex.C14431b) r9
                java.lang.Object r9 = r0.f126794h
                java.lang.Object r10 = r0.f126793g
                ex.c r10 = (ex.C14432c) r10
                java.lang.Object r11 = r0.f126792f
                TJ.B r11 = (TJ.C16505B) r11
                java.lang.Object r12 = r0.f126791e
                QJ.Y r12 = (QJ.Y) r12
                java.lang.Object r13 = r0.f126790d
                QJ.Y r13 = (QJ.Y) r13
                java.lang.Object r14 = r0.f126789c
                java.lang.String r14 = (java.lang.String) r14
                java.lang.Object r15 = r0.f126801o
                QJ.Q r15 = (QJ.Q) r15
                XH.y.b(r20)
                r3 = r12
                r12 = r20
                r17 = r13
                r13 = r2
                r2 = r15
            L_0x0044:
                r15 = r17
                r18 = r10
                r10 = r9
                r9 = r18
                goto L_0x0126
            L_0x004d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0055:
                int r2 = r0.f126799m
                int r7 = r0.f126798l
                java.lang.Object r8 = r0.f126796j
                java.time.LocalDateTime r8 = (java.time.LocalDateTime) r8
                java.lang.Object r9 = r0.f126795i
                ex.b r9 = (ex.C14431b) r9
                java.lang.Object r10 = r0.f126794h
                java.lang.Object r11 = r0.f126793g
                ex.c r11 = (ex.C14432c) r11
                java.lang.Object r12 = r0.f126792f
                TJ.B r12 = (TJ.C16505B) r12
                java.lang.Object r13 = r0.f126791e
                QJ.Y r13 = (QJ.Y) r13
                java.lang.Object r14 = r0.f126790d
                QJ.Y r14 = (QJ.Y) r14
                java.lang.Object r15 = r0.f126789c
                java.lang.String r15 = (java.lang.String) r15
                java.lang.Object r4 = r0.f126801o
                QJ.Q r4 = (QJ.Q) r4
                XH.y.b(r20)
                r3 = r4
                r4 = r2
                r2 = r7
                r7 = r13
                r13 = r14
                r14 = r15
                r15 = r20
                r17 = r12
                r12 = r9
                r9 = r10
                r10 = r11
                r11 = r17
                goto L_0x00fa
            L_0x008f:
                XH.y.b(r20)
                java.lang.Object r2 = r0.f126801o
                QJ.Q r2 = (QJ.Q) r2
                ex.c r4 = r0.f126802p
                java.lang.String r4 = r4.E()
                ex.c$b$b r10 = new ex.c$b$b
                ex.c r7 = r0.f126802p
                r10.<init>(r7, r4, r6)
                r11 = 3
                r12 = 0
                r8 = 0
                r9 = 0
                r7 = r2
                QJ.Y r13 = QJ.C16314k.b(r7, r8, r9, r10, r11, r12)
                ex.c$b$a r10 = new ex.c$b$a
                ex.c r7 = r0.f126802p
                r10.<init>(r7, r4, r6)
                r7 = r2
                QJ.Y r7 = QJ.C16314k.b(r7, r8, r9, r10, r11, r12)
                ex.c r8 = r0.f126802p
                TJ.B r8 = r8.f126786r
                ex.c r9 = r0.f126802p
                r10 = r3
            L_0x00c1:
                java.lang.Object r11 = r8.getValue()
                r12 = r11
                ex.b r12 = (ex.C14431b) r12
                am.h r14 = r9.f126783o
                java.time.LocalDateTime r14 = r14.d()
                r0.f126801o = r2
                r0.f126789c = r4
                r0.f126790d = r13
                r0.f126791e = r7
                r0.f126792f = r8
                r0.f126793g = r9
                r0.f126794h = r11
                r0.f126795i = r12
                r0.f126796j = r14
                r0.f126798l = r10
                r0.f126799m = r3
                r0.f126800n = r5
                java.lang.Object r15 = r13.f(r0)
                if (r15 != r1) goto L_0x00ef
                return r1
            L_0x00ef:
                r17 = r3
                r3 = r2
                r2 = r10
                r10 = r9
                r9 = r11
                r11 = r8
                r8 = r14
                r14 = r4
                r4 = r17
            L_0x00fa:
                GB.f r15 = (GB.f) r15
                r0.f126801o = r3
                r0.f126789c = r14
                r0.f126790d = r13
                r0.f126791e = r7
                r0.f126792f = r11
                r0.f126793g = r10
                r0.f126794h = r9
                r0.f126795i = r12
                r0.f126796j = r8
                r0.f126797k = r15
                r0.f126798l = r2
                r0.f126799m = r4
                r4 = 2
                r0.f126800n = r4
                java.lang.Object r12 = r7.f(r0)
                if (r12 != r1) goto L_0x011e
                return r1
            L_0x011e:
                r17 = r13
                r13 = r2
                r2 = r3
                r3 = r7
                r7 = r15
                goto L_0x0044
            L_0x0126:
                XH.x r12 = (XH.x) r12
                java.lang.Object r12 = r12.j()
                boolean r16 = XH.x.g(r12)
                if (r16 == 0) goto L_0x0133
                r12 = r6
            L_0x0133:
                GB.e r12 = (GB.e) r12
                if (r12 != 0) goto L_0x013e
                GB.e r12 = new GB.e
                GB.e$b r4 = GB.e.b.Unknown
                r12.<init>(r4, r6)
            L_0x013e:
                ep.b r4 = r9.f126784p
                java.time.format.DateTimeFormatter r4 = r4.d()
                ex.b$a r5 = new ex.b$a
                r5.<init>(r8, r7, r12, r4)
                boolean r4 = r11.e(r10, r5)
                if (r4 == 0) goto L_0x0154
                XH.N r1 = XH.C16807N.f139792a
                return r1
            L_0x0154:
                r7 = r3
                r8 = r11
                r10 = r13
                r4 = r14
                r13 = r15
                r3 = 0
                r5 = 1
                goto L_0x00c1
            */
            throw new UnsupportedOperationException("Method not decompiled: ex.C14432c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C14432c(U u10, C12961a aVar, h hVar, C11256b bVar, C14323a aVar2) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "popularTimesRepository");
        C17542s.j(hVar, "timeProvider");
        C17542s.j(bVar, "localizedDateTimeFormatter");
        C17542s.j(aVar2, "analytics");
        this.f126781m = u10;
        this.f126782n = aVar;
        this.f126783o = hVar;
        this.f126784p = bVar;
        this.f126785q = aVar2;
        C16505B<C14431b> a10 = C16521S.a(C14431b.c.f126780a);
        this.f126786r = a10;
        this.f126787s = a10;
        D();
    }

    private final void D() {
        C14431b value;
        C16505B<C14431b> b10 = this.f126786r;
        do {
            value = b10.getValue();
            C14431b bVar = value;
        } while (!b10.e(value, C14431b.c.f126780a));
        F0 unused = C16314k.d(g0.a(this), new a(N.f137593c0, this), (T) null, new b(this, (C17164e<? super b>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final String E() {
        Object f10 = this.f126781m.f("storeId");
        if (f10 != null) {
            return (String) f10;
        }
        throw new IllegalArgumentException("storeId should not be null");
    }

    public final void F(C14430a aVar) {
        C17542s.j(aVar, "action");
        if (C17542s.e(aVar, C14430a.C3101a.f126774a)) {
            this.f126785q.b(E());
            return;
        }
        throw new t();
    }

    public C16519P<C14431b> getState() {
        return this.f126787s;
    }
}
