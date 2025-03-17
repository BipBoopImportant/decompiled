package com.sugarcube.app.base.data.model;

import OE.C13313e;
import OE.q;
import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.core.network.models.SessionMeta;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001añ\u0001\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/sugarcube/core/network/models/SessionMeta$Companion;", "Landroid/content/Context;", "context", "LOE/q;", "sugarcube", "LOE/e;", "installationConfig", "Ljava/time/Instant;", "creation", "", "isHybrid", "hasDepth", "", "hybridMode", "captureStrategy", "panoConfiguration", "scanConfiguration", "", "primaryImageCount", "primaryImageLens", "primaryImageOrientation", "scanOrientation", "", "optimizelyFlags", "captureV2", "ownVideo", "forceLandscape", "swapRgb", "imageFormatJPEG", "Lcom/sugarcube/core/network/models/SessionMeta;", "newInstance", "(Lcom/sugarcube/core/network/models/SessionMeta$Companion;Landroid/content/Context;LOE/q;LOE/e;Ljava/time/Instant;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sugarcube/core/network/models/SessionMeta;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SessionMetaKt {
    public static final SessionMeta newInstance(SessionMeta.Companion companion, Context context, q qVar, C13313e eVar, Instant instant, boolean z10, boolean z11, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, List<String> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        Context context2 = context;
        Instant instant2 = instant;
        C17542s.j(companion, "<this>");
        C17542s.j(context2, "context");
        C17542s.j(qVar, "sugarcube");
        C17542s.j(eVar, "installationConfig");
        C17542s.j(instant2, "creation");
        C17542s.j(str, "hybridMode");
        C17542s.j(str2, "captureStrategy");
        String str8 = z10 ? SessionMeta.DATE_FORMAT_VERSION_HYBRID : SessionMeta.DATE_FORMAT_VERSION;
        String a10 = eVar.a();
        String b10 = eVar.b();
        String h10 = eVar.h();
        String k10 = eVar.k();
        String l10 = eVar.l();
        String str9 = l10;
        C17542s.i(l10, "<get-releaseVersion>(...)");
        String str10 = Build.MODEL;
        String str11 = str10;
        C17542s.i(str10, "MODEL");
        String format = DateTimeFormatter.ISO_INSTANT.format(instant2);
        C17542s.i(format, "format(...)");
        Object systemService = context2.getSystemService("batterymanager");
        C17542s.h(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        return new SessionMeta(str8, "android", a10, b10, h10, k10, str9, str11, format, str2, str, z11, 0, 0, 0, 0, ((BatteryManager) systemService).getIntProperty(4), str3, str4, num, str5, str6, str7, Build.MANUFACTURER, qVar.getRegion(), bool, bool2, bool3, bool4, bool5, list);
    }

    public static /* synthetic */ SessionMeta newInstance$default(SessionMeta.Companion companion, Context context, q qVar, C13313e eVar, Instant instant, boolean z10, boolean z11, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i10, Object obj) {
        String str8;
        int i11 = i10;
        Instant now = (i11 & 8) != 0 ? Instant.now() : instant;
        boolean z12 = (i11 & 16) != 0 ? false : z10;
        boolean z13 = (i11 & 32) != 0 ? false : z11;
        String str9 = (i11 & 64) != 0 ? "" : str;
        if ((i11 & 128) != 0) {
            str8 = z12 ? "CAMPANO_ARSCAN_ARSTEP_ARSCAN" : "ARCore";
        } else {
            str8 = str2;
        }
        return newInstance(companion, context, qVar, eVar, now, z12, z13, str9, str8, (i11 & 256) != 0 ? null : str3, (i11 & 512) != 0 ? null : str4, (i11 & 1024) != 0 ? null : num, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? null : str5, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str6, (i11 & 8192) != 0 ? null : str7, (i11 & 16384) != 0 ? null : list, (32768 & i11) != 0 ? Boolean.FALSE : bool, (65536 & i11) != 0 ? Boolean.FALSE : bool2, (131072 & i11) != 0 ? Boolean.FALSE : bool3, (262144 & i11) != 0 ? Boolean.FALSE : bool4, (i11 & ImageMetadata.LENS_APERTURE) != 0 ? Boolean.FALSE : bool5);
    }
}
