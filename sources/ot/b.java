package ot;

import YH.X;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.ingka.ikea.instore.datalayer.storeoffers.network.model.StoreOffersRemote;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import rt.C11846a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lot/b;", "Lot/a;", "Lrt/a;", "endpoint", "<init>", "(Lrt/a;)V", "", "storeId", "", "numberOfOffers", "Lcom/ingka/ikea/instore/datalayer/storeoffers/network/model/StoreOffersRemote;", "b", "(Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "Lqt/a;", "a", "Lrt/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C11716a {

    /* renamed from: a  reason: collision with root package name */
    private final C11846a f100814a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.datalayer.storeoffers.StoreOffersRepositoryImpl", f = "StoreOffersRepositoryImpl.kt", l = {19}, m = "getStoreOffers")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f100815c;

        /* renamed from: d  reason: collision with root package name */
        Object f100816d;

        /* renamed from: e  reason: collision with root package name */
        Object f100817e;

        /* renamed from: f  reason: collision with root package name */
        int f100818f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f100819g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f100820h;

        /* renamed from: i  reason: collision with root package name */
        int f100821i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f100820h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f100819g = obj;
            this.f100821i |= Integer.MIN_VALUE;
            return this.f100820h.a((String) null, 0, this);
        }
    }

    public b(C11846a aVar) {
        C17542s.j(aVar, "endpoint");
        this.f100814a = aVar;
    }

    private final Object b(String str, int i10, C17164e<? super StoreOffersRemote> eVar) {
        Map c10 = X.c();
        c10.put("store-available", "true");
        c10.put("size", String.valueOf(i10));
        c10.put(PlaceTypes.STORE, str);
        return this.f100814a.a(X.b(c10), eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, int r7, dI.C17164e<? super qt.C11816a> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ot.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ot.b$a r0 = (ot.b.a) r0
            int r1 = r0.f100821i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f100821i = r1
            goto L_0x0018
        L_0x0013:
            ot.b$a r0 = new ot.b$a
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f100819g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f100821i
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f100817e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f100816d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f100815c
            ot.b r6 = (ot.b) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            r0.f100815c = r5
            r0.f100816d = r6
            r0.f100817e = r8
            r0.f100818f = r7
            r0.f100821i = r4
            java.lang.Object r1 = r5.b(r6, r7, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            com.ingka.ikea.instore.datalayer.storeoffers.network.model.StoreOffersRemote r1 = (com.ingka.ikea.instore.datalayer.storeoffers.network.model.StoreOffersRemote) r1
            qt.a r6 = r1.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.b.a(java.lang.String, int, dI.e):java.lang.Object");
    }
}
