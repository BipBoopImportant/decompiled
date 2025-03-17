package jL;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012$\b\u0002\u0010\u0006\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R3\u0010\u0006\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LjL/c;", "T", "", "Lkotlin/Function1;", "LXH/N;", "Lorg/koin/core/definition/OnCloseCallback;", "onClose", "<init>", "(LnI/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LnI/l;", "getOnClose", "()LnI/l;", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jL.c  reason: case insensitive filesystem */
public final class C17494c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<T, C16807N> f144197a;

    public C17494c() {
        this((C17642l) null, 1, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17494c) && C17542s.e(this.f144197a, ((C17494c) obj).f144197a);
    }

    public int hashCode() {
        C17642l<T, C16807N> lVar = this.f144197a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public String toString() {
        return "Callbacks(onClose=" + this.f144197a + ')';
    }

    public C17494c(C17642l<? super T, C16807N> lVar) {
        this.f144197a = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17494c(C17642l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : lVar);
    }
}
