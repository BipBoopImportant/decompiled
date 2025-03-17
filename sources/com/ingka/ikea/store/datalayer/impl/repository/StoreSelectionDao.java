package com.ingka.ikea.store.datalayer.impl.repository;

import EB.C12829a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\b\u0018\u0000 -2\u00020\u0001:\u0002.\u001fB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010 \u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010 \u0012\u0004\b'\u0010#\u001a\u0004\b\u001f\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010(\u0012\u0004\b+\u0010#\u001a\u0004\b)\u0010*R \u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010 \u0012\u0004\b,\u0010#\u001a\u0004\b$\u0010\u0019¨\u0006/"}, d2 = {"Lcom/ingka/ikea/store/datalayer/impl/repository/StoreSelectionDao;", "", "", "id", "name", "address", "", "shopGoEnabled", "buCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/store/datalayer/impl/repository/StoreSelectionDao;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "getId$annotations", "()V", "b", "d", "getName$annotations", "getAddress$annotations", "Z", "e", "()Z", "getShopGoEnabled$annotations", "getBuCode$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StoreSelectionDao {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120405a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120406b;

    /* renamed from: c  reason: collision with root package name */
    private final String f120407c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f120408d;

    /* renamed from: e  reason: collision with root package name */
    private final String f120409e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/datalayer/impl/repository/StoreSelectionDao$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/datalayer/impl/repository/StoreSelectionDao;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StoreSelectionDao> serializer() {
            return StoreSelectionDao$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StoreSelectionDao(int i10, String str, String str2, String str3, boolean z10, String str4, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, StoreSelectionDao$$serializer.INSTANCE.getDescriptor());
        }
        this.f120405a = str;
        if ((i10 & 2) == 0) {
            this.f120406b = "";
        } else {
            this.f120406b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f120407c = "";
        } else {
            this.f120407c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f120408d = false;
        } else {
            this.f120408d = z10;
        }
        if ((i10 & 16) == 0) {
            this.f120409e = C12829a.STORE.j();
        } else {
            this.f120409e = str4;
        }
    }

    public static final /* synthetic */ void f(StoreSelectionDao storeSelectionDao, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, storeSelectionDao.f120405a);
        if (dVar.z(serialDescriptor, 1) || !C17542s.e(storeSelectionDao.f120406b, "")) {
            dVar.y(serialDescriptor, 1, storeSelectionDao.f120406b);
        }
        if (dVar.z(serialDescriptor, 2) || !C17542s.e(storeSelectionDao.f120407c, "")) {
            dVar.y(serialDescriptor, 2, storeSelectionDao.f120407c);
        }
        if (dVar.z(serialDescriptor, 3) || storeSelectionDao.f120408d) {
            dVar.x(serialDescriptor, 3, storeSelectionDao.f120408d);
        }
        if (dVar.z(serialDescriptor, 4) || !C17542s.e(storeSelectionDao.f120409e, C12829a.STORE.j())) {
            dVar.y(serialDescriptor, 4, storeSelectionDao.f120409e);
        }
    }

    public final String a() {
        return this.f120407c;
    }

    public final String b() {
        return this.f120409e;
    }

    public final String c() {
        return this.f120405a;
    }

    public final String d() {
        return this.f120406b;
    }

    public final boolean e() {
        return this.f120408d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreSelectionDao)) {
            return false;
        }
        StoreSelectionDao storeSelectionDao = (StoreSelectionDao) obj;
        return C17542s.e(this.f120405a, storeSelectionDao.f120405a) && C17542s.e(this.f120406b, storeSelectionDao.f120406b) && C17542s.e(this.f120407c, storeSelectionDao.f120407c) && this.f120408d == storeSelectionDao.f120408d && C17542s.e(this.f120409e, storeSelectionDao.f120409e);
    }

    public int hashCode() {
        return (((((((this.f120405a.hashCode() * 31) + this.f120406b.hashCode()) * 31) + this.f120407c.hashCode()) * 31) + Boolean.hashCode(this.f120408d)) * 31) + this.f120409e.hashCode();
    }

    public String toString() {
        String str = this.f120405a;
        String str2 = this.f120406b;
        String str3 = this.f120407c;
        boolean z10 = this.f120408d;
        String str4 = this.f120409e;
        return "StoreSelectionDao(id=" + str + ", name=" + str2 + ", address=" + str3 + ", shopGoEnabled=" + z10 + ", buCode=" + str4 + ")";
    }

    public StoreSelectionDao(String str, String str2, String str3, boolean z10, String str4) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        C17542s.j(str3, PlaceTypes.ADDRESS);
        C17542s.j(str4, "buCode");
        this.f120405a = str;
        this.f120406b = str2;
        this.f120407c = str3;
        this.f120408d = z10;
        this.f120409e = str4;
    }
}
