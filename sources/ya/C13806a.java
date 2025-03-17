package YA;

import GK.C15774B;
import GK.C15804w;
import GK.z;
import L6.b;
import VA.C13737a;
import VA.C13741e;
import VA.C13750l;
import XA.C13797a;
import aA.C13909a;
import android.content.Context;
import androidx.room.w;
import com.ingka.ikea.shoppinglist.datalayer.impl.db.ShoppingListDatabase;
import dB.C14335a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tw.a;
import tw.h;
import tw.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LYA/a;", "", "a", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YA.a  reason: case insensitive filesystem */
public abstract class C13806a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2925a f117882a = new C2925a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001:\u0001$B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u001a\u001a\u00020\u00172\u000e\b\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u001cH\u0001¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020#2\b\b\u0001\u0010\"\u001a\u00020\u001fH\u0001¢\u0006\u0004\b$\u0010%J\u0019\u0010)\u001a\u00020(2\b\b\u0001\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0000XT¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"LYA/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LXA/a;", "clearLegacyTableCallback", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/db/ShoppingListDatabase;", "d", "(Landroid/content/Context;LXA/a;)Lcom/ingka/ikea/shoppinglist/datalayer/impl/db/ShoppingListDatabase;", "shoppingListDatabase", "LVA/e;", "e", "(Lcom/ingka/ikea/shoppinglist/datalayer/impl/db/ShoppingListDatabase;)LVA/e;", "LVA/l;", "f", "(Lcom/ingka/ikea/shoppinglist/datalayer/impl/db/ShoppingListDatabase;)LVA/l;", "LVA/a;", "c", "(Lcom/ingka/ikea/shoppinglist/datalayer/impl/db/ShoppingListDatabase;)LVA/a;", "LaA/a;", "sessionManager", "Ltw/p;", "g", "(LaA/a;)Ltw/p;", "tokenInterceptor", "", "LGK/w;", "apolloInterceptors", "botManagerInterceptor", "LGK/z;", "b", "(Ltw/p;Ljava/util/List;LGK/w;)LGK/z;", "okHttpClient", "LL6/b;", "a", "(LGK/z;)LL6/b;", "Ltw/h;", "networkService", "LdB/a;", "h", "(Ltw/h;)LdB/a;", "", "APOLLO_FAVORITE", "Ljava/lang/String;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YA.a$a  reason: collision with other inner class name */
    public static final class C2925a {

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LYA/a$a$a;", "Ltw/a;", "<init>", "()V", "LGK/B;", "request", "", "token", "a", "(LGK/B;Ljava/lang/String;)LGK/B;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: YA.a$a$a  reason: collision with other inner class name */
        private static final class C2926a implements a {

            /* renamed from: a  reason: collision with root package name */
            private static final C2927a f117883a = new C2927a((DefaultConstructorMarker) null);

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LYA/a$a$a$a;", "", "<init>", "()V", "", "AUTHORIZATION_KEY", "Ljava/lang/String;", "X_CLIENT_ID_KEY", "X_CLIENT_ID_VALUE", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: YA.a$a$a$a  reason: collision with other inner class name */
            private static final class C2927a {
                public /* synthetic */ C2927a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C2927a() {
                }
            }

            public C15774B a(C15774B b10, String str) {
                C17542s.j(b10, "request");
                C17542s.j(str, "token");
                C15774B.a i10 = b10.i();
                return i10.e("Authorization", "Bearer " + str).e("x-client-id", "5d4f10c4-5f12-484a-87d0-8bdaae4c4396").b();
            }
        }

        public /* synthetic */ C2925a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(z zVar) {
            C17542s.j(zVar, "okHttpClient");
            return W6.b.a(new b.a().j("https://favs.oneweb.ingka.com/graphql"), zVar).a();
        }

        public final z b(p pVar, List<C15804w> list, C15804w wVar) {
            C17542s.j(pVar, "tokenInterceptor");
            C17542s.j(list, "apolloInterceptors");
            C17542s.j(wVar, "botManagerInterceptor");
            z.a aVar = new z.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z.a b10 = aVar.f(60, timeUnit).R(60, timeUnit).U(60, timeUnit).a(pVar).b(wVar);
            for (C15804w a10 : list) {
                b10.a(a10);
            }
            return b10.c();
        }

        public final C13737a c(ShoppingListDatabase shoppingListDatabase) {
            C17542s.j(shoppingListDatabase, "shoppingListDatabase");
            return shoppingListDatabase.a();
        }

        public final ShoppingListDatabase d(Context context, C13797a aVar) {
            C17542s.j(context, "context");
            C17542s.j(aVar, "clearLegacyTableCallback");
            Context applicationContext = context.getApplicationContext();
            C17542s.i(applicationContext, "getApplicationContext(...)");
            return w.a(applicationContext, ShoppingListDatabase.class, "shopping-list-db").f().a(aVar).e();
        }

        public final C13741e e(ShoppingListDatabase shoppingListDatabase) {
            C17542s.j(shoppingListDatabase, "shoppingListDatabase");
            return shoppingListDatabase.b();
        }

        public final C13750l f(ShoppingListDatabase shoppingListDatabase) {
            C17542s.j(shoppingListDatabase, "shoppingListDatabase");
            return shoppingListDatabase.c();
        }

        public final p g(C13909a aVar) {
            C17542s.j(aVar, "sessionManager");
            return new p(aVar, new C2926a());
        }

        public final C14335a h(h hVar) {
            C17542s.j(hVar, "networkService");
            return (C14335a) hVar.b(C14335a.class);
        }

        private C2925a() {
        }
    }
}
