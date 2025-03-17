package com.sugarcube.decorate.v1.internal.v1;

import OE.C13313e;
import QJ.C16297b0;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import RF.C13549b;
import RF.i;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import W2.f;
import XH.C16807N;
import XH.C16818i;
import YE.C13868b;
import YE.e;
import YF.C16841b;
import YH.C16877v;
import ZF.C16903E0;
import ZF.C16905F0;
import ZF.C16913J0;
import ZF.C16942a;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.analytics.CatalogItemSource;
import com.sugarcube.app.base.data.analytics.MethodType;
import com.sugarcube.app.base.data.analytics.ProductParentType;
import com.sugarcube.app.base.data.analytics.RoomSource;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.CachedCompiledComposition;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.feature.ConfigItems;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.data.model.DecorateViewMode;
import com.sugarcube.app.base.data.preferences.PreferenceImpl;
import com.sugarcube.app.base.data.preferences.PreferenceStorage;
import com.sugarcube.app.base.data.source.CatalogRepository;
import com.sugarcube.app.base.data.source.CompositionRepository;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.config.a;
import com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.CompiledComposition;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.CompositionSavedProperties;
import com.sugarcube.core.network.models.Manifest;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.core.network.models.SceneResponse;
import com.sugarcube.core.network.models.SmartaPlacementResult;
import com.sugarcube.decorate.DesignStateManager;
import com.sugarcube.decorate.TemporaryDesignStateListener;
import com.sugarcube.decorate.internal.shared.DecorateView;
import com.sugarcube.decorate.internal.shared.IDecorateEngine;
import com.sugarcube.decorate.v1.internal.catalog.d0;
import com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter;
import com.sugarcube.decorate.v1.internal.v1.adapters.MultiviewAdapter;
import com.sugarcube.decorate_engine.EraserCounts;
import com.sugarcube.decorate_engine.EraserPickId;
import com.sugarcube.decorate_engine.EraserPickOp;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import com.sugarcube.decorate_engine.PanZoomRegion;
import com.sugarcube.decorate_engine.SceneLayout;
import com.sugarcube.decorate_engine.SceneLayoutFormat;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fI.C17221b;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.W;
import nI.C17642l;

@Metadata(d1 = {"\u0000Ê\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0007\u0018\u0000 Û\u00022\u00020\u0001:\u0004Ê\u0003Ë\u0003Ba\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J8\u0010-\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010)\u001a\u00020(2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*H@¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020!H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001aH\u0002¢\u0006\u0004\b1\u0010\u001cJ\u000f\u00102\u001a\u00020\u001aH\u0002¢\u0006\u0004\b2\u0010\u001cJ\u0017\u00105\u001a\u00020\u001a2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u001a2\b\u0010:\u001a\u0004\u0018\u00010%¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020!¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u000207¢\u0006\u0004\b@\u00109J\u0015\u0010C\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u001a2\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bE\u0010DJ\u0017\u0010G\u001a\u00020\u001a2\b\b\u0002\u0010F\u001a\u00020!¢\u0006\u0004\bG\u0010?J\r\u0010H\u001a\u00020\u001a¢\u0006\u0004\bH\u0010\u001cJ\r\u0010I\u001a\u00020\u001a¢\u0006\u0004\bI\u0010\u001cJ\r\u0010J\u001a\u00020\u001a¢\u0006\u0004\bJ\u0010\u001cJ\r\u0010K\u001a\u00020\u001a¢\u0006\u0004\bK\u0010\u001cJ\r\u0010L\u001a\u00020\u001a¢\u0006\u0004\bL\u0010\u001cJ\r\u0010M\u001a\u00020\u001a¢\u0006\u0004\bM\u0010\u001cJ\r\u0010N\u001a\u00020\u001a¢\u0006\u0004\bN\u0010\u001cJ\r\u0010O\u001a\u00020\u001a¢\u0006\u0004\bO\u0010\u001cJ\r\u0010P\u001a\u00020\u001a¢\u0006\u0004\bP\u0010\u001cJI\u0010V\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%2\u0006\u0010R\u001a\u00020Q2\b\u0010S\u001a\u0004\u0018\u00010%2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010T\u001a\u00020!2\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020\u001a¢\u0006\u0004\bX\u0010\u001cJ\u0018\u0010[\u001a\u00020Y2\u0006\u0010Z\u001a\u00020YH@¢\u0006\u0004\b[\u0010\\J$\u0010^\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010]\u001a\u00020!H@¢\u0006\u0004\b^\u0010_J,\u0010`\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010]\u001a\u00020!H@¢\u0006\u0004\b`\u0010aJ\u0019\u0010b\u001a\u00020\u001a2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010%¢\u0006\u0004\bb\u0010<J\u0017\u0010d\u001a\u00020\u001a2\b\b\u0002\u0010c\u001a\u00020!¢\u0006\u0004\bd\u0010?J\r\u0010e\u001a\u00020!¢\u0006\u0004\be\u00100J\u0015\u0010g\u001a\u00020\u001a2\u0006\u0010f\u001a\u00020+¢\u0006\u0004\bg\u0010hJ\r\u0010i\u001a\u00020\u001a¢\u0006\u0004\bi\u0010\u001cJ\u0015\u0010l\u001a\u00020\u001a2\u0006\u0010k\u001a\u00020j¢\u0006\u0004\bl\u0010mJ\r\u0010n\u001a\u00020\u001a¢\u0006\u0004\bn\u0010\u001cJ\r\u0010o\u001a\u00020\u001a¢\u0006\u0004\bo\u0010\u001cJ\r\u0010p\u001a\u00020\u001a¢\u0006\u0004\bp\u0010\u001cJ\u0015\u0010s\u001a\u00020\u001a2\u0006\u0010r\u001a\u00020q¢\u0006\u0004\bs\u0010tJ\r\u0010u\u001a\u00020!¢\u0006\u0004\bu\u00100J\r\u0010w\u001a\u00020v¢\u0006\u0004\bw\u0010xJ9\u0010}\u001a\u00020\u001a2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020Y0*2\b\b\u0002\u0010z\u001a\u00020!2\b\b\u0002\u0010{\u001a\u00020!2\b\b\u0002\u0010|\u001a\u00020!¢\u0006\u0004\b}\u0010~J\u0018\u0010\u0001\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u001a2\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u001a2\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u0004\u0018\u00010!2\t\u0010\u0001\u001a\u0004\u0018\u00010q¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u0004\u0018\u00010!2\t\u0010\u0001\u001a\u0004\u0018\u00010q¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020!2\t\u0010\u0001\u001a\u0004\u0018\u00010q¢\u0006\u0006\b\u0001\u0010\u0001J\u0013\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J \u0010\u0001\u001a\u00020\u001a2\u000e\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010*¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u001a2\t\u0010\u0001\u001a\u0004\u0018\u000107¢\u0006\u0006\b\u0001\u0010\u0001J\u0017\u0010\u0001\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020!¢\u0006\u0005\b\u0001\u0010?J\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010\u001cJ\u0017\u0010\u0001\u001a\u00020\u001a2\u0006\u00104\u001a\u000203¢\u0006\u0005\b\u0001\u00106J\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010\u001cJ\u0013\u0010\u0001\u001a\u00020\u001aH@¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010\u001cJ\u0017\u0010\u0001\u001a\u00020\u001a2\u0006\u00104\u001a\u000203¢\u0006\u0005\b\u0001\u00106J\u0017\u0010\u0001\u001a\u00020\u001a2\u0006\u00104\u001a\u000203¢\u0006\u0005\b\u0001\u00106J\u0017\u0010 \u0001\u001a\u00020\u001a2\u0006\u00104\u001a\u000203¢\u0006\u0005\b \u0001\u00106J\u001a\u0010£\u0001\u001a\u00020\u001a2\b\u0010¢\u0001\u001a\u00030¡\u0001¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0017\u0010¥\u0001\u001a\u00020\u001a2\u0006\u00104\u001a\u000203¢\u0006\u0005\b¥\u0001\u00106J\u000f\u0010¦\u0001\u001a\u00020\u001a¢\u0006\u0005\b¦\u0001\u0010\u001cJ,\u0010©\u0001\u001a\u00020\u001a2\u0006\u0010f\u001a\u00020+2\u0007\u0010=\u001a\u00030§\u00012\t\u0010¨\u0001\u001a\u0004\u0018\u00010+¢\u0006\u0006\b©\u0001\u0010ª\u0001J)\u0010­\u0001\u001a\u0005\u0018\u00010¬\u00012\u0007\u0010«\u0001\u001a\u00020Y2\b\u0010 \u001a\u0004\u0018\u00010\u001fH@¢\u0006\u0006\b­\u0001\u0010®\u0001JR\u0010¸\u0001\u001a\u00020\u001a2\u0007\u0010¯\u0001\u001a\u00020Y2\t\u0010°\u0001\u001a\u0004\u0018\u00010Y2\f\b\u0002\u0010²\u0001\u001a\u0005\u0018\u00010±\u00012\b\u0010´\u0001\u001a\u00030³\u00012\b\u0010¶\u0001\u001a\u00030µ\u00012\n\u0010·\u0001\u001a\u0005\u0018\u00010¬\u0001¢\u0006\u0006\b¸\u0001\u0010¹\u0001R\u001b\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R\u001b\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0010\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u001b\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u001b\u0010\t\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u001b\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0010\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u001b\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u0010\n\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001b\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\u0010\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001R)\u0010ã\u0001\u001a\u0014\u0012\u000f\u0012\r à\u0001*\u0005\u0018\u00010ß\u00010ß\u00010Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R,\u0010ë\u0001\u001a\u0005\u0018\u00010ä\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R$\u0010ò\u0001\u001a\n\u0012\u0005\u0012\u00030í\u00010ì\u00018\u0006¢\u0006\u0010\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bð\u0001\u0010ñ\u0001R\u001f\u0010÷\u0001\u001a\n\u0012\u0005\u0012\u00030ô\u00010ó\u00018\u0002X\u0004¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R$\u0010ý\u0001\u001a\n\u0012\u0005\u0012\u00030ô\u00010ø\u00018\u0006¢\u0006\u0010\n\u0006\bù\u0001\u0010ú\u0001\u001a\u0006\bû\u0001\u0010ü\u0001R3\u0010r\u001a\u0004\u0018\u00010q2\b\u0010=\u001a\u0004\u0018\u00010q8\u0006@FX\u000e¢\u0006\u0017\n\u0006\bþ\u0001\u0010ÿ\u0001\u001a\u0006\b\u0002\u0010\u0002\"\u0005\b\u0002\u0010tR<\u0010\u0002\u001a\"\u0012\u0005\u0012\u00030\u0002\u0012\u0004\u0012\u00020q0\u0002j\u0010\u0012\u0005\u0012\u00030\u0002\u0012\u0004\u0012\u00020q`\u00028\u0006¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R#\u0010\u0002\u001a\t\u0012\u0004\u0012\u00020q0\u00028\u0006¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R\u001e\u0010\u0002\u001a\t\u0012\u0004\u0012\u00020q0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R&\u0010\u0002\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0002\u0010-\u001a\u0005\b\u0002\u00100\"\u0005\b\u0002\u0010?R0\u0010\u0002\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0002\u0010â\u0001\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R,\u0010¦\u0002\u001a\u0005\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b \u0002\u0010¡\u0002\u001a\u0006\b¢\u0002\u0010£\u0002\"\u0006\b¤\u0002\u0010¥\u0002R,\u0010®\u0002\u001a\u0005\u0018\u00010§\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¨\u0002\u0010©\u0002\u001a\u0006\bª\u0002\u0010«\u0002\"\u0006\b¬\u0002\u0010­\u0002R,\u0010´\u0002\u001a\u0005\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¯\u0002\u0010°\u0002\u001a\u0006\b±\u0002\u0010\u0001\"\u0006\b²\u0002\u0010³\u0002R*\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\bµ\u0002\u0010¶\u0002\u001a\u0006\b·\u0002\u0010¸\u0002\"\u0006\b¹\u0002\u0010º\u0002R1\u0010¿\u0002\u001a\n\u0012\u0005\u0012\u00030»\u00020Þ\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¼\u0002\u0010â\u0001\u001a\u0006\b½\u0002\u0010\u0002\"\u0006\b¾\u0002\u0010\u0002R,\u0010Â\u0002\u001a\u0012\u0012\r\u0012\u000b à\u0001*\u0004\u0018\u00010!0!0Þ\u00018\u0006¢\u0006\u0010\n\u0006\bÀ\u0002\u0010â\u0001\u001a\u0006\bÁ\u0002\u0010\u0002R#\u0010Å\u0002\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0006¢\u0006\u0010\n\u0006\bÃ\u0002\u0010â\u0001\u001a\u0006\bÄ\u0002\u0010\u0002R \u0010Ç\u0002\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÆ\u0002\u0010â\u0001R \u0010É\u0002\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÈ\u0002\u0010â\u0001R\u001f\u0010Ì\u0002\u001a\n\u0012\u0005\u0012\u00030Ê\u00020ó\u00018\u0002X\u0004¢\u0006\b\n\u0006\bË\u0002\u0010ö\u0001R$\u0010Ò\u0002\u001a\n\u0012\u0005\u0012\u00030Ê\u00020Í\u00028\u0006¢\u0006\u0010\n\u0006\bÎ\u0002\u0010Ï\u0002\u001a\u0006\bÐ\u0002\u0010Ñ\u0002R&\u0010Ô\u0002\u001a\u00020!2\u0006\u0010=\u001a\u00020!8\u0006@BX\u000e¢\u0006\r\n\u0004\bC\u0010-\u001a\u0005\bÓ\u0002\u00100R'\u0010Ö\u0002\u001a\u00020!2\u0006\u0010=\u001a\u00020!8\u0006@BX\u000e¢\u0006\u000e\n\u0005\b\u0001\u0010-\u001a\u0005\bÕ\u0002\u00100R'\u0010Ø\u0002\u001a\u00020!2\u0006\u0010=\u001a\u00020!8\u0006@BX\u000e¢\u0006\u000e\n\u0005\b\u0001\u0010-\u001a\u0005\b×\u0002\u00100R'\u0010Ú\u0002\u001a\u00020!2\u0006\u0010=\u001a\u00020!8\u0006@BX\u000e¢\u0006\u000e\n\u0005\b\u0001\u0010-\u001a\u0005\bÙ\u0002\u00100R&\u0010Ü\u0002\u001a\u00020!2\u0006\u0010=\u001a\u00020!8\u0006@BX\u000e¢\u0006\r\n\u0004\b-\u0010-\u001a\u0005\bÛ\u0002\u00100R'\u0010Þ\u0002\u001a\u00020!2\u0006\u0010=\u001a\u00020!8\u0006@BX\u000e¢\u0006\u000e\n\u0005\bð\u0001\u0010-\u001a\u0005\bÝ\u0002\u00100R'\u0010à\u0002\u001a\u00020!2\u0006\u0010=\u001a\u00020!8\u0006@BX\u000e¢\u0006\u000e\n\u0005\bç\u0001\u0010-\u001a\u0005\bß\u0002\u00100R%\u0010ã\u0002\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0004\bw\u0010-\u001a\u0005\bá\u0002\u00100\"\u0005\bâ\u0002\u0010?R\u001a\u0010ä\u0002\u001a\u00020!8\u0006¢\u0006\u000e\n\u0005\b½\u0002\u0010-\u001a\u0005\bä\u0002\u00100R+\u0010ê\u0002\u001a\u00030å\u00022\u0007\u0010=\u001a\u00030å\u00028\u0006@BX\u000e¢\u0006\u0010\n\u0006\bæ\u0002\u0010ç\u0002\u001a\u0006\bè\u0002\u0010é\u0002R%\u0010ì\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020A0\u00020Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\bë\u0002\u0010â\u0001R\u001e\u0010í\u0002\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¢\u0002\u0010â\u0001R'\u0010ð\u0002\u001a\u0012\u0012\r\u0012\u000b\u0012\u0007\u0012\u0005\u0018\u00010î\u00020*0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\bï\u0002\u0010â\u0001R,\u0010:\u001a\u0004\u0018\u00010%2\b\u0010=\u001a\u0004\u0018\u00010%8\u0006@BX\u000e¢\u0006\u0010\n\u0006\bñ\u0002\u0010ò\u0002\u001a\u0006\bó\u0002\u0010ô\u0002R-\u0010õ\u0002\u001a\u0004\u0018\u00010%2\b\u0010=\u001a\u0004\u0018\u00010%8\u0006@BX\u000e¢\u0006\u0010\n\u0006\b\u0002\u0010ò\u0002\u001a\u0006\bñ\u0002\u0010ô\u0002R%\u0010ö\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010*0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010â\u0001R#\u0010ü\u0002\u001a\t\u0012\u0004\u0012\u00020!0÷\u00028\u0006¢\u0006\u0010\n\u0006\bø\u0002\u0010ù\u0002\u001a\u0006\bú\u0002\u0010û\u0002R\u0019\u0010ÿ\u0002\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bý\u0002\u0010þ\u0002R \u0010\u0003\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001070Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\bú\u0002\u0010â\u0001R'\u0010\u0003\u001a\u0012\u0012\r\u0012\u000b à\u0001*\u0004\u0018\u00010!0!0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010â\u0001R\u001e\u0010\u0003\u001a\t\u0012\u0004\u0012\u000200Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010â\u0001R#\u0010\u0003\u001a\t\u0012\u0004\u0012\u000200ø\u00018\u0006¢\u0006\u0010\n\u0006\b\u0003\u0010ú\u0001\u001a\u0006\b\u0003\u0010ü\u0001R\u001e\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020Q0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010â\u0001R\u001e\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010â\u0001R\u001e\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010â\u0001R!\u0010\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00030Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010â\u0001R#\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0006¢\u0006\u0010\n\u0006\b\u0003\u0010â\u0001\u001a\u0006\bæ\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\n\u0012\u0005\u0012\u00030\u00030Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\bá\u0002\u0010â\u0001R$\u0010\u0003\u001a\n\u0012\u0005\u0012\u00030\u00030ø\u00018\u0006¢\u0006\u0010\n\u0006\b­\u0001\u0010ú\u0001\u001a\u0006\b\u0003\u0010ü\u0001R\u001e\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010â\u0001R\u001d\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b#\u0010â\u0001R\u001e\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\bû\u0001\u0010â\u0001R\u001e\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010â\u0001R\u001e\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010â\u0001R\u001e\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010â\u0001R+\u0010\u0003\u001a\u0012\u0012\r\u0012\u000b à\u0001*\u0004\u0018\u00010!0!0Þ\u00018\u0006¢\u0006\u000f\n\u0005\b/\u0010â\u0001\u001a\u0006\bø\u0002\u0010\u0002R,\u0010 \u0003\u001a\u0012\u0012\r\u0012\u000b à\u0001*\u0004\u0018\u00010!0!0Þ\u00018\u0006¢\u0006\u0010\n\u0006\bÕ\u0002\u0010â\u0001\u001a\u0006\bý\u0002\u0010\u0002R,\u0010¡\u0003\u001a\u0012\u0012\r\u0012\u000b à\u0001*\u0004\u0018\u00010!0!0Þ\u00018\u0006¢\u0006\u0010\n\u0006\bÓ\u0002\u0010â\u0001\u001a\u0006\b\u0003\u0010\u0002R\u001e\u0010£\u0003\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¢\u0003\u0010â\u0001R#\u0010¤\u0003\u001a\t\u0012\u0004\u0012\u00020!0ø\u00018\u0006¢\u0006\u0010\n\u0006\bÁ\u0002\u0010ú\u0001\u001a\u0006\b\u0003\u0010ü\u0001R\u001e\u0010¦\u0003\u001a\t\u0012\u0004\u0012\u00020!0Þ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0003\u0010â\u0001R\u001c\u0010©\u0003\u001a\u0005\u0018\u00010§\u00038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010¨\u0003R\u001c\u0010«\u0003\u001a\n\u0012\u0005\u0012\u00030ß\u00010ø\u00018F¢\u0006\b\u001a\u0006\bª\u0003\u0010ü\u0001R\u001b\u0010¬\u0003\u001a\t\u0012\u0004\u0012\u00020!0ø\u00018F¢\u0006\b\u001a\u0006\b\u0003\u0010ü\u0001R\u001b\u0010­\u0003\u001a\t\u0012\u0004\u0012\u00020!0ø\u00018F¢\u0006\b\u001a\u0006\b\u0003\u0010ü\u0001R\"\u0010¯\u0003\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020A0\u00020ø\u00018F¢\u0006\b\u001a\u0006\b®\u0003\u0010ü\u0001R\u001b\u0010°\u0003\u001a\t\u0012\u0004\u0012\u00020!0ø\u00018F¢\u0006\b\u001a\u0006\b\u0003\u0010ü\u0001R$\u0010²\u0003\u001a\u0012\u0012\r\u0012\u000b\u0012\u0007\u0012\u0005\u0018\u00010î\u00020*0ø\u00018F¢\u0006\b\u001a\u0006\b±\u0003\u0010ü\u0001R\u0018\u0010µ\u0003\u001a\u00030³\u00038@X\u0004¢\u0006\b\u001a\u0006\bï\u0002\u0010´\u0003R\"\u0010·\u0003\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010*0ø\u00018F¢\u0006\b\u001a\u0006\b¶\u0003\u0010ü\u0001R\u001d\u0010¹\u0003\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001070ø\u00018F¢\u0006\b\u001a\u0006\b¸\u0003\u0010ü\u0001R\u001b\u0010º\u0003\u001a\t\u0012\u0004\u0012\u00020!0ø\u00018F¢\u0006\b\u001a\u0006\b\u0003\u0010ü\u0001R\u0015\u0010½\u0003\u001a\u00030»\u00038F¢\u0006\b\u001a\u0006\b\u0003\u0010¼\u0003R\u001b\u0010¾\u0003\u001a\t\u0012\u0004\u0012\u00020Q0ø\u00018F¢\u0006\b\u001a\u0006\b\u0003\u0010ü\u0001R\u001b\u0010¿\u0003\u001a\t\u0012\u0004\u0012\u00020!0ø\u00018F¢\u0006\b\u001a\u0006\bë\u0002\u0010ü\u0001R\u001b\u0010Á\u0003\u001a\t\u0012\u0004\u0012\u00020!0ø\u00018F¢\u0006\b\u001a\u0006\bÀ\u0003\u0010ü\u0001R\u001e\u0010Â\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00030ø\u00018F¢\u0006\b\u001a\u0006\b\u0003\u0010ü\u0001R\u0013\u0010Ã\u0003\u001a\u00020!8F¢\u0006\u0007\u001a\u0005\b\u0003\u00100R\u0013\u0010Ä\u0003\u001a\u00020!8F¢\u0006\u0007\u001a\u0005\b¥\u0003\u00100R\u0013\u0010Æ\u0003\u001a\u00020!8F¢\u0006\u0007\u001a\u0005\bÅ\u0003\u00100R\u0013\u0010Ç\u0003\u001a\u00020!8F¢\u0006\u0007\u001a\u0005\b¢\u0003\u00100R\u0013\u0010É\u0003\u001a\u00020!8F¢\u0006\u0007\u001a\u0005\bÈ\u0003\u00100¨\u0006Ì\u0003"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/b;", "Landroidx/lifecycle/f0;", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "Lcom/sugarcube/app/base/data/source/CatalogRepository;", "catalogRepository", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "compositionRepository", "LOE/q;", "sugarcube", "Lcom/sugarcube/app/base/external/config/a;", "appConfig", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "sharedPref", "LOE/e;", "installationConfig", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "LRF/p;", "smartaPlacementUseCase", "Lcom/sugarcube/decorate/DesignStateManager;", "designStateManager", "<init>", "(Lcom/sugarcube/app/base/data/SceneRepository;Lcom/sugarcube/app/base/data/source/CatalogRepository;Lcom/sugarcube/app/base/data/source/CompositionRepository;LOE/q;Lcom/sugarcube/app/base/external/config/a;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;LOE/e;Lcom/sugarcube/app/base/data/feature/ConfigRepository;LRF/p;Lcom/sugarcube/decorate/DesignStateManager;)V", "LXH/N;", "v2", "()V", "Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "cachedCompiledComposition", "Lcom/sugarcube/decorate_engine/SceneLayout;", "sceneLayout", "", "isForSmarta", "X0", "(Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;Lcom/sugarcube/decorate_engine/SceneLayout;Z)Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "Ljava/util/UUID;", "sceneUuid", "compositionUuid", "Landroid/content/res/Resources;", "resources", "", "", "furnitureIds", "Z", "(Ljava/util/UUID;Ljava/util/UUID;Landroid/content/res/Resources;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "c1", "()Z", "L1", "V", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "engine", "t2", "(Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;)V", "LRF/j;", "s0", "()LRF/j;", "compositionUUID", "Q1", "(Ljava/util/UUID;)V", "value", "U1", "(Z)V", "d0", "Lcom/sugarcube/decorate/internal/shared/DecorateView$a;", "engineError", "T", "(Lcom/sugarcube/decorate/internal/shared/DecorateView$a;)V", "S1", "shouldShow", "l2", "d2", "f2", "e2", "Z1", "W1", "X1", "o2", "h2", "V1", "", "sceneDeprecatedId", "compUuid", "isNewDesign", "furniture", "u1", "(Ljava/util/UUID;ILjava/util/UUID;Landroid/content/res/Resources;ZLjava/util/List;)V", "M1", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "a0", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LdI/e;)Ljava/lang/Object;", "saveToServer", "q2", "(Lcom/sugarcube/decorate_engine/SceneLayout;ZLdI/e;)Ljava/lang/Object;", "p2", "(Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;Lcom/sugarcube/decorate_engine/SceneLayout;ZLdI/e;)Ljava/lang/Object;", "P1", "dirty", "a2", "r1", "name", "u2", "(Ljava/lang/String;)V", "j2", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "rating", "N1", "(Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;)V", "W", "T1", "E1", "LRF/k;", "selectedInstance", "B1", "(LRF/k;)V", "s1", "Lcom/sugarcube/app/base/data/analytics/RoomSource;", "A0", "()Lcom/sugarcube/app/base/data/analytics/RoomSource;", "items", "shouldReplace", "shouldAutoSelect", "isRestored", "F1", "(Ljava/util/List;ZZZ)V", "Lcom/sugarcube/decorate_engine/PanZoomRegion;", "R1", "(Lcom/sugarcube/decorate_engine/PanZoomRegion;)V", "Lcom/sugarcube/app/base/data/analytics/MethodType;", "methodType", "X", "(Lcom/sugarcube/app/base/data/analytics/MethodType;)V", "Y", "placeholder", "U", "(LRF/k;)Ljava/lang/Boolean;", "I1", "a1", "(LRF/k;)Z", "Landroid/net/Uri;", "m0", "()Landroid/net/Uri;", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/MultiviewAdapter$a;", "information", "Y1", "(Ljava/util/List;)V", "viewport", "O1", "(LRF/j;)V", "n2", "v1", "c0", "b0", "C1", "(LdI/e;)Ljava/lang/Object;", "w1", "z1", "A1", "y1", "Lcom/sugarcube/decorate/TemporaryDesignStateListener;", "listener", "i2", "(Lcom/sugarcube/decorate/TemporaryDesignStateListener;)V", "s2", "D1", "", "context", "x1", "(Ljava/lang/String;DLjava/lang/String;)V", "catalogItem", "Lcom/sugarcube/core/network/models/SmartaPlacementResult;", "V0", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate_engine/SceneLayout;LdI/e;)Ljava/lang/Object;", "newItem", "swappedOutItem", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$a;", "variantType", "Lcom/sugarcube/app/base/data/analytics/CatalogItemSource;", "itemSource", "Lcom/sugarcube/app/base/data/analytics/ProductParentType;", "parentType", "placementResult", "J1", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$a;Lcom/sugarcube/app/base/data/analytics/CatalogItemSource;Lcom/sugarcube/app/base/data/analytics/ProductParentType;Lcom/sugarcube/core/network/models/SmartaPlacementResult;)V", "m", "Lcom/sugarcube/app/base/data/SceneRepository;", "getSceneRepository", "()Lcom/sugarcube/app/base/data/SceneRepository;", "n", "Lcom/sugarcube/app/base/data/source/CatalogRepository;", "getCatalogRepository", "()Lcom/sugarcube/app/base/data/source/CatalogRepository;", "o", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "g0", "()Lcom/sugarcube/app/base/data/source/CompositionRepository;", "p", "LOE/q;", "W0", "()LOE/q;", "q", "Lcom/sugarcube/app/base/external/config/a;", "r", "Lcom/sugarcube/app/base/data/user/UserRepo;", "getUserRepo", "()Lcom/sugarcube/app/base/data/user/UserRepo;", "s", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "I0", "()Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "t", "LOE/e;", "u", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "v", "LRF/p;", "w", "Lcom/sugarcube/decorate/DesignStateManager;", "n0", "()Lcom/sugarcube/decorate/DesignStateManager;", "Landroidx/lifecycle/K;", "LZF/E0;", "kotlin.jvm.PlatformType", "x", "Landroidx/lifecycle/K;", "_decorateState", "LZF/a;", "y", "LZF/a;", "z0", "()LZF/a;", "setReporter$v1_release", "(LZF/a;)V", "reporter", "LSJ/j;", "", "z", "LSJ/j;", "y0", "()LSJ/j;", "navigationChannel", "LTJ/B;", "LZF/J0;", "A", "LTJ/B;", "_viewState", "Landroidx/lifecycle/F;", "B", "Landroidx/lifecycle/F;", "Y0", "()Landroidx/lifecycle/F;", "viewState", "C", "LRF/k;", "H0", "()LRF/k;", "c2", "Ljava/util/HashMap;", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lkotlin/collections/HashMap;", "D", "Ljava/util/HashMap;", "w0", "()Ljava/util/HashMap;", "modelMap", "Ljava/util/LinkedList;", "E", "Ljava/util/LinkedList;", "v0", "()Ljava/util/LinkedList;", "modelList", "", "F", "Ljava/util/List;", "placeholderList", "G", "i1", "setNewComposition", "isNewComposition", "H", "q1", "()Landroidx/lifecycle/K;", "setSceneDirty", "(Landroidx/lifecycle/K;)V", "isSceneDirty", "Lcom/sugarcube/app/base/data/database/Scene;", "I", "Lcom/sugarcube/app/base/data/database/Scene;", "E0", "()Lcom/sugarcube/app/base/data/database/Scene;", "setScene", "(Lcom/sugarcube/app/base/data/database/Scene;)V", "scene", "Lcom/sugarcube/core/network/models/Manifest;", "J", "Lcom/sugarcube/core/network/models/Manifest;", "u0", "()Lcom/sugarcube/core/network/models/Manifest;", "setManifest", "(Lcom/sugarcube/core/network/models/Manifest;)V", "manifest", "K", "Landroid/net/Uri;", "r0", "setGlbPath", "(Landroid/net/Uri;)V", "glbPath", "L", "Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "f0", "()Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "setCachedCompiledComposition", "(Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;)V", "Lcom/sugarcube/core/network/models/RoomType;", "M", "B0", "setRoomType", "roomType", "N", "g1", "isLoading", "O", "p1", "isSaving", "P", "_showSnapRotateButton", "Q", "_showMirroringButton", "Lcom/sugarcube/app/base/data/model/DecorateViewMode;", "R", "_decorateViewMode", "LTJ/P;", "S", "LTJ/P;", "l0", "()LTJ/P;", "decorateViewMode", "e1", "isEngineErrorLoggingEnabled", "d1", "isDynamicQualityEnabled", "k1", "isNewModelLoaderEnabled", "m1", "isNewSceneLoaderEnabled", "j1", "isNewCompositionLoaderEnabled", "l1", "isNewMultiViewTonemapEnabled", "n1", "isNewSingleViewTonemapEnabled", "U0", "g2", "smartaDebugMessageEnabled", "isDecorationV2Enabled", "LRF/b;", "C0", "LRF/b;", "i0", "()LRF/b;", "decorateEngineDebugInfo", "D0", "_engineErrorMessages", "_showEngineDebugInfo", "Lcom/sugarcube/decorate/v1/internal/catalog/d0;", "F0", "_itemsToPlace", "G0", "Ljava/util/UUID;", "h0", "()Ljava/util/UUID;", "sceneUUID", "_multiviewInformation", "Landroidx/lifecycle/I;", "J0", "Landroidx/lifecycle/I;", "L0", "()Landroidx/lifecycle/I;", "shouldShowMultiview", "K0", "LRF/j;", "previousViewport", "_activeViewport", "M0", "_showMultiviewDrawer", "N0", "_decorateRegionValue", "O0", "j0", "decorateRegionValue", "P0", "_showToastEvent", "Q0", "_saveCompositionEvent", "R0", "_exitEvent", "Lcom/sugarcube/decorate/v1/internal/v1/b$k;", "S0", "_showDecorateDialog", "T0", "saveAndClose", "Lcom/sugarcube/decorate_engine/EraserCounts;", "_eraserCount", "p0", "eraserCount", "_isAddItemTooltipShown", "_isMagicEraserTooltipShown", "_isSwapItemTooltipShown", "Z0", "_isFlipItemTooltipShown", "_isFocusModeTooltipShown", "b1", "_isRoomViewModeTooltipShown", "shouldShowMirrorItemTooltip", "shouldShowMultiViewTooltip", "shouldShowOrbitTooltip", "f1", "_showSmileFeedbackForm", "showSmileFeedbackForm", "h1", "isSmileFeedbackFormPresented", "LQJ/F0;", "LQJ/F0;", "loadSceneJob", "k0", "decorateState", "showSnapRotateButton", "showMirroringButton", "o0", "engineErrorMessages", "showEngineDebugInfo", "t0", "itemsToPlace", "Lcom/sugarcube/decorate_engine/SceneLayoutFormat;", "()Lcom/sugarcube/decorate_engine/SceneLayoutFormat;", "sceneLayoutFormat", "x0", "multiviewInformation", "e0", "activeViewport", "showMultiviewDrawer", "", "()F", "zoomValue", "showToastEvent", "saveCompositionEvent", "q0", "exitEvent", "showDecorateDialog", "isAddItemTooltipShown", "isMagicEraserTooltipShown", "t1", "isSwapItemTooltipShown", "isFlipItemTooltipShown", "o1", "isRoomViewModeTooltipShown", "k", "j", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 {

    /* renamed from: j1  reason: collision with root package name */
    public static final j f141938j1 = new j((DefaultConstructorMarker) null);

    /* renamed from: k1  reason: collision with root package name */
    public static final int f141939k1 = 8;
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final C16505B<C16913J0> f141940A;

    /* renamed from: A0  reason: collision with root package name */
    private boolean f141941A0;

    /* renamed from: B  reason: collision with root package name */
    private final androidx.lifecycle.F<C16913J0> f141942B;

    /* renamed from: B0  reason: collision with root package name */
    private final boolean f141943B0;

    /* renamed from: C  reason: collision with root package name */
    private RF.k f141944C;

    /* renamed from: C0  reason: collision with root package name */
    private C13549b f141945C0;

    /* renamed from: D  reason: collision with root package name */
    private final HashMap<ObjectInstanceId, RF.k> f141946D;

    /* renamed from: D0  reason: collision with root package name */
    private final K<List<DecorateView.a>> f141947D0;

    /* renamed from: E  reason: collision with root package name */
    private final LinkedList<RF.k> f141948E;

    /* renamed from: E0  reason: collision with root package name */
    private final K<Boolean> f141949E0;

    /* renamed from: F  reason: collision with root package name */
    private final List<RF.k> f141950F;

    /* renamed from: F0  reason: collision with root package name */
    private final K<List<d0>> f141951F0;

    /* renamed from: G  reason: collision with root package name */
    private boolean f141952G;

    /* renamed from: G0  reason: collision with root package name */
    private UUID f141953G0;

    /* renamed from: H  reason: collision with root package name */
    private K<Boolean> f141954H;

    /* renamed from: H0  reason: collision with root package name */
    private UUID f141955H0;

    /* renamed from: I  reason: collision with root package name */
    private Scene f141956I;

    /* renamed from: I0  reason: collision with root package name */
    private final K<List<MultiviewAdapter.a>> f141957I0;

    /* renamed from: J  reason: collision with root package name */
    private Manifest f141958J;

    /* renamed from: J0  reason: collision with root package name */
    private final androidx.lifecycle.I<Boolean> f141959J0;

    /* renamed from: K  reason: collision with root package name */
    private Uri f141960K;

    /* renamed from: K0  reason: collision with root package name */
    private RF.j f141961K0;

    /* renamed from: L  reason: collision with root package name */
    private CachedCompiledComposition f141962L;

    /* renamed from: L0  reason: collision with root package name */
    private final K<RF.j> f141963L0;

    /* renamed from: M  reason: collision with root package name */
    private K<RoomType> f141964M;

    /* renamed from: M0  reason: collision with root package name */
    private final K<Boolean> f141965M0;

    /* renamed from: N  reason: collision with root package name */
    private final K<Boolean> f141966N;

    /* renamed from: N0  reason: collision with root package name */
    private final K<PanZoomRegion> f141967N0;

    /* renamed from: O  reason: collision with root package name */
    private final K<Boolean> f141968O;

    /* renamed from: O0  reason: collision with root package name */
    private final androidx.lifecycle.F<PanZoomRegion> f141969O0;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public K<Boolean> f141970P;

    /* renamed from: P0  reason: collision with root package name */
    private final K<Integer> f141971P0;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public K<Boolean> f141972Q;
    /* access modifiers changed from: private */

    /* renamed from: Q0  reason: collision with root package name */
    public final K<Boolean> f141973Q0;

    /* renamed from: R  reason: collision with root package name */
    private final C16505B<DecorateViewMode> f141974R;

    /* renamed from: R0  reason: collision with root package name */
    private final K<Boolean> f141975R0;

    /* renamed from: S  reason: collision with root package name */
    private final C16519P<DecorateViewMode> f141976S;
    /* access modifiers changed from: private */

    /* renamed from: S0  reason: collision with root package name */
    public final K<k> f141977S0;

    /* renamed from: T  reason: collision with root package name */
    private boolean f141978T;

    /* renamed from: T0  reason: collision with root package name */
    private final K<Boolean> f141979T0;
    /* access modifiers changed from: private */

    /* renamed from: U  reason: collision with root package name */
    public boolean f141980U;

    /* renamed from: U0  reason: collision with root package name */
    private final K<EraserCounts> f141981U0;

    /* renamed from: V0  reason: collision with root package name */
    private final androidx.lifecycle.F<EraserCounts> f141982V0;
    /* access modifiers changed from: private */

    /* renamed from: W0  reason: collision with root package name */
    public final K<Boolean> f141983W0;
    /* access modifiers changed from: private */

    /* renamed from: X  reason: collision with root package name */
    public boolean f141984X;
    /* access modifiers changed from: private */

    /* renamed from: X0  reason: collision with root package name */
    public final K<Boolean> f141985X0;
    /* access modifiers changed from: private */

    /* renamed from: Y  reason: collision with root package name */
    public boolean f141986Y;
    /* access modifiers changed from: private */

    /* renamed from: Y0  reason: collision with root package name */
    public final K<Boolean> f141987Y0;
    /* access modifiers changed from: private */

    /* renamed from: Z  reason: collision with root package name */
    public boolean f141988Z;

    /* renamed from: Z0  reason: collision with root package name */
    private final K<Boolean> f141989Z0;
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public final K<Boolean> f141990a1;
    /* access modifiers changed from: private */

    /* renamed from: b1  reason: collision with root package name */
    public final K<Boolean> f141991b1;

    /* renamed from: c1  reason: collision with root package name */
    private final K<Boolean> f141992c1;

    /* renamed from: d1  reason: collision with root package name */
    private final K<Boolean> f141993d1;

    /* renamed from: e1  reason: collision with root package name */
    private final K<Boolean> f141994e1;

    /* renamed from: f1  reason: collision with root package name */
    private final K<Boolean> f141995f1;

    /* renamed from: g1  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f141996g1;
    /* access modifiers changed from: private */

    /* renamed from: h1  reason: collision with root package name */
    public final K<Boolean> f141997h1;

    /* renamed from: i1  reason: collision with root package name */
    private F0 f141998i1;

    /* renamed from: m  reason: collision with root package name */
    private final SceneRepository f141999m;

    /* renamed from: n  reason: collision with root package name */
    private final CatalogRepository f142000n;

    /* renamed from: o  reason: collision with root package name */
    private final CompositionRepository f142001o;

    /* renamed from: p  reason: collision with root package name */
    private final OE.q f142002p;

    /* renamed from: q  reason: collision with root package name */
    private final a f142003q;

    /* renamed from: r  reason: collision with root package name */
    private final UserRepo f142004r;

    /* renamed from: s  reason: collision with root package name */
    private final PreferenceStorage f142005s;

    /* renamed from: t  reason: collision with root package name */
    private final C13313e f142006t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final ConfigRepository f142007u;

    /* renamed from: v  reason: collision with root package name */
    private final RF.p f142008v;

    /* renamed from: w  reason: collision with root package name */
    private final DesignStateManager f142009w;

    /* renamed from: x  reason: collision with root package name */
    private final K<C16903E0> f142010x = new K<>(C16903E0.None);

    /* renamed from: y  reason: collision with root package name */
    private C16942a f142011y;
    /* access modifiers changed from: private */

    /* renamed from: y0  reason: collision with root package name */
    public boolean f142012y0;

    /* renamed from: z  reason: collision with root package name */
    private final C16434j<Object> f142013z = C16437m.b(0, (C16428d) null, (C17642l) null, 7, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: z0  reason: collision with root package name */
    public boolean f142014z0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$setShowFlipItemTooltipPresented$1", f = "DecorateViewModel.kt", l = {393}, m = "invokeSuspend")
    static final class A extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142015c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142016d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        A(b bVar, C17164e<? super A> eVar) {
            super(2, eVar);
            this.f142016d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new A(this.f142016d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((A) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142015c;
            if (i10 == 0) {
                XH.y.b(obj);
                PreferenceStorage I02 = this.f142016d.I0();
                f.a<Boolean> tooltip_flip_item_shown_key = PreferenceImpl.PreferencesKeys.getTOOLTIP_FLIP_ITEM_SHOWN_KEY();
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(true);
                this.f142015c = 1;
                if (I02.setPreference(tooltip_flip_item_shown_key, a10, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$setShowMagicEraserTooltipPresented$1", f = "DecorateViewModel.kt", l = {361}, m = "invokeSuspend")
    static final class B extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142017c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        B(b bVar, C17164e<? super B> eVar) {
            super(2, eVar);
            this.f142018d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new B(this.f142018d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((B) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142017c;
            if (i10 == 0) {
                XH.y.b(obj);
                PreferenceStorage I02 = this.f142018d.I0();
                f.a<Boolean> tooltip_magic_eraser_item_shown_key = PreferenceImpl.PreferencesKeys.getTOOLTIP_MAGIC_ERASER_ITEM_SHOWN_KEY();
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(true);
                this.f142017c = 1;
                if (I02.setPreference(tooltip_magic_eraser_item_shown_key, a10, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$setSmileFeedbackFormPresented$1", f = "DecorateViewModel.kt", l = {491}, m = "invokeSuspend")
    static final class C extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142019c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142020d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C(b bVar, C17164e<? super C> eVar) {
            super(2, eVar);
            this.f142020d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C(this.f142020d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142019c;
            if (i10 == 0) {
                XH.y.b(obj);
                PreferenceStorage I02 = this.f142020d.I0();
                f.a<Boolean> show_smile_feedback_key = PreferenceImpl.PreferencesKeys.getSHOW_SMILE_FEEDBACK_KEY();
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(true);
                this.f142019c = 1;
                if (I02.setPreference(show_smile_feedback_key, a10, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$setupDesignStateManager$1$1", f = "DecorateViewModel.kt", l = {1246}, m = "invokeSuspend")
    static final class D extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f142021c;

        /* renamed from: d  reason: collision with root package name */
        Object f142022d;

        /* renamed from: e  reason: collision with root package name */
        int f142023e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f142024f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ UUID f142025g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ TemporaryDesignStateListener f142026h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        D(b bVar, UUID uuid, TemporaryDesignStateListener temporaryDesignStateListener, C17164e<? super D> eVar) {
            super(2, eVar);
            this.f142024f = bVar;
            this.f142025g = uuid;
            this.f142026h = temporaryDesignStateListener;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new D(this.f142024f, this.f142025g, this.f142026h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((D) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142023e;
            if (i10 == 0) {
                XH.y.b(obj);
                DesignStateManager n02 = this.f142024f.n0();
                boolean i12 = this.f142024f.i1();
                UUID uuid = this.f142025g;
                UUID h02 = this.f142024f.h0();
                UUID randomUUID = h02 == null ? UUID.randomUUID() : h02;
                C17542s.g(randomUUID);
                TemporaryDesignStateListener temporaryDesignStateListener = this.f142026h;
                this.f142021c = randomUUID;
                this.f142022d = h02;
                this.f142023e = 1;
                if (n02.initialize(i12, uuid, randomUUID, temporaryDesignStateListener, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                UUID uuid2 = (UUID) this.f142022d;
                UUID uuid3 = (UUID) this.f142021c;
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$shouldShowMultiview$1$1$1", f = "DecorateViewModel.kt", l = {258}, m = "invokeSuspend")
    static final class E extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f142027c;

        /* renamed from: d  reason: collision with root package name */
        int f142028d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.I<Boolean> f142029e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<MultiviewAdapter.a> f142030f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f142031g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        E(androidx.lifecycle.I<Boolean> i10, List<MultiviewAdapter.a> list, b bVar, C17164e<? super E> eVar) {
            super(2, eVar);
            this.f142029e = i10;
            this.f142030f = list;
            this.f142031g = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new E(this.f142029e, this.f142030f, this.f142031g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((E) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.I<Boolean> i10;
            androidx.lifecycle.I<Boolean> i11;
            Object f10 = C17187b.f();
            int i12 = this.f142028d;
            boolean z10 = true;
            if (i12 == 0) {
                XH.y.b(obj);
                i11 = this.f142029e;
                if (this.f142030f.size() > 1) {
                    ConfigRepository j10 = this.f142031g.f142007u;
                    FeatureFlags.EnableGLTFScenes enableGLTFScenes = FeatureFlags.EnableGLTFScenes.INSTANCE;
                    this.f142027c = i11;
                    this.f142028d = 1;
                    Object obj2 = j10.get(enableGLTFScenes, this);
                    if (obj2 == f10) {
                        return f10;
                    }
                    i10 = i11;
                    obj = obj2;
                }
                z10 = false;
                i10 = i11;
                i10.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
                return C16807N.f139792a;
            } else if (i12 == 1) {
                i10 = (androidx.lifecycle.I) this.f142027c;
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((Boolean) obj).booleanValue()) {
                i11 = i10;
                z10 = false;
                i10 = i11;
            }
            i10.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$showOrbitTooltip$1", f = "DecorateViewModel.kt", l = {460, 463}, m = "invokeSuspend")
    static final class F extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142032c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142033d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        F(b bVar, C17164e<? super F> eVar) {
            super(2, eVar);
            this.f142033d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new F(this.f142033d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((F) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142032c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16434j<Object> y02 = this.f142033d.y0();
                C16841b bVar = C16841b.INSTANCE;
                this.f142032c = 1;
                if (y02.y(bVar, this) == f10) {
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
            this.f142033d.M0().setValue(kotlin.coroutines.jvm.internal.b.a(false));
            PreferenceStorage I02 = this.f142033d.I0();
            f.a<Boolean> tooltip_orbit_shown_key = PreferenceImpl.PreferencesKeys.getTOOLTIP_ORBIT_SHOWN_KEY();
            Boolean a10 = kotlin.coroutines.jvm.internal.b.a(true);
            this.f142032c = 2;
            if (I02.setPreference(tooltip_orbit_shown_key, a10, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel", f = "DecorateViewModel.kt", l = {641}, m = "updateComposition")
    static final class G extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142034c;

        /* renamed from: d  reason: collision with root package name */
        Object f142035d;

        /* renamed from: e  reason: collision with root package name */
        Object f142036e;

        /* renamed from: f  reason: collision with root package name */
        Object f142037f;

        /* renamed from: g  reason: collision with root package name */
        Object f142038g;

        /* renamed from: h  reason: collision with root package name */
        Object f142039h;

        /* renamed from: i  reason: collision with root package name */
        Object f142040i;

        /* renamed from: j  reason: collision with root package name */
        Object f142041j;

        /* renamed from: k  reason: collision with root package name */
        boolean f142042k;

        /* renamed from: l  reason: collision with root package name */
        int f142043l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f142044m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ b f142045n;

        /* renamed from: o  reason: collision with root package name */
        int f142046o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        G(b bVar, C17164e<? super G> eVar) {
            super(eVar);
            this.f142045n = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142044m = obj;
            this.f142046o |= Integer.MIN_VALUE;
            return this.f142045n.q2((SceneLayout) null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel", f = "DecorateViewModel.kt", l = {694}, m = "updateComposition")
    static final class H extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142047c;

        /* renamed from: d  reason: collision with root package name */
        Object f142048d;

        /* renamed from: e  reason: collision with root package name */
        Object f142049e;

        /* renamed from: f  reason: collision with root package name */
        Object f142050f;

        /* renamed from: g  reason: collision with root package name */
        Object f142051g;

        /* renamed from: h  reason: collision with root package name */
        Object f142052h;

        /* renamed from: i  reason: collision with root package name */
        Object f142053i;

        /* renamed from: j  reason: collision with root package name */
        Object f142054j;

        /* renamed from: k  reason: collision with root package name */
        Object f142055k;

        /* renamed from: l  reason: collision with root package name */
        boolean f142056l;

        /* renamed from: m  reason: collision with root package name */
        int f142057m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f142058n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ b f142059o;

        /* renamed from: p  reason: collision with root package name */
        int f142060p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        H(b bVar, C17164e<? super H> eVar) {
            super(eVar);
            this.f142059o = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142058n = obj;
            this.f142060p |= Integer.MIN_VALUE;
            return this.f142059o.p2((CachedCompiledComposition) null, (SceneLayout) null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$updateDesignState$1$1", f = "DecorateViewModel.kt", l = {1267}, m = "invokeSuspend")
    static final class I extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142061c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142062d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UUID f142063e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ IDecorateEngine f142064f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        I(b bVar, UUID uuid, IDecorateEngine iDecorateEngine, C17164e<? super I> eVar) {
            super(2, eVar);
            this.f142062d = bVar;
            this.f142063e = uuid;
            this.f142064f = iDecorateEngine;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new I(this.f142062d, this.f142063e, this.f142064f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((I) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142061c;
            if (i10 == 0) {
                XH.y.b(obj);
                DesignStateManager n02 = this.f142062d.n0();
                boolean i12 = this.f142062d.i1();
                UUID uuid = this.f142063e;
                UUID h02 = this.f142062d.h0();
                IDecorateEngine iDecorateEngine = this.f142064f;
                HashMap<ObjectInstanceId, RF.k> w02 = this.f142062d.w0();
                this.f142061c = 1;
                if (n02.updateDesignState(i12, uuid, h02, iDecorateEngine, w02, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$1", f = "DecorateViewModel.kt", l = {504}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$a  reason: case insensitive filesystem */
    static final class C17114a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142065c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142066d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$a$a  reason: collision with other inner class name */
        static final class C3468a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f142067a;

            C3468a(b bVar) {
                this.f142067a = bVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f142067a.f141987Y0.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17114a(b bVar, C17164e<? super C17114a> eVar) {
            super(2, eVar);
            this.f142066d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C17114a(this.f142066d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17114a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142065c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<Boolean> preference = this.f142066d.I0().getPreference(PreferenceImpl.PreferencesKeys.getTOOLTIP_SWAP_ITEM_SHOWN_KEY(), kotlin.coroutines.jvm.internal.b.a(false));
                C3468a aVar = new C3468a(this.f142066d);
                this.f142065c = 1;
                if (preference.collect(aVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$2", f = "DecorateViewModel.kt", l = {509}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$b  reason: collision with other inner class name */
    static final class C3469b extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142068c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142069d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$b$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f142070a;

            a(b bVar) {
                this.f142070a = bVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f142070a.f141983W0.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3469b(b bVar, C17164e<? super C3469b> eVar) {
            super(2, eVar);
            this.f142069d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3469b(this.f142069d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3469b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142068c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<Boolean> preference = this.f142069d.I0().getPreference(PreferenceImpl.PreferencesKeys.getTOOLTIP_ADD_ITEM_SHOWN_KEY(), kotlin.coroutines.jvm.internal.b.a(false));
                a aVar = new a(this.f142069d);
                this.f142068c = 1;
                if (preference.collect(aVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$3", f = "DecorateViewModel.kt", l = {514}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$c  reason: case insensitive filesystem */
    static final class C17115c extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142071c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142072d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$c$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f142073a;

            a(b bVar) {
                this.f142073a = bVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f142073a.f141985X0.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17115c(b bVar, C17164e<? super C17115c> eVar) {
            super(2, eVar);
            this.f142072d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C17115c(this.f142072d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17115c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142071c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<Boolean> preference = this.f142072d.I0().getPreference(PreferenceImpl.PreferencesKeys.getTOOLTIP_MAGIC_ERASER_ITEM_SHOWN_KEY(), kotlin.coroutines.jvm.internal.b.a(false));
                a aVar = new a(this.f142072d);
                this.f142071c = 1;
                if (preference.collect(aVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$4", f = "DecorateViewModel.kt", l = {519}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$d  reason: case insensitive filesystem */
    static final class C17116d extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142074c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142075d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$d$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f142076a;

            a(b bVar) {
                this.f142076a = bVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f142076a.f141990a1.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17116d(b bVar, C17164e<? super C17116d> eVar) {
            super(2, eVar);
            this.f142075d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C17116d(this.f142075d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17116d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142074c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<Boolean> preference = this.f142075d.I0().getPreference(PreferenceImpl.PreferencesKeys.getTOOLTIP_FOCUS_MODE_SHOWN_KEY(), kotlin.coroutines.jvm.internal.b.a(false));
                a aVar = new a(this.f142075d);
                this.f142074c = 1;
                if (preference.collect(aVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$5", f = "DecorateViewModel.kt", l = {524}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$e  reason: case insensitive filesystem */
    static final class C17117e extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142077c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142078d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$e$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f142079a;

            a(b bVar) {
                this.f142079a = bVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f142079a.f141991b1.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17117e(b bVar, C17164e<? super C17117e> eVar) {
            super(2, eVar);
            this.f142078d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C17117e(this.f142078d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17117e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142077c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<Boolean> preference = this.f142078d.I0().getPreference(PreferenceImpl.PreferencesKeys.getTOOLTIP_ROOM_VIEW_MODE_SHOWN_KEY(), kotlin.coroutines.jvm.internal.b.a(false));
                a aVar = new a(this.f142078d);
                this.f142077c = 1;
                if (preference.collect(aVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$6", f = "DecorateViewModel.kt", l = {529}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$f  reason: case insensitive filesystem */
    static final class C17118f extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142080c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142081d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$f$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f142082a;

            a(b bVar) {
                this.f142082a = bVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f142082a.J0().setValue(kotlin.coroutines.jvm.internal.b.a(!z10));
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17118f(b bVar, C17164e<? super C17118f> eVar) {
            super(2, eVar);
            this.f142081d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C17118f(this.f142081d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17118f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142080c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<Boolean> preference = this.f142081d.I0().getPreference(PreferenceImpl.PreferencesKeys.getTOOLTIP_MIRROR_ITEM_SHOWN_KEY(), kotlin.coroutines.jvm.internal.b.a(false));
                a aVar = new a(this.f142081d);
                this.f142080c = 1;
                if (preference.collect(aVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$7", f = "DecorateViewModel.kt", l = {534}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$g  reason: case insensitive filesystem */
    static final class C17119g extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142083c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142084d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$g$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f142085a;

            a(b bVar) {
                this.f142085a = bVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f142085a.M0().setValue(kotlin.coroutines.jvm.internal.b.a(!z10));
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17119g(b bVar, C17164e<? super C17119g> eVar) {
            super(2, eVar);
            this.f142084d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C17119g(this.f142084d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17119g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142083c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<Boolean> preference = this.f142084d.I0().getPreference(PreferenceImpl.PreferencesKeys.getTOOLTIP_ORBIT_SHOWN_KEY(), kotlin.coroutines.jvm.internal.b.a(false));
                a aVar = new a(this.f142084d);
                this.f142083c = 1;
                if (preference.collect(aVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$8", f = "DecorateViewModel.kt", l = {539}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$h  reason: case insensitive filesystem */
    static final class C17120h extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142086c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142087d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$h$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f142088a;

            a(b bVar) {
                this.f142088a = bVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f142088a.K0().setValue(kotlin.coroutines.jvm.internal.b.a(!z10));
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17120h(b bVar, C17164e<? super C17120h> eVar) {
            super(2, eVar);
            this.f142087d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C17120h(this.f142087d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17120h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142086c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<Boolean> preference = this.f142087d.I0().getPreference(PreferenceImpl.PreferencesKeys.getTOOLTIP_MULTIVIEW_SHOWN_KEY(), kotlin.coroutines.jvm.internal.b.a(false));
                a aVar = new a(this.f142087d);
                this.f142086c = 1;
                if (preference.collect(aVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$9", f = "DecorateViewModel.kt", l = {547, 548, 549, 550, 551, 552, 553}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$i  reason: case insensitive filesystem */
    static final class C17121i extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f142089c;

        /* renamed from: d  reason: collision with root package name */
        Object f142090d;

        /* renamed from: e  reason: collision with root package name */
        int f142091e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f142092f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17121i(b bVar, C17164e<? super C17121i> eVar) {
            super(2, eVar);
            this.f142092f = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C17121i(this.f142092f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17121i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
            com.sugarcube.decorate.v1.internal.v1.b.O(r1, ((java.lang.Boolean) r8).booleanValue());
            r1 = r7.f142092f;
            r2 = com.sugarcube.decorate.v1.internal.v1.b.j(r1);
            r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewSceneLoader.INSTANCE;
            r7.f142089c = r1;
            r7.f142090d = r8;
            r7.f142091e = 2;
            r8 = r2.get(r3, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
            if (r8 != r0) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
            com.sugarcube.decorate.v1.internal.v1.b.Q(r1, ((java.lang.Boolean) r8).booleanValue());
            r1 = r7.f142092f;
            r2 = com.sugarcube.decorate.v1.internal.v1.b.j(r1);
            r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewCompositionLoader.INSTANCE;
            r7.f142089c = r1;
            r7.f142090d = r8;
            r7.f142091e = 3;
            r8 = r2.get(r3, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a1, code lost:
            if (r8 != r0) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a3, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a4, code lost:
            com.sugarcube.decorate.v1.internal.v1.b.N(r1, ((java.lang.Boolean) r8).booleanValue());
            r1 = r7.f142092f;
            r2 = com.sugarcube.decorate.v1.internal.v1.b.j(r1);
            r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewMultiViewTonemap.INSTANCE;
            r7.f142089c = r1;
            r7.f142090d = r8;
            r7.f142091e = 4;
            r8 = r2.get(r3, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c1, code lost:
            if (r8 != r0) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c3, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c4, code lost:
            com.sugarcube.decorate.v1.internal.v1.b.P(r1, ((java.lang.Boolean) r8).booleanValue());
            r1 = r7.f142092f;
            r2 = com.sugarcube.decorate.v1.internal.v1.b.j(r1);
            r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewSingleViewTonemap.INSTANCE;
            r7.f142089c = r1;
            r7.f142090d = r8;
            r7.f142091e = 5;
            r8 = r2.get(r3, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e1, code lost:
            if (r8 != r0) goto L_0x00e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e3, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e4, code lost:
            com.sugarcube.decorate.v1.internal.v1.b.R(r1, ((java.lang.Boolean) r8).booleanValue());
            r1 = r7.f142092f;
            r2 = com.sugarcube.decorate.v1.internal.v1.b.j(r1);
            r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableDynamicQuality.INSTANCE;
            r7.f142089c = r1;
            r7.f142090d = r8;
            r7.f142091e = 6;
            r8 = r2.get(r3, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0101, code lost:
            if (r8 != r0) goto L_0x0104;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0103, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0104, code lost:
            com.sugarcube.decorate.v1.internal.v1.b.M(r1, ((java.lang.Boolean) r8).booleanValue());
            r1 = r7.f142092f;
            r2 = com.sugarcube.decorate.v1.internal.v1.b.j(r1);
            r3 = com.sugarcube.app.base.data.feature.ConfigItems.SmartaPlacementDebugMessage.INSTANCE;
            r7.f142089c = r1;
            r7.f142090d = r8;
            r7.f142091e = 7;
            r8 = r2.get(r3, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0121, code lost:
            if (r8 != r0) goto L_0x0124;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0123, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0124, code lost:
            r0 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0125, code lost:
            r0.g2(((java.lang.Boolean) r8).booleanValue());
            r8 = com.sugarcube.decorate.v1.internal.v1.b.K(r7.f142092f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0134, code lost:
            r0 = r8.getValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0148, code lost:
            if (r8.e(r0, ZF.C16913J0.b((ZF.C16913J0) r0, (RF.k) null, (com.sugarcube.app.base.data.model.DecorateViewMode) null, true, 3, (java.lang.Object) null)) == false) goto L_0x0134;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x014c, code lost:
            return XH.C16807N.f139792a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r7.f142091e
                switch(r1) {
                    case 0: goto L_0x004d;
                    case 1: goto L_0x0045;
                    case 2: goto L_0x003d;
                    case 3: goto L_0x0035;
                    case 4: goto L_0x002c;
                    case 5: goto L_0x0023;
                    case 6: goto L_0x001a;
                    case 7: goto L_0x0011;
                    default: goto L_0x0009;
                }
            L_0x0009:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0011:
                java.lang.Object r0 = r7.f142089c
                com.sugarcube.decorate.v1.internal.v1.b r0 = (com.sugarcube.decorate.v1.internal.v1.b) r0
                XH.y.b(r8)
                goto L_0x0125
            L_0x001a:
                java.lang.Object r1 = r7.f142089c
                com.sugarcube.decorate.v1.internal.v1.b r1 = (com.sugarcube.decorate.v1.internal.v1.b) r1
                XH.y.b(r8)
                goto L_0x0104
            L_0x0023:
                java.lang.Object r1 = r7.f142089c
                com.sugarcube.decorate.v1.internal.v1.b r1 = (com.sugarcube.decorate.v1.internal.v1.b) r1
                XH.y.b(r8)
                goto L_0x00e4
            L_0x002c:
                java.lang.Object r1 = r7.f142089c
                com.sugarcube.decorate.v1.internal.v1.b r1 = (com.sugarcube.decorate.v1.internal.v1.b) r1
                XH.y.b(r8)
                goto L_0x00c4
            L_0x0035:
                java.lang.Object r1 = r7.f142089c
                com.sugarcube.decorate.v1.internal.v1.b r1 = (com.sugarcube.decorate.v1.internal.v1.b) r1
                XH.y.b(r8)
                goto L_0x00a4
            L_0x003d:
                java.lang.Object r1 = r7.f142089c
                com.sugarcube.decorate.v1.internal.v1.b r1 = (com.sugarcube.decorate.v1.internal.v1.b) r1
                XH.y.b(r8)
                goto L_0x0084
            L_0x0045:
                java.lang.Object r1 = r7.f142089c
                com.sugarcube.decorate.v1.internal.v1.b r1 = (com.sugarcube.decorate.v1.internal.v1.b) r1
                XH.y.b(r8)
                goto L_0x0064
            L_0x004d:
                XH.y.b(r8)
                com.sugarcube.decorate.v1.internal.v1.b r1 = r7.f142092f
                com.sugarcube.app.base.data.feature.ConfigRepository r8 = r1.f142007u
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableNewModelLoader r2 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewModelLoader.INSTANCE
                r7.f142089c = r1
                r3 = 1
                r7.f142091e = r3
                java.lang.Object r8 = r8.get(r2, r7)
                if (r8 != r0) goto L_0x0064
                return r0
            L_0x0064:
                r2 = r8
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                r1.f141984X = r2
                com.sugarcube.decorate.v1.internal.v1.b r1 = r7.f142092f
                com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.f142007u
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableNewSceneLoader r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewSceneLoader.INSTANCE
                r7.f142089c = r1
                r7.f142090d = r8
                r8 = 2
                r7.f142091e = r8
                java.lang.Object r8 = r2.get(r3, r7)
                if (r8 != r0) goto L_0x0084
                return r0
            L_0x0084:
                r2 = r8
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                r1.f141986Y = r2
                com.sugarcube.decorate.v1.internal.v1.b r1 = r7.f142092f
                com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.f142007u
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableNewCompositionLoader r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewCompositionLoader.INSTANCE
                r7.f142089c = r1
                r7.f142090d = r8
                r8 = 3
                r7.f142091e = r8
                java.lang.Object r8 = r2.get(r3, r7)
                if (r8 != r0) goto L_0x00a4
                return r0
            L_0x00a4:
                r2 = r8
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                r1.f141988Z = r2
                com.sugarcube.decorate.v1.internal.v1.b r1 = r7.f142092f
                com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.f142007u
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableNewMultiViewTonemap r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewMultiViewTonemap.INSTANCE
                r7.f142089c = r1
                r7.f142090d = r8
                r8 = 4
                r7.f142091e = r8
                java.lang.Object r8 = r2.get(r3, r7)
                if (r8 != r0) goto L_0x00c4
                return r0
            L_0x00c4:
                r2 = r8
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                r1.f142012y0 = r2
                com.sugarcube.decorate.v1.internal.v1.b r1 = r7.f142092f
                com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.f142007u
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableNewSingleViewTonemap r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewSingleViewTonemap.INSTANCE
                r7.f142089c = r1
                r7.f142090d = r8
                r8 = 5
                r7.f142091e = r8
                java.lang.Object r8 = r2.get(r3, r7)
                if (r8 != r0) goto L_0x00e4
                return r0
            L_0x00e4:
                r2 = r8
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                r1.f142014z0 = r2
                com.sugarcube.decorate.v1.internal.v1.b r1 = r7.f142092f
                com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.f142007u
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableDynamicQuality r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableDynamicQuality.INSTANCE
                r7.f142089c = r1
                r7.f142090d = r8
                r8 = 6
                r7.f142091e = r8
                java.lang.Object r8 = r2.get(r3, r7)
                if (r8 != r0) goto L_0x0104
                return r0
            L_0x0104:
                r2 = r8
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                r1.f141980U = r2
                com.sugarcube.decorate.v1.internal.v1.b r1 = r7.f142092f
                com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.f142007u
                com.sugarcube.app.base.data.feature.ConfigItems$SmartaPlacementDebugMessage r3 = com.sugarcube.app.base.data.feature.ConfigItems.SmartaPlacementDebugMessage.INSTANCE
                r7.f142089c = r1
                r7.f142090d = r8
                r8 = 7
                r7.f142091e = r8
                java.lang.Object r8 = r2.get(r3, r7)
                if (r8 != r0) goto L_0x0124
                return r0
            L_0x0124:
                r0 = r1
            L_0x0125:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                r0.g2(r8)
                com.sugarcube.decorate.v1.internal.v1.b r8 = r7.f142092f
                TJ.B r8 = r8.f141940A
            L_0x0134:
                java.lang.Object r0 = r8.getValue()
                r1 = r0
                ZF.J0 r1 = (ZF.C16913J0) r1
                r5 = 3
                r6 = 0
                r2 = 0
                r3 = 0
                r4 = 1
                ZF.J0 r1 = ZF.C16913J0.b(r1, r2, r3, r4, r5, r6)
                boolean r0 = r8.e(r0, r1)
                if (r0 == 0) goto L_0x0134
                XH.N r8 = XH.C16807N.f139792a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.b.C17121i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/b$j;", "", "<init>", "()V", "", "MIN_ZOOM_VALUE", "F", "MAX_ZOOM_VALUE", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/b$k;", "", "<init>", "(Ljava/lang/String;I)V", "DESIGN_NAME_PROMPT_DIALOG", "EXIT_CONFIRMATION_DIALOG", "EXIT_SAVE_PROMPT_DIALOG", "LOGIN_SAVE_DIALOG", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum k {
        DESIGN_NAME_PROMPT_DIALOG,
        EXIT_CONFIRMATION_DIALOG,
        EXIT_SAVE_PROMPT_DIALOG,
        LOGIN_SAVE_DIALOG;

        static {
            k[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$cleanUpAndExit$1", f = "DecorateViewModel.kt", l = {1120}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f142093c;

        /* renamed from: d  reason: collision with root package name */
        Object f142094d;

        /* renamed from: e  reason: collision with root package name */
        int f142095e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f142096f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(b bVar, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f142096f = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new l(this.f142096f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142095e;
            if (i10 == 0) {
                XH.y.b(obj);
                DesignStateManager n02 = this.f142096f.n0();
                UUID G02 = this.f142096f.G0();
                UUID randomUUID = G02 == null ? UUID.randomUUID() : G02;
                C17542s.g(randomUUID);
                UUID h02 = this.f142096f.h0();
                this.f142093c = randomUUID;
                this.f142094d = G02;
                this.f142095e = 1;
                if (n02.cleanUpTemporaryDesignState(randomUUID, h02, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                UUID uuid = (UUID) this.f142094d;
                UUID uuid2 = (UUID) this.f142093c;
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$enterFocusMode$2", f = "DecorateViewModel.kt", l = {1013}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142097c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142098d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f142098d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new m(this.f142098d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((m) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142097c;
            if (i10 == 0) {
                XH.y.b(obj);
                this.f142097c = 1;
                if (C16297b0.b(5000, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f142098d.o2();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel", f = "DecorateViewModel.kt", l = {730, 736, 751, 767, 770, 793, 807, 825, 833}, m = "fetch")
    static final class n extends d {

        /* renamed from: A  reason: collision with root package name */
        Object f142099A;

        /* renamed from: B  reason: collision with root package name */
        Object f142100B;

        /* renamed from: C  reason: collision with root package name */
        Object f142101C;

        /* renamed from: D  reason: collision with root package name */
        int f142102D;

        /* renamed from: E  reason: collision with root package name */
        int f142103E;

        /* renamed from: F  reason: collision with root package name */
        int f142104F;

        /* renamed from: G  reason: collision with root package name */
        int f142105G;

        /* renamed from: H  reason: collision with root package name */
        int f142106H;

        /* renamed from: I  reason: collision with root package name */
        int f142107I;

        /* renamed from: J  reason: collision with root package name */
        /* synthetic */ Object f142108J;

        /* renamed from: K  reason: collision with root package name */
        final /* synthetic */ b f142109K;

        /* renamed from: L  reason: collision with root package name */
        int f142110L;

        /* renamed from: c  reason: collision with root package name */
        Object f142111c;

        /* renamed from: d  reason: collision with root package name */
        Object f142112d;

        /* renamed from: e  reason: collision with root package name */
        Object f142113e;

        /* renamed from: f  reason: collision with root package name */
        Object f142114f;

        /* renamed from: g  reason: collision with root package name */
        Object f142115g;

        /* renamed from: h  reason: collision with root package name */
        Object f142116h;

        /* renamed from: i  reason: collision with root package name */
        Object f142117i;

        /* renamed from: j  reason: collision with root package name */
        Object f142118j;

        /* renamed from: k  reason: collision with root package name */
        Object f142119k;

        /* renamed from: l  reason: collision with root package name */
        Object f142120l;

        /* renamed from: m  reason: collision with root package name */
        Object f142121m;

        /* renamed from: n  reason: collision with root package name */
        Object f142122n;

        /* renamed from: o  reason: collision with root package name */
        Object f142123o;

        /* renamed from: p  reason: collision with root package name */
        Object f142124p;

        /* renamed from: q  reason: collision with root package name */
        Object f142125q;

        /* renamed from: r  reason: collision with root package name */
        Object f142126r;

        /* renamed from: s  reason: collision with root package name */
        Object f142127s;

        /* renamed from: t  reason: collision with root package name */
        Object f142128t;

        /* renamed from: u  reason: collision with root package name */
        Object f142129u;

        /* renamed from: v  reason: collision with root package name */
        Object f142130v;

        /* renamed from: w  reason: collision with root package name */
        Object f142131w;

        /* renamed from: x  reason: collision with root package name */
        Object f142132x;

        /* renamed from: y  reason: collision with root package name */
        Object f142133y;

        /* renamed from: z  reason: collision with root package name */
        Object f142134z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar, C17164e<? super n> eVar) {
            super(eVar);
            this.f142109K = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142108J = obj;
            this.f142110L |= Integer.MIN_VALUE;
            return this.f142109K.Z((UUID) null, (UUID) null, (Resources) null, (List<String>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$isCompositionGLTFEnabled$1", f = "DecorateViewModel.kt", l = {955, 955}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142135c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142136d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(b bVar, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f142136d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new o(this.f142136d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((o) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
            if (((java.lang.Boolean) r5).booleanValue() == false) goto L_0x0054;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r4.f142135c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                XH.y.b(r5)
                goto L_0x004b
            L_0x0012:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x001a:
                XH.y.b(r5)
                goto L_0x0032
            L_0x001e:
                XH.y.b(r5)
                com.sugarcube.decorate.v1.internal.v1.b r5 = r4.f142136d
                com.sugarcube.app.base.data.feature.ConfigRepository r5 = r5.f142007u
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableGLTFScenes r1 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableGLTFScenes.INSTANCE
                r4.f142135c = r3
                java.lang.Object r5 = r5.get(r1, r4)
                if (r5 != r0) goto L_0x0032
                return r0
            L_0x0032:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0054
                com.sugarcube.decorate.v1.internal.v1.b r5 = r4.f142136d
                com.sugarcube.app.base.data.feature.ConfigRepository r5 = r5.f142007u
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableGLTFCompositions r1 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableGLTFCompositions.INSTANCE
                r4.f142135c = r2
                java.lang.Object r5 = r5.get(r1, r4)
                if (r5 != r0) goto L_0x004b
                return r0
            L_0x004b:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0054
                goto L_0x0055
            L_0x0054:
                r3 = 0
            L_0x0055:
                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.b.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$load$1", f = "DecorateViewModel.kt", l = {587}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f142137c;

        /* renamed from: d  reason: collision with root package name */
        int f142138d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f142139e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ UUID f142140f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ UUID f142141g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Resources f142142h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ List<String> f142143i;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$load$1$1", f = "DecorateViewModel.kt", l = {592}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f142144c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b f142145d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.sugarcube.decorate.v1.internal.v1.b$p$a$a  reason: collision with other inner class name */
            static final class C3470a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f142146a;

                C3470a(b bVar) {
                    this.f142146a = bVar;
                }

                public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                    this.f142146a.f141997h1.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
                    return C16807N.f139792a;
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                    return c(((Boolean) obj).booleanValue(), eVar);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f142145d = bVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f142145d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f142144c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    C16532g<Boolean> preference = this.f142145d.I0().getPreference(PreferenceImpl.PreferencesKeys.getSHOW_SMILE_FEEDBACK_KEY(), kotlin.coroutines.jvm.internal.b.a(false));
                    C3470a aVar = new C3470a(this.f142145d);
                    this.f142144c = 1;
                    if (preference.collect(aVar, this) == f10) {
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
        p(b bVar, UUID uuid, UUID uuid2, Resources resources, List<String> list, C17164e<? super p> eVar) {
            super(2, eVar);
            this.f142139e = bVar;
            this.f142140f = uuid;
            this.f142141g = uuid2;
            this.f142142h = resources;
            this.f142143i = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new p(this.f142139e, this.f142140f, this.f142141g, this.f142142h, this.f142143i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((p) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142138d;
            if (i10 == 0) {
                XH.y.b(obj);
                b bVar = this.f142139e;
                UUID uuid = this.f142140f;
                UUID uuid2 = this.f142141g;
                C17542s.g(uuid2);
                Resources resources = this.f142142h;
                List<String> list = this.f142143i;
                this.f142137c = uuid2;
                this.f142138d = 1;
                if (bVar.Z(uuid, uuid2, resources, list, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                UUID uuid3 = (UUID) this.f142137c;
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            F0 unused = C16314k.d(g0.a(this.f142139e), C16311i0.c(), (T) null, new a(this.f142139e, (C17164e<? super a>) null), 2, (Object) null);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel", f = "DecorateViewModel.kt", l = {1179}, m = "onSaveDesign")
    static final class q extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142147c;

        /* renamed from: d  reason: collision with root package name */
        Object f142148d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f142149e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f142150f;

        /* renamed from: g  reason: collision with root package name */
        int f142151g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(b bVar, C17164e<? super q> eVar) {
            super(eVar);
            this.f142150f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142149e = obj;
            this.f142151g |= Integer.MIN_VALUE;
            return this.f142150f.C1(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class r<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f142152a;

        r(b bVar) {
            this.f142152a = bVar;
        }

        public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
            if (!z10) {
                this.f142152a.f141977S0.setValue(k.LOGIN_SAVE_DIALOG);
            } else if (this.f142152a.i1()) {
                this.f142152a.f141977S0.setValue(k.DESIGN_NAME_PROMPT_DIALOG);
            } else {
                this.f142152a.f141973Q0.setValue(kotlin.coroutines.jvm.internal.b.a(true));
            }
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
            return c(((Boolean) obj).booleanValue(), eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class s implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f142153a;

        s(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f142153a = lVar;
        }

        public final C16818i<?> c() {
            return this.f142153a;
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
            this.f142153a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$selectedInstance$1", f = "DecorateViewModel.kt", l = {}, m = "invokeSuspend")
    static final class t extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142154c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142155d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RF.k f142156e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(b bVar, RF.k kVar, C17164e<? super t> eVar) {
            super(2, eVar);
            this.f142155d = bVar;
            this.f142156e = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new t(this.f142155d, this.f142156e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((t) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
            r0 = r0.d();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                eI.C17187b.f()
                int r0 = r3.f142154c
                if (r0 != 0) goto L_0x004d
                XH.y.b(r4)
                com.sugarcube.decorate.v1.internal.v1.b r4 = r3.f142155d
                androidx.lifecycle.K r4 = r4.f141970P
                RF.k r0 = r3.f142156e
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0024
                com.sugarcube.app.base.data.database.CachedCatalogItem r0 = r0.d()
                if (r0 == 0) goto L_0x0024
                boolean r0 = r0.getCanSnapRotate()
                if (r0 != r2) goto L_0x0024
                r0 = r2
                goto L_0x0025
            L_0x0024:
                r0 = r1
            L_0x0025:
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
                r4.postValue(r0)
                com.sugarcube.decorate.v1.internal.v1.b r4 = r3.f142155d
                androidx.lifecycle.K r4 = r4.f141972Q
                RF.k r0 = r3.f142156e
                if (r0 == 0) goto L_0x0043
                com.sugarcube.app.base.data.database.CachedCatalogItem r0 = r0.d()
                if (r0 == 0) goto L_0x0043
                boolean r0 = r0.isMirroringCapable()
                if (r0 != r2) goto L_0x0043
                r1 = r2
            L_0x0043:
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r1)
                r4.postValue(r0)
                XH.N r4 = XH.C16807N.f139792a
                return r4
            L_0x004d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.b.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$sendFeedback$1", f = "DecorateViewModel.kt", l = {901}, m = "invokeSuspend")
    static final class u extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142157c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142158d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FeedbackSmileRatingBar.a f142159e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(b bVar, FeedbackSmileRatingBar.a aVar, C17164e<? super u> eVar) {
            super(2, eVar);
            this.f142158d = bVar;
            this.f142159e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new u(this.f142158d, this.f142159e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((u) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142157c;
            if (i10 == 0) {
                XH.y.b(obj);
                PreferenceStorage I02 = this.f142158d.I0();
                f.a<Integer> first_capture_rating_key = PreferenceImpl.PreferencesKeys.getFIRST_CAPTURE_RATING_KEY();
                Integer e10 = kotlin.coroutines.jvm.internal.b.e(this.f142159e.b());
                this.f142157c = 1;
                if (I02.setPreference(first_capture_rating_key, e10, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$setHasPlacedItem$1", f = "DecorateViewModel.kt", l = {921, 922}, m = "invokeSuspend")
    static final class v extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142160c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142161d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(b bVar, C17164e<? super v> eVar) {
            super(2, eVar);
            this.f142161d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new v(this.f142161d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((v) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142160c;
            if (i10 == 0) {
                XH.y.b(obj);
                ConfigRepository j10 = this.f142161d.f142007u;
                ConfigItems.UserHasPlacedItem userHasPlacedItem = ConfigItems.UserHasPlacedItem.INSTANCE;
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(true);
                this.f142160c = 1;
                if (j10.override(userHasPlacedItem, a10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else if (i10 == 2) {
                XH.y.b(obj);
                this.f142161d.v2();
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long millis = TimeUnit.MINUTES.toMillis(2);
            this.f142160c = 2;
            if (C16297b0.b(millis, this) == f10) {
                return f10;
            }
            this.f142161d.v2();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$setMirrorItemTooltipPresented$1", f = "DecorateViewModel.kt", l = {434}, m = "invokeSuspend")
    static final class w extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142162c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142163d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(b bVar, C17164e<? super w> eVar) {
            super(2, eVar);
            this.f142163d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new w(this.f142163d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((w) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142162c;
            if (i10 == 0) {
                XH.y.b(obj);
                PreferenceStorage I02 = this.f142163d.I0();
                f.a<Boolean> tooltip_mirror_item_shown_key = PreferenceImpl.PreferencesKeys.getTOOLTIP_MIRROR_ITEM_SHOWN_KEY();
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(true);
                this.f142162c = 1;
                if (I02.setPreference(tooltip_mirror_item_shown_key, a10, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$setMultiViewTooltipPresented$1", f = "DecorateViewModel.kt", l = {446}, m = "invokeSuspend")
    static final class x extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142164c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142165d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(b bVar, C17164e<? super x> eVar) {
            super(2, eVar);
            this.f142165d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new x(this.f142165d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((x) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142164c;
            if (i10 == 0) {
                XH.y.b(obj);
                PreferenceStorage I02 = this.f142165d.I0();
                f.a<Boolean> tooltip_multiview_shown_key = PreferenceImpl.PreferencesKeys.getTOOLTIP_MULTIVIEW_SHOWN_KEY();
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(true);
                this.f142164c = 1;
                if (I02.setPreference(tooltip_multiview_shown_key, a10, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$setRoomViewModeTooltipPresented$1", f = "DecorateViewModel.kt", l = {422}, m = "invokeSuspend")
    static final class y extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142166c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142167d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(b bVar, C17164e<? super y> eVar) {
            super(2, eVar);
            this.f142167d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new y(this.f142167d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((y) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142166c;
            if (i10 == 0) {
                XH.y.b(obj);
                PreferenceStorage I02 = this.f142167d.I0();
                f.a<Boolean> tooltip_room_view_mode_shown_key = PreferenceImpl.PreferencesKeys.getTOOLTIP_ROOM_VIEW_MODE_SHOWN_KEY();
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(true);
                this.f142166c = 1;
                if (I02.setPreference(tooltip_room_view_mode_shown_key, a10, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.DecorateViewModel$setShowAddItemTooltipPresented$1", f = "DecorateViewModel.kt", l = {344}, m = "invokeSuspend")
    static final class z extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142168c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f142169d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(b bVar, C17164e<? super z> eVar) {
            super(2, eVar);
            this.f142169d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new z(this.f142169d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((z) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142168c;
            if (i10 == 0) {
                XH.y.b(obj);
                PreferenceStorage I02 = this.f142169d.I0();
                f.a<Boolean> tooltip_add_item_shown_key = PreferenceImpl.PreferencesKeys.getTOOLTIP_ADD_ITEM_SHOWN_KEY();
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(true);
                this.f142168c = 1;
                if (I02.setPreference(tooltip_add_item_shown_key, a10, this) == f10) {
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

    public b(SceneRepository sceneRepository, CatalogRepository catalogRepository, CompositionRepository compositionRepository, OE.q qVar, a aVar, UserRepo userRepo, PreferenceStorage preferenceStorage, C13313e eVar, ConfigRepository configRepository, RF.p pVar, DesignStateManager designStateManager) {
        CompositionRepository compositionRepository2 = compositionRepository;
        OE.q qVar2 = qVar;
        a aVar2 = aVar;
        UserRepo userRepo2 = userRepo;
        PreferenceStorage preferenceStorage2 = preferenceStorage;
        C13313e eVar2 = eVar;
        ConfigRepository configRepository2 = configRepository;
        RF.p pVar2 = pVar;
        DesignStateManager designStateManager2 = designStateManager;
        C17542s.j(sceneRepository, "sceneRepository");
        C17542s.j(catalogRepository, "catalogRepository");
        C17542s.j(compositionRepository2, "compositionRepository");
        C17542s.j(qVar2, "sugarcube");
        C17542s.j(aVar2, "appConfig");
        C17542s.j(userRepo2, "userRepo");
        C17542s.j(preferenceStorage2, "sharedPref");
        C17542s.j(eVar2, "installationConfig");
        C17542s.j(configRepository2, "configRepository");
        C17542s.j(pVar2, "smartaPlacementUseCase");
        C17542s.j(designStateManager2, "designStateManager");
        this.f141999m = sceneRepository;
        this.f142000n = catalogRepository;
        this.f142001o = compositionRepository2;
        this.f142002p = qVar2;
        this.f142003q = aVar2;
        this.f142004r = userRepo2;
        this.f142005s = preferenceStorage2;
        this.f142006t = eVar2;
        this.f142007u = configRepository2;
        this.f142008v = pVar2;
        this.f142009w = designStateManager2;
        DecorateViewMode decorateViewMode = DecorateViewMode.RoomMode;
        C16505B<C16913J0> a10 = C16521S.a(new C16913J0((RF.k) null, decorateViewMode, false));
        this.f141940A = a10;
        this.f141942B = C5210m.c(a10, (C17168i) null, 0, 3, (Object) null);
        this.f141946D = new HashMap<>(32);
        this.f141948E = new LinkedList<>();
        this.f141950F = new ArrayList();
        this.f141952G = true;
        Boolean bool = Boolean.FALSE;
        this.f141954H = new K<>(bool);
        this.f141964M = new K<>();
        Boolean bool2 = Boolean.TRUE;
        this.f141966N = new K<>(bool2);
        this.f141968O = new K<>();
        this.f141970P = new K<>();
        this.f141972Q = new K<>();
        C16505B<DecorateViewMode> a11 = C16521S.a(decorateViewMode);
        this.f141974R = a11;
        this.f141976S = C16534i.c(a11);
        this.f141980U = true;
        this.f141984X = true;
        this.f141986Y = true;
        this.f141988Z = true;
        this.f141943B0 = ((Boolean) configRepository2.getBlocking(FeatureFlags.EnableDecorationV2.INSTANCE)).booleanValue();
        this.f141945C0 = new C13549b((Integer) null, (Integer) null, false, (Boolean) null, (Boolean) null, eVar.i(), 27, (DefaultConstructorMarker) null);
        this.f141947D0 = new K<>();
        this.f141949E0 = new K<>();
        this.f141951F0 = new K<>(C16877v.n());
        K<List<MultiviewAdapter.a>> k10 = new K<>();
        this.f141957I0 = k10;
        androidx.lifecycle.I<Boolean> i10 = new androidx.lifecycle.I<>();
        i10.b(k10, new s(new C16905F0(this, i10)));
        this.f141959J0 = i10;
        RF.j jVar = RF.j.FRONT;
        this.f141961K0 = jVar;
        this.f141963L0 = new K<>(jVar);
        this.f141965M0 = new K<>(bool);
        K<PanZoomRegion> k11 = new K<>();
        this.f141967N0 = k11;
        this.f141969O0 = k11;
        this.f141971P0 = new K<>();
        this.f141973Q0 = new K<>();
        this.f141975R0 = new K<>();
        this.f141977S0 = new K<>();
        this.f141979T0 = new K<>();
        K<EraserCounts> k12 = new K<>();
        this.f141981U0 = k12;
        this.f141982V0 = k12;
        this.f141983W0 = new K<>();
        this.f141985X0 = new K<>();
        this.f141987Y0 = new K<>();
        this.f141989Z0 = new K<>();
        this.f141990a1 = new K<>();
        this.f141991b1 = new K<>();
        this.f141992c1 = new K<>(bool2);
        this.f141993d1 = new K<>(bool2);
        this.f141994e1 = new K<>(bool2);
        K<Boolean> k13 = new K<>();
        this.f141995f1 = k13;
        this.f141996g1 = e0.a(k13);
        this.f141997h1 = new K<>();
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C17114a(this, (C17164e<? super C17114a>) null), 3, (Object) null);
        F0 unused2 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C3469b(this, (C17164e<? super C3469b>) null), 3, (Object) null);
        F0 unused3 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C17115c(this, (C17164e<? super C17115c>) null), 3, (Object) null);
        F0 unused4 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C17116d(this, (C17164e<? super C17116d>) null), 3, (Object) null);
        F0 unused5 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C17117e(this, (C17164e<? super C17117e>) null), 3, (Object) null);
        F0 unused6 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C17118f(this, (C17164e<? super C17118f>) null), 3, (Object) null);
        F0 unused7 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C17119g(this, (C17164e<? super C17119g>) null), 3, (Object) null);
        F0 unused8 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C17120h(this, (C17164e<? super C17120h>) null), 3, (Object) null);
        F0 unused9 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C17121i(this, (C17164e<? super C17121i>) null), 3, (Object) null);
    }

    public static /* synthetic */ void G1(b bVar, List list, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        if ((i10 & 8) != 0) {
            z12 = false;
        }
        bVar.F1(list, z10, z11, z12);
    }

    private final void L1() {
        if (this.f141963L0.getValue() == null) {
            this.f141963L0.setValue(this.f141961K0);
        }
    }

    private final void V() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new l(this, (C17164e<? super l>) null), 3, (Object) null);
        this.f141975R0.setValue(Boolean.TRUE);
    }

    private final CachedCompiledComposition X0(CachedCompiledComposition cachedCompiledComposition, SceneLayout sceneLayout, boolean z10) {
        return i.F(cachedCompiledComposition, this.f142006t, this.f141946D, sceneLayout, z10);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0642, code lost:
        r10 = r6.f142001o;
        r3.f142111c = r6;
        r3.f142112d = r15;
        r3.f142113e = r14;
        r3.f142114f = r7;
        r3.f142115g = r9;
        r3.f142116h = r4;
        r3.f142117i = r0;
        r3.f142118j = r13;
        r3.f142119k = r12;
        r3.f142120l = r11;
        r3.f142121m = r1;
        r3.f142122n = r5;
        r3.f142123o = r2;
        r3.f142124p = r56;
        r3.f142125q = r6;
        r2 = r55;
        r3.f142102D = r2;
        r3.f142103E = r8 ? 1 : 0;
        r3.f142104F = r57;
        r3.f142110L = 6;
        r5 = r10.fetchCompiledComposition(r14, r3);
        r10 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0677, code lost:
        if (r5 != r10) goto L_0x067a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0679, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x067a, code lost:
        r16 = r8;
        r8 = r11;
        r11 = r13;
        r13 = r4;
        r4 = r5;
        r5 = r7;
        r7 = r1;
        r1 = r6;
        r52 = r12;
        r12 = r0;
        r0 = r9;
        r9 = r52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0689, code lost:
        r19 = (com.sugarcube.core.network.models.CompiledComposition) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x068d, code lost:
        if (r19 == null) goto L_0x06d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x068f, code lost:
        r4 = r19.getComposition();
        r55 = r0;
        r7.f144348a = com.sugarcube.core.network.models.Composition.copy$default((com.sugarcube.core.network.models.Composition) r7.f144348a, r4.getCompositionId(), r4.getName(), (android.net.Uri) null, (android.net.Uri) null, (java.lang.Integer) null, (java.util.UUID) null, (java.util.List) null, r4.getCreatedAt(), r4.getLastModifiedTs(), r4.isShared(), (android.net.Uri) null, r4.isStock(), 0, (java.util.UUID) null, (java.lang.String) null, (com.sugarcube.core.network.models.CompositionSavedProperties) null, (java.util.Map) null, (android.net.Uri) null, 259196, (java.lang.Object) null);
        r4 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x06d9, code lost:
        r55 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x06db, code lost:
        r19 = new com.sugarcube.app.base.data.database.CachedCompiledComposition(new com.sugarcube.core.network.models.CompiledComposition((com.sugarcube.core.network.models.Composition) r7.f144348a, YH.C16877v.n(), (com.sugarcube.core.network.models.SceneResponse) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), (java.util.Map) null, (java.lang.String) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r1 = r1;
        r20 = r10;
        r10 = r4;
        r4 = r7;
        r7 = r5;
        r5 = r2;
        r2 = r9;
        r9 = r55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x070e, code lost:
        r10 = r6.f142001o;
        r3.f142111c = r6;
        r3.f142112d = r15;
        r3.f142113e = r14;
        r3.f142114f = r7;
        r3.f142115g = r9;
        r3.f142116h = r4;
        r3.f142117i = r0;
        r3.f142118j = r13;
        r3.f142119k = r12;
        r3.f142120l = r11;
        r3.f142121m = r1;
        r3.f142122n = r5;
        r3.f142123o = r2;
        r3.f142124p = r56;
        r3.f142125q = r6;
        r2 = r55;
        r3.f142102D = r2;
        r5 = r8;
        r3.f142103E = r5 ? 1 : 0;
        r3.f142104F = r57;
        r3.f142110L = 7;
        r8 = r10.fetchCompiledComposition(r14, r3);
        r10 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x074b, code lost:
        if (r8 != r10) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x074d, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x074e, code lost:
        r55 = r0;
        r19 = r4;
        r4 = r8;
        r8 = r1;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0755, code lost:
        r0 = (com.sugarcube.core.network.models.CompiledComposition) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0758, code lost:
        if (r0 == null) goto L_0x07ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x075a, code lost:
        r20 = r0.getCatalogItems();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0760, code lost:
        if (r20 == null) goto L_0x076b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0762, code lost:
        r56 = r2;
        r2 = r20.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x076b, code lost:
        r56 = r2;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x076e, code lost:
        r4 = new java.util.HashMap(r2);
        r2 = r0.getComposition().getGltf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0779, code lost:
        if (r2 == null) goto L_0x07c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x077b, code lost:
        r57 = r5;
        r5 = r1.f141999m;
        r58 = r6;
        r6 = r1.f141956I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0783, code lost:
        if (r6 == null) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0785, code lost:
        r6 = r6.getJobId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x078a, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x078b, code lost:
        r5 = r5.getAssetDirForScene(r15, r6) + "/" + r14 + ".gltf";
        r6 = new java.io.File(r5);
        r20 = r1;
        r1 = new org.json.JSONObject(r2).toString();
        kotlin.jvm.internal.C17542s.i(r1, "toString(...)");
        jI.C17423j.l(r6, r1, (java.nio.charset.Charset) null, 2, (java.lang.Object) null);
        r1 = XH.C16807N.f139792a;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x07c9, code lost:
        r20 = r1;
        r57 = r5;
        r58 = r6;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x07d0, code lost:
        r1 = new com.sugarcube.app.base.data.database.CachedCompiledComposition(r0, r4, r5);
        r5 = r56;
        r16 = r57;
        r6 = r58;
        r0 = r1;
        r4 = r8;
        r8 = r11;
        r2 = r12;
        r11 = r13;
        r13 = r19;
        r12 = r55;
        r1 = r20;
        r20 = r10;
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x07ea, code lost:
        r57 = r5;
        r58 = r6;
        r21 = new com.sugarcube.app.base.data.database.CachedCompiledComposition(new com.sugarcube.core.network.models.CompiledComposition((com.sugarcube.core.network.models.Composition) r8.f144348a, YH.C16877v.n(), (com.sugarcube.core.network.models.SceneResponse) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), (java.util.Map) null, (java.lang.String) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r5 = r2;
        r16 = r57;
        r2 = r12;
        r1 = r1;
        r12 = r55;
        r20 = r10;
        r10 = r4;
        r4 = r8;
        r8 = r11;
        r11 = r13;
        r13 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0827, code lost:
        r6.f141962L = r0;
        r19 = r5;
        r1.f142010x.postValue(ZF.C16903E0.SceneMetaReady);
        r0 = YE.C13868b.f118106a;
        r5 = r1.f141952G;
        r21 = r10;
        r10 = new java.lang.StringBuilder();
        r22 = r6;
        r10.append("fetch scene meta done: ");
        r10.append(r15);
        r6 = r18;
        r10.append(r6);
        r10.append(r14);
        r10.append(r6);
        r10.append(r5);
        r0.b(r10.toString(), YE.e.Decoration);
        r0 = new java.util.HashMap();
        r5 = r1.f141962L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0865, code lost:
        if (r5 == null) goto L_0x0a3e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0867, code lost:
        r10 = r5.getCompiledComposition().getCatalogItems();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x086f, code lost:
        if (r10 == null) goto L_0x0a29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0871, code lost:
        r18 = r6;
        r6 = r1.f142000n;
        r3.f142111c = r1;
        r3.f142112d = r15;
        r3.f142113e = r14;
        r3.f142114f = r7;
        r3.f142115g = r9;
        r3.f142116h = r13;
        r3.f142117i = r12;
        r3.f142118j = r11;
        r3.f142119k = r2;
        r3.f142120l = r8;
        r3.f142121m = r4;
        r3.f142122n = r0;
        r3.f142123o = r5;
        r3.f142124p = r5;
        r3.f142125q = r5;
        r3.f142126r = r10;
        r3.f142127s = r10;
        r3.f142128t = r10;
        r55 = r0;
        r3.f142129u = r22;
        r3.f142130v = r21;
        r3.f142102D = r19;
        r3.f142103E = r16;
        r3.f142104F = 0;
        r3.f142105G = 0;
        r3.f142110L = 8;
        r0 = r6.convertCatalogItems(r10, 2, r3);
        r6 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x08bb, code lost:
        if (r0 != r6) goto L_0x08be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x08bd, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x08be, code lost:
        r26 = r5;
        r27 = r26;
        r20 = r9;
        r23 = r10;
        r24 = r23;
        r25 = r24;
        r10 = r16;
        r17 = r21;
        r16 = 0;
        r9 = r0;
        r21 = r7;
        r7 = 0;
        r0 = r55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x08d6, code lost:
        r9 = (java.util.List) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x08d8, code lost:
        if (r9 == null) goto L_0x090b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x08da, code lost:
        r28 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x08e6, code lost:
        if (r28.hasNext() == false) goto L_0x0904;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x08e8, code lost:
        r55 = r1;
        r1 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r28.next();
        r0.put(kotlin.coroutines.jvm.internal.b.e(r1.getId()), r1);
        r1 = r55;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0904, code lost:
        r55 = r1;
        r56 = r2;
        r1 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x090b, code lost:
        r55 = r1;
        r56 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x090f, code lost:
        r1 = r12;
        r2 = r1.iterator();
        r50 = r1;
        r46 = r7;
        r43 = r9;
        r47 = r10;
        r45 = r16;
        r49 = r17;
        r48 = r19;
        r51 = r22;
        r42 = r23;
        r16 = r24;
        r17 = r25;
        r9 = r26;
        r7 = r27;
        r44 = 0;
        r1 = r55;
        r10 = r0;
        r55 = r2;
        r2 = r20;
        r0 = r21;
        r20 = r6;
        r6 = r3;
        r3 = r56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0944, code lost:
        if (r55.hasNext() == false) goto L_0x0a21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0946, code lost:
        r19 = r9;
        r9 = r55.next();
        r21 = r7;
        r7 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r9;
        r56 = r7;
        r7 = kotlin.coroutines.jvm.internal.b.e(r7.getId());
        r6.f142111c = r1;
        r6.f142112d = r15;
        r6.f142113e = r14;
        r6.f142114f = r0;
        r6.f142115g = r2;
        r6.f142116h = r13;
        r6.f142117i = r12;
        r6.f142118j = r11;
        r6.f142119k = r3;
        r6.f142120l = r8;
        r6.f142121m = r4;
        r6.f142122n = r10;
        r6.f142123o = r5;
        r22 = r0;
        r6.f142124p = r21;
        r6.f142125q = r19;
        r6.f142126r = r17;
        r6.f142127s = r16;
        r0 = r42;
        r6.f142128t = r0;
        r23 = r0;
        r0 = r43;
        r6.f142129u = r0;
        r24 = r0;
        r0 = r50;
        r6.f142130v = r0;
        r25 = r0;
        r0 = r55;
        r6.f142131w = r0;
        r6.f142132x = r9;
        r9 = r56;
        r6.f142133y = r9;
        r6.f142134z = r7;
        r6.f142099A = r10;
        r26 = r0;
        r0 = r51;
        r6.f142100B = r0;
        r27 = r0;
        r0 = r49;
        r6.f142101C = r0;
        r28 = r0;
        r0 = r48;
        r6.f142102D = r0;
        r29 = r0;
        r0 = r47;
        r6.f142103E = r0;
        r30 = r0;
        r0 = r46;
        r6.f142104F = r0;
        r31 = r0;
        r0 = r45;
        r6.f142105G = r0;
        r32 = r0;
        r0 = r44;
        r6.f142106H = r0;
        r33 = r0;
        r6.f142107I = 0;
        r6.f142110L = 9;
        r0 = r1.a0(r9, r6);
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x09e0, code lost:
        if (r0 != r9) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x09e2, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x09e3, code lost:
        r20 = r4;
        r42 = r23;
        r43 = r24;
        r50 = r25;
        r51 = r27;
        r49 = r28;
        r48 = r29;
        r47 = r30;
        r46 = r31;
        r45 = r32;
        r44 = r33;
        r4 = r0;
        r25 = r13;
        r28 = r14;
        r0 = r22;
        r14 = r7;
        r13 = r10;
        r7 = r21;
        r52 = r17;
        r17 = r16;
        r16 = r19;
        r19 = r52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0a0c, code lost:
        r13.put(r14, r4);
        r4 = r20;
        r13 = r25;
        r55 = r26;
        r14 = r28;
        r20 = r9;
        r9 = r16;
        r16 = r17;
        r17 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0a21, code lost:
        r0 = XH.C16807N.f139792a;
        r4 = r10;
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0a29, code lost:
        r18 = r6;
        r4 = r0;
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0a30, code lost:
        r1.f141962L = com.sugarcube.app.base.data.database.CachedCompiledComposition.copy$default(r2, (com.sugarcube.core.network.models.CompiledComposition) null, r4, (java.lang.String) null, 5, (java.lang.Object) null);
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0a3c, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0a3e, code lost:
        r18 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0a41, code lost:
        r1.f142010x.postValue(ZF.C16903E0.DataReady);
        G1(r1, r3, false, false, false, 14, (java.lang.Object) null);
        r0 = YE.C13868b.f118106a;
        r1 = r1.f141952G;
        r2 = new java.lang.StringBuilder();
        r2.append("fetch data done: ");
        r2.append(r15);
        r3 = r18;
        r2.append(r3);
        r2.append(r14);
        r2.append(r3);
        r2.append(r1);
        r0.b(r2.toString(), YE.e.Decoration);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0a7c, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x039e, code lost:
        r13 = r9.f141999m;
        r3.f142111c = r9;
        r3.f142112d = r7;
        r3.f142113e = r8;
        r3.f142114f = r6;
        r3.f142115g = r1;
        r3.f142116h = r2;
        r3.f142117i = r12;
        r3.f142118j = r4;
        r3.f142110L = 2;
        r4 = r13.getScene(r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x03b7, code lost:
        if (r4 != r5) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x03b9, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x03ba, code lost:
        r52 = r6;
        r6 = r1;
        r1 = r12;
        r12 = r9;
        r9 = r7;
        r7 = r52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x03c2, code lost:
        r4 = (com.sugarcube.app.base.data.database.Scene) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x03c4, code lost:
        if (r4 != null) goto L_0x03f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x03c6, code lost:
        r12.f142010x.postValue(ZF.C16903E0.Error);
        YE.C13868b.f118106a.b("fetch scene error: " + r9 + " " + r8 + " " + r12.f141952G, YE.e.Decoration);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x03f5, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x03f6, code lost:
        r13 = r12.f142011y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x03f8, code lost:
        if (r13 == null) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x03fa, code lost:
        r13.a0(r4.getSceneId());
        r13 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0403, code lost:
        r13 = r4.getRoomType();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0407, code lost:
        if (r13 != null) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0409, code lost:
        r13 = com.sugarcube.app.base.data.model.RoomTypeRenderer.INSTANCE.getRoom(r7, r4.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0413, code lost:
        r12.f141964M.postValue(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x041c, code lost:
        if (r4.getGlbUrl() != null) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x041e, code lost:
        r18 = r4.getManifest();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0422, code lost:
        if (r18 == null) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0424, code lost:
        r14 = com.sugarcube.core.network.models.Manifest.copy$default(r18, (com.sugarcube.core.network.models.PlanesData) null, (android.net.Uri) null, (android.net.Uri) null, (android.net.Uri) null, (android.net.Uri) null, (android.net.Uri) null, (android.net.Uri) null, (com.sugarcube.core.network.models.SegmentationMetaData) null, (com.sugarcube.core.network.models.PlanesData) null, (android.net.Uri) null, (android.net.Uri) null, (android.net.Uri) null, (android.net.Uri) null, (android.net.Uri) null, (android.net.Uri) null, (com.sugarcube.core.network.models.LightingData) null, (com.sugarcube.core.network.models.IntrinsicsData) null, (android.net.Uri) null, (com.sugarcube.core.network.models.PlanePolygonSet) null, 0, 1048575, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0456, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0457, code lost:
        r12.f141958J = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0459, code lost:
        r14 = new java.util.HashMap();
        r15 = r12.f141999m;
        r3.f142111c = r12;
        r3.f142112d = r9;
        r3.f142113e = r8;
        r3.f142114f = r7;
        r3.f142115g = r6;
        r3.f142116h = r2;
        r3.f142117i = r1;
        r3.f142118j = r4;
        r3.f142119k = r14;
        r3.f142120l = r13;
        r3.f142102D = 0;
        r3.f142110L = 3;
        r13 = r15.fetchDecorationAssets(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x047e, code lost:
        if (r13 != r5) goto L_0x0481;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0480, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0481, code lost:
        r15 = r12;
        r12 = r7;
        r52 = r8;
        r8 = r1;
        r1 = r4;
        r4 = r13;
        r13 = r52;
        r53 = r9;
        r9 = r2;
        r2 = r6;
        r6 = r14;
        r14 = r53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0491, code lost:
        r4 = (java.util.List) r4;
        r7 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x049b, code lost:
        if (r7.hasNext() == false) goto L_0x0509;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x049d, code lost:
        r18 = (com.sugarcube.app.base.data.AssetItem) r7.next();
        r11 = r18.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x04a9, code lost:
        if (200 > r11) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x04ad, code lost:
        if (r11 >= 300) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x04af, code lost:
        r0 = r18.getUri();
        r11 = r18.getFile().getAbsoluteFile();
        kotlin.jvm.internal.C17542s.i(r11, "getAbsoluteFile(...)");
        r6.put(r0, android.net.Uri.fromFile(r11));
        r0 = r54;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x04cf, code lost:
        r15.f142010x.postValue(ZF.C16903E0.Error);
        YE.C13868b.f118106a.b("fetch asset error: " + r14 + " " + r13 + " " + r15.f141952G + " " + r18.getUri(), YE.e.Decoration);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0508, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0509, code lost:
        r0 = r1.getGlbUrl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x050d, code lost:
        if (r0 == null) goto L_0x0519;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x050f, code lost:
        r15.f141960K = (android.net.Uri) r6.get(r0);
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0519, code lost:
        r0 = r15.f141958J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x051b, code lost:
        if (r0 == null) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x051d, code lost:
        r0.replaceUris(r6);
        r7 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0522, code lost:
        r15.f141956I = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0528, code lost:
        if (r1.isHela() != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x052a, code lost:
        r7 = r15.f142009w;
        r3.f142111c = r15;
        r3.f142112d = r14;
        r3.f142113e = r13;
        r3.f142114f = r12;
        r3.f142115g = r2;
        r3.f142116h = r9;
        r3.f142117i = r8;
        r3.f142118j = r1;
        r3.f142119k = r6;
        r3.f142120l = r4;
        r3.f142121m = r0;
        r3.f142122n = r1;
        r3.f142110L = 4;
        r0 = r7.isPreserveFeatureEnabled(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x054b, code lost:
        if (r0 != r5) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x054d, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x054e, code lost:
        r7 = r1;
        r11 = r2;
        r2 = r4;
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0558, code lost:
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L_0x0566;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x055a, code lost:
        r0 = 1;
        r52 = r9;
        r9 = r8;
        r8 = r15;
        r15 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0566, code lost:
        r0 = r1;
        r4 = r2;
        r1 = r7;
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x056b, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x056c, code lost:
        r7 = r1;
        r11 = r9;
        r1 = r0;
        r9 = r8;
        r8 = r15;
        r0 = 0;
        r15 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r2;
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0577, code lost:
        r4 = r8.f141955H0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0579, code lost:
        if (r4 == null) goto L_0x05c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x057b, code lost:
        r18 = " ";
        r10 = r8.f142009w;
        r20 = r5;
        r5 = r8.f141953G0;
        r3.f142111c = r8;
        r3.f142112d = r15;
        r3.f142113e = r14;
        r3.f142114f = r13;
        r3.f142115g = r12;
        r3.f142116h = r11;
        r3.f142117i = r9;
        r3.f142118j = r7;
        r3.f142119k = r6;
        r3.f142120l = r2;
        r3.f142121m = r1;
        r3.f142122n = r4;
        r3.f142123o = r4;
        r3.f142124p = r4;
        r3.f142102D = r0;
        r3.f142103E = 0;
        r3.f142110L = 5;
        r4 = r10.canBeRestored(r4, r5, r3);
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x05ad, code lost:
        if (r4 != r1) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x05af, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x05b0, code lost:
        r5 = ((java.lang.Boolean) r4).booleanValue();
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x05b8, code lost:
        r11 = r2;
        r2 = r0;
        r0 = r9;
        r9 = r12;
        r12 = r6;
        r6 = r8;
        r52 = r13;
        r13 = r7;
        r7 = r52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x05c4, code lost:
        r1 = r5;
        r18 = " ";
        r4 = r11;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x05ca, code lost:
        if (r5 == false) goto L_0x05d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x05cc, code lost:
        if (r2 == 0) goto L_0x05d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x05ce, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x05d0, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x05d1, code lost:
        r5 = YE.C13868b.f118106a;
        r10 = new java.lang.StringBuilder();
        r19 = r1;
        r10.append("Have un-restored state? ");
        r10.append(r8);
        r5.b(r10.toString(), YE.e.Decoration);
        r1 = new kotlin.jvm.internal.O();
        r5 = java.time.Instant.now();
        kotlin.jvm.internal.C17542s.i(r5, "now(...)");
        r55 = r2;
        r2 = java.time.Instant.now();
        kotlin.jvm.internal.C17542s.i(r2, "now(...)");
        r10 = YH.C16877v.n();
        r27 = r10;
        r56 = r10;
        r10 = r13.getSceneId();
        r57 = r10;
        r1.f144348a = new com.sugarcube.core.network.models.Composition(-1, "", (android.net.Uri) null, (android.net.Uri) null, (java.lang.Integer) null, r14, r27, r5, r2, false, (android.net.Uri) null, false, r10, r15, (java.lang.String) null, (com.sugarcube.core.network.models.CompositionSavedProperties) null, (java.util.Map) null, (android.net.Uri) null, 246812, (kotlin.jvm.internal.DefaultConstructorMarker) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0640, code lost:
        if (r8 == false) goto L_0x070e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Z(java.util.UUID r55, java.util.UUID r56, android.content.res.Resources r57, java.util.List<java.lang.String> r58, dI.C17164e<? super XH.C16807N> r59) {
        /*
            r54 = this;
            r0 = r54
            r1 = r58
            r2 = r59
            boolean r3 = r2 instanceof com.sugarcube.decorate.v1.internal.v1.b.n
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.sugarcube.decorate.v1.internal.v1.b$n r3 = (com.sugarcube.decorate.v1.internal.v1.b.n) r3
            int r4 = r3.f142110L
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f142110L = r4
            goto L_0x001e
        L_0x0019:
            com.sugarcube.decorate.v1.internal.v1.b$n r3 = new com.sugarcube.decorate.v1.internal.v1.b$n
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f142108J
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f142110L
            java.lang.String r10 = " "
            switch(r6) {
                case 0: goto L_0x034f;
                case 1: goto L_0x0324;
                case 2: goto L_0x0301;
                case 3: goto L_0x02c7;
                case 4: goto L_0x0292;
                case 5: goto L_0x024f;
                case 6: goto L_0x01fb;
                case 7: goto L_0x019f;
                case 8: goto L_0x0100;
                case 9: goto L_0x0033;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0033:
            int r1 = r3.f142106H
            int r2 = r3.f142105G
            int r6 = r3.f142104F
            int r7 = r3.f142103E
            int r8 = r3.f142102D
            java.lang.Object r9 = r3.f142101C
            java.lang.Object r12 = r3.f142100B
            com.sugarcube.decorate.v1.internal.v1.b r12 = (com.sugarcube.decorate.v1.internal.v1.b) r12
            java.lang.Object r13 = r3.f142099A
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r14 = r3.f142134z
            java.lang.Integer r14 = (java.lang.Integer) r14
            java.lang.Object r15 = r3.f142133y
            com.sugarcube.app.base.data.database.CachedCatalogItem r15 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r15
            java.lang.Object r15 = r3.f142131w
            java.util.Iterator r15 = (java.util.Iterator) r15
            java.lang.Object r11 = r3.f142130v
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            r55 = r1
            java.lang.Object r1 = r3.f142129u
            java.util.List r1 = (java.util.List) r1
            r56 = r1
            java.lang.Object r1 = r3.f142128t
            java.util.List r1 = (java.util.List) r1
            r57 = r1
            java.lang.Object r1 = r3.f142127s
            java.util.List r1 = (java.util.List) r1
            r58 = r1
            java.lang.Object r1 = r3.f142126r
            java.util.List r1 = (java.util.List) r1
            r59 = r1
            java.lang.Object r1 = r3.f142125q
            com.sugarcube.app.base.data.database.CachedCompiledComposition r1 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r1
            r16 = r1
            java.lang.Object r1 = r3.f142124p
            com.sugarcube.app.base.data.database.CachedCompiledComposition r1 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r1
            r17 = r1
            java.lang.Object r1 = r3.f142123o
            com.sugarcube.app.base.data.database.CachedCompiledComposition r1 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r1
            r18 = r1
            java.lang.Object r1 = r3.f142122n
            java.util.HashMap r1 = (java.util.HashMap) r1
            r19 = r1
            java.lang.Object r1 = r3.f142121m
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            r20 = r1
            java.lang.Object r1 = r3.f142120l
            java.util.List r1 = (java.util.List) r1
            r21 = r1
            java.lang.Object r1 = r3.f142119k
            java.util.HashMap r1 = (java.util.HashMap) r1
            r22 = r1
            java.lang.Object r1 = r3.f142118j
            com.sugarcube.app.base.data.database.Scene r1 = (com.sugarcube.app.base.data.database.Scene) r1
            r23 = r1
            java.lang.Object r1 = r3.f142117i
            java.util.List r1 = (java.util.List) r1
            r24 = r1
            java.lang.Object r1 = r3.f142116h
            dI.e r1 = (dI.C17164e) r1
            r25 = r1
            java.lang.Object r1 = r3.f142115g
            java.util.List r1 = (java.util.List) r1
            r26 = r1
            java.lang.Object r1 = r3.f142114f
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            r27 = r1
            java.lang.Object r1 = r3.f142113e
            java.util.UUID r1 = (java.util.UUID) r1
            r28 = r1
            java.lang.Object r1 = r3.f142112d
            java.util.UUID r1 = (java.util.UUID) r1
            r29 = r1
            java.lang.Object r1 = r3.f142111c
            com.sugarcube.decorate.v1.internal.v1.b r1 = (com.sugarcube.decorate.v1.internal.v1.b) r1
            XH.y.b(r4)
            r44 = r55
            r43 = r56
            r42 = r57
            r45 = r2
            r46 = r6
            r47 = r7
            r48 = r8
            r49 = r9
            r50 = r11
            r51 = r12
            r7 = r17
            r8 = r21
            r11 = r23
            r12 = r24
            r2 = r26
            r0 = r27
            r17 = r58
            r6 = r3
            r9 = r5
            r26 = r15
            r5 = r18
            r3 = r22
            r15 = r29
            r18 = r10
            r10 = r19
            r19 = r59
            goto L_0x0a0c
        L_0x0100:
            int r1 = r3.f142105G
            int r2 = r3.f142104F
            int r6 = r3.f142103E
            int r7 = r3.f142102D
            java.lang.Object r8 = r3.f142130v
            java.lang.Object r9 = r3.f142129u
            com.sugarcube.decorate.v1.internal.v1.b r9 = (com.sugarcube.decorate.v1.internal.v1.b) r9
            java.lang.Object r11 = r3.f142128t
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r3.f142127s
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r3.f142126r
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r3.f142125q
            com.sugarcube.app.base.data.database.CachedCompiledComposition r14 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r14
            java.lang.Object r15 = r3.f142124p
            com.sugarcube.app.base.data.database.CachedCompiledComposition r15 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r15
            r16 = r1
            java.lang.Object r1 = r3.f142123o
            com.sugarcube.app.base.data.database.CachedCompiledComposition r1 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r1
            r55 = r1
            java.lang.Object r1 = r3.f142122n
            java.util.HashMap r1 = (java.util.HashMap) r1
            r56 = r1
            java.lang.Object r1 = r3.f142121m
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            r57 = r1
            java.lang.Object r1 = r3.f142120l
            java.util.List r1 = (java.util.List) r1
            r58 = r1
            java.lang.Object r1 = r3.f142119k
            java.util.HashMap r1 = (java.util.HashMap) r1
            r59 = r1
            java.lang.Object r1 = r3.f142118j
            com.sugarcube.app.base.data.database.Scene r1 = (com.sugarcube.app.base.data.database.Scene) r1
            r17 = r1
            java.lang.Object r1 = r3.f142117i
            java.util.List r1 = (java.util.List) r1
            r18 = r1
            java.lang.Object r1 = r3.f142116h
            dI.e r1 = (dI.C17164e) r1
            r19 = r1
            java.lang.Object r1 = r3.f142115g
            java.util.List r1 = (java.util.List) r1
            r20 = r1
            java.lang.Object r1 = r3.f142114f
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            r21 = r1
            java.lang.Object r1 = r3.f142113e
            java.util.UUID r1 = (java.util.UUID) r1
            r22 = r1
            java.lang.Object r1 = r3.f142112d
            java.util.UUID r1 = (java.util.UUID) r1
            r23 = r1
            java.lang.Object r1 = r3.f142111c
            com.sugarcube.decorate.v1.internal.v1.b r1 = (com.sugarcube.decorate.v1.internal.v1.b) r1
            XH.y.b(r4)
            r0 = r56
            r24 = r12
            r25 = r13
            r26 = r14
            r27 = r15
            r12 = r18
            r13 = r19
            r14 = r22
            r15 = r23
            r19 = r7
            r22 = r9
            r18 = r10
            r23 = r11
            r11 = r17
            r7 = r2
            r9 = r4
            r10 = r6
            r17 = r8
            r4 = r57
            r8 = r58
            r2 = r59
            r6 = r5
            r5 = r55
            goto L_0x08d6
        L_0x019f:
            int r1 = r3.f142103E
            int r2 = r3.f142102D
            java.lang.Object r6 = r3.f142125q
            com.sugarcube.decorate.v1.internal.v1.b r6 = (com.sugarcube.decorate.v1.internal.v1.b) r6
            java.lang.Object r8 = r3.f142124p
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r3.f142123o
            java.time.Instant r8 = (java.time.Instant) r8
            java.lang.Object r8 = r3.f142122n
            java.time.Instant r8 = (java.time.Instant) r8
            java.lang.Object r8 = r3.f142121m
            kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
            java.lang.Object r11 = r3.f142120l
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r3.f142119k
            java.util.HashMap r12 = (java.util.HashMap) r12
            java.lang.Object r13 = r3.f142118j
            com.sugarcube.app.base.data.database.Scene r13 = (com.sugarcube.app.base.data.database.Scene) r13
            java.lang.Object r14 = r3.f142117i
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r3.f142116h
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r9 = r3.f142115g
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r7 = r3.f142114f
            android.content.res.Resources r7 = (android.content.res.Resources) r7
            r18 = r1
            java.lang.Object r1 = r3.f142113e
            java.util.UUID r1 = (java.util.UUID) r1
            r55 = r1
            java.lang.Object r1 = r3.f142112d
            java.util.UUID r1 = (java.util.UUID) r1
            r56 = r1
            java.lang.Object r1 = r3.f142111c
            com.sugarcube.decorate.v1.internal.v1.b r1 = (com.sugarcube.decorate.v1.internal.v1.b) r1
            XH.y.b(r4)
            r19 = r15
            r15 = r56
            r52 = r14
            r14 = r55
            r55 = r52
            r53 = r10
            r10 = r5
            r5 = r18
            r18 = r53
            goto L_0x0755
        L_0x01fb:
            int r1 = r3.f142103E
            int r2 = r3.f142102D
            java.lang.Object r6 = r3.f142125q
            com.sugarcube.decorate.v1.internal.v1.b r6 = (com.sugarcube.decorate.v1.internal.v1.b) r6
            java.lang.Object r7 = r3.f142124p
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r3.f142123o
            java.time.Instant r7 = (java.time.Instant) r7
            java.lang.Object r7 = r3.f142122n
            java.time.Instant r7 = (java.time.Instant) r7
            java.lang.Object r7 = r3.f142121m
            kotlin.jvm.internal.O r7 = (kotlin.jvm.internal.O) r7
            java.lang.Object r8 = r3.f142120l
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r3.f142119k
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r11 = r3.f142118j
            com.sugarcube.app.base.data.database.Scene r11 = (com.sugarcube.app.base.data.database.Scene) r11
            java.lang.Object r12 = r3.f142117i
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r3.f142116h
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r3.f142115g
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r3.f142114f
            android.content.res.Resources r15 = (android.content.res.Resources) r15
            r16 = r1
            java.lang.Object r1 = r3.f142113e
            java.util.UUID r1 = (java.util.UUID) r1
            r55 = r1
            java.lang.Object r1 = r3.f142112d
            java.util.UUID r1 = (java.util.UUID) r1
            r56 = r1
            java.lang.Object r1 = r3.f142111c
            com.sugarcube.decorate.v1.internal.v1.b r1 = (com.sugarcube.decorate.v1.internal.v1.b) r1
            XH.y.b(r4)
            r18 = r10
            r0 = r14
            r14 = r55
            r10 = r5
            r5 = r15
            r15 = r56
            goto L_0x0689
        L_0x024f:
            int r1 = r3.f142102D
            java.lang.Object r2 = r3.f142124p
            java.util.UUID r2 = (java.util.UUID) r2
            java.lang.Object r2 = r3.f142123o
            java.util.UUID r2 = (java.util.UUID) r2
            java.lang.Object r2 = r3.f142122n
            java.util.UUID r2 = (java.util.UUID) r2
            java.lang.Object r2 = r3.f142121m
            com.sugarcube.app.base.data.database.Scene r2 = (com.sugarcube.app.base.data.database.Scene) r2
            java.lang.Object r2 = r3.f142120l
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = r3.f142119k
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r7 = r3.f142118j
            com.sugarcube.app.base.data.database.Scene r7 = (com.sugarcube.app.base.data.database.Scene) r7
            java.lang.Object r9 = r3.f142117i
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r11 = r3.f142116h
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r12 = r3.f142115g
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r3.f142114f
            android.content.res.Resources r13 = (android.content.res.Resources) r13
            java.lang.Object r14 = r3.f142113e
            java.util.UUID r14 = (java.util.UUID) r14
            java.lang.Object r15 = r3.f142112d
            java.util.UUID r15 = (java.util.UUID) r15
            java.lang.Object r8 = r3.f142111c
            com.sugarcube.decorate.v1.internal.v1.b r8 = (com.sugarcube.decorate.v1.internal.v1.b) r8
            XH.y.b(r4)
            r0 = r1
            r1 = r5
            r18 = r10
            goto L_0x05b0
        L_0x0292:
            java.lang.Object r1 = r3.f142122n
            com.sugarcube.app.base.data.database.Scene r1 = (com.sugarcube.app.base.data.database.Scene) r1
            java.lang.Object r2 = r3.f142121m
            com.sugarcube.core.network.models.Manifest r2 = (com.sugarcube.core.network.models.Manifest) r2
            java.lang.Object r2 = r3.f142120l
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = r3.f142119k
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r7 = r3.f142118j
            com.sugarcube.app.base.data.database.Scene r7 = (com.sugarcube.app.base.data.database.Scene) r7
            java.lang.Object r8 = r3.f142117i
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r3.f142116h
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r11 = r3.f142115g
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r3.f142114f
            android.content.res.Resources r12 = (android.content.res.Resources) r12
            java.lang.Object r13 = r3.f142113e
            java.util.UUID r13 = (java.util.UUID) r13
            java.lang.Object r14 = r3.f142112d
            java.util.UUID r14 = (java.util.UUID) r14
            java.lang.Object r15 = r3.f142111c
            com.sugarcube.decorate.v1.internal.v1.b r15 = (com.sugarcube.decorate.v1.internal.v1.b) r15
            XH.y.b(r4)
            goto L_0x0552
        L_0x02c7:
            java.lang.Object r1 = r3.f142120l
            com.sugarcube.core.network.models.RoomType r1 = (com.sugarcube.core.network.models.RoomType) r1
            java.lang.Object r1 = r3.f142119k
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r2 = r3.f142118j
            com.sugarcube.app.base.data.database.Scene r2 = (com.sugarcube.app.base.data.database.Scene) r2
            java.lang.Object r6 = r3.f142117i
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r3.f142116h
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r8 = r3.f142115g
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r3.f142114f
            android.content.res.Resources r9 = (android.content.res.Resources) r9
            java.lang.Object r11 = r3.f142113e
            java.util.UUID r11 = (java.util.UUID) r11
            java.lang.Object r12 = r3.f142112d
            java.util.UUID r12 = (java.util.UUID) r12
            java.lang.Object r13 = r3.f142111c
            com.sugarcube.decorate.v1.internal.v1.b r13 = (com.sugarcube.decorate.v1.internal.v1.b) r13
            XH.y.b(r4)
            r14 = r12
            r15 = r13
            r12 = r9
            r13 = r11
            r11 = 1
            r9 = r7
            r52 = r6
            r6 = r1
            r1 = r2
            r2 = r8
            r8 = r52
            goto L_0x0491
        L_0x0301:
            java.lang.Object r1 = r3.f142117i
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r3.f142116h
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r6 = r3.f142115g
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r3.f142114f
            android.content.res.Resources r7 = (android.content.res.Resources) r7
            java.lang.Object r8 = r3.f142113e
            java.util.UUID r8 = (java.util.UUID) r8
            java.lang.Object r9 = r3.f142112d
            java.util.UUID r9 = (java.util.UUID) r9
            java.lang.Object r11 = r3.f142111c
            com.sugarcube.decorate.v1.internal.v1.b r11 = (com.sugarcube.decorate.v1.internal.v1.b) r11
            XH.y.b(r4)
            r12 = r11
            r11 = 1
            goto L_0x03c2
        L_0x0324:
            java.lang.Object r1 = r3.f142117i
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r1 = r3.f142116h
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r3.f142115g
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = r3.f142114f
            android.content.res.Resources r6 = (android.content.res.Resources) r6
            java.lang.Object r7 = r3.f142113e
            java.util.UUID r7 = (java.util.UUID) r7
            java.lang.Object r8 = r3.f142112d
            java.util.UUID r8 = (java.util.UUID) r8
            java.lang.Object r9 = r3.f142111c
            com.sugarcube.decorate.v1.internal.v1.b r9 = (com.sugarcube.decorate.v1.internal.v1.b) r9
            XH.y.b(r4)
            r11 = 1
            r52 = r2
            r2 = r1
            r1 = r52
            r53 = r8
            r8 = r7
            r7 = r53
            goto L_0x038c
        L_0x034f:
            XH.y.b(r4)
            java.util.LinkedList<RF.k> r4 = r0.f141948E
            r4.clear()
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L_0x0362
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x036a
        L_0x0362:
            r7 = r55
            r8 = r56
            r9 = r57
            r11 = 1
            goto L_0x0397
        L_0x036a:
            com.sugarcube.app.base.data.source.CatalogRepository r6 = r0.f142000n
            r3.f142111c = r0
            r7 = r55
            r3.f142112d = r7
            r8 = r56
            r3.f142113e = r8
            r9 = r57
            r3.f142114f = r9
            r3.f142115g = r1
            r3.f142116h = r2
            r3.f142117i = r4
            r11 = 1
            r3.f142110L = r11
            java.lang.Object r4 = r6.fetchProductInformationLocalIds(r1, r3)
            if (r4 != r5) goto L_0x038a
            return r5
        L_0x038a:
            r6 = r9
            r9 = r0
        L_0x038c:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0395
            java.util.List r12 = YH.C16877v.n()
            goto L_0x039e
        L_0x0395:
            r12 = r4
            goto L_0x039e
        L_0x0397:
            java.util.List r6 = YH.C16877v.n()
            r12 = r6
            r6 = r9
            r9 = r0
        L_0x039e:
            com.sugarcube.app.base.data.SceneRepository r13 = r9.f141999m
            r3.f142111c = r9
            r3.f142112d = r7
            r3.f142113e = r8
            r3.f142114f = r6
            r3.f142115g = r1
            r3.f142116h = r2
            r3.f142117i = r12
            r3.f142118j = r4
            r4 = 2
            r3.f142110L = r4
            java.lang.Object r4 = r13.getScene(r7, r3)
            if (r4 != r5) goto L_0x03ba
            return r5
        L_0x03ba:
            r52 = r6
            r6 = r1
            r1 = r12
            r12 = r9
            r9 = r7
            r7 = r52
        L_0x03c2:
            com.sugarcube.app.base.data.database.Scene r4 = (com.sugarcube.app.base.data.database.Scene) r4
            if (r4 != 0) goto L_0x03f6
            androidx.lifecycle.K<ZF.E0> r1 = r12.f142010x
            ZF.E0 r2 = ZF.C16903E0.Error
            r1.postValue(r2)
            YE.b r1 = YE.C13868b.f118106a
            boolean r2 = r12.f141952G
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fetch scene error: "
            r3.append(r4)
            r3.append(r9)
            r3.append(r10)
            r3.append(r8)
            r3.append(r10)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            YE.e r3 = YE.e.Decoration
            r1.b(r2, r3)
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x03f6:
            ZF.a r13 = r12.f142011y
            if (r13 == 0) goto L_0x0403
            int r14 = r4.getSceneId()
            r13.a0(r14)
            XH.N r13 = XH.C16807N.f139792a
        L_0x0403:
            com.sugarcube.core.network.models.RoomType r13 = r4.getRoomType()
            if (r13 != 0) goto L_0x0413
            com.sugarcube.app.base.data.model.RoomTypeRenderer r13 = com.sugarcube.app.base.data.model.RoomTypeRenderer.INSTANCE
            java.lang.String r14 = r4.getName()
            com.sugarcube.core.network.models.RoomType r13 = r13.getRoom(r7, r14)
        L_0x0413:
            androidx.lifecycle.K<com.sugarcube.core.network.models.RoomType> r14 = r12.f141964M
            r14.postValue(r13)
            android.net.Uri r14 = r4.getGlbUrl()
            if (r14 != 0) goto L_0x0459
            com.sugarcube.core.network.models.Manifest r18 = r4.getManifest()
            if (r18 == 0) goto L_0x0456
            r39 = 1048575(0xfffff, float:1.469367E-39)
            r40 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            com.sugarcube.core.network.models.Manifest r14 = com.sugarcube.core.network.models.Manifest.copy$default(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x0457
        L_0x0456:
            r14 = 0
        L_0x0457:
            r12.f141958J = r14
        L_0x0459:
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            com.sugarcube.app.base.data.SceneRepository r15 = r12.f141999m
            r3.f142111c = r12
            r3.f142112d = r9
            r3.f142113e = r8
            r3.f142114f = r7
            r3.f142115g = r6
            r3.f142116h = r2
            r3.f142117i = r1
            r3.f142118j = r4
            r3.f142119k = r14
            r3.f142120l = r13
            r13 = 0
            r3.f142102D = r13
            r13 = 3
            r3.f142110L = r13
            java.lang.Object r13 = r15.fetchDecorationAssets(r4, r3)
            if (r13 != r5) goto L_0x0481
            return r5
        L_0x0481:
            r15 = r12
            r12 = r7
            r52 = r8
            r8 = r1
            r1 = r4
            r4 = r13
            r13 = r52
            r53 = r9
            r9 = r2
            r2 = r6
            r6 = r14
            r14 = r53
        L_0x0491:
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r7 = r4.iterator()
        L_0x0497:
            boolean r18 = r7.hasNext()
            if (r18 == 0) goto L_0x0509
            java.lang.Object r18 = r7.next()
            com.sugarcube.app.base.data.AssetItem r18 = (com.sugarcube.app.base.data.AssetItem) r18
            int r11 = r18.getResponseCode()
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 > r11) goto L_0x04cf
            r0 = 300(0x12c, float:4.2E-43)
            if (r11 >= r0) goto L_0x04cf
            android.net.Uri r0 = r18.getUri()
            java.io.File r11 = r18.getFile()
            java.io.File r11 = r11.getAbsoluteFile()
            r55 = r7
            java.lang.String r7 = "getAbsoluteFile(...)"
            kotlin.jvm.internal.C17542s.i(r11, r7)
            android.net.Uri r7 = android.net.Uri.fromFile(r11)
            r6.put(r0, r7)
            r0 = r54
            r7 = r55
            r11 = 1
            goto L_0x0497
        L_0x04cf:
            androidx.lifecycle.K<ZF.E0> r0 = r15.f142010x
            ZF.E0 r1 = ZF.C16903E0.Error
            r0.postValue(r1)
            YE.b r0 = YE.C13868b.f118106a
            boolean r1 = r15.f141952G
            android.net.Uri r2 = r18.getUri()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fetch asset error: "
            r3.append(r4)
            r3.append(r14)
            r3.append(r10)
            r3.append(r13)
            r3.append(r10)
            r3.append(r1)
            r3.append(r10)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            YE.e r2 = YE.e.Decoration
            r0.b(r1, r2)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x0509:
            android.net.Uri r0 = r1.getGlbUrl()
            if (r0 == 0) goto L_0x0519
            java.lang.Object r0 = r6.get(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r15.f141960K = r0
            XH.N r0 = XH.C16807N.f139792a
        L_0x0519:
            com.sugarcube.core.network.models.Manifest r0 = r15.f141958J
            if (r0 == 0) goto L_0x0522
            r0.replaceUris(r6)
            XH.N r7 = XH.C16807N.f139792a
        L_0x0522:
            r15.f141956I = r1
            boolean r7 = r1.isHela()
            if (r7 != 0) goto L_0x056b
            com.sugarcube.decorate.DesignStateManager r7 = r15.f142009w
            r3.f142111c = r15
            r3.f142112d = r14
            r3.f142113e = r13
            r3.f142114f = r12
            r3.f142115g = r2
            r3.f142116h = r9
            r3.f142117i = r8
            r3.f142118j = r1
            r3.f142119k = r6
            r3.f142120l = r4
            r3.f142121m = r0
            r3.f142122n = r1
            r0 = 4
            r3.f142110L = r0
            java.lang.Object r0 = r7.isPreserveFeatureEnabled(r3)
            if (r0 != r5) goto L_0x054e
            return r5
        L_0x054e:
            r7 = r1
            r11 = r2
            r2 = r4
            r4 = r0
        L_0x0552:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x0566
            r0 = 1
            r52 = r9
            r9 = r8
            r8 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r52
            goto L_0x0577
        L_0x0566:
            r0 = r1
            r4 = r2
            r1 = r7
            r2 = r11
            goto L_0x056c
        L_0x056b:
            r0 = r1
        L_0x056c:
            r7 = r1
            r11 = r9
            r1 = r0
            r9 = r8
            r8 = r15
            r0 = 0
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r2
            r2 = r4
        L_0x0577:
            java.util.UUID r4 = r8.f141955H0
            if (r4 == 0) goto L_0x05c4
            r18 = r10
            com.sugarcube.decorate.DesignStateManager r10 = r8.f142009w
            r20 = r5
            java.util.UUID r5 = r8.f141953G0
            r3.f142111c = r8
            r3.f142112d = r15
            r3.f142113e = r14
            r3.f142114f = r13
            r3.f142115g = r12
            r3.f142116h = r11
            r3.f142117i = r9
            r3.f142118j = r7
            r3.f142119k = r6
            r3.f142120l = r2
            r3.f142121m = r1
            r3.f142122n = r4
            r3.f142123o = r4
            r3.f142124p = r4
            r3.f142102D = r0
            r1 = 0
            r3.f142103E = r1
            r1 = 5
            r3.f142110L = r1
            java.lang.Object r4 = r10.canBeRestored(r4, r5, r3)
            r1 = r20
            if (r4 != r1) goto L_0x05b0
            return r1
        L_0x05b0:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = r4
            r4 = r11
        L_0x05b8:
            r11 = r2
            r2 = r0
            r0 = r9
            r9 = r12
            r12 = r6
            r6 = r8
            r52 = r13
            r13 = r7
            r7 = r52
            goto L_0x05ca
        L_0x05c4:
            r1 = r5
            r18 = r10
            r4 = r11
            r5 = 0
            goto L_0x05b8
        L_0x05ca:
            if (r5 == 0) goto L_0x05d0
            if (r2 == 0) goto L_0x05d0
            r8 = 1
            goto L_0x05d1
        L_0x05d0:
            r8 = 0
        L_0x05d1:
            YE.b r5 = YE.C13868b.f118106a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r19 = r1
            java.lang.String r1 = "Have un-restored state? "
            r10.append(r1)
            r10.append(r8)
            java.lang.String r1 = r10.toString()
            YE.e r10 = YE.e.Decoration
            r5.b(r1, r10)
            kotlin.jvm.internal.O r1 = new kotlin.jvm.internal.O
            r1.<init>()
            java.time.Instant r5 = java.time.Instant.now()
            r28 = r5
            java.lang.String r10 = "now(...)"
            kotlin.jvm.internal.C17542s.i(r5, r10)
            r55 = r2
            java.time.Instant r2 = java.time.Instant.now()
            r29 = r2
            kotlin.jvm.internal.C17542s.i(r2, r10)
            java.util.List r10 = YH.C16877v.n()
            r27 = r10
            r56 = r10
            int r10 = r13.getSceneId()
            r33 = r10
            r57 = r10
            com.sugarcube.core.network.models.Composition r10 = new com.sugarcube.core.network.models.Composition
            r20 = r10
            r39 = 246812(0x3c41c, float:3.45857E-40)
            r40 = 0
            r21 = -1
            java.lang.String r22 = ""
            r23 = 0
            r24 = 0
            r25 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r26 = r14
            r34 = r15
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r1.f144348a = r10
            if (r8 == 0) goto L_0x070e
            com.sugarcube.app.base.data.source.CompositionRepository r10 = r6.f142001o
            r3.f142111c = r6
            r3.f142112d = r15
            r3.f142113e = r14
            r3.f142114f = r7
            r3.f142115g = r9
            r3.f142116h = r4
            r3.f142117i = r0
            r3.f142118j = r13
            r3.f142119k = r12
            r3.f142120l = r11
            r3.f142121m = r1
            r3.f142122n = r5
            r3.f142123o = r2
            r2 = r56
            r3.f142124p = r2
            r3.f142125q = r6
            r2 = r55
            r3.f142102D = r2
            r3.f142103E = r8
            r5 = r57
            r3.f142104F = r5
            r5 = 6
            r3.f142110L = r5
            java.lang.Object r5 = r10.fetchCompiledComposition(r14, r3)
            r10 = r19
            if (r5 != r10) goto L_0x067a
            return r10
        L_0x067a:
            r16 = r8
            r8 = r11
            r11 = r13
            r13 = r4
            r4 = r5
            r5 = r7
            r7 = r1
            r1 = r6
            r52 = r12
            r12 = r0
            r0 = r9
            r9 = r52
        L_0x0689:
            r19 = r4
            com.sugarcube.core.network.models.CompiledComposition r19 = (com.sugarcube.core.network.models.CompiledComposition) r19
            if (r19 == 0) goto L_0x06d9
            com.sugarcube.core.network.models.Composition r4 = r19.getComposition()
            r55 = r0
            T r0 = r7.f144348a
            r19 = r0
            com.sugarcube.core.network.models.Composition r19 = (com.sugarcube.core.network.models.Composition) r19
            java.lang.String r21 = r4.getName()
            java.time.Instant r27 = r4.getCreatedAt()
            java.time.Instant r28 = r4.getLastModifiedTs()
            boolean r29 = r4.isShared()
            boolean r31 = r4.isStock()
            int r20 = r4.getCompositionId()
            r38 = 259196(0x3f47c, float:3.63211E-40)
            r39 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            com.sugarcube.core.network.models.Composition r0 = com.sugarcube.core.network.models.Composition.copy$default(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r7.f144348a = r0
            XH.N r4 = XH.C16807N.f139792a
            goto L_0x06db
        L_0x06d9:
            r55 = r0
        L_0x06db:
            com.sugarcube.app.base.data.database.CachedCompiledComposition r0 = new com.sugarcube.app.base.data.database.CachedCompiledComposition
            java.util.List r21 = YH.C16877v.n()
            r56 = r1
            T r1 = r7.f144348a
            r20 = r1
            com.sugarcube.core.network.models.Composition r20 = (com.sugarcube.core.network.models.Composition) r20
            com.sugarcube.core.network.models.CompiledComposition r1 = new com.sugarcube.core.network.models.CompiledComposition
            r23 = 4
            r24 = 0
            r22 = 0
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24)
            r23 = 6
            r21 = 0
            r19 = r0
            r20 = r1
            r19.<init>(r20, r21, r22, r23, r24)
            r1 = r56
            r20 = r10
            r10 = r4
            r4 = r7
            r7 = r5
            r5 = r2
            r2 = r9
            r9 = r55
            goto L_0x0827
        L_0x070e:
            r41 = r57
            r20 = r19
            r19 = r8
            r8 = r56
            com.sugarcube.app.base.data.source.CompositionRepository r10 = r6.f142001o
            r3.f142111c = r6
            r3.f142112d = r15
            r3.f142113e = r14
            r3.f142114f = r7
            r3.f142115g = r9
            r3.f142116h = r4
            r3.f142117i = r0
            r3.f142118j = r13
            r3.f142119k = r12
            r3.f142120l = r11
            r3.f142121m = r1
            r3.f142122n = r5
            r3.f142123o = r2
            r3.f142124p = r8
            r3.f142125q = r6
            r2 = r55
            r3.f142102D = r2
            r5 = r19
            r3.f142103E = r5
            r8 = r41
            r3.f142104F = r8
            r8 = 7
            r3.f142110L = r8
            java.lang.Object r8 = r10.fetchCompiledComposition(r14, r3)
            r10 = r20
            if (r8 != r10) goto L_0x074e
            return r10
        L_0x074e:
            r55 = r0
            r19 = r4
            r4 = r8
            r8 = r1
            r1 = r6
        L_0x0755:
            r0 = r4
            com.sugarcube.core.network.models.CompiledComposition r0 = (com.sugarcube.core.network.models.CompiledComposition) r0
            if (r0 == 0) goto L_0x07ea
            java.util.HashMap r4 = new java.util.HashMap
            java.util.List r20 = r0.getCatalogItems()
            if (r20 == 0) goto L_0x076b
            int r20 = r20.size()
            r56 = r2
            r2 = r20
            goto L_0x076e
        L_0x076b:
            r56 = r2
            r2 = 0
        L_0x076e:
            r4.<init>(r2)
            com.sugarcube.core.network.models.Composition r2 = r0.getComposition()
            java.util.Map r2 = r2.getGltf()
            if (r2 == 0) goto L_0x07c9
            r57 = r5
            com.sugarcube.app.base.data.SceneRepository r5 = r1.f141999m
            r58 = r6
            com.sugarcube.app.base.data.database.Scene r6 = r1.f141956I
            if (r6 == 0) goto L_0x078a
            java.util.UUID r6 = r6.getJobId()
            goto L_0x078b
        L_0x078a:
            r6 = 0
        L_0x078b:
            java.io.File r5 = r5.getAssetDirForScene(r15, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "/"
            r6.append(r5)
            r6.append(r14)
            java.lang.String r5 = ".gltf"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            r20 = r1
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)
            r59 = r5
            r2 = 2
            r5 = 0
            jI.C17423j.l(r6, r1, r5, r2, r5)
            XH.N r1 = XH.C16807N.f139792a
            r5 = r59
            goto L_0x07d0
        L_0x07c9:
            r20 = r1
            r57 = r5
            r58 = r6
            r5 = 0
        L_0x07d0:
            com.sugarcube.app.base.data.database.CachedCompiledComposition r1 = new com.sugarcube.app.base.data.database.CachedCompiledComposition
            r1.<init>(r0, r4, r5)
            r5 = r56
            r16 = r57
            r6 = r58
            r0 = r1
            r4 = r8
            r8 = r11
            r2 = r12
            r11 = r13
            r13 = r19
            r12 = r55
            r1 = r20
            r20 = r10
            r10 = r0
            goto L_0x0827
        L_0x07ea:
            r20 = r1
            r56 = r2
            r57 = r5
            r58 = r6
            com.sugarcube.app.base.data.database.CachedCompiledComposition r0 = new com.sugarcube.app.base.data.database.CachedCompiledComposition
            java.util.List r23 = YH.C16877v.n()
            T r1 = r8.f144348a
            r22 = r1
            com.sugarcube.core.network.models.Composition r22 = (com.sugarcube.core.network.models.Composition) r22
            com.sugarcube.core.network.models.CompiledComposition r1 = new com.sugarcube.core.network.models.CompiledComposition
            r25 = 4
            r26 = 0
            r24 = 0
            r21 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            r25 = 6
            r23 = 0
            r21 = r0
            r22 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            r5 = r56
            r16 = r57
            r2 = r12
            r1 = r20
            r12 = r55
            r20 = r10
            r10 = r4
            r4 = r8
            r8 = r11
            r11 = r13
            r13 = r19
        L_0x0827:
            r6.f141962L = r0
            androidx.lifecycle.K<ZF.E0> r0 = r1.f142010x
            r19 = r5
            ZF.E0 r5 = ZF.C16903E0.SceneMetaReady
            r0.postValue(r5)
            YE.b r0 = YE.C13868b.f118106a
            boolean r5 = r1.f141952G
            r21 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r22 = r6
            java.lang.String r6 = "fetch scene meta done: "
            r10.append(r6)
            r10.append(r15)
            r6 = r18
            r10.append(r6)
            r10.append(r14)
            r10.append(r6)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            YE.e r10 = YE.e.Decoration
            r0.b(r5, r10)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.sugarcube.app.base.data.database.CachedCompiledComposition r5 = r1.f141962L
            if (r5 == 0) goto L_0x0a3e
            com.sugarcube.core.network.models.CompiledComposition r10 = r5.getCompiledComposition()
            java.util.List r10 = r10.getCatalogItems()
            if (r10 == 0) goto L_0x0a29
            r18 = r6
            com.sugarcube.app.base.data.source.CatalogRepository r6 = r1.f142000n
            r3.f142111c = r1
            r3.f142112d = r15
            r3.f142113e = r14
            r3.f142114f = r7
            r3.f142115g = r9
            r3.f142116h = r13
            r3.f142117i = r12
            r3.f142118j = r11
            r3.f142119k = r2
            r3.f142120l = r8
            r3.f142121m = r4
            r3.f142122n = r0
            r3.f142123o = r5
            r3.f142124p = r5
            r3.f142125q = r5
            r3.f142126r = r10
            r3.f142127s = r10
            r3.f142128t = r10
            r55 = r0
            r0 = r22
            r3.f142129u = r0
            r0 = r21
            r3.f142130v = r0
            r0 = r19
            r3.f142102D = r0
            r0 = r16
            r3.f142103E = r0
            r0 = 0
            r3.f142104F = r0
            r3.f142105G = r0
            r0 = 8
            r3.f142110L = r0
            r0 = 2
            java.lang.Object r0 = r6.convertCatalogItems(r10, r0, r3)
            r6 = r20
            if (r0 != r6) goto L_0x08be
            return r6
        L_0x08be:
            r26 = r5
            r27 = r26
            r20 = r9
            r23 = r10
            r24 = r23
            r25 = r24
            r10 = r16
            r17 = r21
            r16 = 0
            r9 = r0
            r21 = r7
            r7 = 0
            r0 = r55
        L_0x08d6:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x090b
            r28 = r9
            java.lang.Iterable r28 = (java.lang.Iterable) r28
            java.util.Iterator r28 = r28.iterator()
        L_0x08e2:
            boolean r29 = r28.hasNext()
            if (r29 == 0) goto L_0x0904
            java.lang.Object r29 = r28.next()
            r55 = r1
            r1 = r29
            com.sugarcube.app.base.data.database.CachedCatalogItem r1 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r1
            int r29 = r1.getId()
            r56 = r2
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.e(r29)
            r0.put(r2, r1)
            r1 = r55
            r2 = r56
            goto L_0x08e2
        L_0x0904:
            r55 = r1
            r56 = r2
            XH.N r1 = XH.C16807N.f139792a
            goto L_0x090f
        L_0x090b:
            r55 = r1
            r56 = r2
        L_0x090f:
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r2 = r1.iterator()
            r50 = r1
            r46 = r7
            r43 = r9
            r47 = r10
            r45 = r16
            r49 = r17
            r48 = r19
            r51 = r22
            r42 = r23
            r16 = r24
            r17 = r25
            r9 = r26
            r7 = r27
            r44 = 0
            r1 = r55
            r10 = r0
            r55 = r2
            r2 = r20
            r0 = r21
            r20 = r6
            r6 = r3
            r3 = r56
        L_0x0940:
            boolean r19 = r55.hasNext()
            if (r19 == 0) goto L_0x0a21
            r19 = r9
            java.lang.Object r9 = r55.next()
            r21 = r7
            r7 = r9
            com.sugarcube.app.base.data.database.CachedCatalogItem r7 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r7
            int r22 = r7.getId()
            r56 = r7
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.e(r22)
            r6.f142111c = r1
            r6.f142112d = r15
            r6.f142113e = r14
            r6.f142114f = r0
            r6.f142115g = r2
            r6.f142116h = r13
            r6.f142117i = r12
            r6.f142118j = r11
            r6.f142119k = r3
            r6.f142120l = r8
            r6.f142121m = r4
            r6.f142122n = r10
            r6.f142123o = r5
            r22 = r0
            r0 = r21
            r6.f142124p = r0
            r0 = r19
            r6.f142125q = r0
            r0 = r17
            r6.f142126r = r0
            r0 = r16
            r6.f142127s = r0
            r0 = r42
            r6.f142128t = r0
            r23 = r0
            r0 = r43
            r6.f142129u = r0
            r24 = r0
            r0 = r50
            r6.f142130v = r0
            r25 = r0
            r0 = r55
            r6.f142131w = r0
            r6.f142132x = r9
            r9 = r56
            r6.f142133y = r9
            r6.f142134z = r7
            r6.f142099A = r10
            r26 = r0
            r0 = r51
            r6.f142100B = r0
            r27 = r0
            r0 = r49
            r6.f142101C = r0
            r28 = r0
            r0 = r48
            r6.f142102D = r0
            r29 = r0
            r0 = r47
            r6.f142103E = r0
            r30 = r0
            r0 = r46
            r6.f142104F = r0
            r31 = r0
            r0 = r45
            r6.f142105G = r0
            r32 = r0
            r0 = r44
            r6.f142106H = r0
            r33 = r0
            r0 = 0
            r6.f142107I = r0
            r0 = 9
            r6.f142110L = r0
            java.lang.Object r0 = r1.a0(r9, r6)
            r9 = r20
            if (r0 != r9) goto L_0x09e3
            return r9
        L_0x09e3:
            r20 = r4
            r42 = r23
            r43 = r24
            r50 = r25
            r51 = r27
            r49 = r28
            r48 = r29
            r47 = r30
            r46 = r31
            r45 = r32
            r44 = r33
            r4 = r0
            r25 = r13
            r28 = r14
            r0 = r22
            r14 = r7
            r13 = r10
            r7 = r21
            r52 = r17
            r17 = r16
            r16 = r19
            r19 = r52
        L_0x0a0c:
            r13.put(r14, r4)
            r4 = r20
            r13 = r25
            r55 = r26
            r14 = r28
            r20 = r9
            r9 = r16
            r16 = r17
            r17 = r19
            goto L_0x0940
        L_0x0a21:
            r19 = r9
            XH.N r0 = XH.C16807N.f139792a
            r4 = r10
            r2 = r19
            goto L_0x0a30
        L_0x0a29:
            r55 = r0
            r18 = r6
            r4 = r55
            r2 = r5
        L_0x0a30:
            r6 = 5
            r7 = 0
            r3 = 0
            r5 = 0
            com.sugarcube.app.base.data.database.CachedCompiledComposition r0 = com.sugarcube.app.base.data.database.CachedCompiledComposition.copy$default(r2, r3, r4, r5, r6, r7)
            r1.f141962L = r0
            XH.N r0 = XH.C16807N.f139792a
        L_0x0a3c:
            r3 = r12
            goto L_0x0a41
        L_0x0a3e:
            r18 = r6
            goto L_0x0a3c
        L_0x0a41:
            androidx.lifecycle.K<ZF.E0> r0 = r1.f142010x
            ZF.E0 r2 = ZF.C16903E0.DataReady
            r0.postValue(r2)
            r7 = 14
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r1
            G1(r2, r3, r4, r5, r6, r7, r8)
            YE.b r0 = YE.C13868b.f118106a
            boolean r1 = r1.f141952G
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "fetch data done: "
            r2.append(r3)
            r2.append(r15)
            r3 = r18
            r2.append(r3)
            r2.append(r14)
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            YE.e r2 = YE.e.Decoration
            r0.b(r1, r2)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.b.Z(java.util.UUID, java.util.UUID, android.content.res.Resources, java.util.List, dI.e):java.lang.Object");
    }

    public static /* synthetic */ void b2(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        bVar.a2(z10);
    }

    private final boolean c1() {
        return ((Boolean) C16312j.b((C17168i) null, new o(this, (C17164e<? super o>) null), 1, (Object) null)).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N k2(b bVar, androidx.lifecycle.I i10, List list) {
        F0 unused = C16314k.d(g0.a(bVar), (C17168i) null, (T) null, new E(i10, list, bVar, (C17164e<? super E>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    public static /* synthetic */ void m2(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        bVar.l2(z10);
    }

    public static /* synthetic */ Object r2(b bVar, SceneLayout sceneLayout, boolean z10, C17164e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return bVar.q2(sceneLayout, z10, eVar);
    }

    private final void t2(IDecorateEngine iDecorateEngine) {
        this.f141981U0.postValue(iDecorateEngine.getEngineEraserCounts());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r2.f141948E.size() >= 1) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v2() {
        /*
            r2 = this;
            com.sugarcube.app.base.external.config.a r0 = r2.f142003q
            TJ.P r0 = r0.getTrackingEnabledFlow()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002e
            androidx.lifecycle.K<java.lang.Boolean> r0 = r2.f141997h1
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x002e
            boolean r0 = r2.f141952G
            if (r0 == 0) goto L_0x002e
            java.util.LinkedList<RF.k> r0 = r2.f141948E
            int r0 = r0.size()
            r1 = 1
            if (r0 < r1) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            androidx.lifecycle.K<java.lang.Boolean> r0 = r2.f141995f1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.b.v2():void");
    }

    public final RoomSource A0() {
        if (s1()) {
            return RoomSource.Showroom;
        }
        Scene scene = this.f141956I;
        return (scene == null || !scene.isStock()) ? RoomSource.UserCaptured : RoomSource.Stock;
    }

    public final void A1(IDecorateEngine iDecorateEngine) {
        C17542s.j(iDecorateEngine, "engine");
        if (!this.f141952G) {
            a2(true);
        }
        iDecorateEngine.execEraserOp(EraserPickOp.Restore, EraserPickId.Companion.getKAll());
        C16942a aVar = this.f142011y;
        if (aVar != null) {
            aVar.u();
        }
        t2(iDecorateEngine);
    }

    public final K<RoomType> B0() {
        return this.f141964M;
    }

    public final void B1(RF.k kVar) {
        C16913J0 value;
        C17542s.j(kVar, "selectedInstance");
        C16505B<C16913J0> b10 = this.f141940A;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C16913J0.b(value, kVar, (DecorateViewMode) null, false, 6, (Object) null)));
    }

    public final K<Boolean> C0() {
        return this.f141979T0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object C1(dI.C17164e<? super XH.C16807N> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.sugarcube.decorate.v1.internal.v1.b.q
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.sugarcube.decorate.v1.internal.v1.b$q r0 = (com.sugarcube.decorate.v1.internal.v1.b.q) r0
            int r1 = r0.f142151g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142151g = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v1.internal.v1.b$q r0 = new com.sugarcube.decorate.v1.internal.v1.b$q
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f142149e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142151g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002d:
            java.lang.Object r6 = r0.f142148d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f142147c
            com.sugarcube.decorate.v1.internal.v1.b r6 = (com.sugarcube.decorate.v1.internal.v1.b) r6
            XH.y.b(r1)
            goto L_0x0071
        L_0x0039:
            XH.y.b(r1)
            java.util.LinkedList<RF.k> r1 = r5.f141948E
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0059
            java.lang.String r6 = "DecorateFragment"
            java.lang.String r0 = "won't save empty composition."
            android.util.Log.w(r6, r0)
            androidx.lifecycle.K<java.lang.Integer> r6 = r5.f141971P0
            int r0 = OE.n.f113376h3
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.e(r0)
            r6.setValue(r0)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x0059:
            com.sugarcube.app.base.data.user.UserRepo r1 = r5.f142004r
            TJ.P r1 = r1.isLoggedIn()
            com.sugarcube.decorate.v1.internal.v1.b$r r3 = new com.sugarcube.decorate.v1.internal.v1.b$r
            r3.<init>(r5)
            r0.f142147c = r5
            r0.f142148d = r6
            r0.f142151g = r4
            java.lang.Object r6 = r1.collect(r3, r0)
            if (r6 != r2) goto L_0x0071
            return r2
        L_0x0071:
            XH.k r6 = new XH.k
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.b.C1(dI.e):java.lang.Object");
    }

    public final androidx.lifecycle.F<Boolean> D0() {
        return this.f141973Q0;
    }

    public final void D1() {
        this.f141946D.clear();
        this.f141948E.clear();
    }

    public final Scene E0() {
        return this.f141956I;
    }

    public final void E1() {
        C16913J0 value;
        C16505B<C16913J0> b10 = this.f141940A;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C16913J0.b(value, (RF.k) null, (DecorateViewMode) null, false, 6, (Object) null)));
    }

    public final SceneLayoutFormat F0() {
        Scene scene = this.f141956I;
        return (scene == null || !scene.getHasGltf() || !c1()) ? SceneLayoutFormat.Legacy2D : SceneLayoutFormat.Minimal3D;
    }

    public final void F1(List<CachedCatalogItem> list, boolean z10, boolean z11, boolean z12) {
        C17542s.j(list, "items");
        K<List<d0>> k10 = this.f141951F0;
        Iterable<CachedCatalogItem> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (CachedCatalogItem d0Var : iterable) {
            arrayList.add(new d0(d0Var, z10, z11, z12));
        }
        k10.postValue(arrayList);
    }

    public final UUID G0() {
        return this.f141955H0;
    }

    public final RF.k H0() {
        return this.f141944C;
    }

    public final PreferenceStorage I0() {
        return this.f142005s;
    }

    public final Boolean I1(RF.k kVar) {
        if (kVar != null) {
            return Boolean.valueOf(this.f141950F.remove(kVar));
        }
        return null;
    }

    public final K<Boolean> J0() {
        return this.f141992c1;
    }

    public final void J1(CachedCatalogItem cachedCatalogItem, CachedCatalogItem cachedCatalogItem2, ItemVariantAdapter.a aVar, CatalogItemSource catalogItemSource, ProductParentType productParentType, SmartaPlacementResult smartaPlacementResult) {
        CachedCatalogItem cachedCatalogItem3 = cachedCatalogItem;
        C17542s.j(cachedCatalogItem, "newItem");
        CatalogItemSource catalogItemSource2 = catalogItemSource;
        C17542s.j(catalogItemSource, "itemSource");
        C17542s.j(productParentType, "parentType");
        C16942a aVar2 = this.f142011y;
        if (aVar2 != null) {
            aVar2.g(cachedCatalogItem, cachedCatalogItem2, aVar, productParentType, this.f141976S.getValue(), d0(), catalogItemSource, smartaPlacementResult);
        }
    }

    public final K<Boolean> K0() {
        return this.f141993d1;
    }

    public final androidx.lifecycle.I<Boolean> L0() {
        return this.f141959J0;
    }

    public final K<Boolean> M0() {
        return this.f141994e1;
    }

    public final void M1() {
        CompiledComposition compiledComposition;
        Composition composition;
        this.f142010x.postValue(C16903E0.SceneReady);
        V1();
        C13549b bVar = this.f141945C0;
        Scene scene = this.f141956I;
        Integer valueOf = scene != null ? Integer.valueOf(scene.getSceneId()) : null;
        CachedCompiledComposition cachedCompiledComposition = this.f141962L;
        Integer valueOf2 = (cachedCompiledComposition == null || (composition = cachedCompiledComposition.getComposition()) == null) ? null : Integer.valueOf(composition.getCompositionId());
        Scene scene2 = this.f141956I;
        boolean z10 = false;
        if (scene2 != null && scene2.getHasGltf()) {
            z10 = true;
        }
        CachedCompiledComposition cachedCompiledComposition2 = this.f141962L;
        C13549b b10 = C13549b.b(bVar, valueOf, valueOf2, z10, (cachedCompiledComposition2 == null || (compiledComposition = cachedCompiledComposition2.getCompiledComposition()) == null) ? null : Boolean.valueOf(compiledComposition.getHasGltfComposition()), (Boolean) null, (String) null, 48, (Object) null);
        this.f141945C0 = b10;
        C13868b bVar2 = C13868b.f118106a;
        bVar2.b("ENGINE DEBUG INFO (scene ready) => \n" + b10, e.DecorationEngine);
        bVar2.b("scene ready", e.Decoration);
    }

    public final androidx.lifecycle.F<k> N0() {
        return this.f141977S0;
    }

    public final void N1(FeedbackSmileRatingBar.a aVar) {
        C17542s.j(aVar, "rating");
        Analytics b10 = this.f142002p.b();
        Scene scene = this.f141956I;
        int sceneId = scene != null ? scene.getSceneId() : 0;
        Scene scene2 = this.f141956I;
        b10.sendDesignSmileRating(aVar, sceneId, scene2 != null ? scene2.getSceneUuid() : null, A0());
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new u(this, aVar, (C17164e<? super u>) null), 3, (Object) null);
    }

    public final androidx.lifecycle.F<Boolean> O0() {
        return this.f141949E0;
    }

    public final void O1(RF.j jVar) {
        this.f141963L0.setValue(jVar);
        if (jVar != null) {
            C16942a aVar = this.f142011y;
            if (aVar != null) {
                aVar.k(jVar);
            }
            this.f141961K0 = jVar;
            this.f141974R.setValue(DecorateViewMode.RoomMode);
        }
    }

    public final androidx.lifecycle.F<Boolean> P0() {
        return this.f141972Q;
    }

    public final void P1(UUID uuid) {
        Log.d(AnyKt.SUGARCUBE_TAG, "setCompositionAsExplicitlySaved(" + uuid + ")");
        if (uuid != null) {
            this.f142001o.setExplicitlySavedComposition(uuid);
        }
    }

    public final androidx.lifecycle.F<Boolean> Q0() {
        return this.f141965M0;
    }

    public final void Q1(UUID uuid) {
        this.f141953G0 = uuid;
    }

    public final androidx.lifecycle.F<Boolean> R0() {
        return this.f141996g1;
    }

    public final void R1(PanZoomRegion panZoomRegion) {
        C17542s.j(panZoomRegion, "value");
        this.f141967N0.setValue(panZoomRegion);
    }

    public final androidx.lifecycle.F<Boolean> S0() {
        return this.f141970P;
    }

    public final void S1(DecorateView.a aVar) {
        Collection value = this.f141947D0.getValue();
        if (value != null) {
            W.a(value).remove(aVar);
        }
        K<List<DecorateView.a>> k10 = this.f141947D0;
        if (value == null) {
            value = new ArrayList();
        }
        k10.postValue(value);
    }

    public final void T(DecorateView.a aVar) {
        C17542s.j(aVar, "engineError");
        List value = this.f141947D0.getValue();
        if (value != null) {
            value.add(aVar);
        }
        K<List<DecorateView.a>> k10 = this.f141947D0;
        if (value == null) {
            value = new ArrayList();
        }
        k10.postValue(value);
    }

    public final androidx.lifecycle.F<Integer> T0() {
        return this.f141971P0;
    }

    public final void T1() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new v(this, (C17164e<? super v>) null), 3, (Object) null);
    }

    public final Boolean U(RF.k kVar) {
        if (kVar != null) {
            return Boolean.valueOf(this.f141950F.add(kVar));
        }
        return null;
    }

    public final boolean U0() {
        return this.f141941A0;
    }

    public final void U1(boolean z10) {
        this.f141952G = z10;
    }

    public final Object V0(CachedCatalogItem cachedCatalogItem, SceneLayout sceneLayout, C17164e<? super SmartaPlacementResult> eVar) {
        CachedCompiledComposition cachedCompiledComposition = this.f141962L;
        Composition composition = null;
        if (!(cachedCompiledComposition == null || sceneLayout == null)) {
            CachedCompiledComposition X02 = X0(cachedCompiledComposition, sceneLayout, true);
            this.f141962L = X02;
            composition = X02.getComposition();
        }
        Composition composition2 = composition;
        RF.p pVar = this.f142008v;
        boolean s12 = s1();
        Scene scene = this.f141956I;
        return pVar.a(cachedCatalogItem, composition2, s12, scene != null && scene.isHela(), eVar);
    }

    public final void V1() {
        this.f141966N.setValue(Boolean.FALSE);
    }

    public final void W() {
        Analytics b10 = this.f142002p.b();
        Scene scene = this.f141956I;
        int sceneId = scene != null ? scene.getSceneId() : 0;
        Scene scene2 = this.f141956I;
        b10.dismissDesignSmileRating(sceneId, scene2 != null ? scene2.getSceneUuid() : null, A0());
    }

    public final OE.q W0() {
        return this.f142002p;
    }

    public final void W1() {
        this.f141992c1.setValue(Boolean.FALSE);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new w(this, (C17164e<? super w>) null), 3, (Object) null);
    }

    public final void X(MethodType methodType) {
        C16913J0 value;
        C17542s.j(methodType, "methodType");
        this.f141974R.setValue(DecorateViewMode.FocusMode);
        C16505B<C16913J0> b10 = this.f141940A;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C16913J0.b(value, (RF.k) null, DecorateViewMode.FocusMode, false, 5, (Object) null)));
        O1((RF.j) null);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new m(this, (C17164e<? super m>) null), 3, (Object) null);
        C16942a aVar = this.f142011y;
        if (aVar != null) {
            aVar.U(this.f141974R.getValue(), methodType, d0());
        }
    }

    public final void X1() {
        this.f141993d1.setValue(Boolean.FALSE);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new x(this, (C17164e<? super x>) null), 3, (Object) null);
    }

    public final void Y(MethodType methodType) {
        C16913J0 value;
        C17542s.j(methodType, "methodType");
        this.f141974R.setValue(DecorateViewMode.RoomMode);
        C16505B<C16913J0> b10 = this.f141940A;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C16913J0.b(value, (RF.k) null, DecorateViewMode.RoomMode, false, 5, (Object) null)));
        L1();
        C16942a aVar = this.f142011y;
        if (aVar != null) {
            aVar.U(this.f141974R.getValue(), methodType, d0());
        }
    }

    public final androidx.lifecycle.F<C16913J0> Y0() {
        return this.f141942B;
    }

    public final void Y1(List<MultiviewAdapter.a> list) {
        C17542s.j(list, "information");
        this.f141957I0.postValue(list);
    }

    public final float Z0() {
        PanZoomRegion value = this.f141969O0.getValue();
        if (value != null) {
            return value.zoom;
        }
        return 1.0f;
    }

    public final void Z1() {
        this.f141991b1.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new y(this, (C17164e<? super y>) null), 3, (Object) null);
    }

    public final Object a0(CachedCatalogItem cachedCatalogItem, C17164e<? super CachedCatalogItem> eVar) {
        return this.f142000n.fetchAssetsForCatalogItem(cachedCatalogItem, eVar);
    }

    public final boolean a1(RF.k kVar) {
        return C16877v.l0(this.f141950F, kVar);
    }

    public final void a2(boolean z10) {
        this.f141954H.postValue(Boolean.valueOf(z10));
    }

    public final void b0() {
        this.f142009w.stop();
        C16942a aVar = this.f142011y;
        if (aVar != null) {
            aVar.l(d0());
        }
        this.f142002p.b().decorateEndSession();
        C16942a aVar2 = this.f142011y;
        if (aVar2 != null) {
            aVar2.n();
        }
        this.f141977S0.setValue(null);
    }

    public final boolean b1() {
        return C17542s.e(this.f141983W0.getValue(), Boolean.TRUE);
    }

    public final void c0(IDecorateEngine iDecorateEngine) {
        C17542s.j(iDecorateEngine, "engine");
        s2(iDecorateEngine);
    }

    public final void c2(RF.k kVar) {
        this.f141944C = kVar;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new t(this, kVar, (C17164e<? super t>) null), 3, (Object) null);
    }

    public final RF.j d0() {
        RF.j value = e0().getValue();
        return value == null ? RF.j.FRONT : value;
    }

    public final boolean d1() {
        return this.f141980U;
    }

    public final void d2() {
        this.f141983W0.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new z(this, (C17164e<? super z>) null), 3, (Object) null);
    }

    public final androidx.lifecycle.F<RF.j> e0() {
        return this.f141963L0;
    }

    public final boolean e1() {
        return this.f141978T;
    }

    public final void e2() {
        this.f141989Z0.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new A(this, (C17164e<? super A>) null), 3, (Object) null);
    }

    public final CachedCompiledComposition f0() {
        return this.f141962L;
    }

    public final boolean f1() {
        return C17542s.e(this.f141989Z0.getValue(), Boolean.TRUE);
    }

    public final void f2() {
        this.f141985X0.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new B(this, (C17164e<? super B>) null), 3, (Object) null);
    }

    public final CompositionRepository g0() {
        return this.f142001o;
    }

    public final K<Boolean> g1() {
        return this.f141966N;
    }

    public final void g2(boolean z10) {
        this.f141941A0 = z10;
    }

    public final UUID h0() {
        return this.f141953G0;
    }

    public final boolean h1() {
        return C17542s.e(this.f141985X0.getValue(), Boolean.TRUE) || s1();
    }

    public final void h2() {
        this.f141997h1.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C(this, (C17164e<? super C>) null), 3, (Object) null);
    }

    public final C13549b i0() {
        return this.f141945C0;
    }

    public final boolean i1() {
        return this.f141952G;
    }

    public final void i2(TemporaryDesignStateListener temporaryDesignStateListener) {
        UUID uuid;
        C17542s.j(temporaryDesignStateListener, "listener");
        Scene scene = this.f141956I;
        if ((scene == null || !scene.isHela()) && (uuid = this.f141955H0) != null) {
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new D(this, uuid, temporaryDesignStateListener, (C17164e<? super D>) null), 3, (Object) null);
        }
    }

    public final androidx.lifecycle.F<PanZoomRegion> j0() {
        return this.f141969O0;
    }

    public final boolean j1() {
        return this.f141988Z;
    }

    public final void j2() {
        CachedCompiledComposition cachedCompiledComposition = this.f141962L;
        if (cachedCompiledComposition != null) {
            this.f141962L = CachedCompiledComposition.copy$default(cachedCompiledComposition, CompiledComposition.copy$default(cachedCompiledComposition.getCompiledComposition(), Composition.copy$default(cachedCompiledComposition.getCompiledComposition().getComposition(), 0, (String) null, (Uri) null, (Uri) null, (Integer) null, (UUID) null, (List) null, (Instant) null, (Instant) null, true, (Uri) null, false, 0, (UUID) null, (String) null, (CompositionSavedProperties) null, (Map) null, (Uri) null, 261631, (Object) null), (List) null, (SceneResponse) null, 6, (Object) null), (Map) null, (String) null, 6, (Object) null);
        }
    }

    public final androidx.lifecycle.F<C16903E0> k0() {
        return this.f142010x;
    }

    public final boolean k1() {
        return this.f141984X;
    }

    public final C16519P<DecorateViewMode> l0() {
        return this.f141976S;
    }

    public final boolean l1() {
        return this.f142012y0;
    }

    public final void l2(boolean z10) {
        this.f141949E0.setValue(Boolean.valueOf(z10));
    }

    public final Uri m0() {
        Manifest manifest;
        Scene scene = this.f141956I;
        if (scene == null || (manifest = scene.getManifest()) == null) {
            return null;
        }
        return manifest.getPano();
    }

    public final boolean m1() {
        return this.f141986Y;
    }

    public final DesignStateManager n0() {
        return this.f142009w;
    }

    public final boolean n1() {
        return this.f142014z0;
    }

    public final void n2(boolean z10) {
        C16942a aVar;
        if (z10 && (aVar = this.f142011y) != null) {
            aVar.J(d0());
        }
        this.f141965M0.postValue(Boolean.valueOf(z10));
    }

    public final androidx.lifecycle.F<List<DecorateView.a>> o0() {
        return this.f141947D0;
    }

    public final boolean o1() {
        return C17542s.e(this.f141991b1.getValue(), Boolean.TRUE);
    }

    public final void o2() {
        if (!C17542s.e(this.f141994e1.getValue(), Boolean.FALSE)) {
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new F(this, (C17164e<? super F>) null), 3, (Object) null);
        }
    }

    public final androidx.lifecycle.F<EraserCounts> p0() {
        return this.f141982V0;
    }

    public final K<Boolean> p1() {
        return this.f141968O;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p2(com.sugarcube.app.base.data.database.CachedCompiledComposition r56, com.sugarcube.decorate_engine.SceneLayout r57, boolean r58, dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCompiledComposition> r59) {
        /*
            r55 = this;
            r0 = r55
            r1 = r56
            r2 = r57
            r3 = r58
            r4 = r59
            boolean r5 = r4 instanceof com.sugarcube.decorate.v1.internal.v1.b.H
            if (r5 == 0) goto L_0x001d
            r5 = r4
            com.sugarcube.decorate.v1.internal.v1.b$H r5 = (com.sugarcube.decorate.v1.internal.v1.b.H) r5
            int r6 = r5.f142060p
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.f142060p = r6
            goto L_0x0022
        L_0x001d:
            com.sugarcube.decorate.v1.internal.v1.b$H r5 = new com.sugarcube.decorate.v1.internal.v1.b$H
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r6 = r5.f142058n
            java.lang.Object r7 = eI.C17187b.f()
            int r8 = r5.f142060p
            r9 = 1
            if (r8 == 0) goto L_0x0060
            if (r8 != r9) goto L_0x0058
            java.lang.Object r1 = r5.f142055k
            com.sugarcube.core.network.models.CompiledComposition r1 = (com.sugarcube.core.network.models.CompiledComposition) r1
            java.lang.Object r1 = r5.f142054j
            com.sugarcube.core.network.models.CompiledComposition r1 = (com.sugarcube.core.network.models.CompiledComposition) r1
            java.lang.Object r1 = r5.f142053i
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r1 = r5.f142052h
            com.sugarcube.core.network.models.CompiledComposition r1 = (com.sugarcube.core.network.models.CompiledComposition) r1
            java.lang.Object r1 = r5.f142051g
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            java.lang.Object r2 = r5.f142050f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r5.f142049e
            com.sugarcube.decorate_engine.SceneLayout r2 = (com.sugarcube.decorate_engine.SceneLayout) r2
            java.lang.Object r2 = r5.f142048d
            com.sugarcube.app.base.data.database.CachedCompiledComposition r2 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r2
            java.lang.Object r2 = r5.f142047c
            com.sugarcube.decorate.v1.internal.v1.b r2 = (com.sugarcube.decorate.v1.internal.v1.b) r2
            XH.y.b(r6)
            goto L_0x018d
        L_0x0058:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0060:
            XH.y.b(r6)
            kotlin.jvm.internal.O r6 = new kotlin.jvm.internal.O
            r6.<init>()
            r6.f144348a = r1
            com.sugarcube.core.network.models.CompiledComposition r11 = r56.getCompiledComposition()
            com.sugarcube.core.network.models.Composition r12 = r11.getComposition()
            boolean r8 = r55.s1()
            if (r8 != 0) goto L_0x0083
            com.sugarcube.app.base.data.source.CompositionRepository r8 = r0.f142001o
            java.util.UUID r13 = r12.getCompositionUuid()
            r8.getComposition((java.util.UUID) r13)
            goto L_0x0113
        L_0x0083:
            boolean r8 = r0.f141952G
            if (r8 == 0) goto L_0x0113
            java.time.Instant r8 = java.time.Instant.now()
            r20 = r8
            java.lang.String r13 = "now(...)"
            kotlin.jvm.internal.C17542s.i(r8, r13)
            java.time.Instant r8 = java.time.Instant.now()
            r21 = r8
            kotlin.jvm.internal.C17542s.i(r8, r13)
            r31 = 261759(0x3fe7f, float:3.66802E-40)
            r32 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            com.sugarcube.core.network.models.Composition r33 = com.sugarcube.core.network.models.Composition.copy$default(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            if (r3 != 0) goto L_0x00f2
            r52 = 262141(0x3fffd, float:3.67338E-40)
            r53 = 0
            r34 = 0
            java.lang.String r35 = ""
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            com.sugarcube.core.network.models.Composition r8 = com.sugarcube.core.network.models.Composition.copy$default(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r33 = r8
        L_0x00f2:
            r15 = 6
            r16 = 0
            r13 = 0
            r14 = 0
            r12 = r33
            com.sugarcube.core.network.models.CompiledComposition r11 = com.sugarcube.core.network.models.CompiledComposition.copy$default(r11, r12, r13, r14, r15, r16)
            T r8 = r6.f144348a
            r17 = r8
            com.sugarcube.app.base.data.database.CachedCompiledComposition r17 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r17
            r21 = 6
            r22 = 0
            r19 = 0
            r20 = 0
            r18 = r11
            com.sugarcube.app.base.data.database.CachedCompiledComposition r8 = com.sugarcube.app.base.data.database.CachedCompiledComposition.copy$default(r17, r18, r19, r20, r21, r22)
            r6.f144348a = r8
        L_0x0113:
            YE.b r8 = YE.C13868b.f118106a
            java.util.UUID r13 = r12.getCompositionUuid()
            boolean r14 = r0.f141952G
            boolean r15 = r12.isShared()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = "saving composition "
            r10.append(r9)
            r10.append(r13)
            java.lang.String r9 = " new="
            r10.append(r9)
            r10.append(r14)
            java.lang.String r9 = " isShared="
            r10.append(r9)
            r10.append(r15)
            java.lang.String r9 = r10.toString()
            YE.e r10 = YE.e.Decoration
            r8.b(r9, r10)
            androidx.lifecycle.K<java.lang.Boolean> r8 = r0.f141968O
            r9 = 1
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r9)
            r8.setValue(r10)
            T r8 = r6.f144348a
            com.sugarcube.app.base.data.database.CachedCompiledComposition r8 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r8
            r9 = 0
            com.sugarcube.app.base.data.database.CachedCompiledComposition r8 = r0.X0(r8, r2, r9)
            r6.f144348a = r8
            com.sugarcube.core.network.models.CompiledComposition r8 = r8.getCompiledComposition()
            if (r3 == 0) goto L_0x01ca
            T r9 = r6.f144348a
            com.sugarcube.app.base.data.database.CachedCompiledComposition r9 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r9
            com.sugarcube.app.base.data.source.CompositionRepository r10 = r0.f142001o
            r5.f142047c = r0
            r5.f142048d = r1
            r5.f142049e = r2
            r5.f142050f = r4
            r5.f142051g = r6
            r5.f142052h = r11
            r5.f142053i = r12
            r5.f142054j = r8
            r5.f142055k = r8
            r5.f142056l = r3
            r1 = 0
            r5.f142057m = r1
            r1 = 1
            r5.f142060p = r1
            java.lang.Object r1 = RF.i.q(r9, r10, r5)
            if (r1 != r7) goto L_0x0187
            return r7
        L_0x0187:
            r2 = r0
            r54 = r6
            r6 = r1
            r1 = r54
        L_0x018d:
            com.sugarcube.app.base.data.database.CachedCompiledComposition r6 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r6
            if (r6 == 0) goto L_0x01c7
            r1.f144348a = r6
            RF.b r7 = r2.f141945C0
            com.sugarcube.core.network.models.Composition r3 = r6.getComposition()
            boolean r3 = r3.isLegacy2D()
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.b.a(r3)
            r14 = 47
            r15 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            RF.b r3 = RF.C13549b.b(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.f141945C0 = r3
            YE.b r4 = YE.C13868b.f118106a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ENGINE DEBUG INFO (saving) => \n"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            YE.e r5 = YE.e.DecorationEngine
            r4.b(r3, r5)
        L_0x01c7:
            r6 = r1
        L_0x01c8:
            r1 = 0
            goto L_0x01cc
        L_0x01ca:
            r2 = r0
            goto L_0x01c8
        L_0x01cc:
            r2.a2(r1)
            r2.f141952G = r1
            androidx.lifecycle.K<java.lang.Boolean> r3 = r2.f141968O
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r1)
            r3.postValue(r1)
            T r1 = r6.f144348a
            com.sugarcube.app.base.data.database.CachedCompiledComposition r1 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r1
            com.sugarcube.core.network.models.CompiledComposition r1 = r1.getCompiledComposition()
            com.sugarcube.core.network.models.Composition r1 = r1.getComposition()
            java.util.UUID r1 = r1.getCompositionUuid()
            r2.f141953G0 = r1
            T r1 = r6.f144348a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.b.p2(com.sugarcube.app.base.data.database.CachedCompiledComposition, com.sugarcube.decorate_engine.SceneLayout, boolean, dI.e):java.lang.Object");
    }

    public final androidx.lifecycle.F<Boolean> q0() {
        return this.f141975R0;
    }

    public final K<Boolean> q1() {
        return this.f141954H;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q2(com.sugarcube.decorate_engine.SceneLayout r6, boolean r7, dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCompiledComposition> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.sugarcube.decorate.v1.internal.v1.b.G
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.sugarcube.decorate.v1.internal.v1.b$G r0 = (com.sugarcube.decorate.v1.internal.v1.b.G) r0
            int r1 = r0.f142046o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142046o = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v1.internal.v1.b$G r0 = new com.sugarcube.decorate.v1.internal.v1.b$G
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f142044m
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142046o
            r4 = 1
            if (r3 == 0) goto L_0x0051
            if (r3 != r4) goto L_0x0049
            java.lang.Object r6 = r0.f142041j
            kotlin.jvm.internal.O r6 = (kotlin.jvm.internal.O) r6
            java.lang.Object r7 = r0.f142040i
            com.sugarcube.app.base.data.database.CachedCompiledComposition r7 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r7
            java.lang.Object r7 = r0.f142039h
            com.sugarcube.app.base.data.database.CachedCompiledComposition r7 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r7
            java.lang.Object r7 = r0.f142038g
            com.sugarcube.app.base.data.database.CachedCompiledComposition r7 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r7
            java.lang.Object r7 = r0.f142037f
            kotlin.jvm.internal.O r7 = (kotlin.jvm.internal.O) r7
            java.lang.Object r8 = r0.f142036e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f142035d
            com.sugarcube.decorate_engine.SceneLayout r8 = (com.sugarcube.decorate_engine.SceneLayout) r8
            java.lang.Object r8 = r0.f142034c
            com.sugarcube.decorate.v1.internal.v1.b r8 = (com.sugarcube.decorate.v1.internal.v1.b) r8
            XH.y.b(r1)
            goto L_0x0081
        L_0x0049:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0051:
            XH.y.b(r1)
            kotlin.jvm.internal.O r1 = new kotlin.jvm.internal.O
            r1.<init>()
            com.sugarcube.app.base.data.database.CachedCompiledComposition r3 = r5.f141962L
            r1.f144348a = r3
            if (r3 == 0) goto L_0x0085
            r0.f142034c = r5
            r0.f142035d = r6
            r0.f142036e = r8
            r0.f142037f = r1
            r0.f142038g = r3
            r0.f142039h = r3
            r0.f142040i = r3
            r0.f142041j = r1
            r0.f142042k = r7
            r8 = 0
            r0.f142043l = r8
            r0.f142046o = r4
            java.lang.Object r6 = r5.p2(r3, r6, r7, r0)
            if (r6 != r2) goto L_0x007d
            return r2
        L_0x007d:
            r8 = r5
            r7 = r1
            r1 = r6
            r6 = r7
        L_0x0081:
            r6.f144348a = r1
            r1 = r7
            goto L_0x0086
        L_0x0085:
            r8 = r5
        L_0x0086:
            T r6 = r1.f144348a
            com.sugarcube.app.base.data.database.CachedCompiledComposition r6 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r6
            r8.f141962L = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.b.q2(com.sugarcube.decorate_engine.SceneLayout, boolean, dI.e):java.lang.Object");
    }

    public final Uri r0() {
        return this.f141960K;
    }

    public final boolean r1() {
        return C17542s.e(this.f141954H.getValue(), Boolean.TRUE);
    }

    public final RF.j s0() {
        Scene scene = this.f141956I;
        return (scene == null || !scene.isHela()) ? RF.j.FRONT : RF.j.DOLLHOUSE_1;
    }

    public final boolean s1() {
        Scene scene = this.f141956I;
        return scene != null && scene.isStock();
    }

    public final void s2(IDecorateEngine iDecorateEngine) {
        C17542s.j(iDecorateEngine, "engine");
        UUID uuid = this.f141955H0;
        if (uuid != null) {
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new I(this, uuid, iDecorateEngine, (C17164e<? super I>) null), 3, (Object) null);
        }
    }

    public final androidx.lifecycle.F<List<d0>> t0() {
        return this.f141951F0;
    }

    public final boolean t1() {
        return C17542s.e(this.f141987Y0.getValue(), Boolean.TRUE);
    }

    public final Manifest u0() {
        return this.f141958J;
    }

    public final void u1(UUID uuid, int i10, UUID uuid2, Resources resources, boolean z10, List<String> list) {
        UUID uuid3 = uuid;
        C17542s.j(uuid, "sceneUuid");
        Resources resources2 = resources;
        C17542s.j(resources, "resources");
        this.f141952G = z10;
        UUID randomUUID = uuid2 == null ? UUID.randomUUID() : uuid2;
        this.f141955H0 = uuid3;
        this.f141953G0 = randomUUID;
        OE.q qVar = this.f142002p;
        C17542s.g(randomUUID);
        int i11 = i10;
        this.f142011y = new C16942a(qVar, uuid, i10, randomUUID);
        F0 f02 = this.f141998i1;
        if (f02 == null || !f02.c()) {
            this.f141998i1 = C16314k.d(g0.a(this), C16311i0.b(), (T) null, new p(this, uuid, randomUUID, resources, list, (C17164e<? super p>) null), 2, (Object) null);
        }
    }

    public final void u2(String str) {
        C17542s.j(str, "name");
        CachedCompiledComposition cachedCompiledComposition = this.f141962L;
        if (cachedCompiledComposition != null) {
            this.f141962L = CachedCompiledComposition.copy$default(cachedCompiledComposition, CompiledComposition.copy$default(cachedCompiledComposition.getCompiledComposition(), Composition.copy$default(cachedCompiledComposition.getCompiledComposition().getComposition(), 0, str, (Uri) null, (Uri) null, (Integer) null, (UUID) null, (List) null, (Instant) null, (Instant) null, false, (Uri) null, false, 0, (UUID) null, (String) null, (CompositionSavedProperties) null, (Map) null, (Uri) null, 262141, (Object) null), (List) null, (SceneResponse) null, 6, (Object) null), (Map) null, (String) null, 6, (Object) null);
        }
        this.f141979T0.setValue(Boolean.FALSE);
        this.f141973Q0.setValue(Boolean.TRUE);
    }

    public final LinkedList<RF.k> v0() {
        return this.f141948E;
    }

    public final void v1() {
        C16942a aVar = this.f142011y;
        if (aVar != null) {
            aVar.q(d0());
        }
        if (this.f141948E.isEmpty()) {
            Log.w("DecorateFragment", "Composition is empty. Cleanup and exit.");
            V();
        } else if (!r1()) {
            V();
        } else {
            this.f141977S0.setValue(this.f141952G ? k.EXIT_CONFIRMATION_DIALOG : k.EXIT_SAVE_PROMPT_DIALOG);
            this.f141979T0.setValue(Boolean.TRUE);
        }
    }

    public final HashMap<ObjectInstanceId, RF.k> w0() {
        return this.f141946D;
    }

    public final void w1() {
        C16942a aVar = this.f142011y;
        if (aVar != null) {
            aVar.v();
        }
        V();
    }

    public final androidx.lifecycle.F<List<MultiviewAdapter.a>> x0() {
        return this.f141957I0;
    }

    public final void x1(String str, double d10, String str2) {
        C17542s.j(str, "name");
        C16942a aVar = this.f142011y;
        if (aVar != null) {
            aVar.r(str, d10, str2);
        }
    }

    public final C16434j<Object> y0() {
        return this.f142013z;
    }

    public final void y1(IDecorateEngine iDecorateEngine) {
        C17542s.j(iDecorateEngine, "engine");
        if (!this.f141952G) {
            a2(true);
        }
        iDecorateEngine.execEraserOp(EraserPickOp.Erase, EraserPickId.Companion.getKAll());
        C16942a aVar = this.f142011y;
        if (aVar != null) {
            aVar.s();
        }
        t2(iDecorateEngine);
    }

    public final C16942a z0() {
        return this.f142011y;
    }

    public final void z1(IDecorateEngine iDecorateEngine) {
        C17542s.j(iDecorateEngine, "engine");
        if (!this.f141952G) {
            a2(true);
        }
        t2(iDecorateEngine);
    }
}
