#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI = "https://github.com/DynamicDevices/bbexample/archive/bbexample-v${PV}.tar.gz"

SRC_URI[md5sum] = "a040115592f4200188a805368d9456ff"
SRC_URI[sha256sum] = "589b22fc6c2c0b266223c5988f0e33f5c2f03a114da9145e722e3552a0edd308"

# Make sure our source directory (for the build) matches the directory structure in the tarball
# A tagged tarball from github contains a folder which includes the github tag, so deal with it here
S = "${WORKDIR}/bbexample-bbexample-v${PV}"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

