require conf/machine/include/imx-base.inc
require conf/machine/include/tune-cortexa9.inc

# Uncomment the following line to enable the hard floating point abi. Note that
# this breaks some binary libraries and 3D (neither of which ship with
# meta-yocto). For maximum compatibility, leave this disabled.
DEFAULTTUNE ?= "cortexa9hf-neon"

# generate tar only
IMAGE_FSTYPES = "tar"

# 2.6.37 and later kernels use OMAP_SERIAL, ttyO2
# earlier kernels use ttyS2
SERIAL_CONSOLE = "115200 ttymxc0"

PREFERRED_PROVIDER_u-boot = "u-boot-curie"
PREFERRED_PROVIDER_virtual/kernel = "linux-curie"

PREFERRED_VERSION_firmware-imx = "3.10.17-1.0.0"
PREFERRED_VERSION_imx-lib = "3.10.17-1.0.0"
PREFERRED_VERSION_imx-vpu = "3.10.17-1.0.0"
PREFERRED_VERSION_gpu-viv-bin-mx6q = "3.10.17-1.0.1-hfp"
PREFERRED_VERSION_gpu-viv-bin-mx6dl = "3.10.17-1.0.1-hfp"
PREFERRED_VERSION_rtl8189es = "4.3.0.4"

MACHINE_FEATURES += " wifi"

