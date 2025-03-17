package OG;

import E1.I;
import G1.C4504g;
import JG.C15929K;
import KG.C15981d;
import KG.C15982e;
import KJ.C15987c;
import LG.C16006c;
import MG.C16038g;
import PG.C16185c;
import QJ.Q;
import RF.k;
import SG.C16404b;
import SG.C16415m;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4892n0;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import UG.C16569f;
import VG.C16653f;
import XH.C16807N;
import XH.v;
import XH.y;
import YG.l;
import YH.C16877v;
import androidx.compose.animation.i;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c2.h;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.common.R;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.decorate.v2.internal.DecorateEngineController;
import com.sugarcube.decorate.v2.internal.manager.touch.TouchManager;
import com.sugarcube.decorate.v2.internal.ui.surface.a;
import com.sugarcube.decorate_engine.DecorateEngine;
import dI.C17164e;
import e.C5281d;
import eI.C17187b;
import i1.C5437c;
import kG.C17497c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.C5507b;
import lF.C14768a;
import m0.N;
import mG.C17597b;
import nG.C17621a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5668h;
import o1.C5673m;
import o1.C5674n;
import p1.C5728l0;
import p1.C5747v0;
import p1.C5749w0;
import p1.i1;
import s0.C5852X;
import s0.C5857c;
import sF.j;
import sG.r;
import uG.C18048l;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a­\u0001\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f0\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u001e\u001a\u00020\u0011*\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a-\u0010 \u001a\u00020\u00112\u001c\u0010\u0001\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f0\bH\u0003¢\u0006\u0004\b \u0010!\u001a5\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u0002H\u0003¢\u0006\u0004\b$\u0010%\u001ac\u0010/\u001a\u00020\u0011*\u00020\u001b2\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u0002H\u0003¢\u0006\u0004\b/\u00100\u001a+\u00101\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u0002H\u0003¢\u0006\u0004\b1\u00102\u001aO\u00107\u001a\u00020\u00112\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0003¢\u0006\u0004\b7\u00108\u001a\u0001\u0010@\u001a\u00020\u0011*\u00020\u001b2\u0006\u0010\u0001\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u00010:2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010?\u001a\u00020\"2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u0002H\u0003¢\u0006\u0004\b@\u0010A\u001aC\u0010F\u001a\u00020\u0011*\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010B2\b\u0010E\u001a\u0004\u0018\u00010D2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u0002H\u0003¢\u0006\u0004\bF\u0010G\u001aC\u0010N\u001a\u00020\u00112\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00152\b\b\u0002\u0010K\u001a\u00020J2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010LH\u0003¢\u0006\u0004\bN\u0010O\u001ae\u0010P\u001a\u00020\u00112\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010?\u001a\u00020\"2\b\u0010\u0001\u001a\u0004\u0018\u0001092\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u0002H\u0003¢\u0006\u0004\bP\u0010Q\u001a5\u0010V\u001a\u00020\u00112\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010U\u001a\u00020T2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u0002H\u0003¢\u0006\u0004\bV\u0010W\u001aQ\u0010Y\u001a\u00020\u00112\b\u0010\u0001\u001a\u0004\u0018\u00010X2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u0002H\u0003¢\u0006\u0004\bY\u0010Z¨\u0006^²\u0006\u000e\u0010[\u001a\u00020\"8\n@\nX\u0002²\u0006\u000e\u0010\\\u001a\u00020\"8\n@\nX\u0002²\u0006\u000e\u0010]\u001a\u00020\u00038\n@\nX\u0002"}, d2 = {"LOG/l0;", "state", "Lkotlin/Function1;", "", "LlF/a;", "getFormattedPrice", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;", "decorateEngineController", "LU0/A1;", "LXH/v;", "Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;", "Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineState;", "renderingState", "Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;", "touchManager", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "LXH/N;", "onAddItemToFav", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "onEvent", "Lkotlin/Function0;", "onLogin", "onSignUp", "onBack", "a0", "(LOG/l0;LnI/l;Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;LU0/A1;Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;LnI/l;LnI/l;LnI/a;LnI/a;LnI/a;LU0/m;I)V", "Ls0/c;", "Landroidx/compose/ui/d;", "modifier", "m0", "(Ls0/c;Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;Landroidx/compose/ui/d;LU0/m;II)V", "k0", "(LU0/A1;LU0/m;I)V", "", "show", "V", "(ZLandroidx/compose/ui/d;LnI/l;LU0/m;II)V", "isFocusModeActive", "duplicateOptionEnabled", "isRotating", "showEmptyToolbar", "showViewsButton", "LmG/b;", "selectedInstance", "LVG/f;", "multiviewToolbarState", "g0", "(Ls0/c;ZZZZZLmG/b;LVG/f;LnI/l;LU0/m;I)V", "H0", "(LmG/b;LnI/l;LU0/m;I)V", "LJG/K;", "dialogUiState", "LMG/g;", "statusDialogUiState", "Q", "(LJG/K;LMG/g;LnI/l;LnI/a;LnI/a;LU0/m;I)V", "LOG/u0;", "LYG/l;", "variantsState", "LKJ/c;", "", "shoppingListItems", "favoritesEnabled", "o0", "(Ls0/c;LOG/u0;LYG/l;LnI/l;LKJ/c;LmG/b;ZLnI/l;LnI/l;LU0/m;II)V", "LUG/f;", "magicEraserState", "LSG/m;", "wallColorPickerState", "x0", "(Ls0/c;LOG/l0;LUG/f;LSG/m;LnI/l;LU0/m;I)V", "close", "content", "LKG/g;", "openDirection", "LKG/f;", "occludingOffset", "d0", "(LnI/a;LnI/p;LKG/g;LKG/f;LU0/m;II)V", "t0", "(LKJ/c;LmG/b;ZLOG/u0;LnI/l;LnI/l;LU0/m;II)V", "LuG/l;", "browseState", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "L", "(LuG/l;Lcom/sugarcube/core/network/models/RoomType;LnI/l;LU0/m;I)V", "LsG/r;", "O", "(LsG/r;LKJ/c;LnI/l;LnI/l;LU0/m;I)V", "showing", "isGestureTriggered", "currentRotation", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class P {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C18048l f136700a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoomType f136701b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> f136702c;

        a(C18048l lVar, RoomType roomType, C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar2) {
            this.f136700a = lVar;
            this.f136701b = roomType;
            this.f136702c = lVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
            C17542s.j(cachedCatalogItem, "selectedItem");
            lVar.invoke(new a.N(cachedCatalogItem));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
            C17542s.j(cachedCatalogItem, "item");
            lVar.invoke(new a.C17128h(cachedCatalogItem));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C17642l lVar) {
            lVar.invoke(a.C17131k.f142627a);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(U0.C4889m r14, int r15) {
            /*
                r13 = this;
                r0 = r15 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0011
                boolean r0 = r14.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0011
            L_0x000c:
                r14.L()
                goto L_0x00b5
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.BrowseDrawerSection.<anonymous>.<anonymous> (DecorateSurface.kt:726)"
                r2 = -1285626161(0xffffffffb35ee6cf, float:-5.1898322E-8)
                U0.C4895p.S(r2, r15, r0, r1)
            L_0x0020:
                uG.l r3 = r13.f136700a
                com.sugarcube.core.network.models.RoomType r4 = r13.f136701b
                r15 = 1424402543(0x54e6a86f, float:7.9253466E12)
                r14.W(r15)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r15 = r13.f136702c
                boolean r15 = r14.V(r15)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r0 = r13.f136702c
                java.lang.Object r1 = r14.D()
                if (r15 != 0) goto L_0x0040
                U0.m$a r15 = U0.C4889m.f14007a
                java.lang.Object r15 = r15.a()
                if (r1 != r15) goto L_0x0048
            L_0x0040:
                OG.M r1 = new OG.M
                r1.<init>(r0)
                r14.u(r1)
            L_0x0048:
                r5 = r1
                nI.l r5 = (nI.C17642l) r5
                r14.P()
                r15 = 1424408036(0x54e6bde4, float:7.9282265E12)
                r14.W(r15)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r15 = r13.f136702c
                boolean r15 = r14.V(r15)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r0 = r13.f136702c
                java.lang.Object r1 = r14.D()
                if (r15 != 0) goto L_0x006a
                U0.m$a r15 = U0.C4889m.f14007a
                java.lang.Object r15 = r15.a()
                if (r1 != r15) goto L_0x0072
            L_0x006a:
                OG.N r1 = new OG.N
                r1.<init>(r0)
                r14.u(r1)
            L_0x0072:
                r6 = r1
                nI.l r6 = (nI.C17642l) r6
                r14.P()
                r15 = 1424412685(0x54e6d00d, float:7.9306639E12)
                r14.W(r15)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r15 = r13.f136702c
                boolean r15 = r14.V(r15)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r0 = r13.f136702c
                java.lang.Object r1 = r14.D()
                if (r15 != 0) goto L_0x0094
                U0.m$a r15 = U0.C4889m.f14007a
                java.lang.Object r15 = r15.a()
                if (r1 != r15) goto L_0x009c
            L_0x0094:
                OG.O r1 = new OG.O
                r1.<init>(r0)
                r14.u(r1)
            L_0x009c:
                r7 = r1
                nI.a r7 = (nI.C17631a) r7
                r14.P()
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r8 = r13.f136702c
                r11 = 0
                r12 = 64
                r9 = 0
                r10 = r14
                tG.m.m(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r14 = U0.C4895p.J()
                if (r14 == 0) goto L_0x00b5
                U0.C4895p.R()
            L_0x00b5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: OG.P.a.e(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            e((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f136703a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15987c<String> f136704b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<CachedCatalogItem, C16807N> f136705c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> f136706d;

        b(r rVar, C15987c<String> cVar, C17642l<? super CachedCatalogItem, C16807N> lVar, C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar2) {
            this.f136703a = rVar;
            this.f136704b = cVar;
            this.f136705c = lVar;
            this.f136706d = lVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar) {
            lVar.invoke(a.C17132l.f142628a);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r11, int r12) {
            /*
                r10 = this;
                r0 = r12 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0010
                boolean r0 = r11.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0010
            L_0x000c:
                r11.L()
                goto L_0x005e
            L_0x0010:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x001f
                r0 = -1
                java.lang.String r1 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.CartDrawerSection.<anonymous> (DecorateSurface.kt:771)"
                r2 = -1571030485(0xffffffffa25bfa2b, float:-2.9812472E-18)
                U0.C4895p.S(r2, r12, r0, r1)
            L_0x001f:
                sG.r r3 = r10.f136703a
                if (r3 != 0) goto L_0x0024
                goto L_0x0055
            L_0x0024:
                KJ.c<java.lang.String> r4 = r10.f136704b
                nI.l<com.sugarcube.app.base.data.database.CachedCatalogItem, XH.N> r5 = r10.f136705c
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r6 = r10.f136706d
                r12 = 1756196397(0x68ad6e2d, float:6.552014E24)
                r11.W(r12)
                boolean r12 = r11.V(r6)
                java.lang.Object r0 = r11.D()
                if (r12 != 0) goto L_0x0042
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r0 != r12) goto L_0x004a
            L_0x0042:
                OG.Q r0 = new OG.Q
                r0.<init>(r6)
                r11.u(r0)
            L_0x004a:
                r7 = r0
                nI.a r7 = (nI.C17631a) r7
                r11.P()
                r9 = 0
                r8 = r11
                sG.p.s(r3, r4, r5, r6, r7, r8, r9)
            L_0x0055:
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x005e
                U0.C4895p.R()
            L_0x005e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: OG.P.b.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f136707a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> f136708b;

        c(C4899r0<Boolean> r0Var, C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar) {
            this.f136707a = r0Var;
            this.f136708b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar, C4899r0 r0Var, C16006c cVar) {
            C17542s.j(cVar, "smileRating");
            P.Z(r0Var, false);
            lVar.invoke(new a.A(cVar.c()));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar, C4899r0 r0Var) {
            P.Z(r0Var, false);
            lVar.invoke(a.C17146z.f142642a);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(l0.e r8, U0.C4889m r9, int r10) {
            /*
                r7 = this;
                java.lang.String r0 = "$this$AnimatedVisibility"
                kotlin.jvm.internal.C17542s.j(r8, r0)
                boolean r8 = U0.C4895p.J()
                if (r8 == 0) goto L_0x0014
                r8 = -1
                java.lang.String r0 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.DecorateSmileFeedback.<anonymous> (DecorateSurface.kt:311)"
                r1 = 1424045114(0x54e1343a, float:7.7379509E12)
                U0.C4895p.S(r1, r10, r8, r0)
            L_0x0014:
                androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
                r10 = 400(0x190, float:5.6E-43)
                float r10 = (float) r10
                float r10 = c2.h.B(r10)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.y(r8, r10)
                r8 = 1498063171(0x594aa143, float:3.5647034E15)
                r9.W(r8)
                U0.r0<java.lang.Boolean> r8 = r7.f136707a
                boolean r8 = r9.V(r8)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r10 = r7.f136708b
                boolean r10 = r9.V(r10)
                r8 = r8 | r10
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r10 = r7.f136708b
                U0.r0<java.lang.Boolean> r0 = r7.f136707a
                java.lang.Object r2 = r9.D()
                if (r8 != 0) goto L_0x0046
                U0.m$a r8 = U0.C4889m.f14007a
                java.lang.Object r8 = r8.a()
                if (r2 != r8) goto L_0x004e
            L_0x0046:
                OG.S r2 = new OG.S
                r2.<init>(r10, r0)
                r9.u(r2)
            L_0x004e:
                r0 = r2
                nI.l r0 = (nI.C17642l) r0
                r9.P()
                r8 = 1498068833(0x594ab761, float:3.56622328E15)
                r9.W(r8)
                U0.r0<java.lang.Boolean> r8 = r7.f136707a
                boolean r8 = r9.V(r8)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r10 = r7.f136708b
                boolean r10 = r9.V(r10)
                r8 = r8 | r10
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r10 = r7.f136708b
                U0.r0<java.lang.Boolean> r2 = r7.f136707a
                java.lang.Object r3 = r9.D()
                if (r8 != 0) goto L_0x0079
                U0.m$a r8 = U0.C4889m.f14007a
                java.lang.Object r8 = r8.a()
                if (r3 != r8) goto L_0x0081
            L_0x0079:
                OG.T r3 = new OG.T
                r3.<init>(r10, r2)
                r9.u(r3)
            L_0x0081:
                nI.a r3 = (nI.C17631a) r3
                r9.P()
                r5 = 48
                r6 = 4
                r2 = 0
                r4 = r9
                LG.i.i(r0, r1, r2, r3, r4, r5, r6)
                boolean r8 = U0.C4895p.J()
                if (r8 == 0) goto L_0x0097
                U0.C4895p.R()
            L_0x0097:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: OG.P.c.c(l0.e, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f136709a;

        d(p<? super C4889m, ? super Integer, C16807N> pVar) {
            this.f136709a = pVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1233852291, i10, -1, "com.sugarcube.decorate.v2.internal.ui.surface.composable.DrawerSection.<anonymous> (DecorateSurface.kt:668)");
                }
                p<C4889m, Integer, C16807N> pVar = this.f136709a;
                if (pVar != null) {
                    pVar.invoke(mVar, 0);
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements nI.r<C5507b, C17621a, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f136710a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f136711b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Float, C14768a> f136712c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> f136713d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17597b f136714e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f136715f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C15987c<String> f136716g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f136717h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ u0 f136718i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<CachedCatalogItem, C16807N> f136719j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17597b f136720a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> f136721b;

            a(C17597b bVar, C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar) {
                this.f136720a = bVar;
                this.f136721b = lVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N h(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
                C17542s.j(cachedCatalogItem, "selectedItem");
                lVar.invoke(new a.Z(cachedCatalogItem));
                lVar.invoke(a.X.f142604a);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N i(C17642l lVar) {
                lVar.invoke(a.X.f142604a);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N j(C17642l lVar) {
                lVar.invoke(a.a0.f142608a);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N k(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
                C17542s.j(cachedCatalogItem, "item");
                lVar.invoke(new a.C17128h(cachedCatalogItem));
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void f(U0.C4889m r10, int r11) {
                /*
                    r9 = this;
                    r0 = r11 & 3
                    r1 = 2
                    if (r0 != r1) goto L_0x0011
                    boolean r0 = r10.l()
                    if (r0 != 0) goto L_0x000c
                    goto L_0x0011
                L_0x000c:
                    r10.L()
                    goto L_0x00de
                L_0x0011:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x0020
                    r0 = -1
                    java.lang.String r1 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.RightExpandableMenus.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DecorateSurface.kt:497)"
                    r2 = 911191590(0x364fae26, float:3.0946771E-6)
                    U0.C4895p.S(r2, r11, r0, r1)
                L_0x0020:
                    mG.b r11 = r9.f136720a
                    int r0 = r11.d()
                    r11 = 1267072820(0x4b85ff34, float:1.756324E7)
                    r10.W(r11)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r11 = r9.f136721b
                    boolean r11 = r10.V(r11)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r1 = r9.f136721b
                    java.lang.Object r2 = r10.D()
                    if (r11 != 0) goto L_0x0042
                    U0.m$a r11 = U0.C4889m.f14007a
                    java.lang.Object r11 = r11.a()
                    if (r2 != r11) goto L_0x004a
                L_0x0042:
                    OG.a0 r2 = new OG.a0
                    r2.<init>(r1)
                    r10.u(r2)
                L_0x004a:
                    r1 = r2
                    nI.l r1 = (nI.C17642l) r1
                    r10.P()
                    r11 = 1267089661(0x4b8640fd, float:1.7596922E7)
                    r10.W(r11)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r11 = r9.f136721b
                    boolean r11 = r10.V(r11)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r2 = r9.f136721b
                    java.lang.Object r3 = r10.D()
                    if (r11 != 0) goto L_0x006c
                    U0.m$a r11 = U0.C4889m.f14007a
                    java.lang.Object r11 = r11.a()
                    if (r3 != r11) goto L_0x0074
                L_0x006c:
                    OG.b0 r3 = new OG.b0
                    r3.<init>(r2)
                    r10.u(r3)
                L_0x0074:
                    r2 = r3
                    nI.a r2 = (nI.C17631a) r2
                    r10.P()
                    r11 = 1267095641(0x4b865859, float:1.7608882E7)
                    r10.W(r11)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r11 = r9.f136721b
                    boolean r11 = r10.V(r11)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r3 = r9.f136721b
                    java.lang.Object r4 = r10.D()
                    if (r11 != 0) goto L_0x0096
                    U0.m$a r11 = U0.C4889m.f14007a
                    java.lang.Object r11 = r11.a()
                    if (r4 != r11) goto L_0x009e
                L_0x0096:
                    OG.c0 r4 = new OG.c0
                    r4.<init>(r3)
                    r10.u(r4)
                L_0x009e:
                    r3 = r4
                    nI.a r3 = (nI.C17631a) r3
                    r10.P()
                    r11 = 1267082992(0x4b8626f0, float:1.7583584E7)
                    r10.W(r11)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r11 = r9.f136721b
                    boolean r11 = r10.V(r11)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r4 = r9.f136721b
                    java.lang.Object r5 = r10.D()
                    if (r11 != 0) goto L_0x00c0
                    U0.m$a r11 = U0.C4889m.f14007a
                    java.lang.Object r11 = r11.a()
                    if (r5 != r11) goto L_0x00c8
                L_0x00c0:
                    OG.d0 r5 = new OG.d0
                    r5.<init>(r4)
                    r10.u(r5)
                L_0x00c8:
                    nI.l r5 = (nI.C17642l) r5
                    r10.P()
                    r7 = 0
                    r8 = 16
                    r4 = 0
                    r6 = r10
                    GG.f.e(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                    boolean r10 = U0.C4895p.J()
                    if (r10 == 0) goto L_0x00de
                    U0.C4895p.R()
                L_0x00de:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: OG.P.e.a.f(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                f((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17597b f136722a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> f136723b;

            b(C17597b bVar, C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar) {
                this.f136722a = bVar;
                this.f136723b = lVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N h(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
                C17542s.j(cachedCatalogItem, "selectedItem");
                lVar.invoke(new a.D(cachedCatalogItem));
                lVar.invoke(a.X.f142604a);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N i(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
                C17542s.j(cachedCatalogItem, "item");
                lVar.invoke(new a.C17128h(cachedCatalogItem));
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N j(C17642l lVar) {
                lVar.invoke(a.X.f142604a);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N k(C17642l lVar) {
                lVar.invoke(a.E.f142585a);
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void f(U0.C4889m r8, int r9) {
                /*
                    r7 = this;
                    r0 = r9 & 3
                    r1 = 2
                    if (r0 != r1) goto L_0x0011
                    boolean r0 = r8.l()
                    if (r0 != 0) goto L_0x000c
                    goto L_0x0011
                L_0x000c:
                    r8.L()
                    goto L_0x00dc
                L_0x0011:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x0020
                    r0 = -1
                    java.lang.String r1 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.RightExpandableMenus.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DecorateSurface.kt:537)"
                    r2 = 326876616(0x137bbdc8, float:3.1774223E-27)
                    U0.C4895p.S(r2, r9, r0, r1)
                L_0x0020:
                    mG.b r9 = r7.f136722a
                    int r0 = r9.d()
                    r9 = 1267141532(0x4b870b9c, float:1.7700664E7)
                    r8.W(r9)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r9 = r7.f136723b
                    boolean r9 = r8.V(r9)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r1 = r7.f136723b
                    java.lang.Object r2 = r8.D()
                    if (r9 != 0) goto L_0x0042
                    U0.m$a r9 = U0.C4889m.f14007a
                    java.lang.Object r9 = r9.a()
                    if (r2 != r9) goto L_0x004a
                L_0x0042:
                    OG.e0 r2 = new OG.e0
                    r2.<init>(r1)
                    r8.u(r2)
                L_0x004a:
                    r1 = r2
                    nI.l r1 = (nI.C17642l) r1
                    r8.P()
                    r9 = 1267151952(0x4b873450, float:1.7721504E7)
                    r8.W(r9)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r9 = r7.f136723b
                    boolean r9 = r8.V(r9)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r2 = r7.f136723b
                    java.lang.Object r3 = r8.D()
                    if (r9 != 0) goto L_0x006c
                    U0.m$a r9 = U0.C4889m.f14007a
                    java.lang.Object r9 = r9.a()
                    if (r3 != r9) goto L_0x0074
                L_0x006c:
                    OG.f0 r3 = new OG.f0
                    r3.<init>(r2)
                    r8.u(r3)
                L_0x0074:
                    r2 = r3
                    nI.l r2 = (nI.C17642l) r2
                    r8.P()
                    r9 = 1267158621(0x4b874e5d, float:1.7734842E7)
                    r8.W(r9)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r9 = r7.f136723b
                    boolean r9 = r8.V(r9)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r3 = r7.f136723b
                    java.lang.Object r4 = r8.D()
                    if (r9 != 0) goto L_0x0096
                    U0.m$a r9 = U0.C4889m.f14007a
                    java.lang.Object r9 = r9.a()
                    if (r4 != r9) goto L_0x009e
                L_0x0096:
                    OG.g0 r4 = new OG.g0
                    r4.<init>(r3)
                    r8.u(r4)
                L_0x009e:
                    r3 = r4
                    nI.a r3 = (nI.C17631a) r3
                    r8.P()
                    r9 = 1267164605(0x4b8765bd, float:1.774681E7)
                    r8.W(r9)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r9 = r7.f136723b
                    boolean r9 = r8.V(r9)
                    nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r4 = r7.f136723b
                    java.lang.Object r5 = r8.D()
                    if (r9 != 0) goto L_0x00c0
                    U0.m$a r9 = U0.C4889m.f14007a
                    java.lang.Object r9 = r9.a()
                    if (r5 != r9) goto L_0x00c8
                L_0x00c0:
                    OG.h0 r5 = new OG.h0
                    r5.<init>(r4)
                    r8.u(r5)
                L_0x00c8:
                    r4 = r5
                    nI.a r4 = (nI.C17631a) r4
                    r8.P()
                    r6 = 0
                    r5 = r8
                    CG.j.e(r0, r1, r2, r3, r4, r5, r6)
                    boolean r8 = U0.C4895p.J()
                    if (r8 == 0) goto L_0x00dc
                    U0.C4895p.R()
                L_0x00dc:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: OG.P.e.b.f(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                f((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        e(l lVar, CachedCatalogItem cachedCatalogItem, C17642l<? super Float, C14768a> lVar2, C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar3, C17597b bVar, int i10, C15987c<String> cVar, boolean z10, u0 u0Var, C17642l<? super CachedCatalogItem, C16807N> lVar4) {
            this.f136710a = lVar;
            this.f136711b = cachedCatalogItem;
            this.f136712c = lVar2;
            this.f136713d = lVar3;
            this.f136714e = bVar;
            this.f136715f = i10;
            this.f136716g = cVar;
            this.f136717h = z10;
            this.f136718i = u0Var;
            this.f136719j = lVar4;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
            C17542s.j(cachedCatalogItem, "it");
            lVar.invoke(new a.D(cachedCatalogItem));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(C17642l lVar) {
            lVar.invoke(a.Y.f142605a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(C17642l lVar) {
            lVar.invoke(a.C17131k.f142627a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N n(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
            C17542s.j(cachedCatalogItem, "it");
            lVar.invoke(new a.Z(cachedCatalogItem));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N p(C17642l lVar) {
            lVar.invoke(a.Y.f142605a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N q(C17642l lVar) {
            lVar.invoke(a.C17131k.f142627a);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i(l0.C5507b r11, nG.C17621a r12, U0.C4889m r13, int r14) {
            /*
                r10 = this;
                java.lang.String r0 = "$this$AnimatedContent"
                kotlin.jvm.internal.C17542s.j(r11, r0)
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x0014
                r11 = -1
                java.lang.String r0 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.RightExpandableMenus.<anonymous>.<anonymous> (DecorateSurface.kt:480)"
                r1 = -1592508414(0xffffffffa1144002, float:-5.0229064E-19)
                U0.C4895p.S(r1, r14, r11, r0)
            L_0x0014:
                boolean r11 = r12 instanceof nG.C17621a.d
                if (r11 == 0) goto L_0x0032
                r11 = 1554883557(0x5cada3e5, float:3.91002999E17)
                r13.W(r11)
                YG.l r0 = r10.f136710a
                com.sugarcube.app.base.data.database.CachedCatalogItem r2 = r10.f136711b
                nI.l<java.lang.Float, lF.a> r3 = r10.f136712c
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r4 = r10.f136713d
                r6 = 0
                r7 = 2
                r1 = 0
                r5 = r13
                YG.k.t(r0, r1, r2, r3, r4, r5, r6, r7)
                r13.P()
                goto L_0x0209
            L_0x0032:
                boolean r11 = r12 instanceof nG.C17621a.c
                r14 = 0
                r0 = 54
                r1 = 1
                r2 = 0
                if (r11 == 0) goto L_0x010b
                r11 = 1555269631(0x5cb387ff, float:4.04268401E17)
                r13.W(r11)
                nG.a$c r12 = (nG.C17621a.c) r12
                boolean r11 = r12.b()
                if (r11 == 0) goto L_0x00a6
                r11 = 1555294183(0x5cb3e7e7, float:4.05112001E17)
                r13.W(r11)
                KG.g r5 = KG.g.FROM_RIGHT_TO_LEFT
                mG.b r11 = r10.f136714e
                r12 = -1058199866(0xffffffffc0ed26c6, float:-7.410983)
                r13.W(r12)
                if (r11 != 0) goto L_0x005d
            L_0x005b:
                r4 = r2
                goto L_0x006c
            L_0x005d:
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r12 = r10.f136713d
                OG.P$e$a r14 = new OG.P$e$a
                r14.<init>(r11, r12)
                r11 = 911191590(0x364fae26, float:3.0946771E-6)
                c1.a r2 = c1.c.e(r11, r1, r14, r13, r0)
                goto L_0x005b
            L_0x006c:
                r13.P()
                r11 = -1058204441(0xffffffffc0ed14e7, float:-7.4088016)
                r13.W(r11)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r11 = r10.f136713d
                boolean r11 = r13.V(r11)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r12 = r10.f136713d
                java.lang.Object r14 = r13.D()
                if (r11 != 0) goto L_0x008b
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r14 != r11) goto L_0x0093
            L_0x008b:
                OG.U r14 = new OG.U
                r14.<init>(r12)
                r13.u(r14)
            L_0x0093:
                r3 = r14
                nI.a r3 = (nI.C17631a) r3
                r13.P()
                r8 = 384(0x180, float:5.38E-43)
                r9 = 8
                r6 = 0
                r7 = r13
                OG.P.d0(r3, r4, r5, r6, r7, r8, r9)
                r13.P()
                goto L_0x0106
            L_0x00a6:
                r11 = 1556823971(0x5ccb3fa3, float:4.57675117E17)
                r13.W(r11)
                int r11 = r10.f136715f
                r12 = -1058154520(0xffffffffc0edd7e8, float:-7.4326057)
                r13.W(r12)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r12 = r10.f136713d
                boolean r12 = r13.V(r12)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r0 = r10.f136713d
                java.lang.Object r1 = r13.D()
                if (r12 != 0) goto L_0x00ca
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x00d2
            L_0x00ca:
                OG.V r1 = new OG.V
                r1.<init>(r0)
                r13.u(r1)
            L_0x00d2:
                nI.l r1 = (nI.C17642l) r1
                r13.P()
                r12 = -1058149402(0xffffffffc0edebe6, float:-7.435046)
                r13.W(r12)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r12 = r10.f136713d
                boolean r12 = r13.V(r12)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r0 = r10.f136713d
                java.lang.Object r2 = r13.D()
                if (r12 != 0) goto L_0x00f3
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r2 != r12) goto L_0x00fb
            L_0x00f3:
                OG.W r2 = new OG.W
                r2.<init>(r0)
                r13.u(r2)
            L_0x00fb:
                nI.a r2 = (nI.C17631a) r2
                r13.P()
                GG.h.b(r11, r1, r2, r13, r14)
                r13.P()
            L_0x0106:
                r13.P()
                goto L_0x0209
            L_0x010b:
                boolean r11 = r12 instanceof nG.C17621a.C3532a
                if (r11 == 0) goto L_0x01de
                r11 = 1557392635(0x5cd3ecfb, float:4.77214263E17)
                r13.W(r11)
                nG.a$a r12 = (nG.C17621a.C3532a) r12
                boolean r11 = r12.b()
                if (r11 == 0) goto L_0x017a
                r11 = 1557416691(0x5cd44af3, float:4.78040821E17)
                r13.W(r11)
                KG.g r5 = KG.g.FROM_RIGHT_TO_LEFT
                mG.b r11 = r10.f136714e
                r12 = -1058131398(0xffffffffc0ee323a, float:-7.443631)
                r13.W(r12)
                if (r11 != 0) goto L_0x0131
            L_0x012f:
                r4 = r2
                goto L_0x0140
            L_0x0131:
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r12 = r10.f136713d
                OG.P$e$b r14 = new OG.P$e$b
                r14.<init>(r11, r12)
                r11 = 326876616(0x137bbdc8, float:3.1774223E-27)
                c1.a r2 = c1.c.e(r11, r1, r14, r13, r0)
                goto L_0x012f
            L_0x0140:
                r13.P()
                r11 = -1058135993(0xffffffffc0ee2047, float:-7.44144)
                r13.W(r11)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r11 = r10.f136713d
                boolean r11 = r13.V(r11)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r12 = r10.f136713d
                java.lang.Object r14 = r13.D()
                if (r11 != 0) goto L_0x015f
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r14 != r11) goto L_0x0167
            L_0x015f:
                OG.X r14 = new OG.X
                r14.<init>(r12)
                r13.u(r14)
            L_0x0167:
                r3 = r14
                nI.a r3 = (nI.C17631a) r3
                r13.P()
                r8 = 384(0x180, float:5.38E-43)
                r9 = 8
                r6 = 0
                r7 = r13
                OG.P.d0(r3, r4, r5, r6, r7, r8, r9)
                r13.P()
                goto L_0x01da
            L_0x017a:
                r11 = 1558966195(0x5cebefb3, float:5.31281373E17)
                r13.W(r11)
                int r11 = r10.f136715f
                r12 = -1058085168(0xffffffffc0eee6d0, float:-7.4656754)
                r13.W(r12)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r12 = r10.f136713d
                boolean r12 = r13.V(r12)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r0 = r10.f136713d
                java.lang.Object r1 = r13.D()
                if (r12 != 0) goto L_0x019e
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x01a6
            L_0x019e:
                OG.Y r1 = new OG.Y
                r1.<init>(r0)
                r13.u(r1)
            L_0x01a6:
                nI.l r1 = (nI.C17642l) r1
                r13.P()
                r12 = -1058079802(0xffffffffc0eefbc6, float:-7.468234)
                r13.W(r12)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r12 = r10.f136713d
                boolean r12 = r13.V(r12)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r0 = r10.f136713d
                java.lang.Object r2 = r13.D()
                if (r12 != 0) goto L_0x01c7
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r2 != r12) goto L_0x01cf
            L_0x01c7:
                OG.Z r2 = new OG.Z
                r2.<init>(r0)
                r13.u(r2)
            L_0x01cf:
                nI.a r2 = (nI.C17631a) r2
                r13.P()
                CG.l.b(r11, r1, r2, r13, r14)
                r13.P()
            L_0x01da:
                r13.P()
                goto L_0x0209
            L_0x01de:
                boolean r11 = r12 instanceof nG.C17621a.b
                if (r11 == 0) goto L_0x01fe
                r11 = 1559503146(0x5cf4212a, float:5.49730869E17)
                r13.W(r11)
                KJ.c<java.lang.String> r0 = r10.f136716g
                mG.b r1 = r10.f136714e
                boolean r2 = r10.f136717h
                OG.u0 r3 = r10.f136718i
                nI.l<com.sugarcube.app.base.data.database.CachedCatalogItem, XH.N> r4 = r10.f136719j
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r5 = r10.f136713d
                r7 = 0
                r8 = 0
                r6 = r13
                OG.P.t0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                r13.P()
                goto L_0x0209
            L_0x01fe:
                if (r12 != 0) goto L_0x0213
                r11 = -1058058372(0xffffffffc0ef4f7c, float:-7.4784527)
                r13.W(r11)
                r13.P()
            L_0x0209:
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x0212
                U0.C4895p.R()
            L_0x0212:
                return
            L_0x0213:
                r11 = -1058218039(0xffffffffc0ecdfc9, float:-7.4023175)
                r13.W(r11)
                r13.P()
                XH.t r11 = new XH.t
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: OG.P.e.i(l0.b, nG.a, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            i((C5507b) obj, (C17621a) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17597b f136724a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15987c<String> f136725b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> f136726c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<CachedCatalogItem, C16807N> f136727d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f136728e;

        f(C17597b bVar, C15987c<String> cVar, C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar, C17642l<? super CachedCatalogItem, C16807N> lVar2, boolean z10) {
            this.f136724a = bVar;
            this.f136725b = cVar;
            this.f136726c = lVar;
            this.f136727d = lVar2;
            this.f136728e = z10;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar) {
            lVar.invoke(a.M.f142593a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(C17597b bVar, C17642l lVar) {
            CachedCatalogItem d10 = bVar.e().d();
            if (lVar != null) {
                lVar.invoke(d10);
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C17642l lVar, CachedCatalogItem cachedCatalogItem, boolean z10) {
            C17542s.j(cachedCatalogItem, "selectedItem");
            lVar.invoke(new a.f0.b(cachedCatalogItem, z10));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.p} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(U0.C4889m r11, int r12) {
            /*
                r10 = this;
                r0 = r12 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0011
                boolean r0 = r11.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0011
            L_0x000c:
                r11.L()
                goto L_0x00e7
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.RightProductInfoDrawerSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DecorateSurface.kt:689)"
                r2 = -1014497738(0xffffffffc387fe36, float:-271.98602)
                U0.C4895p.S(r2, r12, r0, r1)
            L_0x0020:
                mG.b r12 = r10.f136724a
                RF.k r12 = r12.e()
                com.sugarcube.app.base.data.database.CachedCatalogItem r2 = r12.d()
                mG.b r12 = r10.f136724a
                RF.k r12 = r12.e()
                com.sugarcube.app.base.data.database.CachedCatalogItem r12 = r12.d()
                com.sugarcube.core.network.models.CatalogItem r12 = r12.getCatalogItem()
                java.lang.String r12 = r12.getLocalItemNumber()
                if (r12 != 0) goto L_0x0043
                r12 = 0
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            L_0x0043:
                KJ.c<java.lang.String> r0 = r10.f136725b
                boolean r3 = YH.C16877v.l0(r0, r12)
                r12 = -122586829(0xfffffffff8b17933, float:-2.879671E34)
                r11.W(r12)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r12 = r10.f136726c
                boolean r12 = r11.V(r12)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r0 = r10.f136726c
                java.lang.Object r1 = r11.D()
                if (r12 != 0) goto L_0x0065
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x006d
            L_0x0065:
                OG.i0 r1 = new OG.i0
                r1.<init>(r0)
                r11.u(r1)
            L_0x006d:
                r4 = r1
                nI.a r4 = (nI.C17631a) r4
                r11.P()
                r12 = -122581057(0xfffffffff8b18fbf, float:-2.8811002E34)
                r11.W(r12)
                mG.b r12 = r10.f136724a
                boolean r12 = r11.V(r12)
                nI.l<com.sugarcube.app.base.data.database.CachedCatalogItem, XH.N> r0 = r10.f136727d
                boolean r0 = r11.V(r0)
                r12 = r12 | r0
                mG.b r0 = r10.f136724a
                nI.l<com.sugarcube.app.base.data.database.CachedCatalogItem, XH.N> r1 = r10.f136727d
                java.lang.Object r5 = r11.D()
                if (r12 != 0) goto L_0x0098
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r5 != r12) goto L_0x00a0
            L_0x0098:
                OG.j0 r5 = new OG.j0
                r5.<init>(r0, r1)
                r11.u(r5)
            L_0x00a0:
                nI.a r5 = (nI.C17631a) r5
                r11.P()
                boolean r12 = r10.f136728e
                if (r12 == 0) goto L_0x00aa
                goto L_0x00ac
            L_0x00aa:
                r12 = 0
                r5 = r12
            L_0x00ac:
                r12 = -122567145(0xfffffffff8b1c617, float:-2.8845446E34)
                r11.W(r12)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r12 = r10.f136726c
                boolean r12 = r11.V(r12)
                nI.l<com.sugarcube.decorate.v2.internal.ui.surface.a, XH.N> r0 = r10.f136726c
                java.lang.Object r1 = r11.D()
                if (r12 != 0) goto L_0x00c8
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x00d0
            L_0x00c8:
                OG.k0 r1 = new OG.k0
                r1.<init>(r0)
                r11.u(r1)
            L_0x00d0:
                r6 = r1
                nI.p r6 = (nI.p) r6
                r11.P()
                r8 = 0
                r9 = 3
                r0 = 0
                r1 = 0
                r7 = r11
                DG.q.s(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x00e7
                U0.C4895p.R()
            L_0x00e7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: OG.P.f.e(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            e((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.surface.composable.DecorateSurfaceKt$RotateToolbarSection$1$1", f = "DecorateSurface.kt", l = {}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f136729c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f136730d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f136731e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4892n0 f136732f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(float f10, C4899r0<Boolean> r0Var, C4892n0 n0Var, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f136730d = f10;
            this.f136731e = r0Var;
            this.f136732f = n0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f136730d, this.f136731e, this.f136732f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f136729c == 0) {
                y.b(obj);
                P.J0(this.f136731e, true);
                P.L0(this.f136732f, this.f136730d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A0(C17642l lVar) {
        lVar.invoke(a.C17141u.f142637a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B0(C17642l lVar, k kVar) {
        C17542s.j(kVar, "selectedItem");
        lVar.invoke(new a.I(kVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C0(C17642l lVar) {
        lVar.invoke(a.H.f142588a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D0(C17642l lVar) {
        lVar.invoke(a.F.f142586a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E0(C17642l lVar, C16404b bVar) {
        C17542s.j(bVar, "it");
        lVar.invoke(new a.e0(bVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F0(C17642l lVar, com.sugarcube.decorate.v2.internal.ui.surface.a aVar) {
        C17542s.j(aVar, "event");
        lVar.invoke(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G0(C5857c cVar, l0 l0Var, C16569f fVar, C16415m mVar, C17642l lVar, int i10, C4889m mVar2, int i11) {
        x0(cVar, l0Var, fVar, mVar, lVar, mVar2, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.sugarcube.decorate.v2.internal.RotateControlView$OnItemRotateListener} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void H0(mG.C17597b r10, nI.C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, XH.C16807N> r11, U0.C4889m r12, int r13) {
        /*
            r0 = 771697588(0x2dff2bb4, float:2.9009552E-11)
            U0.m r12 = r12.k(r0)
            r1 = r13 & 6
            r2 = 2
            if (r1 != 0) goto L_0x0017
            boolean r1 = r12.V(r10)
            if (r1 == 0) goto L_0x0014
            r1 = 4
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r1 = r1 | r13
            goto L_0x0018
        L_0x0017:
            r1 = r13
        L_0x0018:
            r3 = r13 & 48
            r4 = 32
            if (r3 != 0) goto L_0x0029
            boolean r3 = r12.F(r11)
            if (r3 == 0) goto L_0x0026
            r3 = r4
            goto L_0x0028
        L_0x0026:
            r3 = 16
        L_0x0028:
            r1 = r1 | r3
        L_0x0029:
            r3 = r1 & 19
            r5 = 18
            if (r3 != r5) goto L_0x003b
            boolean r3 = r12.l()
            if (r3 != 0) goto L_0x0036
            goto L_0x003b
        L_0x0036:
            r12.L()
            goto L_0x0115
        L_0x003b:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0047
            r3 = -1
            java.lang.String r5 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.RotateToolbarSection (DecorateSurface.kt:383)"
            U0.C4895p.S(r0, r1, r3, r5)
        L_0x0047:
            float r0 = r10.f()
            r3 = -1508508323(0xffffffffa615fd5d, float:-5.203813E-16)
            r12.W(r3)
            java.lang.Object r3 = r12.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r6 = r5.a()
            r7 = 0
            if (r3 != r6) goto L_0x0067
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            U0.r0 r3 = U0.u1.e(r3, r7, r2, r7)
            r12.u(r3)
        L_0x0067:
            U0.r0 r3 = (U0.C4899r0) r3
            r12.P()
            r2 = -1508505012(0xffffffffa6160a4c, float:-5.205566E-16)
            r12.W(r2)
            java.lang.Object r2 = r12.D()
            java.lang.Object r6 = r5.a()
            if (r2 != r6) goto L_0x0083
            U0.n0 r2 = U0.D0.a(r0)
            r12.u(r2)
        L_0x0083:
            U0.n0 r2 = (U0.C4892n0) r2
            r12.P()
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r8 = -1508499511(0xffffffffa6161fc9, float:-5.208478E-16)
            r12.W(r8)
            boolean r8 = r12.c(r0)
            java.lang.Object r9 = r12.D()
            if (r8 != 0) goto L_0x00a2
            java.lang.Object r8 = r5.a()
            if (r9 != r8) goto L_0x00aa
        L_0x00a2:
            OG.P$g r9 = new OG.P$g
            r9.<init>(r0, r3, r2, r7)
            r12.u(r9)
        L_0x00aa:
            nI.p r9 = (nI.p) r9
            r12.P()
            r0 = 0
            U0.P.g(r6, r9, r12, r0)
            float r6 = K0(r2)
            r7 = -1508491999(0xffffffffa6163d21, float:-5.212455E-16)
            r12.W(r7)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r7 = 1
            if (r1 != r4) goto L_0x00c4
            r8 = r7
            goto L_0x00c5
        L_0x00c4:
            r8 = r0
        L_0x00c5:
            java.lang.Object r9 = r12.D()
            if (r8 != 0) goto L_0x00d1
            java.lang.Object r8 = r5.a()
            if (r9 != r8) goto L_0x00d9
        L_0x00d1:
            OG.z r9 = new OG.z
            r9.<init>(r11, r3, r2)
            r12.u(r9)
        L_0x00d9:
            r2 = r9
            com.sugarcube.decorate.v2.internal.RotateControlView$OnItemRotateListener r2 = (com.sugarcube.decorate.v2.internal.RotateControlView.OnItemRotateListener) r2
            r12.P()
            r3 = -1508483203(0xffffffffa6165f7d, float:-5.2171115E-16)
            r12.W(r3)
            if (r1 != r4) goto L_0x00e8
            r0 = r7
        L_0x00e8:
            java.lang.Object r1 = r12.D()
            if (r0 != 0) goto L_0x00f4
            java.lang.Object r0 = r5.a()
            if (r1 != r0) goto L_0x00fc
        L_0x00f4:
            OG.A r1 = new OG.A
            r1.<init>(r11)
            r12.u(r1)
        L_0x00fc:
            r3 = r1
            nI.a r3 = (nI.C17631a) r3
            r12.P()
            r0 = 0
            r7 = 8
            r4 = 0
            r1 = r6
            r5 = r12
            r6 = r0
            WG.g.d(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0115
            U0.C4895p.R()
        L_0x0115:
            U0.Y0 r12 = r12.n()
            if (r12 == 0) goto L_0x0123
            OG.B r0 = new OG.B
            r0.<init>(r10, r11, r13)
            r12.a(r0)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OG.P.H0(mG.b, nI.l, U0.m, int):void");
    }

    private static final boolean I0(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void J0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final float K0(C4892n0 n0Var) {
        return n0Var.a();
    }

    private static final void L(C18048l lVar, RoomType roomType, C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-628452485);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(lVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(roomType) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-628452485, i11, -1, "com.sugarcube.decorate.v2.internal.ui.surface.composable.BrowseDrawerSection (DecorateSurface.kt:720)");
            }
            KG.g gVar = KG.g.FROM_LEFT_TO_RIGHT;
            k10.W(1812140815);
            boolean z10 = true;
            C5264a e10 = lVar == null ? null : c1.c.e(-1285626161, true, new a(lVar, roomType, lVar2), k10, 54);
            k10.P();
            k10.W(1812137635);
            if ((i11 & 896) != 256) {
                z10 = false;
            }
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new C16144l(lVar2);
                k10.u(D10);
            }
            k10.P();
            d0((C17631a) D10, e10, gVar, (KG.f) null, k10, 384, 8);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C16146n(lVar, roomType, lVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final void L0(C4892n0 n0Var, float f10) {
        n0Var.n(f10);
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C17642l lVar) {
        lVar.invoke(a.C17131k.f142627a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void M0(C17642l lVar, C4899r0 r0Var, C4892n0 n0Var, float f10) {
        if (!I0(r0Var)) {
            lVar.invoke(new a.Q(f10));
        }
        J0(r0Var, false);
        L0(n0Var, f10);
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C18048l lVar, RoomType roomType, C17642l lVar2, int i10, C4889m mVar, int i11) {
        L(lVar, roomType, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N0(C17642l lVar) {
        lVar.invoke(a.P.f142596a);
        return C16807N.f139792a;
    }

    private static final void O(r rVar, C15987c<String> cVar, C17642l<? super CachedCatalogItem, C16807N> lVar, C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(2137163069);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(lVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= k10.F(lVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2137163069, i11, -1, "com.sugarcube.decorate.v2.internal.ui.surface.composable.CartDrawerSection (DecorateSurface.kt:751)");
            }
            k10.W(638712556);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = u1.e(new C15982e(KG.g.FROM_RIGHT_TO_LEFT, (KG.f) null, false), (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            if (rVar == null) {
                C15982e.f135906c.a(r0Var);
            } else {
                C15982e.f135906c.b(r0Var);
            }
            C15981d.d((androidx.compose.ui.d) null, (C15982e) r0Var.getValue(), 0, c1.c.e(-1571030485, true, new b(rVar, cVar, lVar, lVar2), k10, 54), k10, 3072, 5);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C16143k(rVar, cVar, lVar, lVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(C17597b bVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        H0(bVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P(r rVar, C15987c cVar, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        O(rVar, cVar, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void Q(JG.C15929K r19, MG.C16038g r20, nI.C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, XH.C16807N> r21, nI.C17631a<XH.C16807N> r22, nI.C17631a<XH.C16807N> r23, U0.C4889m r24, int r25) {
        /*
            r9 = r21
            r10 = r25
            r0 = 143995327(0x89531bf, float:8.979307E-34)
            r1 = r24
            U0.m r11 = r1.k(r0)
            r1 = r10 & 6
            r12 = r19
            if (r1 != 0) goto L_0x001e
            boolean r1 = r11.V(r12)
            if (r1 == 0) goto L_0x001b
            r1 = 4
            goto L_0x001c
        L_0x001b:
            r1 = 2
        L_0x001c:
            r1 = r1 | r10
            goto L_0x001f
        L_0x001e:
            r1 = r10
        L_0x001f:
            r2 = r10 & 48
            r13 = r20
            if (r2 != 0) goto L_0x0031
            boolean r2 = r11.V(r13)
            if (r2 == 0) goto L_0x002e
            r2 = 32
            goto L_0x0030
        L_0x002e:
            r2 = 16
        L_0x0030:
            r1 = r1 | r2
        L_0x0031:
            r2 = r10 & 384(0x180, float:5.38E-43)
            r14 = 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0042
            boolean r2 = r11.F(r9)
            if (r2 == 0) goto L_0x003f
            r2 = r14
            goto L_0x0041
        L_0x003f:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0041:
            r1 = r1 | r2
        L_0x0042:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            r15 = r22
            if (r2 != 0) goto L_0x0054
            boolean r2 = r11.F(r15)
            if (r2 == 0) goto L_0x0051
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r1 = r1 | r2
        L_0x0054:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            r8 = r23
            if (r2 != 0) goto L_0x0066
            boolean r2 = r11.F(r8)
            if (r2 == 0) goto L_0x0063
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0065
        L_0x0063:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0065:
            r1 = r1 | r2
        L_0x0066:
            r7 = r1
            r1 = r7 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r2) goto L_0x0079
            boolean r1 = r11.l()
            if (r1 != 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r11.L()
            goto L_0x01f9
        L_0x0079:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0085
            r1 = -1
            java.lang.String r2 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.DecorateAndStatusDialogSection (DecorateSurface.kt:419)"
            U0.C4895p.S(r0, r7, r1, r2)
        L_0x0085:
            JG.a r0 = r19.a()
            r1 = -694683006(0xffffffffd697fa82, float:-8.3551089E13)
            r11.W(r1)
            r6 = 1
            r5 = 0
            if (r0 != 0) goto L_0x0097
            r14 = r6
            r18 = r7
            goto L_0x00e5
        L_0x0097:
            JG.a r1 = r19.a()
            r0 = 890965452(0x351b0dcc, float:5.7762077E-7)
            r11.W(r0)
            r0 = r7 & 896(0x380, float:1.256E-42)
            if (r0 != r14) goto L_0x00a7
            r0 = r6
            goto L_0x00a8
        L_0x00a7:
            r0 = r5
        L_0x00a8:
            java.lang.Object r2 = r11.D()
            if (r0 != 0) goto L_0x00b6
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x00be
        L_0x00b6:
            OG.o r2 = new OG.o
            r2.<init>(r9)
            r11.u(r2)
        L_0x00be:
            nI.a r2 = (nI.C17631a) r2
            r11.P()
            r0 = 64512(0xfc00, float:9.04E-41)
            r0 = r0 & r7
            int r3 = r7 << 9
            r4 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r4
            r16 = r0 | r3
            r17 = 1
            r0 = 0
            r3 = r22
            r4 = r23
            r14 = r5
            r5 = r21
            r14 = r6
            r6 = r11
            r18 = r7
            r7 = r16
            r8 = r17
            JG.C15919A.y(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            XH.N r0 = XH.C16807N.f139792a
        L_0x00e5:
            r11.P()
            MG.b r0 = r20.a()
            if (r0 != 0) goto L_0x00f0
            goto L_0x01f0
        L_0x00f0:
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r0 = 10
            float r0 = (float) r0
            float r3 = c2.h.B(r0)
            r6 = 13
            r7 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r1, r2, r3, r4, r5, r6, r7)
            r1 = 0
            r2 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.f(r0, r1, r14, r2)
            i1.c$a r1 = i1.C5437c.f24302a
            i1.c r1 = r1.m()
            r2 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5077h.h(r1, r2)
            int r3 = U0.C4883j.a(r11, r2)
            U0.y r2 = r11.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r11, r0)
            G1.g$a r4 = G1.C4504g.f6515W
            nI.a r5 = r4.a()
            U0.f r6 = r11.m()
            if (r6 != 0) goto L_0x012f
            U0.C4883j.c()
        L_0x012f:
            r11.I()
            boolean r6 = r11.i()
            if (r6 == 0) goto L_0x013c
            r11.p(r5)
            goto L_0x013f
        L_0x013c:
            r11.t()
        L_0x013f:
            U0.m r5 = U0.F1.a(r11)
            nI.p r6 = r4.c()
            U0.F1.c(r5, r1, r6)
            nI.p r1 = r4.e()
            U0.F1.c(r5, r2, r1)
            nI.p r1 = r4.b()
            boolean r2 = r5.i()
            if (r2 != 0) goto L_0x0169
            java.lang.Object r2 = r5.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r6)
            if (r2 != 0) goto L_0x0177
        L_0x0169:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r5.u(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r5.w(r2, r1)
        L_0x0177:
            nI.p r1 = r4.d()
            U0.F1.c(r5, r0, r1)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            boolean r0 = r20.b()
            r1 = -817099962(0xffffffffcf4c0b46, float:-3.42329088E9)
            r11.W(r1)
            r1 = r18
            r1 = r1 & 896(0x380, float:1.256E-42)
            r2 = 256(0x100, float:3.59E-43)
            if (r1 != r2) goto L_0x0194
            r6 = r14
            goto L_0x0195
        L_0x0194:
            r6 = 0
        L_0x0195:
            java.lang.Object r2 = r11.D()
            if (r6 != 0) goto L_0x01a3
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x01ab
        L_0x01a3:
            OG.p r2 = new OG.p
            r2.<init>(r9)
            r11.u(r2)
        L_0x01ab:
            nI.a r2 = (nI.C17631a) r2
            r11.P()
            r3 = 0
            e.C5281d.a(r0, r2, r11, r3, r3)
            MG.b r0 = r20.a()
            boolean r2 = r20.b()
            r4 = -817091730(0xffffffffcf4c2b6e, float:-3.42539827E9)
            r11.W(r4)
            r4 = 256(0x100, float:3.59E-43)
            if (r1 != r4) goto L_0x01c8
            r6 = r14
            goto L_0x01c9
        L_0x01c8:
            r6 = r3
        L_0x01c9:
            java.lang.Object r1 = r11.D()
            if (r6 != 0) goto L_0x01d7
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x01df
        L_0x01d7:
            OG.q r1 = new OG.q
            r1.<init>(r9)
            r11.u(r1)
        L_0x01df:
            r4 = r1
            nI.a r4 = (nI.C17631a) r4
            r11.P()
            r6 = 0
            r7 = 1
            r1 = 0
            r3 = r0
            r5 = r11
            MG.C16037f.b(r1, r2, r3, r4, r5, r6, r7)
            r11.x()
        L_0x01f0:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01f9
            U0.C4895p.R()
        L_0x01f9:
            U0.Y0 r7 = r11.n()
            if (r7 == 0) goto L_0x0214
            OG.r r8 = new OG.r
            r0 = r8
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OG.P.Q(JG.K, MG.g, nI.l, nI.a, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N R(C17642l lVar) {
        lVar.invoke(a.C17136p.f142632a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S(C17642l lVar) {
        lVar.invoke(a.W.f142603a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T(C17642l lVar) {
        lVar.invoke(a.W.f142603a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U(C15929K k10, C16038g gVar, C17642l lVar, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        Q(k10, gVar, lVar, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void V(boolean z10, androidx.compose.ui.d dVar, C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(1791080978);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.b(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.F(lVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(1791080978, i12, -1, "com.sugarcube.decorate.v2.internal.ui.surface.composable.DecorateSmileFeedback (DecorateSurface.kt:305)");
            }
            k10.W(-1647508367);
            boolean z11 = (i12 & 14) == 4;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                D10 = u1.e(Boolean.valueOf(z10), (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            boolean Y10 = Y(r0Var);
            k10.W(-1647505934);
            boolean z12 = (i12 & 896) == 256;
            Object D11 = k10.D();
            if (z12 || D11 == C4889m.f14007a.a()) {
                D11 = new C16141i(lVar);
                k10.u(D11);
            }
            k10.P();
            C5281d.a(Y10, (C17631a) D11, k10, 0, 0);
            l0.d.g(Y(r0Var), dVar, (i) null, (androidx.compose.animation.k) null, (String) null, c1.c.e(1424045114, true, new c(r0Var, lVar), k10, 54), k10, (i12 & 112) | ImageMetadata.EDGE_MODE, 28);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        androidx.compose.ui.d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C16142j(z10, dVar2, lVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N W(C17642l lVar) {
        lVar.invoke(a.C17146z.f142642a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N X(boolean z10, androidx.compose.ui.d dVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        V(z10, dVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final boolean Y(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void Z(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    public static final void a0(l0 l0Var, C17642l<? super Float, C14768a> lVar, DecorateEngineController decorateEngineController, A1<? extends v<? extends DecorateEngine.RunState, ? extends DecorateEngine.DrawState>> a12, TouchManager touchManager, C17642l<? super CachedCatalogItem, C16807N> lVar2, C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar3, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        RoomType roomType;
        l0 l0Var2 = l0Var;
        C17642l<? super Float, C14768a> lVar4 = lVar;
        DecorateEngineController decorateEngineController2 = decorateEngineController;
        A1<? extends v<? extends DecorateEngine.RunState, ? extends DecorateEngine.DrawState>> a13 = a12;
        TouchManager touchManager2 = touchManager;
        C17642l<? super CachedCatalogItem, C16807N> lVar5 = lVar2;
        C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar6 = lVar3;
        C17631a<C16807N> aVar4 = aVar;
        C17631a<C16807N> aVar5 = aVar2;
        C17631a<C16807N> aVar6 = aVar3;
        int i12 = i10;
        C17542s.j(l0Var2, "state");
        C17542s.j(lVar4, "getFormattedPrice");
        C17542s.j(decorateEngineController2, "decorateEngineController");
        C17542s.j(a13, "renderingState");
        C17542s.j(lVar5, "onAddItemToFav");
        C17542s.j(lVar6, "onEvent");
        C17542s.j(aVar4, "onLogin");
        C17542s.j(aVar5, "onSignUp");
        C17542s.j(aVar6, "onBack");
        C4889m k10 = mVar.k(-843344496);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(l0Var2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar4) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(decorateEngineController2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.V(a13) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= (32768 & i12) == 0 ? k10.V(touchManager2) : k10.F(touchManager2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(lVar5) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(lVar6) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i12) == 0) {
            i11 |= k10.F(aVar4) ? 8388608 : 4194304;
        }
        if ((100663296 & i12) == 0) {
            i11 |= k10.F(aVar5) ? 67108864 : 33554432;
        }
        if ((805306368 & i12) == 0) {
            i11 |= k10.F(aVar6) ? 536870912 : 268435456;
        }
        int i13 = i11;
        if ((306783379 & i13) != 306783378 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-843344496, i13, -1, "com.sugarcube.decorate.v2.internal.ui.surface.composable.DecorateSurface (DecorateSurface.kt:171)");
            }
            j.c(6, k10, 6);
            C5281d.a(true, aVar6, k10, ((i13 >> 24) & 112) | 6, 0);
            boolean z10 = l0Var.q() != null;
            k10.W(-695014897);
            boolean z11 = (3670016 & i13) == 1048576;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                D10 = new C16134b(lVar6);
                k10.u(D10);
            }
            k10.P();
            C5281d.a(z10, (C17631a) D10, k10, 0, 0);
            d.a aVar7 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d d10 = androidx.compose.foundation.b.d(C5852X.a(J.f(aVar7, 0.0f, 1, (Object) null)), J1.b.a(R.color.decorate_background, k10, 0), (i1) null, 2, (Object) null);
            C5437c.a aVar8 = C5437c.f24302a;
            I h10 = C5077h.h(aVar8.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, d10);
            C4504g.a aVar9 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar9.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, h10, aVar9.c());
            F1.c(a14, s10, aVar9.e());
            p<C4504g, Integer, C16807N> b10 = aVar9.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a10))) {
                a14.u(Integer.valueOf(a10));
                a14.w(Integer.valueOf(a10), b10);
            }
            F1.c(a14, e10, aVar9.d());
            C5079j jVar = C5079j.f18125a;
            int i14 = i13 >> 6;
            int i15 = i14;
            int i16 = i13;
            m0(jVar, decorateEngineController, touchManager, (androidx.compose.ui.d) null, k10, ((i13 >> 3) & 112) | 6 | (i14 & 896), 4);
            C4889m mVar3 = k10;
            C16185c.b(l0Var.x(), (androidx.compose.ui.d) null, mVar3, 0, 2);
            int i17 = i16 >> 12;
            int i18 = i17 & 896;
            int i19 = i18;
            V(l0Var.B(), jVar.a(aVar7, aVar8.b()), lVar3, mVar3, i18, 0);
            boolean i20 = l0Var.i();
            boolean a15 = l0Var.h().a();
            v0 q10 = l0Var.q();
            C17597b e11 = q10 != null ? q10.e() : null;
            int i21 = i16 << 6;
            int i22 = i21 & 234881024;
            int i23 = i21;
            C4889m mVar4 = mVar3;
            g0(jVar, i20, a15, l0Var.l().b(), l0Var.m() != null, l0Var.v(), e11, l0Var.o(), lVar3, mVar4, 6 | i22);
            l u10 = l0Var.u();
            C15987c<String> r10 = l0Var.r();
            v0 q11 = l0Var.q();
            o0(jVar, l0Var.p(), u10, lVar, r10, q11 != null ? q11.e() : null, l0Var.h().b(), lVar2, lVar3, mVar4, (i23 & 29360128) | 6 | (i23 & 7168) | i22, 0);
            C16569f m10 = l0Var.m();
            if (!l0Var.g()) {
                m10 = null;
            }
            C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar7 = lVar3;
            int i24 = i17;
            A1<? extends v<? extends DecorateEngine.RunState, ? extends DecorateEngine.DrawState>> a16 = a13;
            x0(jVar, l0Var, m10, l0Var.w(), lVar3, mVar4, 6 | ((i16 << 3) & 112) | (i15 & 57344));
            C18048l d11 = l0Var.d();
            C17497c n10 = l0Var.n();
            if (n10 == null || (roomType = n10.getRoomType()) == null) {
                roomType = RoomType.LIVING_ROOM;
            }
            mVar2 = mVar4;
            L(d11, roomType, lVar7, mVar2, i19);
            int i25 = i16 >> 9;
            O(l0Var.e(), l0Var.r(), lVar2, lVar3, mVar2, i25 & 8064);
            k0(a16, mVar2, i25 & 14);
            Q(l0Var.f(), l0Var.s(), lVar3, aVar, aVar2, mVar2, i24 & 65408);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar8 = lVar6;
            A1<? extends v<? extends DecorateEngine.RunState, ? extends DecorateEngine.DrawState>> a17 = a13;
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new C16145m(l0Var, lVar, decorateEngineController, a12, touchManager, lVar2, lVar3, aVar, aVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N b0(C17642l lVar) {
        lVar.invoke(a.C17130j.f142626a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N c0(l0 l0Var, C17642l lVar, DecorateEngineController decorateEngineController, A1 a12, TouchManager touchManager, C17642l lVar2, C17642l lVar3, C17631a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        a0(l0Var, lVar, decorateEngineController, a12, touchManager, lVar2, lVar3, aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void d0(C17631a<C16807N> aVar, p<? super C4889m, ? super Integer, C16807N> pVar, KG.g gVar, KG.f fVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(689849615);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.F(pVar) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.V(gVar) ? 256 : 128;
        }
        int i14 = i11 & 8;
        if (i14 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= k10.V(fVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (i13 != 0) {
                gVar = KG.g.FROM_LEFT_TO_RIGHT;
            }
            if (i14 != 0) {
                fVar = null;
            }
            if (C4895p.J()) {
                C4895p.S(689849615, i12, -1, "com.sugarcube.decorate.v2.internal.ui.surface.composable.DrawerSection (DecorateSurface.kt:648)");
            }
            k10.W(2092102084);
            Object D10 = k10.D();
            C4889m.a aVar2 = C4889m.f14007a;
            if (D10 == aVar2.a()) {
                D10 = u1.e(new C15982e(gVar, fVar, false), (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            boolean f10 = ((C15982e) r0Var.getValue()).f();
            k10.W(2092111036);
            boolean z10 = (i12 & 14) == 4;
            Object D11 = k10.D();
            if (z10 || D11 == aVar2.a()) {
                D11 = new C16154w(aVar);
                k10.u(D11);
            }
            k10.P();
            C5281d.a(f10, (C17631a) D11, k10, 0, 0);
            if (pVar != null) {
                C15982e.f135906c.b(r0Var);
            } else {
                C15982e.f135906c.a(r0Var);
            }
            C15981d.d((androidx.compose.ui.d) null, (C15982e) r0Var.getValue(), 0, c1.c.e(-1233852291, true, new d(pVar), k10, 54), k10, 3072, 5);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        KG.g gVar2 = gVar;
        KG.f fVar2 = fVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C16156y(aVar, pVar, gVar2, fVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e0(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f0(C17631a aVar, p pVar, KG.g gVar, KG.f fVar, int i10, int i11, C4889m mVar, int i12) {
        d0(aVar, pVar, gVar, fVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void g0(s0.C5857c r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, mG.C17597b r33, VG.C16653f r34, nI.C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, XH.C16807N> r35, U0.C4889m r36, int r37) {
        /*
            r1 = r27
            r4 = r30
            r15 = r31
            r3 = r33
            r2 = r34
            r0 = r35
            r14 = r37
            r5 = -681458789(0xffffffffd761c39b, float:-2.48230235E14)
            r6 = r36
            U0.m r13 = r6.k(r5)
            r16 = 6
            r6 = r14 & 6
            if (r6 != 0) goto L_0x0028
            boolean r6 = r13.V(r1)
            if (r6 == 0) goto L_0x0025
            r6 = 4
            goto L_0x0026
        L_0x0025:
            r6 = 2
        L_0x0026:
            r6 = r6 | r14
            goto L_0x0029
        L_0x0028:
            r6 = r14
        L_0x0029:
            r7 = r14 & 48
            r12 = r28
            if (r7 != 0) goto L_0x003b
            boolean r7 = r13.b(r12)
            if (r7 == 0) goto L_0x0038
            r7 = 32
            goto L_0x003a
        L_0x0038:
            r7 = 16
        L_0x003a:
            r6 = r6 | r7
        L_0x003b:
            r7 = r14 & 384(0x180, float:5.38E-43)
            r11 = r29
            if (r7 != 0) goto L_0x004d
            boolean r7 = r13.b(r11)
            if (r7 == 0) goto L_0x004a
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x004c
        L_0x004a:
            r7 = 128(0x80, float:1.794E-43)
        L_0x004c:
            r6 = r6 | r7
        L_0x004d:
            r7 = r14 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x005d
            boolean r7 = r13.b(r4)
            if (r7 == 0) goto L_0x005a
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x005c
        L_0x005a:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x005c:
            r6 = r6 | r7
        L_0x005d:
            r7 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x006d
            boolean r7 = r13.b(r15)
            if (r7 == 0) goto L_0x006a
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006c
        L_0x006a:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x006c:
            r6 = r6 | r7
        L_0x006d:
            r7 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 & r14
            r10 = r32
            if (r7 != 0) goto L_0x0080
            boolean r7 = r13.b(r10)
            if (r7 == 0) goto L_0x007d
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007f
        L_0x007d:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x007f:
            r6 = r6 | r7
        L_0x0080:
            r7 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 & r14
            if (r7 != 0) goto L_0x0091
            boolean r7 = r13.V(r3)
            if (r7 == 0) goto L_0x008e
            r7 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0090
        L_0x008e:
            r7 = 524288(0x80000, float:7.34684E-40)
        L_0x0090:
            r6 = r6 | r7
        L_0x0091:
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r7 = r7 & r14
            if (r7 != 0) goto L_0x00a2
            boolean r7 = r13.V(r2)
            if (r7 == 0) goto L_0x009f
            r7 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00a1
        L_0x009f:
            r7 = 4194304(0x400000, float:5.877472E-39)
        L_0x00a1:
            r6 = r6 | r7
        L_0x00a2:
            r7 = 100663296(0x6000000, float:2.4074124E-35)
            r7 = r7 & r14
            if (r7 != 0) goto L_0x00b3
            boolean r7 = r13.F(r0)
            if (r7 == 0) goto L_0x00b0
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00b2
        L_0x00b0:
            r7 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00b2:
            r6 = r6 | r7
        L_0x00b3:
            r9 = r6
            r6 = 38347923(0x2492493, float:1.4777644E-37)
            r6 = r6 & r9
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            if (r6 != r7) goto L_0x00ca
            boolean r6 = r13.l()
            if (r6 != 0) goto L_0x00c4
            goto L_0x00ca
        L_0x00c4:
            r13.L()
            r1 = r13
            goto L_0x02a9
        L_0x00ca:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00d6
            r6 = -1
            java.lang.String r7 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.LeftToolbarSection (DecorateSurface.kt:336)"
            U0.C4895p.S(r5, r9, r6, r7)
        L_0x00d6:
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            i1.c$a r24 = i1.C5437c.f24302a
            i1.c r5 = r24.h()
            androidx.compose.ui.d r5 = r1.a(r7, r5)
            r6 = 1907467018(0x71b1a30a, float:1.7592304E30)
            r13.W(r6)
            java.lang.Object r6 = r13.D()
            U0.m$a r17 = U0.C4889m.f14007a
            java.lang.Object r8 = r17.a()
            if (r6 != r8) goto L_0x00fc
            OG.G r6 = new OG.G
            r6.<init>()
            r13.u(r6)
        L_0x00fc:
            nI.l r6 = (nI.C17642l) r6
            r13.P()
            androidx.compose.ui.d r5 = androidx.compose.ui.draw.b.b(r5, r6)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r6 = r6.f()
            i1.c$c r8 = r24.l()
            r14 = 0
            E1.I r6 = androidx.compose.foundation.layout.G.b(r6, r8, r13, r14)
            int r8 = U0.C4883j.a(r13, r14)
            U0.y r14 = r13.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r13, r5)
            G1.g$a r25 = G1.C4504g.f6515W
            nI.a r1 = r25.a()
            U0.f r19 = r13.m()
            if (r19 != 0) goto L_0x012f
            U0.C4883j.c()
        L_0x012f:
            r13.I()
            boolean r19 = r13.i()
            if (r19 == 0) goto L_0x013c
            r13.p(r1)
            goto L_0x013f
        L_0x013c:
            r13.t()
        L_0x013f:
            U0.m r1 = U0.F1.a(r13)
            r19 = r7
            nI.p r7 = r25.c()
            U0.F1.c(r1, r6, r7)
            nI.p r6 = r25.e()
            U0.F1.c(r1, r14, r6)
            nI.p r6 = r25.b()
            boolean r7 = r1.i()
            if (r7 != 0) goto L_0x016b
            java.lang.Object r7 = r1.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r14)
            if (r7 != 0) goto L_0x0179
        L_0x016b:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r1.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r1.w(r7, r6)
        L_0x0179:
            nI.p r6 = r25.d()
            U0.F1.c(r1, r5, r6)
            s0.N r1 = s0.C5843N.f28726a
            if (r15 != 0) goto L_0x01a2
            if (r3 == 0) goto L_0x01a2
            if (r4 == 0) goto L_0x01a2
            r1 = -799375755(0xffffffffd05a7e75, float:-1.46628823E10)
            r13.W(r1)
            int r1 = r9 >> 18
            r1 = r1 & 14
            int r5 = r9 >> 21
            r5 = r5 & 112(0x70, float:1.57E-43)
            r1 = r1 | r5
            H0(r3, r0, r13, r1)
            r13.P()
            r26 = r9
            r1 = r13
            r3 = 0
            goto L_0x0207
        L_0x01a2:
            r1 = -799287777(0xffffffffd05bd61f, float:-1.47529718E10)
            r13.W(r1)
            r1 = -302865983(0xffffffffedf2a1c1, float:-9.386365E27)
            r13.W(r1)
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r9
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            if (r1 != r5) goto L_0x01b7
            r1 = 1
            goto L_0x01b8
        L_0x01b7:
            r1 = 0
        L_0x01b8:
            java.lang.Object r5 = r13.D()
            if (r1 != 0) goto L_0x01c4
            java.lang.Object r1 = r17.a()
            if (r5 != r1) goto L_0x01cc
        L_0x01c4:
            OG.H r5 = new OG.H
            r5.<init>(r0)
            r13.u(r5)
        L_0x01cc:
            r1 = r5
            nI.l r1 = (nI.C17642l) r1
            r13.P()
            int r5 = r9 >> 18
            r5 = r5 & 14
            r6 = r9 & 112(0x70, float:1.57E-43)
            r5 = r5 | r6
            r6 = r9 & 896(0x380, float:1.256E-42)
            r5 = r5 | r6
            int r6 = r9 >> 6
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r6
            int r6 = r9 << 6
            r7 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r7
            r14 = r5 | r6
            r17 = 16
            r20 = 0
            r5 = r33
            r6 = r28
            r7 = r29
            r8 = r32
            r26 = r9
            r9 = r20
            r10 = r1
            r11 = r31
            r12 = r13
            r1 = r13
            r13 = r14
            r3 = 0
            r14 = r17
            RG.j.j(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.P()
        L_0x0207:
            r1.x()
            float r18 = RG.j.F()
            r22 = 14
            r23 = 0
            r5 = 0
            r20 = 0
            r21 = 0
            r17 = r19
            r19 = r5
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r17, r18, r19, r20, r21, r22, r23)
            i1.c r6 = r24.o()
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r3)
            int r3 = U0.C4883j.a(r1, r3)
            U0.y r7 = r1.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r1, r5)
            nI.a r8 = r25.a()
            U0.f r9 = r1.m()
            if (r9 != 0) goto L_0x0240
            U0.C4883j.c()
        L_0x0240:
            r1.I()
            boolean r9 = r1.i()
            if (r9 == 0) goto L_0x024d
            r1.p(r8)
            goto L_0x0250
        L_0x024d:
            r1.t()
        L_0x0250:
            U0.m r8 = U0.F1.a(r1)
            nI.p r9 = r25.c()
            U0.F1.c(r8, r6, r9)
            nI.p r6 = r25.e()
            U0.F1.c(r8, r7, r6)
            nI.p r6 = r25.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x027a
            java.lang.Object r7 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
            if (r7 != 0) goto L_0x0288
        L_0x027a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r8.u(r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8.w(r3, r6)
        L_0x0288:
            nI.p r3 = r25.d()
            U0.F1.c(r8, r5, r3)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            int r5 = r26 >> 18
            r6 = r5 & 112(0x70, float:1.57E-43)
            r6 = r16 | r6
            r5 = r5 & 896(0x380, float:1.256E-42)
            r5 = r5 | r6
            VG.C16652e.g(r3, r2, r0, r1, r5)
            r1.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x02a9
            U0.C4895p.R()
        L_0x02a9:
            U0.Y0 r11 = r1.n()
            if (r11 == 0) goto L_0x02cc
            OG.I r12 = new OG.I
            r0 = r12
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x02cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OG.P.g0(s0.c, boolean, boolean, boolean, boolean, boolean, mG.b, VG.f, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h0(r1.f fVar) {
        C17542s.j(fVar, "$this$drawBehind");
        C5747v0.a aVar = C5747v0.f27350b;
        long o10 = C5747v0.o(aVar.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        float H12 = fVar.H1(h.B((float) 12));
        r1.f.M0(fVar, C5728l0.a.g(C5728l0.f27325b, C16877v.q(C5747v0.k(o10), C5747v0.k(aVar.h())), C5668h.a(C5673m.l(fVar.b()), 0.0f), C5668h.a(C5673m.l(fVar.b()) + H12, 0.0f), 0, 8, (Object) null), C5668h.a(C5673m.l(fVar.b()), 0.0f), C5674n.a(H12, C5673m.i(fVar.b())), 0.0f, (r1.g) null, (C5749w0) null, 0, 120, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i0(C17642l lVar, com.sugarcube.decorate.v2.internal.ui.surface.a aVar) {
        C17542s.j(aVar, "event");
        lVar.invoke(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j0(C5857c cVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C17597b bVar, C16653f fVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        g0(cVar, z10, z11, z12, z13, z14, bVar, fVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void k0(A1<? extends v<? extends DecorateEngine.RunState, ? extends DecorateEngine.DrawState>> a12, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-355624617);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(a12) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-355624617, i11, -1, "com.sugarcube.decorate.v2.internal.ui.surface.composable.LoadingScreen (DecorateSurface.kt:279)");
            }
            l0.d.g(((v) a12.getValue()).d() != DecorateEngine.DrawState.Drawing, (androidx.compose.ui.d) null, androidx.compose.animation.g.o((N) null, 0.0f, 3, (Object) null), androidx.compose.animation.g.q((N) null, 0.0f, 3, (Object) null), (String) null, C16133a.f136744a.a(), k10, 200064, 18);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C16151t(a12, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N l0(A1 a12, int i10, C4889m mVar, int i11) {
        k0(a12, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m0(s0.C5857c r26, com.sugarcube.decorate.v2.internal.DecorateEngineController r27, com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r28, androidx.compose.ui.d r29, U0.C4889m r30, int r31, int r32) {
        /*
            r1 = r26
            r8 = r28
            r9 = r31
            r0 = 1379959920(0x52408470, float:2.06713913E11)
            r2 = r30
            U0.m r10 = r2.k(r0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r32 & r2
            r3 = 2
            if (r2 == 0) goto L_0x0019
            r2 = r9 | 6
            goto L_0x0029
        L_0x0019:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x0028
            boolean r2 = r10.V(r1)
            if (r2 == 0) goto L_0x0025
            r2 = 4
            goto L_0x0026
        L_0x0025:
            r2 = r3
        L_0x0026:
            r2 = r2 | r9
            goto L_0x0029
        L_0x0028:
            r2 = r9
        L_0x0029:
            r4 = r32 & 1
            if (r4 == 0) goto L_0x0032
            r2 = r2 | 48
            r11 = r27
            goto L_0x0044
        L_0x0032:
            r4 = r9 & 48
            r11 = r27
            if (r4 != 0) goto L_0x0044
            boolean r4 = r10.F(r11)
            if (r4 == 0) goto L_0x0041
            r4 = 32
            goto L_0x0043
        L_0x0041:
            r4 = 16
        L_0x0043:
            r2 = r2 | r4
        L_0x0044:
            r4 = r32 & 2
            if (r4 == 0) goto L_0x004b
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x004b:
            r4 = r9 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0064
            r4 = r9 & 512(0x200, float:7.175E-43)
            if (r4 != 0) goto L_0x0058
            boolean r4 = r10.V(r8)
            goto L_0x005c
        L_0x0058:
            boolean r4 = r10.F(r8)
        L_0x005c:
            if (r4 == 0) goto L_0x0061
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r2 = r2 | r4
        L_0x0064:
            r4 = r32 & 4
            if (r4 == 0) goto L_0x006d
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r5 = r29
            goto L_0x007f
        L_0x006d:
            r5 = r9 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x006a
            r5 = r29
            boolean r6 = r10.V(r5)
            if (r6 == 0) goto L_0x007c
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r2 = r2 | r6
        L_0x007f:
            r6 = r2 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x0091
            boolean r6 = r10.l()
            if (r6 != 0) goto L_0x008c
            goto L_0x0091
        L_0x008c:
            r10.L()
            r4 = r5
            goto L_0x00f7
        L_0x0091:
            if (r4 == 0) goto L_0x0097
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r12 = r4
            goto L_0x0098
        L_0x0097:
            r12 = r5
        L_0x0098:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00a4
            r4 = -1
            java.lang.String r5 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.RenderSurface (DecorateSurface.kt:262)"
            U0.C4895p.S(r0, r2, r4, r5)
        L_0x00a4:
            r0 = 0
            r4 = 1
            r5 = 0
            androidx.compose.ui.d r13 = androidx.compose.foundation.layout.J.d(r12, r0, r4, r5)
            float r14 = RG.j.F()
            float r16 = XG.C16792g.s()
            r18 = 10
            r19 = 0
            r15 = 0
            r17 = 0
            androidx.compose.ui.d r20 = androidx.compose.foundation.layout.D.m(r13, r14, r15, r16, r17, r18, r19)
            int r0 = com.sugarcube.common.R.color.decorate_background
            r4 = 0
            long r21 = J1.b.a(r0, r10, r4)
            r24 = 2
            r25 = 0
            r23 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.d(r20, r21, r23, r24, r25)
            r6 = 1071877689(0x3fe38e39, float:1.7777778)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.C5074e.b(r0, r6, r4, r3, r5)
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c r3 = r3.e()
            androidx.compose.ui.d r4 = r1.a(r0, r3)
            int r0 = r2 >> 3
            r6 = r0 & 126(0x7e, float:1.77E-43)
            r7 = 0
            r2 = r27
            r3 = r28
            r5 = r10
            OG.q0.c(r2, r3, r4, r5, r6, r7)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00f6
            U0.C4895p.R()
        L_0x00f6:
            r4 = r12
        L_0x00f7:
            U0.Y0 r7 = r10.n()
            if (r7 == 0) goto L_0x0110
            OG.s r10 = new OG.s
            r0 = r10
            r1 = r26
            r2 = r27
            r3 = r28
            r5 = r31
            r6 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r10)
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OG.P.m0(s0.c, com.sugarcube.decorate.v2.internal.DecorateEngineController, com.sugarcube.decorate.v2.internal.manager.touch.TouchManager, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N n0(C5857c cVar, DecorateEngineController decorateEngineController, TouchManager touchManager, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        m0(cVar, decorateEngineController, touchManager, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void o0(s0.C5857c r27, OG.u0 r28, YG.l r29, nI.C17642l<? super java.lang.Float, lF.C14768a> r30, KJ.C15987c<java.lang.String> r31, mG.C17597b r32, boolean r33, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r34, nI.C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, XH.C16807N> r35, U0.C4889m r36, int r37, int r38) {
        /*
            r1 = r27
            r13 = r32
            r14 = r37
            r15 = r38
            r0 = 128(0x80, float:1.794E-43)
            r2 = 16
            r3 = 32
            r12 = 1
            r4 = 2
            r5 = 4
            r6 = -1648954251(0xffffffff9db6f475, float:-4.842776E-21)
            r7 = r36
            U0.m r11 = r7.k(r6)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 & r15
            if (r7 == 0) goto L_0x0022
            r7 = r14 | 6
            goto L_0x0032
        L_0x0022:
            r7 = r14 & 6
            if (r7 != 0) goto L_0x0031
            boolean r7 = r11.V(r1)
            if (r7 == 0) goto L_0x002e
            r7 = r5
            goto L_0x002f
        L_0x002e:
            r7 = r4
        L_0x002f:
            r7 = r7 | r14
            goto L_0x0032
        L_0x0031:
            r7 = r14
        L_0x0032:
            r8 = r15 & 1
            if (r8 == 0) goto L_0x003b
            r7 = r7 | 48
            r10 = r28
            goto L_0x004b
        L_0x003b:
            r8 = r14 & 48
            r10 = r28
            if (r8 != 0) goto L_0x004b
            boolean r8 = r11.V(r10)
            if (r8 == 0) goto L_0x0049
            r8 = r3
            goto L_0x004a
        L_0x0049:
            r8 = r2
        L_0x004a:
            r7 = r7 | r8
        L_0x004b:
            r4 = r4 & r15
            if (r4 == 0) goto L_0x0053
            r7 = r7 | 384(0x180, float:5.38E-43)
            r9 = r29
            goto L_0x0064
        L_0x0053:
            r4 = r14 & 384(0x180, float:5.38E-43)
            r9 = r29
            if (r4 != 0) goto L_0x0064
            boolean r4 = r11.V(r9)
            if (r4 == 0) goto L_0x0062
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0062:
            r4 = r0
        L_0x0063:
            r7 = r7 | r4
        L_0x0064:
            r4 = r15 & 4
            if (r4 == 0) goto L_0x006d
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            r8 = r30
            goto L_0x007f
        L_0x006d:
            r4 = r14 & 3072(0xc00, float:4.305E-42)
            r8 = r30
            if (r4 != 0) goto L_0x007f
            boolean r4 = r11.F(r8)
            if (r4 == 0) goto L_0x007c
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r7 = r7 | r4
        L_0x007f:
            r4 = r15 & 8
            if (r4 == 0) goto L_0x0088
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            r5 = r31
            goto L_0x009a
        L_0x0088:
            r4 = r14 & 24576(0x6000, float:3.4438E-41)
            r5 = r31
            if (r4 != 0) goto L_0x009a
            boolean r4 = r11.V(r5)
            if (r4 == 0) goto L_0x0097
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r7 = r7 | r4
        L_0x009a:
            r2 = r2 & r15
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00a1
            r7 = r7 | r4
            goto L_0x00b1
        L_0x00a1:
            r2 = r14 & r4
            if (r2 != 0) goto L_0x00b1
            boolean r2 = r11.V(r13)
            if (r2 == 0) goto L_0x00ae
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r7 = r7 | r2
        L_0x00b1:
            r2 = r15 & 32
            r3 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00bb
            r7 = r7 | r3
            r4 = r33
            goto L_0x00cd
        L_0x00bb:
            r2 = r14 & r3
            r4 = r33
            if (r2 != 0) goto L_0x00cd
            boolean r2 = r11.b(r4)
            if (r2 == 0) goto L_0x00ca
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r7 = r7 | r2
        L_0x00cd:
            r2 = r15 & 64
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00d7
            r7 = r7 | r3
        L_0x00d4:
            r3 = r34
            goto L_0x00e9
        L_0x00d7:
            r3 = r3 & r14
            if (r3 != 0) goto L_0x00d4
            r3 = r34
            boolean r16 = r11.F(r3)
            if (r16 == 0) goto L_0x00e5
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e7
        L_0x00e5:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e7:
            r7 = r7 | r16
        L_0x00e9:
            r0 = r0 & r15
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f3
            r7 = r7 | r16
        L_0x00f0:
            r0 = r35
            goto L_0x0106
        L_0x00f3:
            r0 = r14 & r16
            if (r0 != 0) goto L_0x00f0
            r0 = r35
            boolean r16 = r11.F(r0)
            if (r16 == 0) goto L_0x0102
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0104
        L_0x0102:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0104:
            r7 = r7 | r16
        L_0x0106:
            r16 = 38347923(0x2492493, float:1.4777644E-37)
            r12 = r7 & r16
            r6 = 38347922(0x2492492, float:1.4777643E-37)
            if (r12 != r6) goto L_0x011e
            boolean r6 = r11.l()
            if (r6 != 0) goto L_0x0117
            goto L_0x011e
        L_0x0117:
            r11.L()
            r8 = r3
            r0 = r11
            goto L_0x024d
        L_0x011e:
            if (r2 == 0) goto L_0x0123
            r26 = 0
            goto L_0x0125
        L_0x0123:
            r26 = r3
        L_0x0125:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0134
            r2 = -1
            java.lang.String r3 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.RightExpandableMenus (DecorateSurface.kt:463)"
            r12 = -1648954251(0xffffffff9db6f475, float:-4.842776E-21)
            U0.C4895p.S(r12, r7, r2, r3)
        L_0x0134:
            nG.a r16 = r28.c()
            androidx.compose.ui.d$a r18 = androidx.compose.ui.d.f18749a
            float r21 = XG.C16792g.s()
            r23 = 11
            r24 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r18, r19, r20, r21, r22, r23, r24)
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c r7 = r3.f()
            androidx.compose.ui.d r2 = r1.a(r2, r7)
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r7 = r7.f()
            i1.c$c r3 = r3.l()
            r12 = 0
            E1.I r3 = androidx.compose.foundation.layout.G.b(r7, r3, r11, r12)
            int r7 = U0.C4883j.a(r11, r12)
            U0.y r6 = r11.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r11, r2)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r12 = r18.a()
            U0.f r19 = r11.m()
            if (r19 != 0) goto L_0x0180
            U0.C4883j.c()
        L_0x0180:
            r11.I()
            boolean r19 = r11.i()
            if (r19 == 0) goto L_0x018d
            r11.p(r12)
            goto L_0x0190
        L_0x018d:
            r11.t()
        L_0x0190:
            U0.m r12 = U0.F1.a(r11)
            nI.p r0 = r18.c()
            U0.F1.c(r12, r3, r0)
            nI.p r0 = r18.e()
            U0.F1.c(r12, r6, r0)
            nI.p r0 = r18.b()
            boolean r3 = r12.i()
            if (r3 != 0) goto L_0x01ba
            java.lang.Object r3 = r12.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
            if (r3 != 0) goto L_0x01c8
        L_0x01ba:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r12.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r12.w(r3, r0)
        L_0x01c8:
            nI.p r0 = r18.d()
            U0.F1.c(r12, r2, r0)
            s0.N r0 = s0.C5843N.f28726a
            if (r13 == 0) goto L_0x01d8
            int r0 = r32.d()
            goto L_0x01d9
        L_0x01d8:
            r0 = 0
        L_0x01d9:
            if (r13 == 0) goto L_0x01e7
            RF.k r2 = r32.e()
            if (r2 == 0) goto L_0x01e7
            com.sugarcube.app.base.data.database.CachedCatalogItem r2 = r2.d()
            r6 = r2
            goto L_0x01e8
        L_0x01e7:
            r6 = 0
        L_0x01e8:
            r2 = 578456991(0x227a8d9f, float:3.3956291E-18)
            r11.W(r2)
            java.lang.Object r2 = r11.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0202
            OG.x r2 = new OG.x
            r2.<init>()
            r11.u(r2)
        L_0x0202:
            r18 = r2
            nI.l r18 = (nI.C17642l) r18
            r11.P()
            OG.P$e r12 = new OG.P$e
            r2 = r12
            r3 = r29
            r4 = r6
            r5 = r30
            r6 = r35
            r7 = r32
            r8 = r0
            r9 = r31
            r10 = r33
            r0 = r11
            r11 = r28
            r1 = r12
            r13 = 1
            r12 = r26
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = 54
            r3 = -1592508414(0xffffffffa1144002, float:-5.0229064E-19)
            c1.a r22 = c1.c.e(r3, r13, r1, r0, r2)
            r24 = 1597824(0x186180, float:2.239028E-39)
            r25 = 42
            r17 = 0
            r19 = 0
            java.lang.String r20 = "StripeTransition"
            r21 = 0
            r23 = r0
            androidx.compose.animation.a.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x024b
            U0.C4895p.R()
        L_0x024b:
            r8 = r26
        L_0x024d:
            U0.Y0 r12 = r0.n()
            if (r12 == 0) goto L_0x0270
            OG.F r13 = new OG.F
            r0 = r13
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r9 = r35
            r10 = r37
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OG.P.o0(s0.c, OG.u0, YG.l, nI.l, KJ.c, mG.b, boolean, nI.l, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final l0.i p0(androidx.compose.animation.d dVar) {
        C17542s.j(dVar, "$this$AnimatedContent");
        return androidx.compose.animation.a.e(androidx.compose.animation.g.D((N) null, new C16152u(), 1, (Object) null), androidx.compose.animation.g.I((N) null, new C16153v(), 1, (Object) null));
    }

    /* access modifiers changed from: private */
    public static final int q0(int i10) {
        return i10;
    }

    /* access modifiers changed from: private */
    public static final int r0(int i10) {
        return i10;
    }

    /* access modifiers changed from: private */
    public static final C16807N s0(C5857c cVar, u0 u0Var, l lVar, C17642l lVar2, C15987c cVar2, C17597b bVar, boolean z10, C17642l lVar3, C17642l lVar4, int i10, int i11, C4889m mVar, int i12) {
        o0(cVar, u0Var, lVar, lVar2, cVar2, bVar, z10, lVar3, lVar4, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t0(KJ.C15987c<java.lang.String> r17, mG.C17597b r18, boolean r19, OG.u0 r20, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r21, nI.C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, XH.C16807N> r22, U0.C4889m r23, int r24, int r25) {
        /*
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r7 = r24
            r0 = 1305846505(0x4dd5a2e9, float:4.48027936E8)
            r5 = r23
            U0.m r5 = r5.k(r0)
            r8 = r25 & 1
            r9 = 4
            if (r8 == 0) goto L_0x001d
            r8 = r7 | 6
            goto L_0x002d
        L_0x001d:
            r8 = r7 & 6
            if (r8 != 0) goto L_0x002c
            boolean r8 = r5.V(r1)
            if (r8 == 0) goto L_0x0029
            r8 = r9
            goto L_0x002a
        L_0x0029:
            r8 = 2
        L_0x002a:
            r8 = r8 | r7
            goto L_0x002d
        L_0x002c:
            r8 = r7
        L_0x002d:
            r10 = r25 & 2
            if (r10 == 0) goto L_0x0034
            r8 = r8 | 48
            goto L_0x0044
        L_0x0034:
            r10 = r7 & 48
            if (r10 != 0) goto L_0x0044
            boolean r10 = r5.V(r2)
            if (r10 == 0) goto L_0x0041
            r10 = 32
            goto L_0x0043
        L_0x0041:
            r10 = 16
        L_0x0043:
            r8 = r8 | r10
        L_0x0044:
            r10 = r25 & 4
            if (r10 == 0) goto L_0x004b
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x005b
        L_0x004b:
            r10 = r7 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x005b
            boolean r10 = r5.b(r3)
            if (r10 == 0) goto L_0x0058
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r8 = r8 | r10
        L_0x005b:
            r10 = r25 & 8
            if (r10 == 0) goto L_0x0062
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x0072
        L_0x0062:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0072
            boolean r10 = r5.V(r4)
            if (r10 == 0) goto L_0x006f
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006f:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r8 = r8 | r10
        L_0x0072:
            r10 = r25 & 16
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x007d
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x007a:
            r13 = r21
            goto L_0x008e
        L_0x007d:
            r13 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007a
            r13 = r21
            boolean r14 = r5.F(r13)
            if (r14 == 0) goto L_0x008b
            r14 = r12
            goto L_0x008d
        L_0x008b:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x008d:
            r8 = r8 | r14
        L_0x008e:
            r14 = r25 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            r11 = 131072(0x20000, float:1.83671E-40)
            if (r14 == 0) goto L_0x0098
            r8 = r8 | r15
            goto L_0x00a7
        L_0x0098:
            r14 = r7 & r15
            if (r14 != 0) goto L_0x00a7
            boolean r14 = r5.F(r6)
            if (r14 == 0) goto L_0x00a4
            r14 = r11
            goto L_0x00a6
        L_0x00a4:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00a6:
            r8 = r8 | r14
        L_0x00a7:
            r14 = 74899(0x12493, float:1.04956E-40)
            r14 = r14 & r8
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00bc
            boolean r14 = r5.l()
            if (r14 != 0) goto L_0x00b7
            goto L_0x00bc
        L_0x00b7:
            r5.L()
            goto L_0x0171
        L_0x00bc:
            r14 = 0
            if (r10 == 0) goto L_0x00c1
            r15 = r14
            goto L_0x00c2
        L_0x00c1:
            r15 = r13
        L_0x00c2:
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x00ce
            r10 = -1
            java.lang.String r13 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.RightProductInfoDrawerSection (DecorateSurface.kt:680)"
            U0.C4895p.S(r0, r8, r10, r13)
        L_0x00ce:
            if (r2 != 0) goto L_0x00d2
            goto L_0x0167
        L_0x00d2:
            r0 = -1125350742(0xffffffffbcec82aa, float:-0.0288709)
            r5.W(r0)
            if (r4 == 0) goto L_0x00de
            nG.a r14 = r20.c()
        L_0x00de:
            boolean r0 = r14 instanceof nG.C17621a.b
            if (r0 == 0) goto L_0x0164
            KG.g r10 = KG.g.FROM_RIGHT_TO_LEFT
            r0 = -1465436257(0xffffffffa8a7379f, float:-1.8564846E-14)
            r5.W(r0)
            r0 = r8 & 14
            r14 = 1
            if (r0 != r9) goto L_0x00f1
            r0 = r14
            goto L_0x00f2
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r8
            if (r9 != r11) goto L_0x00fa
            r16 = r14
            goto L_0x00fc
        L_0x00fa:
            r16 = 0
        L_0x00fc:
            r0 = r0 | r16
            r16 = 57344(0xe000, float:8.0356E-41)
            r13 = r8 & r16
            if (r13 != r12) goto L_0x0107
            r12 = r14
            goto L_0x0108
        L_0x0107:
            r12 = 0
        L_0x0108:
            r0 = r0 | r12
            r8 = r8 & 896(0x380, float:1.256E-42)
            r12 = 256(0x100, float:3.59E-43)
            if (r8 != r12) goto L_0x0111
            r8 = r14
            goto L_0x0112
        L_0x0111:
            r8 = 0
        L_0x0112:
            r0 = r0 | r8
            java.lang.Object r8 = r5.D()
            if (r0 != 0) goto L_0x0121
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r8 != r0) goto L_0x0129
        L_0x0121:
            OG.C r8 = new OG.C
            r8.<init>(r1, r6, r15, r3)
            r5.u(r8)
        L_0x0129:
            nI.p r8 = (nI.p) r8
            r5.P()
            java.lang.Object r0 = NF.C13291e.c(r4, r2, r8)
            nI.p r0 = (nI.p) r0
            r8 = -1465441205(0xffffffffa8a7244b, float:-1.8556464E-14)
            r5.W(r8)
            if (r9 != r11) goto L_0x013e
            r13 = r14
            goto L_0x013f
        L_0x013e:
            r13 = 0
        L_0x013f:
            java.lang.Object r8 = r5.D()
            if (r13 != 0) goto L_0x014d
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r8 != r9) goto L_0x0155
        L_0x014d:
            OG.D r8 = new OG.D
            r8.<init>(r6)
            r5.u(r8)
        L_0x0155:
            nI.a r8 = (nI.C17631a) r8
            r5.P()
            r13 = 384(0x180, float:5.38E-43)
            r14 = 8
            r11 = 0
            r9 = r0
            r12 = r5
            d0(r8, r9, r10, r11, r12, r13, r14)
        L_0x0164:
            r5.P()
        L_0x0167:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0170
            U0.C4895p.R()
        L_0x0170:
            r13 = r15
        L_0x0171:
            U0.Y0 r9 = r5.n()
            if (r9 == 0) goto L_0x018f
            OG.E r10 = new OG.E
            r0 = r10
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r13
            r6 = r22
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OG.P.t0(KJ.c, mG.b, boolean, OG.u0, nI.l, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final p u0(C15987c cVar, C17642l lVar, C17642l lVar2, boolean z10, u0 u0Var, C17597b bVar) {
        C17542s.j(u0Var, "state");
        C17542s.j(bVar, "selectedInstance");
        return c1.c.c(-1014497738, true, new f(bVar, cVar, lVar, lVar2, z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N v0(C17642l lVar) {
        lVar.invoke(a.C17131k.f142627a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w0(C15987c cVar, C17597b bVar, boolean z10, u0 u0Var, C17642l lVar, C17642l lVar2, int i10, int i11, C4889m mVar, int i12) {
        t0(cVar, bVar, z10, u0Var, lVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void x0(s0.C5857c r26, OG.l0 r27, UG.C16569f r28, SG.C16415m r29, nI.C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, XH.C16807N> r30, U0.C4889m r31, int r32) {
        /*
            r1 = r26
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r32
            r0 = -1903886504(0xffffffff8e84ff58, float:-3.27864E-30)
            r2 = r31
            U0.m r14 = r2.k(r0)
            r2 = r13 & 6
            if (r2 != 0) goto L_0x0022
            boolean r2 = r14.V(r1)
            if (r2 == 0) goto L_0x001f
            r2 = 4
            goto L_0x0020
        L_0x001f:
            r2 = 2
        L_0x0020:
            r2 = r2 | r13
            goto L_0x0023
        L_0x0022:
            r2 = r13
        L_0x0023:
            r3 = r13 & 48
            r15 = r27
            if (r3 != 0) goto L_0x0035
            boolean r3 = r14.V(r15)
            if (r3 == 0) goto L_0x0032
            r3 = 32
            goto L_0x0034
        L_0x0032:
            r3 = 16
        L_0x0034:
            r2 = r2 | r3
        L_0x0035:
            r3 = r13 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0045
            boolean r3 = r14.V(r10)
            if (r3 == 0) goto L_0x0042
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0044
        L_0x0042:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0044:
            r2 = r2 | r3
        L_0x0045:
            r3 = r13 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0055
            boolean r3 = r14.F(r11)
            if (r3 == 0) goto L_0x0052
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0054
        L_0x0052:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0054:
            r2 = r2 | r3
        L_0x0055:
            r3 = r13 & 24576(0x6000, float:3.4438E-41)
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r3 != 0) goto L_0x0066
            boolean r3 = r14.F(r12)
            if (r3 == 0) goto L_0x0063
            r3 = r4
            goto L_0x0065
        L_0x0063:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0065:
            r2 = r2 | r3
        L_0x0066:
            r3 = r2 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r5) goto L_0x0078
            boolean r3 = r14.l()
            if (r3 != 0) goto L_0x0073
            goto L_0x0078
        L_0x0073:
            r14.L()
            goto L_0x02d8
        L_0x0078:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0084
            r3 = -1
            java.lang.String r5 = "com.sugarcube.decorate.v2.internal.ui.surface.composable.RightToolbarSection (DecorateSurface.kt:593)"
            U0.C4895p.S(r0, r2, r3, r5)
        L_0x0084:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c r5 = r3.f()
            androidx.compose.ui.d r16 = r1.a(r0, r5)
            r0 = 12
            float r0 = (float) r0
            float r17 = c2.h.B(r0)
            r24 = 30
            r25 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            androidx.compose.ui.d r0 = m1.m.b(r16, r17, r18, r19, r20, r22, r24, r25)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r5 = r5.f()
            i1.c$c r3 = r3.l()
            r6 = 0
            E1.I r3 = androidx.compose.foundation.layout.G.b(r5, r3, r14, r6)
            int r5 = U0.C4883j.a(r14, r6)
            U0.y r7 = r14.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r14, r0)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r16 = r14.m()
            if (r16 != 0) goto L_0x00d1
            U0.C4883j.c()
        L_0x00d1:
            r14.I()
            boolean r16 = r14.i()
            if (r16 == 0) goto L_0x00de
            r14.p(r9)
            goto L_0x00e1
        L_0x00de:
            r14.t()
        L_0x00e1:
            U0.m r9 = U0.F1.a(r14)
            nI.p r6 = r8.c()
            U0.F1.c(r9, r3, r6)
            nI.p r3 = r8.e()
            U0.F1.c(r9, r7, r3)
            nI.p r3 = r8.b()
            boolean r6 = r9.i()
            if (r6 != 0) goto L_0x010b
            java.lang.Object r6 = r9.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r7)
            if (r6 != 0) goto L_0x0119
        L_0x010b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.w(r5, r3)
        L_0x0119:
            nI.p r3 = r8.d()
            U0.F1.c(r9, r0, r3)
            s0.N r0 = s0.C5843N.f28726a
            OG.v0 r0 = r27.q()
            r3 = 57344(0xe000, float:8.0356E-41)
            r5 = 1
            if (r0 != 0) goto L_0x01bb
            if (r10 == 0) goto L_0x01bb
            r0 = -777199121(0xffffffffd1ace1ef, float:-9.2815614E10)
            r14.W(r0)
            r0 = -1687635588(0xffffffff9b68b97c, float:-1.9250523E-22)
            r14.W(r0)
            r0 = r2 & r3
            if (r0 != r4) goto L_0x0140
            r3 = r5
            goto L_0x0141
        L_0x0140:
            r3 = 0
        L_0x0141:
            java.lang.Object r6 = r14.D()
            if (r3 != 0) goto L_0x014f
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0157
        L_0x014f:
            OG.J r6 = new OG.J
            r6.<init>(r12)
            r14.u(r6)
        L_0x0157:
            nI.a r6 = (nI.C17631a) r6
            r14.P()
            r3 = -1687633057(0xffffffff9b68c35f, float:-1.9253718E-22)
            r14.W(r3)
            if (r0 != r4) goto L_0x0166
            r3 = r5
            goto L_0x0167
        L_0x0166:
            r3 = 0
        L_0x0167:
            java.lang.Object r7 = r14.D()
            if (r3 != 0) goto L_0x0175
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r7 != r3) goto L_0x017d
        L_0x0175:
            OG.K r7 = new OG.K
            r7.<init>(r12)
            r14.u(r7)
        L_0x017d:
            nI.a r7 = (nI.C17631a) r7
            r14.P()
            r3 = -1687630433(0xffffffff9b68cd9f, float:-1.925703E-22)
            r14.W(r3)
            if (r0 != r4) goto L_0x018b
            goto L_0x018c
        L_0x018b:
            r5 = 0
        L_0x018c:
            java.lang.Object r0 = r14.D()
            if (r5 != 0) goto L_0x019a
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r0 != r3) goto L_0x01a2
        L_0x019a:
            OG.L r0 = new OG.L
            r0.<init>(r12)
            r14.u(r0)
        L_0x01a2:
            nI.a r0 = (nI.C17631a) r0
            r14.P()
            int r2 = r2 >> 6
            r8 = r2 & 14
            r9 = 2
            r3 = 0
            r2 = r28
            r4 = r6
            r5 = r7
            r6 = r0
            r7 = r14
            UG.C16568e.e(r2, r3, r4, r5, r6, r7, r8, r9)
            r14.P()
            goto L_0x02cc
        L_0x01bb:
            OG.v0 r0 = r27.q()
            if (r0 != 0) goto L_0x0226
            boolean r0 = r27.A()
            if (r0 == 0) goto L_0x0226
            r0 = -776778451(0xffffffffd1b34d2d, float:-9.6261743E10)
            r14.W(r0)
            KJ.c r0 = r27.k()
            r6 = -1687621778(0xffffffff9b68ef6e, float:-1.9267954E-22)
            r14.W(r6)
            r2 = r2 & r3
            if (r2 != r4) goto L_0x01dc
            r3 = r5
            goto L_0x01dd
        L_0x01dc:
            r3 = 0
        L_0x01dd:
            java.lang.Object r6 = r14.D()
            if (r3 != 0) goto L_0x01eb
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x01f3
        L_0x01eb:
            OG.c r6 = new OG.c
            r6.<init>(r12)
            r14.u(r6)
        L_0x01f3:
            nI.l r6 = (nI.C17642l) r6
            r14.P()
            r3 = -1687616801(0xffffffff9b6902df, float:-1.9274236E-22)
            r14.W(r3)
            if (r2 != r4) goto L_0x0201
            goto L_0x0202
        L_0x0201:
            r5 = 0
        L_0x0202:
            java.lang.Object r2 = r14.D()
            if (r5 != 0) goto L_0x0210
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0218
        L_0x0210:
            OG.d r2 = new OG.d
            r2.<init>(r12)
            r14.u(r2)
        L_0x0218:
            nI.a r2 = (nI.C17631a) r2
            r14.P()
            r7 = 0
            TG.C16486c.c(r0, r6, r2, r14, r7)
            r14.P()
            goto L_0x02cc
        L_0x0226:
            r7 = 0
            if (r11 == 0) goto L_0x0290
            r0 = -776376846(0xffffffffd1b96df2, float:-9.9551691E10)
            r14.W(r0)
            SG.b r0 = r29.c()
            r6 = -1687603226(0xffffffff9b6937e6, float:-1.929137E-22)
            r14.W(r6)
            r2 = r2 & r3
            if (r2 != r4) goto L_0x023e
            r3 = r5
            goto L_0x023f
        L_0x023e:
            r3 = r7
        L_0x023f:
            java.lang.Object r6 = r14.D()
            if (r3 != 0) goto L_0x024d
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0255
        L_0x024d:
            OG.e r6 = new OG.e
            r6.<init>(r12)
            r14.u(r6)
        L_0x0255:
            r3 = r6
            nI.a r3 = (nI.C17631a) r3
            r14.P()
            r6 = -1687607652(0xffffffff9b69269c, float:-1.9285784E-22)
            r14.W(r6)
            if (r2 != r4) goto L_0x0265
            r6 = r5
            goto L_0x0266
        L_0x0265:
            r6 = r7
        L_0x0266:
            java.lang.Object r2 = r14.D()
            if (r6 != 0) goto L_0x0274
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x027c
        L_0x0274:
            OG.f r2 = new OG.f
            r2.<init>(r12)
            r14.u(r2)
        L_0x027c:
            r4 = r2
            nI.l r4 = (nI.C17642l) r4
            r14.P()
            r8 = 0
            r9 = 24
            r5 = 0
            r6 = 0
            r2 = r0
            r7 = r14
            SG.C16413k.n(r2, r3, r4, r5, r6, r7, r8, r9)
            r14.P()
            goto L_0x02cc
        L_0x0290:
            r0 = -775979922(0xffffffffd1bf7c6e, float:-1.02803292E11)
            r14.W(r0)
            r0 = -1687596374(0xffffffff9b6952aa, float:-1.9300018E-22)
            r14.W(r0)
            r0 = r2 & r3
            if (r0 != r4) goto L_0x02a2
            r6 = r5
            goto L_0x02a3
        L_0x02a2:
            r6 = r7
        L_0x02a3:
            java.lang.Object r0 = r14.D()
            if (r6 != 0) goto L_0x02b1
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r0 != r3) goto L_0x02b9
        L_0x02b1:
            OG.g r0 = new OG.g
            r0.<init>(r12)
            r14.u(r0)
        L_0x02b9:
            r4 = r0
            nI.l r4 = (nI.C17642l) r4
            r14.P()
            r6 = r2 & 112(0x70, float:1.57E-43)
            r7 = 1
            r2 = 0
            r3 = r27
            r5 = r14
            XG.C16792g.f(r2, r3, r4, r5, r6, r7)
            r14.P()
        L_0x02cc:
            r14.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02d8
            U0.C4895p.R()
        L_0x02d8:
            U0.Y0 r7 = r14.n()
            if (r7 == 0) goto L_0x02f3
            OG.h r8 = new OG.h
            r0 = r8
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x02f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OG.P.x0(s0.c, OG.l0, UG.f, SG.m, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N y0(C17642l lVar) {
        lVar.invoke(a.C17140t.f142636a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z0(C17642l lVar) {
        lVar.invoke(a.C17142v.f142638a);
        return C16807N.f139792a;
    }
}
