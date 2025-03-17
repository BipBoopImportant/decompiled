package hi;

import HJ.C15854t;
import XH.t;
import XH.v;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import gi.C9757l;
import hi.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import ru.C11847a;
import ru.c;
import tu.C11995a;
import yu.C12517b;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fHB¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhi/d;", "Lhi/c;", "Lru/c;", "wayfindingIntegration", "Ltu/a;", "wayfindingRepository", "Lru/b;", "poiResolver", "<init>", "(Lru/c;Ltu/a;Lru/b;)V", "Lyu/b;", "location", "Lhi/c$a;", "b", "(Lyu/b;)Lhi/c$a;", "", "storeId", "productNumber", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lru/c;", "Ltu/a;", "c", "Lru/b;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f74150a;

    /* renamed from: b  reason: collision with root package name */
    private final C11995a f74151b;

    /* renamed from: c  reason: collision with root package name */
    private final ru.b f74152c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f74153a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                yu.b$a$b$a[] r0 = yu.C12517b.a.C2559b.C2560a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                yu.b$a$b$a r1 = yu.C12517b.a.C2559b.C2560a.FULL_SERVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                yu.b$a$b$a r1 = yu.C12517b.a.C2559b.C2560a.SELF_SERVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                yu.b$a$b$a r1 = yu.C12517b.a.C2559b.C2560a.SHOWROOM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                yu.b$a$b$a r1 = yu.C12517b.a.C2559b.C2560a.MARKETHALL     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f74153a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hi.d.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.usecase.GetInStoreNavigationTileUseCaseImpl", f = "GetInStoreNavigationTileUseCase.kt", l = {133, 143, 147}, m = "invoke")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f74154c;

        /* renamed from: d  reason: collision with root package name */
        Object f74155d;

        /* renamed from: e  reason: collision with root package name */
        Object f74156e;

        /* renamed from: f  reason: collision with root package name */
        Object f74157f;

        /* renamed from: g  reason: collision with root package name */
        boolean f74158g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f74159h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ d f74160i;

        /* renamed from: j  reason: collision with root package name */
        int f74161j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f74160i = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f74159h = obj;
            this.f74161j |= Integer.MIN_VALUE;
            return this.f74160i.a((String) null, (String) null, this);
        }
    }

    public d(c cVar, C11995a aVar, ru.b bVar) {
        C17542s.j(cVar, "wayfindingIntegration");
        C17542s.j(aVar, "wayfindingRepository");
        C17542s.j(bVar, "poiResolver");
        this.f74150a = cVar;
        this.f74151b = aVar;
        this.f74152c = bVar;
    }

    private final c.a b(C12517b bVar) {
        v vVar;
        C12517b.a.C2559b.C2560a a10 = bVar.b().b().a();
        int i10 = a.f74153a[a10.ordinal()];
        int i11 = 2;
        if (i10 == 1 || i10 == 2) {
            vVar = new v(bVar.a(), C9757l.a.DISPLAY);
        } else if (i10 == 3 || i10 == 4) {
            vVar = new v(bVar.b(), C9757l.a.SALES);
        } else {
            throw new t();
        }
        C12517b.a aVar = (C12517b.a) vVar.a();
        C9757l.a aVar2 = (C9757l.a) vVar.b();
        char c10 = '$';
        Class<d> cls = d.class;
        Integer num = null;
        if (aVar == null) {
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a11 = C11818a.a("No location available for " + bVar, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                } else {
                    C12517b bVar3 = bVar;
                }
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar2.a(eVar, str2, false, (Throwable) null, str);
                c10 = '$';
            }
            return null;
        }
        C12517b.a.C2558a a12 = aVar.a();
        String a13 = aVar.c().a();
        String b10 = a12 != null ? a12.b() : null;
        if (b10 == null || b10.length() == 0) {
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar4 : arrayList2) {
                if (str3 == null) {
                    String a14 = C11818a.a("No department name exists, hide in-store navigation tile", (Throwable) null);
                    if (a14 == null) {
                        break;
                    }
                    str3 = C11820c.a(a14);
                }
                if (str4 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, i11, (Object) null), '.', (String) null, i11, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar4.a(eVar2, str4, false, (Throwable) null, str3);
                i11 = 2;
            }
            return null;
        }
        String str5 = b10 + ", " + a13;
        C11847a a15 = this.f74152c.a(a12.a());
        if (a15 != null) {
            num = Integer.valueOf(a15.c());
        }
        return new c.a(aVar2, str5, num, a10.b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r21, java.lang.String r22, dI.C17164e<? super hi.c.a> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            boolean r2 = r1 instanceof hi.d.b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            hi.d$b r2 = (hi.d.b) r2
            int r3 = r2.f74161j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f74161j = r3
            goto L_0x001c
        L_0x0017:
            hi.d$b r2 = new hi.d$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f74159h
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f74161j
            r6 = 3
            r7 = 1
            r8 = 2
            r9 = 0
            if (r5 == 0) goto L_0x0084
            if (r5 == r7) goto L_0x006b
            if (r5 == r8) goto L_0x004d
            if (r5 != r6) goto L_0x0045
            java.lang.Object r1 = r2.f74157f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f74156e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f74155d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f74154c
            hi.d r1 = (hi.d) r1
            XH.y.b(r3)
            goto L_0x0192
        L_0x0045:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004d:
            boolean r1 = r2.f74158g
            java.lang.Object r5 = r2.f74157f
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r7 = r2.f74156e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.f74155d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r10 = r2.f74154c
            hi.d r10 = (hi.d) r10
            XH.y.b(r3)
            r19 = r3
            r3 = r1
            r1 = r10
            r10 = r7
            r7 = r19
            goto L_0x0174
        L_0x006b:
            java.lang.Object r1 = r2.f74157f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f74156e
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r10 = r2.f74155d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.f74154c
            hi.d r11 = (hi.d) r11
            XH.y.b(r3)
            r19 = r10
            r10 = r5
            r5 = r19
            goto L_0x00a3
        L_0x0084:
            XH.y.b(r3)
            ru.c r3 = r0.f74150a
            TJ.g r3 = r3.a()
            r2.f74154c = r0
            r5 = r21
            r2.f74155d = r5
            r10 = r22
            r2.f74156e = r10
            r2.f74157f = r1
            r2.f74161j = r7
            java.lang.Object r3 = TJ.C16534i.B(r3, r2)
            if (r3 != r4) goto L_0x00a2
            return r4
        L_0x00a2:
            r11 = r0
        L_0x00a3:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x00ac
            return r9
        L_0x00ac:
            int r12 = r5.length()
            if (r12 != 0) goto L_0x015c
            qv.e r1 = qv.e.WARN
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00c5:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00dd
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            r6 = 0
            boolean r5 = r5.b(r1, r6)
            if (r5 == 0) goto L_0x00c5
            r3.add(r4)
            goto L_0x00c5
        L_0x00dd:
            java.util.Iterator r2 = r3.iterator()
            r3 = r9
            r4 = r3
        L_0x00e3:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x015b
            java.lang.Object r5 = r2.next()
            r13 = r5
            qv.b r13 = (qv.C11819b) r13
            r5 = 0
            if (r3 != 0) goto L_0x0100
            java.lang.String r3 = "Trying to fetch wayfinding location with empty store"
            java.lang.String r3 = qv.C11818a.a(r3, r5)
            if (r3 != 0) goto L_0x00fc
            goto L_0x015b
        L_0x00fc:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x0100:
            if (r4 != 0) goto L_0x014f
            java.lang.Class r4 = r11.getClass()
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r6 = 36
            java.lang.String r6 = HJ.C15854t.s1(r4, r6, r9, r8, r9)
            r10 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r10, r9, r8, r9)
            int r10 = r6.length()
            if (r10 != 0) goto L_0x0120
            goto L_0x0126
        L_0x0120:
            java.lang.String r4 = "Kt"
            java.lang.String r4 = HJ.C15854t.P0(r6, r4)
        L_0x0126:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r10 = "main"
            boolean r6 = HJ.C15854t.b0(r6, r10, r7)
            if (r6 == 0) goto L_0x0139
            java.lang.String r6 = "m"
            goto L_0x013b
        L_0x0139:
            java.lang.String r6 = "b"
        L_0x013b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = "|"
            r10.append(r6)
            r10.append(r4)
            java.lang.String r4 = r10.toString()
        L_0x014f:
            r16 = 0
            r14 = r1
            r15 = r4
            r17 = r5
            r18 = r3
            r13.a(r14, r15, r16, r17, r18)
            goto L_0x00e3
        L_0x015b:
            return r9
        L_0x015c:
            ru.c r7 = r11.f74150a
            r2.f74154c = r11
            r2.f74155d = r5
            r2.f74156e = r10
            r2.f74157f = r1
            r2.f74158g = r3
            r2.f74161j = r8
            java.lang.Object r7 = r7.b(r5, r2)
            if (r7 != r4) goto L_0x0171
            return r4
        L_0x0171:
            r8 = r5
            r5 = r1
            r1 = r11
        L_0x0174:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x017d
            return r9
        L_0x017d:
            tu.a r7 = r1.f74151b
            r2.f74154c = r1
            r2.f74155d = r8
            r2.f74156e = r10
            r2.f74157f = r5
            r2.f74158g = r3
            r2.f74161j = r6
            java.lang.Object r3 = r7.a(r8, r10, r2)
            if (r3 != r4) goto L_0x0192
            return r4
        L_0x0192:
            yu.b r3 = (yu.C12517b) r3
            hi.c$a r1 = r1.b(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.d.a(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
