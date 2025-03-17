package com.sugarcube.core.network.models;

import android.net.Uri;
import com.squareup.moshi.e;
import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/sugarcube/core/network/models/MultiviewThumbnail;", "", "engineViewIndex", "", "thumbnailUrl", "", "<init>", "(ILjava/lang/String;)V", "getEngineViewIndex", "()I", "getThumbnailUrl", "()Ljava/lang/String;", "thumbnailUri", "Landroid/net/Uri;", "getThumbnailUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class MultiviewThumbnail {
    private final int engineViewIndex;
    private final String thumbnailUrl;

    public MultiviewThumbnail(@e(name = "number") int i10, String str) {
        C17542s.j(str, "thumbnailUrl");
        this.engineViewIndex = i10;
        this.thumbnailUrl = str;
    }

    public static /* synthetic */ MultiviewThumbnail copy$default(MultiviewThumbnail multiviewThumbnail, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = multiviewThumbnail.engineViewIndex;
        }
        if ((i11 & 2) != 0) {
            str = multiviewThumbnail.thumbnailUrl;
        }
        return multiviewThumbnail.copy(i10, str);
    }

    public final int component1() {
        return this.engineViewIndex;
    }

    public final String component2() {
        return this.thumbnailUrl;
    }

    public final MultiviewThumbnail copy(@e(name = "number") int i10, String str) {
        C17542s.j(str, "thumbnailUrl");
        return new MultiviewThumbnail(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiviewThumbnail)) {
            return false;
        }
        MultiviewThumbnail multiviewThumbnail = (MultiviewThumbnail) obj;
        return this.engineViewIndex == multiviewThumbnail.engineViewIndex && C17542s.e(this.thumbnailUrl, multiviewThumbnail.thumbnailUrl);
    }

    public final int getEngineViewIndex() {
        return this.engineViewIndex;
    }

    public final Uri getThumbnailUri() {
        Uri parse = Uri.parse(this.thumbnailUrl);
        C17542s.i(parse, "parse(...)");
        return parse;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        return (Integer.hashCode(this.engineViewIndex) * 31) + this.thumbnailUrl.hashCode();
    }

    public String toString() {
        int i10 = this.engineViewIndex;
        String str = this.thumbnailUrl;
        return "MultiviewThumbnail(engineViewIndex=" + i10 + ", thumbnailUrl=" + str + ")";
    }
}
