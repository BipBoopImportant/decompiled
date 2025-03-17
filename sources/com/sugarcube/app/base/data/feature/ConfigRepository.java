package com.sugarcube.app.base.data.feature;

import TJ.C16532g;
import XH.C16807N;
import XH.C16814e;
import com.sugarcube.app.base.data.feature.ConfigItem;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0005\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\t\u0010\u0007J(\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\u0015\u0010\u000bJ2\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H¦@¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001a\u001a\u00020\u0017\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001c\u001a\u00020\u0017\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\u001c\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\u0017H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH&¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0017H¦@¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u001fH¦@¢\u0006\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "", "T", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "configItem", "LTJ/g;", "observe", "(Lcom/sugarcube/app/base/data/feature/ConfigItem;)LTJ/g;", "Lcom/sugarcube/app/base/data/feature/ConfigState;", "observeState", "get", "(Lcom/sugarcube/app/base/data/feature/ConfigItem;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "feature", "", "isEnabled", "(Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;LdI/e;)Ljava/lang/Object;", "getBlocking", "(Lcom/sugarcube/app/base/data/feature/ConfigItem;)Ljava/lang/Object;", "isEnabledBlocking", "(Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;)Z", "getState", "newValue", "LXH/N;", "override", "(Lcom/sugarcube/app/base/data/feature/ConfigItem;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "blockingOverride", "(Lcom/sugarcube/app/base/data/feature/ConfigItem;Ljava/lang/Object;)V", "clearOverride", "clearAllOverrides", "()V", "", "", "getEnabledFeatures", "()Ljava/util/List;", "blockUntilInitialized", "(LdI/e;)Ljava/lang/Object;", "getAllConfigItems", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConfigRepository {
    Object blockUntilInitialized(C17164e<? super C16807N> eVar);

    <T> void blockingOverride(ConfigItem<? extends T> configItem, T t10);

    void clearAllOverrides();

    <T> Object clearOverride(ConfigItem<? extends T> configItem, C17164e<? super C16807N> eVar);

    <T> Object get(ConfigItem<? extends T> configItem, C17164e<? super T> eVar);

    Object getAllConfigItems(C17164e<? super List<? extends ConfigItem<?>>> eVar);

    @C16814e
    <T> T getBlocking(ConfigItem<? extends T> configItem);

    List<String> getEnabledFeatures();

    <T> Object getState(ConfigItem<? extends T> configItem, C17164e<? super ConfigState<T>> eVar);

    Object isEnabled(ConfigItem.FeatureFlag featureFlag, C17164e<? super Boolean> eVar);

    @C16814e
    boolean isEnabledBlocking(ConfigItem.FeatureFlag featureFlag);

    <T> C16532g<T> observe(ConfigItem<? extends T> configItem);

    <T> C16532g<ConfigState<T>> observeState(ConfigItem<? extends T> configItem);

    <T> Object override(ConfigItem<? extends T> configItem, T t10, C17164e<? super C16807N> eVar);
}
