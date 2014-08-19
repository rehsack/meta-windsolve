# Copyright (C) 2014 Shanghai Zhixing Information Technology Co.Ltd

SUMMARY = "Linux Kernel for Curie Board"
DESCRIPTION = "Linux Kernel for Curie Board"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "curie_3.10.17_1.0.0_ga"
SRCREV = "9962966e045f8f5728950562536531cc092d407b"
LOCALVERSION = "+curie"

SRC_URI = "git://50.116.15.14/mx6/linux-curie.git;protocol=ssh;user=git;branch=${SRCBRANCH} \
		   file://defconfig \
"

# patches for curie
COMPATIBLE_MACHINE = "(curie)"


