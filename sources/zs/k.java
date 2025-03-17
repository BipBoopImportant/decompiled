package zs;

import HJ.C15854t;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import YH.X;
import android.net.Uri;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import tI.C17978n;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH@¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0010H@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R'\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00188FX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lzs/k;", "Lzs/i;", "", "LGs/a;", "inboxFeatures", "LQs/b;", "getNotificationMessageUseCase", "<init>", "(Ljava/util/Set;LQs/b;)V", "LPs/d;", "notification", "", "e", "(LPs/d;LdI/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "applink", "LPs/b;", "a", "(Landroid/net/Uri;)LPs/b;", "id", "b", "(LPs/b;LdI/e;)Ljava/lang/Object;", "Ljava/util/Set;", "LQs/b;", "", "c", "LXH/o;", "f", "()Ljava/util/Map;", "supportedFeatures", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Gs.a> f107589a;

    /* renamed from: b  reason: collision with root package name */
    private final Qs.b f107590b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f107591c = C16825p.b(new j(this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.impl.navigation.InboxNotificationUriMapperImpl", f = "InboxNotificationUriMapper.kt", l = {69}, m = "getInternalUriFor")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f107592c;

        /* renamed from: d  reason: collision with root package name */
        Object f107593d;

        /* renamed from: e  reason: collision with root package name */
        Object f107594e;

        /* renamed from: f  reason: collision with root package name */
        Object f107595f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f107596g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k f107597h;

        /* renamed from: i  reason: collision with root package name */
        int f107598i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f107597h = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f107596g = obj;
            this.f107598i |= Integer.MIN_VALUE;
            return this.f107597h.e((Ps.d) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.impl.navigation.InboxNotificationUriMapperImpl", f = "InboxNotificationUriMapper.kt", l = {54, 59}, m = "getInternalUriForId")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f107599c;

        /* renamed from: d  reason: collision with root package name */
        Object f107600d;

        /* renamed from: e  reason: collision with root package name */
        Object f107601e;

        /* renamed from: f  reason: collision with root package name */
        Object f107602f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f107603g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k f107604h;

        /* renamed from: i  reason: collision with root package name */
        int f107605i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f107604h = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f107603g = obj;
            this.f107605i |= Integer.MIN_VALUE;
            return this.f107604h.b((Ps.b) null, this);
        }
    }

    public k(Set<Gs.a> set, Qs.b bVar) {
        C17542s.j(set, "inboxFeatures");
        C17542s.j(bVar, "getNotificationMessageUseCase");
        this.f107589a = set;
        this.f107590b = bVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(Ps.d r30, dI.C17164e<? super java.lang.String> r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r31
            boolean r2 = r1 instanceof zs.k.a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            zs.k$a r2 = (zs.k.a) r2
            int r3 = r2.f107598i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f107598i = r3
            goto L_0x001c
        L_0x0017:
            zs.k$a r2 = new zs.k$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f107596g
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f107598i
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r9 = "main"
            java.lang.String r10 = "Kt"
            r12 = 36
            r13 = 0
            r14 = 2
            r15 = 1
            r11 = 0
            if (r5 == 0) goto L_0x0055
            if (r5 != r15) goto L_0x004d
            java.lang.Object r1 = r2.f107595f
            Gs.a r1 = (Gs.a) r1
            java.lang.Object r1 = r2.f107594e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f107593d
            Ps.d r1 = (Ps.d) r1
            java.lang.Object r2 = r2.f107592c
            zs.k r2 = (zs.k) r2
            XH.y.b(r3)
            goto L_0x013f
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0055:
            XH.y.b(r3)
            java.util.Map r3 = r29.f()
            java.lang.String r5 = r30.d()
            java.lang.Object r3 = r3.get(r5)
            Gs.a r3 = (Gs.a) r3
            if (r3 != 0) goto L_0x0121
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r30.d()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not find feature: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            qv.e r2 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0095:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00ad
            java.lang.Object r5 = r3.next()
            r15 = r5
            qv.b r15 = (qv.C11819b) r15
            boolean r15 = r15.b(r2, r13)
            if (r15 == 0) goto L_0x00ab
            r4.add(r5)
        L_0x00ab:
            r15 = 1
            goto L_0x0095
        L_0x00ad:
            java.util.Iterator r3 = r4.iterator()
            r4 = r11
            r5 = r4
        L_0x00b3:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x0120
            java.lang.Object r13 = r3.next()
            r17 = r13
            qv.b r17 = (qv.C11819b) r17
            if (r4 != 0) goto L_0x00ce
            java.lang.String r4 = qv.C11818a.a(r11, r1)
            if (r4 != 0) goto L_0x00ca
            goto L_0x0120
        L_0x00ca:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x00ce:
            if (r5 != 0) goto L_0x0112
            java.lang.Class<zs.k> r5 = zs.k.class
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r13 = HJ.C15854t.s1(r5, r12, r11, r14, r11)
            r15 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r15, r11, r14, r11)
            int r15 = r13.length()
            if (r15 != 0) goto L_0x00ea
            goto L_0x00ee
        L_0x00ea:
            java.lang.String r5 = HJ.C15854t.P0(r13, r10)
        L_0x00ee:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            r15 = 1
            boolean r13 = HJ.C15854t.b0(r13, r9, r15)
            if (r13 == 0) goto L_0x00ff
            r13 = r8
            goto L_0x0100
        L_0x00ff:
            r13 = r7
        L_0x0100:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            r15.append(r6)
            r15.append(r5)
            java.lang.String r5 = r15.toString()
        L_0x0112:
            r20 = 0
            r18 = r2
            r19 = r5
            r21 = r1
            r22 = r4
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x00b3
        L_0x0120:
            return r11
        L_0x0121:
            int r5 = r30.e()
            java.util.Map r15 = r30.c()
            r2.f107592c = r0
            r12 = r30
            r2.f107593d = r12
            r2.f107594e = r1
            r2.f107595f = r3
            r1 = 1
            r2.f107598i = r1
            java.lang.Object r3 = r3.b(r5, r15, r2)
            if (r3 != r4) goto L_0x013d
            return r4
        L_0x013d:
            r2 = r0
            r1 = r12
        L_0x013f:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0207
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            Ps.b r1 = r1.g()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r12 = "No valid URI for id:"
            r5.append(r12)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r4.<init>(r1)
            qv.e r1 = qv.e.ERROR
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0170:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L_0x0188
            java.lang.Object r15 = r5.next()
            r14 = r15
            qv.b r14 = (qv.C11819b) r14
            boolean r14 = r14.b(r1, r13)
            if (r14 == 0) goto L_0x0186
            r12.add(r15)
        L_0x0186:
            r14 = 2
            goto L_0x0170
        L_0x0188:
            java.util.Iterator r5 = r12.iterator()
            r12 = r11
            r13 = r12
        L_0x018e:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x0207
            java.lang.Object r14 = r5.next()
            r23 = r14
            qv.b r23 = (qv.C11819b) r23
            if (r12 != 0) goto L_0x01a9
            java.lang.String r12 = qv.C11818a.a(r11, r4)
            if (r12 != 0) goto L_0x01a5
            goto L_0x0207
        L_0x01a5:
            java.lang.String r12 = qv.C11820c.a(r12)
        L_0x01a9:
            if (r13 != 0) goto L_0x01f3
            java.lang.Class r13 = r2.getClass()
            java.lang.String r13 = r13.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            r14 = 36
            r15 = 2
            java.lang.String r0 = HJ.C15854t.s1(r13, r14, r11, r15, r11)
            r14 = 46
            java.lang.String r0 = HJ.C15854t.o1(r0, r14, r11, r15, r11)
            int r16 = r0.length()
            if (r16 != 0) goto L_0x01ca
            goto L_0x01ce
        L_0x01ca:
            java.lang.String r13 = HJ.C15854t.P0(r0, r10)
        L_0x01ce:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r11 = 1
            boolean r0 = HJ.C15854t.b0(r0, r9, r11)
            if (r0 == 0) goto L_0x01df
            r0 = r8
            goto L_0x01e0
        L_0x01df:
            r0 = r7
        L_0x01e0:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r6)
            r11.append(r13)
            java.lang.String r13 = r11.toString()
            goto L_0x01f6
        L_0x01f3:
            r14 = 46
            r15 = 2
        L_0x01f6:
            r26 = 0
            r24 = r1
            r25 = r13
            r27 = r4
            r28 = r12
            r23.a(r24, r25, r26, r27, r28)
            r0 = r29
            r11 = 0
            goto L_0x018e
        L_0x0207:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zs.k.e(Ps.d, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final Map g(k kVar) {
        Iterable iterable = kVar.f107589a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(((Gs.a) next).d(), next);
        }
        return linkedHashMap;
    }

    public Ps.b a(Uri uri) {
        C17542s.j(uri, "applink");
        Ps.b d10 = h.d(uri);
        if (d10 != null) {
            return d10;
        }
        e eVar = e.WARN;
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
                String a10 = C11818a.a("Could not construct inboxId from uri: " + uri, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = k.class.getName();
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
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: dI.e<? super java.lang.String>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(Ps.b r14, dI.C17164e<? super java.lang.String> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof zs.k.b
            if (r0 == 0) goto L_0x0013
            r0 = r15
            zs.k$b r0 = (zs.k.b) r0
            int r1 = r0.f107605i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f107605i = r1
            goto L_0x0018
        L_0x0013:
            zs.k$b r0 = new zs.k$b
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f107603g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f107605i
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L_0x0056
            if (r3 == r4) goto L_0x0045
            if (r3 != r5) goto L_0x003d
            java.lang.Object r14 = r0.f107602f
            Ps.d r14 = (Ps.d) r14
            java.lang.Object r14 = r0.f107601e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f107600d
            Ps.b r14 = (Ps.b) r14
            java.lang.Object r14 = r0.f107599c
            zs.k r14 = (zs.k) r14
            XH.y.b(r1)
            goto L_0x0139
        L_0x003d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0045:
            java.lang.Object r14 = r0.f107601e
            r15 = r14
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r14 = r0.f107600d
            Ps.b r14 = (Ps.b) r14
            java.lang.Object r3 = r0.f107599c
            zs.k r3 = (zs.k) r3
            XH.y.b(r1)
            goto L_0x006b
        L_0x0056:
            XH.y.b(r1)
            Qs.b r1 = r13.f107590b
            r0.f107599c = r13
            r0.f107600d = r14
            r0.f107601e = r15
            r0.f107605i = r4
            java.lang.Object r1 = r1.a(r14, r0)
            if (r1 != r2) goto L_0x006a
            return r2
        L_0x006a:
            r3 = r13
        L_0x006b:
            Ps.d r1 = (Ps.d) r1
            if (r1 != 0) goto L_0x0128
            qv.e r15 = qv.e.WARN
            qv.d r0 = qv.d.f102012a
            java.util.List r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0082:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x009a
            java.lang.Object r2 = r0.next()
            r6 = r2
            qv.b r6 = (qv.C11819b) r6
            r7 = 0
            boolean r6 = r6.b(r15, r7)
            if (r6 == 0) goto L_0x0082
            r1.add(r2)
            goto L_0x0082
        L_0x009a:
            java.util.Iterator r0 = r1.iterator()
            r1 = 0
            r2 = r1
            r6 = r2
        L_0x00a1:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0127
            java.lang.Object r7 = r0.next()
            qv.b r7 = (qv.C11819b) r7
            r10 = 0
            if (r2 != 0) goto L_0x00cc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "Could not find notification for id: "
            r2.append(r8)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = qv.C11818a.a(r2, r10)
            if (r2 != 0) goto L_0x00c8
            goto L_0x0127
        L_0x00c8:
            java.lang.String r2 = qv.C11820c.a(r2)
        L_0x00cc:
            if (r6 != 0) goto L_0x011b
            java.lang.Class r6 = r3.getClass()
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r8 = 36
            java.lang.String r8 = HJ.C15854t.s1(r6, r8, r1, r5, r1)
            r9 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r9, r1, r5, r1)
            int r9 = r8.length()
            if (r9 != 0) goto L_0x00ec
            goto L_0x00f2
        L_0x00ec:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r8, r6)
        L_0x00f2:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r9, r4)
            if (r8 == 0) goto L_0x0105
            java.lang.String r8 = "m"
            goto L_0x0107
        L_0x0105:
            java.lang.String r8 = "b"
        L_0x0107:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "|"
            r9.append(r8)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
        L_0x011b:
            r12 = r6
            r9 = 0
            r6 = r7
            r7 = r15
            r8 = r12
            r11 = r2
            r6.a(r7, r8, r9, r10, r11)
            r6 = r12
            goto L_0x00a1
        L_0x0127:
            return r1
        L_0x0128:
            r0.f107599c = r3
            r0.f107600d = r14
            r0.f107601e = r15
            r0.f107602f = r1
            r0.f107605i = r5
            java.lang.Object r1 = r3.e(r1, r0)
            if (r1 != r2) goto L_0x0139
            return r2
        L_0x0139:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zs.k.b(Ps.b, dI.e):java.lang.Object");
    }

    public final Map<String, Gs.a> f() {
        return (Map) this.f107591c.getValue();
    }
}
