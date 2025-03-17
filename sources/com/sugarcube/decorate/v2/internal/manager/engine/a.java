package com.sugarcube.decorate.v2.internal.manager.engine;

import iG.C17351h;
import iG.C17352i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/engine/a;", "", "LiG/h;", "processedGesture", "LiG/i;", "processedGestureEvent", "<init>", "(LiG/h;LiG/i;)V", "a", "()LiG/h;", "b", "()LiG/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LiG/h;", "c", "LiG/i;", "getProcessedGestureEvent", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C3474a f142540c = new C3474a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17351h f142541a;

    /* renamed from: b  reason: collision with root package name */
    private final C17352i f142542b;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/engine/a$a;", "", "<init>", "()V", "LiG/h;", "gesture", "Lcom/sugarcube/decorate/v2/internal/manager/engine/a;", "b", "(LiG/h;)Lcom/sugarcube/decorate/v2/internal/manager/engine/a;", "a", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.manager.engine.a$a  reason: collision with other inner class name */
    public static final class C3474a {
        public /* synthetic */ C3474a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(C17351h hVar) {
            C17542s.j(hVar, "gesture");
            return new a(hVar, C17352i.ENDED);
        }

        public final a b(C17351h hVar) {
            C17542s.j(hVar, "gesture");
            return new a(hVar, C17352i.STARTED);
        }

        private C3474a() {
        }
    }

    public a(C17351h hVar, C17352i iVar) {
        C17542s.j(hVar, "processedGesture");
        C17542s.j(iVar, "processedGestureEvent");
        this.f142541a = hVar;
        this.f142542b = iVar;
    }

    public final C17351h a() {
        return this.f142541a;
    }

    public final C17352i b() {
        return this.f142542b;
    }

    public final C17351h c() {
        return this.f142541a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f142541a == aVar.f142541a && this.f142542b == aVar.f142542b;
    }

    public int hashCode() {
        return (this.f142541a.hashCode() * 31) + this.f142542b.hashCode();
    }

    public String toString() {
        C17351h hVar = this.f142541a;
        C17352i iVar = this.f142542b;
        return "ProcessedGestureMetadata(processedGesture=" + hVar + ", processedGestureEvent=" + iVar + ")";
    }
}
