package com.sugarcube.decorate.v2.internal.ui.surface;

import HJ.C15854t;
import JG.C15929K;
import JG.C15930a;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15989e;
import LG.C16005b;
import MG.C16033b;
import MG.C16038g;
import NG.C16093b;
import OG.l0;
import OG.n0;
import OG.s0;
import OG.t0;
import OG.u0;
import OG.v0;
import PG.C16186d;
import QG.C16219E;
import QJ.C16297b0;
import QJ.C16339x;
import QJ.C16343z;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import SG.C16404b;
import SG.C16415m;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import UG.C16569f;
import VG.C16653f;
import XG.C16793h;
import XH.C16807N;
import XH.C16816g;
import XH.C16820k;
import XH.C16824o;
import XH.C16825p;
import android.content.Intent;
import android.util.Log;
import androidx.lifecycle.K;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.sugarcube.app.base.data.analytics.MethodType;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.data.source.CatalogRepository;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.shoppinglist.FetchShoppingListItemsUseCase;
import com.sugarcube.common.UiText;
import com.sugarcube.core.analytics.Design;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.logger.Priority;
import com.sugarcube.core.network.models.CatalogItemVariants;
import com.sugarcube.core.network.models.QuickFilter;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.core.network.models.SmartaPlacementResult;
import com.sugarcube.core.network.models.VariantType;
import com.sugarcube.core.network.models.VariantValue;
import com.sugarcube.decorate.internal.navigation.V2;
import com.sugarcube.decorate.v2.internal.DecorateEngineController;
import com.sugarcube.decorate.v2.internal.manager.CompositionUpdater;
import com.sugarcube.decorate.v2.internal.manager.DecorationScope;
import com.sugarcube.decorate.v2.internal.manager.engine.EngineMagicEraserInteractions;
import com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl;
import com.sugarcube.decorate.v2.internal.manager.engine.EngineToolbarInteractions;
import com.sugarcube.decorate.v2.internal.manager.engine.EngineViewportInteractions;
import com.sugarcube.decorate.v2.internal.manager.scene.SceneLoadingManager;
import com.sugarcube.decorate.v2.internal.manager.touch.TouchManager;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase;
import com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.browse.BrowseViewModel;
import com.sugarcube.decorate.v2.internal.ui.surface.a;
import com.sugarcube.decorate.v2.internal.ui.toolbars.variants.VariantsViewModel;
import com.sugarcube.decorate.v2.internal.usecase.SaveDesignUseCase;
import com.sugarcube.decorate.v2.internal.usecase.ShareDesignUseCase;
import com.sugarcube.decorate_engine.EraserCounts;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import com.sugarcube.decorate_engine.PanZoomRegion;
import com.sugarcube.decorate_engine.SceneLayout;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import hG.C17318v;
import iG.C17351h;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kG.C17497c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lF.C14768a;
import mG.C17597b;
import nG.C17621a;
import nI.C17642l;
import uG.C18048l;

@Metadata(d1 = {"\u0000Æ\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0002\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Bµ\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0001\u0010#\u001a\u00020\"\u0012\b\b\u0001\u0010$\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0014¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u0002032\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0018\u0010<\u001a\u0002032\u0006\u0010;\u001a\u00020:HA¢\u0006\u0004\b<\u0010=J\u0018\u0010@\u001a\u0002032\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\u0002032\u0006\u0010;\u001a\u00020:HA¢\u0006\u0004\bB\u0010=J\u0018\u0010E\u001a\u0002032\u0006\u0010D\u001a\u00020CHA¢\u0006\u0004\bE\u0010FJ\u0018\u0010J\u001a\u00020I2\u0006\u0010H\u001a\u00020GH\u0001¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u000203H\u0002¢\u0006\u0004\bL\u00105J\u0019\u0010O\u001a\u0002032\b\u0010N\u001a\u0004\u0018\u00010MH\u0002¢\u0006\u0004\bO\u0010PJ \u0010T\u001a\u0002032\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020CH@¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u0002032\u0006\u00107\u001a\u00020VH\u0002¢\u0006\u0004\bW\u0010XJ\u0018\u0010Z\u001a\u0002032\u0006\u0010Y\u001a\u00020CH@¢\u0006\u0004\bZ\u0010FJ\u0017\u0010[\u001a\u0002032\u0006\u0010Y\u001a\u00020CH\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u000203H\u0002¢\u0006\u0004\b]\u00105J\u000f\u0010^\u001a\u000203H\u0002¢\u0006\u0004\b^\u00105J\u000f\u0010_\u001a\u000203H\u0002¢\u0006\u0004\b_\u00105J\u0010\u0010`\u001a\u000203H@¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u000203H@¢\u0006\u0004\bb\u0010aJ\u000f\u0010c\u001a\u000203H\u0002¢\u0006\u0004\bc\u00105J\u000f\u0010d\u001a\u000203H\u0002¢\u0006\u0004\bd\u00105J\u000f\u0010e\u001a\u000203H\u0002¢\u0006\u0004\be\u00105J\u000f\u0010f\u001a\u000203H\u0002¢\u0006\u0004\bf\u00105J\u000f\u0010g\u001a\u000203H\u0002¢\u0006\u0004\bg\u00105J\u0010\u0010h\u001a\u000203H@¢\u0006\u0004\bh\u0010aJ\u0010\u0010i\u001a\u000203H@¢\u0006\u0004\bi\u0010aJ\u0010\u0010j\u001a\u000203H@¢\u0006\u0004\bj\u0010aJ\u000f\u0010k\u001a\u000203H\u0002¢\u0006\u0004\bk\u00105J\u0018\u0010m\u001a\u0002032\u0006\u0010N\u001a\u00020lH@¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u000203H\u0002¢\u0006\u0004\bo\u00105J\u000f\u0010p\u001a\u000203H\u0002¢\u0006\u0004\bp\u00105J\u0010\u0010q\u001a\u000203H@¢\u0006\u0004\bq\u0010aJ\u000f\u0010r\u001a\u000203H\u0002¢\u0006\u0004\br\u00105J\u000f\u0010s\u001a\u000203H\u0002¢\u0006\u0004\bs\u00105J\u000f\u0010t\u001a\u000203H\u0002¢\u0006\u0004\bt\u00105J \u0010w\u001a\u0002032\u0006\u0010S\u001a\u00020C2\u0006\u0010v\u001a\u00020uH@¢\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u000203H\u0002¢\u0006\u0004\by\u00105J\u000f\u0010z\u001a\u000203H\u0002¢\u0006\u0004\bz\u00105J\u0017\u0010}\u001a\u0002032\u0006\u0010|\u001a\u00020{H\u0002¢\u0006\u0004\b}\u0010~J\u000f\u0010\u001a\u000203H\u0002¢\u0006\u0004\b\u00105J\u0011\u0010\u0001\u001a\u000203H\u0002¢\u0006\u0005\b\u0001\u00105J\u001a\u0010\u0001\u001a\u0002032\u0006\u0010S\u001a\u00020CH@¢\u0006\u0005\b\u0001\u0010FJ\u001a\u0010\u0001\u001a\u0002032\u0006\u0010S\u001a\u00020CH@¢\u0006\u0005\b\u0001\u0010FJ\u0011\u0010\u0001\u001a\u000203H\u0002¢\u0006\u0005\b\u0001\u00105J\u001d\u0010\u0001\u001a\u0002032\b\u0010\u0001\u001a\u00030\u0001H@¢\u0006\u0006\b\u0001\u0010\u0001J\u0012\u0010\u0001\u001a\u000203H@¢\u0006\u0005\b\u0001\u0010aJ\u0012\u0010\u0001\u001a\u000203H@¢\u0006\u0005\b\u0001\u0010aJ\u0011\u0010\u0001\u001a\u000203H\u0002¢\u0006\u0005\b\u0001\u00105J2\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020C2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H@¢\u0006\u0006\b\u0001\u0010\u0001J\u001f\u0010\u0001\u001a\u0002032\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H@¢\u0006\u0006\b\u0001\u0010\u0001J'\u0010\u0001\u001a\u0002032\b\u0010\u0001\u001a\u00030\u00012\t\b\u0002\u0010\u0001\u001a\u00020uH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0012\u0010\u0001\u001a\u000203H@¢\u0006\u0005\b\u0001\u0010aJ\u0012\u0010\u0001\u001a\u000203H@¢\u0006\u0005\b\u0001\u0010aJ\u0012\u0010\u0001\u001a\u000203H@¢\u0006\u0005\b\u0001\u0010aJ\u001b\u0010\u0001\u001a\u0002032\u0007\u0010\u0001\u001a\u00020uH\u0002¢\u0006\u0006\b\u0001\u0010\u0001JJ\u0010¥\u0001\u001a\u0002032\b\u0010\u0001\u001a\u00030\u00012\t\b\u0002\u0010 \u0001\u001a\u00020u2 \u0010¤\u0001\u001a\u001b\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002030¢\u0001\u0012\u0007\u0012\u0005\u0018\u00010£\u00010¡\u0001H@¢\u0006\u0006\b¥\u0001\u0010¦\u0001JE\u0010¨\u0001\u001a\u0002032\t\b\u0002\u0010\u0001\u001a\u00020u2&\u0010¤\u0001\u001a!\b\u0001\u0012\u0004\u0012\u00020\"\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002030¢\u0001\u0012\u0007\u0012\u0005\u0018\u00010£\u00010§\u0001H\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001J:\u0010ª\u0001\u001a\u0002032&\u0010¤\u0001\u001a!\b\u0001\u0012\u0004\u0012\u00020\"\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002030¢\u0001\u0012\u0007\u0012\u0005\u0018\u00010£\u00010§\u0001H\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010­\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0016\u0010$\u001a\u00020\"8\u0002X\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Ë\u0001R\u0016\u0010&\u001a\u00020%8\u0002X\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u0016\u0010'\u001a\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u0016\u0010(\u001a\u00020\u00038\u0002X\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u0016\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u0018\u0010Ø\u0001\u001a\u00030Õ\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u0018\u0010Ü\u0001\u001a\u00030Ù\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u0018\u0010à\u0001\u001a\u00030Ý\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R!\u0010å\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010â\u00010á\u00018\u0002X\u0004¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R&\u0010ë\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010â\u00010æ\u00018\u0006¢\u0006\u0010\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001R!\u0010î\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ì\u00010á\u00018\u0002X\u0004¢\u0006\b\n\u0006\bí\u0001\u0010ä\u0001R&\u0010ñ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ì\u00010æ\u00018\u0006¢\u0006\u0010\n\u0006\bï\u0001\u0010è\u0001\u001a\u0006\bð\u0001\u0010ê\u0001R!\u0010÷\u0001\u001a\u00030ò\u00018BX\u0002¢\u0006\u0010\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001R \u0010û\u0001\u001a\t\u0012\u0004\u0012\u00020u0ø\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R \u0010ý\u0001\u001a\t\u0012\u0004\u0012\u00020u0ø\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bü\u0001\u0010ú\u0001R \u0010ÿ\u0001\u001a\t\u0012\u0004\u0012\u00020u0ø\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010ú\u0001R \u0010\u0002\u001a\t\u0012\u0004\u0012\u00020u0ø\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010ú\u0001R \u0010\u0002\u001a\t\u0012\u0004\u0012\u00020Q0ø\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010ú\u0001R\u0018\u0010\u0002\u001a\u00030\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R0\u0010\u0002\u001a\u0005\u0018\u00010\u00022\n\u0010\u0002\u001a\u0005\u0018\u00010\u00028F@FX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R0\u0010\u0002\u001a\u0005\u0018\u00010\u00022\n\u0010\u0002\u001a\u0005\u0018\u00010\u00028F@FX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R0\u0010¥\u0002\u001a\u0005\u0018\u00010 \u00022\n\u0010\u0002\u001a\u0005\u0018\u00010 \u00028F@FX\u000e¢\u0006\u0010\u001a\u0006\b¡\u0002\u0010¢\u0002\"\u0006\b£\u0002\u0010¤\u0002R-\u0010©\u0002\u001a\u0004\u0018\u00010M2\t\u0010\u0002\u001a\u0004\u0018\u00010M8F@FX\u000e¢\u0006\u000f\u001a\u0006\b¦\u0002\u0010§\u0002\"\u0005\b¨\u0002\u0010PR0\u0010¯\u0002\u001a\u0005\u0018\u00010ª\u00022\n\u0010\u0002\u001a\u0005\u0018\u00010ª\u00028F@FX\u000e¢\u0006\u0010\u001a\u0006\b«\u0002\u0010¬\u0002\"\u0006\b­\u0002\u0010®\u0002R,\u0010µ\u0002\u001a\u00030°\u00022\b\u0010\u0002\u001a\u00030°\u00028F@FX\u000e¢\u0006\u0010\u001a\u0006\b±\u0002\u0010²\u0002\"\u0006\b³\u0002\u0010´\u0002R:\u0010»\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020¶\u00022\u000f\u0010\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020¶\u00028B@BX\u000e¢\u0006\u0010\u001a\u0006\b·\u0002\u0010¸\u0002\"\u0006\b¹\u0002\u0010º\u0002R*\u0010À\u0002\u001a\u00020Q2\u0007\u0010\u0002\u001a\u00020Q8B@BX\u000e¢\u0006\u0010\u001a\u0006\b¼\u0002\u0010½\u0002\"\u0006\b¾\u0002\u0010¿\u0002¨\u0006Á\u0002"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/h;", "Landroidx/lifecycle/f0;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/ui/catalog/browse/BrowseViewModel;", "Lcom/sugarcube/decorate/v2/internal/ui/toolbars/variants/VariantsViewModel;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl;", "engineManager", "Lcom/sugarcube/decorate/v2/internal/manager/scene/SceneLoadingManager;", "sceneLoadingManager", "Lcom/sugarcube/app/base/data/source/CatalogRepository;", "catalogRepository", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepository", "Lcom/sugarcube/decorate/v2/internal/manager/CompositionUpdater;", "compositionUpdater", "LhG/v;", "decorateAnalytics", "Lcom/sugarcube/decorate/v2/internal/usecase/ShareDesignUseCase;", "shareDesignUseCase", "Lcom/sugarcube/app/base/external/shoppinglist/FetchShoppingListItemsUseCase;", "fetchShoppingListItemsUseCase", "LRF/r;", "variantsUseCase", "LLG/b;", "ratingUseCase", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase;", "cartUseCase", "LRF/p;", "smartaPlacementUseCase", "Lcom/sugarcube/decorate/v2/internal/usecase/SaveDesignUseCase;", "saveDesignUseCase", "Landroidx/lifecycle/U;", "savedStateHandle", "LQJ/Q;", "decorateScope", "backgroundScope", "Lcom/sugarcube/decorate/v2/internal/ui/surface/ArgumentParser;", "argumentParser", "browseViewModel", "variantsViewModel", "LNG/b;", "stateHolder", "<init>", "(Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl;Lcom/sugarcube/decorate/v2/internal/manager/scene/SceneLoadingManager;Lcom/sugarcube/app/base/data/source/CatalogRepository;Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/decorate/v2/internal/manager/CompositionUpdater;LhG/v;Lcom/sugarcube/decorate/v2/internal/usecase/ShareDesignUseCase;Lcom/sugarcube/app/base/external/shoppinglist/FetchShoppingListItemsUseCase;LRF/r;LLG/b;Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase;LRF/p;Lcom/sugarcube/decorate/v2/internal/usecase/SaveDesignUseCase;Landroidx/lifecycle/U;LQJ/Q;LQJ/Q;Lcom/sugarcube/decorate/v2/internal/ui/surface/ArgumentParser;Lcom/sugarcube/decorate/v2/internal/ui/catalog/ui/catalog/browse/BrowseViewModel;Lcom/sugarcube/decorate/v2/internal/ui/toolbars/variants/VariantsViewModel;LNG/b;)V", "Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;", "g1", "()Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;", "W0", "()Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;", "LXH/N;", "onCleared", "()V", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "event", "i1", "(Lcom/sugarcube/decorate/v2/internal/ui/surface/a;)V", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "loadMore", "(Lcom/sugarcube/core/network/models/RoomType;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/QuickFilter;", "filter", "applyFilter", "(Lcom/sugarcube/core/network/models/QuickFilter;)V", "fetchItems", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "cachedCatalogItem", "fetchVariants", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LdI/e;)Ljava/lang/Object;", "", "price", "LlF/a;", "getFormattedPrice", "(F)LlF/a;", "n1", "LmG/b;", "instance", "j1", "(LmG/b;)V", "LkG/c;", "metadata", "item", "a2", "(LkG/c;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$d0;", "Q1", "(Lcom/sugarcube/decorate/v2/internal/ui/surface/a$d0;)V", "catalogItem", "M1", "p1", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "r1", "N1", "U1", "s1", "(LdI/e;)Ljava/lang/Object;", "t1", "A1", "I1", "J1", "G1", "y1", "v1", "P1", "R1", "T1", "LRF/k;", "E1", "(LRF/k;LdI/e;)Ljava/lang/Object;", "D1", "o1", "Y1", "q1", "L1", "X1", "", "isIncompatible", "V1", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;ZLdI/e;)Ljava/lang/Object;", "u1", "S1", "LSG/b;", "selectedWallColor", "Z1", "(LSG/b;)V", "B1", "C1", "F1", "z1", "O1", "", "rating", "x1", "(ILdI/e;)Ljava/lang/Object;", "w1", "m2", "p2", "Lcom/sugarcube/decorate_engine/SceneLayout;", "sceneLayout", "Lcom/sugarcube/core/network/models/SmartaPlacementResult;", "d1", "(LkG/c;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate_engine/SceneLayout;LdI/e;)Ljava/lang/Object;", "smartaPlacementResult", "l2", "(Lcom/sugarcube/core/network/models/SmartaPlacementResult;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/common/UiText;", "errorMessage", "fatal", "n2", "(Lcom/sugarcube/common/UiText;Z)V", "S0", "T0", "d2", "showOverflowSheet", "q2", "(Z)V", "LQG/E$e;", "id", "cancelSilently", "Lkotlin/Function1;", "LdI/e;", "", "block", "b2", "(LQG/E$e;ZLnI/l;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function2;", "k1", "(ZLnI/p;)V", "m1", "(LnI/p;)V", "m", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl;", "n", "Lcom/sugarcube/decorate/v2/internal/manager/scene/SceneLoadingManager;", "o", "Lcom/sugarcube/app/base/data/source/CatalogRepository;", "p", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "q", "Lcom/sugarcube/app/base/data/user/UserRepo;", "r", "Lcom/sugarcube/decorate/v2/internal/manager/CompositionUpdater;", "s", "LhG/v;", "t", "Lcom/sugarcube/decorate/v2/internal/usecase/ShareDesignUseCase;", "u", "Lcom/sugarcube/app/base/external/shoppinglist/FetchShoppingListItemsUseCase;", "v", "LRF/r;", "w", "LLG/b;", "x", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase;", "y", "LRF/p;", "z", "Lcom/sugarcube/decorate/v2/internal/usecase/SaveDesignUseCase;", "A", "Landroidx/lifecycle/U;", "B", "LQJ/Q;", "C", "D", "Lcom/sugarcube/decorate/v2/internal/ui/surface/ArgumentParser;", "E", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/ui/catalog/browse/BrowseViewModel;", "F", "Lcom/sugarcube/decorate/v2/internal/ui/toolbars/variants/VariantsViewModel;", "G", "LNG/b;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineToolbarInteractions;", "H", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineToolbarInteractions;", "toolbarInteractions", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineViewportInteractions;", "I", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineViewportInteractions;", "viewportInteractions", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineMagicEraserInteractions;", "J", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineMagicEraserInteractions;", "magicEraserInteractions", "Landroidx/lifecycle/K;", "Landroid/content/Intent;", "K", "Landroidx/lifecycle/K;", "_shareIntent", "Landroidx/lifecycle/F;", "L", "Landroidx/lifecycle/F;", "c1", "()Landroidx/lifecycle/F;", "shareIntent", "", "M", "_exit", "N", "X0", "exit", "Lcom/sugarcube/decorate/internal/navigation/V2;", "O", "LXH/o;", "U0", "()Lcom/sugarcube/decorate/internal/navigation/V2;", "args", "LQJ/x;", "P", "LQJ/x;", "loginCompletable", "Q", "saveOrDiscardCompletable", "R", "saveAndExitConfirmationCompletable", "S", "errorAcknowledgedCompletable", "T", "saveNewCompletable", "com/sugarcube/decorate/v2/internal/ui/surface/h$c", "U", "Lcom/sugarcube/decorate/v2/internal/ui/surface/h$c;", "engineListener", "LQJ/F0;", "X", "LQJ/F0;", "selectionJob", "Y", "zoomIndicatorJob", "LTJ/P;", "LOG/l0;", "f1", "()LTJ/P;", "surfaceState", "LsG/r;", "value", "V0", "()LsG/r;", "f2", "(LsG/r;)V", "cartState", "LuG/l;", "getBrowseState", "()LuG/l;", "e2", "(LuG/l;)V", "browseState", "LOG/v0;", "b1", "()LOG/v0;", "j2", "(LOG/v0;)V", "selection", "a1", "()LmG/b;", "i2", "selectedInstance", "LnG/a;", "e1", "()LnG/a;", "k2", "(LnG/a;)V", "stripeMode", "LOG/u0;", "Y0", "()LOG/u0;", "g2", "(LOG/u0;)V", "rightToolbarUIState", "LTJ/B;", "h1", "()LTJ/B;", "set_surfaceState", "(LTJ/B;)V", "_surfaceState", "Z0", "()LkG/c;", "h2", "(LkG/c;)V", "sceneLoadingMetadata", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends f0 implements BrowseViewModel, VariantsViewModel {

    /* renamed from: A  reason: collision with root package name */
    private final U f142649A;

    /* renamed from: B  reason: collision with root package name */
    private final Q f142650B;

    /* renamed from: C  reason: collision with root package name */
    private final Q f142651C;

    /* renamed from: D  reason: collision with root package name */
    private final ArgumentParser f142652D;

    /* renamed from: E  reason: collision with root package name */
    private final BrowseViewModel f142653E;

    /* renamed from: F  reason: collision with root package name */
    private final VariantsViewModel f142654F;

    /* renamed from: G  reason: collision with root package name */
    private final C16093b f142655G;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public final EngineToolbarInteractions f142656H;

    /* renamed from: I  reason: collision with root package name */
    private final EngineViewportInteractions f142657I;
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public final EngineMagicEraserInteractions f142658J;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public final K<Intent> f142659K;

    /* renamed from: L  reason: collision with root package name */
    private final androidx.lifecycle.F<Intent> f142660L;

    /* renamed from: M  reason: collision with root package name */
    private final K<String> f142661M;

    /* renamed from: N  reason: collision with root package name */
    private final androidx.lifecycle.F<String> f142662N;

    /* renamed from: O  reason: collision with root package name */
    private final C16824o f142663O = C16825p.b(new NG.h(this));
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public C16339x<Boolean> f142664P = C16343z.b((F0) null, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public C16339x<Boolean> f142665Q = C16343z.b((F0) null, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public C16339x<Boolean> f142666R = C16343z.b((F0) null, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public C16339x<Boolean> f142667S = C16343z.b((F0) null, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public C16339x<C17497c> f142668T = C16343z.b((F0) null, 1, (Object) null);

    /* renamed from: U  reason: collision with root package name */
    private final C17149c f142669U;

    /* renamed from: X  reason: collision with root package name */
    private F0 f142670X;

    /* renamed from: Y  reason: collision with root package name */
    private F0 f142671Y;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final EngineManagerImpl f142672m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final SceneLoadingManager f142673n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final CatalogRepository f142674o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final ConfigRepository f142675p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final UserRepo f142676q;

    /* renamed from: r  reason: collision with root package name */
    private final CompositionUpdater f142677r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C17318v f142678s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final ShareDesignUseCase f142679t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final FetchShoppingListItemsUseCase f142680u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final RF.r f142681v;

    /* renamed from: w  reason: collision with root package name */
    private final C16005b f142682w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final CartUseCase f142683x;

    /* renamed from: y  reason: collision with root package name */
    private final RF.p f142684y;

    /* renamed from: z  reason: collision with root package name */
    private final SaveDesignUseCase f142685z;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {914}, m = "onViews")
    static final class A extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142686c;

        /* renamed from: d  reason: collision with root package name */
        Object f142687d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f142688e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h f142689f;

        /* renamed from: g  reason: collision with root package name */
        int f142690g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        A(h hVar, C17164e<? super A> eVar) {
            super(eVar);
            this.f142689f = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142688e = obj;
            this.f142690g |= Integer.MIN_VALUE;
            return this.f142689f.Y1(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {766, 767, 772, 769, 776, 777}, m = "placeItemInDesign")
    static final class B extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142691c;

        /* renamed from: d  reason: collision with root package name */
        Object f142692d;

        /* renamed from: e  reason: collision with root package name */
        Object f142693e;

        /* renamed from: f  reason: collision with root package name */
        Object f142694f;

        /* renamed from: g  reason: collision with root package name */
        Object f142695g;

        /* renamed from: h  reason: collision with root package name */
        Object f142696h;

        /* renamed from: i  reason: collision with root package name */
        Object f142697i;

        /* renamed from: j  reason: collision with root package name */
        Object f142698j;

        /* renamed from: k  reason: collision with root package name */
        Object f142699k;

        /* renamed from: l  reason: collision with root package name */
        Object f142700l;

        /* renamed from: m  reason: collision with root package name */
        Object f142701m;

        /* renamed from: n  reason: collision with root package name */
        Object f142702n;

        /* renamed from: o  reason: collision with root package name */
        Object f142703o;

        /* renamed from: p  reason: collision with root package name */
        int f142704p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f142705q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ h f142706r;

        /* renamed from: s  reason: collision with root package name */
        int f142707s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        B(h hVar, C17164e<? super B> eVar) {
            super(eVar);
            this.f142706r = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142705q = obj;
            this.f142707s |= Integer.MIN_VALUE;
            return this.f142706r.a2((C17497c) null, (CachedCatalogItem) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {1273}, m = "runWithLoading")
    static final class C extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142708c;

        /* renamed from: d  reason: collision with root package name */
        Object f142709d;

        /* renamed from: e  reason: collision with root package name */
        Object f142710e;

        /* renamed from: f  reason: collision with root package name */
        Object f142711f;

        /* renamed from: g  reason: collision with root package name */
        boolean f142712g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f142713h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h f142714i;

        /* renamed from: j  reason: collision with root package name */
        int f142715j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C(h hVar, C17164e<? super C> eVar) {
            super(eVar);
            this.f142714i = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142713h = obj;
            this.f142715j |= Integer.MIN_VALUE;
            return this.f142714i.b2((C16219E.e) null, false, (C17642l<? super C17164e<? super C16807N>, ? extends Object>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {1228, 1234, 1240}, m = "save")
    static final class D extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142716c;

        /* renamed from: d  reason: collision with root package name */
        Object f142717d;

        /* renamed from: e  reason: collision with root package name */
        Object f142718e;

        /* renamed from: f  reason: collision with root package name */
        Object f142719f;

        /* renamed from: g  reason: collision with root package name */
        Object f142720g;

        /* renamed from: h  reason: collision with root package name */
        Object f142721h;

        /* renamed from: i  reason: collision with root package name */
        Object f142722i;

        /* renamed from: j  reason: collision with root package name */
        Object f142723j;

        /* renamed from: k  reason: collision with root package name */
        Object f142724k;

        /* renamed from: l  reason: collision with root package name */
        boolean f142725l;

        /* renamed from: m  reason: collision with root package name */
        int f142726m;

        /* renamed from: n  reason: collision with root package name */
        int f142727n;

        /* renamed from: o  reason: collision with root package name */
        int f142728o;

        /* renamed from: p  reason: collision with root package name */
        int f142729p;

        /* renamed from: q  reason: collision with root package name */
        int f142730q;

        /* renamed from: r  reason: collision with root package name */
        int f142731r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f142732s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ h f142733t;

        /* renamed from: u  reason: collision with root package name */
        int f142734u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        D(h hVar, C17164e<? super D> eVar) {
            super(eVar);
            this.f142733t = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142732s = obj;
            this.f142734u |= Integer.MIN_VALUE;
            return this.f142733t.d2(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {1126}, m = "showDebugSmartaResult")
    static final class E extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142735c;

        /* renamed from: d  reason: collision with root package name */
        Object f142736d;

        /* renamed from: e  reason: collision with root package name */
        Object f142737e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f142738f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f142739g;

        /* renamed from: h  reason: collision with root package name */
        int f142740h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        E(h hVar, C17164e<? super E> eVar) {
            super(eVar);
            this.f142739g = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142738f = obj;
            this.f142740h |= Integer.MIN_VALUE;
            return this.f142739g.l2((SmartaPlacementResult) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {1054, 1056}, m = "showDesignFeedback")
    static final class F extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142741c;

        /* renamed from: d  reason: collision with root package name */
        Object f142742d;

        /* renamed from: e  reason: collision with root package name */
        Object f142743e;

        /* renamed from: f  reason: collision with root package name */
        boolean f142744f;

        /* renamed from: g  reason: collision with root package name */
        int f142745g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f142746h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h f142747i;

        /* renamed from: j  reason: collision with root package name */
        int f142748j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        F(h hVar, C17164e<? super F> eVar) {
            super(eVar);
            this.f142747i = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142746h = obj;
            this.f142748j |= Integer.MIN_VALUE;
            return this.f142747i.m2(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$showErrorDialog$1", f = "DecorateSurfaceFragmentViewModel.kt", l = {1149, 1150}, m = "invokeSuspend")
    static final class G extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142749c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f142750d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UiText f142751e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f142752f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        G(h hVar, UiText uiText, boolean z10, C17164e<? super G> eVar) {
            super(2, eVar);
            this.f142750d = hVar;
            this.f142751e = uiText;
            this.f142752f = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new G(this.f142750d, this.f142751e, this.f142752f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((G) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142749c;
            if (i10 == 0) {
                XH.y.b(obj);
                this.f142750d.f142667S = C16343z.b((F0) null, 1, (Object) null);
                n0.g(this.f142750d.h1(), new C15930a.b(this.f142751e, this.f142752f));
                this.f142750d.f142678s.K(this.f142751e);
                if (this.f142752f) {
                    C16339x I10 = this.f142750d.f142667S;
                    this.f142749c = 1;
                    if (I10.f(this) == f10) {
                        return f10;
                    }
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else if (i10 == 2) {
                XH.y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h hVar = this.f142750d;
            this.f142749c = 2;
            if (hVar.S0(this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$showZoomIndicator$1", f = "DecorateSurfaceFragmentViewModel.kt", l = {1088}, m = "invokeSuspend")
    static final class H extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142753c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f142754d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        H(h hVar, C17164e<? super H> eVar) {
            super(2, eVar);
            this.f142754d = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new H(this.f142754d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((H) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142753c;
            if (i10 == 0) {
                XH.y.b(obj);
                n0.f(this.f142754d.h1(), true);
                this.f142753c = 1;
                if (C16297b0.b(3000, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0.f(this.f142754d.h1(), false);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$1", f = "DecorateSurfaceFragmentViewModel.kt", l = {333, 338, 340}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.h$a  reason: case insensitive filesystem */
    static final class C17147a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f142755c;

        /* renamed from: d  reason: collision with root package name */
        Object f142756d;

        /* renamed from: e  reason: collision with root package name */
        Object f142757e;

        /* renamed from: f  reason: collision with root package name */
        Object f142758f;

        /* renamed from: g  reason: collision with root package name */
        Object f142759g;

        /* renamed from: h  reason: collision with root package name */
        Object f142760h;

        /* renamed from: i  reason: collision with root package name */
        Object f142761i;

        /* renamed from: j  reason: collision with root package name */
        int f142762j;

        /* renamed from: k  reason: collision with root package name */
        int f142763k;

        /* renamed from: l  reason: collision with root package name */
        int f142764l;

        /* renamed from: m  reason: collision with root package name */
        int f142765m;

        /* renamed from: n  reason: collision with root package name */
        int f142766n;

        /* renamed from: o  reason: collision with root package name */
        int f142767o;

        /* renamed from: p  reason: collision with root package name */
        int f142768p;

        /* renamed from: q  reason: collision with root package name */
        int f142769q;

        /* renamed from: r  reason: collision with root package name */
        int f142770r;

        /* renamed from: s  reason: collision with root package name */
        private /* synthetic */ Object f142771s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ h f142772t;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$1$1$2$1", f = "DecorateSurfaceFragmentViewModel.kt", l = {344, 348}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.h$a$a  reason: collision with other inner class name */
        static final class C3480a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f142773c;

            /* renamed from: d  reason: collision with root package name */
            Object f142774d;

            /* renamed from: e  reason: collision with root package name */
            Object f142775e;

            /* renamed from: f  reason: collision with root package name */
            Object f142776f;

            /* renamed from: g  reason: collision with root package name */
            Object f142777g;

            /* renamed from: h  reason: collision with root package name */
            Object f142778h;

            /* renamed from: i  reason: collision with root package name */
            int f142779i;

            /* renamed from: j  reason: collision with root package name */
            int f142780j;

            /* renamed from: k  reason: collision with root package name */
            int f142781k;

            /* renamed from: l  reason: collision with root package name */
            private /* synthetic */ Object f142782l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ h f142783m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ List<String> f142784n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3480a(h hVar, List<String> list, C17164e<? super C3480a> eVar) {
                super(2, eVar);
                this.f142783m = hVar;
                this.f142784n = list;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C3480a aVar = new C3480a(this.f142783m, this.f142784n, eVar);
                aVar.f142782l = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3480a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: com.sugarcube.app.base.data.database.CachedCatalogItem} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.util.Iterator} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: com.sugarcube.decorate.v2.internal.ui.surface.h} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    r17 = this;
                    r1 = r17
                    java.lang.Object r2 = eI.C17187b.f()
                    int r0 = r1.f142781k
                    r3 = 0
                    r4 = 1
                    r5 = 2
                    if (r0 == 0) goto L_0x004b
                    if (r0 == r4) goto L_0x0041
                    if (r0 != r5) goto L_0x0039
                    int r6 = r1.f142779i
                    java.lang.Object r0 = r1.f142778h
                    r7 = r0
                    com.sugarcube.app.base.data.database.CachedCatalogItem r7 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r7
                    java.lang.Object r0 = r1.f142776f
                    r8 = r0
                    java.util.Iterator r8 = (java.util.Iterator) r8
                    java.lang.Object r0 = r1.f142775e
                    r9 = r0
                    com.sugarcube.decorate.v2.internal.ui.surface.h r9 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r9
                    java.lang.Object r0 = r1.f142774d
                    r10 = r0
                    java.lang.Iterable r10 = (java.lang.Iterable) r10
                    java.lang.Object r0 = r1.f142773c
                    r11 = r0
                    java.util.List r11 = (java.util.List) r11
                    java.lang.Object r0 = r1.f142782l
                    r12 = r0
                    QJ.Q r12 = (QJ.Q) r12
                    XH.y.b(r18)     // Catch:{ Exception -> 0x0036 }
                    goto L_0x00a3
                L_0x0036:
                    r0 = move-exception
                    goto L_0x00a8
                L_0x0039:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r2)
                    throw r0
                L_0x0041:
                    java.lang.Object r0 = r1.f142782l
                    QJ.Q r0 = (QJ.Q) r0
                    XH.y.b(r18)
                    r6 = r18
                    goto L_0x0065
                L_0x004b:
                    XH.y.b(r18)
                    java.lang.Object r0 = r1.f142782l
                    QJ.Q r0 = (QJ.Q) r0
                    com.sugarcube.decorate.v2.internal.ui.surface.h r6 = r1.f142783m
                    com.sugarcube.app.base.data.source.CatalogRepository r6 = r6.f142674o
                    java.util.List<java.lang.String> r7 = r1.f142784n
                    r1.f142782l = r0
                    r1.f142781k = r4
                    java.lang.Object r6 = r6.fetchProductInformationLocalIds(r7, r1)
                    if (r6 != r2) goto L_0x0065
                    return r2
                L_0x0065:
                    java.util.List r6 = (java.util.List) r6
                    if (r6 == 0) goto L_0x0234
                    r7 = r6
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    com.sugarcube.decorate.v2.internal.ui.surface.h r8 = r1.f142783m
                    java.util.Iterator r9 = r7.iterator()
                    r12 = r0
                    r11 = r6
                    r10 = r7
                    r6 = r3
                    r16 = r9
                    r9 = r8
                    r8 = r16
                L_0x007b:
                    boolean r0 = r8.hasNext()
                    if (r0 == 0) goto L_0x0234
                    java.lang.Object r0 = r8.next()
                    r7 = r0
                    com.sugarcube.app.base.data.database.CachedCatalogItem r7 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r7
                    r1.f142782l = r12     // Catch:{ Exception -> 0x0036 }
                    r1.f142773c = r11     // Catch:{ Exception -> 0x0036 }
                    r1.f142774d = r10     // Catch:{ Exception -> 0x0036 }
                    r1.f142775e = r9     // Catch:{ Exception -> 0x0036 }
                    r1.f142776f = r8     // Catch:{ Exception -> 0x0036 }
                    r1.f142777g = r0     // Catch:{ Exception -> 0x0036 }
                    r1.f142778h = r7     // Catch:{ Exception -> 0x0036 }
                    r1.f142779i = r6     // Catch:{ Exception -> 0x0036 }
                    r1.f142780j = r3     // Catch:{ Exception -> 0x0036 }
                    r1.f142781k = r5     // Catch:{ Exception -> 0x0036 }
                    java.lang.Object r0 = r9.M1(r7, r1)     // Catch:{ Exception -> 0x0036 }
                    if (r0 != r2) goto L_0x00a3
                    return r2
                L_0x00a3:
                    r9.r1()     // Catch:{ Exception -> 0x0036 }
                    goto L_0x0230
                L_0x00a8:
                    com.sugarcube.common.UiText$CompositeResource r13 = new com.sugarcube.common.UiText$CompositeResource
                    int r14 = OE.n.f113336b5
                    r15 = 0
                    r13.<init>(r14, r15, r5, r15)
                    com.sugarcube.decorate.v2.internal.ui.surface.h.o2(r9, r13, r3, r5, r15)
                    com.sugarcube.core.logger.Priority r13 = com.sugarcube.core.logger.Priority.ERROR
                    com.sugarcube.core.network.models.CatalogItem r7 = r7.getCatalogItem()
                    java.lang.Integer r7 = r7.getId()
                    java.lang.StringBuilder r14 = new java.lang.StringBuilder
                    r14.<init>()
                    java.lang.String r3 = "Couldn't load product passed in as parameter: "
                    r14.append(r3)
                    r14.append(r7)
                    java.lang.String r3 = "."
                    r14.append(r3)
                    java.lang.String r3 = r14.toString()
                    java.lang.String r7 = ""
                    if (r3 != 0) goto L_0x00de
                    java.lang.String r3 = r0.getMessage()
                    if (r3 != 0) goto L_0x00de
                    r3 = r7
                L_0x00de:
                    java.lang.String r0 = XH.C16816g.b(r0)
                    if (r0 != 0) goto L_0x00e5
                    goto L_0x00e6
                L_0x00e5:
                    r7 = r0
                L_0x00e6:
                    int[] r0 = NG.j.f136488a
                    int r13 = r13.ordinal()
                    r0 = r0[r13]
                    java.lang.String r13 = " "
                    java.lang.String r14 = "Kt"
                    r15 = 36
                    if (r0 == r4) goto L_0x01f6
                    if (r0 == r5) goto L_0x01bb
                    r4 = 3
                    if (r0 == r4) goto L_0x017f
                    r4 = 4
                    if (r0 == r4) goto L_0x0143
                    r4 = 5
                    if (r0 != r4) goto L_0x013d
                    java.lang.Class r0 = r12.getClass()
                    java.lang.String r0 = r0.getName()
                    kotlin.jvm.internal.C17542s.g(r0)
                    r4 = 0
                    java.lang.String r15 = HJ.C15854t.s1(r0, r15, r4, r5, r4)
                    r18 = r0
                    r0 = 46
                    java.lang.String r0 = HJ.C15854t.o1(r15, r0, r4, r5, r4)
                    int r4 = r0.length()
                    if (r4 != 0) goto L_0x0122
                    r0 = r18
                    goto L_0x0126
                L_0x0122:
                    java.lang.String r0 = HJ.C15854t.P0(r0, r14)
                L_0x0126:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r3)
                    r4.append(r13)
                    r4.append(r7)
                    java.lang.String r3 = r4.toString()
                    android.util.Log.e(r0, r3)
                    goto L_0x0230
                L_0x013d:
                    XH.t r0 = new XH.t
                    r0.<init>()
                    throw r0
                L_0x0143:
                    java.lang.Class r0 = r12.getClass()
                    java.lang.String r0 = r0.getName()
                    kotlin.jvm.internal.C17542s.g(r0)
                    r4 = 0
                    java.lang.String r15 = HJ.C15854t.s1(r0, r15, r4, r5, r4)
                    r18 = r0
                    r0 = 46
                    java.lang.String r0 = HJ.C15854t.o1(r15, r0, r4, r5, r4)
                    int r4 = r0.length()
                    if (r4 != 0) goto L_0x0164
                    r0 = r18
                    goto L_0x0168
                L_0x0164:
                    java.lang.String r0 = HJ.C15854t.P0(r0, r14)
                L_0x0168:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r3)
                    r4.append(r13)
                    r4.append(r7)
                    java.lang.String r3 = r4.toString()
                    android.util.Log.w(r0, r3)
                    goto L_0x0230
                L_0x017f:
                    java.lang.Class r0 = r12.getClass()
                    java.lang.String r0 = r0.getName()
                    kotlin.jvm.internal.C17542s.g(r0)
                    r4 = 0
                    java.lang.String r15 = HJ.C15854t.s1(r0, r15, r4, r5, r4)
                    r18 = r0
                    r0 = 46
                    java.lang.String r0 = HJ.C15854t.o1(r15, r0, r4, r5, r4)
                    int r4 = r0.length()
                    if (r4 != 0) goto L_0x01a0
                    r0 = r18
                    goto L_0x01a4
                L_0x01a0:
                    java.lang.String r0 = HJ.C15854t.P0(r0, r14)
                L_0x01a4:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r3)
                    r4.append(r13)
                    r4.append(r7)
                    java.lang.String r3 = r4.toString()
                    android.util.Log.i(r0, r3)
                    goto L_0x0230
                L_0x01bb:
                    java.lang.Class r0 = r12.getClass()
                    java.lang.String r0 = r0.getName()
                    kotlin.jvm.internal.C17542s.g(r0)
                    r4 = 0
                    java.lang.String r15 = HJ.C15854t.s1(r0, r15, r4, r5, r4)
                    r18 = r0
                    r0 = 46
                    java.lang.String r0 = HJ.C15854t.o1(r15, r0, r4, r5, r4)
                    int r4 = r0.length()
                    if (r4 != 0) goto L_0x01dc
                    r0 = r18
                    goto L_0x01e0
                L_0x01dc:
                    java.lang.String r0 = HJ.C15854t.P0(r0, r14)
                L_0x01e0:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r3)
                    r4.append(r13)
                    r4.append(r7)
                    java.lang.String r3 = r4.toString()
                    android.util.Log.d(r0, r3)
                    goto L_0x0230
                L_0x01f6:
                    java.lang.Class r0 = r12.getClass()
                    java.lang.String r0 = r0.getName()
                    kotlin.jvm.internal.C17542s.g(r0)
                    r4 = 0
                    java.lang.String r15 = HJ.C15854t.s1(r0, r15, r4, r5, r4)
                    r18 = r0
                    r0 = 46
                    java.lang.String r0 = HJ.C15854t.o1(r15, r0, r4, r5, r4)
                    int r4 = r0.length()
                    if (r4 != 0) goto L_0x0217
                    r0 = r18
                    goto L_0x021b
                L_0x0217:
                    java.lang.String r0 = HJ.C15854t.P0(r0, r14)
                L_0x021b:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r3)
                    r4.append(r13)
                    r4.append(r7)
                    java.lang.String r3 = r4.toString()
                    android.util.Log.v(r0, r3)
                L_0x0230:
                    r3 = 0
                    r4 = 1
                    goto L_0x007b
                L_0x0234:
                    XH.N r0 = XH.C16807N.f139792a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.C17147a.C3480a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17147a(h hVar, C17164e<? super C17147a> eVar) {
            super(2, eVar);
            this.f142772t = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C17147a aVar = new C17147a(this.f142772t, eVar);
            aVar.f142771s = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17147a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: QJ.Q} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0148 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0149  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0157  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0159  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x015e  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0161  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0164  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0168  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x016b  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x016f  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0172  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x017d  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0180  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0194  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0197  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x01d8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r43) {
            /*
                r42 = this;
                r0 = r42
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f142770r
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x009f
                if (r2 == r5) goto L_0x007e
                if (r2 == r4) goto L_0x005c
                if (r2 != r3) goto L_0x0054
                int r1 = r0.f142769q
                int r2 = r0.f142768p
                int r3 = r0.f142767o
                int r4 = r0.f142766n
                int r7 = r0.f142765m
                int r8 = r0.f142764l
                int r9 = r0.f142763k
                java.lang.Object r10 = r0.f142761i
                OG.l0 r10 = (OG.l0) r10
                java.lang.Object r11 = r0.f142760h
                TJ.B r11 = (TJ.C16505B) r11
                java.lang.Object r12 = r0.f142759g
                kG.c r12 = (kG.C17497c) r12
                java.lang.Object r13 = r0.f142758f
                java.util.UUID r13 = (java.util.UUID) r13
                java.lang.Object r13 = r0.f142757e
                com.sugarcube.decorate.v2.internal.ui.surface.h r13 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r13
                java.lang.Object r14 = r0.f142756d
                java.util.UUID r14 = (java.util.UUID) r14
                java.lang.Object r14 = r0.f142755c
                java.util.UUID r14 = (java.util.UUID) r14
                java.lang.Object r14 = r0.f142771s
                QJ.Q r14 = (QJ.Q) r14
                XH.y.b(r43)
                r15 = r13
                r41 = r14
                r13 = r11
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r2
                r2 = r43
                goto L_0x0155
            L_0x0054:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x005c:
                int r2 = r0.f142762j
                java.lang.Object r4 = r0.f142759g
                kG.c r4 = (kG.C17497c) r4
                java.lang.Object r7 = r0.f142758f
                java.util.UUID r7 = (java.util.UUID) r7
                java.lang.Object r8 = r0.f142757e
                com.sugarcube.decorate.v2.internal.ui.surface.h r8 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r8
                java.lang.Object r9 = r0.f142756d
                java.util.UUID r9 = (java.util.UUID) r9
                java.lang.Object r10 = r0.f142755c
                java.util.UUID r10 = (java.util.UUID) r10
                java.lang.Object r11 = r0.f142771s
                QJ.Q r11 = (QJ.Q) r11
                XH.y.b(r43)
                r12 = r4
                r13 = r8
                r14 = r11
                goto L_0x010c
            L_0x007e:
                int r2 = r0.f142762j
                java.lang.Object r7 = r0.f142758f
                java.util.UUID r7 = (java.util.UUID) r7
                java.lang.Object r8 = r0.f142757e
                com.sugarcube.decorate.v2.internal.ui.surface.h r8 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r8
                java.lang.Object r9 = r0.f142756d
                java.util.UUID r9 = (java.util.UUID) r9
                java.lang.Object r10 = r0.f142755c
                java.util.UUID r10 = (java.util.UUID) r10
                java.lang.Object r11 = r0.f142771s
                QJ.Q r11 = (QJ.Q) r11
                XH.y.b(r43)
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r43
                goto L_0x00e4
            L_0x009f:
                XH.y.b(r43)
                java.lang.Object r2 = r0.f142771s
                r11 = r2
                QJ.Q r11 = (QJ.Q) r11
                com.sugarcube.decorate.v2.internal.ui.surface.h r2 = r0.f142772t
                com.sugarcube.decorate.internal.navigation.V2 r2 = r2.U0()
                java.lang.String r2 = r2.d()
                java.util.UUID r2 = cF.C14046h.e(r2)
                if (r2 == 0) goto L_0x01fd
                com.sugarcube.decorate.v2.internal.ui.surface.h r8 = r0.f142772t
                com.sugarcube.decorate.v2.internal.manager.scene.SceneLoadingManager r7 = r8.f142673n
                com.sugarcube.decorate.internal.navigation.V2 r9 = r8.U0()
                java.lang.String r9 = r9.b()
                java.util.UUID r9 = cF.C14046h.e(r9)
                r0.f142771s = r11
                r0.f142755c = r2
                r0.f142756d = r2
                r0.f142757e = r8
                r0.f142758f = r2
                r0.f142762j = r6
                r0.f142770r = r5
                java.lang.Object r7 = r7.loadDesign(r2, r9, r0)
                if (r7 != r1) goto L_0x00de
                return r1
            L_0x00de:
                r10 = r2
                r9 = r8
                r12 = r11
                r8 = r10
                r11 = r8
                r2 = r6
            L_0x00e4:
                kG.c r7 = (kG.C17497c) r7
                if (r7 == 0) goto L_0x01f5
                r9.h2(r7)
                com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r13 = r9.f142672m
                r0.f142771s = r12
                r0.f142755c = r11
                r0.f142756d = r10
                r0.f142757e = r9
                r0.f142758f = r8
                r0.f142759g = r7
                r0.f142762j = r2
                r0.f142770r = r4
                java.lang.Object r4 = r13.f0(r7, r0)
                if (r4 != r1) goto L_0x0106
                return r1
            L_0x0106:
                r13 = r9
                r9 = r10
                r10 = r11
                r14 = r12
                r12 = r7
                r7 = r8
            L_0x010c:
                TJ.B r11 = r13.h1()
                TJ.B r4 = r13.h1()
                java.lang.Object r4 = r4.getValue()
                OG.l0 r4 = (OG.l0) r4
                com.sugarcube.app.base.data.feature.ConfigRepository r8 = r13.f142675p
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableHelaWallColorPicker r15 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableHelaWallColorPicker.INSTANCE
                r0.f142771s = r14
                r0.f142755c = r10
                r0.f142756d = r9
                r0.f142757e = r13
                r0.f142758f = r7
                r0.f142759g = r12
                r0.f142760h = r11
                r0.f142761i = r4
                r0.f142762j = r2
                r0.f142763k = r6
                r0.f142764l = r6
                r0.f142765m = r6
                r0.f142766n = r6
                r0.f142767o = r6
                r0.f142768p = r6
                r0.f142769q = r6
                r0.f142770r = r3
                java.lang.Object r2 = r8.get(r15, r0)
                if (r2 != r1) goto L_0x0149
                return r1
            L_0x0149:
                r1 = r6
                r3 = r1
                r7 = r3
                r8 = r7
                r9 = r8
                r10 = r9
                r15 = r13
                r41 = r14
                r13 = r11
                r11 = r4
                r4 = r10
            L_0x0155:
                if (r1 == 0) goto L_0x0159
                r1 = r5
                goto L_0x015a
            L_0x0159:
                r1 = r6
            L_0x015a:
                if (r3 == 0) goto L_0x015e
                r3 = r5
                goto L_0x015f
            L_0x015e:
                r3 = r6
            L_0x015f:
                if (r4 == 0) goto L_0x0164
                r18 = r5
                goto L_0x0166
            L_0x0164:
                r18 = r6
            L_0x0166:
                if (r7 == 0) goto L_0x016b
                r30 = r5
                goto L_0x016d
            L_0x016b:
                r30 = r6
            L_0x016d:
                if (r8 == 0) goto L_0x0172
                r31 = r5
                goto L_0x0174
            L_0x0172:
                r31 = r6
            L_0x0174:
                if (r9 == 0) goto L_0x0179
                r32 = r5
                goto L_0x017b
            L_0x0179:
                r32 = r6
            L_0x017b:
                if (r10 == 0) goto L_0x0180
                r33 = r5
                goto L_0x0182
            L_0x0180:
                r33 = r6
            L_0x0182:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x0197
                com.sugarcube.app.base.data.database.Scene r2 = r12.g()
                boolean r2 = r2.isHela()
                if (r2 == 0) goto L_0x0197
                r34 = r5
                goto L_0x0199
            L_0x0197:
                r34 = r6
            L_0x0199:
                r39 = 130023423(0x7bfffff, float:2.8888947E-34)
                r40 = 0
                r14 = 0
                r2 = 0
                r4 = r15
                r15 = r2
                r16 = 0
                r17 = 0
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
                r35 = 0
                r36 = 0
                r37 = 0
                r38 = 0
                r12 = r1
                r1 = r13
                r13 = r3
                OG.l0 r2 = OG.l0.b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
                r1.setValue(r2)
                com.sugarcube.decorate.internal.navigation.V2 r1 = r4.U0()
                java.util.List r1 = r1.c()
                if (r1 == 0) goto L_0x01ed
                com.sugarcube.decorate.v2.internal.ui.surface.h$a$a r2 = new com.sugarcube.decorate.v2.internal.ui.surface.h$a$a
                r3 = 0
                r2.<init>(r4, r1, r3)
                r20 = 3
                r21 = 0
                r17 = 0
                r18 = 0
                r16 = r41
                r19 = r2
                QJ.F0 unused = QJ.C16314k.d(r16, r17, r18, r19, r20, r21)
            L_0x01ed:
                hG.v r1 = r4.f142678s
                r1.D()
                goto L_0x01fd
            L_0x01f5:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Scene could not be loaded. Metadata null."
                r1.<init>(r2)
                throw r1
            L_0x01fd:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.C17147a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {1165, 1175}, m = "emergencySaveAndExit")
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.h$b  reason: case insensitive filesystem */
    static final class C17148b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142785c;

        /* renamed from: d  reason: collision with root package name */
        Object f142786d;

        /* renamed from: e  reason: collision with root package name */
        Object f142787e;

        /* renamed from: f  reason: collision with root package name */
        boolean f142788f;

        /* renamed from: g  reason: collision with root package name */
        boolean f142789g;

        /* renamed from: h  reason: collision with root package name */
        boolean f142790h;

        /* renamed from: i  reason: collision with root package name */
        int f142791i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f142792j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ h f142793k;

        /* renamed from: l  reason: collision with root package name */
        int f142794l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17148b(h hVar, C17164e<? super C17148b> eVar) {
            super(eVar);
            this.f142793k = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142792j = obj;
            this.f142794l |= Integer.MIN_VALUE;
            return this.f142793k.S0(this);
        }
    }

    @Metadata(d1 = {"\u0000[\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"com/sugarcube/decorate/v2/internal/ui/surface/h$c", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl$EventsListener;", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$a;", "error", "LXH/N;", "onEngineError", "(Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$a;)V", "", "isDirty", "onDesignDirtyChanged", "(Z)V", "LmG/b;", "instance", "onSelectedInstanceChanged", "(LmG/b;)V", "", "LRF/k;", "models", "onModelListUpdated", "(Ljava/util/List;)V", "isFocused", "onFocusedChanged", "Lcom/sugarcube/decorate_engine/PanZoomRegion;", "region", "onPanZoomRegionUpdated", "(Lcom/sugarcube/decorate_engine/PanZoomRegion;)V", "Lcom/sugarcube/decorate/v2/internal/manager/engine/a;", "metadata", "onProcessedGesture", "(Lcom/sugarcube/decorate/v2/internal/manager/engine/a;)V", "enabled", "Lcom/sugarcube/decorate_engine/EraserCounts;", "eraserCounts", "onMagicEraserChanged", "(ZLcom/sugarcube/decorate_engine/EraserCounts;)V", "", "viewCount", "onMultiviewInformationChanged", "(I)V", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "transform", "onTransformApplied", "(Lcom/sugarcube/decorate_engine/ModelScreenTransform;)V", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.h$c  reason: case insensitive filesystem */
    public static final class C17149c implements EngineManagerImpl.EventsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f142795a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$engineListener$1$onMultiviewInformationChanged$1", f = "DecorateSurfaceFragmentViewModel.kt", l = {316}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.h$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f142796c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h f142797d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f142798e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar, int i10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f142797d = hVar;
                this.f142798e = i10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f142797d, this.f142798e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object f10 = C17187b.f();
                int i10 = this.f142796c;
                boolean z10 = true;
                if (i10 == 0) {
                    XH.y.b(obj);
                    ConfigRepository F10 = this.f142797d.f142675p;
                    FeatureFlags.EnableGLTFScenes enableGLTFScenes = FeatureFlags.EnableGLTFScenes.INSTANCE;
                    this.f142796c = 1;
                    obj2 = F10.get(enableGLTFScenes, this);
                    if (obj2 == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    XH.y.b(obj);
                    obj2 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                C16505B X10 = this.f142797d.h1();
                l0 value = this.f142797d.f1().getValue();
                if (this.f142798e <= 1 || !booleanValue) {
                    z10 = false;
                }
                X10.setValue(l0.b(value, false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, z10, false, false, (C15987c) null, (C15987c) null, false, 132120575, (Object) null));
                return C16807N.f139792a;
            }
        }

        C17149c(h hVar) {
            this.f142795a = hVar;
        }

        public void onDesignDirtyChanged(boolean z10) {
            C16505B X10 = this.f142795a.h1();
            C16505B b10 = X10;
            b10.setValue(l0.b((l0) this.f142795a.h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, z10, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 133955583, (Object) null));
        }

        public void onEngineError(DecorateEngineController.a aVar) {
            String a10;
            C17542s.j(aVar, UiComponentContainer.RESULT_ERROR);
            if (aVar.b() && (a10 = aVar.a()) != null) {
                this.f142795a.n2(new UiText.DynamicString(a10), true);
            }
        }

        public void onFocusedChanged(boolean z10) {
            C16505B X10 = this.f142795a.h1();
            C16505B b10 = X10;
            b10.setValue(l0.b((l0) this.f142795a.h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, z10, (C15987c) null, (C15987c) null, false, 125829119, (Object) null));
            if (z10) {
                n0.a(this.f142795a.h1());
            }
        }

        public void onMagicEraserChanged(boolean z10, EraserCounts eraserCounts) {
            boolean z11 = eraserCounts != null && eraserCounts.getErasableCount() > 0;
            this.f142795a.h1().setValue(l0.b((l0) this.f142795a.h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, z11, false, false, false, (C15987c) null, (C15987c) null, false, 133169151, (Object) null));
            if (z10) {
                this.f142795a.h1().setValue(l0.b((l0) this.f142795a.h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, z11 ? eraserCounts != null ? new C16569f(eraserCounts.getErasableCount(), eraserCounts.getErasedCount()) : null : null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134209535, (Object) null));
            } else {
                this.f142795a.h1().setValue(l0.b((l0) this.f142795a.h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134209535, (Object) null));
            }
        }

        public void onModelListUpdated(List<RF.k> list) {
            List<RF.k> list2 = list;
            C17542s.j(list2, "models");
            this.f142795a.h1().setValue(l0.b((l0) this.f142795a.h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, C16793h.b(((l0) this.f142795a.h1().getValue()).t(), !list2.isEmpty(), (C15989e) null, 2, (Object) null), (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, list.isEmpty(), false, false, false, false, (C15987c) null, C15985a.h(list2), false, 100138495, (Object) null));
        }

        public void onMultiviewInformationChanged(int i10) {
            F0 unused = C16314k.d(g0.a(this.f142795a), (C17168i) null, (T) null, new a(this.f142795a, i10, (C17164e<? super a>) null), 3, (Object) null);
        }

        public void onPanZoomRegionUpdated(PanZoomRegion panZoomRegion) {
            C17542s.j(panZoomRegion, "region");
            n0.k(this.f142795a.h1(), panZoomRegion.zoom);
        }

        public void onProcessedGesture(com.sugarcube.decorate.v2.internal.manager.engine.a aVar) {
            C17542s.j(aVar, "metadata");
            if (aVar.c() == C17351h.LONG_PRESS) {
                n0.g(this.f142795a.h1(), new C15930a.C3338a(this.f142795a.f142672m.getEngineDebugInfo().toString()));
            }
            if (aVar.c() == C17351h.TAP) {
                n0.a(this.f142795a.h1());
            }
            if (aVar.c() == C17351h.ZOOM_REGION) {
                this.f142795a.p2();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
            r3 = r3.e();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSelectedInstanceChanged(mG.C17597b r3) {
            /*
                r2 = this;
                com.sugarcube.decorate.v2.internal.ui.surface.h r0 = r2.f142795a
                r0.j1(r3)
                com.sugarcube.decorate.v2.internal.ui.surface.h r0 = r2.f142795a
                hG.v r0 = r0.f142678s
                java.lang.Class<com.sugarcube.app.base.data.database.CachedCatalogItem> r1 = com.sugarcube.app.base.data.database.CachedCatalogItem.class
                uI.d r1 = kotlin.jvm.internal.P.b(r1)
                if (r3 == 0) goto L_0x001e
                RF.k r3 = r3.e()
                if (r3 == 0) goto L_0x001e
                com.sugarcube.app.base.data.database.CachedCatalogItem r3 = r3.d()
                goto L_0x001f
            L_0x001e:
                r3 = 0
            L_0x001f:
                r0.o0(r1, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.C17149c.onSelectedInstanceChanged(mG.b):void");
        }

        public void onTransformApplied(ModelScreenTransform modelScreenTransform) {
            C17542s.j(modelScreenTransform, "transform");
            h hVar = this.f142795a;
            C17597b a12 = hVar.a1();
            hVar.i2(a12 != null ? C17597b.b(a12, 0, (RF.k) null, false, modelScreenTransform.getYawDegrees(), 7, (Object) null) : null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {1195, 1197, 1204, 1205}, m = "exit")
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.h$d  reason: case insensitive filesystem */
    static final class C17150d extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142799c;

        /* renamed from: d  reason: collision with root package name */
        Object f142800d;

        /* renamed from: e  reason: collision with root package name */
        boolean f142801e;

        /* renamed from: f  reason: collision with root package name */
        boolean f142802f;

        /* renamed from: g  reason: collision with root package name */
        int f142803g;

        /* renamed from: h  reason: collision with root package name */
        int f142804h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f142805i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h f142806j;

        /* renamed from: k  reason: collision with root package name */
        int f142807k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17150d(h hVar, C17164e<? super C17150d> eVar) {
            super(eVar);
            this.f142806j = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142805i = obj;
            this.f142807k |= Integer.MIN_VALUE;
            return this.f142806j.T0(this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$exit$2", f = "DecorateSurfaceFragmentViewModel.kt", l = {1205}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.h$e  reason: case insensitive filesystem */
    static final class C17151e extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142808c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f142809d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17151e(h hVar, C17164e<? super C17151e> eVar) {
            super(1, eVar);
            this.f142809d = hVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new C17151e(this.f142809d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((C17151e) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142808c;
            if (i10 == 0) {
                XH.y.b(obj);
                h hVar = this.f142809d;
                this.f142808c = 1;
                if (hVar.d2(this) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {1111, 1108, 1115, 1121}, m = "getSmartaPlacement")
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.h$f  reason: case insensitive filesystem */
    static final class C17152f extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142810c;

        /* renamed from: d  reason: collision with root package name */
        Object f142811d;

        /* renamed from: e  reason: collision with root package name */
        Object f142812e;

        /* renamed from: f  reason: collision with root package name */
        Object f142813f;

        /* renamed from: g  reason: collision with root package name */
        Object f142814g;

        /* renamed from: h  reason: collision with root package name */
        Object f142815h;

        /* renamed from: i  reason: collision with root package name */
        Object f142816i;

        /* renamed from: j  reason: collision with root package name */
        Object f142817j;

        /* renamed from: k  reason: collision with root package name */
        Object f142818k;

        /* renamed from: l  reason: collision with root package name */
        Object f142819l;

        /* renamed from: m  reason: collision with root package name */
        Object f142820m;

        /* renamed from: n  reason: collision with root package name */
        Object f142821n;

        /* renamed from: o  reason: collision with root package name */
        int f142822o;

        /* renamed from: p  reason: collision with root package name */
        int f142823p;

        /* renamed from: q  reason: collision with root package name */
        int f142824q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f142825r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ h f142826s;

        /* renamed from: t  reason: collision with root package name */
        int f142827t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17152f(h hVar, C17164e<? super C17152f> eVar) {
            super(eVar);
            this.f142826s = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142825r = obj;
            this.f142827t |= Integer.MIN_VALUE;
            return this.f142826s.d1((C17497c) null, (CachedCatalogItem) null, (SceneLayout) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$handleDecorateSurfaceEvent$1", f = "DecorateSurfaceFragmentViewModel.kt", l = {407, 431, 433, 434, 444, 446, 464, 468, 470, 472, 492, 498, 504, 552, 560, 564, 573, 591, 612, 671, 679, 680}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.h$g  reason: case insensitive filesystem */
    static final class C17153g extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f142828c;

        /* renamed from: d  reason: collision with root package name */
        Object f142829d;

        /* renamed from: e  reason: collision with root package name */
        Object f142830e;

        /* renamed from: f  reason: collision with root package name */
        Object f142831f;

        /* renamed from: g  reason: collision with root package name */
        Object f142832g;

        /* renamed from: h  reason: collision with root package name */
        Object f142833h;

        /* renamed from: i  reason: collision with root package name */
        Object f142834i;

        /* renamed from: j  reason: collision with root package name */
        Object f142835j;

        /* renamed from: k  reason: collision with root package name */
        Object f142836k;

        /* renamed from: l  reason: collision with root package name */
        Object f142837l;

        /* renamed from: m  reason: collision with root package name */
        int f142838m;

        /* renamed from: n  reason: collision with root package name */
        int f142839n;

        /* renamed from: o  reason: collision with root package name */
        int f142840o;

        /* renamed from: p  reason: collision with root package name */
        int f142841p;

        /* renamed from: q  reason: collision with root package name */
        int f142842q;

        /* renamed from: r  reason: collision with root package name */
        int f142843r;

        /* renamed from: s  reason: collision with root package name */
        private /* synthetic */ Object f142844s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ a f142845t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ h f142846u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17153g(a aVar, h hVar, C17164e<? super C17153g> eVar) {
            super(2, eVar);
            this.f142845t = aVar;
            this.f142846u = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C17153g gVar = new C17153g(this.f142845t, this.f142846u, eVar);
            gVar.f142844s = obj;
            return gVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C17153g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:108:0x05bc, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x05e8, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x0662, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x069c, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x06c9, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x0744, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x0778, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x07ac, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0855, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x0889, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x08b6, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x092a, code lost:
            r2 = (com.sugarcube.app.base.data.Result) r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x092e, code lost:
            if ((r2 instanceof com.sugarcube.app.base.data.Result.Error) == false) goto L_0x0956;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x0930, code lost:
            r2 = (com.sugarcube.app.base.data.Result.Error) r2;
            com.sugarcube.decorate.v2.internal.ui.surface.h.G(r0.f142846u).v(YH.C16877v.e(((com.sugarcube.decorate.v2.internal.ui.surface.a.C17125e) r0.f142845t).a()), r2.getMessage());
            r1 = new com.sugarcube.common.UiText.DynamicString(r2.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x0954, code lost:
            r8 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x0958, code lost:
            if ((r2 instanceof com.sugarcube.app.base.data.Result.Success) == false) goto L_0x09b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:243:0x095a, code lost:
            com.sugarcube.decorate.v2.internal.ui.surface.h.G(r0.f142846u).y(YH.C16877v.e(((com.sugarcube.decorate.v2.internal.ui.surface.a.C17125e) r0.f142845t).a()));
            r2 = OE.n.f113169A1;
            r5 = ((com.sugarcube.decorate.v2.internal.ui.surface.a.C17125e) r0.f142845t).a().a().a().getName().toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.C17542s.i(r5, "toUpperCase(...)");
            r1 = new com.sugarcube.common.UiText.CompositeResource(r2, YH.C16877v.e(new com.sugarcube.common.UiText.DynamicString(r5)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:244:0x099f, code lost:
            r1 = r0.f142846u;
            r5 = r1.V0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:245:0x09a5, code lost:
            if (r5 == null) goto L_0x09b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:246:0x09a7, code lost:
            r4 = sG.r.b(r5, false, (sG.q) null, r8, (com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase.a) null, 11, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:247:0x09b1, code lost:
            r1.f2(r4);
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:249:0x09bd, code lost:
            throw new XH.t();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:259:0x0a16, code lost:
            r2 = (com.sugarcube.app.base.data.Result) r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:260:0x0a1a, code lost:
            if ((r2 instanceof com.sugarcube.app.base.data.Result.Error) == false) goto L_0x0a3e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:261:0x0a1c, code lost:
            r2 = (com.sugarcube.app.base.data.Result.Error) r2;
            com.sugarcube.decorate.v2.internal.ui.surface.h.G(r0.f142846u).v(((com.sugarcube.decorate.v2.internal.ui.surface.a.C17126f) r0.f142845t).a(), r2.getMessage());
            r1 = new com.sugarcube.common.UiText.DynamicString(r2.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:262:0x0a3c, code lost:
            r8 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:264:0x0a40, code lost:
            if ((r2 instanceof com.sugarcube.app.base.data.Result.Success) == false) goto L_0x0a74;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:265:0x0a42, code lost:
            com.sugarcube.decorate.v2.internal.ui.surface.h.G(r0.f142846u).y(((com.sugarcube.decorate.v2.internal.ui.surface.a.C17126f) r0.f142845t).a());
            r1 = new com.sugarcube.common.UiText.CompositeResource(OE.n.f113499z1, (java.util.List) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:266:0x0a5b, code lost:
            r1 = r0.f142846u;
            r5 = r1.V0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:267:0x0a61, code lost:
            if (r5 == null) goto L_0x0a6d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:268:0x0a63, code lost:
            r4 = sG.r.b(r5, false, (sG.q) null, r8, (com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase.a) null, 11, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:269:0x0a6d, code lost:
            r1.f2(r4);
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:271:0x0a79, code lost:
            throw new XH.t();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:288:0x0b07, code lost:
            r2 = (com.sugarcube.app.base.data.Result) r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:289:0x0b0b, code lost:
            if ((r2 instanceof com.sugarcube.app.base.data.Result.Error) == false) goto L_0x0b33;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:290:0x0b0d, code lost:
            r1 = r0.f142846u;
            r5 = r1.V0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:291:0x0b13, code lost:
            if (r5 == null) goto L_0x0b2f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:292:0x0b15, code lost:
            r4 = sG.r.b(r5, false, new sG.q(new com.sugarcube.common.UiText.DynamicString(((com.sugarcube.app.base.data.Result.Error) r2).getMessage())), (com.sugarcube.common.UiText) null, (com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase.a) null, 13, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:293:0x0b2f, code lost:
            r1.f2(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:295:0x0b35, code lost:
            if ((r2 instanceof com.sugarcube.app.base.data.Result.Success) == false) goto L_0x0b54;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:296:0x0b37, code lost:
            r0.f142846u.f2(new sG.r(false, (sG.q) null, (com.sugarcube.common.UiText) null, (com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase.a) ((com.sugarcube.app.base.data.Result.Success) r2).getData(), 7, (kotlin.jvm.internal.DefaultConstructorMarker) null));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:297:0x0b50, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:299:0x0b59, code lost:
            throw new XH.t();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:340:0x0d96, code lost:
            if (com.sugarcube.decorate.v2.internal.ui.surface.h.U(r0.f142846u).isLoggedIn().getValue().booleanValue() != false) goto L_0x0da8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:341:0x0d98, code lost:
            com.sugarcube.decorate.v2.internal.ui.surface.h.K(r0.f142846u).g(new NG.y("Authentication not finished successfully."));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:342:0x0da8, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:351:0x0df2, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:357:0x0e27, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:380:0x0f48, code lost:
            return XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0489, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0538, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x056a, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r45) {
            /*
                r44 = this;
                r0 = r44
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f142843r
                r3 = 2
                r4 = 0
                switch(r2) {
                    case 0: goto L_0x0305;
                    case 1: goto L_0x02e4;
                    case 2: goto L_0x02c3;
                    case 3: goto L_0x02a0;
                    case 4: goto L_0x027f;
                    case 5: goto L_0x025e;
                    case 6: goto L_0x023d;
                    case 7: goto L_0x021c;
                    case 8: goto L_0x01f9;
                    case 9: goto L_0x01d8;
                    case 10: goto L_0x01b7;
                    case 11: goto L_0x0196;
                    case 12: goto L_0x0175;
                    case 13: goto L_0x0154;
                    case 14: goto L_0x0133;
                    case 15: goto L_0x0112;
                    case 16: goto L_0x00f1;
                    case 17: goto L_0x00ce;
                    case 18: goto L_0x00a3;
                    case 19: goto L_0x0078;
                    case 20: goto L_0x0057;
                    case 21: goto L_0x0036;
                    case 22: goto L_0x0015;
                    default: goto L_0x000d;
                }
            L_0x000d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0015:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x0e27
            L_0x0036:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x0df2
            L_0x0057:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x0d82
            L_0x0078:
                java.lang.Object r1 = r0.f142835j
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f142834i
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f142833h
                java.util.Collection r1 = (java.util.Collection) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f142831f
                sG.r r1 = (sG.r) r1
                java.lang.Object r1 = r0.f142830e
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f142829d
                KJ.c r1 = (KJ.C15987c) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                r2 = r45
                goto L_0x0b07
            L_0x00a3:
                java.lang.Object r1 = r0.f142835j
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f142834i
                com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase r1 = (com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase) r1
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f142831f
                java.util.Collection r1 = (java.util.Collection) r1
                java.lang.Object r1 = r0.f142830e
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f142829d
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                r2 = r45
                goto L_0x0a16
            L_0x00ce:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                r2 = r45
                goto L_0x092a
            L_0x00f1:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x08b6
            L_0x0112:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x0889
            L_0x0133:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x0855
            L_0x0154:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x07ac
            L_0x0175:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x0778
            L_0x0196:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x0744
            L_0x01b7:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x06c9
            L_0x01d8:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x069c
            L_0x01f9:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x021c:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x0662
            L_0x023d:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x05e8
            L_0x025e:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x05bc
            L_0x027f:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x056a
            L_0x02a0:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x02c3:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x0538
            L_0x02e4:
                java.lang.Object r1 = r0.f142833h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142832g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f142831f
                com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                java.lang.Object r1 = r0.f142830e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f142829d
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142828c
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a) r1
                java.lang.Object r1 = r0.f142844s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r45)
                goto L_0x0489
            L_0x0305:
                XH.y.b(r45)
                java.lang.Object r2 = r0.f142844s
                QJ.Q r2 = (QJ.Q) r2
                com.sugarcube.decorate.v2.internal.ui.surface.a r5 = r0.f142845t
                com.sugarcube.core.logger.Priority r6 = com.sugarcube.core.logger.Priority.DEBUG
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "handling event: "
                r7.append(r8)
                r7.append(r5)
                java.lang.String r7 = r7.toString()
                java.lang.String r8 = ""
                if (r7 != 0) goto L_0x0326
                r7 = r8
            L_0x0326:
                int[] r9 = NG.l.f136490a
                int r10 = r6.ordinal()
                r9 = r9[r10]
                r10 = 5
                r11 = 4
                java.lang.String r12 = " "
                java.lang.String r13 = "Kt"
                r15 = 36
                r14 = 1
                if (r9 == r14) goto L_0x0422
                if (r9 == r3) goto L_0x03ec
                r14 = 3
                if (r9 == r14) goto L_0x03b6
                if (r9 == r11) goto L_0x037f
                if (r9 != r10) goto L_0x0379
                java.lang.Class r9 = r2.getClass()
                java.lang.String r9 = r9.getName()
                kotlin.jvm.internal.C17542s.g(r9)
                java.lang.String r14 = HJ.C15854t.s1(r9, r15, r4, r3, r4)
                r15 = 46
                java.lang.String r14 = HJ.C15854t.o1(r14, r15, r4, r3, r4)
                int r15 = r14.length()
                if (r15 != 0) goto L_0x035e
                goto L_0x0362
            L_0x035e:
                java.lang.String r9 = HJ.C15854t.P0(r14, r13)
            L_0x0362:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r7)
                r13.append(r12)
                r13.append(r8)
                java.lang.String r12 = r13.toString()
                android.util.Log.e(r9, r12)
                goto L_0x0457
            L_0x0379:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x037f:
                java.lang.Class r9 = r2.getClass()
                java.lang.String r9 = r9.getName()
                kotlin.jvm.internal.C17542s.g(r9)
                java.lang.String r14 = HJ.C15854t.s1(r9, r15, r4, r3, r4)
                r15 = 46
                java.lang.String r14 = HJ.C15854t.o1(r14, r15, r4, r3, r4)
                int r15 = r14.length()
                if (r15 != 0) goto L_0x039b
                goto L_0x039f
            L_0x039b:
                java.lang.String r9 = HJ.C15854t.P0(r14, r13)
            L_0x039f:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r7)
                r13.append(r12)
                r13.append(r8)
                java.lang.String r12 = r13.toString()
                android.util.Log.w(r9, r12)
                goto L_0x0457
            L_0x03b6:
                java.lang.Class r9 = r2.getClass()
                java.lang.String r9 = r9.getName()
                kotlin.jvm.internal.C17542s.g(r9)
                java.lang.String r14 = HJ.C15854t.s1(r9, r15, r4, r3, r4)
                r15 = 46
                java.lang.String r14 = HJ.C15854t.o1(r14, r15, r4, r3, r4)
                int r15 = r14.length()
                if (r15 != 0) goto L_0x03d2
                goto L_0x03d6
            L_0x03d2:
                java.lang.String r9 = HJ.C15854t.P0(r14, r13)
            L_0x03d6:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r7)
                r13.append(r12)
                r13.append(r8)
                java.lang.String r12 = r13.toString()
                android.util.Log.i(r9, r12)
                goto L_0x0457
            L_0x03ec:
                java.lang.Class r9 = r2.getClass()
                java.lang.String r9 = r9.getName()
                kotlin.jvm.internal.C17542s.g(r9)
                java.lang.String r14 = HJ.C15854t.s1(r9, r15, r4, r3, r4)
                r15 = 46
                java.lang.String r14 = HJ.C15854t.o1(r14, r15, r4, r3, r4)
                int r15 = r14.length()
                if (r15 != 0) goto L_0x0408
                goto L_0x040c
            L_0x0408:
                java.lang.String r9 = HJ.C15854t.P0(r14, r13)
            L_0x040c:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r7)
                r13.append(r12)
                r13.append(r8)
                java.lang.String r12 = r13.toString()
                android.util.Log.d(r9, r12)
                goto L_0x0457
            L_0x0422:
                java.lang.Class r9 = r2.getClass()
                java.lang.String r9 = r9.getName()
                kotlin.jvm.internal.C17542s.g(r9)
                java.lang.String r14 = HJ.C15854t.s1(r9, r15, r4, r3, r4)
                r15 = 46
                java.lang.String r14 = HJ.C15854t.o1(r14, r15, r4, r3, r4)
                int r15 = r14.length()
                if (r15 != 0) goto L_0x043e
                goto L_0x0442
            L_0x043e:
                java.lang.String r9 = HJ.C15854t.P0(r14, r13)
            L_0x0442:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r7)
                r13.append(r12)
                r13.append(r8)
                java.lang.String r12 = r13.toString()
                android.util.Log.v(r9, r12)
            L_0x0457:
                com.sugarcube.decorate.v2.internal.ui.surface.a r9 = r0.f142845t
                boolean r12 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.I
                r13 = 0
                if (r12 == 0) goto L_0x048d
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                r4 = r9
                com.sugarcube.decorate.v2.internal.ui.surface.a$I r4 = (com.sugarcube.decorate.v2.internal.ui.surface.a.I) r4
                RF.k r4 = r4.a()
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 1
                r0.f142843r = r2
                java.lang.Object r2 = r3.E1(r4, r0)
                if (r2 != r1) goto L_0x0489
                return r1
            L_0x0489:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x048d:
                boolean r12 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.H
                if (r12 == 0) goto L_0x049a
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.D1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x049a:
                boolean r12 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17124d
                if (r12 == 0) goto L_0x04a7
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.o1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x04a7:
                boolean r12 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17127g
                if (r12 == 0) goto L_0x04b4
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.q1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x04b4:
                boolean r12 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17140t
                if (r12 == 0) goto L_0x04ce
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                com.sugarcube.decorate.v2.internal.manager.engine.EngineMagicEraserInteractions r1 = r1.f142658J
                r1.toggleMagicEraser()
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                hG.v r1 = r1.f142678s
                r1.I()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x04ce:
                boolean r12 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17142v
                if (r12 == 0) goto L_0x04e8
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                com.sugarcube.decorate.v2.internal.manager.engine.EngineMagicEraserInteractions r1 = r1.f142658J
                r1.restoreAllErasableItems()
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                hG.v r1 = r1.f142678s
                r1.e0()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x04e8:
                boolean r12 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17141u
                if (r12 == 0) goto L_0x0502
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                com.sugarcube.decorate.v2.internal.manager.engine.EngineMagicEraserInteractions r1 = r1.f142658J
                r1.eraseAllErasableItems()
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                hG.v r1 = r1.f142678s
                r1.G()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0502:
                boolean r12 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.f0.b
                if (r12 == 0) goto L_0x053c
                com.sugarcube.decorate.v2.internal.ui.surface.h r4 = r0.f142846u
                r10 = r9
                com.sugarcube.decorate.v2.internal.ui.surface.a$f0$b r10 = (com.sugarcube.decorate.v2.internal.ui.surface.a.f0.b) r10
                com.sugarcube.app.base.data.database.CachedCatalogItem r10 = r10.a()
                com.sugarcube.decorate.v2.internal.ui.surface.a r11 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$f0$b r11 = (com.sugarcube.decorate.v2.internal.ui.surface.a.f0.b) r11
                boolean r11 = r11.b()
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r0.f142843r = r3
                java.lang.Object r2 = r4.V1(r10, r11, r0)
                if (r2 != r1) goto L_0x0538
                return r1
            L_0x0538:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x053c:
                boolean r12 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.f0.C3479a
                if (r12 == 0) goto L_0x056e
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                r4 = r9
                com.sugarcube.decorate.v2.internal.ui.surface.a$f0$a r4 = (com.sugarcube.decorate.v2.internal.ui.surface.a.f0.C3479a) r4
                com.sugarcube.app.base.data.database.CachedCatalogItem r4 = r4.a()
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r0.f142843r = r11
                java.lang.Object r2 = r3.fetchVariants(r4, r0)
                if (r2 != r1) goto L_0x056a
                return r1
            L_0x056a:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x056e:
                boolean r11 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.O
                if (r11 == 0) goto L_0x057b
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.N1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x057b:
                boolean r11 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.K
                if (r11 == 0) goto L_0x0588
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.I1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0588:
                boolean r11 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.L
                if (r11 == 0) goto L_0x0595
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.J1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0595:
                boolean r11 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17138r
                if (r11 == 0) goto L_0x05c0
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r0.f142843r = r10
                java.lang.Object r2 = r3.t1(r0)
                if (r2 != r1) goto L_0x05bc
                return r1
            L_0x05bc:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x05c0:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17134n
                if (r10 == 0) goto L_0x05ec
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 6
                r0.f142843r = r2
                java.lang.Object r2 = r3.s1(r0)
                if (r2 != r1) goto L_0x05e8
                return r1
            L_0x05e8:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x05ec:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.J
                if (r10 == 0) goto L_0x05f9
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.G1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x05f9:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C
                if (r10 == 0) goto L_0x0606
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.y1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0606:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.M
                if (r10 == 0) goto L_0x0613
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.L1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0613:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.c0
                if (r10 == 0) goto L_0x0620
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.X1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0620:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.a0
                if (r10 == 0) goto L_0x062d
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.U1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x062d:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.E
                if (r10 == 0) goto L_0x063a
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.A1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x063a:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17144x
                if (r10 == 0) goto L_0x0666
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 7
                r0.f142843r = r2
                java.lang.Object r2 = r3.v1(r0)
                if (r2 != r1) goto L_0x0662
                return r1
            L_0x0662:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0666:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17139s
                if (r10 == 0) goto L_0x0673
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.u1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0673:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.R
                if (r10 == 0) goto L_0x06a0
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 9
                r0.f142843r = r2
                java.lang.Object r2 = r3.P1(r0)
                if (r2 != r1) goto L_0x069c
                return r1
            L_0x069c:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x06a0:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.T
                r11 = 10
                if (r10 == 0) goto L_0x06cd
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r0.f142843r = r11
                java.lang.Object r2 = r3.R1(r0)
                if (r2 != r1) goto L_0x06c9
                return r1
            L_0x06c9:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x06cd:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.W
                if (r10 == 0) goto L_0x06da
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.T1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x06da:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.U
                if (r10 == 0) goto L_0x06e7
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.S1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x06e7:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.F
                if (r10 == 0) goto L_0x06f4
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.B1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x06f4:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.e0
                if (r10 == 0) goto L_0x0707
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                com.sugarcube.decorate.v2.internal.ui.surface.a$e0 r9 = (com.sugarcube.decorate.v2.internal.ui.surface.a.e0) r9
                SG.b r2 = r9.a()
                r1.Z1(r2)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0707:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.G
                if (r10 == 0) goto L_0x0714
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.C1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0714:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.Z
                if (r10 == 0) goto L_0x0748
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                r4 = r9
                com.sugarcube.decorate.v2.internal.ui.surface.a$Z r4 = (com.sugarcube.decorate.v2.internal.ui.surface.a.Z) r4
                com.sugarcube.app.base.data.database.CachedCatalogItem r4 = r4.a()
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 11
                r0.f142843r = r2
                java.lang.Object r2 = r3.F1(r4, r0)
                if (r2 != r1) goto L_0x0744
                return r1
            L_0x0744:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0748:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.D
                if (r10 == 0) goto L_0x077c
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                r4 = r9
                com.sugarcube.decorate.v2.internal.ui.surface.a$D r4 = (com.sugarcube.decorate.v2.internal.ui.surface.a.D) r4
                com.sugarcube.app.base.data.database.CachedCatalogItem r4 = r4.a()
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 12
                r0.f142843r = r2
                java.lang.Object r2 = r3.z1(r4, r0)
                if (r2 != r1) goto L_0x0778
                return r1
            L_0x0778:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x077c:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.N
                if (r10 == 0) goto L_0x07b0
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                r4 = r9
                com.sugarcube.decorate.v2.internal.ui.surface.a$N r4 = (com.sugarcube.decorate.v2.internal.ui.surface.a.N) r4
                com.sugarcube.app.base.data.database.CachedCatalogItem r4 = r4.a()
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 13
                r0.f142843r = r2
                java.lang.Object r2 = r3.M1(r4, r0)
                if (r2 != r1) goto L_0x07ac
                return r1
            L_0x07ac:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x07b0:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17128h
                if (r10 == 0) goto L_0x07c3
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                com.sugarcube.decorate.v2.internal.ui.surface.a$h r9 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17128h) r9
                com.sugarcube.app.base.data.database.CachedCatalogItem r2 = r9.a()
                r1.p1(r2)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x07c3:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.Q
                if (r10 == 0) goto L_0x07de
                com.sugarcube.decorate.v2.internal.ui.surface.a$Q r9 = (com.sugarcube.decorate.v2.internal.ui.surface.a.Q) r9
                float r1 = r9.a()
                r2 = 1016003125(0x3c8efa35, float:0.017453292)
                float r1 = r1 * r2
                com.sugarcube.decorate.v2.internal.ui.surface.h r2 = r0.f142846u
                com.sugarcube.decorate.v2.internal.manager.engine.EngineToolbarInteractions r2 = r2.f142656H
                r2.rotateSelectedItemBy(r1)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x07de:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.P
                if (r10 == 0) goto L_0x07eb
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.O1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x07eb:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.d0
                if (r10 == 0) goto L_0x07fa
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                com.sugarcube.decorate.v2.internal.ui.surface.a$d0 r9 = (com.sugarcube.decorate.v2.internal.ui.surface.a.d0) r9
                r1.Q1(r9)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x07fa:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17137q
                if (r10 == 0) goto L_0x0813
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                com.sugarcube.decorate.v2.internal.ui.surface.a$d0 r2 = new com.sugarcube.decorate.v2.internal.ui.surface.a$d0
                mG.a r3 = new mG.a
                RF.j r5 = RF.j.DOLLHOUSE_1
                r3.<init>(r5, r4)
                r2.<init>(r3)
                r1.Q1(r2)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0813:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.b0
                if (r10 == 0) goto L_0x082c
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                com.sugarcube.decorate.v2.internal.ui.surface.a$d0 r2 = new com.sugarcube.decorate.v2.internal.ui.surface.a$d0
                mG.a r3 = new mG.a
                RF.j r5 = RF.j.TOP
                r3.<init>(r5, r4)
                r2.<init>(r3)
                r1.Q1(r2)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x082c:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.V
                if (r10 == 0) goto L_0x0859
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 14
                r0.f142843r = r2
                java.lang.Object r2 = r3.Y1(r0)
                if (r2 != r1) goto L_0x0855
                return r1
            L_0x0855:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0859:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.A
                if (r10 == 0) goto L_0x088d
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                r4 = r9
                com.sugarcube.decorate.v2.internal.ui.surface.a$A r4 = (com.sugarcube.decorate.v2.internal.ui.surface.a.A) r4
                int r4 = r4.a()
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 15
                r0.f142843r = r2
                java.lang.Object r2 = r3.x1(r4, r0)
                if (r2 != r1) goto L_0x0889
                return r1
            L_0x0889:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x088d:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17146z
                if (r10 == 0) goto L_0x08ba
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 16
                r0.f142843r = r2
                java.lang.Object r2 = r3.w1(r0)
                if (r2 != r1) goto L_0x08b6
                return r1
            L_0x08b6:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x08ba:
                com.sugarcube.decorate.v2.internal.ui.surface.a$l r10 = com.sugarcube.decorate.v2.internal.ui.surface.a.C17132l.f142628a
                boolean r10 = kotlin.jvm.internal.C17542s.e(r9, r10)
                if (r10 == 0) goto L_0x08cb
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.f2(r4)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x08cb:
                com.sugarcube.decorate.v2.internal.ui.surface.a$k r10 = com.sugarcube.decorate.v2.internal.ui.surface.a.C17131k.f142627a
                boolean r10 = kotlin.jvm.internal.C17542s.e(r9, r10)
                if (r10 == 0) goto L_0x08dc
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.e2(r4)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x08dc:
                com.sugarcube.decorate.v2.internal.ui.surface.a$j r10 = com.sugarcube.decorate.v2.internal.ui.surface.a.C17130j.f142626a
                boolean r10 = kotlin.jvm.internal.C17542s.e(r9, r10)
                if (r10 == 0) goto L_0x08ed
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                r1.r1()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x08ed:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17125e
                if (r10 == 0) goto L_0x09be
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase r3 = r3.f142683x
                com.sugarcube.decorate.v2.internal.ui.surface.a r10 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$e r10 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17125e) r10
                rG.a r10 = r10.a()
                rG.b r10 = r10.a()
                java.util.List r10 = YH.C16877v.e(r10)
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 17
                r0.f142843r = r2
                java.lang.Object r2 = r3.addItemsToCart(r10, r0)
                if (r2 != r1) goto L_0x092a
                return r1
            L_0x092a:
                com.sugarcube.app.base.data.Result r2 = (com.sugarcube.app.base.data.Result) r2
                boolean r1 = r2 instanceof com.sugarcube.app.base.data.Result.Error
                if (r1 == 0) goto L_0x0956
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                hG.v r1 = r1.f142678s
                com.sugarcube.decorate.v2.internal.ui.surface.a r3 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$e r3 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17125e) r3
                rG.a r3 = r3.a()
                java.util.List r3 = YH.C16877v.e(r3)
                com.sugarcube.app.base.data.Result$Error r2 = (com.sugarcube.app.base.data.Result.Error) r2
                java.lang.String r5 = r2.getMessage()
                r1.v(r3, r5)
                com.sugarcube.common.UiText$DynamicString r1 = new com.sugarcube.common.UiText$DynamicString
                java.lang.String r2 = r2.getMessage()
                r1.<init>(r2)
            L_0x0954:
                r8 = r1
                goto L_0x099f
            L_0x0956:
                boolean r1 = r2 instanceof com.sugarcube.app.base.data.Result.Success
                if (r1 == 0) goto L_0x09b8
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                hG.v r1 = r1.f142678s
                com.sugarcube.decorate.v2.internal.ui.surface.a r2 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$e r2 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17125e) r2
                rG.a r2 = r2.a()
                java.util.List r2 = YH.C16877v.e(r2)
                r1.y(r2)
                com.sugarcube.common.UiText$CompositeResource r1 = new com.sugarcube.common.UiText$CompositeResource
                int r2 = OE.n.f113169A1
                com.sugarcube.common.UiText$DynamicString r3 = new com.sugarcube.common.UiText$DynamicString
                com.sugarcube.decorate.v2.internal.ui.surface.a r5 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$e r5 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17125e) r5
                rG.a r5 = r5.a()
                rG.b r5 = r5.a()
                com.sugarcube.app.base.data.database.CachedCatalogItem r5 = r5.a()
                java.lang.String r5 = r5.getName()
                java.util.Locale r6 = java.util.Locale.ROOT
                java.lang.String r5 = r5.toUpperCase(r6)
                java.lang.String r6 = "toUpperCase(...)"
                kotlin.jvm.internal.C17542s.i(r5, r6)
                r3.<init>(r5)
                java.util.List r3 = YH.C16877v.e(r3)
                r1.<init>(r2, r3)
                goto L_0x0954
            L_0x099f:
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                sG.r r5 = r1.V0()
                if (r5 == 0) goto L_0x09b1
                r10 = 11
                r11 = 0
                r6 = 0
                r7 = 0
                r9 = 0
                sG.r r4 = sG.r.b(r5, r6, r7, r8, r9, r10, r11)
            L_0x09b1:
                r1.f2(r4)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x09b8:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x09be:
                boolean r10 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17126f
                if (r10 == 0) goto L_0x0a7a
                com.sugarcube.decorate.v2.internal.ui.surface.h r5 = r0.f142846u
                com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase r5 = r5.f142683x
                com.sugarcube.decorate.v2.internal.ui.surface.a r6 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$f r6 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17126f) r6
                java.util.List r6 = r6.a()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                int r10 = YH.C16877v.y(r6, r11)
                r7.<init>(r10)
                java.util.Iterator r10 = r6.iterator()
            L_0x09df:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x09f3
                java.lang.Object r11 = r10.next()
                rG.a r11 = (rG.C17847a) r11
                rG.b r11 = r11.a()
                r7.add(r11)
                goto L_0x09df
            L_0x09f3:
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r6
                r0.f142830e = r6
                r0.f142831f = r7
                r0.f142832g = r10
                r0.f142833h = r8
                r0.f142834i = r5
                r0.f142835j = r7
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r2 = 18
                r0.f142843r = r2
                java.lang.Object r2 = r5.addItemsToCart(r7, r0)
                if (r2 != r1) goto L_0x0a16
                return r1
            L_0x0a16:
                com.sugarcube.app.base.data.Result r2 = (com.sugarcube.app.base.data.Result) r2
                boolean r1 = r2 instanceof com.sugarcube.app.base.data.Result.Error
                if (r1 == 0) goto L_0x0a3e
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                hG.v r1 = r1.f142678s
                com.sugarcube.decorate.v2.internal.ui.surface.a r3 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$f r3 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17126f) r3
                java.util.List r3 = r3.a()
                com.sugarcube.app.base.data.Result$Error r2 = (com.sugarcube.app.base.data.Result.Error) r2
                java.lang.String r5 = r2.getMessage()
                r1.v(r3, r5)
                com.sugarcube.common.UiText$DynamicString r1 = new com.sugarcube.common.UiText$DynamicString
                java.lang.String r2 = r2.getMessage()
                r1.<init>(r2)
            L_0x0a3c:
                r8 = r1
                goto L_0x0a5b
            L_0x0a3e:
                boolean r1 = r2 instanceof com.sugarcube.app.base.data.Result.Success
                if (r1 == 0) goto L_0x0a74
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                hG.v r1 = r1.f142678s
                com.sugarcube.decorate.v2.internal.ui.surface.a r2 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$f r2 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17126f) r2
                java.util.List r2 = r2.a()
                r1.y(r2)
                com.sugarcube.common.UiText$CompositeResource r1 = new com.sugarcube.common.UiText$CompositeResource
                int r2 = OE.n.f113499z1
                r1.<init>(r2, r4, r3, r4)
                goto L_0x0a3c
            L_0x0a5b:
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                sG.r r5 = r1.V0()
                if (r5 == 0) goto L_0x0a6d
                r10 = 11
                r11 = 0
                r6 = 0
                r7 = 0
                r9 = 0
                sG.r r4 = sG.r.b(r5, r6, r7, r8, r9, r10, r11)
            L_0x0a6d:
                r1.f2(r4)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0a74:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x0a7a:
                com.sugarcube.decorate.v2.internal.ui.surface.a$B r3 = com.sugarcube.decorate.v2.internal.ui.surface.a.B.f142582a
                boolean r3 = kotlin.jvm.internal.C17542s.e(r9, r3)
                if (r3 == 0) goto L_0x0b5a
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                TJ.B r3 = r3.h1()
                java.lang.Object r3 = r3.getValue()
                OG.l0 r3 = (OG.l0) r3
                KJ.c r3 = r3.k()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r6 = r3.iterator()
            L_0x0a9b:
                boolean r10 = r6.hasNext()
                if (r10 == 0) goto L_0x0abb
                java.lang.Object r8 = r6.next()
                r7 = r8
                RF.k r7 = (RF.k) r7
                com.sugarcube.app.base.data.database.CachedCatalogItem r7 = r7.d()
                com.sugarcube.core.network.models.CatalogItem r7 = r7.getCatalogItem()
                java.lang.Integer r7 = r7.getId()
                if (r7 == 0) goto L_0x0ab9
                r5.add(r7)
            L_0x0ab9:
                r7 = r8
                goto L_0x0a9b
            L_0x0abb:
                com.sugarcube.decorate.v2.internal.ui.surface.h r10 = r0.f142846u
                sG.r r11 = r10.V0()
                if (r11 == 0) goto L_0x0ad4
                r19 = 14
                r20 = 0
                r15 = 1
                r16 = 0
                r17 = 0
                r18 = 0
                r14 = r11
                sG.r r12 = sG.r.b(r14, r15, r16, r17, r18, r19, r20)
                goto L_0x0ad5
            L_0x0ad4:
                r12 = r4
            L_0x0ad5:
                r10.f2(r12)
                com.sugarcube.decorate.v2.internal.ui.surface.h r10 = r0.f142846u
                com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase r10 = r10.f142683x
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r3
                r0.f142830e = r5
                r0.f142831f = r11
                r0.f142832g = r3
                r0.f142833h = r5
                r0.f142834i = r3
                r0.f142835j = r6
                r0.f142836k = r7
                r0.f142837l = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r2 = 19
                r0.f142843r = r2
                java.lang.Object r2 = r10.execute(r5, r0)
                if (r2 != r1) goto L_0x0b07
                return r1
            L_0x0b07:
                com.sugarcube.app.base.data.Result r2 = (com.sugarcube.app.base.data.Result) r2
                boolean r1 = r2 instanceof com.sugarcube.app.base.data.Result.Error
                if (r1 == 0) goto L_0x0b33
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                sG.r r5 = r1.V0()
                if (r5 == 0) goto L_0x0b2f
                sG.q r7 = new sG.q
                com.sugarcube.common.UiText$DynamicString r3 = new com.sugarcube.common.UiText$DynamicString
                com.sugarcube.app.base.data.Result$Error r2 = (com.sugarcube.app.base.data.Result.Error) r2
                java.lang.String r2 = r2.getMessage()
                r3.<init>(r2)
                r7.<init>(r3)
                r10 = 13
                r11 = 0
                r6 = 0
                r8 = 0
                r9 = 0
                sG.r r4 = sG.r.b(r5, r6, r7, r8, r9, r10, r11)
            L_0x0b2f:
                r1.f2(r4)
                goto L_0x0b50
            L_0x0b33:
                boolean r1 = r2 instanceof com.sugarcube.app.base.data.Result.Success
                if (r1 == 0) goto L_0x0b54
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                sG.r r10 = new sG.r
                com.sugarcube.app.base.data.Result$Success r2 = (com.sugarcube.app.base.data.Result.Success) r2
                java.lang.Object r2 = r2.getData()
                r7 = r2
                com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase$a r7 = (com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase.a) r7
                r8 = 7
                r9 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8, r9)
                r1.f2(r10)
            L_0x0b50:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0b54:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x0b5a:
                com.sugarcube.decorate.v2.internal.ui.surface.a$i r3 = com.sugarcube.decorate.v2.internal.ui.surface.a.C17129i.f142625a
                boolean r3 = kotlin.jvm.internal.C17542s.e(r9, r3)
                if (r3 == 0) goto L_0x0b7c
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                sG.r r5 = r1.V0()
                if (r5 == 0) goto L_0x0b75
                r10 = 11
                r11 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                sG.r r4 = sG.r.b(r5, r6, r7, r8, r9, r10, r11)
            L_0x0b75:
                r1.f2(r4)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0b7c:
                com.sugarcube.decorate.v2.internal.ui.surface.a$p r3 = com.sugarcube.decorate.v2.internal.ui.surface.a.C17136p.f142632a
                boolean r3 = kotlin.jvm.internal.C17542s.e(r9, r3)
                if (r3 == 0) goto L_0x0b91
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                TJ.B r1 = r1.h1()
                OG.n0.g(r1, r4)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0b91:
                boolean r3 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17135o
                if (r3 == 0) goto L_0x0c20
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                kG.c r2 = r1.Z0()
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                kG.c r3 = r3.Z0()
                com.sugarcube.app.base.data.database.CachedCompiledComposition r4 = r3.c()
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                kG.c r3 = r3.Z0()
                com.sugarcube.app.base.data.database.CachedCompiledComposition r3 = r3.c()
                com.sugarcube.core.network.models.CompiledComposition r5 = r3.getCompiledComposition()
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                kG.c r3 = r3.Z0()
                com.sugarcube.app.base.data.database.CachedCompiledComposition r3 = r3.c()
                com.sugarcube.core.network.models.CompiledComposition r3 = r3.getCompiledComposition()
                com.sugarcube.core.network.models.Composition r6 = r3.getComposition()
                com.sugarcube.decorate.v2.internal.ui.surface.a r3 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$o r3 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17135o) r3
                java.lang.String r8 = r3.a()
                r25 = 262141(0x3fffd, float:3.67338E-40)
                r26 = 0
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                com.sugarcube.core.network.models.Composition r6 = com.sugarcube.core.network.models.Composition.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                r9 = 6
                r7 = 0
                r8 = 0
                com.sugarcube.core.network.models.CompiledComposition r5 = com.sugarcube.core.network.models.CompiledComposition.copy$default(r5, r6, r7, r8, r9, r10)
                r8 = 6
                r9 = 0
                r6 = 0
                com.sugarcube.app.base.data.database.CachedCompiledComposition r10 = com.sugarcube.app.base.data.database.CachedCompiledComposition.copy$default(r4, r5, r6, r7, r8, r9)
                r12 = 383(0x17f, float:5.37E-43)
                r3 = 0
                r4 = 0
                r5 = 0
                r8 = 0
                kG.c r2 = kG.C17497c.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r1.h2(r2)
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                QJ.x r1 = r1.f142668T
                com.sugarcube.decorate.v2.internal.ui.surface.h r2 = r0.f142846u
                kG.c r2 = r2.Z0()
                boolean r1 = r1.J(r2)
                kotlin.coroutines.jvm.internal.b.a(r1)
                goto L_0x0f46
            L_0x0c20:
                boolean r3 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.S
                if (r3 == 0) goto L_0x0c57
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$S r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a.S) r1
                java.lang.Boolean r1 = r1.a()
                if (r1 == 0) goto L_0x0c41
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                QJ.x r1 = r1.f142665Q
                com.sugarcube.decorate.v2.internal.ui.surface.a r2 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$S r2 = (com.sugarcube.decorate.v2.internal.ui.surface.a.S) r2
                java.lang.Boolean r2 = r2.a()
                boolean r1 = r1.J(r2)
                goto L_0x0c52
            L_0x0c41:
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                QJ.x r1 = r1.f142665Q
                NG.y r2 = new NG.y
                java.lang.String r3 = "Exit or save not confirmed"
                r2.<init>(r3)
                boolean r1 = r1.g(r2)
            L_0x0c52:
                kotlin.coroutines.jvm.internal.b.a(r1)
                goto L_0x0f46
            L_0x0c57:
                boolean r3 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17145y
                if (r3 == 0) goto L_0x0c8b
                com.sugarcube.decorate.v2.internal.ui.surface.a r1 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$y r1 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17145y) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L_0x0c75
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                QJ.x r1 = r1.f142666R
                r2 = 1
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r2)
                boolean r1 = r1.J(r2)
                goto L_0x0c86
            L_0x0c75:
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                QJ.x r1 = r1.f142666R
                NG.y r2 = new NG.y
                java.lang.String r3 = "Exit cancelled"
                r2.<init>(r3)
                boolean r1 = r1.g(r2)
            L_0x0c86:
                kotlin.coroutines.jvm.internal.b.a(r1)
                goto L_0x0f46
            L_0x0c8b:
                boolean r3 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17143w
                if (r3 == 0) goto L_0x0caa
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                QJ.x r1 = r1.f142667S
                com.sugarcube.decorate.v2.internal.ui.surface.a r2 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$w r2 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17143w) r2
                boolean r2 = r2.a()
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r2)
                boolean r1 = r1.J(r2)
                kotlin.coroutines.jvm.internal.b.a(r1)
                goto L_0x0f46
            L_0x0caa:
                boolean r3 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17122b
                if (r3 == 0) goto L_0x0cfb
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                TJ.B r1 = r1.h1()
                com.sugarcube.decorate.v2.internal.ui.surface.h r2 = r0.f142846u
                TJ.P r2 = r2.f1()
                java.lang.Object r2 = r2.getValue()
                r3 = r2
                OG.l0 r3 = (OG.l0) r3
                r31 = 67108863(0x3ffffff, float:1.5046327E-36)
                r32 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
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
                r30 = 1
                OG.l0 r2 = OG.l0.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
                r1.setValue(r2)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0cfb:
                boolean r3 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C3476a
                if (r3 == 0) goto L_0x0dac
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                TJ.B r3 = r3.h1()
                com.sugarcube.decorate.v2.internal.ui.surface.h r4 = r0.f142846u
                TJ.P r4 = r4.f1()
                java.lang.Object r4 = r4.getValue()
                r14 = r4
                OG.l0 r14 = (OG.l0) r14
                r42 = 67108863(0x3ffffff, float:1.5046327E-36)
                r43 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
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
                r39 = 0
                r40 = 0
                r41 = 0
                OG.l0 r4 = OG.l0.b(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
                r3.setValue(r4)
                com.sugarcube.decorate.v2.internal.ui.surface.a r3 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$a r3 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C3476a) r3
                boolean r3 = r3.a()
                if (r3 == 0) goto L_0x0d82
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 20
                r0.f142843r = r2
                r2 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r2 = QJ.C16297b0.b(r2, r0)
                if (r2 != r1) goto L_0x0d82
                return r1
            L_0x0d82:
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                com.sugarcube.app.base.data.user.UserRepo r1 = r1.f142676q
                TJ.P r1 = r1.isLoggedIn()
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L_0x0da8
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                QJ.x r1 = r1.f142664P
                NG.y r2 = new NG.y
                java.lang.String r3 = "Authentication not finished successfully."
                r2.<init>(r3)
                r1.g(r2)
            L_0x0da8:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0dac:
                boolean r3 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17123c.C3477a
                if (r3 == 0) goto L_0x0dc1
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                com.sugarcube.decorate.v2.internal.ui.surface.a r2 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$c$a r2 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17123c.C3477a) r2
                com.sugarcube.core.network.models.QuickFilter r2 = r2.a()
                r1.applyFilter(r2)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0dc1:
                boolean r3 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17123c.b
                if (r3 == 0) goto L_0x0df6
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                com.sugarcube.decorate.v2.internal.ui.surface.a r4 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$c$b r4 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17123c.b) r4
                com.sugarcube.core.network.models.RoomType r4 = r4.a()
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 21
                r0.f142843r = r2
                java.lang.Object r2 = r3.fetchItems(r4, r0)
                if (r2 != r1) goto L_0x0df2
                return r1
            L_0x0df2:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0df6:
                boolean r3 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.a.C17123c.C3478c
                if (r3 == 0) goto L_0x0e2b
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                com.sugarcube.decorate.v2.internal.ui.surface.a r4 = r0.f142845t
                com.sugarcube.decorate.v2.internal.ui.surface.a$c$c r4 = (com.sugarcube.decorate.v2.internal.ui.surface.a.C17123c.C3478c) r4
                com.sugarcube.core.network.models.RoomType r4 = r4.a()
                r0.f142844s = r2
                r0.f142828c = r9
                r0.f142829d = r5
                r0.f142830e = r2
                r0.f142831f = r6
                r0.f142832g = r7
                r0.f142833h = r8
                r0.f142838m = r13
                r0.f142839n = r13
                r0.f142840o = r13
                r0.f142841p = r13
                r0.f142842q = r13
                r2 = 22
                r0.f142843r = r2
                java.lang.Object r2 = r3.loadMore(r4, r0)
                if (r2 != r1) goto L_0x0e27
                return r1
            L_0x0e27:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0e2b:
                com.sugarcube.decorate.v2.internal.ui.surface.a$m r1 = com.sugarcube.decorate.v2.internal.ui.surface.a.C17133m.f142629a
                boolean r1 = kotlin.jvm.internal.C17542s.e(r9, r1)
                if (r1 == 0) goto L_0x0e80
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                TJ.B r1 = r1.h1()
                com.sugarcube.decorate.v2.internal.ui.surface.h r2 = r0.f142846u
                TJ.B r2 = r2.h1()
                java.lang.Object r2 = r2.getValue()
                r3 = r2
                OG.l0 r3 = (OG.l0) r3
                r31 = 134217471(0x7fffeff, float:3.8518009E-34)
                r32 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
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
                OG.l0 r2 = OG.l0.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
                r1.setValue(r2)
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0e80:
                com.sugarcube.decorate.v2.internal.ui.surface.a$X r1 = com.sugarcube.decorate.v2.internal.ui.surface.a.X.f142604a
                boolean r1 = kotlin.jvm.internal.C17542s.e(r9, r1)
                if (r1 == 0) goto L_0x0ee3
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                OG.u0 r2 = r1.Y0()
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                OG.u0 r3 = r3.Y0()
                nG.a$c r3 = r3.f()
                nG.a$c r5 = r3.a(r13)
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                OG.u0 r3 = r3.Y0()
                nG.a$a r3 = r3.d()
                nG.a$a r4 = r3.a(r13)
                r8 = 25
                r9 = 0
                r3 = 0
                r6 = 0
                r7 = 0
                OG.u0 r2 = OG.u0.b(r2, r3, r4, r5, r6, r7, r8, r9)
                r1.g2(r2)
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                nG.a r1 = r1.e1()
                boolean r2 = r1 instanceof nG.C17621a.c
                if (r2 == 0) goto L_0x0ecf
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                OG.u0 r2 = r1.Y0()
                nG.a$c r2 = r2.f()
                r1.k2(r2)
                goto L_0x0ee0
            L_0x0ecf:
                boolean r1 = r1 instanceof nG.C17621a.C3532a
                if (r1 == 0) goto L_0x0ee0
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                OG.u0 r2 = r1.Y0()
                nG.a$a r2 = r2.d()
                r1.k2(r2)
            L_0x0ee0:
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0f46
            L_0x0ee3:
                com.sugarcube.decorate.v2.internal.ui.surface.a$Y r1 = com.sugarcube.decorate.v2.internal.ui.surface.a.Y.f142605a
                boolean r1 = kotlin.jvm.internal.C17542s.e(r9, r1)
                if (r1 == 0) goto L_0x0f49
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                OG.u0 r2 = r1.Y0()
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                OG.u0 r3 = r3.Y0()
                nG.a$c r3 = r3.f()
                r4 = 1
                nG.a$c r5 = r3.a(r4)
                com.sugarcube.decorate.v2.internal.ui.surface.h r3 = r0.f142846u
                OG.u0 r3 = r3.Y0()
                nG.a$a r3 = r3.d()
                nG.a$a r4 = r3.a(r4)
                r8 = 25
                r9 = 0
                r3 = 0
                r6 = 0
                r7 = 0
                OG.u0 r2 = OG.u0.b(r2, r3, r4, r5, r6, r7, r8, r9)
                r1.g2(r2)
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                nG.a r1 = r1.e1()
                boolean r2 = r1 instanceof nG.C17621a.c
                if (r2 == 0) goto L_0x0f33
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                OG.u0 r2 = r1.Y0()
                nG.a$c r2 = r2.f()
                r1.k2(r2)
                goto L_0x0f44
            L_0x0f33:
                boolean r1 = r1 instanceof nG.C17621a.C3532a
                if (r1 == 0) goto L_0x0f44
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r0.f142846u
                OG.u0 r2 = r1.Y0()
                nG.a$a r2 = r2.d()
                r1.k2(r2)
            L_0x0f44:
                XH.N r1 = XH.C16807N.f139792a
            L_0x0f46:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            L_0x0f49:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.C17153g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$handleSelection$2", f = "DecorateSurfaceFragmentViewModel.kt", l = {749}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.h$h  reason: collision with other inner class name */
    static final class C3481h extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f142847c;

        /* renamed from: d  reason: collision with root package name */
        Object f142848d;

        /* renamed from: e  reason: collision with root package name */
        Object f142849e;

        /* renamed from: f  reason: collision with root package name */
        Object f142850f;

        /* renamed from: g  reason: collision with root package name */
        Object f142851g;

        /* renamed from: h  reason: collision with root package name */
        int f142852h;

        /* renamed from: i  reason: collision with root package name */
        boolean f142853i;

        /* renamed from: j  reason: collision with root package name */
        int f142854j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ h f142855k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3481h(h hVar, C17164e<? super C3481h> eVar) {
            super(2, eVar);
            this.f142855k = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3481h(this.f142855k, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3481h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            h hVar;
            Map<String, VariantType> variants;
            boolean z10;
            C17597b e10;
            Object f10 = C17187b.f();
            int i10 = this.f142854j;
            boolean z11 = false;
            if (i10 == 0) {
                XH.y.b(obj);
                if (this.f142855k.b1() == null) {
                    n0.c(this.f142855k.h1());
                }
                n0.a(this.f142855k.h1());
                n0.b(this.f142855k.h1());
                v0 b12 = this.f142855k.b1();
                if (!(b12 == null || (e10 = b12.e()) == null)) {
                    h hVar2 = this.f142855k;
                    hVar2.h1().setValue(l0.b((l0) hVar2.h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217695, (Object) null));
                    boolean e11 = C17542s.e(e10.e().d().getHasGoesWell(), b.a(true));
                    if (!e11 && (hVar2.e1() instanceof C17621a.C3532a)) {
                        hVar2.k2((C17621a) null);
                    }
                    hVar2.f142678s.j0(e10.e().d());
                    RF.r V10 = hVar2.f142681v;
                    int d10 = e10.d();
                    this.f142847c = b12;
                    this.f142848d = e10;
                    this.f142849e = e10;
                    this.f142850f = hVar2;
                    this.f142851g = e10;
                    this.f142852h = 0;
                    this.f142853i = e11;
                    this.f142854j = 1;
                    obj2 = V10.a(d10, this);
                    if (obj2 == f10) {
                        return f10;
                    }
                    hVar = hVar2;
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                C17597b bVar = (C17597b) this.f142851g;
                hVar = (h) this.f142850f;
                C17597b bVar2 = (C17597b) this.f142849e;
                C17597b bVar3 = (C17597b) this.f142848d;
                v0 v0Var = (v0) this.f142847c;
                XH.y.b(obj);
                obj2 = ((XH.x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (XH.x.h(obj2)) {
                if (XH.x.g(obj2)) {
                    obj2 = null;
                }
                CatalogItemVariants catalogItemVariants = (CatalogItemVariants) obj2;
                if (catalogItemVariants != null && (variants = catalogItemVariants.getVariants()) != null && !variants.isEmpty()) {
                    Iterator<Map.Entry<String, VariantType>> it = variants.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            List<VariantValue> values = ((VariantType) it.next().getValue()).getValues();
                            if ((values != null ? values.size() : 0) > 1) {
                                z10 = true;
                                continue;
                            } else {
                                z10 = false;
                                continue;
                            }
                            if (z10) {
                                z11 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                v0 b13 = hVar.b1();
                hVar.j2(b13 != null ? v0.b(b13, (C17597b) null, z11, 1, (Object) null) : null);
                if (z11 && ((hVar.e1() instanceof C17621a.d) || hVar.e1() == null)) {
                    hVar.k2(hVar.Y0().g());
                } else if (hVar.e1() instanceof C17621a.d) {
                    hVar.k2((C17621a) null);
                }
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/sugarcube/decorate/v2/internal/ui/surface/h$i", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f142856a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f142857b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(N.a aVar, h hVar, boolean z10) {
            super(aVar);
            this.f142856a = hVar;
            this.f142857b = z10;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Priority priority = Priority.ERROR;
            String message = th2.getMessage();
            String str = "";
            if (message == null) {
                message = str;
            }
            String b10 = C16816g.b(th2);
            if (b10 != null) {
                str = b10;
            }
            int i10 = NG.m.f136491a[priority.ordinal()];
            if (i10 == 1) {
                Log.v(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 2) {
                Log.d(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 3) {
                Log.i(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 4) {
                Log.w(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 5) {
                Log.e(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else {
                throw new XH.t();
            }
            n0.g(this.f142856a.h1(), new C15930a.b(new UiText.CompositeResource(OE.n.f113336b5, (List) null, 2, (DefaultConstructorMarker) null), this.f142857b));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$launch$2", f = "DecorateSurfaceFragmentViewModel.kt", l = {1298}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142858c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f142859d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ nI.p<Q, C17164e<? super C16807N>, Object> f142860e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(nI.p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f142860e = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(this.f142860e, eVar);
            jVar.f142859d = obj;
            return jVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142858c;
            if (i10 == 0) {
                XH.y.b(obj);
                Q q10 = (Q) this.f142859d;
                nI.p<Q, C17164e<? super C16807N>, Object> pVar = this.f142860e;
                this.f142859d = q10;
                this.f142858c = 1;
                if (pVar.invoke(q10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Q q11 = (Q) this.f142859d;
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/sugarcube/decorate/v2/internal/ui/surface/h$k", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f142861a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(N.a aVar, h hVar) {
            super(aVar);
            this.f142861a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Priority priority = Priority.ERROR;
            String message = th2.getMessage();
            String str = "";
            if (message == null) {
                message = str;
            }
            String b10 = C16816g.b(th2);
            if (b10 != null) {
                str = b10;
            }
            int i10 = NG.n.f136492a[priority.ordinal()];
            if (i10 == 1) {
                Log.v(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 2) {
                Log.d(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 3) {
                Log.i(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 4) {
                Log.w(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 5) {
                Log.e(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else {
                throw new XH.t();
            }
            n0.g(this.f142861a.h1(), new C15930a.b(new UiText.CompositeResource(OE.n.f113336b5, (List) null, 2, (DefaultConstructorMarker) null), false));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$launchBackground$2", f = "DecorateSurfaceFragmentViewModel.kt", l = {1314}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142862c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f142863d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ nI.p<Q, C17164e<? super C16807N>, Object> f142864e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(nI.p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f142864e = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            l lVar = new l(this.f142864e, eVar);
            lVar.f142863d = obj;
            return lVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142862c;
            if (i10 == 0) {
                XH.y.b(obj);
                Q q10 = (Q) this.f142863d;
                nI.p<Q, C17164e<? super C16807N>, Object> pVar = this.f142864e;
                this.f142863d = q10;
                this.f142862c = 1;
                if (pVar.invoke(q10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Q q11 = (Q) this.f142863d;
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$observeChanges$1", f = "DecorateSurfaceFragmentViewModel.kt", l = {372}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142865c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f142866d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f142867a;

            a(h hVar) {
                this.f142867a = hVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                if (z10) {
                    this.f142867a.f142664P.J(b.a(true));
                }
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(h hVar, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f142866d = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new m(this.f142866d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((m) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142865c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16519P<Boolean> isLoggedIn = this.f142866d.f142676q.isLoggedIn();
                a aVar = new a(this.f142866d);
                this.f142865c = 1;
                if (isLoggedIn.collect(aVar, this) == f10) {
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
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$observeChanges$2", f = "DecorateSurfaceFragmentViewModel.kt", l = {379}, m = "invokeSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142868c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f142869d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f142870a;

            a(h hVar) {
                this.f142870a = hVar;
            }

            /* renamed from: c */
            public final Object emit(List<String> list, C17164e<? super C16807N> eVar) {
                this.f142870a.h1().setValue(l0.b((l0) this.f142870a.h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, C15985a.h(list), (C15987c) null, false, 117440511, (Object) null));
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(h hVar, C17164e<? super n> eVar) {
            super(2, eVar);
            this.f142869d = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new n(this.f142869d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((n) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142868c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<List<String>> invoke = this.f142869d.f142680u.invoke();
                a aVar = new a(this.f142869d);
                this.f142868c = 1;
                if (invoke.collect(aVar, this) == f10) {
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
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$observeChanges$3", f = "DecorateSurfaceFragmentViewModel.kt", l = {386, 387, 388, 389}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f142871c;

        /* renamed from: d  reason: collision with root package name */
        Object f142872d;

        /* renamed from: e  reason: collision with root package name */
        Object f142873e;

        /* renamed from: f  reason: collision with root package name */
        int f142874f;

        /* renamed from: g  reason: collision with root package name */
        int f142875g;

        /* renamed from: h  reason: collision with root package name */
        boolean f142876h;

        /* renamed from: i  reason: collision with root package name */
        boolean f142877i;

        /* renamed from: j  reason: collision with root package name */
        boolean f142878j;

        /* renamed from: k  reason: collision with root package name */
        int f142879k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ h f142880l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(h hVar, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f142880l = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new o(this.f142880l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((o) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00fb A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0124 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0125  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x012d  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x012f  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0134  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r43) {
            /*
                r42 = this;
                r0 = r42
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f142879k
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L_0x007e
                if (r2 == r7) goto L_0x006a
                if (r2 == r5) goto L_0x0053
                if (r2 == r4) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                int r1 = r0.f142875g
                int r2 = r0.f142874f
                boolean r3 = r0.f142878j
                boolean r4 = r0.f142877i
                boolean r5 = r0.f142876h
                java.lang.Object r8 = r0.f142872d
                OG.l0 r8 = (OG.l0) r8
                java.lang.Object r9 = r0.f142871c
                TJ.B r9 = (TJ.C16505B) r9
                XH.y.b(r43)
                r11 = r3
                r12 = r8
                r3 = r43
                goto L_0x012b
            L_0x0032:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003a:
                int r2 = r0.f142875g
                int r4 = r0.f142874f
                boolean r5 = r0.f142877i
                boolean r8 = r0.f142876h
                java.lang.Object r9 = r0.f142872d
                OG.l0 r9 = (OG.l0) r9
                java.lang.Object r10 = r0.f142871c
                TJ.B r10 = (TJ.C16505B) r10
                XH.y.b(r43)
                r12 = r8
                r8 = r4
                r4 = r43
                goto L_0x00fd
            L_0x0053:
                int r2 = r0.f142875g
                int r5 = r0.f142874f
                boolean r8 = r0.f142876h
                java.lang.Object r9 = r0.f142872d
                OG.l0 r9 = (OG.l0) r9
                java.lang.Object r10 = r0.f142871c
                TJ.B r10 = (TJ.C16505B) r10
                XH.y.b(r43)
                r12 = r8
                r8 = r5
                r5 = r43
                goto L_0x00d6
            L_0x006a:
                int r2 = r0.f142875g
                int r8 = r0.f142874f
                java.lang.Object r9 = r0.f142872d
                OG.l0 r9 = (OG.l0) r9
                java.lang.Object r10 = r0.f142871c
                TJ.B r10 = (TJ.C16505B) r10
                XH.y.b(r43)
                r11 = r10
                r10 = r9
                r9 = r43
                goto L_0x00b0
            L_0x007e:
                XH.y.b(r43)
                com.sugarcube.decorate.v2.internal.ui.surface.h r2 = r0.f142880l
                TJ.B r2 = r2.h1()
                com.sugarcube.decorate.v2.internal.ui.surface.h r8 = r0.f142880l
                TJ.B r8 = r8.h1()
                java.lang.Object r8 = r8.getValue()
                OG.l0 r8 = (OG.l0) r8
                com.sugarcube.decorate.v2.internal.ui.surface.h r9 = r0.f142880l
                com.sugarcube.app.base.data.feature.ConfigRepository r9 = r9.f142675p
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableFavorites r10 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableFavorites.INSTANCE
                r0.f142871c = r2
                r0.f142872d = r8
                r0.f142874f = r6
                r0.f142875g = r6
                r0.f142879k = r7
                java.lang.Object r9 = r9.get(r10, r0)
                if (r9 != r1) goto L_0x00ac
                return r1
            L_0x00ac:
                r11 = r2
                r2 = r6
                r10 = r8
                r8 = r2
            L_0x00b0:
                r12 = r9
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                com.sugarcube.decorate.v2.internal.ui.surface.h r13 = r0.f142880l
                com.sugarcube.app.base.data.feature.ConfigRepository r13 = r13.f142675p
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableHelaWallColorPicker r14 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableHelaWallColorPicker.INSTANCE
                r0.f142871c = r11
                r0.f142872d = r10
                r0.f142873e = r9
                r0.f142876h = r12
                r0.f142874f = r8
                r0.f142875g = r2
                r0.f142879k = r5
                java.lang.Object r5 = r13.get(r14, r0)
                if (r5 != r1) goto L_0x00d4
                return r1
            L_0x00d4:
                r9 = r10
                r10 = r11
            L_0x00d6:
                r11 = r5
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                com.sugarcube.decorate.v2.internal.ui.surface.h r13 = r0.f142880l
                com.sugarcube.app.base.data.feature.ConfigRepository r13 = r13.f142675p
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableGLTFScenes r14 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableGLTFScenes.INSTANCE
                r0.f142871c = r10
                r0.f142872d = r9
                r0.f142873e = r5
                r0.f142876h = r12
                r0.f142877i = r11
                r0.f142874f = r8
                r0.f142875g = r2
                r0.f142879k = r4
                java.lang.Object r4 = r13.get(r14, r0)
                if (r4 != r1) goto L_0x00fc
                return r1
            L_0x00fc:
                r5 = r11
            L_0x00fd:
                r11 = r4
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                com.sugarcube.decorate.v2.internal.ui.surface.h r13 = r0.f142880l
                com.sugarcube.app.base.data.feature.ConfigRepository r13 = r13.f142675p
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableDuplicateItems r14 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableDuplicateItems.INSTANCE
                r0.f142871c = r10
                r0.f142872d = r9
                r0.f142873e = r4
                r0.f142876h = r12
                r0.f142877i = r5
                r0.f142878j = r11
                r0.f142874f = r8
                r0.f142875g = r2
                r0.f142879k = r3
                java.lang.Object r3 = r13.get(r14, r0)
                if (r3 != r1) goto L_0x0125
                return r1
            L_0x0125:
                r1 = r2
                r4 = r5
                r2 = r8
                r5 = r12
                r12 = r9
                r9 = r10
            L_0x012b:
                if (r2 == 0) goto L_0x012f
                r13 = r7
                goto L_0x0130
            L_0x012f:
                r13 = r6
            L_0x0130:
                if (r1 == 0) goto L_0x0134
                r14 = r7
                goto L_0x0135
            L_0x0134:
                r14 = r6
            L_0x0135:
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r1 = r3.booleanValue()
                OG.s0 r15 = new OG.s0
                r15.<init>(r4, r5, r11, r1)
                r40 = 134217723(0x7fffffb, float:3.8518587E-34)
                r41 = 0
                r16 = 0
                r17 = 0
                r18 = 0
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
                r39 = 0
                OG.l0 r1 = OG.l0.b(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
                r9.setValue(r1)
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$onExit$2", f = "DecorateSurfaceFragmentViewModel.kt", l = {876}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142881c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f142882d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(h hVar, C17164e<? super p> eVar) {
            super(1, eVar);
            this.f142882d = hVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new p(this.f142882d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((p) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142881c;
            if (i10 == 0) {
                XH.y.b(obj);
                h hVar = this.f142882d;
                this.f142881c = 1;
                if (hVar.T0(this) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {1049}, m = "onFeedbackDismissed")
    static final class q extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142883c;

        /* renamed from: d  reason: collision with root package name */
        Object f142884d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f142885e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h f142886f;

        /* renamed from: g  reason: collision with root package name */
        int f142887g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(h hVar, C17164e<? super q> eVar) {
            super(eVar);
            this.f142886f = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142885e = obj;
            this.f142887g |= Integer.MIN_VALUE;
            return this.f142886f.w1(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {1041, 1044}, m = "onFeedbackProvided")
    static final class r extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142888c;

        /* renamed from: d  reason: collision with root package name */
        Object f142889d;

        /* renamed from: e  reason: collision with root package name */
        int f142890e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f142891f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f142892g;

        /* renamed from: h  reason: collision with root package name */
        int f142893h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(h hVar, C17164e<? super r> eVar) {
            super(eVar);
            this.f142892g = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142891f = obj;
            this.f142893h |= Integer.MIN_VALUE;
            return this.f142892g.x1(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {1028}, m = "onGoesWellWithSelected")
    static final class s extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142894c;

        /* renamed from: d  reason: collision with root package name */
        Object f142895d;

        /* renamed from: e  reason: collision with root package name */
        Object f142896e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f142897f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f142898g;

        /* renamed from: h  reason: collision with root package name */
        int f142899h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(h hVar, C17164e<? super s> eVar) {
            super(eVar);
            this.f142898g = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142897f = obj;
            this.f142899h |= Integer.MIN_VALUE;
            return this.f142898g.z1((CachedCatalogItem) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {899}, m = "onItemListItemSelect")
    static final class t extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142900c;

        /* renamed from: d  reason: collision with root package name */
        Object f142901d;

        /* renamed from: e  reason: collision with root package name */
        Object f142902e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f142903f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f142904g;

        /* renamed from: h  reason: collision with root package name */
        int f142905h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(h hVar, C17164e<? super t> eVar) {
            super(eVar);
            this.f142904g = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142903f = obj;
            this.f142905h |= Integer.MIN_VALUE;
            return this.f142904g.E1((RF.k) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {1020}, m = "onItemSwapped")
    static final class u extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142906c;

        /* renamed from: d  reason: collision with root package name */
        Object f142907d;

        /* renamed from: e  reason: collision with root package name */
        Object f142908e;

        /* renamed from: f  reason: collision with root package name */
        Object f142909f;

        /* renamed from: g  reason: collision with root package name */
        Object f142910g;

        /* renamed from: h  reason: collision with root package name */
        Object f142911h;

        /* renamed from: i  reason: collision with root package name */
        Object f142912i;

        /* renamed from: j  reason: collision with root package name */
        int f142913j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f142914k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ h f142915l;

        /* renamed from: m  reason: collision with root package name */
        int f142916m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(h hVar, C17164e<? super u> eVar) {
            super(eVar);
            this.f142915l = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142914k = obj;
            this.f142916m |= Integer.MIN_VALUE;
            return this.f142915l.F1((CachedCatalogItem) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {795, 798}, m = "onProductSelected")
    static final class v extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142917c;

        /* renamed from: d  reason: collision with root package name */
        Object f142918d;

        /* renamed from: e  reason: collision with root package name */
        Object f142919e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f142920f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f142921g;

        /* renamed from: h  reason: collision with root package name */
        int f142922h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(h hVar, C17164e<? super v> eVar) {
            super(eVar);
            this.f142921g = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142920f = obj;
            this.f142922h |= Integer.MIN_VALUE;
            return this.f142921g.M1((CachedCatalogItem) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$onSave$2", f = "DecorateSurfaceFragmentViewModel.kt", l = {881}, m = "invokeSuspend")
    static final class w extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142923c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f142924d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(h hVar, C17164e<? super w> eVar) {
            super(1, eVar);
            this.f142924d = hVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new w(this.f142924d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((w) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142923c;
            if (i10 == 0) {
                XH.y.b(obj);
                h hVar = this.f142924d;
                this.f142923c = 1;
                if (hVar.d2(this) == f10) {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$onShare$2", f = "DecorateSurfaceFragmentViewModel.kt", l = {888, 890}, m = "invokeSuspend")
    static final class x extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f142925c;

        /* renamed from: d  reason: collision with root package name */
        int f142926d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f142927e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$onShare$2$1", f = "DecorateSurfaceFragmentViewModel.kt", l = {888}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f142928c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h f142929d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar, C17164e<? super a> eVar) {
                super(1, eVar);
                this.f142929d = hVar;
            }

            public final C17164e<C16807N> create(C17164e<?> eVar) {
                return new a(this.f142929d, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C17164e<? super C16807N> eVar) {
                return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f142928c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    h hVar = this.f142929d;
                    this.f142928c = 1;
                    if (hVar.d2(this) == f10) {
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
        x(h hVar, C17164e<? super x> eVar) {
            super(1, eVar);
            this.f142927e = hVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new x(this.f142927e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((x) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            K k10;
            Object f10 = C17187b.f();
            int i10 = this.f142926d;
            if (i10 == 0) {
                XH.y.b(obj);
                if (((l0) this.f142927e.h1().getValue()).y()) {
                    this.f142927e.f142678s.T(Design.Menu.Save);
                    h hVar = this.f142927e;
                    C16219E.e eVar = C16219E.e.SAVE;
                    a aVar = new a(hVar, (C17164e<? super a>) null);
                    this.f142926d = 1;
                    if (h.c2(hVar, eVar, false, aVar, this, 2, (Object) null) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else if (i10 == 2) {
                k10 = (K) this.f142925c;
                XH.y.b(obj);
                k10.postValue(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            K W10 = this.f142927e.f142659K;
            ShareDesignUseCase R10 = this.f142927e.f142679t;
            UUID d10 = this.f142927e.Z0().d();
            this.f142925c = W10;
            this.f142926d = 2;
            Object invoke = R10.invoke(d10, this);
            if (invoke == f10) {
                return f10;
            }
            k10 = W10;
            obj = invoke;
            k10.postValue(obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel", f = "DecorateSurfaceFragmentViewModel.kt", l = {972}, m = "onVariantSelected")
    static final class y extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142930c;

        /* renamed from: d  reason: collision with root package name */
        Object f142931d;

        /* renamed from: e  reason: collision with root package name */
        Object f142932e;

        /* renamed from: f  reason: collision with root package name */
        Object f142933f;

        /* renamed from: g  reason: collision with root package name */
        Object f142934g;

        /* renamed from: h  reason: collision with root package name */
        boolean f142935h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f142936i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h f142937j;

        /* renamed from: k  reason: collision with root package name */
        int f142938k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(h hVar, C17164e<? super y> eVar) {
            super(eVar);
            this.f142937j = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142936i = obj;
            this.f142938k |= Integer.MIN_VALUE;
            return this.f142937j.V1((CachedCatalogItem) null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragmentViewModel$onVariantSelected$2$1", f = "DecorateSurfaceFragmentViewModel.kt", l = {956}, m = "invokeSuspend")
    static final class z extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142939c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f142940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(h hVar, C17164e<? super z> eVar) {
            super(2, eVar);
            this.f142940d = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new z(this.f142940d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((z) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142939c;
            if (i10 == 0) {
                XH.y.b(obj);
                EngineToolbarInteractions T10 = this.f142940d.f142656H;
                this.f142939c = 1;
                if (T10.restorePreviouslySelectedVariant(this) == f10) {
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

    public h(EngineManagerImpl engineManagerImpl, SceneLoadingManager sceneLoadingManager, CatalogRepository catalogRepository, ConfigRepository configRepository, UserRepo userRepo, CompositionUpdater compositionUpdater, C17318v vVar, ShareDesignUseCase shareDesignUseCase, FetchShoppingListItemsUseCase fetchShoppingListItemsUseCase, RF.r rVar, C16005b bVar, CartUseCase cartUseCase, RF.p pVar, SaveDesignUseCase saveDesignUseCase, U u10, @DecorationScope Q q10, @DecorationScope Q q11, ArgumentParser argumentParser, BrowseViewModel browseViewModel, VariantsViewModel variantsViewModel, C16093b bVar2) {
        EngineManagerImpl engineManagerImpl2 = engineManagerImpl;
        SceneLoadingManager sceneLoadingManager2 = sceneLoadingManager;
        CatalogRepository catalogRepository2 = catalogRepository;
        ConfigRepository configRepository2 = configRepository;
        UserRepo userRepo2 = userRepo;
        CompositionUpdater compositionUpdater2 = compositionUpdater;
        C17318v vVar2 = vVar;
        ShareDesignUseCase shareDesignUseCase2 = shareDesignUseCase;
        FetchShoppingListItemsUseCase fetchShoppingListItemsUseCase2 = fetchShoppingListItemsUseCase;
        RF.r rVar2 = rVar;
        C16005b bVar3 = bVar;
        CartUseCase cartUseCase2 = cartUseCase;
        RF.p pVar2 = pVar;
        SaveDesignUseCase saveDesignUseCase2 = saveDesignUseCase;
        Q q12 = q10;
        C17542s.j(engineManagerImpl2, "engineManager");
        C17542s.j(sceneLoadingManager2, "sceneLoadingManager");
        C17542s.j(catalogRepository2, "catalogRepository");
        C17542s.j(configRepository2, "configRepository");
        C17542s.j(userRepo2, "userRepository");
        C17542s.j(compositionUpdater2, "compositionUpdater");
        C17542s.j(vVar2, "decorateAnalytics");
        C17542s.j(shareDesignUseCase2, "shareDesignUseCase");
        C17542s.j(fetchShoppingListItemsUseCase2, "fetchShoppingListItemsUseCase");
        C17542s.j(rVar2, "variantsUseCase");
        C17542s.j(bVar3, "ratingUseCase");
        C17542s.j(cartUseCase2, "cartUseCase");
        C17542s.j(pVar2, "smartaPlacementUseCase");
        C17542s.j(saveDesignUseCase2, "saveDesignUseCase");
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(q10, "decorateScope");
        C17542s.j(q11, "backgroundScope");
        C17542s.j(argumentParser, "argumentParser");
        C17542s.j(browseViewModel, "browseViewModel");
        C17542s.j(variantsViewModel, "variantsViewModel");
        C17542s.j(bVar2, "stateHolder");
        this.f142672m = engineManagerImpl2;
        this.f142673n = sceneLoadingManager2;
        this.f142674o = catalogRepository2;
        this.f142675p = configRepository2;
        this.f142676q = userRepo2;
        this.f142677r = compositionUpdater2;
        this.f142678s = vVar2;
        this.f142679t = shareDesignUseCase2;
        this.f142680u = fetchShoppingListItemsUseCase2;
        this.f142681v = rVar2;
        this.f142682w = bVar3;
        this.f142683x = cartUseCase2;
        this.f142684y = pVar2;
        this.f142685z = saveDesignUseCase2;
        this.f142649A = u10;
        this.f142650B = q10;
        this.f142651C = q11;
        this.f142652D = argumentParser;
        this.f142653E = browseViewModel;
        this.f142654F = variantsViewModel;
        this.f142655G = bVar2;
        this.f142656H = engineManagerImpl2;
        this.f142657I = engineManagerImpl2;
        this.f142658J = engineManagerImpl2;
        K<Intent> k10 = new K<>(null);
        this.f142659K = k10;
        this.f142660L = k10;
        K<String> k11 = new K<>();
        this.f142661M = k11;
        this.f142662N = k11;
        C17149c cVar = new C17149c(this);
        this.f142669U = cVar;
        engineManagerImpl2.a0(cVar);
        n1();
        k1(true, new C17147a(this, (C17164e<? super C17147a>) null));
    }

    /* access modifiers changed from: private */
    public final void A1() {
        C17621a.C3532a d10 = e1() instanceof C17621a.C3532a ? null : Y0().d();
        k2(d10);
        if (d10 != null) {
            this.f142678s.T(Design.Menu.GoesWellWith);
        }
    }

    /* access modifiers changed from: private */
    public final void B1() {
        h1().setValue(l0.b(h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217695, (Object) null));
    }

    /* access modifiers changed from: private */
    public final void C1() {
        h1().setValue(l0.b(h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, true, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217663, (Object) null));
    }

    /* access modifiers changed from: private */
    public final void D1() {
        h1().setValue(l0.b(h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217663, (Object) null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object E1(RF.k r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.t
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.sugarcube.decorate.v2.internal.ui.surface.h$t r0 = (com.sugarcube.decorate.v2.internal.ui.surface.h.t) r0
            int r1 = r0.f142905h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142905h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v2.internal.ui.surface.h$t r0 = new com.sugarcube.decorate.v2.internal.ui.surface.h$t
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f142903f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142905h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f142902e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f142901d
            RF.k r6 = (RF.k) r6
            java.lang.Object r7 = r0.f142900c
            com.sugarcube.decorate.v2.internal.ui.surface.h r7 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r7
            XH.y.b(r1)
            goto L_0x0052
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r1 = r5.f142672m
            r0.f142900c = r5
            r0.f142901d = r6
            r0.f142902e = r7
            r0.f142905h = r4
            java.lang.Object r7 = r1.selectInstance(r6, r0)
            if (r7 != r2) goto L_0x0051
            return r2
        L_0x0051:
            r7 = r5
        L_0x0052:
            hG.v r7 = r7.f142678s
            com.sugarcube.app.base.data.database.CachedCatalogItem r6 = r6.d()
            r7.S(r6)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.E1(RF.k, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F1(com.sugarcube.app.base.data.database.CachedCatalogItem r17, dI.C17164e<? super XH.C16807N> r18) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            r1 = r18
            boolean r3 = r1 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.u
            if (r3 == 0) goto L_0x001a
            r3 = r1
            com.sugarcube.decorate.v2.internal.ui.surface.h$u r3 = (com.sugarcube.decorate.v2.internal.ui.surface.h.u) r3
            int r4 = r3.f142916m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.f142916m = r4
        L_0x0018:
            r4 = r3
            goto L_0x0020
        L_0x001a:
            com.sugarcube.decorate.v2.internal.ui.surface.h$u r3 = new com.sugarcube.decorate.v2.internal.ui.surface.h$u
            r3.<init>(r0, r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r3 = r4.f142914k
            java.lang.Object r7 = eI.C17187b.f()
            int r5 = r4.f142916m
            r6 = 1
            if (r5 == 0) goto L_0x0055
            if (r5 != r6) goto L_0x004d
            java.lang.Object r1 = r4.f142912i
            com.sugarcube.app.base.data.database.CachedCatalogItem r1 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r1
            java.lang.Object r2 = r4.f142911h
            mG.b r2 = (mG.C17597b) r2
            java.lang.Object r2 = r4.f142910g
            mG.b r2 = (mG.C17597b) r2
            java.lang.Object r2 = r4.f142909f
            mG.b r2 = (mG.C17597b) r2
            java.lang.Object r2 = r4.f142908e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r4.f142907d
            com.sugarcube.app.base.data.database.CachedCatalogItem r2 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r2
            java.lang.Object r2 = r4.f142906c
            com.sugarcube.decorate.v2.internal.ui.surface.h r2 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r2
            XH.y.b(r3)
            goto L_0x00ba
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0055:
            XH.y.b(r3)
            OG.u0 r3 = r16.Y0()
            nG.a$c r3 = r3.f()
            r5 = 0
            nG.a$c r3 = r3.a(r5)
            r0.k2(r3)
            mG.b r3 = r16.a1()
            if (r3 == 0) goto L_0x00c9
            RF.k r8 = r3.e()
            com.sugarcube.app.base.data.database.CachedCatalogItem r15 = r8.d()
            int r9 = r17.getId()
            RF.k r8 = r3.e()
            RF.k r10 = r3.e()
            com.sugarcube.decorate_engine.ObjectInstanceId r10 = r10.f()
            RF.k r10 = r8.a(r10, r2)
            r13 = 12
            r14 = 0
            r11 = 0
            r12 = 0
            r8 = r3
            mG.b r8 = mG.C17597b.b(r8, r9, r10, r11, r12, r13, r14)
            r0.i2(r8)
            com.sugarcube.decorate.v2.internal.manager.engine.EngineToolbarInteractions r8 = r0.f142656H
            r4.f142906c = r0
            r4.f142907d = r2
            r4.f142908e = r1
            r4.f142909f = r3
            r4.f142910g = r3
            r4.f142911h = r3
            r4.f142912i = r15
            r4.f142913j = r5
            r4.f142916m = r6
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            r2 = r17
            java.lang.Object r3 = com.sugarcube.decorate.v2.internal.manager.engine.EngineToolbarInteractions.a.a(r1, r2, r3, r4, r5, r6)
            if (r3 != r7) goto L_0x00b8
            return r7
        L_0x00b8:
            r2 = r0
            r1 = r15
        L_0x00ba:
            iG.j r3 = (iG.C17353j) r3
            hG.v r2 = r2.f142678s
            o1.g r4 = r3.b()
            o1.g r3 = r3.a()
            r2.h0(r1, r4, r3)
        L_0x00c9:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.F1(com.sugarcube.app.base.data.database.CachedCatalogItem, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void G1() {
        this.f142656H.mirrorSelectedItem();
        this.f142678s.V();
    }

    /* access modifiers changed from: private */
    public final void I1() {
        this.f142656H.focusOnSelectedItem();
        this.f142678s.X(MethodType.Button);
    }

    /* access modifiers changed from: private */
    public final void J1() {
        this.f142656H.unFocusSelectedItem();
        this.f142678s.O(MethodType.Button);
    }

    /* access modifiers changed from: private */
    public final void L1() {
        C17621a.b e10 = e1() instanceof C17621a.b ? null : Y0().e();
        k2(e10);
        if (e10 != null) {
            this.f142678s.T(Design.Menu.Info);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: dI.e<? super XH.N>} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object M1(com.sugarcube.app.base.data.database.CachedCatalogItem r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.v
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.sugarcube.decorate.v2.internal.ui.surface.h$v r0 = (com.sugarcube.decorate.v2.internal.ui.surface.h.v) r0
            int r1 = r0.f142922h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142922h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v2.internal.ui.surface.h$v r0 = new com.sugarcube.decorate.v2.internal.ui.surface.h$v
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f142920f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142922h
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0051
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r7 = r0.f142919e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f142918d
            com.sugarcube.app.base.data.database.CachedCatalogItem r7 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r7
            java.lang.Object r7 = r0.f142917c
            com.sugarcube.decorate.v2.internal.ui.surface.h r7 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r7
            XH.y.b(r1)
            goto L_0x0083
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            java.lang.Object r7 = r0.f142919e
            r8 = r7
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r7 = r0.f142918d
            com.sugarcube.app.base.data.database.CachedCatalogItem r7 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r7
            java.lang.Object r3 = r0.f142917c
            com.sugarcube.decorate.v2.internal.ui.surface.h r3 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r3
            XH.y.b(r1)
            goto L_0x006f
        L_0x0051:
            XH.y.b(r1)
            r1 = 0
            r6.k2(r1)
            r6.e2(r1)
            kG.c r1 = r6.Z0()
            r0.f142917c = r6
            r0.f142918d = r7
            r0.f142919e = r8
            r0.f142922h = r5
            java.lang.Object r1 = r6.a2(r1, r7, r0)
            if (r1 != r2) goto L_0x006e
            return r2
        L_0x006e:
            r3 = r6
        L_0x006f:
            hG.v r1 = r3.f142678s
            r1.Z(r7)
            r0.f142917c = r3
            r0.f142918d = r7
            r0.f142919e = r8
            r0.f142922h = r4
            java.lang.Object r7 = r3.m2(r0)
            if (r7 != r2) goto L_0x0083
            return r2
        L_0x0083:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.M1(com.sugarcube.app.base.data.database.CachedCatalogItem, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void N1() {
        this.f142678s.T(Design.Menu.Rotate);
        n0.h(h1());
    }

    /* access modifiers changed from: private */
    public final void O1() {
        n0.b(h1());
    }

    /* access modifiers changed from: private */
    public final Object P1(C17164e<? super C16807N> eVar) {
        this.f142678s.T(Design.Menu.Save);
        Object b22 = b2(C16219E.e.SAVE, true, new w(this, (C17164e<? super w>) null), eVar);
        return b22 == C17187b.f() ? b22 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void Q1(a.d0 d0Var) {
        this.f142657I.setViewport(d0Var.a().a());
        C16505B<l0> h12 = h1();
        l0 value = h1().getValue();
        C16653f o10 = h1().getValue().o();
        h12.setValue(l0.b(value, false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, o10 != null ? C16653f.b(o10, (C15987c) null, d0Var.a().a().b(), 1, (Object) null) : null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217471, (Object) null));
        this.f142678s.B(d0Var.a().a());
    }

    /* access modifiers changed from: private */
    public static final V2 R0(h hVar) {
        return hVar.f142652D.parse(hVar.f142649A);
    }

    /* access modifiers changed from: private */
    public final Object R1(C17164e<? super C16807N> eVar) {
        Object b22 = b2(C16219E.e.SHARE, true, new x(this, (C17164e<? super x>) null), eVar);
        return b22 == C17187b.f() ? b22 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object S0(dI.C17164e<? super XH.C16807N> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.C17148b
            if (r0 == 0) goto L_0x0014
            r0 = r14
            com.sugarcube.decorate.v2.internal.ui.surface.h$b r0 = (com.sugarcube.decorate.v2.internal.ui.surface.h.C17148b) r0
            int r1 = r0.f142794l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f142794l = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.decorate.v2.internal.ui.surface.h$b r0 = new com.sugarcube.decorate.v2.internal.ui.surface.h$b
            r0.<init>(r13, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r4.f142792j
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r4.f142794l
            r8 = 1
            r2 = 2
            if (r1 == 0) goto L_0x0063
            if (r1 == r8) goto L_0x004b
            if (r1 != r2) goto L_0x0043
            int r14 = r4.f142791i
            java.lang.Object r1 = r4.f142787e
            kotlin.jvm.internal.K r1 = (kotlin.jvm.internal.K) r1
            java.lang.Object r2 = r4.f142786d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r4.f142785c
            com.sugarcube.decorate.v2.internal.ui.surface.h r2 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r2
            XH.y.b(r0)
            XH.x r0 = (XH.x) r0
            java.lang.Object r0 = r0.j()
            goto L_0x023f
        L_0x0043:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x004b:
            int r14 = r4.f142791i
            java.lang.Object r1 = r4.f142787e
            kotlin.jvm.internal.K r1 = (kotlin.jvm.internal.K) r1
            java.lang.Object r3 = r4.f142786d
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r3 = r4.f142785c
            com.sugarcube.decorate.v2.internal.ui.surface.h r3 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r3
            XH.y.b(r0)
            XH.x r0 = (XH.x) r0
            java.lang.Object r0 = r0.j()
            goto L_0x00cb
        L_0x0063:
            XH.y.b(r0)
            TJ.B r0 = r13.h1()
            java.lang.Object r0 = r0.getValue()
            OG.l0 r0 = (OG.l0) r0
            boolean r0 = r0.y()
            TJ.B r1 = r13.h1()
            java.lang.Object r1 = r1.getValue()
            OG.l0 r1 = (OG.l0) r1
            KJ.c r1 = r1.k()
            boolean r1 = r1.isEmpty()
            kG.c r3 = r13.Z0()
            boolean r3 = r3.j()
            r9 = r3 ^ 1
            com.sugarcube.app.base.data.user.UserRepo r3 = r13.f142676q
            TJ.P r3 = r3.isLoggedIn()
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            kotlin.jvm.internal.K r10 = new kotlin.jvm.internal.K
            r10.<init>()
            if (r1 != 0) goto L_0x0246
            if (r0 == 0) goto L_0x0246
            if (r3 == 0) goto L_0x0218
            com.sugarcube.decorate.v2.internal.usecase.SaveDesignUseCase r5 = r13.f142685z
            kG.c r6 = r13.Z0()
            r4.f142785c = r13
            r4.f142786d = r14
            r4.f142787e = r10
            r4.f142788f = r0
            r4.f142789g = r1
            r4.f142791i = r9
            r4.f142790h = r3
            r4.f142794l = r8
            java.lang.Object r0 = r5.m78savegIAlus(r6, r4)
            if (r0 != r7) goto L_0x00c8
            return r7
        L_0x00c8:
            r3 = r13
            r14 = r9
            r1 = r10
        L_0x00cb:
            java.lang.Throwable r4 = XH.x.e(r0)
            if (r4 != 0) goto L_0x00e0
            XH.v r0 = (XH.v) r0
            java.lang.Object r0 = r0.d()
            kG.c r0 = (kG.C17497c) r0
            r3.h2(r0)
            r1.f144344a = r8
            goto L_0x0215
        L_0x00e0:
            com.sugarcube.core.logger.Priority r0 = com.sugarcube.core.logger.Priority.ERROR
            java.lang.String r4 = XH.C16816g.b(r4)
            if (r4 != 0) goto L_0x00ea
            java.lang.String r4 = ""
        L_0x00ea:
            int[] r5 = NG.k.f136489a
            int r0 = r0.ordinal()
            r0 = r5[r0]
            java.lang.String r5 = " "
            java.lang.String r6 = "Kt"
            r7 = 46
            r9 = 36
            r10 = 0
            java.lang.String r11 = "Couldn't save design during fatal error."
            if (r0 == r8) goto L_0x01e2
            if (r0 == r2) goto L_0x01ae
            r12 = 3
            if (r0 == r12) goto L_0x017a
            r12 = 4
            if (r0 == r12) goto L_0x0145
            r12 = 5
            if (r0 != r12) goto L_0x013f
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            java.lang.String r9 = HJ.C15854t.s1(r0, r9, r10, r2, r10)
            java.lang.String r2 = HJ.C15854t.o1(r9, r7, r10, r2, r10)
            int r7 = r2.length()
            if (r7 != 0) goto L_0x0124
            goto L_0x0128
        L_0x0124:
            java.lang.String r0 = HJ.C15854t.P0(r2, r6)
        L_0x0128:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r0, r2)
            goto L_0x0215
        L_0x013f:
            XH.t r14 = new XH.t
            r14.<init>()
            throw r14
        L_0x0145:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            java.lang.String r9 = HJ.C15854t.s1(r0, r9, r10, r2, r10)
            java.lang.String r2 = HJ.C15854t.o1(r9, r7, r10, r2, r10)
            int r7 = r2.length()
            if (r7 != 0) goto L_0x015f
            goto L_0x0163
        L_0x015f:
            java.lang.String r0 = HJ.C15854t.P0(r2, r6)
        L_0x0163:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r0, r2)
            goto L_0x0215
        L_0x017a:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            java.lang.String r9 = HJ.C15854t.s1(r0, r9, r10, r2, r10)
            java.lang.String r2 = HJ.C15854t.o1(r9, r7, r10, r2, r10)
            int r7 = r2.length()
            if (r7 != 0) goto L_0x0194
            goto L_0x0198
        L_0x0194:
            java.lang.String r0 = HJ.C15854t.P0(r2, r6)
        L_0x0198:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r0, r2)
            goto L_0x0215
        L_0x01ae:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            java.lang.String r9 = HJ.C15854t.s1(r0, r9, r10, r2, r10)
            java.lang.String r2 = HJ.C15854t.o1(r9, r7, r10, r2, r10)
            int r7 = r2.length()
            if (r7 != 0) goto L_0x01c8
            goto L_0x01cc
        L_0x01c8:
            java.lang.String r0 = HJ.C15854t.P0(r2, r6)
        L_0x01cc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
            goto L_0x0215
        L_0x01e2:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            java.lang.String r9 = HJ.C15854t.s1(r0, r9, r10, r2, r10)
            java.lang.String r2 = HJ.C15854t.o1(r9, r7, r10, r2, r10)
            int r7 = r2.length()
            if (r7 != 0) goto L_0x01fc
            goto L_0x0200
        L_0x01fc:
            java.lang.String r0 = HJ.C15854t.P0(r2, r6)
        L_0x0200:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r0, r2)
        L_0x0215:
            r9 = r14
            r10 = r1
            goto L_0x0247
        L_0x0218:
            com.sugarcube.decorate.v2.internal.usecase.SaveDesignUseCase r5 = r13.f142685z
            kG.c r6 = r13.Z0()
            r4.f142785c = r13
            r4.f142786d = r14
            r4.f142787e = r10
            r4.f142788f = r0
            r4.f142789g = r1
            r4.f142791i = r9
            r4.f142790h = r3
            r4.f142794l = r2
            r3 = 0
            r14 = 2
            r0 = 0
            r1 = r5
            r2 = r6
            r5 = r14
            r6 = r0
            java.lang.Object r0 = com.sugarcube.decorate.v2.internal.usecase.SaveDesignUseCase.a.a(r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L_0x023c
            return r7
        L_0x023c:
            r2 = r13
            r14 = r9
            r1 = r10
        L_0x023f:
            XH.x.a(r0)
            r9 = r14
            r10 = r1
            r3 = r2
            goto L_0x0247
        L_0x0246:
            r3 = r13
        L_0x0247:
            if (r9 != 0) goto L_0x024f
            boolean r14 = r10.f144344a
            if (r14 == 0) goto L_0x024e
            goto L_0x024f
        L_0x024e:
            r8 = 0
        L_0x024f:
            r3.q2(r8)
            XH.N r14 = XH.C16807N.f139792a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.S0(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void S1() {
        String helaWallColor = this.f142672m.getHelaWallColor();
        C16505B<l0> h12 = h1();
        C16415m mVar = r10;
        C16415m mVar2 = new C16415m((List) null, new C16404b(helaWallColor, (String) null, true, false, 10, (DefaultConstructorMarker) null), 1, (DefaultConstructorMarker) null);
        h12.setValue(l0.b(h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, mVar, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217695, (Object) null));
        this.f142678s.g0();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0125 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object T0(dI.C17164e<? super XH.C16807N> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.C17150d
            if (r0 == 0) goto L_0x0014
            r0 = r14
            com.sugarcube.decorate.v2.internal.ui.surface.h$d r0 = (com.sugarcube.decorate.v2.internal.ui.surface.h.C17150d) r0
            int r1 = r0.f142807k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f142807k = r1
        L_0x0012:
            r5 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.decorate.v2.internal.ui.surface.h$d r0 = new com.sugarcube.decorate.v2.internal.ui.surface.h$d
            r0.<init>(r13, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r5.f142805i
            java.lang.Object r8 = eI.C17187b.f()
            int r1 = r5.f142807k
            r2 = 4
            r3 = 3
            r4 = 2
            r6 = 0
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L_0x008d
            if (r1 == r10) goto L_0x0076
            if (r1 == r4) goto L_0x0061
            if (r1 == r3) goto L_0x0049
            if (r1 != r2) goto L_0x0041
            int r14 = r5.f142804h
            java.lang.Object r1 = r5.f142800d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r5.f142799c
            com.sugarcube.decorate.v2.internal.ui.surface.h r1 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r1
            XH.y.b(r0)
            goto L_0x012b
        L_0x0041:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0049:
            int r14 = r5.f142804h
            int r1 = r5.f142803g
            boolean r3 = r5.f142802f
            boolean r4 = r5.f142801e
            java.lang.Object r7 = r5.f142800d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r11 = r5.f142799c
            com.sugarcube.decorate.v2.internal.ui.surface.h r11 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r11
            XH.y.b(r0)
            r12 = r11
            r11 = r14
            r14 = r7
            goto L_0x015f
        L_0x0061:
            int r14 = r5.f142804h
            java.lang.Object r1 = r5.f142800d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r5.f142799c
            com.sugarcube.decorate.v2.internal.ui.surface.h r1 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r1
            XH.y.b(r0)     // Catch:{ Exception -> 0x012f }
            XH.x r0 = (XH.x) r0     // Catch:{ Exception -> 0x012f }
            java.lang.Object r0 = r0.j()     // Catch:{ Exception -> 0x012f }
            goto L_0x0128
        L_0x0076:
            int r14 = r5.f142804h
            int r1 = r5.f142803g
            boolean r2 = r5.f142802f
            boolean r3 = r5.f142801e
            java.lang.Object r6 = r5.f142800d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r5.f142799c
            com.sugarcube.decorate.v2.internal.ui.surface.h r7 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r7
            XH.y.b(r0)
            r11 = r14
            r14 = r6
            goto L_0x0103
        L_0x008d:
            XH.y.b(r0)
            TJ.B r0 = r13.h1()
            java.lang.Object r0 = r0.getValue()
            OG.l0 r0 = (OG.l0) r0
            boolean r0 = r0.y()
            TJ.B r1 = r13.h1()
            java.lang.Object r1 = r1.getValue()
            OG.l0 r1 = (OG.l0) r1
            KJ.c r1 = r1.k()
            boolean r1 = r1.isEmpty()
            TJ.P r7 = r13.f1()
            java.lang.Object r7 = r7.getValue()
            OG.l0 r7 = (OG.l0) r7
            kG.c r7 = r7.n()
            if (r7 == 0) goto L_0x00c8
            boolean r7 = r7.j()
            if (r7 != 0) goto L_0x00c8
            r7 = r10
            goto L_0x00c9
        L_0x00c8:
            r7 = r9
        L_0x00c9:
            if (r7 != 0) goto L_0x00d2
            if (r1 != 0) goto L_0x00d0
            if (r0 == 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r11 = r9
            goto L_0x00d3
        L_0x00d2:
            r11 = r10
        L_0x00d3:
            if (r0 == 0) goto L_0x018f
            if (r1 != 0) goto L_0x018f
            if (r7 != 0) goto L_0x0134
            QJ.x r2 = QJ.C16343z.b(r6, r10, r6)
            r13.f142666R = r2
            TJ.B r2 = r13.h1()
            JG.a$d r3 = JG.C15930a.d.f135597a
            OG.n0.g(r2, r3)
            QJ.x<java.lang.Boolean> r2 = r13.f142666R
            r5.f142799c = r13
            r5.f142800d = r14
            r5.f142801e = r0
            r5.f142802f = r1
            r5.f142803g = r7
            r5.f142804h = r11
            r5.f142807k = r10
            java.lang.Object r2 = r2.f(r5)
            if (r2 != r8) goto L_0x00ff
            return r8
        L_0x00ff:
            r3 = r0
            r2 = r1
            r1 = r7
            r7 = r13
        L_0x0103:
            com.sugarcube.decorate.v2.internal.usecase.SaveDesignUseCase r0 = r7.f142685z     // Catch:{ Exception -> 0x012e }
            kG.c r6 = r7.Z0()     // Catch:{ Exception -> 0x012e }
            r5.f142799c = r7     // Catch:{ Exception -> 0x012e }
            r5.f142800d = r14     // Catch:{ Exception -> 0x012e }
            r5.f142801e = r3     // Catch:{ Exception -> 0x012e }
            r5.f142802f = r2     // Catch:{ Exception -> 0x012e }
            r5.f142803g = r1     // Catch:{ Exception -> 0x012e }
            r5.f142804h = r11     // Catch:{ Exception -> 0x012e }
            r5.f142807k = r4     // Catch:{ Exception -> 0x012e }
            r3 = 0
            r14 = 2
            r12 = 0
            r1 = r0
            r2 = r6
            r4 = r5
            r5 = r14
            r6 = r12
            java.lang.Object r0 = com.sugarcube.decorate.v2.internal.usecase.SaveDesignUseCase.a.a(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x012e }
            if (r0 != r8) goto L_0x0126
            return r8
        L_0x0126:
            r1 = r7
            r14 = r11
        L_0x0128:
            XH.x.a(r0)     // Catch:{ Exception -> 0x012f }
        L_0x012b:
            r11 = r14
            goto L_0x0190
        L_0x012e:
            r1 = r7
        L_0x012f:
            XH.N r14 = XH.C16807N.f139792a
            r11 = r9
            goto L_0x0190
        L_0x0134:
            QJ.x r4 = QJ.C16343z.b(r6, r10, r6)
            r13.f142665Q = r4
            TJ.B r4 = r13.h1()
            JG.a$e r12 = JG.C15930a.e.f135602a
            OG.n0.g(r4, r12)
            QJ.x<java.lang.Boolean> r4 = r13.f142665Q
            r5.f142799c = r13
            r5.f142800d = r14
            r5.f142801e = r0
            r5.f142802f = r1
            r5.f142803g = r7
            r5.f142804h = r11
            r5.f142807k = r3
            java.lang.Object r3 = r4.f(r5)
            if (r3 != r8) goto L_0x015a
            return r8
        L_0x015a:
            r12 = r13
            r4 = r0
            r0 = r3
            r3 = r1
            r1 = r7
        L_0x015f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x018d
            QG.E$e r0 = QG.C16219E.e.SAVE
            com.sugarcube.decorate.v2.internal.ui.surface.h$e r7 = new com.sugarcube.decorate.v2.internal.ui.surface.h$e
            r7.<init>(r12, r6)
            r5.f142799c = r12
            r5.f142800d = r14
            r5.f142801e = r4
            r5.f142802f = r3
            r5.f142803g = r1
            r5.f142804h = r11
            r5.f142807k = r2
            r3 = 0
            r6 = 2
            r14 = 0
            r1 = r12
            r2 = r0
            r4 = r7
            r7 = r14
            java.lang.Object r14 = c2(r1, r2, r3, r4, r5, r6, r7)
            if (r14 != r8) goto L_0x018a
            return r8
        L_0x018a:
            r14 = r11
            r1 = r12
            goto L_0x012b
        L_0x018d:
            r1 = r12
            goto L_0x0190
        L_0x018f:
            r1 = r13
        L_0x0190:
            if (r11 == 0) goto L_0x0193
            r9 = r10
        L_0x0193:
            r1.q2(r9)
            XH.N r14 = XH.C16807N.f139792a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.T0(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void T1() {
        n0.j(h1(), (C16033b) null);
    }

    /* access modifiers changed from: private */
    public final V2 U0() {
        return (V2) this.f142663O.getValue();
    }

    /* access modifiers changed from: private */
    public final void U1() {
        C17621a.c f10 = e1() instanceof C17621a.c ? null : Y0().f();
        k2(f10);
        if (f10 != null) {
            this.f142678s.T(Design.Menu.Swap);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r5 = (r5 = r5.e()).e();
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object V1(com.sugarcube.app.base.data.database.CachedCatalogItem r19, boolean r20, dI.C17164e<? super XH.C16807N> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.y
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.sugarcube.decorate.v2.internal.ui.surface.h$y r4 = (com.sugarcube.decorate.v2.internal.ui.surface.h.y) r4
            int r5 = r4.f142938k
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f142938k = r5
            goto L_0x0020
        L_0x001b:
            com.sugarcube.decorate.v2.internal.ui.surface.h$y r4 = new com.sugarcube.decorate.v2.internal.ui.surface.h$y
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r5 = r4.f142936i
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.f142938k
            r8 = 1
            if (r7 == 0) goto L_0x004e
            if (r7 != r8) goto L_0x0046
            java.lang.Object r1 = r4.f142934g
            OG.v0 r1 = (OG.v0) r1
            java.lang.Object r1 = r4.f142933f
            com.sugarcube.app.base.data.database.CachedCatalogItem r1 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r1
            java.lang.Object r2 = r4.f142932e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r4.f142931d
            com.sugarcube.app.base.data.database.CachedCatalogItem r2 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r2
            java.lang.Object r2 = r4.f142930c
            com.sugarcube.decorate.v2.internal.ui.surface.h r2 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r2
            XH.y.b(r5)
            goto L_0x00c3
        L_0x0046:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004e:
            XH.y.b(r5)
            if (r2 == 0) goto L_0x0064
            TJ.B r5 = r18.h1()
            MG.b$e r7 = new MG.b$e
            NG.i r9 = new NG.i
            r9.<init>(r0)
            r7.<init>(r9)
            OG.n0.j(r5, r7)
        L_0x0064:
            OG.v0 r5 = r18.b1()
            r7 = 0
            if (r5 == 0) goto L_0x007c
            mG.b r5 = r5.e()
            if (r5 == 0) goto L_0x007c
            RF.k r5 = r5.e()
            if (r5 == 0) goto L_0x007c
            com.sugarcube.app.base.data.database.CachedCatalogItem r5 = r5.d()
            goto L_0x007d
        L_0x007c:
            r5 = r7
        L_0x007d:
            OG.v0 r9 = r18.b1()
            if (r9 == 0) goto L_0x00a6
            mG.b r10 = r9.e()
            mG.b r11 = r9.e()
            RF.k r11 = r11.e()
            RF.k r12 = RF.k.b(r11, r7, r1, r8, r7)
            r15 = 13
            r16 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            mG.b r10 = mG.C17597b.b(r10, r11, r12, r13, r14, r15, r16)
            r12 = 2
            OG.v0 r7 = OG.v0.b(r9, r10, r11, r12, r7)
            r0.j2(r7)
        L_0x00a6:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineToolbarInteractions r7 = r0.f142656H
            r4.f142930c = r0
            r4.f142931d = r1
            r4.f142932e = r3
            r4.f142933f = r5
            r4.f142934g = r9
            r4.f142935h = r2
            r4.f142938k = r8
            java.lang.Object r1 = r7.swapSelectedItemWith(r1, r2, r4)
            if (r1 != r6) goto L_0x00bd
            return r6
        L_0x00bd:
            r2 = r0
            r17 = r5
            r5 = r1
            r1 = r17
        L_0x00c3:
            iG.j r5 = (iG.C17353j) r5
            hG.v r2 = r2.f142678s
            o1.g r3 = r5.b()
            o1.g r4 = r5.a()
            r2.h0(r1, r3, r4)
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.V1(com.sugarcube.app.base.data.database.CachedCatalogItem, boolean, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final C16807N W1(h hVar) {
        l1(hVar, false, new z(hVar, (C17164e<? super z>) null), 1, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void X1() {
        C17621a.d g10 = e1() instanceof C17621a.d ? null : Y0().g();
        k2(g10);
        if (g10 != null) {
            this.f142678s.T(Design.Menu.Variants);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Y1(dI.C17164e<? super XH.C16807N> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.A
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.sugarcube.decorate.v2.internal.ui.surface.h$A r0 = (com.sugarcube.decorate.v2.internal.ui.surface.h.A) r0
            int r1 = r0.f142690g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142690g = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v2.internal.ui.surface.h$A r0 = new com.sugarcube.decorate.v2.internal.ui.surface.h$A
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f142688e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142690g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f142687d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f142686c
            com.sugarcube.decorate.v2.internal.ui.surface.h r6 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r6
            XH.y.b(r1)
            goto L_0x0053
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            hG.v r1 = r5.f142678s
            com.sugarcube.core.analytics.Design$Menu r3 = com.sugarcube.core.analytics.Design.Menu.Views
            r1.T(r3)
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r1 = r5.f142672m
            r0.f142686c = r5
            r0.f142687d = r6
            r0.f142690g = r4
            java.lang.Object r1 = r1.updateMultiviewInformation(r4, r0)
            if (r1 != r2) goto L_0x0052
            return r2
        L_0x0052:
            r6 = r5
        L_0x0053:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x006c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r0 = r6.f142672m
            RF.j r0 = r0.getCurrentViewport()
            TJ.B r6 = r6.h1()
            if (r0 == 0) goto L_0x0068
            int r0 = r0.b()
            goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            OG.n0.e(r6, r1, r0)
        L_0x006c:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.Y1(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final C17497c Z0() {
        C17497c n10 = h1().getValue().n();
        if (n10 != null) {
            return n10;
        }
        throw new IllegalArgumentException("Metadata was null in the state.");
    }

    /* access modifiers changed from: private */
    public final void Z1(C16404b bVar) {
        EngineManagerImpl engineManagerImpl = this.f142672m;
        Integer num = null;
        C16404b bVar2 = !bVar.e() ? bVar : null;
        if (bVar2 != null) {
            num = Integer.valueOf(bVar2.g());
        }
        engineManagerImpl.setHelaWallColor(num);
        this.f142678s.l0(bVar.d());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x012c, code lost:
        r3 = (com.sugarcube.decorate_engine.SceneLayout) r3;
        r2.f142691c = r7;
        r2.f142692d = r5;
        r2.f142693e = r4;
        r2.f142694f = r1;
        r2.f142695g = r3;
        r2.f142707s = 2;
        r6 = r7.d1(r5, r4, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x013f, code lost:
        if (r6 != r9) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0141, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0142, code lost:
        r8 = r3;
        r3 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0147, code lost:
        r3 = (com.sugarcube.core.network.models.SmartaPlacementResult) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0149, code lost:
        if (r8 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x014b, code lost:
        r1 = r7.f142677r;
        r10 = r7.f142672m;
        r2.f142691c = r7;
        r2.f142692d = r6;
        r2.f142693e = r5;
        r2.f142694f = r4;
        r2.f142695g = r8;
        r2.f142696h = r3;
        r2.f142697i = r8;
        r2.f142698j = r8;
        r2.f142699k = r7;
        r2.f142700l = r8;
        r2.f142701m = r6;
        r2.f142702n = r1;
        r11 = 0;
        r2.f142704p = 0;
        r2.f142707s = 3;
        r10 = r10.getModelMap(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0171, code lost:
        if (r10 != r9) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0173, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0174, code lost:
        r12 = r3;
        r14 = r4;
        r15 = r5;
        r5 = r6;
        r0 = r8;
        r13 = r0;
        r3 = r10;
        r4 = r1;
        r10 = r5;
        r1 = r7;
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x017f, code lost:
        r2.f142691c = r7;
        r2.f142692d = r10;
        r2.f142693e = r15;
        r2.f142694f = r14;
        r2.f142695g = r13;
        r2.f142696h = r12;
        r2.f142697i = r0;
        r2.f142698j = r8;
        r2.f142699k = r1;
        r2.f142700l = r6;
        r2.f142701m = r5;
        r2.f142702n = r4;
        r2.f142703o = r3;
        r2.f142704p = r11;
        r2.f142707s = 4;
        r11 = r7;
        r3 = r4.updateDesign(r5, r6, (java.util.HashMap) r3, false, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01af, code lost:
        if (r3 != r9) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01b1, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01b2, code lost:
        r8 = r10;
        r4 = r12;
        r5 = r13;
        r6 = r14;
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01b7, code lost:
        r1.h2((kG.C17497c) r3);
        r1 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01c3, code lost:
        r1 = r3;
        r17 = r5;
        r5 = r4;
        r4 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01cc, code lost:
        r0 = r8.f142672m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01ce, code lost:
        if (r1 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01d0, code lost:
        r3 = r1.getSmartaPlacement();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01d5, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01d6, code lost:
        r2.f142691c = r8;
        r2.f142692d = r7;
        r2.f142693e = r6;
        r2.f142694f = r5;
        r2.f142695g = r4;
        r2.f142696h = r1;
        r2.f142707s = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01e9, code lost:
        if (r0.placeItemInDesign(r6, r3, r2) != r9) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01eb, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01ec, code lost:
        r0 = r8.f142675p;
        r3 = com.sugarcube.app.base.data.feature.ConfigItems.UserHasPlacedItem.INSTANCE;
        r10 = kotlin.coroutines.jvm.internal.b.a(true);
        r2.f142691c = r8;
        r2.f142692d = r7;
        r2.f142693e = r6;
        r2.f142694f = r5;
        r2.f142695g = r4;
        r2.f142696h = r1;
        r2.f142707s = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0208, code lost:
        if (r0.override(r3, r10, r2) != r9) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x020a, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x020d, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a2(kG.C17497c r19, com.sugarcube.app.base.data.database.CachedCatalogItem r20, dI.C17164e<? super XH.C16807N> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.B
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.decorate.v2.internal.ui.surface.h$B r2 = (com.sugarcube.decorate.v2.internal.ui.surface.h.B) r2
            int r3 = r2.f142707s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f142707s = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.decorate.v2.internal.ui.surface.h$B r2 = new com.sugarcube.decorate.v2.internal.ui.surface.h$B
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f142705q
            java.lang.Object r9 = eI.C17187b.f()
            int r4 = r2.f142707s
            switch(r4) {
                case 0: goto L_0x010d;
                case 1: goto L_0x00f8;
                case 2: goto L_0x00df;
                case 3: goto L_0x009e;
                case 4: goto L_0x0069;
                case 5: goto L_0x004c;
                case 6: goto L_0x002f;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002f:
            java.lang.Object r1 = r2.f142696h
            com.sugarcube.core.network.models.SmartaPlacementResult r1 = (com.sugarcube.core.network.models.SmartaPlacementResult) r1
            java.lang.Object r1 = r2.f142695g
            com.sugarcube.decorate_engine.SceneLayout r1 = (com.sugarcube.decorate_engine.SceneLayout) r1
            java.lang.Object r1 = r2.f142694f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f142693e
            com.sugarcube.app.base.data.database.CachedCatalogItem r1 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r1
            java.lang.Object r1 = r2.f142692d
            kG.c r1 = (kG.C17497c) r1
            java.lang.Object r1 = r2.f142691c
            com.sugarcube.decorate.v2.internal.ui.surface.h r1 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r1
            XH.y.b(r3)
            goto L_0x020b
        L_0x004c:
            java.lang.Object r1 = r2.f142696h
            com.sugarcube.core.network.models.SmartaPlacementResult r1 = (com.sugarcube.core.network.models.SmartaPlacementResult) r1
            java.lang.Object r4 = r2.f142695g
            com.sugarcube.decorate_engine.SceneLayout r4 = (com.sugarcube.decorate_engine.SceneLayout) r4
            java.lang.Object r5 = r2.f142694f
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r6 = r2.f142693e
            com.sugarcube.app.base.data.database.CachedCatalogItem r6 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r6
            java.lang.Object r7 = r2.f142692d
            kG.c r7 = (kG.C17497c) r7
            java.lang.Object r8 = r2.f142691c
            com.sugarcube.decorate.v2.internal.ui.surface.h r8 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r8
            XH.y.b(r3)
            goto L_0x01ec
        L_0x0069:
            java.lang.Object r1 = r2.f142702n
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r1 = (com.sugarcube.decorate.v2.internal.manager.CompositionUpdater) r1
            java.lang.Object r1 = r2.f142701m
            kG.c r1 = (kG.C17497c) r1
            java.lang.Object r1 = r2.f142700l
            com.sugarcube.decorate_engine.SceneLayout r1 = (com.sugarcube.decorate_engine.SceneLayout) r1
            java.lang.Object r1 = r2.f142699k
            com.sugarcube.decorate.v2.internal.ui.surface.h r1 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r1
            java.lang.Object r4 = r2.f142698j
            com.sugarcube.decorate_engine.SceneLayout r4 = (com.sugarcube.decorate_engine.SceneLayout) r4
            java.lang.Object r4 = r2.f142697i
            com.sugarcube.decorate_engine.SceneLayout r4 = (com.sugarcube.decorate_engine.SceneLayout) r4
            java.lang.Object r4 = r2.f142696h
            com.sugarcube.core.network.models.SmartaPlacementResult r4 = (com.sugarcube.core.network.models.SmartaPlacementResult) r4
            java.lang.Object r5 = r2.f142695g
            com.sugarcube.decorate_engine.SceneLayout r5 = (com.sugarcube.decorate_engine.SceneLayout) r5
            java.lang.Object r6 = r2.f142694f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r2.f142693e
            com.sugarcube.app.base.data.database.CachedCatalogItem r7 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r7
            java.lang.Object r8 = r2.f142692d
            kG.c r8 = (kG.C17497c) r8
            java.lang.Object r11 = r2.f142691c
            com.sugarcube.decorate.v2.internal.ui.surface.h r11 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r11
            XH.y.b(r3)
            goto L_0x01b7
        L_0x009e:
            int r1 = r2.f142704p
            java.lang.Object r4 = r2.f142702n
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r4 = (com.sugarcube.decorate.v2.internal.manager.CompositionUpdater) r4
            java.lang.Object r5 = r2.f142701m
            kG.c r5 = (kG.C17497c) r5
            java.lang.Object r6 = r2.f142700l
            com.sugarcube.decorate_engine.SceneLayout r6 = (com.sugarcube.decorate_engine.SceneLayout) r6
            java.lang.Object r7 = r2.f142699k
            com.sugarcube.decorate.v2.internal.ui.surface.h r7 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r7
            java.lang.Object r8 = r2.f142698j
            com.sugarcube.decorate_engine.SceneLayout r8 = (com.sugarcube.decorate_engine.SceneLayout) r8
            java.lang.Object r11 = r2.f142697i
            com.sugarcube.decorate_engine.SceneLayout r11 = (com.sugarcube.decorate_engine.SceneLayout) r11
            java.lang.Object r12 = r2.f142696h
            com.sugarcube.core.network.models.SmartaPlacementResult r12 = (com.sugarcube.core.network.models.SmartaPlacementResult) r12
            java.lang.Object r13 = r2.f142695g
            com.sugarcube.decorate_engine.SceneLayout r13 = (com.sugarcube.decorate_engine.SceneLayout) r13
            java.lang.Object r14 = r2.f142694f
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r2.f142693e
            com.sugarcube.app.base.data.database.CachedCatalogItem r15 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r15
            java.lang.Object r10 = r2.f142692d
            kG.c r10 = (kG.C17497c) r10
            r19 = r1
            java.lang.Object r1 = r2.f142691c
            com.sugarcube.decorate.v2.internal.ui.surface.h r1 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r1
            XH.y.b(r3)
            r0 = r11
            r11 = r19
            r17 = r7
            r7 = r1
            r1 = r17
            goto L_0x017f
        L_0x00df:
            java.lang.Object r1 = r2.f142695g
            com.sugarcube.decorate_engine.SceneLayout r1 = (com.sugarcube.decorate_engine.SceneLayout) r1
            java.lang.Object r4 = r2.f142694f
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r5 = r2.f142693e
            com.sugarcube.app.base.data.database.CachedCatalogItem r5 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r5
            java.lang.Object r6 = r2.f142692d
            kG.c r6 = (kG.C17497c) r6
            java.lang.Object r7 = r2.f142691c
            com.sugarcube.decorate.v2.internal.ui.surface.h r7 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r7
            XH.y.b(r3)
            r8 = r1
            goto L_0x0147
        L_0x00f8:
            java.lang.Object r1 = r2.f142694f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r4 = r2.f142693e
            com.sugarcube.app.base.data.database.CachedCatalogItem r4 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r4
            java.lang.Object r5 = r2.f142692d
            kG.c r5 = (kG.C17497c) r5
            java.lang.Object r6 = r2.f142691c
            com.sugarcube.decorate.v2.internal.ui.surface.h r6 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r6
            XH.y.b(r3)
            r7 = r6
            goto L_0x012c
        L_0x010d:
            XH.y.b(r3)
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r3 = r0.f142672m
            kG.a r4 = kG.C17495a.Smarta
            r2.f142691c = r0
            r5 = r19
            r2.f142692d = r5
            r6 = r20
            r2.f142693e = r6
            r2.f142694f = r1
            r7 = 1
            r2.f142707s = r7
            java.lang.Object r3 = r3.saveSceneLayout(r4, r2)
            if (r3 != r9) goto L_0x012a
            return r9
        L_0x012a:
            r7 = r0
            r4 = r6
        L_0x012c:
            com.sugarcube.decorate_engine.SceneLayout r3 = (com.sugarcube.decorate_engine.SceneLayout) r3
            r2.f142691c = r7
            r2.f142692d = r5
            r2.f142693e = r4
            r2.f142694f = r1
            r2.f142695g = r3
            r6 = 2
            r2.f142707s = r6
            java.lang.Object r6 = r7.d1(r5, r4, r3, r2)
            if (r6 != r9) goto L_0x0142
            return r9
        L_0x0142:
            r8 = r3
            r3 = r6
            r6 = r5
            r5 = r4
            r4 = r1
        L_0x0147:
            com.sugarcube.core.network.models.SmartaPlacementResult r3 = (com.sugarcube.core.network.models.SmartaPlacementResult) r3
            if (r8 == 0) goto L_0x01c3
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r1 = r7.f142677r
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r10 = r7.f142672m
            r2.f142691c = r7
            r2.f142692d = r6
            r2.f142693e = r5
            r2.f142694f = r4
            r2.f142695g = r8
            r2.f142696h = r3
            r2.f142697i = r8
            r2.f142698j = r8
            r2.f142699k = r7
            r2.f142700l = r8
            r2.f142701m = r6
            r2.f142702n = r1
            r11 = 0
            r2.f142704p = r11
            r12 = 3
            r2.f142707s = r12
            java.lang.Object r10 = r10.getModelMap(r2)
            if (r10 != r9) goto L_0x0174
            return r9
        L_0x0174:
            r12 = r3
            r14 = r4
            r15 = r5
            r5 = r6
            r0 = r8
            r13 = r0
            r3 = r10
            r4 = r1
            r10 = r5
            r1 = r7
            r6 = r13
        L_0x017f:
            r16 = r3
            java.util.HashMap r16 = (java.util.HashMap) r16
            r2.f142691c = r7
            r2.f142692d = r10
            r2.f142693e = r15
            r2.f142694f = r14
            r2.f142695g = r13
            r2.f142696h = r12
            r2.f142697i = r0
            r2.f142698j = r8
            r2.f142699k = r1
            r2.f142700l = r6
            r2.f142701m = r5
            r2.f142702n = r4
            r2.f142703o = r3
            r2.f142704p = r11
            r0 = 4
            r2.f142707s = r0
            r0 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r16
            r11 = r7
            r7 = r0
            r8 = r2
            java.lang.Object r3 = r3.updateDesign(r4, r5, r6, r7, r8)
            if (r3 != r9) goto L_0x01b2
            return r9
        L_0x01b2:
            r8 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
        L_0x01b7:
            kG.c r3 = (kG.C17497c) r3
            r1.h2(r3)
            r1 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r11
            goto L_0x01cc
        L_0x01c3:
            r1 = r3
            r17 = r5
            r5 = r4
            r4 = r8
            r8 = r7
            r7 = r6
            r6 = r17
        L_0x01cc:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r0 = r8.f142672m
            if (r1 == 0) goto L_0x01d5
            com.sugarcube.core.network.models.SmartaPlacement r3 = r1.getSmartaPlacement()
            goto L_0x01d6
        L_0x01d5:
            r3 = 0
        L_0x01d6:
            r2.f142691c = r8
            r2.f142692d = r7
            r2.f142693e = r6
            r2.f142694f = r5
            r2.f142695g = r4
            r2.f142696h = r1
            r10 = 5
            r2.f142707s = r10
            java.lang.Object r0 = r0.placeItemInDesign(r6, r3, r2)
            if (r0 != r9) goto L_0x01ec
            return r9
        L_0x01ec:
            com.sugarcube.app.base.data.feature.ConfigRepository r0 = r8.f142675p
            com.sugarcube.app.base.data.feature.ConfigItems$UserHasPlacedItem r3 = com.sugarcube.app.base.data.feature.ConfigItems.UserHasPlacedItem.INSTANCE
            r10 = 1
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r10)
            r2.f142691c = r8
            r2.f142692d = r7
            r2.f142693e = r6
            r2.f142694f = r5
            r2.f142695g = r4
            r2.f142696h = r1
            r1 = 6
            r2.f142707s = r1
            java.lang.Object r0 = r0.override(r3, r10, r2)
            if (r0 != r9) goto L_0x020b
            return r9
        L_0x020b:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.a2(kG.c, com.sugarcube.app.base.data.database.CachedCatalogItem, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b2(QG.C16219E.e r7, boolean r8, nI.C17642l<? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r9, dI.C17164e<? super XH.C16807N> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.C
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.sugarcube.decorate.v2.internal.ui.surface.h$C r0 = (com.sugarcube.decorate.v2.internal.ui.surface.h.C) r0
            int r1 = r0.f142715j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142715j = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v2.internal.ui.surface.h$C r0 = new com.sugarcube.decorate.v2.internal.ui.surface.h$C
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f142713h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142715j
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0046
            if (r3 != r5) goto L_0x003e
            boolean r8 = r0.f142712g
            java.lang.Object r7 = r0.f142711f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f142710e
            nI.l r7 = (nI.C17642l) r7
            java.lang.Object r7 = r0.f142709d
            QG.E$e r7 = (QG.C16219E.e) r7
            java.lang.Object r9 = r0.f142708c
            com.sugarcube.decorate.v2.internal.ui.surface.h r9 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r9
            XH.y.b(r1)     // Catch:{ Exception -> 0x003c }
            goto L_0x0064
        L_0x003c:
            r10 = move-exception
            goto L_0x006e
        L_0x003e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0046:
            XH.y.b(r1)
            TJ.B r1 = r6.h1()     // Catch:{ Exception -> 0x006c }
            OG.n0.d(r1, r7, r5)     // Catch:{ Exception -> 0x006c }
            r0.f142708c = r6     // Catch:{ Exception -> 0x006c }
            r0.f142709d = r7     // Catch:{ Exception -> 0x006c }
            r0.f142710e = r9     // Catch:{ Exception -> 0x006c }
            r0.f142711f = r10     // Catch:{ Exception -> 0x006c }
            r0.f142712g = r8     // Catch:{ Exception -> 0x006c }
            r0.f142715j = r5     // Catch:{ Exception -> 0x006c }
            java.lang.Object r9 = r9.invoke(r0)     // Catch:{ Exception -> 0x006c }
            if (r9 != r2) goto L_0x0063
            return r2
        L_0x0063:
            r9 = r6
        L_0x0064:
            TJ.B r10 = r9.h1()     // Catch:{ Exception -> 0x003c }
            OG.n0.d(r10, r7, r4)     // Catch:{ Exception -> 0x003c }
            goto L_0x007b
        L_0x006c:
            r10 = move-exception
            r9 = r6
        L_0x006e:
            TJ.B r9 = r9.h1()
            OG.n0.d(r9, r7, r4)
            if (r8 == 0) goto L_0x007e
            boolean r7 = r10 instanceof NG.y
            if (r7 == 0) goto L_0x007e
        L_0x007b:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x007e:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.b2(QG.E$e, boolean, nI.l, dI.e):java.lang.Object");
    }

    static /* synthetic */ Object c2(h hVar, C16219E.e eVar, boolean z10, C17642l lVar, C17164e eVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return hVar.b2(eVar, z10, lVar, eVar2);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01e2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x024b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0281 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d1(kG.C17497c r26, com.sugarcube.app.base.data.database.CachedCatalogItem r27, com.sugarcube.decorate_engine.SceneLayout r28, dI.C17164e<? super com.sugarcube.core.network.models.SmartaPlacementResult> r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r28
            r2 = r29
            boolean r3 = r2 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.C17152f
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.sugarcube.decorate.v2.internal.ui.surface.h$f r3 = (com.sugarcube.decorate.v2.internal.ui.surface.h.C17152f) r3
            int r4 = r3.f142827t
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f142827t = r4
            goto L_0x001e
        L_0x0019:
            com.sugarcube.decorate.v2.internal.ui.surface.h$f r3 = new com.sugarcube.decorate.v2.internal.ui.surface.h$f
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f142825r
            java.lang.Object r10 = eI.C17187b.f()
            int r5 = r3.f142827t
            r11 = 4
            r12 = 3
            r6 = 2
            r14 = 1
            if (r5 == 0) goto L_0x0143
            if (r5 == r14) goto L_0x00fa
            if (r5 == r6) goto L_0x00a9
            if (r5 == r12) goto L_0x006b
            if (r5 != r11) goto L_0x0063
            java.lang.Object r1 = r3.f142820m
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r1 = (com.sugarcube.decorate.v2.internal.manager.CompositionUpdater) r1
            java.lang.Object r1 = r3.f142819l
            com.sugarcube.app.base.data.database.CachedCompiledComposition r1 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r1
            java.lang.Object r1 = r3.f142818k
            com.sugarcube.decorate_engine.SceneLayout r1 = (com.sugarcube.decorate_engine.SceneLayout) r1
            java.lang.Object r1 = r3.f142817j
            com.sugarcube.core.network.models.SmartaPlacementResult r1 = (com.sugarcube.core.network.models.SmartaPlacementResult) r1
            java.lang.Object r1 = r3.f142816i
            java.lang.Object r2 = r3.f142815h
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r3.f142814g
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r3.f142813f
            com.sugarcube.decorate_engine.SceneLayout r2 = (com.sugarcube.decorate_engine.SceneLayout) r2
            java.lang.Object r2 = r3.f142812e
            com.sugarcube.app.base.data.database.CachedCatalogItem r2 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r2
            java.lang.Object r2 = r3.f142811d
            kG.c r2 = (kG.C17497c) r2
            java.lang.Object r2 = r3.f142810c
            com.sugarcube.decorate.v2.internal.ui.surface.h r2 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r2
            XH.y.b(r4)
            goto L_0x0283
        L_0x0063:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x006b:
            int r1 = r3.f142823p
            int r2 = r3.f142822o
            java.lang.Object r5 = r3.f142821n
            java.lang.Object r6 = r3.f142820m
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r6 = (com.sugarcube.decorate.v2.internal.manager.CompositionUpdater) r6
            java.lang.Object r7 = r3.f142819l
            com.sugarcube.app.base.data.database.CachedCompiledComposition r7 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r7
            java.lang.Object r8 = r3.f142818k
            com.sugarcube.decorate_engine.SceneLayout r8 = (com.sugarcube.decorate_engine.SceneLayout) r8
            java.lang.Object r9 = r3.f142817j
            com.sugarcube.decorate_engine.SceneLayout r9 = (com.sugarcube.decorate_engine.SceneLayout) r9
            java.lang.Object r9 = r3.f142816i
            com.sugarcube.decorate_engine.SceneLayout r9 = (com.sugarcube.decorate_engine.SceneLayout) r9
            java.lang.Object r9 = r3.f142815h
            com.sugarcube.core.network.models.Composition r9 = (com.sugarcube.core.network.models.Composition) r9
            java.lang.Object r12 = r3.f142814g
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r14 = r3.f142813f
            com.sugarcube.decorate_engine.SceneLayout r14 = (com.sugarcube.decorate_engine.SceneLayout) r14
            java.lang.Object r15 = r3.f142812e
            com.sugarcube.app.base.data.database.CachedCatalogItem r15 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r15
            java.lang.Object r11 = r3.f142811d
            kG.c r11 = (kG.C17497c) r11
            java.lang.Object r13 = r3.f142810c
            com.sugarcube.decorate.v2.internal.ui.surface.h r13 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r13
            XH.y.b(r4)
            r23 = r11
            r11 = r5
            r5 = r10
            r10 = r15
            r15 = r23
            goto L_0x0256
        L_0x00a9:
            int r1 = r3.f142824q
            int r2 = r3.f142823p
            int r5 = r3.f142822o
            java.lang.Object r6 = r3.f142820m
            java.lang.Object r7 = r3.f142819l
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r7 = (com.sugarcube.decorate.v2.internal.manager.CompositionUpdater) r7
            java.lang.Object r8 = r3.f142818k
            com.sugarcube.app.base.data.database.CachedCompiledComposition r8 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r8
            java.lang.Object r9 = r3.f142817j
            com.sugarcube.decorate_engine.SceneLayout r9 = (com.sugarcube.decorate_engine.SceneLayout) r9
            java.lang.Object r11 = r3.f142816i
            com.sugarcube.decorate_engine.SceneLayout r11 = (com.sugarcube.decorate_engine.SceneLayout) r11
            java.lang.Object r13 = r3.f142815h
            com.sugarcube.decorate_engine.SceneLayout r13 = (com.sugarcube.decorate_engine.SceneLayout) r13
            java.lang.Object r15 = r3.f142814g
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r12 = r3.f142813f
            com.sugarcube.decorate_engine.SceneLayout r12 = (com.sugarcube.decorate_engine.SceneLayout) r12
            java.lang.Object r14 = r3.f142812e
            com.sugarcube.app.base.data.database.CachedCatalogItem r14 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r14
            r26 = r1
            java.lang.Object r1 = r3.f142811d
            kG.c r1 = (kG.C17497c) r1
            r27 = r1
            java.lang.Object r1 = r3.f142810c
            com.sugarcube.decorate.v2.internal.ui.surface.h r1 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r1
            XH.y.b(r4)
            r0 = r26
            r18 = r10
            r10 = r14
            r14 = r9
            r9 = r15
            r15 = r27
            r23 = r8
            r8 = r1
            r1 = r2
            r2 = r5
            r5 = r11
            r11 = r6
            r6 = r13
            r13 = r23
            r24 = r12
            r12 = r7
            r7 = r24
            goto L_0x01f8
        L_0x00fa:
            int r1 = r3.f142824q
            int r2 = r3.f142823p
            int r5 = r3.f142822o
            java.lang.Object r7 = r3.f142819l
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r7 = (com.sugarcube.decorate.v2.internal.manager.CompositionUpdater) r7
            java.lang.Object r8 = r3.f142818k
            com.sugarcube.app.base.data.database.CachedCompiledComposition r8 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r8
            java.lang.Object r9 = r3.f142817j
            com.sugarcube.decorate_engine.SceneLayout r9 = (com.sugarcube.decorate_engine.SceneLayout) r9
            java.lang.Object r11 = r3.f142816i
            com.sugarcube.decorate_engine.SceneLayout r11 = (com.sugarcube.decorate_engine.SceneLayout) r11
            java.lang.Object r12 = r3.f142815h
            com.sugarcube.decorate_engine.SceneLayout r12 = (com.sugarcube.decorate_engine.SceneLayout) r12
            java.lang.Object r13 = r3.f142814g
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r3.f142813f
            com.sugarcube.decorate_engine.SceneLayout r14 = (com.sugarcube.decorate_engine.SceneLayout) r14
            java.lang.Object r15 = r3.f142812e
            com.sugarcube.app.base.data.database.CachedCatalogItem r15 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r15
            java.lang.Object r6 = r3.f142811d
            kG.c r6 = (kG.C17497c) r6
            r26 = r1
            java.lang.Object r1 = r3.f142810c
            com.sugarcube.decorate.v2.internal.ui.surface.h r1 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r1
            XH.y.b(r4)
            r0 = r8
            r8 = r1
            r1 = r6
            r6 = r2
            r2 = r9
            r9 = r13
            r13 = r12
            r12 = r7
            r7 = r26
            r23 = r5
            r5 = r4
            r4 = r23
            r24 = r15
            r15 = r11
            r11 = r24
            goto L_0x01a4
        L_0x0143:
            XH.y.b(r4)
            if (r1 != 0) goto L_0x014a
            r1 = 0
            return r1
        L_0x014a:
            boolean r4 = r26.k()
            r5 = 1
            if (r4 != r5) goto L_0x0153
            r4 = r5
            goto L_0x0154
        L_0x0153:
            r4 = 0
        L_0x0154:
            com.sugarcube.app.base.data.database.Scene r6 = r26.g()
            boolean r6 = r6.isHela()
            if (r6 != r5) goto L_0x0160
            r5 = 1
            goto L_0x0161
        L_0x0160:
            r5 = 0
        L_0x0161:
            com.sugarcube.decorate.v2.internal.manager.CompositionUpdater r7 = r0.f142677r
            com.sugarcube.app.base.data.database.CachedCompiledComposition r8 = r26.c()
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r6 = r0.f142672m
            r3.f142810c = r0
            r9 = r26
            r3.f142811d = r9
            r11 = r27
            r3.f142812e = r11
            r3.f142813f = r1
            r3.f142814g = r2
            r3.f142815h = r1
            r3.f142816i = r1
            r3.f142817j = r1
            r3.f142818k = r8
            r3.f142819l = r7
            r3.f142822o = r4
            r3.f142823p = r5
            r12 = 0
            r3.f142824q = r12
            r12 = 1
            r3.f142827t = r12
            java.lang.Object r6 = r6.getModelMap(r3)
            if (r6 != r10) goto L_0x0192
            return r10
        L_0x0192:
            r13 = r1
            r14 = r13
            r15 = r14
            r12 = r7
            r7 = 0
            r1 = r9
            r9 = r2
            r2 = r15
            r23 = r8
            r8 = r0
            r0 = r23
            r24 = r6
            r6 = r5
            r5 = r24
        L_0x01a4:
            r19 = r5
            java.util.HashMap r19 = (java.util.HashMap) r19
            r3.f142810c = r8
            r3.f142811d = r1
            r3.f142812e = r11
            r3.f142813f = r14
            r3.f142814g = r9
            r3.f142815h = r13
            r3.f142816i = r15
            r3.f142817j = r2
            r3.f142818k = r0
            r3.f142819l = r12
            r3.f142820m = r5
            r3.f142822o = r4
            r3.f142823p = r6
            r3.f142824q = r7
            r26 = r1
            r1 = 2
            r3.f142827t = r1
            r1 = 1
            r18 = r4
            r4 = r12
            r20 = r5
            r5 = r0
            r21 = r6
            r6 = r2
            r22 = r7
            r7 = r19
            r19 = r8
            r8 = r1
            r1 = r9
            r9 = r3
            java.lang.Object r4 = r4.getUpdatedCompiledComposition(r5, r6, r7, r8, r9)
            if (r4 != r10) goto L_0x01e3
            return r10
        L_0x01e3:
            r9 = r1
            r6 = r13
            r7 = r14
            r5 = r15
            r8 = r19
            r1 = r21
            r15 = r26
            r13 = r0
            r14 = r2
            r2 = r18
            r0 = r22
            r18 = r10
            r10 = r11
            r11 = r20
        L_0x01f8:
            com.sugarcube.app.base.data.database.CachedCompiledComposition r4 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r4
            com.sugarcube.core.network.models.Composition r4 = r4.getComposition()
            r19 = r0
            RF.p r0 = r8.f142684y
            if (r2 == 0) goto L_0x0207
            r20 = 1
            goto L_0x0209
        L_0x0207:
            r20 = 0
        L_0x0209:
            if (r1 == 0) goto L_0x020e
            r17 = 1
            goto L_0x0210
        L_0x020e:
            r17 = 0
        L_0x0210:
            r3.f142810c = r8
            r3.f142811d = r15
            r3.f142812e = r10
            r3.f142813f = r7
            r3.f142814g = r9
            r3.f142815h = r4
            r3.f142816i = r6
            r3.f142817j = r5
            r3.f142818k = r14
            r3.f142819l = r13
            r3.f142820m = r12
            r3.f142821n = r11
            r3.f142822o = r2
            r3.f142823p = r1
            r5 = r19
            r3.f142824q = r5
            r5 = 3
            r3.f142827t = r5
            r16 = r4
            r4 = r0
            r5 = r10
            r6 = r16
            r0 = r7
            r7 = r20
            r19 = r8
            r8 = r17
            r17 = r9
            r9 = r3
            java.lang.Object r4 = r4.a(r5, r6, r7, r8, r9)
            r5 = r18
            if (r4 != r5) goto L_0x024c
            return r5
        L_0x024c:
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r16
            r12 = r17
            r13 = r19
            r14 = r0
        L_0x0256:
            r0 = r4
            com.sugarcube.core.network.models.SmartaPlacementResult r0 = (com.sugarcube.core.network.models.SmartaPlacementResult) r0
            r3.f142810c = r13
            r3.f142811d = r15
            r3.f142812e = r10
            r3.f142813f = r14
            r3.f142814g = r12
            r3.f142815h = r9
            r3.f142816i = r4
            r3.f142817j = r0
            r3.f142818k = r8
            r3.f142819l = r7
            r3.f142820m = r6
            r3.f142821n = r11
            r3.f142822o = r2
            r3.f142823p = r1
            r1 = 0
            r3.f142824q = r1
            r1 = 4
            r3.f142827t = r1
            java.lang.Object r0 = r13.l2(r0, r3)
            if (r0 != r5) goto L_0x0282
            return r5
        L_0x0282:
            r1 = r4
        L_0x0283:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.d1(kG.c, com.sugarcube.app.base.data.database.CachedCatalogItem, com.sugarcube.decorate_engine.SceneLayout, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x043c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x03d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d2(dI.C17164e<? super XH.C16807N> r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            boolean r2 = r1 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.D
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.decorate.v2.internal.ui.surface.h$D r2 = (com.sugarcube.decorate.v2.internal.ui.surface.h.D) r2
            int r3 = r2.f142734u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f142734u = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.decorate.v2.internal.ui.surface.h$D r2 = new com.sugarcube.decorate.v2.internal.ui.surface.h$D
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f142732s
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f142734u
            java.lang.String r8 = ""
            r9 = 3
            java.lang.String r11 = "Sugarcube"
            java.lang.String r12 = "Kt"
            r15 = 1
            java.lang.String r10 = " "
            r13 = 2
            r14 = 0
            if (r5 == 0) goto L_0x00a7
            if (r5 == r15) goto L_0x008c
            if (r5 == r13) goto L_0x005d
            if (r5 != r9) goto L_0x0055
            java.lang.Object r1 = r2.f142719f
            kG.c r1 = (kG.C17497c) r1
            java.lang.Object r1 = r2.f142718e
            kG.c r1 = (kG.C17497c) r1
            java.lang.Object r1 = r2.f142717d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f142716c
            com.sugarcube.decorate.v2.internal.ui.surface.h r1 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r1
            XH.y.b(r3)
            XH.x r3 = (XH.x) r3
            java.lang.Object r2 = r3.j()
            r24 = r11
            goto L_0x043d
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005d:
            int r1 = r2.f142726m
            boolean r5 = r2.f142725l
            java.lang.Object r6 = r2.f142724k
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r2.f142723j
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r2.f142722i
            com.sugarcube.core.logger.Priority r6 = (com.sugarcube.core.logger.Priority) r6
            java.lang.Object r6 = r2.f142721h
            com.sugarcube.decorate.v2.internal.ui.surface.h r6 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r6
            java.lang.Object r6 = r2.f142720g
            com.sugarcube.decorate.v2.internal.ui.surface.h r6 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r6
            java.lang.Object r6 = r2.f142719f
            kG.c r6 = (kG.C17497c) r6
            java.lang.Object r6 = r2.f142718e
            kG.c r6 = (kG.C17497c) r6
            java.lang.Object r7 = r2.f142717d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r9 = r2.f142716c
            com.sugarcube.decorate.v2.internal.ui.surface.h r9 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r9
            XH.y.b(r3)
            r24 = r11
            goto L_0x02bf
        L_0x008c:
            int r1 = r2.f142726m
            boolean r5 = r2.f142725l
            java.lang.Object r6 = r2.f142719f
            kG.c r6 = (kG.C17497c) r6
            java.lang.Object r7 = r2.f142718e
            kG.c r7 = (kG.C17497c) r7
            java.lang.Object r9 = r2.f142717d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r13 = r2.f142716c
            com.sugarcube.decorate.v2.internal.ui.surface.h r13 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r13
            XH.y.b(r3)
            r3 = r1
            r1 = r9
            goto L_0x0116
        L_0x00a7:
            XH.y.b(r3)
            TJ.P r3 = r34.f1()
            java.lang.Object r3 = r3.getValue()
            OG.l0 r3 = (OG.l0) r3
            kG.c r6 = r3.n()
            com.sugarcube.app.base.data.user.UserRepo r3 = r0.f142676q
            TJ.P r3 = r3.isLoggedIn()
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r5 = r3.booleanValue()
            if (r6 == 0) goto L_0x00d2
            boolean r3 = r6.j()
            if (r3 != r15) goto L_0x00d2
            r3 = r15
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            if (r6 == 0) goto L_0x00e9
            TJ.B r7 = r34.h1()
            java.lang.Object r7 = r7.getValue()
            OG.l0 r7 = (OG.l0) r7
            KJ.c r7 = r7.k()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x00ec
        L_0x00e9:
            r2 = r11
            goto L_0x054f
        L_0x00ec:
            if (r5 != 0) goto L_0x011d
            QJ.x r7 = QJ.C16343z.b(r14, r15, r14)
            r0.f142664P = r7
            TJ.B r7 = r34.h1()
            JG.a$c r9 = JG.C15930a.c.f135592a
            OG.n0.g(r7, r9)
            QJ.x<java.lang.Boolean> r7 = r0.f142664P
            r2.f142716c = r0
            r2.f142717d = r1
            r2.f142718e = r6
            r2.f142719f = r6
            r2.f142725l = r5
            r2.f142726m = r3
            r2.f142734u = r15
            java.lang.Object r7 = r7.f(r2)
            if (r7 != r4) goto L_0x0114
            return r4
        L_0x0114:
            r13 = r0
            r7 = r6
        L_0x0116:
            r9 = r13
            r33 = r7
            r7 = r6
            r6 = r33
            goto L_0x011f
        L_0x011d:
            r9 = r0
            r7 = r6
        L_0x011f:
            if (r3 == 0) goto L_0x0415
            com.sugarcube.core.logger.Priority r13 = com.sugarcube.core.logger.Priority.DEBUG
            int[] r23 = NG.p.f136494a
            int r24 = r13.ordinal()
            r14 = r23[r24]
            java.lang.String r0 = "showing rename new design popup"
            if (r14 == r15) goto L_0x0244
            r15 = 2
            if (r14 == r15) goto L_0x0204
            r15 = 3
            if (r14 == r15) goto L_0x01c3
            r15 = 4
            if (r14 == r15) goto L_0x0182
            r15 = 5
            if (r14 != r15) goto L_0x017c
            java.lang.Class r14 = r9.getClass()
            java.lang.String r14 = r14.getName()
            kotlin.jvm.internal.C17542s.g(r14)
            r35 = r3
            r26 = r4
            r24 = r11
            r4 = 0
            r11 = 2
            r15 = 36
            java.lang.String r3 = HJ.C15854t.s1(r14, r15, r4, r11, r4)
            r15 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r15, r4, r11, r4)
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0161
            goto L_0x0165
        L_0x0161:
            java.lang.String r14 = HJ.C15854t.P0(r3, r12)
        L_0x0165:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r10)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r14, r3)
            goto L_0x0283
        L_0x017c:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0182:
            r35 = r3
            r26 = r4
            r24 = r11
            java.lang.Class r3 = r9.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r4 = 36
            r11 = 2
            r14 = 0
            java.lang.String r15 = HJ.C15854t.s1(r3, r4, r14, r11, r14)
            r4 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r4, r14, r11, r14)
            int r4 = r15.length()
            if (r4 != 0) goto L_0x01a8
            goto L_0x01ac
        L_0x01a8:
            java.lang.String r3 = HJ.C15854t.P0(r15, r12)
        L_0x01ac:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r10)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r3, r4)
            goto L_0x0283
        L_0x01c3:
            r35 = r3
            r26 = r4
            r24 = r11
            java.lang.Class r3 = r9.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r4 = 36
            r11 = 2
            r14 = 0
            java.lang.String r15 = HJ.C15854t.s1(r3, r4, r14, r11, r14)
            r4 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r4, r14, r11, r14)
            int r4 = r15.length()
            if (r4 != 0) goto L_0x01e9
            goto L_0x01ed
        L_0x01e9:
            java.lang.String r3 = HJ.C15854t.P0(r15, r12)
        L_0x01ed:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r10)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.i(r3, r4)
            goto L_0x0283
        L_0x0204:
            r35 = r3
            r26 = r4
            r24 = r11
            java.lang.Class r3 = r9.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r4 = 36
            r11 = 2
            r14 = 0
            java.lang.String r15 = HJ.C15854t.s1(r3, r4, r14, r11, r14)
            r4 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r4, r14, r11, r14)
            int r4 = r15.length()
            if (r4 != 0) goto L_0x022a
            goto L_0x022e
        L_0x022a:
            java.lang.String r3 = HJ.C15854t.P0(r15, r12)
        L_0x022e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r10)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r3, r4)
            goto L_0x0283
        L_0x0244:
            r35 = r3
            r26 = r4
            r24 = r11
            java.lang.Class r3 = r9.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r4 = 36
            r11 = 2
            r14 = 0
            java.lang.String r15 = HJ.C15854t.s1(r3, r4, r14, r11, r14)
            r4 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r4, r14, r11, r14)
            int r4 = r15.length()
            if (r4 != 0) goto L_0x026a
            goto L_0x026e
        L_0x026a:
            java.lang.String r3 = HJ.C15854t.P0(r15, r12)
        L_0x026e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r10)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r3, r4)
        L_0x0283:
            TJ.B r3 = r9.h1()
            JG.a$f r4 = JG.C15930a.f.f135607a
            OG.n0.g(r3, r4)
            QJ.x<kG.c> r3 = r9.f142668T
            r2.f142716c = r9
            r2.f142717d = r1
            r2.f142718e = r6
            r2.f142719f = r7
            r2.f142720g = r9
            r2.f142721h = r9
            r2.f142722i = r13
            r2.f142723j = r0
            r2.f142724k = r8
            r2.f142725l = r5
            r0 = r35
            r2.f142726m = r0
            r4 = 0
            r2.f142727n = r4
            r2.f142728o = r4
            r2.f142729p = r4
            r2.f142730q = r4
            r2.f142731r = r4
            r4 = 2
            r2.f142734u = r4
            java.lang.Object r3 = r3.f(r2)
            r4 = r26
            if (r3 != r4) goto L_0x02bd
            return r4
        L_0x02bd:
            r7 = r1
            r1 = r0
        L_0x02bf:
            r0 = r3
            kG.c r0 = (kG.C17497c) r0
            com.sugarcube.core.logger.Priority r3 = com.sugarcube.core.logger.Priority.DEBUG
            int[] r11 = NG.q.f136495a
            int r3 = r3.ordinal()
            r3 = r11[r3]
            java.lang.String r11 = "unlocked new design rename completable"
            r13 = 1
            if (r3 == r13) goto L_0x03d5
            r13 = 2
            if (r3 == r13) goto L_0x0399
            r14 = 3
            if (r3 == r14) goto L_0x035c
            r14 = 4
            if (r3 == r14) goto L_0x031f
            r14 = 5
            if (r3 != r14) goto L_0x0319
            java.lang.Class r3 = r9.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r14 = 36
            r15 = 0
            java.lang.String r14 = HJ.C15854t.s1(r3, r14, r15, r13, r15)
            r35 = r0
            r0 = 46
            java.lang.String r0 = HJ.C15854t.o1(r14, r0, r15, r13, r15)
            int r13 = r0.length()
            if (r13 != 0) goto L_0x02fe
            goto L_0x0302
        L_0x02fe:
            java.lang.String r3 = HJ.C15854t.P0(r0, r12)
        L_0x0302:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r3, r0)
            goto L_0x0410
        L_0x0319:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x031f:
            r35 = r0
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            r3 = 36
            r13 = 2
            r14 = 0
            java.lang.String r3 = HJ.C15854t.s1(r0, r3, r14, r13, r14)
            r15 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r15, r14, r13, r14)
            int r13 = r3.length()
            if (r13 != 0) goto L_0x0341
            goto L_0x0345
        L_0x0341:
            java.lang.String r0 = HJ.C15854t.P0(r3, r12)
        L_0x0345:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r10)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r0, r3)
            goto L_0x0410
        L_0x035c:
            r35 = r0
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            r3 = 36
            r13 = 2
            r14 = 0
            java.lang.String r3 = HJ.C15854t.s1(r0, r3, r14, r13, r14)
            r15 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r15, r14, r13, r14)
            int r13 = r3.length()
            if (r13 != 0) goto L_0x037e
            goto L_0x0382
        L_0x037e:
            java.lang.String r0 = HJ.C15854t.P0(r3, r12)
        L_0x0382:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r10)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.i(r0, r3)
            goto L_0x0410
        L_0x0399:
            r35 = r0
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            r3 = 36
            r13 = 2
            r14 = 0
            java.lang.String r3 = HJ.C15854t.s1(r0, r3, r14, r13, r14)
            r15 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r15, r14, r13, r14)
            int r13 = r3.length()
            if (r13 != 0) goto L_0x03bb
            goto L_0x03bf
        L_0x03bb:
            java.lang.String r0 = HJ.C15854t.P0(r3, r12)
        L_0x03bf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r10)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r0, r3)
            goto L_0x0410
        L_0x03d5:
            r35 = r0
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            r3 = 36
            r13 = 2
            r14 = 0
            java.lang.String r3 = HJ.C15854t.s1(r0, r3, r14, r13, r14)
            r15 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r15, r14, r13, r14)
            int r13 = r3.length()
            if (r13 != 0) goto L_0x03f7
            goto L_0x03fb
        L_0x03f7:
            java.lang.String r0 = HJ.C15854t.P0(r3, r12)
        L_0x03fb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r10)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r0, r3)
        L_0x0410:
            r0 = r35
            r3 = r1
        L_0x0413:
            r1 = r9
            goto L_0x041b
        L_0x0415:
            r0 = r3
            r24 = r11
            r0 = r7
            r7 = r1
            goto L_0x0413
        L_0x041b:
            hG.v r9 = r1.f142678s
            if (r3 == 0) goto L_0x0421
            r11 = 1
            goto L_0x0422
        L_0x0421:
            r11 = 0
        L_0x0422:
            r9.d0(r11)
            com.sugarcube.decorate.v2.internal.usecase.SaveDesignUseCase r9 = r1.f142685z
            r2.f142716c = r1
            r2.f142717d = r7
            r2.f142718e = r6
            r2.f142719f = r0
            r2.f142725l = r5
            r2.f142726m = r3
            r3 = 3
            r2.f142734u = r3
            java.lang.Object r2 = r9.m78savegIAlus(r0, r2)
            if (r2 != r4) goto L_0x043d
            return r4
        L_0x043d:
            java.lang.Throwable r0 = XH.x.e(r2)
            if (r0 != 0) goto L_0x049a
            XH.v r2 = (XH.v) r2
            java.lang.Object r0 = r2.d()
            kG.c r0 = (kG.C17497c) r0
            r1.h2(r0)
            TJ.B r0 = r1.h1()
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            OG.l0 r3 = (OG.l0) r3
            r31 = 133955583(0x7fbffff, float:3.7916743E-34)
            r32 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
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
            OG.l0.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            TJ.B r0 = r1.h1()
            java.lang.Object r1 = r2.c()
            MG.b r1 = (MG.C16033b) r1
            OG.n0.j(r0, r1)
            goto L_0x054c
        L_0x049a:
            com.sugarcube.core.logger.Priority r2 = com.sugarcube.core.logger.Priority.ERROR
            java.lang.String r3 = r0.getMessage()
            if (r3 != 0) goto L_0x04a3
            r3 = r8
        L_0x04a3:
            java.lang.String r0 = XH.C16816g.b(r0)
            if (r0 != 0) goto L_0x04aa
            goto L_0x04ab
        L_0x04aa:
            r8 = r0
        L_0x04ab:
            int[] r0 = NG.s.f136497a
            int r2 = r2.ordinal()
            r0 = r0[r2]
            r2 = 1
            if (r0 == r2) goto L_0x0528
            r2 = 2
            if (r0 == r2) goto L_0x0510
            r2 = 3
            if (r0 == r2) goto L_0x04f8
            r2 = 4
            if (r0 == r2) goto L_0x04e0
            r2 = 5
            if (r0 != r2) goto L_0x04da
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r2 = r24
            android.util.Log.e(r2, r0)
            goto L_0x053f
        L_0x04da:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x04e0:
            r2 = r24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r2, r0)
            goto L_0x053f
        L_0x04f8:
            r2 = r24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r2, r0)
            goto L_0x053f
        L_0x0510:
            r2 = r24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
            goto L_0x053f
        L_0x0528:
            r2 = r24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L_0x053f:
            com.sugarcube.common.UiText$CompositeResource r0 = new com.sugarcube.common.UiText$CompositeResource
            int r2 = OE.n.f113336b5
            r3 = 2
            r4 = 0
            r0.<init>(r2, r4, r3, r4)
            r2 = 0
            o2(r1, r0, r2, r3, r4)
        L_0x054c:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x054f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "saveDesign(...) failed to complete because composition is empty"
            r0.<init>(r1)
            com.sugarcube.core.logger.Priority r1 = com.sugarcube.core.logger.Priority.ERROR
            java.lang.String r3 = r0.getMessage()
            if (r3 != 0) goto L_0x055f
            r3 = r8
        L_0x055f:
            java.lang.String r0 = XH.C16816g.b(r0)
            if (r0 != 0) goto L_0x0566
            goto L_0x0567
        L_0x0566:
            r8 = r0
        L_0x0567:
            int[] r0 = NG.r.f136496a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x05dc
            r1 = 2
            if (r0 == r1) goto L_0x05c6
            r1 = 3
            if (r0 == r1) goto L_0x05b0
            r1 = 4
            if (r0 == r1) goto L_0x059a
            r1 = 5
            if (r0 != r1) goto L_0x0594
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r2, r0)
            goto L_0x05f1
        L_0x0594:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x059a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r2, r0)
            goto L_0x05f1
        L_0x05b0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r2, r0)
            goto L_0x05f1
        L_0x05c6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
            goto L_0x05f1
        L_0x05dc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L_0x05f1:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.d2(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final C16505B<l0> h1() {
        return this.f142655G.a();
    }

    /* access modifiers changed from: private */
    public final void h2(C17497c cVar) {
        C16505B<l0> h12 = h1();
        C16505B<l0> b10 = h12;
        b10.setValue(l0.b(h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, cVar, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134086655, (Object) null));
        this.f142678s.n0(cVar);
    }

    /* access modifiers changed from: private */
    public final void j1(C17597b bVar) {
        j2(bVar != null ? new v0(bVar, false, 2, (DefaultConstructorMarker) null) : null);
        F0 f02 = this.f142670X;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f142670X = C16314k.d(this.f142650B, (C17168i) null, (T) null, new C3481h(this, (C17164e<? super C3481h>) null), 3, (Object) null);
    }

    private final void k1(boolean z10, nI.p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        F0 unused = C16314k.d(this.f142650B, new i(N.f137593c0, this, z10), (T) null, new j(pVar, (C17164e<? super j>) null), 2, (Object) null);
    }

    static /* synthetic */ void l1(h hVar, boolean z10, nI.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        hVar.k1(z10, pVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l2(com.sugarcube.core.network.models.SmartaPlacementResult r12, dI.C17164e<? super XH.C16807N> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.E
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.sugarcube.decorate.v2.internal.ui.surface.h$E r0 = (com.sugarcube.decorate.v2.internal.ui.surface.h.E) r0
            int r1 = r0.f142740h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142740h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v2.internal.ui.surface.h$E r0 = new com.sugarcube.decorate.v2.internal.ui.surface.h$E
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f142738f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142740h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r12 = r0.f142737e
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f142736d
            com.sugarcube.core.network.models.SmartaPlacementResult r12 = (com.sugarcube.core.network.models.SmartaPlacementResult) r12
            java.lang.Object r13 = r0.f142735c
            com.sugarcube.decorate.v2.internal.ui.surface.h r13 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r13
            XH.y.b(r1)
            goto L_0x0054
        L_0x0035:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003d:
            XH.y.b(r1)
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r11.f142675p
            com.sugarcube.app.base.data.feature.ConfigItems$SmartaPlacementDebugMessage r3 = com.sugarcube.app.base.data.feature.ConfigItems.SmartaPlacementDebugMessage.INSTANCE
            r0.f142735c = r11
            r0.f142736d = r12
            r0.f142737e = r13
            r0.f142740h = r4
            java.lang.Object r1 = r1.get(r3, r0)
            if (r1 != r2) goto L_0x0053
            return r2
        L_0x0053:
            r13 = r11
        L_0x0054:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x0204
            if (r12 != 0) goto L_0x0060
            goto L_0x0204
        L_0x0060:
            java.lang.Long r0 = r12.getLatency()
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x006e
        L_0x006c:
            java.lang.String r0 = "Exceeded"
        L_0x006e:
            java.lang.String r1 = r12.getErrorMessage()
            if (r1 != 0) goto L_0x0076
            java.lang.String r1 = "Unknown"
        L_0x0076:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.getResult()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Smarta Placement Status: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = "\n"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Request Latency: "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = " ms"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.append(r0)
            boolean r12 = r12.getError()
            if (r12 == 0) goto L_0x00cb
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "\nFailure Reason: "
            r12.append(r0)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            r2.append(r12)
        L_0x00cb:
            java.lang.String r12 = r2.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r12, r0)
            com.sugarcube.core.logger.Priority r0 = com.sugarcube.core.logger.Priority.DEBUG
            java.lang.String r1 = ""
            if (r12 != 0) goto L_0x00dc
            r2 = r1
            goto L_0x00dd
        L_0x00dc:
            r2 = r12
        L_0x00dd:
            int[] r3 = NG.t.f136498a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            java.lang.String r3 = " "
            java.lang.String r5 = "Kt"
            r6 = 46
            r7 = 36
            java.lang.Class<com.sugarcube.core.network.models.SmartaPlacementResult> r8 = com.sugarcube.core.network.models.SmartaPlacementResult.class
            r9 = 2
            r10 = 0
            if (r0 == r4) goto L_0x01c6
            if (r0 == r9) goto L_0x0196
            r4 = 3
            if (r0 == r4) goto L_0x0166
            r4 = 4
            if (r0 == r4) goto L_0x0135
            r4 = 5
            if (r0 != r4) goto L_0x012f
            java.lang.String r0 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            java.lang.String r4 = HJ.C15854t.s1(r0, r7, r10, r9, r10)
            java.lang.String r4 = HJ.C15854t.o1(r4, r6, r10, r9, r10)
            int r6 = r4.length()
            if (r6 != 0) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            java.lang.String r0 = HJ.C15854t.P0(r4, r5)
        L_0x0118:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r0, r1)
            goto L_0x01f5
        L_0x012f:
            XH.t r12 = new XH.t
            r12.<init>()
            throw r12
        L_0x0135:
            java.lang.String r0 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            java.lang.String r4 = HJ.C15854t.s1(r0, r7, r10, r9, r10)
            java.lang.String r4 = HJ.C15854t.o1(r4, r6, r10, r9, r10)
            int r6 = r4.length()
            if (r6 != 0) goto L_0x014b
            goto L_0x014f
        L_0x014b:
            java.lang.String r0 = HJ.C15854t.P0(r4, r5)
        L_0x014f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.w(r0, r1)
            goto L_0x01f5
        L_0x0166:
            java.lang.String r0 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            java.lang.String r4 = HJ.C15854t.s1(r0, r7, r10, r9, r10)
            java.lang.String r4 = HJ.C15854t.o1(r4, r6, r10, r9, r10)
            int r6 = r4.length()
            if (r6 != 0) goto L_0x017c
            goto L_0x0180
        L_0x017c:
            java.lang.String r0 = HJ.C15854t.P0(r4, r5)
        L_0x0180:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.i(r0, r1)
            goto L_0x01f5
        L_0x0196:
            java.lang.String r0 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            java.lang.String r4 = HJ.C15854t.s1(r0, r7, r10, r9, r10)
            java.lang.String r4 = HJ.C15854t.o1(r4, r6, r10, r9, r10)
            int r6 = r4.length()
            if (r6 != 0) goto L_0x01ac
            goto L_0x01b0
        L_0x01ac:
            java.lang.String r0 = HJ.C15854t.P0(r4, r5)
        L_0x01b0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.d(r0, r1)
            goto L_0x01f5
        L_0x01c6:
            java.lang.String r0 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            java.lang.String r4 = HJ.C15854t.s1(r0, r7, r10, r9, r10)
            java.lang.String r4 = HJ.C15854t.o1(r4, r6, r10, r9, r10)
            int r6 = r4.length()
            if (r6 != 0) goto L_0x01dc
            goto L_0x01e0
        L_0x01dc:
            java.lang.String r0 = HJ.C15854t.P0(r4, r5)
        L_0x01e0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.v(r0, r1)
        L_0x01f5:
            TJ.B r13 = r13.h1()
            MG.b$b r0 = new MG.b$b
            r0.<init>(r12)
            OG.n0.j(r13, r0)
            XH.N r12 = XH.C16807N.f139792a
            return r12
        L_0x0204:
            XH.N r12 = XH.C16807N.f139792a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.l2(com.sugarcube.core.network.models.SmartaPlacementResult, dI.e):java.lang.Object");
    }

    private final void m1(nI.p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        F0 unused = C16314k.d(this.f142651C, new k(N.f137593c0, this), (T) null, new l(pVar, (C17164e<? super l>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m2(dI.C17164e<? super XH.C16807N> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.F
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.sugarcube.decorate.v2.internal.ui.surface.h$F r0 = (com.sugarcube.decorate.v2.internal.ui.surface.h.F) r0
            int r1 = r0.f142748j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142748j = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v2.internal.ui.surface.h$F r0 = new com.sugarcube.decorate.v2.internal.ui.surface.h$F
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f142746h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142748j
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0050
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r11 = r0.f142743e
            IJ.b$a r11 = (IJ.C15906b.a) r11
            java.lang.Object r11 = r0.f142742d
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r0.f142741c
            com.sugarcube.decorate.v2.internal.ui.surface.h r11 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r11
            XH.y.b(r1)
            goto L_0x0088
        L_0x0038:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0040:
            java.lang.Object r11 = r0.f142742d
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r3 = r0.f142741c
            com.sugarcube.decorate.v2.internal.ui.surface.h r3 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r3
            XH.y.b(r1)
            r9 = r1
            r1 = r11
            r11 = r3
            r3 = r9
            goto L_0x0065
        L_0x0050:
            XH.y.b(r1)
            LG.b r1 = r10.f142682w
            r0.f142741c = r10
            r0.f142742d = r11
            r0.f142748j = r5
            java.lang.Object r1 = r1.d(r0)
            if (r1 != r2) goto L_0x0062
            return r2
        L_0x0062:
            r3 = r1
            r1 = r11
            r11 = r10
        L_0x0065:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x00ad
            IJ.b$a r6 = IJ.C15906b.f135496b
            IJ.e r7 = IJ.C15909e.SECONDS
            long r7 = IJ.C15908d.s(r5, r7)
            r0.f142741c = r11
            r0.f142742d = r1
            r0.f142743e = r6
            r0.f142744f = r3
            r0.f142745g = r5
            r0.f142748j = r4
            java.lang.Object r0 = QJ.C16297b0.c(r7, r0)
            if (r0 != r2) goto L_0x0088
            return r2
        L_0x0088:
            kG.c r0 = r11.Z0()
            boolean r0 = r0.j()
            TJ.B r1 = r11.h1()
            java.lang.Object r1 = r1.getValue()
            OG.l0 r1 = (OG.l0) r1
            KJ.c r1 = r1.k()
            int r1 = r1.size()
            if (r0 == 0) goto L_0x00ad
            if (r1 <= 0) goto L_0x00ad
            TJ.B r11 = r11.h1()
            OG.n0.i(r11, r5)
        L_0x00ad:
            XH.N r11 = XH.C16807N.f139792a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.m2(dI.e):java.lang.Object");
    }

    private final void n1() {
        m1(new m(this, (C17164e<? super m>) null));
        m1(new n(this, (C17164e<? super n>) null));
        l1(this, false, new o(this, (C17164e<? super o>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void n2(UiText uiText, boolean z10) {
        l1(this, false, new G(this, uiText, z10, (C17164e<? super G>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void o1() {
        this.f142678s.T(Design.Menu.Add);
        C16505B<l0> h12 = h1();
        C18048l.b bVar = r4;
        C18048l.b bVar2 = new C18048l.b((List) null, true, false, (String) null, (String) null, (C15987c) null, (QuickFilter) null, false, 0, 509, (DefaultConstructorMarker) null);
        h12.setValue(l0.b(h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, bVar, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134213631, (Object) null));
    }

    static /* synthetic */ void o2(h hVar, UiText uiText, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        hVar.n2(uiText, z10);
    }

    /* access modifiers changed from: private */
    public final void p1(CachedCatalogItem cachedCatalogItem) {
        n0.j(h1(), new C16033b.d((String) null, Integer.valueOf(OE.n.f113341c3), 1, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public final void p2() {
        F0 f02 = this.f142671Y;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f142671Y = C16314k.d(g0.a(this), (C17168i) null, (T) null, new H(this, (C17164e<? super H>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void q1() {
        if (V0() == null) {
            f2(new sG.r(false, (sG.q) null, (UiText) null, (CartUseCase.a) null, 15, (DefaultConstructorMarker) null));
            this.f142678s.T(Design.Menu.Buy);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r0 = r0.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void q2(boolean r5) {
        /*
            r4 = this;
            TJ.P r0 = r4.f1()
            java.lang.Object r0 = r0.getValue()
            OG.l0 r0 = (OG.l0) r0
            kG.c r0 = r0.n()
            r1 = 0
            if (r0 == 0) goto L_0x001c
            java.util.UUID r0 = r0.d()
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.toString()
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            androidx.lifecycle.K<java.lang.String> r2 = r4.f142661M
            r3 = 1
            if (r5 != r3) goto L_0x0023
            r1 = r0
        L_0x0023:
            r2.postValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.q2(boolean):void");
    }

    /* access modifiers changed from: private */
    public final void r1() {
        this.f142672m.y(true);
    }

    /* access modifiers changed from: private */
    public final Object s1(C17164e<? super C16807N> eVar) {
        this.f142678s.T(Design.Menu.Remove);
        Object removeSelectedItemFromDesign = this.f142656H.removeSelectedItemFromDesign(eVar);
        return removeSelectedItemFromDesign == C17187b.f() ? removeSelectedItemFromDesign : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r3 = a2(Z0(), (r0 = (r0 = (r0 = r0.e()).e()).d()), r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t1(dI.C17164e<? super XH.C16807N> r3) {
        /*
            r2 = this;
            hG.v r0 = r2.f142678s
            com.sugarcube.core.analytics.Design$Menu r1 = com.sugarcube.core.analytics.Design.Menu.DuplicateItem
            r0.T(r1)
            OG.v0 r0 = r2.b1()
            if (r0 == 0) goto L_0x002e
            mG.b r0 = r0.e()
            if (r0 == 0) goto L_0x002e
            RF.k r0 = r0.e()
            if (r0 == 0) goto L_0x002e
            com.sugarcube.app.base.data.database.CachedCatalogItem r0 = r0.d()
            if (r0 == 0) goto L_0x002e
            kG.c r1 = r2.Z0()
            java.lang.Object r3 = r2.a2(r1, r0, r3)
            java.lang.Object r0 = eI.C17187b.f()
            if (r3 != r0) goto L_0x002e
            return r3
        L_0x002e:
            XH.N r3 = XH.C16807N.f139792a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.t1(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void u1() {
        this.f142678s.T(Design.Menu.Erase);
        this.f142658J.toggleMagicEraser();
    }

    /* access modifiers changed from: private */
    public final Object v1(C17164e<? super C16807N> eVar) {
        this.f142678s.M();
        Object b22 = b2(C16219E.e.EXIT, true, new p(this, (C17164e<? super p>) null), eVar);
        return b22 == C17187b.f() ? b22 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w1(dI.C17164e<? super XH.C16807N> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.q
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.sugarcube.decorate.v2.internal.ui.surface.h$q r0 = (com.sugarcube.decorate.v2.internal.ui.surface.h.q) r0
            int r1 = r0.f142887g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142887g = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v2.internal.ui.surface.h$q r0 = new com.sugarcube.decorate.v2.internal.ui.surface.h$q
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f142885e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142887g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f142884d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f142883c
            com.sugarcube.decorate.v2.internal.ui.surface.h r6 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r6
            XH.y.b(r1)
            goto L_0x0050
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            LG.b r1 = r5.f142682w
            kG.c r3 = r5.Z0()
            r0.f142883c = r5
            r0.f142884d = r6
            r0.f142887g = r4
            java.lang.Object r6 = r1.a(r3, r0)
            if (r6 != r2) goto L_0x004f
            return r2
        L_0x004f:
            r6 = r5
        L_0x0050:
            TJ.B r6 = r6.h1()
            r0 = 0
            OG.n0.i(r6, r0)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.w1(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x1(int r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.r
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.sugarcube.decorate.v2.internal.ui.surface.h$r r0 = (com.sugarcube.decorate.v2.internal.ui.surface.h.r) r0
            int r1 = r0.f142893h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142893h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v2.internal.ui.surface.h$r r0 = new com.sugarcube.decorate.v2.internal.ui.surface.h$r
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f142891f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142893h
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x004d
            if (r3 == r5) goto L_0x003c
            if (r3 != r4) goto L_0x0034
            java.lang.Object r8 = r0.f142889d
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f142888c
            com.sugarcube.decorate.v2.internal.ui.surface.h r8 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r8
            XH.y.b(r1)
            goto L_0x007f
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            int r8 = r0.f142890e
            java.lang.Object r9 = r0.f142889d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r3 = r0.f142888c
            com.sugarcube.decorate.v2.internal.ui.surface.h r3 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r3
            XH.y.b(r1)
            r1 = r9
            r9 = r8
            r8 = r3
            goto L_0x0068
        L_0x004d:
            XH.y.b(r1)
            LG.b r1 = r7.f142682w
            kG.c r3 = r7.Z0()
            r0.f142888c = r7
            r0.f142889d = r9
            r0.f142890e = r8
            r0.f142893h = r5
            java.lang.Object r1 = r1.b(r8, r3, r0)
            if (r1 != r2) goto L_0x0065
            return r2
        L_0x0065:
            r1 = r9
            r9 = r8
            r8 = r7
        L_0x0068:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r5 = 2
            long r5 = r3.toMillis(r5)
            r0.f142888c = r8
            r0.f142889d = r1
            r0.f142890e = r9
            r0.f142893h = r4
            java.lang.Object r9 = QJ.C16297b0.b(r5, r0)
            if (r9 != r2) goto L_0x007f
            return r2
        L_0x007f:
            TJ.B r8 = r8.h1()
            r9 = 0
            OG.n0.i(r8, r9)
            XH.N r8 = XH.C16807N.f139792a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.x1(int, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void y1() {
        this.f142656H.flipSelectedItem();
        this.f142678s.Q();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z1(com.sugarcube.app.base.data.database.CachedCatalogItem r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sugarcube.decorate.v2.internal.ui.surface.h.s
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.sugarcube.decorate.v2.internal.ui.surface.h$s r0 = (com.sugarcube.decorate.v2.internal.ui.surface.h.s) r0
            int r1 = r0.f142899h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142899h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v2.internal.ui.surface.h$s r0 = new com.sugarcube.decorate.v2.internal.ui.surface.h$s
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f142897f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142899h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f142896e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f142895d
            com.sugarcube.app.base.data.database.CachedCatalogItem r6 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r6
            java.lang.Object r7 = r0.f142894c
            com.sugarcube.decorate.v2.internal.ui.surface.h r7 = (com.sugarcube.decorate.v2.internal.ui.surface.h) r7
            XH.y.b(r1)
            goto L_0x0064
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            OG.u0 r1 = r5.Y0()
            nG.a$a r1 = r1.d()
            r3 = 0
            nG.a$a r1 = r1.a(r3)
            r5.k2(r1)
            kG.c r1 = r5.Z0()
            r0.f142894c = r5
            r0.f142895d = r6
            r0.f142896e = r7
            r0.f142899h = r4
            java.lang.Object r7 = r5.a2(r1, r6, r0)
            if (r7 != r2) goto L_0x0063
            return r2
        L_0x0063:
            r7 = r5
        L_0x0064:
            hG.v r7 = r7.f142678s
            r7.Z(r6)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.h.z1(com.sugarcube.app.base.data.database.CachedCatalogItem, dI.e):java.lang.Object");
    }

    public final sG.r V0() {
        return f1().getValue().e();
    }

    public final DecorateEngineController W0() {
        return this.f142672m.getEngineController();
    }

    public final androidx.lifecycle.F<String> X0() {
        return this.f142662N;
    }

    public final u0 Y0() {
        return h1().getValue().p();
    }

    public final C17597b a1() {
        v0 q10 = f1().getValue().q();
        if (q10 != null) {
            return q10.e();
        }
        return null;
    }

    public void applyFilter(QuickFilter quickFilter) {
        C17542s.j(quickFilter, "filter");
        this.f142653E.applyFilter(quickFilter);
    }

    public final v0 b1() {
        return f1().getValue().q();
    }

    public final androidx.lifecycle.F<Intent> c1() {
        return this.f142660L;
    }

    public final C17621a e1() {
        return h1().getValue().p().c();
    }

    public final void e2(C18048l lVar) {
        C16505B<l0> h12 = h1();
        C16505B<l0> b10 = h12;
        b10.setValue(l0.b(h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, lVar, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134213631, (Object) null));
    }

    public final C16519P<l0> f1() {
        return h1();
    }

    public final void f2(sG.r rVar) {
        C16505B<l0> h12 = h1();
        C16505B<l0> b10 = h12;
        b10.setValue(l0.b(h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, rVar, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134215679, (Object) null));
    }

    public Object fetchItems(RoomType roomType, C17164e<? super C16807N> eVar) {
        return this.f142653E.fetchItems(roomType, eVar);
    }

    public Object fetchVariants(CachedCatalogItem cachedCatalogItem, C17164e<? super C16807N> eVar) {
        return this.f142654F.fetchVariants(cachedCatalogItem, eVar);
    }

    public final TouchManager g1() {
        return this.f142672m.J();
    }

    public final void g2(u0 u0Var) {
        C17542s.j(u0Var, "value");
        C16505B<l0> h12 = h1();
        C16505B<l0> b10 = h12;
        b10.setValue(l0.b(h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, u0Var, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134201343, (Object) null));
    }

    public C14768a getFormattedPrice(float f10) {
        return this.f142654F.getFormattedPrice(f10);
    }

    public final void i1(a aVar) {
        C17542s.j(aVar, "event");
        l1(this, false, new C17153g(aVar, this, (C17164e<? super C17153g>) null), 1, (Object) null);
    }

    public final void i2(C17597b bVar) {
        v0 q10;
        C17597b bVar2 = bVar;
        C16505B<l0> h12 = h1();
        l0 value = h1().getValue();
        v0 v0Var = null;
        if (!(bVar2 == null || (q10 = h1().getValue().q()) == null)) {
            v0Var = v0.b(q10, bVar2, false, 2, (Object) null);
        }
        h12.setValue(l0.b(value, false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, v0Var, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217599, (Object) null));
    }

    public final void j2(v0 v0Var) {
        C16505B<l0> h12 = h1();
        C16505B<l0> b10 = h12;
        b10.setValue(l0.b(h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, v0Var, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217599, (Object) null));
    }

    public final void k2(C17621a aVar) {
        h1().setValue(l0.b(h1().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (sG.r) null, (C18048l) null, (C16569f) null, u0.b(h1().getValue().p(), (C17621a.d) null, (C17621a.C3532a) null, (C17621a.c) null, (C17621a.b) null, aVar, 15, (Object) null), (t0) null, (YG.l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134201343, (Object) null));
    }

    public Object loadMore(RoomType roomType, C17164e<? super C16807N> eVar) {
        return this.f142653E.loadMore(roomType, eVar);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        int i10 = NG.o.f136493a[Priority.DEBUG.ordinal()];
        Class<h> cls = h.class;
        if (i10 == 1) {
            String name = cls.getName();
            C17542s.g(name);
            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o12.length() != 0) {
                name = C15854t.P0(o12, "Kt");
            }
            Log.v(name, "Destroying DecorateSurfaceViewModel" + " " + "");
        } else if (i10 == 2) {
            String name2 = cls.getName();
            C17542s.g(name2);
            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o13.length() != 0) {
                name2 = C15854t.P0(o13, "Kt");
            }
            Log.d(name2, "Destroying DecorateSurfaceViewModel" + " " + "");
        } else if (i10 == 3) {
            String name3 = cls.getName();
            C17542s.g(name3);
            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o14.length() != 0) {
                name3 = C15854t.P0(o14, "Kt");
            }
            Log.i(name3, "Destroying DecorateSurfaceViewModel" + " " + "");
        } else if (i10 == 4) {
            String name4 = cls.getName();
            C17542s.g(name4);
            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o15.length() != 0) {
                name4 = C15854t.P0(o15, "Kt");
            }
            Log.w(name4, "Destroying DecorateSurfaceViewModel" + " " + "");
        } else if (i10 == 5) {
            String name5 = cls.getName();
            C17542s.g(name5);
            String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o16.length() != 0) {
                name5 = C15854t.P0(o16, "Kt");
            }
            Log.e(name5, "Destroying DecorateSurfaceViewModel" + " " + "");
        } else {
            throw new XH.t();
        }
        this.f142672m.cleanUp();
        super.onCleared();
    }
}
