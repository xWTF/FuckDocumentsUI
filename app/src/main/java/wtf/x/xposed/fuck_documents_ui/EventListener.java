package wtf.x.xposed.fuck_documents_ui;

import android.view.View;
import android.widget.Button;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class EventListener implements IXposedHookLoadPackage {
    @Override
    @SuppressWarnings("deprecation")
    public void handleLoadPackage(final LoadPackageParam aparam) throws Throwable {
        if (!"com.android.documentsui".equals(aparam.packageName)) {
            return;
        }
        XposedHelpers.findAndHookMethod("com.android.documentsui.picker.PickFragment", aparam.classLoader, "updateView", new XC_MethodHook() {
            @Override
            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                Button pick = (Button)XposedHelpers.getObjectField(param.thisObject, "mPick");
                pick.setEnabled(true);
            }
        });
    }
}
