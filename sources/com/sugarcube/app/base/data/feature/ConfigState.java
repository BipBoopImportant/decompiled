package com.sugarcube.app.base.data.feature;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B5\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000e\u0010\u0015\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003JL\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006!"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigState;", "T", "", "configItem", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "currentValue", "hasRemote", "", "isOverridden", "initialized", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItem;Ljava/lang/Object;ZZZ)V", "getConfigItem", "()Lcom/sugarcube/app/base/data/feature/ConfigItem;", "getCurrentValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getHasRemote", "()Z", "getInitialized", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/sugarcube/app/base/data/feature/ConfigItem;Ljava/lang/Object;ZZZ)Lcom/sugarcube/app/base/data/feature/ConfigState;", "equals", "other", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfigState<T> {
    public static final int $stable = 0;
    private final ConfigItem<T> configItem;
    private final T currentValue;
    private final boolean hasRemote;
    private final boolean initialized;
    private final boolean isOverridden;

    public ConfigState(ConfigItem<? extends T> configItem2, T t10, boolean z10, boolean z11, boolean z12) {
        C17542s.j(configItem2, "configItem");
        C17542s.j(t10, "currentValue");
        this.configItem = configItem2;
        this.currentValue = t10;
        this.hasRemote = z10;
        this.isOverridden = z11;
        this.initialized = z12;
    }

    public static /* synthetic */ ConfigState copy$default(ConfigState configState, ConfigItem<T> configItem2, T t10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            configItem2 = configState.configItem;
        }
        if ((i10 & 2) != 0) {
            t10 = configState.currentValue;
        }
        T t11 = t10;
        if ((i10 & 4) != 0) {
            z10 = configState.hasRemote;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            z11 = configState.isOverridden;
        }
        boolean z14 = z11;
        if ((i10 & 16) != 0) {
            z12 = configState.initialized;
        }
        return configState.copy(configItem2, t11, z13, z14, z12);
    }

    public final ConfigItem<T> component1() {
        return this.configItem;
    }

    public final T component2() {
        return this.currentValue;
    }

    public final boolean component3() {
        return this.hasRemote;
    }

    public final boolean component4() {
        return this.isOverridden;
    }

    public final boolean component5() {
        return this.initialized;
    }

    public final ConfigState<T> copy(ConfigItem<? extends T> configItem2, T t10, boolean z10, boolean z11, boolean z12) {
        C17542s.j(configItem2, "configItem");
        C17542s.j(t10, "currentValue");
        return new ConfigState(configItem2, t10, z10, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigState)) {
            return false;
        }
        ConfigState configState = (ConfigState) obj;
        return C17542s.e(this.configItem, configState.configItem) && C17542s.e(this.currentValue, configState.currentValue) && this.hasRemote == configState.hasRemote && this.isOverridden == configState.isOverridden && this.initialized == configState.initialized;
    }

    public final ConfigItem<T> getConfigItem() {
        return this.configItem;
    }

    public final T getCurrentValue() {
        return this.currentValue;
    }

    public final boolean getHasRemote() {
        return this.hasRemote;
    }

    public final boolean getInitialized() {
        return this.initialized;
    }

    public int hashCode() {
        return (((((((this.configItem.hashCode() * 31) + this.currentValue.hashCode()) * 31) + Boolean.hashCode(this.hasRemote)) * 31) + Boolean.hashCode(this.isOverridden)) * 31) + Boolean.hashCode(this.initialized);
    }

    public final boolean isOverridden() {
        return this.isOverridden;
    }

    public String toString() {
        ConfigItem<T> configItem2 = this.configItem;
        T t10 = this.currentValue;
        boolean z10 = this.hasRemote;
        boolean z11 = this.isOverridden;
        boolean z12 = this.initialized;
        return "ConfigState(configItem=" + configItem2 + ", currentValue=" + t10 + ", hasRemote=" + z10 + ", isOverridden=" + z11 + ", initialized=" + z12 + ")";
    }
}
