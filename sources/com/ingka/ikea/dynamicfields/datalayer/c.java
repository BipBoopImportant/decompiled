package com.ingka.ikea.dynamicfields.datalayer;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import dq.g;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p(with = g.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/ingka/ikea/dynamicfields/datalayer/c;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "v", "()I", "Companion", "a", "TEXT", "PASSWORD", "CHECKBOX", "PICKER", "DATE_PICKER", "STORE_PICKER", "ADDRESS_PICKER", "HIDDEN", "LABEL", "TEXT_BOX", "BODY_2", "DISCLAIMER", "TOGGLE", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum c {
    TEXT(0),
    PASSWORD(1),
    CHECKBOX(2),
    PICKER(3),
    DATE_PICKER(4),
    STORE_PICKER(5),
    ADDRESS_PICKER(6),
    HIDDEN(7),
    LABEL(8),
    TEXT_BOX(9),
    BODY_2(10),
    DISCLAIMER(11),
    TOGGLE(12);
    
    /* access modifiers changed from: private */
    public static final C16824o<KSerializer<Object>> $cachedSerializer$delegate = null;
    public static final a Companion = null;
    private final int value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/dynamicfields/datalayer/c$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/dynamicfields/datalayer/c;", "serializer", "()Lkotlinx/serialization/KSerializer;", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) c.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<c> serializer() {
            return a();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        c[] b10;
        $ENTRIES = C17221b.a(b10);
        Companion = new a((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C16825p.a(s.PUBLICATION, new cq.c());
    }

    private c(int i10) {
        this.value = i10;
    }

    public static C17220a<c> n() {
        return $ENTRIES;
    }

    public final int v() {
        return this.value;
    }
}
