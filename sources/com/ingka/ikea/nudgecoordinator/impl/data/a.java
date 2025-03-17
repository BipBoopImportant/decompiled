package com.ingka.ikea.nudgecoordinator.impl.data;

import am.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/nudgecoordinator/impl/data/a;", "", "Lcom/ingka/ikea/nudgecoordinator/impl/data/NudgeDataSource;", "persistentSource", "sessionSource", "Lam/h;", "timeProvider", "<init>", "(Lcom/ingka/ikea/nudgecoordinator/impl/data/NudgeDataSource;Lcom/ingka/ikea/nudgecoordinator/impl/data/NudgeDataSource;Lam/h;)V", "a", "Lcom/ingka/ikea/nudgecoordinator/impl/data/NudgeDataSource;", "b", "c", "Lam/h;", "d", "nudgecoordinator-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0826a f50675d = new C0826a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final NudgeDataSource f50676a;

    /* renamed from: b  reason: collision with root package name */
    private final NudgeDataSource f50677b;

    /* renamed from: c  reason: collision with root package name */
    private final h f50678c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/nudgecoordinator/impl/data/a$a;", "", "<init>", "()V", "nudgecoordinator-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.nudgecoordinator.impl.data.a$a  reason: collision with other inner class name */
    public static final class C0826a {
        public /* synthetic */ C0826a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0826a() {
        }
    }

    public a(NudgeDataSource nudgeDataSource, NudgeDataSource nudgeDataSource2, h hVar) {
        C17542s.j(nudgeDataSource, "persistentSource");
        C17542s.j(nudgeDataSource2, "sessionSource");
        C17542s.j(hVar, "timeProvider");
        this.f50676a = nudgeDataSource;
        this.f50677b = nudgeDataSource2;
        this.f50678c = hVar;
    }
}
