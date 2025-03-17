package com.ingka.ikea.browseandsearch.browse.datalayer.impl.db;

import android.content.Context;
import androidx.room.w;
import androidx.room.x;
import jn.C11430a;
import jn.C11431b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/db/BrowseDatabase;", "Landroidx/room/x;", "<init>", "()V", "Ljn/b;", "a", "()Ljn/b;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BrowseDatabase extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final a f93343a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/db/BrowseDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/db/BrowseDatabase;", "a", "(Landroid/content/Context;)Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/db/BrowseDatabase;", "", "DATABASE_NAME", "Ljava/lang/String;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BrowseDatabase a(Context context) {
            C17542s.j(context, "context");
            return w.a(context, BrowseDatabase.class, "browse-db").c(new C11430a()).f().e();
        }

        private a() {
        }
    }

    public abstract C11431b a();
}
