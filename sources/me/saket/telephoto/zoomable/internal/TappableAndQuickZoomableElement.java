package me.saket.telephoto.zoomable.internal;

import G1.V;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;
import rK.C17863D;
import rK.y;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001By\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lme/saket/telephoto/zoomable/internal/TappableAndQuickZoomableElement;", "LG1/V;", "LrK/y;", "Lkotlin/Function1;", "Lo1/g;", "LXH/N;", "onPress", "onTap", "onLongPress", "onDoubleTap", "Lkotlin/Function0;", "onQuickZoomStopped", "LrK/D;", "transformableState", "", "gesturesEnabled", "<init>", "(LnI/l;LnI/l;LnI/l;LnI/l;LnI/a;LrK/D;Z)V", "c", "()LrK/y;", "node", "f", "(LrK/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "LnI/l;", "e", "g", "h", "LnI/a;", "i", "LrK/D;", "j", "Z", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TappableAndQuickZoomableElement extends V<y> {

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<C5667g, C16807N> f144614d;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<C5667g, C16807N> f144615e;

    /* renamed from: f  reason: collision with root package name */
    private final C17642l<C5667g, C16807N> f144616f;

    /* renamed from: g  reason: collision with root package name */
    private final C17642l<C5667g, C16807N> f144617g;

    /* renamed from: h  reason: collision with root package name */
    private final C17631a<C16807N> f144618h;

    /* renamed from: i  reason: collision with root package name */
    private final C17863D f144619i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f144620j;

    public TappableAndQuickZoomableElement(C17642l<? super C5667g, C16807N> lVar, C17642l<? super C5667g, C16807N> lVar2, C17642l<? super C5667g, C16807N> lVar3, C17642l<? super C5667g, C16807N> lVar4, C17631a<C16807N> aVar, C17863D d10, boolean z10) {
        C17542s.j(lVar, "onPress");
        C17542s.j(lVar4, "onDoubleTap");
        C17542s.j(aVar, "onQuickZoomStopped");
        C17542s.j(d10, "transformableState");
        this.f144614d = lVar;
        this.f144615e = lVar2;
        this.f144616f = lVar3;
        this.f144617g = lVar4;
        this.f144618h = aVar;
        this.f144619i = d10;
        this.f144620j = z10;
    }

    /* renamed from: c */
    public y a() {
        return new y(this.f144614d, this.f144615e, this.f144616f, this.f144617g, this.f144618h, this.f144619i, this.f144620j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TappableAndQuickZoomableElement)) {
            return false;
        }
        TappableAndQuickZoomableElement tappableAndQuickZoomableElement = (TappableAndQuickZoomableElement) obj;
        return C17542s.e(this.f144614d, tappableAndQuickZoomableElement.f144614d) && C17542s.e(this.f144615e, tappableAndQuickZoomableElement.f144615e) && C17542s.e(this.f144616f, tappableAndQuickZoomableElement.f144616f) && C17542s.e(this.f144617g, tappableAndQuickZoomableElement.f144617g) && C17542s.e(this.f144618h, tappableAndQuickZoomableElement.f144618h) && C17542s.e(this.f144619i, tappableAndQuickZoomableElement.f144619i) && this.f144620j == tappableAndQuickZoomableElement.f144620j;
    }

    /* renamed from: f */
    public void b(y yVar) {
        C17542s.j(yVar, "node");
        yVar.Q2(this.f144614d, this.f144615e, this.f144616f, this.f144617g, this.f144618h, this.f144619i, this.f144620j);
    }

    public int hashCode() {
        int hashCode = this.f144614d.hashCode() * 31;
        C17642l<C5667g, C16807N> lVar = this.f144615e;
        int i10 = 0;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        C17642l<C5667g, C16807N> lVar2 = this.f144616f;
        if (lVar2 != null) {
            i10 = lVar2.hashCode();
        }
        return ((((((((hashCode2 + i10) * 31) + this.f144617g.hashCode()) * 31) + this.f144618h.hashCode()) * 31) + this.f144619i.hashCode()) * 31) + Boolean.hashCode(this.f144620j);
    }

    public String toString() {
        C17642l<C5667g, C16807N> lVar = this.f144614d;
        C17642l<C5667g, C16807N> lVar2 = this.f144615e;
        C17642l<C5667g, C16807N> lVar3 = this.f144616f;
        C17642l<C5667g, C16807N> lVar4 = this.f144617g;
        C17631a<C16807N> aVar = this.f144618h;
        C17863D d10 = this.f144619i;
        boolean z10 = this.f144620j;
        return "TappableAndQuickZoomableElement(onPress=" + lVar + ", onTap=" + lVar2 + ", onLongPress=" + lVar3 + ", onDoubleTap=" + lVar4 + ", onQuickZoomStopped=" + aVar + ", transformableState=" + d10 + ", gesturesEnabled=" + z10 + ")";
    }
}
