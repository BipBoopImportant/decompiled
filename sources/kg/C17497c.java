package kG;

import RF.i;
import XH.C16796C;
import YH.X;
import android.net.Uri;
import com.sugarcube.app.base.data.analytics.RoomSource;
import com.sugarcube.app.base.data.database.CachedCompiledComposition;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackableKt;
import com.sugarcube.core.analytics.TrackingKey;
import com.sugarcube.core.network.models.Manifest;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.decorate_engine.SceneLayout;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017`\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJn\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b2\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b0\u00109\u001a\u0004\b6\u0010:R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b+\u0010=R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010C\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\bB\u0010.R\u0011\u0010F\u001a\u00020D8F¢\u0006\u0006\u001a\u0004\b;\u0010ER\u0011\u0010I\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\b>\u0010H¨\u0006J"}, d2 = {"LkG/c;", "Lcom/sugarcube/core/analytics/Trackable;", "Ljava/util/UUID;", "sceneUuid", "compositionUuid", "", "isNewComposition", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "Landroid/net/Uri;", "glbPath", "Lcom/sugarcube/core/network/models/Manifest;", "manifest", "Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "cachedCompiledComposition", "Lcom/sugarcube/app/base/data/analytics/RoomSource;", "source", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;ZLcom/sugarcube/app/base/data/database/Scene;Lcom/sugarcube/core/network/models/RoomType;Landroid/net/Uri;Lcom/sugarcube/core/network/models/Manifest;Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;Lcom/sugarcube/app/base/data/analytics/RoomSource;)V", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "", "Lkotlin/collections/HashMap;", "getValues", "()Ljava/util/HashMap;", "a", "(Ljava/util/UUID;Ljava/util/UUID;ZLcom/sugarcube/app/base/data/database/Scene;Lcom/sugarcube/core/network/models/RoomType;Landroid/net/Uri;Lcom/sugarcube/core/network/models/Manifest;Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;Lcom/sugarcube/app/base/data/analytics/RoomSource;)LkG/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getSceneUuid", "()Ljava/util/UUID;", "b", "d", "c", "Z", "j", "()Z", "Lcom/sugarcube/app/base/data/database/Scene;", "g", "()Lcom/sugarcube/app/base/data/database/Scene;", "e", "Lcom/sugarcube/core/network/models/RoomType;", "getRoomType", "()Lcom/sugarcube/core/network/models/RoomType;", "f", "Landroid/net/Uri;", "()Landroid/net/Uri;", "Lcom/sugarcube/core/network/models/Manifest;", "()Lcom/sugarcube/core/network/models/Manifest;", "h", "Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "()Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "i", "Lcom/sugarcube/app/base/data/analytics/RoomSource;", "getSource", "()Lcom/sugarcube/app/base/data/analytics/RoomSource;", "k", "isShowroom", "Lcom/sugarcube/decorate_engine/SceneLayout;", "()Lcom/sugarcube/decorate_engine/SceneLayout;", "sceneLayout", "LkG/a;", "()LkG/a;", "sceneType", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kG.c  reason: case insensitive filesystem */
public final class C17497c implements Trackable {

    /* renamed from: a  reason: collision with root package name */
    private final UUID f144239a;

    /* renamed from: b  reason: collision with root package name */
    private final UUID f144240b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f144241c;

    /* renamed from: d  reason: collision with root package name */
    private final Scene f144242d;

    /* renamed from: e  reason: collision with root package name */
    private final RoomType f144243e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f144244f;

    /* renamed from: g  reason: collision with root package name */
    private final Manifest f144245g;

    /* renamed from: h  reason: collision with root package name */
    private final CachedCompiledComposition f144246h;

    /* renamed from: i  reason: collision with root package name */
    private final RoomSource f144247i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f144248j;

    public C17497c(UUID uuid, UUID uuid2, boolean z10, Scene scene, RoomType roomType, Uri uri, Manifest manifest, CachedCompiledComposition cachedCompiledComposition, RoomSource roomSource) {
        C17542s.j(uuid, "sceneUuid");
        C17542s.j(uuid2, "compositionUuid");
        C17542s.j(scene, "scene");
        C17542s.j(roomType, "roomType");
        C17542s.j(cachedCompiledComposition, "cachedCompiledComposition");
        C17542s.j(roomSource, "source");
        this.f144239a = uuid;
        this.f144240b = uuid2;
        this.f144241c = z10;
        this.f144242d = scene;
        this.f144243e = roomType;
        this.f144244f = uri;
        this.f144245g = manifest;
        this.f144246h = cachedCompiledComposition;
        this.f144247i = roomSource;
        this.f144248j = scene.isStock();
    }

    public static /* synthetic */ C17497c b(C17497c cVar, UUID uuid, UUID uuid2, boolean z10, Scene scene, RoomType roomType, Uri uri, Manifest manifest, CachedCompiledComposition cachedCompiledComposition, RoomSource roomSource, int i10, Object obj) {
        C17497c cVar2 = cVar;
        int i11 = i10;
        return cVar.a((i11 & 1) != 0 ? cVar2.f144239a : uuid, (i11 & 2) != 0 ? cVar2.f144240b : uuid2, (i11 & 4) != 0 ? cVar2.f144241c : z10, (i11 & 8) != 0 ? cVar2.f144242d : scene, (i11 & 16) != 0 ? cVar2.f144243e : roomType, (i11 & 32) != 0 ? cVar2.f144244f : uri, (i11 & 64) != 0 ? cVar2.f144245g : manifest, (i11 & 128) != 0 ? cVar2.f144246h : cachedCompiledComposition, (i11 & 256) != 0 ? cVar2.f144247i : roomSource);
    }

    public final C17497c a(UUID uuid, UUID uuid2, boolean z10, Scene scene, RoomType roomType, Uri uri, Manifest manifest, CachedCompiledComposition cachedCompiledComposition, RoomSource roomSource) {
        C17542s.j(uuid, "sceneUuid");
        C17542s.j(uuid2, "compositionUuid");
        C17542s.j(scene, "scene");
        RoomType roomType2 = roomType;
        C17542s.j(roomType2, "roomType");
        CachedCompiledComposition cachedCompiledComposition2 = cachedCompiledComposition;
        C17542s.j(cachedCompiledComposition2, "cachedCompiledComposition");
        RoomSource roomSource2 = roomSource;
        C17542s.j(roomSource2, "source");
        return new C17497c(uuid, uuid2, z10, scene, roomType2, uri, manifest, cachedCompiledComposition2, roomSource2);
    }

    public final CachedCompiledComposition c() {
        return this.f144246h;
    }

    public final UUID d() {
        return this.f144240b;
    }

    public final Uri e() {
        return this.f144244f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17497c)) {
            return false;
        }
        C17497c cVar = (C17497c) obj;
        return C17542s.e(this.f144239a, cVar.f144239a) && C17542s.e(this.f144240b, cVar.f144240b) && this.f144241c == cVar.f144241c && C17542s.e(this.f144242d, cVar.f144242d) && this.f144243e == cVar.f144243e && C17542s.e(this.f144244f, cVar.f144244f) && C17542s.e(this.f144245g, cVar.f144245g) && C17542s.e(this.f144246h, cVar.f144246h) && this.f144247i == cVar.f144247i;
    }

    public final Manifest f() {
        return this.f144245g;
    }

    public final Scene g() {
        return this.f144242d;
    }

    public final RoomType getRoomType() {
        return this.f144243e;
    }

    public HashMap<TrackingKey, String> getValues() {
        HashMap<TrackingKey, String> l10 = X.l(C16796C.a(TrackingKey.RoomName, TrackableKt.toTrackableValue(this.f144246h.getDisplayName(), "Untitled Design")), C16796C.a(TrackingKey.RoomSource, this.f144247i.getKey()));
        l10.putAll(this.f144246h.getValues());
        return l10;
    }

    public final SceneLayout h() {
        return i.D(this.f144246h);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f144239a.hashCode() * 31) + this.f144240b.hashCode()) * 31) + Boolean.hashCode(this.f144241c)) * 31) + this.f144242d.hashCode()) * 31) + this.f144243e.hashCode()) * 31;
        Uri uri = this.f144244f;
        int i10 = 0;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Manifest manifest = this.f144245g;
        if (manifest != null) {
            i10 = manifest.hashCode();
        }
        return ((((hashCode2 + i10) * 31) + this.f144246h.hashCode()) * 31) + this.f144247i.hashCode();
    }

    public final C17495a i() {
        return this.f144242d.isHela() ? C17495a.Hela : C17495a.Regular;
    }

    public final boolean j() {
        return this.f144241c;
    }

    public final boolean k() {
        return this.f144248j;
    }

    public String toString() {
        UUID uuid = this.f144239a;
        UUID uuid2 = this.f144240b;
        boolean z10 = this.f144241c;
        Scene scene = this.f144242d;
        RoomType roomType = this.f144243e;
        Uri uri = this.f144244f;
        Manifest manifest = this.f144245g;
        CachedCompiledComposition cachedCompiledComposition = this.f144246h;
        RoomSource roomSource = this.f144247i;
        return "SceneLoadingMetadata(sceneUuid=" + uuid + ", compositionUuid=" + uuid2 + ", isNewComposition=" + z10 + ", scene=" + scene + ", roomType=" + roomType + ", glbPath=" + uri + ", manifest=" + manifest + ", cachedCompiledComposition=" + cachedCompiledComposition + ", source=" + roomSource + ")";
    }
}
