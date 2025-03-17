package com.ingka.ikea.killswitch.model;

import HJ.C15854t;
import YH.C16877v;
import android.webkit.URLUtil;
import androidx.annotation.Keep;
import com.ingka.ikea.killswitch.model.BlockAppButton;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.T0;
import jK.Y0;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 02\u00020\u0001:\u00031!2B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010\"\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001bR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010%\u001a\u0004\b)\u0010+R\u0011\u0010/\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b&\u0010.¨\u00063"}, d2 = {"Lcom/ingka/ikea/killswitch/model/BlockApp;", "", "", "title", "message", "", "Lcom/ingka/ikea/killswitch/model/BlockAppButton;", "buttons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "", "f", "()Z", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/killswitch/model/BlockApp;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "getTitle$annotations", "()V", "b", "d", "getMessage$annotations", "c", "Ljava/util/List;", "()Ljava/util/List;", "getButtons$annotations", "Lcom/ingka/ikea/killswitch/model/BlockApp$BlockAppType;", "()Lcom/ingka/ikea/killswitch/model/BlockApp$BlockAppType;", "blockAppType", "Companion", "BlockAppType", "$serializer", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlockApp {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f96390d = {null, null, new C17451f(BlockAppButton$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f96391a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96392b;

    /* renamed from: c  reason: collision with root package name */
    private final List<BlockAppButton> f96393c;

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/killswitch/model/BlockApp$BlockAppType;", "", "Lcom/ingka/ikea/killswitch/model/BlockAppButton$c;", "actionButtonType", "Lcom/ingka/ikea/killswitch/model/BlockAppButton$b;", "cancelButtonType", "<init>", "(Ljava/lang/String;ILcom/ingka/ikea/killswitch/model/BlockAppButton$c;Lcom/ingka/ikea/killswitch/model/BlockAppButton$b;)V", "", "toString", "()Ljava/lang/String;", "Lcom/ingka/ikea/killswitch/model/BlockAppButton$c;", "getActionButtonType", "()Lcom/ingka/ikea/killswitch/model/BlockAppButton$c;", "Lcom/ingka/ikea/killswitch/model/BlockAppButton$b;", "getCancelButtonType", "()Lcom/ingka/ikea/killswitch/model/BlockAppButton$b;", "getCancelCloseButtonType", "cancelCloseButtonType", "TEMPORARY_UNAVAILABLE", "NOT_SUPPORTED", "GENERIC", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum BlockAppType {
        TEMPORARY_UNAVAILABLE(r1, r2),
        NOT_SUPPORTED(BlockAppButton.c.UPDATE_THE_APP, r2),
        GENERIC(BlockAppButton.c.MAIN_ACTION, BlockAppButton.b.CANCEL);
        
        private final BlockAppButton.c actionButtonType;
        private final BlockAppButton.b cancelButtonType;

        static {
            BlockAppType[] $values;
            $ENTRIES = C17221b.a($values);
        }

        private BlockAppType(BlockAppButton.c cVar, BlockAppButton.b bVar) {
            this.actionButtonType = cVar;
            this.cancelButtonType = bVar;
        }

        public static C17220a<BlockAppType> getEntries() {
            return $ENTRIES;
        }

        public final BlockAppButton.c getActionButtonType() {
            return this.actionButtonType;
        }

        public final BlockAppButton.b getCancelButtonType() {
            return this.cancelButtonType;
        }

        public final BlockAppButton.b getCancelCloseButtonType() {
            return this.cancelButtonType;
        }

        public String toString() {
            String name = this.actionButtonType.name();
            String name2 = this.cancelButtonType.name();
            return name + name2;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/killswitch/model/BlockApp$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/killswitch/model/BlockApp;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "APP_STORE_URI_PREFIX", "Ljava/lang/String;", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BlockApp> serializer() {
            return BlockApp$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public BlockApp() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    private final boolean f() {
        Iterable<BlockAppButton> iterable = this.f96393c;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (BlockAppButton b10 : iterable) {
            String b11 = b10.b();
            if (b11 != null && b11.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final /* synthetic */ void g(BlockApp blockApp, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f96390d;
        if (dVar.z(serialDescriptor, 0) || blockApp.f96391a != null) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, blockApp.f96391a);
        }
        if (dVar.z(serialDescriptor, 1) || blockApp.f96392b != null) {
            dVar.B(serialDescriptor, 1, Y0.f144077a, blockApp.f96392b);
        }
        if (dVar.z(serialDescriptor, 2) || !C17542s.e(blockApp.f96393c, C16877v.n())) {
            dVar.i(serialDescriptor, 2, kSerializerArr[2], blockApp.f96393c);
        }
    }

    public final BlockAppType b() {
        List<BlockAppButton> list = this.f96393c;
        if (list == null) {
            list = C16877v.n();
        }
        if (list.size() <= 1 && !f()) {
            return BlockAppType.TEMPORARY_UNAVAILABLE;
        }
        String b10 = list.get(0).b();
        if (b10 == null) {
            b10 = "";
        }
        return (URLUtil.isValidUrl(b10) || C15854t.W(b10, "market://details?id=", false, 2, (Object) null)) ? BlockAppType.NOT_SUPPORTED : BlockAppType.GENERIC;
    }

    public final List<BlockAppButton> c() {
        return this.f96393c;
    }

    public final String d() {
        return this.f96392b;
    }

    public final String e() {
        return this.f96391a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockApp)) {
            return false;
        }
        BlockApp blockApp = (BlockApp) obj;
        return C17542s.e(this.f96391a, blockApp.f96391a) && C17542s.e(this.f96392b, blockApp.f96392b) && C17542s.e(this.f96393c, blockApp.f96393c);
    }

    public int hashCode() {
        String str = this.f96391a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f96392b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode + i10) * 31) + this.f96393c.hashCode();
    }

    public String toString() {
        String str = this.f96391a;
        String str2 = this.f96392b;
        List<BlockAppButton> list = this.f96393c;
        return "BlockApp(title=" + str + ", message=" + str2 + ", buttons=" + list + ")";
    }

    public /* synthetic */ BlockApp(int i10, String str, String str2, List list, T0 t02) {
        if ((i10 & 1) == 0) {
            this.f96391a = null;
        } else {
            this.f96391a = str;
        }
        if ((i10 & 2) == 0) {
            this.f96392b = null;
        } else {
            this.f96392b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f96393c = C16877v.n();
        } else {
            this.f96393c = list;
        }
    }

    public BlockApp(String str, String str2, List<BlockAppButton> list) {
        C17542s.j(list, "buttons");
        this.f96391a = str;
        this.f96392b = str2;
        this.f96393c = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlockApp(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? C16877v.n() : list);
    }
}
