package SC;

import U0.C4889m;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"LSC/z1;", "", "LSC/w1;", "buttonAlignment", "Lkotlin/Function0;", "LXH/N;", "primaryButton", "secondaryButton", "<init>", "(LSC/w1;LnI/p;LnI/p;)V", "a", "LSC/w1;", "()LSC/w1;", "b", "LnI/p;", "()LnI/p;", "c", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.z1  reason: case insensitive filesystem */
public final class C13664z1 {

    /* renamed from: d  reason: collision with root package name */
    public static final int f116520d = 0;

    /* renamed from: a  reason: collision with root package name */
    private final C13652w1 f116521a;

    /* renamed from: b  reason: collision with root package name */
    private final p<C4889m, Integer, C16807N> f116522b;

    /* renamed from: c  reason: collision with root package name */
    private final p<C4889m, Integer, C16807N> f116523c;

    public C13664z1(C13652w1 w1Var, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2) {
        C17542s.j(w1Var, "buttonAlignment");
        C17542s.j(pVar, "primaryButton");
        this.f116521a = w1Var;
        this.f116522b = pVar;
        this.f116523c = pVar2;
    }

    public final C13652w1 a() {
        return this.f116521a;
    }

    public final p<C4889m, Integer, C16807N> b() {
        return this.f116522b;
    }

    public final p<C4889m, Integer, C16807N> c() {
        return this.f116523c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13664z1(C13652w1 w1Var, p pVar, p pVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C13652w1.SideBySide : w1Var, pVar, pVar2);
    }
}
