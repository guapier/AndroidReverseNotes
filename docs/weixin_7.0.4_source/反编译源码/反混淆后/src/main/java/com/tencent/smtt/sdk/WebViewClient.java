package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.ClientCertRequest;
import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceError;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;

public class WebViewClient {
    public static final int ERROR_AUTHENTICATION = -4;
    public static final int ERROR_BAD_URL = -12;
    public static final int ERROR_CONNECT = -6;
    public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
    public static final int ERROR_FILE = -13;
    public static final int ERROR_FILE_NOT_FOUND = -14;
    public static final int ERROR_HOST_LOOKUP = -2;
    public static final int ERROR_IO = -7;
    public static final int ERROR_PROXY_AUTHENTICATION = -5;
    public static final int ERROR_REDIRECT_LOOP = -9;
    public static final int ERROR_TIMEOUT = -8;
    public static final int ERROR_TOO_MANY_REQUESTS = -15;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
    public static final int ERROR_UNSUPPORTED_SCHEME = -10;
    public static final int INTERCEPT_BY_ISP = -16;
    /* renamed from: a */
    C5819v f15120a = this;

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
    }

    public void onDetectedBlankScreen(String str, int i) {
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        AppMethodBeat.m2504i(65029);
        message.sendToTarget();
        AppMethodBeat.m2505o(65029);
    }

    public void onLoadResource(WebView webView, String str) {
    }

    public void onPageFinished(WebView webView, String str) {
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        AppMethodBeat.m2504i(65025);
        if (this.f15120a != null) {
            this.f15120a.mo12205a(webView, str, bitmap);
        }
        AppMethodBeat.m2505o(65025);
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        AppMethodBeat.m2504i(65032);
        clientCertRequest.cancel();
        AppMethodBeat.m2505o(65032);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AppMethodBeat.m2504i(65026);
        if (this.f15120a != null) {
            if (webResourceRequest.isForMainFrame()) {
                this.f15120a.onReceivedError(webView.mo49876c(), webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
                AppMethodBeat.m2505o(65026);
                return;
            }
        } else if (webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
        AppMethodBeat.m2505o(65026);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        AppMethodBeat.m2504i(65030);
        httpAuthHandler.cancel();
        AppMethodBeat.m2505o(65030);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AppMethodBeat.m2504i(65031);
        sslErrorHandler.cancel();
        AppMethodBeat.m2505o(65031);
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
    }

    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        AppMethodBeat.m2504i(65027);
        WebResourceResponse shouldInterceptRequest;
        if (this.f15120a != null) {
            shouldInterceptRequest = this.f15120a.shouldInterceptRequest(webView.mo49876c(), webResourceRequest.getUrl().toString());
            AppMethodBeat.m2505o(65027);
            return shouldInterceptRequest;
        }
        shouldInterceptRequest = shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        AppMethodBeat.m2505o(65027);
        return shouldInterceptRequest;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
        AppMethodBeat.m2504i(65028);
        if (this.f15120a != null) {
            WebResourceResponse shouldInterceptRequest = this.f15120a.shouldInterceptRequest(webView.mo49876c(), webResourceRequest);
            AppMethodBeat.m2505o(65028);
            return shouldInterceptRequest;
        }
        AppMethodBeat.m2505o(65028);
        return null;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return null;
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return false;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        AppMethodBeat.m2504i(65024);
        boolean shouldOverrideUrlLoading;
        if (this.f15120a != null) {
            shouldOverrideUrlLoading = this.f15120a.shouldOverrideUrlLoading(webView.mo49876c(), webResourceRequest.getUrl().toString());
            AppMethodBeat.m2505o(65024);
            return shouldOverrideUrlLoading;
        }
        shouldOverrideUrlLoading = shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        AppMethodBeat.m2505o(65024);
        return shouldOverrideUrlLoading;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}
