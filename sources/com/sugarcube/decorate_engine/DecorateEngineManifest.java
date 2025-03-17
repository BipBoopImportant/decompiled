package com.sugarcube.decorate_engine;

import XH.C16814e;
import YH.C16877v;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.optimizely.ab.config.FeatureVariable;
import fK.p;
import fK.z;
import jK.C17451f;
import jK.T0;
import java.util.List;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\bF\b\b\u0018\u0000 p2\u00020\u0001:\u0002qpBµ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f¢\u0006\u0004\b\u0019\u0010\u001aBÇ\u0001\b\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ(\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"HÁ\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010+\u001a\u00020(H\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010/\u001a\u00020,H\u0000¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b6\u00105J\u0010\u00107\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b7\u00105J\u0010\u00108\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b8\u00105J\u0010\u00109\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b9\u00105J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b<\u00105J\u0010\u0010=\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b=\u00105J\u0010\u0010>\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b>\u00105J\u0010\u0010?\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b?\u00105J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00130\fHÆ\u0003¢\u0006\u0004\b@\u0010;J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00150\fHÆ\u0003¢\u0006\u0004\bA\u0010;J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00170\fHÆ\u0003¢\u0006\u0004\bB\u0010;J¾\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\fHÆ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020,HÖ\u0001¢\u0006\u0004\bE\u0010.J\u0010\u0010F\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bF\u00101J\u001a\u0010H\u001a\u00020(2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u00101\"\u0004\bL\u0010MR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010N\u001a\u0004\bO\u00103\"\u0004\bP\u0010QR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010R\u001a\u0004\bS\u00105\"\u0004\bT\u0010UR\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010R\u001a\u0004\bV\u00105\"\u0004\bW\u0010UR\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010R\u001a\u0004\bX\u00105\"\u0004\bY\u0010UR\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010R\u001a\u0004\bZ\u00105\"\u0004\b[\u0010UR\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010R\u001a\u0004\b\\\u00105\"\u0004\b]\u0010UR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010^\u001a\u0004\b_\u0010;\"\u0004\b`\u0010aR\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010R\u001a\u0004\bb\u00105\"\u0004\bc\u0010UR\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010R\u001a\u0004\bd\u00105\"\u0004\be\u0010UR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010R\u001a\u0004\bf\u00105\"\u0004\bg\u0010UR\"\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010R\u001a\u0004\bh\u00105\"\u0004\bi\u0010UR(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010^\u001a\u0004\bj\u0010;\"\u0004\bk\u0010aR(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010^\u001a\u0004\bl\u0010;\"\u0004\bm\u0010aR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010^\u001a\u0004\bn\u0010;\"\u0004\bo\u0010a¨\u0006r"}, d2 = {"Lcom/sugarcube/decorate_engine/DecorateEngineManifest;", "", "", "version", "Lcom/sugarcube/decorate_engine/ManifestIntrinsics;", "intrinsics", "Landroid/net/Uri;", "pano", "depthOcclusion", "segmentation", "segmentationOld", "equirectangular", "", "Lcom/sugarcube/decorate_engine/ManifestPlane;", "roomPlanes", "inpaintPano", "inpaintDepthOcclusion", "inpaintSegmentation", "inpaintSegmentationOld", "Lcom/sugarcube/decorate_engine/ManifestLight;", "lights", "Lcom/sugarcube/decorate_engine/StackingPolygon;", "stackingPolygons", "Lcom/sugarcube/decorate_engine/RoomPolygon;", "roomPolygons", "<init>", "(ILcom/sugarcube/decorate_engine/ManifestIntrinsics;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IILcom/sugarcube/decorate_engine/ManifestIntrinsics;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/DecorateEngineManifest;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "isEmpty$decorate_engine_release", "()Z", "isEmpty", "", "toJsonOrEmptyString$decorate_engine_release", "()Ljava/lang/String;", "toJsonOrEmptyString", "component1", "()I", "component2", "()Lcom/sugarcube/decorate_engine/ManifestIntrinsics;", "component3", "()Landroid/net/Uri;", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(ILcom/sugarcube/decorate_engine/ManifestIntrinsics;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sugarcube/decorate_engine/DecorateEngineManifest;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getVersion", "setVersion", "(I)V", "Lcom/sugarcube/decorate_engine/ManifestIntrinsics;", "getIntrinsics", "setIntrinsics", "(Lcom/sugarcube/decorate_engine/ManifestIntrinsics;)V", "Landroid/net/Uri;", "getPano", "setPano", "(Landroid/net/Uri;)V", "getDepthOcclusion", "setDepthOcclusion", "getSegmentation", "setSegmentation", "getSegmentationOld", "setSegmentationOld", "getEquirectangular", "setEquirectangular", "Ljava/util/List;", "getRoomPlanes", "setRoomPlanes", "(Ljava/util/List;)V", "getInpaintPano", "setInpaintPano", "getInpaintDepthOcclusion", "setInpaintDepthOcclusion", "getInpaintSegmentation", "setInpaintSegmentation", "getInpaintSegmentationOld", "setInpaintSegmentationOld", "getLights", "setLights", "getStackingPolygons", "setStackingPolygons", "getRoomPolygons", "setRoomPolygons", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DecorateEngineManifest {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new C17451f(ManifestPlane$$serializer.INSTANCE), null, null, null, null, new C17451f(ManifestLight$$serializer.INSTANCE), new C17451f(StackingPolygon$$serializer.INSTANCE), new C17451f(RoomPolygon$$serializer.INSTANCE)};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int kCurrentVersion = 3;
    private Uri depthOcclusion;
    private Uri equirectangular;
    private Uri inpaintDepthOcclusion;
    private Uri inpaintPano;
    private Uri inpaintSegmentation;
    private Uri inpaintSegmentationOld;
    private ManifestIntrinsics intrinsics;
    private List<ManifestLight> lights;
    private Uri pano;
    private List<ManifestPlane> roomPlanes;
    private List<RoomPolygon> roomPolygons;
    private Uri segmentation;
    private Uri segmentationOld;
    private List<StackingPolygon> stackingPolygons;
    private int version;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rHÆ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/decorate_engine/DecorateEngineManifest$Companion;", "", "()V", "kCurrentVersion", "", "getKCurrentVersion", "()I", "fromJson", "Lcom/sugarcube/decorate_engine/DecorateEngineManifest;", "json", "", "fromJson$decorate_engine_release", "serializer", "Lkotlinx/serialization/KSerializer;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DecorateEngineManifest fromJson$decorate_engine_release(String str) {
            C17542s.j(str, FeatureVariable.JSON_TYPE);
            if (str.length() <= 0) {
                return null;
            }
            C17514c.a aVar = C17514c.f144280d;
            KSerializer<Object> d10 = z.d(aVar.a(), P.f(DecorateEngineManifest.class));
            C17542s.h(d10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return (DecorateEngineManifest) aVar.c(d10, str);
        }

        public final int getKCurrentVersion() {
            return DecorateEngineManifest.kCurrentVersion;
        }

        public final KSerializer<DecorateEngineManifest> serializer() {
            return DecorateEngineManifest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DecorateEngineManifest() {
        this(0, (ManifestIntrinsics) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (List) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (List) null, (List) null, (List) null, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DecorateEngineManifest copy$default(DecorateEngineManifest decorateEngineManifest, int i10, ManifestIntrinsics manifestIntrinsics, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, List list, Uri uri6, Uri uri7, Uri uri8, Uri uri9, List list2, List list3, List list4, int i11, Object obj) {
        DecorateEngineManifest decorateEngineManifest2 = decorateEngineManifest;
        int i12 = i11;
        return decorateEngineManifest.copy((i12 & 1) != 0 ? decorateEngineManifest2.version : i10, (i12 & 2) != 0 ? decorateEngineManifest2.intrinsics : manifestIntrinsics, (i12 & 4) != 0 ? decorateEngineManifest2.pano : uri, (i12 & 8) != 0 ? decorateEngineManifest2.depthOcclusion : uri2, (i12 & 16) != 0 ? decorateEngineManifest2.segmentation : uri3, (i12 & 32) != 0 ? decorateEngineManifest2.segmentationOld : uri4, (i12 & 64) != 0 ? decorateEngineManifest2.equirectangular : uri5, (i12 & 128) != 0 ? decorateEngineManifest2.roomPlanes : list, (i12 & 256) != 0 ? decorateEngineManifest2.inpaintPano : uri6, (i12 & 512) != 0 ? decorateEngineManifest2.inpaintDepthOcclusion : uri7, (i12 & 1024) != 0 ? decorateEngineManifest2.inpaintSegmentation : uri8, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? decorateEngineManifest2.inpaintSegmentationOld : uri9, (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? decorateEngineManifest2.lights : list2, (i12 & 8192) != 0 ? decorateEngineManifest2.stackingPolygons : list3, (i12 & 16384) != 0 ? decorateEngineManifest2.roomPolygons : list4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        if (kotlin.jvm.internal.C17542s.e(r5, r7) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        if (kotlin.jvm.internal.C17542s.e(r5, r7) == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009b, code lost:
        if (kotlin.jvm.internal.C17542s.e(r5, r7) == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b7, code lost:
        if (kotlin.jvm.internal.C17542s.e(r5, r7) == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d3, code lost:
        if (kotlin.jvm.internal.C17542s.e(r5, r7) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010b, code lost:
        if (kotlin.jvm.internal.C17542s.e(r5, r7) == false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0128, code lost:
        if (kotlin.jvm.internal.C17542s.e(r5, r7) == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0145, code lost:
        if (kotlin.jvm.internal.C17542s.e(r5, r7) == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0162, code lost:
        if (kotlin.jvm.internal.C17542s.e(r5, r7) == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        if (kotlin.jvm.internal.C17542s.e(r5, r4) == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void write$Self$decorate_engine_release(com.sugarcube.decorate_engine.DecorateEngineManifest r20, iK.C17395d r21, kotlinx.serialization.descriptors.SerialDescriptor r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            kotlinx.serialization.KSerializer<java.lang.Object>[] r3 = $childSerializers
            r4 = 0
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            int r5 = r0.version
            int r6 = kCurrentVersion
            if (r5 == r6) goto L_0x001b
        L_0x0016:
            int r5 = r0.version
            r1.w(r2, r4, r5)
        L_0x001b:
            r4 = 1
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x0023
            goto L_0x0046
        L_0x0023:
            com.sugarcube.decorate_engine.ManifestIntrinsics r5 = r0.intrinsics
            com.sugarcube.decorate_engine.ManifestIntrinsics r15 = new com.sugarcube.decorate_engine.ManifestIntrinsics
            r17 = 63
            r18 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r19 = 0
            r6 = r15
            r4 = r15
            r15 = r16
            r16 = r19
            r6.<init>((double) r7, (double) r9, (double) r11, (double) r13, (int) r15, (int) r16, (int) r17, (kotlin.jvm.internal.DefaultConstructorMarker) r18)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r5, r4)
            if (r4 != 0) goto L_0x004e
        L_0x0046:
            com.sugarcube.decorate_engine.ManifestIntrinsics$$serializer r4 = com.sugarcube.decorate_engine.ManifestIntrinsics$$serializer.INSTANCE
            com.sugarcube.decorate_engine.ManifestIntrinsics r5 = r0.intrinsics
            r6 = 1
            r1.i(r2, r6, r4, r5)
        L_0x004e:
            r4 = 2
            boolean r5 = r1.z(r2, r4)
            java.lang.String r6 = "EMPTY"
            if (r5 == 0) goto L_0x0058
            goto L_0x0065
        L_0x0058:
            android.net.Uri r5 = r0.pano
            android.net.Uri r7 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r7, r6)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x006c
        L_0x0065:
            com.sugarcube.decorate_engine.UriSerializer r5 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            android.net.Uri r7 = r0.pano
            r1.i(r2, r4, r5, r7)
        L_0x006c:
            r4 = 3
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x0074
            goto L_0x0081
        L_0x0074:
            android.net.Uri r5 = r0.depthOcclusion
            android.net.Uri r7 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r7, r6)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x0088
        L_0x0081:
            com.sugarcube.decorate_engine.UriSerializer r5 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            android.net.Uri r7 = r0.depthOcclusion
            r1.i(r2, r4, r5, r7)
        L_0x0088:
            r4 = 4
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x0090
            goto L_0x009d
        L_0x0090:
            android.net.Uri r5 = r0.segmentation
            android.net.Uri r7 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r7, r6)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x00a4
        L_0x009d:
            com.sugarcube.decorate_engine.UriSerializer r5 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            android.net.Uri r7 = r0.segmentation
            r1.i(r2, r4, r5, r7)
        L_0x00a4:
            r4 = 5
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x00ac
            goto L_0x00b9
        L_0x00ac:
            android.net.Uri r5 = r0.segmentationOld
            android.net.Uri r7 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r7, r6)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x00c0
        L_0x00b9:
            com.sugarcube.decorate_engine.UriSerializer r5 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            android.net.Uri r7 = r0.segmentationOld
            r1.i(r2, r4, r5, r7)
        L_0x00c0:
            r4 = 6
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x00c8
            goto L_0x00d5
        L_0x00c8:
            android.net.Uri r5 = r0.equirectangular
            android.net.Uri r7 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r7, r6)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x00dc
        L_0x00d5:
            com.sugarcube.decorate_engine.UriSerializer r5 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            android.net.Uri r7 = r0.equirectangular
            r1.i(r2, r4, r5, r7)
        L_0x00dc:
            r4 = 7
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x00e4
            goto L_0x00f0
        L_0x00e4:
            java.util.List<com.sugarcube.decorate_engine.ManifestPlane> r5 = r0.roomPlanes
            java.util.List r7 = YH.C16877v.n()
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x00f7
        L_0x00f0:
            r5 = r3[r4]
            java.util.List<com.sugarcube.decorate_engine.ManifestPlane> r7 = r0.roomPlanes
            r1.i(r2, r4, r5, r7)
        L_0x00f7:
            r4 = 8
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x0100
            goto L_0x010d
        L_0x0100:
            android.net.Uri r5 = r0.inpaintPano
            android.net.Uri r7 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r7, r6)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x0114
        L_0x010d:
            com.sugarcube.decorate_engine.UriSerializer r5 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            android.net.Uri r7 = r0.inpaintPano
            r1.i(r2, r4, r5, r7)
        L_0x0114:
            r4 = 9
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x011d
            goto L_0x012a
        L_0x011d:
            android.net.Uri r5 = r0.inpaintDepthOcclusion
            android.net.Uri r7 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r7, r6)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x0131
        L_0x012a:
            com.sugarcube.decorate_engine.UriSerializer r5 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            android.net.Uri r7 = r0.inpaintDepthOcclusion
            r1.i(r2, r4, r5, r7)
        L_0x0131:
            r4 = 10
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x013a
            goto L_0x0147
        L_0x013a:
            android.net.Uri r5 = r0.inpaintSegmentation
            android.net.Uri r7 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r7, r6)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x014e
        L_0x0147:
            com.sugarcube.decorate_engine.UriSerializer r5 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            android.net.Uri r7 = r0.inpaintSegmentation
            r1.i(r2, r4, r5, r7)
        L_0x014e:
            r4 = 11
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x0157
            goto L_0x0164
        L_0x0157:
            android.net.Uri r5 = r0.inpaintSegmentationOld
            android.net.Uri r7 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r7, r6)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x016b
        L_0x0164:
            com.sugarcube.decorate_engine.UriSerializer r5 = com.sugarcube.decorate_engine.UriSerializer.INSTANCE
            android.net.Uri r6 = r0.inpaintSegmentationOld
            r1.i(r2, r4, r5, r6)
        L_0x016b:
            r4 = 12
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x0174
            goto L_0x0180
        L_0x0174:
            java.util.List<com.sugarcube.decorate_engine.ManifestLight> r5 = r0.lights
            java.util.List r6 = YH.C16877v.n()
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r6)
            if (r5 != 0) goto L_0x0187
        L_0x0180:
            r5 = r3[r4]
            java.util.List<com.sugarcube.decorate_engine.ManifestLight> r6 = r0.lights
            r1.i(r2, r4, r5, r6)
        L_0x0187:
            r4 = 13
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x0190
            goto L_0x019c
        L_0x0190:
            java.util.List<com.sugarcube.decorate_engine.StackingPolygon> r5 = r0.stackingPolygons
            java.util.List r6 = YH.C16877v.n()
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r6)
            if (r5 != 0) goto L_0x01a3
        L_0x019c:
            r5 = r3[r4]
            java.util.List<com.sugarcube.decorate_engine.StackingPolygon> r6 = r0.stackingPolygons
            r1.i(r2, r4, r5, r6)
        L_0x01a3:
            r4 = 14
            boolean r5 = r1.z(r2, r4)
            if (r5 == 0) goto L_0x01ac
            goto L_0x01b8
        L_0x01ac:
            java.util.List<com.sugarcube.decorate_engine.RoomPolygon> r5 = r0.roomPolygons
            java.util.List r6 = YH.C16877v.n()
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r6)
            if (r5 != 0) goto L_0x01bf
        L_0x01b8:
            r3 = r3[r4]
            java.util.List<com.sugarcube.decorate_engine.RoomPolygon> r0 = r0.roomPolygons
            r1.i(r2, r4, r3, r0)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.DecorateEngineManifest.write$Self$decorate_engine_release(com.sugarcube.decorate_engine.DecorateEngineManifest, iK.d, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final int component1() {
        return this.version;
    }

    public final Uri component10() {
        return this.inpaintDepthOcclusion;
    }

    public final Uri component11() {
        return this.inpaintSegmentation;
    }

    public final Uri component12() {
        return this.inpaintSegmentationOld;
    }

    public final List<ManifestLight> component13() {
        return this.lights;
    }

    public final List<StackingPolygon> component14() {
        return this.stackingPolygons;
    }

    public final List<RoomPolygon> component15() {
        return this.roomPolygons;
    }

    public final ManifestIntrinsics component2() {
        return this.intrinsics;
    }

    public final Uri component3() {
        return this.pano;
    }

    public final Uri component4() {
        return this.depthOcclusion;
    }

    public final Uri component5() {
        return this.segmentation;
    }

    public final Uri component6() {
        return this.segmentationOld;
    }

    public final Uri component7() {
        return this.equirectangular;
    }

    public final List<ManifestPlane> component8() {
        return this.roomPlanes;
    }

    public final Uri component9() {
        return this.inpaintPano;
    }

    public final DecorateEngineManifest copy(int i10, ManifestIntrinsics manifestIntrinsics, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, List<ManifestPlane> list, Uri uri6, Uri uri7, Uri uri8, Uri uri9, List<ManifestLight> list2, List<StackingPolygon> list3, List<RoomPolygon> list4) {
        ManifestIntrinsics manifestIntrinsics2 = manifestIntrinsics;
        C17542s.j(manifestIntrinsics2, "intrinsics");
        Uri uri10 = uri;
        C17542s.j(uri10, "pano");
        Uri uri11 = uri2;
        C17542s.j(uri11, "depthOcclusion");
        Uri uri12 = uri3;
        C17542s.j(uri12, "segmentation");
        Uri uri13 = uri4;
        C17542s.j(uri13, "segmentationOld");
        Uri uri14 = uri5;
        C17542s.j(uri14, "equirectangular");
        List<ManifestPlane> list5 = list;
        C17542s.j(list5, "roomPlanes");
        Uri uri15 = uri6;
        C17542s.j(uri15, "inpaintPano");
        Uri uri16 = uri7;
        C17542s.j(uri16, "inpaintDepthOcclusion");
        Uri uri17 = uri8;
        C17542s.j(uri17, "inpaintSegmentation");
        Uri uri18 = uri9;
        C17542s.j(uri18, "inpaintSegmentationOld");
        List<ManifestLight> list6 = list2;
        C17542s.j(list6, "lights");
        List<StackingPolygon> list7 = list3;
        C17542s.j(list7, "stackingPolygons");
        C17542s.j(list4, "roomPolygons");
        return new DecorateEngineManifest(i10, manifestIntrinsics2, uri10, uri11, uri12, uri13, uri14, list5, uri15, uri16, uri17, uri18, list6, list7, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecorateEngineManifest)) {
            return false;
        }
        DecorateEngineManifest decorateEngineManifest = (DecorateEngineManifest) obj;
        return this.version == decorateEngineManifest.version && C17542s.e(this.intrinsics, decorateEngineManifest.intrinsics) && C17542s.e(this.pano, decorateEngineManifest.pano) && C17542s.e(this.depthOcclusion, decorateEngineManifest.depthOcclusion) && C17542s.e(this.segmentation, decorateEngineManifest.segmentation) && C17542s.e(this.segmentationOld, decorateEngineManifest.segmentationOld) && C17542s.e(this.equirectangular, decorateEngineManifest.equirectangular) && C17542s.e(this.roomPlanes, decorateEngineManifest.roomPlanes) && C17542s.e(this.inpaintPano, decorateEngineManifest.inpaintPano) && C17542s.e(this.inpaintDepthOcclusion, decorateEngineManifest.inpaintDepthOcclusion) && C17542s.e(this.inpaintSegmentation, decorateEngineManifest.inpaintSegmentation) && C17542s.e(this.inpaintSegmentationOld, decorateEngineManifest.inpaintSegmentationOld) && C17542s.e(this.lights, decorateEngineManifest.lights) && C17542s.e(this.stackingPolygons, decorateEngineManifest.stackingPolygons) && C17542s.e(this.roomPolygons, decorateEngineManifest.roomPolygons);
    }

    public final Uri getDepthOcclusion() {
        return this.depthOcclusion;
    }

    public final Uri getEquirectangular() {
        return this.equirectangular;
    }

    public final Uri getInpaintDepthOcclusion() {
        return this.inpaintDepthOcclusion;
    }

    public final Uri getInpaintPano() {
        return this.inpaintPano;
    }

    public final Uri getInpaintSegmentation() {
        return this.inpaintSegmentation;
    }

    public final Uri getInpaintSegmentationOld() {
        return this.inpaintSegmentationOld;
    }

    public final ManifestIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final List<ManifestLight> getLights() {
        return this.lights;
    }

    public final Uri getPano() {
        return this.pano;
    }

    public final List<ManifestPlane> getRoomPlanes() {
        return this.roomPlanes;
    }

    public final List<RoomPolygon> getRoomPolygons() {
        return this.roomPolygons;
    }

    public final Uri getSegmentation() {
        return this.segmentation;
    }

    public final Uri getSegmentationOld() {
        return this.segmentationOld;
    }

    public final List<StackingPolygon> getStackingPolygons() {
        return this.stackingPolygons;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Integer.hashCode(this.version) * 31) + this.intrinsics.hashCode()) * 31) + this.pano.hashCode()) * 31) + this.depthOcclusion.hashCode()) * 31) + this.segmentation.hashCode()) * 31) + this.segmentationOld.hashCode()) * 31) + this.equirectangular.hashCode()) * 31) + this.roomPlanes.hashCode()) * 31) + this.inpaintPano.hashCode()) * 31) + this.inpaintDepthOcclusion.hashCode()) * 31) + this.inpaintSegmentation.hashCode()) * 31) + this.inpaintSegmentationOld.hashCode()) * 31) + this.lights.hashCode()) * 31) + this.stackingPolygons.hashCode()) * 31) + this.roomPolygons.hashCode();
    }

    public final boolean isEmpty$decorate_engine_release() {
        return C17542s.e(this.pano, Uri.EMPTY);
    }

    public final void setDepthOcclusion(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.depthOcclusion = uri;
    }

    public final void setEquirectangular(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.equirectangular = uri;
    }

    public final void setInpaintDepthOcclusion(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.inpaintDepthOcclusion = uri;
    }

    public final void setInpaintPano(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.inpaintPano = uri;
    }

    public final void setInpaintSegmentation(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.inpaintSegmentation = uri;
    }

    public final void setInpaintSegmentationOld(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.inpaintSegmentationOld = uri;
    }

    public final void setIntrinsics(ManifestIntrinsics manifestIntrinsics) {
        C17542s.j(manifestIntrinsics, "<set-?>");
        this.intrinsics = manifestIntrinsics;
    }

    public final void setLights(List<ManifestLight> list) {
        C17542s.j(list, "<set-?>");
        this.lights = list;
    }

    public final void setPano(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.pano = uri;
    }

    public final void setRoomPlanes(List<ManifestPlane> list) {
        C17542s.j(list, "<set-?>");
        this.roomPlanes = list;
    }

    public final void setRoomPolygons(List<RoomPolygon> list) {
        C17542s.j(list, "<set-?>");
        this.roomPolygons = list;
    }

    public final void setSegmentation(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.segmentation = uri;
    }

    public final void setSegmentationOld(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.segmentationOld = uri;
    }

    public final void setStackingPolygons(List<StackingPolygon> list) {
        C17542s.j(list, "<set-?>");
        this.stackingPolygons = list;
    }

    public final void setVersion(int i10) {
        this.version = i10;
    }

    public final String toJsonOrEmptyString$decorate_engine_release() {
        if (isEmpty$decorate_engine_release()) {
            return "";
        }
        C17514c json = ConfiguredEncoder.Companion.getJson();
        KSerializer<Object> d10 = z.d(json.a(), P.l(DecorateEngineManifest.class));
        C17542s.h(d10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return json.b(d10, this);
    }

    public String toString() {
        int i10 = this.version;
        ManifestIntrinsics manifestIntrinsics = this.intrinsics;
        Uri uri = this.pano;
        Uri uri2 = this.depthOcclusion;
        Uri uri3 = this.segmentation;
        Uri uri4 = this.segmentationOld;
        Uri uri5 = this.equirectangular;
        List<ManifestPlane> list = this.roomPlanes;
        Uri uri6 = this.inpaintPano;
        Uri uri7 = this.inpaintDepthOcclusion;
        Uri uri8 = this.inpaintSegmentation;
        Uri uri9 = this.inpaintSegmentationOld;
        List<ManifestLight> list2 = this.lights;
        List<StackingPolygon> list3 = this.stackingPolygons;
        List<RoomPolygon> list4 = this.roomPolygons;
        return "DecorateEngineManifest(version=" + i10 + ", intrinsics=" + manifestIntrinsics + ", pano=" + uri + ", depthOcclusion=" + uri2 + ", segmentation=" + uri3 + ", segmentationOld=" + uri4 + ", equirectangular=" + uri5 + ", roomPlanes=" + list + ", inpaintPano=" + uri6 + ", inpaintDepthOcclusion=" + uri7 + ", inpaintSegmentation=" + uri8 + ", inpaintSegmentationOld=" + uri9 + ", lights=" + list2 + ", stackingPolygons=" + list3 + ", roomPolygons=" + list4 + ")";
    }

    @C16814e
    public /* synthetic */ DecorateEngineManifest(int i10, int i11, ManifestIntrinsics manifestIntrinsics, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, List list, Uri uri6, Uri uri7, Uri uri8, Uri uri9, List list2, List list3, List list4, T0 t02) {
        int i12;
        ManifestIntrinsics manifestIntrinsics2;
        Uri uri10;
        Uri uri11;
        Uri uri12;
        Uri uri13;
        Uri uri14;
        List list5;
        Uri uri15;
        Uri uri16;
        Uri uri17;
        Uri uri18;
        List list6;
        List list7;
        List list8;
        int i13 = i10;
        if ((i13 & 1) == 0) {
            i12 = kCurrentVersion;
        } else {
            i12 = i11;
        }
        this.version = i12;
        if ((i13 & 2) == 0) {
            manifestIntrinsics2 = new ManifestIntrinsics(0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 63, (DefaultConstructorMarker) null);
        } else {
            manifestIntrinsics2 = manifestIntrinsics;
        }
        this.intrinsics = manifestIntrinsics2;
        if ((i13 & 4) == 0) {
            uri10 = Uri.EMPTY;
            C17542s.i(uri10, "EMPTY");
        } else {
            uri10 = uri;
        }
        this.pano = uri10;
        if ((i13 & 8) == 0) {
            uri11 = Uri.EMPTY;
            C17542s.i(uri11, "EMPTY");
        } else {
            uri11 = uri2;
        }
        this.depthOcclusion = uri11;
        if ((i13 & 16) == 0) {
            uri12 = Uri.EMPTY;
            C17542s.i(uri12, "EMPTY");
        } else {
            uri12 = uri3;
        }
        this.segmentation = uri12;
        if ((i13 & 32) == 0) {
            uri13 = Uri.EMPTY;
            C17542s.i(uri13, "EMPTY");
        } else {
            uri13 = uri4;
        }
        this.segmentationOld = uri13;
        if ((i13 & 64) == 0) {
            uri14 = Uri.EMPTY;
            C17542s.i(uri14, "EMPTY");
        } else {
            uri14 = uri5;
        }
        this.equirectangular = uri14;
        if ((i13 & 128) == 0) {
            list5 = C16877v.n();
        } else {
            list5 = list;
        }
        this.roomPlanes = list5;
        if ((i13 & 256) == 0) {
            uri15 = Uri.EMPTY;
            C17542s.i(uri15, "EMPTY");
        } else {
            uri15 = uri6;
        }
        this.inpaintPano = uri15;
        if ((i13 & 512) == 0) {
            uri16 = Uri.EMPTY;
            C17542s.i(uri16, "EMPTY");
        } else {
            uri16 = uri7;
        }
        this.inpaintDepthOcclusion = uri16;
        if ((i13 & 1024) == 0) {
            uri17 = Uri.EMPTY;
            C17542s.i(uri17, "EMPTY");
        } else {
            uri17 = uri8;
        }
        this.inpaintSegmentation = uri17;
        if ((i13 & RecyclerView.n.FLAG_MOVED) == 0) {
            uri18 = Uri.EMPTY;
            C17542s.i(uri18, "EMPTY");
        } else {
            uri18 = uri9;
        }
        this.inpaintSegmentationOld = uri18;
        if ((i13 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            list6 = C16877v.n();
        } else {
            list6 = list2;
        }
        this.lights = list6;
        if ((i13 & 8192) == 0) {
            list7 = C16877v.n();
        } else {
            list7 = list3;
        }
        this.stackingPolygons = list7;
        if ((i13 & 16384) == 0) {
            list8 = C16877v.n();
        } else {
            list8 = list4;
        }
        this.roomPolygons = list8;
    }

    public DecorateEngineManifest(int i10, ManifestIntrinsics manifestIntrinsics, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, List<ManifestPlane> list, Uri uri6, Uri uri7, Uri uri8, Uri uri9, List<ManifestLight> list2, List<StackingPolygon> list3, List<RoomPolygon> list4) {
        ManifestIntrinsics manifestIntrinsics2 = manifestIntrinsics;
        Uri uri10 = uri;
        Uri uri11 = uri2;
        Uri uri12 = uri3;
        Uri uri13 = uri4;
        Uri uri14 = uri5;
        List<ManifestPlane> list5 = list;
        Uri uri15 = uri6;
        Uri uri16 = uri7;
        Uri uri17 = uri8;
        Uri uri18 = uri9;
        List<ManifestLight> list6 = list2;
        List<StackingPolygon> list7 = list3;
        List<RoomPolygon> list8 = list4;
        C17542s.j(manifestIntrinsics2, "intrinsics");
        C17542s.j(uri10, "pano");
        C17542s.j(uri11, "depthOcclusion");
        C17542s.j(uri12, "segmentation");
        C17542s.j(uri13, "segmentationOld");
        C17542s.j(uri14, "equirectangular");
        C17542s.j(list5, "roomPlanes");
        C17542s.j(uri15, "inpaintPano");
        C17542s.j(uri16, "inpaintDepthOcclusion");
        C17542s.j(uri17, "inpaintSegmentation");
        C17542s.j(uri18, "inpaintSegmentationOld");
        C17542s.j(list6, "lights");
        C17542s.j(list7, "stackingPolygons");
        C17542s.j(list8, "roomPolygons");
        this.version = i10;
        this.intrinsics = manifestIntrinsics2;
        this.pano = uri10;
        this.depthOcclusion = uri11;
        this.segmentation = uri12;
        this.segmentationOld = uri13;
        this.equirectangular = uri14;
        this.roomPlanes = list5;
        this.inpaintPano = uri15;
        this.inpaintDepthOcclusion = uri16;
        this.inpaintSegmentation = uri17;
        this.inpaintSegmentationOld = uri18;
        this.lights = list6;
        this.stackingPolygons = list7;
        this.roomPolygons = list8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DecorateEngineManifest(int r17, com.sugarcube.decorate_engine.ManifestIntrinsics r18, android.net.Uri r19, android.net.Uri r20, android.net.Uri r21, android.net.Uri r22, android.net.Uri r23, java.util.List r24, android.net.Uri r25, android.net.Uri r26, android.net.Uri r27, android.net.Uri r28, java.util.List r29, java.util.List r30, java.util.List r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            int r1 = kCurrentVersion
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0023
            com.sugarcube.decorate_engine.ManifestIntrinsics r2 = new com.sugarcube.decorate_engine.ManifestIntrinsics
            r14 = 63
            r15 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r3 = r2
            r3.<init>((double) r4, (double) r6, (double) r8, (double) r10, (int) r12, (int) r13, (int) r14, (kotlin.jvm.internal.DefaultConstructorMarker) r15)
            goto L_0x0025
        L_0x0023:
            r2 = r18
        L_0x0025:
            r3 = r0 & 4
            java.lang.String r4 = "EMPTY"
            if (r3 == 0) goto L_0x0031
            android.net.Uri r3 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r3, r4)
            goto L_0x0033
        L_0x0031:
            r3 = r19
        L_0x0033:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x003d
            android.net.Uri r5 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r5, r4)
            goto L_0x003f
        L_0x003d:
            r5 = r20
        L_0x003f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0049
            android.net.Uri r6 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r6, r4)
            goto L_0x004b
        L_0x0049:
            r6 = r21
        L_0x004b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0055
            android.net.Uri r7 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r7, r4)
            goto L_0x0057
        L_0x0055:
            r7 = r22
        L_0x0057:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0061
            android.net.Uri r8 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r8, r4)
            goto L_0x0063
        L_0x0061:
            r8 = r23
        L_0x0063:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x006c
            java.util.List r9 = YH.C16877v.n()
            goto L_0x006e
        L_0x006c:
            r9 = r24
        L_0x006e:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0078
            android.net.Uri r10 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r10, r4)
            goto L_0x007a
        L_0x0078:
            r10 = r25
        L_0x007a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0084
            android.net.Uri r11 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r11, r4)
            goto L_0x0086
        L_0x0084:
            r11 = r26
        L_0x0086:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0090
            android.net.Uri r12 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r12, r4)
            goto L_0x0092
        L_0x0090:
            r12 = r27
        L_0x0092:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x009c
            android.net.Uri r13 = android.net.Uri.EMPTY
            kotlin.jvm.internal.C17542s.i(r13, r4)
            goto L_0x009e
        L_0x009c:
            r13 = r28
        L_0x009e:
            r4 = r0 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x00a7
            java.util.List r4 = YH.C16877v.n()
            goto L_0x00a9
        L_0x00a7:
            r4 = r29
        L_0x00a9:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x00b2
            java.util.List r14 = YH.C16877v.n()
            goto L_0x00b4
        L_0x00b2:
            r14 = r30
        L_0x00b4:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x00bd
            java.util.List r0 = YH.C16877v.n()
            goto L_0x00bf
        L_0x00bd:
            r0 = r31
        L_0x00bf:
            r17 = r16
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r4
            r31 = r14
            r32 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.DecorateEngineManifest.<init>(int, com.sugarcube.decorate_engine.ManifestIntrinsics, android.net.Uri, android.net.Uri, android.net.Uri, android.net.Uri, android.net.Uri, java.util.List, android.net.Uri, android.net.Uri, android.net.Uri, android.net.Uri, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
