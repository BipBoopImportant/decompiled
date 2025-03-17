package com.sugarcube.app.base.data.model;

import com.squareup.moshi.g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/app/base/data/model/Dimension;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "setWidth", "(I)V", "getHeight", "setHeight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class Dimension {
    public static final int $stable = 8;
    private int height;
    private int width;

    public Dimension(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public static /* synthetic */ Dimension copy$default(Dimension dimension, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = dimension.width;
        }
        if ((i12 & 2) != 0) {
            i11 = dimension.height;
        }
        return dimension.copy(i10, i11);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final Dimension copy(int i10, int i11) {
        return new Dimension(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dimension)) {
            return false;
        }
        Dimension dimension = (Dimension) obj;
        return this.width == dimension.width && this.height == dimension.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    public String toString() {
        int i10 = this.width;
        int i11 = this.height;
        return "Dimension(width=" + i10 + ", height=" + i11 + ")";
    }
}
