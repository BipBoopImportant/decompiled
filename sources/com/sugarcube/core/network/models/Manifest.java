package com.sugarcube.core.network.models;

import HJ.C15854t;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import mI.C17603a;
import uI.C18060i;
import uI.C18066o;
import uI.C18072u;
import vI.C18192e;
import vI.C18193f;
import vI.C18194g;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\bE\b\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0004\u0012\b\b\u0003\u0010\t\u001a\u00020\u0004\u0012\b\b\u0003\u0010\n\u001a\u00020\u0004\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f¢\u0006\u0004\b&\u0010\"J1\u0010+\u001a\u00020*2\"\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040'j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`(¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b1\u00100J\u0010\u00102\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b2\u00100J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u00100J\u0010\u00104\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b4\u00100J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u00100J\u0010\u00106\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u0010.J\u0010\u00109\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b9\u00100J\u0010\u0010:\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b:\u00100J\u0010\u0010;\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b;\u00100J\u0010\u0010<\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b<\u00100J\u0010\u0010=\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b=\u00100J\u0010\u0010>\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b>\u00100J\u0010\u0010?\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bC\u00100J\u0012\u0010D\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bF\u0010GJÚ\u0001\u0010H\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u00042\b\b\u0003\u0010\u000f\u001a\u00020\u00042\b\b\u0003\u0010\u0010\u001a\u00020\u00042\b\b\u0003\u0010\u0011\u001a\u00020\u00042\b\b\u0003\u0010\u0012\u001a\u00020\u00042\b\b\u0003\u0010\u0013\u001a\u00020\u00042\b\b\u0003\u0010\u0015\u001a\u00020\u00142\b\b\u0003\u0010\u0017\u001a\u00020\u00162\b\b\u0003\u0010\u0018\u001a\u00020\u00042\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0003\u0010\u001c\u001a\u00020\u001bHÆ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010K\u001a\u00020JHÖ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\bM\u0010GJ\u001a\u0010O\u001a\u00020#2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bO\u0010PR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010.\"\u0004\bS\u0010TR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010U\u001a\u0004\bV\u00100\"\u0004\bW\u0010XR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010U\u001a\u0004\bY\u00100\"\u0004\bZ\u0010XR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010U\u001a\u0004\b[\u00100\"\u0004\b\\\u0010XR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010U\u001a\u0004\b]\u00100\"\u0004\b^\u0010XR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010U\u001a\u0004\b_\u00100\"\u0004\b`\u0010XR\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010U\u001a\u0004\ba\u00100\"\u0004\bb\u0010XR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010c\u001a\u0004\bd\u00107\"\u0004\be\u0010fR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010Q\u001a\u0004\bg\u0010.\"\u0004\bh\u0010TR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010U\u001a\u0004\bi\u00100\"\u0004\bj\u0010XR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010U\u001a\u0004\bk\u00100\"\u0004\bl\u0010XR\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010U\u001a\u0004\bm\u00100\"\u0004\bn\u0010XR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010U\u001a\u0004\bo\u00100\"\u0004\bp\u0010XR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010U\u001a\u0004\bq\u00100\"\u0004\br\u0010XR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010U\u001a\u0004\bs\u00100\"\u0004\bt\u0010XR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010u\u001a\u0004\bv\u0010@\"\u0004\bw\u0010xR\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010y\u001a\u0004\bz\u0010B\"\u0004\b{\u0010|R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010U\u001a\u0004\b}\u00100\"\u0004\b~\u0010XR'\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0015\n\u0004\b\u001a\u0010\u001a\u0005\b\u0001\u0010E\"\u0006\b\u0001\u0010\u0001R&\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\b\u001c\u0010\u0001\u001a\u0005\b\u0001\u0010G\"\u0006\b\u0001\u0010\u0001R\u0013\u0010\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u0001\u00100R\u0013\u0010\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u0001\u00100R\u0013\u0010\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u0001\u00100R\u0013\u0010\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u0001\u00100¨\u0006\u0001"}, d2 = {"Lcom/sugarcube/core/network/models/Manifest;", "", "Lcom/sugarcube/core/network/models/PlanesData;", "planesData", "Landroid/net/Uri;", "panoOld", "panoWebp", "depthOcclusionOld", "depthOcclusionWebp", "segmentation", "segmentationOld", "Lcom/sugarcube/core/network/models/SegmentationMetaData;", "segmentationMeta", "inpaintPlanesData", "inpaintPanoOld", "inpaintPanoWebp", "inpaintDepthOcclusionOld", "inpaintDepthOcclusionWebp", "inpaintSegmentation", "inpaintSegmentationOld", "Lcom/sugarcube/core/network/models/LightingData;", "lightingData", "Lcom/sugarcube/core/network/models/IntrinsicsData;", "intrinsics", "equirectangular", "Lcom/sugarcube/core/network/models/PlanePolygonSet;", "planePolygonSet", "", "version", "<init>", "(Lcom/sugarcube/core/network/models/PlanesData;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Lcom/sugarcube/core/network/models/SegmentationMetaData;Lcom/sugarcube/core/network/models/PlanesData;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Lcom/sugarcube/core/network/models/LightingData;Lcom/sugarcube/core/network/models/IntrinsicsData;Landroid/net/Uri;Lcom/sugarcube/core/network/models/PlanePolygonSet;I)V", "", "LuI/i;", "getAllUriProperties", "()Ljava/util/List;", "", "isPreviewable", "()Z", "getAllValidUris", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "fromToMap", "LXH/N;", "replaceUris", "(Ljava/util/HashMap;)V", "component1", "()Lcom/sugarcube/core/network/models/PlanesData;", "component2", "()Landroid/net/Uri;", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/sugarcube/core/network/models/SegmentationMetaData;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Lcom/sugarcube/core/network/models/LightingData;", "component17", "()Lcom/sugarcube/core/network/models/IntrinsicsData;", "component18", "component19", "()Lcom/sugarcube/core/network/models/PlanePolygonSet;", "component20", "()I", "copy", "(Lcom/sugarcube/core/network/models/PlanesData;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Lcom/sugarcube/core/network/models/SegmentationMetaData;Lcom/sugarcube/core/network/models/PlanesData;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Lcom/sugarcube/core/network/models/LightingData;Lcom/sugarcube/core/network/models/IntrinsicsData;Landroid/net/Uri;Lcom/sugarcube/core/network/models/PlanePolygonSet;I)Lcom/sugarcube/core/network/models/Manifest;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sugarcube/core/network/models/PlanesData;", "getPlanesData", "setPlanesData", "(Lcom/sugarcube/core/network/models/PlanesData;)V", "Landroid/net/Uri;", "getPanoOld", "setPanoOld", "(Landroid/net/Uri;)V", "getPanoWebp", "setPanoWebp", "getDepthOcclusionOld", "setDepthOcclusionOld", "getDepthOcclusionWebp", "setDepthOcclusionWebp", "getSegmentation", "setSegmentation", "getSegmentationOld", "setSegmentationOld", "Lcom/sugarcube/core/network/models/SegmentationMetaData;", "getSegmentationMeta", "setSegmentationMeta", "(Lcom/sugarcube/core/network/models/SegmentationMetaData;)V", "getInpaintPlanesData", "setInpaintPlanesData", "getInpaintPanoOld", "setInpaintPanoOld", "getInpaintPanoWebp", "setInpaintPanoWebp", "getInpaintDepthOcclusionOld", "setInpaintDepthOcclusionOld", "getInpaintDepthOcclusionWebp", "setInpaintDepthOcclusionWebp", "getInpaintSegmentation", "setInpaintSegmentation", "getInpaintSegmentationOld", "setInpaintSegmentationOld", "Lcom/sugarcube/core/network/models/LightingData;", "getLightingData", "setLightingData", "(Lcom/sugarcube/core/network/models/LightingData;)V", "Lcom/sugarcube/core/network/models/IntrinsicsData;", "getIntrinsics", "setIntrinsics", "(Lcom/sugarcube/core/network/models/IntrinsicsData;)V", "getEquirectangular", "setEquirectangular", "Lcom/sugarcube/core/network/models/PlanePolygonSet;", "getPlanePolygonSet", "setPlanePolygonSet", "(Lcom/sugarcube/core/network/models/PlanePolygonSet;)V", "I", "getVersion", "setVersion", "(I)V", "getPano", "pano", "getDepthOcclusion", "depthOcclusion", "getInpaintPano", "inpaintPano", "getInpaintDepthOcclusion", "inpaintDepthOcclusion", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class Manifest {
    private Uri depthOcclusionOld;
    private Uri depthOcclusionWebp;
    private Uri equirectangular;
    private Uri inpaintDepthOcclusionOld;
    private Uri inpaintDepthOcclusionWebp;
    private Uri inpaintPanoOld;
    private Uri inpaintPanoWebp;
    private PlanesData inpaintPlanesData;
    private Uri inpaintSegmentation;
    private Uri inpaintSegmentationOld;
    private IntrinsicsData intrinsics;
    private LightingData lightingData;
    private Uri panoOld;
    private Uri panoWebp;
    private PlanePolygonSet planePolygonSet;
    private PlanesData planesData;
    private Uri segmentation;
    private SegmentationMetaData segmentationMeta;
    private Uri segmentationOld;
    private int version;

    public Manifest() {
        this((PlanesData) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (SegmentationMetaData) null, (PlanesData) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (LightingData) null, (IntrinsicsData) null, (Uri) null, (PlanePolygonSet) null, 0, 1048575, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Manifest copy$default(Manifest manifest, PlanesData planesData2, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, SegmentationMetaData segmentationMetaData, PlanesData planesData3, Uri uri7, Uri uri8, Uri uri9, Uri uri10, Uri uri11, Uri uri12, LightingData lightingData2, IntrinsicsData intrinsicsData, Uri uri13, PlanePolygonSet planePolygonSet2, int i10, int i11, Object obj) {
        Manifest manifest2 = manifest;
        int i12 = i11;
        return manifest.copy((i12 & 1) != 0 ? manifest2.planesData : planesData2, (i12 & 2) != 0 ? manifest2.panoOld : uri, (i12 & 4) != 0 ? manifest2.panoWebp : uri2, (i12 & 8) != 0 ? manifest2.depthOcclusionOld : uri3, (i12 & 16) != 0 ? manifest2.depthOcclusionWebp : uri4, (i12 & 32) != 0 ? manifest2.segmentation : uri5, (i12 & 64) != 0 ? manifest2.segmentationOld : uri6, (i12 & 128) != 0 ? manifest2.segmentationMeta : segmentationMetaData, (i12 & 256) != 0 ? manifest2.inpaintPlanesData : planesData3, (i12 & 512) != 0 ? manifest2.inpaintPanoOld : uri7, (i12 & 1024) != 0 ? manifest2.inpaintPanoWebp : uri8, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? manifest2.inpaintDepthOcclusionOld : uri9, (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? manifest2.inpaintDepthOcclusionWebp : uri10, (i12 & 8192) != 0 ? manifest2.inpaintSegmentation : uri11, (i12 & 16384) != 0 ? manifest2.inpaintSegmentationOld : uri12, (i12 & 32768) != 0 ? manifest2.lightingData : lightingData2, (i12 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? manifest2.intrinsics : intrinsicsData, (i12 & 131072) != 0 ? manifest2.equirectangular : uri13, (i12 & 262144) != 0 ? manifest2.planePolygonSet : planePolygonSet2, (i12 & ImageMetadata.LENS_APERTURE) != 0 ? manifest2.version : i10);
    }

    private final List<C18060i<Uri>> getAllUriProperties() {
        ArrayList arrayList = new ArrayList();
        for (Object next : C18192e.c(C17603a.e(Manifest.class))) {
            C18066o oVar = (C18066o) next;
            if (oVar.getVisibility() == C18072u.PUBLIC && C18194g.a(oVar.getReturnType(), C18193f.d(P.b(Uri.class)))) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (next2 instanceof C18060i) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    public final PlanesData component1() {
        return this.planesData;
    }

    public final Uri component10() {
        return this.inpaintPanoOld;
    }

    public final Uri component11() {
        return this.inpaintPanoWebp;
    }

    public final Uri component12() {
        return this.inpaintDepthOcclusionOld;
    }

    public final Uri component13() {
        return this.inpaintDepthOcclusionWebp;
    }

    public final Uri component14() {
        return this.inpaintSegmentation;
    }

    public final Uri component15() {
        return this.inpaintSegmentationOld;
    }

    public final LightingData component16() {
        return this.lightingData;
    }

    public final IntrinsicsData component17() {
        return this.intrinsics;
    }

    public final Uri component18() {
        return this.equirectangular;
    }

    public final PlanePolygonSet component19() {
        return this.planePolygonSet;
    }

    public final Uri component2() {
        return this.panoOld;
    }

    public final int component20() {
        return this.version;
    }

    public final Uri component3() {
        return this.panoWebp;
    }

    public final Uri component4() {
        return this.depthOcclusionOld;
    }

    public final Uri component5() {
        return this.depthOcclusionWebp;
    }

    public final Uri component6() {
        return this.segmentation;
    }

    public final Uri component7() {
        return this.segmentationOld;
    }

    public final SegmentationMetaData component8() {
        return this.segmentationMeta;
    }

    public final PlanesData component9() {
        return this.inpaintPlanesData;
    }

    public final Manifest copy(@e(name = "plane_orientation_0") PlanesData planesData2, @e(name = "pano_0") Uri uri, @e(name = "pano_0_webp") Uri uri2, @e(name = "depth_occlusion_0") Uri uri3, @e(name = "depth_occlusion_0_webp") Uri uri4, @e(name = "segmentation_0") Uri uri5, @e(name = "normals_segmentation_0") Uri uri6, @e(name = "segmentation_meta_0") SegmentationMetaData segmentationMetaData, @e(name = "plane_orientation_inpaint_0") PlanesData planesData3, @e(name = "pano_inpaint_0") Uri uri7, @e(name = "pano_inpaint_0_webp") Uri uri8, @e(name = "depth_occlusion_inpaint_0") Uri uri9, @e(name = "depth_occlusion_inpaint_0_webp") Uri uri10, @e(name = "segmentation_inpainting_0") Uri uri11, @e(name = "normals_segmentation_inpaint_0") Uri uri12, @e(name = "lighting") LightingData lightingData2, @e(name = "intrinsics_0") IntrinsicsData intrinsicsData, @e(name = "equirectangular") Uri uri13, @e(name = "plane_polygon_0") PlanePolygonSet planePolygonSet2, @e(name = "version") int i10) {
        PlanesData planesData4 = planesData2;
        C17542s.j(planesData4, "planesData");
        C17542s.j(uri, "panoOld");
        C17542s.j(uri2, "panoWebp");
        C17542s.j(uri3, "depthOcclusionOld");
        C17542s.j(uri4, "depthOcclusionWebp");
        C17542s.j(uri5, "segmentation");
        C17542s.j(uri6, "segmentationOld");
        C17542s.j(segmentationMetaData, "segmentationMeta");
        C17542s.j(planesData3, "inpaintPlanesData");
        C17542s.j(uri7, "inpaintPanoOld");
        C17542s.j(uri8, "inpaintPanoWebp");
        C17542s.j(uri9, "inpaintDepthOcclusionOld");
        C17542s.j(uri10, "inpaintDepthOcclusionWebp");
        C17542s.j(uri11, "inpaintSegmentation");
        C17542s.j(uri12, "inpaintSegmentationOld");
        C17542s.j(lightingData2, "lightingData");
        C17542s.j(intrinsicsData, "intrinsics");
        C17542s.j(uri13, "equirectangular");
        return new Manifest(planesData4, uri, uri2, uri3, uri4, uri5, uri6, segmentationMetaData, planesData3, uri7, uri8, uri9, uri10, uri11, uri12, lightingData2, intrinsicsData, uri13, planePolygonSet2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Manifest)) {
            return false;
        }
        Manifest manifest = (Manifest) obj;
        return C17542s.e(this.planesData, manifest.planesData) && C17542s.e(this.panoOld, manifest.panoOld) && C17542s.e(this.panoWebp, manifest.panoWebp) && C17542s.e(this.depthOcclusionOld, manifest.depthOcclusionOld) && C17542s.e(this.depthOcclusionWebp, manifest.depthOcclusionWebp) && C17542s.e(this.segmentation, manifest.segmentation) && C17542s.e(this.segmentationOld, manifest.segmentationOld) && C17542s.e(this.segmentationMeta, manifest.segmentationMeta) && C17542s.e(this.inpaintPlanesData, manifest.inpaintPlanesData) && C17542s.e(this.inpaintPanoOld, manifest.inpaintPanoOld) && C17542s.e(this.inpaintPanoWebp, manifest.inpaintPanoWebp) && C17542s.e(this.inpaintDepthOcclusionOld, manifest.inpaintDepthOcclusionOld) && C17542s.e(this.inpaintDepthOcclusionWebp, manifest.inpaintDepthOcclusionWebp) && C17542s.e(this.inpaintSegmentation, manifest.inpaintSegmentation) && C17542s.e(this.inpaintSegmentationOld, manifest.inpaintSegmentationOld) && C17542s.e(this.lightingData, manifest.lightingData) && C17542s.e(this.intrinsics, manifest.intrinsics) && C17542s.e(this.equirectangular, manifest.equirectangular) && C17542s.e(this.planePolygonSet, manifest.planePolygonSet) && this.version == manifest.version;
    }

    public final List<Uri> getAllValidUris() {
        boolean e10 = C17542s.e(this.segmentation, Uri.EMPTY);
        List<C18060i<Uri>> allUriProperties = getAllUriProperties();
        int size = allUriProperties.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add((Uri) allUriProperties.get(i10).call(this));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            Uri uri = (Uri) next;
            if (!C17542s.e(uri, Uri.EMPTY)) {
                String uri2 = uri.toString();
                C17542s.i(uri2, "toString(...)");
                if (!C15854t.d0(uri2, "/normals_segmentation", false, 2, (Object) null) || e10) {
                    arrayList2.add(next);
                }
            }
        }
        return arrayList2;
    }

    public final Uri getDepthOcclusion() {
        Uri uri = this.depthOcclusionWebp;
        if (C17542s.e(uri, Uri.EMPTY)) {
            uri = null;
        }
        return uri == null ? this.depthOcclusionOld : uri;
    }

    public final Uri getDepthOcclusionOld() {
        return this.depthOcclusionOld;
    }

    public final Uri getDepthOcclusionWebp() {
        return this.depthOcclusionWebp;
    }

    public final Uri getEquirectangular() {
        return this.equirectangular;
    }

    public final Uri getInpaintDepthOcclusion() {
        Uri uri = this.inpaintDepthOcclusionWebp;
        if (C17542s.e(uri, Uri.EMPTY)) {
            uri = null;
        }
        return uri == null ? this.inpaintDepthOcclusionOld : uri;
    }

    public final Uri getInpaintDepthOcclusionOld() {
        return this.inpaintDepthOcclusionOld;
    }

    public final Uri getInpaintDepthOcclusionWebp() {
        return this.inpaintDepthOcclusionWebp;
    }

    public final Uri getInpaintPano() {
        Uri uri = this.inpaintPanoWebp;
        if (C17542s.e(uri, Uri.EMPTY)) {
            uri = null;
        }
        return uri == null ? this.inpaintPanoOld : uri;
    }

    public final Uri getInpaintPanoOld() {
        return this.inpaintPanoOld;
    }

    public final Uri getInpaintPanoWebp() {
        return this.inpaintPanoWebp;
    }

    public final PlanesData getInpaintPlanesData() {
        return this.inpaintPlanesData;
    }

    public final Uri getInpaintSegmentation() {
        return this.inpaintSegmentation;
    }

    public final Uri getInpaintSegmentationOld() {
        return this.inpaintSegmentationOld;
    }

    public final IntrinsicsData getIntrinsics() {
        return this.intrinsics;
    }

    public final LightingData getLightingData() {
        return this.lightingData;
    }

    public final Uri getPano() {
        Uri uri = this.panoWebp;
        if (C17542s.e(uri, Uri.EMPTY)) {
            uri = null;
        }
        return uri == null ? this.panoOld : uri;
    }

    public final Uri getPanoOld() {
        return this.panoOld;
    }

    public final Uri getPanoWebp() {
        return this.panoWebp;
    }

    public final PlanePolygonSet getPlanePolygonSet() {
        return this.planePolygonSet;
    }

    public final PlanesData getPlanesData() {
        return this.planesData;
    }

    public final Uri getSegmentation() {
        return this.segmentation;
    }

    public final SegmentationMetaData getSegmentationMeta() {
        return this.segmentationMeta;
    }

    public final Uri getSegmentationOld() {
        return this.segmentationOld;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((this.planesData.hashCode() * 31) + this.panoOld.hashCode()) * 31) + this.panoWebp.hashCode()) * 31) + this.depthOcclusionOld.hashCode()) * 31) + this.depthOcclusionWebp.hashCode()) * 31) + this.segmentation.hashCode()) * 31) + this.segmentationOld.hashCode()) * 31) + this.segmentationMeta.hashCode()) * 31) + this.inpaintPlanesData.hashCode()) * 31) + this.inpaintPanoOld.hashCode()) * 31) + this.inpaintPanoWebp.hashCode()) * 31) + this.inpaintDepthOcclusionOld.hashCode()) * 31) + this.inpaintDepthOcclusionWebp.hashCode()) * 31) + this.inpaintSegmentation.hashCode()) * 31) + this.inpaintSegmentationOld.hashCode()) * 31) + this.lightingData.hashCode()) * 31) + this.intrinsics.hashCode()) * 31) + this.equirectangular.hashCode()) * 31;
        PlanePolygonSet planePolygonSet2 = this.planePolygonSet;
        return ((hashCode + (planePolygonSet2 == null ? 0 : planePolygonSet2.hashCode())) * 31) + Integer.hashCode(this.version);
    }

    public final boolean isPreviewable() {
        return !C17542s.e(getPano(), Uri.EMPTY);
    }

    public final void replaceUris(HashMap<Uri, Uri> hashMap) {
        C17542s.j(hashMap, "fromToMap");
        for (C18060i next : getAllUriProperties()) {
            Uri uri = hashMap.get((Uri) next.d().call(this));
            if (uri != null) {
                next.g().call(this, uri);
            }
        }
    }

    public final void setDepthOcclusionOld(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.depthOcclusionOld = uri;
    }

    public final void setDepthOcclusionWebp(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.depthOcclusionWebp = uri;
    }

    public final void setEquirectangular(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.equirectangular = uri;
    }

    public final void setInpaintDepthOcclusionOld(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.inpaintDepthOcclusionOld = uri;
    }

    public final void setInpaintDepthOcclusionWebp(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.inpaintDepthOcclusionWebp = uri;
    }

    public final void setInpaintPanoOld(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.inpaintPanoOld = uri;
    }

    public final void setInpaintPanoWebp(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.inpaintPanoWebp = uri;
    }

    public final void setInpaintPlanesData(PlanesData planesData2) {
        C17542s.j(planesData2, "<set-?>");
        this.inpaintPlanesData = planesData2;
    }

    public final void setInpaintSegmentation(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.inpaintSegmentation = uri;
    }

    public final void setInpaintSegmentationOld(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.inpaintSegmentationOld = uri;
    }

    public final void setIntrinsics(IntrinsicsData intrinsicsData) {
        C17542s.j(intrinsicsData, "<set-?>");
        this.intrinsics = intrinsicsData;
    }

    public final void setLightingData(LightingData lightingData2) {
        C17542s.j(lightingData2, "<set-?>");
        this.lightingData = lightingData2;
    }

    public final void setPanoOld(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.panoOld = uri;
    }

    public final void setPanoWebp(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.panoWebp = uri;
    }

    public final void setPlanePolygonSet(PlanePolygonSet planePolygonSet2) {
        this.planePolygonSet = planePolygonSet2;
    }

    public final void setPlanesData(PlanesData planesData2) {
        C17542s.j(planesData2, "<set-?>");
        this.planesData = planesData2;
    }

    public final void setSegmentation(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.segmentation = uri;
    }

    public final void setSegmentationMeta(SegmentationMetaData segmentationMetaData) {
        C17542s.j(segmentationMetaData, "<set-?>");
        this.segmentationMeta = segmentationMetaData;
    }

    public final void setSegmentationOld(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.segmentationOld = uri;
    }

    public final void setVersion(int i10) {
        this.version = i10;
    }

    public String toString() {
        PlanesData planesData2 = this.planesData;
        Uri uri = this.panoOld;
        Uri uri2 = this.panoWebp;
        Uri uri3 = this.depthOcclusionOld;
        Uri uri4 = this.depthOcclusionWebp;
        Uri uri5 = this.segmentation;
        Uri uri6 = this.segmentationOld;
        SegmentationMetaData segmentationMetaData = this.segmentationMeta;
        PlanesData planesData3 = this.inpaintPlanesData;
        Uri uri7 = this.inpaintPanoOld;
        Uri uri8 = this.inpaintPanoWebp;
        Uri uri9 = this.inpaintDepthOcclusionOld;
        Uri uri10 = this.inpaintDepthOcclusionWebp;
        Uri uri11 = this.inpaintSegmentation;
        Uri uri12 = this.inpaintSegmentationOld;
        LightingData lightingData2 = this.lightingData;
        IntrinsicsData intrinsicsData = this.intrinsics;
        Uri uri13 = this.equirectangular;
        PlanePolygonSet planePolygonSet2 = this.planePolygonSet;
        int i10 = this.version;
        return "Manifest(planesData=" + planesData2 + ", panoOld=" + uri + ", panoWebp=" + uri2 + ", depthOcclusionOld=" + uri3 + ", depthOcclusionWebp=" + uri4 + ", segmentation=" + uri5 + ", segmentationOld=" + uri6 + ", segmentationMeta=" + segmentationMetaData + ", inpaintPlanesData=" + planesData3 + ", inpaintPanoOld=" + uri7 + ", inpaintPanoWebp=" + uri8 + ", inpaintDepthOcclusionOld=" + uri9 + ", inpaintDepthOcclusionWebp=" + uri10 + ", inpaintSegmentation=" + uri11 + ", inpaintSegmentationOld=" + uri12 + ", lightingData=" + lightingData2 + ", intrinsics=" + intrinsicsData + ", equirectangular=" + uri13 + ", planePolygonSet=" + planePolygonSet2 + ", version=" + i10 + ")";
    }

    public Manifest(@e(name = "plane_orientation_0") PlanesData planesData2, @e(name = "pano_0") Uri uri, @e(name = "pano_0_webp") Uri uri2, @e(name = "depth_occlusion_0") Uri uri3, @e(name = "depth_occlusion_0_webp") Uri uri4, @e(name = "segmentation_0") Uri uri5, @e(name = "normals_segmentation_0") Uri uri6, @e(name = "segmentation_meta_0") SegmentationMetaData segmentationMetaData, @e(name = "plane_orientation_inpaint_0") PlanesData planesData3, @e(name = "pano_inpaint_0") Uri uri7, @e(name = "pano_inpaint_0_webp") Uri uri8, @e(name = "depth_occlusion_inpaint_0") Uri uri9, @e(name = "depth_occlusion_inpaint_0_webp") Uri uri10, @e(name = "segmentation_inpainting_0") Uri uri11, @e(name = "normals_segmentation_inpaint_0") Uri uri12, @e(name = "lighting") LightingData lightingData2, @e(name = "intrinsics_0") IntrinsicsData intrinsicsData, @e(name = "equirectangular") Uri uri13, @e(name = "plane_polygon_0") PlanePolygonSet planePolygonSet2, @e(name = "version") int i10) {
        PlanesData planesData4 = planesData2;
        Uri uri14 = uri;
        Uri uri15 = uri2;
        Uri uri16 = uri3;
        Uri uri17 = uri4;
        Uri uri18 = uri5;
        Uri uri19 = uri6;
        SegmentationMetaData segmentationMetaData2 = segmentationMetaData;
        PlanesData planesData5 = planesData3;
        Uri uri20 = uri7;
        Uri uri21 = uri8;
        Uri uri22 = uri9;
        Uri uri23 = uri10;
        Uri uri24 = uri11;
        LightingData lightingData3 = lightingData2;
        C17542s.j(planesData4, "planesData");
        C17542s.j(uri14, "panoOld");
        C17542s.j(uri15, "panoWebp");
        C17542s.j(uri16, "depthOcclusionOld");
        C17542s.j(uri17, "depthOcclusionWebp");
        C17542s.j(uri18, "segmentation");
        C17542s.j(uri19, "segmentationOld");
        C17542s.j(segmentationMetaData2, "segmentationMeta");
        C17542s.j(planesData5, "inpaintPlanesData");
        C17542s.j(uri20, "inpaintPanoOld");
        C17542s.j(uri21, "inpaintPanoWebp");
        C17542s.j(uri22, "inpaintDepthOcclusionOld");
        C17542s.j(uri23, "inpaintDepthOcclusionWebp");
        C17542s.j(uri24, "inpaintSegmentation");
        C17542s.j(uri12, "inpaintSegmentationOld");
        C17542s.j(lightingData2, "lightingData");
        C17542s.j(intrinsicsData, "intrinsics");
        C17542s.j(uri13, "equirectangular");
        this.planesData = planesData4;
        this.panoOld = uri14;
        this.panoWebp = uri15;
        this.depthOcclusionOld = uri16;
        this.depthOcclusionWebp = uri17;
        this.segmentation = uri18;
        this.segmentationOld = uri19;
        this.segmentationMeta = segmentationMetaData2;
        this.inpaintPlanesData = planesData5;
        this.inpaintPanoOld = uri20;
        this.inpaintPanoWebp = uri21;
        this.inpaintDepthOcclusionOld = uri22;
        this.inpaintDepthOcclusionWebp = uri23;
        this.inpaintSegmentation = uri24;
        this.inpaintSegmentationOld = uri12;
        this.lightingData = lightingData2;
        this.intrinsics = intrinsicsData;
        this.equirectangular = uri13;
        this.planePolygonSet = planePolygonSet2;
        this.version = i10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Manifest(com.sugarcube.core.network.models.PlanesData r29, android.net.Uri r30, android.net.Uri r31, android.net.Uri r32, android.net.Uri r33, android.net.Uri r34, android.net.Uri r35, com.sugarcube.core.network.models.SegmentationMetaData r36, com.sugarcube.core.network.models.PlanesData r37, android.net.Uri r38, android.net.Uri r39, android.net.Uri r40, android.net.Uri r41, android.net.Uri r42, android.net.Uri r43, com.sugarcube.core.network.models.LightingData r44, com.sugarcube.core.network.models.IntrinsicsData r45, android.net.Uri r46, com.sugarcube.core.network.models.PlanePolygonSet r47, int r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
        /*
            r28 = this;
            r0 = r49
            r1 = r0 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x000e
            com.sugarcube.core.network.models.PlanesData r1 = new com.sugarcube.core.network.models.PlanesData
            r1.<init>(r2, r3, r2)
            goto L_0x0010
        L_0x000e:
            r1 = r29
        L_0x0010:
            r4 = r0 & 2
            if (r4 == 0) goto L_0x0017
            android.net.Uri r4 = android.net.Uri.EMPTY
            goto L_0x0019
        L_0x0017:
            r4 = r30
        L_0x0019:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0020
            android.net.Uri r5 = android.net.Uri.EMPTY
            goto L_0x0022
        L_0x0020:
            r5 = r31
        L_0x0022:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0029
            android.net.Uri r6 = android.net.Uri.EMPTY
            goto L_0x002b
        L_0x0029:
            r6 = r32
        L_0x002b:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0032
            android.net.Uri r7 = android.net.Uri.EMPTY
            goto L_0x0034
        L_0x0032:
            r7 = r33
        L_0x0034:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x003b
            android.net.Uri r8 = android.net.Uri.EMPTY
            goto L_0x003d
        L_0x003b:
            r8 = r34
        L_0x003d:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0044
            android.net.Uri r9 = android.net.Uri.EMPTY
            goto L_0x0046
        L_0x0044:
            r9 = r35
        L_0x0046:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0051
            com.sugarcube.core.network.models.SegmentationMetaData r10 = new com.sugarcube.core.network.models.SegmentationMetaData
            r11 = 3
            r10.<init>(r2, r2, r11, r2)
            goto L_0x0053
        L_0x0051:
            r10 = r36
        L_0x0053:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x005d
            com.sugarcube.core.network.models.PlanesData r11 = new com.sugarcube.core.network.models.PlanesData
            r11.<init>(r2, r3, r2)
            goto L_0x005f
        L_0x005d:
            r11 = r37
        L_0x005f:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0066
            android.net.Uri r12 = android.net.Uri.EMPTY
            goto L_0x0068
        L_0x0066:
            r12 = r38
        L_0x0068:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x006f
            android.net.Uri r13 = android.net.Uri.EMPTY
            goto L_0x0071
        L_0x006f:
            r13 = r39
        L_0x0071:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0078
            android.net.Uri r14 = android.net.Uri.EMPTY
            goto L_0x007a
        L_0x0078:
            r14 = r40
        L_0x007a:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0081
            android.net.Uri r15 = android.net.Uri.EMPTY
            goto L_0x0083
        L_0x0081:
            r15 = r41
        L_0x0083:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x008a
            android.net.Uri r2 = android.net.Uri.EMPTY
            goto L_0x008c
        L_0x008a:
            r2 = r42
        L_0x008c:
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x0093
            android.net.Uri r3 = android.net.Uri.EMPTY
            goto L_0x0095
        L_0x0093:
            r3 = r43
        L_0x0095:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00aa
            r17 = r3
            com.sugarcube.core.network.models.LightingData r3 = new com.sugarcube.core.network.models.LightingData
            r18 = r2
            r50 = r15
            r2 = 0
            r15 = 1
            r3.<init>(r2, r15, r2)
            goto L_0x00b3
        L_0x00aa:
            r18 = r2
            r17 = r3
            r50 = r15
            r2 = 0
            r3 = r44
        L_0x00b3:
            r15 = 65536(0x10000, float:9.18355E-41)
            r15 = r15 & r0
            if (r15 == 0) goto L_0x00d8
            com.sugarcube.core.network.models.IntrinsicsData r15 = new com.sugarcube.core.network.models.IntrinsicsData
            r16 = 15
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = r15
            r30 = r20
            r32 = r22
            r34 = r24
            r36 = r26
            r38 = r16
            r39 = r19
            r29.<init>(r30, r32, r34, r36, r38, r39)
            goto L_0x00da
        L_0x00d8:
            r15 = r45
        L_0x00da:
            r16 = 131072(0x20000, float:1.83671E-40)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x00e3
            android.net.Uri r16 = android.net.Uri.EMPTY
            goto L_0x00e5
        L_0x00e3:
            r16 = r46
        L_0x00e5:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r2 = r47
        L_0x00ee:
            r19 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r19
            if (r0 == 0) goto L_0x00f6
            r0 = 0
            goto L_0x00f8
        L_0x00f6:
            r0 = r48
        L_0x00f8:
            r29 = r28
            r30 = r1
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r35 = r8
            r36 = r9
            r37 = r10
            r38 = r11
            r39 = r12
            r40 = r13
            r41 = r14
            r42 = r50
            r43 = r18
            r44 = r17
            r45 = r3
            r46 = r15
            r47 = r16
            r48 = r2
            r49 = r0
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.Manifest.<init>(com.sugarcube.core.network.models.PlanesData, android.net.Uri, android.net.Uri, android.net.Uri, android.net.Uri, android.net.Uri, android.net.Uri, com.sugarcube.core.network.models.SegmentationMetaData, com.sugarcube.core.network.models.PlanesData, android.net.Uri, android.net.Uri, android.net.Uri, android.net.Uri, android.net.Uri, android.net.Uri, com.sugarcube.core.network.models.LightingData, com.sugarcube.core.network.models.IntrinsicsData, android.net.Uri, com.sugarcube.core.network.models.PlanePolygonSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
