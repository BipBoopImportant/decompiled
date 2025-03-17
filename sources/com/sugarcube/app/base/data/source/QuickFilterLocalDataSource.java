package com.sugarcube.app.base.data.source;

import com.sugarcube.core.network.models.QuickFilter;
import dI.C17164e;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/source/QuickFilterLocalDataSource;", "", "Ljava/util/Locale;", "locale", "", "Lcom/sugarcube/core/network/models/QuickFilter;", "getAllQuickFilters", "(Ljava/util/Locale;LdI/e;)Ljava/lang/Object;", "quickFilters", "LXH/N;", "cacheQuickFilters", "(Ljava/util/List;Ljava/util/Locale;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface QuickFilterLocalDataSource {
    void cacheQuickFilters(List<QuickFilter> list, Locale locale);

    Object getAllQuickFilters(Locale locale, C17164e<? super List<QuickFilter>> eVar);
}
