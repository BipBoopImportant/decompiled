package com.ingka.ikea.app.addresspicker.addresslookup.repo.network;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/network/a;", "LMe/a;", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/network/AddressLookupEndpoint;", "addressLookupEndpoint", "<init>", "(Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/network/AddressLookupEndpoint;)V", "", "searchString", "", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/network/AddressLookupEndpoint;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Me.a {

    /* renamed from: a  reason: collision with root package name */
    private final AddressLookupEndpoint f70004a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.addresspicker.addresslookup.repo.network.AddressLookupRemoteDataSourceImpl", f = "AddressLookupRemoteDataSource.kt", l = {29}, m = "fetchAddresses")
    /* renamed from: com.ingka.ikea.app.addresspicker.addresslookup.repo.network.a$a  reason: collision with other inner class name */
    static final class C1207a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f70005c;

        /* renamed from: d  reason: collision with root package name */
        Object f70006d;

        /* renamed from: e  reason: collision with root package name */
        Object f70007e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f70008f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f70009g;

        /* renamed from: h  reason: collision with root package name */
        int f70010h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1207a(a aVar, C17164e<? super C1207a> eVar) {
            super(eVar);
            this.f70009g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f70008f = obj;
            this.f70010h |= Integer.MIN_VALUE;
            return this.f70009g.a((String) null, this);
        }
    }

    public a(AddressLookupEndpoint addressLookupEndpoint) {
        C17542s.j(addressLookupEndpoint, "addressLookupEndpoint");
        this.f70004a = addressLookupEndpoint;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super java.util.List<com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ingka.ikea.app.addresspicker.addresslookup.repo.network.a.C1207a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.ingka.ikea.app.addresspicker.addresslookup.repo.network.a$a r0 = (com.ingka.ikea.app.addresspicker.addresslookup.repo.network.a.C1207a) r0
            int r1 = r0.f70010h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f70010h = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.app.addresspicker.addresslookup.repo.network.a$a r0 = new com.ingka.ikea.app.addresspicker.addresslookup.repo.network.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f70008f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f70010h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f70007e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f70006d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f70005c
            com.ingka.ikea.app.addresspicker.addresslookup.repo.network.a r6 = (com.ingka.ikea.app.addresspicker.addresslookup.repo.network.a) r6
            XH.y.b(r1)
            goto L_0x0061
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            boolean r1 = HJ.C15854t.v0(r6)
            if (r1 == 0) goto L_0x004b
            java.util.List r6 = YH.C16877v.n()
            return r6
        L_0x004b:
            com.ingka.ikea.app.addresspicker.addresslookup.repo.network.AddressLookupEndpoint r1 = r5.f70004a
            com.ingka.ikea.app.addresspicker.addresslookup.repo.network.AddressLookupEndpoint$SearchBody r3 = new com.ingka.ikea.app.addresspicker.addresslookup.repo.network.AddressLookupEndpoint$SearchBody
            r3.<init>(r6)
            r0.f70005c = r5
            r0.f70006d = r6
            r0.f70007e = r7
            r0.f70010h = r4
            java.lang.Object r1 = r1.a(r3, r0)
            if (r1 != r2) goto L_0x0061
            return r2
        L_0x0061:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L_0x006e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r7.next()
            com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress$Remote r0 = (com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress.Remote) r0
            com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress r0 = r0.b()
            if (r0 == 0) goto L_0x006e
            r6.add(r0)
            goto L_0x006e
        L_0x0084:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.addresspicker.addresslookup.repo.network.a.a(java.lang.String, dI.e):java.lang.Object");
    }
}
