package com.ingka.ikea.purchasehistorydata.impl.data.network;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import tw.h;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/c;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/b;", "Ltw/h;", "secureNetworkService", "publicNetworkService", "<init>", "(Ltw/h;Ltw/h;)V", "", "purchaseId", "LGx/b;", "c", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "customerId", "f", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "Ltw/h;", "b", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/a;", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/network/a;", "secureEndpoint", "publicEndpoint", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final h f119413a;

    /* renamed from: b  reason: collision with root package name */
    private final h f119414b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.purchasehistorydata.impl.data.network.CustomerReturnsRemoteDataSourceImpl", f = "CustomerReturnsRemoteDataSource.kt", l = {48}, m = "getGuestReturnAuthorization")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f119415c;

        /* renamed from: d  reason: collision with root package name */
        Object f119416d;

        /* renamed from: e  reason: collision with root package name */
        Object f119417e;

        /* renamed from: f  reason: collision with root package name */
        Object f119418f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f119419g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f119420h;

        /* renamed from: i  reason: collision with root package name */
        int f119421i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f119420h = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f119419g = obj;
            this.f119421i |= Integer.MIN_VALUE;
            return this.f119420h.f((String) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.purchasehistorydata.impl.data.network.CustomerReturnsRemoteDataSourceImpl", f = "CustomerReturnsRemoteDataSource.kt", l = {41}, m = "getReturnAuthorization")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f119422c;

        /* renamed from: d  reason: collision with root package name */
        Object f119423d;

        /* renamed from: e  reason: collision with root package name */
        Object f119424e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f119425f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f119426g;

        /* renamed from: h  reason: collision with root package name */
        int f119427h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f119426g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f119425f = obj;
            this.f119427h |= Integer.MIN_VALUE;
            return this.f119426g.c((String) null, this);
        }
    }

    public c(h hVar, h hVar2) {
        C17542s.j(hVar, "secureNetworkService");
        C17542s.j(hVar2, "publicNetworkService");
        this.f119413a = hVar;
        this.f119414b = hVar2;
    }

    private final a a() {
        return (a) this.f119414b.b(a.class);
    }

    private final a b() {
        return (a) this.f119413a.b(a.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r9, dI.C17164e<? super Gx.b> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.ingka.ikea.purchasehistorydata.impl.data.network.c.b
            if (r0 == 0) goto L_0x0014
            r0 = r10
            com.ingka.ikea.purchasehistorydata.impl.data.network.c$b r0 = (com.ingka.ikea.purchasehistorydata.impl.data.network.c.b) r0
            int r1 = r0.f119427h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f119427h = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            com.ingka.ikea.purchasehistorydata.impl.data.network.c$b r0 = new com.ingka.ikea.purchasehistorydata.impl.data.network.c$b
            r0.<init>(r8, r10)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r4.f119425f
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r4.f119427h
            r2 = 1
            if (r1 == 0) goto L_0x003f
            if (r1 != r2) goto L_0x0037
            java.lang.Object r9 = r4.f119424e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r4.f119423d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r4.f119422c
            com.ingka.ikea.purchasehistorydata.impl.data.network.c r9 = (com.ingka.ikea.purchasehistorydata.impl.data.network.c) r9
            XH.y.b(r0)
            goto L_0x0059
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            XH.y.b(r0)
            com.ingka.ikea.purchasehistorydata.impl.data.network.a r1 = r8.b()
            r4.f119422c = r8
            r4.f119423d = r9
            r4.f119424e = r10
            r4.f119427h = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r3 = r9
            java.lang.Object r0 = com.ingka.ikea.purchasehistorydata.impl.data.network.a.C2986a.a(r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L_0x0059
            return r7
        L_0x0059:
            com.ingka.ikea.purchasehistorydata.impl.data.remote.ReturnAuthorizationRemote r0 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.ReturnAuthorizationRemote) r0
            Gx.b r9 = r0.convertToLocal()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.purchasehistorydata.impl.data.network.c.c(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(java.lang.String r6, java.lang.String r7, dI.C17164e<? super Gx.b> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.ingka.ikea.purchasehistorydata.impl.data.network.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.ingka.ikea.purchasehistorydata.impl.data.network.c$a r0 = (com.ingka.ikea.purchasehistorydata.impl.data.network.c.a) r0
            int r1 = r0.f119421i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f119421i = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.purchasehistorydata.impl.data.network.c$a r0 = new com.ingka.ikea.purchasehistorydata.impl.data.network.c$a
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f119419g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f119421i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f119418f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f119417e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f119416d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f119415c
            com.ingka.ikea.purchasehistorydata.impl.data.network.c r6 = (com.ingka.ikea.purchasehistorydata.impl.data.network.c) r6
            XH.y.b(r1)
            goto L_0x0059
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            com.ingka.ikea.purchasehistorydata.impl.data.network.a r1 = r5.a()
            r0.f119415c = r5
            r0.f119416d = r6
            r0.f119417e = r7
            r0.f119418f = r8
            r0.f119421i = r4
            java.lang.Object r1 = r1.a(r6, r7, r0)
            if (r1 != r2) goto L_0x0059
            return r2
        L_0x0059:
            com.ingka.ikea.purchasehistorydata.impl.data.remote.ReturnAuthorizationRemote r1 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.ReturnAuthorizationRemote) r1
            Gx.b r6 = r1.convertToLocal()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.purchasehistorydata.impl.data.network.c.f(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
