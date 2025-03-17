package me.saket.telephoto.zoomable.internal;

import G1.V;
import XH.C16807N;
import c2.y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import o1.C5667g;
import rK.C17862C;
import rK.C17863D;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010#R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\"¨\u0006&"}, d2 = {"Lme/saket/telephoto/zoomable/internal/TransformableElement;", "LG1/V;", "LrK/C;", "LrK/D;", "state", "Lkotlin/Function1;", "Lo1/g;", "", "canPan", "lockRotationOnZoomPan", "enabled", "Lc2/y;", "LXH/N;", "onTransformStopped", "<init>", "(LrK/D;LnI/l;ZZLnI/l;)V", "c", "()LrK/C;", "node", "f", "(LrK/C;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "LrK/D;", "e", "LnI/l;", "Z", "g", "h", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TransformableElement extends V<C17862C> {

    /* renamed from: d  reason: collision with root package name */
    private final C17863D f144621d;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<C5667g, Boolean> f144622e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f144623f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f144624g;

    /* renamed from: h  reason: collision with root package name */
    private final C17642l<y, C16807N> f144625h;

    public TransformableElement(C17863D d10, C17642l<? super C5667g, Boolean> lVar, boolean z10, boolean z11, C17642l<? super y, C16807N> lVar2) {
        C17542s.j(d10, "state");
        C17542s.j(lVar, "canPan");
        C17542s.j(lVar2, "onTransformStopped");
        this.f144621d = d10;
        this.f144622e = lVar;
        this.f144623f = z10;
        this.f144624g = z11;
        this.f144625h = lVar2;
    }

    /* renamed from: c */
    public C17862C a() {
        return new C17862C(this.f144621d, this.f144622e, this.f144623f, this.f144624g, this.f144625h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformableElement)) {
            return false;
        }
        TransformableElement transformableElement = (TransformableElement) obj;
        return C17542s.e(this.f144621d, transformableElement.f144621d) && C17542s.e(this.f144622e, transformableElement.f144622e) && this.f144623f == transformableElement.f144623f && this.f144624g == transformableElement.f144624g && C17542s.e(this.f144625h, transformableElement.f144625h);
    }

    /* renamed from: f */
    public void b(C17862C c10) {
        C17542s.j(c10, "node");
        c10.Q2(this.f144621d, this.f144622e, this.f144623f, this.f144624g, this.f144625h);
    }

    public int hashCode() {
        return (((((((this.f144621d.hashCode() * 31) + this.f144622e.hashCode()) * 31) + Boolean.hashCode(this.f144623f)) * 31) + Boolean.hashCode(this.f144624g)) * 31) + this.f144625h.hashCode();
    }

    public String toString() {
        C17863D d10 = this.f144621d;
        C17642l<C5667g, Boolean> lVar = this.f144622e;
        boolean z10 = this.f144623f;
        boolean z11 = this.f144624g;
        C17642l<y, C16807N> lVar2 = this.f144625h;
        return "TransformableElement(state=" + d10 + ", canPan=" + lVar + ", lockRotationOnZoomPan=" + z10 + ", enabled=" + z11 + ", onTransformStopped=" + lVar2 + ")";
    }
}
