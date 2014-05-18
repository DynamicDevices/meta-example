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

SRC_URI = "https://github.com/DynamicDevices/bbexample/releases/download/v1.0/bbexample-${PV}.tar.gz"

SRC_URI[md5sum] = "e15723f0d5ac710bbe788cd3a797bc44"
SRC_URI[sha256sum] = "0b34eb133596348bb6f1a3ef5e05e4d5bf0c88062256affe768d8337d7cc8f83"

# Make sure our source directory (for the build) matches the directory structure in the tarball
S = "${WORKDIR}/bbexample-${PV}"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

