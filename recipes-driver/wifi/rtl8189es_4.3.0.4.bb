DESCRIPTION = "Driver for RTL8189ES Wi-Fi Module"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "git://50.116.15.14/mx6/rtl8189es-4.3.0.4.git;protocol=ssh;user=git \
          "

SRCREV="97277467d5822ac74e94cc542ece8b9eb37eef8b"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

