package Tq;

import Qq.l;
import Qq.m;
import Qq.n;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LTq/a;", "", "<init>", "()V", "", "LQq/n;", "b", "Ljava/util/List;", "getTestFAQQuestionsData", "()Ljava/util/List;", "testFAQQuestionsData", "LQq/l;", "c", "LQq/l;", "a", "()LQq/l;", "testFAQData", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87745a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final List<n> f87746b;

    /* renamed from: c  reason: collision with root package name */
    private static final l f87747c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f87748d = 8;

    static {
        List<n> q10 = C16877v.q(new n("id", "Some question", "Some answer"), new n("id2", "Some question 2", "Some answer 2"));
        f87746b = q10;
        f87747c = new l(q10, new m("https://ImageUrl"));
    }

    private a() {
    }

    public final l a() {
        return f87747c;
    }
}
