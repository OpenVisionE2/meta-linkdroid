SUMMARY = "Enigma2 procfs drivers for ${MACHINE}"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"
require conf/license/license-close.inc

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "^(alien5)$"

DEPENDS = "virtual/${TARGET_PREFIX}gcc"

SRCDATE = "20181205"

PV = "${KV}+${SRCDATE}"

SRC_URI = "file://alien5-stb-${SRCDATE}.zip"

S = "${WORKDIR}"

do_compile() {
}

do_install() {
	install -d ${D}${nonarch_base_libdir}/modules/${KV}/kernel/drivers/a5
	install -m 0755 ${WORKDIR}/a5stb.ko ${D}${nonarch_base_libdir}/modules/${KV}/kernel/drivers/a5/
}

do_package_qa() {
}

FILES_${PN} += "${nonarch_base_libdir}/modules"
