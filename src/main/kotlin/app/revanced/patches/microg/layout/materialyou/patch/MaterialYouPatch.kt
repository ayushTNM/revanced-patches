package app.revanced.patches.microg.layout.materialyou.patch

import app.revanced.extensions.doRecursively
import app.revanced.patcher.annotation.Description
import app.revanced.patcher.annotation.Name
import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotations.Patch
import app.revanced.patches.microg.utils.annotations.MicroGCompatibility
import app.revanced.util.resources.ResourceUtils.copyXmlNode
import org.w3c.dom.Element

@Patch(false)
@Name("MaterialYou")
@Description("Enables MaterialYou theme for Android 12+")
@MicroGCompatibility
class MaterialYouPatch : ResourcePatch {
    override fun execute(context: ResourceContext) {
        context.copyXmlNode("microg/materialyou/host", "values-v31/styles.xml", "resources")

        context.xmlEditor["res/values-v31/styles.xml"].use { editor ->
            val resourcesNode = editor.file.getElementsByTagName("resources").item(0) as Element

            for (i in 0 until resourcesNode.childNodes.length) {
                val node = resourcesNode.childNodes.item(i) as? Element ?: continue
                if (node.getAttribute("parent").endsWith("Light")) {
                    val lightStatusBarNode = editor.file.createElement("item")
                    lightStatusBarNode.setAttribute("name", "android:windowLightStatusBar")
                    lightStatusBarNode.textContent = "true"
                    node.appendChild(lightStatusBarNode)
                }
            }
        }
    }
}