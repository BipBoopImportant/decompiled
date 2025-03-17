package com.ingka.ikea.app.providers.cart.db;

import android.content.Context;
import androidx.room.w;
import androidx.room.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/providers/cart/db/CartItemDatabase;", "Landroidx/room/x;", "<init>", "()V", "Lpi/a;", "c", "()Lpi/a;", "a", "cart-data-layer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CartItemDatabase extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final a f72301a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static volatile CartItemDatabase f72302b;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/providers/cart/db/CartItemDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/ingka/ikea/app/providers/cart/db/CartItemDatabase;", "a", "(Landroid/content/Context;)Lcom/ingka/ikea/app/providers/cart/db/CartItemDatabase;", "b", "", "DATABASE_NAME", "Ljava/lang/String;", "instance", "Lcom/ingka/ikea/app/providers/cart/db/CartItemDatabase;", "cart-data-layer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final CartItemDatabase a(Context context) {
            return w.a(context, CartItemDatabase.class, "cart-db").e();
        }

        public final CartItemDatabase b(Context context) {
            C17542s.j(context, "context");
            CartItemDatabase a10 = CartItemDatabase.f72302b;
            if (a10 == null) {
                synchronized (this) {
                    a10 = CartItemDatabase.f72302b;
                    if (a10 == null) {
                        CartItemDatabase a11 = CartItemDatabase.f72301a.a(context);
                        CartItemDatabase.f72302b = a11;
                        a10 = a11;
                    }
                }
            }
            return a10;
        }

        private a() {
        }
    }

    public abstract pi.a c();
}
