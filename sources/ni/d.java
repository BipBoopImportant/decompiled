package ni;

import Ax.b;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import op.C11699j;
import pp.C11767a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lni/d;", "Lni/c;", "LAx/b;", "productDetailsRepository", "<init>", "(LAx/b;)V", "", "itemNo", "Lpp/a;", "cacheStrategy", "LTJ/g;", "Lni/h;", "a", "(Ljava/lang/String;Lpp/a;)LTJ/g;", "LAx/b;", "b", "Lni/h;", "currentState", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f75631a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public h f75632b = new h(false, (Throwable) null, (C11699j) null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lni/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.productinformationpage.v3.usecase.GetProductDetailsUseCaseImpl$getProductDetails$1", f = "GetProductDetailsUseCase.kt", l = {36, 44, 47, 57}, m = "invokeSuspend")
    static final class a extends l implements p<C16533h<? super h>, C17164e<? super C16807N>, Object> {

        /* renamed from: A  reason: collision with root package name */
        private /* synthetic */ Object f75633A;

        /* renamed from: B  reason: collision with root package name */
        final /* synthetic */ d f75634B;

        /* renamed from: C  reason: collision with root package name */
        final /* synthetic */ String f75635C;

        /* renamed from: D  reason: collision with root package name */
        final /* synthetic */ C11767a f75636D;

        /* renamed from: c  reason: collision with root package name */
        Object f75637c;

        /* renamed from: d  reason: collision with root package name */
        Object f75638d;

        /* renamed from: e  reason: collision with root package name */
        Object f75639e;

        /* renamed from: f  reason: collision with root package name */
        Object f75640f;

        /* renamed from: g  reason: collision with root package name */
        Object f75641g;

        /* renamed from: h  reason: collision with root package name */
        Object f75642h;

        /* renamed from: i  reason: collision with root package name */
        Object f75643i;

        /* renamed from: j  reason: collision with root package name */
        Object f75644j;

        /* renamed from: k  reason: collision with root package name */
        Object f75645k;

        /* renamed from: l  reason: collision with root package name */
        Object f75646l;

        /* renamed from: m  reason: collision with root package name */
        Object f75647m;

        /* renamed from: n  reason: collision with root package name */
        Object f75648n;

        /* renamed from: o  reason: collision with root package name */
        Object f75649o;

        /* renamed from: p  reason: collision with root package name */
        Object f75650p;

        /* renamed from: q  reason: collision with root package name */
        Object f75651q;

        /* renamed from: r  reason: collision with root package name */
        Object f75652r;

        /* renamed from: s  reason: collision with root package name */
        Object f75653s;

        /* renamed from: t  reason: collision with root package name */
        int f75654t;

        /* renamed from: u  reason: collision with root package name */
        int f75655u;

        /* renamed from: v  reason: collision with root package name */
        int f75656v;

        /* renamed from: w  reason: collision with root package name */
        int f75657w;

        /* renamed from: x  reason: collision with root package name */
        int f75658x;

        /* renamed from: y  reason: collision with root package name */
        int f75659y;

        /* renamed from: z  reason: collision with root package name */
        int f75660z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, String str, C11767a aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f75634B = dVar;
            this.f75635C = str;
            this.f75636D = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f75634B, this.f75635C, this.f75636D, eVar);
            aVar.f75633A = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super h> hVar, C17164e<? super C16807N> eVar) {
            return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: TJ.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x014a  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x017d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r1 = r22
                java.lang.Object r2 = eI.C17187b.f()
                int r0 = r1.f75660z
                r3 = 4
                r4 = 3
                r5 = 1
                r6 = 2
                r7 = 0
                if (r0 == 0) goto L_0x00d0
                if (r0 == r5) goto L_0x00b1
                if (r0 == r6) goto L_0x0081
                if (r0 == r4) goto L_0x0054
                if (r0 != r3) goto L_0x004c
                java.lang.Object r0 = r1.f75653s
                XH.N r0 = (XH.C16807N) r0
                java.lang.Object r0 = r1.f75652r
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r1.f75651q
                XH.N r0 = (XH.C16807N) r0
                java.lang.Object r0 = r1.f75650p
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r1.f75648n
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r1.f75647m
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r1.f75646l
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f75645k
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f75644j
                qv.e r0 = (qv.e) r0
                java.lang.Object r0 = r1.f75643i
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r1.f75642h
                ni.h r0 = (ni.h) r0
                java.lang.Object r0 = r1.f75641g
                ni.h r0 = (ni.h) r0
                java.lang.Object r0 = r1.f75640f
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                goto L_0x0070
            L_0x004c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0054:
                java.lang.Object r0 = r1.f75646l
                XH.N r0 = (XH.C16807N) r0
                java.lang.Object r0 = r1.f75645k
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r1.f75644j
                XH.N r0 = (XH.C16807N) r0
                java.lang.Object r0 = r1.f75643i
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r1.f75642h
                ni.h r0 = (ni.h) r0
                java.lang.Object r0 = r1.f75641g
                ni.h r0 = (ni.h) r0
                java.lang.Object r0 = r1.f75640f
                op.j r0 = (op.C11699j) r0
            L_0x0070:
                java.lang.Object r0 = r1.f75639e
                ni.d r0 = (ni.d) r0
                java.lang.Object r0 = r1.f75638d
                ni.d r0 = (ni.d) r0
                java.lang.Object r0 = r1.f75633A
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r23)
                goto L_0x02ae
            L_0x0081:
                java.lang.Object r0 = r1.f75643i
                r8 = r0
                XH.N r8 = (XH.C16807N) r8
                java.lang.Object r0 = r1.f75642h
                r9 = r0
                TJ.h r9 = (TJ.C16533h) r9
                java.lang.Object r0 = r1.f75641g
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r1.f75640f
                pp.a r0 = (pp.C11767a) r0
                java.lang.Object r0 = r1.f75639e
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f75638d
                ni.d r0 = (ni.d) r0
                java.lang.Object r0 = r1.f75637c
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r1.f75633A
                r10 = r0
                TJ.h r10 = (TJ.C16533h) r10
                XH.y.b(r23)     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                r0 = r23
                goto L_0x0130
            L_0x00ab:
                r0 = move-exception
                goto L_0x0137
            L_0x00ae:
                r0 = move-exception
                goto L_0x02b1
            L_0x00b1:
                java.lang.Object r0 = r1.f75641g
                XH.N r0 = (XH.C16807N) r0
                java.lang.Object r8 = r1.f75640f
                TJ.h r8 = (TJ.C16533h) r8
                java.lang.Object r9 = r1.f75639e
                ni.h r9 = (ni.h) r9
                java.lang.Object r9 = r1.f75638d
                ni.d r9 = (ni.d) r9
                java.lang.Object r9 = r1.f75637c
                ni.h r9 = (ni.h) r9
                java.lang.Object r9 = r1.f75633A
                TJ.h r9 = (TJ.C16533h) r9
                XH.y.b(r23)
                r10 = r9
                r9 = r8
                r8 = r0
                goto L_0x0107
            L_0x00d0:
                XH.y.b(r23)
                java.lang.Object r0 = r1.f75633A
                TJ.h r0 = (TJ.C16533h) r0
                ni.d r8 = r1.f75634B
                ni.h r9 = r8.f75632b
                r13 = 4
                r14 = 0
                r10 = 1
                r11 = 0
                r12 = 0
                ni.h r8 = ni.h.b(r9, r10, r11, r12, r13, r14)
                ni.d r9 = r1.f75634B
                r9.f75632b = r8
                XH.N r10 = XH.C16807N.f139792a
                r1.f75633A = r0
                r1.f75637c = r8
                r1.f75638d = r9
                r1.f75639e = r8
                r1.f75640f = r0
                r1.f75641g = r10
                r1.f75654t = r7
                r1.f75660z = r5
                java.lang.Object r8 = r0.emit(r8, r1)
                if (r8 != r2) goto L_0x0104
                return r2
            L_0x0104:
                r9 = r0
                r8 = r10
                r10 = r9
            L_0x0107:
                ni.d r0 = r1.f75634B
                java.lang.String r11 = r1.f75635C
                pp.a r12 = r1.f75636D
                XH.x$a r13 = XH.x.f139812b     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                Ax.b r13 = r0.f75631a     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                r1.f75633A = r10     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                r1.f75637c = r10     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                r1.f75638d = r0     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                r1.f75639e = r11     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                r1.f75640f = r12     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                r1.f75641g = r10     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                r1.f75642h = r9     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                r1.f75643i = r8     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                r1.f75654t = r7     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                r1.f75655u = r7     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                r1.f75660z = r6     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                java.lang.Object r0 = r13.a(r11, r12, r1)     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                if (r0 != r2) goto L_0x0130
                return r2
            L_0x0130:
                op.j r0 = (op.C11699j) r0     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x00ae, all -> 0x00ab }
                goto L_0x0141
            L_0x0137:
                XH.x$a r11 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
            L_0x0141:
                ni.d r11 = r1.f75634B
                java.lang.Throwable r15 = XH.x.e(r0)
                r14 = 0
                if (r15 != 0) goto L_0x017d
                r3 = r0
                op.j r3 = (op.C11699j) r3
                ni.h r5 = r11.f75632b
                ni.h r5 = r5.a(r7, r14, r3)
                r11.f75632b = r5
                XH.N r6 = XH.C16807N.f139792a
                r1.f75633A = r10
                r1.f75637c = r0
                r1.f75638d = r11
                r1.f75639e = r11
                r1.f75640f = r3
                r1.f75641g = r5
                r1.f75642h = r5
                r1.f75643i = r10
                r1.f75644j = r6
                r1.f75645k = r9
                r1.f75646l = r8
                r1.f75654t = r7
                r1.f75655u = r7
                r1.f75660z = r4
                java.lang.Object r0 = r10.emit(r5, r1)
                if (r0 != r2) goto L_0x02ae
                return r2
            L_0x017d:
                qv.e r4 = qv.e.WARN
                qv.d r12 = qv.d.f102012a
                java.util.List r12 = r12.a()
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.util.Iterator r12 = r12.iterator()
            L_0x0190:
                boolean r16 = r12.hasNext()
                if (r16 == 0) goto L_0x01a9
                java.lang.Object r3 = r12.next()
                r5 = r3
                qv.b r5 = (qv.C11819b) r5
                boolean r5 = r5.b(r4, r7)
                if (r5 == 0) goto L_0x01a6
                r13.add(r3)
            L_0x01a6:
                r3 = 4
                r5 = 1
                goto L_0x0190
            L_0x01a9:
                java.util.Iterator r3 = r13.iterator()
                r16 = r13
                r5 = r14
                r12 = r5
            L_0x01b1:
                boolean r17 = r3.hasNext()
                if (r17 == 0) goto L_0x0251
                java.lang.Object r19 = r3.next()
                r16 = r19
                qv.b r16 = (qv.C11819b) r16
                if (r5 != 0) goto L_0x01d5
                java.lang.String r7 = "Error loading product details"
                java.lang.String r7 = qv.C11818a.a(r7, r15)
                if (r7 != 0) goto L_0x01d1
                r20 = r13
                r23 = r15
                r6 = r19
                goto L_0x0257
            L_0x01d1:
                java.lang.String r5 = qv.C11820c.a(r7)
            L_0x01d5:
                if (r12 != 0) goto L_0x022d
                java.lang.Class r7 = r10.getClass()
                java.lang.String r7 = r7.getName()
                kotlin.jvm.internal.C17542s.g(r7)
                r12 = 36
                java.lang.String r12 = HJ.C15854t.s1(r7, r12, r14, r6, r14)
                r23 = r7
                r7 = 46
                java.lang.String r7 = HJ.C15854t.o1(r12, r7, r14, r6, r14)
                int r12 = r7.length()
                if (r12 != 0) goto L_0x01f9
                r7 = r23
                goto L_0x01ff
            L_0x01f9:
                java.lang.String r12 = "Kt"
                java.lang.String r7 = HJ.C15854t.P0(r7, r12)
            L_0x01ff:
                java.lang.Thread r12 = java.lang.Thread.currentThread()
                java.lang.String r12 = r12.getName()
                java.lang.String r6 = "main"
                r23 = r15
                r15 = 1
                boolean r6 = HJ.C15854t.b0(r12, r6, r15)
                if (r6 == 0) goto L_0x0215
                java.lang.String r6 = "m"
                goto L_0x0217
            L_0x0215:
                java.lang.String r6 = "b"
            L_0x0217:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r6)
                java.lang.String r6 = "|"
                r12.append(r6)
                r12.append(r7)
                java.lang.String r12 = r12.toString()
            L_0x022b:
                r6 = r12
                goto L_0x0231
            L_0x022d:
                r23 = r15
                r15 = 1
                goto L_0x022b
            L_0x0231:
                r7 = 0
                r12 = r16
                r20 = r13
                r13 = r4
                r18 = r14
                r14 = r6
                r21 = r15
                r15 = r7
                r16 = r23
                r17 = r5
                r12.a(r13, r14, r15, r16, r17)
                r15 = r23
                r12 = r6
                r14 = r18
                r16 = r19
                r13 = r20
                r6 = 2
                r7 = 0
                goto L_0x01b1
            L_0x0251:
                r20 = r13
                r23 = r15
                r6 = r16
            L_0x0257:
                ni.h r7 = r11.f75632b
                r16 = 4
                r17 = 0
                r13 = 0
                r15 = 0
                r14 = r12
                r12 = r7
                r7 = r14
                r14 = r23
                ni.h r12 = ni.h.b(r12, r13, r14, r15, r16, r17)
                r11.f75632b = r12
                XH.N r13 = XH.C16807N.f139792a
                r1.f75633A = r10
                r1.f75637c = r0
                r1.f75638d = r11
                r1.f75639e = r11
                r0 = r23
                r1.f75640f = r0
                r1.f75641g = r12
                r1.f75642h = r12
                r1.f75643i = r10
                r1.f75644j = r4
                r1.f75645k = r5
                r1.f75646l = r7
                r0 = r20
                r1.f75647m = r0
                r1.f75648n = r3
                r1.f75649o = r6
                r1.f75650p = r10
                r1.f75651q = r13
                r1.f75652r = r9
                r1.f75653s = r8
                r3 = 0
                r1.f75654t = r3
                r1.f75655u = r3
                r1.f75656v = r3
                r1.f75657w = r3
                r1.f75658x = r3
                r1.f75659y = r3
                r3 = 4
                r1.f75660z = r3
                java.lang.Object r0 = r10.emit(r12, r1)
                if (r0 != r2) goto L_0x02ae
                return r2
            L_0x02ae:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x02b1:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ni.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(b bVar) {
        C17542s.j(bVar, "productDetailsRepository");
        this.f75631a = bVar;
    }

    public C16532g<h> a(String str, C11767a aVar) {
        C17542s.j(str, "itemNo");
        C17542s.j(aVar, "cacheStrategy");
        return C16534i.H(new a(this, str, aVar, (C17164e<? super a>) null));
    }
}
