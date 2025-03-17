package com.sugarcube.app.base.data.feature;

import R2.h;
import W2.f;
import W2.i;
import XH.C16807N;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.sugarcube.app.base.data.feature.ConfigItem;
import dI.C17164e;
import eI.C17187b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u000fH@¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u00152\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0012H@¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/sugarcube/app/base/data/feature/PreferencesDataStoreWrapper;", "Lcom/sugarcube/app/base/data/feature/IPreferencesDataStoreWrapper;", "LR2/h;", "LW2/f;", "store", "<init>", "(LR2/h;)V", "", "localKey", "", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "allConfigItems", "Lcom/sugarcube/app/base/data/feature/ConfigItem$ObjectListConfigItem;", "findObjectListConfigItem", "(Ljava/lang/String;Ljava/util/List;)Lcom/sugarcube/app/base/data/feature/ConfigItem$ObjectListConfigItem;", "", "", "valueMap", "LXH/N;", "writeToDataStore", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "Ljava/util/concurrent/ConcurrentHashMap;", "readDataStore", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "clearAll", "(LdI/e;)Ljava/lang/Object;", "LR2/h;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreferencesDataStoreWrapper implements IPreferencesDataStoreWrapper {
    public static final int $stable = 8;
    private static final String BOOL_PREFIX = "bool:";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String DOUBLE_PREFIX = "double:";
    private static final String INTEGER_PREFIX = "int:";
    private static final String OBJECT_LIST_PREFIX = "objectList:";
    private static final String STRING_PREFIX = "string:";
    private static final String TAG = "DataStore";
    private final h<f> store;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/app/base/data/feature/PreferencesDataStoreWrapper$Companion;", "", "<init>", "()V", "TAG", "", "BOOL_PREFIX", "INTEGER_PREFIX", "DOUBLE_PREFIX", "STRING_PREFIX", "OBJECT_LIST_PREFIX", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PreferencesDataStoreWrapper(h<f> hVar) {
        C17542s.j(hVar, PlaceTypes.STORE);
        this.store = hVar;
    }

    private final ConfigItem.ObjectListConfigItem findObjectListConfigItem(String str, List<? extends ConfigItem<?>> list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((ConfigItem) obj).getMeta().getLocalKey(), str)) {
                break;
            }
        }
        ConfigItem configItem = (ConfigItem) obj;
        if (configItem == null || !(configItem instanceof ConfigItem.ObjectListConfigItem)) {
            return null;
        }
        return (ConfigItem.ObjectListConfigItem) configItem;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.sugarcube.app.base.data.feature.ConfigItem$ObjectListValue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.sugarcube.app.base.data.feature.ConfigItem$ObjectListValue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.sugarcube.app.base.data.feature.ConfigItem$ObjectListValue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.sugarcube.app.base.data.feature.ConfigItem$ObjectListValue} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final XH.C16807N readDataStore$lambda$2(java.util.concurrent.ConcurrentHashMap r7, com.sugarcube.app.base.data.feature.PreferencesDataStoreWrapper r8, java.util.List r9, W2.f.a r10, java.lang.Object r11) {
        /*
            java.lang.String r0 = "storeKey"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "storeValue"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = r10.a()
            java.lang.String r1 = "bool:"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = HJ.C15854t.W(r0, r1, r2, r3, r4)
            java.lang.String r1 = "substring(...)"
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r10.a()
            r5 = 5
            java.lang.String r0 = r0.substring(r5)
            kotlin.jvm.internal.C17542s.i(r0, r1)
            r7.put(r0, r11)
        L_0x002a:
            java.lang.String r0 = r10.a()
            java.lang.String r5 = "double:"
            boolean r0 = HJ.C15854t.W(r0, r5, r2, r3, r4)
            r5 = 7
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r10.a()
            java.lang.String r0 = r0.substring(r5)
            kotlin.jvm.internal.C17542s.i(r0, r1)
            r7.put(r0, r11)
        L_0x0045:
            java.lang.String r0 = r10.a()
            java.lang.String r6 = "string:"
            boolean r0 = HJ.C15854t.W(r0, r6, r2, r3, r4)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = r10.a()
            java.lang.String r0 = r0.substring(r5)
            kotlin.jvm.internal.C17542s.i(r0, r1)
            r7.put(r0, r11)
        L_0x005f:
            java.lang.String r0 = r10.a()
            java.lang.String r5 = "int:"
            boolean r0 = HJ.C15854t.W(r0, r5, r2, r3, r4)
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = r10.a()
            r5 = 4
            java.lang.String r0 = r0.substring(r5)
            kotlin.jvm.internal.C17542s.i(r0, r1)
            r7.put(r0, r11)
        L_0x007a:
            java.lang.String r0 = r10.a()
            java.lang.String r5 = "objectList:"
            boolean r0 = HJ.C15854t.W(r0, r5, r2, r3, r4)
            if (r0 == 0) goto L_0x00c4
            java.lang.String r10 = r10.a()
            r0 = 11
            java.lang.String r10 = r10.substring(r0)
            kotlin.jvm.internal.C17542s.i(r10, r1)
            com.sugarcube.app.base.data.feature.ConfigItem$ObjectListConfigItem r8 = r8.findObjectListConfigItem(r10, r9)
            if (r8 == 0) goto L_0x00c4
            java.util.List r8 = r8.possibleConfigObjects()
            if (r8 == 0) goto L_0x00c4
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x00a5:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00bd
            java.lang.Object r9 = r8.next()
            r0 = r9
            com.sugarcube.app.base.data.feature.ConfigItem$ObjectListValue r0 = (com.sugarcube.app.base.data.feature.ConfigItem.ObjectListValue) r0
            java.lang.String r0 = r0.getName()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r11)
            if (r0 == 0) goto L_0x00a5
            r4 = r9
        L_0x00bd:
            com.sugarcube.app.base.data.feature.ConfigItem$ObjectListValue r4 = (com.sugarcube.app.base.data.feature.ConfigItem.ObjectListValue) r4
            if (r4 == 0) goto L_0x00c4
            r7.put(r10, r4)
        L_0x00c4:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.feature.PreferencesDataStoreWrapper.readDataStore$lambda$2(java.util.concurrent.ConcurrentHashMap, com.sugarcube.app.base.data.feature.PreferencesDataStoreWrapper, java.util.List, W2.f$a, java.lang.Object):XH.N");
    }

    /* access modifiers changed from: private */
    public static final void readDataStore$lambda$3(p pVar, Object obj, Object obj2) {
        pVar.invoke(obj, obj2);
    }

    public Object clearAll(C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.store, new PreferencesDataStoreWrapper$clearAll$2((C17164e<? super PreferencesDataStoreWrapper$clearAll$2>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object readDataStore(java.util.List<? extends com.sugarcube.app.base.data.feature.ConfigItem<?>> r7, dI.C17164e<? super java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sugarcube.app.base.data.feature.PreferencesDataStoreWrapper$readDataStore$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.sugarcube.app.base.data.feature.PreferencesDataStoreWrapper$readDataStore$1 r0 = (com.sugarcube.app.base.data.feature.PreferencesDataStoreWrapper$readDataStore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.feature.PreferencesDataStoreWrapper$readDataStore$1 r0 = new com.sugarcube.app.base.data.feature.PreferencesDataStoreWrapper$readDataStore$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r7 = r0.L$3
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7
            java.lang.Object r8 = r0.L$2
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r0.L$0
            com.sugarcube.app.base.data.feature.PreferencesDataStoreWrapper r0 = (com.sugarcube.app.base.data.feature.PreferencesDataStoreWrapper) r0
            XH.y.b(r1)
            goto L_0x0065
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            XH.y.b(r1)
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            R2.h<W2.f> r3 = r6.store
            TJ.g r3 = r3.getData()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r1
            r0.label = r4
            java.lang.Object r8 = TJ.C16534i.B(r3, r0)
            if (r8 != r2) goto L_0x0060
            return r2
        L_0x0060:
            r0 = r6
            r5 = r8
            r8 = r7
            r7 = r1
            r1 = r5
        L_0x0065:
            W2.f r1 = (W2.f) r1
            java.util.Map r1 = r1.a()
            com.sugarcube.app.base.data.feature.c r2 = new com.sugarcube.app.base.data.feature.c
            r2.<init>(r7, r0, r8)
            com.sugarcube.app.base.data.feature.d r8 = new com.sugarcube.app.base.data.feature.d
            r8.<init>(r2)
            r1.forEach(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.feature.PreferencesDataStoreWrapper.readDataStore(java.util.List, dI.e):java.lang.Object");
    }

    public Object writeToDataStore(Map<String, ? extends Object> map, C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.store, new PreferencesDataStoreWrapper$writeToDataStore$2(map, (C17164e<? super PreferencesDataStoreWrapper$writeToDataStore$2>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
