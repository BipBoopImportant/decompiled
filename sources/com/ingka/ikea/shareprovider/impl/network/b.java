package com.ingka.ikea.shareprovider.impl.network;

import FA.C12859a;
import VL.C16699a;
import VL.C16704f;
import VL.o;
import VL.s;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import tw.h;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/ingka/ikea/shareprovider/impl/network/b;", "Lcom/ingka/ikea/shareprovider/impl/network/a;", "Ltw/h;", "networkService", "<init>", "(Ltw/h;)V", "", "id", "LFA/a;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "listName", "", "LFA/a$a;", "items", "b", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "itemNo", "itemType", "c", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Ltw/h;", "Lcom/ingka/ikea/shareprovider/impl/network/b$a;", "d", "()Lcom/ingka/ikea/shareprovider/impl/network/b$a;", "endpoint", "shareprovider-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final h f120224a;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/shareprovider/impl/network/b$a;", "", "", "id", "Lcom/ingka/ikea/shareprovider/impl/network/SharedListModel;", "c", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "body", "Lcom/ingka/ikea/shareprovider/impl/network/DynamicLinkResponse;", "b", "(Lcom/ingka/ikea/shareprovider/impl/network/SharedListModel;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/shareprovider/impl/network/SharedItemModel;", "a", "(Lcom/ingka/ikea/shareprovider/impl/network/SharedItemModel;LdI/e;)Ljava/lang/Object;", "shareprovider-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private interface a {
        @o("share-list/v6/{cc}/{lc}/applink/shareitem")
        Object a(@C16699a SharedItemModel sharedItemModel, C17164e<? super DynamicLinkResponse> eVar);

        @o("share-list/v6/{cc}/{lc}/applink")
        Object b(@C16699a SharedListModel sharedListModel, C17164e<? super DynamicLinkResponse> eVar);

        @C16704f("share-list/v6/{cc}/{lc}/sharelist/{id}")
        Object c(@s("id") String str, C17164e<? super SharedListModel> eVar);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.shareprovider.impl.network.ShareRemoteDataSourceImpl", f = "ShareRemoteDataSourceImpl.kt", l = {53}, m = "getSharedList")
    /* renamed from: com.ingka.ikea.shareprovider.impl.network.b$b  reason: collision with other inner class name */
    static final class C3000b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f120225c;

        /* renamed from: d  reason: collision with root package name */
        Object f120226d;

        /* renamed from: e  reason: collision with root package name */
        Object f120227e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f120228f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f120229g;

        /* renamed from: h  reason: collision with root package name */
        int f120230h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3000b(b bVar, C17164e<? super C3000b> eVar) {
            super(eVar);
            this.f120229g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f120228f = obj;
            this.f120230h |= Integer.MIN_VALUE;
            return this.f120229g.a((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.shareprovider.impl.network.ShareRemoteDataSourceImpl", f = "ShareRemoteDataSourceImpl.kt", l = {90}, m = "shareItem")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f120231c;

        /* renamed from: d  reason: collision with root package name */
        Object f120232d;

        /* renamed from: e  reason: collision with root package name */
        Object f120233e;

        /* renamed from: f  reason: collision with root package name */
        Object f120234f;

        /* renamed from: g  reason: collision with root package name */
        Object f120235g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f120236h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b f120237i;

        /* renamed from: j  reason: collision with root package name */
        int f120238j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f120237i = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f120236h = obj;
            this.f120238j |= Integer.MIN_VALUE;
            return this.f120237i.c((String) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.shareprovider.impl.network.ShareRemoteDataSourceImpl", f = "ShareRemoteDataSourceImpl.kt", l = {76}, m = "shareList")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f120239c;

        /* renamed from: d  reason: collision with root package name */
        Object f120240d;

        /* renamed from: e  reason: collision with root package name */
        Object f120241e;

        /* renamed from: f  reason: collision with root package name */
        Object f120242f;

        /* renamed from: g  reason: collision with root package name */
        Object f120243g;

        /* renamed from: h  reason: collision with root package name */
        Object f120244h;

        /* renamed from: i  reason: collision with root package name */
        Object f120245i;

        /* renamed from: j  reason: collision with root package name */
        Object f120246j;

        /* renamed from: k  reason: collision with root package name */
        Object f120247k;

        /* renamed from: l  reason: collision with root package name */
        Object f120248l;

        /* renamed from: m  reason: collision with root package name */
        int f120249m;

        /* renamed from: n  reason: collision with root package name */
        int f120250n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f120251o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b f120252p;

        /* renamed from: q  reason: collision with root package name */
        int f120253q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f120252p = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f120251o = obj;
            this.f120253q |= Integer.MIN_VALUE;
            return this.f120252p.b((String) null, (List<C12859a.C2618a>) null, this);
        }
    }

    public b(h hVar) {
        C17542s.j(hVar, "networkService");
        this.f120224a = hVar;
    }

    private final a d() {
        return (a) this.f120224a.b(a.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super FA.C12859a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ingka.ikea.shareprovider.impl.network.b.C3000b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.ingka.ikea.shareprovider.impl.network.b$b r0 = (com.ingka.ikea.shareprovider.impl.network.b.C3000b) r0
            int r1 = r0.f120230h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f120230h = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.shareprovider.impl.network.b$b r0 = new com.ingka.ikea.shareprovider.impl.network.b$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f120228f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f120230h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f120227e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f120226d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f120225c
            com.ingka.ikea.shareprovider.impl.network.b r6 = (com.ingka.ikea.shareprovider.impl.network.b) r6
            XH.y.b(r1)
            goto L_0x0053
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            com.ingka.ikea.shareprovider.impl.network.b$a r1 = r5.d()
            r0.f120225c = r5
            r0.f120226d = r6
            r0.f120227e = r7
            r0.f120230h = r4
            java.lang.Object r1 = r1.c(r6, r0)
            if (r1 != r2) goto L_0x0053
            return r2
        L_0x0053:
            com.ingka.ikea.shareprovider.impl.network.SharedListModel r1 = (com.ingka.ikea.shareprovider.impl.network.SharedListModel) r1
            FA.a r6 = r1.convertToLocal()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.shareprovider.impl.network.b.a(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r11, java.util.List<FA.C12859a.C2618a> r12, dI.C17164e<? super java.lang.String> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.ingka.ikea.shareprovider.impl.network.b.d
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.ingka.ikea.shareprovider.impl.network.b$d r0 = (com.ingka.ikea.shareprovider.impl.network.b.d) r0
            int r1 = r0.f120253q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f120253q = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.shareprovider.impl.network.b$d r0 = new com.ingka.ikea.shareprovider.impl.network.b$d
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f120251o
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f120253q
            r4 = 1
            if (r3 == 0) goto L_0x0059
            if (r3 != r4) goto L_0x0051
            java.lang.Object r11 = r0.f120248l
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r11 = r0.f120247k
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r11 = r0.f120246j
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = r0.f120245i
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = r0.f120244h
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r0.f120243g
            com.ingka.ikea.shareprovider.impl.network.SharedListModel r11 = (com.ingka.ikea.shareprovider.impl.network.SharedListModel) r11
            java.lang.Object r11 = r0.f120242f
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r0.f120241e
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r0.f120240d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r0.f120239c
            com.ingka.ikea.shareprovider.impl.network.b r11 = (com.ingka.ikea.shareprovider.impl.network.b) r11
            XH.y.b(r1)
            goto L_0x00c4
        L_0x0051:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0059:
            XH.y.b(r1)
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x00cb
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = YH.C16877v.y(r1, r5)
            r3.<init>(r5)
            java.util.Iterator r5 = r1.iterator()
        L_0x0074:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0099
            java.lang.Object r6 = r5.next()
            FA.a$a r6 = (FA.C12859a.C2618a) r6
            com.ingka.ikea.shareprovider.impl.network.SharedItemModel r7 = new com.ingka.ikea.shareprovider.impl.network.SharedItemModel
            java.lang.String r8 = r6.a()
            java.lang.String r9 = r6.b()
            int r6 = r6.c()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.e(r6)
            r7.<init>(r8, r9, r6)
            r3.add(r7)
            goto L_0x0074
        L_0x0099:
            com.ingka.ikea.shareprovider.impl.network.SharedListModel r6 = new com.ingka.ikea.shareprovider.impl.network.SharedListModel
            r6.<init>(r3, r11)
            com.ingka.ikea.shareprovider.impl.network.b$a r7 = r10.d()
            r0.f120239c = r10
            r0.f120240d = r11
            r0.f120241e = r12
            r0.f120242f = r13
            r0.f120243g = r6
            r0.f120244h = r3
            r0.f120245i = r1
            r0.f120246j = r1
            r0.f120247k = r3
            r0.f120248l = r5
            r11 = 0
            r0.f120249m = r11
            r0.f120250n = r11
            r0.f120253q = r4
            java.lang.Object r1 = r7.b(r6, r0)
            if (r1 != r2) goto L_0x00c4
            return r2
        L_0x00c4:
            com.ingka.ikea.shareprovider.impl.network.DynamicLinkResponse r1 = (com.ingka.ikea.shareprovider.impl.network.DynamicLinkResponse) r1
            java.lang.String r11 = r1.convertToLocal()
            return r11
        L_0x00cb:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Cannot share an empty list"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.shareprovider.impl.network.b.b(java.lang.String, java.util.List, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r6, java.lang.String r7, dI.C17164e<? super java.lang.String> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.ingka.ikea.shareprovider.impl.network.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.ingka.ikea.shareprovider.impl.network.b$c r0 = (com.ingka.ikea.shareprovider.impl.network.b.c) r0
            int r1 = r0.f120238j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f120238j = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.shareprovider.impl.network.b$c r0 = new com.ingka.ikea.shareprovider.impl.network.b$c
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f120236h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f120238j
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r6 = r0.f120235g
            com.ingka.ikea.shareprovider.impl.network.SharedItemModel r6 = (com.ingka.ikea.shareprovider.impl.network.SharedItemModel) r6
            java.lang.Object r6 = r0.f120234f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f120233e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f120232d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f120231c
            com.ingka.ikea.shareprovider.impl.network.b r6 = (com.ingka.ikea.shareprovider.impl.network.b) r6
            XH.y.b(r1)
            goto L_0x0068
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0045:
            XH.y.b(r1)
            com.ingka.ikea.shareprovider.impl.network.SharedItemModel r1 = new com.ingka.ikea.shareprovider.impl.network.SharedItemModel
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.b.e(r4)
            r1.<init>(r6, r7, r3)
            com.ingka.ikea.shareprovider.impl.network.b$a r3 = r5.d()
            r0.f120231c = r5
            r0.f120232d = r6
            r0.f120233e = r7
            r0.f120234f = r8
            r0.f120235g = r1
            r0.f120238j = r4
            java.lang.Object r1 = r3.a(r1, r0)
            if (r1 != r2) goto L_0x0068
            return r2
        L_0x0068:
            com.ingka.ikea.shareprovider.impl.network.DynamicLinkResponse r1 = (com.ingka.ikea.shareprovider.impl.network.DynamicLinkResponse) r1
            java.lang.String r6 = r1.convertToLocal()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.shareprovider.impl.network.b.c(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
