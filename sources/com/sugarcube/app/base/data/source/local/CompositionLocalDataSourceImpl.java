package com.sugarcube.app.base.data.source.local;

import XH.C16807N;
import android.net.Uri;
import com.sugarcube.app.base.data.source.CompositionLocalDataSource;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.CompositionSavedProperties;
import dI.C17164e;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH@¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH@¢\u0006\u0004\b\u000b\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH@¢\u0006\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/app/base/data/source/local/CompositionLocalDataSourceImpl;", "Lcom/sugarcube/app/base/data/source/CompositionLocalDataSource;", "<init>", "()V", "Ljava/util/UUID;", "compositionUuid", "", "deleteComposition", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/Composition;", "composition", "cloneComposition", "(Lcom/sugarcube/core/network/models/Composition;LdI/e;)Ljava/lang/Object;", "", "newName", "(Ljava/util/UUID;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LXH/N;", "cacheComposition", "", "localCompositions", "Ljava/util/List;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompositionLocalDataSourceImpl implements CompositionLocalDataSource {
    public static final int $stable = 8;
    private final List<Composition> localCompositions = new ArrayList();

    /* access modifiers changed from: private */
    public static final boolean deleteComposition$lambda$0(UUID uuid, Composition composition) {
        C17542s.j(composition, "it");
        return C17542s.e(composition.getCompositionUuid(), uuid);
    }

    /* access modifiers changed from: private */
    public static final boolean deleteComposition$lambda$1(C17642l lVar, Object obj) {
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    public Object cacheComposition(Composition composition, C17164e<? super C16807N> eVar) {
        this.localCompositions.add(composition);
        return C16807N.f139792a;
    }

    public Object cloneComposition(Composition composition, C17164e<? super Composition> eVar) {
        this.localCompositions.add(composition);
        return composition;
    }

    public Object deleteComposition(UUID uuid, C17164e<? super Boolean> eVar) {
        return b.a(this.localCompositions.removeIf(new b(new a(uuid))));
    }

    public Object cloneComposition(UUID uuid, String str, C17164e<? super Composition> eVar) {
        Object obj;
        Iterator it = this.localCompositions.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((Composition) obj).getCompositionUuid(), uuid)) {
                break;
            }
        }
        Composition composition = (Composition) obj;
        if (composition == null) {
            return obj;
        }
        Composition copy$default = Composition.copy$default(composition, 0, str, (Uri) null, (Uri) null, (Integer) null, (UUID) null, (List) null, (Instant) null, (Instant) null, false, (Uri) null, false, 0, (UUID) null, (String) null, (CompositionSavedProperties) null, (Map) null, (Uri) null, 262141, (Object) null);
        b.a(this.localCompositions.add(copy$default));
        return copy$default;
    }
}
