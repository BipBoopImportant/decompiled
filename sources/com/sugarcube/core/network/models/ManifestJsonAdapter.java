package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import android.net.Uri;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/sugarcube/core/network/models/ManifestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/Manifest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/Manifest;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/Manifest;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "Lcom/sugarcube/core/network/models/PlanesData;", "planesDataAdapter", "Lcom/squareup/moshi/f;", "Landroid/net/Uri;", "uriAdapter", "Lcom/sugarcube/core/network/models/SegmentationMetaData;", "segmentationMetaDataAdapter", "Lcom/sugarcube/core/network/models/LightingData;", "lightingDataAdapter", "Lcom/sugarcube/core/network/models/IntrinsicsData;", "intrinsicsDataAdapter", "Lcom/sugarcube/core/network/models/PlanePolygonSet;", "nullablePlanePolygonSetAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ManifestJsonAdapter extends f<Manifest> {
    private volatile Constructor<Manifest> constructorRef;
    private final f<Integer> intAdapter;
    private final f<IntrinsicsData> intrinsicsDataAdapter;
    private final f<LightingData> lightingDataAdapter;
    private final f<PlanePolygonSet> nullablePlanePolygonSetAdapter;
    private final k.a options;
    private final f<PlanesData> planesDataAdapter;
    private final f<SegmentationMetaData> segmentationMetaDataAdapter;
    private final f<Uri> uriAdapter;

    public ManifestJsonAdapter(t tVar) {
        t tVar2 = tVar;
        C17542s.j(tVar2, "moshi");
        k.a a10 = k.a.a("plane_orientation_0", "pano_0", "pano_0_webp", "depth_occlusion_0", "depth_occlusion_0_webp", "segmentation_0", "normals_segmentation_0", "segmentation_meta_0", "plane_orientation_inpaint_0", "pano_inpaint_0", "pano_inpaint_0_webp", "depth_occlusion_inpaint_0", "depth_occlusion_inpaint_0_webp", "segmentation_inpainting_0", "normals_segmentation_inpaint_0", "lighting", "intrinsics_0", "equirectangular", "plane_polygon_0", "version");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<PlanesData> f10 = tVar2.f(PlanesData.class, g0.d(), "planesData");
        C17542s.i(f10, "adapter(...)");
        this.planesDataAdapter = f10;
        f<Uri> f11 = tVar2.f(Uri.class, g0.d(), "panoOld");
        C17542s.i(f11, "adapter(...)");
        this.uriAdapter = f11;
        f<SegmentationMetaData> f12 = tVar2.f(SegmentationMetaData.class, g0.d(), "segmentationMeta");
        C17542s.i(f12, "adapter(...)");
        this.segmentationMetaDataAdapter = f12;
        f<LightingData> f13 = tVar2.f(LightingData.class, g0.d(), "lightingData");
        C17542s.i(f13, "adapter(...)");
        this.lightingDataAdapter = f13;
        f<IntrinsicsData> f14 = tVar2.f(IntrinsicsData.class, g0.d(), "intrinsics");
        C17542s.i(f14, "adapter(...)");
        this.intrinsicsDataAdapter = f14;
        f<PlanePolygonSet> f15 = tVar2.f(PlanePolygonSet.class, g0.d(), "planePolygonSet");
        C17542s.i(f15, "adapter(...)");
        this.nullablePlanePolygonSetAdapter = f15;
        f<Integer> f16 = tVar2.f(Integer.TYPE, g0.d(), "version");
        C17542s.i(f16, "adapter(...)");
        this.intAdapter = f16;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Manifest");
        sb2.append(')');
        return sb2.toString();
    }

    public Manifest fromJson(k kVar) {
        Uri uri;
        int i10;
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        kVar.d();
        PlanesData planesData = null;
        int i11 = -1;
        Integer num = 0;
        Uri uri2 = null;
        Uri uri3 = null;
        Uri uri4 = null;
        Uri uri5 = null;
        Uri uri6 = null;
        Uri uri7 = null;
        Uri uri8 = null;
        Uri uri9 = null;
        SegmentationMetaData segmentationMetaData = null;
        PlanesData planesData2 = null;
        Uri uri10 = null;
        Uri uri11 = null;
        PlanePolygonSet planePolygonSet = null;
        Uri uri12 = null;
        Uri uri13 = null;
        LightingData lightingData = null;
        IntrinsicsData intrinsicsData = null;
        Uri uri14 = null;
        while (kVar.hasNext()) {
            Uri uri15 = uri3;
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    break;
                case 0:
                    planesData = this.planesDataAdapter.fromJson(kVar2);
                    if (planesData != null) {
                        i11 &= -2;
                        break;
                    } else {
                        throw c.w("planesData", "plane_orientation_0", kVar2);
                    }
                case 1:
                    uri2 = this.uriAdapter.fromJson(kVar2);
                    if (uri2 != null) {
                        i11 &= -3;
                        break;
                    } else {
                        throw c.w("panoOld", "pano_0", kVar2);
                    }
                case 2:
                    uri5 = this.uriAdapter.fromJson(kVar2);
                    if (uri5 != null) {
                        i11 &= -5;
                        break;
                    } else {
                        throw c.w("panoWebp", "pano_0_webp", kVar2);
                    }
                case 3:
                    uri6 = this.uriAdapter.fromJson(kVar2);
                    if (uri6 != null) {
                        i11 &= -9;
                        break;
                    } else {
                        throw c.w("depthOcclusionOld", "depth_occlusion_0", kVar2);
                    }
                case 4:
                    uri7 = this.uriAdapter.fromJson(kVar2);
                    if (uri7 != null) {
                        i11 &= -17;
                        break;
                    } else {
                        throw c.w("depthOcclusionWebp", "depth_occlusion_0_webp", kVar2);
                    }
                case 5:
                    uri8 = this.uriAdapter.fromJson(kVar2);
                    if (uri8 != null) {
                        i11 &= -33;
                        break;
                    } else {
                        throw c.w("segmentation", "segmentation_0", kVar2);
                    }
                case 6:
                    uri9 = this.uriAdapter.fromJson(kVar2);
                    if (uri9 != null) {
                        i11 &= -65;
                        break;
                    } else {
                        throw c.w("segmentationOld", "normals_segmentation_0", kVar2);
                    }
                case 7:
                    segmentationMetaData = this.segmentationMetaDataAdapter.fromJson(kVar2);
                    if (segmentationMetaData != null) {
                        i11 &= -129;
                        break;
                    } else {
                        throw c.w("segmentationMeta", "segmentation_meta_0", kVar2);
                    }
                case 8:
                    planesData2 = this.planesDataAdapter.fromJson(kVar2);
                    if (planesData2 != null) {
                        i11 &= -257;
                        break;
                    } else {
                        throw c.w("inpaintPlanesData", "plane_orientation_inpaint_0", kVar2);
                    }
                case 9:
                    uri10 = this.uriAdapter.fromJson(kVar2);
                    if (uri10 != null) {
                        i11 &= -513;
                        break;
                    } else {
                        throw c.w("inpaintPanoOld", "pano_inpaint_0", kVar2);
                    }
                case 10:
                    uri11 = this.uriAdapter.fromJson(kVar2);
                    if (uri11 != null) {
                        i11 &= -1025;
                        break;
                    } else {
                        throw c.w("inpaintPanoWebp", "pano_inpaint_0_webp", kVar2);
                    }
                case 11:
                    uri4 = this.uriAdapter.fromJson(kVar2);
                    if (uri4 != null) {
                        i11 &= -2049;
                        break;
                    } else {
                        throw c.w("inpaintDepthOcclusionOld", "depth_occlusion_inpaint_0", kVar2);
                    }
                case 12:
                    uri3 = this.uriAdapter.fromJson(kVar2);
                    if (uri3 != null) {
                        i11 &= -4097;
                        continue;
                    } else {
                        throw c.w("inpaintDepthOcclusionWebp", "depth_occlusion_inpaint_0_webp", kVar2);
                    }
                case 13:
                    uri12 = this.uriAdapter.fromJson(kVar2);
                    if (uri12 != null) {
                        i11 &= -8193;
                        break;
                    } else {
                        throw c.w("inpaintSegmentation", "segmentation_inpainting_0", kVar2);
                    }
                case 14:
                    uri13 = this.uriAdapter.fromJson(kVar2);
                    if (uri13 != null) {
                        i11 &= -16385;
                        break;
                    } else {
                        throw c.w("inpaintSegmentationOld", "normals_segmentation_inpaint_0", kVar2);
                    }
                case 15:
                    lightingData = this.lightingDataAdapter.fromJson(kVar2);
                    if (lightingData != null) {
                        i10 = -32769;
                        break;
                    } else {
                        throw c.w("lightingData", "lighting", kVar2);
                    }
                case 16:
                    intrinsicsData = this.intrinsicsDataAdapter.fromJson(kVar2);
                    if (intrinsicsData != null) {
                        i10 = -65537;
                        break;
                    } else {
                        throw c.w("intrinsics", "intrinsics_0", kVar2);
                    }
                case 17:
                    uri14 = this.uriAdapter.fromJson(kVar2);
                    if (uri14 != null) {
                        i10 = -131073;
                        break;
                    } else {
                        throw c.w("equirectangular", "equirectangular", kVar2);
                    }
                case 18:
                    planePolygonSet = this.nullablePlanePolygonSetAdapter.fromJson(kVar2);
                    i10 = -262145;
                    break;
                case 19:
                    num = this.intAdapter.fromJson(kVar2);
                    if (num != null) {
                        i10 = -524289;
                        break;
                    } else {
                        throw c.w("version", "version", kVar2);
                    }
            }
            i11 &= i10;
            uri3 = uri15;
            continue;
        }
        Uri uri16 = uri3;
        kVar.f();
        if (i11 == -1048576) {
            C17542s.h(planesData, "null cannot be cast to non-null type com.sugarcube.core.network.models.PlanesData");
            C17542s.h(uri2, "null cannot be cast to non-null type android.net.Uri");
            C17542s.h(uri5, "null cannot be cast to non-null type android.net.Uri");
            C17542s.h(uri6, "null cannot be cast to non-null type android.net.Uri");
            C17542s.h(uri7, "null cannot be cast to non-null type android.net.Uri");
            C17542s.h(uri8, "null cannot be cast to non-null type android.net.Uri");
            C17542s.h(uri9, "null cannot be cast to non-null type android.net.Uri");
            C17542s.h(segmentationMetaData, "null cannot be cast to non-null type com.sugarcube.core.network.models.SegmentationMetaData");
            C17542s.h(planesData2, "null cannot be cast to non-null type com.sugarcube.core.network.models.PlanesData");
            C17542s.h(uri10, "null cannot be cast to non-null type android.net.Uri");
            C17542s.h(uri11, "null cannot be cast to non-null type android.net.Uri");
            C17542s.h(uri4, "null cannot be cast to non-null type android.net.Uri");
            Uri uri17 = uri16;
            C17542s.h(uri17, "null cannot be cast to non-null type android.net.Uri");
            Uri uri18 = uri12;
            C17542s.h(uri18, "null cannot be cast to non-null type android.net.Uri");
            Manifest manifest = r25;
            Uri uri19 = uri13;
            C17542s.h(uri19, "null cannot be cast to non-null type android.net.Uri");
            Uri uri20 = uri19;
            Uri uri21 = uri18;
            LightingData lightingData2 = lightingData;
            C17542s.h(lightingData2, "null cannot be cast to non-null type com.sugarcube.core.network.models.LightingData");
            LightingData lightingData3 = lightingData2;
            IntrinsicsData intrinsicsData2 = intrinsicsData;
            C17542s.h(intrinsicsData2, "null cannot be cast to non-null type com.sugarcube.core.network.models.IntrinsicsData");
            Uri uri22 = uri14;
            C17542s.h(uri22, "null cannot be cast to non-null type android.net.Uri");
            Manifest manifest2 = new Manifest(planesData, uri2, uri5, uri6, uri7, uri8, uri9, segmentationMetaData, planesData2, uri10, uri11, uri4, uri17, uri21, uri20, lightingData3, intrinsicsData2, uri22, planePolygonSet, num.intValue());
            return manifest;
        }
        Uri uri23 = uri16;
        Uri uri24 = uri13;
        LightingData lightingData4 = lightingData;
        Uri uri25 = uri14;
        int i12 = i11;
        IntrinsicsData intrinsicsData3 = intrinsicsData;
        Constructor<Manifest> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            uri = uri4;
            constructor = Manifest.class.getDeclaredConstructor(new Class[]{PlanesData.class, Uri.class, Uri.class, Uri.class, Uri.class, Uri.class, Uri.class, SegmentationMetaData.class, PlanesData.class, Uri.class, Uri.class, Uri.class, Uri.class, Uri.class, Uri.class, LightingData.class, IntrinsicsData.class, Uri.class, PlanePolygonSet.class, cls, cls, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        } else {
            uri = uri4;
        }
        Manifest newInstance = constructor.newInstance(new Object[]{planesData, uri2, uri5, uri6, uri7, uri8, uri9, segmentationMetaData, planesData2, uri10, uri11, uri, uri23, uri12, uri24, lightingData4, intrinsicsData3, uri25, planePolygonSet, num, Integer.valueOf(i12), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, Manifest manifest) {
        C17542s.j(qVar, "writer");
        if (manifest != null) {
            qVar.d();
            qVar.n("plane_orientation_0");
            this.planesDataAdapter.toJson(qVar, manifest.getPlanesData());
            qVar.n("pano_0");
            this.uriAdapter.toJson(qVar, manifest.getPanoOld());
            qVar.n("pano_0_webp");
            this.uriAdapter.toJson(qVar, manifest.getPanoWebp());
            qVar.n("depth_occlusion_0");
            this.uriAdapter.toJson(qVar, manifest.getDepthOcclusionOld());
            qVar.n("depth_occlusion_0_webp");
            this.uriAdapter.toJson(qVar, manifest.getDepthOcclusionWebp());
            qVar.n("segmentation_0");
            this.uriAdapter.toJson(qVar, manifest.getSegmentation());
            qVar.n("normals_segmentation_0");
            this.uriAdapter.toJson(qVar, manifest.getSegmentationOld());
            qVar.n("segmentation_meta_0");
            this.segmentationMetaDataAdapter.toJson(qVar, manifest.getSegmentationMeta());
            qVar.n("plane_orientation_inpaint_0");
            this.planesDataAdapter.toJson(qVar, manifest.getInpaintPlanesData());
            qVar.n("pano_inpaint_0");
            this.uriAdapter.toJson(qVar, manifest.getInpaintPanoOld());
            qVar.n("pano_inpaint_0_webp");
            this.uriAdapter.toJson(qVar, manifest.getInpaintPanoWebp());
            qVar.n("depth_occlusion_inpaint_0");
            this.uriAdapter.toJson(qVar, manifest.getInpaintDepthOcclusionOld());
            qVar.n("depth_occlusion_inpaint_0_webp");
            this.uriAdapter.toJson(qVar, manifest.getInpaintDepthOcclusionWebp());
            qVar.n("segmentation_inpainting_0");
            this.uriAdapter.toJson(qVar, manifest.getInpaintSegmentation());
            qVar.n("normals_segmentation_inpaint_0");
            this.uriAdapter.toJson(qVar, manifest.getInpaintSegmentationOld());
            qVar.n("lighting");
            this.lightingDataAdapter.toJson(qVar, manifest.getLightingData());
            qVar.n("intrinsics_0");
            this.intrinsicsDataAdapter.toJson(qVar, manifest.getIntrinsics());
            qVar.n("equirectangular");
            this.uriAdapter.toJson(qVar, manifest.getEquirectangular());
            qVar.n("plane_polygon_0");
            this.nullablePlanePolygonSetAdapter.toJson(qVar, manifest.getPlanePolygonSet());
            qVar.n("version");
            this.intAdapter.toJson(qVar, Integer.valueOf(manifest.getVersion()));
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
