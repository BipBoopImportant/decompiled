package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/sugarcube/core/network/models/PartialSearchResultJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/PartialSearchResult;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/PartialSearchResult;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/PartialSearchResult;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "Lcom/sugarcube/core/network/models/PartialSearchCompletion;", "nullablePartialSearchCompletionAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "", "", "nullableListOfAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PartialSearchResultJsonAdapter extends f<PartialSearchResult> {
    private volatile Constructor<PartialSearchResult> constructorRef;
    private final f<List<Object>> nullableListOfAnyAdapter;
    private final f<PartialSearchCompletion> nullablePartialSearchCompletionAdapter;
    private final f<String> nullableStringAdapter;
    private final k.a options;

    public PartialSearchResultJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("completion", "label", "metadata", "actionTokens");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<PartialSearchCompletion> f10 = tVar.f(PartialSearchCompletion.class, g0.d(), "completion");
        C17542s.i(f10, "adapter(...)");
        this.nullablePartialSearchCompletionAdapter = f10;
        f<String> f11 = tVar.f(String.class, g0.d(), "label");
        C17542s.i(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        f<List<Object>> f12 = tVar.f(w.j(List.class, Object.class), g0.d(), "actionTokens");
        C17542s.i(f12, "adapter(...)");
        this.nullableListOfAnyAdapter = f12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PartialSearchResult");
        sb2.append(')');
        return sb2.toString();
    }

    public PartialSearchResult fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        PartialSearchCompletion partialSearchCompletion = null;
        String str = null;
        String str2 = null;
        List list = null;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                partialSearchCompletion = this.nullablePartialSearchCompletionAdapter.fromJson(kVar);
                i10 &= -2;
            } else if (s10 == 1) {
                str = this.nullableStringAdapter.fromJson(kVar);
                i10 &= -3;
            } else if (s10 == 2) {
                str2 = this.nullableStringAdapter.fromJson(kVar);
                i10 &= -5;
            } else if (s10 == 3) {
                list = this.nullableListOfAnyAdapter.fromJson(kVar);
                i10 &= -9;
            }
        }
        kVar.f();
        if (i10 == -16) {
            return new PartialSearchResult(partialSearchCompletion, str, str2, list);
        }
        Constructor<PartialSearchResult> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PartialSearchResult.class.getDeclaredConstructor(new Class[]{PartialSearchCompletion.class, String.class, String.class, List.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        PartialSearchResult newInstance = constructor.newInstance(new Object[]{partialSearchCompletion, str, str2, list, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, PartialSearchResult partialSearchResult) {
        C17542s.j(qVar, "writer");
        if (partialSearchResult != null) {
            qVar.d();
            qVar.n("completion");
            this.nullablePartialSearchCompletionAdapter.toJson(qVar, partialSearchResult.getCompletion());
            qVar.n("label");
            this.nullableStringAdapter.toJson(qVar, partialSearchResult.getLabel());
            qVar.n("metadata");
            this.nullableStringAdapter.toJson(qVar, partialSearchResult.getMetadata());
            qVar.n("actionTokens");
            this.nullableListOfAnyAdapter.toJson(qVar, partialSearchResult.getActionTokens());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
