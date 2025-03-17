package DF;

import AF.C12603x;
import HJ.C15854t;
import KF.C13147a;
import KF.C13151e;
import KF.C13164r;
import NF.C13292f;
import OE.n;
import OE.q;
import QJ.C16297b0;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import TJ.C16505B;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import U0.C4899r0;
import U0.o1;
import W2.f;
import XH.C16807N;
import XH.C16818i;
import XH.C16820k;
import XH.t;
import XH.y;
import YH.C16877v;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.C5204g;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.g0;
import bI.C17035a;
import com.adjust.sdk.Constants;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.AnalyticsManager;
import com.sugarcube.app.base.data.Result;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.asset.VideoAssetRepository;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.database.SceneState;
import com.sugarcube.app.base.data.feature.ConfigItems;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.ConfigState;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.data.model.Design;
import com.sugarcube.app.base.data.model.PendingComposition;
import com.sugarcube.app.base.data.preferences.PreferenceImpl;
import com.sugarcube.app.base.data.preferences.PreferenceStorage;
import com.sugarcube.app.base.data.source.CatalogRepository;
import com.sugarcube.app.base.data.source.CompositionRepository;
import com.sugarcube.app.base.data.source.CompositionRepositorySource;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase;
import com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState;
import com.sugarcube.app.base.external.config.a;
import com.sugarcube.app.base.external.shoppinglist.AddToShoppingListUseCase;
import com.sugarcube.app.base.external.shoppinglist.FetchShoppingListItemsUseCase;
import com.sugarcube.app.base.network.NetworkClient;
import com.sugarcube.app.base.network.NetworkLiveData;
import com.sugarcube.app.base.network.NetworkStatus;
import com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar;
import com.sugarcube.app.base.ui.gallery.h;
import com.sugarcube.app.base.upload.IUploaderV2;
import com.sugarcube.app.base.upload.g;
import com.sugarcube.core.analytics.ActionType;
import com.sugarcube.core.analytics.Event;
import com.sugarcube.core.analytics.Gallery;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.logger.Priority;
import com.sugarcube.core.network.models.AuthType;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.LoggedInUser;
import com.sugarcube.core.network.models.PlacedFurniture;
import com.sugarcube.core.network.models.Showroom;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kF.C14683D;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import nI.s;
import tF.C15083h;
import tF.C15091p;
import x4.C8951o;
import xF.C15226a;

@Metadata(d1 = {"\u0000¢\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0002µ\u0003B¹\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J'\u00105\u001a\u0002042\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u000200H\u0002¢\u0006\u0004\b5\u00106J\u0017\u0010:\u001a\u0002092\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J\u001b\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0<H\u0002¢\u0006\u0004\b?\u0010@J\u001b\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0<H\u0002¢\u0006\u0004\bA\u0010@J\u001b\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0=0BH\u0002¢\u0006\u0004\bD\u0010EJ=\u0010J\u001a\b\u0012\u0004\u0012\u00020>0=2\u0012\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0=0B2\u0012\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0=0BH\u0002¢\u0006\u0004\bJ\u0010KJ\u001d\u0010M\u001a\u0002092\f\u0010L\u001a\b\u0012\u0004\u0012\u00020F0=H\u0002¢\u0006\u0004\bM\u0010NJ=\u0010Q\u001a\b\u0012\u0004\u0012\u00020>0=2\u0012\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0=0B2\u0012\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0=0BH\u0002¢\u0006\u0004\bQ\u0010KJ\u001b\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0=0BH\u0002¢\u0006\u0004\bR\u0010EJ=\u0010W\u001a\b\u0012\u0004\u0012\u00020C0=2\u0012\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0=0B2\u0012\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0=0BH\u0002¢\u0006\u0004\bW\u0010KJ\u001a\u0010Y\u001a\u0002002\b\b\u0002\u0010X\u001a\u000200H@¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\\2\u0006\u0010[\u001a\u00020SH\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u000209H\u0002¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u000209H\u0002¢\u0006\u0004\ba\u0010`J\u000f\u0010b\u001a\u000209H\u0002¢\u0006\u0004\bb\u0010`J\r\u0010c\u001a\u000209¢\u0006\u0004\bc\u0010`J\r\u0010d\u001a\u000209¢\u0006\u0004\bd\u0010`J\u0015\u0010g\u001a\u0002092\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bg\u0010hJ\u0017\u0010j\u001a\u0002092\b\b\u0002\u0010i\u001a\u000200¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u0002092\b\b\u0002\u0010i\u001a\u000200¢\u0006\u0004\bl\u0010kJ\u0017\u0010m\u001a\u0002092\b\b\u0002\u0010i\u001a\u000200¢\u0006\u0004\bm\u0010kJ\u0015\u0010o\u001a\u0002092\u0006\u0010n\u001a\u000204¢\u0006\u0004\bo\u0010pJ\u001b\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0=0qH\u0001¢\u0006\u0004\br\u0010sJ\u001b\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0=0qH\u0001¢\u0006\u0004\bt\u0010sJ\u0015\u0010w\u001a\u0002092\u0006\u0010v\u001a\u00020u¢\u0006\u0004\bw\u0010xJ\r\u0010y\u001a\u000209¢\u0006\u0004\by\u0010`J\r\u0010z\u001a\u000209¢\u0006\u0004\bz\u0010`J\r\u0010{\u001a\u000209¢\u0006\u0004\b{\u0010`J#\u0010~\u001a\u0002092\u0006\u0010|\u001a\u0002002\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\\0=¢\u0006\u0004\b~\u0010J\u000f\u0010\u0001\u001a\u000209¢\u0006\u0005\b\u0001\u0010`J\u000f\u0010\u0001\u001a\u000209¢\u0006\u0005\b\u0001\u0010`J\u000f\u0010\u0001\u001a\u000209¢\u0006\u0005\b\u0001\u0010`J\u0019\u0010\u0001\u001a\u0002092\b\u0010v\u001a\u0004\u0018\u00010u¢\u0006\u0005\b\u0001\u0010xJ\u000f\u0010\u0001\u001a\u000209¢\u0006\u0005\b\u0001\u0010`J\u0019\u0010\u0001\u001a\u0002092\b\u0010v\u001a\u0004\u0018\u00010u¢\u0006\u0005\b\u0001\u0010xJ\u0012\u0010\u0001\u001a\u0004\u0018\u00010F¢\u0006\u0006\b\u0001\u0010\u0001J\u0012\u0010\u0001\u001a\u0004\u0018\u00010u¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0012\u0010\u0001\u001a\u0004\u0018\u00010\\¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\u00030\u00012\u0006\u0010v\u001a\u00020u¢\u0006\u0006\b\u0001\u0010\u0001J\u0018\u0010\u0001\u001a\u0002002\u0006\u0010v\u001a\u00020u¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0001\u001a\u000200¢\u0006\u0006\b\u0001\u0010\u0001J\u0012\u0010\u0001\u001a\u0004\u0018\u00010S¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0001\u001a\u000200¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u000209¢\u0006\u0005\b\u0001\u0010`J\u000f\u0010\u0001\u001a\u000209¢\u0006\u0005\b\u0001\u0010`J\u000f\u0010\u0001\u001a\u000209¢\u0006\u0005\b\u0001\u0010`J\u000f\u0010\u0001\u001a\u000209¢\u0006\u0005\b\u0001\u0010`J\u000f\u0010\u0001\u001a\u000209¢\u0006\u0005\b\u0001\u0010`J\u000f\u0010\u0001\u001a\u000209¢\u0006\u0005\b\u0001\u0010`J#\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020S0 \u00012\u0007\u0010\u0001\u001a\u00020uH@¢\u0006\u0006\b¡\u0001\u0010¢\u0001J$\u0010¤\u0001\u001a\u0002092\u0007\u0010\u0001\u001a\u00020u2\t\u0010£\u0001\u001a\u0004\u0018\u00010\\¢\u0006\u0006\b¤\u0001\u0010¥\u0001J#\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u0002000 \u00012\u0007\u0010\u0001\u001a\u00020uH@¢\u0006\u0006\b¦\u0001\u0010¢\u0001J\"\u0010§\u0001\u001a\t\u0012\u0004\u0012\u00020S0 \u00012\u0006\u0010[\u001a\u00020SH@¢\u0006\u0006\b§\u0001\u0010¨\u0001J%\u0010¬\u0001\u001a\u0002092\b\u0010ª\u0001\u001a\u00030©\u00012\t\u0010«\u0001\u001a\u0004\u0018\u00010\\¢\u0006\u0006\b¬\u0001\u0010­\u0001J\u000f\u0010®\u0001\u001a\u000209¢\u0006\u0005\b®\u0001\u0010`J%\u0010¯\u0001\u001a\u0002092\b\u0010ª\u0001\u001a\u00030©\u00012\t\u0010«\u0001\u001a\u0004\u0018\u00010\\¢\u0006\u0006\b¯\u0001\u0010­\u0001J\u000f\u0010°\u0001\u001a\u000209¢\u0006\u0005\b°\u0001\u0010`J\u0018\u0010²\u0001\u001a\u0002092\u0007\u0010±\u0001\u001a\u000200¢\u0006\u0005\b²\u0001\u0010kJ\u0010\u0010³\u0001\u001a\u000200¢\u0006\u0006\b³\u0001\u0010\u0001J\u001a\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020S0 \u0001H@¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u000f\u0010¶\u0001\u001a\u000209¢\u0006\u0005\b¶\u0001\u0010`J\u0010\u0010·\u0001\u001a\u000200¢\u0006\u0006\b·\u0001\u0010\u0001J\u000f\u0010¸\u0001\u001a\u000209¢\u0006\u0005\b¸\u0001\u0010`J%\u0010»\u0001\u001a\u0002092\u0010\u0010º\u0001\u001a\u000b\u0012\u0005\u0012\u00030¹\u0001\u0018\u00010=H@¢\u0006\u0006\b»\u0001\u0010¼\u0001J$\u0010Á\u0001\u001a\u0002002\b\u0010¾\u0001\u001a\u00030½\u00012\b\u0010À\u0001\u001a\u00030¿\u0001¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u001d\u0010Ã\u0001\u001a\u0002002\b\u0010À\u0001\u001a\u00030¿\u0001H@¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u0013\u0010Å\u0001\u001a\u000200H@¢\u0006\u0006\bÅ\u0001\u0010µ\u0001J\u000f\u0010Æ\u0001\u001a\u000209¢\u0006\u0005\bÆ\u0001\u0010`J\u000f\u0010Ç\u0001\u001a\u000209¢\u0006\u0005\bÇ\u0001\u0010`J\u0019\u0010É\u0001\u001a\u0002092\u0007\u0010È\u0001\u001a\u00020F¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u000f\u0010Ë\u0001\u001a\u000209¢\u0006\u0005\bË\u0001\u0010`J\u000f\u0010Ì\u0001\u001a\u000209¢\u0006\u0005\bÌ\u0001\u0010`J\u000f\u0010Í\u0001\u001a\u000209¢\u0006\u0005\bÍ\u0001\u0010`J\u000f\u0010Î\u0001\u001a\u000209¢\u0006\u0005\bÎ\u0001\u0010`J\u000f\u0010Ï\u0001\u001a\u000209¢\u0006\u0005\bÏ\u0001\u0010`J\u000f\u0010Ð\u0001\u001a\u000209¢\u0006\u0005\bÐ\u0001\u0010`J\u000f\u0010Ñ\u0001\u001a\u000209¢\u0006\u0005\bÑ\u0001\u0010`R\u001b\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u001b\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R\u001b\u0010\t\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u001b\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001R\u001b\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0010\n\u0006\bä\u0001\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010+\u001a\u00020*8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0017\u0010\u0002\u001a\u00020\\8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002000<8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R!\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000f\n\u0006\b\u0002\u0010\u0002\u001a\u0005\b\u0002\u0010ER(\u0010G\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0=0\u00028\u0006¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R(\u0010P\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0=0\u00028\u0006¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002000<8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R!\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000f\n\u0006\b\u0002\u0010\u0002\u001a\u0005\b\u0002\u0010ER$\u0010\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00020=0<8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R(\u0010¡\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00020=0<8\u0006¢\u0006\u000f\n\u0006\b\u0002\u0010\u0002\u001a\u0005\b \u0002\u0010@R\u001d\u0010£\u0002\u001a\b\u0012\u0004\u0012\u0002000<8\u0002X\u0004¢\u0006\b\n\u0006\b¢\u0002\u0010\u0002R!\u0010¦\u0002\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000f\n\u0006\b¤\u0002\u0010\u0002\u001a\u0005\b¥\u0002\u0010ER\u001e\u0010©\u0002\u001a\t\u0012\u0005\u0012\u00030§\u00020<8\u0002X\u0004¢\u0006\b\n\u0006\b¨\u0002\u0010\u0002R\"\u0010¬\u0002\u001a\t\u0012\u0005\u0012\u00030§\u00020B8\u0006¢\u0006\u000f\n\u0006\bª\u0002\u0010\u0002\u001a\u0005\b«\u0002\u0010ER\u001d\u0010®\u0002\u001a\b\u0012\u0004\u0012\u0002000<8\u0002X\u0004¢\u0006\b\n\u0006\b­\u0002\u0010\u0002R!\u0010±\u0002\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000f\n\u0006\b¯\u0002\u0010\u0002\u001a\u0005\b°\u0002\u0010ER*\u0010¹\u0002\u001a\u00030²\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b³\u0002\u0010´\u0002\u001a\u0006\bµ\u0002\u0010¶\u0002\"\u0006\b·\u0002\u0010¸\u0002R%\u0010»\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0=0<8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bº\u0002\u0010\u0002R'\u0010½\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0B8\u0006¢\u0006\u000f\n\u0006\b¸\u0001\u0010\u0002\u001a\u0005\b¼\u0002\u0010ER'\u0010¿\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0=0B8\u0006¢\u0006\u000f\n\u0006\b\u0001\u0010\u0002\u001a\u0005\b¾\u0002\u0010ER'\u0010Á\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0B8\u0006¢\u0006\u000f\n\u0006\b\u0001\u0010\u0002\u001a\u0005\bÀ\u0002\u0010ER\u001e\u0010Ä\u0002\u001a\t\u0012\u0004\u0012\u0002070Â\u00028\u0002X\u0004¢\u0006\b\n\u0006\b§\u0001\u0010Ã\u0002R\u001b\u0010È\u0002\u001a\u00020\"8\u0006¢\u0006\u000f\n\u0005\bW\u0010Å\u0002\u001a\u0006\bÆ\u0002\u0010Ç\u0002R\u001d\u0010Ë\u0002\u001a\t\u0012\u0004\u0012\u0002000É\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\bJ\u0010Ê\u0002R\"\u0010Í\u0002\u001a\t\u0012\u0004\u0012\u0002000\u00028\u0006¢\u0006\u000f\n\u0005\bQ\u0010\u0002\u001a\u0006\bÌ\u0002\u0010\u0002R\u001d\u0010Î\u0002\u001a\t\u0012\u0004\u0012\u0002000É\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\bz\u0010Ê\u0002R!\u0010Ð\u0002\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000f\n\u0006\b¦\u0001\u0010\u0002\u001a\u0005\bÏ\u0002\u0010ER\u001c\u0010Ñ\u0002\u001a\b\u0012\u0004\u0012\u0002000<8\u0002X\u0004¢\u0006\u0007\n\u0005\bD\u0010\u0002R \u0010Ó\u0002\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000e\n\u0005\br\u0010\u0002\u001a\u0005\bÒ\u0002\u0010ER \u0010Ô\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00010<8\u0002X\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010\u0002R\u001f\u0010Õ\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0<8\u0002X\u0004¢\u0006\b\n\u0006\b®\u0001\u0010\u0002R-\u0010f\u001a\u0004\u0018\u00010e2\t\u0010Ö\u0002\u001a\u0004\u0018\u00010e8\u0006@BX\u000e¢\u0006\u0010\n\u0006\b°\u0001\u0010×\u0002\u001a\u0006\bØ\u0002\u0010Ù\u0002R&\u0010Û\u0002\u001a\u0011\u0012\r\u0012\u000b Ú\u0002*\u0004\u0018\u000100000<8\u0002X\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010\u0002R!\u0010Ý\u0002\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000f\n\u0006\b¤\u0001\u0010\u0002\u001a\u0005\bÜ\u0002\u0010ER&\u0010Þ\u0002\u001a\u0011\u0012\r\u0012\u000b Ú\u0002*\u0004\u0018\u000100000<8\u0002X\u0004¢\u0006\b\n\u0006\b»\u0001\u0010\u0002R \u0010à\u0002\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000e\n\u0005\bR\u0010\u0002\u001a\u0005\bß\u0002\u0010ER \u0010ã\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010á\u00020<8\u0002X\u0004¢\u0006\b\n\u0006\bâ\u0002\u0010\u0002R$\u0010æ\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010á\u00020B8\u0006¢\u0006\u000f\n\u0006\bä\u0002\u0010\u0002\u001a\u0005\bå\u0002\u0010ER&\u0010ç\u0002\u001a\u0011\u0012\r\u0012\u000b Ú\u0002*\u0004\u0018\u000100000<8\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010\u0002R!\u0010ê\u0002\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000f\n\u0006\bè\u0002\u0010\u0002\u001a\u0005\bé\u0002\u0010ER&\u0010ë\u0002\u001a\u0011\u0012\r\u0012\u000b Ú\u0002*\u0004\u0018\u000100000<8\u0002X\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010\u0002R!\u0010í\u0002\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000f\n\u0006\bæ\u0001\u0010\u0002\u001a\u0005\bì\u0002\u0010ER%\u0010î\u0002\u001a\u0011\u0012\r\u0012\u000b Ú\u0002*\u0004\u0018\u000100000<8\u0002X\u0004¢\u0006\u0007\n\u0005\b]\u0010\u0002R!\u0010ñ\u0002\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000f\n\u0006\bï\u0002\u0010\u0002\u001a\u0005\bð\u0002\u0010ER\"\u0010õ\u0002\u001a\t\u0012\u0005\u0012\u00030ò\u00020B8\u0006¢\u0006\u000f\n\u0006\bó\u0002\u0010\u0002\u001a\u0005\bô\u0002\u0010ER&\u0010ö\u0002\u001a\u0011\u0012\r\u0012\u000b Ú\u0002*\u0004\u0018\u000100000<8\u0002X\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010\u0002R!\u0010ø\u0002\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000f\n\u0006\b°\u0002\u0010\u0002\u001a\u0005\b÷\u0002\u0010ER \u0010ú\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010ù\u00020<8\u0002X\u0004¢\u0006\b\n\u0006\b \u0002\u0010\u0002R\u001e\u0010û\u0002\u001a\t\u0012\u0004\u0012\u0002000É\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¾\u0002\u0010Ê\u0002R&\u0010ý\u0002\u001a\u0011\u0012\r\u0012\u000b Ú\u0002*\u0004\u0018\u000100000<8\u0002X\u0004¢\u0006\b\n\u0006\bü\u0002\u0010\u0002R!\u0010±\u0001\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000f\n\u0006\bþ\u0002\u0010\u0002\u001a\u0005\bÿ\u0002\u0010ER'\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0=0B8\u0006¢\u0006\u000f\n\u0006\bØ\u0002\u0010\u0002\u001a\u0005\bü\u0002\u0010ER!\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002000B8\u0006¢\u0006\u000f\n\u0006\b\u0003\u0010\u0002\u001a\u0005\bþ\u0002\u0010ER$\u0010\u0003\u001a\n\u0012\u0005\u0012\u00030\u00030É\u00028\u0006¢\u0006\u0010\n\u0006\bå\u0002\u0010Ê\u0002\u001a\u0006\b\u0003\u0010\u0003R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002000q8\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010\u0003R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002000q8\u0006¢\u0006\u000f\n\u0006\b\u0003\u0010\u0003\u001a\u0005\b\u0003\u0010sR \u0010\u0003\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00030<8\u0002X\u0004¢\u0006\b\n\u0006\b÷\u0002\u0010\u0002R$\u0010\u0003\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00030B8\u0006¢\u0006\u000f\n\u0006\bð\u0002\u0010\u0002\u001a\u0005\b\u0003\u0010ER!\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002000q8\u0006¢\u0006\u000f\n\u0006\bô\u0002\u0010\u0003\u001a\u0005\b\u0003\u0010sR!\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002000<8\u0006¢\u0006\u000f\n\u0006\b\u0003\u0010\u0002\u001a\u0005\b\u0003\u0010@R \u0010\u0003\u001a\t\u0012\u0005\u0012\u00030\u00010q8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0003R\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002000q8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010\u0003R*\u0010\u0003\u001a\u00030\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0003\u0010\u0002\u001a\u0006\b\u0003\u0010\u0001\"\u0006\b\u0003\u0010\u0003R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002000<8\u0006¢\u0006\u000f\n\u0006\b¼\u0002\u0010\u0002\u001a\u0005\b\u0003\u0010@R&\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0=0B8\u0006¢\u0006\u000f\n\u0006\bÚ\u0001\u0010\u0002\u001a\u0005\bó\u0002\u0010ER$\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0=0<8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0002R'\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0=0B8\u0006¢\u0006\u000f\n\u0006\b\u0001\u0010\u0002\u001a\u0005\bï\u0002\u0010ER\u001b\u0010\u0003\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0003R\u001b\u0010\u0003\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0003R*\u0010¢\u0003\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\b\u0001\u0010\u0003\u001a\u0006\b \u0003\u0010\u0001\"\u0005\b¡\u0003\u0010xR\u001c\u0010¦\u0003\u001a\u0005\u0018\u00010£\u00038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¤\u0003\u0010¥\u0003R\"\u0010§\u0003\u001a\t\u0012\u0005\u0012\u00030\u00010B8\u0006¢\u0006\u000f\n\u0006\bÏ\u0002\u0010\u0002\u001a\u0005\b\u0003\u0010ER(\u0010ª\u0003\u001a\u0002008\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\bé\u0002\u0010º\u0002\u001a\u0006\b¨\u0003\u0010\u0001\"\u0005\b©\u0003\u0010kR(\u0010¬\u0003\u001a\u0002008\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\b\u0003\u0010º\u0002\u001a\u0006\bè\u0002\u0010\u0001\"\u0005\b«\u0003\u0010kR*\u0010­\u0003\u001a\u0011\u0012\r\u0012\u000b Ú\u0002*\u0004\u0018\u000100000B8\u0006¢\u0006\u000f\n\u0006\b«\u0002\u0010\u0002\u001a\u0005\b¤\u0003\u0010ER\u0019\u0010¯\u0003\u001a\b\u0012\u0004\u0012\u0002000B8F¢\u0006\u0007\u001a\u0005\b®\u0003\u0010ER\u001c\u0010±\u0003\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00010B8F¢\u0006\u0007\u001a\u0005\b°\u0003\u0010ER\u001b\u0010³\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0B8F¢\u0006\u0007\u001a\u0005\b²\u0003\u0010ER\u001c\u0010´\u0003\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010ù\u00020B8F¢\u0006\u0007\u001a\u0005\b\u0003\u0010E¨\u0006¶\u0003"}, d2 = {"LDF/C;", "Landroidx/lifecycle/f0;", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "compositionRepository", "Lcom/sugarcube/app/base/data/source/CatalogRepository;", "catalogRepository", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "LOE/q;", "sugarcube", "Lcom/sugarcube/app/base/external/config/a;", "appConfig", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "assetRepository", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "preferences", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/DeviceCompatibility;", "deviceCompatibility", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/app/base/network/NetworkClient;", "networkClient", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "privacyPolicyConsentUseCase", "LKF/a;", "captureFiles", "LKF/r;", "uploadVersion", "Lcom/sugarcube/app/base/upload/g;", "uploaderV2", "LKF/e;", "uploadDatabase", "Lcom/sugarcube/app/base/network/NetworkLiveData;", "networkLiveData", "LNF/f;", "stringProvider", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "analyticsManager", "Lcom/sugarcube/app/base/external/shoppinglist/AddToShoppingListUseCase;", "addToShoppingListUseCase", "Lcom/sugarcube/app/base/external/shoppinglist/FetchShoppingListItemsUseCase;", "fetchShoppingListItemsUseCase", "Landroidx/lifecycle/U;", "savedStateHandle", "<init>", "(Lcom/sugarcube/app/base/data/source/CompositionRepository;Lcom/sugarcube/app/base/data/source/CatalogRepository;Lcom/sugarcube/app/base/data/SceneRepository;LOE/q;Lcom/sugarcube/app/base/external/config/a;Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/DeviceCompatibility;Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/app/base/network/NetworkClient;Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;LKF/a;LKF/r;Lcom/sugarcube/app/base/upload/g;LKF/e;Lcom/sugarcube/app/base/network/NetworkLiveData;LNF/f;Lcom/sugarcube/app/base/data/AnalyticsManager;Lcom/sugarcube/app/base/external/shoppinglist/AddToShoppingListUseCase;Lcom/sugarcube/app/base/external/shoppinglist/FetchShoppingListItemsUseCase;Landroidx/lifecycle/U;)V", "", "captureSupported", "scans", "designs", "Lcom/sugarcube/app/base/ui/gallery/h;", "e2", "(ZZZ)Lcom/sugarcube/app/base/ui/gallery/h;", "Lcom/sugarcube/core/analytics/Event;", "event", "LXH/N;", "m2", "(Lcom/sugarcube/core/analytics/Event;)V", "Landroidx/lifecycle/K;", "", "LDF/d;", "s2", "()Landroidx/lifecycle/K;", "c3", "Landroidx/lifecycle/F;", "LDF/b;", "H0", "()Landroidx/lifecycle/F;", "Lcom/sugarcube/app/base/data/database/Scene;", "scenes", "LDF/g;", "models", "D0", "(Landroidx/lifecycle/F;Landroidx/lifecycle/F;)Ljava/util/List;", "scenesV", "x0", "(Ljava/util/List;)V", "Lcom/sugarcube/core/network/models/Showroom;", "showrooms", "E0", "P0", "Lcom/sugarcube/core/network/models/Composition;", "compositionList", "LDF/a;", "compositionDetailsList", "C0", "checkSchedule", "k3", "(ZLdI/e;)Ljava/lang/Object;", "composition", "", "W0", "(Lcom/sugarcube/core/network/models/Composition;)Ljava/lang/String;", "F2", "()V", "V2", "i2", "Q2", "R2", "LAF/x;", "itemViewType", "H2", "(LAF/x;)V", "show", "O2", "(Z)V", "L2", "M2", "tab", "D2", "(Lcom/sugarcube/app/base/ui/gallery/h;)V", "LTJ/g;", "I0", "()LTJ/g;", "y2", "Ljava/util/UUID;", "uuid", "k2", "(Ljava/util/UUID;)V", "P1", "F0", "I2", "isHighlighted", "selectionList", "m3", "(ZLjava/util/List;)V", "l3", "j3", "j2", "A2", "h2", "z2", "u1", "()Lcom/sugarcube/app/base/data/database/Scene;", "x1", "()Ljava/util/UUID;", "", "v1", "()I", "w1", "()Ljava/lang/String;", "Lcom/sugarcube/app/base/data/analytics/RoomSource;", "L1", "(Ljava/util/UUID;)Lcom/sugarcube/app/base/data/analytics/RoomSource;", "Z1", "(Ljava/util/UUID;)Z", "T1", "()Z", "t1", "()Lcom/sugarcube/core/network/models/Composition;", "c2", "n2", "z0", "i3", "o2", "Q1", "A0", "compUUID", "Lcom/sugarcube/app/base/data/Result;", "S2", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "name", "N0", "(Ljava/util/UUID;Ljava/lang/String;)V", "G0", "B0", "(Lcom/sugarcube/core/network/models/Composition;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "rating", "feedback", "B2", "(Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;Ljava/lang/String;)V", "K0", "C2", "L0", "isSaving", "G2", "U1", "r2", "(LdI/e;)Ljava/lang/Object;", "J0", "S1", "y0", "Lcom/sugarcube/core/network/models/PlacedFurniture;", "placedFurnitureSet", "O0", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "Lx4/o;", "navController", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "w0", "(Lx4/o;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)Z", "v0", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LdI/e;)Ljava/lang/Object;", "u0", "l2", "p2", "scene", "q2", "(Lcom/sugarcube/app/base/data/database/Scene;)V", "f2", "g2", "M0", "J2", "K2", "d2", "onPullRefresh", "m", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "Z0", "()Lcom/sugarcube/app/base/data/source/CompositionRepository;", "n", "Lcom/sugarcube/app/base/data/source/CatalogRepository;", "o", "Lcom/sugarcube/app/base/data/SceneRepository;", "s1", "()Lcom/sugarcube/app/base/data/SceneRepository;", "p", "LOE/q;", "M1", "()LOE/q;", "q", "Lcom/sugarcube/app/base/external/config/a;", "U0", "()Lcom/sugarcube/app/base/external/config/a;", "r", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "V0", "()Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "s", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "t", "Lcom/sugarcube/app/base/data/user/UserRepo;", "u", "Lcom/sugarcube/app/base/DeviceCompatibility;", "v", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "w", "Lcom/sugarcube/app/base/network/NetworkClient;", "x", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "y", "LKF/a;", "z", "LKF/r;", "A", "Lcom/sugarcube/app/base/upload/g;", "B", "LKF/e;", "C", "LNF/f;", "D", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "E", "Lcom/sugarcube/app/base/external/shoppinglist/AddToShoppingListUseCase;", "F", "Lcom/sugarcube/app/base/external/shoppinglist/FetchShoppingListItemsUseCase;", "G", "Landroidx/lifecycle/U;", "H", "Ljava/lang/String;", "TAG", "I", "Landroidx/lifecycle/K;", "_isCaptureEnabled", "J", "Landroidx/lifecycle/F;", "R1", "isCaptureEnabled", "LTJ/P;", "K", "LTJ/P;", "getScenes", "()LTJ/P;", "L", "getShowrooms", "M", "_productsInformationFetchInProgress", "N", "o1", "productsInformationFetchInProgress", "LkF/D;", "O", "_designCardProductList", "P", "b1", "designCardProductList", "Q", "_addRoomInProgress", "R", "S0", "addRoomInProgress", "LtF/h;", "S", "_showDialog", "T", "C1", "showDialog", "U", "_deleteSelectedScenes", "X", "a1", "deleteSelectedScenes", "LxF/a;", "Y", "LxF/a;", "p1", "()LxF/a;", "setReporter", "(LxF/a;)V", "reporter", "Z", "galleryDetails", "r1", "scanItems", "c1", "designItems", "I1", "showroomItems", "", "Ljava/util/Set;", "reportedEvents", "Lcom/sugarcube/app/base/network/NetworkLiveData;", "V1", "()Lcom/sugarcube/app/base/network/NetworkLiveData;", "isConnected", "LTJ/B;", "LTJ/B;", "_isRefreshing", "X1", "isRefreshing", "isFetchingRemoteData", "z1", "shouldShowLoadingIndicator", "_isDecorateEnabled", "W1", "isDecorateEnabled", "_snackBarMessage", "_viewComposition", "value", "LAF/x;", "f1", "()LAF/x;", "kotlin.jvm.PlatformType", "_showNotificationPermissionsDialog", "D1", "showNotificationPermissionsDialog", "_showUpdateDisclaimer", "G1", "showUpdateDisclaimer", "Lcom/sugarcube/app/base/data/model/PendingComposition;", "Q0", "_pendingComposition", "R0", "h1", "pendingComposition", "_showBlacklistDisclaimer", "T0", "A1", "showBlacklistDisclaimer", "_showUnavailableDisclaimer", "E1", "showUnavailableDisclaimer", "_privacyPolicyErrorState", "X0", "l1", "privacyPolicyErrorState", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyFeatureState;", "Y0", "m1", "privacyPolicyState", "_presentPrivacyDisclaimerBanner", "k1", "presentPrivacyDisclaimerBanner", "Landroid/net/Uri;", "_privacyPolicyUri", "disableDesignsInShowrooms", "d1", "_isSaving", "e1", "Y1", "favoriteListLiveData", "g1", "favoritesEnabled", "LDF/C$h;", "N1", "()LTJ/B;", "tabConfig", "i1", "LTJ/g;", "showScansTab", "j1", "F1", "showUnsupportedScansPage", "Lcom/sugarcube/app/base/data/model/Design;", "_openDesign", "openDesign", "B1", "showDesignOptionsInterstitial", "n1", "presentCaptureFeedback", "firstSceneCaptureRating", "designFeedbackPresented", "q1", "getDesignExperienceUserRating", "E2", "(I)V", "designExperienceUserRating", "presentDesignFeedback", "compositionItems", "Ljava/util/UUID;", "selectedSceneUuid", "selectedCompositionUuid", "getShowroomCompositionUUID", "setShowroomCompositionUUID", "showroomCompositionUUID", "LQJ/F0;", "y1", "LQJ/F0;", "updateJob", "roomReadyCount", "a2", "setUnsupportedComposition", "isUnsupportedComposition", "setAllowDecorate", "allowDecorate", "shouldExitDetailFragment", "b2", "isUpdatingCompositions", "J1", "snackBarMessage", "O1", "viewComposition", "privacyPolicyUri", "h", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: DF.C  reason: case insensitive filesystem */
public final class C12754C extends androidx.lifecycle.f0 {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final g f108652A;

    /* renamed from: A0  reason: collision with root package name */
    private final androidx.lifecycle.F<List<C12787d>> f108653A0;

    /* renamed from: A1  reason: collision with root package name */
    private boolean f108654A1;

    /* renamed from: B  reason: collision with root package name */
    private final C13151e f108655B;

    /* renamed from: B0  reason: collision with root package name */
    private final Set<Event> f108656B0;

    /* renamed from: B1  reason: collision with root package name */
    private boolean f108657B1;

    /* renamed from: C  reason: collision with root package name */
    private final C13292f f108658C;

    /* renamed from: C0  reason: collision with root package name */
    private final NetworkLiveData f108659C0;

    /* renamed from: C1  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108660C1;

    /* renamed from: D  reason: collision with root package name */
    private final AnalyticsManager f108661D;
    /* access modifiers changed from: private */

    /* renamed from: D0  reason: collision with root package name */
    public final C16505B<Boolean> f108662D0;

    /* renamed from: E  reason: collision with root package name */
    private final AddToShoppingListUseCase f108663E;

    /* renamed from: E0  reason: collision with root package name */
    private final C16519P<Boolean> f108664E0;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final FetchShoppingListItemsUseCase f108665F;
    /* access modifiers changed from: private */

    /* renamed from: F0  reason: collision with root package name */
    public final C16505B<Boolean> f108666F0;

    /* renamed from: G  reason: collision with root package name */
    private final androidx.lifecycle.U f108667G;

    /* renamed from: G0  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108668G0;

    /* renamed from: H  reason: collision with root package name */
    private final String f108669H = AnyKt.SUGARCUBE_TAG;
    /* access modifiers changed from: private */

    /* renamed from: H0  reason: collision with root package name */
    public final androidx.lifecycle.K<Boolean> f108670H0;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public final androidx.lifecycle.K<Boolean> f108671I;

    /* renamed from: I0  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108672I0;

    /* renamed from: J  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108673J;

    /* renamed from: J0  reason: collision with root package name */
    private final androidx.lifecycle.K<Integer> f108674J0;

    /* renamed from: K  reason: collision with root package name */
    private final C16519P<List<Scene>> f108675K;

    /* renamed from: K0  reason: collision with root package name */
    private final androidx.lifecycle.K<Composition> f108676K0;

    /* renamed from: L  reason: collision with root package name */
    private final C16519P<List<Showroom>> f108677L;

    /* renamed from: L0  reason: collision with root package name */
    private C12603x f108678L0;

    /* renamed from: M  reason: collision with root package name */
    private final androidx.lifecycle.K<Boolean> f108679M;
    /* access modifiers changed from: private */

    /* renamed from: M0  reason: collision with root package name */
    public final androidx.lifecycle.K<Boolean> f108680M0;

    /* renamed from: N  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108681N;

    /* renamed from: N0  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108682N0;

    /* renamed from: O  reason: collision with root package name */
    private final androidx.lifecycle.K<List<C14683D>> f108683O;

    /* renamed from: O0  reason: collision with root package name */
    private final androidx.lifecycle.K<Boolean> f108684O0;

    /* renamed from: P  reason: collision with root package name */
    private final androidx.lifecycle.K<List<C14683D>> f108685P;

    /* renamed from: P0  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108686P0;

    /* renamed from: Q  reason: collision with root package name */
    private final androidx.lifecycle.K<Boolean> f108687Q;

    /* renamed from: Q0  reason: collision with root package name */
    private final androidx.lifecycle.K<PendingComposition> f108688Q0;

    /* renamed from: R  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108689R;

    /* renamed from: R0  reason: collision with root package name */
    private final androidx.lifecycle.F<PendingComposition> f108690R0;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public final androidx.lifecycle.K<C15083h> f108691S;
    /* access modifiers changed from: private */

    /* renamed from: S0  reason: collision with root package name */
    public final androidx.lifecycle.K<Boolean> f108692S0;

    /* renamed from: T  reason: collision with root package name */
    private final androidx.lifecycle.F<C15083h> f108693T;

    /* renamed from: T0  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108694T0;

    /* renamed from: U  reason: collision with root package name */
    private final androidx.lifecycle.K<Boolean> f108695U;

    /* renamed from: U0  reason: collision with root package name */
    private final androidx.lifecycle.K<Boolean> f108696U0;

    /* renamed from: V0  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108697V0;
    /* access modifiers changed from: private */

    /* renamed from: W0  reason: collision with root package name */
    public final androidx.lifecycle.K<Boolean> f108698W0;

    /* renamed from: X  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108699X;

    /* renamed from: X0  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108700X0;

    /* renamed from: Y  reason: collision with root package name */
    private C15226a f108701Y;

    /* renamed from: Y0  reason: collision with root package name */
    private final androidx.lifecycle.F<PrivacyPolicyFeatureState> f108702Y0;

    /* renamed from: Z  reason: collision with root package name */
    private androidx.lifecycle.K<List<C12790g>> f108703Z;
    /* access modifiers changed from: private */

    /* renamed from: Z0  reason: collision with root package name */
    public final androidx.lifecycle.K<Boolean> f108704Z0;

    /* renamed from: a1  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108705a1;

    /* renamed from: b1  reason: collision with root package name */
    private final androidx.lifecycle.K<Uri> f108706b1;
    /* access modifiers changed from: private */

    /* renamed from: c1  reason: collision with root package name */
    public final C16505B<Boolean> f108707c1;

    /* renamed from: d1  reason: collision with root package name */
    private final androidx.lifecycle.K<Boolean> f108708d1;

    /* renamed from: e1  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108709e1;

    /* renamed from: f1  reason: collision with root package name */
    private final androidx.lifecycle.F<List<String>> f108710f1;

    /* renamed from: g1  reason: collision with root package name */
    private final androidx.lifecycle.F<Boolean> f108711g1;

    /* renamed from: h1  reason: collision with root package name */
    private final C16505B<C12761h> f108712h1;

    /* renamed from: i1  reason: collision with root package name */
    private final C16532g<Boolean> f108713i1;

    /* renamed from: j1  reason: collision with root package name */
    private final C16532g<Boolean> f108714j1;

    /* renamed from: k1  reason: collision with root package name */
    private final androidx.lifecycle.K<Design> f108715k1;

    /* renamed from: l1  reason: collision with root package name */
    private final androidx.lifecycle.F<Design> f108716l1;

    /* renamed from: m  reason: collision with root package name */
    private final CompositionRepository f108717m;

    /* renamed from: m1  reason: collision with root package name */
    private final C16532g<Boolean> f108718m1;

    /* renamed from: n  reason: collision with root package name */
    private final CatalogRepository f108719n;

    /* renamed from: n1  reason: collision with root package name */
    private final androidx.lifecycle.K<Boolean> f108720n1;

    /* renamed from: o  reason: collision with root package name */
    private final SceneRepository f108721o;
    /* access modifiers changed from: private */

    /* renamed from: o1  reason: collision with root package name */
    public C16532g<Integer> f108722o1;

    /* renamed from: p  reason: collision with root package name */
    private final q f108723p;
    /* access modifiers changed from: private */

    /* renamed from: p1  reason: collision with root package name */
    public C16532g<Boolean> f108724p1;

    /* renamed from: q  reason: collision with root package name */
    private final a f108725q;

    /* renamed from: q1  reason: collision with root package name */
    private int f108726q1;

    /* renamed from: r  reason: collision with root package name */
    private final VideoAssetRepository f108727r;

    /* renamed from: r1  reason: collision with root package name */
    private final androidx.lifecycle.K<Boolean> f108728r1;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final PreferenceStorage f108729s;

    /* renamed from: s1  reason: collision with root package name */
    private final androidx.lifecycle.F<List<Composition>> f108730s1;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final UserRepo f108731t;
    /* access modifiers changed from: private */

    /* renamed from: t1  reason: collision with root package name */
    public androidx.lifecycle.K<List<C12784a>> f108732t1;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final DeviceCompatibility f108733u;

    /* renamed from: u1  reason: collision with root package name */
    private final androidx.lifecycle.F<List<C12785b>> f108734u1;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final ConfigRepository f108735v;

    /* renamed from: v1  reason: collision with root package name */
    private UUID f108736v1;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final NetworkClient f108737w;

    /* renamed from: w1  reason: collision with root package name */
    private UUID f108738w1;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final PrivacyPolicyConsentUseCase f108739x;

    /* renamed from: x1  reason: collision with root package name */
    private UUID f108740x1;

    /* renamed from: y  reason: collision with root package name */
    private final C13147a f108741y;

    /* renamed from: y0  reason: collision with root package name */
    private final androidx.lifecycle.F<List<C12787d>> f108742y0;
    /* access modifiers changed from: private */

    /* renamed from: y1  reason: collision with root package name */
    public F0 f108743y1;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final C13164r f108744z;

    /* renamed from: z0  reason: collision with root package name */
    private final androidx.lifecycle.F<List<C12785b>> f108745z0;

    /* renamed from: z1  reason: collision with root package name */
    private final androidx.lifecycle.F<Integer> f108746z1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$presentDesignFeedback$1$1", f = "GalleryViewModel.kt", l = {574}, m = "invokeSuspend")
    /* renamed from: DF.C$A */
    static final class A extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f108747c;

        /* renamed from: d  reason: collision with root package name */
        int f108748d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12754C f108749e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.K<Boolean> f108750f;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "isPresented", "firstRating", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$presentDesignFeedback$1$1$1", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: DF.C$A$a */
        static final class a extends l implements nI.q<Boolean, Integer, C17164e<? super Boolean>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f108751c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ boolean f108752d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ int f108753e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C12754C f108754f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C12754C c10, C17164e<? super a> eVar) {
                super(3, eVar);
                this.f108754f = c10;
            }

            public final Object i(boolean z10, int i10, C17164e<? super Boolean> eVar) {
                a aVar = new a(this.f108754f, eVar);
                aVar.f108752d = z10;
                aVar.f108753e = i10;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return i(((Boolean) obj).booleanValue(), ((Number) obj2).intValue(), (C17164e) obj3);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f108751c == 0) {
                    y.b(obj);
                    boolean z10 = this.f108752d;
                    int i10 = this.f108753e;
                    this.f108754f.E2(i10);
                    return kotlin.coroutines.jvm.internal.b.a(!z10 && i10 != -1);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "shouldPresent", "hasPlacedItem", "LXH/N;", "<anonymous>", "(ZZ)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$presentDesignFeedback$1$1$2", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: DF.C$A$b */
        static final class b extends l implements nI.q<Boolean, Boolean, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f108755c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ boolean f108756d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ boolean f108757e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.K<Boolean> f108758f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C12754C f108759g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(androidx.lifecycle.K<Boolean> k10, C12754C c10, C17164e<? super b> eVar) {
                super(3, eVar);
                this.f108758f = k10;
                this.f108759g = c10;
            }

            public final Object i(boolean z10, boolean z11, C17164e<? super C16807N> eVar) {
                b bVar = new b(this.f108758f, this.f108759g, eVar);
                bVar.f108756d = z10;
                bVar.f108757e = z11;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (C17164e) obj3);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f108755c == 0) {
                    y.b(obj);
                    this.f108758f.setValue(kotlin.coroutines.jvm.internal.b.a(this.f108756d && this.f108757e && this.f108759g.U0().getTrackingEnabledFlow().getValue().booleanValue()));
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        A(C12754C c10, androidx.lifecycle.K<Boolean> k10, C17164e<? super A> eVar) {
            super(2, eVar);
            this.f108749e = c10;
            this.f108750f = k10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new A(this.f108749e, this.f108750f, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((A) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108748d;
            if (i10 == 0) {
                y.b(obj);
                C16532g observe = this.f108749e.f108735v.observe(ConfigItems.UserHasPlacedItem.INSTANCE);
                C16532g I10 = C16534i.I(C16534i.I(this.f108749e.f108724p1, this.f108749e.f108722o1, new a(this.f108749e, (C17164e<? super a>) null)), observe, new b(this.f108750f, this.f108749e, (C17164e<? super b>) null));
                this.f108747c = observe;
                this.f108748d = 1;
                if (C16534i.i(I10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16532g gVar = (C16532g) this.f108747c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$refreshCompositions$1", f = "GalleryViewModel.kt", l = {891, 893, 894}, m = "invokeSuspend")
    /* renamed from: DF.C$B */
    static final class B extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108760c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        B(C12754C c10, C17164e<? super B> eVar) {
            super(2, eVar);
            this.f108761d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new B(this.f108761d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((B) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005d A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f108760c
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x0026
                if (r1 == r5) goto L_0x0022
                if (r1 == r4) goto L_0x001e
                if (r1 != r3) goto L_0x0016
                XH.y.b(r7)
                goto L_0x005e
            L_0x0016:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001e:
                XH.y.b(r7)
                goto L_0x004b
            L_0x0022:
                XH.y.b(r7)
                goto L_0x0038
            L_0x0026:
                XH.y.b(r7)
                DF.C r7 = r6.f108761d
                com.sugarcube.app.base.data.source.CompositionRepository r7 = r7.Z0()
                r6.f108760c = r5
                java.lang.Object r7 = r7.refreshCache(r6)
                if (r7 != r0) goto L_0x0038
                return r0
            L_0x0038:
                DF.C r7 = r6.f108761d
                TJ.B r7 = r7.f108666F0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r2)
                r6.f108760c = r4
                java.lang.Object r7 = r7.emit(r1, r6)
                if (r7 != r0) goto L_0x004b
                return r0
            L_0x004b:
                DF.C r7 = r6.f108761d
                TJ.B r7 = r7.f108662D0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r2)
                r6.f108760c = r3
                java.lang.Object r7 = r7.emit(r1, r6)
                if (r7 != r0) goto L_0x005e
                return r0
            L_0x005e:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.B.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$refreshScenes$1", f = "GalleryViewModel.kt", l = {851, 853, 854}, m = "invokeSuspend")
    /* renamed from: DF.C$C  reason: collision with other inner class name */
    static final class C2604C extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108762c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108763d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2604C(C12754C c10, C17164e<? super C2604C> eVar) {
            super(2, eVar);
            this.f108763d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2604C(this.f108763d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C2604C) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f108762c
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x0026
                if (r1 == r5) goto L_0x0022
                if (r1 == r4) goto L_0x001e
                if (r1 != r3) goto L_0x0016
                XH.y.b(r7)
                goto L_0x005a
            L_0x0016:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001e:
                XH.y.b(r7)
                goto L_0x0047
            L_0x0022:
                XH.y.b(r7)
                goto L_0x0034
            L_0x0026:
                XH.y.b(r7)
                DF.C r7 = r6.f108763d
                r6.f108762c = r5
                java.lang.Object r7 = r7.k3(r5, r6)
                if (r7 != r0) goto L_0x0034
                return r0
            L_0x0034:
                DF.C r7 = r6.f108763d
                TJ.B r7 = r7.f108666F0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r2)
                r6.f108762c = r4
                java.lang.Object r7 = r7.emit(r1, r6)
                if (r7 != r0) goto L_0x0047
                return r0
            L_0x0047:
                DF.C r7 = r6.f108763d
                TJ.B r7 = r7.f108662D0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r2)
                r6.f108762c = r3
                java.lang.Object r7 = r7.emit(r1, r6)
                if (r7 != r0) goto L_0x005a
                return r0
            L_0x005a:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.C2604C.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$reportDetailsOpened$1", f = "GalleryViewModel.kt", l = {495}, m = "invokeSuspend")
    /* renamed from: DF.C$D */
    static final class D extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108764c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108765d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UUID f108766e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        D(C12754C c10, UUID uuid, C17164e<? super D> eVar) {
            super(2, eVar);
            this.f108765d = c10;
            this.f108766e = uuid;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new D(this.f108765d, this.f108766e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((D) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108764c;
            if (i10 == 0) {
                y.b(obj);
                CompositionRepository Z02 = this.f108765d.Z0();
                this.f108764c = 1;
                if (Z02.refreshCache(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.f108765d.Z1(this.f108766e)) {
                this.f108765d.p1().q();
            } else {
                this.f108765d.p1().n();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$reportGalleryOpen$1", f = "GalleryViewModel.kt", l = {1321}, m = "invokeSuspend")
    /* renamed from: DF.C$E */
    static final class E extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108767c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108768d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        E(C12754C c10, C17164e<? super E> eVar) {
            super(2, eVar);
            this.f108768d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new E(this.f108768d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((E) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108767c;
            if (i10 == 0) {
                y.b(obj);
                DeviceCompatibility W10 = this.f108768d.f108733u;
                this.f108767c = 1;
                obj = W10.updateCompatibility(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DeviceCompatibility.a aVar = (DeviceCompatibility.a) obj;
            this.f108768d.M1().b().galleryOpen(aVar.b() ? Constants.NORMAL : "designOnly", aVar.e());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$restoreSoftDeletedItems$1", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: DF.C$F */
    static final class F extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108769c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108770d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        F(C12754C c10, C17164e<? super F> eVar) {
            super(2, eVar);
            this.f108770d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new F(this.f108770d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((F) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f108769c == 0) {
                y.b(obj);
                this.f108770d.s1().restoreSoftDeletedScenes();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$resumeUploads$1", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: DF.C$G */
    static final class G extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108771c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108772d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        G(C12754C c10, C17164e<? super G> eVar) {
            super(2, eVar);
            this.f108772d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new G(this.f108772d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((G) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f108771c == 0) {
                y.b(obj);
                if (this.f108772d.f108744z.b()) {
                    IUploaderV2.a.a(this.f108772d.f108652A, false, "resume", false, 5, (Object) null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$retryUpload$1", f = "GalleryViewModel.kt", l = {1345}, m = "invokeSuspend")
    /* renamed from: DF.C$H */
    static final class H extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108773c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108774d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Scene f108775e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        H(C12754C c10, Scene scene, C17164e<? super H> eVar) {
            super(2, eVar);
            this.f108774d = c10;
            this.f108775e = scene;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new H(this.f108774d, this.f108775e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((H) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108773c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f108774d.f108744z.b()) {
                    IUploaderV2.a.a(this.f108774d.f108652A, true, "retry", false, 4, (Object) null);
                } else {
                    SceneRepository s12 = this.f108774d.s1();
                    Scene scene = this.f108775e;
                    this.f108773c = 1;
                    if (s12.restartUpload(scene, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: DF.C$I */
    static final class I implements androidx.lifecycle.L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f108776a;

        I(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f108776a = lVar;
        }

        public final C16818i<?> c() {
            return this.f108776a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f108776a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel", f = "GalleryViewModel.kt", l = {1169}, m = "savePendingComposition")
    /* renamed from: DF.C$J */
    static final class J extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f108777c;

        /* renamed from: d  reason: collision with root package name */
        Object f108778d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f108779e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12754C f108780f;

        /* renamed from: g  reason: collision with root package name */
        int f108781g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        J(C12754C c10, C17164e<? super J> eVar) {
            super(eVar);
            this.f108780f = c10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f108779e = obj;
            this.f108781g |= Integer.MIN_VALUE;
            return this.f108780f.r2(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isLoggedIn", "LTJ/g;", "", "Lcom/sugarcube/app/base/data/database/Scene;", "<anonymous>", "(Z)LTJ/g;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$scans$1", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: DF.C$K */
    static final class K extends l implements p<Boolean, C17164e<? super C16532g<? extends List<? extends Scene>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108782c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f108783d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12754C f108784e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        K(C12754C c10, C17164e<? super K> eVar) {
            super(2, eVar);
            this.f108784e = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            K k10 = new K(this.f108784e, eVar);
            k10.f108783d = ((Boolean) obj).booleanValue();
            return k10;
        }

        public final Object i(boolean z10, C17164e<? super C16532g<? extends List<Scene>>> eVar) {
            return ((K) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f108782c == 0) {
                y.b(obj);
                return this.f108783d ? C5210m.a(this.f108784e.s1().getScenes()) : C16534i.J(C16877v.n());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "", "Lcom/sugarcube/app/base/data/database/Scene;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$scenes$1", f = "GalleryViewModel.kt", l = {137}, m = "invokeSuspend")
    /* renamed from: DF.C$L */
    static final class L extends l implements p<C16533h<? super List<? extends Scene>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f108785c;

        /* renamed from: d  reason: collision with root package name */
        int f108786d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f108787e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12754C f108788f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        L(C12754C c10, C17164e<? super L> eVar) {
            super(2, eVar);
            this.f108788f = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            L l10 = new L(this.f108788f, eVar);
            l10.f108787e = obj;
            return l10;
        }

        public final Object invoke(C16533h<? super List<Scene>> hVar, C17164e<? super C16807N> eVar) {
            return ((L) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108786d;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f108787e;
                List value = this.f108788f.s1().getScenes().getValue();
                List n10 = value == null ? C16877v.n() : value;
                this.f108787e = hVar;
                this.f108785c = value;
                this.f108786d = 1;
                if (hVar.emit(n10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                List list = (List) this.f108785c;
                C16533h hVar2 = (C16533h) this.f108787e;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$selectScene$1$1$1", f = "GalleryViewModel.kt", l = {880}, m = "invokeSuspend")
    /* renamed from: DF.C$M */
    static final class M extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108789c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108790d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        M(C12754C c10, C17164e<? super M> eVar) {
            super(2, eVar);
            this.f108790d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new M(this.f108790d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((M) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108789c;
            if (i10 == 0) {
                y.b(obj);
                CompositionRepository Z02 = this.f108790d.Z0();
                this.f108789c = 1;
                if (Z02.refreshCache(this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$sendCaptureFeedback$1", f = "GalleryViewModel.kt", l = {1111, 1112, 1113, 1122}, m = "invokeSuspend")
    /* renamed from: DF.C$N */
    static final class N extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f108791c;

        /* renamed from: d  reason: collision with root package name */
        Object f108792d;

        /* renamed from: e  reason: collision with root package name */
        Object f108793e;

        /* renamed from: f  reason: collision with root package name */
        int f108794f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12754C f108795g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ FeedbackSmileRatingBar.a f108796h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f108797i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        N(C12754C c10, FeedbackSmileRatingBar.a aVar, String str, C17164e<? super N> eVar) {
            super(2, eVar);
            this.f108795g = c10;
            this.f108796h = aVar;
            this.f108797i = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new N(this.f108795g, this.f108796h, this.f108797i, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((N) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x007b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f108794f
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x003d
                if (r1 == r5) goto L_0x0039
                if (r1 == r4) goto L_0x0035
                if (r1 == r3) goto L_0x002d
                if (r1 != r2) goto L_0x0025
                java.lang.Object r0 = r9.f108793e
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r9.f108792d
                com.sugarcube.app.base.data.feature.ConfigState r0 = (com.sugarcube.app.base.data.feature.ConfigState) r0
                java.lang.Object r0 = r9.f108791c
                com.sugarcube.app.base.data.feature.ConfigState r0 = (com.sugarcube.app.base.data.feature.ConfigState) r0
                XH.y.b(r10)
                goto L_0x00ba
            L_0x0025:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x002d:
                java.lang.Object r1 = r9.f108791c
                com.sugarcube.app.base.data.feature.ConfigState r1 = (com.sugarcube.app.base.data.feature.ConfigState) r1
                XH.y.b(r10)
                goto L_0x007c
            L_0x0035:
                XH.y.b(r10)
                goto L_0x0066
            L_0x0039:
                XH.y.b(r10)
                goto L_0x0055
            L_0x003d:
                XH.y.b(r10)
                DF.C r10 = r9.f108795g
                com.sugarcube.app.base.data.feature.ConfigRepository r10 = r10.f108735v
                com.sugarcube.app.base.data.feature.ConfigItems$CaptureFeedbackPromptWasPresented r1 = com.sugarcube.app.base.data.feature.ConfigItems.CaptureFeedbackPromptWasPresented.INSTANCE
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r5)
                r9.f108794f = r5
                java.lang.Object r10 = r10.override(r1, r6, r9)
                if (r10 != r0) goto L_0x0055
                return r0
            L_0x0055:
                DF.C r10 = r9.f108795g
                com.sugarcube.app.base.data.feature.ConfigRepository r10 = r10.f108735v
                com.sugarcube.app.base.data.feature.ConfigItems$FeedbackCaptureId r1 = com.sugarcube.app.base.data.feature.ConfigItems.FeedbackCaptureId.INSTANCE
                r9.f108794f = r4
                java.lang.Object r10 = r10.getState(r1, r9)
                if (r10 != r0) goto L_0x0066
                return r0
            L_0x0066:
                r1 = r10
                com.sugarcube.app.base.data.feature.ConfigState r1 = (com.sugarcube.app.base.data.feature.ConfigState) r1
                DF.C r10 = r9.f108795g
                com.sugarcube.app.base.data.feature.ConfigRepository r10 = r10.f108735v
                com.sugarcube.app.base.data.feature.ConfigItems$FeedbackCaptureType r4 = com.sugarcube.app.base.data.feature.ConfigItems.FeedbackCaptureType.INSTANCE
                r9.f108791c = r1
                r9.f108794f = r3
                java.lang.Object r10 = r10.getState(r4, r9)
                if (r10 != r0) goto L_0x007c
                return r0
            L_0x007c:
                com.sugarcube.app.base.data.feature.ConfigState r10 = (com.sugarcube.app.base.data.feature.ConfigState) r10
                boolean r3 = r1.isOverridden()
                if (r3 == 0) goto L_0x00ba
                DF.C r3 = r9.f108795g
                xF.a r3 = r3.p1()
                com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar$a r4 = r9.f108796h
                java.lang.String r5 = r9.f108797i
                if (r5 != 0) goto L_0x0093
                java.lang.String r6 = "(no feedback)"
                goto L_0x0094
            L_0x0093:
                r6 = r5
            L_0x0094:
                java.lang.Object r7 = r1.getCurrentValue()
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r10.getCurrentValue()
                java.lang.String r8 = (java.lang.String) r8
                r3.s(r4, r6, r7, r8)
                DF.C r3 = r9.f108795g
                com.sugarcube.app.base.data.feature.ConfigRepository r3 = r3.f108735v
                com.sugarcube.app.base.data.feature.ConfigItems$FeedbackCaptureId r4 = com.sugarcube.app.base.data.feature.ConfigItems.FeedbackCaptureId.INSTANCE
                r9.f108791c = r1
                r9.f108792d = r10
                r9.f108793e = r5
                r9.f108794f = r2
                java.lang.Object r10 = r3.clearOverride(r4, r9)
                if (r10 != r0) goto L_0x00ba
                return r0
            L_0x00ba:
                XH.N r10 = XH.C16807N.f139792a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.N.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$setDesignFeedbackHasBeenPresented$1", f = "GalleryViewModel.kt", l = {1140}, m = "invokeSuspend")
    /* renamed from: DF.C$O */
    static final class O extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108798c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        O(C12754C c10, C17164e<? super O> eVar) {
            super(2, eVar);
            this.f108799d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new O(this.f108799d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((O) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108798c;
            if (i10 == 0) {
                y.b(obj);
                PreferenceStorage b02 = this.f108799d.f108729s;
                f.a<Boolean> show_design_feedback_key = PreferenceImpl.PreferencesKeys.getSHOW_DESIGN_FEEDBACK_KEY();
                Boolean a10 = b.a(true);
                this.f108798c = 1;
                if (b02.setPreference(show_design_feedback_key, a10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$setNotificationPermissionRationalePresented$1", f = "GalleryViewModel.kt", l = {720}, m = "invokeSuspend")
    /* renamed from: DF.C$P */
    static final class P extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108800c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108801d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        P(C12754C c10, C17164e<? super P> eVar) {
            super(2, eVar);
            this.f108801d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new P(this.f108801d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((P) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108800c;
            if (i10 == 0) {
                y.b(obj);
                ConfigRepository U10 = this.f108801d.f108735v;
                ConfigItems.NotificationPermissionRationalePresented notificationPermissionRationalePresented = ConfigItems.NotificationPermissionRationalePresented.INSTANCE;
                Boolean a10 = b.a(true);
                this.f108800c = 1;
                if (U10.override(notificationPermissionRationalePresented, a10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "Lcom/sugarcube/app/base/data/Result;", "Lcom/sugarcube/core/network/models/Composition;", "<anonymous>", "(LQJ/Q;)Lcom/sugarcube/app/base/data/Result;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$shareComposition$2", f = "GalleryViewModel.kt", l = {1028}, m = "invokeSuspend")
    /* renamed from: DF.C$Q */
    static final class Q extends l implements p<QJ.Q, C17164e<? super Result<? extends Composition>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108802c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108803d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UUID f108804e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Q(C12754C c10, UUID uuid, C17164e<? super Q> eVar) {
            super(2, eVar);
            this.f108803d = c10;
            this.f108804e = uuid;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new Q(this.f108803d, this.f108804e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super Result<Composition>> eVar) {
            return ((Q) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108802c;
            if (i10 == 0) {
                y.b(obj);
                CompositionRepository Z02 = this.f108803d.Z0();
                UUID uuid = this.f108804e;
                this.f108802c = 1;
                obj = CompositionRepositorySource.shareComposition$default(Z02, uuid, false, this, 2, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Result result = (Result) obj;
            if (result instanceof Result.Success) {
                this.f108803d.p1().p();
                List list = (List) this.f108803d.f108732t1.getValue();
                if (list != null) {
                    C12754C c10 = this.f108803d;
                    UUID uuid2 = this.f108804e;
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        int i11 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i11 = -1;
                                break;
                            } else if (C17542s.e(((C12784a) it.next()).a(), uuid2)) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                        if (i11 >= 0) {
                            ((C12784a) list.get(i11)).d(true ^ ((C12784a) list.get(i11)).c());
                            c10.f108732t1.postValue(list);
                        }
                    }
                }
            } else if (!(result instanceof Result.Error)) {
                throw new t();
            }
            return result;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isFetching", "connected", "", "LDF/d;", "showroomItems", "refreshingCompositions", "<anonymous>", "(ZZLjava/util/List;Z)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$shouldShowLoadingIndicator$1", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: DF.C$R */
    static final class R extends l implements s<Boolean, Boolean, List<? extends C12787d>, Boolean, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108805c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f108806d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f108807e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f108808f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ boolean f108809g;

        R(C17164e<? super R> eVar) {
            super(5, eVar);
        }

        public final Object i(boolean z10, boolean z11, List<? extends C12787d> list, boolean z12, C17164e<? super Boolean> eVar) {
            R r10 = new R(eVar);
            r10.f108806d = z10;
            r10.f108807e = z11;
            r10.f108808f = list;
            r10.f108809g = z12;
            return r10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f108805c == 0) {
                y.b(obj);
                return b.a((this.f108806d && ((List) this.f108808f).isEmpty()) || !this.f108807e || this.f108809g);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (List) obj3, ((Boolean) obj4).booleanValue(), (C17164e) obj5);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$showPrivacyDisclaimerDialog$1$1", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: DF.C$S */
    static final class S extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108810c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108811d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        S(C12754C c10, C17164e<? super S> eVar) {
            super(2, eVar);
            this.f108811d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new S(this.f108811d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((S) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f108810c == 0) {
                y.b(obj);
                this.f108811d.f108739x.galleryLinkClicked();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$showPrivacyDisclaimerDialog$2$1", f = "GalleryViewModel.kt", l = {1405}, m = "invokeSuspend")
    /* renamed from: DF.C$T */
    static final class T extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108812c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f108813d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12754C f108814e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        T(C4899r0<Boolean> r0Var, C12754C c10, C17164e<? super T> eVar) {
            super(2, eVar);
            this.f108813d = r0Var;
            this.f108814e = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new T(this.f108813d, this.f108814e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((T) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108812c;
            if (i10 == 0) {
                y.b(obj);
                this.f108813d.setValue(b.a(true));
                PrivacyPolicyConsentUseCase c02 = this.f108814e.f108739x;
                this.f108812c = 1;
                obj = c02.galleryPositiveAction(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f108813d.setValue(b.a(false));
            if (booleanValue) {
                this.f108814e.j2();
                this.f108814e.f108691S.postValue(C15083h.a.f131169a);
            } else {
                this.f108814e.f108698W0.postValue(b.a(true));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$showPrivacyDisclaimerDialog$3$1", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: DF.C$U */
    static final class U extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108815c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108816d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        U(C12754C c10, C17164e<? super U> eVar) {
            super(2, eVar);
            this.f108816d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new U(this.f108816d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((U) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f108815c == 0) {
                y.b(obj);
                this.f108816d.f108739x.galleryNegativeAction();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$showPrivacyDisclaimerDialog$5$1", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: DF.C$V */
    static final class V extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108817c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108818d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f108819e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        V(C12754C c10, boolean z10, C17164e<? super V> eVar) {
            super(2, eVar);
            this.f108818d = c10;
            this.f108819e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new V(this.f108818d, this.f108819e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((V) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f108817c == 0) {
                y.b(obj);
                this.f108818d.f108739x.galleryUpdateCheckBoxState(this.f108819e);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$showPrivacyDisclaimerDialog$6$1", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: DF.C$W */
    static final class W extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108820c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108821d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        W(C12754C c10, C17164e<? super W> eVar) {
            super(2, eVar);
            this.f108821d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new W(this.f108821d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((W) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f108820c == 0) {
                y.b(obj);
                this.f108821d.f108739x.galleryLinkClicked();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/sugarcube/app/base/DeviceCompatibility$a;", "features", "", "Lcom/sugarcube/app/base/data/database/Scene;", "scenes", "", "<anonymous>", "(Lcom/sugarcube/app/base/DeviceCompatibility$a;Ljava/util/List;)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$showScansTab$1", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: DF.C$X */
    static final class X extends l implements nI.q<DeviceCompatibility.a, List<? extends Scene>, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108822c;

        X(C17164e<? super X> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(DeviceCompatibility.a aVar, List<Scene> list, C17164e<? super Boolean> eVar) {
            return new X(eVar).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f108822c == 0) {
                y.b(obj);
                return b.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isCaptureEnabled", "", "Lcom/sugarcube/app/base/data/database/Scene;", "scenes", "Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "<anonymous>", "(ZLjava/util/List;Lcom/sugarcube/app/base/ui/gallery/h;)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$showUnsupportedScansPage$2", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: DF.C$Y */
    static final class Y extends l implements r<Boolean, List<? extends Scene>, h, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108823c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f108824d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f108825e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f108826f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12754C f108827g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Y(C12754C c10, C17164e<? super Y> eVar) {
            super(4, eVar);
            this.f108827g = c10;
        }

        public final Object i(boolean z10, List<Scene> list, h hVar, C17164e<? super Boolean> eVar) {
            Y y10 = new Y(this.f108827g, eVar);
            y10.f108824d = z10;
            y10.f108825e = list;
            y10.f108826f = hVar;
            return y10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f108823c == 0) {
                y.b(obj);
                boolean z10 = !this.f108824d && ((List) this.f108825e).isEmpty() && C17542s.e((h) this.f108826f, h.c.f124419e);
                if (z10) {
                    this.f108827g.m2(Gallery.Warning.DeviceIncompatible);
                }
                return b.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i(((Boolean) obj).booleanValue(), (List) obj2, (h) obj3, (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "", "Lcom/sugarcube/core/network/models/Showroom;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$showrooms$1", f = "GalleryViewModel.kt", l = {142}, m = "invokeSuspend")
    /* renamed from: DF.C$Z */
    static final class Z extends l implements p<C16533h<? super List<? extends Showroom>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f108828c;

        /* renamed from: d  reason: collision with root package name */
        int f108829d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f108830e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12754C f108831f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Z(C12754C c10, C17164e<? super Z> eVar) {
            super(2, eVar);
            this.f108831f = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            Z z10 = new Z(this.f108831f, eVar);
            z10.f108830e = obj;
            return z10;
        }

        public final Object invoke(C16533h<? super List<Showroom>> hVar, C17164e<? super C16807N> eVar) {
            return ((Z) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: type inference failed for: r1v5, types: [androidx.lifecycle.F, androidx.lifecycle.K] */
        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108829d;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f108830e;
                this.f108831f.f108662D0.setValue(b.a(true));
                List list = (List) this.f108831f.s1().getShowrooms().getValue();
                List n10 = list == null ? C16877v.n() : list;
                this.f108830e = hVar;
                this.f108828c = list;
                this.f108829d = 1;
                if (hVar.emit(n10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                List list2 = (List) this.f108828c;
                C16533h hVar2 = (C16533h) this.f108830e;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f108831f.f108662D0.setValue(b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$2", f = "GalleryViewModel.kt", l = {319}, m = "invokeSuspend")
    /* renamed from: DF.C$a  reason: case insensitive filesystem */
    static final class C12755a extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f108832c;

        /* renamed from: d  reason: collision with root package name */
        int f108833d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12754C f108834e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12755a(C12754C c10, C17164e<? super C12755a> eVar) {
            super(2, eVar);
            this.f108834e = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12755a(this.f108834e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C12755a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16505B b10;
            Object f10 = C17187b.f();
            int i10 = this.f108833d;
            if (i10 == 0) {
                y.b(obj);
                C16505B X10 = this.f108834e.f108707c1;
                ConfigRepository U10 = this.f108834e.f108735v;
                FeatureFlags.DisableDesignsInShowrooms disableDesignsInShowrooms = FeatureFlags.DisableDesignsInShowrooms.INSTANCE;
                this.f108832c = X10;
                this.f108833d = 1;
                Object obj2 = U10.get(disableDesignsInShowrooms, this);
                if (obj2 == f10) {
                    return f10;
                }
                b10 = X10;
                obj = obj2;
            } else if (i10 == 1) {
                b10 = (C16505B) this.f108832c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b10.setValue(obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$softDeleteSelectedItems$3$1", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: DF.C$a0 */
    static final class a0 extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108835c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108836d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<UUID> f108837e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a0(C12754C c10, List<UUID> list, C17164e<? super a0> eVar) {
            super(2, eVar);
            this.f108836d = c10;
            this.f108837e = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a0(this.f108836d, this.f108837e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((a0) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f108835c == 0) {
                y.b(obj);
                this.f108836d.s1().softDeleteScenes(this.f108837e);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$3", f = "GalleryViewModel.kt", l = {323}, m = "invokeSuspend")
    /* renamed from: DF.C$b  reason: case insensitive filesystem */
    static final class C12756b extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108838c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108839d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: DF.C$b$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C12754C f108840a;

            a(C12754C c10) {
                this.f108840a = c10;
            }

            /* renamed from: c */
            public final Object emit(DeviceCompatibility.a aVar, C17164e<? super C16807N> eVar) {
                this.f108840a.f108671I.setValue(b.a(aVar.b()));
                this.f108840a.f108670H0.setValue(b.a(aVar.c()));
                this.f108840a.f108692S0.setValue(b.a(C17542s.e(aVar.a(), b.a(true))));
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12756b(C12754C c10, C17164e<? super C12756b> eVar) {
            super(2, eVar);
            this.f108839d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12756b(this.f108839d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C12756b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108838c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<DeviceCompatibility.a> supportedFeatures = this.f108839d.f108733u.getSupportedFeatures();
                a aVar = new a(this.f108839d);
                this.f108838c = 1;
                if (supportedFeatures.collect(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: DF.C$b0 */
    public static final class b0 implements C16532g<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f108841a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: DF.C$b0$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f108842a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$special$$inlined$map$1$2", f = "GalleryViewModel.kt", l = {50}, m = "emit")
            /* renamed from: DF.C$b0$a$a  reason: collision with other inner class name */
            public static final class C2605a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f108843c;

                /* renamed from: d  reason: collision with root package name */
                int f108844d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f108845e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2605a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f108845e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f108843c = obj;
                    this.f108844d |= Integer.MIN_VALUE;
                    return this.f108845e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f108842a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof DF.C12754C.b0.a.C2605a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    DF.C$b0$a$a r0 = (DF.C12754C.b0.a.C2605a) r0
                    int r1 = r0.f108844d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f108844d = r1
                    goto L_0x0018
                L_0x0013:
                    DF.C$b0$a$a r0 = new DF.C$b0$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f108843c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f108844d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f108842a
                    DF.C$h r5 = (DF.C12754C.C12761h) r5
                    if (r5 == 0) goto L_0x003f
                    com.sugarcube.app.base.ui.gallery.h r5 = r5.c()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    r0.f108844d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.b0.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b0(C16532g gVar) {
            this.f108841a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f108841a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$4", f = "GalleryViewModel.kt", l = {331}, m = "invokeSuspend")
    /* renamed from: DF.C$c */
    static final class c extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108846c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108847d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: DF.C$c$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C12754C f108848a;

            a(C12754C c10) {
                this.f108848a = c10;
            }

            /* renamed from: c */
            public final Object emit(NetworkStatus networkStatus, C17164e<? super C16807N> eVar) {
                if (networkStatus.getOutage()) {
                    C12754C.N2(this.f108848a, false, 1, (Object) null);
                } else if (networkStatus.getNeedsUpdate()) {
                    C12754C.P2(this.f108848a, false, 1, (Object) null);
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C12754C c10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f108847d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f108847d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108846c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<NetworkStatus> s10 = C16534i.s(C5210m.a(this.f108847d.f108737w.getNetworkStatus()));
                a aVar = new a(this.f108847d);
                this.f108846c = 1;
                if (s10.collect(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$startCheckingForUpdates$1", f = "GalleryViewModel.kt", l = {831}, m = "invokeSuspend")
    /* renamed from: DF.C$c0 */
    static final class c0 extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108849c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108850d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$startCheckingForUpdates$1$1", f = "GalleryViewModel.kt", l = {834, 836}, m = "invokeSuspend")
        /* renamed from: DF.C$c0$a */
        static final class a extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f108851c;

            /* renamed from: d  reason: collision with root package name */
            int f108852d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ Object f108853e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C12754C f108854f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C12754C c10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f108854f = c10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f108854f, eVar);
                aVar.f108853e = obj;
                return aVar;
            }

            public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r9.f108852d
                    r2 = 0
                    java.lang.String r3 = "Sugarcube"
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L_0x002d
                    if (r1 == r5) goto L_0x0024
                    if (r1 != r4) goto L_0x001c
                    int r1 = r9.f108851c
                    java.lang.Object r6 = r9.f108853e
                    QJ.Q r6 = (QJ.Q) r6
                    XH.y.b(r10)
                L_0x001a:
                    r10 = r6
                    goto L_0x003a
                L_0x001c:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L_0x0024:
                    java.lang.Object r1 = r9.f108853e
                    QJ.Q r1 = (QJ.Q) r1
                    XH.y.b(r10)
                    r6 = r1
                    goto L_0x0056
                L_0x002d:
                    XH.y.b(r10)
                    java.lang.Object r10 = r9.f108853e
                    QJ.Q r10 = (QJ.Q) r10
                    java.lang.String r1 = "start update loop"
                    android.util.Log.d(r3, r1)
                    r1 = r5
                L_0x003a:
                    boolean r6 = QJ.S.h(r10)
                    if (r6 == 0) goto L_0x0075
                    DF.C r6 = r9.f108854f
                    if (r1 == 0) goto L_0x0046
                    r7 = r5
                    goto L_0x0047
                L_0x0046:
                    r7 = r2
                L_0x0047:
                    r9.f108853e = r10
                    r9.f108851c = r1
                    r9.f108852d = r5
                    java.lang.Object r1 = r6.k3(r7, r9)
                    if (r1 != r0) goto L_0x0054
                    return r0
                L_0x0054:
                    r6 = r10
                    r10 = r1
                L_0x0056:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L_0x0075
                    java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
                    r7 = 30
                    long r7 = r10.toMillis(r7)
                    r9.f108853e = r6
                    r9.f108851c = r2
                    r9.f108852d = r4
                    java.lang.Object r10 = QJ.C16297b0.b(r7, r9)
                    if (r10 != r0) goto L_0x0073
                    return r0
                L_0x0073:
                    r1 = r2
                    goto L_0x001a
                L_0x0075:
                    DF.C r10 = r9.f108854f
                    r0 = 0
                    r10.f108743y1 = r0
                    java.lang.String r10 = "update loop done"
                    android.util.Log.d(r3, r10)
                    XH.N r10 = XH.C16807N.f139792a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.c0.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c0(C12754C c10, C17164e<? super c0> eVar) {
            super(2, eVar);
            this.f108850d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c0(this.f108850d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((c0) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108849c;
            if (i10 == 0) {
                y.b(obj);
                QJ.M b10 = C16311i0.b();
                a aVar = new a(this.f108850d, (C17164e<? super a>) null);
                this.f108849c = 1;
                if (C16310i.g(b10, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$5", f = "GalleryViewModel.kt", l = {341}, m = "invokeSuspend")
    /* renamed from: DF.C$d  reason: case insensitive filesystem */
    static final class C12757d extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108855c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12757d(C12754C c10, C17164e<? super C12757d> eVar) {
            super(2, eVar);
            this.f108856d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12757d(this.f108856d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C12757d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108855c;
            if (i10 == 0) {
                y.b(obj);
                ConfigRepository U10 = this.f108856d.f108735v;
                FeatureFlags.UpgradeWall upgradeWall = FeatureFlags.UpgradeWall.INSTANCE;
                this.f108855c = 1;
                obj = U10.get(upgradeWall, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                C12754C.P2(this.f108856d, false, 1, (Object) null);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$startCheckingForUpdates$2", f = "GalleryViewModel.kt", l = {845}, m = "invokeSuspend")
    /* renamed from: DF.C$d0 */
    static final class d0 extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108857c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d0(C12754C c10, C17164e<? super d0> eVar) {
            super(2, eVar);
            this.f108858d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d0(this.f108858d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((d0) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108857c;
            if (i10 == 0) {
                y.b(obj);
                SceneRepository s12 = this.f108858d.s1();
                this.f108857c = 1;
                if (s12.clearRoomReadyCount(this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$6", f = "GalleryViewModel.kt", l = {347}, m = "invokeSuspend")
    /* renamed from: DF.C$e  reason: case insensitive filesystem */
    static final class C12758e extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108859c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108860d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: DF.C$e$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C12754C f108861a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$6$1", f = "GalleryViewModel.kt", l = {349, 350}, m = "emit")
            /* renamed from: DF.C$e$a$a  reason: collision with other inner class name */
            static final class C2606a extends d {

                /* renamed from: c  reason: collision with root package name */
                Object f108862c;

                /* renamed from: d  reason: collision with root package name */
                Object f108863d;

                /* renamed from: e  reason: collision with root package name */
                Object f108864e;

                /* renamed from: f  reason: collision with root package name */
                Object f108865f;

                /* renamed from: g  reason: collision with root package name */
                boolean f108866g;

                /* renamed from: h  reason: collision with root package name */
                /* synthetic */ Object f108867h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ a<T> f108868i;

                /* renamed from: j  reason: collision with root package name */
                int f108869j;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2606a(a<? super T> aVar, C17164e<? super C2606a> eVar) {
                    super(eVar);
                    this.f108868i = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f108867h = obj;
                    this.f108869j |= Integer.MIN_VALUE;
                    return this.f108868i.c(false, this);
                }
            }

            a(C12754C c10) {
                this.f108861a = c10;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a3, code lost:
                if (((java.lang.Boolean) r1).booleanValue() == false) goto L_0x00a6;
             */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object c(boolean r10, dI.C17164e<? super XH.C16807N> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof DF.C12754C.C12758e.a.C2606a
                    if (r0 == 0) goto L_0x0013
                    r0 = r11
                    DF.C$e$a$a r0 = (DF.C12754C.C12758e.a.C2606a) r0
                    int r1 = r0.f108869j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f108869j = r1
                    goto L_0x0018
                L_0x0013:
                    DF.C$e$a$a r0 = new DF.C$e$a$a
                    r0.<init>(r9, r11)
                L_0x0018:
                    java.lang.Object r1 = r0.f108867h
                    java.lang.Object r2 = eI.C17187b.f()
                    int r3 = r0.f108869j
                    r4 = 2
                    r5 = 1
                    if (r3 == 0) goto L_0x0055
                    if (r3 == r5) goto L_0x0040
                    if (r3 != r4) goto L_0x0038
                    java.lang.Object r10 = r0.f108864e
                    androidx.lifecycle.K r10 = (androidx.lifecycle.K) r10
                    java.lang.Object r11 = r0.f108863d
                    dI.e r11 = (dI.C17164e) r11
                    java.lang.Object r11 = r0.f108862c
                    DF.C$e$a r11 = (DF.C12754C.C12758e.a) r11
                    XH.y.b(r1)
                    goto L_0x009d
                L_0x0038:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L_0x0040:
                    boolean r10 = r0.f108866g
                    java.lang.Object r11 = r0.f108864e
                    androidx.lifecycle.K r11 = (androidx.lifecycle.K) r11
                    java.lang.Object r3 = r0.f108863d
                    dI.e r3 = (dI.C17164e) r3
                    java.lang.Object r6 = r0.f108862c
                    DF.C$e$a r6 = (DF.C12754C.C12758e.a) r6
                    XH.y.b(r1)
                    r8 = r11
                    r11 = r10
                    r10 = r8
                    goto L_0x007b
                L_0x0055:
                    XH.y.b(r1)
                    DF.C r1 = r9.f108861a
                    androidx.lifecycle.K r1 = r1.f108704Z0
                    DF.C r3 = r9.f108861a
                    com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase r3 = r3.f108739x
                    r0.f108862c = r9
                    r0.f108863d = r11
                    r0.f108864e = r1
                    r0.f108866g = r10
                    r0.f108869j = r5
                    java.lang.Object r3 = r3.shouldDisplayPrivacyPolicyBanner(r0)
                    if (r3 != r2) goto L_0x0075
                    return r2
                L_0x0075:
                    r6 = r9
                    r8 = r11
                    r11 = r10
                    r10 = r1
                    r1 = r3
                    r3 = r8
                L_0x007b:
                    r7 = r1
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    if (r7 == 0) goto L_0x00a6
                    DF.C r7 = r6.f108861a
                    com.sugarcube.app.base.data.SceneRepository r7 = r7.s1()
                    r0.f108862c = r6
                    r0.f108863d = r3
                    r0.f108864e = r10
                    r0.f108865f = r1
                    r0.f108866g = r11
                    r0.f108869j = r4
                    java.lang.Object r1 = r7.hasPendingUploads(r0)
                    if (r1 != r2) goto L_0x009d
                    return r2
                L_0x009d:
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r11 = r1.booleanValue()
                    if (r11 == 0) goto L_0x00a6
                    goto L_0x00a7
                L_0x00a6:
                    r5 = 0
                L_0x00a7:
                    java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r10.setValue(r11)
                    XH.N r10 = XH.C16807N.f139792a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.C12758e.a.c(boolean, dI.e):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12758e(C12754C c10, C17164e<? super C12758e> eVar) {
            super(2, eVar);
            this.f108860d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12758e(this.f108860d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C12758e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108859c;
            if (i10 == 0) {
                y.b(obj);
                C16519P<Boolean> isLoggedIn = this.f108860d.f108731t.isLoggedIn();
                a aVar = new a(this.f108860d);
                this.f108859c = 1;
                if (isLoggedIn.collect(aVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel", f = "GalleryViewModel.kt", l = {862, 864, 865}, m = "startRefresh")
    /* renamed from: DF.C$e0 */
    static final class e0 extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f108870c;

        /* renamed from: d  reason: collision with root package name */
        Object f108871d;

        /* renamed from: e  reason: collision with root package name */
        boolean f108872e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f108873f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12754C f108874g;

        /* renamed from: h  reason: collision with root package name */
        int f108875h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e0(C12754C c10, C17164e<? super e0> eVar) {
            super(eVar);
            this.f108874g = c10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f108873f = obj;
            this.f108875h |= Integer.MIN_VALUE;
            return this.f108874g.k3(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$7", f = "GalleryViewModel.kt", l = {355}, m = "invokeSuspend")
    /* renamed from: DF.C$f  reason: case insensitive filesystem */
    static final class C12759f extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108876c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108877d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: DF.C$f$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C12754C f108878a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$7$1", f = "GalleryViewModel.kt", l = {357, 358}, m = "emit")
            /* renamed from: DF.C$f$a$a  reason: collision with other inner class name */
            static final class C2607a extends d {

                /* renamed from: c  reason: collision with root package name */
                Object f108879c;

                /* renamed from: d  reason: collision with root package name */
                Object f108880d;

                /* renamed from: e  reason: collision with root package name */
                Object f108881e;

                /* renamed from: f  reason: collision with root package name */
                Object f108882f;

                /* renamed from: g  reason: collision with root package name */
                Object f108883g;

                /* renamed from: h  reason: collision with root package name */
                /* synthetic */ Object f108884h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ a<T> f108885i;

                /* renamed from: j  reason: collision with root package name */
                int f108886j;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2607a(a<? super T> aVar, C17164e<? super C2607a> eVar) {
                    super(eVar);
                    this.f108885i = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f108884h = obj;
                    this.f108886j |= Integer.MIN_VALUE;
                    return this.f108885i.emit((List<Scene>) null, this);
                }
            }

            a(C12754C c10) {
                this.f108878a = c10;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a5, code lost:
                if (((java.lang.Boolean) r1).booleanValue() == false) goto L_0x00a8;
             */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.util.List<com.sugarcube.app.base.data.database.Scene> r10, dI.C17164e<? super XH.C16807N> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof DF.C12754C.C12759f.a.C2607a
                    if (r0 == 0) goto L_0x0013
                    r0 = r11
                    DF.C$f$a$a r0 = (DF.C12754C.C12759f.a.C2607a) r0
                    int r1 = r0.f108886j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f108886j = r1
                    goto L_0x0018
                L_0x0013:
                    DF.C$f$a$a r0 = new DF.C$f$a$a
                    r0.<init>(r9, r11)
                L_0x0018:
                    java.lang.Object r1 = r0.f108884h
                    java.lang.Object r2 = eI.C17187b.f()
                    int r3 = r0.f108886j
                    r4 = 2
                    r5 = 1
                    if (r3 == 0) goto L_0x0058
                    if (r3 == r5) goto L_0x0044
                    if (r3 != r4) goto L_0x003c
                    java.lang.Object r10 = r0.f108882f
                    androidx.lifecycle.K r10 = (androidx.lifecycle.K) r10
                    java.lang.Object r11 = r0.f108881e
                    dI.e r11 = (dI.C17164e) r11
                    java.lang.Object r11 = r0.f108880d
                    java.util.List r11 = (java.util.List) r11
                    java.lang.Object r11 = r0.f108879c
                    DF.C$f$a r11 = (DF.C12754C.C12759f.a) r11
                    XH.y.b(r1)
                    goto L_0x009f
                L_0x003c:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L_0x0044:
                    java.lang.Object r10 = r0.f108882f
                    androidx.lifecycle.K r10 = (androidx.lifecycle.K) r10
                    java.lang.Object r11 = r0.f108881e
                    dI.e r11 = (dI.C17164e) r11
                    java.lang.Object r3 = r0.f108880d
                    java.util.List r3 = (java.util.List) r3
                    java.lang.Object r6 = r0.f108879c
                    DF.C$f$a r6 = (DF.C12754C.C12759f.a) r6
                    XH.y.b(r1)
                    goto L_0x007d
                L_0x0058:
                    XH.y.b(r1)
                    DF.C r1 = r9.f108878a
                    androidx.lifecycle.K r1 = r1.f108704Z0
                    DF.C r3 = r9.f108878a
                    com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase r3 = r3.f108739x
                    r0.f108879c = r9
                    r0.f108880d = r10
                    r0.f108881e = r11
                    r0.f108882f = r1
                    r0.f108886j = r5
                    java.lang.Object r3 = r3.shouldDisplayPrivacyPolicyBanner(r0)
                    if (r3 != r2) goto L_0x0078
                    return r2
                L_0x0078:
                    r6 = r9
                    r8 = r3
                    r3 = r10
                    r10 = r1
                    r1 = r8
                L_0x007d:
                    r7 = r1
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    if (r7 == 0) goto L_0x00a8
                    DF.C r7 = r6.f108878a
                    com.sugarcube.app.base.data.SceneRepository r7 = r7.s1()
                    r0.f108879c = r6
                    r0.f108880d = r3
                    r0.f108881e = r11
                    r0.f108882f = r10
                    r0.f108883g = r1
                    r0.f108886j = r4
                    java.lang.Object r1 = r7.hasPendingUploads(r0)
                    if (r1 != r2) goto L_0x009f
                    return r2
                L_0x009f:
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r11 = r1.booleanValue()
                    if (r11 == 0) goto L_0x00a8
                    goto L_0x00a9
                L_0x00a8:
                    r5 = 0
                L_0x00a9:
                    java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r10.setValue(r11)
                    XH.N r10 = XH.C16807N.f139792a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.C12759f.a.emit(java.util.List, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12759f(C12754C c10, C17164e<? super C12759f> eVar) {
            super(2, eVar);
            this.f108877d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12759f(this.f108877d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C12759f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108876c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<List<Scene>> s10 = C16534i.s(C5210m.a(this.f108877d.s1().getScenes()));
                a aVar = new a(this.f108877d);
                this.f108876c = 1;
                if (s10.collect(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$stopCheckingForUpdates$1", f = "GalleryViewModel.kt", l = {825}, m = "invokeSuspend")
    /* renamed from: DF.C$f0 */
    static final class f0 extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108887c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f0(C12754C c10, C17164e<? super f0> eVar) {
            super(2, eVar);
            this.f108888d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f0(this.f108888d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((f0) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108887c;
            if (i10 == 0) {
                y.b(obj);
                SceneRepository s12 = this.f108888d.s1();
                this.f108887c = 1;
                if (s12.clearRoomReadyCount(this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$8", f = "GalleryViewModel.kt", l = {390}, m = "invokeSuspend")
    /* renamed from: DF.C$g  reason: case insensitive filesystem */
    static final class C12760g extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f108889c;

        /* renamed from: d  reason: collision with root package name */
        Object f108890d;

        /* renamed from: e  reason: collision with root package name */
        int f108891e;

        /* renamed from: f  reason: collision with root package name */
        int f108892f;

        /* renamed from: g  reason: collision with root package name */
        int f108893g;

        /* renamed from: h  reason: collision with root package name */
        int f108894h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C12754C f108895i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "hasDesigns", "hasScans", "captureSupported", "LDF/C$h;", "<anonymous>", "(ZZZ)LDF/C$h;"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$8$4", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: DF.C$g$a */
        static final class a extends l implements r<Boolean, Boolean, Boolean, C17164e<? super C12761h>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f108896c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ boolean f108897d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ boolean f108898e;

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ boolean f108899f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C12754C f108900g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C12754C c10, C17164e<? super a> eVar) {
                super(4, eVar);
                this.f108900g = c10;
            }

            public final Object i(boolean z10, boolean z11, boolean z12, C17164e<? super C12761h> eVar) {
                a aVar = new a(this.f108900g, eVar);
                aVar.f108897d = z10;
                aVar.f108898e = z11;
                aVar.f108899f = z12;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f108896c == 0) {
                    y.b(obj);
                    boolean z10 = this.f108897d;
                    boolean z11 = this.f108898e;
                    boolean z12 = this.f108899f;
                    if (this.f108900g.N1().getValue().c() == null) {
                        this.f108900g.N1().setValue(C12761h.b(this.f108900g.N1().getValue(), this.f108900g.e2(z12, z11, z10), (List) null, 2, (Object) null));
                    }
                    return C12761h.b(this.f108900g.N1().getValue(), (h) null, C16877v.s(z10 ? h.b.f124418e : null, (z11 || z12) ? h.c.f124419e : null, h.d.f124420e), 1, (Object) null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (C17164e) obj4);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: DF.C$g$b */
        static final class b<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C12754C f108901a;

            b(C12754C c10) {
                this.f108901a = c10;
            }

            /* renamed from: c */
            public final Object emit(C12761h hVar, C17164e<? super C16807N> eVar) {
                this.f108901a.N1().setValue(hVar);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: DF.C$g$c */
        public static final class c implements C16532g<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f108902a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: DF.C$g$c$a */
            public static final class a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f108903a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$8$invokeSuspend$$inlined$map$1$2", f = "GalleryViewModel.kt", l = {50}, m = "emit")
                /* renamed from: DF.C$g$c$a$a  reason: collision with other inner class name */
                public static final class C2608a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f108904c;

                    /* renamed from: d  reason: collision with root package name */
                    int f108905d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ a f108906e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C2608a(a aVar, C17164e eVar) {
                        super(eVar);
                        this.f108906e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f108904c = obj;
                        this.f108905d |= Integer.MIN_VALUE;
                        return this.f108906e.emit((Object) null, this);
                    }
                }

                public a(C16533h hVar) {
                    this.f108903a = hVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof DF.C12754C.C12760g.c.a.C2608a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        DF.C$g$c$a$a r0 = (DF.C12754C.C12760g.c.a.C2608a) r0
                        int r1 = r0.f108905d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f108905d = r1
                        goto L_0x0018
                    L_0x0013:
                        DF.C$g$c$a$a r0 = new DF.C$g$c$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f108904c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f108905d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r6)
                        goto L_0x004c
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        XH.y.b(r6)
                        TJ.h r6 = r4.f108903a
                        java.util.List r5 = (java.util.List) r5
                        java.util.Collection r5 = (java.util.Collection) r5
                        boolean r5 = r5.isEmpty()
                        r5 = r5 ^ r3
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.f108905d = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x004c
                        return r1
                    L_0x004c:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.C12760g.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public c(C16532g gVar) {
                this.f108902a = gVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f108902a.collect(new a(hVar), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: DF.C$g$d */
        public static final class d implements C16532g<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f108907a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: DF.C$g$d$a */
            public static final class a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f108908a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$8$invokeSuspend$$inlined$map$2$2", f = "GalleryViewModel.kt", l = {50}, m = "emit")
                /* renamed from: DF.C$g$d$a$a  reason: collision with other inner class name */
                public static final class C2609a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f108909c;

                    /* renamed from: d  reason: collision with root package name */
                    int f108910d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ a f108911e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C2609a(a aVar, C17164e eVar) {
                        super(eVar);
                        this.f108911e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f108909c = obj;
                        this.f108910d |= Integer.MIN_VALUE;
                        return this.f108911e.emit((Object) null, this);
                    }
                }

                public a(C16533h hVar) {
                    this.f108908a = hVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof DF.C12754C.C12760g.d.a.C2609a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        DF.C$g$d$a$a r0 = (DF.C12754C.C12760g.d.a.C2609a) r0
                        int r1 = r0.f108910d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f108910d = r1
                        goto L_0x0018
                    L_0x0013:
                        DF.C$g$d$a$a r0 = new DF.C$g$d$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f108909c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f108910d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r6)
                        goto L_0x004c
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        XH.y.b(r6)
                        TJ.h r6 = r4.f108908a
                        java.util.List r5 = (java.util.List) r5
                        java.util.Collection r5 = (java.util.Collection) r5
                        boolean r5 = r5.isEmpty()
                        r5 = r5 ^ r3
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.f108910d = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x004c
                        return r1
                    L_0x004c:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.C12760g.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public d(C16532g gVar) {
                this.f108907a = gVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f108907a.collect(new a(hVar), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: DF.C$g$e */
        public static final class e implements C16532g<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f108912a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: DF.C$g$e$a */
            public static final class a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f108913a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$8$invokeSuspend$$inlined$map$3$2", f = "GalleryViewModel.kt", l = {50}, m = "emit")
                /* renamed from: DF.C$g$e$a$a  reason: collision with other inner class name */
                public static final class C2610a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f108914c;

                    /* renamed from: d  reason: collision with root package name */
                    int f108915d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ a f108916e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C2610a(a aVar, C17164e eVar) {
                        super(eVar);
                        this.f108916e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f108914c = obj;
                        this.f108915d |= Integer.MIN_VALUE;
                        return this.f108916e.emit((Object) null, this);
                    }
                }

                public a(C16533h hVar) {
                    this.f108913a = hVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof DF.C12754C.C12760g.e.a.C2610a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        DF.C$g$e$a$a r0 = (DF.C12754C.C12760g.e.a.C2610a) r0
                        int r1 = r0.f108915d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f108915d = r1
                        goto L_0x0018
                    L_0x0013:
                        DF.C$g$e$a$a r0 = new DF.C$g$e$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f108914c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f108915d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r6)
                        goto L_0x0049
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        XH.y.b(r6)
                        TJ.h r6 = r4.f108913a
                        com.sugarcube.app.base.DeviceCompatibility$a r5 = (com.sugarcube.app.base.DeviceCompatibility.a) r5
                        boolean r5 = r5.b()
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.f108915d = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x0049
                        return r1
                    L_0x0049:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.C12760g.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public e(C16532g gVar) {
                this.f108912a = gVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f108912a.collect(new a(hVar), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12760g(C12754C c10, C17164e<? super C12760g> eVar) {
            super(2, eVar);
            this.f108895i = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12760g(this.f108895i, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C12760g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108894h;
            if (i10 == 0) {
                y.b(obj);
                this.f108895i.i2();
                c cVar = new c(this.f108895i.I0());
                d dVar = new d(this.f108895i.y2());
                C16532g<DeviceCompatibility.a> supportedFeatures = this.f108895i.f108733u.getSupportedFeatures();
                C16532g m10 = C16534i.m(cVar, dVar, new e(supportedFeatures), new a(this.f108895i, (C17164e<? super a>) null));
                b bVar = new b(this.f108895i);
                this.f108889c = supportedFeatures;
                this.f108890d = supportedFeatures;
                this.f108891e = 0;
                this.f108892f = 0;
                this.f108893g = 0;
                this.f108894h = 1;
                if (m10.collect(bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16532g gVar = (C16532g) this.f108890d;
                C16532g gVar2 = (C16532g) this.f108889c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LDF/C$h;", "", "Lcom/sugarcube/app/base/ui/gallery/h;", "currentTab", "", "visibleTabs", "<init>", "(Lcom/sugarcube/app/base/ui/gallery/h;Ljava/util/List;)V", "a", "(Lcom/sugarcube/app/base/ui/gallery/h;Ljava/util/List;)LDF/C$h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sugarcube/app/base/ui/gallery/h;", "c", "()Lcom/sugarcube/app/base/ui/gallery/h;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: DF.C$h  reason: case insensitive filesystem */
    public static final class C12761h {

        /* renamed from: a  reason: collision with root package name */
        private final h f108917a;

        /* renamed from: b  reason: collision with root package name */
        private final List<h> f108918b;

        public C12761h() {
            this((h) null, (List) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ C12761h b(C12761h hVar, h hVar2, List<h> list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                hVar2 = hVar.f108917a;
            }
            if ((i10 & 2) != 0) {
                list = hVar.f108918b;
            }
            return hVar.a(hVar2, list);
        }

        public final C12761h a(h hVar, List<? extends h> list) {
            C17542s.j(list, "visibleTabs");
            return new C12761h(hVar, list);
        }

        public final h c() {
            return this.f108917a;
        }

        public final List<h> d() {
            return this.f108918b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12761h)) {
                return false;
            }
            C12761h hVar = (C12761h) obj;
            return C17542s.e(this.f108917a, hVar.f108917a) && C17542s.e(this.f108918b, hVar.f108918b);
        }

        public int hashCode() {
            h hVar = this.f108917a;
            return ((hVar == null ? 0 : hVar.hashCode()) * 31) + this.f108918b.hashCode();
        }

        public String toString() {
            h hVar = this.f108917a;
            List<h> list = this.f108918b;
            return "TabConfig(currentTab=" + hVar + ", visibleTabs=" + list + ")";
        }

        public C12761h(h hVar, List<? extends h> list) {
            C17542s.j(list, "visibleTabs");
            this.f108917a = hVar;
            this.f108918b = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C12761h(h hVar, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : hVar, (i10 & 2) != 0 ? C16877v.n() : list);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel", f = "GalleryViewModel.kt", l = {1303}, m = "addAllItemsToCart")
    /* renamed from: DF.C$i  reason: case insensitive filesystem */
    static final class C12762i extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f108919c;

        /* renamed from: d  reason: collision with root package name */
        Object f108920d;

        /* renamed from: e  reason: collision with root package name */
        Object f108921e;

        /* renamed from: f  reason: collision with root package name */
        Object f108922f;

        /* renamed from: g  reason: collision with root package name */
        Object f108923g;

        /* renamed from: h  reason: collision with root package name */
        Object f108924h;

        /* renamed from: i  reason: collision with root package name */
        Object f108925i;

        /* renamed from: j  reason: collision with root package name */
        Object f108926j;

        /* renamed from: k  reason: collision with root package name */
        int f108927k;

        /* renamed from: l  reason: collision with root package name */
        int f108928l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f108929m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C12754C f108930n;

        /* renamed from: o  reason: collision with root package name */
        int f108931o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12762i(C12754C c10, C17164e<? super C12762i> eVar) {
            super(eVar);
            this.f108930n = c10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f108929m = obj;
            this.f108931o |= Integer.MIN_VALUE;
            return this.f108930n.u0(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel", f = "GalleryViewModel.kt", l = {1274}, m = "addItemToCart")
    /* renamed from: DF.C$j  reason: case insensitive filesystem */
    static final class C12763j extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f108932c;

        /* renamed from: d  reason: collision with root package name */
        Object f108933d;

        /* renamed from: e  reason: collision with root package name */
        Object f108934e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f108935f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12754C f108936g;

        /* renamed from: h  reason: collision with root package name */
        int f108937h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12763j(C12754C c10, C17164e<? super C12763j> eVar) {
            super(eVar);
            this.f108936g = c10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f108935f = obj;
            this.f108937h |= Integer.MIN_VALUE;
            return this.f108936g.v0((CachedCatalogItem) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$checkNotificationsPermissions$1", f = "GalleryViewModel.kt", l = {708, 712}, m = "invokeSuspend")
    /* renamed from: DF.C$k  reason: case insensitive filesystem */
    static final class C12764k extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f108938c;

        /* renamed from: d  reason: collision with root package name */
        int f108939d;

        /* renamed from: e  reason: collision with root package name */
        int f108940e;

        /* renamed from: f  reason: collision with root package name */
        Object f108941f;

        /* renamed from: g  reason: collision with root package name */
        int f108942g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C12754C f108943h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ List<Scene> f108944i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12764k(C12754C c10, List<Scene> list, C17164e<? super C12764k> eVar) {
            super(2, eVar);
            this.f108943h = c10;
            this.f108944i = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12764k(this.f108943h, this.f108944i, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C12764k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            int i10;
            Object f10 = C17187b.f();
            int i11 = this.f108942g;
            if (i11 == 0) {
                y.b(obj);
                ConfigRepository U10 = this.f108943h.f108735v;
                ConfigItems.NotificationPermissionRationalePresented notificationPermissionRationalePresented = ConfigItems.NotificationPermissionRationalePresented.INSTANCE;
                this.f108942g = 1;
                obj = U10.get(notificationPermissionRationalePresented, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i11 == 1) {
                y.b(obj);
            } else if (i11 == 2) {
                Iterable iterable = (Iterable) this.f108941f;
                y.b(obj);
                this.f108943h.f108680M0.postValue(b.a(true));
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Iterable iterable2 = this.f108944i;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it = iterable2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C16877v.q(SceneState.UPLOADING, SceneState.PROCESSING).contains(((Scene) it.next()).getState())) {
                            i10 = 1;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            i10 = 0;
            if (i10 != 0 && !booleanValue) {
                this.f108941f = iterable2;
                this.f108938c = booleanValue;
                this.f108939d = i10;
                this.f108940e = 0;
                this.f108942g = 2;
                if (C16297b0.b(5000, this) == f10) {
                    return f10;
                }
                this.f108943h.f108680M0.postValue(b.a(true));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "Lcom/sugarcube/app/base/data/Result;", "Lcom/sugarcube/core/network/models/Composition;", "<anonymous>", "(LQJ/Q;)Lcom/sugarcube/app/base/data/Result;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$cloneComposition$2", f = "GalleryViewModel.kt", l = {1075}, m = "invokeSuspend")
    /* renamed from: DF.C$l  reason: case insensitive filesystem */
    static final class C12765l extends l implements p<QJ.Q, C17164e<? super Result<? extends Composition>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f108945c;

        /* renamed from: d  reason: collision with root package name */
        int f108946d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12754C f108947e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Composition f108948f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12765l(C12754C c10, Composition composition, C17164e<? super C12765l> eVar) {
            super(2, eVar);
            this.f108947e = c10;
            this.f108948f = composition;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12765l(this.f108947e, this.f108948f, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super Result<Composition>> eVar) {
            return ((C12765l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108946d;
            if (i10 == 0) {
                y.b(obj);
                String S10 = this.f108947e.W0(this.f108948f);
                CompositionRepository Z02 = this.f108947e.Z0();
                UUID compositionUuid = this.f108948f.getCompositionUuid();
                this.f108945c = S10;
                this.f108946d = 1;
                obj = Z02.cloneComposition(compositionUuid, S10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                String str = (String) this.f108945c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Result result = (Result) obj;
            if (result instanceof Result.Success) {
                this.f108947e.h2();
                this.f108947e.p1().h();
            } else if (!(result instanceof Result.Error)) {
                throw new t();
            }
            return result;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: DF.C$m  reason: case insensitive filesystem */
    public static final class C12766m<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((C12785b) t11).a().getCreatedAt(), ((C12785b) t10).a().getCreatedAt());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: DF.C$n  reason: case insensitive filesystem */
    public static final class C12767n<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((Composition) t10).getCreatedAt(), ((Composition) t11).getCreatedAt());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "Lcom/sugarcube/app/base/data/Result;", "", "<anonymous>", "(LQJ/Q;)Lcom/sugarcube/app/base/data/Result;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$deleteComposition$2", f = "GalleryViewModel.kt", l = {1058}, m = "invokeSuspend")
    /* renamed from: DF.C$o  reason: case insensitive filesystem */
    static final class C12768o extends l implements p<QJ.Q, C17164e<? super Result<? extends Boolean>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108949c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108950d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UUID f108951e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12768o(C12754C c10, UUID uuid, C17164e<? super C12768o> eVar) {
            super(2, eVar);
            this.f108950d = c10;
            this.f108951e = uuid;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12768o(this.f108950d, this.f108951e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super Result<Boolean>> eVar) {
            return ((C12768o) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108949c;
            if (i10 == 0) {
                y.b(obj);
                CompositionRepository Z02 = this.f108950d.Z0();
                UUID uuid = this.f108951e;
                this.f108949c = 1;
                obj = Z02.deleteComposition(uuid, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Result result = (Result) obj;
            if (result instanceof Result.Success) {
                this.f108950d.p1().i();
                this.f108950d.j2();
            } else if (!(result instanceof Result.Error)) {
                throw new t();
            }
            return result;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: DF.C$p  reason: case insensitive filesystem */
    public static final class C12769p implements C16532g<List<? extends C12785b>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f108952a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: DF.C$p$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f108953a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$designItems$$inlined$map$1$2", f = "GalleryViewModel.kt", l = {50}, m = "emit")
            /* renamed from: DF.C$p$a$a  reason: collision with other inner class name */
            public static final class C2611a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f108954c;

                /* renamed from: d  reason: collision with root package name */
                int f108955d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f108956e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2611a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f108956e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f108954c = obj;
                    this.f108955d |= Integer.MIN_VALUE;
                    return this.f108956e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f108953a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof DF.C12754C.C12769p.a.C2611a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    DF.C$p$a$a r0 = (DF.C12754C.C12769p.a.C2611a) r0
                    int r1 = r0.f108955d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f108955d = r1
                    goto L_0x0018
                L_0x0013:
                    DF.C$p$a$a r0 = new DF.C$p$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f108954c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f108955d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x0072
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f108953a
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    DF.C$q r2 = new DF.C$q
                    r2.<init>()
                    java.util.List r7 = YH.C16877v.g1(r7, r2)
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r7, r4)
                    r2.<init>(r4)
                    java.util.Iterator r7 = r7.iterator()
                L_0x0054:
                    boolean r4 = r7.hasNext()
                    if (r4 == 0) goto L_0x0069
                    java.lang.Object r4 = r7.next()
                    com.sugarcube.core.network.models.Composition r4 = (com.sugarcube.core.network.models.Composition) r4
                    DF.b r5 = new DF.b
                    r5.<init>(r4, r3, r3)
                    r2.add(r5)
                    goto L_0x0054
                L_0x0069:
                    r0.f108955d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x0072
                    return r1
                L_0x0072:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.C12769p.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C12769p(C16532g gVar) {
            this.f108952a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f108952a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: DF.C$q  reason: case insensitive filesystem */
    public static final class C12770q<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((Composition) t11).getCreatedAt(), ((Composition) t10).getCreatedAt());
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isLoggedIn", "LTJ/g;", "", "Lcom/sugarcube/core/network/models/Composition;", "<anonymous>", "(Z)LTJ/g;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$designs$1", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: DF.C$r  reason: case insensitive filesystem */
    static final class C12771r extends l implements p<Boolean, C17164e<? super C16532g<? extends List<? extends Composition>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108957c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f108958d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12754C f108959e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12771r(C12754C c10, C17164e<? super C12771r> eVar) {
            super(2, eVar);
            this.f108959e = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C12771r rVar = new C12771r(this.f108959e, eVar);
            rVar.f108958d = ((Boolean) obj).booleanValue();
            return rVar;
        }

        public final Object i(boolean z10, C17164e<? super C16532g<? extends List<Composition>>> eVar) {
            return ((C12771r) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f108957c == 0) {
                y.b(obj);
                return this.f108958d ? C5210m.a(this.f108959e.Z0().getAllCompositions()) : C16534i.J(C16877v.n());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$dismissCaptureFeedback$1", f = "GalleryViewModel.kt", l = {1129, 1130, 1133}, m = "invokeSuspend")
    /* renamed from: DF.C$s  reason: case insensitive filesystem */
    static final class C12772s extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f108960c;

        /* renamed from: d  reason: collision with root package name */
        int f108961d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12754C f108962e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12772s(C12754C c10, C17164e<? super C12772s> eVar) {
            super(2, eVar);
            this.f108962e = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12772s(this.f108962e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C12772s) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f108961d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0029
                if (r1 == r4) goto L_0x0025
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r0 = r6.f108960c
                com.sugarcube.app.base.data.feature.ConfigState r0 = (com.sugarcube.app.base.data.feature.ConfigState) r0
                XH.y.b(r7)
                goto L_0x007c
            L_0x0019:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0021:
                XH.y.b(r7)
                goto L_0x0052
            L_0x0025:
                XH.y.b(r7)
                goto L_0x0041
            L_0x0029:
                XH.y.b(r7)
                DF.C r7 = r6.f108962e
                com.sugarcube.app.base.data.feature.ConfigRepository r7 = r7.f108735v
                com.sugarcube.app.base.data.feature.ConfigItems$CaptureFeedbackPromptWasPresented r1 = com.sugarcube.app.base.data.feature.ConfigItems.CaptureFeedbackPromptWasPresented.INSTANCE
                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r4)
                r6.f108961d = r4
                java.lang.Object r7 = r7.override(r1, r5, r6)
                if (r7 != r0) goto L_0x0041
                return r0
            L_0x0041:
                DF.C r7 = r6.f108962e
                com.sugarcube.app.base.data.feature.ConfigRepository r7 = r7.f108735v
                com.sugarcube.app.base.data.feature.ConfigItems$FeedbackCaptureId r1 = com.sugarcube.app.base.data.feature.ConfigItems.FeedbackCaptureId.INSTANCE
                r6.f108961d = r3
                java.lang.Object r7 = r7.getState(r1, r6)
                if (r7 != r0) goto L_0x0052
                return r0
            L_0x0052:
                com.sugarcube.app.base.data.feature.ConfigState r7 = (com.sugarcube.app.base.data.feature.ConfigState) r7
                boolean r1 = r7.isOverridden()
                if (r1 == 0) goto L_0x007c
                DF.C r1 = r6.f108962e
                xF.a r1 = r1.p1()
                java.lang.Object r3 = r7.getCurrentValue()
                java.lang.String r3 = (java.lang.String) r3
                r1.b(r3)
                DF.C r1 = r6.f108962e
                com.sugarcube.app.base.data.feature.ConfigRepository r1 = r1.f108735v
                com.sugarcube.app.base.data.feature.ConfigItems$FeedbackCaptureId r3 = com.sugarcube.app.base.data.feature.ConfigItems.FeedbackCaptureId.INSTANCE
                r6.f108960c = r7
                r6.f108961d = r2
                java.lang.Object r7 = r1.clearOverride(r3, r6)
                if (r7 != r0) goto L_0x007c
                return r0
            L_0x007c:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.C12772s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$editNameComposition$1", f = "GalleryViewModel.kt", l = {1052}, m = "invokeSuspend")
    /* renamed from: DF.C$t  reason: case insensitive filesystem */
    static final class C12773t extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108963c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108964d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UUID f108965e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f108966f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12773t(C12754C c10, UUID uuid, String str, C17164e<? super C12773t> eVar) {
            super(2, eVar);
            this.f108964d = c10;
            this.f108965e = uuid;
            this.f108966f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12773t(this.f108964d, this.f108965e, this.f108966f, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C12773t) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108963c;
            if (i10 == 0) {
                y.b(obj);
                CompositionRepository Z02 = this.f108964d.Z0();
                UUID uuid = this.f108965e;
                String str = this.f108966f;
                this.f108963c = 1;
                if (Z02.renameComposition(uuid, str, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f108964d.p1().o();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/G;", "", "", "LXH/N;", "<anonymous>", "(Landroidx/lifecycle/G;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$favoriteListLiveData$1", f = "GalleryViewModel.kt", l = {306}, m = "invokeSuspend")
    /* renamed from: DF.C$u  reason: case insensitive filesystem */
    static final class C12774u extends l implements p<androidx.lifecycle.G<List<? extends String>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108967c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f108968d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12754C f108969e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: DF.C$u$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.G<List<String>> f108970a;

            a(androidx.lifecycle.G<List<String>> g10) {
                this.f108970a = g10;
            }

            /* renamed from: c */
            public final Object emit(List<String> list, C17164e<? super C16807N> eVar) {
                Object emit = this.f108970a.emit(list, eVar);
                return emit == C17187b.f() ? emit : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12774u(C12754C c10, C17164e<? super C12774u> eVar) {
            super(2, eVar);
            this.f108969e = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C12774u uVar = new C12774u(this.f108969e, eVar);
            uVar.f108968d = obj;
            return uVar;
        }

        /* renamed from: i */
        public final Object invoke(androidx.lifecycle.G<List<String>> g10, C17164e<? super C16807N> eVar) {
            return ((C12774u) create(g10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108967c;
            if (i10 == 0) {
                y.b(obj);
                androidx.lifecycle.G g10 = (androidx.lifecycle.G) this.f108968d;
                C16532g<List<String>> invoke = this.f108969e.f108665F.invoke();
                a aVar = new a(g10);
                this.f108968d = g10;
                this.f108967c = 1;
                if (invoke.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                androidx.lifecycle.G g11 = (androidx.lifecycle.G) this.f108968d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/G;", "", "LXH/N;", "<anonymous>", "(Landroidx/lifecycle/G;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$favoritesEnabled$1", f = "GalleryViewModel.kt", l = {312}, m = "invokeSuspend")
    /* renamed from: DF.C$v  reason: case insensitive filesystem */
    static final class C12775v extends l implements p<androidx.lifecycle.G<Boolean>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108971c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f108972d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12754C f108973e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: DF.C$v$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.G<Boolean> f108974a;

            a(androidx.lifecycle.G<Boolean> g10) {
                this.f108974a = g10;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                Object emit = this.f108974a.emit(b.a(z10), eVar);
                return emit == C17187b.f() ? emit : C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12775v(C12754C c10, C17164e<? super C12775v> eVar) {
            super(2, eVar);
            this.f108973e = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C12775v vVar = new C12775v(this.f108973e, eVar);
            vVar.f108972d = obj;
            return vVar;
        }

        /* renamed from: i */
        public final Object invoke(androidx.lifecycle.G<Boolean> g10, C17164e<? super C16807N> eVar) {
            return ((C12775v) create(g10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108971c;
            if (i10 == 0) {
                y.b(obj);
                androidx.lifecycle.G g10 = (androidx.lifecycle.G) this.f108972d;
                C16532g observe = this.f108973e.f108735v.observe(FeatureFlags.EnableFavorites.INSTANCE);
                a aVar = new a(g10);
                this.f108972d = g10;
                this.f108971c = 1;
                if (observe.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                androidx.lifecycle.G g11 = (androidx.lifecycle.G) this.f108972d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel", f = "GalleryViewModel.kt", l = {1231}, m = "fetchProducts")
    /* renamed from: DF.C$w  reason: case insensitive filesystem */
    static final class C12776w extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f108975c;

        /* renamed from: d  reason: collision with root package name */
        Object f108976d;

        /* renamed from: e  reason: collision with root package name */
        Object f108977e;

        /* renamed from: f  reason: collision with root package name */
        Object f108978f;

        /* renamed from: g  reason: collision with root package name */
        Object f108979g;

        /* renamed from: h  reason: collision with root package name */
        Object f108980h;

        /* renamed from: i  reason: collision with root package name */
        Object f108981i;

        /* renamed from: j  reason: collision with root package name */
        Object f108982j;

        /* renamed from: k  reason: collision with root package name */
        Object f108983k;

        /* renamed from: l  reason: collision with root package name */
        Object f108984l;

        /* renamed from: m  reason: collision with root package name */
        Object f108985m;

        /* renamed from: n  reason: collision with root package name */
        int f108986n;

        /* renamed from: o  reason: collision with root package name */
        int f108987o;

        /* renamed from: p  reason: collision with root package name */
        int f108988p;

        /* renamed from: q  reason: collision with root package name */
        int f108989q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f108990r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C12754C f108991s;

        /* renamed from: t  reason: collision with root package name */
        int f108992t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12776w(C12754C c10, C17164e<? super C12776w> eVar) {
            super(eVar);
            this.f108991s = c10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f108990r = obj;
            this.f108992t |= Integer.MIN_VALUE;
            return this.f108991s.O0((List<PlacedFurniture>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$hardDeleteSelectedItems$1", f = "GalleryViewModel.kt", l = {1019}, m = "invokeSuspend")
    /* renamed from: DF.C$x  reason: case insensitive filesystem */
    static final class C12777x extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108993c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12777x(C12754C c10, C17164e<? super C12777x> eVar) {
            super(2, eVar);
            this.f108994d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12777x(this.f108994d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C12777x) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108993c;
            if (i10 == 0) {
                y.b(obj);
                SceneRepository s12 = this.f108994d.s1();
                this.f108993c = 1;
                if (s12.hardDeleteScenes(this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$isCompositionGLTFEnabled$1", f = "GalleryViewModel.kt", l = {967, 967}, m = "invokeSuspend")
    /* renamed from: DF.C$y  reason: case insensitive filesystem */
    static final class C12778y extends l implements p<QJ.Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108995c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108996d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12778y(C12754C c10, C17164e<? super C12778y> eVar) {
            super(2, eVar);
            this.f108996d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12778y(this.f108996d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super Boolean> eVar) {
            return ((C12778y) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
            if (((java.lang.Boolean) r5).booleanValue() == false) goto L_0x0054;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r4.f108995c
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
                DF.C r5 = r4.f108996d
                com.sugarcube.app.base.data.feature.ConfigRepository r5 = r5.f108735v
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableGLTFScenes r1 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableGLTFScenes.INSTANCE
                r4.f108995c = r3
                java.lang.Object r5 = r5.get(r1, r4)
                if (r5 != r0) goto L_0x0032
                return r0
            L_0x0032:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0054
                DF.C r5 = r4.f108996d
                com.sugarcube.app.base.data.feature.ConfigRepository r5 = r5.f108735v
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableGLTFCompositions r1 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableGLTFCompositions.INSTANCE
                r4.f108995c = r2
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
            throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.C12778y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$presentCaptureFeedback$1$1", f = "GalleryViewModel.kt", l = {549}, m = "invokeSuspend")
    /* renamed from: DF.C$z  reason: case insensitive filesystem */
    static final class C12779z extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108997c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f108998d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.K<Boolean> f108999e;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "alreadyPresented", "Lcom/sugarcube/app/base/data/feature/ConfigState;", "", "firstCaptureIdState", "isLoggedIn", "tracking", "LXH/N;", "<anonymous>", "(ZLcom/sugarcube/app/base/data/feature/ConfigState;ZZ)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.model.GalleryViewModel$presentCaptureFeedback$1$1$1", f = "GalleryViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: DF.C$z$a */
        static final class a extends l implements s<Boolean, ConfigState<String>, Boolean, Boolean, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f109000c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ boolean f109001d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f109002e;

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ boolean f109003f;

            /* renamed from: g  reason: collision with root package name */
            /* synthetic */ boolean f109004g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.K<Boolean> f109005h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(androidx.lifecycle.K<Boolean> k10, C17164e<? super a> eVar) {
                super(5, eVar);
                this.f109005h = k10;
            }

            public final Object i(boolean z10, ConfigState<String> configState, boolean z11, boolean z12, C17164e<? super C16807N> eVar) {
                a aVar = new a(this.f109005h, eVar);
                aVar.f109001d = z10;
                aVar.f109002e = configState;
                aVar.f109003f = z11;
                aVar.f109004g = z12;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f109000c == 0) {
                    y.b(obj);
                    this.f109005h.setValue(b.a(!this.f109001d && ((ConfigState) this.f109002e).isOverridden() && this.f109003f && this.f109004g));
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return i(((Boolean) obj).booleanValue(), (ConfigState) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (C17164e) obj5);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12779z(C12754C c10, androidx.lifecycle.K<Boolean> k10, C17164e<? super C12779z> eVar) {
            super(2, eVar);
            this.f108998d = c10;
            this.f108999e = k10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C12779z(this.f108998d, this.f108999e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C12779z) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108997c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<R> l10 = C16534i.l(this.f108998d.f108735v.observe(ConfigItems.CaptureFeedbackPromptWasPresented.INSTANCE), this.f108998d.f108735v.observeState(ConfigItems.FeedbackCaptureId.INSTANCE), this.f108998d.f108731t.isLoggedIn(), this.f108998d.U0().getTrackingEnabledFlow(), new a(this.f108999e, (C17164e<? super a>) null));
                this.f108997c = 1;
                if (C16534i.i(l10, this) == f10) {
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

    public C12754C(CompositionRepository compositionRepository, CatalogRepository catalogRepository, SceneRepository sceneRepository, q qVar, a aVar, VideoAssetRepository videoAssetRepository, PreferenceStorage preferenceStorage, UserRepo userRepo, DeviceCompatibility deviceCompatibility, ConfigRepository configRepository, NetworkClient networkClient, PrivacyPolicyConsentUseCase privacyPolicyConsentUseCase, C13147a aVar2, C13164r rVar, g gVar, C13151e eVar, NetworkLiveData networkLiveData, C13292f fVar, AnalyticsManager analyticsManager, AddToShoppingListUseCase addToShoppingListUseCase, FetchShoppingListItemsUseCase fetchShoppingListItemsUseCase, androidx.lifecycle.U u10) {
        CompositionRepository compositionRepository2 = compositionRepository;
        CatalogRepository catalogRepository2 = catalogRepository;
        SceneRepository sceneRepository2 = sceneRepository;
        q qVar2 = qVar;
        a aVar3 = aVar;
        VideoAssetRepository videoAssetRepository2 = videoAssetRepository;
        PreferenceStorage preferenceStorage2 = preferenceStorage;
        UserRepo userRepo2 = userRepo;
        DeviceCompatibility deviceCompatibility2 = deviceCompatibility;
        ConfigRepository configRepository2 = configRepository;
        NetworkClient networkClient2 = networkClient;
        PrivacyPolicyConsentUseCase privacyPolicyConsentUseCase2 = privacyPolicyConsentUseCase;
        C13147a aVar4 = aVar2;
        C13164r rVar2 = rVar;
        C13151e eVar2 = eVar;
        C17542s.j(compositionRepository2, "compositionRepository");
        C17542s.j(catalogRepository2, "catalogRepository");
        C17542s.j(sceneRepository2, "sceneRepository");
        C17542s.j(qVar2, "sugarcube");
        C17542s.j(aVar3, "appConfig");
        C17542s.j(videoAssetRepository2, "assetRepository");
        C17542s.j(preferenceStorage2, "preferences");
        C17542s.j(userRepo2, "userRepo");
        C17542s.j(deviceCompatibility2, "deviceCompatibility");
        C17542s.j(configRepository2, "configRepository");
        C17542s.j(networkClient2, "networkClient");
        C17542s.j(privacyPolicyConsentUseCase2, "privacyPolicyConsentUseCase");
        C17542s.j(aVar4, "captureFiles");
        C17542s.j(rVar2, "uploadVersion");
        C17542s.j(gVar, "uploaderV2");
        C17542s.j(eVar, "uploadDatabase");
        C17542s.j(networkLiveData, "networkLiveData");
        C17542s.j(fVar, "stringProvider");
        C17542s.j(analyticsManager, "analyticsManager");
        C17542s.j(addToShoppingListUseCase, "addToShoppingListUseCase");
        C17542s.j(fetchShoppingListItemsUseCase, "fetchShoppingListItemsUseCase");
        C17542s.j(u10, "savedStateHandle");
        this.f108717m = compositionRepository2;
        this.f108719n = catalogRepository2;
        this.f108721o = sceneRepository2;
        this.f108723p = qVar2;
        this.f108725q = aVar3;
        this.f108727r = videoAssetRepository2;
        this.f108729s = preferenceStorage2;
        this.f108731t = userRepo2;
        this.f108733u = deviceCompatibility2;
        this.f108735v = configRepository2;
        this.f108737w = networkClient2;
        this.f108739x = privacyPolicyConsentUseCase2;
        this.f108741y = aVar4;
        this.f108744z = rVar2;
        this.f108652A = gVar;
        this.f108655B = eVar;
        this.f108658C = fVar;
        this.f108661D = analyticsManager;
        this.f108663E = addToShoppingListUseCase;
        this.f108665F = fetchShoppingListItemsUseCase;
        this.f108667G = u10;
        int i10 = C12780D.f109006a[Priority.DEBUG.ordinal()];
        Class<C12754C> cls = C12754C.class;
        if (i10 == 1) {
            String name = cls.getName();
            C17542s.g(name);
            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            name = o12.length() != 0 ? C15854t.P0(o12, "Kt") : name;
            Log.v(name, "Creating GalleryViewModel" + " " + "");
        } else if (i10 == 2) {
            String name2 = cls.getName();
            C17542s.g(name2);
            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            name2 = o13.length() != 0 ? C15854t.P0(o13, "Kt") : name2;
            Log.d(name2, "Creating GalleryViewModel" + " " + "");
        } else if (i10 == 3) {
            String name3 = cls.getName();
            C17542s.g(name3);
            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            name3 = o14.length() != 0 ? C15854t.P0(o14, "Kt") : name3;
            Log.i(name3, "Creating GalleryViewModel" + " " + "");
        } else if (i10 == 4) {
            String name4 = cls.getName();
            C17542s.g(name4);
            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            name4 = o15.length() != 0 ? C15854t.P0(o15, "Kt") : name4;
            Log.w(name4, "Creating GalleryViewModel" + " " + "");
        } else if (i10 == 5) {
            String name5 = cls.getName();
            C17542s.g(name5);
            String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            name5 = o16.length() != 0 ? C15854t.P0(o16, "Kt") : name5;
            Log.e(name5, "Creating GalleryViewModel" + " " + "");
        } else {
            throw new t();
        }
        androidx.lifecycle.K<Boolean> k10 = new androidx.lifecycle.K<>();
        this.f108671I = k10;
        this.f108673J = k10;
        C16532g H10 = C16534i.H(new L(this, (C17164e<? super L>) null));
        QJ.Q a10 = g0.a(this);
        C16515L.a aVar5 = C16515L.f138570a;
        C16519P<List<Scene>> c02 = C16534i.c0(H10, a10, C16515L.a.b(aVar5, 5000, 0, 2, (Object) null), C16877v.n());
        this.f108675K = c02;
        this.f108677L = C16534i.c0(C16534i.H(new Z(this, (C17164e<? super Z>) null)), g0.a(this), C16515L.a.b(aVar5, 5000, 0, 2, (Object) null), C16877v.n());
        androidx.lifecycle.K<Boolean> k11 = new androidx.lifecycle.K<>();
        this.f108679M = k11;
        this.f108681N = k11;
        androidx.lifecycle.K<List<C14683D>> k12 = new androidx.lifecycle.K<>();
        this.f108683O = k12;
        this.f108685P = k12;
        androidx.lifecycle.K<Boolean> k13 = new androidx.lifecycle.K<>();
        this.f108687Q = k13;
        this.f108689R = k13;
        androidx.lifecycle.K<C15083h> k14 = new androidx.lifecycle.K<>();
        this.f108691S = k14;
        this.f108693T = k14;
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.K<Boolean> k15 = new androidx.lifecycle.K<>(bool);
        this.f108695U = k15;
        this.f108699X = k15;
        this.f108701Y = new C15226a(this);
        this.f108703Z = new androidx.lifecycle.K<>();
        this.f108742y0 = s2();
        this.f108745z0 = H0();
        androidx.lifecycle.K<List<C12787d>> c32 = c3();
        this.f108653A0 = c32;
        this.f108656B0 = new LinkedHashSet();
        this.f108659C0 = networkLiveData;
        C16505B<Boolean> a11 = C16521S.a(bool);
        this.f108662D0 = a11;
        this.f108664E0 = a11;
        C16505B<Boolean> a12 = C16521S.a(bool);
        this.f108666F0 = a12;
        this.f108668G0 = C5210m.c(C16534i.l(a12, C5210m.a(networkLiveData), C5210m.a(c32), a11, new R((C17164e<? super R>) null)), (C17168i) null, 0, 3, (Object) null);
        androidx.lifecycle.K<Boolean> k16 = new androidx.lifecycle.K<>();
        this.f108670H0 = k16;
        this.f108672I0 = k16;
        this.f108674J0 = new androidx.lifecycle.K<>();
        this.f108676K0 = new androidx.lifecycle.K<>();
        androidx.lifecycle.K<Boolean> k17 = new androidx.lifecycle.K<>(bool);
        this.f108680M0 = k17;
        this.f108682N0 = k17;
        androidx.lifecycle.K<Boolean> k18 = new androidx.lifecycle.K<>(bool);
        this.f108684O0 = k18;
        this.f108686P0 = k18;
        androidx.lifecycle.K<PendingComposition> k19 = new androidx.lifecycle.K<>();
        this.f108688Q0 = k19;
        this.f108690R0 = k19;
        androidx.lifecycle.K<Boolean> k20 = new androidx.lifecycle.K<>(bool);
        this.f108692S0 = k20;
        this.f108694T0 = k20;
        androidx.lifecycle.K<Boolean> k21 = new androidx.lifecycle.K<>(bool);
        this.f108696U0 = k21;
        this.f108697V0 = k21;
        androidx.lifecycle.K<Boolean> k22 = new androidx.lifecycle.K<>(bool);
        this.f108698W0 = k22;
        this.f108700X0 = k22;
        this.f108702Y0 = C5210m.c(privacyPolicyConsentUseCase.getPrivacyPolicyState(), (C17168i) null, 0, 3, (Object) null);
        androidx.lifecycle.K<Boolean> k23 = new androidx.lifecycle.K<>(bool);
        this.f108704Z0 = k23;
        this.f108705a1 = k23;
        this.f108706b1 = new androidx.lifecycle.K<>();
        this.f108707c1 = C16521S.a(bool);
        androidx.lifecycle.K<Boolean> k24 = new androidx.lifecycle.K<>(bool);
        this.f108708d1 = k24;
        this.f108709e1 = k24;
        this.f108710f1 = C5204g.b((C17168i) null, 0, new C12774u(this, (C17164e<? super C12774u>) null), 3, (Object) null);
        this.f108711g1 = C5204g.b((C17168i) null, 0, new C12775v(this, (C17164e<? super C12775v>) null), 3, (Object) null);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new C12755a(this, (C17164e<? super C12755a>) null), 3, (Object) null);
        F0 unused2 = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new C12756b(this, (C17164e<? super C12756b>) null), 3, (Object) null);
        F0 unused3 = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
        F0 unused4 = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new C12757d(this, (C17164e<? super C12757d>) null), 3, (Object) null);
        F0 unused5 = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new C12758e(this, (C17164e<? super C12758e>) null), 3, (Object) null);
        F0 unused6 = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new C12759f(this, (C17164e<? super C12759f>) null), 3, (Object) null);
        C16505B<C12761h> a13 = C16521S.a(new C12761h((h) null, (List) null, 3, (DefaultConstructorMarker) null));
        this.f108712h1 = a13;
        F0 unused7 = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new C12760g(this, (C17164e<? super C12760g>) null), 3, (Object) null);
        this.f108713i1 = C16534i.n(deviceCompatibility.getSupportedFeatures(), c02, new X((C17164e<? super X>) null));
        this.f108714j1 = C16534i.m(C5210m.a(k10), c02, new b0(a13), new Y(this, (C17164e<? super Y>) null));
        androidx.lifecycle.K<Design> k25 = new androidx.lifecycle.K<>();
        this.f108715k1 = k25;
        this.f108716l1 = k25;
        PreferenceImpl.PreferencesKeys preferencesKeys = PreferenceImpl.PreferencesKeys;
        this.f108718m1 = preferenceStorage2.getPreference(preferencesKeys.getSHOW_DESIGN_OPTIONS_KEY(), Boolean.TRUE);
        androidx.lifecycle.K<Boolean> k26 = new androidx.lifecycle.K<>();
        F0 unused8 = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new C12779z(this, k26, (C17164e<? super C12779z>) null), 3, (Object) null);
        this.f108720n1 = k26;
        this.f108722o1 = preferenceStorage2.getPreference(preferencesKeys.getFIRST_CAPTURE_RATING_KEY(), -1);
        this.f108724p1 = preferenceStorage2.getPreference(preferencesKeys.getSHOW_DESIGN_FEEDBACK_KEY(), bool);
        this.f108726q1 = FeedbackSmileRatingBar.a.NEUTRAL.ordinal();
        androidx.lifecycle.K<Boolean> k27 = new androidx.lifecycle.K<>();
        F0 unused9 = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new A(this, k27, (C17164e<? super A>) null), 3, (Object) null);
        this.f108728r1 = k27;
        this.f108730s1 = compositionRepository.getCurrentSceneCompositions();
        this.f108732t1 = new androidx.lifecycle.K<>();
        androidx.lifecycle.F<List<C12785b>> P02 = P0();
        this.f108734u1 = P02;
        this.f108746z1 = C5210m.c(preferenceStorage2.getPreference(preferencesKeys.getNEW_READY_TO_DECORATE_COUNT_KEY(), -1), (C17168i) null, 0, 3, (Object) null);
        androidx.lifecycle.I i11 = new androidx.lifecycle.I();
        i11.b(P02, new I(new i(i11, this)));
        i11.b(b2(), new I(new t(i11, this)));
        this.f108660C1 = androidx.lifecycle.e0.a(i11);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: DF.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: DF.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: DF.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: DF.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<DF.C12785b> C0(androidx.lifecycle.F<java.util.List<com.sugarcube.core.network.models.Composition>> r11, androidx.lifecycle.F<java.util.List<DF.C12784a>> r12) {
        /*
            r10 = this;
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r12.getValue()
            java.util.List r12 = (java.util.List) r12
            if (r11 != 0) goto L_0x0013
            java.util.List r11 = YH.C16877v.n()
            return r11
        L_0x0013:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = YH.C16877v.y(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L_0x0024:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x009f
            java.lang.Object r1 = r11.next()
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            r2 = 0
            r3 = 0
            r4 = 1
            if (r12 == 0) goto L_0x0065
            r5 = r12
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x003c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0058
            java.lang.Object r6 = r5.next()
            r7 = r6
            DF.a r7 = (DF.C12784a) r7
            java.util.UUID r7 = r7.a()
            java.util.UUID r8 = r1.getCompositionUuid()
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r8)
            if (r7 == 0) goto L_0x003c
            goto L_0x0059
        L_0x0058:
            r6 = r2
        L_0x0059:
            DF.a r6 = (DF.C12784a) r6
            if (r6 == 0) goto L_0x0065
            boolean r5 = r6.b()
            if (r5 != r4) goto L_0x0065
            r5 = r4
            goto L_0x0066
        L_0x0065:
            r5 = r3
        L_0x0066:
            if (r12 == 0) goto L_0x0096
            r6 = r12
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x006f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x008b
            java.lang.Object r7 = r6.next()
            r8 = r7
            DF.a r8 = (DF.C12784a) r8
            java.util.UUID r8 = r8.a()
            java.util.UUID r9 = r1.getCompositionUuid()
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r8 == 0) goto L_0x006f
            r2 = r7
        L_0x008b:
            DF.a r2 = (DF.C12784a) r2
            if (r2 == 0) goto L_0x0096
            boolean r2 = r2.c()
            if (r2 != r4) goto L_0x0096
            r3 = r4
        L_0x0096:
            DF.b r2 = new DF.b
            r2.<init>(r1, r5, r3)
            r0.add(r2)
            goto L_0x0024
        L_0x009f:
            DF.C$m r11 = new DF.C$m
            r11.<init>()
            java.util.List r11 = YH.C16877v.g1(r0, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.C0(androidx.lifecycle.F, androidx.lifecycle.F):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: DF.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: DF.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: DF.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: DF.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ff A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<DF.C12787d> D0(androidx.lifecycle.F<java.util.List<com.sugarcube.app.base.data.database.Scene>> r18, androidx.lifecycle.F<java.util.List<DF.C12790g>> r19) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r18.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r19.getValue()
            java.util.List r2 = (java.util.List) r2
            if (r1 != 0) goto L_0x0015
            java.util.List r1 = YH.C16877v.n()
            return r1
        L_0x0015:
            r0.x0(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = YH.C16877v.y(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0029:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0106
            java.lang.Object r4 = r1.next()
            com.sugarcube.app.base.data.database.Scene r4 = (com.sugarcube.app.base.data.database.Scene) r4
            DF.f r15 = new DF.f
            com.sugarcube.app.base.external.config.a r5 = r0.f108725q
            java.util.Locale r13 = r5.getLocale()
            r14 = 126(0x7e, float:1.77E-43)
            r16 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r15
            r6 = r4
            r18 = r1
            r1 = r15
            r15 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r5 = 0
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0086
            r8 = r2
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x005d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0079
            java.lang.Object r9 = r8.next()
            r10 = r9
            DF.g r10 = (DF.C12790g) r10
            java.util.UUID r10 = r10.a()
            java.util.UUID r11 = r4.getUuid()
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r11)
            if (r10 == 0) goto L_0x005d
            goto L_0x007a
        L_0x0079:
            r9 = r5
        L_0x007a:
            DF.g r9 = (DF.C12790g) r9
            if (r9 == 0) goto L_0x0086
            boolean r8 = r9.c()
            if (r8 != r7) goto L_0x0086
            r8 = r7
            goto L_0x0087
        L_0x0086:
            r8 = r6
        L_0x0087:
            r1.i(r8)
            if (r2 == 0) goto L_0x00ba
            r8 = r2
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0093:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00af
            java.lang.Object r9 = r8.next()
            r10 = r9
            DF.g r10 = (DF.C12790g) r10
            java.util.UUID r10 = r10.a()
            java.util.UUID r11 = r4.getUuid()
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r11)
            if (r10 == 0) goto L_0x0093
            r5 = r9
        L_0x00af:
            DF.g r5 = (DF.C12790g) r5
            if (r5 == 0) goto L_0x00ba
            boolean r5 = r5.b()
            if (r5 != r7) goto L_0x00ba
            r6 = r7
        L_0x00ba:
            r1.h(r6)
            android.net.Uri r5 = r1.c()
            if (r5 != 0) goto L_0x00da
            java.util.UUID r5 = r4.getUuid()
            KF.a r6 = r0.f108741y
            java.io.File r5 = r6.j(r5)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x00da
            android.net.Uri r5 = android.net.Uri.fromFile(r5)
            r1.m(r5)
        L_0x00da:
            android.net.Uri r5 = r1.c()
            if (r5 != 0) goto L_0x00ff
            KF.e r5 = r0.f108655B
            java.util.UUID r4 = r4.getSceneUuid()
            java.util.UUID r4 = r5.getRememberedCapture(r4)
            if (r4 == 0) goto L_0x00ff
            KF.a r5 = r0.f108741y
            java.io.File r4 = r5.j(r4)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L_0x00ff
            android.net.Uri r4 = android.net.Uri.fromFile(r4)
            r1.m(r4)
        L_0x00ff:
            r3.add(r1)
            r1 = r18
            goto L_0x0029
        L_0x0106:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.D0(androidx.lifecycle.F, androidx.lifecycle.F):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: DF.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: DF.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: DF.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: DF.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<DF.C12787d> E0(androidx.lifecycle.F<java.util.List<com.sugarcube.core.network.models.Showroom>> r21, androidx.lifecycle.F<java.util.List<DF.C12790g>> r22) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = r21.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r22.getValue()
            java.util.List r2 = (java.util.List) r2
            if (r1 != 0) goto L_0x0015
            java.util.List r1 = YH.C16877v.n()
            return r1
        L_0x0015:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = YH.C16877v.y(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0026:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01d6
            java.lang.Object r4 = r1.next()
            com.sugarcube.core.network.models.Showroom r4 = (com.sugarcube.core.network.models.Showroom) r4
            java.util.UUID r5 = r4.getSceneUuid()
            boolean r6 = r0.Z1(r5)
            r16 = 0
            r15 = 0
            if (r6 == 0) goto L_0x009f
            com.sugarcube.app.base.data.source.CompositionRepository r6 = r0.f108717m
            androidx.lifecycle.F r6 = r6.getAllCompositions()
            java.lang.Object r6 = r6.getValue()
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x009b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0058:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0096
            java.lang.Object r8 = r6.next()
            r9 = r8
            com.sugarcube.core.network.models.Composition r9 = (com.sugarcube.core.network.models.Composition) r9
            java.util.UUID r10 = r9.getSceneUuid()
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r5)
            if (r10 == 0) goto L_0x0058
            java.lang.Integer r9 = r9.getWid()
            com.sugarcube.app.base.data.user.UserRepo r10 = r0.f108731t
            TJ.P r10 = r10.getUser()
            java.lang.Object r10 = r10.getValue()
            com.sugarcube.core.network.models.LoggedInUser r10 = (com.sugarcube.core.network.models.LoggedInUser) r10
            if (r10 == 0) goto L_0x008a
            int r10 = r10.getWid()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x008c
        L_0x008a:
            r10 = r16
        L_0x008c:
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r10)
            if (r9 == 0) goto L_0x0058
            r7.add(r8)
            goto L_0x0058
        L_0x0096:
            int r6 = r7.size()
            goto L_0x009c
        L_0x009b:
            r6 = r15
        L_0x009c:
            r4.setCompositionCount(r6)
        L_0x009f:
            com.sugarcube.app.base.data.source.CompositionRepository r6 = r0.f108717m
            androidx.lifecycle.F r6 = r6.getAllCompositions()
            java.lang.Object r6 = r6.getValue()
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x012f
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00b8:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00f6
            java.lang.Object r8 = r6.next()
            r9 = r8
            com.sugarcube.core.network.models.Composition r9 = (com.sugarcube.core.network.models.Composition) r9
            java.util.UUID r10 = r9.getSceneUuid()
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r5)
            if (r10 == 0) goto L_0x00b8
            java.lang.Integer r9 = r9.getWid()
            com.sugarcube.app.base.data.user.UserRepo r10 = r0.f108731t
            TJ.P r10 = r10.getUser()
            java.lang.Object r10 = r10.getValue()
            com.sugarcube.core.network.models.LoggedInUser r10 = (com.sugarcube.core.network.models.LoggedInUser) r10
            if (r10 == 0) goto L_0x00ea
            int r10 = r10.getWid()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x00ec
        L_0x00ea:
            r10 = r16
        L_0x00ec:
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r10)
            if (r9 == 0) goto L_0x00b8
            r7.add(r8)
            goto L_0x00b8
        L_0x00f6:
            DF.C$n r5 = new DF.C$n
            r5.<init>()
            java.util.List r5 = YH.C16877v.g1(r7, r5)
            if (r5 == 0) goto L_0x012f
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r5 = r16
        L_0x010d:
            if (r5 == 0) goto L_0x012f
            int r6 = r5.size()
            r4.setCompositionCount(r6)
            java.lang.Object r6 = r5.get(r15)
            com.sugarcube.core.network.models.Composition r6 = (com.sugarcube.core.network.models.Composition) r6
            java.time.Instant r6 = r6.getCreatedAt()
            r4.setLastCreatedAt(r6)
            java.lang.Object r5 = r5.get(r15)
            com.sugarcube.core.network.models.Composition r5 = (com.sugarcube.core.network.models.Composition) r5
            int r5 = r5.getSceneId()
            r7 = r5
            goto L_0x0130
        L_0x012f:
            r7 = r15
        L_0x0130:
            TJ.B<java.lang.Boolean> r5 = r0.f108707c1
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0141
            r4.setCompositionCount(r15)
        L_0x0141:
            DF.h r14 = new DF.h
            com.sugarcube.app.base.external.config.a r5 = r0.f108725q
            java.util.Locale r13 = r5.getLocale()
            r17 = 124(0x7c, float:1.74E-43)
            r18 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r14
            r6 = r4
            r19 = r14
            r14 = r17
            r17 = r15
            r15 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r15 = 1
            if (r2 == 0) goto L_0x0195
            r5 = r2
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0169:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0185
            java.lang.Object r6 = r5.next()
            r7 = r6
            DF.g r7 = (DF.C12790g) r7
            java.util.UUID r7 = r7.a()
            java.util.UUID r8 = r4.getSceneUuid()
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r8)
            if (r7 == 0) goto L_0x0169
            goto L_0x0187
        L_0x0185:
            r6 = r16
        L_0x0187:
            DF.g r6 = (DF.C12790g) r6
            if (r6 == 0) goto L_0x0195
            boolean r5 = r6.c()
            if (r5 != r15) goto L_0x0195
            r5 = r15
        L_0x0192:
            r6 = r19
            goto L_0x0198
        L_0x0195:
            r5 = r17
            goto L_0x0192
        L_0x0198:
            r6.i(r5)
            if (r2 == 0) goto L_0x01cc
            r5 = r2
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x01a4:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x01c1
            java.lang.Object r7 = r5.next()
            r8 = r7
            DF.g r8 = (DF.C12790g) r8
            java.util.UUID r8 = r8.a()
            java.util.UUID r9 = r4.getSceneUuid()
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r8 == 0) goto L_0x01a4
            r16 = r7
        L_0x01c1:
            DF.g r16 = (DF.C12790g) r16
            if (r16 == 0) goto L_0x01cc
            boolean r4 = r16.b()
            if (r4 != r15) goto L_0x01cc
            goto L_0x01ce
        L_0x01cc:
            r15 = r17
        L_0x01ce:
            r6.h(r15)
            r3.add(r6)
            goto L_0x0026
        L_0x01d6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.E0(androidx.lifecycle.F, androidx.lifecycle.F):java.util.List");
    }

    private final void F2() {
        F0 unused = C16314k.d(QJ.S.a(C16311i0.b()), (C17168i) null, (QJ.T) null, new O(this, (C17164e<? super O>) null), 3, (Object) null);
    }

    private final androidx.lifecycle.F<List<C12785b>> H0() {
        return C5210m.c(new C12769p(I0()), (C17168i) null, 0, 3, (Object) null);
    }

    public static /* synthetic */ void N2(C12754C c10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        c10.M2(z10);
    }

    private final androidx.lifecycle.F<List<C12785b>> P0() {
        androidx.lifecycle.I i10 = new androidx.lifecycle.I();
        i10.b(this.f108730s1, new I(new u(i10, this)));
        i10.b(this.f108732t1, new I(new v(i10, this)));
        return i10;
    }

    public static /* synthetic */ void P2(C12754C c10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        c10.O2(z10);
    }

    /* access modifiers changed from: private */
    public static final C16807N Q0(androidx.lifecycle.I i10, C12754C c10, List list) {
        i10.setValue(c10.C0(c10.f108730s1, c10.f108732t1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R0(androidx.lifecycle.I i10, C12754C c10, List list) {
        i10.setValue(c10.C0(c10.f108730s1, c10.f108732t1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (kotlin.jvm.internal.C17542s.e(r2.b2().getValue(), java.lang.Boolean.FALSE) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final XH.C16807N T2(androidx.lifecycle.I r1, DF.C12754C r2, java.util.List r3) {
        /*
            androidx.lifecycle.F<java.util.List<DF.b>> r3 = r2.f108734u1
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0022
            boolean r3 = r3.isEmpty()
            r0 = 1
            if (r3 != r0) goto L_0x0022
            androidx.lifecycle.F r2 = r2.b2()
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r3)
            if (r2 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1.setValue(r2)
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.T2(androidx.lifecycle.I, DF.C, java.util.List):XH.N");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (kotlin.jvm.internal.C17542s.e(r2.b2().getValue(), java.lang.Boolean.FALSE) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final XH.C16807N U2(androidx.lifecycle.I r1, DF.C12754C r2, java.lang.Boolean r3) {
        /*
            androidx.lifecycle.F<java.util.List<DF.b>> r3 = r2.f108734u1
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0022
            boolean r3 = r3.isEmpty()
            r0 = 1
            if (r3 != r0) goto L_0x0022
            androidx.lifecycle.F r2 = r2.b2()
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r3)
            if (r2 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1.setValue(r2)
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.U2(androidx.lifecycle.I, DF.C, java.lang.Boolean):XH.N");
    }

    private final void V2() {
        C4899r0 j10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
        C4899r0 r0Var = j10;
        K2();
        androidx.lifecycle.K<C15083h> k10 = this.f108691S;
        C15091p pVar = r7;
        C15091p pVar2 = new C15091p(Integer.valueOf(n.f113325a1), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar3 = r13;
        C15091p pVar4 = new C15091p(Integer.valueOf(n.f113318Z0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar5 = r22;
        C15091p pVar6 = new C15091p(Integer.valueOf(n.f113312Y0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        n nVar = r5;
        n nVar2 = new n(this);
        C15091p pVar7 = r11;
        C15091p pVar8 = new C15091p(Integer.valueOf(n.f113337c), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        o oVar = r5;
        o oVar2 = new o(this, j10);
        C15091p pVar9 = r13;
        C15091p pVar10 = new C15091p(Integer.valueOf(n.f113197F), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        p pVar11 = r1;
        p pVar12 = new p(this);
        q qVar = r1;
        q qVar2 = new q(this);
        C15091p pVar13 = r22;
        C15091p pVar14 = new C15091p(Integer.valueOf(n.f113306X0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar15 = r28;
        C15091p pVar16 = new C15091p(Integer.valueOf(n.f113312Y0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        r rVar = r1;
        r rVar2 = new r(this);
        s sVar = r1;
        s sVar2 = new s(this);
        k10.postValue(new C15083h.b("privacy_disclaimer", pVar, pVar3, pVar5, nVar, pVar7, oVar, pVar9, pVar11, qVar, pVar13, pVar15, false, rVar, sVar, (C17631a) null, r0Var, 36864, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public final String W0(Composition composition) {
        String str = this.f108658C.getString(n.f113224J2) + " " + composition.getName();
        List value = this.f108730s1.getValue();
        int i10 = 0;
        if (value != null) {
            Iterable<Composition> iterable = value;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                int i11 = 0;
                for (Composition composition2 : iterable) {
                    if (C17542s.e(composition2.getSceneUuid(), composition.getSceneUuid())) {
                        String name = composition2.getName();
                        if (name == null) {
                            name = "";
                        }
                        if (C15854t.W(name, str, false, 2, (Object) null) && (i11 = i11 + 1) < 0) {
                            C16877v.w();
                        }
                    }
                }
                i10 = i11;
            }
        }
        return str + " - (" + (i10 + 1) + ")";
    }

    /* access modifiers changed from: private */
    public static final C16807N W2(C12754C c10) {
        c10.f108706b1.setValue(c10.f108739x.generatePrivacyPolicyLink());
        F0 unused = C16314k.d(g0.a(c10), (C17168i) null, (QJ.T) null, new S(c10, (C17164e<? super S>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N X2(C12754C c10, C4899r0 r0Var) {
        F0 unused = C16314k.d(g0.a(c10), (C17168i) null, (QJ.T) null, new T(r0Var, c10, (C17164e<? super T>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y2(C12754C c10) {
        c10.f108691S.postValue(C15083h.a.f131169a);
        F0 unused = C16314k.d(g0.a(c10), (C17168i) null, (QJ.T) null, new U(c10, (C17164e<? super U>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Z2(C12754C c10) {
        c10.f108691S.postValue(C15083h.a.f131169a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a3(C12754C c10, boolean z10) {
        F0 unused = C16314k.d(g0.a(c10), (C17168i) null, (QJ.T) null, new V(c10, z10, (C17164e<? super V>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N b3(C12754C c10) {
        c10.f108706b1.setValue(c10.f108739x.generatePrivacyPolicyLink());
        F0 unused = C16314k.d(g0.a(c10), (C17168i) null, (QJ.T) null, new W(c10, (C17164e<? super W>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.F, androidx.lifecycle.K] */
    private final androidx.lifecycle.K<List<C12787d>> c3() {
        ? showrooms = this.f108721o.getShowrooms();
        androidx.lifecycle.F c10 = C5210m.c(this.f108731t.getUser(), g0.a(this).getCoroutineContext(), 0, 2, (Object) null);
        androidx.lifecycle.F<Boolean> scenesRefreshing = this.f108721o.getScenesRefreshing();
        androidx.lifecycle.F<Boolean> isRefreshing = this.f108717m.isRefreshing();
        androidx.lifecycle.I i10 = new androidx.lifecycle.I();
        i10.b(showrooms, new I(new C12753B(i10, this, showrooms)));
        i10.b(this.f108703Z, new I(new j(i10, this, showrooms)));
        i10.b(c10, new I(new k(i10, this, showrooms)));
        i10.b(scenesRefreshing, new I(new l(i10, this, showrooms)));
        i10.b(isRefreshing, new I(new m(i10, this, showrooms)));
        return i10;
    }

    /* access modifiers changed from: private */
    public static final C16807N d3(androidx.lifecycle.I i10, C12754C c10, androidx.lifecycle.K k10, List list) {
        i10.setValue(c10.E0(k10, c10.f108703Z));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final h e2(boolean z10, boolean z11, boolean z12) {
        return (!z10 || !z11) ? z12 ? h.b.f124418e : z11 ? h.c.f124419e : h.d.f124420e : h.c.f124419e;
    }

    /* access modifiers changed from: private */
    public static final C16807N e3(androidx.lifecycle.I i10, C12754C c10, androidx.lifecycle.K k10, List list) {
        i10.setValue(c10.E0(k10, c10.f108703Z));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f3(androidx.lifecycle.I i10, C12754C c10, androidx.lifecycle.K k10, LoggedInUser loggedInUser) {
        i10.setValue(c10.E0(k10, c10.f108703Z));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g3(androidx.lifecycle.I i10, C12754C c10, androidx.lifecycle.K k10, Boolean bool) {
        i10.setValue(c10.E0(k10, c10.f108703Z));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h3(androidx.lifecycle.I i10, C12754C c10, androidx.lifecycle.K k10, Boolean bool) {
        i10.setValue(c10.E0(k10, c10.f108703Z));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void i2() {
        j2();
        h2();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k3(boolean r10, dI.C17164e<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof DF.C12754C.e0
            if (r0 == 0) goto L_0x0014
            r0 = r11
            DF.C$e0 r0 = (DF.C12754C.e0) r0
            int r1 = r0.f108875h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f108875h = r1
        L_0x0012:
            r5 = r0
            goto L_0x001a
        L_0x0014:
            DF.C$e0 r0 = new DF.C$e0
            r0.<init>(r9, r11)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r5.f108873f
            java.lang.Object r8 = eI.C17187b.f()
            int r1 = r5.f108875h
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x005e
            if (r1 == r4) goto L_0x0050
            if (r1 == r3) goto L_0x0042
            if (r1 != r2) goto L_0x003a
            java.lang.Object r10 = r5.f108871d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r5.f108870c
            DF.C r10 = (DF.C12754C) r10
            XH.y.b(r0)
            goto L_0x00b6
        L_0x003a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0042:
            boolean r10 = r5.f108872e
            java.lang.Object r11 = r5.f108871d
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r1 = r5.f108870c
            DF.C r1 = (DF.C12754C) r1
            XH.y.b(r0)
            goto L_0x009e
        L_0x0050:
            boolean r10 = r5.f108872e
            java.lang.Object r11 = r5.f108871d
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r1 = r5.f108870c
            DF.C r1 = (DF.C12754C) r1
            XH.y.b(r0)
            goto L_0x008d
        L_0x005e:
            XH.y.b(r0)
            com.sugarcube.app.base.network.NetworkLiveData r0 = r9.f108659C0
            java.lang.Object r0 = r0.getValue()
            r1 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r6)
            if (r0 == 0) goto L_0x0077
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r10
        L_0x0077:
            TJ.B<java.lang.Boolean> r0 = r9.f108666F0
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r4)
            r5.f108870c = r9
            r5.f108871d = r11
            r5.f108872e = r10
            r5.f108875h = r4
            java.lang.Object r0 = r0.emit(r1, r5)
            if (r0 != r8) goto L_0x008c
            return r8
        L_0x008c:
            r1 = r9
        L_0x008d:
            com.sugarcube.app.base.data.source.CompositionRepository r0 = r1.f108717m
            r5.f108870c = r1
            r5.f108871d = r11
            r5.f108872e = r10
            r5.f108875h = r3
            java.lang.Object r0 = r0.refreshCache(r5)
            if (r0 != r8) goto L_0x009e
            return r8
        L_0x009e:
            com.sugarcube.app.base.data.SceneRepository r0 = r1.f108721o
            KF.r r4 = r1.f108744z
            r5.f108870c = r1
            r5.f108871d = r11
            r5.f108872e = r10
            r5.f108875h = r2
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r0
            r2 = r10
            java.lang.Object r0 = com.sugarcube.app.base.data.SceneRepository.m25startRefreshhhJSO8g$default(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r8) goto L_0x00b6
            return r8
        L_0x00b6:
            com.sugarcube.app.base.data.SceneRepository$SceneRepoStatus r0 = (com.sugarcube.app.base.data.SceneRepository.SceneRepoStatus) r0
            boolean r10 = r0.hasPendingWork()
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.k3(boolean, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void m2(Event event) {
        if (!this.f108656B0.contains(event)) {
            this.f108656B0.add(event);
            AnalyticsManager.track$default(this.f108661D, event, ActionType.Workflow, (Trackable) null, 4, (Object) null);
        }
    }

    private final androidx.lifecycle.K<List<C12787d>> s2() {
        androidx.lifecycle.F<List<Scene>> scenes = this.f108721o.getScenes();
        androidx.lifecycle.F c10 = C5210m.c(this.f108731t.getUser(), g0.a(this).getCoroutineContext(), 0, 2, (Object) null);
        androidx.lifecycle.F<Boolean> scenesRefreshing = this.f108721o.getScenesRefreshing();
        androidx.lifecycle.F<Boolean> isRefreshing = this.f108717m.isRefreshing();
        androidx.lifecycle.I i10 = new androidx.lifecycle.I();
        i10.b(scenes, new I(new w(i10, this, scenes)));
        i10.b(this.f108703Z, new I(new x(i10, this, scenes)));
        i10.b(c10, new I(new y(i10, this, scenes)));
        i10.b(scenesRefreshing, new I(new z(i10, this, scenes)));
        i10.b(isRefreshing, new I(new C12752A(i10, this, scenes)));
        return i10;
    }

    /* access modifiers changed from: private */
    public static final C16807N t2(androidx.lifecycle.I i10, C12754C c10, androidx.lifecycle.F f10, LoggedInUser loggedInUser) {
        i10.setValue(c10.D0(f10, c10.f108703Z));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u2(androidx.lifecycle.I i10, C12754C c10, androidx.lifecycle.F f10, Boolean bool) {
        i10.setValue(c10.D0(f10, c10.f108703Z));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v2(androidx.lifecycle.I i10, C12754C c10, androidx.lifecycle.F f10, Boolean bool) {
        i10.setValue(c10.D0(f10, c10.f108703Z));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w2(androidx.lifecycle.I i10, C12754C c10, androidx.lifecycle.F f10, List list) {
        i10.setValue(c10.D0(f10, c10.f108703Z));
        return C16807N.f139792a;
    }

    private final void x0(List<Scene> list) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new C12764k(this, list, (C17164e<? super C12764k>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N x2(androidx.lifecycle.I i10, C12754C c10, androidx.lifecycle.F f10, List list) {
        i10.setValue(c10.D0(f10, c10.f108703Z));
        return C16807N.f139792a;
    }

    public final void A0() {
        this.f108732t1.setValue(C16877v.n());
    }

    public final androidx.lifecycle.F<Boolean> A1() {
        return this.f108694T0;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.F, androidx.lifecycle.K] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A2(java.util.UUID r10) {
        /*
            r9 = this;
            com.sugarcube.app.base.data.SceneRepository r0 = r9.f108721o
            androidx.lifecycle.F r1 = r0.getScenes()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            if (r1 == 0) goto L_0x0037
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.sugarcube.app.base.data.database.Scene r4 = (com.sugarcube.app.base.data.database.Scene) r4
            java.util.UUID r4 = r4.getSceneUuid()
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r10)
            if (r4 == 0) goto L_0x0015
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            com.sugarcube.app.base.data.database.Scene r3 = (com.sugarcube.app.base.data.database.Scene) r3
            if (r3 == 0) goto L_0x0037
            java.util.UUID r1 = r3.getSceneUuid()
            goto L_0x0038
        L_0x0037:
            r1 = r2
        L_0x0038:
            androidx.lifecycle.K r0 = r0.getShowrooms()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0066
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x004a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.sugarcube.core.network.models.Showroom r4 = (com.sugarcube.core.network.models.Showroom) r4
            java.util.UUID r4 = r4.getSceneUuid()
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r10)
            if (r4 == 0) goto L_0x004a
            goto L_0x0063
        L_0x0062:
            r3 = r2
        L_0x0063:
            com.sugarcube.core.network.models.Showroom r3 = (com.sugarcube.core.network.models.Showroom) r3
            goto L_0x0067
        L_0x0066:
            r3 = r2
        L_0x0067:
            if (r1 != 0) goto L_0x0071
            if (r3 == 0) goto L_0x0070
            java.util.UUID r1 = r3.getSceneUuid()
            goto L_0x0071
        L_0x0070:
            r1 = r2
        L_0x0071:
            if (r1 == 0) goto L_0x0096
            r9.f108736v1 = r1
            r9.f108738w1 = r2
            if (r3 == 0) goto L_0x007e
            java.util.UUID r10 = r3.getCompositionUuid()
            goto L_0x007f
        L_0x007e:
            r10 = r2
        L_0x007f:
            r9.f108740x1 = r10
            com.sugarcube.app.base.data.source.CompositionRepository r10 = r9.f108717m
            r10.selectScene(r1)
            QJ.Q r3 = androidx.lifecycle.g0.a(r9)
            DF.C$M r6 = new DF.C$M
            r6.<init>(r9, r2)
            r7 = 3
            r8 = 0
            r4 = 0
            r5 = 0
            QJ.F0 unused = QJ.C16314k.d(r3, r4, r5, r6, r7, r8)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.A2(java.util.UUID):void");
    }

    public final Object B0(Composition composition, C17164e<? super Result<Composition>> eVar) {
        return C16310i.g(C16311i0.b(), new C12765l(this, composition, (C17164e<? super C12765l>) null), eVar);
    }

    public final C16532g<Boolean> B1() {
        return this.f108718m1;
    }

    public final void B2(FeedbackSmileRatingBar.a aVar, String str) {
        C17542s.j(aVar, "rating");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new N(this, aVar, str, (C17164e<? super N>) null), 3, (Object) null);
    }

    public final androidx.lifecycle.F<C15083h> C1() {
        return this.f108693T;
    }

    public final void C2(FeedbackSmileRatingBar.a aVar, String str) {
        C17542s.j(aVar, "rating");
        F2();
        C15226a aVar2 = this.f108701Y;
        if (str == null) {
            str = "(no feedback)";
        }
        aVar2.t(aVar, str);
        j2();
    }

    public final androidx.lifecycle.F<Boolean> D1() {
        return this.f108682N0;
    }

    public final void D2(h hVar) {
        C17542s.j(hVar, "tab");
        this.f108723p.b().galleryKreativHomeSelectTab(hVar.a());
        C16505B<C12761h> b10 = this.f108712h1;
        b10.setValue(C12761h.b(b10.getValue(), hVar, (List) null, 2, (Object) null));
    }

    public final androidx.lifecycle.F<Boolean> E1() {
        return this.f108697V0;
    }

    public final void E2(int i10) {
        this.f108726q1 = i10;
    }

    public final void F0() {
        this.f108715k1.postValue(null);
    }

    public final C16532g<Boolean> F1() {
        return this.f108714j1;
    }

    public final Object G0(UUID uuid, C17164e<? super Result<Boolean>> eVar) {
        return C16310i.g(C16311i0.b(), new C12768o(this, uuid, (C17164e<? super C12768o>) null), eVar);
    }

    public final androidx.lifecycle.F<Boolean> G1() {
        return this.f108686P0;
    }

    public final void G2(boolean z10) {
        this.f108708d1.setValue(Boolean.valueOf(z10));
    }

    public final void H2(C12603x xVar) {
        C17542s.j(xVar, "itemViewType");
        this.f108678L0 = xVar;
    }

    public final C16532g<List<Composition>> I0() {
        return C16534i.F(this.f108731t.isLoggedIn(), new C12771r(this, (C17164e<? super C12771r>) null));
    }

    public final androidx.lifecycle.F<List<C12787d>> I1() {
        return this.f108653A0;
    }

    public final void I2() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new P(this, (C17164e<? super P>) null), 3, (Object) null);
    }

    public final void J0() {
        Composition composition;
        PendingComposition pendingComposition = this.f108717m.getPendingComposition();
        if (!(pendingComposition == null || (composition = pendingComposition.getComposition()) == null)) {
            this.f108723p.c().j(composition.getThumbnailUrl());
        }
        this.f108701Y.a();
        this.f108717m.setPendingComposition((PendingComposition) null);
    }

    public final androidx.lifecycle.F<Integer> J1() {
        return this.f108674J0;
    }

    public final void J2() {
        androidx.lifecycle.K<PendingComposition> k10 = this.f108688Q0;
        PendingComposition value = k10.getValue();
        k10.setValue(value != null ? PendingComposition.copy$default(value, (Composition) null, AuthType.UNKNOWN, true, 1, (Object) null) : null);
        this.f108717m.setPendingComposition(this.f108688Q0.getValue());
    }

    public final void K0() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new C12772s(this, (C17164e<? super C12772s>) null), 3, (Object) null);
    }

    public final void K2() {
        this.f108698W0.postValue(Boolean.FALSE);
    }

    public final void L0() {
        F2();
        this.f108701Y.c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.lifecycle.F, androidx.lifecycle.K] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.app.base.data.analytics.RoomSource L1(java.util.UUID r6) {
        /*
            r5 = this;
            java.lang.String r0 = "uuid"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            com.sugarcube.app.base.data.SceneRepository r0 = r5.f108721o
            androidx.lifecycle.K r1 = r0.getShowrooms()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            if (r1 == 0) goto L_0x003a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x001a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0032
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.sugarcube.core.network.models.Showroom r4 = (com.sugarcube.core.network.models.Showroom) r4
            java.util.UUID r4 = r4.getSceneUuid()
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
            if (r4 == 0) goto L_0x001a
            goto L_0x0033
        L_0x0032:
            r3 = r2
        L_0x0033:
            com.sugarcube.core.network.models.Showroom r3 = (com.sugarcube.core.network.models.Showroom) r3
            if (r3 == 0) goto L_0x003a
            com.sugarcube.app.base.data.analytics.RoomSource r6 = com.sugarcube.app.base.data.analytics.RoomSource.Showroom
            return r6
        L_0x003a:
            androidx.lifecycle.F r0 = r0.getScenes()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0071
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x004c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.sugarcube.app.base.data.database.Scene r3 = (com.sugarcube.app.base.data.database.Scene) r3
            java.util.UUID r3 = r3.getSceneUuid()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
            if (r3 == 0) goto L_0x004c
            r2 = r1
        L_0x0064:
            com.sugarcube.app.base.data.database.Scene r2 = (com.sugarcube.app.base.data.database.Scene) r2
            if (r2 == 0) goto L_0x0071
            boolean r6 = r2.isStock()
            if (r6 == 0) goto L_0x0071
            com.sugarcube.app.base.data.analytics.RoomSource r6 = com.sugarcube.app.base.data.analytics.RoomSource.Stock
            return r6
        L_0x0071:
            com.sugarcube.app.base.data.analytics.RoomSource r6 = com.sugarcube.app.base.data.analytics.RoomSource.UserCaptured
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.L1(java.util.UUID):com.sugarcube.app.base.data.analytics.RoomSource");
    }

    public final void L2(boolean z10) {
        this.f108692S0.setValue(Boolean.valueOf(z10));
    }

    public final void M0() {
        this.f108691S.postValue(C15083h.a.f131169a);
    }

    public final q M1() {
        return this.f108723p;
    }

    public final void M2(boolean z10) {
        this.f108696U0.setValue(Boolean.valueOf(z10));
        if (z10) {
            m2(Gallery.Warning.OutageDetected);
        }
    }

    public final void N0(UUID uuid, String str) {
        C17542s.j(uuid, "compUUID");
        F0 unused = C16314k.d(g0.a(this), C16311i0.b(), (QJ.T) null, new C12773t(this, uuid, str, (C17164e<? super C12773t>) null), 2, (Object) null);
    }

    public final C16505B<C12761h> N1() {
        return this.f108712h1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O0(java.util.List<com.sugarcube.core.network.models.PlacedFurniture> r10, dI.C17164e<? super XH.C16807N> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof DF.C12754C.C12776w
            if (r0 == 0) goto L_0x0013
            r0 = r11
            DF.C$w r0 = (DF.C12754C.C12776w) r0
            int r1 = r0.f108992t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f108992t = r1
            goto L_0x0018
        L_0x0013:
            DF.C$w r0 = new DF.C$w
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f108990r
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f108992t
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x005e
            if (r3 != r4) goto L_0x0056
            java.lang.Object r10 = r0.f108985m
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.f108984l
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r11 = r0.f108983k
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = r0.f108982j
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r11 = r0.f108981i
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = r0.f108980h
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r0.f108979g
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r0.f108978f
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r0.f108977e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r0.f108976d
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r0.f108975c
            DF.C r0 = (DF.C12754C) r0
            XH.y.b(r1)
            goto L_0x00bf
        L_0x0056:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x005e:
            XH.y.b(r1)
            if (r10 == 0) goto L_0x0132
            androidx.lifecycle.K<java.lang.Boolean> r1 = r9.f108679M
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r4)
            r1.postValue(r3)
            r1 = r10
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r1.iterator()
        L_0x0078:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x008e
            java.lang.Object r7 = r6.next()
            com.sugarcube.core.network.models.PlacedFurniture r7 = (com.sugarcube.core.network.models.PlacedFurniture) r7
            java.lang.Integer r7 = r7.getFurnitureId()
            if (r7 == 0) goto L_0x0078
            r3.add(r7)
            goto L_0x0078
        L_0x008e:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.sugarcube.app.base.data.source.CatalogRepository r8 = r9.f108719n
            r0.f108975c = r9
            r0.f108976d = r10
            r0.f108977e = r11
            r0.f108978f = r10
            r0.f108979g = r10
            r0.f108980h = r7
            r0.f108981i = r1
            r0.f108982j = r3
            r0.f108983k = r1
            r0.f108984l = r6
            r0.f108985m = r3
            r0.f108986n = r5
            r0.f108987o = r5
            r0.f108988p = r5
            r0.f108989q = r5
            r0.f108992t = r4
            java.lang.Object r1 = r8.fetchProductInformation(r3, r0)
            if (r1 != r2) goto L_0x00bc
            return r2
        L_0x00bc:
            r0 = r9
            r10 = r3
            r11 = r7
        L_0x00bf:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x00c7:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0124
            java.lang.Object r2 = r10.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r1 == 0) goto L_0x00c7
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00e5:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00fc
            java.lang.Object r6 = r3.next()
            r7 = r6
            com.sugarcube.app.base.data.database.CachedCatalogItem r7 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r7
            int r7 = r7.getId()
            if (r7 != r2) goto L_0x00e5
            r4.add(r6)
            goto L_0x00e5
        L_0x00fc:
            java.util.Iterator r2 = r4.iterator()
        L_0x0100:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c7
            java.lang.Object r3 = r2.next()
            com.sugarcube.app.base.data.database.CachedCatalogItem r3 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r3
            kF.D$a r4 = kF.C14683D.f128666h
            com.sugarcube.app.base.external.config.a r6 = r0.f108725q
            java.lang.String r6 = r6.getCountry()
            com.sugarcube.app.base.external.config.a r7 = r0.f108725q
            java.lang.String r7 = r7.getLanguage()
            kF.D r3 = r4.b(r3, r6, r7)
            if (r3 == 0) goto L_0x0100
            r11.add(r3)
            goto L_0x0100
        L_0x0124:
            androidx.lifecycle.K<java.util.List<kF.D>> r10 = r0.f108683O
            r10.postValue(r11)
            androidx.lifecycle.K<java.lang.Boolean> r10 = r0.f108679M
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r5)
            r10.postValue(r11)
        L_0x0132:
            XH.N r10 = XH.C16807N.f139792a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.O0(java.util.List, dI.e):java.lang.Object");
    }

    public final androidx.lifecycle.F<Composition> O1() {
        return this.f108676K0;
    }

    public final void O2(boolean z10) {
        this.f108684O0.setValue(Boolean.valueOf(z10));
        if (z10) {
            m2(Gallery.Warning.Upgrade);
        }
    }

    public final void P1() {
        UUID x12 = x1();
        if (x12 != null) {
            this.f108701Y.m();
            String w12 = w1();
            if (w12 == null) {
                w12 = "";
            }
            String str = w12;
            if (Z1(x12)) {
                this.f108715k1.setValue(new Design(str, x12, 0, true, this.f108740x1));
            } else {
                this.f108715k1.setValue(new Design(str, x12, v1(), false, (UUID) null, 24, (DefaultConstructorMarker) null));
            }
        }
    }

    public final void Q1() {
        Log.d(AnyKt.SUGARCUBE_TAG, "Hard Deleting scenes");
        F0 unused = C16314k.d(g0.a(this), C16311i0.b(), (QJ.T) null, new C12777x(this, (C17164e<? super C12777x>) null), 2, (Object) null);
    }

    public final void Q2() {
        this.f108674J0.setValue(null);
    }

    public final androidx.lifecycle.F<Boolean> R1() {
        return this.f108673J;
    }

    public final void R2() {
        this.f108676K0.setValue(null);
    }

    public final androidx.lifecycle.F<Boolean> S0() {
        return this.f108689R;
    }

    public final boolean S1() {
        UUID explicitlySavedComposition = this.f108717m.getExplicitlySavedComposition();
        if (explicitlySavedComposition == null) {
            return false;
        }
        this.f108738w1 = explicitlySavedComposition;
        return true;
    }

    public final Object S2(UUID uuid, C17164e<? super Result<Composition>> eVar) {
        return C16310i.g(g0.a(this).getCoroutineContext(), new Q(this, uuid, (C17164e<? super Q>) null), eVar);
    }

    public final boolean T0() {
        return this.f108657B1;
    }

    public final boolean T1() {
        return ((Boolean) C16312j.b((C17168i) null, new C12778y(this, (C17164e<? super C12778y>) null), 1, (Object) null)).booleanValue();
    }

    public final a U0() {
        return this.f108725q;
    }

    public final boolean U1() {
        PendingComposition pendingComposition = this.f108717m.getPendingComposition();
        if (pendingComposition == null) {
            return false;
        }
        this.f108688Q0.postValue(pendingComposition);
        this.f108738w1 = pendingComposition.getComposition().getCompositionUuid();
        return true;
    }

    public final VideoAssetRepository V0() {
        return this.f108727r;
    }

    public final NetworkLiveData V1() {
        return this.f108659C0;
    }

    public final androidx.lifecycle.F<Boolean> W1() {
        return this.f108672I0;
    }

    public final androidx.lifecycle.F<List<C12785b>> X0() {
        return this.f108734u1;
    }

    public final C16519P<Boolean> X1() {
        return this.f108664E0;
    }

    public final androidx.lifecycle.F<List<Composition>> Y0() {
        return this.f108730s1;
    }

    public final androidx.lifecycle.F<Boolean> Y1() {
        return this.f108709e1;
    }

    public final CompositionRepository Z0() {
        return this.f108717m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.sugarcube.core.network.models.Showroom} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.sugarcube.core.network.models.Showroom} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.sugarcube.core.network.models.Showroom} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.sugarcube.core.network.models.Showroom} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.sugarcube.core.network.models.Showroom} */
    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.lifecycle.F, androidx.lifecycle.K] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Z1(java.util.UUID r5) {
        /*
            r4 = this;
            java.lang.String r0 = "uuid"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            com.sugarcube.app.base.data.SceneRepository r0 = r4.f108721o
            androidx.lifecycle.K r0 = r0.getShowrooms()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x0034
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.sugarcube.core.network.models.Showroom r3 = (com.sugarcube.core.network.models.Showroom) r3
            java.util.UUID r3 = r3.getSceneUuid()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r3 == 0) goto L_0x001a
            r1 = r2
        L_0x0032:
            com.sugarcube.core.network.models.Showroom r1 = (com.sugarcube.core.network.models.Showroom) r1
        L_0x0034:
            if (r1 == 0) goto L_0x0038
            r5 = 1
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.Z1(java.util.UUID):boolean");
    }

    public final androidx.lifecycle.F<Boolean> a1() {
        return this.f108699X;
    }

    public final boolean a2() {
        return this.f108654A1;
    }

    public final androidx.lifecycle.K<List<C14683D>> b1() {
        return this.f108685P;
    }

    public final androidx.lifecycle.F<Boolean> b2() {
        return this.f108717m.isRefreshing();
    }

    public final androidx.lifecycle.F<List<C12785b>> c1() {
        return this.f108745z0;
    }

    public final boolean c2() {
        return this.f108731t.isLoggedIn().getValue().booleanValue();
    }

    public final androidx.lifecycle.F<List<String>> d1() {
        return this.f108710f1;
    }

    public final void d2() {
        i2();
    }

    public final androidx.lifecycle.F<Boolean> e1() {
        return this.f108711g1;
    }

    public final C12603x f1() {
        return this.f108678L0;
    }

    public final void f2() {
        V2();
    }

    public final androidx.lifecycle.F<Design> g1() {
        return this.f108716l1;
    }

    public final void g2() {
        this.f108706b1.setValue(null);
    }

    public final androidx.lifecycle.F<PendingComposition> h1() {
        return this.f108690R0;
    }

    public final void h2() {
        if (!C17542s.e(this.f108659C0.getValue(), Boolean.FALSE)) {
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new B(this, (C17164e<? super B>) null), 3, (Object) null);
        }
    }

    public final androidx.lifecycle.K<Boolean> i1() {
        return this.f108720n1;
    }

    public final void i3() {
        List value = this.f108703Z.getValue();
        if (value != null) {
            ArrayList<C12790g> arrayList = new ArrayList<>();
            for (Object next : value) {
                if (((C12790g) next).c()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
            for (C12790g a10 : arrayList) {
                arrayList2.add(a10.a());
            }
            Log.d(AnyKt.SUGARCUBE_TAG, "about to delete " + arrayList2);
            F0 unused = C16314k.d(g0.a(this), C16311i0.b(), (QJ.T) null, new a0(this, arrayList2, (C17164e<? super a0>) null), 2, (Object) null);
        }
    }

    public final androidx.lifecycle.K<Boolean> j1() {
        return this.f108728r1;
    }

    public final void j2() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new C2604C(this, (C17164e<? super C2604C>) null), 3, (Object) null);
    }

    public final void j3() {
        F0 d10 = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new c0(this, (C17164e<? super c0>) null), 3, (Object) null);
        this.f108743y1 = d10;
        Log.d(AnyKt.SUGARCUBE_TAG, "start update job " + d10);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new d0(this, (C17164e<? super d0>) null), 3, (Object) null);
    }

    public final androidx.lifecycle.F<Boolean> k1() {
        return this.f108705a1;
    }

    public final void k2(UUID uuid) {
        C17542s.j(uuid, "uuid");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new D(this, uuid, (C17164e<? super D>) null), 3, (Object) null);
    }

    public final androidx.lifecycle.F<Boolean> l1() {
        return this.f108700X0;
    }

    public final void l2() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new E(this, (C17164e<? super E>) null), 3, (Object) null);
    }

    public final void l3() {
        F0 f02 = this.f108743y1;
        Log.d(AnyKt.SUGARCUBE_TAG, "stop update job " + f02);
        F0 f03 = this.f108743y1;
        if (f03 != null) {
            F0.a.a(f03, (CancellationException) null, 1, (Object) null);
        }
        this.f108743y1 = null;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new f0(this, (C17164e<? super f0>) null), 3, (Object) null);
    }

    public final androidx.lifecycle.F<PrivacyPolicyFeatureState> m1() {
        return this.f108702Y0;
    }

    public final void m3(boolean z10, List<String> list) {
        ArrayList arrayList;
        C17542s.j(list, "selectionList");
        androidx.lifecycle.K<List<C12790g>> k10 = this.f108703Z;
        List value = this.f108721o.getScenes().getValue();
        if (value != null) {
            Iterable<Scene> iterable = value;
            arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Scene scene : iterable) {
                arrayList.add(new C12790g(scene.getUuid(), list.contains(scene.getUuid().toString()), z10));
            }
        } else {
            arrayList = null;
        }
        k10.setValue(arrayList);
    }

    public final androidx.lifecycle.F<Uri> n1() {
        return this.f108706b1;
    }

    public final void n2() {
        this.f108695U.postValue(Boolean.TRUE);
    }

    public final androidx.lifecycle.F<Boolean> o1() {
        return this.f108681N;
    }

    public final void o2() {
        Log.d(AnyKt.SUGARCUBE_TAG, "about to restore");
        F0 unused = C16314k.d(g0.a(this), C16311i0.b(), (QJ.T) null, new F(this, (C17164e<? super F>) null), 2, (Object) null);
    }

    public final void onPullRefresh() {
        this.f108662D0.a(Boolean.TRUE);
        C12761h value = this.f108712h1.getValue();
        if ((value != null ? value.c() : null) instanceof h.c) {
            j2();
        } else {
            h2();
        }
    }

    public final C15226a p1() {
        return this.f108701Y;
    }

    public final void p2() {
        F0 unused = C16314k.d(g0.a(this), C16311i0.b(), (QJ.T) null, new G(this, (C17164e<? super G>) null), 2, (Object) null);
    }

    public final androidx.lifecycle.F<Integer> q1() {
        return this.f108746z1;
    }

    public final void q2(Scene scene) {
        C17542s.j(scene, "scene");
        F0 unused = C16314k.d(g0.a(this), C16311i0.b(), (QJ.T) null, new H(this, scene, (C17164e<? super H>) null), 2, (Object) null);
    }

    public final androidx.lifecycle.F<List<C12787d>> r1() {
        return this.f108742y0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r2(dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.Composition>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof DF.C12754C.J
            if (r0 == 0) goto L_0x0013
            r0 = r6
            DF.C$J r0 = (DF.C12754C.J) r0
            int r1 = r0.f108781g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f108781g = r1
            goto L_0x0018
        L_0x0013:
            DF.C$J r0 = new DF.C$J
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f108779e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f108781g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f108778d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f108777c
            DF.C r6 = (DF.C12754C) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            r5.G2(r4)
            com.sugarcube.app.base.data.source.CompositionRepository r1 = r5.f108717m
            OE.q r3 = r5.f108723p
            r0.f108777c = r5
            r0.f108778d = r6
            r0.f108781g = r4
            java.lang.Object r1 = r1.savePendingComposition(r3, r0)
            if (r1 != r2) goto L_0x0050
            return r2
        L_0x0050:
            r6 = r5
        L_0x0051:
            com.sugarcube.app.base.data.Result r1 = (com.sugarcube.app.base.data.Result) r1
            boolean r0 = r1 instanceof com.sugarcube.app.base.data.Result.Success
            r2 = 0
            if (r0 == 0) goto L_0x0073
            xF.a r0 = r6.f108701Y
            r3 = r1
            com.sugarcube.app.base.data.Result$Success r3 = (com.sugarcube.app.base.data.Result.Success) r3
            java.lang.Object r3 = r3.getData()
            com.sugarcube.core.network.models.Composition r3 = (com.sugarcube.core.network.models.Composition) r3
            r0.r(r3)
            androidx.lifecycle.K<com.sugarcube.app.base.data.model.PendingComposition> r0 = r6.f108688Q0
            r3 = 0
            r0.postValue(r3)
            r6.G2(r2)
            r6.j2()
            goto L_0x007a
        L_0x0073:
            boolean r0 = r1 instanceof com.sugarcube.app.base.data.Result.Error
            if (r0 == 0) goto L_0x007b
            r6.G2(r2)
        L_0x007a:
            return r1
        L_0x007b:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.r2(dI.e):java.lang.Object");
    }

    public final SceneRepository s1() {
        return this.f108721o;
    }

    public final Composition t1() {
        Composition composition;
        UUID uuid = this.f108738w1;
        if (uuid == null) {
            uuid = this.f108717m.getExplicitlySavedComposition();
        }
        Log.d(AnyKt.SUGARCUBE_TAG, "Selected composition is " + uuid);
        if (uuid == null || (composition = this.f108717m.getComposition(uuid)) == null) {
            return null;
        }
        boolean a10 = C12788e.a(composition);
        this.f108654A1 = a10;
        this.f108657B1 = !a10 && C17542s.e(this.f108672I0.getValue(), Boolean.TRUE);
        return composition;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ec A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fe A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u0(dI.C17164e<? super java.lang.Boolean> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof DF.C12754C.C12762i
            if (r0 == 0) goto L_0x0013
            r0 = r11
            DF.C$i r0 = (DF.C12754C.C12762i) r0
            int r1 = r0.f108931o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f108931o = r1
            goto L_0x0018
        L_0x0013:
            DF.C$i r0 = new DF.C$i
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f108929m
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f108931o
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0056
            if (r3 != r4) goto L_0x004e
            java.lang.Object r11 = r0.f108926j
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r11 = r0.f108925i
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r11 = r0.f108924h
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = r0.f108923g
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = r0.f108922f
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r0.f108921e
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r0.f108920d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f108919c
            DF.C r0 = (DF.C12754C) r0
            XH.y.b(r1)     // Catch:{ all -> 0x004b }
            goto L_0x00e6
        L_0x004b:
            r11 = move-exception
            goto L_0x0122
        L_0x004e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0056:
            XH.y.b(r1)
            androidx.lifecycle.K<java.util.List<kF.D>> r1 = r10.f108685P
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0084
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x006e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0085
            java.lang.Object r6 = r1.next()
            kF.D r6 = (kF.C14683D) r6
            com.sugarcube.app.base.data.database.CachedCatalogItem r6 = r6.a()
            if (r6 == 0) goto L_0x006e
            r3.add(r6)
            goto L_0x006e
        L_0x0084:
            r3 = 0
        L_0x0085:
            if (r3 != 0) goto L_0x008c
            java.util.List r1 = YH.C16877v.n()
            goto L_0x008d
        L_0x008c:
            r1 = r3
        L_0x008d:
            androidx.lifecycle.K<java.lang.Boolean> r3 = r10.f108687Q
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            r3.postValue(r6)
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x00c0 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00c0 }
            r7 = 10
            int r7 = YH.C16877v.y(r3, r7)     // Catch:{ all -> 0x00c0 }
            r6.<init>(r7)     // Catch:{ all -> 0x00c0 }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ all -> 0x00c0 }
        L_0x00a8:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x00c0 }
            if (r8 == 0) goto L_0x00c3
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x00c0 }
            com.sugarcube.app.base.data.database.CachedCatalogItem r8 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r8     // Catch:{ all -> 0x00c0 }
            int r8 = r8.getId()     // Catch:{ all -> 0x00c0 }
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.e(r8)     // Catch:{ all -> 0x00c0 }
            r6.add(r8)     // Catch:{ all -> 0x00c0 }
            goto L_0x00a8
        L_0x00c0:
            r11 = move-exception
            r0 = r10
            goto L_0x0122
        L_0x00c3:
            com.sugarcube.app.base.data.source.CatalogRepository r8 = r10.f108719n     // Catch:{ all -> 0x00c0 }
            r0.f108919c = r10     // Catch:{ all -> 0x00c0 }
            r0.f108920d = r11     // Catch:{ all -> 0x00c0 }
            r0.f108921e = r1     // Catch:{ all -> 0x00c0 }
            r0.f108922f = r6     // Catch:{ all -> 0x00c0 }
            r0.f108923g = r3     // Catch:{ all -> 0x00c0 }
            r0.f108924h = r3     // Catch:{ all -> 0x00c0 }
            r0.f108925i = r6     // Catch:{ all -> 0x00c0 }
            r0.f108926j = r7     // Catch:{ all -> 0x00c0 }
            r0.f108927k = r5     // Catch:{ all -> 0x00c0 }
            r0.f108928l = r5     // Catch:{ all -> 0x00c0 }
            r0.f108931o = r4     // Catch:{ all -> 0x00c0 }
            java.lang.Object r11 = r8.addItemsToCartByIds(r6, r0)     // Catch:{ all -> 0x00c0 }
            if (r11 != r2) goto L_0x00e2
            return r2
        L_0x00e2:
            r0 = r10
            r9 = r1
            r1 = r11
            r11 = r9
        L_0x00e6:
            com.sugarcube.app.base.data.Result r1 = (com.sugarcube.app.base.data.Result) r1     // Catch:{ all -> 0x004b }
            boolean r2 = r1 instanceof com.sugarcube.app.base.data.Result.Success     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x00fe
            xF.a r2 = r0.f108701Y     // Catch:{ all -> 0x004b }
            r2.e(r11)     // Catch:{ all -> 0x004b }
            com.sugarcube.app.base.data.Result$Success r1 = (com.sugarcube.app.base.data.Result.Success) r1     // Catch:{ all -> 0x004b }
            java.lang.Object r11 = r1.getData()     // Catch:{ all -> 0x004b }
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x004b }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x004b }
            goto L_0x010e
        L_0x00fe:
            boolean r2 = r1 instanceof com.sugarcube.app.base.data.Result.Error     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x011c
            xF.a r2 = r0.f108701Y     // Catch:{ all -> 0x004b }
            com.sugarcube.app.base.data.Result$Error r1 = (com.sugarcube.app.base.data.Result.Error) r1     // Catch:{ all -> 0x004b }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x004b }
            r2.l(r11, r1)     // Catch:{ all -> 0x004b }
            r11 = r5
        L_0x010e:
            androidx.lifecycle.K<java.lang.Boolean> r0 = r0.f108687Q
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r5)
            r0.postValue(r1)
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r11)
            return r11
        L_0x011c:
            XH.t r11 = new XH.t     // Catch:{ all -> 0x004b }
            r11.<init>()     // Catch:{ all -> 0x004b }
            throw r11     // Catch:{ all -> 0x004b }
        L_0x0122:
            androidx.lifecycle.K<java.lang.Boolean> r0 = r0.f108687Q
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r5)
            r0.postValue(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.u0(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.app.base.data.database.Scene u1() {
        /*
            r5 = this;
            com.sugarcube.app.base.data.SceneRepository r0 = r5.f108721o
            androidx.lifecycle.F r0 = r0.getScenes()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x0031
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.sugarcube.app.base.data.database.Scene r3 = (com.sugarcube.app.base.data.database.Scene) r3
            java.util.UUID r3 = r3.getSceneUuid()
            java.util.UUID r4 = r5.f108736v1
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 == 0) goto L_0x0015
            r1 = r2
        L_0x002f:
            com.sugarcube.app.base.data.database.Scene r1 = (com.sugarcube.app.base.data.database.Scene) r1
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.u1():com.sugarcube.app.base.data.database.Scene");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v0(com.sugarcube.app.base.data.database.CachedCatalogItem r6, dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof DF.C12754C.C12763j
            if (r0 == 0) goto L_0x0013
            r0 = r7
            DF.C$j r0 = (DF.C12754C.C12763j) r0
            int r1 = r0.f108937h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f108937h = r1
            goto L_0x0018
        L_0x0013:
            DF.C$j r0 = new DF.C$j
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f108935f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f108937h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f108934e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f108933d
            com.sugarcube.app.base.data.database.CachedCatalogItem r6 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r6
            java.lang.Object r7 = r0.f108932c
            DF.C r7 = (DF.C12754C) r7
            XH.y.b(r1)
            goto L_0x0052
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            com.sugarcube.app.base.data.source.CatalogRepository r1 = r5.f108719n
            r0.f108932c = r5
            r0.f108933d = r6
            r0.f108934e = r7
            r0.f108937h = r4
            java.lang.Object r1 = r1.addItemToCart(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            r7 = r5
        L_0x0052:
            com.sugarcube.app.base.data.Result r1 = (com.sugarcube.app.base.data.Result) r1
            boolean r0 = r1 instanceof com.sugarcube.app.base.data.Result.Success
            if (r0 == 0) goto L_0x0062
            xF.a r7 = r7.f108701Y
            r7.f(r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        L_0x0062:
            boolean r0 = r1 instanceof com.sugarcube.app.base.data.Result.Error
            if (r0 == 0) goto L_0x007b
            xF.a r7 = r7.f108701Y
            java.util.List r6 = YH.C16877v.e(r6)
            com.sugarcube.app.base.data.Result$Error r1 = (com.sugarcube.app.base.data.Result.Error) r1
            java.lang.String r0 = r1.getMessage()
            r7.l(r6, r0)
            r6 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        L_0x007b:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12754C.v0(com.sugarcube.app.base.data.database.CachedCatalogItem, dI.e):java.lang.Object");
    }

    public final int v1() {
        Object obj;
        List value = this.f108721o.getScenes().getValue();
        if (value != null) {
            Iterator it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((Scene) obj).getSceneUuid(), this.f108736v1)) {
                    break;
                }
            }
            Scene scene = (Scene) obj;
            if (scene != null) {
                return scene.getSceneId();
            }
        }
        return -1;
    }

    public final boolean w0(C8951o oVar, CachedCatalogItem cachedCatalogItem) {
        C17542s.j(oVar, "navController");
        C17542s.j(cachedCatalogItem, "item");
        String localItemNumber = cachedCatalogItem.getCatalogItem().getLocalItemNumber();
        if (localItemNumber == null) {
            return false;
        }
        AddToShoppingListUseCase.a.a(this.f108663E, oVar, cachedCatalogItem.getName(), localItemNumber, (String) null, 0, 24, (Object) null);
        this.f108701Y.g(cachedCatalogItem);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.F, androidx.lifecycle.K] */
    public final String w1() {
        Object obj;
        Object obj2;
        String name;
        SceneRepository sceneRepository = this.f108721o;
        Iterable iterable = (List) sceneRepository.getScenes().getValue();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (C17542s.e(((Scene) obj2).getSceneUuid(), this.f108736v1)) {
                    break;
                }
            }
            Scene scene = (Scene) obj2;
            if (!(scene == null || (name = scene.getName()) == null)) {
                return name;
            }
        }
        Iterable iterable2 = (List) sceneRepository.getShowrooms().getValue();
        if (iterable2 == null) {
            return null;
        }
        Iterator it2 = iterable2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (C17542s.e(((Showroom) obj).getSceneUuid(), this.f108736v1)) {
                break;
            }
        }
        Showroom showroom = (Showroom) obj;
        if (showroom != null) {
            return showroom.getName();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.F, androidx.lifecycle.K] */
    public final UUID x1() {
        Object obj;
        Object obj2;
        UUID uuid;
        SceneRepository sceneRepository = this.f108721o;
        Iterable iterable = (List) sceneRepository.getScenes().getValue();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (C17542s.e(((Scene) obj2).getSceneUuid(), this.f108736v1)) {
                    break;
                }
            }
            Scene scene = (Scene) obj2;
            if (!(scene == null || (uuid = scene.getUuid()) == null)) {
                return uuid;
            }
        }
        Iterable iterable2 = (List) sceneRepository.getShowrooms().getValue();
        if (iterable2 == null) {
            return null;
        }
        Iterator it2 = iterable2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (C17542s.e(((Showroom) obj).getSceneUuid(), this.f108736v1)) {
                break;
            }
        }
        Showroom showroom = (Showroom) obj;
        if (showroom != null) {
            return showroom.getSceneUuid();
        }
        return null;
    }

    public final void y0() {
        this.f108717m.setExplicitlySavedComposition((UUID) null);
    }

    public final androidx.lifecycle.F<Boolean> y1() {
        return this.f108660C1;
    }

    public final C16532g<List<Scene>> y2() {
        return C16534i.F(this.f108731t.isLoggedIn(), new K(this, (C17164e<? super K>) null));
    }

    public final void z0() {
        this.f108695U.postValue(Boolean.FALSE);
    }

    public final androidx.lifecycle.F<Boolean> z1() {
        return this.f108668G0;
    }

    public final void z2(UUID uuid) {
        this.f108738w1 = uuid;
    }
}
