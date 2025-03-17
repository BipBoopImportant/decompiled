package com.ingka.ikea.app.stockinfo.network;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/d;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "OUT_OF_STOCK", "LOW_IN_STOCK", "MEDIUM_IN_STOCK", "HIGH_IN_STOCK", "OTHER", "EMPTY", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum d {
    OUT_OF_STOCK,
    LOW_IN_STOCK,
    MEDIUM_IN_STOCK,
    HIGH_IN_STOCK,
    OTHER,
    EMPTY;
    
    /* access modifiers changed from: private */
    public static final C16824o<KSerializer<Object>> $cachedSerializer$delegate = null;
    public static final a Companion = null;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/d$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/d;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) d.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<d> serializer() {
            return a();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        d[] b10;
        $ENTRIES = C17221b.a(b10);
        Companion = new a((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C16825p.a(s.PUBLICATION, new Vk.d());
    }

    public static C17220a<d> n() {
        return $ENTRIES;
    }
}
