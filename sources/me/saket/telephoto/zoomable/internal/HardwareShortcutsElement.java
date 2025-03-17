package me.saket.telephoto.zoomable.internal;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import me.saket.telephoto.zoomable.h;
import pK.C17769n;
import rK.o;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lme/saket/telephoto/zoomable/internal/HardwareShortcutsElement;", "LG1/V;", "LrK/o;", "LpK/n;", "state", "Lme/saket/telephoto/zoomable/h;", "spec", "<init>", "(LpK/n;Lme/saket/telephoto/zoomable/h;)V", "c", "()LrK/o;", "node", "LXH/N;", "f", "(LrK/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "LpK/n;", "e", "Lme/saket/telephoto/zoomable/h;", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HardwareShortcutsElement extends V<o> {

    /* renamed from: d  reason: collision with root package name */
    private final C17769n f144611d;

    /* renamed from: e  reason: collision with root package name */
    private final h f144612e;

    public HardwareShortcutsElement(C17769n nVar, h hVar) {
        C17542s.j(nVar, "state");
        C17542s.j(hVar, "spec");
        this.f144611d = nVar;
        this.f144612e = hVar;
    }

    /* renamed from: c */
    public o a() {
        return new o(this.f144611d, this.f144612e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HardwareShortcutsElement)) {
            return false;
        }
        HardwareShortcutsElement hardwareShortcutsElement = (HardwareShortcutsElement) obj;
        return C17542s.e(this.f144611d, hardwareShortcutsElement.f144611d) && C17542s.e(this.f144612e, hardwareShortcutsElement.f144612e);
    }

    /* renamed from: f */
    public void b(o oVar) {
        C17542s.j(oVar, "node");
        oVar.F2(this.f144611d);
        oVar.E2(this.f144612e);
    }

    public int hashCode() {
        return (this.f144611d.hashCode() * 31) + this.f144612e.hashCode();
    }

    public String toString() {
        C17769n nVar = this.f144611d;
        h hVar = this.f144612e;
        return "HardwareShortcutsElement(state=" + nVar + ", spec=" + hVar + ")";
    }
}
