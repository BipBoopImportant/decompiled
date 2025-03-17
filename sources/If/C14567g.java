package iF;

import E1.I;
import G1.C4504g;
import I0.b1;
import J1.j;
import N1.P;
import OE.n;
import QJ.F0;
import QJ.Q;
import QJ.T;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.y;
import Y1.k;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.CatalogItem;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import java.util.UUID;
import kF.C14683D;
import kF.C14687H;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import lF.C14768a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import s0.C5844O;
import s0.C5862h;
import tK.C18030v;
import u0.C5968C;
import u0.C5972G;
import u0.C5974I;
import u0.C5979c;
import u0.C5991o;
import u0.C5993q;
import wK.C18349h7;
import wK.C18361i7;
import wK.C18385k7;
import wK.C18437p;
import wK.C18476s2;
import wK.C18540x6;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a¡\u0001\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f2$\u0010\u0013\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f2\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LlF/a;", "totalPrice", "LXH/N;", "m", "(LlF/a;LU0/m;I)V", "", "LkF/D;", "productList", "", "favoritesList", "Lu0/I;", "state", "Lkotlin/Function2;", "LQJ/Q;", "LdI/e;", "", "onAddAllItemsToCart", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "", "onAddItemToCart", "Lkotlin/Function1;", "onAddItemToFav", "g", "(LlF/a;Ljava/util/List;Ljava/util/List;Lu0/I;LnI/p;LnI/p;LnI/l;LU0/m;II)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: iF.g  reason: case insensitive filesystem */
public final class C14567g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iF.g$a */
    static final class a implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14768a f127666a;

        a(C14768a aVar) {
            this.f127666a = aVar;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1870229892, i10, -1, "com.sugarcube.app.base.ui.compose.AddToCartSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddToCartSheet.kt:120)");
                }
                C14567g.m(this.f127666a, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.compose.AddToCartSheetKt$AddToCartSheetContent$1$2$1$1", f = "AddToCartSheet.kt", l = {153}, m = "invokeSuspend")
    /* renamed from: iF.g$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f127667c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f127668d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<Q, C17164e<? super C16807N>, Object> f127669e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f127669e = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f127669e, eVar);
            bVar.f127668d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f127667c;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f127668d;
                p<Q, C17164e<? super C16807N>, Object> pVar = this.f127669e;
                this.f127668d = q10;
                this.f127667c = 1;
                if (pVar.invoke(q10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Q q11 = (Q) this.f127668d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: iF.g$c */
    public static final class c extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final c f127670c = new c();

        public c() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(C14683D d10) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: iF.g$d */
    public static final class d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f127671c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f127672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17642l lVar, List list) {
            super(1);
            this.f127671c = lVar;
            this.f127672d = list;
        }

        public final Object a(int i10) {
            return this.f127671c.invoke(this.f127672d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: iF.g$e */
    public static final class e extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f127673c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f127674d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17642l lVar, List list) {
            super(1);
            this.f127673c = lVar;
            this.f127674d = list;
        }

        public final Object a(int i10) {
            return this.f127673c.invoke(this.f127674d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lu0/o;", "", "it", "LXH/N;", "a", "(Lu0/o;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: iF.g$f */
    public static final class f extends C17544u implements r<C5991o, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f127675c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f127676d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l f127677e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f127678f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(List list, p pVar, C17642l lVar, List list2) {
            super(4);
            this.f127675c = list;
            this.f127676d = pVar;
            this.f127677e = lVar;
            this.f127678f = list2;
        }

        public final void a(C5991o oVar, int i10, C4889m mVar, int i11) {
            int i12;
            CatalogItem catalogItem;
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
                    C4895p.S(699646206, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
                }
                C14683D d10 = (C14683D) this.f127675c.get(i10);
                mVar.W(929702417);
                p pVar = this.f127676d;
                C17642l lVar = this.f127677e;
                Iterable iterable = this.f127678f;
                CachedCatalogItem a10 = d10.a();
                C14687H.d((androidx.compose.ui.d) null, d10, pVar, lVar, C16877v.l0(iterable, (a10 == null || (catalogItem = a10.getCatalogItem()) == null) ? null : catalogItem.getLocalItemNumber()), mVar, 0, 1);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(lF.C14768a r36, java.util.List<kF.C14683D> r37, java.util.List<java.lang.String> r38, u0.C5974I r39, nI.p<? super QJ.Q, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r40, nI.p<? super com.sugarcube.app.base.data.database.CachedCatalogItem, ? super dI.C17164e<? super java.lang.Boolean>, ? extends java.lang.Object> r41, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, java.lang.Boolean> r42, U0.C4889m r43, int r44, int r45) {
        /*
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r40
            r10 = r41
            r11 = r44
            java.lang.String r0 = "totalPrice"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "productList"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "favoritesList"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "onAddAllItemsToCart"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "onAddItemToCart"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            r0 = -138515224(0xfffffffff7be6ce8, float:-7.7245725E33)
            r1 = r43
            U0.m r15 = r1.k(r0)
            r1 = r45 & 1
            if (r1 == 0) goto L_0x0035
            r1 = r11 | 6
            goto L_0x0045
        L_0x0035:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x0044
            boolean r1 = r15.V(r6)
            if (r1 == 0) goto L_0x0041
            r1 = 4
            goto L_0x0042
        L_0x0041:
            r1 = 2
        L_0x0042:
            r1 = r1 | r11
            goto L_0x0045
        L_0x0044:
            r1 = r11
        L_0x0045:
            r4 = r45 & 2
            r5 = 16
            if (r4 == 0) goto L_0x004e
            r1 = r1 | 48
            goto L_0x005d
        L_0x004e:
            r4 = r11 & 48
            if (r4 != 0) goto L_0x005d
            boolean r4 = r15.F(r7)
            if (r4 == 0) goto L_0x005b
            r4 = 32
            goto L_0x005c
        L_0x005b:
            r4 = r5
        L_0x005c:
            r1 = r1 | r4
        L_0x005d:
            r4 = r45 & 4
            if (r4 == 0) goto L_0x0064
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0074
        L_0x0064:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0074
            boolean r4 = r15.F(r8)
            if (r4 == 0) goto L_0x0071
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0073
        L_0x0071:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0073:
            r1 = r1 | r4
        L_0x0074:
            r4 = r11 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x008d
            r4 = r45 & 8
            if (r4 != 0) goto L_0x0087
            r4 = r39
            boolean r12 = r15.V(r4)
            if (r12 == 0) goto L_0x0089
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x008b
        L_0x0087:
            r4 = r39
        L_0x0089:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x008b:
            r1 = r1 | r12
            goto L_0x008f
        L_0x008d:
            r4 = r39
        L_0x008f:
            r12 = r45 & 16
            if (r12 == 0) goto L_0x0096
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a6
        L_0x0096:
            r12 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x00a6
            boolean r12 = r15.F(r9)
            if (r12 == 0) goto L_0x00a3
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a3:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r1 = r1 | r12
        L_0x00a6:
            r12 = r45 & 32
            r13 = 196608(0x30000, float:2.75506E-40)
            if (r12 == 0) goto L_0x00ae
            r1 = r1 | r13
            goto L_0x00be
        L_0x00ae:
            r12 = r11 & r13
            if (r12 != 0) goto L_0x00be
            boolean r12 = r15.F(r10)
            if (r12 == 0) goto L_0x00bb
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r1 = r1 | r12
        L_0x00be:
            r12 = r45 & 64
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r12 == 0) goto L_0x00c8
            r1 = r1 | r14
        L_0x00c5:
            r14 = r42
            goto L_0x00da
        L_0x00c8:
            r14 = r14 & r11
            if (r14 != 0) goto L_0x00c5
            r14 = r42
            boolean r16 = r15.F(r14)
            if (r16 == 0) goto L_0x00d6
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r1 = r1 | r16
        L_0x00da:
            r16 = 599187(0x92493, float:8.3964E-40)
            r13 = r1 & r16
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r13 != r2) goto L_0x00f3
            boolean r2 = r15.l()
            if (r2 != 0) goto L_0x00eb
            goto L_0x00f3
        L_0x00eb:
            r15.L()
            r26 = r14
            r6 = r15
            goto L_0x0332
        L_0x00f3:
            r15.G()
            r2 = r11 & 1
            r3 = 3
            r13 = 0
            if (r2 == 0) goto L_0x0112
            boolean r2 = r15.O()
            if (r2 == 0) goto L_0x0103
            goto L_0x0112
        L_0x0103:
            r15.L()
            r2 = r45 & 8
            if (r2 == 0) goto L_0x010c
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x010c:
            r12 = r1
            r25 = r4
        L_0x010f:
            r26 = r14
            goto L_0x012a
        L_0x0112:
            r2 = r45 & 8
            if (r2 == 0) goto L_0x011d
            u0.I r2 = u0.C5975J.b(r13, r13, r15, r13, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x011e
        L_0x011d:
            r2 = r4
        L_0x011e:
            if (r12 == 0) goto L_0x0126
            r12 = r1
            r25 = r2
            r26 = 0
            goto L_0x012a
        L_0x0126:
            r12 = r1
            r25 = r2
            goto L_0x010f
        L_0x012a:
            r15.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0139
            r1 = -1
            java.lang.String r2 = "com.sugarcube.app.base.ui.compose.AddToCartSheetContent (AddToCartSheet.kt:99)"
            U0.C4895p.S(r0, r12, r1, r2)
        L_0x0139:
            java.lang.Object r0 = r15.D()
            U0.m$a r27 = U0.C4889m.f14007a
            java.lang.Object r1 = r27.a()
            if (r0 != r1) goto L_0x0154
            dI.j r0 = dI.C17169j.f142968a
            QJ.Q r0 = U0.P.k(r0, r15)
            U0.B r1 = new U0.B
            r1.<init>(r0)
            r15.u(r1)
            r0 = r1
        L_0x0154:
            U0.B r0 = (U0.B) r0
            QJ.Q r14 = r0.a()
            r0 = 6
            sF.j.c(r0, r15, r0)
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            float r5 = (float) r5
            float r0 = c2.h.B(r5)
            r1 = 0
            r2 = 2
            r3 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r4, r0, r1, r2, r3)
            i1.c$a r28 = i1.C5437c.f24302a
            i1.c r1 = r28.o()
            E1.I r1 = androidx.compose.foundation.layout.C5077h.h(r1, r13)
            int r2 = U0.C4883j.a(r15, r13)
            U0.y r3 = r15.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r15, r0)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r13 = r19.a()
            U0.f r21 = r15.m()
            if (r21 != 0) goto L_0x0191
            U0.C4883j.c()
        L_0x0191:
            r15.I()
            boolean r21 = r15.i()
            if (r21 == 0) goto L_0x019e
            r15.p(r13)
            goto L_0x01a1
        L_0x019e:
            r15.t()
        L_0x01a1:
            U0.m r13 = U0.F1.a(r15)
            r39 = r4
            nI.p r4 = r19.c()
            U0.F1.c(r13, r1, r4)
            nI.p r1 = r19.e()
            U0.F1.c(r13, r3, r1)
            nI.p r1 = r19.b()
            boolean r3 = r13.i()
            if (r3 != 0) goto L_0x01cd
            java.lang.Object r3 = r13.D()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 != 0) goto L_0x01db
        L_0x01cd:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r13.u(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r13.w(r2, r1)
        L_0x01db:
            nI.p r1 = r19.d()
            U0.F1.c(r13, r0, r1)
            androidx.compose.foundation.layout.j r13 = androidx.compose.foundation.layout.C5079j.f18125a
            u0.b$a r4 = new u0.b$a
            r0 = 2
            r4.<init>(r0)
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            float r1 = c2.h.B(r5)
            androidx.compose.foundation.layout.d$f r17 = r0.n(r1)
            float r1 = c2.h.B(r5)
            androidx.compose.foundation.layout.d$f r19 = r0.n(r1)
            float r32 = c2.h.B(r5)
            r33 = 7
            r34 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            s0.E r21 = androidx.compose.foundation.layout.D.e(r29, r30, r31, r32, r33, r34)
            r0 = 1634237950(0x61687dfe, float:2.680452E20)
            r15.W(r0)
            r0 = r12 & 14
            r1 = 1
            r2 = 4
            if (r0 != r2) goto L_0x021c
            r0 = r1
            goto L_0x021d
        L_0x021c:
            r0 = 0
        L_0x021d:
            boolean r2 = r15.F(r7)
            r0 = r0 | r2
            boolean r2 = r15.F(r10)
            r0 = r0 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r12
            r3 = 1048576(0x100000, float:1.469368E-39)
            if (r2 != r3) goto L_0x022f
            goto L_0x0230
        L_0x022f:
            r1 = 0
        L_0x0230:
            r0 = r0 | r1
            boolean r1 = r15.F(r8)
            r0 = r0 | r1
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x024c
            java.lang.Object r0 = r27.a()
            if (r1 != r0) goto L_0x0243
            goto L_0x024c
        L_0x0243:
            r35 = r39
            r18 = r4
            r29 = r5
            r16 = 3
            goto L_0x0269
        L_0x024c:
            iF.a r3 = new iF.a
            r0 = r3
            r1 = r37
            r2 = r36
            r6 = r3
            r16 = 3
            r3 = r41
            r35 = r39
            r18 = r4
            r4 = r26
            r29 = r5
            r5 = r38
            r0.<init>(r1, r2, r3, r4, r5)
            r15.u(r6)
            r1 = r6
        L_0x0269:
            r0 = r1
            nI.l r0 = (nI.C17642l) r0
            r15.P()
            int r1 = r12 >> 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r2 = 1772544(0x1b0c00, float:2.483863E-39)
            r23 = r1 | r2
            r24 = 402(0x192, float:5.63E-43)
            r1 = 0
            r16 = 0
            r2 = 0
            r3 = 0
            r12 = r18
            r5 = r13
            r4 = 0
            r13 = r1
            r1 = r14
            r14 = r25
            r6 = r15
            r15 = r21
            r18 = r19
            r19 = r2
            r20 = r3
            r21 = r0
            r22 = r6
            u0.C5984h.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            int r0 = OE.n.f113301W1
            java.lang.String r0 = J1.j.b(r0, r6, r4)
            boolean r2 = r25.c()
            if (r2 != 0) goto L_0x02a5
        L_0x02a3:
            r12 = r0
            goto L_0x02be
        L_0x02a5:
            java.lang.String r2 = r36.f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "    "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            goto L_0x02a3
        L_0x02be:
            i1.c r0 = r28.n()
            r2 = r35
            androidx.compose.ui.d r13 = r5.a(r2, r0)
            float r15 = c2.h.B(r29)
            float r14 = c2.h.B(r29)
            r18 = 12
            r19 = 0
            r16 = 0
            r17 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r13, r14, r15, r16, r17, r18, r19)
            r2 = 1056964608(0x3f000000, float:0.5)
            androidx.compose.ui.d r13 = androidx.compose.foundation.layout.J.g(r0, r2)
            wK.l0$b r15 = wK.C18390l0.b.f151150b
            r0 = 1634281254(0x61692726, float:2.6880702E20)
            r6.W(r0)
            boolean r0 = r6.F(r1)
            boolean r2 = r6.F(r9)
            r0 = r0 | r2
            java.lang.Object r2 = r6.D()
            if (r0 != 0) goto L_0x02ff
            java.lang.Object r0 = r27.a()
            if (r2 != r0) goto L_0x0307
        L_0x02ff:
            iF.b r2 = new iF.b
            r2.<init>(r1, r9)
            r6.u(r2)
        L_0x0307:
            r21 = r2
            nI.a r21 = (nI.C17631a) r21
            r6.P()
            int r0 = wK.C18390l0.b.f151151c
            int r23 = r0 << 9
            r24 = 500(0x1f4, float:7.0E-43)
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = r6
            wK.C18342h0.f(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r6.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0330
            U0.C4895p.R()
        L_0x0330:
            r4 = r25
        L_0x0332:
            U0.Y0 r12 = r6.n()
            if (r12 == 0) goto L_0x0351
            iF.c r13 = new iF.c
            r0 = r13
            r1 = r36
            r2 = r37
            r3 = r38
            r5 = r40
            r6 = r41
            r7 = r26
            r8 = r44
            r9 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.a(r13)
        L_0x0351:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iF.C14567g.g(lF.a, java.util.List, java.util.List, u0.I, nI.p, nI.p, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C14768a aVar, List list, List list2, C5974I i10, p pVar, p pVar2, C17642l lVar, int i11, int i12, C4889m mVar, int i13) {
        g(aVar, list, list2, i10, pVar, pVar2, lVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(List list, C14768a aVar, p pVar, C17642l lVar, List list2, C5968C c10) {
        C17542s.j(c10, "$this$LazyVerticalGrid");
        C5968C.f(c10, (Object) null, new C14564d(), (Object) null, c1.c.c(-1870229892, true, new a(aVar)), 5, (Object) null);
        C5968C c11 = c10;
        c11.h(list.size(), new d(new C14565e(), list), (p<? super C5993q, ? super Integer, C5979c>) null, new e(c.f127670c, list), c1.c.c(699646206, true, new f(list, pVar, lVar, list2)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C5979c j(C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(qVar.a()));
    }

    /* access modifiers changed from: private */
    public static final Object k(C14683D d10) {
        C17542s.j(d10, "it");
        UUID d11 = d10.d();
        C17542s.i(d11, "<get-key>(...)");
        return d11;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(Q q10, p pVar) {
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new b(pVar, (C17164e<? super b>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    public static final void m(C14768a aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C14768a aVar2 = aVar;
        int i12 = i10;
        C17542s.j(aVar2, "totalPrice");
        C4889m k10 = mVar.k(218243846);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(aVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(218243846, i11, -1, "com.sugarcube.app.base.ui.compose.AddToCartSheetHeader (AddToCartSheet.kt:67)");
            }
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d h10 = J.h(D.k(aVar3, 0.0f, h.B((float) 16), 1, (Object) null), 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, h10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar4.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar4.c());
            F1.c(a13, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b10 = aVar4.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar4.d());
            C5862h hVar = C5862h.f28810a;
            C4889m mVar3 = k10;
            b1.b(j.b(n.f113238L4, k10, 0), (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, C18030v.f147664a.b(k10, C18030v.f147665b).c().c(), mVar3, 0, 0, 65534);
            C4889m mVar4 = mVar3;
            C5844O.a(D.k(aVar3, 0.0f, h.B((float) 1), 1, (Object) null), mVar4, 6);
            mVar2 = mVar4;
            C18540x6.f(aVar.e(), aVar.d(), aVar.a(), aVar.c(), C18349h7.Size600, (C18385k7) null, aVar.b(), C18361i7.SingleSize, (String) null, (androidx.compose.ui.d) null, (C18437p) null, (C18437p) null, (String) null, (String) null, (C18476s2) null, mVar2, 12607488, 0, 32544);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C14566f(aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C14768a aVar, int i10, C4889m mVar, int i11) {
        m(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
