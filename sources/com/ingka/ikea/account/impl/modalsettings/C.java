package com.ingka.ikea.account.impl.modalsettings;

import D2.d;
import XH.C16796C;
import android.os.Bundle;
import com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\u0014B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/C;", "", "", "redirectUrl", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "useCase", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;)V", "Landroid/os/Bundle;", "c", "()Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "()Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C {

    /* renamed from: c  reason: collision with root package name */
    public static final a f69582c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f69583a;

    /* renamed from: b  reason: collision with root package name */
    private final HostedRedirectActivity.Companion.RedirectUseCase f69584b;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/C$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/ingka/ikea/account/impl/modalsettings/C;", "a", "(Landroid/os/Bundle;)Lcom/ingka/ikea/account/impl/modalsettings/C;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a(Bundle bundle) {
            C17542s.j(bundle, "bundle");
            String string = bundle.getString("redirectUrl");
            String string2 = bundle.getString("useCase");
            if (string2 != null) {
                return new C(string, HostedRedirectActivity.Companion.RedirectUseCase.valueOf(string2));
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        private a() {
        }
    }

    public C(String str, HostedRedirectActivity.Companion.RedirectUseCase redirectUseCase) {
        C17542s.j(redirectUseCase, "useCase");
        this.f69583a = str;
        this.f69584b = redirectUseCase;
    }

    public final String a() {
        return this.f69583a;
    }

    public final HostedRedirectActivity.Companion.RedirectUseCase b() {
        return this.f69584b;
    }

    public final Bundle c() {
        return d.b(C16796C.a("redirectUrl", this.f69583a), C16796C.a("useCase", this.f69584b.name()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return C17542s.e(this.f69583a, c10.f69583a) && this.f69584b == c10.f69584b;
    }

    public int hashCode() {
        String str = this.f69583a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f69584b.hashCode();
    }

    public String toString() {
        String str = this.f69583a;
        HostedRedirectActivity.Companion.RedirectUseCase redirectUseCase = this.f69584b;
        return "HostedRedirectActivityArgs(redirectUrl=" + str + ", useCase=" + redirectUseCase + ")";
    }
}
