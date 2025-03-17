package qz;

import FB.C12860a;
import Ry.h;
import Sy.a;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import rz.O;
import tz.C15101b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH@¢\u0006\u0004\b\t\u0010\nJT\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014HB¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lqz/b;", "Ltz/b;", "LRy/h;", "scanAndGoProductRepository", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LRy/h;LFB/a;)V", "", "c", "(LdI/e;)Ljava/lang/Object;", "barcode", "Lrz/O;", "scanType", "", "quantity", "productType", "ptagSize", "LSy/a$b;", "productAssortmentSpecialType", "", "useItemNoAsBarcode", "LXH/x;", "Lrz/I;", "a", "(Ljava/lang/String;Lrz/O;ILjava/lang/String;Ljava/lang/String;LSy/a$b;ZLdI/e;)Ljava/lang/Object;", "LRy/h;", "b", "LFB/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qz.b  reason: case insensitive filesystem */
public final class C14960b implements C15101b {

    /* renamed from: a  reason: collision with root package name */
    private final h f130499a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f130500b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.usecase.GetScanAndGoProductUseCaseImpl", f = "GetScanAndGoProductUseCaseImpl.kt", l = {55}, m = "getStoreId")
    /* renamed from: qz.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f130501c;

        /* renamed from: d  reason: collision with root package name */
        Object f130502d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f130503e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14960b f130504f;

        /* renamed from: g  reason: collision with root package name */
        int f130505g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14960b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f130504f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f130503e = obj;
            this.f130505g |= Integer.MIN_VALUE;
            return this.f130504f.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.usecase.GetScanAndGoProductUseCaseImpl", f = "GetScanAndGoProductUseCaseImpl.kt", l = {32, 39, 41}, m = "invoke-eH_QyT8")
    /* renamed from: qz.b$b  reason: collision with other inner class name */
    static final class C3227b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f130506c;

        /* renamed from: d  reason: collision with root package name */
        Object f130507d;

        /* renamed from: e  reason: collision with root package name */
        Object f130508e;

        /* renamed from: f  reason: collision with root package name */
        Object f130509f;

        /* renamed from: g  reason: collision with root package name */
        Object f130510g;

        /* renamed from: h  reason: collision with root package name */
        Object f130511h;

        /* renamed from: i  reason: collision with root package name */
        Object f130512i;

        /* renamed from: j  reason: collision with root package name */
        Object f130513j;

        /* renamed from: k  reason: collision with root package name */
        Object f130514k;

        /* renamed from: l  reason: collision with root package name */
        Object f130515l;

        /* renamed from: m  reason: collision with root package name */
        Object f130516m;

        /* renamed from: n  reason: collision with root package name */
        Object f130517n;

        /* renamed from: o  reason: collision with root package name */
        int f130518o;

        /* renamed from: p  reason: collision with root package name */
        int f130519p;

        /* renamed from: q  reason: collision with root package name */
        int f130520q;

        /* renamed from: r  reason: collision with root package name */
        boolean f130521r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f130522s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ C14960b f130523t;

        /* renamed from: u  reason: collision with root package name */
        int f130524u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3227b(C14960b bVar, C17164e<? super C3227b> eVar) {
            super(eVar);
            this.f130523t = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f130522s = obj;
            this.f130524u |= Integer.MIN_VALUE;
            Object a10 = this.f130523t.a((String) null, (O) null, 0, (String) null, (String) null, (a.b) null, false, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public C14960b(h hVar, C12860a aVar) {
        C17542s.j(hVar, "scanAndGoProductRepository");
        C17542s.j(aVar, "localStoreSelectionRepository");
        this.f130499a = hVar;
        this.f130500b = aVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(dI.C17164e<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof qz.C14960b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            qz.b$a r0 = (qz.C14960b.a) r0
            int r1 = r0.f130505g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f130505g = r1
            goto L_0x0018
        L_0x0013:
            qz.b$a r0 = new qz.b$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f130503e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f130505g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f130502d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f130501c
            qz.b r6 = (qz.C14960b) r6
            XH.y.b(r1)
            goto L_0x004f
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            FB.a r1 = r5.f130500b
            TJ.g r1 = r1.b()
            r0.f130501c = r5
            r0.f130502d = r6
            r0.f130505g = r4
            java.lang.Object r1 = TJ.C16534i.D(r1, r0)
            if (r1 != r2) goto L_0x004f
            return r2
        L_0x004f:
            EB.d r1 = (EB.C12832d) r1
            if (r1 == 0) goto L_0x0058
            java.lang.String r6 = r1.e()
            goto L_0x0059
        L_0x0058:
            r6 = 0
        L_0x0059:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.C14960b.c(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x014e A[Catch:{ CancellationException -> 0x006c, all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0153 A[Catch:{ CancellationException -> 0x006c, all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x015c A[Catch:{ CancellationException -> 0x006c, all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0161 A[Catch:{ CancellationException -> 0x006c, all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x019e A[Catch:{ CancellationException -> 0x006c, all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b0 A[Catch:{ CancellationException -> 0x006c, all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r22, rz.O r23, int r24, java.lang.String r25, java.lang.String r26, Sy.a.b r27, boolean r28, dI.C17164e<? super XH.x<rz.I>> r29) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r29
            boolean r3 = r2 instanceof qz.C14960b.C3227b
            if (r3 == 0) goto L_0x001a
            r3 = r2
            qz.b$b r3 = (qz.C14960b.C3227b) r3
            int r4 = r3.f130524u
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.f130524u = r4
        L_0x0018:
            r13 = r3
            goto L_0x0020
        L_0x001a:
            qz.b$b r3 = new qz.b$b
            r3.<init>(r1, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r3 = r13.f130522s
            java.lang.Object r14 = eI.C17187b.f()
            int r4 = r13.f130524u
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L_0x0109
            if (r4 == r8) goto L_0x00c6
            if (r4 == r6) goto L_0x0077
            if (r4 != r5) goto L_0x006f
            java.lang.Object r0 = r13.f130517n
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r13.f130516m
            rz.I r0 = (rz.I) r0
            java.lang.Object r0 = r13.f130515l
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r13.f130514k
            qz.b r0 = (qz.C14960b) r0
            java.lang.Object r0 = r13.f130513j
            qz.b r0 = (qz.C14960b) r0
            java.lang.Object r0 = r13.f130512i
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r13.f130511h
            Sy.a$b r0 = (Sy.a.b) r0
            java.lang.Object r0 = r13.f130510g
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r13.f130509f
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r13.f130508e
            rz.O r0 = (rz.O) r0
            java.lang.Object r0 = r13.f130507d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r13.f130506c
            qz.b r0 = (qz.C14960b) r0
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            goto L_0x01e8
        L_0x0069:
            r0 = move-exception
            goto L_0x01ef
        L_0x006c:
            r0 = move-exception
            goto L_0x01fa
        L_0x006f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0077:
            int r0 = r13.f130520q
            int r2 = r13.f130519p
            boolean r4 = r13.f130521r
            int r6 = r13.f130518o
            java.lang.Object r7 = r13.f130516m
            rz.I r7 = (rz.I) r7
            java.lang.Object r8 = r13.f130514k
            qz.b r8 = (qz.C14960b) r8
            java.lang.Object r9 = r13.f130513j
            qz.b r9 = (qz.C14960b) r9
            java.lang.Object r10 = r13.f130512i
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r13.f130511h
            Sy.a$b r11 = (Sy.a.b) r11
            java.lang.Object r12 = r13.f130510g
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r15 = r13.f130509f
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r5 = r13.f130508e
            rz.O r5 = (rz.O) r5
            r22 = r0
            java.lang.Object r0 = r13.f130507d
            java.lang.String r0 = (java.lang.String) r0
            r23 = r0
            java.lang.Object r0 = r13.f130506c
            qz.b r0 = (qz.C14960b) r0
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r1 = r23
            r18 = r14
            r14 = r7
            r7 = r6
            r6 = r22
            r19 = r4
            r4 = r0
            r0 = r19
            r20 = r10
            r10 = r5
            r5 = r9
            r9 = r12
            r12 = r15
            r15 = r11
            r11 = r20
            goto L_0x019a
        L_0x00c6:
            int r7 = r13.f130520q
            int r0 = r13.f130519p
            boolean r2 = r13.f130521r
            int r4 = r13.f130518o
            java.lang.Object r5 = r13.f130514k
            qz.b r5 = (qz.C14960b) r5
            java.lang.Object r8 = r13.f130513j
            qz.b r8 = (qz.C14960b) r8
            java.lang.Object r9 = r13.f130512i
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r10 = r13.f130511h
            Sy.a$b r10 = (Sy.a.b) r10
            java.lang.Object r11 = r13.f130510g
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r13.f130509f
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r15 = r13.f130508e
            rz.O r15 = (rz.O) r15
            java.lang.Object r6 = r13.f130507d
            java.lang.String r6 = (java.lang.String) r6
            r22 = r0
            java.lang.Object r0 = r13.f130506c
            qz.b r0 = (qz.C14960b) r0
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            XH.x r3 = (XH.x) r3     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            java.lang.Object r3 = r3.j()     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r1 = r8
            r8 = r5
            r5 = r3
            r3 = r9
            r9 = r10
            r10 = r4
            r4 = r0
            r0 = r6
            r6 = r7
            r7 = r22
            goto L_0x0148
        L_0x0109:
            XH.y.b(r3)
            XH.x$a r3 = XH.x.f139812b     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            Ry.h r3 = r1.f130499a     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130506c = r1     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130507d = r0     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r4 = r23
            r13.f130508e = r4     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r5 = r25
            r13.f130509f = r5     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r6 = r26
            r13.f130510g = r6     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r9 = r27
            r13.f130511h = r9     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130512i = r2     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130513j = r1     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130514k = r1     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r10 = r24
            r13.f130518o = r10     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r11 = r28
            r13.f130521r = r11     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130519p = r7     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130520q = r7     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130524u = r8     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            java.lang.Object r3 = r3.d(r0, r13)     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            if (r3 != r14) goto L_0x013f
            return r14
        L_0x013f:
            r8 = r1
            r15 = r4
            r12 = r5
            r4 = r8
            r5 = r3
            r3 = r2
            r2 = r11
            r11 = r6
            r6 = r7
        L_0x0148:
            boolean r17 = XH.x.g(r5)     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            if (r17 == 0) goto L_0x0153
            r17 = 0
        L_0x0150:
            r18 = r14
            goto L_0x0156
        L_0x0153:
            r17 = r5
            goto L_0x0150
        L_0x0156:
            r14 = r17
            rz.I r14 = (rz.I) r14     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            if (r14 == 0) goto L_0x0161
            java.lang.Object r0 = XH.x.b(r14)     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            return r0
        L_0x0161:
            r13.f130506c = r4     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130507d = r0     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130508e = r15     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130509f = r12     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130510g = r11     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130511h = r9     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130512i = r3     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130513j = r1     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130514k = r8     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130515l = r5     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130516m = r14     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130518o = r10     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130521r = r2     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130519p = r7     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130520q = r6     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r5 = 2
            r13.f130524u = r5     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            java.lang.Object r5 = r8.c(r13)     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r16 = r0
            r0 = r18
            if (r5 != r0) goto L_0x018d
            return r0
        L_0x018d:
            r18 = r0
            r0 = r2
            r2 = r7
            r7 = r10
            r10 = r15
            r15 = r9
            r9 = r11
            r11 = r3
            r3 = r5
            r5 = r1
            r1 = r16
        L_0x019a:
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            if (r3 != 0) goto L_0x01b0
            XH.x$a r0 = XH.x.f139812b     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            java.lang.String r1 = "No store selected."
            r0.<init>(r1)     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            java.lang.Object r0 = XH.y.a(r0)     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            return r0
        L_0x01b0:
            r16 = r6
            Ry.h r6 = r8.f130499a     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130506c = r4     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130507d = r1     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130508e = r10     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130509f = r12     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130510g = r9     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130511h = r15     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130512i = r11     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130513j = r5     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130514k = r8     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130515l = r3     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130516m = r14     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130517n = r3     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130518o = r7     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130521r = r0     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r13.f130519p = r2     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r2 = r16
            r13.f130520q = r2     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r2 = 3
            r13.f130524u = r2     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r4 = r6
            r5 = r3
            r6 = r1
            r8 = r12
            r11 = r15
            r12 = r0
            java.lang.Object r3 = r4.b(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            r0 = r18
            if (r3 != r0) goto L_0x01e8
            return r0
        L_0x01e8:
            rz.I r3 = (rz.I) r3     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            java.lang.Object r0 = XH.x.b(r3)     // Catch:{ CancellationException -> 0x006c, all -> 0x0069 }
            goto L_0x01f9
        L_0x01ef:
            XH.x$a r1 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x01f9:
            return r0
        L_0x01fa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.C14960b.a(java.lang.String, rz.O, int, java.lang.String, java.lang.String, Sy.a$b, boolean, dI.e):java.lang.Object");
    }
}
