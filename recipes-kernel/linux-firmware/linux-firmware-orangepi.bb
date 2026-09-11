inherit allarch

SRC_URI += "file://firmware"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/
    cp -R --no-dereference --preserve=links -v firmware/* ${D}${nonarch_base_libdir}/firmware/
}
