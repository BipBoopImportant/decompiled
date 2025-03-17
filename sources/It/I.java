package It;

import EB.C12831c;
import EB.C12832d;
import FB.C12860a;
import FB.C12863d;
import GJ.C15768k;
import Gt.a;
import HJ.C15854t;
import Ht.c;
import IB.C13018a;
import IC.C13026h;
import It.A;
import It.B;
import It.C;
import It.C10749l;
import It.C10751n;
import It.C10752o;
import It.q;
import It.t;
import It.v;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15990f;
import Nd.c;
import Op.c1;
import Pt.a;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16505B;
import TJ.C16511H;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Wt.a;
import XH.C16796C;
import XH.C16807N;
import XH.x;
import YH.C16877v;
import YH.X;
import aA.C13909a;
import androidx.lifecycle.U;
import androidx.lifecycle.g0;
import ax.C13990b;
import ax.C13991c;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.instore.impl.navigation.InstoreRoutes$StorePage;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ft.C11285c;
import gC.C14509b;
import is.C11414a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jt.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import lD.C14763e;
import lu.C11569b;
import nI.C17642l;
import nt.C11674a;
import nu.e;
import ou.C11717a;
import ou.b;
import pu.C11778b;
import qu.C11817a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import ru.d;
import su.C11891a;
import tt.C11991a;
import vB.C15129b;
import vB.C15130c;
import x4.O;
import zt.C12554a;

@Metadata(d1 = {"\u0000\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 ö\u00012\u00020\u0001:\u0002÷\u0001B¹\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u000202H\u0007¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u0002022\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u000202H\u0002¢\u0006\u0004\b;\u00106J\u001f\u0010@\u001a\u0002022\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u0002022\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u0002022\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u0002022\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u0002022\u0006\u0010N\u001a\u00020>H\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010T\u001a\u00020S2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bT\u0010UJ\u001f\u0010X\u001a\u0002022\u0006\u0010W\u001a\u00020V2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bX\u0010YJ\u0019\u0010\\\u001a\u0002022\b\u0010[\u001a\u0004\u0018\u00010ZH\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010`\u001a\u0002022\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010d\u001a\u0002022\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010h\u001a\u0002022\u0006\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bh\u0010iJ\u0019\u0010l\u001a\u0002022\b\u0010k\u001a\u0004\u0018\u00010jH\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u0002022\u0006\u0010n\u001a\u00020QH\u0002¢\u0006\u0004\bo\u0010pJ\u0019\u0010s\u001a\u0002022\b\u0010r\u001a\u0004\u0018\u00010qH\u0002¢\u0006\u0004\bs\u0010tJ\u0019\u0010u\u001a\u0002022\b\u0010[\u001a\u0004\u0018\u00010ZH\u0002¢\u0006\u0004\bu\u0010]J\u0017\u0010x\u001a\u0002022\u0006\u0010w\u001a\u00020vH\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010|\u001a\u0002022\u0006\u0010{\u001a\u00020zH\u0002¢\u0006\u0004\b|\u0010}J\u000f\u0010~\u001a\u000202H\u0002¢\u0006\u0004\b~\u00106J\u001b\u0010\u0001\u001a\u0002022\u0007\u0010\u0001\u001a\u00020H\u0002¢\u0006\u0006\b\u0001\u0010\u0001JE\u0010\u0001\u001a\u0002022\u0006\u0010n\u001a\u00020Q2\u0007\u0010\u0001\u001a\u00020Q2\u0007\u0010\u0001\u001a\u00020>2\u000f\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u00012\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u0002022\u0007\u0010\u0001\u001a\u00020>H\u0002¢\u0006\u0005\b\u0001\u0010PJ\u0011\u0010\u0001\u001a\u000202H\u0002¢\u0006\u0005\b\u0001\u00106J\u001b\u0010\u0001\u001a\u0002022\b\u0010r\u001a\u0004\u0018\u00010qH\u0002¢\u0006\u0005\b\u0001\u0010tJ\u0011\u0010\u0001\u001a\u000202H\u0002¢\u0006\u0005\b\u0001\u00106J\u0011\u0010\u0001\u001a\u000202H\u0002¢\u0006\u0005\b\u0001\u00106J\u0011\u0010\u0001\u001a\u000202H\u0002¢\u0006\u0005\b\u0001\u00106J\u001b\u0010\u0001\u001a\u0002022\u0007\u0010c\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u000202H\u0002¢\u0006\u0005\b\u0001\u00106J\u001b\u0010\u0001\u001a\u0002022\b\u00108\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0005\b\u0001\u0010pJ%\u0010\u0001\u001a\u0002022\u0006\u0010n\u001a\u00020Q2\t\u0010\u0001\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u000202H\u0002¢\u0006\u0005\b\u0001\u00106J9\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010\u0001*\u00030\u0001*\t\u0012\u0004\u0012\u00028\u00000\u00012\u0007\u0010\u0001\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0001\u0010\u0001JF\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010\u0001*\u00030\u0001*\t\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010 \u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020>0\u0001H\u0002¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0011\u0010£\u0001\u001a\u000202H\u0002¢\u0006\u0005\b£\u0001\u00106R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010­\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0007\n\u0005\b3\u0010È\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0016\u0010+\u001a\u00020*8\u0002X\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0016\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u001e\u0010=\u001a\n\u0012\u0005\u0012\u00030Ð\u00010Ï\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u001f\u0010Õ\u0001\u001a\n\u0012\u0005\u0012\u00030Ó\u00010Ï\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Ò\u0001R\u001e\u0010Ù\u0001\u001a\t\u0012\u0004\u0012\u0002020Ö\u00018\u0002X\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R\u0018\u0010Ý\u0001\u001a\u00030Ú\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u0019\u0010à\u0001\u001a\u00020>8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R'\u0010ç\u0001\u001a\n\u0012\u0005\u0012\u00030â\u00010á\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001R!\u0010ê\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010è\u00010Ï\u00018\u0002X\u0004¢\u0006\b\n\u0006\bé\u0001\u0010Ò\u0001R)\u0010ì\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010è\u00010á\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\bë\u0001\u0010ä\u0001\u001a\u0006\bÄ\u0001\u0010æ\u0001R!\u0010ï\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010í\u00010Ï\u00018\u0002X\u0004¢\u0006\b\n\u0006\bî\u0001\u0010Ò\u0001R)\u0010ñ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010í\u00010á\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\bð\u0001\u0010ä\u0001\u001a\u0006\bÆ\u0001\u0010æ\u0001R\u0017\u0010ô\u0001\u001a\u00020Q8BX\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010ó\u0001R\u0019\u0010\u0001\u001a\u0004\u0018\u00010Q8BX\u0004¢\u0006\b\u001a\u0006\bõ\u0001\u0010ó\u0001¨\u0006ø\u0001"}, d2 = {"LIt/I;", "LIt/D;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lnu/e;", "getSelectedStoreUseCase", "LlD/e;", "getUserInfoUseCase", "LvB/c;", "getShoppingListsCarouselUseCase", "Lis/a;", "inboxIntegration", "Ltt/a;", "analytics", "LPt/a;", "storeEventsAnalytics", "LgC/b;", "openingHoursLabelMapper", "LFB/a;", "localStoreSelectionRepository", "LFB/d;", "storeRepository", "Lax/c;", "popularTimesLiveDataMapper", "Lax/b;", "popularTimesIntegration", "LNd/c;", "abTesting", "LFt/e;", "storeEventReminderTimeSlotMapper", "Lru/d;", "wayfindingMapPreloader", "LaA/a;", "sessionManager", "LWt/a;", "storeEventMapper", "Lnu/n;", "updateStoreUseCase", "Lnu/m;", "storeModeOrchestrator", "LRy/f;", "scanAndGoCartRepositoryFactory", "Lft/c;", "storePageRepository", "Lsu/a;", "wayfindingAnalytics", "<init>", "(Landroidx/lifecycle/U;Lnu/e;LlD/e;LvB/c;Lis/a;Ltt/a;LPt/a;LgC/b;LFB/a;LFB/d;Lax/c;Lax/b;LNd/c;LFt/e;Lru/d;LaA/a;LWt/a;Lnu/n;Lnu/m;LRy/f;Lft/c;Lsu/a;)V", "LIt/l;", "analyticsAction", "LXH/N;", "E", "(LIt/l;)V", "f1", "()V", "LIt/q;", "action", "U0", "(LIt/q;)V", "G0", "Lnu/e$a;", "storeData", "", "isStoreModeEnabled", "Y0", "(Lnu/e$a;Z)V", "LkD/o;", "userInfo", "a1", "(LkD/o;)V", "LvB/b;", "carouselShoppingListState", "X0", "(LvB/b;)V", "LEs/a;", "inboxState", "V0", "(LEs/a;)V", "enabled", "W0", "(Z)V", "", "currentStoreId", "LQJ/F0;", "r0", "(Ljava/lang/String;)LQJ/F0;", "Lnu/e$a$h;", "events", "y0", "(Lnu/e$a$h;Z)V", "Lzt/a;", "foodMobileData", "p0", "(Lzt/a;)V", "Lnu/e$a$i;", "storeOffers", "A0", "(Lnu/e$a$i;)V", "Lnu/e$a$g;", "benefit", "w0", "(Lnu/e$a$g;)V", "Lnu/e$a$e;", "smallStore", "u0", "(Lnu/e$a$e;)V", "LGB/e;", "popularTimesLiveData", "s0", "(LGB/e;)V", "storeId", "t0", "(Ljava/lang/String;)V", "LGt/g;", "wayfindingData", "C0", "(LGt/g;)V", "q0", "LOp/c1;", "event", "T0", "(LOp/c1;)V", "LGt/b;", "type", "R0", "(LGt/b;)V", "E0", "", "error", "Z0", "(Ljava/lang/Throwable;)V", "storeName", "isShopGoAvailable", "", "LIB/a$a$a;", "openingHours", "k1", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Z)V", "loading", "i1", "F0", "d1", "S0", "D0", "g1", "LMt/a;", "O0", "(LMt/a;)V", "P0", "Q0", "productId", "c1", "(Ljava/lang/String;Ljava/lang/String;)V", "b1", "", "T", "item", "j1", "(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", "Lkotlin/Function1;", "predicate", "e1", "(Ljava/util/List;LnI/l;)Ljava/util/List;", "h1", "m", "Landroidx/lifecycle/U;", "n", "Lnu/e;", "o", "LlD/e;", "p", "LvB/c;", "q", "Lis/a;", "r", "Ltt/a;", "s", "LPt/a;", "t", "LgC/b;", "u", "LFB/a;", "v", "LFB/d;", "w", "Lax/c;", "x", "Lax/b;", "y", "LNd/c;", "z", "LFt/e;", "A", "Lru/d;", "B", "LaA/a;", "C", "LWt/a;", "D", "Lnu/n;", "Lnu/m;", "F", "LRy/f;", "G", "Lft/c;", "H", "Lsu/a;", "LTJ/B;", "LIt/z;", "I", "LTJ/B;", "LIt/y;", "J", "_state", "LTJ/A;", "K", "LTJ/A;", "retryFlow", "Lcom/ingka/ikea/instore/impl/navigation/InstoreRoutes$StorePage;", "L", "Lcom/ingka/ikea/instore/impl/navigation/InstoreRoutes$StorePage;", "route", "M", "Z", "waitForStoreModeToBeEnabledAfterStoreIsChanged", "LTJ/P;", "LIt/B;", "N", "LTJ/P;", "getState", "()LTJ/P;", "state", "LIt/t;", "O", "_oneTimeEffect", "P", "oneTimeEffect", "LIt/x;", "Q", "_showChangeToNearbyStorePrompt", "R", "showChangeToNearbyStorePrompt", "M0", "()Ljava/lang/String;", "deeplinkAction", "N0", "S", "a", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class I extends D {

    /* renamed from: S  reason: collision with root package name */
    public static final C10734a f82125S = new C10734a((DefaultConstructorMarker) null);

    /* renamed from: T  reason: collision with root package name */
    public static final int f82126T = 8;
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final d f82127A;

    /* renamed from: B  reason: collision with root package name */
    private final C13909a f82128B;

    /* renamed from: C  reason: collision with root package name */
    private final a f82129C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final nu.n f82130D;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public final nu.m f82131E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final Ry.f f82132F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public final C11285c f82133G;

    /* renamed from: H  reason: collision with root package name */
    private final C11891a f82134H;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public final C16505B<z> f82135I;
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public final C16505B<y> f82136J;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public final C16504A<C16807N> f82137K = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);

    /* renamed from: L  reason: collision with root package name */
    private final InstoreRoutes$StorePage f82138L;
    /* access modifiers changed from: private */

    /* renamed from: M  reason: collision with root package name */
    public boolean f82139M;

    /* renamed from: N  reason: collision with root package name */
    private final C16519P<B> f82140N;
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public final C16505B<t> f82141O;

    /* renamed from: P  reason: collision with root package name */
    private final C16519P<t> f82142P;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public final C16505B<x> f82143Q;

    /* renamed from: R  reason: collision with root package name */
    private final C16519P<x> f82144R;

    /* renamed from: m  reason: collision with root package name */
    private final U f82145m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final nu.e f82146n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C14763e f82147o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C15130c f82148p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C11414a f82149q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C11991a f82150r;

    /* renamed from: s  reason: collision with root package name */
    private final Pt.a f82151s;

    /* renamed from: t  reason: collision with root package name */
    private final C14509b f82152t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C12860a f82153u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C12863d f82154v;

    /* renamed from: w  reason: collision with root package name */
    private final C13991c f82155w;

    /* renamed from: x  reason: collision with root package name */
    private final C13990b f82156x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final c f82157y;

    /* renamed from: z  reason: collision with root package name */
    private final Ft.e f82158z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$retry$1", f = "InstoreViewModel.kt", l = {684}, m = "invokeSuspend")
    static final class A extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82159c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I f82160d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        A(I i10, C17164e<? super A> eVar) {
            super(2, eVar);
            this.f82160d = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new A(this.f82160d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((A) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f82159c;
            if (i10 == 0) {
                XH.y.b(obj);
                this.f82160d.E0();
                C16504A X10 = this.f82160d.f82137K;
                C16807N n10 = C16807N.f139792a;
                this.f82159c = 1;
                if (X10.emit(n10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LIt/y;", "state", "LIt/z;", "storeData", "", "storeModeEnabled", "LIt/B;", "<anonymous>", "(LIt/y;LIt/z;Z)LIt/B;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$state$1", f = "InstoreViewModel.kt", l = {}, m = "invokeSuspend")
    static final class B extends kotlin.coroutines.jvm.internal.l implements nI.r<y, z, Boolean, C17164e<? super B>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82161c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f82162d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f82163e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f82164f;

        B(C17164e<? super B> eVar) {
            super(4, eVar);
        }

        public final Object i(y yVar, z zVar, boolean z10, C17164e<? super B> eVar) {
            B b10 = new B(eVar);
            b10.f82162d = yVar;
            b10.f82163e = zVar;
            b10.f82164f = z10;
            return b10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f82161c == 0) {
                XH.y.b(obj);
                y yVar = (y) this.f82162d;
                z zVar = (z) this.f82163e;
                boolean z10 = this.f82164f;
                C10751n d10 = yVar.d();
                if (d10 instanceof C10751n.a) {
                    return B.a.f82058a;
                }
                if (d10 instanceof C10751n.b) {
                    return new B.b(((C10751n.b) yVar.d()).d(), ((C10751n.b) yVar.d()).c());
                }
                if (d10 instanceof C10751n.c) {
                    return B.c.b(Ft.g.a(z10, ((C10751n.c) yVar.d()).a(), zVar, yVar.e(), yVar.f(), yVar.c(), yVar.h()), (String) null, (C10750m) null, (C15987c) null, (p) null, (w) null, false, (Throwable) null, (C15987c) null, yVar.g(), yVar.i(), 255, (Object) null);
                }
                throw new XH.t();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((y) obj, (z) obj2, ((Boolean) obj3).booleanValue(), (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpu/b;", "it", "LXH/N;", "<anonymous>", "(Lpu/b;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$trackABTestForStoreMode$1", f = "InstoreViewModel.kt", l = {}, m = "invokeSuspend")
    static final class C extends kotlin.coroutines.jvm.internal.l implements nI.p<C11778b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82165c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I f82166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C(I i10, C17164e<? super C> eVar) {
            super(2, eVar);
            this.f82166d = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C(this.f82166d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C11778b bVar, C17164e<? super C16807N> eVar) {
            return ((C) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f82165c == 0) {
                XH.y.b(obj);
                c.a.a(this.f82166d.f82157y, "store_page_open_in_store", (Map) null, (Map) null, 6, (Object) null);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$trackStoreBenefitInterest$1", f = "InstoreViewModel.kt", l = {1331}, m = "invokeSuspend")
    static final class D extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82167c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I f82168d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        D(I i10, C17164e<? super D> eVar) {
            super(2, eVar);
            this.f82168d = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new D(this.f82168d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((D) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f82167c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<Boolean> isEnabled = this.f82168d.f82131E.d().isEnabled();
                this.f82167c = 1;
                obj = C16534i.B(isEnabled, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                c.a.a(this.f82168d.f82157y, "store_page_benefit_while_in_store", (Map) null, (Map) null, 6, (Object) null);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LIt/I$a;", "", "<init>", "()V", "", "MAX_STORE_NAMES_FOR_STORE_SELECTOR", "I", "MAX_EVENTS_IN_CAROUSEL", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: It.I$a  reason: case insensitive filesystem */
    public static final class C10734a {
        public /* synthetic */ C10734a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10734a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: It.I$b  reason: case insensitive filesystem */
    public /* synthetic */ class C10735b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f82169a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                Gt.b[] r0 = Gt.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Gt.b r1 = Gt.b.INBOX     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Gt.b r1 = Gt.b.FAMILY_CARD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Gt.b r1 = Gt.b.CHANGE_STORE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Gt.b r1 = Gt.b.OVERFLOW_MENU     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f82169a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: It.I.C10735b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$addMarketStoreNames$1", f = "InstoreViewModel.kt", l = {367}, m = "invokeSuspend")
    /* renamed from: It.I$c  reason: case insensitive filesystem */
    static final class C10736c extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f82170c;

        /* renamed from: d  reason: collision with root package name */
        Object f82171d;

        /* renamed from: e  reason: collision with root package name */
        Object f82172e;

        /* renamed from: f  reason: collision with root package name */
        int f82173f;

        /* renamed from: g  reason: collision with root package name */
        int f82174g;

        /* renamed from: h  reason: collision with root package name */
        int f82175h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f82176i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ I f82177j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f82178k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10736c(I i10, String str, C17164e<? super C10736c> eVar) {
            super(2, eVar);
            this.f82177j = i10;
            this.f82178k = str;
        }

        /* access modifiers changed from: private */
        public static final boolean k(String str, C12831c cVar) {
            return C17542s.e(cVar.g(), str);
        }

        /* access modifiers changed from: private */
        public static final String m(C12831c cVar) {
            return cVar.h();
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C10736c cVar = new C10736c(this.f82177j, this.f82178k, eVar);
            cVar.f82176i = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C10736c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object value;
            z zVar;
            Object value2;
            z zVar2;
            Object f10 = C17187b.f();
            int i10 = this.f82175h;
            if (i10 == 0) {
                XH.y.b(obj);
                Q q10 = (Q) this.f82176i;
                I i11 = this.f82177j;
                x.a aVar = XH.x.f139812b;
                C12863d c02 = i11.f82154v;
                this.f82176i = q10;
                this.f82170c = q10;
                this.f82171d = i11;
                this.f82172e = q10;
                this.f82173f = 0;
                this.f82174g = 0;
                this.f82175h = 1;
                obj = c02.c(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Q q11 = (Q) this.f82172e;
                I i12 = (I) this.f82171d;
                Q q12 = (Q) this.f82170c;
                Q q13 = (Q) this.f82176i;
                try {
                    XH.y.b(obj);
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th2) {
                    x.a aVar2 = XH.x.f139812b;
                    obj2 = XH.x.b(XH.y.a(th2));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = XH.x.b((List) obj);
            I i13 = this.f82177j;
            String str = this.f82178k;
            if (XH.x.h(obj2)) {
                List a02 = C15768k.a0(C15768k.X(C15768k.w(C15768k.S(C15768k.I(C16877v.h0((List) obj2), new J(str)), new K())), 4));
                C16505B Z10 = i13.f82135I;
                do {
                    value2 = Z10.getValue();
                    zVar2 = (z) value2;
                } while (!Z10.e(value2, z.b(zVar2, (Gt.d) null, i13.j1(zVar2.c(), new A.a(a02)), (List) null, (Throwable) null, false, 29, (Object) null)));
            }
            I i14 = this.f82177j;
            if (XH.x.e(obj2) != null) {
                C16505B Z11 = i14.f82135I;
                do {
                    value = Z11.getValue();
                    zVar = (z) value;
                } while (!Z11.e(value, z.b(zVar, (Gt.d) null, i14.j1(zVar.c(), new A.a(C16877v.n())), (List) null, (Throwable) null, false, 29, (Object) null)));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "enabled", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$addPopularTimesShortcut$1", f = "InstoreViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: It.I$d  reason: case insensitive filesystem */
    static final class C10737d extends kotlin.coroutines.jvm.internal.l implements nI.p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82179c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f82180d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ I f82181e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f82182f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10737d(I i10, String str, C17164e<? super C10737d> eVar) {
            super(2, eVar);
            this.f82181e = i10;
            this.f82182f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C10737d dVar = new C10737d(this.f82181e, this.f82182f, eVar);
            dVar.f82180d = ((Boolean) obj).booleanValue();
            return dVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((C10737d) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            z zVar;
            C17187b.f();
            if (this.f82179c == 0) {
                XH.y.b(obj);
                if (this.f82180d) {
                    C16505B Z10 = this.f82181e.f82135I;
                    I i10 = this.f82181e;
                    String str = this.f82182f;
                    do {
                        value = Z10.getValue();
                        zVar = (z) value;
                    } while (!Z10.e(value, z.b(zVar, (Gt.d) null, (List) null, i10.j1(zVar.f(), new C.d(str)), (Throwable) null, false, 27, (Object) null)));
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C16532g<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f82183a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f82184a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$checkIfNearbyStoreDialogShouldBeShown$$inlined$filterIsInstance$1$2", f = "InstoreViewModel.kt", l = {50}, m = "emit")
            /* renamed from: It.I$e$a$a  reason: collision with other inner class name */
            public static final class C1610a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f82185c;

                /* renamed from: d  reason: collision with root package name */
                int f82186d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f82187e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1610a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f82187e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f82185c = obj;
                    this.f82186d |= Integer.MIN_VALUE;
                    return this.f82187e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f82184a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof It.I.e.a.C1610a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    It.I$e$a$a r0 = (It.I.e.a.C1610a) r0
                    int r1 = r0.f82186d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f82186d = r1
                    goto L_0x0018
                L_0x0013:
                    It.I$e$a$a r0 = new It.I$e$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f82185c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f82186d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0043
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f82184a
                    boolean r2 = r5 instanceof It.B.c
                    if (r2 == 0) goto L_0x0043
                    r0.f82186d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0043
                    return r1
                L_0x0043:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: It.I.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar) {
            this.f82183a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f82183a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIt/B$c;", "state", "LXH/N;", "<anonymous>", "(LIt/B$c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$checkIfNearbyStoreDialogShouldBeShown$1", f = "InstoreViewModel.kt", l = {1170, 1172, 1174, 1180}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<B.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f82188c;

        /* renamed from: d  reason: collision with root package name */
        Object f82189d;

        /* renamed from: e  reason: collision with root package name */
        Object f82190e;

        /* renamed from: f  reason: collision with root package name */
        Object f82191f;

        /* renamed from: g  reason: collision with root package name */
        Object f82192g;

        /* renamed from: h  reason: collision with root package name */
        boolean f82193h;

        /* renamed from: i  reason: collision with root package name */
        boolean f82194i;

        /* renamed from: j  reason: collision with root package name */
        boolean f82195j;

        /* renamed from: k  reason: collision with root package name */
        int f82196k;

        /* renamed from: l  reason: collision with root package name */
        int f82197l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f82198m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ I f82199n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(I i10, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f82199n = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f82199n, eVar);
            fVar.f82198m = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(B.c cVar, C17164e<? super C16807N> eVar) {
            return ((f) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: It.B$c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00c2 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00cf  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0136  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0139  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f82197l
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r6) goto L_0x0056
                if (r1 == r5) goto L_0x004c
                if (r1 == r4) goto L_0x003a
                if (r1 != r3) goto L_0x0032
                java.lang.Object r0 = r12.f82192g
                Ry.e r0 = (Ry.e) r0
                java.lang.Object r0 = r12.f82191f
                pu.b r0 = (pu.C11778b) r0
                java.lang.Object r0 = r12.f82190e
                It.I r0 = (It.I) r0
                java.lang.Object r1 = r12.f82189d
                pu.b r1 = (pu.C11778b) r1
                java.lang.Object r1 = r12.f82188c
                pu.b r1 = (pu.C11778b) r1
                java.lang.Object r3 = r12.f82198m
                It.B$c r3 = (It.B.c) r3
                XH.y.b(r13)
                goto L_0x010d
            L_0x0032:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x003a:
                boolean r1 = r12.f82193h
                java.lang.Object r4 = r12.f82188c
                pu.b r4 = (pu.C11778b) r4
                java.lang.Object r5 = r12.f82198m
                It.B$c r5 = (It.B.c) r5
                XH.y.b(r13)
                r11 = r4
                r4 = r1
                r1 = r11
                goto L_0x00c7
            L_0x004c:
                boolean r1 = r12.f82193h
                java.lang.Object r5 = r12.f82198m
                It.B$c r5 = (It.B.c) r5
                XH.y.b(r13)
                goto L_0x00a4
            L_0x0056:
                java.lang.Object r1 = r12.f82198m
                It.B$c r1 = (It.B.c) r1
                XH.y.b(r13)
                goto L_0x007f
            L_0x005e:
                XH.y.b(r13)
                java.lang.Object r13 = r12.f82198m
                r1 = r13
                It.B$c r1 = (It.B.c) r1
                It.I r13 = r12.f82199n
                nu.m r13 = r13.f82131E
                nt.a r13 = r13.e()
                TJ.g r13 = r13.a()
                r12.f82198m = r1
                r12.f82197l = r6
                java.lang.Object r13 = TJ.C16534i.B(r13, r12)
                if (r13 != r0) goto L_0x007f
                return r0
            L_0x007f:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                It.I r7 = r12.f82199n
                nu.m r7 = r7.f82131E
                pu.a r7 = r7.f()
                TJ.g r7 = r7.c()
                r12.f82198m = r1
                r12.f82193h = r13
                r12.f82197l = r5
                java.lang.Object r5 = TJ.C16534i.B(r7, r12)
                if (r5 != r0) goto L_0x00a0
                return r0
            L_0x00a0:
                r11 = r1
                r1 = r13
                r13 = r5
                r5 = r11
            L_0x00a4:
                pu.b r13 = (pu.C11778b) r13
                It.I r7 = r12.f82199n
                nu.m r7 = r7.f82131E
                nt.a r7 = r7.e()
                TJ.g r7 = r7.b()
                r12.f82198m = r5
                r12.f82188c = r13
                r12.f82193h = r1
                r12.f82197l = r4
                java.lang.Object r4 = TJ.C16534i.B(r7, r12)
                if (r4 != r0) goto L_0x00c3
                return r0
            L_0x00c3:
                r11 = r1
                r1 = r13
                r13 = r4
                r4 = r11
            L_0x00c7:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r1 == 0) goto L_0x013e
                It.I r7 = r12.f82199n
                java.lang.String r8 = r1.a()
                java.lang.String r9 = r5.k()
                boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
                if (r13 != 0) goto L_0x013e
                if (r4 != 0) goto L_0x013e
                if (r8 != 0) goto L_0x013e
                Ry.f r9 = r7.f82132F
                Ry.e r9 = r9.invoke()
                TJ.g r10 = r9.a()
                r12.f82198m = r5
                r12.f82188c = r1
                r12.f82189d = r1
                r12.f82190e = r7
                r12.f82191f = r1
                r12.f82192g = r9
                r12.f82193h = r4
                r12.f82194i = r13
                r12.f82196k = r2
                r12.f82195j = r8
                r12.f82197l = r3
                java.lang.Object r13 = TJ.C16534i.B(r10, r12)
                if (r13 != r0) goto L_0x010c
                return r0
            L_0x010c:
                r0 = r7
            L_0x010d:
                java.lang.Number r13 = (java.lang.Number) r13
                int r13 = r13.intValue()
                if (r13 <= 0) goto L_0x0116
                r2 = r6
            L_0x0116:
                TJ.B r13 = r0.f82143Q
            L_0x011a:
                java.lang.Object r3 = r13.getValue()
                r4 = r3
                It.x r4 = (It.x) r4
                It.x r4 = new It.x
                r4.<init>(r1, r2)
                boolean r3 = r13.e(r3, r4)
                if (r3 == 0) goto L_0x011a
                nu.m r13 = r0.f82131E
                qu.a r13 = r13.c()
                if (r2 == 0) goto L_0x0139
                qu.a$b r0 = qu.C11817a.b.CHANGE_STORE_CLEAR_SCAN_AND_GO
                goto L_0x013b
            L_0x0139:
                qu.a$b r0 = qu.C11817a.b.CHANGE_STORE
            L_0x013b:
                r13.f(r0)
            L_0x013e:
                XH.N r13 = XH.C16807N.f139792a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: It.I.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$collectStates$$inlined$flatMapLatest$1", f = "InstoreViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class g extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super Object>, C16807N, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82200c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f82201d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f82202e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ I f82203f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17164e eVar, I i10) {
            super(3, eVar);
            this.f82203f = i10;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super Object> hVar, C16807N n10, C17164e<? super C16807N> eVar) {
            g gVar = new g(eVar, this.f82203f);
            gVar.f82201d = hVar;
            gVar.f82202e = n10;
            return gVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f82200c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16807N n10 = (C16807N) this.f82202e;
                C16532g P10 = C16534i.P(C16534i.g0(C16534i.s(this.f82203f.f82131E.d().isEnabled()), new o((C17164e) null, this.f82203f)), b.b(C16534i.R(C16534i.s(this.f82203f.f82147o.invoke()), new k(this.f82203f)), (nI.p) null, 1, (Object) null), b.b(C16534i.R(C16534i.s(this.f82203f.f82149q.getState()), new l(this.f82203f)), (nI.p) null, 1, (Object) null), b.b(C16534i.R(C16534i.s(this.f82203f.f82148p.a(true)), new m(this.f82203f)), (nI.p) null, 1, (Object) null), b.b(C16534i.R(C16534i.s(new p(C16534i.A(this.f82203f.f82153u.b()))), new n(this.f82203f)), (nI.p) null, 1, (Object) null));
                this.f82200c = 1;
                if (C16534i.x((C16533h) this.f82201d, P10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$collectStates$1", f = "InstoreViewModel.kt", l = {205}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements nI.p<C16533h<? super C16807N>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82204c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f82205d;

        h(C17164e<? super h> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(eVar);
            hVar.f82205d = obj;
            return hVar;
        }

        public final Object invoke(C16533h<? super C16807N> hVar, C17164e<? super C16807N> eVar) {
            return ((h) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f82204c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16533h hVar = (C16533h) this.f82205d;
                C16807N n10 = C16807N.f139792a;
                this.f82205d = hVar;
                this.f82204c = 1;
                if (hVar.emit(n10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f82205d;
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/e$a;", "it", "LXH/N;", "<anonymous>", "(Lnu/e$a;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$collectStates$2$1$1", f = "InstoreViewModel.kt", l = {}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<e.a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82206c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f82207d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ I f82208e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f82209f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(I i10, boolean z10, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f82208e = i10;
            this.f82209f = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            i iVar = new i(this.f82208e, this.f82209f, eVar);
            iVar.f82207d = obj;
            return iVar;
        }

        /* renamed from: i */
        public final Object invoke(e.a aVar, C17164e<? super C16807N> eVar) {
            return ((i) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f82206c == 0) {
                XH.y.b(obj);
                e.a aVar = (e.a) this.f82207d;
                if (!this.f82208e.f82139M) {
                    this.f82208e.Y0(aVar, this.f82209f);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class j extends C17525a implements nI.p<Throwable, C17164e<? super C16807N>, Object> {
        j(Object obj) {
            super(2, obj, I.class, "onStoreDetailsError", "onStoreDetailsError(Ljava/lang/Throwable;)V", 4);
        }

        /* renamed from: a */
        public final Object invoke(Throwable th2, C17164e<? super C16807N> eVar) {
            return ((I) this.f144363a).Z0(th2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class k extends C17525a implements nI.p<kD.o, C17164e<? super C16807N>, Object> {
        k(Object obj) {
            super(2, obj, I.class, "onUserInfo", "onUserInfo(Lcom/ingka/ikea/useraccount/model/UserInfo;)V", 4);
        }

        /* renamed from: a */
        public final Object invoke(kD.o oVar, C17164e<? super C16807N> eVar) {
            return ((I) this.f144363a).a1(oVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class l extends C17525a implements nI.p<Es.a, C17164e<? super C16807N>, Object> {
        l(Object obj) {
            super(2, obj, I.class, "onInboxState", "onInboxState(Lcom/ingka/ikea/inbox/model/InboxState;)V", 4);
        }

        /* renamed from: a */
        public final Object invoke(Es.a aVar, C17164e<? super C16807N> eVar) {
            return ((I) this.f144363a).V0(aVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class m extends C17525a implements nI.p<C15129b, C17164e<? super C16807N>, Object> {
        m(Object obj) {
            super(2, obj, I.class, "onShoppingListData", "onShoppingListData(Lcom/ingka/ikea/shoppinglist/usecase/CarouselShoppingListState;)V", 4);
        }

        /* renamed from: a */
        public final Object invoke(C15129b bVar, C17164e<? super C16807N> eVar) {
            return ((I) this.f144363a).X0(bVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class n extends C17525a implements nI.p<Boolean, C17164e<? super C16807N>, Object> {
        n(Object obj) {
            super(2, obj, I.class, "onScanAndGoStoreSelected", "onScanAndGoStoreSelected(Z)V", 4);
        }

        public final Object a(boolean z10, C17164e<? super C16807N> eVar) {
            return ((I) this.f144363a).W0(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$collectStates$lambda$2$$inlined$flatMapLatest$1", f = "InstoreViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class o extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super e.a>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82210c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f82211d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f82212e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ I f82213f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(C17164e eVar, I i10) {
            super(3, eVar);
            this.f82213f = i10;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super e.a> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            o oVar = new o(eVar, this.f82213f);
            oVar.f82211d = hVar;
            oVar.f82212e = bool;
            return oVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f82210c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16533h hVar = (C16533h) this.f82211d;
                boolean booleanValue = ((Boolean) this.f82212e).booleanValue();
                if (this.f82213f.f82139M && booleanValue) {
                    this.f82213f.f82139M = false;
                }
                C16532g<e.a> a10 = b.a(C16534i.R(C16534i.s(this.f82213f.f82146n.invoke()), new i(this.f82213f, booleanValue, (C17164e<? super i>) null)), new j(this.f82213f));
                this.f82210c = 1;
                if (C16534i.x(hVar, a10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class p implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f82214a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f82215a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$collectStates$lambda$2$$inlined$map$1$2", f = "InstoreViewModel.kt", l = {50}, m = "emit")
            /* renamed from: It.I$p$a$a  reason: collision with other inner class name */
            public static final class C1611a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f82216c;

                /* renamed from: d  reason: collision with root package name */
                int f82217d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f82218e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1611a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f82218e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f82216c = obj;
                    this.f82217d |= Integer.MIN_VALUE;
                    return this.f82218e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f82215a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof It.I.p.a.C1611a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    It.I$p$a$a r0 = (It.I.p.a.C1611a) r0
                    int r1 = r0.f82217d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f82217d = r1
                    goto L_0x0018
                L_0x0013:
                    It.I$p$a$a r0 = new It.I$p$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f82216c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f82217d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f82215a
                    EB.d r5 = (EB.C12832d) r5
                    boolean r5 = r5.f()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f82217d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: It.I.p.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public p(C16532g gVar) {
            this.f82214a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f82214a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isLoggedIn", "isFamilyMember", "storeModeEnabled", "LEB/d;", "selectedStore", "LXH/N;", "<anonymous>", "(ZZZLEB/d;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$handleBenefitClicked$1", f = "InstoreViewModel.kt", l = {}, m = "invokeSuspend")
    static final class q extends kotlin.coroutines.jvm.internal.l implements nI.s<Boolean, Boolean, Boolean, C12832d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82219c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f82220d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f82221e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f82222f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f82223g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ I f82224h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Mt.a f82225i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(I i10, Mt.a aVar, C17164e<? super q> eVar) {
            super(5, eVar);
            this.f82224h = i10;
            this.f82225i = aVar;
        }

        public final Object i(boolean z10, boolean z11, boolean z12, C12832d dVar, C17164e<? super C16807N> eVar) {
            q qVar = new q(this.f82224h, this.f82225i, eVar);
            qVar.f82220d = z10;
            qVar.f82221e = z11;
            qVar.f82222f = z12;
            qVar.f82223g = dVar;
            return qVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            C17187b.f();
            if (this.f82219c == 0) {
                XH.y.b(obj);
                boolean z10 = this.f82220d;
                boolean z11 = this.f82221e;
                boolean z12 = this.f82222f;
                this.f82224h.h1();
                this.f82224h.f82150r.d(((C12832d) this.f82223g).e(), !z10, z11, z12);
                if (!z11 || !z12) {
                    C16505B i02 = this.f82224h.f82136J;
                    Mt.a aVar = this.f82225i;
                    do {
                        value = i02.getValue();
                    } while (!i02.e(value, y.b((y) value, (Gt.a) null, (C15129b) null, (Es.a) null, (w) null, (C10751n) null, (v) null, aVar, 63, (Object) null)));
                } else {
                    C16505B g02 = this.f82224h.f82141O;
                    do {
                        value2 = g02.getValue();
                        t tVar = (t) value2;
                    } while (!g02.e(value2, t.a.d.f82428a));
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (C12832d) obj4, (C17164e) obj5);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isLoggedIn", "isFamilyMember", "storeModeEnabled", "LEB/d;", "selectedStore", "LXH/N;", "<anonymous>", "(ZZZLEB/d;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$handleBenefitDetailsActionClicked$2", f = "InstoreViewModel.kt", l = {}, m = "invokeSuspend")
    static final class r extends kotlin.coroutines.jvm.internal.l implements nI.s<Boolean, Boolean, Boolean, C12832d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82226c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f82227d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f82228e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f82229f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f82230g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ I f82231h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(I i10, C17164e<? super r> eVar) {
            super(5, eVar);
            this.f82231h = i10;
        }

        public final Object i(boolean z10, boolean z11, boolean z12, C12832d dVar, C17164e<? super C16807N> eVar) {
            r rVar = new r(this.f82231h, eVar);
            rVar.f82227d = z10;
            rVar.f82228e = z11;
            rVar.f82229f = z12;
            rVar.f82230g = dVar;
            return rVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f82226c == 0) {
                XH.y.b(obj);
                boolean z10 = this.f82227d;
                boolean z11 = this.f82228e;
                boolean z12 = this.f82229f;
                C12832d dVar = (C12832d) this.f82230g;
                Object obj2 = !z10 ? t.a.g.f82431a : !z11 ? t.a.q.f82443a : t.a.d.f82428a;
                this.f82231h.f82150r.c(dVar.e(), !z10, z11, z12);
                C16505B g02 = this.f82231h.f82141O;
                do {
                    value = g02.getValue();
                    t tVar = (t) value;
                } while (!g02.e(value, obj2));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (C12832d) obj4, (C17164e) obj5);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class s implements C16532g<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f82232a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f82233a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$handleDeeplinkAction$$inlined$filterIsInstance$1$2", f = "InstoreViewModel.kt", l = {50}, m = "emit")
            /* renamed from: It.I$s$a$a  reason: collision with other inner class name */
            public static final class C1612a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f82234c;

                /* renamed from: d  reason: collision with root package name */
                int f82235d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f82236e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1612a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f82236e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f82234c = obj;
                    this.f82235d |= Integer.MIN_VALUE;
                    return this.f82236e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f82233a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof It.I.s.a.C1612a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    It.I$s$a$a r0 = (It.I.s.a.C1612a) r0
                    int r1 = r0.f82235d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f82235d = r1
                    goto L_0x0018
                L_0x0013:
                    It.I$s$a$a r0 = new It.I$s$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f82234c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f82235d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0043
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f82233a
                    boolean r2 = r5 instanceof It.B.c
                    if (r2 == 0) goto L_0x0043
                    r0.f82235d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0043
                    return r1
                L_0x0043:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: It.I.s.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public s(C16532g gVar) {
            this.f82232a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f82232a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIt/B$c;", "state", "LXH/N;", "<anonymous>", "(LIt/B$c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$handleDeeplinkAction$1", f = "InstoreViewModel.kt", l = {}, m = "invokeSuspend")
    static final class t extends kotlin.coroutines.jvm.internal.l implements nI.p<B.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82237c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f82238d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f82239e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ I f82240f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f82241a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    Ht.h[] r0 = Ht.h.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Ht.h r1 = Ht.h.OPEN_STORE_PAGE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Ht.h r1 = Ht.h.OPEN_STORE_MAP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    Ht.h r1 = Ht.h.OPEN_SCANNER_FROM_SHORTCUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f82241a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: It.I.t.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(String str, I i10, C17164e<? super t> eVar) {
            super(2, eVar);
            this.f82239e = str;
            this.f82240f = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            t tVar = new t(this.f82239e, this.f82240f, eVar);
            tVar.f82238d = obj;
            return tVar;
        }

        /* renamed from: i */
        public final Object invoke(B.c cVar, C17164e<? super C16807N> eVar) {
            return ((t) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f82237c == 0) {
                XH.y.b(obj);
                B.c cVar = (B.c) this.f82238d;
                int i10 = a.f82241a[Ht.h.Companion.a(this.f82239e).ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        this.f82240f.c1(cVar.k(), this.f82240f.N0());
                    } else if (i10 == 3) {
                        this.f82240f.b1();
                    } else {
                        throw new XH.t();
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$handleStoreModeBadge$1", f = "InstoreViewModel.kt", l = {1154, 1159}, m = "invokeSuspend")
    static final class u extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f82242c;

        /* renamed from: d  reason: collision with root package name */
        Object f82243d;

        /* renamed from: e  reason: collision with root package name */
        Object f82244e;

        /* renamed from: f  reason: collision with root package name */
        Object f82245f;

        /* renamed from: g  reason: collision with root package name */
        Object f82246g;

        /* renamed from: h  reason: collision with root package name */
        Object f82247h;

        /* renamed from: i  reason: collision with root package name */
        Object f82248i;

        /* renamed from: j  reason: collision with root package name */
        Object f82249j;

        /* renamed from: k  reason: collision with root package name */
        Object f82250k;

        /* renamed from: l  reason: collision with root package name */
        Object f82251l;

        /* renamed from: m  reason: collision with root package name */
        Object f82252m;

        /* renamed from: n  reason: collision with root package name */
        int f82253n;

        /* renamed from: o  reason: collision with root package name */
        int f82254o;

        /* renamed from: p  reason: collision with root package name */
        int f82255p;

        /* renamed from: q  reason: collision with root package name */
        int f82256q;

        /* renamed from: r  reason: collision with root package name */
        int f82257r;

        /* renamed from: s  reason: collision with root package name */
        int f82258s;

        /* renamed from: t  reason: collision with root package name */
        int f82259t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ I f82260u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(I i10, C17164e<? super u> eVar) {
            super(2, eVar);
            this.f82260u = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new u(this.f82260u, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((u) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f82259t
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0059
                if (r2 == r4) goto L_0x0046
                if (r2 != r3) goto L_0x003e
                java.lang.Object r1 = r0.f82251l
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f82250k
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f82249j
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f82248i
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f82247h
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f82246g
                nu.m r1 = (nu.m) r1
                java.lang.Object r1 = r0.f82245f
                nu.m r1 = (nu.m) r1
                java.lang.Object r1 = r0.f82244e
                pu.b r1 = (pu.C11778b) r1
                java.lang.Object r1 = r0.f82243d
                nu.m r1 = (nu.m) r1
                java.lang.Object r1 = r0.f82242c
                nu.m r1 = (nu.m) r1
                XH.y.b(r19)
                goto L_0x0193
            L_0x003e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0046:
                int r2 = r0.f82253n
                java.lang.Object r6 = r0.f82243d
                nu.m r6 = (nu.m) r6
                java.lang.Object r7 = r0.f82242c
                nu.m r7 = (nu.m) r7
                XH.y.b(r19)
                r8 = r7
                r7 = r6
                r6 = r2
                r2 = r19
                goto L_0x007c
            L_0x0059:
                XH.y.b(r19)
                It.I r2 = r0.f82260u
                nu.m r6 = r2.f82131E
                pu.a r2 = r6.f()
                TJ.g r2 = r2.c()
                r0.f82242c = r6
                r0.f82243d = r6
                r0.f82253n = r5
                r0.f82259t = r4
                java.lang.Object r2 = TJ.C16534i.B(r2, r0)
                if (r2 != r1) goto L_0x0079
                return r1
            L_0x0079:
                r7 = r6
                r8 = r7
                r6 = r5
            L_0x007c:
                pu.b r2 = (pu.C11778b) r2
                if (r2 == 0) goto L_0x0193
                qv.e r15 = qv.e.DEBUG
                qv.d r9 = qv.d.f102012a
                java.util.List r9 = r9.a()
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r9 = r9.iterator()
            L_0x0093:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x00aa
                java.lang.Object r10 = r9.next()
                r11 = r10
                qv.b r11 = (qv.C11819b) r11
                boolean r11 = r11.b(r15, r5)
                if (r11 == 0) goto L_0x0093
                r14.add(r10)
                goto L_0x0093
            L_0x00aa:
                java.util.Iterator r13 = r14.iterator()
                r11 = r14
                r9 = 0
                r10 = 0
            L_0x00b1:
                boolean r16 = r13.hasNext()
                if (r16 == 0) goto L_0x015f
                java.lang.Object r16 = r13.next()
                r11 = r16
                qv.b r11 = (qv.C11819b) r11
                r5 = 0
                if (r9 != 0) goto L_0x00ec
                java.lang.String r4 = r2.b()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r12 = "Nearby store found - "
                r3.append(r12)
                r3.append(r4)
                java.lang.String r4 = " - marking badge as seen"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r3 = qv.C11818a.a(r3, r5)
                if (r3 != 0) goto L_0x00e8
                r5 = r13
                r4 = r14
                r11 = r16
                goto L_0x0161
            L_0x00e8:
                java.lang.String r9 = qv.C11820c.a(r3)
            L_0x00ec:
                r3 = r9
                if (r10 != 0) goto L_0x0141
                java.lang.Class r4 = r7.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r9 = 36
                r10 = 2
                r12 = 0
                java.lang.String r9 = HJ.C15854t.s1(r4, r9, r12, r10, r12)
                r5 = 46
                java.lang.String r5 = HJ.C15854t.o1(r9, r5, r12, r10, r12)
                int r9 = r5.length()
                if (r9 != 0) goto L_0x010f
                goto L_0x0115
            L_0x010f:
                java.lang.String r4 = "Kt"
                java.lang.String r4 = HJ.C15854t.P0(r5, r4)
            L_0x0115:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r9 = "main"
                r10 = 1
                boolean r5 = HJ.C15854t.b0(r5, r9, r10)
                if (r5 == 0) goto L_0x0129
                java.lang.String r5 = "m"
                goto L_0x012b
            L_0x0129:
                java.lang.String r5 = "b"
            L_0x012b:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r5)
                java.lang.String r5 = "|"
                r9.append(r5)
                r9.append(r4)
                java.lang.String r10 = r9.toString()
            L_0x013f:
                r4 = r10
                goto L_0x0143
            L_0x0141:
                r12 = 0
                goto L_0x013f
            L_0x0143:
                r5 = 0
                r9 = r11
                r10 = r15
                r11 = r4
                r17 = r12
                r12 = r5
                r5 = r13
                r13 = 0
                r19 = r4
                r4 = r14
                r14 = r3
                r9.a(r10, r11, r12, r13, r14)
                r10 = r19
                r9 = r3
                r14 = r4
                r13 = r5
                r11 = r16
                r3 = 2
                r4 = 1
                r5 = 0
                goto L_0x00b1
            L_0x015f:
                r5 = r13
                r4 = r14
            L_0x0161:
                nt.a r3 = r7.e()
                r0.f82242c = r8
                r0.f82243d = r7
                r0.f82244e = r2
                r0.f82245f = r7
                r0.f82246g = r7
                r0.f82247h = r15
                r0.f82248i = r9
                r0.f82249j = r10
                r0.f82250k = r4
                r0.f82251l = r5
                r0.f82252m = r11
                r0.f82253n = r6
                r2 = 0
                r0.f82254o = r2
                r0.f82255p = r2
                r0.f82256q = r2
                r0.f82257r = r2
                r0.f82258s = r2
                r2 = 2
                r0.f82259t = r2
                r2 = 1
                java.lang.Object r2 = r3.h(r2, r0)
                if (r2 != r1) goto L_0x0193
                return r1
            L_0x0193:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: It.I.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$onAction$19", f = "InstoreViewModel.kt", l = {845}, m = "invokeSuspend")
    static final class v extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82261c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I f82262d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(I i10, C17164e<? super v> eVar) {
            super(2, eVar);
            this.f82262d = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new v(this.f82262d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((v) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f82261c;
            if (i10 == 0) {
                XH.y.b(obj);
                C11569b a10 = this.f82262d.f82131E.a();
                C11569b.a.c cVar = C11569b.a.c.f99500a;
                this.f82261c = 1;
                if (a10.a(cVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$onAction$22", f = "InstoreViewModel.kt", l = {891, 892, 893}, m = "invokeSuspend")
    static final class w extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f82263c;

        /* renamed from: d  reason: collision with root package name */
        Object f82264d;

        /* renamed from: e  reason: collision with root package name */
        Object f82265e;

        /* renamed from: f  reason: collision with root package name */
        Object f82266f;

        /* renamed from: g  reason: collision with root package name */
        Object f82267g;

        /* renamed from: h  reason: collision with root package name */
        int f82268h;

        /* renamed from: i  reason: collision with root package name */
        int f82269i;

        /* renamed from: j  reason: collision with root package name */
        int f82270j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ I f82271k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ q f82272l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f82273a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    It.q$e$b[] r0 = It.q.C10757e.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    It.q$e$b r1 = It.q.C10757e.b.CHANGE_STORE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    It.q$e$b r1 = It.q.C10757e.b.CHANGE_STORE_CLEAR_SCAN_AND_GO     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f82273a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: It.I.w.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(I i10, q qVar, C17164e<? super w> eVar) {
            super(2, eVar);
            this.f82271k = i10;
            this.f82272l = qVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new w(this.f82271k, this.f82272l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((w) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x010f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0110  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f82270j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0071
                if (r1 == r4) goto L_0x004f
                if (r1 == r3) goto L_0x0032
                if (r1 != r2) goto L_0x002a
                java.lang.Object r0 = r12.f82267g
                It.q$e$b r0 = (It.q.C10757e.b) r0
                java.lang.Object r0 = r12.f82266f
                nu.m r0 = (nu.m) r0
                java.lang.Object r1 = r12.f82265e
                It.q r1 = (It.q) r1
                java.lang.Object r1 = r12.f82264d
                It.I r1 = (It.I) r1
                java.lang.Object r1 = r12.f82263c
                nu.m r1 = (nu.m) r1
                XH.y.b(r13)
                goto L_0x0111
            L_0x002a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0032:
                int r1 = r12.f82269i
                int r3 = r12.f82268h
                java.lang.Object r4 = r12.f82267g
                It.q$e$b r4 = (It.q.C10757e.b) r4
                java.lang.Object r5 = r12.f82266f
                nu.m r5 = (nu.m) r5
                java.lang.Object r6 = r12.f82265e
                It.q r6 = (It.q) r6
                java.lang.Object r7 = r12.f82264d
                It.I r7 = (It.I) r7
                java.lang.Object r8 = r12.f82263c
                nu.m r8 = (nu.m) r8
                XH.y.b(r13)
                goto L_0x00ee
            L_0x004f:
                int r1 = r12.f82269i
                int r5 = r12.f82268h
                java.lang.Object r6 = r12.f82267g
                It.q$e$b r6 = (It.q.C10757e.b) r6
                java.lang.Object r7 = r12.f82266f
                nu.m r7 = (nu.m) r7
                java.lang.Object r8 = r12.f82265e
                It.q r8 = (It.q) r8
                java.lang.Object r9 = r12.f82264d
                It.I r9 = (It.I) r9
                java.lang.Object r10 = r12.f82263c
                nu.m r10 = (nu.m) r10
                XH.y.b(r13)
                XH.x r13 = (XH.x) r13
                r13.j()
                r13 = r9
                goto L_0x00cd
            L_0x0071:
                XH.y.b(r13)
                It.I r13 = r12.f82271k
                nu.m r7 = r13.f82131E
                It.I r13 = r12.f82271k
                It.q r1 = r12.f82272l
                r13.f82139M = r4
                qu.a r5 = r7.c()
                r6 = r1
                It.q$e$a r6 = (It.q.C10757e.a) r6
                It.q$e$b r8 = r6.b()
                int[] r9 = It.I.w.a.f82273a
                int r10 = r8.ordinal()
                r9 = r9[r10]
                if (r9 == r4) goto L_0x00a1
                if (r9 != r3) goto L_0x009b
                qu.a$b r10 = qu.C11817a.b.CHANGE_STORE_CLEAR_SCAN_AND_GO
                goto L_0x00a3
            L_0x009b:
                XH.t r13 = new XH.t
                r13.<init>()
                throw r13
            L_0x00a1:
                qu.a$b r10 = qu.C11817a.b.CHANGE_STORE
            L_0x00a3:
                qu.a$a r11 = qu.C11817a.C2422a.CHANGE_STORE
                r5.g(r10, r11)
                nu.n r5 = r13.f82130D
                java.lang.String r6 = r6.a()
                r12.f82263c = r7
                r12.f82264d = r13
                r12.f82265e = r1
                r12.f82266f = r7
                r12.f82267g = r8
                r10 = 0
                r12.f82268h = r10
                r12.f82269i = r9
                r12.f82270j = r4
                java.lang.Object r5 = r5.m12invokegIAlus(r6, r12)
                if (r5 != r0) goto L_0x00c8
                return r0
            L_0x00c8:
                r6 = r8
                r5 = r10
                r8 = r1
                r10 = r7
                r1 = r9
            L_0x00cd:
                nt.a r9 = r7.e()
                r12.f82263c = r10
                r12.f82264d = r13
                r12.f82265e = r8
                r12.f82266f = r7
                r12.f82267g = r6
                r12.f82268h = r5
                r12.f82269i = r1
                r12.f82270j = r3
                java.lang.Object r3 = r9.g(r4, r12)
                if (r3 != r0) goto L_0x00e8
                return r0
            L_0x00e8:
                r3 = r5
                r4 = r6
                r5 = r7
                r6 = r8
                r8 = r10
                r7 = r13
            L_0x00ee:
                lu.d r13 = r5.b()
                r9 = r6
                It.q$e$a r9 = (It.q.C10757e.a) r9
                java.lang.String r9 = r9.a()
                r12.f82263c = r8
                r12.f82264d = r7
                r12.f82265e = r6
                r12.f82266f = r5
                r12.f82267g = r4
                r12.f82268h = r3
                r12.f82269i = r1
                r12.f82270j = r2
                java.lang.Object r13 = r13.a(r9, r12)
                if (r13 != r0) goto L_0x0110
                return r0
            L_0x0110:
                r0 = r5
            L_0x0111:
                qu.a r13 = r0.c()
                r13.a()
                XH.N r13 = XH.C16807N.f139792a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: It.I.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$onAction$23", f = "InstoreViewModel.kt", l = {902}, m = "invokeSuspend")
    static final class x extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f82274c;

        /* renamed from: d  reason: collision with root package name */
        Object f82275d;

        /* renamed from: e  reason: collision with root package name */
        Object f82276e;

        /* renamed from: f  reason: collision with root package name */
        int f82277f;

        /* renamed from: g  reason: collision with root package name */
        int f82278g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ I f82279h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q f82280i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f82281a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    It.q$e$b[] r0 = It.q.C10757e.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    It.q$e$b r1 = It.q.C10757e.b.CHANGE_STORE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    It.q$e$b r1 = It.q.C10757e.b.CHANGE_STORE_CLEAR_SCAN_AND_GO     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f82281a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: It.I.x.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(I i10, q qVar, C17164e<? super x> eVar) {
            super(2, eVar);
            this.f82279h = i10;
            this.f82280i = qVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new x(this.f82279h, this.f82280i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((x) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            q qVar;
            nu.m mVar;
            C11817a.b bVar;
            Object f10 = C17187b.f();
            int i10 = this.f82278g;
            if (i10 == 0) {
                XH.y.b(obj);
                nu.m a02 = this.f82279h.f82131E;
                qVar = this.f82280i;
                C11674a e10 = a02.e();
                this.f82274c = a02;
                this.f82275d = qVar;
                this.f82276e = a02;
                this.f82277f = 0;
                this.f82278g = 1;
                if (e10.g(true, this) == f10) {
                    return f10;
                }
                mVar = a02;
            } else if (i10 == 1) {
                mVar = (nu.m) this.f82276e;
                qVar = (q) this.f82275d;
                nu.m mVar2 = (nu.m) this.f82274c;
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C11817a c10 = mVar.c();
            int i11 = a.f82281a[((q.C10757e.c) qVar).a().ordinal()];
            if (i11 == 1) {
                bVar = C11817a.b.CHANGE_STORE;
            } else if (i11 == 2) {
                bVar = C11817a.b.CHANGE_STORE_CLEAR_SCAN_AND_GO;
            } else {
                throw new XH.t();
            }
            c10.g(bVar, C11817a.C2422a.DISMISS);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$onAction$30", f = "InstoreViewModel.kt", l = {983}, m = "invokeSuspend")
    static final class y extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82282c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I f82283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(I i10, C17164e<? super y> eVar) {
            super(2, eVar);
            this.f82283d = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new y(this.f82283d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((y) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f82282c;
            if (i10 == 0) {
                XH.y.b(obj);
                C11285c b02 = this.f82283d.f82133G;
                this.f82282c = 1;
                if (b02.a(true, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.presentation.InstoreViewModelImpl$preloadWayfindingMap$1$1", f = "InstoreViewModel.kt", l = {1137}, m = "invokeSuspend")
    static final class z extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f82284c;

        /* renamed from: d  reason: collision with root package name */
        Object f82285d;

        /* renamed from: e  reason: collision with root package name */
        Object f82286e;

        /* renamed from: f  reason: collision with root package name */
        Object f82287f;

        /* renamed from: g  reason: collision with root package name */
        int f82288g;

        /* renamed from: h  reason: collision with root package name */
        int f82289h;

        /* renamed from: i  reason: collision with root package name */
        int f82290i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f82291j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ I f82292k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Gt.g f82293l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(I i10, Gt.g gVar, C17164e<? super z> eVar) {
            super(2, eVar);
            this.f82292k = i10;
            this.f82293l = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            z zVar = new z(this.f82292k, this.f82293l, eVar);
            zVar.f82291j = obj;
            return zVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((z) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x0180  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                r24 = this;
                r1 = r24
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f82290i
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0034
                if (r2 != r4) goto L_0x002c
                java.lang.Object r0 = r1.f82287f
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f82286e
                Gt.g r0 = (Gt.g) r0
                java.lang.Object r0 = r1.f82285d
                It.I r0 = (It.I) r0
                java.lang.Object r0 = r1.f82284c
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f82291j
                r2 = r0
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r25)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                goto L_0x0060
            L_0x0027:
                r0 = move-exception
                goto L_0x0067
            L_0x0029:
                r0 = move-exception
                goto L_0x0242
            L_0x002c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0034:
                XH.y.b(r25)
                java.lang.Object r2 = r1.f82291j
                QJ.Q r2 = (QJ.Q) r2
                It.I r5 = r1.f82292k
                Gt.g r6 = r1.f82293l
                XH.x$a r7 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                ru.d r7 = r5.f82127A     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                java.lang.String r8 = r6.a()     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                r1.f82291j = r2     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                r1.f82284c = r2     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                r1.f82285d = r5     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                r1.f82286e = r6     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                r1.f82287f = r2     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                r1.f82288g = r3     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                r1.f82289h = r3     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                r1.f82290i = r4     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                java.lang.Object r5 = r7.a(r8, r1)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                if (r5 != r0) goto L_0x0060
                return r0
            L_0x0060:
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
                goto L_0x0071
            L_0x0067:
                XH.x$a r5 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
            L_0x0071:
                Gt.g r5 = r1.f82293l
                java.lang.Throwable r12 = XH.x.e(r0)
                java.lang.String r13 = "|"
                java.lang.String r14 = "b"
                java.lang.String r15 = "m"
                java.lang.String r11 = "main"
                java.lang.String r10 = "Kt"
                if (r12 == 0) goto L_0x0172
                java.lang.String r5 = r5.a()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r9 = "Unable to preload wayfinding map for store : "
                r4.append(r9)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                qv.e r5 = qv.e.WARN
                qv.d r9 = qv.d.f102012a
                java.util.List r9 = r9.a()
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r9 = r9.iterator()
            L_0x00ab:
                boolean r17 = r9.hasNext()
                if (r17 == 0) goto L_0x00c2
                java.lang.Object r8 = r9.next()
                r6 = r8
                qv.b r6 = (qv.C11819b) r6
                boolean r6 = r6.b(r5, r3)
                if (r6 == 0) goto L_0x00ab
                r7.add(r8)
                goto L_0x00ab
            L_0x00c2:
                java.util.Iterator r19 = r7.iterator()
                r6 = 0
                r7 = 0
            L_0x00c8:
                boolean r8 = r19.hasNext()
                if (r8 == 0) goto L_0x0172
                java.lang.Object r8 = r19.next()
                qv.b r8 = (qv.C11819b) r8
                r9 = 0
                if (r6 != 0) goto L_0x00ea
                java.lang.String r6 = qv.C11818a.a(r9, r12)
                if (r6 != 0) goto L_0x00e6
                r3 = r9
                r22 = r10
                r23 = r11
                r1 = 36
                goto L_0x0179
            L_0x00e6:
                java.lang.String r6 = qv.C11820c.a(r6)
            L_0x00ea:
                r18 = r6
                if (r7 != 0) goto L_0x0146
                if (r4 != 0) goto L_0x0116
                java.lang.Class r6 = r2.getClass()
                java.lang.String r6 = r6.getName()
                kotlin.jvm.internal.C17542s.g(r6)
                r3 = 2
                r7 = 36
                java.lang.String r1 = HJ.C15854t.s1(r6, r7, r9, r3, r9)
                r17 = r4
                r4 = 46
                java.lang.String r1 = HJ.C15854t.o1(r1, r4, r9, r3, r9)
                int r20 = r1.length()
                if (r20 != 0) goto L_0x0111
                goto L_0x011f
            L_0x0111:
                java.lang.String r6 = HJ.C15854t.P0(r1, r10)
                goto L_0x011f
            L_0x0116:
                r17 = r4
                r3 = 2
                r4 = 46
                r7 = 36
                r6 = r17
            L_0x011f:
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r1 = r1.getName()
                r3 = 1
                boolean r1 = HJ.C15854t.b0(r1, r11, r3)
                if (r1 == 0) goto L_0x0130
                r1 = r15
                goto L_0x0131
            L_0x0130:
                r1 = r14
            L_0x0131:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                r3.append(r13)
                r3.append(r6)
                java.lang.String r1 = r3.toString()
                r3 = r1
                r1 = r7
                goto L_0x014d
            L_0x0146:
                r17 = r4
                r1 = 36
                r4 = 46
                r3 = r7
            L_0x014d:
                r21 = 0
                r6 = r8
                r8 = 2
                r7 = r5
                r4 = r8
                r8 = r3
                r25 = r3
                r3 = r9
                r9 = r21
                r22 = r10
                r10 = r12
                r23 = r11
                r11 = r18
                r6.a(r7, r8, r9, r10, r11)
                r1 = r24
                r7 = r25
                r4 = r17
                r6 = r18
                r10 = r22
                r11 = r23
                r3 = 0
                goto L_0x00c8
            L_0x0172:
                r22 = r10
                r23 = r11
                r1 = 36
                r3 = 0
            L_0x0179:
                r4 = 2
                boolean r5 = XH.x.h(r0)
                if (r5 == 0) goto L_0x023f
                XH.N r0 = (XH.C16807N) r0
                qv.e r0 = qv.e.DEBUG
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x0195:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x01ad
                java.lang.Object r7 = r5.next()
                r8 = r7
                qv.b r8 = (qv.C11819b) r8
                r9 = 0
                boolean r8 = r8.b(r0, r9)
                if (r8 == 0) goto L_0x0195
                r6.add(r7)
                goto L_0x0195
            L_0x01ad:
                java.util.Iterator r11 = r6.iterator()
                r5 = r3
                r6 = r5
            L_0x01b3:
                boolean r7 = r11.hasNext()
                if (r7 == 0) goto L_0x023f
                java.lang.Object r7 = r11.next()
                qv.b r7 = (qv.C11819b) r7
                r9 = 0
                if (r6 != 0) goto L_0x01d0
                java.lang.String r6 = "Successfully preloaded wayfinding map"
                java.lang.String r6 = qv.C11818a.a(r6, r9)
                if (r6 != 0) goto L_0x01cc
                goto L_0x023f
            L_0x01cc:
                java.lang.String r6 = qv.C11820c.a(r6)
            L_0x01d0:
                r12 = r6
                if (r5 != 0) goto L_0x021e
                java.lang.Class r5 = r2.getClass()
                java.lang.String r5 = r5.getName()
                kotlin.jvm.internal.C17542s.g(r5)
                java.lang.String r6 = HJ.C15854t.s1(r5, r1, r3, r4, r3)
                r10 = 46
                java.lang.String r6 = HJ.C15854t.o1(r6, r10, r3, r4, r3)
                int r8 = r6.length()
                if (r8 != 0) goto L_0x01f1
                r8 = r22
                goto L_0x01f7
            L_0x01f1:
                r8 = r22
                java.lang.String r5 = HJ.C15854t.P0(r6, r8)
            L_0x01f7:
                java.lang.Thread r6 = java.lang.Thread.currentThread()
                java.lang.String r6 = r6.getName()
                r3 = r23
                r1 = 1
                boolean r6 = HJ.C15854t.b0(r6, r3, r1)
                if (r6 == 0) goto L_0x020a
                r6 = r15
                goto L_0x020b
            L_0x020a:
                r6 = r14
            L_0x020b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r13)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                goto L_0x0225
            L_0x021e:
                r8 = r22
                r3 = r23
                r10 = 46
                r1 = r5
            L_0x0225:
                r16 = 0
                r5 = r7
                r6 = r0
                r7 = r1
                r19 = r8
                r8 = r16
                r16 = r10
                r10 = r12
                r5.a(r6, r7, r8, r9, r10)
                r5 = r1
                r23 = r3
                r6 = r12
                r22 = r19
                r1 = 36
                r3 = 0
                goto L_0x01b3
            L_0x023f:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x0242:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: It.I.z.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public I(U u10, nu.e eVar, C14763e eVar2, C15130c cVar, C11414a aVar, C11991a aVar2, Pt.a aVar3, C14509b bVar, C12860a aVar4, C12863d dVar, C13991c cVar2, C13990b bVar2, c cVar3, Ft.e eVar3, d dVar2, C13909a aVar5, a aVar6, nu.n nVar, nu.m mVar, Ry.f fVar, C11285c cVar4, C11891a aVar7) {
        U u11 = u10;
        nu.e eVar4 = eVar;
        C14763e eVar5 = eVar2;
        C15130c cVar5 = cVar;
        C11414a aVar8 = aVar;
        C11991a aVar9 = aVar2;
        Pt.a aVar10 = aVar3;
        C14509b bVar3 = bVar;
        C12860a aVar11 = aVar4;
        C12863d dVar3 = dVar;
        C13991c cVar6 = cVar2;
        C13990b bVar4 = bVar2;
        c cVar7 = cVar3;
        Ft.e eVar6 = eVar3;
        C13909a aVar12 = aVar5;
        C17542s.j(u11, "savedStateHandle");
        C17542s.j(eVar4, "getSelectedStoreUseCase");
        C17542s.j(eVar5, "getUserInfoUseCase");
        C17542s.j(cVar5, "getShoppingListsCarouselUseCase");
        C17542s.j(aVar8, "inboxIntegration");
        C17542s.j(aVar9, "analytics");
        C17542s.j(aVar10, "storeEventsAnalytics");
        C17542s.j(bVar3, "openingHoursLabelMapper");
        C17542s.j(aVar11, "localStoreSelectionRepository");
        C17542s.j(dVar3, "storeRepository");
        C17542s.j(cVar6, "popularTimesLiveDataMapper");
        C17542s.j(bVar4, "popularTimesIntegration");
        C17542s.j(cVar7, "abTesting");
        C17542s.j(eVar6, "storeEventReminderTimeSlotMapper");
        C17542s.j(dVar2, "wayfindingMapPreloader");
        C17542s.j(aVar5, "sessionManager");
        C17542s.j(aVar6, "storeEventMapper");
        C17542s.j(nVar, "updateStoreUseCase");
        C17542s.j(mVar, "storeModeOrchestrator");
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(cVar4, "storePageRepository");
        C17542s.j(aVar7, "wayfindingAnalytics");
        this.f82145m = u11;
        this.f82146n = eVar4;
        this.f82147o = eVar5;
        this.f82148p = cVar5;
        this.f82149q = aVar8;
        this.f82150r = aVar9;
        this.f82151s = aVar10;
        this.f82152t = bVar3;
        this.f82153u = aVar11;
        this.f82154v = dVar3;
        this.f82155w = cVar6;
        this.f82156x = bVar4;
        this.f82157y = cVar7;
        this.f82158z = eVar6;
        this.f82127A = dVar2;
        this.f82128B = aVar5;
        this.f82129C = aVar6;
        this.f82130D = nVar;
        this.f82131E = mVar;
        this.f82132F = fVar;
        this.f82133G = cVar4;
        this.f82134H = aVar7;
        C16505B<z> a10 = C16521S.a(new z((Gt.d) null, (List) null, (List) null, (Throwable) null, false, 31, (DefaultConstructorMarker) null));
        this.f82135I = a10;
        C16505B<y> a11 = C16521S.a(new y((Gt.a) null, (C15129b) null, (Es.a) null, (w) null, (C10751n) null, (v) null, (Mt.a) null, 127, (DefaultConstructorMarker) null));
        this.f82136J = a11;
        this.f82138L = (InstoreRoutes$StorePage) O.a(u11, P.b(InstoreRoutes$StorePage.class), X.j());
        this.f82140N = C16534i.c0(C16534i.m(a11, a10, mVar.d().isEnabled(), new B((C17164e<? super B>) null)), g0.a(this), ip.f.a(), B.a.f82058a);
        C16505B<t> a12 = C16521S.a(null);
        this.f82141O = a12;
        this.f82142P = C16534i.c(a12);
        C16505B<x> a13 = C16521S.a(null);
        this.f82143Q = a13;
        this.f82144R = C16534i.c(a13);
        G0();
        Q0(M0());
    }

    private final void A0(e.a.i iVar) {
        z value;
        z zVar;
        List<T> j12;
        boolean z10 = !iVar.a() && iVar.b().isEmpty();
        C16505B<z> b10 = this.f82135I;
        do {
            value = b10.getValue();
            zVar = value;
            if (z10) {
                j12 = e1(zVar.c(), new F());
            } else if (!z10) {
                j12 = j1(zVar.c(), new A.k(iVar.b(), iVar.a()));
            } else {
                throw new XH.t();
            }
        } while (!b10.e(value, z.b(zVar, (Gt.d) null, j12, (List) null, (Throwable) null, false, 29, (Object) null)));
    }

    /* access modifiers changed from: private */
    public static final boolean B0(A a10) {
        C17542s.j(a10, "it");
        return a10 instanceof A.k;
    }

    private final void C0(Gt.g gVar) {
        z value;
        z zVar;
        if (gVar != null) {
            C16505B<z> b10 = this.f82135I;
            do {
                value = b10.getValue();
                zVar = value;
            } while (!b10.e(value, z.b(zVar, (Gt.d) null, (List) null, j1(zVar.f(), new C.c(gVar.a())), (Throwable) null, false, 27, (Object) null)));
        }
    }

    private final void D0() {
        C16534i.M(C16534i.R(C16534i.e0(new e(getState()), 1), new f(this, (C17164e<? super f>) null)), g0.a(this));
    }

    /* access modifiers changed from: private */
    public final void E0() {
        z value;
        C16505B<z> b10 = this.f82135I;
        do {
            value = b10.getValue();
        } while (!b10.e(value, z.b(value, (Gt.d) null, (List) null, (List) null, (Throwable) null, false, 23, (Object) null)));
    }

    private final void F0() {
        y value;
        this.f82135I.setValue(new z((Gt.d) null, (List) null, (List) null, (Throwable) null, false, 31, (DefaultConstructorMarker) null));
        C16505B<y> b10 = this.f82136J;
        do {
            value = b10.getValue();
        } while (!b10.e(value, y.b(value, (Gt.a) null, (C15129b) null, (Es.a) null, (w) null, C10751n.a.f82353a, (v) null, (Mt.a) null, 111, (Object) null)));
    }

    private final void G0() {
        C16534i.M(C16534i.g0(C16534i.T(this.f82137K, new h((C17164e<? super h>) null)), new g((C17164e) null, this)), g0.a(this));
    }

    private final String M0() {
        return this.f82138L.b();
    }

    /* access modifiers changed from: private */
    public final String N0() {
        return this.f82138L.c();
    }

    private final void O0(Mt.a aVar) {
        C16534i.M(C16534i.l(C16534i.e0(this.f82128B.n(), 1), C16534i.e0(this.f82128B.f(), 1), C16534i.e0(this.f82131E.d().isEnabled(), 1), C16534i.e0(C16534i.A(this.f82153u.b()), 1), new q(this, aVar, (C17164e<? super q>) null)), g0.a(this));
    }

    private final void P0() {
        y value;
        C16505B<y> b10 = this.f82136J;
        do {
            value = b10.getValue();
        } while (!b10.e(value, y.b(value, (Gt.a) null, (C15129b) null, (Es.a) null, (w) null, (C10751n) null, (v) null, (Mt.a) null, 63, (Object) null)));
        C16534i.M(C16534i.l(C16534i.e0(this.f82128B.n(), 1), C16534i.e0(this.f82128B.f(), 1), C16534i.e0(this.f82131E.d().isEnabled(), 1), C16534i.e0(C16534i.A(this.f82153u.b()), 1), new r(this, (C17164e<? super r>) null)), g0.a(this));
    }

    private final void Q0(String str) {
        C16534i.M(C16534i.R(C16534i.e0(new s(getState()), 1), new t(str, this, (C17164e<? super t>) null)), g0.a(this));
    }

    private final void R0(Gt.b bVar) {
        t value;
        t value2;
        t value3;
        int i10 = C10735b.f82169a[bVar.ordinal()];
        if (i10 == 1) {
            C16505B<t> b10 = this.f82141O;
            do {
                value = b10.getValue();
                t tVar = value;
            } while (!b10.e(value, t.a.f.f82430a));
        } else if (i10 == 2) {
            C16505B<t> b11 = this.f82141O;
            do {
                value2 = b11.getValue();
                t tVar2 = value2;
            } while (!b11.e(value2, t.a.d.f82428a));
        } else if (i10 == 3) {
            C16505B<t> b12 = this.f82141O;
            do {
                value3 = b12.getValue();
                t tVar3 = value3;
            } while (!b12.e(value3, t.a.p.f82442a));
        } else if (i10 != 4) {
            throw new XH.t();
        }
    }

    private final void S0() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new u(this, (C17164e<? super u>) null), 3, (Object) null);
    }

    private final void T0(c1 c1Var) {
        char c10;
        t value;
        t value2;
        c1.d dVar;
        t value3;
        t value4;
        String str;
        c1 c1Var2 = c1Var;
        boolean z10 = c1Var2 instanceof c1.a;
        String str2 = DslKt.INDICATOR_BACKGROUND;
        Class<I> cls = I.class;
        if (z10) {
            IllegalStateException illegalStateException = new IllegalStateException("Should not be possible to add item to cart");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str3 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str4 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str = str2;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str = str2;
                }
                String str5 = str4;
                bVar.a(eVar, str5, false, illegalStateException, str3);
                str4 = str5;
                str2 = str;
            }
            return;
        }
        String str6 = str2;
        if (c1Var2 instanceof c1.b) {
            E(C10749l.m.f82347a);
            C16505B<t> b10 = this.f82141O;
            do {
                value4 = b10.getValue();
                t tVar = value4;
            } while (!b10.e(value4, new t.a.j((c1.b) c1Var2)));
        } else if (c1Var2 instanceof c1.c) {
            C16505B<t> b11 = this.f82141O;
            do {
                value3 = b11.getValue();
                t tVar2 = value3;
            } while (!b11.e(value3, new t.a.b(((c1.c) c1Var2).a())));
        } else if (c1Var2 instanceof c1.d) {
            C16505B<t> b12 = this.f82141O;
            do {
                value2 = b12.getValue();
                t tVar3 = value2;
                dVar = (c1.d) c1Var2;
            } while (!b12.e(value2, new t.a.C1617a(dVar.b(), dVar.a())));
        } else if (c1Var2 instanceof c1.e) {
            c1.e eVar2 = (c1.e) c1Var2;
            E(new C10749l.n(new C11991a.g.C2462a(eVar2.a())));
            C16505B<t> b13 = this.f82141O;
            do {
                value = b13.getValue();
                t tVar4 = value;
            } while (!b13.e(value, new t.a.k(eVar2.a())));
        } else if (c1Var2 instanceof c1.f) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Should not be possible to click link");
            qv.e eVar3 = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar3, false)) {
                    arrayList2.add(next2);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str7 == null) {
                    String a11 = C11818a.a((String) null, illegalStateException2);
                    if (a11 != null) {
                        str7 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str8 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    c10 = '$';
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str6) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    c10 = '$';
                }
                char c11 = c10;
                bVar2.a(eVar3, str8, false, illegalStateException2, str7);
            }
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public final void V0(Es.a aVar) {
        y value;
        C16505B<y> b10 = this.f82136J;
        do {
            value = b10.getValue();
        } while (!b10.e(value, y.b(value, (Gt.a) null, (C15129b) null, aVar, (w) null, (C10751n) null, (v) null, (Mt.a) null, 123, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void W0(boolean z10) {
        y value;
        y yVar;
        C16505B<y> b10 = this.f82136J;
        do {
            value = b10.getValue();
            yVar = value;
        } while (!b10.e(value, y.b(yVar, (Gt.a) null, (C15129b) null, (Es.a) null, w.b(yVar.h(), false, false, z10, 3, (Object) null), (C10751n) null, (v) null, (Mt.a) null, 119, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void X0(C15129b bVar) {
        y value;
        C16505B<y> b10 = this.f82136J;
        do {
            value = b10.getValue();
        } while (!b10.e(value, y.b(value, (Gt.a) null, bVar, (Es.a) null, (w) null, (C10751n) null, (v) null, (Mt.a) null, 125, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void Y0(e.a aVar, boolean z10) {
        z value;
        z zVar;
        y value2;
        if (aVar instanceof e.a.c) {
            C16505B<y> b10 = this.f82136J;
            do {
                value2 = b10.getValue();
            } while (!b10.e(value2, y.b(value2, (Gt.a) null, (C15129b) null, (Es.a) null, (w) null, new C10751n.b(0, ((e.a.c) aVar).a()), (v) null, (Mt.a) null, 111, (Object) null)));
        } else if (aVar instanceof e.a.b) {
            F0();
            i1(true);
            e.a.b bVar = (e.a.b) aVar;
            k1(bVar.a(), bVar.b(), bVar.c(), C16877v.n(), z10);
            if (!z10) {
                r0(bVar.a());
            }
            t0(bVar.a());
        } else if (aVar instanceof e.a.f) {
            if (z10) {
                C16505B<z> b11 = this.f82135I;
                do {
                    value = b11.getValue();
                    zVar = value;
                } while (!b11.e(value, z.b(zVar, (Gt.d) null, j1(zVar.c(), A.d.f82045a), (List) null, (Throwable) null, false, 29, (Object) null)));
            }
            e.a.f fVar = (e.a.f) aVar;
            k1(fVar.b(), fVar.c(), fVar.d(), fVar.a(), z10);
            i1(false);
        } else if (aVar instanceof e.a.h) {
            y0((e.a.h) aVar, z10);
        } else if (aVar instanceof e.a.C2326a) {
            e.a.C2326a aVar2 = (e.a.C2326a) aVar;
            p0(aVar2.a());
            q0(aVar2.a());
        } else if (aVar instanceof e.a.d) {
            s0(((e.a.d) aVar).a());
        } else if (aVar instanceof e.a.j) {
            e.a.j jVar = (e.a.j) aVar;
            d1(jVar.a());
            C0(jVar.a());
        } else if (aVar instanceof e.a.i) {
            A0((e.a.i) aVar);
        } else if (aVar instanceof e.a.g) {
            w0((e.a.g) aVar);
        } else if (aVar instanceof e.a.C2327e) {
            u0((e.a.C2327e) aVar);
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public final void Z0(Throwable th2) {
        z value;
        i1(false);
        C16505B<z> b10 = this.f82135I;
        do {
            value = b10.getValue();
        } while (!b10.e(value, z.b(value, (Gt.d) null, (List) null, (List) null, th2, false, 23, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void a1(kD.o oVar) {
        y value;
        Gt.a a10 = Ft.a.a(oVar);
        boolean isLoggedIn = this.f82128B.isLoggedIn();
        C16505B<y> b10 = this.f82136J;
        do {
            value = b10.getValue();
        } while (!b10.e(value, y.b(value, a10 == null ? isLoggedIn ? null : a.b.f81206a : a10, (C15129b) null, (Es.a) null, (w) null, (C10751n) null, (v) null, (Mt.a) null, 126, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void b1() {
        t value;
        this.f82150r.b();
        C16505B<t> b10 = this.f82141O;
        do {
            value = b10.getValue();
            t tVar = value;
        } while (!b10.e(value, new t.a.m(Ae.l.STORE_PAGE_SHORTCUT)));
    }

    /* access modifiers changed from: private */
    public final void c1(String str, String str2) {
        t value;
        this.f82134H.f(str, str2);
        C16505B<t> b10 = this.f82141O;
        do {
            value = b10.getValue();
            t tVar = value;
        } while (!b10.e(value, new t.a.r(str, str2)));
    }

    private final void d1(Gt.g gVar) {
        if (gVar != null) {
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new z(this, gVar, (C17164e<? super z>) null), 3, (Object) null);
        }
    }

    private final <T> List<T> e1(List<? extends T> list, C17642l<? super T, Boolean> lVar) {
        List<T> w12 = C16877v.w1(list);
        Iterator<? extends T> it = list.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (lVar.invoke(it.next()).booleanValue()) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            w12.remove(i10);
        }
        return w12;
    }

    private final void g1() {
        C16534i.M(C16534i.R(C16534i.e0(C16534i.A(this.f82131E.f().c()), 1), new C(this, (C17164e<? super C>) null)), g0.a(this));
    }

    /* access modifiers changed from: private */
    public final void h1() {
        c.a.a(this.f82157y, "store_page_benefit_interest", (Map) null, (Map) null, 6, (Object) null);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new D(this, (C17164e<? super D>) null), 3, (Object) null);
    }

    private final void i1(boolean z10) {
        z value;
        C16505B<z> b10 = this.f82135I;
        do {
            value = b10.getValue();
        } while (!b10.e(value, z.b(value, (Gt.d) null, (List) null, (List) null, (Throwable) null, z10, 15, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final <T> List<T> j1(List<? extends T> list, T t10) {
        List<T> w12 = C16877v.w1(list);
        Iterator<? extends T> it = list.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (it.next().getClass() == t10.getClass()) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            w12.add(t10);
        } else {
            w12.set(i10, t10);
        }
        return w12;
    }

    private final void k1(String str, String str2, boolean z10, List<C13018a.C2677a.C2678a> list, boolean z11) {
        z value;
        List<C13018a.C2677a.C2678a> list2 = list;
        Gt.f fVar = new Gt.f(str, str2, z10, Ft.d.c(list2, this.f82152t), Ft.d.b(list2, this.f82152t), z11);
        C16505B<y> b10 = this.f82136J;
        while (true) {
            y value2 = b10.getValue();
            if (b10.e(value2, y.b(value2, (Gt.a) null, (C15129b) null, (Es.a) null, (w) null, new C10751n.c(fVar), (v) null, (Mt.a) null, 111, (Object) null))) {
                break;
            }
            String str3 = str;
        }
        List f10 = this.f82135I.getValue().f();
        if (fVar.f()) {
            f10 = j1(f10, C.e.f82103a);
        }
        List j12 = j1(f10, new C.h(str));
        C16505B<z> b11 = this.f82135I;
        do {
            value = b11.getValue();
        } while (!b11.e(value, z.b(value, (Gt.d) null, (List) null, j12, (Throwable) null, false, 27, (Object) null)));
    }

    private final void p0(C12554a aVar) {
        Object obj;
        z value;
        z zVar;
        List<T> j12;
        String str = null;
        C12554a.C2567a a10 = aVar != null ? aVar.a() : null;
        Iterator it = this.f82135I.getValue().c().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((A) obj) instanceof A.b) {
                break;
            }
        }
        A.b bVar = obj instanceof A.b ? (A.b) obj : null;
        if (bVar == null) {
            bVar = new A.b(C16877v.n());
        }
        List w12 = C16877v.w1(bVar.c());
        ArrayList arrayList = new ArrayList();
        for (Object next : w12) {
            if (next instanceof C10752o.a) {
                arrayList.add(next);
            }
        }
        w12.removeAll(arrayList);
        if (a10 != null) {
            str = a10.a();
        }
        w12.addAll(str == null ? C16877v.n() : C16877v.e(new C10752o.a(a10.c(), a10.a())));
        boolean isEmpty = w12.isEmpty();
        C16505B<z> b10 = this.f82135I;
        do {
            value = b10.getValue();
            zVar = value;
            if (isEmpty) {
                j12 = e1(zVar.c(), L.f82295a);
            } else if (!isEmpty) {
                j12 = j1(zVar.c(), bVar.b(w12));
            } else {
                throw new XH.t();
            }
        } while (!b10.e(value, z.b(zVar, (Gt.d) null, j12, (List) null, (Throwable) null, false, 29, (Object) null)));
    }

    private final void q0(C12554a aVar) {
        C12554a.C2567a a10;
        z value;
        z zVar;
        if (aVar != null && (a10 = aVar.a()) != null) {
            C16505B<z> b10 = this.f82135I;
            do {
                value = b10.getValue();
                zVar = value;
            } while (!b10.e(value, z.b(zVar, (Gt.d) null, (List) null, j1(zVar.f(), new C.a(a10.c(), a10.a(), a10.b(), aVar.b())), (Throwable) null, false, 27, (Object) null)));
        }
    }

    private final F0 r0(String str) {
        return C16314k.d(g0.a(this), (C17168i) null, (T) null, new C10736c(this, str, (C17164e<? super C10736c>) null), 3, (Object) null);
    }

    private final void s0(GB.e eVar) {
        z value;
        C16505B<z> b10 = this.f82135I;
        do {
            value = b10.getValue();
        } while (!b10.e(value, z.b(value, eVar != null ? Ft.c.a(eVar, this.f82155w) : null, (List) null, (List) null, (Throwable) null, false, 30, (Object) null)));
    }

    private final void t0(String str) {
        C16534i.M(b.b(C16534i.R(C16534i.s(this.f82156x.a(str)), new C10737d(this, str, (C17164e<? super C10737d>) null)), (nI.p) null, 1, (Object) null), g0.a(this));
    }

    private final void u0(e.a.C2327e eVar) {
        z value;
        z zVar;
        List<T> j12;
        C16505B<z> b10 = this.f82135I;
        do {
            value = b10.getValue();
            zVar = value;
            boolean z10 = eVar.a() == null;
            if (z10) {
                j12 = e1(zVar.c(), new G());
            } else if (!z10) {
                j12 = j1(zVar.c(), new A.g(eVar.a()));
            } else {
                throw new XH.t();
            }
        } while (!b10.e(value, z.b(zVar, (Gt.d) null, j12, (List) null, (Throwable) null, false, 29, (Object) null)));
    }

    /* access modifiers changed from: private */
    public static final boolean v0(A a10) {
        C17542s.j(a10, "it");
        return a10 instanceof A.g;
    }

    private final void w0(e.a.g gVar) {
        z value;
        z zVar;
        List<T> j12;
        C16505B<z> b10 = this.f82135I;
        do {
            value = b10.getValue();
            zVar = value;
            boolean z10 = gVar.a() == null;
            if (z10) {
                j12 = e1(zVar.c(), new H());
            } else if (!z10) {
                j12 = j1(zVar.c(), new A.i(gVar.a()));
            } else {
                throw new XH.t();
            }
        } while (!b10.e(value, z.b(zVar, (Gt.d) null, j12, (List) null, (Throwable) null, false, 29, (Object) null)));
    }

    /* access modifiers changed from: private */
    public static final boolean x0(A a10) {
        C17542s.j(a10, "it");
        return a10 instanceof A.i;
    }

    private final void y0(e.a.h hVar, boolean z10) {
        Object obj;
        z value;
        z zVar;
        List<T> j12;
        z value2;
        z zVar2;
        List<T> j13;
        z value3;
        z zVar3;
        Object obj2;
        Iterable<jt.b> a10 = hVar.a();
        ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
        for (jt.b b10 : a10) {
            arrayList.add(this.f82129C.b(b10));
        }
        Iterator it = this.f82135I.getValue().c().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((A) obj) instanceof A.b) {
                break;
            }
        }
        A.b bVar = obj instanceof A.b ? (A.b) obj : null;
        if (bVar == null) {
            bVar = new A.b(C16877v.n());
        }
        List w12 = C16877v.w1(bVar.c());
        ArrayList arrayList2 = new ArrayList();
        for (Object next : w12) {
            if (next instanceof C10752o.b) {
                arrayList2.add(next);
            }
        }
        w12.removeAll(arrayList2);
        ArrayList<XH.v> arrayList3 = new ArrayList<>();
        for (jt.b bVar2 : hVar.a()) {
            Iterator it2 = bVar2.h().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (C17542s.e(((b.f) obj2).g(), b.f.a.e.f98750a)) {
                    break;
                }
            }
            b.f fVar = (b.f) obj2;
            XH.v a11 = fVar != null ? C16796C.a(bVar2, fVar) : null;
            if (a11 != null) {
                arrayList3.add(a11);
            }
        }
        ArrayList arrayList4 = new ArrayList(C16877v.y(arrayList3, 10));
        for (XH.v vVar : arrayList3) {
            jt.b bVar3 = (jt.b) vVar.a();
            arrayList4.add(new C10752o.b(C13026h.c(bVar3.a().c()), this.f82158z.a((b.f) vVar.b()), bVar3.c(), bVar3.b()));
        }
        w12.addAll(arrayList4);
        boolean isEmpty = w12.isEmpty();
        C16505B<z> b11 = this.f82135I;
        do {
            value = b11.getValue();
            zVar = value;
            if (isEmpty) {
                j12 = e1(zVar.c(), L.f82295a);
            } else if (!isEmpty) {
                j12 = j1(zVar.c(), bVar.b(w12));
            } else {
                throw new XH.t();
            }
        } while (!b11.e(value, z.b(zVar, (Gt.d) null, j12, (List) null, (Throwable) null, false, 29, (Object) null)));
        if (z10) {
            C16505B<z> b12 = this.f82135I;
            do {
                value3 = b12.getValue();
                zVar3 = value3;
            } while (!b12.e(value3, z.b(zVar3, (Gt.d) null, (List) null, j1(zVar3.f(), new C.i(hVar.b(), hVar.c())), (Throwable) null, false, 27, (Object) null)));
            return;
        }
        Xt.b bVar4 = new Xt.b(hVar.c(), C15985a.l(C16877v.k1(arrayList, 3)), hVar.a().size() > 3);
        boolean isEmpty2 = bVar4.a().isEmpty();
        C16505B<z> b13 = this.f82135I;
        do {
            value2 = b13.getValue();
            zVar2 = value2;
            if (isEmpty2) {
                j13 = e1(zVar2.c(), new E());
            } else if (!isEmpty2) {
                j13 = j1(zVar2.c(), new A.j(bVar4));
            } else {
                throw new XH.t();
            }
        } while (!b13.e(value2, z.b(zVar2, (Gt.d) null, j13, (List) null, (Throwable) null, false, 29, (Object) null)));
    }

    /* access modifiers changed from: private */
    public static final boolean z0(A a10) {
        C17542s.j(a10, "it");
        return a10 instanceof A.j;
    }

    public C16519P<t> C() {
        return this.f82142P;
    }

    public C16519P<x> D() {
        return this.f82144R;
    }

    public void E(C10749l lVar) {
        C17542s.j(lVar, "analyticsAction");
        if (lVar instanceof C10749l.C1615l) {
            this.f82150r.j(((C10749l.C1615l) lVar).a());
        } else if (lVar instanceof C10749l.c) {
            this.f82150r.m(((C10749l.c) lVar).a());
        } else if (lVar instanceof C10749l.a) {
            this.f82150r.g(((C10749l.a) lVar).a());
        } else if (lVar instanceof C10749l.j) {
            this.f82150r.o(((C10749l.j) lVar).a());
        } else if (lVar instanceof C10749l.p) {
            this.f82150r.p();
        } else if (C17542s.e(lVar, C10749l.b.f82330a)) {
            c.a.a(this.f82157y, "instore_open_plp_offers", (Map) null, (Map) null, 6, (Object) null);
            this.f82150r.i();
        } else if (C17542s.e(lVar, C10749l.e.f82333a)) {
            c.a.a(this.f82157y, "instore_open_plp_offers", (Map) null, (Map) null, 6, (Object) null);
            this.f82150r.h();
        } else if (lVar instanceof C10749l.i) {
            C10749l.i iVar = (C10749l.i) lVar;
            this.f82150r.l(iVar.b(), iVar.d(), iVar.a(), iVar.c());
        } else if (lVar instanceof C10749l.g) {
            C10749l.g gVar = (C10749l.g) lVar;
            this.f82151s.d(gVar.b(), gVar.a(), a.C1743a.CAROUSEL_INSTORE_PAGE);
        } else if (lVar instanceof C10749l.h) {
            C10749l.h hVar = (C10749l.h) lVar;
            this.f82151s.b(hVar.b(), hVar.a());
        } else if (C17542s.e(lVar, C10749l.d.f82332a)) {
            this.f82150r.a();
        } else if (C17542s.e(lVar, C10749l.m.f82347a)) {
            this.f82150r.q();
        } else if (lVar instanceof C10749l.n) {
            c.a.a(this.f82157y, "instore_open_plp_offers", (Map) null, (Map) null, 6, (Object) null);
            this.f82150r.n(((C10749l.n) lVar).a());
        } else if (lVar instanceof C10749l.f) {
            this.f82150r.e(((C10749l.f) lVar).a());
        } else if (lVar instanceof C10749l.o) {
            this.f82150r.f(((C10749l.o) lVar).a());
        } else if (lVar instanceof C10749l.k) {
            C10749l.k kVar = (C10749l.k) lVar;
            this.f82150r.k(kVar.b(), kVar.a());
        } else {
            throw new XH.t();
        }
    }

    /* renamed from: U0 */
    public void b(q qVar) {
        t value;
        q.A a10;
        y value2;
        y value3;
        y value4;
        q.v vVar;
        y value5;
        q.t tVar;
        x value6;
        y value7;
        t value8;
        t value9;
        t value10;
        q.p pVar;
        t value11;
        t value12;
        t value13;
        t value14;
        t value15;
        t value16;
        t value17;
        t value18;
        t value19;
        t value20;
        t value21;
        t value22;
        t value23;
        t value24;
        t value25;
        t value26;
        q qVar2 = qVar;
        C17542s.j(qVar2, "action");
        if (C17542s.e(qVar2, q.r.f82398a)) {
            C16505B<t> b10 = this.f82141O;
            do {
                value26 = b10.getValue();
                t tVar2 = value26;
            } while (!b10.e(value26, null));
        } else if (C17542s.e(qVar2, q.w.f82407a)) {
            C16505B<t> b11 = this.f82141O;
            do {
                value25 = b11.getValue();
                t tVar3 = value25;
            } while (!b11.e(value25, t.b.a.f82446a));
        } else if (C17542s.e(qVar2, q.k.f82389a)) {
            h1();
            C16505B<t> b12 = this.f82141O;
            do {
                value24 = b12.getValue();
                t tVar4 = value24;
            } while (!b12.e(value24, t.a.g.f82431a));
        } else if (C17542s.e(qVar2, q.C10760h.f82386a)) {
            h1();
            C16505B<t> b13 = this.f82141O;
            do {
                value23 = b13.getValue();
                t tVar5 = value23;
            } while (!b13.e(value23, t.a.d.f82428a));
        } else if (C17542s.e(qVar2, q.G.f82374a)) {
            h1();
            C16505B<t> b14 = this.f82141O;
            do {
                value22 = b14.getValue();
                t tVar6 = value22;
            } while (!b14.e(value22, t.a.q.f82443a));
        } else if (qVar2 instanceof q.y) {
            if (this.f82128B.isLoggedIn()) {
                C16505B<t> b15 = this.f82141O;
                do {
                    value21 = b15.getValue();
                    t tVar7 = value21;
                } while (!b15.e(value21, new t.a.n(((q.y) qVar2).a())));
                return;
            }
            C16505B<t> b16 = this.f82141O;
            do {
                value20 = b16.getValue();
                t tVar8 = value20;
            } while (!b16.e(value20, t.a.h.f82432a));
        } else if (qVar2 instanceof q.E) {
            C16505B<t> b17 = this.f82141O;
            do {
                value19 = b17.getValue();
                t tVar9 = value19;
            } while (!b17.e(value19, new t.a.o(((q.E) qVar2).a())));
        } else if (C17542s.e(qVar2, q.x.f82408a)) {
            C16505B<t> b18 = this.f82141O;
            do {
                value18 = b18.getValue();
                t tVar10 = value18;
            } while (!b18.e(value18, t.a.p.f82442a));
        } else if (qVar2 instanceof q.D) {
            C16505B<t> b19 = this.f82141O;
            do {
                value17 = b19.getValue();
                t tVar11 = value17;
            } while (!b19.e(value17, new t.a.m(((q.D) qVar2).a())));
        } else if (qVar2 instanceof q.l) {
            R0(((q.l) qVar2).a());
        } else if (qVar2 instanceof q.H) {
            C16505B<t> b20 = this.f82141O;
            do {
                value16 = b20.getValue();
                t tVar12 = value16;
            } while (!b20.e(value16, new t.a.r(((q.H) qVar2).a(), (String) null, 2, (DefaultConstructorMarker) null)));
        } else if (qVar2 instanceof q.i) {
            C16505B<t> b21 = this.f82141O;
            do {
                value15 = b21.getValue();
                t tVar13 = value15;
            } while (!b21.e(value15, new t.a.e(((q.i) qVar2).a())));
        } else if (qVar2 instanceof q.C10753a) {
            q.C10753a aVar = (q.C10753a) qVar2;
            E(new C10749l.h(aVar.b(), aVar.a()));
            C16505B<t> b22 = this.f82141O;
            do {
                value14 = b22.getValue();
                t tVar14 = value14;
            } while (!b22.e(value14, new t.a.c(aVar.b(), (String) null)));
        } else if (qVar2 instanceof q.n) {
            q.n nVar = (q.n) qVar2;
            E(new C10749l.g(nVar.a(), nVar.b()));
            C16505B<t> b23 = this.f82141O;
            do {
                value13 = b23.getValue();
                t tVar15 = value13;
            } while (!b23.e(value13, new t.a.c(nVar.b(), nVar.a())));
        } else if (qVar2 instanceof q.s) {
            C16505B<t> b24 = this.f82141O;
            do {
                value12 = b24.getValue();
                t tVar16 = value12;
            } while (!b24.e(value12, new t.a.i(((q.s) qVar2).a())));
        } else if (qVar2 instanceof q.o) {
            T0(((q.o) qVar2).a());
        } else if (C17542s.e(qVar2, q.C1616q.f82397a)) {
            E(new C10749l.n(C11991a.g.b.f103410a));
            C16505B<t> b25 = this.f82141O;
            do {
                value11 = b25.getValue();
                t tVar17 = value11;
            } while (!b25.e(value11, new t.a.l(c.a.REDUCED_PRICE_OR_BTI, Interaction$Component.OFFERS_CAROUSEL)));
        } else if (qVar2 instanceof q.p) {
            C16505B<t> b26 = this.f82141O;
            do {
                value10 = b26.getValue();
                t tVar18 = value10;
                pVar = (q.p) qVar2;
            } while (!b26.e(value10, new t.a.c(pVar.b(), pVar.a())));
        } else if (C17542s.e(qVar2, q.C.f82370a)) {
            f1();
        } else if (C17542s.e(qVar2, q.C10758f.f82384a)) {
            C16505B<t> b27 = this.f82141O;
            do {
                value9 = b27.getValue();
                t tVar19 = value9;
            } while (!b27.e(value9, u.f82448a));
        } else if (qVar2 instanceof q.C10759g) {
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new v(this, (C17164e<? super v>) null), 3, (Object) null);
        } else if (C17542s.e(qVar2, q.z.f82410a)) {
            C16505B<t> b28 = this.f82141O;
            do {
                value8 = b28.getValue();
                t tVar20 = value8;
            } while (!b28.e(value8, t.b.C1618b.f82447a));
        } else if (C17542s.e(qVar2, q.m.f82391a)) {
            C10751n d10 = this.f82136J.getValue().d();
            C10751n.b bVar = d10 instanceof C10751n.b ? (C10751n.b) d10 : null;
            if (bVar != null) {
                int d11 = (bVar.d() + 1) % bVar.c().size();
                C16505B<y> b29 = this.f82136J;
                do {
                    value7 = b29.getValue();
                } while (!b29.e(value7, y.b(value7, (Gt.a) null, (C15129b) null, (Es.a) null, (w) null, C10751n.b.b(bVar, d11, (C15990f) null, 2, (Object) null), (v) null, (Mt.a) null, 111, (Object) null)));
            }
        } else if (C17542s.e(qVar2, q.j.f82388a)) {
            S0();
            D0();
            g1();
        } else if (qVar2 instanceof q.C10757e) {
            q.C10757e eVar = (q.C10757e) qVar2;
            if (eVar instanceof q.C10757e.a) {
                F0 unused2 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new w(this, qVar2, (C17164e<? super w>) null), 3, (Object) null);
            } else if (eVar instanceof q.C10757e.c) {
                F0 unused3 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new x(this, qVar2, (C17164e<? super x>) null), 3, (Object) null);
            } else {
                throw new XH.t();
            }
            C16505B<x> b30 = this.f82143Q;
            do {
                value6 = b30.getValue();
                x xVar = value6;
            } while (!b30.e(value6, null));
        } else if (qVar2 instanceof q.t) {
            C16505B<y> b31 = this.f82136J;
            do {
                value5 = b31.getValue();
                tVar = (q.t) qVar2;
            } while (!b31.e(value5, y.b(value5, (Gt.a) null, (C15129b) null, (Es.a) null, (w) null, (C10751n) null, new v.a(tVar.c(), tVar.b(), tVar.a()), (Mt.a) null, 95, (Object) null)));
        } else if (qVar2 instanceof q.v) {
            C16505B<y> b32 = this.f82136J;
            do {
                value4 = b32.getValue();
                vVar = (q.v) qVar2;
            } while (!b32.e(value4, y.b(value4, (Gt.a) null, (C15129b) null, (Es.a) null, (w) null, (C10751n) null, new v.b(vVar.c(), vVar.b(), vVar.a()), (Mt.a) null, 95, (Object) null)));
        } else if (C17542s.e(qVar2, q.u.f82403a)) {
            C16505B<y> b33 = this.f82136J;
            do {
                value3 = b33.getValue();
            } while (!b33.e(value3, y.b(value3, (Gt.a) null, (C15129b) null, (Es.a) null, (w) null, (C10751n) null, (v) null, (Mt.a) null, 95, (Object) null)));
        } else if (C17542s.e(qVar2, q.C10756d.f82380a)) {
            P0();
        } else if (qVar2 instanceof q.C10754b) {
            O0(((q.C10754b) qVar2).a());
        } else if (C17542s.e(qVar2, q.C10755c.f82379a)) {
            C16505B<y> b34 = this.f82136J;
            do {
                value2 = b34.getValue();
            } while (!b34.e(value2, y.b(value2, (Gt.a) null, (C15129b) null, (Es.a) null, (w) null, (C10751n) null, (v) null, (Mt.a) null, 63, (Object) null)));
        } else if (qVar2 instanceof q.F) {
            E(new C10749l.o(((q.F) qVar2).a()));
        } else if (qVar2 instanceof q.A) {
            C16505B<t> b35 = this.f82141O;
            do {
                value = b35.getValue();
                t tVar21 = value;
                a10 = (q.A) qVar2;
            } while (!b35.e(value, new t.a.o(a10.a())));
            E(new C10749l.k(a10.a(), C11991a.e.OPEN));
        } else if (qVar2 instanceof q.B) {
            F0 unused4 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new y(this, (C17164e<? super y>) null), 3, (Object) null);
            E(new C10749l.k(((q.B) qVar2).a(), C11991a.e.DISMISS));
        } else {
            throw new XH.t();
        }
    }

    public final void f1() {
        C11717a.a(this, new A(this, (C17164e<? super A>) null));
    }

    public C16519P<B> getState() {
        return this.f82140N;
    }
}
