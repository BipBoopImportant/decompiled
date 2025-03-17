package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.oppwa.mobile.connect.BuildConfig;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import d9.M;
import java.lang.reflect.Constructor;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/sugarcube/core/network/models/SceneResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/SceneResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/SceneResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/SceneResponse;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "intAdapter", "Lcom/squareup/moshi/f;", "Ljava/util/UUID;", "uUIDAdapter", "nullableUUIDAdapter", "stringAdapter", "nullableStringAdapter", "Ljava/time/Instant;", "instantAdapter", "Lcom/sugarcube/core/network/models/SceneResponseState;", "nullableSceneResponseStateAdapter", "Lcom/sugarcube/core/network/models/SceneResponseJobState;", "nullableSceneResponseJobStateAdapter", "", "booleanAdapter", "nullableInstantAdapter", "Lcom/sugarcube/core/network/models/ThumbnailResponse;", "nullableThumbnailResponseAdapter", "Lcom/sugarcube/core/network/models/Manifest;", "nullableManifestAdapter", "Lcom/sugarcube/core/network/models/GlbUrls;", "nullableGlbUrlsAdapter", "", "Lcom/sugarcube/core/network/models/MultiviewThumbnail;", "listOfMultiviewThumbnailAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SceneResponseJsonAdapter extends f<SceneResponse> {
    private final f<Boolean> booleanAdapter;
    private volatile Constructor<SceneResponse> constructorRef;
    private final f<Instant> instantAdapter;
    private final f<Integer> intAdapter;
    private final f<List<MultiviewThumbnail>> listOfMultiviewThumbnailAdapter;
    private final f<GlbUrls> nullableGlbUrlsAdapter;
    private final f<Instant> nullableInstantAdapter;
    private final f<Manifest> nullableManifestAdapter;
    private final f<SceneResponseJobState> nullableSceneResponseJobStateAdapter;
    private final f<SceneResponseState> nullableSceneResponseStateAdapter;
    private final f<String> nullableStringAdapter;
    private final f<ThumbnailResponse> nullableThumbnailResponseAdapter;
    private final f<UUID> nullableUUIDAdapter;
    private final k.a options;
    private final f<String> stringAdapter;
    private final f<UUID> uUIDAdapter;

    public SceneResponseJsonAdapter(t tVar) {
        t tVar2 = tVar;
        C17542s.j(tVar2, "moshi");
        k.a a10 = k.a.a("sceneId", "uuid", "upload", "wid", "name", "roomType", "creation", "createdAt", "clientCapturedAt", "lastModifiedTs", "state", "jobState", "isRated", "canDecorate", "compositionCount", "estimatedFinishTs", "thumbnails", "manifest", "glbUrls", "viewports", "isStock", "pipelineType", "mobilePlatform", "appEnv", "jobId");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar2.f(Integer.TYPE, g0.d(), "sceneId");
        C17542s.i(f10, "adapter(...)");
        this.intAdapter = f10;
        Class<UUID> cls = UUID.class;
        f<UUID> f11 = tVar2.f(cls, g0.d(), "sceneUuid");
        C17542s.i(f11, "adapter(...)");
        this.uUIDAdapter = f11;
        f<UUID> f12 = tVar2.f(cls, g0.d(), "upload");
        C17542s.i(f12, "adapter(...)");
        this.nullableUUIDAdapter = f12;
        Class<String> cls2 = String.class;
        f<String> f13 = tVar2.f(cls2, g0.d(), "name");
        C17542s.i(f13, "adapter(...)");
        this.stringAdapter = f13;
        f<String> f14 = tVar2.f(cls2, g0.d(), "roomType");
        C17542s.i(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
        Class<Instant> cls3 = Instant.class;
        f<Instant> f15 = tVar2.f(cls3, g0.d(), "creation");
        C17542s.i(f15, "adapter(...)");
        this.instantAdapter = f15;
        f<SceneResponseState> f16 = tVar2.f(SceneResponseState.class, g0.d(), "state");
        C17542s.i(f16, "adapter(...)");
        this.nullableSceneResponseStateAdapter = f16;
        f<SceneResponseJobState> f17 = tVar2.f(SceneResponseJobState.class, g0.d(), "jobState");
        C17542s.i(f17, "adapter(...)");
        this.nullableSceneResponseJobStateAdapter = f17;
        f<Boolean> f18 = tVar2.f(Boolean.TYPE, g0.d(), "isRated");
        C17542s.i(f18, "adapter(...)");
        this.booleanAdapter = f18;
        f<Instant> f19 = tVar2.f(cls3, g0.d(), "estimatedFinishTs");
        C17542s.i(f19, "adapter(...)");
        this.nullableInstantAdapter = f19;
        f<ThumbnailResponse> f20 = tVar2.f(ThumbnailResponse.class, g0.d(), "thumbnails");
        C17542s.i(f20, "adapter(...)");
        this.nullableThumbnailResponseAdapter = f20;
        f<Manifest> f21 = tVar2.f(Manifest.class, g0.d(), "manifest");
        C17542s.i(f21, "adapter(...)");
        this.nullableManifestAdapter = f21;
        f<GlbUrls> f22 = tVar2.f(GlbUrls.class, g0.d(), "glbUrls");
        C17542s.i(f22, "adapter(...)");
        this.nullableGlbUrlsAdapter = f22;
        f<List<MultiviewThumbnail>> f23 = tVar2.f(w.j(List.class, MultiviewThumbnail.class), g0.d(), "viewports");
        C17542s.i(f23, "adapter(...)");
        this.listOfMultiviewThumbnailAdapter = f23;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SceneResponse");
        sb2.append(')');
        return sb2.toString();
    }

    public SceneResponse fromJson(k kVar) {
        int i10;
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        kVar.d();
        Instant instant = null;
        int i11 = -1;
        Integer num2 = num;
        Integer num3 = num2;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Instant instant2 = null;
        UUID uuid = null;
        UUID uuid2 = null;
        String str = null;
        String str2 = null;
        Instant instant3 = null;
        Instant instant4 = null;
        SceneResponseState sceneResponseState = null;
        SceneResponseJobState sceneResponseJobState = null;
        Instant instant5 = null;
        ThumbnailResponse thumbnailResponse = null;
        Manifest manifest = null;
        List list = null;
        GlbUrls glbUrls = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        UUID uuid3 = null;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    continue;
                case 0:
                    num2 = this.intAdapter.fromJson(kVar2);
                    if (num2 != null) {
                        i11 &= -2;
                        continue;
                    } else {
                        throw c.w("sceneId", "sceneId", kVar2);
                    }
                case 1:
                    uuid = this.uUIDAdapter.fromJson(kVar2);
                    if (uuid != null) {
                        i11 &= -3;
                        continue;
                    } else {
                        throw c.w("sceneUuid", "uuid", kVar2);
                    }
                case 2:
                    uuid2 = this.nullableUUIDAdapter.fromJson(kVar2);
                    i11 &= -5;
                    continue;
                case 3:
                    num = this.intAdapter.fromJson(kVar2);
                    if (num != null) {
                        i11 &= -9;
                        continue;
                    } else {
                        throw c.w("wid", "wid", kVar2);
                    }
                case 4:
                    str = this.stringAdapter.fromJson(kVar2);
                    if (str != null) {
                        i11 &= -17;
                        continue;
                    } else {
                        throw c.w("name", "name", kVar2);
                    }
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -33;
                    continue;
                case 6:
                    instant3 = this.instantAdapter.fromJson(kVar2);
                    if (instant3 != null) {
                        i11 &= -65;
                        continue;
                    } else {
                        throw c.w("creation", "creation", kVar2);
                    }
                case 7:
                    instant4 = this.instantAdapter.fromJson(kVar2);
                    if (instant4 != null) {
                        i11 &= -129;
                        continue;
                    } else {
                        throw c.w("createdAt", "createdAt", kVar2);
                    }
                case 8:
                    instant = this.instantAdapter.fromJson(kVar2);
                    if (instant != null) {
                        i11 &= -257;
                        continue;
                    } else {
                        throw c.w("clientCapturedAt", "clientCapturedAt", kVar2);
                    }
                case 9:
                    instant2 = this.instantAdapter.fromJson(kVar2);
                    if (instant2 != null) {
                        i11 &= -513;
                        continue;
                    } else {
                        throw c.w("lastModifiedTs", "lastModifiedTs", kVar2);
                    }
                case 10:
                    sceneResponseState = this.nullableSceneResponseStateAdapter.fromJson(kVar2);
                    i11 &= -1025;
                    continue;
                case 11:
                    sceneResponseJobState = this.nullableSceneResponseJobStateAdapter.fromJson(kVar2);
                    i11 &= -2049;
                    continue;
                case 12:
                    bool2 = this.booleanAdapter.fromJson(kVar2);
                    if (bool2 != null) {
                        i11 &= -4097;
                        continue;
                    } else {
                        throw c.w("isRated", "isRated", kVar2);
                    }
                case 13:
                    bool3 = this.booleanAdapter.fromJson(kVar2);
                    if (bool3 != null) {
                        i11 &= -8193;
                        continue;
                    } else {
                        throw c.w("canDecorate", "canDecorate", kVar2);
                    }
                case 14:
                    num3 = this.intAdapter.fromJson(kVar2);
                    if (num3 != null) {
                        i11 &= -16385;
                        continue;
                    } else {
                        throw c.w("compositionCount", "compositionCount", kVar2);
                    }
                case 15:
                    instant5 = this.nullableInstantAdapter.fromJson(kVar2);
                    i10 = -32769;
                    break;
                case 16:
                    thumbnailResponse = this.nullableThumbnailResponseAdapter.fromJson(kVar2);
                    i10 = -65537;
                    break;
                case 17:
                    manifest = this.nullableManifestAdapter.fromJson(kVar2);
                    i10 = -131073;
                    break;
                case 18:
                    glbUrls = this.nullableGlbUrlsAdapter.fromJson(kVar2);
                    i10 = -262145;
                    break;
                case 19:
                    list = this.listOfMultiviewThumbnailAdapter.fromJson(kVar2);
                    if (list != null) {
                        i10 = -524289;
                        break;
                    } else {
                        throw c.w("viewports", "viewports", kVar2);
                    }
                case 20:
                    bool4 = this.booleanAdapter.fromJson(kVar2);
                    if (bool4 != null) {
                        i10 = -1048577;
                        break;
                    } else {
                        throw c.w("isStock", "isStock", kVar2);
                    }
                case 21:
                    str3 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 = -8388609;
                    break;
                case 22:
                    str4 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 = -16777217;
                    break;
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                    str5 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 = -33554433;
                    break;
                case BuildConfig.MIN_SDK_VERSION:
                    uuid3 = this.nullableUUIDAdapter.fromJson(kVar2);
                    i10 = -67108865;
                    break;
            }
            i11 &= i10;
        }
        kVar.f();
        if (i11 == -127926272) {
            int intValue = num2.intValue();
            C17542s.h(uuid, "null cannot be cast to non-null type java.util.UUID");
            int intValue2 = num.intValue();
            C17542s.h(str, "null cannot be cast to non-null type kotlin.String");
            C17542s.h(instant3, "null cannot be cast to non-null type java.time.Instant");
            C17542s.h(instant4, "null cannot be cast to non-null type java.time.Instant");
            C17542s.h(instant, "null cannot be cast to non-null type java.time.Instant");
            C17542s.h(instant2, "null cannot be cast to non-null type java.time.Instant");
            boolean booleanValue = bool2.booleanValue();
            boolean booleanValue2 = bool3.booleanValue();
            int intValue3 = num3.intValue();
            C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.List<com.sugarcube.core.network.models.MultiviewThumbnail>");
            return new SceneResponse(intValue, uuid, uuid2, intValue2, str, str2, instant3, instant4, instant, instant2, sceneResponseState, sceneResponseJobState, booleanValue, booleanValue2, intValue3, instant5, thumbnailResponse, manifest, glbUrls, list, bool4.booleanValue(), (String) null, (String) null, str3, str4, str5, uuid3, 6291456, (DefaultConstructorMarker) null);
        }
        List list2 = list;
        Constructor<SceneResponse> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class<SceneResponse> cls3 = SceneResponse.class;
            constructor = cls3.getDeclaredConstructor(new Class[]{cls, UUID.class, UUID.class, cls, String.class, String.class, Instant.class, Instant.class, Instant.class, Instant.class, SceneResponseState.class, SceneResponseJobState.class, cls2, cls2, cls, Instant.class, ThumbnailResponse.class, Manifest.class, GlbUrls.class, List.class, cls2, String.class, String.class, String.class, String.class, String.class, UUID.class, cls, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        SceneResponse newInstance = constructor.newInstance(new Object[]{num2, uuid, uuid2, num, str, str2, instant3, instant4, instant, instant2, sceneResponseState, sceneResponseJobState, bool2, bool3, num3, instant5, thumbnailResponse, manifest, glbUrls, list2, bool4, null, null, str3, str4, str5, uuid3, Integer.valueOf(i11), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, SceneResponse sceneResponse) {
        C17542s.j(qVar, "writer");
        if (sceneResponse != null) {
            qVar.d();
            qVar.n("sceneId");
            this.intAdapter.toJson(qVar, Integer.valueOf(sceneResponse.getSceneId()));
            qVar.n("uuid");
            this.uUIDAdapter.toJson(qVar, sceneResponse.getSceneUuid());
            qVar.n("upload");
            this.nullableUUIDAdapter.toJson(qVar, sceneResponse.getUpload());
            qVar.n("wid");
            this.intAdapter.toJson(qVar, Integer.valueOf(sceneResponse.getWid()));
            qVar.n("name");
            this.stringAdapter.toJson(qVar, sceneResponse.getName());
            qVar.n("roomType");
            this.nullableStringAdapter.toJson(qVar, sceneResponse.getRoomType());
            qVar.n("creation");
            this.instantAdapter.toJson(qVar, sceneResponse.getCreation());
            qVar.n("createdAt");
            this.instantAdapter.toJson(qVar, sceneResponse.getCreatedAt());
            qVar.n("clientCapturedAt");
            this.instantAdapter.toJson(qVar, sceneResponse.getClientCapturedAt());
            qVar.n("lastModifiedTs");
            this.instantAdapter.toJson(qVar, sceneResponse.getLastModifiedTs());
            qVar.n("state");
            this.nullableSceneResponseStateAdapter.toJson(qVar, sceneResponse.getState());
            qVar.n("jobState");
            this.nullableSceneResponseJobStateAdapter.toJson(qVar, sceneResponse.getJobState());
            qVar.n("isRated");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(sceneResponse.isRated()));
            qVar.n("canDecorate");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(sceneResponse.getCanDecorate()));
            qVar.n("compositionCount");
            this.intAdapter.toJson(qVar, Integer.valueOf(sceneResponse.getCompositionCount()));
            qVar.n("estimatedFinishTs");
            this.nullableInstantAdapter.toJson(qVar, sceneResponse.getEstimatedFinishTs());
            qVar.n("thumbnails");
            this.nullableThumbnailResponseAdapter.toJson(qVar, sceneResponse.getThumbnails());
            qVar.n("manifest");
            this.nullableManifestAdapter.toJson(qVar, sceneResponse.getManifest());
            qVar.n("glbUrls");
            this.nullableGlbUrlsAdapter.toJson(qVar, sceneResponse.getGlbUrls());
            qVar.n("viewports");
            this.listOfMultiviewThumbnailAdapter.toJson(qVar, sceneResponse.getViewports());
            qVar.n("isStock");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(sceneResponse.isStock()));
            qVar.n("pipelineType");
            this.nullableStringAdapter.toJson(qVar, sceneResponse.getPipelineType());
            qVar.n("mobilePlatform");
            this.nullableStringAdapter.toJson(qVar, sceneResponse.getMobilePlatform());
            qVar.n("appEnv");
            this.nullableStringAdapter.toJson(qVar, sceneResponse.getAppEnv());
            qVar.n("jobId");
            this.nullableUUIDAdapter.toJson(qVar, sceneResponse.getJobId());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
