package com.sugarcube.app.base.data.feature;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"isRemote", "", "T", "", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ConfigRepositoryKt {
    /* access modifiers changed from: private */
    public static final <T> boolean isRemote(ConfigItem<? extends T> configItem) {
        return configItem.getMeta().getRemoteFeatureKey() != null;
    }
}
