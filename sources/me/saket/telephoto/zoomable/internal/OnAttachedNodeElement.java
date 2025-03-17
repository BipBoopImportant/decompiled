package me.saket.telephoto.zoomable.internal;

import G1.V;
import XH.C16807N;
import android.annotation.SuppressLint;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lme/saket/telephoto/zoomable/internal/OnAttachedNodeElement;", "LG1/V;", "Lme/saket/telephoto/zoomable/internal/b;", "Lkotlin/Function1;", "LdI/e;", "LXH/N;", "", "callback", "<init>", "(LnI/l;)V", "c", "()Lme/saket/telephoto/zoomable/internal/b;", "node", "f", "(Lme/saket/telephoto/zoomable/internal/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "LnI/l;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ModifierNodeInspectableProperties"})
final class OnAttachedNodeElement extends V<b> {

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<C17164e<? super C16807N>, Object> f144613d;

    public OnAttachedNodeElement(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar) {
        C17542s.j(lVar, "callback");
        this.f144613d = lVar;
    }

    /* renamed from: c */
    public b a() {
        return new b(this.f144613d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnAttachedNodeElement) && C17542s.e(this.f144613d, ((OnAttachedNodeElement) obj).f144613d);
    }

    /* renamed from: f */
    public void b(b bVar) {
        C17542s.j(bVar, "node");
        bVar.D2(this.f144613d);
    }

    public int hashCode() {
        return this.f144613d.hashCode();
    }

    public String toString() {
        C17642l<C17164e<? super C16807N>, Object> lVar = this.f144613d;
        return "OnAttachedNodeElement(callback=" + lVar + ")";
    }
}
