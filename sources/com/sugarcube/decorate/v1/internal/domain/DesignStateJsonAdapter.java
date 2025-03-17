package com.sugarcube.decorate.v1.internal.domain;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.sugarcube.decorate.DesignItemInfo;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006!"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/domain/DesignStateJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/decorate/v1/internal/domain/DesignState;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/decorate/v1/internal/domain/DesignState;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "b", "(Lcom/squareup/moshi/q;Lcom/sugarcube/decorate/v1/internal/domain/DesignState;)V", "Lcom/squareup/moshi/k$a;", "Lcom/squareup/moshi/k$a;", "options", "Ljava/util/UUID;", "Lcom/squareup/moshi/f;", "nullableUUIDAdapter", "", "Lcom/sugarcube/decorate/DesignItemInfo;", "c", "listOfDesignItemInfoAdapter", "", "d", "nullableListOfIntAdapter", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DesignStateJsonAdapter extends f<DesignState> {

    /* renamed from: a  reason: collision with root package name */
    private final k.a f141747a;

    /* renamed from: b  reason: collision with root package name */
    private final f<UUID> f141748b;

    /* renamed from: c  reason: collision with root package name */
    private final f<List<DesignItemInfo>> f141749c;

    /* renamed from: d  reason: collision with root package name */
    private final f<List<Integer>> f141750d;

    public DesignStateJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("sceneUuid", "compositionUuid", "items", "pickIds");
        C17542s.i(a10, "of(...)");
        this.f141747a = a10;
        f<UUID> f10 = tVar.f(UUID.class, g0.d(), "sceneUuid");
        C17542s.i(f10, "adapter(...)");
        this.f141748b = f10;
        Class<List> cls = List.class;
        f<List<DesignItemInfo>> f11 = tVar.f(w.j(cls, DesignItemInfo.class), g0.d(), "items");
        C17542s.i(f11, "adapter(...)");
        this.f141749c = f11;
        f<List<Integer>> f12 = tVar.f(w.j(cls, Integer.class), g0.d(), "pickIds");
        C17542s.i(f12, "adapter(...)");
        this.f141750d = f12;
    }

    /* renamed from: a */
    public DesignState fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        UUID uuid = null;
        UUID uuid2 = null;
        List list = null;
        List list2 = null;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.f141747a);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                uuid = this.f141748b.fromJson(kVar);
            } else if (s10 == 1) {
                uuid2 = this.f141748b.fromJson(kVar);
            } else if (s10 == 2) {
                list = this.f141749c.fromJson(kVar);
                if (list == null) {
                    throw c.w("items", "items", kVar);
                }
            } else if (s10 == 3) {
                list2 = this.f141750d.fromJson(kVar);
            }
        }
        kVar.f();
        if (list != null) {
            return new DesignState(uuid, uuid2, list, list2);
        }
        throw c.n("items", "items", kVar);
    }

    /* renamed from: b */
    public void toJson(q qVar, DesignState designState) {
        C17542s.j(qVar, "writer");
        if (designState != null) {
            qVar.d();
            qVar.n("sceneUuid");
            this.f141748b.toJson(qVar, designState.d());
            qVar.n("compositionUuid");
            this.f141748b.toJson(qVar, designState.a());
            qVar.n("items");
            this.f141749c.toJson(qVar, designState.b());
            qVar.n("pickIds");
            this.f141750d.toJson(qVar, designState.c());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("DesignState");
        sb2.append(')');
        return sb2.toString();
    }
}
