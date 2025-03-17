package com.ingka.ikea.dynamicfields.datalayer;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import cq.C11180a;
import fI.C17221b;
import fK.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/dynamicfields/datalayer/a;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "a", "REGULAR", "FAMILY", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum a {
    REGULAR("REGULAR"),
    FAMILY("FAMILY");
    
    /* access modifiers changed from: private */
    public static final C16824o<KSerializer<Object>> $cachedSerializer$delegate = null;
    public static final C2127a Companion = null;

    /* renamed from: id  reason: collision with root package name */
    private final String f95687id;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/dynamicfields/datalayer/a$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/dynamicfields/datalayer/a;", "serializer", "()Lkotlinx/serialization/KSerializer;", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.dynamicfields.datalayer.a$a  reason: collision with other inner class name */
    public static final class C2127a {
        private C2127a() {
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) a.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<a> serializer() {
            return a();
        }

        public /* synthetic */ C2127a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        a[] b10;
        $ENTRIES = C17221b.a(b10);
        Companion = new C2127a((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C16825p.a(s.PUBLICATION, new C11180a());
    }

    private a(String str) {
        this.f95687id = str;
    }
}
