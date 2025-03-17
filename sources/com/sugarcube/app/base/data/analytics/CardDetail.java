package com.sugarcube.app.base.data.analytics;

import XH.C16796C;
import YH.X;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackingKey;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003`\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/CardDetail;", "Lcom/sugarcube/core/analytics/Trackable;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "FTE", "ScanReady", "ScanFailed", "LastDesign", "Lcom/sugarcube/app/base/data/analytics/CardDetail$FTE;", "Lcom/sugarcube/app/base/data/analytics/CardDetail$LastDesign;", "Lcom/sugarcube/app/base/data/analytics/CardDetail$ScanFailed;", "Lcom/sugarcube/app/base/data/analytics/CardDetail$ScanReady;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CardDetail implements Trackable {
    public static final int $stable = 0;
    private final String name;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/CardDetail$FTE;", "Lcom/sugarcube/app/base/data/analytics/CardDetail;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FTE extends CardDetail {
        public static final int $stable = 0;
        public static final FTE INSTANCE = new FTE();

        private FTE() {
            super("FTE", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FTE);
        }

        public int hashCode() {
            return 107149526;
        }

        public String toString() {
            return "FTE";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/CardDetail$LastDesign;", "Lcom/sugarcube/app/base/data/analytics/CardDetail;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LastDesign extends CardDetail {
        public static final int $stable = 0;
        public static final LastDesign INSTANCE = new LastDesign();

        private LastDesign() {
            super("LastDesign", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LastDesign);
        }

        public int hashCode() {
            return -1092916331;
        }

        public String toString() {
            return "LastDesign";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/CardDetail$ScanFailed;", "Lcom/sugarcube/app/base/data/analytics/CardDetail;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScanFailed extends CardDetail {
        public static final int $stable = 0;
        public static final ScanFailed INSTANCE = new ScanFailed();

        private ScanFailed() {
            super("ScanFailed", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ScanFailed);
        }

        public int hashCode() {
            return 223914171;
        }

        public String toString() {
            return "ScanFailed";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/CardDetail$ScanReady;", "Lcom/sugarcube/app/base/data/analytics/CardDetail;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScanReady extends CardDetail {
        public static final int $stable = 0;
        public static final ScanReady INSTANCE = new ScanReady();

        private ScanReady() {
            super("ScanReady", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ScanReady);
        }

        public int hashCode() {
            return -1644151451;
        }

        public String toString() {
            return "ScanReady";
        }
    }

    public /* synthetic */ CardDetail(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getName() {
        return this.name;
    }

    public HashMap<TrackingKey, String> getValues() {
        return X.l(C16796C.a(TrackingKey.CardDetail, this.name));
    }

    private CardDetail(String str) {
        this.name = str;
    }
}
