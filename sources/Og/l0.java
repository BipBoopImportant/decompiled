package OG;

import JG.C15929K;
import KJ.C15987c;
import MG.C16038g;
import PG.C16186d;
import RF.k;
import SG.C16415m;
import UG.C16569f;
import VG.C16653f;
import XG.C16793h;
import YG.l;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.network.models.UploadKt;
import kG.C17497c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sG.r;
import uG.C18048l;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\bC\b\b\u0018\u00002\u00020\u0001B±\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020-0*\u0012\b\b\u0002\u0010/\u001a\u00020\u0002¢\u0006\u0004\b0\u00101Jº\u0002\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020-0*2\b\b\u0002\u0010/\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020+HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010<\u001a\u0004\b\u0003\u0010=R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b?\u0010=R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bF\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010<\u001a\u0004\bP\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bH\u0010bR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bD\u0010eR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bc\u0010hR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bV\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bj\u0010l\u001a\u0004\b`\u0010mR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bR\u0010n\u001a\u0004\bo\u0010pR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bf\u0010sR\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010<\u001a\u0004\bt\u0010=R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010<\u001a\u0004\bu\u0010=R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bo\u0010<\u001a\u0004\bO\u0010=R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bv\u0010<\u001a\u0004\bv\u0010=R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010<\u001a\u0004\bX\u0010=R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010<\u001a\u0004\bT\u0010=R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006¢\u0006\f\n\u0004\bt\u0010w\u001a\u0004\bq\u0010xR\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0*8\u0006¢\u0006\f\n\u0004\bu\u0010w\u001a\u0004\b\\\u0010xR\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010<\u001a\u0004\b@\u0010=¨\u0006y"}, d2 = {"LOG/l0;", "", "", "isLoading", "isShowingSmileFeedback", "LOG/s0;", "featureConfig", "LJG/K;", "dialogUiState", "LMG/g;", "statusDialogUiState", "LSG/m;", "wallColorPickerState", "isShowingItemList", "LOG/v0;", "selection", "LVG/f;", "multiviewToolbarState", "LXG/h;", "universeToolbarState", "LPG/d;", "zoomIndicatorState", "LsG/r;", "cartState", "LuG/l;", "browseState", "LUG/f;", "magicEraserState", "LOG/u0;", "rightToolbarState", "LOG/t0;", "leftToolbarState", "LYG/l;", "variantsStripeState", "LkG/c;", "metadata", "isDirty", "isEmpty", "eraseSupported", "viewsSupported", "helaWallColorSupported", "focusModeActive", "LKJ/c;", "", "shoppingListItems", "LRF/k;", "itemList", "authStarted", "<init>", "(ZZLOG/s0;LJG/K;LMG/g;LSG/m;ZLOG/v0;LVG/f;LXG/h;LPG/d;LsG/r;LuG/l;LUG/f;LOG/u0;LOG/t0;LYG/l;LkG/c;ZZZZZZLKJ/c;LKJ/c;Z)V", "a", "(ZZLOG/s0;LJG/K;LMG/g;LSG/m;ZLOG/v0;LVG/f;LXG/h;LPG/d;LsG/r;LuG/l;LUG/f;LOG/u0;LOG/t0;LYG/l;LkG/c;ZZZZZZLKJ/c;LKJ/c;Z)LOG/l0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "b", "B", "c", "LOG/s0;", "h", "()LOG/s0;", "d", "LJG/K;", "f", "()LJG/K;", "e", "LMG/g;", "s", "()LMG/g;", "LSG/m;", "w", "()LSG/m;", "g", "A", "LOG/v0;", "q", "()LOG/v0;", "i", "LVG/f;", "o", "()LVG/f;", "j", "LXG/h;", "t", "()LXG/h;", "k", "LPG/d;", "x", "()LPG/d;", "l", "LsG/r;", "()LsG/r;", "m", "LuG/l;", "()LuG/l;", "n", "LUG/f;", "()LUG/f;", "LOG/u0;", "p", "()LOG/u0;", "LOG/t0;", "()LOG/t0;", "LYG/l;", "u", "()LYG/l;", "r", "LkG/c;", "()LkG/c;", "y", "z", "v", "LKJ/c;", "()LKJ/c;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 {

    /* renamed from: A  reason: collision with root package name */
    private final boolean f136783A;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f136784a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f136785b;

    /* renamed from: c  reason: collision with root package name */
    private final s0 f136786c;

    /* renamed from: d  reason: collision with root package name */
    private final C15929K f136787d;

    /* renamed from: e  reason: collision with root package name */
    private final C16038g f136788e;

    /* renamed from: f  reason: collision with root package name */
    private final C16415m f136789f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f136790g;

    /* renamed from: h  reason: collision with root package name */
    private final v0 f136791h;

    /* renamed from: i  reason: collision with root package name */
    private final C16653f f136792i;

    /* renamed from: j  reason: collision with root package name */
    private final C16793h f136793j;

    /* renamed from: k  reason: collision with root package name */
    private final C16186d f136794k;

    /* renamed from: l  reason: collision with root package name */
    private final r f136795l;

    /* renamed from: m  reason: collision with root package name */
    private final C18048l f136796m;

    /* renamed from: n  reason: collision with root package name */
    private final C16569f f136797n;

    /* renamed from: o  reason: collision with root package name */
    private final u0 f136798o;

    /* renamed from: p  reason: collision with root package name */
    private final t0 f136799p;

    /* renamed from: q  reason: collision with root package name */
    private final l f136800q;

    /* renamed from: r  reason: collision with root package name */
    private final C17497c f136801r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f136802s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f136803t;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f136804u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f136805v;

    /* renamed from: w  reason: collision with root package name */
    private final boolean f136806w;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f136807x;

    /* renamed from: y  reason: collision with root package name */
    private final C15987c<String> f136808y;

    /* renamed from: z  reason: collision with root package name */
    private final C15987c<k> f136809z;

    public l0() {
        this(false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217727, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ l0 b(l0 l0Var, boolean z10, boolean z11, s0 s0Var, C15929K k10, C16038g gVar, C16415m mVar, boolean z12, v0 v0Var, C16653f fVar, C16793h hVar, C16186d dVar, r rVar, C18048l lVar, C16569f fVar2, u0 u0Var, t0 t0Var, l lVar2, C17497c cVar, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, C15987c cVar2, C15987c cVar3, boolean z19, int i10, Object obj) {
        l0 l0Var2 = l0Var;
        int i11 = i10;
        return l0Var.a((i11 & 1) != 0 ? l0Var2.f136784a : z10, (i11 & 2) != 0 ? l0Var2.f136785b : z11, (i11 & 4) != 0 ? l0Var2.f136786c : s0Var, (i11 & 8) != 0 ? l0Var2.f136787d : k10, (i11 & 16) != 0 ? l0Var2.f136788e : gVar, (i11 & 32) != 0 ? l0Var2.f136789f : mVar, (i11 & 64) != 0 ? l0Var2.f136790g : z12, (i11 & 128) != 0 ? l0Var2.f136791h : v0Var, (i11 & 256) != 0 ? l0Var2.f136792i : fVar, (i11 & 512) != 0 ? l0Var2.f136793j : hVar, (i11 & 1024) != 0 ? l0Var2.f136794k : dVar, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? l0Var2.f136795l : rVar, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? l0Var2.f136796m : lVar, (i11 & 8192) != 0 ? l0Var2.f136797n : fVar2, (i11 & 16384) != 0 ? l0Var2.f136798o : u0Var, (i11 & 32768) != 0 ? l0Var2.f136799p : t0Var, (i11 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? l0Var2.f136800q : lVar2, (i11 & 131072) != 0 ? l0Var2.f136801r : cVar, (i11 & 262144) != 0 ? l0Var2.f136802s : z13, (i11 & ImageMetadata.LENS_APERTURE) != 0 ? l0Var2.f136803t : z14, (i11 & ImageMetadata.SHADING_MODE) != 0 ? l0Var2.f136804u : z15, (i11 & UploadKt.MAX_CHUNK_SIZE) != 0 ? l0Var2.f136805v : z16, (i11 & 4194304) != 0 ? l0Var2.f136806w : z17, (i11 & 8388608) != 0 ? l0Var2.f136807x : z18, (i11 & 16777216) != 0 ? l0Var2.f136808y : cVar2, (i11 & 33554432) != 0 ? l0Var2.f136809z : cVar3, (i11 & 67108864) != 0 ? l0Var2.f136783A : z19);
    }

    public final boolean A() {
        return this.f136790g;
    }

    public final boolean B() {
        return this.f136785b;
    }

    public final l0 a(boolean z10, boolean z11, s0 s0Var, C15929K k10, C16038g gVar, C16415m mVar, boolean z12, v0 v0Var, C16653f fVar, C16793h hVar, C16186d dVar, r rVar, C18048l lVar, C16569f fVar2, u0 u0Var, t0 t0Var, l lVar2, C17497c cVar, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, C15987c<String> cVar2, C15987c<k> cVar3, boolean z19) {
        boolean z20 = z10;
        C17542s.j(s0Var, "featureConfig");
        C17542s.j(k10, "dialogUiState");
        C17542s.j(gVar, "statusDialogUiState");
        C17542s.j(hVar, "universeToolbarState");
        C17542s.j(dVar, "zoomIndicatorState");
        C17542s.j(u0Var, "rightToolbarState");
        C17542s.j(t0Var, "leftToolbarState");
        C17542s.j(cVar2, "shoppingListItems");
        C17542s.j(cVar3, "itemList");
        return new l0(z10, z11, s0Var, k10, gVar, mVar, z12, v0Var, fVar, hVar, dVar, rVar, lVar, fVar2, u0Var, t0Var, lVar2, cVar, z13, z14, z15, z16, z17, z18, cVar2, cVar3, z19);
    }

    public final boolean c() {
        return this.f136783A;
    }

    public final C18048l d() {
        return this.f136796m;
    }

    public final r e() {
        return this.f136795l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f136784a == l0Var.f136784a && this.f136785b == l0Var.f136785b && C17542s.e(this.f136786c, l0Var.f136786c) && C17542s.e(this.f136787d, l0Var.f136787d) && C17542s.e(this.f136788e, l0Var.f136788e) && C17542s.e(this.f136789f, l0Var.f136789f) && this.f136790g == l0Var.f136790g && C17542s.e(this.f136791h, l0Var.f136791h) && C17542s.e(this.f136792i, l0Var.f136792i) && C17542s.e(this.f136793j, l0Var.f136793j) && C17542s.e(this.f136794k, l0Var.f136794k) && C17542s.e(this.f136795l, l0Var.f136795l) && C17542s.e(this.f136796m, l0Var.f136796m) && C17542s.e(this.f136797n, l0Var.f136797n) && C17542s.e(this.f136798o, l0Var.f136798o) && C17542s.e(this.f136799p, l0Var.f136799p) && C17542s.e(this.f136800q, l0Var.f136800q) && C17542s.e(this.f136801r, l0Var.f136801r) && this.f136802s == l0Var.f136802s && this.f136803t == l0Var.f136803t && this.f136804u == l0Var.f136804u && this.f136805v == l0Var.f136805v && this.f136806w == l0Var.f136806w && this.f136807x == l0Var.f136807x && C17542s.e(this.f136808y, l0Var.f136808y) && C17542s.e(this.f136809z, l0Var.f136809z) && this.f136783A == l0Var.f136783A;
    }

    public final C15929K f() {
        return this.f136787d;
    }

    public final boolean g() {
        return this.f136804u;
    }

    public final s0 h() {
        return this.f136786c;
    }

    public int hashCode() {
        int hashCode = ((((((((Boolean.hashCode(this.f136784a) * 31) + Boolean.hashCode(this.f136785b)) * 31) + this.f136786c.hashCode()) * 31) + this.f136787d.hashCode()) * 31) + this.f136788e.hashCode()) * 31;
        C16415m mVar = this.f136789f;
        int i10 = 0;
        int hashCode2 = (((hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31) + Boolean.hashCode(this.f136790g)) * 31;
        v0 v0Var = this.f136791h;
        int hashCode3 = (hashCode2 + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        C16653f fVar = this.f136792i;
        int hashCode4 = (((((hashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31) + this.f136793j.hashCode()) * 31) + this.f136794k.hashCode()) * 31;
        r rVar = this.f136795l;
        int hashCode5 = (hashCode4 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        C18048l lVar = this.f136796m;
        int hashCode6 = (hashCode5 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        C16569f fVar2 = this.f136797n;
        int hashCode7 = (((((hashCode6 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31) + this.f136798o.hashCode()) * 31) + this.f136799p.hashCode()) * 31;
        l lVar2 = this.f136800q;
        int hashCode8 = (hashCode7 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        C17497c cVar = this.f136801r;
        if (cVar != null) {
            i10 = cVar.hashCode();
        }
        return ((((((((((((((((((hashCode8 + i10) * 31) + Boolean.hashCode(this.f136802s)) * 31) + Boolean.hashCode(this.f136803t)) * 31) + Boolean.hashCode(this.f136804u)) * 31) + Boolean.hashCode(this.f136805v)) * 31) + Boolean.hashCode(this.f136806w)) * 31) + Boolean.hashCode(this.f136807x)) * 31) + this.f136808y.hashCode()) * 31) + this.f136809z.hashCode()) * 31) + Boolean.hashCode(this.f136783A);
    }

    public final boolean i() {
        return this.f136807x;
    }

    public final boolean j() {
        return this.f136806w;
    }

    public final C15987c<k> k() {
        return this.f136809z;
    }

    public final t0 l() {
        return this.f136799p;
    }

    public final C16569f m() {
        return this.f136797n;
    }

    public final C17497c n() {
        return this.f136801r;
    }

    public final C16653f o() {
        return this.f136792i;
    }

    public final u0 p() {
        return this.f136798o;
    }

    public final v0 q() {
        return this.f136791h;
    }

    public final C15987c<String> r() {
        return this.f136808y;
    }

    public final C16038g s() {
        return this.f136788e;
    }

    public final C16793h t() {
        return this.f136793j;
    }

    public String toString() {
        boolean z10 = this.f136784a;
        boolean z11 = this.f136785b;
        s0 s0Var = this.f136786c;
        C15929K k10 = this.f136787d;
        C16038g gVar = this.f136788e;
        C16415m mVar = this.f136789f;
        boolean z12 = this.f136790g;
        v0 v0Var = this.f136791h;
        C16653f fVar = this.f136792i;
        C16793h hVar = this.f136793j;
        C16186d dVar = this.f136794k;
        r rVar = this.f136795l;
        C18048l lVar = this.f136796m;
        C16569f fVar2 = this.f136797n;
        u0 u0Var = this.f136798o;
        t0 t0Var = this.f136799p;
        l lVar2 = this.f136800q;
        C17497c cVar = this.f136801r;
        boolean z13 = this.f136802s;
        boolean z14 = this.f136803t;
        boolean z15 = this.f136804u;
        boolean z16 = this.f136805v;
        boolean z17 = this.f136806w;
        boolean z18 = this.f136807x;
        C15987c<String> cVar2 = this.f136808y;
        C15987c<k> cVar3 = this.f136809z;
        boolean z19 = this.f136783A;
        return "DecorateSurfaceUIState(isLoading=" + z10 + ", isShowingSmileFeedback=" + z11 + ", featureConfig=" + s0Var + ", dialogUiState=" + k10 + ", statusDialogUiState=" + gVar + ", wallColorPickerState=" + mVar + ", isShowingItemList=" + z12 + ", selection=" + v0Var + ", multiviewToolbarState=" + fVar + ", universeToolbarState=" + hVar + ", zoomIndicatorState=" + dVar + ", cartState=" + rVar + ", browseState=" + lVar + ", magicEraserState=" + fVar2 + ", rightToolbarState=" + u0Var + ", leftToolbarState=" + t0Var + ", variantsStripeState=" + lVar2 + ", metadata=" + cVar + ", isDirty=" + z13 + ", isEmpty=" + z14 + ", eraseSupported=" + z15 + ", viewsSupported=" + z16 + ", helaWallColorSupported=" + z17 + ", focusModeActive=" + z18 + ", shoppingListItems=" + cVar2 + ", itemList=" + cVar3 + ", authStarted=" + z19 + ")";
    }

    public final l u() {
        return this.f136800q;
    }

    public final boolean v() {
        return this.f136805v;
    }

    public final C16415m w() {
        return this.f136789f;
    }

    public final C16186d x() {
        return this.f136794k;
    }

    public final boolean y() {
        return this.f136802s;
    }

    public final boolean z() {
        return this.f136803t;
    }

    public l0(boolean z10, boolean z11, s0 s0Var, C15929K k10, C16038g gVar, C16415m mVar, boolean z12, v0 v0Var, C16653f fVar, C16793h hVar, C16186d dVar, r rVar, C18048l lVar, C16569f fVar2, u0 u0Var, t0 t0Var, l lVar2, C17497c cVar, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, C15987c<String> cVar2, C15987c<k> cVar3, boolean z19) {
        C16038g gVar2 = gVar;
        C16793h hVar2 = hVar;
        C16186d dVar2 = dVar;
        u0 u0Var2 = u0Var;
        t0 t0Var2 = t0Var;
        C15987c<String> cVar4 = cVar2;
        C15987c<k> cVar5 = cVar3;
        C17542s.j(s0Var, "featureConfig");
        C17542s.j(k10, "dialogUiState");
        C17542s.j(gVar2, "statusDialogUiState");
        C17542s.j(hVar2, "universeToolbarState");
        C17542s.j(dVar2, "zoomIndicatorState");
        C17542s.j(u0Var2, "rightToolbarState");
        C17542s.j(t0Var2, "leftToolbarState");
        C17542s.j(cVar4, "shoppingListItems");
        C17542s.j(cVar5, "itemList");
        this.f136784a = z10;
        this.f136785b = z11;
        this.f136786c = s0Var;
        this.f136787d = k10;
        this.f136788e = gVar2;
        this.f136789f = mVar;
        this.f136790g = z12;
        this.f136791h = v0Var;
        this.f136792i = fVar;
        this.f136793j = hVar2;
        this.f136794k = dVar2;
        this.f136795l = rVar;
        this.f136796m = lVar;
        this.f136797n = fVar2;
        this.f136798o = u0Var2;
        this.f136799p = t0Var2;
        this.f136800q = lVar2;
        this.f136801r = cVar;
        this.f136802s = z13;
        this.f136803t = z14;
        this.f136804u = z15;
        this.f136805v = z16;
        this.f136806w = z17;
        this.f136807x = z18;
        this.f136808y = cVar4;
        this.f136809z = cVar5;
        this.f136783A = z19;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: YG.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: YG.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v1, resolved type: kG.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: YG.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: YG.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: YG.l} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ l0(boolean r29, boolean r30, OG.s0 r31, JG.C15929K r32, MG.C16038g r33, SG.C16415m r34, boolean r35, OG.v0 r36, VG.C16653f r37, XG.C16793h r38, PG.C16186d r39, sG.r r40, uG.C18048l r41, UG.C16569f r42, OG.u0 r43, OG.t0 r44, YG.l r45, kG.C17497c r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, KJ.C15987c r53, KJ.C15987c r54, boolean r55, int r56, kotlin.jvm.internal.DefaultConstructorMarker r57) {
        /*
            r28 = this;
            r0 = r56
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r29
        L_0x000b:
            r3 = r0 & 2
            r4 = 0
            if (r3 == 0) goto L_0x0012
            r3 = r4
            goto L_0x0014
        L_0x0012:
            r3 = r30
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0026
            OG.s0 r5 = new OG.s0
            r11 = 15
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0028
        L_0x0026:
            r5 = r31
        L_0x0028:
            r6 = r0 & 8
            r7 = 0
            if (r6 == 0) goto L_0x0033
            JG.K r6 = new JG.K
            r6.<init>(r7, r2, r7)
            goto L_0x0035
        L_0x0033:
            r6 = r32
        L_0x0035:
            r8 = r0 & 16
            r9 = 3
            if (r8 == 0) goto L_0x0040
            MG.g r8 = new MG.g
            r8.<init>(r7, r4, r9, r7)
            goto L_0x0042
        L_0x0040:
            r8 = r33
        L_0x0042:
            r10 = r0 & 32
            if (r10 == 0) goto L_0x0048
            r10 = r7
            goto L_0x004a
        L_0x0048:
            r10 = r34
        L_0x004a:
            r11 = r0 & 64
            if (r11 == 0) goto L_0x0050
            r11 = r4
            goto L_0x0052
        L_0x0050:
            r11 = r35
        L_0x0052:
            r12 = r0 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0058
            r12 = r7
            goto L_0x005a
        L_0x0058:
            r12 = r36
        L_0x005a:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0060
            r13 = r7
            goto L_0x0062
        L_0x0060:
            r13 = r37
        L_0x0062:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x006c
            XG.h r14 = new XG.h
            r14.<init>(r4, r7, r9, r7)
            goto L_0x006e
        L_0x006c:
            r14 = r38
        L_0x006e:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0079
            PG.d r15 = new PG.d
            r2 = 0
            r15.<init>(r4, r2, r9, r7)
            goto L_0x007b
        L_0x0079:
            r15 = r39
        L_0x007b:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0081
            r2 = r7
            goto L_0x0083
        L_0x0081:
            r2 = r40
        L_0x0083:
            r9 = r0 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0089
            r9 = r7
            goto L_0x008b
        L_0x0089:
            r9 = r41
        L_0x008b:
            r4 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x0091
            r4 = r7
            goto L_0x0093
        L_0x0091:
            r4 = r42
        L_0x0093:
            r7 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x00bb
            OG.u0 r7 = new OG.u0
            r16 = 31
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r31 = r7
            r32 = r18
            r33 = r19
            r34 = r20
            r35 = r21
            r36 = r22
            r37 = r16
            r38 = r17
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            goto L_0x00bd
        L_0x00bb:
            r7 = r43
        L_0x00bd:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x00d5
            r16 = r7
            OG.t0 r7 = new OG.t0
            r18 = r2
            r17 = r4
            r57 = r9
            r2 = 0
            r4 = 1
            r9 = 0
            r7.<init>(r9, r4, r2)
            goto L_0x00e2
        L_0x00d5:
            r18 = r2
            r17 = r4
            r16 = r7
            r57 = r9
            r2 = 0
            r4 = 1
            r9 = 0
            r7 = r44
        L_0x00e2:
            r19 = 65536(0x10000, float:9.18355E-41)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00eb
            r19 = r2
            goto L_0x00ed
        L_0x00eb:
            r19 = r45
        L_0x00ed:
            r20 = 131072(0x20000, float:1.83671E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            r2 = r46
        L_0x00f6:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00ff
            r20 = r9
            goto L_0x0101
        L_0x00ff:
            r20 = r47
        L_0x0101:
            r21 = 524288(0x80000, float:7.34684E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            r4 = r48
        L_0x010a:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x0113
            r21 = r9
            goto L_0x0115
        L_0x0113:
            r21 = r49
        L_0x0115:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x011e
            r22 = r9
            goto L_0x0120
        L_0x011e:
            r22 = r50
        L_0x0120:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x0129
            r23 = r9
            goto L_0x012b
        L_0x0129:
            r23 = r51
        L_0x012b:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x0134
            r24 = r9
            goto L_0x0136
        L_0x0134:
            r24 = r52
        L_0x0136:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x0147
            java.util.List r25 = YH.C16877v.n()
            java.lang.Iterable r25 = (java.lang.Iterable) r25
            KJ.c r25 = KJ.C15985a.h(r25)
            goto L_0x0149
        L_0x0147:
            r25 = r53
        L_0x0149:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x015a
            java.util.List r26 = YH.C16877v.n()
            java.lang.Iterable r26 = (java.lang.Iterable) r26
            KJ.c r26 = KJ.C15985a.h(r26)
            goto L_0x015c
        L_0x015a:
            r26 = r54
        L_0x015c:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 & r27
            if (r0 == 0) goto L_0x0163
            goto L_0x0165
        L_0x0163:
            r9 = r55
        L_0x0165:
            r29 = r28
            r30 = r1
            r31 = r3
            r32 = r5
            r33 = r6
            r34 = r8
            r35 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r39 = r14
            r40 = r15
            r41 = r18
            r42 = r57
            r43 = r17
            r44 = r16
            r45 = r7
            r46 = r19
            r47 = r2
            r48 = r20
            r49 = r4
            r50 = r21
            r51 = r22
            r52 = r23
            r53 = r24
            r54 = r25
            r55 = r26
            r56 = r9
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OG.l0.<init>(boolean, boolean, OG.s0, JG.K, MG.g, SG.m, boolean, OG.v0, VG.f, XG.h, PG.d, sG.r, uG.l, UG.f, OG.u0, OG.t0, YG.l, kG.c, boolean, boolean, boolean, boolean, boolean, boolean, KJ.c, KJ.c, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
