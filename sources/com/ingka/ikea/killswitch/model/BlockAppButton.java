package com.ingka.ikea.killswitch.model;

import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 \"2\u00020\u0001:\u0004\u001d \u0013#B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006$"}, d2 = {"Lcom/ingka/ikea/killswitch/model/BlockAppButton;", "", "", "seen0", "", "title", "actionurl", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/killswitch/model/BlockAppButton;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Ljava/lang/String;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "getTitle$annotations", "()V", "b", "getActionurl$annotations", "Companion", "$serializer", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlockAppButton {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f96394a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96395b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/killswitch/model/BlockAppButton$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/killswitch/model/BlockAppButton;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "MAX_SUPPORTED_BUTTONS", "I", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BlockAppButton> serializer() {
            return BlockAppButton$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/killswitch/model/BlockAppButton$b;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "CANCEL", "CLOSE", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        NONE,
        CANCEL,
        CLOSE;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/killswitch/model/BlockAppButton$c;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "DOWNLOAD_NEW_APP", "UPDATE_THE_APP", "MAIN_ACTION", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        NONE,
        DOWNLOAD_NEW_APP,
        UPDATE_THE_APP,
        MAIN_ACTION;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public /* synthetic */ BlockAppButton(int i10, String str, String str2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, BlockAppButton$$serializer.INSTANCE.getDescriptor());
        }
        this.f96394a = str;
        this.f96395b = str2;
    }

    public static final /* synthetic */ void d(BlockAppButton blockAppButton, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, blockAppButton.f96394a);
        dVar.B(serialDescriptor, 1, y02, blockAppButton.f96395b);
    }

    public final String a() {
        return this.f96395b;
    }

    public final String b() {
        return this.f96395b;
    }

    public final String c() {
        return this.f96394a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockAppButton)) {
            return false;
        }
        BlockAppButton blockAppButton = (BlockAppButton) obj;
        return C17542s.e(this.f96394a, blockAppButton.f96394a) && C17542s.e(this.f96395b, blockAppButton.f96395b);
    }

    public int hashCode() {
        String str = this.f96394a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f96395b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f96394a;
        String str2 = this.f96395b;
        return "BlockAppButton(title=" + str + ", actionurl=" + str2 + ")";
    }
}
