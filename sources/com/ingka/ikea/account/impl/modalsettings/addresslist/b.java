package com.ingka.ikea.account.impl.modalsettings.addresslist;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.ingka.ikea.useraccount.model.Address;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/addresslist/b;", "", "<init>", "()V", "b", "c", "a", "Lcom/ingka/ikea/account/impl/modalsettings/addresslist/b$a;", "Lcom/ingka/ikea/account/impl/modalsettings/addresslist/b$b;", "Lcom/ingka/ikea/account/impl/modalsettings/addresslist/b$c;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/addresslist/b$a;", "Lcom/ingka/ikea/account/impl/modalsettings/addresslist/b;", "", "title", "", "showAction", "Lcom/ingka/ikea/useraccount/model/Address$Type;", "addressType", "<init>", "(IZLcom/ingka/ikea/useraccount/model/Address$Type;)V", "a", "I", "c", "()I", "b", "Z", "()Z", "Lcom/ingka/ikea/useraccount/model/Address$Type;", "()Lcom/ingka/ikea/useraccount/model/Address$Type;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final int f69636a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f69637b;

        /* renamed from: c  reason: collision with root package name */
        private final Address.Type f69638c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i10, boolean z10, Address.Type type) {
            super((DefaultConstructorMarker) null);
            C17542s.j(type, "addressType");
            this.f69636a = i10;
            this.f69637b = z10;
            this.f69638c = type;
        }

        public final Address.Type a() {
            return this.f69638c;
        }

        public final boolean b() {
            return this.f69637b;
        }

        public final int c() {
            return this.f69636a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/addresslist/b$b;", "Lcom/ingka/ikea/account/impl/modalsettings/addresslist/b;", "Lcom/ingka/ikea/useraccount/model/Address;", "address", "", "deletable", "<init>", "(Lcom/ingka/ikea/useraccount/model/Address;Z)V", "a", "Lcom/ingka/ikea/useraccount/model/Address;", "()Lcom/ingka/ikea/useraccount/model/Address;", "b", "Z", "()Z", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.account.impl.modalsettings.addresslist.b$b  reason: collision with other inner class name */
    public static final class C1199b extends b {

        /* renamed from: a  reason: collision with root package name */
        private final Address f69639a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f69640b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1199b(Address address, boolean z10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(address, PlaceTypes.ADDRESS);
            this.f69639a = address;
            this.f69640b = z10;
        }

        public final Address a() {
            return this.f69639a;
        }

        public final boolean b() {
            return this.f69640b;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/addresslist/b$c;", "Lcom/ingka/ikea/account/impl/modalsettings/addresslist/b;", "<init>", "()V", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f69641a = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
