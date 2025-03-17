package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lcom/sugarcube/core/network/models/SmartaPlacementResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/SmartaPlacementResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/SmartaPlacementResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/SmartaPlacementResponse;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "booleanAdapter", "Lcom/squareup/moshi/f;", "", "nullableIntAdapter", "Lcom/sugarcube/core/network/models/SmartaPlacement;", "nullableSmartaPlacementAdapter", "Lcom/sugarcube/core/network/models/SmartaDebug;", "nullableSmartaDebugAdapter", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SmartaPlacementResponseJsonAdapter extends f<SmartaPlacementResponse> {
    private final f<Boolean> booleanAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<SmartaDebug> nullableSmartaDebugAdapter;
    private final f<SmartaPlacement> nullableSmartaPlacementAdapter;
    private final k.a options;

    public SmartaPlacementResponseJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a(UiComponentContainer.RESULT_ERROR, "errorCode", "placedFurniture", "debug");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Boolean> f10 = tVar.f(Boolean.TYPE, g0.d(), UiComponentContainer.RESULT_ERROR);
        C17542s.i(f10, "adapter(...)");
        this.booleanAdapter = f10;
        f<Integer> f11 = tVar.f(Integer.class, g0.d(), "errorCode");
        C17542s.i(f11, "adapter(...)");
        this.nullableIntAdapter = f11;
        f<SmartaPlacement> f12 = tVar.f(SmartaPlacement.class, g0.d(), "placedFurniture");
        C17542s.i(f12, "adapter(...)");
        this.nullableSmartaPlacementAdapter = f12;
        f<SmartaDebug> f13 = tVar.f(SmartaDebug.class, g0.d(), "debug");
        C17542s.i(f13, "adapter(...)");
        this.nullableSmartaDebugAdapter = f13;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SmartaPlacementResponse");
        sb2.append(')');
        return sb2.toString();
    }

    public SmartaPlacementResponse fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        Boolean bool = null;
        Integer num = null;
        SmartaPlacement smartaPlacement = null;
        SmartaDebug smartaDebug = null;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                bool = this.booleanAdapter.fromJson(kVar);
                if (bool == null) {
                    throw c.w(UiComponentContainer.RESULT_ERROR, UiComponentContainer.RESULT_ERROR, kVar);
                }
            } else if (s10 == 1) {
                num = this.nullableIntAdapter.fromJson(kVar);
            } else if (s10 == 2) {
                smartaPlacement = this.nullableSmartaPlacementAdapter.fromJson(kVar);
            } else if (s10 == 3) {
                smartaDebug = this.nullableSmartaDebugAdapter.fromJson(kVar);
            }
        }
        kVar.f();
        if (bool != null) {
            return new SmartaPlacementResponse(bool.booleanValue(), num, smartaPlacement, smartaDebug);
        }
        throw c.n(UiComponentContainer.RESULT_ERROR, UiComponentContainer.RESULT_ERROR, kVar);
    }

    public void toJson(q qVar, SmartaPlacementResponse smartaPlacementResponse) {
        C17542s.j(qVar, "writer");
        if (smartaPlacementResponse != null) {
            qVar.d();
            qVar.n(UiComponentContainer.RESULT_ERROR);
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(smartaPlacementResponse.getError()));
            qVar.n("errorCode");
            this.nullableIntAdapter.toJson(qVar, smartaPlacementResponse.getErrorCode());
            qVar.n("placedFurniture");
            this.nullableSmartaPlacementAdapter.toJson(qVar, smartaPlacementResponse.getPlacedFurniture());
            qVar.n("debug");
            this.nullableSmartaDebugAdapter.toJson(qVar, smartaPlacementResponse.getDebug());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
