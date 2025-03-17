package com.sugarcube.decorate.v1.internal.v1;

import HJ.C15854t;
import JF.C13084F;
import JF.C13115w;
import JF.T;
import JF.Z;
import Ma.C9140b;
import NF.C13291e;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import RF.i;
import SF.C16401b;
import TF.C16481x;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import VE.C13760b;
import XH.C16796C;
import XH.C16807N;
import XH.C16820k;
import XH.C16824o;
import XH.C16825p;
import XH.x;
import YH.C16877v;
import YH.X;
import ZF.C16894A;
import ZF.C16895A0;
import ZF.C16896B;
import ZF.C16898C;
import ZF.C16900D;
import ZF.C16902E;
import ZF.C16903E0;
import ZF.C16904F;
import ZF.C16906G;
import ZF.C16908H;
import ZF.C16912J;
import ZF.C16913J0;
import ZF.C16914K;
import ZF.C16916L;
import ZF.C16918M;
import ZF.C16920N;
import ZF.C16922O;
import ZF.C16924P;
import ZF.C16926Q;
import ZF.C16929S;
import ZF.C16930S0;
import ZF.C16931T;
import ZF.C16932T0;
import ZF.C16936V0;
import ZF.C16937W;
import ZF.C16939X;
import ZF.C16940Y;
import ZF.C16941Z;
import ZF.C16942a;
import ZF.C16943a0;
import ZF.C16944b;
import ZF.C16945b0;
import ZF.C16946c;
import ZF.C16947c0;
import ZF.C16948d;
import ZF.C16949d0;
import ZF.C16950e;
import ZF.C16951e0;
import ZF.C16952f;
import ZF.C16954g;
import ZF.C16955g0;
import ZF.C16956h;
import ZF.C16957h0;
import ZF.C16958i;
import ZF.C16959i0;
import ZF.C16960j;
import ZF.C16961j0;
import ZF.C16962k;
import ZF.C16963k0;
import ZF.C16964l;
import ZF.C16965l0;
import ZF.C16966m;
import ZF.C16967m0;
import ZF.C16968n;
import ZF.C16969n0;
import ZF.C16970o;
import ZF.C16971o0;
import ZF.C16972p;
import ZF.C16973p0;
import ZF.C16974q;
import ZF.C16976r;
import ZF.C16977r0;
import ZF.C16978s;
import ZF.C16979s0;
import ZF.C16980t;
import ZF.C16981t0;
import ZF.C16982u;
import ZF.C16983u0;
import ZF.C16984v;
import ZF.C16985v0;
import ZF.C16986w;
import ZF.C16987w0;
import ZF.C16988x;
import ZF.C16989x0;
import ZF.C16990y;
import ZF.C16992z;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5215s;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.e0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import androidx.navigation.fragment.a;
import androidx.recyclerview.widget.RecyclerView;
import cF.C14046h;
import cG.C17060c;
import cG.C17061d;
import com.google.android.material.button.MaterialButton;
import com.sugarcube.app.base.data.analytics.CatalogItemSource;
import com.sugarcube.app.base.data.analytics.MethodType;
import com.sugarcube.app.base.data.analytics.ProductParentType;
import com.sugarcube.app.base.data.analytics.RoomSource;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.CachedCompiledComposition;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.model.DecorateViewMode;
import com.sugarcube.app.base.data.model.PendingComposition;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.dialog.ExitDialog;
import com.sugarcube.app.base.ui.dialog.a;
import com.sugarcube.app.base.ui.feedback.FeedbackDialog;
import com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar;
import com.sugarcube.app.base.ui.gallery.h;
import com.sugarcube.app.base.ui.utils.BouncingBallView;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import com.sugarcube.common.R;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.AuthType;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.Manifest;
import com.sugarcube.core.network.models.MultiviewThumbnail;
import com.sugarcube.core.network.models.SmartaPlacement;
import com.sugarcube.core.network.models.SmartaPlacementResult;
import com.sugarcube.decorate.DesignItemInfo;
import com.sugarcube.decorate.TemporaryDesignStateListener;
import com.sugarcube.decorate.internal.navigation.V1;
import com.sugarcube.decorate.internal.shared.DecorateView;
import com.sugarcube.decorate.internal.shared.IDecorateEngine;
import com.sugarcube.decorate.v1.internal.catalog.Z;
import com.sugarcube.decorate.v1.internal.catalog.d0;
import com.sugarcube.decorate.v1.internal.v1.a;
import com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter;
import com.sugarcube.decorate.v1.internal.v1.adapters.MultiviewAdapter;
import com.sugarcube.decorate.v1.internal.v1.adapters.PlacedItemsAdapter;
import com.sugarcube.decorate.v1.internal.v1.b;
import com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar;
import com.sugarcube.decorate.v1.internal.v1.tooltip.DecorateToolbarTooltipObject;
import com.sugarcube.decorate_engine.DecorateEngine;
import com.sugarcube.decorate_engine.DecorateEngineManifest;
import com.sugarcube.decorate_engine.EraserCounts;
import com.sugarcube.decorate_engine.FlyCamOrbitParams;
import com.sugarcube.decorate_engine.LayoutThumbnailSpec;
import com.sugarcube.decorate_engine.Metric;
import com.sugarcube.decorate_engine.ModelInstanceDetails;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import com.sugarcube.decorate_engine.PanZoomRegion;
import com.sugarcube.decorate_engine.RoomPolygonType;
import com.sugarcube.decorate_engine.SceneLayout;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;
import tF.C15093r;
import x4.C;
import x4.C8945i;
import x4.C8948l;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000ø\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 þ\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004ÿ\u0002\u0003B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0007J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0007J\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010\u0007Jk\u0010/\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010&\u001a\u00020%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010+\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010.\u001a\u00020%H\u0002¢\u0006\u0004\b/\u00100Jk\u00101\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010&\u001a\u00020%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010+\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010.\u001a\u00020%H\u0002¢\u0006\u0004\b1\u00100J\u0019\u00104\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105Ji\u00107\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u00106\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010+\u001a\u00020%2\u0006\u0010.\u001a\u00020%H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010\u0007J\u000f\u0010:\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010\u0007J\u0017\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>JG\u0010F\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010?\u001a\u00020#2\u0006\u0010A\u001a\u00020@2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010C\u001a\u00020%2\b\u0010E\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bF\u0010GJ\u0019\u0010I\u001a\u00020\b2\b\b\u0002\u0010H\u001a\u00020%H\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u00132\u0006\u0010L\u001a\u00020%H\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u0013H\u0002¢\u0006\u0004\bO\u0010\u0016J\u0017\u0010P\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u0013H\u0002¢\u0006\u0004\bP\u0010\u0016J\u001f\u0010S\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u00132\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\b2\u0006\u0010U\u001a\u00020\u0013H\u0002¢\u0006\u0004\bV\u0010\u0016J\u0017\u0010W\u001a\u00020%2\u0006\u0010?\u001a\u00020#H\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\b2\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\bH\u0002¢\u0006\u0004\b]\u0010\u0007J\u000f\u0010^\u001a\u00020\bH\u0002¢\u0006\u0004\b^\u0010\u0007J\u0019\u0010_\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b_\u0010\u0016J\u000f\u0010`\u001a\u00020\bH\u0002¢\u0006\u0004\b`\u0010\u0007J\u000f\u0010a\u001a\u00020\bH\u0002¢\u0006\u0004\ba\u0010\u0007J\u000f\u0010b\u001a\u00020\bH\u0002¢\u0006\u0004\bb\u0010\u0007J\u000f\u0010c\u001a\u00020\bH\u0002¢\u0006\u0004\bc\u0010\u0007J\u000f\u0010d\u001a\u00020\bH\u0002¢\u0006\u0004\bd\u0010\u0007J\u0017\u0010f\u001a\u00020\b2\u0006\u0010e\u001a\u00020%H\u0002¢\u0006\u0004\bf\u0010JJ\u000f\u0010g\u001a\u00020\bH\u0002¢\u0006\u0004\bg\u0010\u0007J\u000f\u0010h\u001a\u00020\bH\u0002¢\u0006\u0004\bh\u0010\u0007J\u0017\u0010k\u001a\u00020\b2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ\u0019\u0010m\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\bm\u0010\u0016J\u0017\u0010o\u001a\u00020\b2\u0006\u0010n\u001a\u00020,H\u0002¢\u0006\u0004\bo\u0010pJ\u0019\u0010r\u001a\u00020\b2\b\b\u0002\u0010q\u001a\u00020%H\u0002¢\u0006\u0004\br\u0010JJ\u000f\u0010s\u001a\u00020\bH\u0002¢\u0006\u0004\bs\u0010\u0007J\u0019\u0010u\u001a\u00020\b2\b\b\u0002\u0010t\u001a\u00020%H\u0002¢\u0006\u0004\bu\u0010JJ\u0010\u0010v\u001a\u00020\bH@¢\u0006\u0004\bv\u0010wJ\u000f\u0010y\u001a\u00020xH\u0002¢\u0006\u0004\by\u0010zJ\u0017\u0010~\u001a\u00020}2\u0006\u0010|\u001a\u00020{H\u0002¢\u0006\u0004\b~\u0010J(\u0010\u0001\u001a\u0004\u0018\u00010\b2\b\u0010\u0001\u001a\u00030\u00012\b\b\u0002\u0010|\u001a\u00020{H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0014\u0010\u0001\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0001\u0010\u0007J\u0011\u0010\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0001\u0010\u0007J\u0011\u0010\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0001\u0010\u0007J\u0013\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0001\u0010\u0007JS\u0010\u0001\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010?\u001a\u00020#2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00132\b\u0010$\u001a\u0004\u0018\u00010\u00132\u0006\u0010L\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\b\u0010E\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0013\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0013\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0001\u0010\u0007J\u0011\u0010\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0001\u0010\u0007J\u0011\u0010\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0001\u0010\u0007J\u0011\u0010\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0001\u0010\u0007J\u0011\u0010\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0001\u0010\u0007J\u0011\u0010\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0001\u0010\u0007J\u0011\u0010\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0001\u0010\u0007J\u001e\u0010\u0001\u001a\u00020\b2\n\b\u0002\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010 \u0001J\u001e\u0010£\u0001\u001a\u00020\b2\n\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u0001H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001e\u0010§\u0001\u001a\u00020\b2\n\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J7\u0010®\u0001\u001a\u0005\u0018\u00010­\u00012\b\u0010ª\u0001\u001a\u00030©\u00012\n\u0010¬\u0001\u001a\u0005\u0018\u00010«\u00012\n\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0016¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001c\u0010±\u0001\u001a\u00020\b2\b\u0010°\u0001\u001a\u00030¥\u0001H\u0016¢\u0006\u0006\b±\u0001\u0010¨\u0001J\u001e\u0010²\u0001\u001a\u00020\b2\n\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0016¢\u0006\u0006\b²\u0001\u0010¨\u0001J(\u0010´\u0001\u001a\u00020\b2\b\u0010³\u0001\u001a\u00030­\u00012\n\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0016¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0011\u0010¶\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\b¶\u0001\u0010\u0007J\u0011\u0010·\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\b·\u0001\u0010\u0007J\u0011\u0010¸\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\b¸\u0001\u0010\u0007J\u001f\u0010¹\u0001\u001a\u00030©\u00012\n\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0016¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0011\u0010»\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\b»\u0001\u0010\u0007J\u0011\u0010¼\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\b¼\u0001\u0010\u0007J\u001a\u0010¾\u0001\u001a\u00020\b2\u0007\u0010½\u0001\u001a\u00020%H\u0016¢\u0006\u0005\b¾\u0001\u0010JJ\u0011\u0010¿\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\b¿\u0001\u0010\u0007J\u0011\u0010À\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\bÀ\u0001\u0010\u0007J\u001a\u0010Á\u0001\u001a\u00020\b2\u0007\u0010½\u0001\u001a\u00020%H\u0016¢\u0006\u0005\bÁ\u0001\u0010JJ\u0011\u0010Â\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\bÂ\u0001\u0010\u0007J\u001a\u0010Ã\u0001\u001a\u00020\b2\u0007\u0010½\u0001\u001a\u00020%H\u0016¢\u0006\u0005\bÃ\u0001\u0010JJ\u0011\u0010Ä\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\bÄ\u0001\u0010\u0007J\u0011\u0010Å\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\bÅ\u0001\u0010\u0007J\u0011\u0010Æ\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\bÆ\u0001\u0010\u0007J\u0011\u0010Ç\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\bÇ\u0001\u0010\u0007J\u0011\u0010È\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\bÈ\u0001\u0010\u0007J\u0011\u0010É\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\bÉ\u0001\u0010\u0007J$\u0010Ë\u0001\u001a\u00020\b2\t\u0010Ê\u0001\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010L\u001a\u00020%¢\u0006\u0005\bË\u0001\u0010NJ\"\u0010Í\u0001\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u00132\u0007\u0010Ì\u0001\u001a\u00020QH\u0000¢\u0006\u0005\bÍ\u0001\u0010TJ,\u0010Ð\u0001\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u00132\u0007\u0010Î\u0001\u001a\u00020Q2\u0007\u0010Ï\u0001\u001a\u00020QH\u0000¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\"\u0010Ò\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!2\u0006\u0010K\u001a\u00020\u0013H\u0000¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001JC\u0010Õ\u0001\u001a\u00020\u00132\u0006\u0010?\u001a\u00020#2\u0006\u0010A\u001a\u00020@2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010C\u001a\u00020%2\t\b\u0002\u0010Ô\u0001\u001a\u00020%H\u0000¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u001c\u0010×\u0001\u001a\u00020\b2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0016¢\u0006\u0006\b×\u0001\u0010¤\u0001J\u001c\u0010Ú\u0001\u001a\u00020\b2\b\u0010Ù\u0001\u001a\u00030Ø\u0001H\u0016¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J!\u0010Þ\u0001\u001a\u00020\b2\u000e\u0010Ý\u0001\u001a\t\u0012\u0005\u0012\u00030Ü\u00010\u001bH\u0016¢\u0006\u0005\bÞ\u0001\u0010\u001fJD\u0010æ\u0001\u001a\u00020\b2\b\u0010à\u0001\u001a\u00030ß\u00012\b\u0010â\u0001\u001a\u00030á\u00012\u0007\u0010ã\u0001\u001a\u00020%2\u0007\u0010ä\u0001\u001a\u00020%2\t\u0010å\u0001\u001a\u0004\u0018\u00010\u001cH\u0001¢\u0006\u0006\bæ\u0001\u0010ç\u0001R*\u0010ï\u0001\u001a\u00030è\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R*\u0010÷\u0001\u001a\u00030ð\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bñ\u0001\u0010ò\u0001\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R\u001c\u0010û\u0001\u001a\u0005\u0018\u00010ø\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R!\u0010\u0002\u001a\u00030ü\u00018BX\u0002¢\u0006\u0010\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0002R\u0018\u0010\u0002\u001a\u00030\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R!\u0010\u0002\u001a\u00030\u00018FX\u0002¢\u0006\u0010\n\u0006\b\u0002\u0010þ\u0001\u001a\u0006\b\u0002\u0010\u0001R!\u0010\u0002\u001a\u00030\u00028BX\u0002¢\u0006\u0010\n\u0006\b\u0002\u0010þ\u0001\u001a\u0006\b\u0002\u0010\u0002R\u001a\u0010\u0002\u001a\u00030\u00028\u0002@\u0002X.¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001a\u0010\u0002\u001a\u00030\u00028\u0002@\u0002X.¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001c\u0010¡\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010 \u0002R\u001c\u0010¥\u0002\u001a\u0005\u0018\u00010¢\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b£\u0002\u0010¤\u0002R\u0019\u0010¨\u0002\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R\u001c\u0010«\u0002\u001a\u0005\u0018\u00010©\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b§\u0002\u0010ª\u0002R\u001c\u0010¯\u0002\u001a\u0005\u0018\u00010¬\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b­\u0002\u0010®\u0002R\u001c\u0010³\u0002\u001a\u0005\u0018\u00010°\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b±\u0002\u0010²\u0002R\u001c\u0010µ\u0002\u001a\u0005\u0018\u00010¬\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b´\u0002\u0010®\u0002R\u001c\u0010¹\u0002\u001a\u0005\u0018\u00010¶\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b·\u0002\u0010¸\u0002R\u001c\u0010»\u0002\u001a\u0005\u0018\u00010¶\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bº\u0002\u0010¸\u0002R\u001c\u0010½\u0002\u001a\u0005\u0018\u00010¶\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¼\u0002\u0010¸\u0002R\u001c\u0010¿\u0002\u001a\u0005\u0018\u00010¶\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¾\u0002\u0010¸\u0002R\u001c\u0010Á\u0002\u001a\u0005\u0018\u00010¶\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÀ\u0002\u0010¸\u0002R\u001c\u0010Ã\u0002\u001a\u0005\u0018\u00010¶\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÂ\u0002\u0010¸\u0002R\u001c\u0010Ç\u0002\u001a\u0005\u0018\u00010Ä\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÅ\u0002\u0010Æ\u0002R\u0018\u0010Ë\u0002\u001a\u00030È\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÉ\u0002\u0010Ê\u0002R\u001c\u0010Ï\u0002\u001a\u0005\u0018\u00010Ì\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÍ\u0002\u0010Î\u0002R\u0019\u0010Ñ\u0002\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÐ\u0002\u0010§\u0002R\u0019\u0010Ó\u0002\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÒ\u0002\u0010§\u0002R\u0019\u0010Õ\u0002\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÔ\u0002\u0010§\u0002R\u001c\u0010Ù\u0002\u001a\u0005\u0018\u00010Ö\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b×\u0002\u0010Ø\u0002R\u001e\u0010Ý\u0002\u001a\t\u0012\u0004\u0012\u00020%0Ú\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÛ\u0002\u0010Ü\u0002R\u0019\u0010à\u0002\u001a\u00020'8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÞ\u0002\u0010ß\u0002R\u0018\u0010ä\u0002\u001a\u00030á\u00028BX\u0004¢\u0006\b\u001a\u0006\bâ\u0002\u0010ã\u0002R\u0017\u0010ç\u0002\u001a\u00020}8BX\u0004¢\u0006\b\u001a\u0006\bå\u0002\u0010æ\u0002R\u0018\u0010ë\u0002\u001a\u00030è\u00028BX\u0004¢\u0006\b\u001a\u0006\bé\u0002\u0010ê\u0002R\u0018\u0010ï\u0002\u001a\u00030ì\u00028BX\u0004¢\u0006\b\u001a\u0006\bí\u0002\u0010î\u0002R\u0018\u0010ó\u0002\u001a\u00030ð\u00028BX\u0004¢\u0006\b\u001a\u0006\bñ\u0002\u0010ò\u0002R\u001a\u0010÷\u0002\u001a\u0005\u0018\u00010ô\u00028BX\u0004¢\u0006\b\u001a\u0006\bõ\u0002\u0010ö\u0002R\u0018\u0010\"\u001a\u0004\u0018\u00010!8@X\u0004¢\u0006\b\u001a\u0006\bø\u0002\u0010ù\u0002R\u001a\u0010ý\u0002\u001a\u0005\u0018\u00010ú\u00028@X\u0004¢\u0006\b\u001a\u0006\bû\u0002\u0010ü\u0002¨\u0006\u0003"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/DecorateFragment;", "Landroidx/fragment/app/o;", "Lcom/sugarcube/decorate/v1/internal/v1/toolbar/DraggableToolbar$OnControlsClickedListener;", "Lcom/sugarcube/decorate/internal/shared/DecorateView$EngineErrorListener;", "Lcom/sugarcube/decorate/TemporaryDesignStateListener;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "LXH/N;", "r3", "o3", "F3", "LZF/J0;", "decorateViewState", "u2", "(LZF/J0;)V", "q3", "i3", "z2", "LRF/k;", "swapItem", "G4", "(LRF/k;)V", "j4", "g5", "item", "k4", "", "", "itemIds", "i4", "(Ljava/util/List;)V", "A2", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "engine", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "swapOutInstance", "", "shouldAutoSelect", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "modelScreenTransform", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$a;", "variantType", "reportToAnalytics", "Lcom/sugarcube/decorate_engine/SceneLayout;", "updatedSceneLayout", "isRestored", "c3", "(Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LRF/k;ZLcom/sugarcube/decorate_engine/ModelScreenTransform;Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$a;ZLcom/sugarcube/decorate_engine/SceneLayout;Z)V", "Y2", "Lcom/sugarcube/core/network/models/SmartaPlacementResult;", "smartaPlacementResult", "k5", "(Lcom/sugarcube/core/network/models/SmartaPlacementResult;)V", "shouldReplace", "y3", "(Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LRF/k;Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$a;ZZLcom/sugarcube/decorate_engine/ModelScreenTransform;ZZ)V", "C5", "C2", "Lcom/sugarcube/decorate_engine/EraserCounts;", "eraserCounts", "A5", "(Lcom/sugarcube/decorate_engine/EraserCounts;)V", "catalogItem", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "instanceId", "swapWith", "isPlaceHolder", "Lcom/sugarcube/core/network/models/SmartaPlacement;", "smartaPlacement", "r2", "(Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate_engine/ObjectInstanceId;LRF/k;ZLcom/sugarcube/core/network/models/SmartaPlacement;)LRF/k;", "willReplace", "w2", "(Z)V", "inst", "isPlaceholder", "z4", "(LRF/k;Z)V", "p5", "p3", "", "yaw", "y4", "(LRF/k;F)V", "toRemove", "l4", "f3", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)Z", "LZF/T0;", "swipeDirection", "d3", "(LZF/T0;)V", "b3", "a3", "Z2", "D2", "q5", "F4", "t5", "D5", "show", "u5", "v4", "v2", "Lcom/sugarcube/app/base/data/model/DecorateViewMode;", "viewMode", "e3", "(Lcom/sugarcube/app/base/data/model/DecorateViewMode;)V", "E2", "sceneLayout", "B4", "(Lcom/sugarcube/decorate_engine/SceneLayout;)V", "shouldShow", "f5", "w3", "share", "p4", "r4", "(LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/decorate_engine/LayoutThumbnailSpec;", "V2", "()Lcom/sugarcube/decorate_engine/LayoutThumbnailSpec;", "", "dismissAfter", "Landroid/widget/TextView;", "R2", "(J)Landroid/widget/TextView;", "", "status", "m5", "(Ljava/lang/String;J)LXH/N;", "g3", "()LXH/N;", "h5", "T4", "a5", "Lcom/sugarcube/decorate/v1/internal/v1/b;", "l5", "()Lcom/sugarcube/decorate/v1/internal/v1/b;", "B5", "placeholderInstance", "s2", "(Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LRF/k;LRF/k;ZZLcom/sugarcube/core/network/models/SmartaPlacement;)LRF/k;", "Lcom/sugarcube/app/base/data/analytics/ProductParentType;", "P2", "()Lcom/sugarcube/app/base/data/analytics/ProductParentType;", "Lcom/sugarcube/app/base/data/analytics/CatalogItemSource;", "B2", "()Lcom/sugarcube/app/base/data/analytics/CatalogItemSource;", "H4", "Y4", "d5", "R4", "W4", "Q4", "J4", "Lcom/sugarcube/core/network/models/AuthType;", "pendingAction", "t4", "(Lcom/sugarcube/core/network/models/AuthType;)V", "Lcom/sugarcube/decorate/internal/shared/DecorateView$a;", "engineError", "M4", "(Lcom/sugarcube/decorate/internal/shared/DecorateView$a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "outState", "onSaveInstanceState", "onViewStateRestored", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroy", "onGetLayoutInflater", "(Landroid/os/Bundle;)Landroid/view/LayoutInflater;", "onSaveClicked", "onMultiviewClicked", "isActive", "onShowEraseControlsClicked", "onShowCatalogClicked", "onShowBagClicked", "onShowItemListClicked", "onItemInfoClicked", "onItemRotateClicked", "onItemSwapClicked", "onProductRecommendationsButtonClicked", "onDuplicateItemButtonClicked", "onItemDeleteClicked", "onEraseShowAllClicked", "onEraseHideAllClicked", "newSelection", "C4", "deltaYaw", "o4", "sx", "sy", "x4", "(LRF/k;FF)V", "M2", "(Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;LRF/k;)Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "shouldMarkSceneAsDirty", "y5", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate_engine/ObjectInstanceId;LRF/k;ZZ)LRF/k;", "onError", "Lcom/sugarcube/decorate_engine/Metric;", "metric", "onMetric", "(Lcom/sugarcube/decorate_engine/Metric;)V", "Lcom/sugarcube/decorate/DesignItemInfo;", "items", "onItemsRestored", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "systemUiVisible", "decorFitsSystemWindows", "orientation", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "LOE/q;", "J", "LOE/q;", "U2", "()LOE/q;", "setSugarcube", "(LOE/q;)V", "sugarcube", "LVE/b;", "K", "LVE/b;", "getNetworkConfig", "()LVE/b;", "setNetworkConfig", "(LVE/b;)V", "networkConfig", "Landroid/content/ClipboardManager;", "L", "Landroid/content/ClipboardManager;", "clipboardManager", "Lcom/sugarcube/decorate/internal/navigation/V1;", "M", "LXH/o;", "G2", "()Lcom/sugarcube/decorate/internal/navigation/V1;", "args", "Lcom/sugarcube/decorate/v1/internal/v1/DecorateFragment$b;", "N", "Lcom/sugarcube/decorate/v1/internal/v1/DecorateFragment$b;", "timingVars", "O", "X2", "viewModel", "Lcom/sugarcube/decorate/v1/internal/catalog/Z;", "P", "I2", "()Lcom/sugarcube/decorate/v1/internal/catalog/Z;", "catalogViewModel", "LTF/x;", "Q", "LTF/x;", "binding", "LZF/V0;", "R", "LZF/V0;", "touchControlScheme", "Lcom/sugarcube/decorate/internal/shared/DecorateView;", "S", "Lcom/sugarcube/decorate/internal/shared/DecorateView;", "decorateView", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter;", "T", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter;", "itemListAdapter", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter;", "U", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter;", "itemVariantAdapter", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter;", "X", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter;", "multiviewAdapter", "Y", "Z", "preventAutoInstanceSelection", "LtF/r;", "LtF/r;", "savingDialog", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog;", "y0", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog;", "exitDialog", "Lcom/sugarcube/app/base/ui/feedback/FeedbackDialog;", "z0", "Lcom/sugarcube/app/base/ui/feedback/FeedbackDialog;", "feedbackDialog", "A0", "decorateLoginDialog", "Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject;", "B0", "Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject;", "addItemTooltip", "C0", "magicEraserTooltip", "D0", "itemFlipTooltip", "E0", "roomViewModeTooltip", "F0", "mirrorItemTooltip", "G0", "multiViewItemTooltip", "Landroid/app/Dialog;", "H0", "Landroid/app/Dialog;", "engineErrorAlertDialog", "Landroid/os/Handler;", "I0", "Landroid/os/Handler;", "zoomIndicatorHandler", "Ljava/lang/Runnable;", "J0", "Ljava/lang/Runnable;", "toggleZoomIndicatorRunnable", "K0", "sceneReadyCalled", "L0", "isFragmentRecreated", "M0", "fragmentReady", "LQJ/F0;", "N0", "LQJ/F0;", "fragmentRecreationJob", "LTJ/B;", "O0", "LTJ/B;", "canStart", "P0", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "rotateStartXF", "Landroidx/drawerlayout/widget/DrawerLayout;", "J2", "()Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "L2", "()Landroid/widget/TextView;", "helpText", "Lcom/sugarcube/decorate/v1/internal/v1/toolbar/DraggableToolbar;", "W2", "()Lcom/sugarcube/decorate/v1/internal/v1/toolbar/DraggableToolbar;", "toolbar", "Lcom/sugarcube/app/base/ui/utils/BouncingBallView;", "N2", "()Lcom/sugarcube/app/base/ui/utils/BouncingBallView;", "loadingAnimation", "Landroidx/constraintlayout/widget/ConstraintLayout;", "O2", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "loadingBackground", "Lcom/sugarcube/app/base/data/database/Scene;", "Q2", "()Lcom/sugarcube/app/base/data/database/Scene;", "scene", "K2", "()Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "H2", "()Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "cachedComposition", "Q0", "b", "a", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DecorateFragment extends Hilt_DecorateFragment implements DraggableToolbar.OnControlsClickedListener, DecorateView.EngineErrorListener, TemporaryDesignStateListener, SystemUiDelegate {

    /* renamed from: Q0  reason: collision with root package name */
    public static final C17105a f141751Q0 = new C17105a((DefaultConstructorMarker) null);

    /* renamed from: R0  reason: collision with root package name */
    public static final int f141752R0 = 8;

    /* renamed from: A0  reason: collision with root package name */
    private ExitDialog f141753A0;

    /* renamed from: B0  reason: collision with root package name */
    private DecorateToolbarTooltipObject f141754B0;

    /* renamed from: C0  reason: collision with root package name */
    private DecorateToolbarTooltipObject f141755C0;

    /* renamed from: D0  reason: collision with root package name */
    private DecorateToolbarTooltipObject f141756D0;

    /* renamed from: E0  reason: collision with root package name */
    private DecorateToolbarTooltipObject f141757E0;

    /* renamed from: F0  reason: collision with root package name */
    private DecorateToolbarTooltipObject f141758F0;

    /* renamed from: G0  reason: collision with root package name */
    private DecorateToolbarTooltipObject f141759G0;

    /* renamed from: H0  reason: collision with root package name */
    private Dialog f141760H0;

    /* renamed from: I  reason: collision with root package name */
    private final /* synthetic */ T f141761I = new T();

    /* renamed from: I0  reason: collision with root package name */
    private final Handler f141762I0;

    /* renamed from: J  reason: collision with root package name */
    public OE.q f141763J;

    /* renamed from: J0  reason: collision with root package name */
    private Runnable f141764J0;

    /* renamed from: K  reason: collision with root package name */
    public C13760b f141765K;

    /* renamed from: K0  reason: collision with root package name */
    private boolean f141766K0;

    /* renamed from: L  reason: collision with root package name */
    private ClipboardManager f141767L;

    /* renamed from: L0  reason: collision with root package name */
    private boolean f141768L0;

    /* renamed from: M  reason: collision with root package name */
    private final C16824o f141769M = C16825p.b(new C16895A0(this));
    /* access modifiers changed from: private */

    /* renamed from: M0  reason: collision with root package name */
    public boolean f141770M0;

    /* renamed from: N  reason: collision with root package name */
    private final C17106b f141771N = new C17106b(0, 0);

    /* renamed from: N0  reason: collision with root package name */
    private F0 f141772N0;

    /* renamed from: O  reason: collision with root package name */
    private final C16824o f141773O;
    /* access modifiers changed from: private */

    /* renamed from: O0  reason: collision with root package name */
    public final C16505B<Boolean> f141774O0;

    /* renamed from: P  reason: collision with root package name */
    private final C16824o f141775P;

    /* renamed from: P0  reason: collision with root package name */
    private ModelScreenTransform f141776P0;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public C16481x f141777Q;

    /* renamed from: R  reason: collision with root package name */
    private C16936V0 f141778R;

    /* renamed from: S  reason: collision with root package name */
    private DecorateView f141779S;

    /* renamed from: T  reason: collision with root package name */
    private PlacedItemsAdapter f141780T;

    /* renamed from: U  reason: collision with root package name */
    private ItemVariantAdapter f141781U;
    /* access modifiers changed from: private */

    /* renamed from: X  reason: collision with root package name */
    public MultiviewAdapter f141782X;

    /* renamed from: Y  reason: collision with root package name */
    private boolean f141783Y;

    /* renamed from: Z  reason: collision with root package name */
    private C15093r f141784Z;

    /* renamed from: y0  reason: collision with root package name */
    private ExitDialog f141785y0;
    /* access modifiers changed from: private */

    /* renamed from: z0  reason: collision with root package name */
    public FeedbackDialog f141786z0;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/sugarcube/decorate/v1/internal/v1/DecorateFragment$A", "Lcom/sugarcube/app/base/ui/feedback/FeedbackDialog$OnFeedbackEnteredListener;", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "rating", "LXH/N;", "onFeedbackEntered", "(Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;)V", "onFeedbackDismissed", "()V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class A implements FeedbackDialog.OnFeedbackEnteredListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f141787a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141788b;

        A(b bVar, DecorateFragment decorateFragment) {
            this.f141787a = bVar;
            this.f141788b = decorateFragment;
        }

        public void onFeedbackDismissed() {
            this.f141787a.W();
            this.f141788b.f141786z0 = null;
        }

        public void onFeedbackEntered(FeedbackSmileRatingBar.a aVar) {
            C17542s.j(aVar, "rating");
            this.f141787a.N1(aVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class B implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f141789a;

        public B(C5187o oVar) {
            this.f141789a = oVar;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            Object obj;
            C8951o a10 = a.a(this.f141789a);
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
    public static final class C implements C17631a<j0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16824o f141790a;

        public C(C16824o oVar) {
            this.f141790a = oVar;
        }

        /* renamed from: a */
        public final j0 invoke() {
            return C14046h.b(this.f141790a).getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class D implements C17631a<l3.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16824o f141791a;

        public D(C16824o oVar) {
            this.f141791a = oVar;
        }

        /* renamed from: a */
        public final l3.a invoke() {
            return C14046h.b(this.f141791a).getDefaultViewModelCreationExtras();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class E implements C17631a<i0.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f141792a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16824o f141793b;

        public E(C5187o oVar, C16824o oVar2) {
            this.f141792a = oVar;
            this.f141793b = oVar2;
        }

        /* renamed from: a */
        public final i0.c invoke() {
            C5191t requireActivity = this.f141792a.requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            return e3.a.a(requireActivity, C14046h.b(this.f141793b).getDefaultViewModelProviderFactory());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class F implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f141794a;

        public F(C5187o oVar) {
            this.f141794a = oVar;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            Object obj;
            C8951o a10 = a.a(this.f141794a);
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
    public static final class G implements C17631a<j0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16824o f141795a;

        public G(C16824o oVar) {
            this.f141795a = oVar;
        }

        /* renamed from: a */
        public final j0 invoke() {
            return C14046h.b(this.f141795a).getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class H implements C17631a<l3.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16824o f141796a;

        public H(C16824o oVar) {
            this.f141796a = oVar;
        }

        /* renamed from: a */
        public final l3.a invoke() {
            return C14046h.b(this.f141796a).getDefaultViewModelCreationExtras();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class I implements C17631a<i0.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f141797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16824o f141798b;

        public I(C5187o oVar, C16824o oVar2) {
            this.f141797a = oVar;
            this.f141798b = oVar2;
        }

        /* renamed from: a */
        public final i0.c invoke() {
            C5191t requireActivity = this.f141797a.requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            return e3.a.a(requireActivity, C14046h.b(this.f141798b).getDefaultViewModelProviderFactory());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/DecorateFragment$a;", "", "<init>", "()V", "", "logTag", "Ljava/lang/String;", "SAVED_COMPOSITION_UUID_KEY", "SAVED_IS_NEW_DESIGN_KEY", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.DecorateFragment$a  reason: case insensitive filesystem */
    public static final class C17105a {
        public /* synthetic */ C17105a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C17105a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/DecorateFragment$b;", "", "", "sceneLoadStart", "itemLoadStart", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "d", "(J)V", "c", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.DecorateFragment$b  reason: case insensitive filesystem */
    public static final class C17106b {

        /* renamed from: a  reason: collision with root package name */
        private long f141799a;

        /* renamed from: b  reason: collision with root package name */
        private long f141800b;

        public C17106b(long j10, long j11) {
            this.f141799a = j10;
            this.f141800b = j11;
        }

        public final long a() {
            return this.f141800b;
        }

        public final long b() {
            return this.f141799a;
        }

        public final void c(long j10) {
            this.f141800b = j10;
        }

        public final void d(long j10) {
            this.f141799a = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17106b)) {
                return false;
            }
            C17106b bVar = (C17106b) obj;
            return this.f141799a == bVar.f141799a && this.f141800b == bVar.f141800b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f141799a) * 31) + Long.hashCode(this.f141800b);
        }

        public String toString() {
            long j10 = this.f141799a;
            long j11 = this.f141800b;
            return "TimingVars(sceneLoadStart=" + j10 + ", itemLoadStart=" + j11 + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.DecorateFragment$c  reason: case insensitive filesystem */
    public /* synthetic */ class C17107c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f141801a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f141802b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f141803c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f141804d;

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int[] f141805e;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|(2:15|16)|17|19|20|21|22|23|24|(2:25|26)|27|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|47|48|49|50|51|53) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|(2:1|2)|3|5|6|7|9|10|11|13|14|(2:15|16)|17|19|20|21|22|23|24|25|26|27|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|47|48|49|50|51|53) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|22|23|24|25|26|27|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|47|48|49|50|51|53) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0045 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0055 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0076 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0097 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b8 */
        static {
            /*
                ZF.E0[] r0 = ZF.C16903E0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ZF.E0 r2 = ZF.C16903E0.None     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ZF.E0 r3 = ZF.C16903E0.SceneMetaReady     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                ZF.E0 r4 = ZF.C16903E0.DataReady     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                ZF.E0 r5 = ZF.C16903E0.SceneReady     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ZF.E0 r5 = ZF.C16903E0.Error     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r6 = 5
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f141801a = r0
                com.sugarcube.decorate.v1.internal.v1.b$k[] r0 = com.sugarcube.decorate.v1.internal.v1.b.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.decorate.v1.internal.v1.b$k r5 = com.sugarcube.decorate.v1.internal.v1.b.k.DESIGN_NAME_PROMPT_DIALOG     // Catch:{ NoSuchFieldError -> 0x0045 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0045 }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                com.sugarcube.decorate.v1.internal.v1.b$k r5 = com.sugarcube.decorate.v1.internal.v1.b.k.EXIT_CONFIRMATION_DIALOG     // Catch:{ NoSuchFieldError -> 0x004d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                com.sugarcube.decorate.v1.internal.v1.b$k r5 = com.sugarcube.decorate.v1.internal.v1.b.k.EXIT_SAVE_PROMPT_DIALOG     // Catch:{ NoSuchFieldError -> 0x0055 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
                r0[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0055 }
            L_0x0055:
                com.sugarcube.decorate.v1.internal.v1.b$k r5 = com.sugarcube.decorate.v1.internal.v1.b.k.LOGIN_SAVE_DIALOG     // Catch:{ NoSuchFieldError -> 0x005d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                f141802b = r0
                ZF.T0[] r0 = ZF.C16932T0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ZF.T0 r5 = ZF.C16932T0.UP     // Catch:{ NoSuchFieldError -> 0x006e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                ZF.T0 r5 = ZF.C16932T0.DOWN     // Catch:{ NoSuchFieldError -> 0x0076 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0076 }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0076 }
            L_0x0076:
                ZF.T0 r5 = ZF.C16932T0.LEFT     // Catch:{ NoSuchFieldError -> 0x007e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r5] = r3     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                ZF.T0 r5 = ZF.C16932T0.RIGHT     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                f141803c = r0
                com.sugarcube.decorate_engine.DecorateEngine$RunState[] r0 = com.sugarcube.decorate_engine.DecorateEngine.RunState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.decorate_engine.DecorateEngine$RunState r4 = com.sugarcube.decorate_engine.DecorateEngine.RunState.New     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                com.sugarcube.decorate_engine.DecorateEngine$RunState r4 = com.sugarcube.decorate_engine.DecorateEngine.RunState.Running     // Catch:{ NoSuchFieldError -> 0x009f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r0[r4] = r2     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                com.sugarcube.decorate_engine.DecorateEngine$RunState r4 = com.sugarcube.decorate_engine.DecorateEngine.RunState.Error     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                f141804d = r0
                com.sugarcube.app.base.data.model.DecorateViewMode[] r0 = com.sugarcube.app.base.data.model.DecorateViewMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.app.base.data.model.DecorateViewMode r3 = com.sugarcube.app.base.data.model.DecorateViewMode.FocusMode     // Catch:{ NoSuchFieldError -> 0x00b8 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b8 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x00b8 }
            L_0x00b8:
                com.sugarcube.app.base.data.model.DecorateViewMode r1 = com.sugarcube.app.base.data.model.DecorateViewMode.RoomMode     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                f141805e = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.DecorateFragment.C17107c.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$duplicateSelectedItem$1$1", f = "DecorateFragment.kt", l = {1615}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.DecorateFragment$d  reason: case insensitive filesystem */
    static final class C17108d extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141806c;

        /* renamed from: d  reason: collision with root package name */
        Object f141807d;

        /* renamed from: e  reason: collision with root package name */
        int f141808e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RF.k f141809f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ IDecorateEngine f141810g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141811h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17108d(RF.k kVar, IDecorateEngine iDecorateEngine, DecorateFragment decorateFragment, C17164e<? super C17108d> eVar) {
            super(2, eVar);
            this.f141809f = kVar;
            this.f141810g = iDecorateEngine;
            this.f141811h = decorateFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C17108d(this.f141809f, this.f141810g, this.f141811h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17108d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            CachedCatalogItem cachedCatalogItem;
            Object f10 = C17187b.f();
            int i10 = this.f141808e;
            if (i10 == 0) {
                XH.y.b(obj);
                CachedCatalogItem d10 = this.f141809f.d();
                SceneLayout saveSceneLayout = this.f141810g.saveSceneLayout(this.f141811h.X2().F0(), LayoutThumbnailSpec.NoThumbnails);
                b X22 = this.f141811h.X2();
                this.f141806c = d10;
                this.f141807d = saveSceneLayout;
                this.f141808e = 1;
                Object V02 = X22.V0(d10, saveSceneLayout, this);
                if (V02 == f10) {
                    return f10;
                }
                Object obj2 = V02;
                cachedCatalogItem = d10;
                obj = obj2;
            } else if (i10 == 1) {
                SceneLayout sceneLayout = (SceneLayout) this.f141807d;
                XH.y.b(obj);
                cachedCatalogItem = (CachedCatalogItem) this.f141806c;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SmartaPlacementResult smartaPlacementResult = (SmartaPlacementResult) obj;
            RF.k z52 = DecorateFragment.z5(this.f141811h, cachedCatalogItem, i.h(this.f141810g, this.f141809f.f(), smartaPlacementResult != null ? smartaPlacementResult.getSmartaPlacement() : null), (RF.k) null, false, false, 16, (Object) null);
            this.f141811h.X2().J1(this.f141809f.d(), (CachedCatalogItem) null, (ItemVariantAdapter.a) null, CatalogItemSource.DUPLICATE, this.f141811h.P2(), smartaPlacementResult);
            DecorateFragment.D4(this.f141811h, z52, false, 2, (Object) null);
            this.f141811h.k5(smartaPlacementResult);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$handleCachedItem$1", f = "DecorateFragment.kt", l = {1066}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.DecorateFragment$e  reason: case insensitive filesystem */
    static final class C17109e extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141812c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ItemVariantAdapter.a f141813d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f141814e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141815f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f141816g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ SceneLayout f141817h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ IDecorateEngine f141818i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ RF.k f141819j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f141820k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f141821l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ModelScreenTransform f141822m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17109e(ItemVariantAdapter.a aVar, boolean z10, DecorateFragment decorateFragment, CachedCatalogItem cachedCatalogItem, SceneLayout sceneLayout, IDecorateEngine iDecorateEngine, RF.k kVar, boolean z11, boolean z12, ModelScreenTransform modelScreenTransform, C17164e<? super C17109e> eVar) {
            super(2, eVar);
            this.f141813d = aVar;
            this.f141814e = z10;
            this.f141815f = decorateFragment;
            this.f141816g = cachedCatalogItem;
            this.f141817h = sceneLayout;
            this.f141818i = iDecorateEngine;
            this.f141819j = kVar;
            this.f141820k = z11;
            this.f141821l = z12;
            this.f141822m = modelScreenTransform;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C17109e(this.f141813d, this.f141814e, this.f141815f, this.f141816g, this.f141817h, this.f141818i, this.f141819j, this.f141820k, this.f141821l, this.f141822m, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17109e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f141812c
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                XH.y.b(r13)
                goto L_0x0036
            L_0x0010:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0018:
                XH.y.b(r13)
                com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter$a r13 = r12.f141813d
                if (r13 != 0) goto L_0x0039
                boolean r13 = r12.f141814e
                if (r13 != 0) goto L_0x0039
                com.sugarcube.decorate.v1.internal.v1.DecorateFragment r13 = r12.f141815f
                com.sugarcube.decorate.v1.internal.v1.b r13 = r13.X2()
                com.sugarcube.app.base.data.database.CachedCatalogItem r1 = r12.f141816g
                com.sugarcube.decorate_engine.SceneLayout r4 = r12.f141817h
                r12.f141812c = r2
                java.lang.Object r13 = r13.V0(r1, r4, r12)
                if (r13 != r0) goto L_0x0036
                return r0
            L_0x0036:
                com.sugarcube.core.network.models.SmartaPlacementResult r13 = (com.sugarcube.core.network.models.SmartaPlacementResult) r13
                goto L_0x003a
            L_0x0039:
                r13 = r3
            L_0x003a:
                com.sugarcube.decorate.v1.internal.v1.DecorateFragment r4 = r12.f141815f
                com.sugarcube.decorate.internal.shared.IDecorateEngine r5 = r12.f141818i
                com.sugarcube.app.base.data.database.CachedCatalogItem r6 = r12.f141816g
                RF.k r8 = r12.f141819j
                boolean r10 = r12.f141820k
                if (r13 == 0) goto L_0x004c
                com.sugarcube.core.network.models.SmartaPlacement r0 = r13.getSmartaPlacement()
                r11 = r0
                goto L_0x004d
            L_0x004c:
                r11 = r3
            L_0x004d:
                r7 = 0
                r9 = 0
                RF.k r0 = r4.s2(r5, r6, r7, r8, r9, r10, r11)
                com.sugarcube.decorate_engine.ModelScreenTransform r1 = r12.f141822m
                com.sugarcube.decorate.internal.shared.IDecorateEngine r2 = r12.f141818i
                if (r1 == 0) goto L_0x0060
                com.sugarcube.decorate_engine.ObjectInstanceId r0 = r0.f()
                r2.moveModelInstance(r0, r1)
            L_0x0060:
                boolean r0 = r12.f141821l
                if (r0 == 0) goto L_0x0087
                com.sugarcube.decorate.v1.internal.v1.DecorateFragment r0 = r12.f141815f
                com.sugarcube.decorate.v1.internal.v1.b r4 = r0.X2()
                com.sugarcube.app.base.data.database.CachedCatalogItem r5 = r12.f141816g
                RF.k r0 = r12.f141819j
                if (r0 == 0) goto L_0x0074
                com.sugarcube.app.base.data.database.CachedCatalogItem r3 = r0.d()
            L_0x0074:
                r6 = r3
                com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter$a r7 = r12.f141813d
                com.sugarcube.decorate.v1.internal.v1.DecorateFragment r0 = r12.f141815f
                com.sugarcube.app.base.data.analytics.CatalogItemSource r8 = r0.B2()
                com.sugarcube.decorate.v1.internal.v1.DecorateFragment r0 = r12.f141815f
                com.sugarcube.app.base.data.analytics.ProductParentType r9 = r0.P2()
                r10 = r13
                r4.J1(r5, r6, r7, r8, r9, r10)
            L_0x0087:
                com.sugarcube.decorate.v1.internal.v1.DecorateFragment r0 = r12.f141815f
                r0.k5(r13)
                XH.N r13 = XH.C16807N.f139792a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.DecorateFragment.C17109e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$handleNonCachedItems$1", f = "DecorateFragment.kt", l = {999, 1017}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.DecorateFragment$f  reason: case insensitive filesystem */
    static final class C17110f extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141823c;

        /* renamed from: d  reason: collision with root package name */
        Object f141824d;

        /* renamed from: e  reason: collision with root package name */
        Object f141825e;

        /* renamed from: f  reason: collision with root package name */
        Object f141826f;

        /* renamed from: g  reason: collision with root package name */
        Object f141827g;

        /* renamed from: h  reason: collision with root package name */
        Object f141828h;

        /* renamed from: i  reason: collision with root package name */
        int f141829i;

        /* renamed from: j  reason: collision with root package name */
        int f141830j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ItemVariantAdapter.a f141831k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f141832l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141833m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f141834n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ SceneLayout f141835o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ IDecorateEngine f141836p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ RF.k f141837q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f141838r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ ModelScreenTransform f141839s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f141840t;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$handleNonCachedItems$1$1", f = "DecorateFragment.kt", l = {1019}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.decorate.v1.internal.v1.DecorateFragment$f$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f141841c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ DecorateFragment f141842d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ CachedCatalogItem f141843e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ RF.k f141844f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ IDecorateEngine f141845g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ RF.k f141846h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ boolean f141847i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ SmartaPlacementResult f141848j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ boolean f141849k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ ItemVariantAdapter.a f141850l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(DecorateFragment decorateFragment, CachedCatalogItem cachedCatalogItem, RF.k kVar, IDecorateEngine iDecorateEngine, RF.k kVar2, boolean z10, SmartaPlacementResult smartaPlacementResult, boolean z11, ItemVariantAdapter.a aVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f141842d = decorateFragment;
                this.f141843e = cachedCatalogItem;
                this.f141844f = kVar;
                this.f141845g = iDecorateEngine;
                this.f141846h = kVar2;
                this.f141847i = z10;
                this.f141848j = smartaPlacementResult;
                this.f141849k = z11;
                this.f141850l = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f141842d, this.f141843e, this.f141844f, this.f141845g, this.f141846h, this.f141847i, this.f141848j, this.f141849k, this.f141850l, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                CachedCatalogItem cachedCatalogItem;
                Object f10 = C17187b.f();
                int i10 = this.f141841c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    b X22 = this.f141842d.X2();
                    CachedCatalogItem cachedCatalogItem2 = this.f141843e;
                    this.f141841c = 1;
                    obj = X22.a0(cachedCatalogItem2, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    try {
                        XH.y.b(obj);
                    } catch (Throwable th2) {
                        Log.w(AnyKt.SUGARCUBE_TAG, "Could not load item model", th2);
                        cachedCatalogItem = this.f141843e;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cachedCatalogItem = (CachedCatalogItem) obj;
                if (cachedCatalogItem.getModelFile().exists() && this.f141842d.X2().a1(this.f141844f)) {
                    DecorateFragment decorateFragment = this.f141842d;
                    IDecorateEngine iDecorateEngine = this.f141845g;
                    RF.k kVar = this.f141844f;
                    RF.k kVar2 = this.f141846h;
                    boolean z10 = this.f141847i;
                    SmartaPlacementResult smartaPlacementResult = this.f141848j;
                    RF.k unused = decorateFragment.s2(iDecorateEngine, cachedCatalogItem, kVar, kVar2, false, z10, smartaPlacementResult != null ? smartaPlacementResult.getSmartaPlacement() : null);
                    if (this.f141849k) {
                        b X23 = this.f141842d.X2();
                        RF.k kVar3 = this.f141846h;
                        X23.J1(cachedCatalogItem, kVar3 != null ? kVar3.d() : null, this.f141850l, this.f141842d.B2(), this.f141842d.P2(), this.f141848j);
                    }
                    this.f141842d.k5(this.f141848j);
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17110f(ItemVariantAdapter.a aVar, boolean z10, DecorateFragment decorateFragment, CachedCatalogItem cachedCatalogItem, SceneLayout sceneLayout, IDecorateEngine iDecorateEngine, RF.k kVar, boolean z11, ModelScreenTransform modelScreenTransform, boolean z12, C17164e<? super C17110f> eVar) {
            super(2, eVar);
            this.f141831k = aVar;
            this.f141832l = z10;
            this.f141833m = decorateFragment;
            this.f141834n = cachedCatalogItem;
            this.f141835o = sceneLayout;
            this.f141836p = iDecorateEngine;
            this.f141837q = kVar;
            this.f141838r = z11;
            this.f141839s = modelScreenTransform;
            this.f141840t = z12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C17110f(this.f141831k, this.f141832l, this.f141833m, this.f141834n, this.f141835o, this.f141836p, this.f141837q, this.f141838r, this.f141839s, this.f141840t, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17110f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00ce A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f141830j
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x003c
                if (r2 == r5) goto L_0x0036
                if (r2 != r4) goto L_0x002e
                java.lang.Object r1 = r0.f141828h
                RF.k r1 = (RF.k) r1
                java.lang.Object r1 = r0.f141827g
                com.sugarcube.decorate.internal.shared.IDecorateEngine r1 = (com.sugarcube.decorate.internal.shared.IDecorateEngine) r1
                java.lang.Object r1 = r0.f141826f
                com.sugarcube.decorate_engine.ModelScreenTransform r1 = (com.sugarcube.decorate_engine.ModelScreenTransform) r1
                java.lang.Object r1 = r0.f141825e
                RF.k r1 = (RF.k) r1
                java.lang.Object r1 = r0.f141824d
                RF.k r1 = (RF.k) r1
                java.lang.Object r1 = r0.f141823c
                com.sugarcube.core.network.models.SmartaPlacementResult r1 = (com.sugarcube.core.network.models.SmartaPlacementResult) r1
                XH.y.b(r22)
                goto L_0x00cf
            L_0x002e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0036:
                XH.y.b(r22)
                r2 = r22
                goto L_0x005a
            L_0x003c:
                XH.y.b(r22)
                com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter$a r2 = r0.f141831k
                if (r2 != 0) goto L_0x005d
                boolean r2 = r0.f141832l
                if (r2 != 0) goto L_0x005d
                com.sugarcube.decorate.v1.internal.v1.DecorateFragment r2 = r0.f141833m
                com.sugarcube.decorate.v1.internal.v1.b r2 = r2.X2()
                com.sugarcube.app.base.data.database.CachedCatalogItem r6 = r0.f141834n
                com.sugarcube.decorate_engine.SceneLayout r7 = r0.f141835o
                r0.f141830j = r5
                java.lang.Object r2 = r2.V0(r6, r7, r0)
                if (r2 != r1) goto L_0x005a
                return r1
            L_0x005a:
                com.sugarcube.core.network.models.SmartaPlacementResult r2 = (com.sugarcube.core.network.models.SmartaPlacementResult) r2
                goto L_0x005e
            L_0x005d:
                r2 = r3
            L_0x005e:
                com.sugarcube.decorate.v1.internal.v1.DecorateFragment r5 = r0.f141833m
                com.sugarcube.decorate.internal.shared.IDecorateEngine r6 = r0.f141836p
                com.sugarcube.app.base.data.database.CachedCatalogItem r7 = r0.f141834n
                RF.k r9 = r0.f141837q
                boolean r11 = r0.f141838r
                if (r2 == 0) goto L_0x006e
                com.sugarcube.core.network.models.SmartaPlacement r3 = r2.getSmartaPlacement()
            L_0x006e:
                r12 = r3
                r8 = 0
                r10 = 1
                RF.k r3 = r5.s2(r6, r7, r8, r9, r10, r11, r12)
                com.sugarcube.decorate_engine.ModelScreenTransform r15 = r0.f141839s
                com.sugarcube.decorate.internal.shared.IDecorateEngine r14 = r0.f141836p
                if (r15 == 0) goto L_0x0082
                com.sugarcube.decorate_engine.ObjectInstanceId r5 = r3.f()
                r14.moveModelInstance(r5, r15)
            L_0x0082:
                QJ.M r13 = QJ.C16311i0.b()
                com.sugarcube.decorate.v1.internal.v1.DecorateFragment$f$a r12 = new com.sugarcube.decorate.v1.internal.v1.DecorateFragment$f$a
                com.sugarcube.decorate.v1.internal.v1.DecorateFragment r6 = r0.f141833m
                com.sugarcube.app.base.data.database.CachedCatalogItem r7 = r0.f141834n
                com.sugarcube.decorate.internal.shared.IDecorateEngine r9 = r0.f141836p
                RF.k r10 = r0.f141837q
                boolean r11 = r0.f141838r
                boolean r8 = r0.f141840t
                com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter$a r5 = r0.f141831k
                r16 = 0
                r17 = r5
                r5 = r12
                r18 = r8
                r8 = r3
                r19 = r12
                r12 = r2
                r20 = r13
                r13 = r18
                r4 = r14
                r14 = r17
                r17 = r1
                r1 = r15
                r15 = r16
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                r0.f141823c = r2
                r0.f141824d = r3
                r0.f141825e = r3
                r0.f141826f = r1
                r0.f141827g = r4
                r0.f141828h = r3
                r1 = 0
                r0.f141829i = r1
                r1 = 2
                r0.f141830j = r1
                r2 = r19
                r1 = r20
                java.lang.Object r1 = QJ.C16310i.g(r1, r2, r0)
                r2 = r17
                if (r1 != r2) goto L_0x00cf
                return r2
            L_0x00cf:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.DecorateFragment.C17110f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/sugarcube/decorate/v1/internal/v1/DecorateFragment$g", "Landroidx/drawerlayout/widget/DrawerLayout$e;", "Landroid/view/View;", "drawerView", "", "slideOffset", "LXH/N;", "d", "(Landroid/view/View;F)V", "a", "(Landroid/view/View;)V", "b", "", "newState", "c", "(I)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.DecorateFragment$g  reason: case insensitive filesystem */
    public static final class C17111g implements DrawerLayout.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141851a;

        C17111g(DecorateFragment decorateFragment) {
            this.f141851a = decorateFragment;
        }

        public void a(View view) {
            C17542s.j(view, "drawerView");
            C17060c.f141229a.a();
            this.f141851a.J2().setDrawerLockMode(0);
            C16481x S12 = this.f141851a.f141777Q;
            C16481x xVar = null;
            if (S12 == null) {
                C17542s.z("binding");
                S12 = null;
            }
            ImageButton imageButton = S12.f138491b;
            C17542s.i(imageButton, "decorateCloseBtn");
            Z.o(imageButton, 0, false, (C17631a) null, 7, (Object) null);
            C16481x S13 = this.f141851a.f141777Q;
            if (S13 == null) {
                C17542s.z("binding");
            } else {
                xVar = S13;
            }
            xVar.f138507r.setVisibility(0);
        }

        public void b(View view) {
            C17542s.j(view, "drawerView");
            this.f141851a.J2().setDrawerLockMode(1);
            C16481x S12 = this.f141851a.f141777Q;
            C16481x xVar = null;
            if (S12 == null) {
                C17542s.z("binding");
                S12 = null;
            }
            ImageButton imageButton = S12.f138491b;
            C17542s.i(imageButton, "decorateCloseBtn");
            Z.l(imageButton, 0, (C17631a) null, 3, (Object) null);
            this.f141851a.I2().t0();
            C16481x S13 = this.f141851a.f141777Q;
            if (S13 == null) {
                C17542s.z("binding");
            } else {
                xVar = S13;
            }
            xVar.f138507r.setVisibility(8);
        }

        public void c(int i10) {
        }

        public void d(View view, float f10) {
            C17542s.j(view, "drawerView");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$onBackPressed$1", f = "DecorateFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.DecorateFragment$h  reason: case insensitive filesystem */
    static final class C17112h extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141852c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141853d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17112h(DecorateFragment decorateFragment, C17164e<? super C17112h> eVar) {
            super(2, eVar);
            this.f141853d = decorateFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C17112h(this.f141853d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17112h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f141852c == 0) {
                XH.y.b(obj);
                this.f141853d.X2().v1();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/sugarcube/decorate/v1/internal/v1/DecorateFragment$i", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/PlacedItemsAdapter$OnItemListInteractionListener;", "LRF/k;", "item", "LXH/N;", "onItemSelected", "(LRF/k;)V", "", "isEmpty", "onItemListSizeChanged", "(Z)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.DecorateFragment$i  reason: case insensitive filesystem */
    public static final class C17113i implements PlacedItemsAdapter.OnItemListInteractionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141854a;

        C17113i(DecorateFragment decorateFragment) {
            this.f141854a = decorateFragment;
        }

        public void onItemListSizeChanged(boolean z10) {
            this.f141854a.W2().r0(!z10);
            this.f141854a.W2().t0(!z10);
        }

        public void onItemSelected(RF.k kVar) {
            C17542s.j(kVar, "item");
            if (!C17542s.e(this.f141854a.X2().H0(), kVar)) {
                DecorateFragment.D4(this.f141854a, kVar, false, 2, (Object) null);
            } else {
                DecorateFragment.x2(this.f141854a, false, 1, (Object) null);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class j extends C17540p implements nI.w<IDecorateEngine, CachedCatalogItem, RF.k, Boolean, ModelScreenTransform, ItemVariantAdapter.a, Boolean, SceneLayout, Boolean, C16807N> {
        j(Object obj) {
            super(9, obj, DecorateFragment.class, "handleCachedItem", "handleCachedItem(Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate/internal/shared/ModelInstanceInfo;ZLcom/sugarcube/decorate_engine/ModelScreenTransform;Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$VariantType;ZLcom/sugarcube/decorate_engine/SceneLayout;Z)V", 0);
        }

        public final void t(IDecorateEngine iDecorateEngine, CachedCatalogItem cachedCatalogItem, RF.k kVar, boolean z10, ModelScreenTransform modelScreenTransform, ItemVariantAdapter.a aVar, boolean z11, SceneLayout sceneLayout, boolean z12) {
            C17542s.j(iDecorateEngine, "p0");
            C17542s.j(cachedCatalogItem, "p1");
            ((DecorateFragment) this.receiver).Y2(iDecorateEngine, cachedCatalogItem, kVar, z10, modelScreenTransform, aVar, z11, sceneLayout, z12);
        }

        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
            t((IDecorateEngine) obj, (CachedCatalogItem) obj2, (RF.k) obj3, ((Boolean) obj4).booleanValue(), (ModelScreenTransform) obj5, (ItemVariantAdapter.a) obj6, ((Boolean) obj7).booleanValue(), (SceneLayout) obj8, ((Boolean) obj9).booleanValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class k extends C17540p implements nI.w<IDecorateEngine, CachedCatalogItem, RF.k, Boolean, ModelScreenTransform, ItemVariantAdapter.a, Boolean, SceneLayout, Boolean, C16807N> {
        k(Object obj) {
            super(9, obj, DecorateFragment.class, "handleNonCachedItems", "handleNonCachedItems(Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate/internal/shared/ModelInstanceInfo;ZLcom/sugarcube/decorate_engine/ModelScreenTransform;Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$VariantType;ZLcom/sugarcube/decorate_engine/SceneLayout;Z)V", 0);
        }

        public final void t(IDecorateEngine iDecorateEngine, CachedCatalogItem cachedCatalogItem, RF.k kVar, boolean z10, ModelScreenTransform modelScreenTransform, ItemVariantAdapter.a aVar, boolean z11, SceneLayout sceneLayout, boolean z12) {
            C17542s.j(iDecorateEngine, "p0");
            C17542s.j(cachedCatalogItem, "p1");
            ((DecorateFragment) this.receiver).c3(iDecorateEngine, cachedCatalogItem, kVar, z10, modelScreenTransform, aVar, z11, sceneLayout, z12);
        }

        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
            t((IDecorateEngine) obj, (CachedCatalogItem) obj2, (RF.k) obj3, ((Boolean) obj4).booleanValue(), (ModelScreenTransform) obj5, (ItemVariantAdapter.a) obj6, ((Boolean) obj7).booleanValue(), (SceneLayout) obj8, ((Boolean) obj9).booleanValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$onItemsRestored$1$1$1", f = "DecorateFragment.kt", l = {}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141855c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141856d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<DesignItemInfo> f141857e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ IDecorateEngine f141858f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(DecorateFragment decorateFragment, List<DesignItemInfo> list, IDecorateEngine iDecorateEngine, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f141856d = decorateFragment;
            this.f141857e = list;
            this.f141858f = iDecorateEngine;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new l(this.f141856d, this.f141857e, this.f141858f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f141855c == 0) {
                XH.y.b(obj);
                if (this.f141856d.getView() != null) {
                    DecorateFragment decorateFragment = this.f141856d;
                    for (T h22 : C16877v.t1(this.f141856d.X2().v0())) {
                        decorateFragment.l4(h22);
                    }
                    this.f141856d.X2().D1();
                    this.f141856d.B5();
                    DecorateFragment decorateFragment2 = this.f141856d;
                    IDecorateEngine iDecorateEngine = this.f141858f;
                    for (DesignItemInfo designItemInfo : this.f141857e) {
                        DecorateFragment.z3(decorateFragment2, iDecorateEngine, RF.q.a(designItemInfo.c().a()), (RF.k) null, (ItemVariantAdapter.a) null, false, false, designItemInfo.d(), false, true, 12, (Object) null);
                    }
                    b.G1(this.f141856d.X2(), C16877v.n(), false, false, false, 14, (Object) null);
                    DecorateFragment.x2(this.f141856d, false, 1, (Object) null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$onSaveClicked$2", f = "DecorateFragment.kt", l = {1206}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141859c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(DecorateFragment decorateFragment, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f141860d = decorateFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new m(this.f141860d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((m) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141859c;
            if (i10 == 0) {
                XH.y.b(obj);
                b X22 = this.f141860d.X2();
                this.f141859c = 1;
                if (X22.C1(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$onViewCreated$2", f = "DecorateFragment.kt", l = {437, 439}, m = "invokeSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141861c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141862d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(DecorateFragment decorateFragment, C17164e<? super n> eVar) {
            super(2, eVar);
            this.f141862d = decorateFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new n(this.f141862d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((n) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141861c;
            if (i10 == 0) {
                XH.y.b(obj);
                this.f141861c = 1;
                if (C16297b0.b(1000, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else if (i10 == 2) {
                XH.y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f141862d.f141770M0 = true;
            C16505B T12 = this.f141862d.f141774O0;
            Boolean a10 = b.a(true);
            this.f141861c = 2;
            if (T12.emit(a10, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$onViewCreated$3", f = "DecorateFragment.kt", l = {443}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141863c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141864d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ DecorateFragment f141865a;

            a(DecorateFragment decorateFragment) {
                this.f141865a = decorateFragment;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                if (z10) {
                    this.f141865a.r3();
                }
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(DecorateFragment decorateFragment, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f141864d = decorateFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new o(this.f141864d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((o) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141863c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16505B T12 = this.f141864d.f141774O0;
                a aVar = new a(this.f141864d);
                this.f141863c = 1;
                if (T12.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                XH.y.b(obj);
            }
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$onViewCreatedCode$$inlined$observeFlow$1", f = "DecorateFragment.kt", l = {105}, m = "invokeSuspend")
    public static final class p extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141866c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5187o f141867d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16532g f141868e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141869f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$onViewCreatedCode$$inlined$observeFlow$1$1", f = "DecorateFragment.kt", l = {106}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f141870c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C16532g f141871d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ DecorateFragment f141872e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.sugarcube.decorate.v1.internal.v1.DecorateFragment$p$a$a  reason: collision with other inner class name */
            public static final class C3466a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ DecorateFragment f141873a;

                public C3466a(DecorateFragment decorateFragment) {
                    this.f141873a = decorateFragment;
                }

                public final Object emit(T t10, C17164e<? super C16807N> eVar) {
                    C14046h.d(androidx.navigation.fragment.a.a(this.f141873a), t10, (x4.C) null, 2, (Object) null);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C16532g gVar, C17164e eVar, DecorateFragment decorateFragment) {
                super(2, eVar);
                this.f141871d = gVar;
                this.f141872e = decorateFragment;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f141871d, eVar, this.f141872e);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f141870c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    C16532g gVar = this.f141871d;
                    C3466a aVar = new C3466a(this.f141872e);
                    this.f141870c = 1;
                    if (gVar.collect(aVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    XH.y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(C5187o oVar, C16532g gVar, C17164e eVar, DecorateFragment decorateFragment) {
            super(2, eVar);
            this.f141867d = oVar;
            this.f141868e = gVar;
            this.f141869f = decorateFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new p(this.f141867d, this.f141868e, eVar, this.f141869f);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((p) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141866c;
            if (i10 == 0) {
                XH.y.b(obj);
                androidx.lifecycle.r lifecycle = this.f141867d.getLifecycle();
                C17542s.i(lifecycle, "<get-lifecycle>(...)");
                r.b bVar = r.b.RESUMED;
                a aVar = new a(this.f141868e, (C17164e) null, this.f141869f);
                this.f141866c = 1;
                if (androidx.lifecycle.Q.a(lifecycle, bVar, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u0019\u0010\u001a\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ\u0019\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010\u0004J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"com/sugarcube/decorate/v1/internal/v1/DecorateFragment$q", "Lcom/sugarcube/decorate/v1/internal/v1/TouchInteractionListener;", "LXH/N;", "onItemEraseToggled", "()V", "Lcom/sugarcube/decorate_engine/PanZoomRegion;", "region", "onRegionChanged", "(Lcom/sugarcube/decorate_engine/PanZoomRegion;)V", "onPinch", "onMaxZoomReached", "onMinZoomReached", "LRF/k;", "selectedInstance", "onInstanceSelected", "(LRF/k;)V", "inst", "", "deltaYaw", "onRotate", "(LRF/k;F)V", "sx", "sy", "onMove", "(LRF/k;FF)V", "onSelectionCleared", "onInstanceDoubleTap", "LZF/S0;", "mode", "onItemInteractionMode", "(LZF/S0;)V", "LZF/T0;", "swipeDirection", "onSwipe", "(LZF/T0;)V", "onFocusModeZoomDecrease", "onFocusModeZoomIncrease", "onInteractionEnded", "", "downTime", "onLongPress", "(J)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class q implements TouchInteractionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IDecorateEngine f141875b;

        q(DecorateFragment decorateFragment, IDecorateEngine iDecorateEngine) {
            this.f141874a = decorateFragment;
            this.f141875b = iDecorateEngine;
        }

        public void onFocusModeZoomDecrease() {
            this.f141874a.a3();
        }

        public void onFocusModeZoomIncrease() {
            this.f141874a.b3();
        }

        public void onInstanceDoubleTap(RF.k kVar) {
            this.f141874a.Z2(kVar);
        }

        public void onInstanceSelected(RF.k kVar) {
            DecorateFragment.D4(this.f141874a, kVar, false, 2, (Object) null);
        }

        public void onInteractionEnded() {
            this.f141874a.C5();
        }

        public void onItemEraseToggled() {
            this.f141874a.X2().z1(this.f141875b);
        }

        public void onItemInteractionMode(C16930S0 s02) {
            this.f141874a.W2().u0(s02 == null);
        }

        public void onLongPress(long j10) {
            if (j10 >= 3000 && this.f141874a.X2().H0() == null) {
                b.m2(this.f141874a.X2(), false, 1, (Object) null);
            }
        }

        public void onMaxZoomReached() {
            if (Build.VERSION.SDK_INT >= 30) {
                C16481x S12 = this.f141874a.f141777Q;
                if (S12 == null) {
                    C17542s.z("binding");
                    S12 = null;
                }
                S12.f138508s.getRoot().performHapticFeedback(17);
            }
        }

        public void onMinZoomReached() {
            if (Build.VERSION.SDK_INT >= 30) {
                C16481x S12 = this.f141874a.f141777Q;
                if (S12 == null) {
                    C17542s.z("binding");
                    S12 = null;
                }
                S12.f138508s.getRoot().performHapticFeedback(17);
            }
        }

        public void onMove(RF.k kVar, float f10, float f11) {
            C17542s.j(kVar, "inst");
            this.f141874a.x4(kVar, f10, f11);
        }

        public void onPinch() {
            this.f141874a.D5();
        }

        public void onRegionChanged(PanZoomRegion panZoomRegion) {
            C17542s.j(panZoomRegion, "region");
            this.f141874a.X2().R1(panZoomRegion);
        }

        public void onRotate(RF.k kVar, float f10) {
            C17542s.j(kVar, "inst");
            this.f141874a.o4(kVar, f10);
        }

        public void onSelectionCleared() {
            this.f141874a.X2().E1();
            DecorateFragment.x2(this.f141874a, false, 1, (Object) null);
        }

        public void onSwipe(C16932T0 t02) {
            C17542s.j(t02, "swipeDirection");
            this.f141874a.d3(t02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$save$1", f = "DecorateFragment.kt", l = {1903}, m = "invokeSuspend")
    static final class r extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141876c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f141877d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141878e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(boolean z10, DecorateFragment decorateFragment, C17164e<? super r> eVar) {
            super(2, eVar);
            this.f141877d = z10;
            this.f141878e = decorateFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new r(this.f141877d, this.f141878e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((r) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141876c;
            if (i10 == 0) {
                XH.y.b(obj);
                if (this.f141877d) {
                    this.f141878e.X2().j2();
                }
                DecorateFragment decorateFragment = this.f141878e;
                this.f141876c = 1;
                if (decorateFragment.r4(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f141878e.W2().v0(true);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment", f = "DecorateFragment.kt", l = {1911, 1930, 1931}, m = "saveAsync")
    static final class s extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f141879c;

        /* renamed from: d  reason: collision with root package name */
        Object f141880d;

        /* renamed from: e  reason: collision with root package name */
        Object f141881e;

        /* renamed from: f  reason: collision with root package name */
        Object f141882f;

        /* renamed from: g  reason: collision with root package name */
        Object f141883g;

        /* renamed from: h  reason: collision with root package name */
        Object f141884h;

        /* renamed from: i  reason: collision with root package name */
        Object f141885i;

        /* renamed from: j  reason: collision with root package name */
        Object f141886j;

        /* renamed from: k  reason: collision with root package name */
        int f141887k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f141888l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141889m;

        /* renamed from: n  reason: collision with root package name */
        int f141890n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(DecorateFragment decorateFragment, C17164e<? super s> eVar) {
            super(eVar);
            this.f141889m = decorateFragment;
        }

        public final Object invokeSuspend(Object obj) {
            this.f141888l = obj;
            this.f141890n |= Integer.MIN_VALUE;
            return this.f141889m.r4(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$saveAsync$2$2", f = "DecorateFragment.kt", l = {}, m = "invokeSuspend")
    static final class t extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141891c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141892d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(DecorateFragment decorateFragment, C17164e<? super t> eVar) {
            super(2, eVar);
            this.f141892d = decorateFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new t(this.f141892d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((t) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            UUID compositionUuid;
            C17187b.f();
            if (this.f141891c == 0) {
                XH.y.b(obj);
                C8951o a10 = a.a(this.f141892d);
                Kreativ.Gallery.Home home = new Kreativ.Gallery.Home(h.b.f124418e.b());
                C.a aVar = new C.a();
                aVar.j(P.b(Kreativ.Gallery.class), true, false);
                C8951o.f0(a10, home, aVar.a(), (I.a) null, 4, (Object) null);
                CachedCompiledComposition H22 = this.f141892d.H2();
                if (H22 == null || (compositionUuid = H22.getCompositionUuid()) == null) {
                    return null;
                }
                C8951o.f0(a.a(this.f141892d), new Kreativ.Gallery.OverflowSheet(compositionUuid.toString(), false, 2, (DefaultConstructorMarker) null), (x4.C) null, (I.a) null, 6, (Object) null);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$savePendingComposition$1", f = "DecorateFragment.kt", l = {2395}, m = "invokeSuspend")
    static final class u extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141893c;

        /* renamed from: d  reason: collision with root package name */
        Object f141894d;

        /* renamed from: e  reason: collision with root package name */
        Object f141895e;

        /* renamed from: f  reason: collision with root package name */
        Object f141896f;

        /* renamed from: g  reason: collision with root package name */
        Object f141897g;

        /* renamed from: h  reason: collision with root package name */
        Object f141898h;

        /* renamed from: i  reason: collision with root package name */
        int f141899i;

        /* renamed from: j  reason: collision with root package name */
        int f141900j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141901k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ AuthType f141902l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(DecorateFragment decorateFragment, AuthType authType, C17164e<? super u> eVar) {
            super(2, eVar);
            this.f141901k = decorateFragment;
            this.f141902l = authType;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new u(this.f141901k, this.f141902l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((u) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            DecorateFragment decorateFragment;
            AuthType authType;
            Object obj2;
            SceneLayout sceneLayout;
            Composition composition;
            SceneLayout saveSceneLayout;
            Object f10 = C17187b.f();
            int i10 = this.f141900j;
            if (i10 == 0) {
                XH.y.b(obj);
                IDecorateEngine K22 = this.f141901k.K2();
                if (!(K22 == null || (saveSceneLayout = K22.saveSceneLayout(this.f141901k.X2().F0(), this.f141901k.V2())) == null)) {
                    DecorateFragment decorateFragment2 = this.f141901k;
                    authType = this.f141902l;
                    b X22 = decorateFragment2.X2();
                    this.f141893c = K22;
                    this.f141894d = saveSceneLayout;
                    this.f141895e = saveSceneLayout;
                    this.f141896f = decorateFragment2;
                    this.f141897g = authType;
                    this.f141898h = saveSceneLayout;
                    this.f141899i = 0;
                    this.f141900j = 1;
                    obj2 = X22.q2(saveSceneLayout, false, this);
                    if (obj2 == f10) {
                        return f10;
                    }
                    sceneLayout = saveSceneLayout;
                    decorateFragment = decorateFragment2;
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                sceneLayout = (SceneLayout) this.f141898h;
                SceneLayout sceneLayout2 = (SceneLayout) this.f141895e;
                SceneLayout sceneLayout3 = (SceneLayout) this.f141894d;
                IDecorateEngine iDecorateEngine = (IDecorateEngine) this.f141893c;
                XH.y.b(obj);
                authType = (AuthType) this.f141897g;
                decorateFragment = (DecorateFragment) this.f141896f;
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CachedCompiledComposition cachedCompiledComposition = (CachedCompiledComposition) obj2;
            if (!(cachedCompiledComposition == null || (composition = cachedCompiledComposition.getComposition()) == null)) {
                UUID compositionUuid = composition.getCompositionUuid();
                Log.d(AnyKt.SUGARCUBE_TAG, "onSaveClicked: pendingComposition " + compositionUuid);
                decorateFragment.X2().g0().setPendingComposition(new PendingComposition(composition, authType, false, 4, (DefaultConstructorMarker) null));
                decorateFragment.B4(sceneLayout);
                UUID compositionUuid2 = composition.getCompositionUuid();
                h.b bVar = h.b.f124418e;
                com.sugarcube.app.base.ui.gallery.a.b(bVar);
                C8951o a10 = a.a(decorateFragment);
                Kreativ.Gallery.Home home = new Kreativ.Gallery.Home(bVar.b());
                C.a aVar = new C.a();
                aVar.j(P.b(Kreativ.Gallery.class), true, false);
                C8951o.f0(a10, home, aVar.a(), (I.a) null, 4, (Object) null);
                C8951o.f0(a.a(decorateFragment), new Kreativ.Gallery.OverflowSheet(compositionUuid2.toString(), false, 2, (DefaultConstructorMarker) null), (x4.C) null, (I.a) null, 6, (Object) null);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/sugarcube/decorate/v1/internal/v1/DecorateFragment$v", "Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$TooltipListener;", "LXH/N;", "onTooltipShown", "()V", "onTooltipDismissed", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class v implements DecorateToolbarTooltipObject.TooltipListener {
        v() {
        }

        public void onTooltipDismissed() {
        }

        public void onTooltipShown() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/sugarcube/decorate/v1/internal/v1/DecorateFragment$w", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnExitConfirmationInteractionsListener;", "Landroid/app/Dialog;", "dialog", "LXH/N;", "onCancel", "(Landroid/app/Dialog;)V", "onExit", "()V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class w implements ExitDialog.OnExitConfirmationInteractionsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141903a;

        w(DecorateFragment decorateFragment) {
            this.f141903a = decorateFragment;
        }

        public void onCancel(Dialog dialog) {
            C17542s.j(dialog, "dialog");
            dialog.dismiss();
        }

        public void onExit() {
            DecorateFragment.u4(this.f141903a, (AuthType) null, 1, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/sugarcube/decorate/v1/internal/v1/DecorateFragment$x", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnSaveInteractionsListener;", "LXH/N;", "onDiscardDesign", "()V", "Landroid/app/Dialog;", "dialog", "onSaveDesign", "(Landroid/app/Dialog;)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class x implements ExitDialog.OnSaveInteractionsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141904a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateFragment$showExitSavePrompt$1$onSaveDesign$1", f = "DecorateFragment.kt", l = {2315}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f141905c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ DecorateFragment f141906d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(DecorateFragment decorateFragment, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f141906d = decorateFragment;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f141906d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f141905c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    b X22 = this.f141906d.X2();
                    this.f141905c = 1;
                    if (X22.C1(this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    XH.y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        x(DecorateFragment decorateFragment) {
            this.f141904a = decorateFragment;
        }

        public void onDiscardDesign() {
            this.f141904a.X2().w1();
        }

        public void onSaveDesign(Dialog dialog) {
            C17542s.j(dialog, "dialog");
            C16942a z02 = this.f141904a.X2().z0();
            if (z02 != null) {
                z02.x();
            }
            F0 unused = C16314k.d(C5222z.a(this.f141904a), (C17168i) null, (QJ.T) null, new a(this.f141904a, (C17164e<? super a>) null), 3, (Object) null);
            dialog.dismiss();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/sugarcube/decorate/v1/internal/v1/DecorateFragment$y", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnLoginInteractionsListener;", "Landroid/app/Dialog;", "dialog", "LXH/N;", "onSignUp", "(Landroid/app/Dialog;)V", "onLogin", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class y implements ExitDialog.OnLoginInteractionsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141907a;

        y(DecorateFragment decorateFragment) {
            this.f141907a = decorateFragment;
        }

        public void onLogin(Dialog dialog) {
            C17542s.j(dialog, "dialog");
            this.f141907a.t4(AuthType.LOGIN);
            dialog.dismiss();
        }

        public void onSignUp(Dialog dialog) {
            C17542s.j(dialog, "dialog");
            this.f141907a.t4(AuthType.SIGNUP);
            dialog.dismiss();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class z implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView f141908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DecorateFragment f141909b;

        public z(RecyclerView recyclerView, DecorateFragment decorateFragment) {
            this.f141908a = recyclerView;
            this.f141909b = decorateFragment;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            RecyclerView recyclerView = this.f141908a;
            MultiviewAdapter W12 = this.f141909b.f141782X;
            recyclerView.w1(W12 != null ? W12.g() : 0);
            this.f141908a.setVisibility(0);
        }
    }

    public DecorateFragment() {
        C16824o b10 = C16825p.b(new B(this));
        this.f141773O = W.b(this, P.b(b.class), new C(b10), new D(b10), new E(this, b10));
        C16824o b11 = C16825p.b(new F(this));
        this.f141775P = W.b(this, P.b(com.sugarcube.decorate.v1.internal.catalog.Z.class), new G(b11), new H(b11), new I(this, b11));
        this.f141762I0 = new Handler(Looper.getMainLooper());
        this.f141774O0 = C16521S.a(Boolean.FALSE);
        this.f141776P0 = new ModelScreenTransform();
    }

    private final void A2() {
        C16481x xVar = this.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        DrawerLayout b10 = xVar.getRoot();
        C17542s.i(b10, "getRoot(...)");
        Z.s(b10);
        J2().f();
        C16942a z02 = X2().z0();
        if (z02 != null) {
            z02.R();
        }
        this.f141783Y = false;
    }

    /* access modifiers changed from: private */
    public static final void A3(DecorateFragment decorateFragment) {
        if (decorateFragment.W2().getMode() != DraggableToolbar.c.LIST) {
            decorateFragment.W2().i1();
            decorateFragment.C5();
        }
    }

    /* access modifiers changed from: private */
    public static final void A4(DecorateFragment decorateFragment) {
        if (decorateFragment.W2().getMode() == DraggableToolbar.c.LIST) {
            PlacedItemsAdapter placedItemsAdapter = decorateFragment.f141780T;
            if (placedItemsAdapter != null) {
                placedItemsAdapter.m(decorateFragment.X2().H0());
                return;
            }
            return;
        }
        decorateFragment.C5();
        if (decorateFragment.W2().q0()) {
            decorateFragment.W2().i1();
        }
    }

    private final void A5(EraserCounts eraserCounts) {
        if (eraserCounts.getErasableCount() == 0) {
            W2().e1(false);
        } else if (eraserCounts.getErasedCount() == 0) {
            W2().g1();
        } else if (eraserCounts.getErasedCount() >= eraserCounts.getErasableCount()) {
            W2().h1();
        } else {
            W2().f1();
        }
    }

    /* access modifiers changed from: private */
    public final CatalogItemSource B2() {
        return I2().Z0().getValue() == Z.c.PRODUCT_RECOMMENDATIONS ? CatalogItemSource.GOES_WELL_WITH : CatalogItemSource.ADD;
    }

    /* access modifiers changed from: private */
    public static final C16807N B3(DecorateFragment decorateFragment, RF.k kVar, IDecorateEngine iDecorateEngine) {
        C17542s.j(kVar, "inst");
        C17542s.j(iDecorateEngine, "engine");
        ModelScreenTransform M22 = decorateFragment.M2(iDecorateEngine, kVar);
        decorateFragment.f141776P0 = M22;
        decorateFragment.W2().W0(true, M22.isValid() ? decorateFragment.f141776P0.getYawDegrees() : 0.0f, new C16920N(decorateFragment));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void B4(SceneLayout sceneLayout) {
        Iterable thumbnails = sceneLayout.getThumbnails();
        ArrayList arrayList = new ArrayList(C16877v.y(thumbnails, 10));
        int i10 = 0;
        for (Object next : thumbnails) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            RF.j a10 = RF.j.Companion.a(i10);
            arrayList.add(new MultiviewAdapter.a(a10, Uri.parse("file://" + ((String) next))));
            i10 = i11;
        }
        X2().Y1(arrayList);
        MultiviewAdapter multiviewAdapter = this.f141782X;
        if (multiviewAdapter != null) {
            multiviewAdapter.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    public final void B5() {
        PlacedItemsAdapter placedItemsAdapter = this.f141780T;
        if (placedItemsAdapter != null) {
            placedItemsAdapter.l(X2().v0());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getApplicationInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void C2() {
        /*
            r2 = this;
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L_0x000f
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            if (r0 == 0) goto L_0x000f
            int r0 = r0.flags
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0025
            androidx.fragment.app.t r0 = r2.getActivity()
            if (r0 == 0) goto L_0x0025
            com.sugarcube.decorate.v1.internal.v1.b r1 = r2.X2()
            RF.b r1 = r1.i0()
            com.sugarcube.decorate.v1.internal.v1.a.c(r0, r1)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.DecorateFragment.C2():void");
    }

    /* access modifiers changed from: private */
    public static final void C3(DecorateFragment decorateFragment, float f10) {
        float f11 = f10 * 0.017453292f;
        RF.k H02 = decorateFragment.X2().H0();
        if (H02 != null) {
            decorateFragment.y4(H02, f11);
        }
    }

    /* access modifiers changed from: private */
    public final void C5() {
        RF.k H02;
        ObjectInstanceId instanceParent;
        if (W2().getMode() != DraggableToolbar.c.ROTATE && (H02 = X2().H0()) != null) {
            IDecorateEngine K22 = K2();
            boolean z10 = false;
            if (!(K22 == null || (instanceParent = K22.getInstanceParent(H02.f())) == null || instanceParent.isWall())) {
                z10 = true;
            }
            W2().E0(H02.d(), z10);
        }
    }

    private final void D2() {
        IDecorateEngine K22;
        RF.k H02 = X2().H0();
        if (H02 != null && (K22 = K2()) != null) {
            F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new C17108d(H02, K22, this, (C17164e<? super C17108d>) null), 3, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N D3(DecorateFragment decorateFragment, RF.k kVar, IDecorateEngine iDecorateEngine) {
        C17542s.j(kVar, "instance");
        C17542s.j(iDecorateEngine, "engine");
        ModelScreenTransform modelScreenTransform = iDecorateEngine.getModelScreenTransform(kVar.f());
        ProductParentType n10 = i.n(iDecorateEngine, kVar.f());
        C16942a z02 = decorateFragment.X2().z0();
        if (z02 == null) {
            return null;
        }
        z02.L(kVar, decorateFragment.f141776P0, modelScreenTransform, true, n10, decorateFragment.X2().l0().getValue(), decorateFragment.X2().d0());
        return C16807N.f139792a;
    }

    public static /* synthetic */ void D4(DecorateFragment decorateFragment, RF.k kVar, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            decorateFragment.C4(kVar, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSelection");
    }

    /* access modifiers changed from: private */
    public final void D5() {
        float f10;
        String str;
        if (X2().l0().getValue() != DecorateViewMode.FocusMode) {
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                decimalFormat.setRoundingMode(RoundingMode.CEILING);
                String format = decimalFormat.format(Float.valueOf(X2().Z0()));
                C17542s.i(format, "format(...)");
                f10 = Float.parseFloat(format);
            } catch (Exception unused) {
                f10 = X2().Z0();
            }
            if (f10 == 2.0f) {
                str = getString(OE.n.f113348d3);
            } else if (f10 == 1.0f) {
                str = getString(OE.n.f113355e3);
            } else {
                int i10 = OE.n.f113490x5;
                String format2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f10)}, 1));
                C17542s.i(format2, "format(...)");
                str = getString(i10, format2);
            }
            C17542s.g(str);
            v2();
            C16481x xVar = this.f141777Q;
            C16481x xVar2 = null;
            if (xVar == null) {
                C17542s.z("binding");
                xVar = null;
            }
            if (xVar.f138508s.getRoot().getVisibility() != 0) {
                u5(true);
            }
            C16481x xVar3 = this.f141777Q;
            if (xVar3 == null) {
                C17542s.z("binding");
            } else {
                xVar2 = xVar3;
            }
            xVar2.f138508s.f138513c.setText(str);
            v4();
        }
    }

    private final void E2(RF.k kVar) {
        if (X2().l0().getValue() == DecorateViewMode.FocusMode) {
            C13291e.c(kVar, K2(), new C16922O());
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N E3(DecorateFragment decorateFragment, List list, IDecorateEngine iDecorateEngine, C5221y yVar) {
        C5215s a10;
        if (!(yVar == null || (a10 = C5222z.a(yVar)) == null)) {
            F0 unused = C16314k.d(a10, (C17168i) null, (QJ.T) null, new l(decorateFragment, list, iDecorateEngine, (C17164e<? super l>) null), 3, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void E4(DecorateFragment decorateFragment) {
        decorateFragment.W2().u0(true);
    }

    /* access modifiers changed from: private */
    public static final FlyCamOrbitParams F2(RF.k kVar, IDecorateEngine iDecorateEngine) {
        C17542s.j(kVar, "model");
        C17542s.j(iDecorateEngine, "engine");
        FlyCamOrbitParams flyCamOrbitParams = new FlyCamOrbitParams(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 63, (DefaultConstructorMarker) null);
        flyCamOrbitParams.elevationNorm = kVar.e();
        flyCamOrbitParams.radiusNorm = 0.2f;
        ObjectInstanceId instanceParent = iDecorateEngine.getInstanceParent(kVar.f());
        return instanceParent.isModel() ? iDecorateEngine.flyCamToPointOfInterest(instanceParent, flyCamOrbitParams) : iDecorateEngine.flyCamToPointOfInterest(kVar.f(), flyCamOrbitParams);
    }

    private final void F3() {
        androidx.activity.w onBackPressedDispatcher;
        IDecorateEngine K22 = K2();
        if (K22 != null) {
            C16481x xVar = this.f141777Q;
            if (xVar == null) {
                C17542s.z("binding");
                xVar = null;
            }
            Context context = xVar.getRoot().getContext();
            C17542s.i(context, "getContext(...)");
            this.f141778R = new C16936V0(context, X2(), K22, new q(this, K22));
        }
        e0.a(X2().Y0()).observe(getViewLifecycleOwner(), new a.C3467a(new C16962k(this)));
        X2().O0().observe(getViewLifecycleOwner(), new a.C3467a(new C16986w(this)));
        X2().g1().observe(getViewLifecycleOwner(), new a.C3467a(new C16898C(this)));
        X2().p1().observe(getViewLifecycleOwner(), new a.C3467a(new C16900D(this)));
        X2().q1().observe(getViewLifecycleOwner(), new a.C3467a(new C16902E(this)));
        I2().M0().observe(getViewLifecycleOwner(), new a.C3467a(new C16904F(this)));
        I2().Y0().observe(getViewLifecycleOwner(), new a.C3467a(new C16906G(this)));
        X2().k0().observe(getViewLifecycleOwner(), new a.C3467a(new C16908H(this)));
        C5191t activity = getActivity();
        if (!(activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null)) {
            androidx.activity.y.b(onBackPressedDispatcher, getViewLifecycleOwner(), false, new C16912J(this), 2, (Object) null);
        }
        D5();
        X2().t0().observe(getViewLifecycleOwner(), new a.C3467a(new C16914K(this)));
        e0.a(X2().S0()).observe(getViewLifecycleOwner(), new a.C3467a(new C16964l(this)));
        e0.a(X2().P0()).observe(getViewLifecycleOwner(), new a.C3467a(new C16968n(this)));
        e0.a(X2().x0()).observe(getViewLifecycleOwner(), new a.C3467a(new C16970o(this)));
        e0.a(X2().L0()).observe(getViewLifecycleOwner(), new a.C3467a(new C16972p(this)));
        e0.a(X2().e0()).observe(getViewLifecycleOwner(), new a.C3467a(new C16974q(this)));
        e0.a(X2().Q0()).observe(getViewLifecycleOwner(), new a.C3467a(new C16976r(this)));
        X2().j0().observe(getViewLifecycleOwner(), new a.C3467a(new C16978s(this)));
        I2().a1().observe(getViewLifecycleOwner(), new a.C3467a(new C16980t(this)));
        X2().R0().observe(getViewLifecycleOwner(), new a.C3467a(new C16982u(this)));
        X2().p0().observe(getViewLifecycleOwner(), new a.C3467a(new C16984v(this)));
        X2().T0().observe(getViewLifecycleOwner(), new a.C3467a(new C16990y(this)));
        X2().D0().observe(getViewLifecycleOwner(), new a.C3467a(new C16992z(this)));
        X2().q0().observe(getViewLifecycleOwner(), new a.C3467a(new C16894A(this)));
        X2().N0().observe(getViewLifecycleOwner(), new a.C3467a(new C16896B(this)));
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new p(this, C16534i.V(X2().y0()), (C17164e) null, this), 3, (Object) null);
    }

    private final void F4() {
        IDecorateEngine K22 = K2();
        RF.j a10 = RF.j.Companion.a(K22 != null ? K22.getLastFixedView() : 0);
        X2().O1(a10);
        MultiviewAdapter multiviewAdapter = this.f141782X;
        if (multiviewAdapter != null) {
            multiviewAdapter.k(a10.b());
        }
    }

    private final V1 G2() {
        return (V1) this.f141769M.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N G3(DecorateFragment decorateFragment, C16913J0 j02) {
        C17542s.g(j02);
        decorateFragment.u2(j02);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r6.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void G4(RF.k r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x000d
            com.sugarcube.app.base.data.database.CachedCatalogItem r0 = r6.d()
            if (r0 == 0) goto L_0x000d
            com.sugarcube.app.base.data.database.CachedCatalogPage r0 = r0.getSwappables()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002e
            com.sugarcube.app.base.data.database.CachedCatalogItem r0 = r6.d()
            com.sugarcube.app.base.data.database.CachedCatalogPage r0 = r0.getSwappables()
            if (r0 == 0) goto L_0x002c
            java.util.List r0 = r0.getPageItems()
            if (r0 == 0) goto L_0x002c
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 != r2) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r0 = r2
        L_0x002f:
            com.sugarcube.decorate.v1.internal.catalog.Z r3 = r5.I2()
            if (r6 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x0077
            com.sugarcube.app.base.data.database.CachedCatalogItem r6 = r6.d()
            r3.z0(r6)
            goto L_0x0077
        L_0x003f:
            androidx.lifecycle.F r6 = r3.Z0()
            java.lang.Object r6 = r6.getValue()
            com.sugarcube.decorate.v1.internal.catalog.Z$c r0 = com.sugarcube.decorate.v1.internal.catalog.Z.c.RESULTS
            if (r6 == r0) goto L_0x0077
            java.lang.String r6 = r3.H0()
            if (r6 == 0) goto L_0x0064
            androidx.lifecycle.F r0 = r3.Z0()
            java.lang.Object r0 = r0.getValue()
            com.sugarcube.decorate.v1.internal.catalog.Z$c r4 = com.sugarcube.decorate.v1.internal.catalog.Z.c.FILTER
            if (r0 != r4) goto L_0x005e
            r1 = r2
        L_0x005e:
            com.sugarcube.app.base.data.analytics.SearchType r0 = com.sugarcube.app.base.data.analytics.SearchType.TEXTBOX
            r3.w0(r6, r1, r0)
            goto L_0x0077
        L_0x0064:
            com.sugarcube.decorate.v1.internal.v1.b r6 = r5.X2()
            androidx.lifecycle.K r6 = r6.B0()
            java.lang.Object r6 = r6.getValue()
            com.sugarcube.core.network.models.RoomType r6 = (com.sugarcube.core.network.models.RoomType) r6
            if (r6 == 0) goto L_0x0077
            r3.v0(r6)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.DecorateFragment.G4(RF.k):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N H3(DecorateFragment decorateFragment, Boolean bool) {
        if (bool.booleanValue()) {
            decorateFragment.C2();
        }
        return C16807N.f139792a;
    }

    private final void H4() {
        if (X2().b1()) {
            Y4();
            return;
        }
        DecorateToolbarTooltipObject.a g10 = new DecorateToolbarTooltipObject.a().g(OE.n.f113230K2);
        androidx.lifecycle.r lifecycle = getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        DecorateToolbarTooltipObject.a d10 = g10.e(lifecycle).d(30);
        C16481x xVar = this.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        View findViewById = xVar.getRoot().findViewById(C16401b.f138081J0);
        C17542s.i(findViewById, "findViewById(...)");
        this.f141754B0 = d10.b(findViewById).h(new v()).a(getActivity(), U2().getLocale());
        new Handler(Looper.getMainLooper()).postDelayed(new C16963k0(this), 600);
    }

    /* access modifiers changed from: private */
    public final com.sugarcube.decorate.v1.internal.catalog.Z I2() {
        return (com.sugarcube.decorate.v1.internal.catalog.Z) this.f141775P.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N I3(DecorateFragment decorateFragment, Boolean bool) {
        ConstraintLayout O22 = decorateFragment.O2();
        C17542s.g(bool);
        JF.Z.x(O22, bool.booleanValue(), 0, 2, (Object) null);
        if (bool.booleanValue()) {
            decorateFragment.N2().b();
        } else {
            decorateFragment.N2().c();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void I4(DecorateFragment decorateFragment) {
        if (!decorateFragment.X2().b1() && !decorateFragment.J2().F()) {
            DecorateToolbarTooltipObject decorateToolbarTooltipObject = decorateFragment.f141754B0;
            if (decorateToolbarTooltipObject != null) {
                decorateToolbarTooltipObject.h();
            }
            decorateFragment.X2().d2();
        }
    }

    /* access modifiers changed from: private */
    public final DrawerLayout J2() {
        C16481x xVar = this.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        DrawerLayout drawerLayout = xVar.f138497h;
        C17542s.i(drawerLayout, "decorateLayoutContainer");
        return drawerLayout;
    }

    /* access modifiers changed from: private */
    public static final C16807N J3(DecorateFragment decorateFragment, Boolean bool) {
        if (bool.booleanValue()) {
            C15093r rVar = decorateFragment.f141784Z;
            if (rVar != null) {
                rVar.show();
            }
        } else {
            C15093r rVar2 = decorateFragment.f141784Z;
            if (rVar2 != null) {
                rVar2.hide();
            }
        }
        return C16807N.f139792a;
    }

    private final void J4() {
        C5191t activity = getActivity();
        if (activity != null) {
            String string = getString(OE.n.f113404l3);
            C17542s.i(string, "getString(...)");
            String string2 = getString(OE.n.f113453s3);
            String string3 = getString(OE.n.f113263Q);
            C17542s.i(string3, "getString(...)");
            XH.v a10 = C16796C.a(string3, new C16940Y(this));
            String string4 = getString(OE.n.f113351e);
            C17542s.i(string4, "getString(...)");
            C13084F.C(activity, string, (String) null, string2, (String) null, a10, C16796C.a(string4, new C16941Z()), false, 66, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N K3(DecorateFragment decorateFragment, Boolean bool) {
        decorateFragment.W2().v0(bool.booleanValue() && !decorateFragment.X2().v0().isEmpty());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K4(DecorateFragment decorateFragment, String str) {
        C17542s.j(str, "text");
        if (C15854t.v0(str)) {
            str = decorateFragment.getString(OE.n.f113453s3);
            C17542s.i(str, "getString(...)");
        }
        decorateFragment.X2().u2(str);
        return C16807N.f139792a;
    }

    private final TextView L2() {
        C16481x xVar = this.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        TextView textView = xVar.f138496g;
        C17542s.i(textView, "decorateHelpText");
        return textView;
    }

    /* access modifiers changed from: private */
    public static final C16807N L3(DecorateFragment decorateFragment, Boolean bool) {
        decorateFragment.A2();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L4() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M3(DecorateFragment decorateFragment, List list) {
        ArrayList arrayList;
        if (list != null) {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            for (Object next : list) {
                if (hashSet.add(Integer.valueOf(((CachedCatalogItem) next).getId()))) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        ItemVariantAdapter itemVariantAdapter = decorateFragment.f141781U;
        boolean z10 = true;
        boolean z11 = itemVariantAdapter != null && itemVariantAdapter.i(arrayList);
        if ((arrayList == null ? C16877v.n() : arrayList).size() <= 1) {
            z10 = false;
        }
        ItemVariantAdapter.a aVar = ItemVariantAdapter.a.COLOR;
        if (!z10) {
            decorateFragment.W2().j1(false, z11, new C16931T(decorateFragment, arrayList, aVar));
        } else {
            ItemVariantAdapter itemVariantAdapter2 = decorateFragment.f141781U;
            if (itemVariantAdapter2 != null) {
                itemVariantAdapter2.n(decorateFragment.X2().H0(), arrayList, aVar);
            }
            DraggableToolbar.k1(decorateFragment.W2(), true, z11, (C17631a) null, 4, (Object) null);
        }
        return C16807N.f139792a;
    }

    private final void M4(DecorateView.a aVar) {
        C5191t activity;
        if (this.f141760H0 == null && (activity = getActivity()) != null) {
            activity.runOnUiThread(new C16959i0(this, aVar));
        }
    }

    private final BouncingBallView N2() {
        C16481x xVar = this.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        BouncingBallView bouncingBallView = xVar.f138506q.f138510b;
        C17542s.i(bouncingBallView, "decorateWaitAnimation");
        return bouncingBallView;
    }

    /* access modifiers changed from: private */
    public static final C16807N N3(DecorateFragment decorateFragment, List list, ItemVariantAdapter.a aVar) {
        ItemVariantAdapter itemVariantAdapter = decorateFragment.f141781U;
        if (itemVariantAdapter != null) {
            itemVariantAdapter.n(decorateFragment.X2().H0(), list, aVar);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void N4(DecorateFragment decorateFragment, DecorateView.a aVar) {
        new Handler(Looper.getMainLooper()).postDelayed(new C16985v0(decorateFragment, aVar), 0);
    }

    private final ConstraintLayout O2() {
        C16481x xVar = this.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        ConstraintLayout b10 = xVar.f138506q.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    /* access modifiers changed from: private */
    public static final C16807N O3(DecorateFragment decorateFragment, C16903E0 e02) {
        ActionBar actionBar;
        ActionBar actionBar2;
        C16942a z02;
        C16942a z03;
        String str;
        List<MultiviewThumbnail> viewports;
        MultiviewThumbnail multiviewThumbnail;
        Log.i("DecorateFragment", "Decorate State: " + e02);
        int i10 = e02 == null ? -1 : C17107c.f141801a[e02.ordinal()];
        if (!(i10 == -1 || i10 == 1)) {
            if (i10 == 2) {
                CachedCompiledComposition H22 = decorateFragment.H2();
                if (H22 != null) {
                    String displayName = H22.getDisplayName();
                    if (displayName != null) {
                        C5191t activity = decorateFragment.getActivity();
                        if (!(activity == null || (actionBar2 = activity.getActionBar()) == null)) {
                            actionBar2.setTitle(displayName);
                        }
                    } else {
                        C5191t activity2 = decorateFragment.getActivity();
                        if (!(activity2 == null || (actionBar = activity2.getActionBar()) == null)) {
                            actionBar.setTitle(OE.n.f113453s3);
                        }
                    }
                }
            } else if (i10 == 3) {
                decorateFragment.q5();
                Scene Q22 = decorateFragment.Q2();
                if (!(Q22 == null || (z02 = decorateFragment.X2().z0()) == null)) {
                    z02.b0(Q22.isStock());
                    z02.c0(Q22.getName());
                    z02.b0(Q22.isStock());
                    z02.Y(decorateFragment.X2().i1());
                    z02.Z(decorateFragment.X2().A0());
                }
                C16942a z04 = decorateFragment.X2().z0();
                if (z04 != null) {
                    z04.o((System.nanoTime() - decorateFragment.f141771N.b()) / ((long) 1000000));
                }
            } else if (i10 != 4) {
                if (i10 == 5) {
                    decorateFragment.M4(new DecorateView.a(decorateFragment.getResources().getString(OE.n.f113432p3), true));
                } else {
                    throw new XH.t();
                }
            } else if (!decorateFragment.f141766K0) {
                return C16807N.f139792a;
            } else {
                decorateFragment.i3();
                IDecorateEngine K22 = decorateFragment.K2();
                if (K22 != null) {
                    Map<ObjectInstanceId, ModelInstanceDetails> instanceInfo = K22.getInstanceInfo();
                    if (instanceInfo != null) {
                        a.e(decorateFragment, instanceInfo);
                        a.b(decorateFragment, instanceInfo);
                    }
                    decorateFragment.A5(K22.getEngineEraserCounts());
                    int fixedViewCount = K22.getFixedViewCount();
                    ArrayList arrayList = new ArrayList(fixedViewCount);
                    for (int i11 = 0; i11 < fixedViewCount; i11++) {
                        Scene Q23 = decorateFragment.Q2();
                        Uri thumbnailUri = (Q23 == null || (viewports = Q23.getViewports()) == null || (multiviewThumbnail = (MultiviewThumbnail) C16877v.z0(viewports, i11)) == null) ? null : multiviewThumbnail.getThumbnailUri();
                        Uri m02 = decorateFragment.X2().m0();
                        RF.j a10 = RF.j.Companion.a(i11);
                        if (thumbnailUri == null) {
                            thumbnailUri = m02;
                        }
                        arrayList.add(new MultiviewAdapter.a(a10, thumbnailUri));
                    }
                    decorateFragment.X2().Y1(arrayList);
                }
                C16942a z05 = decorateFragment.X2().z0();
                if (z05 != null) {
                    z05.p();
                }
                if (!decorateFragment.X2().i1() && (z03 = decorateFragment.X2().z0()) != null) {
                    CachedCompiledComposition H23 = decorateFragment.H2();
                    if (H23 == null || (str = H23.getName()) == null) {
                        str = "";
                    }
                    z03.M(str);
                }
                decorateFragment.H4();
                decorateFragment.d5();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void O4(DecorateFragment decorateFragment, DecorateView.a aVar) {
        c cVar;
        C5191t activity = decorateFragment.getActivity();
        if (activity != null && !activity.isFinishing() && !decorateFragment.isRemoving() && aVar != null) {
            C5191t activity2 = decorateFragment.getActivity();
            if (activity2 != null) {
                String a10 = aVar.a();
                if (a10 == null) {
                    a10 = decorateFragment.getResources().getString(OE.n.f113272R2);
                    C17542s.i(a10, "getString(...)");
                }
                String str = a10;
                String string = decorateFragment.getResources().getString(OE.n.f113227K);
                C17542s.i(string, "getString(...)");
                cVar = C13084F.n(activity2, "", str, C16796C.a(string, new C16989x0(decorateFragment, aVar)), false, 8, (Object) null);
            } else {
                cVar = null;
            }
            decorateFragment.f141760H0 = cVar;
            if (cVar != null) {
                cVar.show();
            }
        }
    }

    /* access modifiers changed from: private */
    public final ProductParentType P2() {
        IDecorateEngine K22 = K2();
        if (K22 != null) {
            RF.k H02 = X2().H0();
            ProductParentType n10 = i.n(K22, H02 != null ? H02.f() : null);
            if (n10 != null) {
                return n10;
            }
        }
        return ProductParentType.None;
    }

    /* access modifiers changed from: private */
    public static final C16807N P3(DecorateFragment decorateFragment, androidx.activity.v vVar) {
        C17542s.j(vVar, "$this$addCallback");
        decorateFragment.q3();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P4(DecorateFragment decorateFragment, DecorateView.a aVar) {
        Dialog dialog = decorateFragment.f141760H0;
        if (dialog != null) {
            dialog.dismiss();
        }
        decorateFragment.f141760H0 = null;
        decorateFragment.X2().S1(aVar);
        if (aVar.b()) {
            C8951o a10 = androidx.navigation.fragment.a.a(decorateFragment);
            int g10 = C4.j.g(Kreativ.Decorate.Companion.serializer());
            if (C8951o.A(a10, a10.L(), g10, true, (x4.v) null, 4, (Object) null) != null) {
                a10.m0(g10, true, false);
            } else {
                throw new IllegalArgumentException(("Destination with route " + P.b(Kreativ.Decorate.class).f() + " cannot be found in navigation graph " + a10.L()).toString());
            }
        }
        return C16807N.f139792a;
    }

    private final Scene Q2() {
        return X2().E0();
    }

    /* access modifiers changed from: private */
    public static final C16807N Q3(DecorateFragment decorateFragment, List list) {
        C17542s.g(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C13291e.c((d0) it.next(), decorateFragment.K2(), new C16929S(decorateFragment));
        }
        b.G1(decorateFragment.X2(), C16877v.n(), false, false, false, 14, (Object) null);
        return C16807N.f139792a;
    }

    private final void Q4() {
        C5191t activity = getActivity();
        this.f141785y0 = activity != null ? C13084F.w(activity, U2().getLocale(), new w(this)) : null;
    }

    private final TextView R2(long j10) {
        TextView L22 = L2();
        L22.setOnTouchListener(new C16945b0(L22, this));
        JF.Z.l(L22, 0, (C17631a) null, 3, (Object) null);
        L22.postDelayed(new C16947c0(this), j10);
        return L22;
    }

    /* access modifiers changed from: private */
    public static final C16807N R3(DecorateFragment decorateFragment, d0 d0Var, IDecorateEngine iDecorateEngine) {
        C17542s.j(d0Var, "i");
        C17542s.j(iDecorateEngine, "engine");
        z3(decorateFragment, iDecorateEngine, d0Var.a(), (RF.k) null, (ItemVariantAdapter.a) null, d0Var.c(), d0Var.b(), (ModelScreenTransform) null, false, d0Var.d(), 204, (Object) null);
        return C16807N.f139792a;
    }

    private final void R4() {
        C5191t activity = getActivity();
        ExitDialog v10 = activity != null ? C13084F.v(activity, U2().getLocale(), new x(this)) : null;
        this.f141785y0 = v10;
        if (v10 != null) {
            v10.setOnCancelListener(new C16949d0(this));
        }
    }

    /* access modifiers changed from: private */
    public static final boolean S2(TextView textView, DecorateFragment decorateFragment, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 || motionEvent.getRawX() + ((float) textView.getPaddingLeft()) < ((float) (textView.getRight() - textView.getCompoundDrawables()[2].getBounds().width()))) {
            return false;
        }
        decorateFragment.g3();
        textView.performClick();
        return false;
    }

    /* access modifiers changed from: private */
    public static final C16807N S3(DecorateFragment decorateFragment, Boolean bool) {
        C16481x xVar = decorateFragment.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        ImageButton imageButton = xVar.f138493d;
        C17542s.i(imageButton, "decorateFlipBtn");
        C17542s.g(bool);
        JF.Z.x(imageButton, bool.booleanValue(), 0, 2, (Object) null);
        if (bool.booleanValue()) {
            decorateFragment.T4();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void S4(DecorateFragment decorateFragment, DialogInterface dialogInterface) {
        C16942a z02 = decorateFragment.X2().z0();
        if (z02 != null) {
            z02.w();
        }
    }

    /* access modifiers changed from: private */
    public static final void T2(DecorateFragment decorateFragment) {
        decorateFragment.g3();
    }

    /* access modifiers changed from: private */
    public static final C16807N T3(DecorateFragment decorateFragment, Boolean bool) {
        C16481x xVar = decorateFragment.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        ImageButton imageButton = xVar.f138499j;
        C17542s.i(imageButton, "decorateMirrorBtn");
        C17542s.g(bool);
        JF.Z.x(imageButton, bool.booleanValue(), 0, 2, (Object) null);
        if (bool.booleanValue()) {
            decorateFragment.a5();
        }
        return C16807N.f139792a;
    }

    private final void T4() {
        C5191t activity;
        if (!X2().f1() && (activity = getActivity()) != null) {
            activity.runOnUiThread(new C16943a0(this));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N U3(DecorateFragment decorateFragment, List list) {
        MultiviewAdapter multiviewAdapter = decorateFragment.f141782X;
        if (multiviewAdapter != null) {
            C17542s.g(list);
            multiviewAdapter.l(list);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void U4(DecorateFragment decorateFragment) {
        DecorateToolbarTooltipObject.a g10 = new DecorateToolbarTooltipObject.a().g(OE.n.f113320Z2);
        androidx.lifecycle.r lifecycle = decorateFragment.getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        DecorateToolbarTooltipObject.a e10 = g10.e(lifecycle);
        C16481x xVar = decorateFragment.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        View findViewById = xVar.getRoot().findViewById(C16401b.f138088N);
        C17542s.i(findViewById, "findViewById(...)");
        decorateFragment.f141756D0 = e10.b(findViewById).i(C17061d.RIGHT).a(decorateFragment.getActivity(), decorateFragment.U2().getLocale());
        new Handler(Looper.getMainLooper()).postDelayed(new C16961j0(decorateFragment), 300);
    }

    /* access modifiers changed from: private */
    public final LayoutThumbnailSpec V2() {
        Scene Q22 = Q2();
        return (Q22 == null || !Q22.isHela()) ? LayoutThumbnailSpec.View0BestThumbnail : LayoutThumbnailSpec.LastViewBestThumbnail;
    }

    /* access modifiers changed from: private */
    public static final C16807N V3(DecorateFragment decorateFragment, Boolean bool) {
        DraggableToolbar W22 = decorateFragment.W2();
        C17542s.g(bool);
        W22.l1(bool.booleanValue());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void V4(DecorateFragment decorateFragment) {
        DecorateToolbarTooltipObject decorateToolbarTooltipObject = decorateFragment.f141756D0;
        if (decorateToolbarTooltipObject != null) {
            decorateToolbarTooltipObject.h();
        }
        decorateFragment.X2().e2();
    }

    /* access modifiers changed from: private */
    public final DraggableToolbar W2() {
        C16481x xVar = this.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        DraggableToolbar draggableToolbar = xVar.f138503n;
        C17542s.i(draggableToolbar, "draggableToolbar");
        return draggableToolbar;
    }

    /* access modifiers changed from: private */
    public static final C16807N W3(DecorateFragment decorateFragment, RF.j jVar) {
        C13291e.c(jVar, decorateFragment.K2(), new C16955g0(decorateFragment));
        return C16807N.f139792a;
    }

    private final void W4() {
        C5191t activity = getActivity();
        ExitDialog u10 = activity != null ? C13084F.u(activity, U2().getLocale(), new y(this)) : null;
        this.f141753A0 = u10;
        if (u10 != null) {
            u10.setOnCancelListener(new C16937W());
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N X3(DecorateFragment decorateFragment, RF.j jVar, IDecorateEngine iDecorateEngine) {
        C17542s.j(jVar, "vp");
        C17542s.j(iDecorateEngine, "engine");
        if (decorateFragment.f141766K0) {
            iDecorateEngine.flyCamToFixedView(jVar.b());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void X4(DialogInterface dialogInterface) {
    }

    /* access modifiers changed from: private */
    public final void Y2(IDecorateEngine iDecorateEngine, CachedCatalogItem cachedCatalogItem, RF.k kVar, boolean z10, ModelScreenTransform modelScreenTransform, ItemVariantAdapter.a aVar, boolean z11, SceneLayout sceneLayout, boolean z12) {
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new C17109e(aVar, z12, this, cachedCatalogItem, sceneLayout, iDecorateEngine, kVar, z10, z11, modelScreenTransform, (C17164e<? super C17109e>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N Y3(DecorateFragment decorateFragment, Boolean bool) {
        C17542s.g(bool);
        decorateFragment.f5(bool.booleanValue());
        return C16807N.f139792a;
    }

    private final void Y4() {
        if (X2().b1() && X2().t1() && !X2().h1()) {
            DecorateToolbarTooltipObject.a d10 = new DecorateToolbarTooltipObject.a().g(OE.n.f113327a3).c(OE.n.f113278S2).k(OE.m.f113166a).f(0.25f).j(50).d(30);
            androidx.lifecycle.r lifecycle = getLifecycle();
            C17542s.i(lifecycle, "<get-lifecycle>(...)");
            DecorateToolbarTooltipObject.a e10 = d10.e(lifecycle);
            C16481x xVar = this.f141777Q;
            if (xVar == null) {
                C17542s.z("binding");
                xVar = null;
            }
            View findViewById = xVar.getRoot().findViewById(C16401b.f138085L0);
            C17542s.i(findViewById, "findViewById(...)");
            this.f141755C0 = e10.b(findViewById).a(getActivity(), U2().getLocale());
            new Handler(Looper.getMainLooper()).postDelayed(new C16939X(this), 300);
        }
    }

    /* access modifiers changed from: private */
    public final void Z2(RF.k kVar) {
        if (kVar == null) {
            X2().Y(MethodType.DoubleTap);
            return;
        }
        X2().X(MethodType.DoubleTap);
        E2(kVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N Z3(DecorateFragment decorateFragment, PanZoomRegion panZoomRegion) {
        decorateFragment.D5();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void Z4(DecorateFragment decorateFragment) {
        if (decorateFragment.W2().getMode() != DraggableToolbar.c.SCENE) {
            decorateFragment.Y4();
        } else if (!decorateFragment.J2().F()) {
            DecorateToolbarTooltipObject decorateToolbarTooltipObject = decorateFragment.f141755C0;
            if (decorateToolbarTooltipObject != null) {
                decorateToolbarTooltipObject.h();
            }
            decorateFragment.X2().f2();
        }
    }

    /* access modifiers changed from: private */
    public final void a3() {
        IDecorateEngine K22;
        if (X2().l0().getValue() == DecorateViewMode.FocusMode && (K22 = K2()) != null) {
            FlyCamOrbitParams flyCamOrbitParams = K22.getFlyCamOrbitParams();
            flyCamOrbitParams.radiusNorm -= 0.04f;
            K22.setFlyCamOrbitParams(flyCamOrbitParams);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N a4(DecorateFragment decorateFragment, Boolean bool) {
        decorateFragment.J2().setDrawerLockMode(bool.booleanValue() ? 2 : 0);
        return C16807N.f139792a;
    }

    private final void a5() {
        C5191t activity;
        if (!C17542s.e(X2().J0().getValue(), Boolean.FALSE) && (activity = getActivity()) != null) {
            activity.runOnUiThread(new C16951e0(this));
        }
    }

    /* access modifiers changed from: private */
    public final void b3() {
        IDecorateEngine K22;
        if (X2().l0().getValue() == DecorateViewMode.FocusMode && (K22 = K2()) != null) {
            FlyCamOrbitParams flyCamOrbitParams = K22.getFlyCamOrbitParams();
            flyCamOrbitParams.radiusNorm += 0.04f;
            K22.setFlyCamOrbitParams(flyCamOrbitParams);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N b4(DecorateFragment decorateFragment, Boolean bool) {
        if (bool.booleanValue()) {
            decorateFragment.l5();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void b5(DecorateFragment decorateFragment) {
        DecorateToolbarTooltipObject.a g10 = new DecorateToolbarTooltipObject.a().g(OE.n.f113362f3);
        androidx.lifecycle.r lifecycle = decorateFragment.getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        DecorateToolbarTooltipObject.a e10 = g10.e(lifecycle);
        C16481x xVar = decorateFragment.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        View findViewById = xVar.getRoot().findViewById(C16401b.f138098S);
        C17542s.i(findViewById, "findViewById(...)");
        decorateFragment.f141758F0 = e10.b(findViewById).i(C17061d.RIGHT).a(decorateFragment.getActivity(), decorateFragment.U2().getLocale());
        new Handler(Looper.getMainLooper()).postDelayed(new C16965l0(decorateFragment), 300);
    }

    /* access modifiers changed from: private */
    public final void c3(IDecorateEngine iDecorateEngine, CachedCatalogItem cachedCatalogItem, RF.k kVar, boolean z10, ModelScreenTransform modelScreenTransform, ItemVariantAdapter.a aVar, boolean z11, SceneLayout sceneLayout, boolean z12) {
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new C17110f(aVar, z12, this, cachedCatalogItem, sceneLayout, iDecorateEngine, kVar, z10, modelScreenTransform, z11, (C17164e<? super C17110f>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N c4(DecorateFragment decorateFragment, EraserCounts eraserCounts) {
        C17542s.g(eraserCounts);
        decorateFragment.A5(eraserCounts);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void c5(DecorateFragment decorateFragment) {
        DecorateToolbarTooltipObject decorateToolbarTooltipObject = decorateFragment.f141758F0;
        if (decorateToolbarTooltipObject != null) {
            decorateToolbarTooltipObject.h();
        }
        decorateFragment.X2().W1();
    }

    /* access modifiers changed from: private */
    public final void d3(C16932T0 t02) {
        IDecorateEngine K22;
        if (X2().l0().getValue() == DecorateViewMode.FocusMode && (K22 = K2()) != null) {
            FlyCamOrbitParams flyCamOrbitParams = K22.getFlyCamOrbitParams();
            int i10 = C17107c.f141803c[t02.ordinal()];
            if (i10 == 1) {
                flyCamOrbitParams.elevationNorm -= 0.01f;
            } else if (i10 == 2) {
                flyCamOrbitParams.elevationNorm += 0.01f;
            } else if (i10 == 3) {
                flyCamOrbitParams.rotationNorm += 0.01f;
            } else if (i10 == 4) {
                flyCamOrbitParams.rotationNorm -= 0.01f;
            } else {
                throw new XH.t();
            }
            K22.setFlyCamOrbitParams(flyCamOrbitParams);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d4(DecorateFragment decorateFragment, Integer num) {
        C5191t activity = decorateFragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C16924P(decorateFragment, num));
        }
        return C16807N.f139792a;
    }

    private final void d5() {
        C5191t activity = getActivity();
        C16481x xVar = null;
        MaterialButton materialButton = activity != null ? (MaterialButton) activity.findViewById(C16401b.f138089N0) : null;
        if (materialButton != null && materialButton.getVisibility() == 0 && !C17542s.e(X2().K0().getValue(), Boolean.FALSE)) {
            DecorateToolbarTooltipObject.a g10 = new DecorateToolbarTooltipObject.a().g(OE.n.f113242M2);
            androidx.lifecycle.r lifecycle = getLifecycle();
            C17542s.i(lifecycle, "<get-lifecycle>(...)");
            DecorateToolbarTooltipObject.a d10 = g10.e(lifecycle).c(OE.n.f113248N2).d(30);
            C16481x xVar2 = this.f141777Q;
            if (xVar2 == null) {
                C17542s.z("binding");
            } else {
                xVar = xVar2;
            }
            View findViewById = xVar.getRoot().findViewById(C16401b.f138089N0);
            C17542s.i(findViewById, "findViewById(...)");
            this.f141759G0 = d10.b(findViewById).a(getActivity(), U2().getLocale());
            new Handler(Looper.getMainLooper()).postDelayed(new C16979s0(this), 300);
        }
    }

    private final void e3(DecorateViewMode decorateViewMode) {
        int i10 = C17107c.f141805e[decorateViewMode.ordinal()];
        if (i10 == 1) {
            W2().s0(false);
            h5();
        } else if (i10 == 2) {
            W2().s0(true);
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public static final void e4(DecorateFragment decorateFragment, Integer num) {
        Resources resources = decorateFragment.getResources();
        C17542s.g(num);
        String string = resources.getString(num.intValue());
        C17542s.i(string, "getString(...)");
        n5(decorateFragment, string, 0, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void e5(DecorateFragment decorateFragment) {
        DecorateToolbarTooltipObject decorateToolbarTooltipObject = decorateFragment.f141759G0;
        if (decorateToolbarTooltipObject != null) {
            decorateToolbarTooltipObject.h();
        }
        decorateFragment.X2().X1();
    }

    private final boolean f3(CachedCatalogItem cachedCatalogItem) {
        LinkedList<RF.k> v02 = X2().v0();
        if (v02 != null && v02.isEmpty()) {
            return false;
        }
        for (RF.k d10 : v02) {
            if (d10.d().getId() == cachedCatalogItem.getId()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final C16807N f4(DecorateFragment decorateFragment, Boolean bool) {
        if (bool.booleanValue()) {
            q4(decorateFragment, false, 1, (Object) null);
        }
        return C16807N.f139792a;
    }

    private final void f5(boolean z10) {
        IDecorateEngine K22;
        SceneLayout saveSceneLayout;
        C16481x xVar = this.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        RecyclerView recyclerView = xVar.f138500k;
        recyclerView.measure(0, View.MeasureSpec.makeMeasureSpec(recyclerView.getMeasuredHeight(), Integer.MIN_VALUE));
        float measuredWidth = (float) recyclerView.getMeasuredWidth();
        if (!(!z10 || (K22 = K2()) == null || (saveSceneLayout = K22.saveSceneLayout(X2().F0(), LayoutThumbnailSpec.AllSmallThumbnails)) == null)) {
            B4(saveSceneLayout);
        }
        float f10 = z10 ? measuredWidth : 0.0f;
        if (z10) {
            measuredWidth = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(recyclerView, View.TRANSLATION_X, new float[]{f10, measuredWidth}).setDuration(300);
        C17542s.g(duration);
        duration.addListener(new z(recyclerView, this));
        duration.start();
    }

    private final C16807N g3() {
        C5191t activity = getActivity();
        if (activity == null) {
            return null;
        }
        activity.runOnUiThread(new C16952f(this));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g4(DecorateFragment decorateFragment, Boolean bool) {
        if (bool.booleanValue()) {
            Log.d(decorateFragment.getClass().getName(), "onViewCreated: exiting on exitEvent");
            C8951o a10 = androidx.navigation.fragment.a.a(decorateFragment);
            int g10 = C4.j.g(Kreativ.Decorate.Companion.serializer());
            if (C8951o.A(a10, a10.L(), g10, true, (x4.v) null, 4, (Object) null) != null) {
                a10.m0(g10, true, false);
            } else {
                throw new IllegalArgumentException(("Destination with route " + P.b(Kreativ.Decorate.class).f() + " cannot be found in navigation graph " + a10.L()).toString());
            }
        }
        return C16807N.f139792a;
    }

    private final void g5() {
        RF.k H02 = X2().H0();
        if (H02 != null) {
            this.f141783Y = true;
            J2().I(5);
            I2().c1(H02.d());
        }
    }

    /* access modifiers changed from: private */
    public static final void h3(DecorateFragment decorateFragment) {
        JF.Z.o(decorateFragment.L2(), 0, false, (C17631a) null, 7, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N h4(DecorateFragment decorateFragment, b.k kVar) {
        int i10 = kVar == null ? -1 : C17107c.f141802b[kVar.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                decorateFragment.J4();
            } else if (i10 == 2) {
                decorateFragment.Q4();
            } else if (i10 == 3) {
                decorateFragment.R4();
            } else if (i10 == 4) {
                decorateFragment.W4();
            } else {
                throw new XH.t();
            }
        }
        return C16807N.f139792a;
    }

    private final void h5() {
        C5191t activity;
        if (!X2().o1() && (activity = getActivity()) != null) {
            activity.runOnUiThread(new C16926Q(this));
        }
    }

    private final void i3() {
        C16481x xVar = this.f141777Q;
        C16481x xVar2 = null;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        SurfaceView surfaceView = xVar.f138502m;
        C17542s.i(surfaceView, "decorateSurfaceView");
        C16936V0 v02 = this.f141778R;
        if (v02 == null) {
            C17542s.z("touchControlScheme");
            v02 = null;
        }
        surfaceView.setOnTouchListener(v02);
        C16481x xVar3 = this.f141777Q;
        if (xVar3 == null) {
            C17542s.z("binding");
            xVar3 = null;
        }
        xVar3.f138491b.setOnClickListener(new C16967m0(this));
        C16481x xVar4 = this.f141777Q;
        if (xVar4 == null) {
            C17542s.z("binding");
            xVar4 = null;
        }
        xVar4.f138493d.setOnClickListener(new C16969n0(this));
        C16481x xVar5 = this.f141777Q;
        if (xVar5 == null) {
            C17542s.z("binding");
            xVar5 = null;
        }
        xVar5.f138499j.setOnClickListener(new C16971o0(this));
        C16481x xVar6 = this.f141777Q;
        if (xVar6 == null) {
            C17542s.z("binding");
            xVar6 = null;
        }
        xVar6.f138494e.setOnClickListener(new C16973p0(this));
        C16481x xVar7 = this.f141777Q;
        if (xVar7 == null) {
            C17542s.z("binding");
        } else {
            xVar2 = xVar7;
        }
        xVar2.f138501l.setOnClickListener(new C16977r0(this));
        J2().a(new C17111g(this));
    }

    private final void i4(List<Integer> list) {
        if (list != null) {
            this.f141783Y = true;
            g3();
            I2().A0(list);
            C17060c.f141229a.b();
            J2().I(5);
        }
    }

    /* access modifiers changed from: private */
    public static final void i5(DecorateFragment decorateFragment) {
        DecorateToolbarTooltipObject.a g10 = new DecorateToolbarTooltipObject.a().g(OE.n.f113390j3);
        androidx.lifecycle.r lifecycle = decorateFragment.getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        DecorateToolbarTooltipObject.a e10 = g10.e(lifecycle);
        C16481x xVar = decorateFragment.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        View findViewById = xVar.getRoot().findViewById(C16401b.f138102U);
        C17542s.i(findViewById, "findViewById(...)");
        decorateFragment.f141757E0 = e10.b(findViewById).j(-50).i(C17061d.RIGHT).a(decorateFragment.getActivity(), decorateFragment.U2().getLocale());
        new Handler(Looper.getMainLooper()).postDelayed(new C16981t0(decorateFragment), 300);
    }

    /* access modifiers changed from: private */
    public static final void j3(DecorateFragment decorateFragment, View view) {
        decorateFragment.q3();
    }

    private final void j4() {
        C16942a z02;
        this.f141783Y = true;
        g3();
        G4(X2().H0());
        C17060c.f141229a.b();
        J2().I(5);
        if (Q2() != null && (z02 = X2().z0()) != null) {
            z02.h();
        }
    }

    /* access modifiers changed from: private */
    public static final void j5(DecorateFragment decorateFragment) {
        DecorateToolbarTooltipObject decorateToolbarTooltipObject = decorateFragment.f141757E0;
        if (decorateToolbarTooltipObject != null) {
            decorateToolbarTooltipObject.h();
        }
        decorateFragment.X2().Z1();
    }

    /* access modifiers changed from: private */
    public static final void k3(DecorateFragment decorateFragment, View view) {
        RF.k H02 = decorateFragment.X2().H0();
        if (H02 != null) {
            decorateFragment.p5(H02);
        }
    }

    private final void k4(RF.k kVar) {
        if (kVar != null) {
            this.f141783Y = true;
            g3();
            I2().B0(kVar.d().getId());
            C17060c.f141229a.b();
            J2().I(5);
        }
    }

    /* access modifiers changed from: private */
    public final void k5(SmartaPlacementResult smartaPlacementResult) {
        String str;
        if (X2().U0() && smartaPlacementResult != null) {
            Long latency = smartaPlacementResult.getLatency();
            if (latency == null || (str = latency.toString()) == null) {
                str = "Exceeded";
            }
            String errorMessage = smartaPlacementResult.getErrorMessage();
            if (errorMessage == null) {
                errorMessage = "Unknown";
            }
            StringBuilder sb2 = new StringBuilder();
            String result = smartaPlacementResult.getResult();
            sb2.append("Smarta Placement Status: " + result + "\n");
            sb2.append("Request Latency: " + str + " ms");
            if (smartaPlacementResult.getError()) {
                sb2.append("\nFailure Reason: " + errorMessage);
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "toString(...)");
            n5(this, sb3, 0, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void l3(DecorateFragment decorateFragment, View view) {
        RF.k H02 = decorateFragment.X2().H0();
        if (H02 != null) {
            decorateFragment.p3(H02);
        }
    }

    /* access modifiers changed from: private */
    public final void l4(RF.k kVar) {
        synchronized (X2().v0()) {
            try {
                if (C17542s.e(kVar, X2().H0())) {
                    X2().c2((RF.k) null);
                }
                PlacedItemsAdapter placedItemsAdapter = this.f141780T;
                if (placedItemsAdapter != null) {
                    placedItemsAdapter.k(kVar);
                }
                X2().w0().remove(kVar.f());
                X2().v0().removeIf(new C16918M(new C16916L(kVar)));
                X2().I1(kVar);
                IDecorateEngine K22 = K2();
                if (K22 != null) {
                    K22.removeModelInstance(kVar.f());
                }
                b.b2(X2(), false, 1, (Object) null);
                I2().q0();
                I2().r0();
                X2().E1();
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final b l5() {
        b X22 = X2();
        X22.h2();
        C5191t activity = getActivity();
        FeedbackDialog feedbackDialog = null;
        if (activity != null) {
            Locale locale = X22.W0().getLocale();
            feedbackDialog = C13084F.H(activity, locale, new A(X22, this), 0, new a.b(W2().getMeasuredWidth(), 0, 2, (DefaultConstructorMarker) null), 4, (Object) null);
        }
        this.f141786z0 = feedbackDialog;
        return X22;
    }

    /* access modifiers changed from: private */
    public static final void m3(DecorateFragment decorateFragment, View view) {
        decorateFragment.X2().X(MethodType.Button);
        decorateFragment.E2(decorateFragment.X2().H0());
    }

    /* access modifiers changed from: private */
    public static final boolean m4(RF.k kVar, RF.k kVar2) {
        C17542s.j(kVar2, "mii");
        return kVar2 == kVar;
    }

    private final C16807N m5(String str, long j10) {
        C5191t activity = getActivity();
        if (activity == null) {
            return null;
        }
        activity.runOnUiThread(new C16958i(this, j10, str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void n3(DecorateFragment decorateFragment, View view) {
        decorateFragment.X2().Y(MethodType.Button);
    }

    /* access modifiers changed from: private */
    public static final boolean n4(C17642l lVar, Object obj) {
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    static /* synthetic */ C16807N n5(DecorateFragment decorateFragment, String str, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                j10 = 3500;
            }
            return decorateFragment.m5(str, j10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showStatusText");
    }

    private final void o3() {
        if (this.f141766K0) {
            X2().i2(this);
        }
    }

    /* access modifiers changed from: private */
    public static final void o5(DecorateFragment decorateFragment, long j10, String str) {
        decorateFragment.R2(j10).setText(str);
    }

    private final void p3(RF.k kVar) {
        IDecorateEngine K22 = K2();
        ModelScreenTransform modelScreenTransform = K22 != null ? K22.getModelScreenTransform(kVar.f()) : null;
        ModelScreenTransform modelScreenTransform2 = new ModelScreenTransform();
        modelScreenTransform2.isModelMirrored = Boolean.valueOf(!(modelScreenTransform != null ? C17542s.e(modelScreenTransform.isModelMirrored, Boolean.TRUE) : false));
        IDecorateEngine K23 = K2();
        if (K23 != null) {
            K23.moveModelInstance(kVar.f(), modelScreenTransform2);
        }
        C16942a z02 = X2().z0();
        if (z02 != null) {
            z02.K(kVar.d(), X2().d0());
        }
        b.b2(X2(), false, 1, (Object) null);
    }

    private final void p4(boolean z10) {
        C16936V0 v02 = this.f141778R;
        if (v02 == null) {
            C17542s.z("touchControlScheme");
            v02 = null;
        }
        v02.n();
        D4(this, (RF.k) null, false, 2, (Object) null);
        W2().v0(false);
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new r(z10, this, (C17164e<? super r>) null), 3, (Object) null);
    }

    private final void p5(RF.k kVar) {
        IDecorateEngine K22 = K2();
        ModelScreenTransform modelScreenTransform = K22 != null ? K22.getModelScreenTransform(kVar.f()) : null;
        ModelScreenTransform modelScreenTransform2 = new ModelScreenTransform();
        modelScreenTransform2.isModelRolled90 = Boolean.valueOf(!(modelScreenTransform != null ? C17542s.e(modelScreenTransform.isModelRolled90, Boolean.TRUE) : false));
        IDecorateEngine K23 = K2();
        if (K23 != null) {
            K23.moveModelInstance(kVar.f(), modelScreenTransform2);
        }
        C16942a z02 = X2().z0();
        if (z02 != null) {
            z02.y(kVar.d(), X2().d0());
        }
        b.b2(X2(), false, 1, (Object) null);
    }

    private final void q3() {
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new C17112h(this, (C17164e<? super C17112h>) null), 3, (Object) null);
    }

    static /* synthetic */ void q4(DecorateFragment decorateFragment, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            decorateFragment.p4(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: save");
    }

    private final void q5() {
        SceneLayout sceneLayout;
        androidx.lifecycle.F<XH.v<DecorateEngine.RunState, DecorateEngine.DrawState>> d10;
        ActionBar actionBar;
        ActionBar actionBar2;
        if (X2().u0() == null && X2().r0() == null) {
            Log.e("DecorateFragment", "startDecorateView() called when viewModel manifest and glbPath are both  null - this is puzzling and wrong.");
            return;
        }
        Uri r02 = X2().r0();
        String uri = r02 != null ? r02.toString() : null;
        Manifest u02 = X2().u0();
        DecorateEngineManifest z10 = u02 != null ? i.z(u02) : null;
        CachedCompiledComposition H22 = H2();
        if (H22 != null) {
            String displayName = H22.getDisplayName();
            if (displayName != null) {
                C5191t activity = getActivity();
                if (!(activity == null || (actionBar2 = activity.getActionBar()) == null)) {
                    actionBar2.setTitle(displayName);
                }
            } else {
                C5191t activity2 = getActivity();
                if (!(activity2 == null || (actionBar = activity2.getActionBar()) == null)) {
                    actionBar.setTitle(OE.n.f113453s3);
                }
            }
            SceneLayout D10 = i.D(H22);
            B4(D10);
            sceneLayout = D10;
        } else {
            sceneLayout = null;
        }
        int color = getResources().getColor(R.color.decorate_background, (Resources.Theme) null);
        DecorateView decorateView = this.f141779S;
        if (decorateView != null) {
            decorateView.e(color, uri, z10, sceneLayout, X2().d1(), X2().k1(), X2().m1(), X2().j1(), X2().l1(), X2().n1(), X2().s0().b());
        }
        DecorateView decorateView2 = this.f141779S;
        if (!(decorateView2 == null || (d10 = decorateView2.d()) == null)) {
            d10.observe(getViewLifecycleOwner(), new a.C3467a(new C16983u0(this)));
        }
        F4();
        B5();
    }

    private final RF.k r2(IDecorateEngine iDecorateEngine, CachedCatalogItem cachedCatalogItem, ObjectInstanceId objectInstanceId, RF.k kVar, boolean z10, SmartaPlacement smartaPlacement) {
        RF.k z52 = z5(this, cachedCatalogItem, iDecorateEngine.addModelInstance(cachedCatalogItem, z10, objectInstanceId, new ModelScreenTransform(), smartaPlacement), kVar, z10, false, 16, (Object) null);
        b.b2(X2(), false, 1, (Object) null);
        return z52;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r3() {
        /*
            r10 = this;
            boolean r0 = r10.f141768L0
            r1 = 0
            if (r0 == 0) goto L_0x0019
            com.sugarcube.decorate.v1.internal.v1.b r0 = r10.X2()
            java.util.UUID r0 = r0.h0()
            if (r0 == 0) goto L_0x0019
            com.sugarcube.decorate.v1.internal.v1.b r0 = r10.X2()
            java.util.UUID r0 = r0.h0()
        L_0x0017:
            r5 = r0
            goto L_0x0029
        L_0x0019:
            com.sugarcube.decorate.internal.navigation.V1 r0 = r10.G2()
            java.lang.String r0 = r0.b()
            if (r0 == 0) goto L_0x0028
            java.util.UUID r0 = cF.C14046h.e(r0)
            goto L_0x0017
        L_0x0028:
            r5 = r1
        L_0x0029:
            boolean r0 = r10.f141768L0
            r9 = 0
            if (r0 == 0) goto L_0x003a
            com.sugarcube.decorate.v1.internal.v1.b r0 = r10.X2()
            java.util.UUID r0 = r0.h0()
            if (r0 == 0) goto L_0x003a
            r7 = r9
            goto L_0x0043
        L_0x003a:
            com.sugarcube.decorate.internal.navigation.V1 r0 = r10.G2()
            boolean r0 = r0.e()
            r7 = r0
        L_0x0043:
            com.sugarcube.decorate.v1.internal.v1.b r2 = r10.X2()
            com.sugarcube.decorate.internal.navigation.V1 r0 = r10.G2()
            java.lang.String r0 = r0.f()
            java.util.UUID r0 = cF.C14046h.e(r0)
            if (r0 != 0) goto L_0x0059
            java.util.UUID r0 = java.util.UUID.randomUUID()
        L_0x0059:
            r3 = r0
            kotlin.jvm.internal.C17542s.g(r3)
            com.sugarcube.decorate.internal.navigation.V1 r0 = r10.G2()
            int r4 = r0.d()
            android.content.res.Resources r6 = r10.getResources()
            java.lang.String r0 = "getResources(...)"
            kotlin.jvm.internal.C17542s.i(r6, r0)
            com.sugarcube.decorate.internal.navigation.V1 r0 = r10.G2()
            java.util.List r8 = r0.c()
            r2.u1(r3, r4, r5, r6, r7, r8)
            com.sugarcube.decorate.v1.internal.catalog.Z r0 = r10.I2()
            com.sugarcube.decorate.v1.internal.v1.b r2 = r10.X2()
            ZF.a r2 = r2.z0()
            r0.o1(r2)
            com.sugarcube.decorate.v1.internal.v1.DecorateFragment$b r0 = r10.f141771N
            long r2 = java.lang.System.nanoTime()
            r0.d(r2)
            androidx.fragment.app.t r0 = r10.getActivity()
            if (r0 == 0) goto L_0x009e
            java.lang.String r2 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r2)
            goto L_0x009f
        L_0x009e:
            r0 = r1
        L_0x009f:
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            r10.f141767L = r0
            TF.x r0 = r10.f141777Q
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x00ad
            kotlin.jvm.internal.C17542s.z(r2)
            r0 = r1
        L_0x00ad:
            TF.z r0 = r0.f138508s
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.getRoot()
            r0.setVisibility(r9)
            r10.F3()
            com.sugarcube.decorate.v1.internal.v1.b r0 = r10.X2()
            androidx.lifecycle.F r0 = r0.o0()
            androidx.lifecycle.y r3 = r10.getViewLifecycleOwner()
            ZF.I r4 = new ZF.I
            r4.<init>(r10)
            com.sugarcube.decorate.v1.internal.v1.a$a r5 = new com.sugarcube.decorate.v1.internal.v1.a$a
            r5.<init>(r4)
            r0.observe(r3, r5)
            androidx.drawerlayout.widget.DrawerLayout r0 = r10.J2()
            r3 = 1
            r0.setDrawerLockMode(r3)
            com.sugarcube.decorate.v1.internal.v1.adapters.PlacedItemsAdapter r0 = new com.sugarcube.decorate.v1.internal.v1.adapters.PlacedItemsAdapter
            com.sugarcube.decorate.v1.internal.v1.b r3 = r10.X2()
            OE.q r3 = r3.W0()
            com.squareup.picasso.t r3 = r3.c()
            com.sugarcube.decorate.v1.internal.v1.DecorateFragment$i r4 = new com.sugarcube.decorate.v1.internal.v1.DecorateFragment$i
            r4.<init>(r10)
            r0.<init>(r3, r4)
            r10.f141780T = r0
            com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter r0 = new com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter
            com.sugarcube.decorate.v1.internal.v1.b r3 = r10.X2()
            OE.q r3 = r3.W0()
            com.squareup.picasso.t r3 = r3.c()
            ZF.U r4 = new ZF.U
            r4.<init>(r10)
            r0.<init>(r3, r4)
            r10.f141781U = r0
            com.sugarcube.decorate.v1.internal.v1.adapters.MultiviewAdapter r0 = new com.sugarcube.decorate.v1.internal.v1.adapters.MultiviewAdapter
            com.sugarcube.decorate.v1.internal.v1.b r3 = r10.X2()
            OE.q r3 = r3.W0()
            com.squareup.picasso.t r3 = r3.c()
            ZF.f0 r4 = new ZF.f0
            r4.<init>(r10)
            r0.<init>(r3, r4)
            r10.f141782X = r0
            com.sugarcube.decorate.v1.internal.v1.toolbar.DraggableToolbar r0 = r10.W2()
            r0.setListener(r10)
            com.sugarcube.decorate.v1.internal.v1.adapters.PlacedItemsAdapter r3 = r10.f141780T
            r0.setItemListAdapter(r3)
            com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter r3 = r10.f141781U
            r0.setItemVariantListAdapter(r3)
            TF.x r0 = r10.f141777Q
            if (r0 != 0) goto L_0x013b
            kotlin.jvm.internal.C17542s.z(r2)
            goto L_0x013c
        L_0x013b:
            r1 = r0
        L_0x013c:
            androidx.recyclerview.widget.RecyclerView r0 = r1.f138500k
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.sugarcube.decorate.v1.internal.v1.adapters.MultiviewAdapter r1 = r10.f141782X
            r0.setAdapter(r1)
            r10.g3()
            tF.r$a r0 = new tF.r$a
            r0.<init>()
            int r1 = OE.n.f113411m3
            tF.r$a r0 = r0.b(r1)
            androidx.fragment.app.t r1 = r10.requireActivity()
            java.lang.String r2 = "requireActivity(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)
            tF.r r0 = r0.a(r1)
            r10.f141784Z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.DecorateFragment.r3():void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01f1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r4(dI.C17164e<? super XH.C16807N> r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof com.sugarcube.decorate.v1.internal.v1.DecorateFragment.s
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.decorate.v1.internal.v1.DecorateFragment$s r2 = (com.sugarcube.decorate.v1.internal.v1.DecorateFragment.s) r2
            int r3 = r2.f141890n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f141890n = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.decorate.v1.internal.v1.DecorateFragment$s r2 = new com.sugarcube.decorate.v1.internal.v1.DecorateFragment$s
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f141888l
            java.lang.Object r9 = eI.C17187b.f()
            int r4 = r2.f141890n
            r10 = 3
            r11 = 2
            r13 = 1
            if (r4 == 0) goto L_0x00ae
            if (r4 == r13) goto L_0x0083
            if (r4 == r11) goto L_0x005c
            if (r4 != r10) goto L_0x0054
            java.lang.Object r1 = r2.f141886j
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r2.f141885i
            ZF.a r1 = (ZF.C16942a) r1
            java.lang.Object r1 = r2.f141884h
            com.sugarcube.decorate_engine.SceneLayout r1 = (com.sugarcube.decorate_engine.SceneLayout) r1
            java.lang.Object r1 = r2.f141883g
            com.sugarcube.decorate_engine.SceneLayout r1 = (com.sugarcube.decorate_engine.SceneLayout) r1
            java.lang.Object r1 = r2.f141882f
            com.sugarcube.decorate_engine.SceneLayout r1 = (com.sugarcube.decorate_engine.SceneLayout) r1
            java.lang.Object r1 = r2.f141881e
            com.sugarcube.decorate.internal.shared.IDecorateEngine r1 = (com.sugarcube.decorate.internal.shared.IDecorateEngine) r1
            java.lang.Object r1 = r2.f141880d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f141879c
            com.sugarcube.decorate.v1.internal.v1.DecorateFragment r1 = (com.sugarcube.decorate.v1.internal.v1.DecorateFragment) r1
            XH.y.b(r3)
            goto L_0x01f2
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005c:
            int r1 = r2.f141887k
            java.lang.Object r4 = r2.f141886j
            java.util.UUID r4 = (java.util.UUID) r4
            java.lang.Object r5 = r2.f141885i
            ZF.a r5 = (ZF.C16942a) r5
            java.lang.Object r6 = r2.f141884h
            com.sugarcube.decorate_engine.SceneLayout r6 = (com.sugarcube.decorate_engine.SceneLayout) r6
            java.lang.Object r7 = r2.f141883g
            com.sugarcube.decorate_engine.SceneLayout r7 = (com.sugarcube.decorate_engine.SceneLayout) r7
            java.lang.Object r8 = r2.f141882f
            com.sugarcube.decorate_engine.SceneLayout r8 = (com.sugarcube.decorate_engine.SceneLayout) r8
            java.lang.Object r11 = r2.f141881e
            com.sugarcube.decorate.internal.shared.IDecorateEngine r11 = (com.sugarcube.decorate.internal.shared.IDecorateEngine) r11
            java.lang.Object r13 = r2.f141880d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r2.f141879c
            com.sugarcube.decorate.v1.internal.v1.DecorateFragment r14 = (com.sugarcube.decorate.v1.internal.v1.DecorateFragment) r14
            XH.y.b(r3)
            goto L_0x01cc
        L_0x0083:
            int r1 = r2.f141887k
            java.lang.Object r4 = r2.f141886j
            java.util.UUID r4 = (java.util.UUID) r4
            java.lang.Object r5 = r2.f141885i
            com.sugarcube.app.base.data.database.CachedCompiledComposition r5 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r5
            java.lang.Object r5 = r2.f141884h
            com.sugarcube.decorate_engine.SceneLayout r5 = (com.sugarcube.decorate_engine.SceneLayout) r5
            java.lang.Object r6 = r2.f141883g
            com.sugarcube.decorate_engine.SceneLayout r6 = (com.sugarcube.decorate_engine.SceneLayout) r6
            java.lang.Object r7 = r2.f141882f
            com.sugarcube.decorate_engine.SceneLayout r7 = (com.sugarcube.decorate_engine.SceneLayout) r7
            java.lang.Object r8 = r2.f141881e
            com.sugarcube.decorate.internal.shared.IDecorateEngine r8 = (com.sugarcube.decorate.internal.shared.IDecorateEngine) r8
            java.lang.Object r14 = r2.f141880d
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r2.f141879c
            com.sugarcube.decorate.v1.internal.v1.DecorateFragment r15 = (com.sugarcube.decorate.v1.internal.v1.DecorateFragment) r15
            XH.y.b(r3)
            r3 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            goto L_0x0114
        L_0x00ae:
            XH.y.b(r3)
            com.sugarcube.decorate.internal.shared.IDecorateEngine r14 = r19.K2()
            if (r14 == 0) goto L_0x0203
            com.sugarcube.decorate.v1.internal.v1.b r3 = r19.X2()
            com.sugarcube.decorate_engine.SceneLayoutFormat r3 = r3.F0()
            com.sugarcube.decorate_engine.LayoutThumbnailSpec r4 = r19.V2()
            com.sugarcube.decorate_engine.SceneLayout r15 = r14.saveSceneLayout(r3, r4)
            if (r15 == 0) goto L_0x0203
            com.sugarcube.decorate.v1.internal.v1.b r3 = r19.X2()
            com.sugarcube.app.base.data.database.CachedCompiledComposition r3 = r3.f0()
            if (r3 == 0) goto L_0x00d9
            java.util.UUID r4 = r3.getCompositionUuid()
            r8 = r4
            goto L_0x00da
        L_0x00d9:
            r8 = 0
        L_0x00da:
            com.sugarcube.decorate.v1.internal.v1.b r4 = r19.X2()
            r2.f141879c = r0
            r2.f141880d = r1
            r2.f141881e = r14
            r2.f141882f = r15
            r2.f141883g = r15
            r2.f141884h = r15
            r2.f141885i = r3
            r2.f141886j = r8
            r7 = 0
            r2.f141887k = r7
            r2.f141890n = r13
            r5 = 0
            r16 = 2
            r17 = 0
            r3 = r4
            r4 = r15
            r6 = r2
            r18 = r7
            r7 = r16
            r16 = r8
            r8 = r17
            java.lang.Object r3 = com.sugarcube.decorate.v1.internal.v1.b.r2(r3, r4, r5, r6, r7, r8)
            if (r3 != r9) goto L_0x010a
            return r9
        L_0x010a:
            r3 = r14
            r6 = r15
            r7 = r6
            r8 = r7
            r4 = r16
            r15 = r0
            r14 = r1
            r1 = r18
        L_0x0114:
            com.sugarcube.app.base.data.database.CachedCompiledComposition r5 = r15.H2()
            if (r5 == 0) goto L_0x0175
            java.util.UUID r5 = r5.getCompositionUuid()
            if (r5 == 0) goto L_0x0175
            com.sugarcube.decorate.v1.internal.v1.b r16 = r15.X2()
            ZF.a r16 = r16.z0()
            if (r16 == 0) goto L_0x0131
            java.util.UUID r16 = r16.a()
            r10 = r16
            goto L_0x0132
        L_0x0131:
            r10 = 0
        L_0x0132:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            java.lang.String r11 = "  "
            r12.append(r11)
            r12.append(r5)
            r12.append(r11)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            java.lang.String r11 = "Sugarcube"
            android.util.Log.d(r11, r10)
            com.sugarcube.decorate.v1.internal.v1.b r10 = r15.X2()
            ZF.a r10 = r10.z0()
            if (r10 == 0) goto L_0x015e
            r10.X(r5)
        L_0x015e:
            com.sugarcube.decorate.v1.internal.v1.b r10 = r15.X2()
            r10.P1(r5)
            r15.B4(r6)
            com.sugarcube.decorate.internal.shared.IDecorateEngine r5 = r15.K2()
            if (r5 == 0) goto L_0x0175
            com.sugarcube.decorate.v1.internal.v1.b r10 = r15.X2()
            r10.s2(r5)
        L_0x0175:
            com.sugarcube.decorate.v1.internal.v1.b r5 = r15.X2()
            ZF.a r5 = r5.z0()
            if (r5 == 0) goto L_0x0190
            com.sugarcube.app.base.data.database.CachedCompiledComposition r10 = r15.H2()
            if (r10 == 0) goto L_0x018b
            java.lang.String r10 = r10.getName()
            if (r10 != 0) goto L_0x018d
        L_0x018b:
            java.lang.String r10 = ""
        L_0x018d:
            r5.Q(r10)
        L_0x0190:
            com.sugarcube.decorate.v1.internal.v1.b r10 = r15.X2()
            androidx.lifecycle.K r10 = r10.C0()
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r13)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r11)
            if (r10 == 0) goto L_0x01f5
            com.sugarcube.app.base.ui.gallery.h$b r10 = com.sugarcube.app.base.ui.gallery.h.b.f124418e
            com.sugarcube.app.base.ui.gallery.a.b(r10)
            r2.f141879c = r15
            r2.f141880d = r14
            r2.f141881e = r3
            r2.f141882f = r8
            r2.f141883g = r7
            r2.f141884h = r6
            r2.f141885i = r5
            r2.f141886j = r4
            r2.f141887k = r1
            r10 = 2
            r2.f141890n = r10
            r10 = 1200(0x4b0, double:5.93E-321)
            java.lang.Object r10 = QJ.C16297b0.b(r10, r2)
            if (r10 != r9) goto L_0x01c9
            return r9
        L_0x01c9:
            r11 = r3
            r13 = r14
            r14 = r15
        L_0x01cc:
            QJ.P0 r3 = QJ.C16311i0.c()
            com.sugarcube.decorate.v1.internal.v1.DecorateFragment$t r10 = new com.sugarcube.decorate.v1.internal.v1.DecorateFragment$t
            r12 = 0
            r10.<init>(r14, r12)
            r2.f141879c = r14
            r2.f141880d = r13
            r2.f141881e = r11
            r2.f141882f = r8
            r2.f141883g = r7
            r2.f141884h = r6
            r2.f141885i = r5
            r2.f141886j = r4
            r2.f141887k = r1
            r1 = 3
            r2.f141890n = r1
            java.lang.Object r3 = QJ.C16310i.g(r3, r10, r2)
            if (r3 != r9) goto L_0x01f2
            return r9
        L_0x01f2:
            XH.N r3 = (XH.C16807N) r3
            goto L_0x0203
        L_0x01f5:
            androidx.fragment.app.t r1 = r15.getActivity()
            if (r1 == 0) goto L_0x0203
            ZF.V r2 = new ZF.V
            r2.<init>(r15)
            r1.runOnUiThread(r2)
        L_0x0203:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.DecorateFragment.r4(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final C16807N r5(DecorateFragment decorateFragment, XH.v vVar) {
        Set<RoomPolygonType> roomPolygonTypeSet;
        DecorateEngine.RunState runState = (DecorateEngine.RunState) vVar.c();
        DecorateEngine.DrawState drawState = (DecorateEngine.DrawState) vVar.d();
        Log.i("DecorateFragment", "rendererLifecycle: " + runState + " " + drawState + "}");
        int i10 = C17107c.f141804d[runState.ordinal()];
        if (i10 == 1) {
            decorateFragment.f141766K0 = false;
        } else if (i10 != 2) {
            if (i10 == 3) {
                decorateFragment.X2().V1();
                C9140b bVar = new C9140b(decorateFragment.requireActivity(), R.style.AlertDialogTheme);
                bVar.J(OE.n.f113284T2);
                bVar.x(OE.n.f113432p3);
                bVar.B(OE.n.f113227K, new C16987w0(decorateFragment));
                bVar.create().show();
            }
        } else if (drawState == DecorateEngine.DrawState.Drawing) {
            PanZoomRegion value = decorateFragment.X2().j0().getValue();
            if (value != null) {
                C16936V0 v02 = decorateFragment.f141778R;
                if (v02 == null) {
                    C17542s.z("touchControlScheme");
                    v02 = null;
                }
                v02.q(value);
            }
            if (!decorateFragment.f141766K0) {
                decorateFragment.f141766K0 = true;
                decorateFragment.X2().M1();
                IDecorateEngine K22 = decorateFragment.K2();
                if (K22 == null || (roomPolygonTypeSet = K22.getRoomPolygonTypeSet()) == null || !roomPolygonTypeSet.contains(RoomPolygonType.Wall)) {
                    Log.i("TODO", "this room has no walls. don't allow wall-only catalog items.");
                }
                decorateFragment.o3();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final RF.k s2(IDecorateEngine iDecorateEngine, CachedCatalogItem cachedCatalogItem, RF.k kVar, RF.k kVar2, boolean z10, boolean z11, SmartaPlacement smartaPlacement) {
        ObjectInstanceId kNone;
        RF.k kVar3 = kVar;
        boolean z12 = z10;
        boolean z13 = !f3(cachedCatalogItem);
        RF.k kVar4 = kVar2 == null ? kVar3 : kVar2;
        if (kVar4 == null || (kNone = kVar4.f()) == null) {
            kNone = ObjectInstanceId.Companion.getKNone();
        }
        RF.k r22 = r2(iDecorateEngine, cachedCatalogItem, kNone, kVar2, z10, smartaPlacement);
        if (!z12) {
            long nanoTime = (System.nanoTime() - this.f141771N.a()) / ((long) 1000000);
            C16942a z02 = X2().z0();
            if (z02 != null) {
                z02.z(r22, nanoTime, z13, false, X2().d0());
            }
            if (kVar3 != null) {
                X2().I1(kVar3);
            }
        } else {
            X2().U(r22);
        }
        if (z11) {
            C4(r22, z12);
        }
        return r22;
    }

    /* access modifiers changed from: private */
    public static final C16807N s3(DecorateFragment decorateFragment, List list) {
        C16942a z02;
        C17542s.g(list);
        DecorateView.a aVar = (DecorateView.a) C16877v.y0(list);
        if (!(aVar == null || !decorateFragment.X2().e1() || (z02 = decorateFragment.X2().z0()) == null)) {
            String a10 = aVar.a();
            if (a10 == null) {
                a10 = "Unknown decoration error";
            }
            z02.m(a10);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void s4(DecorateFragment decorateFragment) {
        String string = decorateFragment.getResources().getString(OE.n.f113254O2);
        C17542s.i(string, "getString(...)");
        n5(decorateFragment, string, 0, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void s5(DecorateFragment decorateFragment, DialogInterface dialogInterface, int i10) {
        C8951o a10 = androidx.navigation.fragment.a.a(decorateFragment);
        int g10 = C4.j.g(Kreativ.Decorate.Companion.serializer());
        if (C8951o.A(a10, a10.L(), g10, true, (x4.v) null, 4, (Object) null) != null) {
            a10.m0(g10, true, false);
            return;
        }
        throw new IllegalArgumentException(("Destination with route " + P.b(Kreativ.Decorate.class).f() + " cannot be found in navigation graph " + a10.L()).toString());
    }

    /* access modifiers changed from: private */
    public static final V1 t2(DecorateFragment decorateFragment) {
        Object obj;
        C8951o a10 = androidx.navigation.fragment.a.a(decorateFragment);
        int g10 = C4.j.g(V1.Companion.serializer());
        Class<V1> cls = V1.class;
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
                Bundle c10 = lVar.c();
                if (c10 == null) {
                    c10 = new Bundle();
                }
                Map<String, C8945i> s10 = lVar.e().s();
                LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(s10.size()));
                for (Map.Entry entry : s10.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((C8945i) entry.getValue()).a());
                }
                return (V1) C4.h.a(V1.Companion.serializer(), c10, linkedHashMap);
            }
            throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
        }
        throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
    }

    /* access modifiers changed from: private */
    public static final void t3(DecorateFragment decorateFragment, RF.k kVar, CachedCatalogItem cachedCatalogItem) {
        C17542s.j(kVar, "instance");
        C17542s.j(cachedCatalogItem, "item");
        IDecorateEngine K22 = decorateFragment.K2();
        if (K22 != null) {
            ItemVariantAdapter itemVariantAdapter = decorateFragment.f141781U;
            z3(decorateFragment, K22, cachedCatalogItem, kVar, itemVariantAdapter != null ? itemVariantAdapter.h() : null, false, false, (ModelScreenTransform) null, false, false, 240, (Object) null);
            b.G1(decorateFragment.X2(), C16877v.n(), false, false, false, 14, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void t4(AuthType authType) {
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new u(this, authType, (C17164e<? super u>) null), 3, (Object) null);
    }

    private final void t5() {
        DecorateView decorateView = this.f141779S;
        if (decorateView != null) {
            decorateView.f();
        }
    }

    private final void u2(C16913J0 j02) {
        e3(j02.c());
        C16481x xVar = this.f141777Q;
        C16481x xVar2 = null;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        ImageButton imageButton = xVar.f138501l;
        C17542s.i(imageButton, "decorateRoomViewModeBtn");
        JF.Z.x(imageButton, j02.e(), 0, 2, (Object) null);
        C16481x xVar3 = this.f141777Q;
        if (xVar3 == null) {
            C17542s.z("binding");
        } else {
            xVar2 = xVar3;
        }
        ImageButton imageButton2 = xVar2.f138494e;
        C17542s.i(imageButton2, "decorateFocusModeBtn");
        JF.Z.x(imageButton2, j02.d(), 0, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void u3(DecorateFragment decorateFragment, RF.j jVar) {
        C17542s.j(jVar, "viewport");
        decorateFragment.X2().O1(jVar);
    }

    static /* synthetic */ void u4(DecorateFragment decorateFragment, AuthType authType, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                authType = AuthType.UNKNOWN;
            }
            decorateFragment.t4(authType);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: savePendingComposition");
    }

    private final void u5(boolean z10) {
        C16481x xVar = this.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        ConstraintLayout b10 = xVar.f138508s.getRoot();
        C17542s.i(b10, "getRoot(...)");
        JF.Z.w(b10, z10, 500);
    }

    private final void v2() {
        Runnable runnable = this.f141764J0;
        if (runnable != null) {
            this.f141762I0.removeCallbacks(runnable);
            this.f141764J0 = null;
        }
    }

    /* access modifiers changed from: private */
    public static final boolean v3(View view, MotionEvent motionEvent) {
        view.performClick();
        return true;
    }

    private final void v4() {
        v2();
        C16957h0 h0Var = new C16957h0(this);
        this.f141764J0 = h0Var;
        this.f141762I0.postDelayed(h0Var, 2000);
    }

    /* access modifiers changed from: private */
    public static final String v5(ObjectInstanceId objectInstanceId) {
        return "trackInstance " + objectInstanceId;
    }

    private final void w2(boolean z10) {
        X2().n2(false);
        X2().c2((RF.k) null);
        I2().q0();
        if (!z10) {
            I2().r0();
        }
        IDecorateEngine K22 = K2();
        if (K22 != null) {
            K22.setModelInstanceSelected(ObjectInstanceId.Companion.getKAll(), false);
        }
        C5191t activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C16960j(this, z10));
        }
    }

    private final void w3() {
        g3();
        C13291e.c(X2().H0(), K2(), new C16988x(this));
    }

    /* access modifiers changed from: private */
    public static final void w4(DecorateFragment decorateFragment) {
        decorateFragment.u5(false);
    }

    /* access modifiers changed from: private */
    public static final void w5(DecorateFragment decorateFragment, RF.k kVar, RF.k kVar2) {
        PlacedItemsAdapter placedItemsAdapter = decorateFragment.f141780T;
        if (placedItemsAdapter != null) {
            placedItemsAdapter.o(kVar, kVar2);
        }
    }

    static /* synthetic */ void x2(DecorateFragment decorateFragment, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            decorateFragment.w2(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearSelection");
    }

    /* access modifiers changed from: private */
    public static final C16807N x3(DecorateFragment decorateFragment, RF.k kVar, IDecorateEngine iDecorateEngine) {
        C17542s.j(kVar, "inst");
        C17542s.j(iDecorateEngine, "engine");
        ProductParentType n10 = i.n(iDecorateEngine, kVar.f());
        C16942a z02 = decorateFragment.X2().z0();
        if (z02 != null) {
            z02.P(kVar, n10, decorateFragment.X2().d0());
        }
        decorateFragment.l4(kVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void x5(boolean z10, DecorateFragment decorateFragment, RF.k kVar, boolean z11) {
        if (!z10) {
            decorateFragment.X2().v0().add(kVar);
            PlacedItemsAdapter placedItemsAdapter = decorateFragment.f141780T;
            if (placedItemsAdapter != null) {
                placedItemsAdapter.h(kVar);
            }
            decorateFragment.X2().T1();
            if (z11) {
                b.b2(decorateFragment.X2(), false, 1, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void y2(DecorateFragment decorateFragment, boolean z10) {
        PlacedItemsAdapter placedItemsAdapter = decorateFragment.f141780T;
        if (placedItemsAdapter != null) {
            placedItemsAdapter.m((RF.k) null);
        }
        if (decorateFragment.W2().q0() && !z10) {
            decorateFragment.W2().m1();
            decorateFragment.Y4();
        }
    }

    private final void y3(IDecorateEngine iDecorateEngine, CachedCatalogItem cachedCatalogItem, RF.k kVar, ItemVariantAdapter.a aVar, boolean z10, boolean z11, ModelScreenTransform modelScreenTransform, boolean z12, boolean z13) {
        A2();
        RF.k kVar2 = z10 ? kVar : null;
        this.f141771N.c(System.nanoTime());
        IDecorateEngine iDecorateEngine2 = iDecorateEngine;
        (cachedCatalogItem.isModelCached() ? new j(this) : new k(this)).y(iDecorateEngine, cachedCatalogItem, kVar2, Boolean.valueOf(z11), modelScreenTransform, aVar, Boolean.valueOf(z12), iDecorateEngine.saveSceneLayout(X2().F0(), LayoutThumbnailSpec.NoThumbnails), Boolean.valueOf(z13));
        C5191t activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C16954g(this));
        }
    }

    private final void y4(RF.k kVar, float f10) {
        IDecorateEngine K22 = K2();
        if (K22 != null) {
            K22.moveModelInstance(kVar.f(), new ModelScreenTransform(f10, true, false));
        }
        b.b2(X2(), false, 1, (Object) null);
    }

    private final void z2() {
        C16481x xVar = this.f141777Q;
        if (xVar == null) {
            C17542s.z("binding");
            xVar = null;
        }
        SurfaceView surfaceView = xVar.f138502m;
        C17542s.i(surfaceView, "decorateSurfaceView");
        surfaceView.setOnTouchListener((View.OnTouchListener) null);
    }

    static /* synthetic */ void z3(DecorateFragment decorateFragment, IDecorateEngine iDecorateEngine, CachedCatalogItem cachedCatalogItem, RF.k kVar, ItemVariantAdapter.a aVar, boolean z10, boolean z11, ModelScreenTransform modelScreenTransform, boolean z12, boolean z13, int i10, Object obj) {
        int i11 = i10;
        if (obj == null) {
            decorateFragment.y3(iDecorateEngine, cachedCatalogItem, (i11 & 4) != 0 ? decorateFragment.X2().H0() : kVar, (i11 & 8) != 0 ? null : aVar, (i11 & 16) != 0 ? true : z10, (i11 & 32) != 0 ? true : z11, (i11 & 64) != 0 ? null : modelScreenTransform, (i11 & 128) != 0 ? true : z12, z13);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onItemAddOrReplace");
    }

    private final void z4(RF.k kVar, boolean z10) {
        IDecorateEngine K22 = K2();
        if (K22 != null) {
            K22.setModelInstanceSelected(ObjectInstanceId.Companion.getKAll(), false);
        }
        boolean z11 = this.f141783Y;
        boolean z12 = !z11;
        IDecorateEngine K23 = K2();
        if (K23 != null) {
            K23.setModelInstanceSelected(kVar.f(), z12);
        }
        if (!z11) {
            X2().c2(kVar);
            if (!z10) {
                I2().D0(kVar.d().getId());
            }
            C5191t activity = getActivity();
            if (activity != null) {
                activity.runOnUiThread(new C16956h(this));
            }
        } else if (C17542s.e(kVar, X2().H0())) {
            X2().c2((RF.k) null);
        }
    }

    public static /* synthetic */ RF.k z5(DecorateFragment decorateFragment, CachedCatalogItem cachedCatalogItem, ObjectInstanceId objectInstanceId, RF.k kVar, boolean z10, boolean z11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                kVar = null;
            }
            RF.k kVar2 = kVar;
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            boolean z12 = z10;
            if ((i10 & 16) != 0) {
                z11 = true;
            }
            return decorateFragment.y5(cachedCatalogItem, objectInstanceId, kVar2, z12, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackInstance");
    }

    public final void C4(RF.k kVar, boolean z10) {
        ObjectInstanceId objectInstanceId = null;
        if (kVar == null) {
            x2(this, false, 1, (Object) null);
            return;
        }
        C5191t activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C16966m(this));
        }
        ObjectInstanceId f10 = kVar.f();
        RF.k H02 = X2().H0();
        if (H02 != null) {
            objectInstanceId = H02.f();
        }
        if (!C17542s.e(f10, objectInstanceId)) {
            w2(true);
        }
        z4(kVar, z10);
        X2().B1(kVar);
    }

    public final CachedCompiledComposition H2() {
        return X2().f0();
    }

    public final IDecorateEngine K2() {
        DecorateView decorateView = this.f141779S;
        if (decorateView != null) {
            return decorateView.c();
        }
        return null;
    }

    public final ModelScreenTransform M2(IDecorateEngine iDecorateEngine, RF.k kVar) {
        C17542s.j(iDecorateEngine, "engine");
        C17542s.j(kVar, "inst");
        return iDecorateEngine.getModelScreenTransform(kVar.f());
    }

    public final OE.q U2() {
        OE.q qVar = this.f141763J;
        if (qVar != null) {
            return qVar;
        }
        C17542s.z("sugarcube");
        return null;
    }

    public final b X2() {
        return (b) this.f141773O.getValue();
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f141761I.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    public final void o4(RF.k kVar, float f10) {
        C17542s.j(kVar, "inst");
        IDecorateEngine K22 = K2();
        if (K22 != null) {
            K22.moveModelInstance(kVar.f(), new ModelScreenTransform(f10, false, false));
            W2().setRotationDegrees(M2(K22, kVar).getYawDegrees());
            b.b2(X2(), false, 1, (Object) null);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f141768L0 = true;
        } else {
            this.f141768L0 = false;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        installSystemUiDelegate(requireActivity, viewLifecycleOwner, false, false, 6);
        C16481x c10 = C16481x.c(layoutInflater, viewGroup, false);
        this.f141777Q = c10;
        C16481x xVar = null;
        if (c10 == null) {
            C17542s.z("binding");
            c10 = null;
        }
        c10.f138507r.setOnTouchListener(new C16944b());
        C5191t requireActivity2 = requireActivity();
        C17542s.i(requireActivity2, "requireActivity(...)");
        C16481x xVar2 = this.f141777Q;
        if (xVar2 == null) {
            C17542s.z("binding");
            xVar2 = null;
        }
        SurfaceView surfaceView = xVar2.f138502m;
        C17542s.i(surfaceView, "decorateSurfaceView");
        this.f141779S = new DecorateView(requireActivity2, surfaceView, this);
        C16481x xVar3 = this.f141777Q;
        if (xVar3 == null) {
            C17542s.z("binding");
        } else {
            xVar = xVar3;
        }
        return xVar.getRoot();
    }

    public void onDestroy() {
        F0 f02 = this.f141772N0;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        if (this.f141770M0) {
            X2().b0();
            z2();
            Log.v("DecorateFragment", "onDestroy()");
            t5();
        }
        C15093r rVar = this.f141784Z;
        if (rVar != null) {
            rVar.dismiss();
        }
        ExitDialog exitDialog = this.f141785y0;
        if (exitDialog != null) {
            exitDialog.dismiss();
        }
        Dialog dialog = this.f141760H0;
        if (dialog != null) {
            dialog.dismiss();
        }
        FeedbackDialog feedbackDialog = this.f141786z0;
        if (feedbackDialog != null) {
            feedbackDialog.dismiss();
        }
        ExitDialog exitDialog2 = this.f141753A0;
        if (exitDialog2 != null) {
            exitDialog2.dismiss();
        }
        super.onDestroy();
    }

    public void onDuplicateItemButtonClicked() {
        C16942a z02 = X2().z0();
        if (z02 != null) {
            RF.j d02 = X2().d0();
            RF.k H02 = X2().H0();
            z02.C(d02, H02 != null ? H02.d() : null);
        }
        D2();
    }

    public void onEraseHideAllClicked() {
        IDecorateEngine K22 = K2();
        if (K22 != null) {
            X2().y1(K22);
        }
    }

    public void onEraseShowAllClicked() {
        IDecorateEngine K22 = K2();
        if (K22 != null) {
            X2().A1(K22);
        }
    }

    public void onError(DecorateView.a aVar) {
        C17542s.j(aVar, "engineError");
        X2().T(aVar);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        C17542s.i(onGetLayoutInflater, "onGetLayoutInflater(...)");
        LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new androidx.appcompat.view.d(requireContext(), R.style.Theme_Sugarcube_NoActionBar));
        C17542s.i(cloneInContext, "cloneInContext(...)");
        return cloneInContext;
    }

    public void onItemDeleteClicked() {
        w3();
    }

    public void onItemInfoClicked() {
        k4(X2().H0());
        C16942a z02 = X2().z0();
        if (z02 != null) {
            RF.j d02 = X2().d0();
            RF.k H02 = X2().H0();
            z02.F(d02, H02 != null ? H02.d() : null);
        }
    }

    public void onItemRotateClicked(boolean z10) {
        C16942a z02 = X2().z0();
        if (z02 != null) {
            z02.G(X2().d0());
        }
        g3();
        if (z10) {
            C16807N n10 = (C16807N) C13291e.c(X2().H0(), K2(), new C16948d(this));
        } else {
            C16807N n11 = (C16807N) C13291e.c(X2().H0(), K2(), new C16950e(this));
        }
    }

    public void onItemSwapClicked() {
        C16942a z02 = X2().z0();
        if (z02 != null) {
            RF.j d02 = X2().d0();
            RF.k H02 = X2().H0();
            z02.I(d02, H02 != null ? H02.d() : null);
        }
        j4();
    }

    public void onItemsRestored(List<DesignItemInfo> list) {
        C17542s.j(list, "items");
        int size = list.size();
        IDecorateEngine K22 = K2();
        Log.v("DecorateFragment", "onItemsRestored: " + size + " items - engine: " + K22);
        IDecorateEngine K23 = K2();
        if (K23 != null) {
            getViewLifecycleOwnerLiveData().observe(this, new a.C3467a(new C16946c(this, list, K23)));
        }
    }

    public void onMetric(Metric metric) {
        C17542s.j(metric, "metric");
        X2().x1(metric.getName(), metric.getValue(), metric.getContext());
    }

    public void onMultiviewClicked() {
        X2().n2(true);
    }

    public void onPause() {
        IDecorateEngine K22 = K2();
        if (K22 != null) {
            X2().c0(K22);
        }
        super.onPause();
    }

    public void onProductRecommendationsButtonClicked() {
        C16942a z02 = X2().z0();
        if (z02 != null) {
            z02.E(X2().d0());
        }
        g5();
    }

    public void onResume() {
        RoomSource roomSource;
        super.onResume();
        C5191t activity = getActivity();
        if (activity != null) {
            ClipboardManager clipboardManager = this.f141767L;
            Scene Q22 = Q2();
            CachedCompiledComposition H22 = H2();
            Composition composition = H22 != null ? H22.getComposition() : null;
            C16942a z02 = X2().z0();
            if (z02 == null || (roomSource = z02.b()) == null) {
                roomSource = RoomSource.Stock;
            }
            C13115w.a(activity, clipboardManager, Q22, composition, roomSource, "CAPTURE", X2().W0());
        }
    }

    public void onSaveClicked() {
        b X22 = X2();
        C16942a z02 = X22.z0();
        if (z02 != null) {
            CachedCompiledComposition H22 = H2();
            z02.H(H22 != null ? H22.getName() : null, X22.l0().getValue(), X2().d0());
        }
        W2().o0();
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new m(this, (C17164e<? super m>) null), 3, (Object) null);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C17542s.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (!X2().i1()) {
            bundle.putString("compositionUuid", String.valueOf(X2().h0()));
            bundle.putBoolean("isNewDesign", false);
        }
    }

    public void onShowBagClicked() {
        LinkedList<RF.k> v02 = X2().v0();
        ArrayList arrayList = new ArrayList();
        for (RF.k d10 : v02) {
            Integer id2 = d10.d().getCatalogItem().getId();
            if (id2 != null) {
                arrayList.add(id2);
            }
        }
        i4(arrayList);
        C16942a z02 = X2().z0();
        if (z02 != null) {
            String arrays = Arrays.toString(arrayList.toArray(new Integer[0]));
            C17542s.i(arrays, "toString(...)");
            z02.B(arrays, X2().d0());
        }
    }

    public void onShowCatalogClicked() {
        C16942a z02 = X2().z0();
        if (z02 != null) {
            z02.A(X2().d0());
        }
        C16936V0 v02 = this.f141778R;
        if (v02 == null) {
            C17542s.z("touchControlScheme");
            v02 = null;
        }
        v02.n();
        j4();
    }

    public void onShowEraseControlsClicked(boolean z10) {
        C16936V0 v02 = null;
        if (z10) {
            C16942a z02 = X2().z0();
            if (z02 != null) {
                z02.D(X2().d0());
            }
            C16936V0 v03 = this.f141778R;
            if (v03 == null) {
                C17542s.z("touchControlScheme");
            } else {
                v02 = v03;
            }
            v02.s();
            return;
        }
        C16942a z03 = X2().z0();
        if (z03 != null) {
            z03.t();
        }
        C16936V0 v04 = this.f141778R;
        if (v04 == null) {
            C17542s.z("touchControlScheme");
        } else {
            v02 = v04;
        }
        v02.n();
    }

    public void onShowItemListClicked(boolean z10) {
        if (z10) {
            return;
        }
        if (X2().H0() != null) {
            C5();
            W2().i1();
            return;
        }
        W2().m1();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        F0 f02 = this.f141772N0;
        if (!(f02 == null || f02 == null || !f02.c())) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f141772N0 = C16314k.d(C5222z.a(viewLifecycleOwner), (C17168i) null, (QJ.T) null, new n(this, (C17164e<? super n>) null), 3, (Object) null);
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner2), (C17168i) null, (QJ.T) null, new o(this, (C17164e<? super o>) null), 3, (Object) null);
    }

    public void onViewStateRestored(Bundle bundle) {
        String str;
        Object obj;
        super.onViewStateRestored(bundle);
        if (bundle == null || (str = bundle.getString("compositionUuid")) == null) {
            str = "";
        }
        boolean z10 = bundle != null ? bundle.getBoolean("isNewDesign") : true;
        try {
            x.a aVar = XH.x.f139812b;
            obj = XH.x.b(UUID.fromString(str));
        } catch (Throwable th2) {
            x.a aVar2 = XH.x.f139812b;
            obj = XH.x.b(XH.y.a(th2));
        }
        if (XH.x.g(obj)) {
            obj = null;
        }
        X2().Q1((UUID) obj);
        X2().U1(z10);
    }

    public final void x4(RF.k kVar, float f10, float f11) {
        C17542s.j(kVar, "inst");
        IDecorateEngine K22 = K2();
        if (K22 != null) {
            K22.moveModelInstance(kVar.f(), new ModelScreenTransform(f10, f11, true, true));
        }
        b.b2(X2(), false, 1, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r4 == null) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final RF.k y5(com.sugarcube.app.base.data.database.CachedCatalogItem r4, com.sugarcube.decorate_engine.ObjectInstanceId r5, RF.k r6, boolean r7, boolean r8) {
        /*
            r3 = this;
            java.lang.String r0 = "catalogItem"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "instanceId"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            YE.b r0 = YE.C13868b.f118106a
            boolean r1 = r5.isNone()
            if (r1 != 0) goto L_0x001a
            boolean r1 = r5.isAll()
            if (r1 != 0) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            ZF.q0 r2 = new ZF.q0
            r2.<init>(r5)
            r0.a(r1, r2)
            com.sugarcube.decorate.v1.internal.v1.b r0 = r3.X2()
            java.util.LinkedList r0 = r0.v0()
            monitor-enter(r0)
            RF.k r1 = new RF.k     // Catch:{ all -> 0x0055 }
            r1.<init>(r5, r4)     // Catch:{ all -> 0x0055 }
            com.sugarcube.decorate.v1.internal.v1.b r4 = r3.X2()     // Catch:{ all -> 0x0055 }
            java.util.HashMap r4 = r4.w0()     // Catch:{ all -> 0x0055 }
            com.sugarcube.decorate_engine.ObjectInstanceId r5 = r1.f()     // Catch:{ all -> 0x0055 }
            r4.put(r5, r1)     // Catch:{ all -> 0x0055 }
            if (r6 == 0) goto L_0x006b
            com.sugarcube.decorate.v1.internal.v1.b r4 = r3.X2()     // Catch:{ all -> 0x0055 }
            java.util.LinkedList r4 = r4.v0()     // Catch:{ all -> 0x0055 }
            int r5 = r4.indexOf(r6)     // Catch:{ all -> 0x0055 }
            r2 = -1
            if (r5 <= r2) goto L_0x0057
            r4.set(r5, r1)     // Catch:{ all -> 0x0055 }
            goto L_0x0057
        L_0x0055:
            r4 = move-exception
            goto L_0x007d
        L_0x0057:
            androidx.fragment.app.t r4 = r3.getActivity()     // Catch:{ all -> 0x0055 }
            if (r4 == 0) goto L_0x0068
            ZF.y0 r5 = new ZF.y0     // Catch:{ all -> 0x0055 }
            r5.<init>(r3, r6, r1)     // Catch:{ all -> 0x0055 }
            r4.runOnUiThread(r5)     // Catch:{ all -> 0x0055 }
            XH.N r4 = XH.C16807N.f139792a     // Catch:{ all -> 0x0055 }
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            if (r4 != 0) goto L_0x007b
        L_0x006b:
            androidx.fragment.app.t r4 = r3.getActivity()     // Catch:{ all -> 0x0055 }
            if (r4 == 0) goto L_0x007b
            ZF.z0 r5 = new ZF.z0     // Catch:{ all -> 0x0055 }
            r5.<init>(r7, r3, r1, r8)     // Catch:{ all -> 0x0055 }
            r4.runOnUiThread(r5)     // Catch:{ all -> 0x0055 }
            XH.N r4 = XH.C16807N.f139792a     // Catch:{ all -> 0x0055 }
        L_0x007b:
            monitor-exit(r0)
            return r1
        L_0x007d:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.DecorateFragment.y5(com.sugarcube.app.base.data.database.CachedCatalogItem, com.sugarcube.decorate_engine.ObjectInstanceId, RF.k, boolean, boolean):RF.k");
    }
}
