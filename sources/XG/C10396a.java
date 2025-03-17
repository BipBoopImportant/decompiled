package xg;

import Cg.a;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001BC\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R)\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lxg/a;", "", "Lkotlin/Function2;", "", "LXH/N;", "onQuestionResponseChange", "Lkotlin/Function1;", "LCg/a;", "onRatingSelected", "Lkotlin/Function0;", "onDoneClicked", "<init>", "(LnI/p;LnI/l;LnI/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LnI/p;", "b", "()LnI/p;", "LnI/l;", "c", "()LnI/l;", "LnI/a;", "()LnI/a;", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xg.a  reason: case insensitive filesystem */
public final class C10396a {

    /* renamed from: d  reason: collision with root package name */
    public static final int f77758d = 0;

    /* renamed from: a  reason: collision with root package name */
    private final p<String, String, C16807N> f77759a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<a, C16807N> f77760b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<C16807N> f77761c;

    public C10396a(p<? super String, ? super String, C16807N> pVar, C17642l<? super a, C16807N> lVar, C17631a<C16807N> aVar) {
        C17542s.j(pVar, "onQuestionResponseChange");
        C17542s.j(lVar, "onRatingSelected");
        C17542s.j(aVar, "onDoneClicked");
        this.f77759a = pVar;
        this.f77760b = lVar;
        this.f77761c = aVar;
    }

    public final C17631a<C16807N> a() {
        return this.f77761c;
    }

    public final p<String, String, C16807N> b() {
        return this.f77759a;
    }

    public final C17642l<a, C16807N> c() {
        return this.f77760b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10396a)) {
            return false;
        }
        C10396a aVar = (C10396a) obj;
        return C17542s.e(this.f77759a, aVar.f77759a) && C17542s.e(this.f77760b, aVar.f77760b) && C17542s.e(this.f77761c, aVar.f77761c);
    }

    public int hashCode() {
        return (((this.f77759a.hashCode() * 31) + this.f77760b.hashCode()) * 31) + this.f77761c.hashCode();
    }

    public String toString() {
        p<String, String, C16807N> pVar = this.f77759a;
        C17642l<a, C16807N> lVar = this.f77760b;
        C17631a<C16807N> aVar = this.f77761c;
        return "SurveyCallbacks(onQuestionResponseChange=" + pVar + ", onRatingSelected=" + lVar + ", onDoneClicked=" + aVar + ")";
    }
}
