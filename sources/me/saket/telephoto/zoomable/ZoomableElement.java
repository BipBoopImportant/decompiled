package me.saket.telephoto.zoomable;

import G1.V;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import o1.C5667g;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lme/saket/telephoto/zoomable/ZoomableElement;", "LG1/V;", "Lme/saket/telephoto/zoomable/r;", "Lme/saket/telephoto/zoomable/j;", "state", "", "enabled", "Lkotlin/Function1;", "Lo1/g;", "LXH/N;", "onClick", "onLongClick", "Lme/saket/telephoto/zoomable/c;", "onDoubleClick", "<init>", "(Lme/saket/telephoto/zoomable/j;ZLnI/l;LnI/l;Lme/saket/telephoto/zoomable/c;)V", "c", "()Lme/saket/telephoto/zoomable/r;", "node", "f", "(Lme/saket/telephoto/zoomable/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lme/saket/telephoto/zoomable/j;", "e", "Z", "LnI/l;", "g", "h", "Lme/saket/telephoto/zoomable/c;", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ZoomableElement extends V<r> {

    /* renamed from: d  reason: collision with root package name */
    private final j f144581d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f144582e;

    /* renamed from: f  reason: collision with root package name */
    private final C17642l<C5667g, C16807N> f144583f;

    /* renamed from: g  reason: collision with root package name */
    private final C17642l<C5667g, C16807N> f144584g;

    /* renamed from: h  reason: collision with root package name */
    private final c f144585h;

    public ZoomableElement(j jVar, boolean z10, C17642l<? super C5667g, C16807N> lVar, C17642l<? super C5667g, C16807N> lVar2, c cVar) {
        C17542s.j(jVar, "state");
        C17542s.j(cVar, "onDoubleClick");
        this.f144581d = jVar;
        this.f144582e = z10;
        this.f144583f = lVar;
        this.f144584g = lVar2;
        this.f144585h = cVar;
    }

    /* renamed from: c */
    public r a() {
        return new r(this.f144581d, this.f144585h, this.f144582e, this.f144583f, this.f144584g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoomableElement)) {
            return false;
        }
        ZoomableElement zoomableElement = (ZoomableElement) obj;
        return C17542s.e(this.f144581d, zoomableElement.f144581d) && this.f144582e == zoomableElement.f144582e && C17542s.e(this.f144583f, zoomableElement.f144583f) && C17542s.e(this.f144584g, zoomableElement.f144584g) && C17542s.e(this.f144585h, zoomableElement.f144585h);
    }

    /* renamed from: f */
    public void b(r rVar) {
        C17542s.j(rVar, "node");
        rVar.L2(this.f144581d, this.f144582e, this.f144583f, this.f144584g, this.f144585h);
    }

    public int hashCode() {
        int hashCode = ((this.f144581d.hashCode() * 31) + Boolean.hashCode(this.f144582e)) * 31;
        C17642l<C5667g, C16807N> lVar = this.f144583f;
        int i10 = 0;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        C17642l<C5667g, C16807N> lVar2 = this.f144584g;
        if (lVar2 != null) {
            i10 = lVar2.hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.f144585h.hashCode();
    }

    public String toString() {
        j jVar = this.f144581d;
        boolean z10 = this.f144582e;
        C17642l<C5667g, C16807N> lVar = this.f144583f;
        C17642l<C5667g, C16807N> lVar2 = this.f144584g;
        c cVar = this.f144585h;
        return "ZoomableElement(state=" + jVar + ", enabled=" + z10 + ", onClick=" + lVar + ", onLongClick=" + lVar2 + ", onDoubleClick=" + cVar + ")";
    }
}
