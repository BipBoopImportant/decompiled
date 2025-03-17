package jf;

import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import p000if.a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ljf/b;", "", "", "Lif/a;", "links", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lkotlin/Function1;", "LXH/N;", "LnI/l;", "c", "()LnI/l;", "e", "(LnI/l;)V", "onClicked", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jf.b  reason: case insensitive filesystem */
public final class C9911b {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f74834a;

    /* renamed from: b  reason: collision with root package name */
    private C17642l<? super String, C16807N> f74835b = new C9910a();

    public C9911b(List<a> list) {
        C17542s.j(list, "links");
        this.f74834a = list;
    }

    /* access modifiers changed from: private */
    public static final C16807N d(String str) {
        C17542s.j(str, "it");
        return C16807N.f139792a;
    }

    public final List<a> b() {
        return this.f74834a;
    }

    public final C17642l<String, C16807N> c() {
        return this.f74835b;
    }

    public final void e(C17642l<? super String, C16807N> lVar) {
        C17542s.j(lVar, "<set-?>");
        this.f74835b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9911b) && C17542s.e(this.f74834a, ((C9911b) obj).f74834a);
    }

    public int hashCode() {
        return this.f74834a.hashCode();
    }

    public String toString() {
        List<a> list = this.f74834a;
        return "TermsAndConditions(links=" + list + ")";
    }
}
