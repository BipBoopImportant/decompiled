package com.sugarcube.app.base.data.source.local;

import com.sugarcube.app.base.data.source.QuickFilterLocalDataSource;
import com.sugarcube.core.network.models.QuickFilter;
import dI.C17164e;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/app/base/data/source/local/QuickFilterLocalDataSourceImpl;", "Lcom/sugarcube/app/base/data/source/QuickFilterLocalDataSource;", "<init>", "()V", "Ljava/util/Locale;", "locale", "", "Lcom/sugarcube/core/network/models/QuickFilter;", "getAllQuickFilters", "(Ljava/util/Locale;LdI/e;)Ljava/lang/Object;", "quickFilters", "LXH/N;", "cacheQuickFilters", "(Ljava/util/List;Ljava/util/Locale;)V", "allQuickFilters", "Ljava/util/List;", "currentLocale", "Ljava/util/Locale;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuickFilterLocalDataSourceImpl implements QuickFilterLocalDataSource {
    public static final int $stable = 8;
    private List<QuickFilter> allQuickFilters;
    private Locale currentLocale;

    public void cacheQuickFilters(List<QuickFilter> list, Locale locale) {
        C17542s.j(list, "quickFilters");
        C17542s.j(locale, "locale");
        this.allQuickFilters = list;
        this.currentLocale = locale;
    }

    public Object getAllQuickFilters(Locale locale, C17164e<? super List<QuickFilter>> eVar) {
        if (C17542s.e(locale, this.currentLocale)) {
            return this.allQuickFilters;
        }
        return null;
    }
}
