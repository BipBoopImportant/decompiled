package hi;

import BA.C12609a;
import HJ.C15854t;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16511H;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import hk.g;
import ip.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JC\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lhi/l;", "Lhi/k;", "LBA/a;", "shareRepository", "LQJ/Q;", "appScope", "<init>", "(LBA/a;LQJ/Q;)V", "", "itemNo", "itemType", "productName", "productDescription", "LTJ/g;", "Lip/k;", "Lhk/g$a;", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LTJ/g;", "LBA/a;", "b", "LQJ/Q;", "LQJ/F0;", "c", "LQJ/F0;", "shareItemJob", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C12609a f74203a;

    /* renamed from: b  reason: collision with root package name */
    private final Q f74204b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public F0 f74205c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.usecase.ShareItemUseCaseImpl$invoke$2", f = "ShareItemUseCase.kt", l = {56, 62, 74}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: A  reason: collision with root package name */
        final /* synthetic */ C16504A<k<g.a, Throwable>> f74206A;

        /* renamed from: B  reason: collision with root package name */
        final /* synthetic */ String f74207B;

        /* renamed from: C  reason: collision with root package name */
        final /* synthetic */ String f74208C;

        /* renamed from: c  reason: collision with root package name */
        Object f74209c;

        /* renamed from: d  reason: collision with root package name */
        Object f74210d;

        /* renamed from: e  reason: collision with root package name */
        Object f74211e;

        /* renamed from: f  reason: collision with root package name */
        Object f74212f;

        /* renamed from: g  reason: collision with root package name */
        Object f74213g;

        /* renamed from: h  reason: collision with root package name */
        Object f74214h;

        /* renamed from: i  reason: collision with root package name */
        Object f74215i;

        /* renamed from: j  reason: collision with root package name */
        Object f74216j;

        /* renamed from: k  reason: collision with root package name */
        Object f74217k;

        /* renamed from: l  reason: collision with root package name */
        Object f74218l;

        /* renamed from: m  reason: collision with root package name */
        Object f74219m;

        /* renamed from: n  reason: collision with root package name */
        Object f74220n;

        /* renamed from: o  reason: collision with root package name */
        Object f74221o;

        /* renamed from: p  reason: collision with root package name */
        int f74222p;

        /* renamed from: q  reason: collision with root package name */
        int f74223q;

        /* renamed from: r  reason: collision with root package name */
        int f74224r;

        /* renamed from: s  reason: collision with root package name */
        int f74225s;

        /* renamed from: t  reason: collision with root package name */
        int f74226t;

        /* renamed from: u  reason: collision with root package name */
        int f74227u;

        /* renamed from: v  reason: collision with root package name */
        int f74228v;

        /* renamed from: w  reason: collision with root package name */
        private /* synthetic */ Object f74229w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ l f74230x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ String f74231y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ String f74232z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar, String str, String str2, C16504A<k<g.a, Throwable>> a10, String str3, String str4, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f74230x = lVar;
            this.f74231y = str;
            this.f74232z = str2;
            this.f74206A = a10;
            this.f74207B = str3;
            this.f74208C = str4;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f74230x, this.f74231y, this.f74232z, this.f74206A, this.f74207B, this.f74208C, eVar);
            aVar.f74229w = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00df  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f74228v
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                r7 = 0
                if (r2 == 0) goto L_0x0081
                if (r2 == r5) goto L_0x006c
                if (r2 == r4) goto L_0x0052
                if (r2 != r3) goto L_0x004a
                java.lang.Object r1 = r0.f74220n
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f74219m
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f74218l
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f74217k
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f74216j
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f74215i
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f74214h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f74213g
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f74212f
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Object r1 = r0.f74211e
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Object r1 = r0.f74210d
                TJ.A r1 = (TJ.C16504A) r1
                java.lang.Object r1 = r0.f74229w
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r23)
                goto L_0x01d0
            L_0x004a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0052:
                java.lang.Object r2 = r0.f74213g
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r2 = r0.f74212f
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r2 = r0.f74211e
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r2 = r0.f74210d
                TJ.A r2 = (TJ.C16504A) r2
                java.lang.Object r2 = r0.f74209c
                java.lang.Object r4 = r0.f74229w
                QJ.Q r4 = (QJ.Q) r4
                XH.y.b(r23)
                goto L_0x00d6
            L_0x006c:
                java.lang.Object r2 = r0.f74229w
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r23)
                r8 = r23
                XH.x r8 = (XH.x) r8
                java.lang.Object r8 = r8.j()
            L_0x007b:
                r21 = r8
                r8 = r2
                r2 = r21
                goto L_0x00a4
            L_0x0081:
                XH.y.b(r23)
                java.lang.Object r2 = r0.f74229w
                QJ.Q r2 = (QJ.Q) r2
                hi.l r8 = r0.f74230x
                r8.f74205c = r6
                hi.l r8 = r0.f74230x
                BA.a r8 = r8.f74203a
                java.lang.String r9 = r0.f74231y
                java.lang.String r10 = r0.f74232z
                CA.b r11 = CA.C12683b.PIP
                r0.f74229w = r2
                r0.f74228v = r5
                java.lang.Object r8 = r8.a(r9, r10, r11, r0)
                if (r8 != r1) goto L_0x007b
                return r1
            L_0x00a4:
                TJ.A<ip.k<hk.g$a, java.lang.Throwable>> r9 = r0.f74206A
                java.lang.String r10 = r0.f74207B
                java.lang.String r11 = r0.f74208C
                boolean r12 = XH.x.h(r2)
                if (r12 == 0) goto L_0x00d7
                r12 = r2
                java.lang.String r12 = (java.lang.String) r12
                ip.k$a r13 = ip.k.f98528e
                hk.g$a r14 = new hk.g$a
                r14.<init>(r12, r10, r11)
                ip.k r13 = r13.g(r14)
                r0.f74229w = r8
                r0.f74209c = r2
                r0.f74210d = r9
                r0.f74211e = r10
                r0.f74212f = r11
                r0.f74213g = r12
                r0.f74222p = r7
                r0.f74228v = r4
                java.lang.Object r4 = r9.emit(r13, r0)
                if (r4 != r1) goto L_0x00d5
                return r1
            L_0x00d5:
                r4 = r8
            L_0x00d6:
                r8 = r4
            L_0x00d7:
                TJ.A<ip.k<hk.g$a, java.lang.Throwable>> r4 = r0.f74206A
                java.lang.Throwable r15 = XH.x.e(r2)
                if (r15 == 0) goto L_0x01d0
                qv.e r14 = qv.e.WARN
                qv.d r9 = qv.d.f102012a
                java.util.List r9 = r9.a()
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.util.Iterator r9 = r9.iterator()
            L_0x00f2:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x0109
                java.lang.Object r10 = r9.next()
                r11 = r10
                qv.b r11 = (qv.C11819b) r11
                boolean r11 = r11.b(r14, r7)
                if (r11 == 0) goto L_0x00f2
                r13.add(r10)
                goto L_0x00f2
            L_0x0109:
                java.util.Iterator r12 = r13.iterator()
                r10 = r6
                r11 = r10
                r9 = r13
            L_0x0110:
                boolean r16 = r12.hasNext()
                java.lang.String r3 = "Unable to share item"
                if (r16 == 0) goto L_0x017a
                java.lang.Object r16 = r12.next()
                r9 = r16
                qv.b r9 = (qv.C11819b) r9
                if (r11 != 0) goto L_0x0130
                java.lang.String r17 = qv.C11818a.a(r6, r15)
                if (r17 != 0) goto L_0x012c
                r5 = r12
                r6 = r13
                r7 = r14
                goto L_0x017f
            L_0x012c:
                java.lang.String r11 = qv.C11820c.a(r17)
            L_0x0130:
                r17 = r11
                if (r10 != 0) goto L_0x015d
                java.lang.Thread r10 = java.lang.Thread.currentThread()
                java.lang.String r10 = r10.getName()
                java.lang.String r11 = "main"
                boolean r10 = HJ.C15854t.b0(r10, r11, r5)
                if (r10 == 0) goto L_0x0147
                java.lang.String r10 = "m"
                goto L_0x0149
            L_0x0147:
                java.lang.String r10 = "b"
            L_0x0149:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r10)
                java.lang.String r10 = "|"
                r11.append(r10)
                r11.append(r3)
                java.lang.String r10 = r11.toString()
            L_0x015d:
                r3 = r10
                r18 = 0
                r10 = r14
                r11 = r3
                r5 = r12
                r12 = r18
                r6 = r13
                r13 = r15
                r7 = r14
                r14 = r17
                r9.a(r10, r11, r12, r13, r14)
                r10 = r3
                r12 = r5
                r13 = r6
                r14 = r7
                r9 = r16
                r11 = r17
                r3 = 3
                r5 = 1
                r6 = 0
                r7 = 0
                goto L_0x0110
            L_0x017a:
                r5 = r12
                r6 = r13
                r7 = r14
                r16 = r9
            L_0x017f:
                ip.k$a r9 = ip.k.f98528e
                r13 = 5
                r14 = 0
                r12 = 0
                r17 = 0
                r19 = r10
                r10 = r12
                r12 = r11
                r11 = r15
                r20 = r12
                r12 = r17
                r17 = r1
                r1 = r16
                ip.k r9 = ip.k.a.b(r9, r10, r11, r12, r13, r14)
                r0.f74229w = r8
                r0.f74209c = r2
                r0.f74210d = r4
                r0.f74211e = r15
                r0.f74212f = r15
                r0.f74213g = r8
                r0.f74214h = r3
                r0.f74215i = r8
                r0.f74216j = r7
                r2 = r20
                r0.f74217k = r2
                r3 = r19
                r0.f74218l = r3
                r0.f74219m = r6
                r0.f74220n = r5
                r0.f74221o = r1
                r1 = 0
                r0.f74222p = r1
                r0.f74223q = r1
                r0.f74224r = r1
                r0.f74225s = r1
                r0.f74226t = r1
                r0.f74227u = r1
                r1 = 3
                r0.f74228v = r1
                java.lang.Object r1 = r4.emit(r9, r0)
                r2 = r17
                if (r1 != r2) goto L_0x01d0
                return r2
            L_0x01d0:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: hi.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lip/k;", "Lhk/g$a;", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.usecase.ShareItemUseCaseImpl$invoke$3", f = "ShareItemUseCase.kt", l = {79}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super k<g.a, Throwable>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74233c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74234d;

        b(C17164e<? super b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f74234d = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super k<g.a, Throwable>> hVar, C17164e<? super C16807N> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74233c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f74234d;
                k d10 = k.a.d(k.f98528e, (Object) null, 1, (Object) null);
                this.f74234d = hVar;
                this.f74233c = 1;
                if (hVar.emit(d10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f74234d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public l(C12609a aVar, Q q10) {
        C17542s.j(aVar, "shareRepository");
        C17542s.j(q10, "appScope");
        this.f74203a = aVar;
        this.f74204b = q10;
    }

    public C16532g<k<g.a, Throwable>> a(String str, String str2, String str3, String str4) {
        boolean z10;
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "itemType");
        C17542s.j(str3, "productName");
        C16504A b10 = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);
        F0 f02 = this.f74205c;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            Iterator it = d.f102012a.a().iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar : arrayList) {
                if (str5 == null) {
                    String a10 = C11818a.a("Force quitting ongoing share job in Pip", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str5 = C11820c.a(a10);
                }
                if (str6 == null) {
                    String name = l.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str6, z10, (Throwable) null, str5);
                z10 = z10;
            }
            this.f74205c = null;
        }
        this.f74205c = C16314k.d(this.f74204b, (C17168i) null, (T) null, new a(this, str, str2, b10, str3, str4, (C17164e<? super a>) null), 3, (Object) null);
        return C16534i.S(b10, new b((C17164e<? super b>) null));
    }
}
