## 🧩 ReVanced Patches

ReVanced Extended Patches.

## 📋 List of patches in this repository

### [📦 `com.mgoogle.android.gms`](https://play.google.com/store/apps/details?id=com.mgoogle.android.gms)
<details>

| 💊 Patch | 📜 Description | 🏹 Target Version |
|:--------:|:--------------:|:-----------------:|
| `custom-branding-microg-name` | Rename the MicroG app to the name specified in options.json. | all |
| `custom-branding-icon-revancify-blue` | Changes the MicroG launcher icon to Revancify Blue. | all |
| `custom-branding-icon-revancify-red` | Changes the MicroG launcher icon to Revancify Red. | all |
| `hide-icon-from-launcher` | Hide MicroG icon from launcher. | all |
| `materialyou` | Enables MaterialYou theme for Android 12+ | all |
| `custom-branding-microg-mmt` | Changes the MicroG launcher icon to MMT. | all |
</details>

### [📦 `com.google.android.gms`](https://play.google.com/store/apps/details?id=com.google.android.gms)
<details>

| 💊 Patch | 📜 Description | 🏹 Target Version |
|:--------:|:--------------:|:-----------------:|
| `custom-branding-microg-name` | Rename the MicroG app to the name specified in options.json. | all |
| `custom-branding-icon-revancify-blue` | Changes the MicroG launcher icon to Revancify Blue. | all |
| `custom-branding-icon-revancify-red` | Changes the MicroG launcher icon to Revancify Red. | all |
| `hide-icon-from-launcher` | Hide MicroG icon from launcher. | all |
| `materialyou` | Enables MaterialYou theme for Android 12+ | all |
| `custom-branding-microg-mmt` | Changes the MicroG launcher icon to MMT. | all |
</details>

### [📦 `com.google.android.youtube`](https://play.google.com/store/apps/details?id=com.google.android.youtube)
<details>

| 💊 Patch | 📜 Description | 🏹 Target Version |
|:--------:|:--------------:|:-----------------:|
| `custom-package-name` | Specifies the package name for YouTube and YT Music in the MicroG build. | all |
</details>

### [📦 `com.google.android.apps.youtube.music`](https://play.google.com/store/apps/details?id=com.google.android.apps.youtube.music)
<details>

| 💊 Patch | 📜 Description | 🏹 Target Version |
|:--------:|:--------------:|:-----------------:|
| `custom-package-name` | Specifies the package name for YouTube and YT Music in the MicroG build. | all |
</details>



## 📝 JSON Format

This section explains the JSON format for the [patches.json](patches.json) file.

Example:

```json
[
  {
    "name": "default-video-quality",
    "description": "Adds ability to set default video quality settings.",
    "excluded": false,
    "options": [],
    "dependencies": [],
    "compatiblePackages": [
      {
        "name": "com.google.android.youtube",
        "versions": [
          "18.19.36",
          "18.20.39",
          "18.21.35",
          "18.22.37",
          "18.23.36",
          "18.24.37",
          "18.25.40",
          "18.27.36",
          "18.29.38",
          "18.30.37",
          "18.31.40"
        ]
      }
    ]
  },
  {
    "name": "remember-video-quality",
    "description": "Save the video quality value whenever you change the video quality.",
    "excluded": false,
    "options": [],
    "dependencies": [],
    "compatiblePackages": [
      {
        "name": "com.google.android.apps.youtube.music",
        "versions": [
          "6.15.52",
          "6.17.52"
        ]
      }
    ]
  }
]
```