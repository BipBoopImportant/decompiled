package com.sugarcube.core.network.models;

import android.net.Uri;
import com.squareup.moshi.e;
import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/core/network/models/GlbUrls;", "", "complete", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getComplete", "()Landroid/net/Uri;", "setComplete", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class GlbUrls {
    private Uri complete;

    public GlbUrls() {
        this((Uri) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GlbUrls copy$default(GlbUrls glbUrls, Uri uri, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = glbUrls.complete;
        }
        return glbUrls.copy(uri);
    }

    public final Uri component1() {
        return this.complete;
    }

    public final GlbUrls copy(@e(name = "complete") Uri uri) {
        C17542s.j(uri, "complete");
        return new GlbUrls(uri);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GlbUrls) && C17542s.e(this.complete, ((GlbUrls) obj).complete);
    }

    public final Uri getComplete() {
        return this.complete;
    }

    public int hashCode() {
        return this.complete.hashCode();
    }

    public final void setComplete(Uri uri) {
        C17542s.j(uri, "<set-?>");
        this.complete = uri;
    }

    public String toString() {
        Uri uri = this.complete;
        return "GlbUrls(complete=" + uri + ")";
    }

    public GlbUrls(@e(name = "complete") Uri uri) {
        C17542s.j(uri, "complete");
        this.complete = uri;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GlbUrls(Uri uri, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Uri.EMPTY : uri);
    }
}
