package Hs;

import Gs.b;
import HJ.C15854t;
import Ps.g;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.x;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import fI.C17220a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010!\u001a\u00020 H@¢\u0006\u0004\b\"\u0010#JB\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0'2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0011H@¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001aH@¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u001aH@¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u001aH@¢\u0006\u0004\b-\u0010+J\u0018\u0010.\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H@¢\u0006\u0004\b.\u0010#J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u001dH\u0016¢\u0006\u0004\b0\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u00103¨\u00065"}, d2 = {"LHs/a;", "LGs/b;", "", "LGs/a;", "inboxFeatures", "LMs/a;", "inboxLocalSource", "LMs/d;", "newNotificationsLocalSource", "<init>", "(Ljava/util/Set;LMs/a;LMs/d;)V", "feature", "", "LPs/c;", "messages", "LPs/g;", "source", "", "replaceAllExisting", "LPs/d;", "k", "(LGs/a;Ljava/util/List;LPs/g;ZLdI/e;)Ljava/lang/Object;", "features", "", "l", "(Ljava/util/Set;)Ljava/util/Set;", "LXH/N;", "m", "(LGs/a;)V", "LTJ/g;", "a", "()LTJ/g;", "LPs/b;", "id", "c", "(LPs/b;LdI/e;)Ljava/lang/Object;", "LPs/a;", "category", "replaceFeatureContent", "LXH/x;", "e", "(LGs/a;Ljava/util/List;LPs/a;ZLdI/e;)Ljava/lang/Object;", "b", "(LdI/e;)Ljava/lang/Object;", "h", "g", "d", "LGs/b$a;", "f", "LMs/a;", "LMs/d;", "Ljava/util/Set;", "registeredFeatureNames", "inboxrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Gs.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Ms.a f81683a;

    /* renamed from: b  reason: collision with root package name */
    private final Ms.d f81684b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f81685c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hs.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C1596a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f81686a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f81687b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        static {
            /*
                Ps.a[] r0 = Ps.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Ps.a r2 = Ps.a.User     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Ps.a r3 = Ps.a.Other     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f81686a = r0
                Ps.g[] r0 = Ps.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ps.g r3 = Ps.g.Unknown     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                Ps.g r1 = Ps.g.Push     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                Ps.g r1 = Ps.g.CommunicationPost     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f81687b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Hs.a.C1596a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f81688a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f81689b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hs.a$b$a  reason: collision with other inner class name */
        public static final class C1597a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f81690a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f81691b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.inboxrepository.impl.InboxRepositoryImpl$inboxNewNotificationsStatus$$inlined$map$1$2", f = "InboxRepositoryImpl.kt", l = {52, 50}, m = "emit")
            /* renamed from: Hs.a$b$a$a  reason: collision with other inner class name */
            public static final class C1598a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f81692c;

                /* renamed from: d  reason: collision with root package name */
                int f81693d;

                /* renamed from: e  reason: collision with root package name */
                Object f81694e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C1597a f81695f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1598a(C1597a aVar, C17164e eVar) {
                    super(eVar);
                    this.f81695f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f81692c = obj;
                    this.f81693d |= Integer.MIN_VALUE;
                    return this.f81695f.emit((Object) null, this);
                }
            }

            public C1597a(C16533h hVar, a aVar) {
                this.f81690a = hVar;
                this.f81691b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x0077 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Hs.a.b.C1597a.C1598a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    Hs.a$b$a$a r0 = (Hs.a.b.C1597a.C1598a) r0
                    int r1 = r0.f81693d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f81693d = r1
                    goto L_0x0018
                L_0x0013:
                    Hs.a$b$a$a r0 = new Hs.a$b$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f81692c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f81693d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    XH.y.b(r8)
                    goto L_0x0078
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.f81694e
                    TJ.h r7 = (TJ.C16533h) r7
                    XH.y.b(r8)
                    goto L_0x005d
                L_0x003c:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f81690a
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    if (r7 == 0) goto L_0x006a
                    Hs.a r7 = r6.f81691b
                    Ms.a r7 = r7.f81683a
                    r0.f81694e = r8
                    r0.f81693d = r4
                    java.lang.Object r7 = r7.e(r0)
                    if (r7 != r1) goto L_0x005a
                    return r1
                L_0x005a:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x005d:
                    java.lang.Number r8 = (java.lang.Number) r8
                    int r8 = r8.intValue()
                    Gs.b$a$a r2 = new Gs.b$a$a
                    r2.<init>(r8)
                    r8 = r7
                    goto L_0x006c
                L_0x006a:
                    Gs.b$a$b r2 = Gs.b.a.C1583b.f81203a
                L_0x006c:
                    r7 = 0
                    r0.f81694e = r7
                    r0.f81693d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x0078
                    return r1
                L_0x0078:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Hs.a.b.C1597a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, a aVar) {
            this.f81688a = gVar;
            this.f81689b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f81688a.collect(new C1597a(hVar, this.f81689b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inboxrepository.impl.InboxRepositoryImpl", f = "InboxRepositoryImpl.kt", l = {52}, m = "insertMessages-yxL6bBk")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f81696c;

        /* renamed from: d  reason: collision with root package name */
        Object f81697d;

        /* renamed from: e  reason: collision with root package name */
        Object f81698e;

        /* renamed from: f  reason: collision with root package name */
        Object f81699f;

        /* renamed from: g  reason: collision with root package name */
        Object f81700g;

        /* renamed from: h  reason: collision with root package name */
        Object f81701h;

        /* renamed from: i  reason: collision with root package name */
        Object f81702i;

        /* renamed from: j  reason: collision with root package name */
        Object f81703j;

        /* renamed from: k  reason: collision with root package name */
        Object f81704k;

        /* renamed from: l  reason: collision with root package name */
        boolean f81705l;

        /* renamed from: m  reason: collision with root package name */
        int f81706m;

        /* renamed from: n  reason: collision with root package name */
        int f81707n;

        /* renamed from: o  reason: collision with root package name */
        int f81708o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f81709p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ a f81710q;

        /* renamed from: r  reason: collision with root package name */
        int f81711r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f81710q = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81709p = obj;
            this.f81711r |= Integer.MIN_VALUE;
            Object e10 = this.f81710q.e((Gs.a) null, (List<Ps.c>) null, (Ps.a) null, false, this);
            return e10 == C17187b.f() ? e10 : x.a(e10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inboxrepository.impl.InboxRepositoryImpl", f = "InboxRepositoryImpl.kt", l = {102, 109, 120, 125}, m = "insertNotificationsWithSource")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f81712c;

        /* renamed from: d  reason: collision with root package name */
        Object f81713d;

        /* renamed from: e  reason: collision with root package name */
        Object f81714e;

        /* renamed from: f  reason: collision with root package name */
        Object f81715f;

        /* renamed from: g  reason: collision with root package name */
        Object f81716g;

        /* renamed from: h  reason: collision with root package name */
        Object f81717h;

        /* renamed from: i  reason: collision with root package name */
        Object f81718i;

        /* renamed from: j  reason: collision with root package name */
        boolean f81719j;

        /* renamed from: k  reason: collision with root package name */
        int f81720k;

        /* renamed from: l  reason: collision with root package name */
        int f81721l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f81722m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ a f81723n;

        /* renamed from: o  reason: collision with root package name */
        int f81724o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f81723n = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81722m = obj;
            this.f81724o |= Integer.MIN_VALUE;
            return this.f81723n.k((Gs.a) null, (List<Ps.c>) null, (g) null, false, this);
        }
    }

    public a(Set<Gs.a> set, Ms.a aVar, Ms.d dVar) {
        C17542s.j(set, "inboxFeatures");
        C17542s.j(aVar, "inboxLocalSource");
        C17542s.j(dVar, "newNotificationsLocalSource");
        this.f81683a = aVar;
        this.f81684b = dVar;
        this.f81685c = l(set);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0112, code lost:
        if (((Ms.c.C1680c) r1).a().isEmpty() == false) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(Gs.a r19, java.util.List<Ps.c> r20, Ps.g r21, boolean r22, dI.C17164e<? super java.util.List<Ps.d>> r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r23
            boolean r2 = r1 instanceof Hs.a.d
            if (r2 == 0) goto L_0x0017
            r2 = r1
            Hs.a$d r2 = (Hs.a.d) r2
            int r3 = r2.f81724o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f81724o = r3
            goto L_0x001c
        L_0x0017:
            Hs.a$d r2 = new Hs.a$d
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f81722m
            java.lang.Object r9 = eI.C17187b.f()
            int r4 = r2.f81724o
            r10 = 4
            r11 = 3
            r12 = 2
            r13 = 1
            if (r4 == 0) goto L_0x009e
            if (r4 == r13) goto L_0x0082
            if (r4 == r12) goto L_0x005c
            if (r4 == r11) goto L_0x003b
            if (r4 != r10) goto L_0x0033
            goto L_0x003b
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            java.lang.Object r1 = r2.f81718i
            Ms.c r1 = (Ms.c) r1
            java.lang.Object r1 = r2.f81717h
            Ms.c r1 = (Ms.c) r1
            java.lang.Object r4 = r2.f81716g
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r4 = r2.f81715f
            Ps.g r4 = (Ps.g) r4
            java.lang.Object r4 = r2.f81714e
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = r2.f81713d
            Gs.a r4 = (Gs.a) r4
            java.lang.Object r2 = r2.f81712c
            Hs.a r2 = (Hs.a) r2
            XH.y.b(r3)
            goto L_0x015e
        L_0x005c:
            boolean r1 = r2.f81719j
            java.lang.Object r4 = r2.f81717h
            Ms.c r4 = (Ms.c) r4
            java.lang.Object r5 = r2.f81716g
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r6 = r2.f81715f
            Ps.g r6 = (Ps.g) r6
            java.lang.Object r7 = r2.f81714e
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r2.f81713d
            Gs.a r8 = (Gs.a) r8
            java.lang.Object r12 = r2.f81712c
            Hs.a r12 = (Hs.a) r12
            XH.y.b(r3)
            r16 = r3
            r3 = r1
            r1 = r4
            r4 = r6
            r6 = r16
            goto L_0x00f5
        L_0x0082:
            boolean r1 = r2.f81719j
            java.lang.Object r4 = r2.f81716g
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r5 = r2.f81715f
            Ps.g r5 = (Ps.g) r5
            java.lang.Object r6 = r2.f81714e
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r2.f81713d
            Gs.a r7 = (Gs.a) r7
            java.lang.Object r8 = r2.f81712c
            Hs.a r8 = (Hs.a) r8
            XH.y.b(r3)
            r15 = r6
            r14 = r7
            goto L_0x00cd
        L_0x009e:
            XH.y.b(r3)
            Ms.a r3 = r0.f81683a
            r2.f81712c = r0
            r14 = r19
            r2.f81713d = r14
            r15 = r20
            r2.f81714e = r15
            r8 = r21
            r2.f81715f = r8
            r2.f81716g = r1
            r7 = r22
            r2.f81719j = r7
            r2.f81724o = r13
            r4 = r19
            r5 = r21
            r6 = r20
            r8 = r2
            java.lang.Object r3 = r3.f(r4, r5, r6, r7, r8)
            if (r3 != r9) goto L_0x00c7
            return r9
        L_0x00c7:
            r5 = r21
            r8 = r0
            r4 = r1
            r1 = r22
        L_0x00cd:
            Ms.c r3 = (Ms.c) r3
            Ms.a r6 = r8.f81683a
            r2.f81712c = r8
            r2.f81713d = r14
            r2.f81714e = r15
            r2.f81715f = r5
            r2.f81716g = r4
            r2.f81717h = r3
            r2.f81719j = r1
            r2.f81724o = r12
            java.lang.Object r6 = r6.e(r2)
            if (r6 != r9) goto L_0x00e8
            return r9
        L_0x00e8:
            r12 = r8
            r8 = r14
            r7 = r15
            r16 = r3
            r3 = r1
            r1 = r16
            r17 = r5
            r5 = r4
            r4 = r17
        L_0x00f5:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            boolean r14 = r1 instanceof Ms.c.a
            if (r14 == 0) goto L_0x0100
            goto L_0x011c
        L_0x0100:
            boolean r14 = r1 instanceof Ms.c.C1680c
            r15 = 0
            if (r14 == 0) goto L_0x0117
            r14 = r1
            Ms.c$c r14 = (Ms.c.C1680c) r14
            java.util.List r14 = r14.a()
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x0115
            goto L_0x011c
        L_0x0115:
            r13 = r15
            goto L_0x011c
        L_0x0117:
            boolean r13 = r1 instanceof Ms.c.b
            if (r13 == 0) goto L_0x0189
            goto L_0x0115
        L_0x011c:
            if (r6 != 0) goto L_0x013d
            Ms.d r10 = r12.f81684b
            r2.f81712c = r12
            r2.f81713d = r8
            r2.f81714e = r7
            r2.f81715f = r4
            r2.f81716g = r5
            r2.f81717h = r1
            r2.f81718i = r1
            r2.f81719j = r3
            r2.f81720k = r6
            r2.f81721l = r13
            r2.f81724o = r11
            java.lang.Object r2 = r10.b(r2)
            if (r2 != r9) goto L_0x015e
            return r9
        L_0x013d:
            if (r13 == 0) goto L_0x015e
            Ms.d r11 = r12.f81684b
            r2.f81712c = r12
            r2.f81713d = r8
            r2.f81714e = r7
            r2.f81715f = r4
            r2.f81716g = r5
            r2.f81717h = r1
            r2.f81718i = r1
            r2.f81719j = r3
            r2.f81720k = r6
            r2.f81721l = r13
            r2.f81724o = r10
            java.lang.Object r2 = r11.a(r2)
            if (r2 != r9) goto L_0x015e
            return r9
        L_0x015e:
            Ms.c$a r2 = Ms.c.a.f83699a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r1, r2)
            if (r2 == 0) goto L_0x016b
            java.util.List r1 = YH.C16877v.n()
            goto L_0x0182
        L_0x016b:
            boolean r2 = r1 instanceof Ms.c.C1680c
            if (r2 == 0) goto L_0x0176
            Ms.c$c r1 = (Ms.c.C1680c) r1
            java.util.List r1 = r1.a()
            goto L_0x0182
        L_0x0176:
            Ms.c$b r2 = Ms.c.b.f83700a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r2)
            if (r1 == 0) goto L_0x0183
            java.util.List r1 = YH.C16877v.n()
        L_0x0182:
            return r1
        L_0x0183:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0189:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Hs.a.k(Gs.a, java.util.List, Ps.g, boolean, dI.e):java.lang.Object");
    }

    private final Set<String> l(Set<? extends Gs.a> set) {
        Iterable<Gs.a> iterable = set;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (Gs.a d10 : iterable) {
            arrayList.add(d10.d());
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : iterable) {
            if (hashSet.add(((Gs.a) next).d())) {
                arrayList2.add(next);
            }
        }
        if (arrayList.size() == arrayList2.size()) {
            return C16877v.y1(arrayList);
        }
        throw new IllegalArgumentException(C15854t.m("\n                Multiple features have the same name, they should be unique.\n                If the same feature implementation is used for multiple message types \n                it should be @Singleton\n                Features: " + arrayList + "\n            ").toString());
    }

    private final void m(Gs.a aVar) {
        String d10 = aVar.d();
        if (!this.f81685c.contains(d10)) {
            throw new IllegalArgumentException(C15854t.m("\n               Feature: '" + d10 + "' not found in the set of registered InboxFeatures\n               Did you bind it into the DI set?\n               \n               Register InboxFeature:\n                   @Binds\n                   @IntoSet\n                   fun bindMyInboxFeature(\n                       impl: MyInboxFeature\n                   ): InboxFeature\n                 \n               Register InboxNotificationFeature:\n                   @Binds\n                   @IntoMap\n                   @StringKey(<TYPE STRING FROM PUSH MESSAGE>)\n                   fun bindMyInboxNotificationFeature(\n                       impl: MyInboxNotificationFeature,\n                   ): NotificationFeature\n               NOTE! Need to use `NotificationFeature` as type as the map \n                     gathers not only InboxNotificationFeatures\n            ").toString());
        }
    }

    public C16532g<List<Ps.d>> a() {
        return this.f81683a.a();
    }

    public Object b(C17164e<? super C16807N> eVar) {
        Object b10 = this.f81684b.b(eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }

    public Object c(Ps.b bVar, C17164e<? super Ps.d> eVar) {
        return this.f81683a.c(bVar, eVar);
    }

    public Object d(Ps.b bVar, C17164e<? super C16807N> eVar) {
        Object d10 = this.f81683a.d(bVar, eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(Gs.a r9, java.util.List<Ps.c> r10, Ps.a r11, boolean r12, dI.C17164e<? super XH.x<? extends java.util.List<Ps.d>>> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof Hs.a.c
            if (r0 == 0) goto L_0x0014
            r0 = r13
            Hs.a$c r0 = (Hs.a.c) r0
            int r1 = r0.f81711r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f81711r = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            Hs.a$c r0 = new Hs.a$c
            r0.<init>(r8, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r6.f81709p
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r6.f81711r
            r2 = 1
            if (r1 == 0) goto L_0x005b
            if (r1 != r2) goto L_0x0053
            java.lang.Object r9 = r6.f81704k
            Ps.g r9 = (Ps.g) r9
            java.lang.Object r9 = r6.f81703j
            Ps.a r9 = (Ps.a) r9
            java.lang.Object r9 = r6.f81702i
            Hs.a r9 = (Hs.a) r9
            java.lang.Object r9 = r6.f81701h
            Hs.a r9 = (Hs.a) r9
            java.lang.Object r9 = r6.f81700g
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r6.f81699f
            Ps.a r9 = (Ps.a) r9
            java.lang.Object r9 = r6.f81698e
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = r6.f81697d
            Gs.a r9 = (Gs.a) r9
            java.lang.Object r9 = r6.f81696c
            Hs.a r9 = (Hs.a) r9
            XH.y.b(r0)     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            goto L_0x00a5
        L_0x004f:
            r9 = move-exception
            goto L_0x00ac
        L_0x0051:
            r9 = move-exception
            goto L_0x00b7
        L_0x0053:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x005b:
            XH.y.b(r0)
            XH.x$a r0 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r8.m(r9)     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            int[] r0 = Hs.a.C1596a.f81686a     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            int r1 = r11.ordinal()     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r0 = r0[r1]     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            if (r0 == r2) goto L_0x007a
            r1 = 2
            if (r0 != r1) goto L_0x0074
            Ps.g r1 = Ps.g.CommunicationPost     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
        L_0x0072:
            r4 = r1
            goto L_0x007d
        L_0x0074:
            XH.t r9 = new XH.t     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r9.<init>()     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            throw r9     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
        L_0x007a:
            Ps.g r1 = Ps.g.Push     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            goto L_0x0072
        L_0x007d:
            r1 = 0
            r6.f81696c = r8     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r6.f81697d = r9     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r6.f81698e = r10     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r6.f81699f = r11     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r6.f81700g = r13     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r6.f81701h = r8     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r6.f81702i = r8     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r6.f81703j = r11     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r6.f81704k = r4     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r6.f81705l = r12     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r6.f81706m = r1     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r6.f81707n = r1     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r6.f81708o = r0     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r6.f81711r = r2     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            java.lang.Object r0 = r1.k(r2, r3, r4, r5, r6)     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            if (r0 != r7) goto L_0x00a5
            return r7
        L_0x00a5:
            java.util.List r0 = (java.util.List) r0     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            java.lang.Object r9 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0051, all -> 0x004f }
            goto L_0x00b6
        L_0x00ac:
            XH.x$a r10 = XH.x.f139812b
            java.lang.Object r9 = XH.y.a(r9)
            java.lang.Object r9 = XH.x.b(r9)
        L_0x00b6:
            return r9
        L_0x00b7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Hs.a.e(Gs.a, java.util.List, Ps.a, boolean, dI.e):java.lang.Object");
    }

    public C16532g<b.a> f() {
        return new b(C16534i.s(this.f81684b.c()), this);
    }

    public Object g(C17164e<? super C16807N> eVar) {
        Object b10 = this.f81683a.b(eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }

    public Object h(C17164e<? super C16807N> eVar) {
        C17220a<g> b10 = g.b();
        ArrayList arrayList = new ArrayList();
        for (T next : b10) {
            int i10 = C1596a.f81687b[((g) next).ordinal()];
            if (i10 == 1 || i10 == 2) {
                arrayList.add(next);
            } else if (i10 != 3) {
                throw new t();
            }
        }
        Object g10 = this.f81683a.g(arrayList, eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }
}
