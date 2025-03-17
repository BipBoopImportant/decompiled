package com.contentsquare.android.core.features.config.model;

import XH.C16807N;
import XH.C16814e;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import androidx.recyclerview.widget.RecyclerView;
import fK.p;
import fK.q;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.List;
import kK.C17514c;
import kK.C17516e;
import kK.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\u0018\u0000 \u00022\u00020\u0001:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig;", "", "a", "ApiErrors", "ApiErrorsV2", "ClientMode", "c", "FeatureFlag", "InAppConfig", "MaskingRules", "MaskingRulesFullMasking", "ProjectConfiguration", "ProjectConfigurations", "RootConfig", "SessionReplay", "StaticResourceManager", "WebView", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JsonConfig {

    /* renamed from: a  reason: collision with root package name */
    public static final c f46695a = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C16824o<D8.c> f46696b = C16825p.b(b.f46774c);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C17514c f46697c = v.b((C17514c) null, a.f46773c, 1, (Object) null);

    @p
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\b\u0018\u0000 32\u00020\u0001:\u00024!BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fBg\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010\"\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010$R \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010\"\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010$R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010-\u0012\u0004\b0\u0010&\u001a\u0004\b.\u0010/R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010-\u0012\u0004\b2\u0010&\u001a\u0004\b1\u0010/¨\u00065"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrors;", "", "", "collectStandardHeaders", "collectQueryParams", "collectRequestBody", "collectResponseBody", "", "", "validUrls", "validCustomHeaders", "<init>", "(ZZZZLjava/util/List;Ljava/util/List;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IZZZZLjava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "h", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrors;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "e", "()Z", "getCollectStandardHeaders$annotations", "()V", "b", "getCollectQueryParams$annotations", "c", "getCollectRequestBody$annotations", "d", "getCollectResponseBody$annotations", "Ljava/util/List;", "g", "()Ljava/util/List;", "getValidUrls$annotations", "f", "getValidCustomHeaders$annotations", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ApiErrors {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final KSerializer<Object>[] f46698g;

        /* renamed from: a  reason: collision with root package name */
        private final boolean f46699a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f46700b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f46701c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f46702d;

        /* renamed from: e  reason: collision with root package name */
        private final List<String> f46703e;

        /* renamed from: f  reason: collision with root package name */
        private final List<String> f46704f;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrors$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrors;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ApiErrors> serializer() {
                return JsonConfig$ApiErrors$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            Y0 y02 = Y0.f144077a;
            f46698g = new KSerializer[]{null, null, null, null, new C17451f(y02), new C17451f(y02)};
        }

        public ApiErrors() {
            this(false, false, false, false, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
        }

        public static final /* synthetic */ void h(ApiErrors apiErrors, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f46698g;
            if (dVar.z(serialDescriptor, 0) || apiErrors.f46699a) {
                dVar.x(serialDescriptor, 0, apiErrors.f46699a);
            }
            if (dVar.z(serialDescriptor, 1) || apiErrors.f46700b) {
                dVar.x(serialDescriptor, 1, apiErrors.f46700b);
            }
            if (dVar.z(serialDescriptor, 2) || apiErrors.f46701c) {
                dVar.x(serialDescriptor, 2, apiErrors.f46701c);
            }
            if (dVar.z(serialDescriptor, 3) || apiErrors.f46702d) {
                dVar.x(serialDescriptor, 3, apiErrors.f46702d);
            }
            if (dVar.z(serialDescriptor, 4) || !C17542s.e(apiErrors.f46703e, C16877v.n())) {
                dVar.i(serialDescriptor, 4, kSerializerArr[4], apiErrors.f46703e);
            }
            if (dVar.z(serialDescriptor, 5) || !C17542s.e(apiErrors.f46704f, C16877v.n())) {
                dVar.i(serialDescriptor, 5, kSerializerArr[5], apiErrors.f46704f);
            }
        }

        public final boolean b() {
            return this.f46700b;
        }

        public final boolean c() {
            return this.f46701c;
        }

        public final boolean d() {
            return this.f46702d;
        }

        public final boolean e() {
            return this.f46699a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApiErrors)) {
                return false;
            }
            ApiErrors apiErrors = (ApiErrors) obj;
            return this.f46699a == apiErrors.f46699a && this.f46700b == apiErrors.f46700b && this.f46701c == apiErrors.f46701c && this.f46702d == apiErrors.f46702d && C17542s.e(this.f46703e, apiErrors.f46703e) && C17542s.e(this.f46704f, apiErrors.f46704f);
        }

        public final List<String> f() {
            return this.f46704f;
        }

        public final List<String> g() {
            return this.f46703e;
        }

        public int hashCode() {
            boolean z10 = this.f46699a;
            boolean z11 = true;
            if (z10) {
                z10 = true;
            }
            int i10 = (z10 ? 1 : 0) * true;
            boolean z12 = this.f46700b;
            if (z12) {
                z12 = true;
            }
            int i11 = (i10 + (z12 ? 1 : 0)) * 31;
            boolean z13 = this.f46701c;
            if (z13) {
                z13 = true;
            }
            int i12 = (i11 + (z13 ? 1 : 0)) * 31;
            boolean z14 = this.f46702d;
            if (!z14) {
                z11 = z14;
            }
            return this.f46704f.hashCode() + ((this.f46703e.hashCode() + ((i12 + (z11 ? 1 : 0)) * 31)) * 31);
        }

        public String toString() {
            return "ApiErrors(collectStandardHeaders=" + this.f46699a + ", collectQueryParams=" + this.f46700b + ", collectRequestBody=" + this.f46701c + ", collectResponseBody=" + this.f46702d + ", validUrls=" + this.f46703e + ", validCustomHeaders=" + this.f46704f + ')';
        }

        @C16814e
        public /* synthetic */ ApiErrors(int i10, boolean z10, boolean z11, boolean z12, boolean z13, List list, List list2, T0 t02) {
            if ((i10 & 1) == 0) {
                this.f46699a = false;
            } else {
                this.f46699a = z10;
            }
            if ((i10 & 2) == 0) {
                this.f46700b = false;
            } else {
                this.f46700b = z11;
            }
            if ((i10 & 4) == 0) {
                this.f46701c = false;
            } else {
                this.f46701c = z12;
            }
            if ((i10 & 8) == 0) {
                this.f46702d = false;
            } else {
                this.f46702d = z13;
            }
            if ((i10 & 16) == 0) {
                this.f46703e = C16877v.n();
            } else {
                this.f46703e = list;
            }
            if ((i10 & 32) == 0) {
                this.f46704f = C16877v.n();
            } else {
                this.f46704f = list2;
            }
        }

        public ApiErrors(boolean z10, boolean z11, boolean z12, boolean z13, List<String> list, List<String> list2) {
            C17542s.j(list, "validUrls");
            C17542s.j(list2, "validCustomHeaders");
            this.f46699a = z10;
            this.f46700b = z11;
            this.f46701c = z12;
            this.f46702d = z13;
            this.f46703e = list;
            this.f46704f = list2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ ApiErrors(boolean r5, boolean r6, boolean r7, boolean r8, java.util.List r9, java.util.List r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r4 = this;
                r12 = r11 & 1
                r0 = 0
                if (r12 == 0) goto L_0x0007
                r12 = r0
                goto L_0x0008
            L_0x0007:
                r12 = r5
            L_0x0008:
                r5 = r11 & 2
                if (r5 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r6
            L_0x000f:
                r5 = r11 & 4
                if (r5 == 0) goto L_0x0015
                r2 = r0
                goto L_0x0016
            L_0x0015:
                r2 = r7
            L_0x0016:
                r5 = r11 & 8
                if (r5 == 0) goto L_0x001b
                goto L_0x001c
            L_0x001b:
                r0 = r8
            L_0x001c:
                r5 = r11 & 16
                if (r5 == 0) goto L_0x0024
                java.util.List r9 = YH.C16877v.n()
            L_0x0024:
                r3 = r9
                r5 = r11 & 32
                if (r5 == 0) goto L_0x002d
                java.util.List r10 = YH.C16877v.n()
            L_0x002d:
                r11 = r10
                r5 = r4
                r6 = r12
                r7 = r1
                r8 = r2
                r9 = r0
                r10 = r3
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.core.features.config.model.JsonConfig.ApiErrors.<init>(boolean, boolean, boolean, boolean, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\b\u0018\u0000 (2\u00020\u0001:\u0005)*+\u001e,B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006-"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2;", "", "", "collectStandardHeaders", "", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CollectionRule;", "collectionRules", "<init>", "(ZLjava/util/List;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IZLjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "getCollectStandardHeaders$annotations", "()V", "Ljava/util/List;", "c", "()Ljava/util/List;", "getCollectionRules$annotations", "Companion", "$serializer", "BodyAttributePath", "CollectionRule", "CustomHeader", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ApiErrorsV2 {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final KSerializer<Object>[] f46705c = {null, new C17451f(JsonConfig$ApiErrorsV2$CollectionRule$$serializer.INSTANCE)};

        /* renamed from: a  reason: collision with root package name */
        private final boolean f46706a;

        /* renamed from: b  reason: collision with root package name */
        private final List<CollectionRule> f46707b;

        @p
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001dB?\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b#\u0010\u0017¨\u0006&"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$BodyAttributePath;", "", "", "seen1", "", "path", "", "encrypted", "primary", "type", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;ZZLjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$BodyAttributePath;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "d", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BodyAttributePath {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f46708a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f46709b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f46710c;

            /* renamed from: d  reason: collision with root package name */
            private final String f46711d;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$BodyAttributePath$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$BodyAttributePath;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<BodyAttributePath> serializer() {
                    return JsonConfig$ApiErrorsV2$BodyAttributePath$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @C16814e
            public /* synthetic */ BodyAttributePath(int i10, String str, boolean z10, boolean z11, String str2, T0 t02) {
                if (15 != (i10 & 15)) {
                    E0.b(i10, 15, JsonConfig$ApiErrorsV2$BodyAttributePath$$serializer.INSTANCE.getDescriptor());
                }
                this.f46708a = str;
                this.f46709b = z10;
                this.f46710c = z11;
                this.f46711d = str2;
            }

            public static final /* synthetic */ void e(BodyAttributePath bodyAttributePath, C17395d dVar, SerialDescriptor serialDescriptor) {
                dVar.y(serialDescriptor, 0, bodyAttributePath.f46708a);
                dVar.x(serialDescriptor, 1, bodyAttributePath.f46709b);
                dVar.x(serialDescriptor, 2, bodyAttributePath.f46710c);
                dVar.y(serialDescriptor, 3, bodyAttributePath.f46711d);
            }

            public final boolean a() {
                return this.f46709b;
            }

            public final String b() {
                return this.f46708a;
            }

            public final boolean c() {
                return this.f46710c;
            }

            public final String d() {
                return this.f46711d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BodyAttributePath)) {
                    return false;
                }
                BodyAttributePath bodyAttributePath = (BodyAttributePath) obj;
                return C17542s.e(this.f46708a, bodyAttributePath.f46708a) && this.f46709b == bodyAttributePath.f46709b && this.f46710c == bodyAttributePath.f46710c && C17542s.e(this.f46711d, bodyAttributePath.f46711d);
            }

            public int hashCode() {
                int hashCode = this.f46708a.hashCode() * 31;
                boolean z10 = this.f46709b;
                boolean z11 = true;
                if (z10) {
                    z10 = true;
                }
                int i10 = (hashCode + (z10 ? 1 : 0)) * 31;
                boolean z12 = this.f46710c;
                if (!z12) {
                    z11 = z12;
                }
                return this.f46711d.hashCode() + ((i10 + (z11 ? 1 : 0)) * 31);
            }

            public String toString() {
                return "BodyAttributePath(path=" + this.f46708a + ", encrypted=" + this.f46709b + ", primary=" + this.f46710c + ", type=" + this.f46711d + ')';
            }
        }

        @p
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\b\u0018\u0000 =2\u00020\u0001:\u0002>%Bi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\u0010\u0010\u0011B\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010&\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u001fR \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b3\u0010-\u001a\u0004\b0\u00102R \u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u00101\u0012\u0004\b5\u0010-\u001a\u0004\b4\u00102R \u0010\n\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00101\u0012\u0004\b7\u0010-\u001a\u0004\b6\u00102R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b;\u0010-\u001a\u0004\b(\u0010:R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u00109\u0012\u0004\b<\u0010-\u001a\u0004\b8\u0010:¨\u0006?"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CollectionRule;", "", "", "url", "", "statusCode", "bodyContent", "", "collectQueryParams", "collectRequestBody", "collectResponseBody", "", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$BodyAttributePath;", "bodyAttributePaths", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CustomHeader;", "customHeaders", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZZLjava/util/List;Ljava/util/List;)V", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZZLjava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "j", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CollectionRule;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "getStatusCode$annotations", "()V", "c", "getBodyContent$annotations", "d", "Z", "()Z", "getCollectQueryParams$annotations", "e", "getCollectRequestBody$annotations", "f", "getCollectResponseBody$annotations", "g", "Ljava/util/List;", "()Ljava/util/List;", "getBodyAttributePaths$annotations", "getCustomHeaders$annotations", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CollectionRule {
            public static final a Companion = new a((DefaultConstructorMarker) null);
            /* access modifiers changed from: private */

            /* renamed from: i  reason: collision with root package name */
            public static final KSerializer<Object>[] f46712i = {null, null, null, null, null, null, new C17451f(JsonConfig$ApiErrorsV2$BodyAttributePath$$serializer.INSTANCE), new C17451f(JsonConfig$ApiErrorsV2$CustomHeader$$serializer.INSTANCE)};

            /* renamed from: a  reason: collision with root package name */
            private final String f46713a;

            /* renamed from: b  reason: collision with root package name */
            private final Integer f46714b;

            /* renamed from: c  reason: collision with root package name */
            private final String f46715c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f46716d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f46717e;

            /* renamed from: f  reason: collision with root package name */
            private final boolean f46718f;

            /* renamed from: g  reason: collision with root package name */
            private final List<BodyAttributePath> f46719g;

            /* renamed from: h  reason: collision with root package name */
            private final List<CustomHeader> f46720h;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CollectionRule$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CollectionRule;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<CollectionRule> serializer() {
                    return JsonConfig$ApiErrorsV2$CollectionRule$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public CollectionRule() {
                this((String) null, (Integer) null, (String) null, false, false, false, (List) null, (List) null, 255, (DefaultConstructorMarker) null);
            }

            public static final /* synthetic */ void j(CollectionRule collectionRule, C17395d dVar, SerialDescriptor serialDescriptor) {
                KSerializer<Object>[] kSerializerArr = f46712i;
                if (dVar.z(serialDescriptor, 0) || collectionRule.f46713a != null) {
                    dVar.B(serialDescriptor, 0, Y0.f144077a, collectionRule.f46713a);
                }
                if (dVar.z(serialDescriptor, 1) || collectionRule.f46714b != null) {
                    dVar.B(serialDescriptor, 1, X.f144073a, collectionRule.f46714b);
                }
                if (dVar.z(serialDescriptor, 2) || collectionRule.f46715c != null) {
                    dVar.B(serialDescriptor, 2, Y0.f144077a, collectionRule.f46715c);
                }
                if (dVar.z(serialDescriptor, 3) || collectionRule.f46716d) {
                    dVar.x(serialDescriptor, 3, collectionRule.f46716d);
                }
                if (dVar.z(serialDescriptor, 4) || collectionRule.f46717e) {
                    dVar.x(serialDescriptor, 4, collectionRule.f46717e);
                }
                if (dVar.z(serialDescriptor, 5) || collectionRule.f46718f) {
                    dVar.x(serialDescriptor, 5, collectionRule.f46718f);
                }
                if (dVar.z(serialDescriptor, 6) || !C17542s.e(collectionRule.f46719g, C16877v.n())) {
                    dVar.i(serialDescriptor, 6, kSerializerArr[6], collectionRule.f46719g);
                }
                if (dVar.z(serialDescriptor, 7) || !C17542s.e(collectionRule.f46720h, C16877v.n())) {
                    dVar.i(serialDescriptor, 7, kSerializerArr[7], collectionRule.f46720h);
                }
            }

            public final List<BodyAttributePath> b() {
                return this.f46719g;
            }

            public final String c() {
                return this.f46715c;
            }

            public final boolean d() {
                return this.f46716d;
            }

            public final boolean e() {
                return this.f46717e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CollectionRule)) {
                    return false;
                }
                CollectionRule collectionRule = (CollectionRule) obj;
                return C17542s.e(this.f46713a, collectionRule.f46713a) && C17542s.e(this.f46714b, collectionRule.f46714b) && C17542s.e(this.f46715c, collectionRule.f46715c) && this.f46716d == collectionRule.f46716d && this.f46717e == collectionRule.f46717e && this.f46718f == collectionRule.f46718f && C17542s.e(this.f46719g, collectionRule.f46719g) && C17542s.e(this.f46720h, collectionRule.f46720h);
            }

            public final boolean f() {
                return this.f46718f;
            }

            public final List<CustomHeader> g() {
                return this.f46720h;
            }

            public final Integer h() {
                return this.f46714b;
            }

            public int hashCode() {
                String str = this.f46713a;
                int i10 = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.f46714b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.f46715c;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                int i11 = (hashCode2 + i10) * 31;
                boolean z10 = this.f46716d;
                boolean z11 = true;
                if (z10) {
                    z10 = true;
                }
                int i12 = (i11 + (z10 ? 1 : 0)) * 31;
                boolean z12 = this.f46717e;
                if (z12) {
                    z12 = true;
                }
                int i13 = (i12 + (z12 ? 1 : 0)) * 31;
                boolean z13 = this.f46718f;
                if (!z13) {
                    z11 = z13;
                }
                return this.f46720h.hashCode() + ((this.f46719g.hashCode() + ((i13 + (z11 ? 1 : 0)) * 31)) * 31);
            }

            public final String i() {
                return this.f46713a;
            }

            public String toString() {
                return "CollectionRule(url=" + this.f46713a + ", statusCode=" + this.f46714b + ", bodyContent=" + this.f46715c + ", collectQueryParams=" + this.f46716d + ", collectRequestBody=" + this.f46717e + ", collectResponseBody=" + this.f46718f + ", bodyAttributePaths=" + this.f46719g + ", customHeaders=" + this.f46720h + ')';
            }

            @C16814e
            public /* synthetic */ CollectionRule(int i10, String str, Integer num, String str2, boolean z10, boolean z11, boolean z12, List list, List list2, T0 t02) {
                if ((i10 & 1) == 0) {
                    this.f46713a = null;
                } else {
                    this.f46713a = str;
                }
                if ((i10 & 2) == 0) {
                    this.f46714b = null;
                } else {
                    this.f46714b = num;
                }
                if ((i10 & 4) == 0) {
                    this.f46715c = null;
                } else {
                    this.f46715c = str2;
                }
                if ((i10 & 8) == 0) {
                    this.f46716d = false;
                } else {
                    this.f46716d = z10;
                }
                if ((i10 & 16) == 0) {
                    this.f46717e = false;
                } else {
                    this.f46717e = z11;
                }
                if ((i10 & 32) == 0) {
                    this.f46718f = false;
                } else {
                    this.f46718f = z12;
                }
                if ((i10 & 64) == 0) {
                    this.f46719g = C16877v.n();
                } else {
                    this.f46719g = list;
                }
                if ((i10 & 128) == 0) {
                    this.f46720h = C16877v.n();
                } else {
                    this.f46720h = list2;
                }
            }

            public CollectionRule(String str, Integer num, String str2, boolean z10, boolean z11, boolean z12, List<BodyAttributePath> list, List<CustomHeader> list2) {
                C17542s.j(list, "bodyAttributePaths");
                C17542s.j(list2, "customHeaders");
                this.f46713a = str;
                this.f46714b = num;
                this.f46715c = str2;
                this.f46716d = z10;
                this.f46717e = z11;
                this.f46718f = z12;
                this.f46719g = list;
                this.f46720h = list2;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ CollectionRule(java.lang.String r9, java.lang.Integer r10, java.lang.String r11, boolean r12, boolean r13, boolean r14, java.util.List r15, java.util.List r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
                /*
                    r8 = this;
                    r0 = r17
                    r1 = r0 & 1
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r1 = r2
                    goto L_0x000a
                L_0x0009:
                    r1 = r9
                L_0x000a:
                    r3 = r0 & 2
                    if (r3 == 0) goto L_0x0010
                    r3 = r2
                    goto L_0x0011
                L_0x0010:
                    r3 = r10
                L_0x0011:
                    r4 = r0 & 4
                    if (r4 == 0) goto L_0x0016
                    goto L_0x0017
                L_0x0016:
                    r2 = r11
                L_0x0017:
                    r4 = r0 & 8
                    r5 = 0
                    if (r4 == 0) goto L_0x001e
                    r4 = r5
                    goto L_0x001f
                L_0x001e:
                    r4 = r12
                L_0x001f:
                    r6 = r0 & 16
                    if (r6 == 0) goto L_0x0025
                    r6 = r5
                    goto L_0x0026
                L_0x0025:
                    r6 = r13
                L_0x0026:
                    r7 = r0 & 32
                    if (r7 == 0) goto L_0x002b
                    goto L_0x002c
                L_0x002b:
                    r5 = r14
                L_0x002c:
                    r7 = r0 & 64
                    if (r7 == 0) goto L_0x0035
                    java.util.List r7 = YH.C16877v.n()
                    goto L_0x0036
                L_0x0035:
                    r7 = r15
                L_0x0036:
                    r0 = r0 & 128(0x80, float:1.794E-43)
                    if (r0 == 0) goto L_0x003f
                    java.util.List r0 = YH.C16877v.n()
                    goto L_0x0041
                L_0x003f:
                    r0 = r16
                L_0x0041:
                    r9 = r8
                    r10 = r1
                    r11 = r3
                    r12 = r2
                    r13 = r4
                    r14 = r6
                    r15 = r5
                    r16 = r7
                    r17 = r0
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.core.features.config.model.JsonConfig.ApiErrorsV2.CollectionRule.<init>(java.lang.String, java.lang.Integer, java.lang.String, boolean, boolean, boolean, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        @p
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB9\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001c\u0010\"R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CustomHeader;", "", "", "seen1", "", "headerName", "", "encrypted", "type", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;ZLjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CustomHeader;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getHeaderName$annotations", "()V", "Z", "()Z", "c", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CustomHeader {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f46721a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f46722b;

            /* renamed from: c  reason: collision with root package name */
            private final String f46723c;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CustomHeader$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CustomHeader;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<CustomHeader> serializer() {
                    return JsonConfig$ApiErrorsV2$CustomHeader$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @C16814e
            public /* synthetic */ CustomHeader(int i10, String str, boolean z10, String str2, T0 t02) {
                if (7 != (i10 & 7)) {
                    E0.b(i10, 7, JsonConfig$ApiErrorsV2$CustomHeader$$serializer.INSTANCE.getDescriptor());
                }
                this.f46721a = str;
                this.f46722b = z10;
                this.f46723c = str2;
            }

            public static final /* synthetic */ void d(CustomHeader customHeader, C17395d dVar, SerialDescriptor serialDescriptor) {
                dVar.y(serialDescriptor, 0, customHeader.f46721a);
                dVar.x(serialDescriptor, 1, customHeader.f46722b);
                dVar.y(serialDescriptor, 2, customHeader.f46723c);
            }

            public final boolean a() {
                return this.f46722b;
            }

            public final String b() {
                return this.f46721a;
            }

            public final String c() {
                return this.f46723c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CustomHeader)) {
                    return false;
                }
                CustomHeader customHeader = (CustomHeader) obj;
                return C17542s.e(this.f46721a, customHeader.f46721a) && this.f46722b == customHeader.f46722b && C17542s.e(this.f46723c, customHeader.f46723c);
            }

            public int hashCode() {
                int hashCode = this.f46721a.hashCode() * 31;
                boolean z10 = this.f46722b;
                if (z10) {
                    z10 = true;
                }
                return this.f46723c.hashCode() + ((hashCode + (z10 ? 1 : 0)) * 31);
            }

            public String toString() {
                return "CustomHeader(headerName=" + this.f46721a + ", encrypted=" + this.f46722b + ", type=" + this.f46723c + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ApiErrorsV2> serializer() {
                return JsonConfig$ApiErrorsV2$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public ApiErrorsV2() {
            this(false, (List) null, 3, (DefaultConstructorMarker) null);
        }

        public static final /* synthetic */ void d(ApiErrorsV2 apiErrorsV2, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f46705c;
            if (dVar.z(serialDescriptor, 0) || apiErrorsV2.f46706a) {
                dVar.x(serialDescriptor, 0, apiErrorsV2.f46706a);
            }
            if (dVar.z(serialDescriptor, 1) || !C17542s.e(apiErrorsV2.f46707b, C16877v.n())) {
                dVar.i(serialDescriptor, 1, kSerializerArr[1], apiErrorsV2.f46707b);
            }
        }

        public final boolean b() {
            return this.f46706a;
        }

        public final List<CollectionRule> c() {
            return this.f46707b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApiErrorsV2)) {
                return false;
            }
            ApiErrorsV2 apiErrorsV2 = (ApiErrorsV2) obj;
            return this.f46706a == apiErrorsV2.f46706a && C17542s.e(this.f46707b, apiErrorsV2.f46707b);
        }

        public int hashCode() {
            boolean z10 = this.f46706a;
            if (z10) {
                z10 = true;
            }
            return this.f46707b.hashCode() + ((z10 ? 1 : 0) * true);
        }

        public String toString() {
            return "ApiErrorsV2(collectStandardHeaders=" + this.f46706a + ", collectionRules=" + this.f46707b + ')';
        }

        @C16814e
        public /* synthetic */ ApiErrorsV2(int i10, boolean z10, List list, T0 t02) {
            this.f46706a = (i10 & 1) == 0 ? false : z10;
            if ((i10 & 2) == 0) {
                this.f46707b = C16877v.n();
            } else {
                this.f46707b = list;
            }
        }

        public ApiErrorsV2(boolean z10, List<CollectionRule> list) {
            C17542s.j(list, "collectionRules");
            this.f46706a = z10;
            this.f46707b = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ApiErrorsV2(boolean z10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? C16877v.n() : list);
        }
    }

    @p
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\b\u0018\u0000 \"2\u00020\u0001:\u0002#\u001bB/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\u0015¨\u0006$"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ClientMode;", "", "", "seen1", "", "snapshot", "", "snapshotEndpoint", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IZLjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$ClientMode;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getSnapshot", "()Z", "Ljava/lang/String;", "getSnapshotEndpoint$annotations", "()V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ClientMode {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f46724a;

        /* renamed from: b  reason: collision with root package name */
        private final String f46725b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ClientMode$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ClientMode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ClientMode> serializer() {
                return JsonConfig$ClientMode$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @C16814e
        public /* synthetic */ ClientMode(int i10, boolean z10, String str, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, JsonConfig$ClientMode$$serializer.INSTANCE.getDescriptor());
            }
            this.f46724a = z10;
            this.f46725b = str;
        }

        public static final /* synthetic */ void b(ClientMode clientMode, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.x(serialDescriptor, 0, clientMode.f46724a);
            dVar.y(serialDescriptor, 1, clientMode.f46725b);
        }

        public final String a() {
            return this.f46725b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientMode)) {
                return false;
            }
            ClientMode clientMode = (ClientMode) obj;
            return this.f46724a == clientMode.f46724a && C17542s.e(this.f46725b, clientMode.f46725b);
        }

        public int hashCode() {
            boolean z10 = this.f46724a;
            if (z10) {
                z10 = true;
            }
            return this.f46725b.hashCode() + ((z10 ? 1 : 0) * true);
        }

        public String toString() {
            return "ClientMode(snapshot=" + this.f46724a + ", snapshotEndpoint=" + this.f46725b + ')';
        }
    }

    @p
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB9\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001c\u0010#¨\u0006&"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$FeatureFlag;", "", "", "seen1", "", "name", "minVersion", "", "enabled", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$FeatureFlag;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getMinVersion$annotations", "()V", "Z", "()Z", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FeatureFlag {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f46726a;

        /* renamed from: b  reason: collision with root package name */
        private final String f46727b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f46728c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$FeatureFlag$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$FeatureFlag;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<FeatureFlag> serializer() {
                return JsonConfig$FeatureFlag$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @C16814e
        public /* synthetic */ FeatureFlag(int i10, String str, String str2, boolean z10, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, JsonConfig$FeatureFlag$$serializer.INSTANCE.getDescriptor());
            }
            this.f46726a = str;
            this.f46727b = str2;
            this.f46728c = z10;
        }

        public static final /* synthetic */ void d(FeatureFlag featureFlag, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, featureFlag.f46726a);
            dVar.y(serialDescriptor, 1, featureFlag.f46727b);
            dVar.x(serialDescriptor, 2, featureFlag.f46728c);
        }

        public final boolean a() {
            return this.f46728c;
        }

        public final String b() {
            return this.f46727b;
        }

        public final String c() {
            return this.f46726a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeatureFlag)) {
                return false;
            }
            FeatureFlag featureFlag = (FeatureFlag) obj;
            return C17542s.e(this.f46726a, featureFlag.f46726a) && C17542s.e(this.f46727b, featureFlag.f46727b) && this.f46728c == featureFlag.f46728c;
        }

        public int hashCode() {
            int hashCode = (this.f46727b.hashCode() + (this.f46726a.hashCode() * 31)) * 31;
            boolean z10 = this.f46728c;
            if (z10) {
                z10 = true;
            }
            return hashCode + (z10 ? 1 : 0);
        }

        public String toString() {
            return "FeatureFlag(name=" + this.f46726a + ", minVersion=" + this.f46727b + ", enabled=" + this.f46728c + ')';
        }
    }

    @p
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001cB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006%"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$InAppConfig;", "", "", "activationKey", "", "enabled", "<init>", "(Ljava/lang/String;Z)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$InAppConfig;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getActivationKey", "getActivationKey$annotations", "()V", "Z", "()Z", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InAppConfig {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f46729a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f46730b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$InAppConfig$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$InAppConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<InAppConfig> serializer() {
                return JsonConfig$InAppConfig$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public InAppConfig() {
            this((String) null, false, 3, (DefaultConstructorMarker) null);
        }

        public static final /* synthetic */ void b(InAppConfig inAppConfig, C17395d dVar, SerialDescriptor serialDescriptor) {
            if (dVar.z(serialDescriptor, 0) || !C17542s.e(inAppConfig.f46729a, "")) {
                dVar.y(serialDescriptor, 0, inAppConfig.f46729a);
            }
            if (dVar.z(serialDescriptor, 1) || inAppConfig.f46730b) {
                dVar.x(serialDescriptor, 1, inAppConfig.f46730b);
            }
        }

        public final boolean a() {
            return this.f46730b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppConfig)) {
                return false;
            }
            InAppConfig inAppConfig = (InAppConfig) obj;
            return C17542s.e(this.f46729a, inAppConfig.f46729a) && this.f46730b == inAppConfig.f46730b;
        }

        public int hashCode() {
            int hashCode = this.f46729a.hashCode() * 31;
            boolean z10 = this.f46730b;
            if (z10) {
                z10 = true;
            }
            return hashCode + (z10 ? 1 : 0);
        }

        public String toString() {
            return "InAppConfig(activationKey=" + this.f46729a + ", enabled=" + this.f46730b + ')';
        }

        @C16814e
        public /* synthetic */ InAppConfig(int i10, String str, boolean z10, T0 t02) {
            this.f46729a = (i10 & 1) == 0 ? "" : str;
            if ((i10 & 2) == 0) {
                this.f46730b = false;
            } else {
                this.f46730b = z10;
            }
        }

        public InAppConfig(String str, boolean z10) {
            C17542s.j(str, "activationKey");
            this.f46729a = str;
            this.f46730b = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ InAppConfig(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
        }
    }

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 !2\u00020\u0001:\u0002\"\u001cB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u001e¨\u0006#"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules;", "", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRulesFullMasking;", "fullMasking", "<init>", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRulesFullMasking;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRulesFullMasking;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRulesFullMasking;", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRulesFullMasking;", "getFullMasking$annotations", "()V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MaskingRules {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final MaskingRulesFullMasking f46731a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<MaskingRules> serializer() {
                return JsonConfig$MaskingRules$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public MaskingRules() {
            this((MaskingRulesFullMasking) null, 1, (DefaultConstructorMarker) null);
        }

        public static final /* synthetic */ void b(MaskingRules maskingRules, C17395d dVar, SerialDescriptor serialDescriptor) {
            if (dVar.z(serialDescriptor, 0) || !C17542s.e(maskingRules.f46731a, new MaskingRulesFullMasking((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null))) {
                dVar.i(serialDescriptor, 0, JsonConfig$MaskingRulesFullMasking$$serializer.INSTANCE, maskingRules.f46731a);
            }
        }

        public final MaskingRulesFullMasking a() {
            return this.f46731a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MaskingRules) && C17542s.e(this.f46731a, ((MaskingRules) obj).f46731a);
        }

        public int hashCode() {
            return this.f46731a.hashCode();
        }

        public String toString() {
            return "MaskingRules(fullMasking=" + this.f46731a + ')';
        }

        @C16814e
        public /* synthetic */ MaskingRules(int i10, MaskingRulesFullMasking maskingRulesFullMasking, T0 t02) {
            if ((i10 & 1) == 0) {
                this.f46731a = new MaskingRulesFullMasking((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
            } else {
                this.f46731a = maskingRulesFullMasking;
            }
        }

        public MaskingRules(MaskingRulesFullMasking maskingRulesFullMasking) {
            C17542s.j(maskingRulesFullMasking, "fullMasking");
            this.f46731a = maskingRulesFullMasking;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MaskingRules(MaskingRulesFullMasking maskingRulesFullMasking, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new MaskingRulesFullMasking((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : maskingRulesFullMasking);
        }
    }

    @p
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u001eB7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bBM\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001f\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010!¨\u0006("}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRulesFullMasking;", "", "", "", "app", "sdk", "flutterPlugin", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRulesFullMasking;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "getFlutterPlugin", "getFlutterPlugin$annotations", "()V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MaskingRulesFullMasking {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final KSerializer<Object>[] f46732d;

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f46733a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f46734b;

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f46735c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRulesFullMasking$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRulesFullMasking;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<MaskingRulesFullMasking> serializer() {
                return JsonConfig$MaskingRulesFullMasking$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            Y0 y02 = Y0.f144077a;
            f46732d = new KSerializer[]{new C17451f(y02), new C17451f(y02), new C17451f(y02)};
        }

        public MaskingRulesFullMasking() {
            this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        }

        public static final /* synthetic */ void d(MaskingRulesFullMasking maskingRulesFullMasking, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f46732d;
            if (dVar.z(serialDescriptor, 0) || !C17542s.e(maskingRulesFullMasking.f46733a, C16877v.n())) {
                dVar.i(serialDescriptor, 0, kSerializerArr[0], maskingRulesFullMasking.f46733a);
            }
            if (dVar.z(serialDescriptor, 1) || !C17542s.e(maskingRulesFullMasking.f46734b, C16877v.n())) {
                dVar.i(serialDescriptor, 1, kSerializerArr[1], maskingRulesFullMasking.f46734b);
            }
            if (dVar.z(serialDescriptor, 2) || !C17542s.e(maskingRulesFullMasking.f46735c, C16877v.n())) {
                dVar.i(serialDescriptor, 2, kSerializerArr[2], maskingRulesFullMasking.f46735c);
            }
        }

        public final List<String> b() {
            return this.f46733a;
        }

        public final List<String> c() {
            return this.f46734b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MaskingRulesFullMasking)) {
                return false;
            }
            MaskingRulesFullMasking maskingRulesFullMasking = (MaskingRulesFullMasking) obj;
            return C17542s.e(this.f46733a, maskingRulesFullMasking.f46733a) && C17542s.e(this.f46734b, maskingRulesFullMasking.f46734b) && C17542s.e(this.f46735c, maskingRulesFullMasking.f46735c);
        }

        public int hashCode() {
            int hashCode = this.f46734b.hashCode();
            return this.f46735c.hashCode() + ((hashCode + (this.f46733a.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "MaskingRulesFullMasking(app=" + this.f46733a + ", sdk=" + this.f46734b + ", flutterPlugin=" + this.f46735c + ')';
        }

        @C16814e
        public /* synthetic */ MaskingRulesFullMasking(int i10, List<String> list, List list2, List list3, T0 t02) {
            this.f46733a = (i10 & 1) == 0 ? C16877v.n() : list;
            if ((i10 & 2) == 0) {
                this.f46734b = C16877v.n();
            } else {
                this.f46734b = list2;
            }
            if ((i10 & 4) == 0) {
                this.f46735c = C16877v.n();
            } else {
                this.f46735c = list3;
            }
        }

        public MaskingRulesFullMasking(List<String> list, List<String> list2, List<String> list3) {
            C17542s.j(list, "app");
            C17542s.j(list2, "sdk");
            C17542s.j(list3, "flutterPlugin");
            this.f46733a = list;
            this.f46734b = list2;
            this.f46735c = list3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MaskingRulesFullMasking(List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C16877v.n() : list, (i10 & 2) != 0 ? C16877v.n() : list2, (i10 & 4) != 0 ? C16877v.n() : list3);
        }
    }

    @p
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bI\b\b\u0018\u0000 r2\u00020\u0001:\u0002s5Bå\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J(\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)HÇ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bD\u0010:\u001a\u0004\bB\u00101R \u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bE\u00106\u0012\u0004\bG\u0010:\u001a\u0004\bF\u00108R \u0010\f\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bF\u0010C\u0012\u0004\bI\u0010:\u001a\u0004\bH\u00101R \u0010\r\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bJ\u00106\u0012\u0004\bL\u0010:\u001a\u0004\bK\u00108R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\bM\u0010N\u0012\u0004\bP\u0010:\u001a\u0004\bE\u0010OR \u0010\u0011\u001a\u00020\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010:\u001a\u0004\bS\u0010TR \u0010\u0013\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u0010V\u0012\u0004\bY\u0010:\u001a\u0004\bW\u0010XR&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0004¢\u0006\u0012\n\u0004\bZ\u0010[\u0012\u0004\b]\u0010:\u001a\u0004\bZ\u0010\\R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bS\u0010^\u0012\u0004\b`\u0010:\u001a\u0004\bQ\u0010_R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bK\u0010<\u0012\u0004\ba\u0010:\u001a\u0004\bM\u0010/R \u0010\u001a\u001a\u00020\u00198\u0006X\u0004¢\u0006\u0012\n\u0004\b@\u0010b\u0012\u0004\bd\u0010:\u001a\u0004\b;\u0010cR\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0004¢\u0006\u0012\n\u0004\bW\u0010e\u0012\u0004\bg\u0010:\u001a\u0004\b>\u0010fR \u0010\u001e\u001a\u00020\u001d8\u0006X\u0004¢\u0006\u0012\n\u0004\bH\u0010h\u0012\u0004\bk\u0010:\u001a\u0004\bi\u0010jR \u0010 \u001a\u00020\u001f8\u0006X\u0004¢\u0006\u0012\n\u0004\bl\u0010m\u0012\u0004\bo\u0010:\u001a\u0004\bl\u0010nR\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u0010C\u001a\u0004\bJ\u00101\"\u0004\bp\u0010q¨\u0006t"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;", "", "", "seen1", "", "trackingEnabled", "", "endpoint", "", "sample", "bucketSize", "crashHandler", "sessionTimeout", "optOutByDefault", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ClientMode;", "clientMode", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$InAppConfig;", "inAppConfig", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$SessionReplay;", "sessionReplay", "", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$FeatureFlag;", "featureFlags", "encryptionPublicKeyId", "encryptionPublicKey", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrors;", "apiErrors", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2;", "apiErrorsV2", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$WebView;", "webView", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$StaticResourceManager;", "staticResourceManager", "csProjectId", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IZLjava/lang/String;FIZIZLcom/contentsquare/android/core/features/config/model/JsonConfig$ClientMode;Lcom/contentsquare/android/core/features/config/model/JsonConfig$InAppConfig;Lcom/contentsquare/android/core/features/config/model/JsonConfig$SessionReplay;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrors;Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2;Lcom/contentsquare/android/core/features/config/model/JsonConfig$WebView;Lcom/contentsquare/android/core/features/config/model/JsonConfig$StaticResourceManager;ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "u", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "r", "()Z", "getTrackingEnabled$annotations", "()V", "b", "Ljava/lang/String;", "j", "c", "F", "n", "()F", "d", "I", "getBucketSize$annotations", "e", "f", "getCrashHandler$annotations", "p", "getSessionTimeout$annotations", "g", "m", "getOptOutByDefault$annotations", "h", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ClientMode;", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$ClientMode;", "getClientMode$annotations", "i", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$InAppConfig;", "l", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$InAppConfig;", "getInAppConfig$annotations", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$SessionReplay;", "o", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$SessionReplay;", "getSessionReplay$annotations", "k", "Ljava/util/List;", "()Ljava/util/List;", "getFeatureFlags$annotations", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getEncryptionPublicKeyId$annotations", "getEncryptionPublicKey$annotations", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrors;", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrors;", "getApiErrors$annotations", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2;", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2;", "getApiErrorsV2$annotations", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$WebView;", "s", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$WebView;", "getWebView$annotations", "q", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$StaticResourceManager;", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$StaticResourceManager;", "getStaticResourceManager$annotations", "t", "(I)V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ProjectConfiguration {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public static final KSerializer<Object>[] f46736s = {null, null, null, null, null, null, null, null, null, null, new C17451f(JsonConfig$FeatureFlag$$serializer.INSTANCE), null, null, null, null, null, null, null};

        /* renamed from: a  reason: collision with root package name */
        private final boolean f46737a;

        /* renamed from: b  reason: collision with root package name */
        private final String f46738b;

        /* renamed from: c  reason: collision with root package name */
        private final float f46739c;

        /* renamed from: d  reason: collision with root package name */
        private final int f46740d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f46741e;

        /* renamed from: f  reason: collision with root package name */
        private final int f46742f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f46743g;

        /* renamed from: h  reason: collision with root package name */
        private final ClientMode f46744h;

        /* renamed from: i  reason: collision with root package name */
        private final InAppConfig f46745i;

        /* renamed from: j  reason: collision with root package name */
        private final SessionReplay f46746j;

        /* renamed from: k  reason: collision with root package name */
        private final List<FeatureFlag> f46747k;

        /* renamed from: l  reason: collision with root package name */
        private final Integer f46748l;

        /* renamed from: m  reason: collision with root package name */
        private final String f46749m;

        /* renamed from: n  reason: collision with root package name */
        private final ApiErrors f46750n;

        /* renamed from: o  reason: collision with root package name */
        private final ApiErrorsV2 f46751o;

        /* renamed from: p  reason: collision with root package name */
        private final WebView f46752p;

        /* renamed from: q  reason: collision with root package name */
        private final StaticResourceManager f46753q;

        /* renamed from: r  reason: collision with root package name */
        private int f46754r;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ProjectConfiguration> serializer() {
                return JsonConfig$ProjectConfiguration$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @C16814e
        public /* synthetic */ ProjectConfiguration(int i10, boolean z10, String str, float f10, int i11, boolean z11, int i12, boolean z12, ClientMode clientMode, InAppConfig inAppConfig, SessionReplay sessionReplay, List list, Integer num, String str2, ApiErrors apiErrors, ApiErrorsV2 apiErrorsV2, WebView webView, StaticResourceManager staticResourceManager, int i13, T0 t02) {
            int i14 = i10;
            if (255 != (i14 & 255)) {
                E0.b(i14, 255, JsonConfig$ProjectConfiguration$$serializer.INSTANCE.getDescriptor());
            }
            this.f46737a = z10;
            this.f46738b = str;
            this.f46739c = f10;
            this.f46740d = i11;
            this.f46741e = z11;
            this.f46742f = i12;
            this.f46743g = z12;
            this.f46744h = clientMode;
            this.f46745i = (i14 & 256) == 0 ? new InAppConfig((String) null, false, 3, (DefaultConstructorMarker) null) : inAppConfig;
            this.f46746j = (i14 & 512) == 0 ? new SessionReplay((String) null, 0.0f, false, (String) null, (String) null, (List) null, false, (String) null, false, false, (MaskingRules) null, 2047, (DefaultConstructorMarker) null) : sessionReplay;
            this.f46747k = (i14 & 1024) == 0 ? C16877v.n() : list;
            if ((i14 & RecyclerView.n.FLAG_MOVED) == 0) {
                this.f46748l = null;
            } else {
                this.f46748l = num;
            }
            if ((i14 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
                this.f46749m = null;
            } else {
                this.f46749m = str2;
            }
            this.f46750n = (i14 & 8192) == 0 ? new ApiErrors(false, false, false, false, (List) null, (List) null, 63, (DefaultConstructorMarker) null) : apiErrors;
            if ((i14 & 16384) == 0) {
                this.f46751o = null;
            } else {
                this.f46751o = apiErrorsV2;
            }
            this.f46752p = (32768 & i14) == 0 ? new WebView((String) null, 1, (DefaultConstructorMarker) null) : webView;
            this.f46753q = (65536 & i14) == 0 ? new StaticResourceManager(false, (String) null, 3, (DefaultConstructorMarker) null) : staticResourceManager;
            if ((i14 & 131072) == 0) {
                this.f46754r = 0;
            } else {
                this.f46754r = i13;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0092, code lost:
            if (kotlin.jvm.internal.C17542s.e(r8, r5) == false) goto L_0x0094;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final /* synthetic */ void u(com.contentsquare.android.core.features.config.model.JsonConfig.ProjectConfiguration r25, iK.C17395d r26, kotlinx.serialization.descriptors.SerialDescriptor r27) {
            /*
                r0 = r25
                r1 = r26
                r2 = r27
                kotlinx.serialization.KSerializer<java.lang.Object>[] r3 = f46736s
                boolean r4 = r0.f46737a
                r5 = 0
                r1.x(r2, r5, r4)
                java.lang.String r4 = r0.f46738b
                r6 = 1
                r1.y(r2, r6, r4)
                float r4 = r0.f46739c
                r7 = 2
                r1.s(r2, r7, r4)
                int r4 = r0.f46740d
                r7 = 3
                r1.w(r2, r7, r4)
                boolean r4 = r0.f46741e
                r8 = 4
                r1.x(r2, r8, r4)
                int r4 = r0.f46742f
                r8 = 5
                r1.w(r2, r8, r4)
                boolean r4 = r0.f46743g
                r8 = 6
                r1.x(r2, r8, r4)
                com.contentsquare.android.core.features.config.model.JsonConfig$ClientMode$$serializer r4 = com.contentsquare.android.core.features.config.model.JsonConfig$ClientMode$$serializer.INSTANCE
                com.contentsquare.android.core.features.config.model.JsonConfig$ClientMode r8 = r0.f46744h
                r9 = 7
                r1.i(r2, r9, r4, r8)
                r4 = 8
                boolean r8 = r1.z(r2, r4)
                r9 = 0
                if (r8 == 0) goto L_0x0044
                goto L_0x0051
            L_0x0044:
                com.contentsquare.android.core.features.config.model.JsonConfig$InAppConfig r8 = r0.f46745i
                com.contentsquare.android.core.features.config.model.JsonConfig$InAppConfig r10 = new com.contentsquare.android.core.features.config.model.JsonConfig$InAppConfig
                r10.<init>((java.lang.String) r9, (boolean) r5, (int) r7, (kotlin.jvm.internal.DefaultConstructorMarker) r9)
                boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
                if (r8 != 0) goto L_0x0058
            L_0x0051:
                com.contentsquare.android.core.features.config.model.JsonConfig$InAppConfig$$serializer r8 = com.contentsquare.android.core.features.config.model.JsonConfig$InAppConfig$$serializer.INSTANCE
                com.contentsquare.android.core.features.config.model.JsonConfig$InAppConfig r10 = r0.f46745i
                r1.i(r2, r4, r8, r10)
            L_0x0058:
                r4 = 9
                boolean r8 = r1.z(r2, r4)
                if (r8 == 0) goto L_0x0061
                goto L_0x0094
            L_0x0061:
                com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay r8 = r0.f46746j
                com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay r15 = new com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay
                r22 = 2047(0x7ff, float:2.868E-42)
                r23 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r24 = 0
                r10 = r15
                r5 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                r18 = r19
                r19 = r20
                r20 = r21
                r21 = r24
                r10.<init>((java.lang.String) r11, (float) r12, (boolean) r13, (java.lang.String) r14, (java.lang.String) r15, (java.util.List) r16, (boolean) r17, (java.lang.String) r18, (boolean) r19, (boolean) r20, (com.contentsquare.android.core.features.config.model.JsonConfig.MaskingRules) r21, (int) r22, (kotlin.jvm.internal.DefaultConstructorMarker) r23)
                boolean r5 = kotlin.jvm.internal.C17542s.e(r8, r5)
                if (r5 != 0) goto L_0x009b
            L_0x0094:
                com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay$$serializer r5 = com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay$$serializer.INSTANCE
                com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay r8 = r0.f46746j
                r1.i(r2, r4, r5, r8)
            L_0x009b:
                r4 = 10
                boolean r5 = r1.z(r2, r4)
                if (r5 == 0) goto L_0x00a4
                goto L_0x00b0
            L_0x00a4:
                java.util.List<com.contentsquare.android.core.features.config.model.JsonConfig$FeatureFlag> r5 = r0.f46747k
                java.util.List r8 = YH.C16877v.n()
                boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
                if (r5 != 0) goto L_0x00b7
            L_0x00b0:
                r3 = r3[r4]
                java.util.List<com.contentsquare.android.core.features.config.model.JsonConfig$FeatureFlag> r5 = r0.f46747k
                r1.i(r2, r4, r3, r5)
            L_0x00b7:
                r3 = 11
                boolean r4 = r1.z(r2, r3)
                if (r4 == 0) goto L_0x00c0
                goto L_0x00c4
            L_0x00c0:
                java.lang.Integer r4 = r0.f46748l
                if (r4 == 0) goto L_0x00cb
            L_0x00c4:
                jK.X r4 = jK.X.f144073a
                java.lang.Integer r5 = r0.f46748l
                r1.B(r2, r3, r4, r5)
            L_0x00cb:
                r3 = 12
                boolean r4 = r1.z(r2, r3)
                if (r4 == 0) goto L_0x00d4
                goto L_0x00d8
            L_0x00d4:
                java.lang.String r4 = r0.f46749m
                if (r4 == 0) goto L_0x00df
            L_0x00d8:
                jK.Y0 r4 = jK.Y0.f144077a
                java.lang.String r5 = r0.f46749m
                r1.B(r2, r3, r4, r5)
            L_0x00df:
                r3 = 13
                boolean r4 = r1.z(r2, r3)
                if (r4 == 0) goto L_0x00e8
                goto L_0x0101
            L_0x00e8:
                com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors r4 = r0.f46750n
                com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors r5 = new com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors
                r17 = 63
                r18 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r10 = r5
                r10.<init>((boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (java.util.List) r15, (java.util.List) r16, (int) r17, (kotlin.jvm.internal.DefaultConstructorMarker) r18)
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
                if (r4 != 0) goto L_0x0108
            L_0x0101:
                com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors$$serializer r4 = com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors$$serializer.INSTANCE
                com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors r5 = r0.f46750n
                r1.i(r2, r3, r4, r5)
            L_0x0108:
                r3 = 14
                boolean r4 = r1.z(r2, r3)
                if (r4 == 0) goto L_0x0111
                goto L_0x0115
            L_0x0111:
                com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2 r4 = r0.f46751o
                if (r4 == 0) goto L_0x011c
            L_0x0115:
                com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2$$serializer r4 = com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2$$serializer.INSTANCE
                com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2 r5 = r0.f46751o
                r1.B(r2, r3, r4, r5)
            L_0x011c:
                r3 = 15
                boolean r4 = r1.z(r2, r3)
                if (r4 == 0) goto L_0x0125
                goto L_0x0132
            L_0x0125:
                com.contentsquare.android.core.features.config.model.JsonConfig$WebView r4 = r0.f46752p
                com.contentsquare.android.core.features.config.model.JsonConfig$WebView r5 = new com.contentsquare.android.core.features.config.model.JsonConfig$WebView
                r5.<init>((java.lang.String) r9, (int) r6, (kotlin.jvm.internal.DefaultConstructorMarker) r9)
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
                if (r4 != 0) goto L_0x0139
            L_0x0132:
                com.contentsquare.android.core.features.config.model.JsonConfig$WebView$$serializer r4 = com.contentsquare.android.core.features.config.model.JsonConfig$WebView$$serializer.INSTANCE
                com.contentsquare.android.core.features.config.model.JsonConfig$WebView r5 = r0.f46752p
                r1.i(r2, r3, r4, r5)
            L_0x0139:
                r3 = 16
                boolean r4 = r1.z(r2, r3)
                if (r4 == 0) goto L_0x0142
                goto L_0x0150
            L_0x0142:
                com.contentsquare.android.core.features.config.model.JsonConfig$StaticResourceManager r4 = r0.f46753q
                com.contentsquare.android.core.features.config.model.JsonConfig$StaticResourceManager r5 = new com.contentsquare.android.core.features.config.model.JsonConfig$StaticResourceManager
                r6 = 0
                r5.<init>((boolean) r6, (java.lang.String) r9, (int) r7, (kotlin.jvm.internal.DefaultConstructorMarker) r9)
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
                if (r4 != 0) goto L_0x0157
            L_0x0150:
                com.contentsquare.android.core.features.config.model.JsonConfig$StaticResourceManager$$serializer r4 = com.contentsquare.android.core.features.config.model.JsonConfig$StaticResourceManager$$serializer.INSTANCE
                com.contentsquare.android.core.features.config.model.JsonConfig$StaticResourceManager r5 = r0.f46753q
                r1.i(r2, r3, r4, r5)
            L_0x0157:
                r3 = 17
                boolean r4 = r1.z(r2, r3)
                if (r4 == 0) goto L_0x0160
                goto L_0x0164
            L_0x0160:
                int r4 = r0.f46754r
                if (r4 == 0) goto L_0x0169
            L_0x0164:
                int r0 = r0.f46754r
                r1.w(r2, r3, r0)
            L_0x0169:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.core.features.config.model.JsonConfig.ProjectConfiguration.u(com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration, iK.d, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public final ApiErrors b() {
            return this.f46750n;
        }

        public final ApiErrorsV2 c() {
            return this.f46751o;
        }

        public final int d() {
            return this.f46740d;
        }

        public final ClientMode e() {
            return this.f46744h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProjectConfiguration)) {
                return false;
            }
            ProjectConfiguration projectConfiguration = (ProjectConfiguration) obj;
            return this.f46737a == projectConfiguration.f46737a && C17542s.e(this.f46738b, projectConfiguration.f46738b) && Float.compare(this.f46739c, projectConfiguration.f46739c) == 0 && this.f46740d == projectConfiguration.f46740d && this.f46741e == projectConfiguration.f46741e && this.f46742f == projectConfiguration.f46742f && this.f46743g == projectConfiguration.f46743g && C17542s.e(this.f46744h, projectConfiguration.f46744h) && C17542s.e(this.f46745i, projectConfiguration.f46745i) && C17542s.e(this.f46746j, projectConfiguration.f46746j) && C17542s.e(this.f46747k, projectConfiguration.f46747k) && C17542s.e(this.f46748l, projectConfiguration.f46748l) && C17542s.e(this.f46749m, projectConfiguration.f46749m) && C17542s.e(this.f46750n, projectConfiguration.f46750n) && C17542s.e(this.f46751o, projectConfiguration.f46751o) && C17542s.e(this.f46752p, projectConfiguration.f46752p) && C17542s.e(this.f46753q, projectConfiguration.f46753q) && this.f46754r == projectConfiguration.f46754r;
        }

        public final boolean f() {
            return this.f46741e;
        }

        public final int g() {
            return this.f46754r;
        }

        public final String h() {
            return this.f46749m;
        }

        public int hashCode() {
            boolean z10 = this.f46737a;
            boolean z11 = true;
            if (z10) {
                z10 = true;
            }
            int hashCode = (Integer.hashCode(this.f46740d) + ((Float.hashCode(this.f46739c) + ((this.f46738b.hashCode() + ((z10 ? 1 : 0) * true)) * 31)) * 31)) * 31;
            boolean z12 = this.f46741e;
            if (z12) {
                z12 = true;
            }
            int hashCode2 = (Integer.hashCode(this.f46742f) + ((hashCode + (z12 ? 1 : 0)) * 31)) * 31;
            boolean z13 = this.f46743g;
            if (!z13) {
                z11 = z13;
            }
            int hashCode3 = (this.f46747k.hashCode() + ((this.f46746j.hashCode() + ((this.f46745i.hashCode() + ((this.f46744h.hashCode() + ((hashCode2 + (z11 ? 1 : 0)) * 31)) * 31)) * 31)) * 31)) * 31;
            Integer num = this.f46748l;
            int i10 = 0;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f46749m;
            int hashCode5 = (this.f46750n.hashCode() + ((hashCode4 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            ApiErrorsV2 apiErrorsV2 = this.f46751o;
            if (apiErrorsV2 != null) {
                i10 = apiErrorsV2.hashCode();
            }
            return Integer.hashCode(this.f46754r) + ((this.f46753q.hashCode() + ((this.f46752p.hashCode() + ((hashCode5 + i10) * 31)) * 31)) * 31);
        }

        public final Integer i() {
            return this.f46748l;
        }

        public final String j() {
            return this.f46738b;
        }

        public final List<FeatureFlag> k() {
            return this.f46747k;
        }

        public final InAppConfig l() {
            return this.f46745i;
        }

        public final boolean m() {
            return this.f46743g;
        }

        public final float n() {
            return this.f46739c;
        }

        public final SessionReplay o() {
            return this.f46746j;
        }

        public final int p() {
            return this.f46742f;
        }

        public final StaticResourceManager q() {
            return this.f46753q;
        }

        public final boolean r() {
            return this.f46737a;
        }

        public final WebView s() {
            return this.f46752p;
        }

        public final void t(int i10) {
            this.f46754r = i10;
        }

        public String toString() {
            return "ProjectConfiguration(trackingEnabled=" + this.f46737a + ", endpoint=" + this.f46738b + ", sample=" + this.f46739c + ", bucketSize=" + this.f46740d + ", crashHandler=" + this.f46741e + ", sessionTimeout=" + this.f46742f + ", optOutByDefault=" + this.f46743g + ", clientMode=" + this.f46744h + ", inAppConfig=" + this.f46745i + ", sessionReplay=" + this.f46746j + ", featureFlags=" + this.f46747k + ", encryptionPublicKeyId=" + this.f46748l + ", encryptionPublicKey=" + this.f46749m + ", apiErrors=" + this.f46750n + ", apiErrorsV2=" + this.f46751o + ", webView=" + this.f46752p + ", staticResourceManager=" + this.f46753q + ", csProjectId=" + this.f46754r + ')';
        }
    }

    @p
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000  2\u00020\u0001:\u0002!\u001bB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010\u001d¨\u0006\""}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfigurations;", "", "", "seen1", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;", "projectConfig", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfigurations;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;", "getProjectConfig$annotations", "()V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ProjectConfigurations {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final ProjectConfiguration f46755a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfigurations$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfigurations;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ProjectConfigurations> serializer() {
                return JsonConfig$ProjectConfigurations$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @C16814e
        public /* synthetic */ ProjectConfigurations(int i10, ProjectConfiguration projectConfiguration, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, JsonConfig$ProjectConfigurations$$serializer.INSTANCE.getDescriptor());
            }
            this.f46755a = projectConfiguration;
        }

        public final ProjectConfiguration a() {
            return this.f46755a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProjectConfigurations) && C17542s.e(this.f46755a, ((ProjectConfigurations) obj).f46755a);
        }

        public int hashCode() {
            return this.f46755a.hashCode();
        }

        public String toString() {
            return "ProjectConfigurations(projectConfig=" + this.f46755a + ')';
        }
    }

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB1\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u0017R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010\u001f\u001a\u0004\b \u0010\"¨\u0006&"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$RootConfig;", "", "", "seen1", "csProjectId", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfigurations;", "projectConfigurations", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IILcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfigurations;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$RootConfig;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCsProjectId$annotations", "()V", "b", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfigurations;", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfigurations;", "getProjectConfigurations$annotations", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RootConfig {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final int f46756a;

        /* renamed from: b  reason: collision with root package name */
        private final ProjectConfigurations f46757b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$RootConfig$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$RootConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<RootConfig> serializer() {
                return JsonConfig$RootConfig$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @C16814e
        public /* synthetic */ RootConfig(int i10, int i11, ProjectConfigurations projectConfigurations, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, JsonConfig$RootConfig$$serializer.INSTANCE.getDescriptor());
            }
            this.f46756a = i11;
            this.f46757b = projectConfigurations;
        }

        public static final /* synthetic */ void c(RootConfig rootConfig, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.w(serialDescriptor, 0, rootConfig.f46756a);
            dVar.i(serialDescriptor, 1, JsonConfig$ProjectConfigurations$$serializer.INSTANCE, rootConfig.f46757b);
        }

        public final int a() {
            return this.f46756a;
        }

        public final ProjectConfigurations b() {
            return this.f46757b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RootConfig)) {
                return false;
            }
            RootConfig rootConfig = (RootConfig) obj;
            return this.f46756a == rootConfig.f46756a && C17542s.e(this.f46757b, rootConfig.f46757b);
        }

        public int hashCode() {
            return this.f46757b.hashCode() + (Integer.hashCode(this.f46756a) * 31);
        }

        public String toString() {
            return "RootConfig(csProjectId=" + this.f46756a + ", projectConfigurations=" + this.f46757b + ')';
        }
    }

    @p
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\b\u0018\u0000 I2\u00020\u0001:\u0002J(B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0001\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0006\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cHÇ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u00101\u0012\u0004\b4\u00100\u001a\u0004\b2\u00103R \u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010)\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010\"R \u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010)\u0012\u0004\b:\u00100\u001a\u0004\b9\u0010\"R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010;\u0012\u0004\b=\u00100\u001a\u0004\b+\u0010<R \u0010\f\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u00101\u0012\u0004\b?\u00100\u001a\u0004\b>\u00103R \u0010\r\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010)\u0012\u0004\bA\u00100\u001a\u0004\b@\u0010\"R \u0010\u000e\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u00101\u0012\u0004\bC\u00100\u001a\u0004\bB\u00103R \u0010\u000f\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u00101\u0012\u0004\bD\u00100\u001a\u0004\b5\u00103R \u0010\u0011\u001a\u00020\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bH\u00100\u001a\u0004\b8\u0010G¨\u0006K"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$SessionReplay;", "", "", "endpoint", "", "recordingRate", "", "recordViaCellularNetwork", "recordingQualityWifi", "recordingQualityCellular", "", "blockedAppVersions", "srmEnabled", "srmEndpoint", "userIdentifier", "etrEnabled", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules;", "maskingRules", "<init>", "(Ljava/lang/String;FZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;ZZLcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;FZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;ZZLcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "j", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$SessionReplay;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "F", "i", "()F", "getRecordingRate$annotations", "()V", "Z", "f", "()Z", "getRecordViaCellularNetwork$annotations", "d", "h", "getRecordingQualityWifi$annotations", "e", "g", "getRecordingQualityCellular$annotations", "Ljava/util/List;", "()Ljava/util/List;", "getBlockedAppVersions$annotations", "getSrmEnabled", "getSrmEnabled$annotations", "getSrmEndpoint", "getSrmEndpoint$annotations", "getUserIdentifier", "getUserIdentifier$annotations", "getEtrEnabled$annotations", "k", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules;", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRules;", "getMaskingRules$annotations", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SessionReplay {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public static final KSerializer<Object>[] f46758l = {null, null, null, null, null, new C17451f(Y0.f144077a), null, null, null, null, null};

        /* renamed from: a  reason: collision with root package name */
        private final String f46759a;

        /* renamed from: b  reason: collision with root package name */
        private final float f46760b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f46761c;

        /* renamed from: d  reason: collision with root package name */
        private final String f46762d;

        /* renamed from: e  reason: collision with root package name */
        private final String f46763e;

        /* renamed from: f  reason: collision with root package name */
        private final List<String> f46764f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f46765g;

        /* renamed from: h  reason: collision with root package name */
        private final String f46766h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f46767i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f46768j;

        /* renamed from: k  reason: collision with root package name */
        private final MaskingRules f46769k;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$SessionReplay$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$SessionReplay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<SessionReplay> serializer() {
                return JsonConfig$SessionReplay$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public SessionReplay() {
            this((String) null, 0.0f, false, (String) null, (String) null, (List) null, false, (String) null, false, false, (MaskingRules) null, 2047, (DefaultConstructorMarker) null);
        }

        public static final /* synthetic */ void j(SessionReplay sessionReplay, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f46758l;
            if (dVar.z(serialDescriptor, 0) || !C17542s.e(sessionReplay.f46759a, "")) {
                dVar.y(serialDescriptor, 0, sessionReplay.f46759a);
            }
            if (dVar.z(serialDescriptor, 1) || Float.compare(sessionReplay.f46760b, 0.0f) != 0) {
                dVar.s(serialDescriptor, 1, sessionReplay.f46760b);
            }
            if (dVar.z(serialDescriptor, 2) || sessionReplay.f46761c) {
                dVar.x(serialDescriptor, 2, sessionReplay.f46761c);
            }
            if (dVar.z(serialDescriptor, 3) || !C17542s.e(sessionReplay.f46762d, a.Companion.a())) {
                dVar.y(serialDescriptor, 3, sessionReplay.f46762d);
            }
            if (dVar.z(serialDescriptor, 4) || !C17542s.e(sessionReplay.f46763e, a.Companion.a())) {
                dVar.y(serialDescriptor, 4, sessionReplay.f46763e);
            }
            if (dVar.z(serialDescriptor, 5) || !C17542s.e(sessionReplay.f46764f, C16877v.n())) {
                dVar.i(serialDescriptor, 5, kSerializerArr[5], sessionReplay.f46764f);
            }
            if (dVar.z(serialDescriptor, 6) || sessionReplay.f46765g) {
                dVar.x(serialDescriptor, 6, sessionReplay.f46765g);
            }
            if (dVar.z(serialDescriptor, 7) || !C17542s.e(sessionReplay.f46766h, "")) {
                dVar.y(serialDescriptor, 7, sessionReplay.f46766h);
            }
            if (dVar.z(serialDescriptor, 8) || sessionReplay.f46767i) {
                dVar.x(serialDescriptor, 8, sessionReplay.f46767i);
            }
            if (dVar.z(serialDescriptor, 9) || sessionReplay.f46768j) {
                dVar.x(serialDescriptor, 9, sessionReplay.f46768j);
            }
            if (dVar.z(serialDescriptor, 10) || !C17542s.e(sessionReplay.f46769k, new MaskingRules((MaskingRulesFullMasking) null, 1, (DefaultConstructorMarker) null))) {
                dVar.i(serialDescriptor, 10, JsonConfig$MaskingRules$$serializer.INSTANCE, sessionReplay.f46769k);
            }
        }

        public final List<String> b() {
            return this.f46764f;
        }

        public final String c() {
            return this.f46759a;
        }

        public final boolean d() {
            return this.f46768j;
        }

        public final MaskingRules e() {
            return this.f46769k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionReplay)) {
                return false;
            }
            SessionReplay sessionReplay = (SessionReplay) obj;
            return C17542s.e(this.f46759a, sessionReplay.f46759a) && Float.compare(this.f46760b, sessionReplay.f46760b) == 0 && this.f46761c == sessionReplay.f46761c && C17542s.e(this.f46762d, sessionReplay.f46762d) && C17542s.e(this.f46763e, sessionReplay.f46763e) && C17542s.e(this.f46764f, sessionReplay.f46764f) && this.f46765g == sessionReplay.f46765g && C17542s.e(this.f46766h, sessionReplay.f46766h) && this.f46767i == sessionReplay.f46767i && this.f46768j == sessionReplay.f46768j && C17542s.e(this.f46769k, sessionReplay.f46769k);
        }

        public final boolean f() {
            return this.f46761c;
        }

        public final String g() {
            return this.f46763e;
        }

        public final String h() {
            return this.f46762d;
        }

        public int hashCode() {
            int hashCode = (Float.hashCode(this.f46760b) + (this.f46759a.hashCode() * 31)) * 31;
            boolean z10 = this.f46761c;
            boolean z11 = true;
            if (z10) {
                z10 = true;
            }
            int hashCode2 = this.f46762d.hashCode();
            int hashCode3 = (this.f46764f.hashCode() + ((this.f46763e.hashCode() + ((hashCode2 + ((hashCode + (z10 ? 1 : 0)) * 31)) * 31)) * 31)) * 31;
            boolean z12 = this.f46765g;
            if (z12) {
                z12 = true;
            }
            int hashCode4 = (this.f46766h.hashCode() + ((hashCode3 + (z12 ? 1 : 0)) * 31)) * 31;
            boolean z13 = this.f46767i;
            if (z13) {
                z13 = true;
            }
            int i10 = (hashCode4 + (z13 ? 1 : 0)) * 31;
            boolean z14 = this.f46768j;
            if (!z14) {
                z11 = z14;
            }
            return this.f46769k.hashCode() + ((i10 + (z11 ? 1 : 0)) * 31);
        }

        public final float i() {
            return this.f46760b;
        }

        public String toString() {
            return "SessionReplay(endpoint=" + this.f46759a + ", recordingRate=" + this.f46760b + ", recordViaCellularNetwork=" + this.f46761c + ", recordingQualityWifi=" + this.f46762d + ", recordingQualityCellular=" + this.f46763e + ", blockedAppVersions=" + this.f46764f + ", srmEnabled=" + this.f46765g + ", srmEndpoint=" + this.f46766h + ", userIdentifier=" + this.f46767i + ", etrEnabled=" + this.f46768j + ", maskingRules=" + this.f46769k + ')';
        }

        @C16814e
        public /* synthetic */ SessionReplay(int i10, String str, float f10, boolean z10, String str2, String str3, List list, boolean z11, String str4, boolean z12, boolean z13, MaskingRules maskingRules, T0 t02) {
            if ((i10 & 1) == 0) {
                this.f46759a = "";
            } else {
                this.f46759a = str;
            }
            if ((i10 & 2) == 0) {
                this.f46760b = 0.0f;
            } else {
                this.f46760b = f10;
            }
            if ((i10 & 4) == 0) {
                this.f46761c = false;
            } else {
                this.f46761c = z10;
            }
            if ((i10 & 8) == 0) {
                this.f46762d = a.Companion.a();
            } else {
                this.f46762d = str2;
            }
            if ((i10 & 16) == 0) {
                this.f46763e = a.Companion.a();
            } else {
                this.f46763e = str3;
            }
            if ((i10 & 32) == 0) {
                this.f46764f = C16877v.n();
            } else {
                this.f46764f = list;
            }
            if ((i10 & 64) == 0) {
                this.f46765g = false;
            } else {
                this.f46765g = z11;
            }
            if ((i10 & 128) == 0) {
                this.f46766h = "";
            } else {
                this.f46766h = str4;
            }
            if ((i10 & 256) == 0) {
                this.f46767i = false;
            } else {
                this.f46767i = z12;
            }
            if ((i10 & 512) == 0) {
                this.f46768j = false;
            } else {
                this.f46768j = z13;
            }
            if ((i10 & 1024) == 0) {
                this.f46769k = new MaskingRules((MaskingRulesFullMasking) null, 1, (DefaultConstructorMarker) null);
            } else {
                this.f46769k = maskingRules;
            }
        }

        public SessionReplay(String str, float f10, boolean z10, String str2, String str3, List<String> list, boolean z11, String str4, boolean z12, boolean z13, MaskingRules maskingRules) {
            C17542s.j(str, "endpoint");
            C17542s.j(str2, "recordingQualityWifi");
            C17542s.j(str3, "recordingQualityCellular");
            C17542s.j(list, "blockedAppVersions");
            C17542s.j(str4, "srmEndpoint");
            C17542s.j(maskingRules, "maskingRules");
            this.f46759a = str;
            this.f46760b = f10;
            this.f46761c = z10;
            this.f46762d = str2;
            this.f46763e = str3;
            this.f46764f = list;
            this.f46765g = z11;
            this.f46766h = str4;
            this.f46767i = z12;
            this.f46768j = z13;
            this.f46769k = maskingRules;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ SessionReplay(java.lang.String r14, float r15, boolean r16, java.lang.String r17, java.lang.String r18, java.util.List r19, boolean r20, java.lang.String r21, boolean r22, boolean r23, com.contentsquare.android.core.features.config.model.JsonConfig.MaskingRules r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
            /*
                r13 = this;
                r0 = r25
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000b
            L_0x000a:
                r1 = r14
            L_0x000b:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0011
                r3 = 0
                goto L_0x0012
            L_0x0011:
                r3 = r15
            L_0x0012:
                r4 = r0 & 4
                r5 = 0
                if (r4 == 0) goto L_0x0019
                r4 = r5
                goto L_0x001b
            L_0x0019:
                r4 = r16
            L_0x001b:
                r6 = r0 & 8
                if (r6 == 0) goto L_0x0026
                com.contentsquare.android.core.features.config.model.a$a r6 = com.contentsquare.android.core.features.config.model.a.Companion
                java.lang.String r6 = r6.a()
                goto L_0x0028
            L_0x0026:
                r6 = r17
            L_0x0028:
                r7 = r0 & 16
                if (r7 == 0) goto L_0x0033
                com.contentsquare.android.core.features.config.model.a$a r7 = com.contentsquare.android.core.features.config.model.a.Companion
                java.lang.String r7 = r7.a()
                goto L_0x0035
            L_0x0033:
                r7 = r18
            L_0x0035:
                r8 = r0 & 32
                if (r8 == 0) goto L_0x003e
                java.util.List r8 = YH.C16877v.n()
                goto L_0x0040
            L_0x003e:
                r8 = r19
            L_0x0040:
                r9 = r0 & 64
                if (r9 == 0) goto L_0x0046
                r9 = r5
                goto L_0x0048
            L_0x0046:
                r9 = r20
            L_0x0048:
                r10 = r0 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L_0x004d
                goto L_0x004f
            L_0x004d:
                r2 = r21
            L_0x004f:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x0055
                r10 = r5
                goto L_0x0057
            L_0x0055:
                r10 = r22
            L_0x0057:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x005c
                goto L_0x005e
            L_0x005c:
                r5 = r23
            L_0x005e:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x006a
                com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules r0 = new com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules
                r11 = 0
                r12 = 1
                r0.<init>((com.contentsquare.android.core.features.config.model.JsonConfig.MaskingRulesFullMasking) r11, (int) r12, (kotlin.jvm.internal.DefaultConstructorMarker) r11)
                goto L_0x006c
            L_0x006a:
                r0 = r24
            L_0x006c:
                r14 = r13
                r15 = r1
                r16 = r3
                r17 = r4
                r18 = r6
                r19 = r7
                r20 = r8
                r21 = r9
                r22 = r2
                r23 = r10
                r24 = r5
                r25 = r0
                r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.core.features.config.model.JsonConfig.SessionReplay.<init>(java.lang.String, float, boolean, java.lang.String, java.lang.String, java.util.List, boolean, java.lang.String, boolean, boolean, com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @p
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u0000 !2\u00020\u0001:\u0002\"\u001cB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0016¨\u0006#"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$StaticResourceManager;", "", "", "enabled", "", "endpoint", "<init>", "(ZLjava/lang/String;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IZLjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$StaticResourceManager;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StaticResourceManager {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f46770a;

        /* renamed from: b  reason: collision with root package name */
        private final String f46771b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$StaticResourceManager$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$StaticResourceManager;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<StaticResourceManager> serializer() {
                return JsonConfig$StaticResourceManager$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public StaticResourceManager() {
            this(false, (String) null, 3, (DefaultConstructorMarker) null);
        }

        public static final /* synthetic */ void c(StaticResourceManager staticResourceManager, C17395d dVar, SerialDescriptor serialDescriptor) {
            if (dVar.z(serialDescriptor, 0) || staticResourceManager.f46770a) {
                dVar.x(serialDescriptor, 0, staticResourceManager.f46770a);
            }
            if (dVar.z(serialDescriptor, 1) || !C17542s.e(staticResourceManager.f46771b, "")) {
                dVar.y(serialDescriptor, 1, staticResourceManager.f46771b);
            }
        }

        public final boolean a() {
            return this.f46770a;
        }

        public final String b() {
            return this.f46771b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StaticResourceManager)) {
                return false;
            }
            StaticResourceManager staticResourceManager = (StaticResourceManager) obj;
            return this.f46770a == staticResourceManager.f46770a && C17542s.e(this.f46771b, staticResourceManager.f46771b);
        }

        public int hashCode() {
            boolean z10 = this.f46770a;
            if (z10) {
                z10 = true;
            }
            return this.f46771b.hashCode() + ((z10 ? 1 : 0) * true);
        }

        public String toString() {
            return "StaticResourceManager(enabled=" + this.f46770a + ", endpoint=" + this.f46771b + ')';
        }

        @C16814e
        public /* synthetic */ StaticResourceManager(int i10, boolean z10, String str, T0 t02) {
            this.f46770a = (i10 & 1) == 0 ? false : z10;
            if ((i10 & 2) == 0) {
                this.f46771b = "";
            } else {
                this.f46771b = str;
            }
        }

        public StaticResourceManager(boolean z10, String str) {
            C17542s.j(str, "endpoint");
            this.f46770a = z10;
            this.f46771b = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StaticResourceManager(boolean z10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? "" : str);
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001bB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u0014¨\u0006!"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$WebView;", "", "", "tagId", "<init>", "(Ljava/lang/String;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$WebView;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTagId$annotations", "()V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WebView {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f46772a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$WebView$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$WebView;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<WebView> serializer() {
                return JsonConfig$WebView$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public WebView() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public static final /* synthetic */ void b(WebView webView, C17395d dVar, SerialDescriptor serialDescriptor) {
            if (dVar.z(serialDescriptor, 0) || webView.f46772a != null) {
                dVar.B(serialDescriptor, 0, Y0.f144077a, webView.f46772a);
            }
        }

        public final String a() {
            return this.f46772a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebView) && C17542s.e(this.f46772a, ((WebView) obj).f46772a);
        }

        public int hashCode() {
            String str = this.f46772a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "WebView(tagId=" + this.f46772a + ')';
        }

        @C16814e
        public /* synthetic */ WebView(int i10, String str, T0 t02) {
            if ((i10 & 1) == 0) {
                this.f46772a = null;
            } else {
                this.f46772a = str;
            }
        }

        public WebView(String str) {
            this.f46772a = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WebView(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LkK/e;", "LXH/N;", "invoke", "(LkK/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends C17544u implements C17642l<C17516e, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f46773c = new a();

        public a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C17516e) obj);
            return C16807N.f139792a;
        }

        public final void invoke(C17516e eVar) {
            C17542s.j(eVar, "$this$Json");
            eVar.g(true);
            eVar.e(true);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LD8/c;", "b", "()LD8/c;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements C17631a<D8.c> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f46774c = new b();

        public b() {
            super(0);
        }

        /* renamed from: b */
        public final D8.c invoke() {
            return new D8.c("JsonConfig");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/JsonConfig$c;", "", "<init>", "()V", "", "jsonString", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$RootConfig;", "a", "(Ljava/lang/String;)Lcom/contentsquare/android/core/features/config/model/JsonConfig$RootConfig;", "LD8/c;", "logger$delegate", "LXH/o;", "c", "()LD8/c;", "logger", "LkK/c;", "format", "LkK/c;", "b", "()LkK/c;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        private c() {
        }

        public final RootConfig a(String str) {
            String str2;
            D8.c cVar;
            C17542s.j(str, "jsonString");
            try {
                RootConfig rootConfig = (RootConfig) b().c(RootConfig.Companion.serializer(), str);
                rootConfig.b().a().t(rootConfig.a());
                return rootConfig;
            } catch (q e10) {
                e = e10;
                cVar = c();
                str2 = "Failed to parse project configuration as String";
                cVar.i(e, str2);
                return null;
            } catch (IllegalArgumentException e11) {
                e = e11;
                cVar = c();
                str2 = "Failed to parse JSON project configuration as String";
                cVar.i(e, str2);
                return null;
            }
        }

        public final C17514c b() {
            return JsonConfig.f46697c;
        }

        public final D8.c c() {
            return (D8.c) JsonConfig.f46696b.getValue();
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final RootConfig c(String str) {
        return f46695a.a(str);
    }
}
