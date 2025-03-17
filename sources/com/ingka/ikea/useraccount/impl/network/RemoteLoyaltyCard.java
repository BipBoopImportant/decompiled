package com.ingka.ikea.useraccount.impl.network;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import kD.f;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u0014B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u001a¨\u0006("}, d2 = {"Lcom/ingka/ikea/useraccount/impl/network/RemoteLoyaltyCard;", "", "", "seen0", "", "type", "number", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/useraccount/impl/network/RemoteLoyaltyCard;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LkD/f;", "a", "()LkD/f;", "", "b", "()Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "getNumber", "getNumber$annotations", "Companion", "$serializer", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteLoyaltyCard {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120618a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120619b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/useraccount/impl/network/RemoteLoyaltyCard$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/useraccount/impl/network/RemoteLoyaltyCard;", "serializer", "()Lkotlinx/serialization/KSerializer;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<RemoteLoyaltyCard> serializer() {
            return RemoteLoyaltyCard$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RemoteLoyaltyCard(int i10, String str, String str2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, RemoteLoyaltyCard$$serializer.INSTANCE.getDescriptor());
        }
        this.f120618a = str;
        this.f120619b = str2;
    }

    public static final /* synthetic */ void c(RemoteLoyaltyCard remoteLoyaltyCard, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, remoteLoyaltyCard.f120618a);
        dVar.B(serialDescriptor, 1, y02, remoteLoyaltyCard.f120619b);
    }

    public final f a() {
        char c10;
        String str;
        String str2 = this.f120619b;
        String str3 = DslKt.INDICATOR_BACKGROUND;
        Class<RemoteLoyaltyCard> cls = RemoteLoyaltyCard.class;
        if (str2 == null || str2.length() == 0) {
            String str4 = str3;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No loyalty card number");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar : arrayList) {
                if (str5 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str5 = C11820c.a(a10);
                }
                if (str6 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    c10 = '$';
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str4) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    c10 = '$';
                }
                char c11 = c10;
                bVar.a(eVar, str6, false, illegalArgumentException, str5);
            }
            return null;
        }
        f.a a11 = f.a.Companion.a(this.f120618a);
        if (a11 != null) {
            return new f(a11, this.f120619b);
        }
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unknown loyalty card type: " + a11);
        e eVar2 = e.ERROR;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str7 = null;
        String str8 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str7 == null) {
                String a12 = C11818a.a((String) null, illegalArgumentException2);
                if (a12 == null) {
                    break;
                }
                str7 = C11820c.a(a12);
            }
            if (str8 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                str = str3;
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                str = str3;
            }
            String str9 = str8;
            IllegalArgumentException illegalArgumentException3 = illegalArgumentException2;
            bVar2.a(eVar2, str9, false, illegalArgumentException3, str7);
            str8 = str9;
            illegalArgumentException2 = illegalArgumentException3;
            str3 = str;
        }
        return null;
    }

    public final boolean b() {
        String str = this.f120619b;
        return (str == null || str.length() == 0 || this.f120618a == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteLoyaltyCard)) {
            return false;
        }
        RemoteLoyaltyCard remoteLoyaltyCard = (RemoteLoyaltyCard) obj;
        return C17542s.e(this.f120618a, remoteLoyaltyCard.f120618a) && C17542s.e(this.f120619b, remoteLoyaltyCard.f120619b);
    }

    public int hashCode() {
        String str = this.f120618a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f120619b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f120618a;
        String str2 = this.f120619b;
        return "RemoteLoyaltyCard(type=" + str + ", number=" + str2 + ")";
    }
}
