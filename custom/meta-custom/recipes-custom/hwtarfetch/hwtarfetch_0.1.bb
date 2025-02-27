DESCRIPTION = "This is a simple Hello World recipe - downloads a tarball and then uses CMake to build it"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=45269dcabf49617cca580ad6878cbcd2"

SRC_URI = "git://github.com/sckulkarni246/yocto-test-apps.git;protocol=https;branch=master;tag=hwtarfetch_${PV}"
SRC_URI[sha256sum] = "4a6f509a2921d15f33d6117910b2edee86fd91bde9e1b56c74a6b718ef841c1b"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""

do_install() {
	install -d ${D}${bindir}
	install -m 0755 hello-world-git ${D}${bindir}
}

