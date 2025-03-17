package com.ikea.kompassmap.model.product;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u0005H×\u0001J\t\u0010\u001b\u001a\u00020\bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/ikea/kompassmap/model/product/Image;", "", "quality", "Lcom/ikea/kompassmap/model/product/Quality;", "height", "", "width", "href", "", "<init>", "(Lcom/ikea/kompassmap/model/product/Quality;IILjava/lang/String;)V", "getQuality", "()Lcom/ikea/kompassmap/model/product/Quality;", "getHeight", "()I", "getWidth", "getHref", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Image {
    public static final int $stable = 0;
    private final int height;
    private final String href;
    private final Quality quality;
    private final int width;

    public Image(Quality quality2, int i10, int i11, String str) {
        C17542s.j(quality2, "quality");
        C17542s.j(str, "href");
        this.quality = quality2;
        this.height = i10;
        this.width = i11;
        this.href = str;
    }

    public static /* synthetic */ Image copy$default(Image image, Quality quality2, int i10, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            quality2 = image.quality;
        }
        if ((i12 & 2) != 0) {
            i10 = image.height;
        }
        if ((i12 & 4) != 0) {
            i11 = image.width;
        }
        if ((i12 & 8) != 0) {
            str = image.href;
        }
        return image.copy(quality2, i10, i11, str);
    }

    public final Quality component1() {
        return this.quality;
    }

    public final int component2() {
        return this.height;
    }

    public final int component3() {
        return this.width;
    }

    public final String component4() {
        return this.href;
    }

    public final Image copy(Quality quality2, int i10, int i11, String str) {
        C17542s.j(quality2, "quality");
        C17542s.j(str, "href");
        return new Image(quality2, i10, i11, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return this.quality == image.quality && this.height == image.height && this.width == image.width && C17542s.e(this.href, image.href);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getHref() {
        return this.href;
    }

    public final Quality getQuality() {
        return this.quality;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((this.quality.hashCode() * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.width)) * 31) + this.href.hashCode();
    }

    public String toString() {
        return "Image(quality=" + this.quality + ", height=" + this.height + ", width=" + this.width + ", href=" + this.href + ')';
    }
}
