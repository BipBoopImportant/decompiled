package YG;

import JG.C15929K;
import KJ.C15987c;
import MG.C16038g;
import NG.C16093b;
import OE.q;
import OG.l0;
import OG.s0;
import OG.t0;
import OG.u0;
import OG.v0;
import PG.C16186d;
import RF.r;
import SG.C16415m;
import TJ.C16505B;
import UG.C16569f;
import VG.C16653f;
import XG.C16793h;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.decorate.v2.internal.ui.toolbars.variants.VariantsViewModel;
import dI.C17164e;
import kG.C17497c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import lF.C14768a;
import uG.C18048l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LYG/m;", "Lcom/sugarcube/decorate/v2/internal/ui/toolbars/variants/VariantsViewModel;", "LRF/r;", "variantsUseCase", "LOE/q;", "sugarcube", "LNG/b;", "stateHolder", "<init>", "(LRF/r;LOE/q;LNG/b;)V", "LYG/l;", "new", "LXH/N;", "a", "(LYG/l;)V", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "cachedCatalogItem", "fetchVariants", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LdI/e;)Ljava/lang/Object;", "", "price", "LlF/a;", "getFormattedPrice", "(F)LlF/a;", "LRF/r;", "b", "LOE/q;", "getSugarcube", "()LOE/q;", "c", "LNG/b;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements VariantsViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final r f140405a;

    /* renamed from: b  reason: collision with root package name */
    private final q f140406b;

    /* renamed from: c  reason: collision with root package name */
    private final C16093b f140407c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.toolbars.variants.VariantsViewModelImpl", f = "VariantsViewModel.kt", l = {39}, m = "fetchVariants")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f140408c;

        /* renamed from: d  reason: collision with root package name */
        Object f140409d;

        /* renamed from: e  reason: collision with root package name */
        Object f140410e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f140411f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ m f140412g;

        /* renamed from: h  reason: collision with root package name */
        int f140413h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f140412g = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f140411f = obj;
            this.f140413h |= Integer.MIN_VALUE;
            return this.f140412g.fetchVariants((CachedCatalogItem) null, this);
        }
    }

    public m(r rVar, q qVar, C16093b bVar) {
        C17542s.j(rVar, "variantsUseCase");
        C17542s.j(qVar, "sugarcube");
        C17542s.j(bVar, "stateHolder");
        this.f140405a = rVar;
        this.f140406b = qVar;
        this.f140407c = bVar;
    }

    private final void a(l lVar) {
        C16505B<l0> a10 = this.f140407c.a();
        C16505B<l0> b10 = a10;
        b10.setValue(l0.b(this.f140407c.a().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, lVar, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134152191, (Object) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchVariants(com.sugarcube.app.base.data.database.CachedCatalogItem r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof YG.m.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            YG.m$a r0 = (YG.m.a) r0
            int r1 = r0.f140413h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f140413h = r1
            goto L_0x0018
        L_0x0013:
            YG.m$a r0 = new YG.m$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f140411f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f140413h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f140410e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f140409d
            com.sugarcube.app.base.data.database.CachedCatalogItem r6 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r6
            java.lang.Object r7 = r0.f140408c
            YG.m r7 = (YG.m) r7
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r0 = r1.j()
            goto L_0x005c
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            RF.r r1 = r5.f140405a
            int r3 = r6.getId()
            r0.f140408c = r5
            r0.f140409d = r6
            r0.f140410e = r7
            r0.f140413h = r4
            java.lang.Object r0 = r1.a(r3, r0)
            if (r0 != r2) goto L_0x005b
            return r2
        L_0x005b:
            r7 = r5
        L_0x005c:
            java.lang.Throwable r1 = XH.x.e(r0)
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x007e
            com.sugarcube.core.network.models.CatalogItemVariants r0 = (com.sugarcube.core.network.models.CatalogItemVariants) r0
            java.util.List r0 = r0.getCategories()
            if (r0 == 0) goto L_0x0073
            FG.p$c r1 = FG.p.f134368b
            FG.k r6 = r1.a(r0, r6)
            goto L_0x0074
        L_0x0073:
            r6 = r3
        L_0x0074:
            YG.l$b r0 = new YG.l$b
            r1 = 2
            r0.<init>(r6, r2, r1, r3)
            r7.a(r0)
            goto L_0x0083
        L_0x007e:
            YG.l$a r6 = YG.l.a.f140401a
            r7.a(r6)
        L_0x0083:
            NG.b r6 = r7.f140407c
            TJ.B r6 = r6.a()
            java.lang.Object r6 = r6.getValue()
            OG.l0 r6 = (OG.l0) r6
            YG.l r6 = r6.u()
            boolean r0 = r6 instanceof YG.l.b
            if (r0 == 0) goto L_0x009b
            r0 = r6
            YG.l$b r0 = (YG.l.b) r0
            goto L_0x009c
        L_0x009b:
            r0 = r3
        L_0x009c:
            if (r0 == 0) goto L_0x00a7
            YG.l$b r6 = (YG.l.b) r6
            YG.l$b r6 = YG.l.b.b(r6, r3, r2, r4, r3)
            r7.a(r6)
        L_0x00a7:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: YG.m.fetchVariants(com.sugarcube.app.base.data.database.CachedCatalogItem, dI.e):java.lang.Object");
    }

    public C14768a getFormattedPrice(float f10) {
        return new C14768a(String.valueOf(f10), this.f140406b.getCountry(), this.f140406b.getLanguage(), true, true);
    }
}
