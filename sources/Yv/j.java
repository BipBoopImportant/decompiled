package Yv;

import Iq.f;
import Rv.b;
import Rv.c;
import Rv.e;
import Rv.g;
import Rv.h;
import Vv.k;
import Vv.l;
import Vv.n;
import Vv.o;
import Vv.p;
import Vv.q;
import Vv.r;
import Vv.s;
import XH.C16796C;
import XH.t;
import XH.v;
import YH.X;
import Yv.i;
import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0018HB¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"LYv/j;", "LYv/i;", "LLm/a;", "benefitApplinkUriMapper", "<init>", "(LLm/a;)V", "LRv/c$a$a;", "benefit", "LYv/i$a;", "c", "(LRv/c$a$a;LdI/e;)Ljava/lang/Object;", "LRv/c$a$b;", "event", "d", "(LRv/c$a$b;)LYv/i$a;", "LRv/c$a$f;", "g", "(LRv/c$a$f;)LYv/i$a;", "LRv/c$a$c;", "e", "(LRv/c$a$c;)LYv/i$a;", "LRv/c$a$e;", "f", "(LRv/c$a$e;)LYv/i$a;", "LRv/c$a;", "a", "(LRv/c$a;LdI/e;)Ljava/lang/Object;", "LLm/a;", "b", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f41178b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f41179c = 8;

    /* renamed from: d  reason: collision with root package name */
    private static final Interaction$Component f41180d = null;

    /* renamed from: a  reason: collision with root package name */
    private final Lm.a f41181a;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0004¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000b\u001a\u00020\u0007*\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000f\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u0016\u001a\u00020\u0015*\u00020\u00052.\u0010\u0014\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00120\u0011\"\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LYv/j$a;", "", "<init>", "()V", "LVv/l;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "LYv/i$a;", "h", "(LVv/l;Lcom/ingka/ikea/analytics/Interaction$Component;)LYv/i$a;", "LRv/b;", "f", "(LRv/b;Lcom/ingka/ikea/analytics/Interaction$Component;)LYv/i$a;", "LYv/i$a$b;", "analytics", "g", "(LVv/l;LYv/i$a$b;)LYv/i$a;", "", "LXH/v;", "", "pairs", "LYv/i$a$b$b;", "i", "(Lcom/ingka/ikea/analytics/Interaction$Component;[LXH/v;)LYv/i$a$b$b;", "listId", "LYv/i$a$b$a;", "j", "(Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;)LYv/i$a$b$a;", "nothing", "Lcom/ingka/ikea/analytics/Interaction$Component;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final i.a f(Rv.b bVar, Interaction$Component interaction$Component) {
            i.a.b.C0705b bVar2 = null;
            if (interaction$Component != null) {
                bVar2 = new i.a.b.C0705b(interaction$Component, (Map) null, 2, (DefaultConstructorMarker) null);
            }
            return new i.a(bVar, (i.a.b) bVar2);
        }

        /* access modifiers changed from: private */
        public final i.a g(l lVar, i.a.b bVar) {
            return new i.a(lVar, bVar);
        }

        /* access modifiers changed from: private */
        public final i.a h(l lVar, Interaction$Component interaction$Component) {
            i.a.b.C0705b bVar = null;
            if (interaction$Component != null) {
                bVar = new i.a.b.C0705b(interaction$Component, (Map) null, 2, (DefaultConstructorMarker) null);
            }
            return new i.a(lVar, (i.a.b) bVar);
        }

        /* access modifiers changed from: private */
        public final i.a.b.C0705b i(Interaction$Component interaction$Component, v<String, ? extends Object>... vVarArr) {
            Map c10 = X.c();
            X.u(c10, vVarArr);
            return new i.a.b.C0705b(interaction$Component, X.b(c10));
        }

        /* access modifiers changed from: private */
        public final i.a.b.C0704a j(Interaction$Component interaction$Component, String str) {
            return new i.a.b.C0704a(interaction$Component, (Map) null, str, 2, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetEntryPointDestinationUseCaseImpl", f = "GetEntryPointDestinationUseCase.kt", l = {185}, m = "handleBenefitSelected")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f41182c;

        /* renamed from: d  reason: collision with root package name */
        Object f41183d;

        /* renamed from: e  reason: collision with root package name */
        Object f41184e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f41185f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j f41186g;

        /* renamed from: h  reason: collision with root package name */
        int f41187h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f41186g = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f41185f = obj;
            this.f41187h |= Integer.MIN_VALUE;
            return this.f41186g.c((c.a.C0640a) null, this);
        }
    }

    public j(Lm.a aVar) {
        C17542s.j(aVar, "benefitApplinkUriMapper");
        this.f41181a = aVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(Rv.c.a.C0640a r7, dI.C17164e<? super Yv.i.a> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Yv.j.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Yv.j$b r0 = (Yv.j.b) r0
            int r1 = r0.f41187h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f41187h = r1
            goto L_0x0018
        L_0x0013:
            Yv.j$b r0 = new Yv.j$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f41185f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f41187h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r7 = r0.f41184e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f41183d
            Rv.c$a$a r7 = (Rv.c.a.C0640a) r7
            java.lang.Object r8 = r0.f41182c
            Yv.j r8 = (Yv.j) r8
            XH.y.b(r1)
            goto L_0x0057
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003d:
            XH.y.b(r1)
            Lm.a r1 = r6.f41181a
            java.lang.String r3 = r7.b()
            com.ingka.ikea.analytics.Interaction$Component r5 = com.ingka.ikea.analytics.Interaction$Component.BENEFITS
            r0.f41182c = r6
            r0.f41183d = r7
            r0.f41184e = r8
            r0.f41187h = r4
            java.lang.Object r1 = r1.a(r3, r5, r0)
            if (r1 != r2) goto L_0x0057
            return r2
        L_0x0057:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0065
            Vv.g r8 = new Vv.g
            java.lang.String r0 = r7.c()
            r8.<init>(r0)
            goto L_0x006f
        L_0x0065:
            Vv.l$b r8 = new Vv.l$b
            java.lang.String r0 = Rv.p.a(r1)
            r1 = 0
            r8.<init>(r0, r1)
        L_0x006f:
            Yv.j$a r0 = f41178b
            com.ingka.ikea.analytics.Interaction$Component r1 = com.ingka.ikea.analytics.Interaction$Component.BENEFITS
            java.lang.String r2 = "component_value"
            java.lang.String r7 = r7.c()
            XH.v r7 = XH.C16796C.a(r2, r7)
            XH.v[] r7 = new XH.v[]{r7}
            Yv.i$a$b$b r7 = r0.i(r1, r7)
            Yv.i$a r7 = r0.g(r8, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Yv.j.c(Rv.c$a$a, dI.e):java.lang.Object");
    }

    private final i.a d(c.a.b bVar) {
        if (bVar instanceof c.a.b.C0642b) {
            return f41178b.h(n.f40517a, Interaction$Component.FAMILY_REWARDS_MENU);
        }
        if (bVar instanceof c.a.b.C0641a) {
            Iq.f b10 = ((c.a.b.C0641a) bVar).b();
            if (b10 instanceof f.a) {
                return f41178b.h(n.f40517a, Interaction$Component.FAMILY_REWARDS_MENU);
            }
            if (b10 instanceof f.b) {
                return f41178b.h(new o(((f.b) b10).a().getId()), f41180d);
            }
            if (b10 instanceof f.c) {
                return f41178b.h(new p(((f.c) b10).a().getId()), f41180d);
            }
            throw new t();
        }
        throw new t();
    }

    private final i.a e(c.a.C0643c cVar) {
        String str;
        if (cVar instanceof Rv.d) {
            return f41178b.h(new l.b(Rv.p.a(((Rv.d) cVar).a()), (DefaultConstructorMarker) null), Interaction$Component.CREATE_A_ROOM);
        }
        if (cVar instanceof e) {
            return f41178b.h(new l.b(Rv.p.a(((e) cVar).a()), (DefaultConstructorMarker) null), Interaction$Component.LATEST_ROOM);
        }
        if (cVar instanceof c.a.C0643c.C0644a) {
            c.a.C0643c.C0644a aVar = (c.a.C0643c.C0644a) cVar;
            if (aVar instanceof c.a.C0643c.C0644a.C0645a) {
                str = "latest_space";
            } else if (aVar instanceof c.a.C0643c.C0644a.b) {
                str = "saved_rooms";
            } else if (aVar instanceof c.a.C0643c.C0644a.C0646c) {
                str = "start_scan";
            } else if (aVar instanceof c.a.C0643c.C0644a.d) {
                str = "try_showroom";
            } else {
                throw new t();
            }
            a aVar2 = f41178b;
            return aVar2.g(new l.b(Rv.p.a(cVar.a()), (DefaultConstructorMarker) null), aVar2.i(Interaction$Component.KREATIV, C16796C.a("type", str)));
        }
        throw new t();
    }

    private final i.a f(c.a.e eVar) {
        if (eVar instanceof c.a.e.C0647a) {
            return f41178b.h(q.f40520a, Interaction$Component.PURCHASE_HISTORY);
        }
        if (eVar instanceof c.a.e.b) {
            c.a.e.b bVar = (c.a.e.b) eVar;
            return f41178b.h(new r(bVar.b(), bVar.c()), f41180d);
        }
        throw new t();
    }

    private final i.a g(c.a.f fVar) {
        if (fVar instanceof Rv.f) {
            return f41178b.h(Vv.t.f40524a, Interaction$Component.CREATE_A_LIST);
        }
        if (fVar instanceof h) {
            return f41178b.h(new s(((h) fVar).b()), f41180d);
        }
        if (fVar instanceof Rv.i) {
            return f41178b.h(Vv.t.f40524a, Interaction$Component.SHOPPING_LISTS);
        }
        if (fVar instanceof g) {
            return f41178b.h(new s(((g) fVar).b()), Interaction$Component.LATEST_LIST);
        }
        throw new t();
    }

    public Object a(c.a aVar, C17164e<? super i.a> eVar) {
        if (aVar == c.a.g.About) {
            return f41178b.h(l.h.About, Interaction$Component.ABOUT);
        }
        if (aVar == c.a.g.Addresses) {
            return f41178b.h(l.h.Addresses, Interaction$Component.ADDRESSES);
        }
        if (aVar == c.a.g.BookAppointment) {
            return f41178b.h(Vv.j.f40505a, Interaction$Component.BOOK_APPOINTMENT_START);
        }
        if (aVar == c.a.g.ChangePassword) {
            return f41178b.h(l.h.ChangePassword, Interaction$Component.CHANGE_PASSWORD);
        }
        if (aVar == c.a.g.CommunicationPreferences) {
            return f41178b.h(l.h.CommunicationPreferences, Interaction$Component.COMMUNICATION_PREFERENCES);
        }
        if (aVar == c.a.g.CustomerSupport) {
            return f41178b.h(l.h.CustomerSupport, Interaction$Component.CONTACT_IKEA);
        }
        if (aVar == c.a.g.DataPreferences) {
            return f41178b.h(l.h.DataPreferences, Interaction$Component.DATA_PREFERENCES);
        }
        if (aVar == c.a.g.DeleteAccount) {
            return f41178b.h(l.h.DeleteAccount, Interaction$Component.DELETE_ACCOUNT);
        }
        if (aVar == c.a.g.DelightContent) {
            a aVar2 = f41178b;
            return aVar2.g(Vv.h.f40503a, aVar2.i(Interaction$Component.HIDDEN_BENEFIT, C16796C.a("component_value", "frakta")));
        } else if (aVar == c.a.g.FamilyCardToolbar) {
            return f41178b.h(l.h.FamilyCard, Interaction$Component.FAMILY_CARD_ICON);
        } else {
            if (aVar == c.a.g.GiftCard) {
                return f41178b.h(l.h.GiftCards, Interaction$Component.GIFT_AND_REFUND_CARDS);
            }
            if (aVar == c.a.g.HomeProjects) {
                return f41178b.h(l.h.HomeProjects, f41180d);
            }
            if (aVar == c.a.g.Inbox) {
                return f41178b.h(l.h.Inbox, Interaction$Component.INBOX_OPEN_NOTIFICATION_BELL);
            }
            if (aVar == c.a.g.Kreativ) {
                return f41178b.h(l.h.Kreativ, Interaction$Component.KREATIV);
            }
            if (aVar == c.a.g.Language) {
                return f41178b.h(l.h.Language, Interaction$Component.LANGUAGE_AND_REGION);
            }
            if (aVar == c.a.g.Login) {
                return f41178b.h(l.h.Login, Interaction$Component.LOGIN_BUTTON);
            }
            if (aVar == c.a.g.Logout) {
                return f41178b.f(b.a.f39759a, Interaction$Component.LOG_OUT_BUTTON);
            }
            if (aVar == c.a.g.MemberDiscounts) {
                a aVar3 = f41178b;
                return aVar3.g(l.h.MemberDiscounts, aVar3.j(Interaction$Component.CAROUSEL_MEMBER_DISCOUNTS, "member_discounts"));
            } else if (aVar == c.a.g.PolicesAndToC) {
                return f41178b.h(l.h.PolicesAndToC, Interaction$Component.POLICIES);
            } else {
                if (aVar == c.a.g.PreferredStoreLocal) {
                    return f41178b.h(new l.f(false), Interaction$Component.PREFERRED_STORE);
                }
                if (aVar == c.a.g.PreferredStoreProfile) {
                    return f41178b.h(new l.f(true), Interaction$Component.PREFERRED_STORE);
                }
                if (aVar == c.a.g.ProfileDetails) {
                    return f41178b.h(l.h.ProfileDetails, Interaction$Component.PERSONAL_DETAILS);
                }
                if (aVar == c.a.g.Signup) {
                    return f41178b.h(l.h.Signup, Interaction$Component.SIGN_UP_BUTTON);
                }
                if (aVar == c.a.g.TakeATour) {
                    return f41178b.h(Vv.i.f40504a, Interaction$Component.TAKE_A_TOUR);
                }
                if (aVar == c.a.g.Theme) {
                    return f41178b.h(l.h.Theme, f41180d);
                }
                if (aVar == c.a.g.Upgrade) {
                    return f41178b.h(l.h.Upgrade, Interaction$Component.UPGRADE_FAMILY);
                }
                if (aVar == c.a.g.Wallet) {
                    return f41178b.h(l.h.Wallet, Interaction$Component.IKEA_WALLET);
                }
                if (aVar instanceof c.a.d) {
                    c.a.d dVar = (c.a.d) aVar;
                    return f41178b.h(new k(dVar.c(), dVar.b()), Interaction$Component.BOOK_APPOINTMENT_VIEWED);
                } else if (aVar instanceof c.a.C0640a) {
                    Object c10 = c((c.a.C0640a) aVar, eVar);
                    return c10 == C17187b.f() ? c10 : (i.a) c10;
                } else if (aVar instanceof c.a.b) {
                    return d((c.a.b) aVar);
                } else {
                    if (aVar instanceof c.a.C0643c) {
                        return e((c.a.C0643c) aVar);
                    }
                    if (aVar instanceof c.a.e) {
                        return f((c.a.e) aVar);
                    }
                    if (aVar instanceof c.a.f) {
                        return g((c.a.f) aVar);
                    }
                    throw new t();
                }
            }
        }
    }
}
