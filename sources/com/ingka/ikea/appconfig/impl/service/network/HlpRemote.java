package com.ingka.ikea.appconfig.impl.service.network;

import YH.X;
import fK.p;
import iK.C17395d;
import jK.C17446c0;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\b\u0018\u0000 42\u00020\u0001:\u00025%Bq\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u001fR.\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010,\u0012\u0004\b/\u0010)\u001a\u0004\b-\u0010.R.\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010,\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010.R.\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010,\u0012\u0004\b3\u0010)\u001a\u0004\b2\u0010.¨\u00066"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/HlpRemote;", "", "", "seen0", "", "domain", "clientId", "", "parameters", "loginParameters", "signupParameters", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/appconfig/impl/service/network/HlpRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LRl/a;", "b", "()LRl/a;", "c", "", "d", "()Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDomain", "getDomain$annotations", "()V", "getClientId", "getClientId$annotations", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "getParameters$annotations", "getLoginParameters", "getLoginParameters$annotations", "getSignupParameters", "getSignupParameters$annotations", "Companion", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HlpRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f92913f;

    /* renamed from: a  reason: collision with root package name */
    private final String f92914a;

    /* renamed from: b  reason: collision with root package name */
    private final String f92915b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f92916c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f92917d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f92918e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/HlpRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/HlpRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<HlpRemote> serializer() {
            return HlpRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Y0 y02 = Y0.f144077a;
        f92913f = new KSerializer[]{null, null, new C17446c0(y02, y02), new C17446c0(y02, y02), new C17446c0(y02, y02)};
    }

    public /* synthetic */ HlpRemote(int i10, String str, String str2, Map map, Map map2, Map map3, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, HlpRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92914a = str;
        this.f92915b = str2;
        this.f92916c = map;
        this.f92917d = map2;
        this.f92918e = map3;
    }

    public static final /* synthetic */ void e(HlpRemote hlpRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f92913f;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, hlpRemote.f92914a);
        dVar.B(serialDescriptor, 1, y02, hlpRemote.f92915b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], hlpRemote.f92916c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], hlpRemote.f92917d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], hlpRemote.f92918e);
    }

    public final Rl.a b() {
        String str;
        String str2 = this.f92914a;
        if (str2 == null || str2.length() == 0 || (str = this.f92915b) == null || str.length() == 0 || this.f92916c == null) {
            throw new IllegalArgumentException("Could not create hosted login page object");
        }
        Map<String, String> map = this.f92917d;
        if (map == null) {
            map = X.j();
        }
        return new Rl.a(this.f92914a, this.f92915b, X.s(this.f92916c, map));
    }

    public final Rl.a c() {
        String str;
        String str2 = this.f92914a;
        if (str2 == null || str2.length() == 0 || (str = this.f92915b) == null || str.length() == 0 || this.f92916c == null) {
            throw new IllegalArgumentException("Could not create hosted sign up page object");
        }
        Map<String, String> map = this.f92918e;
        if (map == null) {
            map = X.j();
        }
        return new Rl.a(this.f92914a, this.f92915b, X.s(this.f92916c, map));
    }

    public final boolean d() {
        Map<String, String> map = this.f92918e;
        return !(map == null || map.isEmpty());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HlpRemote)) {
            return false;
        }
        HlpRemote hlpRemote = (HlpRemote) obj;
        return C17542s.e(this.f92914a, hlpRemote.f92914a) && C17542s.e(this.f92915b, hlpRemote.f92915b) && C17542s.e(this.f92916c, hlpRemote.f92916c) && C17542s.e(this.f92917d, hlpRemote.f92917d) && C17542s.e(this.f92918e, hlpRemote.f92918e);
    }

    public int hashCode() {
        String str = this.f92914a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f92915b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.f92916c;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.f92917d;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.f92918e;
        if (map3 != null) {
            i10 = map3.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        String str = this.f92914a;
        String str2 = this.f92915b;
        Map<String, String> map = this.f92916c;
        Map<String, String> map2 = this.f92917d;
        Map<String, String> map3 = this.f92918e;
        return "HlpRemote(domain=" + str + ", clientId=" + str2 + ", parameters=" + map + ", loginParameters=" + map2 + ", signupParameters=" + map3 + ")";
    }
}
