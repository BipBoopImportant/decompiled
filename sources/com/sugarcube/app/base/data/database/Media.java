package com.sugarcube.app.base.data.database;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006!"}, d2 = {"Lcom/sugarcube/app/base/data/database/Media;", "", "name", "", "uri", "Landroid/net/Uri;", "type", "Lcom/sugarcube/app/base/data/database/MediaType;", "width", "", "height", "<init>", "(Ljava/lang/String;Landroid/net/Uri;Lcom/sugarcube/app/base/data/database/MediaType;II)V", "getName", "()Ljava/lang/String;", "getUri", "()Landroid/net/Uri;", "getType", "()Lcom/sugarcube/app/base/data/database/MediaType;", "getWidth", "()I", "getHeight", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Media {
    public static final int $stable = 8;
    private final int height;
    private final String name;
    private final MediaType type;
    private final Uri uri;
    private final int width;

    public Media(String str, Uri uri2, MediaType mediaType, int i10, int i11) {
        C17542s.j(str, "name");
        C17542s.j(uri2, "uri");
        C17542s.j(mediaType, "type");
        this.name = str;
        this.uri = uri2;
        this.type = mediaType;
        this.width = i10;
        this.height = i11;
    }

    public static /* synthetic */ Media copy$default(Media media, String str, Uri uri2, MediaType mediaType, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = media.name;
        }
        if ((i12 & 2) != 0) {
            uri2 = media.uri;
        }
        Uri uri3 = uri2;
        if ((i12 & 4) != 0) {
            mediaType = media.type;
        }
        MediaType mediaType2 = mediaType;
        if ((i12 & 8) != 0) {
            i10 = media.width;
        }
        int i13 = i10;
        if ((i12 & 16) != 0) {
            i11 = media.height;
        }
        return media.copy(str, uri3, mediaType2, i13, i11);
    }

    public final String component1() {
        return this.name;
    }

    public final Uri component2() {
        return this.uri;
    }

    public final MediaType component3() {
        return this.type;
    }

    public final int component4() {
        return this.width;
    }

    public final int component5() {
        return this.height;
    }

    public final Media copy(String str, Uri uri2, MediaType mediaType, int i10, int i11) {
        C17542s.j(str, "name");
        C17542s.j(uri2, "uri");
        C17542s.j(mediaType, "type");
        return new Media(str, uri2, mediaType, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        Media media = (Media) obj;
        return C17542s.e(this.name, media.name) && C17542s.e(this.uri, media.uri) && this.type == media.type && this.width == media.width && this.height == media.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getName() {
        return this.name;
    }

    public final MediaType getType() {
        return this.type;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.uri.hashCode()) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
    }

    public String toString() {
        String str = this.name;
        Uri uri2 = this.uri;
        MediaType mediaType = this.type;
        int i10 = this.width;
        int i11 = this.height;
        return "Media(name=" + str + ", uri=" + uri2 + ", type=" + mediaType + ", width=" + i10 + ", height=" + i11 + ")";
    }
}
