package me.saket.telephoto.zoomable;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lme/saket/telephoto/zoomable/h;", "", "", "enabled", "Lme/saket/telephoto/zoomable/g;", "shortcutDetector", "<init>", "(ZLme/saket/telephoto/zoomable/g;)V", "a", "Z", "b", "()Z", "Lme/saket/telephoto/zoomable/g;", "c", "()Lme/saket/telephoto/zoomable/g;", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f144605c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final h f144606d = new h(false, (g) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f144607a;

    /* renamed from: b  reason: collision with root package name */
    private final g f144608b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lme/saket/telephoto/zoomable/h$a;", "", "<init>", "()V", "Lme/saket/telephoto/zoomable/h;", "Disabled", "Lme/saket/telephoto/zoomable/h;", "a", "()Lme/saket/telephoto/zoomable/h;", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f144606d;
        }

        private a() {
        }
    }

    public h() {
        this(false, (g) null, 3, (DefaultConstructorMarker) null);
    }

    public final boolean b() {
        return this.f144607a;
    }

    public final g c() {
        return this.f144608b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f144607a == hVar.f144607a && C17542s.e(this.f144608b, hVar.f144608b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f144607a) * 31) + this.f144608b.hashCode();
    }

    public String toString() {
        boolean z10 = this.f144607a;
        g gVar = this.f144608b;
        return "HardwareShortcutsSpec(enabled=" + z10 + ", shortcutDetector=" + gVar + ")";
    }

    public h(boolean z10, g gVar) {
        C17542s.j(gVar, "shortcutDetector");
        this.f144607a = z10;
        this.f144608b = gVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(boolean z10, g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? g.f144593a.a() : gVar);
    }
}
