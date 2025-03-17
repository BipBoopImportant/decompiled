package com.sugarcube.app.base.data.feature;

import XH.C16807N;
import dI.C17164e;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/app/base/data/feature/IPreferencesDataStoreWrapper;", "", "", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "allConfigItems", "Ljava/util/concurrent/ConcurrentHashMap;", "", "readDataStore", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "", "toWrite", "LXH/N;", "writeToDataStore", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "clearAll", "(LdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IPreferencesDataStoreWrapper {
    Object clearAll(C17164e<? super C16807N> eVar);

    Object readDataStore(List<? extends ConfigItem<?>> list, C17164e<? super ConcurrentHashMap<String, Object>> eVar);

    Object writeToDataStore(Map<String, ? extends Object> map, C17164e<? super C16807N> eVar);
}
