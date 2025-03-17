package com.sugarcube.core.network.models;

import YH.g0;
import com.oppwa.mobile.connect.BuildConfig;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import d9.M;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lcom/sugarcube/core/network/models/UploadPropertiesJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/UploadProperties;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/UploadProperties;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/UploadProperties;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "nullableStringAdapter", "Lcom/squareup/moshi/f;", "", "nullableBooleanAdapter", "", "nullableIntAdapter", "", "nullableListOfStringAdapter", "Ljava/util/UUID;", "nullableUUIDAdapter", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadPropertiesJsonAdapter extends f<UploadProperties> {
    private final f<Boolean> nullableBooleanAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<List<String>> nullableListOfStringAdapter;
    private final f<String> nullableStringAdapter;
    private final f<UUID> nullableUUIDAdapter;
    private final k.a options;

    public UploadPropertiesJsonAdapter(t tVar) {
        t tVar2 = tVar;
        C17542s.j(tVar2, "moshi");
        k.a a10 = k.a.a("dataFormatVersion", "platform", "appEnvironment", "appPackageName", "appVersion", "libVersion", "osVersion", "deviceModel", "deviceManufacturer", "captureTimestamp", "captureStrategy", "hasDepth", "ultraDepth", "batteryLevel", "panoConfiguration", "scanConfiguration", "primaryImageCount", "primaryImageLens", "primaryImageOrientation", "scanOrientation", "region", "captureV2", "ownVideo", "forceLandscape", "swapRgb", "optimizelyFlags", "uploadV2", "workerId");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        Class<String> cls = String.class;
        f<String> f10 = tVar2.f(cls, g0.d(), "dataFormatVersion");
        C17542s.i(f10, "adapter(...)");
        this.nullableStringAdapter = f10;
        f<Boolean> f11 = tVar2.f(Boolean.class, g0.d(), "hasDepth");
        C17542s.i(f11, "adapter(...)");
        this.nullableBooleanAdapter = f11;
        f<Integer> f12 = tVar2.f(Integer.class, g0.d(), "batteryLevel");
        C17542s.i(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        f<List<String>> f13 = tVar2.f(w.j(List.class, cls), g0.d(), "optimizelyFlags");
        C17542s.i(f13, "adapter(...)");
        this.nullableListOfStringAdapter = f13;
        f<UUID> f14 = tVar2.f(UUID.class, g0.d(), "workerId");
        C17542s.i(f14, "adapter(...)");
        this.nullableUUIDAdapter = f14;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UploadProperties");
        sb2.append(')');
        return sb2.toString();
    }

    public UploadProperties fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        kVar.d();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num = null;
        String str12 = null;
        String str13 = null;
        Integer num2 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        List list = null;
        Boolean bool7 = null;
        UUID uuid = null;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 6:
                    str7 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 7:
                    str8 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 8:
                    str9 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 9:
                    str10 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 10:
                    str11 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 11:
                    bool = this.nullableBooleanAdapter.fromJson(kVar2);
                    break;
                case 12:
                    bool2 = this.nullableBooleanAdapter.fromJson(kVar2);
                    break;
                case 13:
                    num = this.nullableIntAdapter.fromJson(kVar2);
                    break;
                case 14:
                    str12 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 15:
                    str13 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 16:
                    num2 = this.nullableIntAdapter.fromJson(kVar2);
                    break;
                case 17:
                    str14 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 18:
                    str15 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 19:
                    str16 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 20:
                    str17 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 21:
                    bool3 = this.nullableBooleanAdapter.fromJson(kVar2);
                    break;
                case 22:
                    bool4 = this.nullableBooleanAdapter.fromJson(kVar2);
                    break;
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                    bool5 = this.nullableBooleanAdapter.fromJson(kVar2);
                    break;
                case BuildConfig.MIN_SDK_VERSION:
                    bool6 = this.nullableBooleanAdapter.fromJson(kVar2);
                    break;
                case 25:
                    list = this.nullableListOfStringAdapter.fromJson(kVar2);
                    break;
                case 26:
                    bool7 = this.nullableBooleanAdapter.fromJson(kVar2);
                    break;
                case 27:
                    uuid = this.nullableUUIDAdapter.fromJson(kVar2);
                    break;
            }
        }
        kVar.f();
        return new UploadProperties(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, bool, bool2, num, str12, str13, num2, str14, str15, str16, str17, bool3, bool4, bool5, bool6, list, bool7, uuid);
    }

    public void toJson(q qVar, UploadProperties uploadProperties) {
        C17542s.j(qVar, "writer");
        if (uploadProperties != null) {
            qVar.d();
            qVar.n("dataFormatVersion");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getDataFormatVersion());
            qVar.n("platform");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getPlatform());
            qVar.n("appEnvironment");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getAppEnvironment());
            qVar.n("appPackageName");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getAppPackageName());
            qVar.n("appVersion");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getAppVersion());
            qVar.n("libVersion");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getLibVersion());
            qVar.n("osVersion");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getOsVersion());
            qVar.n("deviceModel");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getDeviceModel());
            qVar.n("deviceManufacturer");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getDeviceManufacturer());
            qVar.n("captureTimestamp");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getCaptureTimestamp());
            qVar.n("captureStrategy");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getCaptureStrategy());
            qVar.n("hasDepth");
            this.nullableBooleanAdapter.toJson(qVar, uploadProperties.getHasDepth());
            qVar.n("ultraDepth");
            this.nullableBooleanAdapter.toJson(qVar, uploadProperties.getUltraDepth());
            qVar.n("batteryLevel");
            this.nullableIntAdapter.toJson(qVar, uploadProperties.getBatteryLevel());
            qVar.n("panoConfiguration");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getPanoConfiguration());
            qVar.n("scanConfiguration");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getScanConfiguration());
            qVar.n("primaryImageCount");
            this.nullableIntAdapter.toJson(qVar, uploadProperties.getPrimaryImageCount());
            qVar.n("primaryImageLens");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getPrimaryImageLens());
            qVar.n("primaryImageOrientation");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getPrimaryImageOrientation());
            qVar.n("scanOrientation");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getScanOrientation());
            qVar.n("region");
            this.nullableStringAdapter.toJson(qVar, uploadProperties.getRegion());
            qVar.n("captureV2");
            this.nullableBooleanAdapter.toJson(qVar, uploadProperties.getCaptureV2());
            qVar.n("ownVideo");
            this.nullableBooleanAdapter.toJson(qVar, uploadProperties.getOwnVideo());
            qVar.n("forceLandscape");
            this.nullableBooleanAdapter.toJson(qVar, uploadProperties.getForceLandscape());
            qVar.n("swapRgb");
            this.nullableBooleanAdapter.toJson(qVar, uploadProperties.getSwapRgb());
            qVar.n("optimizelyFlags");
            this.nullableListOfStringAdapter.toJson(qVar, uploadProperties.getOptimizelyFlags());
            qVar.n("uploadV2");
            this.nullableBooleanAdapter.toJson(qVar, uploadProperties.getUploadV2());
            qVar.n("workerId");
            this.nullableUUIDAdapter.toJson(qVar, uploadProperties.getWorkerId());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
