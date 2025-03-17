package com.sugarcube.app.base.data.database;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006 "}, d2 = {"Lcom/sugarcube/app/base/data/database/DatabaseSceneWithEntities;", "", "scene", "Lcom/sugarcube/app/base/data/database/DatabaseScene;", "medias", "", "Lcom/sugarcube/app/base/data/database/DatabaseMedia;", "metadatas", "Lcom/sugarcube/app/base/data/database/DatabaseMetadata;", "<init>", "(Lcom/sugarcube/app/base/data/database/DatabaseScene;Ljava/util/List;Ljava/util/List;)V", "getScene", "()Lcom/sugarcube/app/base/data/database/DatabaseScene;", "setScene", "(Lcom/sugarcube/app/base/data/database/DatabaseScene;)V", "getMedias", "()Ljava/util/List;", "setMedias", "(Ljava/util/List;)V", "getMetadatas", "setMetadatas", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DatabaseSceneWithEntities {
    public static final int $stable = 8;
    private List<DatabaseMedia> medias;
    private List<DatabaseMetadata> metadatas;
    private DatabaseScene scene;

    public DatabaseSceneWithEntities(DatabaseScene databaseScene, List<DatabaseMedia> list, List<DatabaseMetadata> list2) {
        C17542s.j(databaseScene, "scene");
        C17542s.j(list, "medias");
        C17542s.j(list2, "metadatas");
        this.scene = databaseScene;
        this.medias = list;
        this.metadatas = list2;
    }

    public static /* synthetic */ DatabaseSceneWithEntities copy$default(DatabaseSceneWithEntities databaseSceneWithEntities, DatabaseScene databaseScene, List<DatabaseMedia> list, List<DatabaseMetadata> list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            databaseScene = databaseSceneWithEntities.scene;
        }
        if ((i10 & 2) != 0) {
            list = databaseSceneWithEntities.medias;
        }
        if ((i10 & 4) != 0) {
            list2 = databaseSceneWithEntities.metadatas;
        }
        return databaseSceneWithEntities.copy(databaseScene, list, list2);
    }

    public final DatabaseScene component1() {
        return this.scene;
    }

    public final List<DatabaseMedia> component2() {
        return this.medias;
    }

    public final List<DatabaseMetadata> component3() {
        return this.metadatas;
    }

    public final DatabaseSceneWithEntities copy(DatabaseScene databaseScene, List<DatabaseMedia> list, List<DatabaseMetadata> list2) {
        C17542s.j(databaseScene, "scene");
        C17542s.j(list, "medias");
        C17542s.j(list2, "metadatas");
        return new DatabaseSceneWithEntities(databaseScene, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseSceneWithEntities)) {
            return false;
        }
        DatabaseSceneWithEntities databaseSceneWithEntities = (DatabaseSceneWithEntities) obj;
        return C17542s.e(this.scene, databaseSceneWithEntities.scene) && C17542s.e(this.medias, databaseSceneWithEntities.medias) && C17542s.e(this.metadatas, databaseSceneWithEntities.metadatas);
    }

    public final List<DatabaseMedia> getMedias() {
        return this.medias;
    }

    public final List<DatabaseMetadata> getMetadatas() {
        return this.metadatas;
    }

    public final DatabaseScene getScene() {
        return this.scene;
    }

    public int hashCode() {
        return (((this.scene.hashCode() * 31) + this.medias.hashCode()) * 31) + this.metadatas.hashCode();
    }

    public final void setMedias(List<DatabaseMedia> list) {
        C17542s.j(list, "<set-?>");
        this.medias = list;
    }

    public final void setMetadatas(List<DatabaseMetadata> list) {
        C17542s.j(list, "<set-?>");
        this.metadatas = list;
    }

    public final void setScene(DatabaseScene databaseScene) {
        C17542s.j(databaseScene, "<set-?>");
        this.scene = databaseScene;
    }

    public String toString() {
        DatabaseScene databaseScene = this.scene;
        List<DatabaseMedia> list = this.medias;
        List<DatabaseMetadata> list2 = this.metadatas;
        return "DatabaseSceneWithEntities(scene=" + databaseScene + ", medias=" + list + ", metadatas=" + list2 + ")";
    }
}
