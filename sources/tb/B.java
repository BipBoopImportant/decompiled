package Tb;

import Tb.G;

final class B extends G {

    /* renamed from: a  reason: collision with root package name */
    private final G.a f63437a;

    /* renamed from: b  reason: collision with root package name */
    private final G.c f63438b;

    /* renamed from: c  reason: collision with root package name */
    private final G.b f63439c;

    B(G.a aVar, G.c cVar, G.b bVar) {
        if (aVar != null) {
            this.f63437a = aVar;
            if (cVar != null) {
                this.f63438b = cVar;
                if (bVar != null) {
                    this.f63439c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    public G.a a() {
        return this.f63437a;
    }

    public G.b c() {
        return this.f63439c;
    }

    public G.c d() {
        return this.f63438b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return this.f63437a.equals(g10.a()) && this.f63438b.equals(g10.d()) && this.f63439c.equals(g10.c());
    }

    public int hashCode() {
        return ((((this.f63437a.hashCode() ^ 1000003) * 1000003) ^ this.f63438b.hashCode()) * 1000003) ^ this.f63439c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f63437a + ", osData=" + this.f63438b + ", deviceData=" + this.f63439c + "}";
    }
}
