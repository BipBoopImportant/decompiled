package Ej;

import Sy.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.O;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u0018\u0010\"¨\u0006#"}, d2 = {"LEj/F;", "", "", "itemNo", "productType", "ptagSize", "Lrz/O;", "scanType", "LSy/a$b;", "productAssortmentSpecialType", "", "overrideBarcodeWithItemNoWhenPersisting", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrz/O;LSy/a$b;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "e", "Lrz/O;", "f", "()Lrz/O;", "LSy/a$b;", "()LSy/a$b;", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class F {

    /* renamed from: a  reason: collision with root package name */
    private final String f80668a;

    /* renamed from: b  reason: collision with root package name */
    private final String f80669b;

    /* renamed from: c  reason: collision with root package name */
    private final String f80670c;

    /* renamed from: d  reason: collision with root package name */
    private final O f80671d;

    /* renamed from: e  reason: collision with root package name */
    private final a.b f80672e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f80673f;

    public F(String str, String str2, String str3, O o10, a.b bVar, boolean z10) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "productType");
        C17542s.j(o10, "scanType");
        this.f80668a = str;
        this.f80669b = str2;
        this.f80670c = str3;
        this.f80671d = o10;
        this.f80672e = bVar;
        this.f80673f = z10;
    }

    public final String a() {
        return this.f80668a;
    }

    public final boolean b() {
        return this.f80673f;
    }

    public final a.b c() {
        return this.f80672e;
    }

    public final String d() {
        return this.f80669b;
    }

    public final String e() {
        return this.f80670c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return C17542s.e(this.f80668a, f10.f80668a) && C17542s.e(this.f80669b, f10.f80669b) && C17542s.e(this.f80670c, f10.f80670c) && this.f80671d == f10.f80671d && this.f80672e == f10.f80672e && this.f80673f == f10.f80673f;
    }

    public final O f() {
        return this.f80671d;
    }

    public int hashCode() {
        int hashCode = ((this.f80668a.hashCode() * 31) + this.f80669b.hashCode()) * 31;
        String str = this.f80670c;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f80671d.hashCode()) * 31;
        a.b bVar = this.f80672e;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f80673f);
    }

    public String toString() {
        String str = this.f80668a;
        String str2 = this.f80669b;
        String str3 = this.f80670c;
        O o10 = this.f80671d;
        a.b bVar = this.f80672e;
        boolean z10 = this.f80673f;
        return "ScannedObject(itemNo=" + str + ", productType=" + str2 + ", ptagSize=" + str3 + ", scanType=" + o10 + ", productAssortmentSpecialType=" + bVar + ", overrideBarcodeWithItemNoWhenPersisting=" + z10 + ")";
    }
}
