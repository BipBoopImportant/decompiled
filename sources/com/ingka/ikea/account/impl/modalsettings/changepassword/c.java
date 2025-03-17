package com.ingka.ikea.account.impl.modalsettings.changepassword;

import IC.C13023e;
import IC.C13026h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\t\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/changepassword/c;", "", "<init>", "()V", "LIC/e;", "a", "()LIC/e;", "message", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "b", "()Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "navigateTo", "c", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/c$a;", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/c$b;", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/c$c;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/changepassword/c$a;", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/c;", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "navigateTo", "<init>", "(Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "b", "()Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "LIC/e;", "LIC/e;", "()LIC/e;", "message", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends c {

        /* renamed from: c  reason: collision with root package name */
        public static final int f69667c = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final a f69668a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f69669b;

        public a() {
            this((a) null, 1, (DefaultConstructorMarker) null);
        }

        public C13023e a() {
            return this.f69669b;
        }

        public a b() {
            return this.f69668a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f69668a, ((a) obj).f69668a);
        }

        public int hashCode() {
            a aVar = this.f69668a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            a aVar = this.f69668a;
            return "Disabled(navigateTo=" + aVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : aVar);
        }

        public a(a aVar) {
            super((DefaultConstructorMarker) null);
            this.f69668a = aVar;
            this.f69669b = C13026h.a(Oo.b.f84321A3);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/changepassword/c$b;", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/c;", "LIC/e;", "message", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "navigateTo", "", "changePasswordUrl", "<init>", "(LIC/e;Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "b", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "()Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "c", "Ljava/lang/String;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends c {

        /* renamed from: d  reason: collision with root package name */
        public static final int f69670d = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f69671a;

        /* renamed from: b  reason: collision with root package name */
        private final a f69672b;

        /* renamed from: c  reason: collision with root package name */
        private final String f69673c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C13023e eVar, a aVar, String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "changePasswordUrl");
            this.f69671a = eVar;
            this.f69672b = aVar;
            this.f69673c = str;
        }

        public C13023e a() {
            return this.f69671a;
        }

        public a b() {
            return this.f69672b;
        }

        public final String c() {
            return this.f69673c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f69671a, bVar.f69671a) && C17542s.e(this.f69672b, bVar.f69672b) && C17542s.e(this.f69673c, bVar.f69673c);
        }

        public int hashCode() {
            C13023e eVar = this.f69671a;
            int i10 = 0;
            int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            a aVar = this.f69672b;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return ((hashCode + i10) * 31) + this.f69673c.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f69671a;
            a aVar = this.f69672b;
            String str = this.f69673c;
            return "Enabled(message=" + eVar + ", navigateTo=" + aVar + ", changePasswordUrl=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/changepassword/c$c;", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/c;", "LIC/e;", "message", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "navigateTo", "<init>", "(LIC/e;Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "b", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "()Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.account.impl.modalsettings.changepassword.c$c  reason: collision with other inner class name */
    public static final class C1202c extends c {

        /* renamed from: c  reason: collision with root package name */
        public static final int f69674c = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f69675a;

        /* renamed from: b  reason: collision with root package name */
        private final a f69676b;

        public C1202c() {
            this((C13023e) null, (a) null, 3, (DefaultConstructorMarker) null);
        }

        public C13023e a() {
            return this.f69675a;
        }

        public a b() {
            return this.f69676b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1202c)) {
                return false;
            }
            C1202c cVar = (C1202c) obj;
            return C17542s.e(this.f69675a, cVar.f69675a) && C17542s.e(this.f69676b, cVar.f69676b);
        }

        public int hashCode() {
            C13023e eVar = this.f69675a;
            int i10 = 0;
            int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            a aVar = this.f69676b;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            C13023e eVar = this.f69675a;
            a aVar = this.f69676b;
            return "Loading(message=" + eVar + ", navigateTo=" + aVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C1202c(C13023e eVar, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : eVar, (i10 & 2) != 0 ? null : aVar);
        }

        public C1202c(C13023e eVar, a aVar) {
            super((DefaultConstructorMarker) null);
            this.f69675a = eVar;
            this.f69676b = aVar;
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C13023e a();

    public abstract a b();

    private c() {
    }
}
