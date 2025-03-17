package com.ingka.ikea.nudgecoordinator.impl.data;

import TJ.C16505B;
import am.h;
import com.ingka.ikea.nudgecoordinator.impl.data.NudgeDataSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R(\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/nudgecoordinator/impl/data/c;", "Lcom/ingka/ikea/nudgecoordinator/impl/data/NudgeDataSource;", "Lam/h;", "timeProvider", "<init>", "(Lam/h;)V", "a", "Lam/h;", "", "", "LTJ/B;", "Lcom/ingka/ikea/nudgecoordinator/impl/data/NudgeDataSource$Nudge;", "b", "Ljava/util/Map;", "nudgeMap", "nudgecoordinator-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements NudgeDataSource {

    /* renamed from: a  reason: collision with root package name */
    private final h f50683a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, C16505B<NudgeDataSource.Nudge>> f50684b = new LinkedHashMap();

    public c(h hVar) {
        C17542s.j(hVar, "timeProvider");
        this.f50683a = hVar;
    }
}
