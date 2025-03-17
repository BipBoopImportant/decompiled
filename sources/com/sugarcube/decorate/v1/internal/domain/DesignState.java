package com.sugarcube.decorate.v1.internal.domain;

import com.squareup.moshi.g;
import com.sugarcube.decorate.DesignItemInfo;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/domain/DesignState;", "", "Ljava/util/UUID;", "sceneUuid", "compositionUuid", "", "Lcom/sugarcube/decorate/DesignItemInfo;", "items", "", "pickIds", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "d", "()Ljava/util/UUID;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class DesignState {

    /* renamed from: a  reason: collision with root package name */
    private final UUID f141743a;

    /* renamed from: b  reason: collision with root package name */
    private final UUID f141744b;

    /* renamed from: c  reason: collision with root package name */
    private final List<DesignItemInfo> f141745c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Integer> f141746d;

    public DesignState(UUID uuid, UUID uuid2, List<DesignItemInfo> list, List<Integer> list2) {
        C17542s.j(list, "items");
        this.f141743a = uuid;
        this.f141744b = uuid2;
        this.f141745c = list;
        this.f141746d = list2;
    }

    public final UUID a() {
        return this.f141744b;
    }

    public final List<DesignItemInfo> b() {
        return this.f141745c;
    }

    public final List<Integer> c() {
        return this.f141746d;
    }

    public final UUID d() {
        return this.f141743a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DesignState)) {
            return false;
        }
        DesignState designState = (DesignState) obj;
        return C17542s.e(this.f141743a, designState.f141743a) && C17542s.e(this.f141744b, designState.f141744b) && C17542s.e(this.f141745c, designState.f141745c) && C17542s.e(this.f141746d, designState.f141746d);
    }

    public int hashCode() {
        UUID uuid = this.f141743a;
        int i10 = 0;
        int hashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        UUID uuid2 = this.f141744b;
        int hashCode2 = (((hashCode + (uuid2 == null ? 0 : uuid2.hashCode())) * 31) + this.f141745c.hashCode()) * 31;
        List<Integer> list = this.f141746d;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        UUID uuid = this.f141743a;
        UUID uuid2 = this.f141744b;
        List<DesignItemInfo> list = this.f141745c;
        List<Integer> list2 = this.f141746d;
        return "DesignState(sceneUuid=" + uuid + ", compositionUuid=" + uuid2 + ", items=" + list + ", pickIds=" + list2 + ")";
    }
}
