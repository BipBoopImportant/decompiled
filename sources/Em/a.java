package Em;

import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17164e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEm/a;", "LLm/a;", "", "LZl/a;", "appLinkMappers", "<init>", "(Ljava/util/Set;)V", "", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "c", "(Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;LdI/e;)Ljava/lang/Object;", "appLinkUri", "a", "Ljava/util/Set;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Lm.a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Zl.a> f80721a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.benefits.impl.data.models.mappers.BenefitApplinkUriMapperImpl", f = "BenefitApplinkUriMapperImpl.kt", l = {32}, m = "mapToUri")
    /* renamed from: Em.a$a  reason: collision with other inner class name */
    static final class C1539a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f80722c;

        /* renamed from: d  reason: collision with root package name */
        Object f80723d;

        /* renamed from: e  reason: collision with root package name */
        Object f80724e;

        /* renamed from: f  reason: collision with root package name */
        Object f80725f;

        /* renamed from: g  reason: collision with root package name */
        Object f80726g;

        /* renamed from: h  reason: collision with root package name */
        Object f80727h;

        /* renamed from: i  reason: collision with root package name */
        Object f80728i;

        /* renamed from: j  reason: collision with root package name */
        Object f80729j;

        /* renamed from: k  reason: collision with root package name */
        Object f80730k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f80731l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a f80732m;

        /* renamed from: n  reason: collision with root package name */
        int f80733n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1539a(a aVar, C17164e<? super C1539a> eVar) {
            super(eVar);
            this.f80732m = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80731l = obj;
            this.f80733n |= Integer.MIN_VALUE;
            return this.f80732m.c((String) null, (Interaction$Component) null, this);
        }
    }

    public a(Set<Zl.a> set) {
        C17542s.j(set, "appLinkMappers");
        this.f80721a = set;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5 A[Catch:{ NullPointerException -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r13, com.ingka.ikea.analytics.Interaction$Component r14, dI.C17164e<? super java.lang.String> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof Em.a.C1539a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Em.a$a r0 = (Em.a.C1539a) r0
            int r1 = r0.f80733n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f80733n = r1
            goto L_0x0018
        L_0x0013:
            Em.a$a r0 = new Em.a$a
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f80731l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f80733n
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0056
            if (r3 != r4) goto L_0x004e
            java.lang.Object r13 = r0.f80730k
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r13 = r0.f80729j
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r13 = r0.f80728i
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r13 = r0.f80727h
            Zl.a r13 = (Zl.a) r13
            java.lang.Object r13 = r0.f80726g
            android.net.Uri r13 = (android.net.Uri) r13
            java.lang.Object r13 = r0.f80725f
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f80724e
            com.ingka.ikea.analytics.Interaction$Component r13 = (com.ingka.ikea.analytics.Interaction$Component) r13
            java.lang.Object r13 = r0.f80723d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r0.f80722c
            Em.a r14 = (Em.a) r14
            XH.y.b(r1)     // Catch:{ NullPointerException -> 0x00bb }
            goto L_0x00b1
        L_0x004e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0056:
            XH.y.b(r1)
            android.net.Uri r1 = android.net.Uri.parse(r13)     // Catch:{ NullPointerException -> 0x00bb }
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch:{ NullPointerException -> 0x00bb }
            java.lang.String r3 = "sourceComponent"
            java.lang.String r6 = r14.getValue()     // Catch:{ NullPointerException -> 0x00bb }
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r6)     // Catch:{ NullPointerException -> 0x00bb }
            android.net.Uri r1 = r1.build()     // Catch:{ NullPointerException -> 0x00bb }
            java.util.Set<Zl.a> r3 = r12.f80721a     // Catch:{ NullPointerException -> 0x00bb }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ NullPointerException -> 0x00bb }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ NullPointerException -> 0x00bb }
        L_0x0077:
            boolean r7 = r6.hasNext()     // Catch:{ NullPointerException -> 0x00bb }
            if (r7 == 0) goto L_0x008e
            java.lang.Object r7 = r6.next()     // Catch:{ NullPointerException -> 0x00bb }
            r8 = r7
            Zl.a r8 = (Zl.a) r8     // Catch:{ NullPointerException -> 0x00bb }
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ NullPointerException -> 0x00bb }
            boolean r8 = r8.a(r1)     // Catch:{ NullPointerException -> 0x00bb }
            if (r8 == 0) goto L_0x0077
            goto L_0x008f
        L_0x008e:
            r7 = r5
        L_0x008f:
            Zl.a r7 = (Zl.a) r7     // Catch:{ NullPointerException -> 0x00bb }
            if (r7 == 0) goto L_0x0175
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ NullPointerException -> 0x00bb }
            r0.f80722c = r12     // Catch:{ NullPointerException -> 0x00bb }
            r0.f80723d = r13     // Catch:{ NullPointerException -> 0x00bb }
            r0.f80724e = r14     // Catch:{ NullPointerException -> 0x00bb }
            r0.f80725f = r15     // Catch:{ NullPointerException -> 0x00bb }
            r0.f80726g = r1     // Catch:{ NullPointerException -> 0x00bb }
            r0.f80727h = r7     // Catch:{ NullPointerException -> 0x00bb }
            r0.f80728i = r3     // Catch:{ NullPointerException -> 0x00bb }
            r0.f80729j = r3     // Catch:{ NullPointerException -> 0x00bb }
            r0.f80730k = r6     // Catch:{ NullPointerException -> 0x00bb }
            r0.f80733n = r4     // Catch:{ NullPointerException -> 0x00bb }
            java.lang.Object r1 = r7.b(r1, r0)     // Catch:{ NullPointerException -> 0x00bb }
            if (r1 != r2) goto L_0x00b1
            return r2
        L_0x00b1:
            android.net.Uri r1 = (android.net.Uri) r1     // Catch:{ NullPointerException -> 0x00bb }
            if (r1 == 0) goto L_0x0175
            java.lang.String r5 = r1.toString()     // Catch:{ NullPointerException -> 0x00bb }
            goto L_0x0175
        L_0x00bb:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Failed to parse uri: "
            r15.append(r0)
            r15.append(r13)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            qv.e r15 = qv.e.ERROR
            qv.d r0 = qv.d.f102012a
            java.util.List r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00e4:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00fc
            java.lang.Object r2 = r0.next()
            r3 = r2
            qv.b r3 = (qv.C11819b) r3
            r6 = 0
            boolean r3 = r3.b(r15, r6)
            if (r3 == 0) goto L_0x00e4
            r1.add(r2)
            goto L_0x00e4
        L_0x00fc:
            java.util.Iterator r0 = r1.iterator()
            r1 = r5
            r2 = r1
        L_0x0102:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0175
            java.lang.Object r3 = r0.next()
            r6 = r3
            qv.b r6 = (qv.C11819b) r6
            if (r1 != 0) goto L_0x011c
            java.lang.String r1 = qv.C11818a.a(r5, r14)
            if (r1 != 0) goto L_0x0118
            goto L_0x0175
        L_0x0118:
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x011c:
            if (r2 != 0) goto L_0x016c
            java.lang.Class r2 = r13.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r3 = 36
            r7 = 2
            java.lang.String r3 = HJ.C15854t.s1(r2, r3, r5, r7, r5)
            r8 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r8, r5, r7, r5)
            int r7 = r3.length()
            if (r7 != 0) goto L_0x013d
            goto L_0x0143
        L_0x013d:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r3, r2)
        L_0x0143:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r7 = "main"
            boolean r3 = HJ.C15854t.b0(r3, r7, r4)
            if (r3 == 0) goto L_0x0156
            java.lang.String r3 = "m"
            goto L_0x0158
        L_0x0156:
            java.lang.String r3 = "b"
        L_0x0158:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r3 = "|"
            r7.append(r3)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
        L_0x016c:
            r9 = 0
            r7 = r15
            r8 = r2
            r10 = r14
            r11 = r1
            r6.a(r7, r8, r9, r10, r11)
            goto L_0x0102
        L_0x0175:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Em.a.c(java.lang.String, com.ingka.ikea.analytics.Interaction$Component, dI.e):java.lang.Object");
    }

    public Object a(String str, Interaction$Component interaction$Component, C17164e<? super String> eVar) {
        return c(str, interaction$Component, eVar);
    }
}
