package jz;

import QJ.C16310i;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.v;
import XH.y;
import Yy.g;
import Yy.i;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kz.C14740c;
import nI.p;
import rz.C;
import rz.C15007A;
import sz.C15054a;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJf\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0011H@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Ljz/d;", "Lsz/a;", "Lkz/c;", "checkoutSource", "LQJ/M;", "ioDispatcher", "LYy/i;", "couponsLocalDataSource", "LYy/g;", "coWorkerDiscountLocalDataSource", "<init>", "(Lkz/c;LQJ/M;LYy/i;LYy/g;)V", "", "storeId", "familyCardId", "", "LXH/v;", "", "barcodeAndQuantity", "salesOrderAndQuantity", "email", "fullserveTimeWindowId", "Lrz/A;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "orderId", "", "timeStamp", "Lrz/C;", "b", "(Ljava/lang/String;Ljava/lang/String;JLdI/e;)Ljava/lang/Object;", "salesOrderId", "LXH/N;", "a", "(Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "Lkz/c;", "LQJ/M;", "LYy/i;", "d", "LYy/g;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements C15054a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14740c f128240a;

    /* renamed from: b  reason: collision with root package name */
    private final M f128241b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final i f128242c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final g f128243d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.repository.ScanAndGoCheckoutRepositoryImpl$cancelOrder$2", f = "ScanAndGoCheckoutRepositoryImpl.kt", l = {60}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f128244c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f128245d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f128246e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f128247f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, String str, int i10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f128245d = dVar;
            this.f128246e = str;
            this.f128247f = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f128245d, this.f128246e, this.f128247f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f128244c;
            if (i10 == 0) {
                y.b(obj);
                C14740c d10 = this.f128245d.f128240a;
                String str = this.f128246e;
                int i11 = this.f128247f;
                this.f128244c = 1;
                if (d10.a(str, i11, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lrz/A;", "<anonymous>", "(LQJ/Q;)Lrz/A;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.repository.ScanAndGoCheckoutRepositoryImpl$checkout$2", f = "ScanAndGoCheckoutRepositoryImpl.kt", l = {37, 39, 31}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C15007A>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f128248c;

        /* renamed from: d  reason: collision with root package name */
        Object f128249d;

        /* renamed from: e  reason: collision with root package name */
        Object f128250e;

        /* renamed from: f  reason: collision with root package name */
        Object f128251f;

        /* renamed from: g  reason: collision with root package name */
        Object f128252g;

        /* renamed from: h  reason: collision with root package name */
        Object f128253h;

        /* renamed from: i  reason: collision with root package name */
        Object f128254i;

        /* renamed from: j  reason: collision with root package name */
        Object f128255j;

        /* renamed from: k  reason: collision with root package name */
        Object f128256k;

        /* renamed from: l  reason: collision with root package name */
        int f128257l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f128258m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f128259n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ String f128260o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ List<v<String, Integer>> f128261p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ List<v<String, Integer>> f128262q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ String f128263r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f128264s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, String str, String str2, List<v<String, Integer>> list, List<v<String, Integer>> list2, String str3, String str4, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f128258m = dVar;
            this.f128259n = str;
            this.f128260o = str2;
            this.f128261p = list;
            this.f128262q = list2;
            this.f128263r = str3;
            this.f128264s = str4;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f128258m, this.f128259n, this.f128260o, this.f128261p, this.f128262q, this.f128263r, this.f128264s, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C15007A> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00f6  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x011a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                r15 = this;
                r10 = r15
                java.lang.Object r11 = eI.C17187b.f()
                int r0 = r10.f128257l
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L_0x008d
                if (r0 == r3) goto L_0x006a
                if (r0 == r2) goto L_0x0041
                if (r0 != r1) goto L_0x0039
                java.lang.Object r0 = r10.f128255j
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r10.f128254i
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r10.f128253h
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r10.f128252g
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r10.f128251f
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r10.f128250e
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r10.f128249d
                kz.c r0 = (kz.C14740c) r0
                java.lang.Object r0 = r10.f128248c
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                XH.y.b(r16)
                r0 = r16
                goto L_0x011b
            L_0x0039:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0041:
                java.lang.Object r0 = r10.f128254i
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r2 = r10.f128253h
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r3 = r10.f128252g
                java.util.List r3 = (java.util.List) r3
                java.lang.Object r4 = r10.f128251f
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r5 = r10.f128250e
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r10.f128249d
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r10.f128248c
                kz.c r7 = (kz.C14740c) r7
                XH.y.b(r16)
                r8 = r0
                r0 = r7
                r7 = r2
                r2 = r16
                r14 = r4
                r4 = r3
                r3 = r14
                goto L_0x00ec
            L_0x006a:
                java.lang.Object r0 = r10.f128253h
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r3 = r10.f128252g
                java.util.List r3 = (java.util.List) r3
                java.lang.Object r4 = r10.f128251f
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r5 = r10.f128250e
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r10.f128249d
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r10.f128248c
                kz.c r7 = (kz.C14740c) r7
                XH.y.b(r16)
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r16
                goto L_0x00c2
            L_0x008d:
                XH.y.b(r16)
                jz.d r0 = r10.f128258m
                kz.c r7 = r0.f128240a
                java.lang.String r6 = r10.f128259n
                java.lang.String r5 = r10.f128260o
                java.util.List<XH.v<java.lang.String, java.lang.Integer>> r4 = r10.f128261p
                java.util.List<XH.v<java.lang.String, java.lang.Integer>> r0 = r10.f128262q
                java.lang.String r8 = r10.f128263r
                jz.d r9 = r10.f128258m
                Yy.i r9 = r9.f128242c
                r10.f128248c = r7
                r10.f128249d = r6
                r10.f128250e = r5
                r10.f128251f = r4
                r10.f128252g = r0
                r10.f128253h = r8
                r10.f128257l = r3
                java.lang.Object r3 = r9.g(r15)
                if (r3 != r11) goto L_0x00bb
                return r11
            L_0x00bb:
                r14 = r4
                r4 = r0
                r0 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r14
            L_0x00c2:
                java.util.List r3 = (java.util.List) r3
                jz.d r9 = r10.f128258m
                Yy.g r9 = r9.f128243d
                TJ.g r9 = r9.a()
                r10.f128248c = r8
                r10.f128249d = r7
                r10.f128250e = r6
                r10.f128251f = r5
                r10.f128252g = r4
                r10.f128253h = r0
                r10.f128254i = r3
                r10.f128257l = r2
                java.lang.Object r2 = TJ.C16534i.D(r9, r15)
                if (r2 != r11) goto L_0x00e5
                return r11
            L_0x00e5:
                r14 = r7
                r7 = r0
                r0 = r8
                r8 = r3
                r3 = r5
                r5 = r6
                r6 = r14
            L_0x00ec:
                r9 = r2
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                if (r9 == 0) goto L_0x00f6
                boolean r12 = r9.booleanValue()
                goto L_0x00f7
            L_0x00f6:
                r12 = 0
            L_0x00f7:
                java.lang.String r13 = r10.f128264s
                r10.f128248c = r9
                r10.f128249d = r0
                r10.f128250e = r6
                r10.f128251f = r5
                r10.f128252g = r3
                r10.f128253h = r4
                r10.f128254i = r7
                r10.f128255j = r8
                r10.f128256k = r2
                r10.f128257l = r1
                r1 = r6
                r2 = r5
                r5 = r7
                r6 = r8
                r7 = r12
                r8 = r13
                r9 = r15
                java.lang.Object r0 = r0.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r0 != r11) goto L_0x011b
                return r11
            L_0x011b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: jz.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lrz/C;", "<anonymous>", "(LQJ/Q;)Lrz/C;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.repository.ScanAndGoCheckoutRepositoryImpl$getCheckoutOrderStatus$2", f = "ScanAndGoCheckoutRepositoryImpl.kt", l = {49}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f128265c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f128266d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f128267e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f128268f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f128269g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, String str, String str2, long j10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f128266d = dVar;
            this.f128267e = str;
            this.f128268f = str2;
            this.f128269g = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f128266d, this.f128267e, this.f128268f, this.f128269g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f128265c;
            if (i10 == 0) {
                y.b(obj);
                C14740c d10 = this.f128266d.f128240a;
                String str = this.f128267e;
                String str2 = this.f128268f;
                long j10 = this.f128269g;
                this.f128265c = 1;
                obj = d10.b(str, str2, j10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public d(C14740c cVar, M m10, i iVar, g gVar) {
        C17542s.j(cVar, "checkoutSource");
        C17542s.j(m10, "ioDispatcher");
        C17542s.j(iVar, "couponsLocalDataSource");
        C17542s.j(gVar, "coWorkerDiscountLocalDataSource");
        this.f128240a = cVar;
        this.f128241b = m10;
        this.f128242c = iVar;
        this.f128243d = gVar;
    }

    public Object a(String str, int i10, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(this.f128241b, new a(this, str, i10, (C17164e<? super a>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    public Object b(String str, String str2, long j10, C17164e<? super C> eVar) {
        return C16310i.g(this.f128241b, new c(this, str, str2, j10, (C17164e<? super c>) null), eVar);
    }

    public Object c(String str, String str2, List<v<String, Integer>> list, List<v<String, Integer>> list2, String str3, String str4, C17164e<? super C15007A> eVar) {
        return C16310i.g(this.f128241b, new b(this, str, str2, list, list2, str3, str4, (C17164e<? super b>) null), eVar);
    }
}
