package com.sugarcube.app.base.data.analytics;

import XH.C16796C;
import YH.X;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackingKey;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003`\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/EntryType;", "Lcom/sugarcube/core/analytics/Trackable;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "BrandVideo", "ShowroomCarousel", "ShowroomCollage", "Product3D", "ProductAR", "Lcom/sugarcube/app/base/data/analytics/EntryType$BrandVideo;", "Lcom/sugarcube/app/base/data/analytics/EntryType$Product3D;", "Lcom/sugarcube/app/base/data/analytics/EntryType$ProductAR;", "Lcom/sugarcube/app/base/data/analytics/EntryType$ShowroomCarousel;", "Lcom/sugarcube/app/base/data/analytics/EntryType$ShowroomCollage;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class EntryType implements Trackable {
    public static final int $stable = 0;
    private final String name;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/EntryType$BrandVideo;", "Lcom/sugarcube/app/base/data/analytics/EntryType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BrandVideo extends EntryType {
        public static final int $stable = 0;
        public static final BrandVideo INSTANCE = new BrandVideo();

        private BrandVideo() {
            super("BrandVideo", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BrandVideo);
        }

        public int hashCode() {
            return -1695494078;
        }

        public String toString() {
            return "BrandVideo";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/EntryType$Product3D;", "Lcom/sugarcube/app/base/data/analytics/EntryType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product3D extends EntryType {
        public static final int $stable = 0;
        public static final Product3D INSTANCE = new Product3D();

        private Product3D() {
            super("Product3D", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Product3D);
        }

        public int hashCode() {
            return 1758912210;
        }

        public String toString() {
            return "Product3D";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/EntryType$ProductAR;", "Lcom/sugarcube/app/base/data/analytics/EntryType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductAR extends EntryType {
        public static final int $stable = 0;
        public static final ProductAR INSTANCE = new ProductAR();

        private ProductAR() {
            super("ProductAR", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductAR);
        }

        public int hashCode() {
            return 1758912658;
        }

        public String toString() {
            return "ProductAR";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/EntryType$ShowroomCarousel;", "Lcom/sugarcube/app/base/data/analytics/EntryType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowroomCarousel extends EntryType {
        public static final int $stable = 0;
        public static final ShowroomCarousel INSTANCE = new ShowroomCarousel();

        private ShowroomCarousel() {
            super("ShowroomCarousel", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowroomCarousel);
        }

        public int hashCode() {
            return -1915528346;
        }

        public String toString() {
            return "ShowroomCarousel";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/EntryType$ShowroomCollage;", "Lcom/sugarcube/app/base/data/analytics/EntryType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowroomCollage extends EntryType {
        public static final int $stable = 0;
        public static final ShowroomCollage INSTANCE = new ShowroomCollage();

        private ShowroomCollage() {
            super("ShowroomCollage", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowroomCollage);
        }

        public int hashCode() {
            return -1329201203;
        }

        public String toString() {
            return "ShowroomCollage";
        }
    }

    public /* synthetic */ EntryType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getName() {
        return this.name;
    }

    public HashMap<TrackingKey, String> getValues() {
        return X.l(C16796C.a(TrackingKey.EntryType, this.name));
    }

    private EntryType(String str) {
        this.name = str;
    }
}
