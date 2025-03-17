package com.sugarcube.core.network.api;

import GK.C15775C;
import GK.C15777E;
import GK.C15806y;
import QL.x;
import VL.C16699a;
import VL.C16700b;
import VL.C16704f;
import VL.C16710l;
import VL.o;
import VL.p;
import VL.q;
import VL.r;
import VL.s;
import VL.t;
import VL.y;
import XH.C16814e;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.core.network.models.Authentication;
import com.sugarcube.core.network.models.CatalogCategory;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.CatalogItemVariants;
import com.sugarcube.core.network.models.CatalogPage;
import com.sugarcube.core.network.models.CatalogSearchPage;
import com.sugarcube.core.network.models.ChangePasswordRequest;
import com.sugarcube.core.network.models.CompiledComposition;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.CompositionRequest;
import com.sugarcube.core.network.models.CreateSceneRequest;
import com.sugarcube.core.network.models.CreateUploadSetRequest;
import com.sugarcube.core.network.models.LoginSignUpRequest;
import com.sugarcube.core.network.models.MobileDevice;
import com.sugarcube.core.network.models.PrivacyPolicyAcknowledgeRequest;
import com.sugarcube.core.network.models.QuickFilter;
import com.sugarcube.core.network.models.ResetPasswordRequest;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.core.network.models.SalesDressedBedDataResponse;
import com.sugarcube.core.network.models.SceneResponse;
import com.sugarcube.core.network.models.Showroom;
import com.sugarcube.core.network.models.StatusResponse;
import com.sugarcube.core.network.models.UpdateUploadSetRequest;
import com.sugarcube.core.network.models.UploadSetState;
import com.sugarcube.core.network.models.UserResponse;
import dI.C17164e;
import fI.C17220a;
import fI.C17221b;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0004\u0001\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H§@¢\u0006\u0004\b\u0010\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H§@¢\u0006\u0004\b\u0017\u0010\u000fJ \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u0014H§@¢\u0006\u0004\b\u001f\u0010 J@\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u00042\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\b'\u0010(J \u0010*\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010\u0003\u001a\u00020)H§@¢\u0006\u0004\b*\u0010+J \u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\b\b\u0001\u0010\u0003\u001a\u00020,H§@¢\u0006\u0004\b.\u0010/J \u00101\u001a\b\u0012\u0004\u0012\u00020-0\u00042\b\b\u0001\u0010\u001e\u001a\u000200H§@¢\u0006\u0004\b1\u00102J*\u00104\u001a\b\u0012\u0004\u0012\u00020-0\u00042\b\b\u0001\u0010\u001e\u001a\u0002002\b\b\u0001\u0010\u0003\u001a\u000203H§@¢\u0006\u0004\b4\u00105J,\u00106\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010\u001e\u001a\u0002002\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\b6\u00107J \u00108\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u001e\u001a\u000200H§@¢\u0006\u0004\b8\u00102J<\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0%0\u00042\n\b\u0003\u00109\u001a\u0004\u0018\u0001002\b\b\u0003\u0010:\u001a\u00020\u00142\b\b\u0003\u0010!\u001a\u00020\u0014H§@¢\u0006\u0004\b<\u0010=J6\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00042\b\b\u0001\u0010\u001e\u001a\u0002002\b\b\u0001\u0010>\u001a\u00020\"2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\b@\u0010AJ \u0010B\u001a\b\u0012\u0004\u0012\u00020;0\u00042\b\b\u0001\u0010\u001e\u001a\u000200H§@¢\u0006\u0004\bB\u00102J*\u0010E\u001a\b\u0012\u0004\u0012\u00020;0\u00042\b\b\u0001\u0010\u001e\u001a\u0002002\b\b\u0001\u0010D\u001a\u00020CH§@¢\u0006\u0004\bE\u0010FJ \u0010G\u001a\b\u0012\u0004\u0012\u00020;0\u00042\b\b\u0001\u0010D\u001a\u00020CH§@¢\u0006\u0004\bG\u0010HJ*\u0010I\u001a\b\u0012\u0004\u0012\u00020;0\u00042\b\b\u0001\u0010\u001e\u001a\u0002002\b\b\u0001\u0010D\u001a\u00020CH§@¢\u0006\u0004\bI\u0010FJ \u0010J\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u001e\u001a\u000200H§@¢\u0006\u0004\bJ\u00102J<\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0%0\u00042\b\b\u0001\u0010K\u001a\u00020\u00142\b\b\u0001\u0010>\u001a\u00020\"2\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\bN\u0010OJ`\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0%0\u00042\b\b\u0001\u0010K\u001a\u00020\u00142\b\b\u0001\u0010>\u001a\u00020\"2\n\b\u0003\u0010Q\u001a\u0004\u0018\u00010P2\n\b\u0003\u0010R\u001a\u0004\u0018\u00010P2\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\bT\u0010UJ`\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0%0\u00042\b\b\u0001\u0010V\u001a\u00020\u00142\b\b\u0001\u0010>\u001a\u00020\"2\n\b\u0003\u0010Q\u001a\u0004\u0018\u00010P2\n\b\u0003\u0010R\u001a\u0004\u0018\u00010P2\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\bW\u0010UJ6\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u00042\b\b\u0001\u0010X\u001a\u00020P2\b\b\u0001\u0010>\u001a\u00020\"2\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\bZ\u0010[JL\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u00042\b\b\u0001\u0010X\u001a\u00020P2\b\b\u0001\u0010>\u001a\u00020\"2\b\b\u0003\u0010\\\u001a\u00020P2\n\b\u0003\u0010]\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\b_\u0010`J\u0001\u0010g\u001a\b\u0012\u0004\u0012\u00020^0\u00042\b\b\u0001\u0010>\u001a\u00020\"2\b\b\u0003\u0010\\\u001a\u00020P2\n\b\u0003\u0010a\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010b\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010c\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010d\u001a\u0004\u0018\u00010\"2\n\b\u0003\u0010e\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010S\u001a\u00020\u00142\n\b\u0003\u0010]\u001a\u0004\u0018\u00010\u00142\b\b\u0003\u0010f\u001a\u00020P2\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\bg\u0010hJ \u0010g\u001a\b\u0012\u0004\u0012\u00020^0\u00042\b\b\u0001\u0010j\u001a\u00020iH§@¢\u0006\u0004\bg\u0010kJ\u0001\u0010o\u001a\b\u0012\u0004\u0012\u00020n0\u00042\b\b\u0001\u0010l\u001a\u00020\u00142\b\b\u0001\u0010>\u001a\u00020\"2\b\b\u0003\u0010\\\u001a\u00020P2\n\b\u0003\u0010a\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010b\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010c\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010m\u001a\u0004\u0018\u00010\u00142\b\b\u0003\u0010d\u001a\u00020\"2\n\b\u0003\u0010e\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010S\u001a\u00020\u00142\n\b\u0003\u0010]\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\bo\u0010pJJ\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0%0\u00042\b\b\u0001\u0010>\u001a\u00020\"2\n\b\u0003\u0010q\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010b\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\bs\u0010tJ0\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0%0\u00042\b\b\u0001\u0010X\u001a\u00020P2\b\b\u0001\u0010>\u001a\u00020\"H§@¢\u0006\u0004\bu\u0010vJ<\u0010{\u001a\b\u0012\u0004\u0012\u00020&0\u00042\u0014\b\u0001\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020x0w2\u000e\b\u0001\u0010z\u001a\b\u0012\u0004\u0012\u00020y0%H§@¢\u0006\u0004\b{\u0010|J \u0010}\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u00109\u001a\u000200H§@¢\u0006\u0004\b}\u00102J#\u0010\u0001\u001a\b\u0012\u0004\u0012\u000200\u00042\b\b\u0001\u0010~\u001a\u00020PH§@¢\u0006\u0006\b\u0001\u0010\u0001J,\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010%0\u00042\u000b\b\u0003\u0010\u0001\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0005\b\u0001\u0010 JG\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010%0\u00042\u000b\b\u0003\u0010\u0001\u001a\u0004\u0018\u00010\u00142\u000b\b\u0003\u0010\u0001\u001a\u0004\u0018\u00010\u00142\u000b\b\u0003\u0010]\u001a\u0005\u0018\u00010\u0001H§@¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0004H§@¢\u0006\u0005\b\u0001\u0010\u000fJ0\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020&0\u00042\t\b\u0001\u0010\u0001\u001a\u00020\u00142\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0006\b\u0001\u0010\u0001J$\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020;0\u00042\t\b\u0001\u0010\u0001\u001a\u00020PH§@¢\u0006\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/sugarcube/core/network/api/NetworkAPIs;", "", "Lcom/sugarcube/core/network/models/LoginSignUpRequest;", "body", "LQL/x;", "Lcom/sugarcube/core/network/models/Authentication;", "signUpWithEmail", "(Lcom/sugarcube/core/network/models/LoginSignUpRequest;LdI/e;)Ljava/lang/Object;", "loginEmail", "Lcom/sugarcube/core/network/models/ResetPasswordRequest;", "LGK/E;", "resetPassword", "(Lcom/sugarcube/core/network/models/ResetPasswordRequest;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/UserResponse;", "getUser", "(LdI/e;)Ljava/lang/Object;", "deleteUser", "Lcom/sugarcube/core/network/models/ChangePasswordRequest;", "changePassword", "(Lcom/sugarcube/core/network/models/ChangePasswordRequest;LdI/e;)Ljava/lang/Object;", "", "wid", "(Ljava/lang/String;Lcom/sugarcube/core/network/models/ChangePasswordRequest;LdI/e;)Ljava/lang/Object;", "logout", "Lcom/sugarcube/core/network/models/MobileDevice;", "postDevice", "(Lcom/sugarcube/core/network/models/MobileDevice;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/PrivacyPolicyAcknowledgeRequest;", "acknowledgePrivacyPolicy", "(Lcom/sugarcube/core/network/models/PrivacyPolicyAcknowledgeRequest;LdI/e;)Ljava/lang/Object;", "uuid", "deleteDevice", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "includeStock", "", "all", "manifestMode", "", "Lcom/sugarcube/core/network/models/SceneResponse;", "fetchAllScenes", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CreateSceneRequest;", "createScene", "(Lcom/sugarcube/core/network/models/CreateSceneRequest;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CreateUploadSetRequest;", "Lcom/sugarcube/core/network/models/UploadSetState;", "createUploadSet", "(Lcom/sugarcube/core/network/models/CreateUploadSetRequest;LdI/e;)Ljava/lang/Object;", "Ljava/util/UUID;", "getUploadSetState", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/UpdateUploadSetRequest;", "uploadNotify", "(Ljava/util/UUID;Lcom/sugarcube/core/network/models/UpdateUploadSetRequest;LdI/e;)Ljava/lang/Object;", "fetchScene", "(Ljava/util/UUID;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "deleteScene", "sceneUuid", "productDetails", "Lcom/sugarcube/core/network/models/Composition;", "fetchCompositionList", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "hasGoesWell", "Lcom/sugarcube/core/network/models/CompiledComposition;", "fetchCompiledComposition", "(Ljava/util/UUID;ZLjava/lang/String;LdI/e;)Ljava/lang/Object;", "fetchLegacy2DComposition", "Lcom/sugarcube/core/network/models/CompositionRequest;", "composition", "cloneComposition", "(Ljava/util/UUID;Lcom/sugarcube/core/network/models/CompositionRequest;LdI/e;)Ljava/lang/Object;", "createComposition", "(Lcom/sugarcube/core/network/models/CompositionRequest;LdI/e;)Ljava/lang/Object;", "putComposition", "deleteComposition", "idCSV", "geometryType", "Lcom/sugarcube/core/network/models/CatalogItem;", "fetchExactCatalogItems", "(Ljava/lang/String;ZLjava/lang/String;LdI/e;)Ljava/lang/Object;", "", "store", "zip", "region", "fetchProductInformationDetails", "(Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "localIds", "fetchProductInformationDetailsLocalItem", "furnitureId", "Lcom/sugarcube/core/network/models/CatalogItemVariants;", "fetchProductVariants", "(IZLjava/lang/String;LdI/e;)Ljava/lang/Object;", "pageSize", "roomType", "Lcom/sugarcube/core/network/models/CatalogPage;", "fetchCatalogItemSwappables", "(IZILjava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "subCatalogs", "categoryId", "subcategoryId", "stacks", "qaStatus", "itemOffset", "fetchCatalogPage", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;LdI/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "url", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "searchTerm", "moreToken", "Lcom/sugarcube/core/network/models/CatalogSearchPage;", "fetchCatalogSearchPage", "(Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "name", "Lcom/sugarcube/core/network/models/CatalogCategory;", "fetchCatalogCategories", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "fetchProductRecommendations", "(IZLdI/e;)Ljava/lang/Object;", "", "LGK/C;", "LGK/y$c;", "parts", "postCapture", "(Ljava/util/Map;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "resendCompletionEmail", "version", "Lcom/sugarcube/core/network/models/SalesDressedBedDataResponse;", "fetchSalesDressedBedData", "(ILdI/e;)Ljava/lang/Object;", "tags", "Lcom/sugarcube/core/network/models/Showroom;", "fetchShowrooms", "country", "language", "Lcom/sugarcube/core/network/models/RoomType;", "Lcom/sugarcube/core/network/models/QuickFilter;", "getQuickFilters", "(Ljava/lang/String;Ljava/lang/String;Lcom/sugarcube/core/network/models/RoomType;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/StatusResponse;", "getStatus", "id", "getScene", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "getComposition", "GeometryType", "ManifestMode", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NetworkAPIs {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object fetchAllScenes$default(NetworkAPIs networkAPIs, String str, Boolean bool, String str2, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                if ((i10 & 2) != 0) {
                    bool = null;
                }
                if ((i10 & 4) != 0) {
                    str2 = ManifestMode.Companion.default$default(ManifestMode.Companion, false, 1, (Object) null);
                }
                return networkAPIs.fetchAllScenes(str, bool, str2, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchAllScenes");
        }

        public static /* synthetic */ Object fetchCatalogCategories$default(NetworkAPIs networkAPIs, boolean z10, String str, String str2, String str3, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                return networkAPIs.fetchCatalogCategories(z10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogCategories");
        }

        public static /* synthetic */ Object fetchCatalogItemSwappables$default(NetworkAPIs networkAPIs, int i10, boolean z10, int i11, String str, String str2, C17164e eVar, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    i11 = 48;
                }
                int i13 = i11;
                if ((i12 & 8) != 0) {
                    str = null;
                }
                String str3 = str;
                if ((i12 & 16) != 0) {
                    str2 = GeometryType.All.getQueryParamVal();
                }
                return networkAPIs.fetchCatalogItemSwappables(i10, z10, i13, str3, str2, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogItemSwappables");
        }

        public static /* synthetic */ Object fetchCatalogPage$default(NetworkAPIs networkAPIs, boolean z10, int i10, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, int i11, String str7, C17164e eVar, int i12, Object obj) {
            int i13 = i12;
            if (obj == null) {
                return networkAPIs.fetchCatalogPage(z10, (i13 & 2) != 0 ? 48 : i10, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? "GOOD" : str4, str5, (i13 & 256) != 0 ? null : str6, (i13 & 512) != 0 ? 0 : i11, (i13 & 1024) != 0 ? GeometryType.All.getQueryParamVal() : str7, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogPage");
        }

        public static /* synthetic */ Object fetchCatalogSearchPage$default(NetworkAPIs networkAPIs, String str, boolean z10, int i10, String str2, String str3, String str4, String str5, boolean z11, String str6, String str7, String str8, String str9, C17164e eVar, int i11, Object obj) {
            int i12 = i11;
            if (obj == null) {
                return networkAPIs.fetchCatalogSearchPage(str, z10, (i12 & 4) != 0 ? 48 : i10, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, (i12 & 128) != 0 ? true : z11, (i12 & 256) != 0 ? "GOOD" : str6, str7, (i12 & 1024) != 0 ? null : str8, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? GeometryType.All.getQueryParamVal() : str9, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogSearchPage");
        }

        public static /* synthetic */ Object fetchCompiledComposition$default(NetworkAPIs networkAPIs, UUID uuid, boolean z10, String str, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str = ManifestMode.Companion.default$default(ManifestMode.Companion, false, 1, (Object) null);
                }
                return networkAPIs.fetchCompiledComposition(uuid, z10, str, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCompiledComposition");
        }

        public static /* synthetic */ Object fetchCompositionList$default(NetworkAPIs networkAPIs, UUID uuid, String str, String str2, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    uuid = null;
                }
                if ((i10 & 2) != 0) {
                    str = "true";
                }
                if ((i10 & 4) != 0) {
                    str2 = "False";
                }
                return networkAPIs.fetchCompositionList(uuid, str, str2, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCompositionList");
        }

        public static /* synthetic */ Object fetchExactCatalogItems$default(NetworkAPIs networkAPIs, String str, boolean z10, String str2, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str2 = GeometryType.All.getQueryParamVal();
                }
                return networkAPIs.fetchExactCatalogItems(str, z10, str2, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchExactCatalogItems");
        }

        public static /* synthetic */ Object fetchProductInformationDetails$default(NetworkAPIs networkAPIs, String str, boolean z10, Integer num, Integer num2, String str2, String str3, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                return networkAPIs.fetchProductInformationDetails(str, z10, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? GeometryType.All.getQueryParamVal() : str3, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchProductInformationDetails");
        }

        public static /* synthetic */ Object fetchProductInformationDetailsLocalItem$default(NetworkAPIs networkAPIs, String str, boolean z10, Integer num, Integer num2, String str2, String str3, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                return networkAPIs.fetchProductInformationDetailsLocalItem(str, z10, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? GeometryType.All.getQueryParamVal() : str3, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchProductInformationDetailsLocalItem");
        }

        public static /* synthetic */ Object fetchProductVariants$default(NetworkAPIs networkAPIs, int i10, boolean z10, String str, C17164e eVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    str = GeometryType.All.getQueryParamVal();
                }
                return networkAPIs.fetchProductVariants(i10, z10, str, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchProductVariants");
        }

        public static /* synthetic */ Object fetchScene$default(NetworkAPIs networkAPIs, UUID uuid, String str, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = ManifestMode.Companion.default$default(ManifestMode.Companion, false, 1, (Object) null);
                }
                return networkAPIs.fetchScene(uuid, str, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchScene");
        }

        public static /* synthetic */ Object fetchShowrooms$default(NetworkAPIs networkAPIs, String str, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                return networkAPIs.fetchShowrooms(str, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchShowrooms");
        }

        public static /* synthetic */ Object getQuickFilters$default(NetworkAPIs networkAPIs, String str, String str2, RoomType roomType, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                if ((i10 & 2) != 0) {
                    str2 = null;
                }
                if ((i10 & 4) != 0) {
                    roomType = null;
                }
                return networkAPIs.getQuickFilters(str, str2, roomType, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getQuickFilters");
        }

        public static /* synthetic */ Object getScene$default(NetworkAPIs networkAPIs, String str, String str2, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str2 = ManifestMode.Companion.default$default(ManifestMode.Companion, false, 1, (Object) null);
                }
                return networkAPIs.getScene(str, str2, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getScene");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/core/network/api/NetworkAPIs$GeometryType;", "", "queryParamVal", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getQueryParamVal", "()Ljava/lang/String;", "Furniture", "WallArt", "WallPlaceable", "All", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum GeometryType {
        Furniture("3d"),
        WallArt("2d_wall"),
        WallPlaceable("wall_placeable"),
        All("3d,2d_wall,wall_placeable");
        
        private final String queryParamVal;

        static {
            GeometryType[] $values;
            $ENTRIES = C17221b.a($values);
        }

        private GeometryType(String str) {
            this.queryParamVal = str;
        }

        public static C17220a<GeometryType> getEntries() {
            return $ENTRIES;
        }

        public final String getQueryParamVal() {
            return this.queryParamVal;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/sugarcube/core/network/api/NetworkAPIs$ManifestMode;", "", "queryParamVal", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getQueryParamVal", "()Ljava/lang/String;", "Manifest", "GlbUrls", "GlbUrlsAndManifest", "GlbUrlsOrManifest", "Companion", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum ManifestMode {
        Manifest("manifest"),
        GlbUrls("glb_urls"),
        GlbUrlsAndManifest("glb_urls,manifest"),
        GlbUrlsOrManifest("glb_urls_or_manifest ");
        
        public static final Companion Companion = null;
        private final String queryParamVal;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/core/network/api/NetworkAPIs$ManifestMode$Companion;", "", "<init>", "()V", "default", "", "isSceneGltfEnabled", "", "forScenes", "forComposition", "isCompositionsGltfEnabled", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ String default$default(Companion companion, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                return companion.m45default(z10);
            }

            @C16814e
            /* renamed from: default  reason: not valid java name */
            public final String m45default(boolean z10) {
                return !z10 ? ManifestMode.Manifest.getQueryParamVal() : ManifestMode.GlbUrlsAndManifest.getQueryParamVal();
            }

            public final String forComposition(boolean z10, boolean z11) {
                return (!z10 || !z11) ? ManifestMode.Manifest.getQueryParamVal() : ManifestMode.GlbUrlsAndManifest.getQueryParamVal();
            }

            public final String forScenes(boolean z10) {
                return z10 ? ManifestMode.GlbUrlsAndManifest.getQueryParamVal() : ManifestMode.Manifest.getQueryParamVal();
            }

            private Companion() {
            }
        }

        static {
            ManifestMode[] $values;
            $ENTRIES = C17221b.a($values);
            Companion = new Companion((DefaultConstructorMarker) null);
        }

        private ManifestMode(String str) {
            this.queryParamVal = str;
        }

        public static C17220a<ManifestMode> getEntries() {
            return $ENTRIES;
        }

        public final String getQueryParamVal() {
            return this.queryParamVal;
        }
    }

    @o("users/accept_privacy_policy/")
    Object acknowledgePrivacyPolicy(@C16699a PrivacyPolicyAcknowledgeRequest privacyPolicyAcknowledgeRequest, C17164e<? super x<C15777E>> eVar);

    @o("auth/change_password/")
    Object changePassword(@C16699a ChangePasswordRequest changePasswordRequest, C17164e<? super x<C15777E>> eVar);

    @p("users/{wid}/change_password/")
    Object changePassword(@s("wid") String str, @C16699a ChangePasswordRequest changePasswordRequest, C17164e<? super x<C15777E>> eVar);

    @o("compositions/{compositionUuid}/clone/")
    Object cloneComposition(@s("compositionUuid") UUID uuid, @C16699a CompositionRequest compositionRequest, C17164e<? super x<Composition>> eVar);

    @o("compositions/")
    Object createComposition(@C16699a CompositionRequest compositionRequest, C17164e<? super x<Composition>> eVar);

    @o("scenes/capture/")
    Object createScene(@C16699a CreateSceneRequest createSceneRequest, C17164e<? super x<SceneResponse>> eVar);

    @o("uploads/")
    Object createUploadSet(@C16699a CreateUploadSetRequest createUploadSetRequest, C17164e<? super x<UploadSetState>> eVar);

    @C16700b("compositions/{uuid}/")
    Object deleteComposition(@s("uuid") UUID uuid, C17164e<? super x<C15777E>> eVar);

    @C16700b("devices/{uuid}/")
    Object deleteDevice(@s("uuid") String str, C17164e<? super x<C15777E>> eVar);

    @C16700b("scenes/{uuid}/")
    Object deleteScene(@s("uuid") UUID uuid, C17164e<? super x<C15777E>> eVar);

    @C16700b("users/delete")
    Object deleteUser(C17164e<? super x<C15777E>> eVar);

    @C16704f("scenes/")
    Object fetchAllScenes(@t("include_stock") String str, @t("all") Boolean bool, @t("manifest_mode") String str2, C17164e<? super x<List<SceneResponse>>> eVar);

    @C16704f("furniture/categories")
    Object fetchCatalogCategories(@t("has_goes_well") boolean z10, @t("name") String str, @t("category_id") String str2, @t("region") String str3, C17164e<? super x<List<CatalogCategory>>> eVar);

    @C16704f("furniture/{id}/swappables/")
    Object fetchCatalogItemSwappables(@s("id") int i10, @t("has_goes_well") boolean z10, @t("limit") int i11, @t("room_type") String str, @t("geometry_type") String str2, C17164e<? super x<CatalogPage>> eVar);

    @C16704f
    Object fetchCatalogPage(@y Uri uri, C17164e<? super x<CatalogPage>> eVar);

    @C16704f("furniture/")
    Object fetchCatalogPage(@t("has_goes_well") boolean z10, @t("limit") int i10, @t("sub_catalogs") String str, @t("category_id") String str2, @t("sub_category_id") String str3, @t("stacks") Boolean bool, @t("qa_status") String str4, @t("region") String str5, @t("room_type") String str6, @t("offset") int i11, @t("geometry_type") String str7, C17164e<? super x<CatalogPage>> eVar);

    @C16704f("furniture/search?needMore=true")
    Object fetchCatalogSearchPage(@t("q") String str, @t("has_goes_well") boolean z10, @t("size") int i10, @t("sub_catalogs") String str2, @t("category_id") String str3, @t("sub_category_id") String str4, @t("moreToken") String str5, @t("stacks") boolean z11, @t("qa_status") String str6, @t("region") String str7, @t("room_type") String str8, @t("geometry_type") String str9, C17164e<? super x<CatalogSearchPage>> eVar);

    @C16704f("compositions/{compositionUuid}/compiled/?geometry_type=3d,2d_wall,wall_placeable")
    Object fetchCompiledComposition(@s("compositionUuid") UUID uuid, @t("has_goes_well") boolean z10, @t("manifest_mode") String str, C17164e<? super x<CompiledComposition>> eVar);

    @C16704f("compositions/")
    Object fetchCompositionList(@t("scene_uuid") UUID uuid, @t("product_details") String str, @t("include_stock") String str2, C17164e<? super x<List<Composition>>> eVar);

    @C16704f("furniture/")
    Object fetchExactCatalogItems(@t("id__in") String str, @t("has_goes_well") boolean z10, @t("geometry_type") String str2, C17164e<? super x<List<CatalogItem>>> eVar);

    @C16704f("compositions/{compositionUuid}/?geometry_type=3d,2d_wall,wall_placeable")
    Object fetchLegacy2DComposition(@s("compositionUuid") UUID uuid, C17164e<? super x<Composition>> eVar);

    @C16704f("furniture/")
    Object fetchProductInformationDetails(@t("id__in") String str, @t("has_goes_well") boolean z10, @t("store") Integer num, @t("zip") Integer num2, @t("region") String str2, @t("geometry_type") String str3, C17164e<? super x<List<CatalogItem>>> eVar);

    @C16704f("furniture/")
    Object fetchProductInformationDetailsLocalItem(@t("local_item_number") String str, @t("has_goes_well") boolean z10, @t("store") Integer num, @t("zip") Integer num2, @t("region") String str2, @t("geometry_type") String str3, C17164e<? super x<List<CatalogItem>>> eVar);

    @C16704f("furniture/{itemId}/recommendations/")
    Object fetchProductRecommendations(@s("itemId") int i10, @t("has_goes_well") boolean z10, C17164e<? super x<List<CatalogItem>>> eVar);

    @C16704f("furniture/{id}/variants/")
    Object fetchProductVariants(@s("id") int i10, @t("has_goes_well") boolean z10, @t("geometry_type") String str, C17164e<? super x<CatalogItemVariants>> eVar);

    @C16704f("sdb_temp/{version}/")
    Object fetchSalesDressedBedData(@s("version") int i10, C17164e<? super x<SalesDressedBedDataResponse>> eVar);

    @C16704f("scenes/{uuid}/")
    Object fetchScene(@s("uuid") UUID uuid, @t("manifest_mode") String str, C17164e<? super x<SceneResponse>> eVar);

    @C16704f("showrooms/?is_mobile_compatible=true")
    Object fetchShowrooms(@t("tag") String str, C17164e<? super x<List<Showroom>>> eVar);

    @C16704f("compositions/{composition_id}/")
    Object getComposition(@s("composition_id") int i10, C17164e<? super x<Composition>> eVar);

    @C16704f("quickfilter/")
    Object getQuickFilters(@t("country") String str, @t("language") String str2, @t("room_type") RoomType roomType, C17164e<? super x<List<QuickFilter>>> eVar);

    @C16704f("scenes/{id}/")
    Object getScene(@s("id") String str, @t("manifest_mode") String str2, C17164e<? super x<SceneResponse>> eVar);

    @C16704f("status")
    Object getStatus(C17164e<? super x<StatusResponse>> eVar);

    @C16704f("uploads/{uuid}/")
    Object getUploadSetState(@s("uuid") UUID uuid, C17164e<? super x<UploadSetState>> eVar);

    @C16704f("users/")
    Object getUser(C17164e<? super x<UserResponse>> eVar);

    @o("auth/login/?mode=bearer")
    Object loginEmail(@C16699a LoginSignUpRequest loginSignUpRequest, C17164e<? super x<Authentication>> eVar);

    @o("auth/logout/")
    Object logout(C17164e<? super x<C15777E>> eVar);

    @C16710l
    @o("mobile/capture/")
    Object postCapture(@r Map<String, C15775C> map, @q List<C15806y.c> list, C17164e<? super x<SceneResponse>> eVar);

    @o("devices/")
    Object postDevice(@C16699a MobileDevice mobileDevice, C17164e<? super x<MobileDevice>> eVar);

    @p("compositions/{uuid}/")
    Object putComposition(@s("uuid") UUID uuid, @C16699a CompositionRequest compositionRequest, C17164e<? super x<Composition>> eVar);

    @o("scenes/{sceneUuid}/send_completion_email/")
    Object resendCompletionEmail(@s("sceneUuid") UUID uuid, C17164e<? super x<C15777E>> eVar);

    @o("auth/password_reset/")
    Object resetPassword(@C16699a ResetPasswordRequest resetPasswordRequest, C17164e<? super x<C15777E>> eVar);

    @o("auth/sign_up/?mode=bearer")
    Object signUpWithEmail(@C16699a LoginSignUpRequest loginSignUpRequest, C17164e<? super x<Authentication>> eVar);

    @o("uploads/{uuid}/uploadNotify/")
    Object uploadNotify(@s("uuid") UUID uuid, @C16699a UpdateUploadSetRequest updateUploadSetRequest, C17164e<? super x<UploadSetState>> eVar);
}
