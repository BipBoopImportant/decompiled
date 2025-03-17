package SC;

import U0.C4889m;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import wK.C18463r1;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"LSC/e0;", "", "", "title", "caption", "Lkotlin/Function0;", "LXH/N;", "addon", "expandingText", "<init>", "(Ljava/lang/String;Ljava/lang/String;LnI/p;Ljava/lang/String;)V", "LwK/r1;", "a", "()LwK/r1;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "b", "getCaption", "c", "LnI/p;", "getAddon", "()LnI/p;", "d", "getExpandingText", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.e0  reason: case insensitive filesystem */
public final class C13580e0 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f116196e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final String f116197a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116198b;

    /* renamed from: c  reason: collision with root package name */
    private final p<C4889m, Integer, C16807N> f116199c;

    /* renamed from: d  reason: collision with root package name */
    private final String f116200d;

    public C13580e0() {
        this((String) null, (String) null, (p) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public final C18463r1 a() {
        return new C18463r1(this.f116197a, this.f116198b, this.f116199c, this.f116200d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13580e0)) {
            return false;
        }
        C13580e0 e0Var = (C13580e0) obj;
        return C17542s.e(this.f116197a, e0Var.f116197a) && C17542s.e(this.f116198b, e0Var.f116198b) && C17542s.e(this.f116199c, e0Var.f116199c) && C17542s.e(this.f116200d, e0Var.f116200d);
    }

    public int hashCode() {
        String str = this.f116197a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f116198b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        p<C4889m, Integer, C16807N> pVar = this.f116199c;
        int hashCode3 = (hashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str3 = this.f116200d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f116197a;
        String str2 = this.f116198b;
        p<C4889m, Integer, C16807N> pVar = this.f116199c;
        String str3 = this.f116200d;
        return "SkapaChoiceContent(title=" + str + ", caption=" + str2 + ", addon=" + pVar + ", expandingText=" + str3 + ")";
    }

    public C13580e0(String str, String str2, p<? super C4889m, ? super Integer, C16807N> pVar, String str3) {
        this.f116197a = str;
        this.f116198b = str2;
        this.f116199c = pVar;
        this.f116200d = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13580e0(String str, String str2, p pVar, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : pVar, (i10 & 8) != 0 ? null : str3);
    }
}
