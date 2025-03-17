package com.sugarcube.decorate.v1.internal.v1;

import Ma.C9140b;
import RF.C13549b;
import RF.k;
import RF.o;
import XH.C16818i;
import ZF.C16897B0;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.lifecycle.L;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.CachedCompiledComposition;
import com.sugarcube.common.R;
import com.sugarcube.decorate.internal.shared.IDecorateEngine;
import com.sugarcube.decorate_engine.ModelInstanceDetails;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import com.sugarcube.decorate_engine.SceneLayout;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\f\u001a\u00020\u0003*\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\u00020\u0003*\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Landroid/app/Activity;", "LRF/b;", "engineDebugInfo", "LXH/N;", "c", "(Landroid/app/Activity;LRF/b;)V", "Lcom/sugarcube/decorate/v1/internal/v1/DecorateFragment;", "", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lcom/sugarcube/decorate_engine/ModelInstanceDetails;", "Lcom/sugarcube/decorate_engine/ModelInstanceDetailsMap;", "instanceInfoMap", "e", "(Lcom/sugarcube/decorate/v1/internal/v1/DecorateFragment;Ljava/util/Map;)V", "b", "v1_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v1.internal.v1.a$a  reason: collision with other inner class name */
    static final class C3467a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f141915a;

        C3467a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f141915a = lVar;
        }

        public final C16818i<?> c() {
            return this.f141915a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f141915a.invoke(obj);
        }
    }

    public static final void b(DecorateFragment decorateFragment, Map<ObjectInstanceId, ModelInstanceDetails> map) {
        C17542s.j(decorateFragment, "<this>");
        C17542s.j(map, "instanceInfoMap");
        HashMap hashMap = new HashMap();
        CachedCompiledComposition H22 = decorateFragment.H2();
        if (H22 != null) {
            for (Map.Entry next : map.entrySet()) {
                CachedCatalogItem cachedCatalogItem = H22.getCachedCatalogItems().get(Integer.valueOf(((ModelInstanceDetails) next.getValue()).getProductId()));
                if (cachedCatalogItem != null && cachedCatalogItem.isCombinableRoot()) {
                    SceneLayout sceneLayout = (SceneLayout) hashMap.get(Integer.valueOf(((ModelInstanceDetails) next.getValue()).getProductId()));
                    if (sceneLayout == null) {
                        SceneLayout sceneLayout2 = null;
                        o oVar = new o((String) null, 1, (DefaultConstructorMarker) null);
                        o.k(oVar, cachedCatalogItem, ObjectInstanceId.Companion.getKNone(), (ModelScreenTransform) null, 4, (Object) null);
                        sceneLayout = oVar.o();
                        Integer valueOf = Integer.valueOf(((ModelInstanceDetails) next.getValue()).getProductId());
                        if (sceneLayout == null) {
                            C17542s.z("combinedModel");
                        } else {
                            sceneLayout2 = sceneLayout;
                        }
                        hashMap.put(valueOf, sceneLayout2);
                    }
                    IDecorateEngine K22 = decorateFragment.K2();
                    if (K22 != null) {
                        K22.addCompoundModelInstance(sceneLayout, (ObjectInstanceId) next.getKey());
                    }
                }
            }
        }
    }

    public static final void c(Activity activity, C13549b bVar) {
        C17542s.j(activity, "<this>");
        C17542s.j(bVar, "engineDebugInfo");
        C9140b bVar2 = new C9140b(activity, R.style.AlertDialogTheme);
        bVar2.setTitle("Engine Debug Info");
        bVar2.f(bVar.toString());
        bVar2.l("OK", new C16897B0());
        bVar2.p();
    }

    /* access modifiers changed from: private */
    public static final void d(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    public static final void e(DecorateFragment decorateFragment, Map<ObjectInstanceId, ModelInstanceDetails> map) {
        C17542s.j(decorateFragment, "<this>");
        C17542s.j(map, "instanceInfoMap");
        CachedCompiledComposition H22 = decorateFragment.H2();
        if (H22 != null) {
            for (Map.Entry next : map.entrySet()) {
                CachedCatalogItem cachedCatalogItem = H22.getCachedCatalogItems().get(Integer.valueOf(((ModelInstanceDetails) next.getValue()).getProductId()));
                if (cachedCatalogItem != null) {
                    DecorateFragment.z5(decorateFragment, cachedCatalogItem, (ObjectInstanceId) next.getKey(), (k) null, false, false, 12, (Object) null);
                }
            }
        }
    }
}
