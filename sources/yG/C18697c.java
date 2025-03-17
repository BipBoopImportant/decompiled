package yG;

import KJ.C15987c;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import com.sugarcube.core.network.models.CatalogCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import nI.r;
import u0.C5968C;
import u0.C5979c;
import u0.C5991o;
import u0.C5993q;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\b\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKJ/c;", "Lcom/sugarcube/core/network/models/CatalogCategory;", "items", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "LXH/N;", "onItemSelected", "c", "(LKJ/c;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yG.c  reason: case insensitive filesystem */
public final class C18697c {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: yG.c$a */
    public static final class a extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f152614c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(1);
            this.f152614c = list;
        }

        public final Object a(int i10) {
            this.f152614c.get(i10);
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lu0/o;", "", "it", "LXH/N;", "a", "(Lu0/o;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: yG.c$b */
    public static final class b extends C17544u implements r<C5991o, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f152615c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l f152616d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List list, C17642l lVar) {
            super(4);
            this.f152615c = list;
            this.f152616d = lVar;
        }

        public final void a(C5991o oVar, int i10, C4889m mVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (mVar.V(oVar) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1229287273, i12, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:498)");
                }
                mVar.W(71657516);
                P.c((CatalogCategory) this.f152615c.get(i10), (d) null, this.f152616d, mVar, 0, 2);
                mVar.P();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5991o) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(KJ.C15987c<com.sugarcube.core.network.models.CatalogCategory> r19, androidx.compose.ui.d r20, nI.C17642l<? super com.sugarcube.core.network.models.CatalogCategory, XH.C16807N> r21, U0.C4889m r22, int r23, int r24) {
        /*
            r1 = r19
            r3 = r21
            r4 = r23
            java.lang.String r0 = "items"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            r0 = 214953607(0xccfee87, float:3.2036958E-31)
            r2 = r22
            U0.m r2 = r2.k(r0)
            r5 = r24 & 1
            r6 = 4
            if (r5 == 0) goto L_0x0021
            r5 = r4 | 6
            goto L_0x0031
        L_0x0021:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0030
            boolean r5 = r2.F(r1)
            if (r5 == 0) goto L_0x002d
            r5 = r6
            goto L_0x002e
        L_0x002d:
            r5 = 2
        L_0x002e:
            r5 = r5 | r4
            goto L_0x0031
        L_0x0030:
            r5 = r4
        L_0x0031:
            r7 = r24 & 2
            if (r7 == 0) goto L_0x003a
            r5 = r5 | 48
        L_0x0037:
            r8 = r20
            goto L_0x004c
        L_0x003a:
            r8 = r4 & 48
            if (r8 != 0) goto L_0x0037
            r8 = r20
            boolean r9 = r2.V(r8)
            if (r9 == 0) goto L_0x0049
            r9 = 32
            goto L_0x004b
        L_0x0049:
            r9 = 16
        L_0x004b:
            r5 = r5 | r9
        L_0x004c:
            r9 = r24 & 4
            r10 = 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0055
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0055:
            r9 = r4 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0064
            boolean r9 = r2.F(r3)
            if (r9 == 0) goto L_0x0061
            r9 = r10
            goto L_0x0063
        L_0x0061:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r5 = r5 | r9
        L_0x0064:
            r9 = r5 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r9 != r11) goto L_0x0078
            boolean r9 = r2.l()
            if (r9 != 0) goto L_0x0071
            goto L_0x0078
        L_0x0071:
            r2.L()
            r18 = r8
            goto L_0x0108
        L_0x0078:
            if (r7 == 0) goto L_0x007f
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r18 = r7
            goto L_0x0081
        L_0x007f:
            r18 = r8
        L_0x0081:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x008d
            r7 = -1
            java.lang.String r8 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.categories.CatalogCategoriesList (CatalogCategoriesList.kt:30)"
            U0.C4895p.S(r0, r5, r7, r8)
        L_0x008d:
            tK.v r0 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r2, r7)
            long r12 = r0.m0()
            r15 = 2
            r16 = 0
            r14 = 0
            r11 = r18
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.d(r11, r12, r14, r15, r16)
            u0.b$a r7 = new u0.b$a
            r7.<init>(r6)
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            float r6 = (float) r6
            float r9 = c2.h.B(r6)
            androidx.compose.foundation.layout.d$f r11 = r8.n(r9)
            float r6 = c2.h.B(r6)
            androidx.compose.foundation.layout.d$f r12 = r8.n(r6)
            r6 = -2140453983(0xffffffff806b43a1, float:-9.850659E-39)
            r2.W(r6)
            boolean r6 = r2.F(r1)
            r5 = r5 & 896(0x380, float:1.256E-42)
            if (r5 != r10) goto L_0x00cb
            r5 = 1
            goto L_0x00cc
        L_0x00cb:
            r5 = 0
        L_0x00cc:
            r5 = r5 | r6
            java.lang.Object r6 = r2.D()
            if (r5 != 0) goto L_0x00db
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00e3
        L_0x00db:
            yG.a r6 = new yG.a
            r6.<init>(r1, r3)
            r2.u(r6)
        L_0x00e3:
            r14 = r6
            nI.l r14 = (nI.C17642l) r14
            r2.P()
            r16 = 1769472(0x1b0000, float:2.479558E-39)
            r17 = 412(0x19c, float:5.77E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r15 = 0
            r5 = r7
            r6 = r0
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r15
            r15 = r2
            u0.C5984h.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0108
            U0.C4895p.R()
        L_0x0108:
            U0.Y0 r6 = r2.n()
            if (r6 == 0) goto L_0x0121
            yG.b r7 = new yG.b
            r0 = r7
            r1 = r19
            r2 = r18
            r3 = r21
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yG.C18697c.c(KJ.c, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C15987c cVar, C17642l lVar, C5968C c10) {
        C17542s.j(c10, "$this$LazyVerticalGrid");
        c10.h(cVar.size(), (C17642l<? super Integer, ? extends Object>) null, (p<? super C5993q, ? super Integer, C5979c>) null, new a(cVar), c.c(1229287273, true, new b(cVar, lVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C15987c cVar, d dVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        c(cVar, dVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
