package com.ingka.ikea.account.impl.upgrade;

import XH.C16807N;
import com.ingka.ikea.core.android.view.BackButton;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007R\"\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0018\u0010\u0016R*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u000f\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\u0005R*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b!\u0010\u001d\"\u0004\b%\u0010\u001f¨\u0006'"}, d2 = {"Lcom/ingka/ikea/account/impl/upgrade/d;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "I", "c", "i", "(I)V", "backButtonResId", "h", "backButtonDescriptionId", "Lkotlin/Function0;", "LXH/N;", "LnI/a;", "()LnI/a;", "g", "(LnI/a;)V", "backAction", "e", "f", "k", "navigateText", "j", "navigateAction", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.ingka.ikea.account.impl.upgrade.d  reason: case insensitive filesystem */
public final class C9602d {

    /* renamed from: a  reason: collision with root package name */
    private final String f69894a;

    /* renamed from: b  reason: collision with root package name */
    private int f69895b;

    /* renamed from: c  reason: collision with root package name */
    private int f69896c;

    /* renamed from: d  reason: collision with root package name */
    private C17631a<C16807N> f69897d;

    /* renamed from: e  reason: collision with root package name */
    private String f69898e;

    /* renamed from: f  reason: collision with root package name */
    private C17631a<C16807N> f69899f;

    public C9602d(String str) {
        C17542s.j(str, "name");
        this.f69894a = str;
        BackButton backButton = BackButton.BACK;
        this.f69895b = backButton.getResId();
        this.f69896c = backButton.getContentDescriptionId();
    }

    public final C17631a<C16807N> a() {
        return this.f69897d;
    }

    public final int b() {
        return this.f69896c;
    }

    public final int c() {
        return this.f69895b;
    }

    public final String d() {
        return this.f69894a;
    }

    public final C17631a<C16807N> e() {
        return this.f69899f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9602d) && C17542s.e(this.f69894a, ((C9602d) obj).f69894a);
    }

    public final String f() {
        return this.f69898e;
    }

    public final void g(C17631a<C16807N> aVar) {
        this.f69897d = aVar;
    }

    public final void h(int i10) {
        this.f69896c = i10;
    }

    public int hashCode() {
        return this.f69894a.hashCode();
    }

    public final void i(int i10) {
        this.f69895b = i10;
    }

    public final void j(C17631a<C16807N> aVar) {
        this.f69899f = aVar;
    }

    public final void k(String str) {
        this.f69898e = str;
    }

    public String toString() {
        String str = this.f69894a;
        return "HeaderViewModel(name=" + str + ")";
    }
}
