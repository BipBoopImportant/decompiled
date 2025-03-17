package com.ingka.ikea.useraccount.impl.network;

import HJ.C15854t;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kD.f;
import kD.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\b\b\u0018\u0000 L2\u00020\u0001:\u0002+MB\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010,\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010,\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010,\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010%R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010,\u0012\u0004\b;\u0010/\u001a\u0004\b:\u0010%R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010,\u0012\u0004\b>\u0010/\u001a\u0004\b=\u0010%R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bC\u0010/\u001a\u0004\bA\u0010BR(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010/\u001a\u0004\bF\u0010GR(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\bI\u0010E\u0012\u0004\bK\u0010/\u001a\u0004\bJ\u0010G¨\u0006N"}, d2 = {"Lcom/ingka/ikea/useraccount/impl/network/RemoteProfile;", "", "", "seen0", "", "firstName", "lastName", "initials", "email", "mobileNumber", "birthDate", "preferredStore", "", "newsletter", "", "Lcom/ingka/ikea/useraccount/impl/network/RemoteAddress;", "addresses", "Lcom/ingka/ikea/useraccount/impl/network/RemoteLoyaltyCard;", "loyaltyCards", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "c", "()Z", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/useraccount/impl/network/RemoteProfile;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LkD/h;", "b", "()LkD/h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFirstName", "getFirstName$annotations", "()V", "getLastName", "getLastName$annotations", "getInitials", "getInitials$annotations", "getEmail", "getEmail$annotations", "e", "getMobileNumber", "getMobileNumber$annotations", "f", "getBirthDate", "getBirthDate$annotations", "g", "getPreferredStore", "getPreferredStore$annotations", "h", "Ljava/lang/Boolean;", "getNewsletter", "()Ljava/lang/Boolean;", "getNewsletter$annotations", "i", "Ljava/util/List;", "getAddresses", "()Ljava/util/List;", "getAddresses$annotations", "j", "getLoyaltyCards", "getLoyaltyCards$annotations", "Companion", "$serializer", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteProfile {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer<Object>[] f120620k = {null, null, null, null, null, null, null, null, new C17451f(RemoteAddress$$serializer.INSTANCE), new C17451f(RemoteLoyaltyCard$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f120621a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120622b;

    /* renamed from: c  reason: collision with root package name */
    private final String f120623c;

    /* renamed from: d  reason: collision with root package name */
    private final String f120624d;

    /* renamed from: e  reason: collision with root package name */
    private final String f120625e;

    /* renamed from: f  reason: collision with root package name */
    private final String f120626f;

    /* renamed from: g  reason: collision with root package name */
    private final String f120627g;

    /* renamed from: h  reason: collision with root package name */
    private final Boolean f120628h;

    /* renamed from: i  reason: collision with root package name */
    private final List<RemoteAddress> f120629i;

    /* renamed from: j  reason: collision with root package name */
    private final List<RemoteLoyaltyCard> f120630j;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/useraccount/impl/network/RemoteProfile$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/useraccount/impl/network/RemoteProfile;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "KEY_PREFERRED_STORE", "Ljava/lang/String;", "KEY_NEWSLETTER", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RemoteProfile> serializer() {
            return RemoteProfile$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public /* synthetic */ RemoteProfile(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, List list, List list2, T0 t02) {
        if (1023 != (i10 & 1023)) {
            E0.b(i10, 1023, RemoteProfile$$serializer.INSTANCE.getDescriptor());
        }
        this.f120621a = str;
        this.f120622b = str2;
        this.f120623c = str3;
        this.f120624d = str4;
        this.f120625e = str5;
        this.f120626f = str6;
        this.f120627g = str7;
        this.f120628h = bool;
        this.f120629i = list;
        this.f120630j = list2;
    }

    private final boolean c() {
        if (this.f120621a == null || this.f120622b == null || this.f120624d == null) {
            return false;
        }
        List<RemoteAddress> list = this.f120629i;
        if (list != null) {
            for (RemoteAddress c10 : list) {
                if (!c10.c()) {
                    return false;
                }
            }
        }
        List<RemoteLoyaltyCard> list2 = this.f120630j;
        if (list2 == null) {
            return true;
        }
        for (RemoteLoyaltyCard b10 : list2) {
            if (!b10.b()) {
                return false;
            }
        }
        return true;
    }

    public static final /* synthetic */ void d(RemoteProfile remoteProfile, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120620k;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, remoteProfile.f120621a);
        dVar.B(serialDescriptor, 1, y02, remoteProfile.f120622b);
        dVar.B(serialDescriptor, 2, y02, remoteProfile.f120623c);
        dVar.B(serialDescriptor, 3, y02, remoteProfile.f120624d);
        dVar.B(serialDescriptor, 4, y02, remoteProfile.f120625e);
        dVar.B(serialDescriptor, 5, y02, remoteProfile.f120626f);
        dVar.B(serialDescriptor, 6, y02, remoteProfile.f120627g);
        dVar.B(serialDescriptor, 7, C17457i.f144111a, remoteProfile.f120628h);
        dVar.B(serialDescriptor, 8, kSerializerArr[8], remoteProfile.f120629i);
        dVar.B(serialDescriptor, 9, kSerializerArr[9], remoteProfile.f120630j);
    }

    public final h b() {
        List n10;
        ArrayList arrayList;
        if (!c()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Could not create new profile object");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList2.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList2) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = RemoteProfile.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
            return null;
        }
        List<RemoteAddress> list = this.f120629i;
        if (list != null) {
            Iterable<RemoteAddress> iterable = list;
            n10 = new ArrayList(C16877v.y(iterable, 10));
            for (RemoteAddress b10 : iterable) {
                n10.add(b10.b());
            }
        } else {
            n10 = C16877v.n();
        }
        List list2 = n10;
        List<RemoteLoyaltyCard> list3 = this.f120630j;
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (RemoteLoyaltyCard a11 : list3) {
                f a12 = a11.a();
                if (a12 != null) {
                    arrayList3.add(a12);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = C16877v.n();
        }
        String str5 = this.f120621a;
        C17542s.g(str5);
        String str6 = this.f120622b;
        C17542s.g(str6);
        String str7 = this.f120623c;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = this.f120624d;
        C17542s.g(str8);
        return new h(str5, str6, str7, str8, this.f120625e, this.f120626f, this.f120627g, this.f120628h, list2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteProfile)) {
            return false;
        }
        RemoteProfile remoteProfile = (RemoteProfile) obj;
        return C17542s.e(this.f120621a, remoteProfile.f120621a) && C17542s.e(this.f120622b, remoteProfile.f120622b) && C17542s.e(this.f120623c, remoteProfile.f120623c) && C17542s.e(this.f120624d, remoteProfile.f120624d) && C17542s.e(this.f120625e, remoteProfile.f120625e) && C17542s.e(this.f120626f, remoteProfile.f120626f) && C17542s.e(this.f120627g, remoteProfile.f120627g) && C17542s.e(this.f120628h, remoteProfile.f120628h) && C17542s.e(this.f120629i, remoteProfile.f120629i) && C17542s.e(this.f120630j, remoteProfile.f120630j);
    }

    public int hashCode() {
        String str = this.f120621a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f120622b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120623c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f120624d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f120625e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f120626f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f120627g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.f120628h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<RemoteAddress> list = this.f120629i;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<RemoteLoyaltyCard> list2 = this.f120630j;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode9 + i10;
    }

    public String toString() {
        String str = this.f120621a;
        String str2 = this.f120622b;
        String str3 = this.f120623c;
        String str4 = this.f120624d;
        String str5 = this.f120625e;
        String str6 = this.f120626f;
        String str7 = this.f120627g;
        Boolean bool = this.f120628h;
        List<RemoteAddress> list = this.f120629i;
        List<RemoteLoyaltyCard> list2 = this.f120630j;
        return "RemoteProfile(firstName=" + str + ", lastName=" + str2 + ", initials=" + str3 + ", email=" + str4 + ", mobileNumber=" + str5 + ", birthDate=" + str6 + ", preferredStore=" + str7 + ", newsletter=" + bool + ", addresses=" + list + ", loyaltyCards=" + list2 + ")";
    }
}
