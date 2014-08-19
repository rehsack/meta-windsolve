DESCRIPTION = "Driver for RTL8189ES Wi-Fi Module"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "git://50.116.15.14/mx6/rtl8189es.git;protocol=ssh;user=git \
          "

SRCREV="7bef41fca23b5bbeea81c3063ab3d7c8b97aa348"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

