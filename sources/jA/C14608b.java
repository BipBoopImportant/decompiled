package jA;

import HJ.C15854t;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import Zj.h;
import com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.core.logger.DslKt;
import fK.q;
import java.util.ArrayList;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0010B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\"\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001e"}, d2 = {"LjA/b;", "LjA/a;", "LkK/c;", "json", "LZj/h;", "userSessionCredentialsStorage", "<init>", "(LkK/c;LZj/h;)V", "Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;", "sessionCredentials", "", "c", "(Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;)Z", "LXH/N;", "b", "()V", "a", "LkK/c;", "LZj/h;", "LTJ/B;", "LTJ/B;", "_credentialsFlow", "LTJ/P;", "d", "LTJ/P;", "()LTJ/P;", "credentialsFlow", "()Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;", "credentials", "e", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jA.b  reason: case insensitive filesystem */
public final class C14608b implements C14607a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f127793e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17514c f127794a;

    /* renamed from: b  reason: collision with root package name */
    private final h f127795b;

    /* renamed from: c  reason: collision with root package name */
    private final C16505B<CiamSessionCredentials> f127796c;

    /* renamed from: d  reason: collision with root package name */
    private final C16519P<CiamSessionCredentials> f127797d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LjA/b$a;", "", "<init>", "()V", "", "PACKAGE_NAME", "Ljava/lang/String;", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jA.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C14608b(C17514c cVar, h hVar) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(hVar, "userSessionCredentialsStorage");
        this.f127794a = cVar;
        this.f127795b = hVar;
        C16505B<CiamSessionCredentials> a10 = C16521S.a(d());
        this.f127796c = a10;
        this.f127797d = C16534i.c(a10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials d() {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "|"
            java.lang.String r3 = "b"
            java.lang.String r4 = "m"
            java.lang.String r5 = "main"
            java.lang.String r6 = "Kt"
            java.lang.Class<jA.b> r7 = jA.C14608b.class
            Zj.h r0 = r1.f127795b
            java.lang.String r8 = "com.ingka.ikea.app.credentials"
            java.lang.String r0 = r0.g(r8)
            r8 = 0
            if (r0 == 0) goto L_0x01a5
            r12 = 2
            kK.c r13 = r1.f127794a     // Catch:{ Exception -> 0x006b }
            r13.a()     // Catch:{ Exception -> 0x006b }
            com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials$a r14 = com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials.Companion     // Catch:{ Exception -> 0x006b }
            kotlinx.serialization.KSerializer r14 = r14.serializer()     // Catch:{ Exception -> 0x006b }
            java.lang.Object r0 = r13.c(r14, r0)     // Catch:{ Exception -> 0x006b }
            com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials r0 = (com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials) r0     // Catch:{ Exception -> 0x006b }
            boolean r13 = r0.h()     // Catch:{ Exception -> 0x006b }
            if (r13 == 0) goto L_0x0034
            r8 = r0
            goto L_0x01a5
        L_0x0034:
            Zj.h r0 = r1.f127795b     // Catch:{ Exception -> 0x006b }
            r0.clear()     // Catch:{ Exception -> 0x006b }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x006b }
            java.lang.String r13 = "Existing credentials were invalid"
            r0.<init>(r13)     // Catch:{ Exception -> 0x006b }
            qv.e r15 = qv.e.ERROR     // Catch:{ Exception -> 0x006b }
            qv.d r13 = qv.d.f102012a     // Catch:{ Exception -> 0x006b }
            java.util.List r13 = r13.a()     // Catch:{ Exception -> 0x006b }
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ Exception -> 0x006b }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x006b }
            r14.<init>()     // Catch:{ Exception -> 0x006b }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ Exception -> 0x006b }
        L_0x0053:
            boolean r16 = r13.hasNext()     // Catch:{ Exception -> 0x006b }
            r9 = 0
            if (r16 == 0) goto L_0x0070
            java.lang.Object r10 = r13.next()     // Catch:{ Exception -> 0x006b }
            r11 = r10
            qv.b r11 = (qv.C11819b) r11     // Catch:{ Exception -> 0x006b }
            boolean r9 = r11.b(r15, r9)     // Catch:{ Exception -> 0x006b }
            if (r9 == 0) goto L_0x0053
            r14.add(r10)     // Catch:{ Exception -> 0x006b }
            goto L_0x0053
        L_0x006b:
            r0 = move-exception
            r21 = r3
            goto L_0x00f4
        L_0x0070:
            java.util.Iterator r10 = r14.iterator()     // Catch:{ Exception -> 0x006b }
            r11 = r8
            r13 = r11
        L_0x0076:
            boolean r14 = r10.hasNext()     // Catch:{ Exception -> 0x006b }
            if (r14 == 0) goto L_0x01a5
            java.lang.Object r14 = r10.next()     // Catch:{ Exception -> 0x006b }
            qv.b r14 = (qv.C11819b) r14     // Catch:{ Exception -> 0x006b }
            if (r11 != 0) goto L_0x0090
            java.lang.String r11 = qv.C11818a.a(r8, r0)     // Catch:{ Exception -> 0x006b }
            if (r11 != 0) goto L_0x008c
            goto L_0x01a5
        L_0x008c:
            java.lang.String r11 = qv.C11820c.a(r11)     // Catch:{ Exception -> 0x006b }
        L_0x0090:
            if (r13 != 0) goto L_0x00db
            java.lang.String r13 = r7.getName()     // Catch:{ Exception -> 0x006b }
            kotlin.jvm.internal.C17542s.g(r13)     // Catch:{ Exception -> 0x006b }
            r21 = r3
            r9 = 36
            java.lang.String r3 = HJ.C15854t.s1(r13, r9, r8, r12, r8)     // Catch:{ Exception -> 0x00d9 }
            r9 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r9, r8, r12, r8)     // Catch:{ Exception -> 0x00d9 }
            int r9 = r3.length()     // Catch:{ Exception -> 0x00d9 }
            if (r9 != 0) goto L_0x00ae
            goto L_0x00b2
        L_0x00ae:
            java.lang.String r13 = HJ.C15854t.P0(r3, r6)     // Catch:{ Exception -> 0x00d9 }
        L_0x00b2:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x00d9 }
            r9 = 1
            boolean r3 = HJ.C15854t.b0(r3, r5, r9)     // Catch:{ Exception -> 0x00d9 }
            if (r3 == 0) goto L_0x00c3
            r3 = r4
            goto L_0x00c5
        L_0x00c3:
            r3 = r21
        L_0x00c5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d9 }
            r9.<init>()     // Catch:{ Exception -> 0x00d9 }
            r9.append(r3)     // Catch:{ Exception -> 0x00d9 }
            r9.append(r2)     // Catch:{ Exception -> 0x00d9 }
            r9.append(r13)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r13 = r9.toString()     // Catch:{ Exception -> 0x00d9 }
        L_0x00d7:
            r3 = r13
            goto L_0x00de
        L_0x00d9:
            r0 = move-exception
            goto L_0x00f4
        L_0x00db:
            r21 = r3
            goto L_0x00d7
        L_0x00de:
            r13 = r14
            r14 = r15
            r9 = r15
            r15 = r3
            r20 = 0
            r16 = r20
            r17 = r0
            r18 = r11
            r13.a(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00d9 }
            r13 = r3
            r15 = r9
            r9 = r20
            r3 = r21
            goto L_0x0076
        L_0x00f4:
            Zj.h r3 = r1.f127795b
            r3.clear()
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r9 = "Failed to parse credentials"
            r3.<init>(r9, r0)
            qv.e r0 = qv.e.ERROR
            qv.d r9 = qv.d.f102012a
            java.util.List r9 = r9.a()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0113:
            boolean r11 = r9.hasNext()
            r15 = 0
            if (r11 == 0) goto L_0x012b
            java.lang.Object r11 = r9.next()
            r13 = r11
            qv.b r13 = (qv.C11819b) r13
            boolean r13 = r13.b(r0, r15)
            if (r13 == 0) goto L_0x0113
            r10.add(r11)
            goto L_0x0113
        L_0x012b:
            java.util.Iterator r9 = r10.iterator()
            r10 = r8
            r11 = r10
        L_0x0131:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x01a5
            java.lang.Object r13 = r9.next()
            qv.b r13 = (qv.C11819b) r13
            if (r10 != 0) goto L_0x014a
            java.lang.String r10 = qv.C11818a.a(r8, r3)
            if (r10 != 0) goto L_0x0146
            goto L_0x01a5
        L_0x0146:
            java.lang.String r10 = qv.C11820c.a(r10)
        L_0x014a:
            if (r11 != 0) goto L_0x0190
            java.lang.String r11 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            r14 = 36
            java.lang.String r15 = HJ.C15854t.s1(r11, r14, r8, r12, r8)
            r1 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r1, r8, r12, r8)
            int r17 = r15.length()
            if (r17 != 0) goto L_0x0166
            goto L_0x016a
        L_0x0166:
            java.lang.String r11 = HJ.C15854t.P0(r15, r6)
        L_0x016a:
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.String r15 = r15.getName()
            r1 = 1
            boolean r15 = HJ.C15854t.b0(r15, r5, r1)
            if (r15 == 0) goto L_0x017b
            r15 = r4
            goto L_0x017d
        L_0x017b:
            r15 = r21
        L_0x017d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            goto L_0x0192
        L_0x0190:
            r14 = 36
        L_0x0192:
            r1 = r14
            r14 = r0
            r19 = 0
            r15 = r11
            r16 = r19
            r17 = r3
            r18 = r10
            r13.a(r14, r15, r16, r17, r18)
            r1 = r22
            r15 = r19
            goto L_0x0131
        L_0x01a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jA.C14608b.d():com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials");
    }

    public C16519P<CiamSessionCredentials> a() {
        return this.f127797d;
    }

    public void b() {
        CiamSessionCredentials value;
        this.f127795b.clear();
        C16505B<CiamSessionCredentials> b10 = this.f127796c;
        do {
            value = b10.getValue();
            CiamSessionCredentials ciamSessionCredentials = value;
        } while (!b10.e(value, null));
    }

    public boolean c(CiamSessionCredentials ciamSessionCredentials) {
        CiamSessionCredentials value;
        CiamSessionCredentials ciamSessionCredentials2 = ciamSessionCredentials;
        C17542s.j(ciamSessionCredentials2, "sessionCredentials");
        boolean z10 = ciamSessionCredentials.b() < System.currentTimeMillis();
        Class<C14608b> cls = C14608b.class;
        if (!ciamSessionCredentials.h() || z10) {
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
                    String a10 = C11818a.a("Unable to save credentials, not valid. Has expired: " + z10, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, false, (Throwable) null, str);
            }
        } else {
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str3 == null) {
                    String a11 = C11818a.a("Saving credentials", (Throwable) null);
                    if (a11 != null) {
                        str3 = C11820c.a(a11);
                    }
                }
                if (str4 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str4, false, (Throwable) null, str3);
            }
            try {
                C17514c cVar = this.f127794a;
                cVar.a();
                this.f127795b.a("com.ingka.ikea.app.credentials", cVar.b(CiamSessionCredentials.Companion.serializer(), ciamSessionCredentials2));
                C16505B<CiamSessionCredentials> b10 = this.f127796c;
                do {
                    value = b10.getValue();
                    CiamSessionCredentials ciamSessionCredentials3 = value;
                } while (!b10.e(value, ciamSessionCredentials2));
                return true;
            } catch (q e10) {
                e eVar3 = e.ERROR;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next3 : d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str5 = null;
                String str6 = null;
                for (C11819b bVar3 : arrayList3) {
                    if (str5 == null) {
                        String a12 = C11818a.a("Failed to encode session credentials", e10);
                        if (a12 == null) {
                            break;
                        }
                        str5 = C11820c.a(a12);
                    }
                    if (str6 == null) {
                        String name3 = cls.getName();
                        C17542s.g(name3);
                        String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o14.length() != 0) {
                            name3 = C15854t.P0(o14, "Kt");
                        }
                        str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                    }
                    bVar3.a(eVar3, str6, false, e10, str5);
                }
            }
        }
        return false;
    }
}
