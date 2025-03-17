package RF;

import XH.x;
import com.sugarcube.app.base.data.source.VariantsRepository;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LRF/r;", "", "Lcom/sugarcube/app/base/data/source/VariantsRepository;", "variantsRepository", "<init>", "(Lcom/sugarcube/app/base/data/source/VariantsRepository;)V", "", "itemId", "LXH/x;", "Lcom/sugarcube/core/network/models/CatalogItemVariants;", "a", "(ILdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/data/source/VariantsRepository;", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final VariantsRepository f115596a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.internal.shared.VariantsUseCase", f = "VariantsUseCase.kt", l = {24}, m = "execute-gIAlu-s")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f115597c;

        /* renamed from: d  reason: collision with root package name */
        Object f115598d;

        /* renamed from: e  reason: collision with root package name */
        int f115599e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f115600f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ r f115601g;

        /* renamed from: h  reason: collision with root package name */
        int f115602h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f115601g = rVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f115600f = obj;
            this.f115602h |= Integer.MIN_VALUE;
            Object a10 = this.f115601g.a(0, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public r(VariantsRepository variantsRepository) {
        C17542s.j(variantsRepository, "variantsRepository");
        this.f115596a = variantsRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r6, dI.C17164e<? super XH.x<com.sugarcube.core.network.models.CatalogItemVariants>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof RF.r.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            RF.r$a r0 = (RF.r.a) r0
            int r1 = r0.f115602h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f115602h = r1
            goto L_0x0018
        L_0x0013:
            RF.r$a r0 = new RF.r$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f115600f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f115602h
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f115598d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f115597c
            RF.r r6 = (RF.r) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0053
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            XH.y.b(r1)
            com.sugarcube.app.base.data.source.VariantsRepository r1 = r5.f115596a
            r0.f115597c = r5
            r0.f115598d = r7
            r0.f115599e = r6
            r0.f115602h = r4
            java.lang.Object r6 = r1.m28fetchVariantsForItemgIAlus(r6, r0)
            if (r6 != r2) goto L_0x0053
            return r2
        L_0x0053:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: RF.r.a(int, dI.e):java.lang.Object");
    }
}
