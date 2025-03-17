package Xy;

import Ty.c;
import YH.C16877v;
import com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.endpoint.FullServePickupWaitingTimeResponse;
import com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.endpoint.FullServeWaitingTimeRequest;
import dI.C17164e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LXy/d;", "LXy/c;", "LVy/a;", "endpoint", "<init>", "(LVy/a;)V", "", "LTy/a;", "Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServeWaitingTimeRequest;", "b", "(Ljava/util/List;)Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServeWaitingTimeRequest;", "Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServePickupWaitingTimeResponse;", "LTy/c;", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServePickupWaitingTimeResponse;)LTy/c;", "", "storeId", "items", "a", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LVy/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Vy.a f117864a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.source.FullServePickupWaitingTimeRemoteDataSourceImpl", f = "FullServePickupWaitingTimeRemoteDataSourceImpl.kt", l = {21}, m = "fetch")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f117865c;

        /* renamed from: d  reason: collision with root package name */
        Object f117866d;

        /* renamed from: e  reason: collision with root package name */
        Object f117867e;

        /* renamed from: f  reason: collision with root package name */
        Object f117868f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f117869g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f117870h;

        /* renamed from: i  reason: collision with root package name */
        int f117871i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f117870h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f117869g = obj;
            this.f117871i |= Integer.MIN_VALUE;
            return this.f117870h.a((String) null, (List<Ty.a>) null, this);
        }
    }

    public d(Vy.a aVar) {
        C17542s.j(aVar, "endpoint");
        this.f117864a = aVar;
    }

    private final FullServeWaitingTimeRequest b(List<Ty.a> list) {
        Iterable<Ty.a> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (Ty.a aVar : iterable) {
            arrayList.add(new FullServeWaitingTimeRequest.FullServeWaitingTimeItem(aVar.a(), aVar.b()));
        }
        return new FullServeWaitingTimeRequest(arrayList);
    }

    private final c c(FullServePickupWaitingTimeResponse fullServePickupWaitingTimeResponse) {
        if (fullServePickupWaitingTimeResponse != null) {
            return new c(fullServePickupWaitingTimeResponse.b(), fullServePickupWaitingTimeResponse.a());
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, java.util.List<Ty.a> r7, dI.C17164e<? super Ty.c> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof Xy.d.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Xy.d$a r0 = (Xy.d.a) r0
            int r1 = r0.f117871i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f117871i = r1
            goto L_0x0018
        L_0x0013:
            Xy.d$a r0 = new Xy.d$a
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f117869g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f117871i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f117868f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f117867e
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r0.f117866d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f117865c
            Xy.d r6 = (Xy.d) r6
            XH.y.b(r1)
            goto L_0x005c
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            Vy.a r1 = r5.f117864a
            com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.endpoint.FullServeWaitingTimeRequest r3 = r5.b(r7)
            r0.f117865c = r5
            r0.f117866d = r6
            r0.f117867e = r7
            r0.f117868f = r8
            r0.f117871i = r4
            java.lang.Object r1 = r1.a(r6, r3, r0)
            if (r1 != r2) goto L_0x005b
            return r2
        L_0x005b:
            r6 = r5
        L_0x005c:
            QL.x r1 = (QL.x) r1
            boolean r7 = r1.e()
            r8 = 0
            if (r7 == 0) goto L_0x0071
            java.lang.Object r7 = r1.a()
            com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.endpoint.FullServePickupWaitingTimeResponse r7 = (com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.endpoint.FullServePickupWaitingTimeResponse) r7
            if (r7 == 0) goto L_0x0071
            Ty.c r8 = r6.c(r7)
        L_0x0071:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Xy.d.a(java.lang.String, java.util.List, dI.e):java.lang.Object");
    }
}
