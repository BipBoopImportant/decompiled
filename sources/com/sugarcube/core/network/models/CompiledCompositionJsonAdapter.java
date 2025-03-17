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

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/sugarcube/core/network/models/CompiledCompositionJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/CompiledComposition;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/CompiledComposition;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/CompiledComposition;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "Lcom/sugarcube/core/network/models/Composition;", "compositionAdapter", "Lcom/squareup/moshi/f;", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "nullableListOfCatalogItemAdapter", "Lcom/sugarcube/core/network/models/SceneResponse;", "nullableSceneResponseAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompiledCompositionJsonAdapter extends f<CompiledComposition> {
    private final f<Composition> compositionAdapter;
    private volatile Constructor<CompiledComposition> constructorRef;
    private final f<List<CatalogItem>> nullableListOfCatalogItemAdapter;
    private final f<SceneResponse> nullableSceneResponseAdapter;
    private final k.a options;

    public CompiledCompositionJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("composition", "furnitures", "scene");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Composition> f10 = tVar.f(Composition.class, g0.d(), "composition");
        C17542s.i(f10, "adapter(...)");
        this.compositionAdapter = f10;
        f<List<CatalogItem>> f11 = tVar.f(w.j(List.class, CatalogItem.class), g0.d(), "catalogItems");
        C17542s.i(f11, "adapter(...)");
        this.nullableListOfCatalogItemAdapter = f11;
        f<SceneResponse> f12 = tVar.f(SceneResponse.class, g0.d(), "scene");
        C17542s.i(f12, "adapter(...)");
        this.nullableSceneResponseAdapter = f12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CompiledComposition");
        sb2.append(')');
        return sb2.toString();
    }

    public CompiledComposition fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        Composition composition = null;
        List list = null;
        SceneResponse sceneResponse = null;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                composition = this.compositionAdapter.fromJson(kVar);
                if (composition == null) {
                    throw c.w("composition", "composition", kVar);
                }
            } else if (s10 == 1) {
                list = this.nullableListOfCatalogItemAdapter.fromJson(kVar);
                i10 &= -3;
            } else if (s10 == 2) {
                sceneResponse = this.nullableSceneResponseAdapter.fromJson(kVar);
                i10 &= -5;
            }
        }
        kVar.f();
        if (i10 != -7) {
            Constructor<CompiledComposition> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = CompiledComposition.class.getDeclaredConstructor(new Class[]{Composition.class, List.class, SceneResponse.class, Integer.TYPE, c.f112014c});
                this.constructorRef = constructor;
                C17542s.i(constructor, "also(...)");
            }
            if (composition != null) {
                CompiledComposition newInstance = constructor.newInstance(new Object[]{composition, list, sceneResponse, Integer.valueOf(i10), null});
                C17542s.i(newInstance, "newInstance(...)");
                return newInstance;
            }
            throw c.n("composition", "composition", kVar);
        } else if (composition != null) {
            return new CompiledComposition(composition, list, sceneResponse);
        } else {
            throw c.n("composition", "composition", kVar);
        }
    }

    public void toJson(q qVar, CompiledComposition compiledComposition) {
        C17542s.j(qVar, "writer");
        if (compiledComposition != null) {
            qVar.d();
            qVar.n("composition");
            this.compositionAdapter.toJson(qVar, compiledComposition.getComposition());
            qVar.n("furnitures");
            this.nullableListOfCatalogItemAdapter.toJson(qVar, compiledComposition.getCatalogItems());
            qVar.n("scene");
            this.nullableSceneResponseAdapter.toJson(qVar, compiledComposition.getScene());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
