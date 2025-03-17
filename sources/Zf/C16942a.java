package ZF;

import HJ.C15846l;
import HJ.C15850p;
import OE.q;
import RF.j;
import RF.k;
import android.util.Log;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.analytics.CatalogItemSource;
import com.sugarcube.app.base.data.analytics.ChangeType;
import com.sugarcube.app.base.data.analytics.MethodType;
import com.sugarcube.app.base.data.analytics.ProductParentType;
import com.sugarcube.app.base.data.analytics.ProductType;
import com.sugarcube.app.base.data.analytics.RoomSource;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.model.DecorateViewMode;
import com.sugarcube.core.network.models.FurnitureType;
import com.sugarcube.core.network.models.SmartaPlacementResult;
import com.sugarcube.decorate.v1.internal.v1.adapters.ItemVariantAdapter;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 92\u00020\u0001:\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJk\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001eH\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u000fH\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u0018H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001eH\u0000¢\u0006\u0004\b-\u0010&J\u0017\u0010.\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b0\u0010/J\u0017\u00102\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u0018H\u0000¢\u0006\u0004\b2\u0010,J)\u00103\u001a\u00020\u001e2\b\u00101\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u0018H\u0000¢\u0006\u0004\b5\u0010,J\u000f\u00106\u001a\u00020\u001eH\u0000¢\u0006\u0004\b6\u0010&J\u000f\u00107\u001a\u00020\u001eH\u0000¢\u0006\u0004\b7\u0010&J\u000f\u00108\u001a\u00020\u001eH\u0000¢\u0006\u0004\b8\u0010&J\u0015\u00109\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b9\u0010/J\u001f\u0010:\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b<\u0010;JI\u0010A\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\bA\u0010BJ7\u0010G\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020C2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\bG\u0010HJ'\u0010I\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020C2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\bI\u0010JJG\u0010O\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020C2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020K2\u0006\u0010N\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u001eH\u0000¢\u0006\u0004\bQ\u0010&J\u000f\u0010R\u001a\u00020\u001eH\u0000¢\u0006\u0004\bR\u0010&J\u000f\u0010S\u001a\u00020\u001eH\u0000¢\u0006\u0004\bS\u0010&J%\u0010V\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010U\u001a\u00020T2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\bX\u0010/J\u0017\u0010Y\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\bY\u0010/J\u0017\u0010Z\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\bZ\u0010/J!\u0010[\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b[\u0010\\J\u001f\u0010^\u001a\u00020\u001e2\u0006\u0010]\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b`\u0010/J!\u0010a\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\ba\u0010\\J\u0017\u0010b\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\bb\u0010/J!\u0010c\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\bc\u0010\\J\u000f\u0010d\u001a\u00020\u001eH\u0000¢\u0006\u0004\bd\u0010&J\u000f\u0010e\u001a\u00020\u001eH\u0000¢\u0006\u0004\be\u0010&J\u000f\u0010f\u001a\u00020\u001eH\u0000¢\u0006\u0004\bf\u0010&J\u001f\u0010g\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\bg\u0010hJ\u001f\u0010i\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\bi\u0010hJ\u0017\u0010j\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\bj\u0010/J\u0017\u0010k\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\bk\u0010lJ\u001f\u0010m\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\bm\u0010nJ\u001d\u0010q\u001a\u00020\u001e2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u000b0oH\u0000¢\u0006\u0004\bq\u0010rJ)\u0010w\u001a\u00020\u001e2\u0006\u0010s\u001a\u00020\u00182\u0006\u0010u\u001a\u00020t2\b\u0010v\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\bw\u0010xJW\u0010{\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\u000b2\b\u0010y\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010zH\u0000¢\u0006\u0004\b{\u0010|J\u0017\u0010}\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b}\u0010lJ\u001f\u0010~\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b~\u0010nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R&\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0016\n\u0004\bq\u0010[\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R&\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\b\u001f\u0010\u0001\u001a\u0005\b\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u00030\u00018\u0006¢\u0006\u000f\n\u0005\bm\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R(\u0010\u0001\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b~\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R(\u0010\u0001\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b{\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R'\u0010\u0001\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\bQ\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0005\b\u0001\u0010,R)\u0010£\u0001\u001a\u00030\u00018\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\bS\u0010 \u0001\u001a\u0006\b\u0001\u0010¡\u0001\"\u0006\b\u0001\u0010¢\u0001R4\u0010§\u0001\u001a \u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060¤\u0001j\u000f\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006`¥\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b#\u0010¦\u0001¨\u0006¨\u0001"}, d2 = {"LZF/a;", "", "LOE/q;", "sugarcube", "Ljava/util/UUID;", "sceneUuid", "", "sceneDeprecatedId", "compositionUuid", "<init>", "(LOE/q;Ljava/util/UUID;ILjava/util/UUID;)V", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "Lcom/sugarcube/app/base/data/analytics/ProductParentType;", "parentType", "", "textureTranscodeTimeMillis", "Lcom/sugarcube/app/base/data/model/DecorateViewMode;", "zoomMode", "LRF/j;", "viewport", "Lcom/sugarcube/app/base/data/analytics/CatalogItemSource;", "addedFrom", "placementLatencyMS", "", "placementFailureReason", "", "error", "placementType", "placementResult", "LXH/N;", "d", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/app/base/data/analytics/ProductParentType;JLcom/sugarcube/app/base/data/model/DecorateViewMode;LRF/j;Lcom/sugarcube/app/base/data/analytics/CatalogItemSource;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "Lcom/sugarcube/app/base/data/analytics/ChangeType;", "changeType", "j", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/app/base/data/analytics/ChangeType;LRF/j;)V", "p", "()V", "loadTimeMillis", "o", "(J)V", "errorMessage", "m", "(Ljava/lang/String;)V", "n", "q", "(LRF/j;)V", "l", "designName", "M", "H", "(Ljava/lang/String;Lcom/sugarcube/app/base/data/model/DecorateViewMode;LRF/j;)V", "Q", "v", "x", "w", "k", "y", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LRF/j;)V", "K", "newItem", "oldItem", "Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$a;", "variantType", "S", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$a;Lcom/sugarcube/app/base/data/analytics/ProductParentType;JLcom/sugarcube/app/base/data/model/DecorateViewMode;LRF/j;)V", "LRF/k;", "inst", "isFirstInstance", "isLoadingDesign", "z", "(LRF/k;JZZLRF/j;)V", "P", "(LRF/k;Lcom/sugarcube/app/base/data/analytics/ProductParentType;LRF/j;)V", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "startXF", "endXF", "usedRotationWidget", "L", "(LRF/k;Lcom/sugarcube/decorate_engine/ModelScreenTransform;Lcom/sugarcube/decorate_engine/ModelScreenTransform;ZLcom/sugarcube/app/base/data/analytics/ProductParentType;Lcom/sugarcube/app/base/data/model/DecorateViewMode;LRF/j;)V", "h", "R", "i", "Lcom/sugarcube/app/base/data/analytics/MethodType;", "methodType", "U", "(Lcom/sugarcube/app/base/data/model/DecorateViewMode;Lcom/sugarcube/app/base/data/analytics/MethodType;LRF/j;)V", "A", "E", "G", "I", "(LRF/j;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "products", "B", "(Ljava/lang/String;LRF/j;)V", "D", "F", "J", "C", "s", "u", "t", "T", "(Lcom/sugarcube/app/base/data/model/DecorateViewMode;LRF/j;)V", "V", "W", "N", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "e", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/app/base/data/model/DecorateViewMode;)V", "", "items", "c", "(Ljava/util/List;)V", "name", "", "value", "context", "r", "(Ljava/lang/String;DLjava/lang/String;)V", "swappedOutItem", "Lcom/sugarcube/core/network/models/SmartaPlacementResult;", "g", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate/v1/internal/v1/adapters/ItemVariantAdapter$a;Lcom/sugarcube/app/base/data/analytics/ProductParentType;Lcom/sugarcube/app/base/data/model/DecorateViewMode;LRF/j;Lcom/sugarcube/app/base/data/analytics/CatalogItemSource;Lcom/sugarcube/core/network/models/SmartaPlacementResult;)V", "O", "f", "a", "LOE/q;", "getSugarcube", "()LOE/q;", "b", "Ljava/util/UUID;", "getSceneUuid", "()Ljava/util/UUID;", "getSceneDeprecatedId", "()I", "a0", "(I)V", "X", "(Ljava/util/UUID;)V", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "getAnalytics", "()Lcom/sugarcube/app/base/data/analytics/Analytics;", "analytics", "Z", "getSceneIsStock", "()Z", "b0", "(Z)V", "sceneIsStock", "isNewDesign", "Y", "Ljava/lang/String;", "getSceneName", "()Ljava/lang/String;", "c0", "sceneName", "Lcom/sugarcube/app/base/data/analytics/RoomSource;", "Lcom/sugarcube/app/base/data/analytics/RoomSource;", "()Lcom/sugarcube/app/base/data/analytics/RoomSource;", "(Lcom/sugarcube/app/base/data/analytics/RoomSource;)V", "roomSource", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "engineErrors", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZF.a  reason: case insensitive filesystem */
public final class C16942a {

    /* renamed from: k  reason: collision with root package name */
    public static final C3441a f140620k = new C3441a((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f140621l = 8;

    /* renamed from: a  reason: collision with root package name */
    private final q f140622a;

    /* renamed from: b  reason: collision with root package name */
    private final UUID f140623b;

    /* renamed from: c  reason: collision with root package name */
    private int f140624c;

    /* renamed from: d  reason: collision with root package name */
    private UUID f140625d;

    /* renamed from: e  reason: collision with root package name */
    private final Analytics f140626e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f140627f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f140628g = true;

    /* renamed from: h  reason: collision with root package name */
    private String f140629h = "UNNAMED";

    /* renamed from: i  reason: collision with root package name */
    private RoomSource f140630i = RoomSource.UserCaptured;

    /* renamed from: j  reason: collision with root package name */
    private final HashMap<String, Integer> f140631j = new HashMap<>();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LZF/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_ENGINE_REPEATED_ERROR_COUNT", "I", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZF.a$a  reason: collision with other inner class name */
    public static final class C3441a {
        public /* synthetic */ C3441a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3441a() {
        }
    }

    public C16942a(q qVar, UUID uuid, int i10, UUID uuid2) {
        C17542s.j(qVar, "sugarcube");
        C17542s.j(uuid, "sceneUuid");
        C17542s.j(uuid2, "compositionUuid");
        this.f140622a = qVar;
        this.f140623b = uuid;
        this.f140624c = i10;
        this.f140625d = uuid2;
        this.f140626e = qVar.b();
    }

    private final void d(CachedCatalogItem cachedCatalogItem, ProductParentType productParentType, long j10, DecorateViewMode decorateViewMode, j jVar, CatalogItemSource catalogItemSource, Long l10, String str, boolean z10, String str2, String str3) {
        Analytics analytics = this.f140626e;
        String str4 = this.f140629h;
        int i10 = this.f140624c;
        UUID uuid = this.f140623b;
        int id2 = cachedCatalogItem.getId();
        String localItemNumber = cachedCatalogItem.getCatalogItem().getLocalItemNumber();
        if (localItemNumber == null) {
            localItemNumber = "";
        }
        analytics.designRoomAddProduct(str4, i10, uuid, 0.0d, id2, localItemNumber, cachedCatalogItem.getName(), cachedCatalogItem.getProductType(), this.f140630i, this.f140625d, productParentType, decorateViewMode, jVar.j(), catalogItemSource, l10, str, str3, str2, cachedCatalogItem.getFurnitureType(), this.f140622a.getRegion());
    }

    private final void j(CachedCatalogItem cachedCatalogItem, ChangeType changeType, j jVar) {
        Analytics analytics = this.f140626e;
        int id2 = cachedCatalogItem.getId();
        String name = cachedCatalogItem.getName();
        ProductType productType = cachedCatalogItem.getProductType();
        String localItemNumber = cachedCatalogItem.getCatalogItem().getLocalItemNumber();
        if (localItemNumber == null) {
            localItemNumber = "";
        }
        analytics.designRoomChangeProduct(changeType, id2, name, productType, localItemNumber, jVar.j(), cachedCatalogItem.getFurnitureType());
    }

    public final void A(j jVar) {
        C17542s.j(jVar, "viewport");
        this.f140626e.designMenuAdd(this.f140629h, this.f140624c, this.f140623b, this.f140630i, jVar.j());
    }

    public final void B(String str, j jVar) {
        C17542s.j(str, "products");
        C17542s.j(jVar, "viewport");
        this.f140626e.designMenuAddToBag(this.f140629h, this.f140624c, this.f140623b, str, this.f140630i, jVar.j());
    }

    public final void C(j jVar, CachedCatalogItem cachedCatalogItem) {
        FurnitureType furnitureType;
        C17542s.j(jVar, "viewport");
        if (cachedCatalogItem == null || (furnitureType = cachedCatalogItem.getFurnitureType()) == null) {
            furnitureType = FurnitureType.Furniture;
        }
        this.f140626e.designMenuDuplicateItem(this.f140629h, this.f140624c, this.f140623b, jVar.j(), furnitureType);
    }

    public final void D(j jVar) {
        C17542s.j(jVar, "viewport");
        this.f140626e.designMenuErase(this.f140629h, this.f140624c, this.f140623b, jVar.j());
    }

    public final void E(j jVar) {
        C17542s.j(jVar, "viewport");
        this.f140626e.designMenuGoesWellWith(this.f140629h, this.f140624c, this.f140623b, this.f140630i, jVar.j());
    }

    public final void F(j jVar, CachedCatalogItem cachedCatalogItem) {
        FurnitureType furnitureType;
        C17542s.j(jVar, "viewport");
        if (cachedCatalogItem == null || (furnitureType = cachedCatalogItem.getFurnitureType()) == null) {
            furnitureType = FurnitureType.Furniture;
        }
        this.f140626e.designMenuInfo(this.f140629h, this.f140624c, this.f140623b, jVar.j(), furnitureType);
    }

    public final void G(j jVar) {
        C17542s.j(jVar, "viewport");
        this.f140626e.designMenuRotate(this.f140629h, this.f140624c, this.f140623b, this.f140630i, jVar.j());
    }

    public final void H(String str, DecorateViewMode decorateViewMode, j jVar) {
        C17542s.j(decorateViewMode, "zoomMode");
        C17542s.j(jVar, "viewport");
        this.f140626e.designMenuSave(this.f140629h, this.f140624c, this.f140623b, this.f140630i, this.f140625d, str, decorateViewMode, jVar.j());
    }

    public final void I(j jVar, CachedCatalogItem cachedCatalogItem) {
        FurnitureType furnitureType;
        C17542s.j(jVar, "viewport");
        if (cachedCatalogItem == null || (furnitureType = cachedCatalogItem.getFurnitureType()) == null) {
            furnitureType = FurnitureType.Furniture;
        }
        this.f140626e.designMenuSwap(this.f140629h, this.f140624c, this.f140623b, this.f140630i, jVar.j(), furnitureType);
    }

    public final void J(j jVar) {
        C17542s.j(jVar, "viewport");
        this.f140626e.designMenuViews(this.f140629h, this.f140624c, this.f140623b, jVar.j());
    }

    public final void K(CachedCatalogItem cachedCatalogItem, j jVar) {
        C17542s.j(cachedCatalogItem, "item");
        C17542s.j(jVar, "viewport");
        j(cachedCatalogItem, ChangeType.MIRROR, jVar);
    }

    public final void L(k kVar, ModelScreenTransform modelScreenTransform, ModelScreenTransform modelScreenTransform2, boolean z10, ProductParentType productParentType, DecorateViewMode decorateViewMode, j jVar) {
        ModelScreenTransform modelScreenTransform3 = modelScreenTransform;
        ModelScreenTransform modelScreenTransform4 = modelScreenTransform2;
        C17542s.j(kVar, "inst");
        C17542s.j(modelScreenTransform3, "startXF");
        C17542s.j(modelScreenTransform4, "endXF");
        C17542s.j(productParentType, "parentType");
        C17542s.j(decorateViewMode, "zoomMode");
        C17542s.j(jVar, "viewport");
        CachedCatalogItem d10 = kVar.d();
        float f10 = modelScreenTransform4.screenX;
        float f11 = modelScreenTransform3.screenX;
        boolean z11 = (f10 == f11 && modelScreenTransform4.screenY == modelScreenTransform3.screenY) ? false : true;
        boolean z12 = modelScreenTransform4.yawRadians == modelScreenTransform3.yawRadians;
        if (z11) {
            Float[] fArr = {Float.valueOf(f11), Float.valueOf(modelScreenTransform3.screenY), Float.valueOf(0.0f)};
            Float[] fArr2 = {Float.valueOf(modelScreenTransform4.screenX), Float.valueOf(modelScreenTransform4.screenY), Float.valueOf(0.0f)};
            Analytics analytics = this.f140626e;
            String str = this.f140629h;
            int i10 = this.f140624c;
            UUID uuid = this.f140623b;
            int id2 = d10.getId();
            String localItemNumber = d10.getCatalogItem().getLocalItemNumber();
            if (localItemNumber == null) {
                localItemNumber = "";
            }
            analytics.designRoomMoveProduct(str, i10, uuid, fArr, fArr2, id2, localItemNumber, d10.getName(), d10.getProductType(), this.f140630i, this.f140625d, productParentType, decorateViewMode, jVar.j(), d10.getFurnitureType());
        }
        if (!z12) {
            float yawDegrees = modelScreenTransform.getYawDegrees();
            float yawDegrees2 = modelScreenTransform2.getYawDegrees();
            Analytics analytics2 = this.f140626e;
            String str2 = this.f140629h;
            int i11 = this.f140624c;
            UUID uuid2 = this.f140623b;
            int id3 = d10.getId();
            String localItemNumber2 = d10.getCatalogItem().getLocalItemNumber();
            analytics2.designRoomRotateProduct(str2, i11, uuid2, yawDegrees, yawDegrees2, id3, localItemNumber2 == null ? "" : localItemNumber2, d10.getName(), d10.getProductType(), this.f140630i, this.f140625d, productParentType, decorateViewMode, jVar.j(), d10.getFurnitureType());
        }
    }

    public final void M(String str) {
        C17542s.j(str, "designName");
    }

    public final void N(CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "item");
        this.f140626e.designPipAddToBag(this.f140629h, this.f140624c, this.f140623b, this.f140630i, cachedCatalogItem, cachedCatalogItem.getFurnitureType());
    }

    public final void O(CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "item");
        this.f140626e.designPipAddToFav(this.f140629h, this.f140624c, this.f140623b, this.f140630i, cachedCatalogItem, cachedCatalogItem.getFurnitureType());
    }

    public final void P(k kVar, ProductParentType productParentType, j jVar) {
        C17542s.j(kVar, "inst");
        C17542s.j(productParentType, "parentType");
        C17542s.j(jVar, "viewport");
        CachedCatalogItem d10 = kVar.d();
        Analytics analytics = this.f140626e;
        String str = this.f140629h;
        int i10 = this.f140624c;
        UUID uuid = this.f140623b;
        int id2 = d10.getId();
        String localItemNumber = d10.getCatalogItem().getLocalItemNumber();
        if (localItemNumber == null) {
            localItemNumber = "";
        }
        analytics.designMenuRemove(str, i10, uuid, id2, localItemNumber, d10.getName(), d10.getProductType(), this.f140630i, productParentType, jVar.j(), d10.getFurnitureType());
    }

    public final void Q(String str) {
        C17542s.j(str, "designName");
        this.f140626e.designRoomSave(this.f140629h, this.f140624c, this.f140623b, this.f140625d, str, this.f140628g, this.f140630i);
    }

    public final void R() {
        this.f140626e.designSearchExit(this.f140629h, this.f140624c, this.f140623b, this.f140630i);
    }

    public final void S(CachedCatalogItem cachedCatalogItem, CachedCatalogItem cachedCatalogItem2, ItemVariantAdapter.a aVar, ProductParentType productParentType, long j10, DecorateViewMode decorateViewMode, j jVar) {
        C17542s.j(cachedCatalogItem, "newItem");
        C17542s.j(cachedCatalogItem2, "oldItem");
        C17542s.j(productParentType, "parentType");
        C17542s.j(decorateViewMode, "zoomMode");
        C17542s.j(jVar, "viewport");
        Analytics analytics = this.f140626e;
        String str = this.f140629h;
        int i10 = this.f140624c;
        UUID uuid = this.f140623b;
        int id2 = cachedCatalogItem2.getId();
        String name = cachedCatalogItem2.getName();
        ProductType productType = cachedCatalogItem2.getProductType();
        int id3 = cachedCatalogItem.getId();
        String localItemNumber = cachedCatalogItem.getCatalogItem().getLocalItemNumber();
        if (localItemNumber == null) {
            localItemNumber = "";
        }
        String str2 = localItemNumber;
        String name2 = cachedCatalogItem.getName();
        ProductType productType2 = cachedCatalogItem.getProductType();
        RoomSource roomSource = this.f140630i;
        analytics.designRoomSwapProduct(str, i10, uuid, id2, name, productType, 0.0f, 0.0f, id3, str2, name2, productType2, roomSource, this.f140625d, (aVar == null ? ItemVariantAdapter.a.NONE : aVar).name(), productParentType, decorateViewMode, jVar.j(), cachedCatalogItem.getFurnitureType());
    }

    public final void T(DecorateViewMode decorateViewMode, j jVar) {
        C17542s.j(decorateViewMode, "zoomMode");
        C17542s.j(jVar, "viewport");
        this.f140626e.designRoomZoomIn("ZoomIn", decorateViewMode, jVar.j());
    }

    public final void U(DecorateViewMode decorateViewMode, MethodType methodType, j jVar) {
        C17542s.j(decorateViewMode, "zoomMode");
        C17542s.j(methodType, "methodType");
        C17542s.j(jVar, "viewport");
        if (decorateViewMode == DecorateViewMode.RoomMode) {
            this.f140626e.designRoomExitPOI(methodType, jVar.j());
        } else {
            this.f140626e.designRoomEnterPOI(methodType, jVar.j());
        }
    }

    public final void V(DecorateViewMode decorateViewMode, j jVar) {
        C17542s.j(decorateViewMode, "zoomMode");
        C17542s.j(jVar, "viewport");
        this.f140626e.designRoomZoomOut("ZoomOut", decorateViewMode, jVar.j());
    }

    public final void W(j jVar) {
        C17542s.j(jVar, "viewport");
        this.f140626e.designRoomZoomPan(jVar.j());
    }

    public final void X(UUID uuid) {
        C17542s.j(uuid, "<set-?>");
        this.f140625d = uuid;
    }

    public final void Y(boolean z10) {
        this.f140628g = z10;
    }

    public final void Z(RoomSource roomSource) {
        C17542s.j(roomSource, "<set-?>");
        this.f140630i = roomSource;
    }

    public final UUID a() {
        return this.f140625d;
    }

    public final void a0(int i10) {
        this.f140624c = i10;
    }

    public final RoomSource b() {
        return this.f140630i;
    }

    public final void b0(boolean z10) {
        this.f140627f = z10;
    }

    public final void c(List<CachedCatalogItem> list) {
        C17542s.j(list, "items");
        this.f140626e.designBuyScreenAddAllToBag(this.f140629h, this.f140624c, this.f140623b, this.f140630i, list);
    }

    public final void c0(String str) {
        C17542s.j(str, "<set-?>");
        this.f140629h = str;
    }

    public final void e(CachedCatalogItem cachedCatalogItem, DecorateViewMode decorateViewMode) {
        C17542s.j(cachedCatalogItem, "item");
        C17542s.j(decorateViewMode, "zoomMode");
        this.f140626e.designBuyScreenAddToBag(this.f140629h, this.f140624c, this.f140623b, this.f140630i, cachedCatalogItem, decorateViewMode, cachedCatalogItem.getFurnitureType());
    }

    public final void f(CachedCatalogItem cachedCatalogItem, DecorateViewMode decorateViewMode) {
        C17542s.j(cachedCatalogItem, "item");
        C17542s.j(decorateViewMode, "zoomMode");
        this.f140626e.designBuyScreenAddToFav(this.f140629h, this.f140624c, this.f140623b, this.f140630i, cachedCatalogItem, decorateViewMode, cachedCatalogItem.getFurnitureType());
    }

    public final void g(CachedCatalogItem cachedCatalogItem, CachedCatalogItem cachedCatalogItem2, ItemVariantAdapter.a aVar, ProductParentType productParentType, DecorateViewMode decorateViewMode, j jVar, CatalogItemSource catalogItemSource, SmartaPlacementResult smartaPlacementResult) {
        C17542s.j(cachedCatalogItem, "newItem");
        C17542s.j(productParentType, "parentType");
        C17542s.j(decorateViewMode, "zoomMode");
        C17542s.j(jVar, "viewport");
        C17542s.j(catalogItemSource, "addedFrom");
        if (cachedCatalogItem2 != null) {
            S(cachedCatalogItem, cachedCatalogItem2, aVar, productParentType, 0, decorateViewMode, jVar);
            return;
        }
        String str = null;
        Long latency = smartaPlacementResult != null ? smartaPlacementResult.getLatency() : null;
        boolean z10 = smartaPlacementResult != null && smartaPlacementResult.getError();
        String errorMessage = smartaPlacementResult != null ? smartaPlacementResult.getErrorMessage() : null;
        String str2 = smartaPlacementResult != null ? "Smarta" : "Default";
        if (smartaPlacementResult != null) {
            str = smartaPlacementResult.getResult();
        }
        if (str == null) {
            str = "";
        }
        d(cachedCatalogItem, productParentType, 0, decorateViewMode, jVar, catalogItemSource, latency, errorMessage, z10, str2, str);
    }

    public final void h() {
        this.f140626e.catalogBrowse(this.f140629h, this.f140624c, this.f140623b, this.f140630i);
    }

    public final void i() {
        this.f140626e.catalogSearchClear(this.f140629h, this.f140624c, this.f140623b, this.f140630i);
    }

    public final void k(j jVar) {
        C17542s.j(jVar, "viewport");
        this.f140626e.designViewsChangeView(this.f140629h, this.f140623b, this.f140624c, jVar.j());
    }

    public final void l(j jVar) {
        C17542s.j(jVar, "viewport");
        this.f140626e.designRoomExit(this.f140629h, this.f140624c, this.f140623b, this.f140630i, jVar.j());
    }

    public final void m(String str) {
        String value;
        C17542s.j(str, "errorMessage");
        int i10 = 0;
        C15846l d10 = C15850p.d(new C15850p(".*\\)"), str, 0, 2, (Object) null);
        if (d10 == null || (value = d10.getValue()) == null) {
            Log.e("AnalyticsReporter", "Error doesn't conform to expected key structure:\n" + str);
            return;
        }
        Integer num = this.f140631j.get(value);
        if ((num != null ? num.intValue() : 0) < 4) {
            this.f140626e.designDecorationError(this.f140629h, this.f140623b, this.f140624c, this.f140622a.getRegion(), this.f140630i, str);
        } else {
            Log.w("AnalyticsReporter", "Suppressed error (" + value + ") because it exceeded MAX_ENGINE_REPEATED_ERROR_COUNT (4)");
        }
        HashMap<String, Integer> hashMap = this.f140631j;
        Integer num2 = hashMap.get(value);
        if (num2 != null) {
            i10 = num2.intValue();
        }
        hashMap.put(value, Integer.valueOf(i10 + 1));
    }

    public final void n() {
        boolean z10 = false;
        String str = "Clean-up report:\n";
        for (Map.Entry next : this.f140631j.entrySet()) {
            String str2 = (String) next.getKey();
            int intValue = ((Number) next.getValue()).intValue();
            if (intValue > 4) {
                str = str + "error: " + str2 + " (count: " + intValue + ")\n";
                z10 = true;
            }
        }
        if (z10) {
            this.f140626e.designDecorationError(this.f140629h, this.f140623b, this.f140624c, this.f140622a.getRegion(), this.f140630i, str);
        }
    }

    public final void o(long j10) {
        this.f140626e.designOpenStart(this.f140629h, this.f140624c, this.f140623b, this.f140630i, j10);
    }

    public final void p() {
    }

    public final void q(j jVar) {
        C17542s.j(jVar, "viewport");
        this.f140626e.designRoomExit(this.f140629h, this.f140624c, this.f140623b, this.f140630i, jVar.j());
    }

    public final void r(String str, double d10, String str2) {
        C17542s.j(str, "name");
        this.f140626e.engineMetric(str, d10, str2);
    }

    public final void s() {
        this.f140626e.designEraseMenuEraseAll(this.f140629h, this.f140624c, this.f140623b);
    }

    public final void t() {
        this.f140626e.designEraseMenuDone(this.f140629h, this.f140624c, this.f140623b, this.f140630i);
    }

    public final void u() {
        this.f140626e.designEraseMenuShowAll(this.f140629h, this.f140624c, this.f140623b);
    }

    public final void v() {
        Analytics.designExitPrompt$default(this.f140626e, this.f140629h, this.f140624c, this.f140623b, this.f140630i, false, false, 48, (Object) null);
    }

    public final void w() {
        Analytics.designExitPrompt$default(this.f140626e, this.f140629h, this.f140624c, this.f140623b, this.f140630i, true, false, 32, (Object) null);
    }

    public final void x() {
        Analytics.designExitPrompt$default(this.f140626e, this.f140629h, this.f140624c, this.f140623b, this.f140630i, false, true, 16, (Object) null);
    }

    public final void y(CachedCatalogItem cachedCatalogItem, j jVar) {
        C17542s.j(cachedCatalogItem, "item");
        C17542s.j(jVar, "viewport");
        j(cachedCatalogItem, ChangeType.SNAP_ROTATE_FLIP, jVar);
    }

    public final void z(k kVar, long j10, boolean z10, boolean z11, j jVar) {
        C17542s.j(kVar, "inst");
        C17542s.j(jVar, "viewport");
        CachedCatalogItem d10 = kVar.d();
        Analytics analytics = this.f140626e;
        int id2 = d10.getId();
        String localItemNumber = d10.getCatalogItem().getLocalItemNumber();
        if (localItemNumber == null) {
            localItemNumber = "";
        }
        String name = d10.getName();
        ProductType productType = d10.getProductType();
        String str = this.f140629h;
        int i10 = this.f140624c;
        analytics.designRoomProductLoadTime(id2, localItemNumber, name, productType, str, i10, this.f140623b, j10, this.f140630i, z10, z11, jVar.j(), d10.getFurnitureType());
    }
}
