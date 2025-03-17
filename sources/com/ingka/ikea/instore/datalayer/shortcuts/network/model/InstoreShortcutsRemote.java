package com.ingka.ikea.instore.datalayer.shortcuts.network.model;

import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0003$%\u001dB+\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/shortcuts/network/model/InstoreShortcutsRemote;", "Lpp/b;", "", "", "", "seen0", "Lcom/ingka/ikea/instore/datalayer/shortcuts/network/model/InstoreShortcutsRemote$ShortcutRemote;", "shortcuts", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/instore/datalayer/shortcuts/network/model/InstoreShortcutsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getShortcuts", "()Ljava/util/List;", "getShortcuts$annotations", "()V", "Companion", "ShortcutRemote", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InstoreShortcutsRemote implements C11768b<List<Object>> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer<Object>[] f96160b = {new C17451f(InstoreShortcutsRemote$ShortcutRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final List<ShortcutRemote> f96161a;

    @p
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\b\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/\u0015BC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010!\u001a\u0004\b\b\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010!\u001a\u0004\b(\u0010)R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010'\u0012\u0004\b-\u0010!\u001a\u0004\b,\u0010)¨\u00060"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/shortcuts/network/model/InstoreShortcutsRemote$ShortcutRemote;", "Lpp/b;", "", "", "seen0", "", "type", "", "isNew", "order", "storeModeOrder", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/instore/datalayer/shortcuts/network/model/InstoreShortcutsRemote$ShortcutRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isNew$annotations", "c", "Ljava/lang/Integer;", "getOrder", "()Ljava/lang/Integer;", "getOrder$annotations", "d", "getStoreModeOrder", "getStoreModeOrder$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShortcutRemote implements C11768b<Object> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96162a;

        /* renamed from: b  reason: collision with root package name */
        private final Boolean f96163b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f96164c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f96165d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/shortcuts/network/model/InstoreShortcutsRemote$ShortcutRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/shortcuts/network/model/InstoreShortcutsRemote$ShortcutRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ShortcutRemote> serializer() {
                return InstoreShortcutsRemote$ShortcutRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ShortcutRemote(int i10, String str, Boolean bool, Integer num, Integer num2, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, InstoreShortcutsRemote$ShortcutRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f96162a = str;
            this.f96163b = bool;
            this.f96164c = num;
            this.f96165d = num2;
        }

        public static final /* synthetic */ void a(ShortcutRemote shortcutRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, shortcutRemote.f96162a);
            dVar.B(serialDescriptor, 1, C17457i.f144111a, shortcutRemote.f96163b);
            X x10 = X.f144073a;
            dVar.B(serialDescriptor, 2, x10, shortcutRemote.f96164c);
            dVar.B(serialDescriptor, 3, x10, shortcutRemote.f96165d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortcutRemote)) {
                return false;
            }
            ShortcutRemote shortcutRemote = (ShortcutRemote) obj;
            return C17542s.e(this.f96162a, shortcutRemote.f96162a) && C17542s.e(this.f96163b, shortcutRemote.f96163b) && C17542s.e(this.f96164c, shortcutRemote.f96164c) && C17542s.e(this.f96165d, shortcutRemote.f96165d);
        }

        public int hashCode() {
            String str = this.f96162a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f96163b;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.f96164c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f96165d;
            if (num2 != null) {
                i10 = num2.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            String str = this.f96162a;
            Boolean bool = this.f96163b;
            Integer num = this.f96164c;
            Integer num2 = this.f96165d;
            return "ShortcutRemote(type=" + str + ", isNew=" + bool + ", order=" + num + ", storeModeOrder=" + num2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/shortcuts/network/model/InstoreShortcutsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/shortcuts/network/model/InstoreShortcutsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<InstoreShortcutsRemote> serializer() {
            return InstoreShortcutsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InstoreShortcutsRemote(int i10, List list, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, InstoreShortcutsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96161a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstoreShortcutsRemote) && C17542s.e(this.f96161a, ((InstoreShortcutsRemote) obj).f96161a);
    }

    public int hashCode() {
        List<ShortcutRemote> list = this.f96161a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<ShortcutRemote> list = this.f96161a;
        return "InstoreShortcutsRemote(shortcuts=" + list + ")";
    }
}
