package com.sugarcube.app.base.data.database;

import NE.C13286b;
import android.net.Uri;
import com.squareup.moshi.t;
import com.sugarcube.app.base.network.adapters.InstantJsonAdapter;
import com.sugarcube.app.base.network.adapters.UUIDJsonAdapter;
import com.sugarcube.app.base.network.adapters.UriJsonAdapter;
import com.sugarcube.core.network.models.Manifest;
import com.sugarcube.core.network.models.RoomType;
import java.time.Instant;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020 H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u0004\u0018\u00010%2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/sugarcube/app/base/data/database/Converters;", "", "<init>", "()V", "", "value", "Ljava/util/UUID;", "toUuid", "(Ljava/lang/String;)Ljava/util/UUID;", "fromUuid", "(Ljava/util/UUID;)Ljava/lang/String;", "Lcom/sugarcube/app/base/data/database/SceneState;", "toState", "(Ljava/lang/String;)Lcom/sugarcube/app/base/data/database/SceneState;", "fromState", "(Lcom/sugarcube/app/base/data/database/SceneState;)Ljava/lang/String;", "Lcom/sugarcube/core/network/models/Manifest;", "toManifest", "(Ljava/lang/String;)Lcom/sugarcube/core/network/models/Manifest;", "fromManifest", "(Lcom/sugarcube/core/network/models/Manifest;)Ljava/lang/String;", "Ljava/time/Instant;", "", "fromInstant", "(Ljava/time/Instant;)Ljava/lang/Long;", "toInstant", "(Ljava/lang/Long;)Ljava/time/Instant;", "Landroid/net/Uri;", "fromUri", "(Landroid/net/Uri;)Ljava/lang/String;", "toUri", "(Ljava/lang/String;)Landroid/net/Uri;", "Lcom/sugarcube/app/base/data/database/MediaType;", "fromMediaType", "(Lcom/sugarcube/app/base/data/database/MediaType;)Ljava/lang/String;", "toMediaType", "(Ljava/lang/String;)Lcom/sugarcube/app/base/data/database/MediaType;", "Lcom/sugarcube/core/network/models/RoomType;", "fromRoomType", "(Lcom/sugarcube/core/network/models/RoomType;)Ljava/lang/String;", "toRoomType", "(Ljava/lang/String;)Lcom/sugarcube/core/network/models/RoomType;", "Lcom/squareup/moshi/t;", "jsonConverter", "Lcom/squareup/moshi/t;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Converters {
    public static final int $stable = 8;
    private t jsonConverter;

    public Converters() {
        Class<Instant> cls = Instant.class;
        Class<Uri> cls2 = Uri.class;
        t d10 = new t.b().b(UUID.class, new UUIDJsonAdapter().nullSafe()).b(cls, new InstantJsonAdapter().nullSafe()).b(cls2, new UriJsonAdapter().nullSafe()).c(new C13286b()).d();
        C17542s.i(d10, "build(...)");
        this.jsonConverter = d10;
    }

    public final Long fromInstant(Instant instant) {
        if (instant != null) {
            return Long.valueOf(instant.toEpochMilli());
        }
        return null;
    }

    public final String fromManifest(Manifest manifest) {
        if (manifest != null) {
            return this.jsonConverter.c(Manifest.class).toJson(manifest);
        }
        return null;
    }

    public final String fromMediaType(MediaType mediaType) {
        C17542s.j(mediaType, "value");
        return mediaType.name();
    }

    public final String fromRoomType(RoomType roomType) {
        if (roomType != null) {
            return roomType.name();
        }
        return null;
    }

    public final String fromState(SceneState sceneState) {
        C17542s.j(sceneState, "value");
        return sceneState.name();
    }

    public final String fromUri(Uri uri) {
        C17542s.j(uri, "value");
        String uri2 = uri.toString();
        C17542s.i(uri2, "toString(...)");
        return uri2;
    }

    public final String fromUuid(UUID uuid) {
        if (uuid != null) {
            return uuid.toString();
        }
        return null;
    }

    public final Instant toInstant(Long l10) {
        if (l10 != null) {
            return Instant.ofEpochMilli(l10.longValue());
        }
        return null;
    }

    public final Manifest toManifest(String str) {
        if (str != null) {
            return this.jsonConverter.c(Manifest.class).fromJson(str);
        }
        return null;
    }

    public final MediaType toMediaType(String str) {
        C17542s.j(str, "value");
        return MediaType.valueOf(str);
    }

    public final RoomType toRoomType(String str) {
        if (str != null) {
            return RoomType.valueOf(str);
        }
        return null;
    }

    public final SceneState toState(String str) {
        C17542s.j(str, "value");
        return SceneState.valueOf(str);
    }

    public final Uri toUri(String str) {
        C17542s.j(str, "value");
        Uri parse = Uri.parse(str);
        C17542s.i(parse, "parse(...)");
        return parse;
    }

    public final UUID toUuid(String str) {
        if (str == null) {
            return null;
        }
        try {
            return UUID.fromString(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
