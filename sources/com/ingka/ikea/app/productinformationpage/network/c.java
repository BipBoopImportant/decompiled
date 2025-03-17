package com.ingka.ikea.app.productinformationpage.network;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import tw.h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/network/c;", "Lcom/ingka/ikea/app/productinformationpage/network/b;", "Ltw/h;", "networkService", "<init>", "(Ltw/h;)V", "", "amount", "Lcom/ingka/ikea/app/productinformationpage/network/FinancialServicesDetails;", "a", "(DLdI/e;)Ljava/lang/Object;", "Ltw/h;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final h f72089a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.productinformationpage.network.FinancialServicesRemoteDataSourceImpl", f = "FinancialServicesRemoteDataSourceImpl.kt", l = {38}, m = "fetchFinancialServices")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f72090c;

        /* renamed from: d  reason: collision with root package name */
        Object f72091d;

        /* renamed from: e  reason: collision with root package name */
        Object f72092e;

        /* renamed from: f  reason: collision with root package name */
        double f72093f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f72094g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f72095h;

        /* renamed from: i  reason: collision with root package name */
        int f72096i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f72095h = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f72094g = obj;
            this.f72096i |= Integer.MIN_VALUE;
            return this.f72095h.a(0.0d, this);
        }
    }

    public c(h hVar) {
        C17542s.j(hVar, "networkService");
        this.f72089a = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(double r6, dI.C17164e<? super com.ingka.ikea.app.productinformationpage.network.FinancialServicesDetails> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.ingka.ikea.app.productinformationpage.network.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.ingka.ikea.app.productinformationpage.network.c$a r0 = (com.ingka.ikea.app.productinformationpage.network.c.a) r0
            int r1 = r0.f72096i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f72096i = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.app.productinformationpage.network.c$a r0 = new com.ingka.ikea.app.productinformationpage.network.c$a
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f72094g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f72096i
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f72092e
            com.ingka.ikea.app.productinformationpage.network.a r6 = (com.ingka.ikea.app.productinformationpage.network.a) r6
            java.lang.Object r6 = r0.f72091d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f72090c
            com.ingka.ikea.app.productinformationpage.network.c r6 = (com.ingka.ikea.app.productinformationpage.network.c) r6
            XH.y.b(r1)
            goto L_0x005f
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            tw.h r1 = r5.f72089a
            java.lang.Class<com.ingka.ikea.app.productinformationpage.network.a> r3 = com.ingka.ikea.app.productinformationpage.network.a.class
            java.lang.Object r1 = r1.b(r3)
            com.ingka.ikea.app.productinformationpage.network.a r1 = (com.ingka.ikea.app.productinformationpage.network.a) r1
            java.lang.String r3 = java.lang.String.valueOf(r6)
            r0.f72090c = r5
            r0.f72091d = r8
            r0.f72092e = r1
            r0.f72093f = r6
            r0.f72096i = r4
            java.lang.Object r1 = r1.a(r3, r0)
            if (r1 != r2) goto L_0x005f
            return r2
        L_0x005f:
            com.ingka.ikea.app.productinformationpage.network.FinancialServicesDetails$Remote r1 = (com.ingka.ikea.app.productinformationpage.network.FinancialServicesDetails.Remote) r1
            com.ingka.ikea.app.productinformationpage.network.FinancialServicesDetails r6 = r1.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.productinformationpage.network.c.a(double, dI.e):java.lang.Object");
    }
}
