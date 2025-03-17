package Sx;

import Ae.e;
import Ae.j;
import Lx.c;
import XH.C16796C;
import XH.C16807N;
import YH.X;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pv.C11781a;
import pv.C11782b;
import pv.C11784d;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0000\u0018\u0000 )2\u00020\u0001:\u00016BM\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H@¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH@¢\u0006\u0004\b!\u0010\"J(\u0010&\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001aH@¢\u0006\u0004\b&\u0010'J(\u0010)\u001a\u00020 2\u0006\u0010$\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001aH@¢\u0006\u0004\b)\u0010*J0\u0010,\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0014H@¢\u0006\u0004\b,\u0010-J(\u00100\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020.H@¢\u0006\u0004\b0\u00101J'\u00102\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0014H@¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010>R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010?R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010@¨\u0006A"}, d2 = {"LSx/b;", "", "LAe/e;", "analytics", "", "", "LRx/b;", "notificationFeatures", "LZx/b;", "pushNotificationContract", "Lpv/a;", "localNotification", "LLx/b;", "pushNotificationAnalytics", "LVx/a;", "localNotificationIntentFactory", "LVx/c;", "pushNotificationsValidator", "<init>", "(LAe/e;Ljava/util/Map;LZx/b;Lpv/a;LLx/b;LVx/a;LVx/c;)V", "LSx/c;", "pushMessage", "purpose", "type", "Lpv/b;", "localNotificationChannel", "Lpv/d;", "e", "(LSx/c;Ljava/lang/String;Ljava/lang/String;Lpv/b;LdI/e;)Ljava/lang/Object;", "errorMessage", "LLx/a;", "bounceError", "LXH/N;", "j", "(LSx/c;Ljava/lang/String;LLx/a;LdI/e;)Ljava/lang/Object;", "LRx/a;", "feature", "messageData", "f", "(LRx/a;LSx/c;Lpv/d;LdI/e;)Ljava/lang/Object;", "LRx/c;", "h", "(LRx/c;LSx/c;Lpv/d;LdI/e;)Ljava/lang/Object;", "contentUri", "l", "(LRx/b;Ljava/lang/String;Lpv/d;LSx/c;LdI/e;)Ljava/lang/Object;", "", "shouldTrackToPushAnalytics", "i", "(LSx/c;Lpv/d;ZLdI/e;)Ljava/lang/Object;", "k", "(LRx/b;LSx/c;Ljava/lang/String;)V", "g", "(LSx/c;LdI/e;)Ljava/lang/Object;", "a", "LAe/e;", "b", "Ljava/util/Map;", "c", "LZx/b;", "d", "Lpv/a;", "LLx/b;", "LVx/a;", "LVx/c;", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f116551h = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Ae.e f116552a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Rx.b> f116553b;

    /* renamed from: c  reason: collision with root package name */
    private final Zx.b f116554c;

    /* renamed from: d  reason: collision with root package name */
    private final C11781a f116555d;

    /* renamed from: e  reason: collision with root package name */
    private final Lx.b f116556e;

    /* renamed from: f  reason: collision with root package name */
    private final Vx.a f116557f;

    /* renamed from: g  reason: collision with root package name */
    private final Vx.c f116558g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LSx/b$a;", "", "<init>", "()V", "", "TYPE_KEY", "Ljava/lang/String;", "STAND_ALONE_PURPOSE", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.pushnotification.impl.MessageHandler", f = "MessageHandler.kt", l = {103}, m = "getMessageData")
    /* renamed from: Sx.b$b  reason: collision with other inner class name */
    static final class C2849b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f116559c;

        /* renamed from: d  reason: collision with root package name */
        Object f116560d;

        /* renamed from: e  reason: collision with root package name */
        Object f116561e;

        /* renamed from: f  reason: collision with root package name */
        Object f116562f;

        /* renamed from: g  reason: collision with root package name */
        Object f116563g;

        /* renamed from: h  reason: collision with root package name */
        Object f116564h;

        /* renamed from: i  reason: collision with root package name */
        Object f116565i;

        /* renamed from: j  reason: collision with root package name */
        Object f116566j;

        /* renamed from: k  reason: collision with root package name */
        Object f116567k;

        /* renamed from: l  reason: collision with root package name */
        Object f116568l;

        /* renamed from: m  reason: collision with root package name */
        Object f116569m;

        /* renamed from: n  reason: collision with root package name */
        Object f116570n;

        /* renamed from: o  reason: collision with root package name */
        Object f116571o;

        /* renamed from: p  reason: collision with root package name */
        Object f116572p;

        /* renamed from: q  reason: collision with root package name */
        Object f116573q;

        /* renamed from: r  reason: collision with root package name */
        int f116574r;

        /* renamed from: s  reason: collision with root package name */
        int f116575s;

        /* renamed from: t  reason: collision with root package name */
        int f116576t;

        /* renamed from: u  reason: collision with root package name */
        int f116577u;

        /* renamed from: v  reason: collision with root package name */
        int f116578v;

        /* renamed from: w  reason: collision with root package name */
        /* synthetic */ Object f116579w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ b f116580x;

        /* renamed from: y  reason: collision with root package name */
        int f116581y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2849b(b bVar, C17164e<? super C2849b> eVar) {
            super(eVar);
            this.f116580x = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f116579w = obj;
            this.f116581y |= Integer.MIN_VALUE;
            return this.f116580x.e((c) null, (String) null, (String) null, (C11782b) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.pushnotification.impl.MessageHandler", f = "MessageHandler.kt", l = {131, 143}, m = "handleInboxMessage")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f116582c;

        /* renamed from: d  reason: collision with root package name */
        Object f116583d;

        /* renamed from: e  reason: collision with root package name */
        Object f116584e;

        /* renamed from: f  reason: collision with root package name */
        Object f116585f;

        /* renamed from: g  reason: collision with root package name */
        Object f116586g;

        /* renamed from: h  reason: collision with root package name */
        Object f116587h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f116588i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b f116589j;

        /* renamed from: k  reason: collision with root package name */
        int f116590k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f116589j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f116588i = obj;
            this.f116590k |= Integer.MIN_VALUE;
            return this.f116589j.f((Rx.a) null, (c) null, (C11784d) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.pushnotification.impl.MessageHandler", f = "MessageHandler.kt", l = {47, 58, 66, 72, 77, 83}, m = "handleMessage")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f116591c;

        /* renamed from: d  reason: collision with root package name */
        Object f116592d;

        /* renamed from: e  reason: collision with root package name */
        Object f116593e;

        /* renamed from: f  reason: collision with root package name */
        Object f116594f;

        /* renamed from: g  reason: collision with root package name */
        Object f116595g;

        /* renamed from: h  reason: collision with root package name */
        Object f116596h;

        /* renamed from: i  reason: collision with root package name */
        Object f116597i;

        /* renamed from: j  reason: collision with root package name */
        Object f116598j;

        /* renamed from: k  reason: collision with root package name */
        Object f116599k;

        /* renamed from: l  reason: collision with root package name */
        Object f116600l;

        /* renamed from: m  reason: collision with root package name */
        Object f116601m;

        /* renamed from: n  reason: collision with root package name */
        Object f116602n;

        /* renamed from: o  reason: collision with root package name */
        Object f116603o;

        /* renamed from: p  reason: collision with root package name */
        Object f116604p;

        /* renamed from: q  reason: collision with root package name */
        int f116605q;

        /* renamed from: r  reason: collision with root package name */
        int f116606r;

        /* renamed from: s  reason: collision with root package name */
        int f116607s;

        /* renamed from: t  reason: collision with root package name */
        int f116608t;

        /* renamed from: u  reason: collision with root package name */
        int f116609u;

        /* renamed from: v  reason: collision with root package name */
        /* synthetic */ Object f116610v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ b f116611w;

        /* renamed from: x  reason: collision with root package name */
        int f116612x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f116611w = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f116610v = obj;
            this.f116612x |= Integer.MIN_VALUE;
            return this.f116611w.g((c) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.pushnotification.impl.MessageHandler", f = "MessageHandler.kt", l = {205, 220, 233}, m = "isNotificationChannelDisabledAndTrackPushAnalytics")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f116613c;

        /* renamed from: d  reason: collision with root package name */
        Object f116614d;

        /* renamed from: e  reason: collision with root package name */
        Object f116615e;

        /* renamed from: f  reason: collision with root package name */
        Object f116616f;

        /* renamed from: g  reason: collision with root package name */
        boolean f116617g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f116618h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b f116619i;

        /* renamed from: j  reason: collision with root package name */
        int f116620j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f116619i = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f116618h = obj;
            this.f116620j |= Integer.MIN_VALUE;
            return this.f116619i.i((c) null, (C11784d) null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.pushnotification.impl.MessageHandler", f = "MessageHandler.kt", l = {174}, m = "tryShowNotification")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f116621c;

        /* renamed from: d  reason: collision with root package name */
        Object f116622d;

        /* renamed from: e  reason: collision with root package name */
        Object f116623e;

        /* renamed from: f  reason: collision with root package name */
        Object f116624f;

        /* renamed from: g  reason: collision with root package name */
        Object f116625g;

        /* renamed from: h  reason: collision with root package name */
        Object f116626h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f116627i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b f116628j;

        /* renamed from: k  reason: collision with root package name */
        int f116629k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f116628j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f116627i = obj;
            this.f116629k |= Integer.MIN_VALUE;
            return this.f116628j.l((Rx.b) null, (String) null, (C11784d) null, (c) null, this);
        }
    }

    public b(Ae.e eVar, Map<String, Rx.b> map, Zx.b bVar, C11781a aVar, Lx.b bVar2, Vx.a aVar2, Vx.c cVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(map, "notificationFeatures");
        C17542s.j(bVar, "pushNotificationContract");
        C17542s.j(aVar, "localNotification");
        C17542s.j(bVar2, "pushNotificationAnalytics");
        C17542s.j(aVar2, "localNotificationIntentFactory");
        C17542s.j(cVar, "pushNotificationsValidator");
        this.f116552a = eVar;
        this.f116553b = map;
        this.f116554c = bVar;
        this.f116555d = aVar;
        this.f116556e = bVar2;
        this.f116557f = aVar2;
        this.f116558g = cVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(Sx.c r23, java.lang.String r24, java.lang.String r25, pv.C11782b r26, dI.C17164e<? super pv.C11784d> r27) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            boolean r6 = r5 instanceof Sx.b.C2849b
            if (r6 == 0) goto L_0x001f
            r6 = r5
            Sx.b$b r6 = (Sx.b.C2849b) r6
            int r7 = r6.f116581y
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001f
            int r7 = r7 - r8
            r6.f116581y = r7
            goto L_0x0024
        L_0x001f:
            Sx.b$b r6 = new Sx.b$b
            r6.<init>(r0, r5)
        L_0x0024:
            java.lang.Object r7 = r6.f116579w
            java.lang.Object r8 = eI.C17187b.f()
            int r9 = r6.f116581y
            r10 = 1
            if (r9 == 0) goto L_0x0076
            if (r9 != r10) goto L_0x006e
            java.lang.Object r1 = r6.f116572p
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r6.f116571o
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r6.f116570n
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f116569m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f116568l
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r6.f116567k
            Sx.b r1 = (Sx.b) r1
            java.lang.Object r1 = r6.f116566j
            Sx.b r1 = (Sx.b) r1
            java.lang.Object r1 = r6.f116565i
            pv.d r1 = (pv.C11784d) r1
            java.lang.Object r2 = r6.f116564h
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r6.f116563g
            pv.b r2 = (pv.C11782b) r2
            java.lang.Object r2 = r6.f116562f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r6.f116561e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r6.f116560d
            Sx.c r2 = (Sx.c) r2
            java.lang.Object r2 = r6.f116559c
            Sx.b r2 = (Sx.b) r2
            XH.y.b(r7)
            goto L_0x019b
        L_0x006e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0076:
            XH.y.b(r7)
            Sx.d r7 = Sx.d.f116634a
            java.util.Map r9 = r23.a()
            pv.c r11 = pv.C11783c.Push
            pv.d r7 = r7.a(r9, r2, r11, r4)
            if (r7 != 0) goto L_0x019c
            qv.e r9 = qv.e.WARN
            qv.d r11 = qv.d.f102012a
            java.util.List r11 = r11.a()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x009a:
            boolean r12 = r11.hasNext()
            r14 = 0
            if (r12 == 0) goto L_0x00b2
            java.lang.Object r12 = r11.next()
            r13 = r12
            qv.b r13 = (qv.C11819b) r13
            boolean r13 = r13.b(r9, r14)
            if (r13 == 0) goto L_0x009a
            r15.add(r12)
            goto L_0x009a
        L_0x00b2:
            java.util.Iterator r13 = r15.iterator()
            r17 = r15
            r11 = 0
            r14 = 0
        L_0x00ba:
            boolean r18 = r13.hasNext()
            if (r18 == 0) goto L_0x00d3
            java.lang.Object r17 = r13.next()
            r18 = r17
            qv.b r18 = (qv.C11819b) r18
            r10 = 0
            if (r11 != 0) goto L_0x00de
            java.lang.String r12 = "Incomplete message data"
            java.lang.String r12 = qv.C11818a.a(r12, r10)
            if (r12 != 0) goto L_0x00da
        L_0x00d3:
            r21 = r13
            r10 = r15
            r12 = r17
            goto L_0x0152
        L_0x00da:
            java.lang.String r11 = qv.C11820c.a(r12)
        L_0x00de:
            r20 = r11
            if (r14 != 0) goto L_0x0134
            java.lang.Class<Sx.b> r11 = Sx.b.class
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            r12 = 36
            r14 = 2
            r10 = 0
            java.lang.String r12 = HJ.C15854t.s1(r11, r12, r10, r14, r10)
            r19 = r11
            r11 = 46
            java.lang.String r11 = HJ.C15854t.o1(r12, r11, r10, r14, r10)
            int r12 = r11.length()
            if (r12 != 0) goto L_0x0104
            r11 = r19
            goto L_0x010a
        L_0x0104:
            java.lang.String r12 = "Kt"
            java.lang.String r11 = HJ.C15854t.P0(r11, r12)
        L_0x010a:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            java.lang.String r14 = "main"
            r10 = 1
            boolean r12 = HJ.C15854t.b0(r12, r14, r10)
            if (r12 == 0) goto L_0x011e
            java.lang.String r10 = "m"
            goto L_0x0120
        L_0x011e:
            java.lang.String r10 = "b"
        L_0x0120:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            java.lang.String r10 = "|"
            r12.append(r10)
            r12.append(r11)
            java.lang.String r14 = r12.toString()
        L_0x0134:
            r10 = r14
            r14 = 0
            r11 = r18
            r18 = 0
            r12 = r9
            r21 = r13
            r13 = r10
            r19 = r10
            r10 = 0
            r10 = r15
            r15 = 0
            r16 = r20
            r11.a(r12, r13, r14, r15, r16)
            r15 = r10
            r14 = r19
            r11 = r20
            r13 = r21
            r10 = 1
            goto L_0x00ba
        L_0x0152:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "Message has incomplete message data: "
            r13.append(r15)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
            Lx.a r15 = Lx.a.APP_ERROR
            r6.f116559c = r0
            r6.f116560d = r1
            r6.f116561e = r2
            r6.f116562f = r3
            r6.f116563g = r4
            r6.f116564h = r5
            r6.f116565i = r7
            r6.f116566j = r0
            r6.f116567k = r0
            r6.f116568l = r9
            r6.f116569m = r11
            r6.f116570n = r14
            r6.f116571o = r10
            r2 = r21
            r6.f116572p = r2
            r6.f116573q = r12
            r2 = 0
            r6.f116574r = r2
            r6.f116575s = r2
            r6.f116576t = r2
            r6.f116577u = r2
            r6.f116578v = r2
            r2 = 1
            r6.f116581y = r2
            java.lang.Object r1 = r0.j(r1, r13, r15, r6)
            if (r1 != r8) goto L_0x019a
            return r8
        L_0x019a:
            r1 = r7
        L_0x019b:
            r7 = r1
        L_0x019c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Sx.b.e(Sx.c, java.lang.String, java.lang.String, pv.b, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(Rx.a r22, Sx.c r23, pv.C11784d r24, dI.C17164e<? super XH.C16807N> r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r25
            boolean r3 = r2 instanceof Sx.b.c
            if (r3 == 0) goto L_0x001a
            r3 = r2
            Sx.b$c r3 = (Sx.b.c) r3
            int r4 = r3.f116590k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.f116590k = r4
        L_0x0018:
            r9 = r3
            goto L_0x0020
        L_0x001a:
            Sx.b$c r3 = new Sx.b$c
            r3.<init>(r0, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r3 = r9.f116588i
            java.lang.Object r10 = eI.C17187b.f()
            int r4 = r9.f116590k
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0070
            if (r4 == r6) goto L_0x0055
            if (r4 != r5) goto L_0x004d
            java.lang.Object r1 = r9.f116587h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f116586g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r9.f116585f
            pv.d r1 = (pv.C11784d) r1
            java.lang.Object r1 = r9.f116584e
            Sx.c r1 = (Sx.c) r1
            java.lang.Object r1 = r9.f116583d
            Rx.a r1 = (Rx.a) r1
            java.lang.Object r1 = r9.f116582c
            Sx.b r1 = (Sx.b) r1
            XH.y.b(r3)
            goto L_0x00d0
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0055:
            java.lang.Object r1 = r9.f116586g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r9.f116585f
            pv.d r2 = (pv.C11784d) r2
            java.lang.Object r4 = r9.f116584e
            Sx.c r4 = (Sx.c) r4
            java.lang.Object r6 = r9.f116583d
            Rx.a r6 = (Rx.a) r6
            java.lang.Object r7 = r9.f116582c
            Sx.b r7 = (Sx.b) r7
            XH.y.b(r3)
            r8 = r4
            r4 = r7
            r7 = r2
            goto L_0x00b6
        L_0x0070:
            XH.y.b(r3)
            Zx.b r3 = r0.f116554c
            Zx.a r4 = new Zx.a
            java.lang.String r12 = r24.g()
            java.lang.String r13 = r24.a()
            java.lang.String r14 = r24.b()
            java.lang.String r15 = r24.d()
            long r16 = r23.b()
            java.util.Map r18 = r23.a()
            java.lang.String r19 = r24.e()
            r11 = r4
            r11.<init>(r12, r13, r14, r15, r16, r18, r19)
            r9.f116582c = r0
            r9.f116583d = r1
            r7 = r23
            r9.f116584e = r7
            r8 = r24
            r9.f116585f = r8
            r9.f116586g = r2
            r9.f116590k = r6
            java.lang.Object r3 = r3.a(r1, r4, r9)
            if (r3 != r10) goto L_0x00ae
            return r10
        L_0x00ae:
            r4 = r0
            r6 = r1
            r1 = r2
            r20 = r8
            r8 = r7
            r7 = r20
        L_0x00b6:
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2
            r9.f116582c = r4
            r9.f116583d = r6
            r9.f116584e = r8
            r9.f116585f = r7
            r9.f116586g = r1
            r9.f116587h = r2
            r9.f116590k = r5
            r5 = r6
            r6 = r2
            java.lang.Object r1 = r4.l(r5, r6, r7, r8, r9)
            if (r1 != r10) goto L_0x00d0
            return r10
        L_0x00d0:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Sx.b.f(Rx.a, Sx.c, pv.d, dI.e):java.lang.Object");
    }

    private final Object h(Rx.c cVar, c cVar2, C11784d dVar, C17164e<? super C16807N> eVar) {
        Object l10 = l(cVar, cVar.i(cVar2.a(), dVar.d()), dVar, cVar2, eVar);
        return l10 == C17187b.f() ? l10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(Sx.c r10, pv.C11784d r11, boolean r12, dI.C17164e<? super java.lang.Boolean> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof Sx.b.e
            if (r0 == 0) goto L_0x0013
            r0 = r13
            Sx.b$e r0 = (Sx.b.e) r0
            int r1 = r0.f116620j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f116620j = r1
            goto L_0x0018
        L_0x0013:
            Sx.b$e r0 = new Sx.b$e
            r0.<init>(r9, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f116618h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f116620j
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x005d
            if (r3 == r6) goto L_0x0048
            if (r3 == r5) goto L_0x0048
            if (r3 != r4) goto L_0x0040
            java.lang.Object r10 = r0.f116616f
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f116615e
            pv.d r10 = (pv.C11784d) r10
            java.lang.Object r10 = r0.f116614d
            Sx.c r10 = (Sx.c) r10
            java.lang.Object r10 = r0.f116613c
            Sx.b r10 = (Sx.b) r10
            XH.y.b(r1)
            goto L_0x00e0
        L_0x0040:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0048:
            java.lang.Object r10 = r0.f116616f
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f116615e
            pv.d r10 = (pv.C11784d) r10
            java.lang.Object r10 = r0.f116614d
            Sx.c r10 = (Sx.c) r10
            java.lang.Object r10 = r0.f116613c
            Sx.b r10 = (Sx.b) r10
            XH.y.b(r1)
            goto L_0x00e1
        L_0x005d:
            XH.y.b(r1)
            Vx.c r1 = r9.f116558g
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x008c
            if (r12 == 0) goto L_0x00e1
            Lx.b r1 = r9.f116556e
            Lx.c$a r3 = new Lx.c$a
            Lx.a r4 = Lx.a.APP_DISABLED
            java.util.Map r5 = r10.a()
            java.lang.String r7 = "Notifications are disabled"
            r3.<init>(r4, r7, r5)
            r0.f116613c = r9
            r0.f116614d = r10
            r0.f116615e = r11
            r0.f116616f = r13
            r0.f116617g = r12
            r0.f116620j = r6
            java.lang.Object r10 = r1.a(r3, r0)
            if (r10 != r2) goto L_0x00e1
            return r2
        L_0x008c:
            Vx.c r1 = r9.f116558g
            pv.b r3 = r11.c()
            java.lang.String r3 = r3.a()
            boolean r1 = r1.b(r3)
            if (r1 == 0) goto L_0x00c0
            if (r12 == 0) goto L_0x00e1
            Lx.b r1 = r9.f116556e
            Lx.c$a r3 = new Lx.c$a
            Lx.a r4 = Lx.a.APP_FILTERED
            java.util.Map r7 = r10.a()
            java.lang.String r8 = "Notification channel is disabled."
            r3.<init>(r4, r8, r7)
            r0.f116613c = r9
            r0.f116614d = r10
            r0.f116615e = r11
            r0.f116616f = r13
            r0.f116617g = r12
            r0.f116620j = r5
            java.lang.Object r10 = r1.a(r3, r0)
            if (r10 != r2) goto L_0x00e1
            return r2
        L_0x00c0:
            if (r12 == 0) goto L_0x00e0
            Lx.b r1 = r9.f116556e
            Lx.c$c r3 = new Lx.c$c
            java.util.Map r5 = r10.a()
            r3.<init>(r5)
            r0.f116613c = r9
            r0.f116614d = r10
            r0.f116615e = r11
            r0.f116616f = r13
            r0.f116617g = r12
            r0.f116620j = r4
            java.lang.Object r10 = r1.a(r3, r0)
            if (r10 != r2) goto L_0x00e0
            return r2
        L_0x00e0:
            r6 = 0
        L_0x00e1:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Sx.b.i(Sx.c, pv.d, boolean, dI.e):java.lang.Object");
    }

    private final Object j(c cVar, String str, Lx.a aVar, C17164e<? super C16807N> eVar) {
        Object a10 = this.f116556e.a(new c.a(aVar, str, cVar.a()), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    private final void k(Rx.b bVar, c cVar, String str) {
        Map p10 = X.p(C16796C.a("component_value", str));
        p10.putAll(bVar.g(cVar.a()));
        e.c.c(this.f116552a, j.PUSH_NOTIFICATION.b(), p10, bVar.c(), (e.b) null, 8, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(Rx.b r16, java.lang.String r17, pv.C11784d r18, Sx.c r19, dI.C17164e<? super XH.C16807N> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = r3 instanceof Sx.b.f
            if (r4 == 0) goto L_0x001a
            r4 = r3
            Sx.b$f r4 = (Sx.b.f) r4
            int r5 = r4.f116629k
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001a
            int r5 = r5 - r6
            r4.f116629k = r5
            goto L_0x001f
        L_0x001a:
            Sx.b$f r4 = new Sx.b$f
            r4.<init>(r15, r3)
        L_0x001f:
            java.lang.Object r5 = r4.f116627i
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.f116629k
            r8 = 1
            if (r7 == 0) goto L_0x0050
            if (r7 != r8) goto L_0x0048
            java.lang.Object r1 = r4.f116626h
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r4.f116625g
            Sx.c r1 = (Sx.c) r1
            java.lang.Object r1 = r4.f116624f
            pv.d r1 = (pv.C11784d) r1
            java.lang.Object r2 = r4.f116623e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.f116622d
            Rx.b r3 = (Rx.b) r3
            java.lang.Object r4 = r4.f116621c
            Sx.b r4 = (Sx.b) r4
            XH.y.b(r5)
            goto L_0x0073
        L_0x0048:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0050:
            XH.y.b(r5)
            boolean r5 = r16.f()
            r4.f116621c = r0
            r7 = r16
            r4.f116622d = r7
            r9 = r17
            r4.f116623e = r9
            r4.f116624f = r1
            r4.f116625g = r2
            r4.f116626h = r3
            r4.f116629k = r8
            java.lang.Object r5 = r15.i(r2, r1, r5, r4)
            if (r5 != r6) goto L_0x0070
            return r6
        L_0x0070:
            r4 = r0
            r3 = r7
            r2 = r9
        L_0x0073:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0141
            qv.e r2 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x008e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00a6
            java.lang.Object r6 = r3.next()
            r7 = r6
            qv.b r7 = (qv.C11819b) r7
            r9 = 0
            boolean r7 = r7.b(r2, r9)
            if (r7 == 0) goto L_0x008e
            r5.add(r6)
            goto L_0x008e
        L_0x00a6:
            java.util.Iterator r3 = r5.iterator()
            r5 = 0
            r6 = r5
            r7 = r6
        L_0x00ad:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x013e
            java.lang.Object r9 = r3.next()
            qv.b r9 = (qv.C11819b) r9
            r13 = 0
            if (r6 != 0) goto L_0x00e5
            pv.b r6 = r1.c()
            java.lang.String r6 = r6.a()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Notification channel, "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r6 = " is disabled"
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            java.lang.String r6 = qv.C11818a.a(r6, r13)
            if (r6 != 0) goto L_0x00e1
            goto L_0x013e
        L_0x00e1:
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x00e5:
            if (r7 != 0) goto L_0x0135
            java.lang.Class r7 = r4.getClass()
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r10 = 36
            r11 = 2
            java.lang.String r10 = HJ.C15854t.s1(r7, r10, r5, r11, r5)
            r12 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r12, r5, r11, r5)
            int r11 = r10.length()
            if (r11 != 0) goto L_0x0106
            goto L_0x010c
        L_0x0106:
            java.lang.String r7 = "Kt"
            java.lang.String r7 = HJ.C15854t.P0(r10, r7)
        L_0x010c:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "main"
            boolean r10 = HJ.C15854t.b0(r10, r11, r8)
            if (r10 == 0) goto L_0x011f
            java.lang.String r10 = "m"
            goto L_0x0121
        L_0x011f:
            java.lang.String r10 = "b"
        L_0x0121:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r10 = "|"
            r11.append(r10)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
        L_0x0135:
            r12 = 0
            r10 = r2
            r11 = r7
            r14 = r6
            r9.a(r10, r11, r12, r13, r14)
            goto L_0x00ad
        L_0x013e:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x0141:
            pv.a r5 = r4.f116555d
            Vx.a r4 = r4.f116557f
            java.lang.String r6 = r1.d()
            int r6 = r6.hashCode()
            android.app.PendingIntent r2 = r4.a(r6, r2)
            int r3 = r3.h()
            r5.b(r2, r1, r3)
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Sx.b.l(Rx.b, java.lang.String, pv.d, Sx.c, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x04a3, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x05eb, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0655, code lost:
        r0 = (pv.C11784d) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0657, code lost:
        if (r0 != null) goto L_0x065c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x065b, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x065c, code lost:
        r9.f116591c = r5;
        r9.f116592d = r7;
        r9.f116593e = r8;
        r9.f116594f = r14;
        r9.f116595g = r1;
        r9.f116596h = r0;
        r9.f116597i = r0;
        r9.f116598j = r3;
        r9.f116599k = r2;
        r9.f116600l = r12;
        r9.f116601m = r6;
        r9.f116602n = r15;
        r9.f116603o = r13;
        r9.f116604p = r11;
        r9.f116605q = r10;
        r9.f116606r = r4;
        r9.f116607s = r17;
        r9.f116608t = r16;
        r9.f116612x = 4;
        r6 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0694, code lost:
        if (r5.h((Rx.c) r1, r7, r0, r9) != r6) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0696, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0697, code lost:
        r4 = r5;
        r3 = r7;
        r2 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x069a, code lost:
        r4.k(r1, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0715, code lost:
        r0 = (pv.C11784d) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0717, code lost:
        if (r0 != null) goto L_0x071c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x071b, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x071c, code lost:
        r9.f116591c = r5;
        r9.f116592d = r7;
        r9.f116593e = r8;
        r9.f116594f = r14;
        r9.f116595g = r1;
        r9.f116596h = r0;
        r9.f116597i = r0;
        r9.f116598j = r3;
        r9.f116599k = r2;
        r9.f116600l = r6;
        r9.f116601m = r12;
        r9.f116602n = r15;
        r9.f116603o = r13;
        r9.f116604p = r11;
        r9.f116605q = r10;
        r9.f116606r = r4;
        r9.f116607s = r17;
        r9.f116608t = r16;
        r9.f116612x = 6;
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0754, code lost:
        if (r5.f((Rx.a) r1, r7, r0, r9) != r2) goto L_0x0757;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0756, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0757, code lost:
        r4 = r5;
        r3 = r7;
        r2 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x075a, code lost:
        r4.k(r1, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x075f, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(Sx.c r36, dI.C17164e<? super XH.C16807N> r37) {
        /*
            r35 = this;
            r6 = r35
            r7 = r36
            r8 = r37
            boolean r0 = r8 instanceof Sx.b.d
            if (r0 == 0) goto L_0x001a
            r0 = r8
            Sx.b$d r0 = (Sx.b.d) r0
            int r1 = r0.f116612x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x001a
            int r1 = r1 - r2
            r0.f116612x = r1
        L_0x0018:
            r9 = r0
            goto L_0x0020
        L_0x001a:
            Sx.b$d r0 = new Sx.b$d
            r0.<init>(r6, r8)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r9.f116610v
            java.lang.Object r10 = eI.C17187b.f()
            int r1 = r9.f116612x
            switch(r1) {
                case 0: goto L_0x01c8;
                case 1: goto L_0x0193;
                case 2: goto L_0x015a;
                case 3: goto L_0x0101;
                case 4: goto L_0x00c8;
                case 5: goto L_0x006c;
                case 6: goto L_0x0033;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            java.lang.Object r1 = r9.f116603o
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r9.f116602n
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r9.f116601m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f116600l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f116599k
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r9.f116598j
            Sx.b r1 = (Sx.b) r1
            java.lang.Object r1 = r9.f116597i
            pv.d r1 = (pv.C11784d) r1
            java.lang.Object r1 = r9.f116596h
            pv.d r1 = (pv.C11784d) r1
            java.lang.Object r1 = r9.f116595g
            Rx.b r1 = (Rx.b) r1
            java.lang.Object r2 = r9.f116594f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r9.f116593e
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r3 = r9.f116592d
            Sx.c r3 = (Sx.c) r3
            java.lang.Object r4 = r9.f116591c
            Sx.b r4 = (Sx.b) r4
            XH.y.b(r0)
            goto L_0x075a
        L_0x006c:
            int r1 = r9.f116609u
            int r2 = r9.f116608t
            int r3 = r9.f116607s
            int r4 = r9.f116606r
            java.lang.Object r5 = r9.f116602n
            java.lang.Object r7 = r9.f116601m
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r9.f116600l
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r11 = r9.f116599k
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r9.f116598j
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r9.f116597i
            qv.e r13 = (qv.e) r13
            java.lang.Object r14 = r9.f116596h
            Sx.b r14 = (Sx.b) r14
            java.lang.Object r15 = r9.f116595g
            Rx.b r15 = (Rx.b) r15
            r36 = r1
            java.lang.Object r1 = r9.f116594f
            java.lang.String r1 = (java.lang.String) r1
            r37 = r1
            java.lang.Object r1 = r9.f116593e
            dI.e r1 = (dI.C17164e) r1
            r16 = r1
            java.lang.Object r1 = r9.f116592d
            Sx.c r1 = (Sx.c) r1
            r17 = r1
            java.lang.Object r1 = r9.f116591c
            Sx.b r1 = (Sx.b) r1
            XH.y.b(r0)
            r29 = r10
            r6 = r12
            r10 = r4
            r12 = r11
            r4 = r3
            r11 = r5
            r3 = r14
            r14 = r37
            r5 = r1
            r1 = r15
            r15 = r8
            r8 = r16
            r16 = r36
            r34 = r17
            r17 = r2
            r2 = r13
            r13 = r7
            r7 = r34
            goto L_0x0715
        L_0x00c8:
            java.lang.Object r1 = r9.f116603o
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r9.f116602n
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r9.f116601m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f116600l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f116599k
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r9.f116598j
            Sx.b r1 = (Sx.b) r1
            java.lang.Object r1 = r9.f116597i
            pv.d r1 = (pv.C11784d) r1
            java.lang.Object r1 = r9.f116596h
            pv.d r1 = (pv.C11784d) r1
            java.lang.Object r1 = r9.f116595g
            Rx.b r1 = (Rx.b) r1
            java.lang.Object r2 = r9.f116594f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r9.f116593e
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r3 = r9.f116592d
            Sx.c r3 = (Sx.c) r3
            java.lang.Object r4 = r9.f116591c
            Sx.b r4 = (Sx.b) r4
            XH.y.b(r0)
            goto L_0x069a
        L_0x0101:
            int r1 = r9.f116609u
            int r2 = r9.f116608t
            int r3 = r9.f116607s
            int r4 = r9.f116606r
            java.lang.Object r5 = r9.f116602n
            java.lang.Object r7 = r9.f116601m
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r9.f116600l
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r11 = r9.f116599k
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r9.f116598j
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r9.f116597i
            qv.e r13 = (qv.e) r13
            java.lang.Object r14 = r9.f116596h
            Sx.b r14 = (Sx.b) r14
            java.lang.Object r15 = r9.f116595g
            Rx.b r15 = (Rx.b) r15
            r16 = r1
            java.lang.Object r1 = r9.f116594f
            java.lang.String r1 = (java.lang.String) r1
            r36 = r1
            java.lang.Object r1 = r9.f116593e
            dI.e r1 = (dI.C17164e) r1
            r37 = r1
            java.lang.Object r1 = r9.f116592d
            Sx.c r1 = (Sx.c) r1
            r17 = r1
            java.lang.Object r1 = r9.f116591c
            Sx.b r1 = (Sx.b) r1
            XH.y.b(r0)
            r29 = r10
            r6 = r11
            r10 = r4
            r11 = r5
            r5 = r1
            r4 = r3
            r3 = r14
            r1 = r15
            r14 = r36
            r15 = r8
            r8 = r37
            r34 = r17
            r17 = r2
            r2 = r13
            r13 = r7
            r7 = r34
            goto L_0x0655
        L_0x015a:
            java.lang.Object r1 = r9.f116603o
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r9.f116602n
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r9.f116601m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f116600l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f116599k
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r9.f116598j
            Sx.b r1 = (Sx.b) r1
            java.lang.Object r1 = r9.f116597i
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r1 = r9.f116596h
            Sx.b r1 = (Sx.b) r1
            java.lang.Object r1 = r9.f116595g
            Rx.b r1 = (Rx.b) r1
            java.lang.Object r1 = r9.f116594f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f116593e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r9.f116592d
            Sx.c r1 = (Sx.c) r1
            java.lang.Object r1 = r9.f116591c
            Sx.b r1 = (Sx.b) r1
            XH.y.b(r0)
            goto L_0x05e9
        L_0x0193:
            java.lang.Object r1 = r9.f116602n
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r9.f116601m
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r9.f116600l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f116599k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f116598j
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r9.f116597i
            Sx.b r1 = (Sx.b) r1
            java.lang.Object r1 = r9.f116596h
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r1 = r9.f116595g
            Sx.b r1 = (Sx.b) r1
            java.lang.Object r1 = r9.f116594f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f116593e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r9.f116592d
            Sx.c r1 = (Sx.c) r1
            java.lang.Object r1 = r9.f116591c
            Sx.b r1 = (Sx.b) r1
            XH.y.b(r0)
            goto L_0x04a1
        L_0x01c8:
            XH.y.b(r0)
            qv.e r0 = qv.e.DEBUG
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01de:
            boolean r3 = r1.hasNext()
            r5 = 0
            if (r3 == 0) goto L_0x01f6
            java.lang.Object r3 = r1.next()
            r4 = r3
            qv.b r4 = (qv.C11819b) r4
            boolean r4 = r4.b(r0, r5)
            if (r4 == 0) goto L_0x01de
            r2.add(r3)
            goto L_0x01de
        L_0x01f6:
            java.util.Iterator r1 = r2.iterator()
            r3 = 0
            r4 = 0
        L_0x01fc:
            boolean r11 = r1.hasNext()
            java.lang.String r12 = "|"
            java.lang.String r13 = "b"
            java.lang.String r14 = "m"
            java.lang.String r15 = "main"
            java.lang.String r5 = "Kt"
            java.lang.Class<Sx.b> r19 = Sx.b.class
            if (r11 == 0) goto L_0x0299
            java.lang.Object r11 = r1.next()
            qv.b r11 = (qv.C11819b) r11
            r21 = r14
            if (r3 != 0) goto L_0x023b
            java.lang.String r3 = r36.c()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r14 = "On message received "
            r2.append(r14)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r14 = 0
            java.lang.String r2 = qv.C11818a.a(r2, r14)
            if (r2 != 0) goto L_0x0236
            goto L_0x029b
        L_0x0236:
            java.lang.String r3 = qv.C11820c.a(r2)
            goto L_0x023c
        L_0x023b:
            r14 = 0
        L_0x023c:
            if (r4 != 0) goto L_0x0288
            java.lang.String r2 = r19.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r23 = r1
            r1 = 2
            r4 = 0
            r14 = 36
            java.lang.String r14 = HJ.C15854t.s1(r2, r14, r4, r1, r4)
            r19 = r2
            r2 = 46
            java.lang.String r1 = HJ.C15854t.o1(r14, r2, r4, r1, r4)
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0260
            r2 = r19
            goto L_0x0264
        L_0x0260:
            java.lang.String r2 = HJ.C15854t.P0(r1, r5)
        L_0x0264:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r4 = 1
            boolean r1 = HJ.C15854t.b0(r1, r15, r4)
            if (r1 == 0) goto L_0x0275
            r13 = r21
        L_0x0275:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            goto L_0x028a
        L_0x0288:
            r23 = r1
        L_0x028a:
            r14 = 0
            r12 = r0
            r13 = r4
            r1 = 0
            r15 = r1
            r16 = r3
            r11.a(r12, r13, r14, r15, r16)
            r1 = r23
            r5 = 0
            goto L_0x01fc
        L_0x0299:
            r21 = r14
        L_0x029b:
            qv.e r11 = qv.e.DEBUG
            qv.d r0 = qv.d.f102012a
            java.util.List r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x02ae:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02c6
            java.lang.Object r1 = r0.next()
            r2 = r1
            qv.b r2 = (qv.C11819b) r2
            r3 = 1
            boolean r2 = r2.b(r11, r3)
            if (r2 == 0) goto L_0x02ae
            r14.add(r1)
            goto L_0x02ae
        L_0x02c6:
            java.util.Iterator r4 = r14.iterator()
            r0 = r14
            r2 = 0
            r3 = 0
        L_0x02cd:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x036f
            java.lang.Object r0 = r4.next()
            r24 = r0
            qv.b r24 = (qv.C11819b) r24
            if (r2 != 0) goto L_0x0308
            java.util.Map r1 = r36.a()
            r23 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r30 = r13
            java.lang.String r13 = "Message data payload: "
            r0.append(r13)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r0 = qv.C11818a.a(r0, r1)
            if (r0 != 0) goto L_0x0303
            r31 = r4
            r13 = r23
            goto L_0x0374
        L_0x0303:
            java.lang.String r2 = qv.C11820c.a(r0)
            goto L_0x030c
        L_0x0308:
            r23 = r0
            r30 = r13
        L_0x030c:
            if (r3 != 0) goto L_0x0357
            java.lang.String r0 = r19.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            r31 = r4
            r1 = 0
            r3 = 36
            r13 = 2
            java.lang.String r4 = HJ.C15854t.s1(r0, r3, r1, r13, r1)
            r3 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r3, r1, r13, r1)
            int r1 = r4.length()
            if (r1 != 0) goto L_0x032c
            goto L_0x0330
        L_0x032c:
            java.lang.String r0 = HJ.C15854t.P0(r4, r5)
        L_0x0330:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r3 = 1
            boolean r1 = HJ.C15854t.b0(r1, r15, r3)
            if (r1 == 0) goto L_0x0342
            r1 = r21
            goto L_0x0344
        L_0x0342:
            r1 = r30
        L_0x0344:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r12)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            goto L_0x0359
        L_0x0357:
            r31 = r4
        L_0x0359:
            r27 = 1
            r25 = r11
            r26 = r3
            r0 = 0
            r28 = r0
            r29 = r2
            r24.a(r25, r26, r27, r28, r29)
            r0 = r23
            r13 = r30
            r4 = r31
            goto L_0x02cd
        L_0x036f:
            r31 = r4
            r30 = r13
            r13 = r0
        L_0x0374:
            java.util.Map r0 = r36.a()
            java.lang.String r1 = "type"
            java.lang.Object r0 = r0.get(r1)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x04a4
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unhandled message type. Type is missing."
            r0.<init>(r1)
            qv.e r1 = qv.e.ERROR
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x039d:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x03b5
            java.lang.Object r11 = r2.next()
            r13 = r11
            qv.b r13 = (qv.C11819b) r13
            r14 = 0
            boolean r13 = r13.b(r1, r14)
            if (r13 == 0) goto L_0x039d
            r3.add(r11)
            goto L_0x039d
        L_0x03b5:
            java.util.Iterator r2 = r3.iterator()
            r14 = r3
            r11 = 0
            r13 = 0
        L_0x03bc:
            boolean r22 = r2.hasNext()
            if (r22 == 0) goto L_0x044f
            java.lang.Object r14 = r2.next()
            r22 = r14
            qv.b r22 = (qv.C11819b) r22
            r28 = r14
            r14 = 0
            if (r11 != 0) goto L_0x03e3
            java.lang.String r18 = qv.C11818a.a(r14, r0)
            if (r18 != 0) goto L_0x03df
            r31 = r2
            r32 = r3
            r29 = r10
            r14 = r28
            goto L_0x0455
        L_0x03df:
            java.lang.String r11 = qv.C11820c.a(r18)
        L_0x03e3:
            if (r13 != 0) goto L_0x0432
            java.lang.String r13 = r19.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            r31 = r2
            r32 = r3
            r29 = r10
            r2 = 2
            r10 = 36
            java.lang.String r3 = HJ.C15854t.s1(r13, r10, r14, r2, r14)
            r10 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r10, r14, r2, r14)
            int r2 = r3.length()
            if (r2 != 0) goto L_0x0406
            goto L_0x040a
        L_0x0406:
            java.lang.String r13 = HJ.C15854t.P0(r3, r5)
        L_0x040a:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r3 = 1
            boolean r2 = HJ.C15854t.b0(r2, r15, r3)
            if (r2 == 0) goto L_0x041c
            r2 = r21
            goto L_0x041e
        L_0x041c:
            r2 = r30
        L_0x041e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r12)
            r3.append(r13)
            java.lang.String r2 = r3.toString()
            r13 = r2
            goto L_0x0438
        L_0x0432:
            r31 = r2
            r32 = r3
            r29 = r10
        L_0x0438:
            r25 = 0
            r23 = r1
            r24 = r13
            r26 = r0
            r27 = r11
            r22.a(r23, r24, r25, r26, r27)
            r14 = r28
            r10 = r29
            r2 = r31
            r3 = r32
            goto L_0x03bc
        L_0x044f:
            r31 = r2
            r32 = r3
            r29 = r10
        L_0x0455:
            java.lang.String r2 = r36.c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Message type missing: "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            Lx.a r3 = Lx.a.APP_UNSUPPORTED
            r9.f116591c = r6
            r9.f116592d = r7
            r9.f116593e = r8
            r9.f116594f = r4
            r9.f116595g = r6
            r9.f116596h = r0
            r9.f116597i = r6
            r9.f116598j = r1
            r9.f116599k = r11
            r9.f116600l = r13
            r0 = r32
            r9.f116601m = r0
            r0 = r31
            r9.f116602n = r0
            r9.f116603o = r14
            r0 = 0
            r9.f116605q = r0
            r9.f116606r = r0
            r9.f116607s = r0
            r9.f116608t = r0
            r9.f116609u = r0
            r0 = 1
            r9.f116612x = r0
            java.lang.Object r0 = r6.j(r7, r2, r3, r9)
            r10 = r29
            if (r0 != r10) goto L_0x04a1
            return r10
        L_0x04a1:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x04a4:
            java.util.Map<java.lang.String, Rx.b> r0 = r6.f116553b
            java.lang.Object r0 = r0.get(r4)
            r1 = r0
            Rx.b r1 = (Rx.b) r1
            if (r1 != 0) goto L_0x05ec
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Can't find a feature for "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            qv.e r2 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x04d8:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x04f4
            java.lang.Object r13 = r3.next()
            r14 = r13
            qv.b r14 = (qv.C11819b) r14
            r22 = r3
            r3 = 0
            boolean r14 = r14.b(r2, r3)
            if (r14 == 0) goto L_0x04f1
            r11.add(r13)
        L_0x04f1:
            r3 = r22
            goto L_0x04d8
        L_0x04f4:
            java.util.Iterator r3 = r11.iterator()
            r22 = r11
            r13 = 0
            r14 = 0
        L_0x04fc:
            boolean r23 = r3.hasNext()
            if (r23 == 0) goto L_0x0593
            java.lang.Object r28 = r3.next()
            r22 = r28
            qv.b r22 = (qv.C11819b) r22
            r29 = r10
            r10 = 0
            if (r13 != 0) goto L_0x0523
            java.lang.String r18 = qv.C11818a.a(r10, r0)
            if (r18 != 0) goto L_0x051f
            r32 = r1
            r18 = r3
            r20 = r11
            r1 = r28
            goto L_0x059d
        L_0x051f:
            java.lang.String r13 = qv.C11820c.a(r18)
        L_0x0523:
            if (r14 != 0) goto L_0x0572
            java.lang.String r14 = r19.getName()
            kotlin.jvm.internal.C17542s.g(r14)
            r32 = r1
            r18 = r3
            r20 = r11
            r3 = 36
            r11 = 2
            java.lang.String r1 = HJ.C15854t.s1(r14, r3, r10, r11, r10)
            r3 = 46
            java.lang.String r1 = HJ.C15854t.o1(r1, r3, r10, r11, r10)
            int r11 = r1.length()
            if (r11 != 0) goto L_0x0546
            goto L_0x054a
        L_0x0546:
            java.lang.String r14 = HJ.C15854t.P0(r1, r5)
        L_0x054a:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r11 = 1
            boolean r1 = HJ.C15854t.b0(r1, r15, r11)
            if (r1 == 0) goto L_0x055c
            r1 = r21
            goto L_0x055e
        L_0x055c:
            r1 = r30
        L_0x055e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r12)
            r11.append(r14)
            java.lang.String r1 = r11.toString()
            r14 = r1
            goto L_0x057a
        L_0x0572:
            r32 = r1
            r18 = r3
            r20 = r11
            r3 = 46
        L_0x057a:
            r25 = 0
            r23 = r2
            r24 = r14
            r26 = r0
            r27 = r13
            r22.a(r23, r24, r25, r26, r27)
            r3 = r18
            r11 = r20
            r22 = r28
            r10 = r29
            r1 = r32
            goto L_0x04fc
        L_0x0593:
            r32 = r1
            r18 = r3
            r29 = r10
            r20 = r11
            r1 = r22
        L_0x059d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Message type not supported: "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            Lx.a r5 = Lx.a.APP_UNSUPPORTED
            r9.f116591c = r6
            r9.f116592d = r7
            r9.f116593e = r8
            r9.f116594f = r4
            r10 = r32
            r9.f116595g = r10
            r9.f116596h = r6
            r9.f116597i = r0
            r9.f116598j = r6
            r9.f116599k = r2
            r9.f116600l = r13
            r9.f116601m = r14
            r0 = r20
            r9.f116602n = r0
            r0 = r18
            r9.f116603o = r0
            r9.f116604p = r1
            r0 = 0
            r9.f116605q = r0
            r9.f116606r = r0
            r9.f116607s = r0
            r9.f116608t = r0
            r9.f116609u = r0
            r0 = 2
            r9.f116612x = r0
            java.lang.Object r0 = r6.j(r7, r3, r5, r9)
            r12 = r29
            if (r0 != r12) goto L_0x05e9
            return r12
        L_0x05e9:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x05ec:
            r12 = r10
            r10 = r1
            boolean r0 = r10 instanceof Rx.c
            if (r0 == 0) goto L_0x069f
            r1 = r10
            Rx.c r1 = (Rx.c) r1
            java.util.Map r0 = r36.a()
            pv.b r5 = r1.e(r0)
            r9.f116591c = r6
            r9.f116592d = r7
            r9.f116593e = r8
            r9.f116594f = r4
            r9.f116595g = r10
            r9.f116596h = r6
            r9.f116597i = r11
            r9.f116598j = r2
            r9.f116599k = r3
            r9.f116600l = r14
            r15 = r31
            r9.f116601m = r15
            r9.f116602n = r13
            r0 = 1
            r9.f116605q = r0
            r1 = 0
            r9.f116606r = r1
            r9.f116607s = r1
            r9.f116608t = r1
            r9.f116609u = r1
            r0 = 3
            r9.f116612x = r0
            java.lang.String r16 = ""
            r0 = r35
            r1 = r36
            r15 = r2
            r2 = r16
            r16 = r13
            r13 = r3
            r3 = r4
            r18 = r14
            r33 = r31
            r14 = r4
            r4 = r5
            r5 = r9
            java.lang.Object r0 = r0.e(r1, r2, r3, r4, r5)
            if (r0 != r12) goto L_0x0641
            return r12
        L_0x0641:
            r3 = r6
            r5 = r3
            r1 = r10
            r2 = r11
            r29 = r12
            r6 = r13
            r12 = r15
            r11 = r16
            r15 = r18
            r13 = r33
            r4 = 0
            r10 = 0
            r16 = 0
            r17 = 0
        L_0x0655:
            pv.d r0 = (pv.C11784d) r0
            if (r0 != 0) goto L_0x065c
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x065c:
            r18 = r4
            r4 = r1
            Rx.c r4 = (Rx.c) r4
            r9.f116591c = r5
            r9.f116592d = r7
            r9.f116593e = r8
            r9.f116594f = r14
            r9.f116595g = r1
            r9.f116596h = r0
            r9.f116597i = r0
            r9.f116598j = r3
            r9.f116599k = r2
            r9.f116600l = r12
            r9.f116601m = r6
            r9.f116602n = r15
            r9.f116603o = r13
            r9.f116604p = r11
            r9.f116605q = r10
            r3 = r18
            r9.f116606r = r3
            r2 = r17
            r9.f116607s = r2
            r2 = r16
            r9.f116608t = r2
            r2 = 4
            r9.f116612x = r2
            java.lang.Object r0 = r5.h(r4, r7, r0, r9)
            r6 = r29
            if (r0 != r6) goto L_0x0697
            return r6
        L_0x0697:
            r4 = r5
            r3 = r7
            r2 = r14
        L_0x069a:
            r4.k(r1, r3, r2)
            goto L_0x075d
        L_0x069f:
            r15 = r2
            r6 = r12
            r16 = r13
            r18 = r14
            r33 = r31
            r13 = r3
            r14 = r4
            boolean r0 = r10 instanceof Rx.a
            if (r0 == 0) goto L_0x0760
            r1 = r10
            Rx.a r1 = (Rx.a) r1
            java.util.Map r0 = r36.a()
            java.lang.String r2 = r1.a(r0)
            java.util.Map r0 = r36.a()
            pv.b r4 = r1.e(r0)
            r12 = r35
            r9.f116591c = r12
            r9.f116592d = r7
            r9.f116593e = r8
            r9.f116594f = r14
            r9.f116595g = r10
            r9.f116596h = r12
            r9.f116597i = r11
            r9.f116598j = r15
            r9.f116599k = r13
            r5 = r18
            r9.f116600l = r5
            r3 = r33
            r9.f116601m = r3
            r1 = r16
            r9.f116602n = r1
            r0 = 1
            r9.f116605q = r0
            r0 = 0
            r9.f116606r = r0
            r9.f116607s = r0
            r9.f116608t = r0
            r9.f116609u = r0
            r0 = 5
            r9.f116612x = r0
            r16 = 0
            r0 = r35
            r23 = r1
            r1 = r36
            r17 = r3
            r3 = r14
            r5 = r9
            java.lang.Object r0 = r0.e(r1, r2, r3, r4, r5)
            if (r0 != r6) goto L_0x0702
            return r6
        L_0x0702:
            r29 = r6
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r3
            r12 = r13
            r6 = r15
            r4 = r16
            r10 = r4
            r13 = r17
            r15 = r18
            r11 = r23
            r17 = r10
        L_0x0715:
            pv.d r0 = (pv.C11784d) r0
            if (r0 != 0) goto L_0x071c
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x071c:
            r18 = r4
            r4 = r1
            Rx.a r4 = (Rx.a) r4
            r9.f116591c = r5
            r9.f116592d = r7
            r9.f116593e = r8
            r9.f116594f = r14
            r9.f116595g = r1
            r9.f116596h = r0
            r9.f116597i = r0
            r9.f116598j = r3
            r9.f116599k = r2
            r9.f116600l = r6
            r9.f116601m = r12
            r9.f116602n = r15
            r9.f116603o = r13
            r9.f116604p = r11
            r9.f116605q = r10
            r3 = r18
            r9.f116606r = r3
            r2 = r17
            r9.f116607s = r2
            r2 = r16
            r9.f116608t = r2
            r2 = 6
            r9.f116612x = r2
            java.lang.Object r0 = r5.f(r4, r7, r0, r9)
            r2 = r29
            if (r0 != r2) goto L_0x0757
            return r2
        L_0x0757:
            r4 = r5
            r3 = r7
            r2 = r14
        L_0x075a:
            r4.k(r1, r3, r2)
        L_0x075d:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x0760:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Sx.b.g(Sx.c, dI.e):java.lang.Object");
    }
}
