package Zd;

import XH.C16807N;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.ingka.ikea.useraccount.model.Address;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"LZd/b;", "", "Lcom/ingka/ikea/useraccount/model/Address;", "address", "Lkotlin/Function1;", "", "LXH/N;", "onClicked", "onSwipe", "<init>", "(Lcom/ingka/ikea/useraccount/model/Address;LnI/l;LnI/l;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/useraccount/model/Address;", "()Lcom/ingka/ikea/useraccount/model/Address;", "b", "LnI/l;", "()LnI/l;", "c", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Address f65151a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<Integer, C16807N> f65152b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<Integer, C16807N> f65153c;

    public b(Address address, C17642l<? super Integer, C16807N> lVar, C17642l<? super Integer, C16807N> lVar2) {
        C17542s.j(address, PlaceTypes.ADDRESS);
        C17542s.j(lVar, "onClicked");
        C17542s.j(lVar2, "onSwipe");
        this.f65151a = address;
        this.f65152b = lVar;
        this.f65153c = lVar2;
    }

    public final Address a() {
        return this.f65151a;
    }

    public final C17642l<Integer, C16807N> b() {
        return this.f65152b;
    }

    public final C17642l<Integer, C16807N> c() {
        return this.f65153c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f65151a, bVar.f65151a) && C17542s.e(this.f65152b, bVar.f65152b) && C17542s.e(this.f65153c, bVar.f65153c);
    }

    public int hashCode() {
        return (((this.f65151a.hashCode() * 31) + this.f65152b.hashCode()) * 31) + this.f65153c.hashCode();
    }

    public String toString() {
        Address address = this.f65151a;
        C17642l<Integer, C16807N> lVar = this.f65152b;
        C17642l<Integer, C16807N> lVar2 = this.f65153c;
        return "AddressDelegateItem(address=" + address + ", onClicked=" + lVar + ", onSwipe=" + lVar2 + ")";
    }
}
