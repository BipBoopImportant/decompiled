package com.sugarcube.decorate.v1.internal.catalog;

import EK.C15673a;
import JF.C13113u;
import OE.C13320l;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SF.C16401b;
import TF.C16458a;
import TF.C16459b;
import TF.C16461d;
import TF.C16464g;
import TF.C16465h;
import TF.C16466i;
import TF.C16468k;
import TF.C16480w;
import TJ.C16519P;
import TJ.C16533h;
import U0.C4889m;
import U0.C4895p;
import UF.C16561b;
import UF.C16562c;
import XH.C16807N;
import XH.C16818i;
import XH.C16820k;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YH.C16877v;
import ZF.C16942a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.L;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import androidx.transition.C7016b;
import androidx.transition.C7025k;
import cF.C14046h;
import com.sugarcube.app.base.data.Loadable;
import com.sugarcube.app.base.data.analytics.SearchType;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.external.interactions.CartInteractions;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.utils.BouncingBallView;
import com.sugarcube.core.network.models.CatalogCategory;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.decorate.v1.internal.catalog.Z;
import com.sugarcube.decorate.v1.internal.catalog.adapters.CatalogCategoryAdapter;
import com.sugarcube.decorate.v1.internal.catalog.adapters.CatalogItemSelectedListener;
import com.sugarcube.decorate.v1.internal.catalog.adapters.FilterPillAdapter;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import n0.C5607m;
import nI.C17631a;
import nI.C17642l;
import p1.C5747v0;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u001d\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001a\u001a\u00020\u00042\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00122\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010 H@¢\u0006\u0004\b\"\u0010#J0\u0010%\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010 H@¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010\u0003J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0002¢\u0006\u0004\b.\u0010\u001bJ\u0017\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0018H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0007H\u0002¢\u0006\u0004\b4\u00105J)\u00108\u001a\u0002032\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000406H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010>\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020\u001cH\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0004H\u0002¢\u0006\u0004\b@\u0010\u0003J\u0019\u0010A\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020\u001cH\u0002¢\u0006\u0004\bA\u0010?J\u0017\u0010B\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u001cH\u0002¢\u0006\u0004\bB\u0010?J\u000f\u0010C\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010\u0003J\u0019\u0010D\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020\u001cH\u0002¢\u0006\u0004\bD\u0010?J-\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010F\u001a\u00020E2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bL\u0010MJ!\u0010O\u001a\u00020\u00042\u0006\u0010N\u001a\u00020K2\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bO\u0010PR\"\u0010X\u001a\u00020Q8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001b\u0010f\u001a\u00020a8BX\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020g8BX\u0002¢\u0006\f\n\u0004\bh\u0010c\u001a\u0004\bi\u0010jR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010u\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010rR\u0018\u0010y\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010}\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001a\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/CatalogFragmentV2;", "Landroidx/fragment/app/o;", "<init>", "()V", "LXH/N;", "N1", "P1", "Landroidx/recyclerview/widget/GridLayoutManager;", "gridLayoutManager", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "B1", "(Landroidx/recyclerview/widget/GridLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V", "T1", "a2", "s2", "t2", "Lcom/sugarcube/app/base/data/Loadable;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "catalogItem", "G2", "(Lcom/sugarcube/app/base/data/Loadable;)V", "", "LXH/v;", "", "catalogItems", "E2", "(Ljava/util/List;)V", "", "y1", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)Z", "item", "Lkotlin/Function0;", "telemetryEvent", "u1", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LnI/a;LdI/e;)Ljava/lang/Object;", "items", "q1", "(Ljava/util/List;LnI/a;LdI/e;)Ljava/lang/Object;", "c2", "A1", "M1", "Lcom/sugarcube/decorate/v1/internal/catalog/Z$c;", "mode", "K1", "(Lcom/sugarcube/decorate/v1/internal/catalog/Z$c;)V", "H2", "count", "O1", "(I)V", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$v;", "F1", "(Landroidx/recyclerview/widget/GridLayoutManager;)Landroidx/recyclerview/widget/RecyclerView$v;", "Lkotlin/Function2;", "onFling", "E1", "(LnI/p;)Landroidx/recyclerview/widget/RecyclerView$v;", "Landroid/view/View$OnTouchListener;", "G1", "()Landroid/view/View$OnTouchListener;", "shouldShow", "C2", "(Z)V", "z2", "x2", "z1", "L1", "w2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LOE/q;", "I", "LOE/q;", "I1", "()LOE/q;", "setSugarcube", "(LOE/q;)V", "sugarcube", "Lcom/sugarcube/app/base/external/interactions/CartInteractions;", "J", "Lcom/sugarcube/app/base/external/interactions/CartInteractions;", "C1", "()Lcom/sugarcube/app/base/external/interactions/CartInteractions;", "setCartInteractions", "(Lcom/sugarcube/app/base/external/interactions/CartInteractions;)V", "cartInteractions", "Lcom/sugarcube/decorate/v1/internal/catalog/Z;", "K", "LXH/o;", "J1", "()Lcom/sugarcube/decorate/v1/internal/catalog/Z;", "viewModel", "Lcom/sugarcube/decorate/v1/internal/v1/b;", "L", "D1", "()Lcom/sugarcube/decorate/v1/internal/v1/b;", "decorateViewModel", "LTF/w;", "M", "LTF/w;", "binding", "LUF/b;", "N", "LUF/b;", "browseAdapter", "O", "searchResultsAdapter", "LUF/c;", "P", "LUF/c;", "autocompleteSearchAdapter", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/FilterPillAdapter;", "Q", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/FilterPillAdapter;", "quickFilterPillAdapter", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogCategoryAdapter;", "R", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogCategoryAdapter;", "categoryAdapter", "S", "subcategoryAdapter", "T", "a", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CatalogFragmentV2 extends Hilt_CatalogFragmentV2 {

    /* renamed from: T  reason: collision with root package name */
    public static final a f141396T = new a((DefaultConstructorMarker) null);

    /* renamed from: U  reason: collision with root package name */
    public static final int f141397U = 8;

    /* renamed from: I  reason: collision with root package name */
    public OE.q f141398I;

    /* renamed from: J  reason: collision with root package name */
    public CartInteractions f141399J;

    /* renamed from: K  reason: collision with root package name */
    private final C16824o f141400K;

    /* renamed from: L  reason: collision with root package name */
    private final C16824o f141401L;
    /* access modifiers changed from: private */

    /* renamed from: M  reason: collision with root package name */
    public C16480w f141402M;
    /* access modifiers changed from: private */

    /* renamed from: N  reason: collision with root package name */
    public C16561b f141403N;
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public C16561b f141404O;

    /* renamed from: P  reason: collision with root package name */
    private C16562c f141405P;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public FilterPillAdapter f141406Q;

    /* renamed from: R  reason: collision with root package name */
    private CatalogCategoryAdapter f141407R;

    /* renamed from: S  reason: collision with root package name */
    private CatalogCategoryAdapter f141408S;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/CatalogFragmentV2$a;", "", "<init>", "()V", "", "SCROLL_DIRECTION_UP", "I", "SCROLL_DIRECTION_DOWN", "COLUMN_COUNT", "ROW_COUNT", "PAGE_SIZE", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f141409a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.sugarcube.decorate.v1.internal.catalog.Z$c[] r0 = com.sugarcube.decorate.v1.internal.catalog.Z.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.RESULTS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.BROWSE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.CATEGORIES     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.FILTER     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.SEARCH     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.SWAP     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.PRODUCT_INFO     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.CART     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.PRODUCT_RECOMMENDATIONS     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                f141409a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2", f = "CatalogFragmentV2.kt", l = {512}, m = "addAllItemsToCart")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f141410c;

        /* renamed from: d  reason: collision with root package name */
        Object f141411d;

        /* renamed from: e  reason: collision with root package name */
        Object f141412e;

        /* renamed from: f  reason: collision with root package name */
        Object f141413f;

        /* renamed from: g  reason: collision with root package name */
        Object f141414g;

        /* renamed from: h  reason: collision with root package name */
        Object f141415h;

        /* renamed from: i  reason: collision with root package name */
        Object f141416i;

        /* renamed from: j  reason: collision with root package name */
        Object f141417j;

        /* renamed from: k  reason: collision with root package name */
        Object f141418k;

        /* renamed from: l  reason: collision with root package name */
        Object f141419l;

        /* renamed from: m  reason: collision with root package name */
        int f141420m;

        /* renamed from: n  reason: collision with root package name */
        int f141421n;

        /* renamed from: o  reason: collision with root package name */
        int f141422o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f141423p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ CatalogFragmentV2 f141424q;

        /* renamed from: r  reason: collision with root package name */
        int f141425r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CatalogFragmentV2 catalogFragmentV2, C17164e<? super c> eVar) {
            super(eVar);
            this.f141424q = catalogFragmentV2;
        }

        public final Object invokeSuspend(Object obj) {
            this.f141423p = obj;
            this.f141425r |= Integer.MIN_VALUE;
            return this.f141424q.q1((List<CachedCatalogItem>) null, (C17631a<C16807N>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2", f = "CatalogFragmentV2.kt", l = {473}, m = "addItemToCart")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f141426c;

        /* renamed from: d  reason: collision with root package name */
        Object f141427d;

        /* renamed from: e  reason: collision with root package name */
        Object f141428e;

        /* renamed from: f  reason: collision with root package name */
        Object f141429f;

        /* renamed from: g  reason: collision with root package name */
        Object f141430g;

        /* renamed from: h  reason: collision with root package name */
        Object f141431h;

        /* renamed from: i  reason: collision with root package name */
        Object f141432i;

        /* renamed from: j  reason: collision with root package name */
        int f141433j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f141434k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ CatalogFragmentV2 f141435l;

        /* renamed from: m  reason: collision with root package name */
        int f141436m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CatalogFragmentV2 catalogFragmentV2, C17164e<? super d> eVar) {
            super(eVar);
            this.f141435l = catalogFragmentV2;
        }

        public final Object invokeSuspend(Object obj) {
            this.f141434k = obj;
            this.f141436m |= Integer.MIN_VALUE;
            return this.f141435l.u1((CachedCatalogItem) null, (C17631a<C16807N>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/sugarcube/decorate/v1/internal/catalog/CatalogFragmentV2$e", "Landroidx/recyclerview/widget/GridLayoutManager$d;", "", "position", "f", "(I)I", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends GridLayoutManager.d {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RecyclerView f141437e;

        e(RecyclerView recyclerView) {
            this.f141437e = recyclerView;
        }

        public int f(int i10) {
            RecyclerView.h adapter = this.f141437e.getAdapter();
            return (adapter == null || adapter.getItemViewType(i10) != 2) ? 1 : 3;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"com/sugarcube/decorate/v1/internal/catalog/CatalogFragmentV2$f", "Landroidx/recyclerview/widget/RecyclerView$v;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "LXH/N;", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "a", "Z", "isFlinging", "()Z", "setFlinging", "(Z)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends RecyclerView.v {

        /* renamed from: a  reason: collision with root package name */
        private boolean f141438a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nI.p<Boolean, Boolean, C16807N> f141439b;

        f(nI.p<? super Boolean, ? super Boolean, C16807N> pVar) {
            this.f141439b = pVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            C17542s.j(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i10);
            this.f141438a = i10 == 2;
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            C17542s.j(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            if (this.f141438a) {
                nI.p<Boolean, Boolean, C16807N> pVar = this.f141439b;
                boolean z10 = false;
                Boolean valueOf = Boolean.valueOf(i11 < 0);
                if (i11 > 0) {
                    z10 = true;
                }
                pVar.invoke(valueOf, Boolean.valueOf(z10));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/sugarcube/decorate/v1/internal/catalog/CatalogFragmentV2$g", "Landroidx/recyclerview/widget/RecyclerView$v;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "LXH/N;", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "a", "I", "getScrollDirection", "()I", "setScrollDirection", "(I)V", "scrollDirection", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends RecyclerView.v {

        /* renamed from: a  reason: collision with root package name */
        private int f141440a = 1;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f141441b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CatalogFragmentV2 f141442c;

        g(GridLayoutManager gridLayoutManager, CatalogFragmentV2 catalogFragmentV2) {
            this.f141441b = gridLayoutManager;
            this.f141442c = catalogFragmentV2;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            C16480w g12;
            C16458a aVar;
            ConstraintLayout constraintLayout;
            C17542s.j(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i10);
            boolean z10 = true;
            if (i10 == 1 && ((g12 = this.f141442c.f141402M) == null || (aVar = g12.f138481b) == null || (constraintLayout = aVar.f138384j) == null || constraintLayout.getVisibility() != 0)) {
                this.f141442c.J1().h1();
            }
            Z l12 = this.f141442c.J1();
            if (i10 == 0) {
                z10 = false;
            }
            l12.n1(z10);
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            C17542s.j(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            boolean z10 = true;
            if (i11 > 0) {
                int y22 = this.f141441b.y2();
                if (this.f141441b.l0() + y22 >= this.f141441b.a() - 9 && y22 >= 0) {
                    this.f141442c.J1().s1();
                }
                this.f141440a = 1;
            } else if (i11 < 0) {
                this.f141440a = -1;
            }
            if (recyclerView.getScrollState() == 2) {
                CatalogFragmentV2 catalogFragmentV2 = this.f141442c;
                if (this.f141440a == 1) {
                    z10 = false;
                }
                catalogFragmentV2.x2(z10);
            }
            this.f141442c.A1();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f141443a;

        h(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f141443a = lVar;
        }

        public final C16818i<?> c() {
            return this.f141443a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f141443a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"com/sugarcube/decorate/v1/internal/catalog/CatalogFragmentV2$i", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogItemSelectedListener;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "LXH/N;", "onItemSelected", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "isLiked", "onItemLiked", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Z)V", "onItemDisclaimerClicked", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements CatalogItemSelectedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CatalogFragmentV2 f141444a;

        i(CatalogFragmentV2 catalogFragmentV2) {
            this.f141444a = catalogFragmentV2;
        }

        public void onItemDisclaimerClicked(CachedCatalogItem cachedCatalogItem) {
            C17542s.j(cachedCatalogItem, "item");
            this.f141444a.z2();
        }

        public void onItemLiked(CachedCatalogItem cachedCatalogItem, boolean z10) {
            C17542s.j(cachedCatalogItem, "item");
            boolean unused = this.f141444a.y1(cachedCatalogItem);
        }

        public void onItemSelected(CachedCatalogItem cachedCatalogItem) {
            C17542s.j(cachedCatalogItem, "item");
            Z.c value = this.f141444a.J1().Z0().getValue();
            Z.c cVar = Z.c.PRODUCT_RECOMMENDATIONS;
            com.sugarcube.decorate.v1.internal.v1.b.G1(this.f141444a.D1(), C16877v.e(cachedCatalogItem), value != cVar, this.f141444a.J1().Z0().getValue() != cVar, false, 8, (Object) null);
            this.f141444a.J1().A1(cachedCatalogItem);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"com/sugarcube/decorate/v1/internal/catalog/CatalogFragmentV2$j", "Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogItemSelectedListener;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "LXH/N;", "onItemSelected", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "isLiked", "onItemLiked", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Z)V", "onItemDisclaimerClicked", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j implements CatalogItemSelectedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CatalogFragmentV2 f141445a;

        j(CatalogFragmentV2 catalogFragmentV2) {
            this.f141445a = catalogFragmentV2;
        }

        public void onItemDisclaimerClicked(CachedCatalogItem cachedCatalogItem) {
            C17542s.j(cachedCatalogItem, "item");
            this.f141445a.z2();
        }

        public void onItemLiked(CachedCatalogItem cachedCatalogItem, boolean z10) {
            C17542s.j(cachedCatalogItem, "item");
            boolean unused = this.f141445a.y1(cachedCatalogItem);
        }

        public void onItemSelected(CachedCatalogItem cachedCatalogItem) {
            C17542s.j(cachedCatalogItem, "item");
            com.sugarcube.decorate.v1.internal.v1.b.G1(this.f141445a.D1(), C16877v.e(cachedCatalogItem), false, false, false, 14, (Object) null);
            this.f141445a.J1().A1(cachedCatalogItem);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"com/sugarcube/decorate/v1/internal/catalog/CatalogFragmentV2$k", "Landroidx/recyclerview/widget/RecyclerView$u;", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "Landroid/view/MotionEvent;", "e", "", "c", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z", "LXH/N;", "a", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", "disallowIntercept", "(Z)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k implements RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CatalogFragmentV2 f141446a;

        k(CatalogFragmentV2 catalogFragmentV2) {
            this.f141446a = catalogFragmentV2;
        }

        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C17542s.j(recyclerView, "rv");
            C17542s.j(motionEvent, "e");
        }

        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            C17542s.j(recyclerView, "rv");
            C17542s.j(motionEvent, "e");
            this.f141446a.J1().n1(motionEvent.getAction() == 0);
            return false;
        }

        public void e(boolean z10) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$setupObservers$1$15", f = "CatalogFragmentV2.kt", l = {617}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141447c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Z f141448d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CatalogFragmentV2 f141449e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CatalogFragmentV2 f141450a;

            a(CatalogFragmentV2 catalogFragmentV2) {
                this.f141450a = catalogFragmentV2;
            }

            /* renamed from: c */
            public final Object emit(W w10, C17164e<? super C16807N> eVar) {
                C16468k kVar;
                C16458a aVar;
                TextView textView;
                C16468k kVar2;
                C16464g gVar;
                C16458a aVar2;
                C16464g gVar2;
                CatalogFragmentV2 catalogFragmentV2 = this.f141450a;
                Z.c value = catalogFragmentV2.J1().Z0().getValue();
                Z.c cVar = Z.c.BROWSE;
                C16561b h12 = value == cVar ? catalogFragmentV2.f141403N : catalogFragmentV2.f141404O;
                LinearLayout linearLayout = null;
                if (value == cVar) {
                    C16480w g12 = catalogFragmentV2.f141402M;
                    if (!(g12 == null || (aVar2 = g12.f138481b) == null || (gVar2 = aVar2.f138388n) == null)) {
                        linearLayout = gVar2.getRoot();
                    }
                } else {
                    C16480w g13 = catalogFragmentV2.f141402M;
                    if (!(g13 == null || (kVar2 = g13.f138487h) == null || (gVar = kVar2.f138435b) == null)) {
                        linearLayout = gVar.getRoot();
                    }
                }
                if (h12 != null) {
                    if (w10.g()) {
                        h12.g();
                    } else {
                        h12.d();
                    }
                }
                if (linearLayout != null) {
                    JF.Z.v(linearLayout, w10.d());
                }
                C16480w g14 = catalogFragmentV2.f141402M;
                if (!(g14 == null || (aVar = g14.f138481b) == null || (textView = aVar.f138378d) == null)) {
                    JF.Z.v(textView, w10.e());
                }
                C16480w g15 = catalogFragmentV2.f141402M;
                if (!(g15 == null || (kVar = g15.f138487h) == null)) {
                    Integer c10 = w10.c();
                    if (c10 != null) {
                        catalogFragmentV2.O1(c10.intValue());
                    }
                    TextView textView2 = kVar.f138441h;
                    C17542s.i(textView2, "searchResultsNumResults");
                    JF.Z.v(textView2, w10.c() != null);
                }
                catalogFragmentV2.w2(w10.f());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(Z z10, CatalogFragmentV2 catalogFragmentV2, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f141448d = z10;
            this.f141449e = catalogFragmentV2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new l(this.f141448d, this.f141449e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141447c;
            if (i10 == 0) {
                y.b(obj);
                C16519P<W> K02 = this.f141448d.K0();
                a aVar = new a(this.f141449e);
                this.f141447c = 1;
                if (K02.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CatalogFragmentV2 f141451a;

        m(CatalogFragmentV2 catalogFragmentV2) {
            this.f141451a = catalogFragmentV2;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(CatalogFragmentV2 catalogFragmentV2, String str) {
            C17542s.j(str, "searchTerm");
            catalogFragmentV2.J1().e1(str);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(CatalogFragmentV2 catalogFragmentV2) {
            C5191t activity = catalogFragmentV2.getActivity();
            if (activity != null) {
                JF.Z.r(activity);
            }
            catalogFragmentV2.J1().d1();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(CatalogFragmentV2 catalogFragmentV2, String str) {
            C16458a aVar;
            C17542s.j(str, "suggestion");
            C16480w g12 = catalogFragmentV2.f141402M;
            if (!(g12 == null || (aVar = g12.f138481b) == null)) {
                FilterPillAdapter j12 = catalogFragmentV2.f141406Q;
                if (j12 != null) {
                    j12.d();
                }
                aVar.f138383i.w1(0);
                CatalogFragmentV2.y2(catalogFragmentV2, false, 1, (Object) null);
                RecyclerView recyclerView = aVar.f138383i;
                C17542s.i(recyclerView, "catalogRecyclerView");
                JF.Z.o(recyclerView, 0, false, (C17631a) null, 7, (Object) null);
            }
            Z.x0(catalogFragmentV2.J1(), str, false, SearchType.TEXTBOX, 2, (Object) null);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(U0.C4889m r10, int r11) {
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
                goto L_0x00e5
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.setupSearch.<anonymous> (CatalogFragmentV2.kt:327)"
                r2 = 1536168844(0x5b90138c, float:8.1107777E16)
                U0.C4895p.S(r2, r11, r0, r1)
            L_0x0020:
                r11 = -103678283(0xfffffffff9d1feb5, float:-1.3629451E35)
                r10.W(r11)
                com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r11 = r9.f141451a
                boolean r11 = r10.F(r11)
                com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r0 = r9.f141451a
                java.lang.Object r1 = r10.D()
                if (r11 != 0) goto L_0x003c
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r1 != r11) goto L_0x0044
            L_0x003c:
                com.sugarcube.decorate.v1.internal.catalog.L r1 = new com.sugarcube.decorate.v1.internal.catalog.L
                r1.<init>(r0)
                r10.u(r1)
            L_0x0044:
                r2 = r1
                nI.l r2 = (nI.C17642l) r2
                r10.P()
                r11 = -103674097(0xfffffffff9d20f0f, float:-1.3633597E35)
                r10.W(r11)
                com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r11 = r9.f141451a
                boolean r11 = r10.F(r11)
                com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r0 = r9.f141451a
                java.lang.Object r1 = r10.D()
                if (r11 != 0) goto L_0x0066
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r1 != r11) goto L_0x006e
            L_0x0066:
                com.sugarcube.decorate.v1.internal.catalog.M r1 = new com.sugarcube.decorate.v1.internal.catalog.M
                r1.<init>(r0)
                r10.u(r1)
            L_0x006e:
                r3 = r1
                nI.a r3 = (nI.C17631a) r3
                r10.P()
                r11 = -103668552(0xfffffffff9d224b8, float:-1.3639089E35)
                r10.W(r11)
                com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r11 = r9.f141451a
                boolean r11 = r10.F(r11)
                com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r0 = r9.f141451a
                java.lang.Object r1 = r10.D()
                if (r11 != 0) goto L_0x0090
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r1 != r11) goto L_0x0098
            L_0x0090:
                com.sugarcube.decorate.v1.internal.catalog.N r1 = new com.sugarcube.decorate.v1.internal.catalog.N
                r1.<init>(r0)
                r10.u(r1)
            L_0x0098:
                r4 = r1
                nI.l r4 = (nI.C17642l) r4
                r10.P()
                com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r11 = r9.f141451a
                com.sugarcube.decorate.v1.internal.catalog.Z r11 = r11.J1()
                androidx.lifecycle.F r11 = r11.I0()
                androidx.lifecycle.F r11 = androidx.lifecycle.e0.a(r11)
                r0 = 0
                U0.A1 r5 = d1.b.a(r11, r10, r0)
                r11 = -103647074(0xfffffffff9d2789e, float:-1.3660359E35)
                r10.W(r11)
                com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r11 = r9.f141451a
                java.lang.Object r0 = r10.D()
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r0 != r1) goto L_0x00d0
                com.sugarcube.decorate.v1.internal.catalog.Z r11 = r11.J1()
                U0.r0 r0 = r11.T0()
                r10.u(r0)
            L_0x00d0:
                r6 = r0
                U0.r0 r6 = (U0.C4899r0) r6
                r10.P()
                r8 = 24576(0x6000, float:3.4438E-41)
                r7 = r10
                iF.V.k(r2, r3, r4, r5, r6, r7, r8)
                boolean r10 = U0.C4895p.J()
                if (r10 == 0) goto L_0x00e5
                U0.C4895p.R()
            L_0x00e5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.m.e(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            e((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class n implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f141452a;

        public n(C5187o oVar) {
            this.f141452a = oVar;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            Object obj;
            C8951o a10 = androidx.navigation.fragment.a.a(this.f141452a);
            int g10 = C4.j.g(Kreativ.Decorate.Companion.serializer());
            Class<Kreativ.Decorate> cls = Kreativ.Decorate.class;
            if (C8951o.A(a10, a10.L(), g10, true, (x4.v) null, 4, (Object) null) != null) {
                List value = a10.G().getValue();
                ListIterator listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (((C8948l) obj).e().x() == g10) {
                        break;
                    }
                }
                C8948l lVar = (C8948l) obj;
                if (lVar != null) {
                    return lVar;
                }
                throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
            }
            throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class o implements C17631a<j0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16824o f141453a;

        public o(C16824o oVar) {
            this.f141453a = oVar;
        }

        /* renamed from: a */
        public final j0 invoke() {
            return C14046h.b(this.f141453a).getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class p implements C17631a<l3.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16824o f141454a;

        public p(C16824o oVar) {
            this.f141454a = oVar;
        }

        /* renamed from: a */
        public final l3.a invoke() {
            return C14046h.b(this.f141454a).getDefaultViewModelCreationExtras();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class q implements C17631a<i0.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f141455a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16824o f141456b;

        public q(C5187o oVar, C16824o oVar2) {
            this.f141455a = oVar;
            this.f141456b = oVar2;
        }

        /* renamed from: a */
        public final i0.c invoke() {
            C5191t requireActivity = this.f141455a.requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            return e3.a.a(requireActivity, C14046h.b(this.f141456b).getDefaultViewModelProviderFactory());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class r implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f141457a;

        public r(C5187o oVar) {
            this.f141457a = oVar;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            Object obj;
            C8951o a10 = androidx.navigation.fragment.a.a(this.f141457a);
            int g10 = C4.j.g(Kreativ.Decorate.Companion.serializer());
            Class<Kreativ.Decorate> cls = Kreativ.Decorate.class;
            if (C8951o.A(a10, a10.L(), g10, true, (x4.v) null, 4, (Object) null) != null) {
                List value = a10.G().getValue();
                ListIterator listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (((C8948l) obj).e().x() == g10) {
                        break;
                    }
                }
                C8948l lVar = (C8948l) obj;
                if (lVar != null) {
                    return lVar;
                }
                throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
            }
            throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class s implements C17631a<j0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16824o f141458a;

        public s(C16824o oVar) {
            this.f141458a = oVar;
        }

        /* renamed from: a */
        public final j0 invoke() {
            return C14046h.b(this.f141458a).getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class t implements C17631a<l3.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16824o f141459a;

        public t(C16824o oVar) {
            this.f141459a = oVar;
        }

        /* renamed from: a */
        public final l3.a invoke() {
            return C14046h.b(this.f141459a).getDefaultViewModelCreationExtras();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class u implements C17631a<i0.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f141460a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16824o f141461b;

        public u(C5187o oVar, C16824o oVar2) {
            this.f141460a = oVar;
            this.f141461b = oVar2;
        }

        /* renamed from: a */
        public final i0.c invoke() {
            C5191t requireActivity = this.f141460a.requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            return e3.a.a(requireActivity, C14046h.b(this.f141461b).getDefaultViewModelProviderFactory());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class v implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<XH.v<CachedCatalogItem, Integer>> f141462a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CatalogFragmentV2 f141463b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements nI.p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List<XH.v<CachedCatalogItem, Integer>> f141464a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CatalogFragmentV2 f141465b;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$updateCart$1$1$1$1$1", f = "CatalogFragmentV2.kt", l = {438}, m = "invokeSuspend")
            /* renamed from: com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$v$a$a  reason: collision with other inner class name */
            static final class C3463a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f141466c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ CatalogFragmentV2 f141467d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ List<CachedCatalogItem> f141468e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C3463a(CatalogFragmentV2 catalogFragmentV2, List<CachedCatalogItem> list, C17164e<? super C3463a> eVar) {
                    super(2, eVar);
                    this.f141467d = catalogFragmentV2;
                    this.f141468e = list;
                }

                /* access modifiers changed from: private */
                public static final C16807N j(CatalogFragmentV2 catalogFragmentV2, List list) {
                    C16942a S02 = catalogFragmentV2.J1().S0();
                    if (S02 != null) {
                        S02.c(list);
                    }
                    return C16807N.f139792a;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C3463a(this.f141467d, this.f141468e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C3463a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f141466c;
                    if (i10 == 0) {
                        y.b(obj);
                        CatalogFragmentV2 catalogFragmentV2 = this.f141467d;
                        List<CachedCatalogItem> list = this.f141468e;
                        P p10 = new P(catalogFragmentV2, list);
                        this.f141466c = 1;
                        if (catalogFragmentV2.q1(list, p10, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "catalogItem", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$updateCart$1$1$1$2$1", f = "CatalogFragmentV2.kt", l = {444}, m = "invokeSuspend")
            static final class b extends kotlin.coroutines.jvm.internal.l implements nI.p<CachedCatalogItem, C17164e<? super Boolean>, Object> {

                /* renamed from: c  reason: collision with root package name */
                Object f141469c;

                /* renamed from: d  reason: collision with root package name */
                Object f141470d;

                /* renamed from: e  reason: collision with root package name */
                Object f141471e;

                /* renamed from: f  reason: collision with root package name */
                int f141472f;

                /* renamed from: g  reason: collision with root package name */
                int f141473g;

                /* renamed from: h  reason: collision with root package name */
                /* synthetic */ Object f141474h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ CatalogFragmentV2 f141475i;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(CatalogFragmentV2 catalogFragmentV2, C17164e<? super b> eVar) {
                    super(2, eVar);
                    this.f141475i = catalogFragmentV2;
                }

                /* access modifiers changed from: private */
                public static final C16807N k(CatalogFragmentV2 catalogFragmentV2, CachedCatalogItem cachedCatalogItem) {
                    C16942a S02 = catalogFragmentV2.J1().S0();
                    if (S02 != null) {
                        S02.e(cachedCatalogItem, catalogFragmentV2.D1().l0().getValue());
                    }
                    return C16807N.f139792a;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    b bVar = new b(this.f141475i, eVar);
                    bVar.f141474h = obj;
                    return bVar;
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f141473g;
                    boolean z10 = false;
                    if (i10 == 0) {
                        y.b(obj);
                        CachedCatalogItem cachedCatalogItem = (CachedCatalogItem) this.f141474h;
                        if (cachedCatalogItem != null) {
                            CatalogFragmentV2 catalogFragmentV2 = this.f141475i;
                            Q q10 = new Q(catalogFragmentV2, cachedCatalogItem);
                            this.f141474h = cachedCatalogItem;
                            this.f141469c = cachedCatalogItem;
                            this.f141470d = catalogFragmentV2;
                            this.f141471e = cachedCatalogItem;
                            this.f141472f = 0;
                            this.f141473g = 1;
                            obj = catalogFragmentV2.u1(cachedCatalogItem, q10, this);
                            if (obj == f10) {
                                return f10;
                            }
                        }
                        return kotlin.coroutines.jvm.internal.b.a(z10);
                    } else if (i10 == 1) {
                        CachedCatalogItem cachedCatalogItem2 = (CachedCatalogItem) this.f141471e;
                        CatalogFragmentV2 catalogFragmentV22 = (CatalogFragmentV2) this.f141470d;
                        CachedCatalogItem cachedCatalogItem3 = (CachedCatalogItem) this.f141469c;
                        CachedCatalogItem cachedCatalogItem4 = (CachedCatalogItem) this.f141474h;
                        y.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (((Boolean) obj).booleanValue()) {
                        z10 = true;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }

                /* renamed from: j */
                public final Object invoke(CachedCatalogItem cachedCatalogItem, C17164e<? super Boolean> eVar) {
                    return ((b) create(cachedCatalogItem, eVar)).invokeSuspend(C16807N.f139792a);
                }
            }

            a(List<XH.v<CachedCatalogItem, Integer>> list, CatalogFragmentV2 catalogFragmentV2) {
                this.f141464a = list;
                this.f141465b = catalogFragmentV2;
            }

            /* access modifiers changed from: private */
            public static final boolean c(CatalogFragmentV2 catalogFragmentV2, CachedCatalogItem cachedCatalogItem) {
                if (cachedCatalogItem == null) {
                    return false;
                }
                C16942a S02 = catalogFragmentV2.J1().S0();
                if (S02 != null) {
                    S02.f(cachedCatalogItem, catalogFragmentV2.D1().l0().getValue());
                }
                return catalogFragmentV2.y1(cachedCatalogItem);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: nI.p} */
            /* JADX WARNING: type inference failed for: r7v4, types: [java.lang.Float] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(U0.C4889m r18, int r19) {
                /*
                    r17 = this;
                    r0 = r17
                    r8 = r18
                    r1 = r19
                    r2 = r1 & 3
                    r3 = 2
                    if (r2 != r3) goto L_0x0017
                    boolean r2 = r18.l()
                    if (r2 != 0) goto L_0x0012
                    goto L_0x0017
                L_0x0012:
                    r18.L()
                    goto L_0x01a9
                L_0x0017:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x0026
                    r2 = -1
                    java.lang.String r3 = "com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.updateCart.<anonymous>.<anonymous>.<anonymous> (CatalogFragmentV2.kt:426)"
                    r4 = -1086439041(0xffffffffbf3e417f, float:-0.7431869)
                    U0.C4895p.S(r4, r1, r2, r3)
                L_0x0026:
                    java.util.List<XH.v<com.sugarcube.app.base.data.database.CachedCatalogItem, java.lang.Integer>> r1 = r0.f141464a
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r1 = r1.iterator()
                L_0x0033:
                    boolean r3 = r1.hasNext()
                    r4 = 0
                    if (r3 == 0) goto L_0x0061
                    java.lang.Object r3 = r1.next()
                    XH.v r3 = (XH.v) r3
                    java.lang.Object r5 = r3.a()
                    com.sugarcube.app.base.data.database.CachedCatalogItem r5 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r5
                    java.lang.Object r3 = r3.b()
                    java.lang.Number r3 = (java.lang.Number) r3
                    int r3 = r3.intValue()
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>(r3)
                L_0x0055:
                    if (r4 >= r3) goto L_0x005d
                    r6.add(r5)
                    int r4 = r4 + 1
                    goto L_0x0055
                L_0x005d:
                    YH.C16877v.E(r2, r6)
                    goto L_0x0033
                L_0x0061:
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r1 = r0.f141465b
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    java.util.Iterator r5 = r2.iterator()
                L_0x006c:
                    boolean r6 = r5.hasNext()
                    if (r6 == 0) goto L_0x0094
                    java.lang.Object r6 = r5.next()
                    com.sugarcube.app.base.data.database.CachedCatalogItem r6 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r6
                    kF.D$a r7 = kF.C14683D.f128666h
                    OE.q r9 = r1.I1()
                    java.lang.String r9 = r9.getCountry()
                    OE.q r10 = r1.I1()
                    java.lang.String r10 = r10.getLanguage()
                    kF.D r6 = r7.b(r6, r9, r10)
                    if (r6 == 0) goto L_0x006c
                    r3.add(r6)
                    goto L_0x006c
                L_0x0094:
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.Iterator r5 = r3.iterator()
                L_0x009d:
                    boolean r6 = r5.hasNext()
                    r7 = 0
                    if (r6 == 0) goto L_0x00be
                    java.lang.Object r6 = r5.next()
                    kF.D r6 = (kF.C14683D) r6
                    lF.a r6 = r6.f()
                    if (r6 == 0) goto L_0x00b8
                    float r6 = r6.g()
                    java.lang.Float r7 = java.lang.Float.valueOf(r6)
                L_0x00b8:
                    if (r7 == 0) goto L_0x009d
                    r1.add(r7)
                    goto L_0x009d
                L_0x00be:
                    float r1 = YH.C16877v.j1(r1)
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r5 = r0.f141465b
                    com.sugarcube.decorate.v1.internal.catalog.Z r5 = r5.J1()
                    androidx.lifecycle.F r5 = r5.O0()
                    U0.A1 r4 = d1.b.a(r5, r8, r4)
                    java.lang.Object r4 = r4.getValue()
                    java.util.List r4 = (java.util.List) r4
                    lF.a r5 = new lF.a
                    java.lang.String r10 = java.lang.String.valueOf(r1)
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r1 = r0.f141465b
                    OE.q r1 = r1.I1()
                    java.lang.String r11 = r1.getCountry()
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r1 = r0.f141465b
                    OE.q r1 = r1.I1()
                    java.lang.String r12 = r1.getLanguage()
                    r15 = 24
                    r16 = 0
                    r13 = 0
                    r14 = 0
                    r9 = r5
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                    if (r4 != 0) goto L_0x0101
                    java.util.List r1 = YH.C16877v.n()
                    r4 = r1
                L_0x0101:
                    r1 = -422668354(0xffffffffe6ce97be, float:-4.8780332E23)
                    r8.W(r1)
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r1 = r0.f141465b
                    boolean r1 = r8.F(r1)
                    boolean r6 = r8.F(r2)
                    r1 = r1 | r6
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r6 = r0.f141465b
                    java.lang.Object r9 = r18.D()
                    if (r1 != 0) goto L_0x0122
                    U0.m$a r1 = U0.C4889m.f14007a
                    java.lang.Object r1 = r1.a()
                    if (r9 != r1) goto L_0x012a
                L_0x0122:
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$v$a$a r9 = new com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$v$a$a
                    r9.<init>(r6, r2, r7)
                    r8.u(r9)
                L_0x012a:
                    r6 = r9
                    nI.p r6 = (nI.p) r6
                    r18.P()
                    r1 = -422660197(0xffffffffe6ceb79b, float:-4.880972E23)
                    r8.W(r1)
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r1 = r0.f141465b
                    boolean r1 = r8.F(r1)
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r2 = r0.f141465b
                    java.lang.Object r9 = r18.D()
                    if (r1 != 0) goto L_0x014c
                    U0.m$a r1 = U0.C4889m.f14007a
                    java.lang.Object r1 = r1.a()
                    if (r9 != r1) goto L_0x0154
                L_0x014c:
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$v$a$b r9 = new com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$v$a$b
                    r9.<init>(r2, r7)
                    r8.u(r9)
                L_0x0154:
                    nI.p r9 = (nI.p) r9
                    r18.P()
                    r1 = -422644269(0xffffffffe6cef5d3, float:-4.8867108E23)
                    r8.W(r1)
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r1 = r0.f141465b
                    boolean r1 = r8.F(r1)
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r2 = r0.f141465b
                    java.lang.Object r10 = r18.D()
                    if (r1 != 0) goto L_0x0175
                    U0.m$a r1 = U0.C4889m.f14007a
                    java.lang.Object r1 = r1.a()
                    if (r10 != r1) goto L_0x017d
                L_0x0175:
                    com.sugarcube.decorate.v1.internal.catalog.O r10 = new com.sugarcube.decorate.v1.internal.catalog.O
                    r10.<init>(r2)
                    r8.u(r10)
                L_0x017d:
                    nI.l r10 = (nI.C17642l) r10
                    r18.P()
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r1 = r0.f141465b
                    com.sugarcube.decorate.v1.internal.catalog.Z r1 = r1.J1()
                    boolean r1 = r1.P0()
                    if (r1 == 0) goto L_0x018f
                    r7 = r10
                L_0x018f:
                    r10 = 0
                    r11 = 8
                    r12 = 0
                    r1 = r5
                    r2 = r3
                    r3 = r4
                    r4 = r12
                    r5 = r6
                    r6 = r9
                    r8 = r18
                    r9 = r10
                    r10 = r11
                    iF.C14567g.g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x01a9
                    U0.C4895p.R()
                L_0x01a9:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.v.a.b(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        v(List<XH.v<CachedCatalogItem, Integer>> list, CatalogFragmentV2 catalogFragmentV2) {
            this.f141462a = list;
            this.f141463b = catalogFragmentV2;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2077156671, i10, -1, "com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.updateCart.<anonymous>.<anonymous> (CatalogFragmentV2.kt:425)");
                }
                tK.Z.g(C5607m.a(mVar, 0), C15673a.a(), c1.c.e(-1086439041, true, new a(this.f141462a, this.f141463b), mVar, 54), mVar, 384, 0);
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
    static final class w implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CatalogFragmentV2 f141476a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Loadable<CachedCatalogItem> f141477b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements nI.p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CatalogFragmentV2 f141478a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Loadable<CachedCatalogItem> f141479b;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$updateProductInfo$1$1$1$1$1", f = "CatalogFragmentV2.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$w$a$a  reason: collision with other inner class name */
            static final class C3464a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super Boolean>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f141480c;

                C3464a(C17164e<? super C3464a> eVar) {
                    super(2, eVar);
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C3464a(eVar);
                }

                public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
                    return ((C3464a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    C17187b.f();
                    if (this.f141480c == 0) {
                        y.b(obj);
                        return kotlin.coroutines.jvm.internal.b.a(false);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$updateProductInfo$1$1$1$5$1", f = "CatalogFragmentV2.kt", l = {412}, m = "invokeSuspend")
            static final class b extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super Boolean>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f141481c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ CatalogFragmentV2 f141482d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ CachedCatalogItem f141483e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(CatalogFragmentV2 catalogFragmentV2, CachedCatalogItem cachedCatalogItem, C17164e<? super b> eVar) {
                    super(2, eVar);
                    this.f141482d = catalogFragmentV2;
                    this.f141483e = cachedCatalogItem;
                }

                /* access modifiers changed from: private */
                public static final C16807N j(CatalogFragmentV2 catalogFragmentV2, CachedCatalogItem cachedCatalogItem) {
                    C16942a S02 = catalogFragmentV2.J1().S0();
                    if (S02 != null) {
                        S02.N(cachedCatalogItem);
                    }
                    return C16807N.f139792a;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new b(this.f141482d, this.f141483e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
                    return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f141481c;
                    if (i10 == 0) {
                        y.b(obj);
                        CatalogFragmentV2 catalogFragmentV2 = this.f141482d;
                        CachedCatalogItem cachedCatalogItem = this.f141483e;
                        U u10 = new U(catalogFragmentV2, cachedCatalogItem);
                        this.f141481c = 1;
                        obj = catalogFragmentV2.u1(cachedCatalogItem, u10, this);
                        if (obj == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return obj;
                }
            }

            a(CatalogFragmentV2 catalogFragmentV2, Loadable<CachedCatalogItem> loadable) {
                this.f141478a = catalogFragmentV2;
                this.f141479b = loadable;
            }

            /* access modifiers changed from: private */
            public static final C16807N e(CatalogFragmentV2 catalogFragmentV2, CachedCatalogItem cachedCatalogItem) {
                boolean unused = catalogFragmentV2.y1(cachedCatalogItem);
                C16942a S02 = catalogFragmentV2.J1().S0();
                if (S02 != null) {
                    S02.O(cachedCatalogItem);
                }
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(CatalogFragmentV2 catalogFragmentV2, boolean z10) {
                catalogFragmentV2.J1().n1(z10);
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: nI.p} */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d0, code lost:
                if (YH.C16877v.l0(r0, ((com.sugarcube.app.base.data.database.CachedCatalogItem) ((com.sugarcube.app.base.data.Loadable.Loaded) r10.f141479b).getData()).getCatalogItem().getLocalItemNumber()) == true) goto L_0x00d4;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c(U0.C4889m r11, int r12) {
                /*
                    r10 = this;
                    r1 = r12 & 3
                    r2 = 2
                    if (r1 != r2) goto L_0x0011
                    boolean r1 = r11.l()
                    if (r1 != 0) goto L_0x000c
                    goto L_0x0011
                L_0x000c:
                    r11.L()
                    goto L_0x0182
                L_0x0011:
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x0020
                    r1 = -1
                    java.lang.String r2 = "com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.updateProductInfo.<anonymous>.<anonymous>.<anonymous> (CatalogFragmentV2.kt:383)"
                    r3 = -459644628(0xffffffffe49a612c, float:-2.2782404E22)
                    U0.C4895p.S(r3, r12, r1, r2)
                L_0x0020:
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r0 = r10.f141478a
                    com.sugarcube.decorate.v1.internal.catalog.Z r0 = r0.J1()
                    androidx.lifecycle.F r0 = r0.O0()
                    r1 = 0
                    U0.A1 r0 = d1.b.a(r0, r11, r1)
                    java.lang.Object r0 = r0.getValue()
                    java.util.List r0 = (java.util.List) r0
                    com.sugarcube.app.base.data.Loadable<com.sugarcube.app.base.data.database.CachedCatalogItem> r2 = r10.f141479b
                    boolean r3 = r2 instanceof com.sugarcube.app.base.data.Loadable.Loading
                    if (r3 == 0) goto L_0x0046
                    r0 = -1476249826(0xffffffffa802371e, float:-7.228401E-15)
                    r11.W(r0)
                    r11.P()
                    goto L_0x0179
                L_0x0046:
                    boolean r3 = r2 instanceof com.sugarcube.app.base.data.Loadable.Failure
                    r4 = 0
                    if (r3 == 0) goto L_0x0083
                    r0 = -1476136025(0xffffffffa803f3a7, float:-7.3247945E-15)
                    r11.W(r0)
                    r0 = -1987277363(0xffffffff898c8dcd, float:-3.3837123E-33)
                    r11.W(r0)
                    java.lang.Object r0 = r11.D()
                    U0.m$a r1 = U0.C4889m.f14007a
                    java.lang.Object r1 = r1.a()
                    if (r0 != r1) goto L_0x006b
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$w$a$a r0 = new com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$w$a$a
                    r0.<init>(r4)
                    r11.u(r0)
                L_0x006b:
                    r5 = r0
                    nI.p r5 = (nI.p) r5
                    r11.P()
                    r7 = 384(0x180, float:5.38E-43)
                    r8 = 27
                    r0 = 0
                    r1 = 0
                    r2 = 1
                    r3 = 0
                    r4 = 0
                    r6 = r11
                    WF.C16723k.h(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                    r11.P()
                    goto L_0x0179
                L_0x0083:
                    boolean r2 = r2 instanceof com.sugarcube.app.base.data.Loadable.Loaded
                    if (r2 == 0) goto L_0x0183
                    r2 = -1475934494(0xffffffffa80706e2, float:-7.495498E-15)
                    r11.W(r2)
                    com.sugarcube.app.base.data.Loadable<com.sugarcube.app.base.data.database.CachedCatalogItem> r2 = r10.f141479b
                    com.sugarcube.app.base.data.Loadable$Loaded r2 = (com.sugarcube.app.base.data.Loadable.Loaded) r2
                    java.lang.Object r2 = r2.getData()
                    com.sugarcube.app.base.data.database.CachedCatalogItem r2 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r2
                    WF.c$a r3 = WF.C16715c.f139439h
                    com.sugarcube.core.network.models.CatalogItem r5 = r2.getCatalogItem()
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r6 = r10.f141478a
                    OE.q r6 = r6.I1()
                    java.lang.String r6 = r6.getCountry()
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r7 = r10.f141478a
                    OE.q r7 = r7.I1()
                    java.lang.String r7 = r7.getLanguage()
                    WF.c r3 = r3.a(r5, r6, r7)
                    if (r0 == 0) goto L_0x00d3
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    com.sugarcube.app.base.data.Loadable<com.sugarcube.app.base.data.database.CachedCatalogItem> r5 = r10.f141479b
                    com.sugarcube.app.base.data.Loadable$Loaded r5 = (com.sugarcube.app.base.data.Loadable.Loaded) r5
                    java.lang.Object r5 = r5.getData()
                    com.sugarcube.app.base.data.database.CachedCatalogItem r5 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r5
                    com.sugarcube.core.network.models.CatalogItem r5 = r5.getCatalogItem()
                    java.lang.String r5 = r5.getLocalItemNumber()
                    boolean r0 = YH.C16877v.l0(r0, r5)
                    r5 = 1
                    if (r0 != r5) goto L_0x00d3
                    goto L_0x00d4
                L_0x00d3:
                    r5 = r1
                L_0x00d4:
                    r0 = -1987249865(0xffffffff898cf937, float:-3.3938135E-33)
                    r11.W(r0)
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r0 = r10.f141478a
                    boolean r0 = r11.F(r0)
                    boolean r1 = r11.V(r2)
                    r0 = r0 | r1
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r1 = r10.f141478a
                    java.lang.Object r6 = r11.D()
                    if (r0 != 0) goto L_0x00f5
                    U0.m$a r0 = U0.C4889m.f14007a
                    java.lang.Object r0 = r0.a()
                    if (r6 != r0) goto L_0x00fd
                L_0x00f5:
                    com.sugarcube.decorate.v1.internal.catalog.S r6 = new com.sugarcube.decorate.v1.internal.catalog.S
                    r6.<init>(r1, r2)
                    r11.u(r6)
                L_0x00fd:
                    nI.a r6 = (nI.C17631a) r6
                    r11.P()
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r0 = r10.f141478a
                    com.sugarcube.decorate.v1.internal.catalog.Z r0 = r0.J1()
                    boolean r0 = r0.P0()
                    if (r0 == 0) goto L_0x010f
                    goto L_0x0110
                L_0x010f:
                    r6 = r4
                L_0x0110:
                    r0 = -1987255858(0xffffffff898ce1ce, float:-3.391612E-33)
                    r11.W(r0)
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r0 = r10.f141478a
                    boolean r0 = r11.F(r0)
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r1 = r10.f141478a
                    java.lang.Object r7 = r11.D()
                    if (r0 != 0) goto L_0x012c
                    U0.m$a r0 = U0.C4889m.f14007a
                    java.lang.Object r0 = r0.a()
                    if (r7 != r0) goto L_0x0134
                L_0x012c:
                    com.sugarcube.decorate.v1.internal.catalog.T r7 = new com.sugarcube.decorate.v1.internal.catalog.T
                    r7.<init>(r1)
                    r11.u(r7)
                L_0x0134:
                    r1 = r7
                    nI.l r1 = (nI.C17642l) r1
                    r11.P()
                    r0 = -1987240885(0xffffffff898d1c4b, float:-3.3971122E-33)
                    r11.W(r0)
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r0 = r10.f141478a
                    boolean r0 = r11.F(r0)
                    boolean r7 = r11.V(r2)
                    r0 = r0 | r7
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r7 = r10.f141478a
                    java.lang.Object r8 = r11.D()
                    if (r0 != 0) goto L_0x015b
                    U0.m$a r0 = U0.C4889m.f14007a
                    java.lang.Object r0 = r0.a()
                    if (r8 != r0) goto L_0x0163
                L_0x015b:
                    com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$w$a$b r8 = new com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$w$a$b
                    r8.<init>(r7, r2, r4)
                    r11.u(r8)
                L_0x0163:
                    r7 = r8
                    nI.p r7 = (nI.p) r7
                    r11.P()
                    r8 = 0
                    r9 = 4
                    r2 = 0
                    r0 = r3
                    r3 = r5
                    r4 = r6
                    r5 = r7
                    r6 = r11
                    r7 = r8
                    r8 = r9
                    WF.C16723k.h(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                    r11.P()
                L_0x0179:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x0182
                    U0.C4895p.R()
                L_0x0182:
                    return
                L_0x0183:
                    r0 = -1987284206(0xffffffff898c7312, float:-3.3811986E-33)
                    r11.W(r0)
                    r11.P()
                    XH.t r0 = new XH.t
                    r0.<init>()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.w.a.c(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                c((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        w(CatalogFragmentV2 catalogFragmentV2, Loadable<CachedCatalogItem> loadable) {
            this.f141476a = catalogFragmentV2;
            this.f141477b = loadable;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2034635886, i10, -1, "com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.updateProductInfo.<anonymous>.<anonymous> (CatalogFragmentV2.kt:382)");
                }
                tK.Z.g(C5607m.a(mVar, 0), C15673a.a(), c1.c.e(-459644628, true, new a(this.f141476a, this.f141477b), mVar, 54), mVar, 384, 0);
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

    public CatalogFragmentV2() {
        C16824o b10 = C16825p.b(new n(this));
        this.f141400K = W.b(this, P.b(Z.class), new o(b10), new p(b10), new q(this, b10));
        C16824o b11 = C16825p.b(new r(this));
        this.f141401L = W.b(this, P.b(com.sugarcube.decorate.v1.internal.v1.b.class), new s(b11), new t(b11), new u(this, b11));
    }

    /* access modifiers changed from: private */
    public final void A1() {
        C16458a aVar;
        RecyclerView recyclerView;
        C16480w wVar = this.f141402M;
        if (wVar != null && (aVar = wVar.f138481b) != null && (recyclerView = aVar.f138383i) != null && JF.Z.t(recyclerView)) {
            y2(this, false, 1, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void A2(C16465h hVar) {
        hVar.getRoot().setVisibility(8);
    }

    private final void B1(GridLayoutManager gridLayoutManager, RecyclerView recyclerView) {
        gridLayoutManager.Q3(new e(recyclerView));
    }

    /* access modifiers changed from: private */
    public static final void B2(C16465h hVar, Handler handler, Runnable runnable, View view) {
        hVar.getRoot().setVisibility(8);
        handler.removeCallbacks(runnable);
    }

    private final void C2(boolean z10) {
        C16480w wVar;
        C16458a aVar;
        if (J1().Z0().getValue() != Z.c.PRODUCT_RECOMMENDATIONS && (wVar = this.f141402M) != null && (aVar = wVar.f138481b) != null) {
            ConstraintLayout b10 = aVar.getRoot();
            C17542s.i(b10, "getRoot(...)");
            JF.Z.s(b10);
            aVar.f138381g.setVisibility(z10 ? 8 : 0);
            if (z10) {
                CardView b11 = aVar.f138380f.getRoot();
                C17542s.i(b11, "getRoot(...)");
                JF.Z.l(b11, 300, (C17631a) null, 2, (Object) null);
                return;
            }
            aVar.f138380f.getRoot().setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public final com.sugarcube.decorate.v1.internal.v1.b D1() {
        return (com.sugarcube.decorate.v1.internal.v1.b) this.f141401L.getValue();
    }

    static /* synthetic */ void D2(CatalogFragmentV2 catalogFragmentV2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        catalogFragmentV2.C2(z10);
    }

    private final RecyclerView.v E1(nI.p<? super Boolean, ? super Boolean, C16807N> pVar) {
        return new f(pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f138482c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void E2(java.util.List<XH.v<com.sugarcube.app.base.data.database.CachedCatalogItem, java.lang.Integer>> r3) {
        /*
            r2 = this;
            TF.w r0 = r2.f141402M
            if (r0 == 0) goto L_0x000d
            TF.d r0 = r0.f138482c
            if (r0 == 0) goto L_0x000d
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.getRoot()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            com.sugarcube.decorate.v1.internal.catalog.u r1 = new com.sugarcube.decorate.v1.internal.catalog.u
            r1.<init>(r2)
            NF.C13291e.c(r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.E2(java.util.List):void");
    }

    private final RecyclerView.v F1(GridLayoutManager gridLayoutManager) {
        return new g(gridLayoutManager, this);
    }

    /* access modifiers changed from: private */
    public static final C16807N F2(CatalogFragmentV2 catalogFragmentV2, ConstraintLayout constraintLayout, List list) {
        C17542s.j(constraintLayout, "layout");
        C17542s.j(list, "items");
        ((ComposeView) constraintLayout.findViewById(C16401b.f138080J)).setContent(c1.c.c(-2077156671, true, new v(list, catalogFragmentV2)));
        return C16807N.f139792a;
    }

    private final View.OnTouchListener G1() {
        return new C17096q(this);
    }

    private final void G2(Loadable<CachedCatalogItem> loadable) {
        C16461d dVar;
        ConstraintLayout b10;
        C16480w wVar = this.f141402M;
        if (wVar != null && (dVar = wVar.f138486g) != null && (b10 = dVar.getRoot()) != null) {
            View findViewById = b10.findViewById(C16401b.f138080J);
            C17542s.i(findViewById, "findViewById(...)");
            C13113u.h((ComposeView) findViewById, (C5747v0) null, c1.c.c(2034635886, true, new w(this, loadable)), 1, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final boolean H1(CatalogFragmentV2 catalogFragmentV2, View view, MotionEvent motionEvent) {
        C16480w wVar;
        C16458a aVar;
        if (motionEvent.getAction() != 0 || (wVar = catalogFragmentV2.f141402M) == null || (aVar = wVar.f138481b) == null) {
            return false;
        }
        ComposeView composeView = aVar.f138387m;
        Rect rect = new Rect();
        composeView.getGlobalVisibleRect(rect);
        if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return false;
        }
        catalogFragmentV2.J1().j1();
        return false;
    }

    private final void H2(List<CachedCatalogItem> list) {
        C16468k kVar;
        C16480w wVar = this.f141402M;
        if (!(wVar == null || (kVar = wVar.f138487h) == null)) {
            kVar.f138440g.c();
            if (!list.isEmpty()) {
                kVar.f138437d.setVisibility(8);
            }
        }
        C16561b bVar = this.f141404O;
        if (bVar != null) {
            bVar.f(C16877v.w1(list));
        }
    }

    /* access modifiers changed from: private */
    public final Z J1() {
        return (Z) this.f141400K.getValue();
    }

    private final void K1(Z.c cVar) {
        C16480w wVar = this.f141402M;
        if (wVar != null) {
            M1();
            switch (b.f141409a[cVar.ordinal()]) {
                case 1:
                    wVar.f138487h.getRoot().setVisibility(0);
                    wVar.f138481b.getRoot().setVisibility(4);
                    wVar.f138483d.getRoot().setVisibility(4);
                    wVar.f138488i.getRoot().setVisibility(4);
                    wVar.f138486g.getRoot().setVisibility(4);
                    wVar.f138482c.getRoot().setVisibility(4);
                    return;
                case 2:
                    C16458a aVar = wVar.f138481b;
                    aVar.f138383i.setVisibility(0);
                    aVar.getRoot().setVisibility(0);
                    if (J1().b1()) {
                        RecyclerView recyclerView = aVar.f138379e;
                        C17542s.i(recyclerView, "catalogFilterList");
                        JF.Z.l(recyclerView, 0, (C17631a) null, 3, (Object) null);
                    } else {
                        aVar.f138379e.setVisibility(8);
                    }
                    wVar.f138483d.getRoot().setVisibility(4);
                    wVar.f138488i.getRoot().setVisibility(4);
                    wVar.f138487h.getRoot().setVisibility(4);
                    wVar.f138486g.getRoot().setVisibility(4);
                    wVar.f138482c.getRoot().setVisibility(4);
                    return;
                case 3:
                    wVar.f138483d.getRoot().setVisibility(0);
                    wVar.f138481b.getRoot().setVisibility(4);
                    wVar.f138488i.getRoot().setVisibility(4);
                    wVar.f138487h.getRoot().setVisibility(4);
                    wVar.f138486g.getRoot().setVisibility(4);
                    wVar.f138482c.getRoot().setVisibility(4);
                    return;
                case 4:
                    C16458a aVar2 = wVar.f138481b;
                    aVar2.getRoot().setVisibility(0);
                    RecyclerView recyclerView2 = aVar2.f138379e;
                    C17542s.i(recyclerView2, "catalogFilterList");
                    JF.Z.l(recyclerView2, 0, (C17631a) null, 3, (Object) null);
                    wVar.f138483d.getRoot().setVisibility(4);
                    wVar.f138488i.getRoot().setVisibility(4);
                    wVar.f138487h.getRoot().setVisibility(4);
                    wVar.f138486g.getRoot().setVisibility(4);
                    wVar.f138482c.getRoot().setVisibility(4);
                    return;
                case 5:
                    C16458a aVar3 = wVar.f138481b;
                    aVar3.getRoot().setVisibility(0);
                    aVar3.f138379e.setVisibility(8);
                    wVar.f138481b.getRoot().setVisibility(0);
                    wVar.f138488i.getRoot().setVisibility(4);
                    wVar.f138483d.getRoot().setVisibility(4);
                    wVar.f138487h.getRoot().setVisibility(4);
                    wVar.f138486g.getRoot().setVisibility(4);
                    wVar.f138482c.getRoot().setVisibility(4);
                    return;
                case 6:
                    C16458a aVar4 = wVar.f138481b;
                    aVar4.getRoot().setVisibility(0);
                    aVar4.f138379e.setVisibility(8);
                    wVar.f138483d.getRoot().setVisibility(4);
                    wVar.f138488i.getRoot().setVisibility(4);
                    wVar.f138487h.getRoot().setVisibility(4);
                    wVar.f138486g.getRoot().setVisibility(4);
                    wVar.f138482c.getRoot().setVisibility(4);
                    return;
                case 7:
                    wVar.f138486g.getRoot().setVisibility(0);
                    wVar.f138487h.getRoot().setVisibility(4);
                    wVar.f138481b.getRoot().setVisibility(4);
                    wVar.f138483d.getRoot().setVisibility(4);
                    wVar.f138488i.getRoot().setVisibility(4);
                    wVar.f138482c.getRoot().setVisibility(4);
                    return;
                case 8:
                    wVar.f138482c.getRoot().setVisibility(0);
                    wVar.f138487h.getRoot().setVisibility(4);
                    wVar.f138481b.getRoot().setVisibility(4);
                    wVar.f138483d.getRoot().setVisibility(4);
                    wVar.f138488i.getRoot().setVisibility(4);
                    wVar.f138486g.getRoot().setVisibility(4);
                    return;
                case 9:
                    C16458a aVar5 = wVar.f138481b;
                    aVar5.f138377c.setVisibility(0);
                    aVar5.f138381g.setVisibility(8);
                    aVar5.f138387m.setVisibility(8);
                    aVar5.f138376b.setVisibility(8);
                    aVar5.f138383i.setVisibility(8);
                    aVar5.f138379e.setVisibility(8);
                    return;
                default:
                    throw new XH.t();
            }
        }
    }

    private final void L1() {
        Z J12 = J1();
        FilterPillAdapter filterPillAdapter = this.f141406Q;
        boolean z10 = false;
        if (filterPillAdapter != null && filterPillAdapter.e()) {
            z10 = true;
        }
        J12.k1(z10);
        CatalogCategoryAdapter catalogCategoryAdapter = this.f141407R;
        if (catalogCategoryAdapter != null) {
            catalogCategoryAdapter.g();
        }
        CatalogCategoryAdapter catalogCategoryAdapter2 = this.f141408S;
        if (catalogCategoryAdapter2 != null) {
            catalogCategoryAdapter2.g();
        }
    }

    private final void M1() {
        C16458a aVar;
        C16480w wVar = this.f141402M;
        if (!(wVar == null || (aVar = wVar.f138481b) == null)) {
            aVar.f138377c.setVisibility(8);
            aVar.getRoot().setVisibility(0);
            aVar.f138381g.setVisibility(0);
            aVar.f138387m.setVisibility(0);
            aVar.f138376b.setVisibility(0);
            aVar.f138383i.setVisibility(0);
            aVar.f138379e.setVisibility(0);
        }
        C16480w wVar2 = this.f141402M;
        if (wVar2 != null) {
            wVar2.f138486g.getRoot().setVisibility(4);
            wVar2.f138487h.getRoot().setVisibility(4);
            wVar2.f138483d.getRoot().setVisibility(4);
            wVar2.f138482c.getRoot().setVisibility(4);
        }
    }

    private final void N1() {
        Scene E02 = D1().E0();
        if (E02 != null) {
            J1().p1(new Z.d(E02.getName(), E02.getSceneUuid(), E02.isStock(), D1().A0()));
        }
    }

    /* access modifiers changed from: private */
    public final void O1(int i10) {
        C16468k kVar;
        C16480w wVar = this.f141402M;
        if (wVar != null && (kVar = wVar.f138487h) != null) {
            TextView textView = kVar.f138441h;
            textView.setText(textView.getContext().getResources().getQuantityString(C13320l.f113161a, i10, new Object[]{Integer.valueOf(i10)}));
        }
    }

    private final void P1() {
        this.f141403N = new C16561b(new i(this), I1().c(), J1().P0());
        this.f141404O = new C16561b(new j(this), I1().c(), J1().P0());
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        this.f141405P = new C16562c(requireContext);
        this.f141406Q = new FilterPillAdapter((List) null, new C17080a(this), 1, (DefaultConstructorMarker) null);
        this.f141407R = new CatalogCategoryAdapter(new C17091l(this));
        this.f141408S = new CatalogCategoryAdapter(new C17101w(this));
    }

    /* access modifiers changed from: private */
    public static final void Q1(CatalogFragmentV2 catalogFragmentV2, String str) {
        C16458a aVar;
        C16480w wVar = catalogFragmentV2.f141402M;
        if (!(wVar == null || (aVar = wVar.f138481b) == null)) {
            ConstraintLayout b10 = aVar.getRoot();
            C17542s.i(b10, "getRoot(...)");
            JF.Z.s(b10);
            catalogFragmentV2.J1().j1();
            RecyclerView recyclerView = aVar.f138383i;
            C17542s.i(recyclerView, "catalogRecyclerView");
            JF.Z.o(recyclerView, 0, false, (C17631a) null, 7, (Object) null);
        }
        catalogFragmentV2.J1().w0(str, true, SearchType.QUICK_FILTER);
    }

    /* access modifiers changed from: private */
    public static final void R1(CatalogFragmentV2 catalogFragmentV2, CatalogCategory catalogCategory) {
        C17542s.j(catalogCategory, "it");
        CatalogCategoryAdapter catalogCategoryAdapter = catalogFragmentV2.f141408S;
        if (catalogCategoryAdapter != null) {
            catalogCategoryAdapter.g();
        }
        catalogFragmentV2.J1().m1(catalogCategory);
    }

    /* access modifiers changed from: private */
    public static final void S1(CatalogFragmentV2 catalogFragmentV2, CatalogCategory catalogCategory) {
        C16468k kVar;
        BouncingBallView bouncingBallView;
        C17542s.j(catalogCategory, "it");
        C16561b bVar = catalogFragmentV2.f141404O;
        if (bVar != null) {
            bVar.f(new ArrayList());
        }
        C16480w wVar = catalogFragmentV2.f141402M;
        if (!(wVar == null || (kVar = wVar.f138487h) == null || (bouncingBallView = kVar.f138440g) == null)) {
            bouncingBallView.b();
        }
        catalogFragmentV2.J1().y0(catalogCategory);
        Z J12 = catalogFragmentV2.J1();
        SearchType searchType = SearchType.CATEGORY;
        CatalogCategory value = catalogFragmentV2.J1().F0().getValue();
        J12.g1(searchType, (String) null, value != null ? value.getName() : null, catalogCategory.getName());
    }

    private final void T1() {
        C16458a aVar;
        C16480w wVar = this.f141402M;
        if (wVar != null && (aVar = wVar.f138481b) != null) {
            RecyclerView recyclerView = aVar.f138383i;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 3);
            C17542s.g(recyclerView);
            B1(gridLayoutManager, recyclerView);
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.setAdapter(this.f141403N);
            recyclerView.n(F1(gridLayoutManager));
            recyclerView.n(E1(new C17089j(this, recyclerView)));
            aVar.f138376b.setOnClickListener(new C17090k(this));
            aVar.f138377c.setOnClickListener(new C17092m(this));
            aVar.f138381g.setOnClickListener(new C17093n(this));
            C16466i iVar = aVar.f138380f;
            iVar.getRoot().setForeground((Drawable) null);
            iVar.f138418b.setOnClickListener(new C17094o(this));
            TextView textView = aVar.f138388n.f138413b;
            textView.setText(Html.fromHtml(getString(OE.n.f113343c5), 0));
            textView.setOnClickListener(new C17095p(this));
            RecyclerView recyclerView2 = aVar.f138379e;
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
            recyclerView2.setAdapter(this.f141406Q);
            recyclerView2.m(new k(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void U1(CatalogFragmentV2 catalogFragmentV2, View view) {
        D2(catalogFragmentV2, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void V1(CatalogFragmentV2 catalogFragmentV2, View view) {
        catalogFragmentV2.C2(false);
    }

    /* access modifiers changed from: private */
    public static final void W1(CatalogFragmentV2 catalogFragmentV2, View view) {
        catalogFragmentV2.J1().l1();
    }

    /* access modifiers changed from: private */
    public static final C16807N X1(CatalogFragmentV2 catalogFragmentV2, RecyclerView recyclerView, boolean z10, boolean z11) {
        if (z10 || z11) {
            catalogFragmentV2.C2(false);
            if (!recyclerView.canScrollVertically(-1)) {
                y2(catalogFragmentV2, false, 1, (Object) null);
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void Y1(CatalogFragmentV2 catalogFragmentV2, View view) {
        catalogFragmentV2.J1().j1();
        catalogFragmentV2.J1().q1();
        C17542s.g(view);
        JF.Z.s(view);
    }

    /* access modifiers changed from: private */
    public static final void Z1(CatalogFragmentV2 catalogFragmentV2, View view) {
        catalogFragmentV2.J1().t0();
    }

    private final void a2() {
        C16459b bVar;
        C16480w wVar = this.f141402M;
        if (wVar != null && (bVar = wVar.f138483d) != null) {
            RecyclerView recyclerView = bVar.f138390b;
            RecyclerView.n itemAnimator = recyclerView.getItemAnimator();
            C17542s.h(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((x) itemAnimator).setSupportsChangeAnimations(false);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.f141407R);
            RecyclerView recyclerView2 = bVar.f138394f;
            RecyclerView.n itemAnimator2 = recyclerView2.getItemAnimator();
            C17542s.h(itemAnimator2, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((x) itemAnimator2).setSupportsChangeAnimations(false);
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
            recyclerView2.setAdapter(this.f141408S);
            bVar.f138396h.setOnClickListener(new r(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void b2(CatalogFragmentV2 catalogFragmentV2, View view) {
        catalogFragmentV2.L1();
    }

    private final void c2() {
        Z J12 = J1();
        J12.O0().observe(getViewLifecycleOwner(), new h(new E(this)));
        J12.Z0().observe(getViewLifecycleOwner(), new h(new K(this)));
        J12.J0().observe(getViewLifecycleOwner(), new h(new C17081b(this)));
        J12.N0().observe(getViewLifecycleOwner(), new h(new C17082c(this)));
        J12.Q0().observe(getViewLifecycleOwner(), new h(new C17083d(J12, this)));
        J12.W0().observe(getViewLifecycleOwner(), new h(new C17084e(this)));
        J12.L0().observe(getViewLifecycleOwner(), new h(new C17085f(this)));
        J12.V0().observe(getViewLifecycleOwner(), new h(new C17086g(this)));
        J12.U0().observe(getViewLifecycleOwner(), new h(new C17087h(this)));
        J12.I0().observe(getViewLifecycleOwner(), new h(new C17088i(this)));
        J12.R0().observe(getViewLifecycleOwner(), new h(new F(J12, this)));
        J12.G0().observe(getViewLifecycleOwner(), new h(new G(this)));
        J12.E0().observe(getViewLifecycleOwner(), new h(new H(this)));
        J12.M0().observe(getViewLifecycleOwner(), new h(new I(this)));
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new l(J12, this, (C17164e<? super l>) null), 3, (Object) null);
        D1().B0().observe(getViewLifecycleOwner(), new h(new J(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N d2(CatalogFragmentV2 catalogFragmentV2, List list) {
        C16561b bVar = catalogFragmentV2.f141403N;
        if (bVar != null) {
            C17542s.g(list);
            bVar.e(list);
        }
        C16561b bVar2 = catalogFragmentV2.f141404O;
        if (bVar2 != null) {
            C17542s.g(list);
            bVar2.e(list);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e2(CatalogFragmentV2 catalogFragmentV2, Z.c cVar) {
        C17542s.g(cVar);
        catalogFragmentV2.K1(cVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f2(CatalogFragmentV2 catalogFragmentV2, Integer num) {
        C16458a aVar;
        TextView textView;
        String str;
        Resources resources;
        C16480w wVar = catalogFragmentV2.f141402M;
        if (!(wVar == null || (aVar = wVar.f138481b) == null || (textView = aVar.f138385k) == null)) {
            C5191t activity = catalogFragmentV2.getActivity();
            if (activity == null || (resources = activity.getResources()) == null) {
                str = null;
            } else {
                C17542s.g(num);
                str = resources.getString(num.intValue());
            }
            textView.setText(str);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g2(CatalogFragmentV2 catalogFragmentV2, List list) {
        C16458a aVar;
        if (list != null) {
            C16480w wVar = catalogFragmentV2.f141402M;
            if (!(wVar == null || (aVar = wVar.f138481b) == null)) {
                RecyclerView recyclerView = aVar.f138383i;
                C17542s.i(recyclerView, "catalogRecyclerView");
                JF.Z.l(recyclerView, 0, (C17631a) null, 3, (Object) null);
            }
            C16561b bVar = catalogFragmentV2.f141403N;
            if (bVar != null) {
                bVar.f(C16877v.w1(list));
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h2(Z z10, CatalogFragmentV2 catalogFragmentV2, List list) {
        C16458a aVar;
        if (list != null) {
            Z.c value = z10.Z0().getValue();
            if ((value == null ? -1 : b.f141409a[value.ordinal()]) == 1) {
                catalogFragmentV2.H2(list);
            } else {
                C16480w wVar = catalogFragmentV2.f141402M;
                if (!(wVar == null || (aVar = wVar.f138481b) == null)) {
                    Collection collection = list;
                    if (!collection.isEmpty()) {
                        RecyclerView recyclerView = aVar.f138383i;
                        C17542s.i(recyclerView, "catalogRecyclerView");
                        JF.Z.l(recyclerView, 0, (C17631a) null, 3, (Object) null);
                        C16561b bVar = catalogFragmentV2.f141403N;
                        if (bVar != null) {
                            bVar.f(C16877v.w1(collection));
                        }
                    } else {
                        aVar.f138383i.setVisibility(4);
                    }
                }
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i2(CatalogFragmentV2 catalogFragmentV2, List list) {
        if (list != null) {
            catalogFragmentV2.H2(list);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j2(CatalogFragmentV2 catalogFragmentV2, List list) {
        C16459b bVar;
        C16480w wVar = catalogFragmentV2.f141402M;
        if (!(wVar == null || (bVar = wVar.f138483d) == null)) {
            ConstraintLayout constraintLayout = bVar.f138392d;
            C17542s.i(constraintLayout, "catalogCategoriesWaitSection");
            JF.Z.x(constraintLayout, list.isEmpty(), 0, 2, (Object) null);
            LinearLayout linearLayout = bVar.f138395g;
            C17542s.i(linearLayout, "categoriesSectionContent");
            C17542s.g(list);
            JF.Z.x(linearLayout, !list.isEmpty(), 0, 2, (Object) null);
        }
        CatalogCategoryAdapter catalogCategoryAdapter = catalogFragmentV2.f141407R;
        if (catalogCategoryAdapter != null) {
            catalogCategoryAdapter.h(list);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k2(CatalogFragmentV2 catalogFragmentV2, List list) {
        CatalogCategoryAdapter catalogCategoryAdapter;
        if (!(list == null || (catalogCategoryAdapter = catalogFragmentV2.f141408S) == null)) {
            catalogCategoryAdapter.h(list);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l2(CatalogFragmentV2 catalogFragmentV2, String str) {
        C16468k kVar;
        TextView textView;
        C16480w wVar = catalogFragmentV2.f141402M;
        if (!(wVar == null || (kVar = wVar.f138487h) == null || (textView = kVar.f138442i) == null)) {
            textView.setText(str);
        }
        catalogFragmentV2.O1(0);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m2(CatalogFragmentV2 catalogFragmentV2, List list) {
        C16562c cVar = catalogFragmentV2.f141405P;
        if (cVar != null) {
            cVar.c(list);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n2(Z z10, CatalogFragmentV2 catalogFragmentV2, List list) {
        FilterPillAdapter filterPillAdapter;
        if (z10.Z0().getValue() == Z.c.BROWSE && (filterPillAdapter = catalogFragmentV2.f141406Q) != null) {
            filterPillAdapter.d();
        }
        FilterPillAdapter filterPillAdapter2 = catalogFragmentV2.f141406Q;
        if (filterPillAdapter2 != null) {
            C17542s.g(list);
            filterPillAdapter2.i(list);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o2(CatalogFragmentV2 catalogFragmentV2, Loadable loadable) {
        C17542s.g(loadable);
        catalogFragmentV2.G2(loadable);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p2(CatalogFragmentV2 catalogFragmentV2, List list) {
        catalogFragmentV2.E2(list);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: nI.a<XH.N>} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109 A[SYNTHETIC, Splitter:B:45:0x0109] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011c A[Catch:{ all -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q1(java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem> r12, nI.C17631a<XH.C16807N> r13, dI.C17164e<? super java.lang.Boolean> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$c r0 = (com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.c) r0
            int r1 = r0.f141425r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f141425r = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$c r0 = new com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$c
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f141423p
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f141425r
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x005f
            if (r3 != r4) goto L_0x0057
            java.lang.Object r12 = r0.f141419l
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r12 = r0.f141418k
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r12 = r0.f141417j
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r12 = r0.f141416i
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r12 = r0.f141415h
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r0.f141414g
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r0.f141413f
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f141412e
            r13 = r12
            nI.a r13 = (nI.C17631a) r13
            java.lang.Object r12 = r0.f141411d
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r14 = r0.f141410c
            com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r14 = (com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2) r14
            XH.y.b(r1)     // Catch:{ all -> 0x0054 }
            goto L_0x0107
        L_0x0054:
            r13 = move-exception
            goto L_0x0137
        L_0x0057:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x005f:
            XH.y.b(r1)
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0088 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0088 }
            r3.<init>()     // Catch:{ all -> 0x0088 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0088 }
        L_0x006e:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x0088 }
            if (r6 == 0) goto L_0x008c
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x0088 }
            com.sugarcube.app.base.data.database.CachedCatalogItem r6 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r6     // Catch:{ all -> 0x0088 }
            com.sugarcube.core.network.models.CatalogItem r6 = r6.getCatalogItem()     // Catch:{ all -> 0x0088 }
            java.lang.String r6 = r6.getLocalItemNumber()     // Catch:{ all -> 0x0088 }
            if (r6 == 0) goto L_0x006e
            r3.add(r6)     // Catch:{ all -> 0x0088 }
            goto L_0x006e
        L_0x0088:
            r13 = move-exception
            r14 = r11
            goto L_0x0137
        L_0x008c:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0088 }
            r6 = 10
            int r6 = YH.C16877v.y(r3, r6)     // Catch:{ all -> 0x0088 }
            r1.<init>(r6)     // Catch:{ all -> 0x0088 }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ all -> 0x0088 }
        L_0x009b:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0088 }
            if (r7 == 0) goto L_0x00db
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0088 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0088 }
            boolean r8 = r3.isEmpty()     // Catch:{ all -> 0x0088 }
            if (r8 == 0) goto L_0x00af
            r9 = r5
            goto L_0x00ce
        L_0x00af:
            java.util.Iterator r8 = r3.iterator()     // Catch:{ all -> 0x0088 }
            r9 = r5
        L_0x00b4:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x0088 }
            if (r10 == 0) goto L_0x00ce
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x0088 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0088 }
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r7)     // Catch:{ all -> 0x0088 }
            if (r10 == 0) goto L_0x00b4
            int r9 = r9 + 1
            if (r9 >= 0) goto L_0x00b4
            YH.C16877v.w()     // Catch:{ all -> 0x0088 }
            goto L_0x00b4
        L_0x00ce:
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.e(r9)     // Catch:{ all -> 0x0088 }
            XH.v r9 = new XH.v     // Catch:{ all -> 0x0088 }
            r9.<init>(r7, r8)     // Catch:{ all -> 0x0088 }
            r1.add(r9)     // Catch:{ all -> 0x0088 }
            goto L_0x009b
        L_0x00db:
            java.util.List r7 = YH.C16877v.m0(r1)     // Catch:{ all -> 0x0088 }
            com.sugarcube.app.base.external.interactions.CartInteractions r8 = r11.C1()     // Catch:{ all -> 0x0088 }
            r0.f141410c = r11     // Catch:{ all -> 0x0088 }
            r0.f141411d = r12     // Catch:{ all -> 0x0088 }
            r0.f141412e = r13     // Catch:{ all -> 0x0088 }
            r0.f141413f = r14     // Catch:{ all -> 0x0088 }
            r0.f141414g = r7     // Catch:{ all -> 0x0088 }
            r0.f141415h = r7     // Catch:{ all -> 0x0088 }
            r0.f141416i = r3     // Catch:{ all -> 0x0088 }
            r0.f141417j = r3     // Catch:{ all -> 0x0088 }
            r0.f141418k = r1     // Catch:{ all -> 0x0088 }
            r0.f141419l = r6     // Catch:{ all -> 0x0088 }
            r0.f141420m = r5     // Catch:{ all -> 0x0088 }
            r0.f141421n = r5     // Catch:{ all -> 0x0088 }
            r0.f141422o = r5     // Catch:{ all -> 0x0088 }
            r0.f141425r = r4     // Catch:{ all -> 0x0088 }
            java.lang.Object r14 = r8.addItems(r7, r0)     // Catch:{ all -> 0x0088 }
            if (r14 != r2) goto L_0x0106
            return r2
        L_0x0106:
            r14 = r11
        L_0x0107:
            if (r13 == 0) goto L_0x010c
            r13.invoke()     // Catch:{ all -> 0x0054 }
        L_0x010c:
            android.content.res.Resources r13 = r14.getResources()     // Catch:{ all -> 0x0054 }
            int r0 = OE.n.f113499z1     // Catch:{ all -> 0x0054 }
            java.lang.String r13 = r13.getString(r0)     // Catch:{ all -> 0x0054 }
            androidx.fragment.app.t r0 = r14.getActivity()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0151
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ all -> 0x0054 }
            r1 = -1
            com.google.android.material.snackbar.Snackbar r13 = com.google.android.material.snackbar.Snackbar.q0(r0, r13, r1)     // Catch:{ all -> 0x0054 }
            int r0 = OE.n.f113386j     // Catch:{ all -> 0x0054 }
            com.sugarcube.decorate.v1.internal.catalog.A r1 = new com.sugarcube.decorate.v1.internal.catalog.A     // Catch:{ all -> 0x0054 }
            r1.<init>()     // Catch:{ all -> 0x0054 }
            com.google.android.material.snackbar.Snackbar r13 = r13.s0(r0, r1)     // Catch:{ all -> 0x0054 }
            r13.b0()     // Catch:{ all -> 0x0054 }
            goto L_0x0151
        L_0x0137:
            com.sugarcube.decorate.v1.internal.catalog.Z r0 = r14.J1()
            java.lang.String r1 = r13.getMessage()
            r0.f1(r12, r1)
            androidx.fragment.app.t r12 = r14.getActivity()
            TF.w r0 = r14.f141402M
            com.sugarcube.decorate.v1.internal.catalog.B r1 = new com.sugarcube.decorate.v1.internal.catalog.B
            r1.<init>(r14, r13)
            NF.C13291e.c(r12, r0, r1)
            r4 = r5
        L_0x0151:
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.q1(java.util.List, nI.a, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final C16807N q2(CatalogFragmentV2 catalogFragmentV2, Boolean bool) {
        catalogFragmentV2.A1();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void r1(View view) {
    }

    /* access modifiers changed from: private */
    public static final C16807N r2(CatalogFragmentV2 catalogFragmentV2, RoomType roomType) {
        Z J12 = catalogFragmentV2.J1();
        C17542s.g(roomType);
        J12.v0(roomType);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s1(CatalogFragmentV2 catalogFragmentV2, Throwable th2, C5191t tVar, C16480w wVar) {
        C17542s.j(tVar, "activity");
        C17542s.j(wVar, "binding");
        tVar.runOnUiThread(new D(catalogFragmentV2, tVar, wVar, th2));
        return C16807N.f139792a;
    }

    private final void s2() {
        C16458a aVar;
        ComposeView composeView;
        C16480w wVar = this.f141402M;
        if (wVar != null && (aVar = wVar.f138481b) != null && (composeView = aVar.f138387m) != null) {
            C13113u.g(composeView, C5747v0.k(C5747v0.f27350b.h()), c1.c.c(1536168844, true, new m(this)));
        }
    }

    /* access modifiers changed from: private */
    public static final void t1(CatalogFragmentV2 catalogFragmentV2, C5191t tVar, C16480w wVar, Throwable th2) {
        CartInteractions C12 = catalogFragmentV2.C1();
        ConstraintLayout b10 = wVar.getRoot();
        C17542s.i(b10, "getRoot(...)");
        C12.showAddToCartException(tVar, b10, th2, (String) null);
    }

    private final void t2() {
        C16468k kVar;
        C16480w wVar = this.f141402M;
        if (wVar != null && (kVar = wVar.f138487h) != null) {
            RecyclerView recyclerView = kVar.f138439f;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 3);
            C17542s.g(recyclerView);
            B1(gridLayoutManager, recyclerView);
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.setAdapter(this.f141404O);
            recyclerView.n(F1(gridLayoutManager));
            kVar.f138436c.setOnClickListener(new C17097s(this));
            TextView textView = kVar.f138435b.f138413b;
            textView.setText(Html.fromHtml(getString(OE.n.f113343c5), 0));
            textView.setOnClickListener(new C17098t(this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: nI.a<XH.N>} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        if (r1 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084 A[SYNTHETIC, Splitter:B:25:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[Catch:{ all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4 A[Catch:{ all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u1(com.sugarcube.app.base.data.database.CachedCatalogItem r11, nI.C17631a<XH.C16807N> r12, dI.C17164e<? super java.lang.Boolean> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.d
            if (r0 == 0) goto L_0x0014
            r0 = r13
            com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$d r0 = (com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.d) r0
            int r1 = r0.f141436m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f141436m = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$d r0 = new com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2$d
            r0.<init>(r10, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r4.f141434k
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r4.f141436m
            r8 = 0
            r9 = 1
            if (r1 == 0) goto L_0x0054
            if (r1 != r9) goto L_0x004c
            java.lang.Object r11 = r4.f141432i
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r4.f141431h
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r4.f141430g
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r4.f141429f
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r4.f141428e
            r12 = r11
            nI.a r12 = (nI.C17631a) r12
            java.lang.Object r11 = r4.f141427d
            com.sugarcube.app.base.data.database.CachedCatalogItem r11 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r11
            java.lang.Object r13 = r4.f141426c
            com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2 r13 = (com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2) r13
            XH.y.b(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x0082
        L_0x0049:
            r12 = move-exception
            goto L_0x00d2
        L_0x004c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0054:
            XH.y.b(r0)
            com.sugarcube.core.network.models.CatalogItem r0 = r11.getCatalogItem()     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = r0.getLocalItemNumber()     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x00ef
            com.sugarcube.app.base.external.interactions.CartInteractions r1 = r10.C1()     // Catch:{ all -> 0x00d0 }
            r4.f141426c = r10     // Catch:{ all -> 0x00d0 }
            r4.f141427d = r11     // Catch:{ all -> 0x00d0 }
            r4.f141428e = r12     // Catch:{ all -> 0x00d0 }
            r4.f141429f = r13     // Catch:{ all -> 0x00d0 }
            r4.f141430g = r2     // Catch:{ all -> 0x00d0 }
            r4.f141431h = r2     // Catch:{ all -> 0x00d0 }
            r4.f141432i = r2     // Catch:{ all -> 0x00d0 }
            r4.f141433j = r8     // Catch:{ all -> 0x00d0 }
            r4.f141436m = r9     // Catch:{ all -> 0x00d0 }
            r3 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r13 = com.sugarcube.app.base.external.interactions.CartInteractions.a.a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00d0 }
            if (r13 != r7) goto L_0x0081
            return r7
        L_0x0081:
            r13 = r10
        L_0x0082:
            if (r12 == 0) goto L_0x0087
            r12.invoke()     // Catch:{ all -> 0x0049 }
        L_0x0087:
            android.content.res.Resources r12 = r13.getResources()     // Catch:{ all -> 0x0049 }
            int r0 = OE.n.f113169A1     // Catch:{ all -> 0x0049 }
            com.sugarcube.core.network.models.CatalogItem r1 = r11.getCatalogItem()     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x00a4
            java.util.Locale r2 = java.util.Locale.ROOT     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = r1.toUpperCase(r2)     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)     // Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x00a6
        L_0x00a4:
            java.lang.String r1 = "Item"
        L_0x00a6:
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ all -> 0x0049 }
            java.lang.String r12 = r12.getString(r0, r1)     // Catch:{ all -> 0x0049 }
            androidx.fragment.app.t r0 = r13.getActivity()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x00ce
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ all -> 0x0049 }
            r1 = -1
            com.google.android.material.snackbar.Snackbar r12 = com.google.android.material.snackbar.Snackbar.q0(r0, r12, r1)     // Catch:{ all -> 0x0049 }
            int r0 = OE.n.f113386j     // Catch:{ all -> 0x0049 }
            com.sugarcube.decorate.v1.internal.catalog.y r1 = new com.sugarcube.decorate.v1.internal.catalog.y     // Catch:{ all -> 0x0049 }
            r1.<init>()     // Catch:{ all -> 0x0049 }
            com.google.android.material.snackbar.Snackbar r12 = r12.s0(r0, r1)     // Catch:{ all -> 0x0049 }
            r12.b0()     // Catch:{ all -> 0x0049 }
        L_0x00ce:
            r8 = r9
            goto L_0x00ef
        L_0x00d0:
            r12 = move-exception
            r13 = r10
        L_0x00d2:
            com.sugarcube.decorate.v1.internal.catalog.Z r0 = r13.J1()
            java.util.List r1 = YH.C16877v.e(r11)
            java.lang.String r2 = r12.getMessage()
            r0.f1(r1, r2)
            androidx.fragment.app.t r0 = r13.getActivity()
            TF.w r1 = r13.f141402M
            com.sugarcube.decorate.v1.internal.catalog.z r2 = new com.sugarcube.decorate.v1.internal.catalog.z
            r2.<init>(r13, r12, r11)
            NF.C13291e.c(r0, r1, r2)
        L_0x00ef:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2.u1(com.sugarcube.app.base.data.database.CachedCatalogItem, nI.a, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final void u2(CatalogFragmentV2 catalogFragmentV2, View view) {
        catalogFragmentV2.J1().q1();
        y2(catalogFragmentV2, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void v1(View view) {
    }

    /* access modifiers changed from: private */
    public static final void v2(CatalogFragmentV2 catalogFragmentV2, View view) {
        catalogFragmentV2.J1().l1();
    }

    /* access modifiers changed from: private */
    public static final C16807N w1(CatalogFragmentV2 catalogFragmentV2, Throwable th2, CachedCatalogItem cachedCatalogItem, C5191t tVar, C16480w wVar) {
        C17542s.j(tVar, "activity");
        C17542s.j(wVar, "binding");
        tVar.runOnUiThread(new C(catalogFragmentV2, tVar, wVar, th2, cachedCatalogItem));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void w2(boolean z10) {
        C16458a aVar;
        C16480w wVar = this.f141402M;
        if (wVar != null && (aVar = wVar.f138481b) != null) {
            if (z10) {
                aVar.f138386l.b();
                aVar.f138386l.setVisibility(0);
                return;
            }
            aVar.f138386l.c();
            aVar.f138386l.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final void x1(CatalogFragmentV2 catalogFragmentV2, C5191t tVar, C16480w wVar, Throwable th2, CachedCatalogItem cachedCatalogItem) {
        CartInteractions C12 = catalogFragmentV2.C1();
        ConstraintLayout b10 = wVar.getRoot();
        C17542s.i(b10, "getRoot(...)");
        C12.showAddToCartException(tVar, b10, th2, cachedCatalogItem.getCatalogItem().getName());
    }

    /* access modifiers changed from: private */
    public final void x2(boolean z10) {
        C16480w wVar = this.f141402M;
        if (wVar != null && wVar.f138481b != null) {
            if (z10) {
                J1().i1();
            } else {
                J1().h1();
            }
            z1(z10);
        }
    }

    /* access modifiers changed from: private */
    public final boolean y1(CachedCatalogItem cachedCatalogItem) {
        return J1().o0(androidx.navigation.fragment.a.a(this), cachedCatalogItem);
    }

    static /* synthetic */ void y2(CatalogFragmentV2 catalogFragmentV2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        catalogFragmentV2.x2(z10);
    }

    private final void z1(boolean z10) {
        C16458a aVar;
        C16480w wVar = this.f141402M;
        if (wVar != null && (aVar = wVar.f138481b) != null) {
            ConstraintLayout b10 = aVar.getRoot();
            C17542s.i(b10, "getRoot(...)");
            androidx.transition.w wVar2 = new androidx.transition.w();
            int i10 = 0;
            wVar2.L0(0);
            C7025k kVar = new C7025k(48);
            float f10 = (float) 300;
            kVar.q0((long) (1.0f * f10));
            kVar.d(aVar.f138384j);
            C7016b bVar = new C7016b();
            bVar.q0((long) (f10 * 0.7f));
            bVar.d(aVar.f138382h);
            bVar.d(aVar.f138383i);
            bVar.d(aVar.f138378d);
            bVar.d(aVar.f138386l);
            wVar2.B0(kVar);
            wVar2.B0(bVar);
            if (!z10) {
                i10 = 8;
            }
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.g(b10);
            cVar.w(aVar.f138384j.getId(), i10);
            androidx.transition.t.a(b10, wVar2);
            cVar.c(b10);
        }
    }

    /* access modifiers changed from: private */
    public final void z2() {
        C16465h hVar;
        C16480w wVar = this.f141402M;
        if (wVar != null && (hVar = wVar.f138489j) != null) {
            FrameLayout b10 = hVar.getRoot();
            C17542s.i(b10, "getRoot(...)");
            JF.Z.s(b10);
            if (hVar.getRoot().getVisibility() != 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                C17100v vVar = new C17100v(hVar);
                hVar.getRoot().setVisibility(0);
                hVar.f138415b.setOnClickListener(new C17102x(hVar, handler, vVar));
                handler.postDelayed(vVar, 3500);
            }
        }
    }

    public final CartInteractions C1() {
        CartInteractions cartInteractions = this.f141399J;
        if (cartInteractions != null) {
            return cartInteractions;
        }
        C17542s.z("cartInteractions");
        return null;
    }

    public final OE.q I1() {
        OE.q qVar = this.f141398I;
        if (qVar != null) {
            return qVar;
        }
        C17542s.z("sugarcube");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout b10;
        C17542s.j(layoutInflater, "inflater");
        this.f141402M = C16480w.c(layoutInflater, viewGroup, false);
        N1();
        P1();
        T1();
        a2();
        s2();
        t2();
        C16480w wVar = this.f141402M;
        if (wVar == null || (b10 = wVar.getRoot()) == null) {
            return null;
        }
        b10.setOnTouchListener(G1());
        return b10;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        c2();
    }
}
