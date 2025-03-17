package com.sugarcube.app.base.data.source;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.M;
import XH.C16807N;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import com.sugarcube.core.network.models.QuickFilter;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH¤@¢\u0006\u0004\b\r\u0010\nJ8\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010H¦@¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0004X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0$0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010#R,\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0 8\u0004X\u0004¢\u0006\u0012\n\u0004\b&\u0010#\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020!0+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0$0+8DX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010-R\u001d\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0+8F¢\u0006\u0006\u001a\u0004\b0\u0010-¨\u00062"}, d2 = {"Lcom/sugarcube/app/base/data/source/QuickFilterRepositorySource;", "", "Lcom/sugarcube/app/base/data/source/QuickFilterLocalDataSource;", "localSource", "Lcom/sugarcube/app/base/data/source/QuickFilterRemoteDataSource;", "remoteSource", "<init>", "(Lcom/sugarcube/app/base/data/source/QuickFilterLocalDataSource;Lcom/sugarcube/app/base/data/source/QuickFilterRemoteDataSource;)V", "LXH/N;", "refreshCache", "(LdI/e;)Ljava/lang/Object;", "", "Lcom/sugarcube/core/network/models/QuickFilter;", "fetch", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "", "country", "language", "getQuickFilters", "(Lcom/sugarcube/core/network/models/RoomType;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/data/source/QuickFilterLocalDataSource;", "getLocalSource", "()Lcom/sugarcube/app/base/data/source/QuickFilterLocalDataSource;", "Lcom/sugarcube/app/base/data/source/QuickFilterRemoteDataSource;", "getRemoteSource", "()Lcom/sugarcube/app/base/data/source/QuickFilterRemoteDataSource;", "LQJ/M;", "coroutineContext", "LQJ/M;", "getCoroutineContext", "()LQJ/M;", "Landroidx/lifecycle/K;", "", "_isRefreshing", "Landroidx/lifecycle/K;", "", "_allQuickFilters", "_roomFilters", "get_roomFilters", "()Landroidx/lifecycle/K;", "get_roomFilters$annotations", "()V", "Landroidx/lifecycle/F;", "isRefreshing", "()Landroidx/lifecycle/F;", "getAllQuickFilters", "allQuickFilters", "getRoomFilters", "roomFilters", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class QuickFilterRepositorySource {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public final K<List<QuickFilter>> _allQuickFilters = new K<>();
    /* access modifiers changed from: private */
    public final K<Boolean> _isRefreshing = new K<>();
    private final K<List<QuickFilter>> _roomFilters = new K<>();
    private final M coroutineContext = C16311i0.a();
    private final QuickFilterLocalDataSource localSource;
    private final QuickFilterRemoteDataSource remoteSource;

    public QuickFilterRepositorySource(QuickFilterLocalDataSource quickFilterLocalDataSource, QuickFilterRemoteDataSource quickFilterRemoteDataSource) {
        C17542s.j(quickFilterLocalDataSource, "localSource");
        C17542s.j(quickFilterRemoteDataSource, "remoteSource");
        this.localSource = quickFilterLocalDataSource;
        this.remoteSource = quickFilterRemoteDataSource;
    }

    public static /* synthetic */ Object getQuickFilters$default(QuickFilterRepositorySource quickFilterRepositorySource, RoomType roomType, String str, String str2, C17164e eVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            if ((i10 & 4) != 0) {
                str2 = null;
            }
            return quickFilterRepositorySource.getQuickFilters(roomType, str, str2, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getQuickFilters");
    }

    protected static /* synthetic */ void get_roomFilters$annotations() {
    }

    /* access modifiers changed from: protected */
    public abstract Object fetch(C17164e<? super List<QuickFilter>> eVar);

    /* access modifiers changed from: protected */
    public final F<List<QuickFilter>> getAllQuickFilters() {
        return this._allQuickFilters;
    }

    /* access modifiers changed from: protected */
    public final M getCoroutineContext() {
        return this.coroutineContext;
    }

    /* access modifiers changed from: protected */
    public final QuickFilterLocalDataSource getLocalSource() {
        return this.localSource;
    }

    public abstract Object getQuickFilters(RoomType roomType, String str, String str2, C17164e<? super List<QuickFilter>> eVar);

    /* access modifiers changed from: protected */
    public final QuickFilterRemoteDataSource getRemoteSource() {
        return this.remoteSource;
    }

    public final F<List<QuickFilter>> getRoomFilters() {
        return this._roomFilters;
    }

    /* access modifiers changed from: protected */
    public final K<List<QuickFilter>> get_roomFilters() {
        return this._roomFilters;
    }

    public final F<Boolean> isRefreshing() {
        return this._isRefreshing;
    }

    public final Object refreshCache(C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(this.coroutineContext, new QuickFilterRepositorySource$refreshCache$2(this, (C17164e<? super QuickFilterRepositorySource$refreshCache$2>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }
}
