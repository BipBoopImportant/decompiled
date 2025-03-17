package com.ingka.ikea.browseandsearch.plp.impl.ui;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import sB.C15035a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/impl/ui/d;", "", "b", "a", "c", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/d$a;", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/d$b;", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/d$c;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/impl/ui/d$a;", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/d;", "LIC/e;", "snackbarText", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements d {

        /* renamed from: b  reason: collision with root package name */
        public static final int f93548b = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f93549a;

        public a(C13023e eVar) {
            C17542s.j(eVar, "snackbarText");
            this.f93549a = eVar;
        }

        public final C13023e a() {
            return this.f93549a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f93549a, ((a) obj).f93549a);
        }

        public int hashCode() {
            return this.f93549a.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f93549a;
            return "AddToCartFailure(snackbarText=" + eVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/impl/ui/d$b;", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/d;", "LIC/e;", "snackbarText", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements d {

        /* renamed from: b  reason: collision with root package name */
        public static final int f93550b = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f93551a;

        public b(C13023e eVar) {
            C17542s.j(eVar, "snackbarText");
            this.f93551a = eVar;
        }

        public final C13023e a() {
            return this.f93551a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f93551a, ((b) obj).f93551a);
        }

        public int hashCode() {
            return this.f93551a.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f93551a;
            return "AddToCartSuccess(snackbarText=" + eVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/impl/ui/d$c;", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/d;", "LsB/a;", "action", "<init>", "(LsB/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LsB/a;", "()LsB/a;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        private final C15035a f93552a;

        public c(C15035a aVar) {
            C17542s.j(aVar, "action");
            this.f93552a = aVar;
        }

        public final C15035a a() {
            return this.f93552a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f93552a, ((c) obj).f93552a);
        }

        public int hashCode() {
            return this.f93552a.hashCode();
        }

        public String toString() {
            C15035a aVar = this.f93552a;
            return "ShoppingListModified(action=" + aVar + ")";
        }
    }
}
