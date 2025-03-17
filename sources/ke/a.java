package Ke;

import com.ingka.ikea.app.addresspicker.addresslookup.repo.network.AddressLookupEndpoint;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tw.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LKe/a;", "", "a", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1017a f61484a = new C1017a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LKe/a$a;", "", "<init>", "()V", "Ltw/h;", "networkService", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/network/AddressLookupEndpoint;", "a", "(Ltw/h;)Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/network/AddressLookupEndpoint;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ke.a$a  reason: collision with other inner class name */
    public static final class C1017a {
        public /* synthetic */ C1017a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AddressLookupEndpoint a(h hVar) {
            C17542s.j(hVar, "networkService");
            return (AddressLookupEndpoint) hVar.b(AddressLookupEndpoint.class);
        }

        private C1017a() {
        }
    }
}
