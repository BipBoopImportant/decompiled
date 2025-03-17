package com.ingka.ikea.ongoinginstoreordersrepository.impl.data;

import Fw.C12909b;
import android.content.Context;
import androidx.room.w;
import androidx.room.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/ongoinginstoreordersrepository/impl/data/OnGoingOrdersDatabase;", "Landroidx/room/x;", "<init>", "()V", "LFw/b;", "a", "()LFw/b;", "ongoingOrdersDao", "ongoinginstoreordersrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class OnGoingOrdersDatabase extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final a f119225a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/ongoinginstoreordersrepository/impl/data/OnGoingOrdersDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "name", "Landroidx/room/x$a;", "Lcom/ingka/ikea/ongoinginstoreordersrepository/impl/data/OnGoingOrdersDatabase;", "c", "(Landroid/content/Context;Ljava/lang/String;)Landroidx/room/x$a;", "a", "(Landroid/content/Context;)Lcom/ingka/ikea/ongoinginstoreordersrepository/impl/data/OnGoingOrdersDatabase;", "b", "(Landroid/content/Context;Ljava/lang/String;)Lcom/ingka/ikea/ongoinginstoreordersrepository/impl/data/OnGoingOrdersDatabase;", "DATABASE_NAME", "Ljava/lang/String;", "ongoinginstoreordersrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final x.a<OnGoingOrdersDatabase> c(Context context, String str) {
            return w.a(context, OnGoingOrdersDatabase.class, str);
        }

        public final OnGoingOrdersDatabase a(Context context) {
            C17542s.j(context, "context");
            return b(context, "ongoingorders-db");
        }

        public final OnGoingOrdersDatabase b(Context context, String str) {
            C17542s.j(context, "context");
            C17542s.j(str, "name");
            return c(context, str).f().e();
        }

        private a() {
        }
    }

    public abstract C12909b a();
}
