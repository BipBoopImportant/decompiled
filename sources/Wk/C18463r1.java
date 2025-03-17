package wK;

import U0.C4889m;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\f¨\u0006\u001b"}, d2 = {"LwK/r1;", "", "", "title", "caption", "Lkotlin/Function0;", "LXH/N;", "addon", "expandingText", "<init>", "(Ljava/lang/String;Ljava/lang/String;LnI/p;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "LnI/p;", "()LnI/p;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.r1  reason: case insensitive filesystem */
public final class C18463r1 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f151485e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final String f151486a;

    /* renamed from: b  reason: collision with root package name */
    private final String f151487b;

    /* renamed from: c  reason: collision with root package name */
    private final p<C4889m, Integer, C16807N> f151488c;

    /* renamed from: d  reason: collision with root package name */
    private final String f151489d;

    public C18463r1() {
        this((String) null, (String) null, (p) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public final p<C4889m, Integer, C16807N> a() {
        return this.f151488c;
    }

    public final String b() {
        return this.f151487b;
    }

    public final String c() {
        return this.f151489d;
    }

    public final String d() {
        return this.f151486a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18463r1)) {
            return false;
        }
        C18463r1 r1Var = (C18463r1) obj;
        return C17542s.e(this.f151486a, r1Var.f151486a) && C17542s.e(this.f151487b, r1Var.f151487b) && C17542s.e(this.f151488c, r1Var.f151488c) && C17542s.e(this.f151489d, r1Var.f151489d);
    }

    public int hashCode() {
        String str = this.f151486a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f151487b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        p<C4889m, Integer, C16807N> pVar = this.f151488c;
        int hashCode3 = (hashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str3 = this.f151489d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f151486a;
        String str2 = this.f151487b;
        p<C4889m, Integer, C16807N> pVar = this.f151488c;
        String str3 = this.f151489d;
        return "ChoiceContent(title=" + str + ", caption=" + str2 + ", addon=" + pVar + ", expandingText=" + str3 + ")";
    }

    public C18463r1(String str, String str2, p<? super C4889m, ? super Integer, C16807N> pVar, String str3) {
        this.f151486a = str;
        this.f151487b = str2;
        this.f151488c = pVar;
        this.f151489d = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18463r1(String str, String str2, p pVar, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : pVar, (i10 & 8) != 0 ? null : str3);
    }
}
