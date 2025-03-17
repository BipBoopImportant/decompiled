package com.sugarcube.decorate.v1.internal.v1.toolbar;

import JF.C13111s;
import NF.C13291e;
import OE.C13316h;
import OE.n;
import OE.q;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import TF.C16473p;
import TF.C16474q;
import TF.C16475r;
import TF.C16476s;
import TF.C16477t;
import TF.C16478u;
import TF.C16479v;
import XH.C16807N;
import XH.y;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.common.R;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.decorate.v1.internal.RotateControlView;
import com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter;
import com.sugarcube.decorate.v1.internal.v1.adapters.PlacedItemsAdapter;
import com.sugarcube.decorate.v1.internal.v1.toolbar.u;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fI.C17221b;
import j.C5443a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 ²\u00012\u00020\u0001:\u0006³\u0001´\u0001µ\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J)\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\t2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\u000bH\u0014¢\u0006\u0004\b$\u0010\u0013J\u0015\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\t¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u000b¢\u0006\u0004\b.\u0010\u0013J\u0015\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\t¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u000b¢\u0006\u0004\b2\u0010\u0013J\u0015\u00103\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\t¢\u0006\u0004\b3\u00101J\u0015\u00104\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b4\u00101J\r\u00105\u001a\u00020\u000b¢\u0006\u0004\b5\u0010\u0013J\u001d\u00109\u001a\u00020\u000b2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\t¢\u0006\u0004\b9\u0010:J%\u0010@\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\t2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020<¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\t¢\u0006\u0004\bE\u00101J\u0017\u0010H\u001a\u00020\u000b2\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\t¢\u0006\u0004\bJ\u00101J\u0017\u0010M\u001a\u00020\u000b2\b\u0010L\u001a\u0004\u0018\u00010K¢\u0006\u0004\bM\u0010NJ/\u0010Q\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\t2\u0006\u0010P\u001a\u00020\t2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001e¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\bS\u00101J\u0015\u0010T\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\t¢\u0006\u0004\bT\u00101J\r\u0010U\u001a\u00020\u000b¢\u0006\u0004\bU\u0010\u0013J\r\u0010V\u001a\u00020\u000b¢\u0006\u0004\bV\u0010\u0013J\r\u0010W\u001a\u00020\u000b¢\u0006\u0004\bW\u0010\u0013R\"\u0010_\u001a\u00020X8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010?\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010p\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bq\u0010oR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bw\u0010uR\u0018\u0010z\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\by\u0010uR\u0018\u0010|\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b{\u0010uR\u0018\u0010~\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b}\u0010uR\u0019\u0010\u0001\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010uR\u001a\u0010\u0001\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010oR\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\b\u0001\u0010\u0001R!\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010oR\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010oR\u001b\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u0001R\u001b\u0010 \u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010\u0001R\u0019\u0010¡\u0001\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010oR\u001b\u0010¢\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u0001R\u0019\u0010¥\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R(\u0010§\u0001\u001a\u00020\t2\u0007\u0010¦\u0001\u001a\u00020\t8\u0006@BX\u000e¢\u0006\u000e\n\u0005\b9\u0010¤\u0001\u001a\u0005\b§\u0001\u0010-R\u0019\u0010¨\u0001\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010oR\u001c\u0010ª\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b©\u0001\u0010\u0001R\u001a\u0010¬\u0001\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b«\u0001\u0010uR\u001a\u0010®\u0001\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b­\u0001\u0010uR\u0018\u0010¯\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010¤\u0001R\u0019\u0010±\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b°\u0001\u0010¤\u0001¨\u0006¶\u0001"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/toolbar/DraggableToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "container", "", "animate", "LXH/N;", "C0", "(Landroidx/constraintlayout/widget/ConstraintLayout;Z)V", "enteringContainer", "exitingContainer", "l0", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V", "X0", "()V", "A0", "B0", "w0", "x0", "y0", "z0", "J0", "T0", "R0", "show", "Lkotlin/Function0;", "doOnEnd", "n0", "(ZLnI/a;)V", "V0", "F0", "onDetachedFromWindow", "Lcom/sugarcube/decorate/v1/internal/v1/toolbar/DraggableToolbar$OnControlsClickedListener;", "interactionListener", "setListener", "(Lcom/sugarcube/decorate/v1/internal/v1/toolbar/DraggableToolbar$OnControlsClickedListener;)V", "Lcom/sugarcube/decorate/v1/internal/v1/toolbar/DraggableToolbar$c;", "getMode", "()Lcom/sugarcube/decorate/v1/internal/v1/toolbar/DraggableToolbar$c;", "q0", "()Z", "m1", "enable", "v0", "(Z)V", "o0", "r0", "l1", "i1", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "catalogItem", "showRotateButton", "E0", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Z)V", "visible", "", "startDegrees", "Lcom/sugarcube/decorate/v1/internal/RotateControlView$OnItemRotateListener;", "listener", "W0", "(ZFLcom/sugarcube/decorate/v1/internal/RotateControlView$OnItemRotateListener;)V", "degrees", "setRotationDegrees", "(F)V", "t0", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter;", "itemListAdapter", "setItemListAdapter", "(Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter;)V", "u0", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter;", "itemVariantAdapter", "setItemVariantListAdapter", "(Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter;)V", "shouldShow", "hasChanged", "j1", "(ZZLnI/a;)V", "e1", "s0", "f1", "h1", "g1", "LOE/q;", "B", "LOE/q;", "getSugarcube", "()LOE/q;", "setSugarcube", "(LOE/q;)V", "sugarcube", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "C", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "getConfigRepository", "()Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "setConfigRepository", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "configRepository", "LTF/p;", "D", "LTF/p;", "binding", "E", "Lcom/sugarcube/decorate/v1/internal/v1/toolbar/DraggableToolbar$OnControlsClickedListener;", "F", "Landroidx/constraintlayout/widget/ConstraintLayout;", "activeContainer", "G", "sceneControlsContainer", "Lcom/google/android/material/button/MaterialButton;", "H", "Lcom/google/android/material/button/MaterialButton;", "saveButton", "I", "multiviewButton", "J", "eraseButton", "K", "addButton", "L", "buyButton", "M", "listButton", "N", "itemControlsRoot", "Lcom/google/android/material/imageview/ShapeableImageView;", "O", "Lcom/google/android/material/imageview/ShapeableImageView;", "itemPreview", "Landroid/widget/LinearLayout;", "P", "Landroid/widget/LinearLayout;", "buttonsContainer", "", "Lcom/sugarcube/decorate/v1/internal/v1/toolbar/u;", "Q", "Ljava/util/List;", "itemControlsButtonList", "Landroid/widget/PopupWindow;", "R", "Landroid/widget/PopupWindow;", "itemControlsOverflowToolbar", "S", "itemRotatorContainer", "T", "rotateDoneButton", "Lcom/sugarcube/decorate/v1/internal/RotateControlView;", "U", "Lcom/sugarcube/decorate/v1/internal/RotateControlView;", "rotateControls", "itemListContainer", "itemListDoneButton", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "itemList", "itemVariantListContainer", "itemVariantList", "D0", "Z", "isVariantListEnabled", "value", "isVariantListShowing", "eraseControlsContainer", "G0", "eraseDoneButton", "H0", "eraseShowButton", "I0", "eraseHideButton", "smartProductRecommendationsEnabled", "K0", "duplicateItemsEnabled", "L0", "c", "OnControlsClickedListener", "b", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DraggableToolbar extends Hilt_DraggableToolbar {

    /* renamed from: L0  reason: collision with root package name */
    public static final b f142170L0 = new b((DefaultConstructorMarker) null);

    /* renamed from: M0  reason: collision with root package name */
    public static final int f142171M0 = 8;

    /* renamed from: A0  reason: collision with root package name */
    private RecyclerView f142172A0;

    /* renamed from: B  reason: collision with root package name */
    public q f142173B;

    /* renamed from: B0  reason: collision with root package name */
    private ConstraintLayout f142174B0;

    /* renamed from: C  reason: collision with root package name */
    public ConfigRepository f142175C;

    /* renamed from: C0  reason: collision with root package name */
    private RecyclerView f142176C0;

    /* renamed from: D  reason: collision with root package name */
    private C16473p f142177D;

    /* renamed from: D0  reason: collision with root package name */
    private boolean f142178D0 = true;

    /* renamed from: E  reason: collision with root package name */
    private OnControlsClickedListener f142179E;

    /* renamed from: E0  reason: collision with root package name */
    private boolean f142180E0;

    /* renamed from: F  reason: collision with root package name */
    private ConstraintLayout f142181F;

    /* renamed from: F0  reason: collision with root package name */
    private ConstraintLayout f142182F0;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public ConstraintLayout f142183G;

    /* renamed from: G0  reason: collision with root package name */
    private ShapeableImageView f142184G0;

    /* renamed from: H  reason: collision with root package name */
    private MaterialButton f142185H;

    /* renamed from: H0  reason: collision with root package name */
    private MaterialButton f142186H0;

    /* renamed from: I  reason: collision with root package name */
    private MaterialButton f142187I;

    /* renamed from: I0  reason: collision with root package name */
    private MaterialButton f142188I0;

    /* renamed from: J  reason: collision with root package name */
    private MaterialButton f142189J;
    /* access modifiers changed from: private */

    /* renamed from: J0  reason: collision with root package name */
    public boolean f142190J0;

    /* renamed from: K  reason: collision with root package name */
    private MaterialButton f142191K;
    /* access modifiers changed from: private */

    /* renamed from: K0  reason: collision with root package name */
    public boolean f142192K0;

    /* renamed from: L  reason: collision with root package name */
    private MaterialButton f142193L;

    /* renamed from: M  reason: collision with root package name */
    private MaterialButton f142194M;

    /* renamed from: N  reason: collision with root package name */
    private ConstraintLayout f142195N;

    /* renamed from: O  reason: collision with root package name */
    private ShapeableImageView f142196O;

    /* renamed from: P  reason: collision with root package name */
    private LinearLayout f142197P;

    /* renamed from: Q  reason: collision with root package name */
    private List<u> f142198Q = new ArrayList();

    /* renamed from: R  reason: collision with root package name */
    private PopupWindow f142199R;

    /* renamed from: S  reason: collision with root package name */
    private ConstraintLayout f142200S;

    /* renamed from: T  reason: collision with root package name */
    private ShapeableImageView f142201T;

    /* renamed from: U  reason: collision with root package name */
    private RotateControlView f142202U;

    /* renamed from: y0  reason: collision with root package name */
    private ConstraintLayout f142203y0;

    /* renamed from: z0  reason: collision with root package name */
    private ShapeableImageView f142204z0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/toolbar/DraggableToolbar$OnControlsClickedListener;", "", "LXH/N;", "onSaveClicked", "()V", "onMultiviewClicked", "", "isActive", "onShowEraseControlsClicked", "(Z)V", "onShowCatalogClicked", "onShowBagClicked", "onShowItemListClicked", "onItemInfoClicked", "onItemRotateClicked", "onItemSwapClicked", "onItemDeleteClicked", "onProductRecommendationsButtonClicked", "onDuplicateItemButtonClicked", "onEraseShowAllClicked", "onEraseHideAllClicked", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnControlsClickedListener {
        void onDuplicateItemButtonClicked();

        void onEraseHideAllClicked();

        void onEraseShowAllClicked();

        void onItemDeleteClicked();

        void onItemInfoClicked();

        void onItemRotateClicked(boolean z10);

        void onItemSwapClicked();

        void onMultiviewClicked();

        void onProductRecommendationsButtonClicked();

        void onSaveClicked();

        void onShowBagClicked();

        void onShowCatalogClicked();

        void onShowEraseControlsClicked(boolean z10);

        void onShowItemListClicked(boolean z10);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar$1", f = "DraggableToolbar.kt", l = {195, 197}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f142205c;

        /* renamed from: d  reason: collision with root package name */
        Object f142206d;

        /* renamed from: e  reason: collision with root package name */
        int f142207e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ DraggableToolbar f142208f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DraggableToolbar draggableToolbar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f142208f = draggableToolbar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f142208f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            DraggableToolbar draggableToolbar;
            DraggableToolbar draggableToolbar2;
            Object f10 = C17187b.f();
            int i10 = this.f142207e;
            if (i10 == 0) {
                y.b(obj);
                draggableToolbar2 = this.f142208f;
                ConfigRepository configRepository = draggableToolbar2.getConfigRepository();
                FeatureFlags.EnableSmartProductRecommendations enableSmartProductRecommendations = FeatureFlags.EnableSmartProductRecommendations.INSTANCE;
                this.f142205c = draggableToolbar2;
                this.f142207e = 1;
                obj = configRepository.isEnabled(enableSmartProductRecommendations, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                draggableToolbar2 = (DraggableToolbar) this.f142205c;
                y.b(obj);
            } else if (i10 == 2) {
                draggableToolbar = (DraggableToolbar) this.f142205c;
                y.b(obj);
                draggableToolbar.f142192K0 = ((Boolean) obj).booleanValue();
                this.f142208f.X0();
                this.f142208f.J0();
                this.f142208f.T0();
                this.f142208f.R0();
                this.f142208f.V0();
                this.f142208f.F0();
                DraggableToolbar draggableToolbar3 = this.f142208f;
                draggableToolbar3.C0(draggableToolbar3.f142183G, false);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            draggableToolbar2.f142190J0 = ((Boolean) obj).booleanValue();
            DraggableToolbar draggableToolbar4 = this.f142208f;
            ConfigRepository configRepository2 = draggableToolbar4.getConfigRepository();
            FeatureFlags.EnableDuplicateItems enableDuplicateItems = FeatureFlags.EnableDuplicateItems.INSTANCE;
            this.f142205c = draggableToolbar4;
            this.f142206d = obj;
            this.f142207e = 2;
            obj = configRepository2.isEnabled(enableDuplicateItems, this);
            if (obj == f10) {
                return f10;
            }
            draggableToolbar = draggableToolbar4;
            draggableToolbar.f142192K0 = ((Boolean) obj).booleanValue();
            this.f142208f.X0();
            this.f142208f.J0();
            this.f142208f.T0();
            this.f142208f.R0();
            this.f142208f.V0();
            this.f142208f.F0();
            DraggableToolbar draggableToolbar32 = this.f142208f;
            draggableToolbar32.C0(draggableToolbar32.f142183G, false);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/toolbar/DraggableToolbar$b;", "", "<init>", "()V", "", "ANIMATION_DURATION_SAVE", "J", "ANIMATION_DURATION_VARIANT_TRANSLATION", "", "ANIMATION_OPACITY_VARIANT_INACTIVE", "F", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/toolbar/DraggableToolbar$c;", "", "<init>", "(Ljava/lang/String;I)V", "ITEM", "SCENE", "LIST", "MAGIC_ERASE", "ROTATE", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        ITEM,
        SCENE,
        LIST,
        MAGIC_ERASE,
        ROTATE;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f142209a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f142210b;

        public d(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
            this.f142209a = constraintLayout;
            this.f142210b = constraintLayout2;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f142209a.setVisibility(0);
            this.f142210b.setVisibility(8);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f142211a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f142212b;

        public e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
            this.f142211a = constraintLayout;
            this.f142212b = constraintLayout2;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f142211a.setVisibility(0);
            this.f142212b.setVisibility(0);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a f142213a;

        public f(C17631a aVar) {
            this.f142213a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C17631a aVar = this.f142213a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/sugarcube/decorate/v1/internal/v1/toolbar/DraggableToolbar$g", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "LXH/N;", "onAnimationStart", "(Landroid/animation/Animator;)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DraggableToolbar f142214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f142215b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MaterialButton f142216c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f142217d;

        g(DraggableToolbar draggableToolbar, int i10, MaterialButton materialButton, int i11) {
            this.f142214a = draggableToolbar;
            this.f142215b = i10;
            this.f142216c = materialButton;
            this.f142217d = i11;
        }

        public void onAnimationStart(Animator animator) {
            C17542s.j(animator, "animation");
            super.onAnimationStart(animator);
            Drawable b10 = C5443a.b(this.f142214a.getContext(), this.f142215b);
            MaterialButton materialButton = this.f142216c;
            int i10 = this.f142217d;
            materialButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, b10, (Drawable) null, (Drawable) null);
            materialButton.setText(materialButton.getContext().getText(i10));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C17542s.j(context, "context");
        C17542s.j(attributeSet, "attrs");
        this.f142177D = C16473p.c(LayoutInflater.from(context), this, true);
        F0 unused = C16314k.d(S.a(C16311i0.b()), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    private final void A0() {
        PopupWindow popupWindow = this.f142199R;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        D0(this, this.f142200S, false, 2, (Object) null);
        OnControlsClickedListener onControlsClickedListener = this.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onItemRotateClicked(true);
        }
    }

    private final void B0() {
        PopupWindow popupWindow = this.f142199R;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        OnControlsClickedListener onControlsClickedListener = this.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onItemSwapClicked();
        }
    }

    /* access modifiers changed from: private */
    public final void C0(ConstraintLayout constraintLayout, boolean z10) {
        if (z10) {
            l0(constraintLayout, this.f142181F);
        } else {
            ConstraintLayout constraintLayout2 = this.f142181F;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        }
        this.f142181F = constraintLayout;
    }

    static /* synthetic */ void D0(DraggableToolbar draggableToolbar, ConstraintLayout constraintLayout, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        draggableToolbar.C0(constraintLayout, z10);
    }

    /* access modifiers changed from: private */
    public final void F0() {
        C16475r rVar;
        C16473p pVar = this.f142177D;
        if (pVar != null && (rVar = pVar.f138451c) != null) {
            this.f142182F0 = rVar.getRoot();
            ShapeableImageView shapeableImageView = rVar.f138465b;
            shapeableImageView.setOnClickListener(new r(this));
            this.f142184G0 = shapeableImageView;
            MaterialButton materialButton = rVar.f138467d;
            materialButton.setOnClickListener(new s(this));
            this.f142186H0 = materialButton;
            MaterialButton materialButton2 = rVar.f138466c;
            materialButton2.setOnClickListener(new t(this));
            this.f142188I0 = materialButton2;
        }
    }

    /* access modifiers changed from: private */
    public static final void G0(DraggableToolbar draggableToolbar, View view) {
        D0(draggableToolbar, draggableToolbar.f142183G, false, 2, (Object) null);
        OnControlsClickedListener onControlsClickedListener = draggableToolbar.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onShowEraseControlsClicked(false);
        }
    }

    /* access modifiers changed from: private */
    public static final void H0(DraggableToolbar draggableToolbar, View view) {
        OnControlsClickedListener onControlsClickedListener = draggableToolbar.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onEraseShowAllClicked();
        }
        draggableToolbar.g1();
    }

    /* access modifiers changed from: private */
    public static final void I0(DraggableToolbar draggableToolbar, View view) {
        OnControlsClickedListener onControlsClickedListener = draggableToolbar.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onEraseHideAllClicked();
        }
        draggableToolbar.h1();
    }

    /* access modifiers changed from: private */
    public final void J0() {
        C16476s sVar;
        this.f142198Q.clear();
        int b10 = u.b.ROTATE.b();
        String string = getResources().getString(n.f113257P);
        C17542s.i(string, "getString(...)");
        u uVar = new u(b10, string, R.drawable.sc_ic_rotate, false, false, (u.a) null, new a(this), 56, (DefaultConstructorMarker) null);
        int b11 = u.b.SWAP.b();
        String string2 = getResources().getString(n.f113338c0);
        C17542s.i(string2, "getString(...)");
        u uVar2 = new u(b11, string2, R.drawable.sc_ic_swap, false, false, (u.a) null, new l(this), 56, (DefaultConstructorMarker) null);
        int b12 = u.b.DELETE.b();
        String string3 = getResources().getString(n.f113251O);
        C17542s.i(string3, "getString(...)");
        u uVar3 = new u(b12, string3, R.drawable.sc_ic_trash_can, false, false, (u.a) null, new m(this), 56, (DefaultConstructorMarker) null);
        int b13 = u.b.DUPLICATE.b();
        String string4 = getResources().getString(n.f113414n);
        C17542s.i(string4, "getString(...)");
        u uVar4 = new u(b13, string4, R.drawable.sc_ic_copy, false, !this.f142192K0, (u.a) null, new n(this), 40, (DefaultConstructorMarker) null);
        int b14 = u.b.GOES_WITH.b();
        String string5 = getResources().getString(n.f113239M);
        C17542s.i(string5, "getString(...)");
        u uVar5 = new u(b14, string5, C13316h.f112855f, false, false, (u.a) null, new o(this), 56, (DefaultConstructorMarker) null);
        int b15 = u.b.SHOW_MORE.b();
        String string6 = getResources().getString(n.f113369g3);
        C17542s.i(string6, "getString(...)");
        u uVar6 = new u(b15, string6, R.drawable.sc_ic_more_small, false, true, (u.a) null, new p(this), 40, (DefaultConstructorMarker) null);
        this.f142198Q.add(uVar);
        this.f142198Q.add(uVar2);
        this.f142198Q.add(uVar3);
        this.f142198Q.add(uVar4);
        this.f142198Q.add(uVar5);
        this.f142198Q.add(uVar6);
        C16473p pVar = this.f142177D;
        if (pVar != null && (sVar = pVar.f138452d) != null) {
            this.f142195N = sVar.getRoot();
            this.f142197P = sVar.f138469b;
            ShapeableImageView shapeableImageView = sVar.f138470c;
            shapeableImageView.setOnClickListener(new q(this));
            this.f142196O = shapeableImageView;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N K0(DraggableToolbar draggableToolbar) {
        draggableToolbar.A0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(DraggableToolbar draggableToolbar) {
        draggableToolbar.B0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M0(DraggableToolbar draggableToolbar) {
        draggableToolbar.w0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N0(DraggableToolbar draggableToolbar) {
        draggableToolbar.x0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(DraggableToolbar draggableToolbar) {
        draggableToolbar.y0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(DraggableToolbar draggableToolbar) {
        draggableToolbar.z0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void Q0(DraggableToolbar draggableToolbar, View view) {
        OnControlsClickedListener onControlsClickedListener = draggableToolbar.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onItemInfoClicked();
        }
    }

    /* access modifiers changed from: private */
    public final void R0() {
        C16477t tVar;
        C16473p pVar = this.f142177D;
        if (pVar != null && (tVar = pVar.f138453e) != null) {
            this.f142203y0 = tVar.getRoot();
            ShapeableImageView shapeableImageView = tVar.f138473b;
            shapeableImageView.setOnClickListener(new h(this));
            this.f142204z0 = shapeableImageView;
            this.f142172A0 = tVar.f138474c;
        }
    }

    /* access modifiers changed from: private */
    public static final void S0(DraggableToolbar draggableToolbar, View view) {
        OnControlsClickedListener onControlsClickedListener = draggableToolbar.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onShowItemListClicked(false);
        }
    }

    /* access modifiers changed from: private */
    public final void T0() {
        C16478u uVar;
        C16473p pVar = this.f142177D;
        if (pVar != null && (uVar = pVar.f138454f) != null) {
            this.f142200S = uVar.getRoot();
            ShapeableImageView shapeableImageView = uVar.f138477c;
            shapeableImageView.setOnClickListener(new i(this));
            this.f142201T = shapeableImageView;
            this.f142202U = uVar.f138476b;
        }
    }

    /* access modifiers changed from: private */
    public static final void U0(DraggableToolbar draggableToolbar, View view) {
        D0(draggableToolbar, draggableToolbar.f142195N, false, 2, (Object) null);
        OnControlsClickedListener onControlsClickedListener = draggableToolbar.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onItemRotateClicked(false);
        }
    }

    /* access modifiers changed from: private */
    public final void V0() {
        C16479v vVar;
        C16473p pVar = this.f142177D;
        if (pVar != null && (vVar = pVar.f138455g) != null) {
            this.f142174B0 = vVar.getRoot();
            this.f142176C0 = vVar.f138479b;
        }
    }

    /* access modifiers changed from: private */
    public final void X0() {
        C16474q qVar;
        C16473p pVar = this.f142177D;
        if (pVar != null && (qVar = pVar.f138456h) != null) {
            this.f142183G = qVar.getRoot();
            MaterialButton materialButton = qVar.f138463g;
            materialButton.setOnClickListener(new b(this));
            this.f142185H = materialButton;
            MaterialButton materialButton2 = qVar.f138462f;
            materialButton2.setOnClickListener(new c(this));
            this.f142187I = materialButton2;
            MaterialButton materialButton3 = qVar.f138460d;
            materialButton3.setOnClickListener(new d(this));
            this.f142189J = materialButton3;
            MaterialButton materialButton4 = qVar.f138458b;
            materialButton4.setOnClickListener(new e(this));
            this.f142191K = materialButton4;
            MaterialButton materialButton5 = qVar.f138459c;
            materialButton5.setOnClickListener(new f(this));
            this.f142193L = materialButton5;
            MaterialButton materialButton6 = qVar.f138461e;
            materialButton6.setOnClickListener(new g(this));
            this.f142194M = materialButton6;
        }
    }

    /* access modifiers changed from: private */
    public static final void Y0(DraggableToolbar draggableToolbar, View view) {
        OnControlsClickedListener onControlsClickedListener = draggableToolbar.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onSaveClicked();
        }
    }

    /* access modifiers changed from: private */
    public static final void Z0(DraggableToolbar draggableToolbar, View view) {
        OnControlsClickedListener onControlsClickedListener = draggableToolbar.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onMultiviewClicked();
        }
    }

    /* access modifiers changed from: private */
    public static final void a1(DraggableToolbar draggableToolbar, View view) {
        D0(draggableToolbar, draggableToolbar.f142182F0, false, 2, (Object) null);
        OnControlsClickedListener onControlsClickedListener = draggableToolbar.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onShowEraseControlsClicked(true);
        }
    }

    /* access modifiers changed from: private */
    public static final void b1(DraggableToolbar draggableToolbar, View view) {
        OnControlsClickedListener onControlsClickedListener = draggableToolbar.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onShowCatalogClicked();
        }
    }

    /* access modifiers changed from: private */
    public static final void c1(DraggableToolbar draggableToolbar, View view) {
        OnControlsClickedListener onControlsClickedListener = draggableToolbar.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onShowBagClicked();
        }
    }

    /* access modifiers changed from: private */
    public static final void d1(DraggableToolbar draggableToolbar, View view) {
        D0(draggableToolbar, draggableToolbar.f142203y0, false, 2, (Object) null);
        OnControlsClickedListener onControlsClickedListener = draggableToolbar.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onShowItemListClicked(true);
        }
    }

    public static /* synthetic */ void k1(DraggableToolbar draggableToolbar, boolean z10, boolean z11, C17631a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        draggableToolbar.j1(z10, z11, aVar);
    }

    private final void l0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        if (!C17542s.e(constraintLayout, constraintLayout2)) {
            C13291e.c(constraintLayout, constraintLayout2, new k());
        }
    }

    /* access modifiers changed from: private */
    public static final AnimatorSet m0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        C17542s.j(constraintLayout, "enter");
        C17542s.j(constraintLayout2, "exit");
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = ViewGroup.ALPHA;
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(constraintLayout, property, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(constraintLayout2, property, new float[]{1.0f, 0.0f})});
        animatorSet.addListener(new e(constraintLayout2, constraintLayout));
        animatorSet.addListener(new d(constraintLayout, constraintLayout2));
        animatorSet.setDuration(200);
        animatorSet.start();
        return animatorSet;
    }

    private final void n0(boolean z10, C17631a<C16807N> aVar) {
        ConstraintLayout constraintLayout = this.f142174B0;
        if (constraintLayout != null) {
            this.f142180E0 = z10;
            if (z10) {
                this.f142178D0 = true;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = (float) constraintLayout.getMeasuredWidth();
            float f10 = 0.0f;
            float f11 = z10 ? 0.0f : -measuredWidth;
            if (z10) {
                f10 = -measuredWidth;
            }
            float f12 = 1.0f;
            float f13 = z10 ? 0.25f : 1.0f;
            if (!z10) {
                f12 = 0.25f;
            }
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(constraintLayout, ViewGroup.TRANSLATION_X, new float[]{f11, f10}), ObjectAnimator.ofFloat(constraintLayout, ViewGroup.ALPHA, new float[]{f13, f12})});
            animatorSet.addListener(new f(aVar));
            animatorSet.setDuration(200);
            animatorSet.start();
        }
    }

    /* access modifiers changed from: private */
    public static final ObjectAnimator p0(MaterialButton materialButton, long j10, DraggableToolbar draggableToolbar, int i10, int i11) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(materialButton, ViewGroup.ALPHA, new float[]{0.5f, 1.0f});
        ofFloat.setDuration(j10);
        ofFloat.addListener(new g(draggableToolbar, i10, materialButton, i11));
        return ofFloat;
    }

    private final void w0() {
        PopupWindow popupWindow = this.f142199R;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        D0(this, this.f142183G, false, 2, (Object) null);
        OnControlsClickedListener onControlsClickedListener = this.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onItemDeleteClicked();
        }
    }

    private final void x0() {
        PopupWindow popupWindow = this.f142199R;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        OnControlsClickedListener onControlsClickedListener = this.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onDuplicateItemButtonClicked();
        }
    }

    private final void y0() {
        PopupWindow popupWindow = this.f142199R;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        OnControlsClickedListener onControlsClickedListener = this.f142179E;
        if (onControlsClickedListener != null) {
            onControlsClickedListener.onProductRecommendationsButtonClicked();
        }
    }

    private final void z0() {
        ConstraintLayout constraintLayout;
        MaterialButton materialButton;
        ArrayList arrayList = new ArrayList();
        for (Object next : this.f142198Q) {
            if (((u) next).d() == u.a.FLOATING_BAR) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty() && (constraintLayout = this.f142181F) != null && (materialButton = (MaterialButton) findViewWithTag(Integer.valueOf(u.b.SHOW_MORE.b()))) != null) {
            Context context = constraintLayout.getContext();
            C17542s.i(context, "getContext(...)");
            this.f142199R = z.c(context, arrayList, materialButton);
        }
    }

    public final void E0(CachedCatalogItem cachedCatalogItem, boolean z10) {
        CatalogItem catalogItem;
        Uri thumbUrl;
        C17542s.j(cachedCatalogItem, "catalogItem");
        i1();
        ShapeableImageView shapeableImageView = this.f142196O;
        LinearLayout linearLayout = null;
        if (shapeableImageView != null) {
            shapeableImageView.setImageDrawable((Drawable) null);
        }
        CachedCatalogItem cachedCatalogItem2 = cachedCatalogItem.isValid() ? cachedCatalogItem : null;
        if (!(cachedCatalogItem2 == null || (catalogItem = cachedCatalogItem2.getCatalogItem()) == null || (thumbUrl = catalogItem.getThumbUrl()) == null)) {
            getSugarcube().c().l(C13111s.b(thumbUrl, (String) null, 1, (Object) null)).h().d(this.f142196O);
        }
        z.j(this.f142198Q, u.b.GOES_WITH.b(), !(this.f142190J0 && C17542s.e(cachedCatalogItem.getHasGoesWell(), Boolean.TRUE)));
        z.j(this.f142198Q, u.b.ROTATE.b(), !z10);
        LinearLayout linearLayout2 = this.f142197P;
        if (linearLayout2 == null) {
            C17542s.z("buttonsContainer");
        } else {
            linearLayout = linearLayout2;
        }
        z.e(linearLayout, this.f142198Q);
    }

    public final void W0(boolean z10, float f10, RotateControlView.OnItemRotateListener onItemRotateListener) {
        C17542s.j(onItemRotateListener, "listener");
        RotateControlView rotateControlView = this.f142202U;
        if (rotateControlView != null) {
            rotateControlView.c(z10, f10);
            rotateControlView.setListener(onItemRotateListener);
        }
    }

    public final void e1(boolean z10) {
        MaterialButton materialButton = this.f142189J;
        if (materialButton != null) {
            materialButton.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void f1() {
        MaterialButton materialButton = this.f142186H0;
        if (materialButton != null) {
            materialButton.setEnabled(true);
        }
        MaterialButton materialButton2 = this.f142188I0;
        if (materialButton2 != null) {
            materialButton2.setEnabled(true);
        }
    }

    public final void g1() {
        MaterialButton materialButton = this.f142186H0;
        if (materialButton != null) {
            materialButton.setEnabled(false);
        }
        MaterialButton materialButton2 = this.f142188I0;
        if (materialButton2 != null) {
            materialButton2.setEnabled(true);
        }
    }

    public final ConfigRepository getConfigRepository() {
        ConfigRepository configRepository = this.f142175C;
        if (configRepository != null) {
            return configRepository;
        }
        C17542s.z("configRepository");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r0 = r2.f142200S;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar.c getMode() {
        /*
            r2 = this;
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.f142181F
            androidx.constraintlayout.widget.ConstraintLayout r1 = r2.f142195N
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x0017
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.f142195N
            if (r0 == 0) goto L_0x0017
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0017
            com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar$c r0 = com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar.c.ITEM
            goto L_0x005e
        L_0x0017:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.f142181F
            androidx.constraintlayout.widget.ConstraintLayout r1 = r2.f142203y0
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x002e
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.f142203y0
            if (r0 == 0) goto L_0x002e
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x002e
            com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar$c r0 = com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar.c.LIST
            goto L_0x005e
        L_0x002e:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.f142181F
            androidx.constraintlayout.widget.ConstraintLayout r1 = r2.f142182F0
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x0045
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.f142182F0
            if (r0 == 0) goto L_0x0045
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0045
            com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar$c r0 = com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar.c.MAGIC_ERASE
            goto L_0x005e
        L_0x0045:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.f142181F
            androidx.constraintlayout.widget.ConstraintLayout r1 = r2.f142200S
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x005c
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.f142200S
            if (r0 == 0) goto L_0x005c
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x005c
            com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar$c r0 = com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar.c.ROTATE
            goto L_0x005e
        L_0x005c:
            com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar$c r0 = com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar.c.SCENE
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar.getMode():com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar$c");
    }

    public final q getSugarcube() {
        q qVar = this.f142173B;
        if (qVar != null) {
            return qVar;
        }
        C17542s.z("sugarcube");
        return null;
    }

    public final void h1() {
        MaterialButton materialButton = this.f142186H0;
        if (materialButton != null) {
            materialButton.setEnabled(true);
        }
        MaterialButton materialButton2 = this.f142188I0;
        if (materialButton2 != null) {
            materialButton2.setEnabled(false);
        }
    }

    public final void i1() {
        D0(this, this.f142195N, false, 2, (Object) null);
    }

    public final void j1(boolean z10, boolean z11, C17631a<C16807N> aVar) {
        if (this.f142180E0 != z10 && z11) {
            n0(z10, aVar);
        }
    }

    public final void l1(boolean z10) {
        MaterialButton materialButton = this.f142187I;
        if (materialButton != null) {
            materialButton.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void m1() {
        D0(this, this.f142183G, false, 2, (Object) null);
    }

    public final void o0() {
        MaterialButton materialButton = this.f142185H;
        if (materialButton != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(materialButton, ViewGroup.ALPHA, new float[]{1.0f, 0.5f});
            ofFloat.setDuration(100);
            j jVar = new j(materialButton, 100, this);
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator clone = ofFloat.clone();
            clone.setStartDelay(400);
            C16807N n10 = C16807N.f139792a;
            animatorSet.playSequentially(new Animator[]{ofFloat, (ObjectAnimator) jVar.invoke(Integer.valueOf(R.drawable.sc_ic_saved), Integer.valueOf(n.f113269R)), clone, (ObjectAnimator) jVar.invoke(Integer.valueOf(R.drawable.sc_ic_save), Integer.valueOf(n.f113263Q))});
            animatorSet.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f142177D = null;
    }

    public final boolean q0() {
        return (getMode() == c.LIST || getMode() == c.MAGIC_ERASE) ? false : true;
    }

    public final void r0(boolean z10) {
        MaterialButton materialButton = this.f142193L;
        if (materialButton != null) {
            materialButton.setEnabled(z10);
        }
    }

    public final void s0(boolean z10) {
        MaterialButton materialButton = this.f142189J;
        if (materialButton != null) {
            materialButton.setEnabled(z10);
        }
    }

    public final void setConfigRepository(ConfigRepository configRepository) {
        C17542s.j(configRepository, "<set-?>");
        this.f142175C = configRepository;
    }

    public final void setItemListAdapter(PlacedItemsAdapter placedItemsAdapter) {
        RecyclerView recyclerView = this.f142172A0;
        if (recyclerView != null) {
            recyclerView.setAdapter(placedItemsAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            RecyclerView.n itemAnimator = recyclerView.getItemAnimator();
            x xVar = itemAnimator instanceof x ? (x) itemAnimator : null;
            if (xVar != null) {
                xVar.setSupportsChangeAnimations(false);
            }
        }
    }

    public final void setItemVariantListAdapter(ItemVariantAdapter itemVariantAdapter) {
        RecyclerView recyclerView = this.f142176C0;
        if (recyclerView != null) {
            recyclerView.setAdapter(itemVariantAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            RecyclerView.n itemAnimator = recyclerView.getItemAnimator();
            x xVar = itemAnimator instanceof x ? (x) itemAnimator : null;
            if (xVar != null) {
                xVar.setSupportsChangeAnimations(false);
            }
        }
    }

    public final void setListener(OnControlsClickedListener onControlsClickedListener) {
        C17542s.j(onControlsClickedListener, "interactionListener");
        this.f142179E = onControlsClickedListener;
    }

    public final void setRotationDegrees(float f10) {
        RotateControlView rotateControlView = this.f142202U;
        if (rotateControlView != null) {
            if (!rotateControlView.getIsVisible()) {
                rotateControlView = null;
            }
            if (rotateControlView != null) {
                rotateControlView.setDegrees(f10);
            }
        }
    }

    public final void setSugarcube(q qVar) {
        C17542s.j(qVar, "<set-?>");
        this.f142173B = qVar;
    }

    public final void t0(boolean z10) {
        MaterialButton materialButton = this.f142194M;
        if (materialButton != null) {
            materialButton.setEnabled(z10);
        }
    }

    public final void u0(boolean z10) {
        if (this.f142180E0 && this.f142178D0 != z10) {
            ConstraintLayout constraintLayout = this.f142174B0;
            if (constraintLayout != null) {
                float f10 = 1.0f;
                float f11 = z10 ? 0.25f : 1.0f;
                if (!z10) {
                    f10 = 0.25f;
                }
                ObjectAnimator.ofFloat(constraintLayout, ViewGroup.ALPHA, new float[]{f11, f10}).setDuration(100).start();
            }
            this.f142178D0 = z10;
        }
    }

    public final void v0(boolean z10) {
        MaterialButton materialButton = this.f142185H;
        if (materialButton != null) {
            materialButton.setEnabled(z10);
        }
    }
}
