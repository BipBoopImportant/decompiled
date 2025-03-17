package com.ingka.ikea.mcomsettings.impl.network;

import HJ.C15854t;
import com.ingka.ikea.mcomsettings.impl.CardHolderNameValidation;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u0015B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0018¨\u0006("}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/CardHolderNameValidationRemote;", "", "", "seen0", "", "enabled", "", "regex", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/mcomsettings/impl/network/CardHolderNameValidationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/mcomsettings/impl/CardHolderNameValidation;", "a", "()Lcom/ingka/ikea/mcomsettings/impl/CardHolderNameValidation;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "getEnabled$annotations", "()V", "Ljava/lang/String;", "getRegex", "getRegex$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CardHolderNameValidationRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f96663a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96664b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/CardHolderNameValidationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/CardHolderNameValidationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CardHolderNameValidationRemote> serializer() {
            return CardHolderNameValidationRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardHolderNameValidationRemote(int i10, Boolean bool, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, CardHolderNameValidationRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96663a = bool;
        this.f96664b = str;
    }

    public static final /* synthetic */ void b(CardHolderNameValidationRemote cardHolderNameValidationRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, C17457i.f144111a, cardHolderNameValidationRemote.f96663a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, cardHolderNameValidationRemote.f96664b);
    }

    public final CardHolderNameValidation a() {
        String str;
        String str2;
        char c10;
        String str3;
        Boolean bool = this.f96663a;
        String str4 = DslKt.INDICATOR_BACKGROUND;
        String str5 = DslKt.INDICATOR_MAIN;
        Class<CardHolderNameValidationRemote> cls = CardHolderNameValidationRemote.class;
        if (bool == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid card holder validation: " + this);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar : arrayList) {
                if (str6 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str6 = C11820c.a(a10);
                }
                if (str7 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str3 = str4;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str5 : str3) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str3 = str4;
                }
                String str8 = str7;
                bVar.a(eVar, str8, false, illegalArgumentException, str6);
                str7 = str8;
                str4 = str3;
            }
            return null;
        }
        String str9 = str4;
        if (bool.booleanValue() || (str = this.f96664b) == null || str.length() == 0) {
            return new CardHolderNameValidation(this.f96663a.booleanValue(), this.f96664b);
        }
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Invalid card holder validation: " + this);
        e eVar2 = e.ERROR;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str10 = null;
        String str11 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str10 == null) {
                String a11 = C11818a.a((String) null, illegalArgumentException2);
                if (a11 == null) {
                    break;
                }
                str10 = C11820c.a(a11);
            }
            if (str11 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                c10 = '$';
                str2 = str5;
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str2 : str9) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                str2 = str5;
                c10 = '$';
            }
            char c11 = c10;
            bVar2.a(eVar2, str11, false, illegalArgumentException2, str10);
            str5 = str2;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardHolderNameValidationRemote)) {
            return false;
        }
        CardHolderNameValidationRemote cardHolderNameValidationRemote = (CardHolderNameValidationRemote) obj;
        return C17542s.e(this.f96663a, cardHolderNameValidationRemote.f96663a) && C17542s.e(this.f96664b, cardHolderNameValidationRemote.f96664b);
    }

    public int hashCode() {
        Boolean bool = this.f96663a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f96664b;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Boolean bool = this.f96663a;
        String str = this.f96664b;
        return "CardHolderNameValidationRemote(enabled=" + bool + ", regex=" + str + ")";
    }
}
