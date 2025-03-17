package com.ingka.ikea.account.impl.modalsettings.changepassword;

import Rd.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "", "a", "b", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a$a;", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a$b;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a$a;", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "LRd/a$b;", "result", "<init>", "(LRd/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LRd/a$b;", "getResult", "()LRd/a$b;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.account.impl.modalsettings.changepassword.a$a  reason: collision with other inner class name */
    public static final class C1200a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final a.b f69660a;

        public C1200a(a.b bVar) {
            C17542s.j(bVar, "result");
            this.f69660a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1200a) && C17542s.e(this.f69660a, ((C1200a) obj).f69660a);
        }

        public int hashCode() {
            return this.f69660a.hashCode();
        }

        public String toString() {
            a.b bVar = this.f69660a;
            return "Back(result=" + bVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a$b;", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "", "url", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final String f69661a;

        public b(String str) {
            C17542s.j(str, "url");
            this.f69661a = str;
        }

        public final String a() {
            return this.f69661a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f69661a, ((b) obj).f69661a);
        }

        public int hashCode() {
            return this.f69661a.hashCode();
        }

        public String toString() {
            String str = this.f69661a;
            return "ChangePasswordHlp(url=" + str + ")";
        }
    }
}
