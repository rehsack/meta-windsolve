DESCRIPTION = "Driver for RTL8189ES Wi-Fi Module"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

PR = "r0"
PV = "0.1"

SRC_URI = "http://www.windsolve.com/curie/rtl8189es.tar.gz \
          "
SRC_URI[md5sum] = "f16c10fb39e2d8b14bdf0159e3cf0a16"
SRC_URI[sha256sum] = "3ac91457931b63a5a46fbc98593105aa549f1ccaa7a8e36006c05fa3c6f0b8b9"

S = "${WORKDIR}/rtl8189es"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

