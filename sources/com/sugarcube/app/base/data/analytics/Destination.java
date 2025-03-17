package com.sugarcube.app.base.data.analytics;

import XH.C16796C;
import YH.X;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackingKey;
import fI.C17220a;
import fI.C17221b;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003`\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0001\u000b\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/sugarcube/app/base/data/analytics/Destination;", "Lcom/sugarcube/core/analytics/Trackable;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "KreativHome", "DesignScene", "DesignComposition", "SharedDesign", "Capture", "MyScans", "Showrooms", "DesignDetails", "SugarcubePlace", "PushNotification", "Deeplink", "Lcom/sugarcube/app/base/data/analytics/Destination$Capture;", "Lcom/sugarcube/app/base/data/analytics/Destination$Deeplink;", "Lcom/sugarcube/app/base/data/analytics/Destination$DesignComposition;", "Lcom/sugarcube/app/base/data/analytics/Destination$DesignDetails;", "Lcom/sugarcube/app/base/data/analytics/Destination$DesignScene;", "Lcom/sugarcube/app/base/data/analytics/Destination$KreativHome;", "Lcom/sugarcube/app/base/data/analytics/Destination$MyScans;", "Lcom/sugarcube/app/base/data/analytics/Destination$PushNotification;", "Lcom/sugarcube/app/base/data/analytics/Destination$SharedDesign;", "Lcom/sugarcube/app/base/data/analytics/Destination$Showrooms;", "Lcom/sugarcube/app/base/data/analytics/Destination$SugarcubePlace;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Destination implements Trackable {
    public static final int $stable = 0;
    private final String name;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/Destination$Capture;", "Lcom/sugarcube/app/base/data/analytics/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Capture extends Destination {
        public static final int $stable = 0;
        public static final Capture INSTANCE = new Capture();

        private Capture() {
            super("Capture", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Capture);
        }

        public int hashCode() {
            return 1062299962;
        }

        public String toString() {
            return "Capture";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003`\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/Destination$Deeplink;", "Lcom/sugarcube/app/base/data/analytics/Destination;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Deeplink extends Destination {
        public static final int $stable = 0;
        private final String url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Deeplink(String str) {
            super("Deeplink", (DefaultConstructorMarker) null);
            C17542s.j(str, "url");
            this.url = str;
        }

        public static /* synthetic */ Deeplink copy$default(Deeplink deeplink, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = deeplink.url;
            }
            return deeplink.copy(str);
        }

        public final String component1() {
            return this.url;
        }

        public final Deeplink copy(String str) {
            C17542s.j(str, "url");
            return new Deeplink(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Deeplink) && C17542s.e(this.url, ((Deeplink) obj).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public HashMap<TrackingKey, String> getValues() {
            Map<TrackingKey, String> z10 = X.z(Destination.super.getValues());
            HashMap<TrackingKey, String> hashMap = new HashMap<>();
            hashMap.putAll(z10);
            hashMap.put(TrackingKey.URL, this.url);
            return hashMap;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            String str = this.url;
            return "Deeplink(url=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003`\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/Destination$DesignComposition;", "Lcom/sugarcube/app/base/data/analytics/Destination;", "designUuid", "", "<init>", "(Ljava/lang/String;)V", "getDesignUuid", "()Ljava/lang/String;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DesignComposition extends Destination {
        public static final int $stable = 0;
        private final String designUuid;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DesignComposition(String str) {
            super("DesignComposition", (DefaultConstructorMarker) null);
            C17542s.j(str, "designUuid");
            this.designUuid = str;
        }

        public static /* synthetic */ DesignComposition copy$default(DesignComposition designComposition, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = designComposition.designUuid;
            }
            return designComposition.copy(str);
        }

        public final String component1() {
            return this.designUuid;
        }

        public final DesignComposition copy(String str) {
            C17542s.j(str, "designUuid");
            return new DesignComposition(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DesignComposition) && C17542s.e(this.designUuid, ((DesignComposition) obj).designUuid);
        }

        public final String getDesignUuid() {
            return this.designUuid;
        }

        public HashMap<TrackingKey, String> getValues() {
            Map<TrackingKey, String> z10 = X.z(Destination.super.getValues());
            HashMap<TrackingKey, String> hashMap = new HashMap<>();
            hashMap.putAll(z10);
            hashMap.put(TrackingKey.DesignUUID, this.designUuid);
            return hashMap;
        }

        public int hashCode() {
            return this.designUuid.hashCode();
        }

        public String toString() {
            String str = this.designUuid;
            return "DesignComposition(designUuid=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003`\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/Destination$DesignDetails;", "Lcom/sugarcube/app/base/data/analytics/Destination;", "designUuid", "", "<init>", "(Ljava/lang/String;)V", "getDesignUuid", "()Ljava/lang/String;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DesignDetails extends Destination {
        public static final int $stable = 0;
        private final String designUuid;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DesignDetails(String str) {
            super("DesignDetails", (DefaultConstructorMarker) null);
            C17542s.j(str, "designUuid");
            this.designUuid = str;
        }

        public static /* synthetic */ DesignDetails copy$default(DesignDetails designDetails, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = designDetails.designUuid;
            }
            return designDetails.copy(str);
        }

        public final String component1() {
            return this.designUuid;
        }

        public final DesignDetails copy(String str) {
            C17542s.j(str, "designUuid");
            return new DesignDetails(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DesignDetails) && C17542s.e(this.designUuid, ((DesignDetails) obj).designUuid);
        }

        public final String getDesignUuid() {
            return this.designUuid;
        }

        public HashMap<TrackingKey, String> getValues() {
            Map<TrackingKey, String> z10 = X.z(Destination.super.getValues());
            HashMap<TrackingKey, String> hashMap = new HashMap<>();
            hashMap.putAll(z10);
            hashMap.put(TrackingKey.DesignUUID, this.designUuid);
            return hashMap;
        }

        public int hashCode() {
            return this.designUuid.hashCode();
        }

        public String toString() {
            String str = this.designUuid;
            return "DesignDetails(designUuid=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003`\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/Destination$DesignScene;", "Lcom/sugarcube/app/base/data/analytics/Destination;", "roomUuid", "", "<init>", "(Ljava/lang/String;)V", "getRoomUuid", "()Ljava/lang/String;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DesignScene extends Destination {
        public static final int $stable = 0;
        private final String roomUuid;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DesignScene(String str) {
            super("DesignScene", (DefaultConstructorMarker) null);
            C17542s.j(str, "roomUuid");
            this.roomUuid = str;
        }

        public static /* synthetic */ DesignScene copy$default(DesignScene designScene, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = designScene.roomUuid;
            }
            return designScene.copy(str);
        }

        public final String component1() {
            return this.roomUuid;
        }

        public final DesignScene copy(String str) {
            C17542s.j(str, "roomUuid");
            return new DesignScene(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DesignScene) && C17542s.e(this.roomUuid, ((DesignScene) obj).roomUuid);
        }

        public final String getRoomUuid() {
            return this.roomUuid;
        }

        public HashMap<TrackingKey, String> getValues() {
            Map<TrackingKey, String> z10 = X.z(Destination.super.getValues());
            HashMap<TrackingKey, String> hashMap = new HashMap<>();
            hashMap.putAll(z10);
            hashMap.put(TrackingKey.RoomUUID, this.roomUuid);
            return hashMap;
        }

        public int hashCode() {
            return this.roomUuid.hashCode();
        }

        public String toString() {
            String str = this.roomUuid;
            return "DesignScene(roomUuid=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/Destination$KreativHome;", "Lcom/sugarcube/app/base/data/analytics/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class KreativHome extends Destination {
        public static final int $stable = 0;
        public static final KreativHome INSTANCE = new KreativHome();

        private KreativHome() {
            super("KreativHome", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof KreativHome);
        }

        public int hashCode() {
            return -2116723855;
        }

        public String toString() {
            return "KreativHome";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/Destination$MyScans;", "Lcom/sugarcube/app/base/data/analytics/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MyScans extends Destination {
        public static final int $stable = 0;
        public static final MyScans INSTANCE = new MyScans();

        private MyScans() {
            super("MyScans", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MyScans);
        }

        public int hashCode() {
            return 2007193918;
        }

        public String toString() {
            return "MyScans";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003`\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/Destination$PushNotification;", "Lcom/sugarcube/app/base/data/analytics/Destination;", "roomUuid", "", "<init>", "(Ljava/lang/String;)V", "getRoomUuid", "()Ljava/lang/String;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PushNotification extends Destination {
        public static final int $stable = 0;
        private final String roomUuid;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PushNotification(String str) {
            super("PushNotification", (DefaultConstructorMarker) null);
            C17542s.j(str, "roomUuid");
            this.roomUuid = str;
        }

        public static /* synthetic */ PushNotification copy$default(PushNotification pushNotification, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = pushNotification.roomUuid;
            }
            return pushNotification.copy(str);
        }

        public final String component1() {
            return this.roomUuid;
        }

        public final PushNotification copy(String str) {
            C17542s.j(str, "roomUuid");
            return new PushNotification(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PushNotification) && C17542s.e(this.roomUuid, ((PushNotification) obj).roomUuid);
        }

        public final String getRoomUuid() {
            return this.roomUuid;
        }

        public HashMap<TrackingKey, String> getValues() {
            Map<TrackingKey, String> z10 = X.z(Destination.super.getValues());
            HashMap<TrackingKey, String> hashMap = new HashMap<>();
            hashMap.putAll(z10);
            hashMap.put(TrackingKey.RoomUUID, this.roomUuid);
            return hashMap;
        }

        public int hashCode() {
            return this.roomUuid.hashCode();
        }

        public String toString() {
            String str = this.roomUuid;
            return "PushNotification(roomUuid=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003`\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/Destination$SharedDesign;", "Lcom/sugarcube/app/base/data/analytics/Destination;", "designUuid", "", "<init>", "(Ljava/lang/String;)V", "getDesignUuid", "()Ljava/lang/String;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SharedDesign extends Destination {
        public static final int $stable = 0;
        private final String designUuid;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SharedDesign(String str) {
            super("SharedDesign", (DefaultConstructorMarker) null);
            C17542s.j(str, "designUuid");
            this.designUuid = str;
        }

        public static /* synthetic */ SharedDesign copy$default(SharedDesign sharedDesign, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sharedDesign.designUuid;
            }
            return sharedDesign.copy(str);
        }

        public final String component1() {
            return this.designUuid;
        }

        public final SharedDesign copy(String str) {
            C17542s.j(str, "designUuid");
            return new SharedDesign(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SharedDesign) && C17542s.e(this.designUuid, ((SharedDesign) obj).designUuid);
        }

        public final String getDesignUuid() {
            return this.designUuid;
        }

        public HashMap<TrackingKey, String> getValues() {
            Map<TrackingKey, String> z10 = X.z(Destination.super.getValues());
            HashMap<TrackingKey, String> hashMap = new HashMap<>();
            hashMap.putAll(z10);
            hashMap.put(TrackingKey.DesignUUID, this.designUuid);
            return hashMap;
        }

        public int hashCode() {
            return this.designUuid.hashCode();
        }

        public String toString() {
            String str = this.designUuid;
            return "SharedDesign(designUuid=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/Destination$Showrooms;", "Lcom/sugarcube/app/base/data/analytics/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Showrooms extends Destination {
        public static final int $stable = 0;
        public static final Showrooms INSTANCE = new Showrooms();

        private Showrooms() {
            super("Showrooms", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Showrooms);
        }

        public int hashCode() {
            return -1676145905;
        }

        public String toString() {
            return "Showrooms";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003`\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/Destination$SugarcubePlace;", "Lcom/sugarcube/app/base/data/analytics/Destination;", "productId", "", "viewMode", "Lcom/sugarcube/app/base/data/analytics/Destination$SugarcubePlace$ViewMode;", "<init>", "(Ljava/lang/String;Lcom/sugarcube/app/base/data/analytics/Destination$SugarcubePlace$ViewMode;)V", "getProductId", "()Ljava/lang/String;", "getViewMode", "()Lcom/sugarcube/app/base/data/analytics/Destination$SugarcubePlace$ViewMode;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ViewMode", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SugarcubePlace extends Destination {
        public static final int $stable = 0;
        private final String productId;
        private final ViewMode viewMode;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/Destination$SugarcubePlace$ViewMode;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "AR", "VR", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum ViewMode {
            AR("AR"),
            VR("VR");
            
            private final String key;

            static {
                ViewMode[] $values;
                $ENTRIES = C17221b.a($values);
            }

            private ViewMode(String str) {
                this.key = str;
            }

            public static C17220a<ViewMode> getEntries() {
                return $ENTRIES;
            }

            public final String getKey() {
                return this.key;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SugarcubePlace(String str, ViewMode viewMode2) {
            super("SugarcubePlace", (DefaultConstructorMarker) null);
            C17542s.j(str, "productId");
            C17542s.j(viewMode2, "viewMode");
            this.productId = str;
            this.viewMode = viewMode2;
        }

        public static /* synthetic */ SugarcubePlace copy$default(SugarcubePlace sugarcubePlace, String str, ViewMode viewMode2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sugarcubePlace.productId;
            }
            if ((i10 & 2) != 0) {
                viewMode2 = sugarcubePlace.viewMode;
            }
            return sugarcubePlace.copy(str, viewMode2);
        }

        public final String component1() {
            return this.productId;
        }

        public final ViewMode component2() {
            return this.viewMode;
        }

        public final SugarcubePlace copy(String str, ViewMode viewMode2) {
            C17542s.j(str, "productId");
            C17542s.j(viewMode2, "viewMode");
            return new SugarcubePlace(str, viewMode2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SugarcubePlace)) {
                return false;
            }
            SugarcubePlace sugarcubePlace = (SugarcubePlace) obj;
            return C17542s.e(this.productId, sugarcubePlace.productId) && this.viewMode == sugarcubePlace.viewMode;
        }

        public final String getProductId() {
            return this.productId;
        }

        public HashMap<TrackingKey, String> getValues() {
            Map<TrackingKey, String> z10 = X.z(Destination.super.getValues());
            HashMap<TrackingKey, String> hashMap = new HashMap<>();
            hashMap.putAll(z10);
            hashMap.put(TrackingKey.ProductId, this.productId);
            hashMap.put(TrackingKey.ViewMode, this.viewMode.getKey());
            return hashMap;
        }

        public final ViewMode getViewMode() {
            return this.viewMode;
        }

        public int hashCode() {
            return (this.productId.hashCode() * 31) + this.viewMode.hashCode();
        }

        public String toString() {
            String str = this.productId;
            ViewMode viewMode2 = this.viewMode;
            return "SugarcubePlace(productId=" + str + ", viewMode=" + viewMode2 + ")";
        }
    }

    public /* synthetic */ Destination(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getName() {
        return this.name;
    }

    public HashMap<TrackingKey, String> getValues() {
        return X.l(C16796C.a(TrackingKey.Destination, this.name));
    }

    private Destination(String str) {
        this.name = str;
    }
}
