package Aw;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import bI.C17035a;
import cw.c;
import dI.C17164e;
import eI.C17187b;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import tf.C10253a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH@¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"LAw/c;", "LAw/a;", "Lcw/d;", "messageCenterRepository", "", "LZl/a;", "appLinkMappers", "Ltf/a;", "killSwitchRepository", "<init>", "(Lcw/d;Ljava/util/Set;Ltf/a;)V", "", "Lcw/b;", "messages", "e", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "message", "", "f", "(Lcw/b;)Z", "g", "(Lcw/b;LdI/e;)Ljava/lang/Object;", "LTJ/g;", "invoke", "()LTJ/g;", "a", "Ljava/util/Set;", "b", "Ltf/a;", "c", "LTJ/g;", "allMessages", "Lkotlin/Function1;", "d", "LnI/l;", "getAllowedMessagesFilter", "()LnI/l;", "allowedMessagesFilter", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Aw.c  reason: case insensitive filesystem */
public final class C12608c implements C12606a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Zl.a> f107732a;

    /* renamed from: b  reason: collision with root package name */
    private final C10253a f107733b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<List<cw.b>> f107734c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<cw.b, Boolean> f107735d = new C12607b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.offerhub.impl.usecase.GetCommercialMessagesForCarouselUseCaseImpl", f = "GetCommercialMessagesForCarouselUseCase.kt", l = {45}, m = "filterAndMapMessages")
    /* renamed from: Aw.c$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f107736c;

        /* renamed from: d  reason: collision with root package name */
        Object f107737d;

        /* renamed from: e  reason: collision with root package name */
        Object f107738e;

        /* renamed from: f  reason: collision with root package name */
        Object f107739f;

        /* renamed from: g  reason: collision with root package name */
        Object f107740g;

        /* renamed from: h  reason: collision with root package name */
        Object f107741h;

        /* renamed from: i  reason: collision with root package name */
        Object f107742i;

        /* renamed from: j  reason: collision with root package name */
        Object f107743j;

        /* renamed from: k  reason: collision with root package name */
        Object f107744k;

        /* renamed from: l  reason: collision with root package name */
        Object f107745l;

        /* renamed from: m  reason: collision with root package name */
        Object f107746m;

        /* renamed from: n  reason: collision with root package name */
        Object f107747n;

        /* renamed from: o  reason: collision with root package name */
        int f107748o;

        /* renamed from: p  reason: collision with root package name */
        int f107749p;

        /* renamed from: q  reason: collision with root package name */
        int f107750q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f107751r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C12608c f107752s;

        /* renamed from: t  reason: collision with root package name */
        int f107753t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C12608c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f107752s = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f107751r = obj;
            this.f107753t |= Integer.MIN_VALUE;
            return this.f107752s.e((List<cw.b>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcw/b;", "it", "<anonymous>", "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.offerhub.impl.usecase.GetCommercialMessagesForCarouselUseCaseImpl$invoke$1", f = "GetCommercialMessagesForCarouselUseCase.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: Aw.c$b */
    static final class b extends l implements p<List<? extends cw.b>, C17164e<? super List<? extends cw.b>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f107754c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f107755d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12608c f107756e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12608c cVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f107756e = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f107756e, eVar);
            bVar.f107755d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(List<cw.b> list, C17164e<? super List<cw.b>> eVar) {
            return ((b) create(list, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f107754c;
            if (i10 == 0) {
                y.b(obj);
                List list = (List) this.f107755d;
                C12608c cVar = this.f107756e;
                this.f107755d = list;
                this.f107754c = 1;
                obj = cVar.e(list, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                List list2 = (List) this.f107755d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcw/b;", "list", "<anonymous>", "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.offerhub.impl.usecase.GetCommercialMessagesForCarouselUseCaseImpl$invoke$2", f = "GetCommercialMessagesForCarouselUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Aw.c$c  reason: collision with other inner class name */
    static final class C2570c extends l implements p<List<? extends cw.b>, C17164e<? super List<? extends cw.b>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f107757c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f107758d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Aw.c$c$a */
        public static final class a<T> implements Comparator {
            public final int compare(T t10, T t11) {
                boolean z10 = false;
                Boolean valueOf = Boolean.valueOf(((cw.b) t10).g() != null);
                if (((cw.b) t11).g() != null) {
                    z10 = true;
                }
                return C17035a.e(valueOf, Boolean.valueOf(z10));
            }
        }

        C2570c(C17164e<? super C2570c> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2570c cVar = new C2570c(eVar);
            cVar.f107758d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(List<cw.b> list, C17164e<? super List<cw.b>> eVar) {
            return ((C2570c) create(list, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f107757c == 0) {
                y.b(obj);
                return C16877v.g1((List) this.f107758d, new a());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.offerhub.impl.usecase.GetCommercialMessagesForCarouselUseCaseImpl", f = "GetCommercialMessagesForCarouselUseCase.kt", l = {57}, m = "mapMessageLink")
    /* renamed from: Aw.c$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f107759c;

        /* renamed from: d  reason: collision with root package name */
        Object f107760d;

        /* renamed from: e  reason: collision with root package name */
        Object f107761e;

        /* renamed from: f  reason: collision with root package name */
        Object f107762f;

        /* renamed from: g  reason: collision with root package name */
        Object f107763g;

        /* renamed from: h  reason: collision with root package name */
        Object f107764h;

        /* renamed from: i  reason: collision with root package name */
        Object f107765i;

        /* renamed from: j  reason: collision with root package name */
        Object f107766j;

        /* renamed from: k  reason: collision with root package name */
        Object f107767k;

        /* renamed from: l  reason: collision with root package name */
        Object f107768l;

        /* renamed from: m  reason: collision with root package name */
        int f107769m;

        /* renamed from: n  reason: collision with root package name */
        int f107770n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f107771o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C12608c f107772p;

        /* renamed from: q  reason: collision with root package name */
        int f107773q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C12608c cVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f107772p = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f107771o = obj;
            this.f107773q |= Integer.MIN_VALUE;
            return this.f107772p.g((cw.b) null, this);
        }
    }

    public C12608c(cw.d dVar, Set<Zl.a> set, C10253a aVar) {
        C17542s.j(dVar, "messageCenterRepository");
        C17542s.j(set, "appLinkMappers");
        C17542s.j(aVar, "killSwitchRepository");
        this.f107732a = set;
        this.f107733b = aVar;
        this.f107734c = dVar.c();
    }

    /* access modifiers changed from: private */
    public static final boolean d(cw.b bVar) {
        C17542s.j(bVar, "message");
        return C16877v.q(c.CAMPAIGNS_LOCAL, c.DELIVERY, c.SALE).contains(bVar.j());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.util.List<cw.b> r18, dI.C17164e<? super java.util.List<cw.b>> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof Aw.C12608c.a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            Aw.c$a r2 = (Aw.C12608c.a) r2
            int r3 = r2.f107753t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f107753t = r3
            goto L_0x001c
        L_0x0017:
            Aw.c$a r2 = new Aw.c$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f107751r
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f107753t
            r6 = 1
            if (r5 == 0) goto L_0x0075
            if (r5 != r6) goto L_0x006d
            int r1 = r2.f107749p
            int r5 = r2.f107748o
            java.lang.Object r8 = r2.f107747n
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r9 = r2.f107746m
            cw.b r9 = (cw.b) r9
            java.lang.Object r9 = r2.f107744k
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r2.f107743j
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r11 = r2.f107742i
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r12 = r2.f107741h
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r13 = r2.f107740g
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r14 = r2.f107739f
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r2.f107738e
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r6 = r2.f107737d
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r2.f107736c
            Aw.c r7 = (Aw.C12608c) r7
            XH.y.b(r3)
            r16 = r14
            r14 = r12
            r12 = r9
            r9 = r8
            r8 = r7
            r7 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r15
            r15 = r13
            r13 = r11
            r11 = r10
            r10 = 1
            goto L_0x00fd
        L_0x006d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0075:
            XH.y.b(r3)
            if (r18 == 0) goto L_0x0113
            r3 = r18
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r3.iterator()
        L_0x0087:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x009e
            java.lang.Object r7 = r6.next()
            r8 = r7
            cw.b r8 = (cw.b) r8
            boolean r8 = r0.f(r8)
            if (r8 == 0) goto L_0x0087
            r5.add(r7)
            goto L_0x0087
        L_0x009e:
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = YH.C16877v.y(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r5.iterator()
            r13 = r3
            r11 = r5
            r12 = r11
            r14 = r12
            r8 = r6
            r9 = r7
            r3 = 0
            r6 = 0
            r7 = r0
            r5 = r2
            r2 = r1
            r1 = r18
        L_0x00ba:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x010e
            java.lang.Object r10 = r9.next()
            r15 = r10
            cw.b r15 = (cw.b) r15
            r5.f107736c = r7
            r5.f107737d = r1
            r5.f107738e = r2
            r5.f107739f = r14
            r5.f107740g = r13
            r5.f107741h = r12
            r5.f107742i = r11
            r5.f107743j = r8
            r5.f107744k = r9
            r5.f107745l = r10
            r5.f107746m = r15
            r5.f107747n = r8
            r5.f107748o = r6
            r5.f107749p = r3
            r10 = 0
            r5.f107750q = r10
            r10 = 1
            r5.f107753t = r10
            java.lang.Object r15 = r7.g(r15, r5)
            if (r15 != r4) goto L_0x00f0
            return r4
        L_0x00f0:
            r16 = r14
            r14 = r12
            r12 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r3
            r3 = r15
            r15 = r13
            r13 = r11
            r11 = r9
        L_0x00fd:
            cw.b r3 = (cw.b) r3
            r9.add(r3)
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r11
            r9 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r16
            goto L_0x00ba
        L_0x010e:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x0113
            goto L_0x0117
        L_0x0113:
            java.util.List r8 = YH.C16877v.n()
        L_0x0117:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Aw.C12608c.e(java.util.List, dI.e):java.lang.Object");
    }

    private final boolean f(cw.b bVar) {
        return this.f107733b.m() && this.f107735d.invoke(bVar).booleanValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(cw.b r24, dI.C17164e<? super cw.b> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof Aw.C12608c.d
            if (r2 == 0) goto L_0x0017
            r2 = r1
            Aw.c$d r2 = (Aw.C12608c.d) r2
            int r3 = r2.f107773q
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f107773q = r3
            goto L_0x001c
        L_0x0017:
            Aw.c$d r2 = new Aw.c$d
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f107771o
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f107773q
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x005e
            if (r5 != r6) goto L_0x0056
            java.lang.Object r1 = r2.f107768l
            Zl.a r1 = (Zl.a) r1
            java.lang.Object r1 = r2.f107767k
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f107766j
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f107765i
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r1 = r2.f107764h
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r1 = r2.f107763g
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r1 = r2.f107762f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f107761e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f107760d
            cw.b r1 = (cw.b) r1
            java.lang.Object r2 = r2.f107759c
            Aw.c r2 = (Aw.C12608c) r2
            XH.y.b(r3)
            goto L_0x00b3
        L_0x0056:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005e:
            XH.y.b(r3)
            java.lang.String r3 = r24.g()
            if (r3 == 0) goto L_0x00c2
            android.net.Uri r5 = android.net.Uri.parse(r3)
            if (r5 == 0) goto L_0x00c2
            java.util.Set<Zl.a> r8 = r0.f107732a
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r9 = r8.iterator()
        L_0x0075:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0089
            java.lang.Object r10 = r9.next()
            r11 = r10
            Zl.a r11 = (Zl.a) r11
            boolean r11 = r11.a(r5)
            if (r11 == 0) goto L_0x0075
            goto L_0x008a
        L_0x0089:
            r10 = r7
        L_0x008a:
            Zl.a r10 = (Zl.a) r10
            if (r10 == 0) goto L_0x00bc
            r2.f107759c = r0
            r11 = r24
            r2.f107760d = r11
            r2.f107761e = r1
            r2.f107762f = r3
            r2.f107763g = r5
            r2.f107764h = r5
            r2.f107765i = r5
            r2.f107766j = r8
            r2.f107767k = r9
            r2.f107768l = r10
            r1 = 0
            r2.f107769m = r1
            r2.f107770n = r1
            r2.f107773q = r6
            java.lang.Object r3 = r10.b(r5, r2)
            if (r3 != r4) goto L_0x00b2
            return r4
        L_0x00b2:
            r1 = r11
        L_0x00b3:
            android.net.Uri r3 = (android.net.Uri) r3
            if (r3 == 0) goto L_0x00bf
            java.lang.String r7 = r3.toString()
            goto L_0x00bf
        L_0x00bc:
            r11 = r24
            r1 = r11
        L_0x00bf:
            r8 = r1
            r12 = r7
            goto L_0x00c6
        L_0x00c2:
            r11 = r24
            r12 = r7
            r8 = r11
        L_0x00c6:
            r21 = 4087(0xff7, float:5.727E-42)
            r22 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            cw.b r1 = cw.b.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Aw.C12608c.g(cw.b, dI.e):java.lang.Object");
    }

    public C16532g<List<cw.b>> invoke() {
        return C16534i.N(C16534i.N(this.f107734c, new b(this, (C17164e<? super b>) null)), new C2570c((C17164e<? super C2570c>) null));
    }
}
