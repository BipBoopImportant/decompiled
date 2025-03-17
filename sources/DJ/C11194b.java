package dj;

import Dw.C12792a;
import Dw.b;
import Kj.a;
import Ry.f;
import Ty.c;
import am.i;
import dI.C17164e;
import ep.C11256b;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H@¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHB¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Ldj/b;", "", "LRy/a;", "settingsRepo", "LRy/f;", "cartRepositoryFactory", "LDw/b;", "ongoingInStoreOrderOrderRepository", "LTy/b;", "fullServeWaitingTimeRepository", "Lep/b;", "localizedDateTimeFormatter", "Lam/i;", "timeZoneProvider", "<init>", "(LRy/a;LRy/f;LDw/b;LTy/b;Lep/b;Lam/i;)V", "", "storeId", "LTy/c;", "c", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "pickupWaitingTime", "b", "(LTy/c;)Ljava/lang/String;", "LDw/a;", "LKj/a$c$a$b;", "e", "(LDw/a;)LKj/a$c$a$b;", "timeSlotId", "", "salesOrderId", "LKj/a$c$a;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LdI/e;)Ljava/lang/Object;", "a", "LRy/a;", "LRy/f;", "LDw/b;", "LTy/b;", "Lep/b;", "f", "Lam/i;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dj.b  reason: case insensitive filesystem */
public final class C11194b {

    /* renamed from: a  reason: collision with root package name */
    private final Ry.a f96853a;

    /* renamed from: b  reason: collision with root package name */
    private final f f96854b;

    /* renamed from: c  reason: collision with root package name */
    private final b f96855c;

    /* renamed from: d  reason: collision with root package name */
    private final Ty.b f96856d;

    /* renamed from: e  reason: collision with root package name */
    private final C11256b f96857e;

    /* renamed from: f  reason: collision with root package name */
    private final i f96858f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.checkout.usecase.FetchPickupInformationUseCase", f = "FetchPickupInformationUseCase.kt", l = {88, 96}, m = "getFullServeWaitingTime")
    /* renamed from: dj.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f96859c;

        /* renamed from: d  reason: collision with root package name */
        Object f96860d;

        /* renamed from: e  reason: collision with root package name */
        Object f96861e;

        /* renamed from: f  reason: collision with root package name */
        Object f96862f;

        /* renamed from: g  reason: collision with root package name */
        Object f96863g;

        /* renamed from: h  reason: collision with root package name */
        Object f96864h;

        /* renamed from: i  reason: collision with root package name */
        Object f96865i;

        /* renamed from: j  reason: collision with root package name */
        int f96866j;

        /* renamed from: k  reason: collision with root package name */
        int f96867k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f96868l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C11194b f96869m;

        /* renamed from: n  reason: collision with root package name */
        int f96870n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11194b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f96869m = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f96868l = obj;
            this.f96870n |= Integer.MIN_VALUE;
            return this.f96869m.c((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.checkout.usecase.FetchPickupInformationUseCase", f = "FetchPickupInformationUseCase.kt", l = {39, 50, 59, 73}, m = "invoke")
    /* renamed from: dj.b$b  reason: collision with other inner class name */
    static final class C2147b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f96871c;

        /* renamed from: d  reason: collision with root package name */
        Object f96872d;

        /* renamed from: e  reason: collision with root package name */
        Object f96873e;

        /* renamed from: f  reason: collision with root package name */
        Object f96874f;

        /* renamed from: g  reason: collision with root package name */
        Object f96875g;

        /* renamed from: h  reason: collision with root package name */
        Object f96876h;

        /* renamed from: i  reason: collision with root package name */
        int f96877i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f96878j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C11194b f96879k;

        /* renamed from: l  reason: collision with root package name */
        int f96880l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2147b(C11194b bVar, C17164e<? super C2147b> eVar) {
            super(eVar);
            this.f96879k = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f96878j = obj;
            this.f96880l |= Integer.MIN_VALUE;
            return this.f96879k.d((String) null, (String) null, (Integer) null, this);
        }
    }

    public C11194b(Ry.a aVar, f fVar, b bVar, Ty.b bVar2, C11256b bVar3, i iVar) {
        C17542s.j(aVar, "settingsRepo");
        C17542s.j(fVar, "cartRepositoryFactory");
        C17542s.j(bVar, "ongoingInStoreOrderOrderRepository");
        C17542s.j(bVar2, "fullServeWaitingTimeRepository");
        C17542s.j(bVar3, "localizedDateTimeFormatter");
        C17542s.j(iVar, "timeZoneProvider");
        this.f96853a = aVar;
        this.f96854b = fVar;
        this.f96855c = bVar;
        this.f96856d = bVar2;
        this.f96857e = bVar3;
        this.f96858f = iVar;
    }

    private final String b(c cVar) {
        if (cVar.a() <= 0) {
            return null;
        }
        return this.f96857e.d().format(Instant.ofEpochSecond(cVar.a()).atZone(this.f96858f.a().toZoneId()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: dI.e<? super Ty.c>} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b2 A[LOOP:1: B:25:0x00ac->B:27:0x00b2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ee A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r10, dI.C17164e<? super Ty.c> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof dj.C11194b.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            dj.b$a r0 = (dj.C11194b.a) r0
            int r1 = r0.f96870n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f96870n = r1
            goto L_0x0018
        L_0x0013:
            dj.b$a r0 = new dj.b$a
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f96868l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f96870n
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0062
            if (r3 == r5) goto L_0x0051
            if (r3 != r4) goto L_0x0049
            java.lang.Object r10 = r0.f96865i
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r10 = r0.f96864h
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r10 = r0.f96863g
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r0.f96862f
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r0.f96861e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f96860d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f96859c
            dj.b r10 = (dj.C11194b) r10
            XH.y.b(r1)
            goto L_0x00ef
        L_0x0049:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0051:
            java.lang.Object r10 = r0.f96861e
            r11 = r10
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r10 = r0.f96860d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r3 = r0.f96859c
            dj.b r3 = (dj.C11194b) r3
            XH.y.b(r1)
            goto L_0x007b
        L_0x0062:
            XH.y.b(r1)
            Ry.f r1 = r9.f96854b
            Ry.e r1 = r1.invoke()
            r0.f96859c = r9
            r0.f96860d = r10
            r0.f96861e = r11
            r0.f96870n = r5
            java.lang.Object r1 = r1.h(r0)
            if (r1 != r2) goto L_0x007a
            return r2
        L_0x007a:
            r3 = r9
        L_0x007b:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0086:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x009d
            java.lang.Object r6 = r1.next()
            r7 = r6
            rz.g r7 = (rz.C15014g) r7
            boolean r7 = rz.J.b(r7)
            if (r7 == 0) goto L_0x0086
            r5.add(r6)
            goto L_0x0086
        L_0x009d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r6 = 10
            int r6 = YH.C16877v.y(r5, r6)
            r1.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x00ac:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00d1
            java.lang.Object r6 = r5.next()
            rz.g r6 = (rz.C15014g) r6
            Ty.a r7 = new Ty.a
            com.ingka.ikea.core.model.product.ProductItem r8 = r6.g()
            java.lang.String r8 = r8.f()
            rz.U r6 = r6.h()
            int r6 = r6.c()
            r7.<init>(r8, r6)
            r1.add(r7)
            goto L_0x00ac
        L_0x00d1:
            Ty.b r6 = r3.f96856d
            r0.f96859c = r3
            r0.f96860d = r10
            r0.f96861e = r11
            r0.f96862f = r1
            r0.f96863g = r1
            r0.f96864h = r1
            r0.f96865i = r5
            r11 = 0
            r0.f96866j = r11
            r0.f96867k = r11
            r0.f96870n = r4
            java.lang.Object r1 = r6.b(r10, r1, r0)
            if (r1 != r2) goto L_0x00ef
            return r2
        L_0x00ef:
            Ty.c r1 = (Ty.c) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.C11194b.c(java.lang.String, dI.e):java.lang.Object");
    }

    private final a.c.C1636a.b e(C12792a aVar) {
        return new a.c.C1636a.b(aVar.c(), aVar.d().c(), aVar.d().f().b(), aVar.d().f().a());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: dI.e<? super Kj.a$c$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.String r10, java.lang.String r11, java.lang.Integer r12, dI.C17164e<? super Kj.a.c.C1636a> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof dj.C11194b.C2147b
            if (r0 == 0) goto L_0x0013
            r0 = r13
            dj.b$b r0 = (dj.C11194b.C2147b) r0
            int r1 = r0.f96880l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f96880l = r1
            goto L_0x0018
        L_0x0013:
            dj.b$b r0 = new dj.b$b
            r0.<init>(r9, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f96878j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f96880l
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L_0x00a8
            if (r3 == r7) goto L_0x008d
            if (r3 == r6) goto L_0x0071
            if (r3 == r5) goto L_0x0054
            if (r3 != r4) goto L_0x004c
            java.lang.Object r10 = r0.f96876h
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r10 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r10
            java.lang.Object r10 = r0.f96875g
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f96874f
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r11 = r0.f96873e
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r0.f96872d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r0.f96871c
            dj.b r11 = (dj.C11194b) r11
            XH.y.b(r1)
            goto L_0x0144
        L_0x004c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0054:
            java.lang.Object r10 = r0.f96876h
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r10 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r10
            java.lang.Object r10 = r0.f96875g
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f96874f
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r10 = r0.f96873e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f96872d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f96871c
            dj.b r10 = (dj.C11194b) r10
            XH.y.b(r1)
            goto L_0x0118
        L_0x0071:
            java.lang.Object r10 = r0.f96876h
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r10 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r10
            java.lang.Object r10 = r0.f96875g
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f96874f
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r10 = r0.f96873e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f96872d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f96871c
            dj.b r10 = (dj.C11194b) r10
            XH.y.b(r1)
            goto L_0x00f1
        L_0x008d:
            java.lang.Object r10 = r0.f96875g
            r13 = r10
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r10 = r0.f96874f
            r12 = r10
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r10 = r0.f96873e
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.f96872d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r3 = r0.f96871c
            dj.b r3 = (dj.C11194b) r3
            XH.y.b(r1)
            goto L_0x00c5
        L_0x00a8:
            XH.y.b(r1)
            Ry.a r1 = r9.f96853a
            TJ.g r1 = r1.b()
            r0.f96871c = r9
            r0.f96872d = r10
            r0.f96873e = r11
            r0.f96874f = r12
            r0.f96875g = r13
            r0.f96880l = r7
            java.lang.Object r1 = TJ.C16534i.D(r1, r0)
            if (r1 != r2) goto L_0x00c4
            return r2
        L_0x00c4:
            r3 = r9
        L_0x00c5:
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r1 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r1
            if (r1 == 0) goto L_0x00ce
            boolean r7 = r1.j()
            goto L_0x00cf
        L_0x00ce:
            r7 = 0
        L_0x00cf:
            if (r7 == 0) goto L_0x0129
            if (r11 == 0) goto L_0x00fa
            Dw.b r4 = r3.f96855c
            TJ.g r4 = r4.a(r11)
            r0.f96871c = r3
            r0.f96872d = r10
            r0.f96873e = r11
            r0.f96874f = r12
            r0.f96875g = r13
            r0.f96876h = r1
            r0.f96877i = r7
            r0.f96880l = r6
            java.lang.Object r1 = TJ.C16534i.D(r4, r0)
            if (r1 != r2) goto L_0x00f0
            return r2
        L_0x00f0:
            r10 = r3
        L_0x00f1:
            Dw.a r1 = (Dw.C12792a) r1
            if (r1 == 0) goto L_0x0155
            Kj.a$c$a$b r8 = r10.e(r1)
            goto L_0x0155
        L_0x00fa:
            Dw.b r4 = r3.f96855c
            TJ.g r4 = r4.d()
            r0.f96871c = r3
            r0.f96872d = r10
            r0.f96873e = r11
            r0.f96874f = r12
            r0.f96875g = r13
            r0.f96876h = r1
            r0.f96877i = r7
            r0.f96880l = r5
            java.lang.Object r1 = TJ.C16534i.D(r4, r0)
            if (r1 != r2) goto L_0x0117
            return r2
        L_0x0117:
            r10 = r3
        L_0x0118:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0155
            java.lang.Object r11 = YH.C16877v.y0(r1)
            Dw.a r11 = (Dw.C12792a) r11
            if (r11 == 0) goto L_0x0155
            Kj.a$c$a$b r8 = r10.e(r11)
            goto L_0x0155
        L_0x0129:
            if (r12 == 0) goto L_0x0155
            r0.f96871c = r3
            r0.f96872d = r10
            r0.f96873e = r11
            r0.f96874f = r12
            r0.f96875g = r13
            r0.f96876h = r1
            r0.f96877i = r7
            r0.f96880l = r4
            java.lang.Object r1 = r3.c(r10, r0)
            if (r1 != r2) goto L_0x0142
            return r2
        L_0x0142:
            r10 = r12
            r11 = r3
        L_0x0144:
            Ty.c r1 = (Ty.c) r1
            if (r1 == 0) goto L_0x0155
            Kj.a$c$a$a r8 = new Kj.a$c$a$a
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = r11.b(r1)
            r8.<init>(r10, r11)
        L_0x0155:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.C11194b.d(java.lang.String, java.lang.String, java.lang.Integer, dI.e):java.lang.Object");
    }
}
