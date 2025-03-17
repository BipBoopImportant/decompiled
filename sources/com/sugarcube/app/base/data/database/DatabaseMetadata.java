package com.sugarcube.app.base.data.database;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/sugarcube/app/base/data/database/DatabaseMetadata;", "", "id", "", "databaseSceneId", "name", "", "uri", "Landroid/net/Uri;", "<init>", "(JJLjava/lang/String;Landroid/net/Uri;)V", "meta", "Lcom/sugarcube/app/base/data/database/Metadata;", "(JLcom/sugarcube/app/base/data/database/Metadata;)V", "getId", "()J", "getDatabaseSceneId", "setDatabaseSceneId", "(J)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DatabaseMetadata {
    public static final int $stable = 8;
    private long databaseSceneId;

    /* renamed from: id  reason: collision with root package name */
    private final long f122935id;
    private String name;
    private Uri uri;

    public DatabaseMetadata(long j10, long j11, String str, Uri uri2) {
        C17542s.j(str, "name");
        C17542s.j(uri2, "uri");
        this.f122935id = j10;
        this.databaseSceneId = j11;
        this.name = str;
        this.uri = uri2;
    }

    public static /* synthetic */ DatabaseMetadata copy$default(DatabaseMetadata databaseMetadata, long j10, long j11, String str, Uri uri2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = databaseMetadata.f122935id;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = databaseMetadata.databaseSceneId;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            str = databaseMetadata.name;
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            uri2 = databaseMetadata.uri;
        }
        return databaseMetadata.copy(j12, j13, str2, uri2);
    }

    public final long component1() {
        return this.f122935id;
    }

    public final long component2() {
        return this.databaseSceneId;
    }

    public final String component3() {
        return this.name;
    }

    public final Uri component4() {
        return this.uri;
    }

    public final DatabaseMetadata copy(long j10, long j11, String str, Uri uri2) {
        C17542s.j(str, "name");
        C17542s.j(uri2, "uri");
        return new DatabaseMetadata(j10, j11, str, uri2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseMetadata)) {
            return false;
        }
        DatabaseMetadata databaseMetadata = (DatabaseMetadata) obj;
        return this.f122935id == databaseMetadata.f122935id && this.databaseSceneId == databaseMetadata.databaseSceneId && C17542s.e(this.name, databaseMetadata.name) && C17542s.e(this.uri, databaseMetadata.uri);
    }

    public final long getDatabaseSceneId() {
        return this.databaseSceneId;
    }

    public final long getId() {
        return this.f122935id;
    }

    public final String getName() {
        return this.name;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f122935id) * 31) + Long.hashCode(this.databaseSceneId)) * 31) + this.name.hashCode()) * 31) + this.uri.hashCode();
    }

    public final void setDatabaseSceneId(long j10) {
        this.databaseSceneId = j10;
    }

    public final void setName(String str) {
        C17542s.j(str, "<set-?>");
        this.name = str;
    }

    public final void setUri(Uri uri2) {
        C17542s.j(uri2, "<set-?>");
        this.uri = uri2;
    }

    public String toString() {
        long j10 = this.f122935id;
        long j11 = this.databaseSceneId;
        String str = this.name;
        Uri uri2 = this.uri;
        return "DatabaseMetadata(id=" + j10 + ", databaseSceneId=" + j11 + ", name=" + str + ", uri=" + uri2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DatabaseMetadata(long j10, Metadata metadata) {
        this(0, j10, metadata.getName(), metadata.getUri());
        C17542s.j(metadata, "meta");
    }
}
