package com.contentsquare.android.api.bridge.xpf;

import XH.C16814e;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import com.contentsquare.android.core.features.config.model.JsonConfig$FeatureFlag$$serializer;
import com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\b\u0018\u0000 62\u00020\u0001:\u00027\"B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBY\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b\u0003\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010#\u0012\u0004\b'\u0010&\u001a\u0004\b\u0004\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010\u001cR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010&\u001a\u0004\b.\u0010/R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010&\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/contentsquare/android/api/bridge/xpf/BridgeConfig;", "", "", "isCrashReporterEnabled", "isApiErrorsEnabled", "", "tagId", "", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$FeatureFlag;", "featureFlags", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules;", "maskingRules", "<init>", "(ZZLjava/lang/String;Ljava/util/List;Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IZZLjava/lang/String;Ljava/util/List;Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/contentsquare/android/api/bridge/xpf/BridgeConfig;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "isCrashReporterEnabled$annotations", "()V", "isApiErrorsEnabled$annotations", "c", "Ljava/lang/String;", "getTagId", "getTagId$annotations", "d", "Ljava/util/List;", "getFeatureFlags", "()Ljava/util/List;", "getFeatureFlags$annotations", "e", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules;", "getMaskingRules", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules;", "getMaskingRules$annotations", "Companion", "$serializer", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BridgeConfig {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f46689f = {null, null, null, new C17451f(JsonConfig$FeatureFlag$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f46690a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f46691b;

    /* renamed from: c  reason: collision with root package name */
    private final String f46692c;

    /* renamed from: d  reason: collision with root package name */
    private final List<JsonConfig.FeatureFlag> f46693d;

    /* renamed from: e  reason: collision with root package name */
    private final JsonConfig.MaskingRules f46694e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/api/bridge/xpf/BridgeConfig$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/api/bridge/xpf/BridgeConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<BridgeConfig> serializer() {
            return BridgeConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C16814e
    public /* synthetic */ BridgeConfig(int i10, boolean z10, boolean z11, String str, List list, JsonConfig.MaskingRules maskingRules, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, BridgeConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.f46690a = z10;
        this.f46691b = z11;
        this.f46692c = str;
        this.f46693d = list;
        this.f46694e = maskingRules;
    }

    public static final /* synthetic */ void b(BridgeConfig bridgeConfig, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f46689f;
        dVar.x(serialDescriptor, 0, bridgeConfig.f46690a);
        dVar.x(serialDescriptor, 1, bridgeConfig.f46691b);
        dVar.B(serialDescriptor, 2, Y0.f144077a, bridgeConfig.f46692c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], bridgeConfig.f46693d);
        dVar.B(serialDescriptor, 4, JsonConfig$MaskingRules$$serializer.INSTANCE, bridgeConfig.f46694e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BridgeConfig)) {
            return false;
        }
        BridgeConfig bridgeConfig = (BridgeConfig) obj;
        return this.f46690a == bridgeConfig.f46690a && this.f46691b == bridgeConfig.f46691b && C17542s.e(this.f46692c, bridgeConfig.f46692c) && C17542s.e(this.f46693d, bridgeConfig.f46693d) && C17542s.e(this.f46694e, bridgeConfig.f46694e);
    }

    public int hashCode() {
        boolean z10 = this.f46690a;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        boolean z12 = this.f46691b;
        if (!z12) {
            z11 = z12;
        }
        int i11 = (i10 + (z11 ? 1 : 0)) * 31;
        String str = this.f46692c;
        int i12 = 0;
        int hashCode = (this.f46693d.hashCode() + ((i11 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        JsonConfig.MaskingRules maskingRules = this.f46694e;
        if (maskingRules != null) {
            i12 = maskingRules.hashCode();
        }
        return hashCode + i12;
    }

    public String toString() {
        return "BridgeConfig(isCrashReporterEnabled=" + this.f46690a + ", isApiErrorsEnabled=" + this.f46691b + ", tagId=" + this.f46692c + ", featureFlags=" + this.f46693d + ", maskingRules=" + this.f46694e + ')';
    }

    public BridgeConfig(boolean z10, boolean z11, String str, List<JsonConfig.FeatureFlag> list, JsonConfig.MaskingRules maskingRules) {
        C17542s.j(list, "featureFlags");
        this.f46690a = z10;
        this.f46691b = z11;
        this.f46692c = str;
        this.f46693d = list;
        this.f46694e = maskingRules;
    }
}
