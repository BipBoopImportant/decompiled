package com.sugarcube.app.base.data.database;

import android.net.Uri;
import kotlin.jvm.internal.C17542s;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/app/base/data/database/Metadata;", "", "name", "", "uri", "Landroid/net/Uri;", "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "getName", "()Ljava/lang/String;", "getUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Metadata {
    public static final int $stable = 8;
    private final String name;
    private final Uri uri;

    public Metadata(String str, Uri uri2) {
        C17542s.j(str, "name");
        C17542s.j(uri2, "uri");
        this.name = str;
        this.uri = uri2;
    }

    public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, Uri uri2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = metadata.name;
        }
        if ((i10 & 2) != 0) {
            uri2 = metadata.uri;
        }
        return metadata.copy(str, uri2);
    }

    public final String component1() {
        return this.name;
    }

    public final Uri component2() {
        return this.uri;
    }

    public final Metadata copy(String str, Uri uri2) {
        C17542s.j(str, "name");
        C17542s.j(uri2, "uri");
        return new Metadata(str, uri2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return C17542s.e(this.name, metadata.name) && C17542s.e(this.uri, metadata.uri);
    }

    public final String getName() {
        return this.name;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.uri.hashCode();
    }

    public String toString() {
        String str = this.name;
        Uri uri2 = this.uri;
        return "Metadata(name=" + str + ", uri=" + uri2 + ")";
    }
}
