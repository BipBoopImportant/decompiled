package Yv;

import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Pv.r;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.x;
import XH.y;
import YH.C16877v;
import bI.C17035a;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import ep.C11256b;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kD.h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lD.C14762d;
import nD.C14846a;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import rD.C14992a;
import yv.C8996a;
import yv.C8998c;
import yv.C9008m;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\"B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H@¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0002¢\u0006\u0004\b!\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"LYv/d;", "LYv/c;", "Lyv/a;", "membershipFeatures", "LnD/a;", "userAppointmentsRepository", "Lep/b;", "localizedDateTimeFormatter", "LlD/d;", "getProfileUseCase", "<init>", "(Lyv/a;LnD/a;Lep/b;LlD/d;)V", "LTJ/g;", "", "LPv/r;", "f", "()LTJ/g;", "LXH/x;", "LrD/d;", "e", "(LdI/e;)Ljava/lang/Object;", "LrD/a;", "appointment", "LkD/h;", "profile", "LXH/v;", "Ljava/time/LocalDateTime;", "g", "(LrD/a;LkD/h;)LXH/v;", "", "dateTime", "h", "(Ljava/lang/String;)Ljava/time/LocalDateTime;", "invoke", "a", "Lyv/a;", "b", "LnD/a;", "c", "Lep/b;", "d", "LlD/d;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Yv.d  reason: case insensitive filesystem */
public final class C6736d implements C6735c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f41103e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f41104f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C8996a f41105a;

    /* renamed from: b  reason: collision with root package name */
    private final C14846a f41106b;

    /* renamed from: c  reason: collision with root package name */
    private final C11256b f41107c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C14762d f41108d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LYv/d$a;", "", "<init>", "()V", "", "DATE_PATTERN", "Ljava/lang/String;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Yv.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetAppointmentContextualCardsUseCaseImpl", f = "GetAppointmentContextualCardsUseCase.kt", l = {81}, m = "getAppointments-IoAF18A")
    /* renamed from: Yv.d$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f41109c;

        /* renamed from: d  reason: collision with root package name */
        Object f41110d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f41111e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6736d f41112f;

        /* renamed from: g  reason: collision with root package name */
        int f41113g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6736d dVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f41112f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f41111e = obj;
            this.f41113g |= Integer.MIN_VALUE;
            Object a10 = this.f41112f.e(this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "", "LPv/r;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetAppointmentContextualCardsUseCaseImpl$getContentFlow$1", f = "GetAppointmentContextualCardsUseCase.kt", l = {56, 59, 61, 69, 74}, m = "invokeSuspend")
    /* renamed from: Yv.d$c */
    static final class c extends l implements p<C16533h<? super List<? extends r>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f41114c;

        /* renamed from: d  reason: collision with root package name */
        Object f41115d;

        /* renamed from: e  reason: collision with root package name */
        Object f41116e;

        /* renamed from: f  reason: collision with root package name */
        Object f41117f;

        /* renamed from: g  reason: collision with root package name */
        Object f41118g;

        /* renamed from: h  reason: collision with root package name */
        Object f41119h;

        /* renamed from: i  reason: collision with root package name */
        Object f41120i;

        /* renamed from: j  reason: collision with root package name */
        Object f41121j;

        /* renamed from: k  reason: collision with root package name */
        Object f41122k;

        /* renamed from: l  reason: collision with root package name */
        Object f41123l;

        /* renamed from: m  reason: collision with root package name */
        Object f41124m;

        /* renamed from: n  reason: collision with root package name */
        Object f41125n;

        /* renamed from: o  reason: collision with root package name */
        int f41126o;

        /* renamed from: p  reason: collision with root package name */
        int f41127p;

        /* renamed from: q  reason: collision with root package name */
        int f41128q;

        /* renamed from: r  reason: collision with root package name */
        int f41129r;

        /* renamed from: s  reason: collision with root package name */
        int f41130s;

        /* renamed from: t  reason: collision with root package name */
        int f41131t;

        /* renamed from: u  reason: collision with root package name */
        int f41132u;

        /* renamed from: v  reason: collision with root package name */
        private /* synthetic */ Object f41133v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ C6736d f41134w;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yv.d$c$a */
        public static final class a<T> implements Comparator {
            public final int compare(T t10, T t11) {
                return C17035a.e((LocalDateTime) ((v) t10).c(), (LocalDateTime) ((v) t11).c());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6736d dVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f41134w = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f41134w, eVar);
            cVar.f41133v = obj;
            return cVar;
        }

        public final Object invoke(C16533h<? super List<r>> hVar, C17164e<? super C16807N> eVar) {
            return ((c) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.util.Iterator} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: XH.v} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: java.util.Iterator} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: java.util.Iterator} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0173  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f41132u
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                r9 = 0
                if (r2 == 0) goto L_0x008c
                if (r2 == r7) goto L_0x0082
                if (r2 == r6) goto L_0x0075
                if (r2 == r5) goto L_0x0061
                if (r2 == r4) goto L_0x0044
                if (r2 != r3) goto L_0x003c
                java.lang.Object r1 = r0.f41124m
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f41123l
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f41122k
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f41121j
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f41120i
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f41119h
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f41118g
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f41117f
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                goto L_0x005c
            L_0x003c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0044:
                java.lang.Object r1 = r0.f41123l
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f41121j
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f41120i
                java.util.Collection r1 = (java.util.Collection) r1
                java.lang.Object r1 = r0.f41119h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f41118g
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f41117f
                rD.d r1 = (rD.C14995d) r1
            L_0x005c:
                java.lang.Object r1 = r0.f41116e
                Yv.d r1 = (Yv.C6736d) r1
                goto L_0x0075
            L_0x0061:
                java.lang.Object r2 = r0.f41114c
                kD.h r2 = (kD.h) r2
                java.lang.Object r5 = r0.f41133v
                TJ.h r5 = (TJ.C16533h) r5
                XH.y.b(r21)
                r10 = r21
                XH.x r10 = (XH.x) r10
                java.lang.Object r10 = r10.j()
                goto L_0x00ce
            L_0x0075:
                java.lang.Object r1 = r0.f41114c
                kD.h r1 = (kD.h) r1
                java.lang.Object r1 = r0.f41133v
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r21)
                goto L_0x0278
            L_0x0082:
                java.lang.Object r2 = r0.f41133v
                TJ.h r2 = (TJ.C16533h) r2
                XH.y.b(r21)
                r10 = r21
                goto L_0x00a4
            L_0x008c:
                XH.y.b(r21)
                java.lang.Object r2 = r0.f41133v
                TJ.h r2 = (TJ.C16533h) r2
                Yv.d r10 = r0.f41134w
                lD.d r10 = r10.f41108d
                r0.f41133v = r2
                r0.f41132u = r7
                java.lang.Object r10 = lD.C14762d.a.a(r10, r9, r0, r7, r8)
                if (r10 != r1) goto L_0x00a4
                return r1
            L_0x00a4:
                kD.h r10 = (kD.h) r10
                if (r10 != 0) goto L_0x00b9
                java.util.List r3 = YH.C16877v.n()
                r0.f41133v = r2
                r0.f41114c = r10
                r0.f41132u = r6
                java.lang.Object r2 = r2.emit(r3, r0)
                if (r2 != r1) goto L_0x0278
                return r1
            L_0x00b9:
                Yv.d r11 = r0.f41134w
                r0.f41133v = r2
                r0.f41114c = r10
                r0.f41132u = r5
                java.lang.Object r5 = r11.e(r0)
                if (r5 != r1) goto L_0x00c8
                return r1
            L_0x00c8:
                r19 = r5
                r5 = r2
                r2 = r10
                r10 = r19
            L_0x00ce:
                Yv.d r11 = r0.f41134w
                java.lang.Throwable r15 = XH.x.e(r10)
                if (r15 != 0) goto L_0x0173
                r3 = r10
                rD.d r3 = (rD.C14995d) r3
                java.util.List r6 = r3.a()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x00e8:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x00ff
                java.lang.Object r8 = r6.next()
                r12 = r8
                rD.a r12 = (rD.C14992a) r12
                java.lang.String r12 = r12.a()
                if (r12 == 0) goto L_0x00e8
                r7.add(r8)
                goto L_0x00e8
            L_0x00ff:
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x0108:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x011e
                java.lang.Object r8 = r7.next()
                rD.a r8 = (rD.C14992a) r8
                XH.v r8 = r11.g(r8, r2)
                if (r8 == 0) goto L_0x0108
                r6.add(r8)
                goto L_0x0108
            L_0x011e:
                Yv.d$c$a r8 = new Yv.d$c$a
                r8.<init>()
                java.util.List r6 = YH.C16877v.g1(r6, r8)
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r8 = new java.util.ArrayList
                r12 = 10
                int r12 = YH.C16877v.y(r6, r12)
                r8.<init>(r12)
                java.util.Iterator r12 = r6.iterator()
            L_0x0138:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x014e
                java.lang.Object r7 = r12.next()
                XH.v r7 = (XH.v) r7
                java.lang.Object r13 = r7.d()
                Pv.r r13 = (Pv.r) r13
                r8.add(r13)
                goto L_0x0138
            L_0x014e:
                r0.f41133v = r5
                r0.f41114c = r2
                r0.f41115d = r10
                r0.f41116e = r11
                r0.f41117f = r3
                r0.f41118g = r6
                r0.f41119h = r6
                r0.f41120i = r8
                r0.f41121j = r12
                r0.f41122k = r7
                r0.f41123l = r8
                r0.f41126o = r9
                r0.f41127p = r9
                r0.f41128q = r9
                r0.f41132u = r4
                java.lang.Object r2 = r5.emit(r8, r0)
                if (r2 != r1) goto L_0x0278
                return r1
            L_0x0173:
                qv.e r4 = qv.e.DEBUG
                qv.d r12 = qv.d.f102012a
                java.util.List r12 = r12.a()
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r12 = r12.iterator()
            L_0x0186:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x019e
                java.lang.Object r13 = r12.next()
                r3 = r13
                qv.b r3 = (qv.C11819b) r3
                boolean r3 = r3.b(r4, r9)
                if (r3 == 0) goto L_0x019c
                r14.add(r13)
            L_0x019c:
                r3 = 5
                goto L_0x0186
            L_0x019e:
                java.util.Iterator r3 = r14.iterator()
                r12 = r8
                r13 = r12
                r16 = r14
            L_0x01a6:
                boolean r17 = r3.hasNext()
                if (r17 == 0) goto L_0x023c
                java.lang.Object r18 = r3.next()
                r16 = r18
                qv.b r16 = (qv.C11819b) r16
                if (r12 != 0) goto L_0x01c9
                java.lang.String r9 = "Failed to fetch appointments"
                java.lang.String r9 = qv.C11818a.a(r9, r15)
                if (r9 != 0) goto L_0x01c5
                r6 = r14
                r21 = r15
                r7 = r18
                goto L_0x0241
            L_0x01c5:
                java.lang.String r12 = qv.C11820c.a(r9)
            L_0x01c9:
                r9 = r12
                if (r13 != 0) goto L_0x021c
                java.lang.Class r12 = r5.getClass()
                java.lang.String r12 = r12.getName()
                kotlin.jvm.internal.C17542s.g(r12)
                r13 = 36
                java.lang.String r13 = HJ.C15854t.s1(r12, r13, r8, r6, r8)
                r7 = 46
                java.lang.String r7 = HJ.C15854t.o1(r13, r7, r8, r6, r8)
                int r13 = r7.length()
                if (r13 != 0) goto L_0x01ea
                goto L_0x01f0
            L_0x01ea:
                java.lang.String r12 = "Kt"
                java.lang.String r12 = HJ.C15854t.P0(r7, r12)
            L_0x01f0:
                java.lang.Thread r7 = java.lang.Thread.currentThread()
                java.lang.String r7 = r7.getName()
                java.lang.String r13 = "main"
                r6 = 1
                boolean r7 = HJ.C15854t.b0(r7, r13, r6)
                if (r7 == 0) goto L_0x0204
                java.lang.String r7 = "m"
                goto L_0x0206
            L_0x0204:
                java.lang.String r7 = "b"
            L_0x0206:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r7)
                java.lang.String r7 = "|"
                r13.append(r7)
                r13.append(r12)
                java.lang.String r13 = r13.toString()
            L_0x021a:
                r7 = r13
                goto L_0x021e
            L_0x021c:
                r6 = r7
                goto L_0x021a
            L_0x021e:
                r17 = 0
                r12 = r16
                r13 = r4
                r6 = r14
                r14 = r7
                r21 = r15
                r15 = r17
                r16 = r21
                r17 = r9
                r12.a(r13, r14, r15, r16, r17)
                r15 = r21
                r14 = r6
                r13 = r7
                r12 = r9
                r16 = r18
                r6 = 2
                r7 = 1
                r9 = 0
                goto L_0x01a6
            L_0x023c:
                r6 = r14
                r21 = r15
                r7 = r16
            L_0x0241:
                java.util.List r8 = YH.C16877v.n()
                r0.f41133v = r5
                r0.f41114c = r2
                r0.f41115d = r10
                r0.f41116e = r11
                r2 = r21
                r0.f41117f = r2
                r0.f41118g = r5
                r0.f41119h = r5
                r0.f41120i = r4
                r0.f41121j = r12
                r0.f41122k = r13
                r0.f41123l = r6
                r0.f41124m = r3
                r0.f41125n = r7
                r2 = 0
                r0.f41126o = r2
                r0.f41127p = r2
                r0.f41128q = r2
                r0.f41129r = r2
                r0.f41130s = r2
                r0.f41131t = r2
                r2 = 5
                r0.f41132u = r2
                java.lang.Object r2 = r5.emit(r8, r0)
                if (r2 != r1) goto L_0x0278
                return r1
            L_0x0278:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Yv.C6736d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetAppointmentContextualCardsUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetAppointmentContextualCardsUseCase.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: Yv.d$d  reason: collision with other inner class name */
    public static final class C0699d extends l implements q<C16533h<? super List<? extends r>>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f41135c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f41136d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f41137e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6736d f41138f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0699d(C17164e eVar, C6736d dVar) {
            super(3, eVar);
            this.f41138f = dVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super List<? extends r>> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            C0699d dVar = new C0699d(eVar, this.f41138f);
            dVar.f41136d = hVar;
            dVar.f41137e = bool;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f41135c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f41136d;
                C16532g b10 = ((Boolean) this.f41137e).booleanValue() ? this.f41138f.f() : C16534i.J(C16877v.n());
                this.f41135c = 1;
                if (C16534i.x(hVar, b10, this) == f10) {
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

    public C6736d(C8996a aVar, C14846a aVar2, C11256b bVar, C14762d dVar) {
        C17542s.j(aVar, "membershipFeatures");
        C17542s.j(aVar2, "userAppointmentsRepository");
        C17542s.j(bVar, "localizedDateTimeFormatter");
        C17542s.j(dVar, "getProfileUseCase");
        this.f41105a = aVar;
        this.f41106b = aVar2;
        this.f41107c = bVar;
        this.f41108d = dVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(dI.C17164e<? super XH.x<rD.C14995d>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Yv.C6736d.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Yv.d$b r0 = (Yv.C6736d.b) r0
            int r1 = r0.f41113g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f41113g = r1
            goto L_0x0018
        L_0x0013:
            Yv.d$b r0 = new Yv.d$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f41111e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f41113g
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f41110d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f41109c
            Yv.d r6 = (Yv.C6736d) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0051
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003f:
            XH.y.b(r1)
            nD.a r1 = r5.f41106b
            r0.f41109c = r5
            r0.f41110d = r6
            r0.f41113g = r4
            java.lang.Object r6 = r1.a(r0)
            if (r6 != r2) goto L_0x0051
            return r2
        L_0x0051:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Yv.C6736d.e(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final C16532g<List<r>> f() {
        return C16534i.H(new c(this, (C17164e<? super c>) null));
    }

    /* access modifiers changed from: private */
    public final v<LocalDateTime, r> g(C14992a aVar, h hVar) {
        C13023e eVar;
        LocalDateTime h10 = h(aVar.c());
        if (h10 == null) {
            return null;
        }
        Ov.a aVar2 = Ov.a.f39315a;
        String b10 = aVar.b();
        if (b10 == null || (eVar = C13026h.c(b10)) == null) {
            eVar = C13026h.a(C9008m.f58132E);
        }
        return C16796C.a(h10, aVar2.c(String.valueOf(aVar.a()), hVar.b(), C13026h.b(C9008m.f58131D, this.f41107c.b(h10, "MMMMd"), this.f41107c.a(h10)), eVar));
    }

    private final LocalDateTime h(String str) {
        if (str == null) {
            return null;
        }
        try {
            return LocalDateTime.ofInstant(Instant.parse(str), ZoneId.systemDefault());
        } catch (DateTimeParseException e10) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Could not parse date: " + str, e10);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        return null;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = C6736d.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
            return null;
        }
    }

    public C16532g<List<r>> invoke() {
        return C16534i.s(C16534i.g0(C8998c.b(this.f41105a), new C0699d((C17164e) null, this)));
    }
}
