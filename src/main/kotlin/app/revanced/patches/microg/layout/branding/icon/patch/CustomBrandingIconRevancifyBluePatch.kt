package app.revanced.patches.microg.layout.branding.icon.patch

import app.revanced.patcher.annotation.Description
import app.revanced.patcher.annotation.Name
import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotations.Patch
import app.revanced.patches.microg.utils.annotations.MicroGCompatibility
import app.revanced.util.resources.MicroGResourceUtils.copyFiles

@Patch(false)
@Name("Custom branding icon Revancify blue")
@Description("Changes the MicroG launcher icon to Revancify Blue.")
@MicroGCompatibility
class CustomBrandingIconRevancifyBluePatch : ResourcePatch {
    override fun execute(context: ResourceContext) {

        context.copyFiles("microg/branding/revancify-blue")

    }

}
