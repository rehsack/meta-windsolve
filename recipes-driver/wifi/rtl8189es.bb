DESCRIPTION = "Driver for RTL8189ES Wi-Fi Module"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

PR = "r0"
PV = "0.1"

SRC_URI = "git://50.116.15.14/mx6/rtl8189es.git;protocol=ssh;user=git \
          "

SRCREV="39c21d9ebbf858ebaa12f47f06aa4ec642fda57d"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

