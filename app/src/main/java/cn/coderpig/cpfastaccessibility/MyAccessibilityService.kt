package cn.coderpig.cpfastaccessibility

import android.accessibilityservice.AccessibilityService
import android.graphics.PixelFormat
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.WindowManager
import android.view.WindowManager.LayoutParams.*
import android.view.accessibility.AccessibilityNodeInfo
import cn.coderpig.cp_fast_accessibility.*
import kotlin.math.log

/**
 * Author: CoderPig
 * Date: 2023-03-24
 * Desc:
 */
class MyAccessibilityService : FastAccessibilityService() {
    override fun analyzeCallBack(wrapper: EventWrapper?, result: AnalyzeSourceResult) {

    }

    override fun noAnalyzeCallBack(wrapper: EventWrapper?, node: AccessibilityNodeInfo?) {
        wrapper?.let { logD(it.toString()) }
        if (node?.packageName == "com.jingdong.app.mall") { node.printAllNode() }
    }
}