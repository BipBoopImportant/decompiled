package lz;

import cz.C14328b;
import dI.C17164e;
import iz.C14606t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kz.i;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Llz/o;", "Lkz/i;", "Lcz/b;", "scanAndGoService", "Liz/t;", "upptackaProductsMapper", "<init>", "(Lcz/b;Liz/t;)V", "", "storeId", "listId", "", "", "quantityInCardMap", "Lkz/i$a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "Lcz/b;", "b", "Liz/t;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements i {

    /* renamed from: a  reason: collision with root package name */
    private final C14328b f129343a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14606t f129344b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.UpptackaRemoteDataSourceImpl", f = "UpptackaRemoteDataSourceImpl.kt", l = {28}, m = "fetchFromList")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f129345c;

        /* renamed from: d  reason: collision with root package name */
        Object f129346d;

        /* renamed from: e  reason: collision with root package name */
        Object f129347e;

        /* renamed from: f  reason: collision with root package name */
        Object f129348f;

        /* renamed from: g  reason: collision with root package name */
        Object f129349g;

        /* renamed from: h  reason: collision with root package name */
        Object f129350h;

        /* renamed from: i  reason: collision with root package name */
        Object f129351i;

        /* renamed from: j  reason: collision with root package name */
        int f129352j;

        /* renamed from: k  reason: collision with root package name */
        int f129353k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f129354l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ o f129355m;

        /* renamed from: n  reason: collision with root package name */
        int f129356n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f129355m = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129354l = obj;
            this.f129356n |= Integer.MIN_VALUE;
            return this.f129355m.a((String) null, (String) null, (Map<String, Integer>) null, this);
        }
    }

    public o(C14328b bVar, C14606t tVar) {
        C17542s.j(bVar, "scanAndGoService");
        C17542s.j(tVar, "upptackaProductsMapper");
        this.f129343a = bVar;
        this.f129344b = tVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.util.Map<java.lang.String, java.lang.Integer>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: lz.o} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        r7 = r2;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0480, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        r7 = r36;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x004e, B:19:0x0066] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x004e, B:22:0x0072] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058 A[ExcHandler: CancellationException (r0v24 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r34, java.lang.String r35, java.util.Map<java.lang.String, java.lang.Integer> r36, dI.C17164e<? super kz.i.a> r37) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            r3 = r35
            r0 = r37
            boolean r4 = r0 instanceof lz.o.a
            if (r4 == 0) goto L_0x001b
            r4 = r0
            lz.o$a r4 = (lz.o.a) r4
            int r5 = r4.f129356n
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f129356n = r5
            goto L_0x0020
        L_0x001b:
            lz.o$a r4 = new lz.o$a
            r4.<init>(r1, r0)
        L_0x0020:
            java.lang.Object r5 = r4.f129354l
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.f129356n
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L_0x0063
            if (r7 != r9) goto L_0x005b
            java.lang.Object r0 = r4.f129351i
            lz.o r0 = (lz.o) r0
            java.lang.Object r0 = r4.f129350h
            lz.o r0 = (lz.o) r0
            java.lang.Object r0 = r4.f129349g
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r4.f129348f
            r2 = r0
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r0 = r4.f129347e
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r4.f129346d
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r4.f129345c
            r4 = r0
            lz.o r4 = (lz.o) r4
            XH.y.b(r5)     // Catch:{ CancellationException -> 0x0058, all -> 0x0054 }
            r7 = r2
            r2 = r6
            goto L_0x0088
        L_0x0054:
            r0 = move-exception
            r7 = r2
            r2 = r6
            goto L_0x0098
        L_0x0058:
            r0 = move-exception
            goto L_0x0480
        L_0x005b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0063:
            XH.y.b(r5)
            XH.x$a r5 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0058, all -> 0x0094 }
            cz.b r5 = r1.f129343a     // Catch:{ CancellationException -> 0x0058, all -> 0x0094 }
            r4.f129345c = r1     // Catch:{ CancellationException -> 0x0058, all -> 0x0094 }
            r4.f129346d = r2     // Catch:{ CancellationException -> 0x0058, all -> 0x0094 }
            r4.f129347e = r3     // Catch:{ CancellationException -> 0x0058, all -> 0x0094 }
            r7 = r36
            r4.f129348f = r7     // Catch:{ CancellationException -> 0x0058, all -> 0x0091 }
            r4.f129349g = r0     // Catch:{ CancellationException -> 0x0058, all -> 0x0091 }
            r4.f129350h = r1     // Catch:{ CancellationException -> 0x0058, all -> 0x0091 }
            r4.f129351i = r1     // Catch:{ CancellationException -> 0x0058, all -> 0x0091 }
            r4.f129352j = r8     // Catch:{ CancellationException -> 0x0058, all -> 0x0091 }
            r4.f129353k = r8     // Catch:{ CancellationException -> 0x0058, all -> 0x0091 }
            r4.f129356n = r9     // Catch:{ CancellationException -> 0x0058, all -> 0x0091 }
            java.lang.Object r5 = r5.d(r2, r3, r4)     // Catch:{ CancellationException -> 0x0058, all -> 0x0091 }
            if (r5 != r6) goto L_0x0087
            return r6
        L_0x0087:
            r4 = r1
        L_0x0088:
            QL.x r5 = (QL.x) r5     // Catch:{ CancellationException -> 0x0058, all -> 0x008f }
            java.lang.Object r0 = XH.x.b(r5)     // Catch:{ CancellationException -> 0x0058, all -> 0x008f }
            goto L_0x00a2
        L_0x008f:
            r0 = move-exception
            goto L_0x0098
        L_0x0091:
            r0 = move-exception
        L_0x0092:
            r4 = r1
            goto L_0x0098
        L_0x0094:
            r0 = move-exception
            r7 = r36
            goto L_0x0092
        L_0x0098:
            XH.x$a r5 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x00a2:
            java.lang.Throwable r5 = XH.x.e(r0)
            java.lang.String r6 = "Failed Upptacka fetch list with "
            java.lang.String r15 = "|"
            java.lang.String r16 = "b"
            java.lang.String r17 = "m"
            java.lang.String r14 = "main"
            java.lang.String r13 = "Kt"
            if (r5 == 0) goto L_0x01a4
            qv.e r12 = qv.e.DEBUG
            qv.d r18 = qv.d.f102012a
            java.util.List r18 = r18.a()
            java.lang.Iterable r18 = (java.lang.Iterable) r18
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r18 = r18.iterator()
        L_0x00c7:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L_0x00de
            java.lang.Object r10 = r18.next()
            r11 = r10
            qv.b r11 = (qv.C11819b) r11
            boolean r11 = r11.b(r12, r8)
            if (r11 == 0) goto L_0x00c7
            r9.add(r10)
            goto L_0x00c7
        L_0x00de:
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
            r11 = 0
        L_0x00e4:
            boolean r18 = r9.hasNext()
            if (r18 == 0) goto L_0x01a4
            java.lang.Object r18 = r9.next()
            qv.b r18 = (qv.C11819b) r18
            if (r10 != 0) goto L_0x0118
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r2)
            java.lang.String r8 = " "
            r10.append(r8)
            r10.append(r3)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = qv.C11818a.a(r8, r5)
            if (r8 != 0) goto L_0x0114
            goto L_0x01a4
        L_0x0114:
            java.lang.String r10 = qv.C11820c.a(r8)
        L_0x0118:
            r8 = r10
            if (r11 != 0) goto L_0x016e
            java.lang.Class r10 = r4.getClass()
            java.lang.String r10 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r37 = r2
            r36 = r9
            r1 = 2
            r9 = 0
            r11 = 36
            java.lang.String r2 = HJ.C15854t.s1(r10, r11, r9, r1, r9)
            r20 = r3
            r3 = 46
            java.lang.String r2 = HJ.C15854t.o1(r2, r3, r9, r1, r9)
            int r9 = r2.length()
            if (r9 != 0) goto L_0x0141
            goto L_0x0145
        L_0x0141:
            java.lang.String r10 = HJ.C15854t.P0(r2, r13)
        L_0x0145:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r9 = 1
            boolean r2 = HJ.C15854t.b0(r2, r14, r9)
            if (r2 == 0) goto L_0x0157
            r2 = r17
            goto L_0x0159
        L_0x0157:
            r2 = r16
        L_0x0159:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            r9.append(r15)
            r9.append(r10)
            java.lang.String r2 = r9.toString()
            r9 = r2
            r2 = r11
            goto L_0x017a
        L_0x016e:
            r37 = r2
            r20 = r3
            r36 = r9
            r1 = 2
            r2 = 36
            r3 = 46
            r9 = r11
        L_0x017a:
            r21 = 0
            r10 = r18
            r11 = r12
            r18 = r12
            r12 = r9
            r22 = r13
            r13 = r21
            r23 = r14
            r14 = r5
            r24 = r15
            r15 = r8
            r10.a(r11, r12, r13, r14, r15)
            r1 = r33
            r2 = r37
            r10 = r8
            r11 = r9
            r12 = r18
            r3 = r20
            r13 = r22
            r14 = r23
            r15 = r24
            r8 = 0
            r9 = r36
            goto L_0x00e4
        L_0x01a4:
            r37 = r2
            r20 = r3
            r22 = r13
            r23 = r14
            r24 = r15
            r1 = 2
            r2 = 36
            r3 = 46
            boolean r5 = XH.x.g(r0)
            if (r5 == 0) goto L_0x01ba
            r0 = 0
        L_0x01ba:
            QL.x r0 = (QL.x) r0
            if (r0 != 0) goto L_0x01c1
            kz.i$a$b r0 = kz.i.a.b.f128889a
            return r0
        L_0x01c1:
            boolean r5 = r0.e()
            if (r5 == 0) goto L_0x02bf
            lz.g r5 = lz.g.f129232a     // Catch:{ b -> 0x01de }
            iz.t r5 = r4.f129344b     // Catch:{ CancellationException -> 0x01e4, IllegalArgumentException -> 0x01e2, Exception -> 0x01e0 }
            java.lang.Object r0 = r0.a()     // Catch:{ CancellationException -> 0x01e4, IllegalArgumentException -> 0x01e2, Exception -> 0x01e0 }
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.UpptackaResponse r0 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.UpptackaResponse) r0     // Catch:{ CancellationException -> 0x01e4, IllegalArgumentException -> 0x01e2, Exception -> 0x01e0 }
            rz.a0 r0 = r5.b(r0, r7)     // Catch:{ CancellationException -> 0x01e4, IllegalArgumentException -> 0x01e2, Exception -> 0x01e0 }
            kz.i$a$a r5 = new kz.i$a$a     // Catch:{ b -> 0x01de }
            r5.<init>(r0)     // Catch:{ b -> 0x01de }
            goto L_0x02be
        L_0x01de:
            r0 = move-exception
            goto L_0x01ff
        L_0x01e0:
            r0 = move-exception
            goto L_0x01e6
        L_0x01e2:
            r0 = move-exception
            goto L_0x01f2
        L_0x01e4:
            r0 = move-exception
            goto L_0x01fe
        L_0x01e6:
            hp.b r5 = new hp.b     // Catch:{ b -> 0x01de }
            java.lang.String r6 = "Unknown problem while mapping"
            java.lang.String r0 = lz.f.a(r0, r6)     // Catch:{ b -> 0x01de }
            r5.<init>(r0)     // Catch:{ b -> 0x01de }
            throw r5     // Catch:{ b -> 0x01de }
        L_0x01f2:
            hp.b r5 = new hp.b     // Catch:{ b -> 0x01de }
            r6 = 1
            r7 = 0
            java.lang.String r0 = lz.f.b(r0, r7, r6, r7)     // Catch:{ b -> 0x01de }
            r5.<init>(r0)     // Catch:{ b -> 0x01de }
            throw r5     // Catch:{ b -> 0x01de }
        L_0x01fe:
            throw r0     // Catch:{ b -> 0x01de }
        L_0x01ff:
            qv.e r11 = qv.e.WARN
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0212:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x022a
            java.lang.Object r7 = r5.next()
            r8 = r7
            qv.b r8 = (qv.C11819b) r8
            r9 = 0
            boolean r8 = r8.b(r11, r9)
            if (r8 == 0) goto L_0x0212
            r6.add(r7)
            goto L_0x0212
        L_0x022a:
            java.util.Iterator r12 = r6.iterator()
            r5 = 0
            r6 = 0
        L_0x0230:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x02bc
            java.lang.Object r7 = r12.next()
            qv.b r7 = (qv.C11819b) r7
            r8 = 0
            if (r5 != 0) goto L_0x024b
            java.lang.String r5 = qv.C11818a.a(r8, r0)
            if (r5 != 0) goto L_0x0247
            goto L_0x02bc
        L_0x0247:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x024b:
            r13 = r5
            if (r6 != 0) goto L_0x029d
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r6 = HJ.C15854t.s1(r5, r2, r8, r1, r8)
            java.lang.String r6 = HJ.C15854t.o1(r6, r3, r8, r1, r8)
            int r8 = r6.length()
            if (r8 != 0) goto L_0x026a
            r14 = r22
            goto L_0x0270
        L_0x026a:
            r14 = r22
            java.lang.String r5 = HJ.C15854t.P0(r6, r14)
        L_0x0270:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r15 = r23
            r8 = 1
            boolean r6 = HJ.C15854t.b0(r6, r15, r8)
            if (r6 == 0) goto L_0x0284
            r6 = r17
            goto L_0x0286
        L_0x0284:
            r6 = r16
        L_0x0286:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r10 = r24
            r8.append(r10)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r18 = r5
            goto L_0x02a5
        L_0x029d:
            r14 = r22
            r15 = r23
            r10 = r24
            r18 = r6
        L_0x02a5:
            r8 = 0
            r5 = r7
            r6 = r11
            r7 = r18
            r9 = r0
            r25 = r10
            r10 = r13
            r5.a(r6, r7, r8, r9, r10)
            r5 = r13
            r22 = r14
            r23 = r15
            r6 = r18
            r24 = r25
            goto L_0x0230
        L_0x02bc:
            kz.i$a$b r5 = kz.i.a.b.f128889a
        L_0x02be:
            return r5
        L_0x02bf:
            r14 = r22
            r15 = r23
            r25 = r24
            int r5 = r0.b()
            r7 = 400(0x190, float:5.6E-43)
            if (r5 == r7) goto L_0x047d
            r7 = 404(0x194, float:5.66E-43)
            if (r5 == r7) goto L_0x03a2
            kz.i$a$b r5 = kz.i.a.b.f128889a
            qv.e r13 = qv.e.DEBUG
            qv.d r7 = qv.d.f102012a
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x02e6:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x02fe
            java.lang.Object r9 = r7.next()
            r10 = r9
            qv.b r10 = (qv.C11819b) r10
            r11 = 0
            boolean r10 = r10.b(r13, r11)
            if (r10 == 0) goto L_0x02e6
            r8.add(r9)
            goto L_0x02e6
        L_0x02fe:
            java.util.Iterator r18 = r8.iterator()
            r7 = 0
            r9 = 0
        L_0x0304:
            boolean r8 = r18.hasNext()
            if (r8 == 0) goto L_0x047f
            java.lang.Object r8 = r18.next()
            qv.b r8 = (qv.C11819b) r8
            r11 = 0
            if (r7 != 0) goto L_0x033e
            int r7 = r0.b()
            GK.E r10 = r0.d()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            r12.append(r7)
            java.lang.String r7 = " : "
            r12.append(r7)
            r12.append(r10)
            java.lang.String r7 = r12.toString()
            java.lang.String r7 = qv.C11818a.a(r7, r11)
            if (r7 != 0) goto L_0x033a
            goto L_0x047f
        L_0x033a:
            java.lang.String r7 = qv.C11820c.a(r7)
        L_0x033e:
            r19 = r7
            if (r9 != 0) goto L_0x038c
            java.lang.Class r7 = r4.getClass()
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r9 = 0
            java.lang.String r10 = HJ.C15854t.s1(r7, r2, r9, r1, r9)
            java.lang.String r10 = HJ.C15854t.o1(r10, r3, r9, r1, r9)
            int r9 = r10.length()
            if (r9 != 0) goto L_0x035d
            goto L_0x0361
        L_0x035d:
            java.lang.String r7 = HJ.C15854t.P0(r10, r14)
        L_0x0361:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            r10 = 1
            boolean r9 = HJ.C15854t.b0(r9, r15, r10)
            if (r9 == 0) goto L_0x0373
            r9 = r17
            goto L_0x0375
        L_0x0373:
            r9 = r16
        L_0x0375:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r12 = r25
            r10.append(r12)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r20 = r7
            goto L_0x0390
        L_0x038c:
            r12 = r25
            r20 = r9
        L_0x0390:
            r10 = 0
            r7 = r8
            r8 = r13
            r9 = r20
            r26 = r12
            r12 = r19
            r7.a(r8, r9, r10, r11, r12)
            r7 = r19
            r25 = r26
            goto L_0x0304
        L_0x03a2:
            r26 = r25
            qv.e r0 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x03b7:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x03cf
            java.lang.Object r7 = r5.next()
            r8 = r7
            qv.b r8 = (qv.C11819b) r8
            r9 = 0
            boolean r8 = r8.b(r0, r9)
            if (r8 == 0) goto L_0x03b7
            r6.add(r7)
            goto L_0x03b7
        L_0x03cf:
            java.util.Iterator r5 = r6.iterator()
            r6 = 0
            r9 = 0
        L_0x03d5:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x047a
            java.lang.Object r7 = r5.next()
            r27 = r7
            qv.b r27 = (qv.C11819b) r27
            r7 = 0
            if (r9 != 0) goto L_0x0411
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "No content found for list "
            r8.append(r9)
            r10 = r20
            r8.append(r10)
            java.lang.String r9 = " in store: "
            r8.append(r9)
            r11 = r37
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = qv.C11818a.a(r8, r7)
            if (r8 != 0) goto L_0x040b
            goto L_0x047a
        L_0x040b:
            java.lang.String r8 = qv.C11820c.a(r8)
            r9 = r8
            goto L_0x0415
        L_0x0411:
            r11 = r37
            r10 = r20
        L_0x0415:
            if (r6 != 0) goto L_0x0460
            java.lang.Class r6 = r4.getClass()
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r8 = 0
            java.lang.String r12 = HJ.C15854t.s1(r6, r2, r8, r1, r8)
            java.lang.String r12 = HJ.C15854t.o1(r12, r3, r8, r1, r8)
            int r13 = r12.length()
            if (r13 != 0) goto L_0x0432
            goto L_0x0436
        L_0x0432:
            java.lang.String r6 = HJ.C15854t.P0(r12, r14)
        L_0x0436:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            r13 = 1
            boolean r12 = HJ.C15854t.b0(r12, r15, r13)
            if (r12 == 0) goto L_0x0448
            r12 = r17
            goto L_0x044a
        L_0x0448:
            r12 = r16
        L_0x044a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r12 = r26
            r1.append(r12)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r6 = r1
            goto L_0x0464
        L_0x0460:
            r12 = r26
            r8 = 0
            r13 = 1
        L_0x0464:
            r30 = 0
            r28 = r0
            r29 = r6
            r31 = r7
            r32 = r9
            r27.a(r28, r29, r30, r31, r32)
            r20 = r10
            r37 = r11
            r26 = r12
            r1 = 2
            goto L_0x03d5
        L_0x047a:
            kz.i$a$b r5 = kz.i.a.b.f128889a
            goto L_0x047f
        L_0x047d:
            kz.i$a$c r5 = kz.i.a.c.f128890a
        L_0x047f:
            return r5
        L_0x0480:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.o.a(java.lang.String, java.lang.String, java.util.Map, dI.e):java.lang.Object");
    }
}
