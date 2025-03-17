package com.sugarcube.decorate_engine;

import XH.C16814e;
import YH.C16877v;
import androidx.recyclerview.widget.RecyclerView;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17446c0;
import jK.C17451f;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bP\b\b\u0018\u0000 {2\u00020\u0001:\u0002|{B©\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013j\u0002`\u0014\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0018\u00010\t¢\u0006\u0004\b\u001e\u0010\u001fB\u0002\b\u0011\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\u001e\u0010\u0016\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013j\u0002`\u0014\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\t\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0018\u00010\t\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J(\u0010,\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'HÁ\u0001¢\u0006\u0004\b*\u0010+J\u0015\u0010/\u001a\u00020)2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b9\u00108J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b<\u0010;J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b=\u0010;J\u0018\u0010>\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b>\u0010;J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b?\u0010;J$\u0010@\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014HÆ\u0003¢\u0006\u0004\b@\u0010AJ(\u0010B\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013j\u0002`\u0014\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bB\u0010;J\u0012\u0010C\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0018\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bE\u0010;J\u0018\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bF\u0010;J\u001e\u0010G\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bG\u0010;J\u001e\u0010H\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bH\u0010;J²\u0002\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t2\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013j\u0002`\u0014\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\t2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0018\u00010\t2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0018\u00010\tHÆ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bK\u00104J\u0010\u0010L\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bL\u00108J\u001a\u0010N\u001a\u00020\u00042\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bN\u0010OR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u00104\"\u0004\bR\u0010SR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010T\u001a\u0004\b\u0005\u00106\"\u0004\bU\u0010VR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010W\u001a\u0004\bX\u00108\"\u0004\bY\u0010ZR\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010W\u001a\u0004\b[\u00108\"\u0004\b\\\u0010ZR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010]\u001a\u0004\b^\u0010;\"\u0004\b_\u0010`R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010]\u001a\u0004\ba\u0010;\"\u0004\bb\u0010`R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010]\u001a\u0004\bc\u0010;\"\u0004\bd\u0010`R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010]\u001a\u0004\be\u0010;\"\u0004\bf\u0010`R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010]\u001a\u0004\bg\u0010;\"\u0004\bh\u0010`R6\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010i\u001a\u0004\bj\u0010A\"\u0004\bk\u0010lR:\u0010\u0016\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013j\u0002`\u0014\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010]\u001a\u0004\bm\u0010;\"\u0004\bn\u0010`R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010o\u001a\u0004\bp\u0010D\"\u0004\bq\u0010rR*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010]\u001a\u0004\bs\u0010;\"\u0004\bt\u0010`R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010]\u001a\u0004\bu\u0010;\"\u0004\bv\u0010`R0\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010]\u001a\u0004\bw\u0010;\"\u0004\bx\u0010`R0\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010]\u001a\u0004\by\u0010;\"\u0004\bz\u0010`¨\u0006}"}, d2 = {"Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;", "", "", "assetPath", "", "isPlaceholder", "", "featureFlags", "productId", "", "", "boxMin", "boxMax", "Lcom/sugarcube/decorate_engine/StackingPolygon;", "stackingPolygons", "Lcom/sugarcube/decorate_engine/CombinableSlot;", "combinableSlots", "Lcom/sugarcube/decorate_engine/CombinableSocketSet;", "socketSets", "", "Lcom/sugarcube/decorate_engine/CombinableSocketId;", "socketMeta", "plugs", "Lcom/sugarcube/decorate_engine/CombinablePlugRules;", "plugRules", "Lcom/sugarcube/decorate_engine/PlaceableAnchor;", "anchors", "stackableSetIndices", "stackingPolygonAlternatives", "combinations", "<init>", "(Ljava/lang/String;ZIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/sugarcube/decorate_engine/CombinablePlugRules;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;ZIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/sugarcube/decorate_engine/CombinablePlugRules;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sugarcube/decorate_engine/FeatureFlagBit;", "flag", "addFeatureFlag", "(Lcom/sugarcube/decorate_engine/FeatureFlagBit;)V", "hasFeatureFlag", "(Lcom/sugarcube/decorate_engine/FeatureFlagBit;)Z", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()I", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/Map;", "component11", "component12", "()Lcom/sugarcube/decorate_engine/CombinablePlugRules;", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;ZIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/sugarcube/decorate_engine/CombinablePlugRules;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAssetPath", "setAssetPath", "(Ljava/lang/String;)V", "Z", "setPlaceholder", "(Z)V", "I", "getFeatureFlags", "setFeatureFlags", "(I)V", "getProductId", "setProductId", "Ljava/util/List;", "getBoxMin", "setBoxMin", "(Ljava/util/List;)V", "getBoxMax", "setBoxMax", "getStackingPolygons", "setStackingPolygons", "getCombinableSlots", "setCombinableSlots", "getSocketSets", "setSocketSets", "Ljava/util/Map;", "getSocketMeta", "setSocketMeta", "(Ljava/util/Map;)V", "getPlugs", "setPlugs", "Lcom/sugarcube/decorate_engine/CombinablePlugRules;", "getPlugRules", "setPlugRules", "(Lcom/sugarcube/decorate_engine/CombinablePlugRules;)V", "getAnchors", "setAnchors", "getStackableSetIndices", "setStackableSetIndices", "getStackingPolygonAlternatives", "setStackingPolygonAlternatives", "getCombinations", "setCombinations", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SceneLayoutAssetItem {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private List<PlaceableAnchor> anchors;
    private String assetPath;
    private List<Double> boxMax;
    private List<Double> boxMin;
    private List<CombinableSlot> combinableSlots;
    private List<? extends List<Integer>> combinations;
    private int featureFlags;
    private boolean isPlaceholder;
    private CombinablePlugRules plugRules;
    private List<? extends Map<String, String>> plugs;
    private int productId;
    private Map<String, String> socketMeta;
    private List<CombinableSocketSet> socketSets;
    private List<Integer> stackableSetIndices;
    private List<? extends List<StackingPolygon>> stackingPolygonAlternatives;
    private List<StackingPolygon> stackingPolygons;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/SceneLayoutAssetItem;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SceneLayoutAssetItem> serializer() {
            return SceneLayoutAssetItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C17438C c10 = C17438C.f144010a;
        C17451f fVar = new C17451f(c10);
        C17451f fVar2 = new C17451f(c10);
        StackingPolygon$$serializer stackingPolygon$$serializer = StackingPolygon$$serializer.INSTANCE;
        C17451f fVar3 = new C17451f(stackingPolygon$$serializer);
        C17451f fVar4 = new C17451f(CombinableSlot$$serializer.INSTANCE);
        C17451f fVar5 = new C17451f(CombinableSocketSet$$serializer.INSTANCE);
        Y0 y02 = Y0.f144077a;
        C17446c0 c0Var = new C17446c0(y02, y02);
        C17451f fVar6 = new C17451f(new C17446c0(y02, y02));
        C17451f fVar7 = new C17451f(PlaceableAnchor$$serializer.INSTANCE);
        X x10 = X.f144073a;
        $childSerializers = new KSerializer[]{null, null, null, null, fVar, fVar2, fVar3, fVar4, fVar5, c0Var, fVar6, null, fVar7, new C17451f(x10), new C17451f(new C17451f(stackingPolygon$$serializer)), new C17451f(new C17451f(x10))};
    }

    public SceneLayoutAssetItem() {
        this((String) null, false, 0, 0, (List) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (List) null, (CombinablePlugRules) null, (List) null, (List) null, (List) null, (List) null, 65535, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SceneLayoutAssetItem copy$default(SceneLayoutAssetItem sceneLayoutAssetItem, String str, boolean z10, int i10, int i11, List list, List list2, List list3, List list4, List list5, Map map, List list6, CombinablePlugRules combinablePlugRules, List list7, List list8, List list9, List list10, int i12, Object obj) {
        SceneLayoutAssetItem sceneLayoutAssetItem2 = sceneLayoutAssetItem;
        int i13 = i12;
        return sceneLayoutAssetItem.copy((i13 & 1) != 0 ? sceneLayoutAssetItem2.assetPath : str, (i13 & 2) != 0 ? sceneLayoutAssetItem2.isPlaceholder : z10, (i13 & 4) != 0 ? sceneLayoutAssetItem2.featureFlags : i10, (i13 & 8) != 0 ? sceneLayoutAssetItem2.productId : i11, (i13 & 16) != 0 ? sceneLayoutAssetItem2.boxMin : list, (i13 & 32) != 0 ? sceneLayoutAssetItem2.boxMax : list2, (i13 & 64) != 0 ? sceneLayoutAssetItem2.stackingPolygons : list3, (i13 & 128) != 0 ? sceneLayoutAssetItem2.combinableSlots : list4, (i13 & 256) != 0 ? sceneLayoutAssetItem2.socketSets : list5, (i13 & 512) != 0 ? sceneLayoutAssetItem2.socketMeta : map, (i13 & 1024) != 0 ? sceneLayoutAssetItem2.plugs : list6, (i13 & RecyclerView.n.FLAG_MOVED) != 0 ? sceneLayoutAssetItem2.plugRules : combinablePlugRules, (i13 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? sceneLayoutAssetItem2.anchors : list7, (i13 & 8192) != 0 ? sceneLayoutAssetItem2.stackableSetIndices : list8, (i13 & 16384) != 0 ? sceneLayoutAssetItem2.stackingPolygonAlternatives : list9, (i13 & 32768) != 0 ? sceneLayoutAssetItem2.combinations : list10);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(SceneLayoutAssetItem sceneLayoutAssetItem, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (dVar.z(serialDescriptor, 0) || !C17542s.e(sceneLayoutAssetItem.assetPath, "")) {
            dVar.y(serialDescriptor, 0, sceneLayoutAssetItem.assetPath);
        }
        if (dVar.z(serialDescriptor, 1) || sceneLayoutAssetItem.isPlaceholder) {
            dVar.x(serialDescriptor, 1, sceneLayoutAssetItem.isPlaceholder);
        }
        if (dVar.z(serialDescriptor, 2) || sceneLayoutAssetItem.featureFlags != 0) {
            dVar.w(serialDescriptor, 2, sceneLayoutAssetItem.featureFlags);
        }
        if (dVar.z(serialDescriptor, 3) || sceneLayoutAssetItem.productId != 0) {
            dVar.w(serialDescriptor, 3, sceneLayoutAssetItem.productId);
        }
        if (dVar.z(serialDescriptor, 4) || !C17542s.e(sceneLayoutAssetItem.boxMin, C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)))) {
            dVar.B(serialDescriptor, 4, kSerializerArr[4], sceneLayoutAssetItem.boxMin);
        }
        if (dVar.z(serialDescriptor, 5) || !C17542s.e(sceneLayoutAssetItem.boxMax, C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)))) {
            dVar.B(serialDescriptor, 5, kSerializerArr[5], sceneLayoutAssetItem.boxMax);
        }
        if (dVar.z(serialDescriptor, 6) || !C17542s.e(sceneLayoutAssetItem.stackingPolygons, C16877v.n())) {
            dVar.B(serialDescriptor, 6, kSerializerArr[6], sceneLayoutAssetItem.stackingPolygons);
        }
        if (dVar.z(serialDescriptor, 7) || !C17542s.e(sceneLayoutAssetItem.combinableSlots, C16877v.n())) {
            dVar.B(serialDescriptor, 7, kSerializerArr[7], sceneLayoutAssetItem.combinableSlots);
        }
        if (dVar.z(serialDescriptor, 8) || sceneLayoutAssetItem.socketSets != null) {
            dVar.B(serialDescriptor, 8, kSerializerArr[8], sceneLayoutAssetItem.socketSets);
        }
        if (dVar.z(serialDescriptor, 9) || sceneLayoutAssetItem.socketMeta != null) {
            dVar.B(serialDescriptor, 9, kSerializerArr[9], sceneLayoutAssetItem.socketMeta);
        }
        if (dVar.z(serialDescriptor, 10) || sceneLayoutAssetItem.plugs != null) {
            dVar.B(serialDescriptor, 10, kSerializerArr[10], sceneLayoutAssetItem.plugs);
        }
        if (dVar.z(serialDescriptor, 11) || sceneLayoutAssetItem.plugRules != null) {
            dVar.B(serialDescriptor, 11, CombinablePlugRules$$serializer.INSTANCE, sceneLayoutAssetItem.plugRules);
        }
        if (dVar.z(serialDescriptor, 12) || sceneLayoutAssetItem.anchors != null) {
            dVar.B(serialDescriptor, 12, kSerializerArr[12], sceneLayoutAssetItem.anchors);
        }
        if (dVar.z(serialDescriptor, 13) || sceneLayoutAssetItem.stackableSetIndices != null) {
            dVar.B(serialDescriptor, 13, kSerializerArr[13], sceneLayoutAssetItem.stackableSetIndices);
        }
        if (dVar.z(serialDescriptor, 14) || sceneLayoutAssetItem.stackingPolygonAlternatives != null) {
            dVar.B(serialDescriptor, 14, kSerializerArr[14], sceneLayoutAssetItem.stackingPolygonAlternatives);
        }
        if (dVar.z(serialDescriptor, 15) || sceneLayoutAssetItem.combinations != null) {
            dVar.B(serialDescriptor, 15, kSerializerArr[15], sceneLayoutAssetItem.combinations);
        }
    }

    public final void addFeatureFlag(FeatureFlagBit featureFlagBit) {
        C17542s.j(featureFlagBit, "flag");
        this.featureFlags = featureFlagBit.getFlagBit() | this.featureFlags;
    }

    public final String component1() {
        return this.assetPath;
    }

    public final Map<String, String> component10() {
        return this.socketMeta;
    }

    public final List<Map<String, String>> component11() {
        return this.plugs;
    }

    public final CombinablePlugRules component12() {
        return this.plugRules;
    }

    public final List<PlaceableAnchor> component13() {
        return this.anchors;
    }

    public final List<Integer> component14() {
        return this.stackableSetIndices;
    }

    public final List<List<StackingPolygon>> component15() {
        return this.stackingPolygonAlternatives;
    }

    public final List<List<Integer>> component16() {
        return this.combinations;
    }

    public final boolean component2() {
        return this.isPlaceholder;
    }

    public final int component3() {
        return this.featureFlags;
    }

    public final int component4() {
        return this.productId;
    }

    public final List<Double> component5() {
        return this.boxMin;
    }

    public final List<Double> component6() {
        return this.boxMax;
    }

    public final List<StackingPolygon> component7() {
        return this.stackingPolygons;
    }

    public final List<CombinableSlot> component8() {
        return this.combinableSlots;
    }

    public final List<CombinableSocketSet> component9() {
        return this.socketSets;
    }

    public final SceneLayoutAssetItem copy(String str, boolean z10, int i10, int i11, List<Double> list, List<Double> list2, List<StackingPolygon> list3, List<CombinableSlot> list4, List<CombinableSocketSet> list5, Map<String, String> map, List<? extends Map<String, String>> list6, CombinablePlugRules combinablePlugRules, List<PlaceableAnchor> list7, List<Integer> list8, List<? extends List<StackingPolygon>> list9, List<? extends List<Integer>> list10) {
        String str2 = str;
        String str3 = str2;
        C17542s.j(str2, "assetPath");
        return new SceneLayoutAssetItem(str2, z10, i10, i11, list, list2, list3, list4, list5, map, list6, combinablePlugRules, list7, list8, list9, list10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SceneLayoutAssetItem)) {
            return false;
        }
        SceneLayoutAssetItem sceneLayoutAssetItem = (SceneLayoutAssetItem) obj;
        return C17542s.e(this.assetPath, sceneLayoutAssetItem.assetPath) && this.isPlaceholder == sceneLayoutAssetItem.isPlaceholder && this.featureFlags == sceneLayoutAssetItem.featureFlags && this.productId == sceneLayoutAssetItem.productId && C17542s.e(this.boxMin, sceneLayoutAssetItem.boxMin) && C17542s.e(this.boxMax, sceneLayoutAssetItem.boxMax) && C17542s.e(this.stackingPolygons, sceneLayoutAssetItem.stackingPolygons) && C17542s.e(this.combinableSlots, sceneLayoutAssetItem.combinableSlots) && C17542s.e(this.socketSets, sceneLayoutAssetItem.socketSets) && C17542s.e(this.socketMeta, sceneLayoutAssetItem.socketMeta) && C17542s.e(this.plugs, sceneLayoutAssetItem.plugs) && C17542s.e(this.plugRules, sceneLayoutAssetItem.plugRules) && C17542s.e(this.anchors, sceneLayoutAssetItem.anchors) && C17542s.e(this.stackableSetIndices, sceneLayoutAssetItem.stackableSetIndices) && C17542s.e(this.stackingPolygonAlternatives, sceneLayoutAssetItem.stackingPolygonAlternatives) && C17542s.e(this.combinations, sceneLayoutAssetItem.combinations);
    }

    public final List<PlaceableAnchor> getAnchors() {
        return this.anchors;
    }

    public final String getAssetPath() {
        return this.assetPath;
    }

    public final List<Double> getBoxMax() {
        return this.boxMax;
    }

    public final List<Double> getBoxMin() {
        return this.boxMin;
    }

    public final List<CombinableSlot> getCombinableSlots() {
        return this.combinableSlots;
    }

    public final List<List<Integer>> getCombinations() {
        return this.combinations;
    }

    public final int getFeatureFlags() {
        return this.featureFlags;
    }

    public final CombinablePlugRules getPlugRules() {
        return this.plugRules;
    }

    public final List<Map<String, String>> getPlugs() {
        return this.plugs;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final Map<String, String> getSocketMeta() {
        return this.socketMeta;
    }

    public final List<CombinableSocketSet> getSocketSets() {
        return this.socketSets;
    }

    public final List<Integer> getStackableSetIndices() {
        return this.stackableSetIndices;
    }

    public final List<List<StackingPolygon>> getStackingPolygonAlternatives() {
        return this.stackingPolygonAlternatives;
    }

    public final List<StackingPolygon> getStackingPolygons() {
        return this.stackingPolygons;
    }

    public final boolean hasFeatureFlag(FeatureFlagBit featureFlagBit) {
        C17542s.j(featureFlagBit, "flag");
        return (featureFlagBit.getFlagBit() & this.featureFlags) != 0;
    }

    public int hashCode() {
        int hashCode = ((((((this.assetPath.hashCode() * 31) + Boolean.hashCode(this.isPlaceholder)) * 31) + Integer.hashCode(this.featureFlags)) * 31) + Integer.hashCode(this.productId)) * 31;
        List<Double> list = this.boxMin;
        int i10 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Double> list2 = this.boxMax;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<StackingPolygon> list3 = this.stackingPolygons;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<CombinableSlot> list4 = this.combinableSlots;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<CombinableSocketSet> list5 = this.socketSets;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Map<String, String> map = this.socketMeta;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        List<? extends Map<String, String>> list6 = this.plugs;
        int hashCode8 = (hashCode7 + (list6 == null ? 0 : list6.hashCode())) * 31;
        CombinablePlugRules combinablePlugRules = this.plugRules;
        int hashCode9 = (hashCode8 + (combinablePlugRules == null ? 0 : combinablePlugRules.hashCode())) * 31;
        List<PlaceableAnchor> list7 = this.anchors;
        int hashCode10 = (hashCode9 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<Integer> list8 = this.stackableSetIndices;
        int hashCode11 = (hashCode10 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<? extends List<StackingPolygon>> list9 = this.stackingPolygonAlternatives;
        int hashCode12 = (hashCode11 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<? extends List<Integer>> list10 = this.combinations;
        if (list10 != null) {
            i10 = list10.hashCode();
        }
        return hashCode12 + i10;
    }

    public final boolean isPlaceholder() {
        return this.isPlaceholder;
    }

    public final void setAnchors(List<PlaceableAnchor> list) {
        this.anchors = list;
    }

    public final void setAssetPath(String str) {
        C17542s.j(str, "<set-?>");
        this.assetPath = str;
    }

    public final void setBoxMax(List<Double> list) {
        this.boxMax = list;
    }

    public final void setBoxMin(List<Double> list) {
        this.boxMin = list;
    }

    public final void setCombinableSlots(List<CombinableSlot> list) {
        this.combinableSlots = list;
    }

    public final void setCombinations(List<? extends List<Integer>> list) {
        this.combinations = list;
    }

    public final void setFeatureFlags(int i10) {
        this.featureFlags = i10;
    }

    public final void setPlaceholder(boolean z10) {
        this.isPlaceholder = z10;
    }

    public final void setPlugRules(CombinablePlugRules combinablePlugRules) {
        this.plugRules = combinablePlugRules;
    }

    public final void setPlugs(List<? extends Map<String, String>> list) {
        this.plugs = list;
    }

    public final void setProductId(int i10) {
        this.productId = i10;
    }

    public final void setSocketMeta(Map<String, String> map) {
        this.socketMeta = map;
    }

    public final void setSocketSets(List<CombinableSocketSet> list) {
        this.socketSets = list;
    }

    public final void setStackableSetIndices(List<Integer> list) {
        this.stackableSetIndices = list;
    }

    public final void setStackingPolygonAlternatives(List<? extends List<StackingPolygon>> list) {
        this.stackingPolygonAlternatives = list;
    }

    public final void setStackingPolygons(List<StackingPolygon> list) {
        this.stackingPolygons = list;
    }

    public String toString() {
        String str = this.assetPath;
        boolean z10 = this.isPlaceholder;
        int i10 = this.featureFlags;
        int i11 = this.productId;
        List<Double> list = this.boxMin;
        List<Double> list2 = this.boxMax;
        List<StackingPolygon> list3 = this.stackingPolygons;
        List<CombinableSlot> list4 = this.combinableSlots;
        List<CombinableSocketSet> list5 = this.socketSets;
        Map<String, String> map = this.socketMeta;
        List<? extends Map<String, String>> list6 = this.plugs;
        CombinablePlugRules combinablePlugRules = this.plugRules;
        List<PlaceableAnchor> list7 = this.anchors;
        List<Integer> list8 = this.stackableSetIndices;
        List<? extends List<StackingPolygon>> list9 = this.stackingPolygonAlternatives;
        List<? extends List<Integer>> list10 = this.combinations;
        return "SceneLayoutAssetItem(assetPath=" + str + ", isPlaceholder=" + z10 + ", featureFlags=" + i10 + ", productId=" + i11 + ", boxMin=" + list + ", boxMax=" + list2 + ", stackingPolygons=" + list3 + ", combinableSlots=" + list4 + ", socketSets=" + list5 + ", socketMeta=" + map + ", plugs=" + list6 + ", plugRules=" + combinablePlugRules + ", anchors=" + list7 + ", stackableSetIndices=" + list8 + ", stackingPolygonAlternatives=" + list9 + ", combinations=" + list10 + ")";
    }

    @C16814e
    public /* synthetic */ SceneLayoutAssetItem(int i10, String str, boolean z10, int i11, int i12, List list, List list2, List list3, List list4, List list5, Map map, List list6, CombinablePlugRules combinablePlugRules, List list7, List list8, List list9, List list10, T0 t02) {
        String str2;
        List list11;
        List list12;
        List list13;
        List list14;
        int i13 = i10;
        if ((i13 & 1) == 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.assetPath = str2;
        if ((i13 & 2) == 0) {
            this.isPlaceholder = false;
        } else {
            this.isPlaceholder = z10;
        }
        if ((i13 & 4) == 0) {
            this.featureFlags = 0;
        } else {
            this.featureFlags = i11;
        }
        if ((i13 & 8) == 0) {
            this.productId = 0;
        } else {
            this.productId = i12;
        }
        if ((i13 & 16) == 0) {
            list11 = C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d));
        } else {
            list11 = list;
        }
        this.boxMin = list11;
        if ((i13 & 32) == 0) {
            list12 = C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d));
        } else {
            list12 = list2;
        }
        this.boxMax = list12;
        if ((i13 & 64) == 0) {
            list13 = C16877v.n();
        } else {
            list13 = list3;
        }
        this.stackingPolygons = list13;
        if ((i13 & 128) == 0) {
            list14 = C16877v.n();
        } else {
            list14 = list4;
        }
        this.combinableSlots = list14;
        if ((i13 & 256) == 0) {
            this.socketSets = null;
        } else {
            this.socketSets = list5;
        }
        if ((i13 & 512) == 0) {
            this.socketMeta = null;
        } else {
            this.socketMeta = map;
        }
        if ((i13 & 1024) == 0) {
            this.plugs = null;
        } else {
            this.plugs = list6;
        }
        if ((i13 & RecyclerView.n.FLAG_MOVED) == 0) {
            this.plugRules = null;
        } else {
            this.plugRules = combinablePlugRules;
        }
        if ((i13 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.anchors = null;
        } else {
            this.anchors = list7;
        }
        if ((i13 & 8192) == 0) {
            this.stackableSetIndices = null;
        } else {
            this.stackableSetIndices = list8;
        }
        if ((i13 & 16384) == 0) {
            this.stackingPolygonAlternatives = null;
        } else {
            this.stackingPolygonAlternatives = list9;
        }
        if ((i13 & 32768) == 0) {
            this.combinations = null;
        } else {
            this.combinations = list10;
        }
    }

    public SceneLayoutAssetItem(String str, boolean z10, int i10, int i11, List<Double> list, List<Double> list2, List<StackingPolygon> list3, List<CombinableSlot> list4, List<CombinableSocketSet> list5, Map<String, String> map, List<? extends Map<String, String>> list6, CombinablePlugRules combinablePlugRules, List<PlaceableAnchor> list7, List<Integer> list8, List<? extends List<StackingPolygon>> list9, List<? extends List<Integer>> list10) {
        C17542s.j(str, "assetPath");
        this.assetPath = str;
        this.isPlaceholder = z10;
        this.featureFlags = i10;
        this.productId = i11;
        this.boxMin = list;
        this.boxMax = list2;
        this.stackingPolygons = list3;
        this.combinableSlots = list4;
        this.socketSets = list5;
        this.socketMeta = map;
        this.plugs = list6;
        this.plugRules = combinablePlugRules;
        this.anchors = list7;
        this.stackableSetIndices = list8;
        this.stackingPolygonAlternatives = list9;
        this.combinations = list10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SceneLayoutAssetItem(java.lang.String r18, boolean r19, int r20, int r21, java.util.List r22, java.util.List r23, java.util.List r24, java.util.List r25, java.util.List r26, java.util.Map r27, java.util.List r28, com.sugarcube.decorate_engine.CombinablePlugRules r29, java.util.List r30, java.util.List r31, java.util.List r32, java.util.List r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r17 = this;
            r0 = r34
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = ""
            goto L_0x000b
        L_0x0009:
            r1 = r18
        L_0x000b:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0012
            r2 = r3
            goto L_0x0014
        L_0x0012:
            r2 = r19
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r3
            goto L_0x001c
        L_0x001a:
            r4 = r20
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r3 = r21
        L_0x0023:
            r5 = r0 & 16
            r6 = 0
            if (r5 == 0) goto L_0x003e
            java.lang.Double r5 = java.lang.Double.valueOf(r6)
            java.lang.Double r8 = java.lang.Double.valueOf(r6)
            java.lang.Double r9 = java.lang.Double.valueOf(r6)
            java.lang.Double[] r5 = new java.lang.Double[]{r5, r8, r9}
            java.util.List r5 = YH.C16877v.q(r5)
            goto L_0x0040
        L_0x003e:
            r5 = r22
        L_0x0040:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0059
            java.lang.Double r8 = java.lang.Double.valueOf(r6)
            java.lang.Double r9 = java.lang.Double.valueOf(r6)
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            java.lang.Double[] r6 = new java.lang.Double[]{r8, r9, r6}
            java.util.List r6 = YH.C16877v.q(r6)
            goto L_0x005b
        L_0x0059:
            r6 = r23
        L_0x005b:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0064
            java.util.List r7 = YH.C16877v.n()
            goto L_0x0066
        L_0x0064:
            r7 = r24
        L_0x0066:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x006f
            java.util.List r8 = YH.C16877v.n()
            goto L_0x0071
        L_0x006f:
            r8 = r25
        L_0x0071:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0077
            r9 = 0
            goto L_0x0079
        L_0x0077:
            r9 = r26
        L_0x0079:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x007f
            r11 = 0
            goto L_0x0081
        L_0x007f:
            r11 = r27
        L_0x0081:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0087
            r12 = 0
            goto L_0x0089
        L_0x0087:
            r12 = r28
        L_0x0089:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x008f
            r13 = 0
            goto L_0x0091
        L_0x008f:
            r13 = r29
        L_0x0091:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0097
            r14 = 0
            goto L_0x0099
        L_0x0097:
            r14 = r30
        L_0x0099:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x009f
            r15 = 0
            goto L_0x00a1
        L_0x009f:
            r15 = r31
        L_0x00a1:
            r10 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x00a7
            r10 = 0
            goto L_0x00a9
        L_0x00a7:
            r10 = r32
        L_0x00a9:
            r16 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r16
            if (r0 == 0) goto L_0x00b2
            r0 = 0
            goto L_0x00b4
        L_0x00b2:
            r0 = r33
        L_0x00b4:
            r18 = r17
            r19 = r1
            r20 = r2
            r21 = r4
            r22 = r3
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r33 = r10
            r34 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.SceneLayoutAssetItem.<init>(java.lang.String, boolean, int, int, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, java.util.List, com.sugarcube.decorate_engine.CombinablePlugRules, java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
