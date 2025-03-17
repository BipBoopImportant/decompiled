package com.sugarcube.core.network.models;

import YH.g0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/core/network/models/QuickFilterJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/QuickFilter;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/QuickFilter;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/QuickFilter;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "nullableStringAdapter", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/RoomType;", "nullableRoomTypeAdapter", "", "nullableIntAdapter", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuickFilterJsonAdapter extends f<QuickFilter> {
    private final f<Integer> nullableIntAdapter;
    private final f<RoomType> nullableRoomTypeAdapter;
    private final f<String> nullableStringAdapter;
    private final k.a options;

    public QuickFilterJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("id", PlaceTypes.COUNTRY, "language", "roomType", "label", "order", "subcatalog", "search", "category");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<String> f10 = tVar.f(String.class, g0.d(), "id");
        C17542s.i(f10, "adapter(...)");
        this.nullableStringAdapter = f10;
        f<RoomType> f11 = tVar.f(RoomType.class, g0.d(), "roomType");
        C17542s.i(f11, "adapter(...)");
        this.nullableRoomTypeAdapter = f11;
        f<Integer> f12 = tVar.f(Integer.class, g0.d(), "order");
        C17542s.i(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("QuickFilter");
        sb2.append(')');
        return sb2.toString();
    }

    public QuickFilter fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        String str = null;
        String str2 = null;
        String str3 = null;
        RoomType roomType = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (kVar.hasNext()) {
            switch (kVar.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(kVar);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(kVar);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(kVar);
                    break;
                case 3:
                    roomType = this.nullableRoomTypeAdapter.fromJson(kVar);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(kVar);
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(kVar);
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(kVar);
                    break;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(kVar);
                    break;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(kVar);
                    break;
            }
        }
        kVar.f();
        return new QuickFilter(str, str2, str3, roomType, str4, num, str5, str6, str7);
    }

    public void toJson(q qVar, QuickFilter quickFilter) {
        C17542s.j(qVar, "writer");
        if (quickFilter != null) {
            qVar.d();
            qVar.n("id");
            this.nullableStringAdapter.toJson(qVar, quickFilter.getId());
            qVar.n(PlaceTypes.COUNTRY);
            this.nullableStringAdapter.toJson(qVar, quickFilter.getCountry());
            qVar.n("language");
            this.nullableStringAdapter.toJson(qVar, quickFilter.getLanguage());
            qVar.n("roomType");
            this.nullableRoomTypeAdapter.toJson(qVar, quickFilter.getRoomType());
            qVar.n("label");
            this.nullableStringAdapter.toJson(qVar, quickFilter.getLabel());
            qVar.n("order");
            this.nullableIntAdapter.toJson(qVar, quickFilter.getOrder());
            qVar.n("subcatalog");
            this.nullableStringAdapter.toJson(qVar, quickFilter.getSubcatalog());
            qVar.n("search");
            this.nullableStringAdapter.toJson(qVar, quickFilter.getSearch());
            qVar.n("category");
            this.nullableStringAdapter.toJson(qVar, quickFilter.getCategory());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
